package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2241: shut mode
internal fun PlayerActivity.showV2241ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2241shut
    FeaturePrefsStore.batch2241.v2241shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2241: signaled mode
internal fun PlayerActivity.showV2241SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2241signaled
    FeaturePrefsStore.batch2241.v2241signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2241: simplified mode
internal fun PlayerActivity.showV2241SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241simplified
    FeaturePrefsStore.batch2241.v2241simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2241: simulated mode
internal fun PlayerActivity.showV2241SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241simulated
    FeaturePrefsStore.batch2241.v2241simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2241: situated mode
internal fun PlayerActivity.showV2241SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241situated
    FeaturePrefsStore.batch2241.v2241situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2241: sized level
internal fun PlayerActivity.showV2241SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2241: sketched level
internal fun PlayerActivity.showV2241SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2241: slowed level
internal fun PlayerActivity.showV2241SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2241: smoothed level
internal fun PlayerActivity.showV2241SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2241: snapped level
internal fun PlayerActivity.showV2241SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2241: solved mode
internal fun PlayerActivity.showV2241SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241solved
    FeaturePrefsStore.batch2241.v2241solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2241: sorted mode
internal fun PlayerActivity.showV2241SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sorted
    FeaturePrefsStore.batch2241.v2241sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2241: sounded mode
internal fun PlayerActivity.showV2241SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sounded
    FeaturePrefsStore.batch2241.v2241sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2241: sourced mode
internal fun PlayerActivity.showV2241SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sourced
    FeaturePrefsStore.batch2241.v2241sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2241: sparked mode
internal fun PlayerActivity.showV2241SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sparked
    FeaturePrefsStore.batch2241.v2241sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2242: shut mode
internal fun PlayerActivity.showV2242ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2242shut
    FeaturePrefsStore.batch2241.v2242shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2242: signaled mode
internal fun PlayerActivity.showV2242SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2242signaled
    FeaturePrefsStore.batch2241.v2242signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2242: simplified mode
internal fun PlayerActivity.showV2242SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242simplified
    FeaturePrefsStore.batch2241.v2242simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2242: simulated mode
internal fun PlayerActivity.showV2242SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242simulated
    FeaturePrefsStore.batch2241.v2242simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2242: situated mode
internal fun PlayerActivity.showV2242SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242situated
    FeaturePrefsStore.batch2241.v2242situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2242: sized level
internal fun PlayerActivity.showV2242SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2242: sketched level
internal fun PlayerActivity.showV2242SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2242: slowed level
internal fun PlayerActivity.showV2242SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2242: smoothed level
internal fun PlayerActivity.showV2242SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2242: snapped level
internal fun PlayerActivity.showV2242SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2242: solved mode
internal fun PlayerActivity.showV2242SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242solved
    FeaturePrefsStore.batch2241.v2242solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2242: sorted mode
internal fun PlayerActivity.showV2242SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sorted
    FeaturePrefsStore.batch2241.v2242sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2242: sounded mode
internal fun PlayerActivity.showV2242SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sounded
    FeaturePrefsStore.batch2241.v2242sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2242: sourced mode
internal fun PlayerActivity.showV2242SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sourced
    FeaturePrefsStore.batch2241.v2242sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2242: sparked mode
internal fun PlayerActivity.showV2242SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sparked
    FeaturePrefsStore.batch2241.v2242sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2243: shut mode
internal fun PlayerActivity.showV2243ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2243shut
    FeaturePrefsStore.batch2241.v2243shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2243: signaled mode
internal fun PlayerActivity.showV2243SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2243signaled
    FeaturePrefsStore.batch2241.v2243signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2243: simplified mode
internal fun PlayerActivity.showV2243SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243simplified
    FeaturePrefsStore.batch2241.v2243simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2243: simulated mode
internal fun PlayerActivity.showV2243SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243simulated
    FeaturePrefsStore.batch2241.v2243simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2243: situated mode
internal fun PlayerActivity.showV2243SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243situated
    FeaturePrefsStore.batch2241.v2243situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2243: sized level
