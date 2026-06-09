package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2231: segmented mode
internal fun PlayerActivity.showV2231SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231segmented
    FeaturePrefsStore.batch2231.v2231segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2231: selected mode
internal fun PlayerActivity.showV2231SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231selected
    FeaturePrefsStore.batch2231.v2231selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2231: served mode
internal fun PlayerActivity.showV2231ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231served
    FeaturePrefsStore.batch2231.v2231served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2231: serviced mode
internal fun PlayerActivity.showV2231ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231serviced
    FeaturePrefsStore.batch2231.v2231serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2231: settled mode
internal fun PlayerActivity.showV2231SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2231settled
    FeaturePrefsStore.batch2231.v2231settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2231: shaped level
internal fun PlayerActivity.showV2231ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2231: shared level
internal fun PlayerActivity.showV2231SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2231: sharpened level
internal fun PlayerActivity.showV2231SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2231: sheltered level
internal fun PlayerActivity.showV2231ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2231: shifted level
internal fun PlayerActivity.showV2231ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2231: shortened mode
internal fun PlayerActivity.showV2231ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shortened
    FeaturePrefsStore.batch2231.v2231shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2231: showcased mode
internal fun PlayerActivity.showV2231ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231showcased
    FeaturePrefsStore.batch2231.v2231showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2231: shrank mode
internal fun PlayerActivity.showV2231ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shrank
    FeaturePrefsStore.batch2231.v2231shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2231: shrugged mode
internal fun PlayerActivity.showV2231ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shrugged
    FeaturePrefsStore.batch2231.v2231shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2231: shuffled mode
internal fun PlayerActivity.showV2231ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shuffled
    FeaturePrefsStore.batch2231.v2231shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2232: segmented mode
internal fun PlayerActivity.showV2232SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232segmented
    FeaturePrefsStore.batch2231.v2232segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2232: selected mode
internal fun PlayerActivity.showV2232SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232selected
    FeaturePrefsStore.batch2231.v2232selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2232: served mode
internal fun PlayerActivity.showV2232ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232served
    FeaturePrefsStore.batch2231.v2232served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2232: serviced mode
internal fun PlayerActivity.showV2232ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232serviced
    FeaturePrefsStore.batch2231.v2232serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2232: settled mode
internal fun PlayerActivity.showV2232SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2232settled
    FeaturePrefsStore.batch2231.v2232settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2232: shaped level
internal fun PlayerActivity.showV2232ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2232: shared level
internal fun PlayerActivity.showV2232SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2232: sharpened level
internal fun PlayerActivity.showV2232SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2232: sheltered level
internal fun PlayerActivity.showV2232ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2232: shifted level
internal fun PlayerActivity.showV2232ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2232: shortened mode
internal fun PlayerActivity.showV2232ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shortened
    FeaturePrefsStore.batch2231.v2232shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2232: showcased mode
internal fun PlayerActivity.showV2232ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232showcased
    FeaturePrefsStore.batch2231.v2232showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2232: shrank mode
internal fun PlayerActivity.showV2232ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shrank
    FeaturePrefsStore.batch2231.v2232shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2232: shrugged mode
internal fun PlayerActivity.showV2232ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shrugged
    FeaturePrefsStore.batch2231.v2232shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2232: shuffled mode
internal fun PlayerActivity.showV2232ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shuffled
    FeaturePrefsStore.batch2231.v2232shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2233: segmented mode
internal fun PlayerActivity.showV2233SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233segmented
    FeaturePrefsStore.batch2231.v2233segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2233: selected mode
internal fun PlayerActivity.showV2233SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233selected
    FeaturePrefsStore.batch2231.v2233selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2233: served mode
internal fun PlayerActivity.showV2233ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233served
    FeaturePrefsStore.batch2231.v2233served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2233: serviced mode
internal fun PlayerActivity.showV2233ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233serviced
    FeaturePrefsStore.batch2231.v2233serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2233: settled mode
internal fun PlayerActivity.showV2233SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2233settled
    FeaturePrefsStore.batch2231.v2233settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2233: shaped level
