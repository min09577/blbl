package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2031: hardened mode
internal fun PlayerActivity.showV2031HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hardened
    FeaturePrefsStore.batch2031.v2031hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2031: harmed mode
internal fun PlayerActivity.showV2031HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031harmed
    FeaturePrefsStore.batch2031.v2031harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2031: harvested mode
internal fun PlayerActivity.showV2031HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031harvested
    FeaturePrefsStore.batch2031.v2031harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2031: healed mode
internal fun PlayerActivity.showV2031HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031healed
    FeaturePrefsStore.batch2031.v2031healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2031: heated mode
internal fun PlayerActivity.showV2031HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031heated
    FeaturePrefsStore.batch2031.v2031heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2031: heightened level
internal fun PlayerActivity.showV2031HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2031: helped level
internal fun PlayerActivity.showV2031HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2031: highlighted level
internal fun PlayerActivity.showV2031HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2031: hired level
internal fun PlayerActivity.showV2031HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2031: honored level
internal fun PlayerActivity.showV2031HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2031: hosted mode
internal fun PlayerActivity.showV2031HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hosted
    FeaturePrefsStore.batch2031.v2031hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2031: hunted mode
internal fun PlayerActivity.showV2031HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hunted
    FeaturePrefsStore.batch2031.v2031hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2031: hypothesized mode
internal fun PlayerActivity.showV2031HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hypothesized
    FeaturePrefsStore.batch2031.v2031hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2031: identified mode
internal fun PlayerActivity.showV2031IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031identified
    FeaturePrefsStore.batch2031.v2031identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2031: ignored mode
internal fun PlayerActivity.showV2031IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2031ignored
    FeaturePrefsStore.batch2031.v2031ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2032: hardened mode
internal fun PlayerActivity.showV2032HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hardened
    FeaturePrefsStore.batch2031.v2032hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2032: harmed mode
internal fun PlayerActivity.showV2032HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032harmed
    FeaturePrefsStore.batch2031.v2032harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2032: harvested mode
internal fun PlayerActivity.showV2032HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032harvested
    FeaturePrefsStore.batch2031.v2032harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2032: healed mode
internal fun PlayerActivity.showV2032HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032healed
    FeaturePrefsStore.batch2031.v2032healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2032: heated mode
internal fun PlayerActivity.showV2032HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032heated
    FeaturePrefsStore.batch2031.v2032heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2032: heightened level
internal fun PlayerActivity.showV2032HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2032: helped level
internal fun PlayerActivity.showV2032HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2032: highlighted level
internal fun PlayerActivity.showV2032HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2032: hired level
internal fun PlayerActivity.showV2032HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2032: honored level
internal fun PlayerActivity.showV2032HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2032: hosted mode
internal fun PlayerActivity.showV2032HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hosted
    FeaturePrefsStore.batch2031.v2032hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2032: hunted mode
internal fun PlayerActivity.showV2032HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hunted
    FeaturePrefsStore.batch2031.v2032hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2032: hypothesized mode
internal fun PlayerActivity.showV2032HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hypothesized
    FeaturePrefsStore.batch2031.v2032hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2032: identified mode
internal fun PlayerActivity.showV2032IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032identified
    FeaturePrefsStore.batch2031.v2032identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2032: ignored mode
internal fun PlayerActivity.showV2032IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2032ignored
    FeaturePrefsStore.batch2031.v2032ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2033: hardened mode
internal fun PlayerActivity.showV2033HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hardened
    FeaturePrefsStore.batch2031.v2033hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2033: harmed mode
internal fun PlayerActivity.showV2033HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033harmed
    FeaturePrefsStore.batch2031.v2033harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2033: harvested mode
internal fun PlayerActivity.showV2033HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033harvested
    FeaturePrefsStore.batch2031.v2033harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2033: healed mode
internal fun PlayerActivity.showV2033HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033healed
    FeaturePrefsStore.batch2031.v2033healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2033: heated mode
internal fun PlayerActivity.showV2033HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033heated
    FeaturePrefsStore.batch2031.v2033heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2033: heightened level
