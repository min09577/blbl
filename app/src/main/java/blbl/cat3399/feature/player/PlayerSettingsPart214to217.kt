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

// v2331: yielded mode
internal fun PlayerActivity.showV2331YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331yielded
    FeaturePrefsStore.batch2331.v2331yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2331: zeroed mode
internal fun PlayerActivity.showV2331ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331zeroed
    FeaturePrefsStore.batch2331.v2331zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2331: zoomed mode
internal fun PlayerActivity.showV2331ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331zoomed
    FeaturePrefsStore.batch2331.v2331zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2331: abundant mode
internal fun PlayerActivity.showV2331AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2331abundant
    FeaturePrefsStore.batch2331.v2331abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2331: accurate mode
internal fun PlayerActivity.showV2331AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2331accurate
    FeaturePrefsStore.batch2331.v2331accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2331: adequate level
internal fun PlayerActivity.showV2331AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2331: adventurous level
internal fun PlayerActivity.showV2331AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2331: affectionate level
internal fun PlayerActivity.showV2331AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2331: aggressive level
internal fun PlayerActivity.showV2331AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2331: ambitious level
internal fun PlayerActivity.showV2331AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2331: amusing mode
internal fun PlayerActivity.showV2331AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2331amusing
    FeaturePrefsStore.batch2331.v2331amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2331: ancient mode
internal fun PlayerActivity.showV2331AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2331ancient
    FeaturePrefsStore.batch2331.v2331ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2331: animated mode
internal fun PlayerActivity.showV2331AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331animated
    FeaturePrefsStore.batch2331.v2331animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2331: anxious mode
internal fun PlayerActivity.showV2331AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2331anxious
    FeaturePrefsStore.batch2331.v2331anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2331: apparent mode
internal fun PlayerActivity.showV2331ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2331apparent
    FeaturePrefsStore.batch2331.v2331apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2332: yielded mode
internal fun PlayerActivity.showV2332YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332yielded
    FeaturePrefsStore.batch2331.v2332yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2332: zeroed mode
internal fun PlayerActivity.showV2332ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332zeroed
    FeaturePrefsStore.batch2331.v2332zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2332: zoomed mode
internal fun PlayerActivity.showV2332ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332zoomed
    FeaturePrefsStore.batch2331.v2332zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2332: abundant mode
internal fun PlayerActivity.showV2332AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2332abundant
    FeaturePrefsStore.batch2331.v2332abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2332: accurate mode
internal fun PlayerActivity.showV2332AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2332accurate
    FeaturePrefsStore.batch2331.v2332accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2332: adequate level
internal fun PlayerActivity.showV2332AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2332: adventurous level
internal fun PlayerActivity.showV2332AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2332: affectionate level
internal fun PlayerActivity.showV2332AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2332: aggressive level
internal fun PlayerActivity.showV2332AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2332: ambitious level
internal fun PlayerActivity.showV2332AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2332: amusing mode
internal fun PlayerActivity.showV2332AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2332amusing
    FeaturePrefsStore.batch2331.v2332amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2332: ancient mode
internal fun PlayerActivity.showV2332AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2332ancient
    FeaturePrefsStore.batch2331.v2332ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2332: animated mode
internal fun PlayerActivity.showV2332AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332animated
    FeaturePrefsStore.batch2331.v2332animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2332: anxious mode
internal fun PlayerActivity.showV2332AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2332anxious
    FeaturePrefsStore.batch2331.v2332anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2332: apparent mode
internal fun PlayerActivity.showV2332ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2332apparent
    FeaturePrefsStore.batch2331.v2332apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2333: yielded mode
internal fun PlayerActivity.showV2333YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333yielded
    FeaturePrefsStore.batch2331.v2333yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2333: zeroed mode
internal fun PlayerActivity.showV2333ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333zeroed
    FeaturePrefsStore.batch2331.v2333zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2333: zoomed mode
internal fun PlayerActivity.showV2333ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333zoomed
    FeaturePrefsStore.batch2331.v2333zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2333: abundant mode
internal fun PlayerActivity.showV2333AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2333abundant
    FeaturePrefsStore.batch2331.v2333abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2333: accurate mode
internal fun PlayerActivity.showV2333AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2333accurate
    FeaturePrefsStore.batch2331.v2333accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2333: adequate level
internal fun PlayerActivity.showV2333AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2333: adventurous level
internal fun PlayerActivity.showV2333AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2333: affectionate level
internal fun PlayerActivity.showV2333AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2333: aggressive level
internal fun PlayerActivity.showV2333AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2333: ambitious level
internal fun PlayerActivity.showV2333AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2333: amusing mode
internal fun PlayerActivity.showV2333AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2333amusing
    FeaturePrefsStore.batch2331.v2333amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2333: ancient mode
internal fun PlayerActivity.showV2333AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2333ancient
    FeaturePrefsStore.batch2331.v2333ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2333: animated mode
internal fun PlayerActivity.showV2333AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333animated
    FeaturePrefsStore.batch2331.v2333animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2333: anxious mode
internal fun PlayerActivity.showV2333AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2333anxious
    FeaturePrefsStore.batch2331.v2333anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2333: apparent mode
internal fun PlayerActivity.showV2333ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2333apparent
    FeaturePrefsStore.batch2331.v2333apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2334: yielded mode
internal fun PlayerActivity.showV2334YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334yielded
    FeaturePrefsStore.batch2331.v2334yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2334: zeroed mode
internal fun PlayerActivity.showV2334ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334zeroed
    FeaturePrefsStore.batch2331.v2334zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2334: zoomed mode
internal fun PlayerActivity.showV2334ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334zoomed
    FeaturePrefsStore.batch2331.v2334zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2334: abundant mode
internal fun PlayerActivity.showV2334AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2334abundant
    FeaturePrefsStore.batch2331.v2334abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2334: accurate mode
internal fun PlayerActivity.showV2334AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2334accurate
    FeaturePrefsStore.batch2331.v2334accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2334: adequate level
internal fun PlayerActivity.showV2334AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2334: adventurous level
internal fun PlayerActivity.showV2334AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2334: affectionate level
internal fun PlayerActivity.showV2334AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2334: aggressive level
internal fun PlayerActivity.showV2334AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2334: ambitious level
internal fun PlayerActivity.showV2334AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2334: amusing mode
internal fun PlayerActivity.showV2334AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2334amusing
    FeaturePrefsStore.batch2331.v2334amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2334: ancient mode
internal fun PlayerActivity.showV2334AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2334ancient
    FeaturePrefsStore.batch2331.v2334ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2334: animated mode
internal fun PlayerActivity.showV2334AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334animated
    FeaturePrefsStore.batch2331.v2334animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2334: anxious mode
internal fun PlayerActivity.showV2334AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2334anxious
    FeaturePrefsStore.batch2331.v2334anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2334: apparent mode
internal fun PlayerActivity.showV2334ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2334apparent
    FeaturePrefsStore.batch2331.v2334apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2335: yielded mode
