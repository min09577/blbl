package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v951: open mode
internal fun PlayerActivity.showV951OpenToggle() {
    val current = FeaturePrefsStore.batch951.v951open
    FeaturePrefsStore.batch951.v951open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v951: operate mode
internal fun PlayerActivity.showV951OperateToggle() {
    val current = FeaturePrefsStore.batch951.v951operate
    FeaturePrefsStore.batch951.v951operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v951: option mode
internal fun PlayerActivity.showV951OptionToggle() {
    val current = FeaturePrefsStore.batch951.v951option
    FeaturePrefsStore.batch951.v951option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v951: orbit mode
internal fun PlayerActivity.showV951OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v951orbit
    FeaturePrefsStore.batch951.v951orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v951: order mode
internal fun PlayerActivity.showV951OrderToggle() {
    val current = FeaturePrefsStore.batch951.v951order
    FeaturePrefsStore.batch951.v951order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v951: origin level
internal fun PlayerActivity.showV951OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v951: out level
internal fun PlayerActivity.showV951OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951out = value
        AppToast.show(this, "out: $value")
    }
}

// v951: output level
internal fun PlayerActivity.showV951OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951output = value
        AppToast.show(this, "output: $value")
    }
}

// v951: overlay level
internal fun PlayerActivity.showV951OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v951: owner level
internal fun PlayerActivity.showV951OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v951: pack mode
internal fun PlayerActivity.showV951PackToggle() {
    val current = FeaturePrefsStore.batch951.v951pack
    FeaturePrefsStore.batch951.v951pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v951: package mode
internal fun PlayerActivity.showV951PackageToggle() {
    val current = FeaturePrefsStore.batch951.v951package
    FeaturePrefsStore.batch951.v951package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v951: page mode
internal fun PlayerActivity.showV951PageToggle() {
    val current = FeaturePrefsStore.batch951.v951page
    FeaturePrefsStore.batch951.v951page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v951: paint mode
internal fun PlayerActivity.showV951PaintToggle() {
    val current = FeaturePrefsStore.batch951.v951paint
    FeaturePrefsStore.batch951.v951paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v951: pair mode
internal fun PlayerActivity.showV951PairToggle() {
    val current = FeaturePrefsStore.batch951.v951pair
    FeaturePrefsStore.batch951.v951pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v952: open mode
internal fun PlayerActivity.showV952OpenToggle() {
    val current = FeaturePrefsStore.batch951.v952open
    FeaturePrefsStore.batch951.v952open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v952: operate mode
internal fun PlayerActivity.showV952OperateToggle() {
    val current = FeaturePrefsStore.batch951.v952operate
    FeaturePrefsStore.batch951.v952operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v952: option mode
internal fun PlayerActivity.showV952OptionToggle() {
    val current = FeaturePrefsStore.batch951.v952option
    FeaturePrefsStore.batch951.v952option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v952: orbit mode
internal fun PlayerActivity.showV952OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v952orbit
    FeaturePrefsStore.batch951.v952orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v952: order mode
internal fun PlayerActivity.showV952OrderToggle() {
    val current = FeaturePrefsStore.batch951.v952order
    FeaturePrefsStore.batch951.v952order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v952: origin level
internal fun PlayerActivity.showV952OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v952: out level
internal fun PlayerActivity.showV952OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952out = value
        AppToast.show(this, "out: $value")
    }
}

// v952: output level
internal fun PlayerActivity.showV952OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952output = value
        AppToast.show(this, "output: $value")
    }
}

// v952: overlay level
internal fun PlayerActivity.showV952OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v952: owner level
internal fun PlayerActivity.showV952OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v952: pack mode
internal fun PlayerActivity.showV952PackToggle() {
    val current = FeaturePrefsStore.batch951.v952pack
    FeaturePrefsStore.batch951.v952pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v952: package mode
internal fun PlayerActivity.showV952PackageToggle() {
    val current = FeaturePrefsStore.batch951.v952package
    FeaturePrefsStore.batch951.v952package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v952: page mode
internal fun PlayerActivity.showV952PageToggle() {
    val current = FeaturePrefsStore.batch951.v952page
    FeaturePrefsStore.batch951.v952page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v952: paint mode
internal fun PlayerActivity.showV952PaintToggle() {
    val current = FeaturePrefsStore.batch951.v952paint
    FeaturePrefsStore.batch951.v952paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v952: pair mode
internal fun PlayerActivity.showV952PairToggle() {
    val current = FeaturePrefsStore.batch951.v952pair
    FeaturePrefsStore.batch951.v952pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v953: open mode
internal fun PlayerActivity.showV953OpenToggle() {
    val current = FeaturePrefsStore.batch951.v953open
    FeaturePrefsStore.batch951.v953open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v953: operate mode
internal fun PlayerActivity.showV953OperateToggle() {
    val current = FeaturePrefsStore.batch951.v953operate
    FeaturePrefsStore.batch951.v953operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v953: option mode
internal fun PlayerActivity.showV953OptionToggle() {
    val current = FeaturePrefsStore.batch951.v953option
    FeaturePrefsStore.batch951.v953option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v953: orbit mode
internal fun PlayerActivity.showV953OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v953orbit
    FeaturePrefsStore.batch951.v953orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v953: order mode
internal fun PlayerActivity.showV953OrderToggle() {
    val current = FeaturePrefsStore.batch951.v953order
    FeaturePrefsStore.batch951.v953order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v953: origin level
internal fun PlayerActivity.showV953OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v953: out level
internal fun PlayerActivity.showV953OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953out = value
        AppToast.show(this, "out: $value")
    }
}

// v953: output level
internal fun PlayerActivity.showV953OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953output = value
        AppToast.show(this, "output: $value")
    }
}

// v953: overlay level
internal fun PlayerActivity.showV953OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v953: owner level
internal fun PlayerActivity.showV953OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v953: pack mode
internal fun PlayerActivity.showV953PackToggle() {
    val current = FeaturePrefsStore.batch951.v953pack
    FeaturePrefsStore.batch951.v953pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v953: package mode
internal fun PlayerActivity.showV953PackageToggle() {
    val current = FeaturePrefsStore.batch951.v953package
    FeaturePrefsStore.batch951.v953package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v953: page mode
internal fun PlayerActivity.showV953PageToggle() {
    val current = FeaturePrefsStore.batch951.v953page
    FeaturePrefsStore.batch951.v953page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v953: paint mode
internal fun PlayerActivity.showV953PaintToggle() {
    val current = FeaturePrefsStore.batch951.v953paint
    FeaturePrefsStore.batch951.v953paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v953: pair mode
internal fun PlayerActivity.showV953PairToggle() {
    val current = FeaturePrefsStore.batch951.v953pair
    FeaturePrefsStore.batch951.v953pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v954: open mode
internal fun PlayerActivity.showV954OpenToggle() {
    val current = FeaturePrefsStore.batch951.v954open
    FeaturePrefsStore.batch951.v954open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v954: operate mode
internal fun PlayerActivity.showV954OperateToggle() {
    val current = FeaturePrefsStore.batch951.v954operate
    FeaturePrefsStore.batch951.v954operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v954: option mode
internal fun PlayerActivity.showV954OptionToggle() {
    val current = FeaturePrefsStore.batch951.v954option
    FeaturePrefsStore.batch951.v954option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v954: orbit mode
internal fun PlayerActivity.showV954OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v954orbit
    FeaturePrefsStore.batch951.v954orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v954: order mode
internal fun PlayerActivity.showV954OrderToggle() {
    val current = FeaturePrefsStore.batch951.v954order
    FeaturePrefsStore.batch951.v954order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v954: origin level
internal fun PlayerActivity.showV954OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v954: out level
internal fun PlayerActivity.showV954OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954out = value
        AppToast.show(this, "out: $value")
    }
}

// v954: output level
internal fun PlayerActivity.showV954OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954output = value
        AppToast.show(this, "output: $value")
    }
}

// v954: overlay level
internal fun PlayerActivity.showV954OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v954: owner level
internal fun PlayerActivity.showV954OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v954: pack mode
internal fun PlayerActivity.showV954PackToggle() {
    val current = FeaturePrefsStore.batch951.v954pack
    FeaturePrefsStore.batch951.v954pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v954: package mode
internal fun PlayerActivity.showV954PackageToggle() {
    val current = FeaturePrefsStore.batch951.v954package
    FeaturePrefsStore.batch951.v954package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v954: page mode
internal fun PlayerActivity.showV954PageToggle() {
    val current = FeaturePrefsStore.batch951.v954page
    FeaturePrefsStore.batch951.v954page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v954: paint mode
internal fun PlayerActivity.showV954PaintToggle() {
    val current = FeaturePrefsStore.batch951.v954paint
    FeaturePrefsStore.batch951.v954paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v954: pair mode
internal fun PlayerActivity.showV954PairToggle() {
    val current = FeaturePrefsStore.batch951.v954pair
    FeaturePrefsStore.batch951.v954pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v955: open mode
internal fun PlayerActivity.showV955OpenToggle() {
    val current = FeaturePrefsStore.batch951.v955open
    FeaturePrefsStore.batch951.v955open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v955: operate mode
internal fun PlayerActivity.showV955OperateToggle() {
    val current = FeaturePrefsStore.batch951.v955operate
    FeaturePrefsStore.batch951.v955operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v955: option mode
internal fun PlayerActivity.showV955OptionToggle() {
    val current = FeaturePrefsStore.batch951.v955option
    FeaturePrefsStore.batch951.v955option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v955: orbit mode
internal fun PlayerActivity.showV955OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v955orbit
    FeaturePrefsStore.batch951.v955orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v955: order mode
internal fun PlayerActivity.showV955OrderToggle() {
    val current = FeaturePrefsStore.batch951.v955order
    FeaturePrefsStore.batch951.v955order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v955: origin level
internal fun PlayerActivity.showV955OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v955: out level
internal fun PlayerActivity.showV955OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955out = value
        AppToast.show(this, "out: $value")
    }
}

// v955: output level
internal fun PlayerActivity.showV955OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955output = value
        AppToast.show(this, "output: $value")
    }
}

// v955: overlay level
internal fun PlayerActivity.showV955OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v955: owner level
internal fun PlayerActivity.showV955OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v955: pack mode
internal fun PlayerActivity.showV955PackToggle() {
    val current = FeaturePrefsStore.batch951.v955pack
    FeaturePrefsStore.batch951.v955pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v955: package mode
internal fun PlayerActivity.showV955PackageToggle() {
    val current = FeaturePrefsStore.batch951.v955package
    FeaturePrefsStore.batch951.v955package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v955: page mode
internal fun PlayerActivity.showV955PageToggle() {
    val current = FeaturePrefsStore.batch951.v955page
    FeaturePrefsStore.batch951.v955page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v955: paint mode
internal fun PlayerActivity.showV955PaintToggle() {
    val current = FeaturePrefsStore.batch951.v955paint
    FeaturePrefsStore.batch951.v955paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v955: pair mode
internal fun PlayerActivity.showV955PairToggle() {
    val current = FeaturePrefsStore.batch951.v955pair
    FeaturePrefsStore.batch951.v955pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v956: open mode
internal fun PlayerActivity.showV956OpenToggle() {
    val current = FeaturePrefsStore.batch951.v956open
    FeaturePrefsStore.batch951.v956open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v956: operate mode
internal fun PlayerActivity.showV956OperateToggle() {
    val current = FeaturePrefsStore.batch951.v956operate
    FeaturePrefsStore.batch951.v956operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v956: option mode
internal fun PlayerActivity.showV956OptionToggle() {
    val current = FeaturePrefsStore.batch951.v956option
    FeaturePrefsStore.batch951.v956option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v956: orbit mode
internal fun PlayerActivity.showV956OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v956orbit
    FeaturePrefsStore.batch951.v956orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v956: order mode
internal fun PlayerActivity.showV956OrderToggle() {
    val current = FeaturePrefsStore.batch951.v956order
    FeaturePrefsStore.batch951.v956order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v956: origin level
internal fun PlayerActivity.showV956OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v956: out level
internal fun PlayerActivity.showV956OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956out = value
        AppToast.show(this, "out: $value")
    }
}

// v956: output level
internal fun PlayerActivity.showV956OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956output = value
        AppToast.show(this, "output: $value")
    }
}

// v956: overlay level
internal fun PlayerActivity.showV956OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v956: owner level
internal fun PlayerActivity.showV956OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v956: pack mode
internal fun PlayerActivity.showV956PackToggle() {
    val current = FeaturePrefsStore.batch951.v956pack
    FeaturePrefsStore.batch951.v956pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v956: package mode
internal fun PlayerActivity.showV956PackageToggle() {
    val current = FeaturePrefsStore.batch951.v956package
    FeaturePrefsStore.batch951.v956package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v956: page mode
internal fun PlayerActivity.showV956PageToggle() {
    val current = FeaturePrefsStore.batch951.v956page
    FeaturePrefsStore.batch951.v956page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v956: paint mode
internal fun PlayerActivity.showV956PaintToggle() {
    val current = FeaturePrefsStore.batch951.v956paint
    FeaturePrefsStore.batch951.v956paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v956: pair mode
internal fun PlayerActivity.showV956PairToggle() {
    val current = FeaturePrefsStore.batch951.v956pair
    FeaturePrefsStore.batch951.v956pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v957: open mode
internal fun PlayerActivity.showV957OpenToggle() {
    val current = FeaturePrefsStore.batch951.v957open
    FeaturePrefsStore.batch951.v957open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v957: operate mode
internal fun PlayerActivity.showV957OperateToggle() {
    val current = FeaturePrefsStore.batch951.v957operate
    FeaturePrefsStore.batch951.v957operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v957: option mode
internal fun PlayerActivity.showV957OptionToggle() {
    val current = FeaturePrefsStore.batch951.v957option
    FeaturePrefsStore.batch951.v957option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v957: orbit mode
internal fun PlayerActivity.showV957OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v957orbit
    FeaturePrefsStore.batch951.v957orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v957: order mode
internal fun PlayerActivity.showV957OrderToggle() {
    val current = FeaturePrefsStore.batch951.v957order
    FeaturePrefsStore.batch951.v957order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v957: origin level
internal fun PlayerActivity.showV957OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v957: out level
internal fun PlayerActivity.showV957OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957out = value
        AppToast.show(this, "out: $value")
    }
}

// v957: output level
internal fun PlayerActivity.showV957OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957output = value
        AppToast.show(this, "output: $value")
    }
}

// v957: overlay level
internal fun PlayerActivity.showV957OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v957: owner level
internal fun PlayerActivity.showV957OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v957: pack mode
internal fun PlayerActivity.showV957PackToggle() {
    val current = FeaturePrefsStore.batch951.v957pack
    FeaturePrefsStore.batch951.v957pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v957: package mode
internal fun PlayerActivity.showV957PackageToggle() {
    val current = FeaturePrefsStore.batch951.v957package
    FeaturePrefsStore.batch951.v957package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v957: page mode
internal fun PlayerActivity.showV957PageToggle() {
    val current = FeaturePrefsStore.batch951.v957page
    FeaturePrefsStore.batch951.v957page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v957: paint mode
internal fun PlayerActivity.showV957PaintToggle() {
    val current = FeaturePrefsStore.batch951.v957paint
    FeaturePrefsStore.batch951.v957paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v957: pair mode
internal fun PlayerActivity.showV957PairToggle() {
    val current = FeaturePrefsStore.batch951.v957pair
    FeaturePrefsStore.batch951.v957pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v958: open mode
internal fun PlayerActivity.showV958OpenToggle() {
    val current = FeaturePrefsStore.batch951.v958open
    FeaturePrefsStore.batch951.v958open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v958: operate mode
internal fun PlayerActivity.showV958OperateToggle() {
    val current = FeaturePrefsStore.batch951.v958operate
    FeaturePrefsStore.batch951.v958operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v958: option mode
internal fun PlayerActivity.showV958OptionToggle() {
    val current = FeaturePrefsStore.batch951.v958option
    FeaturePrefsStore.batch951.v958option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v958: orbit mode
internal fun PlayerActivity.showV958OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v958orbit
    FeaturePrefsStore.batch951.v958orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v958: order mode
internal fun PlayerActivity.showV958OrderToggle() {
    val current = FeaturePrefsStore.batch951.v958order
    FeaturePrefsStore.batch951.v958order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v958: origin level
internal fun PlayerActivity.showV958OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v958: out level
internal fun PlayerActivity.showV958OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958out = value
        AppToast.show(this, "out: $value")
    }
}

// v958: output level
internal fun PlayerActivity.showV958OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958output = value
        AppToast.show(this, "output: $value")
    }
}

// v958: overlay level
internal fun PlayerActivity.showV958OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v958: owner level
internal fun PlayerActivity.showV958OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v958: pack mode
internal fun PlayerActivity.showV958PackToggle() {
    val current = FeaturePrefsStore.batch951.v958pack
    FeaturePrefsStore.batch951.v958pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v958: package mode
internal fun PlayerActivity.showV958PackageToggle() {
    val current = FeaturePrefsStore.batch951.v958package
    FeaturePrefsStore.batch951.v958package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v958: page mode
internal fun PlayerActivity.showV958PageToggle() {
    val current = FeaturePrefsStore.batch951.v958page
    FeaturePrefsStore.batch951.v958page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v958: paint mode
internal fun PlayerActivity.showV958PaintToggle() {
    val current = FeaturePrefsStore.batch951.v958paint
    FeaturePrefsStore.batch951.v958paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v958: pair mode
internal fun PlayerActivity.showV958PairToggle() {
    val current = FeaturePrefsStore.batch951.v958pair
    FeaturePrefsStore.batch951.v958pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v959: open mode
internal fun PlayerActivity.showV959OpenToggle() {
    val current = FeaturePrefsStore.batch951.v959open
    FeaturePrefsStore.batch951.v959open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v959: operate mode
internal fun PlayerActivity.showV959OperateToggle() {
    val current = FeaturePrefsStore.batch951.v959operate
    FeaturePrefsStore.batch951.v959operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v959: option mode
internal fun PlayerActivity.showV959OptionToggle() {
    val current = FeaturePrefsStore.batch951.v959option
    FeaturePrefsStore.batch951.v959option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v959: orbit mode
internal fun PlayerActivity.showV959OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v959orbit
    FeaturePrefsStore.batch951.v959orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v959: order mode
internal fun PlayerActivity.showV959OrderToggle() {
    val current = FeaturePrefsStore.batch951.v959order
    FeaturePrefsStore.batch951.v959order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v959: origin level
internal fun PlayerActivity.showV959OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v959: out level
internal fun PlayerActivity.showV959OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959out = value
        AppToast.show(this, "out: $value")
    }
}

// v959: output level
internal fun PlayerActivity.showV959OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959output = value
        AppToast.show(this, "output: $value")
    }
}

// v959: overlay level
internal fun PlayerActivity.showV959OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v959: owner level
internal fun PlayerActivity.showV959OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v959: pack mode
internal fun PlayerActivity.showV959PackToggle() {
    val current = FeaturePrefsStore.batch951.v959pack
    FeaturePrefsStore.batch951.v959pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v959: package mode
internal fun PlayerActivity.showV959PackageToggle() {
    val current = FeaturePrefsStore.batch951.v959package
    FeaturePrefsStore.batch951.v959package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v959: page mode
internal fun PlayerActivity.showV959PageToggle() {
    val current = FeaturePrefsStore.batch951.v959page
    FeaturePrefsStore.batch951.v959page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v959: paint mode
internal fun PlayerActivity.showV959PaintToggle() {
    val current = FeaturePrefsStore.batch951.v959paint
    FeaturePrefsStore.batch951.v959paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v959: pair mode
internal fun PlayerActivity.showV959PairToggle() {
    val current = FeaturePrefsStore.batch951.v959pair
    FeaturePrefsStore.batch951.v959pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v960: open mode
internal fun PlayerActivity.showV960OpenToggle() {
    val current = FeaturePrefsStore.batch951.v960open
    FeaturePrefsStore.batch951.v960open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v960: operate mode
internal fun PlayerActivity.showV960OperateToggle() {
    val current = FeaturePrefsStore.batch951.v960operate
    FeaturePrefsStore.batch951.v960operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v960: option mode
internal fun PlayerActivity.showV960OptionToggle() {
    val current = FeaturePrefsStore.batch951.v960option
    FeaturePrefsStore.batch951.v960option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v960: orbit mode
internal fun PlayerActivity.showV960OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v960orbit
    FeaturePrefsStore.batch951.v960orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v960: order mode
internal fun PlayerActivity.showV960OrderToggle() {
    val current = FeaturePrefsStore.batch951.v960order
    FeaturePrefsStore.batch951.v960order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v960: origin level
internal fun PlayerActivity.showV960OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v960: out level
internal fun PlayerActivity.showV960OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960out = value
        AppToast.show(this, "out: $value")
    }
}

// v960: output level
internal fun PlayerActivity.showV960OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960output = value
        AppToast.show(this, "output: $value")
    }
}

// v960: overlay level
internal fun PlayerActivity.showV960OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v960: owner level
internal fun PlayerActivity.showV960OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v960: pack mode
internal fun PlayerActivity.showV960PackToggle() {
    val current = FeaturePrefsStore.batch951.v960pack
    FeaturePrefsStore.batch951.v960pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v960: package mode
internal fun PlayerActivity.showV960PackageToggle() {
    val current = FeaturePrefsStore.batch951.v960package
    FeaturePrefsStore.batch951.v960package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v960: page mode
internal fun PlayerActivity.showV960PageToggle() {
    val current = FeaturePrefsStore.batch951.v960page
    FeaturePrefsStore.batch951.v960page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v960: paint mode
internal fun PlayerActivity.showV960PaintToggle() {
    val current = FeaturePrefsStore.batch951.v960paint
    FeaturePrefsStore.batch951.v960paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v960: pair mode
internal fun PlayerActivity.showV960PairToggle() {
    val current = FeaturePrefsStore.batch951.v960pair
    FeaturePrefsStore.batch951.v960pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

