package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



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