internal fun PlayerActivity.showV2335YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335yielded
    FeaturePrefsStore.batch2331.v2335yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2335: zeroed mode
internal fun PlayerActivity.showV2335ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335zeroed
    FeaturePrefsStore.batch2331.v2335zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2335: zoomed mode
internal fun PlayerActivity.showV2335ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335zoomed
    FeaturePrefsStore.batch2331.v2335zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2335: abundant mode
internal fun PlayerActivity.showV2335AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2335abundant
    FeaturePrefsStore.batch2331.v2335abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2335: accurate mode
internal fun PlayerActivity.showV2335AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2335accurate
    FeaturePrefsStore.batch2331.v2335accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2335: adequate level
internal fun PlayerActivity.showV2335AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2335: adventurous level
internal fun PlayerActivity.showV2335AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2335: affectionate level
internal fun PlayerActivity.showV2335AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2335: aggressive level
internal fun PlayerActivity.showV2335AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2335: ambitious level
internal fun PlayerActivity.showV2335AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2335: amusing mode
internal fun PlayerActivity.showV2335AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2335amusing
    FeaturePrefsStore.batch2331.v2335amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2335: ancient mode
internal fun PlayerActivity.showV2335AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2335ancient
    FeaturePrefsStore.batch2331.v2335ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2335: animated mode
internal fun PlayerActivity.showV2335AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335animated
    FeaturePrefsStore.batch2331.v2335animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2335: anxious mode
internal fun PlayerActivity.showV2335AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2335anxious
    FeaturePrefsStore.batch2331.v2335anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2335: apparent mode
internal fun PlayerActivity.showV2335ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2335apparent
    FeaturePrefsStore.batch2331.v2335apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2336: yielded mode
internal fun PlayerActivity.showV2336YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336yielded
    FeaturePrefsStore.batch2331.v2336yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2336: zeroed mode
internal fun PlayerActivity.showV2336ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336zeroed
    FeaturePrefsStore.batch2331.v2336zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2336: zoomed mode
internal fun PlayerActivity.showV2336ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336zoomed
    FeaturePrefsStore.batch2331.v2336zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2336: abundant mode
internal fun PlayerActivity.showV2336AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2336abundant
    FeaturePrefsStore.batch2331.v2336abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2336: accurate mode
internal fun PlayerActivity.showV2336AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2336accurate
    FeaturePrefsStore.batch2331.v2336accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2336: adequate level
internal fun PlayerActivity.showV2336AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2336: adventurous level
internal fun PlayerActivity.showV2336AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2336: affectionate level
internal fun PlayerActivity.showV2336AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2336: aggressive level
internal fun PlayerActivity.showV2336AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2336: ambitious level
internal fun PlayerActivity.showV2336AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2336: amusing mode
internal fun PlayerActivity.showV2336AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2336amusing
    FeaturePrefsStore.batch2331.v2336amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2336: ancient mode
internal fun PlayerActivity.showV2336AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2336ancient
    FeaturePrefsStore.batch2331.v2336ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2336: animated mode
internal fun PlayerActivity.showV2336AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336animated
    FeaturePrefsStore.batch2331.v2336animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2336: anxious mode
internal fun PlayerActivity.showV2336AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2336anxious
    FeaturePrefsStore.batch2331.v2336anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2336: apparent mode
internal fun PlayerActivity.showV2336ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2336apparent
    FeaturePrefsStore.batch2331.v2336apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2337: yielded mode
internal fun PlayerActivity.showV2337YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337yielded
    FeaturePrefsStore.batch2331.v2337yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2337: zeroed mode
internal fun PlayerActivity.showV2337ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337zeroed
    FeaturePrefsStore.batch2331.v2337zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2337: zoomed mode
internal fun PlayerActivity.showV2337ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337zoomed
    FeaturePrefsStore.batch2331.v2337zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2337: abundant mode
internal fun PlayerActivity.showV2337AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2337abundant
    FeaturePrefsStore.batch2331.v2337abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2337: accurate mode
internal fun PlayerActivity.showV2337AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2337accurate
    FeaturePrefsStore.batch2331.v2337accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2337: adequate level
internal fun PlayerActivity.showV2337AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2337: adventurous level
internal fun PlayerActivity.showV2337AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2337: affectionate level
internal fun PlayerActivity.showV2337AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2337: aggressive level
internal fun PlayerActivity.showV2337AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2337: ambitious level
internal fun PlayerActivity.showV2337AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2337: amusing mode
internal fun PlayerActivity.showV2337AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2337amusing
    FeaturePrefsStore.batch2331.v2337amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2337: ancient mode
internal fun PlayerActivity.showV2337AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2337ancient
    FeaturePrefsStore.batch2331.v2337ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2337: animated mode
internal fun PlayerActivity.showV2337AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337animated
    FeaturePrefsStore.batch2331.v2337animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2337: anxious mode
internal fun PlayerActivity.showV2337AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2337anxious
    FeaturePrefsStore.batch2331.v2337anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2337: apparent mode
internal fun PlayerActivity.showV2337ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2337apparent
    FeaturePrefsStore.batch2331.v2337apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2338: yielded mode
internal fun PlayerActivity.showV2338YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338yielded
    FeaturePrefsStore.batch2331.v2338yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2338: zeroed mode
internal fun PlayerActivity.showV2338ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338zeroed
    FeaturePrefsStore.batch2331.v2338zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2338: zoomed mode
internal fun PlayerActivity.showV2338ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338zoomed
    FeaturePrefsStore.batch2331.v2338zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2338: abundant mode
internal fun PlayerActivity.showV2338AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2338abundant
    FeaturePrefsStore.batch2331.v2338abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2338: accurate mode
internal fun PlayerActivity.showV2338AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2338accurate
    FeaturePrefsStore.batch2331.v2338accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2338: adequate level
internal fun PlayerActivity.showV2338AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2338: adventurous level
internal fun PlayerActivity.showV2338AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2338: affectionate level
internal fun PlayerActivity.showV2338AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2338: aggressive level
internal fun PlayerActivity.showV2338AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2338: ambitious level
internal fun PlayerActivity.showV2338AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2338: amusing mode
internal fun PlayerActivity.showV2338AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2338amusing
    FeaturePrefsStore.batch2331.v2338amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2338: ancient mode
internal fun PlayerActivity.showV2338AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2338ancient
    FeaturePrefsStore.batch2331.v2338ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2338: animated mode
internal fun PlayerActivity.showV2338AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338animated
    FeaturePrefsStore.batch2331.v2338animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2338: anxious mode
internal fun PlayerActivity.showV2338AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2338anxious
    FeaturePrefsStore.batch2331.v2338anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2338: apparent mode
internal fun PlayerActivity.showV2338ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2338apparent
    FeaturePrefsStore.batch2331.v2338apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2339: yielded mode
