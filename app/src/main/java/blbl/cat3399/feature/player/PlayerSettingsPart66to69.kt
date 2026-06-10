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

// v861: guard mode
internal fun PlayerActivity.showV861GuardToggle() {
    val current = FeaturePrefsStore.batch861.v861guard
    FeaturePrefsStore.batch861.v861guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v861: guess mode
internal fun PlayerActivity.showV861GuessToggle() {
    val current = FeaturePrefsStore.batch861.v861guess
    FeaturePrefsStore.batch861.v861guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v861: guide mode
internal fun PlayerActivity.showV861GuideToggle() {
    val current = FeaturePrefsStore.batch861.v861guide
    FeaturePrefsStore.batch861.v861guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v861: handle mode
internal fun PlayerActivity.showV861HandleToggle() {
    val current = FeaturePrefsStore.batch861.v861handle
    FeaturePrefsStore.batch861.v861handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v861: handler mode
internal fun PlayerActivity.showV861HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v861handler
    FeaturePrefsStore.batch861.v861handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v861: hardware level
internal fun PlayerActivity.showV861HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v861hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v861hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v861: hash level
internal fun PlayerActivity.showV861HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v861hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v861hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v861: head level
internal fun PlayerActivity.showV861HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v861head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v861head = value
        AppToast.show(this, "head: $value")
    }
}

// v861: header level
internal fun PlayerActivity.showV861HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v861header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v861header = value
        AppToast.show(this, "header: $value")
    }
}

