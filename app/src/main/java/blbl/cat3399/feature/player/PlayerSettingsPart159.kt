package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

