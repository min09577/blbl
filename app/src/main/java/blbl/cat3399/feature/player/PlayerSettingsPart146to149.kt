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

// v1651: party mode
internal fun PlayerActivity.showV1651PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1651party
    FeaturePrefsStore.batch1651.v1651party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1651: patient mode
internal fun PlayerActivity.showV1651PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1651patient
    FeaturePrefsStore.batch1651.v1651patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1651: patrol mode
internal fun PlayerActivity.showV1651PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1651patrol
    FeaturePrefsStore.batch1651.v1651patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1651: pave mode
internal fun PlayerActivity.showV1651PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pave
    FeaturePrefsStore.batch1651.v1651pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1651: payment mode
internal fun PlayerActivity.showV1651PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1651payment
    FeaturePrefsStore.batch1651.v1651payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1651: peace level
internal fun PlayerActivity.showV1651PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1651: peanut level
internal fun PlayerActivity.showV1651PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1651: pear level
internal fun PlayerActivity.showV1651PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1651: pearl level
internal fun PlayerActivity.showV1651PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1651: peasant level
internal fun PlayerActivity.showV1651PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1651: pelican mode
internal fun PlayerActivity.showV1651PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pelican
    FeaturePrefsStore.batch1651.v1651pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1651: pen mode
internal fun PlayerActivity.showV1651PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pen
    FeaturePrefsStore.batch1651.v1651pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1651: penalty mode
internal fun PlayerActivity.showV1651PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1651penalty
    FeaturePrefsStore.batch1651.v1651penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1651: pencil mode
internal fun PlayerActivity.showV1651PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pencil
    FeaturePrefsStore.batch1651.v1651pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1651: people mode
internal fun PlayerActivity.showV1651PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1651people
    FeaturePrefsStore.batch1651.v1651people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1652: party mode
internal fun PlayerActivity.showV1652PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1652party
    FeaturePrefsStore.batch1651.v1652party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1652: patient mode
internal fun PlayerActivity.showV1652PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1652patient
    FeaturePrefsStore.batch1651.v1652patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1652: patrol mode
internal fun PlayerActivity.showV1652PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1652patrol
    FeaturePrefsStore.batch1651.v1652patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1652: pave mode
internal fun PlayerActivity.showV1652PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pave
    FeaturePrefsStore.batch1651.v1652pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1652: payment mode
internal fun PlayerActivity.showV1652PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1652payment
    FeaturePrefsStore.batch1651.v1652payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1652: peace level
internal fun PlayerActivity.showV1652PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1652: peanut level
internal fun PlayerActivity.showV1652PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1652: pear level
internal fun PlayerActivity.showV1652PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1652: pearl level
internal fun PlayerActivity.showV1652PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1652: peasant level
internal fun PlayerActivity.showV1652PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1652: pelican mode
internal fun PlayerActivity.showV1652PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pelican
    FeaturePrefsStore.batch1651.v1652pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1652: pen mode
internal fun PlayerActivity.showV1652PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pen
    FeaturePrefsStore.batch1651.v1652pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1652: penalty mode
internal fun PlayerActivity.showV1652PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1652penalty
    FeaturePrefsStore.batch1651.v1652penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1652: pencil mode
internal fun PlayerActivity.showV1652PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pencil
    FeaturePrefsStore.batch1651.v1652pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1652: people mode
internal fun PlayerActivity.showV1652PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1652people
    FeaturePrefsStore.batch1651.v1652people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1653: party mode
internal fun PlayerActivity.showV1653PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1653party
    FeaturePrefsStore.batch1651.v1653party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1653: patient mode
internal fun PlayerActivity.showV1653PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1653patient
    FeaturePrefsStore.batch1651.v1653patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1653: patrol mode
internal fun PlayerActivity.showV1653PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1653patrol
    FeaturePrefsStore.batch1651.v1653patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1653: pave mode
internal fun PlayerActivity.showV1653PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pave
    FeaturePrefsStore.batch1651.v1653pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1653: payment mode
internal fun PlayerActivity.showV1653PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1653payment
    FeaturePrefsStore.batch1651.v1653payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1653: peace level
internal fun PlayerActivity.showV1653PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1653: peanut level
internal fun PlayerActivity.showV1653PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1653: pear level
internal fun PlayerActivity.showV1653PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1653: pearl level
internal fun PlayerActivity.showV1653PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1653: peasant level
internal fun PlayerActivity.showV1653PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1653: pelican mode
internal fun PlayerActivity.showV1653PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pelican
    FeaturePrefsStore.batch1651.v1653pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1653: pen mode
internal fun PlayerActivity.showV1653PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pen
    FeaturePrefsStore.batch1651.v1653pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1653: penalty mode
internal fun PlayerActivity.showV1653PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1653penalty
    FeaturePrefsStore.batch1651.v1653penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1653: pencil mode
internal fun PlayerActivity.showV1653PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pencil
    FeaturePrefsStore.batch1651.v1653pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1653: people mode
internal fun PlayerActivity.showV1653PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1653people
    FeaturePrefsStore.batch1651.v1653people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1654: party mode
internal fun PlayerActivity.showV1654PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1654party
    FeaturePrefsStore.batch1651.v1654party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1654: patient mode
internal fun PlayerActivity.showV1654PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1654patient
    FeaturePrefsStore.batch1651.v1654patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1654: patrol mode
internal fun PlayerActivity.showV1654PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1654patrol
    FeaturePrefsStore.batch1651.v1654patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1654: pave mode
internal fun PlayerActivity.showV1654PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pave
    FeaturePrefsStore.batch1651.v1654pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1654: payment mode
internal fun PlayerActivity.showV1654PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1654payment
    FeaturePrefsStore.batch1651.v1654payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1654: peace level
internal fun PlayerActivity.showV1654PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1654: peanut level
internal fun PlayerActivity.showV1654PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1654: pear level
internal fun PlayerActivity.showV1654PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1654: pearl level
internal fun PlayerActivity.showV1654PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1654: peasant level
internal fun PlayerActivity.showV1654PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1654: pelican mode
internal fun PlayerActivity.showV1654PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pelican
    FeaturePrefsStore.batch1651.v1654pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1654: pen mode
internal fun PlayerActivity.showV1654PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pen
    FeaturePrefsStore.batch1651.v1654pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1654: penalty mode
internal fun PlayerActivity.showV1654PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1654penalty
    FeaturePrefsStore.batch1651.v1654penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1654: pencil mode
internal fun PlayerActivity.showV1654PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pencil
    FeaturePrefsStore.batch1651.v1654pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1654: people mode
