package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2131: perceived mode
internal fun PlayerActivity.showV2131PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131perceived
    FeaturePrefsStore.batch2131.v2131perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2131: performed mode
internal fun PlayerActivity.showV2131PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131performed
    FeaturePrefsStore.batch2131.v2131performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2131: permitted mode
internal fun PlayerActivity.showV2131PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131permitted
    FeaturePrefsStore.batch2131.v2131permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2131: persisted mode
internal fun PlayerActivity.showV2131PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131persisted
    FeaturePrefsStore.batch2131.v2131persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2131: personalized mode
internal fun PlayerActivity.showV2131PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131personalized
    FeaturePrefsStore.batch2131.v2131personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2131: persuaded level
internal fun PlayerActivity.showV2131PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2131persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2131persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2131: placed level
internal fun PlayerActivity.showV2131PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2131placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2131placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2131: planned level
internal fun PlayerActivity.showV2131PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2131planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2131planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2131: played level
internal fun PlayerActivity.showV2131PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2131played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2131played = value
        AppToast.show(this, "played: $value")
    }
}

// v2131: pleased level
internal fun PlayerActivity.showV2131PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2131pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2131pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2131: pledged mode
internal fun PlayerActivity.showV2131PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131pledged
    FeaturePrefsStore.batch2131.v2131pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2131: plotted mode
internal fun PlayerActivity.showV2131PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131plotted
    FeaturePrefsStore.batch2131.v2131plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2131: pointed mode
internal fun PlayerActivity.showV2131PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131pointed
    FeaturePrefsStore.batch2131.v2131pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2131: polished mode
internal fun PlayerActivity.showV2131PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2131polished
    FeaturePrefsStore.batch2131.v2131polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2131: pooled mode
internal fun PlayerActivity.showV2131PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2131pooled
    FeaturePrefsStore.batch2131.v2131pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2132: perceived mode
internal fun PlayerActivity.showV2132PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132perceived
    FeaturePrefsStore.batch2131.v2132perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2132: performed mode
internal fun PlayerActivity.showV2132PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132performed
    FeaturePrefsStore.batch2131.v2132performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2132: permitted mode
internal fun PlayerActivity.showV2132PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132permitted
    FeaturePrefsStore.batch2131.v2132permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2132: persisted mode
internal fun PlayerActivity.showV2132PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132persisted
    FeaturePrefsStore.batch2131.v2132persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2132: personalized mode
internal fun PlayerActivity.showV2132PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132personalized
    FeaturePrefsStore.batch2131.v2132personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2132: persuaded level
internal fun PlayerActivity.showV2132PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2132persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2132persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2132: placed level
internal fun PlayerActivity.showV2132PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2132placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2132placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2132: planned level
internal fun PlayerActivity.showV2132PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2132planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2132planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2132: played level
internal fun PlayerActivity.showV2132PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2132played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2132played = value
        AppToast.show(this, "played: $value")
    }
}

// v2132: pleased level
internal fun PlayerActivity.showV2132PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2132pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2132pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2132: pledged mode
internal fun PlayerActivity.showV2132PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132pledged
    FeaturePrefsStore.batch2131.v2132pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2132: plotted mode
internal fun PlayerActivity.showV2132PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132plotted
    FeaturePrefsStore.batch2131.v2132plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2132: pointed mode
internal fun PlayerActivity.showV2132PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132pointed
    FeaturePrefsStore.batch2131.v2132pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2132: polished mode
internal fun PlayerActivity.showV2132PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2132polished
    FeaturePrefsStore.batch2131.v2132polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2132: pooled mode
internal fun PlayerActivity.showV2132PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2132pooled
    FeaturePrefsStore.batch2131.v2132pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2133: perceived mode
internal fun PlayerActivity.showV2133PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133perceived
    FeaturePrefsStore.batch2131.v2133perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2133: performed mode
internal fun PlayerActivity.showV2133PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133performed
    FeaturePrefsStore.batch2131.v2133performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2133: permitted mode
