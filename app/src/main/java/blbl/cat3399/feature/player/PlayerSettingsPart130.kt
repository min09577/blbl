package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1481: furnace mode
internal fun PlayerActivity.showV1481FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1481furnace
    FeaturePrefsStore.batch1481.v1481furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1481: fury mode
internal fun PlayerActivity.showV1481FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1481fury
    FeaturePrefsStore.batch1481.v1481fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1481: future mode
internal fun PlayerActivity.showV1481FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1481future
    FeaturePrefsStore.batch1481.v1481future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1481: gallery mode
internal fun PlayerActivity.showV1481GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1481gallery
    FeaturePrefsStore.batch1481.v1481gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1481: game mode
internal fun PlayerActivity.showV1481GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1481game
    FeaturePrefsStore.batch1481.v1481game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1481: gang level
internal fun PlayerActivity.showV1481GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1481gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1481gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1481: garage level
internal fun PlayerActivity.showV1481GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1481garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1481garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1481: garden level
internal fun PlayerActivity.showV1481GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1481garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1481garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1481: garlic level
internal fun PlayerActivity.showV1481GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1481garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1481garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1481: gas level
internal fun PlayerActivity.showV1481GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1481gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1481gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1481: gather mode
internal fun PlayerActivity.showV1481GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1481gather
    FeaturePrefsStore.batch1481.v1481gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1481: gauge mode
internal fun PlayerActivity.showV1481GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1481gauge
    FeaturePrefsStore.batch1481.v1481gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1481: gaze mode
internal fun PlayerActivity.showV1481GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1481gaze
    FeaturePrefsStore.batch1481.v1481gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1481: gear mode
internal fun PlayerActivity.showV1481GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1481gear
    FeaturePrefsStore.batch1481.v1481gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1481: genius mode
internal fun PlayerActivity.showV1481GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1481genius
    FeaturePrefsStore.batch1481.v1481genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1482: furnace mode
internal fun PlayerActivity.showV1482FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1482furnace
    FeaturePrefsStore.batch1481.v1482furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1482: fury mode
internal fun PlayerActivity.showV1482FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1482fury
    FeaturePrefsStore.batch1481.v1482fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1482: future mode
internal fun PlayerActivity.showV1482FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1482future
    FeaturePrefsStore.batch1481.v1482future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1482: gallery mode
internal fun PlayerActivity.showV1482GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1482gallery
    FeaturePrefsStore.batch1481.v1482gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1482: game mode
internal fun PlayerActivity.showV1482GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1482game
    FeaturePrefsStore.batch1481.v1482game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1482: gang level
internal fun PlayerActivity.showV1482GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1482gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1482gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1482: garage level
internal fun PlayerActivity.showV1482GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1482garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1482garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1482: garden level
internal fun PlayerActivity.showV1482GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1482garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1482garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1482: garlic level
internal fun PlayerActivity.showV1482GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1482garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1482garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1482: gas level
internal fun PlayerActivity.showV1482GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1482gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1482gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1482: gather mode
internal fun PlayerActivity.showV1482GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1482gather
    FeaturePrefsStore.batch1481.v1482gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1482: gauge mode
internal fun PlayerActivity.showV1482GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1482gauge
    FeaturePrefsStore.batch1481.v1482gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1482: gaze mode
internal fun PlayerActivity.showV1482GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1482gaze
    FeaturePrefsStore.batch1481.v1482gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1482: gear mode
internal fun PlayerActivity.showV1482GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1482gear
    FeaturePrefsStore.batch1481.v1482gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1482: genius mode
internal fun PlayerActivity.showV1482GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1482genius
    FeaturePrefsStore.batch1481.v1482genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1483: furnace mode
internal fun PlayerActivity.showV1483FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1483furnace
    FeaturePrefsStore.batch1481.v1483furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1483: fury mode
internal fun PlayerActivity.showV1483FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1483fury
    FeaturePrefsStore.batch1481.v1483fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1483: future mode
