package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1061: send mode
internal fun PlayerActivity.showV1061SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1061send
    FeaturePrefsStore.batch1061.v1061send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1061: sensor mode
internal fun PlayerActivity.showV1061SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1061sensor
    FeaturePrefsStore.batch1061.v1061sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1061: sequence mode
internal fun PlayerActivity.showV1061SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1061sequence
    FeaturePrefsStore.batch1061.v1061sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1061: serial mode
internal fun PlayerActivity.showV1061SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1061serial
    FeaturePrefsStore.batch1061.v1061serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1061: server mode
internal fun PlayerActivity.showV1061ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1061server
    FeaturePrefsStore.batch1061.v1061server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1061: service level
internal fun PlayerActivity.showV1061ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1061service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1061service = value
        AppToast.show(this, "service: $value")
    }
}

// v1061: session level
internal fun PlayerActivity.showV1061SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1061session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1061session = value
        AppToast.show(this, "session: $value")
    }
}

// v1061: set level
internal fun PlayerActivity.showV1061SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1061set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1061set = value
        AppToast.show(this, "set: $value")
    }
}

// v1061: setting level
internal fun PlayerActivity.showV1061SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1061setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1061setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1061: setup level
internal fun PlayerActivity.showV1061SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1061setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1061setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1061: shadow mode
internal fun PlayerActivity.showV1061ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1061shadow
    FeaturePrefsStore.batch1061.v1061shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1061: shape mode
internal fun PlayerActivity.showV1061ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1061shape
    FeaturePrefsStore.batch1061.v1061shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1061: share mode
internal fun PlayerActivity.showV1061ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1061share
    FeaturePrefsStore.batch1061.v1061share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1061: sharp mode
internal fun PlayerActivity.showV1061SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1061sharp
    FeaturePrefsStore.batch1061.v1061sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1061: shift mode
internal fun PlayerActivity.showV1061ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1061shift
    FeaturePrefsStore.batch1061.v1061shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1062: send mode
internal fun PlayerActivity.showV1062SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1062send
    FeaturePrefsStore.batch1061.v1062send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1062: sensor mode
internal fun PlayerActivity.showV1062SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1062sensor
    FeaturePrefsStore.batch1061.v1062sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1062: sequence mode
internal fun PlayerActivity.showV1062SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1062sequence
    FeaturePrefsStore.batch1061.v1062sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1062: serial mode
internal fun PlayerActivity.showV1062SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1062serial
    FeaturePrefsStore.batch1061.v1062serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1062: server mode
internal fun PlayerActivity.showV1062ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1062server
    FeaturePrefsStore.batch1061.v1062server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1062: service level
internal fun PlayerActivity.showV1062ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1062service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1062service = value
        AppToast.show(this, "service: $value")
    }
}

// v1062: session level
internal fun PlayerActivity.showV1062SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1062session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1062session = value
        AppToast.show(this, "session: $value")
    }
}

// v1062: set level
internal fun PlayerActivity.showV1062SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1062set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1062set = value
        AppToast.show(this, "set: $value")
    }
}

// v1062: setting level
internal fun PlayerActivity.showV1062SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1062setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1062setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1062: setup level
internal fun PlayerActivity.showV1062SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1062setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1062setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1062: shadow mode
internal fun PlayerActivity.showV1062ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1062shadow
    FeaturePrefsStore.batch1061.v1062shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1062: shape mode
internal fun PlayerActivity.showV1062ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1062shape
    FeaturePrefsStore.batch1061.v1062shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1062: share mode
internal fun PlayerActivity.showV1062ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1062share
    FeaturePrefsStore.batch1061.v1062share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1062: sharp mode
internal fun PlayerActivity.showV1062SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1062sharp
    FeaturePrefsStore.batch1061.v1062sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1062: shift mode
internal fun PlayerActivity.showV1062ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1062shift
    FeaturePrefsStore.batch1061.v1062shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1063: send mode
internal fun PlayerActivity.showV1063SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1063send
    FeaturePrefsStore.batch1061.v1063send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1063: sensor mode
internal fun PlayerActivity.showV1063SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1063sensor
    FeaturePrefsStore.batch1061.v1063sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1063: sequence mode
internal fun PlayerActivity.showV1063SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1063sequence
    FeaturePrefsStore.batch1061.v1063sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1063: serial mode
