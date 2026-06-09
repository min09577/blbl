package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2251: specialized mode
internal fun PlayerActivity.showV2251SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251specialized
    FeaturePrefsStore.batch2251.v2251specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2251: specified mode
internal fun PlayerActivity.showV2251SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251specified
    FeaturePrefsStore.batch2251.v2251specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2251: spelled mode
internal fun PlayerActivity.showV2251SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2251spelled
    FeaturePrefsStore.batch2251.v2251spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2251: spent mode
internal fun PlayerActivity.showV2251SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2251spent
    FeaturePrefsStore.batch2251.v2251spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2251: spilled mode
internal fun PlayerActivity.showV2251SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2251spilled
    FeaturePrefsStore.batch2251.v2251spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2251: sponsored level
internal fun PlayerActivity.showV2251SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2251sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2251sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2251: spread level
internal fun PlayerActivity.showV2251SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2251spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2251spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2251: squeezed level
internal fun PlayerActivity.showV2251SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2251squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2251squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2251: stabilized level
internal fun PlayerActivity.showV2251StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2251stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2251stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2251: stacked level
internal fun PlayerActivity.showV2251StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2251stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2251stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2251: staged mode
internal fun PlayerActivity.showV2251StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251staged
    FeaturePrefsStore.batch2251.v2251staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2251: standardized mode
internal fun PlayerActivity.showV2251StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251standardized
    FeaturePrefsStore.batch2251.v2251standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2251: started mode
internal fun PlayerActivity.showV2251StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251started
    FeaturePrefsStore.batch2251.v2251started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2251: stated mode
internal fun PlayerActivity.showV2251StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251stated
    FeaturePrefsStore.batch2251.v2251stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2251: stationed mode
internal fun PlayerActivity.showV2251StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2251stationed
    FeaturePrefsStore.batch2251.v2251stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2252: specialized mode
internal fun PlayerActivity.showV2252SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252specialized
    FeaturePrefsStore.batch2251.v2252specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2252: specified mode
internal fun PlayerActivity.showV2252SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252specified
    FeaturePrefsStore.batch2251.v2252specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2252: spelled mode
internal fun PlayerActivity.showV2252SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2252spelled
    FeaturePrefsStore.batch2251.v2252spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2252: spent mode
internal fun PlayerActivity.showV2252SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2252spent
    FeaturePrefsStore.batch2251.v2252spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2252: spilled mode
internal fun PlayerActivity.showV2252SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2252spilled
    FeaturePrefsStore.batch2251.v2252spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2252: sponsored level
internal fun PlayerActivity.showV2252SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2252sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2252sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2252: spread level
internal fun PlayerActivity.showV2252SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2252spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2252spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2252: squeezed level
internal fun PlayerActivity.showV2252SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2252squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2252squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2252: stabilized level
internal fun PlayerActivity.showV2252StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2252stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2252stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2252: stacked level
internal fun PlayerActivity.showV2252StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2252stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2252stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2252: staged mode
internal fun PlayerActivity.showV2252StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252staged
    FeaturePrefsStore.batch2251.v2252staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2252: standardized mode
internal fun PlayerActivity.showV2252StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252standardized
    FeaturePrefsStore.batch2251.v2252standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2252: started mode
internal fun PlayerActivity.showV2252StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252started
    FeaturePrefsStore.batch2251.v2252started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2252: stated mode
internal fun PlayerActivity.showV2252StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252stated
    FeaturePrefsStore.batch2251.v2252stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2252: stationed mode
internal fun PlayerActivity.showV2252StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2252stationed
    FeaturePrefsStore.batch2251.v2252stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2253: specialized mode
internal fun PlayerActivity.showV2253SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253specialized
    FeaturePrefsStore.batch2251.v2253specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2253: specified mode
internal fun PlayerActivity.showV2253SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253specified
    FeaturePrefsStore.batch2251.v2253specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2253: spelled mode
