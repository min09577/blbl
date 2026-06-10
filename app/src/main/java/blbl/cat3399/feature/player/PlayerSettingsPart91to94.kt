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

// v1101: string mode
internal fun PlayerActivity.showV1101StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1101string
    FeaturePrefsStore.batch1101.v1101string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1101: strip mode
internal fun PlayerActivity.showV1101StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1101strip
    FeaturePrefsStore.batch1101.v1101strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1101: stroke mode
internal fun PlayerActivity.showV1101StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1101stroke
    FeaturePrefsStore.batch1101.v1101stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1101: structure mode
internal fun PlayerActivity.showV1101StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1101structure
    FeaturePrefsStore.batch1101.v1101structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1101: style mode
internal fun PlayerActivity.showV1101StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1101style
    FeaturePrefsStore.batch1101.v1101style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1101: sub level
internal fun PlayerActivity.showV1101SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1101: submit level
internal fun PlayerActivity.showV1101SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1101: subscribe level
internal fun PlayerActivity.showV1101SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1101: success level
internal fun PlayerActivity.showV1101SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101success = value
        AppToast.show(this, "success: $value")
    }
}

// v1101: suffix level
internal fun PlayerActivity.showV1101SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1101: sum mode
internal fun PlayerActivity.showV1101SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1101sum
    FeaturePrefsStore.batch1101.v1101sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1101: summary mode
internal fun PlayerActivity.showV1101SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1101summary
    FeaturePrefsStore.batch1101.v1101summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1101: support mode
internal fun PlayerActivity.showV1101SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1101support
    FeaturePrefsStore.batch1101.v1101support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1101: swap mode
internal fun PlayerActivity.showV1101SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1101swap
    FeaturePrefsStore.batch1101.v1101swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1101: switch mode
internal fun PlayerActivity.showV1101SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1101switch
    FeaturePrefsStore.batch1101.v1101switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1102: string mode
internal fun PlayerActivity.showV1102StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1102string
    FeaturePrefsStore.batch1101.v1102string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1102: strip mode
internal fun PlayerActivity.showV1102StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1102strip
    FeaturePrefsStore.batch1101.v1102strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1102: stroke mode
internal fun PlayerActivity.showV1102StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1102stroke
    FeaturePrefsStore.batch1101.v1102stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1102: structure mode
internal fun PlayerActivity.showV1102StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1102structure
    FeaturePrefsStore.batch1101.v1102structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1102: style mode
internal fun PlayerActivity.showV1102StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1102style
    FeaturePrefsStore.batch1101.v1102style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1102: sub level
internal fun PlayerActivity.showV1102SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1102: submit level
internal fun PlayerActivity.showV1102SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1102: subscribe level
internal fun PlayerActivity.showV1102SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1102: success level
internal fun PlayerActivity.showV1102SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102success = value
        AppToast.show(this, "success: $value")
    }
}

// v1102: suffix level
internal fun PlayerActivity.showV1102SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1102: sum mode
internal fun PlayerActivity.showV1102SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1102sum
    FeaturePrefsStore.batch1101.v1102sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1102: summary mode
internal fun PlayerActivity.showV1102SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1102summary
    FeaturePrefsStore.batch1101.v1102summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1102: support mode
internal fun PlayerActivity.showV1102SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1102support
    FeaturePrefsStore.batch1101.v1102support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1102: swap mode
internal fun PlayerActivity.showV1102SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1102swap
    FeaturePrefsStore.batch1101.v1102swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1102: switch mode
internal fun PlayerActivity.showV1102SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1102switch
    FeaturePrefsStore.batch1101.v1102switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1103: string mode
internal fun PlayerActivity.showV1103StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1103string
    FeaturePrefsStore.batch1101.v1103string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1103: strip mode
internal fun PlayerActivity.showV1103StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1103strip
    FeaturePrefsStore.batch1101.v1103strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1103: stroke mode
internal fun PlayerActivity.showV1103StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1103stroke
    FeaturePrefsStore.batch1101.v1103stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1103: structure mode
internal fun PlayerActivity.showV1103StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1103structure
    FeaturePrefsStore.batch1101.v1103structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1103: style mode
internal fun PlayerActivity.showV1103StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1103style
    FeaturePrefsStore.batch1101.v1103style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1103: sub level