internal fun PlayerActivity.showV2033HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2033: helped level
internal fun PlayerActivity.showV2033HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2033: highlighted level
internal fun PlayerActivity.showV2033HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2033: hired level
internal fun PlayerActivity.showV2033HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2033: honored level
internal fun PlayerActivity.showV2033HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2033: hosted mode
internal fun PlayerActivity.showV2033HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hosted
    FeaturePrefsStore.batch2031.v2033hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2033: hunted mode
internal fun PlayerActivity.showV2033HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hunted
    FeaturePrefsStore.batch2031.v2033hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2033: hypothesized mode
internal fun PlayerActivity.showV2033HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hypothesized
    FeaturePrefsStore.batch2031.v2033hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2033: identified mode
internal fun PlayerActivity.showV2033IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033identified
    FeaturePrefsStore.batch2031.v2033identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2033: ignored mode
internal fun PlayerActivity.showV2033IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2033ignored
    FeaturePrefsStore.batch2031.v2033ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2034: hardened mode
internal fun PlayerActivity.showV2034HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hardened
    FeaturePrefsStore.batch2031.v2034hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2034: harmed mode
internal fun PlayerActivity.showV2034HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034harmed
    FeaturePrefsStore.batch2031.v2034harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2034: harvested mode
internal fun PlayerActivity.showV2034HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034harvested
    FeaturePrefsStore.batch2031.v2034harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2034: healed mode
internal fun PlayerActivity.showV2034HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034healed
    FeaturePrefsStore.batch2031.v2034healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2034: heated mode
internal fun PlayerActivity.showV2034HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034heated
    FeaturePrefsStore.batch2031.v2034heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2034: heightened level
internal fun PlayerActivity.showV2034HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2034: helped level
internal fun PlayerActivity.showV2034HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2034: highlighted level
internal fun PlayerActivity.showV2034HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2034: hired level
internal fun PlayerActivity.showV2034HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2034: honored level
internal fun PlayerActivity.showV2034HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2034: hosted mode
internal fun PlayerActivity.showV2034HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hosted
    FeaturePrefsStore.batch2031.v2034hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2034: hunted mode
internal fun PlayerActivity.showV2034HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hunted
    FeaturePrefsStore.batch2031.v2034hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2034: hypothesized mode
internal fun PlayerActivity.showV2034HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hypothesized
    FeaturePrefsStore.batch2031.v2034hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2034: identified mode
internal fun PlayerActivity.showV2034IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034identified
    FeaturePrefsStore.batch2031.v2034identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2034: ignored mode
internal fun PlayerActivity.showV2034IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2034ignored
    FeaturePrefsStore.batch2031.v2034ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2035: hardened mode
internal fun PlayerActivity.showV2035HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hardened
    FeaturePrefsStore.batch2031.v2035hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2035: harmed mode
internal fun PlayerActivity.showV2035HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035harmed
    FeaturePrefsStore.batch2031.v2035harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2035: harvested mode
internal fun PlayerActivity.showV2035HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035harvested
    FeaturePrefsStore.batch2031.v2035harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2035: healed mode
internal fun PlayerActivity.showV2035HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035healed
    FeaturePrefsStore.batch2031.v2035healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2035: heated mode
internal fun PlayerActivity.showV2035HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035heated
    FeaturePrefsStore.batch2031.v2035heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2035: heightened level
internal fun PlayerActivity.showV2035HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2035: helped level
internal fun PlayerActivity.showV2035HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2035: highlighted level
internal fun PlayerActivity.showV2035HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2035: hired level
internal fun PlayerActivity.showV2035HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2035: honored level
internal fun PlayerActivity.showV2035HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2035: hosted mode
internal fun PlayerActivity.showV2035HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hosted
    FeaturePrefsStore.batch2031.v2035hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2035: hunted mode
internal fun PlayerActivity.showV2035HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hunted
    FeaturePrefsStore.batch2031.v2035hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2035: hypothesized mode
internal fun PlayerActivity.showV2035HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hypothesized
    FeaturePrefsStore.batch2031.v2035hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2035: identified mode
internal fun PlayerActivity.showV2035IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035identified
    FeaturePrefsStore.batch2031.v2035identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2035: ignored mode
internal fun PlayerActivity.showV2035IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2035ignored
    FeaturePrefsStore.batch2031.v2035ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2036: hardened mode