internal fun PlayerActivity.showV2233ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2233: shared level
internal fun PlayerActivity.showV2233SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2233: sharpened level
internal fun PlayerActivity.showV2233SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2233: sheltered level
internal fun PlayerActivity.showV2233ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2233: shifted level
internal fun PlayerActivity.showV2233ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2233: shortened mode
internal fun PlayerActivity.showV2233ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shortened
    FeaturePrefsStore.batch2231.v2233shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2233: showcased mode
internal fun PlayerActivity.showV2233ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233showcased
    FeaturePrefsStore.batch2231.v2233showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2233: shrank mode
internal fun PlayerActivity.showV2233ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shrank
    FeaturePrefsStore.batch2231.v2233shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2233: shrugged mode
internal fun PlayerActivity.showV2233ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shrugged
    FeaturePrefsStore.batch2231.v2233shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2233: shuffled mode
internal fun PlayerActivity.showV2233ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shuffled
    FeaturePrefsStore.batch2231.v2233shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2234: segmented mode
internal fun PlayerActivity.showV2234SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234segmented
    FeaturePrefsStore.batch2231.v2234segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2234: selected mode
internal fun PlayerActivity.showV2234SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234selected
    FeaturePrefsStore.batch2231.v2234selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2234: served mode
internal fun PlayerActivity.showV2234ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234served
    FeaturePrefsStore.batch2231.v2234served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2234: serviced mode
internal fun PlayerActivity.showV2234ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234serviced
    FeaturePrefsStore.batch2231.v2234serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2234: settled mode
internal fun PlayerActivity.showV2234SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2234settled
    FeaturePrefsStore.batch2231.v2234settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2234: shaped level
internal fun PlayerActivity.showV2234ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2234: shared level
internal fun PlayerActivity.showV2234SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2234: sharpened level
internal fun PlayerActivity.showV2234SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2234: sheltered level
internal fun PlayerActivity.showV2234ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2234: shifted level
internal fun PlayerActivity.showV2234ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2234: shortened mode
internal fun PlayerActivity.showV2234ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shortened
    FeaturePrefsStore.batch2231.v2234shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2234: showcased mode
internal fun PlayerActivity.showV2234ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234showcased
    FeaturePrefsStore.batch2231.v2234showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2234: shrank mode
internal fun PlayerActivity.showV2234ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shrank
    FeaturePrefsStore.batch2231.v2234shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2234: shrugged mode
internal fun PlayerActivity.showV2234ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shrugged
    FeaturePrefsStore.batch2231.v2234shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2234: shuffled mode
internal fun PlayerActivity.showV2234ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shuffled
    FeaturePrefsStore.batch2231.v2234shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2235: segmented mode
internal fun PlayerActivity.showV2235SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235segmented
    FeaturePrefsStore.batch2231.v2235segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2235: selected mode
internal fun PlayerActivity.showV2235SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235selected
    FeaturePrefsStore.batch2231.v2235selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2235: served mode
internal fun PlayerActivity.showV2235ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235served
    FeaturePrefsStore.batch2231.v2235served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2235: serviced mode
internal fun PlayerActivity.showV2235ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235serviced
    FeaturePrefsStore.batch2231.v2235serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2235: settled mode
internal fun PlayerActivity.showV2235SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2235settled
    FeaturePrefsStore.batch2231.v2235settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2235: shaped level
internal fun PlayerActivity.showV2235ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2235: shared level
internal fun PlayerActivity.showV2235SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2235: sharpened level
internal fun PlayerActivity.showV2235SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2235: sheltered level
internal fun PlayerActivity.showV2235ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2235: shifted level
internal fun PlayerActivity.showV2235ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2235: shortened mode
internal fun PlayerActivity.showV2235ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shortened
    FeaturePrefsStore.batch2231.v2235shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2235: showcased mode
internal fun PlayerActivity.showV2235ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235showcased
    FeaturePrefsStore.batch2231.v2235showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2235: shrank mode
internal fun PlayerActivity.showV2235ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shrank
    FeaturePrefsStore.batch2231.v2235shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2235: shrugged mode
internal fun PlayerActivity.showV2235ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shrugged
    FeaturePrefsStore.batch2231.v2235shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2235: shuffled mode
internal fun PlayerActivity.showV2235ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shuffled
    FeaturePrefsStore.batch2231.v2235shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2236: segmented mode