internal fun PlayerActivity.showV1063SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1063serial
    FeaturePrefsStore.batch1061.v1063serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1063: server mode
internal fun PlayerActivity.showV1063ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1063server
    FeaturePrefsStore.batch1061.v1063server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1063: service level
internal fun PlayerActivity.showV1063ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1063service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1063service = value
        AppToast.show(this, "service: $value")
    }
}

// v1063: session level
internal fun PlayerActivity.showV1063SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1063session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1063session = value
        AppToast.show(this, "session: $value")
    }
}

// v1063: set level
internal fun PlayerActivity.showV1063SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1063set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1063set = value
        AppToast.show(this, "set: $value")
    }
}

// v1063: setting level
internal fun PlayerActivity.showV1063SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1063setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1063setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1063: setup level
internal fun PlayerActivity.showV1063SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1063setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1063setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1063: shadow mode
internal fun PlayerActivity.showV1063ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1063shadow
    FeaturePrefsStore.batch1061.v1063shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1063: shape mode
internal fun PlayerActivity.showV1063ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1063shape
    FeaturePrefsStore.batch1061.v1063shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1063: share mode
internal fun PlayerActivity.showV1063ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1063share
    FeaturePrefsStore.batch1061.v1063share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1063: sharp mode
internal fun PlayerActivity.showV1063SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1063sharp
    FeaturePrefsStore.batch1061.v1063sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1063: shift mode
internal fun PlayerActivity.showV1063ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1063shift
    FeaturePrefsStore.batch1061.v1063shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1064: send mode
internal fun PlayerActivity.showV1064SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1064send
    FeaturePrefsStore.batch1061.v1064send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1064: sensor mode
internal fun PlayerActivity.showV1064SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1064sensor
    FeaturePrefsStore.batch1061.v1064sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1064: sequence mode
internal fun PlayerActivity.showV1064SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1064sequence
    FeaturePrefsStore.batch1061.v1064sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1064: serial mode
internal fun PlayerActivity.showV1064SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1064serial
    FeaturePrefsStore.batch1061.v1064serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1064: server mode
internal fun PlayerActivity.showV1064ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1064server
    FeaturePrefsStore.batch1061.v1064server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1064: service level
internal fun PlayerActivity.showV1064ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1064service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1064service = value
        AppToast.show(this, "service: $value")
    }
}

// v1064: session level
internal fun PlayerActivity.showV1064SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1064session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1064session = value
        AppToast.show(this, "session: $value")
    }
}

// v1064: set level
internal fun PlayerActivity.showV1064SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1064set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1064set = value
        AppToast.show(this, "set: $value")
    }
}

// v1064: setting level
internal fun PlayerActivity.showV1064SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1064setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1064setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1064: setup level
internal fun PlayerActivity.showV1064SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1064setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1064setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1064: shadow mode
internal fun PlayerActivity.showV1064ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1064shadow
    FeaturePrefsStore.batch1061.v1064shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1064: shape mode
internal fun PlayerActivity.showV1064ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1064shape
    FeaturePrefsStore.batch1061.v1064shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1064: share mode
internal fun PlayerActivity.showV1064ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1064share
    FeaturePrefsStore.batch1061.v1064share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1064: sharp mode
internal fun PlayerActivity.showV1064SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1064sharp
    FeaturePrefsStore.batch1061.v1064sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1064: shift mode
internal fun PlayerActivity.showV1064ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1064shift
    FeaturePrefsStore.batch1061.v1064shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1065: send mode
internal fun PlayerActivity.showV1065SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1065send
    FeaturePrefsStore.batch1061.v1065send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1065: sensor mode
internal fun PlayerActivity.showV1065SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1065sensor
    FeaturePrefsStore.batch1061.v1065sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1065: sequence mode
internal fun PlayerActivity.showV1065SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1065sequence
    FeaturePrefsStore.batch1061.v1065sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1065: serial mode
internal fun PlayerActivity.showV1065SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1065serial
    FeaturePrefsStore.batch1061.v1065serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1065: server mode
internal fun PlayerActivity.showV1065ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1065server
    FeaturePrefsStore.batch1061.v1065server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1065: service level
internal fun PlayerActivity.showV1065ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1065service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1065service = value
        AppToast.show(this, "service: $value")
    }
}

