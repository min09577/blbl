package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1991: expedited mode
internal fun PlayerActivity.showV1991ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991expedited
    FeaturePrefsStore.batch1991.v1991expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1991: experimented mode
internal fun PlayerActivity.showV1991ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991experimented
    FeaturePrefsStore.batch1991.v1991experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1991: explained mode
internal fun PlayerActivity.showV1991ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991explained
    FeaturePrefsStore.batch1991.v1991explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1991: explored mode
internal fun PlayerActivity.showV1991ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1991explored
    FeaturePrefsStore.batch1991.v1991explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1991: exported mode
internal fun PlayerActivity.showV1991ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991exported
    FeaturePrefsStore.batch1991.v1991exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1991: exposed level
internal fun PlayerActivity.showV1991ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1991: expressed level
internal fun PlayerActivity.showV1991ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1991: extended level
internal fun PlayerActivity.showV1991ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1991: extracted level
internal fun PlayerActivity.showV1991ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1991: fabricated level
internal fun PlayerActivity.showV1991FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1991: facilitated mode
internal fun PlayerActivity.showV1991FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991facilitated
    FeaturePrefsStore.batch1991.v1991facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1991: faded mode
internal fun PlayerActivity.showV1991FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991faded
    FeaturePrefsStore.batch1991.v1991faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1991: failed mode
internal fun PlayerActivity.showV1991FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991failed
    FeaturePrefsStore.batch1991.v1991failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1991: favored mode
internal fun PlayerActivity.showV1991FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1991favored
    FeaturePrefsStore.batch1991.v1991favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1991: featured mode
internal fun PlayerActivity.showV1991FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991featured
    FeaturePrefsStore.batch1991.v1991featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1992: expedited mode
internal fun PlayerActivity.showV1992ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992expedited
    FeaturePrefsStore.batch1991.v1992expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1992: experimented mode
internal fun PlayerActivity.showV1992ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992experimented
    FeaturePrefsStore.batch1991.v1992experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1992: explained mode
internal fun PlayerActivity.showV1992ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992explained
    FeaturePrefsStore.batch1991.v1992explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1992: explored mode
internal fun PlayerActivity.showV1992ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1992explored
    FeaturePrefsStore.batch1991.v1992explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1992: exported mode
internal fun PlayerActivity.showV1992ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992exported
    FeaturePrefsStore.batch1991.v1992exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1992: exposed level
internal fun PlayerActivity.showV1992ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1992: expressed level
internal fun PlayerActivity.showV1992ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1992: extended level
internal fun PlayerActivity.showV1992ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1992: extracted level
internal fun PlayerActivity.showV1992ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1992: fabricated level
internal fun PlayerActivity.showV1992FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1992: facilitated mode
internal fun PlayerActivity.showV1992FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992facilitated
    FeaturePrefsStore.batch1991.v1992facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1992: faded mode
internal fun PlayerActivity.showV1992FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992faded
    FeaturePrefsStore.batch1991.v1992faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1992: failed mode
internal fun PlayerActivity.showV1992FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992failed
    FeaturePrefsStore.batch1991.v1992failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1992: favored mode
internal fun PlayerActivity.showV1992FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1992favored
    FeaturePrefsStore.batch1991.v1992favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1992: featured mode
internal fun PlayerActivity.showV1992FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992featured
    FeaturePrefsStore.batch1991.v1992featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1993: expedited mode
internal fun PlayerActivity.showV1993ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993expedited
    FeaturePrefsStore.batch1991.v1993expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1993: experimented mode
internal fun PlayerActivity.showV1993ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993experimented
    FeaturePrefsStore.batch1991.v1993experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1993: explained mode
internal fun PlayerActivity.showV1993ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993explained
    FeaturePrefsStore.batch1991.v1993explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1993: explored mode
internal fun PlayerActivity.showV1993ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1993explored
    FeaturePrefsStore.batch1991.v1993explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1993: exported mode
internal fun PlayerActivity.showV1993ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993exported
    FeaturePrefsStore.batch1991.v1993exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1993: exposed level
