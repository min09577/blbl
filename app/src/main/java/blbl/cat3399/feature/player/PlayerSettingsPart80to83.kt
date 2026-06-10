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

// v1001: produce mode
internal fun PlayerActivity.showV1001ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1001produce
    FeaturePrefsStore.batch1001.v1001produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1001: profile mode
internal fun PlayerActivity.showV1001ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1001profile
    FeaturePrefsStore.batch1001.v1001profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1001: program mode
internal fun PlayerActivity.showV1001ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1001program
    FeaturePrefsStore.batch1001.v1001program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1001: project mode
internal fun PlayerActivity.showV1001ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1001project
    FeaturePrefsStore.batch1001.v1001project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1001: promise mode
internal fun PlayerActivity.showV1001PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1001promise
    FeaturePrefsStore.batch1001.v1001promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1001: prompt level
internal fun PlayerActivity.showV1001PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1001: prop level
internal fun PlayerActivity.showV1001PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1001: property level
internal fun PlayerActivity.showV1001PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001property = value
        AppToast.show(this, "property: $value")
    }
}

// v1001: protect level
internal fun PlayerActivity.showV1001ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1001: protocol level
internal fun PlayerActivity.showV1001ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1001: provide mode
internal fun PlayerActivity.showV1001ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1001provide
    FeaturePrefsStore.batch1001.v1001provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1001: proxy mode
internal fun PlayerActivity.showV1001ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1001proxy
    FeaturePrefsStore.batch1001.v1001proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1001: pull mode
internal fun PlayerActivity.showV1001PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1001pull
    FeaturePrefsStore.batch1001.v1001pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1001: pure mode
internal fun PlayerActivity.showV1001PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1001pure
    FeaturePrefsStore.batch1001.v1001pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1001: push mode
internal fun PlayerActivity.showV1001PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1001push
    FeaturePrefsStore.batch1001.v1001push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1002: produce mode
internal fun PlayerActivity.showV1002ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1002produce
    FeaturePrefsStore.batch1001.v1002produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1002: profile mode
internal fun PlayerActivity.showV1002ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1002profile
    FeaturePrefsStore.batch1001.v1002profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1002: program mode
internal fun PlayerActivity.showV1002ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1002program
    FeaturePrefsStore.batch1001.v1002program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1002: project mode
internal fun PlayerActivity.showV1002ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1002project
    FeaturePrefsStore.batch1001.v1002project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1002: promise mode
internal fun PlayerActivity.showV1002PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1002promise
    FeaturePrefsStore.batch1001.v1002promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1002: prompt level
internal fun PlayerActivity.showV1002PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1002: prop level
internal fun PlayerActivity.showV1002PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1002: property level
internal fun PlayerActivity.showV1002PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002property = value
        AppToast.show(this, "property: $value")
    }
}

// v1002: protect level
internal fun PlayerActivity.showV1002ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1002: protocol level
internal fun PlayerActivity.showV1002ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1002: provide mode
internal fun PlayerActivity.showV1002ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1002provide
    FeaturePrefsStore.batch1001.v1002provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1002: proxy mode
internal fun PlayerActivity.showV1002ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1002proxy
    FeaturePrefsStore.batch1001.v1002proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1002: pull mode
internal fun PlayerActivity.showV1002PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1002pull
    FeaturePrefsStore.batch1001.v1002pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1002: pure mode
internal fun PlayerActivity.showV1002PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1002pure
    FeaturePrefsStore.batch1001.v1002pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1002: push mode
internal fun PlayerActivity.showV1002PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1002push
    FeaturePrefsStore.batch1001.v1002push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1003: produce mode
internal fun PlayerActivity.showV1003ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1003produce
    FeaturePrefsStore.batch1001.v1003produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1003: profile mode
internal fun PlayerActivity.showV1003ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1003profile
    FeaturePrefsStore.batch1001.v1003profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1003: program mode
internal fun PlayerActivity.showV1003ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1003program
    FeaturePrefsStore.batch1001.v1003program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1003: project mode
internal fun PlayerActivity.showV1003ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1003project
    FeaturePrefsStore.batch1001.v1003project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1003: promise mode
internal fun PlayerActivity.showV1003PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1003promise
    FeaturePrefsStore.batch1001.v1003promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1003: prompt level
internal fun PlayerActivity.showV1003PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1003: prop level
internal fun PlayerActivity.showV1003PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1003: property level
internal fun PlayerActivity.showV1003PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003property = value
        AppToast.show(this, "property: $value")
    }
}

// v1003: protect level
internal fun PlayerActivity.showV1003ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1003: protocol level
internal fun PlayerActivity.showV1003ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1003: provide mode
internal fun PlayerActivity.showV1003ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1003provide
    FeaturePrefsStore.batch1001.v1003provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1003: proxy mode
internal fun PlayerActivity.showV1003ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1003proxy
    FeaturePrefsStore.batch1001.v1003proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1003: pull mode
internal fun PlayerActivity.showV1003PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1003pull
    FeaturePrefsStore.batch1001.v1003pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1003: pure mode
internal fun PlayerActivity.showV1003PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1003pure
    FeaturePrefsStore.batch1001.v1003pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1003: push mode
internal fun PlayerActivity.showV1003PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1003push
    FeaturePrefsStore.batch1001.v1003push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1004: produce mode
internal fun PlayerActivity.showV1004ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1004produce
    FeaturePrefsStore.batch1001.v1004produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1004: profile mode
internal fun PlayerActivity.showV1004ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1004profile
    FeaturePrefsStore.batch1001.v1004profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1004: program mode
internal fun PlayerActivity.showV1004ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1004program
    FeaturePrefsStore.batch1001.v1004program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1004: project mode
internal fun PlayerActivity.showV1004ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1004project
    FeaturePrefsStore.batch1001.v1004project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1004: promise mode
internal fun PlayerActivity.showV1004PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1004promise
    FeaturePrefsStore.batch1001.v1004promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1004: prompt level
internal fun PlayerActivity.showV1004PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1004: prop level
internal fun PlayerActivity.showV1004PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1004: property level
internal fun PlayerActivity.showV1004PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004property = value
        AppToast.show(this, "property: $value")
    }
}

// v1004: protect level
internal fun PlayerActivity.showV1004ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1004: protocol level
internal fun PlayerActivity.showV1004ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1004: provide mode
internal fun PlayerActivity.showV1004ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1004provide
    FeaturePrefsStore.batch1001.v1004provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1004: proxy mode
internal fun PlayerActivity.showV1004ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1004proxy
    FeaturePrefsStore.batch1001.v1004proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1004: pull mode
