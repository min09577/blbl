package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1631: opera mode
internal fun PlayerActivity.showV1631OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1631opera
    FeaturePrefsStore.batch1631.v1631opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1631: opinion mode
internal fun PlayerActivity.showV1631OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1631opinion
    FeaturePrefsStore.batch1631.v1631opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1631: orange mode
internal fun PlayerActivity.showV1631OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1631orange
    FeaturePrefsStore.batch1631.v1631orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1631: ordinary mode
internal fun PlayerActivity.showV1631OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1631ordinary
    FeaturePrefsStore.batch1631.v1631ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1631: organ mode
internal fun PlayerActivity.showV1631OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1631organ
    FeaturePrefsStore.batch1631.v1631organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1631: orient level
internal fun PlayerActivity.showV1631OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1631: orphan level
internal fun PlayerActivity.showV1631OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1631: ostrich level
internal fun PlayerActivity.showV1631OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1631: other level
internal fun PlayerActivity.showV1631OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631other = value
        AppToast.show(this, "other: $value")
    }
}

// v1631: outdoor level
internal fun PlayerActivity.showV1631OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1631: outer mode
internal fun PlayerActivity.showV1631OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1631outer
    FeaturePrefsStore.batch1631.v1631outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1631: outside mode
internal fun PlayerActivity.showV1631OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1631outside
    FeaturePrefsStore.batch1631.v1631outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1631: oval mode
internal fun PlayerActivity.showV1631OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1631oval
    FeaturePrefsStore.batch1631.v1631oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1631: oven mode
internal fun PlayerActivity.showV1631OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1631oven
    FeaturePrefsStore.batch1631.v1631oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1631: over mode
internal fun PlayerActivity.showV1631OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1631over
    FeaturePrefsStore.batch1631.v1631over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1632: opera mode
internal fun PlayerActivity.showV1632OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1632opera
    FeaturePrefsStore.batch1631.v1632opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1632: opinion mode
internal fun PlayerActivity.showV1632OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1632opinion
    FeaturePrefsStore.batch1631.v1632opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1632: orange mode
internal fun PlayerActivity.showV1632OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1632orange
    FeaturePrefsStore.batch1631.v1632orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1632: ordinary mode
internal fun PlayerActivity.showV1632OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1632ordinary
    FeaturePrefsStore.batch1631.v1632ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1632: organ mode
internal fun PlayerActivity.showV1632OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1632organ
    FeaturePrefsStore.batch1631.v1632organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1632: orient level
internal fun PlayerActivity.showV1632OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1632: orphan level
internal fun PlayerActivity.showV1632OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1632: ostrich level
internal fun PlayerActivity.showV1632OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1632: other level
internal fun PlayerActivity.showV1632OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632other = value
        AppToast.show(this, "other: $value")
    }
}

// v1632: outdoor level
internal fun PlayerActivity.showV1632OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1632: outer mode
internal fun PlayerActivity.showV1632OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1632outer
    FeaturePrefsStore.batch1631.v1632outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1632: outside mode
internal fun PlayerActivity.showV1632OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1632outside
    FeaturePrefsStore.batch1631.v1632outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1632: oval mode
internal fun PlayerActivity.showV1632OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1632oval
    FeaturePrefsStore.batch1631.v1632oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1632: oven mode
internal fun PlayerActivity.showV1632OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1632oven
    FeaturePrefsStore.batch1631.v1632oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1632: over mode
internal fun PlayerActivity.showV1632OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1632over
    FeaturePrefsStore.batch1631.v1632over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1633: opera mode
internal fun PlayerActivity.showV1633OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1633opera
    FeaturePrefsStore.batch1631.v1633opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1633: opinion mode
internal fun PlayerActivity.showV1633OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1633opinion
    FeaturePrefsStore.batch1631.v1633opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1633: orange mode
internal fun PlayerActivity.showV1633OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1633orange
    FeaturePrefsStore.batch1631.v1633orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1633: ordinary mode
internal fun PlayerActivity.showV1633OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1633ordinary
    FeaturePrefsStore.batch1631.v1633ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1633: organ mode
internal fun PlayerActivity.showV1633OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1633organ
    FeaturePrefsStore.batch1631.v1633organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1633: orient level
