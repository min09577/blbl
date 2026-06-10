package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v1471: fork mode
internal fun PlayerActivity.showV1471ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fork
    FeaturePrefsStore.batch1471.v1471fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1471: formal mode
internal fun PlayerActivity.showV1471FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1471formal
    FeaturePrefsStore.batch1471.v1471formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1471: fortune mode
internal fun PlayerActivity.showV1471FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fortune
    FeaturePrefsStore.batch1471.v1471fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1471: forum mode
internal fun PlayerActivity.showV1471ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1471forum
    FeaturePrefsStore.batch1471.v1471forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1471: forward mode
internal fun PlayerActivity.showV1471ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1471forward
    FeaturePrefsStore.batch1471.v1471forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1471: fossil level
internal fun PlayerActivity.showV1471FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1471: found level
internal fun PlayerActivity.showV1471FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471found = value
        AppToast.show(this, "found: $value")
    }
}

// v1471: frank level
internal fun PlayerActivity.showV1471FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1471: fraud level
internal fun PlayerActivity.showV1471FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1471: fresh level
internal fun PlayerActivity.showV1471FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1471: frost mode
internal fun PlayerActivity.showV1471FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1471frost
    FeaturePrefsStore.batch1471.v1471frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1471: frozen mode
internal fun PlayerActivity.showV1471FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1471frozen
    FeaturePrefsStore.batch1471.v1471frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1471: fruit mode
internal fun PlayerActivity.showV1471FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fruit
    FeaturePrefsStore.batch1471.v1471fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1471: fuel mode
internal fun PlayerActivity.showV1471FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fuel
    FeaturePrefsStore.batch1471.v1471fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1471: fun mode
internal fun PlayerActivity.showV1471FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fun
    FeaturePrefsStore.batch1471.v1471fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1472: fork mode
internal fun PlayerActivity.showV1472ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fork
    FeaturePrefsStore.batch1471.v1472fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1472: formal mode
internal fun PlayerActivity.showV1472FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1472formal
    FeaturePrefsStore.batch1471.v1472formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1472: fortune mode
internal fun PlayerActivity.showV1472FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fortune
    FeaturePrefsStore.batch1471.v1472fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1472: forum mode
internal fun PlayerActivity.showV1472ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1472forum
    FeaturePrefsStore.batch1471.v1472forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1472: forward mode
internal fun PlayerActivity.showV1472ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1472forward
    FeaturePrefsStore.batch1471.v1472forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1472: fossil level
internal fun PlayerActivity.showV1472FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1472: found level
internal fun PlayerActivity.showV1472FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472found = value
        AppToast.show(this, "found: $value")
    }
}

// v1472: frank level
internal fun PlayerActivity.showV1472FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1472: fraud level
internal fun PlayerActivity.showV1472FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1472: fresh level
internal fun PlayerActivity.showV1472FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1472: frost mode
internal fun PlayerActivity.showV1472FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1472frost
    FeaturePrefsStore.batch1471.v1472frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1472: frozen mode
internal fun PlayerActivity.showV1472FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1472frozen
    FeaturePrefsStore.batch1471.v1472frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1472: fruit mode
internal fun PlayerActivity.showV1472FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fruit
    FeaturePrefsStore.batch1471.v1472fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1472: fuel mode
internal fun PlayerActivity.showV1472FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fuel
    FeaturePrefsStore.batch1471.v1472fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1472: fun mode
internal fun PlayerActivity.showV1472FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fun
    FeaturePrefsStore.batch1471.v1472fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1473: fork mode
internal fun PlayerActivity.showV1473ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fork
    FeaturePrefsStore.batch1471.v1473fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1473: formal mode
internal fun PlayerActivity.showV1473FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1473formal
    FeaturePrefsStore.batch1471.v1473formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1473: fortune mode
internal fun PlayerActivity.showV1473FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fortune
    FeaturePrefsStore.batch1471.v1473fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1473: forum mode
internal fun PlayerActivity.showV1473ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1473forum
    FeaturePrefsStore.batch1471.v1473forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1473: forward mode
internal fun PlayerActivity.showV1473ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1473forward
    FeaturePrefsStore.batch1471.v1473forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1473: fossil level
internal fun PlayerActivity.showV1473FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1473: found level
internal fun PlayerActivity.showV1473FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473found = value
        AppToast.show(this, "found: $value")
    }
}

// v1473: frank level
internal fun PlayerActivity.showV1473FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1473: fraud level
internal fun PlayerActivity.showV1473FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1473: fresh level
internal fun PlayerActivity.showV1473FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1473: frost mode
internal fun PlayerActivity.showV1473FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1473frost
    FeaturePrefsStore.batch1471.v1473frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1473: frozen mode
internal fun PlayerActivity.showV1473FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1473frozen
    FeaturePrefsStore.batch1471.v1473frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1473: fruit mode
internal fun PlayerActivity.showV1473FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fruit
    FeaturePrefsStore.batch1471.v1473fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1473: fuel mode
internal fun PlayerActivity.showV1473FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fuel
    FeaturePrefsStore.batch1471.v1473fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1473: fun mode
internal fun PlayerActivity.showV1473FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fun
    FeaturePrefsStore.batch1471.v1473fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1474: fork mode
internal fun PlayerActivity.showV1474ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fork
    FeaturePrefsStore.batch1471.v1474fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1474: formal mode
internal fun PlayerActivity.showV1474FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1474formal
    FeaturePrefsStore.batch1471.v1474formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1474: fortune mode
internal fun PlayerActivity.showV1474FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fortune
    FeaturePrefsStore.batch1471.v1474fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1474: forum mode
internal fun PlayerActivity.showV1474ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1474forum
    FeaturePrefsStore.batch1471.v1474forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1474: forward mode
internal fun PlayerActivity.showV1474ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1474forward
    FeaturePrefsStore.batch1471.v1474forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1474: fossil level
internal fun PlayerActivity.showV1474FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1474: found level
internal fun PlayerActivity.showV1474FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474found = value
        AppToast.show(this, "found: $value")
    }
}

// v1474: frank level
internal fun PlayerActivity.showV1474FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1474: fraud level
internal fun PlayerActivity.showV1474FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1474: fresh level
internal fun PlayerActivity.showV1474FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1474: frost mode
internal fun PlayerActivity.showV1474FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1474frost
    FeaturePrefsStore.batch1471.v1474frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1474: frozen mode
internal fun PlayerActivity.showV1474FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1474frozen
    FeaturePrefsStore.batch1471.v1474frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1474: fruit mode
internal fun PlayerActivity.showV1474FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fruit
    FeaturePrefsStore.batch1471.v1474fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1474: fuel mode
internal fun PlayerActivity.showV1474FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fuel
    FeaturePrefsStore.batch1471.v1474fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1474: fun mode
internal fun PlayerActivity.showV1474FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fun
    FeaturePrefsStore.batch1471.v1474fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1475: fork mode
internal fun PlayerActivity.showV1475ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fork
    FeaturePrefsStore.batch1471.v1475fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1475: formal mode
internal fun PlayerActivity.showV1475FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1475formal
    FeaturePrefsStore.batch1471.v1475formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1475: fortune mode
internal fun PlayerActivity.showV1475FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fortune
    FeaturePrefsStore.batch1471.v1475fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1475: forum mode
internal fun PlayerActivity.showV1475ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1475forum
    FeaturePrefsStore.batch1471.v1475forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1475: forward mode
internal fun PlayerActivity.showV1475ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1475forward
    FeaturePrefsStore.batch1471.v1475forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1475: fossil level
internal fun PlayerActivity.showV1475FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1475: found level
internal fun PlayerActivity.showV1475FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475found = value
        AppToast.show(this, "found: $value")
    }
}

// v1475: frank level
internal fun PlayerActivity.showV1475FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1475: fraud level
internal fun PlayerActivity.showV1475FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1475: fresh level
internal fun PlayerActivity.showV1475FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1475: frost mode
internal fun PlayerActivity.showV1475FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1475frost
    FeaturePrefsStore.batch1471.v1475frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1475: frozen mode
internal fun PlayerActivity.showV1475FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1475frozen
    FeaturePrefsStore.batch1471.v1475frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1475: fruit mode
internal fun PlayerActivity.showV1475FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fruit
    FeaturePrefsStore.batch1471.v1475fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1475: fuel mode
internal fun PlayerActivity.showV1475FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fuel
    FeaturePrefsStore.batch1471.v1475fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1475: fun mode
internal fun PlayerActivity.showV1475FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fun
    FeaturePrefsStore.batch1471.v1475fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1476: fork mode
internal fun PlayerActivity.showV1476ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fork
    FeaturePrefsStore.batch1471.v1476fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1476: formal mode
internal fun PlayerActivity.showV1476FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1476formal
    FeaturePrefsStore.batch1471.v1476formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1476: fortune mode
internal fun PlayerActivity.showV1476FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fortune
    FeaturePrefsStore.batch1471.v1476fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1476: forum mode
internal fun PlayerActivity.showV1476ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1476forum
    FeaturePrefsStore.batch1471.v1476forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1476: forward mode
internal fun PlayerActivity.showV1476ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1476forward
    FeaturePrefsStore.batch1471.v1476forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1476: fossil level
internal fun PlayerActivity.showV1476FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1476: found level
internal fun PlayerActivity.showV1476FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476found = value
        AppToast.show(this, "found: $value")
    }
}

// v1476: frank level
internal fun PlayerActivity.showV1476FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1476: fraud level
internal fun PlayerActivity.showV1476FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1476: fresh level
internal fun PlayerActivity.showV1476FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1476: frost mode
internal fun PlayerActivity.showV1476FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1476frost
    FeaturePrefsStore.batch1471.v1476frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1476: frozen mode
internal fun PlayerActivity.showV1476FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1476frozen
    FeaturePrefsStore.batch1471.v1476frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1476: fruit mode
