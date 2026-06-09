package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1641: own mode
internal fun PlayerActivity.showV1641OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1641own
    FeaturePrefsStore.batch1641.v1641own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1641: oxygen mode
internal fun PlayerActivity.showV1641OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1641oxygen
    FeaturePrefsStore.batch1641.v1641oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1641: oyster mode
internal fun PlayerActivity.showV1641OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1641oyster
    FeaturePrefsStore.batch1641.v1641oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1641: ozone mode
internal fun PlayerActivity.showV1641OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1641ozone
    FeaturePrefsStore.batch1641.v1641ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1641: pain mode
internal fun PlayerActivity.showV1641PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1641pain
    FeaturePrefsStore.batch1641.v1641pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1641: palace level
internal fun PlayerActivity.showV1641PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1641palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1641palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1641: palm level
internal fun PlayerActivity.showV1641PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1641palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1641palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1641: pan level
internal fun PlayerActivity.showV1641PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1641pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1641pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1641: panda level
internal fun PlayerActivity.showV1641PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1641panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1641panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1641: panic level
internal fun PlayerActivity.showV1641PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1641panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1641panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1641: panther mode
internal fun PlayerActivity.showV1641PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1641panther
    FeaturePrefsStore.batch1641.v1641panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1641: paper mode
internal fun PlayerActivity.showV1641PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1641paper
    FeaturePrefsStore.batch1641.v1641paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1641: parade mode
internal fun PlayerActivity.showV1641ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1641parade
    FeaturePrefsStore.batch1641.v1641parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1641: park mode
internal fun PlayerActivity.showV1641ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1641park
    FeaturePrefsStore.batch1641.v1641park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1641: parrot mode
internal fun PlayerActivity.showV1641ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1641parrot
    FeaturePrefsStore.batch1641.v1641parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1642: own mode
internal fun PlayerActivity.showV1642OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1642own
    FeaturePrefsStore.batch1641.v1642own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1642: oxygen mode
internal fun PlayerActivity.showV1642OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1642oxygen
    FeaturePrefsStore.batch1641.v1642oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1642: oyster mode
internal fun PlayerActivity.showV1642OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1642oyster
    FeaturePrefsStore.batch1641.v1642oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1642: ozone mode
internal fun PlayerActivity.showV1642OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1642ozone
    FeaturePrefsStore.batch1641.v1642ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1642: pain mode
internal fun PlayerActivity.showV1642PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1642pain
    FeaturePrefsStore.batch1641.v1642pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1642: palace level
internal fun PlayerActivity.showV1642PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1642palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1642palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1642: palm level
internal fun PlayerActivity.showV1642PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1642palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1642palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1642: pan level
internal fun PlayerActivity.showV1642PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1642pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1642pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1642: panda level
internal fun PlayerActivity.showV1642PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1642panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1642panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1642: panic level
internal fun PlayerActivity.showV1642PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1642panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1642panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1642: panther mode
internal fun PlayerActivity.showV1642PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1642panther
    FeaturePrefsStore.batch1641.v1642panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1642: paper mode
internal fun PlayerActivity.showV1642PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1642paper
    FeaturePrefsStore.batch1641.v1642paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1642: parade mode
internal fun PlayerActivity.showV1642ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1642parade
    FeaturePrefsStore.batch1641.v1642parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1642: park mode
internal fun PlayerActivity.showV1642ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1642park
    FeaturePrefsStore.batch1641.v1642park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1642: parrot mode
internal fun PlayerActivity.showV1642ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1642parrot
    FeaturePrefsStore.batch1641.v1642parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1643: own mode
internal fun PlayerActivity.showV1643OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1643own
    FeaturePrefsStore.batch1641.v1643own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1643: oxygen mode
internal fun PlayerActivity.showV1643OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1643oxygen
    FeaturePrefsStore.batch1641.v1643oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1643: oyster mode
internal fun PlayerActivity.showV1643OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1643oyster
    FeaturePrefsStore.batch1641.v1643oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1643: ozone mode
