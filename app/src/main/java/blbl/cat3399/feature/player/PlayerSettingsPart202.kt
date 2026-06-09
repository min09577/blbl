package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2201: replaced mode
internal fun PlayerActivity.showV2201ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201replaced
    FeaturePrefsStore.batch2201.v2201replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2201: replied mode
internal fun PlayerActivity.showV2201RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201replied
    FeaturePrefsStore.batch2201.v2201replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2201: reported mode
internal fun PlayerActivity.showV2201ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201reported
    FeaturePrefsStore.batch2201.v2201reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2201: represented mode
internal fun PlayerActivity.showV2201RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201represented
    FeaturePrefsStore.batch2201.v2201represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2201: reproduced mode
internal fun PlayerActivity.showV2201ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201reproduced
    FeaturePrefsStore.batch2201.v2201reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2201: requested level
internal fun PlayerActivity.showV2201RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2201: required level
internal fun PlayerActivity.showV2201RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201required = value
        AppToast.show(this, "required: $value")
    }
}

// v2201: researched level
internal fun PlayerActivity.showV2201ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2201: reserved level
internal fun PlayerActivity.showV2201ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2201: resided level
internal fun PlayerActivity.showV2201ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2201: resigned mode
internal fun PlayerActivity.showV2201ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resigned
    FeaturePrefsStore.batch2201.v2201resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2201: resisted mode
internal fun PlayerActivity.showV2201ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resisted
    FeaturePrefsStore.batch2201.v2201resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2201: resolved mode
internal fun PlayerActivity.showV2201ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resolved
    FeaturePrefsStore.batch2201.v2201resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2201: responded mode
internal fun PlayerActivity.showV2201RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201responded
    FeaturePrefsStore.batch2201.v2201responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2201: restored mode
internal fun PlayerActivity.showV2201RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2201restored
    FeaturePrefsStore.batch2201.v2201restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2202: replaced mode
internal fun PlayerActivity.showV2202ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202replaced
    FeaturePrefsStore.batch2201.v2202replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2202: replied mode
internal fun PlayerActivity.showV2202RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202replied
    FeaturePrefsStore.batch2201.v2202replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2202: reported mode
internal fun PlayerActivity.showV2202ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202reported
    FeaturePrefsStore.batch2201.v2202reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2202: represented mode
internal fun PlayerActivity.showV2202RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202represented
    FeaturePrefsStore.batch2201.v2202represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2202: reproduced mode
internal fun PlayerActivity.showV2202ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202reproduced
    FeaturePrefsStore.batch2201.v2202reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2202: requested level
internal fun PlayerActivity.showV2202RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2202: required level
internal fun PlayerActivity.showV2202RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202required = value
        AppToast.show(this, "required: $value")
    }
}

// v2202: researched level
internal fun PlayerActivity.showV2202ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2202: reserved level
internal fun PlayerActivity.showV2202ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2202: resided level
internal fun PlayerActivity.showV2202ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2202: resigned mode
internal fun PlayerActivity.showV2202ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resigned
    FeaturePrefsStore.batch2201.v2202resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2202: resisted mode
internal fun PlayerActivity.showV2202ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resisted
    FeaturePrefsStore.batch2201.v2202resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2202: resolved mode
internal fun PlayerActivity.showV2202ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resolved
    FeaturePrefsStore.batch2201.v2202resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2202: responded mode
internal fun PlayerActivity.showV2202RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202responded
    FeaturePrefsStore.batch2201.v2202responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2202: restored mode
internal fun PlayerActivity.showV2202RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2202restored
    FeaturePrefsStore.batch2201.v2202restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2203: replaced mode
internal fun PlayerActivity.showV2203ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203replaced
    FeaturePrefsStore.batch2201.v2203replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2203: replied mode
internal fun PlayerActivity.showV2203RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203replied
    FeaturePrefsStore.batch2201.v2203replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2203: reported mode
internal fun PlayerActivity.showV2203ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203reported
    FeaturePrefsStore.batch2201.v2203reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2203: represented mode
internal fun PlayerActivity.showV2203RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203represented
    FeaturePrefsStore.batch2201.v2203represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2203: reproduced mode
internal fun PlayerActivity.showV2203ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203reproduced
    FeaturePrefsStore.batch2201.v2203reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2203: requested level
