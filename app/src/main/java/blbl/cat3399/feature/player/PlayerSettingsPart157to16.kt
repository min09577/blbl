package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v1761: rude mode
internal fun PlayerActivity.showV1761RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rude
    FeaturePrefsStore.batch1761.v1761rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1761: rug mode
internal fun PlayerActivity.showV1761RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rug
    FeaturePrefsStore.batch1761.v1761rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1761: runway mode
internal fun PlayerActivity.showV1761RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1761runway
    FeaturePrefsStore.batch1761.v1761runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1761: rural mode
internal fun PlayerActivity.showV1761RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rural
    FeaturePrefsStore.batch1761.v1761rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1761: sad mode
internal fun PlayerActivity.showV1761SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1761sad
    FeaturePrefsStore.batch1761.v1761sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1761: saddle level
internal fun PlayerActivity.showV1761SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1761: sadness level
internal fun PlayerActivity.showV1761SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1761: sail level
internal fun PlayerActivity.showV1761SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1761: salad level
internal fun PlayerActivity.showV1761SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1761: salmon level
internal fun PlayerActivity.showV1761SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1761: salon mode
internal fun PlayerActivity.showV1761SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salon
    FeaturePrefsStore.batch1761.v1761salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1761: salt mode
internal fun PlayerActivity.showV1761SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salt
    FeaturePrefsStore.batch1761.v1761salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1761: salute mode
internal fun PlayerActivity.showV1761SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salute
    FeaturePrefsStore.batch1761.v1761salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1761: same mode
internal fun PlayerActivity.showV1761SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1761same
    FeaturePrefsStore.batch1761.v1761same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1761: sand mode
internal fun PlayerActivity.showV1761SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1761sand
    FeaturePrefsStore.batch1761.v1761sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1762: rude mode
internal fun PlayerActivity.showV1762RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rude
    FeaturePrefsStore.batch1761.v1762rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1762: rug mode
internal fun PlayerActivity.showV1762RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rug
    FeaturePrefsStore.batch1761.v1762rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1762: runway mode
internal fun PlayerActivity.showV1762RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1762runway
    FeaturePrefsStore.batch1761.v1762runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1762: rural mode
internal fun PlayerActivity.showV1762RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rural
    FeaturePrefsStore.batch1761.v1762rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1762: sad mode
internal fun PlayerActivity.showV1762SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1762sad
    FeaturePrefsStore.batch1761.v1762sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1762: saddle level
internal fun PlayerActivity.showV1762SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1762: sadness level
internal fun PlayerActivity.showV1762SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1762: sail level
internal fun PlayerActivity.showV1762SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1762: salad level
internal fun PlayerActivity.showV1762SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1762: salmon level
internal fun PlayerActivity.showV1762SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1762: salon mode
internal fun PlayerActivity.showV1762SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salon
    FeaturePrefsStore.batch1761.v1762salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1762: salt mode
internal fun PlayerActivity.showV1762SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salt
    FeaturePrefsStore.batch1761.v1762salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1762: salute mode
internal fun PlayerActivity.showV1762SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salute
    FeaturePrefsStore.batch1761.v1762salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1762: same mode
internal fun PlayerActivity.showV1762SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1762same
    FeaturePrefsStore.batch1761.v1762same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1762: sand mode
internal fun PlayerActivity.showV1762SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1762sand
    FeaturePrefsStore.batch1761.v1762sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1763: rude mode
internal fun PlayerActivity.showV1763RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rude
    FeaturePrefsStore.batch1761.v1763rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1763: rug mode
internal fun PlayerActivity.showV1763RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rug
    FeaturePrefsStore.batch1761.v1763rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1763: runway mode
internal fun PlayerActivity.showV1763RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1763runway
    FeaturePrefsStore.batch1761.v1763runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1763: rural mode
internal fun PlayerActivity.showV1763RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rural
    FeaturePrefsStore.batch1761.v1763rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1763: sad mode
internal fun PlayerActivity.showV1763SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1763sad
    FeaturePrefsStore.batch1761.v1763sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1763: saddle level
internal fun PlayerActivity.showV1763SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1763: sadness level
internal fun PlayerActivity.showV1763SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1763: sail level
internal fun PlayerActivity.showV1763SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1763: salad level
internal fun PlayerActivity.showV1763SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1763: salmon level
internal fun PlayerActivity.showV1763SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1763: salon mode
internal fun PlayerActivity.showV1763SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salon
    FeaturePrefsStore.batch1761.v1763salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1763: salt mode
internal fun PlayerActivity.showV1763SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salt
    FeaturePrefsStore.batch1761.v1763salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1763: salute mode
internal fun PlayerActivity.showV1763SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salute
    FeaturePrefsStore.batch1761.v1763salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1763: same mode
internal fun PlayerActivity.showV1763SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1763same
    FeaturePrefsStore.batch1761.v1763same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1763: sand mode
internal fun PlayerActivity.showV1763SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1763sand
    FeaturePrefsStore.batch1761.v1763sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1764: rude mode
internal fun PlayerActivity.showV1764RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rude
    FeaturePrefsStore.batch1761.v1764rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1764: rug mode
internal fun PlayerActivity.showV1764RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rug
    FeaturePrefsStore.batch1761.v1764rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1764: runway mode
internal fun PlayerActivity.showV1764RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1764runway
    FeaturePrefsStore.batch1761.v1764runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1764: rural mode
internal fun PlayerActivity.showV1764RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rural
    FeaturePrefsStore.batch1761.v1764rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1764: sad mode
internal fun PlayerActivity.showV1764SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1764sad
    FeaturePrefsStore.batch1761.v1764sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1764: saddle level
internal fun PlayerActivity.showV1764SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1764: sadness level
internal fun PlayerActivity.showV1764SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1764: sail level
internal fun PlayerActivity.showV1764SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1764: salad level
internal fun PlayerActivity.showV1764SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1764: salmon level
internal fun PlayerActivity.showV1764SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1764: salon mode
internal fun PlayerActivity.showV1764SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salon
    FeaturePrefsStore.batch1761.v1764salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1764: salt mode
internal fun PlayerActivity.showV1764SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salt
    FeaturePrefsStore.batch1761.v1764salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1764: salute mode
internal fun PlayerActivity.showV1764SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salute
    FeaturePrefsStore.batch1761.v1764salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1764: same mode
internal fun PlayerActivity.showV1764SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1764same
    FeaturePrefsStore.batch1761.v1764same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1764: sand mode
internal fun PlayerActivity.showV1764SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1764sand
    FeaturePrefsStore.batch1761.v1764sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1765: rude mode
internal fun PlayerActivity.showV1765RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rude
    FeaturePrefsStore.batch1761.v1765rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1765: rug mode
internal fun PlayerActivity.showV1765RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rug
    FeaturePrefsStore.batch1761.v1765rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1765: runway mode
internal fun PlayerActivity.showV1765RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1765runway
    FeaturePrefsStore.batch1761.v1765runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1765: rural mode
internal fun PlayerActivity.showV1765RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rural
    FeaturePrefsStore.batch1761.v1765rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1765: sad mode
internal fun PlayerActivity.showV1765SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1765sad
    FeaturePrefsStore.batch1761.v1765sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1765: saddle level
internal fun PlayerActivity.showV1765SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1765: sadness level
internal fun PlayerActivity.showV1765SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1765: sail level
internal fun PlayerActivity.showV1765SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1765: salad level
internal fun PlayerActivity.showV1765SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1765: salmon level
internal fun PlayerActivity.showV1765SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1765: salon mode
internal fun PlayerActivity.showV1765SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salon
    FeaturePrefsStore.batch1761.v1765salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1765: salt mode
internal fun PlayerActivity.showV1765SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salt
    FeaturePrefsStore.batch1761.v1765salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1765: salute mode
internal fun PlayerActivity.showV1765SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salute
    FeaturePrefsStore.batch1761.v1765salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1765: same mode
internal fun PlayerActivity.showV1765SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1765same
    FeaturePrefsStore.batch1761.v1765same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1765: sand mode
internal fun PlayerActivity.showV1765SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1765sand
    FeaturePrefsStore.batch1761.v1765sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1766: rude mode
internal fun PlayerActivity.showV1766RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rude
    FeaturePrefsStore.batch1761.v1766rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1766: rug mode
internal fun PlayerActivity.showV1766RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rug
    FeaturePrefsStore.batch1761.v1766rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1766: runway mode
internal fun PlayerActivity.showV1766RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1766runway
    FeaturePrefsStore.batch1761.v1766runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1766: rural mode
internal fun PlayerActivity.showV1766RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rural
    FeaturePrefsStore.batch1761.v1766rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1766: sad mode
internal fun PlayerActivity.showV1766SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1766sad
    FeaturePrefsStore.batch1761.v1766sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1766: saddle level
internal fun PlayerActivity.showV1766SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1766: sadness level
internal fun PlayerActivity.showV1766SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1766: sail level
internal fun PlayerActivity.showV1766SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1766: salad level
internal fun PlayerActivity.showV1766SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1766: salmon level
internal fun PlayerActivity.showV1766SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1766: salon mode
internal fun PlayerActivity.showV1766SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salon
    FeaturePrefsStore.batch1761.v1766salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1766: salt mode
internal fun PlayerActivity.showV1766SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salt
    FeaturePrefsStore.batch1761.v1766salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1766: salute mode
internal fun PlayerActivity.showV1766SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salute
    FeaturePrefsStore.batch1761.v1766salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1766: same mode
internal fun PlayerActivity.showV1766SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1766same
    FeaturePrefsStore.batch1761.v1766same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1766: sand mode
internal fun PlayerActivity.showV1766SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1766sand
    FeaturePrefsStore.batch1761.v1766sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1767: rude mode
internal fun PlayerActivity.showV1767RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rude
    FeaturePrefsStore.batch1761.v1767rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1767: rug mode
internal fun PlayerActivity.showV1767RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rug
    FeaturePrefsStore.batch1761.v1767rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1767: runway mode
internal fun PlayerActivity.showV1767RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1767runway
    FeaturePrefsStore.batch1761.v1767runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1767: rural mode
internal fun PlayerActivity.showV1767RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rural
    FeaturePrefsStore.batch1761.v1767rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1767: sad mode
internal fun PlayerActivity.showV1767SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1767sad
    FeaturePrefsStore.batch1761.v1767sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1767: saddle level
internal fun PlayerActivity.showV1767SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1767: sadness level
internal fun PlayerActivity.showV1767SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1767: sail level
internal fun PlayerActivity.showV1767SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1767: salad level
internal fun PlayerActivity.showV1767SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1767: salmon level
internal fun PlayerActivity.showV1767SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1767: salon mode
internal fun PlayerActivity.showV1767SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salon
    FeaturePrefsStore.batch1761.v1767salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1767: salt mode
internal fun PlayerActivity.showV1767SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salt
    FeaturePrefsStore.batch1761.v1767salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1767: salute mode
internal fun PlayerActivity.showV1767SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salute
    FeaturePrefsStore.batch1761.v1767salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1767: same mode
internal fun PlayerActivity.showV1767SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1767same
    FeaturePrefsStore.batch1761.v1767same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1767: sand mode
internal fun PlayerActivity.showV1767SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1767sand
    FeaturePrefsStore.batch1761.v1767sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1768: rude mode
internal fun PlayerActivity.showV1768RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rude
    FeaturePrefsStore.batch1761.v1768rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1768: rug mode
internal fun PlayerActivity.showV1768RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rug
    FeaturePrefsStore.batch1761.v1768rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1768: runway mode
internal fun PlayerActivity.showV1768RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1768runway
    FeaturePrefsStore.batch1761.v1768runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1768: rural mode
internal fun PlayerActivity.showV1768RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rural
    FeaturePrefsStore.batch1761.v1768rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1768: sad mode
internal fun PlayerActivity.showV1768SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1768sad
    FeaturePrefsStore.batch1761.v1768sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1768: saddle level
internal fun PlayerActivity.showV1768SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1768: sadness level
internal fun PlayerActivity.showV1768SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1768: sail level
internal fun PlayerActivity.showV1768SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1768: salad level
internal fun PlayerActivity.showV1768SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1768: salmon level
internal fun PlayerActivity.showV1768SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1768: salon mode
internal fun PlayerActivity.showV1768SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salon
    FeaturePrefsStore.batch1761.v1768salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1768: salt mode
