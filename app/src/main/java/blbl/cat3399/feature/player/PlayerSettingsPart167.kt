package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1851: broadening mode
internal fun PlayerActivity.showV1851BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1851broadening
    FeaturePrefsStore.batch1851.v1851broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1851: brushing mode
internal fun PlayerActivity.showV1851BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851brushing
    FeaturePrefsStore.batch1851.v1851brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1851: bubbling mode
internal fun PlayerActivity.showV1851BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851bubbling
    FeaturePrefsStore.batch1851.v1851bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1851: budgeted mode
internal fun PlayerActivity.showV1851BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851budgeted
    FeaturePrefsStore.batch1851.v1851budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1851: buffered mode
internal fun PlayerActivity.showV1851BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851buffered
    FeaturePrefsStore.batch1851.v1851buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1851: building level
internal fun PlayerActivity.showV1851BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851building = value
        AppToast.show(this, "building: $value")
    }
}

// v1851: bundled level
internal fun PlayerActivity.showV1851BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1851: burning level
internal fun PlayerActivity.showV1851BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1851: bursting level
internal fun PlayerActivity.showV1851BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1851: calculating level
internal fun PlayerActivity.showV1851CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1851: calibrated mode
internal fun PlayerActivity.showV1851CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851calibrated
    FeaturePrefsStore.batch1851.v1851calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1851: calling mode
internal fun PlayerActivity.showV1851CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851calling
    FeaturePrefsStore.batch1851.v1851calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1851: camping mode
internal fun PlayerActivity.showV1851CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851camping
    FeaturePrefsStore.batch1851.v1851camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1851: canceled mode
internal fun PlayerActivity.showV1851CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1851canceled
    FeaturePrefsStore.batch1851.v1851canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1851: captured mode
internal fun PlayerActivity.showV1851CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851captured
    FeaturePrefsStore.batch1851.v1851captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1852: broadening mode
internal fun PlayerActivity.showV1852BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1852broadening
    FeaturePrefsStore.batch1851.v1852broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1852: brushing mode
internal fun PlayerActivity.showV1852BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852brushing
    FeaturePrefsStore.batch1851.v1852brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1852: bubbling mode
internal fun PlayerActivity.showV1852BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852bubbling
    FeaturePrefsStore.batch1851.v1852bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1852: budgeted mode
internal fun PlayerActivity.showV1852BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852budgeted
    FeaturePrefsStore.batch1851.v1852budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1852: buffered mode
internal fun PlayerActivity.showV1852BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852buffered
    FeaturePrefsStore.batch1851.v1852buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1852: building level
internal fun PlayerActivity.showV1852BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852building = value
        AppToast.show(this, "building: $value")
    }
}

// v1852: bundled level
internal fun PlayerActivity.showV1852BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1852: burning level
internal fun PlayerActivity.showV1852BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1852: bursting level
internal fun PlayerActivity.showV1852BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1852: calculating level
internal fun PlayerActivity.showV1852CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1852: calibrated mode
internal fun PlayerActivity.showV1852CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852calibrated
    FeaturePrefsStore.batch1851.v1852calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1852: calling mode
internal fun PlayerActivity.showV1852CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852calling
    FeaturePrefsStore.batch1851.v1852calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1852: camping mode
internal fun PlayerActivity.showV1852CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852camping
    FeaturePrefsStore.batch1851.v1852camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1852: canceled mode
internal fun PlayerActivity.showV1852CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1852canceled
    FeaturePrefsStore.batch1851.v1852canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1852: captured mode
internal fun PlayerActivity.showV1852CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852captured
    FeaturePrefsStore.batch1851.v1852captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1853: broadening mode
internal fun PlayerActivity.showV1853BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1853broadening
    FeaturePrefsStore.batch1851.v1853broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1853: brushing mode
internal fun PlayerActivity.showV1853BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853brushing
    FeaturePrefsStore.batch1851.v1853brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1853: bubbling mode
internal fun PlayerActivity.showV1853BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853bubbling
    FeaturePrefsStore.batch1851.v1853bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1853: budgeted mode
internal fun PlayerActivity.showV1853BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853budgeted
    FeaturePrefsStore.batch1851.v1853budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1853: buffered mode
internal fun PlayerActivity.showV1853BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853buffered
    FeaturePrefsStore.batch1851.v1853buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1853: building level
internal fun PlayerActivity.showV1853BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853building = value
        AppToast.show(this, "building: $value")
    }
}

