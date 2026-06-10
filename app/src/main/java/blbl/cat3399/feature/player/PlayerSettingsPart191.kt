package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2091: mapped mode
internal fun PlayerActivity.showV2091MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mapped
    FeaturePrefsStore.batch2091.v2091mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2091: marked mode
internal fun PlayerActivity.showV2091MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091marked
    FeaturePrefsStore.batch2091.v2091marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2091: matched mode
internal fun PlayerActivity.showV2091MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091matched
    FeaturePrefsStore.batch2091.v2091matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2091: measured mode
internal fun PlayerActivity.showV2091MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2091measured
    FeaturePrefsStore.batch2091.v2091measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2091: mediated mode
internal fun PlayerActivity.showV2091MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mediated
    FeaturePrefsStore.batch2091.v2091mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2091: merged level
internal fun PlayerActivity.showV2091MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2091: metered level
internal fun PlayerActivity.showV2091MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2091: migrated level
internal fun PlayerActivity.showV2091MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2091: minimized level
internal fun PlayerActivity.showV2091MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2091: missed level
internal fun PlayerActivity.showV2091MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2091: mixed mode
internal fun PlayerActivity.showV2091MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mixed
    FeaturePrefsStore.batch2091.v2091mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2091: modeled mode
internal fun PlayerActivity.showV2091ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2091modeled
    FeaturePrefsStore.batch2091.v2091modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2091: modified mode
internal fun PlayerActivity.showV2091ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091modified
    FeaturePrefsStore.batch2091.v2091modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2091: monitored mode
internal fun PlayerActivity.showV2091MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2091monitored
    FeaturePrefsStore.batch2091.v2091monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2091: motivated mode
internal fun PlayerActivity.showV2091MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091motivated
    FeaturePrefsStore.batch2091.v2091motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2092: mapped mode
internal fun PlayerActivity.showV2092MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mapped
    FeaturePrefsStore.batch2091.v2092mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2092: marked mode
internal fun PlayerActivity.showV2092MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092marked
    FeaturePrefsStore.batch2091.v2092marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2092: matched mode
internal fun PlayerActivity.showV2092MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092matched
    FeaturePrefsStore.batch2091.v2092matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2092: measured mode
internal fun PlayerActivity.showV2092MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2092measured
    FeaturePrefsStore.batch2091.v2092measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2092: mediated mode
internal fun PlayerActivity.showV2092MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mediated
    FeaturePrefsStore.batch2091.v2092mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2092: merged level
internal fun PlayerActivity.showV2092MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2092: metered level
internal fun PlayerActivity.showV2092MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2092: migrated level
internal fun PlayerActivity.showV2092MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2092: minimized level
internal fun PlayerActivity.showV2092MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2092: missed level
internal fun PlayerActivity.showV2092MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2092: mixed mode
internal fun PlayerActivity.showV2092MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mixed
    FeaturePrefsStore.batch2091.v2092mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2092: modeled mode
internal fun PlayerActivity.showV2092ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2092modeled
    FeaturePrefsStore.batch2091.v2092modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2092: modified mode
internal fun PlayerActivity.showV2092ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092modified
    FeaturePrefsStore.batch2091.v2092modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2092: monitored mode
internal fun PlayerActivity.showV2092MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2092monitored
    FeaturePrefsStore.batch2091.v2092monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2092: motivated mode
internal fun PlayerActivity.showV2092MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092motivated
    FeaturePrefsStore.batch2091.v2092motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2093: mapped mode
internal fun PlayerActivity.showV2093MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mapped
    FeaturePrefsStore.batch2091.v2093mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2093: marked mode
internal fun PlayerActivity.showV2093MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093marked
    FeaturePrefsStore.batch2091.v2093marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2093: matched mode
internal fun PlayerActivity.showV2093MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093matched
    FeaturePrefsStore.batch2091.v2093matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2093: measured mode
internal fun PlayerActivity.showV2093MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2093measured
    FeaturePrefsStore.batch2091.v2093measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2093: mediated mode
internal fun PlayerActivity.showV2093MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mediated
    FeaturePrefsStore.batch2091.v2093mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2093: merged level
