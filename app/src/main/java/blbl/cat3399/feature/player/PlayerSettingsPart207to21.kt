package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v2261: stayed mode
internal fun PlayerActivity.showV2261StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stayed
    FeaturePrefsStore.batch2261.v2261stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2261: steered mode
internal fun PlayerActivity.showV2261SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2261steered
    FeaturePrefsStore.batch2261.v2261steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2261: stemmed mode
internal fun PlayerActivity.showV2261StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stemmed
    FeaturePrefsStore.batch2261.v2261stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2261: stepped mode
internal fun PlayerActivity.showV2261SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stepped
    FeaturePrefsStore.batch2261.v2261stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2261: stimulated mode
internal fun PlayerActivity.showV2261StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stimulated
    FeaturePrefsStore.batch2261.v2261stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2261: stirred level
internal fun PlayerActivity.showV2261StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2261: stocked level
internal fun PlayerActivity.showV2261StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2261: stopped level
internal fun PlayerActivity.showV2261StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2261: stored level
internal fun PlayerActivity.showV2261StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2261: straightened level
internal fun PlayerActivity.showV2261StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2261: strategized mode
internal fun PlayerActivity.showV2261StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261strategized
    FeaturePrefsStore.batch2261.v2261strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2261: streamlined mode
internal fun PlayerActivity.showV2261StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261streamlined
    FeaturePrefsStore.batch2261.v2261streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2261: strengthened mode
internal fun PlayerActivity.showV2261StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261strengthened
    FeaturePrefsStore.batch2261.v2261strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2261: stretched mode
internal fun PlayerActivity.showV2261StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stretched
    FeaturePrefsStore.batch2261.v2261stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2261: structured mode
internal fun PlayerActivity.showV2261StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2261structured
    FeaturePrefsStore.batch2261.v2261structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2262: stayed mode
internal fun PlayerActivity.showV2262StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stayed
    FeaturePrefsStore.batch2261.v2262stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2262: steered mode
internal fun PlayerActivity.showV2262SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2262steered
    FeaturePrefsStore.batch2261.v2262steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2262: stemmed mode
internal fun PlayerActivity.showV2262StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stemmed
    FeaturePrefsStore.batch2261.v2262stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2262: stepped mode
internal fun PlayerActivity.showV2262SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stepped
    FeaturePrefsStore.batch2261.v2262stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2262: stimulated mode
internal fun PlayerActivity.showV2262StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stimulated
    FeaturePrefsStore.batch2261.v2262stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2262: stirred level
internal fun PlayerActivity.showV2262StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2262: stocked level
internal fun PlayerActivity.showV2262StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2262: stopped level
internal fun PlayerActivity.showV2262StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2262: stored level
internal fun PlayerActivity.showV2262StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2262: straightened level
internal fun PlayerActivity.showV2262StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2262: strategized mode
internal fun PlayerActivity.showV2262StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262strategized
    FeaturePrefsStore.batch2261.v2262strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2262: streamlined mode
internal fun PlayerActivity.showV2262StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262streamlined
    FeaturePrefsStore.batch2261.v2262streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2262: strengthened mode
internal fun PlayerActivity.showV2262StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262strengthened
    FeaturePrefsStore.batch2261.v2262strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2262: stretched mode
internal fun PlayerActivity.showV2262StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stretched
    FeaturePrefsStore.batch2261.v2262stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2262: structured mode
internal fun PlayerActivity.showV2262StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2262structured
    FeaturePrefsStore.batch2261.v2262structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2263: stayed mode
internal fun PlayerActivity.showV2263StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stayed
    FeaturePrefsStore.batch2261.v2263stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2263: steered mode
internal fun PlayerActivity.showV2263SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2263steered
    FeaturePrefsStore.batch2261.v2263steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2263: stemmed mode
internal fun PlayerActivity.showV2263StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stemmed
    FeaturePrefsStore.batch2261.v2263stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2263: stepped mode
internal fun PlayerActivity.showV2263SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stepped
    FeaturePrefsStore.batch2261.v2263stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2263: stimulated mode
internal fun PlayerActivity.showV2263StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stimulated
    FeaturePrefsStore.batch2261.v2263stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2263: stirred level
internal fun PlayerActivity.showV2263StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2263: stocked level
internal fun PlayerActivity.showV2263StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2263: stopped level
internal fun PlayerActivity.showV2263StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2263: stored level
internal fun PlayerActivity.showV2263StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2263: straightened level
internal fun PlayerActivity.showV2263StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2263: strategized mode
internal fun PlayerActivity.showV2263StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263strategized
    FeaturePrefsStore.batch2261.v2263strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2263: streamlined mode
internal fun PlayerActivity.showV2263StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263streamlined
    FeaturePrefsStore.batch2261.v2263streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2263: strengthened mode
internal fun PlayerActivity.showV2263StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263strengthened
    FeaturePrefsStore.batch2261.v2263strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2263: stretched mode
internal fun PlayerActivity.showV2263StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stretched
    FeaturePrefsStore.batch2261.v2263stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2263: structured mode
internal fun PlayerActivity.showV2263StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2263structured
    FeaturePrefsStore.batch2261.v2263structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2264: stayed mode
internal fun PlayerActivity.showV2264StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stayed
    FeaturePrefsStore.batch2261.v2264stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2264: steered mode
internal fun PlayerActivity.showV2264SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2264steered
    FeaturePrefsStore.batch2261.v2264steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2264: stemmed mode
internal fun PlayerActivity.showV2264StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stemmed
    FeaturePrefsStore.batch2261.v2264stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2264: stepped mode
internal fun PlayerActivity.showV2264SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stepped
    FeaturePrefsStore.batch2261.v2264stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2264: stimulated mode
internal fun PlayerActivity.showV2264StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stimulated
    FeaturePrefsStore.batch2261.v2264stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2264: stirred level
internal fun PlayerActivity.showV2264StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2264: stocked level
internal fun PlayerActivity.showV2264StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2264: stopped level
internal fun PlayerActivity.showV2264StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2264: stored level
internal fun PlayerActivity.showV2264StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2264: straightened level
internal fun PlayerActivity.showV2264StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2264: strategized mode
internal fun PlayerActivity.showV2264StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264strategized
    FeaturePrefsStore.batch2261.v2264strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2264: streamlined mode
internal fun PlayerActivity.showV2264StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264streamlined
    FeaturePrefsStore.batch2261.v2264streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2264: strengthened mode
internal fun PlayerActivity.showV2264StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264strengthened
    FeaturePrefsStore.batch2261.v2264strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2264: stretched mode
internal fun PlayerActivity.showV2264StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stretched
    FeaturePrefsStore.batch2261.v2264stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2264: structured mode
internal fun PlayerActivity.showV2264StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2264structured
    FeaturePrefsStore.batch2261.v2264structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2265: stayed mode
internal fun PlayerActivity.showV2265StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stayed
    FeaturePrefsStore.batch2261.v2265stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2265: steered mode
internal fun PlayerActivity.showV2265SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2265steered
    FeaturePrefsStore.batch2261.v2265steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2265: stemmed mode
internal fun PlayerActivity.showV2265StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stemmed
    FeaturePrefsStore.batch2261.v2265stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2265: stepped mode
internal fun PlayerActivity.showV2265SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stepped
    FeaturePrefsStore.batch2261.v2265stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2265: stimulated mode
internal fun PlayerActivity.showV2265StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stimulated
    FeaturePrefsStore.batch2261.v2265stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2265: stirred level
internal fun PlayerActivity.showV2265StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2265: stocked level
internal fun PlayerActivity.showV2265StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2265: stopped level
internal fun PlayerActivity.showV2265StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2265: stored level
internal fun PlayerActivity.showV2265StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2265: straightened level
internal fun PlayerActivity.showV2265StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2265: strategized mode
internal fun PlayerActivity.showV2265StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265strategized
    FeaturePrefsStore.batch2261.v2265strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2265: streamlined mode
internal fun PlayerActivity.showV2265StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265streamlined
    FeaturePrefsStore.batch2261.v2265streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2265: strengthened mode
internal fun PlayerActivity.showV2265StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265strengthened
    FeaturePrefsStore.batch2261.v2265strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2265: stretched mode
internal fun PlayerActivity.showV2265StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stretched
    FeaturePrefsStore.batch2261.v2265stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2265: structured mode
internal fun PlayerActivity.showV2265StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2265structured
    FeaturePrefsStore.batch2261.v2265structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2266: stayed mode
internal fun PlayerActivity.showV2266StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stayed
    FeaturePrefsStore.batch2261.v2266stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2266: steered mode
internal fun PlayerActivity.showV2266SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2266steered
    FeaturePrefsStore.batch2261.v2266steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2266: stemmed mode
internal fun PlayerActivity.showV2266StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stemmed
    FeaturePrefsStore.batch2261.v2266stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2266: stepped mode
internal fun PlayerActivity.showV2266SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stepped
    FeaturePrefsStore.batch2261.v2266stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2266: stimulated mode
internal fun PlayerActivity.showV2266StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stimulated
    FeaturePrefsStore.batch2261.v2266stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2266: stirred level
internal fun PlayerActivity.showV2266StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2266: stocked level
internal fun PlayerActivity.showV2266StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2266: stopped level
internal fun PlayerActivity.showV2266StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2266: stored level
internal fun PlayerActivity.showV2266StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2266: straightened level
internal fun PlayerActivity.showV2266StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2266: strategized mode
internal fun PlayerActivity.showV2266StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266strategized
    FeaturePrefsStore.batch2261.v2266strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2266: streamlined mode
internal fun PlayerActivity.showV2266StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266streamlined
    FeaturePrefsStore.batch2261.v2266streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2266: strengthened mode
internal fun PlayerActivity.showV2266StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266strengthened
    FeaturePrefsStore.batch2261.v2266strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2266: stretched mode
internal fun PlayerActivity.showV2266StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stretched
    FeaturePrefsStore.batch2261.v2266stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2266: structured mode
internal fun PlayerActivity.showV2266StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2266structured
    FeaturePrefsStore.batch2261.v2266structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2267: stayed mode
internal fun PlayerActivity.showV2267StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stayed
    FeaturePrefsStore.batch2261.v2267stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2267: steered mode
internal fun PlayerActivity.showV2267SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2267steered
    FeaturePrefsStore.batch2261.v2267steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2267: stemmed mode
internal fun PlayerActivity.showV2267StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stemmed
    FeaturePrefsStore.batch2261.v2267stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2267: stepped mode
internal fun PlayerActivity.showV2267SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stepped
    FeaturePrefsStore.batch2261.v2267stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2267: stimulated mode
internal fun PlayerActivity.showV2267StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stimulated
    FeaturePrefsStore.batch2261.v2267stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2267: stirred level
internal fun PlayerActivity.showV2267StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2267: stocked level
internal fun PlayerActivity.showV2267StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2267: stopped level
internal fun PlayerActivity.showV2267StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2267: stored level
internal fun PlayerActivity.showV2267StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2267: straightened level
internal fun PlayerActivity.showV2267StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2267: strategized mode
internal fun PlayerActivity.showV2267StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267strategized
    FeaturePrefsStore.batch2261.v2267strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2267: streamlined mode
internal fun PlayerActivity.showV2267StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267streamlined
    FeaturePrefsStore.batch2261.v2267streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2267: strengthened mode
internal fun PlayerActivity.showV2267StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267strengthened
    FeaturePrefsStore.batch2261.v2267strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2267: stretched mode
internal fun PlayerActivity.showV2267StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stretched
    FeaturePrefsStore.batch2261.v2267stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2267: structured mode
internal fun PlayerActivity.showV2267StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2267structured
    FeaturePrefsStore.batch2261.v2267structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2268: stayed mode
