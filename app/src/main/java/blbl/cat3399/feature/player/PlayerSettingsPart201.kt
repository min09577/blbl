package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2191: registered mode
internal fun PlayerActivity.showV2191RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2191registered
    FeaturePrefsStore.batch2191.v2191registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2191: regulated mode
internal fun PlayerActivity.showV2191RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191regulated
    FeaturePrefsStore.batch2191.v2191regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2191: reinforced mode
internal fun PlayerActivity.showV2191ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191reinforced
    FeaturePrefsStore.batch2191.v2191reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2191: rejected mode
internal fun PlayerActivity.showV2191RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191rejected
    FeaturePrefsStore.batch2191.v2191rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2191: related mode
internal fun PlayerActivity.showV2191RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191related
    FeaturePrefsStore.batch2191.v2191related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2191: relayed level
internal fun PlayerActivity.showV2191RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2191: released level
internal fun PlayerActivity.showV2191ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191released = value
        AppToast.show(this, "released: $value")
    }
}

// v2191: relied level
internal fun PlayerActivity.showV2191ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2191: relocated level
internal fun PlayerActivity.showV2191RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2191: remained level
internal fun PlayerActivity.showV2191RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2191: remembered mode
internal fun PlayerActivity.showV2191RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191remembered
    FeaturePrefsStore.batch2191.v2191remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2191: removed mode
internal fun PlayerActivity.showV2191RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191removed
    FeaturePrefsStore.batch2191.v2191removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2191: rendered mode
internal fun PlayerActivity.showV2191RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191rendered
    FeaturePrefsStore.batch2191.v2191rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2191: renewed mode
internal fun PlayerActivity.showV2191RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191renewed
    FeaturePrefsStore.batch2191.v2191renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2191: reopened mode
internal fun PlayerActivity.showV2191ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191reopened
    FeaturePrefsStore.batch2191.v2191reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2192: registered mode
internal fun PlayerActivity.showV2192RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2192registered
    FeaturePrefsStore.batch2191.v2192registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2192: regulated mode
internal fun PlayerActivity.showV2192RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192regulated
    FeaturePrefsStore.batch2191.v2192regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2192: reinforced mode
internal fun PlayerActivity.showV2192ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192reinforced
    FeaturePrefsStore.batch2191.v2192reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2192: rejected mode
internal fun PlayerActivity.showV2192RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192rejected
    FeaturePrefsStore.batch2191.v2192rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2192: related mode
internal fun PlayerActivity.showV2192RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192related
    FeaturePrefsStore.batch2191.v2192related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2192: relayed level
internal fun PlayerActivity.showV2192RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2192: released level
internal fun PlayerActivity.showV2192ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192released = value
        AppToast.show(this, "released: $value")
    }
}

// v2192: relied level
internal fun PlayerActivity.showV2192ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2192: relocated level
internal fun PlayerActivity.showV2192RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2192: remained level
internal fun PlayerActivity.showV2192RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2192: remembered mode
internal fun PlayerActivity.showV2192RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192remembered
    FeaturePrefsStore.batch2191.v2192remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2192: removed mode
internal fun PlayerActivity.showV2192RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192removed
    FeaturePrefsStore.batch2191.v2192removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2192: rendered mode
internal fun PlayerActivity.showV2192RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192rendered
    FeaturePrefsStore.batch2191.v2192rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2192: renewed mode
internal fun PlayerActivity.showV2192RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192renewed
    FeaturePrefsStore.batch2191.v2192renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2192: reopened mode
internal fun PlayerActivity.showV2192ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192reopened
    FeaturePrefsStore.batch2191.v2192reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2193: registered mode
internal fun PlayerActivity.showV2193RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2193registered
    FeaturePrefsStore.batch2191.v2193registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2193: regulated mode
internal fun PlayerActivity.showV2193RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193regulated
    FeaturePrefsStore.batch2191.v2193regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2193: reinforced mode
internal fun PlayerActivity.showV2193ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193reinforced
    FeaturePrefsStore.batch2191.v2193reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2193: rejected mode
internal fun PlayerActivity.showV2193RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193rejected
    FeaturePrefsStore.batch2191.v2193rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2193: related mode
internal fun PlayerActivity.showV2193RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193related
    FeaturePrefsStore.batch2191.v2193related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2193: relayed level