internal fun PlayerActivity.showV1483FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1483future
    FeaturePrefsStore.batch1481.v1483future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1483: gallery mode
internal fun PlayerActivity.showV1483GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1483gallery
    FeaturePrefsStore.batch1481.v1483gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1483: game mode
internal fun PlayerActivity.showV1483GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1483game
    FeaturePrefsStore.batch1481.v1483game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1483: gang level
internal fun PlayerActivity.showV1483GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1483gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1483gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1483: garage level
internal fun PlayerActivity.showV1483GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1483garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1483garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1483: garden level
internal fun PlayerActivity.showV1483GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1483garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1483garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1483: garlic level
internal fun PlayerActivity.showV1483GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1483garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1483garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1483: gas level
internal fun PlayerActivity.showV1483GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1483gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1483gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1483: gather mode
internal fun PlayerActivity.showV1483GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1483gather
    FeaturePrefsStore.batch1481.v1483gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1483: gauge mode
internal fun PlayerActivity.showV1483GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1483gauge
    FeaturePrefsStore.batch1481.v1483gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1483: gaze mode
internal fun PlayerActivity.showV1483GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1483gaze
    FeaturePrefsStore.batch1481.v1483gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1483: gear mode
internal fun PlayerActivity.showV1483GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1483gear
    FeaturePrefsStore.batch1481.v1483gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1483: genius mode
internal fun PlayerActivity.showV1483GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1483genius
    FeaturePrefsStore.batch1481.v1483genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1484: furnace mode
internal fun PlayerActivity.showV1484FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1484furnace
    FeaturePrefsStore.batch1481.v1484furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1484: fury mode
internal fun PlayerActivity.showV1484FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1484fury
    FeaturePrefsStore.batch1481.v1484fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1484: future mode
internal fun PlayerActivity.showV1484FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1484future
    FeaturePrefsStore.batch1481.v1484future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1484: gallery mode
internal fun PlayerActivity.showV1484GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1484gallery
    FeaturePrefsStore.batch1481.v1484gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1484: game mode
internal fun PlayerActivity.showV1484GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1484game
    FeaturePrefsStore.batch1481.v1484game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1484: gang level
internal fun PlayerActivity.showV1484GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1484gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1484gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1484: garage level
internal fun PlayerActivity.showV1484GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1484garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1484garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1484: garden level
internal fun PlayerActivity.showV1484GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1484garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1484garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1484: garlic level
internal fun PlayerActivity.showV1484GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1484garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1484garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1484: gas level
internal fun PlayerActivity.showV1484GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1484gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1484gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1484: gather mode
internal fun PlayerActivity.showV1484GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1484gather
    FeaturePrefsStore.batch1481.v1484gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1484: gauge mode
internal fun PlayerActivity.showV1484GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1484gauge
    FeaturePrefsStore.batch1481.v1484gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1484: gaze mode
internal fun PlayerActivity.showV1484GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1484gaze
    FeaturePrefsStore.batch1481.v1484gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1484: gear mode
internal fun PlayerActivity.showV1484GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1484gear
    FeaturePrefsStore.batch1481.v1484gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1484: genius mode
internal fun PlayerActivity.showV1484GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1484genius
    FeaturePrefsStore.batch1481.v1484genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1485: furnace mode
internal fun PlayerActivity.showV1485FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1485furnace
    FeaturePrefsStore.batch1481.v1485furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1485: fury mode
internal fun PlayerActivity.showV1485FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1485fury
    FeaturePrefsStore.batch1481.v1485fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1485: future mode
internal fun PlayerActivity.showV1485FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1485future
    FeaturePrefsStore.batch1481.v1485future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1485: gallery mode
internal fun PlayerActivity.showV1485GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1485gallery
    FeaturePrefsStore.batch1481.v1485gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1485: game mode
internal fun PlayerActivity.showV1485GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1485game
    FeaturePrefsStore.batch1481.v1485game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1485: gang level
