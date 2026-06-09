package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v991: precision mode
internal fun PlayerActivity.showV991PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v991precision
    FeaturePrefsStore.batch991.v991precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v991: predict mode
internal fun PlayerActivity.showV991PredictToggle() {
    val current = FeaturePrefsStore.batch991.v991predict
    FeaturePrefsStore.batch991.v991predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v991: prefix mode
internal fun PlayerActivity.showV991PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v991prefix
    FeaturePrefsStore.batch991.v991prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v991: preload mode
internal fun PlayerActivity.showV991PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v991preload
    FeaturePrefsStore.batch991.v991preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v991: prepare mode
internal fun PlayerActivity.showV991PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v991prepare
    FeaturePrefsStore.batch991.v991prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v991: present level
internal fun PlayerActivity.showV991PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v991present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v991present = value
        AppToast.show(this, "present: $value")
    }
}

// v991: preserve level
internal fun PlayerActivity.showV991PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v991preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v991preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v991: press level
internal fun PlayerActivity.showV991PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v991press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v991press = value
        AppToast.show(this, "press: $value")
    }
}

// v991: prev level
internal fun PlayerActivity.showV991PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v991prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v991prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v991: prevent level
internal fun PlayerActivity.showV991PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v991prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v991prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v991: preview mode
internal fun PlayerActivity.showV991PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v991preview
    FeaturePrefsStore.batch991.v991preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v991: primary mode
internal fun PlayerActivity.showV991PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v991primary
    FeaturePrefsStore.batch991.v991primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v991: print mode
internal fun PlayerActivity.showV991PrintToggle() {
    val current = FeaturePrefsStore.batch991.v991print
    FeaturePrefsStore.batch991.v991print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v991: priority mode
internal fun PlayerActivity.showV991PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v991priority
    FeaturePrefsStore.batch991.v991priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v991: process mode
internal fun PlayerActivity.showV991ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v991process
    FeaturePrefsStore.batch991.v991process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v992: precision mode
internal fun PlayerActivity.showV992PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v992precision
    FeaturePrefsStore.batch991.v992precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v992: predict mode
internal fun PlayerActivity.showV992PredictToggle() {
    val current = FeaturePrefsStore.batch991.v992predict
    FeaturePrefsStore.batch991.v992predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v992: prefix mode
internal fun PlayerActivity.showV992PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v992prefix
    FeaturePrefsStore.batch991.v992prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v992: preload mode
internal fun PlayerActivity.showV992PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v992preload
    FeaturePrefsStore.batch991.v992preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v992: prepare mode
internal fun PlayerActivity.showV992PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v992prepare
    FeaturePrefsStore.batch991.v992prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v992: present level
internal fun PlayerActivity.showV992PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v992present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v992present = value
        AppToast.show(this, "present: $value")
    }
}

// v992: preserve level
internal fun PlayerActivity.showV992PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v992preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v992preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v992: press level
internal fun PlayerActivity.showV992PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v992press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v992press = value
        AppToast.show(this, "press: $value")
    }
}

// v992: prev level
internal fun PlayerActivity.showV992PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v992prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v992prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v992: prevent level
internal fun PlayerActivity.showV992PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v992prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v992prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v992: preview mode
internal fun PlayerActivity.showV992PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v992preview
    FeaturePrefsStore.batch991.v992preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v992: primary mode
internal fun PlayerActivity.showV992PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v992primary
    FeaturePrefsStore.batch991.v992primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v992: print mode
internal fun PlayerActivity.showV992PrintToggle() {
    val current = FeaturePrefsStore.batch991.v992print
    FeaturePrefsStore.batch991.v992print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v992: priority mode
internal fun PlayerActivity.showV992PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v992priority
    FeaturePrefsStore.batch991.v992priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v992: process mode
internal fun PlayerActivity.showV992ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v992process
    FeaturePrefsStore.batch991.v992process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v993: precision mode
internal fun PlayerActivity.showV993PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v993precision
    FeaturePrefsStore.batch991.v993precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v993: predict mode
internal fun PlayerActivity.showV993PredictToggle() {
    val current = FeaturePrefsStore.batch991.v993predict
    FeaturePrefsStore.batch991.v993predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v993: prefix mode
internal fun PlayerActivity.showV993PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v993prefix
    FeaturePrefsStore.batch991.v993prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v993: preload mode
internal fun PlayerActivity.showV993PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v993preload
    FeaturePrefsStore.batch991.v993preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v993: prepare mode
internal fun PlayerActivity.showV993PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v993prepare
    FeaturePrefsStore.batch991.v993prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v993: present level
internal fun PlayerActivity.showV993PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v993present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v993present = value
        AppToast.show(this, "present: $value")
    }
}