internal fun PlayerActivity.showV1476FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fruit
    FeaturePrefsStore.batch1471.v1476fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1476: fuel mode
internal fun PlayerActivity.showV1476FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fuel
    FeaturePrefsStore.batch1471.v1476fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1476: fun mode
internal fun PlayerActivity.showV1476FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fun
    FeaturePrefsStore.batch1471.v1476fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1477: fork mode
internal fun PlayerActivity.showV1477ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fork
    FeaturePrefsStore.batch1471.v1477fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1477: formal mode
internal fun PlayerActivity.showV1477FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1477formal
    FeaturePrefsStore.batch1471.v1477formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1477: fortune mode
internal fun PlayerActivity.showV1477FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fortune
    FeaturePrefsStore.batch1471.v1477fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1477: forum mode
internal fun PlayerActivity.showV1477ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1477forum
    FeaturePrefsStore.batch1471.v1477forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1477: forward mode
internal fun PlayerActivity.showV1477ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1477forward
    FeaturePrefsStore.batch1471.v1477forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1477: fossil level
internal fun PlayerActivity.showV1477FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1477: found level
internal fun PlayerActivity.showV1477FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477found = value
        AppToast.show(this, "found: $value")
    }
}

// v1477: frank level
internal fun PlayerActivity.showV1477FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1477: fraud level
internal fun PlayerActivity.showV1477FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1477: fresh level
internal fun PlayerActivity.showV1477FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1477: frost mode
internal fun PlayerActivity.showV1477FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1477frost
    FeaturePrefsStore.batch1471.v1477frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1477: frozen mode
internal fun PlayerActivity.showV1477FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1477frozen
    FeaturePrefsStore.batch1471.v1477frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1477: fruit mode
internal fun PlayerActivity.showV1477FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fruit
    FeaturePrefsStore.batch1471.v1477fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1477: fuel mode
internal fun PlayerActivity.showV1477FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fuel
    FeaturePrefsStore.batch1471.v1477fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1477: fun mode
internal fun PlayerActivity.showV1477FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fun
    FeaturePrefsStore.batch1471.v1477fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1478: fork mode
internal fun PlayerActivity.showV1478ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fork
    FeaturePrefsStore.batch1471.v1478fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1478: formal mode
internal fun PlayerActivity.showV1478FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1478formal
    FeaturePrefsStore.batch1471.v1478formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1478: fortune mode
internal fun PlayerActivity.showV1478FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fortune
    FeaturePrefsStore.batch1471.v1478fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1478: forum mode
internal fun PlayerActivity.showV1478ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1478forum
    FeaturePrefsStore.batch1471.v1478forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1478: forward mode
internal fun PlayerActivity.showV1478ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1478forward
    FeaturePrefsStore.batch1471.v1478forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1478: fossil level
internal fun PlayerActivity.showV1478FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1478: found level
internal fun PlayerActivity.showV1478FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478found = value
        AppToast.show(this, "found: $value")
    }
}

// v1478: frank level
internal fun PlayerActivity.showV1478FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1478: fraud level
internal fun PlayerActivity.showV1478FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1478: fresh level
internal fun PlayerActivity.showV1478FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1478: frost mode
internal fun PlayerActivity.showV1478FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1478frost
    FeaturePrefsStore.batch1471.v1478frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1478: frozen mode
internal fun PlayerActivity.showV1478FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1478frozen
    FeaturePrefsStore.batch1471.v1478frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1478: fruit mode
internal fun PlayerActivity.showV1478FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fruit
    FeaturePrefsStore.batch1471.v1478fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1478: fuel mode
internal fun PlayerActivity.showV1478FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fuel
    FeaturePrefsStore.batch1471.v1478fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1478: fun mode
internal fun PlayerActivity.showV1478FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fun
    FeaturePrefsStore.batch1471.v1478fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1479: fork mode
internal fun PlayerActivity.showV1479ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fork
    FeaturePrefsStore.batch1471.v1479fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1479: formal mode
internal fun PlayerActivity.showV1479FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1479formal
    FeaturePrefsStore.batch1471.v1479formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1479: fortune mode
internal fun PlayerActivity.showV1479FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fortune
    FeaturePrefsStore.batch1471.v1479fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1479: forum mode
internal fun PlayerActivity.showV1479ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1479forum
    FeaturePrefsStore.batch1471.v1479forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1479: forward mode
internal fun PlayerActivity.showV1479ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1479forward
    FeaturePrefsStore.batch1471.v1479forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1479: fossil level
internal fun PlayerActivity.showV1479FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1479: found level
internal fun PlayerActivity.showV1479FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479found = value
        AppToast.show(this, "found: $value")
    }
}

// v1479: frank level
internal fun PlayerActivity.showV1479FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1479: fraud level
internal fun PlayerActivity.showV1479FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1479: fresh level
internal fun PlayerActivity.showV1479FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1479: frost mode
internal fun PlayerActivity.showV1479FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1479frost
    FeaturePrefsStore.batch1471.v1479frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1479: frozen mode
internal fun PlayerActivity.showV1479FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1479frozen
    FeaturePrefsStore.batch1471.v1479frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1479: fruit mode
internal fun PlayerActivity.showV1479FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fruit
    FeaturePrefsStore.batch1471.v1479fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1479: fuel mode
internal fun PlayerActivity.showV1479FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fuel
    FeaturePrefsStore.batch1471.v1479fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1479: fun mode
internal fun PlayerActivity.showV1479FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fun
    FeaturePrefsStore.batch1471.v1479fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1480: fork mode
internal fun PlayerActivity.showV1480ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fork
    FeaturePrefsStore.batch1471.v1480fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1480: formal mode
internal fun PlayerActivity.showV1480FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1480formal
    FeaturePrefsStore.batch1471.v1480formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1480: fortune mode
internal fun PlayerActivity.showV1480FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fortune
    FeaturePrefsStore.batch1471.v1480fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1480: forum mode
internal fun PlayerActivity.showV1480ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1480forum
    FeaturePrefsStore.batch1471.v1480forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1480: forward mode
internal fun PlayerActivity.showV1480ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1480forward
    FeaturePrefsStore.batch1471.v1480forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1480: fossil level
internal fun PlayerActivity.showV1480FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1480: found level
internal fun PlayerActivity.showV1480FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480found = value
        AppToast.show(this, "found: $value")
    }
}

// v1480: frank level
internal fun PlayerActivity.showV1480FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1480: fraud level
internal fun PlayerActivity.showV1480FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1480: fresh level
internal fun PlayerActivity.showV1480FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1480: frost mode
internal fun PlayerActivity.showV1480FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1480frost
    FeaturePrefsStore.batch1471.v1480frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1480: frozen mode
internal fun PlayerActivity.showV1480FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1480frozen
    FeaturePrefsStore.batch1471.v1480frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1480: fruit mode
internal fun PlayerActivity.showV1480FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fruit
    FeaturePrefsStore.batch1471.v1480fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1480: fuel mode
internal fun PlayerActivity.showV1480FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fuel
    FeaturePrefsStore.batch1471.v1480fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1480: fun mode
internal fun PlayerActivity.showV1480FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fun
    FeaturePrefsStore.batch1471.v1480fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v183: Gesture Edge Swipe Up183
internal fun PlayerActivity.showV183GestureEdgeSwipeUp183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183gestureEdgeSwipeUp183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Up183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183gestureEdgeSwipeUp183 = value
        AppToast.show(this, "Gesture Edge Swipe Up183: $value")
    }
}

// v183: Cast Audio Channel
internal fun PlayerActivity.showV183CastAudioChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183castAudioChannel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183castAudioChannel = value
        AppToast.show(this, "Cast Audio Channel: $value")
    }
}

// v183: Playlist Loop All183
internal fun PlayerActivity.showV183PlaylistLoopAll183Toggle() {
    val current = BiliClient.prefs.v183playlistLoopAll183
    BiliClient.prefs.v183playlistLoopAll183 = !current
    AppToast.show(this, "Playlist Loop All183: ${if (!current) "ON" else "OFF"}")
}

// v183: Cache Download Batch183
internal fun PlayerActivity.showV183CacheDownloadBatch183Toggle() {
    val current = BiliClient.prefs.v183cacheDownloadBatch183
    BiliClient.prefs.v183cacheDownloadBatch183 = !current
    AppToast.show(this, "Cache Download Batch183: ${if (!current) "ON" else "OFF"}")
}

// v183: Progress Bar Thumb Glow183
internal fun PlayerActivity.showV183ProgressBarThumbGlow183Toggle() {
    val current = BiliClient.prefs.v183progressBarThumbGlow183
    BiliClient.prefs.v183progressBarThumbGlow183 = !current
    AppToast.show(this, "Progress Bar Thumb Glow183: ${if (!current) "ON" else "OFF"}")
}

// v183: Volume Boost Level183
internal fun PlayerActivity.showV183VolumeBoostLevel183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183volumeBoostLevel183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183volumeBoostLevel183 = value
        AppToast.show(this, "Volume Boost Level183: $value")
    }
}

// v183: History Bookmark Color
internal fun PlayerActivity.showV183HistoryBookmarkColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183historyBookmarkColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183historyBookmarkColor = value
        AppToast.show(this, "History Bookmark Color: $value")
    }
}

// v183: Playback Chapter Prev
internal fun PlayerActivity.showV183PlaybackChapterPrevToggle() {
    val current = BiliClient.prefs.v183playbackChapterPrev
    BiliClient.prefs.v183playbackChapterPrev = !current
    AppToast.show(this, "Playback Chapter Prev: ${if (!current) "ON" else "OFF"}")
}

// v183: Screenshot Crop Toggle
internal fun PlayerActivity.showV183ScreenshotCropToggleToggle() {
    val current = BiliClient.prefs.v183screenshotCropToggle
    BiliClient.prefs.v183screenshotCropToggle = !current
    AppToast.show(this, "Screenshot Crop Toggle: ${if (!current) "ON" else "OFF"}")
}