internal fun PlayerActivity.showV2268StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stayed
    FeaturePrefsStore.batch2261.v2268stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2268: steered mode
internal fun PlayerActivity.showV2268SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2268steered
    FeaturePrefsStore.batch2261.v2268steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2268: stemmed mode
internal fun PlayerActivity.showV2268StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stemmed
    FeaturePrefsStore.batch2261.v2268stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2268: stepped mode
internal fun PlayerActivity.showV2268SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stepped
    FeaturePrefsStore.batch2261.v2268stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2268: stimulated mode
internal fun PlayerActivity.showV2268StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stimulated
    FeaturePrefsStore.batch2261.v2268stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2268: stirred level
internal fun PlayerActivity.showV2268StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2268: stocked level
internal fun PlayerActivity.showV2268StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2268: stopped level
internal fun PlayerActivity.showV2268StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2268: stored level
internal fun PlayerActivity.showV2268StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2268: straightened level
internal fun PlayerActivity.showV2268StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2268: strategized mode
internal fun PlayerActivity.showV2268StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268strategized
    FeaturePrefsStore.batch2261.v2268strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2268: streamlined mode
internal fun PlayerActivity.showV2268StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268streamlined
    FeaturePrefsStore.batch2261.v2268streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2268: strengthened mode
internal fun PlayerActivity.showV2268StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268strengthened
    FeaturePrefsStore.batch2261.v2268strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2268: stretched mode
internal fun PlayerActivity.showV2268StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stretched
    FeaturePrefsStore.batch2261.v2268stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2268: structured mode
internal fun PlayerActivity.showV2268StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2268structured
    FeaturePrefsStore.batch2261.v2268structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2269: stayed mode
internal fun PlayerActivity.showV2269StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stayed
    FeaturePrefsStore.batch2261.v2269stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2269: steered mode
internal fun PlayerActivity.showV2269SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2269steered
    FeaturePrefsStore.batch2261.v2269steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2269: stemmed mode
internal fun PlayerActivity.showV2269StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stemmed
    FeaturePrefsStore.batch2261.v2269stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2269: stepped mode
internal fun PlayerActivity.showV2269SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stepped
    FeaturePrefsStore.batch2261.v2269stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2269: stimulated mode
internal fun PlayerActivity.showV2269StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stimulated
    FeaturePrefsStore.batch2261.v2269stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2269: stirred level
internal fun PlayerActivity.showV2269StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2269: stocked level
internal fun PlayerActivity.showV2269StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2269: stopped level
internal fun PlayerActivity.showV2269StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2269: stored level
internal fun PlayerActivity.showV2269StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2269: straightened level
internal fun PlayerActivity.showV2269StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2269: strategized mode
internal fun PlayerActivity.showV2269StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269strategized
    FeaturePrefsStore.batch2261.v2269strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2269: streamlined mode
internal fun PlayerActivity.showV2269StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269streamlined
    FeaturePrefsStore.batch2261.v2269streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2269: strengthened mode
internal fun PlayerActivity.showV2269StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269strengthened
    FeaturePrefsStore.batch2261.v2269strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2269: stretched mode
internal fun PlayerActivity.showV2269StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stretched
    FeaturePrefsStore.batch2261.v2269stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2269: structured mode
internal fun PlayerActivity.showV2269StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2269structured
    FeaturePrefsStore.batch2261.v2269structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2270: stayed mode
internal fun PlayerActivity.showV2270StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stayed
    FeaturePrefsStore.batch2261.v2270stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2270: steered mode
internal fun PlayerActivity.showV2270SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2270steered
    FeaturePrefsStore.batch2261.v2270steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2270: stemmed mode
internal fun PlayerActivity.showV2270StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stemmed
    FeaturePrefsStore.batch2261.v2270stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2270: stepped mode
internal fun PlayerActivity.showV2270SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stepped
    FeaturePrefsStore.batch2261.v2270stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2270: stimulated mode
internal fun PlayerActivity.showV2270StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stimulated
    FeaturePrefsStore.batch2261.v2270stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2270: stirred level
internal fun PlayerActivity.showV2270StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2270: stocked level
internal fun PlayerActivity.showV2270StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2270: stopped level
internal fun PlayerActivity.showV2270StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2270: stored level
internal fun PlayerActivity.showV2270StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2270: straightened level
internal fun PlayerActivity.showV2270StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2270: strategized mode
internal fun PlayerActivity.showV2270StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270strategized
    FeaturePrefsStore.batch2261.v2270strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2270: streamlined mode
internal fun PlayerActivity.showV2270StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270streamlined
    FeaturePrefsStore.batch2261.v2270streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2270: strengthened mode
internal fun PlayerActivity.showV2270StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270strengthened
    FeaturePrefsStore.batch2261.v2270strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2270: stretched mode
internal fun PlayerActivity.showV2270StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stretched
    FeaturePrefsStore.batch2261.v2270stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2270: structured mode
internal fun PlayerActivity.showV2270StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2270structured
    FeaturePrefsStore.batch2261.v2270structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2271: struggled mode
internal fun PlayerActivity.showV2271StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2271struggled
    FeaturePrefsStore.batch2271.v2271struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2271: stuck mode
internal fun PlayerActivity.showV2271StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2271stuck
    FeaturePrefsStore.batch2271.v2271stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2271: studied mode
internal fun PlayerActivity.showV2271StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271studied
    FeaturePrefsStore.batch2271.v2271studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2271: submitted mode
internal fun PlayerActivity.showV2271SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271submitted
    FeaturePrefsStore.batch2271.v2271submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2271: substituted mode
internal fun PlayerActivity.showV2271SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271substituted
    FeaturePrefsStore.batch2271.v2271substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2271: succeeded level
internal fun PlayerActivity.showV2271SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2271: suffered level
internal fun PlayerActivity.showV2271SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2271: suggested level
internal fun PlayerActivity.showV2271SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2271: summarized level
internal fun PlayerActivity.showV2271SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2271: supervised level
internal fun PlayerActivity.showV2271SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2271: supplied mode
internal fun PlayerActivity.showV2271SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271supplied
    FeaturePrefsStore.batch2271.v2271supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2271: supported mode
internal fun PlayerActivity.showV2271SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271supported
    FeaturePrefsStore.batch2271.v2271supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2271: suppressed mode
internal fun PlayerActivity.showV2271SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271suppressed
    FeaturePrefsStore.batch2271.v2271suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2271: surpassed mode
internal fun PlayerActivity.showV2271SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271surpassed
    FeaturePrefsStore.batch2271.v2271surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2271: surrounded mode
internal fun PlayerActivity.showV2271SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271surrounded
    FeaturePrefsStore.batch2271.v2271surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2272: struggled mode
internal fun PlayerActivity.showV2272StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2272struggled
    FeaturePrefsStore.batch2271.v2272struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2272: stuck mode
internal fun PlayerActivity.showV2272StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2272stuck
    FeaturePrefsStore.batch2271.v2272stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2272: studied mode
internal fun PlayerActivity.showV2272StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272studied
    FeaturePrefsStore.batch2271.v2272studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2272: submitted mode
internal fun PlayerActivity.showV2272SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272submitted
    FeaturePrefsStore.batch2271.v2272submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2272: substituted mode
internal fun PlayerActivity.showV2272SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272substituted
    FeaturePrefsStore.batch2271.v2272substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2272: succeeded level
internal fun PlayerActivity.showV2272SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2272: suffered level
internal fun PlayerActivity.showV2272SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2272: suggested level
internal fun PlayerActivity.showV2272SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2272: summarized level
internal fun PlayerActivity.showV2272SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2272: supervised level
internal fun PlayerActivity.showV2272SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2272: supplied mode
internal fun PlayerActivity.showV2272SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272supplied
    FeaturePrefsStore.batch2271.v2272supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2272: supported mode
internal fun PlayerActivity.showV2272SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272supported
    FeaturePrefsStore.batch2271.v2272supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2272: suppressed mode
internal fun PlayerActivity.showV2272SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272suppressed
    FeaturePrefsStore.batch2271.v2272suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2272: surpassed mode
internal fun PlayerActivity.showV2272SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272surpassed
    FeaturePrefsStore.batch2271.v2272surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2272: surrounded mode
internal fun PlayerActivity.showV2272SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272surrounded
    FeaturePrefsStore.batch2271.v2272surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2273: struggled mode
internal fun PlayerActivity.showV2273StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2273struggled
    FeaturePrefsStore.batch2271.v2273struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2273: stuck mode
internal fun PlayerActivity.showV2273StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2273stuck
    FeaturePrefsStore.batch2271.v2273stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2273: studied mode
internal fun PlayerActivity.showV2273StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273studied
    FeaturePrefsStore.batch2271.v2273studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2273: submitted mode
internal fun PlayerActivity.showV2273SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273submitted
    FeaturePrefsStore.batch2271.v2273submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2273: substituted mode
internal fun PlayerActivity.showV2273SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273substituted
    FeaturePrefsStore.batch2271.v2273substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2273: succeeded level
internal fun PlayerActivity.showV2273SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2273: suffered level
internal fun PlayerActivity.showV2273SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2273: suggested level
internal fun PlayerActivity.showV2273SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2273: summarized level
internal fun PlayerActivity.showV2273SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2273: supervised level
internal fun PlayerActivity.showV2273SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2273: supplied mode
internal fun PlayerActivity.showV2273SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273supplied
    FeaturePrefsStore.batch2271.v2273supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2273: supported mode
internal fun PlayerActivity.showV2273SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273supported
    FeaturePrefsStore.batch2271.v2273supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2273: suppressed mode
internal fun PlayerActivity.showV2273SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273suppressed
    FeaturePrefsStore.batch2271.v2273suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2273: surpassed mode
internal fun PlayerActivity.showV2273SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273surpassed
    FeaturePrefsStore.batch2271.v2273surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2273: surrounded mode
internal fun PlayerActivity.showV2273SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273surrounded
    FeaturePrefsStore.batch2271.v2273surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2274: struggled mode
internal fun PlayerActivity.showV2274StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2274struggled
    FeaturePrefsStore.batch2271.v2274struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2274: stuck mode
internal fun PlayerActivity.showV2274StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2274stuck
    FeaturePrefsStore.batch2271.v2274stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2274: studied mode
internal fun PlayerActivity.showV2274StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274studied
    FeaturePrefsStore.batch2271.v2274studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2274: submitted mode
internal fun PlayerActivity.showV2274SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274submitted
    FeaturePrefsStore.batch2271.v2274submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2274: substituted mode
internal fun PlayerActivity.showV2274SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274substituted
    FeaturePrefsStore.batch2271.v2274substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2274: succeeded level
internal fun PlayerActivity.showV2274SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2274: suffered level
internal fun PlayerActivity.showV2274SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2274: suggested level
internal fun PlayerActivity.showV2274SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2274: summarized level
internal fun PlayerActivity.showV2274SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2274: supervised level
internal fun PlayerActivity.showV2274SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2274: supplied mode
internal fun PlayerActivity.showV2274SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274supplied
    FeaturePrefsStore.batch2271.v2274supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2274: supported mode
internal fun PlayerActivity.showV2274SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274supported
    FeaturePrefsStore.batch2271.v2274supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2274: suppressed mode
internal fun PlayerActivity.showV2274SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274suppressed
    FeaturePrefsStore.batch2271.v2274suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2274: surpassed mode
internal fun PlayerActivity.showV2274SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274surpassed
    FeaturePrefsStore.batch2271.v2274surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2274: surrounded mode
internal fun PlayerActivity.showV2274SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274surrounded
    FeaturePrefsStore.batch2271.v2274surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2275: struggled mode
internal fun PlayerActivity.showV2275StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2275struggled
    FeaturePrefsStore.batch2271.v2275struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2275: stuck mode