internal fun PlayerActivity.showV1654PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1654people
    FeaturePrefsStore.batch1651.v1654people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1655: party mode
internal fun PlayerActivity.showV1655PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1655party
    FeaturePrefsStore.batch1651.v1655party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1655: patient mode
internal fun PlayerActivity.showV1655PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1655patient
    FeaturePrefsStore.batch1651.v1655patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1655: patrol mode
internal fun PlayerActivity.showV1655PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1655patrol
    FeaturePrefsStore.batch1651.v1655patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1655: pave mode
internal fun PlayerActivity.showV1655PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pave
    FeaturePrefsStore.batch1651.v1655pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1655: payment mode
internal fun PlayerActivity.showV1655PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1655payment
    FeaturePrefsStore.batch1651.v1655payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1655: peace level
internal fun PlayerActivity.showV1655PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1655: peanut level
internal fun PlayerActivity.showV1655PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1655: pear level
internal fun PlayerActivity.showV1655PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1655: pearl level
internal fun PlayerActivity.showV1655PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1655: peasant level
internal fun PlayerActivity.showV1655PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1655: pelican mode
internal fun PlayerActivity.showV1655PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pelican
    FeaturePrefsStore.batch1651.v1655pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1655: pen mode
internal fun PlayerActivity.showV1655PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pen
    FeaturePrefsStore.batch1651.v1655pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1655: penalty mode
internal fun PlayerActivity.showV1655PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1655penalty
    FeaturePrefsStore.batch1651.v1655penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1655: pencil mode
internal fun PlayerActivity.showV1655PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pencil
    FeaturePrefsStore.batch1651.v1655pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1655: people mode
internal fun PlayerActivity.showV1655PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1655people
    FeaturePrefsStore.batch1651.v1655people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1656: party mode
internal fun PlayerActivity.showV1656PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1656party
    FeaturePrefsStore.batch1651.v1656party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1656: patient mode
internal fun PlayerActivity.showV1656PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1656patient
    FeaturePrefsStore.batch1651.v1656patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1656: patrol mode
internal fun PlayerActivity.showV1656PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1656patrol
    FeaturePrefsStore.batch1651.v1656patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1656: pave mode
internal fun PlayerActivity.showV1656PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pave
    FeaturePrefsStore.batch1651.v1656pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1656: payment mode
internal fun PlayerActivity.showV1656PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1656payment
    FeaturePrefsStore.batch1651.v1656payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1656: peace level
internal fun PlayerActivity.showV1656PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1656: peanut level
internal fun PlayerActivity.showV1656PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1656: pear level
internal fun PlayerActivity.showV1656PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1656: pearl level
internal fun PlayerActivity.showV1656PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1656: peasant level
internal fun PlayerActivity.showV1656PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1656: pelican mode
internal fun PlayerActivity.showV1656PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pelican
    FeaturePrefsStore.batch1651.v1656pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1656: pen mode
internal fun PlayerActivity.showV1656PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pen
    FeaturePrefsStore.batch1651.v1656pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1656: penalty mode
internal fun PlayerActivity.showV1656PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1656penalty
    FeaturePrefsStore.batch1651.v1656penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1656: pencil mode
internal fun PlayerActivity.showV1656PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pencil
    FeaturePrefsStore.batch1651.v1656pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1656: people mode
internal fun PlayerActivity.showV1656PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1656people
    FeaturePrefsStore.batch1651.v1656people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1657: party mode
internal fun PlayerActivity.showV1657PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1657party
    FeaturePrefsStore.batch1651.v1657party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1657: patient mode
internal fun PlayerActivity.showV1657PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1657patient
    FeaturePrefsStore.batch1651.v1657patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1657: patrol mode
internal fun PlayerActivity.showV1657PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1657patrol
    FeaturePrefsStore.batch1651.v1657patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1657: pave mode
internal fun PlayerActivity.showV1657PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pave
    FeaturePrefsStore.batch1651.v1657pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1657: payment mode
internal fun PlayerActivity.showV1657PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1657payment
    FeaturePrefsStore.batch1651.v1657payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1657: peace level
internal fun PlayerActivity.showV1657PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1657: peanut level
internal fun PlayerActivity.showV1657PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1657: pear level
internal fun PlayerActivity.showV1657PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1657: pearl level
internal fun PlayerActivity.showV1657PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1657: peasant level
internal fun PlayerActivity.showV1657PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1657: pelican mode
internal fun PlayerActivity.showV1657PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pelican
    FeaturePrefsStore.batch1651.v1657pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1657: pen mode
internal fun PlayerActivity.showV1657PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pen
    FeaturePrefsStore.batch1651.v1657pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1657: penalty mode
internal fun PlayerActivity.showV1657PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1657penalty
    FeaturePrefsStore.batch1651.v1657penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1657: pencil mode
internal fun PlayerActivity.showV1657PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pencil
    FeaturePrefsStore.batch1651.v1657pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1657: people mode
internal fun PlayerActivity.showV1657PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1657people
    FeaturePrefsStore.batch1651.v1657people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1658: party mode
internal fun PlayerActivity.showV1658PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1658party
    FeaturePrefsStore.batch1651.v1658party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1658: patient mode
internal fun PlayerActivity.showV1658PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1658patient
    FeaturePrefsStore.batch1651.v1658patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1658: patrol mode
internal fun PlayerActivity.showV1658PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1658patrol
    FeaturePrefsStore.batch1651.v1658patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1658: pave mode
internal fun PlayerActivity.showV1658PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pave
    FeaturePrefsStore.batch1651.v1658pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1658: payment mode
internal fun PlayerActivity.showV1658PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1658payment
    FeaturePrefsStore.batch1651.v1658payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1658: peace level
internal fun PlayerActivity.showV1658PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1658: peanut level
internal fun PlayerActivity.showV1658PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1658: pear level
internal fun PlayerActivity.showV1658PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1658: pearl level
internal fun PlayerActivity.showV1658PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1658: peasant level
internal fun PlayerActivity.showV1658PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1658: pelican mode
internal fun PlayerActivity.showV1658PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pelican
    FeaturePrefsStore.batch1651.v1658pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1658: pen mode
internal fun PlayerActivity.showV1658PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pen
    FeaturePrefsStore.batch1651.v1658pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1658: penalty mode
internal fun PlayerActivity.showV1658PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1658penalty
    FeaturePrefsStore.batch1651.v1658penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1658: pencil mode
internal fun PlayerActivity.showV1658PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pencil
    FeaturePrefsStore.batch1651.v1658pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1658: people mode