internal fun PlayerActivity.showV2339YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339yielded
    FeaturePrefsStore.batch2331.v2339yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2339: zeroed mode
internal fun PlayerActivity.showV2339ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339zeroed
    FeaturePrefsStore.batch2331.v2339zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2339: zoomed mode
internal fun PlayerActivity.showV2339ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339zoomed
    FeaturePrefsStore.batch2331.v2339zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2339: abundant mode
internal fun PlayerActivity.showV2339AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2339abundant
    FeaturePrefsStore.batch2331.v2339abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2339: accurate mode
internal fun PlayerActivity.showV2339AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2339accurate
    FeaturePrefsStore.batch2331.v2339accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2339: adequate level
internal fun PlayerActivity.showV2339AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2339: adventurous level
internal fun PlayerActivity.showV2339AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2339: affectionate level
internal fun PlayerActivity.showV2339AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2339: aggressive level
internal fun PlayerActivity.showV2339AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2339: ambitious level
internal fun PlayerActivity.showV2339AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2339: amusing mode
internal fun PlayerActivity.showV2339AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2339amusing
    FeaturePrefsStore.batch2331.v2339amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2339: ancient mode
internal fun PlayerActivity.showV2339AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2339ancient
    FeaturePrefsStore.batch2331.v2339ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2339: animated mode
internal fun PlayerActivity.showV2339AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339animated
    FeaturePrefsStore.batch2331.v2339animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2339: anxious mode
internal fun PlayerActivity.showV2339AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2339anxious
    FeaturePrefsStore.batch2331.v2339anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2339: apparent mode
internal fun PlayerActivity.showV2339ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2339apparent
    FeaturePrefsStore.batch2331.v2339apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2340: yielded mode
internal fun PlayerActivity.showV2340YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340yielded
    FeaturePrefsStore.batch2331.v2340yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2340: zeroed mode
internal fun PlayerActivity.showV2340ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340zeroed
    FeaturePrefsStore.batch2331.v2340zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2340: zoomed mode
internal fun PlayerActivity.showV2340ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340zoomed
    FeaturePrefsStore.batch2331.v2340zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2340: abundant mode
internal fun PlayerActivity.showV2340AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2340abundant
    FeaturePrefsStore.batch2331.v2340abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2340: accurate mode
internal fun PlayerActivity.showV2340AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2340accurate
    FeaturePrefsStore.batch2331.v2340accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2340: adequate level
internal fun PlayerActivity.showV2340AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2340: adventurous level
internal fun PlayerActivity.showV2340AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2340: affectionate level
internal fun PlayerActivity.showV2340AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2340: aggressive level
internal fun PlayerActivity.showV2340AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2340: ambitious level
internal fun PlayerActivity.showV2340AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2340: amusing mode
internal fun PlayerActivity.showV2340AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2340amusing
    FeaturePrefsStore.batch2331.v2340amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2340: ancient mode
internal fun PlayerActivity.showV2340AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2340ancient
    FeaturePrefsStore.batch2331.v2340ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2340: animated mode
internal fun PlayerActivity.showV2340AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340animated
    FeaturePrefsStore.batch2331.v2340animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2340: anxious mode
internal fun PlayerActivity.showV2340AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2340anxious
    FeaturePrefsStore.batch2331.v2340anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2340: apparent mode
internal fun PlayerActivity.showV2340ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2340apparent
    FeaturePrefsStore.batch2331.v2340apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2341: appreciative mode
internal fun PlayerActivity.showV2341AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2341appreciative
    FeaturePrefsStore.batch2341.v2341appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2341: appropriate mode
internal fun PlayerActivity.showV2341AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2341appropriate
    FeaturePrefsStore.batch2341.v2341appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2341: arbitrary mode
internal fun PlayerActivity.showV2341ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2341arbitrary
    FeaturePrefsStore.batch2341.v2341arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2341: artistic mode
internal fun PlayerActivity.showV2341ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2341artistic
    FeaturePrefsStore.batch2341.v2341artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2341: assertive mode
internal fun PlayerActivity.showV2341AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2341assertive
    FeaturePrefsStore.batch2341.v2341assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2341: astute level
internal fun PlayerActivity.showV2341AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2341astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2341astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2341: attractive level
internal fun PlayerActivity.showV2341AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2341attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2341attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2341: authentic level
internal fun PlayerActivity.showV2341AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2341authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2341authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2341: available level
internal fun PlayerActivity.showV2341AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2341available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2341available = value
        AppToast.show(this, "available: $value")
    }
}

// v2341: avid level
internal fun PlayerActivity.showV2341AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2341avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2341avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2341: awesome mode
internal fun PlayerActivity.showV2341AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2341awesome
    FeaturePrefsStore.batch2341.v2341awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2341: beneficial mode
internal fun PlayerActivity.showV2341BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2341beneficial
    FeaturePrefsStore.batch2341.v2341beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2341: bizarre mode
internal fun PlayerActivity.showV2341BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2341bizarre
    FeaturePrefsStore.batch2341.v2341bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2341: blissful mode
internal fun PlayerActivity.showV2341BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2341blissful
    FeaturePrefsStore.batch2341.v2341blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2341: bountiful mode
internal fun PlayerActivity.showV2341BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2341bountiful
    FeaturePrefsStore.batch2341.v2341bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2342: appreciative mode
internal fun PlayerActivity.showV2342AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2342appreciative
    FeaturePrefsStore.batch2341.v2342appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2342: appropriate mode
internal fun PlayerActivity.showV2342AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2342appropriate
    FeaturePrefsStore.batch2341.v2342appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2342: arbitrary mode
internal fun PlayerActivity.showV2342ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2342arbitrary
    FeaturePrefsStore.batch2341.v2342arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2342: artistic mode
internal fun PlayerActivity.showV2342ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2342artistic
    FeaturePrefsStore.batch2341.v2342artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2342: assertive mode
internal fun PlayerActivity.showV2342AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2342assertive
    FeaturePrefsStore.batch2341.v2342assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2342: astute level
internal fun PlayerActivity.showV2342AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2342astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2342astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2342: attractive level
internal fun PlayerActivity.showV2342AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2342attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2342attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2342: authentic level
internal fun PlayerActivity.showV2342AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2342authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2342authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2342: available level
internal fun PlayerActivity.showV2342AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2342available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2342available = value
        AppToast.show(this, "available: $value")
    }
}

// v2342: avid level
internal fun PlayerActivity.showV2342AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2342avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2342avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2342: awesome mode
internal fun PlayerActivity.showV2342AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2342awesome
    FeaturePrefsStore.batch2341.v2342awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2342: beneficial mode
internal fun PlayerActivity.showV2342BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2342beneficial
    FeaturePrefsStore.batch2341.v2342beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2342: bizarre mode
internal fun PlayerActivity.showV2342BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2342bizarre
    FeaturePrefsStore.batch2341.v2342bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2342: blissful mode
