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

// v2051: inherited mode
internal fun PlayerActivity.showV2051InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051inherited
    FeaturePrefsStore.batch2051.v2051inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2051: initialized mode
internal fun PlayerActivity.showV2051InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051initialized
    FeaturePrefsStore.batch2051.v2051initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2051: injected mode
internal fun PlayerActivity.showV2051InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051injected
    FeaturePrefsStore.batch2051.v2051injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2051: innovated mode
internal fun PlayerActivity.showV2051InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051innovated
    FeaturePrefsStore.batch2051.v2051innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2051: inputted mode
internal fun PlayerActivity.showV2051InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051inputted
    FeaturePrefsStore.batch2051.v2051inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2051: inspected level
internal fun PlayerActivity.showV2051InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2051inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2051inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2051: inspired level
internal fun PlayerActivity.showV2051InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2051inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2051inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2051: installed level
internal fun PlayerActivity.showV2051InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2051installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2051installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2051: instituted level
internal fun PlayerActivity.showV2051InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2051instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2051instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2051: instructed level
internal fun PlayerActivity.showV2051InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2051instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2051instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2051: insured mode
internal fun PlayerActivity.showV2051InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2051insured
    FeaturePrefsStore.batch2051.v2051insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2051: integrated mode
internal fun PlayerActivity.showV2051IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051integrated
    FeaturePrefsStore.batch2051.v2051integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2051: intended mode
internal fun PlayerActivity.showV2051IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051intended
    FeaturePrefsStore.batch2051.v2051intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2051: intensified mode
internal fun PlayerActivity.showV2051IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051intensified
    FeaturePrefsStore.batch2051.v2051intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2051: interacted mode
internal fun PlayerActivity.showV2051InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2051interacted
    FeaturePrefsStore.batch2051.v2051interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2052: inherited mode
internal fun PlayerActivity.showV2052InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052inherited
    FeaturePrefsStore.batch2051.v2052inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2052: initialized mode
internal fun PlayerActivity.showV2052InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052initialized
    FeaturePrefsStore.batch2051.v2052initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2052: injected mode
internal fun PlayerActivity.showV2052InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052injected
    FeaturePrefsStore.batch2051.v2052injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2052: innovated mode
internal fun PlayerActivity.showV2052InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052innovated
    FeaturePrefsStore.batch2051.v2052innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2052: inputted mode
internal fun PlayerActivity.showV2052InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052inputted
    FeaturePrefsStore.batch2051.v2052inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2052: inspected level
internal fun PlayerActivity.showV2052InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2052inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2052inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2052: inspired level
internal fun PlayerActivity.showV2052InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2052inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2052inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2052: installed level
internal fun PlayerActivity.showV2052InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2052installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2052installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2052: instituted level
internal fun PlayerActivity.showV2052InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2052instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2052instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2052: instructed level
internal fun PlayerActivity.showV2052InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2052instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2052instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2052: insured mode
internal fun PlayerActivity.showV2052InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2052insured
    FeaturePrefsStore.batch2051.v2052insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2052: integrated mode
internal fun PlayerActivity.showV2052IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052integrated
    FeaturePrefsStore.batch2051.v2052integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2052: intended mode
internal fun PlayerActivity.showV2052IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052intended
    FeaturePrefsStore.batch2051.v2052intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2052: intensified mode
internal fun PlayerActivity.showV2052IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052intensified
    FeaturePrefsStore.batch2051.v2052intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2052: interacted mode
internal fun PlayerActivity.showV2052InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2052interacted
    FeaturePrefsStore.batch2051.v2052interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2053: inherited mode
internal fun PlayerActivity.showV2053InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053inherited
    FeaturePrefsStore.batch2051.v2053inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2053: initialized mode
internal fun PlayerActivity.showV2053InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053initialized
    FeaturePrefsStore.batch2051.v2053initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2053: injected mode
internal fun PlayerActivity.showV2053InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053injected
    FeaturePrefsStore.batch2051.v2053injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2053: innovated mode
internal fun PlayerActivity.showV2053InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053innovated
    FeaturePrefsStore.batch2051.v2053innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2053: inputted mode
internal fun PlayerActivity.showV2053InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053inputted
    FeaturePrefsStore.batch2051.v2053inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2053: inspected level
internal fun PlayerActivity.showV2053InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2053inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2053inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2053: inspired level
internal fun PlayerActivity.showV2053InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2053inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2053inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2053: installed level
internal fun PlayerActivity.showV2053InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2053installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2053installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2053: instituted level
internal fun PlayerActivity.showV2053InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2053instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2053instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2053: instructed level
internal fun PlayerActivity.showV2053InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2053instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2053instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2053: insured mode
internal fun PlayerActivity.showV2053InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2053insured
    FeaturePrefsStore.batch2051.v2053insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2053: integrated mode
internal fun PlayerActivity.showV2053IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053integrated
    FeaturePrefsStore.batch2051.v2053integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2053: intended mode
internal fun PlayerActivity.showV2053IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053intended
    FeaturePrefsStore.batch2051.v2053intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2053: intensified mode
internal fun PlayerActivity.showV2053IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053intensified
    FeaturePrefsStore.batch2051.v2053intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2053: interacted mode
internal fun PlayerActivity.showV2053InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2053interacted
    FeaturePrefsStore.batch2051.v2053interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2054: inherited mode
internal fun PlayerActivity.showV2054InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054inherited
    FeaturePrefsStore.batch2051.v2054inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2054: initialized mode
internal fun PlayerActivity.showV2054InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054initialized
    FeaturePrefsStore.batch2051.v2054initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2054: injected mode
internal fun PlayerActivity.showV2054InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054injected
    FeaturePrefsStore.batch2051.v2054injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2054: innovated mode
internal fun PlayerActivity.showV2054InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054innovated
    FeaturePrefsStore.batch2051.v2054innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2054: inputted mode
internal fun PlayerActivity.showV2054InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054inputted
    FeaturePrefsStore.batch2051.v2054inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2054: inspected level
internal fun PlayerActivity.showV2054InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2054inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2054inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2054: inspired level
internal fun PlayerActivity.showV2054InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2054inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2054inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2054: installed level
internal fun PlayerActivity.showV2054InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2054installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2054installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2054: instituted level
internal fun PlayerActivity.showV2054InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2054instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2054instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2054: instructed level
internal fun PlayerActivity.showV2054InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2054instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2054instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2054: insured mode
internal fun PlayerActivity.showV2054InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2054insured
    FeaturePrefsStore.batch2051.v2054insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2054: integrated mode
