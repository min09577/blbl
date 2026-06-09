package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1151: usage mode
internal fun PlayerActivity.showV1151UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1151usage
    FeaturePrefsStore.batch1151.v1151usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1151: user mode
internal fun PlayerActivity.showV1151UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1151user
    FeaturePrefsStore.batch1151.v1151user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1151: valid mode
internal fun PlayerActivity.showV1151ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1151valid
    FeaturePrefsStore.batch1151.v1151valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1151: value mode
internal fun PlayerActivity.showV1151ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1151value
    FeaturePrefsStore.batch1151.v1151value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1151: variable mode
internal fun PlayerActivity.showV1151VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1151variable
    FeaturePrefsStore.batch1151.v1151variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1151: version level
internal fun PlayerActivity.showV1151VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151version = value
        AppToast.show(this, "version: $value")
    }
}

// v1151: video level
internal fun PlayerActivity.showV1151VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151video = value
        AppToast.show(this, "video: $value")
    }
}

// v1151: view level
internal fun PlayerActivity.showV1151ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151view = value
        AppToast.show(this, "view: $value")
    }
}

// v1151: virtual level
internal fun PlayerActivity.showV1151VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1151: visible level
internal fun PlayerActivity.showV1151VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1151: void mode
internal fun PlayerActivity.showV1151VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1151void
    FeaturePrefsStore.batch1151.v1151void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1151: voice mode
internal fun PlayerActivity.showV1151VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1151voice
    FeaturePrefsStore.batch1151.v1151voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1151: volume mode
internal fun PlayerActivity.showV1151VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1151volume
    FeaturePrefsStore.batch1151.v1151volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1151: wait mode
internal fun PlayerActivity.showV1151WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1151wait
    FeaturePrefsStore.batch1151.v1151wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1151: wake mode
internal fun PlayerActivity.showV1151WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1151wake
    FeaturePrefsStore.batch1151.v1151wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1152: usage mode
internal fun PlayerActivity.showV1152UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1152usage
    FeaturePrefsStore.batch1151.v1152usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1152: user mode
internal fun PlayerActivity.showV1152UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1152user
    FeaturePrefsStore.batch1151.v1152user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1152: valid mode
internal fun PlayerActivity.showV1152ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1152valid
    FeaturePrefsStore.batch1151.v1152valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1152: value mode
internal fun PlayerActivity.showV1152ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1152value
    FeaturePrefsStore.batch1151.v1152value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1152: variable mode
internal fun PlayerActivity.showV1152VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1152variable
    FeaturePrefsStore.batch1151.v1152variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1152: version level
internal fun PlayerActivity.showV1152VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152version = value
        AppToast.show(this, "version: $value")
    }
}

// v1152: video level
internal fun PlayerActivity.showV1152VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152video = value
        AppToast.show(this, "video: $value")
    }
}

// v1152: view level
internal fun PlayerActivity.showV1152ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152view = value
        AppToast.show(this, "view: $value")
    }
}

// v1152: virtual level
internal fun PlayerActivity.showV1152VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1152: visible level
internal fun PlayerActivity.showV1152VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1152: void mode
internal fun PlayerActivity.showV1152VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1152void
    FeaturePrefsStore.batch1151.v1152void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1152: voice mode
internal fun PlayerActivity.showV1152VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1152voice
    FeaturePrefsStore.batch1151.v1152voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1152: volume mode
internal fun PlayerActivity.showV1152VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1152volume
    FeaturePrefsStore.batch1151.v1152volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1152: wait mode
internal fun PlayerActivity.showV1152WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1152wait
    FeaturePrefsStore.batch1151.v1152wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1152: wake mode
internal fun PlayerActivity.showV1152WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1152wake
    FeaturePrefsStore.batch1151.v1152wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1153: usage mode
internal fun PlayerActivity.showV1153UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1153usage
    FeaturePrefsStore.batch1151.v1153usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1153: user mode
internal fun PlayerActivity.showV1153UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1153user
    FeaturePrefsStore.batch1151.v1153user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1153: valid mode
internal fun PlayerActivity.showV1153ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1153valid
    FeaturePrefsStore.batch1151.v1153valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1153: value mode
internal fun PlayerActivity.showV1153ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1153value
    FeaturePrefsStore.batch1151.v1153value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1153: variable mode
internal fun PlayerActivity.showV1153VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1153variable
    FeaturePrefsStore.batch1151.v1153variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1153: version level
internal fun PlayerActivity.showV1153VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153version = value
        AppToast.show(this, "version: $value")
    }
}

// v1153: video level
internal fun PlayerActivity.showV1153VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153video = value
        AppToast.show(this, "video: $value")
    }
}