internal fun PlayerActivity.showV1643OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1643ozone
    FeaturePrefsStore.batch1641.v1643ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1643: pain mode
internal fun PlayerActivity.showV1643PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1643pain
    FeaturePrefsStore.batch1641.v1643pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1643: palace level
internal fun PlayerActivity.showV1643PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1643palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1643palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1643: palm level
internal fun PlayerActivity.showV1643PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1643palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1643palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1643: pan level
internal fun PlayerActivity.showV1643PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1643pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1643pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1643: panda level
internal fun PlayerActivity.showV1643PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1643panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1643panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1643: panic level
internal fun PlayerActivity.showV1643PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1643panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1643panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1643: panther mode
internal fun PlayerActivity.showV1643PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1643panther
    FeaturePrefsStore.batch1641.v1643panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1643: paper mode
internal fun PlayerActivity.showV1643PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1643paper
    FeaturePrefsStore.batch1641.v1643paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1643: parade mode
internal fun PlayerActivity.showV1643ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1643parade
    FeaturePrefsStore.batch1641.v1643parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1643: park mode
internal fun PlayerActivity.showV1643ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1643park
    FeaturePrefsStore.batch1641.v1643park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1643: parrot mode
internal fun PlayerActivity.showV1643ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1643parrot
    FeaturePrefsStore.batch1641.v1643parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1644: own mode
internal fun PlayerActivity.showV1644OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1644own
    FeaturePrefsStore.batch1641.v1644own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1644: oxygen mode
internal fun PlayerActivity.showV1644OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1644oxygen
    FeaturePrefsStore.batch1641.v1644oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1644: oyster mode
internal fun PlayerActivity.showV1644OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1644oyster
    FeaturePrefsStore.batch1641.v1644oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1644: ozone mode
internal fun PlayerActivity.showV1644OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1644ozone
    FeaturePrefsStore.batch1641.v1644ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1644: pain mode
internal fun PlayerActivity.showV1644PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1644pain
    FeaturePrefsStore.batch1641.v1644pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1644: palace level
internal fun PlayerActivity.showV1644PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1644palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1644palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1644: palm level
internal fun PlayerActivity.showV1644PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1644palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1644palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1644: pan level
internal fun PlayerActivity.showV1644PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1644pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1644pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1644: panda level
internal fun PlayerActivity.showV1644PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1644panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1644panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1644: panic level
internal fun PlayerActivity.showV1644PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1644panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1644panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1644: panther mode
internal fun PlayerActivity.showV1644PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1644panther
    FeaturePrefsStore.batch1641.v1644panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1644: paper mode
internal fun PlayerActivity.showV1644PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1644paper
    FeaturePrefsStore.batch1641.v1644paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1644: parade mode
internal fun PlayerActivity.showV1644ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1644parade
    FeaturePrefsStore.batch1641.v1644parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1644: park mode
internal fun PlayerActivity.showV1644ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1644park
    FeaturePrefsStore.batch1641.v1644park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1644: parrot mode
internal fun PlayerActivity.showV1644ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1644parrot
    FeaturePrefsStore.batch1641.v1644parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1645: own mode
internal fun PlayerActivity.showV1645OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1645own
    FeaturePrefsStore.batch1641.v1645own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1645: oxygen mode
internal fun PlayerActivity.showV1645OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1645oxygen
    FeaturePrefsStore.batch1641.v1645oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1645: oyster mode
internal fun PlayerActivity.showV1645OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1645oyster
    FeaturePrefsStore.batch1641.v1645oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1645: ozone mode
internal fun PlayerActivity.showV1645OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1645ozone
    FeaturePrefsStore.batch1641.v1645ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1645: pain mode
internal fun PlayerActivity.showV1645PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1645pain
    FeaturePrefsStore.batch1641.v1645pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1645: palace level
