package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1571: involve mode
internal fun PlayerActivity.showV1571InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1571involve
    FeaturePrefsStore.batch1571.v1571involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1571: iron mode
internal fun PlayerActivity.showV1571IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1571iron
    FeaturePrefsStore.batch1571.v1571iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1571: island mode
internal fun PlayerActivity.showV1571IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1571island
    FeaturePrefsStore.batch1571.v1571island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1571: isolate mode
internal fun PlayerActivity.showV1571IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1571isolate
    FeaturePrefsStore.batch1571.v1571isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1571: issue mode
internal fun PlayerActivity.showV1571IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1571issue
    FeaturePrefsStore.batch1571.v1571issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1571: jacket level
internal fun PlayerActivity.showV1571JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1571jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1571jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1571: jaguar level
internal fun PlayerActivity.showV1571JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1571jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1571jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1571: jazz level
internal fun PlayerActivity.showV1571JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1571jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1571jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1571: jealous level
internal fun PlayerActivity.showV1571JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1571jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1571jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1571: jelly level
internal fun PlayerActivity.showV1571JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1571jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1571jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1571: jewel mode
internal fun PlayerActivity.showV1571JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1571jewel
    FeaturePrefsStore.batch1571.v1571jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1571: job mode
internal fun PlayerActivity.showV1571JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1571job
    FeaturePrefsStore.batch1571.v1571job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1571: jog mode
internal fun PlayerActivity.showV1571JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1571jog
    FeaturePrefsStore.batch1571.v1571jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1571: joke mode
internal fun PlayerActivity.showV1571JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1571joke
    FeaturePrefsStore.batch1571.v1571joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1571: judge mode
internal fun PlayerActivity.showV1571JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1571judge
    FeaturePrefsStore.batch1571.v1571judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1572: involve mode
internal fun PlayerActivity.showV1572InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1572involve
    FeaturePrefsStore.batch1571.v1572involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1572: iron mode
internal fun PlayerActivity.showV1572IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1572iron
    FeaturePrefsStore.batch1571.v1572iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1572: island mode
internal fun PlayerActivity.showV1572IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1572island
    FeaturePrefsStore.batch1571.v1572island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1572: isolate mode
internal fun PlayerActivity.showV1572IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1572isolate
    FeaturePrefsStore.batch1571.v1572isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1572: issue mode
internal fun PlayerActivity.showV1572IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1572issue
    FeaturePrefsStore.batch1571.v1572issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1572: jacket level
internal fun PlayerActivity.showV1572JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1572jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1572jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1572: jaguar level
internal fun PlayerActivity.showV1572JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1572jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1572jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1572: jazz level
internal fun PlayerActivity.showV1572JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1572jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1572jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1572: jealous level
internal fun PlayerActivity.showV1572JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1572jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1572jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1572: jelly level
internal fun PlayerActivity.showV1572JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1572jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1572jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1572: jewel mode
internal fun PlayerActivity.showV1572JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1572jewel
    FeaturePrefsStore.batch1571.v1572jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1572: job mode
internal fun PlayerActivity.showV1572JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1572job
    FeaturePrefsStore.batch1571.v1572job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1572: jog mode
internal fun PlayerActivity.showV1572JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1572jog
    FeaturePrefsStore.batch1571.v1572jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1572: joke mode
internal fun PlayerActivity.showV1572JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1572joke
    FeaturePrefsStore.batch1571.v1572joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1572: judge mode
internal fun PlayerActivity.showV1572JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1572judge
    FeaturePrefsStore.batch1571.v1572judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1573: involve mode
internal fun PlayerActivity.showV1573InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1573involve
    FeaturePrefsStore.batch1571.v1573involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1573: iron mode
internal fun PlayerActivity.showV1573IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1573iron
    FeaturePrefsStore.batch1571.v1573iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1573: island mode
internal fun PlayerActivity.showV1573IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1573island
    FeaturePrefsStore.batch1571.v1573island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1573: isolate mode
