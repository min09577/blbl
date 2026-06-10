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

// v1541: hood mode
internal fun PlayerActivity.showV1541HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hood
    FeaturePrefsStore.batch1541.v1541hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1541: hope mode
internal fun PlayerActivity.showV1541HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hope
    FeaturePrefsStore.batch1541.v1541hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1541: horn mode
internal fun PlayerActivity.showV1541HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horn
    FeaturePrefsStore.batch1541.v1541horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1541: horror mode
internal fun PlayerActivity.showV1541HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horror
    FeaturePrefsStore.batch1541.v1541horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1541: horse mode
internal fun PlayerActivity.showV1541HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horse
    FeaturePrefsStore.batch1541.v1541horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1541: hotel level
internal fun PlayerActivity.showV1541HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1541: hour level
internal fun PlayerActivity.showV1541HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1541: house level
internal fun PlayerActivity.showV1541HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541house = value
        AppToast.show(this, "house: $value")
    }
}

// v1541: huge level
internal fun PlayerActivity.showV1541HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1541: hull level
internal fun PlayerActivity.showV1541HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1541: humor mode
internal fun PlayerActivity.showV1541HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1541humor
    FeaturePrefsStore.batch1541.v1541humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1541: hundred mode
internal fun PlayerActivity.showV1541HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hundred
    FeaturePrefsStore.batch1541.v1541hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1541: hunt mode
internal fun PlayerActivity.showV1541HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hunt
    FeaturePrefsStore.batch1541.v1541hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1541: hurry mode
internal fun PlayerActivity.showV1541HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hurry
    FeaturePrefsStore.batch1541.v1541hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1541: hurt mode
internal fun PlayerActivity.showV1541HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hurt
    FeaturePrefsStore.batch1541.v1541hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1542: hood mode
internal fun PlayerActivity.showV1542HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hood
    FeaturePrefsStore.batch1541.v1542hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1542: hope mode
internal fun PlayerActivity.showV1542HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hope
    FeaturePrefsStore.batch1541.v1542hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1542: horn mode
internal fun PlayerActivity.showV1542HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horn
    FeaturePrefsStore.batch1541.v1542horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1542: horror mode
internal fun PlayerActivity.showV1542HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horror
    FeaturePrefsStore.batch1541.v1542horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1542: horse mode
internal fun PlayerActivity.showV1542HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horse
    FeaturePrefsStore.batch1541.v1542horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1542: hotel level
internal fun PlayerActivity.showV1542HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1542: hour level
internal fun PlayerActivity.showV1542HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1542: house level
internal fun PlayerActivity.showV1542HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542house = value
        AppToast.show(this, "house: $value")
    }
}

// v1542: huge level
internal fun PlayerActivity.showV1542HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1542: hull level
internal fun PlayerActivity.showV1542HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1542: humor mode
internal fun PlayerActivity.showV1542HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1542humor
    FeaturePrefsStore.batch1541.v1542humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1542: hundred mode
internal fun PlayerActivity.showV1542HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hundred
    FeaturePrefsStore.batch1541.v1542hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1542: hunt mode
internal fun PlayerActivity.showV1542HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hunt
    FeaturePrefsStore.batch1541.v1542hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1542: hurry mode
internal fun PlayerActivity.showV1542HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hurry
    FeaturePrefsStore.batch1541.v1542hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1542: hurt mode
internal fun PlayerActivity.showV1542HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hurt
    FeaturePrefsStore.batch1541.v1542hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1543: hood mode
internal fun PlayerActivity.showV1543HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hood
    FeaturePrefsStore.batch1541.v1543hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1543: hope mode
internal fun PlayerActivity.showV1543HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hope
    FeaturePrefsStore.batch1541.v1543hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1543: horn mode
internal fun PlayerActivity.showV1543HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horn
    FeaturePrefsStore.batch1541.v1543horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1543: horror mode
internal fun PlayerActivity.showV1543HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horror
    FeaturePrefsStore.batch1541.v1543horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1543: horse mode
internal fun PlayerActivity.showV1543HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horse
    FeaturePrefsStore.batch1541.v1543horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1543: hotel level
internal fun PlayerActivity.showV1543HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1543: hour level
internal fun PlayerActivity.showV1543HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1543: house level
internal fun PlayerActivity.showV1543HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543house = value
        AppToast.show(this, "house: $value")
    }
}

// v1543: huge level
internal fun PlayerActivity.showV1543HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1543: hull level
internal fun PlayerActivity.showV1543HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1543: humor mode
internal fun PlayerActivity.showV1543HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1543humor
    FeaturePrefsStore.batch1541.v1543humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1543: hundred mode
internal fun PlayerActivity.showV1543HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hundred
    FeaturePrefsStore.batch1541.v1543hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1543: hunt mode
internal fun PlayerActivity.showV1543HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hunt
    FeaturePrefsStore.batch1541.v1543hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1543: hurry mode
internal fun PlayerActivity.showV1543HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hurry
    FeaturePrefsStore.batch1541.v1543hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1543: hurt mode
internal fun PlayerActivity.showV1543HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hurt
    FeaturePrefsStore.batch1541.v1543hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1544: hood mode
internal fun PlayerActivity.showV1544HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hood
    FeaturePrefsStore.batch1541.v1544hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1544: hope mode
internal fun PlayerActivity.showV1544HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hope
    FeaturePrefsStore.batch1541.v1544hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1544: horn mode
internal fun PlayerActivity.showV1544HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horn
    FeaturePrefsStore.batch1541.v1544horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1544: horror mode
internal fun PlayerActivity.showV1544HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horror
    FeaturePrefsStore.batch1541.v1544horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1544: horse mode
internal fun PlayerActivity.showV1544HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horse
    FeaturePrefsStore.batch1541.v1544horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1544: hotel level
internal fun PlayerActivity.showV1544HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1544: hour level
internal fun PlayerActivity.showV1544HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1544: house level
internal fun PlayerActivity.showV1544HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544house = value
        AppToast.show(this, "house: $value")
    }
}

// v1544: huge level
internal fun PlayerActivity.showV1544HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1544: hull level
internal fun PlayerActivity.showV1544HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1544: humor mode
internal fun PlayerActivity.showV1544HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1544humor
    FeaturePrefsStore.batch1541.v1544humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1544: hundred mode
