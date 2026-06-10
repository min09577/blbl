package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1751: rival mode
internal fun PlayerActivity.showV1751RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1751rival
    FeaturePrefsStore.batch1751.v1751rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1751: river mode
internal fun PlayerActivity.showV1751RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1751river
    FeaturePrefsStore.batch1751.v1751river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1751: road mode
internal fun PlayerActivity.showV1751RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1751road
    FeaturePrefsStore.batch1751.v1751road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1751: roast mode
internal fun PlayerActivity.showV1751RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1751roast
    FeaturePrefsStore.batch1751.v1751roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1751: robot mode
internal fun PlayerActivity.showV1751RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1751robot
    FeaturePrefsStore.batch1751.v1751robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1751: robust level
internal fun PlayerActivity.showV1751RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1751robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1751robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1751: rocket level
internal fun PlayerActivity.showV1751RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1751rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1751rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1751: romance level
internal fun PlayerActivity.showV1751RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1751romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1751romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1751: roof level
internal fun PlayerActivity.showV1751RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1751roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1751roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1751: rookie level
internal fun PlayerActivity.showV1751RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1751rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1751rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1751: room mode
internal fun PlayerActivity.showV1751RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1751room
    FeaturePrefsStore.batch1751.v1751room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1751: rose mode
internal fun PlayerActivity.showV1751RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1751rose
    FeaturePrefsStore.batch1751.v1751rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1751: rough mode
internal fun PlayerActivity.showV1751RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1751rough
    FeaturePrefsStore.batch1751.v1751rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1751: royal mode
internal fun PlayerActivity.showV1751RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1751royal
    FeaturePrefsStore.batch1751.v1751royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1751: rubber mode
internal fun PlayerActivity.showV1751RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1751rubber
    FeaturePrefsStore.batch1751.v1751rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1752: rival mode
internal fun PlayerActivity.showV1752RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1752rival
    FeaturePrefsStore.batch1751.v1752rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1752: river mode
internal fun PlayerActivity.showV1752RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1752river
    FeaturePrefsStore.batch1751.v1752river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1752: road mode
internal fun PlayerActivity.showV1752RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1752road
    FeaturePrefsStore.batch1751.v1752road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1752: roast mode
internal fun PlayerActivity.showV1752RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1752roast
    FeaturePrefsStore.batch1751.v1752roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1752: robot mode
internal fun PlayerActivity.showV1752RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1752robot
    FeaturePrefsStore.batch1751.v1752robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1752: robust level
internal fun PlayerActivity.showV1752RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1752robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1752robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1752: rocket level
internal fun PlayerActivity.showV1752RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1752rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1752rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1752: romance level
internal fun PlayerActivity.showV1752RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1752romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1752romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1752: roof level
internal fun PlayerActivity.showV1752RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1752roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1752roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1752: rookie level
internal fun PlayerActivity.showV1752RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1752rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1752rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1752: room mode
internal fun PlayerActivity.showV1752RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1752room
    FeaturePrefsStore.batch1751.v1752room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1752: rose mode
internal fun PlayerActivity.showV1752RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1752rose
    FeaturePrefsStore.batch1751.v1752rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1752: rough mode
internal fun PlayerActivity.showV1752RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1752rough
    FeaturePrefsStore.batch1751.v1752rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1752: royal mode
internal fun PlayerActivity.showV1752RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1752royal
    FeaturePrefsStore.batch1751.v1752royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1752: rubber mode
internal fun PlayerActivity.showV1752RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1752rubber
    FeaturePrefsStore.batch1751.v1752rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1753: rival mode
internal fun PlayerActivity.showV1753RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1753rival
    FeaturePrefsStore.batch1751.v1753rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1753: river mode
internal fun PlayerActivity.showV1753RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1753river
    FeaturePrefsStore.batch1751.v1753river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1753: road mode
internal fun PlayerActivity.showV1753RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1753road
    FeaturePrefsStore.batch1751.v1753road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1753: roast mode
