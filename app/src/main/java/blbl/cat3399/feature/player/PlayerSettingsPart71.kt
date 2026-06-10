package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v901: learn mode
internal fun PlayerActivity.showV901LearnToggle() {
    val current = FeaturePrefsStore.batch901.v901learn
    FeaturePrefsStore.batch901.v901learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v901: left mode
internal fun PlayerActivity.showV901LeftToggle() {
    val current = FeaturePrefsStore.batch901.v901left
    FeaturePrefsStore.batch901.v901left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v901: length mode
internal fun PlayerActivity.showV901LengthToggle() {
    val current = FeaturePrefsStore.batch901.v901length
    FeaturePrefsStore.batch901.v901length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v901: level mode
internal fun PlayerActivity.showV901LevelToggle() {
    val current = FeaturePrefsStore.batch901.v901level
    FeaturePrefsStore.batch901.v901level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v901: library mode
internal fun PlayerActivity.showV901LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v901library
    FeaturePrefsStore.batch901.v901library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v901: license level
internal fun PlayerActivity.showV901LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901license = value
        AppToast.show(this, "license: $value")
    }
}

// v901: life level
internal fun PlayerActivity.showV901LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901life = value
        AppToast.show(this, "life: $value")
    }
}

// v901: lifetime level
internal fun PlayerActivity.showV901LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v901: light level
internal fun PlayerActivity.showV901LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901light = value
        AppToast.show(this, "light: $value")
    }
}

