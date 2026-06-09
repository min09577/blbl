package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

