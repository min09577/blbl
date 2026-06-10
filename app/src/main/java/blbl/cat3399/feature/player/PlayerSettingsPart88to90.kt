package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v1071: short mode
internal fun PlayerActivity.showV1071ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1071short
    FeaturePrefsStore.batch1071.v1071short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1071: show mode
internal fun PlayerActivity.showV1071ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1071show
    FeaturePrefsStore.batch1071.v1071show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1071: shrink mode
internal fun PlayerActivity.showV1071ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1071shrink
    FeaturePrefsStore.batch1071.v1071shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1071: side mode
internal fun PlayerActivity.showV1071SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1071side
    FeaturePrefsStore.batch1071.v1071side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1071: sign mode
internal fun PlayerActivity.showV1071SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1071sign
    FeaturePrefsStore.batch1071.v1071sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1071: signal level
internal fun PlayerActivity.showV1071SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1071: silence level
internal fun PlayerActivity.showV1071SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1071: simple level
internal fun PlayerActivity.showV1071SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1071: single level
internal fun PlayerActivity.showV1071SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071single = value
        AppToast.show(this, "single: $value")
    }
}

// v1071: site level
internal fun PlayerActivity.showV1071SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071site = value
        AppToast.show(this, "site: $value")
    }
}

// v1071: size mode
internal fun PlayerActivity.showV1071SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1071size
    FeaturePrefsStore.batch1071.v1071size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1071: skip mode
internal fun PlayerActivity.showV1071SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1071skip
    FeaturePrefsStore.batch1071.v1071skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1071: sleep mode
internal fun PlayerActivity.showV1071SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1071sleep
    FeaturePrefsStore.batch1071.v1071sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1071: slice mode
internal fun PlayerActivity.showV1071SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1071slice
    FeaturePrefsStore.batch1071.v1071slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1071: slide mode
internal fun PlayerActivity.showV1071SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1071slide
    FeaturePrefsStore.batch1071.v1071slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1072: short mode
internal fun PlayerActivity.showV1072ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1072short
    FeaturePrefsStore.batch1071.v1072short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1072: show mode
internal fun PlayerActivity.showV1072ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1072show
    FeaturePrefsStore.batch1071.v1072show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1072: shrink mode
internal fun PlayerActivity.showV1072ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1072shrink
    FeaturePrefsStore.batch1071.v1072shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1072: side mode
internal fun PlayerActivity.showV1072SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1072side
    FeaturePrefsStore.batch1071.v1072side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1072: sign mode
internal fun PlayerActivity.showV1072SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1072sign
    FeaturePrefsStore.batch1071.v1072sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1072: signal level
internal fun PlayerActivity.showV1072SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1072: silence level
internal fun PlayerActivity.showV1072SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1072: simple level
internal fun PlayerActivity.showV1072SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1072: single level
internal fun PlayerActivity.showV1072SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072single = value
        AppToast.show(this, "single: $value")
    }
}

// v1072: site level
internal fun PlayerActivity.showV1072SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072site = value
        AppToast.show(this, "site: $value")
    }
}

// v1072: size mode
internal fun PlayerActivity.showV1072SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1072size
    FeaturePrefsStore.batch1071.v1072size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1072: skip mode
internal fun PlayerActivity.showV1072SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1072skip
    FeaturePrefsStore.batch1071.v1072skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1072: sleep mode
internal fun PlayerActivity.showV1072SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1072sleep
    FeaturePrefsStore.batch1071.v1072sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1072: slice mode
internal fun PlayerActivity.showV1072SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1072slice
    FeaturePrefsStore.batch1071.v1072slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1072: slide mode
internal fun PlayerActivity.showV1072SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1072slide
    FeaturePrefsStore.batch1071.v1072slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1073: short mode
internal fun PlayerActivity.showV1073ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1073short
    FeaturePrefsStore.batch1071.v1073short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1073: show mode
internal fun PlayerActivity.showV1073ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1073show
    FeaturePrefsStore.batch1071.v1073show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1073: shrink mode
internal fun PlayerActivity.showV1073ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1073shrink
    FeaturePrefsStore.batch1071.v1073shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1073: side mode
internal fun PlayerActivity.showV1073SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1073side
    FeaturePrefsStore.batch1071.v1073side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1073: sign mode
internal fun PlayerActivity.showV1073SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1073sign
    FeaturePrefsStore.batch1071.v1073sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1073: signal level
internal fun PlayerActivity.showV1073SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1073: silence level
internal fun PlayerActivity.showV1073SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1073: simple level
internal fun PlayerActivity.showV1073SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1073: single level
internal fun PlayerActivity.showV1073SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073single = value
        AppToast.show(this, "single: $value")
    }
}

// v1073: site level
internal fun PlayerActivity.showV1073SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073site = value
        AppToast.show(this, "site: $value")
    }
}

// v1073: size mode
internal fun PlayerActivity.showV1073SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1073size
    FeaturePrefsStore.batch1071.v1073size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1073: skip mode
internal fun PlayerActivity.showV1073SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1073skip
    FeaturePrefsStore.batch1071.v1073skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1073: sleep mode
internal fun PlayerActivity.showV1073SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1073sleep
    FeaturePrefsStore.batch1071.v1073sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1073: slice mode
internal fun PlayerActivity.showV1073SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1073slice
    FeaturePrefsStore.batch1071.v1073slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1073: slide mode
internal fun PlayerActivity.showV1073SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1073slide
    FeaturePrefsStore.batch1071.v1073slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1074: short mode
internal fun PlayerActivity.showV1074ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1074short
    FeaturePrefsStore.batch1071.v1074short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1074: show mode
internal fun PlayerActivity.showV1074ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1074show
    FeaturePrefsStore.batch1071.v1074show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1074: shrink mode
internal fun PlayerActivity.showV1074ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1074shrink
    FeaturePrefsStore.batch1071.v1074shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1074: side mode
internal fun PlayerActivity.showV1074SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1074side
    FeaturePrefsStore.batch1071.v1074side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1074: sign mode
internal fun PlayerActivity.showV1074SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1074sign
    FeaturePrefsStore.batch1071.v1074sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1074: signal level
internal fun PlayerActivity.showV1074SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1074: silence level
internal fun PlayerActivity.showV1074SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1074: simple level
internal fun PlayerActivity.showV1074SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1074: single level
internal fun PlayerActivity.showV1074SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074single = value
        AppToast.show(this, "single: $value")
    }
}

// v1074: site level
internal fun PlayerActivity.showV1074SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074site = value
        AppToast.show(this, "site: $value")
    }
}

// v1074: size mode
internal fun PlayerActivity.showV1074SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1074size
    FeaturePrefsStore.batch1071.v1074size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1074: skip mode
internal fun PlayerActivity.showV1074SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1074skip
    FeaturePrefsStore.batch1071.v1074skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1074: sleep mode
internal fun PlayerActivity.showV1074SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1074sleep
    FeaturePrefsStore.batch1071.v1074sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1074: slice mode
internal fun PlayerActivity.showV1074SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1074slice
    FeaturePrefsStore.batch1071.v1074slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1074: slide mode
internal fun PlayerActivity.showV1074SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1074slide
    FeaturePrefsStore.batch1071.v1074slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1075: short mode
internal fun PlayerActivity.showV1075ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1075short
    FeaturePrefsStore.batch1071.v1075short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1075: show mode
internal fun PlayerActivity.showV1075ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1075show
    FeaturePrefsStore.batch1071.v1075show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1075: shrink mode
internal fun PlayerActivity.showV1075ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1075shrink
    FeaturePrefsStore.batch1071.v1075shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1075: side mode
internal fun PlayerActivity.showV1075SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1075side
    FeaturePrefsStore.batch1071.v1075side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1075: sign mode
internal fun PlayerActivity.showV1075SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1075sign
    FeaturePrefsStore.batch1071.v1075sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1075: signal level
internal fun PlayerActivity.showV1075SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1075: silence level
internal fun PlayerActivity.showV1075SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1075: simple level
internal fun PlayerActivity.showV1075SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1075: single level
internal fun PlayerActivity.showV1075SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075single = value
        AppToast.show(this, "single: $value")
    }
}

// v1075: site level
internal fun PlayerActivity.showV1075SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075site = value
        AppToast.show(this, "site: $value")
    }
}

// v1075: size mode
internal fun PlayerActivity.showV1075SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1075size
    FeaturePrefsStore.batch1071.v1075size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1075: skip mode
internal fun PlayerActivity.showV1075SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1075skip
    FeaturePrefsStore.batch1071.v1075skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1075: sleep mode
internal fun PlayerActivity.showV1075SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1075sleep
    FeaturePrefsStore.batch1071.v1075sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1075: slice mode
internal fun PlayerActivity.showV1075SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1075slice
    FeaturePrefsStore.batch1071.v1075slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1075: slide mode
internal fun PlayerActivity.showV1075SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1075slide
    FeaturePrefsStore.batch1071.v1075slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1076: short mode
internal fun PlayerActivity.showV1076ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1076short
    FeaturePrefsStore.batch1071.v1076short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1076: show mode
internal fun PlayerActivity.showV1076ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1076show
    FeaturePrefsStore.batch1071.v1076show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1076: shrink mode
internal fun PlayerActivity.showV1076ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1076shrink
    FeaturePrefsStore.batch1071.v1076shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1076: side mode
internal fun PlayerActivity.showV1076SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1076side
    FeaturePrefsStore.batch1071.v1076side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1076: sign mode
internal fun PlayerActivity.showV1076SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1076sign
    FeaturePrefsStore.batch1071.v1076sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1076: signal level
internal fun PlayerActivity.showV1076SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1076: silence level
internal fun PlayerActivity.showV1076SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1076: simple level
internal fun PlayerActivity.showV1076SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1076: single level
internal fun PlayerActivity.showV1076SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076single = value
        AppToast.show(this, "single: $value")
    }
}

// v1076: site level
internal fun PlayerActivity.showV1076SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076site = value
        AppToast.show(this, "site: $value")
    }
}

// v1076: size mode
internal fun PlayerActivity.showV1076SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1076size
    FeaturePrefsStore.batch1071.v1076size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1076: skip mode
internal fun PlayerActivity.showV1076SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1076skip
    FeaturePrefsStore.batch1071.v1076skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1076: sleep mode
internal fun PlayerActivity.showV1076SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1076sleep
    FeaturePrefsStore.batch1071.v1076sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1076: slice mode
internal fun PlayerActivity.showV1076SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1076slice
    FeaturePrefsStore.batch1071.v1076slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1076: slide mode
internal fun PlayerActivity.showV1076SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1076slide
    FeaturePrefsStore.batch1071.v1076slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1077: short mode
internal fun PlayerActivity.showV1077ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1077short
    FeaturePrefsStore.batch1071.v1077short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1077: show mode
internal fun PlayerActivity.showV1077ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1077show
    FeaturePrefsStore.batch1071.v1077show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1077: shrink mode
internal fun PlayerActivity.showV1077ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1077shrink
    FeaturePrefsStore.batch1071.v1077shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1077: side mode
internal fun PlayerActivity.showV1077SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1077side
    FeaturePrefsStore.batch1071.v1077side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1077: sign mode
internal fun PlayerActivity.showV1077SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1077sign
    FeaturePrefsStore.batch1071.v1077sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1077: signal level
internal fun PlayerActivity.showV1077SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1077: silence level
internal fun PlayerActivity.showV1077SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1077: simple level
internal fun PlayerActivity.showV1077SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1077: single level
internal fun PlayerActivity.showV1077SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077single = value
        AppToast.show(this, "single: $value")
    }
}

// v1077: site level
internal fun PlayerActivity.showV1077SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077site = value
        AppToast.show(this, "site: $value")
    }
}

// v1077: size mode
internal fun PlayerActivity.showV1077SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1077size
    FeaturePrefsStore.batch1071.v1077size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1077: skip mode
internal fun PlayerActivity.showV1077SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1077skip
    FeaturePrefsStore.batch1071.v1077skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1077: sleep mode
internal fun PlayerActivity.showV1077SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1077sleep
    FeaturePrefsStore.batch1071.v1077sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1077: slice mode
internal fun PlayerActivity.showV1077SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1077slice
    FeaturePrefsStore.batch1071.v1077slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1077: slide mode
