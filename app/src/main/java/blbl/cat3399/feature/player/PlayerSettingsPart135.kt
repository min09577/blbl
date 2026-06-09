package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1531: help mode
internal fun PlayerActivity.showV1531HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1531help
    FeaturePrefsStore.batch1531.v1531help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1531: herb mode
internal fun PlayerActivity.showV1531HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1531herb
    FeaturePrefsStore.batch1531.v1531herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1531: hero mode
internal fun PlayerActivity.showV1531HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1531hero
    FeaturePrefsStore.batch1531.v1531hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1531: hide mode
internal fun PlayerActivity.showV1531HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1531hide
    FeaturePrefsStore.batch1531.v1531hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1531: high mode
internal fun PlayerActivity.showV1531HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1531high
    FeaturePrefsStore.batch1531.v1531high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1531: hike level
internal fun PlayerActivity.showV1531HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1531hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1531hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1531: hill level
internal fun PlayerActivity.showV1531HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1531hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1531hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1531: hip level
internal fun PlayerActivity.showV1531HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1531hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1531hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1531: hire level
internal fun PlayerActivity.showV1531HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1531hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1531hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1531: hobby level
internal fun PlayerActivity.showV1531HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1531hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1531hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1531: hockey mode
internal fun PlayerActivity.showV1531HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1531hockey
    FeaturePrefsStore.batch1531.v1531hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1531: hole mode
internal fun PlayerActivity.showV1531HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1531hole
    FeaturePrefsStore.batch1531.v1531hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1531: hollow mode
internal fun PlayerActivity.showV1531HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1531hollow
    FeaturePrefsStore.batch1531.v1531hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1531: home mode
internal fun PlayerActivity.showV1531HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1531home
    FeaturePrefsStore.batch1531.v1531home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1531: honey mode
internal fun PlayerActivity.showV1531HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1531honey
    FeaturePrefsStore.batch1531.v1531honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1532: help mode
internal fun PlayerActivity.showV1532HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1532help
    FeaturePrefsStore.batch1531.v1532help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1532: herb mode
internal fun PlayerActivity.showV1532HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1532herb
    FeaturePrefsStore.batch1531.v1532herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1532: hero mode
internal fun PlayerActivity.showV1532HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1532hero
    FeaturePrefsStore.batch1531.v1532hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1532: hide mode
internal fun PlayerActivity.showV1532HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1532hide
    FeaturePrefsStore.batch1531.v1532hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1532: high mode
internal fun PlayerActivity.showV1532HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1532high
    FeaturePrefsStore.batch1531.v1532high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1532: hike level
internal fun PlayerActivity.showV1532HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1532hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1532hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1532: hill level
internal fun PlayerActivity.showV1532HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1532hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1532hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1532: hip level
internal fun PlayerActivity.showV1532HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1532hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1532hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1532: hire level
internal fun PlayerActivity.showV1532HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1532hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1532hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1532: hobby level
internal fun PlayerActivity.showV1532HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1532hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1532hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1532: hockey mode
internal fun PlayerActivity.showV1532HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1532hockey
    FeaturePrefsStore.batch1531.v1532hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1532: hole mode
internal fun PlayerActivity.showV1532HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1532hole
    FeaturePrefsStore.batch1531.v1532hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1532: hollow mode
internal fun PlayerActivity.showV1532HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1532hollow
    FeaturePrefsStore.batch1531.v1532hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1532: home mode
internal fun PlayerActivity.showV1532HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1532home
    FeaturePrefsStore.batch1531.v1532home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1532: honey mode
internal fun PlayerActivity.showV1532HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1532honey
    FeaturePrefsStore.batch1531.v1532honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1533: help mode
internal fun PlayerActivity.showV1533HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1533help
    FeaturePrefsStore.batch1531.v1533help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1533: herb mode
internal fun PlayerActivity.showV1533HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1533herb
    FeaturePrefsStore.batch1531.v1533herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1533: hero mode