internal fun PlayerActivity.showV1544HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hundred
    FeaturePrefsStore.batch1541.v1544hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1544: hunt mode
internal fun PlayerActivity.showV1544HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hunt
    FeaturePrefsStore.batch1541.v1544hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1544: hurry mode
internal fun PlayerActivity.showV1544HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hurry
    FeaturePrefsStore.batch1541.v1544hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1544: hurt mode
internal fun PlayerActivity.showV1544HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hurt
    FeaturePrefsStore.batch1541.v1544hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1545: hood mode
internal fun PlayerActivity.showV1545HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hood
    FeaturePrefsStore.batch1541.v1545hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1545: hope mode
internal fun PlayerActivity.showV1545HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hope
    FeaturePrefsStore.batch1541.v1545hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1545: horn mode
internal fun PlayerActivity.showV1545HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horn
    FeaturePrefsStore.batch1541.v1545horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1545: horror mode
internal fun PlayerActivity.showV1545HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horror
    FeaturePrefsStore.batch1541.v1545horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1545: horse mode
internal fun PlayerActivity.showV1545HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horse
    FeaturePrefsStore.batch1541.v1545horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1545: hotel level
internal fun PlayerActivity.showV1545HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1545: hour level
internal fun PlayerActivity.showV1545HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1545: house level
internal fun PlayerActivity.showV1545HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545house = value
        AppToast.show(this, "house: $value")
    }
}

// v1545: huge level
internal fun PlayerActivity.showV1545HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1545: hull level
internal fun PlayerActivity.showV1545HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1545: humor mode
internal fun PlayerActivity.showV1545HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1545humor
    FeaturePrefsStore.batch1541.v1545humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1545: hundred mode
internal fun PlayerActivity.showV1545HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hundred
    FeaturePrefsStore.batch1541.v1545hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1545: hunt mode
internal fun PlayerActivity.showV1545HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hunt
    FeaturePrefsStore.batch1541.v1545hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1545: hurry mode
internal fun PlayerActivity.showV1545HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hurry
    FeaturePrefsStore.batch1541.v1545hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1545: hurt mode
internal fun PlayerActivity.showV1545HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hurt
    FeaturePrefsStore.batch1541.v1545hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1546: hood mode
internal fun PlayerActivity.showV1546HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hood
    FeaturePrefsStore.batch1541.v1546hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1546: hope mode
internal fun PlayerActivity.showV1546HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hope
    FeaturePrefsStore.batch1541.v1546hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1546: horn mode
internal fun PlayerActivity.showV1546HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horn
    FeaturePrefsStore.batch1541.v1546horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1546: horror mode
internal fun PlayerActivity.showV1546HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horror
    FeaturePrefsStore.batch1541.v1546horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1546: horse mode
internal fun PlayerActivity.showV1546HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horse
    FeaturePrefsStore.batch1541.v1546horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1546: hotel level
internal fun PlayerActivity.showV1546HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1546: hour level
internal fun PlayerActivity.showV1546HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1546: house level
internal fun PlayerActivity.showV1546HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546house = value
        AppToast.show(this, "house: $value")
    }
}

// v1546: huge level
internal fun PlayerActivity.showV1546HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1546: hull level
internal fun PlayerActivity.showV1546HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1546: humor mode
internal fun PlayerActivity.showV1546HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1546humor
    FeaturePrefsStore.batch1541.v1546humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1546: hundred mode
internal fun PlayerActivity.showV1546HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hundred
    FeaturePrefsStore.batch1541.v1546hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1546: hunt mode
internal fun PlayerActivity.showV1546HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hunt
    FeaturePrefsStore.batch1541.v1546hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1546: hurry mode
internal fun PlayerActivity.showV1546HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hurry
    FeaturePrefsStore.batch1541.v1546hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1546: hurt mode
internal fun PlayerActivity.showV1546HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hurt
    FeaturePrefsStore.batch1541.v1546hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1547: hood mode
internal fun PlayerActivity.showV1547HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hood
    FeaturePrefsStore.batch1541.v1547hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1547: hope mode
internal fun PlayerActivity.showV1547HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hope
    FeaturePrefsStore.batch1541.v1547hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1547: horn mode
internal fun PlayerActivity.showV1547HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horn
    FeaturePrefsStore.batch1541.v1547horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1547: horror mode
internal fun PlayerActivity.showV1547HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horror
    FeaturePrefsStore.batch1541.v1547horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1547: horse mode
internal fun PlayerActivity.showV1547HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horse
    FeaturePrefsStore.batch1541.v1547horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1547: hotel level
internal fun PlayerActivity.showV1547HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1547: hour level
internal fun PlayerActivity.showV1547HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1547: house level
internal fun PlayerActivity.showV1547HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547house = value
        AppToast.show(this, "house: $value")
    }
}

// v1547: huge level
internal fun PlayerActivity.showV1547HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1547: hull level
internal fun PlayerActivity.showV1547HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1547: humor mode
internal fun PlayerActivity.showV1547HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1547humor
    FeaturePrefsStore.batch1541.v1547humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1547: hundred mode
internal fun PlayerActivity.showV1547HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hundred
    FeaturePrefsStore.batch1541.v1547hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1547: hunt mode
internal fun PlayerActivity.showV1547HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hunt
    FeaturePrefsStore.batch1541.v1547hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1547: hurry mode
internal fun PlayerActivity.showV1547HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hurry
    FeaturePrefsStore.batch1541.v1547hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1547: hurt mode
internal fun PlayerActivity.showV1547HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hurt
    FeaturePrefsStore.batch1541.v1547hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1548: hood mode
internal fun PlayerActivity.showV1548HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hood
    FeaturePrefsStore.batch1541.v1548hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1548: hope mode
internal fun PlayerActivity.showV1548HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hope
    FeaturePrefsStore.batch1541.v1548hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1548: horn mode
internal fun PlayerActivity.showV1548HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horn
    FeaturePrefsStore.batch1541.v1548horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1548: horror mode
internal fun PlayerActivity.showV1548HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horror
    FeaturePrefsStore.batch1541.v1548horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1548: horse mode
internal fun PlayerActivity.showV1548HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horse
    FeaturePrefsStore.batch1541.v1548horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1548: hotel level
