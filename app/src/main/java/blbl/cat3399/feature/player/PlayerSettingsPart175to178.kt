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

// v1941: disagreed mode
internal fun PlayerActivity.showV1941DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disagreed
    FeaturePrefsStore.batch1941.v1941disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1941: disappeared mode
internal fun PlayerActivity.showV1941DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disappeared
    FeaturePrefsStore.batch1941.v1941disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1941: discharged mode
internal fun PlayerActivity.showV1941DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discharged
    FeaturePrefsStore.batch1941.v1941discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1941: discovered mode
internal fun PlayerActivity.showV1941DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discovered
    FeaturePrefsStore.batch1941.v1941discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1941: discussed mode
internal fun PlayerActivity.showV1941DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discussed
    FeaturePrefsStore.batch1941.v1941discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1941: dismissed level
internal fun PlayerActivity.showV1941DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1941: dispatched level
internal fun PlayerActivity.showV1941DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1941: displayed level
internal fun PlayerActivity.showV1941DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1941: disposed level
internal fun PlayerActivity.showV1941DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1941: disrupted level
internal fun PlayerActivity.showV1941DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1941: dissolved mode
internal fun PlayerActivity.showV1941DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941dissolved
    FeaturePrefsStore.batch1941.v1941dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1941: distinguished mode
internal fun PlayerActivity.showV1941DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941distinguished
    FeaturePrefsStore.batch1941.v1941distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1941: distributed mode
internal fun PlayerActivity.showV1941DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941distributed
    FeaturePrefsStore.batch1941.v1941distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1941: disturbed mode
internal fun PlayerActivity.showV1941DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disturbed
    FeaturePrefsStore.batch1941.v1941disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1941: diversified mode
internal fun PlayerActivity.showV1941DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941diversified
    FeaturePrefsStore.batch1941.v1941diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1942: disagreed mode
internal fun PlayerActivity.showV1942DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disagreed
    FeaturePrefsStore.batch1941.v1942disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1942: disappeared mode
internal fun PlayerActivity.showV1942DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disappeared
    FeaturePrefsStore.batch1941.v1942disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1942: discharged mode
internal fun PlayerActivity.showV1942DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discharged
    FeaturePrefsStore.batch1941.v1942discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1942: discovered mode
internal fun PlayerActivity.showV1942DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discovered
    FeaturePrefsStore.batch1941.v1942discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1942: discussed mode
internal fun PlayerActivity.showV1942DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discussed
    FeaturePrefsStore.batch1941.v1942discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1942: dismissed level
internal fun PlayerActivity.showV1942DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1942: dispatched level
internal fun PlayerActivity.showV1942DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1942: displayed level
internal fun PlayerActivity.showV1942DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1942: disposed level
internal fun PlayerActivity.showV1942DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1942: disrupted level
internal fun PlayerActivity.showV1942DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1942: dissolved mode
internal fun PlayerActivity.showV1942DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942dissolved
    FeaturePrefsStore.batch1941.v1942dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1942: distinguished mode
internal fun PlayerActivity.showV1942DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942distinguished
    FeaturePrefsStore.batch1941.v1942distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1942: distributed mode
internal fun PlayerActivity.showV1942DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942distributed
    FeaturePrefsStore.batch1941.v1942distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1942: disturbed mode
internal fun PlayerActivity.showV1942DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disturbed
    FeaturePrefsStore.batch1941.v1942disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1942: diversified mode
internal fun PlayerActivity.showV1942DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942diversified
    FeaturePrefsStore.batch1941.v1942diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1943: disagreed mode
internal fun PlayerActivity.showV1943DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disagreed
    FeaturePrefsStore.batch1941.v1943disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1943: disappeared mode
internal fun PlayerActivity.showV1943DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disappeared
    FeaturePrefsStore.batch1941.v1943disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1943: discharged mode
internal fun PlayerActivity.showV1943DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discharged
    FeaturePrefsStore.batch1941.v1943discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1943: discovered mode
internal fun PlayerActivity.showV1943DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discovered
    FeaturePrefsStore.batch1941.v1943discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1943: discussed mode
internal fun PlayerActivity.showV1943DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discussed
    FeaturePrefsStore.batch1941.v1943discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1943: dismissed level
internal fun PlayerActivity.showV1943DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1943: dispatched level
internal fun PlayerActivity.showV1943DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1943: displayed level
internal fun PlayerActivity.showV1943DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1943: disposed level
internal fun PlayerActivity.showV1943DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1943: disrupted level
internal fun PlayerActivity.showV1943DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1943: dissolved mode
internal fun PlayerActivity.showV1943DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943dissolved
    FeaturePrefsStore.batch1941.v1943dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1943: distinguished mode
internal fun PlayerActivity.showV1943DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943distinguished
    FeaturePrefsStore.batch1941.v1943distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1943: distributed mode
internal fun PlayerActivity.showV1943DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943distributed
    FeaturePrefsStore.batch1941.v1943distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1943: disturbed mode
internal fun PlayerActivity.showV1943DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disturbed
    FeaturePrefsStore.batch1941.v1943disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1943: diversified mode
internal fun PlayerActivity.showV1943DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943diversified
    FeaturePrefsStore.batch1941.v1943diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1944: disagreed mode
internal fun PlayerActivity.showV1944DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disagreed
    FeaturePrefsStore.batch1941.v1944disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1944: disappeared mode
internal fun PlayerActivity.showV1944DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disappeared
    FeaturePrefsStore.batch1941.v1944disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1944: discharged mode
internal fun PlayerActivity.showV1944DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discharged
    FeaturePrefsStore.batch1941.v1944discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1944: discovered mode
internal fun PlayerActivity.showV1944DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discovered
    FeaturePrefsStore.batch1941.v1944discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1944: discussed mode
internal fun PlayerActivity.showV1944DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discussed
    FeaturePrefsStore.batch1941.v1944discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1944: dismissed level
internal fun PlayerActivity.showV1944DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1944: dispatched level
internal fun PlayerActivity.showV1944DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1944: displayed level
internal fun PlayerActivity.showV1944DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1944: disposed level
internal fun PlayerActivity.showV1944DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1944: disrupted level
internal fun PlayerActivity.showV1944DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1944: dissolved mode
internal fun PlayerActivity.showV1944DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944dissolved
    FeaturePrefsStore.batch1941.v1944dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1944: distinguished mode
internal fun PlayerActivity.showV1944DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944distinguished
    FeaturePrefsStore.batch1941.v1944distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1944: distributed mode
internal fun PlayerActivity.showV1944DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944distributed
    FeaturePrefsStore.batch1941.v1944distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1944: disturbed mode
