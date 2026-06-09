package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1391: donor mode
internal fun PlayerActivity.showV1391DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1391donor
    FeaturePrefsStore.batch1391.v1391donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1391: door mode
internal fun PlayerActivity.showV1391DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1391door
    FeaturePrefsStore.batch1391.v1391door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1391: double mode
internal fun PlayerActivity.showV1391DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1391double
    FeaturePrefsStore.batch1391.v1391double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1391: dove mode
internal fun PlayerActivity.showV1391DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1391dove
    FeaturePrefsStore.batch1391.v1391dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1391: drain mode
internal fun PlayerActivity.showV1391DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drain
    FeaturePrefsStore.batch1391.v1391drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1391: drama level
internal fun PlayerActivity.showV1391DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1391drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1391drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1391: drank level
internal fun PlayerActivity.showV1391DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1391drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1391drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1391: drape level
internal fun PlayerActivity.showV1391DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1391drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1391drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1391: dream level
internal fun PlayerActivity.showV1391DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1391dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1391dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1391: dress level
internal fun PlayerActivity.showV1391DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1391dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1391dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1391: drift mode
internal fun PlayerActivity.showV1391DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drift
    FeaturePrefsStore.batch1391.v1391drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1391: drill mode
internal fun PlayerActivity.showV1391DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drill
    FeaturePrefsStore.batch1391.v1391drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1391: drink mode
internal fun PlayerActivity.showV1391DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drink
    FeaturePrefsStore.batch1391.v1391drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1391: drive mode
internal fun PlayerActivity.showV1391DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drive
    FeaturePrefsStore.batch1391.v1391drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1391: drum mode
internal fun PlayerActivity.showV1391DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1391drum
    FeaturePrefsStore.batch1391.v1391drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1392: donor mode
internal fun PlayerActivity.showV1392DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1392donor
    FeaturePrefsStore.batch1391.v1392donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1392: door mode
internal fun PlayerActivity.showV1392DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1392door
    FeaturePrefsStore.batch1391.v1392door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1392: double mode
internal fun PlayerActivity.showV1392DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1392double
    FeaturePrefsStore.batch1391.v1392double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1392: dove mode
internal fun PlayerActivity.showV1392DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1392dove
    FeaturePrefsStore.batch1391.v1392dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1392: drain mode
internal fun PlayerActivity.showV1392DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drain
    FeaturePrefsStore.batch1391.v1392drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1392: drama level
internal fun PlayerActivity.showV1392DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1392drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1392drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1392: drank level
internal fun PlayerActivity.showV1392DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1392drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1392drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1392: drape level
internal fun PlayerActivity.showV1392DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1392drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1392drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1392: dream level
internal fun PlayerActivity.showV1392DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1392dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1392dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1392: dress level
internal fun PlayerActivity.showV1392DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1392dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1392dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1392: drift mode
internal fun PlayerActivity.showV1392DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drift
    FeaturePrefsStore.batch1391.v1392drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1392: drill mode
internal fun PlayerActivity.showV1392DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drill
    FeaturePrefsStore.batch1391.v1392drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1392: drink mode
internal fun PlayerActivity.showV1392DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drink
    FeaturePrefsStore.batch1391.v1392drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1392: drive mode
internal fun PlayerActivity.showV1392DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drive
    FeaturePrefsStore.batch1391.v1392drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1392: drum mode
internal fun PlayerActivity.showV1392DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1392drum
    FeaturePrefsStore.batch1391.v1392drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1393: donor mode
internal fun PlayerActivity.showV1393DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1393donor
    FeaturePrefsStore.batch1391.v1393donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1393: door mode
internal fun PlayerActivity.showV1393DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1393door
    FeaturePrefsStore.batch1391.v1393door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1393: double mode
internal fun PlayerActivity.showV1393DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1393double
    FeaturePrefsStore.batch1391.v1393double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1393: dove mode
internal fun PlayerActivity.showV1393DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1393dove
    FeaturePrefsStore.batch1391.v1393dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1393: drain mode
internal fun PlayerActivity.showV1393DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drain
    FeaturePrefsStore.batch1391.v1393drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1393: drama level
internal fun PlayerActivity.showV1393DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1393drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1393drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1393: drank level
internal fun PlayerActivity.showV1393DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1393drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1393drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1393: drape level
internal fun PlayerActivity.showV1393DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1393drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1393drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1393: dream level
internal fun PlayerActivity.showV1393DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1393dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1393dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1393: dress level
internal fun PlayerActivity.showV1393DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1393dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1393dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1393: drift mode
internal fun PlayerActivity.showV1393DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drift
    FeaturePrefsStore.batch1391.v1393drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1393: drill mode
internal fun PlayerActivity.showV1393DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drill
    FeaturePrefsStore.batch1391.v1393drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1393: drink mode
