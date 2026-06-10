package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v196: Volume Boost Peak196
internal fun PlayerActivity.showV196VolumeBoostPeak196Toggle() {
    val current = BiliClient.prefs.v196volumeBoostPeak196
    BiliClient.prefs.v196volumeBoostPeak196 = !current
    AppToast.show(this, "Volume Boost Peak196: ${if (!current) "ON" else "OFF"}")
}

// v196: History Bookmark Export196
internal fun PlayerActivity.showV196HistoryBookmarkExport196Toggle() {
    val current = BiliClient.prefs.v196historyBookmarkExport196
    BiliClient.prefs.v196historyBookmarkExport196 = !current
    AppToast.show(this, "History Bookmark Export196: ${if (!current) "ON" else "OFF"}")
}

// v196: Playback Chapter Sync196
internal fun PlayerActivity.showV196PlaybackChapterSync196Toggle() {
    val current = BiliClient.prefs.v196playbackChapterSync196
    BiliClient.prefs.v196playbackChapterSync196 = !current
    AppToast.show(this, "Playback Chapter Sync196: ${if (!current) "ON" else "OFF"}")
}

// v196: Screenshot Save Path196
internal fun PlayerActivity.showV196ScreenshotSavePath196Toggle() {
    val current = BiliClient.prefs.v196screenshotSavePath196
    BiliClient.prefs.v196screenshotSavePath196 = !current
    AppToast.show(this, "Screenshot Save Path196: ${if (!current) "ON" else "OFF"}")
}

// v196: Video Color Space196
internal fun PlayerActivity.showV196VideoColorSpace196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196videoColorSpace196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196videoColorSpace196 = value
        AppToast.show(this, "Video Color Space196: $value")
    }
}

// v196: Danmaku Bottom Max Count200
internal fun PlayerActivity.showV196DanmakuBottomMaxCount200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount200 = value
        AppToast.show(this, "Danmaku Bottom Max Count200: $value")
    }
}

// v196: Subtitle Bg Border207
internal fun PlayerActivity.showV196SubtitleBgBorder207Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder207
    BiliClient.prefs.v196subtitleBgBorder207 = !current
    AppToast.show(this, "Subtitle Bg Border207: ${if (!current) "ON" else "OFF"}")
}

// v197: Audio Delay Compensate197
internal fun PlayerActivity.showV197AudioDelayCompensate197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197audioDelayCompensate197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197audioDelayCompensate197 = value
        AppToast.show(this, "Audio Delay Compensate197: $value")
    }
}

// v197: Danmaku Bottom Max Count201
internal fun PlayerActivity.showV197DanmakuBottomMaxCount201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount201 = value
        AppToast.show(this, "Danmaku Bottom Max Count201: $value")
    }
}

// v197: Subtitle Bg Border208
internal fun PlayerActivity.showV197SubtitleBgBorder208Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder208
    BiliClient.prefs.v197subtitleBgBorder208 = !current
    AppToast.show(this, "Subtitle Bg Border208: ${if (!current) "ON" else "OFF"}")
}

// v197: Gesture Shake Action197
internal fun PlayerActivity.showV197GestureShakeAction197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197gestureShakeAction197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197gestureShakeAction197 = value
        AppToast.show(this, "Gesture Shake Action197: $value")
    }
}

// v197: Cast Audio Volume197
internal fun PlayerActivity.showV197CastAudioVolume197Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v197castAudioVolume197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197castAudioVolume197 = value
        AppToast.show(this, "Cast Audio Volume197: $value")
    }
}

// v197: Playlist Auto Skip Outro197
internal fun PlayerActivity.showV197PlaylistAutoSkipOutro197Toggle() {
    val current = BiliClient.prefs.v197playlistAutoSkipOutro197
    BiliClient.prefs.v197playlistAutoSkipOutro197 = !current
    AppToast.show(this, "Playlist Auto Skip Outro197: ${if (!current) "ON" else "OFF"}")
}

// v197: Cache Download Speed198
internal fun PlayerActivity.showV197CacheDownloadSpeed198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197cacheDownloadSpeed198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197cacheDownloadSpeed198 = value
        AppToast.show(this, "Cache Download Speed198: $value")
    }
}

// v197: Progress Bar Thumb Border197
internal fun PlayerActivity.showV197ProgressBarThumbBorder197Toggle() {
    val current = BiliClient.prefs.v197progressBarThumbBorder197
    BiliClient.prefs.v197progressBarThumbBorder197 = !current
    AppToast.show(this, "Progress Bar Thumb Border197: ${if (!current) "ON" else "OFF"}")
}

// v197: Volume Boost Peak197
internal fun PlayerActivity.showV197VolumeBoostPeak197Toggle() {
    val current = BiliClient.prefs.v197volumeBoostPeak197
    BiliClient.prefs.v197volumeBoostPeak197 = !current
    AppToast.show(this, "Volume Boost Peak197: ${if (!current) "ON" else "OFF"}")
}

// v197: History Bookmark Export197
internal fun PlayerActivity.showV197HistoryBookmarkExport197Toggle() {
    val current = BiliClient.prefs.v197historyBookmarkExport197
    BiliClient.prefs.v197historyBookmarkExport197 = !current
    AppToast.show(this, "History Bookmark Export197: ${if (!current) "ON" else "OFF"}")
}

// v197: Playback Chapter Sync197
internal fun PlayerActivity.showV197PlaybackChapterSync197Toggle() {
    val current = BiliClient.prefs.v197playbackChapterSync197
    BiliClient.prefs.v197playbackChapterSync197 = !current
    AppToast.show(this, "Playback Chapter Sync197: ${if (!current) "ON" else "OFF"}")
}

// v197: Screenshot Save Path197
internal fun PlayerActivity.showV197ScreenshotSavePath197Toggle() {
    val current = BiliClient.prefs.v197screenshotSavePath197
    BiliClient.prefs.v197screenshotSavePath197 = !current
    AppToast.show(this, "Screenshot Save Path197: ${if (!current) "ON" else "OFF"}")
}

// v197: Video Color Space197
internal fun PlayerActivity.showV197VideoColorSpace197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197videoColorSpace197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197videoColorSpace197 = value
        AppToast.show(this, "Video Color Space197: $value")
    }
}

// v197: Danmaku Bottom Max Count202
internal fun PlayerActivity.showV197DanmakuBottomMaxCount202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount202 = value
        AppToast.show(this, "Danmaku Bottom Max Count202: $value")
    }
}

// v197: Subtitle Bg Border209
internal fun PlayerActivity.showV197SubtitleBgBorder209Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder209
    BiliClient.prefs.v197subtitleBgBorder209 = !current
    AppToast.show(this, "Subtitle Bg Border209: ${if (!current) "ON" else "OFF"}")
}

// v198: Audio Delay Compensate198
internal fun PlayerActivity.showV198AudioDelayCompensate198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198audioDelayCompensate198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198audioDelayCompensate198 = value
        AppToast.show(this, "Audio Delay Compensate198: $value")
    }
}

// v198: Danmaku Bottom Max Count203
internal fun PlayerActivity.showV198DanmakuBottomMaxCount203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount203 = value
        AppToast.show(this, "Danmaku Bottom Max Count203: $value")
    }
}

// v198: Subtitle Bg Border210
internal fun PlayerActivity.showV198SubtitleBgBorder210Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder210
    BiliClient.prefs.v198subtitleBgBorder210 = !current
    AppToast.show(this, "Subtitle Bg Border210: ${if (!current) "ON" else "OFF"}")
}

// v198: Gesture Shake Action198
internal fun PlayerActivity.showV198GestureShakeAction198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198gestureShakeAction198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198gestureShakeAction198 = value
        AppToast.show(this, "Gesture Shake Action198: $value")
    }
}

// v198: Cast Audio Volume198
internal fun PlayerActivity.showV198CastAudioVolume198Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v198castAudioVolume198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198castAudioVolume198 = value
        AppToast.show(this, "Cast Audio Volume198: $value")
    }
}

// v198: Playlist Auto Skip Outro198
internal fun PlayerActivity.showV198PlaylistAutoSkipOutro198Toggle() {
    val current = BiliClient.prefs.v198playlistAutoSkipOutro198
    BiliClient.prefs.v198playlistAutoSkipOutro198 = !current
    AppToast.show(this, "Playlist Auto Skip Outro198: ${if (!current) "ON" else "OFF"}")
}

// v198: Cache Download Speed199
internal fun PlayerActivity.showV198CacheDownloadSpeed199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198cacheDownloadSpeed199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198cacheDownloadSpeed199 = value
        AppToast.show(this, "Cache Download Speed199: $value")
    }
}

// v198: Progress Bar Thumb Border198
internal fun PlayerActivity.showV198ProgressBarThumbBorder198Toggle() {
    val current = BiliClient.prefs.v198progressBarThumbBorder198
    BiliClient.prefs.v198progressBarThumbBorder198 = !current
    AppToast.show(this, "Progress Bar Thumb Border198: ${if (!current) "ON" else "OFF"}")
}

// v198: Volume Boost Peak198
internal fun PlayerActivity.showV198VolumeBoostPeak198Toggle() {
    val current = BiliClient.prefs.v198volumeBoostPeak198
    BiliClient.prefs.v198volumeBoostPeak198 = !current
    AppToast.show(this, "Volume Boost Peak198: ${if (!current) "ON" else "OFF"}")
}

// v198: History Bookmark Export198
internal fun PlayerActivity.showV198HistoryBookmarkExport198Toggle() {
    val current = BiliClient.prefs.v198historyBookmarkExport198
    BiliClient.prefs.v198historyBookmarkExport198 = !current
    AppToast.show(this, "History Bookmark Export198: ${if (!current) "ON" else "OFF"}")
}

// v198: Playback Chapter Sync198
internal fun PlayerActivity.showV198PlaybackChapterSync198Toggle() {
    val current = BiliClient.prefs.v198playbackChapterSync198
    BiliClient.prefs.v198playbackChapterSync198 = !current
    AppToast.show(this, "Playback Chapter Sync198: ${if (!current) "ON" else "OFF"}")
}

// v198: Screenshot Save Path198
internal fun PlayerActivity.showV198ScreenshotSavePath198Toggle() {
    val current = BiliClient.prefs.v198screenshotSavePath198
    BiliClient.prefs.v198screenshotSavePath198 = !current
    AppToast.show(this, "Screenshot Save Path198: ${if (!current) "ON" else "OFF"}")
}

// v198: Video Color Space198
internal fun PlayerActivity.showV198VideoColorSpace198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198videoColorSpace198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198videoColorSpace198 = value
        AppToast.show(this, "Video Color Space198: $value")
    }
}

// v198: Danmaku Bottom Max Count204
internal fun PlayerActivity.showV198DanmakuBottomMaxCount204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount204 = value
        AppToast.show(this, "Danmaku Bottom Max Count204: $value")
    }
}

// v198: Subtitle Bg Border211
internal fun PlayerActivity.showV198SubtitleBgBorder211Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder211
    BiliClient.prefs.v198subtitleBgBorder211 = !current
    AppToast.show(this, "Subtitle Bg Border211: ${if (!current) "ON" else "OFF"}")
}

// v199: Audio Delay Compensate199
internal fun PlayerActivity.showV199AudioDelayCompensate199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199audioDelayCompensate199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199audioDelayCompensate199 = value
        AppToast.show(this, "Audio Delay Compensate199: $value")
    }
}

// v199: Danmaku Bottom Max Count205
internal fun PlayerActivity.showV199DanmakuBottomMaxCount205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount205 = value
        AppToast.show(this, "Danmaku Bottom Max Count205: $value")
    }
}