// v183: Video HDR10 Level183
internal fun PlayerActivity.showV183VideoHDR10Level183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183videoHDR10Level183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183videoHDR10Level183 = value
        AppToast.show(this, "Video HDR10 Level183: $value")
    }
}

// v183: Danmaku Fixed Color
internal fun PlayerActivity.showV183DanmakuFixedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedColor = value
        AppToast.show(this, "Danmaku Fixed Color: $value")
    }
}

// v183: Subtitle Bg Color184
internal fun PlayerActivity.showV183SubtitleBgColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor184 = value
        AppToast.show(this, "Subtitle Bg Color184: $value")
    }
}

// v184: Audio Reverb Mix184
internal fun PlayerActivity.showV184AudioReverbMix184Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v184audioReverbMix184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Mix184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184audioReverbMix184 = value
        AppToast.show(this, "Audio Reverb Mix184: $value")
    }
}

// v184: Danmaku Fixed Color184
internal fun PlayerActivity.showV184DanmakuFixedColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedColor184 = value
        AppToast.show(this, "Danmaku Fixed Color184: $value")
    }
}

// v184: Subtitle Bg Color185
internal fun PlayerActivity.showV184SubtitleBgColor185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184subtitleBgColor185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184subtitleBgColor185 = value
        AppToast.show(this, "Subtitle Bg Color185: $value")
    }
}

// v184: Gesture Edge Swipe Down184
internal fun PlayerActivity.showV184GestureEdgeSwipeDown184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184gestureEdgeSwipeDown184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Down184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184gestureEdgeSwipeDown184 = value
        AppToast.show(this, "Gesture Edge Swipe Down184: $value")
    }
}

// v184: Cast Audio Channel184
internal fun PlayerActivity.showV184CastAudioChannel184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184castAudioChannel184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184castAudioChannel184 = value
        AppToast.show(this, "Cast Audio Channel184: $value")
    }
}

// v184: Playlist Loop All184
internal fun PlayerActivity.showV184PlaylistLoopAll184Toggle() {
    val current = BiliClient.prefs.v184playlistLoopAll184
    BiliClient.prefs.v184playlistLoopAll184 = !current
    AppToast.show(this, "Playlist Loop All184: ${if (!current) "ON" else "OFF"}")
}

// v184: Cache Download Batch184
internal fun PlayerActivity.showV184CacheDownloadBatch184Toggle() {
    val current = BiliClient.prefs.v184cacheDownloadBatch184
    BiliClient.prefs.v184cacheDownloadBatch184 = !current
    AppToast.show(this, "Cache Download Batch184: ${if (!current) "ON" else "OFF"}")
}

// v184: Progress Bar Thumb Glow184
internal fun PlayerActivity.showV184ProgressBarThumbGlow184Toggle() {
    val current = BiliClient.prefs.v184progressBarThumbGlow184
    BiliClient.prefs.v184progressBarThumbGlow184 = !current
    AppToast.show(this, "Progress Bar Thumb Glow184: ${if (!current) "ON" else "OFF"}")
}

// v184: Volume Boost Gain184
internal fun PlayerActivity.showV184VolumeBoostGain184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184volumeBoostGain184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184volumeBoostGain184 = value
        AppToast.show(this, "Volume Boost Gain184: $value")
    }
}

// v184: History Bookmark Color184
internal fun PlayerActivity.showV184HistoryBookmarkColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184historyBookmarkColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184historyBookmarkColor184 = value
        AppToast.show(this, "History Bookmark Color184: $value")
    }
}

// v184: Playback Chapter Prev184
internal fun PlayerActivity.showV184PlaybackChapterPrev184Toggle() {
    val current = BiliClient.prefs.v184playbackChapterPrev184
    BiliClient.prefs.v184playbackChapterPrev184 = !current
    AppToast.show(this, "Playback Chapter Prev184: ${if (!current) "ON" else "OFF"}")
}

// v184: Screenshot Crop Toggle184
internal fun PlayerActivity.showV184ScreenshotCropToggle184Toggle() {
    val current = BiliClient.prefs.v184screenshotCropToggle184
    BiliClient.prefs.v184screenshotCropToggle184 = !current
    AppToast.show(this, "Screenshot Crop Toggle184: ${if (!current) "ON" else "OFF"}")
}

// v184: Video HDR10 ToneMap184
internal fun PlayerActivity.showV184VideoHDR10ToneMap184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184videoHDR10ToneMap184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184videoHDR10ToneMap184 = value
        AppToast.show(this, "Video HDR10 ToneMap184: $value")
    }
}

// v184: Danmaku Fixed Size184
internal fun PlayerActivity.showV184DanmakuFixedSize184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedSize184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedSize184 = value
        AppToast.show(this, "Danmaku Fixed Size184: $value")
    }
}

// v184: Subtitle Bg Border184
internal fun PlayerActivity.showV184SubtitleBgBorder184Toggle() {
    val current = BiliClient.prefs.v184subtitleBgBorder184
    BiliClient.prefs.v184subtitleBgBorder184 = !current
    AppToast.show(this, "Subtitle Bg Border184: ${if (!current) "ON" else "OFF"}")
}

// v185: Audio Stereo Widen185
internal fun PlayerActivity.showV185AudioStereoWiden185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185audioStereoWiden185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185audioStereoWiden185 = value
        AppToast.show(this, "Audio Stereo Widen185: $value")
    }
}

// v185: Danmaku Fixed Size185
internal fun PlayerActivity.showV185DanmakuFixedSize185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185danmakuFixedSize185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185danmakuFixedSize185 = value
        AppToast.show(this, "Danmaku Fixed Size185: $value")
    }
}

// v185: Subtitle Bg Border185
internal fun PlayerActivity.showV185SubtitleBgBorder185Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder185
    BiliClient.prefs.v185subtitleBgBorder185 = !current
    AppToast.show(this, "Subtitle Bg Border185: ${if (!current) "ON" else "OFF"}")
}

// v185: Gesture Rotation Detect
internal fun PlayerActivity.showV185GestureRotationDetectToggle() {
    val current = BiliClient.prefs.v185gestureRotationDetect
    BiliClient.prefs.v185gestureRotationDetect = !current
    AppToast.show(this, "Gesture Rotation Detect: ${if (!current) "ON" else "OFF"}")
}

// v185: Cast Audio Channel185
internal fun PlayerActivity.showV185CastAudioChannel185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185castAudioChannel185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185castAudioChannel185 = value
        AppToast.show(this, "Cast Audio Channel185: $value")
    }
}

// v185: Playlist Auto Skip Intro
internal fun PlayerActivity.showV185PlaylistAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v185playlistAutoSkipIntro
    BiliClient.prefs.v185playlistAutoSkipIntro = !current
    AppToast.show(this, "Playlist Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

// v185: Cache Download Concurrent
internal fun PlayerActivity.showV185CacheDownloadConcurrentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185cacheDownloadConcurrent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185cacheDownloadConcurrent = value
        AppToast.show(this, "Cache Download Concurrent: $value")
    }
}

// v185: Progress Bar Thumb Shadow185
internal fun PlayerActivity.showV185ProgressBarThumbShadow185Toggle() {
    val current = BiliClient.prefs.v185progressBarThumbShadow185
    BiliClient.prefs.v185progressBarThumbShadow185 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow185: ${if (!current) "ON" else "OFF"}")
}

// v185: Volume Boost Gain185
internal fun PlayerActivity.showV185VolumeBoostGain185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185volumeBoostGain185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185volumeBoostGain185 = value
        AppToast.show(this, "Volume Boost Gain185: $value")
    }
}

// v185: History Bookmark Note
internal fun PlayerActivity.showV185HistoryBookmarkNoteToggle() {
    val current = BiliClient.prefs.v185historyBookmarkNote
    BiliClient.prefs.v185historyBookmarkNote = !current
    AppToast.show(this, "History Bookmark Note: ${if (!current) "ON" else "OFF"}")
}

// v185: Playback Chapter List
internal fun PlayerActivity.showV185PlaybackChapterListToggle() {
    val current = BiliClient.prefs.v185playbackChapterList
    BiliClient.prefs.v185playbackChapterList = !current
    AppToast.show(this, "Playback Chapter List: ${if (!current) "ON" else "OFF"}")
}

// v185: Screenshot Crop Ratio
internal fun PlayerActivity.showV185ScreenshotCropRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185screenshotCropRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185screenshotCropRatio = value
        AppToast.show(this, "Screenshot Crop Ratio: $value")
    }
}

// v185: Video HDR10 ToneMap185
internal fun PlayerActivity.showV185VideoHDR10ToneMap185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185videoHDR10ToneMap185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185videoHDR10ToneMap185 = value
        AppToast.show(this, "Video HDR10 ToneMap185: $value")
    }
}

// v185: Danmaku Fixed Shadow
internal fun PlayerActivity.showV185DanmakuFixedShadowToggle() {
    val current = BiliClient.prefs.v185danmakuFixedShadow
    BiliClient.prefs.v185danmakuFixedShadow = !current
    AppToast.show(this, "Danmaku Fixed Shadow: ${if (!current) "ON" else "OFF"}")
}

// v185: Subtitle Bg Border186
internal fun PlayerActivity.showV185SubtitleBgBorder186Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder186
    BiliClient.prefs.v185subtitleBgBorder186 = !current
    AppToast.show(this, "Subtitle Bg Border186: ${if (!current) "ON" else "OFF"}")
}

// v186: Audio Stereo Widen186
internal fun PlayerActivity.showV186AudioStereoWiden186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186audioStereoWiden186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186audioStereoWiden186 = value
        AppToast.show(this, "Audio Stereo Widen186: $value")
    }
}