internal fun PlayerActivity.showV1103SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1103: submit level
internal fun PlayerActivity.showV1103SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1103: subscribe level
internal fun PlayerActivity.showV1103SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1103: success level
internal fun PlayerActivity.showV1103SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103success = value
        AppToast.show(this, "success: $value")
    }
}

// v1103: suffix level
internal fun PlayerActivity.showV1103SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1103: sum mode
internal fun PlayerActivity.showV1103SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1103sum
    FeaturePrefsStore.batch1101.v1103sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1103: summary mode
internal fun PlayerActivity.showV1103SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1103summary
    FeaturePrefsStore.batch1101.v1103summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1103: support mode
internal fun PlayerActivity.showV1103SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1103support
    FeaturePrefsStore.batch1101.v1103support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1103: swap mode
internal fun PlayerActivity.showV1103SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1103swap
    FeaturePrefsStore.batch1101.v1103swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1103: switch mode
internal fun PlayerActivity.showV1103SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1103switch
    FeaturePrefsStore.batch1101.v1103switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1104: string mode
internal fun PlayerActivity.showV1104StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1104string
    FeaturePrefsStore.batch1101.v1104string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1104: strip mode
internal fun PlayerActivity.showV1104StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1104strip
    FeaturePrefsStore.batch1101.v1104strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1104: stroke mode
internal fun PlayerActivity.showV1104StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1104stroke
    FeaturePrefsStore.batch1101.v1104stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1104: structure mode
internal fun PlayerActivity.showV1104StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1104structure
    FeaturePrefsStore.batch1101.v1104structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1104: style mode
internal fun PlayerActivity.showV1104StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1104style
    FeaturePrefsStore.batch1101.v1104style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1104: sub level
internal fun PlayerActivity.showV1104SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1104: submit level
internal fun PlayerActivity.showV1104SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1104: subscribe level
internal fun PlayerActivity.showV1104SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1104: success level
internal fun PlayerActivity.showV1104SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104success = value
        AppToast.show(this, "success: $value")
    }
}

// v1104: suffix level
internal fun PlayerActivity.showV1104SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1104: sum mode
internal fun PlayerActivity.showV1104SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1104sum
    FeaturePrefsStore.batch1101.v1104sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1104: summary mode
internal fun PlayerActivity.showV1104SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1104summary
    FeaturePrefsStore.batch1101.v1104summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1104: support mode
internal fun PlayerActivity.showV1104SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1104support
    FeaturePrefsStore.batch1101.v1104support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1104: swap mode
internal fun PlayerActivity.showV1104SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1104swap
    FeaturePrefsStore.batch1101.v1104swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1104: switch mode
internal fun PlayerActivity.showV1104SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1104switch
    FeaturePrefsStore.batch1101.v1104switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1105: string mode
internal fun PlayerActivity.showV1105StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1105string
    FeaturePrefsStore.batch1101.v1105string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1105: strip mode
internal fun PlayerActivity.showV1105StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1105strip
    FeaturePrefsStore.batch1101.v1105strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1105: stroke mode
internal fun PlayerActivity.showV1105StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1105stroke
    FeaturePrefsStore.batch1101.v1105stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1105: structure mode
internal fun PlayerActivity.showV1105StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1105structure
    FeaturePrefsStore.batch1101.v1105structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1105: style mode
internal fun PlayerActivity.showV1105StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1105style
    FeaturePrefsStore.batch1101.v1105style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1105: sub level
internal fun PlayerActivity.showV1105SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1105: submit level
internal fun PlayerActivity.showV1105SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1105: subscribe level
internal fun PlayerActivity.showV1105SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1105: success level
internal fun PlayerActivity.showV1105SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105success = value
        AppToast.show(this, "success: $value")
    }
}

// v1105: suffix level
internal fun PlayerActivity.showV1105SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1105: sum mode
internal fun PlayerActivity.showV1105SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1105sum
    FeaturePrefsStore.batch1101.v1105sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1105: summary mode
internal fun PlayerActivity.showV1105SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1105summary
    FeaturePrefsStore.batch1101.v1105summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1105: support mode
internal fun PlayerActivity.showV1105SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1105support
    FeaturePrefsStore.batch1101.v1105support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1105: swap mode
internal fun PlayerActivity.showV1105SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1105swap
    FeaturePrefsStore.batch1101.v1105swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1105: switch mode
internal fun PlayerActivity.showV1105SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1105switch
    FeaturePrefsStore.batch1101.v1105switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1106: string mode
