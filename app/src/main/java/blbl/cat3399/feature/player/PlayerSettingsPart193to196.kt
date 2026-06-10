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

// v2141: populated mode
internal fun PlayerActivity.showV2141PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141populated
    FeaturePrefsStore.batch2141.v2141populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2141: posed mode
internal fun PlayerActivity.showV2141PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141posed
    FeaturePrefsStore.batch2141.v2141posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2141: positioned mode
internal fun PlayerActivity.showV2141PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141positioned
    FeaturePrefsStore.batch2141.v2141positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2141: possessed mode
internal fun PlayerActivity.showV2141PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141possessed
    FeaturePrefsStore.batch2141.v2141possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2141: posted mode
internal fun PlayerActivity.showV2141PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141posted
    FeaturePrefsStore.batch2141.v2141posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2141: potentiated level
internal fun PlayerActivity.showV2141PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2141: powered level
internal fun PlayerActivity.showV2141PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2141: practiced level
internal fun PlayerActivity.showV2141PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2141: praised level
internal fun PlayerActivity.showV2141PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2141: predicted level
internal fun PlayerActivity.showV2141PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2141: preferred mode
internal fun PlayerActivity.showV2141PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2141preferred
    FeaturePrefsStore.batch2141.v2141preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2141: prepared mode
internal fun PlayerActivity.showV2141PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141prepared
    FeaturePrefsStore.batch2141.v2141prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2141: prescribed mode
internal fun PlayerActivity.showV2141PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141prescribed
    FeaturePrefsStore.batch2141.v2141prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2141: presented mode
internal fun PlayerActivity.showV2141PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141presented
    FeaturePrefsStore.batch2141.v2141presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2141: preserved mode
internal fun PlayerActivity.showV2141PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141preserved
    FeaturePrefsStore.batch2141.v2141preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2142: populated mode
internal fun PlayerActivity.showV2142PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142populated
    FeaturePrefsStore.batch2141.v2142populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2142: posed mode
internal fun PlayerActivity.showV2142PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142posed
    FeaturePrefsStore.batch2141.v2142posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2142: positioned mode
internal fun PlayerActivity.showV2142PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142positioned
    FeaturePrefsStore.batch2141.v2142positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2142: possessed mode
internal fun PlayerActivity.showV2142PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142possessed
    FeaturePrefsStore.batch2141.v2142possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2142: posted mode
internal fun PlayerActivity.showV2142PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142posted
    FeaturePrefsStore.batch2141.v2142posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2142: potentiated level
internal fun PlayerActivity.showV2142PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2142: powered level
internal fun PlayerActivity.showV2142PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2142: practiced level
internal fun PlayerActivity.showV2142PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2142: praised level
internal fun PlayerActivity.showV2142PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2142: predicted level
internal fun PlayerActivity.showV2142PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2142: preferred mode
internal fun PlayerActivity.showV2142PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2142preferred
    FeaturePrefsStore.batch2141.v2142preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2142: prepared mode
internal fun PlayerActivity.showV2142PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142prepared
    FeaturePrefsStore.batch2141.v2142prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2142: prescribed mode
internal fun PlayerActivity.showV2142PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142prescribed
    FeaturePrefsStore.batch2141.v2142prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2142: presented mode
internal fun PlayerActivity.showV2142PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142presented
    FeaturePrefsStore.batch2141.v2142presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2142: preserved mode
internal fun PlayerActivity.showV2142PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142preserved
    FeaturePrefsStore.batch2141.v2142preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2143: populated mode
internal fun PlayerActivity.showV2143PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143populated
    FeaturePrefsStore.batch2141.v2143populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2143: posed mode
internal fun PlayerActivity.showV2143PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143posed
    FeaturePrefsStore.batch2141.v2143posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2143: positioned mode
internal fun PlayerActivity.showV2143PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143positioned
    FeaturePrefsStore.batch2141.v2143positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2143: possessed mode
internal fun PlayerActivity.showV2143PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143possessed
    FeaturePrefsStore.batch2141.v2143possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2143: posted mode
internal fun PlayerActivity.showV2143PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143posted
    FeaturePrefsStore.batch2141.v2143posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2143: potentiated level