internal fun PlayerActivity.showV1658PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1658people
    FeaturePrefsStore.batch1651.v1658people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1659: party mode
internal fun PlayerActivity.showV1659PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1659party
    FeaturePrefsStore.batch1651.v1659party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1659: patient mode
internal fun PlayerActivity.showV1659PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1659patient
    FeaturePrefsStore.batch1651.v1659patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1659: patrol mode
internal fun PlayerActivity.showV1659PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1659patrol
    FeaturePrefsStore.batch1651.v1659patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1659: pave mode
internal fun PlayerActivity.showV1659PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pave
    FeaturePrefsStore.batch1651.v1659pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1659: payment mode
internal fun PlayerActivity.showV1659PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1659payment
    FeaturePrefsStore.batch1651.v1659payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1659: peace level
internal fun PlayerActivity.showV1659PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1659: peanut level
internal fun PlayerActivity.showV1659PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1659: pear level
internal fun PlayerActivity.showV1659PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1659: pearl level
internal fun PlayerActivity.showV1659PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1659: peasant level
internal fun PlayerActivity.showV1659PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1659: pelican mode
internal fun PlayerActivity.showV1659PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pelican
    FeaturePrefsStore.batch1651.v1659pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1659: pen mode
internal fun PlayerActivity.showV1659PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pen
    FeaturePrefsStore.batch1651.v1659pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1659: penalty mode
internal fun PlayerActivity.showV1659PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1659penalty
    FeaturePrefsStore.batch1651.v1659penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1659: pencil mode
internal fun PlayerActivity.showV1659PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pencil
    FeaturePrefsStore.batch1651.v1659pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1659: people mode
internal fun PlayerActivity.showV1659PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1659people
    FeaturePrefsStore.batch1651.v1659people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1660: party mode
internal fun PlayerActivity.showV1660PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1660party
    FeaturePrefsStore.batch1651.v1660party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1660: patient mode
internal fun PlayerActivity.showV1660PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1660patient
    FeaturePrefsStore.batch1651.v1660patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1660: patrol mode
internal fun PlayerActivity.showV1660PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1660patrol
    FeaturePrefsStore.batch1651.v1660patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1660: pave mode
internal fun PlayerActivity.showV1660PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pave
    FeaturePrefsStore.batch1651.v1660pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1660: payment mode
internal fun PlayerActivity.showV1660PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1660payment
    FeaturePrefsStore.batch1651.v1660payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1660: peace level
internal fun PlayerActivity.showV1660PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1660: peanut level
internal fun PlayerActivity.showV1660PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1660: pear level
internal fun PlayerActivity.showV1660PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1660: pearl level
internal fun PlayerActivity.showV1660PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1660: peasant level
internal fun PlayerActivity.showV1660PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1660: pelican mode
internal fun PlayerActivity.showV1660PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pelican
    FeaturePrefsStore.batch1651.v1660pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1660: pen mode
internal fun PlayerActivity.showV1660PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pen
    FeaturePrefsStore.batch1651.v1660pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1660: penalty mode
internal fun PlayerActivity.showV1660PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1660penalty
    FeaturePrefsStore.batch1651.v1660penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1660: pencil mode
internal fun PlayerActivity.showV1660PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pencil
    FeaturePrefsStore.batch1651.v1660pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1660: people mode
internal fun PlayerActivity.showV1660PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1660people
    FeaturePrefsStore.batch1651.v1660people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1661: pepper mode
internal fun PlayerActivity.showV1661PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pepper
    FeaturePrefsStore.batch1661.v1661pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1661: perfect mode
internal fun PlayerActivity.showV1661PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1661perfect
    FeaturePrefsStore.batch1661.v1661perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1661: permit mode
internal fun PlayerActivity.showV1661PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1661permit
    FeaturePrefsStore.batch1661.v1661permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1661: person mode
internal fun PlayerActivity.showV1661PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1661person
    FeaturePrefsStore.batch1661.v1661person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1661: pet mode
internal fun PlayerActivity.showV1661PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pet
    FeaturePrefsStore.batch1661.v1661pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1661: physical level
internal fun PlayerActivity.showV1661PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1661: piano level
internal fun PlayerActivity.showV1661PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1661: picnic level
internal fun PlayerActivity.showV1661PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1661: piece level
internal fun PlayerActivity.showV1661PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1661: pig level
internal fun PlayerActivity.showV1661PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1661: pigeon mode
internal fun PlayerActivity.showV1661PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pigeon
    FeaturePrefsStore.batch1661.v1661pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1661: pill mode
internal fun PlayerActivity.showV1661PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pill
    FeaturePrefsStore.batch1661.v1661pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1661: pilot mode
internal fun PlayerActivity.showV1661PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pilot
    FeaturePrefsStore.batch1661.v1661pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1661: pink mode
internal fun PlayerActivity.showV1661PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pink
    FeaturePrefsStore.batch1661.v1661pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1661: pioneer mode
internal fun PlayerActivity.showV1661PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pioneer
    FeaturePrefsStore.batch1661.v1661pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1662: pepper mode
internal fun PlayerActivity.showV1662PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pepper
    FeaturePrefsStore.batch1661.v1662pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1662: perfect mode
internal fun PlayerActivity.showV1662PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1662perfect
    FeaturePrefsStore.batch1661.v1662perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1662: permit mode
internal fun PlayerActivity.showV1662PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1662permit
    FeaturePrefsStore.batch1661.v1662permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1662: person mode
internal fun PlayerActivity.showV1662PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1662person
    FeaturePrefsStore.batch1661.v1662person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1662: pet mode
internal fun PlayerActivity.showV1662PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pet
    FeaturePrefsStore.batch1661.v1662pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1662: physical level
internal fun PlayerActivity.showV1662PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1662: piano level
internal fun PlayerActivity.showV1662PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1662: picnic level
internal fun PlayerActivity.showV1662PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1662: piece level
internal fun PlayerActivity.showV1662PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1662: pig level
internal fun PlayerActivity.showV1662PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1662: pigeon mode
internal fun PlayerActivity.showV1662PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pigeon
    FeaturePrefsStore.batch1661.v1662pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1662: pill mode
internal fun PlayerActivity.showV1662PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pill
    FeaturePrefsStore.batch1661.v1662pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1662: pilot mode
internal fun PlayerActivity.showV1662PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pilot
    FeaturePrefsStore.batch1661.v1662pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1662: pink mode
internal fun PlayerActivity.showV1662PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pink
    FeaturePrefsStore.batch1661.v1662pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1662: pioneer mode