internal fun PlayerActivity.showV1004PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1004pull
    FeaturePrefsStore.batch1001.v1004pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1004: pure mode
internal fun PlayerActivity.showV1004PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1004pure
    FeaturePrefsStore.batch1001.v1004pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1004: push mode
internal fun PlayerActivity.showV1004PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1004push
    FeaturePrefsStore.batch1001.v1004push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1005: produce mode
internal fun PlayerActivity.showV1005ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1005produce
    FeaturePrefsStore.batch1001.v1005produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1005: profile mode
internal fun PlayerActivity.showV1005ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1005profile
    FeaturePrefsStore.batch1001.v1005profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1005: program mode
internal fun PlayerActivity.showV1005ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1005program
    FeaturePrefsStore.batch1001.v1005program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1005: project mode
internal fun PlayerActivity.showV1005ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1005project
    FeaturePrefsStore.batch1001.v1005project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1005: promise mode
internal fun PlayerActivity.showV1005PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1005promise
    FeaturePrefsStore.batch1001.v1005promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1005: prompt level
internal fun PlayerActivity.showV1005PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1005: prop level
internal fun PlayerActivity.showV1005PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1005: property level
internal fun PlayerActivity.showV1005PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005property = value
        AppToast.show(this, "property: $value")
    }
}

// v1005: protect level
internal fun PlayerActivity.showV1005ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1005: protocol level
internal fun PlayerActivity.showV1005ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1005: provide mode
internal fun PlayerActivity.showV1005ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1005provide
    FeaturePrefsStore.batch1001.v1005provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1005: proxy mode
internal fun PlayerActivity.showV1005ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1005proxy
    FeaturePrefsStore.batch1001.v1005proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1005: pull mode
internal fun PlayerActivity.showV1005PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1005pull
    FeaturePrefsStore.batch1001.v1005pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1005: pure mode
internal fun PlayerActivity.showV1005PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1005pure
    FeaturePrefsStore.batch1001.v1005pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1005: push mode
internal fun PlayerActivity.showV1005PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1005push
    FeaturePrefsStore.batch1001.v1005push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1006: produce mode
internal fun PlayerActivity.showV1006ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1006produce
    FeaturePrefsStore.batch1001.v1006produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1006: profile mode
internal fun PlayerActivity.showV1006ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1006profile
    FeaturePrefsStore.batch1001.v1006profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1006: program mode
internal fun PlayerActivity.showV1006ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1006program
    FeaturePrefsStore.batch1001.v1006program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1006: project mode
internal fun PlayerActivity.showV1006ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1006project
    FeaturePrefsStore.batch1001.v1006project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1006: promise mode
internal fun PlayerActivity.showV1006PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1006promise
    FeaturePrefsStore.batch1001.v1006promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1006: prompt level
internal fun PlayerActivity.showV1006PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1006: prop level
internal fun PlayerActivity.showV1006PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1006: property level
internal fun PlayerActivity.showV1006PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006property = value
        AppToast.show(this, "property: $value")
    }
}

// v1006: protect level
internal fun PlayerActivity.showV1006ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1006: protocol level
internal fun PlayerActivity.showV1006ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1006: provide mode
internal fun PlayerActivity.showV1006ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1006provide
    FeaturePrefsStore.batch1001.v1006provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1006: proxy mode
internal fun PlayerActivity.showV1006ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1006proxy
    FeaturePrefsStore.batch1001.v1006proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1006: pull mode
internal fun PlayerActivity.showV1006PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1006pull
    FeaturePrefsStore.batch1001.v1006pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1006: pure mode
internal fun PlayerActivity.showV1006PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1006pure
    FeaturePrefsStore.batch1001.v1006pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1006: push mode
internal fun PlayerActivity.showV1006PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1006push
    FeaturePrefsStore.batch1001.v1006push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1007: produce mode
internal fun PlayerActivity.showV1007ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1007produce
    FeaturePrefsStore.batch1001.v1007produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1007: profile mode
internal fun PlayerActivity.showV1007ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1007profile
    FeaturePrefsStore.batch1001.v1007profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1007: program mode
internal fun PlayerActivity.showV1007ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1007program
    FeaturePrefsStore.batch1001.v1007program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1007: project mode
internal fun PlayerActivity.showV1007ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1007project
    FeaturePrefsStore.batch1001.v1007project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1007: promise mode
internal fun PlayerActivity.showV1007PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1007promise
    FeaturePrefsStore.batch1001.v1007promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1007: prompt level
internal fun PlayerActivity.showV1007PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1007: prop level
internal fun PlayerActivity.showV1007PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1007: property level
internal fun PlayerActivity.showV1007PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007property = value
        AppToast.show(this, "property: $value")
    }
}

// v1007: protect level
internal fun PlayerActivity.showV1007ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1007: protocol level
internal fun PlayerActivity.showV1007ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1007: provide mode
internal fun PlayerActivity.showV1007ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1007provide
    FeaturePrefsStore.batch1001.v1007provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1007: proxy mode
internal fun PlayerActivity.showV1007ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1007proxy
    FeaturePrefsStore.batch1001.v1007proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1007: pull mode
internal fun PlayerActivity.showV1007PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1007pull
    FeaturePrefsStore.batch1001.v1007pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1007: pure mode
internal fun PlayerActivity.showV1007PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1007pure
    FeaturePrefsStore.batch1001.v1007pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1007: push mode
internal fun PlayerActivity.showV1007PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1007push
    FeaturePrefsStore.batch1001.v1007push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1008: produce mode
internal fun PlayerActivity.showV1008ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1008produce
    FeaturePrefsStore.batch1001.v1008produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1008: profile mode
internal fun PlayerActivity.showV1008ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1008profile
    FeaturePrefsStore.batch1001.v1008profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1008: program mode
internal fun PlayerActivity.showV1008ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1008program
    FeaturePrefsStore.batch1001.v1008program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1008: project mode
internal fun PlayerActivity.showV1008ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1008project
    FeaturePrefsStore.batch1001.v1008project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1008: promise mode
internal fun PlayerActivity.showV1008PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1008promise
    FeaturePrefsStore.batch1001.v1008promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1008: prompt level
internal fun PlayerActivity.showV1008PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1008: prop level
internal fun PlayerActivity.showV1008PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1008: property level
internal fun PlayerActivity.showV1008PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008property = value
        AppToast.show(this, "property: $value")
    }
}

// v1008: protect level
internal fun PlayerActivity.showV1008ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1008: protocol level
internal fun PlayerActivity.showV1008ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1008: provide mode
internal fun PlayerActivity.showV1008ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1008provide
    FeaturePrefsStore.batch1001.v1008provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1008: proxy mode