internal fun PlayerActivity.showV1485GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1485gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1485gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1485: garage level
internal fun PlayerActivity.showV1485GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1485garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1485garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1485: garden level
internal fun PlayerActivity.showV1485GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1485garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1485garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1485: garlic level
internal fun PlayerActivity.showV1485GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1485garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1485garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1485: gas level
internal fun PlayerActivity.showV1485GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1485gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1485gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1485: gather mode
internal fun PlayerActivity.showV1485GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1485gather
    FeaturePrefsStore.batch1481.v1485gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1485: gauge mode
internal fun PlayerActivity.showV1485GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1485gauge
    FeaturePrefsStore.batch1481.v1485gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1485: gaze mode
internal fun PlayerActivity.showV1485GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1485gaze
    FeaturePrefsStore.batch1481.v1485gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1485: gear mode
internal fun PlayerActivity.showV1485GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1485gear
    FeaturePrefsStore.batch1481.v1485gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1485: genius mode
internal fun PlayerActivity.showV1485GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1485genius
    FeaturePrefsStore.batch1481.v1485genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1486: furnace mode
internal fun PlayerActivity.showV1486FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1486furnace
    FeaturePrefsStore.batch1481.v1486furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1486: fury mode
internal fun PlayerActivity.showV1486FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1486fury
    FeaturePrefsStore.batch1481.v1486fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1486: future mode
internal fun PlayerActivity.showV1486FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1486future
    FeaturePrefsStore.batch1481.v1486future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1486: gallery mode
internal fun PlayerActivity.showV1486GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1486gallery
    FeaturePrefsStore.batch1481.v1486gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1486: game mode
internal fun PlayerActivity.showV1486GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1486game
    FeaturePrefsStore.batch1481.v1486game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1486: gang level
internal fun PlayerActivity.showV1486GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1486gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1486gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1486: garage level
internal fun PlayerActivity.showV1486GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1486garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1486garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1486: garden level
internal fun PlayerActivity.showV1486GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1486garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1486garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1486: garlic level
internal fun PlayerActivity.showV1486GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1486garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1486garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1486: gas level
internal fun PlayerActivity.showV1486GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1486gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1486gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1486: gather mode
internal fun PlayerActivity.showV1486GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1486gather
    FeaturePrefsStore.batch1481.v1486gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1486: gauge mode
internal fun PlayerActivity.showV1486GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1486gauge
    FeaturePrefsStore.batch1481.v1486gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1486: gaze mode
internal fun PlayerActivity.showV1486GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1486gaze
    FeaturePrefsStore.batch1481.v1486gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1486: gear mode
internal fun PlayerActivity.showV1486GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1486gear
    FeaturePrefsStore.batch1481.v1486gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1486: genius mode
internal fun PlayerActivity.showV1486GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1486genius
    FeaturePrefsStore.batch1481.v1486genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1487: furnace mode
internal fun PlayerActivity.showV1487FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1487furnace
    FeaturePrefsStore.batch1481.v1487furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1487: fury mode
internal fun PlayerActivity.showV1487FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1487fury
    FeaturePrefsStore.batch1481.v1487fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1487: future mode
internal fun PlayerActivity.showV1487FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1487future
    FeaturePrefsStore.batch1481.v1487future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1487: gallery mode
internal fun PlayerActivity.showV1487GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1487gallery
    FeaturePrefsStore.batch1481.v1487gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1487: game mode
internal fun PlayerActivity.showV1487GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1487game
    FeaturePrefsStore.batch1481.v1487game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1487: gang level
internal fun PlayerActivity.showV1487GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1487gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1487gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1487: garage level
internal fun PlayerActivity.showV1487GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1487garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1487garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1487: garden level
internal fun PlayerActivity.showV1487GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1487garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1487garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1487: garlic level
internal fun PlayerActivity.showV1487GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1487garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1487garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1487: gas level
internal fun PlayerActivity.showV1487GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1487gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1487gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1487: gather mode
internal fun PlayerActivity.showV1487GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1487gather
    FeaturePrefsStore.batch1481.v1487gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1487: gauge mode