internal fun PlayerActivity.showV1548HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1548: hour level
internal fun PlayerActivity.showV1548HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1548: house level
internal fun PlayerActivity.showV1548HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548house = value
        AppToast.show(this, "house: $value")
    }
}

// v1548: huge level
internal fun PlayerActivity.showV1548HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1548: hull level
internal fun PlayerActivity.showV1548HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1548: humor mode
internal fun PlayerActivity.showV1548HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1548humor
    FeaturePrefsStore.batch1541.v1548humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1548: hundred mode
internal fun PlayerActivity.showV1548HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hundred
    FeaturePrefsStore.batch1541.v1548hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1548: hunt mode
internal fun PlayerActivity.showV1548HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hunt
    FeaturePrefsStore.batch1541.v1548hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1548: hurry mode
internal fun PlayerActivity.showV1548HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hurry
    FeaturePrefsStore.batch1541.v1548hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1548: hurt mode
internal fun PlayerActivity.showV1548HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hurt
    FeaturePrefsStore.batch1541.v1548hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1549: hood mode
internal fun PlayerActivity.showV1549HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hood
    FeaturePrefsStore.batch1541.v1549hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1549: hope mode
internal fun PlayerActivity.showV1549HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hope
    FeaturePrefsStore.batch1541.v1549hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1549: horn mode
internal fun PlayerActivity.showV1549HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horn
    FeaturePrefsStore.batch1541.v1549horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1549: horror mode
internal fun PlayerActivity.showV1549HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horror
    FeaturePrefsStore.batch1541.v1549horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1549: horse mode
internal fun PlayerActivity.showV1549HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horse
    FeaturePrefsStore.batch1541.v1549horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1549: hotel level
internal fun PlayerActivity.showV1549HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1549: hour level
internal fun PlayerActivity.showV1549HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1549: house level
internal fun PlayerActivity.showV1549HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549house = value
        AppToast.show(this, "house: $value")
    }
}

// v1549: huge level
internal fun PlayerActivity.showV1549HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1549: hull level
internal fun PlayerActivity.showV1549HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1549: humor mode
internal fun PlayerActivity.showV1549HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1549humor
    FeaturePrefsStore.batch1541.v1549humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1549: hundred mode
internal fun PlayerActivity.showV1549HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hundred
    FeaturePrefsStore.batch1541.v1549hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1549: hunt mode
internal fun PlayerActivity.showV1549HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hunt
    FeaturePrefsStore.batch1541.v1549hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1549: hurry mode
internal fun PlayerActivity.showV1549HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hurry
    FeaturePrefsStore.batch1541.v1549hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1549: hurt mode
internal fun PlayerActivity.showV1549HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hurt
    FeaturePrefsStore.batch1541.v1549hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1550: hood mode
internal fun PlayerActivity.showV1550HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hood
    FeaturePrefsStore.batch1541.v1550hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1550: hope mode
internal fun PlayerActivity.showV1550HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hope
    FeaturePrefsStore.batch1541.v1550hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1550: horn mode
internal fun PlayerActivity.showV1550HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horn
    FeaturePrefsStore.batch1541.v1550horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1550: horror mode
internal fun PlayerActivity.showV1550HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horror
    FeaturePrefsStore.batch1541.v1550horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1550: horse mode
internal fun PlayerActivity.showV1550HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horse
    FeaturePrefsStore.batch1541.v1550horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1550: hotel level
internal fun PlayerActivity.showV1550HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1550: hour level
internal fun PlayerActivity.showV1550HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1550: house level
internal fun PlayerActivity.showV1550HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550house = value
        AppToast.show(this, "house: $value")
    }
}

// v1550: huge level
internal fun PlayerActivity.showV1550HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1550: hull level
internal fun PlayerActivity.showV1550HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1550: humor mode
internal fun PlayerActivity.showV1550HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1550humor
    FeaturePrefsStore.batch1541.v1550humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1550: hundred mode
internal fun PlayerActivity.showV1550HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hundred
    FeaturePrefsStore.batch1541.v1550hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1550: hunt mode
internal fun PlayerActivity.showV1550HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hunt
    FeaturePrefsStore.batch1541.v1550hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1550: hurry mode
internal fun PlayerActivity.showV1550HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hurry
    FeaturePrefsStore.batch1541.v1550hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1550: hurt mode
internal fun PlayerActivity.showV1550HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hurt
    FeaturePrefsStore.batch1541.v1550hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1551: husband mode
internal fun PlayerActivity.showV1551HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1551husband
    FeaturePrefsStore.batch1551.v1551husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1551: hybrid mode
internal fun PlayerActivity.showV1551HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1551hybrid
    FeaturePrefsStore.batch1551.v1551hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1551: ice mode
internal fun PlayerActivity.showV1551IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1551ice
    FeaturePrefsStore.batch1551.v1551ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1551: idea mode
internal fun PlayerActivity.showV1551IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1551idea
    FeaturePrefsStore.batch1551.v1551idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1551: identify mode
internal fun PlayerActivity.showV1551IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1551identify
    FeaturePrefsStore.batch1551.v1551identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1551: impact level
internal fun PlayerActivity.showV1551ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1551: impose level
internal fun PlayerActivity.showV1551ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1551: improve level
internal fun PlayerActivity.showV1551ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1551: inch level
internal fun PlayerActivity.showV1551InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1551: include level
internal fun PlayerActivity.showV1551IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551include = value
        AppToast.show(this, "include: $value")
    }
}

// v1551: income mode
internal fun PlayerActivity.showV1551IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1551income
    FeaturePrefsStore.batch1551.v1551income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1551: indicate mode
internal fun PlayerActivity.showV1551IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1551indicate
    FeaturePrefsStore.batch1551.v1551indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1551: indoor mode
internal fun PlayerActivity.showV1551IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1551indoor
    FeaturePrefsStore.batch1551.v1551indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1551: industry mode
internal fun PlayerActivity.showV1551IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1551industry
    FeaturePrefsStore.batch1551.v1551industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1551: infant mode
internal fun PlayerActivity.showV1551InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1551infant
    FeaturePrefsStore.batch1551.v1551infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1552: husband mode
internal fun PlayerActivity.showV1552HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1552husband
    FeaturePrefsStore.batch1551.v1552husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1552: hybrid mode
internal fun PlayerActivity.showV1552HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1552hybrid
    FeaturePrefsStore.batch1551.v1552hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1552: ice mode
