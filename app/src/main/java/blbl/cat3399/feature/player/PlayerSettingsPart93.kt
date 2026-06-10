package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1111: symbol mode
internal fun PlayerActivity.showV1111SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1111symbol
    FeaturePrefsStore.batch1111.v1111symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1111: sync mode
internal fun PlayerActivity.showV1111SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1111sync
    FeaturePrefsStore.batch1111.v1111sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1111: system mode
internal fun PlayerActivity.showV1111SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1111system
    FeaturePrefsStore.batch1111.v1111system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1111: tab mode
internal fun PlayerActivity.showV1111TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1111tab
    FeaturePrefsStore.batch1111.v1111tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1111: table mode
internal fun PlayerActivity.showV1111TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1111table
    FeaturePrefsStore.batch1111.v1111table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1111: tag level
internal fun PlayerActivity.showV1111TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1111tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1111tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1111: tail level
internal fun PlayerActivity.showV1111TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1111tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1111tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1111: target level
internal fun PlayerActivity.showV1111TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1111target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1111target = value
        AppToast.show(this, "target: $value")
    }
}

// v1111: task level
internal fun PlayerActivity.showV1111TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1111task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1111task = value
        AppToast.show(this, "task: $value")
    }
}

// v1111: template level
internal fun PlayerActivity.showV1111TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1111template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1111template = value
        AppToast.show(this, "template: $value")
    }
}

// v1111: test mode
internal fun PlayerActivity.showV1111TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1111test
    FeaturePrefsStore.batch1111.v1111test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1111: text mode
internal fun PlayerActivity.showV1111TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1111text
    FeaturePrefsStore.batch1111.v1111text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1111: theme mode
internal fun PlayerActivity.showV1111ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1111theme
    FeaturePrefsStore.batch1111.v1111theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1111: threshold mode
internal fun PlayerActivity.showV1111ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1111threshold
    FeaturePrefsStore.batch1111.v1111threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1111: throw mode
internal fun PlayerActivity.showV1111ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1111throw
    FeaturePrefsStore.batch1111.v1111throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1112: symbol mode
internal fun PlayerActivity.showV1112SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1112symbol
    FeaturePrefsStore.batch1111.v1112symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1112: sync mode
internal fun PlayerActivity.showV1112SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1112sync
    FeaturePrefsStore.batch1111.v1112sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1112: system mode
internal fun PlayerActivity.showV1112SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1112system
    FeaturePrefsStore.batch1111.v1112system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1112: tab mode
internal fun PlayerActivity.showV1112TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1112tab
    FeaturePrefsStore.batch1111.v1112tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1112: table mode
internal fun PlayerActivity.showV1112TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1112table
    FeaturePrefsStore.batch1111.v1112table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1112: tag level
internal fun PlayerActivity.showV1112TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1112tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1112tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1112: tail level
internal fun PlayerActivity.showV1112TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1112tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1112tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1112: target level
internal fun PlayerActivity.showV1112TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1112target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1112target = value
        AppToast.show(this, "target: $value")
    }
}

// v1112: task level
internal fun PlayerActivity.showV1112TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1112task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1112task = value
        AppToast.show(this, "task: $value")
    }
}

// v1112: template level
internal fun PlayerActivity.showV1112TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1112template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1112template = value
        AppToast.show(this, "template: $value")
    }
}

// v1112: test mode
internal fun PlayerActivity.showV1112TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1112test
    FeaturePrefsStore.batch1111.v1112test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1112: text mode
internal fun PlayerActivity.showV1112TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1112text
    FeaturePrefsStore.batch1111.v1112text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1112: theme mode
internal fun PlayerActivity.showV1112ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1112theme
    FeaturePrefsStore.batch1111.v1112theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1112: threshold mode
internal fun PlayerActivity.showV1112ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1112threshold
    FeaturePrefsStore.batch1111.v1112threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1112: throw mode
internal fun PlayerActivity.showV1112ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1112throw
    FeaturePrefsStore.batch1111.v1112throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1113: symbol mode
internal fun PlayerActivity.showV1113SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1113symbol
    FeaturePrefsStore.batch1111.v1113symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1113: sync mode
internal fun PlayerActivity.showV1113SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1113sync
    FeaturePrefsStore.batch1111.v1113sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1113: system mode
