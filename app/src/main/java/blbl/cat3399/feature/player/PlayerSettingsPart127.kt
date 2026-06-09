package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1451: fever mode
internal fun PlayerActivity.showV1451FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fever
    FeaturePrefsStore.batch1451.v1451fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1451: few mode
internal fun PlayerActivity.showV1451FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1451few
    FeaturePrefsStore.batch1451.v1451few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1451: fiber mode
internal fun PlayerActivity.showV1451FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fiber
    FeaturePrefsStore.batch1451.v1451fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1451: fifth mode
internal fun PlayerActivity.showV1451FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fifth
    FeaturePrefsStore.batch1451.v1451fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1451: fight mode
internal fun PlayerActivity.showV1451FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fight
    FeaturePrefsStore.batch1451.v1451fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1451: figure level
internal fun PlayerActivity.showV1451FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1451: film level
internal fun PlayerActivity.showV1451FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451film = value
        AppToast.show(this, "film: $value")
    }
}

// v1451: fine level
internal fun PlayerActivity.showV1451FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1451: firm level
internal fun PlayerActivity.showV1451FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1451: fiscal level
internal fun PlayerActivity.showV1451FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1451: fish mode
internal fun PlayerActivity.showV1451FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fish
    FeaturePrefsStore.batch1451.v1451fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1451: fist mode
internal fun PlayerActivity.showV1451FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fist
    FeaturePrefsStore.batch1451.v1451fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1451: five mode
internal fun PlayerActivity.showV1451FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1451five
    FeaturePrefsStore.batch1451.v1451five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1451: fixed mode
internal fun PlayerActivity.showV1451FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fixed
    FeaturePrefsStore.batch1451.v1451fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1451: flame mode
internal fun PlayerActivity.showV1451FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1451flame
    FeaturePrefsStore.batch1451.v1451flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1452: fever mode
internal fun PlayerActivity.showV1452FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fever
    FeaturePrefsStore.batch1451.v1452fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1452: few mode
internal fun PlayerActivity.showV1452FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1452few
    FeaturePrefsStore.batch1451.v1452few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1452: fiber mode
internal fun PlayerActivity.showV1452FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fiber
    FeaturePrefsStore.batch1451.v1452fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1452: fifth mode
internal fun PlayerActivity.showV1452FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fifth
    FeaturePrefsStore.batch1451.v1452fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1452: fight mode
internal fun PlayerActivity.showV1452FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fight
    FeaturePrefsStore.batch1451.v1452fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1452: figure level
internal fun PlayerActivity.showV1452FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1452: film level
internal fun PlayerActivity.showV1452FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452film = value
        AppToast.show(this, "film: $value")
    }
}

// v1452: fine level
internal fun PlayerActivity.showV1452FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1452: firm level
internal fun PlayerActivity.showV1452FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1452: fiscal level
internal fun PlayerActivity.showV1452FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1452: fish mode
internal fun PlayerActivity.showV1452FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fish
    FeaturePrefsStore.batch1451.v1452fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1452: fist mode
internal fun PlayerActivity.showV1452FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fist
    FeaturePrefsStore.batch1451.v1452fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1452: five mode
internal fun PlayerActivity.showV1452FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1452five
    FeaturePrefsStore.batch1451.v1452five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1452: fixed mode
internal fun PlayerActivity.showV1452FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fixed
    FeaturePrefsStore.batch1451.v1452fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1452: flame mode
internal fun PlayerActivity.showV1452FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1452flame
    FeaturePrefsStore.batch1451.v1452flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1453: fever mode
internal fun PlayerActivity.showV1453FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fever
    FeaturePrefsStore.batch1451.v1453fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1453: few mode
internal fun PlayerActivity.showV1453FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1453few
    FeaturePrefsStore.batch1451.v1453few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1453: fiber mode
internal fun PlayerActivity.showV1453FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fiber
    FeaturePrefsStore.batch1451.v1453fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1453: fifth mode
internal fun PlayerActivity.showV1453FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fifth
    FeaturePrefsStore.batch1451.v1453fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1453: fight mode
internal fun PlayerActivity.showV1453FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fight
    FeaturePrefsStore.batch1451.v1453fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1453: figure level