internal fun PlayerActivity.showV1552IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1552ice
    FeaturePrefsStore.batch1551.v1552ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1552: idea mode
internal fun PlayerActivity.showV1552IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1552idea
    FeaturePrefsStore.batch1551.v1552idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1552: identify mode
internal fun PlayerActivity.showV1552IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1552identify
    FeaturePrefsStore.batch1551.v1552identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1552: impact level
internal fun PlayerActivity.showV1552ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1552: impose level
internal fun PlayerActivity.showV1552ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1552: improve level
internal fun PlayerActivity.showV1552ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1552: inch level
internal fun PlayerActivity.showV1552InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1552: include level
internal fun PlayerActivity.showV1552IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552include = value
        AppToast.show(this, "include: $value")
    }
}

// v1552: income mode
internal fun PlayerActivity.showV1552IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1552income
    FeaturePrefsStore.batch1551.v1552income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1552: indicate mode
internal fun PlayerActivity.showV1552IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1552indicate
    FeaturePrefsStore.batch1551.v1552indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1552: indoor mode
internal fun PlayerActivity.showV1552IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1552indoor
    FeaturePrefsStore.batch1551.v1552indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1552: industry mode
internal fun PlayerActivity.showV1552IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1552industry
    FeaturePrefsStore.batch1551.v1552industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1552: infant mode
internal fun PlayerActivity.showV1552InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1552infant
    FeaturePrefsStore.batch1551.v1552infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1553: husband mode
internal fun PlayerActivity.showV1553HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1553husband
    FeaturePrefsStore.batch1551.v1553husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1553: hybrid mode
internal fun PlayerActivity.showV1553HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1553hybrid
    FeaturePrefsStore.batch1551.v1553hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1553: ice mode
internal fun PlayerActivity.showV1553IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1553ice
    FeaturePrefsStore.batch1551.v1553ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1553: idea mode
internal fun PlayerActivity.showV1553IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1553idea
    FeaturePrefsStore.batch1551.v1553idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1553: identify mode
internal fun PlayerActivity.showV1553IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1553identify
    FeaturePrefsStore.batch1551.v1553identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1553: impact level
internal fun PlayerActivity.showV1553ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1553: impose level
internal fun PlayerActivity.showV1553ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1553: improve level
internal fun PlayerActivity.showV1553ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1553: inch level
internal fun PlayerActivity.showV1553InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1553: include level
internal fun PlayerActivity.showV1553IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553include = value
        AppToast.show(this, "include: $value")
    }
}

// v1553: income mode
internal fun PlayerActivity.showV1553IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1553income
    FeaturePrefsStore.batch1551.v1553income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1553: indicate mode
internal fun PlayerActivity.showV1553IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1553indicate
    FeaturePrefsStore.batch1551.v1553indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1553: indoor mode
internal fun PlayerActivity.showV1553IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1553indoor
    FeaturePrefsStore.batch1551.v1553indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1553: industry mode
internal fun PlayerActivity.showV1553IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1553industry
    FeaturePrefsStore.batch1551.v1553industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1553: infant mode
internal fun PlayerActivity.showV1553InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1553infant
    FeaturePrefsStore.batch1551.v1553infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1554: husband mode
internal fun PlayerActivity.showV1554HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1554husband
    FeaturePrefsStore.batch1551.v1554husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1554: hybrid mode
internal fun PlayerActivity.showV1554HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1554hybrid
    FeaturePrefsStore.batch1551.v1554hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1554: ice mode
internal fun PlayerActivity.showV1554IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1554ice
    FeaturePrefsStore.batch1551.v1554ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1554: idea mode
internal fun PlayerActivity.showV1554IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1554idea
    FeaturePrefsStore.batch1551.v1554idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1554: identify mode
internal fun PlayerActivity.showV1554IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1554identify
    FeaturePrefsStore.batch1551.v1554identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1554: impact level
internal fun PlayerActivity.showV1554ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1554: impose level
internal fun PlayerActivity.showV1554ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1554: improve level
internal fun PlayerActivity.showV1554ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1554: inch level
internal fun PlayerActivity.showV1554InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1554: include level
internal fun PlayerActivity.showV1554IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554include = value
        AppToast.show(this, "include: $value")
    }
}

// v1554: income mode
internal fun PlayerActivity.showV1554IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1554income
    FeaturePrefsStore.batch1551.v1554income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1554: indicate mode
internal fun PlayerActivity.showV1554IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1554indicate
    FeaturePrefsStore.batch1551.v1554indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1554: indoor mode
internal fun PlayerActivity.showV1554IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1554indoor
    FeaturePrefsStore.batch1551.v1554indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1554: industry mode
internal fun PlayerActivity.showV1554IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1554industry
    FeaturePrefsStore.batch1551.v1554industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1554: infant mode
internal fun PlayerActivity.showV1554InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1554infant
    FeaturePrefsStore.batch1551.v1554infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1555: husband mode
internal fun PlayerActivity.showV1555HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1555husband
    FeaturePrefsStore.batch1551.v1555husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1555: hybrid mode
internal fun PlayerActivity.showV1555HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1555hybrid
    FeaturePrefsStore.batch1551.v1555hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1555: ice mode
internal fun PlayerActivity.showV1555IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1555ice
    FeaturePrefsStore.batch1551.v1555ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1555: idea mode
internal fun PlayerActivity.showV1555IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1555idea
    FeaturePrefsStore.batch1551.v1555idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1555: identify mode
internal fun PlayerActivity.showV1555IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1555identify
    FeaturePrefsStore.batch1551.v1555identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1555: impact level
internal fun PlayerActivity.showV1555ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1555: impose level
internal fun PlayerActivity.showV1555ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1555: improve level
internal fun PlayerActivity.showV1555ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1555: inch level
internal fun PlayerActivity.showV1555InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1555: include level
internal fun PlayerActivity.showV1555IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555include = value
        AppToast.show(this, "include: $value")
    }
}

// v1555: income mode
internal fun PlayerActivity.showV1555IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1555income
    FeaturePrefsStore.batch1551.v1555income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1555: indicate mode
internal fun PlayerActivity.showV1555IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1555indicate
    FeaturePrefsStore.batch1551.v1555indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1555: indoor mode
internal fun PlayerActivity.showV1555IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1555indoor
    FeaturePrefsStore.batch1551.v1555indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1555: industry mode