internal fun PlayerActivity.showV1662PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pioneer
    FeaturePrefsStore.batch1661.v1662pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1663: pepper mode
internal fun PlayerActivity.showV1663PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pepper
    FeaturePrefsStore.batch1661.v1663pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1663: perfect mode
internal fun PlayerActivity.showV1663PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1663perfect
    FeaturePrefsStore.batch1661.v1663perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1663: permit mode
internal fun PlayerActivity.showV1663PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1663permit
    FeaturePrefsStore.batch1661.v1663permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1663: person mode
internal fun PlayerActivity.showV1663PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1663person
    FeaturePrefsStore.batch1661.v1663person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1663: pet mode
internal fun PlayerActivity.showV1663PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pet
    FeaturePrefsStore.batch1661.v1663pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1663: physical level
internal fun PlayerActivity.showV1663PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1663: piano level
internal fun PlayerActivity.showV1663PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1663: picnic level
internal fun PlayerActivity.showV1663PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1663: piece level
internal fun PlayerActivity.showV1663PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1663: pig level
internal fun PlayerActivity.showV1663PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1663: pigeon mode
internal fun PlayerActivity.showV1663PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pigeon
    FeaturePrefsStore.batch1661.v1663pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1663: pill mode
internal fun PlayerActivity.showV1663PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pill
    FeaturePrefsStore.batch1661.v1663pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1663: pilot mode
internal fun PlayerActivity.showV1663PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pilot
    FeaturePrefsStore.batch1661.v1663pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1663: pink mode
internal fun PlayerActivity.showV1663PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pink
    FeaturePrefsStore.batch1661.v1663pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1663: pioneer mode
internal fun PlayerActivity.showV1663PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pioneer
    FeaturePrefsStore.batch1661.v1663pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1664: pepper mode
internal fun PlayerActivity.showV1664PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pepper
    FeaturePrefsStore.batch1661.v1664pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1664: perfect mode
internal fun PlayerActivity.showV1664PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1664perfect
    FeaturePrefsStore.batch1661.v1664perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1664: permit mode
internal fun PlayerActivity.showV1664PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1664permit
    FeaturePrefsStore.batch1661.v1664permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1664: person mode
internal fun PlayerActivity.showV1664PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1664person
    FeaturePrefsStore.batch1661.v1664person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1664: pet mode
internal fun PlayerActivity.showV1664PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pet
    FeaturePrefsStore.batch1661.v1664pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1664: physical level
internal fun PlayerActivity.showV1664PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1664: piano level
internal fun PlayerActivity.showV1664PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1664: picnic level
internal fun PlayerActivity.showV1664PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1664: piece level
internal fun PlayerActivity.showV1664PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1664: pig level
internal fun PlayerActivity.showV1664PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1664: pigeon mode
internal fun PlayerActivity.showV1664PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pigeon
    FeaturePrefsStore.batch1661.v1664pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1664: pill mode
internal fun PlayerActivity.showV1664PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pill
    FeaturePrefsStore.batch1661.v1664pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1664: pilot mode
internal fun PlayerActivity.showV1664PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pilot
    FeaturePrefsStore.batch1661.v1664pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1664: pink mode
internal fun PlayerActivity.showV1664PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pink
    FeaturePrefsStore.batch1661.v1664pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1664: pioneer mode
internal fun PlayerActivity.showV1664PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pioneer
    FeaturePrefsStore.batch1661.v1664pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1665: pepper mode
internal fun PlayerActivity.showV1665PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pepper
    FeaturePrefsStore.batch1661.v1665pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1665: perfect mode
internal fun PlayerActivity.showV1665PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1665perfect
    FeaturePrefsStore.batch1661.v1665perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1665: permit mode
internal fun PlayerActivity.showV1665PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1665permit
    FeaturePrefsStore.batch1661.v1665permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1665: person mode
internal fun PlayerActivity.showV1665PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1665person
    FeaturePrefsStore.batch1661.v1665person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1665: pet mode
internal fun PlayerActivity.showV1665PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pet
    FeaturePrefsStore.batch1661.v1665pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1665: physical level
internal fun PlayerActivity.showV1665PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1665: piano level
internal fun PlayerActivity.showV1665PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1665: picnic level
internal fun PlayerActivity.showV1665PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1665: piece level
internal fun PlayerActivity.showV1665PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1665: pig level
internal fun PlayerActivity.showV1665PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1665: pigeon mode
internal fun PlayerActivity.showV1665PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pigeon
    FeaturePrefsStore.batch1661.v1665pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1665: pill mode
internal fun PlayerActivity.showV1665PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pill
    FeaturePrefsStore.batch1661.v1665pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1665: pilot mode
internal fun PlayerActivity.showV1665PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pilot
    FeaturePrefsStore.batch1661.v1665pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1665: pink mode
internal fun PlayerActivity.showV1665PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pink
    FeaturePrefsStore.batch1661.v1665pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1665: pioneer mode
internal fun PlayerActivity.showV1665PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pioneer
    FeaturePrefsStore.batch1661.v1665pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1666: pepper mode
internal fun PlayerActivity.showV1666PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pepper
    FeaturePrefsStore.batch1661.v1666pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1666: perfect mode
internal fun PlayerActivity.showV1666PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1666perfect
    FeaturePrefsStore.batch1661.v1666perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1666: permit mode
internal fun PlayerActivity.showV1666PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1666permit
    FeaturePrefsStore.batch1661.v1666permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1666: person mode
internal fun PlayerActivity.showV1666PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1666person
    FeaturePrefsStore.batch1661.v1666person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1666: pet mode
internal fun PlayerActivity.showV1666PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pet
    FeaturePrefsStore.batch1661.v1666pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1666: physical level
internal fun PlayerActivity.showV1666PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1666: piano level
internal fun PlayerActivity.showV1666PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1666: picnic level
internal fun PlayerActivity.showV1666PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1666: piece level
internal fun PlayerActivity.showV1666PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1666: pig level
internal fun PlayerActivity.showV1666PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1666: pigeon mode
internal fun PlayerActivity.showV1666PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pigeon
    FeaturePrefsStore.batch1661.v1666pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1666: pill mode
internal fun PlayerActivity.showV1666PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pill
    FeaturePrefsStore.batch1661.v1666pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1666: pilot mode
internal fun PlayerActivity.showV1666PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pilot
    FeaturePrefsStore.batch1661.v1666pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1666: pink mode
internal fun PlayerActivity.showV1666PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pink
    FeaturePrefsStore.batch1661.v1666pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1666: pioneer mode