internal fun PlayerActivity.showV1944DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disturbed
    FeaturePrefsStore.batch1941.v1944disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1944: diversified mode
internal fun PlayerActivity.showV1944DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944diversified
    FeaturePrefsStore.batch1941.v1944diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1945: disagreed mode
internal fun PlayerActivity.showV1945DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disagreed
    FeaturePrefsStore.batch1941.v1945disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1945: disappeared mode
internal fun PlayerActivity.showV1945DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disappeared
    FeaturePrefsStore.batch1941.v1945disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1945: discharged mode
internal fun PlayerActivity.showV1945DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discharged
    FeaturePrefsStore.batch1941.v1945discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1945: discovered mode
internal fun PlayerActivity.showV1945DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discovered
    FeaturePrefsStore.batch1941.v1945discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1945: discussed mode
internal fun PlayerActivity.showV1945DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discussed
    FeaturePrefsStore.batch1941.v1945discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1945: dismissed level
internal fun PlayerActivity.showV1945DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1945: dispatched level
internal fun PlayerActivity.showV1945DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1945: displayed level
internal fun PlayerActivity.showV1945DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1945: disposed level
internal fun PlayerActivity.showV1945DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1945: disrupted level
internal fun PlayerActivity.showV1945DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1945: dissolved mode
internal fun PlayerActivity.showV1945DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945dissolved
    FeaturePrefsStore.batch1941.v1945dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1945: distinguished mode
internal fun PlayerActivity.showV1945DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945distinguished
    FeaturePrefsStore.batch1941.v1945distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1945: distributed mode
internal fun PlayerActivity.showV1945DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945distributed
    FeaturePrefsStore.batch1941.v1945distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1945: disturbed mode
internal fun PlayerActivity.showV1945DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disturbed
    FeaturePrefsStore.batch1941.v1945disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1945: diversified mode
internal fun PlayerActivity.showV1945DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945diversified
    FeaturePrefsStore.batch1941.v1945diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1946: disagreed mode
internal fun PlayerActivity.showV1946DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disagreed
    FeaturePrefsStore.batch1941.v1946disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1946: disappeared mode
internal fun PlayerActivity.showV1946DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disappeared
    FeaturePrefsStore.batch1941.v1946disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1946: discharged mode
internal fun PlayerActivity.showV1946DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discharged
    FeaturePrefsStore.batch1941.v1946discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1946: discovered mode
internal fun PlayerActivity.showV1946DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discovered
    FeaturePrefsStore.batch1941.v1946discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1946: discussed mode
internal fun PlayerActivity.showV1946DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discussed
    FeaturePrefsStore.batch1941.v1946discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1946: dismissed level
internal fun PlayerActivity.showV1946DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1946: dispatched level
internal fun PlayerActivity.showV1946DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1946: displayed level
internal fun PlayerActivity.showV1946DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1946: disposed level
internal fun PlayerActivity.showV1946DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1946: disrupted level
internal fun PlayerActivity.showV1946DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1946: dissolved mode
internal fun PlayerActivity.showV1946DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946dissolved
    FeaturePrefsStore.batch1941.v1946dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1946: distinguished mode
internal fun PlayerActivity.showV1946DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946distinguished
    FeaturePrefsStore.batch1941.v1946distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1946: distributed mode
internal fun PlayerActivity.showV1946DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946distributed
    FeaturePrefsStore.batch1941.v1946distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1946: disturbed mode
internal fun PlayerActivity.showV1946DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disturbed
    FeaturePrefsStore.batch1941.v1946disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1946: diversified mode
internal fun PlayerActivity.showV1946DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946diversified
    FeaturePrefsStore.batch1941.v1946diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1947: disagreed mode
internal fun PlayerActivity.showV1947DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disagreed
    FeaturePrefsStore.batch1941.v1947disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1947: disappeared mode
internal fun PlayerActivity.showV1947DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disappeared
    FeaturePrefsStore.batch1941.v1947disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1947: discharged mode
internal fun PlayerActivity.showV1947DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discharged
    FeaturePrefsStore.batch1941.v1947discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1947: discovered mode
internal fun PlayerActivity.showV1947DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discovered
    FeaturePrefsStore.batch1941.v1947discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1947: discussed mode
internal fun PlayerActivity.showV1947DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discussed
    FeaturePrefsStore.batch1941.v1947discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1947: dismissed level
internal fun PlayerActivity.showV1947DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1947: dispatched level
internal fun PlayerActivity.showV1947DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1947: displayed level
internal fun PlayerActivity.showV1947DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1947: disposed level
internal fun PlayerActivity.showV1947DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1947: disrupted level
internal fun PlayerActivity.showV1947DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1947: dissolved mode
internal fun PlayerActivity.showV1947DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947dissolved
    FeaturePrefsStore.batch1941.v1947dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1947: distinguished mode
internal fun PlayerActivity.showV1947DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947distinguished
    FeaturePrefsStore.batch1941.v1947distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1947: distributed mode
internal fun PlayerActivity.showV1947DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947distributed
    FeaturePrefsStore.batch1941.v1947distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1947: disturbed mode
internal fun PlayerActivity.showV1947DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disturbed
    FeaturePrefsStore.batch1941.v1947disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1947: diversified mode
internal fun PlayerActivity.showV1947DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947diversified
    FeaturePrefsStore.batch1941.v1947diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1948: disagreed mode
internal fun PlayerActivity.showV1948DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disagreed
    FeaturePrefsStore.batch1941.v1948disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1948: disappeared mode
internal fun PlayerActivity.showV1948DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disappeared
    FeaturePrefsStore.batch1941.v1948disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1948: discharged mode
internal fun PlayerActivity.showV1948DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discharged
    FeaturePrefsStore.batch1941.v1948discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1948: discovered mode
internal fun PlayerActivity.showV1948DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discovered
    FeaturePrefsStore.batch1941.v1948discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1948: discussed mode
internal fun PlayerActivity.showV1948DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discussed
    FeaturePrefsStore.batch1941.v1948discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1948: dismissed level
internal fun PlayerActivity.showV1948DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1948: dispatched level
internal fun PlayerActivity.showV1948DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1948: displayed level
internal fun PlayerActivity.showV1948DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1948: disposed level
internal fun PlayerActivity.showV1948DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1948: disrupted level
internal fun PlayerActivity.showV1948DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1948: dissolved mode
internal fun PlayerActivity.showV1948DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948dissolved
    FeaturePrefsStore.batch1941.v1948dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1948: distinguished mode
internal fun PlayerActivity.showV1948DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948distinguished
    FeaturePrefsStore.batch1941.v1948distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1948: distributed mode