internal fun PlayerActivity.showV1077SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1077slide
    FeaturePrefsStore.batch1071.v1077slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1078: short mode
internal fun PlayerActivity.showV1078ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1078short
    FeaturePrefsStore.batch1071.v1078short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1078: show mode
internal fun PlayerActivity.showV1078ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1078show
    FeaturePrefsStore.batch1071.v1078show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1078: shrink mode
internal fun PlayerActivity.showV1078ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1078shrink
    FeaturePrefsStore.batch1071.v1078shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1078: side mode
internal fun PlayerActivity.showV1078SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1078side
    FeaturePrefsStore.batch1071.v1078side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1078: sign mode
internal fun PlayerActivity.showV1078SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1078sign
    FeaturePrefsStore.batch1071.v1078sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1078: signal level
internal fun PlayerActivity.showV1078SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1078: silence level
internal fun PlayerActivity.showV1078SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1078: simple level
internal fun PlayerActivity.showV1078SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1078: single level
internal fun PlayerActivity.showV1078SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078single = value
        AppToast.show(this, "single: $value")
    }
}

// v1078: site level
internal fun PlayerActivity.showV1078SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078site = value
        AppToast.show(this, "site: $value")
    }
}

// v1078: size mode
internal fun PlayerActivity.showV1078SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1078size
    FeaturePrefsStore.batch1071.v1078size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1078: skip mode
internal fun PlayerActivity.showV1078SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1078skip
    FeaturePrefsStore.batch1071.v1078skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1078: sleep mode
internal fun PlayerActivity.showV1078SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1078sleep
    FeaturePrefsStore.batch1071.v1078sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1078: slice mode
internal fun PlayerActivity.showV1078SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1078slice
    FeaturePrefsStore.batch1071.v1078slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1078: slide mode
internal fun PlayerActivity.showV1078SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1078slide
    FeaturePrefsStore.batch1071.v1078slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1079: short mode
internal fun PlayerActivity.showV1079ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1079short
    FeaturePrefsStore.batch1071.v1079short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1079: show mode
internal fun PlayerActivity.showV1079ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1079show
    FeaturePrefsStore.batch1071.v1079show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1079: shrink mode
internal fun PlayerActivity.showV1079ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1079shrink
    FeaturePrefsStore.batch1071.v1079shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1079: side mode
internal fun PlayerActivity.showV1079SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1079side
    FeaturePrefsStore.batch1071.v1079side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1079: sign mode
internal fun PlayerActivity.showV1079SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1079sign
    FeaturePrefsStore.batch1071.v1079sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1079: signal level
internal fun PlayerActivity.showV1079SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1079: silence level
internal fun PlayerActivity.showV1079SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1079: simple level
internal fun PlayerActivity.showV1079SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1079: single level
internal fun PlayerActivity.showV1079SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079single = value
        AppToast.show(this, "single: $value")
    }
}

// v1079: site level
internal fun PlayerActivity.showV1079SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079site = value
        AppToast.show(this, "site: $value")
    }
}

// v1079: size mode
internal fun PlayerActivity.showV1079SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1079size
    FeaturePrefsStore.batch1071.v1079size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1079: skip mode
internal fun PlayerActivity.showV1079SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1079skip
    FeaturePrefsStore.batch1071.v1079skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1079: sleep mode
internal fun PlayerActivity.showV1079SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1079sleep
    FeaturePrefsStore.batch1071.v1079sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1079: slice mode
internal fun PlayerActivity.showV1079SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1079slice
    FeaturePrefsStore.batch1071.v1079slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1079: slide mode
internal fun PlayerActivity.showV1079SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1079slide
    FeaturePrefsStore.batch1071.v1079slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1080: short mode
internal fun PlayerActivity.showV1080ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1080short
    FeaturePrefsStore.batch1071.v1080short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1080: show mode
internal fun PlayerActivity.showV1080ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1080show
    FeaturePrefsStore.batch1071.v1080show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1080: shrink mode
internal fun PlayerActivity.showV1080ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1080shrink
    FeaturePrefsStore.batch1071.v1080shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1080: side mode
internal fun PlayerActivity.showV1080SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1080side
    FeaturePrefsStore.batch1071.v1080side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1080: sign mode
internal fun PlayerActivity.showV1080SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1080sign
    FeaturePrefsStore.batch1071.v1080sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1080: signal level
internal fun PlayerActivity.showV1080SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1080: silence level
internal fun PlayerActivity.showV1080SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1080: simple level
internal fun PlayerActivity.showV1080SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1080: single level
internal fun PlayerActivity.showV1080SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080single = value
        AppToast.show(this, "single: $value")
    }
}

// v1080: site level
internal fun PlayerActivity.showV1080SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080site = value
        AppToast.show(this, "site: $value")
    }
}

// v1080: size mode
internal fun PlayerActivity.showV1080SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1080size
    FeaturePrefsStore.batch1071.v1080size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1080: skip mode
internal fun PlayerActivity.showV1080SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1080skip
    FeaturePrefsStore.batch1071.v1080skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1080: sleep mode
internal fun PlayerActivity.showV1080SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1080sleep
    FeaturePrefsStore.batch1071.v1080sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1080: slice mode
internal fun PlayerActivity.showV1080SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1080slice
    FeaturePrefsStore.batch1071.v1080slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1080: slide mode
internal fun PlayerActivity.showV1080SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1080slide
    FeaturePrefsStore.batch1071.v1080slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v129.134: Danmaku Font BG Fill Border Miter Limit
internal fun PlayerActivity.showV129DanmakuFontBgFillBorderMiterLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter Limit: $value")
    }
}

// v129.135: Subtitle Animation Scale129
internal fun PlayerActivity.showV129SubtitleAnimationScale129Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationScale129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationScale129 = value
        AppToast.show(this, "Subtitle Animation Scale129: $value")
    }
}

// v130.136: Audio Chorus Rate
internal fun PlayerActivity.showV130AudioChorusRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130audioChorusRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130audioChorusRate = value
        AppToast.show(this, "Audio Chorus Rate: $value")
    }
}

// v130.137: Danmaku Font BG Fill Border Miter129
internal fun PlayerActivity.showV130DanmakuFontBgFillBorderMiter129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130danmakuFontBgFillBorderMiter129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130danmakuFontBgFillBorderMiter129 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter129: $value")
    }
}

// v130.138: Subtitle Animation Scale130
internal fun PlayerActivity.showV130SubtitleAnimationScale130Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationScale130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationScale130 = value
        AppToast.show(this, "Subtitle Animation Scale130: $value")
    }
}

// v130.139: Gesture Tap Zone Dead Zone
internal fun PlayerActivity.showV130GestureTapZoneDeadZoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130gestureTapZoneDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130gestureTapZoneDeadZone = value
        AppToast.show(this, "Gesture Tap Zone Dead Zone: $value")
    }
}

// v130.140: Cast Video PIP Position
internal fun PlayerActivity.showV130CastVideoPIPPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130castVideoPIPPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130castVideoPIPPosition = value
        AppToast.show(this, "Cast Video PIP Position: $value")
    }
}

// v130.141: Playlist Auto Group By Language
internal fun PlayerActivity.showV130PlaylistAutoGroupByLanguageToggle() {
    val enabled = !BiliClient.prefs.v130playlistAutoGroupByLanguage
    BiliClient.prefs.v130playlistAutoGroupByLanguage = enabled
    AppToast.show(this, "Playlist Auto Group By Language: ${if (enabled) "ON" else "OFF"}")
}

// v130.142: Cache Smart Pinning On Idle
internal fun PlayerActivity.showV130CacheSmartPinningOnIdleToggle() {
    val enabled = !BiliClient.prefs.v130cacheSmartPinningOnIdle
    BiliClient.prefs.v130cacheSmartPinningOnIdle = enabled
    AppToast.show(this, "Cache Smart Pinning On Idle: ${if (enabled) "ON" else "OFF"}")
}

// v130.143: Progress Bar Custom Thumb Color130
internal fun PlayerActivity.showV130ProgressBarCustomThumbColor130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130progressBarCustomThumbColor130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130progressBarCustomThumbColor130 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color130: $value")
    }
}

// v130.144: Volume Normalize Track
internal fun PlayerActivity.showV130VolumeNormalizeTrackToggle() {
    val enabled = !BiliClient.prefs.v130volumeNormalizeTrack
    BiliClient.prefs.v130volumeNormalizeTrack = enabled
    AppToast.show(this, "Volume Normalize Track: ${if (enabled) "ON" else "OFF"}")
}

// v130.145: History Auto Clean130
internal fun PlayerActivity.showV130HistoryAutoClean130Toggle() {
    val enabled = !BiliClient.prefs.v130historyAutoClean130
    BiliClient.prefs.v130historyAutoClean130 = enabled
    AppToast.show(this, "History Auto Clean130: ${if (enabled) "ON" else "OFF"}")
}

// v130.146: Playback Speed Presets Widget
internal fun PlayerActivity.showV130PlaybackSpeedPresetsWidgetToggle() {
    val enabled = !BiliClient.prefs.v130playbackSpeedPresetsWidget
    BiliClient.prefs.v130playbackSpeedPresetsWidget = enabled
    AppToast.show(this, "Playback Speed Presets Widget: ${if (enabled) "ON" else "OFF"}")
}

// v130.147: Screenshot Auto Share Teams
internal fun PlayerActivity.showV130ScreenshotAutoShareTeamsToggle() {
    val enabled = !BiliClient.prefs.v130screenshotAutoShareTeams
    BiliClient.prefs.v130screenshotAutoShareTeams = enabled
    AppToast.show(this, "Screenshot Auto Share Teams: ${if (enabled) "ON" else "OFF"}")
}

// v130.148: Video PIP Opacity On Drag
internal fun PlayerActivity.showV130VideoPIPOpacityOnDragDialog() {
    val options = listOf(50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130videoPIPOpacityOnDrag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Opacity On Drag",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130videoPIPOpacityOnDrag = value
        AppToast.show(this, "Video PIP Opacity On Drag: $value")
    }
}

// v130.149: Danmaku Font BG Fill Shadow Toggle
internal fun PlayerActivity.showV130DanmakuFontBgFillShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v130danmakuFontBgFillShadowToggle
    BiliClient.prefs.v130danmakuFontBgFillShadowToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v130.150: Subtitle Animation Rotate130
internal fun PlayerActivity.showV130SubtitleAnimationRotate130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationRotate130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationRotate130 = value
        AppToast.show(this, "Subtitle Animation Rotate130: $value")
    }
}

// v131: Audio Chorus Depth
internal fun PlayerActivity.showV131AudioChorusDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131audioChorusDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131audioChorusDepth = value
        AppToast.show(this, "Audio Chorus Depth: $value")
    }
}

// v131: Danmaku Font BG Fill Shadow Color
internal fun PlayerActivity.showV131DanmakuFontBgFillShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowColor = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Color: $value")
    }
}

// v131: Subtitle Animation Rotate131
internal fun PlayerActivity.showV131SubtitleAnimationRotate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationRotate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationRotate131 = value
        AppToast.show(this, "Subtitle Animation Rotate131: $value")
    }
}

// v131: Gesture Tap Zone Sensitivity
internal fun PlayerActivity.showV131GestureTapZoneSensitivityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131gestureTapZoneSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131gestureTapZoneSensitivity = value
        AppToast.show(this, "Gesture Tap Zone Sensitivity: $value")
    }
}

// v131: Cast Video PIP Follow Main
internal fun PlayerActivity.showV131CastVideoPIPFollowMainToggle() {
    val current = BiliClient.prefs.v131castVideoPIPFollowMain
    BiliClient.prefs.v131castVideoPIPFollowMain = !current
    AppToast.show(this, "Cast Video PIP Follow Main: ${if (!current) "ON" else "OFF"}")
}

// v131: Playlist Auto Group By Genre
internal fun PlayerActivity.showV131PlaylistAutoGroupByGenreToggle() {
    val current = BiliClient.prefs.v131playlistAutoGroupByGenre
    BiliClient.prefs.v131playlistAutoGroupByGenre = !current
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (!current) "ON" else "OFF"}")
}