internal fun PlayerActivity.showV2253SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2253spelled
    FeaturePrefsStore.batch2251.v2253spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2253: spent mode
internal fun PlayerActivity.showV2253SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2253spent
    FeaturePrefsStore.batch2251.v2253spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2253: spilled mode
internal fun PlayerActivity.showV2253SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2253spilled
    FeaturePrefsStore.batch2251.v2253spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2253: sponsored level
internal fun PlayerActivity.showV2253SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2253sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2253sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2253: spread level
internal fun PlayerActivity.showV2253SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2253spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2253spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2253: squeezed level
internal fun PlayerActivity.showV2253SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2253squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2253squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2253: stabilized level
internal fun PlayerActivity.showV2253StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2253stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2253stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2253: stacked level
internal fun PlayerActivity.showV2253StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2253stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2253stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2253: staged mode
internal fun PlayerActivity.showV2253StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253staged
    FeaturePrefsStore.batch2251.v2253staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2253: standardized mode
internal fun PlayerActivity.showV2253StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253standardized
    FeaturePrefsStore.batch2251.v2253standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2253: started mode
internal fun PlayerActivity.showV2253StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253started
    FeaturePrefsStore.batch2251.v2253started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2253: stated mode
internal fun PlayerActivity.showV2253StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253stated
    FeaturePrefsStore.batch2251.v2253stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2253: stationed mode
internal fun PlayerActivity.showV2253StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2253stationed
    FeaturePrefsStore.batch2251.v2253stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2254: specialized mode
internal fun PlayerActivity.showV2254SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254specialized
    FeaturePrefsStore.batch2251.v2254specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2254: specified mode
internal fun PlayerActivity.showV2254SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254specified
    FeaturePrefsStore.batch2251.v2254specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2254: spelled mode
internal fun PlayerActivity.showV2254SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2254spelled
    FeaturePrefsStore.batch2251.v2254spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2254: spent mode
internal fun PlayerActivity.showV2254SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2254spent
    FeaturePrefsStore.batch2251.v2254spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2254: spilled mode
internal fun PlayerActivity.showV2254SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2254spilled
    FeaturePrefsStore.batch2251.v2254spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2254: sponsored level
internal fun PlayerActivity.showV2254SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2254sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2254sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2254: spread level
internal fun PlayerActivity.showV2254SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2254spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2254spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2254: squeezed level
internal fun PlayerActivity.showV2254SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2254squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2254squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2254: stabilized level
internal fun PlayerActivity.showV2254StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2254stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2254stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2254: stacked level
internal fun PlayerActivity.showV2254StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2254stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2254stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2254: staged mode
internal fun PlayerActivity.showV2254StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254staged
    FeaturePrefsStore.batch2251.v2254staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2254: standardized mode
internal fun PlayerActivity.showV2254StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254standardized
    FeaturePrefsStore.batch2251.v2254standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2254: started mode
internal fun PlayerActivity.showV2254StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254started
    FeaturePrefsStore.batch2251.v2254started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2254: stated mode
internal fun PlayerActivity.showV2254StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254stated
    FeaturePrefsStore.batch2251.v2254stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2254: stationed mode
internal fun PlayerActivity.showV2254StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2254stationed
    FeaturePrefsStore.batch2251.v2254stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2255: specialized mode
internal fun PlayerActivity.showV2255SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255specialized
    FeaturePrefsStore.batch2251.v2255specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2255: specified mode
internal fun PlayerActivity.showV2255SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255specified
    FeaturePrefsStore.batch2251.v2255specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2255: spelled mode
internal fun PlayerActivity.showV2255SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2255spelled
    FeaturePrefsStore.batch2251.v2255spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2255: spent mode
internal fun PlayerActivity.showV2255SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2255spent
    FeaturePrefsStore.batch2251.v2255spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2255: spilled mode
internal fun PlayerActivity.showV2255SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2255spilled
    FeaturePrefsStore.batch2251.v2255spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2255: sponsored level