// v199: Subtitle Bg Border212
internal fun PlayerActivity.showV199SubtitleBgBorder212Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder212
    BiliClient.prefs.v199subtitleBgBorder212 = !current
    AppToast.show(this, "Subtitle Bg Border212: ${if (!current) "ON" else "OFF"}")
}

// v199: Gesture Shake Action199
internal fun PlayerActivity.showV199GestureShakeAction199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199gestureShakeAction199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199gestureShakeAction199 = value
        AppToast.show(this, "Gesture Shake Action199: $value")
    }
}

// v199: Cast Audio Volume199
internal fun PlayerActivity.showV199CastAudioVolume199Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v199castAudioVolume199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199castAudioVolume199 = value
        AppToast.show(this, "Cast Audio Volume199: $value")
    }
}

// v199: Playlist Auto Skip Outro199
internal fun PlayerActivity.showV199PlaylistAutoSkipOutro199Toggle() {
    val current = BiliClient.prefs.v199playlistAutoSkipOutro199
    BiliClient.prefs.v199playlistAutoSkipOutro199 = !current
    AppToast.show(this, "Playlist Auto Skip Outro199: ${if (!current) "ON" else "OFF"}")
}

// v199: Cache Download Speed200
internal fun PlayerActivity.showV199CacheDownloadSpeed200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199cacheDownloadSpeed200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199cacheDownloadSpeed200 = value
        AppToast.show(this, "Cache Download Speed200: $value")
    }
}

// v199: Progress Bar Thumb Border199
internal fun PlayerActivity.showV199ProgressBarThumbBorder199Toggle() {
    val current = BiliClient.prefs.v199progressBarThumbBorder199
    BiliClient.prefs.v199progressBarThumbBorder199 = !current
    AppToast.show(this, "Progress Bar Thumb Border199: ${if (!current) "ON" else "OFF"}")
}

// v199: Volume Boost Peak199
internal fun PlayerActivity.showV199VolumeBoostPeak199Toggle() {
    val current = BiliClient.prefs.v199volumeBoostPeak199
    BiliClient.prefs.v199volumeBoostPeak199 = !current
    AppToast.show(this, "Volume Boost Peak199: ${if (!current) "ON" else "OFF"}")
}

// v199: History Bookmark Export199
internal fun PlayerActivity.showV199HistoryBookmarkExport199Toggle() {
    val current = BiliClient.prefs.v199historyBookmarkExport199
    BiliClient.prefs.v199historyBookmarkExport199 = !current
    AppToast.show(this, "History Bookmark Export199: ${if (!current) "ON" else "OFF"}")
}

// v199: Playback Chapter Sync199
internal fun PlayerActivity.showV199PlaybackChapterSync199Toggle() {
    val current = BiliClient.prefs.v199playbackChapterSync199
    BiliClient.prefs.v199playbackChapterSync199 = !current
    AppToast.show(this, "Playback Chapter Sync199: ${if (!current) "ON" else "OFF"}")
}

// v199: Screenshot Save Path199
internal fun PlayerActivity.showV199ScreenshotSavePath199Toggle() {
    val current = BiliClient.prefs.v199screenshotSavePath199
    BiliClient.prefs.v199screenshotSavePath199 = !current
    AppToast.show(this, "Screenshot Save Path199: ${if (!current) "ON" else "OFF"}")
}

// v199: Video Color Space199
internal fun PlayerActivity.showV199VideoColorSpace199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199videoColorSpace199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199videoColorSpace199 = value
        AppToast.show(this, "Video Color Space199: $value")
    }
}

// v199: Danmaku Bottom Max Count206
internal fun PlayerActivity.showV199DanmakuBottomMaxCount206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount206 = value
        AppToast.show(this, "Danmaku Bottom Max Count206: $value")
    }
}

// v199: Subtitle Bg Border213
internal fun PlayerActivity.showV199SubtitleBgBorder213Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder213
    BiliClient.prefs.v199subtitleBgBorder213 = !current
    AppToast.show(this, "Subtitle Bg Border213: ${if (!current) "ON" else "OFF"}")
}

// v200: Audio Delay Compensate200
internal fun PlayerActivity.showV200AudioDelayCompensate200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200audioDelayCompensate200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200audioDelayCompensate200 = value
        AppToast.show(this, "Audio Delay Compensate200: $value")
    }
}

// v200: Danmaku Bottom Max Count207
internal fun PlayerActivity.showV200DanmakuBottomMaxCount207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount207 = value
        AppToast.show(this, "Danmaku Bottom Max Count207: $value")
    }
}

// v200: Subtitle Bg Border214
internal fun PlayerActivity.showV200SubtitleBgBorder214Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder214
    BiliClient.prefs.v200subtitleBgBorder214 = !current
    AppToast.show(this, "Subtitle Bg Border214: ${if (!current) "ON" else "OFF"}")
}

// v200: Gesture Shake Action200
internal fun PlayerActivity.showV200GestureShakeAction200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200gestureShakeAction200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200gestureShakeAction200 = value
        AppToast.show(this, "Gesture Shake Action200: $value")
    }
}

// v200: Cast Audio Volume200
internal fun PlayerActivity.showV200CastAudioVolume200Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v200castAudioVolume200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200castAudioVolume200 = value
        AppToast.show(this, "Cast Audio Volume200: $value")
    }
}

// v200: Playlist Auto Skip Outro200
internal fun PlayerActivity.showV200PlaylistAutoSkipOutro200Toggle() {
    val current = BiliClient.prefs.v200playlistAutoSkipOutro200
    BiliClient.prefs.v200playlistAutoSkipOutro200 = !current
    AppToast.show(this, "Playlist Auto Skip Outro200: ${if (!current) "ON" else "OFF"}")
}

// v200: Cache Download Speed201
internal fun PlayerActivity.showV200CacheDownloadSpeed201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200cacheDownloadSpeed201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200cacheDownloadSpeed201 = value
        AppToast.show(this, "Cache Download Speed201: $value")
    }
}

// v200: Progress Bar Thumb Border200
internal fun PlayerActivity.showV200ProgressBarThumbBorder200Toggle() {
    val current = BiliClient.prefs.v200progressBarThumbBorder200
    BiliClient.prefs.v200progressBarThumbBorder200 = !current
    AppToast.show(this, "Progress Bar Thumb Border200: ${if (!current) "ON" else "OFF"}")
}

// v200: Volume Boost Peak200
internal fun PlayerActivity.showV200VolumeBoostPeak200Toggle() {
    val current = BiliClient.prefs.v200volumeBoostPeak200
    BiliClient.prefs.v200volumeBoostPeak200 = !current
    AppToast.show(this, "Volume Boost Peak200: ${if (!current) "ON" else "OFF"}")
}

// v200: History Bookmark Export200
internal fun PlayerActivity.showV200HistoryBookmarkExport200Toggle() {
    val current = BiliClient.prefs.v200historyBookmarkExport200
    BiliClient.prefs.v200historyBookmarkExport200 = !current
    AppToast.show(this, "History Bookmark Export200: ${if (!current) "ON" else "OFF"}")
}

// v200: Playback Chapter Sync200
internal fun PlayerActivity.showV200PlaybackChapterSync200Toggle() {
    val current = BiliClient.prefs.v200playbackChapterSync200
    BiliClient.prefs.v200playbackChapterSync200 = !current
    AppToast.show(this, "Playback Chapter Sync200: ${if (!current) "ON" else "OFF"}")
}

// v200: Screenshot Save Path200
internal fun PlayerActivity.showV200ScreenshotSavePath200Toggle() {
    val current = BiliClient.prefs.v200screenshotSavePath200
    BiliClient.prefs.v200screenshotSavePath200 = !current
    AppToast.show(this, "Screenshot Save Path200: ${if (!current) "ON" else "OFF"}")
}

// v200: Video Color Space200
internal fun PlayerActivity.showV200VideoColorSpace200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200videoColorSpace200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200videoColorSpace200 = value
        AppToast.show(this, "Video Color Space200: $value")
    }
}

// v200: Danmaku Bottom Max Count208
internal fun PlayerActivity.showV200DanmakuBottomMaxCount208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount208 = value
        AppToast.show(this, "Danmaku Bottom Max Count208: $value")
    }
}

// v200: Subtitle Bg Border215
internal fun PlayerActivity.showV200SubtitleBgBorder215Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder215
    BiliClient.prefs.v200subtitleBgBorder215 = !current
    AppToast.show(this, "Subtitle Bg Border215: ${if (!current) "ON" else "OFF"}")
}

// v201: Audio EQ Custom201
internal fun PlayerActivity.showV201AudioEQCustom201Toggle() {
    val current = BiliClient.prefs.v201audioEQCustom201
    BiliClient.prefs.v201audioEQCustom201 = !current
    AppToast.show(this, "Audio EQ Custom201: ${if (!current) "ON" else "OFF"}")
}

// v201: Danmaku Bottom Max Count209
internal fun PlayerActivity.showV201DanmakuBottomMaxCount209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount209 = value
        AppToast.show(this, "Danmaku Bottom Max Count209: $value")
    }
}

// v201: Subtitle Bg Border216
internal fun PlayerActivity.showV201SubtitleBgBorder216Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder216
    BiliClient.prefs.v201subtitleBgBorder216 = !current
    AppToast.show(this, "Subtitle Bg Border216: ${if (!current) "ON" else "OFF"}")
}

// v201: Gesture Shake Action201
internal fun PlayerActivity.showV201GestureShakeAction201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201gestureShakeAction201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201gestureShakeAction201 = value
        AppToast.show(this, "Gesture Shake Action201: $value")
    }
}

// v201: Cast Audio Volume201
internal fun PlayerActivity.showV201CastAudioVolume201Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v201castAudioVolume201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201castAudioVolume201 = value
        AppToast.show(this, "Cast Audio Volume201: $value")
    }
}

// v201: Playlist Auto Skip Outro201
internal fun PlayerActivity.showV201PlaylistAutoSkipOutro201Toggle() {
    val current = BiliClient.prefs.v201playlistAutoSkipOutro201
    BiliClient.prefs.v201playlistAutoSkipOutro201 = !current
    AppToast.show(this, "Playlist Auto Skip Outro201: ${if (!current) "ON" else "OFF"}")
}

// v201: Cache Download Speed202
internal fun PlayerActivity.showV201CacheDownloadSpeed202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201cacheDownloadSpeed202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201cacheDownloadSpeed202 = value
        AppToast.show(this, "Cache Download Speed202: $value")
    }
}

// v201: Progress Bar Thumb Border201
internal fun PlayerActivity.showV201ProgressBarThumbBorder201Toggle() {
    val current = BiliClient.prefs.v201progressBarThumbBorder201
    BiliClient.prefs.v201progressBarThumbBorder201 = !current
    AppToast.show(this, "Progress Bar Thumb Border201: ${if (!current) "ON" else "OFF"}")
}

// v201: Volume Boost Peak201
internal fun PlayerActivity.showV201VolumeBoostPeak201Toggle() {
    val current = BiliClient.prefs.v201volumeBoostPeak201
    BiliClient.prefs.v201volumeBoostPeak201 = !current
    AppToast.show(this, "Volume Boost Peak201: ${if (!current) "ON" else "OFF"}")
}

// v201: History Bookmark Export201
internal fun PlayerActivity.showV201HistoryBookmarkExport201Toggle() {
    val current = BiliClient.prefs.v201historyBookmarkExport201
    BiliClient.prefs.v201historyBookmarkExport201 = !current
    AppToast.show(this, "History Bookmark Export201: ${if (!current) "ON" else "OFF"}")
}

// v201: Playback Chapter Sync201
internal fun PlayerActivity.showV201PlaybackChapterSync201Toggle() {
    val current = BiliClient.prefs.v201playbackChapterSync201
    BiliClient.prefs.v201playbackChapterSync201 = !current
    AppToast.show(this, "Playback Chapter Sync201: ${if (!current) "ON" else "OFF"}")
}

