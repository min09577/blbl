package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