internal fun PlayerActivity.showV2054IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054integrated
    FeaturePrefsStore.batch2051.v2054integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2054: intended mode
internal fun PlayerActivity.showV2054IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054intended
    FeaturePrefsStore.batch2051.v2054intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2054: intensified mode
internal fun PlayerActivity.showV2054IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054intensified
    FeaturePrefsStore.batch2051.v2054intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2054: interacted mode
internal fun PlayerActivity.showV2054InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2054interacted
    FeaturePrefsStore.batch2051.v2054interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2055: inherited mode
internal fun PlayerActivity.showV2055InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055inherited
    FeaturePrefsStore.batch2051.v2055inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2055: initialized mode
internal fun PlayerActivity.showV2055InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055initialized
    FeaturePrefsStore.batch2051.v2055initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2055: injected mode
internal fun PlayerActivity.showV2055InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055injected
    FeaturePrefsStore.batch2051.v2055injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2055: innovated mode
internal fun PlayerActivity.showV2055InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055innovated
    FeaturePrefsStore.batch2051.v2055innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2055: inputted mode
internal fun PlayerActivity.showV2055InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055inputted
    FeaturePrefsStore.batch2051.v2055inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2055: inspected level
internal fun PlayerActivity.showV2055InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2055inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2055inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2055: inspired level
internal fun PlayerActivity.showV2055InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2055inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2055inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2055: installed level
internal fun PlayerActivity.showV2055InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2055installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2055installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2055: instituted level
internal fun PlayerActivity.showV2055InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2055instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2055instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2055: instructed level
internal fun PlayerActivity.showV2055InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2055instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2055instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2055: insured mode
internal fun PlayerActivity.showV2055InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2055insured
    FeaturePrefsStore.batch2051.v2055insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2055: integrated mode
internal fun PlayerActivity.showV2055IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055integrated
    FeaturePrefsStore.batch2051.v2055integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2055: intended mode
internal fun PlayerActivity.showV2055IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055intended
    FeaturePrefsStore.batch2051.v2055intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2055: intensified mode
internal fun PlayerActivity.showV2055IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055intensified
    FeaturePrefsStore.batch2051.v2055intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2055: interacted mode
internal fun PlayerActivity.showV2055InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2055interacted
    FeaturePrefsStore.batch2051.v2055interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2056: inherited mode
internal fun PlayerActivity.showV2056InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056inherited
    FeaturePrefsStore.batch2051.v2056inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2056: initialized mode
internal fun PlayerActivity.showV2056InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056initialized
    FeaturePrefsStore.batch2051.v2056initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2056: injected mode
internal fun PlayerActivity.showV2056InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056injected
    FeaturePrefsStore.batch2051.v2056injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2056: innovated mode
internal fun PlayerActivity.showV2056InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056innovated
    FeaturePrefsStore.batch2051.v2056innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2056: inputted mode
internal fun PlayerActivity.showV2056InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056inputted
    FeaturePrefsStore.batch2051.v2056inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2056: inspected level
internal fun PlayerActivity.showV2056InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2056inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2056inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2056: inspired level
internal fun PlayerActivity.showV2056InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2056inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2056inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2056: installed level
internal fun PlayerActivity.showV2056InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2056installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2056installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2056: instituted level
internal fun PlayerActivity.showV2056InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2056instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2056instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2056: instructed level
internal fun PlayerActivity.showV2056InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2056instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2056instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2056: insured mode
internal fun PlayerActivity.showV2056InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2056insured
    FeaturePrefsStore.batch2051.v2056insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2056: integrated mode
internal fun PlayerActivity.showV2056IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056integrated
    FeaturePrefsStore.batch2051.v2056integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2056: intended mode
internal fun PlayerActivity.showV2056IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056intended
    FeaturePrefsStore.batch2051.v2056intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2056: intensified mode
internal fun PlayerActivity.showV2056IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056intensified
    FeaturePrefsStore.batch2051.v2056intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2056: interacted mode
internal fun PlayerActivity.showV2056InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2056interacted
    FeaturePrefsStore.batch2051.v2056interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2057: inherited mode
internal fun PlayerActivity.showV2057InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057inherited
    FeaturePrefsStore.batch2051.v2057inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2057: initialized mode
internal fun PlayerActivity.showV2057InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057initialized
    FeaturePrefsStore.batch2051.v2057initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2057: injected mode
internal fun PlayerActivity.showV2057InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057injected
    FeaturePrefsStore.batch2051.v2057injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2057: innovated mode
internal fun PlayerActivity.showV2057InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057innovated
    FeaturePrefsStore.batch2051.v2057innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2057: inputted mode
internal fun PlayerActivity.showV2057InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057inputted
    FeaturePrefsStore.batch2051.v2057inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2057: inspected level
internal fun PlayerActivity.showV2057InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2057inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2057inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2057: inspired level
internal fun PlayerActivity.showV2057InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2057inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2057inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2057: installed level
internal fun PlayerActivity.showV2057InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2057installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2057installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2057: instituted level
internal fun PlayerActivity.showV2057InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2057instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2057instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2057: instructed level
internal fun PlayerActivity.showV2057InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2057instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2057instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2057: insured mode
internal fun PlayerActivity.showV2057InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2057insured
    FeaturePrefsStore.batch2051.v2057insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2057: integrated mode
internal fun PlayerActivity.showV2057IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057integrated
    FeaturePrefsStore.batch2051.v2057integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2057: intended mode
internal fun PlayerActivity.showV2057IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057intended
    FeaturePrefsStore.batch2051.v2057intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2057: intensified mode
internal fun PlayerActivity.showV2057IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057intensified
    FeaturePrefsStore.batch2051.v2057intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2057: interacted mode
internal fun PlayerActivity.showV2057InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2057interacted
    FeaturePrefsStore.batch2051.v2057interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2058: inherited mode
internal fun PlayerActivity.showV2058InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058inherited
    FeaturePrefsStore.batch2051.v2058inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2058: initialized mode
internal fun PlayerActivity.showV2058InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058initialized
    FeaturePrefsStore.batch2051.v2058initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2058: injected mode
internal fun PlayerActivity.showV2058InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058injected
    FeaturePrefsStore.batch2051.v2058injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2058: innovated mode
internal fun PlayerActivity.showV2058InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058innovated
    FeaturePrefsStore.batch2051.v2058innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2058: inputted mode
internal fun PlayerActivity.showV2058InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058inputted
    FeaturePrefsStore.batch2051.v2058inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2058: inspected level
