package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2021: fulfilled mode
internal fun PlayerActivity.showV2021FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2021fulfilled
    FeaturePrefsStore.batch2021.v2021fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2021: functioned mode
internal fun PlayerActivity.showV2021FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021functioned
    FeaturePrefsStore.batch2021.v2021functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2021: funded mode
internal fun PlayerActivity.showV2021FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021funded
    FeaturePrefsStore.batch2021.v2021funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2021: gathered mode
internal fun PlayerActivity.showV2021GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2021gathered
    FeaturePrefsStore.batch2021.v2021gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2021: generated mode
internal fun PlayerActivity.showV2021GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021generated
    FeaturePrefsStore.batch2021.v2021generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2021: governed level
internal fun PlayerActivity.showV2021GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2021: graduated level
internal fun PlayerActivity.showV2021GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2021: granted level
internal fun PlayerActivity.showV2021GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2021: greeted level
internal fun PlayerActivity.showV2021GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2021: grounded level
internal fun PlayerActivity.showV2021GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2021: grouped mode
internal fun PlayerActivity.showV2021GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021grouped
    FeaturePrefsStore.batch2021.v2021grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2021: guaranteed mode
internal fun PlayerActivity.showV2021GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guaranteed
    FeaturePrefsStore.batch2021.v2021guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2021: guarded mode
internal fun PlayerActivity.showV2021GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guarded
    FeaturePrefsStore.batch2021.v2021guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2021: guided mode
internal fun PlayerActivity.showV2021GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guided
    FeaturePrefsStore.batch2021.v2021guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2021: handled mode
internal fun PlayerActivity.showV2021HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2021handled
    FeaturePrefsStore.batch2021.v2021handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2022: fulfilled mode
internal fun PlayerActivity.showV2022FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2022fulfilled
    FeaturePrefsStore.batch2021.v2022fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2022: functioned mode
internal fun PlayerActivity.showV2022FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022functioned
    FeaturePrefsStore.batch2021.v2022functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2022: funded mode
internal fun PlayerActivity.showV2022FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022funded
    FeaturePrefsStore.batch2021.v2022funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2022: gathered mode
internal fun PlayerActivity.showV2022GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2022gathered
    FeaturePrefsStore.batch2021.v2022gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2022: generated mode
internal fun PlayerActivity.showV2022GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022generated
    FeaturePrefsStore.batch2021.v2022generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2022: governed level
internal fun PlayerActivity.showV2022GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2022: graduated level
internal fun PlayerActivity.showV2022GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2022: granted level
internal fun PlayerActivity.showV2022GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2022: greeted level
internal fun PlayerActivity.showV2022GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2022: grounded level
internal fun PlayerActivity.showV2022GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2022: grouped mode
internal fun PlayerActivity.showV2022GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022grouped
    FeaturePrefsStore.batch2021.v2022grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2022: guaranteed mode
internal fun PlayerActivity.showV2022GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guaranteed
    FeaturePrefsStore.batch2021.v2022guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2022: guarded mode
internal fun PlayerActivity.showV2022GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guarded
    FeaturePrefsStore.batch2021.v2022guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2022: guided mode
internal fun PlayerActivity.showV2022GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guided
    FeaturePrefsStore.batch2021.v2022guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2022: handled mode
internal fun PlayerActivity.showV2022HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2022handled
    FeaturePrefsStore.batch2021.v2022handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2023: fulfilled mode
internal fun PlayerActivity.showV2023FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2023fulfilled
    FeaturePrefsStore.batch2021.v2023fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2023: functioned mode
internal fun PlayerActivity.showV2023FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023functioned
    FeaturePrefsStore.batch2021.v2023functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2023: funded mode
internal fun PlayerActivity.showV2023FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023funded
    FeaturePrefsStore.batch2021.v2023funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2023: gathered mode
internal fun PlayerActivity.showV2023GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2023gathered
    FeaturePrefsStore.batch2021.v2023gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2023: generated mode
internal fun PlayerActivity.showV2023GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023generated
    FeaturePrefsStore.batch2021.v2023generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2023: governed level