internal fun PlayerActivity.showV1453FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1453: film level
internal fun PlayerActivity.showV1453FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453film = value
        AppToast.show(this, "film: $value")
    }
}

// v1453: fine level
internal fun PlayerActivity.showV1453FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1453: firm level
internal fun PlayerActivity.showV1453FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1453: fiscal level
internal fun PlayerActivity.showV1453FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1453: fish mode
internal fun PlayerActivity.showV1453FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fish
    FeaturePrefsStore.batch1451.v1453fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1453: fist mode
internal fun PlayerActivity.showV1453FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fist
    FeaturePrefsStore.batch1451.v1453fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1453: five mode
internal fun PlayerActivity.showV1453FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1453five
    FeaturePrefsStore.batch1451.v1453five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1453: fixed mode
internal fun PlayerActivity.showV1453FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fixed
    FeaturePrefsStore.batch1451.v1453fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1453: flame mode
internal fun PlayerActivity.showV1453FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1453flame
    FeaturePrefsStore.batch1451.v1453flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1454: fever mode
internal fun PlayerActivity.showV1454FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fever
    FeaturePrefsStore.batch1451.v1454fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1454: few mode
internal fun PlayerActivity.showV1454FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1454few
    FeaturePrefsStore.batch1451.v1454few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1454: fiber mode
internal fun PlayerActivity.showV1454FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fiber
    FeaturePrefsStore.batch1451.v1454fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1454: fifth mode
internal fun PlayerActivity.showV1454FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fifth
    FeaturePrefsStore.batch1451.v1454fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1454: fight mode
internal fun PlayerActivity.showV1454FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fight
    FeaturePrefsStore.batch1451.v1454fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1454: figure level
internal fun PlayerActivity.showV1454FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1454: film level
internal fun PlayerActivity.showV1454FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454film = value
        AppToast.show(this, "film: $value")
    }
}

// v1454: fine level
internal fun PlayerActivity.showV1454FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1454: firm level
internal fun PlayerActivity.showV1454FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1454: fiscal level
internal fun PlayerActivity.showV1454FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1454: fish mode
internal fun PlayerActivity.showV1454FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fish
    FeaturePrefsStore.batch1451.v1454fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1454: fist mode
internal fun PlayerActivity.showV1454FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fist
    FeaturePrefsStore.batch1451.v1454fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1454: five mode
internal fun PlayerActivity.showV1454FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1454five
    FeaturePrefsStore.batch1451.v1454five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1454: fixed mode
internal fun PlayerActivity.showV1454FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fixed
    FeaturePrefsStore.batch1451.v1454fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1454: flame mode
internal fun PlayerActivity.showV1454FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1454flame
    FeaturePrefsStore.batch1451.v1454flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1455: fever mode
internal fun PlayerActivity.showV1455FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fever
    FeaturePrefsStore.batch1451.v1455fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1455: few mode
internal fun PlayerActivity.showV1455FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1455few
    FeaturePrefsStore.batch1451.v1455few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1455: fiber mode
internal fun PlayerActivity.showV1455FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fiber
    FeaturePrefsStore.batch1451.v1455fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1455: fifth mode
internal fun PlayerActivity.showV1455FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fifth
    FeaturePrefsStore.batch1451.v1455fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1455: fight mode
internal fun PlayerActivity.showV1455FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fight
    FeaturePrefsStore.batch1451.v1455fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1455: figure level
internal fun PlayerActivity.showV1455FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1455: film level
internal fun PlayerActivity.showV1455FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455film = value
        AppToast.show(this, "film: $value")
    }
}

// v1455: fine level
internal fun PlayerActivity.showV1455FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1455: firm level
internal fun PlayerActivity.showV1455FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1455: fiscal level
internal fun PlayerActivity.showV1455FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1455: fish mode
internal fun PlayerActivity.showV1455FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fish
    FeaturePrefsStore.batch1451.v1455fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1455: fist mode
internal fun PlayerActivity.showV1455FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fist
    FeaturePrefsStore.batch1451.v1455fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1455: five mode
internal fun PlayerActivity.showV1455FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1455five
    FeaturePrefsStore.batch1451.v1455five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1455: fixed mode
internal fun PlayerActivity.showV1455FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fixed
    FeaturePrefsStore.batch1451.v1455fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1455: flame mode
