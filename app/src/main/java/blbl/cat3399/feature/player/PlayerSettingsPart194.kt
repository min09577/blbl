package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2121: outputted mode
internal fun PlayerActivity.showV2121OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121outputted
    FeaturePrefsStore.batch2121.v2121outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2121: overcome mode
internal fun PlayerActivity.showV2121OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2121overcome
    FeaturePrefsStore.batch2121.v2121overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2121: overlooked mode
internal fun PlayerActivity.showV2121OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121overlooked
    FeaturePrefsStore.batch2121.v2121overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2121: owned mode
internal fun PlayerActivity.showV2121OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121owned
    FeaturePrefsStore.batch2121.v2121owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2121: paced mode
internal fun PlayerActivity.showV2121PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121paced
    FeaturePrefsStore.batch2121.v2121paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2121: packed level
internal fun PlayerActivity.showV2121PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2121packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2121packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2121: painted level
internal fun PlayerActivity.showV2121PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2121painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2121painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2121: paired level
internal fun PlayerActivity.showV2121PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2121paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2121paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2121: panicked level
internal fun PlayerActivity.showV2121PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2121panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2121panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2121: parallelized level
internal fun PlayerActivity.showV2121ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2121parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2121parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2121: parsed mode
internal fun PlayerActivity.showV2121ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121parsed
    FeaturePrefsStore.batch2121.v2121parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2121: participated mode
internal fun PlayerActivity.showV2121ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121participated
    FeaturePrefsStore.batch2121.v2121participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2121: passed mode
internal fun PlayerActivity.showV2121PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121passed
    FeaturePrefsStore.batch2121.v2121passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2121: patched mode
internal fun PlayerActivity.showV2121PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121patched
    FeaturePrefsStore.batch2121.v2121patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2121: paused mode
internal fun PlayerActivity.showV2121PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2121paused
    FeaturePrefsStore.batch2121.v2121paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2122: outputted mode
internal fun PlayerActivity.showV2122OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122outputted
    FeaturePrefsStore.batch2121.v2122outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2122: overcome mode
internal fun PlayerActivity.showV2122OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2122overcome
    FeaturePrefsStore.batch2121.v2122overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2122: overlooked mode
internal fun PlayerActivity.showV2122OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122overlooked
    FeaturePrefsStore.batch2121.v2122overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2122: owned mode
internal fun PlayerActivity.showV2122OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122owned
    FeaturePrefsStore.batch2121.v2122owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2122: paced mode
internal fun PlayerActivity.showV2122PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122paced
    FeaturePrefsStore.batch2121.v2122paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2122: packed level
internal fun PlayerActivity.showV2122PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2122packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2122packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2122: painted level
internal fun PlayerActivity.showV2122PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2122painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2122painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2122: paired level
internal fun PlayerActivity.showV2122PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2122paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2122paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2122: panicked level
internal fun PlayerActivity.showV2122PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2122panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2122panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2122: parallelized level
internal fun PlayerActivity.showV2122ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2122parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2122parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2122: parsed mode
internal fun PlayerActivity.showV2122ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122parsed
    FeaturePrefsStore.batch2121.v2122parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2122: participated mode
internal fun PlayerActivity.showV2122ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122participated
    FeaturePrefsStore.batch2121.v2122participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2122: passed mode
internal fun PlayerActivity.showV2122PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122passed
    FeaturePrefsStore.batch2121.v2122passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2122: patched mode
internal fun PlayerActivity.showV2122PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122patched
    FeaturePrefsStore.batch2121.v2122patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2122: paused mode
internal fun PlayerActivity.showV2122PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2122paused
    FeaturePrefsStore.batch2121.v2122paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2123: outputted mode
internal fun PlayerActivity.showV2123OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123outputted
    FeaturePrefsStore.batch2121.v2123outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2123: overcome mode
internal fun PlayerActivity.showV2123OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2123overcome
    FeaturePrefsStore.batch2121.v2123overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2123: overlooked mode
