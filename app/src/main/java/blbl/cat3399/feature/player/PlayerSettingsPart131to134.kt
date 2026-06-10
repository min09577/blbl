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

// v1501: goose mode
internal fun PlayerActivity.showV1501GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1501goose
    FeaturePrefsStore.batch1501.v1501goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1501: gorge mode
internal fun PlayerActivity.showV1501GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1501gorge
    FeaturePrefsStore.batch1501.v1501gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1501: govern mode
internal fun PlayerActivity.showV1501GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1501govern
    FeaturePrefsStore.batch1501.v1501govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1501: grace mode
internal fun PlayerActivity.showV1501GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1501grace
    FeaturePrefsStore.batch1501.v1501grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1501: grade mode
internal fun PlayerActivity.showV1501GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1501grade
    FeaturePrefsStore.batch1501.v1501grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1501: grain level
internal fun PlayerActivity.showV1501GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1501grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1501grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1501: grand level
internal fun PlayerActivity.showV1501GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1501grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1501grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1501: grape level
internal fun PlayerActivity.showV1501GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1501grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1501grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1501: grass level
internal fun PlayerActivity.showV1501GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1501grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1501grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1501: grave level
internal fun PlayerActivity.showV1501GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1501grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1501grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1501: gray mode
internal fun PlayerActivity.showV1501GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1501gray
    FeaturePrefsStore.batch1501.v1501gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1501: great mode
internal fun PlayerActivity.showV1501GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1501great
    FeaturePrefsStore.batch1501.v1501great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1501: green mode
internal fun PlayerActivity.showV1501GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1501green
    FeaturePrefsStore.batch1501.v1501green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1501: greet mode
internal fun PlayerActivity.showV1501GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1501greet
    FeaturePrefsStore.batch1501.v1501greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1501: grief mode
internal fun PlayerActivity.showV1501GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1501grief
    FeaturePrefsStore.batch1501.v1501grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1502: goose mode
internal fun PlayerActivity.showV1502GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1502goose
    FeaturePrefsStore.batch1501.v1502goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1502: gorge mode
internal fun PlayerActivity.showV1502GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1502gorge
    FeaturePrefsStore.batch1501.v1502gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1502: govern mode
internal fun PlayerActivity.showV1502GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1502govern
    FeaturePrefsStore.batch1501.v1502govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1502: grace mode
internal fun PlayerActivity.showV1502GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1502grace
    FeaturePrefsStore.batch1501.v1502grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1502: grade mode
internal fun PlayerActivity.showV1502GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1502grade
    FeaturePrefsStore.batch1501.v1502grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1502: grain level
internal fun PlayerActivity.showV1502GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1502grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1502grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1502: grand level
internal fun PlayerActivity.showV1502GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1502grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1502grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1502: grape level
internal fun PlayerActivity.showV1502GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1502grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1502grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1502: grass level
internal fun PlayerActivity.showV1502GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1502grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1502grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1502: grave level
internal fun PlayerActivity.showV1502GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1502grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1502grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1502: gray mode
internal fun PlayerActivity.showV1502GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1502gray
    FeaturePrefsStore.batch1501.v1502gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1502: great mode
internal fun PlayerActivity.showV1502GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1502great
    FeaturePrefsStore.batch1501.v1502great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1502: green mode
internal fun PlayerActivity.showV1502GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1502green
    FeaturePrefsStore.batch1501.v1502green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1502: greet mode
internal fun PlayerActivity.showV1502GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1502greet
    FeaturePrefsStore.batch1501.v1502greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1502: grief mode
internal fun PlayerActivity.showV1502GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1502grief
    FeaturePrefsStore.batch1501.v1502grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1503: goose mode
internal fun PlayerActivity.showV1503GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1503goose
    FeaturePrefsStore.batch1501.v1503goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1503: gorge mode
internal fun PlayerActivity.showV1503GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1503gorge
    FeaturePrefsStore.batch1501.v1503gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1503: govern mode
internal fun PlayerActivity.showV1503GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1503govern
    FeaturePrefsStore.batch1501.v1503govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1503: grace mode
internal fun PlayerActivity.showV1503GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1503grace
    FeaturePrefsStore.batch1501.v1503grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1503: grade mode
internal fun PlayerActivity.showV1503GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1503grade
    FeaturePrefsStore.batch1501.v1503grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1503: grain level
internal fun PlayerActivity.showV1503GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1503grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1503grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1503: grand level
internal fun PlayerActivity.showV1503GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1503grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1503grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1503: grape level
internal fun PlayerActivity.showV1503GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1503grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1503grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1503: grass level
internal fun PlayerActivity.showV1503GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1503grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1503grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1503: grave level
internal fun PlayerActivity.showV1503GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1503grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1503grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1503: gray mode
internal fun PlayerActivity.showV1503GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1503gray
    FeaturePrefsStore.batch1501.v1503gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1503: great mode
internal fun PlayerActivity.showV1503GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1503great
    FeaturePrefsStore.batch1501.v1503great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1503: green mode
internal fun PlayerActivity.showV1503GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1503green
    FeaturePrefsStore.batch1501.v1503green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1503: greet mode
internal fun PlayerActivity.showV1503GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1503greet
    FeaturePrefsStore.batch1501.v1503greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1503: grief mode
internal fun PlayerActivity.showV1503GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1503grief
    FeaturePrefsStore.batch1501.v1503grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1504: goose mode
internal fun PlayerActivity.showV1504GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1504goose
    FeaturePrefsStore.batch1501.v1504goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1504: gorge mode
internal fun PlayerActivity.showV1504GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1504gorge
    FeaturePrefsStore.batch1501.v1504gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1504: govern mode
internal fun PlayerActivity.showV1504GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1504govern
    FeaturePrefsStore.batch1501.v1504govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1504: grace mode
internal fun PlayerActivity.showV1504GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1504grace
    FeaturePrefsStore.batch1501.v1504grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1504: grade mode
internal fun PlayerActivity.showV1504GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1504grade
    FeaturePrefsStore.batch1501.v1504grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1504: grain level
internal fun PlayerActivity.showV1504GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1504grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1504grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1504: grand level
internal fun PlayerActivity.showV1504GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1504grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1504grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1504: grape level
internal fun PlayerActivity.showV1504GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1504grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1504grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1504: grass level
internal fun PlayerActivity.showV1504GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1504grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1504grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1504: grave level
internal fun PlayerActivity.showV1504GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1504grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1504grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1504: gray mode
internal fun PlayerActivity.showV1504GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1504gray
    FeaturePrefsStore.batch1501.v1504gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1504: great mode
