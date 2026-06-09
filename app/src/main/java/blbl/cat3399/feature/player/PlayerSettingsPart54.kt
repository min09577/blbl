package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v731: cancel mode
internal fun PlayerActivity.showV731CancelToggle() {
    val current = FeaturePrefsStore.batch731.v731cancel
    FeaturePrefsStore.batch731.v731cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v731: capture mode
internal fun PlayerActivity.showV731CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v731capture
    FeaturePrefsStore.batch731.v731capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v731: cascade mode
internal fun PlayerActivity.showV731CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v731cascade
    FeaturePrefsStore.batch731.v731cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v731: category mode
internal fun PlayerActivity.showV731CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v731category
    FeaturePrefsStore.batch731.v731category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v731: chain mode
internal fun PlayerActivity.showV731ChainToggle() {
    val current = FeaturePrefsStore.batch731.v731chain
    FeaturePrefsStore.batch731.v731chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v731: challenge level
internal fun PlayerActivity.showV731ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v731: channel level
internal fun PlayerActivity.showV731ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v731: chart level
internal fun PlayerActivity.showV731ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v731: checkpoint level
internal fun PlayerActivity.showV731CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v731: chunk level
internal fun PlayerActivity.showV731ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v731: cipher mode
internal fun PlayerActivity.showV731CipherToggle() {
    val current = FeaturePrefsStore.batch731.v731cipher
    FeaturePrefsStore.batch731.v731cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v731: clamp mode
internal fun PlayerActivity.showV731ClampToggle() {
    val current = FeaturePrefsStore.batch731.v731clamp
    FeaturePrefsStore.batch731.v731clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v731: classify mode
internal fun PlayerActivity.showV731ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v731classify
    FeaturePrefsStore.batch731.v731classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v731: clean mode
internal fun PlayerActivity.showV731CleanToggle() {
    val current = FeaturePrefsStore.batch731.v731clean
    FeaturePrefsStore.batch731.v731clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v731: clear mode
internal fun PlayerActivity.showV731ClearToggle() {
    val current = FeaturePrefsStore.batch731.v731clear
    FeaturePrefsStore.batch731.v731clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v732: cancel mode
internal fun PlayerActivity.showV732CancelToggle() {
    val current = FeaturePrefsStore.batch731.v732cancel
    FeaturePrefsStore.batch731.v732cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v732: capture mode
internal fun PlayerActivity.showV732CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v732capture
    FeaturePrefsStore.batch731.v732capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v732: cascade mode
internal fun PlayerActivity.showV732CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v732cascade
    FeaturePrefsStore.batch731.v732cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v732: category mode
internal fun PlayerActivity.showV732CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v732category
    FeaturePrefsStore.batch731.v732category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v732: chain mode
internal fun PlayerActivity.showV732ChainToggle() {
    val current = FeaturePrefsStore.batch731.v732chain
    FeaturePrefsStore.batch731.v732chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v732: challenge level
internal fun PlayerActivity.showV732ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v732: channel level
internal fun PlayerActivity.showV732ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v732: chart level
internal fun PlayerActivity.showV732ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v732: checkpoint level
internal fun PlayerActivity.showV732CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v732: chunk level
internal fun PlayerActivity.showV732ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v732: cipher mode
internal fun PlayerActivity.showV732CipherToggle() {
    val current = FeaturePrefsStore.batch731.v732cipher
    FeaturePrefsStore.batch731.v732cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v732: clamp mode
internal fun PlayerActivity.showV732ClampToggle() {
    val current = FeaturePrefsStore.batch731.v732clamp
    FeaturePrefsStore.batch731.v732clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v732: classify mode
internal fun PlayerActivity.showV732ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v732classify
    FeaturePrefsStore.batch731.v732classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v732: clean mode
internal fun PlayerActivity.showV732CleanToggle() {
    val current = FeaturePrefsStore.batch731.v732clean
    FeaturePrefsStore.batch731.v732clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v732: clear mode
internal fun PlayerActivity.showV732ClearToggle() {
    val current = FeaturePrefsStore.batch731.v732clear
    FeaturePrefsStore.batch731.v732clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v733: cancel mode
internal fun PlayerActivity.showV733CancelToggle() {
    val current = FeaturePrefsStore.batch731.v733cancel
    FeaturePrefsStore.batch731.v733cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v733: capture mode
internal fun PlayerActivity.showV733CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v733capture
    FeaturePrefsStore.batch731.v733capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v733: cascade mode
internal fun PlayerActivity.showV733CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v733cascade
    FeaturePrefsStore.batch731.v733cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v733: category mode
internal fun PlayerActivity.showV733CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v733category
    FeaturePrefsStore.batch731.v733category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v733: chain mode
internal fun PlayerActivity.showV733ChainToggle() {
    val current = FeaturePrefsStore.batch731.v733chain
    FeaturePrefsStore.batch731.v733chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v733: challenge level
internal fun PlayerActivity.showV733ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v733: channel level
internal fun PlayerActivity.showV733ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v733: chart level
internal fun PlayerActivity.showV733ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v733: checkpoint level
internal fun PlayerActivity.showV733CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v733: chunk level
internal fun PlayerActivity.showV733ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v733: cipher mode
internal fun PlayerActivity.showV733CipherToggle() {
    val current = FeaturePrefsStore.batch731.v733cipher
    FeaturePrefsStore.batch731.v733cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v733: clamp mode
internal fun PlayerActivity.showV733ClampToggle() {
    val current = FeaturePrefsStore.batch731.v733clamp
    FeaturePrefsStore.batch731.v733clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v733: classify mode
internal fun PlayerActivity.showV733ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v733classify
    FeaturePrefsStore.batch731.v733classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v733: clean mode
internal fun PlayerActivity.showV733CleanToggle() {
    val current = FeaturePrefsStore.batch731.v733clean
    FeaturePrefsStore.batch731.v733clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v733: clear mode
internal fun PlayerActivity.showV733ClearToggle() {
    val current = FeaturePrefsStore.batch731.v733clear
    FeaturePrefsStore.batch731.v733clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v734: cancel mode
internal fun PlayerActivity.showV734CancelToggle() {
    val current = FeaturePrefsStore.batch731.v734cancel
    FeaturePrefsStore.batch731.v734cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v734: capture mode
internal fun PlayerActivity.showV734CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v734capture
    FeaturePrefsStore.batch731.v734capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v734: cascade mode
internal fun PlayerActivity.showV734CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v734cascade
    FeaturePrefsStore.batch731.v734cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v734: category mode
internal fun PlayerActivity.showV734CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v734category
    FeaturePrefsStore.batch731.v734category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v734: chain mode
internal fun PlayerActivity.showV734ChainToggle() {
    val current = FeaturePrefsStore.batch731.v734chain
    FeaturePrefsStore.batch731.v734chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v734: challenge level
internal fun PlayerActivity.showV734ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v734: channel level
internal fun PlayerActivity.showV734ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v734: chart level
internal fun PlayerActivity.showV734ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v734: checkpoint level
internal fun PlayerActivity.showV734CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v734: chunk level
internal fun PlayerActivity.showV734ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v734: cipher mode
internal fun PlayerActivity.showV734CipherToggle() {
    val current = FeaturePrefsStore.batch731.v734cipher
    FeaturePrefsStore.batch731.v734cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v734: clamp mode
internal fun PlayerActivity.showV734ClampToggle() {
    val current = FeaturePrefsStore.batch731.v734clamp
    FeaturePrefsStore.batch731.v734clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v734: classify mode
internal fun PlayerActivity.showV734ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v734classify
    FeaturePrefsStore.batch731.v734classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v734: clean mode
internal fun PlayerActivity.showV734CleanToggle() {
    val current = FeaturePrefsStore.batch731.v734clean
    FeaturePrefsStore.batch731.v734clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v734: clear mode
internal fun PlayerActivity.showV734ClearToggle() {
    val current = FeaturePrefsStore.batch731.v734clear
    FeaturePrefsStore.batch731.v734clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v735: cancel mode
internal fun PlayerActivity.showV735CancelToggle() {
    val current = FeaturePrefsStore.batch731.v735cancel
    FeaturePrefsStore.batch731.v735cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v735: capture mode
internal fun PlayerActivity.showV735CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v735capture
    FeaturePrefsStore.batch731.v735capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v735: cascade mode
internal fun PlayerActivity.showV735CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v735cascade
    FeaturePrefsStore.batch731.v735cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v735: category mode
internal fun PlayerActivity.showV735CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v735category
    FeaturePrefsStore.batch731.v735category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v735: chain mode
internal fun PlayerActivity.showV735ChainToggle() {
    val current = FeaturePrefsStore.batch731.v735chain
    FeaturePrefsStore.batch731.v735chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v735: challenge level
internal fun PlayerActivity.showV735ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v735: channel level
internal fun PlayerActivity.showV735ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v735: chart level
internal fun PlayerActivity.showV735ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v735: checkpoint level
internal fun PlayerActivity.showV735CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v735: chunk level
internal fun PlayerActivity.showV735ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v735: cipher mode
internal fun PlayerActivity.showV735CipherToggle() {
    val current = FeaturePrefsStore.batch731.v735cipher
    FeaturePrefsStore.batch731.v735cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v735: clamp mode
internal fun PlayerActivity.showV735ClampToggle() {
    val current = FeaturePrefsStore.batch731.v735clamp
    FeaturePrefsStore.batch731.v735clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v735: classify mode
internal fun PlayerActivity.showV735ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v735classify
    FeaturePrefsStore.batch731.v735classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v735: clean mode
internal fun PlayerActivity.showV735CleanToggle() {
    val current = FeaturePrefsStore.batch731.v735clean
    FeaturePrefsStore.batch731.v735clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v735: clear mode
internal fun PlayerActivity.showV735ClearToggle() {
    val current = FeaturePrefsStore.batch731.v735clear
    FeaturePrefsStore.batch731.v735clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v736: cancel mode
internal fun PlayerActivity.showV736CancelToggle() {
    val current = FeaturePrefsStore.batch731.v736cancel
    FeaturePrefsStore.batch731.v736cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v736: capture mode
internal fun PlayerActivity.showV736CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v736capture
    FeaturePrefsStore.batch731.v736capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v736: cascade mode
internal fun PlayerActivity.showV736CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v736cascade
    FeaturePrefsStore.batch731.v736cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v736: category mode
internal fun PlayerActivity.showV736CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v736category
    FeaturePrefsStore.batch731.v736category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v736: chain mode
internal fun PlayerActivity.showV736ChainToggle() {
    val current = FeaturePrefsStore.batch731.v736chain
    FeaturePrefsStore.batch731.v736chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v736: challenge level
internal fun PlayerActivity.showV736ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v736: channel level
internal fun PlayerActivity.showV736ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v736: chart level
internal fun PlayerActivity.showV736ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v736: checkpoint level
internal fun PlayerActivity.showV736CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v736: chunk level
internal fun PlayerActivity.showV736ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v736: cipher mode
internal fun PlayerActivity.showV736CipherToggle() {
    val current = FeaturePrefsStore.batch731.v736cipher
    FeaturePrefsStore.batch731.v736cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v736: clamp mode
internal fun PlayerActivity.showV736ClampToggle() {
    val current = FeaturePrefsStore.batch731.v736clamp
    FeaturePrefsStore.batch731.v736clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v736: classify mode
internal fun PlayerActivity.showV736ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v736classify
    FeaturePrefsStore.batch731.v736classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v736: clean mode
internal fun PlayerActivity.showV736CleanToggle() {
    val current = FeaturePrefsStore.batch731.v736clean
    FeaturePrefsStore.batch731.v736clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v736: clear mode
internal fun PlayerActivity.showV736ClearToggle() {
    val current = FeaturePrefsStore.batch731.v736clear
    FeaturePrefsStore.batch731.v736clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v737: cancel mode
internal fun PlayerActivity.showV737CancelToggle() {
    val current = FeaturePrefsStore.batch731.v737cancel
    FeaturePrefsStore.batch731.v737cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v737: capture mode
internal fun PlayerActivity.showV737CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v737capture
    FeaturePrefsStore.batch731.v737capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v737: cascade mode
internal fun PlayerActivity.showV737CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v737cascade
    FeaturePrefsStore.batch731.v737cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v737: category mode
internal fun PlayerActivity.showV737CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v737category
    FeaturePrefsStore.batch731.v737category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v737: chain mode
internal fun PlayerActivity.showV737ChainToggle() {
    val current = FeaturePrefsStore.batch731.v737chain
    FeaturePrefsStore.batch731.v737chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v737: challenge level
internal fun PlayerActivity.showV737ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v737: channel level
internal fun PlayerActivity.showV737ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v737: chart level
internal fun PlayerActivity.showV737ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v737: checkpoint level
internal fun PlayerActivity.showV737CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v737: chunk level
internal fun PlayerActivity.showV737ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v737: cipher mode
internal fun PlayerActivity.showV737CipherToggle() {
    val current = FeaturePrefsStore.batch731.v737cipher
    FeaturePrefsStore.batch731.v737cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v737: clamp mode
internal fun PlayerActivity.showV737ClampToggle() {
    val current = FeaturePrefsStore.batch731.v737clamp
    FeaturePrefsStore.batch731.v737clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v737: classify mode
internal fun PlayerActivity.showV737ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v737classify
    FeaturePrefsStore.batch731.v737classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v737: clean mode
internal fun PlayerActivity.showV737CleanToggle() {
    val current = FeaturePrefsStore.batch731.v737clean
    FeaturePrefsStore.batch731.v737clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v737: clear mode
internal fun PlayerActivity.showV737ClearToggle() {
    val current = FeaturePrefsStore.batch731.v737clear
    FeaturePrefsStore.batch731.v737clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v738: cancel mode
internal fun PlayerActivity.showV738CancelToggle() {
    val current = FeaturePrefsStore.batch731.v738cancel
    FeaturePrefsStore.batch731.v738cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v738: capture mode
internal fun PlayerActivity.showV738CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v738capture
    FeaturePrefsStore.batch731.v738capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v738: cascade mode
internal fun PlayerActivity.showV738CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v738cascade
    FeaturePrefsStore.batch731.v738cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v738: category mode
internal fun PlayerActivity.showV738CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v738category
    FeaturePrefsStore.batch731.v738category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v738: chain mode
internal fun PlayerActivity.showV738ChainToggle() {
    val current = FeaturePrefsStore.batch731.v738chain
    FeaturePrefsStore.batch731.v738chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v738: challenge level
internal fun PlayerActivity.showV738ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v738: channel level
internal fun PlayerActivity.showV738ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v738: chart level
internal fun PlayerActivity.showV738ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v738: checkpoint level
internal fun PlayerActivity.showV738CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v738: chunk level
internal fun PlayerActivity.showV738ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v738: cipher mode
internal fun PlayerActivity.showV738CipherToggle() {
    val current = FeaturePrefsStore.batch731.v738cipher
    FeaturePrefsStore.batch731.v738cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v738: clamp mode
internal fun PlayerActivity.showV738ClampToggle() {
    val current = FeaturePrefsStore.batch731.v738clamp
    FeaturePrefsStore.batch731.v738clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v738: classify mode
internal fun PlayerActivity.showV738ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v738classify
    FeaturePrefsStore.batch731.v738classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v738: clean mode
internal fun PlayerActivity.showV738CleanToggle() {
    val current = FeaturePrefsStore.batch731.v738clean
    FeaturePrefsStore.batch731.v738clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v738: clear mode
internal fun PlayerActivity.showV738ClearToggle() {
    val current = FeaturePrefsStore.batch731.v738clear
    FeaturePrefsStore.batch731.v738clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v739: cancel mode
internal fun PlayerActivity.showV739CancelToggle() {
    val current = FeaturePrefsStore.batch731.v739cancel
    FeaturePrefsStore.batch731.v739cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v739: capture mode
internal fun PlayerActivity.showV739CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v739capture
    FeaturePrefsStore.batch731.v739capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v739: cascade mode
internal fun PlayerActivity.showV739CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v739cascade
    FeaturePrefsStore.batch731.v739cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v739: category mode
internal fun PlayerActivity.showV739CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v739category
    FeaturePrefsStore.batch731.v739category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v739: chain mode
internal fun PlayerActivity.showV739ChainToggle() {
    val current = FeaturePrefsStore.batch731.v739chain
    FeaturePrefsStore.batch731.v739chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v739: challenge level
internal fun PlayerActivity.showV739ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v739: channel level
internal fun PlayerActivity.showV739ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v739: chart level
internal fun PlayerActivity.showV739ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v739: checkpoint level
internal fun PlayerActivity.showV739CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v739: chunk level
internal fun PlayerActivity.showV739ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v739: cipher mode
internal fun PlayerActivity.showV739CipherToggle() {
    val current = FeaturePrefsStore.batch731.v739cipher
    FeaturePrefsStore.batch731.v739cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v739: clamp mode
internal fun PlayerActivity.showV739ClampToggle() {
    val current = FeaturePrefsStore.batch731.v739clamp
    FeaturePrefsStore.batch731.v739clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v739: classify mode
internal fun PlayerActivity.showV739ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v739classify
    FeaturePrefsStore.batch731.v739classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v739: clean mode
internal fun PlayerActivity.showV739CleanToggle() {
    val current = FeaturePrefsStore.batch731.v739clean
    FeaturePrefsStore.batch731.v739clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v739: clear mode
internal fun PlayerActivity.showV739ClearToggle() {
    val current = FeaturePrefsStore.batch731.v739clear
    FeaturePrefsStore.batch731.v739clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v740: cancel mode
internal fun PlayerActivity.showV740CancelToggle() {
    val current = FeaturePrefsStore.batch731.v740cancel
    FeaturePrefsStore.batch731.v740cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v740: capture mode
internal fun PlayerActivity.showV740CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v740capture
    FeaturePrefsStore.batch731.v740capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v740: cascade mode
internal fun PlayerActivity.showV740CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v740cascade
    FeaturePrefsStore.batch731.v740cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v740: category mode
internal fun PlayerActivity.showV740CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v740category
    FeaturePrefsStore.batch731.v740category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v740: chain mode
internal fun PlayerActivity.showV740ChainToggle() {
    val current = FeaturePrefsStore.batch731.v740chain
    FeaturePrefsStore.batch731.v740chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v740: challenge level
internal fun PlayerActivity.showV740ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v740: channel level
internal fun PlayerActivity.showV740ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v740: chart level
internal fun PlayerActivity.showV740ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v740: checkpoint level
internal fun PlayerActivity.showV740CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v740: chunk level
internal fun PlayerActivity.showV740ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v740: cipher mode
internal fun PlayerActivity.showV740CipherToggle() {
    val current = FeaturePrefsStore.batch731.v740cipher
    FeaturePrefsStore.batch731.v740cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v740: clamp mode
internal fun PlayerActivity.showV740ClampToggle() {
    val current = FeaturePrefsStore.batch731.v740clamp
    FeaturePrefsStore.batch731.v740clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v740: classify mode
internal fun PlayerActivity.showV740ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v740classify
    FeaturePrefsStore.batch731.v740classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v740: clean mode
internal fun PlayerActivity.showV740CleanToggle() {
    val current = FeaturePrefsStore.batch731.v740clean
    FeaturePrefsStore.batch731.v740clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v740: clear mode
internal fun PlayerActivity.showV740ClearToggle() {
    val current = FeaturePrefsStore.batch731.v740clear
    FeaturePrefsStore.batch731.v740clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

