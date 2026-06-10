package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2111: objected mode
internal fun PlayerActivity.showV2111ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111objected
    FeaturePrefsStore.batch2111.v2111objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2111: obliged mode
internal fun PlayerActivity.showV2111ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111obliged
    FeaturePrefsStore.batch2111.v2111obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2111: observed mode
internal fun PlayerActivity.showV2111ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111observed
    FeaturePrefsStore.batch2111.v2111observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2111: obtained mode
internal fun PlayerActivity.showV2111ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111obtained
    FeaturePrefsStore.batch2111.v2111obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2111: occupied mode
internal fun PlayerActivity.showV2111OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111occupied
    FeaturePrefsStore.batch2111.v2111occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2111: occurred level
internal fun PlayerActivity.showV2111OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2111occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2111occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2111: offered level
internal fun PlayerActivity.showV2111OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2111offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2111offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2111: operated level
internal fun PlayerActivity.showV2111OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2111operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2111operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2111: opposed level
internal fun PlayerActivity.showV2111OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2111opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2111opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2111: optimized level
internal fun PlayerActivity.showV2111OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2111optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2111optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2111: ordered mode
internal fun PlayerActivity.showV2111OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111ordered
    FeaturePrefsStore.batch2111.v2111ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2111: organized mode
internal fun PlayerActivity.showV2111OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111organized
    FeaturePrefsStore.batch2111.v2111organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2111: oriented mode
internal fun PlayerActivity.showV2111OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111oriented
    FeaturePrefsStore.batch2111.v2111oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2111: originated mode
internal fun PlayerActivity.showV2111OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111originated
    FeaturePrefsStore.batch2111.v2111originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2111: outperformed mode
internal fun PlayerActivity.showV2111OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2111outperformed
    FeaturePrefsStore.batch2111.v2111outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2112: objected mode
internal fun PlayerActivity.showV2112ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112objected
    FeaturePrefsStore.batch2111.v2112objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2112: obliged mode
internal fun PlayerActivity.showV2112ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112obliged
    FeaturePrefsStore.batch2111.v2112obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2112: observed mode
internal fun PlayerActivity.showV2112ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112observed
    FeaturePrefsStore.batch2111.v2112observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2112: obtained mode
internal fun PlayerActivity.showV2112ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112obtained
    FeaturePrefsStore.batch2111.v2112obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2112: occupied mode
internal fun PlayerActivity.showV2112OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112occupied
    FeaturePrefsStore.batch2111.v2112occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2112: occurred level
internal fun PlayerActivity.showV2112OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2112occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2112occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2112: offered level
internal fun PlayerActivity.showV2112OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2112offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2112offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2112: operated level
internal fun PlayerActivity.showV2112OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2112operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2112operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2112: opposed level
internal fun PlayerActivity.showV2112OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2112opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2112opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2112: optimized level
internal fun PlayerActivity.showV2112OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2112optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2112optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2112: ordered mode
internal fun PlayerActivity.showV2112OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112ordered
    FeaturePrefsStore.batch2111.v2112ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2112: organized mode
internal fun PlayerActivity.showV2112OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112organized
    FeaturePrefsStore.batch2111.v2112organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2112: oriented mode
internal fun PlayerActivity.showV2112OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112oriented
    FeaturePrefsStore.batch2111.v2112oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2112: originated mode
internal fun PlayerActivity.showV2112OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112originated
    FeaturePrefsStore.batch2111.v2112originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2112: outperformed mode
internal fun PlayerActivity.showV2112OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2112outperformed
    FeaturePrefsStore.batch2111.v2112outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2113: objected mode
internal fun PlayerActivity.showV2113ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113objected
    FeaturePrefsStore.batch2111.v2113objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2113: obliged mode
internal fun PlayerActivity.showV2113ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113obliged
    FeaturePrefsStore.batch2111.v2113obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2113: observed mode
