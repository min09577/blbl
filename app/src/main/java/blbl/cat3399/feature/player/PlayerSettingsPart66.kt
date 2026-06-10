package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v851: gain mode
internal fun PlayerActivity.showV851GainToggle() {
    val current = FeaturePrefsStore.batch851.v851gain
    FeaturePrefsStore.batch851.v851gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v851: gamma mode
internal fun PlayerActivity.showV851GammaToggle() {
    val current = FeaturePrefsStore.batch851.v851gamma
    FeaturePrefsStore.batch851.v851gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v851: gap mode
internal fun PlayerActivity.showV851GapToggle() {
    val current = FeaturePrefsStore.batch851.v851gap
    FeaturePrefsStore.batch851.v851gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v851: gate mode
internal fun PlayerActivity.showV851GateToggle() {
    val current = FeaturePrefsStore.batch851.v851gate
    FeaturePrefsStore.batch851.v851gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v851: generate mode
internal fun PlayerActivity.showV851GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v851generate
    FeaturePrefsStore.batch851.v851generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v851: gesture level
internal fun PlayerActivity.showV851GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v851gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v851gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v851: global level
internal fun PlayerActivity.showV851GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v851global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v851global = value
        AppToast.show(this, "global: $value")
    }
}

// v851: glyph level
internal fun PlayerActivity.showV851GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v851glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v851glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v851: gradient level
internal fun PlayerActivity.showV851GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v851gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v851gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v851: grant level
internal fun PlayerActivity.showV851GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v851grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v851grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v851: graph mode
internal fun PlayerActivity.showV851GraphToggle() {
    val current = FeaturePrefsStore.batch851.v851graph
    FeaturePrefsStore.batch851.v851graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v851: gravity mode
internal fun PlayerActivity.showV851GravityToggle() {
    val current = FeaturePrefsStore.batch851.v851gravity
    FeaturePrefsStore.batch851.v851gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v851: grid mode
internal fun PlayerActivity.showV851GridToggle() {
    val current = FeaturePrefsStore.batch851.v851grid
    FeaturePrefsStore.batch851.v851grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v851: group mode
internal fun PlayerActivity.showV851GroupToggle() {
    val current = FeaturePrefsStore.batch851.v851group
    FeaturePrefsStore.batch851.v851group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v851: grow mode
internal fun PlayerActivity.showV851GrowToggle() {
    val current = FeaturePrefsStore.batch851.v851grow
    FeaturePrefsStore.batch851.v851grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v852: gain mode
internal fun PlayerActivity.showV852GainToggle() {
    val current = FeaturePrefsStore.batch851.v852gain
    FeaturePrefsStore.batch851.v852gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v852: gamma mode
internal fun PlayerActivity.showV852GammaToggle() {
    val current = FeaturePrefsStore.batch851.v852gamma
    FeaturePrefsStore.batch851.v852gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v852: gap mode
internal fun PlayerActivity.showV852GapToggle() {
    val current = FeaturePrefsStore.batch851.v852gap
    FeaturePrefsStore.batch851.v852gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v852: gate mode
internal fun PlayerActivity.showV852GateToggle() {
    val current = FeaturePrefsStore.batch851.v852gate
    FeaturePrefsStore.batch851.v852gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v852: generate mode
internal fun PlayerActivity.showV852GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v852generate
    FeaturePrefsStore.batch851.v852generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v852: gesture level
internal fun PlayerActivity.showV852GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v852gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v852gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v852: global level
internal fun PlayerActivity.showV852GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v852global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v852global = value
        AppToast.show(this, "global: $value")
    }
}

// v852: glyph level
internal fun PlayerActivity.showV852GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v852glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v852glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v852: gradient level
internal fun PlayerActivity.showV852GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v852gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v852gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v852: grant level
internal fun PlayerActivity.showV852GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v852grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v852grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v852: graph mode
internal fun PlayerActivity.showV852GraphToggle() {
    val current = FeaturePrefsStore.batch851.v852graph
    FeaturePrefsStore.batch851.v852graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v852: gravity mode
internal fun PlayerActivity.showV852GravityToggle() {
    val current = FeaturePrefsStore.batch851.v852gravity
    FeaturePrefsStore.batch851.v852gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v852: grid mode
internal fun PlayerActivity.showV852GridToggle() {
    val current = FeaturePrefsStore.batch851.v852grid
    FeaturePrefsStore.batch851.v852grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v852: group mode
internal fun PlayerActivity.showV852GroupToggle() {
    val current = FeaturePrefsStore.batch851.v852group
    FeaturePrefsStore.batch851.v852group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v852: grow mode
internal fun PlayerActivity.showV852GrowToggle() {
    val current = FeaturePrefsStore.batch851.v852grow
    FeaturePrefsStore.batch851.v852grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v853: gain mode
internal fun PlayerActivity.showV853GainToggle() {
    val current = FeaturePrefsStore.batch851.v853gain
    FeaturePrefsStore.batch851.v853gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v853: gamma mode
internal fun PlayerActivity.showV853GammaToggle() {
    val current = FeaturePrefsStore.batch851.v853gamma
    FeaturePrefsStore.batch851.v853gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v853: gap mode
internal fun PlayerActivity.showV853GapToggle() {
    val current = FeaturePrefsStore.batch851.v853gap
    FeaturePrefsStore.batch851.v853gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v853: gate mode
internal fun PlayerActivity.showV853GateToggle() {
    val current = FeaturePrefsStore.batch851.v853gate
    FeaturePrefsStore.batch851.v853gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v853: generate mode
internal fun PlayerActivity.showV853GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v853generate
    FeaturePrefsStore.batch851.v853generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v853: gesture level
internal fun PlayerActivity.showV853GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v853gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v853gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v853: global level
internal fun PlayerActivity.showV853GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v853global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v853global = value
        AppToast.show(this, "global: $value")
    }
}

// v853: glyph level
internal fun PlayerActivity.showV853GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v853glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v853glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v853: gradient level
internal fun PlayerActivity.showV853GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v853gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v853gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v853: grant level
internal fun PlayerActivity.showV853GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v853grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v853grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v853: graph mode
internal fun PlayerActivity.showV853GraphToggle() {
    val current = FeaturePrefsStore.batch851.v853graph
    FeaturePrefsStore.batch851.v853graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v853: gravity mode
internal fun PlayerActivity.showV853GravityToggle() {
    val current = FeaturePrefsStore.batch851.v853gravity
    FeaturePrefsStore.batch851.v853gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v853: grid mode
internal fun PlayerActivity.showV853GridToggle() {
    val current = FeaturePrefsStore.batch851.v853grid
    FeaturePrefsStore.batch851.v853grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v853: group mode
internal fun PlayerActivity.showV853GroupToggle() {
    val current = FeaturePrefsStore.batch851.v853group
    FeaturePrefsStore.batch851.v853group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v853: grow mode
internal fun PlayerActivity.showV853GrowToggle() {
    val current = FeaturePrefsStore.batch851.v853grow
    FeaturePrefsStore.batch851.v853grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v854: gain mode
internal fun PlayerActivity.showV854GainToggle() {
    val current = FeaturePrefsStore.batch851.v854gain
    FeaturePrefsStore.batch851.v854gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v854: gamma mode
internal fun PlayerActivity.showV854GammaToggle() {
    val current = FeaturePrefsStore.batch851.v854gamma
    FeaturePrefsStore.batch851.v854gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v854: gap mode
internal fun PlayerActivity.showV854GapToggle() {
    val current = FeaturePrefsStore.batch851.v854gap
    FeaturePrefsStore.batch851.v854gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v854: gate mode
internal fun PlayerActivity.showV854GateToggle() {
    val current = FeaturePrefsStore.batch851.v854gate
    FeaturePrefsStore.batch851.v854gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v854: generate mode
internal fun PlayerActivity.showV854GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v854generate
    FeaturePrefsStore.batch851.v854generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v854: gesture level
internal fun PlayerActivity.showV854GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v854gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v854gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v854: global level
internal fun PlayerActivity.showV854GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v854global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v854global = value
        AppToast.show(this, "global: $value")
    }
}

// v854: glyph level
internal fun PlayerActivity.showV854GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v854glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v854glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v854: gradient level
internal fun PlayerActivity.showV854GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v854gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v854gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v854: grant level
internal fun PlayerActivity.showV854GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v854grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v854grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v854: graph mode
internal fun PlayerActivity.showV854GraphToggle() {
    val current = FeaturePrefsStore.batch851.v854graph
    FeaturePrefsStore.batch851.v854graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v854: gravity mode
internal fun PlayerActivity.showV854GravityToggle() {
    val current = FeaturePrefsStore.batch851.v854gravity
    FeaturePrefsStore.batch851.v854gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v854: grid mode
internal fun PlayerActivity.showV854GridToggle() {
    val current = FeaturePrefsStore.batch851.v854grid
    FeaturePrefsStore.batch851.v854grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v854: group mode
internal fun PlayerActivity.showV854GroupToggle() {
    val current = FeaturePrefsStore.batch851.v854group
    FeaturePrefsStore.batch851.v854group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v854: grow mode
internal fun PlayerActivity.showV854GrowToggle() {
    val current = FeaturePrefsStore.batch851.v854grow
    FeaturePrefsStore.batch851.v854grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v855: gain mode
internal fun PlayerActivity.showV855GainToggle() {
    val current = FeaturePrefsStore.batch851.v855gain
    FeaturePrefsStore.batch851.v855gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v855: gamma mode
internal fun PlayerActivity.showV855GammaToggle() {
    val current = FeaturePrefsStore.batch851.v855gamma
    FeaturePrefsStore.batch851.v855gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v855: gap mode
internal fun PlayerActivity.showV855GapToggle() {
    val current = FeaturePrefsStore.batch851.v855gap
    FeaturePrefsStore.batch851.v855gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v855: gate mode
internal fun PlayerActivity.showV855GateToggle() {
    val current = FeaturePrefsStore.batch851.v855gate
    FeaturePrefsStore.batch851.v855gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v855: generate mode
internal fun PlayerActivity.showV855GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v855generate
    FeaturePrefsStore.batch851.v855generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v855: gesture level
internal fun PlayerActivity.showV855GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v855gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v855gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v855: global level
internal fun PlayerActivity.showV855GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v855global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v855global = value
        AppToast.show(this, "global: $value")
    }
}

// v855: glyph level
internal fun PlayerActivity.showV855GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v855glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v855glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v855: gradient level
internal fun PlayerActivity.showV855GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v855gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v855gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v855: grant level
internal fun PlayerActivity.showV855GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v855grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v855grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v855: graph mode
internal fun PlayerActivity.showV855GraphToggle() {
    val current = FeaturePrefsStore.batch851.v855graph
    FeaturePrefsStore.batch851.v855graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v855: gravity mode
internal fun PlayerActivity.showV855GravityToggle() {
    val current = FeaturePrefsStore.batch851.v855gravity
    FeaturePrefsStore.batch851.v855gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v855: grid mode
internal fun PlayerActivity.showV855GridToggle() {
    val current = FeaturePrefsStore.batch851.v855grid
    FeaturePrefsStore.batch851.v855grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v855: group mode
internal fun PlayerActivity.showV855GroupToggle() {
    val current = FeaturePrefsStore.batch851.v855group
    FeaturePrefsStore.batch851.v855group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v855: grow mode
internal fun PlayerActivity.showV855GrowToggle() {
    val current = FeaturePrefsStore.batch851.v855grow
    FeaturePrefsStore.batch851.v855grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v856: gain mode
internal fun PlayerActivity.showV856GainToggle() {
    val current = FeaturePrefsStore.batch851.v856gain
    FeaturePrefsStore.batch851.v856gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v856: gamma mode
internal fun PlayerActivity.showV856GammaToggle() {
    val current = FeaturePrefsStore.batch851.v856gamma
    FeaturePrefsStore.batch851.v856gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v856: gap mode
internal fun PlayerActivity.showV856GapToggle() {
    val current = FeaturePrefsStore.batch851.v856gap
    FeaturePrefsStore.batch851.v856gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v856: gate mode
internal fun PlayerActivity.showV856GateToggle() {
    val current = FeaturePrefsStore.batch851.v856gate
    FeaturePrefsStore.batch851.v856gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v856: generate mode
internal fun PlayerActivity.showV856GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v856generate
    FeaturePrefsStore.batch851.v856generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v856: gesture level
internal fun PlayerActivity.showV856GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v856gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v856gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v856: global level
internal fun PlayerActivity.showV856GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v856global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v856global = value
        AppToast.show(this, "global: $value")
    }
}

// v856: glyph level
internal fun PlayerActivity.showV856GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v856glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v856glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v856: gradient level
internal fun PlayerActivity.showV856GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v856gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v856gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v856: grant level
internal fun PlayerActivity.showV856GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v856grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v856grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v856: graph mode
internal fun PlayerActivity.showV856GraphToggle() {
    val current = FeaturePrefsStore.batch851.v856graph
    FeaturePrefsStore.batch851.v856graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v856: gravity mode
internal fun PlayerActivity.showV856GravityToggle() {
    val current = FeaturePrefsStore.batch851.v856gravity
    FeaturePrefsStore.batch851.v856gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v856: grid mode
internal fun PlayerActivity.showV856GridToggle() {
    val current = FeaturePrefsStore.batch851.v856grid
    FeaturePrefsStore.batch851.v856grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v856: group mode
internal fun PlayerActivity.showV856GroupToggle() {
    val current = FeaturePrefsStore.batch851.v856group
    FeaturePrefsStore.batch851.v856group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v856: grow mode
internal fun PlayerActivity.showV856GrowToggle() {
    val current = FeaturePrefsStore.batch851.v856grow
    FeaturePrefsStore.batch851.v856grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v857: gain mode
internal fun PlayerActivity.showV857GainToggle() {
    val current = FeaturePrefsStore.batch851.v857gain
    FeaturePrefsStore.batch851.v857gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v857: gamma mode
internal fun PlayerActivity.showV857GammaToggle() {
    val current = FeaturePrefsStore.batch851.v857gamma
    FeaturePrefsStore.batch851.v857gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v857: gap mode
internal fun PlayerActivity.showV857GapToggle() {
    val current = FeaturePrefsStore.batch851.v857gap
    FeaturePrefsStore.batch851.v857gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v857: gate mode
internal fun PlayerActivity.showV857GateToggle() {
    val current = FeaturePrefsStore.batch851.v857gate
    FeaturePrefsStore.batch851.v857gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v857: generate mode
internal fun PlayerActivity.showV857GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v857generate
    FeaturePrefsStore.batch851.v857generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v857: gesture level
internal fun PlayerActivity.showV857GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v857gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v857gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v857: global level
internal fun PlayerActivity.showV857GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v857global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v857global = value
        AppToast.show(this, "global: $value")
    }
}

// v857: glyph level
internal fun PlayerActivity.showV857GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v857glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v857glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v857: gradient level
internal fun PlayerActivity.showV857GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v857gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v857gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v857: grant level
internal fun PlayerActivity.showV857GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v857grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v857grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v857: graph mode
internal fun PlayerActivity.showV857GraphToggle() {
    val current = FeaturePrefsStore.batch851.v857graph
    FeaturePrefsStore.batch851.v857graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v857: gravity mode
internal fun PlayerActivity.showV857GravityToggle() {
    val current = FeaturePrefsStore.batch851.v857gravity
    FeaturePrefsStore.batch851.v857gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v857: grid mode
internal fun PlayerActivity.showV857GridToggle() {
    val current = FeaturePrefsStore.batch851.v857grid
    FeaturePrefsStore.batch851.v857grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v857: group mode
internal fun PlayerActivity.showV857GroupToggle() {
    val current = FeaturePrefsStore.batch851.v857group
    FeaturePrefsStore.batch851.v857group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v857: grow mode
internal fun PlayerActivity.showV857GrowToggle() {
    val current = FeaturePrefsStore.batch851.v857grow
    FeaturePrefsStore.batch851.v857grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v858: gain mode
internal fun PlayerActivity.showV858GainToggle() {
    val current = FeaturePrefsStore.batch851.v858gain
    FeaturePrefsStore.batch851.v858gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v858: gamma mode
internal fun PlayerActivity.showV858GammaToggle() {
    val current = FeaturePrefsStore.batch851.v858gamma
    FeaturePrefsStore.batch851.v858gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v858: gap mode
internal fun PlayerActivity.showV858GapToggle() {
    val current = FeaturePrefsStore.batch851.v858gap
    FeaturePrefsStore.batch851.v858gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v858: gate mode
internal fun PlayerActivity.showV858GateToggle() {
    val current = FeaturePrefsStore.batch851.v858gate
    FeaturePrefsStore.batch851.v858gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v858: generate mode
internal fun PlayerActivity.showV858GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v858generate
    FeaturePrefsStore.batch851.v858generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v858: gesture level
internal fun PlayerActivity.showV858GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v858gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v858gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v858: global level
internal fun PlayerActivity.showV858GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v858global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v858global = value
        AppToast.show(this, "global: $value")
    }
}

// v858: glyph level
internal fun PlayerActivity.showV858GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v858glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v858glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v858: gradient level
internal fun PlayerActivity.showV858GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v858gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v858gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v858: grant level
internal fun PlayerActivity.showV858GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v858grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v858grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v858: graph mode
internal fun PlayerActivity.showV858GraphToggle() {
    val current = FeaturePrefsStore.batch851.v858graph
    FeaturePrefsStore.batch851.v858graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v858: gravity mode
internal fun PlayerActivity.showV858GravityToggle() {
    val current = FeaturePrefsStore.batch851.v858gravity
    FeaturePrefsStore.batch851.v858gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v858: grid mode
internal fun PlayerActivity.showV858GridToggle() {
    val current = FeaturePrefsStore.batch851.v858grid
    FeaturePrefsStore.batch851.v858grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v858: group mode
internal fun PlayerActivity.showV858GroupToggle() {
    val current = FeaturePrefsStore.batch851.v858group
    FeaturePrefsStore.batch851.v858group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v858: grow mode
internal fun PlayerActivity.showV858GrowToggle() {
    val current = FeaturePrefsStore.batch851.v858grow
    FeaturePrefsStore.batch851.v858grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v859: gain mode
internal fun PlayerActivity.showV859GainToggle() {
    val current = FeaturePrefsStore.batch851.v859gain
    FeaturePrefsStore.batch851.v859gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v859: gamma mode
internal fun PlayerActivity.showV859GammaToggle() {
    val current = FeaturePrefsStore.batch851.v859gamma
    FeaturePrefsStore.batch851.v859gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v859: gap mode
internal fun PlayerActivity.showV859GapToggle() {
    val current = FeaturePrefsStore.batch851.v859gap
    FeaturePrefsStore.batch851.v859gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v859: gate mode
internal fun PlayerActivity.showV859GateToggle() {
    val current = FeaturePrefsStore.batch851.v859gate
    FeaturePrefsStore.batch851.v859gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v859: generate mode
internal fun PlayerActivity.showV859GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v859generate
    FeaturePrefsStore.batch851.v859generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v859: gesture level
internal fun PlayerActivity.showV859GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v859gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v859gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v859: global level
internal fun PlayerActivity.showV859GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v859global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v859global = value
        AppToast.show(this, "global: $value")
    }
}

// v859: glyph level
internal fun PlayerActivity.showV859GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v859glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v859glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v859: gradient level
internal fun PlayerActivity.showV859GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v859gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v859gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v859: grant level
internal fun PlayerActivity.showV859GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v859grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v859grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v859: graph mode
internal fun PlayerActivity.showV859GraphToggle() {
    val current = FeaturePrefsStore.batch851.v859graph
    FeaturePrefsStore.batch851.v859graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v859: gravity mode
internal fun PlayerActivity.showV859GravityToggle() {
    val current = FeaturePrefsStore.batch851.v859gravity
    FeaturePrefsStore.batch851.v859gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v859: grid mode
internal fun PlayerActivity.showV859GridToggle() {
    val current = FeaturePrefsStore.batch851.v859grid
    FeaturePrefsStore.batch851.v859grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v859: group mode
internal fun PlayerActivity.showV859GroupToggle() {
    val current = FeaturePrefsStore.batch851.v859group
    FeaturePrefsStore.batch851.v859group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v859: grow mode
internal fun PlayerActivity.showV859GrowToggle() {
    val current = FeaturePrefsStore.batch851.v859grow
    FeaturePrefsStore.batch851.v859grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

// v860: gain mode
internal fun PlayerActivity.showV860GainToggle() {
    val current = FeaturePrefsStore.batch851.v860gain
    FeaturePrefsStore.batch851.v860gain = !current
    AppToast.show(this, "gain: ${if (!current) "ON" else "OFF"}")
}

// v860: gamma mode
internal fun PlayerActivity.showV860GammaToggle() {
    val current = FeaturePrefsStore.batch851.v860gamma
    FeaturePrefsStore.batch851.v860gamma = !current
    AppToast.show(this, "gamma: ${if (!current) "ON" else "OFF"}")
}

// v860: gap mode
internal fun PlayerActivity.showV860GapToggle() {
    val current = FeaturePrefsStore.batch851.v860gap
    FeaturePrefsStore.batch851.v860gap = !current
    AppToast.show(this, "gap: ${if (!current) "ON" else "OFF"}")
}

// v860: gate mode
internal fun PlayerActivity.showV860GateToggle() {
    val current = FeaturePrefsStore.batch851.v860gate
    FeaturePrefsStore.batch851.v860gate = !current
    AppToast.show(this, "gate: ${if (!current) "ON" else "OFF"}")
}

// v860: generate mode
internal fun PlayerActivity.showV860GenerateToggle() {
    val current = FeaturePrefsStore.batch851.v860generate
    FeaturePrefsStore.batch851.v860generate = !current
    AppToast.show(this, "generate: ${if (!current) "ON" else "OFF"}")
}

// v860: gesture level
internal fun PlayerActivity.showV860GestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v860gesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gesture level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v860gesture = value
        AppToast.show(this, "gesture: $value")
    }
}

// v860: global level
internal fun PlayerActivity.showV860GlobalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v860global).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "global level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v860global = value
        AppToast.show(this, "global: $value")
    }
}

// v860: glyph level
internal fun PlayerActivity.showV860GlyphDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v860glyph).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "glyph level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v860glyph = value
        AppToast.show(this, "glyph: $value")
    }
}

// v860: gradient level
internal fun PlayerActivity.showV860GradientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v860gradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gradient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v860gradient = value
        AppToast.show(this, "gradient: $value")
    }
}

// v860: grant level
internal fun PlayerActivity.showV860GrantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch851.v860grant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch851.v860grant = value
        AppToast.show(this, "grant: $value")
    }
}

// v860: graph mode
internal fun PlayerActivity.showV860GraphToggle() {
    val current = FeaturePrefsStore.batch851.v860graph
    FeaturePrefsStore.batch851.v860graph = !current
    AppToast.show(this, "graph: ${if (!current) "ON" else "OFF"}")
}

// v860: gravity mode
internal fun PlayerActivity.showV860GravityToggle() {
    val current = FeaturePrefsStore.batch851.v860gravity
    FeaturePrefsStore.batch851.v860gravity = !current
    AppToast.show(this, "gravity: ${if (!current) "ON" else "OFF"}")
}

// v860: grid mode
internal fun PlayerActivity.showV860GridToggle() {
    val current = FeaturePrefsStore.batch851.v860grid
    FeaturePrefsStore.batch851.v860grid = !current
    AppToast.show(this, "grid: ${if (!current) "ON" else "OFF"}")
}

// v860: group mode
internal fun PlayerActivity.showV860GroupToggle() {
    val current = FeaturePrefsStore.batch851.v860group
    FeaturePrefsStore.batch851.v860group = !current
    AppToast.show(this, "group: ${if (!current) "ON" else "OFF"}")
}

// v860: grow mode
internal fun PlayerActivity.showV860GrowToggle() {
    val current = FeaturePrefsStore.batch851.v860grow
    FeaturePrefsStore.batch851.v860grow = !current
    AppToast.show(this, "grow: ${if (!current) "ON" else "OFF"}")
}

