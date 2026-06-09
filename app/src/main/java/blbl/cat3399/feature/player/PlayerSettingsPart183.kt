package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2011: forecasted mode
internal fun PlayerActivity.showV2011ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forecasted
    FeaturePrefsStore.batch2011.v2011forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2011: forged mode
internal fun PlayerActivity.showV2011ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forged
    FeaturePrefsStore.batch2011.v2011forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2011: forgotten mode
internal fun PlayerActivity.showV2011ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forgotten
    FeaturePrefsStore.batch2011.v2011forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2011: formatted mode
internal fun PlayerActivity.showV2011FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011formatted
    FeaturePrefsStore.batch2011.v2011formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2011: formulated mode
internal fun PlayerActivity.showV2011FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011formulated
    FeaturePrefsStore.batch2011.v2011formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2011: fortified level
internal fun PlayerActivity.showV2011FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2011: fostered level
internal fun PlayerActivity.showV2011FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2011: founded level
internal fun PlayerActivity.showV2011FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2011: framed level
internal fun PlayerActivity.showV2011FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2011: freed level
internal fun PlayerActivity.showV2011FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2011: freezed mode
internal fun PlayerActivity.showV2011FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011freezed
    FeaturePrefsStore.batch2011.v2011freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2011: frequented mode
internal fun PlayerActivity.showV2011FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frequented
    FeaturePrefsStore.batch2011.v2011frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2011: fried mode
internal fun PlayerActivity.showV2011FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011fried
    FeaturePrefsStore.batch2011.v2011fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2011: frightened mode
internal fun PlayerActivity.showV2011FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frightened
    FeaturePrefsStore.batch2011.v2011frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2011: frustrated mode
internal fun PlayerActivity.showV2011FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frustrated
    FeaturePrefsStore.batch2011.v2011frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2012: forecasted mode
internal fun PlayerActivity.showV2012ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forecasted
    FeaturePrefsStore.batch2011.v2012forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2012: forged mode
internal fun PlayerActivity.showV2012ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forged
    FeaturePrefsStore.batch2011.v2012forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2012: forgotten mode
internal fun PlayerActivity.showV2012ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forgotten
    FeaturePrefsStore.batch2011.v2012forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2012: formatted mode
internal fun PlayerActivity.showV2012FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012formatted
    FeaturePrefsStore.batch2011.v2012formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2012: formulated mode
internal fun PlayerActivity.showV2012FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012formulated
    FeaturePrefsStore.batch2011.v2012formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2012: fortified level
internal fun PlayerActivity.showV2012FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2012: fostered level
internal fun PlayerActivity.showV2012FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2012: founded level
internal fun PlayerActivity.showV2012FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2012: framed level
internal fun PlayerActivity.showV2012FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2012: freed level
internal fun PlayerActivity.showV2012FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2012: freezed mode
internal fun PlayerActivity.showV2012FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012freezed
    FeaturePrefsStore.batch2011.v2012freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2012: frequented mode
internal fun PlayerActivity.showV2012FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frequented
    FeaturePrefsStore.batch2011.v2012frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2012: fried mode
internal fun PlayerActivity.showV2012FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012fried
    FeaturePrefsStore.batch2011.v2012fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2012: frightened mode
internal fun PlayerActivity.showV2012FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frightened
    FeaturePrefsStore.batch2011.v2012frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2012: frustrated mode
internal fun PlayerActivity.showV2012FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frustrated
    FeaturePrefsStore.batch2011.v2012frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2013: forecasted mode
internal fun PlayerActivity.showV2013ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forecasted
    FeaturePrefsStore.batch2011.v2013forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2013: forged mode
internal fun PlayerActivity.showV2013ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forged
    FeaturePrefsStore.batch2011.v2013forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2013: forgotten mode
internal fun PlayerActivity.showV2013ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forgotten
    FeaturePrefsStore.batch2011.v2013forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2013: formatted mode
internal fun PlayerActivity.showV2013FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013formatted
    FeaturePrefsStore.batch2011.v2013formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2013: formulated mode
internal fun PlayerActivity.showV2013FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013formulated
    FeaturePrefsStore.batch2011.v2013formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2013: fortified level