// v1153: view level
internal fun PlayerActivity.showV1153ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153view = value
        AppToast.show(this, "view: $value")
    }
}

// v1153: virtual level
internal fun PlayerActivity.showV1153VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1153: visible level
internal fun PlayerActivity.showV1153VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1153: void mode
internal fun PlayerActivity.showV1153VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1153void
    FeaturePrefsStore.batch1151.v1153void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1153: voice mode
internal fun PlayerActivity.showV1153VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1153voice
    FeaturePrefsStore.batch1151.v1153voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1153: volume mode
internal fun PlayerActivity.showV1153VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1153volume
    FeaturePrefsStore.batch1151.v1153volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1153: wait mode
internal fun PlayerActivity.showV1153WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1153wait
    FeaturePrefsStore.batch1151.v1153wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1153: wake mode
internal fun PlayerActivity.showV1153WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1153wake
    FeaturePrefsStore.batch1151.v1153wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1154: usage mode
internal fun PlayerActivity.showV1154UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1154usage
    FeaturePrefsStore.batch1151.v1154usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1154: user mode
internal fun PlayerActivity.showV1154UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1154user
    FeaturePrefsStore.batch1151.v1154user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1154: valid mode
internal fun PlayerActivity.showV1154ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1154valid
    FeaturePrefsStore.batch1151.v1154valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1154: value mode
internal fun PlayerActivity.showV1154ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1154value
    FeaturePrefsStore.batch1151.v1154value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1154: variable mode
internal fun PlayerActivity.showV1154VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1154variable
    FeaturePrefsStore.batch1151.v1154variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1154: version level
internal fun PlayerActivity.showV1154VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154version = value
        AppToast.show(this, "version: $value")
    }
}

// v1154: video level
internal fun PlayerActivity.showV1154VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154video = value
        AppToast.show(this, "video: $value")
    }
}

// v1154: view level
internal fun PlayerActivity.showV1154ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154view = value
        AppToast.show(this, "view: $value")
    }
}

// v1154: virtual level
internal fun PlayerActivity.showV1154VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1154: visible level
internal fun PlayerActivity.showV1154VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1154: void mode
internal fun PlayerActivity.showV1154VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1154void
    FeaturePrefsStore.batch1151.v1154void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1154: voice mode
internal fun PlayerActivity.showV1154VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1154voice
    FeaturePrefsStore.batch1151.v1154voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1154: volume mode
internal fun PlayerActivity.showV1154VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1154volume
    FeaturePrefsStore.batch1151.v1154volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1154: wait mode
internal fun PlayerActivity.showV1154WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1154wait
    FeaturePrefsStore.batch1151.v1154wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1154: wake mode
internal fun PlayerActivity.showV1154WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1154wake
    FeaturePrefsStore.batch1151.v1154wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1155: usage mode
internal fun PlayerActivity.showV1155UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1155usage
    FeaturePrefsStore.batch1151.v1155usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1155: user mode
internal fun PlayerActivity.showV1155UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1155user
    FeaturePrefsStore.batch1151.v1155user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1155: valid mode
internal fun PlayerActivity.showV1155ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1155valid
    FeaturePrefsStore.batch1151.v1155valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1155: value mode
internal fun PlayerActivity.showV1155ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1155value
    FeaturePrefsStore.batch1151.v1155value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1155: variable mode
internal fun PlayerActivity.showV1155VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1155variable
    FeaturePrefsStore.batch1151.v1155variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1155: version level
internal fun PlayerActivity.showV1155VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155version = value
        AppToast.show(this, "version: $value")
    }
}

// v1155: video level
internal fun PlayerActivity.showV1155VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155video = value
        AppToast.show(this, "video: $value")
    }
}

// v1155: view level
internal fun PlayerActivity.showV1155ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155view = value
        AppToast.show(this, "view: $value")
    }
}

// v1155: virtual level
internal fun PlayerActivity.showV1155VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1155: visible level
internal fun PlayerActivity.showV1155VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1155: void mode
internal fun PlayerActivity.showV1155VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1155void
    FeaturePrefsStore.batch1151.v1155void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1155: voice mode
internal fun PlayerActivity.showV1155VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1155voice
    FeaturePrefsStore.batch1151.v1155voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1155: volume mode
internal fun PlayerActivity.showV1155VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1155volume
    FeaturePrefsStore.batch1151.v1155volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1155: wait mode
internal fun PlayerActivity.showV1155WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1155wait
    FeaturePrefsStore.batch1151.v1155wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1155: wake mode
internal fun PlayerActivity.showV1155WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1155wake
    FeaturePrefsStore.batch1151.v1155wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1156: usage mode