internal fun PlayerActivity.showV2123OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123overlooked
    FeaturePrefsStore.batch2121.v2123overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2123: owned mode
internal fun PlayerActivity.showV2123OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123owned
    FeaturePrefsStore.batch2121.v2123owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2123: paced mode
internal fun PlayerActivity.showV2123PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123paced
    FeaturePrefsStore.batch2121.v2123paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2123: packed level
internal fun PlayerActivity.showV2123PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2123packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2123packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2123: painted level
internal fun PlayerActivity.showV2123PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2123painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2123painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2123: paired level
internal fun PlayerActivity.showV2123PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2123paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2123paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2123: panicked level
internal fun PlayerActivity.showV2123PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2123panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2123panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2123: parallelized level
internal fun PlayerActivity.showV2123ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2123parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2123parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2123: parsed mode
internal fun PlayerActivity.showV2123ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123parsed
    FeaturePrefsStore.batch2121.v2123parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2123: participated mode
internal fun PlayerActivity.showV2123ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123participated
    FeaturePrefsStore.batch2121.v2123participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2123: passed mode
internal fun PlayerActivity.showV2123PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123passed
    FeaturePrefsStore.batch2121.v2123passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2123: patched mode
internal fun PlayerActivity.showV2123PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123patched
    FeaturePrefsStore.batch2121.v2123patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2123: paused mode
internal fun PlayerActivity.showV2123PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2123paused
    FeaturePrefsStore.batch2121.v2123paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2124: outputted mode
internal fun PlayerActivity.showV2124OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124outputted
    FeaturePrefsStore.batch2121.v2124outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2124: overcome mode
internal fun PlayerActivity.showV2124OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2124overcome
    FeaturePrefsStore.batch2121.v2124overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2124: overlooked mode
internal fun PlayerActivity.showV2124OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124overlooked
    FeaturePrefsStore.batch2121.v2124overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2124: owned mode
internal fun PlayerActivity.showV2124OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124owned
    FeaturePrefsStore.batch2121.v2124owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2124: paced mode
internal fun PlayerActivity.showV2124PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124paced
    FeaturePrefsStore.batch2121.v2124paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2124: packed level
internal fun PlayerActivity.showV2124PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2124packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2124packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2124: painted level
internal fun PlayerActivity.showV2124PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2124painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2124painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2124: paired level
internal fun PlayerActivity.showV2124PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2124paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2124paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2124: panicked level
internal fun PlayerActivity.showV2124PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2124panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2124panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2124: parallelized level
internal fun PlayerActivity.showV2124ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2124parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2124parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2124: parsed mode
internal fun PlayerActivity.showV2124ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124parsed
    FeaturePrefsStore.batch2121.v2124parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2124: participated mode
internal fun PlayerActivity.showV2124ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124participated
    FeaturePrefsStore.batch2121.v2124participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2124: passed mode
internal fun PlayerActivity.showV2124PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124passed
    FeaturePrefsStore.batch2121.v2124passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2124: patched mode
internal fun PlayerActivity.showV2124PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124patched
    FeaturePrefsStore.batch2121.v2124patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2124: paused mode
internal fun PlayerActivity.showV2124PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2124paused
    FeaturePrefsStore.batch2121.v2124paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2125: outputted mode
internal fun PlayerActivity.showV2125OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125outputted
    FeaturePrefsStore.batch2121.v2125outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2125: overcome mode
internal fun PlayerActivity.showV2125OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2125overcome
    FeaturePrefsStore.batch2121.v2125overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2125: overlooked mode
internal fun PlayerActivity.showV2125OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125overlooked
    FeaturePrefsStore.batch2121.v2125overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2125: owned mode
internal fun PlayerActivity.showV2125OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125owned
    FeaturePrefsStore.batch2121.v2125owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2125: paced mode