internal fun PlayerActivity.showV2023GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2023: graduated level
internal fun PlayerActivity.showV2023GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2023: granted level
internal fun PlayerActivity.showV2023GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2023: greeted level
internal fun PlayerActivity.showV2023GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2023: grounded level
internal fun PlayerActivity.showV2023GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2023: grouped mode
internal fun PlayerActivity.showV2023GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023grouped
    FeaturePrefsStore.batch2021.v2023grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2023: guaranteed mode
internal fun PlayerActivity.showV2023GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guaranteed
    FeaturePrefsStore.batch2021.v2023guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2023: guarded mode
internal fun PlayerActivity.showV2023GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guarded
    FeaturePrefsStore.batch2021.v2023guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2023: guided mode
internal fun PlayerActivity.showV2023GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guided
    FeaturePrefsStore.batch2021.v2023guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2023: handled mode
internal fun PlayerActivity.showV2023HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2023handled
    FeaturePrefsStore.batch2021.v2023handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2024: fulfilled mode
internal fun PlayerActivity.showV2024FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2024fulfilled
    FeaturePrefsStore.batch2021.v2024fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2024: functioned mode
internal fun PlayerActivity.showV2024FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024functioned
    FeaturePrefsStore.batch2021.v2024functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2024: funded mode
internal fun PlayerActivity.showV2024FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024funded
    FeaturePrefsStore.batch2021.v2024funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2024: gathered mode
internal fun PlayerActivity.showV2024GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2024gathered
    FeaturePrefsStore.batch2021.v2024gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2024: generated mode
internal fun PlayerActivity.showV2024GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024generated
    FeaturePrefsStore.batch2021.v2024generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2024: governed level
internal fun PlayerActivity.showV2024GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2024: graduated level
internal fun PlayerActivity.showV2024GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2024: granted level
internal fun PlayerActivity.showV2024GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2024: greeted level
internal fun PlayerActivity.showV2024GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2024: grounded level
internal fun PlayerActivity.showV2024GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2024: grouped mode
internal fun PlayerActivity.showV2024GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024grouped
    FeaturePrefsStore.batch2021.v2024grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2024: guaranteed mode
internal fun PlayerActivity.showV2024GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guaranteed
    FeaturePrefsStore.batch2021.v2024guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2024: guarded mode
internal fun PlayerActivity.showV2024GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guarded
    FeaturePrefsStore.batch2021.v2024guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2024: guided mode
internal fun PlayerActivity.showV2024GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guided
    FeaturePrefsStore.batch2021.v2024guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2024: handled mode
internal fun PlayerActivity.showV2024HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2024handled
    FeaturePrefsStore.batch2021.v2024handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2025: fulfilled mode
internal fun PlayerActivity.showV2025FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2025fulfilled
    FeaturePrefsStore.batch2021.v2025fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2025: functioned mode
internal fun PlayerActivity.showV2025FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025functioned
    FeaturePrefsStore.batch2021.v2025functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2025: funded mode
internal fun PlayerActivity.showV2025FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025funded
    FeaturePrefsStore.batch2021.v2025funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2025: gathered mode
internal fun PlayerActivity.showV2025GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2025gathered
    FeaturePrefsStore.batch2021.v2025gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2025: generated mode
internal fun PlayerActivity.showV2025GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025generated
    FeaturePrefsStore.batch2021.v2025generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2025: governed level
internal fun PlayerActivity.showV2025GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2025: graduated level
internal fun PlayerActivity.showV2025GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2025: granted level
internal fun PlayerActivity.showV2025GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2025: greeted level
internal fun PlayerActivity.showV2025GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2025: grounded level
internal fun PlayerActivity.showV2025GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2025: grouped mode
internal fun PlayerActivity.showV2025GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025grouped
    FeaturePrefsStore.batch2021.v2025grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2025: guaranteed mode
internal fun PlayerActivity.showV2025GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guaranteed
    FeaturePrefsStore.batch2021.v2025guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2025: guarded mode
internal fun PlayerActivity.showV2025GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guarded
    FeaturePrefsStore.batch2021.v2025guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2025: guided mode
internal fun PlayerActivity.showV2025GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guided
    FeaturePrefsStore.batch2021.v2025guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2025: handled mode
internal fun PlayerActivity.showV2025HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2025handled
    FeaturePrefsStore.batch2021.v2025handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2026: fulfilled mode
