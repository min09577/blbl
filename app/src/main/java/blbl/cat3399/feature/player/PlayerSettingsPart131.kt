package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1491: genre mode
internal fun PlayerActivity.showV1491GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1491genre
    FeaturePrefsStore.batch1491.v1491genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1491: gentle mode
internal fun PlayerActivity.showV1491GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1491gentle
    FeaturePrefsStore.batch1491.v1491gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1491: gift mode
internal fun PlayerActivity.showV1491GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1491gift
    FeaturePrefsStore.batch1491.v1491gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1491: glad mode
internal fun PlayerActivity.showV1491GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1491glad
    FeaturePrefsStore.batch1491.v1491glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1491: glance mode
internal fun PlayerActivity.showV1491GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1491glance
    FeaturePrefsStore.batch1491.v1491glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1491: glass level
internal fun PlayerActivity.showV1491GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1491glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1491glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1491: globe level
internal fun PlayerActivity.showV1491GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1491globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1491globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1491: glory level
internal fun PlayerActivity.showV1491GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1491glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1491glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1491: glove level
internal fun PlayerActivity.showV1491GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1491glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1491glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1491: go level
internal fun PlayerActivity.showV1491GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1491go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1491go = value
        AppToast.show(this, "go: $value")
    }
}

// v1491: goal mode
internal fun PlayerActivity.showV1491GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1491goal
    FeaturePrefsStore.batch1491.v1491goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1491: goat mode
internal fun PlayerActivity.showV1491GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1491goat
    FeaturePrefsStore.batch1491.v1491goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1491: god mode
internal fun PlayerActivity.showV1491GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1491god
    FeaturePrefsStore.batch1491.v1491god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1491: gold mode
internal fun PlayerActivity.showV1491GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1491gold
    FeaturePrefsStore.batch1491.v1491gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1491: good mode
internal fun PlayerActivity.showV1491GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1491good
    FeaturePrefsStore.batch1491.v1491good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1492: genre mode
internal fun PlayerActivity.showV1492GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1492genre
    FeaturePrefsStore.batch1491.v1492genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1492: gentle mode
internal fun PlayerActivity.showV1492GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1492gentle
    FeaturePrefsStore.batch1491.v1492gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1492: gift mode
internal fun PlayerActivity.showV1492GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1492gift
    FeaturePrefsStore.batch1491.v1492gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1492: glad mode
internal fun PlayerActivity.showV1492GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1492glad
    FeaturePrefsStore.batch1491.v1492glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1492: glance mode
internal fun PlayerActivity.showV1492GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1492glance
    FeaturePrefsStore.batch1491.v1492glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1492: glass level
internal fun PlayerActivity.showV1492GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1492glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1492glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1492: globe level
internal fun PlayerActivity.showV1492GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1492globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1492globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1492: glory level
internal fun PlayerActivity.showV1492GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1492glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1492glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1492: glove level
internal fun PlayerActivity.showV1492GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1492glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1492glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1492: go level
internal fun PlayerActivity.showV1492GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1492go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1492go = value
        AppToast.show(this, "go: $value")
    }
}

// v1492: goal mode
internal fun PlayerActivity.showV1492GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1492goal
    FeaturePrefsStore.batch1491.v1492goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1492: goat mode
internal fun PlayerActivity.showV1492GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1492goat
    FeaturePrefsStore.batch1491.v1492goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1492: god mode
internal fun PlayerActivity.showV1492GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1492god
    FeaturePrefsStore.batch1491.v1492god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1492: gold mode
internal fun PlayerActivity.showV1492GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1492gold
    FeaturePrefsStore.batch1491.v1492gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1492: good mode
internal fun PlayerActivity.showV1492GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1492good
    FeaturePrefsStore.batch1491.v1492good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1493: genre mode
internal fun PlayerActivity.showV1493GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1493genre
    FeaturePrefsStore.batch1491.v1493genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1493: gentle mode
internal fun PlayerActivity.showV1493GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1493gentle
    FeaturePrefsStore.batch1491.v1493gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1493: gift mode
