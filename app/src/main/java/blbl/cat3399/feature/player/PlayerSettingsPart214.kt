package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2321: warped mode
internal fun PlayerActivity.showV2321WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321warped
    FeaturePrefsStore.batch2321.v2321warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2321: warranted mode
internal fun PlayerActivity.showV2321WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321warranted
    FeaturePrefsStore.batch2321.v2321warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2321: washed mode
internal fun PlayerActivity.showV2321WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321washed
    FeaturePrefsStore.batch2321.v2321washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2321: wasted mode
internal fun PlayerActivity.showV2321WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321wasted
    FeaturePrefsStore.batch2321.v2321wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2321: watched mode
internal fun PlayerActivity.showV2321WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321watched
    FeaturePrefsStore.batch2321.v2321watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2321: weakened level
internal fun PlayerActivity.showV2321WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2321weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2321weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2321: weaponized level
internal fun PlayerActivity.showV2321WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2321weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2321weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2321: weighed level
internal fun PlayerActivity.showV2321WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2321weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2321weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2321: welcomed level
internal fun PlayerActivity.showV2321WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2321welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2321welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2321: widened level
internal fun PlayerActivity.showV2321WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2321widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2321widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2321: witnessed mode
internal fun PlayerActivity.showV2321WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321witnessed
    FeaturePrefsStore.batch2321.v2321witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2321: wondered mode
internal fun PlayerActivity.showV2321WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321wondered
    FeaturePrefsStore.batch2321.v2321wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2321: worked mode
internal fun PlayerActivity.showV2321WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321worked
    FeaturePrefsStore.batch2321.v2321worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2321: worsened mode
internal fun PlayerActivity.showV2321WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321worsened
    FeaturePrefsStore.batch2321.v2321worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2321: wrapped mode
internal fun PlayerActivity.showV2321WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2321wrapped
    FeaturePrefsStore.batch2321.v2321wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2322: warped mode
internal fun PlayerActivity.showV2322WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322warped
    FeaturePrefsStore.batch2321.v2322warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2322: warranted mode
internal fun PlayerActivity.showV2322WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322warranted
    FeaturePrefsStore.batch2321.v2322warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2322: washed mode
internal fun PlayerActivity.showV2322WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322washed
    FeaturePrefsStore.batch2321.v2322washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2322: wasted mode
internal fun PlayerActivity.showV2322WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322wasted
    FeaturePrefsStore.batch2321.v2322wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2322: watched mode
internal fun PlayerActivity.showV2322WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322watched
    FeaturePrefsStore.batch2321.v2322watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2322: weakened level
internal fun PlayerActivity.showV2322WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2322weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2322weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2322: weaponized level
internal fun PlayerActivity.showV2322WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2322weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2322weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2322: weighed level
internal fun PlayerActivity.showV2322WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2322weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2322weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2322: welcomed level
internal fun PlayerActivity.showV2322WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2322welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2322welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2322: widened level
internal fun PlayerActivity.showV2322WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2322widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2322widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2322: witnessed mode
internal fun PlayerActivity.showV2322WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322witnessed
    FeaturePrefsStore.batch2321.v2322witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2322: wondered mode
internal fun PlayerActivity.showV2322WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322wondered
    FeaturePrefsStore.batch2321.v2322wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2322: worked mode
internal fun PlayerActivity.showV2322WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322worked
    FeaturePrefsStore.batch2321.v2322worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2322: worsened mode
internal fun PlayerActivity.showV2322WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322worsened
    FeaturePrefsStore.batch2321.v2322worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2322: wrapped mode
internal fun PlayerActivity.showV2322WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2322wrapped
    FeaturePrefsStore.batch2321.v2322wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2323: warped mode
internal fun PlayerActivity.showV2323WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323warped
    FeaturePrefsStore.batch2321.v2323warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2323: warranted mode
internal fun PlayerActivity.showV2323WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323warranted
    FeaturePrefsStore.batch2321.v2323warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2323: washed mode