internal fun PlayerActivity.showV1768SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salt
    FeaturePrefsStore.batch1761.v1768salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1768: salute mode
internal fun PlayerActivity.showV1768SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salute
    FeaturePrefsStore.batch1761.v1768salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1768: same mode
internal fun PlayerActivity.showV1768SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1768same
    FeaturePrefsStore.batch1761.v1768same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1768: sand mode
internal fun PlayerActivity.showV1768SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1768sand
    FeaturePrefsStore.batch1761.v1768sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1769: rude mode
internal fun PlayerActivity.showV1769RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rude
    FeaturePrefsStore.batch1761.v1769rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1769: rug mode
internal fun PlayerActivity.showV1769RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rug
    FeaturePrefsStore.batch1761.v1769rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1769: runway mode
internal fun PlayerActivity.showV1769RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1769runway
    FeaturePrefsStore.batch1761.v1769runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1769: rural mode
internal fun PlayerActivity.showV1769RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rural
    FeaturePrefsStore.batch1761.v1769rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1769: sad mode
internal fun PlayerActivity.showV1769SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1769sad
    FeaturePrefsStore.batch1761.v1769sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1769: saddle level
internal fun PlayerActivity.showV1769SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1769: sadness level
internal fun PlayerActivity.showV1769SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1769: sail level
internal fun PlayerActivity.showV1769SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1769: salad level
internal fun PlayerActivity.showV1769SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1769: salmon level
internal fun PlayerActivity.showV1769SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1769: salon mode
internal fun PlayerActivity.showV1769SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salon
    FeaturePrefsStore.batch1761.v1769salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1769: salt mode
internal fun PlayerActivity.showV1769SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salt
    FeaturePrefsStore.batch1761.v1769salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1769: salute mode
internal fun PlayerActivity.showV1769SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salute
    FeaturePrefsStore.batch1761.v1769salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1769: same mode
internal fun PlayerActivity.showV1769SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1769same
    FeaturePrefsStore.batch1761.v1769same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1769: sand mode
internal fun PlayerActivity.showV1769SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1769sand
    FeaturePrefsStore.batch1761.v1769sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1770: rude mode
internal fun PlayerActivity.showV1770RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rude
    FeaturePrefsStore.batch1761.v1770rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1770: rug mode
internal fun PlayerActivity.showV1770RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rug
    FeaturePrefsStore.batch1761.v1770rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1770: runway mode
internal fun PlayerActivity.showV1770RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1770runway
    FeaturePrefsStore.batch1761.v1770runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1770: rural mode
internal fun PlayerActivity.showV1770RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rural
    FeaturePrefsStore.batch1761.v1770rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1770: sad mode
internal fun PlayerActivity.showV1770SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1770sad
    FeaturePrefsStore.batch1761.v1770sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1770: saddle level
internal fun PlayerActivity.showV1770SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1770: sadness level
internal fun PlayerActivity.showV1770SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1770: sail level
internal fun PlayerActivity.showV1770SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1770: salad level
internal fun PlayerActivity.showV1770SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1770: salmon level
internal fun PlayerActivity.showV1770SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1770: salon mode
internal fun PlayerActivity.showV1770SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salon
    FeaturePrefsStore.batch1761.v1770salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1770: salt mode
internal fun PlayerActivity.showV1770SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salt
    FeaturePrefsStore.batch1761.v1770salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1770: salute mode
internal fun PlayerActivity.showV1770SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salute
    FeaturePrefsStore.batch1761.v1770salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1770: same mode
internal fun PlayerActivity.showV1770SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1770same
    FeaturePrefsStore.batch1761.v1770same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1770: sand mode
internal fun PlayerActivity.showV1770SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1770sand
    FeaturePrefsStore.batch1761.v1770sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1771: satisfy mode
internal fun PlayerActivity.showV1771SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1771satisfy
    FeaturePrefsStore.batch1771.v1771satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1771: satoshi mode
internal fun PlayerActivity.showV1771SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1771satoshi
    FeaturePrefsStore.batch1771.v1771satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1771: sauce mode
internal fun PlayerActivity.showV1771SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1771sauce
    FeaturePrefsStore.batch1771.v1771sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1771: sausage mode
internal fun PlayerActivity.showV1771SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1771sausage
    FeaturePrefsStore.batch1771.v1771sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1771: say mode
internal fun PlayerActivity.showV1771SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1771say
    FeaturePrefsStore.batch1771.v1771say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1771: scare level
internal fun PlayerActivity.showV1771ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1771scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1771scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1771: scatter level
internal fun PlayerActivity.showV1771ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1771scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1771scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1771: school level
internal fun PlayerActivity.showV1771SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1771school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1771school = value
        AppToast.show(this, "school: $value")
    }
}

// v1771: science level
internal fun PlayerActivity.showV1771ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1771science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1771science = value
        AppToast.show(this, "science: $value")
    }
}

// v1771: scissors level
internal fun PlayerActivity.showV1771ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1771scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1771scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1771: scorpion mode
internal fun PlayerActivity.showV1771ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1771scorpion
    FeaturePrefsStore.batch1771.v1771scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1771: scout mode
internal fun PlayerActivity.showV1771ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1771scout
    FeaturePrefsStore.batch1771.v1771scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1771: scrap mode
internal fun PlayerActivity.showV1771ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1771scrap
    FeaturePrefsStore.batch1771.v1771scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1771: script mode
internal fun PlayerActivity.showV1771ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1771script
    FeaturePrefsStore.batch1771.v1771script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1771: scrub mode
internal fun PlayerActivity.showV1771ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1771scrub
    FeaturePrefsStore.batch1771.v1771scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1772: satisfy mode
internal fun PlayerActivity.showV1772SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1772satisfy
    FeaturePrefsStore.batch1771.v1772satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1772: satoshi mode
internal fun PlayerActivity.showV1772SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1772satoshi
    FeaturePrefsStore.batch1771.v1772satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1772: sauce mode
internal fun PlayerActivity.showV1772SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1772sauce
    FeaturePrefsStore.batch1771.v1772sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1772: sausage mode
internal fun PlayerActivity.showV1772SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1772sausage
    FeaturePrefsStore.batch1771.v1772sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1772: say mode
internal fun PlayerActivity.showV1772SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1772say
    FeaturePrefsStore.batch1771.v1772say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1772: scare level
internal fun PlayerActivity.showV1772ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1772scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1772scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1772: scatter level
internal fun PlayerActivity.showV1772ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1772scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1772scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1772: school level
internal fun PlayerActivity.showV1772SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1772school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1772school = value
        AppToast.show(this, "school: $value")
    }
}

// v1772: science level
internal fun PlayerActivity.showV1772ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1772science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1772science = value
        AppToast.show(this, "science: $value")
    }
}

// v1772: scissors level
internal fun PlayerActivity.showV1772ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1772scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1772scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1772: scorpion mode
internal fun PlayerActivity.showV1772ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1772scorpion
    FeaturePrefsStore.batch1771.v1772scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1772: scout mode
internal fun PlayerActivity.showV1772ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1772scout
    FeaturePrefsStore.batch1771.v1772scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1772: scrap mode
internal fun PlayerActivity.showV1772ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1772scrap
    FeaturePrefsStore.batch1771.v1772scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1772: script mode
internal fun PlayerActivity.showV1772ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1772script
    FeaturePrefsStore.batch1771.v1772script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1772: scrub mode
internal fun PlayerActivity.showV1772ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1772scrub
    FeaturePrefsStore.batch1771.v1772scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1773: satisfy mode
internal fun PlayerActivity.showV1773SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1773satisfy
    FeaturePrefsStore.batch1771.v1773satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1773: satoshi mode
internal fun PlayerActivity.showV1773SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1773satoshi
    FeaturePrefsStore.batch1771.v1773satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1773: sauce mode
internal fun PlayerActivity.showV1773SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1773sauce
    FeaturePrefsStore.batch1771.v1773sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1773: sausage mode
internal fun PlayerActivity.showV1773SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1773sausage
    FeaturePrefsStore.batch1771.v1773sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1773: say mode
internal fun PlayerActivity.showV1773SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1773say
    FeaturePrefsStore.batch1771.v1773say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1773: scare level
internal fun PlayerActivity.showV1773ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1773scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1773scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1773: scatter level
internal fun PlayerActivity.showV1773ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1773scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1773scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1773: school level
internal fun PlayerActivity.showV1773SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1773school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1773school = value
        AppToast.show(this, "school: $value")
    }
}

// v1773: science level
internal fun PlayerActivity.showV1773ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1773science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1773science = value
        AppToast.show(this, "science: $value")
    }
}

// v1773: scissors level
internal fun PlayerActivity.showV1773ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1773scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1773scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1773: scorpion mode
internal fun PlayerActivity.showV1773ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1773scorpion
    FeaturePrefsStore.batch1771.v1773scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1773: scout mode
internal fun PlayerActivity.showV1773ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1773scout
    FeaturePrefsStore.batch1771.v1773scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1773: scrap mode
internal fun PlayerActivity.showV1773ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1773scrap
    FeaturePrefsStore.batch1771.v1773scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1773: script mode
internal fun PlayerActivity.showV1773ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1773script
    FeaturePrefsStore.batch1771.v1773script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1773: scrub mode
internal fun PlayerActivity.showV1773ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1773scrub
    FeaturePrefsStore.batch1771.v1773scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1774: satisfy mode
internal fun PlayerActivity.showV1774SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1774satisfy
    FeaturePrefsStore.batch1771.v1774satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1774: satoshi mode
internal fun PlayerActivity.showV1774SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1774satoshi
    FeaturePrefsStore.batch1771.v1774satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1774: sauce mode
internal fun PlayerActivity.showV1774SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1774sauce
    FeaturePrefsStore.batch1771.v1774sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1774: sausage mode
internal fun PlayerActivity.showV1774SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1774sausage
    FeaturePrefsStore.batch1771.v1774sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1774: say mode
internal fun PlayerActivity.showV1774SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1774say
    FeaturePrefsStore.batch1771.v1774say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1774: scare level
internal fun PlayerActivity.showV1774ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1774scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1774scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1774: scatter level
internal fun PlayerActivity.showV1774ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1774scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1774scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1774: school level
internal fun PlayerActivity.showV1774SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1774school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1774school = value
        AppToast.show(this, "school: $value")
    }
}

// v1774: science level
internal fun PlayerActivity.showV1774ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1774science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1774science = value
        AppToast.show(this, "science: $value")
    }
}

// v1774: scissors level
internal fun PlayerActivity.showV1774ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1774scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1774scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1774: scorpion mode
internal fun PlayerActivity.showV1774ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1774scorpion
    FeaturePrefsStore.batch1771.v1774scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1774: scout mode
internal fun PlayerActivity.showV1774ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1774scout
    FeaturePrefsStore.batch1771.v1774scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1774: scrap mode
internal fun PlayerActivity.showV1774ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1774scrap
    FeaturePrefsStore.batch1771.v1774scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1774: script mode
internal fun PlayerActivity.showV1774ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1774script
    FeaturePrefsStore.batch1771.v1774script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1774: scrub mode
internal fun PlayerActivity.showV1774ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1774scrub
    FeaturePrefsStore.batch1771.v1774scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1775: satisfy mode
internal fun PlayerActivity.showV1775SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1775satisfy
    FeaturePrefsStore.batch1771.v1775satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1775: satoshi mode
internal fun PlayerActivity.showV1775SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1775satoshi
    FeaturePrefsStore.batch1771.v1775satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1775: sauce mode
internal fun PlayerActivity.showV1775SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1775sauce
    FeaturePrefsStore.batch1771.v1775sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1775: sausage mode
internal fun PlayerActivity.showV1775SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1775sausage
    FeaturePrefsStore.batch1771.v1775sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1775: say mode
internal fun PlayerActivity.showV1775SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1775say
    FeaturePrefsStore.batch1771.v1775say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1775: scare level
internal fun PlayerActivity.showV1775ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1775scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1775scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1775: scatter level
internal fun PlayerActivity.showV1775ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1775scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1775scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1775: school level
internal fun PlayerActivity.showV1775SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1775school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1775school = value
        AppToast.show(this, "school: $value")
    }
}