// v201: Screenshot Save Path201
internal fun PlayerActivity.showV201ScreenshotSavePath201Toggle() {
    val current = BiliClient.prefs.v201screenshotSavePath201
    BiliClient.prefs.v201screenshotSavePath201 = !current
    AppToast.show(this, "Screenshot Save Path201: ${if (!current) "ON" else "OFF"}")
}

// v201: Video Color Space201
internal fun PlayerActivity.showV201VideoColorSpace201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201videoColorSpace201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201videoColorSpace201 = value
        AppToast.show(this, "Video Color Space201: $value")
    }
}

// v201: Danmaku Bottom Max Count210
internal fun PlayerActivity.showV201DanmakuBottomMaxCount210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount210 = value
        AppToast.show(this, "Danmaku Bottom Max Count210: $value")
    }
}

// v201: Subtitle Bg Border217
internal fun PlayerActivity.showV201SubtitleBgBorder217Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder217
    BiliClient.prefs.v201subtitleBgBorder217 = !current
    AppToast.show(this, "Subtitle Bg Border217: ${if (!current) "ON" else "OFF"}")
}

// v202: Audio EQ Custom202
internal fun PlayerActivity.showV202AudioEQCustom202Toggle() {
    val current = BiliClient.prefs.v202audioEQCustom202
    BiliClient.prefs.v202audioEQCustom202 = !current
    AppToast.show(this, "Audio EQ Custom202: ${if (!current) "ON" else "OFF"}")
}

// v202: Danmaku Bottom Max Count211
internal fun PlayerActivity.showV202DanmakuBottomMaxCount211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount211 = value
        AppToast.show(this, "Danmaku Bottom Max Count211: $value")
    }
}

// v202: Subtitle Bg Border218
internal fun PlayerActivity.showV202SubtitleBgBorder218Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder218
    BiliClient.prefs.v202subtitleBgBorder218 = !current
    AppToast.show(this, "Subtitle Bg Border218: ${if (!current) "ON" else "OFF"}")
}

// v202: Gesture Shake Action202
internal fun PlayerActivity.showV202GestureShakeAction202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202gestureShakeAction202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202gestureShakeAction202 = value
        AppToast.show(this, "Gesture Shake Action202: $value")
    }
}

// v202: Cast Audio Volume202
internal fun PlayerActivity.showV202CastAudioVolume202Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v202castAudioVolume202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202castAudioVolume202 = value
        AppToast.show(this, "Cast Audio Volume202: $value")
    }
}

// v202: Playlist Auto Skip Outro202
internal fun PlayerActivity.showV202PlaylistAutoSkipOutro202Toggle() {
    val current = BiliClient.prefs.v202playlistAutoSkipOutro202
    BiliClient.prefs.v202playlistAutoSkipOutro202 = !current
    AppToast.show(this, "Playlist Auto Skip Outro202: ${if (!current) "ON" else "OFF"}")
}

// v202: Cache Download Speed203
internal fun PlayerActivity.showV202CacheDownloadSpeed203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202cacheDownloadSpeed203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202cacheDownloadSpeed203 = value
        AppToast.show(this, "Cache Download Speed203: $value")
    }
}

// v202: Progress Bar Thumb Border202
internal fun PlayerActivity.showV202ProgressBarThumbBorder202Toggle() {
    val current = BiliClient.prefs.v202progressBarThumbBorder202
    BiliClient.prefs.v202progressBarThumbBorder202 = !current
    AppToast.show(this, "Progress Bar Thumb Border202: ${if (!current) "ON" else "OFF"}")
}

// v202: Volume Boost Peak202
internal fun PlayerActivity.showV202VolumeBoostPeak202Toggle() {
    val current = BiliClient.prefs.v202volumeBoostPeak202
    BiliClient.prefs.v202volumeBoostPeak202 = !current
    AppToast.show(this, "Volume Boost Peak202: ${if (!current) "ON" else "OFF"}")
}

// v202: History Bookmark Export202
internal fun PlayerActivity.showV202HistoryBookmarkExport202Toggle() {
    val current = BiliClient.prefs.v202historyBookmarkExport202
    BiliClient.prefs.v202historyBookmarkExport202 = !current
    AppToast.show(this, "History Bookmark Export202: ${if (!current) "ON" else "OFF"}")
}

// v202: Playback Chapter Sync202
internal fun PlayerActivity.showV202PlaybackChapterSync202Toggle() {
    val current = BiliClient.prefs.v202playbackChapterSync202
    BiliClient.prefs.v202playbackChapterSync202 = !current
    AppToast.show(this, "Playback Chapter Sync202: ${if (!current) "ON" else "OFF"}")
}

// v202: Screenshot Save Path202
internal fun PlayerActivity.showV202ScreenshotSavePath202Toggle() {
    val current = BiliClient.prefs.v202screenshotSavePath202
    BiliClient.prefs.v202screenshotSavePath202 = !current
    AppToast.show(this, "Screenshot Save Path202: ${if (!current) "ON" else "OFF"}")
}

// v202: Video Color Space202
internal fun PlayerActivity.showV202VideoColorSpace202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202videoColorSpace202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202videoColorSpace202 = value
        AppToast.show(this, "Video Color Space202: $value")
    }
}

// v202: Danmaku Bottom Max Count212
internal fun PlayerActivity.showV202DanmakuBottomMaxCount212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount212 = value
        AppToast.show(this, "Danmaku Bottom Max Count212: $value")
    }
}

// v202: Subtitle Bg Border219
internal fun PlayerActivity.showV202SubtitleBgBorder219Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder219
    BiliClient.prefs.v202subtitleBgBorder219 = !current
    AppToast.show(this, "Subtitle Bg Border219: ${if (!current) "ON" else "OFF"}")
}

// v203: Audio EQ Custom203
internal fun PlayerActivity.showV203AudioEQCustom203Toggle() {
    val current = BiliClient.prefs.v203audioEQCustom203
    BiliClient.prefs.v203audioEQCustom203 = !current
    AppToast.show(this, "Audio EQ Custom203: ${if (!current) "ON" else "OFF"}")
}

// v203: Danmaku Bottom Max Count213
internal fun PlayerActivity.showV203DanmakuBottomMaxCount213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount213 = value
        AppToast.show(this, "Danmaku Bottom Max Count213: $value")
    }
}

// v203: Subtitle Bg Border220
internal fun PlayerActivity.showV203SubtitleBgBorder220Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder220
    BiliClient.prefs.v203subtitleBgBorder220 = !current
    AppToast.show(this, "Subtitle Bg Border220: ${if (!current) "ON" else "OFF"}")
}

// v203: Gesture Shake Action203
internal fun PlayerActivity.showV203GestureShakeAction203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203gestureShakeAction203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203gestureShakeAction203 = value
        AppToast.show(this, "Gesture Shake Action203: $value")
    }
}

// v203: Cast Audio Volume203
internal fun PlayerActivity.showV203CastAudioVolume203Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v203castAudioVolume203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203castAudioVolume203 = value
        AppToast.show(this, "Cast Audio Volume203: $value")
    }
}

// v203: Playlist Auto Skip Outro203
internal fun PlayerActivity.showV203PlaylistAutoSkipOutro203Toggle() {
    val current = BiliClient.prefs.v203playlistAutoSkipOutro203
    BiliClient.prefs.v203playlistAutoSkipOutro203 = !current
    AppToast.show(this, "Playlist Auto Skip Outro203: ${if (!current) "ON" else "OFF"}")
}

// v203: Cache Download Speed204
internal fun PlayerActivity.showV203CacheDownloadSpeed204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203cacheDownloadSpeed204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203cacheDownloadSpeed204 = value
        AppToast.show(this, "Cache Download Speed204: $value")
    }
}

// v203: Progress Bar Thumb Border203
internal fun PlayerActivity.showV203ProgressBarThumbBorder203Toggle() {
    val current = BiliClient.prefs.v203progressBarThumbBorder203
    BiliClient.prefs.v203progressBarThumbBorder203 = !current
    AppToast.show(this, "Progress Bar Thumb Border203: ${if (!current) "ON" else "OFF"}")
}

// v203: Volume Boost Peak203
internal fun PlayerActivity.showV203VolumeBoostPeak203Toggle() {
    val current = BiliClient.prefs.v203volumeBoostPeak203
    BiliClient.prefs.v203volumeBoostPeak203 = !current
    AppToast.show(this, "Volume Boost Peak203: ${if (!current) "ON" else "OFF"}")
}

// v203: History Bookmark Export203
internal fun PlayerActivity.showV203HistoryBookmarkExport203Toggle() {
    val current = BiliClient.prefs.v203historyBookmarkExport203
    BiliClient.prefs.v203historyBookmarkExport203 = !current
    AppToast.show(this, "History Bookmark Export203: ${if (!current) "ON" else "OFF"}")
}

// v203: Playback Chapter Sync203
internal fun PlayerActivity.showV203PlaybackChapterSync203Toggle() {
    val current = BiliClient.prefs.v203playbackChapterSync203
    BiliClient.prefs.v203playbackChapterSync203 = !current
    AppToast.show(this, "Playback Chapter Sync203: ${if (!current) "ON" else "OFF"}")
}

// v203: Screenshot Save Path203
internal fun PlayerActivity.showV203ScreenshotSavePath203Toggle() {
    val current = BiliClient.prefs.v203screenshotSavePath203
    BiliClient.prefs.v203screenshotSavePath203 = !current
    AppToast.show(this, "Screenshot Save Path203: ${if (!current) "ON" else "OFF"}")
}

// v203: Video Color Space203
internal fun PlayerActivity.showV203VideoColorSpace203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203videoColorSpace203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203videoColorSpace203 = value
        AppToast.show(this, "Video Color Space203: $value")
    }
}

// v203: Danmaku Bottom Max Count214
internal fun PlayerActivity.showV203DanmakuBottomMaxCount214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount214 = value
        AppToast.show(this, "Danmaku Bottom Max Count214: $value")
    }
}

// v203: Subtitle Bg Border221
internal fun PlayerActivity.showV203SubtitleBgBorder221Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder221
    BiliClient.prefs.v203subtitleBgBorder221 = !current
    AppToast.show(this, "Subtitle Bg Border221: ${if (!current) "ON" else "OFF"}")
}

// v204: Audio EQ Custom204
internal fun PlayerActivity.showV204AudioEQCustom204Toggle() {
    val current = BiliClient.prefs.v204audioEQCustom204
    BiliClient.prefs.v204audioEQCustom204 = !current
    AppToast.show(this, "Audio EQ Custom204: ${if (!current) "ON" else "OFF"}")
}

// v204: Danmaku Bottom Max Count215
internal fun PlayerActivity.showV204DanmakuBottomMaxCount215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount215 = value
        AppToast.show(this, "Danmaku Bottom Max Count215: $value")
    }
}

// v204: Subtitle Bg Border222
internal fun PlayerActivity.showV204SubtitleBgBorder222Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder222
    BiliClient.prefs.v204subtitleBgBorder222 = !current
    AppToast.show(this, "Subtitle Bg Border222: ${if (!current) "ON" else "OFF"}")
}

// v204: Gesture Shake Action204
internal fun PlayerActivity.showV204GestureShakeAction204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204gestureShakeAction204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204gestureShakeAction204 = value
        AppToast.show(this, "Gesture Shake Action204: $value")
    }
}

// v204: Cast Audio Volume204
internal fun PlayerActivity.showV204CastAudioVolume204Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v204castAudioVolume204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204castAudioVolume204 = value
        AppToast.show(this, "Cast Audio Volume204: $value")
    }
}

