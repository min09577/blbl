package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v831: fetch mode
internal fun PlayerActivity.showV831FetchToggle() {
    val current = FeaturePrefsStore.batch831.v831fetch
    FeaturePrefsStore.batch831.v831fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v831: field mode
internal fun PlayerActivity.showV831FieldToggle() {
    val current = FeaturePrefsStore.batch831.v831field
    FeaturePrefsStore.batch831.v831field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v831: file mode
internal fun PlayerActivity.showV831FileToggle() {
    val current = FeaturePrefsStore.batch831.v831file
    FeaturePrefsStore.batch831.v831file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v831: fill mode
internal fun PlayerActivity.showV831FillToggle() {
    val current = FeaturePrefsStore.batch831.v831fill
    FeaturePrefsStore.batch831.v831fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v831: filter mode
internal fun PlayerActivity.showV831FilterToggle() {
    val current = FeaturePrefsStore.batch831.v831filter
    FeaturePrefsStore.batch831.v831filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v831: final level
internal fun PlayerActivity.showV831FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831final = value
        AppToast.show(this, "final: $value")
    }
}

// v831: find level
internal fun PlayerActivity.showV831FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831find = value
        AppToast.show(this, "find: $value")
    }
}

// v831: finger level
internal fun PlayerActivity.showV831FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v831: finish level
internal fun PlayerActivity.showV831FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v831: fire level
internal fun PlayerActivity.showV831FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v831: firmware mode
internal fun PlayerActivity.showV831FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v831firmware
    FeaturePrefsStore.batch831.v831firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v831: flag mode
internal fun PlayerActivity.showV831FlagToggle() {
    val current = FeaturePrefsStore.batch831.v831flag
    FeaturePrefsStore.batch831.v831flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v831: flash mode
internal fun PlayerActivity.showV831FlashToggle() {
    val current = FeaturePrefsStore.batch831.v831flash
    FeaturePrefsStore.batch831.v831flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v831: flat mode
internal fun PlayerActivity.showV831FlatToggle() {
    val current = FeaturePrefsStore.batch831.v831flat
    FeaturePrefsStore.batch831.v831flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v831: flip mode
internal fun PlayerActivity.showV831FlipToggle() {
    val current = FeaturePrefsStore.batch831.v831flip
    FeaturePrefsStore.batch831.v831flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v832: fetch mode
internal fun PlayerActivity.showV832FetchToggle() {
    val current = FeaturePrefsStore.batch831.v832fetch
    FeaturePrefsStore.batch831.v832fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v832: field mode
internal fun PlayerActivity.showV832FieldToggle() {
    val current = FeaturePrefsStore.batch831.v832field
    FeaturePrefsStore.batch831.v832field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v832: file mode
internal fun PlayerActivity.showV832FileToggle() {
    val current = FeaturePrefsStore.batch831.v832file
    FeaturePrefsStore.batch831.v832file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v832: fill mode
internal fun PlayerActivity.showV832FillToggle() {
    val current = FeaturePrefsStore.batch831.v832fill
    FeaturePrefsStore.batch831.v832fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v832: filter mode
internal fun PlayerActivity.showV832FilterToggle() {
    val current = FeaturePrefsStore.batch831.v832filter
    FeaturePrefsStore.batch831.v832filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v832: final level
internal fun PlayerActivity.showV832FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832final = value
        AppToast.show(this, "final: $value")
    }
}

// v832: find level
internal fun PlayerActivity.showV832FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832find = value
        AppToast.show(this, "find: $value")
    }
}

// v832: finger level
internal fun PlayerActivity.showV832FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v832: finish level
internal fun PlayerActivity.showV832FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v832: fire level
internal fun PlayerActivity.showV832FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v832: firmware mode
internal fun PlayerActivity.showV832FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v832firmware
    FeaturePrefsStore.batch831.v832firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v832: flag mode
internal fun PlayerActivity.showV832FlagToggle() {
    val current = FeaturePrefsStore.batch831.v832flag
    FeaturePrefsStore.batch831.v832flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v832: flash mode
internal fun PlayerActivity.showV832FlashToggle() {
    val current = FeaturePrefsStore.batch831.v832flash
    FeaturePrefsStore.batch831.v832flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v832: flat mode
internal fun PlayerActivity.showV832FlatToggle() {
    val current = FeaturePrefsStore.batch831.v832flat
    FeaturePrefsStore.batch831.v832flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v832: flip mode
internal fun PlayerActivity.showV832FlipToggle() {
    val current = FeaturePrefsStore.batch831.v832flip
    FeaturePrefsStore.batch831.v832flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v833: fetch mode
internal fun PlayerActivity.showV833FetchToggle() {
    val current = FeaturePrefsStore.batch831.v833fetch
    FeaturePrefsStore.batch831.v833fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v833: field mode
internal fun PlayerActivity.showV833FieldToggle() {
    val current = FeaturePrefsStore.batch831.v833field
    FeaturePrefsStore.batch831.v833field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v833: file mode
internal fun PlayerActivity.showV833FileToggle() {
    val current = FeaturePrefsStore.batch831.v833file
    FeaturePrefsStore.batch831.v833file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v833: fill mode
internal fun PlayerActivity.showV833FillToggle() {
    val current = FeaturePrefsStore.batch831.v833fill
    FeaturePrefsStore.batch831.v833fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v833: filter mode
internal fun PlayerActivity.showV833FilterToggle() {
    val current = FeaturePrefsStore.batch831.v833filter
    FeaturePrefsStore.batch831.v833filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v833: final level
internal fun PlayerActivity.showV833FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833final = value
        AppToast.show(this, "final: $value")
    }
}

// v833: find level
internal fun PlayerActivity.showV833FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833find = value
        AppToast.show(this, "find: $value")
    }
}

// v833: finger level
internal fun PlayerActivity.showV833FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v833: finish level
internal fun PlayerActivity.showV833FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v833: fire level
internal fun PlayerActivity.showV833FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v833: firmware mode
internal fun PlayerActivity.showV833FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v833firmware
    FeaturePrefsStore.batch831.v833firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v833: flag mode
internal fun PlayerActivity.showV833FlagToggle() {
    val current = FeaturePrefsStore.batch831.v833flag
    FeaturePrefsStore.batch831.v833flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v833: flash mode
internal fun PlayerActivity.showV833FlashToggle() {
    val current = FeaturePrefsStore.batch831.v833flash
    FeaturePrefsStore.batch831.v833flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v833: flat mode
internal fun PlayerActivity.showV833FlatToggle() {
    val current = FeaturePrefsStore.batch831.v833flat
    FeaturePrefsStore.batch831.v833flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v833: flip mode
internal fun PlayerActivity.showV833FlipToggle() {
    val current = FeaturePrefsStore.batch831.v833flip
    FeaturePrefsStore.batch831.v833flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v834: fetch mode
internal fun PlayerActivity.showV834FetchToggle() {
    val current = FeaturePrefsStore.batch831.v834fetch
    FeaturePrefsStore.batch831.v834fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v834: field mode
internal fun PlayerActivity.showV834FieldToggle() {
    val current = FeaturePrefsStore.batch831.v834field
    FeaturePrefsStore.batch831.v834field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v834: file mode
internal fun PlayerActivity.showV834FileToggle() {
    val current = FeaturePrefsStore.batch831.v834file
    FeaturePrefsStore.batch831.v834file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v834: fill mode
internal fun PlayerActivity.showV834FillToggle() {
    val current = FeaturePrefsStore.batch831.v834fill
    FeaturePrefsStore.batch831.v834fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v834: filter mode
internal fun PlayerActivity.showV834FilterToggle() {
    val current = FeaturePrefsStore.batch831.v834filter
    FeaturePrefsStore.batch831.v834filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v834: final level
internal fun PlayerActivity.showV834FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834final = value
        AppToast.show(this, "final: $value")
    }
}

// v834: find level
internal fun PlayerActivity.showV834FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834find = value
        AppToast.show(this, "find: $value")
    }
}

// v834: finger level
internal fun PlayerActivity.showV834FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v834: finish level
internal fun PlayerActivity.showV834FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v834: fire level
internal fun PlayerActivity.showV834FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v834: firmware mode
internal fun PlayerActivity.showV834FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v834firmware
    FeaturePrefsStore.batch831.v834firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v834: flag mode
internal fun PlayerActivity.showV834FlagToggle() {
    val current = FeaturePrefsStore.batch831.v834flag
    FeaturePrefsStore.batch831.v834flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v834: flash mode
internal fun PlayerActivity.showV834FlashToggle() {
    val current = FeaturePrefsStore.batch831.v834flash
    FeaturePrefsStore.batch831.v834flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v834: flat mode
internal fun PlayerActivity.showV834FlatToggle() {
    val current = FeaturePrefsStore.batch831.v834flat
    FeaturePrefsStore.batch831.v834flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v834: flip mode
internal fun PlayerActivity.showV834FlipToggle() {
    val current = FeaturePrefsStore.batch831.v834flip
    FeaturePrefsStore.batch831.v834flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v835: fetch mode
internal fun PlayerActivity.showV835FetchToggle() {
    val current = FeaturePrefsStore.batch831.v835fetch
    FeaturePrefsStore.batch831.v835fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v835: field mode
internal fun PlayerActivity.showV835FieldToggle() {
    val current = FeaturePrefsStore.batch831.v835field
    FeaturePrefsStore.batch831.v835field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v835: file mode
internal fun PlayerActivity.showV835FileToggle() {
    val current = FeaturePrefsStore.batch831.v835file
    FeaturePrefsStore.batch831.v835file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v835: fill mode
internal fun PlayerActivity.showV835FillToggle() {
    val current = FeaturePrefsStore.batch831.v835fill
    FeaturePrefsStore.batch831.v835fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v835: filter mode
internal fun PlayerActivity.showV835FilterToggle() {
    val current = FeaturePrefsStore.batch831.v835filter
    FeaturePrefsStore.batch831.v835filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v835: final level
internal fun PlayerActivity.showV835FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835final = value
        AppToast.show(this, "final: $value")
    }
}

// v835: find level
internal fun PlayerActivity.showV835FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835find = value
        AppToast.show(this, "find: $value")
    }
}

// v835: finger level
internal fun PlayerActivity.showV835FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v835: finish level
internal fun PlayerActivity.showV835FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v835: fire level
internal fun PlayerActivity.showV835FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v835: firmware mode
internal fun PlayerActivity.showV835FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v835firmware
    FeaturePrefsStore.batch831.v835firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v835: flag mode
internal fun PlayerActivity.showV835FlagToggle() {
    val current = FeaturePrefsStore.batch831.v835flag
    FeaturePrefsStore.batch831.v835flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v835: flash mode
internal fun PlayerActivity.showV835FlashToggle() {
    val current = FeaturePrefsStore.batch831.v835flash
    FeaturePrefsStore.batch831.v835flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v835: flat mode
internal fun PlayerActivity.showV835FlatToggle() {
    val current = FeaturePrefsStore.batch831.v835flat
    FeaturePrefsStore.batch831.v835flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v835: flip mode
internal fun PlayerActivity.showV835FlipToggle() {
    val current = FeaturePrefsStore.batch831.v835flip
    FeaturePrefsStore.batch831.v835flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v836: fetch mode
internal fun PlayerActivity.showV836FetchToggle() {
    val current = FeaturePrefsStore.batch831.v836fetch
    FeaturePrefsStore.batch831.v836fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v836: field mode
internal fun PlayerActivity.showV836FieldToggle() {
    val current = FeaturePrefsStore.batch831.v836field
    FeaturePrefsStore.batch831.v836field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v836: file mode
internal fun PlayerActivity.showV836FileToggle() {
    val current = FeaturePrefsStore.batch831.v836file
    FeaturePrefsStore.batch831.v836file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v836: fill mode
internal fun PlayerActivity.showV836FillToggle() {
    val current = FeaturePrefsStore.batch831.v836fill
    FeaturePrefsStore.batch831.v836fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v836: filter mode
internal fun PlayerActivity.showV836FilterToggle() {
    val current = FeaturePrefsStore.batch831.v836filter
    FeaturePrefsStore.batch831.v836filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v836: final level
internal fun PlayerActivity.showV836FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836final = value
        AppToast.show(this, "final: $value")
    }
}

// v836: find level
internal fun PlayerActivity.showV836FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836find = value
        AppToast.show(this, "find: $value")
    }
}

// v836: finger level
internal fun PlayerActivity.showV836FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v836: finish level
internal fun PlayerActivity.showV836FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v836: fire level
internal fun PlayerActivity.showV836FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v836: firmware mode
internal fun PlayerActivity.showV836FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v836firmware
    FeaturePrefsStore.batch831.v836firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v836: flag mode
internal fun PlayerActivity.showV836FlagToggle() {
    val current = FeaturePrefsStore.batch831.v836flag
    FeaturePrefsStore.batch831.v836flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v836: flash mode
internal fun PlayerActivity.showV836FlashToggle() {
    val current = FeaturePrefsStore.batch831.v836flash
    FeaturePrefsStore.batch831.v836flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v836: flat mode
internal fun PlayerActivity.showV836FlatToggle() {
    val current = FeaturePrefsStore.batch831.v836flat
    FeaturePrefsStore.batch831.v836flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v836: flip mode
internal fun PlayerActivity.showV836FlipToggle() {
    val current = FeaturePrefsStore.batch831.v836flip
    FeaturePrefsStore.batch831.v836flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v837: fetch mode
internal fun PlayerActivity.showV837FetchToggle() {
    val current = FeaturePrefsStore.batch831.v837fetch
    FeaturePrefsStore.batch831.v837fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v837: field mode
internal fun PlayerActivity.showV837FieldToggle() {
    val current = FeaturePrefsStore.batch831.v837field
    FeaturePrefsStore.batch831.v837field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v837: file mode
internal fun PlayerActivity.showV837FileToggle() {
    val current = FeaturePrefsStore.batch831.v837file
    FeaturePrefsStore.batch831.v837file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v837: fill mode
internal fun PlayerActivity.showV837FillToggle() {
    val current = FeaturePrefsStore.batch831.v837fill
    FeaturePrefsStore.batch831.v837fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v837: filter mode
internal fun PlayerActivity.showV837FilterToggle() {
    val current = FeaturePrefsStore.batch831.v837filter
    FeaturePrefsStore.batch831.v837filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v837: final level
internal fun PlayerActivity.showV837FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837final = value
        AppToast.show(this, "final: $value")
    }
}

// v837: find level
internal fun PlayerActivity.showV837FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837find = value
        AppToast.show(this, "find: $value")
    }
}

// v837: finger level
internal fun PlayerActivity.showV837FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v837: finish level
internal fun PlayerActivity.showV837FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v837: fire level
internal fun PlayerActivity.showV837FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v837: firmware mode
internal fun PlayerActivity.showV837FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v837firmware
    FeaturePrefsStore.batch831.v837firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v837: flag mode
internal fun PlayerActivity.showV837FlagToggle() {
    val current = FeaturePrefsStore.batch831.v837flag
    FeaturePrefsStore.batch831.v837flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v837: flash mode
internal fun PlayerActivity.showV837FlashToggle() {
    val current = FeaturePrefsStore.batch831.v837flash
    FeaturePrefsStore.batch831.v837flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v837: flat mode
internal fun PlayerActivity.showV837FlatToggle() {
    val current = FeaturePrefsStore.batch831.v837flat
    FeaturePrefsStore.batch831.v837flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v837: flip mode
internal fun PlayerActivity.showV837FlipToggle() {
    val current = FeaturePrefsStore.batch831.v837flip
    FeaturePrefsStore.batch831.v837flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v838: fetch mode
internal fun PlayerActivity.showV838FetchToggle() {
    val current = FeaturePrefsStore.batch831.v838fetch
    FeaturePrefsStore.batch831.v838fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v838: field mode
internal fun PlayerActivity.showV838FieldToggle() {
    val current = FeaturePrefsStore.batch831.v838field
    FeaturePrefsStore.batch831.v838field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v838: file mode
internal fun PlayerActivity.showV838FileToggle() {
    val current = FeaturePrefsStore.batch831.v838file
    FeaturePrefsStore.batch831.v838file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v838: fill mode
internal fun PlayerActivity.showV838FillToggle() {
    val current = FeaturePrefsStore.batch831.v838fill
    FeaturePrefsStore.batch831.v838fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v838: filter mode
internal fun PlayerActivity.showV838FilterToggle() {
    val current = FeaturePrefsStore.batch831.v838filter
    FeaturePrefsStore.batch831.v838filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v838: final level
internal fun PlayerActivity.showV838FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838final = value
        AppToast.show(this, "final: $value")
    }
}

// v838: find level
internal fun PlayerActivity.showV838FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838find = value
        AppToast.show(this, "find: $value")
    }
}

// v838: finger level
internal fun PlayerActivity.showV838FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v838: finish level
internal fun PlayerActivity.showV838FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v838: fire level
internal fun PlayerActivity.showV838FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v838: firmware mode
internal fun PlayerActivity.showV838FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v838firmware
    FeaturePrefsStore.batch831.v838firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v838: flag mode
internal fun PlayerActivity.showV838FlagToggle() {
    val current = FeaturePrefsStore.batch831.v838flag
    FeaturePrefsStore.batch831.v838flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v838: flash mode
internal fun PlayerActivity.showV838FlashToggle() {
    val current = FeaturePrefsStore.batch831.v838flash
    FeaturePrefsStore.batch831.v838flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v838: flat mode
internal fun PlayerActivity.showV838FlatToggle() {
    val current = FeaturePrefsStore.batch831.v838flat
    FeaturePrefsStore.batch831.v838flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v838: flip mode
internal fun PlayerActivity.showV838FlipToggle() {
    val current = FeaturePrefsStore.batch831.v838flip
    FeaturePrefsStore.batch831.v838flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v839: fetch mode
internal fun PlayerActivity.showV839FetchToggle() {
    val current = FeaturePrefsStore.batch831.v839fetch
    FeaturePrefsStore.batch831.v839fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v839: field mode
internal fun PlayerActivity.showV839FieldToggle() {
    val current = FeaturePrefsStore.batch831.v839field
    FeaturePrefsStore.batch831.v839field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v839: file mode
internal fun PlayerActivity.showV839FileToggle() {
    val current = FeaturePrefsStore.batch831.v839file
    FeaturePrefsStore.batch831.v839file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v839: fill mode
internal fun PlayerActivity.showV839FillToggle() {
    val current = FeaturePrefsStore.batch831.v839fill
    FeaturePrefsStore.batch831.v839fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v839: filter mode
internal fun PlayerActivity.showV839FilterToggle() {
    val current = FeaturePrefsStore.batch831.v839filter
    FeaturePrefsStore.batch831.v839filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v839: final level
internal fun PlayerActivity.showV839FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839final = value
        AppToast.show(this, "final: $value")
    }
}

// v839: find level
internal fun PlayerActivity.showV839FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839find = value
        AppToast.show(this, "find: $value")
    }
}

// v839: finger level
internal fun PlayerActivity.showV839FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v839: finish level
internal fun PlayerActivity.showV839FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v839: fire level
internal fun PlayerActivity.showV839FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v839: firmware mode
internal fun PlayerActivity.showV839FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v839firmware
    FeaturePrefsStore.batch831.v839firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v839: flag mode
internal fun PlayerActivity.showV839FlagToggle() {
    val current = FeaturePrefsStore.batch831.v839flag
    FeaturePrefsStore.batch831.v839flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v839: flash mode
internal fun PlayerActivity.showV839FlashToggle() {
    val current = FeaturePrefsStore.batch831.v839flash
    FeaturePrefsStore.batch831.v839flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v839: flat mode
internal fun PlayerActivity.showV839FlatToggle() {
    val current = FeaturePrefsStore.batch831.v839flat
    FeaturePrefsStore.batch831.v839flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v839: flip mode
internal fun PlayerActivity.showV839FlipToggle() {
    val current = FeaturePrefsStore.batch831.v839flip
    FeaturePrefsStore.batch831.v839flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v840: fetch mode
internal fun PlayerActivity.showV840FetchToggle() {
    val current = FeaturePrefsStore.batch831.v840fetch
    FeaturePrefsStore.batch831.v840fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v840: field mode
internal fun PlayerActivity.showV840FieldToggle() {
    val current = FeaturePrefsStore.batch831.v840field
    FeaturePrefsStore.batch831.v840field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v840: file mode
internal fun PlayerActivity.showV840FileToggle() {
    val current = FeaturePrefsStore.batch831.v840file
    FeaturePrefsStore.batch831.v840file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v840: fill mode
internal fun PlayerActivity.showV840FillToggle() {
    val current = FeaturePrefsStore.batch831.v840fill
    FeaturePrefsStore.batch831.v840fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v840: filter mode
internal fun PlayerActivity.showV840FilterToggle() {
    val current = FeaturePrefsStore.batch831.v840filter
    FeaturePrefsStore.batch831.v840filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v840: final level
internal fun PlayerActivity.showV840FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840final = value
        AppToast.show(this, "final: $value")
    }
}

// v840: find level
internal fun PlayerActivity.showV840FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840find = value
        AppToast.show(this, "find: $value")
    }
}

// v840: finger level
internal fun PlayerActivity.showV840FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v840: finish level
internal fun PlayerActivity.showV840FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v840: fire level
internal fun PlayerActivity.showV840FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v840: firmware mode
internal fun PlayerActivity.showV840FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v840firmware
    FeaturePrefsStore.batch831.v840firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v840: flag mode
internal fun PlayerActivity.showV840FlagToggle() {
    val current = FeaturePrefsStore.batch831.v840flag
    FeaturePrefsStore.batch831.v840flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v840: flash mode
internal fun PlayerActivity.showV840FlashToggle() {
    val current = FeaturePrefsStore.batch831.v840flash
    FeaturePrefsStore.batch831.v840flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v840: flat mode
internal fun PlayerActivity.showV840FlatToggle() {
    val current = FeaturePrefsStore.batch831.v840flat
    FeaturePrefsStore.batch831.v840flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v840: flip mode
internal fun PlayerActivity.showV840FlipToggle() {
    val current = FeaturePrefsStore.batch831.v840flip
    FeaturePrefsStore.batch831.v840flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