internal fun PlayerActivity.showV1666PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pioneer
    FeaturePrefsStore.batch1661.v1666pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1667: pepper mode
internal fun PlayerActivity.showV1667PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pepper
    FeaturePrefsStore.batch1661.v1667pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1667: perfect mode
internal fun PlayerActivity.showV1667PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1667perfect
    FeaturePrefsStore.batch1661.v1667perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1667: permit mode
internal fun PlayerActivity.showV1667PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1667permit
    FeaturePrefsStore.batch1661.v1667permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1667: person mode
internal fun PlayerActivity.showV1667PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1667person
    FeaturePrefsStore.batch1661.v1667person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1667: pet mode
internal fun PlayerActivity.showV1667PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pet
    FeaturePrefsStore.batch1661.v1667pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1667: physical level
internal fun PlayerActivity.showV1667PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1667: piano level
internal fun PlayerActivity.showV1667PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1667: picnic level
internal fun PlayerActivity.showV1667PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1667: piece level
internal fun PlayerActivity.showV1667PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1667: pig level
internal fun PlayerActivity.showV1667PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1667: pigeon mode
internal fun PlayerActivity.showV1667PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pigeon
    FeaturePrefsStore.batch1661.v1667pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1667: pill mode
internal fun PlayerActivity.showV1667PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pill
    FeaturePrefsStore.batch1661.v1667pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1667: pilot mode
internal fun PlayerActivity.showV1667PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pilot
    FeaturePrefsStore.batch1661.v1667pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1667: pink mode
internal fun PlayerActivity.showV1667PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pink
    FeaturePrefsStore.batch1661.v1667pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1667: pioneer mode
internal fun PlayerActivity.showV1667PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pioneer
    FeaturePrefsStore.batch1661.v1667pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1668: pepper mode
internal fun PlayerActivity.showV1668PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pepper
    FeaturePrefsStore.batch1661.v1668pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1668: perfect mode
internal fun PlayerActivity.showV1668PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1668perfect
    FeaturePrefsStore.batch1661.v1668perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1668: permit mode
internal fun PlayerActivity.showV1668PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1668permit
    FeaturePrefsStore.batch1661.v1668permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1668: person mode
internal fun PlayerActivity.showV1668PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1668person
    FeaturePrefsStore.batch1661.v1668person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1668: pet mode
internal fun PlayerActivity.showV1668PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pet
    FeaturePrefsStore.batch1661.v1668pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1668: physical level
internal fun PlayerActivity.showV1668PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1668: piano level
internal fun PlayerActivity.showV1668PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1668: picnic level
internal fun PlayerActivity.showV1668PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1668: piece level
internal fun PlayerActivity.showV1668PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1668: pig level
internal fun PlayerActivity.showV1668PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1668: pigeon mode
internal fun PlayerActivity.showV1668PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pigeon
    FeaturePrefsStore.batch1661.v1668pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1668: pill mode
internal fun PlayerActivity.showV1668PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pill
    FeaturePrefsStore.batch1661.v1668pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1668: pilot mode
internal fun PlayerActivity.showV1668PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pilot
    FeaturePrefsStore.batch1661.v1668pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1668: pink mode
internal fun PlayerActivity.showV1668PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pink
    FeaturePrefsStore.batch1661.v1668pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1668: pioneer mode
internal fun PlayerActivity.showV1668PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pioneer
    FeaturePrefsStore.batch1661.v1668pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1669: pepper mode
internal fun PlayerActivity.showV1669PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pepper
    FeaturePrefsStore.batch1661.v1669pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1669: perfect mode
internal fun PlayerActivity.showV1669PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1669perfect
    FeaturePrefsStore.batch1661.v1669perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1669: permit mode
internal fun PlayerActivity.showV1669PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1669permit
    FeaturePrefsStore.batch1661.v1669permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1669: person mode
internal fun PlayerActivity.showV1669PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1669person
    FeaturePrefsStore.batch1661.v1669person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1669: pet mode
internal fun PlayerActivity.showV1669PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pet
    FeaturePrefsStore.batch1661.v1669pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1669: physical level
internal fun PlayerActivity.showV1669PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1669: piano level
internal fun PlayerActivity.showV1669PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1669: picnic level
internal fun PlayerActivity.showV1669PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1669: piece level
internal fun PlayerActivity.showV1669PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1669: pig level
internal fun PlayerActivity.showV1669PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1669: pigeon mode
internal fun PlayerActivity.showV1669PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pigeon
    FeaturePrefsStore.batch1661.v1669pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1669: pill mode
internal fun PlayerActivity.showV1669PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pill
    FeaturePrefsStore.batch1661.v1669pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1669: pilot mode
internal fun PlayerActivity.showV1669PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pilot
    FeaturePrefsStore.batch1661.v1669pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1669: pink mode
internal fun PlayerActivity.showV1669PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pink
    FeaturePrefsStore.batch1661.v1669pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1669: pioneer mode
internal fun PlayerActivity.showV1669PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pioneer
    FeaturePrefsStore.batch1661.v1669pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1670: pepper mode
internal fun PlayerActivity.showV1670PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pepper
    FeaturePrefsStore.batch1661.v1670pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1670: perfect mode
internal fun PlayerActivity.showV1670PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1670perfect
    FeaturePrefsStore.batch1661.v1670perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1670: permit mode
internal fun PlayerActivity.showV1670PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1670permit
    FeaturePrefsStore.batch1661.v1670permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1670: person mode
internal fun PlayerActivity.showV1670PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1670person
    FeaturePrefsStore.batch1661.v1670person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1670: pet mode
internal fun PlayerActivity.showV1670PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pet
    FeaturePrefsStore.batch1661.v1670pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1670: physical level
internal fun PlayerActivity.showV1670PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1670: piano level
internal fun PlayerActivity.showV1670PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1670: picnic level
internal fun PlayerActivity.showV1670PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1670: piece level
internal fun PlayerActivity.showV1670PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1670: pig level
internal fun PlayerActivity.showV1670PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1670: pigeon mode
internal fun PlayerActivity.showV1670PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pigeon
    FeaturePrefsStore.batch1661.v1670pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1670: pill mode
internal fun PlayerActivity.showV1670PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pill
    FeaturePrefsStore.batch1661.v1670pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1670: pilot mode
internal fun PlayerActivity.showV1670PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pilot
    FeaturePrefsStore.batch1661.v1670pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1670: pink mode
internal fun PlayerActivity.showV1670PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pink
    FeaturePrefsStore.batch1661.v1670pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1670: pioneer mode