internal fun PlayerActivity.showV2255SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2255sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2255sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2255: spread level
internal fun PlayerActivity.showV2255SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2255spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2255spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2255: squeezed level
internal fun PlayerActivity.showV2255SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2255squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2255squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2255: stabilized level
internal fun PlayerActivity.showV2255StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2255stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2255stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2255: stacked level
internal fun PlayerActivity.showV2255StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2255stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2255stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2255: staged mode
internal fun PlayerActivity.showV2255StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255staged
    FeaturePrefsStore.batch2251.v2255staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2255: standardized mode
internal fun PlayerActivity.showV2255StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255standardized
    FeaturePrefsStore.batch2251.v2255standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2255: started mode
internal fun PlayerActivity.showV2255StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255started
    FeaturePrefsStore.batch2251.v2255started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2255: stated mode
internal fun PlayerActivity.showV2255StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255stated
    FeaturePrefsStore.batch2251.v2255stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2255: stationed mode
internal fun PlayerActivity.showV2255StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2255stationed
    FeaturePrefsStore.batch2251.v2255stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2256: specialized mode
internal fun PlayerActivity.showV2256SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256specialized
    FeaturePrefsStore.batch2251.v2256specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2256: specified mode
internal fun PlayerActivity.showV2256SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256specified
    FeaturePrefsStore.batch2251.v2256specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2256: spelled mode
internal fun PlayerActivity.showV2256SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2256spelled
    FeaturePrefsStore.batch2251.v2256spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2256: spent mode
internal fun PlayerActivity.showV2256SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2256spent
    FeaturePrefsStore.batch2251.v2256spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2256: spilled mode
internal fun PlayerActivity.showV2256SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2256spilled
    FeaturePrefsStore.batch2251.v2256spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2256: sponsored level
internal fun PlayerActivity.showV2256SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2256sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2256sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2256: spread level
internal fun PlayerActivity.showV2256SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2256spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2256spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2256: squeezed level
internal fun PlayerActivity.showV2256SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2256squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2256squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2256: stabilized level
internal fun PlayerActivity.showV2256StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2256stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2256stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2256: stacked level
internal fun PlayerActivity.showV2256StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2256stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2256stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2256: staged mode
internal fun PlayerActivity.showV2256StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256staged
    FeaturePrefsStore.batch2251.v2256staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2256: standardized mode
internal fun PlayerActivity.showV2256StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256standardized
    FeaturePrefsStore.batch2251.v2256standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2256: started mode
internal fun PlayerActivity.showV2256StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256started
    FeaturePrefsStore.batch2251.v2256started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2256: stated mode
internal fun PlayerActivity.showV2256StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256stated
    FeaturePrefsStore.batch2251.v2256stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2256: stationed mode
internal fun PlayerActivity.showV2256StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2256stationed
    FeaturePrefsStore.batch2251.v2256stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2257: specialized mode
internal fun PlayerActivity.showV2257SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257specialized
    FeaturePrefsStore.batch2251.v2257specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2257: specified mode
internal fun PlayerActivity.showV2257SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257specified
    FeaturePrefsStore.batch2251.v2257specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2257: spelled mode
internal fun PlayerActivity.showV2257SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2257spelled
    FeaturePrefsStore.batch2251.v2257spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2257: spent mode
internal fun PlayerActivity.showV2257SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2257spent
    FeaturePrefsStore.batch2251.v2257spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2257: spilled mode
internal fun PlayerActivity.showV2257SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2257spilled
    FeaturePrefsStore.batch2251.v2257spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2257: sponsored level
internal fun PlayerActivity.showV2257SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2257sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2257sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2257: spread level
internal fun PlayerActivity.showV2257SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2257spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2257spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2257: squeezed level
internal fun PlayerActivity.showV2257SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2257squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2257squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2257: stabilized level
internal fun PlayerActivity.showV2257StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2257stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2257stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2257: stacked level
internal fun PlayerActivity.showV2257StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2257stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2257stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2257: staged mode
internal fun PlayerActivity.showV2257StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257staged
    FeaturePrefsStore.batch2251.v2257staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2257: standardized mode