internal fun PlayerActivity.showV2093MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2093: metered level
internal fun PlayerActivity.showV2093MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2093: migrated level
internal fun PlayerActivity.showV2093MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2093: minimized level
internal fun PlayerActivity.showV2093MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2093: missed level
internal fun PlayerActivity.showV2093MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2093: mixed mode
internal fun PlayerActivity.showV2093MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mixed
    FeaturePrefsStore.batch2091.v2093mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2093: modeled mode
internal fun PlayerActivity.showV2093ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2093modeled
    FeaturePrefsStore.batch2091.v2093modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2093: modified mode
internal fun PlayerActivity.showV2093ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093modified
    FeaturePrefsStore.batch2091.v2093modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2093: monitored mode
internal fun PlayerActivity.showV2093MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2093monitored
    FeaturePrefsStore.batch2091.v2093monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2093: motivated mode
internal fun PlayerActivity.showV2093MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093motivated
    FeaturePrefsStore.batch2091.v2093motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2094: mapped mode
internal fun PlayerActivity.showV2094MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mapped
    FeaturePrefsStore.batch2091.v2094mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2094: marked mode
internal fun PlayerActivity.showV2094MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094marked
    FeaturePrefsStore.batch2091.v2094marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2094: matched mode
internal fun PlayerActivity.showV2094MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094matched
    FeaturePrefsStore.batch2091.v2094matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2094: measured mode
internal fun PlayerActivity.showV2094MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2094measured
    FeaturePrefsStore.batch2091.v2094measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2094: mediated mode
internal fun PlayerActivity.showV2094MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mediated
    FeaturePrefsStore.batch2091.v2094mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2094: merged level
internal fun PlayerActivity.showV2094MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2094: metered level
internal fun PlayerActivity.showV2094MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2094: migrated level
internal fun PlayerActivity.showV2094MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2094: minimized level
internal fun PlayerActivity.showV2094MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2094: missed level
internal fun PlayerActivity.showV2094MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2094: mixed mode
internal fun PlayerActivity.showV2094MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mixed
    FeaturePrefsStore.batch2091.v2094mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2094: modeled mode
internal fun PlayerActivity.showV2094ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2094modeled
    FeaturePrefsStore.batch2091.v2094modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2094: modified mode
internal fun PlayerActivity.showV2094ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094modified
    FeaturePrefsStore.batch2091.v2094modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2094: monitored mode
internal fun PlayerActivity.showV2094MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2094monitored
    FeaturePrefsStore.batch2091.v2094monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2094: motivated mode
internal fun PlayerActivity.showV2094MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094motivated
    FeaturePrefsStore.batch2091.v2094motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2095: mapped mode
internal fun PlayerActivity.showV2095MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mapped
    FeaturePrefsStore.batch2091.v2095mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2095: marked mode
internal fun PlayerActivity.showV2095MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095marked
    FeaturePrefsStore.batch2091.v2095marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2095: matched mode
internal fun PlayerActivity.showV2095MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095matched
    FeaturePrefsStore.batch2091.v2095matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2095: measured mode
internal fun PlayerActivity.showV2095MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2095measured
    FeaturePrefsStore.batch2091.v2095measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2095: mediated mode
internal fun PlayerActivity.showV2095MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mediated
    FeaturePrefsStore.batch2091.v2095mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2095: merged level
internal fun PlayerActivity.showV2095MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2095: metered level
internal fun PlayerActivity.showV2095MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2095: migrated level
internal fun PlayerActivity.showV2095MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2095: minimized level
internal fun PlayerActivity.showV2095MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2095: missed level
internal fun PlayerActivity.showV2095MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2095: mixed mode
internal fun PlayerActivity.showV2095MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mixed
    FeaturePrefsStore.batch2091.v2095mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2095: modeled mode
internal fun PlayerActivity.showV2095ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2095modeled
    FeaturePrefsStore.batch2091.v2095modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2095: modified mode
internal fun PlayerActivity.showV2095ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095modified
    FeaturePrefsStore.batch2091.v2095modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2095: monitored mode
internal fun PlayerActivity.showV2095MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2095monitored
    FeaturePrefsStore.batch2091.v2095monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2095: motivated mode