internal fun PlayerActivity.showV1573IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1573isolate
    FeaturePrefsStore.batch1571.v1573isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1573: issue mode
internal fun PlayerActivity.showV1573IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1573issue
    FeaturePrefsStore.batch1571.v1573issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1573: jacket level
internal fun PlayerActivity.showV1573JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1573jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1573jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1573: jaguar level
internal fun PlayerActivity.showV1573JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1573jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1573jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1573: jazz level
internal fun PlayerActivity.showV1573JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1573jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1573jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1573: jealous level
internal fun PlayerActivity.showV1573JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1573jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1573jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1573: jelly level
internal fun PlayerActivity.showV1573JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1573jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1573jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1573: jewel mode
internal fun PlayerActivity.showV1573JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1573jewel
    FeaturePrefsStore.batch1571.v1573jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1573: job mode
internal fun PlayerActivity.showV1573JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1573job
    FeaturePrefsStore.batch1571.v1573job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1573: jog mode
internal fun PlayerActivity.showV1573JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1573jog
    FeaturePrefsStore.batch1571.v1573jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1573: joke mode
internal fun PlayerActivity.showV1573JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1573joke
    FeaturePrefsStore.batch1571.v1573joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1573: judge mode
internal fun PlayerActivity.showV1573JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1573judge
    FeaturePrefsStore.batch1571.v1573judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1574: involve mode
internal fun PlayerActivity.showV1574InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1574involve
    FeaturePrefsStore.batch1571.v1574involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1574: iron mode
internal fun PlayerActivity.showV1574IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1574iron
    FeaturePrefsStore.batch1571.v1574iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1574: island mode
internal fun PlayerActivity.showV1574IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1574island
    FeaturePrefsStore.batch1571.v1574island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1574: isolate mode
internal fun PlayerActivity.showV1574IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1574isolate
    FeaturePrefsStore.batch1571.v1574isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1574: issue mode
internal fun PlayerActivity.showV1574IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1574issue
    FeaturePrefsStore.batch1571.v1574issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1574: jacket level
internal fun PlayerActivity.showV1574JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1574jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1574jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1574: jaguar level
internal fun PlayerActivity.showV1574JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1574jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1574jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1574: jazz level
internal fun PlayerActivity.showV1574JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1574jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1574jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1574: jealous level
internal fun PlayerActivity.showV1574JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1574jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1574jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1574: jelly level
internal fun PlayerActivity.showV1574JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1574jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1574jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1574: jewel mode
internal fun PlayerActivity.showV1574JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1574jewel
    FeaturePrefsStore.batch1571.v1574jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1574: job mode
internal fun PlayerActivity.showV1574JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1574job
    FeaturePrefsStore.batch1571.v1574job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1574: jog mode
internal fun PlayerActivity.showV1574JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1574jog
    FeaturePrefsStore.batch1571.v1574jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1574: joke mode
internal fun PlayerActivity.showV1574JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1574joke
    FeaturePrefsStore.batch1571.v1574joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1574: judge mode
internal fun PlayerActivity.showV1574JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1574judge
    FeaturePrefsStore.batch1571.v1574judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1575: involve mode
internal fun PlayerActivity.showV1575InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1575involve
    FeaturePrefsStore.batch1571.v1575involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1575: iron mode
internal fun PlayerActivity.showV1575IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1575iron
    FeaturePrefsStore.batch1571.v1575iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1575: island mode
internal fun PlayerActivity.showV1575IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1575island
    FeaturePrefsStore.batch1571.v1575island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1575: isolate mode
internal fun PlayerActivity.showV1575IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1575isolate
    FeaturePrefsStore.batch1571.v1575isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1575: issue mode
internal fun PlayerActivity.showV1575IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1575issue
    FeaturePrefsStore.batch1571.v1575issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1575: jacket level
