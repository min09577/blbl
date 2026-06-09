package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1671: pistol mode
internal fun PlayerActivity.showV1671PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pistol
    FeaturePrefsStore.batch1671.v1671pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1671: pizza mode
internal fun PlayerActivity.showV1671PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pizza
    FeaturePrefsStore.batch1671.v1671pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1671: planet mode
internal fun PlayerActivity.showV1671PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1671planet
    FeaturePrefsStore.batch1671.v1671planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1671: plastic mode
internal fun PlayerActivity.showV1671PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1671plastic
    FeaturePrefsStore.batch1671.v1671plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1671: plate mode
internal fun PlayerActivity.showV1671PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1671plate
    FeaturePrefsStore.batch1671.v1671plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1671: please level
internal fun PlayerActivity.showV1671PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671please = value
        AppToast.show(this, "please: $value")
    }
}

// v1671: pledge level
internal fun PlayerActivity.showV1671PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1671: pluck level
internal fun PlayerActivity.showV1671PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1671: plug level
internal fun PlayerActivity.showV1671PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1671: plunge level
internal fun PlayerActivity.showV1671PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1671: poem mode
internal fun PlayerActivity.showV1671PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1671poem
    FeaturePrefsStore.batch1671.v1671poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1671: poet mode
internal fun PlayerActivity.showV1671PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1671poet
    FeaturePrefsStore.batch1671.v1671poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1671: point mode
internal fun PlayerActivity.showV1671PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1671point
    FeaturePrefsStore.batch1671.v1671point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1671: polar mode
internal fun PlayerActivity.showV1671PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1671polar
    FeaturePrefsStore.batch1671.v1671polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1671: pole mode
internal fun PlayerActivity.showV1671PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pole
    FeaturePrefsStore.batch1671.v1671pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1672: pistol mode
internal fun PlayerActivity.showV1672PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pistol
    FeaturePrefsStore.batch1671.v1672pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1672: pizza mode
internal fun PlayerActivity.showV1672PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pizza
    FeaturePrefsStore.batch1671.v1672pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1672: planet mode
internal fun PlayerActivity.showV1672PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1672planet
    FeaturePrefsStore.batch1671.v1672planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1672: plastic mode
internal fun PlayerActivity.showV1672PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1672plastic
    FeaturePrefsStore.batch1671.v1672plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1672: plate mode
internal fun PlayerActivity.showV1672PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1672plate
    FeaturePrefsStore.batch1671.v1672plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1672: please level
internal fun PlayerActivity.showV1672PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672please = value
        AppToast.show(this, "please: $value")
    }
}

// v1672: pledge level
internal fun PlayerActivity.showV1672PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1672: pluck level
internal fun PlayerActivity.showV1672PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1672: plug level
internal fun PlayerActivity.showV1672PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1672: plunge level
internal fun PlayerActivity.showV1672PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1672: poem mode
internal fun PlayerActivity.showV1672PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1672poem
    FeaturePrefsStore.batch1671.v1672poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1672: poet mode
internal fun PlayerActivity.showV1672PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1672poet
    FeaturePrefsStore.batch1671.v1672poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1672: point mode
internal fun PlayerActivity.showV1672PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1672point
    FeaturePrefsStore.batch1671.v1672point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1672: polar mode
internal fun PlayerActivity.showV1672PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1672polar
    FeaturePrefsStore.batch1671.v1672polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1672: pole mode
internal fun PlayerActivity.showV1672PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pole
    FeaturePrefsStore.batch1671.v1672pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1673: pistol mode
internal fun PlayerActivity.showV1673PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pistol
    FeaturePrefsStore.batch1671.v1673pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1673: pizza mode
internal fun PlayerActivity.showV1673PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pizza
    FeaturePrefsStore.batch1671.v1673pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1673: planet mode
internal fun PlayerActivity.showV1673PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1673planet
    FeaturePrefsStore.batch1671.v1673planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1673: plastic mode
internal fun PlayerActivity.showV1673PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1673plastic
    FeaturePrefsStore.batch1671.v1673plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1673: plate mode
internal fun PlayerActivity.showV1673PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1673plate
    FeaturePrefsStore.batch1671.v1673plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1673: please level
internal fun PlayerActivity.showV1673PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673please = value
        AppToast.show(this, "please: $value")
    }
}