// v1853: bundled level
internal fun PlayerActivity.showV1853BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1853: burning level
internal fun PlayerActivity.showV1853BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1853: bursting level
internal fun PlayerActivity.showV1853BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1853: calculating level
internal fun PlayerActivity.showV1853CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1853: calibrated mode
internal fun PlayerActivity.showV1853CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853calibrated
    FeaturePrefsStore.batch1851.v1853calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1853: calling mode
internal fun PlayerActivity.showV1853CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853calling
    FeaturePrefsStore.batch1851.v1853calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1853: camping mode
internal fun PlayerActivity.showV1853CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853camping
    FeaturePrefsStore.batch1851.v1853camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1853: canceled mode
internal fun PlayerActivity.showV1853CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1853canceled
    FeaturePrefsStore.batch1851.v1853canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1853: captured mode
internal fun PlayerActivity.showV1853CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853captured
    FeaturePrefsStore.batch1851.v1853captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1854: broadening mode
internal fun PlayerActivity.showV1854BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1854broadening
    FeaturePrefsStore.batch1851.v1854broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1854: brushing mode
internal fun PlayerActivity.showV1854BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854brushing
    FeaturePrefsStore.batch1851.v1854brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1854: bubbling mode
internal fun PlayerActivity.showV1854BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854bubbling
    FeaturePrefsStore.batch1851.v1854bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1854: budgeted mode
internal fun PlayerActivity.showV1854BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854budgeted
    FeaturePrefsStore.batch1851.v1854budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1854: buffered mode
internal fun PlayerActivity.showV1854BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854buffered
    FeaturePrefsStore.batch1851.v1854buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1854: building level
internal fun PlayerActivity.showV1854BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854building = value
        AppToast.show(this, "building: $value")
    }
}

// v1854: bundled level
internal fun PlayerActivity.showV1854BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1854: burning level
internal fun PlayerActivity.showV1854BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1854: bursting level
internal fun PlayerActivity.showV1854BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1854: calculating level
internal fun PlayerActivity.showV1854CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1854: calibrated mode
internal fun PlayerActivity.showV1854CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854calibrated
    FeaturePrefsStore.batch1851.v1854calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1854: calling mode
internal fun PlayerActivity.showV1854CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854calling
    FeaturePrefsStore.batch1851.v1854calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1854: camping mode
internal fun PlayerActivity.showV1854CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854camping
    FeaturePrefsStore.batch1851.v1854camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1854: canceled mode
internal fun PlayerActivity.showV1854CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1854canceled
    FeaturePrefsStore.batch1851.v1854canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1854: captured mode
internal fun PlayerActivity.showV1854CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854captured
    FeaturePrefsStore.batch1851.v1854captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1855: broadening mode
internal fun PlayerActivity.showV1855BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1855broadening
    FeaturePrefsStore.batch1851.v1855broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1855: brushing mode
internal fun PlayerActivity.showV1855BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855brushing
    FeaturePrefsStore.batch1851.v1855brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1855: bubbling mode
internal fun PlayerActivity.showV1855BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855bubbling
    FeaturePrefsStore.batch1851.v1855bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1855: budgeted mode
internal fun PlayerActivity.showV1855BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855budgeted
    FeaturePrefsStore.batch1851.v1855budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1855: buffered mode
internal fun PlayerActivity.showV1855BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855buffered
    FeaturePrefsStore.batch1851.v1855buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1855: building level
internal fun PlayerActivity.showV1855BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855building = value
        AppToast.show(this, "building: $value")
    }
}

// v1855: bundled level
internal fun PlayerActivity.showV1855BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1855: burning level
internal fun PlayerActivity.showV1855BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1855: bursting level
internal fun PlayerActivity.showV1855BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1855: calculating level
internal fun PlayerActivity.showV1855CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1855: calibrated mode
internal fun PlayerActivity.showV1855CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855calibrated
    FeaturePrefsStore.batch1851.v1855calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1855: calling mode
internal fun PlayerActivity.showV1855CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855calling
    FeaturePrefsStore.batch1851.v1855calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1855: camping mode
internal fun PlayerActivity.showV1855CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855camping
    FeaturePrefsStore.batch1851.v1855camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1855: canceled mode
internal fun PlayerActivity.showV1855CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1855canceled
    FeaturePrefsStore.batch1851.v1855canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1855: captured mode