internal fun PlayerActivity.showV1948DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948distributed
    FeaturePrefsStore.batch1941.v1948distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1948: disturbed mode
internal fun PlayerActivity.showV1948DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disturbed
    FeaturePrefsStore.batch1941.v1948disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1948: diversified mode
internal fun PlayerActivity.showV1948DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948diversified
    FeaturePrefsStore.batch1941.v1948diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1949: disagreed mode
internal fun PlayerActivity.showV1949DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disagreed
    FeaturePrefsStore.batch1941.v1949disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1949: disappeared mode
internal fun PlayerActivity.showV1949DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disappeared
    FeaturePrefsStore.batch1941.v1949disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1949: discharged mode
internal fun PlayerActivity.showV1949DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discharged
    FeaturePrefsStore.batch1941.v1949discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1949: discovered mode
internal fun PlayerActivity.showV1949DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discovered
    FeaturePrefsStore.batch1941.v1949discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1949: discussed mode
internal fun PlayerActivity.showV1949DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discussed
    FeaturePrefsStore.batch1941.v1949discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1949: dismissed level
internal fun PlayerActivity.showV1949DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1949: dispatched level
internal fun PlayerActivity.showV1949DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1949: displayed level
internal fun PlayerActivity.showV1949DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1949: disposed level
internal fun PlayerActivity.showV1949DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1949: disrupted level
internal fun PlayerActivity.showV1949DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1949: dissolved mode
internal fun PlayerActivity.showV1949DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949dissolved
    FeaturePrefsStore.batch1941.v1949dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1949: distinguished mode
internal fun PlayerActivity.showV1949DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949distinguished
    FeaturePrefsStore.batch1941.v1949distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1949: distributed mode
internal fun PlayerActivity.showV1949DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949distributed
    FeaturePrefsStore.batch1941.v1949distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1949: disturbed mode
internal fun PlayerActivity.showV1949DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disturbed
    FeaturePrefsStore.batch1941.v1949disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1949: diversified mode
internal fun PlayerActivity.showV1949DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949diversified
    FeaturePrefsStore.batch1941.v1949diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1950: disagreed mode
internal fun PlayerActivity.showV1950DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disagreed
    FeaturePrefsStore.batch1941.v1950disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1950: disappeared mode
internal fun PlayerActivity.showV1950DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disappeared
    FeaturePrefsStore.batch1941.v1950disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1950: discharged mode
internal fun PlayerActivity.showV1950DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discharged
    FeaturePrefsStore.batch1941.v1950discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1950: discovered mode
internal fun PlayerActivity.showV1950DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discovered
    FeaturePrefsStore.batch1941.v1950discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1950: discussed mode
internal fun PlayerActivity.showV1950DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discussed
    FeaturePrefsStore.batch1941.v1950discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1950: dismissed level
internal fun PlayerActivity.showV1950DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1950: dispatched level
internal fun PlayerActivity.showV1950DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1950: displayed level
internal fun PlayerActivity.showV1950DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1950: disposed level
internal fun PlayerActivity.showV1950DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1950: disrupted level
internal fun PlayerActivity.showV1950DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1950: dissolved mode
internal fun PlayerActivity.showV1950DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950dissolved
    FeaturePrefsStore.batch1941.v1950dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1950: distinguished mode
internal fun PlayerActivity.showV1950DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950distinguished
    FeaturePrefsStore.batch1941.v1950distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1950: distributed mode
internal fun PlayerActivity.showV1950DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950distributed
    FeaturePrefsStore.batch1941.v1950distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1950: disturbed mode
internal fun PlayerActivity.showV1950DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disturbed
    FeaturePrefsStore.batch1941.v1950disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1950: diversified mode
internal fun PlayerActivity.showV1950DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950diversified
    FeaturePrefsStore.batch1941.v1950diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1951: divided mode
internal fun PlayerActivity.showV1951DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951divided
    FeaturePrefsStore.batch1951.v1951divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1951: documented mode
internal fun PlayerActivity.showV1951DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951documented
    FeaturePrefsStore.batch1951.v1951documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1951: doubled mode
internal fun PlayerActivity.showV1951DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1951doubled
    FeaturePrefsStore.batch1951.v1951doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1951: downloaded mode
internal fun PlayerActivity.showV1951DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951downloaded
    FeaturePrefsStore.batch1951.v1951downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1951: drafted mode
internal fun PlayerActivity.showV1951DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drafted
    FeaturePrefsStore.batch1951.v1951drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1951: drained level
internal fun PlayerActivity.showV1951DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1951: dramatized level
internal fun PlayerActivity.showV1951DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1951: drawn level
internal fun PlayerActivity.showV1951DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1951: dreamed level
internal fun PlayerActivity.showV1951DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1951: drifted level
internal fun PlayerActivity.showV1951DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1951: drilled mode
internal fun PlayerActivity.showV1951DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drilled
    FeaturePrefsStore.batch1951.v1951drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1951: driven mode
internal fun PlayerActivity.showV1951DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1951driven
    FeaturePrefsStore.batch1951.v1951driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1951: dropped mode
internal fun PlayerActivity.showV1951DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951dropped
    FeaturePrefsStore.batch1951.v1951dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1951: drowned mode
internal fun PlayerActivity.showV1951DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drowned
    FeaturePrefsStore.batch1951.v1951drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1951: duplicated mode
internal fun PlayerActivity.showV1951DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951duplicated
    FeaturePrefsStore.batch1951.v1951duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1952: divided mode
internal fun PlayerActivity.showV1952DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952divided
    FeaturePrefsStore.batch1951.v1952divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1952: documented mode
internal fun PlayerActivity.showV1952DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952documented
    FeaturePrefsStore.batch1951.v1952documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1952: doubled mode
internal fun PlayerActivity.showV1952DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1952doubled
    FeaturePrefsStore.batch1951.v1952doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1952: downloaded mode
internal fun PlayerActivity.showV1952DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952downloaded
    FeaturePrefsStore.batch1951.v1952downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1952: drafted mode
internal fun PlayerActivity.showV1952DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drafted
    FeaturePrefsStore.batch1951.v1952drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1952: drained level
internal fun PlayerActivity.showV1952DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1952: dramatized level
internal fun PlayerActivity.showV1952DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1952: drawn level
internal fun PlayerActivity.showV1952DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1952: dreamed level
internal fun PlayerActivity.showV1952DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1952: drifted level
internal fun PlayerActivity.showV1952DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1952: drilled mode
internal fun PlayerActivity.showV1952DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drilled
    FeaturePrefsStore.batch1951.v1952drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1952: driven mode