internal fun PlayerActivity.showV1753RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1753roast
    FeaturePrefsStore.batch1751.v1753roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1753: robot mode
internal fun PlayerActivity.showV1753RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1753robot
    FeaturePrefsStore.batch1751.v1753robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1753: robust level
internal fun PlayerActivity.showV1753RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1753robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1753robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1753: rocket level
internal fun PlayerActivity.showV1753RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1753rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1753rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1753: romance level
internal fun PlayerActivity.showV1753RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1753romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1753romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1753: roof level
internal fun PlayerActivity.showV1753RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1753roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1753roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1753: rookie level
internal fun PlayerActivity.showV1753RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1753rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1753rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1753: room mode
internal fun PlayerActivity.showV1753RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1753room
    FeaturePrefsStore.batch1751.v1753room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1753: rose mode
internal fun PlayerActivity.showV1753RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1753rose
    FeaturePrefsStore.batch1751.v1753rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1753: rough mode
internal fun PlayerActivity.showV1753RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1753rough
    FeaturePrefsStore.batch1751.v1753rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1753: royal mode
internal fun PlayerActivity.showV1753RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1753royal
    FeaturePrefsStore.batch1751.v1753royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1753: rubber mode
internal fun PlayerActivity.showV1753RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1753rubber
    FeaturePrefsStore.batch1751.v1753rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1754: rival mode
internal fun PlayerActivity.showV1754RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1754rival
    FeaturePrefsStore.batch1751.v1754rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1754: river mode
internal fun PlayerActivity.showV1754RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1754river
    FeaturePrefsStore.batch1751.v1754river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1754: road mode
internal fun PlayerActivity.showV1754RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1754road
    FeaturePrefsStore.batch1751.v1754road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1754: roast mode
internal fun PlayerActivity.showV1754RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1754roast
    FeaturePrefsStore.batch1751.v1754roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1754: robot mode
internal fun PlayerActivity.showV1754RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1754robot
    FeaturePrefsStore.batch1751.v1754robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1754: robust level
internal fun PlayerActivity.showV1754RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1754robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1754robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1754: rocket level
internal fun PlayerActivity.showV1754RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1754rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1754rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1754: romance level
internal fun PlayerActivity.showV1754RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1754romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1754romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1754: roof level
internal fun PlayerActivity.showV1754RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1754roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1754roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1754: rookie level
internal fun PlayerActivity.showV1754RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1754rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1754rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1754: room mode
internal fun PlayerActivity.showV1754RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1754room
    FeaturePrefsStore.batch1751.v1754room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1754: rose mode
internal fun PlayerActivity.showV1754RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1754rose
    FeaturePrefsStore.batch1751.v1754rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1754: rough mode
internal fun PlayerActivity.showV1754RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1754rough
    FeaturePrefsStore.batch1751.v1754rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1754: royal mode
internal fun PlayerActivity.showV1754RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1754royal
    FeaturePrefsStore.batch1751.v1754royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1754: rubber mode
internal fun PlayerActivity.showV1754RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1754rubber
    FeaturePrefsStore.batch1751.v1754rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1755: rival mode
internal fun PlayerActivity.showV1755RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1755rival
    FeaturePrefsStore.batch1751.v1755rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1755: river mode
internal fun PlayerActivity.showV1755RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1755river
    FeaturePrefsStore.batch1751.v1755river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1755: road mode
internal fun PlayerActivity.showV1755RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1755road
    FeaturePrefsStore.batch1751.v1755road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1755: roast mode
internal fun PlayerActivity.showV1755RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1755roast
    FeaturePrefsStore.batch1751.v1755roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1755: robot mode
internal fun PlayerActivity.showV1755RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1755robot
    FeaturePrefsStore.batch1751.v1755robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1755: robust level
