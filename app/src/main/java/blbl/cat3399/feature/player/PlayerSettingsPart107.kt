package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1251: beer mode
internal fun PlayerActivity.showV1251BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1251beer
    FeaturePrefsStore.batch1251.v1251beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1251: bell mode
internal fun PlayerActivity.showV1251BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bell
    FeaturePrefsStore.batch1251.v1251bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1251: belt mode
internal fun PlayerActivity.showV1251BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1251belt
    FeaturePrefsStore.batch1251.v1251belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1251: bench mode
internal fun PlayerActivity.showV1251BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bench
    FeaturePrefsStore.batch1251.v1251bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1251: bend mode
internal fun PlayerActivity.showV1251BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bend
    FeaturePrefsStore.batch1251.v1251bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1251: berry level
internal fun PlayerActivity.showV1251BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1251: bible level
internal fun PlayerActivity.showV1251BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1251: bid level
internal fun PlayerActivity.showV1251BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1251: bike level
internal fun PlayerActivity.showV1251BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1251: bill level
internal fun PlayerActivity.showV1251BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1251: bird mode
internal fun PlayerActivity.showV1251BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bird
    FeaturePrefsStore.batch1251.v1251bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1251: birth mode
internal fun PlayerActivity.showV1251BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1251birth
    FeaturePrefsStore.batch1251.v1251birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1251: black mode
internal fun PlayerActivity.showV1251BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1251black
    FeaturePrefsStore.batch1251.v1251black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1251: blade mode
internal fun PlayerActivity.showV1251BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1251blade
    FeaturePrefsStore.batch1251.v1251blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1251: blame mode
internal fun PlayerActivity.showV1251BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1251blame
    FeaturePrefsStore.batch1251.v1251blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1252: beer mode
internal fun PlayerActivity.showV1252BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1252beer
    FeaturePrefsStore.batch1251.v1252beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1252: bell mode
internal fun PlayerActivity.showV1252BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bell
    FeaturePrefsStore.batch1251.v1252bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1252: belt mode
internal fun PlayerActivity.showV1252BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1252belt
    FeaturePrefsStore.batch1251.v1252belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1252: bench mode
internal fun PlayerActivity.showV1252BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bench
    FeaturePrefsStore.batch1251.v1252bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1252: bend mode
internal fun PlayerActivity.showV1252BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bend
    FeaturePrefsStore.batch1251.v1252bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1252: berry level
internal fun PlayerActivity.showV1252BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1252: bible level
internal fun PlayerActivity.showV1252BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1252: bid level
internal fun PlayerActivity.showV1252BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1252: bike level
internal fun PlayerActivity.showV1252BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1252: bill level
internal fun PlayerActivity.showV1252BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1252: bird mode
internal fun PlayerActivity.showV1252BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bird
    FeaturePrefsStore.batch1251.v1252bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1252: birth mode
internal fun PlayerActivity.showV1252BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1252birth
    FeaturePrefsStore.batch1251.v1252birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1252: black mode
internal fun PlayerActivity.showV1252BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1252black
    FeaturePrefsStore.batch1251.v1252black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1252: blade mode
internal fun PlayerActivity.showV1252BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1252blade
    FeaturePrefsStore.batch1251.v1252blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1252: blame mode
internal fun PlayerActivity.showV1252BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1252blame
    FeaturePrefsStore.batch1251.v1252blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1253: beer mode
internal fun PlayerActivity.showV1253BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1253beer
    FeaturePrefsStore.batch1251.v1253beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1253: bell mode
internal fun PlayerActivity.showV1253BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bell
    FeaturePrefsStore.batch1251.v1253bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1253: belt mode
internal fun PlayerActivity.showV1253BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1253belt
    FeaturePrefsStore.batch1251.v1253belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1253: bench mode
internal fun PlayerActivity.showV1253BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bench
    FeaturePrefsStore.batch1251.v1253bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1253: bend mode
internal fun PlayerActivity.showV1253BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bend
    FeaturePrefsStore.batch1251.v1253bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1253: berry level