internal fun PlayerActivity.showV1493GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1493gift
    FeaturePrefsStore.batch1491.v1493gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1493: glad mode
internal fun PlayerActivity.showV1493GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1493glad
    FeaturePrefsStore.batch1491.v1493glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1493: glance mode
internal fun PlayerActivity.showV1493GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1493glance
    FeaturePrefsStore.batch1491.v1493glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1493: glass level
internal fun PlayerActivity.showV1493GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1493glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1493glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1493: globe level
internal fun PlayerActivity.showV1493GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1493globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1493globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1493: glory level
internal fun PlayerActivity.showV1493GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1493glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1493glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1493: glove level
internal fun PlayerActivity.showV1493GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1493glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1493glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1493: go level
internal fun PlayerActivity.showV1493GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1493go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1493go = value
        AppToast.show(this, "go: $value")
    }
}

// v1493: goal mode
internal fun PlayerActivity.showV1493GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1493goal
    FeaturePrefsStore.batch1491.v1493goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1493: goat mode
internal fun PlayerActivity.showV1493GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1493goat
    FeaturePrefsStore.batch1491.v1493goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1493: god mode
internal fun PlayerActivity.showV1493GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1493god
    FeaturePrefsStore.batch1491.v1493god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1493: gold mode
internal fun PlayerActivity.showV1493GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1493gold
    FeaturePrefsStore.batch1491.v1493gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1493: good mode
internal fun PlayerActivity.showV1493GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1493good
    FeaturePrefsStore.batch1491.v1493good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1494: genre mode
internal fun PlayerActivity.showV1494GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1494genre
    FeaturePrefsStore.batch1491.v1494genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1494: gentle mode
internal fun PlayerActivity.showV1494GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1494gentle
    FeaturePrefsStore.batch1491.v1494gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1494: gift mode
internal fun PlayerActivity.showV1494GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1494gift
    FeaturePrefsStore.batch1491.v1494gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1494: glad mode
internal fun PlayerActivity.showV1494GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1494glad
    FeaturePrefsStore.batch1491.v1494glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1494: glance mode
internal fun PlayerActivity.showV1494GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1494glance
    FeaturePrefsStore.batch1491.v1494glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1494: glass level
internal fun PlayerActivity.showV1494GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1494glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1494glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1494: globe level
internal fun PlayerActivity.showV1494GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1494globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1494globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1494: glory level
internal fun PlayerActivity.showV1494GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1494glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1494glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1494: glove level
internal fun PlayerActivity.showV1494GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1494glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1494glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1494: go level
internal fun PlayerActivity.showV1494GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1494go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1494go = value
        AppToast.show(this, "go: $value")
    }
}

// v1494: goal mode
internal fun PlayerActivity.showV1494GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1494goal
    FeaturePrefsStore.batch1491.v1494goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1494: goat mode
internal fun PlayerActivity.showV1494GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1494goat
    FeaturePrefsStore.batch1491.v1494goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1494: god mode
internal fun PlayerActivity.showV1494GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1494god
    FeaturePrefsStore.batch1491.v1494god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1494: gold mode
internal fun PlayerActivity.showV1494GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1494gold
    FeaturePrefsStore.batch1491.v1494gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1494: good mode
internal fun PlayerActivity.showV1494GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1494good
    FeaturePrefsStore.batch1491.v1494good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1495: genre mode
internal fun PlayerActivity.showV1495GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1495genre
    FeaturePrefsStore.batch1491.v1495genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1495: gentle mode
internal fun PlayerActivity.showV1495GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1495gentle
    FeaturePrefsStore.batch1491.v1495gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1495: gift mode
internal fun PlayerActivity.showV1495GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1495gift
    FeaturePrefsStore.batch1491.v1495gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1495: glad mode
internal fun PlayerActivity.showV1495GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1495glad
    FeaturePrefsStore.batch1491.v1495glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1495: glance mode
internal fun PlayerActivity.showV1495GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1495glance
    FeaturePrefsStore.batch1491.v1495glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1495: glass level