internal fun PlayerActivity.showV1670PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pioneer
    FeaturePrefsStore.batch1661.v1670pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1671: pistol mode
internal fun PlayerActivity.showV1671PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pistol
    FeaturePrefsStore.batch1671.v1671pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1671: pizza mode
internal fun PlayerActivity.showV1671PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pizza
    FeaturePrefsStore.batch1671.v1671pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1671: planet mode
internal fun PlayerActivity.showV1671PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1671planet
    FeaturePrefsStore.batch1671.v1671planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1671: plastic mode
internal fun PlayerActivity.showV1671PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1671plastic
    FeaturePrefsStore.batch1671.v1671plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1671: plate mode
internal fun PlayerActivity.showV1671PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1671plate
    FeaturePrefsStore.batch1671.v1671plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1671: please level
internal fun PlayerActivity.showV1671PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671please = value
        AppToast.show(this, "please: $value")
    }
}

// v1671: pledge level
internal fun PlayerActivity.showV1671PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1671: pluck level
internal fun PlayerActivity.showV1671PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1671: plug level
internal fun PlayerActivity.showV1671PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1671: plunge level
internal fun PlayerActivity.showV1671PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1671plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1671plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1671: poem mode
internal fun PlayerActivity.showV1671PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1671poem
    FeaturePrefsStore.batch1671.v1671poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1671: poet mode
internal fun PlayerActivity.showV1671PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1671poet
    FeaturePrefsStore.batch1671.v1671poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1671: point mode
internal fun PlayerActivity.showV1671PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1671point
    FeaturePrefsStore.batch1671.v1671point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1671: polar mode
internal fun PlayerActivity.showV1671PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1671polar
    FeaturePrefsStore.batch1671.v1671polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1671: pole mode
internal fun PlayerActivity.showV1671PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1671pole
    FeaturePrefsStore.batch1671.v1671pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1672: pistol mode
internal fun PlayerActivity.showV1672PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pistol
    FeaturePrefsStore.batch1671.v1672pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1672: pizza mode
internal fun PlayerActivity.showV1672PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pizza
    FeaturePrefsStore.batch1671.v1672pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1672: planet mode
internal fun PlayerActivity.showV1672PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1672planet
    FeaturePrefsStore.batch1671.v1672planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1672: plastic mode
internal fun PlayerActivity.showV1672PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1672plastic
    FeaturePrefsStore.batch1671.v1672plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1672: plate mode
internal fun PlayerActivity.showV1672PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1672plate
    FeaturePrefsStore.batch1671.v1672plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1672: please level
internal fun PlayerActivity.showV1672PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672please = value
        AppToast.show(this, "please: $value")
    }
}

// v1672: pledge level
internal fun PlayerActivity.showV1672PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1672: pluck level
internal fun PlayerActivity.showV1672PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1672: plug level
internal fun PlayerActivity.showV1672PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1672: plunge level
internal fun PlayerActivity.showV1672PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1672plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1672plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1672: poem mode
internal fun PlayerActivity.showV1672PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1672poem
    FeaturePrefsStore.batch1671.v1672poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1672: poet mode
internal fun PlayerActivity.showV1672PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1672poet
    FeaturePrefsStore.batch1671.v1672poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1672: point mode
internal fun PlayerActivity.showV1672PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1672point
    FeaturePrefsStore.batch1671.v1672point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1672: polar mode
internal fun PlayerActivity.showV1672PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1672polar
    FeaturePrefsStore.batch1671.v1672polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1672: pole mode
internal fun PlayerActivity.showV1672PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1672pole
    FeaturePrefsStore.batch1671.v1672pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1673: pistol mode
internal fun PlayerActivity.showV1673PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pistol
    FeaturePrefsStore.batch1671.v1673pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1673: pizza mode
internal fun PlayerActivity.showV1673PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pizza
    FeaturePrefsStore.batch1671.v1673pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1673: planet mode
internal fun PlayerActivity.showV1673PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1673planet
    FeaturePrefsStore.batch1671.v1673planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1673: plastic mode
internal fun PlayerActivity.showV1673PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1673plastic
    FeaturePrefsStore.batch1671.v1673plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1673: plate mode
internal fun PlayerActivity.showV1673PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1673plate
    FeaturePrefsStore.batch1671.v1673plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1673: please level
internal fun PlayerActivity.showV1673PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673please = value
        AppToast.show(this, "please: $value")
    }
}

// v1673: pledge level
internal fun PlayerActivity.showV1673PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1673: pluck level
internal fun PlayerActivity.showV1673PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1673: plug level
internal fun PlayerActivity.showV1673PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1673: plunge level
internal fun PlayerActivity.showV1673PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1673plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1673plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1673: poem mode
internal fun PlayerActivity.showV1673PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1673poem
    FeaturePrefsStore.batch1671.v1673poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1673: poet mode
internal fun PlayerActivity.showV1673PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1673poet
    FeaturePrefsStore.batch1671.v1673poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1673: point mode
internal fun PlayerActivity.showV1673PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1673point
    FeaturePrefsStore.batch1671.v1673point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1673: polar mode
internal fun PlayerActivity.showV1673PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1673polar
    FeaturePrefsStore.batch1671.v1673polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1673: pole mode
internal fun PlayerActivity.showV1673PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1673pole
    FeaturePrefsStore.batch1671.v1673pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1674: pistol mode
internal fun PlayerActivity.showV1674PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pistol
    FeaturePrefsStore.batch1671.v1674pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1674: pizza mode
internal fun PlayerActivity.showV1674PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pizza
    FeaturePrefsStore.batch1671.v1674pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1674: planet mode
internal fun PlayerActivity.showV1674PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1674planet
    FeaturePrefsStore.batch1671.v1674planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1674: plastic mode
internal fun PlayerActivity.showV1674PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1674plastic
    FeaturePrefsStore.batch1671.v1674plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1674: plate mode
internal fun PlayerActivity.showV1674PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1674plate
    FeaturePrefsStore.batch1671.v1674plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1674: please level
internal fun PlayerActivity.showV1674PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674please = value
        AppToast.show(this, "please: $value")
    }
}

// v1674: pledge level
internal fun PlayerActivity.showV1674PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1674: pluck level
internal fun PlayerActivity.showV1674PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1674: plug level
internal fun PlayerActivity.showV1674PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1674: plunge level
internal fun PlayerActivity.showV1674PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1674plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1674plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1674: poem mode
internal fun PlayerActivity.showV1674PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1674poem
    FeaturePrefsStore.batch1671.v1674poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1674: poet mode