internal fun PlayerActivity.showV1533HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1533hero
    FeaturePrefsStore.batch1531.v1533hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1533: hide mode
internal fun PlayerActivity.showV1533HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1533hide
    FeaturePrefsStore.batch1531.v1533hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1533: high mode
internal fun PlayerActivity.showV1533HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1533high
    FeaturePrefsStore.batch1531.v1533high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1533: hike level
internal fun PlayerActivity.showV1533HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1533hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1533hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1533: hill level
internal fun PlayerActivity.showV1533HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1533hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1533hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1533: hip level
internal fun PlayerActivity.showV1533HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1533hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1533hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1533: hire level
internal fun PlayerActivity.showV1533HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1533hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1533hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1533: hobby level
internal fun PlayerActivity.showV1533HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1533hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1533hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1533: hockey mode
internal fun PlayerActivity.showV1533HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1533hockey
    FeaturePrefsStore.batch1531.v1533hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1533: hole mode
internal fun PlayerActivity.showV1533HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1533hole
    FeaturePrefsStore.batch1531.v1533hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1533: hollow mode
internal fun PlayerActivity.showV1533HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1533hollow
    FeaturePrefsStore.batch1531.v1533hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1533: home mode
internal fun PlayerActivity.showV1533HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1533home
    FeaturePrefsStore.batch1531.v1533home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1533: honey mode
internal fun PlayerActivity.showV1533HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1533honey
    FeaturePrefsStore.batch1531.v1533honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1534: help mode
internal fun PlayerActivity.showV1534HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1534help
    FeaturePrefsStore.batch1531.v1534help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1534: herb mode
internal fun PlayerActivity.showV1534HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1534herb
    FeaturePrefsStore.batch1531.v1534herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1534: hero mode
internal fun PlayerActivity.showV1534HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1534hero
    FeaturePrefsStore.batch1531.v1534hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1534: hide mode
internal fun PlayerActivity.showV1534HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1534hide
    FeaturePrefsStore.batch1531.v1534hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1534: high mode
internal fun PlayerActivity.showV1534HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1534high
    FeaturePrefsStore.batch1531.v1534high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1534: hike level
internal fun PlayerActivity.showV1534HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1534hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1534hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1534: hill level
internal fun PlayerActivity.showV1534HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1534hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1534hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1534: hip level
internal fun PlayerActivity.showV1534HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1534hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1534hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1534: hire level
internal fun PlayerActivity.showV1534HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1534hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1534hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1534: hobby level
internal fun PlayerActivity.showV1534HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1534hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1534hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1534: hockey mode
internal fun PlayerActivity.showV1534HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1534hockey
    FeaturePrefsStore.batch1531.v1534hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1534: hole mode
internal fun PlayerActivity.showV1534HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1534hole
    FeaturePrefsStore.batch1531.v1534hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1534: hollow mode
internal fun PlayerActivity.showV1534HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1534hollow
    FeaturePrefsStore.batch1531.v1534hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1534: home mode
internal fun PlayerActivity.showV1534HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1534home
    FeaturePrefsStore.batch1531.v1534home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1534: honey mode
internal fun PlayerActivity.showV1534HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1534honey
    FeaturePrefsStore.batch1531.v1534honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1535: help mode
internal fun PlayerActivity.showV1535HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1535help
    FeaturePrefsStore.batch1531.v1535help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1535: herb mode
internal fun PlayerActivity.showV1535HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1535herb
    FeaturePrefsStore.batch1531.v1535herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1535: hero mode
internal fun PlayerActivity.showV1535HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1535hero
    FeaturePrefsStore.batch1531.v1535hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1535: hide mode
internal fun PlayerActivity.showV1535HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1535hide
    FeaturePrefsStore.batch1531.v1535hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1535: high mode
internal fun PlayerActivity.showV1535HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1535high
    FeaturePrefsStore.batch1531.v1535high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1535: hike level