internal fun PlayerActivity.showV1106StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1106string
    FeaturePrefsStore.batch1101.v1106string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1106: strip mode
internal fun PlayerActivity.showV1106StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1106strip
    FeaturePrefsStore.batch1101.v1106strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1106: stroke mode
internal fun PlayerActivity.showV1106StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1106stroke
    FeaturePrefsStore.batch1101.v1106stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1106: structure mode
internal fun PlayerActivity.showV1106StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1106structure
    FeaturePrefsStore.batch1101.v1106structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1106: style mode
internal fun PlayerActivity.showV1106StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1106style
    FeaturePrefsStore.batch1101.v1106style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1106: sub level
internal fun PlayerActivity.showV1106SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1106: submit level
internal fun PlayerActivity.showV1106SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1106: subscribe level
internal fun PlayerActivity.showV1106SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1106: success level
internal fun PlayerActivity.showV1106SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106success = value
        AppToast.show(this, "success: $value")
    }
}

// v1106: suffix level
internal fun PlayerActivity.showV1106SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1106: sum mode
internal fun PlayerActivity.showV1106SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1106sum
    FeaturePrefsStore.batch1101.v1106sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1106: summary mode
internal fun PlayerActivity.showV1106SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1106summary
    FeaturePrefsStore.batch1101.v1106summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1106: support mode
internal fun PlayerActivity.showV1106SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1106support
    FeaturePrefsStore.batch1101.v1106support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1106: swap mode
internal fun PlayerActivity.showV1106SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1106swap
    FeaturePrefsStore.batch1101.v1106swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1106: switch mode
internal fun PlayerActivity.showV1106SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1106switch
    FeaturePrefsStore.batch1101.v1106switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1107: string mode
internal fun PlayerActivity.showV1107StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1107string
    FeaturePrefsStore.batch1101.v1107string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1107: strip mode
internal fun PlayerActivity.showV1107StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1107strip
    FeaturePrefsStore.batch1101.v1107strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1107: stroke mode
internal fun PlayerActivity.showV1107StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1107stroke
    FeaturePrefsStore.batch1101.v1107stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1107: structure mode
internal fun PlayerActivity.showV1107StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1107structure
    FeaturePrefsStore.batch1101.v1107structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1107: style mode
internal fun PlayerActivity.showV1107StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1107style
    FeaturePrefsStore.batch1101.v1107style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1107: sub level
internal fun PlayerActivity.showV1107SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1107: submit level
internal fun PlayerActivity.showV1107SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1107: subscribe level
internal fun PlayerActivity.showV1107SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1107: success level
internal fun PlayerActivity.showV1107SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107success = value
        AppToast.show(this, "success: $value")
    }
}

// v1107: suffix level
internal fun PlayerActivity.showV1107SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1107: sum mode
internal fun PlayerActivity.showV1107SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1107sum
    FeaturePrefsStore.batch1101.v1107sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1107: summary mode
internal fun PlayerActivity.showV1107SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1107summary
    FeaturePrefsStore.batch1101.v1107summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1107: support mode
internal fun PlayerActivity.showV1107SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1107support
    FeaturePrefsStore.batch1101.v1107support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1107: swap mode
internal fun PlayerActivity.showV1107SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1107swap
    FeaturePrefsStore.batch1101.v1107swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1107: switch mode
internal fun PlayerActivity.showV1107SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1107switch
    FeaturePrefsStore.batch1101.v1107switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1108: string mode
internal fun PlayerActivity.showV1108StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1108string
    FeaturePrefsStore.batch1101.v1108string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1108: strip mode
internal fun PlayerActivity.showV1108StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1108strip
    FeaturePrefsStore.batch1101.v1108strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1108: stroke mode
internal fun PlayerActivity.showV1108StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1108stroke
    FeaturePrefsStore.batch1101.v1108stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1108: structure mode
internal fun PlayerActivity.showV1108StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1108structure
    FeaturePrefsStore.batch1101.v1108structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1108: style mode
internal fun PlayerActivity.showV1108StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1108style
    FeaturePrefsStore.batch1101.v1108style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1108: sub level
internal fun PlayerActivity.showV1108SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1108: submit level
internal fun PlayerActivity.showV1108SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1108: subscribe level
internal fun PlayerActivity.showV1108SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1108: success level
internal fun PlayerActivity.showV1108SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108success = value
        AppToast.show(this, "success: $value")
    }
}

