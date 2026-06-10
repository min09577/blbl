package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2161: propagated mode
internal fun PlayerActivity.showV2161PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161propagated
    FeaturePrefsStore.batch2161.v2161propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2161: properized mode
internal fun PlayerActivity.showV2161ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161properized
    FeaturePrefsStore.batch2161.v2161properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2161: proposed mode
internal fun PlayerActivity.showV2161ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161proposed
    FeaturePrefsStore.batch2161.v2161proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2161: protected mode
internal fun PlayerActivity.showV2161ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161protected
    FeaturePrefsStore.batch2161.v2161protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2161: protested mode
internal fun PlayerActivity.showV2161ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161protested
    FeaturePrefsStore.batch2161.v2161protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2161: proved level
internal fun PlayerActivity.showV2161ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2161: provided level
internal fun PlayerActivity.showV2161ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2161: provoked level
internal fun PlayerActivity.showV2161ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2161: published level
internal fun PlayerActivity.showV2161PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161published = value
        AppToast.show(this, "published: $value")
    }
}

// v2161: pulled level
internal fun PlayerActivity.showV2161PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2161: pumped mode
internal fun PlayerActivity.showV2161PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pumped
    FeaturePrefsStore.batch2161.v2161pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2161: punched mode
internal fun PlayerActivity.showV2161PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161punched
    FeaturePrefsStore.batch2161.v2161punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2161: purchased mode
internal fun PlayerActivity.showV2161PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161purchased
    FeaturePrefsStore.batch2161.v2161purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2161: pursued mode
internal fun PlayerActivity.showV2161PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pursued
    FeaturePrefsStore.batch2161.v2161pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2161: pushed mode
internal fun PlayerActivity.showV2161PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pushed
    FeaturePrefsStore.batch2161.v2161pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2162: propagated mode
internal fun PlayerActivity.showV2162PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162propagated
    FeaturePrefsStore.batch2161.v2162propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2162: properized mode
internal fun PlayerActivity.showV2162ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162properized
    FeaturePrefsStore.batch2161.v2162properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2162: proposed mode
internal fun PlayerActivity.showV2162ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162proposed
    FeaturePrefsStore.batch2161.v2162proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2162: protected mode
internal fun PlayerActivity.showV2162ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162protected
    FeaturePrefsStore.batch2161.v2162protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2162: protested mode
internal fun PlayerActivity.showV2162ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162protested
    FeaturePrefsStore.batch2161.v2162protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2162: proved level
internal fun PlayerActivity.showV2162ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2162: provided level
internal fun PlayerActivity.showV2162ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2162: provoked level
internal fun PlayerActivity.showV2162ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2162: published level
internal fun PlayerActivity.showV2162PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162published = value
        AppToast.show(this, "published: $value")
    }
}

// v2162: pulled level
internal fun PlayerActivity.showV2162PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2162: pumped mode
internal fun PlayerActivity.showV2162PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pumped
    FeaturePrefsStore.batch2161.v2162pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2162: punched mode
internal fun PlayerActivity.showV2162PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162punched
    FeaturePrefsStore.batch2161.v2162punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2162: purchased mode
internal fun PlayerActivity.showV2162PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162purchased
    FeaturePrefsStore.batch2161.v2162purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2162: pursued mode
internal fun PlayerActivity.showV2162PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pursued
    FeaturePrefsStore.batch2161.v2162pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2162: pushed mode
internal fun PlayerActivity.showV2162PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pushed
    FeaturePrefsStore.batch2161.v2162pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2163: propagated mode
internal fun PlayerActivity.showV2163PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163propagated
    FeaturePrefsStore.batch2161.v2163propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2163: properized mode
internal fun PlayerActivity.showV2163ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163properized
    FeaturePrefsStore.batch2161.v2163properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2163: proposed mode
internal fun PlayerActivity.showV2163ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163proposed
    FeaturePrefsStore.batch2161.v2163proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2163: protected mode
internal fun PlayerActivity.showV2163ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163protected
    FeaturePrefsStore.batch2161.v2163protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2163: protested mode
internal fun PlayerActivity.showV2163ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163protested
    FeaturePrefsStore.batch2161.v2163protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2163: proved level