internal fun PlayerActivity.showV1487GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1487gauge
    FeaturePrefsStore.batch1481.v1487gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1487: gaze mode
internal fun PlayerActivity.showV1487GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1487gaze
    FeaturePrefsStore.batch1481.v1487gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1487: gear mode
internal fun PlayerActivity.showV1487GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1487gear
    FeaturePrefsStore.batch1481.v1487gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1487: genius mode
internal fun PlayerActivity.showV1487GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1487genius
    FeaturePrefsStore.batch1481.v1487genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1488: furnace mode
internal fun PlayerActivity.showV1488FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1488furnace
    FeaturePrefsStore.batch1481.v1488furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1488: fury mode
internal fun PlayerActivity.showV1488FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1488fury
    FeaturePrefsStore.batch1481.v1488fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1488: future mode
internal fun PlayerActivity.showV1488FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1488future
    FeaturePrefsStore.batch1481.v1488future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1488: gallery mode
internal fun PlayerActivity.showV1488GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1488gallery
    FeaturePrefsStore.batch1481.v1488gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1488: game mode
internal fun PlayerActivity.showV1488GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1488game
    FeaturePrefsStore.batch1481.v1488game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1488: gang level
internal fun PlayerActivity.showV1488GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1488gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1488gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1488: garage level
internal fun PlayerActivity.showV1488GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1488garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1488garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1488: garden level
internal fun PlayerActivity.showV1488GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1488garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1488garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1488: garlic level
internal fun PlayerActivity.showV1488GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1488garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1488garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1488: gas level
internal fun PlayerActivity.showV1488GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1488gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1488gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1488: gather mode
internal fun PlayerActivity.showV1488GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1488gather
    FeaturePrefsStore.batch1481.v1488gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1488: gauge mode
internal fun PlayerActivity.showV1488GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1488gauge
    FeaturePrefsStore.batch1481.v1488gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1488: gaze mode
internal fun PlayerActivity.showV1488GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1488gaze
    FeaturePrefsStore.batch1481.v1488gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1488: gear mode
internal fun PlayerActivity.showV1488GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1488gear
    FeaturePrefsStore.batch1481.v1488gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1488: genius mode
internal fun PlayerActivity.showV1488GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1488genius
    FeaturePrefsStore.batch1481.v1488genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1489: furnace mode
internal fun PlayerActivity.showV1489FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1489furnace
    FeaturePrefsStore.batch1481.v1489furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1489: fury mode
internal fun PlayerActivity.showV1489FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1489fury
    FeaturePrefsStore.batch1481.v1489fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1489: future mode
internal fun PlayerActivity.showV1489FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1489future
    FeaturePrefsStore.batch1481.v1489future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1489: gallery mode
internal fun PlayerActivity.showV1489GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1489gallery
    FeaturePrefsStore.batch1481.v1489gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1489: game mode
internal fun PlayerActivity.showV1489GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1489game
    FeaturePrefsStore.batch1481.v1489game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1489: gang level
internal fun PlayerActivity.showV1489GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1489gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1489gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1489: garage level
internal fun PlayerActivity.showV1489GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1489garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1489garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1489: garden level
internal fun PlayerActivity.showV1489GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1489garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1489garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1489: garlic level
internal fun PlayerActivity.showV1489GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1489garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1489garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1489: gas level
internal fun PlayerActivity.showV1489GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1489gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1489gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1489: gather mode
internal fun PlayerActivity.showV1489GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1489gather
    FeaturePrefsStore.batch1481.v1489gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1489: gauge mode
internal fun PlayerActivity.showV1489GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1489gauge
    FeaturePrefsStore.batch1481.v1489gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1489: gaze mode
internal fun PlayerActivity.showV1489GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1489gaze
    FeaturePrefsStore.batch1481.v1489gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1489: gear mode
internal fun PlayerActivity.showV1489GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1489gear
    FeaturePrefsStore.batch1481.v1489gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1489: genius mode
internal fun PlayerActivity.showV1489GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1489genius
    FeaturePrefsStore.batch1481.v1489genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