internal fun PlayerActivity.showV2113ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113observed
    FeaturePrefsStore.batch2111.v2113observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2113: obtained mode
internal fun PlayerActivity.showV2113ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113obtained
    FeaturePrefsStore.batch2111.v2113obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2113: occupied mode
internal fun PlayerActivity.showV2113OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113occupied
    FeaturePrefsStore.batch2111.v2113occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2113: occurred level
internal fun PlayerActivity.showV2113OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2113occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2113occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2113: offered level
internal fun PlayerActivity.showV2113OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2113offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2113offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2113: operated level
internal fun PlayerActivity.showV2113OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2113operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2113operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2113: opposed level
internal fun PlayerActivity.showV2113OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2113opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2113opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2113: optimized level
internal fun PlayerActivity.showV2113OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2113optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2113optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2113: ordered mode
internal fun PlayerActivity.showV2113OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113ordered
    FeaturePrefsStore.batch2111.v2113ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2113: organized mode
internal fun PlayerActivity.showV2113OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113organized
    FeaturePrefsStore.batch2111.v2113organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2113: oriented mode
internal fun PlayerActivity.showV2113OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113oriented
    FeaturePrefsStore.batch2111.v2113oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2113: originated mode
internal fun PlayerActivity.showV2113OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113originated
    FeaturePrefsStore.batch2111.v2113originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2113: outperformed mode
internal fun PlayerActivity.showV2113OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2113outperformed
    FeaturePrefsStore.batch2111.v2113outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2114: objected mode
internal fun PlayerActivity.showV2114ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114objected
    FeaturePrefsStore.batch2111.v2114objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2114: obliged mode
internal fun PlayerActivity.showV2114ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114obliged
    FeaturePrefsStore.batch2111.v2114obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2114: observed mode
internal fun PlayerActivity.showV2114ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114observed
    FeaturePrefsStore.batch2111.v2114observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2114: obtained mode
internal fun PlayerActivity.showV2114ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114obtained
    FeaturePrefsStore.batch2111.v2114obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2114: occupied mode
internal fun PlayerActivity.showV2114OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114occupied
    FeaturePrefsStore.batch2111.v2114occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2114: occurred level
internal fun PlayerActivity.showV2114OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2114occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2114occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2114: offered level
internal fun PlayerActivity.showV2114OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2114offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2114offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2114: operated level
internal fun PlayerActivity.showV2114OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2114operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2114operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2114: opposed level
internal fun PlayerActivity.showV2114OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2114opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2114opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2114: optimized level
internal fun PlayerActivity.showV2114OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2114optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2114optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2114: ordered mode
internal fun PlayerActivity.showV2114OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114ordered
    FeaturePrefsStore.batch2111.v2114ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2114: organized mode
internal fun PlayerActivity.showV2114OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114organized
    FeaturePrefsStore.batch2111.v2114organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2114: oriented mode
internal fun PlayerActivity.showV2114OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114oriented
    FeaturePrefsStore.batch2111.v2114oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2114: originated mode
internal fun PlayerActivity.showV2114OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114originated
    FeaturePrefsStore.batch2111.v2114originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2114: outperformed mode
internal fun PlayerActivity.showV2114OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2114outperformed
    FeaturePrefsStore.batch2111.v2114outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2115: objected mode
internal fun PlayerActivity.showV2115ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115objected
    FeaturePrefsStore.batch2111.v2115objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2115: obliged mode
internal fun PlayerActivity.showV2115ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115obliged
    FeaturePrefsStore.batch2111.v2115obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2115: observed mode
internal fun PlayerActivity.showV2115ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115observed
    FeaturePrefsStore.batch2111.v2115observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2115: obtained mode
internal fun PlayerActivity.showV2115ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115obtained
    FeaturePrefsStore.batch2111.v2115obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2115: occupied mode
internal fun PlayerActivity.showV2115OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115occupied
    FeaturePrefsStore.batch2111.v2115occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2115: occurred level
