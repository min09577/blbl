package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2041: illustrated mode
internal fun PlayerActivity.showV2041IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041illustrated
    FeaturePrefsStore.batch2041.v2041illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2041: imagined mode
internal fun PlayerActivity.showV2041ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041imagined
    FeaturePrefsStore.batch2041.v2041imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2041: immunized mode
internal fun PlayerActivity.showV2041ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041immunized
    FeaturePrefsStore.batch2041.v2041immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2041: implemented mode
internal fun PlayerActivity.showV2041ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041implemented
    FeaturePrefsStore.batch2041.v2041implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2041: implied mode
internal fun PlayerActivity.showV2041ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041implied
    FeaturePrefsStore.batch2041.v2041implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2041: imported level
internal fun PlayerActivity.showV2041ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2041imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2041imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2041: imposed level
internal fun PlayerActivity.showV2041ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2041imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2041imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2041: impressed level
internal fun PlayerActivity.showV2041ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2041impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2041impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2041: improved level
internal fun PlayerActivity.showV2041ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2041improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2041improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2041: included level
internal fun PlayerActivity.showV2041IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2041included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2041included = value
        AppToast.show(this, "included: $value")
    }
}

// v2041: increased mode
internal fun PlayerActivity.showV2041IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041increased
    FeaturePrefsStore.batch2041.v2041increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2041: indicated mode
internal fun PlayerActivity.showV2041IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041indicated
    FeaturePrefsStore.batch2041.v2041indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2041: induced mode
internal fun PlayerActivity.showV2041InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041induced
    FeaturePrefsStore.batch2041.v2041induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2041: influenced mode
internal fun PlayerActivity.showV2041InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041influenced
    FeaturePrefsStore.batch2041.v2041influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2041: informed mode
internal fun PlayerActivity.showV2041InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2041informed
    FeaturePrefsStore.batch2041.v2041informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2042: illustrated mode
internal fun PlayerActivity.showV2042IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042illustrated
    FeaturePrefsStore.batch2041.v2042illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2042: imagined mode
internal fun PlayerActivity.showV2042ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042imagined
    FeaturePrefsStore.batch2041.v2042imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2042: immunized mode
internal fun PlayerActivity.showV2042ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042immunized
    FeaturePrefsStore.batch2041.v2042immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2042: implemented mode
internal fun PlayerActivity.showV2042ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042implemented
    FeaturePrefsStore.batch2041.v2042implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2042: implied mode
internal fun PlayerActivity.showV2042ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042implied
    FeaturePrefsStore.batch2041.v2042implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2042: imported level
internal fun PlayerActivity.showV2042ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2042imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2042imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2042: imposed level
internal fun PlayerActivity.showV2042ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2042imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2042imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2042: impressed level
internal fun PlayerActivity.showV2042ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2042impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2042impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2042: improved level
internal fun PlayerActivity.showV2042ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2042improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2042improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2042: included level
internal fun PlayerActivity.showV2042IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2042included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2042included = value
        AppToast.show(this, "included: $value")
    }
}

// v2042: increased mode
internal fun PlayerActivity.showV2042IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042increased
    FeaturePrefsStore.batch2041.v2042increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2042: indicated mode
internal fun PlayerActivity.showV2042IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042indicated
    FeaturePrefsStore.batch2041.v2042indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2042: induced mode
internal fun PlayerActivity.showV2042InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042induced
    FeaturePrefsStore.batch2041.v2042induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2042: influenced mode
internal fun PlayerActivity.showV2042InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042influenced
    FeaturePrefsStore.batch2041.v2042influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2042: informed mode
internal fun PlayerActivity.showV2042InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2042informed
    FeaturePrefsStore.batch2041.v2042informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2043: illustrated mode
internal fun PlayerActivity.showV2043IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043illustrated
    FeaturePrefsStore.batch2041.v2043illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2043: imagined mode
internal fun PlayerActivity.showV2043ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043imagined
    FeaturePrefsStore.batch2041.v2043imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2043: immunized mode
