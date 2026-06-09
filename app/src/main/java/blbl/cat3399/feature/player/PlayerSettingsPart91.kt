package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1091: stack mode
internal fun PlayerActivity.showV1091StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1091stack
    FeaturePrefsStore.batch1091.v1091stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1091: stage mode
internal fun PlayerActivity.showV1091StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1091stage
    FeaturePrefsStore.batch1091.v1091stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1091: standard mode
internal fun PlayerActivity.showV1091StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1091standard
    FeaturePrefsStore.batch1091.v1091standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1091: star mode
internal fun PlayerActivity.showV1091StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1091star
    FeaturePrefsStore.batch1091.v1091star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1091: start mode
internal fun PlayerActivity.showV1091StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1091start
    FeaturePrefsStore.batch1091.v1091start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1091: state level
internal fun PlayerActivity.showV1091StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1091state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1091state = value
        AppToast.show(this, "state: $value")
    }
}

// v1091: static level
internal fun PlayerActivity.showV1091StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1091static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1091static = value
        AppToast.show(this, "static: $value")
    }
}

// v1091: status level
internal fun PlayerActivity.showV1091StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1091status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1091status = value
        AppToast.show(this, "status: $value")
    }
}

// v1091: step level
internal fun PlayerActivity.showV1091StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1091step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1091step = value
        AppToast.show(this, "step: $value")
    }
}

// v1091: stop level
internal fun PlayerActivity.showV1091StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1091stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1091stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1091: storage mode
internal fun PlayerActivity.showV1091StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1091storage
    FeaturePrefsStore.batch1091.v1091storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1091: store mode
internal fun PlayerActivity.showV1091StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1091store
    FeaturePrefsStore.batch1091.v1091store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1091: stream mode
internal fun PlayerActivity.showV1091StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1091stream
    FeaturePrefsStore.batch1091.v1091stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1091: stretch mode
internal fun PlayerActivity.showV1091StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1091stretch
    FeaturePrefsStore.batch1091.v1091stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1091: strict mode
internal fun PlayerActivity.showV1091StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1091strict
    FeaturePrefsStore.batch1091.v1091strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1092: stack mode
internal fun PlayerActivity.showV1092StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1092stack
    FeaturePrefsStore.batch1091.v1092stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1092: stage mode
internal fun PlayerActivity.showV1092StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1092stage
    FeaturePrefsStore.batch1091.v1092stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1092: standard mode
internal fun PlayerActivity.showV1092StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1092standard
    FeaturePrefsStore.batch1091.v1092standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1092: star mode
internal fun PlayerActivity.showV1092StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1092star
    FeaturePrefsStore.batch1091.v1092star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1092: start mode
internal fun PlayerActivity.showV1092StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1092start
    FeaturePrefsStore.batch1091.v1092start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1092: state level
internal fun PlayerActivity.showV1092StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1092state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1092state = value
        AppToast.show(this, "state: $value")
    }
}

// v1092: static level
internal fun PlayerActivity.showV1092StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1092static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1092static = value
        AppToast.show(this, "static: $value")
    }
}

// v1092: status level
internal fun PlayerActivity.showV1092StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1092status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1092status = value
        AppToast.show(this, "status: $value")
    }
}

// v1092: step level
internal fun PlayerActivity.showV1092StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1092step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1092step = value
        AppToast.show(this, "step: $value")
    }
}

// v1092: stop level
internal fun PlayerActivity.showV1092StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1092stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1092stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1092: storage mode
internal fun PlayerActivity.showV1092StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1092storage
    FeaturePrefsStore.batch1091.v1092storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1092: store mode
internal fun PlayerActivity.showV1092StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1092store
    FeaturePrefsStore.batch1091.v1092store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1092: stream mode
internal fun PlayerActivity.showV1092StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1092stream
    FeaturePrefsStore.batch1091.v1092stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1092: stretch mode
internal fun PlayerActivity.showV1092StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1092stretch
    FeaturePrefsStore.batch1091.v1092stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1092: strict mode
internal fun PlayerActivity.showV1092StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1092strict
    FeaturePrefsStore.batch1091.v1092strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1093: stack mode
internal fun PlayerActivity.showV1093StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1093stack
    FeaturePrefsStore.batch1091.v1093stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1093: stage mode
internal fun PlayerActivity.showV1093StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1093stage
    FeaturePrefsStore.batch1091.v1093stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1093: standard mode