internal fun PlayerActivity.showV1575JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1575jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1575jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1575: jaguar level
internal fun PlayerActivity.showV1575JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1575jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1575jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1575: jazz level
internal fun PlayerActivity.showV1575JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1575jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1575jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1575: jealous level
internal fun PlayerActivity.showV1575JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1575jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1575jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1575: jelly level
internal fun PlayerActivity.showV1575JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1575jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1575jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1575: jewel mode
internal fun PlayerActivity.showV1575JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1575jewel
    FeaturePrefsStore.batch1571.v1575jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1575: job mode
internal fun PlayerActivity.showV1575JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1575job
    FeaturePrefsStore.batch1571.v1575job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1575: jog mode
internal fun PlayerActivity.showV1575JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1575jog
    FeaturePrefsStore.batch1571.v1575jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1575: joke mode
internal fun PlayerActivity.showV1575JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1575joke
    FeaturePrefsStore.batch1571.v1575joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1575: judge mode
internal fun PlayerActivity.showV1575JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1575judge
    FeaturePrefsStore.batch1571.v1575judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1576: involve mode
internal fun PlayerActivity.showV1576InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1576involve
    FeaturePrefsStore.batch1571.v1576involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1576: iron mode
internal fun PlayerActivity.showV1576IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1576iron
    FeaturePrefsStore.batch1571.v1576iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1576: island mode
internal fun PlayerActivity.showV1576IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1576island
    FeaturePrefsStore.batch1571.v1576island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1576: isolate mode
internal fun PlayerActivity.showV1576IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1576isolate
    FeaturePrefsStore.batch1571.v1576isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1576: issue mode
internal fun PlayerActivity.showV1576IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1576issue
    FeaturePrefsStore.batch1571.v1576issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1576: jacket level
internal fun PlayerActivity.showV1576JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1576jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1576jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1576: jaguar level
internal fun PlayerActivity.showV1576JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1576jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1576jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1576: jazz level
internal fun PlayerActivity.showV1576JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1576jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1576jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1576: jealous level
internal fun PlayerActivity.showV1576JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1576jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1576jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1576: jelly level
internal fun PlayerActivity.showV1576JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1576jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1576jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1576: jewel mode
internal fun PlayerActivity.showV1576JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1576jewel
    FeaturePrefsStore.batch1571.v1576jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1576: job mode
internal fun PlayerActivity.showV1576JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1576job
    FeaturePrefsStore.batch1571.v1576job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1576: jog mode
internal fun PlayerActivity.showV1576JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1576jog
    FeaturePrefsStore.batch1571.v1576jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1576: joke mode
internal fun PlayerActivity.showV1576JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1576joke
    FeaturePrefsStore.batch1571.v1576joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1576: judge mode
internal fun PlayerActivity.showV1576JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1576judge
    FeaturePrefsStore.batch1571.v1576judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1577: involve mode
internal fun PlayerActivity.showV1577InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1577involve
    FeaturePrefsStore.batch1571.v1577involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1577: iron mode
internal fun PlayerActivity.showV1577IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1577iron
    FeaturePrefsStore.batch1571.v1577iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1577: island mode
internal fun PlayerActivity.showV1577IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1577island
    FeaturePrefsStore.batch1571.v1577island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1577: isolate mode
internal fun PlayerActivity.showV1577IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1577isolate
    FeaturePrefsStore.batch1571.v1577isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1577: issue mode
internal fun PlayerActivity.showV1577IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1577issue
    FeaturePrefsStore.batch1571.v1577issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1577: jacket level
internal fun PlayerActivity.showV1577JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1577jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1577jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1577: jaguar level
internal fun PlayerActivity.showV1577JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1577jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1577jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1577: jazz level
internal fun PlayerActivity.showV1577JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1577jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1577jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1577: jealous level
internal fun PlayerActivity.showV1577JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1577jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1577jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1577: jelly level
internal fun PlayerActivity.showV1577JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1577jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1577jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1577: jewel mode
internal fun PlayerActivity.showV1577JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1577jewel
    FeaturePrefsStore.batch1571.v1577jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1577: job mode
internal fun PlayerActivity.showV1577JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1577job
    FeaturePrefsStore.batch1571.v1577job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1577: jog mode