// v1775: science level
internal fun PlayerActivity.showV1775ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1775science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1775science = value
        AppToast.show(this, "science: $value")
    }
}

// v1775: scissors level
internal fun PlayerActivity.showV1775ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1775scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1775scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1775: scorpion mode
internal fun PlayerActivity.showV1775ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1775scorpion
    FeaturePrefsStore.batch1771.v1775scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1775: scout mode
internal fun PlayerActivity.showV1775ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1775scout
    FeaturePrefsStore.batch1771.v1775scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1775: scrap mode
internal fun PlayerActivity.showV1775ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1775scrap
    FeaturePrefsStore.batch1771.v1775scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1775: script mode
internal fun PlayerActivity.showV1775ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1775script
    FeaturePrefsStore.batch1771.v1775script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1775: scrub mode
internal fun PlayerActivity.showV1775ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1775scrub
    FeaturePrefsStore.batch1771.v1775scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1776: satisfy mode
internal fun PlayerActivity.showV1776SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1776satisfy
    FeaturePrefsStore.batch1771.v1776satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1776: satoshi mode
internal fun PlayerActivity.showV1776SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1776satoshi
    FeaturePrefsStore.batch1771.v1776satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1776: sauce mode
internal fun PlayerActivity.showV1776SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1776sauce
    FeaturePrefsStore.batch1771.v1776sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1776: sausage mode
internal fun PlayerActivity.showV1776SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1776sausage
    FeaturePrefsStore.batch1771.v1776sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1776: say mode
internal fun PlayerActivity.showV1776SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1776say
    FeaturePrefsStore.batch1771.v1776say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1776: scare level
internal fun PlayerActivity.showV1776ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1776scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1776scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1776: scatter level
internal fun PlayerActivity.showV1776ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1776scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1776scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1776: school level
internal fun PlayerActivity.showV1776SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1776school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1776school = value
        AppToast.show(this, "school: $value")
    }
}

// v1776: science level
internal fun PlayerActivity.showV1776ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1776science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1776science = value
        AppToast.show(this, "science: $value")
    }
}

// v1776: scissors level
internal fun PlayerActivity.showV1776ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1776scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1776scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1776: scorpion mode
internal fun PlayerActivity.showV1776ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1776scorpion
    FeaturePrefsStore.batch1771.v1776scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1776: scout mode
internal fun PlayerActivity.showV1776ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1776scout
    FeaturePrefsStore.batch1771.v1776scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1776: scrap mode
internal fun PlayerActivity.showV1776ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1776scrap
    FeaturePrefsStore.batch1771.v1776scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1776: script mode
internal fun PlayerActivity.showV1776ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1776script
    FeaturePrefsStore.batch1771.v1776script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1776: scrub mode
internal fun PlayerActivity.showV1776ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1776scrub
    FeaturePrefsStore.batch1771.v1776scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1777: satisfy mode
internal fun PlayerActivity.showV1777SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1777satisfy
    FeaturePrefsStore.batch1771.v1777satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1777: satoshi mode
internal fun PlayerActivity.showV1777SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1777satoshi
    FeaturePrefsStore.batch1771.v1777satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1777: sauce mode
internal fun PlayerActivity.showV1777SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1777sauce
    FeaturePrefsStore.batch1771.v1777sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1777: sausage mode
internal fun PlayerActivity.showV1777SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1777sausage
    FeaturePrefsStore.batch1771.v1777sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1777: say mode
internal fun PlayerActivity.showV1777SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1777say
    FeaturePrefsStore.batch1771.v1777say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1777: scare level
internal fun PlayerActivity.showV1777ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1777scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1777scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1777: scatter level
internal fun PlayerActivity.showV1777ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1777scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1777scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1777: school level
internal fun PlayerActivity.showV1777SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1777school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1777school = value
        AppToast.show(this, "school: $value")
    }
}

// v1777: science level
internal fun PlayerActivity.showV1777ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1777science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1777science = value
        AppToast.show(this, "science: $value")
    }
}

// v1777: scissors level
internal fun PlayerActivity.showV1777ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1777scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1777scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1777: scorpion mode
internal fun PlayerActivity.showV1777ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1777scorpion
    FeaturePrefsStore.batch1771.v1777scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1777: scout mode
internal fun PlayerActivity.showV1777ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1777scout
    FeaturePrefsStore.batch1771.v1777scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1777: scrap mode
internal fun PlayerActivity.showV1777ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1777scrap
    FeaturePrefsStore.batch1771.v1777scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1777: script mode
internal fun PlayerActivity.showV1777ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1777script
    FeaturePrefsStore.batch1771.v1777script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1777: scrub mode
internal fun PlayerActivity.showV1777ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1777scrub
    FeaturePrefsStore.batch1771.v1777scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1778: satisfy mode
internal fun PlayerActivity.showV1778SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1778satisfy
    FeaturePrefsStore.batch1771.v1778satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1778: satoshi mode
internal fun PlayerActivity.showV1778SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1778satoshi
    FeaturePrefsStore.batch1771.v1778satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1778: sauce mode
internal fun PlayerActivity.showV1778SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1778sauce
    FeaturePrefsStore.batch1771.v1778sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1778: sausage mode
internal fun PlayerActivity.showV1778SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1778sausage
    FeaturePrefsStore.batch1771.v1778sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1778: say mode
internal fun PlayerActivity.showV1778SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1778say
    FeaturePrefsStore.batch1771.v1778say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1778: scare level
internal fun PlayerActivity.showV1778ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1778scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1778scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1778: scatter level
internal fun PlayerActivity.showV1778ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1778scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1778scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1778: school level
internal fun PlayerActivity.showV1778SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1778school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1778school = value
        AppToast.show(this, "school: $value")
    }
}

// v1778: science level
internal fun PlayerActivity.showV1778ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1778science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1778science = value
        AppToast.show(this, "science: $value")
    }
}

// v1778: scissors level
internal fun PlayerActivity.showV1778ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1778scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1778scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1778: scorpion mode
internal fun PlayerActivity.showV1778ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1778scorpion
    FeaturePrefsStore.batch1771.v1778scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1778: scout mode
internal fun PlayerActivity.showV1778ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1778scout
    FeaturePrefsStore.batch1771.v1778scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1778: scrap mode
internal fun PlayerActivity.showV1778ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1778scrap
    FeaturePrefsStore.batch1771.v1778scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1778: script mode
internal fun PlayerActivity.showV1778ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1778script
    FeaturePrefsStore.batch1771.v1778script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1778: scrub mode
internal fun PlayerActivity.showV1778ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1778scrub
    FeaturePrefsStore.batch1771.v1778scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1779: satisfy mode
internal fun PlayerActivity.showV1779SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1779satisfy
    FeaturePrefsStore.batch1771.v1779satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1779: satoshi mode
internal fun PlayerActivity.showV1779SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1779satoshi
    FeaturePrefsStore.batch1771.v1779satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1779: sauce mode
internal fun PlayerActivity.showV1779SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1779sauce
    FeaturePrefsStore.batch1771.v1779sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1779: sausage mode
internal fun PlayerActivity.showV1779SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1779sausage
    FeaturePrefsStore.batch1771.v1779sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1779: say mode
internal fun PlayerActivity.showV1779SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1779say
    FeaturePrefsStore.batch1771.v1779say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1779: scare level
internal fun PlayerActivity.showV1779ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1779scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1779scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1779: scatter level
internal fun PlayerActivity.showV1779ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1779scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1779scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1779: school level
internal fun PlayerActivity.showV1779SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1779school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1779school = value
        AppToast.show(this, "school: $value")
    }
}

// v1779: science level
internal fun PlayerActivity.showV1779ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1779science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1779science = value
        AppToast.show(this, "science: $value")
    }
}

// v1779: scissors level
internal fun PlayerActivity.showV1779ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1779scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1779scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1779: scorpion mode
internal fun PlayerActivity.showV1779ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1779scorpion
    FeaturePrefsStore.batch1771.v1779scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1779: scout mode
internal fun PlayerActivity.showV1779ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1779scout
    FeaturePrefsStore.batch1771.v1779scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1779: scrap mode
internal fun PlayerActivity.showV1779ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1779scrap
    FeaturePrefsStore.batch1771.v1779scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1779: script mode
internal fun PlayerActivity.showV1779ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1779script
    FeaturePrefsStore.batch1771.v1779script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1779: scrub mode
internal fun PlayerActivity.showV1779ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1779scrub
    FeaturePrefsStore.batch1771.v1779scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v1780: satisfy mode
internal fun PlayerActivity.showV1780SatisfyToggle() {
    val current = FeaturePrefsStore.batch1771.v1780satisfy
    FeaturePrefsStore.batch1771.v1780satisfy = !current
    AppToast.show(this, "satisfy: ${if (!current) "ON" else "OFF"}")
}

// v1780: satoshi mode
internal fun PlayerActivity.showV1780SatoshiToggle() {
    val current = FeaturePrefsStore.batch1771.v1780satoshi
    FeaturePrefsStore.batch1771.v1780satoshi = !current
    AppToast.show(this, "satoshi: ${if (!current) "ON" else "OFF"}")
}

// v1780: sauce mode
internal fun PlayerActivity.showV1780SauceToggle() {
    val current = FeaturePrefsStore.batch1771.v1780sauce
    FeaturePrefsStore.batch1771.v1780sauce = !current
    AppToast.show(this, "sauce: ${if (!current) "ON" else "OFF"}")
}

// v1780: sausage mode
internal fun PlayerActivity.showV1780SausageToggle() {
    val current = FeaturePrefsStore.batch1771.v1780sausage
    FeaturePrefsStore.batch1771.v1780sausage = !current
    AppToast.show(this, "sausage: ${if (!current) "ON" else "OFF"}")
}

// v1780: say mode
internal fun PlayerActivity.showV1780SayToggle() {
    val current = FeaturePrefsStore.batch1771.v1780say
    FeaturePrefsStore.batch1771.v1780say = !current
    AppToast.show(this, "say: ${if (!current) "ON" else "OFF"}")
}

// v1780: scare level
internal fun PlayerActivity.showV1780ScareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1780scare).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scare level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1780scare = value
        AppToast.show(this, "scare: $value")
    }
}

// v1780: scatter level
internal fun PlayerActivity.showV1780ScatterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1780scatter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scatter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1780scatter = value
        AppToast.show(this, "scatter: $value")
    }
}

// v1780: school level
internal fun PlayerActivity.showV1780SchoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1780school).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "school level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1780school = value
        AppToast.show(this, "school: $value")
    }
}

// v1780: science level
internal fun PlayerActivity.showV1780ScienceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1780science).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "science level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1780science = value
        AppToast.show(this, "science: $value")
    }
}

// v1780: scissors level
internal fun PlayerActivity.showV1780ScissorsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1771.v1780scissors).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scissors level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1771.v1780scissors = value
        AppToast.show(this, "scissors: $value")
    }
}

// v1780: scorpion mode
internal fun PlayerActivity.showV1780ScorpionToggle() {
    val current = FeaturePrefsStore.batch1771.v1780scorpion
    FeaturePrefsStore.batch1771.v1780scorpion = !current
    AppToast.show(this, "scorpion: ${if (!current) "ON" else "OFF"}")
}

// v1780: scout mode
internal fun PlayerActivity.showV1780ScoutToggle() {
    val current = FeaturePrefsStore.batch1771.v1780scout
    FeaturePrefsStore.batch1771.v1780scout = !current
    AppToast.show(this, "scout: ${if (!current) "ON" else "OFF"}")
}

// v1780: scrap mode
internal fun PlayerActivity.showV1780ScrapToggle() {
    val current = FeaturePrefsStore.batch1771.v1780scrap
    FeaturePrefsStore.batch1771.v1780scrap = !current
    AppToast.show(this, "scrap: ${if (!current) "ON" else "OFF"}")
}

// v1780: script mode
internal fun PlayerActivity.showV1780ScriptToggle() {
    val current = FeaturePrefsStore.batch1771.v1780script
    FeaturePrefsStore.batch1771.v1780script = !current
    AppToast.show(this, "script: ${if (!current) "ON" else "OFF"}")
}