internal fun PlayerActivity.showV1093StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1093standard
    FeaturePrefsStore.batch1091.v1093standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1093: star mode
internal fun PlayerActivity.showV1093StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1093star
    FeaturePrefsStore.batch1091.v1093star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1093: start mode
internal fun PlayerActivity.showV1093StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1093start
    FeaturePrefsStore.batch1091.v1093start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1093: state level
internal fun PlayerActivity.showV1093StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1093state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1093state = value
        AppToast.show(this, "state: $value")
    }
}

// v1093: static level
internal fun PlayerActivity.showV1093StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1093static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1093static = value
        AppToast.show(this, "static: $value")
    }
}

// v1093: status level
internal fun PlayerActivity.showV1093StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1093status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1093status = value
        AppToast.show(this, "status: $value")
    }
}

// v1093: step level
internal fun PlayerActivity.showV1093StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1093step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1093step = value
        AppToast.show(this, "step: $value")
    }
}

// v1093: stop level
internal fun PlayerActivity.showV1093StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1093stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1093stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1093: storage mode
internal fun PlayerActivity.showV1093StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1093storage
    FeaturePrefsStore.batch1091.v1093storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1093: store mode
internal fun PlayerActivity.showV1093StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1093store
    FeaturePrefsStore.batch1091.v1093store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1093: stream mode
internal fun PlayerActivity.showV1093StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1093stream
    FeaturePrefsStore.batch1091.v1093stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1093: stretch mode
internal fun PlayerActivity.showV1093StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1093stretch
    FeaturePrefsStore.batch1091.v1093stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1093: strict mode
internal fun PlayerActivity.showV1093StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1093strict
    FeaturePrefsStore.batch1091.v1093strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1094: stack mode
internal fun PlayerActivity.showV1094StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1094stack
    FeaturePrefsStore.batch1091.v1094stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1094: stage mode
internal fun PlayerActivity.showV1094StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1094stage
    FeaturePrefsStore.batch1091.v1094stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1094: standard mode
internal fun PlayerActivity.showV1094StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1094standard
    FeaturePrefsStore.batch1091.v1094standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1094: star mode
internal fun PlayerActivity.showV1094StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1094star
    FeaturePrefsStore.batch1091.v1094star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1094: start mode
internal fun PlayerActivity.showV1094StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1094start
    FeaturePrefsStore.batch1091.v1094start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1094: state level
internal fun PlayerActivity.showV1094StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1094state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1094state = value
        AppToast.show(this, "state: $value")
    }
}

// v1094: static level
internal fun PlayerActivity.showV1094StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1094static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1094static = value
        AppToast.show(this, "static: $value")
    }
}

// v1094: status level
internal fun PlayerActivity.showV1094StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1094status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1094status = value
        AppToast.show(this, "status: $value")
    }
}

// v1094: step level
internal fun PlayerActivity.showV1094StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1094step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1094step = value
        AppToast.show(this, "step: $value")
    }
}

// v1094: stop level
internal fun PlayerActivity.showV1094StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1094stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1094stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1094: storage mode
internal fun PlayerActivity.showV1094StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1094storage
    FeaturePrefsStore.batch1091.v1094storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1094: store mode
internal fun PlayerActivity.showV1094StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1094store
    FeaturePrefsStore.batch1091.v1094store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1094: stream mode
internal fun PlayerActivity.showV1094StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1094stream
    FeaturePrefsStore.batch1091.v1094stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1094: stretch mode
internal fun PlayerActivity.showV1094StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1094stretch
    FeaturePrefsStore.batch1091.v1094stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1094: strict mode
internal fun PlayerActivity.showV1094StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1094strict
    FeaturePrefsStore.batch1091.v1094strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1095: stack mode
internal fun PlayerActivity.showV1095StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1095stack
    FeaturePrefsStore.batch1091.v1095stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1095: stage mode
internal fun PlayerActivity.showV1095StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1095stage
    FeaturePrefsStore.batch1091.v1095stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1095: standard mode
internal fun PlayerActivity.showV1095StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1095standard
    FeaturePrefsStore.batch1091.v1095standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1095: star mode
internal fun PlayerActivity.showV1095StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1095star
    FeaturePrefsStore.batch1091.v1095star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1095: start mode
internal fun PlayerActivity.showV1095StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1095start
    FeaturePrefsStore.batch1091.v1095start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1095: state level