internal fun PlayerActivity.showV1577JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1577jog
    FeaturePrefsStore.batch1571.v1577jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1577: joke mode
internal fun PlayerActivity.showV1577JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1577joke
    FeaturePrefsStore.batch1571.v1577joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1577: judge mode
internal fun PlayerActivity.showV1577JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1577judge
    FeaturePrefsStore.batch1571.v1577judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1578: involve mode
internal fun PlayerActivity.showV1578InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1578involve
    FeaturePrefsStore.batch1571.v1578involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1578: iron mode
internal fun PlayerActivity.showV1578IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1578iron
    FeaturePrefsStore.batch1571.v1578iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1578: island mode
internal fun PlayerActivity.showV1578IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1578island
    FeaturePrefsStore.batch1571.v1578island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1578: isolate mode
internal fun PlayerActivity.showV1578IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1578isolate
    FeaturePrefsStore.batch1571.v1578isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1578: issue mode
internal fun PlayerActivity.showV1578IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1578issue
    FeaturePrefsStore.batch1571.v1578issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1578: jacket level
internal fun PlayerActivity.showV1578JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1578jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1578jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1578: jaguar level
internal fun PlayerActivity.showV1578JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1578jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1578jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1578: jazz level
internal fun PlayerActivity.showV1578JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1578jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1578jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1578: jealous level
internal fun PlayerActivity.showV1578JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1578jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1578jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1578: jelly level
internal fun PlayerActivity.showV1578JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1578jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1578jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1578: jewel mode
internal fun PlayerActivity.showV1578JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1578jewel
    FeaturePrefsStore.batch1571.v1578jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1578: job mode
internal fun PlayerActivity.showV1578JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1578job
    FeaturePrefsStore.batch1571.v1578job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1578: jog mode
internal fun PlayerActivity.showV1578JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1578jog
    FeaturePrefsStore.batch1571.v1578jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1578: joke mode
internal fun PlayerActivity.showV1578JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1578joke
    FeaturePrefsStore.batch1571.v1578joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1578: judge mode
internal fun PlayerActivity.showV1578JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1578judge
    FeaturePrefsStore.batch1571.v1578judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1579: involve mode
internal fun PlayerActivity.showV1579InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1579involve
    FeaturePrefsStore.batch1571.v1579involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1579: iron mode
internal fun PlayerActivity.showV1579IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1579iron
    FeaturePrefsStore.batch1571.v1579iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1579: island mode
internal fun PlayerActivity.showV1579IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1579island
    FeaturePrefsStore.batch1571.v1579island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1579: isolate mode
internal fun PlayerActivity.showV1579IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1579isolate
    FeaturePrefsStore.batch1571.v1579isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1579: issue mode
internal fun PlayerActivity.showV1579IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1579issue
    FeaturePrefsStore.batch1571.v1579issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1579: jacket level
internal fun PlayerActivity.showV1579JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1579jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1579jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1579: jaguar level
internal fun PlayerActivity.showV1579JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1579jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1579jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1579: jazz level
internal fun PlayerActivity.showV1579JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1579jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1579jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1579: jealous level
internal fun PlayerActivity.showV1579JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1579jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1579jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1579: jelly level
internal fun PlayerActivity.showV1579JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1579jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1579jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1579: jewel mode
internal fun PlayerActivity.showV1579JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1579jewel
    FeaturePrefsStore.batch1571.v1579jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1579: job mode
internal fun PlayerActivity.showV1579JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1579job
    FeaturePrefsStore.batch1571.v1579job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1579: jog mode
internal fun PlayerActivity.showV1579JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1579jog
    FeaturePrefsStore.batch1571.v1579jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1579: joke mode
internal fun PlayerActivity.showV1579JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1579joke
    FeaturePrefsStore.batch1571.v1579joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1579: judge mode
internal fun PlayerActivity.showV1579JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1579judge
    FeaturePrefsStore.batch1571.v1579judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