internal fun PlayerActivity.showV2193RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2193: released level
internal fun PlayerActivity.showV2193ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193released = value
        AppToast.show(this, "released: $value")
    }
}

// v2193: relied level
internal fun PlayerActivity.showV2193ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2193: relocated level
internal fun PlayerActivity.showV2193RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2193: remained level
internal fun PlayerActivity.showV2193RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2193: remembered mode
internal fun PlayerActivity.showV2193RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193remembered
    FeaturePrefsStore.batch2191.v2193remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2193: removed mode
internal fun PlayerActivity.showV2193RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193removed
    FeaturePrefsStore.batch2191.v2193removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2193: rendered mode
internal fun PlayerActivity.showV2193RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193rendered
    FeaturePrefsStore.batch2191.v2193rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2193: renewed mode
internal fun PlayerActivity.showV2193RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193renewed
    FeaturePrefsStore.batch2191.v2193renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2193: reopened mode
internal fun PlayerActivity.showV2193ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193reopened
    FeaturePrefsStore.batch2191.v2193reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2194: registered mode
internal fun PlayerActivity.showV2194RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2194registered
    FeaturePrefsStore.batch2191.v2194registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2194: regulated mode
internal fun PlayerActivity.showV2194RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194regulated
    FeaturePrefsStore.batch2191.v2194regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2194: reinforced mode
internal fun PlayerActivity.showV2194ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194reinforced
    FeaturePrefsStore.batch2191.v2194reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2194: rejected mode
internal fun PlayerActivity.showV2194RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194rejected
    FeaturePrefsStore.batch2191.v2194rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2194: related mode
internal fun PlayerActivity.showV2194RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194related
    FeaturePrefsStore.batch2191.v2194related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2194: relayed level
internal fun PlayerActivity.showV2194RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2194: released level
internal fun PlayerActivity.showV2194ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194released = value
        AppToast.show(this, "released: $value")
    }
}

// v2194: relied level
internal fun PlayerActivity.showV2194ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2194: relocated level
internal fun PlayerActivity.showV2194RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2194: remained level
internal fun PlayerActivity.showV2194RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2194: remembered mode
internal fun PlayerActivity.showV2194RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194remembered
    FeaturePrefsStore.batch2191.v2194remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2194: removed mode
internal fun PlayerActivity.showV2194RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194removed
    FeaturePrefsStore.batch2191.v2194removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2194: rendered mode
internal fun PlayerActivity.showV2194RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194rendered
    FeaturePrefsStore.batch2191.v2194rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2194: renewed mode
internal fun PlayerActivity.showV2194RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194renewed
    FeaturePrefsStore.batch2191.v2194renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2194: reopened mode
internal fun PlayerActivity.showV2194ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194reopened
    FeaturePrefsStore.batch2191.v2194reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2195: registered mode
internal fun PlayerActivity.showV2195RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2195registered
    FeaturePrefsStore.batch2191.v2195registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2195: regulated mode
internal fun PlayerActivity.showV2195RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195regulated
    FeaturePrefsStore.batch2191.v2195regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2195: reinforced mode
internal fun PlayerActivity.showV2195ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195reinforced
    FeaturePrefsStore.batch2191.v2195reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2195: rejected mode
internal fun PlayerActivity.showV2195RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195rejected
    FeaturePrefsStore.batch2191.v2195rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2195: related mode
internal fun PlayerActivity.showV2195RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195related
    FeaturePrefsStore.batch2191.v2195related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2195: relayed level
internal fun PlayerActivity.showV2195RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2195: released level
internal fun PlayerActivity.showV2195ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195released = value
        AppToast.show(this, "released: $value")
    }
}

// v2195: relied level
internal fun PlayerActivity.showV2195ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2195: relocated level
internal fun PlayerActivity.showV2195RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2195: remained level
internal fun PlayerActivity.showV2195RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2195: remembered mode
internal fun PlayerActivity.showV2195RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195remembered
    FeaturePrefsStore.batch2191.v2195remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2195: removed mode
internal fun PlayerActivity.showV2195RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195removed
    FeaturePrefsStore.batch2191.v2195removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2195: rendered mode
internal fun PlayerActivity.showV2195RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195rendered
    FeaturePrefsStore.batch2191.v2195rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2195: renewed mode
internal fun PlayerActivity.showV2195RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195renewed
    FeaturePrefsStore.batch2191.v2195renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2195: reopened mode