// v186: Danmaku Fixed Shadow186
internal fun PlayerActivity.showV186DanmakuFixedShadow186Toggle() {
    val current = BiliClient.prefs.v186danmakuFixedShadow186
    BiliClient.prefs.v186danmakuFixedShadow186 = !current
    AppToast.show(this, "Danmaku Fixed Shadow186: ${if (!current) "ON" else "OFF"}")
}

// v186: Subtitle Bg Border187
internal fun PlayerActivity.showV186SubtitleBgBorder187Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder187
    BiliClient.prefs.v186subtitleBgBorder187 = !current
    AppToast.show(this, "Subtitle Bg Border187: ${if (!current) "ON" else "OFF"}")
}

// v186: Gesture Rotation Detect186
internal fun PlayerActivity.showV186GestureRotationDetect186Toggle() {
    val current = BiliClient.prefs.v186gestureRotationDetect186
    BiliClient.prefs.v186gestureRotationDetect186 = !current
    AppToast.show(this, "Gesture Rotation Detect186: ${if (!current) "ON" else "OFF"}")
}

// v186: Cast Audio Sync
internal fun PlayerActivity.showV186CastAudioSyncToggle() {
    val current = BiliClient.prefs.v186castAudioSync
    BiliClient.prefs.v186castAudioSync = !current
    AppToast.show(this, "Cast Audio Sync: ${if (!current) "ON" else "OFF"}")
}

// v186: Playlist Auto Skip Intro186
internal fun PlayerActivity.showV186PlaylistAutoSkipIntro186Toggle() {
    val current = BiliClient.prefs.v186playlistAutoSkipIntro186
    BiliClient.prefs.v186playlistAutoSkipIntro186 = !current
    AppToast.show(this, "Playlist Auto Skip Intro186: ${if (!current) "ON" else "OFF"}")
}

// v186: Cache Download Concurrent186
internal fun PlayerActivity.showV186CacheDownloadConcurrent186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186cacheDownloadConcurrent186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186cacheDownloadConcurrent186 = value
        AppToast.show(this, "Cache Download Concurrent186: $value")
    }
}

// v186: Progress Bar Thumb Shadow186
internal fun PlayerActivity.showV186ProgressBarThumbShadow186Toggle() {
    val current = BiliClient.prefs.v186progressBarThumbShadow186
    BiliClient.prefs.v186progressBarThumbShadow186 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow186: ${if (!current) "ON" else "OFF"}")
}

// v186: Volume Boost Auto186
internal fun PlayerActivity.showV186VolumeBoostAuto186Toggle() {
    val current = BiliClient.prefs.v186volumeBoostAuto186
    BiliClient.prefs.v186volumeBoostAuto186 = !current
    AppToast.show(this, "Volume Boost Auto186: ${if (!current) "ON" else "OFF"}")
}

// v186: History Bookmark Note186
internal fun PlayerActivity.showV186HistoryBookmarkNote186Toggle() {
    val current = BiliClient.prefs.v186historyBookmarkNote186
    BiliClient.prefs.v186historyBookmarkNote186 = !current
    AppToast.show(this, "History Bookmark Note186: ${if (!current) "ON" else "OFF"}")
}

// v186: Playback Chapter List186
internal fun PlayerActivity.showV186PlaybackChapterList186Toggle() {
    val current = BiliClient.prefs.v186playbackChapterList186
    BiliClient.prefs.v186playbackChapterList186 = !current
    AppToast.show(this, "Playback Chapter List186: ${if (!current) "ON" else "OFF"}")
}

// v186: Screenshot Crop Ratio186
internal fun PlayerActivity.showV186ScreenshotCropRatio186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186screenshotCropRatio186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186screenshotCropRatio186 = value
        AppToast.show(this, "Screenshot Crop Ratio186: $value")
    }
}

// v186: Video Wide Gamut186
internal fun PlayerActivity.showV186VideoWideGamut186Toggle() {
    val current = BiliClient.prefs.v186videoWideGamut186
    BiliClient.prefs.v186videoWideGamut186 = !current
    AppToast.show(this, "Video Wide Gamut186: ${if (!current) "ON" else "OFF"}")
}

// v186: Danmaku Fixed Outline
internal fun PlayerActivity.showV186DanmakuFixedOutlineToggle() {
    val current = BiliClient.prefs.v186danmakuFixedOutline
    BiliClient.prefs.v186danmakuFixedOutline = !current
    AppToast.show(this, "Danmaku Fixed Outline: ${if (!current) "ON" else "OFF"}")
}

// v186: Subtitle Bg Border188
internal fun PlayerActivity.showV186SubtitleBgBorder188Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder188
    BiliClient.prefs.v186subtitleBgBorder188 = !current
    AppToast.show(this, "Subtitle Bg Border188: ${if (!current) "ON" else "OFF"}")
}

// v187: Audio Stereo Widen187
internal fun PlayerActivity.showV187AudioStereoWiden187Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v187audioStereoWiden187).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen187",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v187audioStereoWiden187 = value
        AppToast.show(this, "Audio Stereo Widen187: $value")
    }
}

// v187: Danmaku Fixed Outline187
internal fun PlayerActivity.showV187DanmakuFixedOutline187Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline187
    BiliClient.prefs.v187danmakuFixedOutline187 = !current
    AppToast.show(this, "Danmaku Fixed Outline187: ${if (!current) "ON" else "OFF"}")
}

// v187: Subtitle Bg Border189
internal fun PlayerActivity.showV187SubtitleBgBorder189Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder189
    BiliClient.prefs.v187subtitleBgBorder189 = !current
    AppToast.show(this, "Subtitle Bg Border189: ${if (!current) "ON" else "OFF"}")
}

// v187: Gesture Rotation Lock
internal fun PlayerActivity.showV187GestureRotationLockToggle() {
    val current = BiliClient.prefs.v187gestureRotationLock
    BiliClient.prefs.v187gestureRotationLock = !current
    AppToast.show(this, "Gesture Rotation Lock: ${if (!current) "ON" else "OFF"}")
}

// v187: Cast Audio Sync187
internal fun PlayerActivity.showV187CastAudioSync187Toggle() {
    val current = BiliClient.prefs.v187castAudioSync187
    BiliClient.prefs.v187castAudioSync187 = !current
    AppToast.show(this, "Cast Audio Sync187: ${if (!current) "ON" else "OFF"}")
}

// v187: Playlist Auto Skip Outro
internal fun PlayerActivity.showV187PlaylistAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v187playlistAutoSkipOutro
    BiliClient.prefs.v187playlistAutoSkipOutro = !current
    AppToast.show(this, "Playlist Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
}

// v187: Cache Download Pause
internal fun PlayerActivity.showV187CacheDownloadPauseToggle() {
    val current = BiliClient.prefs.v187cacheDownloadPause
    BiliClient.prefs.v187cacheDownloadPause = !current
    AppToast.show(this, "Cache Download Pause: ${if (!current) "ON" else "OFF"}")
}

// v187: Progress Bar Thumb Border187
internal fun PlayerActivity.showV187ProgressBarThumbBorder187Toggle() {
    val current = BiliClient.prefs.v187progressBarThumbBorder187
    BiliClient.prefs.v187progressBarThumbBorder187 = !current
    AppToast.show(this, "Progress Bar Thumb Border187: ${if (!current) "ON" else "OFF"}")
}

// v187: Volume Boost Auto187
internal fun PlayerActivity.showV187VolumeBoostAuto187Toggle() {
    val current = BiliClient.prefs.v187volumeBoostAuto187
    BiliClient.prefs.v187volumeBoostAuto187 = !current
    AppToast.show(this, "Volume Boost Auto187: ${if (!current) "ON" else "OFF"}")
}

// v187: History Bookmark Share
internal fun PlayerActivity.showV187HistoryBookmarkShareToggle() {
    val current = BiliClient.prefs.v187historyBookmarkShare
    BiliClient.prefs.v187historyBookmarkShare = !current
    AppToast.show(this, "History Bookmark Share: ${if (!current) "ON" else "OFF"}")
}

// v187: Playback Chapter Auto Detect
internal fun PlayerActivity.showV187PlaybackChapterAutoDetectToggle() {
    val current = BiliClient.prefs.v187playbackChapterAutoDetect
    BiliClient.prefs.v187playbackChapterAutoDetect = !current
    AppToast.show(this, "Playback Chapter Auto Detect: ${if (!current) "ON" else "OFF"}")
}

// v187: Screenshot Crop Freeform
internal fun PlayerActivity.showV187ScreenshotCropFreeformToggle() {
    val current = BiliClient.prefs.v187screenshotCropFreeform
    BiliClient.prefs.v187screenshotCropFreeform = !current
    AppToast.show(this, "Screenshot Crop Freeform: ${if (!current) "ON" else "OFF"}")
}

// v187: Video Wide Gamut187
internal fun PlayerActivity.showV187VideoWideGamut187Toggle() {
    val current = BiliClient.prefs.v187videoWideGamut187
    BiliClient.prefs.v187videoWideGamut187 = !current
    AppToast.show(this, "Video Wide Gamut187: ${if (!current) "ON" else "OFF"}")
}

// v187: Danmaku Fixed Outline188
internal fun PlayerActivity.showV187DanmakuFixedOutline188Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline188
    BiliClient.prefs.v187danmakuFixedOutline188 = !current
    AppToast.show(this, "Danmaku Fixed Outline188: ${if (!current) "ON" else "OFF"}")
}

// v187: Subtitle Bg Border190
internal fun PlayerActivity.showV187SubtitleBgBorder190Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder190
    BiliClient.prefs.v187subtitleBgBorder190 = !current
    AppToast.show(this, "Subtitle Bg Border190: ${if (!current) "ON" else "OFF"}")
}