internal fun PlayerActivity.showV1535HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1535hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1535hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1535: hill level
internal fun PlayerActivity.showV1535HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1535hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1535hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1535: hip level
internal fun PlayerActivity.showV1535HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1535hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1535hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1535: hire level
internal fun PlayerActivity.showV1535HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1535hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1535hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1535: hobby level
internal fun PlayerActivity.showV1535HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1535hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1535hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1535: hockey mode
internal fun PlayerActivity.showV1535HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1535hockey
    FeaturePrefsStore.batch1531.v1535hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1535: hole mode
internal fun PlayerActivity.showV1535HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1535hole
    FeaturePrefsStore.batch1531.v1535hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1535: hollow mode
internal fun PlayerActivity.showV1535HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1535hollow
    FeaturePrefsStore.batch1531.v1535hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1535: home mode
internal fun PlayerActivity.showV1535HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1535home
    FeaturePrefsStore.batch1531.v1535home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1535: honey mode
internal fun PlayerActivity.showV1535HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1535honey
    FeaturePrefsStore.batch1531.v1535honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1536: help mode
internal fun PlayerActivity.showV1536HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1536help
    FeaturePrefsStore.batch1531.v1536help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1536: herb mode
internal fun PlayerActivity.showV1536HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1536herb
    FeaturePrefsStore.batch1531.v1536herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1536: hero mode
internal fun PlayerActivity.showV1536HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1536hero
    FeaturePrefsStore.batch1531.v1536hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1536: hide mode
internal fun PlayerActivity.showV1536HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1536hide
    FeaturePrefsStore.batch1531.v1536hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1536: high mode
internal fun PlayerActivity.showV1536HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1536high
    FeaturePrefsStore.batch1531.v1536high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1536: hike level
internal fun PlayerActivity.showV1536HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1536hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1536hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1536: hill level
internal fun PlayerActivity.showV1536HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1536hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1536hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1536: hip level
internal fun PlayerActivity.showV1536HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1536hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1536hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1536: hire level
internal fun PlayerActivity.showV1536HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1536hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1536hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1536: hobby level
internal fun PlayerActivity.showV1536HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1536hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1536hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1536: hockey mode
internal fun PlayerActivity.showV1536HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1536hockey
    FeaturePrefsStore.batch1531.v1536hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1536: hole mode
internal fun PlayerActivity.showV1536HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1536hole
    FeaturePrefsStore.batch1531.v1536hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1536: hollow mode
internal fun PlayerActivity.showV1536HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1536hollow
    FeaturePrefsStore.batch1531.v1536hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1536: home mode
internal fun PlayerActivity.showV1536HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1536home
    FeaturePrefsStore.batch1531.v1536home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1536: honey mode
internal fun PlayerActivity.showV1536HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1536honey
    FeaturePrefsStore.batch1531.v1536honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1537: help mode
internal fun PlayerActivity.showV1537HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1537help
    FeaturePrefsStore.batch1531.v1537help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1537: herb mode
internal fun PlayerActivity.showV1537HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1537herb
    FeaturePrefsStore.batch1531.v1537herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1537: hero mode
internal fun PlayerActivity.showV1537HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1537hero
    FeaturePrefsStore.batch1531.v1537hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1537: hide mode
internal fun PlayerActivity.showV1537HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1537hide
    FeaturePrefsStore.batch1531.v1537hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1537: high mode
internal fun PlayerActivity.showV1537HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1537high
    FeaturePrefsStore.batch1531.v1537high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1537: hike level
internal fun PlayerActivity.showV1537HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1537hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1537hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1537: hill level
internal fun PlayerActivity.showV1537HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1537hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1537hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1537: hip level
internal fun PlayerActivity.showV1537HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1537hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1537hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1537: hire level
internal fun PlayerActivity.showV1537HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1537hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1537hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1537: hobby level
internal fun PlayerActivity.showV1537HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1537hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1537hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1537: hockey mode
internal fun PlayerActivity.showV1537HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1537hockey
    FeaturePrefsStore.batch1531.v1537hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1537: hole mode