internal fun PlayerActivity.showV1755RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1755robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1755robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1755: rocket level
internal fun PlayerActivity.showV1755RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1755rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1755rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1755: romance level
internal fun PlayerActivity.showV1755RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1755romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1755romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1755: roof level
internal fun PlayerActivity.showV1755RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1755roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1755roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1755: rookie level
internal fun PlayerActivity.showV1755RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1755rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1755rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1755: room mode
internal fun PlayerActivity.showV1755RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1755room
    FeaturePrefsStore.batch1751.v1755room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1755: rose mode
internal fun PlayerActivity.showV1755RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1755rose
    FeaturePrefsStore.batch1751.v1755rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1755: rough mode
internal fun PlayerActivity.showV1755RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1755rough
    FeaturePrefsStore.batch1751.v1755rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1755: royal mode
internal fun PlayerActivity.showV1755RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1755royal
    FeaturePrefsStore.batch1751.v1755royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1755: rubber mode
internal fun PlayerActivity.showV1755RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1755rubber
    FeaturePrefsStore.batch1751.v1755rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1756: rival mode
internal fun PlayerActivity.showV1756RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1756rival
    FeaturePrefsStore.batch1751.v1756rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1756: river mode
internal fun PlayerActivity.showV1756RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1756river
    FeaturePrefsStore.batch1751.v1756river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1756: road mode
internal fun PlayerActivity.showV1756RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1756road
    FeaturePrefsStore.batch1751.v1756road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1756: roast mode
internal fun PlayerActivity.showV1756RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1756roast
    FeaturePrefsStore.batch1751.v1756roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1756: robot mode
internal fun PlayerActivity.showV1756RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1756robot
    FeaturePrefsStore.batch1751.v1756robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1756: robust level
internal fun PlayerActivity.showV1756RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1756robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1756robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1756: rocket level
internal fun PlayerActivity.showV1756RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1756rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1756rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1756: romance level
internal fun PlayerActivity.showV1756RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1756romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1756romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1756: roof level
internal fun PlayerActivity.showV1756RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1756roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1756roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1756: rookie level
internal fun PlayerActivity.showV1756RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1756rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1756rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1756: room mode
internal fun PlayerActivity.showV1756RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1756room
    FeaturePrefsStore.batch1751.v1756room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1756: rose mode
internal fun PlayerActivity.showV1756RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1756rose
    FeaturePrefsStore.batch1751.v1756rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1756: rough mode
internal fun PlayerActivity.showV1756RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1756rough
    FeaturePrefsStore.batch1751.v1756rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1756: royal mode
internal fun PlayerActivity.showV1756RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1756royal
    FeaturePrefsStore.batch1751.v1756royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1756: rubber mode
internal fun PlayerActivity.showV1756RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1756rubber
    FeaturePrefsStore.batch1751.v1756rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1757: rival mode
internal fun PlayerActivity.showV1757RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1757rival
    FeaturePrefsStore.batch1751.v1757rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1757: river mode
internal fun PlayerActivity.showV1757RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1757river
    FeaturePrefsStore.batch1751.v1757river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1757: road mode
internal fun PlayerActivity.showV1757RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1757road
    FeaturePrefsStore.batch1751.v1757road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1757: roast mode
internal fun PlayerActivity.showV1757RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1757roast
    FeaturePrefsStore.batch1751.v1757roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1757: robot mode
internal fun PlayerActivity.showV1757RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1757robot
    FeaturePrefsStore.batch1751.v1757robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1757: robust level
internal fun PlayerActivity.showV1757RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1757robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1757robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1757: rocket level
internal fun PlayerActivity.showV1757RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1757rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1757rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1757: romance level
internal fun PlayerActivity.showV1757RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1757romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1757romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1757: roof level
internal fun PlayerActivity.showV1757RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1757roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1757roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1757: rookie level
internal fun PlayerActivity.showV1757RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1757rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1757rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1757: room mode
internal fun PlayerActivity.showV1757RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1757room
    FeaturePrefsStore.batch1751.v1757room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1757: rose mode