internal fun PlayerActivity.showV2058InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2058inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2058inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2058: inspired level
internal fun PlayerActivity.showV2058InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2058inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2058inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2058: installed level
internal fun PlayerActivity.showV2058InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2058installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2058installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2058: instituted level
internal fun PlayerActivity.showV2058InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2058instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2058instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2058: instructed level
internal fun PlayerActivity.showV2058InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2058instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2058instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2058: insured mode
internal fun PlayerActivity.showV2058InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2058insured
    FeaturePrefsStore.batch2051.v2058insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2058: integrated mode
internal fun PlayerActivity.showV2058IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058integrated
    FeaturePrefsStore.batch2051.v2058integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2058: intended mode
internal fun PlayerActivity.showV2058IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058intended
    FeaturePrefsStore.batch2051.v2058intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2058: intensified mode
internal fun PlayerActivity.showV2058IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058intensified
    FeaturePrefsStore.batch2051.v2058intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2058: interacted mode
internal fun PlayerActivity.showV2058InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2058interacted
    FeaturePrefsStore.batch2051.v2058interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2059: inherited mode
internal fun PlayerActivity.showV2059InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059inherited
    FeaturePrefsStore.batch2051.v2059inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2059: initialized mode
internal fun PlayerActivity.showV2059InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059initialized
    FeaturePrefsStore.batch2051.v2059initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2059: injected mode
internal fun PlayerActivity.showV2059InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059injected
    FeaturePrefsStore.batch2051.v2059injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2059: innovated mode
internal fun PlayerActivity.showV2059InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059innovated
    FeaturePrefsStore.batch2051.v2059innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2059: inputted mode
internal fun PlayerActivity.showV2059InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059inputted
    FeaturePrefsStore.batch2051.v2059inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2059: inspected level
internal fun PlayerActivity.showV2059InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2059inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2059inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2059: inspired level
internal fun PlayerActivity.showV2059InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2059inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2059inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2059: installed level
internal fun PlayerActivity.showV2059InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2059installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2059installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2059: instituted level
internal fun PlayerActivity.showV2059InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2059instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2059instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2059: instructed level
internal fun PlayerActivity.showV2059InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2059instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2059instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2059: insured mode
internal fun PlayerActivity.showV2059InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2059insured
    FeaturePrefsStore.batch2051.v2059insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2059: integrated mode
internal fun PlayerActivity.showV2059IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059integrated
    FeaturePrefsStore.batch2051.v2059integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2059: intended mode
internal fun PlayerActivity.showV2059IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059intended
    FeaturePrefsStore.batch2051.v2059intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2059: intensified mode
internal fun PlayerActivity.showV2059IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059intensified
    FeaturePrefsStore.batch2051.v2059intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2059: interacted mode
internal fun PlayerActivity.showV2059InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2059interacted
    FeaturePrefsStore.batch2051.v2059interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2060: inherited mode
internal fun PlayerActivity.showV2060InheritedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060inherited
    FeaturePrefsStore.batch2051.v2060inherited = !current
    AppToast.show(this, "inherited: ${if (!current) "ON" else "OFF"}")
}

// v2060: initialized mode
internal fun PlayerActivity.showV2060InitializedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060initialized
    FeaturePrefsStore.batch2051.v2060initialized = !current
    AppToast.show(this, "initialized: ${if (!current) "ON" else "OFF"}")
}

// v2060: injected mode
internal fun PlayerActivity.showV2060InjectedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060injected
    FeaturePrefsStore.batch2051.v2060injected = !current
    AppToast.show(this, "injected: ${if (!current) "ON" else "OFF"}")
}

// v2060: innovated mode
internal fun PlayerActivity.showV2060InnovatedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060innovated
    FeaturePrefsStore.batch2051.v2060innovated = !current
    AppToast.show(this, "innovated: ${if (!current) "ON" else "OFF"}")
}

// v2060: inputted mode
internal fun PlayerActivity.showV2060InputtedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060inputted
    FeaturePrefsStore.batch2051.v2060inputted = !current
    AppToast.show(this, "inputted: ${if (!current) "ON" else "OFF"}")
}

// v2060: inspected level
internal fun PlayerActivity.showV2060InspectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2060inspected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2060inspected = value
        AppToast.show(this, "inspected: $value")
    }
}

// v2060: inspired level
internal fun PlayerActivity.showV2060InspiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2060inspired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2060inspired = value
        AppToast.show(this, "inspired: $value")
    }
}

// v2060: installed level
internal fun PlayerActivity.showV2060InstalledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2060installed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "installed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2060installed = value
        AppToast.show(this, "installed: $value")
    }
}

// v2060: instituted level
internal fun PlayerActivity.showV2060InstitutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2060instituted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instituted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2060instituted = value
        AppToast.show(this, "instituted: $value")
    }
}

// v2060: instructed level
internal fun PlayerActivity.showV2060InstructedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2051.v2060instructed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instructed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2051.v2060instructed = value
        AppToast.show(this, "instructed: $value")
    }
}

// v2060: insured mode
internal fun PlayerActivity.showV2060InsuredToggle() {
    val current = FeaturePrefsStore.batch2051.v2060insured
    FeaturePrefsStore.batch2051.v2060insured = !current
    AppToast.show(this, "insured: ${if (!current) "ON" else "OFF"}")
}

// v2060: integrated mode
internal fun PlayerActivity.showV2060IntegratedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060integrated
    FeaturePrefsStore.batch2051.v2060integrated = !current
    AppToast.show(this, "integrated: ${if (!current) "ON" else "OFF"}")
}

// v2060: intended mode
internal fun PlayerActivity.showV2060IntendedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060intended
    FeaturePrefsStore.batch2051.v2060intended = !current
    AppToast.show(this, "intended: ${if (!current) "ON" else "OFF"}")
}

// v2060: intensified mode
internal fun PlayerActivity.showV2060IntensifiedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060intensified
    FeaturePrefsStore.batch2051.v2060intensified = !current
    AppToast.show(this, "intensified: ${if (!current) "ON" else "OFF"}")
}

// v2060: interacted mode
internal fun PlayerActivity.showV2060InteractedToggle() {
    val current = FeaturePrefsStore.batch2051.v2060interacted
    FeaturePrefsStore.batch2051.v2060interacted = !current
    AppToast.show(this, "interacted: ${if (!current) "ON" else "OFF"}")
}

// v2061: interested mode
internal fun PlayerActivity.showV2061InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interested
    FeaturePrefsStore.batch2061.v2061interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2061: interpreted mode
internal fun PlayerActivity.showV2061InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interpreted
    FeaturePrefsStore.batch2061.v2061interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2061: interrupted mode