internal fun PlayerActivity.showV2125PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125paced
    FeaturePrefsStore.batch2121.v2125paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2125: packed level
internal fun PlayerActivity.showV2125PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2125packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2125packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2125: painted level
internal fun PlayerActivity.showV2125PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2125painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2125painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2125: paired level
internal fun PlayerActivity.showV2125PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2125paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2125paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2125: panicked level
internal fun PlayerActivity.showV2125PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2125panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2125panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2125: parallelized level
internal fun PlayerActivity.showV2125ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2125parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2125parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2125: parsed mode
internal fun PlayerActivity.showV2125ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125parsed
    FeaturePrefsStore.batch2121.v2125parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2125: participated mode
internal fun PlayerActivity.showV2125ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125participated
    FeaturePrefsStore.batch2121.v2125participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2125: passed mode
internal fun PlayerActivity.showV2125PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125passed
    FeaturePrefsStore.batch2121.v2125passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2125: patched mode
internal fun PlayerActivity.showV2125PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125patched
    FeaturePrefsStore.batch2121.v2125patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2125: paused mode
internal fun PlayerActivity.showV2125PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2125paused
    FeaturePrefsStore.batch2121.v2125paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2126: outputted mode
internal fun PlayerActivity.showV2126OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126outputted
    FeaturePrefsStore.batch2121.v2126outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2126: overcome mode
internal fun PlayerActivity.showV2126OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2126overcome
    FeaturePrefsStore.batch2121.v2126overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2126: overlooked mode
internal fun PlayerActivity.showV2126OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126overlooked
    FeaturePrefsStore.batch2121.v2126overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2126: owned mode
internal fun PlayerActivity.showV2126OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126owned
    FeaturePrefsStore.batch2121.v2126owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2126: paced mode
internal fun PlayerActivity.showV2126PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126paced
    FeaturePrefsStore.batch2121.v2126paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2126: packed level
internal fun PlayerActivity.showV2126PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2126packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2126packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2126: painted level
internal fun PlayerActivity.showV2126PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2126painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2126painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2126: paired level
internal fun PlayerActivity.showV2126PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2126paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2126paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2126: panicked level
internal fun PlayerActivity.showV2126PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2126panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2126panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2126: parallelized level
internal fun PlayerActivity.showV2126ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2126parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2126parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2126: parsed mode
internal fun PlayerActivity.showV2126ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126parsed
    FeaturePrefsStore.batch2121.v2126parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2126: participated mode
internal fun PlayerActivity.showV2126ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126participated
    FeaturePrefsStore.batch2121.v2126participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2126: passed mode
internal fun PlayerActivity.showV2126PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126passed
    FeaturePrefsStore.batch2121.v2126passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2126: patched mode
internal fun PlayerActivity.showV2126PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126patched
    FeaturePrefsStore.batch2121.v2126patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2126: paused mode
internal fun PlayerActivity.showV2126PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2126paused
    FeaturePrefsStore.batch2121.v2126paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2127: outputted mode
internal fun PlayerActivity.showV2127OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127outputted
    FeaturePrefsStore.batch2121.v2127outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2127: overcome mode
internal fun PlayerActivity.showV2127OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2127overcome
    FeaturePrefsStore.batch2121.v2127overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2127: overlooked mode
internal fun PlayerActivity.showV2127OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127overlooked
    FeaturePrefsStore.batch2121.v2127overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2127: owned mode
internal fun PlayerActivity.showV2127OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127owned
    FeaturePrefsStore.batch2121.v2127owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2127: paced mode
internal fun PlayerActivity.showV2127PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127paced
    FeaturePrefsStore.batch2121.v2127paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2127: packed level
internal fun PlayerActivity.showV2127PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2127packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2127packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2127: painted level
internal fun PlayerActivity.showV2127PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2127painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2127painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2127: paired level
internal fun PlayerActivity.showV2127PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2127paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2127paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2127: panicked level
internal fun PlayerActivity.showV2127PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2127panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2127panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2127: parallelized level
internal fun PlayerActivity.showV2127ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2127parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2127parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2127: parsed mode
internal fun PlayerActivity.showV2127ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127parsed
    FeaturePrefsStore.batch2121.v2127parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2127: participated mode