internal fun PlayerActivity.showV2043ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043immunized
    FeaturePrefsStore.batch2041.v2043immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2043: implemented mode
internal fun PlayerActivity.showV2043ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043implemented
    FeaturePrefsStore.batch2041.v2043implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2043: implied mode
internal fun PlayerActivity.showV2043ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043implied
    FeaturePrefsStore.batch2041.v2043implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2043: imported level
internal fun PlayerActivity.showV2043ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2043imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2043imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2043: imposed level
internal fun PlayerActivity.showV2043ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2043imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2043imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2043: impressed level
internal fun PlayerActivity.showV2043ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2043impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2043impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2043: improved level
internal fun PlayerActivity.showV2043ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2043improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2043improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2043: included level
internal fun PlayerActivity.showV2043IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2043included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2043included = value
        AppToast.show(this, "included: $value")
    }
}

// v2043: increased mode
internal fun PlayerActivity.showV2043IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043increased
    FeaturePrefsStore.batch2041.v2043increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2043: indicated mode
internal fun PlayerActivity.showV2043IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043indicated
    FeaturePrefsStore.batch2041.v2043indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2043: induced mode
internal fun PlayerActivity.showV2043InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043induced
    FeaturePrefsStore.batch2041.v2043induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2043: influenced mode
internal fun PlayerActivity.showV2043InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043influenced
    FeaturePrefsStore.batch2041.v2043influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2043: informed mode
internal fun PlayerActivity.showV2043InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2043informed
    FeaturePrefsStore.batch2041.v2043informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2044: illustrated mode
internal fun PlayerActivity.showV2044IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044illustrated
    FeaturePrefsStore.batch2041.v2044illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2044: imagined mode
internal fun PlayerActivity.showV2044ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044imagined
    FeaturePrefsStore.batch2041.v2044imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2044: immunized mode
internal fun PlayerActivity.showV2044ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044immunized
    FeaturePrefsStore.batch2041.v2044immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2044: implemented mode
internal fun PlayerActivity.showV2044ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044implemented
    FeaturePrefsStore.batch2041.v2044implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2044: implied mode
internal fun PlayerActivity.showV2044ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044implied
    FeaturePrefsStore.batch2041.v2044implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2044: imported level
internal fun PlayerActivity.showV2044ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2044imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2044imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2044: imposed level
internal fun PlayerActivity.showV2044ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2044imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2044imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2044: impressed level
internal fun PlayerActivity.showV2044ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2044impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2044impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2044: improved level
internal fun PlayerActivity.showV2044ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2044improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2044improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2044: included level
internal fun PlayerActivity.showV2044IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2044included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2044included = value
        AppToast.show(this, "included: $value")
    }
}

// v2044: increased mode
internal fun PlayerActivity.showV2044IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044increased
    FeaturePrefsStore.batch2041.v2044increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2044: indicated mode
internal fun PlayerActivity.showV2044IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044indicated
    FeaturePrefsStore.batch2041.v2044indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2044: induced mode
internal fun PlayerActivity.showV2044InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044induced
    FeaturePrefsStore.batch2041.v2044induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2044: influenced mode
internal fun PlayerActivity.showV2044InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044influenced
    FeaturePrefsStore.batch2041.v2044influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2044: informed mode
internal fun PlayerActivity.showV2044InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2044informed
    FeaturePrefsStore.batch2041.v2044informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2045: illustrated mode
internal fun PlayerActivity.showV2045IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045illustrated
    FeaturePrefsStore.batch2041.v2045illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2045: imagined mode
internal fun PlayerActivity.showV2045ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045imagined
    FeaturePrefsStore.batch2041.v2045imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2045: immunized mode
internal fun PlayerActivity.showV2045ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045immunized
    FeaturePrefsStore.batch2041.v2045immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2045: implemented mode
internal fun PlayerActivity.showV2045ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045implemented
    FeaturePrefsStore.batch2041.v2045implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2045: implied mode