// v1108: suffix level
internal fun PlayerActivity.showV1108SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1108: sum mode
internal fun PlayerActivity.showV1108SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1108sum
    FeaturePrefsStore.batch1101.v1108sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1108: summary mode
internal fun PlayerActivity.showV1108SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1108summary
    FeaturePrefsStore.batch1101.v1108summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1108: support mode
internal fun PlayerActivity.showV1108SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1108support
    FeaturePrefsStore.batch1101.v1108support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1108: swap mode
internal fun PlayerActivity.showV1108SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1108swap
    FeaturePrefsStore.batch1101.v1108swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1108: switch mode
internal fun PlayerActivity.showV1108SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1108switch
    FeaturePrefsStore.batch1101.v1108switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1109: string mode
internal fun PlayerActivity.showV1109StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1109string
    FeaturePrefsStore.batch1101.v1109string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1109: strip mode
internal fun PlayerActivity.showV1109StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1109strip
    FeaturePrefsStore.batch1101.v1109strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1109: stroke mode
internal fun PlayerActivity.showV1109StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1109stroke
    FeaturePrefsStore.batch1101.v1109stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1109: structure mode
internal fun PlayerActivity.showV1109StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1109structure
    FeaturePrefsStore.batch1101.v1109structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1109: style mode
internal fun PlayerActivity.showV1109StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1109style
    FeaturePrefsStore.batch1101.v1109style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1109: sub level
internal fun PlayerActivity.showV1109SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1109: submit level
internal fun PlayerActivity.showV1109SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1109: subscribe level
internal fun PlayerActivity.showV1109SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1109: success level
internal fun PlayerActivity.showV1109SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109success = value
        AppToast.show(this, "success: $value")
    }
}

// v1109: suffix level
internal fun PlayerActivity.showV1109SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1109: sum mode
internal fun PlayerActivity.showV1109SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1109sum
    FeaturePrefsStore.batch1101.v1109sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1109: summary mode
internal fun PlayerActivity.showV1109SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1109summary
    FeaturePrefsStore.batch1101.v1109summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1109: support mode
internal fun PlayerActivity.showV1109SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1109support
    FeaturePrefsStore.batch1101.v1109support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1109: swap mode
internal fun PlayerActivity.showV1109SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1109swap
    FeaturePrefsStore.batch1101.v1109swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1109: switch mode
internal fun PlayerActivity.showV1109SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1109switch
    FeaturePrefsStore.batch1101.v1109switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1110: string mode
internal fun PlayerActivity.showV1110StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1110string
    FeaturePrefsStore.batch1101.v1110string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1110: strip mode
internal fun PlayerActivity.showV1110StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1110strip
    FeaturePrefsStore.batch1101.v1110strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1110: stroke mode
internal fun PlayerActivity.showV1110StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1110stroke
    FeaturePrefsStore.batch1101.v1110stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1110: structure mode
internal fun PlayerActivity.showV1110StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1110structure
    FeaturePrefsStore.batch1101.v1110structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1110: style mode
internal fun PlayerActivity.showV1110StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1110style
    FeaturePrefsStore.batch1101.v1110style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1110: sub level
internal fun PlayerActivity.showV1110SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1110: submit level
internal fun PlayerActivity.showV1110SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1110: subscribe level
internal fun PlayerActivity.showV1110SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1110: success level
internal fun PlayerActivity.showV1110SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110success = value
        AppToast.show(this, "success: $value")
    }
}

// v1110: suffix level
internal fun PlayerActivity.showV1110SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1110: sum mode
internal fun PlayerActivity.showV1110SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1110sum
    FeaturePrefsStore.batch1101.v1110sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1110: summary mode
internal fun PlayerActivity.showV1110SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1110summary
    FeaturePrefsStore.batch1101.v1110summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1110: support mode
internal fun PlayerActivity.showV1110SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1110support
    FeaturePrefsStore.batch1101.v1110support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1110: swap mode
internal fun PlayerActivity.showV1110SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1110swap
    FeaturePrefsStore.batch1101.v1110swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1110: switch mode
internal fun PlayerActivity.showV1110SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1110switch
    FeaturePrefsStore.batch1101.v1110switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

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

// v1121: tick mode
internal fun PlayerActivity.showV1121TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1121tick
    FeaturePrefsStore.batch1121.v1121tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1121: tile mode