internal fun PlayerActivity.showV1952DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1952driven
    FeaturePrefsStore.batch1951.v1952driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1952: dropped mode
internal fun PlayerActivity.showV1952DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952dropped
    FeaturePrefsStore.batch1951.v1952dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1952: drowned mode
internal fun PlayerActivity.showV1952DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drowned
    FeaturePrefsStore.batch1951.v1952drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1952: duplicated mode
internal fun PlayerActivity.showV1952DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952duplicated
    FeaturePrefsStore.batch1951.v1952duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1953: divided mode
internal fun PlayerActivity.showV1953DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953divided
    FeaturePrefsStore.batch1951.v1953divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1953: documented mode
internal fun PlayerActivity.showV1953DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953documented
    FeaturePrefsStore.batch1951.v1953documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1953: doubled mode
internal fun PlayerActivity.showV1953DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1953doubled
    FeaturePrefsStore.batch1951.v1953doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1953: downloaded mode
internal fun PlayerActivity.showV1953DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953downloaded
    FeaturePrefsStore.batch1951.v1953downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1953: drafted mode
internal fun PlayerActivity.showV1953DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drafted
    FeaturePrefsStore.batch1951.v1953drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1953: drained level
internal fun PlayerActivity.showV1953DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1953: dramatized level
internal fun PlayerActivity.showV1953DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1953: drawn level
internal fun PlayerActivity.showV1953DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1953: dreamed level
internal fun PlayerActivity.showV1953DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1953: drifted level
internal fun PlayerActivity.showV1953DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1953: drilled mode
internal fun PlayerActivity.showV1953DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drilled
    FeaturePrefsStore.batch1951.v1953drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1953: driven mode
internal fun PlayerActivity.showV1953DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1953driven
    FeaturePrefsStore.batch1951.v1953driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1953: dropped mode
internal fun PlayerActivity.showV1953DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953dropped
    FeaturePrefsStore.batch1951.v1953dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1953: drowned mode
internal fun PlayerActivity.showV1953DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drowned
    FeaturePrefsStore.batch1951.v1953drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1953: duplicated mode
internal fun PlayerActivity.showV1953DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953duplicated
    FeaturePrefsStore.batch1951.v1953duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1954: divided mode
internal fun PlayerActivity.showV1954DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954divided
    FeaturePrefsStore.batch1951.v1954divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1954: documented mode
internal fun PlayerActivity.showV1954DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954documented
    FeaturePrefsStore.batch1951.v1954documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1954: doubled mode
internal fun PlayerActivity.showV1954DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1954doubled
    FeaturePrefsStore.batch1951.v1954doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1954: downloaded mode
internal fun PlayerActivity.showV1954DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954downloaded
    FeaturePrefsStore.batch1951.v1954downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1954: drafted mode
internal fun PlayerActivity.showV1954DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drafted
    FeaturePrefsStore.batch1951.v1954drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1954: drained level
internal fun PlayerActivity.showV1954DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1954: dramatized level
internal fun PlayerActivity.showV1954DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1954: drawn level
internal fun PlayerActivity.showV1954DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1954: dreamed level
internal fun PlayerActivity.showV1954DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1954: drifted level
internal fun PlayerActivity.showV1954DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1954: drilled mode
internal fun PlayerActivity.showV1954DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drilled
    FeaturePrefsStore.batch1951.v1954drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1954: driven mode
internal fun PlayerActivity.showV1954DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1954driven
    FeaturePrefsStore.batch1951.v1954driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1954: dropped mode
internal fun PlayerActivity.showV1954DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954dropped
    FeaturePrefsStore.batch1951.v1954dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1954: drowned mode
internal fun PlayerActivity.showV1954DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drowned
    FeaturePrefsStore.batch1951.v1954drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1954: duplicated mode
internal fun PlayerActivity.showV1954DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954duplicated
    FeaturePrefsStore.batch1951.v1954duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1955: divided mode
internal fun PlayerActivity.showV1955DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955divided
    FeaturePrefsStore.batch1951.v1955divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1955: documented mode
internal fun PlayerActivity.showV1955DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955documented
    FeaturePrefsStore.batch1951.v1955documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1955: doubled mode
internal fun PlayerActivity.showV1955DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1955doubled
    FeaturePrefsStore.batch1951.v1955doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1955: downloaded mode
internal fun PlayerActivity.showV1955DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955downloaded
    FeaturePrefsStore.batch1951.v1955downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1955: drafted mode
internal fun PlayerActivity.showV1955DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drafted
    FeaturePrefsStore.batch1951.v1955drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1955: drained level
internal fun PlayerActivity.showV1955DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1955: dramatized level
internal fun PlayerActivity.showV1955DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1955: drawn level
internal fun PlayerActivity.showV1955DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1955: dreamed level
internal fun PlayerActivity.showV1955DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1955: drifted level
internal fun PlayerActivity.showV1955DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1955: drilled mode
internal fun PlayerActivity.showV1955DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drilled
    FeaturePrefsStore.batch1951.v1955drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1955: driven mode
internal fun PlayerActivity.showV1955DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1955driven
    FeaturePrefsStore.batch1951.v1955driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1955: dropped mode
internal fun PlayerActivity.showV1955DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955dropped
    FeaturePrefsStore.batch1951.v1955dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1955: drowned mode
internal fun PlayerActivity.showV1955DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drowned
    FeaturePrefsStore.batch1951.v1955drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1955: duplicated mode
internal fun PlayerActivity.showV1955DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955duplicated
    FeaturePrefsStore.batch1951.v1955duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1956: divided mode
internal fun PlayerActivity.showV1956DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956divided
    FeaturePrefsStore.batch1951.v1956divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1956: documented mode
internal fun PlayerActivity.showV1956DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956documented
    FeaturePrefsStore.batch1951.v1956documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1956: doubled mode
internal fun PlayerActivity.showV1956DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1956doubled
    FeaturePrefsStore.batch1951.v1956doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1956: downloaded mode
internal fun PlayerActivity.showV1956DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956downloaded
    FeaturePrefsStore.batch1951.v1956downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1956: drafted mode
internal fun PlayerActivity.showV1956DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drafted
    FeaturePrefsStore.batch1951.v1956drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1956: drained level
internal fun PlayerActivity.showV1956DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1956: dramatized level
internal fun PlayerActivity.showV1956DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1956: drawn level
internal fun PlayerActivity.showV1956DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1956: dreamed level
internal fun PlayerActivity.showV1956DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1956: drifted level
internal fun PlayerActivity.showV1956DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1956: drilled mode
internal fun PlayerActivity.showV1956DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drilled
    FeaturePrefsStore.batch1951.v1956drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1956: driven mode