// v901: limit level
internal fun PlayerActivity.showV901LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v901: line mode
internal fun PlayerActivity.showV901LineToggle() {
    val current = FeaturePrefsStore.batch901.v901line
    FeaturePrefsStore.batch901.v901line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v901: link mode
internal fun PlayerActivity.showV901LinkToggle() {
    val current = FeaturePrefsStore.batch901.v901link
    FeaturePrefsStore.batch901.v901link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v901: list mode
internal fun PlayerActivity.showV901ListToggle() {
    val current = FeaturePrefsStore.batch901.v901list
    FeaturePrefsStore.batch901.v901list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v901: live mode
internal fun PlayerActivity.showV901LiveToggle() {
    val current = FeaturePrefsStore.batch901.v901live
    FeaturePrefsStore.batch901.v901live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v901: load mode
internal fun PlayerActivity.showV901LoadToggle() {
    val current = FeaturePrefsStore.batch901.v901load
    FeaturePrefsStore.batch901.v901load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v902: learn mode
internal fun PlayerActivity.showV902LearnToggle() {
    val current = FeaturePrefsStore.batch901.v902learn
    FeaturePrefsStore.batch901.v902learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v902: left mode
internal fun PlayerActivity.showV902LeftToggle() {
    val current = FeaturePrefsStore.batch901.v902left
    FeaturePrefsStore.batch901.v902left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v902: length mode
internal fun PlayerActivity.showV902LengthToggle() {
    val current = FeaturePrefsStore.batch901.v902length
    FeaturePrefsStore.batch901.v902length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v902: level mode
internal fun PlayerActivity.showV902LevelToggle() {
    val current = FeaturePrefsStore.batch901.v902level
    FeaturePrefsStore.batch901.v902level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v902: library mode
internal fun PlayerActivity.showV902LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v902library
    FeaturePrefsStore.batch901.v902library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v902: license level
internal fun PlayerActivity.showV902LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902license = value
        AppToast.show(this, "license: $value")
    }
}

// v902: life level
internal fun PlayerActivity.showV902LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902life = value
        AppToast.show(this, "life: $value")
    }
}

// v902: lifetime level
internal fun PlayerActivity.showV902LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v902: light level
internal fun PlayerActivity.showV902LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902light = value
        AppToast.show(this, "light: $value")
    }
}

// v902: limit level
internal fun PlayerActivity.showV902LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v902: line mode
internal fun PlayerActivity.showV902LineToggle() {
    val current = FeaturePrefsStore.batch901.v902line
    FeaturePrefsStore.batch901.v902line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v902: link mode
internal fun PlayerActivity.showV902LinkToggle() {
    val current = FeaturePrefsStore.batch901.v902link
    FeaturePrefsStore.batch901.v902link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v902: list mode
internal fun PlayerActivity.showV902ListToggle() {
    val current = FeaturePrefsStore.batch901.v902list
    FeaturePrefsStore.batch901.v902list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v902: live mode
internal fun PlayerActivity.showV902LiveToggle() {
    val current = FeaturePrefsStore.batch901.v902live
    FeaturePrefsStore.batch901.v902live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v902: load mode
internal fun PlayerActivity.showV902LoadToggle() {
    val current = FeaturePrefsStore.batch901.v902load
    FeaturePrefsStore.batch901.v902load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v903: learn mode
internal fun PlayerActivity.showV903LearnToggle() {
    val current = FeaturePrefsStore.batch901.v903learn
    FeaturePrefsStore.batch901.v903learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v903: left mode
internal fun PlayerActivity.showV903LeftToggle() {
    val current = FeaturePrefsStore.batch901.v903left
    FeaturePrefsStore.batch901.v903left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v903: length mode
internal fun PlayerActivity.showV903LengthToggle() {
    val current = FeaturePrefsStore.batch901.v903length
    FeaturePrefsStore.batch901.v903length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v903: level mode
internal fun PlayerActivity.showV903LevelToggle() {
    val current = FeaturePrefsStore.batch901.v903level
    FeaturePrefsStore.batch901.v903level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v903: library mode
internal fun PlayerActivity.showV903LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v903library
    FeaturePrefsStore.batch901.v903library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v903: license level
internal fun PlayerActivity.showV903LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903license = value
        AppToast.show(this, "license: $value")
    }
}

// v903: life level
internal fun PlayerActivity.showV903LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903life = value
        AppToast.show(this, "life: $value")
    }
}

// v903: lifetime level
internal fun PlayerActivity.showV903LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v903: light level
internal fun PlayerActivity.showV903LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903light = value
        AppToast.show(this, "light: $value")
    }
}

// v903: limit level
internal fun PlayerActivity.showV903LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v903: line mode
internal fun PlayerActivity.showV903LineToggle() {
    val current = FeaturePrefsStore.batch901.v903line
    FeaturePrefsStore.batch901.v903line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v903: link mode
internal fun PlayerActivity.showV903LinkToggle() {
    val current = FeaturePrefsStore.batch901.v903link
    FeaturePrefsStore.batch901.v903link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v903: list mode
internal fun PlayerActivity.showV903ListToggle() {
    val current = FeaturePrefsStore.batch901.v903list
    FeaturePrefsStore.batch901.v903list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v903: live mode
internal fun PlayerActivity.showV903LiveToggle() {
    val current = FeaturePrefsStore.batch901.v903live
    FeaturePrefsStore.batch901.v903live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v903: load mode
internal fun PlayerActivity.showV903LoadToggle() {
    val current = FeaturePrefsStore.batch901.v903load
    FeaturePrefsStore.batch901.v903load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v904: learn mode
internal fun PlayerActivity.showV904LearnToggle() {
    val current = FeaturePrefsStore.batch901.v904learn
    FeaturePrefsStore.batch901.v904learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v904: left mode
internal fun PlayerActivity.showV904LeftToggle() {
    val current = FeaturePrefsStore.batch901.v904left
    FeaturePrefsStore.batch901.v904left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v904: length mode
internal fun PlayerActivity.showV904LengthToggle() {
    val current = FeaturePrefsStore.batch901.v904length
    FeaturePrefsStore.batch901.v904length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v904: level mode
internal fun PlayerActivity.showV904LevelToggle() {
    val current = FeaturePrefsStore.batch901.v904level
    FeaturePrefsStore.batch901.v904level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v904: library mode
internal fun PlayerActivity.showV904LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v904library
    FeaturePrefsStore.batch901.v904library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v904: license level
internal fun PlayerActivity.showV904LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904license = value
        AppToast.show(this, "license: $value")
    }
}

// v904: life level
internal fun PlayerActivity.showV904LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904life = value
        AppToast.show(this, "life: $value")
    }
}

// v904: lifetime level
internal fun PlayerActivity.showV904LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v904: light level
internal fun PlayerActivity.showV904LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904light = value
        AppToast.show(this, "light: $value")
    }
}

// v904: limit level
internal fun PlayerActivity.showV904LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v904: line mode
internal fun PlayerActivity.showV904LineToggle() {
    val current = FeaturePrefsStore.batch901.v904line
    FeaturePrefsStore.batch901.v904line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v904: link mode
internal fun PlayerActivity.showV904LinkToggle() {
    val current = FeaturePrefsStore.batch901.v904link
    FeaturePrefsStore.batch901.v904link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v904: list mode
internal fun PlayerActivity.showV904ListToggle() {
    val current = FeaturePrefsStore.batch901.v904list
    FeaturePrefsStore.batch901.v904list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v904: live mode
internal fun PlayerActivity.showV904LiveToggle() {
    val current = FeaturePrefsStore.batch901.v904live
    FeaturePrefsStore.batch901.v904live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v904: load mode
internal fun PlayerActivity.showV904LoadToggle() {
    val current = FeaturePrefsStore.batch901.v904load
    FeaturePrefsStore.batch901.v904load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v905: learn mode
internal fun PlayerActivity.showV905LearnToggle() {
    val current = FeaturePrefsStore.batch901.v905learn
    FeaturePrefsStore.batch901.v905learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v905: left mode
internal fun PlayerActivity.showV905LeftToggle() {
    val current = FeaturePrefsStore.batch901.v905left
    FeaturePrefsStore.batch901.v905left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v905: length mode
internal fun PlayerActivity.showV905LengthToggle() {
    val current = FeaturePrefsStore.batch901.v905length
    FeaturePrefsStore.batch901.v905length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v905: level mode
internal fun PlayerActivity.showV905LevelToggle() {
    val current = FeaturePrefsStore.batch901.v905level
    FeaturePrefsStore.batch901.v905level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v905: library mode
internal fun PlayerActivity.showV905LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v905library
    FeaturePrefsStore.batch901.v905library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v905: license level
internal fun PlayerActivity.showV905LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905license = value
        AppToast.show(this, "license: $value")
    }
}

// v905: life level
internal fun PlayerActivity.showV905LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905life = value
        AppToast.show(this, "life: $value")
    }
}

// v905: lifetime level
internal fun PlayerActivity.showV905LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v905: light level
internal fun PlayerActivity.showV905LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905light = value
        AppToast.show(this, "light: $value")
    }
}

// v905: limit level
internal fun PlayerActivity.showV905LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v905: line mode
internal fun PlayerActivity.showV905LineToggle() {
    val current = FeaturePrefsStore.batch901.v905line
    FeaturePrefsStore.batch901.v905line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v905: link mode
internal fun PlayerActivity.showV905LinkToggle() {
    val current = FeaturePrefsStore.batch901.v905link
    FeaturePrefsStore.batch901.v905link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v905: list mode
internal fun PlayerActivity.showV905ListToggle() {
    val current = FeaturePrefsStore.batch901.v905list
    FeaturePrefsStore.batch901.v905list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v905: live mode
internal fun PlayerActivity.showV905LiveToggle() {
    val current = FeaturePrefsStore.batch901.v905live
    FeaturePrefsStore.batch901.v905live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v905: load mode
internal fun PlayerActivity.showV905LoadToggle() {
    val current = FeaturePrefsStore.batch901.v905load
    FeaturePrefsStore.batch901.v905load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v906: learn mode
internal fun PlayerActivity.showV906LearnToggle() {
    val current = FeaturePrefsStore.batch901.v906learn
    FeaturePrefsStore.batch901.v906learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v906: left mode
internal fun PlayerActivity.showV906LeftToggle() {
    val current = FeaturePrefsStore.batch901.v906left
    FeaturePrefsStore.batch901.v906left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v906: length mode
internal fun PlayerActivity.showV906LengthToggle() {
    val current = FeaturePrefsStore.batch901.v906length
    FeaturePrefsStore.batch901.v906length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v906: level mode
internal fun PlayerActivity.showV906LevelToggle() {
    val current = FeaturePrefsStore.batch901.v906level
    FeaturePrefsStore.batch901.v906level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v906: library mode
internal fun PlayerActivity.showV906LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v906library
    FeaturePrefsStore.batch901.v906library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v906: license level
internal fun PlayerActivity.showV906LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906license = value
        AppToast.show(this, "license: $value")
    }
}

// v906: life level
internal fun PlayerActivity.showV906LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906life = value
        AppToast.show(this, "life: $value")
    }
}

// v906: lifetime level
internal fun PlayerActivity.showV906LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v906: light level
internal fun PlayerActivity.showV906LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906light = value
        AppToast.show(this, "light: $value")
    }
}

// v906: limit level
internal fun PlayerActivity.showV906LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v906: line mode
internal fun PlayerActivity.showV906LineToggle() {
    val current = FeaturePrefsStore.batch901.v906line
    FeaturePrefsStore.batch901.v906line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v906: link mode
internal fun PlayerActivity.showV906LinkToggle() {
    val current = FeaturePrefsStore.batch901.v906link
    FeaturePrefsStore.batch901.v906link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v906: list mode
internal fun PlayerActivity.showV906ListToggle() {
    val current = FeaturePrefsStore.batch901.v906list
    FeaturePrefsStore.batch901.v906list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v906: live mode
internal fun PlayerActivity.showV906LiveToggle() {
    val current = FeaturePrefsStore.batch901.v906live
    FeaturePrefsStore.batch901.v906live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v906: load mode
internal fun PlayerActivity.showV906LoadToggle() {
    val current = FeaturePrefsStore.batch901.v906load
    FeaturePrefsStore.batch901.v906load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v907: learn mode
internal fun PlayerActivity.showV907LearnToggle() {
    val current = FeaturePrefsStore.batch901.v907learn
    FeaturePrefsStore.batch901.v907learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v907: left mode
internal fun PlayerActivity.showV907LeftToggle() {
    val current = FeaturePrefsStore.batch901.v907left
    FeaturePrefsStore.batch901.v907left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v907: length mode
internal fun PlayerActivity.showV907LengthToggle() {
    val current = FeaturePrefsStore.batch901.v907length
    FeaturePrefsStore.batch901.v907length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v907: level mode
internal fun PlayerActivity.showV907LevelToggle() {
    val current = FeaturePrefsStore.batch901.v907level
    FeaturePrefsStore.batch901.v907level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v907: library mode
internal fun PlayerActivity.showV907LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v907library
    FeaturePrefsStore.batch901.v907library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v907: license level
internal fun PlayerActivity.showV907LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907license = value
        AppToast.show(this, "license: $value")
    }
}

// v907: life level
internal fun PlayerActivity.showV907LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907life = value
        AppToast.show(this, "life: $value")
    }
}

// v907: lifetime level
internal fun PlayerActivity.showV907LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v907: light level
internal fun PlayerActivity.showV907LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907light = value
        AppToast.show(this, "light: $value")
    }
}

// v907: limit level
internal fun PlayerActivity.showV907LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v907: line mode
internal fun PlayerActivity.showV907LineToggle() {
    val current = FeaturePrefsStore.batch901.v907line
    FeaturePrefsStore.batch901.v907line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v907: link mode
internal fun PlayerActivity.showV907LinkToggle() {
    val current = FeaturePrefsStore.batch901.v907link
    FeaturePrefsStore.batch901.v907link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v907: list mode
internal fun PlayerActivity.showV907ListToggle() {
    val current = FeaturePrefsStore.batch901.v907list
    FeaturePrefsStore.batch901.v907list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v907: live mode
internal fun PlayerActivity.showV907LiveToggle() {
    val current = FeaturePrefsStore.batch901.v907live
    FeaturePrefsStore.batch901.v907live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v907: load mode
internal fun PlayerActivity.showV907LoadToggle() {
    val current = FeaturePrefsStore.batch901.v907load
    FeaturePrefsStore.batch901.v907load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v908: learn mode
internal fun PlayerActivity.showV908LearnToggle() {
    val current = FeaturePrefsStore.batch901.v908learn
    FeaturePrefsStore.batch901.v908learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v908: left mode
internal fun PlayerActivity.showV908LeftToggle() {
    val current = FeaturePrefsStore.batch901.v908left
    FeaturePrefsStore.batch901.v908left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v908: length mode
internal fun PlayerActivity.showV908LengthToggle() {
    val current = FeaturePrefsStore.batch901.v908length
    FeaturePrefsStore.batch901.v908length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v908: level mode
internal fun PlayerActivity.showV908LevelToggle() {
    val current = FeaturePrefsStore.batch901.v908level
    FeaturePrefsStore.batch901.v908level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v908: library mode
internal fun PlayerActivity.showV908LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v908library
    FeaturePrefsStore.batch901.v908library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v908: license level
internal fun PlayerActivity.showV908LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908license = value
        AppToast.show(this, "license: $value")
    }
}

// v908: life level
internal fun PlayerActivity.showV908LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908life = value
        AppToast.show(this, "life: $value")
    }
}

// v908: lifetime level
internal fun PlayerActivity.showV908LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v908: light level
internal fun PlayerActivity.showV908LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908light = value
        AppToast.show(this, "light: $value")
    }
}

// v908: limit level
internal fun PlayerActivity.showV908LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v908: line mode
internal fun PlayerActivity.showV908LineToggle() {
    val current = FeaturePrefsStore.batch901.v908line
    FeaturePrefsStore.batch901.v908line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v908: link mode
internal fun PlayerActivity.showV908LinkToggle() {
    val current = FeaturePrefsStore.batch901.v908link
    FeaturePrefsStore.batch901.v908link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v908: list mode
internal fun PlayerActivity.showV908ListToggle() {
    val current = FeaturePrefsStore.batch901.v908list
    FeaturePrefsStore.batch901.v908list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v908: live mode
internal fun PlayerActivity.showV908LiveToggle() {
    val current = FeaturePrefsStore.batch901.v908live
    FeaturePrefsStore.batch901.v908live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v908: load mode
internal fun PlayerActivity.showV908LoadToggle() {
    val current = FeaturePrefsStore.batch901.v908load
    FeaturePrefsStore.batch901.v908load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v909: learn mode
internal fun PlayerActivity.showV909LearnToggle() {
    val current = FeaturePrefsStore.batch901.v909learn
    FeaturePrefsStore.batch901.v909learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v909: left mode
internal fun PlayerActivity.showV909LeftToggle() {
    val current = FeaturePrefsStore.batch901.v909left
    FeaturePrefsStore.batch901.v909left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v909: length mode
internal fun PlayerActivity.showV909LengthToggle() {
    val current = FeaturePrefsStore.batch901.v909length
    FeaturePrefsStore.batch901.v909length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v909: level mode
internal fun PlayerActivity.showV909LevelToggle() {
    val current = FeaturePrefsStore.batch901.v909level
    FeaturePrefsStore.batch901.v909level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v909: library mode
internal fun PlayerActivity.showV909LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v909library
    FeaturePrefsStore.batch901.v909library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v909: license level
internal fun PlayerActivity.showV909LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909license = value
        AppToast.show(this, "license: $value")
    }
}

// v909: life level
internal fun PlayerActivity.showV909LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909life = value
        AppToast.show(this, "life: $value")
    }
}

// v909: lifetime level
internal fun PlayerActivity.showV909LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v909: light level
internal fun PlayerActivity.showV909LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909light = value
        AppToast.show(this, "light: $value")
    }
}

// v909: limit level
internal fun PlayerActivity.showV909LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v909: line mode
internal fun PlayerActivity.showV909LineToggle() {
    val current = FeaturePrefsStore.batch901.v909line
    FeaturePrefsStore.batch901.v909line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v909: link mode
internal fun PlayerActivity.showV909LinkToggle() {
    val current = FeaturePrefsStore.batch901.v909link
    FeaturePrefsStore.batch901.v909link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v909: list mode
internal fun PlayerActivity.showV909ListToggle() {
    val current = FeaturePrefsStore.batch901.v909list
    FeaturePrefsStore.batch901.v909list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v909: live mode
internal fun PlayerActivity.showV909LiveToggle() {
    val current = FeaturePrefsStore.batch901.v909live
    FeaturePrefsStore.batch901.v909live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v909: load mode
internal fun PlayerActivity.showV909LoadToggle() {
    val current = FeaturePrefsStore.batch901.v909load
    FeaturePrefsStore.batch901.v909load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v910: learn mode
internal fun PlayerActivity.showV910LearnToggle() {
    val current = FeaturePrefsStore.batch901.v910learn
    FeaturePrefsStore.batch901.v910learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v910: left mode
internal fun PlayerActivity.showV910LeftToggle() {
    val current = FeaturePrefsStore.batch901.v910left
    FeaturePrefsStore.batch901.v910left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v910: length mode
internal fun PlayerActivity.showV910LengthToggle() {
    val current = FeaturePrefsStore.batch901.v910length
    FeaturePrefsStore.batch901.v910length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v910: level mode
internal fun PlayerActivity.showV910LevelToggle() {
    val current = FeaturePrefsStore.batch901.v910level
    FeaturePrefsStore.batch901.v910level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v910: library mode
internal fun PlayerActivity.showV910LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v910library
    FeaturePrefsStore.batch901.v910library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v910: license level
internal fun PlayerActivity.showV910LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910license = value
        AppToast.show(this, "license: $value")
    }
}

// v910: life level
internal fun PlayerActivity.showV910LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910life = value
        AppToast.show(this, "life: $value")
    }
}

// v910: lifetime level
internal fun PlayerActivity.showV910LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v910: light level
internal fun PlayerActivity.showV910LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910light = value
        AppToast.show(this, "light: $value")
    }
}

// v910: limit level
internal fun PlayerActivity.showV910LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v910: line mode
internal fun PlayerActivity.showV910LineToggle() {
    val current = FeaturePrefsStore.batch901.v910line
    FeaturePrefsStore.batch901.v910line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v910: link mode
internal fun PlayerActivity.showV910LinkToggle() {
    val current = FeaturePrefsStore.batch901.v910link
    FeaturePrefsStore.batch901.v910link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v910: list mode
internal fun PlayerActivity.showV910ListToggle() {
    val current = FeaturePrefsStore.batch901.v910list
    FeaturePrefsStore.batch901.v910list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v910: live mode
internal fun PlayerActivity.showV910LiveToggle() {
    val current = FeaturePrefsStore.batch901.v910live
    FeaturePrefsStore.batch901.v910live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v910: load mode
internal fun PlayerActivity.showV910LoadToggle() {
    val current = FeaturePrefsStore.batch901.v910load
    FeaturePrefsStore.batch901.v910load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