// v993: preserve level
internal fun PlayerActivity.showV993PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v993preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v993preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v993: press level
internal fun PlayerActivity.showV993PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v993press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v993press = value
        AppToast.show(this, "press: $value")
    }
}

// v993: prev level
internal fun PlayerActivity.showV993PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v993prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v993prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v993: prevent level
internal fun PlayerActivity.showV993PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v993prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v993prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v993: preview mode
internal fun PlayerActivity.showV993PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v993preview
    FeaturePrefsStore.batch991.v993preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v993: primary mode
internal fun PlayerActivity.showV993PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v993primary
    FeaturePrefsStore.batch991.v993primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v993: print mode
internal fun PlayerActivity.showV993PrintToggle() {
    val current = FeaturePrefsStore.batch991.v993print
    FeaturePrefsStore.batch991.v993print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v993: priority mode
internal fun PlayerActivity.showV993PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v993priority
    FeaturePrefsStore.batch991.v993priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v993: process mode
internal fun PlayerActivity.showV993ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v993process
    FeaturePrefsStore.batch991.v993process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v994: precision mode
internal fun PlayerActivity.showV994PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v994precision
    FeaturePrefsStore.batch991.v994precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v994: predict mode
internal fun PlayerActivity.showV994PredictToggle() {
    val current = FeaturePrefsStore.batch991.v994predict
    FeaturePrefsStore.batch991.v994predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v994: prefix mode
internal fun PlayerActivity.showV994PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v994prefix
    FeaturePrefsStore.batch991.v994prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v994: preload mode
internal fun PlayerActivity.showV994PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v994preload
    FeaturePrefsStore.batch991.v994preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v994: prepare mode
internal fun PlayerActivity.showV994PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v994prepare
    FeaturePrefsStore.batch991.v994prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v994: present level
internal fun PlayerActivity.showV994PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v994present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v994present = value
        AppToast.show(this, "present: $value")
    }
}

// v994: preserve level
internal fun PlayerActivity.showV994PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v994preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v994preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v994: press level
internal fun PlayerActivity.showV994PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v994press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v994press = value
        AppToast.show(this, "press: $value")
    }
}

// v994: prev level
internal fun PlayerActivity.showV994PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v994prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v994prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v994: prevent level
internal fun PlayerActivity.showV994PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v994prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v994prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v994: preview mode
internal fun PlayerActivity.showV994PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v994preview
    FeaturePrefsStore.batch991.v994preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v994: primary mode
internal fun PlayerActivity.showV994PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v994primary
    FeaturePrefsStore.batch991.v994primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v994: print mode
internal fun PlayerActivity.showV994PrintToggle() {
    val current = FeaturePrefsStore.batch991.v994print
    FeaturePrefsStore.batch991.v994print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v994: priority mode
internal fun PlayerActivity.showV994PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v994priority
    FeaturePrefsStore.batch991.v994priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v994: process mode
internal fun PlayerActivity.showV994ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v994process
    FeaturePrefsStore.batch991.v994process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v995: precision mode
internal fun PlayerActivity.showV995PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v995precision
    FeaturePrefsStore.batch991.v995precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v995: predict mode
internal fun PlayerActivity.showV995PredictToggle() {
    val current = FeaturePrefsStore.batch991.v995predict
    FeaturePrefsStore.batch991.v995predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v995: prefix mode
internal fun PlayerActivity.showV995PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v995prefix
    FeaturePrefsStore.batch991.v995prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v995: preload mode
internal fun PlayerActivity.showV995PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v995preload
    FeaturePrefsStore.batch991.v995preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v995: prepare mode
internal fun PlayerActivity.showV995PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v995prepare
    FeaturePrefsStore.batch991.v995prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v995: present level
internal fun PlayerActivity.showV995PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v995present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v995present = value
        AppToast.show(this, "present: $value")
    }
}