internal fun PlayerActivity.showV1253BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1253: bible level
internal fun PlayerActivity.showV1253BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1253: bid level
internal fun PlayerActivity.showV1253BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1253: bike level
internal fun PlayerActivity.showV1253BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1253: bill level
internal fun PlayerActivity.showV1253BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1253: bird mode
internal fun PlayerActivity.showV1253BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bird
    FeaturePrefsStore.batch1251.v1253bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1253: birth mode
internal fun PlayerActivity.showV1253BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1253birth
    FeaturePrefsStore.batch1251.v1253birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1253: black mode
internal fun PlayerActivity.showV1253BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1253black
    FeaturePrefsStore.batch1251.v1253black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1253: blade mode
internal fun PlayerActivity.showV1253BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1253blade
    FeaturePrefsStore.batch1251.v1253blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1253: blame mode
internal fun PlayerActivity.showV1253BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1253blame
    FeaturePrefsStore.batch1251.v1253blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1254: beer mode
internal fun PlayerActivity.showV1254BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1254beer
    FeaturePrefsStore.batch1251.v1254beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1254: bell mode
internal fun PlayerActivity.showV1254BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bell
    FeaturePrefsStore.batch1251.v1254bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1254: belt mode
internal fun PlayerActivity.showV1254BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1254belt
    FeaturePrefsStore.batch1251.v1254belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1254: bench mode
internal fun PlayerActivity.showV1254BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bench
    FeaturePrefsStore.batch1251.v1254bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1254: bend mode
internal fun PlayerActivity.showV1254BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bend
    FeaturePrefsStore.batch1251.v1254bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1254: berry level
internal fun PlayerActivity.showV1254BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1254: bible level
internal fun PlayerActivity.showV1254BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1254: bid level
internal fun PlayerActivity.showV1254BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1254: bike level
internal fun PlayerActivity.showV1254BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1254: bill level
internal fun PlayerActivity.showV1254BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1254: bird mode
internal fun PlayerActivity.showV1254BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bird
    FeaturePrefsStore.batch1251.v1254bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1254: birth mode
internal fun PlayerActivity.showV1254BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1254birth
    FeaturePrefsStore.batch1251.v1254birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1254: black mode
internal fun PlayerActivity.showV1254BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1254black
    FeaturePrefsStore.batch1251.v1254black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1254: blade mode
internal fun PlayerActivity.showV1254BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1254blade
    FeaturePrefsStore.batch1251.v1254blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1254: blame mode
internal fun PlayerActivity.showV1254BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1254blame
    FeaturePrefsStore.batch1251.v1254blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1255: beer mode
internal fun PlayerActivity.showV1255BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1255beer
    FeaturePrefsStore.batch1251.v1255beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1255: bell mode
internal fun PlayerActivity.showV1255BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bell
    FeaturePrefsStore.batch1251.v1255bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1255: belt mode
internal fun PlayerActivity.showV1255BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1255belt
    FeaturePrefsStore.batch1251.v1255belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1255: bench mode
internal fun PlayerActivity.showV1255BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bench
    FeaturePrefsStore.batch1251.v1255bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1255: bend mode
internal fun PlayerActivity.showV1255BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bend
    FeaturePrefsStore.batch1251.v1255bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1255: berry level
internal fun PlayerActivity.showV1255BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1255: bible level
internal fun PlayerActivity.showV1255BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1255: bid level
internal fun PlayerActivity.showV1255BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1255: bike level
internal fun PlayerActivity.showV1255BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1255: bill level
internal fun PlayerActivity.showV1255BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1255: bird mode
internal fun PlayerActivity.showV1255BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bird
    FeaturePrefsStore.batch1251.v1255bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1255: birth mode
internal fun PlayerActivity.showV1255BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1255birth
    FeaturePrefsStore.batch1251.v1255birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1255: black mode
internal fun PlayerActivity.showV1255BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1255black
    FeaturePrefsStore.batch1251.v1255black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1255: blade mode
internal fun PlayerActivity.showV1255BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1255blade
    FeaturePrefsStore.batch1251.v1255blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1255: blame mode