internal fun PlayerActivity.showV1393DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drink
    FeaturePrefsStore.batch1391.v1393drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1393: drive mode
internal fun PlayerActivity.showV1393DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drive
    FeaturePrefsStore.batch1391.v1393drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1393: drum mode
internal fun PlayerActivity.showV1393DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1393drum
    FeaturePrefsStore.batch1391.v1393drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1394: donor mode
internal fun PlayerActivity.showV1394DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1394donor
    FeaturePrefsStore.batch1391.v1394donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1394: door mode
internal fun PlayerActivity.showV1394DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1394door
    FeaturePrefsStore.batch1391.v1394door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1394: double mode
internal fun PlayerActivity.showV1394DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1394double
    FeaturePrefsStore.batch1391.v1394double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1394: dove mode
internal fun PlayerActivity.showV1394DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1394dove
    FeaturePrefsStore.batch1391.v1394dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1394: drain mode
internal fun PlayerActivity.showV1394DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drain
    FeaturePrefsStore.batch1391.v1394drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1394: drama level
internal fun PlayerActivity.showV1394DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1394drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1394drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1394: drank level
internal fun PlayerActivity.showV1394DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1394drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1394drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1394: drape level
internal fun PlayerActivity.showV1394DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1394drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1394drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1394: dream level
internal fun PlayerActivity.showV1394DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1394dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1394dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1394: dress level
internal fun PlayerActivity.showV1394DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1394dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1394dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1394: drift mode
internal fun PlayerActivity.showV1394DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drift
    FeaturePrefsStore.batch1391.v1394drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1394: drill mode
internal fun PlayerActivity.showV1394DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drill
    FeaturePrefsStore.batch1391.v1394drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1394: drink mode
internal fun PlayerActivity.showV1394DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drink
    FeaturePrefsStore.batch1391.v1394drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1394: drive mode
internal fun PlayerActivity.showV1394DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drive
    FeaturePrefsStore.batch1391.v1394drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1394: drum mode
internal fun PlayerActivity.showV1394DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1394drum
    FeaturePrefsStore.batch1391.v1394drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1395: donor mode
internal fun PlayerActivity.showV1395DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1395donor
    FeaturePrefsStore.batch1391.v1395donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1395: door mode
internal fun PlayerActivity.showV1395DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1395door
    FeaturePrefsStore.batch1391.v1395door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1395: double mode
internal fun PlayerActivity.showV1395DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1395double
    FeaturePrefsStore.batch1391.v1395double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1395: dove mode
internal fun PlayerActivity.showV1395DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1395dove
    FeaturePrefsStore.batch1391.v1395dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1395: drain mode
internal fun PlayerActivity.showV1395DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drain
    FeaturePrefsStore.batch1391.v1395drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1395: drama level
internal fun PlayerActivity.showV1395DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1395drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1395drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1395: drank level
internal fun PlayerActivity.showV1395DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1395drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1395drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1395: drape level
internal fun PlayerActivity.showV1395DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1395drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1395drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1395: dream level
internal fun PlayerActivity.showV1395DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1395dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1395dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1395: dress level
internal fun PlayerActivity.showV1395DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1395dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1395dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1395: drift mode
internal fun PlayerActivity.showV1395DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drift
    FeaturePrefsStore.batch1391.v1395drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1395: drill mode
internal fun PlayerActivity.showV1395DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drill
    FeaturePrefsStore.batch1391.v1395drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1395: drink mode
internal fun PlayerActivity.showV1395DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drink
    FeaturePrefsStore.batch1391.v1395drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1395: drive mode
internal fun PlayerActivity.showV1395DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drive
    FeaturePrefsStore.batch1391.v1395drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1395: drum mode
internal fun PlayerActivity.showV1395DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1395drum
    FeaturePrefsStore.batch1391.v1395drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1396: donor mode
internal fun PlayerActivity.showV1396DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1396donor
    FeaturePrefsStore.batch1391.v1396donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1396: door mode
internal fun PlayerActivity.showV1396DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1396door
    FeaturePrefsStore.batch1391.v1396door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1396: double mode
internal fun PlayerActivity.showV1396DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1396double
    FeaturePrefsStore.batch1391.v1396double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1396: dove mode
internal fun PlayerActivity.showV1396DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1396dove
    FeaturePrefsStore.batch1391.v1396dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1396: drain mode
internal fun PlayerActivity.showV1396DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drain
    FeaturePrefsStore.batch1391.v1396drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1396: drama level