internal fun PlayerActivity.showV2133PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133permitted
    FeaturePrefsStore.batch2131.v2133permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2133: persisted mode
internal fun PlayerActivity.showV2133PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133persisted
    FeaturePrefsStore.batch2131.v2133persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2133: personalized mode
internal fun PlayerActivity.showV2133PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133personalized
    FeaturePrefsStore.batch2131.v2133personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2133: persuaded level
internal fun PlayerActivity.showV2133PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2133persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2133persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2133: placed level
internal fun PlayerActivity.showV2133PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2133placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2133placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2133: planned level
internal fun PlayerActivity.showV2133PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2133planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2133planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2133: played level
internal fun PlayerActivity.showV2133PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2133played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2133played = value
        AppToast.show(this, "played: $value")
    }
}

// v2133: pleased level
internal fun PlayerActivity.showV2133PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2133pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2133pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2133: pledged mode
internal fun PlayerActivity.showV2133PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133pledged
    FeaturePrefsStore.batch2131.v2133pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2133: plotted mode
internal fun PlayerActivity.showV2133PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133plotted
    FeaturePrefsStore.batch2131.v2133plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2133: pointed mode
internal fun PlayerActivity.showV2133PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133pointed
    FeaturePrefsStore.batch2131.v2133pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2133: polished mode
internal fun PlayerActivity.showV2133PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2133polished
    FeaturePrefsStore.batch2131.v2133polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2133: pooled mode
internal fun PlayerActivity.showV2133PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2133pooled
    FeaturePrefsStore.batch2131.v2133pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2134: perceived mode
internal fun PlayerActivity.showV2134PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134perceived
    FeaturePrefsStore.batch2131.v2134perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2134: performed mode
internal fun PlayerActivity.showV2134PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134performed
    FeaturePrefsStore.batch2131.v2134performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2134: permitted mode
internal fun PlayerActivity.showV2134PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134permitted
    FeaturePrefsStore.batch2131.v2134permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2134: persisted mode
internal fun PlayerActivity.showV2134PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134persisted
    FeaturePrefsStore.batch2131.v2134persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2134: personalized mode
internal fun PlayerActivity.showV2134PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134personalized
    FeaturePrefsStore.batch2131.v2134personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2134: persuaded level
internal fun PlayerActivity.showV2134PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2134persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2134persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2134: placed level
internal fun PlayerActivity.showV2134PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2134placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2134placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2134: planned level
internal fun PlayerActivity.showV2134PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2134planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2134planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2134: played level
internal fun PlayerActivity.showV2134PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2134played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2134played = value
        AppToast.show(this, "played: $value")
    }
}

// v2134: pleased level
internal fun PlayerActivity.showV2134PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2134pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2134pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2134: pledged mode
internal fun PlayerActivity.showV2134PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134pledged
    FeaturePrefsStore.batch2131.v2134pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2134: plotted mode
internal fun PlayerActivity.showV2134PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134plotted
    FeaturePrefsStore.batch2131.v2134plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2134: pointed mode
internal fun PlayerActivity.showV2134PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134pointed
    FeaturePrefsStore.batch2131.v2134pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2134: polished mode
internal fun PlayerActivity.showV2134PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2134polished
    FeaturePrefsStore.batch2131.v2134polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2134: pooled mode
internal fun PlayerActivity.showV2134PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2134pooled
    FeaturePrefsStore.batch2131.v2134pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2135: perceived mode
internal fun PlayerActivity.showV2135PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135perceived
    FeaturePrefsStore.batch2131.v2135perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2135: performed mode
internal fun PlayerActivity.showV2135PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135performed
    FeaturePrefsStore.batch2131.v2135performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2135: permitted mode
internal fun PlayerActivity.showV2135PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135permitted
    FeaturePrefsStore.batch2131.v2135permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2135: persisted mode
internal fun PlayerActivity.showV2135PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135persisted
    FeaturePrefsStore.batch2131.v2135persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2135: personalized mode
internal fun PlayerActivity.showV2135PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135personalized
    FeaturePrefsStore.batch2131.v2135personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2135: persuaded level