internal fun PlayerActivity.showV2163ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2163: provided level
internal fun PlayerActivity.showV2163ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2163: provoked level
internal fun PlayerActivity.showV2163ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2163: published level
internal fun PlayerActivity.showV2163PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163published = value
        AppToast.show(this, "published: $value")
    }
}

// v2163: pulled level
internal fun PlayerActivity.showV2163PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2163: pumped mode
internal fun PlayerActivity.showV2163PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pumped
    FeaturePrefsStore.batch2161.v2163pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2163: punched mode
internal fun PlayerActivity.showV2163PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163punched
    FeaturePrefsStore.batch2161.v2163punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2163: purchased mode
internal fun PlayerActivity.showV2163PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163purchased
    FeaturePrefsStore.batch2161.v2163purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2163: pursued mode
internal fun PlayerActivity.showV2163PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pursued
    FeaturePrefsStore.batch2161.v2163pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2163: pushed mode
internal fun PlayerActivity.showV2163PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pushed
    FeaturePrefsStore.batch2161.v2163pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2164: propagated mode
internal fun PlayerActivity.showV2164PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164propagated
    FeaturePrefsStore.batch2161.v2164propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2164: properized mode
internal fun PlayerActivity.showV2164ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164properized
    FeaturePrefsStore.batch2161.v2164properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2164: proposed mode
internal fun PlayerActivity.showV2164ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164proposed
    FeaturePrefsStore.batch2161.v2164proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2164: protected mode
internal fun PlayerActivity.showV2164ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164protected
    FeaturePrefsStore.batch2161.v2164protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2164: protested mode
internal fun PlayerActivity.showV2164ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164protested
    FeaturePrefsStore.batch2161.v2164protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2164: proved level
internal fun PlayerActivity.showV2164ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2164: provided level
internal fun PlayerActivity.showV2164ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2164: provoked level
internal fun PlayerActivity.showV2164ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2164: published level
internal fun PlayerActivity.showV2164PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164published = value
        AppToast.show(this, "published: $value")
    }
}

// v2164: pulled level
internal fun PlayerActivity.showV2164PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2164: pumped mode
internal fun PlayerActivity.showV2164PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pumped
    FeaturePrefsStore.batch2161.v2164pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2164: punched mode
internal fun PlayerActivity.showV2164PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164punched
    FeaturePrefsStore.batch2161.v2164punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2164: purchased mode
internal fun PlayerActivity.showV2164PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164purchased
    FeaturePrefsStore.batch2161.v2164purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2164: pursued mode
internal fun PlayerActivity.showV2164PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pursued
    FeaturePrefsStore.batch2161.v2164pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2164: pushed mode
internal fun PlayerActivity.showV2164PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pushed
    FeaturePrefsStore.batch2161.v2164pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2165: propagated mode
internal fun PlayerActivity.showV2165PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165propagated
    FeaturePrefsStore.batch2161.v2165propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2165: properized mode
internal fun PlayerActivity.showV2165ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165properized
    FeaturePrefsStore.batch2161.v2165properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2165: proposed mode
internal fun PlayerActivity.showV2165ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165proposed
    FeaturePrefsStore.batch2161.v2165proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2165: protected mode
internal fun PlayerActivity.showV2165ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165protected
    FeaturePrefsStore.batch2161.v2165protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2165: protested mode
internal fun PlayerActivity.showV2165ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165protested
    FeaturePrefsStore.batch2161.v2165protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2165: proved level
internal fun PlayerActivity.showV2165ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2165: provided level
internal fun PlayerActivity.showV2165ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2165: provoked level
internal fun PlayerActivity.showV2165ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2165: published level
internal fun PlayerActivity.showV2165PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165published = value
        AppToast.show(this, "published: $value")
    }
}

// v2165: pulled level
internal fun PlayerActivity.showV2165PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2165: pumped mode
internal fun PlayerActivity.showV2165PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pumped
    FeaturePrefsStore.batch2161.v2165pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2165: punched mode
internal fun PlayerActivity.showV2165PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165punched
    FeaturePrefsStore.batch2161.v2165punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2165: purchased mode
internal fun PlayerActivity.showV2165PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165purchased
    FeaturePrefsStore.batch2161.v2165purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2165: pursued mode
internal fun PlayerActivity.showV2165PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pursued
    FeaturePrefsStore.batch2161.v2165pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2165: pushed mode
internal fun PlayerActivity.showV2165PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pushed
    FeaturePrefsStore.batch2161.v2165pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2166: propagated mode