// v1065: session level
internal fun PlayerActivity.showV1065SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1065session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1065session = value
        AppToast.show(this, "session: $value")
    }
}

// v1065: set level
internal fun PlayerActivity.showV1065SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1065set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1065set = value
        AppToast.show(this, "set: $value")
    }
}

// v1065: setting level
internal fun PlayerActivity.showV1065SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1065setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1065setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1065: setup level
internal fun PlayerActivity.showV1065SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1065setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1065setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1065: shadow mode
internal fun PlayerActivity.showV1065ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1065shadow
    FeaturePrefsStore.batch1061.v1065shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1065: shape mode
internal fun PlayerActivity.showV1065ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1065shape
    FeaturePrefsStore.batch1061.v1065shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1065: share mode
internal fun PlayerActivity.showV1065ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1065share
    FeaturePrefsStore.batch1061.v1065share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1065: sharp mode
internal fun PlayerActivity.showV1065SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1065sharp
    FeaturePrefsStore.batch1061.v1065sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1065: shift mode
internal fun PlayerActivity.showV1065ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1065shift
    FeaturePrefsStore.batch1061.v1065shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1066: send mode
internal fun PlayerActivity.showV1066SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1066send
    FeaturePrefsStore.batch1061.v1066send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1066: sensor mode
internal fun PlayerActivity.showV1066SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1066sensor
    FeaturePrefsStore.batch1061.v1066sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1066: sequence mode
internal fun PlayerActivity.showV1066SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1066sequence
    FeaturePrefsStore.batch1061.v1066sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1066: serial mode
internal fun PlayerActivity.showV1066SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1066serial
    FeaturePrefsStore.batch1061.v1066serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1066: server mode
internal fun PlayerActivity.showV1066ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1066server
    FeaturePrefsStore.batch1061.v1066server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1066: service level
internal fun PlayerActivity.showV1066ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1066service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1066service = value
        AppToast.show(this, "service: $value")
    }
}

// v1066: session level
internal fun PlayerActivity.showV1066SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1066session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1066session = value
        AppToast.show(this, "session: $value")
    }
}

// v1066: set level
internal fun PlayerActivity.showV1066SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1066set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1066set = value
        AppToast.show(this, "set: $value")
    }
}

// v1066: setting level
internal fun PlayerActivity.showV1066SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1066setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1066setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1066: setup level
internal fun PlayerActivity.showV1066SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1066setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1066setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1066: shadow mode
internal fun PlayerActivity.showV1066ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1066shadow
    FeaturePrefsStore.batch1061.v1066shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1066: shape mode
internal fun PlayerActivity.showV1066ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1066shape
    FeaturePrefsStore.batch1061.v1066shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1066: share mode
internal fun PlayerActivity.showV1066ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1066share
    FeaturePrefsStore.batch1061.v1066share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1066: sharp mode
internal fun PlayerActivity.showV1066SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1066sharp
    FeaturePrefsStore.batch1061.v1066sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1066: shift mode
internal fun PlayerActivity.showV1066ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1066shift
    FeaturePrefsStore.batch1061.v1066shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1067: send mode
internal fun PlayerActivity.showV1067SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1067send
    FeaturePrefsStore.batch1061.v1067send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1067: sensor mode
internal fun PlayerActivity.showV1067SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1067sensor
    FeaturePrefsStore.batch1061.v1067sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1067: sequence mode
internal fun PlayerActivity.showV1067SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1067sequence
    FeaturePrefsStore.batch1061.v1067sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1067: serial mode
internal fun PlayerActivity.showV1067SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1067serial
    FeaturePrefsStore.batch1061.v1067serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1067: server mode
internal fun PlayerActivity.showV1067ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1067server
    FeaturePrefsStore.batch1061.v1067server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1067: service level
internal fun PlayerActivity.showV1067ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1067service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1067service = value
        AppToast.show(this, "service: $value")
    }
}

// v1067: session level
internal fun PlayerActivity.showV1067SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1067session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1067session = value
        AppToast.show(this, "session: $value")
    }
}

// v1067: set level
internal fun PlayerActivity.showV1067SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1067set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1067set = value
        AppToast.show(this, "set: $value")
    }
}