internal fun PlayerActivity.showV1113SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1113system
    FeaturePrefsStore.batch1111.v1113system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1113: tab mode
internal fun PlayerActivity.showV1113TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1113tab
    FeaturePrefsStore.batch1111.v1113tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1113: table mode
internal fun PlayerActivity.showV1113TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1113table
    FeaturePrefsStore.batch1111.v1113table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1113: tag level
internal fun PlayerActivity.showV1113TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1113tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1113tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1113: tail level
internal fun PlayerActivity.showV1113TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1113tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1113tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1113: target level
internal fun PlayerActivity.showV1113TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1113target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1113target = value
        AppToast.show(this, "target: $value")
    }
}

// v1113: task level
internal fun PlayerActivity.showV1113TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1113task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1113task = value
        AppToast.show(this, "task: $value")
    }
}

// v1113: template level
internal fun PlayerActivity.showV1113TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1113template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1113template = value
        AppToast.show(this, "template: $value")
    }
}

// v1113: test mode
internal fun PlayerActivity.showV1113TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1113test
    FeaturePrefsStore.batch1111.v1113test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1113: text mode
internal fun PlayerActivity.showV1113TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1113text
    FeaturePrefsStore.batch1111.v1113text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1113: theme mode
internal fun PlayerActivity.showV1113ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1113theme
    FeaturePrefsStore.batch1111.v1113theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1113: threshold mode
internal fun PlayerActivity.showV1113ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1113threshold
    FeaturePrefsStore.batch1111.v1113threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1113: throw mode
internal fun PlayerActivity.showV1113ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1113throw
    FeaturePrefsStore.batch1111.v1113throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1114: symbol mode
internal fun PlayerActivity.showV1114SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1114symbol
    FeaturePrefsStore.batch1111.v1114symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1114: sync mode
internal fun PlayerActivity.showV1114SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1114sync
    FeaturePrefsStore.batch1111.v1114sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1114: system mode
internal fun PlayerActivity.showV1114SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1114system
    FeaturePrefsStore.batch1111.v1114system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1114: tab mode
internal fun PlayerActivity.showV1114TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1114tab
    FeaturePrefsStore.batch1111.v1114tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1114: table mode
internal fun PlayerActivity.showV1114TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1114table
    FeaturePrefsStore.batch1111.v1114table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1114: tag level
internal fun PlayerActivity.showV1114TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1114tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1114tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1114: tail level
internal fun PlayerActivity.showV1114TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1114tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1114tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1114: target level
internal fun PlayerActivity.showV1114TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1114target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1114target = value
        AppToast.show(this, "target: $value")
    }
}

// v1114: task level
internal fun PlayerActivity.showV1114TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1114task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1114task = value
        AppToast.show(this, "task: $value")
    }
}

// v1114: template level
internal fun PlayerActivity.showV1114TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1114template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1114template = value
        AppToast.show(this, "template: $value")
    }
}

// v1114: test mode
internal fun PlayerActivity.showV1114TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1114test
    FeaturePrefsStore.batch1111.v1114test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1114: text mode
internal fun PlayerActivity.showV1114TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1114text
    FeaturePrefsStore.batch1111.v1114text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1114: theme mode
internal fun PlayerActivity.showV1114ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1114theme
    FeaturePrefsStore.batch1111.v1114theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1114: threshold mode
internal fun PlayerActivity.showV1114ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1114threshold
    FeaturePrefsStore.batch1111.v1114threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1114: throw mode
internal fun PlayerActivity.showV1114ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1114throw
    FeaturePrefsStore.batch1111.v1114throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1115: symbol mode
internal fun PlayerActivity.showV1115SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1115symbol
    FeaturePrefsStore.batch1111.v1115symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1115: sync mode
internal fun PlayerActivity.showV1115SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1115sync
    FeaturePrefsStore.batch1111.v1115sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1115: system mode
internal fun PlayerActivity.showV1115SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1115system
    FeaturePrefsStore.batch1111.v1115system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1115: tab mode
internal fun PlayerActivity.showV1115TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1115tab
    FeaturePrefsStore.batch1111.v1115tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1115: table mode
internal fun PlayerActivity.showV1115TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1115table
    FeaturePrefsStore.batch1111.v1115table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1115: tag level