internal fun PlayerActivity.showV2045ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045implied
    FeaturePrefsStore.batch2041.v2045implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2045: imported level
internal fun PlayerActivity.showV2045ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2045imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2045imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2045: imposed level
internal fun PlayerActivity.showV2045ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2045imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2045imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2045: impressed level
internal fun PlayerActivity.showV2045ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2045impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2045impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2045: improved level
internal fun PlayerActivity.showV2045ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2045improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2045improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2045: included level
internal fun PlayerActivity.showV2045IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2045included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2045included = value
        AppToast.show(this, "included: $value")
    }
}

// v2045: increased mode
internal fun PlayerActivity.showV2045IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045increased
    FeaturePrefsStore.batch2041.v2045increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2045: indicated mode
internal fun PlayerActivity.showV2045IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045indicated
    FeaturePrefsStore.batch2041.v2045indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2045: induced mode
internal fun PlayerActivity.showV2045InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045induced
    FeaturePrefsStore.batch2041.v2045induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2045: influenced mode
internal fun PlayerActivity.showV2045InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045influenced
    FeaturePrefsStore.batch2041.v2045influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2045: informed mode
internal fun PlayerActivity.showV2045InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2045informed
    FeaturePrefsStore.batch2041.v2045informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2046: illustrated mode
internal fun PlayerActivity.showV2046IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046illustrated
    FeaturePrefsStore.batch2041.v2046illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2046: imagined mode
internal fun PlayerActivity.showV2046ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046imagined
    FeaturePrefsStore.batch2041.v2046imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2046: immunized mode
internal fun PlayerActivity.showV2046ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046immunized
    FeaturePrefsStore.batch2041.v2046immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2046: implemented mode
internal fun PlayerActivity.showV2046ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046implemented
    FeaturePrefsStore.batch2041.v2046implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2046: implied mode
internal fun PlayerActivity.showV2046ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046implied
    FeaturePrefsStore.batch2041.v2046implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2046: imported level
internal fun PlayerActivity.showV2046ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2046imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2046imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2046: imposed level
internal fun PlayerActivity.showV2046ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2046imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2046imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2046: impressed level
internal fun PlayerActivity.showV2046ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2046impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2046impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2046: improved level
internal fun PlayerActivity.showV2046ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2046improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2046improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2046: included level
internal fun PlayerActivity.showV2046IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2046included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2046included = value
        AppToast.show(this, "included: $value")
    }
}

// v2046: increased mode
internal fun PlayerActivity.showV2046IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046increased
    FeaturePrefsStore.batch2041.v2046increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2046: indicated mode
internal fun PlayerActivity.showV2046IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046indicated
    FeaturePrefsStore.batch2041.v2046indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2046: induced mode
internal fun PlayerActivity.showV2046InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046induced
    FeaturePrefsStore.batch2041.v2046induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2046: influenced mode
internal fun PlayerActivity.showV2046InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046influenced
    FeaturePrefsStore.batch2041.v2046influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2046: informed mode
internal fun PlayerActivity.showV2046InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2046informed
    FeaturePrefsStore.batch2041.v2046informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2047: illustrated mode
internal fun PlayerActivity.showV2047IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047illustrated
    FeaturePrefsStore.batch2041.v2047illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2047: imagined mode
internal fun PlayerActivity.showV2047ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047imagined
    FeaturePrefsStore.batch2041.v2047imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2047: immunized mode
internal fun PlayerActivity.showV2047ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047immunized
    FeaturePrefsStore.batch2041.v2047immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2047: implemented mode
internal fun PlayerActivity.showV2047ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047implemented
    FeaturePrefsStore.batch2041.v2047implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2047: implied mode
internal fun PlayerActivity.showV2047ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047implied
    FeaturePrefsStore.batch2041.v2047implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2047: imported level
internal fun PlayerActivity.showV2047ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2047imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2047imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2047: imposed level
internal fun PlayerActivity.showV2047ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2047imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2047imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2047: impressed level
internal fun PlayerActivity.showV2047ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2047impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2047impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2047: improved level
internal fun PlayerActivity.showV2047ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2047improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2047improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2047: included level
internal fun PlayerActivity.showV2047IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2047included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2047included = value
        AppToast.show(this, "included: $value")
    }
}