internal fun PlayerActivity.showV1095StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1095state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1095state = value
        AppToast.show(this, "state: $value")
    }
}

// v1095: static level
internal fun PlayerActivity.showV1095StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1095static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1095static = value
        AppToast.show(this, "static: $value")
    }
}

// v1095: status level
internal fun PlayerActivity.showV1095StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1095status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1095status = value
        AppToast.show(this, "status: $value")
    }
}

// v1095: step level
internal fun PlayerActivity.showV1095StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1095step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1095step = value
        AppToast.show(this, "step: $value")
    }
}

// v1095: stop level
internal fun PlayerActivity.showV1095StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1095stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1095stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1095: storage mode
internal fun PlayerActivity.showV1095StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1095storage
    FeaturePrefsStore.batch1091.v1095storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1095: store mode
internal fun PlayerActivity.showV1095StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1095store
    FeaturePrefsStore.batch1091.v1095store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1095: stream mode
internal fun PlayerActivity.showV1095StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1095stream
    FeaturePrefsStore.batch1091.v1095stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1095: stretch mode
internal fun PlayerActivity.showV1095StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1095stretch
    FeaturePrefsStore.batch1091.v1095stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1095: strict mode
internal fun PlayerActivity.showV1095StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1095strict
    FeaturePrefsStore.batch1091.v1095strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1096: stack mode
internal fun PlayerActivity.showV1096StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1096stack
    FeaturePrefsStore.batch1091.v1096stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1096: stage mode
internal fun PlayerActivity.showV1096StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1096stage
    FeaturePrefsStore.batch1091.v1096stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1096: standard mode
internal fun PlayerActivity.showV1096StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1096standard
    FeaturePrefsStore.batch1091.v1096standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1096: star mode
internal fun PlayerActivity.showV1096StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1096star
    FeaturePrefsStore.batch1091.v1096star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1096: start mode
internal fun PlayerActivity.showV1096StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1096start
    FeaturePrefsStore.batch1091.v1096start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1096: state level
internal fun PlayerActivity.showV1096StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1096state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1096state = value
        AppToast.show(this, "state: $value")
    }
}

// v1096: static level
internal fun PlayerActivity.showV1096StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1096static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1096static = value
        AppToast.show(this, "static: $value")
    }
}

// v1096: status level
internal fun PlayerActivity.showV1096StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1096status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1096status = value
        AppToast.show(this, "status: $value")
    }
}

// v1096: step level
internal fun PlayerActivity.showV1096StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1096step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1096step = value
        AppToast.show(this, "step: $value")
    }
}

// v1096: stop level
internal fun PlayerActivity.showV1096StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1096stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1096stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1096: storage mode
internal fun PlayerActivity.showV1096StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1096storage
    FeaturePrefsStore.batch1091.v1096storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1096: store mode
internal fun PlayerActivity.showV1096StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1096store
    FeaturePrefsStore.batch1091.v1096store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1096: stream mode
internal fun PlayerActivity.showV1096StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1096stream
    FeaturePrefsStore.batch1091.v1096stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1096: stretch mode
internal fun PlayerActivity.showV1096StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1096stretch
    FeaturePrefsStore.batch1091.v1096stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1096: strict mode
internal fun PlayerActivity.showV1096StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1096strict
    FeaturePrefsStore.batch1091.v1096strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1097: stack mode
internal fun PlayerActivity.showV1097StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1097stack
    FeaturePrefsStore.batch1091.v1097stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1097: stage mode
internal fun PlayerActivity.showV1097StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1097stage
    FeaturePrefsStore.batch1091.v1097stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1097: standard mode
internal fun PlayerActivity.showV1097StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1097standard
    FeaturePrefsStore.batch1091.v1097standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1097: star mode
internal fun PlayerActivity.showV1097StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1097star
    FeaturePrefsStore.batch1091.v1097star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1097: start mode
internal fun PlayerActivity.showV1097StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1097start
    FeaturePrefsStore.batch1091.v1097start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1097: state level
internal fun PlayerActivity.showV1097StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1097state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1097state = value
        AppToast.show(this, "state: $value")
    }
}

// v1097: static level
internal fun PlayerActivity.showV1097StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1097static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1097static = value
        AppToast.show(this, "static: $value")
    }
}

// v1097: status level
internal fun PlayerActivity.showV1097StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1097status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1097status = value
        AppToast.show(this, "status: $value")
    }
}