internal fun PlayerActivity.showV2236SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236segmented
    FeaturePrefsStore.batch2231.v2236segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2236: selected mode
internal fun PlayerActivity.showV2236SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236selected
    FeaturePrefsStore.batch2231.v2236selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2236: served mode
internal fun PlayerActivity.showV2236ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236served
    FeaturePrefsStore.batch2231.v2236served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2236: serviced mode
internal fun PlayerActivity.showV2236ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236serviced
    FeaturePrefsStore.batch2231.v2236serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2236: settled mode
internal fun PlayerActivity.showV2236SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2236settled
    FeaturePrefsStore.batch2231.v2236settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2236: shaped level
internal fun PlayerActivity.showV2236ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2236: shared level
internal fun PlayerActivity.showV2236SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2236: sharpened level
internal fun PlayerActivity.showV2236SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2236: sheltered level
internal fun PlayerActivity.showV2236ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2236: shifted level
internal fun PlayerActivity.showV2236ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2236: shortened mode
internal fun PlayerActivity.showV2236ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shortened
    FeaturePrefsStore.batch2231.v2236shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2236: showcased mode
internal fun PlayerActivity.showV2236ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236showcased
    FeaturePrefsStore.batch2231.v2236showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2236: shrank mode
internal fun PlayerActivity.showV2236ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shrank
    FeaturePrefsStore.batch2231.v2236shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2236: shrugged mode
internal fun PlayerActivity.showV2236ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shrugged
    FeaturePrefsStore.batch2231.v2236shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2236: shuffled mode
internal fun PlayerActivity.showV2236ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shuffled
    FeaturePrefsStore.batch2231.v2236shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2237: segmented mode
internal fun PlayerActivity.showV2237SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237segmented
    FeaturePrefsStore.batch2231.v2237segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2237: selected mode
internal fun PlayerActivity.showV2237SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237selected
    FeaturePrefsStore.batch2231.v2237selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2237: served mode
internal fun PlayerActivity.showV2237ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237served
    FeaturePrefsStore.batch2231.v2237served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2237: serviced mode
internal fun PlayerActivity.showV2237ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237serviced
    FeaturePrefsStore.batch2231.v2237serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2237: settled mode
internal fun PlayerActivity.showV2237SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2237settled
    FeaturePrefsStore.batch2231.v2237settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2237: shaped level
internal fun PlayerActivity.showV2237ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2237: shared level
internal fun PlayerActivity.showV2237SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2237: sharpened level
internal fun PlayerActivity.showV2237SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2237: sheltered level
internal fun PlayerActivity.showV2237ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2237: shifted level
internal fun PlayerActivity.showV2237ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2237: shortened mode
internal fun PlayerActivity.showV2237ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shortened
    FeaturePrefsStore.batch2231.v2237shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2237: showcased mode
internal fun PlayerActivity.showV2237ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237showcased
    FeaturePrefsStore.batch2231.v2237showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2237: shrank mode
internal fun PlayerActivity.showV2237ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shrank
    FeaturePrefsStore.batch2231.v2237shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2237: shrugged mode
internal fun PlayerActivity.showV2237ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shrugged
    FeaturePrefsStore.batch2231.v2237shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2237: shuffled mode
internal fun PlayerActivity.showV2237ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shuffled
    FeaturePrefsStore.batch2231.v2237shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2238: segmented mode
internal fun PlayerActivity.showV2238SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238segmented
    FeaturePrefsStore.batch2231.v2238segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2238: selected mode
internal fun PlayerActivity.showV2238SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238selected
    FeaturePrefsStore.batch2231.v2238selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2238: served mode
internal fun PlayerActivity.showV2238ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238served
    FeaturePrefsStore.batch2231.v2238served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2238: serviced mode
internal fun PlayerActivity.showV2238ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238serviced
    FeaturePrefsStore.batch2231.v2238serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2238: settled mode
internal fun PlayerActivity.showV2238SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2238settled
    FeaturePrefsStore.batch2231.v2238settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2238: shaped level