internal fun PlayerActivity.showV1956DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1956driven
    FeaturePrefsStore.batch1951.v1956driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1956: dropped mode
internal fun PlayerActivity.showV1956DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956dropped
    FeaturePrefsStore.batch1951.v1956dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1956: drowned mode
internal fun PlayerActivity.showV1956DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drowned
    FeaturePrefsStore.batch1951.v1956drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1956: duplicated mode
internal fun PlayerActivity.showV1956DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956duplicated
    FeaturePrefsStore.batch1951.v1956duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1957: divided mode
internal fun PlayerActivity.showV1957DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957divided
    FeaturePrefsStore.batch1951.v1957divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1957: documented mode
internal fun PlayerActivity.showV1957DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957documented
    FeaturePrefsStore.batch1951.v1957documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1957: doubled mode
internal fun PlayerActivity.showV1957DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1957doubled
    FeaturePrefsStore.batch1951.v1957doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1957: downloaded mode
internal fun PlayerActivity.showV1957DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957downloaded
    FeaturePrefsStore.batch1951.v1957downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1957: drafted mode
internal fun PlayerActivity.showV1957DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drafted
    FeaturePrefsStore.batch1951.v1957drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1957: drained level
internal fun PlayerActivity.showV1957DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1957: dramatized level
internal fun PlayerActivity.showV1957DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1957: drawn level
internal fun PlayerActivity.showV1957DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1957: dreamed level
internal fun PlayerActivity.showV1957DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1957: drifted level
internal fun PlayerActivity.showV1957DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1957: drilled mode
internal fun PlayerActivity.showV1957DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drilled
    FeaturePrefsStore.batch1951.v1957drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1957: driven mode
internal fun PlayerActivity.showV1957DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1957driven
    FeaturePrefsStore.batch1951.v1957driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1957: dropped mode
internal fun PlayerActivity.showV1957DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957dropped
    FeaturePrefsStore.batch1951.v1957dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1957: drowned mode
internal fun PlayerActivity.showV1957DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drowned
    FeaturePrefsStore.batch1951.v1957drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1957: duplicated mode
internal fun PlayerActivity.showV1957DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957duplicated
    FeaturePrefsStore.batch1951.v1957duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1958: divided mode
internal fun PlayerActivity.showV1958DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958divided
    FeaturePrefsStore.batch1951.v1958divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1958: documented mode
internal fun PlayerActivity.showV1958DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958documented
    FeaturePrefsStore.batch1951.v1958documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1958: doubled mode
internal fun PlayerActivity.showV1958DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1958doubled
    FeaturePrefsStore.batch1951.v1958doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1958: downloaded mode
internal fun PlayerActivity.showV1958DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958downloaded
    FeaturePrefsStore.batch1951.v1958downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1958: drafted mode
internal fun PlayerActivity.showV1958DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drafted
    FeaturePrefsStore.batch1951.v1958drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1958: drained level
internal fun PlayerActivity.showV1958DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1958: dramatized level
internal fun PlayerActivity.showV1958DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1958: drawn level
internal fun PlayerActivity.showV1958DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1958: dreamed level
internal fun PlayerActivity.showV1958DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1958: drifted level
internal fun PlayerActivity.showV1958DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1958: drilled mode
internal fun PlayerActivity.showV1958DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drilled
    FeaturePrefsStore.batch1951.v1958drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1958: driven mode
internal fun PlayerActivity.showV1958DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1958driven
    FeaturePrefsStore.batch1951.v1958driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1958: dropped mode
internal fun PlayerActivity.showV1958DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958dropped
    FeaturePrefsStore.batch1951.v1958dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1958: drowned mode
internal fun PlayerActivity.showV1958DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drowned
    FeaturePrefsStore.batch1951.v1958drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1958: duplicated mode
internal fun PlayerActivity.showV1958DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958duplicated
    FeaturePrefsStore.batch1951.v1958duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1959: divided mode
internal fun PlayerActivity.showV1959DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959divided
    FeaturePrefsStore.batch1951.v1959divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1959: documented mode
internal fun PlayerActivity.showV1959DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959documented
    FeaturePrefsStore.batch1951.v1959documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1959: doubled mode
internal fun PlayerActivity.showV1959DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1959doubled
    FeaturePrefsStore.batch1951.v1959doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1959: downloaded mode
internal fun PlayerActivity.showV1959DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959downloaded
    FeaturePrefsStore.batch1951.v1959downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1959: drafted mode
internal fun PlayerActivity.showV1959DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drafted
    FeaturePrefsStore.batch1951.v1959drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1959: drained level
internal fun PlayerActivity.showV1959DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1959: dramatized level
internal fun PlayerActivity.showV1959DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1959: drawn level
internal fun PlayerActivity.showV1959DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1959: dreamed level
internal fun PlayerActivity.showV1959DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1959: drifted level
internal fun PlayerActivity.showV1959DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1959: drilled mode
internal fun PlayerActivity.showV1959DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drilled
    FeaturePrefsStore.batch1951.v1959drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1959: driven mode
internal fun PlayerActivity.showV1959DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1959driven
    FeaturePrefsStore.batch1951.v1959driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1959: dropped mode
internal fun PlayerActivity.showV1959DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959dropped
    FeaturePrefsStore.batch1951.v1959dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1959: drowned mode
internal fun PlayerActivity.showV1959DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drowned
    FeaturePrefsStore.batch1951.v1959drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1959: duplicated mode
internal fun PlayerActivity.showV1959DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959duplicated
    FeaturePrefsStore.batch1951.v1959duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1960: divided mode
internal fun PlayerActivity.showV1960DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960divided
    FeaturePrefsStore.batch1951.v1960divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1960: documented mode
internal fun PlayerActivity.showV1960DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960documented
    FeaturePrefsStore.batch1951.v1960documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1960: doubled mode
internal fun PlayerActivity.showV1960DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1960doubled
    FeaturePrefsStore.batch1951.v1960doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1960: downloaded mode
internal fun PlayerActivity.showV1960DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960downloaded
    FeaturePrefsStore.batch1951.v1960downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1960: drafted mode
internal fun PlayerActivity.showV1960DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drafted
    FeaturePrefsStore.batch1951.v1960drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1960: drained level
internal fun PlayerActivity.showV1960DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1960: dramatized level
internal fun PlayerActivity.showV1960DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1960: drawn level
internal fun PlayerActivity.showV1960DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1960: dreamed level
internal fun PlayerActivity.showV1960DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1960: drifted level
internal fun PlayerActivity.showV1960DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1960: drilled mode
internal fun PlayerActivity.showV1960DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drilled
    FeaturePrefsStore.batch1951.v1960drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1960: driven mode