internal fun PlayerActivity.showV2095MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095motivated
    FeaturePrefsStore.batch2091.v2095motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2096: mapped mode
internal fun PlayerActivity.showV2096MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mapped
    FeaturePrefsStore.batch2091.v2096mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2096: marked mode
internal fun PlayerActivity.showV2096MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096marked
    FeaturePrefsStore.batch2091.v2096marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2096: matched mode
internal fun PlayerActivity.showV2096MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096matched
    FeaturePrefsStore.batch2091.v2096matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2096: measured mode
internal fun PlayerActivity.showV2096MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2096measured
    FeaturePrefsStore.batch2091.v2096measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2096: mediated mode
internal fun PlayerActivity.showV2096MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mediated
    FeaturePrefsStore.batch2091.v2096mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2096: merged level
internal fun PlayerActivity.showV2096MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2096: metered level
internal fun PlayerActivity.showV2096MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2096: migrated level
internal fun PlayerActivity.showV2096MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2096: minimized level
internal fun PlayerActivity.showV2096MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2096: missed level
internal fun PlayerActivity.showV2096MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2096: mixed mode
internal fun PlayerActivity.showV2096MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mixed
    FeaturePrefsStore.batch2091.v2096mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2096: modeled mode
internal fun PlayerActivity.showV2096ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2096modeled
    FeaturePrefsStore.batch2091.v2096modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2096: modified mode
internal fun PlayerActivity.showV2096ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096modified
    FeaturePrefsStore.batch2091.v2096modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2096: monitored mode
internal fun PlayerActivity.showV2096MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2096monitored
    FeaturePrefsStore.batch2091.v2096monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2096: motivated mode
internal fun PlayerActivity.showV2096MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096motivated
    FeaturePrefsStore.batch2091.v2096motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2097: mapped mode
internal fun PlayerActivity.showV2097MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mapped
    FeaturePrefsStore.batch2091.v2097mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2097: marked mode
internal fun PlayerActivity.showV2097MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097marked
    FeaturePrefsStore.batch2091.v2097marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2097: matched mode
internal fun PlayerActivity.showV2097MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097matched
    FeaturePrefsStore.batch2091.v2097matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2097: measured mode
internal fun PlayerActivity.showV2097MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2097measured
    FeaturePrefsStore.batch2091.v2097measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2097: mediated mode
internal fun PlayerActivity.showV2097MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mediated
    FeaturePrefsStore.batch2091.v2097mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2097: merged level
internal fun PlayerActivity.showV2097MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2097: metered level
internal fun PlayerActivity.showV2097MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2097: migrated level
internal fun PlayerActivity.showV2097MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2097: minimized level
internal fun PlayerActivity.showV2097MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2097: missed level
internal fun PlayerActivity.showV2097MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2097: mixed mode
internal fun PlayerActivity.showV2097MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mixed
    FeaturePrefsStore.batch2091.v2097mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2097: modeled mode
internal fun PlayerActivity.showV2097ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2097modeled
    FeaturePrefsStore.batch2091.v2097modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2097: modified mode
internal fun PlayerActivity.showV2097ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097modified
    FeaturePrefsStore.batch2091.v2097modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2097: monitored mode
internal fun PlayerActivity.showV2097MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2097monitored
    FeaturePrefsStore.batch2091.v2097monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2097: motivated mode
internal fun PlayerActivity.showV2097MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097motivated
    FeaturePrefsStore.batch2091.v2097motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2098: mapped mode
internal fun PlayerActivity.showV2098MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mapped
    FeaturePrefsStore.batch2091.v2098mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2098: marked mode
internal fun PlayerActivity.showV2098MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098marked
    FeaturePrefsStore.batch2091.v2098marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2098: matched mode
internal fun PlayerActivity.showV2098MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098matched
    FeaturePrefsStore.batch2091.v2098matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2098: measured mode
internal fun PlayerActivity.showV2098MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2098measured
    FeaturePrefsStore.batch2091.v2098measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2098: mediated mode
internal fun PlayerActivity.showV2098MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mediated
    FeaturePrefsStore.batch2091.v2098mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2098: merged level