// v2047: increased mode
internal fun PlayerActivity.showV2047IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047increased
    FeaturePrefsStore.batch2041.v2047increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2047: indicated mode
internal fun PlayerActivity.showV2047IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047indicated
    FeaturePrefsStore.batch2041.v2047indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2047: induced mode
internal fun PlayerActivity.showV2047InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047induced
    FeaturePrefsStore.batch2041.v2047induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2047: influenced mode
internal fun PlayerActivity.showV2047InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047influenced
    FeaturePrefsStore.batch2041.v2047influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2047: informed mode
internal fun PlayerActivity.showV2047InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2047informed
    FeaturePrefsStore.batch2041.v2047informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2048: illustrated mode
internal fun PlayerActivity.showV2048IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048illustrated
    FeaturePrefsStore.batch2041.v2048illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2048: imagined mode
internal fun PlayerActivity.showV2048ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048imagined
    FeaturePrefsStore.batch2041.v2048imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2048: immunized mode
internal fun PlayerActivity.showV2048ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048immunized
    FeaturePrefsStore.batch2041.v2048immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2048: implemented mode
internal fun PlayerActivity.showV2048ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048implemented
    FeaturePrefsStore.batch2041.v2048implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2048: implied mode
internal fun PlayerActivity.showV2048ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048implied
    FeaturePrefsStore.batch2041.v2048implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2048: imported level
internal fun PlayerActivity.showV2048ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2048imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2048imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2048: imposed level
internal fun PlayerActivity.showV2048ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2048imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2048imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2048: impressed level
internal fun PlayerActivity.showV2048ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2048impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2048impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2048: improved level
internal fun PlayerActivity.showV2048ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2048improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2048improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2048: included level
internal fun PlayerActivity.showV2048IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2048included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2048included = value
        AppToast.show(this, "included: $value")
    }
}

// v2048: increased mode
internal fun PlayerActivity.showV2048IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048increased
    FeaturePrefsStore.batch2041.v2048increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2048: indicated mode
internal fun PlayerActivity.showV2048IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048indicated
    FeaturePrefsStore.batch2041.v2048indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2048: induced mode
internal fun PlayerActivity.showV2048InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048induced
    FeaturePrefsStore.batch2041.v2048induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2048: influenced mode
internal fun PlayerActivity.showV2048InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048influenced
    FeaturePrefsStore.batch2041.v2048influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2048: informed mode
internal fun PlayerActivity.showV2048InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2048informed
    FeaturePrefsStore.batch2041.v2048informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2049: illustrated mode
internal fun PlayerActivity.showV2049IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049illustrated
    FeaturePrefsStore.batch2041.v2049illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2049: imagined mode
internal fun PlayerActivity.showV2049ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049imagined
    FeaturePrefsStore.batch2041.v2049imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2049: immunized mode
internal fun PlayerActivity.showV2049ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049immunized
    FeaturePrefsStore.batch2041.v2049immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2049: implemented mode
internal fun PlayerActivity.showV2049ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049implemented
    FeaturePrefsStore.batch2041.v2049implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2049: implied mode
internal fun PlayerActivity.showV2049ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049implied
    FeaturePrefsStore.batch2041.v2049implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2049: imported level
internal fun PlayerActivity.showV2049ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2049imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2049imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2049: imposed level
internal fun PlayerActivity.showV2049ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2049imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2049imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2049: impressed level
internal fun PlayerActivity.showV2049ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2049impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2049impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2049: improved level
internal fun PlayerActivity.showV2049ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2049improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2049improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2049: included level
internal fun PlayerActivity.showV2049IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2049included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2049included = value
        AppToast.show(this, "included: $value")
    }
}

// v2049: increased mode
internal fun PlayerActivity.showV2049IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049increased
    FeaturePrefsStore.batch2041.v2049increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2049: indicated mode