internal fun PlayerActivity.showV2275StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2275stuck
    FeaturePrefsStore.batch2271.v2275stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2275: studied mode
internal fun PlayerActivity.showV2275StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275studied
    FeaturePrefsStore.batch2271.v2275studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2275: submitted mode
internal fun PlayerActivity.showV2275SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275submitted
    FeaturePrefsStore.batch2271.v2275submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2275: substituted mode
internal fun PlayerActivity.showV2275SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275substituted
    FeaturePrefsStore.batch2271.v2275substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2275: succeeded level
internal fun PlayerActivity.showV2275SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2275: suffered level
internal fun PlayerActivity.showV2275SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2275: suggested level
internal fun PlayerActivity.showV2275SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2275: summarized level
internal fun PlayerActivity.showV2275SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2275: supervised level
internal fun PlayerActivity.showV2275SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2275: supplied mode
internal fun PlayerActivity.showV2275SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275supplied
    FeaturePrefsStore.batch2271.v2275supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2275: supported mode
internal fun PlayerActivity.showV2275SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275supported
    FeaturePrefsStore.batch2271.v2275supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2275: suppressed mode
internal fun PlayerActivity.showV2275SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275suppressed
    FeaturePrefsStore.batch2271.v2275suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2275: surpassed mode
internal fun PlayerActivity.showV2275SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275surpassed
    FeaturePrefsStore.batch2271.v2275surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2275: surrounded mode
internal fun PlayerActivity.showV2275SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275surrounded
    FeaturePrefsStore.batch2271.v2275surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2276: struggled mode
internal fun PlayerActivity.showV2276StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2276struggled
    FeaturePrefsStore.batch2271.v2276struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2276: stuck mode
internal fun PlayerActivity.showV2276StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2276stuck
    FeaturePrefsStore.batch2271.v2276stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2276: studied mode
internal fun PlayerActivity.showV2276StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276studied
    FeaturePrefsStore.batch2271.v2276studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2276: submitted mode
internal fun PlayerActivity.showV2276SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276submitted
    FeaturePrefsStore.batch2271.v2276submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2276: substituted mode
internal fun PlayerActivity.showV2276SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276substituted
    FeaturePrefsStore.batch2271.v2276substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2276: succeeded level
internal fun PlayerActivity.showV2276SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2276: suffered level
internal fun PlayerActivity.showV2276SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2276: suggested level
internal fun PlayerActivity.showV2276SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2276: summarized level
internal fun PlayerActivity.showV2276SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2276: supervised level
internal fun PlayerActivity.showV2276SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2276: supplied mode
internal fun PlayerActivity.showV2276SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276supplied
    FeaturePrefsStore.batch2271.v2276supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2276: supported mode
internal fun PlayerActivity.showV2276SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276supported
    FeaturePrefsStore.batch2271.v2276supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2276: suppressed mode
internal fun PlayerActivity.showV2276SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276suppressed
    FeaturePrefsStore.batch2271.v2276suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2276: surpassed mode
internal fun PlayerActivity.showV2276SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276surpassed
    FeaturePrefsStore.batch2271.v2276surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2276: surrounded mode
internal fun PlayerActivity.showV2276SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276surrounded
    FeaturePrefsStore.batch2271.v2276surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2277: struggled mode
internal fun PlayerActivity.showV2277StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2277struggled
    FeaturePrefsStore.batch2271.v2277struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2277: stuck mode
internal fun PlayerActivity.showV2277StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2277stuck
    FeaturePrefsStore.batch2271.v2277stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2277: studied mode
internal fun PlayerActivity.showV2277StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277studied
    FeaturePrefsStore.batch2271.v2277studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2277: submitted mode
internal fun PlayerActivity.showV2277SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277submitted
    FeaturePrefsStore.batch2271.v2277submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2277: substituted mode
internal fun PlayerActivity.showV2277SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277substituted
    FeaturePrefsStore.batch2271.v2277substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2277: succeeded level
internal fun PlayerActivity.showV2277SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2277: suffered level
internal fun PlayerActivity.showV2277SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2277: suggested level
internal fun PlayerActivity.showV2277SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2277: summarized level
internal fun PlayerActivity.showV2277SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2277: supervised level
internal fun PlayerActivity.showV2277SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2277: supplied mode
internal fun PlayerActivity.showV2277SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277supplied
    FeaturePrefsStore.batch2271.v2277supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2277: supported mode
internal fun PlayerActivity.showV2277SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277supported
    FeaturePrefsStore.batch2271.v2277supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2277: suppressed mode
internal fun PlayerActivity.showV2277SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277suppressed
    FeaturePrefsStore.batch2271.v2277suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2277: surpassed mode
internal fun PlayerActivity.showV2277SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277surpassed
    FeaturePrefsStore.batch2271.v2277surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2277: surrounded mode
internal fun PlayerActivity.showV2277SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277surrounded
    FeaturePrefsStore.batch2271.v2277surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2278: struggled mode
internal fun PlayerActivity.showV2278StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2278struggled
    FeaturePrefsStore.batch2271.v2278struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2278: stuck mode
internal fun PlayerActivity.showV2278StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2278stuck
    FeaturePrefsStore.batch2271.v2278stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2278: studied mode
internal fun PlayerActivity.showV2278StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278studied
    FeaturePrefsStore.batch2271.v2278studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2278: submitted mode
internal fun PlayerActivity.showV2278SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278submitted
    FeaturePrefsStore.batch2271.v2278submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2278: substituted mode
internal fun PlayerActivity.showV2278SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278substituted
    FeaturePrefsStore.batch2271.v2278substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2278: succeeded level
internal fun PlayerActivity.showV2278SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2278: suffered level
internal fun PlayerActivity.showV2278SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2278: suggested level
internal fun PlayerActivity.showV2278SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2278: summarized level
internal fun PlayerActivity.showV2278SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2278: supervised level
internal fun PlayerActivity.showV2278SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2278: supplied mode
internal fun PlayerActivity.showV2278SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278supplied
    FeaturePrefsStore.batch2271.v2278supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2278: supported mode
internal fun PlayerActivity.showV2278SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278supported
    FeaturePrefsStore.batch2271.v2278supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2278: suppressed mode
internal fun PlayerActivity.showV2278SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278suppressed
    FeaturePrefsStore.batch2271.v2278suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2278: surpassed mode
internal fun PlayerActivity.showV2278SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278surpassed
    FeaturePrefsStore.batch2271.v2278surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2278: surrounded mode
internal fun PlayerActivity.showV2278SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278surrounded
    FeaturePrefsStore.batch2271.v2278surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2279: struggled mode
internal fun PlayerActivity.showV2279StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2279struggled
    FeaturePrefsStore.batch2271.v2279struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2279: stuck mode
internal fun PlayerActivity.showV2279StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2279stuck
    FeaturePrefsStore.batch2271.v2279stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2279: studied mode
internal fun PlayerActivity.showV2279StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279studied
    FeaturePrefsStore.batch2271.v2279studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2279: submitted mode
internal fun PlayerActivity.showV2279SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279submitted
    FeaturePrefsStore.batch2271.v2279submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2279: substituted mode
internal fun PlayerActivity.showV2279SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279substituted
    FeaturePrefsStore.batch2271.v2279substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2279: succeeded level
internal fun PlayerActivity.showV2279SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2279: suffered level
internal fun PlayerActivity.showV2279SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2279: suggested level
internal fun PlayerActivity.showV2279SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2279: summarized level
internal fun PlayerActivity.showV2279SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2279: supervised level
internal fun PlayerActivity.showV2279SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2279: supplied mode
internal fun PlayerActivity.showV2279SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279supplied
    FeaturePrefsStore.batch2271.v2279supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2279: supported mode
internal fun PlayerActivity.showV2279SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279supported
    FeaturePrefsStore.batch2271.v2279supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2279: suppressed mode
internal fun PlayerActivity.showV2279SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279suppressed
    FeaturePrefsStore.batch2271.v2279suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2279: surpassed mode
internal fun PlayerActivity.showV2279SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279surpassed
    FeaturePrefsStore.batch2271.v2279surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2279: surrounded mode
internal fun PlayerActivity.showV2279SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279surrounded
    FeaturePrefsStore.batch2271.v2279surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2280: struggled mode
internal fun PlayerActivity.showV2280StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2280struggled
    FeaturePrefsStore.batch2271.v2280struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2280: stuck mode
internal fun PlayerActivity.showV2280StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2280stuck
    FeaturePrefsStore.batch2271.v2280stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2280: studied mode
internal fun PlayerActivity.showV2280StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280studied
    FeaturePrefsStore.batch2271.v2280studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2280: submitted mode
internal fun PlayerActivity.showV2280SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280submitted
    FeaturePrefsStore.batch2271.v2280submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2280: substituted mode
internal fun PlayerActivity.showV2280SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280substituted
    FeaturePrefsStore.batch2271.v2280substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2280: succeeded level
internal fun PlayerActivity.showV2280SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2280: suffered level
internal fun PlayerActivity.showV2280SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2280: suggested level
internal fun PlayerActivity.showV2280SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2280: summarized level
internal fun PlayerActivity.showV2280SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2280: supervised level
internal fun PlayerActivity.showV2280SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2280: supplied mode
internal fun PlayerActivity.showV2280SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280supplied
    FeaturePrefsStore.batch2271.v2280supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2280: supported mode
internal fun PlayerActivity.showV2280SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280supported
    FeaturePrefsStore.batch2271.v2280supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2280: suppressed mode
internal fun PlayerActivity.showV2280SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280suppressed
    FeaturePrefsStore.batch2271.v2280suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2280: surpassed mode
internal fun PlayerActivity.showV2280SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280surpassed
    FeaturePrefsStore.batch2271.v2280surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2280: surrounded mode
internal fun PlayerActivity.showV2280SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280surrounded
    FeaturePrefsStore.batch2271.v2280surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v289: Danmaku Bottom Max Count386
internal fun PlayerActivity.showV289DanmakuBottomMaxCount386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289danmakuBottomMaxCount386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289danmakuBottomMaxCount386 = value
        AppToast.show(this, "Danmaku Bottom Max Count386: $value")
    }
}

// v289: Subtitle Bg Border393
internal fun PlayerActivity.showV289SubtitleBgBorder393Toggle() {
    val current = BiliClient.prefs.v289subtitleBgBorder393
    BiliClient.prefs.v289subtitleBgBorder393 = !current
    AppToast.show(this, "Subtitle Bg Border393: ${if (!current) "ON" else "OFF"}")
}

// v290: Audio EQ Custom290
internal fun PlayerActivity.showV290AudioEQCustom290Toggle() {
    val current = BiliClient.prefs.v290audioEQCustom290
    BiliClient.prefs.v290audioEQCustom290 = !current
    AppToast.show(this, "Audio EQ Custom290: ${if (!current) "ON" else "OFF"}")
}

// v290: Danmaku Bottom Max Count387
internal fun PlayerActivity.showV290DanmakuBottomMaxCount387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount387 = value
        AppToast.show(this, "Danmaku Bottom Max Count387: $value")
    }
}

// v290: Subtitle Bg Border394
internal fun PlayerActivity.showV290SubtitleBgBorder394Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder394
    BiliClient.prefs.v290subtitleBgBorder394 = !current
    AppToast.show(this, "Subtitle Bg Border394: ${if (!current) "ON" else "OFF"}")
}

// v290: Gesture Shake Action290
internal fun PlayerActivity.showV290GestureShakeAction290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290gestureShakeAction290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290gestureShakeAction290 = value
        AppToast.show(this, "Gesture Shake Action290: $value")
    }
}