internal fun PlayerActivity.showV2013FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2013: fostered level
internal fun PlayerActivity.showV2013FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2013: founded level
internal fun PlayerActivity.showV2013FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2013: framed level
internal fun PlayerActivity.showV2013FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2013: freed level
internal fun PlayerActivity.showV2013FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2013: freezed mode
internal fun PlayerActivity.showV2013FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013freezed
    FeaturePrefsStore.batch2011.v2013freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2013: frequented mode
internal fun PlayerActivity.showV2013FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frequented
    FeaturePrefsStore.batch2011.v2013frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2013: fried mode
internal fun PlayerActivity.showV2013FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013fried
    FeaturePrefsStore.batch2011.v2013fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2013: frightened mode
internal fun PlayerActivity.showV2013FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frightened
    FeaturePrefsStore.batch2011.v2013frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2013: frustrated mode
internal fun PlayerActivity.showV2013FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frustrated
    FeaturePrefsStore.batch2011.v2013frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2014: forecasted mode
internal fun PlayerActivity.showV2014ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forecasted
    FeaturePrefsStore.batch2011.v2014forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2014: forged mode
internal fun PlayerActivity.showV2014ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forged
    FeaturePrefsStore.batch2011.v2014forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2014: forgotten mode
internal fun PlayerActivity.showV2014ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forgotten
    FeaturePrefsStore.batch2011.v2014forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2014: formatted mode
internal fun PlayerActivity.showV2014FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014formatted
    FeaturePrefsStore.batch2011.v2014formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2014: formulated mode
internal fun PlayerActivity.showV2014FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014formulated
    FeaturePrefsStore.batch2011.v2014formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2014: fortified level
internal fun PlayerActivity.showV2014FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2014: fostered level
internal fun PlayerActivity.showV2014FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2014: founded level
internal fun PlayerActivity.showV2014FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2014: framed level
internal fun PlayerActivity.showV2014FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2014: freed level
internal fun PlayerActivity.showV2014FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2014: freezed mode
internal fun PlayerActivity.showV2014FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014freezed
    FeaturePrefsStore.batch2011.v2014freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2014: frequented mode
internal fun PlayerActivity.showV2014FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frequented
    FeaturePrefsStore.batch2011.v2014frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2014: fried mode
internal fun PlayerActivity.showV2014FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014fried
    FeaturePrefsStore.batch2011.v2014fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2014: frightened mode
internal fun PlayerActivity.showV2014FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frightened
    FeaturePrefsStore.batch2011.v2014frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2014: frustrated mode
internal fun PlayerActivity.showV2014FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frustrated
    FeaturePrefsStore.batch2011.v2014frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2015: forecasted mode
internal fun PlayerActivity.showV2015ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forecasted
    FeaturePrefsStore.batch2011.v2015forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2015: forged mode
internal fun PlayerActivity.showV2015ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forged
    FeaturePrefsStore.batch2011.v2015forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2015: forgotten mode
internal fun PlayerActivity.showV2015ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forgotten
    FeaturePrefsStore.batch2011.v2015forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2015: formatted mode
internal fun PlayerActivity.showV2015FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015formatted
    FeaturePrefsStore.batch2011.v2015formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2015: formulated mode
internal fun PlayerActivity.showV2015FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015formulated
    FeaturePrefsStore.batch2011.v2015formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2015: fortified level
internal fun PlayerActivity.showV2015FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2015: fostered level
internal fun PlayerActivity.showV2015FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2015: founded level
internal fun PlayerActivity.showV2015FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2015: framed level
internal fun PlayerActivity.showV2015FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2015: freed level
internal fun PlayerActivity.showV2015FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2015: freezed mode
internal fun PlayerActivity.showV2015FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015freezed
    FeaturePrefsStore.batch2011.v2015freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2015: frequented mode
internal fun PlayerActivity.showV2015FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frequented
    FeaturePrefsStore.batch2011.v2015frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2015: fried mode
internal fun PlayerActivity.showV2015FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015fried
    FeaturePrefsStore.batch2011.v2015fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2015: frightened mode
internal fun PlayerActivity.showV2015FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frightened
    FeaturePrefsStore.batch2011.v2015frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2015: frustrated mode