// v131: Cache Smart Pinning On Schedule
internal fun PlayerActivity.showV131CacheSmartPinningOnScheduleToggle() {
    val current = BiliClient.prefs.v131cacheSmartPinningOnSchedule
    BiliClient.prefs.v131cacheSmartPinningOnSchedule = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule: ${if (!current) "ON" else "OFF"}")
}

// v131: Progress Bar Custom Thumb Shadow131
internal fun PlayerActivity.showV131ProgressBarCustomThumbShadow131Toggle() {
    val current = BiliClient.prefs.v131progressBarCustomThumbShadow131
    BiliClient.prefs.v131progressBarCustomThumbShadow131 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow131: ${if (!current) "ON" else "OFF"}")
}

// v131: Volume Normalize Mode
internal fun PlayerActivity.showV131VolumeNormalizeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131volumeNormalizeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131volumeNormalizeMode = value
        AppToast.show(this, "Volume Normalize Mode: $value")
    }
}

// v131: History Auto Clean131
internal fun PlayerActivity.showV131HistoryAutoClean131Toggle() {
    val current = BiliClient.prefs.v131historyAutoClean131
    BiliClient.prefs.v131historyAutoClean131 = !current
    AppToast.show(this, "History Auto Clean131: ${if (!current) "ON" else "OFF"}")
}

// v131: Playback Speed Presets Quick Switch
internal fun PlayerActivity.showV131PlaybackSpeedPresetsQuickSwitchToggle() {
    val current = BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch
    BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch = !current
    AppToast.show(this, "Playback Speed Presets Quick Switch: ${if (!current) "ON" else "OFF"}")
}

// v131: Screenshot Auto Share Messenger
internal fun PlayerActivity.showV131ScreenshotAutoShareMessengerToggle() {
    val current = BiliClient.prefs.v131screenshotAutoShareMessenger
    BiliClient.prefs.v131screenshotAutoShareMessenger = !current
    AppToast.show(this, "Screenshot Auto Share Messenger: ${if (!current) "ON" else "OFF"}")
}

// v131: Video PIP Transition Speed
internal fun PlayerActivity.showV131VideoPIPTransitionSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131videoPIPTransitionSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131videoPIPTransitionSpeed = value
        AppToast.show(this, "Video PIP Transition Speed: $value")
    }
}

// v131: Danmaku Font BG Fill Shadow Offset X
internal fun PlayerActivity.showV131DanmakuFontBgFillShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset X: $value")
    }
}

// v131: Subtitle Animation Translate131
internal fun PlayerActivity.showV131SubtitleAnimationTranslate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationTranslate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationTranslate131 = value
        AppToast.show(this, "Subtitle Animation Translate131: $value")
    }
}

// v132: Audio Chorus Feedback
internal fun PlayerActivity.showV132AudioChorusFeedbackDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v132audioChorusFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132audioChorusFeedback = value
        AppToast.show(this, "Audio Chorus Feedback: $value")
    }
}

// v132: Danmaku Font BG Fill Shadow Offset Y
internal fun PlayerActivity.showV132DanmakuFontBgFillShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset Y: $value")
    }
}

// v132: Subtitle Animation Translate132
internal fun PlayerActivity.showV132SubtitleAnimationTranslate132Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationTranslate132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationTranslate132 = value
        AppToast.show(this, "Subtitle Animation Translate132: $value")
    }
}

// v132: Gesture Tap Zone Visual Feedback
internal fun PlayerActivity.showV132GestureTapZoneVisualFeedbackToggle() {
    val current = BiliClient.prefs.v132gestureTapZoneVisualFeedback
    BiliClient.prefs.v132gestureTapZoneVisualFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Visual Feedback: ${if (!current) "ON" else "OFF"}")
}

// v132: Cast Video PIP Follow Fullscreen
internal fun PlayerActivity.showV132CastVideoPIPFollowFullscreenToggle() {
    val current = BiliClient.prefs.v132castVideoPIPFollowFullscreen
    BiliClient.prefs.v132castVideoPIPFollowFullscreen = !current
    AppToast.show(this, "Cast Video PIP Follow Fullscreen: ${if (!current) "ON" else "OFF"}")
}

// v132: Playlist Auto Group By Series132
internal fun PlayerActivity.showV132PlaylistAutoGroupBySeries132Toggle() {
    val current = BiliClient.prefs.v132playlistAutoGroupBySeries132
    BiliClient.prefs.v132playlistAutoGroupBySeries132 = !current
    AppToast.show(this, "Playlist Auto Group By Series132: ${if (!current) "ON" else "OFF"}")
}

// v132: Cache Smart Pinning On Network Change
internal fun PlayerActivity.showV132CacheSmartPinningOnNetworkChangeToggle() {
    val current = BiliClient.prefs.v132cacheSmartPinningOnNetworkChange
    BiliClient.prefs.v132cacheSmartPinningOnNetworkChange = !current
    AppToast.show(this, "Cache Smart Pinning On Network Change: ${if (!current) "ON" else "OFF"}")
}

// v132: Progress Bar Custom Thumb Glow132
internal fun PlayerActivity.showV132ProgressBarCustomThumbGlow132Toggle() {
    val current = BiliClient.prefs.v132progressBarCustomThumbGlow132
    BiliClient.prefs.v132progressBarCustomThumbGlow132 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow132: ${if (!current) "ON" else "OFF"}")
}

// v132: Volume Normalize Target
internal fun PlayerActivity.showV132VolumeNormalizeTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132volumeNormalizeTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132volumeNormalizeTarget = value
        AppToast.show(this, "Volume Normalize Target: $value")
    }
}

// v132: History Auto Clean132
internal fun PlayerActivity.showV132HistoryAutoClean132Toggle() {
    val current = BiliClient.prefs.v132historyAutoClean132
    BiliClient.prefs.v132historyAutoClean132 = !current
    AppToast.show(this, "History Auto Clean132: ${if (!current) "ON" else "OFF"}")
}

// v132: Playback Speed Presets Long Press
internal fun PlayerActivity.showV132PlaybackSpeedPresetsLongPressToggle() {
    val current = BiliClient.prefs.v132playbackSpeedPresetsLongPress
    BiliClient.prefs.v132playbackSpeedPresetsLongPress = !current
    AppToast.show(this, "Playback Speed Presets Long Press: ${if (!current) "ON" else "OFF"}")
}

// v132: Screenshot Auto Share Viber
internal fun PlayerActivity.showV132ScreenshotAutoShareViberToggle() {
    val current = BiliClient.prefs.v132screenshotAutoShareViber
    BiliClient.prefs.v132screenshotAutoShareViber = !current
    AppToast.show(this, "Screenshot Auto Share Viber: ${if (!current) "ON" else "OFF"}")
}

// v132: Video PIP Transition Type
internal fun PlayerActivity.showV132VideoPIPTransitionTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132videoPIPTransitionType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132videoPIPTransitionType = value
        AppToast.show(this, "Video PIP Transition Type: $value")
    }
}

// v132: Danmaku Font BG Fill Shadow Blur
internal fun PlayerActivity.showV132DanmakuFontBgFillShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowBlur = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Blur: $value")
    }
}

// v132: Subtitle Animation Scale132
internal fun PlayerActivity.showV132SubtitleAnimationScale132Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationScale132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationScale132 = value
        AppToast.show(this, "Subtitle Animation Scale132: $value")
    }
}

// v133: Audio Chorus Mix
internal fun PlayerActivity.showV133AudioChorusMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133audioChorusMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133audioChorusMix = value
        AppToast.show(this, "Audio Chorus Mix: $value")
    }
}

// v133: Danmaku Font BG Fill Shadow Opacity
internal fun PlayerActivity.showV133DanmakuFontBgFillShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Opacity: $value")
    }
}

// v133: Subtitle Animation Scale133
internal fun PlayerActivity.showV133SubtitleAnimationScale133Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationScale133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationScale133 = value
        AppToast.show(this, "Subtitle Animation Scale133: $value")
    }
}

// v133: Gesture Tap Zone Haptic Feedback
internal fun PlayerActivity.showV133GestureTapZoneHapticFeedbackToggle() {
    val current = BiliClient.prefs.v133gestureTapZoneHapticFeedback
    BiliClient.prefs.v133gestureTapZoneHapticFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Haptic Feedback: ${if (!current) "ON" else "OFF"}")
}

// v133: Cast Video PIP Follow Playback
internal fun PlayerActivity.showV133CastVideoPIPFollowPlaybackToggle() {
    val current = BiliClient.prefs.v133castVideoPIPFollowPlayback
    BiliClient.prefs.v133castVideoPIPFollowPlayback = !current
    AppToast.show(this, "Cast Video PIP Follow Playback: ${if (!current) "ON" else "OFF"}")
}

// v133: Playlist Auto Group By Date Range
internal fun PlayerActivity.showV133PlaylistAutoGroupByDateRangeToggle() {
    val current = BiliClient.prefs.v133playlistAutoGroupByDateRange
    BiliClient.prefs.v133playlistAutoGroupByDateRange = !current
    AppToast.show(this, "Playlist Auto Group By Date Range: ${if (!current) "ON" else "OFF"}")
}

// v133: Cache Smart Pinning On Battery Level
internal fun PlayerActivity.showV133CacheSmartPinningOnBatteryLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Battery Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel = value
        AppToast.show(this, "Cache Smart Pinning On Battery Level: $value")
    }
}

// v133: Progress Bar Custom Thumb Border133
internal fun PlayerActivity.showV133ProgressBarCustomThumbBorder133Toggle() {
    val current = BiliClient.prefs.v133progressBarCustomThumbBorder133
    BiliClient.prefs.v133progressBarCustomThumbBorder133 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border133: ${if (!current) "ON" else "OFF"}")
}

// v133: Volume Normalize Ceiling
internal fun PlayerActivity.showV133VolumeNormalizeCeilingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133volumeNormalizeCeiling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Ceiling",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133volumeNormalizeCeiling = value
        AppToast.show(this, "Volume Normalize Ceiling: $value")
    }
}

// v133: History Auto Clean133
internal fun PlayerActivity.showV133HistoryAutoClean133Toggle() {
    val current = BiliClient.prefs.v133historyAutoClean133
    BiliClient.prefs.v133historyAutoClean133 = !current
    AppToast.show(this, "History Auto Clean133: ${if (!current) "ON" else "OFF"}")
}

// v133: Playback Speed Presets Double Tap
internal fun PlayerActivity.showV133PlaybackSpeedPresetsDoubleTapToggle() {
    val current = BiliClient.prefs.v133playbackSpeedPresetsDoubleTap
    BiliClient.prefs.v133playbackSpeedPresetsDoubleTap = !current
    AppToast.show(this, "Playback Speed Presets Double Tap: ${if (!current) "ON" else "OFF"}")
}

// v133: Screenshot Auto Share Signal
internal fun PlayerActivity.showV133ScreenshotAutoShareSignalToggle() {
    val current = BiliClient.prefs.v133screenshotAutoShareSignal
    BiliClient.prefs.v133screenshotAutoShareSignal = !current
    AppToast.show(this, "Screenshot Auto Share Signal: ${if (!current) "ON" else "OFF"}")
}

// v133: Video PIP Background Opacity
internal fun PlayerActivity.showV133VideoPIPBackgroundOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133videoPIPBackgroundOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Background Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133videoPIPBackgroundOpacity = value
        AppToast.show(this, "Video PIP Background Opacity: $value")
    }
}

// v133: Danmaku Font BG Fill Shadow Spread
internal fun PlayerActivity.showV133DanmakuFontBgFillShadowSpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowSpread = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Spread: $value")
    }
}

// v133: Subtitle Animation Rotate133
internal fun PlayerActivity.showV133SubtitleAnimationRotate133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationRotate133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationRotate133 = value
        AppToast.show(this, "Subtitle Animation Rotate133: $value")
    }
}

// v134: Audio Flanger Toggle134
internal fun PlayerActivity.showV134AudioFlangerToggle134Toggle() {
    val current = BiliClient.prefs.v134audioFlangerToggle134
    BiliClient.prefs.v134audioFlangerToggle134 = !current
    AppToast.show(this, "Audio Flanger Toggle134: ${if (!current) "ON" else "OFF"}")
}