internal fun PlayerActivity.showV1396DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1396drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1396drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1396: drank level
internal fun PlayerActivity.showV1396DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1396drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1396drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1396: drape level
internal fun PlayerActivity.showV1396DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1396drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1396drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1396: dream level
internal fun PlayerActivity.showV1396DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1396dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1396dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1396: dress level
internal fun PlayerActivity.showV1396DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1396dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1396dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1396: drift mode
internal fun PlayerActivity.showV1396DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drift
    FeaturePrefsStore.batch1391.v1396drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1396: drill mode
internal fun PlayerActivity.showV1396DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drill
    FeaturePrefsStore.batch1391.v1396drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1396: drink mode
internal fun PlayerActivity.showV1396DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drink
    FeaturePrefsStore.batch1391.v1396drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1396: drive mode
internal fun PlayerActivity.showV1396DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drive
    FeaturePrefsStore.batch1391.v1396drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1396: drum mode
internal fun PlayerActivity.showV1396DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1396drum
    FeaturePrefsStore.batch1391.v1396drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1397: donor mode
internal fun PlayerActivity.showV1397DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1397donor
    FeaturePrefsStore.batch1391.v1397donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1397: door mode
internal fun PlayerActivity.showV1397DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1397door
    FeaturePrefsStore.batch1391.v1397door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1397: double mode
internal fun PlayerActivity.showV1397DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1397double
    FeaturePrefsStore.batch1391.v1397double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1397: dove mode
internal fun PlayerActivity.showV1397DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1397dove
    FeaturePrefsStore.batch1391.v1397dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1397: drain mode
internal fun PlayerActivity.showV1397DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drain
    FeaturePrefsStore.batch1391.v1397drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1397: drama level
internal fun PlayerActivity.showV1397DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1397drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1397drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1397: drank level
internal fun PlayerActivity.showV1397DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1397drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1397drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1397: drape level
internal fun PlayerActivity.showV1397DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1397drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1397drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1397: dream level
internal fun PlayerActivity.showV1397DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1397dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1397dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1397: dress level
internal fun PlayerActivity.showV1397DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1397dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1397dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1397: drift mode
internal fun PlayerActivity.showV1397DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drift
    FeaturePrefsStore.batch1391.v1397drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1397: drill mode
internal fun PlayerActivity.showV1397DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drill
    FeaturePrefsStore.batch1391.v1397drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1397: drink mode
internal fun PlayerActivity.showV1397DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drink
    FeaturePrefsStore.batch1391.v1397drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1397: drive mode
internal fun PlayerActivity.showV1397DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drive
    FeaturePrefsStore.batch1391.v1397drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1397: drum mode
internal fun PlayerActivity.showV1397DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1397drum
    FeaturePrefsStore.batch1391.v1397drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1398: donor mode
internal fun PlayerActivity.showV1398DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1398donor
    FeaturePrefsStore.batch1391.v1398donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1398: door mode
internal fun PlayerActivity.showV1398DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1398door
    FeaturePrefsStore.batch1391.v1398door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1398: double mode
internal fun PlayerActivity.showV1398DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1398double
    FeaturePrefsStore.batch1391.v1398double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1398: dove mode
internal fun PlayerActivity.showV1398DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1398dove
    FeaturePrefsStore.batch1391.v1398dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1398: drain mode
internal fun PlayerActivity.showV1398DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drain
    FeaturePrefsStore.batch1391.v1398drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1398: drama level
internal fun PlayerActivity.showV1398DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1398drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1398drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1398: drank level
internal fun PlayerActivity.showV1398DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1398drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1398drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1398: drape level
internal fun PlayerActivity.showV1398DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1398drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1398drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1398: dream level
internal fun PlayerActivity.showV1398DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1398dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1398dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1398: dress level
internal fun PlayerActivity.showV1398DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1398dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1398dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1398: drift mode
internal fun PlayerActivity.showV1398DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drift
    FeaturePrefsStore.batch1391.v1398drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1398: drill mode
internal fun PlayerActivity.showV1398DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drill
    FeaturePrefsStore.batch1391.v1398drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1398: drink mode
internal fun PlayerActivity.showV1398DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drink
    FeaturePrefsStore.batch1391.v1398drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1398: drive mode
internal fun PlayerActivity.showV1398DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drive
    FeaturePrefsStore.batch1391.v1398drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1398: drum mode
internal fun PlayerActivity.showV1398DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1398drum
    FeaturePrefsStore.batch1391.v1398drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1399: donor mode
internal fun PlayerActivity.showV1399DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1399donor
    FeaturePrefsStore.batch1391.v1399donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1399: door mode
internal fun PlayerActivity.showV1399DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1399door
    FeaturePrefsStore.batch1391.v1399door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1399: double mode
internal fun PlayerActivity.showV1399DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1399double
    FeaturePrefsStore.batch1391.v1399double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1399: dove mode
internal fun PlayerActivity.showV1399DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1399dove
    FeaturePrefsStore.batch1391.v1399dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1399: drain mode