internal fun PlayerActivity.showV1156UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1156usage
    FeaturePrefsStore.batch1151.v1156usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1156: user mode
internal fun PlayerActivity.showV1156UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1156user
    FeaturePrefsStore.batch1151.v1156user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1156: valid mode
internal fun PlayerActivity.showV1156ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1156valid
    FeaturePrefsStore.batch1151.v1156valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1156: value mode
internal fun PlayerActivity.showV1156ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1156value
    FeaturePrefsStore.batch1151.v1156value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1156: variable mode
internal fun PlayerActivity.showV1156VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1156variable
    FeaturePrefsStore.batch1151.v1156variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1156: version level
internal fun PlayerActivity.showV1156VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156version = value
        AppToast.show(this, "version: $value")
    }
}

// v1156: video level
internal fun PlayerActivity.showV1156VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156video = value
        AppToast.show(this, "video: $value")
    }
}

// v1156: view level
internal fun PlayerActivity.showV1156ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156view = value
        AppToast.show(this, "view: $value")
    }
}

// v1156: virtual level
internal fun PlayerActivity.showV1156VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1156: visible level
internal fun PlayerActivity.showV1156VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1156: void mode
internal fun PlayerActivity.showV1156VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1156void
    FeaturePrefsStore.batch1151.v1156void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1156: voice mode
internal fun PlayerActivity.showV1156VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1156voice
    FeaturePrefsStore.batch1151.v1156voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1156: volume mode
internal fun PlayerActivity.showV1156VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1156volume
    FeaturePrefsStore.batch1151.v1156volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1156: wait mode
internal fun PlayerActivity.showV1156WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1156wait
    FeaturePrefsStore.batch1151.v1156wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1156: wake mode
internal fun PlayerActivity.showV1156WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1156wake
    FeaturePrefsStore.batch1151.v1156wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1157: usage mode
internal fun PlayerActivity.showV1157UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1157usage
    FeaturePrefsStore.batch1151.v1157usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1157: user mode
internal fun PlayerActivity.showV1157UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1157user
    FeaturePrefsStore.batch1151.v1157user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1157: valid mode
internal fun PlayerActivity.showV1157ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1157valid
    FeaturePrefsStore.batch1151.v1157valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1157: value mode
internal fun PlayerActivity.showV1157ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1157value
    FeaturePrefsStore.batch1151.v1157value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1157: variable mode
internal fun PlayerActivity.showV1157VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1157variable
    FeaturePrefsStore.batch1151.v1157variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1157: version level
internal fun PlayerActivity.showV1157VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157version = value
        AppToast.show(this, "version: $value")
    }
}

// v1157: video level
internal fun PlayerActivity.showV1157VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157video = value
        AppToast.show(this, "video: $value")
    }
}

// v1157: view level
internal fun PlayerActivity.showV1157ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157view = value
        AppToast.show(this, "view: $value")
    }
}

// v1157: virtual level
internal fun PlayerActivity.showV1157VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1157: visible level
internal fun PlayerActivity.showV1157VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1157: void mode
internal fun PlayerActivity.showV1157VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1157void
    FeaturePrefsStore.batch1151.v1157void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1157: voice mode
internal fun PlayerActivity.showV1157VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1157voice
    FeaturePrefsStore.batch1151.v1157voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1157: volume mode
internal fun PlayerActivity.showV1157VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1157volume
    FeaturePrefsStore.batch1151.v1157volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1157: wait mode
internal fun PlayerActivity.showV1157WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1157wait
    FeaturePrefsStore.batch1151.v1157wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1157: wake mode
internal fun PlayerActivity.showV1157WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1157wake
    FeaturePrefsStore.batch1151.v1157wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1158: usage mode
internal fun PlayerActivity.showV1158UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1158usage
    FeaturePrefsStore.batch1151.v1158usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1158: user mode
internal fun PlayerActivity.showV1158UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1158user
    FeaturePrefsStore.batch1151.v1158user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1158: valid mode
internal fun PlayerActivity.showV1158ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1158valid
    FeaturePrefsStore.batch1151.v1158valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1158: value mode
internal fun PlayerActivity.showV1158ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1158value
    FeaturePrefsStore.batch1151.v1158value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1158: variable mode
internal fun PlayerActivity.showV1158VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1158variable
    FeaturePrefsStore.batch1151.v1158variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1158: version level
internal fun PlayerActivity.showV1158VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158version = value
        AppToast.show(this, "version: $value")
    }
}

// v1158: video level
internal fun PlayerActivity.showV1158VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158video = value
        AppToast.show(this, "video: $value")
    }
}