internal fun PlayerActivity.showV2342BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2342blissful
    FeaturePrefsStore.batch2341.v2342blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2342: bountiful mode
internal fun PlayerActivity.showV2342BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2342bountiful
    FeaturePrefsStore.batch2341.v2342bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2343: appreciative mode
internal fun PlayerActivity.showV2343AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2343appreciative
    FeaturePrefsStore.batch2341.v2343appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2343: appropriate mode
internal fun PlayerActivity.showV2343AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2343appropriate
    FeaturePrefsStore.batch2341.v2343appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2343: arbitrary mode
internal fun PlayerActivity.showV2343ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2343arbitrary
    FeaturePrefsStore.batch2341.v2343arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2343: artistic mode
internal fun PlayerActivity.showV2343ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2343artistic
    FeaturePrefsStore.batch2341.v2343artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2343: assertive mode
internal fun PlayerActivity.showV2343AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2343assertive
    FeaturePrefsStore.batch2341.v2343assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2343: astute level
internal fun PlayerActivity.showV2343AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2343astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2343astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2343: attractive level
internal fun PlayerActivity.showV2343AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2343attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2343attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2343: authentic level
internal fun PlayerActivity.showV2343AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2343authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2343authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2343: available level
internal fun PlayerActivity.showV2343AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2343available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2343available = value
        AppToast.show(this, "available: $value")
    }
}

// v2343: avid level
internal fun PlayerActivity.showV2343AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2343avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2343avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2343: awesome mode
internal fun PlayerActivity.showV2343AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2343awesome
    FeaturePrefsStore.batch2341.v2343awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2343: beneficial mode
internal fun PlayerActivity.showV2343BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2343beneficial
    FeaturePrefsStore.batch2341.v2343beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2343: bizarre mode
internal fun PlayerActivity.showV2343BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2343bizarre
    FeaturePrefsStore.batch2341.v2343bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2343: blissful mode
internal fun PlayerActivity.showV2343BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2343blissful
    FeaturePrefsStore.batch2341.v2343blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2343: bountiful mode
internal fun PlayerActivity.showV2343BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2343bountiful
    FeaturePrefsStore.batch2341.v2343bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2344: appreciative mode
internal fun PlayerActivity.showV2344AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2344appreciative
    FeaturePrefsStore.batch2341.v2344appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2344: appropriate mode
internal fun PlayerActivity.showV2344AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2344appropriate
    FeaturePrefsStore.batch2341.v2344appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2344: arbitrary mode
internal fun PlayerActivity.showV2344ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2344arbitrary
    FeaturePrefsStore.batch2341.v2344arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2344: artistic mode
internal fun PlayerActivity.showV2344ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2344artistic
    FeaturePrefsStore.batch2341.v2344artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2344: assertive mode
internal fun PlayerActivity.showV2344AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2344assertive
    FeaturePrefsStore.batch2341.v2344assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2344: astute level
internal fun PlayerActivity.showV2344AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2344astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2344astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2344: attractive level
internal fun PlayerActivity.showV2344AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2344attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2344attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2344: authentic level
internal fun PlayerActivity.showV2344AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2344authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2344authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2344: available level
internal fun PlayerActivity.showV2344AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2344available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2344available = value
        AppToast.show(this, "available: $value")
    }
}

// v2344: avid level
internal fun PlayerActivity.showV2344AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2344avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2344avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2344: awesome mode
internal fun PlayerActivity.showV2344AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2344awesome
    FeaturePrefsStore.batch2341.v2344awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2344: beneficial mode
internal fun PlayerActivity.showV2344BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2344beneficial
    FeaturePrefsStore.batch2341.v2344beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2344: bizarre mode
internal fun PlayerActivity.showV2344BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2344bizarre
    FeaturePrefsStore.batch2341.v2344bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2344: blissful mode
internal fun PlayerActivity.showV2344BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2344blissful
    FeaturePrefsStore.batch2341.v2344blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2344: bountiful mode
internal fun PlayerActivity.showV2344BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2344bountiful
    FeaturePrefsStore.batch2341.v2344bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2345: appreciative mode
internal fun PlayerActivity.showV2345AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2345appreciative
    FeaturePrefsStore.batch2341.v2345appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2345: appropriate mode
internal fun PlayerActivity.showV2345AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2345appropriate
    FeaturePrefsStore.batch2341.v2345appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2345: arbitrary mode
internal fun PlayerActivity.showV2345ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2345arbitrary
    FeaturePrefsStore.batch2341.v2345arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2345: artistic mode
internal fun PlayerActivity.showV2345ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2345artistic
    FeaturePrefsStore.batch2341.v2345artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2345: assertive mode
internal fun PlayerActivity.showV2345AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2345assertive
    FeaturePrefsStore.batch2341.v2345assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2345: astute level
internal fun PlayerActivity.showV2345AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2345astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2345astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2345: attractive level
internal fun PlayerActivity.showV2345AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2345attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2345attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2345: authentic level
internal fun PlayerActivity.showV2345AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2345authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2345authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2345: available level
internal fun PlayerActivity.showV2345AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2345available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2345available = value
        AppToast.show(this, "available: $value")
    }
}

// v2345: avid level
internal fun PlayerActivity.showV2345AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2345avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2345avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2345: awesome mode
internal fun PlayerActivity.showV2345AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2345awesome
    FeaturePrefsStore.batch2341.v2345awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2345: beneficial mode
internal fun PlayerActivity.showV2345BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2345beneficial
    FeaturePrefsStore.batch2341.v2345beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2345: bizarre mode
internal fun PlayerActivity.showV2345BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2345bizarre
    FeaturePrefsStore.batch2341.v2345bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2345: blissful mode
internal fun PlayerActivity.showV2345BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2345blissful
    FeaturePrefsStore.batch2341.v2345blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2345: bountiful mode
internal fun PlayerActivity.showV2345BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2345bountiful
    FeaturePrefsStore.batch2341.v2345bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2346: appreciative mode
internal fun PlayerActivity.showV2346AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2346appreciative
    FeaturePrefsStore.batch2341.v2346appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2346: appropriate mode
internal fun PlayerActivity.showV2346AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2346appropriate
    FeaturePrefsStore.batch2341.v2346appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2346: arbitrary mode
internal fun PlayerActivity.showV2346ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2346arbitrary
    FeaturePrefsStore.batch2341.v2346arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2346: artistic mode
internal fun PlayerActivity.showV2346ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2346artistic
    FeaturePrefsStore.batch2341.v2346artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2346: assertive mode
internal fun PlayerActivity.showV2346AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2346assertive
    FeaturePrefsStore.batch2341.v2346assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2346: astute level
internal fun PlayerActivity.showV2346AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2346astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2346astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2346: attractive level
internal fun PlayerActivity.showV2346AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2346attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2346attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2346: authentic level
internal fun PlayerActivity.showV2346AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2346authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2346authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2346: available level
internal fun PlayerActivity.showV2346AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2346available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2346available = value
        AppToast.show(this, "available: $value")
    }
}