internal fun PlayerActivity.showV1504GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1504great
    FeaturePrefsStore.batch1501.v1504great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1504: green mode
internal fun PlayerActivity.showV1504GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1504green
    FeaturePrefsStore.batch1501.v1504green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1504: greet mode
internal fun PlayerActivity.showV1504GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1504greet
    FeaturePrefsStore.batch1501.v1504greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1504: grief mode
internal fun PlayerActivity.showV1504GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1504grief
    FeaturePrefsStore.batch1501.v1504grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1505: goose mode
internal fun PlayerActivity.showV1505GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1505goose
    FeaturePrefsStore.batch1501.v1505goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1505: gorge mode
internal fun PlayerActivity.showV1505GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1505gorge
    FeaturePrefsStore.batch1501.v1505gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1505: govern mode
internal fun PlayerActivity.showV1505GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1505govern
    FeaturePrefsStore.batch1501.v1505govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1505: grace mode
internal fun PlayerActivity.showV1505GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1505grace
    FeaturePrefsStore.batch1501.v1505grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1505: grade mode
internal fun PlayerActivity.showV1505GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1505grade
    FeaturePrefsStore.batch1501.v1505grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1505: grain level
internal fun PlayerActivity.showV1505GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1505grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1505grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1505: grand level
internal fun PlayerActivity.showV1505GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1505grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1505grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1505: grape level
internal fun PlayerActivity.showV1505GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1505grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1505grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1505: grass level
internal fun PlayerActivity.showV1505GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1505grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1505grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1505: grave level
internal fun PlayerActivity.showV1505GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1505grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1505grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1505: gray mode
internal fun PlayerActivity.showV1505GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1505gray
    FeaturePrefsStore.batch1501.v1505gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1505: great mode
internal fun PlayerActivity.showV1505GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1505great
    FeaturePrefsStore.batch1501.v1505great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1505: green mode
internal fun PlayerActivity.showV1505GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1505green
    FeaturePrefsStore.batch1501.v1505green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1505: greet mode
internal fun PlayerActivity.showV1505GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1505greet
    FeaturePrefsStore.batch1501.v1505greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1505: grief mode
internal fun PlayerActivity.showV1505GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1505grief
    FeaturePrefsStore.batch1501.v1505grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1506: goose mode
internal fun PlayerActivity.showV1506GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1506goose
    FeaturePrefsStore.batch1501.v1506goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1506: gorge mode
internal fun PlayerActivity.showV1506GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1506gorge
    FeaturePrefsStore.batch1501.v1506gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1506: govern mode
internal fun PlayerActivity.showV1506GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1506govern
    FeaturePrefsStore.batch1501.v1506govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1506: grace mode
internal fun PlayerActivity.showV1506GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1506grace
    FeaturePrefsStore.batch1501.v1506grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1506: grade mode
internal fun PlayerActivity.showV1506GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1506grade
    FeaturePrefsStore.batch1501.v1506grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1506: grain level
internal fun PlayerActivity.showV1506GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1506grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1506grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1506: grand level
internal fun PlayerActivity.showV1506GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1506grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1506grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1506: grape level
internal fun PlayerActivity.showV1506GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1506grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1506grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1506: grass level
internal fun PlayerActivity.showV1506GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1506grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1506grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1506: grave level
internal fun PlayerActivity.showV1506GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1506grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1506grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1506: gray mode
internal fun PlayerActivity.showV1506GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1506gray
    FeaturePrefsStore.batch1501.v1506gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1506: great mode
internal fun PlayerActivity.showV1506GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1506great
    FeaturePrefsStore.batch1501.v1506great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1506: green mode
internal fun PlayerActivity.showV1506GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1506green
    FeaturePrefsStore.batch1501.v1506green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1506: greet mode
internal fun PlayerActivity.showV1506GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1506greet
    FeaturePrefsStore.batch1501.v1506greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1506: grief mode
internal fun PlayerActivity.showV1506GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1506grief
    FeaturePrefsStore.batch1501.v1506grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1507: goose mode
internal fun PlayerActivity.showV1507GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1507goose
    FeaturePrefsStore.batch1501.v1507goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1507: gorge mode
internal fun PlayerActivity.showV1507GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1507gorge
    FeaturePrefsStore.batch1501.v1507gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1507: govern mode
internal fun PlayerActivity.showV1507GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1507govern
    FeaturePrefsStore.batch1501.v1507govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1507: grace mode
internal fun PlayerActivity.showV1507GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1507grace
    FeaturePrefsStore.batch1501.v1507grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1507: grade mode
internal fun PlayerActivity.showV1507GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1507grade
    FeaturePrefsStore.batch1501.v1507grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1507: grain level
internal fun PlayerActivity.showV1507GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1507grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1507grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1507: grand level
internal fun PlayerActivity.showV1507GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1507grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1507grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1507: grape level
internal fun PlayerActivity.showV1507GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1507grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1507grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1507: grass level
internal fun PlayerActivity.showV1507GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1507grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1507grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1507: grave level
internal fun PlayerActivity.showV1507GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1507grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1507grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1507: gray mode
internal fun PlayerActivity.showV1507GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1507gray
    FeaturePrefsStore.batch1501.v1507gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1507: great mode
internal fun PlayerActivity.showV1507GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1507great
    FeaturePrefsStore.batch1501.v1507great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1507: green mode
internal fun PlayerActivity.showV1507GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1507green
    FeaturePrefsStore.batch1501.v1507green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1507: greet mode
internal fun PlayerActivity.showV1507GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1507greet
    FeaturePrefsStore.batch1501.v1507greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1507: grief mode
internal fun PlayerActivity.showV1507GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1507grief
    FeaturePrefsStore.batch1501.v1507grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1508: goose mode
internal fun PlayerActivity.showV1508GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1508goose
    FeaturePrefsStore.batch1501.v1508goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1508: gorge mode
internal fun PlayerActivity.showV1508GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1508gorge
    FeaturePrefsStore.batch1501.v1508gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1508: govern mode
internal fun PlayerActivity.showV1508GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1508govern
    FeaturePrefsStore.batch1501.v1508govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1508: grace mode
internal fun PlayerActivity.showV1508GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1508grace
    FeaturePrefsStore.batch1501.v1508grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1508: grade mode
internal fun PlayerActivity.showV1508GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1508grade
    FeaturePrefsStore.batch1501.v1508grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1508: grain level