internal fun PlayerActivity.showV2115OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2115occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2115occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2115: offered level
internal fun PlayerActivity.showV2115OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2115offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2115offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2115: operated level
internal fun PlayerActivity.showV2115OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2115operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2115operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2115: opposed level
internal fun PlayerActivity.showV2115OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2115opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2115opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2115: optimized level
internal fun PlayerActivity.showV2115OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2115optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2115optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2115: ordered mode
internal fun PlayerActivity.showV2115OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115ordered
    FeaturePrefsStore.batch2111.v2115ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2115: organized mode
internal fun PlayerActivity.showV2115OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115organized
    FeaturePrefsStore.batch2111.v2115organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2115: oriented mode
internal fun PlayerActivity.showV2115OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115oriented
    FeaturePrefsStore.batch2111.v2115oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2115: originated mode
internal fun PlayerActivity.showV2115OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115originated
    FeaturePrefsStore.batch2111.v2115originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2115: outperformed mode
internal fun PlayerActivity.showV2115OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2115outperformed
    FeaturePrefsStore.batch2111.v2115outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2116: objected mode
internal fun PlayerActivity.showV2116ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116objected
    FeaturePrefsStore.batch2111.v2116objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2116: obliged mode
internal fun PlayerActivity.showV2116ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116obliged
    FeaturePrefsStore.batch2111.v2116obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2116: observed mode
internal fun PlayerActivity.showV2116ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116observed
    FeaturePrefsStore.batch2111.v2116observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2116: obtained mode
internal fun PlayerActivity.showV2116ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116obtained
    FeaturePrefsStore.batch2111.v2116obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2116: occupied mode
internal fun PlayerActivity.showV2116OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116occupied
    FeaturePrefsStore.batch2111.v2116occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2116: occurred level
internal fun PlayerActivity.showV2116OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2116occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2116occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2116: offered level
internal fun PlayerActivity.showV2116OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2116offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2116offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2116: operated level
internal fun PlayerActivity.showV2116OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2116operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2116operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2116: opposed level
internal fun PlayerActivity.showV2116OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2116opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2116opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2116: optimized level
internal fun PlayerActivity.showV2116OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2116optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2116optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2116: ordered mode
internal fun PlayerActivity.showV2116OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116ordered
    FeaturePrefsStore.batch2111.v2116ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2116: organized mode
internal fun PlayerActivity.showV2116OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116organized
    FeaturePrefsStore.batch2111.v2116organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2116: oriented mode
internal fun PlayerActivity.showV2116OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116oriented
    FeaturePrefsStore.batch2111.v2116oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2116: originated mode
internal fun PlayerActivity.showV2116OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116originated
    FeaturePrefsStore.batch2111.v2116originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2116: outperformed mode
internal fun PlayerActivity.showV2116OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2116outperformed
    FeaturePrefsStore.batch2111.v2116outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2117: objected mode
internal fun PlayerActivity.showV2117ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117objected
    FeaturePrefsStore.batch2111.v2117objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2117: obliged mode
internal fun PlayerActivity.showV2117ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117obliged
    FeaturePrefsStore.batch2111.v2117obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2117: observed mode
internal fun PlayerActivity.showV2117ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117observed
    FeaturePrefsStore.batch2111.v2117observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2117: obtained mode
internal fun PlayerActivity.showV2117ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117obtained
    FeaturePrefsStore.batch2111.v2117obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2117: occupied mode
internal fun PlayerActivity.showV2117OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117occupied
    FeaturePrefsStore.batch2111.v2117occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2117: occurred level
internal fun PlayerActivity.showV2117OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2117occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2117occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2117: offered level
internal fun PlayerActivity.showV2117OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2117offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2117offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2117: operated level
internal fun PlayerActivity.showV2117OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2117operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2117operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2117: opposed level
internal fun PlayerActivity.showV2117OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2117opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2117opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2117: optimized level
internal fun PlayerActivity.showV2117OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2117optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2117optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2117: ordered mode
internal fun PlayerActivity.showV2117OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117ordered
    FeaturePrefsStore.batch2111.v2117ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2117: organized mode