internal fun PlayerActivity.showV1455FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1455flame
    FeaturePrefsStore.batch1451.v1455flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1456: fever mode
internal fun PlayerActivity.showV1456FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fever
    FeaturePrefsStore.batch1451.v1456fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1456: few mode
internal fun PlayerActivity.showV1456FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1456few
    FeaturePrefsStore.batch1451.v1456few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1456: fiber mode
internal fun PlayerActivity.showV1456FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fiber
    FeaturePrefsStore.batch1451.v1456fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1456: fifth mode
internal fun PlayerActivity.showV1456FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fifth
    FeaturePrefsStore.batch1451.v1456fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1456: fight mode
internal fun PlayerActivity.showV1456FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fight
    FeaturePrefsStore.batch1451.v1456fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1456: figure level
internal fun PlayerActivity.showV1456FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1456: film level
internal fun PlayerActivity.showV1456FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456film = value
        AppToast.show(this, "film: $value")
    }
}

// v1456: fine level
internal fun PlayerActivity.showV1456FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1456: firm level
internal fun PlayerActivity.showV1456FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1456: fiscal level
internal fun PlayerActivity.showV1456FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1456: fish mode
internal fun PlayerActivity.showV1456FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fish
    FeaturePrefsStore.batch1451.v1456fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1456: fist mode
internal fun PlayerActivity.showV1456FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fist
    FeaturePrefsStore.batch1451.v1456fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1456: five mode
internal fun PlayerActivity.showV1456FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1456five
    FeaturePrefsStore.batch1451.v1456five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1456: fixed mode
internal fun PlayerActivity.showV1456FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fixed
    FeaturePrefsStore.batch1451.v1456fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1456: flame mode
internal fun PlayerActivity.showV1456FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1456flame
    FeaturePrefsStore.batch1451.v1456flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1457: fever mode
internal fun PlayerActivity.showV1457FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fever
    FeaturePrefsStore.batch1451.v1457fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1457: few mode
internal fun PlayerActivity.showV1457FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1457few
    FeaturePrefsStore.batch1451.v1457few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1457: fiber mode
internal fun PlayerActivity.showV1457FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fiber
    FeaturePrefsStore.batch1451.v1457fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1457: fifth mode
internal fun PlayerActivity.showV1457FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fifth
    FeaturePrefsStore.batch1451.v1457fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1457: fight mode
internal fun PlayerActivity.showV1457FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fight
    FeaturePrefsStore.batch1451.v1457fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1457: figure level
internal fun PlayerActivity.showV1457FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1457: film level
internal fun PlayerActivity.showV1457FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457film = value
        AppToast.show(this, "film: $value")
    }
}

// v1457: fine level
internal fun PlayerActivity.showV1457FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1457: firm level
internal fun PlayerActivity.showV1457FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1457: fiscal level
internal fun PlayerActivity.showV1457FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1457: fish mode
internal fun PlayerActivity.showV1457FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fish
    FeaturePrefsStore.batch1451.v1457fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1457: fist mode
internal fun PlayerActivity.showV1457FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fist
    FeaturePrefsStore.batch1451.v1457fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1457: five mode
internal fun PlayerActivity.showV1457FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1457five
    FeaturePrefsStore.batch1451.v1457five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1457: fixed mode
internal fun PlayerActivity.showV1457FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fixed
    FeaturePrefsStore.batch1451.v1457fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1457: flame mode
internal fun PlayerActivity.showV1457FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1457flame
    FeaturePrefsStore.batch1451.v1457flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1458: fever mode
internal fun PlayerActivity.showV1458FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fever
    FeaturePrefsStore.batch1451.v1458fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1458: few mode
internal fun PlayerActivity.showV1458FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1458few
    FeaturePrefsStore.batch1451.v1458few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1458: fiber mode
internal fun PlayerActivity.showV1458FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fiber
    FeaturePrefsStore.batch1451.v1458fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1458: fifth mode
internal fun PlayerActivity.showV1458FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fifth
    FeaturePrefsStore.batch1451.v1458fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1458: fight mode
internal fun PlayerActivity.showV1458FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fight
    FeaturePrefsStore.batch1451.v1458fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1458: figure level
internal fun PlayerActivity.showV1458FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1458: film level
internal fun PlayerActivity.showV1458FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458film = value
        AppToast.show(this, "film: $value")
    }
}