internal fun PlayerActivity.showV1008ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1008proxy
    FeaturePrefsStore.batch1001.v1008proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1008: pull mode
internal fun PlayerActivity.showV1008PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1008pull
    FeaturePrefsStore.batch1001.v1008pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1008: pure mode
internal fun PlayerActivity.showV1008PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1008pure
    FeaturePrefsStore.batch1001.v1008pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1008: push mode
internal fun PlayerActivity.showV1008PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1008push
    FeaturePrefsStore.batch1001.v1008push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1009: produce mode
internal fun PlayerActivity.showV1009ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1009produce
    FeaturePrefsStore.batch1001.v1009produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1009: profile mode
internal fun PlayerActivity.showV1009ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1009profile
    FeaturePrefsStore.batch1001.v1009profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1009: program mode
internal fun PlayerActivity.showV1009ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1009program
    FeaturePrefsStore.batch1001.v1009program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1009: project mode
internal fun PlayerActivity.showV1009ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1009project
    FeaturePrefsStore.batch1001.v1009project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1009: promise mode
internal fun PlayerActivity.showV1009PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1009promise
    FeaturePrefsStore.batch1001.v1009promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1009: prompt level
internal fun PlayerActivity.showV1009PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1009: prop level
internal fun PlayerActivity.showV1009PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1009: property level
internal fun PlayerActivity.showV1009PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009property = value
        AppToast.show(this, "property: $value")
    }
}

// v1009: protect level
internal fun PlayerActivity.showV1009ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1009: protocol level
internal fun PlayerActivity.showV1009ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1009: provide mode
internal fun PlayerActivity.showV1009ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1009provide
    FeaturePrefsStore.batch1001.v1009provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1009: proxy mode
internal fun PlayerActivity.showV1009ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1009proxy
    FeaturePrefsStore.batch1001.v1009proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1009: pull mode
internal fun PlayerActivity.showV1009PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1009pull
    FeaturePrefsStore.batch1001.v1009pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1009: pure mode
internal fun PlayerActivity.showV1009PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1009pure
    FeaturePrefsStore.batch1001.v1009pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1009: push mode
internal fun PlayerActivity.showV1009PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1009push
    FeaturePrefsStore.batch1001.v1009push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1010: produce mode
internal fun PlayerActivity.showV1010ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1010produce
    FeaturePrefsStore.batch1001.v1010produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1010: profile mode
internal fun PlayerActivity.showV1010ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1010profile
    FeaturePrefsStore.batch1001.v1010profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1010: program mode
internal fun PlayerActivity.showV1010ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1010program
    FeaturePrefsStore.batch1001.v1010program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1010: project mode
internal fun PlayerActivity.showV1010ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1010project
    FeaturePrefsStore.batch1001.v1010project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1010: promise mode
internal fun PlayerActivity.showV1010PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1010promise
    FeaturePrefsStore.batch1001.v1010promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1010: prompt level
internal fun PlayerActivity.showV1010PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1010: prop level
internal fun PlayerActivity.showV1010PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1010: property level
internal fun PlayerActivity.showV1010PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010property = value
        AppToast.show(this, "property: $value")
    }
}

// v1010: protect level
internal fun PlayerActivity.showV1010ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1010: protocol level
internal fun PlayerActivity.showV1010ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1010: provide mode
internal fun PlayerActivity.showV1010ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1010provide
    FeaturePrefsStore.batch1001.v1010provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1010: proxy mode
internal fun PlayerActivity.showV1010ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1010proxy
    FeaturePrefsStore.batch1001.v1010proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1010: pull mode
internal fun PlayerActivity.showV1010PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1010pull
    FeaturePrefsStore.batch1001.v1010pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1010: pure mode
internal fun PlayerActivity.showV1010PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1010pure
    FeaturePrefsStore.batch1001.v1010pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1010: push mode
internal fun PlayerActivity.showV1010PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1010push
    FeaturePrefsStore.batch1001.v1010push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v701: acknowledge mode
internal fun PlayerActivity.showV701AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v701acknowledge
    FeaturePrefsStore.batch701.v701acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v701: acquire mode
internal fun PlayerActivity.showV701AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v701acquire
    FeaturePrefsStore.batch701.v701acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v701: activate mode
internal fun PlayerActivity.showV701ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v701activate
    FeaturePrefsStore.batch701.v701activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adaptive mode
internal fun PlayerActivity.showV701AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v701adaptive
    FeaturePrefsStore.batch701.v701adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adjust mode
internal fun PlayerActivity.showV701AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v701adjust
    FeaturePrefsStore.batch701.v701adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v701: aggregate level
internal fun PlayerActivity.showV701AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v701: alert level
internal fun PlayerActivity.showV701AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v701: align level
internal fun PlayerActivity.showV701AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701align = value
        AppToast.show(this, "align level: $value")
    }
}

// v701: allocate level
internal fun PlayerActivity.showV701AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v701: amplify level
internal fun PlayerActivity.showV701AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v701: analyze setting
internal fun PlayerActivity.showV701AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v701analyze
    FeaturePrefsStore.batch701.v701analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v701: anchor setting
internal fun PlayerActivity.showV701AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v701anchor
    FeaturePrefsStore.batch701.v701anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v701: animate setting
internal fun PlayerActivity.showV701AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v701animate
    FeaturePrefsStore.batch701.v701animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v701: announce setting
internal fun PlayerActivity.showV701AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v701announce
    FeaturePrefsStore.batch701.v701announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v701: append setting
internal fun PlayerActivity.showV701AppendToggle() {
    val current = FeaturePrefsStore.batch701.v701append
    FeaturePrefsStore.batch701.v701append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v702: acknowledge mode
internal fun PlayerActivity.showV702AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v702acknowledge
    FeaturePrefsStore.batch701.v702acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v702: acquire mode
internal fun PlayerActivity.showV702AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v702acquire
    FeaturePrefsStore.batch701.v702acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v702: activate mode
internal fun PlayerActivity.showV702ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v702activate
    FeaturePrefsStore.batch701.v702activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adaptive mode
internal fun PlayerActivity.showV702AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v702adaptive
    FeaturePrefsStore.batch701.v702adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adjust mode
internal fun PlayerActivity.showV702AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v702adjust
    FeaturePrefsStore.batch701.v702adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v702: aggregate level
internal fun PlayerActivity.showV702AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v702: alert level
internal fun PlayerActivity.showV702AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v702: align level
internal fun PlayerActivity.showV702AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702align = value
        AppToast.show(this, "align level: $value")
    }
}