internal fun PlayerActivity.showV1960DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1960driven
    FeaturePrefsStore.batch1951.v1960driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1960: dropped mode
internal fun PlayerActivity.showV1960DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960dropped
    FeaturePrefsStore.batch1951.v1960dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1960: drowned mode
internal fun PlayerActivity.showV1960DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drowned
    FeaturePrefsStore.batch1951.v1960drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1960: duplicated mode
internal fun PlayerActivity.showV1960DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960duplicated
    FeaturePrefsStore.batch1951.v1960duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1961: dusted mode
internal fun PlayerActivity.showV1961DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961dusted
    FeaturePrefsStore.batch1961.v1961dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1961: earned mode
internal fun PlayerActivity.showV1961EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961earned
    FeaturePrefsStore.batch1961.v1961earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1961: eased mode
internal fun PlayerActivity.showV1961EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961eased
    FeaturePrefsStore.batch1961.v1961eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1961: echoed mode
internal fun PlayerActivity.showV1961EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961echoed
    FeaturePrefsStore.batch1961.v1961echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1961: edited mode
internal fun PlayerActivity.showV1961EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961edited
    FeaturePrefsStore.batch1961.v1961edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1961: educated level
internal fun PlayerActivity.showV1961EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1961educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1961educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1961: effected level
internal fun PlayerActivity.showV1961EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1961effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1961effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1961: elected level
internal fun PlayerActivity.showV1961ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1961elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1961elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1961: elevated level
internal fun PlayerActivity.showV1961ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1961elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1961elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1961: eliminated level
internal fun PlayerActivity.showV1961EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1961eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1961eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1961: embarked mode
internal fun PlayerActivity.showV1961EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961embarked
    FeaturePrefsStore.batch1961.v1961embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1961: emerged mode
internal fun PlayerActivity.showV1961EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961emerged
    FeaturePrefsStore.batch1961.v1961emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1961: emitted mode
internal fun PlayerActivity.showV1961EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961emitted
    FeaturePrefsStore.batch1961.v1961emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1961: emphasized mode
internal fun PlayerActivity.showV1961EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961emphasized
    FeaturePrefsStore.batch1961.v1961emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1961: employed mode
internal fun PlayerActivity.showV1961EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1961employed
    FeaturePrefsStore.batch1961.v1961employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1962: dusted mode
internal fun PlayerActivity.showV1962DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962dusted
    FeaturePrefsStore.batch1961.v1962dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1962: earned mode
internal fun PlayerActivity.showV1962EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962earned
    FeaturePrefsStore.batch1961.v1962earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1962: eased mode
internal fun PlayerActivity.showV1962EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962eased
    FeaturePrefsStore.batch1961.v1962eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1962: echoed mode
internal fun PlayerActivity.showV1962EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962echoed
    FeaturePrefsStore.batch1961.v1962echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1962: edited mode
internal fun PlayerActivity.showV1962EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962edited
    FeaturePrefsStore.batch1961.v1962edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1962: educated level
internal fun PlayerActivity.showV1962EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1962educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1962educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1962: effected level
internal fun PlayerActivity.showV1962EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1962effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1962effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1962: elected level
internal fun PlayerActivity.showV1962ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1962elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1962elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1962: elevated level
internal fun PlayerActivity.showV1962ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1962elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1962elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1962: eliminated level
internal fun PlayerActivity.showV1962EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1962eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1962eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1962: embarked mode
internal fun PlayerActivity.showV1962EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962embarked
    FeaturePrefsStore.batch1961.v1962embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1962: emerged mode
internal fun PlayerActivity.showV1962EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962emerged
    FeaturePrefsStore.batch1961.v1962emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1962: emitted mode
internal fun PlayerActivity.showV1962EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962emitted
    FeaturePrefsStore.batch1961.v1962emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1962: emphasized mode
internal fun PlayerActivity.showV1962EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962emphasized
    FeaturePrefsStore.batch1961.v1962emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1962: employed mode
internal fun PlayerActivity.showV1962EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1962employed
    FeaturePrefsStore.batch1961.v1962employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1963: dusted mode
internal fun PlayerActivity.showV1963DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963dusted
    FeaturePrefsStore.batch1961.v1963dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1963: earned mode
internal fun PlayerActivity.showV1963EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963earned
    FeaturePrefsStore.batch1961.v1963earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1963: eased mode
internal fun PlayerActivity.showV1963EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963eased
    FeaturePrefsStore.batch1961.v1963eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1963: echoed mode
internal fun PlayerActivity.showV1963EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963echoed
    FeaturePrefsStore.batch1961.v1963echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1963: edited mode
internal fun PlayerActivity.showV1963EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963edited
    FeaturePrefsStore.batch1961.v1963edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1963: educated level
internal fun PlayerActivity.showV1963EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1963educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1963educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1963: effected level
internal fun PlayerActivity.showV1963EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1963effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1963effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1963: elected level
internal fun PlayerActivity.showV1963ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1963elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1963elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1963: elevated level
internal fun PlayerActivity.showV1963ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1963elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1963elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1963: eliminated level
internal fun PlayerActivity.showV1963EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1963eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1963eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1963: embarked mode
internal fun PlayerActivity.showV1963EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963embarked
    FeaturePrefsStore.batch1961.v1963embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1963: emerged mode
internal fun PlayerActivity.showV1963EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963emerged
    FeaturePrefsStore.batch1961.v1963emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1963: emitted mode
internal fun PlayerActivity.showV1963EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963emitted
    FeaturePrefsStore.batch1961.v1963emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1963: emphasized mode
internal fun PlayerActivity.showV1963EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963emphasized
    FeaturePrefsStore.batch1961.v1963emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1963: employed mode
internal fun PlayerActivity.showV1963EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1963employed
    FeaturePrefsStore.batch1961.v1963employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1964: dusted mode
internal fun PlayerActivity.showV1964DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964dusted
    FeaturePrefsStore.batch1961.v1964dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1964: earned mode
internal fun PlayerActivity.showV1964EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964earned
    FeaturePrefsStore.batch1961.v1964earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1964: eased mode
internal fun PlayerActivity.showV1964EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964eased
    FeaturePrefsStore.batch1961.v1964eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1964: echoed mode
internal fun PlayerActivity.showV1964EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964echoed
    FeaturePrefsStore.batch1961.v1964echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1964: edited mode
internal fun PlayerActivity.showV1964EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964edited
    FeaturePrefsStore.batch1961.v1964edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1964: educated level