internal fun PlayerActivity.showV2166PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166propagated
    FeaturePrefsStore.batch2161.v2166propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2166: properized mode
internal fun PlayerActivity.showV2166ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166properized
    FeaturePrefsStore.batch2161.v2166properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2166: proposed mode
internal fun PlayerActivity.showV2166ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166proposed
    FeaturePrefsStore.batch2161.v2166proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2166: protected mode
internal fun PlayerActivity.showV2166ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166protected
    FeaturePrefsStore.batch2161.v2166protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2166: protested mode
internal fun PlayerActivity.showV2166ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166protested
    FeaturePrefsStore.batch2161.v2166protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2166: proved level
internal fun PlayerActivity.showV2166ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2166: provided level
internal fun PlayerActivity.showV2166ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2166: provoked level
internal fun PlayerActivity.showV2166ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2166: published level
internal fun PlayerActivity.showV2166PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166published = value
        AppToast.show(this, "published: $value")
    }
}

// v2166: pulled level
internal fun PlayerActivity.showV2166PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2166: pumped mode
internal fun PlayerActivity.showV2166PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pumped
    FeaturePrefsStore.batch2161.v2166pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2166: punched mode
internal fun PlayerActivity.showV2166PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166punched
    FeaturePrefsStore.batch2161.v2166punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2166: purchased mode
internal fun PlayerActivity.showV2166PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166purchased
    FeaturePrefsStore.batch2161.v2166purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2166: pursued mode
internal fun PlayerActivity.showV2166PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pursued
    FeaturePrefsStore.batch2161.v2166pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2166: pushed mode
internal fun PlayerActivity.showV2166PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pushed
    FeaturePrefsStore.batch2161.v2166pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2167: propagated mode
internal fun PlayerActivity.showV2167PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167propagated
    FeaturePrefsStore.batch2161.v2167propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2167: properized mode
internal fun PlayerActivity.showV2167ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167properized
    FeaturePrefsStore.batch2161.v2167properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2167: proposed mode
internal fun PlayerActivity.showV2167ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167proposed
    FeaturePrefsStore.batch2161.v2167proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2167: protected mode
internal fun PlayerActivity.showV2167ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167protected
    FeaturePrefsStore.batch2161.v2167protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2167: protested mode
internal fun PlayerActivity.showV2167ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167protested
    FeaturePrefsStore.batch2161.v2167protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2167: proved level
internal fun PlayerActivity.showV2167ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2167: provided level
internal fun PlayerActivity.showV2167ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2167: provoked level
internal fun PlayerActivity.showV2167ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2167: published level
internal fun PlayerActivity.showV2167PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167published = value
        AppToast.show(this, "published: $value")
    }
}

// v2167: pulled level
internal fun PlayerActivity.showV2167PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2167: pumped mode
internal fun PlayerActivity.showV2167PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pumped
    FeaturePrefsStore.batch2161.v2167pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2167: punched mode
internal fun PlayerActivity.showV2167PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167punched
    FeaturePrefsStore.batch2161.v2167punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2167: purchased mode
internal fun PlayerActivity.showV2167PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167purchased
    FeaturePrefsStore.batch2161.v2167purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2167: pursued mode
internal fun PlayerActivity.showV2167PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pursued
    FeaturePrefsStore.batch2161.v2167pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2167: pushed mode
internal fun PlayerActivity.showV2167PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pushed
    FeaturePrefsStore.batch2161.v2167pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2168: propagated mode
internal fun PlayerActivity.showV2168PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168propagated
    FeaturePrefsStore.batch2161.v2168propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2168: properized mode
internal fun PlayerActivity.showV2168ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168properized
    FeaturePrefsStore.batch2161.v2168properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2168: proposed mode
internal fun PlayerActivity.showV2168ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168proposed
    FeaturePrefsStore.batch2161.v2168proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2168: protected mode
internal fun PlayerActivity.showV2168ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168protected
    FeaturePrefsStore.batch2161.v2168protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2168: protested mode
internal fun PlayerActivity.showV2168ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168protested
    FeaturePrefsStore.batch2161.v2168protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2168: proved level
internal fun PlayerActivity.showV2168ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2168: provided level
internal fun PlayerActivity.showV2168ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2168: provoked level
internal fun PlayerActivity.showV2168ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2168: published level
internal fun PlayerActivity.showV2168PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168published = value
        AppToast.show(this, "published: $value")
    }
}

