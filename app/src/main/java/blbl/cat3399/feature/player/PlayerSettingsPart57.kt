package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v761: contract mode
internal fun PlayerActivity.showV761ContractToggle() {
    val current = FeaturePrefsStore.batch761.v761contract
    FeaturePrefsStore.batch761.v761contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v761: control mode
internal fun PlayerActivity.showV761ControlToggle() {
    val current = FeaturePrefsStore.batch761.v761control
    FeaturePrefsStore.batch761.v761control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v761: convert mode
internal fun PlayerActivity.showV761ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v761convert
    FeaturePrefsStore.batch761.v761convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v761: coordinate mode
internal fun PlayerActivity.showV761CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v761coordinate
    FeaturePrefsStore.batch761.v761coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v761: copy mode
internal fun PlayerActivity.showV761CopyToggle() {
    val current = FeaturePrefsStore.batch761.v761copy
    FeaturePrefsStore.batch761.v761copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v761: core level
internal fun PlayerActivity.showV761CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761core = value
        AppToast.show(this, "core: $value")
    }
}

// v761: count level
internal fun PlayerActivity.showV761CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761count = value
        AppToast.show(this, "count: $value")
    }
}

// v761: cover level
internal fun PlayerActivity.showV761CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v761: crash level
internal fun PlayerActivity.showV761CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v761: create level
internal fun PlayerActivity.showV761CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761create = value
        AppToast.show(this, "create: $value")
    }
}