internal fun PlayerActivity.showV2117OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117organized
    FeaturePrefsStore.batch2111.v2117organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2117: oriented mode
internal fun PlayerActivity.showV2117OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117oriented
    FeaturePrefsStore.batch2111.v2117oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2117: originated mode
internal fun PlayerActivity.showV2117OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117originated
    FeaturePrefsStore.batch2111.v2117originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2117: outperformed mode
internal fun PlayerActivity.showV2117OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2117outperformed
    FeaturePrefsStore.batch2111.v2117outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2118: objected mode
internal fun PlayerActivity.showV2118ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118objected
    FeaturePrefsStore.batch2111.v2118objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2118: obliged mode
internal fun PlayerActivity.showV2118ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118obliged
    FeaturePrefsStore.batch2111.v2118obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2118: observed mode
internal fun PlayerActivity.showV2118ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118observed
    FeaturePrefsStore.batch2111.v2118observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2118: obtained mode
internal fun PlayerActivity.showV2118ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118obtained
    FeaturePrefsStore.batch2111.v2118obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2118: occupied mode
internal fun PlayerActivity.showV2118OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118occupied
    FeaturePrefsStore.batch2111.v2118occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2118: occurred level
internal fun PlayerActivity.showV2118OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2118occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2118occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2118: offered level
internal fun PlayerActivity.showV2118OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2118offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2118offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2118: operated level
internal fun PlayerActivity.showV2118OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2118operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2118operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2118: opposed level
internal fun PlayerActivity.showV2118OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2118opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2118opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2118: optimized level
internal fun PlayerActivity.showV2118OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2118optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2118optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2118: ordered mode
internal fun PlayerActivity.showV2118OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118ordered
    FeaturePrefsStore.batch2111.v2118ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2118: organized mode
internal fun PlayerActivity.showV2118OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118organized
    FeaturePrefsStore.batch2111.v2118organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2118: oriented mode
internal fun PlayerActivity.showV2118OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118oriented
    FeaturePrefsStore.batch2111.v2118oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2118: originated mode
internal fun PlayerActivity.showV2118OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118originated
    FeaturePrefsStore.batch2111.v2118originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2118: outperformed mode
internal fun PlayerActivity.showV2118OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2118outperformed
    FeaturePrefsStore.batch2111.v2118outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2119: objected mode
internal fun PlayerActivity.showV2119ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119objected
    FeaturePrefsStore.batch2111.v2119objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2119: obliged mode
internal fun PlayerActivity.showV2119ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119obliged
    FeaturePrefsStore.batch2111.v2119obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2119: observed mode
internal fun PlayerActivity.showV2119ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119observed
    FeaturePrefsStore.batch2111.v2119observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2119: obtained mode
internal fun PlayerActivity.showV2119ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119obtained
    FeaturePrefsStore.batch2111.v2119obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2119: occupied mode
internal fun PlayerActivity.showV2119OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119occupied
    FeaturePrefsStore.batch2111.v2119occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2119: occurred level
internal fun PlayerActivity.showV2119OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2119occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2119occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2119: offered level
internal fun PlayerActivity.showV2119OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2119offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2119offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2119: operated level
internal fun PlayerActivity.showV2119OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2119operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2119operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2119: opposed level
internal fun PlayerActivity.showV2119OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2119opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2119opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2119: optimized level
internal fun PlayerActivity.showV2119OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2119optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2119optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2119: ordered mode
internal fun PlayerActivity.showV2119OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119ordered
    FeaturePrefsStore.batch2111.v2119ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2119: organized mode
internal fun PlayerActivity.showV2119OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119organized
    FeaturePrefsStore.batch2111.v2119organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2119: oriented mode
