package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1181: adapt mode
internal fun PlayerActivity.showV1181AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adapt
    FeaturePrefsStore.batch1181.v1181adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1181: adept mode
internal fun PlayerActivity.showV1181AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adept
    FeaturePrefsStore.batch1181.v1181adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1181: admit mode
internal fun PlayerActivity.showV1181AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1181admit
    FeaturePrefsStore.batch1181.v1181admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1181: adopt mode
internal fun PlayerActivity.showV1181AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adopt
    FeaturePrefsStore.batch1181.v1181adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1181: adult mode
internal fun PlayerActivity.showV1181AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adult
    FeaturePrefsStore.batch1181.v1181adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1181: advance level
internal fun PlayerActivity.showV1181AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1181: advice level
internal fun PlayerActivity.showV1181AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1181: aerial level
internal fun PlayerActivity.showV1181AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1181: affair level
internal fun PlayerActivity.showV1181AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1181: affect level
internal fun PlayerActivity.showV1181AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1181: afford mode
internal fun PlayerActivity.showV1181AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1181afford
    FeaturePrefsStore.batch1181.v1181afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1181: afield mode
internal fun PlayerActivity.showV1181AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1181afield
    FeaturePrefsStore.batch1181.v1181afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1181: age mode
internal fun PlayerActivity.showV1181AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1181age
    FeaturePrefsStore.batch1181.v1181age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1181: agency mode
internal fun PlayerActivity.showV1181AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1181agency
    FeaturePrefsStore.batch1181.v1181agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1181: agenda mode
internal fun PlayerActivity.showV1181AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1181agenda
    FeaturePrefsStore.batch1181.v1181agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1182: adapt mode
internal fun PlayerActivity.showV1182AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adapt
    FeaturePrefsStore.batch1181.v1182adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1182: adept mode
internal fun PlayerActivity.showV1182AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adept
    FeaturePrefsStore.batch1181.v1182adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1182: admit mode
internal fun PlayerActivity.showV1182AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1182admit
    FeaturePrefsStore.batch1181.v1182admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1182: adopt mode
internal fun PlayerActivity.showV1182AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adopt
    FeaturePrefsStore.batch1181.v1182adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1182: adult mode
internal fun PlayerActivity.showV1182AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adult
    FeaturePrefsStore.batch1181.v1182adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1182: advance level
internal fun PlayerActivity.showV1182AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1182: advice level
internal fun PlayerActivity.showV1182AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1182: aerial level
internal fun PlayerActivity.showV1182AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1182: affair level
internal fun PlayerActivity.showV1182AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1182: affect level
internal fun PlayerActivity.showV1182AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1182: afford mode
internal fun PlayerActivity.showV1182AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1182afford
    FeaturePrefsStore.batch1181.v1182afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1182: afield mode
internal fun PlayerActivity.showV1182AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1182afield
    FeaturePrefsStore.batch1181.v1182afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1182: age mode
internal fun PlayerActivity.showV1182AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1182age
    FeaturePrefsStore.batch1181.v1182age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1182: agency mode
internal fun PlayerActivity.showV1182AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1182agency
    FeaturePrefsStore.batch1181.v1182agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1182: agenda mode
internal fun PlayerActivity.showV1182AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1182agenda
    FeaturePrefsStore.batch1181.v1182agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1183: adapt mode
internal fun PlayerActivity.showV1183AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adapt
    FeaturePrefsStore.batch1181.v1183adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1183: adept mode
internal fun PlayerActivity.showV1183AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adept
    FeaturePrefsStore.batch1181.v1183adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1183: admit mode
internal fun PlayerActivity.showV1183AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1183admit
    FeaturePrefsStore.batch1181.v1183admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1183: adopt mode
internal fun PlayerActivity.showV1183AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adopt
    FeaturePrefsStore.batch1181.v1183adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1183: adult mode
internal fun PlayerActivity.showV1183AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adult
    FeaturePrefsStore.batch1181.v1183adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1183: advance level