internal fun PlayerActivity.showV2323WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323washed
    FeaturePrefsStore.batch2321.v2323washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2323: wasted mode
internal fun PlayerActivity.showV2323WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323wasted
    FeaturePrefsStore.batch2321.v2323wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2323: watched mode
internal fun PlayerActivity.showV2323WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323watched
    FeaturePrefsStore.batch2321.v2323watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2323: weakened level
internal fun PlayerActivity.showV2323WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2323weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2323weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2323: weaponized level
internal fun PlayerActivity.showV2323WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2323weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2323weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2323: weighed level
internal fun PlayerActivity.showV2323WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2323weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2323weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2323: welcomed level
internal fun PlayerActivity.showV2323WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2323welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2323welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2323: widened level
internal fun PlayerActivity.showV2323WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2323widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2323widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2323: witnessed mode
internal fun PlayerActivity.showV2323WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323witnessed
    FeaturePrefsStore.batch2321.v2323witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2323: wondered mode
internal fun PlayerActivity.showV2323WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323wondered
    FeaturePrefsStore.batch2321.v2323wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2323: worked mode
internal fun PlayerActivity.showV2323WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323worked
    FeaturePrefsStore.batch2321.v2323worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2323: worsened mode
internal fun PlayerActivity.showV2323WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323worsened
    FeaturePrefsStore.batch2321.v2323worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2323: wrapped mode
internal fun PlayerActivity.showV2323WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2323wrapped
    FeaturePrefsStore.batch2321.v2323wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2324: warped mode
internal fun PlayerActivity.showV2324WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324warped
    FeaturePrefsStore.batch2321.v2324warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2324: warranted mode
internal fun PlayerActivity.showV2324WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324warranted
    FeaturePrefsStore.batch2321.v2324warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2324: washed mode
internal fun PlayerActivity.showV2324WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324washed
    FeaturePrefsStore.batch2321.v2324washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2324: wasted mode
internal fun PlayerActivity.showV2324WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324wasted
    FeaturePrefsStore.batch2321.v2324wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2324: watched mode
internal fun PlayerActivity.showV2324WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324watched
    FeaturePrefsStore.batch2321.v2324watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2324: weakened level
internal fun PlayerActivity.showV2324WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2324weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2324weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2324: weaponized level
internal fun PlayerActivity.showV2324WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2324weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2324weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2324: weighed level
internal fun PlayerActivity.showV2324WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2324weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2324weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2324: welcomed level
internal fun PlayerActivity.showV2324WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2324welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2324welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2324: widened level
internal fun PlayerActivity.showV2324WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2324widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2324widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2324: witnessed mode
internal fun PlayerActivity.showV2324WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324witnessed
    FeaturePrefsStore.batch2321.v2324witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2324: wondered mode
internal fun PlayerActivity.showV2324WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324wondered
    FeaturePrefsStore.batch2321.v2324wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2324: worked mode
internal fun PlayerActivity.showV2324WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324worked
    FeaturePrefsStore.batch2321.v2324worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2324: worsened mode
internal fun PlayerActivity.showV2324WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324worsened
    FeaturePrefsStore.batch2321.v2324worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2324: wrapped mode
internal fun PlayerActivity.showV2324WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2324wrapped
    FeaturePrefsStore.batch2321.v2324wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2325: warped mode
internal fun PlayerActivity.showV2325WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325warped
    FeaturePrefsStore.batch2321.v2325warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2325: warranted mode
internal fun PlayerActivity.showV2325WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325warranted
    FeaturePrefsStore.batch2321.v2325warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2325: washed mode
internal fun PlayerActivity.showV2325WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325washed
    FeaturePrefsStore.batch2321.v2325washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2325: wasted mode
internal fun PlayerActivity.showV2325WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325wasted
    FeaturePrefsStore.batch2321.v2325wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2325: watched mode
internal fun PlayerActivity.showV2325WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325watched
    FeaturePrefsStore.batch2321.v2325watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2325: weakened level