internal fun PlayerActivity.showV1508GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1508grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1508grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1508: grand level
internal fun PlayerActivity.showV1508GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1508grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1508grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1508: grape level
internal fun PlayerActivity.showV1508GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1508grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1508grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1508: grass level
internal fun PlayerActivity.showV1508GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1508grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1508grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1508: grave level
internal fun PlayerActivity.showV1508GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1508grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1508grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1508: gray mode
internal fun PlayerActivity.showV1508GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1508gray
    FeaturePrefsStore.batch1501.v1508gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1508: great mode
internal fun PlayerActivity.showV1508GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1508great
    FeaturePrefsStore.batch1501.v1508great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1508: green mode
internal fun PlayerActivity.showV1508GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1508green
    FeaturePrefsStore.batch1501.v1508green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1508: greet mode
internal fun PlayerActivity.showV1508GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1508greet
    FeaturePrefsStore.batch1501.v1508greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1508: grief mode
internal fun PlayerActivity.showV1508GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1508grief
    FeaturePrefsStore.batch1501.v1508grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1509: goose mode
internal fun PlayerActivity.showV1509GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1509goose
    FeaturePrefsStore.batch1501.v1509goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1509: gorge mode
internal fun PlayerActivity.showV1509GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1509gorge
    FeaturePrefsStore.batch1501.v1509gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1509: govern mode
internal fun PlayerActivity.showV1509GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1509govern
    FeaturePrefsStore.batch1501.v1509govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1509: grace mode
internal fun PlayerActivity.showV1509GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1509grace
    FeaturePrefsStore.batch1501.v1509grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1509: grade mode
internal fun PlayerActivity.showV1509GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1509grade
    FeaturePrefsStore.batch1501.v1509grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1509: grain level
internal fun PlayerActivity.showV1509GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1509grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1509grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1509: grand level
internal fun PlayerActivity.showV1509GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1509grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1509grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1509: grape level
internal fun PlayerActivity.showV1509GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1509grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1509grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1509: grass level
internal fun PlayerActivity.showV1509GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1509grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1509grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1509: grave level
internal fun PlayerActivity.showV1509GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1509grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1509grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1509: gray mode
internal fun PlayerActivity.showV1509GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1509gray
    FeaturePrefsStore.batch1501.v1509gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1509: great mode
internal fun PlayerActivity.showV1509GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1509great
    FeaturePrefsStore.batch1501.v1509great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1509: green mode
internal fun PlayerActivity.showV1509GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1509green
    FeaturePrefsStore.batch1501.v1509green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1509: greet mode
internal fun PlayerActivity.showV1509GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1509greet
    FeaturePrefsStore.batch1501.v1509greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1509: grief mode
internal fun PlayerActivity.showV1509GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1509grief
    FeaturePrefsStore.batch1501.v1509grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1510: goose mode
internal fun PlayerActivity.showV1510GooseToggle() {
    val current = FeaturePrefsStore.batch1501.v1510goose
    FeaturePrefsStore.batch1501.v1510goose = !current
    AppToast.show(this, "goose: ${if (!current) "ON" else "OFF"}")
}

// v1510: gorge mode
internal fun PlayerActivity.showV1510GorgeToggle() {
    val current = FeaturePrefsStore.batch1501.v1510gorge
    FeaturePrefsStore.batch1501.v1510gorge = !current
    AppToast.show(this, "gorge: ${if (!current) "ON" else "OFF"}")
}

// v1510: govern mode
internal fun PlayerActivity.showV1510GovernToggle() {
    val current = FeaturePrefsStore.batch1501.v1510govern
    FeaturePrefsStore.batch1501.v1510govern = !current
    AppToast.show(this, "govern: ${if (!current) "ON" else "OFF"}")
}

// v1510: grace mode
internal fun PlayerActivity.showV1510GraceToggle() {
    val current = FeaturePrefsStore.batch1501.v1510grace
    FeaturePrefsStore.batch1501.v1510grace = !current
    AppToast.show(this, "grace: ${if (!current) "ON" else "OFF"}")
}

// v1510: grade mode
internal fun PlayerActivity.showV1510GradeToggle() {
    val current = FeaturePrefsStore.batch1501.v1510grade
    FeaturePrefsStore.batch1501.v1510grade = !current
    AppToast.show(this, "grade: ${if (!current) "ON" else "OFF"}")
}

// v1510: grain level
internal fun PlayerActivity.showV1510GrainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1510grain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1510grain = value
        AppToast.show(this, "grain: $value")
    }
}

// v1510: grand level
internal fun PlayerActivity.showV1510GrandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1510grand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grand level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1510grand = value
        AppToast.show(this, "grand: $value")
    }
}

// v1510: grape level
internal fun PlayerActivity.showV1510GrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1510grape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1510grape = value
        AppToast.show(this, "grape: $value")
    }
}

// v1510: grass level
internal fun PlayerActivity.showV1510GrassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1510grass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1510grass = value
        AppToast.show(this, "grass: $value")
    }
}

// v1510: grave level
internal fun PlayerActivity.showV1510GraveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1501.v1510grave).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grave level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1501.v1510grave = value
        AppToast.show(this, "grave: $value")
    }
}

// v1510: gray mode
internal fun PlayerActivity.showV1510GrayToggle() {
    val current = FeaturePrefsStore.batch1501.v1510gray
    FeaturePrefsStore.batch1501.v1510gray = !current
    AppToast.show(this, "gray: ${if (!current) "ON" else "OFF"}")
}

// v1510: great mode
internal fun PlayerActivity.showV1510GreatToggle() {
    val current = FeaturePrefsStore.batch1501.v1510great
    FeaturePrefsStore.batch1501.v1510great = !current
    AppToast.show(this, "great: ${if (!current) "ON" else "OFF"}")
}

// v1510: green mode
internal fun PlayerActivity.showV1510GreenToggle() {
    val current = FeaturePrefsStore.batch1501.v1510green
    FeaturePrefsStore.batch1501.v1510green = !current
    AppToast.show(this, "green: ${if (!current) "ON" else "OFF"}")
}

// v1510: greet mode
internal fun PlayerActivity.showV1510GreetToggle() {
    val current = FeaturePrefsStore.batch1501.v1510greet
    FeaturePrefsStore.batch1501.v1510greet = !current
    AppToast.show(this, "greet: ${if (!current) "ON" else "OFF"}")
}

// v1510: grief mode
internal fun PlayerActivity.showV1510GriefToggle() {
    val current = FeaturePrefsStore.batch1501.v1510grief
    FeaturePrefsStore.batch1501.v1510grief = !current
    AppToast.show(this, "grief: ${if (!current) "ON" else "OFF"}")
}

// v1511: grill mode
internal fun PlayerActivity.showV1511GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grill
    FeaturePrefsStore.batch1511.v1511grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1511: grin mode