internal fun PlayerActivity.showV1855CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855captured
    FeaturePrefsStore.batch1851.v1855captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1856: broadening mode
internal fun PlayerActivity.showV1856BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1856broadening
    FeaturePrefsStore.batch1851.v1856broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1856: brushing mode
internal fun PlayerActivity.showV1856BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856brushing
    FeaturePrefsStore.batch1851.v1856brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1856: bubbling mode
internal fun PlayerActivity.showV1856BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856bubbling
    FeaturePrefsStore.batch1851.v1856bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1856: budgeted mode
internal fun PlayerActivity.showV1856BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856budgeted
    FeaturePrefsStore.batch1851.v1856budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1856: buffered mode
internal fun PlayerActivity.showV1856BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856buffered
    FeaturePrefsStore.batch1851.v1856buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1856: building level
internal fun PlayerActivity.showV1856BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856building = value
        AppToast.show(this, "building: $value")
    }
}

// v1856: bundled level
internal fun PlayerActivity.showV1856BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1856: burning level
internal fun PlayerActivity.showV1856BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1856: bursting level
internal fun PlayerActivity.showV1856BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1856: calculating level
internal fun PlayerActivity.showV1856CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1856: calibrated mode
internal fun PlayerActivity.showV1856CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856calibrated
    FeaturePrefsStore.batch1851.v1856calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1856: calling mode
internal fun PlayerActivity.showV1856CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856calling
    FeaturePrefsStore.batch1851.v1856calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1856: camping mode
internal fun PlayerActivity.showV1856CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856camping
    FeaturePrefsStore.batch1851.v1856camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1856: canceled mode
internal fun PlayerActivity.showV1856CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1856canceled
    FeaturePrefsStore.batch1851.v1856canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1856: captured mode
internal fun PlayerActivity.showV1856CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856captured
    FeaturePrefsStore.batch1851.v1856captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1857: broadening mode
internal fun PlayerActivity.showV1857BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1857broadening
    FeaturePrefsStore.batch1851.v1857broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1857: brushing mode
internal fun PlayerActivity.showV1857BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857brushing
    FeaturePrefsStore.batch1851.v1857brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1857: bubbling mode
internal fun PlayerActivity.showV1857BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857bubbling
    FeaturePrefsStore.batch1851.v1857bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1857: budgeted mode
internal fun PlayerActivity.showV1857BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857budgeted
    FeaturePrefsStore.batch1851.v1857budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1857: buffered mode
internal fun PlayerActivity.showV1857BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857buffered
    FeaturePrefsStore.batch1851.v1857buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1857: building level
internal fun PlayerActivity.showV1857BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857building = value
        AppToast.show(this, "building: $value")
    }
}

// v1857: bundled level
internal fun PlayerActivity.showV1857BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1857: burning level
internal fun PlayerActivity.showV1857BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1857: bursting level
internal fun PlayerActivity.showV1857BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1857: calculating level
internal fun PlayerActivity.showV1857CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1857: calibrated mode
internal fun PlayerActivity.showV1857CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857calibrated
    FeaturePrefsStore.batch1851.v1857calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1857: calling mode
internal fun PlayerActivity.showV1857CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857calling
    FeaturePrefsStore.batch1851.v1857calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1857: camping mode
internal fun PlayerActivity.showV1857CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857camping
    FeaturePrefsStore.batch1851.v1857camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1857: canceled mode
internal fun PlayerActivity.showV1857CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1857canceled
    FeaturePrefsStore.batch1851.v1857canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1857: captured mode
internal fun PlayerActivity.showV1857CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857captured
    FeaturePrefsStore.batch1851.v1857captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1858: broadening mode
internal fun PlayerActivity.showV1858BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1858broadening
    FeaturePrefsStore.batch1851.v1858broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1858: brushing mode
internal fun PlayerActivity.showV1858BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858brushing
    FeaturePrefsStore.batch1851.v1858brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1858: bubbling mode
internal fun PlayerActivity.showV1858BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858bubbling
    FeaturePrefsStore.batch1851.v1858bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1858: budgeted mode
internal fun PlayerActivity.showV1858BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858budgeted
    FeaturePrefsStore.batch1851.v1858budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1858: buffered mode
internal fun PlayerActivity.showV1858BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858buffered
    FeaturePrefsStore.batch1851.v1858buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1858: building level
internal fun PlayerActivity.showV1858BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858building = value
        AppToast.show(this, "building: $value")
    }
}