internal fun PlayerActivity.showV2036HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hardened
    FeaturePrefsStore.batch2031.v2036hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2036: harmed mode
internal fun PlayerActivity.showV2036HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036harmed
    FeaturePrefsStore.batch2031.v2036harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2036: harvested mode
internal fun PlayerActivity.showV2036HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036harvested
    FeaturePrefsStore.batch2031.v2036harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2036: healed mode
internal fun PlayerActivity.showV2036HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036healed
    FeaturePrefsStore.batch2031.v2036healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2036: heated mode
internal fun PlayerActivity.showV2036HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036heated
    FeaturePrefsStore.batch2031.v2036heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2036: heightened level
internal fun PlayerActivity.showV2036HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2036: helped level
internal fun PlayerActivity.showV2036HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2036: highlighted level
internal fun PlayerActivity.showV2036HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2036: hired level
internal fun PlayerActivity.showV2036HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2036: honored level
internal fun PlayerActivity.showV2036HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2036: hosted mode
internal fun PlayerActivity.showV2036HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hosted
    FeaturePrefsStore.batch2031.v2036hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2036: hunted mode
internal fun PlayerActivity.showV2036HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hunted
    FeaturePrefsStore.batch2031.v2036hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2036: hypothesized mode
internal fun PlayerActivity.showV2036HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hypothesized
    FeaturePrefsStore.batch2031.v2036hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2036: identified mode
internal fun PlayerActivity.showV2036IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036identified
    FeaturePrefsStore.batch2031.v2036identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2036: ignored mode
internal fun PlayerActivity.showV2036IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2036ignored
    FeaturePrefsStore.batch2031.v2036ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2037: hardened mode
internal fun PlayerActivity.showV2037HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hardened
    FeaturePrefsStore.batch2031.v2037hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2037: harmed mode
internal fun PlayerActivity.showV2037HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037harmed
    FeaturePrefsStore.batch2031.v2037harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2037: harvested mode
internal fun PlayerActivity.showV2037HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037harvested
    FeaturePrefsStore.batch2031.v2037harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2037: healed mode
internal fun PlayerActivity.showV2037HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037healed
    FeaturePrefsStore.batch2031.v2037healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2037: heated mode
internal fun PlayerActivity.showV2037HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037heated
    FeaturePrefsStore.batch2031.v2037heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2037: heightened level
internal fun PlayerActivity.showV2037HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2037: helped level
internal fun PlayerActivity.showV2037HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2037: highlighted level
internal fun PlayerActivity.showV2037HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2037: hired level
internal fun PlayerActivity.showV2037HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2037: honored level
internal fun PlayerActivity.showV2037HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2037: hosted mode
internal fun PlayerActivity.showV2037HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hosted
    FeaturePrefsStore.batch2031.v2037hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2037: hunted mode
internal fun PlayerActivity.showV2037HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hunted
    FeaturePrefsStore.batch2031.v2037hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2037: hypothesized mode
internal fun PlayerActivity.showV2037HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hypothesized
    FeaturePrefsStore.batch2031.v2037hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2037: identified mode
internal fun PlayerActivity.showV2037IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037identified
    FeaturePrefsStore.batch2031.v2037identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2037: ignored mode
internal fun PlayerActivity.showV2037IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2037ignored
    FeaturePrefsStore.batch2031.v2037ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2038: hardened mode
internal fun PlayerActivity.showV2038HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hardened
    FeaturePrefsStore.batch2031.v2038hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2038: harmed mode
internal fun PlayerActivity.showV2038HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038harmed
    FeaturePrefsStore.batch2031.v2038harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2038: harvested mode
internal fun PlayerActivity.showV2038HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038harvested
    FeaturePrefsStore.batch2031.v2038harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2038: healed mode
internal fun PlayerActivity.showV2038HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038healed
    FeaturePrefsStore.batch2031.v2038healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2038: heated mode
internal fun PlayerActivity.showV2038HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038heated
    FeaturePrefsStore.batch2031.v2038heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2038: heightened level