internal fun PlayerActivity.showV1511GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grin
    FeaturePrefsStore.batch1511.v1511grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1511: grip mode
internal fun PlayerActivity.showV1511GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grip
    FeaturePrefsStore.batch1511.v1511grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1511: grocery mode
internal fun PlayerActivity.showV1511GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grocery
    FeaturePrefsStore.batch1511.v1511grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1511: groom mode
internal fun PlayerActivity.showV1511GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1511groom
    FeaturePrefsStore.batch1511.v1511groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1511: gross level
internal fun PlayerActivity.showV1511GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1511: ground level
internal fun PlayerActivity.showV1511GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1511: growth level
internal fun PlayerActivity.showV1511GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1511: guitar level
internal fun PlayerActivity.showV1511GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1511: habit level
internal fun PlayerActivity.showV1511HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1511: hair mode
internal fun PlayerActivity.showV1511HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hair
    FeaturePrefsStore.batch1511.v1511hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1511: half mode
internal fun PlayerActivity.showV1511HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1511half
    FeaturePrefsStore.batch1511.v1511half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1511: hammer mode
internal fun PlayerActivity.showV1511HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hammer
    FeaturePrefsStore.batch1511.v1511hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1511: hand mode
internal fun PlayerActivity.showV1511HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hand
    FeaturePrefsStore.batch1511.v1511hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1511: hang mode
internal fun PlayerActivity.showV1511HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hang
    FeaturePrefsStore.batch1511.v1511hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1512: grill mode
internal fun PlayerActivity.showV1512GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grill
    FeaturePrefsStore.batch1511.v1512grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1512: grin mode
internal fun PlayerActivity.showV1512GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grin
    FeaturePrefsStore.batch1511.v1512grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1512: grip mode
internal fun PlayerActivity.showV1512GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grip
    FeaturePrefsStore.batch1511.v1512grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1512: grocery mode
internal fun PlayerActivity.showV1512GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grocery
    FeaturePrefsStore.batch1511.v1512grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1512: groom mode
internal fun PlayerActivity.showV1512GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1512groom
    FeaturePrefsStore.batch1511.v1512groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1512: gross level
internal fun PlayerActivity.showV1512GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1512: ground level
internal fun PlayerActivity.showV1512GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1512: growth level
internal fun PlayerActivity.showV1512GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1512: guitar level
internal fun PlayerActivity.showV1512GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1512: habit level
internal fun PlayerActivity.showV1512HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1512: hair mode
internal fun PlayerActivity.showV1512HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hair
    FeaturePrefsStore.batch1511.v1512hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1512: half mode
internal fun PlayerActivity.showV1512HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1512half
    FeaturePrefsStore.batch1511.v1512half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1512: hammer mode
internal fun PlayerActivity.showV1512HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hammer
    FeaturePrefsStore.batch1511.v1512hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1512: hand mode
internal fun PlayerActivity.showV1512HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hand
    FeaturePrefsStore.batch1511.v1512hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1512: hang mode
internal fun PlayerActivity.showV1512HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hang
    FeaturePrefsStore.batch1511.v1512hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1513: grill mode
internal fun PlayerActivity.showV1513GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grill
    FeaturePrefsStore.batch1511.v1513grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1513: grin mode
internal fun PlayerActivity.showV1513GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grin
    FeaturePrefsStore.batch1511.v1513grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1513: grip mode
internal fun PlayerActivity.showV1513GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grip
    FeaturePrefsStore.batch1511.v1513grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1513: grocery mode
internal fun PlayerActivity.showV1513GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grocery
    FeaturePrefsStore.batch1511.v1513grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1513: groom mode
internal fun PlayerActivity.showV1513GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1513groom
    FeaturePrefsStore.batch1511.v1513groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1513: gross level
internal fun PlayerActivity.showV1513GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1513: ground level
internal fun PlayerActivity.showV1513GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1513: growth level
internal fun PlayerActivity.showV1513GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1513: guitar level
internal fun PlayerActivity.showV1513GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1513: habit level
internal fun PlayerActivity.showV1513HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1513: hair mode
internal fun PlayerActivity.showV1513HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hair
    FeaturePrefsStore.batch1511.v1513hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1513: half mode
internal fun PlayerActivity.showV1513HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1513half
    FeaturePrefsStore.batch1511.v1513half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1513: hammer mode
internal fun PlayerActivity.showV1513HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hammer
    FeaturePrefsStore.batch1511.v1513hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1513: hand mode
internal fun PlayerActivity.showV1513HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hand
    FeaturePrefsStore.batch1511.v1513hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1513: hang mode
internal fun PlayerActivity.showV1513HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hang
    FeaturePrefsStore.batch1511.v1513hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1514: grill mode
internal fun PlayerActivity.showV1514GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grill
    FeaturePrefsStore.batch1511.v1514grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1514: grin mode
internal fun PlayerActivity.showV1514GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grin
    FeaturePrefsStore.batch1511.v1514grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1514: grip mode
internal fun PlayerActivity.showV1514GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grip
    FeaturePrefsStore.batch1511.v1514grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1514: grocery mode
internal fun PlayerActivity.showV1514GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grocery
    FeaturePrefsStore.batch1511.v1514grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1514: groom mode
internal fun PlayerActivity.showV1514GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1514groom
    FeaturePrefsStore.batch1511.v1514groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1514: gross level
internal fun PlayerActivity.showV1514GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1514: ground level
internal fun PlayerActivity.showV1514GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1514: growth level
internal fun PlayerActivity.showV1514GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1514: guitar level
internal fun PlayerActivity.showV1514GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1514: habit level
internal fun PlayerActivity.showV1514HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1514: hair mode
internal fun PlayerActivity.showV1514HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hair
    FeaturePrefsStore.batch1511.v1514hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1514: half mode
internal fun PlayerActivity.showV1514HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1514half
    FeaturePrefsStore.batch1511.v1514half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1514: hammer mode
internal fun PlayerActivity.showV1514HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hammer
    FeaturePrefsStore.batch1511.v1514hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1514: hand mode
internal fun PlayerActivity.showV1514HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hand
    FeaturePrefsStore.batch1511.v1514hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1514: hang mode
internal fun PlayerActivity.showV1514HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hang
    FeaturePrefsStore.batch1511.v1514hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1515: grill mode
internal fun PlayerActivity.showV1515GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grill
    FeaturePrefsStore.batch1511.v1515grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1515: grin mode
internal fun PlayerActivity.showV1515GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grin
    FeaturePrefsStore.batch1511.v1515grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1515: grip mode