internal fun PlayerActivity.showV1537HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1537hole
    FeaturePrefsStore.batch1531.v1537hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1537: hollow mode
internal fun PlayerActivity.showV1537HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1537hollow
    FeaturePrefsStore.batch1531.v1537hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1537: home mode
internal fun PlayerActivity.showV1537HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1537home
    FeaturePrefsStore.batch1531.v1537home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1537: honey mode
internal fun PlayerActivity.showV1537HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1537honey
    FeaturePrefsStore.batch1531.v1537honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1538: help mode
internal fun PlayerActivity.showV1538HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1538help
    FeaturePrefsStore.batch1531.v1538help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1538: herb mode
internal fun PlayerActivity.showV1538HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1538herb
    FeaturePrefsStore.batch1531.v1538herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1538: hero mode
internal fun PlayerActivity.showV1538HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1538hero
    FeaturePrefsStore.batch1531.v1538hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1538: hide mode
internal fun PlayerActivity.showV1538HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1538hide
    FeaturePrefsStore.batch1531.v1538hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1538: high mode
internal fun PlayerActivity.showV1538HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1538high
    FeaturePrefsStore.batch1531.v1538high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1538: hike level
internal fun PlayerActivity.showV1538HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1538hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1538hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1538: hill level
internal fun PlayerActivity.showV1538HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1538hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1538hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1538: hip level
internal fun PlayerActivity.showV1538HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1538hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1538hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1538: hire level
internal fun PlayerActivity.showV1538HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1538hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1538hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1538: hobby level
internal fun PlayerActivity.showV1538HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1538hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1538hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1538: hockey mode
internal fun PlayerActivity.showV1538HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1538hockey
    FeaturePrefsStore.batch1531.v1538hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1538: hole mode
internal fun PlayerActivity.showV1538HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1538hole
    FeaturePrefsStore.batch1531.v1538hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1538: hollow mode
internal fun PlayerActivity.showV1538HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1538hollow
    FeaturePrefsStore.batch1531.v1538hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1538: home mode
internal fun PlayerActivity.showV1538HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1538home
    FeaturePrefsStore.batch1531.v1538home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1538: honey mode
internal fun PlayerActivity.showV1538HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1538honey
    FeaturePrefsStore.batch1531.v1538honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1539: help mode
internal fun PlayerActivity.showV1539HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1539help
    FeaturePrefsStore.batch1531.v1539help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1539: herb mode
internal fun PlayerActivity.showV1539HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1539herb
    FeaturePrefsStore.batch1531.v1539herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1539: hero mode
internal fun PlayerActivity.showV1539HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1539hero
    FeaturePrefsStore.batch1531.v1539hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1539: hide mode
internal fun PlayerActivity.showV1539HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1539hide
    FeaturePrefsStore.batch1531.v1539hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1539: high mode
internal fun PlayerActivity.showV1539HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1539high
    FeaturePrefsStore.batch1531.v1539high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1539: hike level
internal fun PlayerActivity.showV1539HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1539hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1539hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1539: hill level
internal fun PlayerActivity.showV1539HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1539hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1539hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1539: hip level
internal fun PlayerActivity.showV1539HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1539hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1539hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1539: hire level
internal fun PlayerActivity.showV1539HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1539hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1539hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1539: hobby level
internal fun PlayerActivity.showV1539HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1539hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1539hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1539: hockey mode
internal fun PlayerActivity.showV1539HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1539hockey
    FeaturePrefsStore.batch1531.v1539hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1539: hole mode
internal fun PlayerActivity.showV1539HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1539hole
    FeaturePrefsStore.batch1531.v1539hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1539: hollow mode
internal fun PlayerActivity.showV1539HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1539hollow
    FeaturePrefsStore.batch1531.v1539hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1539: home mode
internal fun PlayerActivity.showV1539HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1539home
    FeaturePrefsStore.batch1531.v1539home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1539: honey mode
internal fun PlayerActivity.showV1539HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1539honey
    FeaturePrefsStore.batch1531.v1539honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