internal fun PlayerActivity.showV2203RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2203: required level
internal fun PlayerActivity.showV2203RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203required = value
        AppToast.show(this, "required: $value")
    }
}

// v2203: researched level
internal fun PlayerActivity.showV2203ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2203: reserved level
internal fun PlayerActivity.showV2203ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2203: resided level
internal fun PlayerActivity.showV2203ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2203: resigned mode
internal fun PlayerActivity.showV2203ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resigned
    FeaturePrefsStore.batch2201.v2203resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2203: resisted mode
internal fun PlayerActivity.showV2203ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resisted
    FeaturePrefsStore.batch2201.v2203resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2203: resolved mode
internal fun PlayerActivity.showV2203ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resolved
    FeaturePrefsStore.batch2201.v2203resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2203: responded mode
internal fun PlayerActivity.showV2203RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203responded
    FeaturePrefsStore.batch2201.v2203responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2203: restored mode
internal fun PlayerActivity.showV2203RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2203restored
    FeaturePrefsStore.batch2201.v2203restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2204: replaced mode
internal fun PlayerActivity.showV2204ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204replaced
    FeaturePrefsStore.batch2201.v2204replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2204: replied mode
internal fun PlayerActivity.showV2204RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204replied
    FeaturePrefsStore.batch2201.v2204replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2204: reported mode
internal fun PlayerActivity.showV2204ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204reported
    FeaturePrefsStore.batch2201.v2204reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2204: represented mode
internal fun PlayerActivity.showV2204RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204represented
    FeaturePrefsStore.batch2201.v2204represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2204: reproduced mode
internal fun PlayerActivity.showV2204ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204reproduced
    FeaturePrefsStore.batch2201.v2204reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2204: requested level
internal fun PlayerActivity.showV2204RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2204: required level
internal fun PlayerActivity.showV2204RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204required = value
        AppToast.show(this, "required: $value")
    }
}

// v2204: researched level
internal fun PlayerActivity.showV2204ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2204: reserved level
internal fun PlayerActivity.showV2204ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2204: resided level
internal fun PlayerActivity.showV2204ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2204: resigned mode
internal fun PlayerActivity.showV2204ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resigned
    FeaturePrefsStore.batch2201.v2204resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2204: resisted mode
internal fun PlayerActivity.showV2204ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resisted
    FeaturePrefsStore.batch2201.v2204resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2204: resolved mode
internal fun PlayerActivity.showV2204ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resolved
    FeaturePrefsStore.batch2201.v2204resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2204: responded mode
internal fun PlayerActivity.showV2204RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204responded
    FeaturePrefsStore.batch2201.v2204responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2204: restored mode
internal fun PlayerActivity.showV2204RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2204restored
    FeaturePrefsStore.batch2201.v2204restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2205: replaced mode
internal fun PlayerActivity.showV2205ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205replaced
    FeaturePrefsStore.batch2201.v2205replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2205: replied mode
internal fun PlayerActivity.showV2205RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205replied
    FeaturePrefsStore.batch2201.v2205replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2205: reported mode
internal fun PlayerActivity.showV2205ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205reported
    FeaturePrefsStore.batch2201.v2205reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2205: represented mode
internal fun PlayerActivity.showV2205RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205represented
    FeaturePrefsStore.batch2201.v2205represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2205: reproduced mode
internal fun PlayerActivity.showV2205ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205reproduced
    FeaturePrefsStore.batch2201.v2205reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2205: requested level
internal fun PlayerActivity.showV2205RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2205: required level
internal fun PlayerActivity.showV2205RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205required = value
        AppToast.show(this, "required: $value")
    }
}

// v2205: researched level
internal fun PlayerActivity.showV2205ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2205: reserved level
internal fun PlayerActivity.showV2205ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2205: resided level
internal fun PlayerActivity.showV2205ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2205: resigned mode
internal fun PlayerActivity.showV2205ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resigned
    FeaturePrefsStore.batch2201.v2205resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2205: resisted mode
internal fun PlayerActivity.showV2205ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resisted
    FeaturePrefsStore.batch2201.v2205resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2205: resolved mode
internal fun PlayerActivity.showV2205ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resolved
    FeaturePrefsStore.batch2201.v2205resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2205: responded mode
internal fun PlayerActivity.showV2205RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205responded
    FeaturePrefsStore.batch2201.v2205responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2205: restored mode