internal fun PlayerActivity.showV2038HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2038: helped level
internal fun PlayerActivity.showV2038HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2038: highlighted level
internal fun PlayerActivity.showV2038HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2038: hired level
internal fun PlayerActivity.showV2038HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2038: honored level
internal fun PlayerActivity.showV2038HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2038: hosted mode
internal fun PlayerActivity.showV2038HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hosted
    FeaturePrefsStore.batch2031.v2038hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2038: hunted mode
internal fun PlayerActivity.showV2038HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hunted
    FeaturePrefsStore.batch2031.v2038hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2038: hypothesized mode
internal fun PlayerActivity.showV2038HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hypothesized
    FeaturePrefsStore.batch2031.v2038hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2038: identified mode
internal fun PlayerActivity.showV2038IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038identified
    FeaturePrefsStore.batch2031.v2038identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2038: ignored mode
internal fun PlayerActivity.showV2038IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2038ignored
    FeaturePrefsStore.batch2031.v2038ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2039: hardened mode
internal fun PlayerActivity.showV2039HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hardened
    FeaturePrefsStore.batch2031.v2039hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2039: harmed mode
internal fun PlayerActivity.showV2039HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039harmed
    FeaturePrefsStore.batch2031.v2039harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2039: harvested mode
internal fun PlayerActivity.showV2039HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039harvested
    FeaturePrefsStore.batch2031.v2039harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2039: healed mode
internal fun PlayerActivity.showV2039HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039healed
    FeaturePrefsStore.batch2031.v2039healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2039: heated mode
internal fun PlayerActivity.showV2039HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039heated
    FeaturePrefsStore.batch2031.v2039heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2039: heightened level
internal fun PlayerActivity.showV2039HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2039: helped level
internal fun PlayerActivity.showV2039HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2039: highlighted level
internal fun PlayerActivity.showV2039HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2039: hired level
internal fun PlayerActivity.showV2039HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2039: honored level
internal fun PlayerActivity.showV2039HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2039: hosted mode
internal fun PlayerActivity.showV2039HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hosted
    FeaturePrefsStore.batch2031.v2039hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2039: hunted mode
internal fun PlayerActivity.showV2039HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hunted
    FeaturePrefsStore.batch2031.v2039hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2039: hypothesized mode
internal fun PlayerActivity.showV2039HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hypothesized
    FeaturePrefsStore.batch2031.v2039hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2039: identified mode
internal fun PlayerActivity.showV2039IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039identified
    FeaturePrefsStore.batch2031.v2039identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2039: ignored mode
internal fun PlayerActivity.showV2039IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2039ignored
    FeaturePrefsStore.batch2031.v2039ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2040: hardened mode
internal fun PlayerActivity.showV2040HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hardened
    FeaturePrefsStore.batch2031.v2040hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2040: harmed mode
internal fun PlayerActivity.showV2040HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040harmed
    FeaturePrefsStore.batch2031.v2040harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2040: harvested mode
internal fun PlayerActivity.showV2040HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040harvested
    FeaturePrefsStore.batch2031.v2040harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2040: healed mode
internal fun PlayerActivity.showV2040HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040healed
    FeaturePrefsStore.batch2031.v2040healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2040: heated mode
internal fun PlayerActivity.showV2040HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040heated
    FeaturePrefsStore.batch2031.v2040heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2040: heightened level
internal fun PlayerActivity.showV2040HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2040: helped level
internal fun PlayerActivity.showV2040HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2040: highlighted level
internal fun PlayerActivity.showV2040HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2040: hired level
internal fun PlayerActivity.showV2040HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2040: honored level
internal fun PlayerActivity.showV2040HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2040: hosted mode
internal fun PlayerActivity.showV2040HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hosted
    FeaturePrefsStore.batch2031.v2040hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2040: hunted mode
internal fun PlayerActivity.showV2040HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hunted
    FeaturePrefsStore.batch2031.v2040hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2040: hypothesized mode
internal fun PlayerActivity.showV2040HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hypothesized
    FeaturePrefsStore.batch2031.v2040hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2040: identified mode
internal fun PlayerActivity.showV2040IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040identified
    FeaturePrefsStore.batch2031.v2040identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2040: ignored mode
internal fun PlayerActivity.showV2040IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2040ignored
    FeaturePrefsStore.batch2031.v2040ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