// v204: Playlist Auto Skip Outro204
internal fun PlayerActivity.showV204PlaylistAutoSkipOutro204Toggle() {
    val current = BiliClient.prefs.v204playlistAutoSkipOutro204
    BiliClient.prefs.v204playlistAutoSkipOutro204 = !current
    AppToast.show(this, "Playlist Auto Skip Outro204: ${if (!current) "ON" else "OFF"}")
}

// v204: Cache Download Speed205
internal fun PlayerActivity.showV204CacheDownloadSpeed205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204cacheDownloadSpeed205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204cacheDownloadSpeed205 = value
        AppToast.show(this, "Cache Download Speed205: $value")
    }
}

// v204: Progress Bar Thumb Border204
internal fun PlayerActivity.showV204ProgressBarThumbBorder204Toggle() {
    val current = BiliClient.prefs.v204progressBarThumbBorder204
    BiliClient.prefs.v204progressBarThumbBorder204 = !current
    AppToast.show(this, "Progress Bar Thumb Border204: ${if (!current) "ON" else "OFF"}")
}

// v204: Volume Boost Peak204
internal fun PlayerActivity.showV204VolumeBoostPeak204Toggle() {
    val current = BiliClient.prefs.v204volumeBoostPeak204
    BiliClient.prefs.v204volumeBoostPeak204 = !current
    AppToast.show(this, "Volume Boost Peak204: ${if (!current) "ON" else "OFF"}")
}

// v204: History Bookmark Export204
internal fun PlayerActivity.showV204HistoryBookmarkExport204Toggle() {
    val current = BiliClient.prefs.v204historyBookmarkExport204
    BiliClient.prefs.v204historyBookmarkExport204 = !current
    AppToast.show(this, "History Bookmark Export204: ${if (!current) "ON" else "OFF"}")
}

// v204: Playback Chapter Sync204
internal fun PlayerActivity.showV204PlaybackChapterSync204Toggle() {
    val current = BiliClient.prefs.v204playbackChapterSync204
    BiliClient.prefs.v204playbackChapterSync204 = !current
    AppToast.show(this, "Playback Chapter Sync204: ${if (!current) "ON" else "OFF"}")
}

// v204: Screenshot Save Path204
internal fun PlayerActivity.showV204ScreenshotSavePath204Toggle() {
    val current = BiliClient.prefs.v204screenshotSavePath204
    BiliClient.prefs.v204screenshotSavePath204 = !current
    AppToast.show(this, "Screenshot Save Path204: ${if (!current) "ON" else "OFF"}")
}

// v204: Video Color Space204
internal fun PlayerActivity.showV204VideoColorSpace204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204videoColorSpace204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204videoColorSpace204 = value
        AppToast.show(this, "Video Color Space204: $value")
    }
}

// v204: Danmaku Bottom Max Count216
internal fun PlayerActivity.showV204DanmakuBottomMaxCount216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount216 = value
        AppToast.show(this, "Danmaku Bottom Max Count216: $value")
    }
}

// v204: Subtitle Bg Border223
internal fun PlayerActivity.showV204SubtitleBgBorder223Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder223
    BiliClient.prefs.v204subtitleBgBorder223 = !current
    AppToast.show(this, "Subtitle Bg Border223: ${if (!current) "ON" else "OFF"}")
}

// v205: Audio EQ Custom205
internal fun PlayerActivity.showV205AudioEQCustom205Toggle() {
    val current = BiliClient.prefs.v205audioEQCustom205
    BiliClient.prefs.v205audioEQCustom205 = !current
    AppToast.show(this, "Audio EQ Custom205: ${if (!current) "ON" else "OFF"}")
}

// v205: Danmaku Bottom Max Count217
internal fun PlayerActivity.showV205DanmakuBottomMaxCount217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount217 = value
        AppToast.show(this, "Danmaku Bottom Max Count217: $value")
    }
}

// v205: Subtitle Bg Border224
internal fun PlayerActivity.showV205SubtitleBgBorder224Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder224
    BiliClient.prefs.v205subtitleBgBorder224 = !current
    AppToast.show(this, "Subtitle Bg Border224: ${if (!current) "ON" else "OFF"}")
}

// v205: Gesture Shake Action205
internal fun PlayerActivity.showV205GestureShakeAction205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205gestureShakeAction205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205gestureShakeAction205 = value
        AppToast.show(this, "Gesture Shake Action205: $value")
    }
}

// v205: Cast Audio Volume205
internal fun PlayerActivity.showV205CastAudioVolume205Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v205castAudioVolume205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205castAudioVolume205 = value
        AppToast.show(this, "Cast Audio Volume205: $value")
    }
}

// v205: Playlist Auto Skip Outro205
internal fun PlayerActivity.showV205PlaylistAutoSkipOutro205Toggle() {
    val current = BiliClient.prefs.v205playlistAutoSkipOutro205
    BiliClient.prefs.v205playlistAutoSkipOutro205 = !current
    AppToast.show(this, "Playlist Auto Skip Outro205: ${if (!current) "ON" else "OFF"}")
}

// v205: Cache Download Speed206
internal fun PlayerActivity.showV205CacheDownloadSpeed206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205cacheDownloadSpeed206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205cacheDownloadSpeed206 = value
        AppToast.show(this, "Cache Download Speed206: $value")
    }
}

// v205: Progress Bar Thumb Border205
internal fun PlayerActivity.showV205ProgressBarThumbBorder205Toggle() {
    val current = BiliClient.prefs.v205progressBarThumbBorder205
    BiliClient.prefs.v205progressBarThumbBorder205 = !current
    AppToast.show(this, "Progress Bar Thumb Border205: ${if (!current) "ON" else "OFF"}")
}

// v205: Volume Boost Peak205
internal fun PlayerActivity.showV205VolumeBoostPeak205Toggle() {
    val current = BiliClient.prefs.v205volumeBoostPeak205
    BiliClient.prefs.v205volumeBoostPeak205 = !current
    AppToast.show(this, "Volume Boost Peak205: ${if (!current) "ON" else "OFF"}")
}

// v205: History Bookmark Export205
internal fun PlayerActivity.showV205HistoryBookmarkExport205Toggle() {
    val current = BiliClient.prefs.v205historyBookmarkExport205
    BiliClient.prefs.v205historyBookmarkExport205 = !current
    AppToast.show(this, "History Bookmark Export205: ${if (!current) "ON" else "OFF"}")
}

// v205: Playback Chapter Sync205
internal fun PlayerActivity.showV205PlaybackChapterSync205Toggle() {
    val current = BiliClient.prefs.v205playbackChapterSync205
    BiliClient.prefs.v205playbackChapterSync205 = !current
    AppToast.show(this, "Playback Chapter Sync205: ${if (!current) "ON" else "OFF"}")
}

// v205: Screenshot Save Path205
internal fun PlayerActivity.showV205ScreenshotSavePath205Toggle() {
    val current = BiliClient.prefs.v205screenshotSavePath205
    BiliClient.prefs.v205screenshotSavePath205 = !current
    AppToast.show(this, "Screenshot Save Path205: ${if (!current) "ON" else "OFF"}")
}

// v205: Video Color Space205
internal fun PlayerActivity.showV205VideoColorSpace205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205videoColorSpace205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205videoColorSpace205 = value
        AppToast.show(this, "Video Color Space205: $value")
    }
}

// v205: Danmaku Bottom Max Count218
internal fun PlayerActivity.showV205DanmakuBottomMaxCount218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount218 = value
        AppToast.show(this, "Danmaku Bottom Max Count218: $value")
    }
}

// v205: Subtitle Bg Border225
internal fun PlayerActivity.showV205SubtitleBgBorder225Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder225
    BiliClient.prefs.v205subtitleBgBorder225 = !current
    AppToast.show(this, "Subtitle Bg Border225: ${if (!current) "ON" else "OFF"}")
}

// v206: Audio EQ Custom206
internal fun PlayerActivity.showV206AudioEQCustom206Toggle() {
    val current = BiliClient.prefs.v206audioEQCustom206
    BiliClient.prefs.v206audioEQCustom206 = !current
    AppToast.show(this, "Audio EQ Custom206: ${if (!current) "ON" else "OFF"}")
}

// v206: Danmaku Bottom Max Count219
internal fun PlayerActivity.showV206DanmakuBottomMaxCount219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount219 = value
        AppToast.show(this, "Danmaku Bottom Max Count219: $value")
    }
}

// v206: Subtitle Bg Border226
internal fun PlayerActivity.showV206SubtitleBgBorder226Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder226
    BiliClient.prefs.v206subtitleBgBorder226 = !current
    AppToast.show(this, "Subtitle Bg Border226: ${if (!current) "ON" else "OFF"}")
}

// v206: Gesture Shake Action206
internal fun PlayerActivity.showV206GestureShakeAction206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206gestureShakeAction206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206gestureShakeAction206 = value
        AppToast.show(this, "Gesture Shake Action206: $value")
    }
}

// v206: Cast Audio Volume206
internal fun PlayerActivity.showV206CastAudioVolume206Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v206castAudioVolume206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206castAudioVolume206 = value
        AppToast.show(this, "Cast Audio Volume206: $value")
    }
}

// v206: Playlist Auto Skip Outro206
internal fun PlayerActivity.showV206PlaylistAutoSkipOutro206Toggle() {
    val current = BiliClient.prefs.v206playlistAutoSkipOutro206
    BiliClient.prefs.v206playlistAutoSkipOutro206 = !current
    AppToast.show(this, "Playlist Auto Skip Outro206: ${if (!current) "ON" else "OFF"}")
}

// v206: Cache Download Speed207
internal fun PlayerActivity.showV206CacheDownloadSpeed207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206cacheDownloadSpeed207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206cacheDownloadSpeed207 = value
        AppToast.show(this, "Cache Download Speed207: $value")
    }
}

// v206: Progress Bar Thumb Border206
internal fun PlayerActivity.showV206ProgressBarThumbBorder206Toggle() {
    val current = BiliClient.prefs.v206progressBarThumbBorder206
    BiliClient.prefs.v206progressBarThumbBorder206 = !current
    AppToast.show(this, "Progress Bar Thumb Border206: ${if (!current) "ON" else "OFF"}")
}

// v206: Volume Boost Peak206
internal fun PlayerActivity.showV206VolumeBoostPeak206Toggle() {
    val current = BiliClient.prefs.v206volumeBoostPeak206
    BiliClient.prefs.v206volumeBoostPeak206 = !current
    AppToast.show(this, "Volume Boost Peak206: ${if (!current) "ON" else "OFF"}")
}

// v206: History Bookmark Export206
internal fun PlayerActivity.showV206HistoryBookmarkExport206Toggle() {
    val current = BiliClient.prefs.v206historyBookmarkExport206
    BiliClient.prefs.v206historyBookmarkExport206 = !current
    AppToast.show(this, "History Bookmark Export206: ${if (!current) "ON" else "OFF"}")
}

// v206: Playback Chapter Sync206
internal fun PlayerActivity.showV206PlaybackChapterSync206Toggle() {
    val current = BiliClient.prefs.v206playbackChapterSync206
    BiliClient.prefs.v206playbackChapterSync206 = !current
    AppToast.show(this, "Playback Chapter Sync206: ${if (!current) "ON" else "OFF"}")
}

// v206: Screenshot Save Path206
internal fun PlayerActivity.showV206ScreenshotSavePath206Toggle() {
    val current = BiliClient.prefs.v206screenshotSavePath206
    BiliClient.prefs.v206screenshotSavePath206 = !current
    AppToast.show(this, "Screenshot Save Path206: ${if (!current) "ON" else "OFF"}")
}