// v290: Cast Audio Volume290
internal fun PlayerActivity.showV290CastAudioVolume290Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v290castAudioVolume290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290castAudioVolume290 = value
        AppToast.show(this, "Cast Audio Volume290: $value")
    }
}

// v290: Playlist Auto Skip Outro290
internal fun PlayerActivity.showV290PlaylistAutoSkipOutro290Toggle() {
    val current = BiliClient.prefs.v290playlistAutoSkipOutro290
    BiliClient.prefs.v290playlistAutoSkipOutro290 = !current
    AppToast.show(this, "Playlist Auto Skip Outro290: ${if (!current) "ON" else "OFF"}")
}

// v290: Cache Download Speed291
internal fun PlayerActivity.showV290CacheDownloadSpeed291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290cacheDownloadSpeed291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290cacheDownloadSpeed291 = value
        AppToast.show(this, "Cache Download Speed291: $value")
    }
}

// v290: Progress Bar Thumb Border290
internal fun PlayerActivity.showV290ProgressBarThumbBorder290Toggle() {
    val current = BiliClient.prefs.v290progressBarThumbBorder290
    BiliClient.prefs.v290progressBarThumbBorder290 = !current
    AppToast.show(this, "Progress Bar Thumb Border290: ${if (!current) "ON" else "OFF"}")
}

// v290: Volume Boost Peak290
internal fun PlayerActivity.showV290VolumeBoostPeak290Toggle() {
    val current = BiliClient.prefs.v290volumeBoostPeak290
    BiliClient.prefs.v290volumeBoostPeak290 = !current
    AppToast.show(this, "Volume Boost Peak290: ${if (!current) "ON" else "OFF"}")
}

// v290: History Bookmark Export290
internal fun PlayerActivity.showV290HistoryBookmarkExport290Toggle() {
    val current = BiliClient.prefs.v290historyBookmarkExport290
    BiliClient.prefs.v290historyBookmarkExport290 = !current
    AppToast.show(this, "History Bookmark Export290: ${if (!current) "ON" else "OFF"}")
}

// v290: Playback Chapter Sync290
internal fun PlayerActivity.showV290PlaybackChapterSync290Toggle() {
    val current = BiliClient.prefs.v290playbackChapterSync290
    BiliClient.prefs.v290playbackChapterSync290 = !current
    AppToast.show(this, "Playback Chapter Sync290: ${if (!current) "ON" else "OFF"}")
}

// v290: Screenshot Save Path290
internal fun PlayerActivity.showV290ScreenshotSavePath290Toggle() {
    val current = BiliClient.prefs.v290screenshotSavePath290
    BiliClient.prefs.v290screenshotSavePath290 = !current
    AppToast.show(this, "Screenshot Save Path290: ${if (!current) "ON" else "OFF"}")
}

// v290: Video Color Space290
internal fun PlayerActivity.showV290VideoColorSpace290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290videoColorSpace290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290videoColorSpace290 = value
        AppToast.show(this, "Video Color Space290: $value")
    }
}

// v290: Danmaku Bottom Max Count388
internal fun PlayerActivity.showV290DanmakuBottomMaxCount388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount388 = value
        AppToast.show(this, "Danmaku Bottom Max Count388: $value")
    }
}

// v290: Subtitle Bg Border395
internal fun PlayerActivity.showV290SubtitleBgBorder395Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder395
    BiliClient.prefs.v290subtitleBgBorder395 = !current
    AppToast.show(this, "Subtitle Bg Border395: ${if (!current) "ON" else "OFF"}")
}

// v291: Audio EQ Custom291
internal fun PlayerActivity.showV291AudioEQCustom291Toggle() {
    val current = BiliClient.prefs.v291audioEQCustom291
    BiliClient.prefs.v291audioEQCustom291 = !current
    AppToast.show(this, "Audio EQ Custom291: ${if (!current) "ON" else "OFF"}")
}

// v291: Danmaku Bottom Max Count389
internal fun PlayerActivity.showV291DanmakuBottomMaxCount389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount389 = value
        AppToast.show(this, "Danmaku Bottom Max Count389: $value")
    }
}

// v291: Subtitle Bg Border396
internal fun PlayerActivity.showV291SubtitleBgBorder396Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder396
    BiliClient.prefs.v291subtitleBgBorder396 = !current
    AppToast.show(this, "Subtitle Bg Border396: ${if (!current) "ON" else "OFF"}")
}

// v291: Gesture Shake Action291
internal fun PlayerActivity.showV291GestureShakeAction291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291gestureShakeAction291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291gestureShakeAction291 = value
        AppToast.show(this, "Gesture Shake Action291: $value")
    }
}

// v291: Cast Audio Volume291
internal fun PlayerActivity.showV291CastAudioVolume291Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v291castAudioVolume291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291castAudioVolume291 = value
        AppToast.show(this, "Cast Audio Volume291: $value")
    }
}

// v291: Playlist Auto Skip Outro291
internal fun PlayerActivity.showV291PlaylistAutoSkipOutro291Toggle() {
    val current = BiliClient.prefs.v291playlistAutoSkipOutro291
    BiliClient.prefs.v291playlistAutoSkipOutro291 = !current
    AppToast.show(this, "Playlist Auto Skip Outro291: ${if (!current) "ON" else "OFF"}")
}

// v291: Cache Download Speed292
internal fun PlayerActivity.showV291CacheDownloadSpeed292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291cacheDownloadSpeed292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291cacheDownloadSpeed292 = value
        AppToast.show(this, "Cache Download Speed292: $value")
    }
}

// v291: Progress Bar Thumb Border291
internal fun PlayerActivity.showV291ProgressBarThumbBorder291Toggle() {
    val current = BiliClient.prefs.v291progressBarThumbBorder291
    BiliClient.prefs.v291progressBarThumbBorder291 = !current
    AppToast.show(this, "Progress Bar Thumb Border291: ${if (!current) "ON" else "OFF"}")
}

// v291: Volume Boost Peak291
internal fun PlayerActivity.showV291VolumeBoostPeak291Toggle() {
    val current = BiliClient.prefs.v291volumeBoostPeak291
    BiliClient.prefs.v291volumeBoostPeak291 = !current
    AppToast.show(this, "Volume Boost Peak291: ${if (!current) "ON" else "OFF"}")
}

// v291: History Bookmark Export291
internal fun PlayerActivity.showV291HistoryBookmarkExport291Toggle() {
    val current = BiliClient.prefs.v291historyBookmarkExport291
    BiliClient.prefs.v291historyBookmarkExport291 = !current
    AppToast.show(this, "History Bookmark Export291: ${if (!current) "ON" else "OFF"}")
}

// v291: Playback Chapter Sync291
internal fun PlayerActivity.showV291PlaybackChapterSync291Toggle() {
    val current = BiliClient.prefs.v291playbackChapterSync291
    BiliClient.prefs.v291playbackChapterSync291 = !current
    AppToast.show(this, "Playback Chapter Sync291: ${if (!current) "ON" else "OFF"}")
}

// v291: Screenshot Save Path291
internal fun PlayerActivity.showV291ScreenshotSavePath291Toggle() {
    val current = BiliClient.prefs.v291screenshotSavePath291
    BiliClient.prefs.v291screenshotSavePath291 = !current
    AppToast.show(this, "Screenshot Save Path291: ${if (!current) "ON" else "OFF"}")
}

// v291: Video Color Space291
internal fun PlayerActivity.showV291VideoColorSpace291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291videoColorSpace291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291videoColorSpace291 = value
        AppToast.show(this, "Video Color Space291: $value")
    }
}

// v291: Danmaku Bottom Max Count390
internal fun PlayerActivity.showV291DanmakuBottomMaxCount390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount390 = value
        AppToast.show(this, "Danmaku Bottom Max Count390: $value")
    }
}

// v291: Subtitle Bg Border397
internal fun PlayerActivity.showV291SubtitleBgBorder397Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder397
    BiliClient.prefs.v291subtitleBgBorder397 = !current
    AppToast.show(this, "Subtitle Bg Border397: ${if (!current) "ON" else "OFF"}")
}

// v292: Audio EQ Custom292
internal fun PlayerActivity.showV292AudioEQCustom292Toggle() {
    val current = BiliClient.prefs.v292audioEQCustom292
    BiliClient.prefs.v292audioEQCustom292 = !current
    AppToast.show(this, "Audio EQ Custom292: ${if (!current) "ON" else "OFF"}")
}

// v292: Danmaku Bottom Max Count391
internal fun PlayerActivity.showV292DanmakuBottomMaxCount391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount391 = value
        AppToast.show(this, "Danmaku Bottom Max Count391: $value")
    }
}

// v292: Subtitle Bg Border398
internal fun PlayerActivity.showV292SubtitleBgBorder398Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder398
    BiliClient.prefs.v292subtitleBgBorder398 = !current
    AppToast.show(this, "Subtitle Bg Border398: ${if (!current) "ON" else "OFF"}")
}

// v292: Gesture Shake Action292
internal fun PlayerActivity.showV292GestureShakeAction292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292gestureShakeAction292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292gestureShakeAction292 = value
        AppToast.show(this, "Gesture Shake Action292: $value")
    }
}

// v292: Cast Audio Volume292
internal fun PlayerActivity.showV292CastAudioVolume292Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v292castAudioVolume292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292castAudioVolume292 = value
        AppToast.show(this, "Cast Audio Volume292: $value")
    }
}

// v292: Playlist Auto Skip Outro292
internal fun PlayerActivity.showV292PlaylistAutoSkipOutro292Toggle() {
    val current = BiliClient.prefs.v292playlistAutoSkipOutro292
    BiliClient.prefs.v292playlistAutoSkipOutro292 = !current
    AppToast.show(this, "Playlist Auto Skip Outro292: ${if (!current) "ON" else "OFF"}")
}

// v292: Cache Download Speed293
internal fun PlayerActivity.showV292CacheDownloadSpeed293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292cacheDownloadSpeed293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292cacheDownloadSpeed293 = value
        AppToast.show(this, "Cache Download Speed293: $value")
    }
}

// v292: Progress Bar Thumb Border292
internal fun PlayerActivity.showV292ProgressBarThumbBorder292Toggle() {
    val current = BiliClient.prefs.v292progressBarThumbBorder292
    BiliClient.prefs.v292progressBarThumbBorder292 = !current
    AppToast.show(this, "Progress Bar Thumb Border292: ${if (!current) "ON" else "OFF"}")
}

// v292: Volume Boost Peak292
internal fun PlayerActivity.showV292VolumeBoostPeak292Toggle() {
    val current = BiliClient.prefs.v292volumeBoostPeak292
    BiliClient.prefs.v292volumeBoostPeak292 = !current
    AppToast.show(this, "Volume Boost Peak292: ${if (!current) "ON" else "OFF"}")
}

// v292: History Bookmark Export292
internal fun PlayerActivity.showV292HistoryBookmarkExport292Toggle() {
    val current = BiliClient.prefs.v292historyBookmarkExport292
    BiliClient.prefs.v292historyBookmarkExport292 = !current
    AppToast.show(this, "History Bookmark Export292: ${if (!current) "ON" else "OFF"}")
}

// v292: Playback Chapter Sync292
internal fun PlayerActivity.showV292PlaybackChapterSync292Toggle() {
    val current = BiliClient.prefs.v292playbackChapterSync292
    BiliClient.prefs.v292playbackChapterSync292 = !current
    AppToast.show(this, "Playback Chapter Sync292: ${if (!current) "ON" else "OFF"}")
}

// v292: Screenshot Save Path292
internal fun PlayerActivity.showV292ScreenshotSavePath292Toggle() {
    val current = BiliClient.prefs.v292screenshotSavePath292
    BiliClient.prefs.v292screenshotSavePath292 = !current
    AppToast.show(this, "Screenshot Save Path292: ${if (!current) "ON" else "OFF"}")
}