internal fun PlayerActivity.showV1993ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1993: expressed level
internal fun PlayerActivity.showV1993ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1993: extended level
internal fun PlayerActivity.showV1993ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1993: extracted level
internal fun PlayerActivity.showV1993ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1993: fabricated level
internal fun PlayerActivity.showV1993FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1993: facilitated mode
internal fun PlayerActivity.showV1993FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993facilitated
    FeaturePrefsStore.batch1991.v1993facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1993: faded mode
internal fun PlayerActivity.showV1993FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993faded
    FeaturePrefsStore.batch1991.v1993faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1993: failed mode
internal fun PlayerActivity.showV1993FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993failed
    FeaturePrefsStore.batch1991.v1993failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1993: favored mode
internal fun PlayerActivity.showV1993FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1993favored
    FeaturePrefsStore.batch1991.v1993favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1993: featured mode
internal fun PlayerActivity.showV1993FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993featured
    FeaturePrefsStore.batch1991.v1993featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1994: expedited mode
internal fun PlayerActivity.showV1994ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994expedited
    FeaturePrefsStore.batch1991.v1994expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1994: experimented mode
internal fun PlayerActivity.showV1994ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994experimented
    FeaturePrefsStore.batch1991.v1994experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1994: explained mode
internal fun PlayerActivity.showV1994ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994explained
    FeaturePrefsStore.batch1991.v1994explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1994: explored mode
internal fun PlayerActivity.showV1994ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1994explored
    FeaturePrefsStore.batch1991.v1994explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1994: exported mode
internal fun PlayerActivity.showV1994ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994exported
    FeaturePrefsStore.batch1991.v1994exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1994: exposed level
internal fun PlayerActivity.showV1994ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1994: expressed level
internal fun PlayerActivity.showV1994ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1994: extended level
internal fun PlayerActivity.showV1994ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1994: extracted level
internal fun PlayerActivity.showV1994ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1994: fabricated level
internal fun PlayerActivity.showV1994FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1994: facilitated mode
internal fun PlayerActivity.showV1994FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994facilitated
    FeaturePrefsStore.batch1991.v1994facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1994: faded mode
internal fun PlayerActivity.showV1994FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994faded
    FeaturePrefsStore.batch1991.v1994faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1994: failed mode
internal fun PlayerActivity.showV1994FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994failed
    FeaturePrefsStore.batch1991.v1994failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1994: favored mode
internal fun PlayerActivity.showV1994FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1994favored
    FeaturePrefsStore.batch1991.v1994favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1994: featured mode
internal fun PlayerActivity.showV1994FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994featured
    FeaturePrefsStore.batch1991.v1994featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1995: expedited mode
internal fun PlayerActivity.showV1995ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995expedited
    FeaturePrefsStore.batch1991.v1995expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1995: experimented mode
internal fun PlayerActivity.showV1995ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995experimented
    FeaturePrefsStore.batch1991.v1995experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1995: explained mode
internal fun PlayerActivity.showV1995ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995explained
    FeaturePrefsStore.batch1991.v1995explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1995: explored mode
internal fun PlayerActivity.showV1995ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1995explored
    FeaturePrefsStore.batch1991.v1995explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1995: exported mode
internal fun PlayerActivity.showV1995ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995exported
    FeaturePrefsStore.batch1991.v1995exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1995: exposed level
internal fun PlayerActivity.showV1995ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1995: expressed level
internal fun PlayerActivity.showV1995ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1995: extended level
internal fun PlayerActivity.showV1995ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1995: extracted level
internal fun PlayerActivity.showV1995ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1995: fabricated level
internal fun PlayerActivity.showV1995FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1995: facilitated mode
internal fun PlayerActivity.showV1995FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995facilitated
    FeaturePrefsStore.batch1991.v1995facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1995: faded mode
internal fun PlayerActivity.showV1995FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995faded
    FeaturePrefsStore.batch1991.v1995faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1995: failed mode
internal fun PlayerActivity.showV1995FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995failed
    FeaturePrefsStore.batch1991.v1995failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1995: favored mode
internal fun PlayerActivity.showV1995FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1995favored
    FeaturePrefsStore.batch1991.v1995favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1995: featured mode
internal fun PlayerActivity.showV1995FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995featured
    FeaturePrefsStore.batch1991.v1995featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1996: expedited mode