// v761: crop mode
internal fun PlayerActivity.showV761CropToggle() {
    val current = FeaturePrefsStore.batch761.v761crop
    FeaturePrefsStore.batch761.v761crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v761: cross mode
internal fun PlayerActivity.showV761CrossToggle() {
    val current = FeaturePrefsStore.batch761.v761cross
    FeaturePrefsStore.batch761.v761cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v761: crypto mode
internal fun PlayerActivity.showV761CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v761crypto
    FeaturePrefsStore.batch761.v761crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v761: cursor mode
internal fun PlayerActivity.showV761CursorToggle() {
    val current = FeaturePrefsStore.batch761.v761cursor
    FeaturePrefsStore.batch761.v761cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v761: curve mode
internal fun PlayerActivity.showV761CurveToggle() {
    val current = FeaturePrefsStore.batch761.v761curve
    FeaturePrefsStore.batch761.v761curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v762: contract mode
internal fun PlayerActivity.showV762ContractToggle() {
    val current = FeaturePrefsStore.batch761.v762contract
    FeaturePrefsStore.batch761.v762contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v762: control mode
internal fun PlayerActivity.showV762ControlToggle() {
    val current = FeaturePrefsStore.batch761.v762control
    FeaturePrefsStore.batch761.v762control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v762: convert mode
internal fun PlayerActivity.showV762ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v762convert
    FeaturePrefsStore.batch761.v762convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v762: coordinate mode
internal fun PlayerActivity.showV762CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v762coordinate
    FeaturePrefsStore.batch761.v762coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v762: copy mode
internal fun PlayerActivity.showV762CopyToggle() {
    val current = FeaturePrefsStore.batch761.v762copy
    FeaturePrefsStore.batch761.v762copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v762: core level
internal fun PlayerActivity.showV762CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762core = value
        AppToast.show(this, "core: $value")
    }
}

// v762: count level
internal fun PlayerActivity.showV762CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762count = value
        AppToast.show(this, "count: $value")
    }
}

// v762: cover level
internal fun PlayerActivity.showV762CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v762: crash level
internal fun PlayerActivity.showV762CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v762: create level
internal fun PlayerActivity.showV762CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762create = value
        AppToast.show(this, "create: $value")
    }
}

// v762: crop mode
internal fun PlayerActivity.showV762CropToggle() {
    val current = FeaturePrefsStore.batch761.v762crop
    FeaturePrefsStore.batch761.v762crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v762: cross mode
internal fun PlayerActivity.showV762CrossToggle() {
    val current = FeaturePrefsStore.batch761.v762cross
    FeaturePrefsStore.batch761.v762cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v762: crypto mode
internal fun PlayerActivity.showV762CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v762crypto
    FeaturePrefsStore.batch761.v762crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v762: cursor mode
internal fun PlayerActivity.showV762CursorToggle() {
    val current = FeaturePrefsStore.batch761.v762cursor
    FeaturePrefsStore.batch761.v762cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v762: curve mode
internal fun PlayerActivity.showV762CurveToggle() {
    val current = FeaturePrefsStore.batch761.v762curve
    FeaturePrefsStore.batch761.v762curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v763: contract mode
internal fun PlayerActivity.showV763ContractToggle() {
    val current = FeaturePrefsStore.batch761.v763contract
    FeaturePrefsStore.batch761.v763contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v763: control mode
internal fun PlayerActivity.showV763ControlToggle() {
    val current = FeaturePrefsStore.batch761.v763control
    FeaturePrefsStore.batch761.v763control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v763: convert mode
internal fun PlayerActivity.showV763ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v763convert
    FeaturePrefsStore.batch761.v763convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v763: coordinate mode
internal fun PlayerActivity.showV763CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v763coordinate
    FeaturePrefsStore.batch761.v763coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v763: copy mode
internal fun PlayerActivity.showV763CopyToggle() {
    val current = FeaturePrefsStore.batch761.v763copy
    FeaturePrefsStore.batch761.v763copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v763: core level
internal fun PlayerActivity.showV763CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763core = value
        AppToast.show(this, "core: $value")
    }
}

// v763: count level
internal fun PlayerActivity.showV763CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763count = value
        AppToast.show(this, "count: $value")
    }
}

// v763: cover level
internal fun PlayerActivity.showV763CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v763: crash level
internal fun PlayerActivity.showV763CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v763: create level
internal fun PlayerActivity.showV763CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763create = value
        AppToast.show(this, "create: $value")
    }
}

// v763: crop mode
internal fun PlayerActivity.showV763CropToggle() {
    val current = FeaturePrefsStore.batch761.v763crop
    FeaturePrefsStore.batch761.v763crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v763: cross mode
internal fun PlayerActivity.showV763CrossToggle() {
    val current = FeaturePrefsStore.batch761.v763cross
    FeaturePrefsStore.batch761.v763cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v763: crypto mode
internal fun PlayerActivity.showV763CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v763crypto
    FeaturePrefsStore.batch761.v763crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v763: cursor mode
internal fun PlayerActivity.showV763CursorToggle() {
    val current = FeaturePrefsStore.batch761.v763cursor
    FeaturePrefsStore.batch761.v763cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v763: curve mode
internal fun PlayerActivity.showV763CurveToggle() {
    val current = FeaturePrefsStore.batch761.v763curve
    FeaturePrefsStore.batch761.v763curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v764: contract mode
internal fun PlayerActivity.showV764ContractToggle() {
    val current = FeaturePrefsStore.batch761.v764contract
    FeaturePrefsStore.batch761.v764contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v764: control mode
internal fun PlayerActivity.showV764ControlToggle() {
    val current = FeaturePrefsStore.batch761.v764control
    FeaturePrefsStore.batch761.v764control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v764: convert mode
internal fun PlayerActivity.showV764ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v764convert
    FeaturePrefsStore.batch761.v764convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v764: coordinate mode
internal fun PlayerActivity.showV764CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v764coordinate
    FeaturePrefsStore.batch761.v764coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v764: copy mode
internal fun PlayerActivity.showV764CopyToggle() {
    val current = FeaturePrefsStore.batch761.v764copy
    FeaturePrefsStore.batch761.v764copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v764: core level
internal fun PlayerActivity.showV764CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764core = value
        AppToast.show(this, "core: $value")
    }
}

// v764: count level
internal fun PlayerActivity.showV764CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764count = value
        AppToast.show(this, "count: $value")
    }
}

// v764: cover level
internal fun PlayerActivity.showV764CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v764: crash level
internal fun PlayerActivity.showV764CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v764: create level
internal fun PlayerActivity.showV764CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764create = value
        AppToast.show(this, "create: $value")
    }
}

// v764: crop mode
internal fun PlayerActivity.showV764CropToggle() {
    val current = FeaturePrefsStore.batch761.v764crop
    FeaturePrefsStore.batch761.v764crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v764: cross mode
internal fun PlayerActivity.showV764CrossToggle() {
    val current = FeaturePrefsStore.batch761.v764cross
    FeaturePrefsStore.batch761.v764cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v764: crypto mode
internal fun PlayerActivity.showV764CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v764crypto
    FeaturePrefsStore.batch761.v764crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v764: cursor mode
internal fun PlayerActivity.showV764CursorToggle() {
    val current = FeaturePrefsStore.batch761.v764cursor
    FeaturePrefsStore.batch761.v764cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v764: curve mode
internal fun PlayerActivity.showV764CurveToggle() {
    val current = FeaturePrefsStore.batch761.v764curve
    FeaturePrefsStore.batch761.v764curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v765: contract mode
internal fun PlayerActivity.showV765ContractToggle() {
    val current = FeaturePrefsStore.batch761.v765contract
    FeaturePrefsStore.batch761.v765contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v765: control mode
internal fun PlayerActivity.showV765ControlToggle() {
    val current = FeaturePrefsStore.batch761.v765control
    FeaturePrefsStore.batch761.v765control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v765: convert mode
internal fun PlayerActivity.showV765ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v765convert
    FeaturePrefsStore.batch761.v765convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v765: coordinate mode
internal fun PlayerActivity.showV765CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v765coordinate
    FeaturePrefsStore.batch761.v765coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v765: copy mode
internal fun PlayerActivity.showV765CopyToggle() {
    val current = FeaturePrefsStore.batch761.v765copy
    FeaturePrefsStore.batch761.v765copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v765: core level
internal fun PlayerActivity.showV765CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765core = value
        AppToast.show(this, "core: $value")
    }
}

// v765: count level
internal fun PlayerActivity.showV765CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765count = value
        AppToast.show(this, "count: $value")
    }
}

// v765: cover level
internal fun PlayerActivity.showV765CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v765: crash level
internal fun PlayerActivity.showV765CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v765: create level
internal fun PlayerActivity.showV765CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765create = value
        AppToast.show(this, "create: $value")
    }
}

// v765: crop mode
internal fun PlayerActivity.showV765CropToggle() {
    val current = FeaturePrefsStore.batch761.v765crop
    FeaturePrefsStore.batch761.v765crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v765: cross mode
internal fun PlayerActivity.showV765CrossToggle() {
    val current = FeaturePrefsStore.batch761.v765cross
    FeaturePrefsStore.batch761.v765cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v765: crypto mode
internal fun PlayerActivity.showV765CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v765crypto
    FeaturePrefsStore.batch761.v765crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v765: cursor mode
internal fun PlayerActivity.showV765CursorToggle() {
    val current = FeaturePrefsStore.batch761.v765cursor
    FeaturePrefsStore.batch761.v765cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v765: curve mode
internal fun PlayerActivity.showV765CurveToggle() {
    val current = FeaturePrefsStore.batch761.v765curve
    FeaturePrefsStore.batch761.v765curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v766: contract mode
internal fun PlayerActivity.showV766ContractToggle() {
    val current = FeaturePrefsStore.batch761.v766contract
    FeaturePrefsStore.batch761.v766contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v766: control mode
internal fun PlayerActivity.showV766ControlToggle() {
    val current = FeaturePrefsStore.batch761.v766control
    FeaturePrefsStore.batch761.v766control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v766: convert mode
internal fun PlayerActivity.showV766ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v766convert
    FeaturePrefsStore.batch761.v766convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v766: coordinate mode
internal fun PlayerActivity.showV766CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v766coordinate
    FeaturePrefsStore.batch761.v766coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v766: copy mode
internal fun PlayerActivity.showV766CopyToggle() {
    val current = FeaturePrefsStore.batch761.v766copy
    FeaturePrefsStore.batch761.v766copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v766: core level
internal fun PlayerActivity.showV766CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766core = value
        AppToast.show(this, "core: $value")
    }
}

// v766: count level
internal fun PlayerActivity.showV766CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766count = value
        AppToast.show(this, "count: $value")
    }
}

// v766: cover level
internal fun PlayerActivity.showV766CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v766: crash level
internal fun PlayerActivity.showV766CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v766: create level
internal fun PlayerActivity.showV766CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766create = value
        AppToast.show(this, "create: $value")
    }
}

// v766: crop mode
internal fun PlayerActivity.showV766CropToggle() {
    val current = FeaturePrefsStore.batch761.v766crop
    FeaturePrefsStore.batch761.v766crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v766: cross mode
internal fun PlayerActivity.showV766CrossToggle() {
    val current = FeaturePrefsStore.batch761.v766cross
    FeaturePrefsStore.batch761.v766cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v766: crypto mode
internal fun PlayerActivity.showV766CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v766crypto
    FeaturePrefsStore.batch761.v766crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v766: cursor mode
internal fun PlayerActivity.showV766CursorToggle() {
    val current = FeaturePrefsStore.batch761.v766cursor
    FeaturePrefsStore.batch761.v766cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v766: curve mode
internal fun PlayerActivity.showV766CurveToggle() {
    val current = FeaturePrefsStore.batch761.v766curve
    FeaturePrefsStore.batch761.v766curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v767: contract mode
internal fun PlayerActivity.showV767ContractToggle() {
    val current = FeaturePrefsStore.batch761.v767contract
    FeaturePrefsStore.batch761.v767contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v767: control mode
internal fun PlayerActivity.showV767ControlToggle() {
    val current = FeaturePrefsStore.batch761.v767control
    FeaturePrefsStore.batch761.v767control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v767: convert mode
internal fun PlayerActivity.showV767ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v767convert
    FeaturePrefsStore.batch761.v767convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v767: coordinate mode
internal fun PlayerActivity.showV767CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v767coordinate
    FeaturePrefsStore.batch761.v767coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v767: copy mode
internal fun PlayerActivity.showV767CopyToggle() {
    val current = FeaturePrefsStore.batch761.v767copy
    FeaturePrefsStore.batch761.v767copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v767: core level
internal fun PlayerActivity.showV767CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767core = value
        AppToast.show(this, "core: $value")
    }
}

// v767: count level
internal fun PlayerActivity.showV767CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767count = value
        AppToast.show(this, "count: $value")
    }
}

// v767: cover level
internal fun PlayerActivity.showV767CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v767: crash level
internal fun PlayerActivity.showV767CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v767: create level
internal fun PlayerActivity.showV767CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767create = value
        AppToast.show(this, "create: $value")
    }
}

// v767: crop mode
internal fun PlayerActivity.showV767CropToggle() {
    val current = FeaturePrefsStore.batch761.v767crop
    FeaturePrefsStore.batch761.v767crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v767: cross mode
internal fun PlayerActivity.showV767CrossToggle() {
    val current = FeaturePrefsStore.batch761.v767cross
    FeaturePrefsStore.batch761.v767cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v767: crypto mode
internal fun PlayerActivity.showV767CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v767crypto
    FeaturePrefsStore.batch761.v767crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v767: cursor mode
internal fun PlayerActivity.showV767CursorToggle() {
    val current = FeaturePrefsStore.batch761.v767cursor
    FeaturePrefsStore.batch761.v767cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v767: curve mode
internal fun PlayerActivity.showV767CurveToggle() {
    val current = FeaturePrefsStore.batch761.v767curve
    FeaturePrefsStore.batch761.v767curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v768: contract mode
internal fun PlayerActivity.showV768ContractToggle() {
    val current = FeaturePrefsStore.batch761.v768contract
    FeaturePrefsStore.batch761.v768contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v768: control mode
internal fun PlayerActivity.showV768ControlToggle() {
    val current = FeaturePrefsStore.batch761.v768control
    FeaturePrefsStore.batch761.v768control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v768: convert mode
internal fun PlayerActivity.showV768ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v768convert
    FeaturePrefsStore.batch761.v768convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v768: coordinate mode
internal fun PlayerActivity.showV768CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v768coordinate
    FeaturePrefsStore.batch761.v768coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v768: copy mode
internal fun PlayerActivity.showV768CopyToggle() {
    val current = FeaturePrefsStore.batch761.v768copy
    FeaturePrefsStore.batch761.v768copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v768: core level
internal fun PlayerActivity.showV768CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768core = value
        AppToast.show(this, "core: $value")
    }
}

// v768: count level
internal fun PlayerActivity.showV768CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768count = value
        AppToast.show(this, "count: $value")
    }
}

// v768: cover level
internal fun PlayerActivity.showV768CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v768: crash level
internal fun PlayerActivity.showV768CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v768: create level
internal fun PlayerActivity.showV768CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768create = value
        AppToast.show(this, "create: $value")
    }
}

// v768: crop mode
internal fun PlayerActivity.showV768CropToggle() {
    val current = FeaturePrefsStore.batch761.v768crop
    FeaturePrefsStore.batch761.v768crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v768: cross mode
internal fun PlayerActivity.showV768CrossToggle() {
    val current = FeaturePrefsStore.batch761.v768cross
    FeaturePrefsStore.batch761.v768cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v768: crypto mode
internal fun PlayerActivity.showV768CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v768crypto
    FeaturePrefsStore.batch761.v768crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v768: cursor mode
internal fun PlayerActivity.showV768CursorToggle() {
    val current = FeaturePrefsStore.batch761.v768cursor
    FeaturePrefsStore.batch761.v768cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v768: curve mode
internal fun PlayerActivity.showV768CurveToggle() {
    val current = FeaturePrefsStore.batch761.v768curve
    FeaturePrefsStore.batch761.v768curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v769: contract mode
internal fun PlayerActivity.showV769ContractToggle() {
    val current = FeaturePrefsStore.batch761.v769contract
    FeaturePrefsStore.batch761.v769contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v769: control mode
internal fun PlayerActivity.showV769ControlToggle() {
    val current = FeaturePrefsStore.batch761.v769control
    FeaturePrefsStore.batch761.v769control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v769: convert mode
internal fun PlayerActivity.showV769ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v769convert
    FeaturePrefsStore.batch761.v769convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v769: coordinate mode
internal fun PlayerActivity.showV769CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v769coordinate
    FeaturePrefsStore.batch761.v769coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v769: copy mode
internal fun PlayerActivity.showV769CopyToggle() {
    val current = FeaturePrefsStore.batch761.v769copy
    FeaturePrefsStore.batch761.v769copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v769: core level
internal fun PlayerActivity.showV769CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769core = value
        AppToast.show(this, "core: $value")
    }
}

// v769: count level
internal fun PlayerActivity.showV769CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769count = value
        AppToast.show(this, "count: $value")
    }
}

// v769: cover level
internal fun PlayerActivity.showV769CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v769: crash level
internal fun PlayerActivity.showV769CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v769: create level
internal fun PlayerActivity.showV769CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769create = value
        AppToast.show(this, "create: $value")
    }
}

// v769: crop mode
internal fun PlayerActivity.showV769CropToggle() {
    val current = FeaturePrefsStore.batch761.v769crop
    FeaturePrefsStore.batch761.v769crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v769: cross mode
internal fun PlayerActivity.showV769CrossToggle() {
    val current = FeaturePrefsStore.batch761.v769cross
    FeaturePrefsStore.batch761.v769cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v769: crypto mode
internal fun PlayerActivity.showV769CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v769crypto
    FeaturePrefsStore.batch761.v769crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v769: cursor mode
internal fun PlayerActivity.showV769CursorToggle() {
    val current = FeaturePrefsStore.batch761.v769cursor
    FeaturePrefsStore.batch761.v769cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v769: curve mode
internal fun PlayerActivity.showV769CurveToggle() {
    val current = FeaturePrefsStore.batch761.v769curve
    FeaturePrefsStore.batch761.v769curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v770: contract mode
internal fun PlayerActivity.showV770ContractToggle() {
    val current = FeaturePrefsStore.batch761.v770contract
    FeaturePrefsStore.batch761.v770contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v770: control mode
internal fun PlayerActivity.showV770ControlToggle() {
    val current = FeaturePrefsStore.batch761.v770control
    FeaturePrefsStore.batch761.v770control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v770: convert mode
internal fun PlayerActivity.showV770ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v770convert
    FeaturePrefsStore.batch761.v770convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v770: coordinate mode
internal fun PlayerActivity.showV770CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v770coordinate
    FeaturePrefsStore.batch761.v770coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v770: copy mode
internal fun PlayerActivity.showV770CopyToggle() {
    val current = FeaturePrefsStore.batch761.v770copy
    FeaturePrefsStore.batch761.v770copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v770: core level
internal fun PlayerActivity.showV770CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770core = value
        AppToast.show(this, "core: $value")
    }
}

// v770: count level
internal fun PlayerActivity.showV770CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770count = value
        AppToast.show(this, "count: $value")
    }
}

// v770: cover level
internal fun PlayerActivity.showV770CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v770: crash level
internal fun PlayerActivity.showV770CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v770: create level
internal fun PlayerActivity.showV770CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770create = value
        AppToast.show(this, "create: $value")
    }
}

// v770: crop mode
internal fun PlayerActivity.showV770CropToggle() {
    val current = FeaturePrefsStore.batch761.v770crop
    FeaturePrefsStore.batch761.v770crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v770: cross mode
internal fun PlayerActivity.showV770CrossToggle() {
    val current = FeaturePrefsStore.batch761.v770cross
    FeaturePrefsStore.batch761.v770cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v770: crypto mode
internal fun PlayerActivity.showV770CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v770crypto
    FeaturePrefsStore.batch761.v770crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v770: cursor mode
internal fun PlayerActivity.showV770CursorToggle() {
    val current = FeaturePrefsStore.batch761.v770cursor
    FeaturePrefsStore.batch761.v770cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v770: curve mode
internal fun PlayerActivity.showV770CurveToggle() {
    val current = FeaturePrefsStore.batch761.v770curve
    FeaturePrefsStore.batch761.v770curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