// v1580: involve mode
internal fun PlayerActivity.showV1580InvolveToggle() {
    val current = FeaturePrefsStore.batch1571.v1580involve
    FeaturePrefsStore.batch1571.v1580involve = !current
    AppToast.show(this, "involve: ${if (!current) "ON" else "OFF"}")
}

// v1580: iron mode
internal fun PlayerActivity.showV1580IronToggle() {
    val current = FeaturePrefsStore.batch1571.v1580iron
    FeaturePrefsStore.batch1571.v1580iron = !current
    AppToast.show(this, "iron: ${if (!current) "ON" else "OFF"}")
}

// v1580: island mode
internal fun PlayerActivity.showV1580IslandToggle() {
    val current = FeaturePrefsStore.batch1571.v1580island
    FeaturePrefsStore.batch1571.v1580island = !current
    AppToast.show(this, "island: ${if (!current) "ON" else "OFF"}")
}

// v1580: isolate mode
internal fun PlayerActivity.showV1580IsolateToggle() {
    val current = FeaturePrefsStore.batch1571.v1580isolate
    FeaturePrefsStore.batch1571.v1580isolate = !current
    AppToast.show(this, "isolate: ${if (!current) "ON" else "OFF"}")
}

// v1580: issue mode
internal fun PlayerActivity.showV1580IssueToggle() {
    val current = FeaturePrefsStore.batch1571.v1580issue
    FeaturePrefsStore.batch1571.v1580issue = !current
    AppToast.show(this, "issue: ${if (!current) "ON" else "OFF"}")
}

// v1580: jacket level
internal fun PlayerActivity.showV1580JacketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1580jacket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jacket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1580jacket = value
        AppToast.show(this, "jacket: $value")
    }
}

// v1580: jaguar level
internal fun PlayerActivity.showV1580JaguarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1580jaguar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jaguar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1580jaguar = value
        AppToast.show(this, "jaguar: $value")
    }
}

// v1580: jazz level
internal fun PlayerActivity.showV1580JazzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1580jazz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jazz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1580jazz = value
        AppToast.show(this, "jazz: $value")
    }
}

// v1580: jealous level
internal fun PlayerActivity.showV1580JealousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1580jealous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jealous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1580jealous = value
        AppToast.show(this, "jealous: $value")
    }
}

// v1580: jelly level
internal fun PlayerActivity.showV1580JellyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1571.v1580jelly).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "jelly level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1571.v1580jelly = value
        AppToast.show(this, "jelly: $value")
    }
}

// v1580: jewel mode
internal fun PlayerActivity.showV1580JewelToggle() {
    val current = FeaturePrefsStore.batch1571.v1580jewel
    FeaturePrefsStore.batch1571.v1580jewel = !current
    AppToast.show(this, "jewel: ${if (!current) "ON" else "OFF"}")
}

// v1580: job mode
internal fun PlayerActivity.showV1580JobToggle() {
    val current = FeaturePrefsStore.batch1571.v1580job
    FeaturePrefsStore.batch1571.v1580job = !current
    AppToast.show(this, "job: ${if (!current) "ON" else "OFF"}")
}

// v1580: jog mode
internal fun PlayerActivity.showV1580JogToggle() {
    val current = FeaturePrefsStore.batch1571.v1580jog
    FeaturePrefsStore.batch1571.v1580jog = !current
    AppToast.show(this, "jog: ${if (!current) "ON" else "OFF"}")
}

// v1580: joke mode
internal fun PlayerActivity.showV1580JokeToggle() {
    val current = FeaturePrefsStore.batch1571.v1580joke
    FeaturePrefsStore.batch1571.v1580joke = !current
    AppToast.show(this, "joke: ${if (!current) "ON" else "OFF"}")
}

// v1580: judge mode
internal fun PlayerActivity.showV1580JudgeToggle() {
    val current = FeaturePrefsStore.batch1571.v1580judge
    FeaturePrefsStore.batch1571.v1580judge = !current
    AppToast.show(this, "judge: ${if (!current) "ON" else "OFF"}")
}