internal fun PlayerActivity.showV2195ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195reopened
    FeaturePrefsStore.batch2191.v2195reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2196: registered mode
internal fun PlayerActivity.showV2196RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2196registered
    FeaturePrefsStore.batch2191.v2196registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2196: regulated mode
internal fun PlayerActivity.showV2196RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196regulated
    FeaturePrefsStore.batch2191.v2196regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2196: reinforced mode
internal fun PlayerActivity.showV2196ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196reinforced
    FeaturePrefsStore.batch2191.v2196reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2196: rejected mode
internal fun PlayerActivity.showV2196RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196rejected
    FeaturePrefsStore.batch2191.v2196rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2196: related mode
internal fun PlayerActivity.showV2196RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196related
    FeaturePrefsStore.batch2191.v2196related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2196: relayed level
internal fun PlayerActivity.showV2196RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2196: released level
internal fun PlayerActivity.showV2196ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196released = value
        AppToast.show(this, "released: $value")
    }
}

// v2196: relied level
internal fun PlayerActivity.showV2196ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2196: relocated level
internal fun PlayerActivity.showV2196RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2196: remained level
internal fun PlayerActivity.showV2196RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2196: remembered mode
internal fun PlayerActivity.showV2196RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196remembered
    FeaturePrefsStore.batch2191.v2196remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2196: removed mode
internal fun PlayerActivity.showV2196RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196removed
    FeaturePrefsStore.batch2191.v2196removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2196: rendered mode
internal fun PlayerActivity.showV2196RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196rendered
    FeaturePrefsStore.batch2191.v2196rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2196: renewed mode
internal fun PlayerActivity.showV2196RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196renewed
    FeaturePrefsStore.batch2191.v2196renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2196: reopened mode
internal fun PlayerActivity.showV2196ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196reopened
    FeaturePrefsStore.batch2191.v2196reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2197: registered mode
internal fun PlayerActivity.showV2197RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2197registered
    FeaturePrefsStore.batch2191.v2197registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2197: regulated mode
internal fun PlayerActivity.showV2197RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197regulated
    FeaturePrefsStore.batch2191.v2197regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2197: reinforced mode
internal fun PlayerActivity.showV2197ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197reinforced
    FeaturePrefsStore.batch2191.v2197reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2197: rejected mode
internal fun PlayerActivity.showV2197RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197rejected
    FeaturePrefsStore.batch2191.v2197rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2197: related mode
internal fun PlayerActivity.showV2197RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197related
    FeaturePrefsStore.batch2191.v2197related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2197: relayed level
internal fun PlayerActivity.showV2197RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2197: released level
internal fun PlayerActivity.showV2197ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197released = value
        AppToast.show(this, "released: $value")
    }
}

// v2197: relied level
internal fun PlayerActivity.showV2197ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2197: relocated level
internal fun PlayerActivity.showV2197RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2197: remained level
internal fun PlayerActivity.showV2197RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2197: remembered mode
internal fun PlayerActivity.showV2197RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197remembered
    FeaturePrefsStore.batch2191.v2197remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2197: removed mode
internal fun PlayerActivity.showV2197RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197removed
    FeaturePrefsStore.batch2191.v2197removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2197: rendered mode
internal fun PlayerActivity.showV2197RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197rendered
    FeaturePrefsStore.batch2191.v2197rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2197: renewed mode
internal fun PlayerActivity.showV2197RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197renewed
    FeaturePrefsStore.batch2191.v2197renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2197: reopened mode
internal fun PlayerActivity.showV2197ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197reopened
    FeaturePrefsStore.batch2191.v2197reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2198: registered mode
internal fun PlayerActivity.showV2198RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2198registered
    FeaturePrefsStore.batch2191.v2198registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2198: regulated mode
internal fun PlayerActivity.showV2198RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198regulated
    FeaturePrefsStore.batch2191.v2198regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2198: reinforced mode
internal fun PlayerActivity.showV2198ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198reinforced
    FeaturePrefsStore.batch2191.v2198reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2198: rejected mode
internal fun PlayerActivity.showV2198RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198rejected
    FeaturePrefsStore.batch2191.v2198rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2198: related mode
internal fun PlayerActivity.showV2198RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198related
    FeaturePrefsStore.batch2191.v2198related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2198: relayed level
internal fun PlayerActivity.showV2198RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2198: released level
internal fun PlayerActivity.showV2198ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198released = value
        AppToast.show(this, "released: $value")
    }
}

