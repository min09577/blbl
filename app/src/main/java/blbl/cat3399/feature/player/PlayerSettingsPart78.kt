package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v971: pending mode
internal fun PlayerActivity.showV971PendingToggle() {
    val current = FeaturePrefsStore.batch971.v971pending
    FeaturePrefsStore.batch971.v971pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v971: percent mode
internal fun PlayerActivity.showV971PercentToggle() {
    val current = FeaturePrefsStore.batch971.v971percent
    FeaturePrefsStore.batch971.v971percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v971: perform mode
internal fun PlayerActivity.showV971PerformToggle() {
    val current = FeaturePrefsStore.batch971.v971perform
    FeaturePrefsStore.batch971.v971perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v971: permission mode
internal fun PlayerActivity.showV971PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v971permission
    FeaturePrefsStore.batch971.v971permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v971: persist mode
internal fun PlayerActivity.showV971PersistToggle() {
    val current = FeaturePrefsStore.batch971.v971persist
    FeaturePrefsStore.batch971.v971persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v971: phase level
internal fun PlayerActivity.showV971PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v971: phone level
internal fun PlayerActivity.showV971PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v971: photo level
internal fun PlayerActivity.showV971PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v971: phrase level
internal fun PlayerActivity.showV971PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v971: pick level
internal fun PlayerActivity.showV971PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v971: picture mode
internal fun PlayerActivity.showV971PictureToggle() {
    val current = FeaturePrefsStore.batch971.v971picture
    FeaturePrefsStore.batch971.v971picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v971: pin mode
internal fun PlayerActivity.showV971PinToggle() {
    val current = FeaturePrefsStore.batch971.v971pin
    FeaturePrefsStore.batch971.v971pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v971: pipe mode
internal fun PlayerActivity.showV971PipeToggle() {
    val current = FeaturePrefsStore.batch971.v971pipe
    FeaturePrefsStore.batch971.v971pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v971: pitch mode
internal fun PlayerActivity.showV971PitchToggle() {
    val current = FeaturePrefsStore.batch971.v971pitch
    FeaturePrefsStore.batch971.v971pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v971: pixel mode
internal fun PlayerActivity.showV971PixelToggle() {
    val current = FeaturePrefsStore.batch971.v971pixel
    FeaturePrefsStore.batch971.v971pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v972: pending mode
internal fun PlayerActivity.showV972PendingToggle() {
    val current = FeaturePrefsStore.batch971.v972pending
    FeaturePrefsStore.batch971.v972pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v972: percent mode
internal fun PlayerActivity.showV972PercentToggle() {
    val current = FeaturePrefsStore.batch971.v972percent
    FeaturePrefsStore.batch971.v972percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v972: perform mode
internal fun PlayerActivity.showV972PerformToggle() {
    val current = FeaturePrefsStore.batch971.v972perform
    FeaturePrefsStore.batch971.v972perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v972: permission mode
internal fun PlayerActivity.showV972PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v972permission
    FeaturePrefsStore.batch971.v972permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v972: persist mode
internal fun PlayerActivity.showV972PersistToggle() {
    val current = FeaturePrefsStore.batch971.v972persist
    FeaturePrefsStore.batch971.v972persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v972: phase level
internal fun PlayerActivity.showV972PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v972: phone level
internal fun PlayerActivity.showV972PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v972: photo level
internal fun PlayerActivity.showV972PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v972: phrase level
internal fun PlayerActivity.showV972PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v972: pick level
internal fun PlayerActivity.showV972PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v972: picture mode
internal fun PlayerActivity.showV972PictureToggle() {
    val current = FeaturePrefsStore.batch971.v972picture
    FeaturePrefsStore.batch971.v972picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v972: pin mode
internal fun PlayerActivity.showV972PinToggle() {
    val current = FeaturePrefsStore.batch971.v972pin
    FeaturePrefsStore.batch971.v972pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v972: pipe mode
internal fun PlayerActivity.showV972PipeToggle() {
    val current = FeaturePrefsStore.batch971.v972pipe
    FeaturePrefsStore.batch971.v972pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v972: pitch mode
internal fun PlayerActivity.showV972PitchToggle() {
    val current = FeaturePrefsStore.batch971.v972pitch
    FeaturePrefsStore.batch971.v972pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v972: pixel mode
internal fun PlayerActivity.showV972PixelToggle() {
    val current = FeaturePrefsStore.batch971.v972pixel
    FeaturePrefsStore.batch971.v972pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v973: pending mode
internal fun PlayerActivity.showV973PendingToggle() {
    val current = FeaturePrefsStore.batch971.v973pending
    FeaturePrefsStore.batch971.v973pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v973: percent mode
internal fun PlayerActivity.showV973PercentToggle() {
    val current = FeaturePrefsStore.batch971.v973percent
    FeaturePrefsStore.batch971.v973percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v973: perform mode
internal fun PlayerActivity.showV973PerformToggle() {
    val current = FeaturePrefsStore.batch971.v973perform
    FeaturePrefsStore.batch971.v973perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v973: permission mode
internal fun PlayerActivity.showV973PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v973permission
    FeaturePrefsStore.batch971.v973permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v973: persist mode
internal fun PlayerActivity.showV973PersistToggle() {
    val current = FeaturePrefsStore.batch971.v973persist
    FeaturePrefsStore.batch971.v973persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v973: phase level
internal fun PlayerActivity.showV973PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v973: phone level
internal fun PlayerActivity.showV973PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v973: photo level
internal fun PlayerActivity.showV973PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v973: phrase level
internal fun PlayerActivity.showV973PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v973: pick level
internal fun PlayerActivity.showV973PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v973: picture mode
internal fun PlayerActivity.showV973PictureToggle() {
    val current = FeaturePrefsStore.batch971.v973picture
    FeaturePrefsStore.batch971.v973picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v973: pin mode
internal fun PlayerActivity.showV973PinToggle() {
    val current = FeaturePrefsStore.batch971.v973pin
    FeaturePrefsStore.batch971.v973pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v973: pipe mode
internal fun PlayerActivity.showV973PipeToggle() {
    val current = FeaturePrefsStore.batch971.v973pipe
    FeaturePrefsStore.batch971.v973pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v973: pitch mode
internal fun PlayerActivity.showV973PitchToggle() {
    val current = FeaturePrefsStore.batch971.v973pitch
    FeaturePrefsStore.batch971.v973pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v973: pixel mode
internal fun PlayerActivity.showV973PixelToggle() {
    val current = FeaturePrefsStore.batch971.v973pixel
    FeaturePrefsStore.batch971.v973pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v974: pending mode
internal fun PlayerActivity.showV974PendingToggle() {
    val current = FeaturePrefsStore.batch971.v974pending
    FeaturePrefsStore.batch971.v974pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v974: percent mode
internal fun PlayerActivity.showV974PercentToggle() {
    val current = FeaturePrefsStore.batch971.v974percent
    FeaturePrefsStore.batch971.v974percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v974: perform mode
internal fun PlayerActivity.showV974PerformToggle() {
    val current = FeaturePrefsStore.batch971.v974perform
    FeaturePrefsStore.batch971.v974perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v974: permission mode
internal fun PlayerActivity.showV974PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v974permission
    FeaturePrefsStore.batch971.v974permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v974: persist mode
internal fun PlayerActivity.showV974PersistToggle() {
    val current = FeaturePrefsStore.batch971.v974persist
    FeaturePrefsStore.batch971.v974persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v974: phase level
internal fun PlayerActivity.showV974PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v974: phone level
internal fun PlayerActivity.showV974PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v974: photo level
internal fun PlayerActivity.showV974PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v974: phrase level
internal fun PlayerActivity.showV974PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v974: pick level
internal fun PlayerActivity.showV974PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v974: picture mode
internal fun PlayerActivity.showV974PictureToggle() {
    val current = FeaturePrefsStore.batch971.v974picture
    FeaturePrefsStore.batch971.v974picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v974: pin mode
internal fun PlayerActivity.showV974PinToggle() {
    val current = FeaturePrefsStore.batch971.v974pin
    FeaturePrefsStore.batch971.v974pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v974: pipe mode
internal fun PlayerActivity.showV974PipeToggle() {
    val current = FeaturePrefsStore.batch971.v974pipe
    FeaturePrefsStore.batch971.v974pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v974: pitch mode
internal fun PlayerActivity.showV974PitchToggle() {
    val current = FeaturePrefsStore.batch971.v974pitch
    FeaturePrefsStore.batch971.v974pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v974: pixel mode
internal fun PlayerActivity.showV974PixelToggle() {
    val current = FeaturePrefsStore.batch971.v974pixel
    FeaturePrefsStore.batch971.v974pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v975: pending mode
internal fun PlayerActivity.showV975PendingToggle() {
    val current = FeaturePrefsStore.batch971.v975pending
    FeaturePrefsStore.batch971.v975pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v975: percent mode
internal fun PlayerActivity.showV975PercentToggle() {
    val current = FeaturePrefsStore.batch971.v975percent
    FeaturePrefsStore.batch971.v975percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v975: perform mode
internal fun PlayerActivity.showV975PerformToggle() {
    val current = FeaturePrefsStore.batch971.v975perform
    FeaturePrefsStore.batch971.v975perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v975: permission mode
internal fun PlayerActivity.showV975PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v975permission
    FeaturePrefsStore.batch971.v975permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v975: persist mode
internal fun PlayerActivity.showV975PersistToggle() {
    val current = FeaturePrefsStore.batch971.v975persist
    FeaturePrefsStore.batch971.v975persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v975: phase level
internal fun PlayerActivity.showV975PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v975: phone level
internal fun PlayerActivity.showV975PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v975: photo level
internal fun PlayerActivity.showV975PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v975: phrase level
internal fun PlayerActivity.showV975PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v975: pick level
internal fun PlayerActivity.showV975PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v975: picture mode
internal fun PlayerActivity.showV975PictureToggle() {
    val current = FeaturePrefsStore.batch971.v975picture
    FeaturePrefsStore.batch971.v975picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v975: pin mode
internal fun PlayerActivity.showV975PinToggle() {
    val current = FeaturePrefsStore.batch971.v975pin
    FeaturePrefsStore.batch971.v975pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v975: pipe mode
internal fun PlayerActivity.showV975PipeToggle() {
    val current = FeaturePrefsStore.batch971.v975pipe
    FeaturePrefsStore.batch971.v975pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v975: pitch mode
internal fun PlayerActivity.showV975PitchToggle() {
    val current = FeaturePrefsStore.batch971.v975pitch
    FeaturePrefsStore.batch971.v975pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v975: pixel mode
internal fun PlayerActivity.showV975PixelToggle() {
    val current = FeaturePrefsStore.batch971.v975pixel
    FeaturePrefsStore.batch971.v975pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v976: pending mode
internal fun PlayerActivity.showV976PendingToggle() {
    val current = FeaturePrefsStore.batch971.v976pending
    FeaturePrefsStore.batch971.v976pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v976: percent mode
internal fun PlayerActivity.showV976PercentToggle() {
    val current = FeaturePrefsStore.batch971.v976percent
    FeaturePrefsStore.batch971.v976percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v976: perform mode
internal fun PlayerActivity.showV976PerformToggle() {
    val current = FeaturePrefsStore.batch971.v976perform
    FeaturePrefsStore.batch971.v976perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v976: permission mode
internal fun PlayerActivity.showV976PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v976permission
    FeaturePrefsStore.batch971.v976permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v976: persist mode
internal fun PlayerActivity.showV976PersistToggle() {
    val current = FeaturePrefsStore.batch971.v976persist
    FeaturePrefsStore.batch971.v976persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v976: phase level
internal fun PlayerActivity.showV976PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v976: phone level
internal fun PlayerActivity.showV976PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v976: photo level
internal fun PlayerActivity.showV976PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v976: phrase level
internal fun PlayerActivity.showV976PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v976: pick level
internal fun PlayerActivity.showV976PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v976: picture mode
internal fun PlayerActivity.showV976PictureToggle() {
    val current = FeaturePrefsStore.batch971.v976picture
    FeaturePrefsStore.batch971.v976picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v976: pin mode
internal fun PlayerActivity.showV976PinToggle() {
    val current = FeaturePrefsStore.batch971.v976pin
    FeaturePrefsStore.batch971.v976pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v976: pipe mode
internal fun PlayerActivity.showV976PipeToggle() {
    val current = FeaturePrefsStore.batch971.v976pipe
    FeaturePrefsStore.batch971.v976pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v976: pitch mode
internal fun PlayerActivity.showV976PitchToggle() {
    val current = FeaturePrefsStore.batch971.v976pitch
    FeaturePrefsStore.batch971.v976pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v976: pixel mode
internal fun PlayerActivity.showV976PixelToggle() {
    val current = FeaturePrefsStore.batch971.v976pixel
    FeaturePrefsStore.batch971.v976pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v977: pending mode
internal fun PlayerActivity.showV977PendingToggle() {
    val current = FeaturePrefsStore.batch971.v977pending
    FeaturePrefsStore.batch971.v977pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v977: percent mode
internal fun PlayerActivity.showV977PercentToggle() {
    val current = FeaturePrefsStore.batch971.v977percent
    FeaturePrefsStore.batch971.v977percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v977: perform mode
internal fun PlayerActivity.showV977PerformToggle() {
    val current = FeaturePrefsStore.batch971.v977perform
    FeaturePrefsStore.batch971.v977perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v977: permission mode
internal fun PlayerActivity.showV977PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v977permission
    FeaturePrefsStore.batch971.v977permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v977: persist mode
internal fun PlayerActivity.showV977PersistToggle() {
    val current = FeaturePrefsStore.batch971.v977persist
    FeaturePrefsStore.batch971.v977persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v977: phase level
internal fun PlayerActivity.showV977PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v977: phone level
internal fun PlayerActivity.showV977PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v977: photo level
internal fun PlayerActivity.showV977PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v977: phrase level
internal fun PlayerActivity.showV977PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v977: pick level
internal fun PlayerActivity.showV977PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v977: picture mode
internal fun PlayerActivity.showV977PictureToggle() {
    val current = FeaturePrefsStore.batch971.v977picture
    FeaturePrefsStore.batch971.v977picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v977: pin mode
internal fun PlayerActivity.showV977PinToggle() {
    val current = FeaturePrefsStore.batch971.v977pin
    FeaturePrefsStore.batch971.v977pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v977: pipe mode
internal fun PlayerActivity.showV977PipeToggle() {
    val current = FeaturePrefsStore.batch971.v977pipe
    FeaturePrefsStore.batch971.v977pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v977: pitch mode
internal fun PlayerActivity.showV977PitchToggle() {
    val current = FeaturePrefsStore.batch971.v977pitch
    FeaturePrefsStore.batch971.v977pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v977: pixel mode
internal fun PlayerActivity.showV977PixelToggle() {
    val current = FeaturePrefsStore.batch971.v977pixel
    FeaturePrefsStore.batch971.v977pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v978: pending mode
internal fun PlayerActivity.showV978PendingToggle() {
    val current = FeaturePrefsStore.batch971.v978pending
    FeaturePrefsStore.batch971.v978pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v978: percent mode
internal fun PlayerActivity.showV978PercentToggle() {
    val current = FeaturePrefsStore.batch971.v978percent
    FeaturePrefsStore.batch971.v978percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v978: perform mode
internal fun PlayerActivity.showV978PerformToggle() {
    val current = FeaturePrefsStore.batch971.v978perform
    FeaturePrefsStore.batch971.v978perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v978: permission mode
internal fun PlayerActivity.showV978PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v978permission
    FeaturePrefsStore.batch971.v978permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v978: persist mode
internal fun PlayerActivity.showV978PersistToggle() {
    val current = FeaturePrefsStore.batch971.v978persist
    FeaturePrefsStore.batch971.v978persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v978: phase level
internal fun PlayerActivity.showV978PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v978: phone level
internal fun PlayerActivity.showV978PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v978: photo level
internal fun PlayerActivity.showV978PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v978: phrase level
internal fun PlayerActivity.showV978PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v978: pick level
internal fun PlayerActivity.showV978PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v978: picture mode
internal fun PlayerActivity.showV978PictureToggle() {
    val current = FeaturePrefsStore.batch971.v978picture
    FeaturePrefsStore.batch971.v978picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v978: pin mode
internal fun PlayerActivity.showV978PinToggle() {
    val current = FeaturePrefsStore.batch971.v978pin
    FeaturePrefsStore.batch971.v978pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v978: pipe mode
internal fun PlayerActivity.showV978PipeToggle() {
    val current = FeaturePrefsStore.batch971.v978pipe
    FeaturePrefsStore.batch971.v978pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v978: pitch mode
internal fun PlayerActivity.showV978PitchToggle() {
    val current = FeaturePrefsStore.batch971.v978pitch
    FeaturePrefsStore.batch971.v978pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v978: pixel mode
internal fun PlayerActivity.showV978PixelToggle() {
    val current = FeaturePrefsStore.batch971.v978pixel
    FeaturePrefsStore.batch971.v978pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v979: pending mode
internal fun PlayerActivity.showV979PendingToggle() {
    val current = FeaturePrefsStore.batch971.v979pending
    FeaturePrefsStore.batch971.v979pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v979: percent mode
internal fun PlayerActivity.showV979PercentToggle() {
    val current = FeaturePrefsStore.batch971.v979percent
    FeaturePrefsStore.batch971.v979percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v979: perform mode
internal fun PlayerActivity.showV979PerformToggle() {
    val current = FeaturePrefsStore.batch971.v979perform
    FeaturePrefsStore.batch971.v979perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v979: permission mode
internal fun PlayerActivity.showV979PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v979permission
    FeaturePrefsStore.batch971.v979permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v979: persist mode
internal fun PlayerActivity.showV979PersistToggle() {
    val current = FeaturePrefsStore.batch971.v979persist
    FeaturePrefsStore.batch971.v979persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v979: phase level
internal fun PlayerActivity.showV979PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v979: phone level
internal fun PlayerActivity.showV979PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v979: photo level
internal fun PlayerActivity.showV979PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v979: phrase level
internal fun PlayerActivity.showV979PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v979: pick level
internal fun PlayerActivity.showV979PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v979: picture mode
internal fun PlayerActivity.showV979PictureToggle() {
    val current = FeaturePrefsStore.batch971.v979picture
    FeaturePrefsStore.batch971.v979picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v979: pin mode
internal fun PlayerActivity.showV979PinToggle() {
    val current = FeaturePrefsStore.batch971.v979pin
    FeaturePrefsStore.batch971.v979pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v979: pipe mode
internal fun PlayerActivity.showV979PipeToggle() {
    val current = FeaturePrefsStore.batch971.v979pipe
    FeaturePrefsStore.batch971.v979pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v979: pitch mode
internal fun PlayerActivity.showV979PitchToggle() {
    val current = FeaturePrefsStore.batch971.v979pitch
    FeaturePrefsStore.batch971.v979pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v979: pixel mode
internal fun PlayerActivity.showV979PixelToggle() {
    val current = FeaturePrefsStore.batch971.v979pixel
    FeaturePrefsStore.batch971.v979pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v980: pending mode
internal fun PlayerActivity.showV980PendingToggle() {
    val current = FeaturePrefsStore.batch971.v980pending
    FeaturePrefsStore.batch971.v980pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v980: percent mode
internal fun PlayerActivity.showV980PercentToggle() {
    val current = FeaturePrefsStore.batch971.v980percent
    FeaturePrefsStore.batch971.v980percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v980: perform mode
internal fun PlayerActivity.showV980PerformToggle() {
    val current = FeaturePrefsStore.batch971.v980perform
    FeaturePrefsStore.batch971.v980perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v980: permission mode
internal fun PlayerActivity.showV980PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v980permission
    FeaturePrefsStore.batch971.v980permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v980: persist mode
internal fun PlayerActivity.showV980PersistToggle() {
    val current = FeaturePrefsStore.batch971.v980persist
    FeaturePrefsStore.batch971.v980persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v980: phase level
internal fun PlayerActivity.showV980PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v980: phone level
internal fun PlayerActivity.showV980PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v980: photo level
internal fun PlayerActivity.showV980PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v980: phrase level
internal fun PlayerActivity.showV980PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v980: pick level
internal fun PlayerActivity.showV980PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v980: picture mode
internal fun PlayerActivity.showV980PictureToggle() {
    val current = FeaturePrefsStore.batch971.v980picture
    FeaturePrefsStore.batch971.v980picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v980: pin mode
internal fun PlayerActivity.showV980PinToggle() {
    val current = FeaturePrefsStore.batch971.v980pin
    FeaturePrefsStore.batch971.v980pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v980: pipe mode
internal fun PlayerActivity.showV980PipeToggle() {
    val current = FeaturePrefsStore.batch971.v980pipe
    FeaturePrefsStore.batch971.v980pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v980: pitch mode
internal fun PlayerActivity.showV980PitchToggle() {
    val current = FeaturePrefsStore.batch971.v980pitch
    FeaturePrefsStore.batch971.v980pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v980: pixel mode
internal fun PlayerActivity.showV980PixelToggle() {
    val current = FeaturePrefsStore.batch971.v980pixel
    FeaturePrefsStore.batch971.v980pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