// v1780: scrub mode
internal fun PlayerActivity.showV1780ScrubToggle() {
    val current = FeaturePrefsStore.batch1771.v1780scrub
    FeaturePrefsStore.batch1771.v1780scrub = !current
    AppToast.show(this, "scrub: ${if (!current) "ON" else "OFF"}")
}

// v223: Gesture Shake Action223
internal fun PlayerActivity.showV223GestureShakeAction223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223gestureShakeAction223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223gestureShakeAction223 = value
        AppToast.show(this, "Gesture Shake Action223: $value")
    }
}

// v223: Cast Audio Volume223
internal fun PlayerActivity.showV223CastAudioVolume223Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v223castAudioVolume223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223castAudioVolume223 = value
        AppToast.show(this, "Cast Audio Volume223: $value")
    }
}

// v223: Playlist Auto Skip Outro223
internal fun PlayerActivity.showV223PlaylistAutoSkipOutro223Toggle() {
    val current = BiliClient.prefs.v223playlistAutoSkipOutro223
    BiliClient.prefs.v223playlistAutoSkipOutro223 = !current
    AppToast.show(this, "Playlist Auto Skip Outro223: ${if (!current) "ON" else "OFF"}")
}

// v223: Cache Download Speed224
internal fun PlayerActivity.showV223CacheDownloadSpeed224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223cacheDownloadSpeed224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223cacheDownloadSpeed224 = value
        AppToast.show(this, "Cache Download Speed224: $value")
    }
}

// v223: Progress Bar Thumb Border223
internal fun PlayerActivity.showV223ProgressBarThumbBorder223Toggle() {
    val current = BiliClient.prefs.v223progressBarThumbBorder223
    BiliClient.prefs.v223progressBarThumbBorder223 = !current
    AppToast.show(this, "Progress Bar Thumb Border223: ${if (!current) "ON" else "OFF"}")
}

// v223: Volume Boost Peak223
internal fun PlayerActivity.showV223VolumeBoostPeak223Toggle() {
    val current = BiliClient.prefs.v223volumeBoostPeak223
    BiliClient.prefs.v223volumeBoostPeak223 = !current
    AppToast.show(this, "Volume Boost Peak223: ${if (!current) "ON" else "OFF"}")
}

// v223: History Bookmark Export223
internal fun PlayerActivity.showV223HistoryBookmarkExport223Toggle() {
    val current = BiliClient.prefs.v223historyBookmarkExport223
    BiliClient.prefs.v223historyBookmarkExport223 = !current
    AppToast.show(this, "History Bookmark Export223: ${if (!current) "ON" else "OFF"}")
}

// v223: Playback Chapter Sync223
internal fun PlayerActivity.showV223PlaybackChapterSync223Toggle() {
    val current = BiliClient.prefs.v223playbackChapterSync223
    BiliClient.prefs.v223playbackChapterSync223 = !current
    AppToast.show(this, "Playback Chapter Sync223: ${if (!current) "ON" else "OFF"}")
}

// v223: Screenshot Save Path223
internal fun PlayerActivity.showV223ScreenshotSavePath223Toggle() {
    val current = BiliClient.prefs.v223screenshotSavePath223
    BiliClient.prefs.v223screenshotSavePath223 = !current
    AppToast.show(this, "Screenshot Save Path223: ${if (!current) "ON" else "OFF"}")
}

// v223: Video Color Space223
internal fun PlayerActivity.showV223VideoColorSpace223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223videoColorSpace223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223videoColorSpace223 = value
        AppToast.show(this, "Video Color Space223: $value")
    }
}

// v223: Danmaku Bottom Max Count254
internal fun PlayerActivity.showV223DanmakuBottomMaxCount254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount254 = value
        AppToast.show(this, "Danmaku Bottom Max Count254: $value")
    }
}

// v223: Subtitle Bg Border261
internal fun PlayerActivity.showV223SubtitleBgBorder261Toggle() {
    val current = BiliClient.prefs.v223subtitleBgBorder261
    BiliClient.prefs.v223subtitleBgBorder261 = !current
    AppToast.show(this, "Subtitle Bg Border261: ${if (!current) "ON" else "OFF"}")
}

// v224: Audio EQ Custom224
internal fun PlayerActivity.showV224AudioEQCustom224Toggle() {
    val current = BiliClient.prefs.v224audioEQCustom224
    BiliClient.prefs.v224audioEQCustom224 = !current
    AppToast.show(this, "Audio EQ Custom224: ${if (!current) "ON" else "OFF"}")
}

// v224: Danmaku Bottom Max Count255
internal fun PlayerActivity.showV224DanmakuBottomMaxCount255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount255 = value
        AppToast.show(this, "Danmaku Bottom Max Count255: $value")
    }
}

// v224: Subtitle Bg Border262
internal fun PlayerActivity.showV224SubtitleBgBorder262Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder262
    BiliClient.prefs.v224subtitleBgBorder262 = !current
    AppToast.show(this, "Subtitle Bg Border262: ${if (!current) "ON" else "OFF"}")
}

// v224: Gesture Shake Action224
internal fun PlayerActivity.showV224GestureShakeAction224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224gestureShakeAction224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224gestureShakeAction224 = value
        AppToast.show(this, "Gesture Shake Action224: $value")
    }
}

// v224: Cast Audio Volume224
internal fun PlayerActivity.showV224CastAudioVolume224Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v224castAudioVolume224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224castAudioVolume224 = value
        AppToast.show(this, "Cast Audio Volume224: $value")
    }
}

// v224: Playlist Auto Skip Outro224
internal fun PlayerActivity.showV224PlaylistAutoSkipOutro224Toggle() {
    val current = BiliClient.prefs.v224playlistAutoSkipOutro224
    BiliClient.prefs.v224playlistAutoSkipOutro224 = !current
    AppToast.show(this, "Playlist Auto Skip Outro224: ${if (!current) "ON" else "OFF"}")
}

// v224: Cache Download Speed225
internal fun PlayerActivity.showV224CacheDownloadSpeed225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224cacheDownloadSpeed225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224cacheDownloadSpeed225 = value
        AppToast.show(this, "Cache Download Speed225: $value")
    }
}

// v224: Progress Bar Thumb Border224
internal fun PlayerActivity.showV224ProgressBarThumbBorder224Toggle() {
    val current = BiliClient.prefs.v224progressBarThumbBorder224
    BiliClient.prefs.v224progressBarThumbBorder224 = !current
    AppToast.show(this, "Progress Bar Thumb Border224: ${if (!current) "ON" else "OFF"}")
}

// v224: Volume Boost Peak224
internal fun PlayerActivity.showV224VolumeBoostPeak224Toggle() {
    val current = BiliClient.prefs.v224volumeBoostPeak224
    BiliClient.prefs.v224volumeBoostPeak224 = !current
    AppToast.show(this, "Volume Boost Peak224: ${if (!current) "ON" else "OFF"}")
}

// v224: History Bookmark Export224
internal fun PlayerActivity.showV224HistoryBookmarkExport224Toggle() {
    val current = BiliClient.prefs.v224historyBookmarkExport224
    BiliClient.prefs.v224historyBookmarkExport224 = !current
    AppToast.show(this, "History Bookmark Export224: ${if (!current) "ON" else "OFF"}")
}

// v224: Playback Chapter Sync224
internal fun PlayerActivity.showV224PlaybackChapterSync224Toggle() {
    val current = BiliClient.prefs.v224playbackChapterSync224
    BiliClient.prefs.v224playbackChapterSync224 = !current
    AppToast.show(this, "Playback Chapter Sync224: ${if (!current) "ON" else "OFF"}")
}

// v224: Screenshot Save Path224
internal fun PlayerActivity.showV224ScreenshotSavePath224Toggle() {
    val current = BiliClient.prefs.v224screenshotSavePath224
    BiliClient.prefs.v224screenshotSavePath224 = !current
    AppToast.show(this, "Screenshot Save Path224: ${if (!current) "ON" else "OFF"}")
}

// v224: Video Color Space224
internal fun PlayerActivity.showV224VideoColorSpace224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224videoColorSpace224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224videoColorSpace224 = value
        AppToast.show(this, "Video Color Space224: $value")
    }
}

// v224: Danmaku Bottom Max Count256
internal fun PlayerActivity.showV224DanmakuBottomMaxCount256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount256 = value
        AppToast.show(this, "Danmaku Bottom Max Count256: $value")
    }
}

// v224: Subtitle Bg Border263
internal fun PlayerActivity.showV224SubtitleBgBorder263Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder263
    BiliClient.prefs.v224subtitleBgBorder263 = !current
    AppToast.show(this, "Subtitle Bg Border263: ${if (!current) "ON" else "OFF"}")
}

// v225: Audio EQ Custom225
internal fun PlayerActivity.showV225AudioEQCustom225Toggle() {
    val current = BiliClient.prefs.v225audioEQCustom225
    BiliClient.prefs.v225audioEQCustom225 = !current
    AppToast.show(this, "Audio EQ Custom225: ${if (!current) "ON" else "OFF"}")
}

// v225: Danmaku Bottom Max Count257
internal fun PlayerActivity.showV225DanmakuBottomMaxCount257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount257 = value
        AppToast.show(this, "Danmaku Bottom Max Count257: $value")
    }
}

// v225: Subtitle Bg Border264
internal fun PlayerActivity.showV225SubtitleBgBorder264Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder264
    BiliClient.prefs.v225subtitleBgBorder264 = !current
    AppToast.show(this, "Subtitle Bg Border264: ${if (!current) "ON" else "OFF"}")
}

// v225: Gesture Shake Action225
internal fun PlayerActivity.showV225GestureShakeAction225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225gestureShakeAction225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225gestureShakeAction225 = value
        AppToast.show(this, "Gesture Shake Action225: $value")
    }
}

// v225: Cast Audio Volume225
internal fun PlayerActivity.showV225CastAudioVolume225Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v225castAudioVolume225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225castAudioVolume225 = value
        AppToast.show(this, "Cast Audio Volume225: $value")
    }
}

// v225: Playlist Auto Skip Outro225
internal fun PlayerActivity.showV225PlaylistAutoSkipOutro225Toggle() {
    val current = BiliClient.prefs.v225playlistAutoSkipOutro225
    BiliClient.prefs.v225playlistAutoSkipOutro225 = !current
    AppToast.show(this, "Playlist Auto Skip Outro225: ${if (!current) "ON" else "OFF"}")
}

// v225: Cache Download Speed226
internal fun PlayerActivity.showV225CacheDownloadSpeed226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225cacheDownloadSpeed226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225cacheDownloadSpeed226 = value
        AppToast.show(this, "Cache Download Speed226: $value")
    }
}

// v225: Progress Bar Thumb Border225
internal fun PlayerActivity.showV225ProgressBarThumbBorder225Toggle() {
    val current = BiliClient.prefs.v225progressBarThumbBorder225
    BiliClient.prefs.v225progressBarThumbBorder225 = !current
    AppToast.show(this, "Progress Bar Thumb Border225: ${if (!current) "ON" else "OFF"}")
}

// v225: Volume Boost Peak225
internal fun PlayerActivity.showV225VolumeBoostPeak225Toggle() {
    val current = BiliClient.prefs.v225volumeBoostPeak225
    BiliClient.prefs.v225volumeBoostPeak225 = !current
    AppToast.show(this, "Volume Boost Peak225: ${if (!current) "ON" else "OFF"}")
}

// v225: History Bookmark Export225
internal fun PlayerActivity.showV225HistoryBookmarkExport225Toggle() {
    val current = BiliClient.prefs.v225historyBookmarkExport225
    BiliClient.prefs.v225historyBookmarkExport225 = !current
    AppToast.show(this, "History Bookmark Export225: ${if (!current) "ON" else "OFF"}")
}

// v225: Playback Chapter Sync225
internal fun PlayerActivity.showV225PlaybackChapterSync225Toggle() {
    val current = BiliClient.prefs.v225playbackChapterSync225
    BiliClient.prefs.v225playbackChapterSync225 = !current
    AppToast.show(this, "Playback Chapter Sync225: ${if (!current) "ON" else "OFF"}")
}