internal fun PlayerActivity.showV2061InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interrupted
    FeaturePrefsStore.batch2061.v2061interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2061: introduced mode
internal fun PlayerActivity.showV2061IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061introduced
    FeaturePrefsStore.batch2061.v2061introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2061: invented mode
internal fun PlayerActivity.showV2061InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061invented
    FeaturePrefsStore.batch2061.v2061invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2061: invested level
internal fun PlayerActivity.showV2061InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2061: investigated level
internal fun PlayerActivity.showV2061InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2061: invited level
internal fun PlayerActivity.showV2061InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2061: involved level
internal fun PlayerActivity.showV2061InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2061: isolated level
internal fun PlayerActivity.showV2061IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2061: issued mode
internal fun PlayerActivity.showV2061IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061issued
    FeaturePrefsStore.batch2061.v2061issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2061: justified mode
internal fun PlayerActivity.showV2061JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061justified
    FeaturePrefsStore.batch2061.v2061justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2061: kept mode
internal fun PlayerActivity.showV2061KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2061kept
    FeaturePrefsStore.batch2061.v2061kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2061: keyed mode
internal fun PlayerActivity.showV2061KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061keyed
    FeaturePrefsStore.batch2061.v2061keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2061: kicked mode
internal fun PlayerActivity.showV2061KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061kicked
    FeaturePrefsStore.batch2061.v2061kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2062: interested mode
internal fun PlayerActivity.showV2062InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interested
    FeaturePrefsStore.batch2061.v2062interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2062: interpreted mode
internal fun PlayerActivity.showV2062InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interpreted
    FeaturePrefsStore.batch2061.v2062interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2062: interrupted mode
internal fun PlayerActivity.showV2062InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interrupted
    FeaturePrefsStore.batch2061.v2062interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2062: introduced mode
internal fun PlayerActivity.showV2062IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062introduced
    FeaturePrefsStore.batch2061.v2062introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2062: invented mode
internal fun PlayerActivity.showV2062InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062invented
    FeaturePrefsStore.batch2061.v2062invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2062: invested level
internal fun PlayerActivity.showV2062InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2062: investigated level
internal fun PlayerActivity.showV2062InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2062: invited level
internal fun PlayerActivity.showV2062InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2062: involved level
internal fun PlayerActivity.showV2062InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2062: isolated level
internal fun PlayerActivity.showV2062IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2062: issued mode
internal fun PlayerActivity.showV2062IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062issued
    FeaturePrefsStore.batch2061.v2062issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2062: justified mode
internal fun PlayerActivity.showV2062JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062justified
    FeaturePrefsStore.batch2061.v2062justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2062: kept mode
internal fun PlayerActivity.showV2062KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2062kept
    FeaturePrefsStore.batch2061.v2062kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2062: keyed mode
internal fun PlayerActivity.showV2062KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062keyed
    FeaturePrefsStore.batch2061.v2062keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2062: kicked mode
internal fun PlayerActivity.showV2062KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062kicked
    FeaturePrefsStore.batch2061.v2062kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2063: interested mode
internal fun PlayerActivity.showV2063InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interested
    FeaturePrefsStore.batch2061.v2063interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2063: interpreted mode
internal fun PlayerActivity.showV2063InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interpreted
    FeaturePrefsStore.batch2061.v2063interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2063: interrupted mode
internal fun PlayerActivity.showV2063InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interrupted
    FeaturePrefsStore.batch2061.v2063interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2063: introduced mode
internal fun PlayerActivity.showV2063IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063introduced
    FeaturePrefsStore.batch2061.v2063introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2063: invented mode
internal fun PlayerActivity.showV2063InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063invented
    FeaturePrefsStore.batch2061.v2063invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2063: invested level
internal fun PlayerActivity.showV2063InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2063: investigated level
internal fun PlayerActivity.showV2063InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2063: invited level
internal fun PlayerActivity.showV2063InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2063: involved level
internal fun PlayerActivity.showV2063InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2063: isolated level
internal fun PlayerActivity.showV2063IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2063: issued mode
internal fun PlayerActivity.showV2063IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063issued
    FeaturePrefsStore.batch2061.v2063issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2063: justified mode
internal fun PlayerActivity.showV2063JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063justified
    FeaturePrefsStore.batch2061.v2063justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2063: kept mode
internal fun PlayerActivity.showV2063KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2063kept
    FeaturePrefsStore.batch2061.v2063kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2063: keyed mode
internal fun PlayerActivity.showV2063KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063keyed
    FeaturePrefsStore.batch2061.v2063keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2063: kicked mode
internal fun PlayerActivity.showV2063KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063kicked
    FeaturePrefsStore.batch2061.v2063kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2064: interested mode
internal fun PlayerActivity.showV2064InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interested
    FeaturePrefsStore.batch2061.v2064interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2064: interpreted mode
internal fun PlayerActivity.showV2064InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interpreted
    FeaturePrefsStore.batch2061.v2064interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2064: interrupted mode
internal fun PlayerActivity.showV2064InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interrupted
    FeaturePrefsStore.batch2061.v2064interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2064: introduced mode
internal fun PlayerActivity.showV2064IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064introduced
    FeaturePrefsStore.batch2061.v2064introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2064: invented mode
internal fun PlayerActivity.showV2064InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064invented
    FeaturePrefsStore.batch2061.v2064invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2064: invested level
internal fun PlayerActivity.showV2064InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2064: investigated level
internal fun PlayerActivity.showV2064InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2064: invited level
internal fun PlayerActivity.showV2064InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2064: involved level
internal fun PlayerActivity.showV2064InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2064: isolated level
internal fun PlayerActivity.showV2064IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2064: issued mode
internal fun PlayerActivity.showV2064IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064issued
    FeaturePrefsStore.batch2061.v2064issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2064: justified mode
internal fun PlayerActivity.showV2064JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064justified
    FeaturePrefsStore.batch2061.v2064justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2064: kept mode
internal fun PlayerActivity.showV2064KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2064kept
    FeaturePrefsStore.batch2061.v2064kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2064: keyed mode
internal fun PlayerActivity.showV2064KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064keyed
    FeaturePrefsStore.batch2061.v2064keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2064: kicked mode
internal fun PlayerActivity.showV2064KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064kicked
    FeaturePrefsStore.batch2061.v2064kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2065: interested mode
internal fun PlayerActivity.showV2065InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interested
    FeaturePrefsStore.batch2061.v2065interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2065: interpreted mode