internal fun PlayerActivity.showV1495GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1495glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1495glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1495: globe level
internal fun PlayerActivity.showV1495GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1495globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1495globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1495: glory level
internal fun PlayerActivity.showV1495GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1495glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1495glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1495: glove level
internal fun PlayerActivity.showV1495GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1495glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1495glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1495: go level
internal fun PlayerActivity.showV1495GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1495go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1495go = value
        AppToast.show(this, "go: $value")
    }
}

// v1495: goal mode
internal fun PlayerActivity.showV1495GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1495goal
    FeaturePrefsStore.batch1491.v1495goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1495: goat mode
internal fun PlayerActivity.showV1495GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1495goat
    FeaturePrefsStore.batch1491.v1495goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1495: god mode
internal fun PlayerActivity.showV1495GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1495god
    FeaturePrefsStore.batch1491.v1495god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1495: gold mode
internal fun PlayerActivity.showV1495GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1495gold
    FeaturePrefsStore.batch1491.v1495gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1495: good mode
internal fun PlayerActivity.showV1495GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1495good
    FeaturePrefsStore.batch1491.v1495good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1496: genre mode
internal fun PlayerActivity.showV1496GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1496genre
    FeaturePrefsStore.batch1491.v1496genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1496: gentle mode
internal fun PlayerActivity.showV1496GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1496gentle
    FeaturePrefsStore.batch1491.v1496gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1496: gift mode
internal fun PlayerActivity.showV1496GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1496gift
    FeaturePrefsStore.batch1491.v1496gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1496: glad mode
internal fun PlayerActivity.showV1496GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1496glad
    FeaturePrefsStore.batch1491.v1496glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1496: glance mode
internal fun PlayerActivity.showV1496GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1496glance
    FeaturePrefsStore.batch1491.v1496glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1496: glass level
internal fun PlayerActivity.showV1496GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1496glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1496glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1496: globe level
internal fun PlayerActivity.showV1496GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1496globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1496globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1496: glory level
internal fun PlayerActivity.showV1496GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1496glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1496glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1496: glove level
internal fun PlayerActivity.showV1496GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1496glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1496glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1496: go level
internal fun PlayerActivity.showV1496GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1496go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1496go = value
        AppToast.show(this, "go: $value")
    }
}

// v1496: goal mode
internal fun PlayerActivity.showV1496GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1496goal
    FeaturePrefsStore.batch1491.v1496goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1496: goat mode
internal fun PlayerActivity.showV1496GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1496goat
    FeaturePrefsStore.batch1491.v1496goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1496: god mode
internal fun PlayerActivity.showV1496GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1496god
    FeaturePrefsStore.batch1491.v1496god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1496: gold mode
internal fun PlayerActivity.showV1496GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1496gold
    FeaturePrefsStore.batch1491.v1496gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1496: good mode
internal fun PlayerActivity.showV1496GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1496good
    FeaturePrefsStore.batch1491.v1496good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1497: genre mode
internal fun PlayerActivity.showV1497GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1497genre
    FeaturePrefsStore.batch1491.v1497genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1497: gentle mode
internal fun PlayerActivity.showV1497GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1497gentle
    FeaturePrefsStore.batch1491.v1497gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1497: gift mode
internal fun PlayerActivity.showV1497GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1497gift
    FeaturePrefsStore.batch1491.v1497gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1497: glad mode
internal fun PlayerActivity.showV1497GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1497glad
    FeaturePrefsStore.batch1491.v1497glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1497: glance mode
internal fun PlayerActivity.showV1497GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1497glance
    FeaturePrefsStore.batch1491.v1497glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1497: glass level
internal fun PlayerActivity.showV1497GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1497glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1497glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1497: globe level
internal fun PlayerActivity.showV1497GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1497globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1497globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1497: glory level
internal fun PlayerActivity.showV1497GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1497glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1497glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1497: glove level
internal fun PlayerActivity.showV1497GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1497glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1497glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1497: go level
internal fun PlayerActivity.showV1497GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1497go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1497go = value
        AppToast.show(this, "go: $value")
    }
}