internal fun PlayerActivity.showV2325WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2325weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2325weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2325: weaponized level
internal fun PlayerActivity.showV2325WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2325weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2325weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2325: weighed level
internal fun PlayerActivity.showV2325WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2325weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2325weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2325: welcomed level
internal fun PlayerActivity.showV2325WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2325welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2325welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2325: widened level
internal fun PlayerActivity.showV2325WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2325widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2325widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2325: witnessed mode
internal fun PlayerActivity.showV2325WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325witnessed
    FeaturePrefsStore.batch2321.v2325witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2325: wondered mode
internal fun PlayerActivity.showV2325WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325wondered
    FeaturePrefsStore.batch2321.v2325wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2325: worked mode
internal fun PlayerActivity.showV2325WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325worked
    FeaturePrefsStore.batch2321.v2325worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2325: worsened mode
internal fun PlayerActivity.showV2325WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325worsened
    FeaturePrefsStore.batch2321.v2325worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2325: wrapped mode
internal fun PlayerActivity.showV2325WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2325wrapped
    FeaturePrefsStore.batch2321.v2325wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2326: warped mode
internal fun PlayerActivity.showV2326WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326warped
    FeaturePrefsStore.batch2321.v2326warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2326: warranted mode
internal fun PlayerActivity.showV2326WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326warranted
    FeaturePrefsStore.batch2321.v2326warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2326: washed mode
internal fun PlayerActivity.showV2326WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326washed
    FeaturePrefsStore.batch2321.v2326washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2326: wasted mode
internal fun PlayerActivity.showV2326WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326wasted
    FeaturePrefsStore.batch2321.v2326wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2326: watched mode
internal fun PlayerActivity.showV2326WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326watched
    FeaturePrefsStore.batch2321.v2326watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2326: weakened level
internal fun PlayerActivity.showV2326WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2326weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2326weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2326: weaponized level
internal fun PlayerActivity.showV2326WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2326weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2326weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2326: weighed level
internal fun PlayerActivity.showV2326WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2326weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2326weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2326: welcomed level
internal fun PlayerActivity.showV2326WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2326welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2326welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2326: widened level
internal fun PlayerActivity.showV2326WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2326widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2326widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2326: witnessed mode
internal fun PlayerActivity.showV2326WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326witnessed
    FeaturePrefsStore.batch2321.v2326witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2326: wondered mode
internal fun PlayerActivity.showV2326WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326wondered
    FeaturePrefsStore.batch2321.v2326wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2326: worked mode
internal fun PlayerActivity.showV2326WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326worked
    FeaturePrefsStore.batch2321.v2326worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2326: worsened mode
internal fun PlayerActivity.showV2326WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326worsened
    FeaturePrefsStore.batch2321.v2326worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2326: wrapped mode
internal fun PlayerActivity.showV2326WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2326wrapped
    FeaturePrefsStore.batch2321.v2326wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2327: warped mode
internal fun PlayerActivity.showV2327WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327warped
    FeaturePrefsStore.batch2321.v2327warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2327: warranted mode
internal fun PlayerActivity.showV2327WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327warranted
    FeaturePrefsStore.batch2321.v2327warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2327: washed mode
internal fun PlayerActivity.showV2327WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327washed
    FeaturePrefsStore.batch2321.v2327washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2327: wasted mode
internal fun PlayerActivity.showV2327WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327wasted
    FeaturePrefsStore.batch2321.v2327wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2327: watched mode
internal fun PlayerActivity.showV2327WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327watched
    FeaturePrefsStore.batch2321.v2327watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2327: weakened level
internal fun PlayerActivity.showV2327WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2327weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2327weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2327: weaponized level
internal fun PlayerActivity.showV2327WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2327weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2327weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2327: weighed level
internal fun PlayerActivity.showV2327WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2327weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2327weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2327: welcomed level
internal fun PlayerActivity.showV2327WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2327welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2327welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2327: widened level
internal fun PlayerActivity.showV2327WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2327widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2327widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2327: witnessed mode
internal fun PlayerActivity.showV2327WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327witnessed
    FeaturePrefsStore.batch2321.v2327witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2327: wondered mode
