package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1461: flavor mode
internal fun PlayerActivity.showV1461FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1461flavor
    FeaturePrefsStore.batch1461.v1461flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1461: flight mode
internal fun PlayerActivity.showV1461FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1461flight
    FeaturePrefsStore.batch1461.v1461flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1461: flock mode
internal fun PlayerActivity.showV1461FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1461flock
    FeaturePrefsStore.batch1461.v1461flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1461: flood mode
internal fun PlayerActivity.showV1461FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1461flood
    FeaturePrefsStore.batch1461.v1461flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1461: floor mode
internal fun PlayerActivity.showV1461FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1461floor
    FeaturePrefsStore.batch1461.v1461floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1461: flour level
internal fun PlayerActivity.showV1461FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1461flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1461flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1461: flower level
internal fun PlayerActivity.showV1461FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1461flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1461flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1461: fluid level
internal fun PlayerActivity.showV1461FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1461fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1461fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1461: fly level
internal fun PlayerActivity.showV1461FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1461fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1461fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1461: foam level
internal fun PlayerActivity.showV1461FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1461foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1461foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1461: folk mode
internal fun PlayerActivity.showV1461FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1461folk
    FeaturePrefsStore.batch1461.v1461folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1461: food mode
internal fun PlayerActivity.showV1461FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1461food
    FeaturePrefsStore.batch1461.v1461food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1461: foot mode
internal fun PlayerActivity.showV1461FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1461foot
    FeaturePrefsStore.batch1461.v1461foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1461: forest mode
internal fun PlayerActivity.showV1461ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1461forest
    FeaturePrefsStore.batch1461.v1461forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1461: forget mode
internal fun PlayerActivity.showV1461ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1461forget
    FeaturePrefsStore.batch1461.v1461forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1462: flavor mode
internal fun PlayerActivity.showV1462FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1462flavor
    FeaturePrefsStore.batch1461.v1462flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1462: flight mode
internal fun PlayerActivity.showV1462FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1462flight
    FeaturePrefsStore.batch1461.v1462flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1462: flock mode
internal fun PlayerActivity.showV1462FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1462flock
    FeaturePrefsStore.batch1461.v1462flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1462: flood mode
internal fun PlayerActivity.showV1462FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1462flood
    FeaturePrefsStore.batch1461.v1462flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1462: floor mode
internal fun PlayerActivity.showV1462FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1462floor
    FeaturePrefsStore.batch1461.v1462floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1462: flour level
internal fun PlayerActivity.showV1462FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1462flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1462flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1462: flower level
internal fun PlayerActivity.showV1462FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1462flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1462flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1462: fluid level
internal fun PlayerActivity.showV1462FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1462fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1462fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1462: fly level
internal fun PlayerActivity.showV1462FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1462fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1462fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1462: foam level
internal fun PlayerActivity.showV1462FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1462foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1462foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1462: folk mode
internal fun PlayerActivity.showV1462FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1462folk
    FeaturePrefsStore.batch1461.v1462folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1462: food mode
internal fun PlayerActivity.showV1462FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1462food
    FeaturePrefsStore.batch1461.v1462food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1462: foot mode
internal fun PlayerActivity.showV1462FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1462foot
    FeaturePrefsStore.batch1461.v1462foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1462: forest mode
internal fun PlayerActivity.showV1462ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1462forest
    FeaturePrefsStore.batch1461.v1462forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1462: forget mode
internal fun PlayerActivity.showV1462ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1462forget
    FeaturePrefsStore.batch1461.v1462forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1463: flavor mode
internal fun PlayerActivity.showV1463FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1463flavor
    FeaturePrefsStore.batch1461.v1463flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1463: flight mode
internal fun PlayerActivity.showV1463FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1463flight
    FeaturePrefsStore.batch1461.v1463flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1463: flock mode
internal fun PlayerActivity.showV1463FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1463flock
    FeaturePrefsStore.batch1461.v1463flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1463: flood mode