internal fun PlayerActivity.showV2049IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049indicated
    FeaturePrefsStore.batch2041.v2049indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2049: induced mode
internal fun PlayerActivity.showV2049InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049induced
    FeaturePrefsStore.batch2041.v2049induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2049: influenced mode
internal fun PlayerActivity.showV2049InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049influenced
    FeaturePrefsStore.batch2041.v2049influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2049: informed mode
internal fun PlayerActivity.showV2049InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2049informed
    FeaturePrefsStore.batch2041.v2049informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

// v2050: illustrated mode
internal fun PlayerActivity.showV2050IllustratedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050illustrated
    FeaturePrefsStore.batch2041.v2050illustrated = !current
    AppToast.show(this, "illustrated: ${if (!current) "ON" else "OFF"}")
}

// v2050: imagined mode
internal fun PlayerActivity.showV2050ImaginedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050imagined
    FeaturePrefsStore.batch2041.v2050imagined = !current
    AppToast.show(this, "imagined: ${if (!current) "ON" else "OFF"}")
}

// v2050: immunized mode
internal fun PlayerActivity.showV2050ImmunizedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050immunized
    FeaturePrefsStore.batch2041.v2050immunized = !current
    AppToast.show(this, "immunized: ${if (!current) "ON" else "OFF"}")
}

// v2050: implemented mode
internal fun PlayerActivity.showV2050ImplementedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050implemented
    FeaturePrefsStore.batch2041.v2050implemented = !current
    AppToast.show(this, "implemented: ${if (!current) "ON" else "OFF"}")
}

// v2050: implied mode
internal fun PlayerActivity.showV2050ImpliedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050implied
    FeaturePrefsStore.batch2041.v2050implied = !current
    AppToast.show(this, "implied: ${if (!current) "ON" else "OFF"}")
}

// v2050: imported level
internal fun PlayerActivity.showV2050ImportedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2050imported).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imported level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2050imported = value
        AppToast.show(this, "imported: $value")
    }
}

// v2050: imposed level
internal fun PlayerActivity.showV2050ImposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2050imposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "imposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2050imposed = value
        AppToast.show(this, "imposed: $value")
    }
}

// v2050: impressed level
internal fun PlayerActivity.showV2050ImpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2050impressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2050impressed = value
        AppToast.show(this, "impressed: $value")
    }
}

// v2050: improved level
internal fun PlayerActivity.showV2050ImprovedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2050improved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2050improved = value
        AppToast.show(this, "improved: $value")
    }
}

// v2050: included level
internal fun PlayerActivity.showV2050IncludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2041.v2050included).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "included level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2041.v2050included = value
        AppToast.show(this, "included: $value")
    }
}

// v2050: increased mode
internal fun PlayerActivity.showV2050IncreasedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050increased
    FeaturePrefsStore.batch2041.v2050increased = !current
    AppToast.show(this, "increased: ${if (!current) "ON" else "OFF"}")
}

// v2050: indicated mode
internal fun PlayerActivity.showV2050IndicatedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050indicated
    FeaturePrefsStore.batch2041.v2050indicated = !current
    AppToast.show(this, "indicated: ${if (!current) "ON" else "OFF"}")
}

// v2050: induced mode
internal fun PlayerActivity.showV2050InducedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050induced
    FeaturePrefsStore.batch2041.v2050induced = !current
    AppToast.show(this, "induced: ${if (!current) "ON" else "OFF"}")
}

// v2050: influenced mode
internal fun PlayerActivity.showV2050InfluencedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050influenced
    FeaturePrefsStore.batch2041.v2050influenced = !current
    AppToast.show(this, "influenced: ${if (!current) "ON" else "OFF"}")
}

// v2050: informed mode
internal fun PlayerActivity.showV2050InformedToggle() {
    val current = FeaturePrefsStore.batch2041.v2050informed
    FeaturePrefsStore.batch2041.v2050informed = !current
    AppToast.show(this, "informed: ${if (!current) "ON" else "OFF"}")
}