internal fun PlayerActivity.showV1515GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grip
    FeaturePrefsStore.batch1511.v1515grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1515: grocery mode
internal fun PlayerActivity.showV1515GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grocery
    FeaturePrefsStore.batch1511.v1515grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1515: groom mode
internal fun PlayerActivity.showV1515GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1515groom
    FeaturePrefsStore.batch1511.v1515groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1515: gross level
internal fun PlayerActivity.showV1515GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1515: ground level
internal fun PlayerActivity.showV1515GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1515: growth level
internal fun PlayerActivity.showV1515GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1515: guitar level
internal fun PlayerActivity.showV1515GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1515: habit level
internal fun PlayerActivity.showV1515HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1515: hair mode
internal fun PlayerActivity.showV1515HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hair
    FeaturePrefsStore.batch1511.v1515hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1515: half mode
internal fun PlayerActivity.showV1515HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1515half
    FeaturePrefsStore.batch1511.v1515half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1515: hammer mode
internal fun PlayerActivity.showV1515HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hammer
    FeaturePrefsStore.batch1511.v1515hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1515: hand mode
internal fun PlayerActivity.showV1515HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hand
    FeaturePrefsStore.batch1511.v1515hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1515: hang mode
internal fun PlayerActivity.showV1515HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hang
    FeaturePrefsStore.batch1511.v1515hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1516: grill mode
internal fun PlayerActivity.showV1516GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grill
    FeaturePrefsStore.batch1511.v1516grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1516: grin mode
internal fun PlayerActivity.showV1516GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grin
    FeaturePrefsStore.batch1511.v1516grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1516: grip mode
internal fun PlayerActivity.showV1516GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grip
    FeaturePrefsStore.batch1511.v1516grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1516: grocery mode
internal fun PlayerActivity.showV1516GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grocery
    FeaturePrefsStore.batch1511.v1516grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1516: groom mode
internal fun PlayerActivity.showV1516GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1516groom
    FeaturePrefsStore.batch1511.v1516groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1516: gross level
internal fun PlayerActivity.showV1516GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1516: ground level
internal fun PlayerActivity.showV1516GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1516: growth level
internal fun PlayerActivity.showV1516GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1516: guitar level
internal fun PlayerActivity.showV1516GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1516: habit level
internal fun PlayerActivity.showV1516HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1516: hair mode
internal fun PlayerActivity.showV1516HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hair
    FeaturePrefsStore.batch1511.v1516hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1516: half mode
internal fun PlayerActivity.showV1516HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1516half
    FeaturePrefsStore.batch1511.v1516half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1516: hammer mode
internal fun PlayerActivity.showV1516HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hammer
    FeaturePrefsStore.batch1511.v1516hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1516: hand mode
internal fun PlayerActivity.showV1516HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hand
    FeaturePrefsStore.batch1511.v1516hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1516: hang mode
internal fun PlayerActivity.showV1516HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hang
    FeaturePrefsStore.batch1511.v1516hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1517: grill mode
internal fun PlayerActivity.showV1517GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grill
    FeaturePrefsStore.batch1511.v1517grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1517: grin mode
internal fun PlayerActivity.showV1517GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grin
    FeaturePrefsStore.batch1511.v1517grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1517: grip mode
internal fun PlayerActivity.showV1517GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grip
    FeaturePrefsStore.batch1511.v1517grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1517: grocery mode
internal fun PlayerActivity.showV1517GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grocery
    FeaturePrefsStore.batch1511.v1517grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1517: groom mode
internal fun PlayerActivity.showV1517GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1517groom
    FeaturePrefsStore.batch1511.v1517groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1517: gross level
internal fun PlayerActivity.showV1517GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1517: ground level
internal fun PlayerActivity.showV1517GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1517: growth level
internal fun PlayerActivity.showV1517GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1517: guitar level
internal fun PlayerActivity.showV1517GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1517: habit level
internal fun PlayerActivity.showV1517HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1517: hair mode
internal fun PlayerActivity.showV1517HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hair
    FeaturePrefsStore.batch1511.v1517hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1517: half mode
internal fun PlayerActivity.showV1517HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1517half
    FeaturePrefsStore.batch1511.v1517half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1517: hammer mode
internal fun PlayerActivity.showV1517HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hammer
    FeaturePrefsStore.batch1511.v1517hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1517: hand mode
internal fun PlayerActivity.showV1517HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hand
    FeaturePrefsStore.batch1511.v1517hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1517: hang mode
internal fun PlayerActivity.showV1517HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hang
    FeaturePrefsStore.batch1511.v1517hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1518: grill mode
internal fun PlayerActivity.showV1518GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grill
    FeaturePrefsStore.batch1511.v1518grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1518: grin mode
internal fun PlayerActivity.showV1518GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grin
    FeaturePrefsStore.batch1511.v1518grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1518: grip mode
internal fun PlayerActivity.showV1518GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grip
    FeaturePrefsStore.batch1511.v1518grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1518: grocery mode
internal fun PlayerActivity.showV1518GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grocery
    FeaturePrefsStore.batch1511.v1518grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1518: groom mode
internal fun PlayerActivity.showV1518GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1518groom
    FeaturePrefsStore.batch1511.v1518groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1518: gross level
internal fun PlayerActivity.showV1518GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1518: ground level
internal fun PlayerActivity.showV1518GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1518: growth level
internal fun PlayerActivity.showV1518GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1518: guitar level
internal fun PlayerActivity.showV1518GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1518: habit level
internal fun PlayerActivity.showV1518HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1518: hair mode
internal fun PlayerActivity.showV1518HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hair
    FeaturePrefsStore.batch1511.v1518hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1518: half mode
internal fun PlayerActivity.showV1518HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1518half
    FeaturePrefsStore.batch1511.v1518half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1518: hammer mode
internal fun PlayerActivity.showV1518HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hammer
    FeaturePrefsStore.batch1511.v1518hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1518: hand mode
internal fun PlayerActivity.showV1518HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hand
    FeaturePrefsStore.batch1511.v1518hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1518: hang mode
internal fun PlayerActivity.showV1518HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hang
    FeaturePrefsStore.batch1511.v1518hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1519: grill mode
internal fun PlayerActivity.showV1519GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grill
    FeaturePrefsStore.batch1511.v1519grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1519: grin mode
internal fun PlayerActivity.showV1519GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grin
    FeaturePrefsStore.batch1511.v1519grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1519: grip mode
internal fun PlayerActivity.showV1519GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grip
    FeaturePrefsStore.batch1511.v1519grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1519: grocery mode
internal fun PlayerActivity.showV1519GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grocery
    FeaturePrefsStore.batch1511.v1519grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1519: groom mode