internal fun PlayerActivity.showV2065InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interpreted
    FeaturePrefsStore.batch2061.v2065interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2065: interrupted mode
internal fun PlayerActivity.showV2065InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interrupted
    FeaturePrefsStore.batch2061.v2065interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2065: introduced mode
internal fun PlayerActivity.showV2065IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065introduced
    FeaturePrefsStore.batch2061.v2065introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2065: invented mode
internal fun PlayerActivity.showV2065InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065invented
    FeaturePrefsStore.batch2061.v2065invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2065: invested level
internal fun PlayerActivity.showV2065InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2065: investigated level
internal fun PlayerActivity.showV2065InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2065: invited level
internal fun PlayerActivity.showV2065InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2065: involved level
internal fun PlayerActivity.showV2065InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2065: isolated level
internal fun PlayerActivity.showV2065IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2065: issued mode
internal fun PlayerActivity.showV2065IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065issued
    FeaturePrefsStore.batch2061.v2065issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2065: justified mode
internal fun PlayerActivity.showV2065JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065justified
    FeaturePrefsStore.batch2061.v2065justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2065: kept mode
internal fun PlayerActivity.showV2065KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2065kept
    FeaturePrefsStore.batch2061.v2065kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2065: keyed mode
internal fun PlayerActivity.showV2065KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065keyed
    FeaturePrefsStore.batch2061.v2065keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2065: kicked mode
internal fun PlayerActivity.showV2065KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065kicked
    FeaturePrefsStore.batch2061.v2065kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2066: interested mode
internal fun PlayerActivity.showV2066InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interested
    FeaturePrefsStore.batch2061.v2066interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2066: interpreted mode
internal fun PlayerActivity.showV2066InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interpreted
    FeaturePrefsStore.batch2061.v2066interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2066: interrupted mode
internal fun PlayerActivity.showV2066InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interrupted
    FeaturePrefsStore.batch2061.v2066interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2066: introduced mode
internal fun PlayerActivity.showV2066IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066introduced
    FeaturePrefsStore.batch2061.v2066introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2066: invented mode
internal fun PlayerActivity.showV2066InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066invented
    FeaturePrefsStore.batch2061.v2066invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2066: invested level
internal fun PlayerActivity.showV2066InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2066: investigated level
internal fun PlayerActivity.showV2066InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2066: invited level
internal fun PlayerActivity.showV2066InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2066: involved level
internal fun PlayerActivity.showV2066InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2066: isolated level
internal fun PlayerActivity.showV2066IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2066: issued mode
internal fun PlayerActivity.showV2066IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066issued
    FeaturePrefsStore.batch2061.v2066issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2066: justified mode
internal fun PlayerActivity.showV2066JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066justified
    FeaturePrefsStore.batch2061.v2066justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2066: kept mode
internal fun PlayerActivity.showV2066KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2066kept
    FeaturePrefsStore.batch2061.v2066kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2066: keyed mode
internal fun PlayerActivity.showV2066KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066keyed
    FeaturePrefsStore.batch2061.v2066keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2066: kicked mode
internal fun PlayerActivity.showV2066KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066kicked
    FeaturePrefsStore.batch2061.v2066kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2067: interested mode
internal fun PlayerActivity.showV2067InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interested
    FeaturePrefsStore.batch2061.v2067interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2067: interpreted mode
internal fun PlayerActivity.showV2067InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interpreted
    FeaturePrefsStore.batch2061.v2067interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2067: interrupted mode
internal fun PlayerActivity.showV2067InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interrupted
    FeaturePrefsStore.batch2061.v2067interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2067: introduced mode
internal fun PlayerActivity.showV2067IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067introduced
    FeaturePrefsStore.batch2061.v2067introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2067: invented mode
internal fun PlayerActivity.showV2067InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067invented
    FeaturePrefsStore.batch2061.v2067invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2067: invested level
internal fun PlayerActivity.showV2067InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2067: investigated level
internal fun PlayerActivity.showV2067InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2067: invited level
internal fun PlayerActivity.showV2067InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2067: involved level
internal fun PlayerActivity.showV2067InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2067: isolated level
internal fun PlayerActivity.showV2067IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2067: issued mode
internal fun PlayerActivity.showV2067IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067issued
    FeaturePrefsStore.batch2061.v2067issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2067: justified mode
internal fun PlayerActivity.showV2067JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067justified
    FeaturePrefsStore.batch2061.v2067justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2067: kept mode
internal fun PlayerActivity.showV2067KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2067kept
    FeaturePrefsStore.batch2061.v2067kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2067: keyed mode
internal fun PlayerActivity.showV2067KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067keyed
    FeaturePrefsStore.batch2061.v2067keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2067: kicked mode
internal fun PlayerActivity.showV2067KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067kicked
    FeaturePrefsStore.batch2061.v2067kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2068: interested mode
internal fun PlayerActivity.showV2068InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interested
    FeaturePrefsStore.batch2061.v2068interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2068: interpreted mode
internal fun PlayerActivity.showV2068InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interpreted
    FeaturePrefsStore.batch2061.v2068interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2068: interrupted mode
internal fun PlayerActivity.showV2068InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interrupted
    FeaturePrefsStore.batch2061.v2068interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2068: introduced mode
internal fun PlayerActivity.showV2068IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068introduced
    FeaturePrefsStore.batch2061.v2068introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2068: invented mode
internal fun PlayerActivity.showV2068InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068invented
    FeaturePrefsStore.batch2061.v2068invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2068: invested level
internal fun PlayerActivity.showV2068InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2068: investigated level
internal fun PlayerActivity.showV2068InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2068: invited level
internal fun PlayerActivity.showV2068InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2068: involved level
internal fun PlayerActivity.showV2068InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2068: isolated level
internal fun PlayerActivity.showV2068IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2068: issued mode
internal fun PlayerActivity.showV2068IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068issued
    FeaturePrefsStore.batch2061.v2068issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2068: justified mode
internal fun PlayerActivity.showV2068JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068justified
    FeaturePrefsStore.batch2061.v2068justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2068: kept mode
internal fun PlayerActivity.showV2068KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2068kept
    FeaturePrefsStore.batch2061.v2068kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2068: keyed mode
internal fun PlayerActivity.showV2068KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068keyed
    FeaturePrefsStore.batch2061.v2068keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2068: kicked mode
internal fun PlayerActivity.showV2068KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068kicked
    FeaturePrefsStore.batch2061.v2068kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2069: interested mode
internal fun PlayerActivity.showV2069InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interested
    FeaturePrefsStore.batch2061.v2069interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2069: interpreted mode