// v206: Video Color Space206
internal fun PlayerActivity.showV206VideoColorSpace206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206videoColorSpace206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206videoColorSpace206 = value
        AppToast.show(this, "Video Color Space206: $value")
    }
}

// v206: Danmaku Bottom Max Count220
internal fun PlayerActivity.showV206DanmakuBottomMaxCount220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount220 = value
        AppToast.show(this, "Danmaku Bottom Max Count220: $value")
    }
}

// v206: Subtitle Bg Border227
internal fun PlayerActivity.showV206SubtitleBgBorder227Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder227
    BiliClient.prefs.v206subtitleBgBorder227 = !current
    AppToast.show(this, "Subtitle Bg Border227: ${if (!current) "ON" else "OFF"}")
}

// v207: Audio EQ Custom207
internal fun PlayerActivity.showV207AudioEQCustom207Toggle() {
    val current = BiliClient.prefs.v207audioEQCustom207
    BiliClient.prefs.v207audioEQCustom207 = !current
    AppToast.show(this, "Audio EQ Custom207: ${if (!current) "ON" else "OFF"}")
}

// v207: Danmaku Bottom Max Count221
internal fun PlayerActivity.showV207DanmakuBottomMaxCount221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount221 = value
        AppToast.show(this, "Danmaku Bottom Max Count221: $value")
    }
}

// v207: Subtitle Bg Border228
internal fun PlayerActivity.showV207SubtitleBgBorder228Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder228
    BiliClient.prefs.v207subtitleBgBorder228 = !current
    AppToast.show(this, "Subtitle Bg Border228: ${if (!current) "ON" else "OFF"}")
}

// v207: Gesture Shake Action207
internal fun PlayerActivity.showV207GestureShakeAction207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207gestureShakeAction207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207gestureShakeAction207 = value
        AppToast.show(this, "Gesture Shake Action207: $value")
    }
}

// v207: Cast Audio Volume207
internal fun PlayerActivity.showV207CastAudioVolume207Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v207castAudioVolume207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207castAudioVolume207 = value
        AppToast.show(this, "Cast Audio Volume207: $value")
    }
}

// v207: Playlist Auto Skip Outro207
internal fun PlayerActivity.showV207PlaylistAutoSkipOutro207Toggle() {
    val current = BiliClient.prefs.v207playlistAutoSkipOutro207
    BiliClient.prefs.v207playlistAutoSkipOutro207 = !current
    AppToast.show(this, "Playlist Auto Skip Outro207: ${if (!current) "ON" else "OFF"}")
}

// v207: Cache Download Speed208
internal fun PlayerActivity.showV207CacheDownloadSpeed208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207cacheDownloadSpeed208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207cacheDownloadSpeed208 = value
        AppToast.show(this, "Cache Download Speed208: $value")
    }
}

// v207: Progress Bar Thumb Border207
internal fun PlayerActivity.showV207ProgressBarThumbBorder207Toggle() {
    val current = BiliClient.prefs.v207progressBarThumbBorder207
    BiliClient.prefs.v207progressBarThumbBorder207 = !current
    AppToast.show(this, "Progress Bar Thumb Border207: ${if (!current) "ON" else "OFF"}")
}

// v207: Volume Boost Peak207
internal fun PlayerActivity.showV207VolumeBoostPeak207Toggle() {
    val current = BiliClient.prefs.v207volumeBoostPeak207
    BiliClient.prefs.v207volumeBoostPeak207 = !current
    AppToast.show(this, "Volume Boost Peak207: ${if (!current) "ON" else "OFF"}")
}

// v207: History Bookmark Export207
internal fun PlayerActivity.showV207HistoryBookmarkExport207Toggle() {
    val current = BiliClient.prefs.v207historyBookmarkExport207
    BiliClient.prefs.v207historyBookmarkExport207 = !current
    AppToast.show(this, "History Bookmark Export207: ${if (!current) "ON" else "OFF"}")
}

// v207: Playback Chapter Sync207
internal fun PlayerActivity.showV207PlaybackChapterSync207Toggle() {
    val current = BiliClient.prefs.v207playbackChapterSync207
    BiliClient.prefs.v207playbackChapterSync207 = !current
    AppToast.show(this, "Playback Chapter Sync207: ${if (!current) "ON" else "OFF"}")
}

// v207: Screenshot Save Path207
internal fun PlayerActivity.showV207ScreenshotSavePath207Toggle() {
    val current = BiliClient.prefs.v207screenshotSavePath207
    BiliClient.prefs.v207screenshotSavePath207 = !current
    AppToast.show(this, "Screenshot Save Path207: ${if (!current) "ON" else "OFF"}")
}

// v207: Video Color Space207
internal fun PlayerActivity.showV207VideoColorSpace207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207videoColorSpace207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207videoColorSpace207 = value
        AppToast.show(this, "Video Color Space207: $value")
    }
}

// v207: Danmaku Bottom Max Count222
internal fun PlayerActivity.showV207DanmakuBottomMaxCount222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount222 = value
        AppToast.show(this, "Danmaku Bottom Max Count222: $value")
    }
}

// v207: Subtitle Bg Border229
internal fun PlayerActivity.showV207SubtitleBgBorder229Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder229
    BiliClient.prefs.v207subtitleBgBorder229 = !current
    AppToast.show(this, "Subtitle Bg Border229: ${if (!current) "ON" else "OFF"}")
}

// v208: Audio EQ Custom208
internal fun PlayerActivity.showV208AudioEQCustom208Toggle() {
    val current = BiliClient.prefs.v208audioEQCustom208
    BiliClient.prefs.v208audioEQCustom208 = !current
    AppToast.show(this, "Audio EQ Custom208: ${if (!current) "ON" else "OFF"}")
}

// v208: Danmaku Bottom Max Count223
internal fun PlayerActivity.showV208DanmakuBottomMaxCount223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount223 = value
        AppToast.show(this, "Danmaku Bottom Max Count223: $value")
    }
}

// v208: Subtitle Bg Border230
internal fun PlayerActivity.showV208SubtitleBgBorder230Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder230
    BiliClient.prefs.v208subtitleBgBorder230 = !current
    AppToast.show(this, "Subtitle Bg Border230: ${if (!current) "ON" else "OFF"}")
}

// v208: Gesture Shake Action208
internal fun PlayerActivity.showV208GestureShakeAction208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208gestureShakeAction208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208gestureShakeAction208 = value
        AppToast.show(this, "Gesture Shake Action208: $value")
    }
}

// v208: Cast Audio Volume208
internal fun PlayerActivity.showV208CastAudioVolume208Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v208castAudioVolume208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208castAudioVolume208 = value
        AppToast.show(this, "Cast Audio Volume208: $value")
    }
}

// v208: Playlist Auto Skip Outro208
internal fun PlayerActivity.showV208PlaylistAutoSkipOutro208Toggle() {
    val current = BiliClient.prefs.v208playlistAutoSkipOutro208
    BiliClient.prefs.v208playlistAutoSkipOutro208 = !current
    AppToast.show(this, "Playlist Auto Skip Outro208: ${if (!current) "ON" else "OFF"}")
}

// v208: Cache Download Speed209
internal fun PlayerActivity.showV208CacheDownloadSpeed209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208cacheDownloadSpeed209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208cacheDownloadSpeed209 = value
        AppToast.show(this, "Cache Download Speed209: $value")
    }
}

// v208: Progress Bar Thumb Border208
internal fun PlayerActivity.showV208ProgressBarThumbBorder208Toggle() {
    val current = BiliClient.prefs.v208progressBarThumbBorder208
    BiliClient.prefs.v208progressBarThumbBorder208 = !current
    AppToast.show(this, "Progress Bar Thumb Border208: ${if (!current) "ON" else "OFF"}")
}

// v208: Volume Boost Peak208
internal fun PlayerActivity.showV208VolumeBoostPeak208Toggle() {
    val current = BiliClient.prefs.v208volumeBoostPeak208
    BiliClient.prefs.v208volumeBoostPeak208 = !current
    AppToast.show(this, "Volume Boost Peak208: ${if (!current) "ON" else "OFF"}")
}

// v208: History Bookmark Export208
internal fun PlayerActivity.showV208HistoryBookmarkExport208Toggle() {
    val current = BiliClient.prefs.v208historyBookmarkExport208
    BiliClient.prefs.v208historyBookmarkExport208 = !current
    AppToast.show(this, "History Bookmark Export208: ${if (!current) "ON" else "OFF"}")
}

// v208: Playback Chapter Sync208
internal fun PlayerActivity.showV208PlaybackChapterSync208Toggle() {
    val current = BiliClient.prefs.v208playbackChapterSync208
    BiliClient.prefs.v208playbackChapterSync208 = !current
    AppToast.show(this, "Playback Chapter Sync208: ${if (!current) "ON" else "OFF"}")
}

// v208: Screenshot Save Path208
internal fun PlayerActivity.showV208ScreenshotSavePath208Toggle() {
    val current = BiliClient.prefs.v208screenshotSavePath208
    BiliClient.prefs.v208screenshotSavePath208 = !current
    AppToast.show(this, "Screenshot Save Path208: ${if (!current) "ON" else "OFF"}")
}

// v208: Video Color Space208
internal fun PlayerActivity.showV208VideoColorSpace208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208videoColorSpace208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208videoColorSpace208 = value
        AppToast.show(this, "Video Color Space208: $value")
    }
}

// v208: Danmaku Bottom Max Count224
internal fun PlayerActivity.showV208DanmakuBottomMaxCount224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount224 = value
        AppToast.show(this, "Danmaku Bottom Max Count224: $value")
    }
}

// v208: Subtitle Bg Border231
internal fun PlayerActivity.showV208SubtitleBgBorder231Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder231
    BiliClient.prefs.v208subtitleBgBorder231 = !current
    AppToast.show(this, "Subtitle Bg Border231: ${if (!current) "ON" else "OFF"}")
}

// v209: Audio EQ Custom209
internal fun PlayerActivity.showV209AudioEQCustom209Toggle() {
    val current = BiliClient.prefs.v209audioEQCustom209
    BiliClient.prefs.v209audioEQCustom209 = !current
    AppToast.show(this, "Audio EQ Custom209: ${if (!current) "ON" else "OFF"}")
}

// v209: Danmaku Bottom Max Count225
internal fun PlayerActivity.showV209DanmakuBottomMaxCount225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209danmakuBottomMaxCount225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209danmakuBottomMaxCount225 = value
        AppToast.show(this, "Danmaku Bottom Max Count225: $value")
    }
}

// v209: Subtitle Bg Border232
internal fun PlayerActivity.showV209SubtitleBgBorder232Toggle() {
    val current = BiliClient.prefs.v209subtitleBgBorder232
    BiliClient.prefs.v209subtitleBgBorder232 = !current
    AppToast.show(this, "Subtitle Bg Border232: ${if (!current) "ON" else "OFF"}")
}

// v209: Gesture Shake Action209
internal fun PlayerActivity.showV209GestureShakeAction209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209gestureShakeAction209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209gestureShakeAction209 = value
        AppToast.show(this, "Gesture Shake Action209: $value")
    }
}

// v209: Cast Audio Volume209
internal fun PlayerActivity.showV209CastAudioVolume209Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v209castAudioVolume209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209castAudioVolume209 = value
        AppToast.show(this, "Cast Audio Volume209: $value")
    }
}

// v209: Playlist Auto Skip Outro209
internal fun PlayerActivity.showV209PlaylistAutoSkipOutro209Toggle() {
    val current = BiliClient.prefs.v209playlistAutoSkipOutro209
    BiliClient.prefs.v209playlistAutoSkipOutro209 = !current
    AppToast.show(this, "Playlist Auto Skip Outro209: ${if (!current) "ON" else "OFF"}")
}