internal fun PlayerActivity.showV1463FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1463flood
    FeaturePrefsStore.batch1461.v1463flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1463: floor mode
internal fun PlayerActivity.showV1463FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1463floor
    FeaturePrefsStore.batch1461.v1463floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1463: flour level
internal fun PlayerActivity.showV1463FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1463flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1463flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1463: flower level
internal fun PlayerActivity.showV1463FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1463flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1463flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1463: fluid level
internal fun PlayerActivity.showV1463FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1463fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1463fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1463: fly level
internal fun PlayerActivity.showV1463FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1463fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1463fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1463: foam level
internal fun PlayerActivity.showV1463FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1463foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1463foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1463: folk mode
internal fun PlayerActivity.showV1463FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1463folk
    FeaturePrefsStore.batch1461.v1463folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1463: food mode
internal fun PlayerActivity.showV1463FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1463food
    FeaturePrefsStore.batch1461.v1463food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1463: foot mode
internal fun PlayerActivity.showV1463FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1463foot
    FeaturePrefsStore.batch1461.v1463foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1463: forest mode
internal fun PlayerActivity.showV1463ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1463forest
    FeaturePrefsStore.batch1461.v1463forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1463: forget mode
internal fun PlayerActivity.showV1463ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1463forget
    FeaturePrefsStore.batch1461.v1463forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1464: flavor mode
internal fun PlayerActivity.showV1464FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1464flavor
    FeaturePrefsStore.batch1461.v1464flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1464: flight mode
internal fun PlayerActivity.showV1464FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1464flight
    FeaturePrefsStore.batch1461.v1464flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1464: flock mode
internal fun PlayerActivity.showV1464FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1464flock
    FeaturePrefsStore.batch1461.v1464flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1464: flood mode
internal fun PlayerActivity.showV1464FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1464flood
    FeaturePrefsStore.batch1461.v1464flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1464: floor mode
internal fun PlayerActivity.showV1464FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1464floor
    FeaturePrefsStore.batch1461.v1464floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1464: flour level
internal fun PlayerActivity.showV1464FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1464flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1464flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1464: flower level
internal fun PlayerActivity.showV1464FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1464flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1464flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1464: fluid level
internal fun PlayerActivity.showV1464FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1464fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1464fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1464: fly level
internal fun PlayerActivity.showV1464FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1464fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1464fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1464: foam level
internal fun PlayerActivity.showV1464FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1464foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1464foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1464: folk mode
internal fun PlayerActivity.showV1464FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1464folk
    FeaturePrefsStore.batch1461.v1464folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1464: food mode
internal fun PlayerActivity.showV1464FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1464food
    FeaturePrefsStore.batch1461.v1464food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1464: foot mode
internal fun PlayerActivity.showV1464FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1464foot
    FeaturePrefsStore.batch1461.v1464foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1464: forest mode
internal fun PlayerActivity.showV1464ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1464forest
    FeaturePrefsStore.batch1461.v1464forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1464: forget mode
internal fun PlayerActivity.showV1464ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1464forget
    FeaturePrefsStore.batch1461.v1464forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1465: flavor mode
internal fun PlayerActivity.showV1465FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1465flavor
    FeaturePrefsStore.batch1461.v1465flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1465: flight mode
internal fun PlayerActivity.showV1465FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1465flight
    FeaturePrefsStore.batch1461.v1465flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1465: flock mode
internal fun PlayerActivity.showV1465FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1465flock
    FeaturePrefsStore.batch1461.v1465flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1465: flood mode
internal fun PlayerActivity.showV1465FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1465flood
    FeaturePrefsStore.batch1461.v1465flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1465: floor mode
internal fun PlayerActivity.showV1465FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1465floor
    FeaturePrefsStore.batch1461.v1465floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1465: flour level