// v702: allocate level
internal fun PlayerActivity.showV702AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v702: amplify level
internal fun PlayerActivity.showV702AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v702: analyze setting
internal fun PlayerActivity.showV702AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v702analyze
    FeaturePrefsStore.batch701.v702analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v702: anchor setting
internal fun PlayerActivity.showV702AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v702anchor
    FeaturePrefsStore.batch701.v702anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v702: animate setting
internal fun PlayerActivity.showV702AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v702animate
    FeaturePrefsStore.batch701.v702animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v702: announce setting
internal fun PlayerActivity.showV702AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v702announce
    FeaturePrefsStore.batch701.v702announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v702: append setting
internal fun PlayerActivity.showV702AppendToggle() {
    val current = FeaturePrefsStore.batch701.v702append
    FeaturePrefsStore.batch701.v702append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v703: acknowledge mode
internal fun PlayerActivity.showV703AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v703acknowledge
    FeaturePrefsStore.batch701.v703acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v703: acquire mode
internal fun PlayerActivity.showV703AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v703acquire
    FeaturePrefsStore.batch701.v703acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v703: activate mode
internal fun PlayerActivity.showV703ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v703activate
    FeaturePrefsStore.batch701.v703activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adaptive mode
internal fun PlayerActivity.showV703AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v703adaptive
    FeaturePrefsStore.batch701.v703adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adjust mode
internal fun PlayerActivity.showV703AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v703adjust
    FeaturePrefsStore.batch701.v703adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v703: aggregate level
internal fun PlayerActivity.showV703AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v703: alert level
internal fun PlayerActivity.showV703AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v703: align level
internal fun PlayerActivity.showV703AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703align = value
        AppToast.show(this, "align level: $value")
    }
}

// v703: allocate level
internal fun PlayerActivity.showV703AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v703: amplify level
internal fun PlayerActivity.showV703AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v703: analyze setting
internal fun PlayerActivity.showV703AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v703analyze
    FeaturePrefsStore.batch701.v703analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v703: anchor setting
internal fun PlayerActivity.showV703AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v703anchor
    FeaturePrefsStore.batch701.v703anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v703: animate setting
internal fun PlayerActivity.showV703AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v703animate
    FeaturePrefsStore.batch701.v703animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v703: announce setting
internal fun PlayerActivity.showV703AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v703announce
    FeaturePrefsStore.batch701.v703announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v703: append setting
internal fun PlayerActivity.showV703AppendToggle() {
    val current = FeaturePrefsStore.batch701.v703append
    FeaturePrefsStore.batch701.v703append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v704: acknowledge mode
internal fun PlayerActivity.showV704AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v704acknowledge
    FeaturePrefsStore.batch701.v704acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v704: acquire mode
internal fun PlayerActivity.showV704AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v704acquire
    FeaturePrefsStore.batch701.v704acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v704: activate mode
internal fun PlayerActivity.showV704ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v704activate
    FeaturePrefsStore.batch701.v704activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adaptive mode
internal fun PlayerActivity.showV704AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v704adaptive
    FeaturePrefsStore.batch701.v704adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adjust mode
internal fun PlayerActivity.showV704AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v704adjust
    FeaturePrefsStore.batch701.v704adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v704: aggregate level
internal fun PlayerActivity.showV704AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v704: alert level
internal fun PlayerActivity.showV704AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v704: align level
internal fun PlayerActivity.showV704AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704align = value
        AppToast.show(this, "align level: $value")
    }
}

// v704: allocate level
internal fun PlayerActivity.showV704AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v704: amplify level
internal fun PlayerActivity.showV704AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v704: analyze setting
internal fun PlayerActivity.showV704AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v704analyze
    FeaturePrefsStore.batch701.v704analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v704: anchor setting
internal fun PlayerActivity.showV704AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v704anchor
    FeaturePrefsStore.batch701.v704anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v704: animate setting
internal fun PlayerActivity.showV704AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v704animate
    FeaturePrefsStore.batch701.v704animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v704: announce setting
internal fun PlayerActivity.showV704AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v704announce
    FeaturePrefsStore.batch701.v704announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v704: append setting
internal fun PlayerActivity.showV704AppendToggle() {
    val current = FeaturePrefsStore.batch701.v704append
    FeaturePrefsStore.batch701.v704append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v705: acknowledge mode
internal fun PlayerActivity.showV705AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v705acknowledge
    FeaturePrefsStore.batch701.v705acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v705: acquire mode
internal fun PlayerActivity.showV705AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v705acquire
    FeaturePrefsStore.batch701.v705acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v705: activate mode
internal fun PlayerActivity.showV705ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v705activate
    FeaturePrefsStore.batch701.v705activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adaptive mode
internal fun PlayerActivity.showV705AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v705adaptive
    FeaturePrefsStore.batch701.v705adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adjust mode
internal fun PlayerActivity.showV705AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v705adjust
    FeaturePrefsStore.batch701.v705adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v705: aggregate level
internal fun PlayerActivity.showV705AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v705: alert level
internal fun PlayerActivity.showV705AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v705: align level
internal fun PlayerActivity.showV705AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705align = value
        AppToast.show(this, "align level: $value")
    }
}

// v705: allocate level
internal fun PlayerActivity.showV705AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v705: amplify level
internal fun PlayerActivity.showV705AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v705: analyze setting
internal fun PlayerActivity.showV705AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v705analyze
    FeaturePrefsStore.batch701.v705analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v705: anchor setting
internal fun PlayerActivity.showV705AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v705anchor
    FeaturePrefsStore.batch701.v705anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v705: animate setting
internal fun PlayerActivity.showV705AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v705animate
    FeaturePrefsStore.batch701.v705animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v705: announce setting
internal fun PlayerActivity.showV705AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v705announce
    FeaturePrefsStore.batch701.v705announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v705: append setting
internal fun PlayerActivity.showV705AppendToggle() {
    val current = FeaturePrefsStore.batch701.v705append
    FeaturePrefsStore.batch701.v705append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v706: acknowledge mode
internal fun PlayerActivity.showV706AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v706acknowledge
    FeaturePrefsStore.batch701.v706acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v706: acquire mode
internal fun PlayerActivity.showV706AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v706acquire
    FeaturePrefsStore.batch701.v706acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v706: activate mode
internal fun PlayerActivity.showV706ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v706activate
    FeaturePrefsStore.batch701.v706activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adaptive mode
internal fun PlayerActivity.showV706AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v706adaptive
    FeaturePrefsStore.batch701.v706adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adjust mode
internal fun PlayerActivity.showV706AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v706adjust
    FeaturePrefsStore.batch701.v706adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v706: aggregate level
internal fun PlayerActivity.showV706AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v706: alert level
internal fun PlayerActivity.showV706AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v706: align level
internal fun PlayerActivity.showV706AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706align = value
        AppToast.show(this, "align level: $value")
    }
}