internal fun PlayerActivity.showV1674PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1674poet
    FeaturePrefsStore.batch1671.v1674poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1674: point mode
internal fun PlayerActivity.showV1674PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1674point
    FeaturePrefsStore.batch1671.v1674point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1674: polar mode
internal fun PlayerActivity.showV1674PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1674polar
    FeaturePrefsStore.batch1671.v1674polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1674: pole mode
internal fun PlayerActivity.showV1674PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1674pole
    FeaturePrefsStore.batch1671.v1674pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1675: pistol mode
internal fun PlayerActivity.showV1675PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pistol
    FeaturePrefsStore.batch1671.v1675pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1675: pizza mode
internal fun PlayerActivity.showV1675PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pizza
    FeaturePrefsStore.batch1671.v1675pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1675: planet mode
internal fun PlayerActivity.showV1675PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1675planet
    FeaturePrefsStore.batch1671.v1675planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1675: plastic mode
internal fun PlayerActivity.showV1675PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1675plastic
    FeaturePrefsStore.batch1671.v1675plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1675: plate mode
internal fun PlayerActivity.showV1675PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1675plate
    FeaturePrefsStore.batch1671.v1675plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1675: please level
internal fun PlayerActivity.showV1675PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675please = value
        AppToast.show(this, "please: $value")
    }
}

// v1675: pledge level
internal fun PlayerActivity.showV1675PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1675: pluck level
internal fun PlayerActivity.showV1675PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1675: plug level
internal fun PlayerActivity.showV1675PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1675: plunge level
internal fun PlayerActivity.showV1675PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1675plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1675plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1675: poem mode
internal fun PlayerActivity.showV1675PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1675poem
    FeaturePrefsStore.batch1671.v1675poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1675: poet mode
internal fun PlayerActivity.showV1675PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1675poet
    FeaturePrefsStore.batch1671.v1675poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1675: point mode
internal fun PlayerActivity.showV1675PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1675point
    FeaturePrefsStore.batch1671.v1675point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1675: polar mode
internal fun PlayerActivity.showV1675PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1675polar
    FeaturePrefsStore.batch1671.v1675polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1675: pole mode
internal fun PlayerActivity.showV1675PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1675pole
    FeaturePrefsStore.batch1671.v1675pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1676: pistol mode
internal fun PlayerActivity.showV1676PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pistol
    FeaturePrefsStore.batch1671.v1676pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1676: pizza mode
internal fun PlayerActivity.showV1676PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pizza
    FeaturePrefsStore.batch1671.v1676pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1676: planet mode
internal fun PlayerActivity.showV1676PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1676planet
    FeaturePrefsStore.batch1671.v1676planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1676: plastic mode
internal fun PlayerActivity.showV1676PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1676plastic
    FeaturePrefsStore.batch1671.v1676plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1676: plate mode
internal fun PlayerActivity.showV1676PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1676plate
    FeaturePrefsStore.batch1671.v1676plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1676: please level
internal fun PlayerActivity.showV1676PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676please = value
        AppToast.show(this, "please: $value")
    }
}

// v1676: pledge level
internal fun PlayerActivity.showV1676PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1676: pluck level
internal fun PlayerActivity.showV1676PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1676: plug level
internal fun PlayerActivity.showV1676PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1676: plunge level
internal fun PlayerActivity.showV1676PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1676plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1676plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1676: poem mode
internal fun PlayerActivity.showV1676PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1676poem
    FeaturePrefsStore.batch1671.v1676poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1676: poet mode
internal fun PlayerActivity.showV1676PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1676poet
    FeaturePrefsStore.batch1671.v1676poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1676: point mode
internal fun PlayerActivity.showV1676PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1676point
    FeaturePrefsStore.batch1671.v1676point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1676: polar mode
internal fun PlayerActivity.showV1676PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1676polar
    FeaturePrefsStore.batch1671.v1676polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1676: pole mode
internal fun PlayerActivity.showV1676PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1676pole
    FeaturePrefsStore.batch1671.v1676pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1677: pistol mode
internal fun PlayerActivity.showV1677PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pistol
    FeaturePrefsStore.batch1671.v1677pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1677: pizza mode
internal fun PlayerActivity.showV1677PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pizza
    FeaturePrefsStore.batch1671.v1677pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1677: planet mode
internal fun PlayerActivity.showV1677PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1677planet
    FeaturePrefsStore.batch1671.v1677planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1677: plastic mode
internal fun PlayerActivity.showV1677PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1677plastic
    FeaturePrefsStore.batch1671.v1677plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1677: plate mode
internal fun PlayerActivity.showV1677PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1677plate
    FeaturePrefsStore.batch1671.v1677plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1677: please level
internal fun PlayerActivity.showV1677PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677please = value
        AppToast.show(this, "please: $value")
    }
}

// v1677: pledge level
internal fun PlayerActivity.showV1677PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1677: pluck level
internal fun PlayerActivity.showV1677PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1677: plug level
internal fun PlayerActivity.showV1677PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1677: plunge level
internal fun PlayerActivity.showV1677PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1677plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1677plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1677: poem mode
internal fun PlayerActivity.showV1677PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1677poem
    FeaturePrefsStore.batch1671.v1677poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1677: poet mode
internal fun PlayerActivity.showV1677PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1677poet
    FeaturePrefsStore.batch1671.v1677poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1677: point mode
internal fun PlayerActivity.showV1677PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1677point
    FeaturePrefsStore.batch1671.v1677point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1677: polar mode
internal fun PlayerActivity.showV1677PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1677polar
    FeaturePrefsStore.batch1671.v1677polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1677: pole mode
internal fun PlayerActivity.showV1677PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1677pole
    FeaturePrefsStore.batch1671.v1677pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1678: pistol mode
internal fun PlayerActivity.showV1678PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pistol
    FeaturePrefsStore.batch1671.v1678pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1678: pizza mode
internal fun PlayerActivity.showV1678PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pizza
    FeaturePrefsStore.batch1671.v1678pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1678: planet mode
internal fun PlayerActivity.showV1678PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1678planet
    FeaturePrefsStore.batch1671.v1678planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1678: plastic mode
internal fun PlayerActivity.showV1678PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1678plastic
    FeaturePrefsStore.batch1671.v1678plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1678: plate mode
internal fun PlayerActivity.showV1678PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1678plate
    FeaturePrefsStore.batch1671.v1678plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1678: please level
internal fun PlayerActivity.showV1678PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678please = value
        AppToast.show(this, "please: $value")
    }
}