internal fun PlayerActivity.showV1519GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1519groom
    FeaturePrefsStore.batch1511.v1519groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1519: gross level
internal fun PlayerActivity.showV1519GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1519: ground level
internal fun PlayerActivity.showV1519GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1519: growth level
internal fun PlayerActivity.showV1519GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1519: guitar level
internal fun PlayerActivity.showV1519GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1519: habit level
internal fun PlayerActivity.showV1519HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1519: hair mode
internal fun PlayerActivity.showV1519HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hair
    FeaturePrefsStore.batch1511.v1519hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1519: half mode
internal fun PlayerActivity.showV1519HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1519half
    FeaturePrefsStore.batch1511.v1519half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1519: hammer mode
internal fun PlayerActivity.showV1519HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hammer
    FeaturePrefsStore.batch1511.v1519hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1519: hand mode
internal fun PlayerActivity.showV1519HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hand
    FeaturePrefsStore.batch1511.v1519hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1519: hang mode
internal fun PlayerActivity.showV1519HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hang
    FeaturePrefsStore.batch1511.v1519hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1520: grill mode
internal fun PlayerActivity.showV1520GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grill
    FeaturePrefsStore.batch1511.v1520grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1520: grin mode
internal fun PlayerActivity.showV1520GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grin
    FeaturePrefsStore.batch1511.v1520grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1520: grip mode
internal fun PlayerActivity.showV1520GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grip
    FeaturePrefsStore.batch1511.v1520grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1520: grocery mode
internal fun PlayerActivity.showV1520GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grocery
    FeaturePrefsStore.batch1511.v1520grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1520: groom mode
internal fun PlayerActivity.showV1520GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1520groom
    FeaturePrefsStore.batch1511.v1520groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1520: gross level
internal fun PlayerActivity.showV1520GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1520: ground level
internal fun PlayerActivity.showV1520GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1520: growth level
internal fun PlayerActivity.showV1520GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1520: guitar level
internal fun PlayerActivity.showV1520GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1520: habit level
internal fun PlayerActivity.showV1520HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1520: hair mode
internal fun PlayerActivity.showV1520HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hair
    FeaturePrefsStore.batch1511.v1520hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1520: half mode
internal fun PlayerActivity.showV1520HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1520half
    FeaturePrefsStore.batch1511.v1520half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1520: hammer mode
internal fun PlayerActivity.showV1520HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hammer
    FeaturePrefsStore.batch1511.v1520hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1520: hand mode
internal fun PlayerActivity.showV1520HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hand
    FeaturePrefsStore.batch1511.v1520hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1520: hang mode
internal fun PlayerActivity.showV1520HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hang
    FeaturePrefsStore.batch1511.v1520hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1521: happen mode
internal fun PlayerActivity.showV1521HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1521happen
    FeaturePrefsStore.batch1521.v1521happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1521: happy mode
internal fun PlayerActivity.showV1521HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1521happy
    FeaturePrefsStore.batch1521.v1521happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1521: harbor mode
internal fun PlayerActivity.showV1521HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1521harbor
    FeaturePrefsStore.batch1521.v1521harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1521: hard mode
internal fun PlayerActivity.showV1521HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1521hard
    FeaturePrefsStore.batch1521.v1521hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1521: harm mode
internal fun PlayerActivity.showV1521HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1521harm
    FeaturePrefsStore.batch1521.v1521harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1521: harvest level
internal fun PlayerActivity.showV1521HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1521: hat level
internal fun PlayerActivity.showV1521HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1521: have level
internal fun PlayerActivity.showV1521HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521have = value
        AppToast.show(this, "have: $value")
    }
}

// v1521: hawk level
internal fun PlayerActivity.showV1521HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1521: hazard level
internal fun PlayerActivity.showV1521HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1521: health mode
internal fun PlayerActivity.showV1521HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1521health
    FeaturePrefsStore.batch1521.v1521health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1521: heart mode
internal fun PlayerActivity.showV1521HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1521heart
    FeaturePrefsStore.batch1521.v1521heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1521: heavy mode
internal fun PlayerActivity.showV1521HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1521heavy
    FeaturePrefsStore.batch1521.v1521heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1521: hedge mode
internal fun PlayerActivity.showV1521HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1521hedge
    FeaturePrefsStore.batch1521.v1521hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1521: helmet mode
internal fun PlayerActivity.showV1521HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1521helmet
    FeaturePrefsStore.batch1521.v1521helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1522: happen mode
internal fun PlayerActivity.showV1522HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1522happen
    FeaturePrefsStore.batch1521.v1522happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1522: happy mode
internal fun PlayerActivity.showV1522HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1522happy
    FeaturePrefsStore.batch1521.v1522happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1522: harbor mode
internal fun PlayerActivity.showV1522HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1522harbor
    FeaturePrefsStore.batch1521.v1522harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1522: hard mode
internal fun PlayerActivity.showV1522HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1522hard
    FeaturePrefsStore.batch1521.v1522hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1522: harm mode
internal fun PlayerActivity.showV1522HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1522harm
    FeaturePrefsStore.batch1521.v1522harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1522: harvest level
internal fun PlayerActivity.showV1522HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1522: hat level
internal fun PlayerActivity.showV1522HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1522: have level
internal fun PlayerActivity.showV1522HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522have = value
        AppToast.show(this, "have: $value")
    }
}

// v1522: hawk level
internal fun PlayerActivity.showV1522HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1522: hazard level
internal fun PlayerActivity.showV1522HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1522: health mode
internal fun PlayerActivity.showV1522HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1522health
    FeaturePrefsStore.batch1521.v1522health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1522: heart mode
internal fun PlayerActivity.showV1522HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1522heart
    FeaturePrefsStore.batch1521.v1522heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1522: heavy mode
internal fun PlayerActivity.showV1522HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1522heavy
    FeaturePrefsStore.batch1521.v1522heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1522: hedge mode
internal fun PlayerActivity.showV1522HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1522hedge
    FeaturePrefsStore.batch1521.v1522hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1522: helmet mode
internal fun PlayerActivity.showV1522HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1522helmet
    FeaturePrefsStore.batch1521.v1522helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1523: happen mode
internal fun PlayerActivity.showV1523HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1523happen
    FeaturePrefsStore.batch1521.v1523happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1523: happy mode
internal fun PlayerActivity.showV1523HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1523happy
    FeaturePrefsStore.batch1521.v1523happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1523: harbor mode
internal fun PlayerActivity.showV1523HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1523harbor
    FeaturePrefsStore.batch1521.v1523harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1523: hard mode
internal fun PlayerActivity.showV1523HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1523hard
    FeaturePrefsStore.batch1521.v1523hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1523: harm mode