internal fun PlayerActivity.showV2015FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frustrated
    FeaturePrefsStore.batch2011.v2015frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2016: forecasted mode
internal fun PlayerActivity.showV2016ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forecasted
    FeaturePrefsStore.batch2011.v2016forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2016: forged mode
internal fun PlayerActivity.showV2016ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forged
    FeaturePrefsStore.batch2011.v2016forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2016: forgotten mode
internal fun PlayerActivity.showV2016ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forgotten
    FeaturePrefsStore.batch2011.v2016forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2016: formatted mode
internal fun PlayerActivity.showV2016FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016formatted
    FeaturePrefsStore.batch2011.v2016formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2016: formulated mode
internal fun PlayerActivity.showV2016FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016formulated
    FeaturePrefsStore.batch2011.v2016formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2016: fortified level
internal fun PlayerActivity.showV2016FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2016: fostered level
internal fun PlayerActivity.showV2016FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2016: founded level
internal fun PlayerActivity.showV2016FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2016: framed level
internal fun PlayerActivity.showV2016FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2016: freed level
internal fun PlayerActivity.showV2016FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2016: freezed mode
internal fun PlayerActivity.showV2016FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016freezed
    FeaturePrefsStore.batch2011.v2016freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2016: frequented mode
internal fun PlayerActivity.showV2016FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frequented
    FeaturePrefsStore.batch2011.v2016frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2016: fried mode
internal fun PlayerActivity.showV2016FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016fried
    FeaturePrefsStore.batch2011.v2016fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2016: frightened mode
internal fun PlayerActivity.showV2016FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frightened
    FeaturePrefsStore.batch2011.v2016frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2016: frustrated mode
internal fun PlayerActivity.showV2016FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frustrated
    FeaturePrefsStore.batch2011.v2016frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2017: forecasted mode
internal fun PlayerActivity.showV2017ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forecasted
    FeaturePrefsStore.batch2011.v2017forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2017: forged mode
internal fun PlayerActivity.showV2017ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forged
    FeaturePrefsStore.batch2011.v2017forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2017: forgotten mode
internal fun PlayerActivity.showV2017ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forgotten
    FeaturePrefsStore.batch2011.v2017forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2017: formatted mode
internal fun PlayerActivity.showV2017FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017formatted
    FeaturePrefsStore.batch2011.v2017formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2017: formulated mode
internal fun PlayerActivity.showV2017FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017formulated
    FeaturePrefsStore.batch2011.v2017formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2017: fortified level
internal fun PlayerActivity.showV2017FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2017: fostered level
internal fun PlayerActivity.showV2017FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2017: founded level
internal fun PlayerActivity.showV2017FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2017: framed level
internal fun PlayerActivity.showV2017FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2017: freed level
internal fun PlayerActivity.showV2017FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2017: freezed mode
internal fun PlayerActivity.showV2017FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017freezed
    FeaturePrefsStore.batch2011.v2017freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2017: frequented mode
internal fun PlayerActivity.showV2017FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frequented
    FeaturePrefsStore.batch2011.v2017frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2017: fried mode
internal fun PlayerActivity.showV2017FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017fried
    FeaturePrefsStore.batch2011.v2017fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2017: frightened mode
internal fun PlayerActivity.showV2017FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frightened
    FeaturePrefsStore.batch2011.v2017frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2017: frustrated mode
internal fun PlayerActivity.showV2017FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frustrated
    FeaturePrefsStore.batch2011.v2017frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2018: forecasted mode
internal fun PlayerActivity.showV2018ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forecasted
    FeaturePrefsStore.batch2011.v2018forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2018: forged mode
internal fun PlayerActivity.showV2018ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forged
    FeaturePrefsStore.batch2011.v2018forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2018: forgotten mode
internal fun PlayerActivity.showV2018ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forgotten
    FeaturePrefsStore.batch2011.v2018forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2018: formatted mode
internal fun PlayerActivity.showV2018FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018formatted
    FeaturePrefsStore.batch2011.v2018formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2018: formulated mode
internal fun PlayerActivity.showV2018FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018formulated
    FeaturePrefsStore.batch2011.v2018formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2018: fortified level
