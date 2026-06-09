package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