internal fun PlayerActivity.showV1121TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1121tile
    FeaturePrefsStore.batch1121.v1121tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1121: time mode
internal fun PlayerActivity.showV1121TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1121time
    FeaturePrefsStore.batch1121.v1121time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1121: timeout mode
internal fun PlayerActivity.showV1121TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1121timeout
    FeaturePrefsStore.batch1121.v1121timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1121: timer mode
internal fun PlayerActivity.showV1121TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1121timer
    FeaturePrefsStore.batch1121.v1121timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1121: tip level
internal fun PlayerActivity.showV1121TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1121: title level
internal fun PlayerActivity.showV1121TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121title = value
        AppToast.show(this, "title: $value")
    }
}

// v1121: toggle level
internal fun PlayerActivity.showV1121ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1121: token level
internal fun PlayerActivity.showV1121TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121token = value
        AppToast.show(this, "token: $value")
    }
}

// v1121: tool level
internal fun PlayerActivity.showV1121ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1121: top mode
internal fun PlayerActivity.showV1121TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1121top
    FeaturePrefsStore.batch1121.v1121top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1121: total mode
internal fun PlayerActivity.showV1121TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1121total
    FeaturePrefsStore.batch1121.v1121total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1121: touch mode
internal fun PlayerActivity.showV1121TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1121touch
    FeaturePrefsStore.batch1121.v1121touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1121: trace mode
internal fun PlayerActivity.showV1121TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1121trace
    FeaturePrefsStore.batch1121.v1121trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1121: track mode
internal fun PlayerActivity.showV1121TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1121track
    FeaturePrefsStore.batch1121.v1121track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1122: tick mode
internal fun PlayerActivity.showV1122TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1122tick
    FeaturePrefsStore.batch1121.v1122tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1122: tile mode
internal fun PlayerActivity.showV1122TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1122tile
    FeaturePrefsStore.batch1121.v1122tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1122: time mode
internal fun PlayerActivity.showV1122TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1122time
    FeaturePrefsStore.batch1121.v1122time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1122: timeout mode
internal fun PlayerActivity.showV1122TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1122timeout
    FeaturePrefsStore.batch1121.v1122timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1122: timer mode
internal fun PlayerActivity.showV1122TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1122timer
    FeaturePrefsStore.batch1121.v1122timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1122: tip level
internal fun PlayerActivity.showV1122TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1122: title level
internal fun PlayerActivity.showV1122TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122title = value
        AppToast.show(this, "title: $value")
    }
}

// v1122: toggle level
internal fun PlayerActivity.showV1122ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1122: token level
internal fun PlayerActivity.showV1122TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122token = value
        AppToast.show(this, "token: $value")
    }
}

// v1122: tool level
internal fun PlayerActivity.showV1122ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1122: top mode
internal fun PlayerActivity.showV1122TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1122top
    FeaturePrefsStore.batch1121.v1122top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1122: total mode
internal fun PlayerActivity.showV1122TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1122total
    FeaturePrefsStore.batch1121.v1122total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1122: touch mode
internal fun PlayerActivity.showV1122TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1122touch
    FeaturePrefsStore.batch1121.v1122touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1122: trace mode
internal fun PlayerActivity.showV1122TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1122trace
    FeaturePrefsStore.batch1121.v1122trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1122: track mode
internal fun PlayerActivity.showV1122TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1122track
    FeaturePrefsStore.batch1121.v1122track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1123: tick mode
internal fun PlayerActivity.showV1123TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1123tick
    FeaturePrefsStore.batch1121.v1123tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1123: tile mode
internal fun PlayerActivity.showV1123TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1123tile
    FeaturePrefsStore.batch1121.v1123tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1123: time mode
internal fun PlayerActivity.showV1123TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1123time
    FeaturePrefsStore.batch1121.v1123time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1123: timeout mode
internal fun PlayerActivity.showV1123TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1123timeout
    FeaturePrefsStore.batch1121.v1123timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1123: timer mode
internal fun PlayerActivity.showV1123TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1123timer
    FeaturePrefsStore.batch1121.v1123timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1123: tip level
internal fun PlayerActivity.showV1123TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1123: title level
internal fun PlayerActivity.showV1123TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123title = value
        AppToast.show(this, "title: $value")
    }
}

// v1123: toggle level
internal fun PlayerActivity.showV1123ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1123: token level
internal fun PlayerActivity.showV1123TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123token = value
        AppToast.show(this, "token: $value")
    }
}