internal fun PlayerActivity.showV2257StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257standardized
    FeaturePrefsStore.batch2251.v2257standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2257: started mode
internal fun PlayerActivity.showV2257StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257started
    FeaturePrefsStore.batch2251.v2257started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2257: stated mode
internal fun PlayerActivity.showV2257StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257stated
    FeaturePrefsStore.batch2251.v2257stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2257: stationed mode
internal fun PlayerActivity.showV2257StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2257stationed
    FeaturePrefsStore.batch2251.v2257stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2258: specialized mode
internal fun PlayerActivity.showV2258SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258specialized
    FeaturePrefsStore.batch2251.v2258specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2258: specified mode
internal fun PlayerActivity.showV2258SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258specified
    FeaturePrefsStore.batch2251.v2258specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2258: spelled mode
internal fun PlayerActivity.showV2258SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2258spelled
    FeaturePrefsStore.batch2251.v2258spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2258: spent mode
internal fun PlayerActivity.showV2258SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2258spent
    FeaturePrefsStore.batch2251.v2258spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2258: spilled mode
internal fun PlayerActivity.showV2258SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2258spilled
    FeaturePrefsStore.batch2251.v2258spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2258: sponsored level
internal fun PlayerActivity.showV2258SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2258sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2258sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2258: spread level
internal fun PlayerActivity.showV2258SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2258spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2258spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2258: squeezed level
internal fun PlayerActivity.showV2258SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2258squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2258squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2258: stabilized level
internal fun PlayerActivity.showV2258StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2258stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2258stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2258: stacked level
internal fun PlayerActivity.showV2258StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2258stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2258stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2258: staged mode
internal fun PlayerActivity.showV2258StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258staged
    FeaturePrefsStore.batch2251.v2258staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2258: standardized mode
internal fun PlayerActivity.showV2258StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258standardized
    FeaturePrefsStore.batch2251.v2258standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2258: started mode
internal fun PlayerActivity.showV2258StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258started
    FeaturePrefsStore.batch2251.v2258started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2258: stated mode
internal fun PlayerActivity.showV2258StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258stated
    FeaturePrefsStore.batch2251.v2258stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2258: stationed mode
internal fun PlayerActivity.showV2258StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2258stationed
    FeaturePrefsStore.batch2251.v2258stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2259: specialized mode
internal fun PlayerActivity.showV2259SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259specialized
    FeaturePrefsStore.batch2251.v2259specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2259: specified mode
internal fun PlayerActivity.showV2259SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259specified
    FeaturePrefsStore.batch2251.v2259specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2259: spelled mode
internal fun PlayerActivity.showV2259SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2259spelled
    FeaturePrefsStore.batch2251.v2259spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2259: spent mode
internal fun PlayerActivity.showV2259SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2259spent
    FeaturePrefsStore.batch2251.v2259spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2259: spilled mode
internal fun PlayerActivity.showV2259SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2259spilled
    FeaturePrefsStore.batch2251.v2259spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2259: sponsored level
internal fun PlayerActivity.showV2259SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2259sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2259sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2259: spread level
internal fun PlayerActivity.showV2259SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2259spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2259spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2259: squeezed level
internal fun PlayerActivity.showV2259SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2259squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2259squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2259: stabilized level
internal fun PlayerActivity.showV2259StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2259stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2259stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2259: stacked level
internal fun PlayerActivity.showV2259StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2259stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2259stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2259: staged mode
internal fun PlayerActivity.showV2259StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259staged
    FeaturePrefsStore.batch2251.v2259staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2259: standardized mode
internal fun PlayerActivity.showV2259StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259standardized
    FeaturePrefsStore.batch2251.v2259standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2259: started mode
internal fun PlayerActivity.showV2259StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259started
    FeaturePrefsStore.batch2251.v2259started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2259: stated mode