// v134: Danmaku Font BG Fill Shadow Type
internal fun PlayerActivity.showV134DanmakuFontBgFillShadowTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type: $value")
    }
}

// v134: Subtitle Animation Rotate134
internal fun PlayerActivity.showV134SubtitleAnimationRotate134Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationRotate134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationRotate134 = value
        AppToast.show(this, "Subtitle Animation Rotate134: $value")
    }
}

// v134: Gesture Tap Zone Timeout
internal fun PlayerActivity.showV134GestureTapZoneTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v134gestureTapZoneTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134gestureTapZoneTimeout = value
        AppToast.show(this, "Gesture Tap Zone Timeout: $value")
    }
}

// v134: Cast Video PIP Follow Gesture
internal fun PlayerActivity.showV134CastVideoPIPFollowGestureToggle() {
    val current = BiliClient.prefs.v134castVideoPIPFollowGesture
    BiliClient.prefs.v134castVideoPIPFollowGesture = !current
    AppToast.show(this, "Cast Video PIP Follow Gesture: ${if (!current) "ON" else "OFF"}")
}

// v134: Playlist Auto Group By Watch Count
internal fun PlayerActivity.showV134PlaylistAutoGroupByWatchCountToggle() {
    val current = BiliClient.prefs.v134playlistAutoGroupByWatchCount
    BiliClient.prefs.v134playlistAutoGroupByWatchCount = !current
    AppToast.show(this, "Playlist Auto Group By Watch Count: ${if (!current) "ON" else "OFF"}")
}

// v134: Cache Smart Pinning On Storage Type
internal fun PlayerActivity.showV134CacheSmartPinningOnStorageTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134cacheSmartPinningOnStorageType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134cacheSmartPinningOnStorageType = value
        AppToast.show(this, "Cache Smart Pinning On Storage Type: $value")
    }
}

// v134: Progress Bar Custom Thumb Size134
internal fun PlayerActivity.showV134ProgressBarCustomThumbSize134Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v134progressBarCustomThumbSize134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134progressBarCustomThumbSize134 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size134: $value")
    }
}

// v134: Volume Normalize Window
internal fun PlayerActivity.showV134VolumeNormalizeWindowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134volumeNormalizeWindow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Window",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134volumeNormalizeWindow = value
        AppToast.show(this, "Volume Normalize Window: $value")
    }
}

// v134: History Auto Clean134
internal fun PlayerActivity.showV134HistoryAutoClean134Toggle() {
    val current = BiliClient.prefs.v134historyAutoClean134
    BiliClient.prefs.v134historyAutoClean134 = !current
    AppToast.show(this, "History Auto Clean134: ${if (!current) "ON" else "OFF"}")
}

// v134: Playback Speed Presets Triple Tap
internal fun PlayerActivity.showV134PlaybackSpeedPresetsTripleTapToggle() {
    val current = BiliClient.prefs.v134playbackSpeedPresetsTripleTap
    BiliClient.prefs.v134playbackSpeedPresetsTripleTap = !current
    AppToast.show(this, "Playback Speed Presets Triple Tap: ${if (!current) "ON" else "OFF"}")
}

// v134: Screenshot Auto Share X
internal fun PlayerActivity.showV134ScreenshotAutoShareXToggle() {
    val current = BiliClient.prefs.v134screenshotAutoShareX
    BiliClient.prefs.v134screenshotAutoShareX = !current
    AppToast.show(this, "Screenshot Auto Share X: ${if (!current) "ON" else "OFF"}")
}

// v134: Video PIP Follow Orientation
internal fun PlayerActivity.showV134VideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v134videoPIPFollowOrientation
    BiliClient.prefs.v134videoPIPFollowOrientation = !current
    AppToast.show(this, "Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

// v134: Danmaku Font BG Fill Shadow Type133
internal fun PlayerActivity.showV134DanmakuFontBgFillShadowType133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType133 = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type133: $value")
    }
}

// v134: Subtitle Animation Blur134
internal fun PlayerActivity.showV134SubtitleAnimationBlur134Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationBlur134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationBlur134 = value
        AppToast.show(this, "Subtitle Animation Blur134: $value")
    }
}

// v135: Audio Flanger Rate
internal fun PlayerActivity.showV135AudioFlangerRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v135audioFlangerRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135audioFlangerRate = value
        AppToast.show(this, "Audio Flanger Rate: $value")
    }
}

// v135: Danmaku Font BG Fill Shadow Type134
internal fun PlayerActivity.showV135DanmakuFontBgFillShadowType134Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135danmakuFontBgFillShadowType134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135danmakuFontBgFillShadowType134 = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type134: $value")
    }
}

// v135: Subtitle Animation Blur135
internal fun PlayerActivity.showV135SubtitleAnimationBlur135Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v135subtitleAnimationBlur135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135subtitleAnimationBlur135 = value
        AppToast.show(this, "Subtitle Animation Blur135: $value")
    }
}

// v135: Gesture Tap Zone Min Distance
internal fun PlayerActivity.showV135GestureTapZoneMinDistanceDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v135gestureTapZoneMinDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Min Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135gestureTapZoneMinDistance = value
        AppToast.show(this, "Gesture Tap Zone Min Distance: $value")
    }
}

// v135: Cast Video PIP Follow Screen
internal fun PlayerActivity.showV135CastVideoPIPFollowScreenToggle() {
    val current = BiliClient.prefs.v135castVideoPIPFollowScreen
    BiliClient.prefs.v135castVideoPIPFollowScreen = !current
    AppToast.show(this, "Cast Video PIP Follow Screen: ${if (!current) "ON" else "OFF"}")
}

// v135: Playlist Auto Group By Like Count
internal fun PlayerActivity.showV135PlaylistAutoGroupByLikeCountToggle() {
    val current = BiliClient.prefs.v135playlistAutoGroupByLikeCount
    BiliClient.prefs.v135playlistAutoGroupByLikeCount = !current
    AppToast.show(this, "Playlist Auto Group By Like Count: ${if (!current) "ON" else "OFF"}")
}

// v135: Cache Smart Pinning On Storage Free
internal fun PlayerActivity.showV135CacheSmartPinningOnStorageFreeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135cacheSmartPinningOnStorageFree).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Free",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135cacheSmartPinningOnStorageFree = value
        AppToast.show(this, "Cache Smart Pinning On Storage Free: $value")
    }
}

// v135: Progress Bar Custom Thumb Size135
internal fun PlayerActivity.showV135ProgressBarCustomThumbSize135Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v135progressBarCustomThumbSize135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135progressBarCustomThumbSize135 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size135: $value")
    }
}

// v135: Volume Normalize Threshold
internal fun PlayerActivity.showV135VolumeNormalizeThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135volumeNormalizeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135volumeNormalizeThreshold = value
        AppToast.show(this, "Volume Normalize Threshold: $value")
    }
}

// v135: History Auto Clean135
internal fun PlayerActivity.showV135HistoryAutoClean135Toggle() {
    val current = BiliClient.prefs.v135historyAutoClean135
    BiliClient.prefs.v135historyAutoClean135 = !current
    AppToast.show(this, "History Auto Clean135: ${if (!current) "ON" else "OFF"}")
}

// v135: Playback Speed Presets Gesture
internal fun PlayerActivity.showV135PlaybackSpeedPresetsGestureToggle() {
    val current = BiliClient.prefs.v135playbackSpeedPresetsGesture
    BiliClient.prefs.v135playbackSpeedPresetsGesture = !current
    AppToast.show(this, "Playback Speed Presets Gesture: ${if (!current) "ON" else "OFF"}")
}

// v135: Screenshot Auto Share Tumblr
internal fun PlayerActivity.showV135ScreenshotAutoShareTumblrToggle() {
    val current = BiliClient.prefs.v135screenshotAutoShareTumblr
    BiliClient.prefs.v135screenshotAutoShareTumblr = !current
    AppToast.show(this, "Screenshot Auto Share Tumblr: ${if (!current) "ON" else "OFF"}")
}

// v135: Video PIP Follow System Theme
internal fun PlayerActivity.showV135VideoPIPFollowSystemThemeToggle() {
    val current = BiliClient.prefs.v135videoPIPFollowSystemTheme
    BiliClient.prefs.v135videoPIPFollowSystemTheme = !current
    AppToast.show(this, "Video PIP Follow System Theme: ${if (!current) "ON" else "OFF"}")
}

// v135: Danmaku Font BG Fill Clip Toggle
internal fun PlayerActivity.showV135DanmakuFontBgFillClipToggleToggle() {
    val current = BiliClient.prefs.v135danmakuFontBgFillClipToggle
    BiliClient.prefs.v135danmakuFontBgFillClipToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Clip Toggle: ${if (!current) "ON" else "OFF"}")
}

// v135: Subtitle Animation Fade In135
internal fun PlayerActivity.showV135SubtitleAnimationFadeIn135Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v135subtitleAnimationFadeIn135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135subtitleAnimationFadeIn135 = value
        AppToast.show(this, "Subtitle Animation Fade In135: $value")
    }
}

// v136: Audio Flanger Depth
internal fun PlayerActivity.showV136AudioFlangerDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v136audioFlangerDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136audioFlangerDepth = value
        AppToast.show(this, "Audio Flanger Depth: $value")
    }
}

// v136: Danmaku Font BG Fill Clip Path
internal fun PlayerActivity.showV136DanmakuFontBgFillClipPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136danmakuFontBgFillClipPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136danmakuFontBgFillClipPath = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path: $value")
    }
}

// v136: Subtitle Animation Fade In136
internal fun PlayerActivity.showV136SubtitleAnimationFadeIn136Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v136subtitleAnimationFadeIn136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136subtitleAnimationFadeIn136 = value
        AppToast.show(this, "Subtitle Animation Fade In136: $value")
    }
}

// v136: Gesture Tap Zone Visual Style
internal fun PlayerActivity.showV136GestureTapZoneVisualStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136gestureTapZoneVisualStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136gestureTapZoneVisualStyle = value
        AppToast.show(this, "Gesture Tap Zone Visual Style: $value")
    }
}

// v136: Cast Video PIP Follow Orientation
internal fun PlayerActivity.showV136CastVideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v136castVideoPIPFollowOrientation
    BiliClient.prefs.v136castVideoPIPFollowOrientation = !current
    AppToast.show(this, "Cast Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

// v136: Playlist Auto Group By Comment Count
internal fun PlayerActivity.showV136PlaylistAutoGroupByCommentCountToggle() {
    val current = BiliClient.prefs.v136playlistAutoGroupByCommentCount
    BiliClient.prefs.v136playlistAutoGroupByCommentCount = !current
    AppToast.show(this, "Playlist Auto Group By Comment Count: ${if (!current) "ON" else "OFF"}")
}

// v136: Cache Smart Pinning On Network Speed
internal fun PlayerActivity.showV136CacheSmartPinningOnNetworkSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136cacheSmartPinningOnNetworkSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Network Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136cacheSmartPinningOnNetworkSpeed = value
        AppToast.show(this, "Cache Smart Pinning On Network Speed: $value")
    }
}

// v136: Progress Bar Custom Thumb Color136
internal fun PlayerActivity.showV136ProgressBarCustomThumbColor136Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136progressBarCustomThumbColor136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136progressBarCustomThumbColor136 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color136: $value")
    }
}

// v136: Volume Normalize Adaptive
internal fun PlayerActivity.showV136VolumeNormalizeAdaptiveToggle() {
    val current = BiliClient.prefs.v136volumeNormalizeAdaptive
    BiliClient.prefs.v136volumeNormalizeAdaptive = !current
    AppToast.show(this, "Volume Normalize Adaptive: ${if (!current) "ON" else "OFF"}")
}

// v136: History Auto Clean136
internal fun PlayerActivity.showV136HistoryAutoClean136Toggle() {
    val current = BiliClient.prefs.v136historyAutoClean136
    BiliClient.prefs.v136historyAutoClean136 = !current
    AppToast.show(this, "History Auto Clean136: ${if (!current) "ON" else "OFF"}")
}

// v136: Playback Speed Presets Quick Access
internal fun PlayerActivity.showV136PlaybackSpeedPresetsQuickAccessToggle() {
    val current = BiliClient.prefs.v136playbackSpeedPresetsQuickAccess
    BiliClient.prefs.v136playbackSpeedPresetsQuickAccess = !current
    AppToast.show(this, "Playback Speed Presets Quick Access: ${if (!current) "ON" else "OFF"}")
}