internal fun PlayerActivity.showV1183AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1183: advice level
internal fun PlayerActivity.showV1183AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1183: aerial level
internal fun PlayerActivity.showV1183AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1183: affair level
internal fun PlayerActivity.showV1183AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1183: affect level
internal fun PlayerActivity.showV1183AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1183: afford mode
internal fun PlayerActivity.showV1183AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1183afford
    FeaturePrefsStore.batch1181.v1183afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1183: afield mode
internal fun PlayerActivity.showV1183AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1183afield
    FeaturePrefsStore.batch1181.v1183afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1183: age mode
internal fun PlayerActivity.showV1183AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1183age
    FeaturePrefsStore.batch1181.v1183age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1183: agency mode
internal fun PlayerActivity.showV1183AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1183agency
    FeaturePrefsStore.batch1181.v1183agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1183: agenda mode
internal fun PlayerActivity.showV1183AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1183agenda
    FeaturePrefsStore.batch1181.v1183agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1184: adapt mode
internal fun PlayerActivity.showV1184AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adapt
    FeaturePrefsStore.batch1181.v1184adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1184: adept mode
internal fun PlayerActivity.showV1184AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adept
    FeaturePrefsStore.batch1181.v1184adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1184: admit mode
internal fun PlayerActivity.showV1184AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1184admit
    FeaturePrefsStore.batch1181.v1184admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1184: adopt mode
internal fun PlayerActivity.showV1184AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adopt
    FeaturePrefsStore.batch1181.v1184adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1184: adult mode
internal fun PlayerActivity.showV1184AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adult
    FeaturePrefsStore.batch1181.v1184adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1184: advance level
internal fun PlayerActivity.showV1184AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1184: advice level
internal fun PlayerActivity.showV1184AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1184: aerial level
internal fun PlayerActivity.showV1184AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1184: affair level
internal fun PlayerActivity.showV1184AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1184: affect level
internal fun PlayerActivity.showV1184AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1184: afford mode
internal fun PlayerActivity.showV1184AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1184afford
    FeaturePrefsStore.batch1181.v1184afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1184: afield mode
internal fun PlayerActivity.showV1184AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1184afield
    FeaturePrefsStore.batch1181.v1184afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1184: age mode
internal fun PlayerActivity.showV1184AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1184age
    FeaturePrefsStore.batch1181.v1184age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1184: agency mode
internal fun PlayerActivity.showV1184AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1184agency
    FeaturePrefsStore.batch1181.v1184agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1184: agenda mode
internal fun PlayerActivity.showV1184AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1184agenda
    FeaturePrefsStore.batch1181.v1184agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1185: adapt mode
internal fun PlayerActivity.showV1185AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adapt
    FeaturePrefsStore.batch1181.v1185adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1185: adept mode
internal fun PlayerActivity.showV1185AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adept
    FeaturePrefsStore.batch1181.v1185adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1185: admit mode
internal fun PlayerActivity.showV1185AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1185admit
    FeaturePrefsStore.batch1181.v1185admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1185: adopt mode
internal fun PlayerActivity.showV1185AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adopt
    FeaturePrefsStore.batch1181.v1185adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1185: adult mode
internal fun PlayerActivity.showV1185AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adult
    FeaturePrefsStore.batch1181.v1185adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1185: advance level
internal fun PlayerActivity.showV1185AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1185: advice level
internal fun PlayerActivity.showV1185AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1185: aerial level
internal fun PlayerActivity.showV1185AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1185: affair level
internal fun PlayerActivity.showV1185AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1185: affect level
internal fun PlayerActivity.showV1185AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1185: afford mode
internal fun PlayerActivity.showV1185AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1185afford
    FeaturePrefsStore.batch1181.v1185afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1185: afield mode
internal fun PlayerActivity.showV1185AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1185afield
    FeaturePrefsStore.batch1181.v1185afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1185: age mode
internal fun PlayerActivity.showV1185AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1185age
    FeaturePrefsStore.batch1181.v1185age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1185: agency mode
internal fun PlayerActivity.showV1185AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1185agency
    FeaturePrefsStore.batch1181.v1185agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1185: agenda mode
internal fun PlayerActivity.showV1185AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1185agenda
    FeaturePrefsStore.batch1181.v1185agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1186: adapt mode