internal fun PlayerActivity.showV1757RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1757rose
    FeaturePrefsStore.batch1751.v1757rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1757: rough mode
internal fun PlayerActivity.showV1757RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1757rough
    FeaturePrefsStore.batch1751.v1757rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1757: royal mode
internal fun PlayerActivity.showV1757RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1757royal
    FeaturePrefsStore.batch1751.v1757royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1757: rubber mode
internal fun PlayerActivity.showV1757RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1757rubber
    FeaturePrefsStore.batch1751.v1757rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1758: rival mode
internal fun PlayerActivity.showV1758RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1758rival
    FeaturePrefsStore.batch1751.v1758rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1758: river mode
internal fun PlayerActivity.showV1758RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1758river
    FeaturePrefsStore.batch1751.v1758river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1758: road mode
internal fun PlayerActivity.showV1758RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1758road
    FeaturePrefsStore.batch1751.v1758road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1758: roast mode
internal fun PlayerActivity.showV1758RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1758roast
    FeaturePrefsStore.batch1751.v1758roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1758: robot mode
internal fun PlayerActivity.showV1758RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1758robot
    FeaturePrefsStore.batch1751.v1758robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1758: robust level
internal fun PlayerActivity.showV1758RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1758robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1758robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1758: rocket level
internal fun PlayerActivity.showV1758RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1758rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1758rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1758: romance level
internal fun PlayerActivity.showV1758RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1758romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1758romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1758: roof level
internal fun PlayerActivity.showV1758RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1758roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1758roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1758: rookie level
internal fun PlayerActivity.showV1758RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1758rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1758rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1758: room mode
internal fun PlayerActivity.showV1758RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1758room
    FeaturePrefsStore.batch1751.v1758room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1758: rose mode
internal fun PlayerActivity.showV1758RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1758rose
    FeaturePrefsStore.batch1751.v1758rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1758: rough mode
internal fun PlayerActivity.showV1758RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1758rough
    FeaturePrefsStore.batch1751.v1758rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1758: royal mode
internal fun PlayerActivity.showV1758RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1758royal
    FeaturePrefsStore.batch1751.v1758royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1758: rubber mode
internal fun PlayerActivity.showV1758RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1758rubber
    FeaturePrefsStore.batch1751.v1758rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1759: rival mode
internal fun PlayerActivity.showV1759RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1759rival
    FeaturePrefsStore.batch1751.v1759rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1759: river mode
internal fun PlayerActivity.showV1759RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1759river
    FeaturePrefsStore.batch1751.v1759river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1759: road mode
internal fun PlayerActivity.showV1759RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1759road
    FeaturePrefsStore.batch1751.v1759road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1759: roast mode
internal fun PlayerActivity.showV1759RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1759roast
    FeaturePrefsStore.batch1751.v1759roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1759: robot mode
internal fun PlayerActivity.showV1759RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1759robot
    FeaturePrefsStore.batch1751.v1759robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1759: robust level
internal fun PlayerActivity.showV1759RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1759robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1759robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1759: rocket level
internal fun PlayerActivity.showV1759RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1759rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1759rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1759: romance level
internal fun PlayerActivity.showV1759RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1759romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1759romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1759: roof level
internal fun PlayerActivity.showV1759RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1759roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1759roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1759: rookie level
internal fun PlayerActivity.showV1759RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1759rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1759rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1759: room mode
internal fun PlayerActivity.showV1759RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1759room
    FeaturePrefsStore.batch1751.v1759room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1759: rose mode
internal fun PlayerActivity.showV1759RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1759rose
    FeaturePrefsStore.batch1751.v1759rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1759: rough mode
internal fun PlayerActivity.showV1759RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1759rough
    FeaturePrefsStore.batch1751.v1759rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1759: royal mode
internal fun PlayerActivity.showV1759RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1759royal
    FeaturePrefsStore.batch1751.v1759royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1759: rubber mode
internal fun PlayerActivity.showV1759RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1759rubber
    FeaturePrefsStore.batch1751.v1759rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