// v1490: furnace mode
internal fun PlayerActivity.showV1490FurnaceToggle() {
    val current = FeaturePrefsStore.batch1481.v1490furnace
    FeaturePrefsStore.batch1481.v1490furnace = !current
    AppToast.show(this, "furnace: ${if (!current) "ON" else "OFF"}")
}

// v1490: fury mode
internal fun PlayerActivity.showV1490FuryToggle() {
    val current = FeaturePrefsStore.batch1481.v1490fury
    FeaturePrefsStore.batch1481.v1490fury = !current
    AppToast.show(this, "fury: ${if (!current) "ON" else "OFF"}")
}

// v1490: future mode
internal fun PlayerActivity.showV1490FutureToggle() {
    val current = FeaturePrefsStore.batch1481.v1490future
    FeaturePrefsStore.batch1481.v1490future = !current
    AppToast.show(this, "future: ${if (!current) "ON" else "OFF"}")
}

// v1490: gallery mode
internal fun PlayerActivity.showV1490GalleryToggle() {
    val current = FeaturePrefsStore.batch1481.v1490gallery
    FeaturePrefsStore.batch1481.v1490gallery = !current
    AppToast.show(this, "gallery: ${if (!current) "ON" else "OFF"}")
}

// v1490: game mode
internal fun PlayerActivity.showV1490GameToggle() {
    val current = FeaturePrefsStore.batch1481.v1490game
    FeaturePrefsStore.batch1481.v1490game = !current
    AppToast.show(this, "game: ${if (!current) "ON" else "OFF"}")
}

// v1490: gang level
internal fun PlayerActivity.showV1490GangDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1490gang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gang level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1490gang = value
        AppToast.show(this, "gang: $value")
    }
}

// v1490: garage level
internal fun PlayerActivity.showV1490GarageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1490garage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1490garage = value
        AppToast.show(this, "garage: $value")
    }
}

// v1490: garden level
internal fun PlayerActivity.showV1490GardenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1490garden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garden level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1490garden = value
        AppToast.show(this, "garden: $value")
    }
}

// v1490: garlic level
internal fun PlayerActivity.showV1490GarlicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1490garlic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "garlic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1490garlic = value
        AppToast.show(this, "garlic: $value")
    }
}

// v1490: gas level
internal fun PlayerActivity.showV1490GasDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1481.v1490gas).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gas level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1481.v1490gas = value
        AppToast.show(this, "gas: $value")
    }
}

// v1490: gather mode
internal fun PlayerActivity.showV1490GatherToggle() {
    val current = FeaturePrefsStore.batch1481.v1490gather
    FeaturePrefsStore.batch1481.v1490gather = !current
    AppToast.show(this, "gather: ${if (!current) "ON" else "OFF"}")
}

// v1490: gauge mode
internal fun PlayerActivity.showV1490GaugeToggle() {
    val current = FeaturePrefsStore.batch1481.v1490gauge
    FeaturePrefsStore.batch1481.v1490gauge = !current
    AppToast.show(this, "gauge: ${if (!current) "ON" else "OFF"}")
}

// v1490: gaze mode
internal fun PlayerActivity.showV1490GazeToggle() {
    val current = FeaturePrefsStore.batch1481.v1490gaze
    FeaturePrefsStore.batch1481.v1490gaze = !current
    AppToast.show(this, "gaze: ${if (!current) "ON" else "OFF"}")
}

// v1490: gear mode
internal fun PlayerActivity.showV1490GearToggle() {
    val current = FeaturePrefsStore.batch1481.v1490gear
    FeaturePrefsStore.batch1481.v1490gear = !current
    AppToast.show(this, "gear: ${if (!current) "ON" else "OFF"}")
}

// v1490: genius mode
internal fun PlayerActivity.showV1490GeniusToggle() {
    val current = FeaturePrefsStore.batch1481.v1490genius
    FeaturePrefsStore.batch1481.v1490genius = !current
    AppToast.show(this, "genius: ${if (!current) "ON" else "OFF"}")
}