internal fun PlayerActivity.showV1555IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1555industry
    FeaturePrefsStore.batch1551.v1555industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1555: infant mode
internal fun PlayerActivity.showV1555InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1555infant
    FeaturePrefsStore.batch1551.v1555infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1556: husband mode
internal fun PlayerActivity.showV1556HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1556husband
    FeaturePrefsStore.batch1551.v1556husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1556: hybrid mode
internal fun PlayerActivity.showV1556HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1556hybrid
    FeaturePrefsStore.batch1551.v1556hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1556: ice mode
internal fun PlayerActivity.showV1556IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1556ice
    FeaturePrefsStore.batch1551.v1556ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1556: idea mode
internal fun PlayerActivity.showV1556IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1556idea
    FeaturePrefsStore.batch1551.v1556idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1556: identify mode
internal fun PlayerActivity.showV1556IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1556identify
    FeaturePrefsStore.batch1551.v1556identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1556: impact level
internal fun PlayerActivity.showV1556ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1556: impose level
internal fun PlayerActivity.showV1556ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1556: improve level
internal fun PlayerActivity.showV1556ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1556: inch level
internal fun PlayerActivity.showV1556InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1556: include level
internal fun PlayerActivity.showV1556IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556include = value
        AppToast.show(this, "include: $value")
    }
}

// v1556: income mode
internal fun PlayerActivity.showV1556IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1556income
    FeaturePrefsStore.batch1551.v1556income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1556: indicate mode
internal fun PlayerActivity.showV1556IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1556indicate
    FeaturePrefsStore.batch1551.v1556indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1556: indoor mode
internal fun PlayerActivity.showV1556IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1556indoor
    FeaturePrefsStore.batch1551.v1556indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1556: industry mode
internal fun PlayerActivity.showV1556IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1556industry
    FeaturePrefsStore.batch1551.v1556industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1556: infant mode
internal fun PlayerActivity.showV1556InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1556infant
    FeaturePrefsStore.batch1551.v1556infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1557: husband mode
internal fun PlayerActivity.showV1557HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1557husband
    FeaturePrefsStore.batch1551.v1557husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1557: hybrid mode
internal fun PlayerActivity.showV1557HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1557hybrid
    FeaturePrefsStore.batch1551.v1557hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1557: ice mode
internal fun PlayerActivity.showV1557IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1557ice
    FeaturePrefsStore.batch1551.v1557ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1557: idea mode
internal fun PlayerActivity.showV1557IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1557idea
    FeaturePrefsStore.batch1551.v1557idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1557: identify mode
internal fun PlayerActivity.showV1557IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1557identify
    FeaturePrefsStore.batch1551.v1557identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1557: impact level
internal fun PlayerActivity.showV1557ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1557: impose level
internal fun PlayerActivity.showV1557ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1557: improve level
internal fun PlayerActivity.showV1557ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1557: inch level
internal fun PlayerActivity.showV1557InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1557: include level
internal fun PlayerActivity.showV1557IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557include = value
        AppToast.show(this, "include: $value")
    }
}

// v1557: income mode
internal fun PlayerActivity.showV1557IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1557income
    FeaturePrefsStore.batch1551.v1557income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1557: indicate mode
internal fun PlayerActivity.showV1557IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1557indicate
    FeaturePrefsStore.batch1551.v1557indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1557: indoor mode
internal fun PlayerActivity.showV1557IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1557indoor
    FeaturePrefsStore.batch1551.v1557indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1557: industry mode
internal fun PlayerActivity.showV1557IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1557industry
    FeaturePrefsStore.batch1551.v1557industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1557: infant mode
internal fun PlayerActivity.showV1557InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1557infant
    FeaturePrefsStore.batch1551.v1557infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1558: husband mode
internal fun PlayerActivity.showV1558HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1558husband
    FeaturePrefsStore.batch1551.v1558husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1558: hybrid mode
internal fun PlayerActivity.showV1558HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1558hybrid
    FeaturePrefsStore.batch1551.v1558hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1558: ice mode
internal fun PlayerActivity.showV1558IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1558ice
    FeaturePrefsStore.batch1551.v1558ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1558: idea mode
internal fun PlayerActivity.showV1558IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1558idea
    FeaturePrefsStore.batch1551.v1558idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1558: identify mode
internal fun PlayerActivity.showV1558IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1558identify
    FeaturePrefsStore.batch1551.v1558identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1558: impact level
internal fun PlayerActivity.showV1558ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1558: impose level
internal fun PlayerActivity.showV1558ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1558: improve level
internal fun PlayerActivity.showV1558ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1558: inch level
internal fun PlayerActivity.showV1558InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1558: include level
internal fun PlayerActivity.showV1558IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558include = value
        AppToast.show(this, "include: $value")
    }
}

// v1558: income mode
internal fun PlayerActivity.showV1558IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1558income
    FeaturePrefsStore.batch1551.v1558income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1558: indicate mode
internal fun PlayerActivity.showV1558IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1558indicate
    FeaturePrefsStore.batch1551.v1558indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1558: indoor mode
internal fun PlayerActivity.showV1558IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1558indoor
    FeaturePrefsStore.batch1551.v1558indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1558: industry mode
internal fun PlayerActivity.showV1558IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1558industry
    FeaturePrefsStore.batch1551.v1558industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1558: infant mode
internal fun PlayerActivity.showV1558InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1558infant
    FeaturePrefsStore.batch1551.v1558infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1559: husband mode
internal fun PlayerActivity.showV1559HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1559husband
    FeaturePrefsStore.batch1551.v1559husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1559: hybrid mode
internal fun PlayerActivity.showV1559HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1559hybrid
    FeaturePrefsStore.batch1551.v1559hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1559: ice mode
internal fun PlayerActivity.showV1559IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1559ice
    FeaturePrefsStore.batch1551.v1559ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1559: idea mode
internal fun PlayerActivity.showV1559IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1559idea
    FeaturePrefsStore.batch1551.v1559idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1559: identify mode
internal fun PlayerActivity.showV1559IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1559identify
    FeaturePrefsStore.batch1551.v1559identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1559: impact level