// v1123: tool level
internal fun PlayerActivity.showV1123ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1123: top mode
internal fun PlayerActivity.showV1123TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1123top
    FeaturePrefsStore.batch1121.v1123top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1123: total mode
internal fun PlayerActivity.showV1123TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1123total
    FeaturePrefsStore.batch1121.v1123total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1123: touch mode
internal fun PlayerActivity.showV1123TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1123touch
    FeaturePrefsStore.batch1121.v1123touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1123: trace mode
internal fun PlayerActivity.showV1123TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1123trace
    FeaturePrefsStore.batch1121.v1123trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1123: track mode
internal fun PlayerActivity.showV1123TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1123track
    FeaturePrefsStore.batch1121.v1123track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1124: tick mode
internal fun PlayerActivity.showV1124TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1124tick
    FeaturePrefsStore.batch1121.v1124tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1124: tile mode
internal fun PlayerActivity.showV1124TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1124tile
    FeaturePrefsStore.batch1121.v1124tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1124: time mode
internal fun PlayerActivity.showV1124TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1124time
    FeaturePrefsStore.batch1121.v1124time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1124: timeout mode
internal fun PlayerActivity.showV1124TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1124timeout
    FeaturePrefsStore.batch1121.v1124timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1124: timer mode
internal fun PlayerActivity.showV1124TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1124timer
    FeaturePrefsStore.batch1121.v1124timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1124: tip level
internal fun PlayerActivity.showV1124TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1124: title level
internal fun PlayerActivity.showV1124TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124title = value
        AppToast.show(this, "title: $value")
    }
}

// v1124: toggle level
internal fun PlayerActivity.showV1124ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1124: token level
internal fun PlayerActivity.showV1124TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124token = value
        AppToast.show(this, "token: $value")
    }
}

// v1124: tool level
internal fun PlayerActivity.showV1124ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1124: top mode
internal fun PlayerActivity.showV1124TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1124top
    FeaturePrefsStore.batch1121.v1124top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1124: total mode
internal fun PlayerActivity.showV1124TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1124total
    FeaturePrefsStore.batch1121.v1124total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1124: touch mode
internal fun PlayerActivity.showV1124TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1124touch
    FeaturePrefsStore.batch1121.v1124touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1124: trace mode
internal fun PlayerActivity.showV1124TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1124trace
    FeaturePrefsStore.batch1121.v1124trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1124: track mode
internal fun PlayerActivity.showV1124TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1124track
    FeaturePrefsStore.batch1121.v1124track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1125: tick mode
internal fun PlayerActivity.showV1125TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1125tick
    FeaturePrefsStore.batch1121.v1125tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1125: tile mode
internal fun PlayerActivity.showV1125TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1125tile
    FeaturePrefsStore.batch1121.v1125tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1125: time mode
internal fun PlayerActivity.showV1125TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1125time
    FeaturePrefsStore.batch1121.v1125time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1125: timeout mode
internal fun PlayerActivity.showV1125TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1125timeout
    FeaturePrefsStore.batch1121.v1125timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1125: timer mode
internal fun PlayerActivity.showV1125TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1125timer
    FeaturePrefsStore.batch1121.v1125timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1125: tip level
internal fun PlayerActivity.showV1125TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1125: title level
internal fun PlayerActivity.showV1125TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125title = value
        AppToast.show(this, "title: $value")
    }
}

// v1125: toggle level
internal fun PlayerActivity.showV1125ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1125: token level
internal fun PlayerActivity.showV1125TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125token = value
        AppToast.show(this, "token: $value")
    }
}

// v1125: tool level
internal fun PlayerActivity.showV1125ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1125: top mode
internal fun PlayerActivity.showV1125TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1125top
    FeaturePrefsStore.batch1121.v1125top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1125: total mode
internal fun PlayerActivity.showV1125TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1125total
    FeaturePrefsStore.batch1121.v1125total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1125: touch mode
internal fun PlayerActivity.showV1125TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1125touch
    FeaturePrefsStore.batch1121.v1125touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1125: trace mode
internal fun PlayerActivity.showV1125TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1125trace
    FeaturePrefsStore.batch1121.v1125trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1125: track mode
internal fun PlayerActivity.showV1125TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1125track
    FeaturePrefsStore.batch1121.v1125track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1126: tick mode
internal fun PlayerActivity.showV1126TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1126tick
    FeaturePrefsStore.batch1121.v1126tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1126: tile mode