internal fun PlayerActivity.showV1399DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drain
    FeaturePrefsStore.batch1391.v1399drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1399: drama level
internal fun PlayerActivity.showV1399DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1399drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1399drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1399: drank level
internal fun PlayerActivity.showV1399DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1399drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1399drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1399: drape level
internal fun PlayerActivity.showV1399DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1399drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1399drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1399: dream level
internal fun PlayerActivity.showV1399DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1399dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1399dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1399: dress level
internal fun PlayerActivity.showV1399DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1399dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1399dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1399: drift mode
internal fun PlayerActivity.showV1399DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drift
    FeaturePrefsStore.batch1391.v1399drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1399: drill mode
internal fun PlayerActivity.showV1399DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drill
    FeaturePrefsStore.batch1391.v1399drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1399: drink mode
internal fun PlayerActivity.showV1399DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drink
    FeaturePrefsStore.batch1391.v1399drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1399: drive mode
internal fun PlayerActivity.showV1399DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drive
    FeaturePrefsStore.batch1391.v1399drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1399: drum mode
internal fun PlayerActivity.showV1399DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1399drum
    FeaturePrefsStore.batch1391.v1399drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

// v1400: donor mode
internal fun PlayerActivity.showV1400DonorToggle() {
    val current = FeaturePrefsStore.batch1391.v1400donor
    FeaturePrefsStore.batch1391.v1400donor = !current
    AppToast.show(this, "donor: ${if (!current) "ON" else "OFF"}")
}

// v1400: door mode
internal fun PlayerActivity.showV1400DoorToggle() {
    val current = FeaturePrefsStore.batch1391.v1400door
    FeaturePrefsStore.batch1391.v1400door = !current
    AppToast.show(this, "door: ${if (!current) "ON" else "OFF"}")
}

// v1400: double mode
internal fun PlayerActivity.showV1400DoubleToggle() {
    val current = FeaturePrefsStore.batch1391.v1400double
    FeaturePrefsStore.batch1391.v1400double = !current
    AppToast.show(this, "double: ${if (!current) "ON" else "OFF"}")
}

// v1400: dove mode
internal fun PlayerActivity.showV1400DoveToggle() {
    val current = FeaturePrefsStore.batch1391.v1400dove
    FeaturePrefsStore.batch1391.v1400dove = !current
    AppToast.show(this, "dove: ${if (!current) "ON" else "OFF"}")
}

// v1400: drain mode
internal fun PlayerActivity.showV1400DrainToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drain
    FeaturePrefsStore.batch1391.v1400drain = !current
    AppToast.show(this, "drain: ${if (!current) "ON" else "OFF"}")
}

// v1400: drama level
internal fun PlayerActivity.showV1400DramaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1400drama).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drama level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1400drama = value
        AppToast.show(this, "drama: $value")
    }
}

// v1400: drank level
internal fun PlayerActivity.showV1400DrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1400drank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1400drank = value
        AppToast.show(this, "drank: $value")
    }
}

// v1400: drape level
internal fun PlayerActivity.showV1400DrapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1400drape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drape level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1400drape = value
        AppToast.show(this, "drape: $value")
    }
}

// v1400: dream level
internal fun PlayerActivity.showV1400DreamDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1400dream).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dream level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1400dream = value
        AppToast.show(this, "dream: $value")
    }
}

// v1400: dress level
internal fun PlayerActivity.showV1400DressDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1391.v1400dress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dress level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1391.v1400dress = value
        AppToast.show(this, "dress: $value")
    }
}

// v1400: drift mode
internal fun PlayerActivity.showV1400DriftToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drift
    FeaturePrefsStore.batch1391.v1400drift = !current
    AppToast.show(this, "drift: ${if (!current) "ON" else "OFF"}")
}

// v1400: drill mode
internal fun PlayerActivity.showV1400DrillToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drill
    FeaturePrefsStore.batch1391.v1400drill = !current
    AppToast.show(this, "drill: ${if (!current) "ON" else "OFF"}")
}

// v1400: drink mode
internal fun PlayerActivity.showV1400DrinkToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drink
    FeaturePrefsStore.batch1391.v1400drink = !current
    AppToast.show(this, "drink: ${if (!current) "ON" else "OFF"}")
}

// v1400: drive mode
internal fun PlayerActivity.showV1400DriveToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drive
    FeaturePrefsStore.batch1391.v1400drive = !current
    AppToast.show(this, "drive: ${if (!current) "ON" else "OFF"}")
}

// v1400: drum mode
internal fun PlayerActivity.showV1400DrumToggle() {
    val current = FeaturePrefsStore.batch1391.v1400drum
    FeaturePrefsStore.batch1391.v1400drum = !current
    AppToast.show(this, "drum: ${if (!current) "ON" else "OFF"}")
}