// v2198: relied level
internal fun PlayerActivity.showV2198ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2198: relocated level
internal fun PlayerActivity.showV2198RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2198: remained level
internal fun PlayerActivity.showV2198RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2198: remembered mode
internal fun PlayerActivity.showV2198RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198remembered
    FeaturePrefsStore.batch2191.v2198remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2198: removed mode
internal fun PlayerActivity.showV2198RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198removed
    FeaturePrefsStore.batch2191.v2198removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2198: rendered mode
internal fun PlayerActivity.showV2198RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198rendered
    FeaturePrefsStore.batch2191.v2198rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2198: renewed mode
internal fun PlayerActivity.showV2198RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198renewed
    FeaturePrefsStore.batch2191.v2198renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2198: reopened mode
internal fun PlayerActivity.showV2198ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198reopened
    FeaturePrefsStore.batch2191.v2198reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2199: registered mode
internal fun PlayerActivity.showV2199RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2199registered
    FeaturePrefsStore.batch2191.v2199registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2199: regulated mode
internal fun PlayerActivity.showV2199RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199regulated
    FeaturePrefsStore.batch2191.v2199regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2199: reinforced mode
internal fun PlayerActivity.showV2199ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199reinforced
    FeaturePrefsStore.batch2191.v2199reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2199: rejected mode
internal fun PlayerActivity.showV2199RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199rejected
    FeaturePrefsStore.batch2191.v2199rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2199: related mode
internal fun PlayerActivity.showV2199RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199related
    FeaturePrefsStore.batch2191.v2199related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2199: relayed level
internal fun PlayerActivity.showV2199RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2199: released level
internal fun PlayerActivity.showV2199ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199released = value
        AppToast.show(this, "released: $value")
    }
}

// v2199: relied level
internal fun PlayerActivity.showV2199ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2199: relocated level
internal fun PlayerActivity.showV2199RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2199: remained level
internal fun PlayerActivity.showV2199RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2199: remembered mode
internal fun PlayerActivity.showV2199RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199remembered
    FeaturePrefsStore.batch2191.v2199remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2199: removed mode
internal fun PlayerActivity.showV2199RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199removed
    FeaturePrefsStore.batch2191.v2199removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2199: rendered mode
internal fun PlayerActivity.showV2199RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199rendered
    FeaturePrefsStore.batch2191.v2199rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2199: renewed mode
internal fun PlayerActivity.showV2199RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199renewed
    FeaturePrefsStore.batch2191.v2199renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2199: reopened mode
internal fun PlayerActivity.showV2199ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199reopened
    FeaturePrefsStore.batch2191.v2199reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2200: registered mode
internal fun PlayerActivity.showV2200RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2200registered
    FeaturePrefsStore.batch2191.v2200registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2200: regulated mode
internal fun PlayerActivity.showV2200RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200regulated
    FeaturePrefsStore.batch2191.v2200regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2200: reinforced mode
internal fun PlayerActivity.showV2200ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200reinforced
    FeaturePrefsStore.batch2191.v2200reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2200: rejected mode
internal fun PlayerActivity.showV2200RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200rejected
    FeaturePrefsStore.batch2191.v2200rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2200: related mode
internal fun PlayerActivity.showV2200RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200related
    FeaturePrefsStore.batch2191.v2200related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2200: relayed level
internal fun PlayerActivity.showV2200RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2200: released level
internal fun PlayerActivity.showV2200ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200released = value
        AppToast.show(this, "released: $value")
    }
}

// v2200: relied level
internal fun PlayerActivity.showV2200ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2200: relocated level
internal fun PlayerActivity.showV2200RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2200: remained level
internal fun PlayerActivity.showV2200RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2200: remembered mode
internal fun PlayerActivity.showV2200RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200remembered
    FeaturePrefsStore.batch2191.v2200remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2200: removed mode
internal fun PlayerActivity.showV2200RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200removed
    FeaturePrefsStore.batch2191.v2200removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2200: rendered mode
internal fun PlayerActivity.showV2200RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200rendered
    FeaturePrefsStore.batch2191.v2200rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2200: renewed mode
internal fun PlayerActivity.showV2200RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200renewed
    FeaturePrefsStore.batch2191.v2200renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2200: reopened mode
internal fun PlayerActivity.showV2200ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200reopened
    FeaturePrefsStore.batch2191.v2200reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