// v136: Screenshot Auto Share Pinterest
internal fun PlayerActivity.showV136ScreenshotAutoSharePinterestToggle() {
    val current = BiliClient.prefs.v136screenshotAutoSharePinterest
    BiliClient.prefs.v136screenshotAutoSharePinterest = !current
    AppToast.show(this, "Screenshot Auto Share Pinterest: ${if (!current) "ON" else "OFF"}")
}

// v136: Video PIP Follow Audio Focus
internal fun PlayerActivity.showV136VideoPIPFollowAudioFocusToggle() {
    val current = BiliClient.prefs.v136videoPIPFollowAudioFocus
    BiliClient.prefs.v136videoPIPFollowAudioFocus = !current
    AppToast.show(this, "Video PIP Follow Audio Focus: ${if (!current) "ON" else "OFF"}")
}

// v136: Danmaku Font BG Fill Clip Path135
internal fun PlayerActivity.showV136DanmakuFontBgFillClipPath135Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136danmakuFontBgFillClipPath135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136danmakuFontBgFillClipPath135 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path135: $value")
    }
}

// v136: Subtitle Animation Fade Out136
internal fun PlayerActivity.showV136SubtitleAnimationFadeOut136Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v136subtitleAnimationFadeOut136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136subtitleAnimationFadeOut136 = value
        AppToast.show(this, "Subtitle Animation Fade Out136: $value")
    }
}

// v137: Audio Flanger Feedback136
internal fun PlayerActivity.showV137AudioFlangerFeedback136Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v137audioFlangerFeedback136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Feedback136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137audioFlangerFeedback136 = value
        AppToast.show(this, "Audio Flanger Feedback136: $value")
    }
}

// v137: Danmaku Font BG Fill Clip Path136
internal fun PlayerActivity.showV137DanmakuFontBgFillClipPath136Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137danmakuFontBgFillClipPath136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137danmakuFontBgFillClipPath136 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path136: $value")
    }
}

// v137: Subtitle Animation Fade Out137
internal fun PlayerActivity.showV137SubtitleAnimationFadeOut137Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v137subtitleAnimationFadeOut137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137subtitleAnimationFadeOut137 = value
        AppToast.show(this, "Subtitle Animation Fade Out137: $value")
    }
}

// v137: Gesture Tap Zone Visual Color
internal fun PlayerActivity.showV137GestureTapZoneVisualColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137gestureTapZoneVisualColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137gestureTapZoneVisualColor = value
        AppToast.show(this, "Gesture Tap Zone Visual Color: $value")
    }
}

// v137: Cast Video PIP Follow Battery
internal fun PlayerActivity.showV137CastVideoPIPFollowBatteryToggle() {
    val current = BiliClient.prefs.v137castVideoPIPFollowBattery
    BiliClient.prefs.v137castVideoPIPFollowBattery = !current
    AppToast.show(this, "Cast Video PIP Follow Battery: ${if (!current) "ON" else "OFF"}")
}

// v137: Playlist Auto Group By Share Count
internal fun PlayerActivity.showV137PlaylistAutoGroupByShareCountToggle() {
    val current = BiliClient.prefs.v137playlistAutoGroupByShareCount
    BiliClient.prefs.v137playlistAutoGroupByShareCount = !current
    AppToast.show(this, "Playlist Auto Group By Share Count: ${if (!current) "ON" else "OFF"}")
}

// v137: Cache Smart Pinning On Network Type
internal fun PlayerActivity.showV137CacheSmartPinningOnNetworkTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137cacheSmartPinningOnNetworkType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Network Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137cacheSmartPinningOnNetworkType = value
        AppToast.show(this, "Cache Smart Pinning On Network Type: $value")
    }
}

// v137: Progress Bar Custom Thumb Color137
internal fun PlayerActivity.showV137ProgressBarCustomThumbColor137Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137progressBarCustomThumbColor137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137progressBarCustomThumbColor137 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color137: $value")
    }
}

// v137: Volume Normalize Smoothing
internal fun PlayerActivity.showV137VolumeNormalizeSmoothingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137volumeNormalizeSmoothing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Smoothing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137volumeNormalizeSmoothing = value
        AppToast.show(this, "Volume Normalize Smoothing: $value")
    }
}

// v137: History Auto Clean137
internal fun PlayerActivity.showV137HistoryAutoClean137Toggle() {
    val current = BiliClient.prefs.v137historyAutoClean137
    BiliClient.prefs.v137historyAutoClean137 = !current
    AppToast.show(this, "History Auto Clean137: ${if (!current) "ON" else "OFF"}")
}

// v137: Playback Speed Presets Notification Toggle
internal fun PlayerActivity.showV137PlaybackSpeedPresetsNotificationToggleToggle() {
    val current = BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle
    BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle = !current
    AppToast.show(this, "Playback Speed Presets Notification Toggle: ${if (!current) "ON" else "OFF"}")
}

// v137: Screenshot Auto Share Twitch
internal fun PlayerActivity.showV137ScreenshotAutoShareTwitchToggle() {
    val current = BiliClient.prefs.v137screenshotAutoShareTwitch
    BiliClient.prefs.v137screenshotAutoShareTwitch = !current
    AppToast.show(this, "Screenshot Auto Share Twitch: ${if (!current) "ON" else "OFF"}")
}

// v137: Video PIP Follow Do Not Disturb
internal fun PlayerActivity.showV137VideoPIPFollowDoNotDisturbToggle() {
    val current = BiliClient.prefs.v137videoPIPFollowDoNotDisturb
    BiliClient.prefs.v137videoPIPFollowDoNotDisturb = !current
    AppToast.show(this, "Video PIP Follow Do Not Disturb: ${if (!current) "ON" else "OFF"}")
}

// v137: Danmaku Font BG Fill Clip Radius
internal fun PlayerActivity.showV137DanmakuFontBgFillClipRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v137danmakuFontBgFillClipRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137danmakuFontBgFillClipRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius: $value")
    }
}

// v137: Subtitle Animation Translate137
internal fun PlayerActivity.showV137SubtitleAnimationTranslate137Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137subtitleAnimationTranslate137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137subtitleAnimationTranslate137 = value
        AppToast.show(this, "Subtitle Animation Translate137: $value")
    }
}

// v138: Audio Phaser Toggle138
internal fun PlayerActivity.showV138AudioPhaserToggle138Toggle() {
    val current = BiliClient.prefs.v138audioPhaserToggle138
    BiliClient.prefs.v138audioPhaserToggle138 = !current
    AppToast.show(this, "Audio Phaser Toggle138: ${if (!current) "ON" else "OFF"}")
}

// v138: Danmaku Font BG Fill Clip Radius137
internal fun PlayerActivity.showV138DanmakuFontBgFillClipRadius137Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v138danmakuFontBgFillClipRadius137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138danmakuFontBgFillClipRadius137 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius137: $value")
    }
}

// v138: Subtitle Animation Translate138
internal fun PlayerActivity.showV138SubtitleAnimationTranslate138Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138subtitleAnimationTranslate138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138subtitleAnimationTranslate138 = value
        AppToast.show(this, "Subtitle Animation Translate138: $value")
    }
}

// v138: Gesture Tap Zone Visual Opacity
internal fun PlayerActivity.showV138GestureTapZoneVisualOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v138gestureTapZoneVisualOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138gestureTapZoneVisualOpacity = value
        AppToast.show(this, "Gesture Tap Zone Visual Opacity: $value")
    }
}

// v138: Cast Video PIP Follow Storage
internal fun PlayerActivity.showV138CastVideoPIPFollowStorageToggle() {
    val current = BiliClient.prefs.v138castVideoPIPFollowStorage
    BiliClient.prefs.v138castVideoPIPFollowStorage = !current
    AppToast.show(this, "Cast Video PIP Follow Storage: ${if (!current) "ON" else "OFF"}")
}

// v138: Playlist Auto Group By Fav Count
internal fun PlayerActivity.showV138PlaylistAutoGroupByFavCountToggle() {
    val current = BiliClient.prefs.v138playlistAutoGroupByFavCount
    BiliClient.prefs.v138playlistAutoGroupByFavCount = !current
    AppToast.show(this, "Playlist Auto Group By Fav Count: ${if (!current) "ON" else "OFF"}")
}

// v138: Cache Smart Pinning On Storage Read
internal fun PlayerActivity.showV138CacheSmartPinningOnStorageReadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138cacheSmartPinningOnStorageRead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Read",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138cacheSmartPinningOnStorageRead = value
        AppToast.show(this, "Cache Smart Pinning On Storage Read: $value")
    }
}

// v138: Progress Bar Custom Thumb Shadow138
internal fun PlayerActivity.showV138ProgressBarCustomThumbShadow138Toggle() {
    val current = BiliClient.prefs.v138progressBarCustomThumbShadow138
    BiliClient.prefs.v138progressBarCustomThumbShadow138 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow138: ${if (!current) "ON" else "OFF"}")
}

// v138: Volume Normalize Gate
internal fun PlayerActivity.showV138VolumeNormalizeGateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138volumeNormalizeGate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Gate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138volumeNormalizeGate = value
        AppToast.show(this, "Volume Normalize Gate: $value")
    }
}

// v138: History Auto Clean138
internal fun PlayerActivity.showV138HistoryAutoClean138Toggle() {
    val current = BiliClient.prefs.v138historyAutoClean138
    BiliClient.prefs.v138historyAutoClean138 = !current
    AppToast.show(this, "History Auto Clean138: ${if (!current) "ON" else "OFF"}")
}

// v138: Playback Speed Presets Drag Adjust
internal fun PlayerActivity.showV138PlaybackSpeedPresetsDragAdjustToggle() {
    val current = BiliClient.prefs.v138playbackSpeedPresetsDragAdjust
    BiliClient.prefs.v138playbackSpeedPresetsDragAdjust = !current
    AppToast.show(this, "Playback Speed Presets Drag Adjust: ${if (!current) "ON" else "OFF"}")
}

// v138: Screenshot Auto Share YouTube
internal fun PlayerActivity.showV138ScreenshotAutoShareYouTubeToggle() {
    val current = BiliClient.prefs.v138screenshotAutoShareYouTube
    BiliClient.prefs.v138screenshotAutoShareYouTube = !current
    AppToast.show(this, "Screenshot Auto Share YouTube: ${if (!current) "ON" else "OFF"}")
}

// v138: Video PIP Follow Brightness
internal fun PlayerActivity.showV138VideoPIPFollowBrightnessToggle() {
    val current = BiliClient.prefs.v138videoPIPFollowBrightness
    BiliClient.prefs.v138videoPIPFollowBrightness = !current
    AppToast.show(this, "Video PIP Follow Brightness: ${if (!current) "ON" else "OFF"}")
}

// v138: Danmaku Font BG Fill Clip Radius138
internal fun PlayerActivity.showV138DanmakuFontBgFillClipRadius138Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v138danmakuFontBgFillClipRadius138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138danmakuFontBgFillClipRadius138 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius138: $value")
    }
}

// v138: Subtitle Animation Scale138
internal fun PlayerActivity.showV138SubtitleAnimationScale138Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v138subtitleAnimationScale138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138subtitleAnimationScale138 = value
        AppToast.show(this, "Subtitle Animation Scale138: $value")
    }
}

// v139: Audio Phaser Rate
internal fun PlayerActivity.showV139AudioPhaserRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v139audioPhaserRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139audioPhaserRate = value
        AppToast.show(this, "Audio Phaser Rate: $value")
    }
}

// v139: Danmaku Font BG Fill Clip Radius139
internal fun PlayerActivity.showV139DanmakuFontBgFillClipRadius139Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v139danmakuFontBgFillClipRadius139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139danmakuFontBgFillClipRadius139 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius139: $value")
    }
}

// v139: Subtitle Animation Scale139
internal fun PlayerActivity.showV139SubtitleAnimationScale139Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v139subtitleAnimationScale139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139subtitleAnimationScale139 = value
        AppToast.show(this, "Subtitle Animation Scale139: $value")
    }
}