// v209: Cache Download Speed210
internal fun PlayerActivity.showV209CacheDownloadSpeed210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209cacheDownloadSpeed210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209cacheDownloadSpeed210 = value
        AppToast.show(this, "Cache Download Speed210: $value")
    }
}

// v209: Progress Bar Thumb Border209
internal fun PlayerActivity.showV209ProgressBarThumbBorder209Toggle() {
    val current = BiliClient.prefs.v209progressBarThumbBorder209
    BiliClient.prefs.v209progressBarThumbBorder209 = !current
    AppToast.show(this, "Progress Bar Thumb Border209: ${if (!current) "ON" else "OFF"}")
}

// v209: Volume Boost Peak209
internal fun PlayerActivity.showV209VolumeBoostPeak209Toggle() {
    val current = BiliClient.prefs.v209volumeBoostPeak209
    BiliClient.prefs.v209volumeBoostPeak209 = !current
    AppToast.show(this, "Volume Boost Peak209: ${if (!current) "ON" else "OFF"}")
}

// v209: History Bookmark Export209
internal fun PlayerActivity.showV209HistoryBookmarkExport209Toggle() {
    val current = BiliClient.prefs.v209historyBookmarkExport209
    BiliClient.prefs.v209historyBookmarkExport209 = !current
    AppToast.show(this, "History Bookmark Export209: ${if (!current) "ON" else "OFF"}")
}

// v209: Playback Chapter Sync209
internal fun PlayerActivity.showV209PlaybackChapterSync209Toggle() {
    val current = BiliClient.prefs.v209playbackChapterSync209
    BiliClient.prefs.v209playbackChapterSync209 = !current
    AppToast.show(this, "Playback Chapter Sync209: ${if (!current) "ON" else "OFF"}")
}

// v209: Screenshot Save Path209
internal fun PlayerActivity.showV209ScreenshotSavePath209Toggle() {
    val current = BiliClient.prefs.v209screenshotSavePath209
    BiliClient.prefs.v209screenshotSavePath209 = !current
    AppToast.show(this, "Screenshot Save Path209: ${if (!current) "ON" else "OFF"}")
}

// v209: Video Color Space209
internal fun PlayerActivity.showV209VideoColorSpace209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209videoColorSpace209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209videoColorSpace209 = value
        AppToast.show(this, "Video Color Space209: $value")
    }
}

// v1581: juice mode
internal fun PlayerActivity.showV1581JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1581juice
    FeaturePrefsStore.batch1581.v1581juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1581: jungle mode
internal fun PlayerActivity.showV1581JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1581jungle
    FeaturePrefsStore.batch1581.v1581jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1581: junior mode
internal fun PlayerActivity.showV1581JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1581junior
    FeaturePrefsStore.batch1581.v1581junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1581: junk mode
internal fun PlayerActivity.showV1581JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1581junk
    FeaturePrefsStore.batch1581.v1581junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1581: jury mode
internal fun PlayerActivity.showV1581JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1581jury
    FeaturePrefsStore.batch1581.v1581jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1581: just level
internal fun PlayerActivity.showV1581JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581just = value
        AppToast.show(this, "just: $value")
    }
}

// v1581: keen level
internal fun PlayerActivity.showV1581KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1581: keep level
internal fun PlayerActivity.showV1581KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1581: ketchup level
internal fun PlayerActivity.showV1581KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1581: kick level
internal fun PlayerActivity.showV1581KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1581: kid mode
internal fun PlayerActivity.showV1581KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kid
    FeaturePrefsStore.batch1581.v1581kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1581: kidney mode
internal fun PlayerActivity.showV1581KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kidney
    FeaturePrefsStore.batch1581.v1581kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1581: kind mode
internal fun PlayerActivity.showV1581KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kind
    FeaturePrefsStore.batch1581.v1581kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1581: kingdom mode
internal fun PlayerActivity.showV1581KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kingdom
    FeaturePrefsStore.batch1581.v1581kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1581: kiss mode
internal fun PlayerActivity.showV1581KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kiss
    FeaturePrefsStore.batch1581.v1581kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1582: juice mode
internal fun PlayerActivity.showV1582JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1582juice
    FeaturePrefsStore.batch1581.v1582juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1582: jungle mode
internal fun PlayerActivity.showV1582JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1582jungle
    FeaturePrefsStore.batch1581.v1582jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1582: junior mode
internal fun PlayerActivity.showV1582JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1582junior
    FeaturePrefsStore.batch1581.v1582junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1582: junk mode
internal fun PlayerActivity.showV1582JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1582junk
    FeaturePrefsStore.batch1581.v1582junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1582: jury mode
internal fun PlayerActivity.showV1582JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1582jury
    FeaturePrefsStore.batch1581.v1582jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1582: just level
internal fun PlayerActivity.showV1582JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582just = value
        AppToast.show(this, "just: $value")
    }
}

// v1582: keen level
internal fun PlayerActivity.showV1582KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1582: keep level
internal fun PlayerActivity.showV1582KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1582: ketchup level
internal fun PlayerActivity.showV1582KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1582: kick level
internal fun PlayerActivity.showV1582KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1582: kid mode
internal fun PlayerActivity.showV1582KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kid
    FeaturePrefsStore.batch1581.v1582kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1582: kidney mode
internal fun PlayerActivity.showV1582KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kidney
    FeaturePrefsStore.batch1581.v1582kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1582: kind mode
internal fun PlayerActivity.showV1582KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kind
    FeaturePrefsStore.batch1581.v1582kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1582: kingdom mode
internal fun PlayerActivity.showV1582KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kingdom
    FeaturePrefsStore.batch1581.v1582kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1582: kiss mode
internal fun PlayerActivity.showV1582KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kiss
    FeaturePrefsStore.batch1581.v1582kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1583: juice mode
internal fun PlayerActivity.showV1583JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1583juice
    FeaturePrefsStore.batch1581.v1583juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1583: jungle mode
internal fun PlayerActivity.showV1583JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1583jungle
    FeaturePrefsStore.batch1581.v1583jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1583: junior mode
internal fun PlayerActivity.showV1583JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1583junior
    FeaturePrefsStore.batch1581.v1583junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1583: junk mode
internal fun PlayerActivity.showV1583JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1583junk
    FeaturePrefsStore.batch1581.v1583junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1583: jury mode
internal fun PlayerActivity.showV1583JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1583jury
    FeaturePrefsStore.batch1581.v1583jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1583: just level
internal fun PlayerActivity.showV1583JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583just = value
        AppToast.show(this, "just: $value")
    }
}

// v1583: keen level
internal fun PlayerActivity.showV1583KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1583: keep level
internal fun PlayerActivity.showV1583KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1583: ketchup level
internal fun PlayerActivity.showV1583KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1583: kick level
internal fun PlayerActivity.showV1583KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1583: kid mode
internal fun PlayerActivity.showV1583KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kid
    FeaturePrefsStore.batch1581.v1583kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1583: kidney mode
internal fun PlayerActivity.showV1583KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kidney
    FeaturePrefsStore.batch1581.v1583kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1583: kind mode
internal fun PlayerActivity.showV1583KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kind
    FeaturePrefsStore.batch1581.v1583kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1583: kingdom mode
internal fun PlayerActivity.showV1583KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kingdom
    FeaturePrefsStore.batch1581.v1583kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1583: kiss mode
internal fun PlayerActivity.showV1583KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kiss
    FeaturePrefsStore.batch1581.v1583kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1584: juice mode
internal fun PlayerActivity.showV1584JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1584juice
    FeaturePrefsStore.batch1581.v1584juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1584: jungle mode
internal fun PlayerActivity.showV1584JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1584jungle
    FeaturePrefsStore.batch1581.v1584jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1584: junior mode
internal fun PlayerActivity.showV1584JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1584junior
    FeaturePrefsStore.batch1581.v1584junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1584: junk mode
internal fun PlayerActivity.showV1584JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1584junk
    FeaturePrefsStore.batch1581.v1584junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1584: jury mode
internal fun PlayerActivity.showV1584JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1584jury
    FeaturePrefsStore.batch1581.v1584jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1584: just level
internal fun PlayerActivity.showV1584JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584just = value
        AppToast.show(this, "just: $value")
    }
}

// v1584: keen level
internal fun PlayerActivity.showV1584KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1584: keep level
internal fun PlayerActivity.showV1584KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1584: ketchup level
internal fun PlayerActivity.showV1584KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1584: kick level
internal fun PlayerActivity.showV1584KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1584: kid mode
internal fun PlayerActivity.showV1584KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kid
    FeaturePrefsStore.batch1581.v1584kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1584: kidney mode
internal fun PlayerActivity.showV1584KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kidney
    FeaturePrefsStore.batch1581.v1584kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1584: kind mode
internal fun PlayerActivity.showV1584KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kind
    FeaturePrefsStore.batch1581.v1584kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1584: kingdom mode
internal fun PlayerActivity.showV1584KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kingdom
    FeaturePrefsStore.batch1581.v1584kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1584: kiss mode
internal fun PlayerActivity.showV1584KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kiss
    FeaturePrefsStore.batch1581.v1584kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1585: juice mode
internal fun PlayerActivity.showV1585JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1585juice
    FeaturePrefsStore.batch1581.v1585juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1585: jungle mode
internal fun PlayerActivity.showV1585JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1585jungle
    FeaturePrefsStore.batch1581.v1585jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1585: junior mode
internal fun PlayerActivity.showV1585JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1585junior
    FeaturePrefsStore.batch1581.v1585junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1585: junk mode
internal fun PlayerActivity.showV1585JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1585junk
    FeaturePrefsStore.batch1581.v1585junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1585: jury mode
internal fun PlayerActivity.showV1585JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1585jury
    FeaturePrefsStore.batch1581.v1585jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1585: just level
internal fun PlayerActivity.showV1585JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585just = value
        AppToast.show(this, "just: $value")
    }
}

// v1585: keen level
internal fun PlayerActivity.showV1585KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1585: keep level
internal fun PlayerActivity.showV1585KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1585: ketchup level
internal fun PlayerActivity.showV1585KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1585: kick level
internal fun PlayerActivity.showV1585KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1585: kid mode
internal fun PlayerActivity.showV1585KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kid
    FeaturePrefsStore.batch1581.v1585kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1585: kidney mode
internal fun PlayerActivity.showV1585KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kidney
    FeaturePrefsStore.batch1581.v1585kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1585: kind mode
internal fun PlayerActivity.showV1585KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kind
    FeaturePrefsStore.batch1581.v1585kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1585: kingdom mode
internal fun PlayerActivity.showV1585KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kingdom
    FeaturePrefsStore.batch1581.v1585kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1585: kiss mode
internal fun PlayerActivity.showV1585KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kiss
    FeaturePrefsStore.batch1581.v1585kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1586: juice mode
internal fun PlayerActivity.showV1586JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1586juice
    FeaturePrefsStore.batch1581.v1586juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1586: jungle mode
internal fun PlayerActivity.showV1586JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1586jungle
    FeaturePrefsStore.batch1581.v1586jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1586: junior mode
internal fun PlayerActivity.showV1586JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1586junior
    FeaturePrefsStore.batch1581.v1586junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1586: junk mode
internal fun PlayerActivity.showV1586JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1586junk
    FeaturePrefsStore.batch1581.v1586junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1586: jury mode
internal fun PlayerActivity.showV1586JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1586jury
    FeaturePrefsStore.batch1581.v1586jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1586: just level
internal fun PlayerActivity.showV1586JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586just = value
        AppToast.show(this, "just: $value")
    }
}