// v995: preserve level
internal fun PlayerActivity.showV995PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v995preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v995preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v995: press level
internal fun PlayerActivity.showV995PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v995press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v995press = value
        AppToast.show(this, "press: $value")
    }
}

// v995: prev level
internal fun PlayerActivity.showV995PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v995prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v995prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v995: prevent level
internal fun PlayerActivity.showV995PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v995prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v995prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v995: preview mode
internal fun PlayerActivity.showV995PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v995preview
    FeaturePrefsStore.batch991.v995preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v995: primary mode
internal fun PlayerActivity.showV995PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v995primary
    FeaturePrefsStore.batch991.v995primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v995: print mode
internal fun PlayerActivity.showV995PrintToggle() {
    val current = FeaturePrefsStore.batch991.v995print
    FeaturePrefsStore.batch991.v995print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v995: priority mode
internal fun PlayerActivity.showV995PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v995priority
    FeaturePrefsStore.batch991.v995priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v995: process mode
internal fun PlayerActivity.showV995ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v995process
    FeaturePrefsStore.batch991.v995process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v996: precision mode
internal fun PlayerActivity.showV996PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v996precision
    FeaturePrefsStore.batch991.v996precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v996: predict mode
internal fun PlayerActivity.showV996PredictToggle() {
    val current = FeaturePrefsStore.batch991.v996predict
    FeaturePrefsStore.batch991.v996predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v996: prefix mode
internal fun PlayerActivity.showV996PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v996prefix
    FeaturePrefsStore.batch991.v996prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v996: preload mode
internal fun PlayerActivity.showV996PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v996preload
    FeaturePrefsStore.batch991.v996preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v996: prepare mode
internal fun PlayerActivity.showV996PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v996prepare
    FeaturePrefsStore.batch991.v996prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v996: present level
internal fun PlayerActivity.showV996PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v996present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v996present = value
        AppToast.show(this, "present: $value")
    }
}

// v996: preserve level
internal fun PlayerActivity.showV996PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v996preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v996preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v996: press level
internal fun PlayerActivity.showV996PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v996press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v996press = value
        AppToast.show(this, "press: $value")
    }
}

// v996: prev level
internal fun PlayerActivity.showV996PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v996prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v996prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v996: prevent level
internal fun PlayerActivity.showV996PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v996prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v996prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v996: preview mode
internal fun PlayerActivity.showV996PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v996preview
    FeaturePrefsStore.batch991.v996preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v996: primary mode
internal fun PlayerActivity.showV996PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v996primary
    FeaturePrefsStore.batch991.v996primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v996: print mode
internal fun PlayerActivity.showV996PrintToggle() {
    val current = FeaturePrefsStore.batch991.v996print
    FeaturePrefsStore.batch991.v996print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v996: priority mode
internal fun PlayerActivity.showV996PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v996priority
    FeaturePrefsStore.batch991.v996priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v996: process mode
internal fun PlayerActivity.showV996ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v996process
    FeaturePrefsStore.batch991.v996process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v997: precision mode
internal fun PlayerActivity.showV997PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v997precision
    FeaturePrefsStore.batch991.v997precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v997: predict mode
internal fun PlayerActivity.showV997PredictToggle() {
    val current = FeaturePrefsStore.batch991.v997predict
    FeaturePrefsStore.batch991.v997predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v997: prefix mode
internal fun PlayerActivity.showV997PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v997prefix
    FeaturePrefsStore.batch991.v997prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v997: preload mode
internal fun PlayerActivity.showV997PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v997preload
    FeaturePrefsStore.batch991.v997preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v997: prepare mode
internal fun PlayerActivity.showV997PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v997prepare
    FeaturePrefsStore.batch991.v997prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v997: present level
internal fun PlayerActivity.showV997PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v997present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v997present = value
        AppToast.show(this, "present: $value")
    }
}

// v997: preserve level
internal fun PlayerActivity.showV997PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v997preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v997preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v997: press level
internal fun PlayerActivity.showV997PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v997press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v997press = value
        AppToast.show(this, "press: $value")
    }
}