// v706: allocate level
internal fun PlayerActivity.showV706AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v706: amplify level
internal fun PlayerActivity.showV706AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v706: analyze setting
internal fun PlayerActivity.showV706AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v706analyze
    FeaturePrefsStore.batch701.v706analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v706: anchor setting
internal fun PlayerActivity.showV706AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v706anchor
    FeaturePrefsStore.batch701.v706anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v706: animate setting
internal fun PlayerActivity.showV706AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v706animate
    FeaturePrefsStore.batch701.v706animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v706: announce setting
internal fun PlayerActivity.showV706AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v706announce
    FeaturePrefsStore.batch701.v706announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v706: append setting
internal fun PlayerActivity.showV706AppendToggle() {
    val current = FeaturePrefsStore.batch701.v706append
    FeaturePrefsStore.batch701.v706append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v707: acknowledge mode
internal fun PlayerActivity.showV707AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v707acknowledge
    FeaturePrefsStore.batch701.v707acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v707: acquire mode
internal fun PlayerActivity.showV707AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v707acquire
    FeaturePrefsStore.batch701.v707acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v707: activate mode
internal fun PlayerActivity.showV707ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v707activate
    FeaturePrefsStore.batch701.v707activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adaptive mode
internal fun PlayerActivity.showV707AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v707adaptive
    FeaturePrefsStore.batch701.v707adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adjust mode
internal fun PlayerActivity.showV707AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v707adjust
    FeaturePrefsStore.batch701.v707adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v707: aggregate level
internal fun PlayerActivity.showV707AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v707: alert level
internal fun PlayerActivity.showV707AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v707: align level
internal fun PlayerActivity.showV707AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707align = value
        AppToast.show(this, "align level: $value")
    }
}

// v707: allocate level
internal fun PlayerActivity.showV707AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v707: amplify level
internal fun PlayerActivity.showV707AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v707: analyze setting
internal fun PlayerActivity.showV707AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v707analyze
    FeaturePrefsStore.batch701.v707analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v707: anchor setting
internal fun PlayerActivity.showV707AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v707anchor
    FeaturePrefsStore.batch701.v707anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v707: animate setting
internal fun PlayerActivity.showV707AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v707animate
    FeaturePrefsStore.batch701.v707animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v707: announce setting
internal fun PlayerActivity.showV707AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v707announce
    FeaturePrefsStore.batch701.v707announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v707: append setting
internal fun PlayerActivity.showV707AppendToggle() {
    val current = FeaturePrefsStore.batch701.v707append
    FeaturePrefsStore.batch701.v707append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v708: acknowledge mode
internal fun PlayerActivity.showV708AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v708acknowledge
    FeaturePrefsStore.batch701.v708acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v708: acquire mode
internal fun PlayerActivity.showV708AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v708acquire
    FeaturePrefsStore.batch701.v708acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v708: activate mode
internal fun PlayerActivity.showV708ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v708activate
    FeaturePrefsStore.batch701.v708activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adaptive mode
internal fun PlayerActivity.showV708AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v708adaptive
    FeaturePrefsStore.batch701.v708adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adjust mode
internal fun PlayerActivity.showV708AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v708adjust
    FeaturePrefsStore.batch701.v708adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v708: aggregate level
internal fun PlayerActivity.showV708AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v708: alert level
internal fun PlayerActivity.showV708AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v708: align level
internal fun PlayerActivity.showV708AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708align = value
        AppToast.show(this, "align level: $value")
    }
}

// v708: allocate level
internal fun PlayerActivity.showV708AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v708: amplify level
internal fun PlayerActivity.showV708AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v708: analyze setting
internal fun PlayerActivity.showV708AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v708analyze
    FeaturePrefsStore.batch701.v708analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v708: anchor setting
internal fun PlayerActivity.showV708AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v708anchor
    FeaturePrefsStore.batch701.v708anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v708: animate setting
internal fun PlayerActivity.showV708AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v708animate
    FeaturePrefsStore.batch701.v708animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v708: announce setting
internal fun PlayerActivity.showV708AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v708announce
    FeaturePrefsStore.batch701.v708announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v708: append setting
internal fun PlayerActivity.showV708AppendToggle() {
    val current = FeaturePrefsStore.batch701.v708append
    FeaturePrefsStore.batch701.v708append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v709: acknowledge mode
internal fun PlayerActivity.showV709AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v709acknowledge
    FeaturePrefsStore.batch701.v709acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v709: acquire mode
internal fun PlayerActivity.showV709AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v709acquire
    FeaturePrefsStore.batch701.v709acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v709: activate mode
internal fun PlayerActivity.showV709ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v709activate
    FeaturePrefsStore.batch701.v709activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adaptive mode
internal fun PlayerActivity.showV709AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v709adaptive
    FeaturePrefsStore.batch701.v709adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adjust mode
internal fun PlayerActivity.showV709AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v709adjust
    FeaturePrefsStore.batch701.v709adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v709: aggregate level
internal fun PlayerActivity.showV709AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v709: alert level
internal fun PlayerActivity.showV709AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v709: align level
internal fun PlayerActivity.showV709AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709align = value
        AppToast.show(this, "align level: $value")
    }
}

// v709: allocate level
internal fun PlayerActivity.showV709AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v709: amplify level
internal fun PlayerActivity.showV709AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v709: analyze setting
internal fun PlayerActivity.showV709AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v709analyze
    FeaturePrefsStore.batch701.v709analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v709: anchor setting
internal fun PlayerActivity.showV709AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v709anchor
    FeaturePrefsStore.batch701.v709anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v709: animate setting
internal fun PlayerActivity.showV709AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v709animate
    FeaturePrefsStore.batch701.v709animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v709: announce setting
internal fun PlayerActivity.showV709AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v709announce
    FeaturePrefsStore.batch701.v709announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v709: append setting