// v1673: pledge level
internal fun PlayerActivity.showV1673PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1673: pluck level
internal fun PlayerActivity.showV1673PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1673: plug level
internal fun PlayerActivity.showV1673PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1673: plunge level
internal fun PlayerActivity.showV1673PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1673: poem mode
internal fun PlayerActivity.showV1673PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1673poem
    FeaturePrefsStore.batch1671.v1673poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1673: poet mode
internal fun PlayerActivity.showV1673PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1673poet
    FeaturePrefsStore.batch1671.v1673poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1673: point mode
internal fun PlayerActivity.showV1673PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1673point
    FeaturePrefsStore.batch1671.v1673point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1673: polar mode
internal fun PlayerActivity.showV1673PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1673polar
    FeaturePrefsStore.batch1671.v1673polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1673: pole mode
internal fun PlayerActivity.showV1673PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pole
    FeaturePrefsStore.batch1671.v1673pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1674: pistol mode
internal fun PlayerActivity.showV1674PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pistol
    FeaturePrefsStore.batch1671.v1674pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1674: pizza mode
internal fun PlayerActivity.showV1674PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pizza
    FeaturePrefsStore.batch1671.v1674pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1674: planet mode
internal fun PlayerActivity.showV1674PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1674planet
    FeaturePrefsStore.batch1671.v1674planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1674: plastic mode
internal fun PlayerActivity.showV1674PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1674plastic
    FeaturePrefsStore.batch1671.v1674plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1674: plate mode
internal fun PlayerActivity.showV1674PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1674plate
    FeaturePrefsStore.batch1671.v1674plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1674: please level
internal fun PlayerActivity.showV1674PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674please = value
        AppToast.show(this, "please: $value")
    }
}

// v1674: pledge level
internal fun PlayerActivity.showV1674PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1674: pluck level
internal fun PlayerActivity.showV1674PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1674: plug level
internal fun PlayerActivity.showV1674PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1674: plunge level
internal fun PlayerActivity.showV1674PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1674: poem mode
internal fun PlayerActivity.showV1674PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1674poem
    FeaturePrefsStore.batch1671.v1674poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1674: poet mode
internal fun PlayerActivity.showV1674PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1674poet
    FeaturePrefsStore.batch1671.v1674poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1674: point mode
internal fun PlayerActivity.showV1674PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1674point
    FeaturePrefsStore.batch1671.v1674point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1674: polar mode
internal fun PlayerActivity.showV1674PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1674polar
    FeaturePrefsStore.batch1671.v1674polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1674: pole mode
internal fun PlayerActivity.showV1674PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pole
    FeaturePrefsStore.batch1671.v1674pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1675: pistol mode
internal fun PlayerActivity.showV1675PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pistol
    FeaturePrefsStore.batch1671.v1675pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1675: pizza mode
internal fun PlayerActivity.showV1675PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pizza
    FeaturePrefsStore.batch1671.v1675pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1675: planet mode
internal fun PlayerActivity.showV1675PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1675planet
    FeaturePrefsStore.batch1671.v1675planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1675: plastic mode
internal fun PlayerActivity.showV1675PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1675plastic
    FeaturePrefsStore.batch1671.v1675plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1675: plate mode
internal fun PlayerActivity.showV1675PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1675plate
    FeaturePrefsStore.batch1671.v1675plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1675: please level
internal fun PlayerActivity.showV1675PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675please = value
        AppToast.show(this, "please: $value")
    }
}

// v1675: pledge level
internal fun PlayerActivity.showV1675PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1675: pluck level
internal fun PlayerActivity.showV1675PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1675: plug level
internal fun PlayerActivity.showV1675PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1675: plunge level
internal fun PlayerActivity.showV1675PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1675: poem mode
internal fun PlayerActivity.showV1675PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1675poem
    FeaturePrefsStore.batch1671.v1675poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1675: poet mode
internal fun PlayerActivity.showV1675PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1675poet
    FeaturePrefsStore.batch1671.v1675poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1675: point mode
internal fun PlayerActivity.showV1675PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1675point
    FeaturePrefsStore.batch1671.v1675point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1675: polar mode
internal fun PlayerActivity.showV1675PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1675polar
    FeaturePrefsStore.batch1671.v1675polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1675: pole mode
internal fun PlayerActivity.showV1675PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pole
    FeaturePrefsStore.batch1671.v1675pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1676: pistol mode