internal fun PlayerActivity.showV2327WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327wondered
    FeaturePrefsStore.batch2321.v2327wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2327: worked mode
internal fun PlayerActivity.showV2327WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327worked
    FeaturePrefsStore.batch2321.v2327worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2327: worsened mode
internal fun PlayerActivity.showV2327WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327worsened
    FeaturePrefsStore.batch2321.v2327worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2327: wrapped mode
internal fun PlayerActivity.showV2327WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2327wrapped
    FeaturePrefsStore.batch2321.v2327wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2328: warped mode
internal fun PlayerActivity.showV2328WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328warped
    FeaturePrefsStore.batch2321.v2328warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2328: warranted mode
internal fun PlayerActivity.showV2328WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328warranted
    FeaturePrefsStore.batch2321.v2328warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2328: washed mode
internal fun PlayerActivity.showV2328WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328washed
    FeaturePrefsStore.batch2321.v2328washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2328: wasted mode
internal fun PlayerActivity.showV2328WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328wasted
    FeaturePrefsStore.batch2321.v2328wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2328: watched mode
internal fun PlayerActivity.showV2328WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328watched
    FeaturePrefsStore.batch2321.v2328watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2328: weakened level
internal fun PlayerActivity.showV2328WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2328weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2328weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2328: weaponized level
internal fun PlayerActivity.showV2328WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2328weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2328weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2328: weighed level
internal fun PlayerActivity.showV2328WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2328weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2328weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2328: welcomed level
internal fun PlayerActivity.showV2328WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2328welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2328welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2328: widened level
internal fun PlayerActivity.showV2328WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2328widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2328widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2328: witnessed mode
internal fun PlayerActivity.showV2328WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328witnessed
    FeaturePrefsStore.batch2321.v2328witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2328: wondered mode
internal fun PlayerActivity.showV2328WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328wondered
    FeaturePrefsStore.batch2321.v2328wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2328: worked mode
internal fun PlayerActivity.showV2328WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328worked
    FeaturePrefsStore.batch2321.v2328worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2328: worsened mode
internal fun PlayerActivity.showV2328WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328worsened
    FeaturePrefsStore.batch2321.v2328worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2328: wrapped mode
internal fun PlayerActivity.showV2328WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2328wrapped
    FeaturePrefsStore.batch2321.v2328wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2329: warped mode
internal fun PlayerActivity.showV2329WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329warped
    FeaturePrefsStore.batch2321.v2329warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2329: warranted mode
internal fun PlayerActivity.showV2329WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329warranted
    FeaturePrefsStore.batch2321.v2329warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2329: washed mode
internal fun PlayerActivity.showV2329WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329washed
    FeaturePrefsStore.batch2321.v2329washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2329: wasted mode
internal fun PlayerActivity.showV2329WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329wasted
    FeaturePrefsStore.batch2321.v2329wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2329: watched mode
internal fun PlayerActivity.showV2329WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329watched
    FeaturePrefsStore.batch2321.v2329watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2329: weakened level
internal fun PlayerActivity.showV2329WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2329weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2329weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2329: weaponized level
internal fun PlayerActivity.showV2329WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2329weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2329weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2329: weighed level
internal fun PlayerActivity.showV2329WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2329weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2329weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2329: welcomed level
internal fun PlayerActivity.showV2329WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2329welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2329welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2329: widened level
internal fun PlayerActivity.showV2329WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2329widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2329widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2329: witnessed mode
internal fun PlayerActivity.showV2329WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329witnessed
    FeaturePrefsStore.batch2321.v2329witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2329: wondered mode
internal fun PlayerActivity.showV2329WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329wondered
    FeaturePrefsStore.batch2321.v2329wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2329: worked mode