internal fun PlayerActivity.showV2127ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127participated
    FeaturePrefsStore.batch2121.v2127participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2127: passed mode
internal fun PlayerActivity.showV2127PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127passed
    FeaturePrefsStore.batch2121.v2127passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2127: patched mode
internal fun PlayerActivity.showV2127PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127patched
    FeaturePrefsStore.batch2121.v2127patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2127: paused mode
internal fun PlayerActivity.showV2127PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2127paused
    FeaturePrefsStore.batch2121.v2127paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2128: outputted mode
internal fun PlayerActivity.showV2128OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128outputted
    FeaturePrefsStore.batch2121.v2128outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2128: overcome mode
internal fun PlayerActivity.showV2128OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2128overcome
    FeaturePrefsStore.batch2121.v2128overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2128: overlooked mode
internal fun PlayerActivity.showV2128OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128overlooked
    FeaturePrefsStore.batch2121.v2128overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2128: owned mode
internal fun PlayerActivity.showV2128OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128owned
    FeaturePrefsStore.batch2121.v2128owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2128: paced mode
internal fun PlayerActivity.showV2128PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128paced
    FeaturePrefsStore.batch2121.v2128paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2128: packed level
internal fun PlayerActivity.showV2128PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2128packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2128packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2128: painted level
internal fun PlayerActivity.showV2128PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2128painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2128painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2128: paired level
internal fun PlayerActivity.showV2128PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2128paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2128paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2128: panicked level
internal fun PlayerActivity.showV2128PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2128panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2128panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2128: parallelized level
internal fun PlayerActivity.showV2128ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2128parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2128parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2128: parsed mode
internal fun PlayerActivity.showV2128ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128parsed
    FeaturePrefsStore.batch2121.v2128parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2128: participated mode
internal fun PlayerActivity.showV2128ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128participated
    FeaturePrefsStore.batch2121.v2128participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2128: passed mode
internal fun PlayerActivity.showV2128PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128passed
    FeaturePrefsStore.batch2121.v2128passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2128: patched mode
internal fun PlayerActivity.showV2128PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128patched
    FeaturePrefsStore.batch2121.v2128patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2128: paused mode
internal fun PlayerActivity.showV2128PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2128paused
    FeaturePrefsStore.batch2121.v2128paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2129: outputted mode
internal fun PlayerActivity.showV2129OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129outputted
    FeaturePrefsStore.batch2121.v2129outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2129: overcome mode
internal fun PlayerActivity.showV2129OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2129overcome
    FeaturePrefsStore.batch2121.v2129overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2129: overlooked mode
internal fun PlayerActivity.showV2129OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129overlooked
    FeaturePrefsStore.batch2121.v2129overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2129: owned mode
internal fun PlayerActivity.showV2129OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129owned
    FeaturePrefsStore.batch2121.v2129owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2129: paced mode
internal fun PlayerActivity.showV2129PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129paced
    FeaturePrefsStore.batch2121.v2129paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2129: packed level
internal fun PlayerActivity.showV2129PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2129packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2129packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2129: painted level
internal fun PlayerActivity.showV2129PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2129painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2129painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2129: paired level
internal fun PlayerActivity.showV2129PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2129paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2129paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2129: panicked level
internal fun PlayerActivity.showV2129PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2129panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2129panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2129: parallelized level
internal fun PlayerActivity.showV2129ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2129parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2129parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2129: parsed mode
internal fun PlayerActivity.showV2129ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129parsed
    FeaturePrefsStore.batch2121.v2129parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2129: participated mode
internal fun PlayerActivity.showV2129ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129participated
    FeaturePrefsStore.batch2121.v2129participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2129: passed mode