internal fun PlayerActivity.showV1465FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1465flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1465flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1465: flower level
internal fun PlayerActivity.showV1465FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1465flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1465flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1465: fluid level
internal fun PlayerActivity.showV1465FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1465fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1465fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1465: fly level
internal fun PlayerActivity.showV1465FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1465fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1465fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1465: foam level
internal fun PlayerActivity.showV1465FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1465foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1465foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1465: folk mode
internal fun PlayerActivity.showV1465FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1465folk
    FeaturePrefsStore.batch1461.v1465folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1465: food mode
internal fun PlayerActivity.showV1465FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1465food
    FeaturePrefsStore.batch1461.v1465food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1465: foot mode
internal fun PlayerActivity.showV1465FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1465foot
    FeaturePrefsStore.batch1461.v1465foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1465: forest mode
internal fun PlayerActivity.showV1465ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1465forest
    FeaturePrefsStore.batch1461.v1465forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1465: forget mode
internal fun PlayerActivity.showV1465ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1465forget
    FeaturePrefsStore.batch1461.v1465forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1466: flavor mode
internal fun PlayerActivity.showV1466FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1466flavor
    FeaturePrefsStore.batch1461.v1466flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1466: flight mode
internal fun PlayerActivity.showV1466FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1466flight
    FeaturePrefsStore.batch1461.v1466flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1466: flock mode
internal fun PlayerActivity.showV1466FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1466flock
    FeaturePrefsStore.batch1461.v1466flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1466: flood mode
internal fun PlayerActivity.showV1466FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1466flood
    FeaturePrefsStore.batch1461.v1466flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1466: floor mode
internal fun PlayerActivity.showV1466FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1466floor
    FeaturePrefsStore.batch1461.v1466floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1466: flour level
internal fun PlayerActivity.showV1466FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1466flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1466flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1466: flower level
internal fun PlayerActivity.showV1466FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1466flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1466flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1466: fluid level
internal fun PlayerActivity.showV1466FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1466fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1466fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1466: fly level
internal fun PlayerActivity.showV1466FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1466fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1466fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1466: foam level
internal fun PlayerActivity.showV1466FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1466foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1466foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1466: folk mode
internal fun PlayerActivity.showV1466FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1466folk
    FeaturePrefsStore.batch1461.v1466folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1466: food mode
internal fun PlayerActivity.showV1466FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1466food
    FeaturePrefsStore.batch1461.v1466food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1466: foot mode
internal fun PlayerActivity.showV1466FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1466foot
    FeaturePrefsStore.batch1461.v1466foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1466: forest mode
internal fun PlayerActivity.showV1466ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1466forest
    FeaturePrefsStore.batch1461.v1466forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1466: forget mode
internal fun PlayerActivity.showV1466ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1466forget
    FeaturePrefsStore.batch1461.v1466forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1467: flavor mode
internal fun PlayerActivity.showV1467FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1467flavor
    FeaturePrefsStore.batch1461.v1467flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1467: flight mode
internal fun PlayerActivity.showV1467FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1467flight
    FeaturePrefsStore.batch1461.v1467flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1467: flock mode
internal fun PlayerActivity.showV1467FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1467flock
    FeaturePrefsStore.batch1461.v1467flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1467: flood mode
internal fun PlayerActivity.showV1467FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1467flood
    FeaturePrefsStore.batch1461.v1467flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1467: floor mode
internal fun PlayerActivity.showV1467FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1467floor
    FeaturePrefsStore.batch1461.v1467floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1467: flour level
internal fun PlayerActivity.showV1467FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1467flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1467flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1467: flower level
internal fun PlayerActivity.showV1467FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1467flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1467flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1467: fluid level
internal fun PlayerActivity.showV1467FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1467fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1467fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1467: fly level
internal fun PlayerActivity.showV1467FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1467fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1467fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1467: foam level
internal fun PlayerActivity.showV1467FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1467foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1467foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1467: folk mode
internal fun PlayerActivity.showV1467FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1467folk
    FeaturePrefsStore.batch1461.v1467folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1467: food mode