internal fun PlayerActivity.showV2329WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329worked
    FeaturePrefsStore.batch2321.v2329worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2329: worsened mode
internal fun PlayerActivity.showV2329WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329worsened
    FeaturePrefsStore.batch2321.v2329worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2329: wrapped mode
internal fun PlayerActivity.showV2329WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2329wrapped
    FeaturePrefsStore.batch2321.v2329wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

// v2330: warped mode
internal fun PlayerActivity.showV2330WarpedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330warped
    FeaturePrefsStore.batch2321.v2330warped = !current
    AppToast.show(this, "warped: ${if (!current) "ON" else "OFF"}")
}

// v2330: warranted mode
internal fun PlayerActivity.showV2330WarrantedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330warranted
    FeaturePrefsStore.batch2321.v2330warranted = !current
    AppToast.show(this, "warranted: ${if (!current) "ON" else "OFF"}")
}

// v2330: washed mode
internal fun PlayerActivity.showV2330WashedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330washed
    FeaturePrefsStore.batch2321.v2330washed = !current
    AppToast.show(this, "washed: ${if (!current) "ON" else "OFF"}")
}

// v2330: wasted mode
internal fun PlayerActivity.showV2330WastedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330wasted
    FeaturePrefsStore.batch2321.v2330wasted = !current
    AppToast.show(this, "wasted: ${if (!current) "ON" else "OFF"}")
}

// v2330: watched mode
internal fun PlayerActivity.showV2330WatchedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330watched
    FeaturePrefsStore.batch2321.v2330watched = !current
    AppToast.show(this, "watched: ${if (!current) "ON" else "OFF"}")
}

// v2330: weakened level
internal fun PlayerActivity.showV2330WeakenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2330weakened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weakened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2330weakened = value
        AppToast.show(this, "weakened: $value")
    }
}

// v2330: weaponized level
internal fun PlayerActivity.showV2330WeaponizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2330weaponized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weaponized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2330weaponized = value
        AppToast.show(this, "weaponized: $value")
    }
}

// v2330: weighed level
internal fun PlayerActivity.showV2330WeighedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2330weighed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weighed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2330weighed = value
        AppToast.show(this, "weighed: $value")
    }
}

// v2330: welcomed level
internal fun PlayerActivity.showV2330WelcomedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2330welcomed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "welcomed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2330welcomed = value
        AppToast.show(this, "welcomed: $value")
    }
}

// v2330: widened level
internal fun PlayerActivity.showV2330WidenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2321.v2330widened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2321.v2330widened = value
        AppToast.show(this, "widened: $value")
    }
}

// v2330: witnessed mode
internal fun PlayerActivity.showV2330WitnessedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330witnessed
    FeaturePrefsStore.batch2321.v2330witnessed = !current
    AppToast.show(this, "witnessed: ${if (!current) "ON" else "OFF"}")
}

// v2330: wondered mode
internal fun PlayerActivity.showV2330WonderedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330wondered
    FeaturePrefsStore.batch2321.v2330wondered = !current
    AppToast.show(this, "wondered: ${if (!current) "ON" else "OFF"}")
}

// v2330: worked mode
internal fun PlayerActivity.showV2330WorkedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330worked
    FeaturePrefsStore.batch2321.v2330worked = !current
    AppToast.show(this, "worked: ${if (!current) "ON" else "OFF"}")
}

// v2330: worsened mode
internal fun PlayerActivity.showV2330WorsenedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330worsened
    FeaturePrefsStore.batch2321.v2330worsened = !current
    AppToast.show(this, "worsened: ${if (!current) "ON" else "OFF"}")
}

// v2330: wrapped mode
internal fun PlayerActivity.showV2330WrappedToggle() {
    val current = FeaturePrefsStore.batch2321.v2330wrapped
    FeaturePrefsStore.batch2321.v2330wrapped = !current
    AppToast.show(this, "wrapped: ${if (!current) "ON" else "OFF"}")
}