internal fun PlayerActivity.showV2026FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2026fulfilled
    FeaturePrefsStore.batch2021.v2026fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2026: functioned mode
internal fun PlayerActivity.showV2026FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026functioned
    FeaturePrefsStore.batch2021.v2026functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2026: funded mode
internal fun PlayerActivity.showV2026FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026funded
    FeaturePrefsStore.batch2021.v2026funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2026: gathered mode
internal fun PlayerActivity.showV2026GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2026gathered
    FeaturePrefsStore.batch2021.v2026gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2026: generated mode
internal fun PlayerActivity.showV2026GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026generated
    FeaturePrefsStore.batch2021.v2026generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2026: governed level
internal fun PlayerActivity.showV2026GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2026: graduated level
internal fun PlayerActivity.showV2026GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2026: granted level
internal fun PlayerActivity.showV2026GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2026: greeted level
internal fun PlayerActivity.showV2026GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2026: grounded level
internal fun PlayerActivity.showV2026GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2026: grouped mode
internal fun PlayerActivity.showV2026GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026grouped
    FeaturePrefsStore.batch2021.v2026grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2026: guaranteed mode
internal fun PlayerActivity.showV2026GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guaranteed
    FeaturePrefsStore.batch2021.v2026guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2026: guarded mode
internal fun PlayerActivity.showV2026GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guarded
    FeaturePrefsStore.batch2021.v2026guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2026: guided mode
internal fun PlayerActivity.showV2026GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guided
    FeaturePrefsStore.batch2021.v2026guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2026: handled mode
internal fun PlayerActivity.showV2026HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2026handled
    FeaturePrefsStore.batch2021.v2026handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2027: fulfilled mode
internal fun PlayerActivity.showV2027FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2027fulfilled
    FeaturePrefsStore.batch2021.v2027fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2027: functioned mode
internal fun PlayerActivity.showV2027FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027functioned
    FeaturePrefsStore.batch2021.v2027functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2027: funded mode
internal fun PlayerActivity.showV2027FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027funded
    FeaturePrefsStore.batch2021.v2027funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2027: gathered mode
internal fun PlayerActivity.showV2027GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2027gathered
    FeaturePrefsStore.batch2021.v2027gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2027: generated mode
internal fun PlayerActivity.showV2027GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027generated
    FeaturePrefsStore.batch2021.v2027generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2027: governed level
internal fun PlayerActivity.showV2027GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2027: graduated level
internal fun PlayerActivity.showV2027GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2027: granted level
internal fun PlayerActivity.showV2027GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2027: greeted level
internal fun PlayerActivity.showV2027GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2027: grounded level
internal fun PlayerActivity.showV2027GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2027: grouped mode
internal fun PlayerActivity.showV2027GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027grouped
    FeaturePrefsStore.batch2021.v2027grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2027: guaranteed mode
internal fun PlayerActivity.showV2027GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guaranteed
    FeaturePrefsStore.batch2021.v2027guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2027: guarded mode
internal fun PlayerActivity.showV2027GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guarded
    FeaturePrefsStore.batch2021.v2027guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2027: guided mode
internal fun PlayerActivity.showV2027GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guided
    FeaturePrefsStore.batch2021.v2027guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2027: handled mode
internal fun PlayerActivity.showV2027HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2027handled
    FeaturePrefsStore.batch2021.v2027handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2028: fulfilled mode
internal fun PlayerActivity.showV2028FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2028fulfilled
    FeaturePrefsStore.batch2021.v2028fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2028: functioned mode
internal fun PlayerActivity.showV2028FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028functioned
    FeaturePrefsStore.batch2021.v2028functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2028: funded mode
internal fun PlayerActivity.showV2028FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028funded
    FeaturePrefsStore.batch2021.v2028funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2028: gathered mode
internal fun PlayerActivity.showV2028GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2028gathered
    FeaturePrefsStore.batch2021.v2028gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2028: generated mode
internal fun PlayerActivity.showV2028GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028generated
    FeaturePrefsStore.batch2021.v2028generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2028: governed level