// v1097: step level
internal fun PlayerActivity.showV1097StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1097step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1097step = value
        AppToast.show(this, "step: $value")
    }
}

// v1097: stop level
internal fun PlayerActivity.showV1097StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1097stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1097stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1097: storage mode
internal fun PlayerActivity.showV1097StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1097storage
    FeaturePrefsStore.batch1091.v1097storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1097: store mode
internal fun PlayerActivity.showV1097StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1097store
    FeaturePrefsStore.batch1091.v1097store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1097: stream mode
internal fun PlayerActivity.showV1097StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1097stream
    FeaturePrefsStore.batch1091.v1097stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1097: stretch mode
internal fun PlayerActivity.showV1097StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1097stretch
    FeaturePrefsStore.batch1091.v1097stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1097: strict mode
internal fun PlayerActivity.showV1097StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1097strict
    FeaturePrefsStore.batch1091.v1097strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1098: stack mode
internal fun PlayerActivity.showV1098StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1098stack
    FeaturePrefsStore.batch1091.v1098stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1098: stage mode
internal fun PlayerActivity.showV1098StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1098stage
    FeaturePrefsStore.batch1091.v1098stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1098: standard mode
internal fun PlayerActivity.showV1098StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1098standard
    FeaturePrefsStore.batch1091.v1098standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1098: star mode
internal fun PlayerActivity.showV1098StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1098star
    FeaturePrefsStore.batch1091.v1098star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1098: start mode
internal fun PlayerActivity.showV1098StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1098start
    FeaturePrefsStore.batch1091.v1098start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1098: state level
internal fun PlayerActivity.showV1098StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1098state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1098state = value
        AppToast.show(this, "state: $value")
    }
}

// v1098: static level
internal fun PlayerActivity.showV1098StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1098static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1098static = value
        AppToast.show(this, "static: $value")
    }
}

// v1098: status level
internal fun PlayerActivity.showV1098StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1098status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1098status = value
        AppToast.show(this, "status: $value")
    }
}

// v1098: step level
internal fun PlayerActivity.showV1098StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1098step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1098step = value
        AppToast.show(this, "step: $value")
    }
}

// v1098: stop level
internal fun PlayerActivity.showV1098StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1098stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1098stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1098: storage mode
internal fun PlayerActivity.showV1098StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1098storage
    FeaturePrefsStore.batch1091.v1098storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1098: store mode
internal fun PlayerActivity.showV1098StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1098store
    FeaturePrefsStore.batch1091.v1098store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1098: stream mode
internal fun PlayerActivity.showV1098StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1098stream
    FeaturePrefsStore.batch1091.v1098stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1098: stretch mode
internal fun PlayerActivity.showV1098StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1098stretch
    FeaturePrefsStore.batch1091.v1098stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1098: strict mode
internal fun PlayerActivity.showV1098StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1098strict
    FeaturePrefsStore.batch1091.v1098strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1099: stack mode
internal fun PlayerActivity.showV1099StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1099stack
    FeaturePrefsStore.batch1091.v1099stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1099: stage mode
internal fun PlayerActivity.showV1099StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1099stage
    FeaturePrefsStore.batch1091.v1099stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1099: standard mode
internal fun PlayerActivity.showV1099StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1099standard
    FeaturePrefsStore.batch1091.v1099standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1099: star mode
internal fun PlayerActivity.showV1099StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1099star
    FeaturePrefsStore.batch1091.v1099star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1099: start mode
internal fun PlayerActivity.showV1099StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1099start
    FeaturePrefsStore.batch1091.v1099start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1099: state level
internal fun PlayerActivity.showV1099StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1099state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1099state = value
        AppToast.show(this, "state: $value")
    }
}

// v1099: static level
internal fun PlayerActivity.showV1099StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1099static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1099static = value
        AppToast.show(this, "static: $value")
    }
}

// v1099: status level
internal fun PlayerActivity.showV1099StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1099status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1099status = value
        AppToast.show(this, "status: $value")
    }
}

// v1099: step level
internal fun PlayerActivity.showV1099StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1099step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1099step = value
        AppToast.show(this, "step: $value")
    }
}

// v1099: stop level
internal fun PlayerActivity.showV1099StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1099stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1099stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1099: storage mode
internal fun PlayerActivity.showV1099StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1099storage
    FeaturePrefsStore.batch1091.v1099storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1099: store mode