// v2346: avid level
internal fun PlayerActivity.showV2346AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2346avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2346avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2346: awesome mode
internal fun PlayerActivity.showV2346AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2346awesome
    FeaturePrefsStore.batch2341.v2346awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2346: beneficial mode
internal fun PlayerActivity.showV2346BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2346beneficial
    FeaturePrefsStore.batch2341.v2346beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2346: bizarre mode
internal fun PlayerActivity.showV2346BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2346bizarre
    FeaturePrefsStore.batch2341.v2346bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2346: blissful mode
internal fun PlayerActivity.showV2346BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2346blissful
    FeaturePrefsStore.batch2341.v2346blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2346: bountiful mode
internal fun PlayerActivity.showV2346BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2346bountiful
    FeaturePrefsStore.batch2341.v2346bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2347: appreciative mode
internal fun PlayerActivity.showV2347AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2347appreciative
    FeaturePrefsStore.batch2341.v2347appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2347: appropriate mode
internal fun PlayerActivity.showV2347AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2347appropriate
    FeaturePrefsStore.batch2341.v2347appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2347: arbitrary mode
internal fun PlayerActivity.showV2347ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2347arbitrary
    FeaturePrefsStore.batch2341.v2347arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2347: artistic mode
internal fun PlayerActivity.showV2347ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2347artistic
    FeaturePrefsStore.batch2341.v2347artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2347: assertive mode
internal fun PlayerActivity.showV2347AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2347assertive
    FeaturePrefsStore.batch2341.v2347assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2347: astute level
internal fun PlayerActivity.showV2347AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2347astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2347astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2347: attractive level
internal fun PlayerActivity.showV2347AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2347attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2347attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2347: authentic level
internal fun PlayerActivity.showV2347AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2347authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2347authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2347: available level
internal fun PlayerActivity.showV2347AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2347available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2347available = value
        AppToast.show(this, "available: $value")
    }
}

// v2347: avid level
internal fun PlayerActivity.showV2347AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2347avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2347avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2347: awesome mode
internal fun PlayerActivity.showV2347AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2347awesome
    FeaturePrefsStore.batch2341.v2347awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2347: beneficial mode
internal fun PlayerActivity.showV2347BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2347beneficial
    FeaturePrefsStore.batch2341.v2347beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2347: bizarre mode
internal fun PlayerActivity.showV2347BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2347bizarre
    FeaturePrefsStore.batch2341.v2347bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2347: blissful mode
internal fun PlayerActivity.showV2347BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2347blissful
    FeaturePrefsStore.batch2341.v2347blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2347: bountiful mode
internal fun PlayerActivity.showV2347BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2347bountiful
    FeaturePrefsStore.batch2341.v2347bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2348: appreciative mode
internal fun PlayerActivity.showV2348AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2348appreciative
    FeaturePrefsStore.batch2341.v2348appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2348: appropriate mode
internal fun PlayerActivity.showV2348AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2348appropriate
    FeaturePrefsStore.batch2341.v2348appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2348: arbitrary mode
internal fun PlayerActivity.showV2348ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2348arbitrary
    FeaturePrefsStore.batch2341.v2348arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2348: artistic mode
internal fun PlayerActivity.showV2348ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2348artistic
    FeaturePrefsStore.batch2341.v2348artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2348: assertive mode
internal fun PlayerActivity.showV2348AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2348assertive
    FeaturePrefsStore.batch2341.v2348assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2348: astute level
internal fun PlayerActivity.showV2348AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2348astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2348astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2348: attractive level
internal fun PlayerActivity.showV2348AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2348attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2348attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2348: authentic level
internal fun PlayerActivity.showV2348AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2348authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2348authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2348: available level
internal fun PlayerActivity.showV2348AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2348available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2348available = value
        AppToast.show(this, "available: $value")
    }
}

// v2348: avid level
internal fun PlayerActivity.showV2348AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2348avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2348avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2348: awesome mode
internal fun PlayerActivity.showV2348AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2348awesome
    FeaturePrefsStore.batch2341.v2348awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2348: beneficial mode
internal fun PlayerActivity.showV2348BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2348beneficial
    FeaturePrefsStore.batch2341.v2348beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2348: bizarre mode
internal fun PlayerActivity.showV2348BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2348bizarre
    FeaturePrefsStore.batch2341.v2348bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2348: blissful mode
internal fun PlayerActivity.showV2348BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2348blissful
    FeaturePrefsStore.batch2341.v2348blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2348: bountiful mode
internal fun PlayerActivity.showV2348BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2348bountiful
    FeaturePrefsStore.batch2341.v2348bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2349: appreciative mode
internal fun PlayerActivity.showV2349AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2349appreciative
    FeaturePrefsStore.batch2341.v2349appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2349: appropriate mode
internal fun PlayerActivity.showV2349AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2349appropriate
    FeaturePrefsStore.batch2341.v2349appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2349: arbitrary mode
internal fun PlayerActivity.showV2349ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2349arbitrary
    FeaturePrefsStore.batch2341.v2349arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2349: artistic mode
internal fun PlayerActivity.showV2349ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2349artistic
    FeaturePrefsStore.batch2341.v2349artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2349: assertive mode
internal fun PlayerActivity.showV2349AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2349assertive
    FeaturePrefsStore.batch2341.v2349assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2349: astute level
internal fun PlayerActivity.showV2349AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2349astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2349astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2349: attractive level
internal fun PlayerActivity.showV2349AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2349attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2349attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2349: authentic level
internal fun PlayerActivity.showV2349AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2349authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2349authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2349: available level
internal fun PlayerActivity.showV2349AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2349available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2349available = value
        AppToast.show(this, "available: $value")
    }
}

// v2349: avid level
internal fun PlayerActivity.showV2349AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2349avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2349avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2349: awesome mode
internal fun PlayerActivity.showV2349AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2349awesome
    FeaturePrefsStore.batch2341.v2349awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2349: beneficial mode
internal fun PlayerActivity.showV2349BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2349beneficial
    FeaturePrefsStore.batch2341.v2349beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2349: bizarre mode
internal fun PlayerActivity.showV2349BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2349bizarre
    FeaturePrefsStore.batch2341.v2349bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2349: blissful mode
internal fun PlayerActivity.showV2349BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2349blissful
    FeaturePrefsStore.batch2341.v2349blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2349: bountiful mode
internal fun PlayerActivity.showV2349BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2349bountiful
    FeaturePrefsStore.batch2341.v2349bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2350: appreciative mode
internal fun PlayerActivity.showV2350AppreciativeToggle() {
    val current = FeaturePrefsStore.batch2341.v2350appreciative
    FeaturePrefsStore.batch2341.v2350appreciative = !current
    AppToast.show(this, "appreciative: ${if (!current) "ON" else "OFF"}")
}

