package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v891: join mode
internal fun PlayerActivity.showV891JoinToggle() {
    val current = FeaturePrefsStore.batch891.v891join
    FeaturePrefsStore.batch891.v891join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v891: json mode
internal fun PlayerActivity.showV891JsonToggle() {
    val current = FeaturePrefsStore.batch891.v891json
    FeaturePrefsStore.batch891.v891json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v891: jump mode
internal fun PlayerActivity.showV891JumpToggle() {
    val current = FeaturePrefsStore.batch891.v891jump
    FeaturePrefsStore.batch891.v891jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v891: kernel mode
internal fun PlayerActivity.showV891KernelToggle() {
    val current = FeaturePrefsStore.batch891.v891kernel
    FeaturePrefsStore.batch891.v891kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v891: key mode
internal fun PlayerActivity.showV891KeyToggle() {
    val current = FeaturePrefsStore.batch891.v891key
    FeaturePrefsStore.batch891.v891key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v891: kill level
internal fun PlayerActivity.showV891KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v891: kit level
internal fun PlayerActivity.showV891KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v891: label level
internal fun PlayerActivity.showV891LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891label = value
        AppToast.show(this, "label: $value")
    }
}

// v891: lag level
internal fun PlayerActivity.showV891LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v891: language level
internal fun PlayerActivity.showV891LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891language = value
        AppToast.show(this, "language: $value")
    }
}

// v891: layer mode
internal fun PlayerActivity.showV891LayerToggle() {
    val current = FeaturePrefsStore.batch891.v891layer
    FeaturePrefsStore.batch891.v891layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v891: layout mode
internal fun PlayerActivity.showV891LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v891layout
    FeaturePrefsStore.batch891.v891layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v891: lazy mode
internal fun PlayerActivity.showV891LazyToggle() {
    val current = FeaturePrefsStore.batch891.v891lazy
    FeaturePrefsStore.batch891.v891lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v891: lead mode
internal fun PlayerActivity.showV891LeadToggle() {
    val current = FeaturePrefsStore.batch891.v891lead
    FeaturePrefsStore.batch891.v891lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v891: leaf mode
internal fun PlayerActivity.showV891LeafToggle() {
    val current = FeaturePrefsStore.batch891.v891leaf
    FeaturePrefsStore.batch891.v891leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v892: join mode
internal fun PlayerActivity.showV892JoinToggle() {
    val current = FeaturePrefsStore.batch891.v892join
    FeaturePrefsStore.batch891.v892join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v892: json mode
internal fun PlayerActivity.showV892JsonToggle() {
    val current = FeaturePrefsStore.batch891.v892json
    FeaturePrefsStore.batch891.v892json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v892: jump mode
internal fun PlayerActivity.showV892JumpToggle() {
    val current = FeaturePrefsStore.batch891.v892jump
    FeaturePrefsStore.batch891.v892jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v892: kernel mode
internal fun PlayerActivity.showV892KernelToggle() {
    val current = FeaturePrefsStore.batch891.v892kernel
    FeaturePrefsStore.batch891.v892kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v892: key mode
internal fun PlayerActivity.showV892KeyToggle() {
    val current = FeaturePrefsStore.batch891.v892key
    FeaturePrefsStore.batch891.v892key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v892: kill level
internal fun PlayerActivity.showV892KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v892: kit level
internal fun PlayerActivity.showV892KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v892: label level
internal fun PlayerActivity.showV892LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892label = value
        AppToast.show(this, "label: $value")
    }
}

// v892: lag level
internal fun PlayerActivity.showV892LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v892: language level
internal fun PlayerActivity.showV892LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892language = value
        AppToast.show(this, "language: $value")
    }
}

// v892: layer mode
internal fun PlayerActivity.showV892LayerToggle() {
    val current = FeaturePrefsStore.batch891.v892layer
    FeaturePrefsStore.batch891.v892layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v892: layout mode
internal fun PlayerActivity.showV892LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v892layout
    FeaturePrefsStore.batch891.v892layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v892: lazy mode
internal fun PlayerActivity.showV892LazyToggle() {
    val current = FeaturePrefsStore.batch891.v892lazy
    FeaturePrefsStore.batch891.v892lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v892: lead mode
internal fun PlayerActivity.showV892LeadToggle() {
    val current = FeaturePrefsStore.batch891.v892lead
    FeaturePrefsStore.batch891.v892lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v892: leaf mode
internal fun PlayerActivity.showV892LeafToggle() {
    val current = FeaturePrefsStore.batch891.v892leaf
    FeaturePrefsStore.batch891.v892leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v893: join mode
internal fun PlayerActivity.showV893JoinToggle() {
    val current = FeaturePrefsStore.batch891.v893join
    FeaturePrefsStore.batch891.v893join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v893: json mode
internal fun PlayerActivity.showV893JsonToggle() {
    val current = FeaturePrefsStore.batch891.v893json
    FeaturePrefsStore.batch891.v893json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v893: jump mode
internal fun PlayerActivity.showV893JumpToggle() {
    val current = FeaturePrefsStore.batch891.v893jump
    FeaturePrefsStore.batch891.v893jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v893: kernel mode
internal fun PlayerActivity.showV893KernelToggle() {
    val current = FeaturePrefsStore.batch891.v893kernel
    FeaturePrefsStore.batch891.v893kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v893: key mode
internal fun PlayerActivity.showV893KeyToggle() {
    val current = FeaturePrefsStore.batch891.v893key
    FeaturePrefsStore.batch891.v893key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v893: kill level
internal fun PlayerActivity.showV893KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v893: kit level
internal fun PlayerActivity.showV893KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v893: label level
internal fun PlayerActivity.showV893LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893label = value
        AppToast.show(this, "label: $value")
    }
}

// v893: lag level
internal fun PlayerActivity.showV893LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v893: language level
internal fun PlayerActivity.showV893LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893language = value
        AppToast.show(this, "language: $value")
    }
}

// v893: layer mode
internal fun PlayerActivity.showV893LayerToggle() {
    val current = FeaturePrefsStore.batch891.v893layer
    FeaturePrefsStore.batch891.v893layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v893: layout mode
internal fun PlayerActivity.showV893LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v893layout
    FeaturePrefsStore.batch891.v893layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v893: lazy mode
internal fun PlayerActivity.showV893LazyToggle() {
    val current = FeaturePrefsStore.batch891.v893lazy
    FeaturePrefsStore.batch891.v893lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v893: lead mode
internal fun PlayerActivity.showV893LeadToggle() {
    val current = FeaturePrefsStore.batch891.v893lead
    FeaturePrefsStore.batch891.v893lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v893: leaf mode
internal fun PlayerActivity.showV893LeafToggle() {
    val current = FeaturePrefsStore.batch891.v893leaf
    FeaturePrefsStore.batch891.v893leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v894: join mode
internal fun PlayerActivity.showV894JoinToggle() {
    val current = FeaturePrefsStore.batch891.v894join
    FeaturePrefsStore.batch891.v894join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v894: json mode
internal fun PlayerActivity.showV894JsonToggle() {
    val current = FeaturePrefsStore.batch891.v894json
    FeaturePrefsStore.batch891.v894json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v894: jump mode
internal fun PlayerActivity.showV894JumpToggle() {
    val current = FeaturePrefsStore.batch891.v894jump
    FeaturePrefsStore.batch891.v894jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v894: kernel mode
internal fun PlayerActivity.showV894KernelToggle() {
    val current = FeaturePrefsStore.batch891.v894kernel
    FeaturePrefsStore.batch891.v894kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v894: key mode
internal fun PlayerActivity.showV894KeyToggle() {
    val current = FeaturePrefsStore.batch891.v894key
    FeaturePrefsStore.batch891.v894key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v894: kill level
internal fun PlayerActivity.showV894KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v894: kit level
internal fun PlayerActivity.showV894KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v894: label level
internal fun PlayerActivity.showV894LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894label = value
        AppToast.show(this, "label: $value")
    }
}

// v894: lag level
internal fun PlayerActivity.showV894LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v894: language level
internal fun PlayerActivity.showV894LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894language = value
        AppToast.show(this, "language: $value")
    }
}

// v894: layer mode
internal fun PlayerActivity.showV894LayerToggle() {
    val current = FeaturePrefsStore.batch891.v894layer
    FeaturePrefsStore.batch891.v894layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v894: layout mode
internal fun PlayerActivity.showV894LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v894layout
    FeaturePrefsStore.batch891.v894layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v894: lazy mode
internal fun PlayerActivity.showV894LazyToggle() {
    val current = FeaturePrefsStore.batch891.v894lazy
    FeaturePrefsStore.batch891.v894lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v894: lead mode
internal fun PlayerActivity.showV894LeadToggle() {
    val current = FeaturePrefsStore.batch891.v894lead
    FeaturePrefsStore.batch891.v894lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v894: leaf mode
internal fun PlayerActivity.showV894LeafToggle() {
    val current = FeaturePrefsStore.batch891.v894leaf
    FeaturePrefsStore.batch891.v894leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v895: join mode
internal fun PlayerActivity.showV895JoinToggle() {
    val current = FeaturePrefsStore.batch891.v895join
    FeaturePrefsStore.batch891.v895join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v895: json mode
internal fun PlayerActivity.showV895JsonToggle() {
    val current = FeaturePrefsStore.batch891.v895json
    FeaturePrefsStore.batch891.v895json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v895: jump mode
internal fun PlayerActivity.showV895JumpToggle() {
    val current = FeaturePrefsStore.batch891.v895jump
    FeaturePrefsStore.batch891.v895jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v895: kernel mode
internal fun PlayerActivity.showV895KernelToggle() {
    val current = FeaturePrefsStore.batch891.v895kernel
    FeaturePrefsStore.batch891.v895kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v895: key mode
internal fun PlayerActivity.showV895KeyToggle() {
    val current = FeaturePrefsStore.batch891.v895key
    FeaturePrefsStore.batch891.v895key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v895: kill level
internal fun PlayerActivity.showV895KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v895: kit level
internal fun PlayerActivity.showV895KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v895: label level
internal fun PlayerActivity.showV895LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895label = value
        AppToast.show(this, "label: $value")
    }
}

// v895: lag level
internal fun PlayerActivity.showV895LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v895: language level
internal fun PlayerActivity.showV895LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895language = value
        AppToast.show(this, "language: $value")
    }
}

// v895: layer mode
internal fun PlayerActivity.showV895LayerToggle() {
    val current = FeaturePrefsStore.batch891.v895layer
    FeaturePrefsStore.batch891.v895layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v895: layout mode
internal fun PlayerActivity.showV895LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v895layout
    FeaturePrefsStore.batch891.v895layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v895: lazy mode
internal fun PlayerActivity.showV895LazyToggle() {
    val current = FeaturePrefsStore.batch891.v895lazy
    FeaturePrefsStore.batch891.v895lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v895: lead mode
internal fun PlayerActivity.showV895LeadToggle() {
    val current = FeaturePrefsStore.batch891.v895lead
    FeaturePrefsStore.batch891.v895lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v895: leaf mode
internal fun PlayerActivity.showV895LeafToggle() {
    val current = FeaturePrefsStore.batch891.v895leaf
    FeaturePrefsStore.batch891.v895leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v896: join mode
internal fun PlayerActivity.showV896JoinToggle() {
    val current = FeaturePrefsStore.batch891.v896join
    FeaturePrefsStore.batch891.v896join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v896: json mode
internal fun PlayerActivity.showV896JsonToggle() {
    val current = FeaturePrefsStore.batch891.v896json
    FeaturePrefsStore.batch891.v896json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v896: jump mode
internal fun PlayerActivity.showV896JumpToggle() {
    val current = FeaturePrefsStore.batch891.v896jump
    FeaturePrefsStore.batch891.v896jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v896: kernel mode
internal fun PlayerActivity.showV896KernelToggle() {
    val current = FeaturePrefsStore.batch891.v896kernel
    FeaturePrefsStore.batch891.v896kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v896: key mode
internal fun PlayerActivity.showV896KeyToggle() {
    val current = FeaturePrefsStore.batch891.v896key
    FeaturePrefsStore.batch891.v896key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v896: kill level
internal fun PlayerActivity.showV896KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v896: kit level
internal fun PlayerActivity.showV896KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v896: label level
internal fun PlayerActivity.showV896LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896label = value
        AppToast.show(this, "label: $value")
    }
}

// v896: lag level
internal fun PlayerActivity.showV896LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v896: language level
internal fun PlayerActivity.showV896LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896language = value
        AppToast.show(this, "language: $value")
    }
}

// v896: layer mode
internal fun PlayerActivity.showV896LayerToggle() {
    val current = FeaturePrefsStore.batch891.v896layer
    FeaturePrefsStore.batch891.v896layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v896: layout mode
internal fun PlayerActivity.showV896LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v896layout
    FeaturePrefsStore.batch891.v896layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v896: lazy mode
internal fun PlayerActivity.showV896LazyToggle() {
    val current = FeaturePrefsStore.batch891.v896lazy
    FeaturePrefsStore.batch891.v896lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v896: lead mode
internal fun PlayerActivity.showV896LeadToggle() {
    val current = FeaturePrefsStore.batch891.v896lead
    FeaturePrefsStore.batch891.v896lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v896: leaf mode
internal fun PlayerActivity.showV896LeafToggle() {
    val current = FeaturePrefsStore.batch891.v896leaf
    FeaturePrefsStore.batch891.v896leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v897: join mode
internal fun PlayerActivity.showV897JoinToggle() {
    val current = FeaturePrefsStore.batch891.v897join
    FeaturePrefsStore.batch891.v897join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v897: json mode
internal fun PlayerActivity.showV897JsonToggle() {
    val current = FeaturePrefsStore.batch891.v897json
    FeaturePrefsStore.batch891.v897json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v897: jump mode
internal fun PlayerActivity.showV897JumpToggle() {
    val current = FeaturePrefsStore.batch891.v897jump
    FeaturePrefsStore.batch891.v897jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v897: kernel mode
internal fun PlayerActivity.showV897KernelToggle() {
    val current = FeaturePrefsStore.batch891.v897kernel
    FeaturePrefsStore.batch891.v897kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v897: key mode
internal fun PlayerActivity.showV897KeyToggle() {
    val current = FeaturePrefsStore.batch891.v897key
    FeaturePrefsStore.batch891.v897key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v897: kill level
internal fun PlayerActivity.showV897KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v897: kit level
internal fun PlayerActivity.showV897KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v897: label level
internal fun PlayerActivity.showV897LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897label = value
        AppToast.show(this, "label: $value")
    }
}

// v897: lag level
internal fun PlayerActivity.showV897LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v897: language level
internal fun PlayerActivity.showV897LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897language = value
        AppToast.show(this, "language: $value")
    }
}

// v897: layer mode
internal fun PlayerActivity.showV897LayerToggle() {
    val current = FeaturePrefsStore.batch891.v897layer
    FeaturePrefsStore.batch891.v897layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v897: layout mode
internal fun PlayerActivity.showV897LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v897layout
    FeaturePrefsStore.batch891.v897layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v897: lazy mode
internal fun PlayerActivity.showV897LazyToggle() {
    val current = FeaturePrefsStore.batch891.v897lazy
    FeaturePrefsStore.batch891.v897lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v897: lead mode
internal fun PlayerActivity.showV897LeadToggle() {
    val current = FeaturePrefsStore.batch891.v897lead
    FeaturePrefsStore.batch891.v897lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v897: leaf mode
internal fun PlayerActivity.showV897LeafToggle() {
    val current = FeaturePrefsStore.batch891.v897leaf
    FeaturePrefsStore.batch891.v897leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v898: join mode
internal fun PlayerActivity.showV898JoinToggle() {
    val current = FeaturePrefsStore.batch891.v898join
    FeaturePrefsStore.batch891.v898join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v898: json mode
internal fun PlayerActivity.showV898JsonToggle() {
    val current = FeaturePrefsStore.batch891.v898json
    FeaturePrefsStore.batch891.v898json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v898: jump mode
internal fun PlayerActivity.showV898JumpToggle() {
    val current = FeaturePrefsStore.batch891.v898jump
    FeaturePrefsStore.batch891.v898jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v898: kernel mode
internal fun PlayerActivity.showV898KernelToggle() {
    val current = FeaturePrefsStore.batch891.v898kernel
    FeaturePrefsStore.batch891.v898kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v898: key mode
internal fun PlayerActivity.showV898KeyToggle() {
    val current = FeaturePrefsStore.batch891.v898key
    FeaturePrefsStore.batch891.v898key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v898: kill level
internal fun PlayerActivity.showV898KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v898: kit level
internal fun PlayerActivity.showV898KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v898: label level
internal fun PlayerActivity.showV898LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898label = value
        AppToast.show(this, "label: $value")
    }
}

// v898: lag level
internal fun PlayerActivity.showV898LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v898: language level
internal fun PlayerActivity.showV898LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898language = value
        AppToast.show(this, "language: $value")
    }
}

// v898: layer mode
internal fun PlayerActivity.showV898LayerToggle() {
    val current = FeaturePrefsStore.batch891.v898layer
    FeaturePrefsStore.batch891.v898layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v898: layout mode
internal fun PlayerActivity.showV898LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v898layout
    FeaturePrefsStore.batch891.v898layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v898: lazy mode
internal fun PlayerActivity.showV898LazyToggle() {
    val current = FeaturePrefsStore.batch891.v898lazy
    FeaturePrefsStore.batch891.v898lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v898: lead mode
internal fun PlayerActivity.showV898LeadToggle() {
    val current = FeaturePrefsStore.batch891.v898lead
    FeaturePrefsStore.batch891.v898lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v898: leaf mode
internal fun PlayerActivity.showV898LeafToggle() {
    val current = FeaturePrefsStore.batch891.v898leaf
    FeaturePrefsStore.batch891.v898leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v899: join mode
internal fun PlayerActivity.showV899JoinToggle() {
    val current = FeaturePrefsStore.batch891.v899join
    FeaturePrefsStore.batch891.v899join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v899: json mode
internal fun PlayerActivity.showV899JsonToggle() {
    val current = FeaturePrefsStore.batch891.v899json
    FeaturePrefsStore.batch891.v899json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v899: jump mode
internal fun PlayerActivity.showV899JumpToggle() {
    val current = FeaturePrefsStore.batch891.v899jump
    FeaturePrefsStore.batch891.v899jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v899: kernel mode
internal fun PlayerActivity.showV899KernelToggle() {
    val current = FeaturePrefsStore.batch891.v899kernel
    FeaturePrefsStore.batch891.v899kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v899: key mode
internal fun PlayerActivity.showV899KeyToggle() {
    val current = FeaturePrefsStore.batch891.v899key
    FeaturePrefsStore.batch891.v899key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v899: kill level
internal fun PlayerActivity.showV899KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v899: kit level
internal fun PlayerActivity.showV899KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v899: label level
internal fun PlayerActivity.showV899LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899label = value
        AppToast.show(this, "label: $value")
    }
}

// v899: lag level
internal fun PlayerActivity.showV899LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v899: language level
internal fun PlayerActivity.showV899LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899language = value
        AppToast.show(this, "language: $value")
    }
}

// v899: layer mode
internal fun PlayerActivity.showV899LayerToggle() {
    val current = FeaturePrefsStore.batch891.v899layer
    FeaturePrefsStore.batch891.v899layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v899: layout mode
internal fun PlayerActivity.showV899LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v899layout
    FeaturePrefsStore.batch891.v899layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v899: lazy mode
internal fun PlayerActivity.showV899LazyToggle() {
    val current = FeaturePrefsStore.batch891.v899lazy
    FeaturePrefsStore.batch891.v899lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v899: lead mode
internal fun PlayerActivity.showV899LeadToggle() {
    val current = FeaturePrefsStore.batch891.v899lead
    FeaturePrefsStore.batch891.v899lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v899: leaf mode
internal fun PlayerActivity.showV899LeafToggle() {
    val current = FeaturePrefsStore.batch891.v899leaf
    FeaturePrefsStore.batch891.v899leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v900: join mode
internal fun PlayerActivity.showV900JoinToggle() {
    val current = FeaturePrefsStore.batch891.v900join
    FeaturePrefsStore.batch891.v900join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v900: json mode
internal fun PlayerActivity.showV900JsonToggle() {
    val current = FeaturePrefsStore.batch891.v900json
    FeaturePrefsStore.batch891.v900json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v900: jump mode
internal fun PlayerActivity.showV900JumpToggle() {
    val current = FeaturePrefsStore.batch891.v900jump
    FeaturePrefsStore.batch891.v900jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v900: kernel mode
internal fun PlayerActivity.showV900KernelToggle() {
    val current = FeaturePrefsStore.batch891.v900kernel
    FeaturePrefsStore.batch891.v900kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v900: key mode
internal fun PlayerActivity.showV900KeyToggle() {
    val current = FeaturePrefsStore.batch891.v900key
    FeaturePrefsStore.batch891.v900key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v900: kill level
internal fun PlayerActivity.showV900KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v900: kit level
internal fun PlayerActivity.showV900KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v900: label level
internal fun PlayerActivity.showV900LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900label = value
        AppToast.show(this, "label: $value")
    }
}

// v900: lag level
internal fun PlayerActivity.showV900LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v900: language level
internal fun PlayerActivity.showV900LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900language = value
        AppToast.show(this, "language: $value")
    }
}

// v900: layer mode
internal fun PlayerActivity.showV900LayerToggle() {
    val current = FeaturePrefsStore.batch891.v900layer
    FeaturePrefsStore.batch891.v900layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v900: layout mode
internal fun PlayerActivity.showV900LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v900layout
    FeaturePrefsStore.batch891.v900layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v900: lazy mode
internal fun PlayerActivity.showV900LazyToggle() {
    val current = FeaturePrefsStore.batch891.v900lazy
    FeaturePrefsStore.batch891.v900lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v900: lead mode
internal fun PlayerActivity.showV900LeadToggle() {
    val current = FeaturePrefsStore.batch891.v900lead
    FeaturePrefsStore.batch891.v900lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v900: leaf mode
internal fun PlayerActivity.showV900LeafToggle() {
    val current = FeaturePrefsStore.batch891.v900leaf
    FeaturePrefsStore.batch891.v900leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