internal fun PlayerActivity.showV1559ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1559: impose level
internal fun PlayerActivity.showV1559ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1559: improve level
internal fun PlayerActivity.showV1559ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1559: inch level
internal fun PlayerActivity.showV1559InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1559: include level
internal fun PlayerActivity.showV1559IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559include = value
        AppToast.show(this, "include: $value")
    }
}

// v1559: income mode
internal fun PlayerActivity.showV1559IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1559income
    FeaturePrefsStore.batch1551.v1559income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1559: indicate mode
internal fun PlayerActivity.showV1559IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1559indicate
    FeaturePrefsStore.batch1551.v1559indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1559: indoor mode
internal fun PlayerActivity.showV1559IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1559indoor
    FeaturePrefsStore.batch1551.v1559indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1559: industry mode
internal fun PlayerActivity.showV1559IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1559industry
    FeaturePrefsStore.batch1551.v1559industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1559: infant mode
internal fun PlayerActivity.showV1559InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1559infant
    FeaturePrefsStore.batch1551.v1559infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1560: husband mode
internal fun PlayerActivity.showV1560HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1560husband
    FeaturePrefsStore.batch1551.v1560husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1560: hybrid mode
internal fun PlayerActivity.showV1560HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1560hybrid
    FeaturePrefsStore.batch1551.v1560hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1560: ice mode
internal fun PlayerActivity.showV1560IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1560ice
    FeaturePrefsStore.batch1551.v1560ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1560: idea mode
internal fun PlayerActivity.showV1560IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1560idea
    FeaturePrefsStore.batch1551.v1560idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1560: identify mode
internal fun PlayerActivity.showV1560IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1560identify
    FeaturePrefsStore.batch1551.v1560identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1560: impact level
internal fun PlayerActivity.showV1560ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1560: impose level
internal fun PlayerActivity.showV1560ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1560: improve level
internal fun PlayerActivity.showV1560ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1560: inch level
internal fun PlayerActivity.showV1560InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1560: include level
internal fun PlayerActivity.showV1560IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560include = value
        AppToast.show(this, "include: $value")
    }
}

// v1560: income mode
internal fun PlayerActivity.showV1560IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1560income
    FeaturePrefsStore.batch1551.v1560income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1560: indicate mode
internal fun PlayerActivity.showV1560IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1560indicate
    FeaturePrefsStore.batch1551.v1560indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1560: indoor mode
internal fun PlayerActivity.showV1560IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1560indoor
    FeaturePrefsStore.batch1551.v1560indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1560: industry mode
internal fun PlayerActivity.showV1560IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1560industry
    FeaturePrefsStore.batch1551.v1560industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1560: infant mode
internal fun PlayerActivity.showV1560InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1560infant
    FeaturePrefsStore.batch1551.v1560infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1561: inflict mode
internal fun PlayerActivity.showV1561InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inflict
    FeaturePrefsStore.batch1561.v1561inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1561: inform mode
internal fun PlayerActivity.showV1561InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inform
    FeaturePrefsStore.batch1561.v1561inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1561: initial mode
internal fun PlayerActivity.showV1561InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1561initial
    FeaturePrefsStore.batch1561.v1561initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1561: inject mode
internal fun PlayerActivity.showV1561InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inject
    FeaturePrefsStore.batch1561.v1561inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1561: inmate mode
internal fun PlayerActivity.showV1561InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inmate
    FeaturePrefsStore.batch1561.v1561inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1561: inner level
internal fun PlayerActivity.showV1561InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1561: innocent level
internal fun PlayerActivity.showV1561InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1561: inquiry level
internal fun PlayerActivity.showV1561InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1561: insight level
internal fun PlayerActivity.showV1561InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1561: inspire level
internal fun PlayerActivity.showV1561InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1561: intact mode
internal fun PlayerActivity.showV1561IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1561intact
    FeaturePrefsStore.batch1561.v1561intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1561: interest mode
internal fun PlayerActivity.showV1561InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1561interest
    FeaturePrefsStore.batch1561.v1561interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1561: into mode
internal fun PlayerActivity.showV1561IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1561into
    FeaturePrefsStore.batch1561.v1561into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1561: invest mode
internal fun PlayerActivity.showV1561InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1561invest
    FeaturePrefsStore.batch1561.v1561invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1561: invite mode
internal fun PlayerActivity.showV1561InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1561invite
    FeaturePrefsStore.batch1561.v1561invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1562: inflict mode
internal fun PlayerActivity.showV1562InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inflict
    FeaturePrefsStore.batch1561.v1562inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1562: inform mode
internal fun PlayerActivity.showV1562InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inform
    FeaturePrefsStore.batch1561.v1562inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1562: initial mode
internal fun PlayerActivity.showV1562InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1562initial
    FeaturePrefsStore.batch1561.v1562initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1562: inject mode
internal fun PlayerActivity.showV1562InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inject
    FeaturePrefsStore.batch1561.v1562inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1562: inmate mode
internal fun PlayerActivity.showV1562InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inmate
    FeaturePrefsStore.batch1561.v1562inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1562: inner level
internal fun PlayerActivity.showV1562InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1562: innocent level
internal fun PlayerActivity.showV1562InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1562: inquiry level
internal fun PlayerActivity.showV1562InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1562: insight level
internal fun PlayerActivity.showV1562InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1562: inspire level
internal fun PlayerActivity.showV1562InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1562: intact mode
internal fun PlayerActivity.showV1562IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1562intact
    FeaturePrefsStore.batch1561.v1562intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1562: interest mode
internal fun PlayerActivity.showV1562InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1562interest
    FeaturePrefsStore.batch1561.v1562interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1562: into mode
internal fun PlayerActivity.showV1562IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1562into
    FeaturePrefsStore.batch1561.v1562into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1562: invest mode
internal fun PlayerActivity.showV1562InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1562invest
    FeaturePrefsStore.batch1561.v1562invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1562: invite mode
internal fun PlayerActivity.showV1562InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1562invite
    FeaturePrefsStore.batch1561.v1562invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1563: inflict mode
internal fun PlayerActivity.showV1563InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inflict
    FeaturePrefsStore.batch1561.v1563inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1563: inform mode
internal fun PlayerActivity.showV1563InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inform
    FeaturePrefsStore.batch1561.v1563inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1563: initial mode
internal fun PlayerActivity.showV1563InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1563initial
    FeaturePrefsStore.batch1561.v1563initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1563: inject mode
