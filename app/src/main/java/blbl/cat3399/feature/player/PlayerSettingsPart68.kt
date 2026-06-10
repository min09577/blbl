package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v871: hit mode
internal fun PlayerActivity.showV871HitToggle() {
    val current = FeaturePrefsStore.batch871.v871hit
    FeaturePrefsStore.batch871.v871hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v871: hold mode
internal fun PlayerActivity.showV871HoldToggle() {
    val current = FeaturePrefsStore.batch871.v871hold
    FeaturePrefsStore.batch871.v871hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v871: hook mode
internal fun PlayerActivity.showV871HookToggle() {
    val current = FeaturePrefsStore.batch871.v871hook
    FeaturePrefsStore.batch871.v871hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v871: host mode
internal fun PlayerActivity.showV871HostToggle() {
    val current = FeaturePrefsStore.batch871.v871host
    FeaturePrefsStore.batch871.v871host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v871: hot mode
internal fun PlayerActivity.showV871HotToggle() {
    val current = FeaturePrefsStore.batch871.v871hot
    FeaturePrefsStore.batch871.v871hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v871: hover level
internal fun PlayerActivity.showV871HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v871hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v871hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v871: hub level
internal fun PlayerActivity.showV871HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v871hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v871hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v871: icon level
internal fun PlayerActivity.showV871IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v871icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v871icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v871: id level
internal fun PlayerActivity.showV871IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v871id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v871id = value
        AppToast.show(this, "id: $value")
    }
}

// v871: identity level
internal fun PlayerActivity.showV871IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v871identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v871identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v871: idle mode
internal fun PlayerActivity.showV871IdleToggle() {
    val current = FeaturePrefsStore.batch871.v871idle
    FeaturePrefsStore.batch871.v871idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v871: ignore mode
internal fun PlayerActivity.showV871IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v871ignore
    FeaturePrefsStore.batch871.v871ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v871: image mode
internal fun PlayerActivity.showV871ImageToggle() {
    val current = FeaturePrefsStore.batch871.v871image
    FeaturePrefsStore.batch871.v871image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v871: import mode
internal fun PlayerActivity.showV871ImportToggle() {
    val current = FeaturePrefsStore.batch871.v871import
    FeaturePrefsStore.batch871.v871import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v871: index mode
internal fun PlayerActivity.showV871IndexToggle() {
    val current = FeaturePrefsStore.batch871.v871index
    FeaturePrefsStore.batch871.v871index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v872: hit mode
internal fun PlayerActivity.showV872HitToggle() {
    val current = FeaturePrefsStore.batch871.v872hit
    FeaturePrefsStore.batch871.v872hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v872: hold mode
internal fun PlayerActivity.showV872HoldToggle() {
    val current = FeaturePrefsStore.batch871.v872hold
    FeaturePrefsStore.batch871.v872hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v872: hook mode
internal fun PlayerActivity.showV872HookToggle() {
    val current = FeaturePrefsStore.batch871.v872hook
    FeaturePrefsStore.batch871.v872hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v872: host mode
internal fun PlayerActivity.showV872HostToggle() {
    val current = FeaturePrefsStore.batch871.v872host
    FeaturePrefsStore.batch871.v872host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v872: hot mode
internal fun PlayerActivity.showV872HotToggle() {
    val current = FeaturePrefsStore.batch871.v872hot
    FeaturePrefsStore.batch871.v872hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v872: hover level
internal fun PlayerActivity.showV872HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v872hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v872hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v872: hub level
internal fun PlayerActivity.showV872HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v872hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v872hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v872: icon level
internal fun PlayerActivity.showV872IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v872icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v872icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v872: id level
internal fun PlayerActivity.showV872IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v872id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v872id = value
        AppToast.show(this, "id: $value")
    }
}

// v872: identity level
internal fun PlayerActivity.showV872IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v872identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v872identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v872: idle mode
internal fun PlayerActivity.showV872IdleToggle() {
    val current = FeaturePrefsStore.batch871.v872idle
    FeaturePrefsStore.batch871.v872idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v872: ignore mode
internal fun PlayerActivity.showV872IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v872ignore
    FeaturePrefsStore.batch871.v872ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v872: image mode
internal fun PlayerActivity.showV872ImageToggle() {
    val current = FeaturePrefsStore.batch871.v872image
    FeaturePrefsStore.batch871.v872image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v872: import mode
internal fun PlayerActivity.showV872ImportToggle() {
    val current = FeaturePrefsStore.batch871.v872import
    FeaturePrefsStore.batch871.v872import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v872: index mode
internal fun PlayerActivity.showV872IndexToggle() {
    val current = FeaturePrefsStore.batch871.v872index
    FeaturePrefsStore.batch871.v872index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v873: hit mode
internal fun PlayerActivity.showV873HitToggle() {
    val current = FeaturePrefsStore.batch871.v873hit
    FeaturePrefsStore.batch871.v873hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v873: hold mode
internal fun PlayerActivity.showV873HoldToggle() {
    val current = FeaturePrefsStore.batch871.v873hold
    FeaturePrefsStore.batch871.v873hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v873: hook mode
internal fun PlayerActivity.showV873HookToggle() {
    val current = FeaturePrefsStore.batch871.v873hook
    FeaturePrefsStore.batch871.v873hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v873: host mode
internal fun PlayerActivity.showV873HostToggle() {
    val current = FeaturePrefsStore.batch871.v873host
    FeaturePrefsStore.batch871.v873host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v873: hot mode
internal fun PlayerActivity.showV873HotToggle() {
    val current = FeaturePrefsStore.batch871.v873hot
    FeaturePrefsStore.batch871.v873hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v873: hover level
internal fun PlayerActivity.showV873HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v873hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v873hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v873: hub level
internal fun PlayerActivity.showV873HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v873hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v873hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v873: icon level
internal fun PlayerActivity.showV873IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v873icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v873icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v873: id level
internal fun PlayerActivity.showV873IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v873id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v873id = value
        AppToast.show(this, "id: $value")
    }
}

// v873: identity level
internal fun PlayerActivity.showV873IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v873identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v873identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v873: idle mode
internal fun PlayerActivity.showV873IdleToggle() {
    val current = FeaturePrefsStore.batch871.v873idle
    FeaturePrefsStore.batch871.v873idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v873: ignore mode
internal fun PlayerActivity.showV873IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v873ignore
    FeaturePrefsStore.batch871.v873ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v873: image mode
internal fun PlayerActivity.showV873ImageToggle() {
    val current = FeaturePrefsStore.batch871.v873image
    FeaturePrefsStore.batch871.v873image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v873: import mode
internal fun PlayerActivity.showV873ImportToggle() {
    val current = FeaturePrefsStore.batch871.v873import
    FeaturePrefsStore.batch871.v873import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v873: index mode
internal fun PlayerActivity.showV873IndexToggle() {
    val current = FeaturePrefsStore.batch871.v873index
    FeaturePrefsStore.batch871.v873index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v874: hit mode
internal fun PlayerActivity.showV874HitToggle() {
    val current = FeaturePrefsStore.batch871.v874hit
    FeaturePrefsStore.batch871.v874hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v874: hold mode
internal fun PlayerActivity.showV874HoldToggle() {
    val current = FeaturePrefsStore.batch871.v874hold
    FeaturePrefsStore.batch871.v874hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v874: hook mode
internal fun PlayerActivity.showV874HookToggle() {
    val current = FeaturePrefsStore.batch871.v874hook
    FeaturePrefsStore.batch871.v874hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v874: host mode
internal fun PlayerActivity.showV874HostToggle() {
    val current = FeaturePrefsStore.batch871.v874host
    FeaturePrefsStore.batch871.v874host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v874: hot mode
internal fun PlayerActivity.showV874HotToggle() {
    val current = FeaturePrefsStore.batch871.v874hot
    FeaturePrefsStore.batch871.v874hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v874: hover level
internal fun PlayerActivity.showV874HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v874hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v874hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v874: hub level
internal fun PlayerActivity.showV874HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v874hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v874hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v874: icon level
internal fun PlayerActivity.showV874IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v874icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v874icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v874: id level
internal fun PlayerActivity.showV874IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v874id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v874id = value
        AppToast.show(this, "id: $value")
    }
}

// v874: identity level
internal fun PlayerActivity.showV874IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v874identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v874identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v874: idle mode
internal fun PlayerActivity.showV874IdleToggle() {
    val current = FeaturePrefsStore.batch871.v874idle
    FeaturePrefsStore.batch871.v874idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v874: ignore mode
internal fun PlayerActivity.showV874IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v874ignore
    FeaturePrefsStore.batch871.v874ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v874: image mode
internal fun PlayerActivity.showV874ImageToggle() {
    val current = FeaturePrefsStore.batch871.v874image
    FeaturePrefsStore.batch871.v874image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v874: import mode
internal fun PlayerActivity.showV874ImportToggle() {
    val current = FeaturePrefsStore.batch871.v874import
    FeaturePrefsStore.batch871.v874import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v874: index mode
internal fun PlayerActivity.showV874IndexToggle() {
    val current = FeaturePrefsStore.batch871.v874index
    FeaturePrefsStore.batch871.v874index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v875: hit mode
internal fun PlayerActivity.showV875HitToggle() {
    val current = FeaturePrefsStore.batch871.v875hit
    FeaturePrefsStore.batch871.v875hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v875: hold mode
internal fun PlayerActivity.showV875HoldToggle() {
    val current = FeaturePrefsStore.batch871.v875hold
    FeaturePrefsStore.batch871.v875hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v875: hook mode
internal fun PlayerActivity.showV875HookToggle() {
    val current = FeaturePrefsStore.batch871.v875hook
    FeaturePrefsStore.batch871.v875hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v875: host mode
internal fun PlayerActivity.showV875HostToggle() {
    val current = FeaturePrefsStore.batch871.v875host
    FeaturePrefsStore.batch871.v875host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v875: hot mode
internal fun PlayerActivity.showV875HotToggle() {
    val current = FeaturePrefsStore.batch871.v875hot
    FeaturePrefsStore.batch871.v875hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v875: hover level
internal fun PlayerActivity.showV875HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v875hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v875hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v875: hub level
internal fun PlayerActivity.showV875HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v875hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v875hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v875: icon level
internal fun PlayerActivity.showV875IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v875icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v875icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v875: id level
internal fun PlayerActivity.showV875IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v875id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v875id = value
        AppToast.show(this, "id: $value")
    }
}

// v875: identity level
internal fun PlayerActivity.showV875IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v875identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v875identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v875: idle mode
internal fun PlayerActivity.showV875IdleToggle() {
    val current = FeaturePrefsStore.batch871.v875idle
    FeaturePrefsStore.batch871.v875idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v875: ignore mode
internal fun PlayerActivity.showV875IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v875ignore
    FeaturePrefsStore.batch871.v875ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v875: image mode
internal fun PlayerActivity.showV875ImageToggle() {
    val current = FeaturePrefsStore.batch871.v875image
    FeaturePrefsStore.batch871.v875image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v875: import mode
internal fun PlayerActivity.showV875ImportToggle() {
    val current = FeaturePrefsStore.batch871.v875import
    FeaturePrefsStore.batch871.v875import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v875: index mode
internal fun PlayerActivity.showV875IndexToggle() {
    val current = FeaturePrefsStore.batch871.v875index
    FeaturePrefsStore.batch871.v875index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v876: hit mode
internal fun PlayerActivity.showV876HitToggle() {
    val current = FeaturePrefsStore.batch871.v876hit
    FeaturePrefsStore.batch871.v876hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v876: hold mode
internal fun PlayerActivity.showV876HoldToggle() {
    val current = FeaturePrefsStore.batch871.v876hold
    FeaturePrefsStore.batch871.v876hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v876: hook mode
internal fun PlayerActivity.showV876HookToggle() {
    val current = FeaturePrefsStore.batch871.v876hook
    FeaturePrefsStore.batch871.v876hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v876: host mode
internal fun PlayerActivity.showV876HostToggle() {
    val current = FeaturePrefsStore.batch871.v876host
    FeaturePrefsStore.batch871.v876host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v876: hot mode
internal fun PlayerActivity.showV876HotToggle() {
    val current = FeaturePrefsStore.batch871.v876hot
    FeaturePrefsStore.batch871.v876hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v876: hover level
internal fun PlayerActivity.showV876HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v876hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v876hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v876: hub level
internal fun PlayerActivity.showV876HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v876hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v876hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v876: icon level
internal fun PlayerActivity.showV876IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v876icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v876icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v876: id level
internal fun PlayerActivity.showV876IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v876id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v876id = value
        AppToast.show(this, "id: $value")
    }
}

// v876: identity level
internal fun PlayerActivity.showV876IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v876identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v876identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v876: idle mode
internal fun PlayerActivity.showV876IdleToggle() {
    val current = FeaturePrefsStore.batch871.v876idle
    FeaturePrefsStore.batch871.v876idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v876: ignore mode
internal fun PlayerActivity.showV876IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v876ignore
    FeaturePrefsStore.batch871.v876ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v876: image mode
internal fun PlayerActivity.showV876ImageToggle() {
    val current = FeaturePrefsStore.batch871.v876image
    FeaturePrefsStore.batch871.v876image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v876: import mode
internal fun PlayerActivity.showV876ImportToggle() {
    val current = FeaturePrefsStore.batch871.v876import
    FeaturePrefsStore.batch871.v876import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v876: index mode
internal fun PlayerActivity.showV876IndexToggle() {
    val current = FeaturePrefsStore.batch871.v876index
    FeaturePrefsStore.batch871.v876index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v877: hit mode
internal fun PlayerActivity.showV877HitToggle() {
    val current = FeaturePrefsStore.batch871.v877hit
    FeaturePrefsStore.batch871.v877hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v877: hold mode
internal fun PlayerActivity.showV877HoldToggle() {
    val current = FeaturePrefsStore.batch871.v877hold
    FeaturePrefsStore.batch871.v877hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v877: hook mode
internal fun PlayerActivity.showV877HookToggle() {
    val current = FeaturePrefsStore.batch871.v877hook
    FeaturePrefsStore.batch871.v877hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v877: host mode
internal fun PlayerActivity.showV877HostToggle() {
    val current = FeaturePrefsStore.batch871.v877host
    FeaturePrefsStore.batch871.v877host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v877: hot mode
internal fun PlayerActivity.showV877HotToggle() {
    val current = FeaturePrefsStore.batch871.v877hot
    FeaturePrefsStore.batch871.v877hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v877: hover level
internal fun PlayerActivity.showV877HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v877hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v877hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v877: hub level
internal fun PlayerActivity.showV877HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v877hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v877hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v877: icon level
internal fun PlayerActivity.showV877IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v877icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v877icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v877: id level
internal fun PlayerActivity.showV877IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v877id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v877id = value
        AppToast.show(this, "id: $value")
    }
}

// v877: identity level
internal fun PlayerActivity.showV877IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v877identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v877identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v877: idle mode
internal fun PlayerActivity.showV877IdleToggle() {
    val current = FeaturePrefsStore.batch871.v877idle
    FeaturePrefsStore.batch871.v877idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v877: ignore mode
internal fun PlayerActivity.showV877IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v877ignore
    FeaturePrefsStore.batch871.v877ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v877: image mode
internal fun PlayerActivity.showV877ImageToggle() {
    val current = FeaturePrefsStore.batch871.v877image
    FeaturePrefsStore.batch871.v877image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v877: import mode
internal fun PlayerActivity.showV877ImportToggle() {
    val current = FeaturePrefsStore.batch871.v877import
    FeaturePrefsStore.batch871.v877import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v877: index mode
internal fun PlayerActivity.showV877IndexToggle() {
    val current = FeaturePrefsStore.batch871.v877index
    FeaturePrefsStore.batch871.v877index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v878: hit mode
internal fun PlayerActivity.showV878HitToggle() {
    val current = FeaturePrefsStore.batch871.v878hit
    FeaturePrefsStore.batch871.v878hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v878: hold mode
internal fun PlayerActivity.showV878HoldToggle() {
    val current = FeaturePrefsStore.batch871.v878hold
    FeaturePrefsStore.batch871.v878hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v878: hook mode
internal fun PlayerActivity.showV878HookToggle() {
    val current = FeaturePrefsStore.batch871.v878hook
    FeaturePrefsStore.batch871.v878hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v878: host mode
internal fun PlayerActivity.showV878HostToggle() {
    val current = FeaturePrefsStore.batch871.v878host
    FeaturePrefsStore.batch871.v878host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v878: hot mode
internal fun PlayerActivity.showV878HotToggle() {
    val current = FeaturePrefsStore.batch871.v878hot
    FeaturePrefsStore.batch871.v878hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v878: hover level
internal fun PlayerActivity.showV878HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v878hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v878hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v878: hub level
internal fun PlayerActivity.showV878HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v878hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v878hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v878: icon level
internal fun PlayerActivity.showV878IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v878icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v878icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v878: id level
internal fun PlayerActivity.showV878IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v878id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v878id = value
        AppToast.show(this, "id: $value")
    }
}

// v878: identity level
internal fun PlayerActivity.showV878IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v878identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v878identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v878: idle mode
internal fun PlayerActivity.showV878IdleToggle() {
    val current = FeaturePrefsStore.batch871.v878idle
    FeaturePrefsStore.batch871.v878idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v878: ignore mode
internal fun PlayerActivity.showV878IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v878ignore
    FeaturePrefsStore.batch871.v878ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v878: image mode
internal fun PlayerActivity.showV878ImageToggle() {
    val current = FeaturePrefsStore.batch871.v878image
    FeaturePrefsStore.batch871.v878image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v878: import mode
internal fun PlayerActivity.showV878ImportToggle() {
    val current = FeaturePrefsStore.batch871.v878import
    FeaturePrefsStore.batch871.v878import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v878: index mode
internal fun PlayerActivity.showV878IndexToggle() {
    val current = FeaturePrefsStore.batch871.v878index
    FeaturePrefsStore.batch871.v878index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v879: hit mode
internal fun PlayerActivity.showV879HitToggle() {
    val current = FeaturePrefsStore.batch871.v879hit
    FeaturePrefsStore.batch871.v879hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v879: hold mode
internal fun PlayerActivity.showV879HoldToggle() {
    val current = FeaturePrefsStore.batch871.v879hold
    FeaturePrefsStore.batch871.v879hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v879: hook mode
internal fun PlayerActivity.showV879HookToggle() {
    val current = FeaturePrefsStore.batch871.v879hook
    FeaturePrefsStore.batch871.v879hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v879: host mode
internal fun PlayerActivity.showV879HostToggle() {
    val current = FeaturePrefsStore.batch871.v879host
    FeaturePrefsStore.batch871.v879host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v879: hot mode
internal fun PlayerActivity.showV879HotToggle() {
    val current = FeaturePrefsStore.batch871.v879hot
    FeaturePrefsStore.batch871.v879hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v879: hover level
internal fun PlayerActivity.showV879HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v879hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v879hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v879: hub level
internal fun PlayerActivity.showV879HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v879hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v879hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v879: icon level
internal fun PlayerActivity.showV879IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v879icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v879icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v879: id level
internal fun PlayerActivity.showV879IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v879id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v879id = value
        AppToast.show(this, "id: $value")
    }
}

// v879: identity level
internal fun PlayerActivity.showV879IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v879identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v879identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v879: idle mode
internal fun PlayerActivity.showV879IdleToggle() {
    val current = FeaturePrefsStore.batch871.v879idle
    FeaturePrefsStore.batch871.v879idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v879: ignore mode
internal fun PlayerActivity.showV879IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v879ignore
    FeaturePrefsStore.batch871.v879ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v879: image mode
internal fun PlayerActivity.showV879ImageToggle() {
    val current = FeaturePrefsStore.batch871.v879image
    FeaturePrefsStore.batch871.v879image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v879: import mode
internal fun PlayerActivity.showV879ImportToggle() {
    val current = FeaturePrefsStore.batch871.v879import
    FeaturePrefsStore.batch871.v879import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v879: index mode
internal fun PlayerActivity.showV879IndexToggle() {
    val current = FeaturePrefsStore.batch871.v879index
    FeaturePrefsStore.batch871.v879index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

// v880: hit mode
internal fun PlayerActivity.showV880HitToggle() {
    val current = FeaturePrefsStore.batch871.v880hit
    FeaturePrefsStore.batch871.v880hit = !current
    AppToast.show(this, "hit: ${if (!current) "ON" else "OFF"}")
}

// v880: hold mode
internal fun PlayerActivity.showV880HoldToggle() {
    val current = FeaturePrefsStore.batch871.v880hold
    FeaturePrefsStore.batch871.v880hold = !current
    AppToast.show(this, "hold: ${if (!current) "ON" else "OFF"}")
}

// v880: hook mode
internal fun PlayerActivity.showV880HookToggle() {
    val current = FeaturePrefsStore.batch871.v880hook
    FeaturePrefsStore.batch871.v880hook = !current
    AppToast.show(this, "hook: ${if (!current) "ON" else "OFF"}")
}

// v880: host mode
internal fun PlayerActivity.showV880HostToggle() {
    val current = FeaturePrefsStore.batch871.v880host
    FeaturePrefsStore.batch871.v880host = !current
    AppToast.show(this, "host: ${if (!current) "ON" else "OFF"}")
}

// v880: hot mode
internal fun PlayerActivity.showV880HotToggle() {
    val current = FeaturePrefsStore.batch871.v880hot
    FeaturePrefsStore.batch871.v880hot = !current
    AppToast.show(this, "hot: ${if (!current) "ON" else "OFF"}")
}

// v880: hover level
internal fun PlayerActivity.showV880HoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v880hover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v880hover = value
        AppToast.show(this, "hover: $value")
    }
}

// v880: hub level
internal fun PlayerActivity.showV880HubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v880hub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v880hub = value
        AppToast.show(this, "hub: $value")
    }
}

// v880: icon level
internal fun PlayerActivity.showV880IconDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v880icon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "icon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v880icon = value
        AppToast.show(this, "icon: $value")
    }
}

// v880: id level
internal fun PlayerActivity.showV880IdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v880id).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "id level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v880id = value
        AppToast.show(this, "id: $value")
    }
}

// v880: identity level
internal fun PlayerActivity.showV880IdentityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch871.v880identity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "identity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch871.v880identity = value
        AppToast.show(this, "identity: $value")
    }
}

// v880: idle mode
internal fun PlayerActivity.showV880IdleToggle() {
    val current = FeaturePrefsStore.batch871.v880idle
    FeaturePrefsStore.batch871.v880idle = !current
    AppToast.show(this, "idle: ${if (!current) "ON" else "OFF"}")
}

// v880: ignore mode
internal fun PlayerActivity.showV880IgnoreToggle() {
    val current = FeaturePrefsStore.batch871.v880ignore
    FeaturePrefsStore.batch871.v880ignore = !current
    AppToast.show(this, "ignore: ${if (!current) "ON" else "OFF"}")
}

// v880: image mode
internal fun PlayerActivity.showV880ImageToggle() {
    val current = FeaturePrefsStore.batch871.v880image
    FeaturePrefsStore.batch871.v880image = !current
    AppToast.show(this, "image: ${if (!current) "ON" else "OFF"}")
}

// v880: import mode
internal fun PlayerActivity.showV880ImportToggle() {
    val current = FeaturePrefsStore.batch871.v880import
    FeaturePrefsStore.batch871.v880import = !current
    AppToast.show(this, "import: ${if (!current) "ON" else "OFF"}")
}

// v880: index mode
internal fun PlayerActivity.showV880IndexToggle() {
    val current = FeaturePrefsStore.batch871.v880index
    FeaturePrefsStore.batch871.v880index = !current
    AppToast.show(this, "index: ${if (!current) "ON" else "OFF"}")
}