internal fun PlayerActivity.showV2069InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interpreted
    FeaturePrefsStore.batch2061.v2069interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2069: interrupted mode
internal fun PlayerActivity.showV2069InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interrupted
    FeaturePrefsStore.batch2061.v2069interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2069: introduced mode
internal fun PlayerActivity.showV2069IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069introduced
    FeaturePrefsStore.batch2061.v2069introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2069: invented mode
internal fun PlayerActivity.showV2069InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069invented
    FeaturePrefsStore.batch2061.v2069invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2069: invested level
internal fun PlayerActivity.showV2069InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2069: investigated level
internal fun PlayerActivity.showV2069InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2069: invited level
internal fun PlayerActivity.showV2069InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2069: involved level
internal fun PlayerActivity.showV2069InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2069: isolated level
internal fun PlayerActivity.showV2069IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2069: issued mode
internal fun PlayerActivity.showV2069IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069issued
    FeaturePrefsStore.batch2061.v2069issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2069: justified mode
internal fun PlayerActivity.showV2069JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069justified
    FeaturePrefsStore.batch2061.v2069justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2069: kept mode
internal fun PlayerActivity.showV2069KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2069kept
    FeaturePrefsStore.batch2061.v2069kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2069: keyed mode
internal fun PlayerActivity.showV2069KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069keyed
    FeaturePrefsStore.batch2061.v2069keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2069: kicked mode
internal fun PlayerActivity.showV2069KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069kicked
    FeaturePrefsStore.batch2061.v2069kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2070: interested mode
internal fun PlayerActivity.showV2070InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interested
    FeaturePrefsStore.batch2061.v2070interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2070: interpreted mode
internal fun PlayerActivity.showV2070InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interpreted
    FeaturePrefsStore.batch2061.v2070interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2070: interrupted mode
internal fun PlayerActivity.showV2070InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interrupted
    FeaturePrefsStore.batch2061.v2070interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2070: introduced mode
internal fun PlayerActivity.showV2070IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070introduced
    FeaturePrefsStore.batch2061.v2070introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2070: invented mode
internal fun PlayerActivity.showV2070InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070invented
    FeaturePrefsStore.batch2061.v2070invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2070: invested level
internal fun PlayerActivity.showV2070InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2070: investigated level
internal fun PlayerActivity.showV2070InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2070: invited level
internal fun PlayerActivity.showV2070InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2070: involved level
internal fun PlayerActivity.showV2070InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2070: isolated level
internal fun PlayerActivity.showV2070IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2070: issued mode
internal fun PlayerActivity.showV2070IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070issued
    FeaturePrefsStore.batch2061.v2070issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2070: justified mode
internal fun PlayerActivity.showV2070JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070justified
    FeaturePrefsStore.batch2061.v2070justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2070: kept mode
internal fun PlayerActivity.showV2070KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2070kept
    FeaturePrefsStore.batch2061.v2070kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2070: keyed mode
internal fun PlayerActivity.showV2070KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070keyed
    FeaturePrefsStore.batch2061.v2070keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2070: kicked mode
internal fun PlayerActivity.showV2070KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070kicked
    FeaturePrefsStore.batch2061.v2070kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2071: killed mode
internal fun PlayerActivity.showV2071KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2071killed
    FeaturePrefsStore.batch2071.v2071killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2071: knocked mode
internal fun PlayerActivity.showV2071KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071knocked
    FeaturePrefsStore.batch2071.v2071knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2071: labeled mode
internal fun PlayerActivity.showV2071LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2071labeled
    FeaturePrefsStore.batch2071.v2071labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2071: landed mode
internal fun PlayerActivity.showV2071LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071landed
    FeaturePrefsStore.batch2071.v2071landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2071: launched mode
internal fun PlayerActivity.showV2071LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071launched
    FeaturePrefsStore.batch2071.v2071launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2071: layered level
internal fun PlayerActivity.showV2071LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2071: leaned level
internal fun PlayerActivity.showV2071LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2071: leaped level
internal fun PlayerActivity.showV2071LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2071: learned level
internal fun PlayerActivity.showV2071LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2071: leveraged level
internal fun PlayerActivity.showV2071LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2071: licensed mode
internal fun PlayerActivity.showV2071LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071licensed
    FeaturePrefsStore.batch2071.v2071licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2071: lifted mode
internal fun PlayerActivity.showV2071LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071lifted
    FeaturePrefsStore.batch2071.v2071lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2071: lighted mode
internal fun PlayerActivity.showV2071LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071lighted
    FeaturePrefsStore.batch2071.v2071lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2071: liked mode
internal fun PlayerActivity.showV2071LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071liked
    FeaturePrefsStore.batch2071.v2071liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2071: limited mode
internal fun PlayerActivity.showV2071LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071limited
    FeaturePrefsStore.batch2071.v2071limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2072: killed mode
internal fun PlayerActivity.showV2072KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2072killed
    FeaturePrefsStore.batch2071.v2072killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2072: knocked mode
internal fun PlayerActivity.showV2072KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072knocked
    FeaturePrefsStore.batch2071.v2072knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2072: labeled mode
internal fun PlayerActivity.showV2072LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2072labeled
    FeaturePrefsStore.batch2071.v2072labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2072: landed mode
internal fun PlayerActivity.showV2072LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072landed
    FeaturePrefsStore.batch2071.v2072landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2072: launched mode
internal fun PlayerActivity.showV2072LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072launched
    FeaturePrefsStore.batch2071.v2072launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2072: layered level
internal fun PlayerActivity.showV2072LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2072: leaned level
internal fun PlayerActivity.showV2072LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2072: leaped level
internal fun PlayerActivity.showV2072LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2072: learned level
internal fun PlayerActivity.showV2072LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2072: leveraged level
internal fun PlayerActivity.showV2072LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2072: licensed mode
internal fun PlayerActivity.showV2072LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072licensed
    FeaturePrefsStore.batch2071.v2072licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2072: lifted mode
internal fun PlayerActivity.showV2072LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072lifted
    FeaturePrefsStore.batch2071.v2072lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2072: lighted mode
internal fun PlayerActivity.showV2072LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072lighted
    FeaturePrefsStore.batch2071.v2072lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2072: liked mode
internal fun PlayerActivity.showV2072LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072liked
    FeaturePrefsStore.batch2071.v2072liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2072: limited mode
internal fun PlayerActivity.showV2072LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072limited
    FeaturePrefsStore.batch2071.v2072limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2073: killed mode
internal fun PlayerActivity.showV2073KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2073killed
    FeaturePrefsStore.batch2071.v2073killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2073: knocked mode