// v225: Screenshot Save Path225
internal fun PlayerActivity.showV225ScreenshotSavePath225Toggle() {
    val current = BiliClient.prefs.v225screenshotSavePath225
    BiliClient.prefs.v225screenshotSavePath225 = !current
    AppToast.show(this, "Screenshot Save Path225: ${if (!current) "ON" else "OFF"}")
}

// v225: Video Color Space225
internal fun PlayerActivity.showV225VideoColorSpace225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225videoColorSpace225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225videoColorSpace225 = value
        AppToast.show(this, "Video Color Space225: $value")
    }
}

// v225: Danmaku Bottom Max Count258
internal fun PlayerActivity.showV225DanmakuBottomMaxCount258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount258 = value
        AppToast.show(this, "Danmaku Bottom Max Count258: $value")
    }
}

// v225: Subtitle Bg Border265
internal fun PlayerActivity.showV225SubtitleBgBorder265Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder265
    BiliClient.prefs.v225subtitleBgBorder265 = !current
    AppToast.show(this, "Subtitle Bg Border265: ${if (!current) "ON" else "OFF"}")
}

// v226: Audio EQ Custom226
internal fun PlayerActivity.showV226AudioEQCustom226Toggle() {
    val current = BiliClient.prefs.v226audioEQCustom226
    BiliClient.prefs.v226audioEQCustom226 = !current
    AppToast.show(this, "Audio EQ Custom226: ${if (!current) "ON" else "OFF"}")
}

// v226: Danmaku Bottom Max Count259
internal fun PlayerActivity.showV226DanmakuBottomMaxCount259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount259 = value
        AppToast.show(this, "Danmaku Bottom Max Count259: $value")
    }
}

// v226: Subtitle Bg Border266
internal fun PlayerActivity.showV226SubtitleBgBorder266Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder266
    BiliClient.prefs.v226subtitleBgBorder266 = !current
    AppToast.show(this, "Subtitle Bg Border266: ${if (!current) "ON" else "OFF"}")
}

// v226: Gesture Shake Action226
internal fun PlayerActivity.showV226GestureShakeAction226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226gestureShakeAction226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226gestureShakeAction226 = value
        AppToast.show(this, "Gesture Shake Action226: $value")
    }
}

// v226: Cast Audio Volume226
internal fun PlayerActivity.showV226CastAudioVolume226Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v226castAudioVolume226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226castAudioVolume226 = value
        AppToast.show(this, "Cast Audio Volume226: $value")
    }
}

// v226: Playlist Auto Skip Outro226
internal fun PlayerActivity.showV226PlaylistAutoSkipOutro226Toggle() {
    val current = BiliClient.prefs.v226playlistAutoSkipOutro226
    BiliClient.prefs.v226playlistAutoSkipOutro226 = !current
    AppToast.show(this, "Playlist Auto Skip Outro226: ${if (!current) "ON" else "OFF"}")
}

// v226: Cache Download Speed227
internal fun PlayerActivity.showV226CacheDownloadSpeed227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226cacheDownloadSpeed227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226cacheDownloadSpeed227 = value
        AppToast.show(this, "Cache Download Speed227: $value")
    }
}

// v226: Progress Bar Thumb Border226
internal fun PlayerActivity.showV226ProgressBarThumbBorder226Toggle() {
    val current = BiliClient.prefs.v226progressBarThumbBorder226
    BiliClient.prefs.v226progressBarThumbBorder226 = !current
    AppToast.show(this, "Progress Bar Thumb Border226: ${if (!current) "ON" else "OFF"}")
}

// v226: Volume Boost Peak226
internal fun PlayerActivity.showV226VolumeBoostPeak226Toggle() {
    val current = BiliClient.prefs.v226volumeBoostPeak226
    BiliClient.prefs.v226volumeBoostPeak226 = !current
    AppToast.show(this, "Volume Boost Peak226: ${if (!current) "ON" else "OFF"}")
}

// v226: History Bookmark Export226
internal fun PlayerActivity.showV226HistoryBookmarkExport226Toggle() {
    val current = BiliClient.prefs.v226historyBookmarkExport226
    BiliClient.prefs.v226historyBookmarkExport226 = !current
    AppToast.show(this, "History Bookmark Export226: ${if (!current) "ON" else "OFF"}")
}

// v226: Playback Chapter Sync226
internal fun PlayerActivity.showV226PlaybackChapterSync226Toggle() {
    val current = BiliClient.prefs.v226playbackChapterSync226
    BiliClient.prefs.v226playbackChapterSync226 = !current
    AppToast.show(this, "Playback Chapter Sync226: ${if (!current) "ON" else "OFF"}")
}

// v226: Screenshot Save Path226
internal fun PlayerActivity.showV226ScreenshotSavePath226Toggle() {
    val current = BiliClient.prefs.v226screenshotSavePath226
    BiliClient.prefs.v226screenshotSavePath226 = !current
    AppToast.show(this, "Screenshot Save Path226: ${if (!current) "ON" else "OFF"}")
}

// v226: Video Color Space226
internal fun PlayerActivity.showV226VideoColorSpace226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226videoColorSpace226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226videoColorSpace226 = value
        AppToast.show(this, "Video Color Space226: $value")
    }
}

// v226: Danmaku Bottom Max Count260
internal fun PlayerActivity.showV226DanmakuBottomMaxCount260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount260 = value
        AppToast.show(this, "Danmaku Bottom Max Count260: $value")
    }
}

// v226: Subtitle Bg Border267
internal fun PlayerActivity.showV226SubtitleBgBorder267Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder267
    BiliClient.prefs.v226subtitleBgBorder267 = !current
    AppToast.show(this, "Subtitle Bg Border267: ${if (!current) "ON" else "OFF"}")
}

// v227: Audio EQ Custom227
internal fun PlayerActivity.showV227AudioEQCustom227Toggle() {
    val current = BiliClient.prefs.v227audioEQCustom227
    BiliClient.prefs.v227audioEQCustom227 = !current
    AppToast.show(this, "Audio EQ Custom227: ${if (!current) "ON" else "OFF"}")
}

// v227: Danmaku Bottom Max Count261
internal fun PlayerActivity.showV227DanmakuBottomMaxCount261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount261 = value
        AppToast.show(this, "Danmaku Bottom Max Count261: $value")
    }
}

// v227: Subtitle Bg Border268
internal fun PlayerActivity.showV227SubtitleBgBorder268Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder268
    BiliClient.prefs.v227subtitleBgBorder268 = !current
    AppToast.show(this, "Subtitle Bg Border268: ${if (!current) "ON" else "OFF"}")
}

// v227: Gesture Shake Action227
internal fun PlayerActivity.showV227GestureShakeAction227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227gestureShakeAction227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227gestureShakeAction227 = value
        AppToast.show(this, "Gesture Shake Action227: $value")
    }
}

// v227: Cast Audio Volume227
internal fun PlayerActivity.showV227CastAudioVolume227Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v227castAudioVolume227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227castAudioVolume227 = value
        AppToast.show(this, "Cast Audio Volume227: $value")
    }
}

// v227: Playlist Auto Skip Outro227
internal fun PlayerActivity.showV227PlaylistAutoSkipOutro227Toggle() {
    val current = BiliClient.prefs.v227playlistAutoSkipOutro227
    BiliClient.prefs.v227playlistAutoSkipOutro227 = !current
    AppToast.show(this, "Playlist Auto Skip Outro227: ${if (!current) "ON" else "OFF"}")
}

// v227: Cache Download Speed228
internal fun PlayerActivity.showV227CacheDownloadSpeed228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227cacheDownloadSpeed228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227cacheDownloadSpeed228 = value
        AppToast.show(this, "Cache Download Speed228: $value")
    }
}

// v227: Progress Bar Thumb Border227
internal fun PlayerActivity.showV227ProgressBarThumbBorder227Toggle() {
    val current = BiliClient.prefs.v227progressBarThumbBorder227
    BiliClient.prefs.v227progressBarThumbBorder227 = !current
    AppToast.show(this, "Progress Bar Thumb Border227: ${if (!current) "ON" else "OFF"}")
}

// v227: Volume Boost Peak227
internal fun PlayerActivity.showV227VolumeBoostPeak227Toggle() {
    val current = BiliClient.prefs.v227volumeBoostPeak227
    BiliClient.prefs.v227volumeBoostPeak227 = !current
    AppToast.show(this, "Volume Boost Peak227: ${if (!current) "ON" else "OFF"}")
}

// v227: History Bookmark Export227
internal fun PlayerActivity.showV227HistoryBookmarkExport227Toggle() {
    val current = BiliClient.prefs.v227historyBookmarkExport227
    BiliClient.prefs.v227historyBookmarkExport227 = !current
    AppToast.show(this, "History Bookmark Export227: ${if (!current) "ON" else "OFF"}")
}

// v227: Playback Chapter Sync227
internal fun PlayerActivity.showV227PlaybackChapterSync227Toggle() {
    val current = BiliClient.prefs.v227playbackChapterSync227
    BiliClient.prefs.v227playbackChapterSync227 = !current
    AppToast.show(this, "Playback Chapter Sync227: ${if (!current) "ON" else "OFF"}")
}

// v227: Screenshot Save Path227
internal fun PlayerActivity.showV227ScreenshotSavePath227Toggle() {
    val current = BiliClient.prefs.v227screenshotSavePath227
    BiliClient.prefs.v227screenshotSavePath227 = !current
    AppToast.show(this, "Screenshot Save Path227: ${if (!current) "ON" else "OFF"}")
}

// v227: Video Color Space227
internal fun PlayerActivity.showV227VideoColorSpace227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227videoColorSpace227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227videoColorSpace227 = value
        AppToast.show(this, "Video Color Space227: $value")
    }
}

// v227: Danmaku Bottom Max Count262
internal fun PlayerActivity.showV227DanmakuBottomMaxCount262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount262 = value
        AppToast.show(this, "Danmaku Bottom Max Count262: $value")
    }
}

// v227: Subtitle Bg Border269
internal fun PlayerActivity.showV227SubtitleBgBorder269Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder269
    BiliClient.prefs.v227subtitleBgBorder269 = !current
    AppToast.show(this, "Subtitle Bg Border269: ${if (!current) "ON" else "OFF"}")
}

// v228: Audio EQ Custom228
internal fun PlayerActivity.showV228AudioEQCustom228Toggle() {
    val current = BiliClient.prefs.v228audioEQCustom228
    BiliClient.prefs.v228audioEQCustom228 = !current
    AppToast.show(this, "Audio EQ Custom228: ${if (!current) "ON" else "OFF"}")
}

// v228: Danmaku Bottom Max Count263
internal fun PlayerActivity.showV228DanmakuBottomMaxCount263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount263 = value
        AppToast.show(this, "Danmaku Bottom Max Count263: $value")
    }
}

// v228: Subtitle Bg Border270
internal fun PlayerActivity.showV228SubtitleBgBorder270Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder270
    BiliClient.prefs.v228subtitleBgBorder270 = !current
    AppToast.show(this, "Subtitle Bg Border270: ${if (!current) "ON" else "OFF"}")
}

// v228: Gesture Shake Action228
internal fun PlayerActivity.showV228GestureShakeAction228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228gestureShakeAction228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228gestureShakeAction228 = value
        AppToast.show(this, "Gesture Shake Action228: $value")
    }
}

// v228: Cast Audio Volume228
internal fun PlayerActivity.showV228CastAudioVolume228Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v228castAudioVolume228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228castAudioVolume228 = value
        AppToast.show(this, "Cast Audio Volume228: $value")
    }
}

// v228: Playlist Auto Skip Outro228
internal fun PlayerActivity.showV228PlaylistAutoSkipOutro228Toggle() {
    val current = BiliClient.prefs.v228playlistAutoSkipOutro228
    BiliClient.prefs.v228playlistAutoSkipOutro228 = !current
    AppToast.show(this, "Playlist Auto Skip Outro228: ${if (!current) "ON" else "OFF"}")
}

// v228: Cache Download Speed229
internal fun PlayerActivity.showV228CacheDownloadSpeed229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228cacheDownloadSpeed229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228cacheDownloadSpeed229 = value
        AppToast.show(this, "Cache Download Speed229: $value")
    }
}