internal fun PlayerActivity.showV2205RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2205restored
    FeaturePrefsStore.batch2201.v2205restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2206: replaced mode
internal fun PlayerActivity.showV2206ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206replaced
    FeaturePrefsStore.batch2201.v2206replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2206: replied mode
internal fun PlayerActivity.showV2206RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206replied
    FeaturePrefsStore.batch2201.v2206replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2206: reported mode
internal fun PlayerActivity.showV2206ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206reported
    FeaturePrefsStore.batch2201.v2206reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2206: represented mode
internal fun PlayerActivity.showV2206RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206represented
    FeaturePrefsStore.batch2201.v2206represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2206: reproduced mode
internal fun PlayerActivity.showV2206ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206reproduced
    FeaturePrefsStore.batch2201.v2206reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2206: requested level
internal fun PlayerActivity.showV2206RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2206: required level
internal fun PlayerActivity.showV2206RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206required = value
        AppToast.show(this, "required: $value")
    }
}

// v2206: researched level
internal fun PlayerActivity.showV2206ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2206: reserved level
internal fun PlayerActivity.showV2206ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2206: resided level
internal fun PlayerActivity.showV2206ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2206: resigned mode
internal fun PlayerActivity.showV2206ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resigned
    FeaturePrefsStore.batch2201.v2206resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2206: resisted mode
internal fun PlayerActivity.showV2206ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resisted
    FeaturePrefsStore.batch2201.v2206resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2206: resolved mode
internal fun PlayerActivity.showV2206ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resolved
    FeaturePrefsStore.batch2201.v2206resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2206: responded mode
internal fun PlayerActivity.showV2206RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206responded
    FeaturePrefsStore.batch2201.v2206responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2206: restored mode
internal fun PlayerActivity.showV2206RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2206restored
    FeaturePrefsStore.batch2201.v2206restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2207: replaced mode
internal fun PlayerActivity.showV2207ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207replaced
    FeaturePrefsStore.batch2201.v2207replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2207: replied mode
internal fun PlayerActivity.showV2207RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207replied
    FeaturePrefsStore.batch2201.v2207replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2207: reported mode
internal fun PlayerActivity.showV2207ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207reported
    FeaturePrefsStore.batch2201.v2207reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2207: represented mode
internal fun PlayerActivity.showV2207RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207represented
    FeaturePrefsStore.batch2201.v2207represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2207: reproduced mode
internal fun PlayerActivity.showV2207ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207reproduced
    FeaturePrefsStore.batch2201.v2207reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2207: requested level
internal fun PlayerActivity.showV2207RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2207: required level
internal fun PlayerActivity.showV2207RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207required = value
        AppToast.show(this, "required: $value")
    }
}

// v2207: researched level
internal fun PlayerActivity.showV2207ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2207: reserved level
internal fun PlayerActivity.showV2207ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2207: resided level
internal fun PlayerActivity.showV2207ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2207: resigned mode
internal fun PlayerActivity.showV2207ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resigned
    FeaturePrefsStore.batch2201.v2207resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2207: resisted mode
internal fun PlayerActivity.showV2207ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resisted
    FeaturePrefsStore.batch2201.v2207resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2207: resolved mode
internal fun PlayerActivity.showV2207ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resolved
    FeaturePrefsStore.batch2201.v2207resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2207: responded mode
internal fun PlayerActivity.showV2207RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207responded
    FeaturePrefsStore.batch2201.v2207responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2207: restored mode
internal fun PlayerActivity.showV2207RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2207restored
    FeaturePrefsStore.batch2201.v2207restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2208: replaced mode
internal fun PlayerActivity.showV2208ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208replaced
    FeaturePrefsStore.batch2201.v2208replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2208: replied mode
internal fun PlayerActivity.showV2208RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208replied
    FeaturePrefsStore.batch2201.v2208replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2208: reported mode
internal fun PlayerActivity.showV2208ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208reported
    FeaturePrefsStore.batch2201.v2208reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2208: represented mode
internal fun PlayerActivity.showV2208RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208represented
    FeaturePrefsStore.batch2201.v2208represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2208: reproduced mode
internal fun PlayerActivity.showV2208ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208reproduced
    FeaturePrefsStore.batch2201.v2208reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2208: requested level
internal fun PlayerActivity.showV2208RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2208: required level
internal fun PlayerActivity.showV2208RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208required = value
        AppToast.show(this, "required: $value")
    }
}