internal fun PlayerActivity.showV1467FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1467food
    FeaturePrefsStore.batch1461.v1467food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1467: foot mode
internal fun PlayerActivity.showV1467FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1467foot
    FeaturePrefsStore.batch1461.v1467foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1467: forest mode
internal fun PlayerActivity.showV1467ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1467forest
    FeaturePrefsStore.batch1461.v1467forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1467: forget mode
internal fun PlayerActivity.showV1467ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1467forget
    FeaturePrefsStore.batch1461.v1467forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1468: flavor mode
internal fun PlayerActivity.showV1468FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1468flavor
    FeaturePrefsStore.batch1461.v1468flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1468: flight mode
internal fun PlayerActivity.showV1468FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1468flight
    FeaturePrefsStore.batch1461.v1468flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1468: flock mode
internal fun PlayerActivity.showV1468FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1468flock
    FeaturePrefsStore.batch1461.v1468flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1468: flood mode
internal fun PlayerActivity.showV1468FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1468flood
    FeaturePrefsStore.batch1461.v1468flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1468: floor mode
internal fun PlayerActivity.showV1468FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1468floor
    FeaturePrefsStore.batch1461.v1468floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1468: flour level
internal fun PlayerActivity.showV1468FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1468flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1468flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1468: flower level
internal fun PlayerActivity.showV1468FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1468flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1468flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1468: fluid level
internal fun PlayerActivity.showV1468FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1468fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1468fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1468: fly level
internal fun PlayerActivity.showV1468FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1468fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1468fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1468: foam level
internal fun PlayerActivity.showV1468FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1468foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1468foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1468: folk mode
internal fun PlayerActivity.showV1468FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1468folk
    FeaturePrefsStore.batch1461.v1468folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1468: food mode
internal fun PlayerActivity.showV1468FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1468food
    FeaturePrefsStore.batch1461.v1468food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1468: foot mode
internal fun PlayerActivity.showV1468FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1468foot
    FeaturePrefsStore.batch1461.v1468foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1468: forest mode
internal fun PlayerActivity.showV1468ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1468forest
    FeaturePrefsStore.batch1461.v1468forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1468: forget mode
internal fun PlayerActivity.showV1468ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1468forget
    FeaturePrefsStore.batch1461.v1468forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1469: flavor mode
internal fun PlayerActivity.showV1469FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1469flavor
    FeaturePrefsStore.batch1461.v1469flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1469: flight mode
internal fun PlayerActivity.showV1469FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1469flight
    FeaturePrefsStore.batch1461.v1469flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1469: flock mode
internal fun PlayerActivity.showV1469FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1469flock
    FeaturePrefsStore.batch1461.v1469flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1469: flood mode
internal fun PlayerActivity.showV1469FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1469flood
    FeaturePrefsStore.batch1461.v1469flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1469: floor mode
internal fun PlayerActivity.showV1469FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1469floor
    FeaturePrefsStore.batch1461.v1469floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1469: flour level
internal fun PlayerActivity.showV1469FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1469flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1469flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1469: flower level
internal fun PlayerActivity.showV1469FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1469flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1469flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1469: fluid level
internal fun PlayerActivity.showV1469FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1469fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1469fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1469: fly level
internal fun PlayerActivity.showV1469FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1469fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1469fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1469: foam level
internal fun PlayerActivity.showV1469FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1469foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1469foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1469: folk mode
internal fun PlayerActivity.showV1469FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1469folk
    FeaturePrefsStore.batch1461.v1469folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1469: food mode
internal fun PlayerActivity.showV1469FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1469food
    FeaturePrefsStore.batch1461.v1469food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1469: foot mode
internal fun PlayerActivity.showV1469FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1469foot
    FeaturePrefsStore.batch1461.v1469foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1469: forest mode
internal fun PlayerActivity.showV1469ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1469forest
    FeaturePrefsStore.batch1461.v1469forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1469: forget mode
internal fun PlayerActivity.showV1469ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1469forget
    FeaturePrefsStore.batch1461.v1469forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