internal fun PlayerActivity.showV1645PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1645palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1645palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1645: palm level
internal fun PlayerActivity.showV1645PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1645palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1645palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1645: pan level
internal fun PlayerActivity.showV1645PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1645pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1645pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1645: panda level
internal fun PlayerActivity.showV1645PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1645panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1645panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1645: panic level
internal fun PlayerActivity.showV1645PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1645panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1645panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1645: panther mode
internal fun PlayerActivity.showV1645PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1645panther
    FeaturePrefsStore.batch1641.v1645panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1645: paper mode
internal fun PlayerActivity.showV1645PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1645paper
    FeaturePrefsStore.batch1641.v1645paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1645: parade mode
internal fun PlayerActivity.showV1645ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1645parade
    FeaturePrefsStore.batch1641.v1645parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1645: park mode
internal fun PlayerActivity.showV1645ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1645park
    FeaturePrefsStore.batch1641.v1645park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1645: parrot mode
internal fun PlayerActivity.showV1645ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1645parrot
    FeaturePrefsStore.batch1641.v1645parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1646: own mode
internal fun PlayerActivity.showV1646OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1646own
    FeaturePrefsStore.batch1641.v1646own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1646: oxygen mode
internal fun PlayerActivity.showV1646OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1646oxygen
    FeaturePrefsStore.batch1641.v1646oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1646: oyster mode
internal fun PlayerActivity.showV1646OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1646oyster
    FeaturePrefsStore.batch1641.v1646oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1646: ozone mode
internal fun PlayerActivity.showV1646OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1646ozone
    FeaturePrefsStore.batch1641.v1646ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1646: pain mode
internal fun PlayerActivity.showV1646PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1646pain
    FeaturePrefsStore.batch1641.v1646pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1646: palace level
internal fun PlayerActivity.showV1646PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1646palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1646palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1646: palm level
internal fun PlayerActivity.showV1646PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1646palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1646palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1646: pan level
internal fun PlayerActivity.showV1646PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1646pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1646pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1646: panda level
internal fun PlayerActivity.showV1646PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1646panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1646panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1646: panic level
internal fun PlayerActivity.showV1646PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1646panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1646panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1646: panther mode
internal fun PlayerActivity.showV1646PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1646panther
    FeaturePrefsStore.batch1641.v1646panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1646: paper mode
internal fun PlayerActivity.showV1646PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1646paper
    FeaturePrefsStore.batch1641.v1646paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1646: parade mode
internal fun PlayerActivity.showV1646ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1646parade
    FeaturePrefsStore.batch1641.v1646parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1646: park mode
internal fun PlayerActivity.showV1646ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1646park
    FeaturePrefsStore.batch1641.v1646park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1646: parrot mode
internal fun PlayerActivity.showV1646ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1646parrot
    FeaturePrefsStore.batch1641.v1646parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1647: own mode
internal fun PlayerActivity.showV1647OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1647own
    FeaturePrefsStore.batch1641.v1647own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1647: oxygen mode
internal fun PlayerActivity.showV1647OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1647oxygen
    FeaturePrefsStore.batch1641.v1647oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1647: oyster mode
internal fun PlayerActivity.showV1647OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1647oyster
    FeaturePrefsStore.batch1641.v1647oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1647: ozone mode
internal fun PlayerActivity.showV1647OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1647ozone
    FeaturePrefsStore.batch1641.v1647ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1647: pain mode
internal fun PlayerActivity.showV1647PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1647pain
    FeaturePrefsStore.batch1641.v1647pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1647: palace level
internal fun PlayerActivity.showV1647PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1647palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1647palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1647: palm level
internal fun PlayerActivity.showV1647PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1647palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1647palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1647: pan level
internal fun PlayerActivity.showV1647PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1647pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1647pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1647: panda level
internal fun PlayerActivity.showV1647PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1647panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1647panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1647: panic level
internal fun PlayerActivity.showV1647PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1647panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1647panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1647: panther mode
internal fun PlayerActivity.showV1647PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1647panther
    FeaturePrefsStore.batch1641.v1647panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1647: paper mode