internal fun PlayerActivity.showV2143PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2143: powered level
internal fun PlayerActivity.showV2143PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2143: practiced level
internal fun PlayerActivity.showV2143PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2143: praised level
internal fun PlayerActivity.showV2143PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2143: predicted level
internal fun PlayerActivity.showV2143PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2143: preferred mode
internal fun PlayerActivity.showV2143PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2143preferred
    FeaturePrefsStore.batch2141.v2143preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2143: prepared mode
internal fun PlayerActivity.showV2143PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143prepared
    FeaturePrefsStore.batch2141.v2143prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2143: prescribed mode
internal fun PlayerActivity.showV2143PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143prescribed
    FeaturePrefsStore.batch2141.v2143prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2143: presented mode
internal fun PlayerActivity.showV2143PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143presented
    FeaturePrefsStore.batch2141.v2143presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2143: preserved mode
internal fun PlayerActivity.showV2143PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143preserved
    FeaturePrefsStore.batch2141.v2143preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2144: populated mode
internal fun PlayerActivity.showV2144PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144populated
    FeaturePrefsStore.batch2141.v2144populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2144: posed mode
internal fun PlayerActivity.showV2144PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144posed
    FeaturePrefsStore.batch2141.v2144posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2144: positioned mode
internal fun PlayerActivity.showV2144PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144positioned
    FeaturePrefsStore.batch2141.v2144positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2144: possessed mode
internal fun PlayerActivity.showV2144PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144possessed
    FeaturePrefsStore.batch2141.v2144possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2144: posted mode
internal fun PlayerActivity.showV2144PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144posted
    FeaturePrefsStore.batch2141.v2144posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2144: potentiated level
internal fun PlayerActivity.showV2144PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2144: powered level
internal fun PlayerActivity.showV2144PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2144: practiced level
internal fun PlayerActivity.showV2144PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2144: praised level
internal fun PlayerActivity.showV2144PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2144: predicted level
internal fun PlayerActivity.showV2144PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2144: preferred mode
internal fun PlayerActivity.showV2144PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2144preferred
    FeaturePrefsStore.batch2141.v2144preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2144: prepared mode
internal fun PlayerActivity.showV2144PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144prepared
    FeaturePrefsStore.batch2141.v2144prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2144: prescribed mode
internal fun PlayerActivity.showV2144PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144prescribed
    FeaturePrefsStore.batch2141.v2144prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2144: presented mode
internal fun PlayerActivity.showV2144PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144presented
    FeaturePrefsStore.batch2141.v2144presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2144: preserved mode
internal fun PlayerActivity.showV2144PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144preserved
    FeaturePrefsStore.batch2141.v2144preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2145: populated mode
internal fun PlayerActivity.showV2145PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145populated
    FeaturePrefsStore.batch2141.v2145populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2145: posed mode
internal fun PlayerActivity.showV2145PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145posed
    FeaturePrefsStore.batch2141.v2145posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2145: positioned mode
internal fun PlayerActivity.showV2145PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145positioned
    FeaturePrefsStore.batch2141.v2145positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2145: possessed mode
internal fun PlayerActivity.showV2145PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145possessed
    FeaturePrefsStore.batch2141.v2145possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2145: posted mode
internal fun PlayerActivity.showV2145PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145posted
    FeaturePrefsStore.batch2141.v2145posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2145: potentiated level
internal fun PlayerActivity.showV2145PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2145: powered level
internal fun PlayerActivity.showV2145PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2145: practiced level
internal fun PlayerActivity.showV2145PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2145: praised level
internal fun PlayerActivity.showV2145PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2145: predicted level
internal fun PlayerActivity.showV2145PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2145: preferred mode
internal fun PlayerActivity.showV2145PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2145preferred
    FeaturePrefsStore.batch2141.v2145preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2145: prepared mode
internal fun PlayerActivity.showV2145PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145prepared
    FeaturePrefsStore.batch2141.v2145prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2145: prescribed mode
internal fun PlayerActivity.showV2145PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145prescribed
    FeaturePrefsStore.batch2141.v2145prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2145: presented mode
internal fun PlayerActivity.showV2145PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145presented
    FeaturePrefsStore.batch2141.v2145presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2145: preserved mode