internal fun PlayerActivity.showV2073KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073knocked
    FeaturePrefsStore.batch2071.v2073knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2073: labeled mode
internal fun PlayerActivity.showV2073LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2073labeled
    FeaturePrefsStore.batch2071.v2073labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2073: landed mode
internal fun PlayerActivity.showV2073LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073landed
    FeaturePrefsStore.batch2071.v2073landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2073: launched mode
internal fun PlayerActivity.showV2073LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073launched
    FeaturePrefsStore.batch2071.v2073launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2073: layered level
internal fun PlayerActivity.showV2073LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2073: leaned level
internal fun PlayerActivity.showV2073LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2073: leaped level
internal fun PlayerActivity.showV2073LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2073: learned level
internal fun PlayerActivity.showV2073LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2073: leveraged level
internal fun PlayerActivity.showV2073LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2073: licensed mode
internal fun PlayerActivity.showV2073LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073licensed
    FeaturePrefsStore.batch2071.v2073licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2073: lifted mode
internal fun PlayerActivity.showV2073LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073lifted
    FeaturePrefsStore.batch2071.v2073lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2073: lighted mode
internal fun PlayerActivity.showV2073LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073lighted
    FeaturePrefsStore.batch2071.v2073lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2073: liked mode
internal fun PlayerActivity.showV2073LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073liked
    FeaturePrefsStore.batch2071.v2073liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2073: limited mode
internal fun PlayerActivity.showV2073LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073limited
    FeaturePrefsStore.batch2071.v2073limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2074: killed mode
internal fun PlayerActivity.showV2074KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2074killed
    FeaturePrefsStore.batch2071.v2074killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2074: knocked mode
internal fun PlayerActivity.showV2074KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074knocked
    FeaturePrefsStore.batch2071.v2074knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2074: labeled mode
internal fun PlayerActivity.showV2074LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2074labeled
    FeaturePrefsStore.batch2071.v2074labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2074: landed mode
internal fun PlayerActivity.showV2074LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074landed
    FeaturePrefsStore.batch2071.v2074landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2074: launched mode
internal fun PlayerActivity.showV2074LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074launched
    FeaturePrefsStore.batch2071.v2074launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2074: layered level
internal fun PlayerActivity.showV2074LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2074: leaned level
internal fun PlayerActivity.showV2074LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2074: leaped level
internal fun PlayerActivity.showV2074LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2074: learned level
internal fun PlayerActivity.showV2074LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2074: leveraged level
internal fun PlayerActivity.showV2074LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2074: licensed mode
internal fun PlayerActivity.showV2074LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074licensed
    FeaturePrefsStore.batch2071.v2074licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2074: lifted mode
internal fun PlayerActivity.showV2074LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074lifted
    FeaturePrefsStore.batch2071.v2074lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2074: lighted mode
internal fun PlayerActivity.showV2074LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074lighted
    FeaturePrefsStore.batch2071.v2074lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2074: liked mode
internal fun PlayerActivity.showV2074LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074liked
    FeaturePrefsStore.batch2071.v2074liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2074: limited mode
internal fun PlayerActivity.showV2074LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074limited
    FeaturePrefsStore.batch2071.v2074limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2075: killed mode
internal fun PlayerActivity.showV2075KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2075killed
    FeaturePrefsStore.batch2071.v2075killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2075: knocked mode
internal fun PlayerActivity.showV2075KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075knocked
    FeaturePrefsStore.batch2071.v2075knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2075: labeled mode
internal fun PlayerActivity.showV2075LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2075labeled
    FeaturePrefsStore.batch2071.v2075labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2075: landed mode
internal fun PlayerActivity.showV2075LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075landed
    FeaturePrefsStore.batch2071.v2075landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2075: launched mode
internal fun PlayerActivity.showV2075LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075launched
    FeaturePrefsStore.batch2071.v2075launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2075: layered level
internal fun PlayerActivity.showV2075LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2075: leaned level
internal fun PlayerActivity.showV2075LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2075: leaped level
internal fun PlayerActivity.showV2075LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2075: learned level
internal fun PlayerActivity.showV2075LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2075: leveraged level
internal fun PlayerActivity.showV2075LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2075: licensed mode
internal fun PlayerActivity.showV2075LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075licensed
    FeaturePrefsStore.batch2071.v2075licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2075: lifted mode
internal fun PlayerActivity.showV2075LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075lifted
    FeaturePrefsStore.batch2071.v2075lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2075: lighted mode
internal fun PlayerActivity.showV2075LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075lighted
    FeaturePrefsStore.batch2071.v2075lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2075: liked mode
internal fun PlayerActivity.showV2075LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075liked
    FeaturePrefsStore.batch2071.v2075liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2075: limited mode
internal fun PlayerActivity.showV2075LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075limited
    FeaturePrefsStore.batch2071.v2075limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2076: killed mode
internal fun PlayerActivity.showV2076KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2076killed
    FeaturePrefsStore.batch2071.v2076killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2076: knocked mode
internal fun PlayerActivity.showV2076KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076knocked
    FeaturePrefsStore.batch2071.v2076knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2076: labeled mode
internal fun PlayerActivity.showV2076LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2076labeled
    FeaturePrefsStore.batch2071.v2076labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2076: landed mode
internal fun PlayerActivity.showV2076LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076landed
    FeaturePrefsStore.batch2071.v2076landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2076: launched mode
internal fun PlayerActivity.showV2076LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076launched
    FeaturePrefsStore.batch2071.v2076launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2076: layered level
internal fun PlayerActivity.showV2076LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2076: leaned level
internal fun PlayerActivity.showV2076LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2076: leaped level
internal fun PlayerActivity.showV2076LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2076: learned level
internal fun PlayerActivity.showV2076LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2076: leveraged level
internal fun PlayerActivity.showV2076LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2076: licensed mode
internal fun PlayerActivity.showV2076LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076licensed
    FeaturePrefsStore.batch2071.v2076licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2076: lifted mode
internal fun PlayerActivity.showV2076LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076lifted
    FeaturePrefsStore.batch2071.v2076lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2076: lighted mode
internal fun PlayerActivity.showV2076LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076lighted
    FeaturePrefsStore.batch2071.v2076lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2076: liked mode
internal fun PlayerActivity.showV2076LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076liked
    FeaturePrefsStore.batch2071.v2076liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2076: limited mode
internal fun PlayerActivity.showV2076LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076limited
    FeaturePrefsStore.batch2071.v2076limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2077: killed mode