internal fun PlayerActivity.showV1563InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inject
    FeaturePrefsStore.batch1561.v1563inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1563: inmate mode
internal fun PlayerActivity.showV1563InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inmate
    FeaturePrefsStore.batch1561.v1563inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1563: inner level
internal fun PlayerActivity.showV1563InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1563: innocent level
internal fun PlayerActivity.showV1563InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1563: inquiry level
internal fun PlayerActivity.showV1563InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1563: insight level
internal fun PlayerActivity.showV1563InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1563: inspire level
internal fun PlayerActivity.showV1563InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1563: intact mode
internal fun PlayerActivity.showV1563IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1563intact
    FeaturePrefsStore.batch1561.v1563intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1563: interest mode
internal fun PlayerActivity.showV1563InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1563interest
    FeaturePrefsStore.batch1561.v1563interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1563: into mode
internal fun PlayerActivity.showV1563IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1563into
    FeaturePrefsStore.batch1561.v1563into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1563: invest mode
internal fun PlayerActivity.showV1563InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1563invest
    FeaturePrefsStore.batch1561.v1563invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1563: invite mode
internal fun PlayerActivity.showV1563InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1563invite
    FeaturePrefsStore.batch1561.v1563invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1564: inflict mode
internal fun PlayerActivity.showV1564InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inflict
    FeaturePrefsStore.batch1561.v1564inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1564: inform mode
internal fun PlayerActivity.showV1564InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inform
    FeaturePrefsStore.batch1561.v1564inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1564: initial mode
internal fun PlayerActivity.showV1564InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1564initial
    FeaturePrefsStore.batch1561.v1564initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1564: inject mode
internal fun PlayerActivity.showV1564InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inject
    FeaturePrefsStore.batch1561.v1564inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1564: inmate mode
internal fun PlayerActivity.showV1564InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inmate
    FeaturePrefsStore.batch1561.v1564inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1564: inner level
internal fun PlayerActivity.showV1564InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1564: innocent level
internal fun PlayerActivity.showV1564InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1564: inquiry level
internal fun PlayerActivity.showV1564InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1564: insight level
internal fun PlayerActivity.showV1564InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1564: inspire level
internal fun PlayerActivity.showV1564InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1564: intact mode
internal fun PlayerActivity.showV1564IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1564intact
    FeaturePrefsStore.batch1561.v1564intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1564: interest mode
internal fun PlayerActivity.showV1564InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1564interest
    FeaturePrefsStore.batch1561.v1564interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1564: into mode
internal fun PlayerActivity.showV1564IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1564into
    FeaturePrefsStore.batch1561.v1564into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1564: invest mode
internal fun PlayerActivity.showV1564InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1564invest
    FeaturePrefsStore.batch1561.v1564invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1564: invite mode
internal fun PlayerActivity.showV1564InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1564invite
    FeaturePrefsStore.batch1561.v1564invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1565: inflict mode
internal fun PlayerActivity.showV1565InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inflict
    FeaturePrefsStore.batch1561.v1565inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1565: inform mode
internal fun PlayerActivity.showV1565InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inform
    FeaturePrefsStore.batch1561.v1565inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1565: initial mode
internal fun PlayerActivity.showV1565InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1565initial
    FeaturePrefsStore.batch1561.v1565initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1565: inject mode
internal fun PlayerActivity.showV1565InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inject
    FeaturePrefsStore.batch1561.v1565inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1565: inmate mode
internal fun PlayerActivity.showV1565InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inmate
    FeaturePrefsStore.batch1561.v1565inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1565: inner level
internal fun PlayerActivity.showV1565InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1565: innocent level
internal fun PlayerActivity.showV1565InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1565: inquiry level
internal fun PlayerActivity.showV1565InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1565: insight level
internal fun PlayerActivity.showV1565InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1565: inspire level
internal fun PlayerActivity.showV1565InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1565: intact mode
internal fun PlayerActivity.showV1565IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1565intact
    FeaturePrefsStore.batch1561.v1565intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1565: interest mode
internal fun PlayerActivity.showV1565InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1565interest
    FeaturePrefsStore.batch1561.v1565interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1565: into mode
internal fun PlayerActivity.showV1565IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1565into
    FeaturePrefsStore.batch1561.v1565into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1565: invest mode
internal fun PlayerActivity.showV1565InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1565invest
    FeaturePrefsStore.batch1561.v1565invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1565: invite mode
internal fun PlayerActivity.showV1565InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1565invite
    FeaturePrefsStore.batch1561.v1565invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1566: inflict mode
internal fun PlayerActivity.showV1566InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inflict
    FeaturePrefsStore.batch1561.v1566inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1566: inform mode
internal fun PlayerActivity.showV1566InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inform
    FeaturePrefsStore.batch1561.v1566inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1566: initial mode
internal fun PlayerActivity.showV1566InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1566initial
    FeaturePrefsStore.batch1561.v1566initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1566: inject mode
internal fun PlayerActivity.showV1566InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inject
    FeaturePrefsStore.batch1561.v1566inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1566: inmate mode
internal fun PlayerActivity.showV1566InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inmate
    FeaturePrefsStore.batch1561.v1566inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1566: inner level
internal fun PlayerActivity.showV1566InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1566: innocent level
internal fun PlayerActivity.showV1566InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1566: inquiry level
internal fun PlayerActivity.showV1566InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1566: insight level
internal fun PlayerActivity.showV1566InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1566: inspire level
internal fun PlayerActivity.showV1566InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1566: intact mode
internal fun PlayerActivity.showV1566IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1566intact
    FeaturePrefsStore.batch1561.v1566intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1566: interest mode
internal fun PlayerActivity.showV1566InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1566interest
    FeaturePrefsStore.batch1561.v1566interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1566: into mode
internal fun PlayerActivity.showV1566IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1566into
    FeaturePrefsStore.batch1561.v1566into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1566: invest mode
internal fun PlayerActivity.showV1566InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1566invest
    FeaturePrefsStore.batch1561.v1566invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1566: invite mode
internal fun PlayerActivity.showV1566InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1566invite
    FeaturePrefsStore.batch1561.v1566invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1567: inflict mode
internal fun PlayerActivity.showV1567InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inflict
    FeaturePrefsStore.batch1561.v1567inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1567: inform mode
internal fun PlayerActivity.showV1567InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inform
    FeaturePrefsStore.batch1561.v1567inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1567: initial mode