internal fun PlayerActivity.showV1186AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adapt
    FeaturePrefsStore.batch1181.v1186adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1186: adept mode
internal fun PlayerActivity.showV1186AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adept
    FeaturePrefsStore.batch1181.v1186adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1186: admit mode
internal fun PlayerActivity.showV1186AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1186admit
    FeaturePrefsStore.batch1181.v1186admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1186: adopt mode
internal fun PlayerActivity.showV1186AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adopt
    FeaturePrefsStore.batch1181.v1186adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1186: adult mode
internal fun PlayerActivity.showV1186AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adult
    FeaturePrefsStore.batch1181.v1186adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1186: advance level
internal fun PlayerActivity.showV1186AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1186: advice level
internal fun PlayerActivity.showV1186AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1186: aerial level
internal fun PlayerActivity.showV1186AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1186: affair level
internal fun PlayerActivity.showV1186AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1186: affect level
internal fun PlayerActivity.showV1186AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1186: afford mode
internal fun PlayerActivity.showV1186AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1186afford
    FeaturePrefsStore.batch1181.v1186afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1186: afield mode
internal fun PlayerActivity.showV1186AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1186afield
    FeaturePrefsStore.batch1181.v1186afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1186: age mode
internal fun PlayerActivity.showV1186AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1186age
    FeaturePrefsStore.batch1181.v1186age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1186: agency mode
internal fun PlayerActivity.showV1186AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1186agency
    FeaturePrefsStore.batch1181.v1186agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1186: agenda mode
internal fun PlayerActivity.showV1186AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1186agenda
    FeaturePrefsStore.batch1181.v1186agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1187: adapt mode
internal fun PlayerActivity.showV1187AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adapt
    FeaturePrefsStore.batch1181.v1187adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1187: adept mode
internal fun PlayerActivity.showV1187AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adept
    FeaturePrefsStore.batch1181.v1187adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1187: admit mode
internal fun PlayerActivity.showV1187AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1187admit
    FeaturePrefsStore.batch1181.v1187admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1187: adopt mode
internal fun PlayerActivity.showV1187AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adopt
    FeaturePrefsStore.batch1181.v1187adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1187: adult mode
internal fun PlayerActivity.showV1187AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adult
    FeaturePrefsStore.batch1181.v1187adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1187: advance level
internal fun PlayerActivity.showV1187AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1187: advice level
internal fun PlayerActivity.showV1187AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1187: aerial level
internal fun PlayerActivity.showV1187AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1187: affair level
internal fun PlayerActivity.showV1187AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1187: affect level
internal fun PlayerActivity.showV1187AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1187: afford mode
internal fun PlayerActivity.showV1187AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1187afford
    FeaturePrefsStore.batch1181.v1187afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1187: afield mode
internal fun PlayerActivity.showV1187AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1187afield
    FeaturePrefsStore.batch1181.v1187afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1187: age mode
internal fun PlayerActivity.showV1187AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1187age
    FeaturePrefsStore.batch1181.v1187age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1187: agency mode
internal fun PlayerActivity.showV1187AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1187agency
    FeaturePrefsStore.batch1181.v1187agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1187: agenda mode
internal fun PlayerActivity.showV1187AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1187agenda
    FeaturePrefsStore.batch1181.v1187agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1188: adapt mode
internal fun PlayerActivity.showV1188AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adapt
    FeaturePrefsStore.batch1181.v1188adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1188: adept mode
internal fun PlayerActivity.showV1188AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adept
    FeaturePrefsStore.batch1181.v1188adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1188: admit mode
internal fun PlayerActivity.showV1188AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1188admit
    FeaturePrefsStore.batch1181.v1188admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1188: adopt mode
internal fun PlayerActivity.showV1188AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adopt
    FeaturePrefsStore.batch1181.v1188adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1188: adult mode
internal fun PlayerActivity.showV1188AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adult
    FeaturePrefsStore.batch1181.v1188adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1188: advance level