// v1858: bundled level
internal fun PlayerActivity.showV1858BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1858: burning level
internal fun PlayerActivity.showV1858BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1858: bursting level
internal fun PlayerActivity.showV1858BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1858: calculating level
internal fun PlayerActivity.showV1858CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1858: calibrated mode
internal fun PlayerActivity.showV1858CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858calibrated
    FeaturePrefsStore.batch1851.v1858calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1858: calling mode
internal fun PlayerActivity.showV1858CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858calling
    FeaturePrefsStore.batch1851.v1858calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1858: camping mode
internal fun PlayerActivity.showV1858CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858camping
    FeaturePrefsStore.batch1851.v1858camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1858: canceled mode
internal fun PlayerActivity.showV1858CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1858canceled
    FeaturePrefsStore.batch1851.v1858canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1858: captured mode
internal fun PlayerActivity.showV1858CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858captured
    FeaturePrefsStore.batch1851.v1858captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1859: broadening mode
internal fun PlayerActivity.showV1859BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1859broadening
    FeaturePrefsStore.batch1851.v1859broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1859: brushing mode
internal fun PlayerActivity.showV1859BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859brushing
    FeaturePrefsStore.batch1851.v1859brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1859: bubbling mode
internal fun PlayerActivity.showV1859BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859bubbling
    FeaturePrefsStore.batch1851.v1859bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1859: budgeted mode
internal fun PlayerActivity.showV1859BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859budgeted
    FeaturePrefsStore.batch1851.v1859budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1859: buffered mode
internal fun PlayerActivity.showV1859BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859buffered
    FeaturePrefsStore.batch1851.v1859buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1859: building level
internal fun PlayerActivity.showV1859BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859building = value
        AppToast.show(this, "building: $value")
    }
}

// v1859: bundled level
internal fun PlayerActivity.showV1859BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1859: burning level
internal fun PlayerActivity.showV1859BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1859: bursting level
internal fun PlayerActivity.showV1859BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1859: calculating level
internal fun PlayerActivity.showV1859CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1859: calibrated mode
internal fun PlayerActivity.showV1859CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859calibrated
    FeaturePrefsStore.batch1851.v1859calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1859: calling mode
internal fun PlayerActivity.showV1859CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859calling
    FeaturePrefsStore.batch1851.v1859calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1859: camping mode
internal fun PlayerActivity.showV1859CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859camping
    FeaturePrefsStore.batch1851.v1859camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1859: canceled mode
internal fun PlayerActivity.showV1859CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1859canceled
    FeaturePrefsStore.batch1851.v1859canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1859: captured mode
internal fun PlayerActivity.showV1859CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859captured
    FeaturePrefsStore.batch1851.v1859captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1860: broadening mode
internal fun PlayerActivity.showV1860BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1860broadening
    FeaturePrefsStore.batch1851.v1860broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1860: brushing mode
internal fun PlayerActivity.showV1860BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860brushing
    FeaturePrefsStore.batch1851.v1860brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1860: bubbling mode
internal fun PlayerActivity.showV1860BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860bubbling
    FeaturePrefsStore.batch1851.v1860bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1860: budgeted mode
internal fun PlayerActivity.showV1860BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860budgeted
    FeaturePrefsStore.batch1851.v1860budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1860: buffered mode
internal fun PlayerActivity.showV1860BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860buffered
    FeaturePrefsStore.batch1851.v1860buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1860: building level
internal fun PlayerActivity.showV1860BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860building = value
        AppToast.show(this, "building: $value")
    }
}

// v1860: bundled level
internal fun PlayerActivity.showV1860BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1860: burning level
internal fun PlayerActivity.showV1860BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1860: bursting level
internal fun PlayerActivity.showV1860BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1860: calculating level
internal fun PlayerActivity.showV1860CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1860: calibrated mode
internal fun PlayerActivity.showV1860CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860calibrated
    FeaturePrefsStore.batch1851.v1860calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1860: calling mode
internal fun PlayerActivity.showV1860CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860calling
    FeaturePrefsStore.batch1851.v1860calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1860: camping mode
internal fun PlayerActivity.showV1860CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860camping
    FeaturePrefsStore.batch1851.v1860camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1860: canceled mode
internal fun PlayerActivity.showV1860CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1860canceled
    FeaturePrefsStore.batch1851.v1860canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1860: captured mode
internal fun PlayerActivity.showV1860CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860captured
    FeaturePrefsStore.batch1851.v1860captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