internal fun PlayerActivity.showV1633OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1633: orphan level
internal fun PlayerActivity.showV1633OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1633: ostrich level
internal fun PlayerActivity.showV1633OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1633: other level
internal fun PlayerActivity.showV1633OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633other = value
        AppToast.show(this, "other: $value")
    }
}

// v1633: outdoor level
internal fun PlayerActivity.showV1633OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1633: outer mode
internal fun PlayerActivity.showV1633OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1633outer
    FeaturePrefsStore.batch1631.v1633outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1633: outside mode
internal fun PlayerActivity.showV1633OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1633outside
    FeaturePrefsStore.batch1631.v1633outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1633: oval mode
internal fun PlayerActivity.showV1633OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1633oval
    FeaturePrefsStore.batch1631.v1633oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1633: oven mode
internal fun PlayerActivity.showV1633OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1633oven
    FeaturePrefsStore.batch1631.v1633oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1633: over mode
internal fun PlayerActivity.showV1633OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1633over
    FeaturePrefsStore.batch1631.v1633over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1634: opera mode
internal fun PlayerActivity.showV1634OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1634opera
    FeaturePrefsStore.batch1631.v1634opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1634: opinion mode
internal fun PlayerActivity.showV1634OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1634opinion
    FeaturePrefsStore.batch1631.v1634opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1634: orange mode
internal fun PlayerActivity.showV1634OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1634orange
    FeaturePrefsStore.batch1631.v1634orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1634: ordinary mode
internal fun PlayerActivity.showV1634OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1634ordinary
    FeaturePrefsStore.batch1631.v1634ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1634: organ mode
internal fun PlayerActivity.showV1634OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1634organ
    FeaturePrefsStore.batch1631.v1634organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1634: orient level
internal fun PlayerActivity.showV1634OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1634: orphan level
internal fun PlayerActivity.showV1634OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1634: ostrich level
internal fun PlayerActivity.showV1634OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1634: other level
internal fun PlayerActivity.showV1634OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634other = value
        AppToast.show(this, "other: $value")
    }
}

// v1634: outdoor level
internal fun PlayerActivity.showV1634OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1634: outer mode
internal fun PlayerActivity.showV1634OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1634outer
    FeaturePrefsStore.batch1631.v1634outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1634: outside mode
internal fun PlayerActivity.showV1634OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1634outside
    FeaturePrefsStore.batch1631.v1634outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1634: oval mode
internal fun PlayerActivity.showV1634OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1634oval
    FeaturePrefsStore.batch1631.v1634oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1634: oven mode
internal fun PlayerActivity.showV1634OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1634oven
    FeaturePrefsStore.batch1631.v1634oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1634: over mode
internal fun PlayerActivity.showV1634OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1634over
    FeaturePrefsStore.batch1631.v1634over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1635: opera mode
internal fun PlayerActivity.showV1635OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1635opera
    FeaturePrefsStore.batch1631.v1635opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1635: opinion mode
internal fun PlayerActivity.showV1635OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1635opinion
    FeaturePrefsStore.batch1631.v1635opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1635: orange mode
internal fun PlayerActivity.showV1635OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1635orange
    FeaturePrefsStore.batch1631.v1635orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1635: ordinary mode
internal fun PlayerActivity.showV1635OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1635ordinary
    FeaturePrefsStore.batch1631.v1635ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1635: organ mode
internal fun PlayerActivity.showV1635OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1635organ
    FeaturePrefsStore.batch1631.v1635organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1635: orient level
internal fun PlayerActivity.showV1635OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1635: orphan level
internal fun PlayerActivity.showV1635OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1635: ostrich level
internal fun PlayerActivity.showV1635OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1635: other level
internal fun PlayerActivity.showV1635OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635other = value
        AppToast.show(this, "other: $value")
    }
}

// v1635: outdoor level
internal fun PlayerActivity.showV1635OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1635: outer mode
internal fun PlayerActivity.showV1635OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1635outer
    FeaturePrefsStore.batch1631.v1635outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1635: outside mode
internal fun PlayerActivity.showV1635OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1635outside
    FeaturePrefsStore.batch1631.v1635outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1635: oval mode
internal fun PlayerActivity.showV1635OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1635oval
    FeaturePrefsStore.batch1631.v1635oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1635: oven mode
internal fun PlayerActivity.showV1635OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1635oven
    FeaturePrefsStore.batch1631.v1635oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1635: over mode
internal fun PlayerActivity.showV1635OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1635over
    FeaturePrefsStore.batch1631.v1635over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1636: opera mode