internal fun PlayerActivity.showV1099StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1099store
    FeaturePrefsStore.batch1091.v1099store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1099: stream mode
internal fun PlayerActivity.showV1099StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1099stream
    FeaturePrefsStore.batch1091.v1099stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1099: stretch mode
internal fun PlayerActivity.showV1099StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1099stretch
    FeaturePrefsStore.batch1091.v1099stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1099: strict mode
internal fun PlayerActivity.showV1099StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1099strict
    FeaturePrefsStore.batch1091.v1099strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

// v1100: stack mode
internal fun PlayerActivity.showV1100StackToggle() {
    val current = FeaturePrefsStore.batch1091.v1100stack
    FeaturePrefsStore.batch1091.v1100stack = !current
    AppToast.show(this, "stack: ${if (!current) "ON" else "OFF"}")
}

// v1100: stage mode
internal fun PlayerActivity.showV1100StageToggle() {
    val current = FeaturePrefsStore.batch1091.v1100stage
    FeaturePrefsStore.batch1091.v1100stage = !current
    AppToast.show(this, "stage: ${if (!current) "ON" else "OFF"}")
}

// v1100: standard mode
internal fun PlayerActivity.showV1100StandardToggle() {
    val current = FeaturePrefsStore.batch1091.v1100standard
    FeaturePrefsStore.batch1091.v1100standard = !current
    AppToast.show(this, "standard: ${if (!current) "ON" else "OFF"}")
}

// v1100: star mode
internal fun PlayerActivity.showV1100StarToggle() {
    val current = FeaturePrefsStore.batch1091.v1100star
    FeaturePrefsStore.batch1091.v1100star = !current
    AppToast.show(this, "star: ${if (!current) "ON" else "OFF"}")
}

// v1100: start mode
internal fun PlayerActivity.showV1100StartToggle() {
    val current = FeaturePrefsStore.batch1091.v1100start
    FeaturePrefsStore.batch1091.v1100start = !current
    AppToast.show(this, "start: ${if (!current) "ON" else "OFF"}")
}

// v1100: state level
internal fun PlayerActivity.showV1100StateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1100state).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "state level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1100state = value
        AppToast.show(this, "state: $value")
    }
}

// v1100: static level
internal fun PlayerActivity.showV1100StaticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1100static).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "static level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1100static = value
        AppToast.show(this, "static: $value")
    }
}

// v1100: status level
internal fun PlayerActivity.showV1100StatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1100status).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "status level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1100status = value
        AppToast.show(this, "status: $value")
    }
}

// v1100: step level
internal fun PlayerActivity.showV1100StepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1100step).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "step level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1100step = value
        AppToast.show(this, "step: $value")
    }
}

// v1100: stop level
internal fun PlayerActivity.showV1100StopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1091.v1100stop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1091.v1100stop = value
        AppToast.show(this, "stop: $value")
    }
}

// v1100: storage mode
internal fun PlayerActivity.showV1100StorageToggle() {
    val current = FeaturePrefsStore.batch1091.v1100storage
    FeaturePrefsStore.batch1091.v1100storage = !current
    AppToast.show(this, "storage: ${if (!current) "ON" else "OFF"}")
}

// v1100: store mode
internal fun PlayerActivity.showV1100StoreToggle() {
    val current = FeaturePrefsStore.batch1091.v1100store
    FeaturePrefsStore.batch1091.v1100store = !current
    AppToast.show(this, "store: ${if (!current) "ON" else "OFF"}")
}

// v1100: stream mode
internal fun PlayerActivity.showV1100StreamToggle() {
    val current = FeaturePrefsStore.batch1091.v1100stream
    FeaturePrefsStore.batch1091.v1100stream = !current
    AppToast.show(this, "stream: ${if (!current) "ON" else "OFF"}")
}

// v1100: stretch mode
internal fun PlayerActivity.showV1100StretchToggle() {
    val current = FeaturePrefsStore.batch1091.v1100stretch
    FeaturePrefsStore.batch1091.v1100stretch = !current
    AppToast.show(this, "stretch: ${if (!current) "ON" else "OFF"}")
}

// v1100: strict mode
internal fun PlayerActivity.showV1100StrictToggle() {
    val current = FeaturePrefsStore.batch1091.v1100strict
    FeaturePrefsStore.batch1091.v1100strict = !current
    AppToast.show(this, "strict: ${if (!current) "ON" else "OFF"}")
}