internal fun PlayerActivity.showV2145PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145preserved
    FeaturePrefsStore.batch2141.v2145preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2146: populated mode
internal fun PlayerActivity.showV2146PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146populated
    FeaturePrefsStore.batch2141.v2146populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2146: posed mode
internal fun PlayerActivity.showV2146PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146posed
    FeaturePrefsStore.batch2141.v2146posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2146: positioned mode
internal fun PlayerActivity.showV2146PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146positioned
    FeaturePrefsStore.batch2141.v2146positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2146: possessed mode
internal fun PlayerActivity.showV2146PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146possessed
    FeaturePrefsStore.batch2141.v2146possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2146: posted mode
internal fun PlayerActivity.showV2146PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146posted
    FeaturePrefsStore.batch2141.v2146posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2146: potentiated level
internal fun PlayerActivity.showV2146PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2146: powered level
internal fun PlayerActivity.showV2146PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2146: practiced level
internal fun PlayerActivity.showV2146PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2146: praised level
internal fun PlayerActivity.showV2146PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2146: predicted level
internal fun PlayerActivity.showV2146PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2146: preferred mode
internal fun PlayerActivity.showV2146PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2146preferred
    FeaturePrefsStore.batch2141.v2146preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2146: prepared mode
internal fun PlayerActivity.showV2146PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146prepared
    FeaturePrefsStore.batch2141.v2146prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2146: prescribed mode
internal fun PlayerActivity.showV2146PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146prescribed
    FeaturePrefsStore.batch2141.v2146prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2146: presented mode
internal fun PlayerActivity.showV2146PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146presented
    FeaturePrefsStore.batch2141.v2146presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2146: preserved mode
internal fun PlayerActivity.showV2146PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146preserved
    FeaturePrefsStore.batch2141.v2146preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2147: populated mode
internal fun PlayerActivity.showV2147PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147populated
    FeaturePrefsStore.batch2141.v2147populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2147: posed mode
internal fun PlayerActivity.showV2147PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147posed
    FeaturePrefsStore.batch2141.v2147posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2147: positioned mode
internal fun PlayerActivity.showV2147PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147positioned
    FeaturePrefsStore.batch2141.v2147positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2147: possessed mode
internal fun PlayerActivity.showV2147PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147possessed
    FeaturePrefsStore.batch2141.v2147possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2147: posted mode
internal fun PlayerActivity.showV2147PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147posted
    FeaturePrefsStore.batch2141.v2147posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2147: potentiated level
internal fun PlayerActivity.showV2147PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2147: powered level
internal fun PlayerActivity.showV2147PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2147: practiced level
internal fun PlayerActivity.showV2147PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2147: praised level
internal fun PlayerActivity.showV2147PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2147: predicted level
internal fun PlayerActivity.showV2147PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2147: preferred mode
internal fun PlayerActivity.showV2147PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2147preferred
    FeaturePrefsStore.batch2141.v2147preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2147: prepared mode
internal fun PlayerActivity.showV2147PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147prepared
    FeaturePrefsStore.batch2141.v2147prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2147: prescribed mode
internal fun PlayerActivity.showV2147PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147prescribed
    FeaturePrefsStore.batch2141.v2147prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2147: presented mode
internal fun PlayerActivity.showV2147PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147presented
    FeaturePrefsStore.batch2141.v2147presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2147: preserved mode
internal fun PlayerActivity.showV2147PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147preserved
    FeaturePrefsStore.batch2141.v2147preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2148: populated mode
internal fun PlayerActivity.showV2148PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148populated
    FeaturePrefsStore.batch2141.v2148populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2148: posed mode
internal fun PlayerActivity.showV2148PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148posed
    FeaturePrefsStore.batch2141.v2148posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2148: positioned mode
internal fun PlayerActivity.showV2148PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148positioned
    FeaturePrefsStore.batch2141.v2148positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2148: possessed mode
internal fun PlayerActivity.showV2148PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148possessed
    FeaturePrefsStore.batch2141.v2148possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2148: posted mode
internal fun PlayerActivity.showV2148PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148posted
    FeaturePrefsStore.batch2141.v2148posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2148: potentiated level