internal fun PlayerActivity.showV2098MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2098: metered level
internal fun PlayerActivity.showV2098MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2098: migrated level
internal fun PlayerActivity.showV2098MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2098: minimized level
internal fun PlayerActivity.showV2098MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2098: missed level
internal fun PlayerActivity.showV2098MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2098: mixed mode
internal fun PlayerActivity.showV2098MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mixed
    FeaturePrefsStore.batch2091.v2098mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2098: modeled mode
internal fun PlayerActivity.showV2098ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2098modeled
    FeaturePrefsStore.batch2091.v2098modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2098: modified mode
internal fun PlayerActivity.showV2098ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098modified
    FeaturePrefsStore.batch2091.v2098modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2098: monitored mode
internal fun PlayerActivity.showV2098MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2098monitored
    FeaturePrefsStore.batch2091.v2098monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2098: motivated mode
internal fun PlayerActivity.showV2098MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098motivated
    FeaturePrefsStore.batch2091.v2098motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2099: mapped mode
internal fun PlayerActivity.showV2099MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mapped
    FeaturePrefsStore.batch2091.v2099mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2099: marked mode
internal fun PlayerActivity.showV2099MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099marked
    FeaturePrefsStore.batch2091.v2099marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2099: matched mode
internal fun PlayerActivity.showV2099MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099matched
    FeaturePrefsStore.batch2091.v2099matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2099: measured mode
internal fun PlayerActivity.showV2099MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2099measured
    FeaturePrefsStore.batch2091.v2099measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2099: mediated mode
internal fun PlayerActivity.showV2099MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mediated
    FeaturePrefsStore.batch2091.v2099mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2099: merged level
internal fun PlayerActivity.showV2099MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2099: metered level
internal fun PlayerActivity.showV2099MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2099: migrated level
internal fun PlayerActivity.showV2099MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2099: minimized level
internal fun PlayerActivity.showV2099MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2099: missed level
internal fun PlayerActivity.showV2099MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2099: mixed mode
internal fun PlayerActivity.showV2099MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mixed
    FeaturePrefsStore.batch2091.v2099mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2099: modeled mode
internal fun PlayerActivity.showV2099ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2099modeled
    FeaturePrefsStore.batch2091.v2099modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2099: modified mode
internal fun PlayerActivity.showV2099ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099modified
    FeaturePrefsStore.batch2091.v2099modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2099: monitored mode
internal fun PlayerActivity.showV2099MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2099monitored
    FeaturePrefsStore.batch2091.v2099monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2099: motivated mode
internal fun PlayerActivity.showV2099MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099motivated
    FeaturePrefsStore.batch2091.v2099motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2100: mapped mode
internal fun PlayerActivity.showV2100MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mapped
    FeaturePrefsStore.batch2091.v2100mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2100: marked mode
internal fun PlayerActivity.showV2100MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100marked
    FeaturePrefsStore.batch2091.v2100marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2100: matched mode
internal fun PlayerActivity.showV2100MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100matched
    FeaturePrefsStore.batch2091.v2100matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2100: measured mode
internal fun PlayerActivity.showV2100MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2100measured
    FeaturePrefsStore.batch2091.v2100measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2100: mediated mode
internal fun PlayerActivity.showV2100MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mediated
    FeaturePrefsStore.batch2091.v2100mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2100: merged level
internal fun PlayerActivity.showV2100MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2100: metered level
internal fun PlayerActivity.showV2100MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2100: migrated level
internal fun PlayerActivity.showV2100MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2100: minimized level
internal fun PlayerActivity.showV2100MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2100: missed level
internal fun PlayerActivity.showV2100MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2100: mixed mode
internal fun PlayerActivity.showV2100MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mixed
    FeaturePrefsStore.batch2091.v2100mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2100: modeled mode
internal fun PlayerActivity.showV2100ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2100modeled
    FeaturePrefsStore.batch2091.v2100modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2100: modified mode
internal fun PlayerActivity.showV2100ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100modified
    FeaturePrefsStore.batch2091.v2100modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2100: monitored mode
internal fun PlayerActivity.showV2100MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2100monitored
    FeaturePrefsStore.batch2091.v2100monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2100: motivated mode
internal fun PlayerActivity.showV2100MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100motivated
    FeaturePrefsStore.batch2091.v2100motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