internal fun PlayerActivity.showV2243SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2243: sketched level
internal fun PlayerActivity.showV2243SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2243: slowed level
internal fun PlayerActivity.showV2243SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2243: smoothed level
internal fun PlayerActivity.showV2243SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2243: snapped level
internal fun PlayerActivity.showV2243SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2243: solved mode
internal fun PlayerActivity.showV2243SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243solved
    FeaturePrefsStore.batch2241.v2243solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2243: sorted mode
internal fun PlayerActivity.showV2243SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sorted
    FeaturePrefsStore.batch2241.v2243sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2243: sounded mode
internal fun PlayerActivity.showV2243SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sounded
    FeaturePrefsStore.batch2241.v2243sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2243: sourced mode
internal fun PlayerActivity.showV2243SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sourced
    FeaturePrefsStore.batch2241.v2243sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2243: sparked mode
internal fun PlayerActivity.showV2243SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sparked
    FeaturePrefsStore.batch2241.v2243sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2244: shut mode
internal fun PlayerActivity.showV2244ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2244shut
    FeaturePrefsStore.batch2241.v2244shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2244: signaled mode
internal fun PlayerActivity.showV2244SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2244signaled
    FeaturePrefsStore.batch2241.v2244signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2244: simplified mode
internal fun PlayerActivity.showV2244SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244simplified
    FeaturePrefsStore.batch2241.v2244simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2244: simulated mode
internal fun PlayerActivity.showV2244SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244simulated
    FeaturePrefsStore.batch2241.v2244simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2244: situated mode
internal fun PlayerActivity.showV2244SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244situated
    FeaturePrefsStore.batch2241.v2244situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2244: sized level
internal fun PlayerActivity.showV2244SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2244: sketched level
internal fun PlayerActivity.showV2244SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2244: slowed level
internal fun PlayerActivity.showV2244SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2244: smoothed level
internal fun PlayerActivity.showV2244SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2244: snapped level
internal fun PlayerActivity.showV2244SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2244: solved mode
internal fun PlayerActivity.showV2244SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244solved
    FeaturePrefsStore.batch2241.v2244solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2244: sorted mode
internal fun PlayerActivity.showV2244SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sorted
    FeaturePrefsStore.batch2241.v2244sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2244: sounded mode
internal fun PlayerActivity.showV2244SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sounded
    FeaturePrefsStore.batch2241.v2244sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2244: sourced mode
internal fun PlayerActivity.showV2244SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sourced
    FeaturePrefsStore.batch2241.v2244sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2244: sparked mode
internal fun PlayerActivity.showV2244SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sparked
    FeaturePrefsStore.batch2241.v2244sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2245: shut mode
internal fun PlayerActivity.showV2245ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2245shut
    FeaturePrefsStore.batch2241.v2245shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2245: signaled mode
internal fun PlayerActivity.showV2245SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2245signaled
    FeaturePrefsStore.batch2241.v2245signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2245: simplified mode
internal fun PlayerActivity.showV2245SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245simplified
    FeaturePrefsStore.batch2241.v2245simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2245: simulated mode
internal fun PlayerActivity.showV2245SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245simulated
    FeaturePrefsStore.batch2241.v2245simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2245: situated mode
internal fun PlayerActivity.showV2245SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245situated
    FeaturePrefsStore.batch2241.v2245situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2245: sized level
internal fun PlayerActivity.showV2245SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2245: sketched level
internal fun PlayerActivity.showV2245SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2245: slowed level
internal fun PlayerActivity.showV2245SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2245: smoothed level
internal fun PlayerActivity.showV2245SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2245: snapped level
internal fun PlayerActivity.showV2245SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2245: solved mode
internal fun PlayerActivity.showV2245SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245solved
    FeaturePrefsStore.batch2241.v2245solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2245: sorted mode
internal fun PlayerActivity.showV2245SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sorted
    FeaturePrefsStore.batch2241.v2245sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2245: sounded mode
internal fun PlayerActivity.showV2245SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sounded
    FeaturePrefsStore.batch2241.v2245sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2245: sourced mode
internal fun PlayerActivity.showV2245SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sourced
    FeaturePrefsStore.batch2241.v2245sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2245: sparked mode
internal fun PlayerActivity.showV2245SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sparked
    FeaturePrefsStore.batch2241.v2245sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2246: shut mode