internal fun PlayerActivity.showV709AppendToggle() {
    val current = FeaturePrefsStore.batch701.v709append
    FeaturePrefsStore.batch701.v709append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v710: acknowledge mode
internal fun PlayerActivity.showV710AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v710acknowledge
    FeaturePrefsStore.batch701.v710acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v710: acquire mode
internal fun PlayerActivity.showV710AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v710acquire
    FeaturePrefsStore.batch701.v710acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v710: activate mode
internal fun PlayerActivity.showV710ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v710activate
    FeaturePrefsStore.batch701.v710activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adaptive mode
internal fun PlayerActivity.showV710AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v710adaptive
    FeaturePrefsStore.batch701.v710adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adjust mode
internal fun PlayerActivity.showV710AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v710adjust
    FeaturePrefsStore.batch701.v710adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v710: aggregate level
internal fun PlayerActivity.showV710AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v710: alert level
internal fun PlayerActivity.showV710AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v710: align level
internal fun PlayerActivity.showV710AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710align = value
        AppToast.show(this, "align level: $value")
    }
}

// v710: allocate level
internal fun PlayerActivity.showV710AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v710: amplify level
internal fun PlayerActivity.showV710AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v710: analyze setting
internal fun PlayerActivity.showV710AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v710analyze
    FeaturePrefsStore.batch701.v710analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v710: anchor setting
internal fun PlayerActivity.showV710AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v710anchor
    FeaturePrefsStore.batch701.v710anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v710: animate setting
internal fun PlayerActivity.showV710AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v710animate
    FeaturePrefsStore.batch701.v710animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v710: announce setting
internal fun PlayerActivity.showV710AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v710announce
    FeaturePrefsStore.batch701.v710announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v710: append setting
internal fun PlayerActivity.showV710AppendToggle() {
    val current = FeaturePrefsStore.batch701.v710append
    FeaturePrefsStore.batch701.v710append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v1011: query mode
internal fun PlayerActivity.showV1011QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1011query
    FeaturePrefsStore.batch1011.v1011query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1011: queue mode
internal fun PlayerActivity.showV1011QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1011queue
    FeaturePrefsStore.batch1011.v1011queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1011: quick mode
internal fun PlayerActivity.showV1011QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quick
    FeaturePrefsStore.batch1011.v1011quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1011: quit mode
internal fun PlayerActivity.showV1011QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quit
    FeaturePrefsStore.batch1011.v1011quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1011: quote mode
internal fun PlayerActivity.showV1011QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quote
    FeaturePrefsStore.batch1011.v1011quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1011: race level
internal fun PlayerActivity.showV1011RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011race = value
        AppToast.show(this, "race: $value")
    }
}

// v1011: random level
internal fun PlayerActivity.showV1011RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011random = value
        AppToast.show(this, "random: $value")
    }
}

// v1011: range level
internal fun PlayerActivity.showV1011RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011range = value
        AppToast.show(this, "range: $value")
    }
}

// v1011: rate level
internal fun PlayerActivity.showV1011RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1011: raw level
internal fun PlayerActivity.showV1011RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1011: read mode
internal fun PlayerActivity.showV1011ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1011read
    FeaturePrefsStore.batch1011.v1011read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1011: ready mode
internal fun PlayerActivity.showV1011ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1011ready
    FeaturePrefsStore.batch1011.v1011ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1011: real mode
internal fun PlayerActivity.showV1011RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1011real
    FeaturePrefsStore.batch1011.v1011real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1011: rebuild mode
internal fun PlayerActivity.showV1011RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1011rebuild
    FeaturePrefsStore.batch1011.v1011rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1011: record mode
internal fun PlayerActivity.showV1011RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1011record
    FeaturePrefsStore.batch1011.v1011record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1012: query mode
internal fun PlayerActivity.showV1012QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1012query
    FeaturePrefsStore.batch1011.v1012query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1012: queue mode
internal fun PlayerActivity.showV1012QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1012queue
    FeaturePrefsStore.batch1011.v1012queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1012: quick mode
internal fun PlayerActivity.showV1012QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quick
    FeaturePrefsStore.batch1011.v1012quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1012: quit mode
internal fun PlayerActivity.showV1012QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quit
    FeaturePrefsStore.batch1011.v1012quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1012: quote mode
internal fun PlayerActivity.showV1012QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quote
    FeaturePrefsStore.batch1011.v1012quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1012: race level
internal fun PlayerActivity.showV1012RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012race = value
        AppToast.show(this, "race: $value")
    }
}

// v1012: random level
internal fun PlayerActivity.showV1012RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012random = value
        AppToast.show(this, "random: $value")
    }
}

// v1012: range level
internal fun PlayerActivity.showV1012RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012range = value
        AppToast.show(this, "range: $value")
    }
}

// v1012: rate level
internal fun PlayerActivity.showV1012RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1012: raw level
internal fun PlayerActivity.showV1012RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1012: read mode
internal fun PlayerActivity.showV1012ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1012read
    FeaturePrefsStore.batch1011.v1012read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1012: ready mode
internal fun PlayerActivity.showV1012ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1012ready
    FeaturePrefsStore.batch1011.v1012ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1012: real mode
internal fun PlayerActivity.showV1012RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1012real
    FeaturePrefsStore.batch1011.v1012real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1012: rebuild mode
internal fun PlayerActivity.showV1012RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1012rebuild
    FeaturePrefsStore.batch1011.v1012rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1012: record mode
internal fun PlayerActivity.showV1012RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1012record
    FeaturePrefsStore.batch1011.v1012record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1013: query mode
internal fun PlayerActivity.showV1013QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1013query
    FeaturePrefsStore.batch1011.v1013query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1013: queue mode
internal fun PlayerActivity.showV1013QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1013queue
    FeaturePrefsStore.batch1011.v1013queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1013: quick mode
internal fun PlayerActivity.showV1013QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quick
    FeaturePrefsStore.batch1011.v1013quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1013: quit mode
internal fun PlayerActivity.showV1013QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quit
    FeaturePrefsStore.batch1011.v1013quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1013: quote mode
internal fun PlayerActivity.showV1013QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quote
    FeaturePrefsStore.batch1011.v1013quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1013: race level
internal fun PlayerActivity.showV1013RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013race = value
        AppToast.show(this, "race: $value")
    }
}

// v1013: random level
internal fun PlayerActivity.showV1013RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013random = value
        AppToast.show(this, "random: $value")
    }
}

// v1013: range level
internal fun PlayerActivity.showV1013RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013range = value
        AppToast.show(this, "range: $value")
    }
}

// v1013: rate level
internal fun PlayerActivity.showV1013RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1013: raw level
internal fun PlayerActivity.showV1013RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1013: read mode
internal fun PlayerActivity.showV1013ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1013read
    FeaturePrefsStore.batch1011.v1013read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1013: ready mode
internal fun PlayerActivity.showV1013ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1013ready
    FeaturePrefsStore.batch1011.v1013ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1013: real mode