internal fun PlayerActivity.showV1647PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1647paper
    FeaturePrefsStore.batch1641.v1647paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1647: parade mode
internal fun PlayerActivity.showV1647ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1647parade
    FeaturePrefsStore.batch1641.v1647parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1647: park mode
internal fun PlayerActivity.showV1647ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1647park
    FeaturePrefsStore.batch1641.v1647park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1647: parrot mode
internal fun PlayerActivity.showV1647ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1647parrot
    FeaturePrefsStore.batch1641.v1647parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1648: own mode
internal fun PlayerActivity.showV1648OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1648own
    FeaturePrefsStore.batch1641.v1648own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1648: oxygen mode
internal fun PlayerActivity.showV1648OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1648oxygen
    FeaturePrefsStore.batch1641.v1648oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1648: oyster mode
internal fun PlayerActivity.showV1648OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1648oyster
    FeaturePrefsStore.batch1641.v1648oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1648: ozone mode
internal fun PlayerActivity.showV1648OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1648ozone
    FeaturePrefsStore.batch1641.v1648ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1648: pain mode
internal fun PlayerActivity.showV1648PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1648pain
    FeaturePrefsStore.batch1641.v1648pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1648: palace level
internal fun PlayerActivity.showV1648PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1648palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1648palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1648: palm level
internal fun PlayerActivity.showV1648PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1648palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1648palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1648: pan level
internal fun PlayerActivity.showV1648PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1648pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1648pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1648: panda level
internal fun PlayerActivity.showV1648PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1648panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1648panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1648: panic level
internal fun PlayerActivity.showV1648PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1648panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1648panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1648: panther mode
internal fun PlayerActivity.showV1648PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1648panther
    FeaturePrefsStore.batch1641.v1648panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1648: paper mode
internal fun PlayerActivity.showV1648PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1648paper
    FeaturePrefsStore.batch1641.v1648paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1648: parade mode
internal fun PlayerActivity.showV1648ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1648parade
    FeaturePrefsStore.batch1641.v1648parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1648: park mode
internal fun PlayerActivity.showV1648ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1648park
    FeaturePrefsStore.batch1641.v1648park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1648: parrot mode
internal fun PlayerActivity.showV1648ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1648parrot
    FeaturePrefsStore.batch1641.v1648parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1649: own mode
internal fun PlayerActivity.showV1649OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1649own
    FeaturePrefsStore.batch1641.v1649own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1649: oxygen mode
internal fun PlayerActivity.showV1649OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1649oxygen
    FeaturePrefsStore.batch1641.v1649oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1649: oyster mode
internal fun PlayerActivity.showV1649OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1649oyster
    FeaturePrefsStore.batch1641.v1649oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1649: ozone mode
internal fun PlayerActivity.showV1649OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1649ozone
    FeaturePrefsStore.batch1641.v1649ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1649: pain mode
internal fun PlayerActivity.showV1649PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1649pain
    FeaturePrefsStore.batch1641.v1649pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1649: palace level
internal fun PlayerActivity.showV1649PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1649palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1649palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1649: palm level
internal fun PlayerActivity.showV1649PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1649palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1649palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1649: pan level
internal fun PlayerActivity.showV1649PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1649pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1649pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1649: panda level
internal fun PlayerActivity.showV1649PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1649panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1649panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1649: panic level
internal fun PlayerActivity.showV1649PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1649panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1649panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1649: panther mode
internal fun PlayerActivity.showV1649PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1649panther
    FeaturePrefsStore.batch1641.v1649panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1649: paper mode
internal fun PlayerActivity.showV1649PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1649paper
    FeaturePrefsStore.batch1641.v1649paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1649: parade mode
internal fun PlayerActivity.showV1649ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1649parade
    FeaturePrefsStore.batch1641.v1649parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1649: park mode
internal fun PlayerActivity.showV1649ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1649park
    FeaturePrefsStore.batch1641.v1649park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1649: parrot mode
internal fun PlayerActivity.showV1649ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1649parrot
    FeaturePrefsStore.batch1641.v1649parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