// v292: Video Color Space292
internal fun PlayerActivity.showV292VideoColorSpace292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292videoColorSpace292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292videoColorSpace292 = value
        AppToast.show(this, "Video Color Space292: $value")
    }
}

// v292: Danmaku Bottom Max Count392
internal fun PlayerActivity.showV292DanmakuBottomMaxCount392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount392 = value
        AppToast.show(this, "Danmaku Bottom Max Count392: $value")
    }
}

// v292: Subtitle Bg Border399
internal fun PlayerActivity.showV292SubtitleBgBorder399Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder399
    BiliClient.prefs.v292subtitleBgBorder399 = !current
    AppToast.show(this, "Subtitle Bg Border399: ${if (!current) "ON" else "OFF"}")
}

// v293: Audio EQ Custom293
internal fun PlayerActivity.showV293AudioEQCustom293Toggle() {
    val current = BiliClient.prefs.v293audioEQCustom293
    BiliClient.prefs.v293audioEQCustom293 = !current
    AppToast.show(this, "Audio EQ Custom293: ${if (!current) "ON" else "OFF"}")
}

// v293: Danmaku Bottom Max Count393
internal fun PlayerActivity.showV293DanmakuBottomMaxCount393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount393 = value
        AppToast.show(this, "Danmaku Bottom Max Count393: $value")
    }
}

// v293: Subtitle Bg Border400
internal fun PlayerActivity.showV293SubtitleBgBorder400Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder400
    BiliClient.prefs.v293subtitleBgBorder400 = !current
    AppToast.show(this, "Subtitle Bg Border400: ${if (!current) "ON" else "OFF"}")
}

// v293: Gesture Shake Action293
internal fun PlayerActivity.showV293GestureShakeAction293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293gestureShakeAction293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293gestureShakeAction293 = value
        AppToast.show(this, "Gesture Shake Action293: $value")
    }
}

// v293: Cast Audio Volume293
internal fun PlayerActivity.showV293CastAudioVolume293Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v293castAudioVolume293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293castAudioVolume293 = value
        AppToast.show(this, "Cast Audio Volume293: $value")
    }
}

// v293: Playlist Auto Skip Outro293
internal fun PlayerActivity.showV293PlaylistAutoSkipOutro293Toggle() {
    val current = BiliClient.prefs.v293playlistAutoSkipOutro293
    BiliClient.prefs.v293playlistAutoSkipOutro293 = !current
    AppToast.show(this, "Playlist Auto Skip Outro293: ${if (!current) "ON" else "OFF"}")
}

// v293: Cache Download Speed294
internal fun PlayerActivity.showV293CacheDownloadSpeed294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293cacheDownloadSpeed294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293cacheDownloadSpeed294 = value
        AppToast.show(this, "Cache Download Speed294: $value")
    }
}

// v293: Progress Bar Thumb Border293
internal fun PlayerActivity.showV293ProgressBarThumbBorder293Toggle() {
    val current = BiliClient.prefs.v293progressBarThumbBorder293
    BiliClient.prefs.v293progressBarThumbBorder293 = !current
    AppToast.show(this, "Progress Bar Thumb Border293: ${if (!current) "ON" else "OFF"}")
}

// v293: Volume Boost Peak293
internal fun PlayerActivity.showV293VolumeBoostPeak293Toggle() {
    val current = BiliClient.prefs.v293volumeBoostPeak293
    BiliClient.prefs.v293volumeBoostPeak293 = !current
    AppToast.show(this, "Volume Boost Peak293: ${if (!current) "ON" else "OFF"}")
}

// v293: History Bookmark Export293
internal fun PlayerActivity.showV293HistoryBookmarkExport293Toggle() {
    val current = BiliClient.prefs.v293historyBookmarkExport293
    BiliClient.prefs.v293historyBookmarkExport293 = !current
    AppToast.show(this, "History Bookmark Export293: ${if (!current) "ON" else "OFF"}")
}

// v293: Playback Chapter Sync293
internal fun PlayerActivity.showV293PlaybackChapterSync293Toggle() {
    val current = BiliClient.prefs.v293playbackChapterSync293
    BiliClient.prefs.v293playbackChapterSync293 = !current
    AppToast.show(this, "Playback Chapter Sync293: ${if (!current) "ON" else "OFF"}")
}

// v293: Screenshot Save Path293
internal fun PlayerActivity.showV293ScreenshotSavePath293Toggle() {
    val current = BiliClient.prefs.v293screenshotSavePath293
    BiliClient.prefs.v293screenshotSavePath293 = !current
    AppToast.show(this, "Screenshot Save Path293: ${if (!current) "ON" else "OFF"}")
}

// v293: Video Color Space293
internal fun PlayerActivity.showV293VideoColorSpace293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293videoColorSpace293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293videoColorSpace293 = value
        AppToast.show(this, "Video Color Space293: $value")
    }
}

// v293: Danmaku Bottom Max Count394
internal fun PlayerActivity.showV293DanmakuBottomMaxCount394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount394 = value
        AppToast.show(this, "Danmaku Bottom Max Count394: $value")
    }
}

// v293: Subtitle Bg Border401
internal fun PlayerActivity.showV293SubtitleBgBorder401Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder401
    BiliClient.prefs.v293subtitleBgBorder401 = !current
    AppToast.show(this, "Subtitle Bg Border401: ${if (!current) "ON" else "OFF"}")
}

// v294: Audio EQ Custom294
internal fun PlayerActivity.showV294AudioEQCustom294Toggle() {
    val current = BiliClient.prefs.v294audioEQCustom294
    BiliClient.prefs.v294audioEQCustom294 = !current
    AppToast.show(this, "Audio EQ Custom294: ${if (!current) "ON" else "OFF"}")
}

// v294: Danmaku Bottom Max Count395
internal fun PlayerActivity.showV294DanmakuBottomMaxCount395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount395 = value
        AppToast.show(this, "Danmaku Bottom Max Count395: $value")
    }
}

// v294: Subtitle Bg Border402
internal fun PlayerActivity.showV294SubtitleBgBorder402Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder402
    BiliClient.prefs.v294subtitleBgBorder402 = !current
    AppToast.show(this, "Subtitle Bg Border402: ${if (!current) "ON" else "OFF"}")
}

// v294: Gesture Shake Action294
internal fun PlayerActivity.showV294GestureShakeAction294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294gestureShakeAction294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294gestureShakeAction294 = value
        AppToast.show(this, "Gesture Shake Action294: $value")
    }
}

// v294: Cast Audio Volume294
internal fun PlayerActivity.showV294CastAudioVolume294Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v294castAudioVolume294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294castAudioVolume294 = value
        AppToast.show(this, "Cast Audio Volume294: $value")
    }
}

// v294: Playlist Auto Skip Outro294
internal fun PlayerActivity.showV294PlaylistAutoSkipOutro294Toggle() {
    val current = BiliClient.prefs.v294playlistAutoSkipOutro294
    BiliClient.prefs.v294playlistAutoSkipOutro294 = !current
    AppToast.show(this, "Playlist Auto Skip Outro294: ${if (!current) "ON" else "OFF"}")
}

// v294: Cache Download Speed295
internal fun PlayerActivity.showV294CacheDownloadSpeed295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294cacheDownloadSpeed295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294cacheDownloadSpeed295 = value
        AppToast.show(this, "Cache Download Speed295: $value")
    }
}

// v294: Progress Bar Thumb Border294
internal fun PlayerActivity.showV294ProgressBarThumbBorder294Toggle() {
    val current = BiliClient.prefs.v294progressBarThumbBorder294
    BiliClient.prefs.v294progressBarThumbBorder294 = !current
    AppToast.show(this, "Progress Bar Thumb Border294: ${if (!current) "ON" else "OFF"}")
}

// v294: Volume Boost Peak294
internal fun PlayerActivity.showV294VolumeBoostPeak294Toggle() {
    val current = BiliClient.prefs.v294volumeBoostPeak294
    BiliClient.prefs.v294volumeBoostPeak294 = !current
    AppToast.show(this, "Volume Boost Peak294: ${if (!current) "ON" else "OFF"}")
}

// v294: History Bookmark Export294
internal fun PlayerActivity.showV294HistoryBookmarkExport294Toggle() {
    val current = BiliClient.prefs.v294historyBookmarkExport294
    BiliClient.prefs.v294historyBookmarkExport294 = !current
    AppToast.show(this, "History Bookmark Export294: ${if (!current) "ON" else "OFF"}")
}

// v294: Playback Chapter Sync294
internal fun PlayerActivity.showV294PlaybackChapterSync294Toggle() {
    val current = BiliClient.prefs.v294playbackChapterSync294
    BiliClient.prefs.v294playbackChapterSync294 = !current
    AppToast.show(this, "Playback Chapter Sync294: ${if (!current) "ON" else "OFF"}")
}

// v294: Screenshot Save Path294
internal fun PlayerActivity.showV294ScreenshotSavePath294Toggle() {
    val current = BiliClient.prefs.v294screenshotSavePath294
    BiliClient.prefs.v294screenshotSavePath294 = !current
    AppToast.show(this, "Screenshot Save Path294: ${if (!current) "ON" else "OFF"}")
}

// v294: Video Color Space294
internal fun PlayerActivity.showV294VideoColorSpace294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294videoColorSpace294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294videoColorSpace294 = value
        AppToast.show(this, "Video Color Space294: $value")
    }
}

// v294: Danmaku Bottom Max Count396
internal fun PlayerActivity.showV294DanmakuBottomMaxCount396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount396 = value
        AppToast.show(this, "Danmaku Bottom Max Count396: $value")
    }
}

// v294: Subtitle Bg Border403
internal fun PlayerActivity.showV294SubtitleBgBorder403Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder403
    BiliClient.prefs.v294subtitleBgBorder403 = !current
    AppToast.show(this, "Subtitle Bg Border403: ${if (!current) "ON" else "OFF"}")
}

// v295: Audio EQ Custom295
internal fun PlayerActivity.showV295AudioEQCustom295Toggle() {
    val current = BiliClient.prefs.v295audioEQCustom295
    BiliClient.prefs.v295audioEQCustom295 = !current
    AppToast.show(this, "Audio EQ Custom295: ${if (!current) "ON" else "OFF"}")
}

// v295: Danmaku Bottom Max Count397
internal fun PlayerActivity.showV295DanmakuBottomMaxCount397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount397 = value
        AppToast.show(this, "Danmaku Bottom Max Count397: $value")
    }
}

// v295: Subtitle Bg Border404
internal fun PlayerActivity.showV295SubtitleBgBorder404Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder404
    BiliClient.prefs.v295subtitleBgBorder404 = !current
    AppToast.show(this, "Subtitle Bg Border404: ${if (!current) "ON" else "OFF"}")
}

// v295: Gesture Shake Action295
internal fun PlayerActivity.showV295GestureShakeAction295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295gestureShakeAction295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295gestureShakeAction295 = value
        AppToast.show(this, "Gesture Shake Action295: $value")
    }
}

// v295: Cast Audio Volume295
internal fun PlayerActivity.showV295CastAudioVolume295Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v295castAudioVolume295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295castAudioVolume295 = value
        AppToast.show(this, "Cast Audio Volume295: $value")
    }
}

// v295: Playlist Auto Skip Outro295
internal fun PlayerActivity.showV295PlaylistAutoSkipOutro295Toggle() {
    val current = BiliClient.prefs.v295playlistAutoSkipOutro295
    BiliClient.prefs.v295playlistAutoSkipOutro295 = !current
    AppToast.show(this, "Playlist Auto Skip Outro295: ${if (!current) "ON" else "OFF"}")
}

// v295: Cache Download Speed296
internal fun PlayerActivity.showV295CacheDownloadSpeed296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295cacheDownloadSpeed296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295cacheDownloadSpeed296 = value
        AppToast.show(this, "Cache Download Speed296: $value")
    }
}