internal fun PlayerActivity.showV1567InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1567initial
    FeaturePrefsStore.batch1561.v1567initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1567: inject mode
internal fun PlayerActivity.showV1567InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inject
    FeaturePrefsStore.batch1561.v1567inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1567: inmate mode
internal fun PlayerActivity.showV1567InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inmate
    FeaturePrefsStore.batch1561.v1567inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1567: inner level
internal fun PlayerActivity.showV1567InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1567: innocent level
internal fun PlayerActivity.showV1567InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1567: inquiry level
internal fun PlayerActivity.showV1567InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1567: insight level
internal fun PlayerActivity.showV1567InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1567: inspire level
internal fun PlayerActivity.showV1567InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1567: intact mode
internal fun PlayerActivity.showV1567IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1567intact
    FeaturePrefsStore.batch1561.v1567intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1567: interest mode
internal fun PlayerActivity.showV1567InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1567interest
    FeaturePrefsStore.batch1561.v1567interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1567: into mode
internal fun PlayerActivity.showV1567IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1567into
    FeaturePrefsStore.batch1561.v1567into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1567: invest mode
internal fun PlayerActivity.showV1567InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1567invest
    FeaturePrefsStore.batch1561.v1567invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1567: invite mode
internal fun PlayerActivity.showV1567InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1567invite
    FeaturePrefsStore.batch1561.v1567invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1568: inflict mode
internal fun PlayerActivity.showV1568InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inflict
    FeaturePrefsStore.batch1561.v1568inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1568: inform mode
internal fun PlayerActivity.showV1568InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inform
    FeaturePrefsStore.batch1561.v1568inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1568: initial mode
internal fun PlayerActivity.showV1568InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1568initial
    FeaturePrefsStore.batch1561.v1568initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1568: inject mode
internal fun PlayerActivity.showV1568InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inject
    FeaturePrefsStore.batch1561.v1568inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1568: inmate mode
internal fun PlayerActivity.showV1568InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inmate
    FeaturePrefsStore.batch1561.v1568inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1568: inner level
internal fun PlayerActivity.showV1568InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1568: innocent level
internal fun PlayerActivity.showV1568InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1568: inquiry level
internal fun PlayerActivity.showV1568InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1568: insight level
internal fun PlayerActivity.showV1568InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1568: inspire level
internal fun PlayerActivity.showV1568InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1568: intact mode
internal fun PlayerActivity.showV1568IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1568intact
    FeaturePrefsStore.batch1561.v1568intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1568: interest mode
internal fun PlayerActivity.showV1568InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1568interest
    FeaturePrefsStore.batch1561.v1568interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1568: into mode
internal fun PlayerActivity.showV1568IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1568into
    FeaturePrefsStore.batch1561.v1568into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1568: invest mode
internal fun PlayerActivity.showV1568InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1568invest
    FeaturePrefsStore.batch1561.v1568invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1568: invite mode
internal fun PlayerActivity.showV1568InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1568invite
    FeaturePrefsStore.batch1561.v1568invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1569: inflict mode
internal fun PlayerActivity.showV1569InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inflict
    FeaturePrefsStore.batch1561.v1569inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1569: inform mode
internal fun PlayerActivity.showV1569InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inform
    FeaturePrefsStore.batch1561.v1569inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1569: initial mode
internal fun PlayerActivity.showV1569InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1569initial
    FeaturePrefsStore.batch1561.v1569initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1569: inject mode
internal fun PlayerActivity.showV1569InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inject
    FeaturePrefsStore.batch1561.v1569inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1569: inmate mode
internal fun PlayerActivity.showV1569InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inmate
    FeaturePrefsStore.batch1561.v1569inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1569: inner level
internal fun PlayerActivity.showV1569InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1569: innocent level
internal fun PlayerActivity.showV1569InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1569: inquiry level
internal fun PlayerActivity.showV1569InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1569: insight level
internal fun PlayerActivity.showV1569InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1569: inspire level
internal fun PlayerActivity.showV1569InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1569: intact mode
internal fun PlayerActivity.showV1569IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1569intact
    FeaturePrefsStore.batch1561.v1569intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1569: interest mode
internal fun PlayerActivity.showV1569InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1569interest
    FeaturePrefsStore.batch1561.v1569interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1569: into mode
internal fun PlayerActivity.showV1569IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1569into
    FeaturePrefsStore.batch1561.v1569into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1569: invest mode
internal fun PlayerActivity.showV1569InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1569invest
    FeaturePrefsStore.batch1561.v1569invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1569: invite mode
internal fun PlayerActivity.showV1569InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1569invite
    FeaturePrefsStore.batch1561.v1569invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1570: inflict mode
internal fun PlayerActivity.showV1570InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inflict
    FeaturePrefsStore.batch1561.v1570inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1570: inform mode
internal fun PlayerActivity.showV1570InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inform
    FeaturePrefsStore.batch1561.v1570inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1570: initial mode
internal fun PlayerActivity.showV1570InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1570initial
    FeaturePrefsStore.batch1561.v1570initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1570: inject mode
internal fun PlayerActivity.showV1570InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inject
    FeaturePrefsStore.batch1561.v1570inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1570: inmate mode
internal fun PlayerActivity.showV1570InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inmate
    FeaturePrefsStore.batch1561.v1570inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1570: inner level
internal fun PlayerActivity.showV1570InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1570: innocent level
internal fun PlayerActivity.showV1570InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1570: inquiry level
internal fun PlayerActivity.showV1570InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1570: insight level
internal fun PlayerActivity.showV1570InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1570: inspire level
internal fun PlayerActivity.showV1570InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1570: intact mode
internal fun PlayerActivity.showV1570IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1570intact
    FeaturePrefsStore.batch1561.v1570intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1570: interest mode
internal fun PlayerActivity.showV1570InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1570interest
    FeaturePrefsStore.batch1561.v1570interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1570: into mode
internal fun PlayerActivity.showV1570IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1570into
    FeaturePrefsStore.batch1561.v1570into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1570: invest mode
internal fun PlayerActivity.showV1570InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1570invest
    FeaturePrefsStore.batch1561.v1570invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1570: invite mode
internal fun PlayerActivity.showV1570InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1570invite
    FeaturePrefsStore.batch1561.v1570invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}