internal fun PlayerActivity.showV2119OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119oriented
    FeaturePrefsStore.batch2111.v2119oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2119: originated mode
internal fun PlayerActivity.showV2119OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119originated
    FeaturePrefsStore.batch2111.v2119originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2119: outperformed mode
internal fun PlayerActivity.showV2119OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2119outperformed
    FeaturePrefsStore.batch2111.v2119outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

// v2120: objected mode
internal fun PlayerActivity.showV2120ObjectedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120objected
    FeaturePrefsStore.batch2111.v2120objected = !current
    AppToast.show(this, "objected: ${if (!current) "ON" else "OFF"}")
}

// v2120: obliged mode
internal fun PlayerActivity.showV2120ObligedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120obliged
    FeaturePrefsStore.batch2111.v2120obliged = !current
    AppToast.show(this, "obliged: ${if (!current) "ON" else "OFF"}")
}

// v2120: observed mode
internal fun PlayerActivity.showV2120ObservedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120observed
    FeaturePrefsStore.batch2111.v2120observed = !current
    AppToast.show(this, "observed: ${if (!current) "ON" else "OFF"}")
}

// v2120: obtained mode
internal fun PlayerActivity.showV2120ObtainedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120obtained
    FeaturePrefsStore.batch2111.v2120obtained = !current
    AppToast.show(this, "obtained: ${if (!current) "ON" else "OFF"}")
}

// v2120: occupied mode
internal fun PlayerActivity.showV2120OccupiedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120occupied
    FeaturePrefsStore.batch2111.v2120occupied = !current
    AppToast.show(this, "occupied: ${if (!current) "ON" else "OFF"}")
}

// v2120: occurred level
internal fun PlayerActivity.showV2120OccurredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2120occurred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "occurred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2120occurred = value
        AppToast.show(this, "occurred: $value")
    }
}

// v2120: offered level
internal fun PlayerActivity.showV2120OfferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2120offered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "offered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2120offered = value
        AppToast.show(this, "offered: $value")
    }
}

// v2120: operated level
internal fun PlayerActivity.showV2120OperatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2120operated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "operated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2120operated = value
        AppToast.show(this, "operated: $value")
    }
}

// v2120: opposed level
internal fun PlayerActivity.showV2120OpposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2120opposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "opposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2120opposed = value
        AppToast.show(this, "opposed: $value")
    }
}

// v2120: optimized level
internal fun PlayerActivity.showV2120OptimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2111.v2120optimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "optimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2111.v2120optimized = value
        AppToast.show(this, "optimized: $value")
    }
}

// v2120: ordered mode
internal fun PlayerActivity.showV2120OrderedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120ordered
    FeaturePrefsStore.batch2111.v2120ordered = !current
    AppToast.show(this, "ordered: ${if (!current) "ON" else "OFF"}")
}

// v2120: organized mode
internal fun PlayerActivity.showV2120OrganizedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120organized
    FeaturePrefsStore.batch2111.v2120organized = !current
    AppToast.show(this, "organized: ${if (!current) "ON" else "OFF"}")
}

// v2120: oriented mode
internal fun PlayerActivity.showV2120OrientedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120oriented
    FeaturePrefsStore.batch2111.v2120oriented = !current
    AppToast.show(this, "oriented: ${if (!current) "ON" else "OFF"}")
}

// v2120: originated mode
internal fun PlayerActivity.showV2120OriginatedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120originated
    FeaturePrefsStore.batch2111.v2120originated = !current
    AppToast.show(this, "originated: ${if (!current) "ON" else "OFF"}")
}

// v2120: outperformed mode
internal fun PlayerActivity.showV2120OutperformedToggle() {
    val current = FeaturePrefsStore.batch2111.v2120outperformed
    FeaturePrefsStore.batch2111.v2120outperformed = !current
    AppToast.show(this, "outperformed: ${if (!current) "ON" else "OFF"}")
}