// v295: Progress Bar Thumb Border295
internal fun PlayerActivity.showV295ProgressBarThumbBorder295Toggle() {
    val current = BiliClient.prefs.v295progressBarThumbBorder295
    BiliClient.prefs.v295progressBarThumbBorder295 = !current
    AppToast.show(this, "Progress Bar Thumb Border295: ${if (!current) "ON" else "OFF"}")
}

// v295: Volume Boost Peak295
internal fun PlayerActivity.showV295VolumeBoostPeak295Toggle() {
    val current = BiliClient.prefs.v295volumeBoostPeak295
    BiliClient.prefs.v295volumeBoostPeak295 = !current
    AppToast.show(this, "Volume Boost Peak295: ${if (!current) "ON" else "OFF"}")
}

// v295: History Bookmark Export295
internal fun PlayerActivity.showV295HistoryBookmarkExport295Toggle() {
    val current = BiliClient.prefs.v295historyBookmarkExport295
    BiliClient.prefs.v295historyBookmarkExport295 = !current
    AppToast.show(this, "History Bookmark Export295: ${if (!current) "ON" else "OFF"}")
}

// v295: Playback Chapter Sync295
internal fun PlayerActivity.showV295PlaybackChapterSync295Toggle() {
    val current = BiliClient.prefs.v295playbackChapterSync295
    BiliClient.prefs.v295playbackChapterSync295 = !current
    AppToast.show(this, "Playback Chapter Sync295: ${if (!current) "ON" else "OFF"}")
}

// v295: Screenshot Save Path295
internal fun PlayerActivity.showV295ScreenshotSavePath295Toggle() {
    val current = BiliClient.prefs.v295screenshotSavePath295
    BiliClient.prefs.v295screenshotSavePath295 = !current
    AppToast.show(this, "Screenshot Save Path295: ${if (!current) "ON" else "OFF"}")
}

// v295: Video Color Space295
internal fun PlayerActivity.showV295VideoColorSpace295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295videoColorSpace295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295videoColorSpace295 = value
        AppToast.show(this, "Video Color Space295: $value")
    }
}

// v295: Danmaku Bottom Max Count398
internal fun PlayerActivity.showV295DanmakuBottomMaxCount398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount398 = value
        AppToast.show(this, "Danmaku Bottom Max Count398: $value")
    }
}

// v295: Subtitle Bg Border405
internal fun PlayerActivity.showV295SubtitleBgBorder405Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder405
    BiliClient.prefs.v295subtitleBgBorder405 = !current
    AppToast.show(this, "Subtitle Bg Border405: ${if (!current) "ON" else "OFF"}")
}

// v296: Audio EQ Custom296
internal fun PlayerActivity.showV296AudioEQCustom296Toggle() {
    val current = BiliClient.prefs.v296audioEQCustom296
    BiliClient.prefs.v296audioEQCustom296 = !current
    AppToast.show(this, "Audio EQ Custom296: ${if (!current) "ON" else "OFF"}")
}

// v296: Danmaku Bottom Max Count399
internal fun PlayerActivity.showV296DanmakuBottomMaxCount399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount399 = value
        AppToast.show(this, "Danmaku Bottom Max Count399: $value")
    }
}

// v296: Subtitle Bg Border406
internal fun PlayerActivity.showV296SubtitleBgBorder406Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder406
    BiliClient.prefs.v296subtitleBgBorder406 = !current
    AppToast.show(this, "Subtitle Bg Border406: ${if (!current) "ON" else "OFF"}")
}

// v296: Gesture Shake Action296
internal fun PlayerActivity.showV296GestureShakeAction296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296gestureShakeAction296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296gestureShakeAction296 = value
        AppToast.show(this, "Gesture Shake Action296: $value")
    }
}

// v296: Cast Audio Volume296
internal fun PlayerActivity.showV296CastAudioVolume296Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v296castAudioVolume296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296castAudioVolume296 = value
        AppToast.show(this, "Cast Audio Volume296: $value")
    }
}

// v296: Playlist Auto Skip Outro296
internal fun PlayerActivity.showV296PlaylistAutoSkipOutro296Toggle() {
    val current = BiliClient.prefs.v296playlistAutoSkipOutro296
    BiliClient.prefs.v296playlistAutoSkipOutro296 = !current
    AppToast.show(this, "Playlist Auto Skip Outro296: ${if (!current) "ON" else "OFF"}")
}

// v296: Cache Download Speed297
internal fun PlayerActivity.showV296CacheDownloadSpeed297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296cacheDownloadSpeed297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296cacheDownloadSpeed297 = value
        AppToast.show(this, "Cache Download Speed297: $value")
    }
}

// v296: Progress Bar Thumb Border296
internal fun PlayerActivity.showV296ProgressBarThumbBorder296Toggle() {
    val current = BiliClient.prefs.v296progressBarThumbBorder296
    BiliClient.prefs.v296progressBarThumbBorder296 = !current
    AppToast.show(this, "Progress Bar Thumb Border296: ${if (!current) "ON" else "OFF"}")
}

// v296: Volume Boost Peak296
internal fun PlayerActivity.showV296VolumeBoostPeak296Toggle() {
    val current = BiliClient.prefs.v296volumeBoostPeak296
    BiliClient.prefs.v296volumeBoostPeak296 = !current
    AppToast.show(this, "Volume Boost Peak296: ${if (!current) "ON" else "OFF"}")
}

// v296: History Bookmark Export296
internal fun PlayerActivity.showV296HistoryBookmarkExport296Toggle() {
    val current = BiliClient.prefs.v296historyBookmarkExport296
    BiliClient.prefs.v296historyBookmarkExport296 = !current
    AppToast.show(this, "History Bookmark Export296: ${if (!current) "ON" else "OFF"}")
}

// v296: Playback Chapter Sync296
internal fun PlayerActivity.showV296PlaybackChapterSync296Toggle() {
    val current = BiliClient.prefs.v296playbackChapterSync296
    BiliClient.prefs.v296playbackChapterSync296 = !current
    AppToast.show(this, "Playback Chapter Sync296: ${if (!current) "ON" else "OFF"}")
}

// v296: Screenshot Save Path296
internal fun PlayerActivity.showV296ScreenshotSavePath296Toggle() {
    val current = BiliClient.prefs.v296screenshotSavePath296
    BiliClient.prefs.v296screenshotSavePath296 = !current
    AppToast.show(this, "Screenshot Save Path296: ${if (!current) "ON" else "OFF"}")
}

// v296: Video Color Space296
internal fun PlayerActivity.showV296VideoColorSpace296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296videoColorSpace296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296videoColorSpace296 = value
        AppToast.show(this, "Video Color Space296: $value")
    }
}

// v296: Danmaku Bottom Max Count400
internal fun PlayerActivity.showV296DanmakuBottomMaxCount400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount400 = value
        AppToast.show(this, "Danmaku Bottom Max Count400: $value")
    }
}

// v296: Subtitle Bg Border407
internal fun PlayerActivity.showV296SubtitleBgBorder407Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder407
    BiliClient.prefs.v296subtitleBgBorder407 = !current
    AppToast.show(this, "Subtitle Bg Border407: ${if (!current) "ON" else "OFF"}")
}

// v297: Audio EQ Custom297
internal fun PlayerActivity.showV297AudioEQCustom297Toggle() {
    val current = BiliClient.prefs.v297audioEQCustom297
    BiliClient.prefs.v297audioEQCustom297 = !current
    AppToast.show(this, "Audio EQ Custom297: ${if (!current) "ON" else "OFF"}")
}

// v297: Danmaku Bottom Max Count401
internal fun PlayerActivity.showV297DanmakuBottomMaxCount401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount401 = value
        AppToast.show(this, "Danmaku Bottom Max Count401: $value")
    }
}

// v297: Subtitle Bg Border408
internal fun PlayerActivity.showV297SubtitleBgBorder408Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder408
    BiliClient.prefs.v297subtitleBgBorder408 = !current
    AppToast.show(this, "Subtitle Bg Border408: ${if (!current) "ON" else "OFF"}")
}

// v297: Gesture Shake Action297
internal fun PlayerActivity.showV297GestureShakeAction297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297gestureShakeAction297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297gestureShakeAction297 = value
        AppToast.show(this, "Gesture Shake Action297: $value")
    }
}

// v297: Cast Audio Volume297
internal fun PlayerActivity.showV297CastAudioVolume297Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v297castAudioVolume297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297castAudioVolume297 = value
        AppToast.show(this, "Cast Audio Volume297: $value")
    }
}

// v297: Playlist Auto Skip Outro297
internal fun PlayerActivity.showV297PlaylistAutoSkipOutro297Toggle() {
    val current = BiliClient.prefs.v297playlistAutoSkipOutro297
    BiliClient.prefs.v297playlistAutoSkipOutro297 = !current
    AppToast.show(this, "Playlist Auto Skip Outro297: ${if (!current) "ON" else "OFF"}")
}

// v297: Cache Download Speed298
internal fun PlayerActivity.showV297CacheDownloadSpeed298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297cacheDownloadSpeed298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297cacheDownloadSpeed298 = value
        AppToast.show(this, "Cache Download Speed298: $value")
    }
}

// v297: Progress Bar Thumb Border297
internal fun PlayerActivity.showV297ProgressBarThumbBorder297Toggle() {
    val current = BiliClient.prefs.v297progressBarThumbBorder297
    BiliClient.prefs.v297progressBarThumbBorder297 = !current
    AppToast.show(this, "Progress Bar Thumb Border297: ${if (!current) "ON" else "OFF"}")
}

// v297: Volume Boost Peak297
internal fun PlayerActivity.showV297VolumeBoostPeak297Toggle() {
    val current = BiliClient.prefs.v297volumeBoostPeak297
    BiliClient.prefs.v297volumeBoostPeak297 = !current
    AppToast.show(this, "Volume Boost Peak297: ${if (!current) "ON" else "OFF"}")
}

// v297: History Bookmark Export297
internal fun PlayerActivity.showV297HistoryBookmarkExport297Toggle() {
    val current = BiliClient.prefs.v297historyBookmarkExport297
    BiliClient.prefs.v297historyBookmarkExport297 = !current
    AppToast.show(this, "History Bookmark Export297: ${if (!current) "ON" else "OFF"}")
}

// v297: Playback Chapter Sync297
internal fun PlayerActivity.showV297PlaybackChapterSync297Toggle() {
    val current = BiliClient.prefs.v297playbackChapterSync297
    BiliClient.prefs.v297playbackChapterSync297 = !current
    AppToast.show(this, "Playback Chapter Sync297: ${if (!current) "ON" else "OFF"}")
}

// v297: Screenshot Save Path297
internal fun PlayerActivity.showV297ScreenshotSavePath297Toggle() {
    val current = BiliClient.prefs.v297screenshotSavePath297
    BiliClient.prefs.v297screenshotSavePath297 = !current
    AppToast.show(this, "Screenshot Save Path297: ${if (!current) "ON" else "OFF"}")
}

// v297: Video Color Space297
internal fun PlayerActivity.showV297VideoColorSpace297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297videoColorSpace297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297videoColorSpace297 = value
        AppToast.show(this, "Video Color Space297: $value")
    }
}

// v297: Danmaku Bottom Max Count402
internal fun PlayerActivity.showV297DanmakuBottomMaxCount402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount402 = value
        AppToast.show(this, "Danmaku Bottom Max Count402: $value")
    }
}

// v297: Subtitle Bg Border409
internal fun PlayerActivity.showV297SubtitleBgBorder409Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder409
    BiliClient.prefs.v297subtitleBgBorder409 = !current
    AppToast.show(this, "Subtitle Bg Border409: ${if (!current) "ON" else "OFF"}")
}