internal fun PlayerActivity.showV2148PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2148: powered level
internal fun PlayerActivity.showV2148PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2148: practiced level
internal fun PlayerActivity.showV2148PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2148: praised level
internal fun PlayerActivity.showV2148PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2148: predicted level
internal fun PlayerActivity.showV2148PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2148: preferred mode
internal fun PlayerActivity.showV2148PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2148preferred
    FeaturePrefsStore.batch2141.v2148preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2148: prepared mode
internal fun PlayerActivity.showV2148PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148prepared
    FeaturePrefsStore.batch2141.v2148prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2148: prescribed mode
internal fun PlayerActivity.showV2148PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148prescribed
    FeaturePrefsStore.batch2141.v2148prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2148: presented mode
internal fun PlayerActivity.showV2148PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148presented
    FeaturePrefsStore.batch2141.v2148presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2148: preserved mode
internal fun PlayerActivity.showV2148PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148preserved
    FeaturePrefsStore.batch2141.v2148preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2149: populated mode
internal fun PlayerActivity.showV2149PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149populated
    FeaturePrefsStore.batch2141.v2149populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2149: posed mode
internal fun PlayerActivity.showV2149PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149posed
    FeaturePrefsStore.batch2141.v2149posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2149: positioned mode
internal fun PlayerActivity.showV2149PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149positioned
    FeaturePrefsStore.batch2141.v2149positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2149: possessed mode
internal fun PlayerActivity.showV2149PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149possessed
    FeaturePrefsStore.batch2141.v2149possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2149: posted mode
internal fun PlayerActivity.showV2149PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149posted
    FeaturePrefsStore.batch2141.v2149posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2149: potentiated level
internal fun PlayerActivity.showV2149PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2149: powered level
internal fun PlayerActivity.showV2149PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2149: practiced level
internal fun PlayerActivity.showV2149PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2149: praised level
internal fun PlayerActivity.showV2149PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2149: predicted level
internal fun PlayerActivity.showV2149PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2149: preferred mode
internal fun PlayerActivity.showV2149PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2149preferred
    FeaturePrefsStore.batch2141.v2149preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2149: prepared mode
internal fun PlayerActivity.showV2149PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149prepared
    FeaturePrefsStore.batch2141.v2149prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2149: prescribed mode
internal fun PlayerActivity.showV2149PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149prescribed
    FeaturePrefsStore.batch2141.v2149prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2149: presented mode
internal fun PlayerActivity.showV2149PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149presented
    FeaturePrefsStore.batch2141.v2149presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2149: preserved mode
internal fun PlayerActivity.showV2149PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149preserved
    FeaturePrefsStore.batch2141.v2149preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2150: populated mode
internal fun PlayerActivity.showV2150PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150populated
    FeaturePrefsStore.batch2141.v2150populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2150: posed mode
internal fun PlayerActivity.showV2150PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150posed
    FeaturePrefsStore.batch2141.v2150posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2150: positioned mode
internal fun PlayerActivity.showV2150PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150positioned
    FeaturePrefsStore.batch2141.v2150positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2150: possessed mode
internal fun PlayerActivity.showV2150PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150possessed
    FeaturePrefsStore.batch2141.v2150possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2150: posted mode
internal fun PlayerActivity.showV2150PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150posted
    FeaturePrefsStore.batch2141.v2150posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2150: potentiated level
internal fun PlayerActivity.showV2150PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2150: powered level
internal fun PlayerActivity.showV2150PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2150: practiced level
internal fun PlayerActivity.showV2150PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2150: praised level
internal fun PlayerActivity.showV2150PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2150: predicted level
internal fun PlayerActivity.showV2150PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2150: preferred mode
internal fun PlayerActivity.showV2150PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2150preferred
    FeaturePrefsStore.batch2141.v2150preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2150: prepared mode
internal fun PlayerActivity.showV2150PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150prepared
    FeaturePrefsStore.batch2141.v2150prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2150: prescribed mode
internal fun PlayerActivity.showV2150PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150prescribed
    FeaturePrefsStore.batch2141.v2150prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2150: presented mode
internal fun PlayerActivity.showV2150PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150presented
    FeaturePrefsStore.batch2141.v2150presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2150: preserved mode
internal fun PlayerActivity.showV2150PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150preserved
    FeaturePrefsStore.batch2141.v2150preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}