// v188: Audio Stereo Widen188
internal fun PlayerActivity.showV188AudioStereoWiden188Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188audioStereoWiden188).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen188",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188audioStereoWiden188 = value
        AppToast.show(this, "Audio Stereo Widen188: $value")
    }
}

// v188: Danmaku Fixed Outline189
internal fun PlayerActivity.showV188DanmakuFixedOutline189Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline189
    BiliClient.prefs.v188danmakuFixedOutline189 = !current
    AppToast.show(this, "Danmaku Fixed Outline189: ${if (!current) "ON" else "OFF"}")
}

// v188: Subtitle Bg Border191
internal fun PlayerActivity.showV188SubtitleBgBorder191Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder191
    BiliClient.prefs.v188subtitleBgBorder191 = !current
    AppToast.show(this, "Subtitle Bg Border191: ${if (!current) "ON" else "OFF"}")
}

// v188: Gesture Rotation Lock188
internal fun PlayerActivity.showV188GestureRotationLock188Toggle() {
    val current = BiliClient.prefs.v188gestureRotationLock188
    BiliClient.prefs.v188gestureRotationLock188 = !current
    AppToast.show(this, "Gesture Rotation Lock188: ${if (!current) "ON" else "OFF"}")
}

// v188: Cast Audio Delay
internal fun PlayerActivity.showV188CastAudioDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188castAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188castAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
}

// v188: Playlist Auto Skip Outro188
internal fun PlayerActivity.showV188PlaylistAutoSkipOutro188Toggle() {
    val current = BiliClient.prefs.v188playlistAutoSkipOutro188
    BiliClient.prefs.v188playlistAutoSkipOutro188 = !current
    AppToast.show(this, "Playlist Auto Skip Outro188: ${if (!current) "ON" else "OFF"}")
}

// v188: Cache Download Pause188
internal fun PlayerActivity.showV188CacheDownloadPause188Toggle() {
    val current = BiliClient.prefs.v188cacheDownloadPause188
    BiliClient.prefs.v188cacheDownloadPause188 = !current
    AppToast.show(this, "Cache Download Pause188: ${if (!current) "ON" else "OFF"}")
}

// v188: Progress Bar Thumb Border188
internal fun PlayerActivity.showV188ProgressBarThumbBorder188Toggle() {
    val current = BiliClient.prefs.v188progressBarThumbBorder188
    BiliClient.prefs.v188progressBarThumbBorder188 = !current
    AppToast.show(this, "Progress Bar Thumb Border188: ${if (!current) "ON" else "OFF"}")
}

// v188: Volume Boost Peak188
internal fun PlayerActivity.showV188VolumeBoostPeak188Toggle() {
    val current = BiliClient.prefs.v188volumeBoostPeak188
    BiliClient.prefs.v188volumeBoostPeak188 = !current
    AppToast.show(this, "Volume Boost Peak188: ${if (!current) "ON" else "OFF"}")
}

// v188: History Bookmark Share188
internal fun PlayerActivity.showV188HistoryBookmarkShare188Toggle() {
    val current = BiliClient.prefs.v188historyBookmarkShare188
    BiliClient.prefs.v188historyBookmarkShare188 = !current
    AppToast.show(this, "History Bookmark Share188: ${if (!current) "ON" else "OFF"}")
}

// v188: Playback Chapter Auto Detect188
internal fun PlayerActivity.showV188PlaybackChapterAutoDetect188Toggle() {
    val current = BiliClient.prefs.v188playbackChapterAutoDetect188
    BiliClient.prefs.v188playbackChapterAutoDetect188 = !current
    AppToast.show(this, "Playback Chapter Auto Detect188: ${if (!current) "ON" else "OFF"}")
}

// v188: Screenshot Crop Freeform188
internal fun PlayerActivity.showV188ScreenshotCropFreeform188Toggle() {
    val current = BiliClient.prefs.v188screenshotCropFreeform188
    BiliClient.prefs.v188screenshotCropFreeform188 = !current
    AppToast.show(this, "Screenshot Crop Freeform188: ${if (!current) "ON" else "OFF"}")
}

// v188: Video Wide Gamut188
internal fun PlayerActivity.showV188VideoWideGamut188Toggle() {
    val current = BiliClient.prefs.v188videoWideGamut188
    BiliClient.prefs.v188videoWideGamut188 = !current
    AppToast.show(this, "Video Wide Gamut188: ${if (!current) "ON" else "OFF"}")
}

// v188: Danmaku Fixed Outline190
internal fun PlayerActivity.showV188DanmakuFixedOutline190Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline190
    BiliClient.prefs.v188danmakuFixedOutline190 = !current
    AppToast.show(this, "Danmaku Fixed Outline190: ${if (!current) "ON" else "OFF"}")
}

// v188: Subtitle Bg Border192
internal fun PlayerActivity.showV188SubtitleBgBorder192Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder192
    BiliClient.prefs.v188subtitleBgBorder192 = !current
    AppToast.show(this, "Subtitle Bg Border192: ${if (!current) "ON" else "OFF"}")
}

// v189: Audio Mono Toggle189
internal fun PlayerActivity.showV189AudioMonoToggle189Toggle() {
    val current = BiliClient.prefs.v189audioMonoToggle189
    BiliClient.prefs.v189audioMonoToggle189 = !current
    AppToast.show(this, "Audio Mono Toggle189: ${if (!current) "ON" else "OFF"}")
}

// v189: Danmaku Fixed Outline191
internal fun PlayerActivity.showV189DanmakuFixedOutline191Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedOutline191
    BiliClient.prefs.v189danmakuFixedOutline191 = !current
    AppToast.show(this, "Danmaku Fixed Outline191: ${if (!current) "ON" else "OFF"}")
}

// v189: Subtitle Bg Border193
internal fun PlayerActivity.showV189SubtitleBgBorder193Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder193
    BiliClient.prefs.v189subtitleBgBorder193 = !current
    AppToast.show(this, "Subtitle Bg Border193: ${if (!current) "ON" else "OFF"}")
}

// v189: Gesture Rotation Sensitivity
internal fun PlayerActivity.showV189GestureRotationSensitivityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189gestureRotationSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189gestureRotationSensitivity = value
        AppToast.show(this, "Gesture Rotation Sensitivity: $value")
    }
}

// v189: Cast Audio Delay189
internal fun PlayerActivity.showV189CastAudioDelay189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189castAudioDelay189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189castAudioDelay189 = value
        AppToast.show(this, "Cast Audio Delay189: $value")
    }
}

// v189: Playlist Auto Skip Outro189
internal fun PlayerActivity.showV189PlaylistAutoSkipOutro189Toggle() {
    val current = BiliClient.prefs.v189playlistAutoSkipOutro189
    BiliClient.prefs.v189playlistAutoSkipOutro189 = !current
    AppToast.show(this, "Playlist Auto Skip Outro189: ${if (!current) "ON" else "OFF"}")
}

// v189: Cache Download Speed189
internal fun PlayerActivity.showV189CacheDownloadSpeed189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189cacheDownloadSpeed189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189cacheDownloadSpeed189 = value
        AppToast.show(this, "Cache Download Speed189: $value")
    }
}

// v189: Progress Bar Thumb Border189
internal fun PlayerActivity.showV189ProgressBarThumbBorder189Toggle() {
    val current = BiliClient.prefs.v189progressBarThumbBorder189
    BiliClient.prefs.v189progressBarThumbBorder189 = !current
    AppToast.show(this, "Progress Bar Thumb Border189: ${if (!current) "ON" else "OFF"}")
}

// v189: Volume Boost Peak189
internal fun PlayerActivity.showV189VolumeBoostPeak189Toggle() {
    val current = BiliClient.prefs.v189volumeBoostPeak189
    BiliClient.prefs.v189volumeBoostPeak189 = !current
    AppToast.show(this, "Volume Boost Peak189: ${if (!current) "ON" else "OFF"}")
}

// v189: History Bookmark Export
internal fun PlayerActivity.showV189HistoryBookmarkExportToggle() {
    val current = BiliClient.prefs.v189historyBookmarkExport
    BiliClient.prefs.v189historyBookmarkExport = !current
    AppToast.show(this, "History Bookmark Export: ${if (!current) "ON" else "OFF"}")
}

// v189: Playback Chapter Sync
internal fun PlayerActivity.showV189PlaybackChapterSyncToggle() {
    val current = BiliClient.prefs.v189playbackChapterSync
    BiliClient.prefs.v189playbackChapterSync = !current
    AppToast.show(this, "Playback Chapter Sync: ${if (!current) "ON" else "OFF"}")
}

// v189: Screenshot Save Path
internal fun PlayerActivity.showV189ScreenshotSavePathToggle() {
    val current = BiliClient.prefs.v189screenshotSavePath
    BiliClient.prefs.v189screenshotSavePath = !current
    AppToast.show(this, "Screenshot Save Path: ${if (!current) "ON" else "OFF"}")
}

// v189: Video Wide Gamut189
internal fun PlayerActivity.showV189VideoWideGamut189Toggle() {
    val current = BiliClient.prefs.v189videoWideGamut189
    BiliClient.prefs.v189videoWideGamut189 = !current
    AppToast.show(this, "Video Wide Gamut189: ${if (!current) "ON" else "OFF"}")
}

// v189: Danmaku Fixed Border189
internal fun PlayerActivity.showV189DanmakuFixedBorder189Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedBorder189
    BiliClient.prefs.v189danmakuFixedBorder189 = !current
    AppToast.show(this, "Danmaku Fixed Border189: ${if (!current) "ON" else "OFF"}")
}

// v189: Subtitle Bg Border194
internal fun PlayerActivity.showV189SubtitleBgBorder194Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder194
    BiliClient.prefs.v189subtitleBgBorder194 = !current
    AppToast.show(this, "Subtitle Bg Border194: ${if (!current) "ON" else "OFF"}")
}