internal fun PlayerActivity.showV1013RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1013real
    FeaturePrefsStore.batch1011.v1013real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1013: rebuild mode
internal fun PlayerActivity.showV1013RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1013rebuild
    FeaturePrefsStore.batch1011.v1013rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1013: record mode
internal fun PlayerActivity.showV1013RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1013record
    FeaturePrefsStore.batch1011.v1013record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1014: query mode
internal fun PlayerActivity.showV1014QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1014query
    FeaturePrefsStore.batch1011.v1014query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1014: queue mode
internal fun PlayerActivity.showV1014QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1014queue
    FeaturePrefsStore.batch1011.v1014queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1014: quick mode
internal fun PlayerActivity.showV1014QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quick
    FeaturePrefsStore.batch1011.v1014quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1014: quit mode
internal fun PlayerActivity.showV1014QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quit
    FeaturePrefsStore.batch1011.v1014quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1014: quote mode
internal fun PlayerActivity.showV1014QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quote
    FeaturePrefsStore.batch1011.v1014quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1014: race level
internal fun PlayerActivity.showV1014RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014race = value
        AppToast.show(this, "race: $value")
    }
}

// v1014: random level
internal fun PlayerActivity.showV1014RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014random = value
        AppToast.show(this, "random: $value")
    }
}

// v1014: range level
internal fun PlayerActivity.showV1014RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014range = value
        AppToast.show(this, "range: $value")
    }
}

// v1014: rate level
internal fun PlayerActivity.showV1014RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1014: raw level
internal fun PlayerActivity.showV1014RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1014: read mode
internal fun PlayerActivity.showV1014ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1014read
    FeaturePrefsStore.batch1011.v1014read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1014: ready mode
internal fun PlayerActivity.showV1014ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1014ready
    FeaturePrefsStore.batch1011.v1014ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1014: real mode
internal fun PlayerActivity.showV1014RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1014real
    FeaturePrefsStore.batch1011.v1014real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1014: rebuild mode
internal fun PlayerActivity.showV1014RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1014rebuild
    FeaturePrefsStore.batch1011.v1014rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1014: record mode
internal fun PlayerActivity.showV1014RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1014record
    FeaturePrefsStore.batch1011.v1014record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1015: query mode
internal fun PlayerActivity.showV1015QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1015query
    FeaturePrefsStore.batch1011.v1015query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1015: queue mode
internal fun PlayerActivity.showV1015QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1015queue
    FeaturePrefsStore.batch1011.v1015queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1015: quick mode
internal fun PlayerActivity.showV1015QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quick
    FeaturePrefsStore.batch1011.v1015quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1015: quit mode
internal fun PlayerActivity.showV1015QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quit
    FeaturePrefsStore.batch1011.v1015quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1015: quote mode
internal fun PlayerActivity.showV1015QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quote
    FeaturePrefsStore.batch1011.v1015quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1015: race level
internal fun PlayerActivity.showV1015RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015race = value
        AppToast.show(this, "race: $value")
    }
}

// v1015: random level
internal fun PlayerActivity.showV1015RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015random = value
        AppToast.show(this, "random: $value")
    }
}

// v1015: range level
internal fun PlayerActivity.showV1015RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015range = value
        AppToast.show(this, "range: $value")
    }
}

// v1015: rate level
internal fun PlayerActivity.showV1015RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1015: raw level
internal fun PlayerActivity.showV1015RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1015: read mode
internal fun PlayerActivity.showV1015ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1015read
    FeaturePrefsStore.batch1011.v1015read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1015: ready mode
internal fun PlayerActivity.showV1015ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1015ready
    FeaturePrefsStore.batch1011.v1015ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1015: real mode
internal fun PlayerActivity.showV1015RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1015real
    FeaturePrefsStore.batch1011.v1015real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1015: rebuild mode
internal fun PlayerActivity.showV1015RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1015rebuild
    FeaturePrefsStore.batch1011.v1015rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1015: record mode
internal fun PlayerActivity.showV1015RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1015record
    FeaturePrefsStore.batch1011.v1015record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1016: query mode
internal fun PlayerActivity.showV1016QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1016query
    FeaturePrefsStore.batch1011.v1016query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1016: queue mode
internal fun PlayerActivity.showV1016QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1016queue
    FeaturePrefsStore.batch1011.v1016queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1016: quick mode
internal fun PlayerActivity.showV1016QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quick
    FeaturePrefsStore.batch1011.v1016quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1016: quit mode
internal fun PlayerActivity.showV1016QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quit
    FeaturePrefsStore.batch1011.v1016quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1016: quote mode
internal fun PlayerActivity.showV1016QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quote
    FeaturePrefsStore.batch1011.v1016quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1016: race level
internal fun PlayerActivity.showV1016RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016race = value
        AppToast.show(this, "race: $value")
    }
}

// v1016: random level
internal fun PlayerActivity.showV1016RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016random = value
        AppToast.show(this, "random: $value")
    }
}

// v1016: range level
internal fun PlayerActivity.showV1016RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016range = value
        AppToast.show(this, "range: $value")
    }
}

// v1016: rate level
internal fun PlayerActivity.showV1016RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1016: raw level
internal fun PlayerActivity.showV1016RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1016: read mode
internal fun PlayerActivity.showV1016ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1016read
    FeaturePrefsStore.batch1011.v1016read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1016: ready mode
internal fun PlayerActivity.showV1016ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1016ready
    FeaturePrefsStore.batch1011.v1016ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1016: real mode
internal fun PlayerActivity.showV1016RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1016real
    FeaturePrefsStore.batch1011.v1016real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1016: rebuild mode
internal fun PlayerActivity.showV1016RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1016rebuild
    FeaturePrefsStore.batch1011.v1016rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1016: record mode
internal fun PlayerActivity.showV1016RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1016record
    FeaturePrefsStore.batch1011.v1016record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1017: query mode
internal fun PlayerActivity.showV1017QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1017query
    FeaturePrefsStore.batch1011.v1017query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1017: queue mode
internal fun PlayerActivity.showV1017QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1017queue
    FeaturePrefsStore.batch1011.v1017queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1017: quick mode
internal fun PlayerActivity.showV1017QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quick
    FeaturePrefsStore.batch1011.v1017quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1017: quit mode
internal fun PlayerActivity.showV1017QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quit
    FeaturePrefsStore.batch1011.v1017quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1017: quote mode
internal fun PlayerActivity.showV1017QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quote
    FeaturePrefsStore.batch1011.v1017quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1017: race level
internal fun PlayerActivity.showV1017RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017race = value
        AppToast.show(this, "race: $value")
    }
}