// v2350: appropriate mode
internal fun PlayerActivity.showV2350AppropriateToggle() {
    val current = FeaturePrefsStore.batch2341.v2350appropriate
    FeaturePrefsStore.batch2341.v2350appropriate = !current
    AppToast.show(this, "appropriate: ${if (!current) "ON" else "OFF"}")
}

// v2350: arbitrary mode
internal fun PlayerActivity.showV2350ArbitraryToggle() {
    val current = FeaturePrefsStore.batch2341.v2350arbitrary
    FeaturePrefsStore.batch2341.v2350arbitrary = !current
    AppToast.show(this, "arbitrary: ${if (!current) "ON" else "OFF"}")
}

// v2350: artistic mode
internal fun PlayerActivity.showV2350ArtisticToggle() {
    val current = FeaturePrefsStore.batch2341.v2350artistic
    FeaturePrefsStore.batch2341.v2350artistic = !current
    AppToast.show(this, "artistic: ${if (!current) "ON" else "OFF"}")
}

// v2350: assertive mode
internal fun PlayerActivity.showV2350AssertiveToggle() {
    val current = FeaturePrefsStore.batch2341.v2350assertive
    FeaturePrefsStore.batch2341.v2350assertive = !current
    AppToast.show(this, "assertive: ${if (!current) "ON" else "OFF"}")
}

// v2350: astute level
internal fun PlayerActivity.showV2350AstuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2350astute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "astute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2350astute = value
        AppToast.show(this, "astute: $value")
    }
}

// v2350: attractive level
internal fun PlayerActivity.showV2350AttractiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2350attractive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attractive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2350attractive = value
        AppToast.show(this, "attractive: $value")
    }
}

// v2350: authentic level
internal fun PlayerActivity.showV2350AuthenticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2350authentic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "authentic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2350authentic = value
        AppToast.show(this, "authentic: $value")
    }
}

// v2350: available level
internal fun PlayerActivity.showV2350AvailableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2350available).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "available level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2350available = value
        AppToast.show(this, "available: $value")
    }
}

// v2350: avid level
internal fun PlayerActivity.showV2350AvidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2341.v2350avid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "avid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2341.v2350avid = value
        AppToast.show(this, "avid: $value")
    }
}

// v2350: awesome mode
internal fun PlayerActivity.showV2350AwesomeToggle() {
    val current = FeaturePrefsStore.batch2341.v2350awesome
    FeaturePrefsStore.batch2341.v2350awesome = !current
    AppToast.show(this, "awesome: ${if (!current) "ON" else "OFF"}")
}

// v2350: beneficial mode
internal fun PlayerActivity.showV2350BeneficialToggle() {
    val current = FeaturePrefsStore.batch2341.v2350beneficial
    FeaturePrefsStore.batch2341.v2350beneficial = !current
    AppToast.show(this, "beneficial: ${if (!current) "ON" else "OFF"}")
}

// v2350: bizarre mode
internal fun PlayerActivity.showV2350BizarreToggle() {
    val current = FeaturePrefsStore.batch2341.v2350bizarre
    FeaturePrefsStore.batch2341.v2350bizarre = !current
    AppToast.show(this, "bizarre: ${if (!current) "ON" else "OFF"}")
}

// v2350: blissful mode
internal fun PlayerActivity.showV2350BlissfulToggle() {
    val current = FeaturePrefsStore.batch2341.v2350blissful
    FeaturePrefsStore.batch2341.v2350blissful = !current
    AppToast.show(this, "blissful: ${if (!current) "ON" else "OFF"}")
}

// v2350: bountiful mode
internal fun PlayerActivity.showV2350BountifulToggle() {
    val current = FeaturePrefsStore.batch2341.v2350bountiful
    FeaturePrefsStore.batch2341.v2350bountiful = !current
    AppToast.show(this, "bountiful: ${if (!current) "ON" else "OFF"}")
}

// v2351: brilliant mode
internal fun PlayerActivity.showV2351BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2351brilliant
    FeaturePrefsStore.batch2351.v2351brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2351: brisk mode
internal fun PlayerActivity.showV2351BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2351brisk
    FeaturePrefsStore.batch2351.v2351brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2351: capable mode
internal fun PlayerActivity.showV2351CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2351capable
    FeaturePrefsStore.batch2351.v2351capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2351: careful mode
internal fun PlayerActivity.showV2351CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2351careful
    FeaturePrefsStore.batch2351.v2351careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2351: cautious mode
internal fun PlayerActivity.showV2351CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2351cautious
    FeaturePrefsStore.batch2351.v2351cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2351: charming level
internal fun PlayerActivity.showV2351CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2351: cheerful level
internal fun PlayerActivity.showV2351CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2351: chronic level
internal fun PlayerActivity.showV2351ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2351: civil level
internal fun PlayerActivity.showV2351CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2351: classic level
internal fun PlayerActivity.showV2351ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2351: clinical mode
internal fun PlayerActivity.showV2351ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2351clinical
    FeaturePrefsStore.batch2351.v2351clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2351: coherent mode
internal fun PlayerActivity.showV2351CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2351coherent
    FeaturePrefsStore.batch2351.v2351coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2351: colorful mode
internal fun PlayerActivity.showV2351ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2351colorful
    FeaturePrefsStore.batch2351.v2351colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2351: comfortable mode
internal fun PlayerActivity.showV2351ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2351comfortable
    FeaturePrefsStore.batch2351.v2351comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2351: compassionate mode
internal fun PlayerActivity.showV2351CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2351compassionate
    FeaturePrefsStore.batch2351.v2351compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2352: brilliant mode
internal fun PlayerActivity.showV2352BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2352brilliant
    FeaturePrefsStore.batch2351.v2352brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2352: brisk mode
internal fun PlayerActivity.showV2352BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2352brisk
    FeaturePrefsStore.batch2351.v2352brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2352: capable mode
internal fun PlayerActivity.showV2352CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2352capable
    FeaturePrefsStore.batch2351.v2352capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2352: careful mode
internal fun PlayerActivity.showV2352CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2352careful
    FeaturePrefsStore.batch2351.v2352careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2352: cautious mode
internal fun PlayerActivity.showV2352CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2352cautious
    FeaturePrefsStore.batch2351.v2352cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2352: charming level
internal fun PlayerActivity.showV2352CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2352: cheerful level
internal fun PlayerActivity.showV2352CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2352: chronic level
internal fun PlayerActivity.showV2352ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2352: civil level
internal fun PlayerActivity.showV2352CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2352: classic level
internal fun PlayerActivity.showV2352ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2352: clinical mode
internal fun PlayerActivity.showV2352ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2352clinical
    FeaturePrefsStore.batch2351.v2352clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2352: coherent mode
internal fun PlayerActivity.showV2352CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2352coherent
    FeaturePrefsStore.batch2351.v2352coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2352: colorful mode
internal fun PlayerActivity.showV2352ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2352colorful
    FeaturePrefsStore.batch2351.v2352colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2352: comfortable mode