internal fun PlayerActivity.showV1126TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1126tile
    FeaturePrefsStore.batch1121.v1126tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1126: time mode
internal fun PlayerActivity.showV1126TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1126time
    FeaturePrefsStore.batch1121.v1126time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1126: timeout mode
internal fun PlayerActivity.showV1126TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1126timeout
    FeaturePrefsStore.batch1121.v1126timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1126: timer mode
internal fun PlayerActivity.showV1126TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1126timer
    FeaturePrefsStore.batch1121.v1126timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1126: tip level
internal fun PlayerActivity.showV1126TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1126: title level
internal fun PlayerActivity.showV1126TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126title = value
        AppToast.show(this, "title: $value")
    }
}

// v1126: toggle level
internal fun PlayerActivity.showV1126ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1126: token level
internal fun PlayerActivity.showV1126TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126token = value
        AppToast.show(this, "token: $value")
    }
}

// v1126: tool level
internal fun PlayerActivity.showV1126ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1126: top mode
internal fun PlayerActivity.showV1126TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1126top
    FeaturePrefsStore.batch1121.v1126top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1126: total mode
internal fun PlayerActivity.showV1126TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1126total
    FeaturePrefsStore.batch1121.v1126total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1126: touch mode
internal fun PlayerActivity.showV1126TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1126touch
    FeaturePrefsStore.batch1121.v1126touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1126: trace mode
internal fun PlayerActivity.showV1126TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1126trace
    FeaturePrefsStore.batch1121.v1126trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1126: track mode
internal fun PlayerActivity.showV1126TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1126track
    FeaturePrefsStore.batch1121.v1126track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1127: tick mode
internal fun PlayerActivity.showV1127TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1127tick
    FeaturePrefsStore.batch1121.v1127tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1127: tile mode
internal fun PlayerActivity.showV1127TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1127tile
    FeaturePrefsStore.batch1121.v1127tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1127: time mode
internal fun PlayerActivity.showV1127TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1127time
    FeaturePrefsStore.batch1121.v1127time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1127: timeout mode
internal fun PlayerActivity.showV1127TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1127timeout
    FeaturePrefsStore.batch1121.v1127timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1127: timer mode
internal fun PlayerActivity.showV1127TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1127timer
    FeaturePrefsStore.batch1121.v1127timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1127: tip level
internal fun PlayerActivity.showV1127TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1127: title level
internal fun PlayerActivity.showV1127TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127title = value
        AppToast.show(this, "title: $value")
    }
}

// v1127: toggle level
internal fun PlayerActivity.showV1127ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1127: token level
internal fun PlayerActivity.showV1127TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127token = value
        AppToast.show(this, "token: $value")
    }
}

// v1127: tool level
internal fun PlayerActivity.showV1127ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1127: top mode
internal fun PlayerActivity.showV1127TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1127top
    FeaturePrefsStore.batch1121.v1127top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1127: total mode
internal fun PlayerActivity.showV1127TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1127total
    FeaturePrefsStore.batch1121.v1127total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1127: touch mode
internal fun PlayerActivity.showV1127TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1127touch
    FeaturePrefsStore.batch1121.v1127touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1127: trace mode
internal fun PlayerActivity.showV1127TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1127trace
    FeaturePrefsStore.batch1121.v1127trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1127: track mode
internal fun PlayerActivity.showV1127TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1127track
    FeaturePrefsStore.batch1121.v1127track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1128: tick mode
internal fun PlayerActivity.showV1128TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1128tick
    FeaturePrefsStore.batch1121.v1128tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1128: tile mode
internal fun PlayerActivity.showV1128TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1128tile
    FeaturePrefsStore.batch1121.v1128tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1128: time mode
internal fun PlayerActivity.showV1128TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1128time
    FeaturePrefsStore.batch1121.v1128time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1128: timeout mode
internal fun PlayerActivity.showV1128TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1128timeout
    FeaturePrefsStore.batch1121.v1128timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1128: timer mode
internal fun PlayerActivity.showV1128TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1128timer
    FeaturePrefsStore.batch1121.v1128timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1128: tip level
internal fun PlayerActivity.showV1128TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1128: title level
internal fun PlayerActivity.showV1128TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128title = value
        AppToast.show(this, "title: $value")
    }
}