// v1678: pledge level
internal fun PlayerActivity.showV1678PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1678: pluck level
internal fun PlayerActivity.showV1678PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1678: plug level
internal fun PlayerActivity.showV1678PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1678: plunge level
internal fun PlayerActivity.showV1678PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1678plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1678plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1678: poem mode
internal fun PlayerActivity.showV1678PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1678poem
    FeaturePrefsStore.batch1671.v1678poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1678: poet mode
internal fun PlayerActivity.showV1678PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1678poet
    FeaturePrefsStore.batch1671.v1678poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1678: point mode
internal fun PlayerActivity.showV1678PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1678point
    FeaturePrefsStore.batch1671.v1678point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1678: polar mode
internal fun PlayerActivity.showV1678PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1678polar
    FeaturePrefsStore.batch1671.v1678polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1678: pole mode
internal fun PlayerActivity.showV1678PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1678pole
    FeaturePrefsStore.batch1671.v1678pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1679: pistol mode
internal fun PlayerActivity.showV1679PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pistol
    FeaturePrefsStore.batch1671.v1679pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1679: pizza mode
internal fun PlayerActivity.showV1679PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pizza
    FeaturePrefsStore.batch1671.v1679pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1679: planet mode
internal fun PlayerActivity.showV1679PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1679planet
    FeaturePrefsStore.batch1671.v1679planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1679: plastic mode
internal fun PlayerActivity.showV1679PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1679plastic
    FeaturePrefsStore.batch1671.v1679plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1679: plate mode
internal fun PlayerActivity.showV1679PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1679plate
    FeaturePrefsStore.batch1671.v1679plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1679: please level
internal fun PlayerActivity.showV1679PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679please = value
        AppToast.show(this, "please: $value")
    }
}

// v1679: pledge level
internal fun PlayerActivity.showV1679PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1679: pluck level
internal fun PlayerActivity.showV1679PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1679: plug level
internal fun PlayerActivity.showV1679PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1679: plunge level
internal fun PlayerActivity.showV1679PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1679plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1679plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1679: poem mode
internal fun PlayerActivity.showV1679PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1679poem
    FeaturePrefsStore.batch1671.v1679poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1679: poet mode
internal fun PlayerActivity.showV1679PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1679poet
    FeaturePrefsStore.batch1671.v1679poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1679: point mode
internal fun PlayerActivity.showV1679PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1679point
    FeaturePrefsStore.batch1671.v1679point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1679: polar mode
internal fun PlayerActivity.showV1679PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1679polar
    FeaturePrefsStore.batch1671.v1679polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1679: pole mode
internal fun PlayerActivity.showV1679PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1679pole
    FeaturePrefsStore.batch1671.v1679pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}

// v1680: pistol mode
internal fun PlayerActivity.showV1680PistolToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pistol
    FeaturePrefsStore.batch1671.v1680pistol = !current
    AppToast.show(this, "pistol: ${if (!current) "ON" else "OFF"}")
}

// v1680: pizza mode
internal fun PlayerActivity.showV1680PizzaToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pizza
    FeaturePrefsStore.batch1671.v1680pizza = !current
    AppToast.show(this, "pizza: ${if (!current) "ON" else "OFF"}")
}

// v1680: planet mode
internal fun PlayerActivity.showV1680PlanetToggle() {
    val current = FeaturePrefsStore.batch1671.v1680planet
    FeaturePrefsStore.batch1671.v1680planet = !current
    AppToast.show(this, "planet: ${if (!current) "ON" else "OFF"}")
}

// v1680: plastic mode
internal fun PlayerActivity.showV1680PlasticToggle() {
    val current = FeaturePrefsStore.batch1671.v1680plastic
    FeaturePrefsStore.batch1671.v1680plastic = !current
    AppToast.show(this, "plastic: ${if (!current) "ON" else "OFF"}")
}

// v1680: plate mode
internal fun PlayerActivity.showV1680PlateToggle() {
    val current = FeaturePrefsStore.batch1671.v1680plate
    FeaturePrefsStore.batch1671.v1680plate = !current
    AppToast.show(this, "plate: ${if (!current) "ON" else "OFF"}")
}

// v1680: please level
internal fun PlayerActivity.showV1680PleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680please).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "please level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680please = value
        AppToast.show(this, "please: $value")
    }
}

// v1680: pledge level
internal fun PlayerActivity.showV1680PledgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680pledge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pledge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680pledge = value
        AppToast.show(this, "pledge: $value")
    }
}

// v1680: pluck level
internal fun PlayerActivity.showV1680PluckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680pluck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pluck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680pluck = value
        AppToast.show(this, "pluck: $value")
    }
}

// v1680: plug level
internal fun PlayerActivity.showV1680PlugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680plug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680plug = value
        AppToast.show(this, "plug: $value")
    }
}

// v1680: plunge level
internal fun PlayerActivity.showV1680PlungeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1671.v1680plunge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "plunge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1671.v1680plunge = value
        AppToast.show(this, "plunge: $value")
    }
}

// v1680: poem mode
internal fun PlayerActivity.showV1680PoemToggle() {
    val current = FeaturePrefsStore.batch1671.v1680poem
    FeaturePrefsStore.batch1671.v1680poem = !current
    AppToast.show(this, "poem: ${if (!current) "ON" else "OFF"}")
}

// v1680: poet mode
internal fun PlayerActivity.showV1680PoetToggle() {
    val current = FeaturePrefsStore.batch1671.v1680poet
    FeaturePrefsStore.batch1671.v1680poet = !current
    AppToast.show(this, "poet: ${if (!current) "ON" else "OFF"}")
}

// v1680: point mode
internal fun PlayerActivity.showV1680PointToggle() {
    val current = FeaturePrefsStore.batch1671.v1680point
    FeaturePrefsStore.batch1671.v1680point = !current
    AppToast.show(this, "point: ${if (!current) "ON" else "OFF"}")
}

// v1680: polar mode
internal fun PlayerActivity.showV1680PolarToggle() {
    val current = FeaturePrefsStore.batch1671.v1680polar
    FeaturePrefsStore.batch1671.v1680polar = !current
    AppToast.show(this, "polar: ${if (!current) "ON" else "OFF"}")
}

// v1680: pole mode
internal fun PlayerActivity.showV1680PoleToggle() {
    val current = FeaturePrefsStore.batch1671.v1680pole
    FeaturePrefsStore.batch1671.v1680pole = !current
    AppToast.show(this, "pole: ${if (!current) "ON" else "OFF"}")
}