// v190: Audio Mono Toggle190
internal fun PlayerActivity.showV190AudioMonoToggle190Toggle() {
    val current = BiliClient.prefs.v190audioMonoToggle190
    BiliClient.prefs.v190audioMonoToggle190 = !current
    AppToast.show(this, "Audio Mono Toggle190: ${if (!current) "ON" else "OFF"}")
}

// v190: Danmaku Fixed Border190
internal fun PlayerActivity.showV190DanmakuFixedBorder190Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder190
    BiliClient.prefs.v190danmakuFixedBorder190 = !current
    AppToast.show(this, "Danmaku Fixed Border190: ${if (!current) "ON" else "OFF"}")
}

// v190: Subtitle Bg Border195
internal fun PlayerActivity.showV190SubtitleBgBorder195Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder195
    BiliClient.prefs.v190subtitleBgBorder195 = !current
    AppToast.show(this, "Subtitle Bg Border195: ${if (!current) "ON" else "OFF"}")
}

// v190: Gesture Rotation Sensitivity190
internal fun PlayerActivity.showV190GestureRotationSensitivity190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190gestureRotationSensitivity190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190gestureRotationSensitivity190 = value
        AppToast.show(this, "Gesture Rotation Sensitivity190: $value")
    }
}

// v190: Cast Audio Volume
internal fun PlayerActivity.showV190CastAudioVolumeDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v190castAudioVolume).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190castAudioVolume = value
        AppToast.show(this, "Cast Audio Volume: $value")
    }
}

// v190: Playlist Auto Skip Intro190
internal fun PlayerActivity.showV190PlaylistAutoSkipIntro190Toggle() {
    val current = BiliClient.prefs.v190playlistAutoSkipIntro190
    BiliClient.prefs.v190playlistAutoSkipIntro190 = !current
    AppToast.show(this, "Playlist Auto Skip Intro190: ${if (!current) "ON" else "OFF"}")
}

// v190: Cache Download Speed190
internal fun PlayerActivity.showV190CacheDownloadSpeed190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190cacheDownloadSpeed190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190cacheDownloadSpeed190 = value
        AppToast.show(this, "Cache Download Speed190: $value")
    }
}

// v190: Progress Bar Thumb Border190
internal fun PlayerActivity.showV190ProgressBarThumbBorder190Toggle() {
    val current = BiliClient.prefs.v190progressBarThumbBorder190
    BiliClient.prefs.v190progressBarThumbBorder190 = !current
    AppToast.show(this, "Progress Bar Thumb Border190: ${if (!current) "ON" else "OFF"}")
}

// v190: Volume Boost Peak190
internal fun PlayerActivity.showV190VolumeBoostPeak190Toggle() {
    val current = BiliClient.prefs.v190volumeBoostPeak190
    BiliClient.prefs.v190volumeBoostPeak190 = !current
    AppToast.show(this, "Volume Boost Peak190: ${if (!current) "ON" else "OFF"}")
}

// v190: History Bookmark Export190
internal fun PlayerActivity.showV190HistoryBookmarkExport190Toggle() {
    val current = BiliClient.prefs.v190historyBookmarkExport190
    BiliClient.prefs.v190historyBookmarkExport190 = !current
    AppToast.show(this, "History Bookmark Export190: ${if (!current) "ON" else "OFF"}")
}

// v190: Playback Chapter Sync190
internal fun PlayerActivity.showV190PlaybackChapterSync190Toggle() {
    val current = BiliClient.prefs.v190playbackChapterSync190
    BiliClient.prefs.v190playbackChapterSync190 = !current
    AppToast.show(this, "Playback Chapter Sync190: ${if (!current) "ON" else "OFF"}")
}

// v190: Screenshot Save Path190
internal fun PlayerActivity.showV190ScreenshotSavePath190Toggle() {
    val current = BiliClient.prefs.v190screenshotSavePath190
    BiliClient.prefs.v190screenshotSavePath190 = !current
    AppToast.show(this, "Screenshot Save Path190: ${if (!current) "ON" else "OFF"}")
}

// v190: Video Color Space190
internal fun PlayerActivity.showV190VideoColorSpace190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190videoColorSpace190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190videoColorSpace190 = value
        AppToast.show(this, "Video Color Space190: $value")
    }
}

// v190: Danmaku Fixed Border191
internal fun PlayerActivity.showV190DanmakuFixedBorder191Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder191
    BiliClient.prefs.v190danmakuFixedBorder191 = !current
    AppToast.show(this, "Danmaku Fixed Border191: ${if (!current) "ON" else "OFF"}")
}

// v190: Subtitle Bg Border196
internal fun PlayerActivity.showV190SubtitleBgBorder196Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder196
    BiliClient.prefs.v190subtitleBgBorder196 = !current
    AppToast.show(this, "Subtitle Bg Border196: ${if (!current) "ON" else "OFF"}")
}

// v191: Audio Delay Compensate191
internal fun PlayerActivity.showV191AudioDelayCompensate191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191audioDelayCompensate191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191audioDelayCompensate191 = value
        AppToast.show(this, "Audio Delay Compensate191: $value")
    }
}

// v191: Danmaku Top Max Count191
internal fun PlayerActivity.showV191DanmakuTopMaxCount191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount191 = value
        AppToast.show(this, "Danmaku Top Max Count191: $value")
    }
}

// v191: Subtitle Bg Color192
internal fun PlayerActivity.showV191SubtitleBgColor192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191subtitleBgColor192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191subtitleBgColor192 = value
        AppToast.show(this, "Subtitle Bg Color192: $value")
    }
}

// v191: Gesture Shake Action191
internal fun PlayerActivity.showV191GestureShakeAction191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191gestureShakeAction191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191gestureShakeAction191 = value
        AppToast.show(this, "Gesture Shake Action191: $value")
    }
}

// v191: Cast Audio Volume191
internal fun PlayerActivity.showV191CastAudioVolume191Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v191castAudioVolume191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191castAudioVolume191 = value
        AppToast.show(this, "Cast Audio Volume191: $value")
    }
}

// v191: Playlist Auto Skip Outro191
internal fun PlayerActivity.showV191PlaylistAutoSkipOutro191Toggle() {
    val current = BiliClient.prefs.v191playlistAutoSkipOutro191
    BiliClient.prefs.v191playlistAutoSkipOutro191 = !current
    AppToast.show(this, "Playlist Auto Skip Outro191: ${if (!current) "ON" else "OFF"}")
}

// v191: Cache Download Speed192
internal fun PlayerActivity.showV191CacheDownloadSpeed192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191cacheDownloadSpeed192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191cacheDownloadSpeed192 = value
        AppToast.show(this, "Cache Download Speed192: $value")
    }
}

// v191: Progress Bar Thumb Border191
internal fun PlayerActivity.showV191ProgressBarThumbBorder191Toggle() {
    val current = BiliClient.prefs.v191progressBarThumbBorder191
    BiliClient.prefs.v191progressBarThumbBorder191 = !current
    AppToast.show(this, "Progress Bar Thumb Border191: ${if (!current) "ON" else "OFF"}")
}

// v191: Volume Boost Peak191
internal fun PlayerActivity.showV191VolumeBoostPeak191Toggle() {
    val current = BiliClient.prefs.v191volumeBoostPeak191
    BiliClient.prefs.v191volumeBoostPeak191 = !current
    AppToast.show(this, "Volume Boost Peak191: ${if (!current) "ON" else "OFF"}")
}

// v191: History Bookmark Export191
internal fun PlayerActivity.showV191HistoryBookmarkExport191Toggle() {
    val current = BiliClient.prefs.v191historyBookmarkExport191
    BiliClient.prefs.v191historyBookmarkExport191 = !current
    AppToast.show(this, "History Bookmark Export191: ${if (!current) "ON" else "OFF"}")
}

// v191: Playback Chapter Sync191
internal fun PlayerActivity.showV191PlaybackChapterSync191Toggle() {
    val current = BiliClient.prefs.v191playbackChapterSync191
    BiliClient.prefs.v191playbackChapterSync191 = !current
    AppToast.show(this, "Playback Chapter Sync191: ${if (!current) "ON" else "OFF"}")
}

// v191: Screenshot Save Path191
internal fun PlayerActivity.showV191ScreenshotSavePath191Toggle() {
    val current = BiliClient.prefs.v191screenshotSavePath191
    BiliClient.prefs.v191screenshotSavePath191 = !current
    AppToast.show(this, "Screenshot Save Path191: ${if (!current) "ON" else "OFF"}")
}

// v191: Video Color Space191
internal fun PlayerActivity.showV191VideoColorSpace191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191videoColorSpace191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191videoColorSpace191 = value
        AppToast.show(this, "Video Color Space191: $value")
    }
}

// v191: Danmaku Top Max Count192
internal fun PlayerActivity.showV191DanmakuTopMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount192 = value
        AppToast.show(this, "Danmaku Top Max Count192: $value")
    }
}

// v191: Subtitle Bg Border197
internal fun PlayerActivity.showV191SubtitleBgBorder197Toggle() {
    val current = BiliClient.prefs.v191subtitleBgBorder197
    BiliClient.prefs.v191subtitleBgBorder197 = !current
    AppToast.show(this, "Subtitle Bg Border197: ${if (!current) "ON" else "OFF"}")
}

// v192: Audio Delay Compensate192
internal fun PlayerActivity.showV192AudioDelayCompensate192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192audioDelayCompensate192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192audioDelayCompensate192 = value
        AppToast.show(this, "Audio Delay Compensate192: $value")
    }
}

// v192: Danmaku Top Max Count193
internal fun PlayerActivity.showV192DanmakuTopMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuTopMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuTopMaxCount193 = value
        AppToast.show(this, "Danmaku Top Max Count193: $value")
    }
}