internal fun PlayerActivity.showV1636OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1636opera
    FeaturePrefsStore.batch1631.v1636opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1636: opinion mode
internal fun PlayerActivity.showV1636OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1636opinion
    FeaturePrefsStore.batch1631.v1636opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1636: orange mode
internal fun PlayerActivity.showV1636OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1636orange
    FeaturePrefsStore.batch1631.v1636orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1636: ordinary mode
internal fun PlayerActivity.showV1636OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1636ordinary
    FeaturePrefsStore.batch1631.v1636ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1636: organ mode
internal fun PlayerActivity.showV1636OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1636organ
    FeaturePrefsStore.batch1631.v1636organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1636: orient level
internal fun PlayerActivity.showV1636OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1636: orphan level
internal fun PlayerActivity.showV1636OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1636: ostrich level
internal fun PlayerActivity.showV1636OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1636: other level
internal fun PlayerActivity.showV1636OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636other = value
        AppToast.show(this, "other: $value")
    }
}

// v1636: outdoor level
internal fun PlayerActivity.showV1636OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1636: outer mode
internal fun PlayerActivity.showV1636OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1636outer
    FeaturePrefsStore.batch1631.v1636outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1636: outside mode
internal fun PlayerActivity.showV1636OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1636outside
    FeaturePrefsStore.batch1631.v1636outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1636: oval mode
internal fun PlayerActivity.showV1636OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1636oval
    FeaturePrefsStore.batch1631.v1636oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1636: oven mode
internal fun PlayerActivity.showV1636OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1636oven
    FeaturePrefsStore.batch1631.v1636oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1636: over mode
internal fun PlayerActivity.showV1636OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1636over
    FeaturePrefsStore.batch1631.v1636over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1637: opera mode
internal fun PlayerActivity.showV1637OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1637opera
    FeaturePrefsStore.batch1631.v1637opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1637: opinion mode
internal fun PlayerActivity.showV1637OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1637opinion
    FeaturePrefsStore.batch1631.v1637opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1637: orange mode
internal fun PlayerActivity.showV1637OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1637orange
    FeaturePrefsStore.batch1631.v1637orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1637: ordinary mode
internal fun PlayerActivity.showV1637OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1637ordinary
    FeaturePrefsStore.batch1631.v1637ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1637: organ mode
internal fun PlayerActivity.showV1637OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1637organ
    FeaturePrefsStore.batch1631.v1637organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1637: orient level
internal fun PlayerActivity.showV1637OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1637: orphan level
internal fun PlayerActivity.showV1637OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1637: ostrich level
internal fun PlayerActivity.showV1637OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1637: other level
internal fun PlayerActivity.showV1637OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637other = value
        AppToast.show(this, "other: $value")
    }
}

// v1637: outdoor level
internal fun PlayerActivity.showV1637OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1637: outer mode
internal fun PlayerActivity.showV1637OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1637outer
    FeaturePrefsStore.batch1631.v1637outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1637: outside mode
internal fun PlayerActivity.showV1637OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1637outside
    FeaturePrefsStore.batch1631.v1637outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1637: oval mode
internal fun PlayerActivity.showV1637OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1637oval
    FeaturePrefsStore.batch1631.v1637oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1637: oven mode
internal fun PlayerActivity.showV1637OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1637oven
    FeaturePrefsStore.batch1631.v1637oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1637: over mode
internal fun PlayerActivity.showV1637OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1637over
    FeaturePrefsStore.batch1631.v1637over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1638: opera mode
internal fun PlayerActivity.showV1638OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1638opera
    FeaturePrefsStore.batch1631.v1638opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1638: opinion mode
internal fun PlayerActivity.showV1638OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1638opinion
    FeaturePrefsStore.batch1631.v1638opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1638: orange mode
internal fun PlayerActivity.showV1638OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1638orange
    FeaturePrefsStore.batch1631.v1638orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1638: ordinary mode
internal fun PlayerActivity.showV1638OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1638ordinary
    FeaturePrefsStore.batch1631.v1638ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1638: organ mode
internal fun PlayerActivity.showV1638OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1638organ
    FeaturePrefsStore.batch1631.v1638organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1638: orient level
internal fun PlayerActivity.showV1638OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1638: orphan level
internal fun PlayerActivity.showV1638OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1638: ostrich level
internal fun PlayerActivity.showV1638OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1638: other level
internal fun PlayerActivity.showV1638OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638other = value
        AppToast.show(this, "other: $value")
    }
}