internal fun PlayerActivity.showV1964EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1964educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1964educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1964: effected level
internal fun PlayerActivity.showV1964EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1964effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1964effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1964: elected level
internal fun PlayerActivity.showV1964ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1964elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1964elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1964: elevated level
internal fun PlayerActivity.showV1964ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1964elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1964elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1964: eliminated level
internal fun PlayerActivity.showV1964EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1964eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1964eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1964: embarked mode
internal fun PlayerActivity.showV1964EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964embarked
    FeaturePrefsStore.batch1961.v1964embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1964: emerged mode
internal fun PlayerActivity.showV1964EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964emerged
    FeaturePrefsStore.batch1961.v1964emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1964: emitted mode
internal fun PlayerActivity.showV1964EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964emitted
    FeaturePrefsStore.batch1961.v1964emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1964: emphasized mode
internal fun PlayerActivity.showV1964EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964emphasized
    FeaturePrefsStore.batch1961.v1964emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1964: employed mode
internal fun PlayerActivity.showV1964EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1964employed
    FeaturePrefsStore.batch1961.v1964employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1965: dusted mode
internal fun PlayerActivity.showV1965DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965dusted
    FeaturePrefsStore.batch1961.v1965dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1965: earned mode
internal fun PlayerActivity.showV1965EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965earned
    FeaturePrefsStore.batch1961.v1965earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1965: eased mode
internal fun PlayerActivity.showV1965EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965eased
    FeaturePrefsStore.batch1961.v1965eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1965: echoed mode
internal fun PlayerActivity.showV1965EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965echoed
    FeaturePrefsStore.batch1961.v1965echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1965: edited mode
internal fun PlayerActivity.showV1965EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965edited
    FeaturePrefsStore.batch1961.v1965edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1965: educated level
internal fun PlayerActivity.showV1965EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1965educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1965educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1965: effected level
internal fun PlayerActivity.showV1965EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1965effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1965effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1965: elected level
internal fun PlayerActivity.showV1965ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1965elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1965elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1965: elevated level
internal fun PlayerActivity.showV1965ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1965elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1965elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1965: eliminated level
internal fun PlayerActivity.showV1965EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1965eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1965eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1965: embarked mode
internal fun PlayerActivity.showV1965EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965embarked
    FeaturePrefsStore.batch1961.v1965embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1965: emerged mode
internal fun PlayerActivity.showV1965EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965emerged
    FeaturePrefsStore.batch1961.v1965emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1965: emitted mode
internal fun PlayerActivity.showV1965EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965emitted
    FeaturePrefsStore.batch1961.v1965emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1965: emphasized mode
internal fun PlayerActivity.showV1965EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965emphasized
    FeaturePrefsStore.batch1961.v1965emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1965: employed mode
internal fun PlayerActivity.showV1965EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1965employed
    FeaturePrefsStore.batch1961.v1965employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1966: dusted mode
internal fun PlayerActivity.showV1966DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966dusted
    FeaturePrefsStore.batch1961.v1966dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1966: earned mode
internal fun PlayerActivity.showV1966EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966earned
    FeaturePrefsStore.batch1961.v1966earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1966: eased mode
internal fun PlayerActivity.showV1966EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966eased
    FeaturePrefsStore.batch1961.v1966eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1966: echoed mode
internal fun PlayerActivity.showV1966EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966echoed
    FeaturePrefsStore.batch1961.v1966echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1966: edited mode
internal fun PlayerActivity.showV1966EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966edited
    FeaturePrefsStore.batch1961.v1966edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1966: educated level
internal fun PlayerActivity.showV1966EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1966educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1966educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1966: effected level
internal fun PlayerActivity.showV1966EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1966effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1966effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1966: elected level
internal fun PlayerActivity.showV1966ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1966elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1966elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1966: elevated level
internal fun PlayerActivity.showV1966ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1966elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1966elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1966: eliminated level
internal fun PlayerActivity.showV1966EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1966eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1966eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1966: embarked mode
internal fun PlayerActivity.showV1966EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966embarked
    FeaturePrefsStore.batch1961.v1966embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1966: emerged mode
internal fun PlayerActivity.showV1966EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966emerged
    FeaturePrefsStore.batch1961.v1966emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1966: emitted mode
internal fun PlayerActivity.showV1966EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966emitted
    FeaturePrefsStore.batch1961.v1966emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1966: emphasized mode
internal fun PlayerActivity.showV1966EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966emphasized
    FeaturePrefsStore.batch1961.v1966emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1966: employed mode
internal fun PlayerActivity.showV1966EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1966employed
    FeaturePrefsStore.batch1961.v1966employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1967: dusted mode
internal fun PlayerActivity.showV1967DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967dusted
    FeaturePrefsStore.batch1961.v1967dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1967: earned mode
internal fun PlayerActivity.showV1967EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967earned
    FeaturePrefsStore.batch1961.v1967earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1967: eased mode
internal fun PlayerActivity.showV1967EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967eased
    FeaturePrefsStore.batch1961.v1967eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1967: echoed mode
internal fun PlayerActivity.showV1967EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967echoed
    FeaturePrefsStore.batch1961.v1967echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1967: edited mode
internal fun PlayerActivity.showV1967EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967edited
    FeaturePrefsStore.batch1961.v1967edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1967: educated level
internal fun PlayerActivity.showV1967EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1967educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1967educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1967: effected level
internal fun PlayerActivity.showV1967EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1967effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1967effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1967: elected level
internal fun PlayerActivity.showV1967ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1967elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1967elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1967: elevated level
internal fun PlayerActivity.showV1967ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1967elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1967elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1967: eliminated level
internal fun PlayerActivity.showV1967EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1967eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1967eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1967: embarked mode
internal fun PlayerActivity.showV1967EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967embarked
    FeaturePrefsStore.batch1961.v1967embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1967: emerged mode
internal fun PlayerActivity.showV1967EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967emerged
    FeaturePrefsStore.batch1961.v1967emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1967: emitted mode
internal fun PlayerActivity.showV1967EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967emitted
    FeaturePrefsStore.batch1961.v1967emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1967: emphasized mode
internal fun PlayerActivity.showV1967EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967emphasized
    FeaturePrefsStore.batch1961.v1967emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1967: employed mode
internal fun PlayerActivity.showV1967EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1967employed
    FeaturePrefsStore.batch1961.v1967employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1968: dusted mode
internal fun PlayerActivity.showV1968DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968dusted
    FeaturePrefsStore.batch1961.v1968dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1968: earned mode
internal fun PlayerActivity.showV1968EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968earned
    FeaturePrefsStore.batch1961.v1968earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1968: eased mode