// v1497: goal mode
internal fun PlayerActivity.showV1497GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1497goal
    FeaturePrefsStore.batch1491.v1497goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1497: goat mode
internal fun PlayerActivity.showV1497GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1497goat
    FeaturePrefsStore.batch1491.v1497goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1497: god mode
internal fun PlayerActivity.showV1497GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1497god
    FeaturePrefsStore.batch1491.v1497god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1497: gold mode
internal fun PlayerActivity.showV1497GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1497gold
    FeaturePrefsStore.batch1491.v1497gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1497: good mode
internal fun PlayerActivity.showV1497GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1497good
    FeaturePrefsStore.batch1491.v1497good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1498: genre mode
internal fun PlayerActivity.showV1498GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1498genre
    FeaturePrefsStore.batch1491.v1498genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1498: gentle mode
internal fun PlayerActivity.showV1498GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1498gentle
    FeaturePrefsStore.batch1491.v1498gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1498: gift mode
internal fun PlayerActivity.showV1498GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1498gift
    FeaturePrefsStore.batch1491.v1498gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1498: glad mode
internal fun PlayerActivity.showV1498GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1498glad
    FeaturePrefsStore.batch1491.v1498glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1498: glance mode
internal fun PlayerActivity.showV1498GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1498glance
    FeaturePrefsStore.batch1491.v1498glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1498: glass level
internal fun PlayerActivity.showV1498GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1498glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1498glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1498: globe level
internal fun PlayerActivity.showV1498GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1498globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1498globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1498: glory level
internal fun PlayerActivity.showV1498GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1498glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1498glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1498: glove level
internal fun PlayerActivity.showV1498GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1498glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1498glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1498: go level
internal fun PlayerActivity.showV1498GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1498go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1498go = value
        AppToast.show(this, "go: $value")
    }
}

// v1498: goal mode
internal fun PlayerActivity.showV1498GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1498goal
    FeaturePrefsStore.batch1491.v1498goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1498: goat mode
internal fun PlayerActivity.showV1498GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1498goat
    FeaturePrefsStore.batch1491.v1498goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1498: god mode
internal fun PlayerActivity.showV1498GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1498god
    FeaturePrefsStore.batch1491.v1498god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1498: gold mode
internal fun PlayerActivity.showV1498GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1498gold
    FeaturePrefsStore.batch1491.v1498gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1498: good mode
internal fun PlayerActivity.showV1498GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1498good
    FeaturePrefsStore.batch1491.v1498good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1499: genre mode
internal fun PlayerActivity.showV1499GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1499genre
    FeaturePrefsStore.batch1491.v1499genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1499: gentle mode
internal fun PlayerActivity.showV1499GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1499gentle
    FeaturePrefsStore.batch1491.v1499gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1499: gift mode
internal fun PlayerActivity.showV1499GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1499gift
    FeaturePrefsStore.batch1491.v1499gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1499: glad mode
internal fun PlayerActivity.showV1499GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1499glad
    FeaturePrefsStore.batch1491.v1499glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1499: glance mode
internal fun PlayerActivity.showV1499GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1499glance
    FeaturePrefsStore.batch1491.v1499glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1499: glass level
internal fun PlayerActivity.showV1499GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1499glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1499glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1499: globe level
internal fun PlayerActivity.showV1499GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1499globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1499globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1499: glory level
internal fun PlayerActivity.showV1499GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1499glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1499glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1499: glove level
internal fun PlayerActivity.showV1499GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1499glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1499glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1499: go level
internal fun PlayerActivity.showV1499GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1499go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1499go = value
        AppToast.show(this, "go: $value")
    }
}

// v1499: goal mode
internal fun PlayerActivity.showV1499GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1499goal
    FeaturePrefsStore.batch1491.v1499goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1499: goat mode
internal fun PlayerActivity.showV1499GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1499goat
    FeaturePrefsStore.batch1491.v1499goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1499: god mode
internal fun PlayerActivity.showV1499GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1499god
    FeaturePrefsStore.batch1491.v1499god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1499: gold mode