internal fun PlayerActivity.showV1115TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1115tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1115tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1115: tail level
internal fun PlayerActivity.showV1115TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1115tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1115tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1115: target level
internal fun PlayerActivity.showV1115TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1115target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1115target = value
        AppToast.show(this, "target: $value")
    }
}

// v1115: task level
internal fun PlayerActivity.showV1115TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1115task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1115task = value
        AppToast.show(this, "task: $value")
    }
}

// v1115: template level
internal fun PlayerActivity.showV1115TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1115template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1115template = value
        AppToast.show(this, "template: $value")
    }
}

// v1115: test mode
internal fun PlayerActivity.showV1115TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1115test
    FeaturePrefsStore.batch1111.v1115test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1115: text mode
internal fun PlayerActivity.showV1115TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1115text
    FeaturePrefsStore.batch1111.v1115text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1115: theme mode
internal fun PlayerActivity.showV1115ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1115theme
    FeaturePrefsStore.batch1111.v1115theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1115: threshold mode
internal fun PlayerActivity.showV1115ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1115threshold
    FeaturePrefsStore.batch1111.v1115threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1115: throw mode
internal fun PlayerActivity.showV1115ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1115throw
    FeaturePrefsStore.batch1111.v1115throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1116: symbol mode
internal fun PlayerActivity.showV1116SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1116symbol
    FeaturePrefsStore.batch1111.v1116symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1116: sync mode
internal fun PlayerActivity.showV1116SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1116sync
    FeaturePrefsStore.batch1111.v1116sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1116: system mode
internal fun PlayerActivity.showV1116SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1116system
    FeaturePrefsStore.batch1111.v1116system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1116: tab mode
internal fun PlayerActivity.showV1116TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1116tab
    FeaturePrefsStore.batch1111.v1116tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1116: table mode
internal fun PlayerActivity.showV1116TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1116table
    FeaturePrefsStore.batch1111.v1116table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1116: tag level
internal fun PlayerActivity.showV1116TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1116tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1116tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1116: tail level
internal fun PlayerActivity.showV1116TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1116tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1116tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1116: target level
internal fun PlayerActivity.showV1116TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1116target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1116target = value
        AppToast.show(this, "target: $value")
    }
}

// v1116: task level
internal fun PlayerActivity.showV1116TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1116task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1116task = value
        AppToast.show(this, "task: $value")
    }
}

// v1116: template level
internal fun PlayerActivity.showV1116TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1116template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1116template = value
        AppToast.show(this, "template: $value")
    }
}

// v1116: test mode
internal fun PlayerActivity.showV1116TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1116test
    FeaturePrefsStore.batch1111.v1116test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1116: text mode
internal fun PlayerActivity.showV1116TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1116text
    FeaturePrefsStore.batch1111.v1116text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1116: theme mode
internal fun PlayerActivity.showV1116ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1116theme
    FeaturePrefsStore.batch1111.v1116theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1116: threshold mode
internal fun PlayerActivity.showV1116ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1116threshold
    FeaturePrefsStore.batch1111.v1116threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1116: throw mode
internal fun PlayerActivity.showV1116ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1116throw
    FeaturePrefsStore.batch1111.v1116throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1117: symbol mode
internal fun PlayerActivity.showV1117SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1117symbol
    FeaturePrefsStore.batch1111.v1117symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1117: sync mode
internal fun PlayerActivity.showV1117SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1117sync
    FeaturePrefsStore.batch1111.v1117sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1117: system mode
internal fun PlayerActivity.showV1117SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1117system
    FeaturePrefsStore.batch1111.v1117system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1117: tab mode
internal fun PlayerActivity.showV1117TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1117tab
    FeaturePrefsStore.batch1111.v1117tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1117: table mode
internal fun PlayerActivity.showV1117TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1117table
    FeaturePrefsStore.batch1111.v1117table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1117: tag level
internal fun PlayerActivity.showV1117TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1117tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1117tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1117: tail level
internal fun PlayerActivity.showV1117TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1117tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1117tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1117: target level
internal fun PlayerActivity.showV1117TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1117target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1117target = value
        AppToast.show(this, "target: $value")
    }
}

// v1117: task level
internal fun PlayerActivity.showV1117TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1117task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1117task = value
        AppToast.show(this, "task: $value")
    }
}