// v1540: help mode
internal fun PlayerActivity.showV1540HelpToggle() {
    val current = FeaturePrefsStore.batch1531.v1540help
    FeaturePrefsStore.batch1531.v1540help = !current
    AppToast.show(this, "help: ${if (!current) "ON" else "OFF"}")
}

// v1540: herb mode
internal fun PlayerActivity.showV1540HerbToggle() {
    val current = FeaturePrefsStore.batch1531.v1540herb
    FeaturePrefsStore.batch1531.v1540herb = !current
    AppToast.show(this, "herb: ${if (!current) "ON" else "OFF"}")
}

// v1540: hero mode
internal fun PlayerActivity.showV1540HeroToggle() {
    val current = FeaturePrefsStore.batch1531.v1540hero
    FeaturePrefsStore.batch1531.v1540hero = !current
    AppToast.show(this, "hero: ${if (!current) "ON" else "OFF"}")
}

// v1540: hide mode
internal fun PlayerActivity.showV1540HideToggle() {
    val current = FeaturePrefsStore.batch1531.v1540hide
    FeaturePrefsStore.batch1531.v1540hide = !current
    AppToast.show(this, "hide: ${if (!current) "ON" else "OFF"}")
}

// v1540: high mode
internal fun PlayerActivity.showV1540HighToggle() {
    val current = FeaturePrefsStore.batch1531.v1540high
    FeaturePrefsStore.batch1531.v1540high = !current
    AppToast.show(this, "high: ${if (!current) "ON" else "OFF"}")
}

// v1540: hike level
internal fun PlayerActivity.showV1540HikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1540hike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1540hike = value
        AppToast.show(this, "hike: $value")
    }
}

// v1540: hill level
internal fun PlayerActivity.showV1540HillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1540hill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1540hill = value
        AppToast.show(this, "hill: $value")
    }
}

// v1540: hip level
internal fun PlayerActivity.showV1540HipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1540hip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1540hip = value
        AppToast.show(this, "hip: $value")
    }
}

// v1540: hire level
internal fun PlayerActivity.showV1540HireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1540hire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1540hire = value
        AppToast.show(this, "hire: $value")
    }
}

// v1540: hobby level
internal fun PlayerActivity.showV1540HobbyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1531.v1540hobby).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hobby level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1531.v1540hobby = value
        AppToast.show(this, "hobby: $value")
    }
}

// v1540: hockey mode
internal fun PlayerActivity.showV1540HockeyToggle() {
    val current = FeaturePrefsStore.batch1531.v1540hockey
    FeaturePrefsStore.batch1531.v1540hockey = !current
    AppToast.show(this, "hockey: ${if (!current) "ON" else "OFF"}")
}

// v1540: hole mode
internal fun PlayerActivity.showV1540HoleToggle() {
    val current = FeaturePrefsStore.batch1531.v1540hole
    FeaturePrefsStore.batch1531.v1540hole = !current
    AppToast.show(this, "hole: ${if (!current) "ON" else "OFF"}")
}

// v1540: hollow mode
internal fun PlayerActivity.showV1540HollowToggle() {
    val current = FeaturePrefsStore.batch1531.v1540hollow
    FeaturePrefsStore.batch1531.v1540hollow = !current
    AppToast.show(this, "hollow: ${if (!current) "ON" else "OFF"}")
}

// v1540: home mode
internal fun PlayerActivity.showV1540HomeToggle() {
    val current = FeaturePrefsStore.batch1531.v1540home
    FeaturePrefsStore.batch1531.v1540home = !current
    AppToast.show(this, "home: ${if (!current) "ON" else "OFF"}")
}

// v1540: honey mode
internal fun PlayerActivity.showV1540HoneyToggle() {
    val current = FeaturePrefsStore.batch1531.v1540honey
    FeaturePrefsStore.batch1531.v1540honey = !current
    AppToast.show(this, "honey: ${if (!current) "ON" else "OFF"}")
}