// v1067: setting level
internal fun PlayerActivity.showV1067SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1067setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1067setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1067: setup level
internal fun PlayerActivity.showV1067SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1067setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1067setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1067: shadow mode
internal fun PlayerActivity.showV1067ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1067shadow
    FeaturePrefsStore.batch1061.v1067shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1067: shape mode
internal fun PlayerActivity.showV1067ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1067shape
    FeaturePrefsStore.batch1061.v1067shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1067: share mode
internal fun PlayerActivity.showV1067ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1067share
    FeaturePrefsStore.batch1061.v1067share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1067: sharp mode
internal fun PlayerActivity.showV1067SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1067sharp
    FeaturePrefsStore.batch1061.v1067sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1067: shift mode
internal fun PlayerActivity.showV1067ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1067shift
    FeaturePrefsStore.batch1061.v1067shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1068: send mode
internal fun PlayerActivity.showV1068SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1068send
    FeaturePrefsStore.batch1061.v1068send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1068: sensor mode
internal fun PlayerActivity.showV1068SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1068sensor
    FeaturePrefsStore.batch1061.v1068sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1068: sequence mode
internal fun PlayerActivity.showV1068SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1068sequence
    FeaturePrefsStore.batch1061.v1068sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1068: serial mode
internal fun PlayerActivity.showV1068SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1068serial
    FeaturePrefsStore.batch1061.v1068serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1068: server mode
internal fun PlayerActivity.showV1068ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1068server
    FeaturePrefsStore.batch1061.v1068server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1068: service level
internal fun PlayerActivity.showV1068ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1068service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1068service = value
        AppToast.show(this, "service: $value")
    }
}

// v1068: session level
internal fun PlayerActivity.showV1068SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1068session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1068session = value
        AppToast.show(this, "session: $value")
    }
}

// v1068: set level
internal fun PlayerActivity.showV1068SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1068set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1068set = value
        AppToast.show(this, "set: $value")
    }
}

// v1068: setting level
internal fun PlayerActivity.showV1068SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1068setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1068setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1068: setup level
internal fun PlayerActivity.showV1068SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1068setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1068setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1068: shadow mode
internal fun PlayerActivity.showV1068ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1068shadow
    FeaturePrefsStore.batch1061.v1068shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1068: shape mode
internal fun PlayerActivity.showV1068ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1068shape
    FeaturePrefsStore.batch1061.v1068shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1068: share mode
internal fun PlayerActivity.showV1068ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1068share
    FeaturePrefsStore.batch1061.v1068share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1068: sharp mode
internal fun PlayerActivity.showV1068SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1068sharp
    FeaturePrefsStore.batch1061.v1068sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1068: shift mode
internal fun PlayerActivity.showV1068ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1068shift
    FeaturePrefsStore.batch1061.v1068shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1069: send mode
internal fun PlayerActivity.showV1069SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1069send
    FeaturePrefsStore.batch1061.v1069send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1069: sensor mode
internal fun PlayerActivity.showV1069SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1069sensor
    FeaturePrefsStore.batch1061.v1069sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1069: sequence mode
internal fun PlayerActivity.showV1069SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1069sequence
    FeaturePrefsStore.batch1061.v1069sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1069: serial mode
internal fun PlayerActivity.showV1069SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1069serial
    FeaturePrefsStore.batch1061.v1069serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1069: server mode
internal fun PlayerActivity.showV1069ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1069server
    FeaturePrefsStore.batch1061.v1069server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1069: service level
internal fun PlayerActivity.showV1069ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1069service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1069service = value
        AppToast.show(this, "service: $value")
    }
}

// v1069: session level
internal fun PlayerActivity.showV1069SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1069session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1069session = value
        AppToast.show(this, "session: $value")
    }
}

// v1069: set level
internal fun PlayerActivity.showV1069SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1069set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1069set = value
        AppToast.show(this, "set: $value")
    }
}

// v1069: setting level
internal fun PlayerActivity.showV1069SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1069setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1069setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1069: setup level
internal fun PlayerActivity.showV1069SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1069setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1069setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1069: shadow mode
internal fun PlayerActivity.showV1069ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1069shadow
    FeaturePrefsStore.batch1061.v1069shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1069: shape mode
internal fun PlayerActivity.showV1069ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1069shape
    FeaturePrefsStore.batch1061.v1069shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1069: share mode