internal fun PlayerActivity.showV2018FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2018: fostered level
internal fun PlayerActivity.showV2018FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2018: founded level
internal fun PlayerActivity.showV2018FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2018: framed level
internal fun PlayerActivity.showV2018FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2018: freed level
internal fun PlayerActivity.showV2018FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2018: freezed mode
internal fun PlayerActivity.showV2018FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018freezed
    FeaturePrefsStore.batch2011.v2018freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2018: frequented mode
internal fun PlayerActivity.showV2018FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frequented
    FeaturePrefsStore.batch2011.v2018frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2018: fried mode
internal fun PlayerActivity.showV2018FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018fried
    FeaturePrefsStore.batch2011.v2018fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2018: frightened mode
internal fun PlayerActivity.showV2018FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frightened
    FeaturePrefsStore.batch2011.v2018frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2018: frustrated mode
internal fun PlayerActivity.showV2018FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frustrated
    FeaturePrefsStore.batch2011.v2018frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2019: forecasted mode
internal fun PlayerActivity.showV2019ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forecasted
    FeaturePrefsStore.batch2011.v2019forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2019: forged mode
internal fun PlayerActivity.showV2019ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forged
    FeaturePrefsStore.batch2011.v2019forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2019: forgotten mode
internal fun PlayerActivity.showV2019ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forgotten
    FeaturePrefsStore.batch2011.v2019forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2019: formatted mode
internal fun PlayerActivity.showV2019FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019formatted
    FeaturePrefsStore.batch2011.v2019formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2019: formulated mode
internal fun PlayerActivity.showV2019FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019formulated
    FeaturePrefsStore.batch2011.v2019formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2019: fortified level
internal fun PlayerActivity.showV2019FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2019: fostered level
internal fun PlayerActivity.showV2019FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2019: founded level
internal fun PlayerActivity.showV2019FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2019: framed level
internal fun PlayerActivity.showV2019FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2019: freed level
internal fun PlayerActivity.showV2019FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2019: freezed mode
internal fun PlayerActivity.showV2019FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019freezed
    FeaturePrefsStore.batch2011.v2019freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2019: frequented mode
internal fun PlayerActivity.showV2019FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frequented
    FeaturePrefsStore.batch2011.v2019frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2019: fried mode
internal fun PlayerActivity.showV2019FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019fried
    FeaturePrefsStore.batch2011.v2019fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2019: frightened mode
internal fun PlayerActivity.showV2019FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frightened
    FeaturePrefsStore.batch2011.v2019frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2019: frustrated mode
internal fun PlayerActivity.showV2019FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frustrated
    FeaturePrefsStore.batch2011.v2019frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2020: forecasted mode
internal fun PlayerActivity.showV2020ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forecasted
    FeaturePrefsStore.batch2011.v2020forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2020: forged mode
internal fun PlayerActivity.showV2020ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forged
    FeaturePrefsStore.batch2011.v2020forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2020: forgotten mode
internal fun PlayerActivity.showV2020ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forgotten
    FeaturePrefsStore.batch2011.v2020forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2020: formatted mode
internal fun PlayerActivity.showV2020FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020formatted
    FeaturePrefsStore.batch2011.v2020formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2020: formulated mode
internal fun PlayerActivity.showV2020FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020formulated
    FeaturePrefsStore.batch2011.v2020formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2020: fortified level
internal fun PlayerActivity.showV2020FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2020: fostered level
internal fun PlayerActivity.showV2020FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2020: founded level
internal fun PlayerActivity.showV2020FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2020: framed level
internal fun PlayerActivity.showV2020FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2020: freed level
internal fun PlayerActivity.showV2020FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2020: freezed mode
internal fun PlayerActivity.showV2020FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020freezed
    FeaturePrefsStore.batch2011.v2020freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2020: frequented mode
internal fun PlayerActivity.showV2020FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frequented
    FeaturePrefsStore.batch2011.v2020frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2020: fried mode
internal fun PlayerActivity.showV2020FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020fried
    FeaturePrefsStore.batch2011.v2020fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2020: frightened mode
internal fun PlayerActivity.showV2020FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frightened
    FeaturePrefsStore.batch2011.v2020frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2020: frustrated mode
internal fun PlayerActivity.showV2020FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frustrated
    FeaturePrefsStore.batch2011.v2020frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