internal fun PlayerActivity.showV1255BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1255blame
    FeaturePrefsStore.batch1251.v1255blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1256: beer mode
internal fun PlayerActivity.showV1256BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1256beer
    FeaturePrefsStore.batch1251.v1256beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1256: bell mode
internal fun PlayerActivity.showV1256BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bell
    FeaturePrefsStore.batch1251.v1256bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1256: belt mode
internal fun PlayerActivity.showV1256BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1256belt
    FeaturePrefsStore.batch1251.v1256belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1256: bench mode
internal fun PlayerActivity.showV1256BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bench
    FeaturePrefsStore.batch1251.v1256bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1256: bend mode
internal fun PlayerActivity.showV1256BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bend
    FeaturePrefsStore.batch1251.v1256bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1256: berry level
internal fun PlayerActivity.showV1256BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1256: bible level
internal fun PlayerActivity.showV1256BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1256: bid level
internal fun PlayerActivity.showV1256BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1256: bike level
internal fun PlayerActivity.showV1256BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1256: bill level
internal fun PlayerActivity.showV1256BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1256: bird mode
internal fun PlayerActivity.showV1256BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bird
    FeaturePrefsStore.batch1251.v1256bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1256: birth mode
internal fun PlayerActivity.showV1256BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1256birth
    FeaturePrefsStore.batch1251.v1256birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1256: black mode
internal fun PlayerActivity.showV1256BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1256black
    FeaturePrefsStore.batch1251.v1256black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1256: blade mode
internal fun PlayerActivity.showV1256BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1256blade
    FeaturePrefsStore.batch1251.v1256blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1256: blame mode
internal fun PlayerActivity.showV1256BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1256blame
    FeaturePrefsStore.batch1251.v1256blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1257: beer mode
internal fun PlayerActivity.showV1257BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1257beer
    FeaturePrefsStore.batch1251.v1257beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1257: bell mode
internal fun PlayerActivity.showV1257BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bell
    FeaturePrefsStore.batch1251.v1257bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1257: belt mode
internal fun PlayerActivity.showV1257BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1257belt
    FeaturePrefsStore.batch1251.v1257belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1257: bench mode
internal fun PlayerActivity.showV1257BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bench
    FeaturePrefsStore.batch1251.v1257bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1257: bend mode
internal fun PlayerActivity.showV1257BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bend
    FeaturePrefsStore.batch1251.v1257bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1257: berry level
internal fun PlayerActivity.showV1257BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1257: bible level
internal fun PlayerActivity.showV1257BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1257: bid level
internal fun PlayerActivity.showV1257BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1257: bike level
internal fun PlayerActivity.showV1257BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1257: bill level
internal fun PlayerActivity.showV1257BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1257: bird mode
internal fun PlayerActivity.showV1257BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bird
    FeaturePrefsStore.batch1251.v1257bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1257: birth mode
internal fun PlayerActivity.showV1257BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1257birth
    FeaturePrefsStore.batch1251.v1257birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1257: black mode
internal fun PlayerActivity.showV1257BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1257black
    FeaturePrefsStore.batch1251.v1257black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1257: blade mode
internal fun PlayerActivity.showV1257BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1257blade
    FeaturePrefsStore.batch1251.v1257blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1257: blame mode
internal fun PlayerActivity.showV1257BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1257blame
    FeaturePrefsStore.batch1251.v1257blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1258: beer mode
internal fun PlayerActivity.showV1258BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1258beer
    FeaturePrefsStore.batch1251.v1258beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1258: bell mode
internal fun PlayerActivity.showV1258BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bell
    FeaturePrefsStore.batch1251.v1258bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1258: belt mode
internal fun PlayerActivity.showV1258BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1258belt
    FeaturePrefsStore.batch1251.v1258belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1258: bench mode
internal fun PlayerActivity.showV1258BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bench
    FeaturePrefsStore.batch1251.v1258bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1258: bend mode
internal fun PlayerActivity.showV1258BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bend
    FeaturePrefsStore.batch1251.v1258bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1258: berry level