// v1158: view level
internal fun PlayerActivity.showV1158ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158view = value
        AppToast.show(this, "view: $value")
    }
}

// v1158: virtual level
internal fun PlayerActivity.showV1158VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1158: visible level
internal fun PlayerActivity.showV1158VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1158: void mode
internal fun PlayerActivity.showV1158VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1158void
    FeaturePrefsStore.batch1151.v1158void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1158: voice mode
internal fun PlayerActivity.showV1158VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1158voice
    FeaturePrefsStore.batch1151.v1158voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1158: volume mode
internal fun PlayerActivity.showV1158VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1158volume
    FeaturePrefsStore.batch1151.v1158volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1158: wait mode
internal fun PlayerActivity.showV1158WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1158wait
    FeaturePrefsStore.batch1151.v1158wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1158: wake mode
internal fun PlayerActivity.showV1158WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1158wake
    FeaturePrefsStore.batch1151.v1158wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1159: usage mode
internal fun PlayerActivity.showV1159UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1159usage
    FeaturePrefsStore.batch1151.v1159usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1159: user mode
internal fun PlayerActivity.showV1159UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1159user
    FeaturePrefsStore.batch1151.v1159user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1159: valid mode
internal fun PlayerActivity.showV1159ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1159valid
    FeaturePrefsStore.batch1151.v1159valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1159: value mode
internal fun PlayerActivity.showV1159ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1159value
    FeaturePrefsStore.batch1151.v1159value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1159: variable mode
internal fun PlayerActivity.showV1159VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1159variable
    FeaturePrefsStore.batch1151.v1159variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1159: version level
internal fun PlayerActivity.showV1159VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159version = value
        AppToast.show(this, "version: $value")
    }
}

// v1159: video level
internal fun PlayerActivity.showV1159VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159video = value
        AppToast.show(this, "video: $value")
    }
}

// v1159: view level
internal fun PlayerActivity.showV1159ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159view = value
        AppToast.show(this, "view: $value")
    }
}

// v1159: virtual level
internal fun PlayerActivity.showV1159VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1159: visible level
internal fun PlayerActivity.showV1159VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1159: void mode
internal fun PlayerActivity.showV1159VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1159void
    FeaturePrefsStore.batch1151.v1159void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1159: voice mode
internal fun PlayerActivity.showV1159VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1159voice
    FeaturePrefsStore.batch1151.v1159voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1159: volume mode
internal fun PlayerActivity.showV1159VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1159volume
    FeaturePrefsStore.batch1151.v1159volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1159: wait mode
internal fun PlayerActivity.showV1159WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1159wait
    FeaturePrefsStore.batch1151.v1159wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1159: wake mode
internal fun PlayerActivity.showV1159WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1159wake
    FeaturePrefsStore.batch1151.v1159wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1160: usage mode
internal fun PlayerActivity.showV1160UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1160usage
    FeaturePrefsStore.batch1151.v1160usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1160: user mode
internal fun PlayerActivity.showV1160UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1160user
    FeaturePrefsStore.batch1151.v1160user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1160: valid mode
internal fun PlayerActivity.showV1160ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1160valid
    FeaturePrefsStore.batch1151.v1160valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1160: value mode
internal fun PlayerActivity.showV1160ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1160value
    FeaturePrefsStore.batch1151.v1160value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1160: variable mode
internal fun PlayerActivity.showV1160VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1160variable
    FeaturePrefsStore.batch1151.v1160variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1160: version level
internal fun PlayerActivity.showV1160VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160version = value
        AppToast.show(this, "version: $value")
    }
}

// v1160: video level
internal fun PlayerActivity.showV1160VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160video = value
        AppToast.show(this, "video: $value")
    }
}

// v1160: view level
internal fun PlayerActivity.showV1160ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160view = value
        AppToast.show(this, "view: $value")
    }
}

// v1160: virtual level
internal fun PlayerActivity.showV1160VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1160: visible level
internal fun PlayerActivity.showV1160VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1160: void mode
internal fun PlayerActivity.showV1160VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1160void
    FeaturePrefsStore.batch1151.v1160void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1160: voice mode
internal fun PlayerActivity.showV1160VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1160voice
    FeaturePrefsStore.batch1151.v1160voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1160: volume mode
internal fun PlayerActivity.showV1160VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1160volume
    FeaturePrefsStore.batch1151.v1160volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1160: wait mode
internal fun PlayerActivity.showV1160WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1160wait
    FeaturePrefsStore.batch1151.v1160wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1160: wake mode
internal fun PlayerActivity.showV1160WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1160wake
    FeaturePrefsStore.batch1151.v1160wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