// v228: Progress Bar Thumb Border228
internal fun PlayerActivity.showV228ProgressBarThumbBorder228Toggle() {
    val current = BiliClient.prefs.v228progressBarThumbBorder228
    BiliClient.prefs.v228progressBarThumbBorder228 = !current
    AppToast.show(this, "Progress Bar Thumb Border228: ${if (!current) "ON" else "OFF"}")
}

// v228: Volume Boost Peak228
internal fun PlayerActivity.showV228VolumeBoostPeak228Toggle() {
    val current = BiliClient.prefs.v228volumeBoostPeak228
    BiliClient.prefs.v228volumeBoostPeak228 = !current
    AppToast.show(this, "Volume Boost Peak228: ${if (!current) "ON" else "OFF"}")
}

// v228: History Bookmark Export228
internal fun PlayerActivity.showV228HistoryBookmarkExport228Toggle() {
    val current = BiliClient.prefs.v228historyBookmarkExport228
    BiliClient.prefs.v228historyBookmarkExport228 = !current
    AppToast.show(this, "History Bookmark Export228: ${if (!current) "ON" else "OFF"}")
}

// v228: Playback Chapter Sync228
internal fun PlayerActivity.showV228PlaybackChapterSync228Toggle() {
    val current = BiliClient.prefs.v228playbackChapterSync228
    BiliClient.prefs.v228playbackChapterSync228 = !current
    AppToast.show(this, "Playback Chapter Sync228: ${if (!current) "ON" else "OFF"}")
}

// v228: Screenshot Save Path228
internal fun PlayerActivity.showV228ScreenshotSavePath228Toggle() {
    val current = BiliClient.prefs.v228screenshotSavePath228
    BiliClient.prefs.v228screenshotSavePath228 = !current
    AppToast.show(this, "Screenshot Save Path228: ${if (!current) "ON" else "OFF"}")
}

// v228: Video Color Space228
internal fun PlayerActivity.showV228VideoColorSpace228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228videoColorSpace228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228videoColorSpace228 = value
        AppToast.show(this, "Video Color Space228: $value")
    }
}

// v228: Danmaku Bottom Max Count264
internal fun PlayerActivity.showV228DanmakuBottomMaxCount264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount264 = value
        AppToast.show(this, "Danmaku Bottom Max Count264: $value")
    }
}

// v228: Subtitle Bg Border271
internal fun PlayerActivity.showV228SubtitleBgBorder271Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder271
    BiliClient.prefs.v228subtitleBgBorder271 = !current
    AppToast.show(this, "Subtitle Bg Border271: ${if (!current) "ON" else "OFF"}")
}

// v229: Audio EQ Custom229
internal fun PlayerActivity.showV229AudioEQCustom229Toggle() {
    val current = BiliClient.prefs.v229audioEQCustom229
    BiliClient.prefs.v229audioEQCustom229 = !current
    AppToast.show(this, "Audio EQ Custom229: ${if (!current) "ON" else "OFF"}")
}

// v229: Danmaku Bottom Max Count265
internal fun PlayerActivity.showV229DanmakuBottomMaxCount265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount265 = value
        AppToast.show(this, "Danmaku Bottom Max Count265: $value")
    }
}

// v229: Subtitle Bg Border272
internal fun PlayerActivity.showV229SubtitleBgBorder272Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder272
    BiliClient.prefs.v229subtitleBgBorder272 = !current
    AppToast.show(this, "Subtitle Bg Border272: ${if (!current) "ON" else "OFF"}")
}

// v229: Gesture Shake Action229
internal fun PlayerActivity.showV229GestureShakeAction229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229gestureShakeAction229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229gestureShakeAction229 = value
        AppToast.show(this, "Gesture Shake Action229: $value")
    }
}

// v229: Cast Audio Volume229
internal fun PlayerActivity.showV229CastAudioVolume229Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v229castAudioVolume229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229castAudioVolume229 = value
        AppToast.show(this, "Cast Audio Volume229: $value")
    }
}

// v229: Playlist Auto Skip Outro229
internal fun PlayerActivity.showV229PlaylistAutoSkipOutro229Toggle() {
    val current = BiliClient.prefs.v229playlistAutoSkipOutro229
    BiliClient.prefs.v229playlistAutoSkipOutro229 = !current
    AppToast.show(this, "Playlist Auto Skip Outro229: ${if (!current) "ON" else "OFF"}")
}

// v229: Cache Download Speed230
internal fun PlayerActivity.showV229CacheDownloadSpeed230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229cacheDownloadSpeed230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229cacheDownloadSpeed230 = value
        AppToast.show(this, "Cache Download Speed230: $value")
    }
}

// v229: Progress Bar Thumb Border229
internal fun PlayerActivity.showV229ProgressBarThumbBorder229Toggle() {
    val current = BiliClient.prefs.v229progressBarThumbBorder229
    BiliClient.prefs.v229progressBarThumbBorder229 = !current
    AppToast.show(this, "Progress Bar Thumb Border229: ${if (!current) "ON" else "OFF"}")
}

// v229: Volume Boost Peak229
internal fun PlayerActivity.showV229VolumeBoostPeak229Toggle() {
    val current = BiliClient.prefs.v229volumeBoostPeak229
    BiliClient.prefs.v229volumeBoostPeak229 = !current
    AppToast.show(this, "Volume Boost Peak229: ${if (!current) "ON" else "OFF"}")
}

// v229: History Bookmark Export229
internal fun PlayerActivity.showV229HistoryBookmarkExport229Toggle() {
    val current = BiliClient.prefs.v229historyBookmarkExport229
    BiliClient.prefs.v229historyBookmarkExport229 = !current
    AppToast.show(this, "History Bookmark Export229: ${if (!current) "ON" else "OFF"}")
}

// v229: Playback Chapter Sync229
internal fun PlayerActivity.showV229PlaybackChapterSync229Toggle() {
    val current = BiliClient.prefs.v229playbackChapterSync229
    BiliClient.prefs.v229playbackChapterSync229 = !current
    AppToast.show(this, "Playback Chapter Sync229: ${if (!current) "ON" else "OFF"}")
}

// v229: Screenshot Save Path229
internal fun PlayerActivity.showV229ScreenshotSavePath229Toggle() {
    val current = BiliClient.prefs.v229screenshotSavePath229
    BiliClient.prefs.v229screenshotSavePath229 = !current
    AppToast.show(this, "Screenshot Save Path229: ${if (!current) "ON" else "OFF"}")
}

// v229: Video Color Space229
internal fun PlayerActivity.showV229VideoColorSpace229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229videoColorSpace229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229videoColorSpace229 = value
        AppToast.show(this, "Video Color Space229: $value")
    }
}

// v229: Danmaku Bottom Max Count266
internal fun PlayerActivity.showV229DanmakuBottomMaxCount266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount266 = value
        AppToast.show(this, "Danmaku Bottom Max Count266: $value")
    }
}

// v229: Subtitle Bg Border273
internal fun PlayerActivity.showV229SubtitleBgBorder273Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder273
    BiliClient.prefs.v229subtitleBgBorder273 = !current
    AppToast.show(this, "Subtitle Bg Border273: ${if (!current) "ON" else "OFF"}")
}

// v230: Audio EQ Custom230
internal fun PlayerActivity.showV230AudioEQCustom230Toggle() {
    val current = BiliClient.prefs.v230audioEQCustom230
    BiliClient.prefs.v230audioEQCustom230 = !current
    AppToast.show(this, "Audio EQ Custom230: ${if (!current) "ON" else "OFF"}")
}

// v230: Danmaku Bottom Max Count267
internal fun PlayerActivity.showV230DanmakuBottomMaxCount267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount267 = value
        AppToast.show(this, "Danmaku Bottom Max Count267: $value")
    }
}

// v230: Subtitle Bg Border274
internal fun PlayerActivity.showV230SubtitleBgBorder274Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder274
    BiliClient.prefs.v230subtitleBgBorder274 = !current
    AppToast.show(this, "Subtitle Bg Border274: ${if (!current) "ON" else "OFF"}")
}

// v230: Gesture Shake Action230
internal fun PlayerActivity.showV230GestureShakeAction230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230gestureShakeAction230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230gestureShakeAction230 = value
        AppToast.show(this, "Gesture Shake Action230: $value")
    }
}

// v230: Cast Audio Volume230
internal fun PlayerActivity.showV230CastAudioVolume230Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v230castAudioVolume230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230castAudioVolume230 = value
        AppToast.show(this, "Cast Audio Volume230: $value")
    }
}

// v230: Playlist Auto Skip Outro230
internal fun PlayerActivity.showV230PlaylistAutoSkipOutro230Toggle() {
    val current = BiliClient.prefs.v230playlistAutoSkipOutro230
    BiliClient.prefs.v230playlistAutoSkipOutro230 = !current
    AppToast.show(this, "Playlist Auto Skip Outro230: ${if (!current) "ON" else "OFF"}")
}

// v230: Cache Download Speed231
internal fun PlayerActivity.showV230CacheDownloadSpeed231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230cacheDownloadSpeed231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230cacheDownloadSpeed231 = value
        AppToast.show(this, "Cache Download Speed231: $value")
    }
}

// v230: Progress Bar Thumb Border230
internal fun PlayerActivity.showV230ProgressBarThumbBorder230Toggle() {
    val current = BiliClient.prefs.v230progressBarThumbBorder230
    BiliClient.prefs.v230progressBarThumbBorder230 = !current
    AppToast.show(this, "Progress Bar Thumb Border230: ${if (!current) "ON" else "OFF"}")
}

// v230: Volume Boost Peak230
internal fun PlayerActivity.showV230VolumeBoostPeak230Toggle() {
    val current = BiliClient.prefs.v230volumeBoostPeak230
    BiliClient.prefs.v230volumeBoostPeak230 = !current
    AppToast.show(this, "Volume Boost Peak230: ${if (!current) "ON" else "OFF"}")
}

// v230: History Bookmark Export230
internal fun PlayerActivity.showV230HistoryBookmarkExport230Toggle() {
    val current = BiliClient.prefs.v230historyBookmarkExport230
    BiliClient.prefs.v230historyBookmarkExport230 = !current
    AppToast.show(this, "History Bookmark Export230: ${if (!current) "ON" else "OFF"}")
}

// v230: Playback Chapter Sync230
internal fun PlayerActivity.showV230PlaybackChapterSync230Toggle() {
    val current = BiliClient.prefs.v230playbackChapterSync230
    BiliClient.prefs.v230playbackChapterSync230 = !current
    AppToast.show(this, "Playback Chapter Sync230: ${if (!current) "ON" else "OFF"}")
}

// v230: Screenshot Save Path230
internal fun PlayerActivity.showV230ScreenshotSavePath230Toggle() {
    val current = BiliClient.prefs.v230screenshotSavePath230
    BiliClient.prefs.v230screenshotSavePath230 = !current
    AppToast.show(this, "Screenshot Save Path230: ${if (!current) "ON" else "OFF"}")
}

// v230: Video Color Space230
internal fun PlayerActivity.showV230VideoColorSpace230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230videoColorSpace230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230videoColorSpace230 = value
        AppToast.show(this, "Video Color Space230: $value")
    }
}

// v230: Danmaku Bottom Max Count268
internal fun PlayerActivity.showV230DanmakuBottomMaxCount268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount268 = value
        AppToast.show(this, "Danmaku Bottom Max Count268: $value")
    }
}

// v230: Subtitle Bg Border275
internal fun PlayerActivity.showV230SubtitleBgBorder275Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder275
    BiliClient.prefs.v230subtitleBgBorder275 = !current
    AppToast.show(this, "Subtitle Bg Border275: ${if (!current) "ON" else "OFF"}")
}

// v231: Audio EQ Custom231
internal fun PlayerActivity.showV231AudioEQCustom231Toggle() {
    val current = BiliClient.prefs.v231audioEQCustom231
    BiliClient.prefs.v231audioEQCustom231 = !current
    AppToast.show(this, "Audio EQ Custom231: ${if (!current) "ON" else "OFF"}")
}

// v231: Danmaku Bottom Max Count269
internal fun PlayerActivity.showV231DanmakuBottomMaxCount269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount269 = value
        AppToast.show(this, "Danmaku Bottom Max Count269: $value")
    }
}