// v1760: rival mode
internal fun PlayerActivity.showV1760RivalToggle() {
    val current = FeaturePrefsStore.batch1751.v1760rival
    FeaturePrefsStore.batch1751.v1760rival = !current
    AppToast.show(this, "rival: ${if (!current) "ON" else "OFF"}")
}

// v1760: river mode
internal fun PlayerActivity.showV1760RiverToggle() {
    val current = FeaturePrefsStore.batch1751.v1760river
    FeaturePrefsStore.batch1751.v1760river = !current
    AppToast.show(this, "river: ${if (!current) "ON" else "OFF"}")
}

// v1760: road mode
internal fun PlayerActivity.showV1760RoadToggle() {
    val current = FeaturePrefsStore.batch1751.v1760road
    FeaturePrefsStore.batch1751.v1760road = !current
    AppToast.show(this, "road: ${if (!current) "ON" else "OFF"}")
}

// v1760: roast mode
internal fun PlayerActivity.showV1760RoastToggle() {
    val current = FeaturePrefsStore.batch1751.v1760roast
    FeaturePrefsStore.batch1751.v1760roast = !current
    AppToast.show(this, "roast: ${if (!current) "ON" else "OFF"}")
}

// v1760: robot mode
internal fun PlayerActivity.showV1760RobotToggle() {
    val current = FeaturePrefsStore.batch1751.v1760robot
    FeaturePrefsStore.batch1751.v1760robot = !current
    AppToast.show(this, "robot: ${if (!current) "ON" else "OFF"}")
}

// v1760: robust level
internal fun PlayerActivity.showV1760RobustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1760robust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "robust level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1760robust = value
        AppToast.show(this, "robust: $value")
    }
}

// v1760: rocket level
internal fun PlayerActivity.showV1760RocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1760rocket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rocket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1760rocket = value
        AppToast.show(this, "rocket: $value")
    }
}

// v1760: romance level
internal fun PlayerActivity.showV1760RomanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1760romance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "romance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1760romance = value
        AppToast.show(this, "romance: $value")
    }
}

// v1760: roof level
internal fun PlayerActivity.showV1760RoofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1760roof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "roof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1760roof = value
        AppToast.show(this, "roof: $value")
    }
}

// v1760: rookie level
internal fun PlayerActivity.showV1760RookieDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1751.v1760rookie).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rookie level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1751.v1760rookie = value
        AppToast.show(this, "rookie: $value")
    }
}

// v1760: room mode
internal fun PlayerActivity.showV1760RoomToggle() {
    val current = FeaturePrefsStore.batch1751.v1760room
    FeaturePrefsStore.batch1751.v1760room = !current
    AppToast.show(this, "room: ${if (!current) "ON" else "OFF"}")
}

// v1760: rose mode
internal fun PlayerActivity.showV1760RoseToggle() {
    val current = FeaturePrefsStore.batch1751.v1760rose
    FeaturePrefsStore.batch1751.v1760rose = !current
    AppToast.show(this, "rose: ${if (!current) "ON" else "OFF"}")
}

// v1760: rough mode
internal fun PlayerActivity.showV1760RoughToggle() {
    val current = FeaturePrefsStore.batch1751.v1760rough
    FeaturePrefsStore.batch1751.v1760rough = !current
    AppToast.show(this, "rough: ${if (!current) "ON" else "OFF"}")
}

// v1760: royal mode
internal fun PlayerActivity.showV1760RoyalToggle() {
    val current = FeaturePrefsStore.batch1751.v1760royal
    FeaturePrefsStore.batch1751.v1760royal = !current
    AppToast.show(this, "royal: ${if (!current) "ON" else "OFF"}")
}

// v1760: rubber mode
internal fun PlayerActivity.showV1760RubberToggle() {
    val current = FeaturePrefsStore.batch1751.v1760rubber
    FeaturePrefsStore.batch1751.v1760rubber = !current
    AppToast.show(this, "rubber: ${if (!current) "ON" else "OFF"}")
}