// v192: Subtitle Bg Border198
internal fun PlayerActivity.showV192SubtitleBgBorder198Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder198
    BiliClient.prefs.v192subtitleBgBorder198 = !current
    AppToast.show(this, "Subtitle Bg Border198: ${if (!current) "ON" else "OFF"}")
}

// v192: Gesture Shake Action192
internal fun PlayerActivity.showV192GestureShakeAction192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192gestureShakeAction192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192gestureShakeAction192 = value
        AppToast.show(this, "Gesture Shake Action192: $value")
    }
}

// v192: Cast Audio Volume192
internal fun PlayerActivity.showV192CastAudioVolume192Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v192castAudioVolume192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192castAudioVolume192 = value
        AppToast.show(this, "Cast Audio Volume192: $value")
    }
}

// v192: Playlist Auto Skip Outro192
internal fun PlayerActivity.showV192PlaylistAutoSkipOutro192Toggle() {
    val current = BiliClient.prefs.v192playlistAutoSkipOutro192
    BiliClient.prefs.v192playlistAutoSkipOutro192 = !current
    AppToast.show(this, "Playlist Auto Skip Outro192: ${if (!current) "ON" else "OFF"}")
}

// v192: Cache Download Speed193
internal fun PlayerActivity.showV192CacheDownloadSpeed193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192cacheDownloadSpeed193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192cacheDownloadSpeed193 = value
        AppToast.show(this, "Cache Download Speed193: $value")
    }
}

// v192: Progress Bar Thumb Border192
internal fun PlayerActivity.showV192ProgressBarThumbBorder192Toggle() {
    val current = BiliClient.prefs.v192progressBarThumbBorder192
    BiliClient.prefs.v192progressBarThumbBorder192 = !current
    AppToast.show(this, "Progress Bar Thumb Border192: ${if (!current) "ON" else "OFF"}")
}

// v192: Volume Boost Peak192
internal fun PlayerActivity.showV192VolumeBoostPeak192Toggle() {
    val current = BiliClient.prefs.v192volumeBoostPeak192
    BiliClient.prefs.v192volumeBoostPeak192 = !current
    AppToast.show(this, "Volume Boost Peak192: ${if (!current) "ON" else "OFF"}")
}

// v192: History Bookmark Export192
internal fun PlayerActivity.showV192HistoryBookmarkExport192Toggle() {
    val current = BiliClient.prefs.v192historyBookmarkExport192
    BiliClient.prefs.v192historyBookmarkExport192 = !current
    AppToast.show(this, "History Bookmark Export192: ${if (!current) "ON" else "OFF"}")
}

// v192: Playback Chapter Sync192
internal fun PlayerActivity.showV192PlaybackChapterSync192Toggle() {
    val current = BiliClient.prefs.v192playbackChapterSync192
    BiliClient.prefs.v192playbackChapterSync192 = !current
    AppToast.show(this, "Playback Chapter Sync192: ${if (!current) "ON" else "OFF"}")
}

// v192: Screenshot Save Path192
internal fun PlayerActivity.showV192ScreenshotSavePath192Toggle() {
    val current = BiliClient.prefs.v192screenshotSavePath192
    BiliClient.prefs.v192screenshotSavePath192 = !current
    AppToast.show(this, "Screenshot Save Path192: ${if (!current) "ON" else "OFF"}")
}

// v192: Video Color Space192
internal fun PlayerActivity.showV192VideoColorSpace192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192videoColorSpace192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192videoColorSpace192 = value
        AppToast.show(this, "Video Color Space192: $value")
    }
}

// v192: Danmaku Bottom Max Count192
internal fun PlayerActivity.showV192DanmakuBottomMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuBottomMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuBottomMaxCount192 = value
        AppToast.show(this, "Danmaku Bottom Max Count192: $value")
    }
}

// v192: Subtitle Bg Border199
internal fun PlayerActivity.showV192SubtitleBgBorder199Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder199
    BiliClient.prefs.v192subtitleBgBorder199 = !current
    AppToast.show(this, "Subtitle Bg Border199: ${if (!current) "ON" else "OFF"}")
}

// v193: Audio Delay Compensate193
internal fun PlayerActivity.showV193AudioDelayCompensate193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193audioDelayCompensate193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193audioDelayCompensate193 = value
        AppToast.show(this, "Audio Delay Compensate193: $value")
    }
}

// v193: Danmaku Bottom Max Count193
internal fun PlayerActivity.showV193DanmakuBottomMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount193 = value
        AppToast.show(this, "Danmaku Bottom Max Count193: $value")
    }
}

// v193: Subtitle Bg Border200
internal fun PlayerActivity.showV193SubtitleBgBorder200Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder200
    BiliClient.prefs.v193subtitleBgBorder200 = !current
    AppToast.show(this, "Subtitle Bg Border200: ${if (!current) "ON" else "OFF"}")
}

// v193: Gesture Shake Action193
internal fun PlayerActivity.showV193GestureShakeAction193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193gestureShakeAction193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193gestureShakeAction193 = value
        AppToast.show(this, "Gesture Shake Action193: $value")
    }
}

// v193: Cast Audio Volume193
internal fun PlayerActivity.showV193CastAudioVolume193Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v193castAudioVolume193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193castAudioVolume193 = value
        AppToast.show(this, "Cast Audio Volume193: $value")
    }
}

// v193: Playlist Auto Skip Outro193
internal fun PlayerActivity.showV193PlaylistAutoSkipOutro193Toggle() {
    val current = BiliClient.prefs.v193playlistAutoSkipOutro193
    BiliClient.prefs.v193playlistAutoSkipOutro193 = !current
    AppToast.show(this, "Playlist Auto Skip Outro193: ${if (!current) "ON" else "OFF"}")
}

// v193: Cache Download Speed194
internal fun PlayerActivity.showV193CacheDownloadSpeed194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193cacheDownloadSpeed194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193cacheDownloadSpeed194 = value
        AppToast.show(this, "Cache Download Speed194: $value")
    }
}

// v193: Progress Bar Thumb Border193
internal fun PlayerActivity.showV193ProgressBarThumbBorder193Toggle() {
    val current = BiliClient.prefs.v193progressBarThumbBorder193
    BiliClient.prefs.v193progressBarThumbBorder193 = !current
    AppToast.show(this, "Progress Bar Thumb Border193: ${if (!current) "ON" else "OFF"}")
}

// v193: Volume Boost Peak193
internal fun PlayerActivity.showV193VolumeBoostPeak193Toggle() {
    val current = BiliClient.prefs.v193volumeBoostPeak193
    BiliClient.prefs.v193volumeBoostPeak193 = !current
    AppToast.show(this, "Volume Boost Peak193: ${if (!current) "ON" else "OFF"}")
}

// v193: History Bookmark Export193
internal fun PlayerActivity.showV193HistoryBookmarkExport193Toggle() {
    val current = BiliClient.prefs.v193historyBookmarkExport193
    BiliClient.prefs.v193historyBookmarkExport193 = !current
    AppToast.show(this, "History Bookmark Export193: ${if (!current) "ON" else "OFF"}")
}

// v193: Playback Chapter Sync193
internal fun PlayerActivity.showV193PlaybackChapterSync193Toggle() {
    val current = BiliClient.prefs.v193playbackChapterSync193
    BiliClient.prefs.v193playbackChapterSync193 = !current
    AppToast.show(this, "Playback Chapter Sync193: ${if (!current) "ON" else "OFF"}")
}

// v193: Screenshot Save Path193
internal fun PlayerActivity.showV193ScreenshotSavePath193Toggle() {
    val current = BiliClient.prefs.v193screenshotSavePath193
    BiliClient.prefs.v193screenshotSavePath193 = !current
    AppToast.show(this, "Screenshot Save Path193: ${if (!current) "ON" else "OFF"}")
}

// v193: Video Color Space193
internal fun PlayerActivity.showV193VideoColorSpace193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193videoColorSpace193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193videoColorSpace193 = value
        AppToast.show(this, "Video Color Space193: $value")
    }
}

// v193: Danmaku Bottom Max Count194
internal fun PlayerActivity.showV193DanmakuBottomMaxCount194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount194 = value
        AppToast.show(this, "Danmaku Bottom Max Count194: $value")
    }
}

// v193: Subtitle Bg Border201
internal fun PlayerActivity.showV193SubtitleBgBorder201Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder201
    BiliClient.prefs.v193subtitleBgBorder201 = !current
    AppToast.show(this, "Subtitle Bg Border201: ${if (!current) "ON" else "OFF"}")
}

// v194: Audio Delay Compensate194
internal fun PlayerActivity.showV194AudioDelayCompensate194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194audioDelayCompensate194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194audioDelayCompensate194 = value
        AppToast.show(this, "Audio Delay Compensate194: $value")
    }
}

// v194: Danmaku Bottom Max Count195
internal fun PlayerActivity.showV194DanmakuBottomMaxCount195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount195 = value
        AppToast.show(this, "Danmaku Bottom Max Count195: $value")
    }
}

// v194: Subtitle Bg Border202
internal fun PlayerActivity.showV194SubtitleBgBorder202Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder202
    BiliClient.prefs.v194subtitleBgBorder202 = !current
    AppToast.show(this, "Subtitle Bg Border202: ${if (!current) "ON" else "OFF"}")
}

// v194: Gesture Shake Action194
internal fun PlayerActivity.showV194GestureShakeAction194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194gestureShakeAction194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194gestureShakeAction194 = value
        AppToast.show(this, "Gesture Shake Action194: $value")
    }
}

// v194: Cast Audio Volume194
internal fun PlayerActivity.showV194CastAudioVolume194Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v194castAudioVolume194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194castAudioVolume194 = value
        AppToast.show(this, "Cast Audio Volume194: $value")
    }
}

// v194: Playlist Auto Skip Outro194
internal fun PlayerActivity.showV194PlaylistAutoSkipOutro194Toggle() {
    val current = BiliClient.prefs.v194playlistAutoSkipOutro194
    BiliClient.prefs.v194playlistAutoSkipOutro194 = !current
    AppToast.show(this, "Playlist Auto Skip Outro194: ${if (!current) "ON" else "OFF"}")
}