// v997: prev level
internal fun PlayerActivity.showV997PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v997prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v997prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v997: prevent level
internal fun PlayerActivity.showV997PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v997prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v997prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v997: preview mode
internal fun PlayerActivity.showV997PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v997preview
    FeaturePrefsStore.batch991.v997preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v997: primary mode
internal fun PlayerActivity.showV997PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v997primary
    FeaturePrefsStore.batch991.v997primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v997: print mode
internal fun PlayerActivity.showV997PrintToggle() {
    val current = FeaturePrefsStore.batch991.v997print
    FeaturePrefsStore.batch991.v997print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v997: priority mode
internal fun PlayerActivity.showV997PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v997priority
    FeaturePrefsStore.batch991.v997priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v997: process mode
internal fun PlayerActivity.showV997ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v997process
    FeaturePrefsStore.batch991.v997process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v998: precision mode
internal fun PlayerActivity.showV998PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v998precision
    FeaturePrefsStore.batch991.v998precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v998: predict mode
internal fun PlayerActivity.showV998PredictToggle() {
    val current = FeaturePrefsStore.batch991.v998predict
    FeaturePrefsStore.batch991.v998predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v998: prefix mode
internal fun PlayerActivity.showV998PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v998prefix
    FeaturePrefsStore.batch991.v998prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v998: preload mode
internal fun PlayerActivity.showV998PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v998preload
    FeaturePrefsStore.batch991.v998preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v998: prepare mode
internal fun PlayerActivity.showV998PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v998prepare
    FeaturePrefsStore.batch991.v998prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v998: present level
internal fun PlayerActivity.showV998PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v998present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v998present = value
        AppToast.show(this, "present: $value")
    }
}

// v998: preserve level
internal fun PlayerActivity.showV998PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v998preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v998preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v998: press level
internal fun PlayerActivity.showV998PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v998press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v998press = value
        AppToast.show(this, "press: $value")
    }
}

// v998: prev level
internal fun PlayerActivity.showV998PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v998prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v998prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v998: prevent level
internal fun PlayerActivity.showV998PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v998prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v998prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v998: preview mode
internal fun PlayerActivity.showV998PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v998preview
    FeaturePrefsStore.batch991.v998preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v998: primary mode
internal fun PlayerActivity.showV998PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v998primary
    FeaturePrefsStore.batch991.v998primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v998: print mode
internal fun PlayerActivity.showV998PrintToggle() {
    val current = FeaturePrefsStore.batch991.v998print
    FeaturePrefsStore.batch991.v998print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v998: priority mode
internal fun PlayerActivity.showV998PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v998priority
    FeaturePrefsStore.batch991.v998priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v998: process mode
internal fun PlayerActivity.showV998ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v998process
    FeaturePrefsStore.batch991.v998process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v999: precision mode
internal fun PlayerActivity.showV999PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v999precision
    FeaturePrefsStore.batch991.v999precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v999: predict mode
internal fun PlayerActivity.showV999PredictToggle() {
    val current = FeaturePrefsStore.batch991.v999predict
    FeaturePrefsStore.batch991.v999predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v999: prefix mode
internal fun PlayerActivity.showV999PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v999prefix
    FeaturePrefsStore.batch991.v999prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v999: preload mode
internal fun PlayerActivity.showV999PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v999preload
    FeaturePrefsStore.batch991.v999preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v999: prepare mode
internal fun PlayerActivity.showV999PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v999prepare
    FeaturePrefsStore.batch991.v999prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v999: present level
internal fun PlayerActivity.showV999PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v999present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v999present = value
        AppToast.show(this, "present: $value")
    }
}

// v999: preserve level
internal fun PlayerActivity.showV999PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v999preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v999preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v999: press level
internal fun PlayerActivity.showV999PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v999press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v999press = value
        AppToast.show(this, "press: $value")
    }
}

// v999: prev level
internal fun PlayerActivity.showV999PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v999prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v999prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v999: prevent level
internal fun PlayerActivity.showV999PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v999prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v999prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v999: preview mode
internal fun PlayerActivity.showV999PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v999preview
    FeaturePrefsStore.batch991.v999preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v999: primary mode
internal fun PlayerActivity.showV999PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v999primary
    FeaturePrefsStore.batch991.v999primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v999: print mode