internal fun PlayerActivity.showV1968EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968eased
    FeaturePrefsStore.batch1961.v1968eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1968: echoed mode
internal fun PlayerActivity.showV1968EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968echoed
    FeaturePrefsStore.batch1961.v1968echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1968: edited mode
internal fun PlayerActivity.showV1968EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968edited
    FeaturePrefsStore.batch1961.v1968edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1968: educated level
internal fun PlayerActivity.showV1968EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1968educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1968educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1968: effected level
internal fun PlayerActivity.showV1968EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1968effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1968effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1968: elected level
internal fun PlayerActivity.showV1968ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1968elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1968elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1968: elevated level
internal fun PlayerActivity.showV1968ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1968elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1968elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1968: eliminated level
internal fun PlayerActivity.showV1968EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1968eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1968eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1968: embarked mode
internal fun PlayerActivity.showV1968EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968embarked
    FeaturePrefsStore.batch1961.v1968embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1968: emerged mode
internal fun PlayerActivity.showV1968EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968emerged
    FeaturePrefsStore.batch1961.v1968emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1968: emitted mode
internal fun PlayerActivity.showV1968EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968emitted
    FeaturePrefsStore.batch1961.v1968emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1968: emphasized mode
internal fun PlayerActivity.showV1968EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968emphasized
    FeaturePrefsStore.batch1961.v1968emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1968: employed mode
internal fun PlayerActivity.showV1968EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1968employed
    FeaturePrefsStore.batch1961.v1968employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1969: dusted mode
internal fun PlayerActivity.showV1969DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969dusted
    FeaturePrefsStore.batch1961.v1969dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1969: earned mode
internal fun PlayerActivity.showV1969EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969earned
    FeaturePrefsStore.batch1961.v1969earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1969: eased mode
internal fun PlayerActivity.showV1969EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969eased
    FeaturePrefsStore.batch1961.v1969eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1969: echoed mode
internal fun PlayerActivity.showV1969EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969echoed
    FeaturePrefsStore.batch1961.v1969echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1969: edited mode
internal fun PlayerActivity.showV1969EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969edited
    FeaturePrefsStore.batch1961.v1969edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1969: educated level
internal fun PlayerActivity.showV1969EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1969educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1969educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1969: effected level
internal fun PlayerActivity.showV1969EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1969effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1969effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1969: elected level
internal fun PlayerActivity.showV1969ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1969elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1969elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1969: elevated level
internal fun PlayerActivity.showV1969ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1969elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1969elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1969: eliminated level
internal fun PlayerActivity.showV1969EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1969eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1969eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1969: embarked mode
internal fun PlayerActivity.showV1969EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969embarked
    FeaturePrefsStore.batch1961.v1969embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1969: emerged mode
internal fun PlayerActivity.showV1969EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969emerged
    FeaturePrefsStore.batch1961.v1969emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1969: emitted mode
internal fun PlayerActivity.showV1969EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969emitted
    FeaturePrefsStore.batch1961.v1969emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1969: emphasized mode
internal fun PlayerActivity.showV1969EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969emphasized
    FeaturePrefsStore.batch1961.v1969emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1969: employed mode
internal fun PlayerActivity.showV1969EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1969employed
    FeaturePrefsStore.batch1961.v1969employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}

// v1970: dusted mode
internal fun PlayerActivity.showV1970DustedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970dusted
    FeaturePrefsStore.batch1961.v1970dusted = !current
    AppToast.show(this, "dusted: ${if (!current) "ON" else "OFF"}")
}

// v1970: earned mode
internal fun PlayerActivity.showV1970EarnedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970earned
    FeaturePrefsStore.batch1961.v1970earned = !current
    AppToast.show(this, "earned: ${if (!current) "ON" else "OFF"}")
}

// v1970: eased mode
internal fun PlayerActivity.showV1970EasedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970eased
    FeaturePrefsStore.batch1961.v1970eased = !current
    AppToast.show(this, "eased: ${if (!current) "ON" else "OFF"}")
}

// v1970: echoed mode
internal fun PlayerActivity.showV1970EchoedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970echoed
    FeaturePrefsStore.batch1961.v1970echoed = !current
    AppToast.show(this, "echoed: ${if (!current) "ON" else "OFF"}")
}

// v1970: edited mode
internal fun PlayerActivity.showV1970EditedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970edited
    FeaturePrefsStore.batch1961.v1970edited = !current
    AppToast.show(this, "edited: ${if (!current) "ON" else "OFF"}")
}

// v1970: educated level
internal fun PlayerActivity.showV1970EducatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1970educated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "educated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1970educated = value
        AppToast.show(this, "educated: $value")
    }
}

// v1970: effected level
internal fun PlayerActivity.showV1970EffectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1970effected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "effected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1970effected = value
        AppToast.show(this, "effected: $value")
    }
}

// v1970: elected level
internal fun PlayerActivity.showV1970ElectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1970elected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1970elected = value
        AppToast.show(this, "elected: $value")
    }
}

// v1970: elevated level
internal fun PlayerActivity.showV1970ElevatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1970elevated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elevated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1970elevated = value
        AppToast.show(this, "elevated: $value")
    }
}

// v1970: eliminated level
internal fun PlayerActivity.showV1970EliminatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1961.v1970eliminated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eliminated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1961.v1970eliminated = value
        AppToast.show(this, "eliminated: $value")
    }
}

// v1970: embarked mode
internal fun PlayerActivity.showV1970EmbarkedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970embarked
    FeaturePrefsStore.batch1961.v1970embarked = !current
    AppToast.show(this, "embarked: ${if (!current) "ON" else "OFF"}")
}

// v1970: emerged mode
internal fun PlayerActivity.showV1970EmergedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970emerged
    FeaturePrefsStore.batch1961.v1970emerged = !current
    AppToast.show(this, "emerged: ${if (!current) "ON" else "OFF"}")
}

// v1970: emitted mode
internal fun PlayerActivity.showV1970EmittedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970emitted
    FeaturePrefsStore.batch1961.v1970emitted = !current
    AppToast.show(this, "emitted: ${if (!current) "ON" else "OFF"}")
}

// v1970: emphasized mode
internal fun PlayerActivity.showV1970EmphasizedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970emphasized
    FeaturePrefsStore.batch1961.v1970emphasized = !current
    AppToast.show(this, "emphasized: ${if (!current) "ON" else "OFF"}")
}

// v1970: employed mode
internal fun PlayerActivity.showV1970EmployedToggle() {
    val current = FeaturePrefsStore.batch1961.v1970employed
    FeaturePrefsStore.batch1961.v1970employed = !current
    AppToast.show(this, "employed: ${if (!current) "ON" else "OFF"}")
}