// v2208: researched level
internal fun PlayerActivity.showV2208ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2208: reserved level
internal fun PlayerActivity.showV2208ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2208: resided level
internal fun PlayerActivity.showV2208ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2208: resigned mode
internal fun PlayerActivity.showV2208ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resigned
    FeaturePrefsStore.batch2201.v2208resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2208: resisted mode
internal fun PlayerActivity.showV2208ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resisted
    FeaturePrefsStore.batch2201.v2208resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2208: resolved mode
internal fun PlayerActivity.showV2208ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resolved
    FeaturePrefsStore.batch2201.v2208resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2208: responded mode
internal fun PlayerActivity.showV2208RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208responded
    FeaturePrefsStore.batch2201.v2208responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2208: restored mode
internal fun PlayerActivity.showV2208RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2208restored
    FeaturePrefsStore.batch2201.v2208restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2209: replaced mode
internal fun PlayerActivity.showV2209ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209replaced
    FeaturePrefsStore.batch2201.v2209replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2209: replied mode
internal fun PlayerActivity.showV2209RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209replied
    FeaturePrefsStore.batch2201.v2209replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2209: reported mode
internal fun PlayerActivity.showV2209ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209reported
    FeaturePrefsStore.batch2201.v2209reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2209: represented mode
internal fun PlayerActivity.showV2209RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209represented
    FeaturePrefsStore.batch2201.v2209represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2209: reproduced mode
internal fun PlayerActivity.showV2209ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209reproduced
    FeaturePrefsStore.batch2201.v2209reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2209: requested level
internal fun PlayerActivity.showV2209RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2209: required level
internal fun PlayerActivity.showV2209RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209required = value
        AppToast.show(this, "required: $value")
    }
}

// v2209: researched level
internal fun PlayerActivity.showV2209ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2209: reserved level
internal fun PlayerActivity.showV2209ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2209: resided level
internal fun PlayerActivity.showV2209ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2209: resigned mode
internal fun PlayerActivity.showV2209ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resigned
    FeaturePrefsStore.batch2201.v2209resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2209: resisted mode
internal fun PlayerActivity.showV2209ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resisted
    FeaturePrefsStore.batch2201.v2209resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2209: resolved mode
internal fun PlayerActivity.showV2209ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resolved
    FeaturePrefsStore.batch2201.v2209resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2209: responded mode
internal fun PlayerActivity.showV2209RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209responded
    FeaturePrefsStore.batch2201.v2209responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2209: restored mode
internal fun PlayerActivity.showV2209RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2209restored
    FeaturePrefsStore.batch2201.v2209restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2210: replaced mode
internal fun PlayerActivity.showV2210ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210replaced
    FeaturePrefsStore.batch2201.v2210replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2210: replied mode
internal fun PlayerActivity.showV2210RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210replied
    FeaturePrefsStore.batch2201.v2210replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2210: reported mode
internal fun PlayerActivity.showV2210ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210reported
    FeaturePrefsStore.batch2201.v2210reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2210: represented mode
internal fun PlayerActivity.showV2210RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210represented
    FeaturePrefsStore.batch2201.v2210represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2210: reproduced mode
internal fun PlayerActivity.showV2210ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210reproduced
    FeaturePrefsStore.batch2201.v2210reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2210: requested level
internal fun PlayerActivity.showV2210RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2210: required level
internal fun PlayerActivity.showV2210RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210required = value
        AppToast.show(this, "required: $value")
    }
}

// v2210: researched level
internal fun PlayerActivity.showV2210ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2210: reserved level
internal fun PlayerActivity.showV2210ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2210: resided level
internal fun PlayerActivity.showV2210ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2210: resigned mode
internal fun PlayerActivity.showV2210ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resigned
    FeaturePrefsStore.batch2201.v2210resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2210: resisted mode
internal fun PlayerActivity.showV2210ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resisted
    FeaturePrefsStore.batch2201.v2210resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2210: resolved mode
internal fun PlayerActivity.showV2210ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resolved
    FeaturePrefsStore.batch2201.v2210resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2210: responded mode
internal fun PlayerActivity.showV2210RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210responded
    FeaturePrefsStore.batch2201.v2210responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2210: restored mode
internal fun PlayerActivity.showV2210RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2210restored
    FeaturePrefsStore.batch2201.v2210restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