internal fun PlayerActivity.showV2246ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2246shut
    FeaturePrefsStore.batch2241.v2246shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2246: signaled mode
internal fun PlayerActivity.showV2246SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2246signaled
    FeaturePrefsStore.batch2241.v2246signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2246: simplified mode
internal fun PlayerActivity.showV2246SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246simplified
    FeaturePrefsStore.batch2241.v2246simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2246: simulated mode
internal fun PlayerActivity.showV2246SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246simulated
    FeaturePrefsStore.batch2241.v2246simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2246: situated mode
internal fun PlayerActivity.showV2246SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246situated
    FeaturePrefsStore.batch2241.v2246situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2246: sized level
internal fun PlayerActivity.showV2246SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2246: sketched level
internal fun PlayerActivity.showV2246SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2246: slowed level
internal fun PlayerActivity.showV2246SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2246: smoothed level
internal fun PlayerActivity.showV2246SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2246: snapped level
internal fun PlayerActivity.showV2246SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2246: solved mode
internal fun PlayerActivity.showV2246SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246solved
    FeaturePrefsStore.batch2241.v2246solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2246: sorted mode
internal fun PlayerActivity.showV2246SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sorted
    FeaturePrefsStore.batch2241.v2246sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2246: sounded mode
internal fun PlayerActivity.showV2246SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sounded
    FeaturePrefsStore.batch2241.v2246sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2246: sourced mode
internal fun PlayerActivity.showV2246SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sourced
    FeaturePrefsStore.batch2241.v2246sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2246: sparked mode
internal fun PlayerActivity.showV2246SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sparked
    FeaturePrefsStore.batch2241.v2246sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2247: shut mode
internal fun PlayerActivity.showV2247ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2247shut
    FeaturePrefsStore.batch2241.v2247shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2247: signaled mode
internal fun PlayerActivity.showV2247SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2247signaled
    FeaturePrefsStore.batch2241.v2247signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2247: simplified mode
internal fun PlayerActivity.showV2247SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247simplified
    FeaturePrefsStore.batch2241.v2247simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2247: simulated mode
internal fun PlayerActivity.showV2247SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247simulated
    FeaturePrefsStore.batch2241.v2247simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2247: situated mode
internal fun PlayerActivity.showV2247SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247situated
    FeaturePrefsStore.batch2241.v2247situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2247: sized level
internal fun PlayerActivity.showV2247SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2247: sketched level
internal fun PlayerActivity.showV2247SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2247: slowed level
internal fun PlayerActivity.showV2247SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2247: smoothed level
internal fun PlayerActivity.showV2247SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2247: snapped level
internal fun PlayerActivity.showV2247SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2247: solved mode
internal fun PlayerActivity.showV2247SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247solved
    FeaturePrefsStore.batch2241.v2247solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2247: sorted mode
internal fun PlayerActivity.showV2247SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sorted
    FeaturePrefsStore.batch2241.v2247sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2247: sounded mode
internal fun PlayerActivity.showV2247SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sounded
    FeaturePrefsStore.batch2241.v2247sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2247: sourced mode
internal fun PlayerActivity.showV2247SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sourced
    FeaturePrefsStore.batch2241.v2247sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2247: sparked mode
internal fun PlayerActivity.showV2247SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sparked
    FeaturePrefsStore.batch2241.v2247sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2248: shut mode
internal fun PlayerActivity.showV2248ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2248shut
    FeaturePrefsStore.batch2241.v2248shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2248: signaled mode
internal fun PlayerActivity.showV2248SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2248signaled
    FeaturePrefsStore.batch2241.v2248signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2248: simplified mode
internal fun PlayerActivity.showV2248SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248simplified
    FeaturePrefsStore.batch2241.v2248simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2248: simulated mode
internal fun PlayerActivity.showV2248SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248simulated
    FeaturePrefsStore.batch2241.v2248simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2248: situated mode
internal fun PlayerActivity.showV2248SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248situated
    FeaturePrefsStore.batch2241.v2248situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2248: sized level