internal fun PlayerActivity.showV2259StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259stated
    FeaturePrefsStore.batch2251.v2259stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2259: stationed mode
internal fun PlayerActivity.showV2259StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2259stationed
    FeaturePrefsStore.batch2251.v2259stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

// v2260: specialized mode
internal fun PlayerActivity.showV2260SpecializedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260specialized
    FeaturePrefsStore.batch2251.v2260specialized = !current
    AppToast.show(this, "specialized: ${if (!current) "ON" else "OFF"}")
}

// v2260: specified mode
internal fun PlayerActivity.showV2260SpecifiedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260specified
    FeaturePrefsStore.batch2251.v2260specified = !current
    AppToast.show(this, "specified: ${if (!current) "ON" else "OFF"}")
}

// v2260: spelled mode
internal fun PlayerActivity.showV2260SpelledToggle() {
    val current = FeaturePrefsStore.batch2251.v2260spelled
    FeaturePrefsStore.batch2251.v2260spelled = !current
    AppToast.show(this, "spelled: ${if (!current) "ON" else "OFF"}")
}

// v2260: spent mode
internal fun PlayerActivity.showV2260SpentToggle() {
    val current = FeaturePrefsStore.batch2251.v2260spent
    FeaturePrefsStore.batch2251.v2260spent = !current
    AppToast.show(this, "spent: ${if (!current) "ON" else "OFF"}")
}

// v2260: spilled mode
internal fun PlayerActivity.showV2260SpilledToggle() {
    val current = FeaturePrefsStore.batch2251.v2260spilled
    FeaturePrefsStore.batch2251.v2260spilled = !current
    AppToast.show(this, "spilled: ${if (!current) "ON" else "OFF"}")
}

// v2260: sponsored level
internal fun PlayerActivity.showV2260SponsoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2260sponsored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sponsored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2260sponsored = value
        AppToast.show(this, "sponsored: $value")
    }
}

// v2260: spread level
internal fun PlayerActivity.showV2260SpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2260spread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "spread level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2260spread = value
        AppToast.show(this, "spread: $value")
    }
}

// v2260: squeezed level
internal fun PlayerActivity.showV2260SqueezedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2260squeezed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "squeezed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2260squeezed = value
        AppToast.show(this, "squeezed: $value")
    }
}

// v2260: stabilized level
internal fun PlayerActivity.showV2260StabilizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2260stabilized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stabilized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2260stabilized = value
        AppToast.show(this, "stabilized: $value")
    }
}

// v2260: stacked level
internal fun PlayerActivity.showV2260StackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2251.v2260stacked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stacked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2251.v2260stacked = value
        AppToast.show(this, "stacked: $value")
    }
}

// v2260: staged mode
internal fun PlayerActivity.showV2260StagedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260staged
    FeaturePrefsStore.batch2251.v2260staged = !current
    AppToast.show(this, "staged: ${if (!current) "ON" else "OFF"}")
}

// v2260: standardized mode
internal fun PlayerActivity.showV2260StandardizedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260standardized
    FeaturePrefsStore.batch2251.v2260standardized = !current
    AppToast.show(this, "standardized: ${if (!current) "ON" else "OFF"}")
}

// v2260: started mode
internal fun PlayerActivity.showV2260StartedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260started
    FeaturePrefsStore.batch2251.v2260started = !current
    AppToast.show(this, "started: ${if (!current) "ON" else "OFF"}")
}

// v2260: stated mode
internal fun PlayerActivity.showV2260StatedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260stated
    FeaturePrefsStore.batch2251.v2260stated = !current
    AppToast.show(this, "stated: ${if (!current) "ON" else "OFF"}")
}

// v2260: stationed mode
internal fun PlayerActivity.showV2260StationedToggle() {
    val current = FeaturePrefsStore.batch2251.v2260stationed
    FeaturePrefsStore.batch2251.v2260stationed = !current
    AppToast.show(this, "stationed: ${if (!current) "ON" else "OFF"}")
}