// v231: Subtitle Bg Border276
internal fun PlayerActivity.showV231SubtitleBgBorder276Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder276
    BiliClient.prefs.v231subtitleBgBorder276 = !current
    AppToast.show(this, "Subtitle Bg Border276: ${if (!current) "ON" else "OFF"}")
}

// v231: Gesture Shake Action231
internal fun PlayerActivity.showV231GestureShakeAction231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231gestureShakeAction231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231gestureShakeAction231 = value
        AppToast.show(this, "Gesture Shake Action231: $value")
    }
}

// v231: Cast Audio Volume231
internal fun PlayerActivity.showV231CastAudioVolume231Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v231castAudioVolume231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231castAudioVolume231 = value
        AppToast.show(this, "Cast Audio Volume231: $value")
    }
}

// v231: Playlist Auto Skip Outro231
internal fun PlayerActivity.showV231PlaylistAutoSkipOutro231Toggle() {
    val current = BiliClient.prefs.v231playlistAutoSkipOutro231
    BiliClient.prefs.v231playlistAutoSkipOutro231 = !current
    AppToast.show(this, "Playlist Auto Skip Outro231: ${if (!current) "ON" else "OFF"}")
}

// v231: Cache Download Speed232
internal fun PlayerActivity.showV231CacheDownloadSpeed232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231cacheDownloadSpeed232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231cacheDownloadSpeed232 = value
        AppToast.show(this, "Cache Download Speed232: $value")
    }
}

// v231: Progress Bar Thumb Border231
internal fun PlayerActivity.showV231ProgressBarThumbBorder231Toggle() {
    val current = BiliClient.prefs.v231progressBarThumbBorder231
    BiliClient.prefs.v231progressBarThumbBorder231 = !current
    AppToast.show(this, "Progress Bar Thumb Border231: ${if (!current) "ON" else "OFF"}")
}

// v231: Volume Boost Peak231
internal fun PlayerActivity.showV231VolumeBoostPeak231Toggle() {
    val current = BiliClient.prefs.v231volumeBoostPeak231
    BiliClient.prefs.v231volumeBoostPeak231 = !current
    AppToast.show(this, "Volume Boost Peak231: ${if (!current) "ON" else "OFF"}")
}

// v231: History Bookmark Export231
internal fun PlayerActivity.showV231HistoryBookmarkExport231Toggle() {
    val current = BiliClient.prefs.v231historyBookmarkExport231
    BiliClient.prefs.v231historyBookmarkExport231 = !current
    AppToast.show(this, "History Bookmark Export231: ${if (!current) "ON" else "OFF"}")
}

// v231: Playback Chapter Sync231
internal fun PlayerActivity.showV231PlaybackChapterSync231Toggle() {
    val current = BiliClient.prefs.v231playbackChapterSync231
    BiliClient.prefs.v231playbackChapterSync231 = !current
    AppToast.show(this, "Playback Chapter Sync231: ${if (!current) "ON" else "OFF"}")
}

// v231: Screenshot Save Path231
internal fun PlayerActivity.showV231ScreenshotSavePath231Toggle() {
    val current = BiliClient.prefs.v231screenshotSavePath231
    BiliClient.prefs.v231screenshotSavePath231 = !current
    AppToast.show(this, "Screenshot Save Path231: ${if (!current) "ON" else "OFF"}")
}

// v231: Video Color Space231
internal fun PlayerActivity.showV231VideoColorSpace231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231videoColorSpace231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231videoColorSpace231 = value
        AppToast.show(this, "Video Color Space231: $value")
    }
}

// v231: Danmaku Bottom Max Count270
internal fun PlayerActivity.showV231DanmakuBottomMaxCount270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount270 = value
        AppToast.show(this, "Danmaku Bottom Max Count270: $value")
    }
}

// v231: Subtitle Bg Border277
internal fun PlayerActivity.showV231SubtitleBgBorder277Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder277
    BiliClient.prefs.v231subtitleBgBorder277 = !current
    AppToast.show(this, "Subtitle Bg Border277: ${if (!current) "ON" else "OFF"}")
}

// v232: Audio EQ Custom232
internal fun PlayerActivity.showV232AudioEQCustom232Toggle() {
    val current = BiliClient.prefs.v232audioEQCustom232
    BiliClient.prefs.v232audioEQCustom232 = !current
    AppToast.show(this, "Audio EQ Custom232: ${if (!current) "ON" else "OFF"}")
}

// v232: Danmaku Bottom Max Count271
internal fun PlayerActivity.showV232DanmakuBottomMaxCount271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount271 = value
        AppToast.show(this, "Danmaku Bottom Max Count271: $value")
    }
}

// v232: Subtitle Bg Border278
internal fun PlayerActivity.showV232SubtitleBgBorder278Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder278
    BiliClient.prefs.v232subtitleBgBorder278 = !current
    AppToast.show(this, "Subtitle Bg Border278: ${if (!current) "ON" else "OFF"}")
}

// v232: Gesture Shake Action232
internal fun PlayerActivity.showV232GestureShakeAction232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232gestureShakeAction232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232gestureShakeAction232 = value
        AppToast.show(this, "Gesture Shake Action232: $value")
    }
}

// v232: Cast Audio Volume232
internal fun PlayerActivity.showV232CastAudioVolume232Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v232castAudioVolume232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232castAudioVolume232 = value
        AppToast.show(this, "Cast Audio Volume232: $value")
    }
}

// v232: Playlist Auto Skip Outro232
internal fun PlayerActivity.showV232PlaylistAutoSkipOutro232Toggle() {
    val current = BiliClient.prefs.v232playlistAutoSkipOutro232
    BiliClient.prefs.v232playlistAutoSkipOutro232 = !current
    AppToast.show(this, "Playlist Auto Skip Outro232: ${if (!current) "ON" else "OFF"}")
}

// v232: Cache Download Speed233
internal fun PlayerActivity.showV232CacheDownloadSpeed233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232cacheDownloadSpeed233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232cacheDownloadSpeed233 = value
        AppToast.show(this, "Cache Download Speed233: $value")
    }
}

// v232: Progress Bar Thumb Border232
internal fun PlayerActivity.showV232ProgressBarThumbBorder232Toggle() {
    val current = BiliClient.prefs.v232progressBarThumbBorder232
    BiliClient.prefs.v232progressBarThumbBorder232 = !current
    AppToast.show(this, "Progress Bar Thumb Border232: ${if (!current) "ON" else "OFF"}")
}

// v232: Volume Boost Peak232
internal fun PlayerActivity.showV232VolumeBoostPeak232Toggle() {
    val current = BiliClient.prefs.v232volumeBoostPeak232
    BiliClient.prefs.v232volumeBoostPeak232 = !current
    AppToast.show(this, "Volume Boost Peak232: ${if (!current) "ON" else "OFF"}")
}

// v232: History Bookmark Export232
internal fun PlayerActivity.showV232HistoryBookmarkExport232Toggle() {
    val current = BiliClient.prefs.v232historyBookmarkExport232
    BiliClient.prefs.v232historyBookmarkExport232 = !current
    AppToast.show(this, "History Bookmark Export232: ${if (!current) "ON" else "OFF"}")
}

// v232: Playback Chapter Sync232
internal fun PlayerActivity.showV232PlaybackChapterSync232Toggle() {
    val current = BiliClient.prefs.v232playbackChapterSync232
    BiliClient.prefs.v232playbackChapterSync232 = !current
    AppToast.show(this, "Playback Chapter Sync232: ${if (!current) "ON" else "OFF"}")
}

// v232: Screenshot Save Path232
internal fun PlayerActivity.showV232ScreenshotSavePath232Toggle() {
    val current = BiliClient.prefs.v232screenshotSavePath232
    BiliClient.prefs.v232screenshotSavePath232 = !current
    AppToast.show(this, "Screenshot Save Path232: ${if (!current) "ON" else "OFF"}")
}

// v232: Video Color Space232
internal fun PlayerActivity.showV232VideoColorSpace232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232videoColorSpace232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232videoColorSpace232 = value
        AppToast.show(this, "Video Color Space232: $value")
    }
}

// v232: Danmaku Bottom Max Count272
internal fun PlayerActivity.showV232DanmakuBottomMaxCount272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount272 = value
        AppToast.show(this, "Danmaku Bottom Max Count272: $value")
    }
}

// v232: Subtitle Bg Border279
internal fun PlayerActivity.showV232SubtitleBgBorder279Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder279
    BiliClient.prefs.v232subtitleBgBorder279 = !current
    AppToast.show(this, "Subtitle Bg Border279: ${if (!current) "ON" else "OFF"}")
}

// v233: Audio EQ Custom233
internal fun PlayerActivity.showV233AudioEQCustom233Toggle() {
    val current = BiliClient.prefs.v233audioEQCustom233
    BiliClient.prefs.v233audioEQCustom233 = !current
    AppToast.show(this, "Audio EQ Custom233: ${if (!current) "ON" else "OFF"}")
}

// v233: Danmaku Bottom Max Count273
internal fun PlayerActivity.showV233DanmakuBottomMaxCount273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount273 = value
        AppToast.show(this, "Danmaku Bottom Max Count273: $value")
    }
}

// v233: Subtitle Bg Border280
internal fun PlayerActivity.showV233SubtitleBgBorder280Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder280
    BiliClient.prefs.v233subtitleBgBorder280 = !current
    AppToast.show(this, "Subtitle Bg Border280: ${if (!current) "ON" else "OFF"}")
}

// v233: Gesture Shake Action233
internal fun PlayerActivity.showV233GestureShakeAction233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233gestureShakeAction233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233gestureShakeAction233 = value
        AppToast.show(this, "Gesture Shake Action233: $value")
    }
}

// v233: Cast Audio Volume233
internal fun PlayerActivity.showV233CastAudioVolume233Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v233castAudioVolume233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233castAudioVolume233 = value
        AppToast.show(this, "Cast Audio Volume233: $value")
    }
}

// v233: Playlist Auto Skip Outro233
internal fun PlayerActivity.showV233PlaylistAutoSkipOutro233Toggle() {
    val current = BiliClient.prefs.v233playlistAutoSkipOutro233
    BiliClient.prefs.v233playlistAutoSkipOutro233 = !current
    AppToast.show(this, "Playlist Auto Skip Outro233: ${if (!current) "ON" else "OFF"}")
}

// v233: Cache Download Speed234
internal fun PlayerActivity.showV233CacheDownloadSpeed234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233cacheDownloadSpeed234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233cacheDownloadSpeed234 = value
        AppToast.show(this, "Cache Download Speed234: $value")
    }
}

// v233: Progress Bar Thumb Border233
internal fun PlayerActivity.showV233ProgressBarThumbBorder233Toggle() {
    val current = BiliClient.prefs.v233progressBarThumbBorder233
    BiliClient.prefs.v233progressBarThumbBorder233 = !current
    AppToast.show(this, "Progress Bar Thumb Border233: ${if (!current) "ON" else "OFF"}")
}

// v233: Volume Boost Peak233
internal fun PlayerActivity.showV233VolumeBoostPeak233Toggle() {
    val current = BiliClient.prefs.v233volumeBoostPeak233
    BiliClient.prefs.v233volumeBoostPeak233 = !current
    AppToast.show(this, "Volume Boost Peak233: ${if (!current) "ON" else "OFF"}")
}

// v233: History Bookmark Export233
internal fun PlayerActivity.showV233HistoryBookmarkExport233Toggle() {
    val current = BiliClient.prefs.v233historyBookmarkExport233
    BiliClient.prefs.v233historyBookmarkExport233 = !current
    AppToast.show(this, "History Bookmark Export233: ${if (!current) "ON" else "OFF"}")
}

// v233: Playback Chapter Sync233
internal fun PlayerActivity.showV233PlaybackChapterSync233Toggle() {
    val current = BiliClient.prefs.v233playbackChapterSync233
    BiliClient.prefs.v233playbackChapterSync233 = !current
    AppToast.show(this, "Playback Chapter Sync233: ${if (!current) "ON" else "OFF"}")
}

// v233: Screenshot Save Path233
internal fun PlayerActivity.showV233ScreenshotSavePath233Toggle() {
    val current = BiliClient.prefs.v233screenshotSavePath233
    BiliClient.prefs.v233screenshotSavePath233 = !current
    AppToast.show(this, "Screenshot Save Path233: ${if (!current) "ON" else "OFF"}")
}