// v1470: flavor mode
internal fun PlayerActivity.showV1470FlavorToggle() {
    val current = FeaturePrefsStore.batch1461.v1470flavor
    FeaturePrefsStore.batch1461.v1470flavor = !current
    AppToast.show(this, "flavor: ${if (!current) "ON" else "OFF"}")
}

// v1470: flight mode
internal fun PlayerActivity.showV1470FlightToggle() {
    val current = FeaturePrefsStore.batch1461.v1470flight
    FeaturePrefsStore.batch1461.v1470flight = !current
    AppToast.show(this, "flight: ${if (!current) "ON" else "OFF"}")
}

// v1470: flock mode
internal fun PlayerActivity.showV1470FlockToggle() {
    val current = FeaturePrefsStore.batch1461.v1470flock
    FeaturePrefsStore.batch1461.v1470flock = !current
    AppToast.show(this, "flock: ${if (!current) "ON" else "OFF"}")
}

// v1470: flood mode
internal fun PlayerActivity.showV1470FloodToggle() {
    val current = FeaturePrefsStore.batch1461.v1470flood
    FeaturePrefsStore.batch1461.v1470flood = !current
    AppToast.show(this, "flood: ${if (!current) "ON" else "OFF"}")
}

// v1470: floor mode
internal fun PlayerActivity.showV1470FloorToggle() {
    val current = FeaturePrefsStore.batch1461.v1470floor
    FeaturePrefsStore.batch1461.v1470floor = !current
    AppToast.show(this, "floor: ${if (!current) "ON" else "OFF"}")
}

// v1470: flour level
internal fun PlayerActivity.showV1470FlourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1470flour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1470flour = value
        AppToast.show(this, "flour: $value")
    }
}

// v1470: flower level
internal fun PlayerActivity.showV1470FlowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1470flower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1470flower = value
        AppToast.show(this, "flower: $value")
    }
}

// v1470: fluid level
internal fun PlayerActivity.showV1470FluidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1470fluid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fluid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1470fluid = value
        AppToast.show(this, "fluid: $value")
    }
}

// v1470: fly level
internal fun PlayerActivity.showV1470FlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1470fly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1470fly = value
        AppToast.show(this, "fly: $value")
    }
}

// v1470: foam level
internal fun PlayerActivity.showV1470FoamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1461.v1470foam).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "foam level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1461.v1470foam = value
        AppToast.show(this, "foam: $value")
    }
}

// v1470: folk mode
internal fun PlayerActivity.showV1470FolkToggle() {
    val current = FeaturePrefsStore.batch1461.v1470folk
    FeaturePrefsStore.batch1461.v1470folk = !current
    AppToast.show(this, "folk: ${if (!current) "ON" else "OFF"}")
}

// v1470: food mode
internal fun PlayerActivity.showV1470FoodToggle() {
    val current = FeaturePrefsStore.batch1461.v1470food
    FeaturePrefsStore.batch1461.v1470food = !current
    AppToast.show(this, "food: ${if (!current) "ON" else "OFF"}")
}

// v1470: foot mode
internal fun PlayerActivity.showV1470FootToggle() {
    val current = FeaturePrefsStore.batch1461.v1470foot
    FeaturePrefsStore.batch1461.v1470foot = !current
    AppToast.show(this, "foot: ${if (!current) "ON" else "OFF"}")
}

// v1470: forest mode
internal fun PlayerActivity.showV1470ForestToggle() {
    val current = FeaturePrefsStore.batch1461.v1470forest
    FeaturePrefsStore.batch1461.v1470forest = !current
    AppToast.show(this, "forest: ${if (!current) "ON" else "OFF"}")
}

// v1470: forget mode
internal fun PlayerActivity.showV1470ForgetToggle() {
    val current = FeaturePrefsStore.batch1461.v1470forget
    FeaturePrefsStore.batch1461.v1470forget = !current
    AppToast.show(this, "forget: ${if (!current) "ON" else "OFF"}")
}