// v861: heap level
internal fun PlayerActivity.showV861HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v861heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v861heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v861: height mode
internal fun PlayerActivity.showV861HeightToggle() {
    val current = FeaturePrefsStore.batch861.v861height
    FeaturePrefsStore.batch861.v861height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v861: hidden mode
internal fun PlayerActivity.showV861HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v861hidden
    FeaturePrefsStore.batch861.v861hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v861: highlight mode
internal fun PlayerActivity.showV861HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v861highlight
    FeaturePrefsStore.batch861.v861highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v861: hint mode
internal fun PlayerActivity.showV861HintToggle() {
    val current = FeaturePrefsStore.batch861.v861hint
    FeaturePrefsStore.batch861.v861hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v861: history mode
internal fun PlayerActivity.showV861HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v861history
    FeaturePrefsStore.batch861.v861history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v862: guard mode
internal fun PlayerActivity.showV862GuardToggle() {
    val current = FeaturePrefsStore.batch861.v862guard
    FeaturePrefsStore.batch861.v862guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v862: guess mode
internal fun PlayerActivity.showV862GuessToggle() {
    val current = FeaturePrefsStore.batch861.v862guess
    FeaturePrefsStore.batch861.v862guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v862: guide mode
internal fun PlayerActivity.showV862GuideToggle() {
    val current = FeaturePrefsStore.batch861.v862guide
    FeaturePrefsStore.batch861.v862guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v862: handle mode
internal fun PlayerActivity.showV862HandleToggle() {
    val current = FeaturePrefsStore.batch861.v862handle
    FeaturePrefsStore.batch861.v862handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v862: handler mode
internal fun PlayerActivity.showV862HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v862handler
    FeaturePrefsStore.batch861.v862handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v862: hardware level
internal fun PlayerActivity.showV862HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v862hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v862hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v862: hash level
internal fun PlayerActivity.showV862HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v862hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v862hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v862: head level
internal fun PlayerActivity.showV862HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v862head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v862head = value
        AppToast.show(this, "head: $value")
    }
}

// v862: header level
internal fun PlayerActivity.showV862HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v862header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v862header = value
        AppToast.show(this, "header: $value")
    }
}

// v862: heap level
internal fun PlayerActivity.showV862HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v862heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v862heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v862: height mode
internal fun PlayerActivity.showV862HeightToggle() {
    val current = FeaturePrefsStore.batch861.v862height
    FeaturePrefsStore.batch861.v862height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v862: hidden mode
internal fun PlayerActivity.showV862HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v862hidden
    FeaturePrefsStore.batch861.v862hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v862: highlight mode
internal fun PlayerActivity.showV862HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v862highlight
    FeaturePrefsStore.batch861.v862highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v862: hint mode
internal fun PlayerActivity.showV862HintToggle() {
    val current = FeaturePrefsStore.batch861.v862hint
    FeaturePrefsStore.batch861.v862hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v862: history mode
internal fun PlayerActivity.showV862HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v862history
    FeaturePrefsStore.batch861.v862history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v863: guard mode
internal fun PlayerActivity.showV863GuardToggle() {
    val current = FeaturePrefsStore.batch861.v863guard
    FeaturePrefsStore.batch861.v863guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v863: guess mode
internal fun PlayerActivity.showV863GuessToggle() {
    val current = FeaturePrefsStore.batch861.v863guess
    FeaturePrefsStore.batch861.v863guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v863: guide mode
internal fun PlayerActivity.showV863GuideToggle() {
    val current = FeaturePrefsStore.batch861.v863guide
    FeaturePrefsStore.batch861.v863guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v863: handle mode
internal fun PlayerActivity.showV863HandleToggle() {
    val current = FeaturePrefsStore.batch861.v863handle
    FeaturePrefsStore.batch861.v863handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v863: handler mode
internal fun PlayerActivity.showV863HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v863handler
    FeaturePrefsStore.batch861.v863handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v863: hardware level
internal fun PlayerActivity.showV863HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v863hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v863hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v863: hash level
internal fun PlayerActivity.showV863HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v863hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v863hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v863: head level
internal fun PlayerActivity.showV863HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v863head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v863head = value
        AppToast.show(this, "head: $value")
    }
}

// v863: header level
internal fun PlayerActivity.showV863HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v863header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v863header = value
        AppToast.show(this, "header: $value")
    }
}

// v863: heap level
internal fun PlayerActivity.showV863HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v863heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v863heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v863: height mode
internal fun PlayerActivity.showV863HeightToggle() {
    val current = FeaturePrefsStore.batch861.v863height
    FeaturePrefsStore.batch861.v863height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v863: hidden mode
internal fun PlayerActivity.showV863HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v863hidden
    FeaturePrefsStore.batch861.v863hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v863: highlight mode
internal fun PlayerActivity.showV863HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v863highlight
    FeaturePrefsStore.batch861.v863highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v863: hint mode
internal fun PlayerActivity.showV863HintToggle() {
    val current = FeaturePrefsStore.batch861.v863hint
    FeaturePrefsStore.batch861.v863hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v863: history mode
internal fun PlayerActivity.showV863HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v863history
    FeaturePrefsStore.batch861.v863history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v864: guard mode
internal fun PlayerActivity.showV864GuardToggle() {
    val current = FeaturePrefsStore.batch861.v864guard
    FeaturePrefsStore.batch861.v864guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v864: guess mode
internal fun PlayerActivity.showV864GuessToggle() {
    val current = FeaturePrefsStore.batch861.v864guess
    FeaturePrefsStore.batch861.v864guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v864: guide mode
internal fun PlayerActivity.showV864GuideToggle() {
    val current = FeaturePrefsStore.batch861.v864guide
    FeaturePrefsStore.batch861.v864guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v864: handle mode
internal fun PlayerActivity.showV864HandleToggle() {
    val current = FeaturePrefsStore.batch861.v864handle
    FeaturePrefsStore.batch861.v864handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v864: handler mode
internal fun PlayerActivity.showV864HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v864handler
    FeaturePrefsStore.batch861.v864handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v864: hardware level
internal fun PlayerActivity.showV864HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v864hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v864hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v864: hash level
internal fun PlayerActivity.showV864HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v864hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v864hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v864: head level
internal fun PlayerActivity.showV864HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v864head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v864head = value
        AppToast.show(this, "head: $value")
    }
}

// v864: header level
internal fun PlayerActivity.showV864HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v864header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v864header = value
        AppToast.show(this, "header: $value")
    }
}

// v864: heap level
internal fun PlayerActivity.showV864HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v864heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v864heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v864: height mode
internal fun PlayerActivity.showV864HeightToggle() {
    val current = FeaturePrefsStore.batch861.v864height
    FeaturePrefsStore.batch861.v864height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v864: hidden mode
internal fun PlayerActivity.showV864HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v864hidden
    FeaturePrefsStore.batch861.v864hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v864: highlight mode
internal fun PlayerActivity.showV864HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v864highlight
    FeaturePrefsStore.batch861.v864highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v864: hint mode
internal fun PlayerActivity.showV864HintToggle() {
    val current = FeaturePrefsStore.batch861.v864hint
    FeaturePrefsStore.batch861.v864hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v864: history mode
internal fun PlayerActivity.showV864HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v864history
    FeaturePrefsStore.batch861.v864history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v865: guard mode
internal fun PlayerActivity.showV865GuardToggle() {
    val current = FeaturePrefsStore.batch861.v865guard
    FeaturePrefsStore.batch861.v865guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v865: guess mode
internal fun PlayerActivity.showV865GuessToggle() {
    val current = FeaturePrefsStore.batch861.v865guess
    FeaturePrefsStore.batch861.v865guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v865: guide mode
internal fun PlayerActivity.showV865GuideToggle() {
    val current = FeaturePrefsStore.batch861.v865guide
    FeaturePrefsStore.batch861.v865guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v865: handle mode
internal fun PlayerActivity.showV865HandleToggle() {
    val current = FeaturePrefsStore.batch861.v865handle
    FeaturePrefsStore.batch861.v865handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v865: handler mode
internal fun PlayerActivity.showV865HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v865handler
    FeaturePrefsStore.batch861.v865handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v865: hardware level
internal fun PlayerActivity.showV865HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v865hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v865hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v865: hash level
internal fun PlayerActivity.showV865HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v865hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v865hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v865: head level
internal fun PlayerActivity.showV865HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v865head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v865head = value
        AppToast.show(this, "head: $value")
    }
}

// v865: header level
internal fun PlayerActivity.showV865HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v865header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v865header = value
        AppToast.show(this, "header: $value")
    }
}

// v865: heap level
internal fun PlayerActivity.showV865HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v865heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v865heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v865: height mode
internal fun PlayerActivity.showV865HeightToggle() {
    val current = FeaturePrefsStore.batch861.v865height
    FeaturePrefsStore.batch861.v865height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v865: hidden mode
internal fun PlayerActivity.showV865HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v865hidden
    FeaturePrefsStore.batch861.v865hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v865: highlight mode
internal fun PlayerActivity.showV865HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v865highlight
    FeaturePrefsStore.batch861.v865highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v865: hint mode
internal fun PlayerActivity.showV865HintToggle() {
    val current = FeaturePrefsStore.batch861.v865hint
    FeaturePrefsStore.batch861.v865hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v865: history mode
internal fun PlayerActivity.showV865HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v865history
    FeaturePrefsStore.batch861.v865history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v866: guard mode
internal fun PlayerActivity.showV866GuardToggle() {
    val current = FeaturePrefsStore.batch861.v866guard
    FeaturePrefsStore.batch861.v866guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v866: guess mode
internal fun PlayerActivity.showV866GuessToggle() {
    val current = FeaturePrefsStore.batch861.v866guess
    FeaturePrefsStore.batch861.v866guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v866: guide mode
internal fun PlayerActivity.showV866GuideToggle() {
    val current = FeaturePrefsStore.batch861.v866guide
    FeaturePrefsStore.batch861.v866guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v866: handle mode
internal fun PlayerActivity.showV866HandleToggle() {
    val current = FeaturePrefsStore.batch861.v866handle
    FeaturePrefsStore.batch861.v866handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v866: handler mode
internal fun PlayerActivity.showV866HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v866handler
    FeaturePrefsStore.batch861.v866handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v866: hardware level
internal fun PlayerActivity.showV866HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v866hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v866hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v866: hash level
internal fun PlayerActivity.showV866HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v866hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v866hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v866: head level
internal fun PlayerActivity.showV866HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v866head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v866head = value
        AppToast.show(this, "head: $value")
    }
}

// v866: header level
internal fun PlayerActivity.showV866HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v866header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v866header = value
        AppToast.show(this, "header: $value")
    }
}

// v866: heap level
internal fun PlayerActivity.showV866HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v866heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v866heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v866: height mode
internal fun PlayerActivity.showV866HeightToggle() {
    val current = FeaturePrefsStore.batch861.v866height
    FeaturePrefsStore.batch861.v866height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v866: hidden mode
internal fun PlayerActivity.showV866HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v866hidden
    FeaturePrefsStore.batch861.v866hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v866: highlight mode
internal fun PlayerActivity.showV866HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v866highlight
    FeaturePrefsStore.batch861.v866highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v866: hint mode
internal fun PlayerActivity.showV866HintToggle() {
    val current = FeaturePrefsStore.batch861.v866hint
    FeaturePrefsStore.batch861.v866hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v866: history mode
internal fun PlayerActivity.showV866HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v866history
    FeaturePrefsStore.batch861.v866history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v867: guard mode
internal fun PlayerActivity.showV867GuardToggle() {
    val current = FeaturePrefsStore.batch861.v867guard
    FeaturePrefsStore.batch861.v867guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v867: guess mode
internal fun PlayerActivity.showV867GuessToggle() {
    val current = FeaturePrefsStore.batch861.v867guess
    FeaturePrefsStore.batch861.v867guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v867: guide mode
internal fun PlayerActivity.showV867GuideToggle() {
    val current = FeaturePrefsStore.batch861.v867guide
    FeaturePrefsStore.batch861.v867guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v867: handle mode
internal fun PlayerActivity.showV867HandleToggle() {
    val current = FeaturePrefsStore.batch861.v867handle
    FeaturePrefsStore.batch861.v867handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v867: handler mode
internal fun PlayerActivity.showV867HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v867handler
    FeaturePrefsStore.batch861.v867handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v867: hardware level
internal fun PlayerActivity.showV867HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v867hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v867hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v867: hash level
internal fun PlayerActivity.showV867HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v867hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v867hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v867: head level
internal fun PlayerActivity.showV867HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v867head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v867head = value
        AppToast.show(this, "head: $value")
    }
}

// v867: header level
internal fun PlayerActivity.showV867HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v867header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v867header = value
        AppToast.show(this, "header: $value")
    }
}

// v867: heap level
internal fun PlayerActivity.showV867HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v867heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v867heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v867: height mode
internal fun PlayerActivity.showV867HeightToggle() {
    val current = FeaturePrefsStore.batch861.v867height
    FeaturePrefsStore.batch861.v867height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v867: hidden mode
internal fun PlayerActivity.showV867HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v867hidden
    FeaturePrefsStore.batch861.v867hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v867: highlight mode
internal fun PlayerActivity.showV867HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v867highlight
    FeaturePrefsStore.batch861.v867highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v867: hint mode
internal fun PlayerActivity.showV867HintToggle() {
    val current = FeaturePrefsStore.batch861.v867hint
    FeaturePrefsStore.batch861.v867hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v867: history mode
internal fun PlayerActivity.showV867HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v867history
    FeaturePrefsStore.batch861.v867history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v868: guard mode
internal fun PlayerActivity.showV868GuardToggle() {
    val current = FeaturePrefsStore.batch861.v868guard
    FeaturePrefsStore.batch861.v868guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v868: guess mode
internal fun PlayerActivity.showV868GuessToggle() {
    val current = FeaturePrefsStore.batch861.v868guess
    FeaturePrefsStore.batch861.v868guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v868: guide mode
internal fun PlayerActivity.showV868GuideToggle() {
    val current = FeaturePrefsStore.batch861.v868guide
    FeaturePrefsStore.batch861.v868guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v868: handle mode
internal fun PlayerActivity.showV868HandleToggle() {
    val current = FeaturePrefsStore.batch861.v868handle
    FeaturePrefsStore.batch861.v868handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v868: handler mode
internal fun PlayerActivity.showV868HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v868handler
    FeaturePrefsStore.batch861.v868handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v868: hardware level
internal fun PlayerActivity.showV868HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v868hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v868hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v868: hash level
internal fun PlayerActivity.showV868HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v868hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v868hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v868: head level
internal fun PlayerActivity.showV868HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v868head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v868head = value
        AppToast.show(this, "head: $value")
    }
}

// v868: header level
internal fun PlayerActivity.showV868HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v868header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v868header = value
        AppToast.show(this, "header: $value")
    }
}

// v868: heap level
internal fun PlayerActivity.showV868HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v868heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v868heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v868: height mode
internal fun PlayerActivity.showV868HeightToggle() {
    val current = FeaturePrefsStore.batch861.v868height
    FeaturePrefsStore.batch861.v868height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v868: hidden mode
internal fun PlayerActivity.showV868HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v868hidden
    FeaturePrefsStore.batch861.v868hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v868: highlight mode
internal fun PlayerActivity.showV868HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v868highlight
    FeaturePrefsStore.batch861.v868highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v868: hint mode
internal fun PlayerActivity.showV868HintToggle() {
    val current = FeaturePrefsStore.batch861.v868hint
    FeaturePrefsStore.batch861.v868hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v868: history mode
internal fun PlayerActivity.showV868HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v868history
    FeaturePrefsStore.batch861.v868history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v869: guard mode
internal fun PlayerActivity.showV869GuardToggle() {
    val current = FeaturePrefsStore.batch861.v869guard
    FeaturePrefsStore.batch861.v869guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v869: guess mode
internal fun PlayerActivity.showV869GuessToggle() {
    val current = FeaturePrefsStore.batch861.v869guess
    FeaturePrefsStore.batch861.v869guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v869: guide mode
internal fun PlayerActivity.showV869GuideToggle() {
    val current = FeaturePrefsStore.batch861.v869guide
    FeaturePrefsStore.batch861.v869guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v869: handle mode
internal fun PlayerActivity.showV869HandleToggle() {
    val current = FeaturePrefsStore.batch861.v869handle
    FeaturePrefsStore.batch861.v869handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v869: handler mode
internal fun PlayerActivity.showV869HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v869handler
    FeaturePrefsStore.batch861.v869handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v869: hardware level
internal fun PlayerActivity.showV869HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v869hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v869hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v869: hash level
internal fun PlayerActivity.showV869HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v869hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v869hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v869: head level
internal fun PlayerActivity.showV869HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v869head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v869head = value
        AppToast.show(this, "head: $value")
    }
}

// v869: header level
internal fun PlayerActivity.showV869HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v869header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v869header = value
        AppToast.show(this, "header: $value")
    }
}

// v869: heap level
internal fun PlayerActivity.showV869HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v869heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v869heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v869: height mode
internal fun PlayerActivity.showV869HeightToggle() {
    val current = FeaturePrefsStore.batch861.v869height
    FeaturePrefsStore.batch861.v869height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v869: hidden mode
internal fun PlayerActivity.showV869HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v869hidden
    FeaturePrefsStore.batch861.v869hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v869: highlight mode
internal fun PlayerActivity.showV869HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v869highlight
    FeaturePrefsStore.batch861.v869highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v869: hint mode
internal fun PlayerActivity.showV869HintToggle() {
    val current = FeaturePrefsStore.batch861.v869hint
    FeaturePrefsStore.batch861.v869hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v869: history mode
internal fun PlayerActivity.showV869HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v869history
    FeaturePrefsStore.batch861.v869history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

// v870: guard mode
internal fun PlayerActivity.showV870GuardToggle() {
    val current = FeaturePrefsStore.batch861.v870guard
    FeaturePrefsStore.batch861.v870guard = !current
    AppToast.show(this, "guard: ${if (!current) "ON" else "OFF"}")
}

// v870: guess mode
internal fun PlayerActivity.showV870GuessToggle() {
    val current = FeaturePrefsStore.batch861.v870guess
    FeaturePrefsStore.batch861.v870guess = !current
    AppToast.show(this, "guess: ${if (!current) "ON" else "OFF"}")
}

// v870: guide mode
internal fun PlayerActivity.showV870GuideToggle() {
    val current = FeaturePrefsStore.batch861.v870guide
    FeaturePrefsStore.batch861.v870guide = !current
    AppToast.show(this, "guide: ${if (!current) "ON" else "OFF"}")
}

// v870: handle mode
internal fun PlayerActivity.showV870HandleToggle() {
    val current = FeaturePrefsStore.batch861.v870handle
    FeaturePrefsStore.batch861.v870handle = !current
    AppToast.show(this, "handle: ${if (!current) "ON" else "OFF"}")
}

// v870: handler mode
internal fun PlayerActivity.showV870HandlerToggle() {
    val current = FeaturePrefsStore.batch861.v870handler
    FeaturePrefsStore.batch861.v870handler = !current
    AppToast.show(this, "handler: ${if (!current) "ON" else "OFF"}")
}

// v870: hardware level
internal fun PlayerActivity.showV870HardwareDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v870hardware).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hardware level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v870hardware = value
        AppToast.show(this, "hardware: $value")
    }
}

// v870: hash level
internal fun PlayerActivity.showV870HashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v870hash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v870hash = value
        AppToast.show(this, "hash: $value")
    }
}

// v870: head level
internal fun PlayerActivity.showV870HeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v870head).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "head level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v870head = value
        AppToast.show(this, "head: $value")
    }
}

// v870: header level
internal fun PlayerActivity.showV870HeaderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v870header).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "header level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v870header = value
        AppToast.show(this, "header: $value")
    }
}

// v870: heap level
internal fun PlayerActivity.showV870HeapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch861.v870heap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch861.v870heap = value
        AppToast.show(this, "heap: $value")
    }
}

// v870: height mode
internal fun PlayerActivity.showV870HeightToggle() {
    val current = FeaturePrefsStore.batch861.v870height
    FeaturePrefsStore.batch861.v870height = !current
    AppToast.show(this, "height: ${if (!current) "ON" else "OFF"}")
}

// v870: hidden mode
internal fun PlayerActivity.showV870HiddenToggle() {
    val current = FeaturePrefsStore.batch861.v870hidden
    FeaturePrefsStore.batch861.v870hidden = !current
    AppToast.show(this, "hidden: ${if (!current) "ON" else "OFF"}")
}

// v870: highlight mode
internal fun PlayerActivity.showV870HighlightToggle() {
    val current = FeaturePrefsStore.batch861.v870highlight
    FeaturePrefsStore.batch861.v870highlight = !current
    AppToast.show(this, "highlight: ${if (!current) "ON" else "OFF"}")
}

// v870: hint mode
internal fun PlayerActivity.showV870HintToggle() {
    val current = FeaturePrefsStore.batch861.v870hint
    FeaturePrefsStore.batch861.v870hint = !current
    AppToast.show(this, "hint: ${if (!current) "ON" else "OFF"}")
}

// v870: history mode
internal fun PlayerActivity.showV870HistoryToggle() {
    val current = FeaturePrefsStore.batch861.v870history
    FeaturePrefsStore.batch861.v870history = !current
    AppToast.show(this, "history: ${if (!current) "ON" else "OFF"}")
}

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

// v881: info mode
internal fun PlayerActivity.showV881InfoToggle() {
    val current = FeaturePrefsStore.batch881.v881info
    FeaturePrefsStore.batch881.v881info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v881: init mode
internal fun PlayerActivity.showV881InitToggle() {
    val current = FeaturePrefsStore.batch881.v881init
    FeaturePrefsStore.batch881.v881init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v881: input mode
internal fun PlayerActivity.showV881InputToggle() {
    val current = FeaturePrefsStore.batch881.v881input
    FeaturePrefsStore.batch881.v881input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v881: insert mode
internal fun PlayerActivity.showV881InsertToggle() {
    val current = FeaturePrefsStore.batch881.v881insert
    FeaturePrefsStore.batch881.v881insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v881: install mode
internal fun PlayerActivity.showV881InstallToggle() {
    val current = FeaturePrefsStore.batch881.v881install
    FeaturePrefsStore.batch881.v881install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v881: instance level
internal fun PlayerActivity.showV881InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v881: intent level
internal fun PlayerActivity.showV881IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v881: interact level
internal fun PlayerActivity.showV881InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v881: interface level
internal fun PlayerActivity.showV881InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v881: internal level
internal fun PlayerActivity.showV881InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v881: interval mode
internal fun PlayerActivity.showV881IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v881interval
    FeaturePrefsStore.batch881.v881interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v881: invoke mode
internal fun PlayerActivity.showV881InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v881invoke
    FeaturePrefsStore.batch881.v881invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v881: io mode
internal fun PlayerActivity.showV881IoToggle() {
    val current = FeaturePrefsStore.batch881.v881io
    FeaturePrefsStore.batch881.v881io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v881: item mode
internal fun PlayerActivity.showV881ItemToggle() {
    val current = FeaturePrefsStore.batch881.v881item
    FeaturePrefsStore.batch881.v881item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v881: iterate mode
internal fun PlayerActivity.showV881IterateToggle() {
    val current = FeaturePrefsStore.batch881.v881iterate
    FeaturePrefsStore.batch881.v881iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v882: info mode
internal fun PlayerActivity.showV882InfoToggle() {
    val current = FeaturePrefsStore.batch881.v882info
    FeaturePrefsStore.batch881.v882info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v882: init mode
internal fun PlayerActivity.showV882InitToggle() {
    val current = FeaturePrefsStore.batch881.v882init
    FeaturePrefsStore.batch881.v882init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v882: input mode
internal fun PlayerActivity.showV882InputToggle() {
    val current = FeaturePrefsStore.batch881.v882input
    FeaturePrefsStore.batch881.v882input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v882: insert mode
internal fun PlayerActivity.showV882InsertToggle() {
    val current = FeaturePrefsStore.batch881.v882insert
    FeaturePrefsStore.batch881.v882insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v882: install mode
internal fun PlayerActivity.showV882InstallToggle() {
    val current = FeaturePrefsStore.batch881.v882install
    FeaturePrefsStore.batch881.v882install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v882: instance level
internal fun PlayerActivity.showV882InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v882: intent level
internal fun PlayerActivity.showV882IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v882: interact level
internal fun PlayerActivity.showV882InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v882: interface level
internal fun PlayerActivity.showV882InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v882: internal level
internal fun PlayerActivity.showV882InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v882: interval mode
internal fun PlayerActivity.showV882IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v882interval
    FeaturePrefsStore.batch881.v882interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v882: invoke mode
internal fun PlayerActivity.showV882InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v882invoke
    FeaturePrefsStore.batch881.v882invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v882: io mode
internal fun PlayerActivity.showV882IoToggle() {
    val current = FeaturePrefsStore.batch881.v882io
    FeaturePrefsStore.batch881.v882io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v882: item mode
internal fun PlayerActivity.showV882ItemToggle() {
    val current = FeaturePrefsStore.batch881.v882item
    FeaturePrefsStore.batch881.v882item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v882: iterate mode
internal fun PlayerActivity.showV882IterateToggle() {
    val current = FeaturePrefsStore.batch881.v882iterate
    FeaturePrefsStore.batch881.v882iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v883: info mode
internal fun PlayerActivity.showV883InfoToggle() {
    val current = FeaturePrefsStore.batch881.v883info
    FeaturePrefsStore.batch881.v883info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v883: init mode
internal fun PlayerActivity.showV883InitToggle() {
    val current = FeaturePrefsStore.batch881.v883init
    FeaturePrefsStore.batch881.v883init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v883: input mode
internal fun PlayerActivity.showV883InputToggle() {
    val current = FeaturePrefsStore.batch881.v883input
    FeaturePrefsStore.batch881.v883input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v883: insert mode
internal fun PlayerActivity.showV883InsertToggle() {
    val current = FeaturePrefsStore.batch881.v883insert
    FeaturePrefsStore.batch881.v883insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v883: install mode
internal fun PlayerActivity.showV883InstallToggle() {
    val current = FeaturePrefsStore.batch881.v883install
    FeaturePrefsStore.batch881.v883install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v883: instance level
internal fun PlayerActivity.showV883InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v883: intent level
internal fun PlayerActivity.showV883IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v883: interact level
internal fun PlayerActivity.showV883InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v883: interface level
internal fun PlayerActivity.showV883InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v883: internal level
internal fun PlayerActivity.showV883InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v883: interval mode
internal fun PlayerActivity.showV883IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v883interval
    FeaturePrefsStore.batch881.v883interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v883: invoke mode
internal fun PlayerActivity.showV883InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v883invoke
    FeaturePrefsStore.batch881.v883invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v883: io mode
internal fun PlayerActivity.showV883IoToggle() {
    val current = FeaturePrefsStore.batch881.v883io
    FeaturePrefsStore.batch881.v883io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v883: item mode
internal fun PlayerActivity.showV883ItemToggle() {
    val current = FeaturePrefsStore.batch881.v883item
    FeaturePrefsStore.batch881.v883item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v883: iterate mode
internal fun PlayerActivity.showV883IterateToggle() {
    val current = FeaturePrefsStore.batch881.v883iterate
    FeaturePrefsStore.batch881.v883iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v884: info mode
internal fun PlayerActivity.showV884InfoToggle() {
    val current = FeaturePrefsStore.batch881.v884info
    FeaturePrefsStore.batch881.v884info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v884: init mode
internal fun PlayerActivity.showV884InitToggle() {
    val current = FeaturePrefsStore.batch881.v884init
    FeaturePrefsStore.batch881.v884init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v884: input mode
internal fun PlayerActivity.showV884InputToggle() {
    val current = FeaturePrefsStore.batch881.v884input
    FeaturePrefsStore.batch881.v884input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v884: insert mode
internal fun PlayerActivity.showV884InsertToggle() {
    val current = FeaturePrefsStore.batch881.v884insert
    FeaturePrefsStore.batch881.v884insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v884: install mode
internal fun PlayerActivity.showV884InstallToggle() {
    val current = FeaturePrefsStore.batch881.v884install
    FeaturePrefsStore.batch881.v884install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v884: instance level
internal fun PlayerActivity.showV884InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v884: intent level
internal fun PlayerActivity.showV884IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v884: interact level
internal fun PlayerActivity.showV884InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v884: interface level
internal fun PlayerActivity.showV884InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v884: internal level
internal fun PlayerActivity.showV884InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v884: interval mode
internal fun PlayerActivity.showV884IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v884interval
    FeaturePrefsStore.batch881.v884interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v884: invoke mode
internal fun PlayerActivity.showV884InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v884invoke
    FeaturePrefsStore.batch881.v884invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v884: io mode
internal fun PlayerActivity.showV884IoToggle() {
    val current = FeaturePrefsStore.batch881.v884io
    FeaturePrefsStore.batch881.v884io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v884: item mode
internal fun PlayerActivity.showV884ItemToggle() {
    val current = FeaturePrefsStore.batch881.v884item
    FeaturePrefsStore.batch881.v884item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v884: iterate mode
internal fun PlayerActivity.showV884IterateToggle() {
    val current = FeaturePrefsStore.batch881.v884iterate
    FeaturePrefsStore.batch881.v884iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v885: info mode
internal fun PlayerActivity.showV885InfoToggle() {
    val current = FeaturePrefsStore.batch881.v885info
    FeaturePrefsStore.batch881.v885info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v885: init mode
internal fun PlayerActivity.showV885InitToggle() {
    val current = FeaturePrefsStore.batch881.v885init
    FeaturePrefsStore.batch881.v885init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v885: input mode
internal fun PlayerActivity.showV885InputToggle() {
    val current = FeaturePrefsStore.batch881.v885input
    FeaturePrefsStore.batch881.v885input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v885: insert mode
internal fun PlayerActivity.showV885InsertToggle() {
    val current = FeaturePrefsStore.batch881.v885insert
    FeaturePrefsStore.batch881.v885insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v885: install mode
internal fun PlayerActivity.showV885InstallToggle() {
    val current = FeaturePrefsStore.batch881.v885install
    FeaturePrefsStore.batch881.v885install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v885: instance level
internal fun PlayerActivity.showV885InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v885: intent level
internal fun PlayerActivity.showV885IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v885: interact level
internal fun PlayerActivity.showV885InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v885: interface level
internal fun PlayerActivity.showV885InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v885: internal level
internal fun PlayerActivity.showV885InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v885: interval mode
internal fun PlayerActivity.showV885IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v885interval
    FeaturePrefsStore.batch881.v885interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v885: invoke mode
internal fun PlayerActivity.showV885InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v885invoke
    FeaturePrefsStore.batch881.v885invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v885: io mode
internal fun PlayerActivity.showV885IoToggle() {
    val current = FeaturePrefsStore.batch881.v885io
    FeaturePrefsStore.batch881.v885io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v885: item mode
internal fun PlayerActivity.showV885ItemToggle() {
    val current = FeaturePrefsStore.batch881.v885item
    FeaturePrefsStore.batch881.v885item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v885: iterate mode
internal fun PlayerActivity.showV885IterateToggle() {
    val current = FeaturePrefsStore.batch881.v885iterate
    FeaturePrefsStore.batch881.v885iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v886: info mode
internal fun PlayerActivity.showV886InfoToggle() {
    val current = FeaturePrefsStore.batch881.v886info
    FeaturePrefsStore.batch881.v886info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v886: init mode
internal fun PlayerActivity.showV886InitToggle() {
    val current = FeaturePrefsStore.batch881.v886init
    FeaturePrefsStore.batch881.v886init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v886: input mode
internal fun PlayerActivity.showV886InputToggle() {
    val current = FeaturePrefsStore.batch881.v886input
    FeaturePrefsStore.batch881.v886input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v886: insert mode
internal fun PlayerActivity.showV886InsertToggle() {
    val current = FeaturePrefsStore.batch881.v886insert
    FeaturePrefsStore.batch881.v886insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v886: install mode
internal fun PlayerActivity.showV886InstallToggle() {
    val current = FeaturePrefsStore.batch881.v886install
    FeaturePrefsStore.batch881.v886install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v886: instance level
internal fun PlayerActivity.showV886InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v886: intent level
internal fun PlayerActivity.showV886IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v886: interact level
internal fun PlayerActivity.showV886InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v886: interface level
internal fun PlayerActivity.showV886InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v886: internal level
internal fun PlayerActivity.showV886InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v886: interval mode
internal fun PlayerActivity.showV886IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v886interval
    FeaturePrefsStore.batch881.v886interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v886: invoke mode
internal fun PlayerActivity.showV886InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v886invoke
    FeaturePrefsStore.batch881.v886invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v886: io mode
internal fun PlayerActivity.showV886IoToggle() {
    val current = FeaturePrefsStore.batch881.v886io
    FeaturePrefsStore.batch881.v886io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v886: item mode
internal fun PlayerActivity.showV886ItemToggle() {
    val current = FeaturePrefsStore.batch881.v886item
    FeaturePrefsStore.batch881.v886item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v886: iterate mode
internal fun PlayerActivity.showV886IterateToggle() {
    val current = FeaturePrefsStore.batch881.v886iterate
    FeaturePrefsStore.batch881.v886iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v887: info mode
internal fun PlayerActivity.showV887InfoToggle() {
    val current = FeaturePrefsStore.batch881.v887info
    FeaturePrefsStore.batch881.v887info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v887: init mode
internal fun PlayerActivity.showV887InitToggle() {
    val current = FeaturePrefsStore.batch881.v887init
    FeaturePrefsStore.batch881.v887init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v887: input mode
internal fun PlayerActivity.showV887InputToggle() {
    val current = FeaturePrefsStore.batch881.v887input
    FeaturePrefsStore.batch881.v887input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v887: insert mode
internal fun PlayerActivity.showV887InsertToggle() {
    val current = FeaturePrefsStore.batch881.v887insert
    FeaturePrefsStore.batch881.v887insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v887: install mode
internal fun PlayerActivity.showV887InstallToggle() {
    val current = FeaturePrefsStore.batch881.v887install
    FeaturePrefsStore.batch881.v887install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v887: instance level
internal fun PlayerActivity.showV887InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v887: intent level
internal fun PlayerActivity.showV887IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v887: interact level
internal fun PlayerActivity.showV887InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v887: interface level
internal fun PlayerActivity.showV887InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v887: internal level
internal fun PlayerActivity.showV887InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v887: interval mode
internal fun PlayerActivity.showV887IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v887interval
    FeaturePrefsStore.batch881.v887interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v887: invoke mode
internal fun PlayerActivity.showV887InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v887invoke
    FeaturePrefsStore.batch881.v887invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v887: io mode
internal fun PlayerActivity.showV887IoToggle() {
    val current = FeaturePrefsStore.batch881.v887io
    FeaturePrefsStore.batch881.v887io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v887: item mode
internal fun PlayerActivity.showV887ItemToggle() {
    val current = FeaturePrefsStore.batch881.v887item
    FeaturePrefsStore.batch881.v887item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v887: iterate mode
internal fun PlayerActivity.showV887IterateToggle() {
    val current = FeaturePrefsStore.batch881.v887iterate
    FeaturePrefsStore.batch881.v887iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v888: info mode
internal fun PlayerActivity.showV888InfoToggle() {
    val current = FeaturePrefsStore.batch881.v888info
    FeaturePrefsStore.batch881.v888info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v888: init mode
internal fun PlayerActivity.showV888InitToggle() {
    val current = FeaturePrefsStore.batch881.v888init
    FeaturePrefsStore.batch881.v888init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v888: input mode
internal fun PlayerActivity.showV888InputToggle() {
    val current = FeaturePrefsStore.batch881.v888input
    FeaturePrefsStore.batch881.v888input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v888: insert mode
internal fun PlayerActivity.showV888InsertToggle() {
    val current = FeaturePrefsStore.batch881.v888insert
    FeaturePrefsStore.batch881.v888insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v888: install mode
internal fun PlayerActivity.showV888InstallToggle() {
    val current = FeaturePrefsStore.batch881.v888install
    FeaturePrefsStore.batch881.v888install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v888: instance level
internal fun PlayerActivity.showV888InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v888: intent level
internal fun PlayerActivity.showV888IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v888: interact level
internal fun PlayerActivity.showV888InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v888: interface level
internal fun PlayerActivity.showV888InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v888: internal level
internal fun PlayerActivity.showV888InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v888: interval mode
internal fun PlayerActivity.showV888IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v888interval
    FeaturePrefsStore.batch881.v888interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v888: invoke mode
internal fun PlayerActivity.showV888InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v888invoke
    FeaturePrefsStore.batch881.v888invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v888: io mode
internal fun PlayerActivity.showV888IoToggle() {
    val current = FeaturePrefsStore.batch881.v888io
    FeaturePrefsStore.batch881.v888io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v888: item mode
internal fun PlayerActivity.showV888ItemToggle() {
    val current = FeaturePrefsStore.batch881.v888item
    FeaturePrefsStore.batch881.v888item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v888: iterate mode
internal fun PlayerActivity.showV888IterateToggle() {
    val current = FeaturePrefsStore.batch881.v888iterate
    FeaturePrefsStore.batch881.v888iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v889: info mode
internal fun PlayerActivity.showV889InfoToggle() {
    val current = FeaturePrefsStore.batch881.v889info
    FeaturePrefsStore.batch881.v889info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v889: init mode
internal fun PlayerActivity.showV889InitToggle() {
    val current = FeaturePrefsStore.batch881.v889init
    FeaturePrefsStore.batch881.v889init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v889: input mode
internal fun PlayerActivity.showV889InputToggle() {
    val current = FeaturePrefsStore.batch881.v889input
    FeaturePrefsStore.batch881.v889input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v889: insert mode
internal fun PlayerActivity.showV889InsertToggle() {
    val current = FeaturePrefsStore.batch881.v889insert
    FeaturePrefsStore.batch881.v889insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v889: install mode
internal fun PlayerActivity.showV889InstallToggle() {
    val current = FeaturePrefsStore.batch881.v889install
    FeaturePrefsStore.batch881.v889install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v889: instance level
internal fun PlayerActivity.showV889InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v889: intent level
internal fun PlayerActivity.showV889IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v889: interact level
internal fun PlayerActivity.showV889InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v889: interface level
internal fun PlayerActivity.showV889InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v889: internal level
internal fun PlayerActivity.showV889InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v889: interval mode
internal fun PlayerActivity.showV889IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v889interval
    FeaturePrefsStore.batch881.v889interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v889: invoke mode
internal fun PlayerActivity.showV889InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v889invoke
    FeaturePrefsStore.batch881.v889invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v889: io mode
internal fun PlayerActivity.showV889IoToggle() {
    val current = FeaturePrefsStore.batch881.v889io
    FeaturePrefsStore.batch881.v889io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v889: item mode
internal fun PlayerActivity.showV889ItemToggle() {
    val current = FeaturePrefsStore.batch881.v889item
    FeaturePrefsStore.batch881.v889item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v889: iterate mode
internal fun PlayerActivity.showV889IterateToggle() {
    val current = FeaturePrefsStore.batch881.v889iterate
    FeaturePrefsStore.batch881.v889iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v890: info mode
internal fun PlayerActivity.showV890InfoToggle() {
    val current = FeaturePrefsStore.batch881.v890info
    FeaturePrefsStore.batch881.v890info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v890: init mode
internal fun PlayerActivity.showV890InitToggle() {
    val current = FeaturePrefsStore.batch881.v890init
    FeaturePrefsStore.batch881.v890init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v890: input mode
internal fun PlayerActivity.showV890InputToggle() {
    val current = FeaturePrefsStore.batch881.v890input
    FeaturePrefsStore.batch881.v890input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v890: insert mode
internal fun PlayerActivity.showV890InsertToggle() {
    val current = FeaturePrefsStore.batch881.v890insert
    FeaturePrefsStore.batch881.v890insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v890: install mode
internal fun PlayerActivity.showV890InstallToggle() {
    val current = FeaturePrefsStore.batch881.v890install
    FeaturePrefsStore.batch881.v890install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v890: instance level
internal fun PlayerActivity.showV890InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v890: intent level
internal fun PlayerActivity.showV890IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v890: interact level
internal fun PlayerActivity.showV890InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v890: interface level
internal fun PlayerActivity.showV890InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v890: internal level
internal fun PlayerActivity.showV890InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v890: interval mode
internal fun PlayerActivity.showV890IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v890interval
    FeaturePrefsStore.batch881.v890interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v890: invoke mode
internal fun PlayerActivity.showV890InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v890invoke
    FeaturePrefsStore.batch881.v890invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v890: io mode
internal fun PlayerActivity.showV890IoToggle() {
    val current = FeaturePrefsStore.batch881.v890io
    FeaturePrefsStore.batch881.v890io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v890: item mode
internal fun PlayerActivity.showV890ItemToggle() {
    val current = FeaturePrefsStore.batch881.v890item
    FeaturePrefsStore.batch881.v890item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v890: iterate mode
internal fun PlayerActivity.showV890IterateToggle() {
    val current = FeaturePrefsStore.batch881.v890iterate
    FeaturePrefsStore.batch881.v890iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}