internal fun PlayerActivity.showV2352ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2352comfortable
    FeaturePrefsStore.batch2351.v2352comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2352: compassionate mode
internal fun PlayerActivity.showV2352CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2352compassionate
    FeaturePrefsStore.batch2351.v2352compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2353: brilliant mode
internal fun PlayerActivity.showV2353BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2353brilliant
    FeaturePrefsStore.batch2351.v2353brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2353: brisk mode
internal fun PlayerActivity.showV2353BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2353brisk
    FeaturePrefsStore.batch2351.v2353brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2353: capable mode
internal fun PlayerActivity.showV2353CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2353capable
    FeaturePrefsStore.batch2351.v2353capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2353: careful mode
internal fun PlayerActivity.showV2353CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2353careful
    FeaturePrefsStore.batch2351.v2353careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2353: cautious mode
internal fun PlayerActivity.showV2353CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2353cautious
    FeaturePrefsStore.batch2351.v2353cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2353: charming level
internal fun PlayerActivity.showV2353CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2353: cheerful level
internal fun PlayerActivity.showV2353CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2353: chronic level
internal fun PlayerActivity.showV2353ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2353: civil level
internal fun PlayerActivity.showV2353CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2353: classic level
internal fun PlayerActivity.showV2353ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2353: clinical mode
internal fun PlayerActivity.showV2353ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2353clinical
    FeaturePrefsStore.batch2351.v2353clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2353: coherent mode
internal fun PlayerActivity.showV2353CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2353coherent
    FeaturePrefsStore.batch2351.v2353coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2353: colorful mode
internal fun PlayerActivity.showV2353ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2353colorful
    FeaturePrefsStore.batch2351.v2353colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2353: comfortable mode
internal fun PlayerActivity.showV2353ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2353comfortable
    FeaturePrefsStore.batch2351.v2353comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2353: compassionate mode
internal fun PlayerActivity.showV2353CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2353compassionate
    FeaturePrefsStore.batch2351.v2353compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2354: brilliant mode
internal fun PlayerActivity.showV2354BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2354brilliant
    FeaturePrefsStore.batch2351.v2354brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2354: brisk mode
internal fun PlayerActivity.showV2354BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2354brisk
    FeaturePrefsStore.batch2351.v2354brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2354: capable mode
internal fun PlayerActivity.showV2354CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2354capable
    FeaturePrefsStore.batch2351.v2354capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2354: careful mode
internal fun PlayerActivity.showV2354CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2354careful
    FeaturePrefsStore.batch2351.v2354careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2354: cautious mode
internal fun PlayerActivity.showV2354CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2354cautious
    FeaturePrefsStore.batch2351.v2354cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2354: charming level
internal fun PlayerActivity.showV2354CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2354: cheerful level
internal fun PlayerActivity.showV2354CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2354: chronic level
internal fun PlayerActivity.showV2354ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2354: civil level
internal fun PlayerActivity.showV2354CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2354: classic level
internal fun PlayerActivity.showV2354ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2354: clinical mode
internal fun PlayerActivity.showV2354ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2354clinical
    FeaturePrefsStore.batch2351.v2354clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2354: coherent mode
internal fun PlayerActivity.showV2354CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2354coherent
    FeaturePrefsStore.batch2351.v2354coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2354: colorful mode
internal fun PlayerActivity.showV2354ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2354colorful
    FeaturePrefsStore.batch2351.v2354colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2354: comfortable mode
internal fun PlayerActivity.showV2354ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2354comfortable
    FeaturePrefsStore.batch2351.v2354comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2354: compassionate mode
internal fun PlayerActivity.showV2354CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2354compassionate
    FeaturePrefsStore.batch2351.v2354compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2355: brilliant mode
internal fun PlayerActivity.showV2355BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2355brilliant
    FeaturePrefsStore.batch2351.v2355brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2355: brisk mode
internal fun PlayerActivity.showV2355BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2355brisk
    FeaturePrefsStore.batch2351.v2355brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2355: capable mode
internal fun PlayerActivity.showV2355CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2355capable
    FeaturePrefsStore.batch2351.v2355capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2355: careful mode
internal fun PlayerActivity.showV2355CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2355careful
    FeaturePrefsStore.batch2351.v2355careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2355: cautious mode
internal fun PlayerActivity.showV2355CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2355cautious
    FeaturePrefsStore.batch2351.v2355cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2355: charming level
internal fun PlayerActivity.showV2355CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2355: cheerful level
internal fun PlayerActivity.showV2355CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2355: chronic level
internal fun PlayerActivity.showV2355ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2355: civil level
internal fun PlayerActivity.showV2355CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2355: classic level
internal fun PlayerActivity.showV2355ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2355: clinical mode
internal fun PlayerActivity.showV2355ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2355clinical
    FeaturePrefsStore.batch2351.v2355clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2355: coherent mode
internal fun PlayerActivity.showV2355CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2355coherent
    FeaturePrefsStore.batch2351.v2355coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2355: colorful mode
internal fun PlayerActivity.showV2355ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2355colorful
    FeaturePrefsStore.batch2351.v2355colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2355: comfortable mode
internal fun PlayerActivity.showV2355ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2355comfortable
    FeaturePrefsStore.batch2351.v2355comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2355: compassionate mode
internal fun PlayerActivity.showV2355CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2355compassionate
    FeaturePrefsStore.batch2351.v2355compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2356: brilliant mode
internal fun PlayerActivity.showV2356BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2356brilliant
    FeaturePrefsStore.batch2351.v2356brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2356: brisk mode
internal fun PlayerActivity.showV2356BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2356brisk
    FeaturePrefsStore.batch2351.v2356brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2356: capable mode
internal fun PlayerActivity.showV2356CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2356capable
    FeaturePrefsStore.batch2351.v2356capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2356: careful mode
internal fun PlayerActivity.showV2356CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2356careful
    FeaturePrefsStore.batch2351.v2356careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2356: cautious mode
internal fun PlayerActivity.showV2356CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2356cautious
    FeaturePrefsStore.batch2351.v2356cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2356: charming level
internal fun PlayerActivity.showV2356CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2356: cheerful level
internal fun PlayerActivity.showV2356CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2356: chronic level
internal fun PlayerActivity.showV2356ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2356: civil level
internal fun PlayerActivity.showV2356CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2356: classic level
internal fun PlayerActivity.showV2356ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2356: clinical mode
internal fun PlayerActivity.showV2356ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2356clinical
    FeaturePrefsStore.batch2351.v2356clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2356: coherent mode
internal fun PlayerActivity.showV2356CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2356coherent
    FeaturePrefsStore.batch2351.v2356coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2356: colorful mode
internal fun PlayerActivity.showV2356ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2356colorful
    FeaturePrefsStore.batch2351.v2356colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2356: comfortable mode
internal fun PlayerActivity.showV2356ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2356comfortable
    FeaturePrefsStore.batch2351.v2356comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2356: compassionate mode