internal fun PlayerActivity.showV2238ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2238: shared level
internal fun PlayerActivity.showV2238SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2238: sharpened level
internal fun PlayerActivity.showV2238SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2238: sheltered level
internal fun PlayerActivity.showV2238ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2238: shifted level
internal fun PlayerActivity.showV2238ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2238: shortened mode
internal fun PlayerActivity.showV2238ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shortened
    FeaturePrefsStore.batch2231.v2238shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2238: showcased mode
internal fun PlayerActivity.showV2238ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238showcased
    FeaturePrefsStore.batch2231.v2238showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2238: shrank mode
internal fun PlayerActivity.showV2238ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shrank
    FeaturePrefsStore.batch2231.v2238shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2238: shrugged mode
internal fun PlayerActivity.showV2238ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shrugged
    FeaturePrefsStore.batch2231.v2238shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2238: shuffled mode
internal fun PlayerActivity.showV2238ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shuffled
    FeaturePrefsStore.batch2231.v2238shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2239: segmented mode
internal fun PlayerActivity.showV2239SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239segmented
    FeaturePrefsStore.batch2231.v2239segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2239: selected mode
internal fun PlayerActivity.showV2239SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239selected
    FeaturePrefsStore.batch2231.v2239selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2239: served mode
internal fun PlayerActivity.showV2239ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239served
    FeaturePrefsStore.batch2231.v2239served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2239: serviced mode
internal fun PlayerActivity.showV2239ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239serviced
    FeaturePrefsStore.batch2231.v2239serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2239: settled mode
internal fun PlayerActivity.showV2239SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2239settled
    FeaturePrefsStore.batch2231.v2239settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2239: shaped level
internal fun PlayerActivity.showV2239ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2239: shared level
internal fun PlayerActivity.showV2239SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2239: sharpened level
internal fun PlayerActivity.showV2239SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2239: sheltered level
internal fun PlayerActivity.showV2239ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2239: shifted level
internal fun PlayerActivity.showV2239ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2239: shortened mode
internal fun PlayerActivity.showV2239ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shortened
    FeaturePrefsStore.batch2231.v2239shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2239: showcased mode
internal fun PlayerActivity.showV2239ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239showcased
    FeaturePrefsStore.batch2231.v2239showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2239: shrank mode
internal fun PlayerActivity.showV2239ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shrank
    FeaturePrefsStore.batch2231.v2239shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2239: shrugged mode
internal fun PlayerActivity.showV2239ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shrugged
    FeaturePrefsStore.batch2231.v2239shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2239: shuffled mode
internal fun PlayerActivity.showV2239ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shuffled
    FeaturePrefsStore.batch2231.v2239shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2240: segmented mode
internal fun PlayerActivity.showV2240SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240segmented
    FeaturePrefsStore.batch2231.v2240segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2240: selected mode
internal fun PlayerActivity.showV2240SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240selected
    FeaturePrefsStore.batch2231.v2240selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2240: served mode
internal fun PlayerActivity.showV2240ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240served
    FeaturePrefsStore.batch2231.v2240served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2240: serviced mode
internal fun PlayerActivity.showV2240ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240serviced
    FeaturePrefsStore.batch2231.v2240serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2240: settled mode
internal fun PlayerActivity.showV2240SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2240settled
    FeaturePrefsStore.batch2231.v2240settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2240: shaped level
internal fun PlayerActivity.showV2240ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2240: shared level
internal fun PlayerActivity.showV2240SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2240: sharpened level
internal fun PlayerActivity.showV2240SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2240: sheltered level
internal fun PlayerActivity.showV2240ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2240: shifted level
internal fun PlayerActivity.showV2240ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2240: shortened mode
internal fun PlayerActivity.showV2240ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shortened
    FeaturePrefsStore.batch2231.v2240shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2240: showcased mode
internal fun PlayerActivity.showV2240ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240showcased
    FeaturePrefsStore.batch2231.v2240showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2240: shrank mode
internal fun PlayerActivity.showV2240ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shrank
    FeaturePrefsStore.batch2231.v2240shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2240: shrugged mode
internal fun PlayerActivity.showV2240ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shrugged
    FeaturePrefsStore.batch2231.v2240shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2240: shuffled mode
internal fun PlayerActivity.showV2240ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shuffled
    FeaturePrefsStore.batch2231.v2240shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