internal fun PlayerActivity.showV1676PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pistol
    FeaturePrefsStore.batch1671.v1676pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1676: pizza mode
internal fun PlayerActivity.showV1676PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pizza
    FeaturePrefsStore.batch1671.v1676pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1676: planet mode
internal fun PlayerActivity.showV1676PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1676planet
    FeaturePrefsStore.batch1671.v1676planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1676: plastic mode
internal fun PlayerActivity.showV1676PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1676plastic
    FeaturePrefsStore.batch1671.v1676plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1676: plate mode
internal fun PlayerActivity.showV1676PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1676plate
    FeaturePrefsStore.batch1671.v1676plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1676: please level
internal fun PlayerActivity.showV1676PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676please = value
        AppToast.show(this, "please: $value")
    }
}

// v1676: pledge level
internal fun PlayerActivity.showV1676PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1676: pluck level
internal fun PlayerActivity.showV1676PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1676: plug level
internal fun PlayerActivity.showV1676PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1676: plunge level
internal fun PlayerActivity.showV1676PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1676: poem mode
internal fun PlayerActivity.showV1676PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1676poem
    FeaturePrefsStore.batch1671.v1676poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1676: poet mode
internal fun PlayerActivity.showV1676PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1676poet
    FeaturePrefsStore.batch1671.v1676poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1676: point mode
internal fun PlayerActivity.showV1676PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1676point
    FeaturePrefsStore.batch1671.v1676point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1676: polar mode
internal fun PlayerActivity.showV1676PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1676polar
    FeaturePrefsStore.batch1671.v1676polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1676: pole mode
internal fun PlayerActivity.showV1676PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pole
    FeaturePrefsStore.batch1671.v1676pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1677: pistol mode
internal fun PlayerActivity.showV1677PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pistol
    FeaturePrefsStore.batch1671.v1677pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1677: pizza mode
internal fun PlayerActivity.showV1677PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pizza
    FeaturePrefsStore.batch1671.v1677pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1677: planet mode
internal fun PlayerActivity.showV1677PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1677planet
    FeaturePrefsStore.batch1671.v1677planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1677: plastic mode
internal fun PlayerActivity.showV1677PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1677plastic
    FeaturePrefsStore.batch1671.v1677plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1677: plate mode
internal fun PlayerActivity.showV1677PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1677plate
    FeaturePrefsStore.batch1671.v1677plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1677: please level
internal fun PlayerActivity.showV1677PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677please = value
        AppToast.show(this, "please: $value")
    }
}

// v1677: pledge level
internal fun PlayerActivity.showV1677PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1677: pluck level
internal fun PlayerActivity.showV1677PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1677: plug level
internal fun PlayerActivity.showV1677PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1677: plunge level
internal fun PlayerActivity.showV1677PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1677: poem mode
internal fun PlayerActivity.showV1677PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1677poem
    FeaturePrefsStore.batch1671.v1677poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1677: poet mode
internal fun PlayerActivity.showV1677PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1677poet
    FeaturePrefsStore.batch1671.v1677poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1677: point mode
internal fun PlayerActivity.showV1677PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1677point
    FeaturePrefsStore.batch1671.v1677point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1677: polar mode
internal fun PlayerActivity.showV1677PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1677polar
    FeaturePrefsStore.batch1671.v1677polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1677: pole mode
internal fun PlayerActivity.showV1677PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pole
    FeaturePrefsStore.batch1671.v1677pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1678: pistol mode
internal fun PlayerActivity.showV1678PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pistol
    FeaturePrefsStore.batch1671.v1678pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1678: pizza mode
internal fun PlayerActivity.showV1678PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pizza
    FeaturePrefsStore.batch1671.v1678pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1678: planet mode
internal fun PlayerActivity.showV1678PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1678planet
    FeaturePrefsStore.batch1671.v1678planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1678: plastic mode
internal fun PlayerActivity.showV1678PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1678plastic
    FeaturePrefsStore.batch1671.v1678plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1678: plate mode
internal fun PlayerActivity.showV1678PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1678plate
    FeaturePrefsStore.batch1671.v1678plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1678: please level
internal fun PlayerActivity.showV1678PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678please = value
        AppToast.show(this, "please: $value")
    }
}