internal fun PlayerActivity.showV1996ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996expedited
    FeaturePrefsStore.batch1991.v1996expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1996: experimented mode
internal fun PlayerActivity.showV1996ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996experimented
    FeaturePrefsStore.batch1991.v1996experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1996: explained mode
internal fun PlayerActivity.showV1996ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996explained
    FeaturePrefsStore.batch1991.v1996explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1996: explored mode
internal fun PlayerActivity.showV1996ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1996explored
    FeaturePrefsStore.batch1991.v1996explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1996: exported mode
internal fun PlayerActivity.showV1996ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996exported
    FeaturePrefsStore.batch1991.v1996exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1996: exposed level
internal fun PlayerActivity.showV1996ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1996: expressed level
internal fun PlayerActivity.showV1996ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1996: extended level
internal fun PlayerActivity.showV1996ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1996: extracted level
internal fun PlayerActivity.showV1996ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1996: fabricated level
internal fun PlayerActivity.showV1996FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1996: facilitated mode
internal fun PlayerActivity.showV1996FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996facilitated
    FeaturePrefsStore.batch1991.v1996facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1996: faded mode
internal fun PlayerActivity.showV1996FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996faded
    FeaturePrefsStore.batch1991.v1996faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1996: failed mode
internal fun PlayerActivity.showV1996FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996failed
    FeaturePrefsStore.batch1991.v1996failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1996: favored mode
internal fun PlayerActivity.showV1996FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1996favored
    FeaturePrefsStore.batch1991.v1996favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1996: featured mode
internal fun PlayerActivity.showV1996FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996featured
    FeaturePrefsStore.batch1991.v1996featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1997: expedited mode
internal fun PlayerActivity.showV1997ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997expedited
    FeaturePrefsStore.batch1991.v1997expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1997: experimented mode
internal fun PlayerActivity.showV1997ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997experimented
    FeaturePrefsStore.batch1991.v1997experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1997: explained mode
internal fun PlayerActivity.showV1997ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997explained
    FeaturePrefsStore.batch1991.v1997explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1997: explored mode
internal fun PlayerActivity.showV1997ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1997explored
    FeaturePrefsStore.batch1991.v1997explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1997: exported mode
internal fun PlayerActivity.showV1997ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997exported
    FeaturePrefsStore.batch1991.v1997exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1997: exposed level
internal fun PlayerActivity.showV1997ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1997: expressed level
internal fun PlayerActivity.showV1997ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1997: extended level
internal fun PlayerActivity.showV1997ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1997: extracted level
internal fun PlayerActivity.showV1997ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1997: fabricated level
internal fun PlayerActivity.showV1997FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1997: facilitated mode
internal fun PlayerActivity.showV1997FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997facilitated
    FeaturePrefsStore.batch1991.v1997facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1997: faded mode
internal fun PlayerActivity.showV1997FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997faded
    FeaturePrefsStore.batch1991.v1997faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1997: failed mode
internal fun PlayerActivity.showV1997FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997failed
    FeaturePrefsStore.batch1991.v1997failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1997: favored mode
internal fun PlayerActivity.showV1997FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1997favored
    FeaturePrefsStore.batch1991.v1997favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1997: featured mode
internal fun PlayerActivity.showV1997FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997featured
    FeaturePrefsStore.batch1991.v1997featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1998: expedited mode
internal fun PlayerActivity.showV1998ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998expedited
    FeaturePrefsStore.batch1991.v1998expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1998: experimented mode
internal fun PlayerActivity.showV1998ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998experimented
    FeaturePrefsStore.batch1991.v1998experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1998: explained mode
internal fun PlayerActivity.showV1998ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998explained
    FeaturePrefsStore.batch1991.v1998explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1998: explored mode
internal fun PlayerActivity.showV1998ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1998explored
    FeaturePrefsStore.batch1991.v1998explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1998: exported mode
internal fun PlayerActivity.showV1998ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998exported
    FeaturePrefsStore.batch1991.v1998exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1998: exposed level
