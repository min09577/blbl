package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v981: place mode
internal fun PlayerActivity.showV981PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v981place
    FeaturePrefsStore.batch981.v981place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v981: plain mode
internal fun PlayerActivity.showV981PlainToggle() {
    val current = FeaturePrefsStore.batch981.v981plain
    FeaturePrefsStore.batch981.v981plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v981: plan mode
internal fun PlayerActivity.showV981PlanToggle() {
    val current = FeaturePrefsStore.batch981.v981plan
    FeaturePrefsStore.batch981.v981plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v981: platform mode
internal fun PlayerActivity.showV981PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v981platform
    FeaturePrefsStore.batch981.v981platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v981: play mode
internal fun PlayerActivity.showV981PlayToggle() {
    val current = FeaturePrefsStore.batch981.v981play
    FeaturePrefsStore.batch981.v981play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v981: player level
internal fun PlayerActivity.showV981PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981player = value
        AppToast.show(this, "player: $value")
    }
}

// v981: pointer level
internal fun PlayerActivity.showV981PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v981: poll level
internal fun PlayerActivity.showV981PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v981: pool level
internal fun PlayerActivity.showV981PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v981: pop level
internal fun PlayerActivity.showV981PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v981: port mode
internal fun PlayerActivity.showV981PortToggle() {
    val current = FeaturePrefsStore.batch981.v981port
    FeaturePrefsStore.batch981.v981port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v981: position mode
internal fun PlayerActivity.showV981PositionToggle() {
    val current = FeaturePrefsStore.batch981.v981position
    FeaturePrefsStore.batch981.v981position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v981: post mode
internal fun PlayerActivity.showV981PostToggle() {
    val current = FeaturePrefsStore.batch981.v981post
    FeaturePrefsStore.batch981.v981post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v981: power mode
internal fun PlayerActivity.showV981PowerToggle() {
    val current = FeaturePrefsStore.batch981.v981power
    FeaturePrefsStore.batch981.v981power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v981: pre mode
internal fun PlayerActivity.showV981PreToggle() {
    val current = FeaturePrefsStore.batch981.v981pre
    FeaturePrefsStore.batch981.v981pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v982: place mode
internal fun PlayerActivity.showV982PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v982place
    FeaturePrefsStore.batch981.v982place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v982: plain mode
internal fun PlayerActivity.showV982PlainToggle() {
    val current = FeaturePrefsStore.batch981.v982plain
    FeaturePrefsStore.batch981.v982plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v982: plan mode
internal fun PlayerActivity.showV982PlanToggle() {
    val current = FeaturePrefsStore.batch981.v982plan
    FeaturePrefsStore.batch981.v982plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v982: platform mode
internal fun PlayerActivity.showV982PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v982platform
    FeaturePrefsStore.batch981.v982platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v982: play mode
internal fun PlayerActivity.showV982PlayToggle() {
    val current = FeaturePrefsStore.batch981.v982play
    FeaturePrefsStore.batch981.v982play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v982: player level
internal fun PlayerActivity.showV982PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982player = value
        AppToast.show(this, "player: $value")
    }
}

// v982: pointer level
internal fun PlayerActivity.showV982PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v982: poll level
internal fun PlayerActivity.showV982PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v982: pool level
internal fun PlayerActivity.showV982PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v982: pop level
internal fun PlayerActivity.showV982PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v982: port mode
internal fun PlayerActivity.showV982PortToggle() {
    val current = FeaturePrefsStore.batch981.v982port
    FeaturePrefsStore.batch981.v982port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v982: position mode
internal fun PlayerActivity.showV982PositionToggle() {
    val current = FeaturePrefsStore.batch981.v982position
    FeaturePrefsStore.batch981.v982position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v982: post mode
internal fun PlayerActivity.showV982PostToggle() {
    val current = FeaturePrefsStore.batch981.v982post
    FeaturePrefsStore.batch981.v982post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v982: power mode
internal fun PlayerActivity.showV982PowerToggle() {
    val current = FeaturePrefsStore.batch981.v982power
    FeaturePrefsStore.batch981.v982power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v982: pre mode
internal fun PlayerActivity.showV982PreToggle() {
    val current = FeaturePrefsStore.batch981.v982pre
    FeaturePrefsStore.batch981.v982pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v983: place mode
internal fun PlayerActivity.showV983PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v983place
    FeaturePrefsStore.batch981.v983place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v983: plain mode
internal fun PlayerActivity.showV983PlainToggle() {
    val current = FeaturePrefsStore.batch981.v983plain
    FeaturePrefsStore.batch981.v983plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v983: plan mode
internal fun PlayerActivity.showV983PlanToggle() {
    val current = FeaturePrefsStore.batch981.v983plan
    FeaturePrefsStore.batch981.v983plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v983: platform mode
internal fun PlayerActivity.showV983PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v983platform
    FeaturePrefsStore.batch981.v983platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v983: play mode
internal fun PlayerActivity.showV983PlayToggle() {
    val current = FeaturePrefsStore.batch981.v983play
    FeaturePrefsStore.batch981.v983play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v983: player level
internal fun PlayerActivity.showV983PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983player = value
        AppToast.show(this, "player: $value")
    }
}

// v983: pointer level
internal fun PlayerActivity.showV983PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v983: poll level
internal fun PlayerActivity.showV983PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v983: pool level
internal fun PlayerActivity.showV983PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v983: pop level
internal fun PlayerActivity.showV983PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v983: port mode
internal fun PlayerActivity.showV983PortToggle() {
    val current = FeaturePrefsStore.batch981.v983port
    FeaturePrefsStore.batch981.v983port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v983: position mode
internal fun PlayerActivity.showV983PositionToggle() {
    val current = FeaturePrefsStore.batch981.v983position
    FeaturePrefsStore.batch981.v983position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v983: post mode
internal fun PlayerActivity.showV983PostToggle() {
    val current = FeaturePrefsStore.batch981.v983post
    FeaturePrefsStore.batch981.v983post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v983: power mode
internal fun PlayerActivity.showV983PowerToggle() {
    val current = FeaturePrefsStore.batch981.v983power
    FeaturePrefsStore.batch981.v983power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v983: pre mode
internal fun PlayerActivity.showV983PreToggle() {
    val current = FeaturePrefsStore.batch981.v983pre
    FeaturePrefsStore.batch981.v983pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v984: place mode
internal fun PlayerActivity.showV984PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v984place
    FeaturePrefsStore.batch981.v984place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v984: plain mode
internal fun PlayerActivity.showV984PlainToggle() {
    val current = FeaturePrefsStore.batch981.v984plain
    FeaturePrefsStore.batch981.v984plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v984: plan mode
internal fun PlayerActivity.showV984PlanToggle() {
    val current = FeaturePrefsStore.batch981.v984plan
    FeaturePrefsStore.batch981.v984plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v984: platform mode
internal fun PlayerActivity.showV984PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v984platform
    FeaturePrefsStore.batch981.v984platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v984: play mode
internal fun PlayerActivity.showV984PlayToggle() {
    val current = FeaturePrefsStore.batch981.v984play
    FeaturePrefsStore.batch981.v984play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v984: player level
internal fun PlayerActivity.showV984PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984player = value
        AppToast.show(this, "player: $value")
    }
}

// v984: pointer level
internal fun PlayerActivity.showV984PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v984: poll level
internal fun PlayerActivity.showV984PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v984: pool level
internal fun PlayerActivity.showV984PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v984: pop level
internal fun PlayerActivity.showV984PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v984: port mode
internal fun PlayerActivity.showV984PortToggle() {
    val current = FeaturePrefsStore.batch981.v984port
    FeaturePrefsStore.batch981.v984port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v984: position mode
internal fun PlayerActivity.showV984PositionToggle() {
    val current = FeaturePrefsStore.batch981.v984position
    FeaturePrefsStore.batch981.v984position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v984: post mode
internal fun PlayerActivity.showV984PostToggle() {
    val current = FeaturePrefsStore.batch981.v984post
    FeaturePrefsStore.batch981.v984post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v984: power mode
internal fun PlayerActivity.showV984PowerToggle() {
    val current = FeaturePrefsStore.batch981.v984power
    FeaturePrefsStore.batch981.v984power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v984: pre mode
internal fun PlayerActivity.showV984PreToggle() {
    val current = FeaturePrefsStore.batch981.v984pre
    FeaturePrefsStore.batch981.v984pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v985: place mode
internal fun PlayerActivity.showV985PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v985place
    FeaturePrefsStore.batch981.v985place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v985: plain mode
internal fun PlayerActivity.showV985PlainToggle() {
    val current = FeaturePrefsStore.batch981.v985plain
    FeaturePrefsStore.batch981.v985plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v985: plan mode
internal fun PlayerActivity.showV985PlanToggle() {
    val current = FeaturePrefsStore.batch981.v985plan
    FeaturePrefsStore.batch981.v985plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v985: platform mode
internal fun PlayerActivity.showV985PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v985platform
    FeaturePrefsStore.batch981.v985platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v985: play mode
internal fun PlayerActivity.showV985PlayToggle() {
    val current = FeaturePrefsStore.batch981.v985play
    FeaturePrefsStore.batch981.v985play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v985: player level
internal fun PlayerActivity.showV985PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985player = value
        AppToast.show(this, "player: $value")
    }
}

// v985: pointer level
internal fun PlayerActivity.showV985PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v985: poll level
internal fun PlayerActivity.showV985PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v985: pool level
internal fun PlayerActivity.showV985PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v985: pop level
internal fun PlayerActivity.showV985PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v985: port mode
internal fun PlayerActivity.showV985PortToggle() {
    val current = FeaturePrefsStore.batch981.v985port
    FeaturePrefsStore.batch981.v985port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v985: position mode
internal fun PlayerActivity.showV985PositionToggle() {
    val current = FeaturePrefsStore.batch981.v985position
    FeaturePrefsStore.batch981.v985position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v985: post mode
internal fun PlayerActivity.showV985PostToggle() {
    val current = FeaturePrefsStore.batch981.v985post
    FeaturePrefsStore.batch981.v985post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v985: power mode
internal fun PlayerActivity.showV985PowerToggle() {
    val current = FeaturePrefsStore.batch981.v985power
    FeaturePrefsStore.batch981.v985power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v985: pre mode
internal fun PlayerActivity.showV985PreToggle() {
    val current = FeaturePrefsStore.batch981.v985pre
    FeaturePrefsStore.batch981.v985pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v986: place mode
internal fun PlayerActivity.showV986PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v986place
    FeaturePrefsStore.batch981.v986place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v986: plain mode
internal fun PlayerActivity.showV986PlainToggle() {
    val current = FeaturePrefsStore.batch981.v986plain
    FeaturePrefsStore.batch981.v986plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v986: plan mode
internal fun PlayerActivity.showV986PlanToggle() {
    val current = FeaturePrefsStore.batch981.v986plan
    FeaturePrefsStore.batch981.v986plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v986: platform mode
internal fun PlayerActivity.showV986PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v986platform
    FeaturePrefsStore.batch981.v986platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v986: play mode
internal fun PlayerActivity.showV986PlayToggle() {
    val current = FeaturePrefsStore.batch981.v986play
    FeaturePrefsStore.batch981.v986play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v986: player level
internal fun PlayerActivity.showV986PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986player = value
        AppToast.show(this, "player: $value")
    }
}

// v986: pointer level
internal fun PlayerActivity.showV986PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v986: poll level
internal fun PlayerActivity.showV986PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v986: pool level
internal fun PlayerActivity.showV986PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v986: pop level
internal fun PlayerActivity.showV986PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v986: port mode
internal fun PlayerActivity.showV986PortToggle() {
    val current = FeaturePrefsStore.batch981.v986port
    FeaturePrefsStore.batch981.v986port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v986: position mode
internal fun PlayerActivity.showV986PositionToggle() {
    val current = FeaturePrefsStore.batch981.v986position
    FeaturePrefsStore.batch981.v986position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v986: post mode
internal fun PlayerActivity.showV986PostToggle() {
    val current = FeaturePrefsStore.batch981.v986post
    FeaturePrefsStore.batch981.v986post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v986: power mode
internal fun PlayerActivity.showV986PowerToggle() {
    val current = FeaturePrefsStore.batch981.v986power
    FeaturePrefsStore.batch981.v986power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v986: pre mode
internal fun PlayerActivity.showV986PreToggle() {
    val current = FeaturePrefsStore.batch981.v986pre
    FeaturePrefsStore.batch981.v986pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v987: place mode
internal fun PlayerActivity.showV987PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v987place
    FeaturePrefsStore.batch981.v987place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v987: plain mode
internal fun PlayerActivity.showV987PlainToggle() {
    val current = FeaturePrefsStore.batch981.v987plain
    FeaturePrefsStore.batch981.v987plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v987: plan mode
internal fun PlayerActivity.showV987PlanToggle() {
    val current = FeaturePrefsStore.batch981.v987plan
    FeaturePrefsStore.batch981.v987plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v987: platform mode
internal fun PlayerActivity.showV987PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v987platform
    FeaturePrefsStore.batch981.v987platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v987: play mode
internal fun PlayerActivity.showV987PlayToggle() {
    val current = FeaturePrefsStore.batch981.v987play
    FeaturePrefsStore.batch981.v987play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v987: player level
internal fun PlayerActivity.showV987PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987player = value
        AppToast.show(this, "player: $value")
    }
}

// v987: pointer level
internal fun PlayerActivity.showV987PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v987: poll level
internal fun PlayerActivity.showV987PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v987: pool level
internal fun PlayerActivity.showV987PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v987: pop level
internal fun PlayerActivity.showV987PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v987: port mode
internal fun PlayerActivity.showV987PortToggle() {
    val current = FeaturePrefsStore.batch981.v987port
    FeaturePrefsStore.batch981.v987port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v987: position mode
internal fun PlayerActivity.showV987PositionToggle() {
    val current = FeaturePrefsStore.batch981.v987position
    FeaturePrefsStore.batch981.v987position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v987: post mode
internal fun PlayerActivity.showV987PostToggle() {
    val current = FeaturePrefsStore.batch981.v987post
    FeaturePrefsStore.batch981.v987post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v987: power mode
internal fun PlayerActivity.showV987PowerToggle() {
    val current = FeaturePrefsStore.batch981.v987power
    FeaturePrefsStore.batch981.v987power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v987: pre mode
internal fun PlayerActivity.showV987PreToggle() {
    val current = FeaturePrefsStore.batch981.v987pre
    FeaturePrefsStore.batch981.v987pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v988: place mode
internal fun PlayerActivity.showV988PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v988place
    FeaturePrefsStore.batch981.v988place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v988: plain mode
internal fun PlayerActivity.showV988PlainToggle() {
    val current = FeaturePrefsStore.batch981.v988plain
    FeaturePrefsStore.batch981.v988plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v988: plan mode
internal fun PlayerActivity.showV988PlanToggle() {
    val current = FeaturePrefsStore.batch981.v988plan
    FeaturePrefsStore.batch981.v988plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v988: platform mode
internal fun PlayerActivity.showV988PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v988platform
    FeaturePrefsStore.batch981.v988platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v988: play mode
internal fun PlayerActivity.showV988PlayToggle() {
    val current = FeaturePrefsStore.batch981.v988play
    FeaturePrefsStore.batch981.v988play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v988: player level
internal fun PlayerActivity.showV988PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988player = value
        AppToast.show(this, "player: $value")
    }
}

// v988: pointer level
internal fun PlayerActivity.showV988PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v988: poll level
internal fun PlayerActivity.showV988PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v988: pool level
internal fun PlayerActivity.showV988PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v988: pop level
internal fun PlayerActivity.showV988PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v988: port mode
internal fun PlayerActivity.showV988PortToggle() {
    val current = FeaturePrefsStore.batch981.v988port
    FeaturePrefsStore.batch981.v988port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v988: position mode
internal fun PlayerActivity.showV988PositionToggle() {
    val current = FeaturePrefsStore.batch981.v988position
    FeaturePrefsStore.batch981.v988position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v988: post mode
internal fun PlayerActivity.showV988PostToggle() {
    val current = FeaturePrefsStore.batch981.v988post
    FeaturePrefsStore.batch981.v988post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v988: power mode
internal fun PlayerActivity.showV988PowerToggle() {
    val current = FeaturePrefsStore.batch981.v988power
    FeaturePrefsStore.batch981.v988power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v988: pre mode
internal fun PlayerActivity.showV988PreToggle() {
    val current = FeaturePrefsStore.batch981.v988pre
    FeaturePrefsStore.batch981.v988pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v989: place mode
internal fun PlayerActivity.showV989PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v989place
    FeaturePrefsStore.batch981.v989place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v989: plain mode
internal fun PlayerActivity.showV989PlainToggle() {
    val current = FeaturePrefsStore.batch981.v989plain
    FeaturePrefsStore.batch981.v989plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v989: plan mode
internal fun PlayerActivity.showV989PlanToggle() {
    val current = FeaturePrefsStore.batch981.v989plan
    FeaturePrefsStore.batch981.v989plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v989: platform mode
internal fun PlayerActivity.showV989PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v989platform
    FeaturePrefsStore.batch981.v989platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v989: play mode
internal fun PlayerActivity.showV989PlayToggle() {
    val current = FeaturePrefsStore.batch981.v989play
    FeaturePrefsStore.batch981.v989play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v989: player level
internal fun PlayerActivity.showV989PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989player = value
        AppToast.show(this, "player: $value")
    }
}

// v989: pointer level
internal fun PlayerActivity.showV989PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v989: poll level
internal fun PlayerActivity.showV989PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v989: pool level
internal fun PlayerActivity.showV989PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v989: pop level
internal fun PlayerActivity.showV989PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v989: port mode
internal fun PlayerActivity.showV989PortToggle() {
    val current = FeaturePrefsStore.batch981.v989port
    FeaturePrefsStore.batch981.v989port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v989: position mode
internal fun PlayerActivity.showV989PositionToggle() {
    val current = FeaturePrefsStore.batch981.v989position
    FeaturePrefsStore.batch981.v989position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v989: post mode
internal fun PlayerActivity.showV989PostToggle() {
    val current = FeaturePrefsStore.batch981.v989post
    FeaturePrefsStore.batch981.v989post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v989: power mode
internal fun PlayerActivity.showV989PowerToggle() {
    val current = FeaturePrefsStore.batch981.v989power
    FeaturePrefsStore.batch981.v989power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v989: pre mode
internal fun PlayerActivity.showV989PreToggle() {
    val current = FeaturePrefsStore.batch981.v989pre
    FeaturePrefsStore.batch981.v989pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v990: place mode
internal fun PlayerActivity.showV990PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v990place
    FeaturePrefsStore.batch981.v990place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v990: plain mode
internal fun PlayerActivity.showV990PlainToggle() {
    val current = FeaturePrefsStore.batch981.v990plain
    FeaturePrefsStore.batch981.v990plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v990: plan mode
internal fun PlayerActivity.showV990PlanToggle() {
    val current = FeaturePrefsStore.batch981.v990plan
    FeaturePrefsStore.batch981.v990plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v990: platform mode
internal fun PlayerActivity.showV990PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v990platform
    FeaturePrefsStore.batch981.v990platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v990: play mode
internal fun PlayerActivity.showV990PlayToggle() {
    val current = FeaturePrefsStore.batch981.v990play
    FeaturePrefsStore.batch981.v990play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v990: player level
internal fun PlayerActivity.showV990PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990player = value
        AppToast.show(this, "player: $value")
    }
}

// v990: pointer level
internal fun PlayerActivity.showV990PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v990: poll level
internal fun PlayerActivity.showV990PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v990: pool level
internal fun PlayerActivity.showV990PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v990: pop level
internal fun PlayerActivity.showV990PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v990: port mode
internal fun PlayerActivity.showV990PortToggle() {
    val current = FeaturePrefsStore.batch981.v990port
    FeaturePrefsStore.batch981.v990port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v990: position mode
internal fun PlayerActivity.showV990PositionToggle() {
    val current = FeaturePrefsStore.batch981.v990position
    FeaturePrefsStore.batch981.v990position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v990: post mode
internal fun PlayerActivity.showV990PostToggle() {
    val current = FeaturePrefsStore.batch981.v990post
    FeaturePrefsStore.batch981.v990post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v990: power mode
internal fun PlayerActivity.showV990PowerToggle() {
    val current = FeaturePrefsStore.batch981.v990power
    FeaturePrefsStore.batch981.v990power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v990: pre mode
internal fun PlayerActivity.showV990PreToggle() {
    val current = FeaturePrefsStore.batch981.v990pre
    FeaturePrefsStore.batch981.v990pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