internal fun PlayerActivity.showV2129PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129passed
    FeaturePrefsStore.batch2121.v2129passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2129: patched mode
internal fun PlayerActivity.showV2129PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129patched
    FeaturePrefsStore.batch2121.v2129patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2129: paused mode
internal fun PlayerActivity.showV2129PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2129paused
    FeaturePrefsStore.batch2121.v2129paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

// v2130: outputted mode
internal fun PlayerActivity.showV2130OutputtedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130outputted
    FeaturePrefsStore.batch2121.v2130outputted = !current
    AppToast.show(this, "outputted: ${if (!current) "ON" else "OFF"}")
}

// v2130: overcome mode
internal fun PlayerActivity.showV2130OvercomeToggle() {
    val current = FeaturePrefsStore.batch2121.v2130overcome
    FeaturePrefsStore.batch2121.v2130overcome = !current
    AppToast.show(this, "overcome: ${if (!current) "ON" else "OFF"}")
}

// v2130: overlooked mode
internal fun PlayerActivity.showV2130OverlookedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130overlooked
    FeaturePrefsStore.batch2121.v2130overlooked = !current
    AppToast.show(this, "overlooked: ${if (!current) "ON" else "OFF"}")
}

// v2130: owned mode
internal fun PlayerActivity.showV2130OwnedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130owned
    FeaturePrefsStore.batch2121.v2130owned = !current
    AppToast.show(this, "owned: ${if (!current) "ON" else "OFF"}")
}

// v2130: paced mode
internal fun PlayerActivity.showV2130PacedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130paced
    FeaturePrefsStore.batch2121.v2130paced = !current
    AppToast.show(this, "paced: ${if (!current) "ON" else "OFF"}")
}

// v2130: packed level
internal fun PlayerActivity.showV2130PackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2130packed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "packed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2130packed = value
        AppToast.show(this, "packed: $value")
    }
}

// v2130: painted level
internal fun PlayerActivity.showV2130PaintedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2130painted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "painted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2130painted = value
        AppToast.show(this, "painted: $value")
    }
}

// v2130: paired level
internal fun PlayerActivity.showV2130PairedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2130paired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2130paired = value
        AppToast.show(this, "paired: $value")
    }
}

// v2130: panicked level
internal fun PlayerActivity.showV2130PanickedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2130panicked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panicked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2130panicked = value
        AppToast.show(this, "panicked: $value")
    }
}

// v2130: parallelized level
internal fun PlayerActivity.showV2130ParallelizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2121.v2130parallelized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "parallelized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2121.v2130parallelized = value
        AppToast.show(this, "parallelized: $value")
    }
}

// v2130: parsed mode
internal fun PlayerActivity.showV2130ParsedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130parsed
    FeaturePrefsStore.batch2121.v2130parsed = !current
    AppToast.show(this, "parsed: ${if (!current) "ON" else "OFF"}")
}

// v2130: participated mode
internal fun PlayerActivity.showV2130ParticipatedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130participated
    FeaturePrefsStore.batch2121.v2130participated = !current
    AppToast.show(this, "participated: ${if (!current) "ON" else "OFF"}")
}

// v2130: passed mode
internal fun PlayerActivity.showV2130PassedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130passed
    FeaturePrefsStore.batch2121.v2130passed = !current
    AppToast.show(this, "passed: ${if (!current) "ON" else "OFF"}")
}

// v2130: patched mode
internal fun PlayerActivity.showV2130PatchedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130patched
    FeaturePrefsStore.batch2121.v2130patched = !current
    AppToast.show(this, "patched: ${if (!current) "ON" else "OFF"}")
}

// v2130: paused mode
internal fun PlayerActivity.showV2130PausedToggle() {
    val current = FeaturePrefsStore.batch2121.v2130paused
    FeaturePrefsStore.batch2121.v2130paused = !current
    AppToast.show(this, "paused: ${if (!current) "ON" else "OFF"}")
}