// v1638: outdoor level
internal fun PlayerActivity.showV1638OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1638: outer mode
internal fun PlayerActivity.showV1638OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1638outer
    FeaturePrefsStore.batch1631.v1638outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1638: outside mode
internal fun PlayerActivity.showV1638OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1638outside
    FeaturePrefsStore.batch1631.v1638outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1638: oval mode
internal fun PlayerActivity.showV1638OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1638oval
    FeaturePrefsStore.batch1631.v1638oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1638: oven mode
internal fun PlayerActivity.showV1638OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1638oven
    FeaturePrefsStore.batch1631.v1638oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1638: over mode
internal fun PlayerActivity.showV1638OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1638over
    FeaturePrefsStore.batch1631.v1638over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1639: opera mode
internal fun PlayerActivity.showV1639OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1639opera
    FeaturePrefsStore.batch1631.v1639opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1639: opinion mode
internal fun PlayerActivity.showV1639OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1639opinion
    FeaturePrefsStore.batch1631.v1639opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1639: orange mode
internal fun PlayerActivity.showV1639OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1639orange
    FeaturePrefsStore.batch1631.v1639orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1639: ordinary mode
internal fun PlayerActivity.showV1639OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1639ordinary
    FeaturePrefsStore.batch1631.v1639ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1639: organ mode
internal fun PlayerActivity.showV1639OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1639organ
    FeaturePrefsStore.batch1631.v1639organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1639: orient level
internal fun PlayerActivity.showV1639OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1639: orphan level
internal fun PlayerActivity.showV1639OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1639: ostrich level
internal fun PlayerActivity.showV1639OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1639: other level
internal fun PlayerActivity.showV1639OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639other = value
        AppToast.show(this, "other: $value")
    }
}

// v1639: outdoor level
internal fun PlayerActivity.showV1639OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1639: outer mode
internal fun PlayerActivity.showV1639OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1639outer
    FeaturePrefsStore.batch1631.v1639outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1639: outside mode
internal fun PlayerActivity.showV1639OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1639outside
    FeaturePrefsStore.batch1631.v1639outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1639: oval mode
internal fun PlayerActivity.showV1639OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1639oval
    FeaturePrefsStore.batch1631.v1639oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1639: oven mode
internal fun PlayerActivity.showV1639OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1639oven
    FeaturePrefsStore.batch1631.v1639oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1639: over mode
internal fun PlayerActivity.showV1639OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1639over
    FeaturePrefsStore.batch1631.v1639over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1640: opera mode
internal fun PlayerActivity.showV1640OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1640opera
    FeaturePrefsStore.batch1631.v1640opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1640: opinion mode
internal fun PlayerActivity.showV1640OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1640opinion
    FeaturePrefsStore.batch1631.v1640opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1640: orange mode
internal fun PlayerActivity.showV1640OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1640orange
    FeaturePrefsStore.batch1631.v1640orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1640: ordinary mode
internal fun PlayerActivity.showV1640OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1640ordinary
    FeaturePrefsStore.batch1631.v1640ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1640: organ mode
internal fun PlayerActivity.showV1640OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1640organ
    FeaturePrefsStore.batch1631.v1640organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1640: orient level
internal fun PlayerActivity.showV1640OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1640: orphan level
internal fun PlayerActivity.showV1640OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1640: ostrich level
internal fun PlayerActivity.showV1640OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1640: other level
internal fun PlayerActivity.showV1640OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640other = value
        AppToast.show(this, "other: $value")
    }
}

// v1640: outdoor level
internal fun PlayerActivity.showV1640OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1640: outer mode
internal fun PlayerActivity.showV1640OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1640outer
    FeaturePrefsStore.batch1631.v1640outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1640: outside mode
internal fun PlayerActivity.showV1640OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1640outside
    FeaturePrefsStore.batch1631.v1640outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1640: oval mode
internal fun PlayerActivity.showV1640OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1640oval
    FeaturePrefsStore.batch1631.v1640oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1640: oven mode
internal fun PlayerActivity.showV1640OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1640oven
    FeaturePrefsStore.batch1631.v1640oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1640: over mode
internal fun PlayerActivity.showV1640OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1640over
    FeaturePrefsStore.batch1631.v1640over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