internal fun PlayerActivity.showV1523HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1523harm
    FeaturePrefsStore.batch1521.v1523harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1523: harvest level
internal fun PlayerActivity.showV1523HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1523: hat level
internal fun PlayerActivity.showV1523HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1523: have level
internal fun PlayerActivity.showV1523HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523have = value
        AppToast.show(this, "have: $value")
    }
}

// v1523: hawk level
internal fun PlayerActivity.showV1523HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1523: hazard level
internal fun PlayerActivity.showV1523HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1523: health mode
internal fun PlayerActivity.showV1523HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1523health
    FeaturePrefsStore.batch1521.v1523health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1523: heart mode
internal fun PlayerActivity.showV1523HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1523heart
    FeaturePrefsStore.batch1521.v1523heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1523: heavy mode
internal fun PlayerActivity.showV1523HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1523heavy
    FeaturePrefsStore.batch1521.v1523heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1523: hedge mode
internal fun PlayerActivity.showV1523HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1523hedge
    FeaturePrefsStore.batch1521.v1523hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1523: helmet mode
internal fun PlayerActivity.showV1523HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1523helmet
    FeaturePrefsStore.batch1521.v1523helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1524: happen mode
internal fun PlayerActivity.showV1524HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1524happen
    FeaturePrefsStore.batch1521.v1524happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1524: happy mode
internal fun PlayerActivity.showV1524HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1524happy
    FeaturePrefsStore.batch1521.v1524happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1524: harbor mode
internal fun PlayerActivity.showV1524HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1524harbor
    FeaturePrefsStore.batch1521.v1524harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1524: hard mode
internal fun PlayerActivity.showV1524HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1524hard
    FeaturePrefsStore.batch1521.v1524hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1524: harm mode
internal fun PlayerActivity.showV1524HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1524harm
    FeaturePrefsStore.batch1521.v1524harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1524: harvest level
internal fun PlayerActivity.showV1524HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1524: hat level
internal fun PlayerActivity.showV1524HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1524: have level
internal fun PlayerActivity.showV1524HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524have = value
        AppToast.show(this, "have: $value")
    }
}

// v1524: hawk level
internal fun PlayerActivity.showV1524HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1524: hazard level
internal fun PlayerActivity.showV1524HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1524: health mode
internal fun PlayerActivity.showV1524HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1524health
    FeaturePrefsStore.batch1521.v1524health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1524: heart mode
internal fun PlayerActivity.showV1524HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1524heart
    FeaturePrefsStore.batch1521.v1524heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1524: heavy mode
internal fun PlayerActivity.showV1524HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1524heavy
    FeaturePrefsStore.batch1521.v1524heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1524: hedge mode
internal fun PlayerActivity.showV1524HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1524hedge
    FeaturePrefsStore.batch1521.v1524hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1524: helmet mode
internal fun PlayerActivity.showV1524HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1524helmet
    FeaturePrefsStore.batch1521.v1524helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1525: happen mode
internal fun PlayerActivity.showV1525HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1525happen
    FeaturePrefsStore.batch1521.v1525happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1525: happy mode
internal fun PlayerActivity.showV1525HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1525happy
    FeaturePrefsStore.batch1521.v1525happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1525: harbor mode
internal fun PlayerActivity.showV1525HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1525harbor
    FeaturePrefsStore.batch1521.v1525harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1525: hard mode
internal fun PlayerActivity.showV1525HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1525hard
    FeaturePrefsStore.batch1521.v1525hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1525: harm mode
internal fun PlayerActivity.showV1525HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1525harm
    FeaturePrefsStore.batch1521.v1525harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1525: harvest level
internal fun PlayerActivity.showV1525HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1525: hat level
internal fun PlayerActivity.showV1525HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1525: have level
internal fun PlayerActivity.showV1525HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525have = value
        AppToast.show(this, "have: $value")
    }
}

// v1525: hawk level
internal fun PlayerActivity.showV1525HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1525: hazard level
internal fun PlayerActivity.showV1525HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1525: health mode
internal fun PlayerActivity.showV1525HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1525health
    FeaturePrefsStore.batch1521.v1525health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1525: heart mode
internal fun PlayerActivity.showV1525HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1525heart
    FeaturePrefsStore.batch1521.v1525heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1525: heavy mode
internal fun PlayerActivity.showV1525HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1525heavy
    FeaturePrefsStore.batch1521.v1525heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1525: hedge mode
internal fun PlayerActivity.showV1525HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1525hedge
    FeaturePrefsStore.batch1521.v1525hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1525: helmet mode
internal fun PlayerActivity.showV1525HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1525helmet
    FeaturePrefsStore.batch1521.v1525helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1526: happen mode
internal fun PlayerActivity.showV1526HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1526happen
    FeaturePrefsStore.batch1521.v1526happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1526: happy mode
internal fun PlayerActivity.showV1526HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1526happy
    FeaturePrefsStore.batch1521.v1526happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1526: harbor mode
internal fun PlayerActivity.showV1526HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1526harbor
    FeaturePrefsStore.batch1521.v1526harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1526: hard mode
internal fun PlayerActivity.showV1526HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1526hard
    FeaturePrefsStore.batch1521.v1526hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1526: harm mode
internal fun PlayerActivity.showV1526HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1526harm
    FeaturePrefsStore.batch1521.v1526harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1526: harvest level
internal fun PlayerActivity.showV1526HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1526: hat level
internal fun PlayerActivity.showV1526HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1526: have level
internal fun PlayerActivity.showV1526HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526have = value
        AppToast.show(this, "have: $value")
    }
}

// v1526: hawk level
internal fun PlayerActivity.showV1526HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1526: hazard level
internal fun PlayerActivity.showV1526HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1526: health mode
internal fun PlayerActivity.showV1526HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1526health
    FeaturePrefsStore.batch1521.v1526health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1526: heart mode
internal fun PlayerActivity.showV1526HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1526heart
    FeaturePrefsStore.batch1521.v1526heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1526: heavy mode
internal fun PlayerActivity.showV1526HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1526heavy
    FeaturePrefsStore.batch1521.v1526heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1526: hedge mode
internal fun PlayerActivity.showV1526HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1526hedge
    FeaturePrefsStore.batch1521.v1526hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1526: helmet mode
internal fun PlayerActivity.showV1526HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1526helmet
    FeaturePrefsStore.batch1521.v1526helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1527: happen mode
internal fun PlayerActivity.showV1527HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1527happen
    FeaturePrefsStore.batch1521.v1527happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1527: happy mode
internal fun PlayerActivity.showV1527HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1527happy
    FeaturePrefsStore.batch1521.v1527happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1527: harbor mode