internal fun PlayerActivity.showV2135PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2135persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2135persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2135: placed level
internal fun PlayerActivity.showV2135PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2135placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2135placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2135: planned level
internal fun PlayerActivity.showV2135PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2135planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2135planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2135: played level
internal fun PlayerActivity.showV2135PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2135played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2135played = value
        AppToast.show(this, "played: $value")
    }
}

// v2135: pleased level
internal fun PlayerActivity.showV2135PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2135pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2135pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2135: pledged mode
internal fun PlayerActivity.showV2135PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135pledged
    FeaturePrefsStore.batch2131.v2135pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2135: plotted mode
internal fun PlayerActivity.showV2135PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135plotted
    FeaturePrefsStore.batch2131.v2135plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2135: pointed mode
internal fun PlayerActivity.showV2135PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135pointed
    FeaturePrefsStore.batch2131.v2135pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2135: polished mode
internal fun PlayerActivity.showV2135PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2135polished
    FeaturePrefsStore.batch2131.v2135polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2135: pooled mode
internal fun PlayerActivity.showV2135PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2135pooled
    FeaturePrefsStore.batch2131.v2135pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2136: perceived mode
internal fun PlayerActivity.showV2136PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136perceived
    FeaturePrefsStore.batch2131.v2136perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2136: performed mode
internal fun PlayerActivity.showV2136PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136performed
    FeaturePrefsStore.batch2131.v2136performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2136: permitted mode
internal fun PlayerActivity.showV2136PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136permitted
    FeaturePrefsStore.batch2131.v2136permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2136: persisted mode
internal fun PlayerActivity.showV2136PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136persisted
    FeaturePrefsStore.batch2131.v2136persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2136: personalized mode
internal fun PlayerActivity.showV2136PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136personalized
    FeaturePrefsStore.batch2131.v2136personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2136: persuaded level
internal fun PlayerActivity.showV2136PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2136persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2136persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2136: placed level
internal fun PlayerActivity.showV2136PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2136placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2136placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2136: planned level
internal fun PlayerActivity.showV2136PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2136planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2136planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2136: played level
internal fun PlayerActivity.showV2136PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2136played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2136played = value
        AppToast.show(this, "played: $value")
    }
}

// v2136: pleased level
internal fun PlayerActivity.showV2136PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2136pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2136pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2136: pledged mode
internal fun PlayerActivity.showV2136PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136pledged
    FeaturePrefsStore.batch2131.v2136pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2136: plotted mode
internal fun PlayerActivity.showV2136PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136plotted
    FeaturePrefsStore.batch2131.v2136plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2136: pointed mode
internal fun PlayerActivity.showV2136PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136pointed
    FeaturePrefsStore.batch2131.v2136pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2136: polished mode
internal fun PlayerActivity.showV2136PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2136polished
    FeaturePrefsStore.batch2131.v2136polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2136: pooled mode
internal fun PlayerActivity.showV2136PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2136pooled
    FeaturePrefsStore.batch2131.v2136pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2137: perceived mode
internal fun PlayerActivity.showV2137PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137perceived
    FeaturePrefsStore.batch2131.v2137perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2137: performed mode
internal fun PlayerActivity.showV2137PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137performed
    FeaturePrefsStore.batch2131.v2137performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2137: permitted mode
internal fun PlayerActivity.showV2137PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137permitted
    FeaturePrefsStore.batch2131.v2137permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2137: persisted mode
internal fun PlayerActivity.showV2137PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137persisted
    FeaturePrefsStore.batch2131.v2137persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2137: personalized mode
internal fun PlayerActivity.showV2137PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137personalized
    FeaturePrefsStore.batch2131.v2137personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2137: persuaded level
internal fun PlayerActivity.showV2137PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2137persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2137persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2137: placed level
internal fun PlayerActivity.showV2137PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2137placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2137placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2137: planned level
internal fun PlayerActivity.showV2137PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2137planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2137planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2137: played level
internal fun PlayerActivity.showV2137PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2137played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2137played = value
        AppToast.show(this, "played: $value")
    }
}