// v139: Gesture Tap Zone Visual Duration
internal fun PlayerActivity.showV139GestureTapZoneVisualDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v139gestureTapZoneVisualDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139gestureTapZoneVisualDuration = value
        AppToast.show(this, "Gesture Tap Zone Visual Duration: $value")
    }
}

// v139: Cast Video PIP Follow Volume
internal fun PlayerActivity.showV139CastVideoPIPFollowVolumeToggle() {
    val current = BiliClient.prefs.v139castVideoPIPFollowVolume
    BiliClient.prefs.v139castVideoPIPFollowVolume = !current
    AppToast.show(this, "Cast Video PIP Follow Volume: ${if (!current) "ON" else "OFF"}")
}

// v139: Playlist Auto Group By Dan Count
internal fun PlayerActivity.showV139PlaylistAutoGroupByDanCountToggle() {
    val current = BiliClient.prefs.v139playlistAutoGroupByDanCount
    BiliClient.prefs.v139playlistAutoGroupByDanCount = !current
    AppToast.show(this, "Playlist Auto Group By Dan Count: ${if (!current) "ON" else "OFF"}")
}

// v139: Cache Smart Pinning On Storage Write
internal fun PlayerActivity.showV139CacheSmartPinningOnStorageWriteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139cacheSmartPinningOnStorageWrite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Write",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139cacheSmartPinningOnStorageWrite = value
        AppToast.show(this, "Cache Smart Pinning On Storage Write: $value")
    }
}

// v139: Progress Bar Custom Thumb Glow139
internal fun PlayerActivity.showV139ProgressBarCustomThumbGlow139Toggle() {
    val current = BiliClient.prefs.v139progressBarCustomThumbGlow139
    BiliClient.prefs.v139progressBarCustomThumbGlow139 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow139: ${if (!current) "ON" else "OFF"}")
}

// v139: Volume Normalize Knee
internal fun PlayerActivity.showV139VolumeNormalizeKneeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139volumeNormalizeKnee).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Knee",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139volumeNormalizeKnee = value
        AppToast.show(this, "Volume Normalize Knee: $value")
    }
}

// v139: History Auto Clean139
internal fun PlayerActivity.showV139HistoryAutoClean139Toggle() {
    val current = BiliClient.prefs.v139historyAutoClean139
    BiliClient.prefs.v139historyAutoClean139 = !current
    AppToast.show(this, "History Auto Clean139: ${if (!current) "ON" else "OFF"}")
}

// v139: Playback Speed Presets Swipe Adjust
internal fun PlayerActivity.showV139PlaybackSpeedPresetsSwipeAdjustToggle() {
    val current = BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust
    BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Swipe Adjust: ${if (!current) "ON" else "OFF"}")
}

// v139: Screenshot Auto Share Twitch Clip
internal fun PlayerActivity.showV139ScreenshotAutoShareTwitchClipToggle() {
    val current = BiliClient.prefs.v139screenshotAutoShareTwitchClip
    BiliClient.prefs.v139screenshotAutoShareTwitchClip = !current
    AppToast.show(this, "Screenshot Auto Share Twitch Clip: ${if (!current) "ON" else "OFF"}")
}

// v139: Video PIP Follow Contrast
internal fun PlayerActivity.showV139VideoPIPFollowContrastToggle() {
    val current = BiliClient.prefs.v139videoPIPFollowContrast
    BiliClient.prefs.v139videoPIPFollowContrast = !current
    AppToast.show(this, "Video PIP Follow Contrast: ${if (!current) "ON" else "OFF"}")
}

// v139: Danmaku Font BG Fill Clip Type
internal fun PlayerActivity.showV139DanmakuFontBgFillClipTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139danmakuFontBgFillClipType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139danmakuFontBgFillClipType = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type: $value")
    }
}

// v139: Subtitle Animation Rotate139
internal fun PlayerActivity.showV139SubtitleAnimationRotate139Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139subtitleAnimationRotate139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139subtitleAnimationRotate139 = value
        AppToast.show(this, "Subtitle Animation Rotate139: $value")
    }
}

// v140: Audio Phaser Depth
internal fun PlayerActivity.showV140AudioPhaserDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v140audioPhaserDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140audioPhaserDepth = value
        AppToast.show(this, "Audio Phaser Depth: $value")
    }
}

// v140: Danmaku Font BG Fill Clip Type139
internal fun PlayerActivity.showV140DanmakuFontBgFillClipType139Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140danmakuFontBgFillClipType139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140danmakuFontBgFillClipType139 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type139: $value")
    }
}

// v140: Subtitle Animation Rotate140
internal fun PlayerActivity.showV140SubtitleAnimationRotate140Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140subtitleAnimationRotate140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140subtitleAnimationRotate140 = value
        AppToast.show(this, "Subtitle Animation Rotate140: $value")
    }
}

// v140: Gesture Tap Zone Visual Scale
internal fun PlayerActivity.showV140GestureTapZoneVisualScaleDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v140gestureTapZoneVisualScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140gestureTapZoneVisualScale = value
        AppToast.show(this, "Gesture Tap Zone Visual Scale: $value")
    }
}

// v140: Cast Video PIP Follow Saturation
internal fun PlayerActivity.showV140CastVideoPIPFollowSaturationToggle() {
    val current = BiliClient.prefs.v140castVideoPIPFollowSaturation
    BiliClient.prefs.v140castVideoPIPFollowSaturation = !current
    AppToast.show(this, "Cast Video PIP Follow Saturation: ${if (!current) "ON" else "OFF"}")
}

// v140: Playlist Auto Group By Genre140
internal fun PlayerActivity.showV140PlaylistAutoGroupByGenre140Toggle() {
    val current = BiliClient.prefs.v140playlistAutoGroupByGenre140
    BiliClient.prefs.v140playlistAutoGroupByGenre140 = !current
    AppToast.show(this, "Playlist Auto Group By Genre140: ${if (!current) "ON" else "OFF"}")
}

// v140: Cache Smart Pinning On Storage IOPS
internal fun PlayerActivity.showV140CacheSmartPinningOnStorageIOPSDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140cacheSmartPinningOnStorageIOPS).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage IOPS",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140cacheSmartPinningOnStorageIOPS = value
        AppToast.show(this, "Cache Smart Pinning On Storage IOPS: $value")
    }
}

// v140: Progress Bar Custom Thumb Border140
internal fun PlayerActivity.showV140ProgressBarCustomThumbBorder140Toggle() {
    val current = BiliClient.prefs.v140progressBarCustomThumbBorder140
    BiliClient.prefs.v140progressBarCustomThumbBorder140 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border140: ${if (!current) "ON" else "OFF"}")
}

// v140: Volume Normalize Attack
internal fun PlayerActivity.showV140VolumeNormalizeAttackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140volumeNormalizeAttack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Attack",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140volumeNormalizeAttack = value
        AppToast.show(this, "Volume Normalize Attack: $value")
    }
}

// v140: History Auto Clean140
internal fun PlayerActivity.showV140HistoryAutoClean140Toggle() {
    val current = BiliClient.prefs.v140historyAutoClean140
    BiliClient.prefs.v140historyAutoClean140 = !current
    AppToast.show(this, "History Auto Clean140: ${if (!current) "ON" else "OFF"}")
}

// v140: Playback Speed Presets Pinch Adjust
internal fun PlayerActivity.showV140PlaybackSpeedPresetsPinchAdjustToggle() {
    val current = BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust
    BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust = !current
    AppToast.show(this, "Playback Speed Presets Pinch Adjust: ${if (!current) "ON" else "OFF"}")
}

// v140: Screenshot Auto Share Bilibili
internal fun PlayerActivity.showV140ScreenshotAutoShareBilibiliToggle() {
    val current = BiliClient.prefs.v140screenshotAutoShareBilibili
    BiliClient.prefs.v140screenshotAutoShareBilibili = !current
    AppToast.show(this, "Screenshot Auto Share Bilibili: ${if (!current) "ON" else "OFF"}")
}

// v140: Video PIP Follow Gamma
internal fun PlayerActivity.showV140VideoPIPFollowGammaToggle() {
    val current = BiliClient.prefs.v140videoPIPFollowGamma
    BiliClient.prefs.v140videoPIPFollowGamma = !current
    AppToast.show(this, "Video PIP Follow Gamma: ${if (!current) "ON" else "OFF"}")
}

// v140: Danmaku Font BG Fill Clip Type140
internal fun PlayerActivity.showV140DanmakuFontBgFillClipType140Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140danmakuFontBgFillClipType140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140danmakuFontBgFillClipType140 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type140: $value")
    }
}

// v140: Subtitle Animation Blur140
internal fun PlayerActivity.showV140SubtitleAnimationBlur140Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v140subtitleAnimationBlur140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140subtitleAnimationBlur140 = value
        AppToast.show(this, "Subtitle Animation Blur140: $value")
    }
}

// v141: Audio Phaser Feedback
internal fun PlayerActivity.showV141AudioPhaserFeedbackDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v141audioPhaserFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141audioPhaserFeedback = value
        AppToast.show(this, "Audio Phaser Feedback: $value")
    }
}

// v141: Danmaku Font BG Fill Clip Type140x
internal fun PlayerActivity.showV141DanmakuFontBgFillClipType140xDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141danmakuFontBgFillClipType140x).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type140x",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141danmakuFontBgFillClipType140x = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type140x: $value")
    }
}

// v141: Subtitle Animation Blur141
internal fun PlayerActivity.showV141SubtitleAnimationBlur141Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v141subtitleAnimationBlur141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141subtitleAnimationBlur141 = value
        AppToast.show(this, "Subtitle Animation Blur141: $value")
    }
}

// v141: Gesture Tap Zone Visual Anim
internal fun PlayerActivity.showV141GestureTapZoneVisualAnimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141gestureTapZoneVisualAnim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141gestureTapZoneVisualAnim = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim: $value")
    }
}

// v141: Cast Video PIP Snap To Corner
internal fun PlayerActivity.showV141CastVideoPIPSnapToCornerToggle() {
    val current = BiliClient.prefs.v141castVideoPIPSnapToCorner
    BiliClient.prefs.v141castVideoPIPSnapToCorner = !current
    AppToast.show(this, "Cast Video PIP Snap To Corner: ${if (!current) "ON" else "OFF"}")
}

// v141: Playlist Auto Group By Duration141
internal fun PlayerActivity.showV141PlaylistAutoGroupByDuration141Toggle() {
    val current = BiliClient.prefs.v141playlistAutoGroupByDuration141
    BiliClient.prefs.v141playlistAutoGroupByDuration141 = !current
    AppToast.show(this, "Playlist Auto Group By Duration141: ${if (!current) "ON" else "OFF"}")
}

// v141: Cache Smart Pinning On Schedule Type
internal fun PlayerActivity.showV141CacheSmartPinningOnScheduleTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141cacheSmartPinningOnScheduleType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141cacheSmartPinningOnScheduleType = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Type: $value")
    }
}

// v141: Progress Bar Custom Thumb Anim141
internal fun PlayerActivity.showV141ProgressBarCustomThumbAnim141Toggle() {
    val current = BiliClient.prefs.v141progressBarCustomThumbAnim141
    BiliClient.prefs.v141progressBarCustomThumbAnim141 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim141: ${if (!current) "ON" else "OFF"}")
}

// v141: Volume Normalize Range
internal fun PlayerActivity.showV141VolumeNormalizeRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141volumeNormalizeRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141volumeNormalizeRange = value
        AppToast.show(this, "Volume Normalize Range: $value")
    }
}

// v141: History Auto Clean141
internal fun PlayerActivity.showV141HistoryAutoClean141Toggle() {
    val current = BiliClient.prefs.v141historyAutoClean141
    BiliClient.prefs.v141historyAutoClean141 = !current
    AppToast.show(this, "History Auto Clean141: ${if (!current) "ON" else "OFF"}")
}

// v141: Playback Speed Presets Shake Adjust
internal fun PlayerActivity.showV141PlaybackSpeedPresetsShakeAdjustToggle() {
    val current = BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust
    BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Shake Adjust: ${if (!current) "ON" else "OFF"}")
}

// v141: Screenshot Auto Share Discord
internal fun PlayerActivity.showV141ScreenshotAutoShareDiscordToggle() {
    val current = BiliClient.prefs.v141screenshotAutoShareDiscord
    BiliClient.prefs.v141screenshotAutoShareDiscord = !current
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (!current) "ON" else "OFF"}")
}