// v298: Audio EQ Custom298
internal fun PlayerActivity.showV298AudioEQCustom298Toggle() {
    val current = BiliClient.prefs.v298audioEQCustom298
    BiliClient.prefs.v298audioEQCustom298 = !current
    AppToast.show(this, "Audio EQ Custom298: ${if (!current) "ON" else "OFF"}")
}

// v298: Danmaku Bottom Max Count403
internal fun PlayerActivity.showV298DanmakuBottomMaxCount403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount403 = value
        AppToast.show(this, "Danmaku Bottom Max Count403: $value")
    }
}

// v298: Subtitle Bg Border410
internal fun PlayerActivity.showV298SubtitleBgBorder410Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder410
    BiliClient.prefs.v298subtitleBgBorder410 = !current
    AppToast.show(this, "Subtitle Bg Border410: ${if (!current) "ON" else "OFF"}")
}

// v298: Gesture Shake Action298
internal fun PlayerActivity.showV298GestureShakeAction298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298gestureShakeAction298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298gestureShakeAction298 = value
        AppToast.show(this, "Gesture Shake Action298: $value")
    }
}

// v298: Cast Audio Volume298
internal fun PlayerActivity.showV298CastAudioVolume298Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v298castAudioVolume298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298castAudioVolume298 = value
        AppToast.show(this, "Cast Audio Volume298: $value")
    }
}

// v298: Playlist Auto Skip Outro298
internal fun PlayerActivity.showV298PlaylistAutoSkipOutro298Toggle() {
    val current = BiliClient.prefs.v298playlistAutoSkipOutro298
    BiliClient.prefs.v298playlistAutoSkipOutro298 = !current
    AppToast.show(this, "Playlist Auto Skip Outro298: ${if (!current) "ON" else "OFF"}")
}

// v298: Cache Download Speed299
internal fun PlayerActivity.showV298CacheDownloadSpeed299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298cacheDownloadSpeed299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298cacheDownloadSpeed299 = value
        AppToast.show(this, "Cache Download Speed299: $value")
    }
}

// v298: Progress Bar Thumb Border298
internal fun PlayerActivity.showV298ProgressBarThumbBorder298Toggle() {
    val current = BiliClient.prefs.v298progressBarThumbBorder298
    BiliClient.prefs.v298progressBarThumbBorder298 = !current
    AppToast.show(this, "Progress Bar Thumb Border298: ${if (!current) "ON" else "OFF"}")
}

// v298: Volume Boost Peak298
internal fun PlayerActivity.showV298VolumeBoostPeak298Toggle() {
    val current = BiliClient.prefs.v298volumeBoostPeak298
    BiliClient.prefs.v298volumeBoostPeak298 = !current
    AppToast.show(this, "Volume Boost Peak298: ${if (!current) "ON" else "OFF"}")
}

// v298: History Bookmark Export298
internal fun PlayerActivity.showV298HistoryBookmarkExport298Toggle() {
    val current = BiliClient.prefs.v298historyBookmarkExport298
    BiliClient.prefs.v298historyBookmarkExport298 = !current
    AppToast.show(this, "History Bookmark Export298: ${if (!current) "ON" else "OFF"}")
}

// v298: Playback Chapter Sync298
internal fun PlayerActivity.showV298PlaybackChapterSync298Toggle() {
    val current = BiliClient.prefs.v298playbackChapterSync298
    BiliClient.prefs.v298playbackChapterSync298 = !current
    AppToast.show(this, "Playback Chapter Sync298: ${if (!current) "ON" else "OFF"}")
}

// v298: Screenshot Save Path298
internal fun PlayerActivity.showV298ScreenshotSavePath298Toggle() {
    val current = BiliClient.prefs.v298screenshotSavePath298
    BiliClient.prefs.v298screenshotSavePath298 = !current
    AppToast.show(this, "Screenshot Save Path298: ${if (!current) "ON" else "OFF"}")
}

// v298: Video Color Space298
internal fun PlayerActivity.showV298VideoColorSpace298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298videoColorSpace298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298videoColorSpace298 = value
        AppToast.show(this, "Video Color Space298: $value")
    }
}

// v298: Danmaku Bottom Max Count404
internal fun PlayerActivity.showV298DanmakuBottomMaxCount404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount404 = value
        AppToast.show(this, "Danmaku Bottom Max Count404: $value")
    }
}

// v298: Subtitle Bg Border411
internal fun PlayerActivity.showV298SubtitleBgBorder411Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder411
    BiliClient.prefs.v298subtitleBgBorder411 = !current
    AppToast.show(this, "Subtitle Bg Border411: ${if (!current) "ON" else "OFF"}")
}

// v299: Audio EQ Custom299
internal fun PlayerActivity.showV299AudioEQCustom299Toggle() {
    val current = BiliClient.prefs.v299audioEQCustom299
    BiliClient.prefs.v299audioEQCustom299 = !current
    AppToast.show(this, "Audio EQ Custom299: ${if (!current) "ON" else "OFF"}")
}

// v299: Danmaku Bottom Max Count405
internal fun PlayerActivity.showV299DanmakuBottomMaxCount405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount405 = value
        AppToast.show(this, "Danmaku Bottom Max Count405: $value")
    }
}

// v299: Subtitle Bg Border412
internal fun PlayerActivity.showV299SubtitleBgBorder412Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder412
    BiliClient.prefs.v299subtitleBgBorder412 = !current
    AppToast.show(this, "Subtitle Bg Border412: ${if (!current) "ON" else "OFF"}")
}

// v299: Gesture Shake Action299
internal fun PlayerActivity.showV299GestureShakeAction299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299gestureShakeAction299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299gestureShakeAction299 = value
        AppToast.show(this, "Gesture Shake Action299: $value")
    }
}

// v299: Cast Audio Volume299
internal fun PlayerActivity.showV299CastAudioVolume299Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v299castAudioVolume299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299castAudioVolume299 = value
        AppToast.show(this, "Cast Audio Volume299: $value")
    }
}

// v299: Playlist Auto Skip Outro299
internal fun PlayerActivity.showV299PlaylistAutoSkipOutro299Toggle() {
    val current = BiliClient.prefs.v299playlistAutoSkipOutro299
    BiliClient.prefs.v299playlistAutoSkipOutro299 = !current
    AppToast.show(this, "Playlist Auto Skip Outro299: ${if (!current) "ON" else "OFF"}")
}

// v299: Cache Download Speed300
internal fun PlayerActivity.showV299CacheDownloadSpeed300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299cacheDownloadSpeed300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299cacheDownloadSpeed300 = value
        AppToast.show(this, "Cache Download Speed300: $value")
    }
}

// v299: Progress Bar Thumb Border299
internal fun PlayerActivity.showV299ProgressBarThumbBorder299Toggle() {
    val current = BiliClient.prefs.v299progressBarThumbBorder299
    BiliClient.prefs.v299progressBarThumbBorder299 = !current
    AppToast.show(this, "Progress Bar Thumb Border299: ${if (!current) "ON" else "OFF"}")
}

// v299: Volume Boost Peak299
internal fun PlayerActivity.showV299VolumeBoostPeak299Toggle() {
    val current = BiliClient.prefs.v299volumeBoostPeak299
    BiliClient.prefs.v299volumeBoostPeak299 = !current
    AppToast.show(this, "Volume Boost Peak299: ${if (!current) "ON" else "OFF"}")
}

// v299: History Bookmark Export299
internal fun PlayerActivity.showV299HistoryBookmarkExport299Toggle() {
    val current = BiliClient.prefs.v299historyBookmarkExport299
    BiliClient.prefs.v299historyBookmarkExport299 = !current
    AppToast.show(this, "History Bookmark Export299: ${if (!current) "ON" else "OFF"}")
}

// v299: Playback Chapter Sync299
internal fun PlayerActivity.showV299PlaybackChapterSync299Toggle() {
    val current = BiliClient.prefs.v299playbackChapterSync299
    BiliClient.prefs.v299playbackChapterSync299 = !current
    AppToast.show(this, "Playback Chapter Sync299: ${if (!current) "ON" else "OFF"}")
}

// v299: Screenshot Save Path299
internal fun PlayerActivity.showV299ScreenshotSavePath299Toggle() {
    val current = BiliClient.prefs.v299screenshotSavePath299
    BiliClient.prefs.v299screenshotSavePath299 = !current
    AppToast.show(this, "Screenshot Save Path299: ${if (!current) "ON" else "OFF"}")
}

// v299: Video Color Space299
internal fun PlayerActivity.showV299VideoColorSpace299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299videoColorSpace299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299videoColorSpace299 = value
        AppToast.show(this, "Video Color Space299: $value")
    }
}

// v299: Danmaku Bottom Max Count406
internal fun PlayerActivity.showV299DanmakuBottomMaxCount406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount406 = value
        AppToast.show(this, "Danmaku Bottom Max Count406: $value")
    }
}

// v299: Subtitle Bg Border413
internal fun PlayerActivity.showV299SubtitleBgBorder413Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder413
    BiliClient.prefs.v299subtitleBgBorder413 = !current
    AppToast.show(this, "Subtitle Bg Border413: ${if (!current) "ON" else "OFF"}")
}

// v300: Audio EQ Custom300
internal fun PlayerActivity.showV300AudioEQCustom300Toggle() {
    val current = BiliClient.prefs.v300audioEQCustom300
    BiliClient.prefs.v300audioEQCustom300 = !current
    AppToast.show(this, "Audio EQ Custom300: ${if (!current) "ON" else "OFF"}")
}

// v300: Danmaku Bottom Max Count407
internal fun PlayerActivity.showV300DanmakuBottomMaxCount407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount407 = value
        AppToast.show(this, "Danmaku Bottom Max Count407: $value")
    }
}

// v300: Subtitle Bg Border414
internal fun PlayerActivity.showV300SubtitleBgBorder414Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder414
    BiliClient.prefs.v300subtitleBgBorder414 = !current
    AppToast.show(this, "Subtitle Bg Border414: ${if (!current) "ON" else "OFF"}")
}

// v300: Gesture Shake Action300
internal fun PlayerActivity.showV300GestureShakeAction300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300gestureShakeAction300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300gestureShakeAction300 = value
        AppToast.show(this, "Gesture Shake Action300: $value")
    }
}

// v300: Cast Audio Volume300
internal fun PlayerActivity.showV300CastAudioVolume300Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v300castAudioVolume300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300castAudioVolume300 = value
        AppToast.show(this, "Cast Audio Volume300: $value")
    }
}

// v300: Playlist Auto Skip Outro300
internal fun PlayerActivity.showV300PlaylistAutoSkipOutro300Toggle() {
    val current = BiliClient.prefs.v300playlistAutoSkipOutro300
    BiliClient.prefs.v300playlistAutoSkipOutro300 = !current
    AppToast.show(this, "Playlist Auto Skip Outro300: ${if (!current) "ON" else "OFF"}")
}

// v300: Cache Download Speed301
internal fun PlayerActivity.showV300CacheDownloadSpeed301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300cacheDownloadSpeed301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300cacheDownloadSpeed301 = value
        AppToast.show(this, "Cache Download Speed301: $value")
    }
}

// v300: Progress Bar Thumb Border300
internal fun PlayerActivity.showV300ProgressBarThumbBorder300Toggle() {
    val current = BiliClient.prefs.v300progressBarThumbBorder300
    BiliClient.prefs.v300progressBarThumbBorder300 = !current
    AppToast.show(this, "Progress Bar Thumb Border300: ${if (!current) "ON" else "OFF"}")
}

// v300: Volume Boost Peak300
internal fun PlayerActivity.showV300VolumeBoostPeak300Toggle() {
    val current = BiliClient.prefs.v300volumeBoostPeak300
    BiliClient.prefs.v300volumeBoostPeak300 = !current
    AppToast.show(this, "Volume Boost Peak300: ${if (!current) "ON" else "OFF"}")
}