internal fun PlayerActivity.showV1188AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1188: advice level
internal fun PlayerActivity.showV1188AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1188: aerial level
internal fun PlayerActivity.showV1188AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1188: affair level
internal fun PlayerActivity.showV1188AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1188: affect level
internal fun PlayerActivity.showV1188AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1188: afford mode
internal fun PlayerActivity.showV1188AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1188afford
    FeaturePrefsStore.batch1181.v1188afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1188: afield mode
internal fun PlayerActivity.showV1188AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1188afield
    FeaturePrefsStore.batch1181.v1188afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1188: age mode
internal fun PlayerActivity.showV1188AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1188age
    FeaturePrefsStore.batch1181.v1188age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1188: agency mode
internal fun PlayerActivity.showV1188AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1188agency
    FeaturePrefsStore.batch1181.v1188agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1188: agenda mode
internal fun PlayerActivity.showV1188AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1188agenda
    FeaturePrefsStore.batch1181.v1188agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1189: adapt mode
internal fun PlayerActivity.showV1189AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adapt
    FeaturePrefsStore.batch1181.v1189adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1189: adept mode
internal fun PlayerActivity.showV1189AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adept
    FeaturePrefsStore.batch1181.v1189adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1189: admit mode
internal fun PlayerActivity.showV1189AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1189admit
    FeaturePrefsStore.batch1181.v1189admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1189: adopt mode
internal fun PlayerActivity.showV1189AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adopt
    FeaturePrefsStore.batch1181.v1189adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1189: adult mode
internal fun PlayerActivity.showV1189AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adult
    FeaturePrefsStore.batch1181.v1189adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1189: advance level
internal fun PlayerActivity.showV1189AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1189: advice level
internal fun PlayerActivity.showV1189AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1189: aerial level
internal fun PlayerActivity.showV1189AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1189: affair level
internal fun PlayerActivity.showV1189AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1189: affect level
internal fun PlayerActivity.showV1189AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1189: afford mode
internal fun PlayerActivity.showV1189AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1189afford
    FeaturePrefsStore.batch1181.v1189afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1189: afield mode
internal fun PlayerActivity.showV1189AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1189afield
    FeaturePrefsStore.batch1181.v1189afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1189: age mode
internal fun PlayerActivity.showV1189AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1189age
    FeaturePrefsStore.batch1181.v1189age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1189: agency mode
internal fun PlayerActivity.showV1189AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1189agency
    FeaturePrefsStore.batch1181.v1189agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1189: agenda mode
internal fun PlayerActivity.showV1189AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1189agenda
    FeaturePrefsStore.batch1181.v1189agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1190: adapt mode
internal fun PlayerActivity.showV1190AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adapt
    FeaturePrefsStore.batch1181.v1190adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1190: adept mode
internal fun PlayerActivity.showV1190AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adept
    FeaturePrefsStore.batch1181.v1190adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1190: admit mode
internal fun PlayerActivity.showV1190AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1190admit
    FeaturePrefsStore.batch1181.v1190admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1190: adopt mode
internal fun PlayerActivity.showV1190AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adopt
    FeaturePrefsStore.batch1181.v1190adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1190: adult mode
internal fun PlayerActivity.showV1190AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adult
    FeaturePrefsStore.batch1181.v1190adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1190: advance level
internal fun PlayerActivity.showV1190AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1190: advice level
internal fun PlayerActivity.showV1190AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1190: aerial level
internal fun PlayerActivity.showV1190AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1190: affair level
internal fun PlayerActivity.showV1190AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1190: affect level
internal fun PlayerActivity.showV1190AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1190: afford mode
internal fun PlayerActivity.showV1190AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1190afford
    FeaturePrefsStore.batch1181.v1190afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1190: afield mode
internal fun PlayerActivity.showV1190AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1190afield
    FeaturePrefsStore.batch1181.v1190afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1190: age mode
internal fun PlayerActivity.showV1190AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1190age
    FeaturePrefsStore.batch1181.v1190age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1190: agency mode
internal fun PlayerActivity.showV1190AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1190agency
    FeaturePrefsStore.batch1181.v1190agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1190: agenda mode
internal fun PlayerActivity.showV1190AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1190agenda
    FeaturePrefsStore.batch1181.v1190agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