internal fun PlayerActivity.showV2356CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2356compassionate
    FeaturePrefsStore.batch2351.v2356compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2357: brilliant mode
internal fun PlayerActivity.showV2357BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2357brilliant
    FeaturePrefsStore.batch2351.v2357brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2357: brisk mode
internal fun PlayerActivity.showV2357BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2357brisk
    FeaturePrefsStore.batch2351.v2357brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2357: capable mode
internal fun PlayerActivity.showV2357CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2357capable
    FeaturePrefsStore.batch2351.v2357capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2357: careful mode
internal fun PlayerActivity.showV2357CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2357careful
    FeaturePrefsStore.batch2351.v2357careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2357: cautious mode
internal fun PlayerActivity.showV2357CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2357cautious
    FeaturePrefsStore.batch2351.v2357cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2357: charming level
internal fun PlayerActivity.showV2357CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2357: cheerful level
internal fun PlayerActivity.showV2357CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2357: chronic level
internal fun PlayerActivity.showV2357ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2357: civil level
internal fun PlayerActivity.showV2357CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2357: classic level
internal fun PlayerActivity.showV2357ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2357: clinical mode
internal fun PlayerActivity.showV2357ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2357clinical
    FeaturePrefsStore.batch2351.v2357clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2357: coherent mode
internal fun PlayerActivity.showV2357CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2357coherent
    FeaturePrefsStore.batch2351.v2357coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2357: colorful mode
internal fun PlayerActivity.showV2357ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2357colorful
    FeaturePrefsStore.batch2351.v2357colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2357: comfortable mode
internal fun PlayerActivity.showV2357ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2357comfortable
    FeaturePrefsStore.batch2351.v2357comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2357: compassionate mode
internal fun PlayerActivity.showV2357CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2357compassionate
    FeaturePrefsStore.batch2351.v2357compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2358: brilliant mode
internal fun PlayerActivity.showV2358BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2358brilliant
    FeaturePrefsStore.batch2351.v2358brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2358: brisk mode
internal fun PlayerActivity.showV2358BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2358brisk
    FeaturePrefsStore.batch2351.v2358brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2358: capable mode
internal fun PlayerActivity.showV2358CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2358capable
    FeaturePrefsStore.batch2351.v2358capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2358: careful mode
internal fun PlayerActivity.showV2358CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2358careful
    FeaturePrefsStore.batch2351.v2358careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2358: cautious mode
internal fun PlayerActivity.showV2358CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2358cautious
    FeaturePrefsStore.batch2351.v2358cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2358: charming level
internal fun PlayerActivity.showV2358CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2358: cheerful level
internal fun PlayerActivity.showV2358CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2358: chronic level
internal fun PlayerActivity.showV2358ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2358: civil level
internal fun PlayerActivity.showV2358CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2358: classic level
internal fun PlayerActivity.showV2358ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2358: clinical mode
internal fun PlayerActivity.showV2358ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2358clinical
    FeaturePrefsStore.batch2351.v2358clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2358: coherent mode
internal fun PlayerActivity.showV2358CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2358coherent
    FeaturePrefsStore.batch2351.v2358coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2358: colorful mode
internal fun PlayerActivity.showV2358ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2358colorful
    FeaturePrefsStore.batch2351.v2358colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2358: comfortable mode
internal fun PlayerActivity.showV2358ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2358comfortable
    FeaturePrefsStore.batch2351.v2358comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2358: compassionate mode
internal fun PlayerActivity.showV2358CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2358compassionate
    FeaturePrefsStore.batch2351.v2358compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2359: brilliant mode
internal fun PlayerActivity.showV2359BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2359brilliant
    FeaturePrefsStore.batch2351.v2359brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2359: brisk mode
internal fun PlayerActivity.showV2359BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2359brisk
    FeaturePrefsStore.batch2351.v2359brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2359: capable mode
internal fun PlayerActivity.showV2359CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2359capable
    FeaturePrefsStore.batch2351.v2359capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2359: careful mode
internal fun PlayerActivity.showV2359CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2359careful
    FeaturePrefsStore.batch2351.v2359careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2359: cautious mode
internal fun PlayerActivity.showV2359CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2359cautious
    FeaturePrefsStore.batch2351.v2359cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2359: charming level
internal fun PlayerActivity.showV2359CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2359: cheerful level
internal fun PlayerActivity.showV2359CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2359: chronic level
internal fun PlayerActivity.showV2359ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2359: civil level
internal fun PlayerActivity.showV2359CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2359: classic level
internal fun PlayerActivity.showV2359ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2359: clinical mode
internal fun PlayerActivity.showV2359ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2359clinical
    FeaturePrefsStore.batch2351.v2359clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2359: coherent mode
internal fun PlayerActivity.showV2359CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2359coherent
    FeaturePrefsStore.batch2351.v2359coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2359: colorful mode
internal fun PlayerActivity.showV2359ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2359colorful
    FeaturePrefsStore.batch2351.v2359colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2359: comfortable mode
internal fun PlayerActivity.showV2359ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2359comfortable
    FeaturePrefsStore.batch2351.v2359comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2359: compassionate mode
internal fun PlayerActivity.showV2359CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2359compassionate
    FeaturePrefsStore.batch2351.v2359compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2360: brilliant mode
internal fun PlayerActivity.showV2360BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2360brilliant
    FeaturePrefsStore.batch2351.v2360brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2360: brisk mode
internal fun PlayerActivity.showV2360BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2360brisk
    FeaturePrefsStore.batch2351.v2360brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2360: capable mode
internal fun PlayerActivity.showV2360CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2360capable
    FeaturePrefsStore.batch2351.v2360capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2360: careful mode
internal fun PlayerActivity.showV2360CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2360careful
    FeaturePrefsStore.batch2351.v2360careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2360: cautious mode
internal fun PlayerActivity.showV2360CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2360cautious
    FeaturePrefsStore.batch2351.v2360cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2360: charming level
internal fun PlayerActivity.showV2360CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2360: cheerful level
internal fun PlayerActivity.showV2360CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2360: chronic level
internal fun PlayerActivity.showV2360ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2360: civil level
internal fun PlayerActivity.showV2360CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2360: classic level
internal fun PlayerActivity.showV2360ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2360: clinical mode
internal fun PlayerActivity.showV2360ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2360clinical
    FeaturePrefsStore.batch2351.v2360clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2360: coherent mode
internal fun PlayerActivity.showV2360CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2360coherent
    FeaturePrefsStore.batch2351.v2360coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2360: colorful mode
internal fun PlayerActivity.showV2360ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2360colorful
    FeaturePrefsStore.batch2351.v2360colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2360: comfortable mode
internal fun PlayerActivity.showV2360ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2360comfortable
    FeaturePrefsStore.batch2351.v2360comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2360: compassionate mode
internal fun PlayerActivity.showV2360CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2360compassionate
    FeaturePrefsStore.batch2351.v2360compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}