// v1017: random level
internal fun PlayerActivity.showV1017RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017random = value
        AppToast.show(this, "random: $value")
    }
}

// v1017: range level
internal fun PlayerActivity.showV1017RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017range = value
        AppToast.show(this, "range: $value")
    }
}

// v1017: rate level
internal fun PlayerActivity.showV1017RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1017: raw level
internal fun PlayerActivity.showV1017RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1017: read mode
internal fun PlayerActivity.showV1017ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1017read
    FeaturePrefsStore.batch1011.v1017read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1017: ready mode
internal fun PlayerActivity.showV1017ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1017ready
    FeaturePrefsStore.batch1011.v1017ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1017: real mode
internal fun PlayerActivity.showV1017RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1017real
    FeaturePrefsStore.batch1011.v1017real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1017: rebuild mode
internal fun PlayerActivity.showV1017RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1017rebuild
    FeaturePrefsStore.batch1011.v1017rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1017: record mode
internal fun PlayerActivity.showV1017RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1017record
    FeaturePrefsStore.batch1011.v1017record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1018: query mode
internal fun PlayerActivity.showV1018QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1018query
    FeaturePrefsStore.batch1011.v1018query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1018: queue mode
internal fun PlayerActivity.showV1018QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1018queue
    FeaturePrefsStore.batch1011.v1018queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1018: quick mode
internal fun PlayerActivity.showV1018QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quick
    FeaturePrefsStore.batch1011.v1018quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1018: quit mode
internal fun PlayerActivity.showV1018QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quit
    FeaturePrefsStore.batch1011.v1018quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1018: quote mode
internal fun PlayerActivity.showV1018QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quote
    FeaturePrefsStore.batch1011.v1018quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1018: race level
internal fun PlayerActivity.showV1018RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018race = value
        AppToast.show(this, "race: $value")
    }
}

// v1018: random level
internal fun PlayerActivity.showV1018RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018random = value
        AppToast.show(this, "random: $value")
    }
}

// v1018: range level
internal fun PlayerActivity.showV1018RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018range = value
        AppToast.show(this, "range: $value")
    }
}

// v1018: rate level
internal fun PlayerActivity.showV1018RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1018: raw level
internal fun PlayerActivity.showV1018RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1018: read mode
internal fun PlayerActivity.showV1018ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1018read
    FeaturePrefsStore.batch1011.v1018read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1018: ready mode
internal fun PlayerActivity.showV1018ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1018ready
    FeaturePrefsStore.batch1011.v1018ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1018: real mode
internal fun PlayerActivity.showV1018RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1018real
    FeaturePrefsStore.batch1011.v1018real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1018: rebuild mode
internal fun PlayerActivity.showV1018RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1018rebuild
    FeaturePrefsStore.batch1011.v1018rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1018: record mode
internal fun PlayerActivity.showV1018RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1018record
    FeaturePrefsStore.batch1011.v1018record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1019: query mode
internal fun PlayerActivity.showV1019QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1019query
    FeaturePrefsStore.batch1011.v1019query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1019: queue mode
internal fun PlayerActivity.showV1019QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1019queue
    FeaturePrefsStore.batch1011.v1019queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1019: quick mode
internal fun PlayerActivity.showV1019QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quick
    FeaturePrefsStore.batch1011.v1019quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1019: quit mode
internal fun PlayerActivity.showV1019QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quit
    FeaturePrefsStore.batch1011.v1019quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1019: quote mode
internal fun PlayerActivity.showV1019QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quote
    FeaturePrefsStore.batch1011.v1019quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1019: race level
internal fun PlayerActivity.showV1019RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019race = value
        AppToast.show(this, "race: $value")
    }
}

// v1019: random level
internal fun PlayerActivity.showV1019RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019random = value
        AppToast.show(this, "random: $value")
    }
}

// v1019: range level
internal fun PlayerActivity.showV1019RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019range = value
        AppToast.show(this, "range: $value")
    }
}

// v1019: rate level
internal fun PlayerActivity.showV1019RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1019: raw level
internal fun PlayerActivity.showV1019RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1019: read mode
internal fun PlayerActivity.showV1019ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1019read
    FeaturePrefsStore.batch1011.v1019read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1019: ready mode
internal fun PlayerActivity.showV1019ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1019ready
    FeaturePrefsStore.batch1011.v1019ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1019: real mode
internal fun PlayerActivity.showV1019RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1019real
    FeaturePrefsStore.batch1011.v1019real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1019: rebuild mode
internal fun PlayerActivity.showV1019RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1019rebuild
    FeaturePrefsStore.batch1011.v1019rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1019: record mode
internal fun PlayerActivity.showV1019RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1019record
    FeaturePrefsStore.batch1011.v1019record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1020: query mode
internal fun PlayerActivity.showV1020QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1020query
    FeaturePrefsStore.batch1011.v1020query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1020: queue mode
internal fun PlayerActivity.showV1020QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1020queue
    FeaturePrefsStore.batch1011.v1020queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1020: quick mode
internal fun PlayerActivity.showV1020QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quick
    FeaturePrefsStore.batch1011.v1020quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1020: quit mode
internal fun PlayerActivity.showV1020QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quit
    FeaturePrefsStore.batch1011.v1020quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1020: quote mode
internal fun PlayerActivity.showV1020QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quote
    FeaturePrefsStore.batch1011.v1020quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1020: race level
internal fun PlayerActivity.showV1020RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020race = value
        AppToast.show(this, "race: $value")
    }
}

// v1020: random level
internal fun PlayerActivity.showV1020RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020random = value
        AppToast.show(this, "random: $value")
    }
}

// v1020: range level
internal fun PlayerActivity.showV1020RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020range = value
        AppToast.show(this, "range: $value")
    }
}

// v1020: rate level
internal fun PlayerActivity.showV1020RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1020: raw level
internal fun PlayerActivity.showV1020RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1020: read mode
internal fun PlayerActivity.showV1020ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1020read
    FeaturePrefsStore.batch1011.v1020read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1020: ready mode
internal fun PlayerActivity.showV1020ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1020ready
    FeaturePrefsStore.batch1011.v1020ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1020: real mode
internal fun PlayerActivity.showV1020RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1020real
    FeaturePrefsStore.batch1011.v1020real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1020: rebuild mode
internal fun PlayerActivity.showV1020RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1020rebuild
    FeaturePrefsStore.batch1011.v1020rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1020: record mode
internal fun PlayerActivity.showV1020RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1020record
    FeaturePrefsStore.batch1011.v1020record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}