// v194: Cache Download Speed195
internal fun PlayerActivity.showV194CacheDownloadSpeed195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194cacheDownloadSpeed195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194cacheDownloadSpeed195 = value
        AppToast.show(this, "Cache Download Speed195: $value")
    }
}

// v194: Progress Bar Thumb Border194
internal fun PlayerActivity.showV194ProgressBarThumbBorder194Toggle() {
    val current = BiliClient.prefs.v194progressBarThumbBorder194
    BiliClient.prefs.v194progressBarThumbBorder194 = !current
    AppToast.show(this, "Progress Bar Thumb Border194: ${if (!current) "ON" else "OFF"}")
}

// v194: Volume Boost Peak194
internal fun PlayerActivity.showV194VolumeBoostPeak194Toggle() {
    val current = BiliClient.prefs.v194volumeBoostPeak194
    BiliClient.prefs.v194volumeBoostPeak194 = !current
    AppToast.show(this, "Volume Boost Peak194: ${if (!current) "ON" else "OFF"}")
}

// v194: History Bookmark Export194
internal fun PlayerActivity.showV194HistoryBookmarkExport194Toggle() {
    val current = BiliClient.prefs.v194historyBookmarkExport194
    BiliClient.prefs.v194historyBookmarkExport194 = !current
    AppToast.show(this, "History Bookmark Export194: ${if (!current) "ON" else "OFF"}")
}

// v194: Playback Chapter Sync194
internal fun PlayerActivity.showV194PlaybackChapterSync194Toggle() {
    val current = BiliClient.prefs.v194playbackChapterSync194
    BiliClient.prefs.v194playbackChapterSync194 = !current
    AppToast.show(this, "Playback Chapter Sync194: ${if (!current) "ON" else "OFF"}")
}

// v194: Screenshot Save Path194
internal fun PlayerActivity.showV194ScreenshotSavePath194Toggle() {
    val current = BiliClient.prefs.v194screenshotSavePath194
    BiliClient.prefs.v194screenshotSavePath194 = !current
    AppToast.show(this, "Screenshot Save Path194: ${if (!current) "ON" else "OFF"}")
}

// v194: Video Color Space194
internal fun PlayerActivity.showV194VideoColorSpace194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194videoColorSpace194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194videoColorSpace194 = value
        AppToast.show(this, "Video Color Space194: $value")
    }
}

// v194: Danmaku Bottom Max Count196
internal fun PlayerActivity.showV194DanmakuBottomMaxCount196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount196 = value
        AppToast.show(this, "Danmaku Bottom Max Count196: $value")
    }
}

// v194: Subtitle Bg Border203
internal fun PlayerActivity.showV194SubtitleBgBorder203Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder203
    BiliClient.prefs.v194subtitleBgBorder203 = !current
    AppToast.show(this, "Subtitle Bg Border203: ${if (!current) "ON" else "OFF"}")
}

// v195: Audio Delay Compensate195
internal fun PlayerActivity.showV195AudioDelayCompensate195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195audioDelayCompensate195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195audioDelayCompensate195 = value
        AppToast.show(this, "Audio Delay Compensate195: $value")
    }
}

// v195: Danmaku Bottom Max Count197
internal fun PlayerActivity.showV195DanmakuBottomMaxCount197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount197 = value
        AppToast.show(this, "Danmaku Bottom Max Count197: $value")
    }
}

// v195: Subtitle Bg Border204
internal fun PlayerActivity.showV195SubtitleBgBorder204Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder204
    BiliClient.prefs.v195subtitleBgBorder204 = !current
    AppToast.show(this, "Subtitle Bg Border204: ${if (!current) "ON" else "OFF"}")
}

// v195: Gesture Shake Action195
internal fun PlayerActivity.showV195GestureShakeAction195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195gestureShakeAction195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195gestureShakeAction195 = value
        AppToast.show(this, "Gesture Shake Action195: $value")
    }
}

// v195: Cast Audio Volume195
internal fun PlayerActivity.showV195CastAudioVolume195Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v195castAudioVolume195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195castAudioVolume195 = value
        AppToast.show(this, "Cast Audio Volume195: $value")
    }
}

// v195: Playlist Auto Skip Outro195
internal fun PlayerActivity.showV195PlaylistAutoSkipOutro195Toggle() {
    val current = BiliClient.prefs.v195playlistAutoSkipOutro195
    BiliClient.prefs.v195playlistAutoSkipOutro195 = !current
    AppToast.show(this, "Playlist Auto Skip Outro195: ${if (!current) "ON" else "OFF"}")
}

// v195: Cache Download Speed196
internal fun PlayerActivity.showV195CacheDownloadSpeed196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195cacheDownloadSpeed196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195cacheDownloadSpeed196 = value
        AppToast.show(this, "Cache Download Speed196: $value")
    }
}

// v195: Progress Bar Thumb Border195
internal fun PlayerActivity.showV195ProgressBarThumbBorder195Toggle() {
    val current = BiliClient.prefs.v195progressBarThumbBorder195
    BiliClient.prefs.v195progressBarThumbBorder195 = !current
    AppToast.show(this, "Progress Bar Thumb Border195: ${if (!current) "ON" else "OFF"}")
}

// v195: Volume Boost Peak195
internal fun PlayerActivity.showV195VolumeBoostPeak195Toggle() {
    val current = BiliClient.prefs.v195volumeBoostPeak195
    BiliClient.prefs.v195volumeBoostPeak195 = !current
    AppToast.show(this, "Volume Boost Peak195: ${if (!current) "ON" else "OFF"}")
}

// v195: History Bookmark Export195
internal fun PlayerActivity.showV195HistoryBookmarkExport195Toggle() {
    val current = BiliClient.prefs.v195historyBookmarkExport195
    BiliClient.prefs.v195historyBookmarkExport195 = !current
    AppToast.show(this, "History Bookmark Export195: ${if (!current) "ON" else "OFF"}")
}

// v195: Playback Chapter Sync195
internal fun PlayerActivity.showV195PlaybackChapterSync195Toggle() {
    val current = BiliClient.prefs.v195playbackChapterSync195
    BiliClient.prefs.v195playbackChapterSync195 = !current
    AppToast.show(this, "Playback Chapter Sync195: ${if (!current) "ON" else "OFF"}")
}

// v195: Screenshot Save Path195
internal fun PlayerActivity.showV195ScreenshotSavePath195Toggle() {
    val current = BiliClient.prefs.v195screenshotSavePath195
    BiliClient.prefs.v195screenshotSavePath195 = !current
    AppToast.show(this, "Screenshot Save Path195: ${if (!current) "ON" else "OFF"}")
}

// v195: Video Color Space195
internal fun PlayerActivity.showV195VideoColorSpace195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195videoColorSpace195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195videoColorSpace195 = value
        AppToast.show(this, "Video Color Space195: $value")
    }
}

// v195: Danmaku Bottom Max Count198
internal fun PlayerActivity.showV195DanmakuBottomMaxCount198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount198 = value
        AppToast.show(this, "Danmaku Bottom Max Count198: $value")
    }
}

// v195: Subtitle Bg Border205
internal fun PlayerActivity.showV195SubtitleBgBorder205Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder205
    BiliClient.prefs.v195subtitleBgBorder205 = !current
    AppToast.show(this, "Subtitle Bg Border205: ${if (!current) "ON" else "OFF"}")
}

// v196: Audio Delay Compensate196
internal fun PlayerActivity.showV196AudioDelayCompensate196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196audioDelayCompensate196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196audioDelayCompensate196 = value
        AppToast.show(this, "Audio Delay Compensate196: $value")
    }
}

// v196: Danmaku Bottom Max Count199
internal fun PlayerActivity.showV196DanmakuBottomMaxCount199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount199 = value
        AppToast.show(this, "Danmaku Bottom Max Count199: $value")
    }
}

// v196: Subtitle Bg Border206
internal fun PlayerActivity.showV196SubtitleBgBorder206Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder206
    BiliClient.prefs.v196subtitleBgBorder206 = !current
    AppToast.show(this, "Subtitle Bg Border206: ${if (!current) "ON" else "OFF"}")
}

// v196: Gesture Shake Action196
internal fun PlayerActivity.showV196GestureShakeAction196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196gestureShakeAction196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196gestureShakeAction196 = value
        AppToast.show(this, "Gesture Shake Action196: $value")
    }
}

// v196: Cast Audio Volume196
internal fun PlayerActivity.showV196CastAudioVolume196Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v196castAudioVolume196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196castAudioVolume196 = value
        AppToast.show(this, "Cast Audio Volume196: $value")
    }
}

// v196: Playlist Auto Skip Outro196
internal fun PlayerActivity.showV196PlaylistAutoSkipOutro196Toggle() {
    val current = BiliClient.prefs.v196playlistAutoSkipOutro196
    BiliClient.prefs.v196playlistAutoSkipOutro196 = !current
    AppToast.show(this, "Playlist Auto Skip Outro196: ${if (!current) "ON" else "OFF"}")
}

// v196: Cache Download Speed197
internal fun PlayerActivity.showV196CacheDownloadSpeed197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196cacheDownloadSpeed197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196cacheDownloadSpeed197 = value
        AppToast.show(this, "Cache Download Speed197: $value")
    }
}

// v196: Progress Bar Thumb Border196
internal fun PlayerActivity.showV196ProgressBarThumbBorder196Toggle() {
    val current = BiliClient.prefs.v196progressBarThumbBorder196
    BiliClient.prefs.v196progressBarThumbBorder196 = !current
    AppToast.show(this, "Progress Bar Thumb Border196: ${if (!current) "ON" else "OFF"}")
}

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