// v1117: template level
internal fun PlayerActivity.showV1117TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1117template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1117template = value
        AppToast.show(this, "template: $value")
    }
}

// v1117: test mode
internal fun PlayerActivity.showV1117TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1117test
    FeaturePrefsStore.batch1111.v1117test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1117: text mode
internal fun PlayerActivity.showV1117TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1117text
    FeaturePrefsStore.batch1111.v1117text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1117: theme mode
internal fun PlayerActivity.showV1117ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1117theme
    FeaturePrefsStore.batch1111.v1117theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1117: threshold mode
internal fun PlayerActivity.showV1117ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1117threshold
    FeaturePrefsStore.batch1111.v1117threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1117: throw mode
internal fun PlayerActivity.showV1117ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1117throw
    FeaturePrefsStore.batch1111.v1117throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1118: symbol mode
internal fun PlayerActivity.showV1118SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1118symbol
    FeaturePrefsStore.batch1111.v1118symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1118: sync mode
internal fun PlayerActivity.showV1118SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1118sync
    FeaturePrefsStore.batch1111.v1118sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1118: system mode
internal fun PlayerActivity.showV1118SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1118system
    FeaturePrefsStore.batch1111.v1118system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1118: tab mode
internal fun PlayerActivity.showV1118TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1118tab
    FeaturePrefsStore.batch1111.v1118tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1118: table mode
internal fun PlayerActivity.showV1118TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1118table
    FeaturePrefsStore.batch1111.v1118table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1118: tag level
internal fun PlayerActivity.showV1118TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1118tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1118tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1118: tail level
internal fun PlayerActivity.showV1118TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1118tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1118tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1118: target level
internal fun PlayerActivity.showV1118TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1118target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1118target = value
        AppToast.show(this, "target: $value")
    }
}

// v1118: task level
internal fun PlayerActivity.showV1118TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1118task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1118task = value
        AppToast.show(this, "task: $value")
    }
}

// v1118: template level
internal fun PlayerActivity.showV1118TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1118template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1118template = value
        AppToast.show(this, "template: $value")
    }
}

// v1118: test mode
internal fun PlayerActivity.showV1118TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1118test
    FeaturePrefsStore.batch1111.v1118test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1118: text mode
internal fun PlayerActivity.showV1118TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1118text
    FeaturePrefsStore.batch1111.v1118text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1118: theme mode
internal fun PlayerActivity.showV1118ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1118theme
    FeaturePrefsStore.batch1111.v1118theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1118: threshold mode
internal fun PlayerActivity.showV1118ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1118threshold
    FeaturePrefsStore.batch1111.v1118threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1118: throw mode
internal fun PlayerActivity.showV1118ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1118throw
    FeaturePrefsStore.batch1111.v1118throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1119: symbol mode
internal fun PlayerActivity.showV1119SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1119symbol
    FeaturePrefsStore.batch1111.v1119symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1119: sync mode
internal fun PlayerActivity.showV1119SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1119sync
    FeaturePrefsStore.batch1111.v1119sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1119: system mode
internal fun PlayerActivity.showV1119SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1119system
    FeaturePrefsStore.batch1111.v1119system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1119: tab mode
internal fun PlayerActivity.showV1119TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1119tab
    FeaturePrefsStore.batch1111.v1119tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1119: table mode
internal fun PlayerActivity.showV1119TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1119table
    FeaturePrefsStore.batch1111.v1119table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1119: tag level
internal fun PlayerActivity.showV1119TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1119tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1119tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1119: tail level
internal fun PlayerActivity.showV1119TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1119tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1119tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1119: target level
internal fun PlayerActivity.showV1119TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1119target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1119target = value
        AppToast.show(this, "target: $value")
    }
}

// v1119: task level
internal fun PlayerActivity.showV1119TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1119task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1119task = value
        AppToast.show(this, "task: $value")
    }
}

// v1119: template level
internal fun PlayerActivity.showV1119TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1119template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1119template = value
        AppToast.show(this, "template: $value")
    }
}

// v1119: test mode
internal fun PlayerActivity.showV1119TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1119test
    FeaturePrefsStore.batch1111.v1119test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1119: text mode
internal fun PlayerActivity.showV1119TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1119text
    FeaturePrefsStore.batch1111.v1119text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1119: theme mode