internal fun PlayerActivity.showV2248SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2248: sketched level
internal fun PlayerActivity.showV2248SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2248: slowed level
internal fun PlayerActivity.showV2248SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2248: smoothed level
internal fun PlayerActivity.showV2248SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2248: snapped level
internal fun PlayerActivity.showV2248SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2248: solved mode
internal fun PlayerActivity.showV2248SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248solved
    FeaturePrefsStore.batch2241.v2248solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2248: sorted mode
internal fun PlayerActivity.showV2248SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sorted
    FeaturePrefsStore.batch2241.v2248sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2248: sounded mode
internal fun PlayerActivity.showV2248SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sounded
    FeaturePrefsStore.batch2241.v2248sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2248: sourced mode
internal fun PlayerActivity.showV2248SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sourced
    FeaturePrefsStore.batch2241.v2248sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2248: sparked mode
internal fun PlayerActivity.showV2248SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sparked
    FeaturePrefsStore.batch2241.v2248sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2249: shut mode
internal fun PlayerActivity.showV2249ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2249shut
    FeaturePrefsStore.batch2241.v2249shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2249: signaled mode
internal fun PlayerActivity.showV2249SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2249signaled
    FeaturePrefsStore.batch2241.v2249signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2249: simplified mode
internal fun PlayerActivity.showV2249SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249simplified
    FeaturePrefsStore.batch2241.v2249simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2249: simulated mode
internal fun PlayerActivity.showV2249SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249simulated
    FeaturePrefsStore.batch2241.v2249simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2249: situated mode
internal fun PlayerActivity.showV2249SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249situated
    FeaturePrefsStore.batch2241.v2249situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2249: sized level
internal fun PlayerActivity.showV2249SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2249: sketched level
internal fun PlayerActivity.showV2249SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2249: slowed level
internal fun PlayerActivity.showV2249SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2249: smoothed level
internal fun PlayerActivity.showV2249SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2249: snapped level
internal fun PlayerActivity.showV2249SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2249: solved mode
internal fun PlayerActivity.showV2249SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249solved
    FeaturePrefsStore.batch2241.v2249solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2249: sorted mode
internal fun PlayerActivity.showV2249SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sorted
    FeaturePrefsStore.batch2241.v2249sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2249: sounded mode
internal fun PlayerActivity.showV2249SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sounded
    FeaturePrefsStore.batch2241.v2249sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2249: sourced mode
internal fun PlayerActivity.showV2249SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sourced
    FeaturePrefsStore.batch2241.v2249sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2249: sparked mode
internal fun PlayerActivity.showV2249SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sparked
    FeaturePrefsStore.batch2241.v2249sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2250: shut mode
internal fun PlayerActivity.showV2250ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2250shut
    FeaturePrefsStore.batch2241.v2250shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2250: signaled mode
internal fun PlayerActivity.showV2250SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2250signaled
    FeaturePrefsStore.batch2241.v2250signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2250: simplified mode
internal fun PlayerActivity.showV2250SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250simplified
    FeaturePrefsStore.batch2241.v2250simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2250: simulated mode
internal fun PlayerActivity.showV2250SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250simulated
    FeaturePrefsStore.batch2241.v2250simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2250: situated mode
internal fun PlayerActivity.showV2250SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250situated
    FeaturePrefsStore.batch2241.v2250situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2250: sized level
internal fun PlayerActivity.showV2250SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2250: sketched level
internal fun PlayerActivity.showV2250SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2250: slowed level
internal fun PlayerActivity.showV2250SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2250: smoothed level
internal fun PlayerActivity.showV2250SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2250: snapped level
internal fun PlayerActivity.showV2250SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2250: solved mode
internal fun PlayerActivity.showV2250SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250solved
    FeaturePrefsStore.batch2241.v2250solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2250: sorted mode
internal fun PlayerActivity.showV2250SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sorted
    FeaturePrefsStore.batch2241.v2250sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2250: sounded mode
internal fun PlayerActivity.showV2250SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sounded
    FeaturePrefsStore.batch2241.v2250sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2250: sourced mode
internal fun PlayerActivity.showV2250SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sourced
    FeaturePrefsStore.batch2241.v2250sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2250: sparked mode
internal fun PlayerActivity.showV2250SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sparked
    FeaturePrefsStore.batch2241.v2250sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