// v1650: own mode
internal fun PlayerActivity.showV1650OwnToggle() {
    val current = FeaturePrefsStore.batch1641.v1650own
    FeaturePrefsStore.batch1641.v1650own = !current
    AppToast.show(this, "own: ${if (!current) "ON" else "OFF"}")
}

// v1650: oxygen mode
internal fun PlayerActivity.showV1650OxygenToggle() {
    val current = FeaturePrefsStore.batch1641.v1650oxygen
    FeaturePrefsStore.batch1641.v1650oxygen = !current
    AppToast.show(this, "oxygen: ${if (!current) "ON" else "OFF"}")
}

// v1650: oyster mode
internal fun PlayerActivity.showV1650OysterToggle() {
    val current = FeaturePrefsStore.batch1641.v1650oyster
    FeaturePrefsStore.batch1641.v1650oyster = !current
    AppToast.show(this, "oyster: ${if (!current) "ON" else "OFF"}")
}

// v1650: ozone mode
internal fun PlayerActivity.showV1650OzoneToggle() {
    val current = FeaturePrefsStore.batch1641.v1650ozone
    FeaturePrefsStore.batch1641.v1650ozone = !current
    AppToast.show(this, "ozone: ${if (!current) "ON" else "OFF"}")
}

// v1650: pain mode
internal fun PlayerActivity.showV1650PainToggle() {
    val current = FeaturePrefsStore.batch1641.v1650pain
    FeaturePrefsStore.batch1641.v1650pain = !current
    AppToast.show(this, "pain: ${if (!current) "ON" else "OFF"}")
}

// v1650: palace level
internal fun PlayerActivity.showV1650PalaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1650palace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1650palace = value
        AppToast.show(this, "palace: $value")
    }
}

// v1650: palm level
internal fun PlayerActivity.showV1650PalmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1650palm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "palm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1650palm = value
        AppToast.show(this, "palm: $value")
    }
}

// v1650: pan level
internal fun PlayerActivity.showV1650PanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1650pan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1650pan = value
        AppToast.show(this, "pan: $value")
    }
}

// v1650: panda level
internal fun PlayerActivity.showV1650PandaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1650panda).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panda level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1650panda = value
        AppToast.show(this, "panda: $value")
    }
}

// v1650: panic level
internal fun PlayerActivity.showV1650PanicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1641.v1650panic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "panic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1641.v1650panic = value
        AppToast.show(this, "panic: $value")
    }
}

// v1650: panther mode
internal fun PlayerActivity.showV1650PantherToggle() {
    val current = FeaturePrefsStore.batch1641.v1650panther
    FeaturePrefsStore.batch1641.v1650panther = !current
    AppToast.show(this, "panther: ${if (!current) "ON" else "OFF"}")
}

// v1650: paper mode
internal fun PlayerActivity.showV1650PaperToggle() {
    val current = FeaturePrefsStore.batch1641.v1650paper
    FeaturePrefsStore.batch1641.v1650paper = !current
    AppToast.show(this, "paper: ${if (!current) "ON" else "OFF"}")
}

// v1650: parade mode
internal fun PlayerActivity.showV1650ParadeToggle() {
    val current = FeaturePrefsStore.batch1641.v1650parade
    FeaturePrefsStore.batch1641.v1650parade = !current
    AppToast.show(this, "parade: ${if (!current) "ON" else "OFF"}")
}

// v1650: park mode
internal fun PlayerActivity.showV1650ParkToggle() {
    val current = FeaturePrefsStore.batch1641.v1650park
    FeaturePrefsStore.batch1641.v1650park = !current
    AppToast.show(this, "park: ${if (!current) "ON" else "OFF"}")
}

// v1650: parrot mode
internal fun PlayerActivity.showV1650ParrotToggle() {
    val current = FeaturePrefsStore.batch1641.v1650parrot
    FeaturePrefsStore.batch1641.v1650parrot = !current
    AppToast.show(this, "parrot: ${if (!current) "ON" else "OFF"}")
}