internal fun PlayerActivity.showV1998ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1998: expressed level
internal fun PlayerActivity.showV1998ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1998: extended level
internal fun PlayerActivity.showV1998ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1998: extracted level
internal fun PlayerActivity.showV1998ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1998: fabricated level
internal fun PlayerActivity.showV1998FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1998: facilitated mode
internal fun PlayerActivity.showV1998FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998facilitated
    FeaturePrefsStore.batch1991.v1998facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1998: faded mode
internal fun PlayerActivity.showV1998FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998faded
    FeaturePrefsStore.batch1991.v1998faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1998: failed mode
internal fun PlayerActivity.showV1998FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998failed
    FeaturePrefsStore.batch1991.v1998failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1998: favored mode
internal fun PlayerActivity.showV1998FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1998favored
    FeaturePrefsStore.batch1991.v1998favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1998: featured mode
internal fun PlayerActivity.showV1998FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998featured
    FeaturePrefsStore.batch1991.v1998featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1999: expedited mode
internal fun PlayerActivity.showV1999ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999expedited
    FeaturePrefsStore.batch1991.v1999expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1999: experimented mode
internal fun PlayerActivity.showV1999ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999experimented
    FeaturePrefsStore.batch1991.v1999experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1999: explained mode
internal fun PlayerActivity.showV1999ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999explained
    FeaturePrefsStore.batch1991.v1999explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1999: explored mode
internal fun PlayerActivity.showV1999ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1999explored
    FeaturePrefsStore.batch1991.v1999explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1999: exported mode
internal fun PlayerActivity.showV1999ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999exported
    FeaturePrefsStore.batch1991.v1999exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1999: exposed level
internal fun PlayerActivity.showV1999ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1999: expressed level
internal fun PlayerActivity.showV1999ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1999: extended level
internal fun PlayerActivity.showV1999ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1999: extracted level
internal fun PlayerActivity.showV1999ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1999: fabricated level
internal fun PlayerActivity.showV1999FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1999: facilitated mode
internal fun PlayerActivity.showV1999FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999facilitated
    FeaturePrefsStore.batch1991.v1999facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1999: faded mode
internal fun PlayerActivity.showV1999FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999faded
    FeaturePrefsStore.batch1991.v1999faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1999: failed mode
internal fun PlayerActivity.showV1999FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999failed
    FeaturePrefsStore.batch1991.v1999failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1999: favored mode
internal fun PlayerActivity.showV1999FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1999favored
    FeaturePrefsStore.batch1991.v1999favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1999: featured mode
internal fun PlayerActivity.showV1999FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999featured
    FeaturePrefsStore.batch1991.v1999featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v2000: expedited mode
internal fun PlayerActivity.showV2000ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000expedited
    FeaturePrefsStore.batch1991.v2000expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v2000: experimented mode
internal fun PlayerActivity.showV2000ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000experimented
    FeaturePrefsStore.batch1991.v2000experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v2000: explained mode
internal fun PlayerActivity.showV2000ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000explained
    FeaturePrefsStore.batch1991.v2000explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v2000: explored mode
internal fun PlayerActivity.showV2000ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v2000explored
    FeaturePrefsStore.batch1991.v2000explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v2000: exported mode
internal fun PlayerActivity.showV2000ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000exported
    FeaturePrefsStore.batch1991.v2000exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v2000: exposed level
internal fun PlayerActivity.showV2000ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v2000: expressed level
internal fun PlayerActivity.showV2000ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v2000: extended level
internal fun PlayerActivity.showV2000ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v2000: extracted level
internal fun PlayerActivity.showV2000ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v2000: fabricated level
internal fun PlayerActivity.showV2000FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v2000: facilitated mode
internal fun PlayerActivity.showV2000FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000facilitated
    FeaturePrefsStore.batch1991.v2000facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v2000: faded mode
internal fun PlayerActivity.showV2000FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000faded
    FeaturePrefsStore.batch1991.v2000faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v2000: failed mode
internal fun PlayerActivity.showV2000FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000failed
    FeaturePrefsStore.batch1991.v2000failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v2000: favored mode
internal fun PlayerActivity.showV2000FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v2000favored
    FeaturePrefsStore.batch1991.v2000favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v2000: featured mode
internal fun PlayerActivity.showV2000FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000featured
    FeaturePrefsStore.batch1991.v2000featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