// v2137: pleased level
internal fun PlayerActivity.showV2137PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2137pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2137pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2137: pledged mode
internal fun PlayerActivity.showV2137PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137pledged
    FeaturePrefsStore.batch2131.v2137pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2137: plotted mode
internal fun PlayerActivity.showV2137PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137plotted
    FeaturePrefsStore.batch2131.v2137plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2137: pointed mode
internal fun PlayerActivity.showV2137PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137pointed
    FeaturePrefsStore.batch2131.v2137pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2137: polished mode
internal fun PlayerActivity.showV2137PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2137polished
    FeaturePrefsStore.batch2131.v2137polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2137: pooled mode
internal fun PlayerActivity.showV2137PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2137pooled
    FeaturePrefsStore.batch2131.v2137pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2138: perceived mode
internal fun PlayerActivity.showV2138PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138perceived
    FeaturePrefsStore.batch2131.v2138perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2138: performed mode
internal fun PlayerActivity.showV2138PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138performed
    FeaturePrefsStore.batch2131.v2138performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2138: permitted mode
internal fun PlayerActivity.showV2138PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138permitted
    FeaturePrefsStore.batch2131.v2138permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2138: persisted mode
internal fun PlayerActivity.showV2138PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138persisted
    FeaturePrefsStore.batch2131.v2138persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2138: personalized mode
internal fun PlayerActivity.showV2138PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138personalized
    FeaturePrefsStore.batch2131.v2138personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2138: persuaded level
internal fun PlayerActivity.showV2138PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2138persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2138persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2138: placed level
internal fun PlayerActivity.showV2138PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2138placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2138placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2138: planned level
internal fun PlayerActivity.showV2138PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2138planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2138planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2138: played level
internal fun PlayerActivity.showV2138PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2138played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2138played = value
        AppToast.show(this, "played: $value")
    }
}

// v2138: pleased level
internal fun PlayerActivity.showV2138PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2138pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2138pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2138: pledged mode
internal fun PlayerActivity.showV2138PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138pledged
    FeaturePrefsStore.batch2131.v2138pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2138: plotted mode
internal fun PlayerActivity.showV2138PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138plotted
    FeaturePrefsStore.batch2131.v2138plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2138: pointed mode
internal fun PlayerActivity.showV2138PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138pointed
    FeaturePrefsStore.batch2131.v2138pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2138: polished mode
internal fun PlayerActivity.showV2138PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2138polished
    FeaturePrefsStore.batch2131.v2138polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2138: pooled mode
internal fun PlayerActivity.showV2138PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2138pooled
    FeaturePrefsStore.batch2131.v2138pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2139: perceived mode
internal fun PlayerActivity.showV2139PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139perceived
    FeaturePrefsStore.batch2131.v2139perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2139: performed mode
internal fun PlayerActivity.showV2139PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139performed
    FeaturePrefsStore.batch2131.v2139performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2139: permitted mode
internal fun PlayerActivity.showV2139PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139permitted
    FeaturePrefsStore.batch2131.v2139permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2139: persisted mode
internal fun PlayerActivity.showV2139PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139persisted
    FeaturePrefsStore.batch2131.v2139persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2139: personalized mode
internal fun PlayerActivity.showV2139PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139personalized
    FeaturePrefsStore.batch2131.v2139personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2139: persuaded level
internal fun PlayerActivity.showV2139PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2139persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2139persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2139: placed level
internal fun PlayerActivity.showV2139PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2139placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2139placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2139: planned level
internal fun PlayerActivity.showV2139PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2139planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2139planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2139: played level
internal fun PlayerActivity.showV2139PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2139played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2139played = value
        AppToast.show(this, "played: $value")
    }
}

// v2139: pleased level
internal fun PlayerActivity.showV2139PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2139pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2139pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2139: pledged mode
internal fun PlayerActivity.showV2139PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139pledged
    FeaturePrefsStore.batch2131.v2139pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2139: plotted mode