internal fun PlayerActivity.showV999PrintToggle() {
    val current = FeaturePrefsStore.batch991.v999print
    FeaturePrefsStore.batch991.v999print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v999: priority mode
internal fun PlayerActivity.showV999PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v999priority
    FeaturePrefsStore.batch991.v999priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v999: process mode
internal fun PlayerActivity.showV999ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v999process
    FeaturePrefsStore.batch991.v999process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

// v1000: precision mode
internal fun PlayerActivity.showV1000PrecisionToggle() {
    val current = FeaturePrefsStore.batch991.v1000precision
    FeaturePrefsStore.batch991.v1000precision = !current
    AppToast.show(this, "precision: ${if (!current) "ON" else "OFF"}")
}

// v1000: predict mode
internal fun PlayerActivity.showV1000PredictToggle() {
    val current = FeaturePrefsStore.batch991.v1000predict
    FeaturePrefsStore.batch991.v1000predict = !current
    AppToast.show(this, "predict: ${if (!current) "ON" else "OFF"}")
}

// v1000: prefix mode
internal fun PlayerActivity.showV1000PrefixToggle() {
    val current = FeaturePrefsStore.batch991.v1000prefix
    FeaturePrefsStore.batch991.v1000prefix = !current
    AppToast.show(this, "prefix: ${if (!current) "ON" else "OFF"}")
}

// v1000: preload mode
internal fun PlayerActivity.showV1000PreloadToggle() {
    val current = FeaturePrefsStore.batch991.v1000preload
    FeaturePrefsStore.batch991.v1000preload = !current
    AppToast.show(this, "preload: ${if (!current) "ON" else "OFF"}")
}

// v1000: prepare mode
internal fun PlayerActivity.showV1000PrepareToggle() {
    val current = FeaturePrefsStore.batch991.v1000prepare
    FeaturePrefsStore.batch991.v1000prepare = !current
    AppToast.show(this, "prepare: ${if (!current) "ON" else "OFF"}")
}

// v1000: present level
internal fun PlayerActivity.showV1000PresentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v1000present).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "present level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v1000present = value
        AppToast.show(this, "present: $value")
    }
}

// v1000: preserve level
internal fun PlayerActivity.showV1000PreserveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v1000preserve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "preserve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v1000preserve = value
        AppToast.show(this, "preserve: $value")
    }
}

// v1000: press level
internal fun PlayerActivity.showV1000PressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v1000press).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "press level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v1000press = value
        AppToast.show(this, "press: $value")
    }
}

// v1000: prev level
internal fun PlayerActivity.showV1000PrevDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v1000prev).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prev level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v1000prev = value
        AppToast.show(this, "prev: $value")
    }
}

// v1000: prevent level
internal fun PlayerActivity.showV1000PreventDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch991.v1000prevent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prevent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch991.v1000prevent = value
        AppToast.show(this, "prevent: $value")
    }
}

// v1000: preview mode
internal fun PlayerActivity.showV1000PreviewToggle() {
    val current = FeaturePrefsStore.batch991.v1000preview
    FeaturePrefsStore.batch991.v1000preview = !current
    AppToast.show(this, "preview: ${if (!current) "ON" else "OFF"}")
}

// v1000: primary mode
internal fun PlayerActivity.showV1000PrimaryToggle() {
    val current = FeaturePrefsStore.batch991.v1000primary
    FeaturePrefsStore.batch991.v1000primary = !current
    AppToast.show(this, "primary: ${if (!current) "ON" else "OFF"}")
}

// v1000: print mode
internal fun PlayerActivity.showV1000PrintToggle() {
    val current = FeaturePrefsStore.batch991.v1000print
    FeaturePrefsStore.batch991.v1000print = !current
    AppToast.show(this, "print: ${if (!current) "ON" else "OFF"}")
}

// v1000: priority mode
internal fun PlayerActivity.showV1000PriorityToggle() {
    val current = FeaturePrefsStore.batch991.v1000priority
    FeaturePrefsStore.batch991.v1000priority = !current
    AppToast.show(this, "priority: ${if (!current) "ON" else "OFF"}")
}

// v1000: process mode
internal fun PlayerActivity.showV1000ProcessToggle() {
    val current = FeaturePrefsStore.batch991.v1000process
    FeaturePrefsStore.batch991.v1000process = !current
    AppToast.show(this, "process: ${if (!current) "ON" else "OFF"}")
}