// v1458: fine level
internal fun PlayerActivity.showV1458FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1458: firm level
internal fun PlayerActivity.showV1458FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1458: fiscal level
internal fun PlayerActivity.showV1458FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1458: fish mode
internal fun PlayerActivity.showV1458FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fish
    FeaturePrefsStore.batch1451.v1458fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1458: fist mode
internal fun PlayerActivity.showV1458FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fist
    FeaturePrefsStore.batch1451.v1458fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1458: five mode
internal fun PlayerActivity.showV1458FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1458five
    FeaturePrefsStore.batch1451.v1458five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1458: fixed mode
internal fun PlayerActivity.showV1458FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fixed
    FeaturePrefsStore.batch1451.v1458fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1458: flame mode
internal fun PlayerActivity.showV1458FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1458flame
    FeaturePrefsStore.batch1451.v1458flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1459: fever mode
internal fun PlayerActivity.showV1459FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fever
    FeaturePrefsStore.batch1451.v1459fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1459: few mode
internal fun PlayerActivity.showV1459FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1459few
    FeaturePrefsStore.batch1451.v1459few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1459: fiber mode
internal fun PlayerActivity.showV1459FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fiber
    FeaturePrefsStore.batch1451.v1459fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1459: fifth mode
internal fun PlayerActivity.showV1459FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fifth
    FeaturePrefsStore.batch1451.v1459fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1459: fight mode
internal fun PlayerActivity.showV1459FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fight
    FeaturePrefsStore.batch1451.v1459fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1459: figure level
internal fun PlayerActivity.showV1459FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1459: film level
internal fun PlayerActivity.showV1459FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459film = value
        AppToast.show(this, "film: $value")
    }
}

// v1459: fine level
internal fun PlayerActivity.showV1459FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1459: firm level
internal fun PlayerActivity.showV1459FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1459: fiscal level
internal fun PlayerActivity.showV1459FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1459: fish mode
internal fun PlayerActivity.showV1459FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fish
    FeaturePrefsStore.batch1451.v1459fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1459: fist mode
internal fun PlayerActivity.showV1459FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fist
    FeaturePrefsStore.batch1451.v1459fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1459: five mode
internal fun PlayerActivity.showV1459FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1459five
    FeaturePrefsStore.batch1451.v1459five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1459: fixed mode
internal fun PlayerActivity.showV1459FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fixed
    FeaturePrefsStore.batch1451.v1459fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1459: flame mode
internal fun PlayerActivity.showV1459FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1459flame
    FeaturePrefsStore.batch1451.v1459flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1460: fever mode
internal fun PlayerActivity.showV1460FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fever
    FeaturePrefsStore.batch1451.v1460fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1460: few mode
internal fun PlayerActivity.showV1460FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1460few
    FeaturePrefsStore.batch1451.v1460few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1460: fiber mode
internal fun PlayerActivity.showV1460FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fiber
    FeaturePrefsStore.batch1451.v1460fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1460: fifth mode
internal fun PlayerActivity.showV1460FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fifth
    FeaturePrefsStore.batch1451.v1460fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1460: fight mode
internal fun PlayerActivity.showV1460FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fight
    FeaturePrefsStore.batch1451.v1460fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1460: figure level
internal fun PlayerActivity.showV1460FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1460: film level
internal fun PlayerActivity.showV1460FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460film = value
        AppToast.show(this, "film: $value")
    }
}

// v1460: fine level
internal fun PlayerActivity.showV1460FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1460: firm level
internal fun PlayerActivity.showV1460FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1460: fiscal level
internal fun PlayerActivity.showV1460FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1460: fish mode
internal fun PlayerActivity.showV1460FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fish
    FeaturePrefsStore.batch1451.v1460fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1460: fist mode
internal fun PlayerActivity.showV1460FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fist
    FeaturePrefsStore.batch1451.v1460fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1460: five mode
internal fun PlayerActivity.showV1460FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1460five
    FeaturePrefsStore.batch1451.v1460five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1460: fixed mode
internal fun PlayerActivity.showV1460FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fixed
    FeaturePrefsStore.batch1451.v1460fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1460: flame mode
internal fun PlayerActivity.showV1460FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1460flame
    FeaturePrefsStore.batch1451.v1460flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