internal fun PlayerActivity.showV2028GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2028: graduated level
internal fun PlayerActivity.showV2028GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2028: granted level
internal fun PlayerActivity.showV2028GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2028: greeted level
internal fun PlayerActivity.showV2028GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2028: grounded level
internal fun PlayerActivity.showV2028GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2028: grouped mode
internal fun PlayerActivity.showV2028GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028grouped
    FeaturePrefsStore.batch2021.v2028grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2028: guaranteed mode
internal fun PlayerActivity.showV2028GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guaranteed
    FeaturePrefsStore.batch2021.v2028guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2028: guarded mode
internal fun PlayerActivity.showV2028GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guarded
    FeaturePrefsStore.batch2021.v2028guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2028: guided mode
internal fun PlayerActivity.showV2028GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guided
    FeaturePrefsStore.batch2021.v2028guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2028: handled mode
internal fun PlayerActivity.showV2028HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2028handled
    FeaturePrefsStore.batch2021.v2028handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2029: fulfilled mode
internal fun PlayerActivity.showV2029FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2029fulfilled
    FeaturePrefsStore.batch2021.v2029fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2029: functioned mode
internal fun PlayerActivity.showV2029FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029functioned
    FeaturePrefsStore.batch2021.v2029functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2029: funded mode
internal fun PlayerActivity.showV2029FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029funded
    FeaturePrefsStore.batch2021.v2029funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2029: gathered mode
internal fun PlayerActivity.showV2029GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2029gathered
    FeaturePrefsStore.batch2021.v2029gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2029: generated mode
internal fun PlayerActivity.showV2029GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029generated
    FeaturePrefsStore.batch2021.v2029generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2029: governed level
internal fun PlayerActivity.showV2029GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2029: graduated level
internal fun PlayerActivity.showV2029GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2029: granted level
internal fun PlayerActivity.showV2029GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2029: greeted level
internal fun PlayerActivity.showV2029GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2029: grounded level
internal fun PlayerActivity.showV2029GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2029: grouped mode
internal fun PlayerActivity.showV2029GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029grouped
    FeaturePrefsStore.batch2021.v2029grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2029: guaranteed mode
internal fun PlayerActivity.showV2029GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guaranteed
    FeaturePrefsStore.batch2021.v2029guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2029: guarded mode
internal fun PlayerActivity.showV2029GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guarded
    FeaturePrefsStore.batch2021.v2029guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2029: guided mode
internal fun PlayerActivity.showV2029GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guided
    FeaturePrefsStore.batch2021.v2029guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2029: handled mode
internal fun PlayerActivity.showV2029HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2029handled
    FeaturePrefsStore.batch2021.v2029handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2030: fulfilled mode
internal fun PlayerActivity.showV2030FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2030fulfilled
    FeaturePrefsStore.batch2021.v2030fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2030: functioned mode
internal fun PlayerActivity.showV2030FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030functioned
    FeaturePrefsStore.batch2021.v2030functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2030: funded mode
internal fun PlayerActivity.showV2030FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030funded
    FeaturePrefsStore.batch2021.v2030funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2030: gathered mode
internal fun PlayerActivity.showV2030GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2030gathered
    FeaturePrefsStore.batch2021.v2030gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2030: generated mode
internal fun PlayerActivity.showV2030GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030generated
    FeaturePrefsStore.batch2021.v2030generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2030: governed level
internal fun PlayerActivity.showV2030GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2030: graduated level
internal fun PlayerActivity.showV2030GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2030: granted level
internal fun PlayerActivity.showV2030GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2030: greeted level
internal fun PlayerActivity.showV2030GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2030: grounded level
internal fun PlayerActivity.showV2030GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2030: grouped mode
internal fun PlayerActivity.showV2030GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030grouped
    FeaturePrefsStore.batch2021.v2030grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2030: guaranteed mode
internal fun PlayerActivity.showV2030GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guaranteed
    FeaturePrefsStore.batch2021.v2030guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2030: guarded mode
internal fun PlayerActivity.showV2030GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guarded
    FeaturePrefsStore.batch2021.v2030guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2030: guided mode
internal fun PlayerActivity.showV2030GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guided
    FeaturePrefsStore.batch2021.v2030guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2030: handled mode
internal fun PlayerActivity.showV2030HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2030handled
    FeaturePrefsStore.batch2021.v2030handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