// v2168: pulled level
internal fun PlayerActivity.showV2168PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2168: pumped mode
internal fun PlayerActivity.showV2168PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pumped
    FeaturePrefsStore.batch2161.v2168pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2168: punched mode
internal fun PlayerActivity.showV2168PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168punched
    FeaturePrefsStore.batch2161.v2168punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2168: purchased mode
internal fun PlayerActivity.showV2168PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168purchased
    FeaturePrefsStore.batch2161.v2168purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2168: pursued mode
internal fun PlayerActivity.showV2168PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pursued
    FeaturePrefsStore.batch2161.v2168pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2168: pushed mode
internal fun PlayerActivity.showV2168PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pushed
    FeaturePrefsStore.batch2161.v2168pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2169: propagated mode
internal fun PlayerActivity.showV2169PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169propagated
    FeaturePrefsStore.batch2161.v2169propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2169: properized mode
internal fun PlayerActivity.showV2169ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169properized
    FeaturePrefsStore.batch2161.v2169properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2169: proposed mode
internal fun PlayerActivity.showV2169ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169proposed
    FeaturePrefsStore.batch2161.v2169proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2169: protected mode
internal fun PlayerActivity.showV2169ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169protected
    FeaturePrefsStore.batch2161.v2169protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2169: protested mode
internal fun PlayerActivity.showV2169ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169protested
    FeaturePrefsStore.batch2161.v2169protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2169: proved level
internal fun PlayerActivity.showV2169ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2169: provided level
internal fun PlayerActivity.showV2169ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2169: provoked level
internal fun PlayerActivity.showV2169ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2169: published level
internal fun PlayerActivity.showV2169PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169published = value
        AppToast.show(this, "published: $value")
    }
}

// v2169: pulled level
internal fun PlayerActivity.showV2169PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2169: pumped mode
internal fun PlayerActivity.showV2169PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pumped
    FeaturePrefsStore.batch2161.v2169pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2169: punched mode
internal fun PlayerActivity.showV2169PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169punched
    FeaturePrefsStore.batch2161.v2169punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2169: purchased mode
internal fun PlayerActivity.showV2169PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169purchased
    FeaturePrefsStore.batch2161.v2169purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2169: pursued mode
internal fun PlayerActivity.showV2169PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pursued
    FeaturePrefsStore.batch2161.v2169pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2169: pushed mode
internal fun PlayerActivity.showV2169PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pushed
    FeaturePrefsStore.batch2161.v2169pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2170: propagated mode
internal fun PlayerActivity.showV2170PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170propagated
    FeaturePrefsStore.batch2161.v2170propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2170: properized mode
internal fun PlayerActivity.showV2170ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170properized
    FeaturePrefsStore.batch2161.v2170properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2170: proposed mode
internal fun PlayerActivity.showV2170ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170proposed
    FeaturePrefsStore.batch2161.v2170proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2170: protected mode
internal fun PlayerActivity.showV2170ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170protected
    FeaturePrefsStore.batch2161.v2170protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2170: protested mode
internal fun PlayerActivity.showV2170ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170protested
    FeaturePrefsStore.batch2161.v2170protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2170: proved level
internal fun PlayerActivity.showV2170ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2170: provided level
internal fun PlayerActivity.showV2170ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2170: provoked level
internal fun PlayerActivity.showV2170ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2170: published level
internal fun PlayerActivity.showV2170PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170published = value
        AppToast.show(this, "published: $value")
    }
}

// v2170: pulled level
internal fun PlayerActivity.showV2170PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2170: pumped mode
internal fun PlayerActivity.showV2170PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pumped
    FeaturePrefsStore.batch2161.v2170pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2170: punched mode
internal fun PlayerActivity.showV2170PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170punched
    FeaturePrefsStore.batch2161.v2170punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2170: purchased mode
internal fun PlayerActivity.showV2170PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170purchased
    FeaturePrefsStore.batch2161.v2170purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2170: pursued mode
internal fun PlayerActivity.showV2170PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pursued
    FeaturePrefsStore.batch2161.v2170pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2170: pushed mode
internal fun PlayerActivity.showV2170PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pushed
    FeaturePrefsStore.batch2161.v2170pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