// v1586: keen level
internal fun PlayerActivity.showV1586KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1586: keep level
internal fun PlayerActivity.showV1586KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1586: ketchup level
internal fun PlayerActivity.showV1586KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1586: kick level
internal fun PlayerActivity.showV1586KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1586: kid mode
internal fun PlayerActivity.showV1586KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kid
    FeaturePrefsStore.batch1581.v1586kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1586: kidney mode
internal fun PlayerActivity.showV1586KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kidney
    FeaturePrefsStore.batch1581.v1586kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1586: kind mode
internal fun PlayerActivity.showV1586KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kind
    FeaturePrefsStore.batch1581.v1586kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1586: kingdom mode
internal fun PlayerActivity.showV1586KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kingdom
    FeaturePrefsStore.batch1581.v1586kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1586: kiss mode
internal fun PlayerActivity.showV1586KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kiss
    FeaturePrefsStore.batch1581.v1586kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1587: juice mode
internal fun PlayerActivity.showV1587JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1587juice
    FeaturePrefsStore.batch1581.v1587juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1587: jungle mode
internal fun PlayerActivity.showV1587JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1587jungle
    FeaturePrefsStore.batch1581.v1587jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1587: junior mode
internal fun PlayerActivity.showV1587JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1587junior
    FeaturePrefsStore.batch1581.v1587junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1587: junk mode
internal fun PlayerActivity.showV1587JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1587junk
    FeaturePrefsStore.batch1581.v1587junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1587: jury mode
internal fun PlayerActivity.showV1587JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1587jury
    FeaturePrefsStore.batch1581.v1587jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1587: just level
internal fun PlayerActivity.showV1587JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587just = value
        AppToast.show(this, "just: $value")
    }
}

// v1587: keen level
internal fun PlayerActivity.showV1587KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1587: keep level
internal fun PlayerActivity.showV1587KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1587: ketchup level
internal fun PlayerActivity.showV1587KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1587: kick level
internal fun PlayerActivity.showV1587KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1587: kid mode
internal fun PlayerActivity.showV1587KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kid
    FeaturePrefsStore.batch1581.v1587kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1587: kidney mode
internal fun PlayerActivity.showV1587KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kidney
    FeaturePrefsStore.batch1581.v1587kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1587: kind mode
internal fun PlayerActivity.showV1587KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kind
    FeaturePrefsStore.batch1581.v1587kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1587: kingdom mode
internal fun PlayerActivity.showV1587KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kingdom
    FeaturePrefsStore.batch1581.v1587kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1587: kiss mode
internal fun PlayerActivity.showV1587KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kiss
    FeaturePrefsStore.batch1581.v1587kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1588: juice mode
internal fun PlayerActivity.showV1588JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1588juice
    FeaturePrefsStore.batch1581.v1588juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1588: jungle mode
internal fun PlayerActivity.showV1588JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1588jungle
    FeaturePrefsStore.batch1581.v1588jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1588: junior mode
internal fun PlayerActivity.showV1588JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1588junior
    FeaturePrefsStore.batch1581.v1588junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1588: junk mode
internal fun PlayerActivity.showV1588JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1588junk
    FeaturePrefsStore.batch1581.v1588junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1588: jury mode
internal fun PlayerActivity.showV1588JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1588jury
    FeaturePrefsStore.batch1581.v1588jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1588: just level
internal fun PlayerActivity.showV1588JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588just = value
        AppToast.show(this, "just: $value")
    }
}

// v1588: keen level
internal fun PlayerActivity.showV1588KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1588: keep level
internal fun PlayerActivity.showV1588KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1588: ketchup level
internal fun PlayerActivity.showV1588KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1588: kick level
internal fun PlayerActivity.showV1588KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1588: kid mode
internal fun PlayerActivity.showV1588KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kid
    FeaturePrefsStore.batch1581.v1588kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1588: kidney mode
internal fun PlayerActivity.showV1588KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kidney
    FeaturePrefsStore.batch1581.v1588kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1588: kind mode
internal fun PlayerActivity.showV1588KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kind
    FeaturePrefsStore.batch1581.v1588kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1588: kingdom mode
internal fun PlayerActivity.showV1588KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kingdom
    FeaturePrefsStore.batch1581.v1588kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1588: kiss mode
internal fun PlayerActivity.showV1588KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kiss
    FeaturePrefsStore.batch1581.v1588kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1589: juice mode
internal fun PlayerActivity.showV1589JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1589juice
    FeaturePrefsStore.batch1581.v1589juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1589: jungle mode
internal fun PlayerActivity.showV1589JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1589jungle
    FeaturePrefsStore.batch1581.v1589jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1589: junior mode
internal fun PlayerActivity.showV1589JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1589junior
    FeaturePrefsStore.batch1581.v1589junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1589: junk mode
internal fun PlayerActivity.showV1589JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1589junk
    FeaturePrefsStore.batch1581.v1589junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1589: jury mode
internal fun PlayerActivity.showV1589JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1589jury
    FeaturePrefsStore.batch1581.v1589jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1589: just level
internal fun PlayerActivity.showV1589JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589just = value
        AppToast.show(this, "just: $value")
    }
}

// v1589: keen level
internal fun PlayerActivity.showV1589KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1589: keep level
internal fun PlayerActivity.showV1589KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1589: ketchup level
internal fun PlayerActivity.showV1589KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1589: kick level
internal fun PlayerActivity.showV1589KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1589: kid mode
internal fun PlayerActivity.showV1589KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kid
    FeaturePrefsStore.batch1581.v1589kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1589: kidney mode
internal fun PlayerActivity.showV1589KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kidney
    FeaturePrefsStore.batch1581.v1589kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1589: kind mode
internal fun PlayerActivity.showV1589KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kind
    FeaturePrefsStore.batch1581.v1589kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1589: kingdom mode
internal fun PlayerActivity.showV1589KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kingdom
    FeaturePrefsStore.batch1581.v1589kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1589: kiss mode
internal fun PlayerActivity.showV1589KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kiss
    FeaturePrefsStore.batch1581.v1589kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1590: juice mode
internal fun PlayerActivity.showV1590JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1590juice
    FeaturePrefsStore.batch1581.v1590juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1590: jungle mode
internal fun PlayerActivity.showV1590JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1590jungle
    FeaturePrefsStore.batch1581.v1590jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1590: junior mode
internal fun PlayerActivity.showV1590JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1590junior
    FeaturePrefsStore.batch1581.v1590junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1590: junk mode
internal fun PlayerActivity.showV1590JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1590junk
    FeaturePrefsStore.batch1581.v1590junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1590: jury mode
internal fun PlayerActivity.showV1590JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1590jury
    FeaturePrefsStore.batch1581.v1590jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1590: just level
internal fun PlayerActivity.showV1590JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590just = value
        AppToast.show(this, "just: $value")
    }
}

// v1590: keen level
internal fun PlayerActivity.showV1590KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1590: keep level
internal fun PlayerActivity.showV1590KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1590: ketchup level
internal fun PlayerActivity.showV1590KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1590: kick level
internal fun PlayerActivity.showV1590KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1590: kid mode
internal fun PlayerActivity.showV1590KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kid
    FeaturePrefsStore.batch1581.v1590kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1590: kidney mode
internal fun PlayerActivity.showV1590KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kidney
    FeaturePrefsStore.batch1581.v1590kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1590: kind mode
internal fun PlayerActivity.showV1590KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kind
    FeaturePrefsStore.batch1581.v1590kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1590: kingdom mode
internal fun PlayerActivity.showV1590KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kingdom
    FeaturePrefsStore.batch1581.v1590kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1590: kiss mode
internal fun PlayerActivity.showV1590KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kiss
    FeaturePrefsStore.batch1581.v1590kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1591: kite mode
internal fun PlayerActivity.showV1591KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1591kite
    FeaturePrefsStore.batch1591.v1591kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1591: knee mode
internal fun PlayerActivity.showV1591KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knee
    FeaturePrefsStore.batch1591.v1591knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1591: knife mode
internal fun PlayerActivity.showV1591KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knife
    FeaturePrefsStore.batch1591.v1591knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1591: knock mode
internal fun PlayerActivity.showV1591KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knock
    FeaturePrefsStore.batch1591.v1591knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1591: know mode
internal fun PlayerActivity.showV1591KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1591know
    FeaturePrefsStore.batch1591.v1591know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1591: lab level
internal fun PlayerActivity.showV1591LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1591: labor level
internal fun PlayerActivity.showV1591LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1591: ladder level
internal fun PlayerActivity.showV1591LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1591: lake level
internal fun PlayerActivity.showV1591LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1591: lamp level
internal fun PlayerActivity.showV1591LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1591: laptop mode
internal fun PlayerActivity.showV1591LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laptop
    FeaturePrefsStore.batch1591.v1591laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1591: large mode
internal fun PlayerActivity.showV1591LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591large
    FeaturePrefsStore.batch1591.v1591large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1591: laser mode
internal fun PlayerActivity.showV1591LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laser
    FeaturePrefsStore.batch1591.v1591laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1591: later mode
internal fun PlayerActivity.showV1591LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1591later
    FeaturePrefsStore.batch1591.v1591later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1591: laugh mode
internal fun PlayerActivity.showV1591LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laugh
    FeaturePrefsStore.batch1591.v1591laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1592: kite mode
internal fun PlayerActivity.showV1592KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1592kite
    FeaturePrefsStore.batch1591.v1592kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1592: knee mode
internal fun PlayerActivity.showV1592KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knee
    FeaturePrefsStore.batch1591.v1592knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1592: knife mode
internal fun PlayerActivity.showV1592KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knife
    FeaturePrefsStore.batch1591.v1592knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1592: knock mode
internal fun PlayerActivity.showV1592KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knock
    FeaturePrefsStore.batch1591.v1592knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1592: know mode
internal fun PlayerActivity.showV1592KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1592know
    FeaturePrefsStore.batch1591.v1592know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1592: lab level
internal fun PlayerActivity.showV1592LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1592: labor level
internal fun PlayerActivity.showV1592LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1592: ladder level
internal fun PlayerActivity.showV1592LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1592: lake level
internal fun PlayerActivity.showV1592LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1592: lamp level
internal fun PlayerActivity.showV1592LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1592: laptop mode
internal fun PlayerActivity.showV1592LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laptop
    FeaturePrefsStore.batch1591.v1592laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1592: large mode
internal fun PlayerActivity.showV1592LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592large
    FeaturePrefsStore.batch1591.v1592large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1592: laser mode
internal fun PlayerActivity.showV1592LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laser
    FeaturePrefsStore.batch1591.v1592laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1592: later mode
internal fun PlayerActivity.showV1592LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1592later
    FeaturePrefsStore.batch1591.v1592later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1592: laugh mode
internal fun PlayerActivity.showV1592LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laugh
    FeaturePrefsStore.batch1591.v1592laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1593: kite mode
internal fun PlayerActivity.showV1593KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1593kite
    FeaturePrefsStore.batch1591.v1593kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1593: knee mode
internal fun PlayerActivity.showV1593KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knee
    FeaturePrefsStore.batch1591.v1593knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1593: knife mode
internal fun PlayerActivity.showV1593KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knife
    FeaturePrefsStore.batch1591.v1593knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1593: knock mode
internal fun PlayerActivity.showV1593KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knock
    FeaturePrefsStore.batch1591.v1593knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1593: know mode
internal fun PlayerActivity.showV1593KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1593know
    FeaturePrefsStore.batch1591.v1593know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1593: lab level
internal fun PlayerActivity.showV1593LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1593: labor level
internal fun PlayerActivity.showV1593LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1593: ladder level
internal fun PlayerActivity.showV1593LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1593: lake level
internal fun PlayerActivity.showV1593LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1593: lamp level
internal fun PlayerActivity.showV1593LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1593: laptop mode
internal fun PlayerActivity.showV1593LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laptop
    FeaturePrefsStore.batch1591.v1593laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1593: large mode