internal fun PlayerActivity.showV1258BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1258: bible level
internal fun PlayerActivity.showV1258BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1258: bid level
internal fun PlayerActivity.showV1258BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1258: bike level
internal fun PlayerActivity.showV1258BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1258: bill level
internal fun PlayerActivity.showV1258BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1258: bird mode
internal fun PlayerActivity.showV1258BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bird
    FeaturePrefsStore.batch1251.v1258bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1258: birth mode
internal fun PlayerActivity.showV1258BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1258birth
    FeaturePrefsStore.batch1251.v1258birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1258: black mode
internal fun PlayerActivity.showV1258BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1258black
    FeaturePrefsStore.batch1251.v1258black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1258: blade mode
internal fun PlayerActivity.showV1258BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1258blade
    FeaturePrefsStore.batch1251.v1258blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1258: blame mode
internal fun PlayerActivity.showV1258BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1258blame
    FeaturePrefsStore.batch1251.v1258blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1259: beer mode
internal fun PlayerActivity.showV1259BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1259beer
    FeaturePrefsStore.batch1251.v1259beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1259: bell mode
internal fun PlayerActivity.showV1259BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bell
    FeaturePrefsStore.batch1251.v1259bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1259: belt mode
internal fun PlayerActivity.showV1259BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1259belt
    FeaturePrefsStore.batch1251.v1259belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1259: bench mode
internal fun PlayerActivity.showV1259BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bench
    FeaturePrefsStore.batch1251.v1259bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1259: bend mode
internal fun PlayerActivity.showV1259BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bend
    FeaturePrefsStore.batch1251.v1259bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1259: berry level
internal fun PlayerActivity.showV1259BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1259: bible level
internal fun PlayerActivity.showV1259BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1259: bid level
internal fun PlayerActivity.showV1259BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1259: bike level
internal fun PlayerActivity.showV1259BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1259: bill level
internal fun PlayerActivity.showV1259BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1259: bird mode
internal fun PlayerActivity.showV1259BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bird
    FeaturePrefsStore.batch1251.v1259bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1259: birth mode
internal fun PlayerActivity.showV1259BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1259birth
    FeaturePrefsStore.batch1251.v1259birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1259: black mode
internal fun PlayerActivity.showV1259BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1259black
    FeaturePrefsStore.batch1251.v1259black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1259: blade mode
internal fun PlayerActivity.showV1259BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1259blade
    FeaturePrefsStore.batch1251.v1259blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1259: blame mode
internal fun PlayerActivity.showV1259BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1259blame
    FeaturePrefsStore.batch1251.v1259blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1260: beer mode
internal fun PlayerActivity.showV1260BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1260beer
    FeaturePrefsStore.batch1251.v1260beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1260: bell mode
internal fun PlayerActivity.showV1260BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bell
    FeaturePrefsStore.batch1251.v1260bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1260: belt mode
internal fun PlayerActivity.showV1260BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1260belt
    FeaturePrefsStore.batch1251.v1260belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1260: bench mode
internal fun PlayerActivity.showV1260BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bench
    FeaturePrefsStore.batch1251.v1260bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1260: bend mode
internal fun PlayerActivity.showV1260BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bend
    FeaturePrefsStore.batch1251.v1260bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1260: berry level
internal fun PlayerActivity.showV1260BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1260: bible level
internal fun PlayerActivity.showV1260BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1260: bid level
internal fun PlayerActivity.showV1260BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1260: bike level
internal fun PlayerActivity.showV1260BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1260: bill level
internal fun PlayerActivity.showV1260BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1260: bird mode
internal fun PlayerActivity.showV1260BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bird
    FeaturePrefsStore.batch1251.v1260bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1260: birth mode
internal fun PlayerActivity.showV1260BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1260birth
    FeaturePrefsStore.batch1251.v1260birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1260: black mode
internal fun PlayerActivity.showV1260BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1260black
    FeaturePrefsStore.batch1251.v1260black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1260: blade mode
internal fun PlayerActivity.showV1260BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1260blade
    FeaturePrefsStore.batch1251.v1260blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1260: blame mode
internal fun PlayerActivity.showV1260BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1260blame
    FeaturePrefsStore.batch1251.v1260blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