internal fun PlayerActivity.showV1527HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1527harbor
    FeaturePrefsStore.batch1521.v1527harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1527: hard mode
internal fun PlayerActivity.showV1527HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1527hard
    FeaturePrefsStore.batch1521.v1527hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1527: harm mode
internal fun PlayerActivity.showV1527HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1527harm
    FeaturePrefsStore.batch1521.v1527harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1527: harvest level
internal fun PlayerActivity.showV1527HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1527: hat level
internal fun PlayerActivity.showV1527HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1527: have level
internal fun PlayerActivity.showV1527HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527have = value
        AppToast.show(this, "have: $value")
    }
}

// v1527: hawk level
internal fun PlayerActivity.showV1527HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1527: hazard level
internal fun PlayerActivity.showV1527HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1527: health mode
internal fun PlayerActivity.showV1527HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1527health
    FeaturePrefsStore.batch1521.v1527health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1527: heart mode
internal fun PlayerActivity.showV1527HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1527heart
    FeaturePrefsStore.batch1521.v1527heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1527: heavy mode
internal fun PlayerActivity.showV1527HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1527heavy
    FeaturePrefsStore.batch1521.v1527heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1527: hedge mode
internal fun PlayerActivity.showV1527HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1527hedge
    FeaturePrefsStore.batch1521.v1527hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1527: helmet mode
internal fun PlayerActivity.showV1527HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1527helmet
    FeaturePrefsStore.batch1521.v1527helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1528: happen mode
internal fun PlayerActivity.showV1528HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1528happen
    FeaturePrefsStore.batch1521.v1528happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1528: happy mode
internal fun PlayerActivity.showV1528HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1528happy
    FeaturePrefsStore.batch1521.v1528happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1528: harbor mode
internal fun PlayerActivity.showV1528HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1528harbor
    FeaturePrefsStore.batch1521.v1528harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1528: hard mode
internal fun PlayerActivity.showV1528HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1528hard
    FeaturePrefsStore.batch1521.v1528hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1528: harm mode
internal fun PlayerActivity.showV1528HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1528harm
    FeaturePrefsStore.batch1521.v1528harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1528: harvest level
internal fun PlayerActivity.showV1528HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1528: hat level
internal fun PlayerActivity.showV1528HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1528: have level
internal fun PlayerActivity.showV1528HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528have = value
        AppToast.show(this, "have: $value")
    }
}

// v1528: hawk level
internal fun PlayerActivity.showV1528HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1528: hazard level
internal fun PlayerActivity.showV1528HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1528: health mode
internal fun PlayerActivity.showV1528HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1528health
    FeaturePrefsStore.batch1521.v1528health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1528: heart mode
internal fun PlayerActivity.showV1528HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1528heart
    FeaturePrefsStore.batch1521.v1528heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1528: heavy mode
internal fun PlayerActivity.showV1528HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1528heavy
    FeaturePrefsStore.batch1521.v1528heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1528: hedge mode
internal fun PlayerActivity.showV1528HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1528hedge
    FeaturePrefsStore.batch1521.v1528hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1528: helmet mode
internal fun PlayerActivity.showV1528HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1528helmet
    FeaturePrefsStore.batch1521.v1528helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1529: happen mode
internal fun PlayerActivity.showV1529HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1529happen
    FeaturePrefsStore.batch1521.v1529happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1529: happy mode
internal fun PlayerActivity.showV1529HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1529happy
    FeaturePrefsStore.batch1521.v1529happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1529: harbor mode
internal fun PlayerActivity.showV1529HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1529harbor
    FeaturePrefsStore.batch1521.v1529harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1529: hard mode
internal fun PlayerActivity.showV1529HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1529hard
    FeaturePrefsStore.batch1521.v1529hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1529: harm mode
internal fun PlayerActivity.showV1529HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1529harm
    FeaturePrefsStore.batch1521.v1529harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1529: harvest level
internal fun PlayerActivity.showV1529HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1529: hat level
internal fun PlayerActivity.showV1529HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1529: have level
internal fun PlayerActivity.showV1529HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529have = value
        AppToast.show(this, "have: $value")
    }
}

// v1529: hawk level
internal fun PlayerActivity.showV1529HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1529: hazard level
internal fun PlayerActivity.showV1529HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1529: health mode
internal fun PlayerActivity.showV1529HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1529health
    FeaturePrefsStore.batch1521.v1529health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1529: heart mode
internal fun PlayerActivity.showV1529HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1529heart
    FeaturePrefsStore.batch1521.v1529heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1529: heavy mode
internal fun PlayerActivity.showV1529HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1529heavy
    FeaturePrefsStore.batch1521.v1529heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1529: hedge mode
internal fun PlayerActivity.showV1529HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1529hedge
    FeaturePrefsStore.batch1521.v1529hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1529: helmet mode
internal fun PlayerActivity.showV1529HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1529helmet
    FeaturePrefsStore.batch1521.v1529helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1530: happen mode
internal fun PlayerActivity.showV1530HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1530happen
    FeaturePrefsStore.batch1521.v1530happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1530: happy mode
internal fun PlayerActivity.showV1530HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1530happy
    FeaturePrefsStore.batch1521.v1530happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1530: harbor mode
internal fun PlayerActivity.showV1530HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1530harbor
    FeaturePrefsStore.batch1521.v1530harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1530: hard mode
internal fun PlayerActivity.showV1530HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1530hard
    FeaturePrefsStore.batch1521.v1530hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1530: harm mode
internal fun PlayerActivity.showV1530HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1530harm
    FeaturePrefsStore.batch1521.v1530harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1530: harvest level
internal fun PlayerActivity.showV1530HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1530: hat level
internal fun PlayerActivity.showV1530HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1530: have level
internal fun PlayerActivity.showV1530HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530have = value
        AppToast.show(this, "have: $value")
    }
}

// v1530: hawk level
internal fun PlayerActivity.showV1530HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1530: hazard level
internal fun PlayerActivity.showV1530HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1530: health mode
internal fun PlayerActivity.showV1530HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1530health
    FeaturePrefsStore.batch1521.v1530health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1530: heart mode
internal fun PlayerActivity.showV1530HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1530heart
    FeaturePrefsStore.batch1521.v1530heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1530: heavy mode
internal fun PlayerActivity.showV1530HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1530heavy
    FeaturePrefsStore.batch1521.v1530heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1530: hedge mode
internal fun PlayerActivity.showV1530HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1530hedge
    FeaturePrefsStore.batch1521.v1530hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1530: helmet mode
internal fun PlayerActivity.showV1530HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1530helmet
    FeaturePrefsStore.batch1521.v1530helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}
