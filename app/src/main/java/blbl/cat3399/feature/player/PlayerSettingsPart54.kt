package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v721: callback mode
internal fun PlayerActivity.showV721CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v721callback
    FeaturePrefsStore.batch721.v721callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v721: cancel mode
internal fun PlayerActivity.showV721CancelToggle() {
    val current = FeaturePrefsStore.batch721.v721cancel
    FeaturePrefsStore.batch721.v721cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v721: capture mode
internal fun PlayerActivity.showV721CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v721capture
    FeaturePrefsStore.batch721.v721capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v721: cascade mode
internal fun PlayerActivity.showV721CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v721cascade
    FeaturePrefsStore.batch721.v721cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v721: category mode
internal fun PlayerActivity.showV721CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v721category
    FeaturePrefsStore.batch721.v721category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v721: chain level
internal fun PlayerActivity.showV721ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v721: challenge level
internal fun PlayerActivity.showV721ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v721: channel level
internal fun PlayerActivity.showV721ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v721: chart level
internal fun PlayerActivity.showV721ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v721: checkpoint level
internal fun PlayerActivity.showV721CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v721: chunk mode
internal fun PlayerActivity.showV721ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v721chunk
    FeaturePrefsStore.batch721.v721chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v721: cipher mode
internal fun PlayerActivity.showV721CipherToggle() {
    val current = FeaturePrefsStore.batch721.v721cipher
    FeaturePrefsStore.batch721.v721cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v721: clamp mode
internal fun PlayerActivity.showV721ClampToggle() {
    val current = FeaturePrefsStore.batch721.v721clamp
    FeaturePrefsStore.batch721.v721clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v721: classify mode
internal fun PlayerActivity.showV721ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v721classify
    FeaturePrefsStore.batch721.v721classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v721: clean mode
internal fun PlayerActivity.showV721CleanToggle() {
    val current = FeaturePrefsStore.batch721.v721clean
    FeaturePrefsStore.batch721.v721clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v722: callback mode
internal fun PlayerActivity.showV722CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v722callback
    FeaturePrefsStore.batch721.v722callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v722: cancel mode
internal fun PlayerActivity.showV722CancelToggle() {
    val current = FeaturePrefsStore.batch721.v722cancel
    FeaturePrefsStore.batch721.v722cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v722: capture mode
internal fun PlayerActivity.showV722CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v722capture
    FeaturePrefsStore.batch721.v722capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v722: cascade mode
internal fun PlayerActivity.showV722CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v722cascade
    FeaturePrefsStore.batch721.v722cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v722: category mode
internal fun PlayerActivity.showV722CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v722category
    FeaturePrefsStore.batch721.v722category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v722: chain level
internal fun PlayerActivity.showV722ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v722: challenge level
internal fun PlayerActivity.showV722ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v722: channel level
internal fun PlayerActivity.showV722ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v722: chart level
internal fun PlayerActivity.showV722ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v722: checkpoint level
internal fun PlayerActivity.showV722CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v722: chunk mode
internal fun PlayerActivity.showV722ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v722chunk
    FeaturePrefsStore.batch721.v722chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v722: cipher mode
internal fun PlayerActivity.showV722CipherToggle() {
    val current = FeaturePrefsStore.batch721.v722cipher
    FeaturePrefsStore.batch721.v722cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v722: clamp mode
internal fun PlayerActivity.showV722ClampToggle() {
    val current = FeaturePrefsStore.batch721.v722clamp
    FeaturePrefsStore.batch721.v722clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v722: classify mode
internal fun PlayerActivity.showV722ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v722classify
    FeaturePrefsStore.batch721.v722classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v722: clean mode
internal fun PlayerActivity.showV722CleanToggle() {
    val current = FeaturePrefsStore.batch721.v722clean
    FeaturePrefsStore.batch721.v722clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v723: callback mode
internal fun PlayerActivity.showV723CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v723callback
    FeaturePrefsStore.batch721.v723callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v723: cancel mode
internal fun PlayerActivity.showV723CancelToggle() {
    val current = FeaturePrefsStore.batch721.v723cancel
    FeaturePrefsStore.batch721.v723cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v723: capture mode
internal fun PlayerActivity.showV723CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v723capture
    FeaturePrefsStore.batch721.v723capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v723: cascade mode
internal fun PlayerActivity.showV723CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v723cascade
    FeaturePrefsStore.batch721.v723cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v723: category mode
internal fun PlayerActivity.showV723CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v723category
    FeaturePrefsStore.batch721.v723category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v723: chain level
internal fun PlayerActivity.showV723ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v723: challenge level
internal fun PlayerActivity.showV723ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v723: channel level
internal fun PlayerActivity.showV723ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v723: chart level
internal fun PlayerActivity.showV723ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v723: checkpoint level
internal fun PlayerActivity.showV723CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v723: chunk mode
internal fun PlayerActivity.showV723ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v723chunk
    FeaturePrefsStore.batch721.v723chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v723: cipher mode
internal fun PlayerActivity.showV723CipherToggle() {
    val current = FeaturePrefsStore.batch721.v723cipher
    FeaturePrefsStore.batch721.v723cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v723: clamp mode
internal fun PlayerActivity.showV723ClampToggle() {
    val current = FeaturePrefsStore.batch721.v723clamp
    FeaturePrefsStore.batch721.v723clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v723: classify mode
internal fun PlayerActivity.showV723ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v723classify
    FeaturePrefsStore.batch721.v723classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v723: clean mode
internal fun PlayerActivity.showV723CleanToggle() {
    val current = FeaturePrefsStore.batch721.v723clean
    FeaturePrefsStore.batch721.v723clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v724: callback mode
internal fun PlayerActivity.showV724CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v724callback
    FeaturePrefsStore.batch721.v724callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v724: cancel mode
internal fun PlayerActivity.showV724CancelToggle() {
    val current = FeaturePrefsStore.batch721.v724cancel
    FeaturePrefsStore.batch721.v724cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v724: capture mode
internal fun PlayerActivity.showV724CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v724capture
    FeaturePrefsStore.batch721.v724capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v724: cascade mode
internal fun PlayerActivity.showV724CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v724cascade
    FeaturePrefsStore.batch721.v724cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v724: category mode
internal fun PlayerActivity.showV724CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v724category
    FeaturePrefsStore.batch721.v724category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v724: chain level
internal fun PlayerActivity.showV724ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v724: challenge level
internal fun PlayerActivity.showV724ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v724: channel level
internal fun PlayerActivity.showV724ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v724: chart level
internal fun PlayerActivity.showV724ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v724: checkpoint level
internal fun PlayerActivity.showV724CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v724: chunk mode
internal fun PlayerActivity.showV724ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v724chunk
    FeaturePrefsStore.batch721.v724chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v724: cipher mode
internal fun PlayerActivity.showV724CipherToggle() {
    val current = FeaturePrefsStore.batch721.v724cipher
    FeaturePrefsStore.batch721.v724cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v724: clamp mode
internal fun PlayerActivity.showV724ClampToggle() {
    val current = FeaturePrefsStore.batch721.v724clamp
    FeaturePrefsStore.batch721.v724clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v724: classify mode
internal fun PlayerActivity.showV724ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v724classify
    FeaturePrefsStore.batch721.v724classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v724: clean mode
internal fun PlayerActivity.showV724CleanToggle() {
    val current = FeaturePrefsStore.batch721.v724clean
    FeaturePrefsStore.batch721.v724clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v725: callback mode
internal fun PlayerActivity.showV725CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v725callback
    FeaturePrefsStore.batch721.v725callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v725: cancel mode
internal fun PlayerActivity.showV725CancelToggle() {
    val current = FeaturePrefsStore.batch721.v725cancel
    FeaturePrefsStore.batch721.v725cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v725: capture mode
internal fun PlayerActivity.showV725CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v725capture
    FeaturePrefsStore.batch721.v725capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v725: cascade mode
internal fun PlayerActivity.showV725CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v725cascade
    FeaturePrefsStore.batch721.v725cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v725: category mode
internal fun PlayerActivity.showV725CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v725category
    FeaturePrefsStore.batch721.v725category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v725: chain level
internal fun PlayerActivity.showV725ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v725: challenge level
internal fun PlayerActivity.showV725ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v725: channel level
internal fun PlayerActivity.showV725ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v725: chart level
internal fun PlayerActivity.showV725ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v725: checkpoint level
internal fun PlayerActivity.showV725CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v725: chunk mode
internal fun PlayerActivity.showV725ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v725chunk
    FeaturePrefsStore.batch721.v725chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v725: cipher mode
internal fun PlayerActivity.showV725CipherToggle() {
    val current = FeaturePrefsStore.batch721.v725cipher
    FeaturePrefsStore.batch721.v725cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v725: clamp mode
internal fun PlayerActivity.showV725ClampToggle() {
    val current = FeaturePrefsStore.batch721.v725clamp
    FeaturePrefsStore.batch721.v725clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v725: classify mode
internal fun PlayerActivity.showV725ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v725classify
    FeaturePrefsStore.batch721.v725classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v725: clean mode
internal fun PlayerActivity.showV725CleanToggle() {
    val current = FeaturePrefsStore.batch721.v725clean
    FeaturePrefsStore.batch721.v725clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v726: callback mode
internal fun PlayerActivity.showV726CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v726callback
    FeaturePrefsStore.batch721.v726callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v726: cancel mode
internal fun PlayerActivity.showV726CancelToggle() {
    val current = FeaturePrefsStore.batch721.v726cancel
    FeaturePrefsStore.batch721.v726cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v726: capture mode
internal fun PlayerActivity.showV726CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v726capture
    FeaturePrefsStore.batch721.v726capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v726: cascade mode
internal fun PlayerActivity.showV726CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v726cascade
    FeaturePrefsStore.batch721.v726cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v726: category mode
internal fun PlayerActivity.showV726CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v726category
    FeaturePrefsStore.batch721.v726category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v726: chain level
internal fun PlayerActivity.showV726ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v726: challenge level
internal fun PlayerActivity.showV726ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v726: channel level
internal fun PlayerActivity.showV726ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v726: chart level
internal fun PlayerActivity.showV726ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v726: checkpoint level
internal fun PlayerActivity.showV726CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v726: chunk mode
internal fun PlayerActivity.showV726ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v726chunk
    FeaturePrefsStore.batch721.v726chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v726: cipher mode
internal fun PlayerActivity.showV726CipherToggle() {
    val current = FeaturePrefsStore.batch721.v726cipher
    FeaturePrefsStore.batch721.v726cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v726: clamp mode
internal fun PlayerActivity.showV726ClampToggle() {
    val current = FeaturePrefsStore.batch721.v726clamp
    FeaturePrefsStore.batch721.v726clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v726: classify mode
internal fun PlayerActivity.showV726ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v726classify
    FeaturePrefsStore.batch721.v726classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v726: clean mode
internal fun PlayerActivity.showV726CleanToggle() {
    val current = FeaturePrefsStore.batch721.v726clean
    FeaturePrefsStore.batch721.v726clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v727: callback mode
internal fun PlayerActivity.showV727CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v727callback
    FeaturePrefsStore.batch721.v727callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v727: cancel mode
internal fun PlayerActivity.showV727CancelToggle() {
    val current = FeaturePrefsStore.batch721.v727cancel
    FeaturePrefsStore.batch721.v727cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v727: capture mode
internal fun PlayerActivity.showV727CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v727capture
    FeaturePrefsStore.batch721.v727capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v727: cascade mode
internal fun PlayerActivity.showV727CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v727cascade
    FeaturePrefsStore.batch721.v727cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v727: category mode
internal fun PlayerActivity.showV727CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v727category
    FeaturePrefsStore.batch721.v727category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v727: chain level
internal fun PlayerActivity.showV727ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v727: challenge level
internal fun PlayerActivity.showV727ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v727: channel level
internal fun PlayerActivity.showV727ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v727: chart level
internal fun PlayerActivity.showV727ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v727: checkpoint level
internal fun PlayerActivity.showV727CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v727: chunk mode
internal fun PlayerActivity.showV727ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v727chunk
    FeaturePrefsStore.batch721.v727chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v727: cipher mode
internal fun PlayerActivity.showV727CipherToggle() {
    val current = FeaturePrefsStore.batch721.v727cipher
    FeaturePrefsStore.batch721.v727cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v727: clamp mode
internal fun PlayerActivity.showV727ClampToggle() {
    val current = FeaturePrefsStore.batch721.v727clamp
    FeaturePrefsStore.batch721.v727clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v727: classify mode
internal fun PlayerActivity.showV727ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v727classify
    FeaturePrefsStore.batch721.v727classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v727: clean mode
internal fun PlayerActivity.showV727CleanToggle() {
    val current = FeaturePrefsStore.batch721.v727clean
    FeaturePrefsStore.batch721.v727clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v728: callback mode
internal fun PlayerActivity.showV728CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v728callback
    FeaturePrefsStore.batch721.v728callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v728: cancel mode
internal fun PlayerActivity.showV728CancelToggle() {
    val current = FeaturePrefsStore.batch721.v728cancel
    FeaturePrefsStore.batch721.v728cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v728: capture mode
internal fun PlayerActivity.showV728CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v728capture
    FeaturePrefsStore.batch721.v728capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v728: cascade mode
internal fun PlayerActivity.showV728CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v728cascade
    FeaturePrefsStore.batch721.v728cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v728: category mode
internal fun PlayerActivity.showV728CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v728category
    FeaturePrefsStore.batch721.v728category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v728: chain level
internal fun PlayerActivity.showV728ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v728: challenge level
internal fun PlayerActivity.showV728ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v728: channel level
internal fun PlayerActivity.showV728ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v728: chart level
internal fun PlayerActivity.showV728ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v728: checkpoint level
internal fun PlayerActivity.showV728CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v728: chunk mode
internal fun PlayerActivity.showV728ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v728chunk
    FeaturePrefsStore.batch721.v728chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v728: cipher mode
internal fun PlayerActivity.showV728CipherToggle() {
    val current = FeaturePrefsStore.batch721.v728cipher
    FeaturePrefsStore.batch721.v728cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v728: clamp mode
internal fun PlayerActivity.showV728ClampToggle() {
    val current = FeaturePrefsStore.batch721.v728clamp
    FeaturePrefsStore.batch721.v728clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v728: classify mode
internal fun PlayerActivity.showV728ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v728classify
    FeaturePrefsStore.batch721.v728classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v728: clean mode
internal fun PlayerActivity.showV728CleanToggle() {
    val current = FeaturePrefsStore.batch721.v728clean
    FeaturePrefsStore.batch721.v728clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v729: callback mode
internal fun PlayerActivity.showV729CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v729callback
    FeaturePrefsStore.batch721.v729callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v729: cancel mode
internal fun PlayerActivity.showV729CancelToggle() {
    val current = FeaturePrefsStore.batch721.v729cancel
    FeaturePrefsStore.batch721.v729cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v729: capture mode
internal fun PlayerActivity.showV729CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v729capture
    FeaturePrefsStore.batch721.v729capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v729: cascade mode
internal fun PlayerActivity.showV729CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v729cascade
    FeaturePrefsStore.batch721.v729cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v729: category mode
internal fun PlayerActivity.showV729CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v729category
    FeaturePrefsStore.batch721.v729category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v729: chain level
internal fun PlayerActivity.showV729ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v729: challenge level
internal fun PlayerActivity.showV729ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v729: channel level
internal fun PlayerActivity.showV729ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v729: chart level
internal fun PlayerActivity.showV729ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v729: checkpoint level
internal fun PlayerActivity.showV729CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v729: chunk mode
internal fun PlayerActivity.showV729ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v729chunk
    FeaturePrefsStore.batch721.v729chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v729: cipher mode
internal fun PlayerActivity.showV729CipherToggle() {
    val current = FeaturePrefsStore.batch721.v729cipher
    FeaturePrefsStore.batch721.v729cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v729: clamp mode
internal fun PlayerActivity.showV729ClampToggle() {
    val current = FeaturePrefsStore.batch721.v729clamp
    FeaturePrefsStore.batch721.v729clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v729: classify mode
internal fun PlayerActivity.showV729ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v729classify
    FeaturePrefsStore.batch721.v729classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v729: clean mode
internal fun PlayerActivity.showV729CleanToggle() {
    val current = FeaturePrefsStore.batch721.v729clean
    FeaturePrefsStore.batch721.v729clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v730: callback mode
internal fun PlayerActivity.showV730CallbackToggle() {
    val current = FeaturePrefsStore.batch721.v730callback
    FeaturePrefsStore.batch721.v730callback = !current
    AppToast.show(this, "callback: ${if (!current) "ON" else "OFF"}")
}

// v730: cancel mode
internal fun PlayerActivity.showV730CancelToggle() {
    val current = FeaturePrefsStore.batch721.v730cancel
    FeaturePrefsStore.batch721.v730cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v730: capture mode
internal fun PlayerActivity.showV730CaptureToggle() {
    val current = FeaturePrefsStore.batch721.v730capture
    FeaturePrefsStore.batch721.v730capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v730: cascade mode
internal fun PlayerActivity.showV730CascadeToggle() {
    val current = FeaturePrefsStore.batch721.v730cascade
    FeaturePrefsStore.batch721.v730cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v730: category mode
internal fun PlayerActivity.showV730CategoryToggle() {
    val current = FeaturePrefsStore.batch721.v730category
    FeaturePrefsStore.batch721.v730category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v730: chain level
internal fun PlayerActivity.showV730ChainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730chain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730chain = value
        AppToast.show(this, "chain: $value")
    }
}

// v730: challenge level
internal fun PlayerActivity.showV730ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v730: channel level
internal fun PlayerActivity.showV730ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v730: chart level
internal fun PlayerActivity.showV730ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v730: checkpoint level
internal fun PlayerActivity.showV730CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v730: chunk mode
internal fun PlayerActivity.showV730ChunkToggle() {
    val current = FeaturePrefsStore.batch721.v730chunk
    FeaturePrefsStore.batch721.v730chunk = !current
    AppToast.show(this, "chunk: ${if (!current) "ON" else "OFF"}")
}

// v730: cipher mode
internal fun PlayerActivity.showV730CipherToggle() {
    val current = FeaturePrefsStore.batch721.v730cipher
    FeaturePrefsStore.batch721.v730cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v730: clamp mode
internal fun PlayerActivity.showV730ClampToggle() {
    val current = FeaturePrefsStore.batch721.v730clamp
    FeaturePrefsStore.batch721.v730clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v730: classify mode
internal fun PlayerActivity.showV730ClassifyToggle() {
    val current = FeaturePrefsStore.batch721.v730classify
    FeaturePrefsStore.batch721.v730classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v730: clean mode
internal fun PlayerActivity.showV730CleanToggle() {
    val current = FeaturePrefsStore.batch721.v730clean
    FeaturePrefsStore.batch721.v730clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