internal fun PlayerActivity.showV1593LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593large
    FeaturePrefsStore.batch1591.v1593large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1593: laser mode
internal fun PlayerActivity.showV1593LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laser
    FeaturePrefsStore.batch1591.v1593laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1593: later mode
internal fun PlayerActivity.showV1593LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1593later
    FeaturePrefsStore.batch1591.v1593later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1593: laugh mode
internal fun PlayerActivity.showV1593LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laugh
    FeaturePrefsStore.batch1591.v1593laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1594: kite mode
internal fun PlayerActivity.showV1594KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1594kite
    FeaturePrefsStore.batch1591.v1594kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1594: knee mode
internal fun PlayerActivity.showV1594KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knee
    FeaturePrefsStore.batch1591.v1594knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1594: knife mode
internal fun PlayerActivity.showV1594KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knife
    FeaturePrefsStore.batch1591.v1594knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1594: knock mode
internal fun PlayerActivity.showV1594KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knock
    FeaturePrefsStore.batch1591.v1594knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1594: know mode
internal fun PlayerActivity.showV1594KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1594know
    FeaturePrefsStore.batch1591.v1594know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1594: lab level
internal fun PlayerActivity.showV1594LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1594: labor level
internal fun PlayerActivity.showV1594LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1594: ladder level
internal fun PlayerActivity.showV1594LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1594: lake level
internal fun PlayerActivity.showV1594LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1594: lamp level
internal fun PlayerActivity.showV1594LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1594: laptop mode
internal fun PlayerActivity.showV1594LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laptop
    FeaturePrefsStore.batch1591.v1594laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1594: large mode
internal fun PlayerActivity.showV1594LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594large
    FeaturePrefsStore.batch1591.v1594large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1594: laser mode
internal fun PlayerActivity.showV1594LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laser
    FeaturePrefsStore.batch1591.v1594laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1594: later mode
internal fun PlayerActivity.showV1594LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1594later
    FeaturePrefsStore.batch1591.v1594later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1594: laugh mode
internal fun PlayerActivity.showV1594LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laugh
    FeaturePrefsStore.batch1591.v1594laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1595: kite mode
internal fun PlayerActivity.showV1595KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1595kite
    FeaturePrefsStore.batch1591.v1595kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1595: knee mode
internal fun PlayerActivity.showV1595KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knee
    FeaturePrefsStore.batch1591.v1595knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1595: knife mode
internal fun PlayerActivity.showV1595KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knife
    FeaturePrefsStore.batch1591.v1595knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1595: knock mode
internal fun PlayerActivity.showV1595KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knock
    FeaturePrefsStore.batch1591.v1595knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1595: know mode
internal fun PlayerActivity.showV1595KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1595know
    FeaturePrefsStore.batch1591.v1595know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1595: lab level
internal fun PlayerActivity.showV1595LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1595: labor level
internal fun PlayerActivity.showV1595LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1595: ladder level
internal fun PlayerActivity.showV1595LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1595: lake level
internal fun PlayerActivity.showV1595LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1595: lamp level
internal fun PlayerActivity.showV1595LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1595: laptop mode
internal fun PlayerActivity.showV1595LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laptop
    FeaturePrefsStore.batch1591.v1595laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1595: large mode
internal fun PlayerActivity.showV1595LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595large
    FeaturePrefsStore.batch1591.v1595large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1595: laser mode
internal fun PlayerActivity.showV1595LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laser
    FeaturePrefsStore.batch1591.v1595laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1595: later mode
internal fun PlayerActivity.showV1595LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1595later
    FeaturePrefsStore.batch1591.v1595later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1595: laugh mode
internal fun PlayerActivity.showV1595LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laugh
    FeaturePrefsStore.batch1591.v1595laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1596: kite mode
internal fun PlayerActivity.showV1596KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1596kite
    FeaturePrefsStore.batch1591.v1596kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1596: knee mode
internal fun PlayerActivity.showV1596KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knee
    FeaturePrefsStore.batch1591.v1596knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1596: knife mode
internal fun PlayerActivity.showV1596KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knife
    FeaturePrefsStore.batch1591.v1596knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1596: knock mode
internal fun PlayerActivity.showV1596KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knock
    FeaturePrefsStore.batch1591.v1596knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1596: know mode
internal fun PlayerActivity.showV1596KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1596know
    FeaturePrefsStore.batch1591.v1596know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1596: lab level
internal fun PlayerActivity.showV1596LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1596: labor level
internal fun PlayerActivity.showV1596LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1596: ladder level
internal fun PlayerActivity.showV1596LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1596: lake level
internal fun PlayerActivity.showV1596LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1596: lamp level
internal fun PlayerActivity.showV1596LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1596: laptop mode
internal fun PlayerActivity.showV1596LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laptop
    FeaturePrefsStore.batch1591.v1596laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1596: large mode
internal fun PlayerActivity.showV1596LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596large
    FeaturePrefsStore.batch1591.v1596large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1596: laser mode
internal fun PlayerActivity.showV1596LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laser
    FeaturePrefsStore.batch1591.v1596laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1596: later mode
internal fun PlayerActivity.showV1596LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1596later
    FeaturePrefsStore.batch1591.v1596later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1596: laugh mode
internal fun PlayerActivity.showV1596LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laugh
    FeaturePrefsStore.batch1591.v1596laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1597: kite mode
internal fun PlayerActivity.showV1597KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1597kite
    FeaturePrefsStore.batch1591.v1597kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1597: knee mode
internal fun PlayerActivity.showV1597KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knee
    FeaturePrefsStore.batch1591.v1597knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1597: knife mode
internal fun PlayerActivity.showV1597KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knife
    FeaturePrefsStore.batch1591.v1597knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1597: knock mode
internal fun PlayerActivity.showV1597KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knock
    FeaturePrefsStore.batch1591.v1597knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1597: know mode
internal fun PlayerActivity.showV1597KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1597know
    FeaturePrefsStore.batch1591.v1597know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1597: lab level
internal fun PlayerActivity.showV1597LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1597: labor level
internal fun PlayerActivity.showV1597LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1597: ladder level
internal fun PlayerActivity.showV1597LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1597: lake level
internal fun PlayerActivity.showV1597LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1597: lamp level
internal fun PlayerActivity.showV1597LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1597: laptop mode
internal fun PlayerActivity.showV1597LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laptop
    FeaturePrefsStore.batch1591.v1597laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1597: large mode
internal fun PlayerActivity.showV1597LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597large
    FeaturePrefsStore.batch1591.v1597large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1597: laser mode
internal fun PlayerActivity.showV1597LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laser
    FeaturePrefsStore.batch1591.v1597laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1597: later mode
internal fun PlayerActivity.showV1597LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1597later
    FeaturePrefsStore.batch1591.v1597later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1597: laugh mode
internal fun PlayerActivity.showV1597LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laugh
    FeaturePrefsStore.batch1591.v1597laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1598: kite mode
internal fun PlayerActivity.showV1598KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1598kite
    FeaturePrefsStore.batch1591.v1598kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1598: knee mode
internal fun PlayerActivity.showV1598KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knee
    FeaturePrefsStore.batch1591.v1598knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1598: knife mode
internal fun PlayerActivity.showV1598KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knife
    FeaturePrefsStore.batch1591.v1598knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1598: knock mode
internal fun PlayerActivity.showV1598KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knock
    FeaturePrefsStore.batch1591.v1598knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1598: know mode
internal fun PlayerActivity.showV1598KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1598know
    FeaturePrefsStore.batch1591.v1598know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1598: lab level
internal fun PlayerActivity.showV1598LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1598: labor level
internal fun PlayerActivity.showV1598LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1598: ladder level
internal fun PlayerActivity.showV1598LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1598: lake level
internal fun PlayerActivity.showV1598LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1598: lamp level
internal fun PlayerActivity.showV1598LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1598: laptop mode
internal fun PlayerActivity.showV1598LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laptop
    FeaturePrefsStore.batch1591.v1598laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1598: large mode
internal fun PlayerActivity.showV1598LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598large
    FeaturePrefsStore.batch1591.v1598large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1598: laser mode
internal fun PlayerActivity.showV1598LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laser
    FeaturePrefsStore.batch1591.v1598laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1598: later mode
internal fun PlayerActivity.showV1598LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1598later
    FeaturePrefsStore.batch1591.v1598later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1598: laugh mode
internal fun PlayerActivity.showV1598LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laugh
    FeaturePrefsStore.batch1591.v1598laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1599: kite mode
internal fun PlayerActivity.showV1599KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1599kite
    FeaturePrefsStore.batch1591.v1599kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1599: knee mode
internal fun PlayerActivity.showV1599KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knee
    FeaturePrefsStore.batch1591.v1599knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1599: knife mode
internal fun PlayerActivity.showV1599KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knife
    FeaturePrefsStore.batch1591.v1599knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1599: knock mode
internal fun PlayerActivity.showV1599KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knock
    FeaturePrefsStore.batch1591.v1599knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1599: know mode
internal fun PlayerActivity.showV1599KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1599know
    FeaturePrefsStore.batch1591.v1599know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1599: lab level
internal fun PlayerActivity.showV1599LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1599: labor level
internal fun PlayerActivity.showV1599LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1599: ladder level
internal fun PlayerActivity.showV1599LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1599: lake level
internal fun PlayerActivity.showV1599LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1599: lamp level
internal fun PlayerActivity.showV1599LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1599: laptop mode
internal fun PlayerActivity.showV1599LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laptop
    FeaturePrefsStore.batch1591.v1599laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1599: large mode
internal fun PlayerActivity.showV1599LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599large
    FeaturePrefsStore.batch1591.v1599large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1599: laser mode
internal fun PlayerActivity.showV1599LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laser
    FeaturePrefsStore.batch1591.v1599laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1599: later mode
internal fun PlayerActivity.showV1599LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1599later
    FeaturePrefsStore.batch1591.v1599later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1599: laugh mode
internal fun PlayerActivity.showV1599LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laugh
    FeaturePrefsStore.batch1591.v1599laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1600: kite mode
internal fun PlayerActivity.showV1600KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1600kite
    FeaturePrefsStore.batch1591.v1600kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1600: knee mode
internal fun PlayerActivity.showV1600KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knee
    FeaturePrefsStore.batch1591.v1600knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1600: knife mode
internal fun PlayerActivity.showV1600KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knife
    FeaturePrefsStore.batch1591.v1600knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1600: knock mode
internal fun PlayerActivity.showV1600KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knock
    FeaturePrefsStore.batch1591.v1600knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1600: know mode
internal fun PlayerActivity.showV1600KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1600know
    FeaturePrefsStore.batch1591.v1600know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1600: lab level
internal fun PlayerActivity.showV1600LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1600: labor level
internal fun PlayerActivity.showV1600LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1600: ladder level
internal fun PlayerActivity.showV1600LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1600: lake level
internal fun PlayerActivity.showV1600LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1600: lamp level
internal fun PlayerActivity.showV1600LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1600: laptop mode
internal fun PlayerActivity.showV1600LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laptop
    FeaturePrefsStore.batch1591.v1600laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1600: large mode
internal fun PlayerActivity.showV1600LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600large
    FeaturePrefsStore.batch1591.v1600large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1600: laser mode
internal fun PlayerActivity.showV1600LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laser
    FeaturePrefsStore.batch1591.v1600laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1600: later mode
internal fun PlayerActivity.showV1600LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1600later
    FeaturePrefsStore.batch1591.v1600later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1600: laugh mode
internal fun PlayerActivity.showV1600LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laugh
    FeaturePrefsStore.batch1591.v1600laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}