// v141: Video PIP Follow Color Temp
internal fun PlayerActivity.showV141VideoPIPFollowColorTempToggle() {
    val current = BiliClient.prefs.v141videoPIPFollowColorTemp
    BiliClient.prefs.v141videoPIPFollowColorTemp = !current
    AppToast.show(this, "Video PIP Follow Color Temp: ${if (!current) "ON" else "OFF"}")
}

// v141: Danmaku Font BG Fill Mask Toggle
internal fun PlayerActivity.showV141DanmakuFontBgFillMaskToggleToggle() {
    val current = BiliClient.prefs.v141danmakuFontBgFillMaskToggle
    BiliClient.prefs.v141danmakuFontBgFillMaskToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Toggle: ${if (!current) "ON" else "OFF"}")
}

// v141: Subtitle Animation Fade In141
internal fun PlayerActivity.showV141SubtitleAnimationFadeIn141Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v141subtitleAnimationFadeIn141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141subtitleAnimationFadeIn141 = value
        AppToast.show(this, "Subtitle Animation Fade In141: $value")
    }
}

// v142: Audio Phaser Mix
internal fun PlayerActivity.showV142AudioPhaserMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v142audioPhaserMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142audioPhaserMix = value
        AppToast.show(this, "Audio Phaser Mix: $value")
    }
}

// v142: Danmaku Font BG Fill Mask Path
internal fun PlayerActivity.showV142DanmakuFontBgFillMaskPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142danmakuFontBgFillMaskPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142danmakuFontBgFillMaskPath = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path: $value")
    }
}

// v142: Subtitle Animation Fade In142
internal fun PlayerActivity.showV142SubtitleAnimationFadeIn142Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v142subtitleAnimationFadeIn142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142subtitleAnimationFadeIn142 = value
        AppToast.show(this, "Subtitle Animation Fade In142: $value")
    }
}

// v142: Gesture Tap Zone Visual Anim Duration
internal fun PlayerActivity.showV142GestureTapZoneVisualAnimDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v142gestureTapZoneVisualAnimDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142gestureTapZoneVisualAnimDuration = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Duration: $value")
    }
}

// v142: Cast Video PIP Snap To Edge
internal fun PlayerActivity.showV142CastVideoPIPSnapToEdgeToggle() {
    val current = BiliClient.prefs.v142castVideoPIPSnapToEdge
    BiliClient.prefs.v142castVideoPIPSnapToEdge = !current
    AppToast.show(this, "Cast Video PIP Snap To Edge: ${if (!current) "ON" else "OFF"}")
}

// v142: Playlist Auto Group By Duration142
internal fun PlayerActivity.showV142PlaylistAutoGroupByDuration142Toggle() {
    val current = BiliClient.prefs.v142playlistAutoGroupByDuration142
    BiliClient.prefs.v142playlistAutoGroupByDuration142 = !current
    AppToast.show(this, "Playlist Auto Group By Duration142: ${if (!current) "ON" else "OFF"}")
}

// v142: Cache Smart Pinning On Schedule Freq
internal fun PlayerActivity.showV142CacheSmartPinningOnScheduleFreqDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142cacheSmartPinningOnScheduleFreq).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Freq",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142cacheSmartPinningOnScheduleFreq = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Freq: $value")
    }
}

// v142: Progress Bar Custom Thumb Anim142
internal fun PlayerActivity.showV142ProgressBarCustomThumbAnim142Toggle() {
    val current = BiliClient.prefs.v142progressBarCustomThumbAnim142
    BiliClient.prefs.v142progressBarCustomThumbAnim142 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim142: ${if (!current) "ON" else "OFF"}")
}

// v142: Volume Normalize Stereo
internal fun PlayerActivity.showV142VolumeNormalizeStereoToggle() {
    val current = BiliClient.prefs.v142volumeNormalizeStereo
    BiliClient.prefs.v142volumeNormalizeStereo = !current
    AppToast.show(this, "Volume Normalize Stereo: ${if (!current) "ON" else "OFF"}")
}

// v142: History Auto Clean142
internal fun PlayerActivity.showV142HistoryAutoClean142Toggle() {
    val current = BiliClient.prefs.v142historyAutoClean142
    BiliClient.prefs.v142historyAutoClean142 = !current
    AppToast.show(this, "History Auto Clean142: ${if (!current) "ON" else "OFF"}")
}

// v142: Playback Speed Presets Tilt Adjust
internal fun PlayerActivity.showV142PlaybackSpeedPresetsTiltAdjustToggle() {
    val current = BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust
    BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust = !current
    AppToast.show(this, "Playback Speed Presets Tilt Adjust: ${if (!current) "ON" else "OFF"}")
}

// v142: Screenshot Auto Share WhatsApp
internal fun PlayerActivity.showV142ScreenshotAutoShareWhatsAppToggle() {
    val current = BiliClient.prefs.v142screenshotAutoShareWhatsApp
    BiliClient.prefs.v142screenshotAutoShareWhatsApp = !current
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (!current) "ON" else "OFF"}")
}

// v142: Video PIP Follow Color Space
internal fun PlayerActivity.showV142VideoPIPFollowColorSpaceToggle() {
    val current = BiliClient.prefs.v142videoPIPFollowColorSpace
    BiliClient.prefs.v142videoPIPFollowColorSpace = !current
    AppToast.show(this, "Video PIP Follow Color Space: ${if (!current) "ON" else "OFF"}")
}

// v142: Danmaku Font BG Fill Mask Path141
internal fun PlayerActivity.showV142DanmakuFontBgFillMaskPath141Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142danmakuFontBgFillMaskPath141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142danmakuFontBgFillMaskPath141 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path141: $value")
    }
}

// v142: Subtitle Animation Fade Out142
internal fun PlayerActivity.showV142SubtitleAnimationFadeOut142Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v142subtitleAnimationFadeOut142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142subtitleAnimationFadeOut142 = value
        AppToast.show(this, "Subtitle Animation Fade Out142: $value")
    }
}

// v143: Audio Phaser Stages
internal fun PlayerActivity.showV143AudioPhaserStagesDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143audioPhaserStages).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Stages",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143audioPhaserStages = value
        AppToast.show(this, "Audio Phaser Stages: $value")
    }
}

// v143: Danmaku Font BG Fill Mask Path142
internal fun PlayerActivity.showV143DanmakuFontBgFillMaskPath142Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143danmakuFontBgFillMaskPath142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143danmakuFontBgFillMaskPath142 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path142: $value")
    }
}

// v143: Subtitle Animation Fade Out143
internal fun PlayerActivity.showV143SubtitleAnimationFadeOut143Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v143subtitleAnimationFadeOut143).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out143",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143subtitleAnimationFadeOut143 = value
        AppToast.show(this, "Subtitle Animation Fade Out143: $value")
    }
}

// v1081: slow mode
internal fun PlayerActivity.showV1081SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1081slow
    FeaturePrefsStore.batch1081.v1081slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1081: small mode
internal fun PlayerActivity.showV1081SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1081small
    FeaturePrefsStore.batch1081.v1081small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1081: smart mode
internal fun PlayerActivity.showV1081SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1081smart
    FeaturePrefsStore.batch1081.v1081smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1081: smooth mode
internal fun PlayerActivity.showV1081SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1081smooth
    FeaturePrefsStore.batch1081.v1081smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1081: snap mode
internal fun PlayerActivity.showV1081SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1081snap
    FeaturePrefsStore.batch1081.v1081snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1081: socket level
internal fun PlayerActivity.showV1081SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1081: soft level
internal fun PlayerActivity.showV1081SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1081: sort level
internal fun PlayerActivity.showV1081SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1081: source level
internal fun PlayerActivity.showV1081SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081source = value
        AppToast.show(this, "source: $value")
    }
}

// v1081: space level
internal fun PlayerActivity.showV1081SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081space = value
        AppToast.show(this, "space: $value")
    }
}

// v1081: span mode
internal fun PlayerActivity.showV1081SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1081span
    FeaturePrefsStore.batch1081.v1081span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1081: spawn mode
internal fun PlayerActivity.showV1081SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1081spawn
    FeaturePrefsStore.batch1081.v1081spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1081: speed mode
internal fun PlayerActivity.showV1081SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1081speed
    FeaturePrefsStore.batch1081.v1081speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1081: split mode
internal fun PlayerActivity.showV1081SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1081split
    FeaturePrefsStore.batch1081.v1081split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1081: spot mode
internal fun PlayerActivity.showV1081SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1081spot
    FeaturePrefsStore.batch1081.v1081spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1082: slow mode
internal fun PlayerActivity.showV1082SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1082slow
    FeaturePrefsStore.batch1081.v1082slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1082: small mode
internal fun PlayerActivity.showV1082SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1082small
    FeaturePrefsStore.batch1081.v1082small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1082: smart mode
internal fun PlayerActivity.showV1082SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1082smart
    FeaturePrefsStore.batch1081.v1082smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1082: smooth mode
internal fun PlayerActivity.showV1082SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1082smooth
    FeaturePrefsStore.batch1081.v1082smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1082: snap mode
internal fun PlayerActivity.showV1082SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1082snap
    FeaturePrefsStore.batch1081.v1082snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1082: socket level
internal fun PlayerActivity.showV1082SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1082: soft level
internal fun PlayerActivity.showV1082SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1082: sort level
internal fun PlayerActivity.showV1082SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1082: source level
internal fun PlayerActivity.showV1082SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082source = value
        AppToast.show(this, "source: $value")
    }
}

// v1082: space level
internal fun PlayerActivity.showV1082SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082space = value
        AppToast.show(this, "space: $value")
    }
}

// v1082: span mode
internal fun PlayerActivity.showV1082SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1082span
    FeaturePrefsStore.batch1081.v1082span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1082: spawn mode
internal fun PlayerActivity.showV1082SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1082spawn
    FeaturePrefsStore.batch1081.v1082spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1082: speed mode
internal fun PlayerActivity.showV1082SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1082speed
    FeaturePrefsStore.batch1081.v1082speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1082: split mode
internal fun PlayerActivity.showV1082SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1082split
    FeaturePrefsStore.batch1081.v1082split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1082: spot mode
internal fun PlayerActivity.showV1082SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1082spot
    FeaturePrefsStore.batch1081.v1082spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1083: slow mode
internal fun PlayerActivity.showV1083SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1083slow
    FeaturePrefsStore.batch1081.v1083slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1083: small mode
internal fun PlayerActivity.showV1083SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1083small
    FeaturePrefsStore.batch1081.v1083small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1083: smart mode
internal fun PlayerActivity.showV1083SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1083smart
    FeaturePrefsStore.batch1081.v1083smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1083: smooth mode
internal fun PlayerActivity.showV1083SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1083smooth
    FeaturePrefsStore.batch1081.v1083smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1083: snap mode
internal fun PlayerActivity.showV1083SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1083snap
    FeaturePrefsStore.batch1081.v1083snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1083: socket level
internal fun PlayerActivity.showV1083SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1083: soft level
internal fun PlayerActivity.showV1083SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1083: sort level
internal fun PlayerActivity.showV1083SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1083: source level
internal fun PlayerActivity.showV1083SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083source = value
        AppToast.show(this, "source: $value")
    }
}

// v1083: space level
internal fun PlayerActivity.showV1083SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083space = value
        AppToast.show(this, "space: $value")
    }
}

// v1083: span mode
internal fun PlayerActivity.showV1083SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1083span
    FeaturePrefsStore.batch1081.v1083span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1083: spawn mode
internal fun PlayerActivity.showV1083SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1083spawn
    FeaturePrefsStore.batch1081.v1083spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1083: speed mode
internal fun PlayerActivity.showV1083SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1083speed
    FeaturePrefsStore.batch1081.v1083speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1083: split mode
internal fun PlayerActivity.showV1083SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1083split
    FeaturePrefsStore.batch1081.v1083split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1083: spot mode
internal fun PlayerActivity.showV1083SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1083spot
    FeaturePrefsStore.batch1081.v1083spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1084: slow mode
internal fun PlayerActivity.showV1084SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1084slow
    FeaturePrefsStore.batch1081.v1084slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1084: small mode