internal fun PlayerActivity.showV1069ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1069share
    FeaturePrefsStore.batch1061.v1069share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1069: sharp mode
internal fun PlayerActivity.showV1069SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1069sharp
    FeaturePrefsStore.batch1061.v1069sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1069: shift mode
internal fun PlayerActivity.showV1069ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1069shift
    FeaturePrefsStore.batch1061.v1069shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

// v1070: send mode
internal fun PlayerActivity.showV1070SendToggle() {
    val current = FeaturePrefsStore.batch1061.v1070send
    FeaturePrefsStore.batch1061.v1070send = !current
    AppToast.show(this, "send: ${if (!current) "ON" else "OFF"}")
}

// v1070: sensor mode
internal fun PlayerActivity.showV1070SensorToggle() {
    val current = FeaturePrefsStore.batch1061.v1070sensor
    FeaturePrefsStore.batch1061.v1070sensor = !current
    AppToast.show(this, "sensor: ${if (!current) "ON" else "OFF"}")
}

// v1070: sequence mode
internal fun PlayerActivity.showV1070SequenceToggle() {
    val current = FeaturePrefsStore.batch1061.v1070sequence
    FeaturePrefsStore.batch1061.v1070sequence = !current
    AppToast.show(this, "sequence: ${if (!current) "ON" else "OFF"}")
}

// v1070: serial mode
internal fun PlayerActivity.showV1070SerialToggle() {
    val current = FeaturePrefsStore.batch1061.v1070serial
    FeaturePrefsStore.batch1061.v1070serial = !current
    AppToast.show(this, "serial: ${if (!current) "ON" else "OFF"}")
}

// v1070: server mode
internal fun PlayerActivity.showV1070ServerToggle() {
    val current = FeaturePrefsStore.batch1061.v1070server
    FeaturePrefsStore.batch1061.v1070server = !current
    AppToast.show(this, "server: ${if (!current) "ON" else "OFF"}")
}

// v1070: service level
internal fun PlayerActivity.showV1070ServiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1070service).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "service level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1070service = value
        AppToast.show(this, "service: $value")
    }
}

// v1070: session level
internal fun PlayerActivity.showV1070SessionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1070session).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "session level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1070session = value
        AppToast.show(this, "session: $value")
    }
}

// v1070: set level
internal fun PlayerActivity.showV1070SetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1070set).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "set level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1070set = value
        AppToast.show(this, "set: $value")
    }
}

// v1070: setting level
internal fun PlayerActivity.showV1070SettingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1070setting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1070setting = value
        AppToast.show(this, "setting: $value")
    }
}

// v1070: setup level
internal fun PlayerActivity.showV1070SetupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1061.v1070setup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "setup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1061.v1070setup = value
        AppToast.show(this, "setup: $value")
    }
}

// v1070: shadow mode
internal fun PlayerActivity.showV1070ShadowToggle() {
    val current = FeaturePrefsStore.batch1061.v1070shadow
    FeaturePrefsStore.batch1061.v1070shadow = !current
    AppToast.show(this, "shadow: ${if (!current) "ON" else "OFF"}")
}

// v1070: shape mode
internal fun PlayerActivity.showV1070ShapeToggle() {
    val current = FeaturePrefsStore.batch1061.v1070shape
    FeaturePrefsStore.batch1061.v1070shape = !current
    AppToast.show(this, "shape: ${if (!current) "ON" else "OFF"}")
}

// v1070: share mode
internal fun PlayerActivity.showV1070ShareToggle() {
    val current = FeaturePrefsStore.batch1061.v1070share
    FeaturePrefsStore.batch1061.v1070share = !current
    AppToast.show(this, "share: ${if (!current) "ON" else "OFF"}")
}

// v1070: sharp mode
internal fun PlayerActivity.showV1070SharpToggle() {
    val current = FeaturePrefsStore.batch1061.v1070sharp
    FeaturePrefsStore.batch1061.v1070sharp = !current
    AppToast.show(this, "sharp: ${if (!current) "ON" else "OFF"}")
}

// v1070: shift mode
internal fun PlayerActivity.showV1070ShiftToggle() {
    val current = FeaturePrefsStore.batch1061.v1070shift
    FeaturePrefsStore.batch1061.v1070shift = !current
    AppToast.show(this, "shift: ${if (!current) "ON" else "OFF"}")
}