internal fun PlayerActivity.showV1499GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1499gold
    FeaturePrefsStore.batch1491.v1499gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1499: good mode
internal fun PlayerActivity.showV1499GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1499good
    FeaturePrefsStore.batch1491.v1499good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

// v1500: genre mode
internal fun PlayerActivity.showV1500GenreToggle() {
    val current = FeaturePrefsStore.batch1491.v1500genre
    FeaturePrefsStore.batch1491.v1500genre = !current
    AppToast.show(this, "genre: ${if (!current) "ON" else "OFF"}")
}

// v1500: gentle mode
internal fun PlayerActivity.showV1500GentleToggle() {
    val current = FeaturePrefsStore.batch1491.v1500gentle
    FeaturePrefsStore.batch1491.v1500gentle = !current
    AppToast.show(this, "gentle: ${if (!current) "ON" else "OFF"}")
}

// v1500: gift mode
internal fun PlayerActivity.showV1500GiftToggle() {
    val current = FeaturePrefsStore.batch1491.v1500gift
    FeaturePrefsStore.batch1491.v1500gift = !current
    AppToast.show(this, "gift: ${if (!current) "ON" else "OFF"}")
}

// v1500: glad mode
internal fun PlayerActivity.showV1500GladToggle() {
    val current = FeaturePrefsStore.batch1491.v1500glad
    FeaturePrefsStore.batch1491.v1500glad = !current
    AppToast.show(this, "glad: ${if (!current) "ON" else "OFF"}")
}

// v1500: glance mode
internal fun PlayerActivity.showV1500GlanceToggle() {
    val current = FeaturePrefsStore.batch1491.v1500glance
    FeaturePrefsStore.batch1491.v1500glance = !current
    AppToast.show(this, "glance: ${if (!current) "ON" else "OFF"}")
}

// v1500: glass level
internal fun PlayerActivity.showV1500GlassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1500glass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1500glass = value
        AppToast.show(this, "glass: $value")
    }
}

// v1500: globe level
internal fun PlayerActivity.showV1500GlobeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1500globe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "globe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1500globe = value
        AppToast.show(this, "globe: $value")
    }
}

// v1500: glory level
internal fun PlayerActivity.showV1500GloryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1500glory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1500glory = value
        AppToast.show(this, "glory: $value")
    }
}

// v1500: glove level
internal fun PlayerActivity.showV1500GloveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1500glove).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glove level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1500glove = value
        AppToast.show(this, "glove: $value")
    }
}

// v1500: go level
internal fun PlayerActivity.showV1500GoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1491.v1500go).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "go level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1491.v1500go = value
        AppToast.show(this, "go: $value")
    }
}

// v1500: goal mode
internal fun PlayerActivity.showV1500GoalToggle() {
    val current = FeaturePrefsStore.batch1491.v1500goal
    FeaturePrefsStore.batch1491.v1500goal = !current
    AppToast.show(this, "goal: ${if (!current) "ON" else "OFF"}")
}

// v1500: goat mode
internal fun PlayerActivity.showV1500GoatToggle() {
    val current = FeaturePrefsStore.batch1491.v1500goat
    FeaturePrefsStore.batch1491.v1500goat = !current
    AppToast.show(this, "goat: ${if (!current) "ON" else "OFF"}")
}

// v1500: god mode
internal fun PlayerActivity.showV1500GodToggle() {
    val current = FeaturePrefsStore.batch1491.v1500god
    FeaturePrefsStore.batch1491.v1500god = !current
    AppToast.show(this, "god: ${if (!current) "ON" else "OFF"}")
}

// v1500: gold mode
internal fun PlayerActivity.showV1500GoldToggle() {
    val current = FeaturePrefsStore.batch1491.v1500gold
    FeaturePrefsStore.batch1491.v1500gold = !current
    AppToast.show(this, "gold: ${if (!current) "ON" else "OFF"}")
}

// v1500: good mode
internal fun PlayerActivity.showV1500GoodToggle() {
    val current = FeaturePrefsStore.batch1491.v1500good
    FeaturePrefsStore.batch1491.v1500good = !current
    AppToast.show(this, "good: ${if (!current) "ON" else "OFF"}")
}