// v1678: pledge level
internal fun PlayerActivity.showV1678PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1678: pluck level
internal fun PlayerActivity.showV1678PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1678: plug level
internal fun PlayerActivity.showV1678PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1678: plunge level
internal fun PlayerActivity.showV1678PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1678: poem mode
internal fun PlayerActivity.showV1678PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1678poem
    FeaturePrefsStore.batch1671.v1678poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1678: poet mode
internal fun PlayerActivity.showV1678PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1678poet
    FeaturePrefsStore.batch1671.v1678poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1678: point mode
internal fun PlayerActivity.showV1678PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1678point
    FeaturePrefsStore.batch1671.v1678point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1678: polar mode
internal fun PlayerActivity.showV1678PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1678polar
    FeaturePrefsStore.batch1671.v1678polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1678: pole mode
internal fun PlayerActivity.showV1678PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pole
    FeaturePrefsStore.batch1671.v1678pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1679: pistol mode
internal fun PlayerActivity.showV1679PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pistol
    FeaturePrefsStore.batch1671.v1679pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1679: pizza mode
internal fun PlayerActivity.showV1679PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pizza
    FeaturePrefsStore.batch1671.v1679pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1679: planet mode
internal fun PlayerActivity.showV1679PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1679planet
    FeaturePrefsStore.batch1671.v1679planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1679: plastic mode
internal fun PlayerActivity.showV1679PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1679plastic
    FeaturePrefsStore.batch1671.v1679plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1679: plate mode
internal fun PlayerActivity.showV1679PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1679plate
    FeaturePrefsStore.batch1671.v1679plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1679: please level
internal fun PlayerActivity.showV1679PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679please = value
        AppToast.show(this, "please: $value")
    }
}

// v1679: pledge level
internal fun PlayerActivity.showV1679PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1679: pluck level
internal fun PlayerActivity.showV1679PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1679: plug level
internal fun PlayerActivity.showV1679PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1679: plunge level
internal fun PlayerActivity.showV1679PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1679: poem mode
internal fun PlayerActivity.showV1679PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1679poem
    FeaturePrefsStore.batch1671.v1679poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1679: poet mode
internal fun PlayerActivity.showV1679PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1679poet
    FeaturePrefsStore.batch1671.v1679poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1679: point mode
internal fun PlayerActivity.showV1679PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1679point
    FeaturePrefsStore.batch1671.v1679point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1679: polar mode
internal fun PlayerActivity.showV1679PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1679polar
    FeaturePrefsStore.batch1671.v1679polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1679: pole mode
internal fun PlayerActivity.showV1679PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pole
    FeaturePrefsStore.batch1671.v1679pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1680: pistol mode
internal fun PlayerActivity.showV1680PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pistol
    FeaturePrefsStore.batch1671.v1680pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1680: pizza mode
internal fun PlayerActivity.showV1680PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pizza
    FeaturePrefsStore.batch1671.v1680pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1680: planet mode
internal fun PlayerActivity.showV1680PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1680planet
    FeaturePrefsStore.batch1671.v1680planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1680: plastic mode
internal fun PlayerActivity.showV1680PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1680plastic
    FeaturePrefsStore.batch1671.v1680plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1680: plate mode
internal fun PlayerActivity.showV1680PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1680plate
    FeaturePrefsStore.batch1671.v1680plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1680: please level
internal fun PlayerActivity.showV1680PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680please = value
        AppToast.show(this, "please: $value")
    }
}

// v1680: pledge level
internal fun PlayerActivity.showV1680PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1680: pluck level
internal fun PlayerActivity.showV1680PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1680: plug level
internal fun PlayerActivity.showV1680PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1680: plunge level
internal fun PlayerActivity.showV1680PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1680: poem mode
internal fun PlayerActivity.showV1680PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1680poem
    FeaturePrefsStore.batch1671.v1680poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1680: poet mode
internal fun PlayerActivity.showV1680PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1680poet
    FeaturePrefsStore.batch1671.v1680poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1680: point mode
internal fun PlayerActivity.showV1680PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1680point
    FeaturePrefsStore.batch1671.v1680point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1680: polar mode
internal fun PlayerActivity.showV1680PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1680polar
    FeaturePrefsStore.batch1671.v1680polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1680: pole mode
internal fun PlayerActivity.showV1680PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pole
    FeaturePrefsStore.batch1671.v1680pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