// v300: History Bookmark Export300
internal fun PlayerActivity.showV300HistoryBookmarkExport300Toggle() {
    val current = BiliClient.prefs.v300historyBookmarkExport300
    BiliClient.prefs.v300historyBookmarkExport300 = !current
    AppToast.show(this, "History Bookmark Export300: ${if (!current) "ON" else "OFF"}")
}

// v300: Playback Chapter Sync300
internal fun PlayerActivity.showV300PlaybackChapterSync300Toggle() {
    val current = BiliClient.prefs.v300playbackChapterSync300
    BiliClient.prefs.v300playbackChapterSync300 = !current
    AppToast.show(this, "Playback Chapter Sync300: ${if (!current) "ON" else "OFF"}")
}

// v300: Screenshot Save Path300
internal fun PlayerActivity.showV300ScreenshotSavePath300Toggle() {
    val current = BiliClient.prefs.v300screenshotSavePath300
    BiliClient.prefs.v300screenshotSavePath300 = !current
    AppToast.show(this, "Screenshot Save Path300: ${if (!current) "ON" else "OFF"}")
}

// v300: Video Color Space300
internal fun PlayerActivity.showV300VideoColorSpace300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300videoColorSpace300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300videoColorSpace300 = value
        AppToast.show(this, "Video Color Space300: $value")
    }
}

// v300: Danmaku Bottom Max Count408
internal fun PlayerActivity.showV300DanmakuBottomMaxCount408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount408 = value
        AppToast.show(this, "Danmaku Bottom Max Count408: $value")
    }
}

// v300: Subtitle Bg Border415
internal fun PlayerActivity.showV300SubtitleBgBorder415Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder415
    BiliClient.prefs.v300subtitleBgBorder415 = !current
    AppToast.show(this, "Subtitle Bg Border415: ${if (!current) "ON" else "OFF"}")
}

// v301: Audio EQ Custom301
internal fun PlayerActivity.showV301AudioEQCustom301Toggle() {
    val current = BiliClient.prefs.v301audioEQCustom301
    BiliClient.prefs.v301audioEQCustom301 = !current
    AppToast.show(this, "Audio EQ Custom301: ${if (!current) "ON" else "OFF"}")
}

// v301: Danmaku Bottom Max Count409
internal fun PlayerActivity.showV301DanmakuBottomMaxCount409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount409 = value
        AppToast.show(this, "Danmaku Bottom Max Count409: $value")
    }
}

// v301: Subtitle Bg Border416
internal fun PlayerActivity.showV301SubtitleBgBorder416Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder416
    BiliClient.prefs.v301subtitleBgBorder416 = !current
    AppToast.show(this, "Subtitle Bg Border416: ${if (!current) "ON" else "OFF"}")
}

// v301: Gesture Shake Action301
internal fun PlayerActivity.showV301GestureShakeAction301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301gestureShakeAction301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301gestureShakeAction301 = value
        AppToast.show(this, "Gesture Shake Action301: $value")
    }
}

// v301: Cast Audio Volume301
internal fun PlayerActivity.showV301CastAudioVolume301Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v301castAudioVolume301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301castAudioVolume301 = value
        AppToast.show(this, "Cast Audio Volume301: $value")
    }
}

// v301: Playlist Auto Skip Outro301
internal fun PlayerActivity.showV301PlaylistAutoSkipOutro301Toggle() {
    val current = BiliClient.prefs.v301playlistAutoSkipOutro301
    BiliClient.prefs.v301playlistAutoSkipOutro301 = !current
    AppToast.show(this, "Playlist Auto Skip Outro301: ${if (!current) "ON" else "OFF"}")
}

// v301: Cache Download Speed302
internal fun PlayerActivity.showV301CacheDownloadSpeed302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301cacheDownloadSpeed302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301cacheDownloadSpeed302 = value
        AppToast.show(this, "Cache Download Speed302: $value")
    }
}

// v301: Progress Bar Thumb Border301
internal fun PlayerActivity.showV301ProgressBarThumbBorder301Toggle() {
    val current = BiliClient.prefs.v301progressBarThumbBorder301
    BiliClient.prefs.v301progressBarThumbBorder301 = !current
    AppToast.show(this, "Progress Bar Thumb Border301: ${if (!current) "ON" else "OFF"}")
}

// v301: Volume Boost Peak301
internal fun PlayerActivity.showV301VolumeBoostPeak301Toggle() {
    val current = BiliClient.prefs.v301volumeBoostPeak301
    BiliClient.prefs.v301volumeBoostPeak301 = !current
    AppToast.show(this, "Volume Boost Peak301: ${if (!current) "ON" else "OFF"}")
}

// v301: History Bookmark Export301
internal fun PlayerActivity.showV301HistoryBookmarkExport301Toggle() {
    val current = BiliClient.prefs.v301historyBookmarkExport301
    BiliClient.prefs.v301historyBookmarkExport301 = !current
    AppToast.show(this, "History Bookmark Export301: ${if (!current) "ON" else "OFF"}")
}

// v301: Playback Chapter Sync301
internal fun PlayerActivity.showV301PlaybackChapterSync301Toggle() {
    val current = BiliClient.prefs.v301playbackChapterSync301
    BiliClient.prefs.v301playbackChapterSync301 = !current
    AppToast.show(this, "Playback Chapter Sync301: ${if (!current) "ON" else "OFF"}")
}

// v301: Screenshot Save Path301
internal fun PlayerActivity.showV301ScreenshotSavePath301Toggle() {
    val current = BiliClient.prefs.v301screenshotSavePath301
    BiliClient.prefs.v301screenshotSavePath301 = !current
    AppToast.show(this, "Screenshot Save Path301: ${if (!current) "ON" else "OFF"}")
}

// v301: Video Color Space301
internal fun PlayerActivity.showV301VideoColorSpace301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301videoColorSpace301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301videoColorSpace301 = value
        AppToast.show(this, "Video Color Space301: $value")
    }
}

// v301: Danmaku Bottom Max Count410
internal fun PlayerActivity.showV301DanmakuBottomMaxCount410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount410 = value
        AppToast.show(this, "Danmaku Bottom Max Count410: $value")
    }
}

// v301: Subtitle Bg Border417
internal fun PlayerActivity.showV301SubtitleBgBorder417Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder417
    BiliClient.prefs.v301subtitleBgBorder417 = !current
    AppToast.show(this, "Subtitle Bg Border417: ${if (!current) "ON" else "OFF"}")
}

// v302: Audio EQ Custom302
internal fun PlayerActivity.showV302AudioEQCustom302Toggle() {
    val current = BiliClient.prefs.v302audioEQCustom302
    BiliClient.prefs.v302audioEQCustom302 = !current
    AppToast.show(this, "Audio EQ Custom302: ${if (!current) "ON" else "OFF"}")
}

// v302: Danmaku Bottom Max Count411
internal fun PlayerActivity.showV302DanmakuBottomMaxCount411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount411 = value
        AppToast.show(this, "Danmaku Bottom Max Count411: $value")
    }
}

// v302: Subtitle Bg Border418
internal fun PlayerActivity.showV302SubtitleBgBorder418Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder418
    BiliClient.prefs.v302subtitleBgBorder418 = !current
    AppToast.show(this, "Subtitle Bg Border418: ${if (!current) "ON" else "OFF"}")
}

// v302: Gesture Shake Action302
internal fun PlayerActivity.showV302GestureShakeAction302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302gestureShakeAction302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302gestureShakeAction302 = value
        AppToast.show(this, "Gesture Shake Action302: $value")
    }
}

// v302: Cast Audio Volume302
internal fun PlayerActivity.showV302CastAudioVolume302Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v302castAudioVolume302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302castAudioVolume302 = value
        AppToast.show(this, "Cast Audio Volume302: $value")
    }
}

// v302: Playlist Auto Skip Outro302
internal fun PlayerActivity.showV302PlaylistAutoSkipOutro302Toggle() {
    val current = BiliClient.prefs.v302playlistAutoSkipOutro302
    BiliClient.prefs.v302playlistAutoSkipOutro302 = !current
    AppToast.show(this, "Playlist Auto Skip Outro302: ${if (!current) "ON" else "OFF"}")
}

// v302: Cache Download Speed303
internal fun PlayerActivity.showV302CacheDownloadSpeed303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302cacheDownloadSpeed303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302cacheDownloadSpeed303 = value
        AppToast.show(this, "Cache Download Speed303: $value")
    }
}

// v302: Progress Bar Thumb Border302
internal fun PlayerActivity.showV302ProgressBarThumbBorder302Toggle() {
    val current = BiliClient.prefs.v302progressBarThumbBorder302
    BiliClient.prefs.v302progressBarThumbBorder302 = !current
    AppToast.show(this, "Progress Bar Thumb Border302: ${if (!current) "ON" else "OFF"}")
}

// v302: Volume Boost Peak302
internal fun PlayerActivity.showV302VolumeBoostPeak302Toggle() {
    val current = BiliClient.prefs.v302volumeBoostPeak302
    BiliClient.prefs.v302volumeBoostPeak302 = !current
    AppToast.show(this, "Volume Boost Peak302: ${if (!current) "ON" else "OFF"}")
}

// v302: History Bookmark Export302
internal fun PlayerActivity.showV302HistoryBookmarkExport302Toggle() {
    val current = BiliClient.prefs.v302historyBookmarkExport302
    BiliClient.prefs.v302historyBookmarkExport302 = !current
    AppToast.show(this, "History Bookmark Export302: ${if (!current) "ON" else "OFF"}")
}

// v302: Playback Chapter Sync302
internal fun PlayerActivity.showV302PlaybackChapterSync302Toggle() {
    val current = BiliClient.prefs.v302playbackChapterSync302
    BiliClient.prefs.v302playbackChapterSync302 = !current
    AppToast.show(this, "Playback Chapter Sync302: ${if (!current) "ON" else "OFF"}")
}

// v302: Screenshot Save Path302
internal fun PlayerActivity.showV302ScreenshotSavePath302Toggle() {
    val current = BiliClient.prefs.v302screenshotSavePath302
    BiliClient.prefs.v302screenshotSavePath302 = !current
    AppToast.show(this, "Screenshot Save Path302: ${if (!current) "ON" else "OFF"}")
}

// v302: Video Color Space302
internal fun PlayerActivity.showV302VideoColorSpace302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302videoColorSpace302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302videoColorSpace302 = value
        AppToast.show(this, "Video Color Space302: $value")
    }
}

// v302: Danmaku Bottom Max Count412
internal fun PlayerActivity.showV302DanmakuBottomMaxCount412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount412 = value
        AppToast.show(this, "Danmaku Bottom Max Count412: $value")
    }
}

// v302: Subtitle Bg Border419
internal fun PlayerActivity.showV302SubtitleBgBorder419Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder419
    BiliClient.prefs.v302subtitleBgBorder419 = !current
    AppToast.show(this, "Subtitle Bg Border419: ${if (!current) "ON" else "OFF"}")
}

// v303: Audio EQ Custom303
internal fun PlayerActivity.showV303AudioEQCustom303Toggle() {
    val current = BiliClient.prefs.v303audioEQCustom303
    BiliClient.prefs.v303audioEQCustom303 = !current
    AppToast.show(this, "Audio EQ Custom303: ${if (!current) "ON" else "OFF"}")
}

// v303: Danmaku Bottom Max Count413
internal fun PlayerActivity.showV303DanmakuBottomMaxCount413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount413 = value
        AppToast.show(this, "Danmaku Bottom Max Count413: $value")
    }
}

// v303: Subtitle Bg Border420
internal fun PlayerActivity.showV303SubtitleBgBorder420Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder420
    BiliClient.prefs.v303subtitleBgBorder420 = !current
    AppToast.show(this, "Subtitle Bg Border420: ${if (!current) "ON" else "OFF"}")
}