// v1128: toggle level
internal fun PlayerActivity.showV1128ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1128: token level
internal fun PlayerActivity.showV1128TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128token = value
        AppToast.show(this, "token: $value")
    }
}

// v1128: tool level
internal fun PlayerActivity.showV1128ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1128: top mode
internal fun PlayerActivity.showV1128TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1128top
    FeaturePrefsStore.batch1121.v1128top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1128: total mode
internal fun PlayerActivity.showV1128TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1128total
    FeaturePrefsStore.batch1121.v1128total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1128: touch mode
internal fun PlayerActivity.showV1128TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1128touch
    FeaturePrefsStore.batch1121.v1128touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1128: trace mode
internal fun PlayerActivity.showV1128TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1128trace
    FeaturePrefsStore.batch1121.v1128trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1128: track mode
internal fun PlayerActivity.showV1128TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1128track
    FeaturePrefsStore.batch1121.v1128track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1129: tick mode
internal fun PlayerActivity.showV1129TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1129tick
    FeaturePrefsStore.batch1121.v1129tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1129: tile mode
internal fun PlayerActivity.showV1129TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1129tile
    FeaturePrefsStore.batch1121.v1129tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1129: time mode
internal fun PlayerActivity.showV1129TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1129time
    FeaturePrefsStore.batch1121.v1129time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1129: timeout mode
internal fun PlayerActivity.showV1129TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1129timeout
    FeaturePrefsStore.batch1121.v1129timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1129: timer mode
internal fun PlayerActivity.showV1129TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1129timer
    FeaturePrefsStore.batch1121.v1129timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1129: tip level
internal fun PlayerActivity.showV1129TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1129: title level
internal fun PlayerActivity.showV1129TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129title = value
        AppToast.show(this, "title: $value")
    }
}

// v1129: toggle level
internal fun PlayerActivity.showV1129ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1129: token level
internal fun PlayerActivity.showV1129TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129token = value
        AppToast.show(this, "token: $value")
    }
}

// v1129: tool level
internal fun PlayerActivity.showV1129ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1129: top mode
internal fun PlayerActivity.showV1129TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1129top
    FeaturePrefsStore.batch1121.v1129top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1129: total mode
internal fun PlayerActivity.showV1129TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1129total
    FeaturePrefsStore.batch1121.v1129total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1129: touch mode
internal fun PlayerActivity.showV1129TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1129touch
    FeaturePrefsStore.batch1121.v1129touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1129: trace mode
internal fun PlayerActivity.showV1129TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1129trace
    FeaturePrefsStore.batch1121.v1129trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1129: track mode
internal fun PlayerActivity.showV1129TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1129track
    FeaturePrefsStore.batch1121.v1129track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1130: tick mode
internal fun PlayerActivity.showV1130TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1130tick
    FeaturePrefsStore.batch1121.v1130tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1130: tile mode
internal fun PlayerActivity.showV1130TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1130tile
    FeaturePrefsStore.batch1121.v1130tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1130: time mode
internal fun PlayerActivity.showV1130TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1130time
    FeaturePrefsStore.batch1121.v1130time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1130: timeout mode
internal fun PlayerActivity.showV1130TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1130timeout
    FeaturePrefsStore.batch1121.v1130timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1130: timer mode
internal fun PlayerActivity.showV1130TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1130timer
    FeaturePrefsStore.batch1121.v1130timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1130: tip level
internal fun PlayerActivity.showV1130TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1130: title level
internal fun PlayerActivity.showV1130TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130title = value
        AppToast.show(this, "title: $value")
    }
}

// v1130: toggle level
internal fun PlayerActivity.showV1130ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1130: token level
internal fun PlayerActivity.showV1130TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130token = value
        AppToast.show(this, "token: $value")
    }
}

// v1130: tool level
internal fun PlayerActivity.showV1130ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1130: top mode
internal fun PlayerActivity.showV1130TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1130top
    FeaturePrefsStore.batch1121.v1130top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1130: total mode
internal fun PlayerActivity.showV1130TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1130total
    FeaturePrefsStore.batch1121.v1130total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1130: touch mode
internal fun PlayerActivity.showV1130TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1130touch
    FeaturePrefsStore.batch1121.v1130touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1130: trace mode
internal fun PlayerActivity.showV1130TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1130trace
    FeaturePrefsStore.batch1121.v1130trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1130: track mode
internal fun PlayerActivity.showV1130TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1130track
    FeaturePrefsStore.batch1121.v1130track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}