// v233: Video Color Space233
internal fun PlayerActivity.showV233VideoColorSpace233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233videoColorSpace233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233videoColorSpace233 = value
        AppToast.show(this, "Video Color Space233: $value")
    }
}

// v233: Danmaku Bottom Max Count274
internal fun PlayerActivity.showV233DanmakuBottomMaxCount274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount274 = value
        AppToast.show(this, "Danmaku Bottom Max Count274: $value")
    }
}

// v233: Subtitle Bg Border281
internal fun PlayerActivity.showV233SubtitleBgBorder281Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder281
    BiliClient.prefs.v233subtitleBgBorder281 = !current
    AppToast.show(this, "Subtitle Bg Border281: ${if (!current) "ON" else "OFF"}")
}

// v234: Audio EQ Custom234
internal fun PlayerActivity.showV234AudioEQCustom234Toggle() {
    val current = BiliClient.prefs.v234audioEQCustom234
    BiliClient.prefs.v234audioEQCustom234 = !current
    AppToast.show(this, "Audio EQ Custom234: ${if (!current) "ON" else "OFF"}")
}

// v234: Danmaku Bottom Max Count275
internal fun PlayerActivity.showV234DanmakuBottomMaxCount275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount275 = value
        AppToast.show(this, "Danmaku Bottom Max Count275: $value")
    }
}

// v234: Subtitle Bg Border282
internal fun PlayerActivity.showV234SubtitleBgBorder282Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder282
    BiliClient.prefs.v234subtitleBgBorder282 = !current
    AppToast.show(this, "Subtitle Bg Border282: ${if (!current) "ON" else "OFF"}")
}

// v234: Gesture Shake Action234
internal fun PlayerActivity.showV234GestureShakeAction234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234gestureShakeAction234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234gestureShakeAction234 = value
        AppToast.show(this, "Gesture Shake Action234: $value")
    }
}

// v234: Cast Audio Volume234
internal fun PlayerActivity.showV234CastAudioVolume234Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v234castAudioVolume234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234castAudioVolume234 = value
        AppToast.show(this, "Cast Audio Volume234: $value")
    }
}

// v234: Playlist Auto Skip Outro234
internal fun PlayerActivity.showV234PlaylistAutoSkipOutro234Toggle() {
    val current = BiliClient.prefs.v234playlistAutoSkipOutro234
    BiliClient.prefs.v234playlistAutoSkipOutro234 = !current
    AppToast.show(this, "Playlist Auto Skip Outro234: ${if (!current) "ON" else "OFF"}")
}

// v234: Cache Download Speed235
internal fun PlayerActivity.showV234CacheDownloadSpeed235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234cacheDownloadSpeed235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234cacheDownloadSpeed235 = value
        AppToast.show(this, "Cache Download Speed235: $value")
    }
}

// v234: Progress Bar Thumb Border234
internal fun PlayerActivity.showV234ProgressBarThumbBorder234Toggle() {
    val current = BiliClient.prefs.v234progressBarThumbBorder234
    BiliClient.prefs.v234progressBarThumbBorder234 = !current
    AppToast.show(this, "Progress Bar Thumb Border234: ${if (!current) "ON" else "OFF"}")
}

// v234: Volume Boost Peak234
internal fun PlayerActivity.showV234VolumeBoostPeak234Toggle() {
    val current = BiliClient.prefs.v234volumeBoostPeak234
    BiliClient.prefs.v234volumeBoostPeak234 = !current
    AppToast.show(this, "Volume Boost Peak234: ${if (!current) "ON" else "OFF"}")
}

// v234: History Bookmark Export234
internal fun PlayerActivity.showV234HistoryBookmarkExport234Toggle() {
    val current = BiliClient.prefs.v234historyBookmarkExport234
    BiliClient.prefs.v234historyBookmarkExport234 = !current
    AppToast.show(this, "History Bookmark Export234: ${if (!current) "ON" else "OFF"}")
}

// v234: Playback Chapter Sync234
internal fun PlayerActivity.showV234PlaybackChapterSync234Toggle() {
    val current = BiliClient.prefs.v234playbackChapterSync234
    BiliClient.prefs.v234playbackChapterSync234 = !current
    AppToast.show(this, "Playback Chapter Sync234: ${if (!current) "ON" else "OFF"}")
}

// v234: Screenshot Save Path234
internal fun PlayerActivity.showV234ScreenshotSavePath234Toggle() {
    val current = BiliClient.prefs.v234screenshotSavePath234
    BiliClient.prefs.v234screenshotSavePath234 = !current
    AppToast.show(this, "Screenshot Save Path234: ${if (!current) "ON" else "OFF"}")
}

// v234: Video Color Space234
internal fun PlayerActivity.showV234VideoColorSpace234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234videoColorSpace234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234videoColorSpace234 = value
        AppToast.show(this, "Video Color Space234: $value")
    }
}

// v234: Danmaku Bottom Max Count276
internal fun PlayerActivity.showV234DanmakuBottomMaxCount276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount276 = value
        AppToast.show(this, "Danmaku Bottom Max Count276: $value")
    }
}

// v234: Subtitle Bg Border283
internal fun PlayerActivity.showV234SubtitleBgBorder283Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder283
    BiliClient.prefs.v234subtitleBgBorder283 = !current
    AppToast.show(this, "Subtitle Bg Border283: ${if (!current) "ON" else "OFF"}")
}

// v235: Audio EQ Custom235
internal fun PlayerActivity.showV235AudioEQCustom235Toggle() {
    val current = BiliClient.prefs.v235audioEQCustom235
    BiliClient.prefs.v235audioEQCustom235 = !current
    AppToast.show(this, "Audio EQ Custom235: ${if (!current) "ON" else "OFF"}")
}

// v235: Danmaku Bottom Max Count277
internal fun PlayerActivity.showV235DanmakuBottomMaxCount277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount277 = value
        AppToast.show(this, "Danmaku Bottom Max Count277: $value")
    }
}

// v235: Subtitle Bg Border284
internal fun PlayerActivity.showV235SubtitleBgBorder284Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder284
    BiliClient.prefs.v235subtitleBgBorder284 = !current
    AppToast.show(this, "Subtitle Bg Border284: ${if (!current) "ON" else "OFF"}")
}

// v235: Gesture Shake Action235
internal fun PlayerActivity.showV235GestureShakeAction235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235gestureShakeAction235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235gestureShakeAction235 = value
        AppToast.show(this, "Gesture Shake Action235: $value")
    }
}

// v235: Cast Audio Volume235
internal fun PlayerActivity.showV235CastAudioVolume235Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v235castAudioVolume235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235castAudioVolume235 = value
        AppToast.show(this, "Cast Audio Volume235: $value")
    }
}

// v235: Playlist Auto Skip Outro235
internal fun PlayerActivity.showV235PlaylistAutoSkipOutro235Toggle() {
    val current = BiliClient.prefs.v235playlistAutoSkipOutro235
    BiliClient.prefs.v235playlistAutoSkipOutro235 = !current
    AppToast.show(this, "Playlist Auto Skip Outro235: ${if (!current) "ON" else "OFF"}")
}

// v235: Cache Download Speed236
internal fun PlayerActivity.showV235CacheDownloadSpeed236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235cacheDownloadSpeed236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235cacheDownloadSpeed236 = value
        AppToast.show(this, "Cache Download Speed236: $value")
    }
}

// v235: Progress Bar Thumb Border235
internal fun PlayerActivity.showV235ProgressBarThumbBorder235Toggle() {
    val current = BiliClient.prefs.v235progressBarThumbBorder235
    BiliClient.prefs.v235progressBarThumbBorder235 = !current
    AppToast.show(this, "Progress Bar Thumb Border235: ${if (!current) "ON" else "OFF"}")
}

// v235: Volume Boost Peak235
internal fun PlayerActivity.showV235VolumeBoostPeak235Toggle() {
    val current = BiliClient.prefs.v235volumeBoostPeak235
    BiliClient.prefs.v235volumeBoostPeak235 = !current
    AppToast.show(this, "Volume Boost Peak235: ${if (!current) "ON" else "OFF"}")
}

// v235: History Bookmark Export235
internal fun PlayerActivity.showV235HistoryBookmarkExport235Toggle() {
    val current = BiliClient.prefs.v235historyBookmarkExport235
    BiliClient.prefs.v235historyBookmarkExport235 = !current
    AppToast.show(this, "History Bookmark Export235: ${if (!current) "ON" else "OFF"}")
}

// v235: Playback Chapter Sync235
internal fun PlayerActivity.showV235PlaybackChapterSync235Toggle() {
    val current = BiliClient.prefs.v235playbackChapterSync235
    BiliClient.prefs.v235playbackChapterSync235 = !current
    AppToast.show(this, "Playback Chapter Sync235: ${if (!current) "ON" else "OFF"}")
}

// v235: Screenshot Save Path235
internal fun PlayerActivity.showV235ScreenshotSavePath235Toggle() {
    val current = BiliClient.prefs.v235screenshotSavePath235
    BiliClient.prefs.v235screenshotSavePath235 = !current
    AppToast.show(this, "Screenshot Save Path235: ${if (!current) "ON" else "OFF"}")
}

// v235: Video Color Space235
internal fun PlayerActivity.showV235VideoColorSpace235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235videoColorSpace235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235videoColorSpace235 = value
        AppToast.show(this, "Video Color Space235: $value")
    }
}

// v235: Danmaku Bottom Max Count278
internal fun PlayerActivity.showV235DanmakuBottomMaxCount278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount278 = value
        AppToast.show(this, "Danmaku Bottom Max Count278: $value")
    }
}

// v235: Subtitle Bg Border285
internal fun PlayerActivity.showV235SubtitleBgBorder285Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder285
    BiliClient.prefs.v235subtitleBgBorder285 = !current
    AppToast.show(this, "Subtitle Bg Border285: ${if (!current) "ON" else "OFF"}")
}

// v236: Audio EQ Custom236
internal fun PlayerActivity.showV236AudioEQCustom236Toggle() {
    val current = BiliClient.prefs.v236audioEQCustom236
    BiliClient.prefs.v236audioEQCustom236 = !current
    AppToast.show(this, "Audio EQ Custom236: ${if (!current) "ON" else "OFF"}")
}

// v236: Danmaku Bottom Max Count279
internal fun PlayerActivity.showV236DanmakuBottomMaxCount279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount279 = value
        AppToast.show(this, "Danmaku Bottom Max Count279: $value")
    }
}

// v236: Subtitle Bg Border286
internal fun PlayerActivity.showV236SubtitleBgBorder286Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder286
    BiliClient.prefs.v236subtitleBgBorder286 = !current
    AppToast.show(this, "Subtitle Bg Border286: ${if (!current) "ON" else "OFF"}")
}

// v236: Gesture Shake Action236
internal fun PlayerActivity.showV236GestureShakeAction236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236gestureShakeAction236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236gestureShakeAction236 = value
        AppToast.show(this, "Gesture Shake Action236: $value")
    }
}

// v236: Cast Audio Volume236
internal fun PlayerActivity.showV236CastAudioVolume236Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v236castAudioVolume236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236castAudioVolume236 = value
        AppToast.show(this, "Cast Audio Volume236: $value")
    }
}

// v236: Playlist Auto Skip Outro236
internal fun PlayerActivity.showV236PlaylistAutoSkipOutro236Toggle() {
    val current = BiliClient.prefs.v236playlistAutoSkipOutro236
    BiliClient.prefs.v236playlistAutoSkipOutro236 = !current
    AppToast.show(this, "Playlist Auto Skip Outro236: ${if (!current) "ON" else "OFF"}")
}

// v236: Cache Download Speed237
internal fun PlayerActivity.showV236CacheDownloadSpeed237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236cacheDownloadSpeed237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236cacheDownloadSpeed237 = value
        AppToast.show(this, "Cache Download Speed237: $value")
    }
}

// v236: Progress Bar Thumb Border236
internal fun PlayerActivity.showV236ProgressBarThumbBorder236Toggle() {
    val current = BiliClient.prefs.v236progressBarThumbBorder236
    BiliClient.prefs.v236progressBarThumbBorder236 = !current
    AppToast.show(this, "Progress Bar Thumb Border236: ${if (!current) "ON" else "OFF"}")
}