internal fun PlayerActivity.showV1084SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1084small
    FeaturePrefsStore.batch1081.v1084small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1084: smart mode
internal fun PlayerActivity.showV1084SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1084smart
    FeaturePrefsStore.batch1081.v1084smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1084: smooth mode
internal fun PlayerActivity.showV1084SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1084smooth
    FeaturePrefsStore.batch1081.v1084smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1084: snap mode
internal fun PlayerActivity.showV1084SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1084snap
    FeaturePrefsStore.batch1081.v1084snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1084: socket level
internal fun PlayerActivity.showV1084SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1084: soft level
internal fun PlayerActivity.showV1084SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1084: sort level
internal fun PlayerActivity.showV1084SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1084: source level
internal fun PlayerActivity.showV1084SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084source = value
        AppToast.show(this, "source: $value")
    }
}

// v1084: space level
internal fun PlayerActivity.showV1084SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084space = value
        AppToast.show(this, "space: $value")
    }
}

// v1084: span mode
internal fun PlayerActivity.showV1084SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1084span
    FeaturePrefsStore.batch1081.v1084span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1084: spawn mode
internal fun PlayerActivity.showV1084SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1084spawn
    FeaturePrefsStore.batch1081.v1084spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1084: speed mode
internal fun PlayerActivity.showV1084SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1084speed
    FeaturePrefsStore.batch1081.v1084speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1084: split mode
internal fun PlayerActivity.showV1084SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1084split
    FeaturePrefsStore.batch1081.v1084split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1084: spot mode
internal fun PlayerActivity.showV1084SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1084spot
    FeaturePrefsStore.batch1081.v1084spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1085: slow mode
internal fun PlayerActivity.showV1085SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1085slow
    FeaturePrefsStore.batch1081.v1085slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1085: small mode
internal fun PlayerActivity.showV1085SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1085small
    FeaturePrefsStore.batch1081.v1085small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1085: smart mode
internal fun PlayerActivity.showV1085SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1085smart
    FeaturePrefsStore.batch1081.v1085smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1085: smooth mode
internal fun PlayerActivity.showV1085SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1085smooth
    FeaturePrefsStore.batch1081.v1085smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1085: snap mode
internal fun PlayerActivity.showV1085SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1085snap
    FeaturePrefsStore.batch1081.v1085snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1085: socket level
internal fun PlayerActivity.showV1085SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1085: soft level
internal fun PlayerActivity.showV1085SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1085: sort level
internal fun PlayerActivity.showV1085SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1085: source level
internal fun PlayerActivity.showV1085SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085source = value
        AppToast.show(this, "source: $value")
    }
}

// v1085: space level
internal fun PlayerActivity.showV1085SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085space = value
        AppToast.show(this, "space: $value")
    }
}

// v1085: span mode
internal fun PlayerActivity.showV1085SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1085span
    FeaturePrefsStore.batch1081.v1085span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1085: spawn mode
internal fun PlayerActivity.showV1085SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1085spawn
    FeaturePrefsStore.batch1081.v1085spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1085: speed mode
internal fun PlayerActivity.showV1085SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1085speed
    FeaturePrefsStore.batch1081.v1085speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1085: split mode
internal fun PlayerActivity.showV1085SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1085split
    FeaturePrefsStore.batch1081.v1085split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1085: spot mode
internal fun PlayerActivity.showV1085SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1085spot
    FeaturePrefsStore.batch1081.v1085spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1086: slow mode
internal fun PlayerActivity.showV1086SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1086slow
    FeaturePrefsStore.batch1081.v1086slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1086: small mode
internal fun PlayerActivity.showV1086SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1086small
    FeaturePrefsStore.batch1081.v1086small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1086: smart mode
internal fun PlayerActivity.showV1086SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1086smart
    FeaturePrefsStore.batch1081.v1086smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1086: smooth mode
internal fun PlayerActivity.showV1086SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1086smooth
    FeaturePrefsStore.batch1081.v1086smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1086: snap mode
internal fun PlayerActivity.showV1086SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1086snap
    FeaturePrefsStore.batch1081.v1086snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1086: socket level
internal fun PlayerActivity.showV1086SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1086: soft level
internal fun PlayerActivity.showV1086SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1086: sort level
internal fun PlayerActivity.showV1086SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1086: source level
internal fun PlayerActivity.showV1086SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086source = value
        AppToast.show(this, "source: $value")
    }
}

// v1086: space level
internal fun PlayerActivity.showV1086SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086space = value
        AppToast.show(this, "space: $value")
    }
}

// v1086: span mode
internal fun PlayerActivity.showV1086SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1086span
    FeaturePrefsStore.batch1081.v1086span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1086: spawn mode
internal fun PlayerActivity.showV1086SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1086spawn
    FeaturePrefsStore.batch1081.v1086spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1086: speed mode
internal fun PlayerActivity.showV1086SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1086speed
    FeaturePrefsStore.batch1081.v1086speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1086: split mode
internal fun PlayerActivity.showV1086SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1086split
    FeaturePrefsStore.batch1081.v1086split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1086: spot mode
internal fun PlayerActivity.showV1086SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1086spot
    FeaturePrefsStore.batch1081.v1086spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1087: slow mode
internal fun PlayerActivity.showV1087SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1087slow
    FeaturePrefsStore.batch1081.v1087slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1087: small mode
internal fun PlayerActivity.showV1087SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1087small
    FeaturePrefsStore.batch1081.v1087small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1087: smart mode
internal fun PlayerActivity.showV1087SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1087smart
    FeaturePrefsStore.batch1081.v1087smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1087: smooth mode
internal fun PlayerActivity.showV1087SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1087smooth
    FeaturePrefsStore.batch1081.v1087smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1087: snap mode
internal fun PlayerActivity.showV1087SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1087snap
    FeaturePrefsStore.batch1081.v1087snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1087: socket level
internal fun PlayerActivity.showV1087SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1087: soft level
internal fun PlayerActivity.showV1087SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1087: sort level
internal fun PlayerActivity.showV1087SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1087: source level
internal fun PlayerActivity.showV1087SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087source = value
        AppToast.show(this, "source: $value")
    }
}

// v1087: space level
internal fun PlayerActivity.showV1087SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087space = value
        AppToast.show(this, "space: $value")
    }
}

// v1087: span mode
internal fun PlayerActivity.showV1087SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1087span
    FeaturePrefsStore.batch1081.v1087span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1087: spawn mode
internal fun PlayerActivity.showV1087SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1087spawn
    FeaturePrefsStore.batch1081.v1087spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1087: speed mode
internal fun PlayerActivity.showV1087SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1087speed
    FeaturePrefsStore.batch1081.v1087speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1087: split mode
internal fun PlayerActivity.showV1087SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1087split
    FeaturePrefsStore.batch1081.v1087split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1087: spot mode
internal fun PlayerActivity.showV1087SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1087spot
    FeaturePrefsStore.batch1081.v1087spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1088: slow mode
internal fun PlayerActivity.showV1088SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1088slow
    FeaturePrefsStore.batch1081.v1088slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1088: small mode
internal fun PlayerActivity.showV1088SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1088small
    FeaturePrefsStore.batch1081.v1088small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1088: smart mode
internal fun PlayerActivity.showV1088SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1088smart
    FeaturePrefsStore.batch1081.v1088smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1088: smooth mode
internal fun PlayerActivity.showV1088SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1088smooth
    FeaturePrefsStore.batch1081.v1088smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1088: snap mode
internal fun PlayerActivity.showV1088SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1088snap
    FeaturePrefsStore.batch1081.v1088snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1088: socket level
internal fun PlayerActivity.showV1088SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1088: soft level
internal fun PlayerActivity.showV1088SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1088: sort level
internal fun PlayerActivity.showV1088SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1088: source level
internal fun PlayerActivity.showV1088SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088source = value
        AppToast.show(this, "source: $value")
    }
}

// v1088: space level
internal fun PlayerActivity.showV1088SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088space = value
        AppToast.show(this, "space: $value")
    }
}

// v1088: span mode
internal fun PlayerActivity.showV1088SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1088span
    FeaturePrefsStore.batch1081.v1088span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1088: spawn mode
internal fun PlayerActivity.showV1088SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1088spawn
    FeaturePrefsStore.batch1081.v1088spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1088: speed mode
internal fun PlayerActivity.showV1088SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1088speed
    FeaturePrefsStore.batch1081.v1088speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1088: split mode
internal fun PlayerActivity.showV1088SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1088split
    FeaturePrefsStore.batch1081.v1088split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1088: spot mode
internal fun PlayerActivity.showV1088SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1088spot
    FeaturePrefsStore.batch1081.v1088spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1089: slow mode
internal fun PlayerActivity.showV1089SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1089slow
    FeaturePrefsStore.batch1081.v1089slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1089: small mode
internal fun PlayerActivity.showV1089SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1089small
    FeaturePrefsStore.batch1081.v1089small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1089: smart mode
internal fun PlayerActivity.showV1089SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1089smart
    FeaturePrefsStore.batch1081.v1089smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1089: smooth mode
internal fun PlayerActivity.showV1089SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1089smooth
    FeaturePrefsStore.batch1081.v1089smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1089: snap mode
internal fun PlayerActivity.showV1089SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1089snap
    FeaturePrefsStore.batch1081.v1089snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1089: socket level
internal fun PlayerActivity.showV1089SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1089: soft level
internal fun PlayerActivity.showV1089SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1089: sort level
internal fun PlayerActivity.showV1089SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1089: source level
internal fun PlayerActivity.showV1089SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089source = value
        AppToast.show(this, "source: $value")
    }
}

// v1089: space level
internal fun PlayerActivity.showV1089SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089space = value
        AppToast.show(this, "space: $value")
    }
}

// v1089: span mode
internal fun PlayerActivity.showV1089SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1089span
    FeaturePrefsStore.batch1081.v1089span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1089: spawn mode
internal fun PlayerActivity.showV1089SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1089spawn
    FeaturePrefsStore.batch1081.v1089spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1089: speed mode
internal fun PlayerActivity.showV1089SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1089speed
    FeaturePrefsStore.batch1081.v1089speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1089: split mode
internal fun PlayerActivity.showV1089SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1089split
    FeaturePrefsStore.batch1081.v1089split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1089: spot mode
internal fun PlayerActivity.showV1089SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1089spot
    FeaturePrefsStore.batch1081.v1089spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1090: slow mode
internal fun PlayerActivity.showV1090SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1090slow
    FeaturePrefsStore.batch1081.v1090slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1090: small mode
internal fun PlayerActivity.showV1090SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1090small
    FeaturePrefsStore.batch1081.v1090small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1090: smart mode
internal fun PlayerActivity.showV1090SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1090smart
    FeaturePrefsStore.batch1081.v1090smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1090: smooth mode
internal fun PlayerActivity.showV1090SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1090smooth
    FeaturePrefsStore.batch1081.v1090smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1090: snap mode
internal fun PlayerActivity.showV1090SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1090snap
    FeaturePrefsStore.batch1081.v1090snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1090: socket level
internal fun PlayerActivity.showV1090SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1090: soft level
internal fun PlayerActivity.showV1090SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1090: sort level
internal fun PlayerActivity.showV1090SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1090: source level
internal fun PlayerActivity.showV1090SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090source = value
        AppToast.show(this, "source: $value")
    }
}

// v1090: space level
internal fun PlayerActivity.showV1090SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090space = value
        AppToast.show(this, "space: $value")
    }
}

// v1090: span mode
internal fun PlayerActivity.showV1090SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1090span
    FeaturePrefsStore.batch1081.v1090span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1090: spawn mode
internal fun PlayerActivity.showV1090SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1090spawn
    FeaturePrefsStore.batch1081.v1090spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1090: speed mode
internal fun PlayerActivity.showV1090SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1090speed
    FeaturePrefsStore.batch1081.v1090speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1090: split mode
internal fun PlayerActivity.showV1090SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1090split
    FeaturePrefsStore.batch1081.v1090split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1090: spot mode
internal fun PlayerActivity.showV1090SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1090spot
    FeaturePrefsStore.batch1081.v1090spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}