internal fun PlayerActivity.showV1119ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1119theme
    FeaturePrefsStore.batch1111.v1119theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1119: threshold mode
internal fun PlayerActivity.showV1119ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1119threshold
    FeaturePrefsStore.batch1111.v1119threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1119: throw mode
internal fun PlayerActivity.showV1119ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1119throw
    FeaturePrefsStore.batch1111.v1119throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

// v1120: symbol mode
internal fun PlayerActivity.showV1120SymbolToggle() {
    val current = FeaturePrefsStore.batch1111.v1120symbol
    FeaturePrefsStore.batch1111.v1120symbol = !current
    AppToast.show(this, "symbol: ${if (!current) "ON" else "OFF"}")
}

// v1120: sync mode
internal fun PlayerActivity.showV1120SyncToggle() {
    val current = FeaturePrefsStore.batch1111.v1120sync
    FeaturePrefsStore.batch1111.v1120sync = !current
    AppToast.show(this, "sync: ${if (!current) "ON" else "OFF"}")
}

// v1120: system mode
internal fun PlayerActivity.showV1120SystemToggle() {
    val current = FeaturePrefsStore.batch1111.v1120system
    FeaturePrefsStore.batch1111.v1120system = !current
    AppToast.show(this, "system: ${if (!current) "ON" else "OFF"}")
}

// v1120: tab mode
internal fun PlayerActivity.showV1120TabToggle() {
    val current = FeaturePrefsStore.batch1111.v1120tab
    FeaturePrefsStore.batch1111.v1120tab = !current
    AppToast.show(this, "tab: ${if (!current) "ON" else "OFF"}")
}

// v1120: table mode
internal fun PlayerActivity.showV1120TableToggle() {
    val current = FeaturePrefsStore.batch1111.v1120table
    FeaturePrefsStore.batch1111.v1120table = !current
    AppToast.show(this, "table: ${if (!current) "ON" else "OFF"}")
}

// v1120: tag level
internal fun PlayerActivity.showV1120TagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1120tag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1120tag = value
        AppToast.show(this, "tag: $value")
    }
}

// v1120: tail level
internal fun PlayerActivity.showV1120TailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1120tail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1120tail = value
        AppToast.show(this, "tail: $value")
    }
}

// v1120: target level
internal fun PlayerActivity.showV1120TargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1120target).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "target level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1120target = value
        AppToast.show(this, "target: $value")
    }
}

// v1120: task level
internal fun PlayerActivity.showV1120TaskDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1120task).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "task level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1120task = value
        AppToast.show(this, "task: $value")
    }
}

// v1120: template level
internal fun PlayerActivity.showV1120TemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1111.v1120template).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "template level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1111.v1120template = value
        AppToast.show(this, "template: $value")
    }
}

// v1120: test mode
internal fun PlayerActivity.showV1120TestToggle() {
    val current = FeaturePrefsStore.batch1111.v1120test
    FeaturePrefsStore.batch1111.v1120test = !current
    AppToast.show(this, "test: ${if (!current) "ON" else "OFF"}")
}

// v1120: text mode
internal fun PlayerActivity.showV1120TextToggle() {
    val current = FeaturePrefsStore.batch1111.v1120text
    FeaturePrefsStore.batch1111.v1120text = !current
    AppToast.show(this, "text: ${if (!current) "ON" else "OFF"}")
}

// v1120: theme mode
internal fun PlayerActivity.showV1120ThemeToggle() {
    val current = FeaturePrefsStore.batch1111.v1120theme
    FeaturePrefsStore.batch1111.v1120theme = !current
    AppToast.show(this, "theme: ${if (!current) "ON" else "OFF"}")
}

// v1120: threshold mode
internal fun PlayerActivity.showV1120ThresholdToggle() {
    val current = FeaturePrefsStore.batch1111.v1120threshold
    FeaturePrefsStore.batch1111.v1120threshold = !current
    AppToast.show(this, "threshold: ${if (!current) "ON" else "OFF"}")
}

// v1120: throw mode
internal fun PlayerActivity.showV1120ThrowToggle() {
    val current = FeaturePrefsStore.batch1111.v1120throw
    FeaturePrefsStore.batch1111.v1120throw = !current
    AppToast.show(this, "throw: ${if (!current) "ON" else "OFF"}")
}