internal fun PlayerActivity.showV2139PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139plotted
    FeaturePrefsStore.batch2131.v2139plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2139: pointed mode
internal fun PlayerActivity.showV2139PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139pointed
    FeaturePrefsStore.batch2131.v2139pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2139: polished mode
internal fun PlayerActivity.showV2139PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2139polished
    FeaturePrefsStore.batch2131.v2139polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2139: pooled mode
internal fun PlayerActivity.showV2139PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2139pooled
    FeaturePrefsStore.batch2131.v2139pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

// v2140: perceived mode
internal fun PlayerActivity.showV2140PerceivedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140perceived
    FeaturePrefsStore.batch2131.v2140perceived = !current
    AppToast.show(this, "perceived: ${if (!current) "ON" else "OFF"}")
}

// v2140: performed mode
internal fun PlayerActivity.showV2140PerformedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140performed
    FeaturePrefsStore.batch2131.v2140performed = !current
    AppToast.show(this, "performed: ${if (!current) "ON" else "OFF"}")
}

// v2140: permitted mode
internal fun PlayerActivity.showV2140PermittedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140permitted
    FeaturePrefsStore.batch2131.v2140permitted = !current
    AppToast.show(this, "permitted: ${if (!current) "ON" else "OFF"}")
}

// v2140: persisted mode
internal fun PlayerActivity.showV2140PersistedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140persisted
    FeaturePrefsStore.batch2131.v2140persisted = !current
    AppToast.show(this, "persisted: ${if (!current) "ON" else "OFF"}")
}

// v2140: personalized mode
internal fun PlayerActivity.showV2140PersonalizedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140personalized
    FeaturePrefsStore.batch2131.v2140personalized = !current
    AppToast.show(this, "personalized: ${if (!current) "ON" else "OFF"}")
}

// v2140: persuaded level
internal fun PlayerActivity.showV2140PersuadedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2140persuaded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "persuaded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2140persuaded = value
        AppToast.show(this, "persuaded: $value")
    }
}

// v2140: placed level
internal fun PlayerActivity.showV2140PlacedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2140placed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "placed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2140placed = value
        AppToast.show(this, "placed: $value")
    }
}

// v2140: planned level
internal fun PlayerActivity.showV2140PlannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2140planned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "planned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2140planned = value
        AppToast.show(this, "planned: $value")
    }
}

// v2140: played level
internal fun PlayerActivity.showV2140PlayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2140played).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "played level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2140played = value
        AppToast.show(this, "played: $value")
    }
}

// v2140: pleased level
internal fun PlayerActivity.showV2140PleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2131.v2140pleased).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pleased level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2131.v2140pleased = value
        AppToast.show(this, "pleased: $value")
    }
}

// v2140: pledged mode
internal fun PlayerActivity.showV2140PledgedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140pledged
    FeaturePrefsStore.batch2131.v2140pledged = !current
    AppToast.show(this, "pledged: ${if (!current) "ON" else "OFF"}")
}

// v2140: plotted mode
internal fun PlayerActivity.showV2140PlottedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140plotted
    FeaturePrefsStore.batch2131.v2140plotted = !current
    AppToast.show(this, "plotted: ${if (!current) "ON" else "OFF"}")
}

// v2140: pointed mode
internal fun PlayerActivity.showV2140PointedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140pointed
    FeaturePrefsStore.batch2131.v2140pointed = !current
    AppToast.show(this, "pointed: ${if (!current) "ON" else "OFF"}")
}

// v2140: polished mode
internal fun PlayerActivity.showV2140PolishedToggle() {
    val current = FeaturePrefsStore.batch2131.v2140polished
    FeaturePrefsStore.batch2131.v2140polished = !current
    AppToast.show(this, "polished: ${if (!current) "ON" else "OFF"}")
}

// v2140: pooled mode
internal fun PlayerActivity.showV2140PooledToggle() {
    val current = FeaturePrefsStore.batch2131.v2140pooled
    FeaturePrefsStore.batch2131.v2140pooled = !current
    AppToast.show(this, "pooled: ${if (!current) "ON" else "OFF"}")
}