internal fun PlayerActivity.showV2077KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2077killed
    FeaturePrefsStore.batch2071.v2077killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2077: knocked mode
internal fun PlayerActivity.showV2077KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077knocked
    FeaturePrefsStore.batch2071.v2077knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2077: labeled mode
internal fun PlayerActivity.showV2077LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2077labeled
    FeaturePrefsStore.batch2071.v2077labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2077: landed mode
internal fun PlayerActivity.showV2077LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077landed
    FeaturePrefsStore.batch2071.v2077landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2077: launched mode
internal fun PlayerActivity.showV2077LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077launched
    FeaturePrefsStore.batch2071.v2077launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2077: layered level
internal fun PlayerActivity.showV2077LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2077: leaned level
internal fun PlayerActivity.showV2077LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2077: leaped level
internal fun PlayerActivity.showV2077LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2077: learned level
internal fun PlayerActivity.showV2077LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2077: leveraged level
internal fun PlayerActivity.showV2077LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2077: licensed mode
internal fun PlayerActivity.showV2077LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077licensed
    FeaturePrefsStore.batch2071.v2077licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2077: lifted mode
internal fun PlayerActivity.showV2077LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077lifted
    FeaturePrefsStore.batch2071.v2077lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2077: lighted mode
internal fun PlayerActivity.showV2077LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077lighted
    FeaturePrefsStore.batch2071.v2077lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2077: liked mode
internal fun PlayerActivity.showV2077LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077liked
    FeaturePrefsStore.batch2071.v2077liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2077: limited mode
internal fun PlayerActivity.showV2077LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077limited
    FeaturePrefsStore.batch2071.v2077limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2078: killed mode
internal fun PlayerActivity.showV2078KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2078killed
    FeaturePrefsStore.batch2071.v2078killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2078: knocked mode
internal fun PlayerActivity.showV2078KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078knocked
    FeaturePrefsStore.batch2071.v2078knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2078: labeled mode
internal fun PlayerActivity.showV2078LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2078labeled
    FeaturePrefsStore.batch2071.v2078labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2078: landed mode
internal fun PlayerActivity.showV2078LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078landed
    FeaturePrefsStore.batch2071.v2078landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2078: launched mode
internal fun PlayerActivity.showV2078LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078launched
    FeaturePrefsStore.batch2071.v2078launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2078: layered level
internal fun PlayerActivity.showV2078LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2078: leaned level
internal fun PlayerActivity.showV2078LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2078: leaped level
internal fun PlayerActivity.showV2078LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2078: learned level
internal fun PlayerActivity.showV2078LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2078: leveraged level
internal fun PlayerActivity.showV2078LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2078: licensed mode
internal fun PlayerActivity.showV2078LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078licensed
    FeaturePrefsStore.batch2071.v2078licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2078: lifted mode
internal fun PlayerActivity.showV2078LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078lifted
    FeaturePrefsStore.batch2071.v2078lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2078: lighted mode
internal fun PlayerActivity.showV2078LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078lighted
    FeaturePrefsStore.batch2071.v2078lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2078: liked mode
internal fun PlayerActivity.showV2078LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078liked
    FeaturePrefsStore.batch2071.v2078liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2078: limited mode
internal fun PlayerActivity.showV2078LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078limited
    FeaturePrefsStore.batch2071.v2078limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2079: killed mode
internal fun PlayerActivity.showV2079KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2079killed
    FeaturePrefsStore.batch2071.v2079killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2079: knocked mode
internal fun PlayerActivity.showV2079KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079knocked
    FeaturePrefsStore.batch2071.v2079knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2079: labeled mode
internal fun PlayerActivity.showV2079LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2079labeled
    FeaturePrefsStore.batch2071.v2079labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2079: landed mode
internal fun PlayerActivity.showV2079LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079landed
    FeaturePrefsStore.batch2071.v2079landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2079: launched mode
internal fun PlayerActivity.showV2079LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079launched
    FeaturePrefsStore.batch2071.v2079launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2079: layered level
internal fun PlayerActivity.showV2079LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2079: leaned level
internal fun PlayerActivity.showV2079LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2079: leaped level
internal fun PlayerActivity.showV2079LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2079: learned level
internal fun PlayerActivity.showV2079LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2079: leveraged level
internal fun PlayerActivity.showV2079LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2079: licensed mode
internal fun PlayerActivity.showV2079LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079licensed
    FeaturePrefsStore.batch2071.v2079licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2079: lifted mode
internal fun PlayerActivity.showV2079LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079lifted
    FeaturePrefsStore.batch2071.v2079lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2079: lighted mode
internal fun PlayerActivity.showV2079LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079lighted
    FeaturePrefsStore.batch2071.v2079lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2079: liked mode
internal fun PlayerActivity.showV2079LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079liked
    FeaturePrefsStore.batch2071.v2079liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2079: limited mode
internal fun PlayerActivity.showV2079LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079limited
    FeaturePrefsStore.batch2071.v2079limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2080: killed mode
internal fun PlayerActivity.showV2080KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2080killed
    FeaturePrefsStore.batch2071.v2080killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2080: knocked mode
internal fun PlayerActivity.showV2080KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080knocked
    FeaturePrefsStore.batch2071.v2080knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2080: labeled mode
internal fun PlayerActivity.showV2080LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2080labeled
    FeaturePrefsStore.batch2071.v2080labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2080: landed mode
internal fun PlayerActivity.showV2080LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080landed
    FeaturePrefsStore.batch2071.v2080landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2080: launched mode
internal fun PlayerActivity.showV2080LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080launched
    FeaturePrefsStore.batch2071.v2080launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2080: layered level
internal fun PlayerActivity.showV2080LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2080: leaned level
internal fun PlayerActivity.showV2080LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2080: leaped level
internal fun PlayerActivity.showV2080LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2080: learned level
internal fun PlayerActivity.showV2080LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2080: leveraged level
internal fun PlayerActivity.showV2080LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2080: licensed mode
internal fun PlayerActivity.showV2080LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080licensed
    FeaturePrefsStore.batch2071.v2080licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2080: lifted mode
internal fun PlayerActivity.showV2080LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080lifted
    FeaturePrefsStore.batch2071.v2080lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2080: lighted mode
internal fun PlayerActivity.showV2080LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080lighted
    FeaturePrefsStore.batch2071.v2080lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2080: liked mode
internal fun PlayerActivity.showV2080LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080liked
    FeaturePrefsStore.batch2071.v2080liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2080: limited mode
internal fun PlayerActivity.showV2080LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080limited
    FeaturePrefsStore.batch2071.v2080limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}
