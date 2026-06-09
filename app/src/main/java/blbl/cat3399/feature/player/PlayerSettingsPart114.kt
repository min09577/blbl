package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1321: chip mode
internal fun PlayerActivity.showV1321ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chip
    FeaturePrefsStore.batch1321.v1321chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1321: choice mode
internal fun PlayerActivity.showV1321ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1321choice
    FeaturePrefsStore.batch1321.v1321choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1321: chord mode
internal fun PlayerActivity.showV1321ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chord
    FeaturePrefsStore.batch1321.v1321chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1321: chrome mode
internal fun PlayerActivity.showV1321ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chrome
    FeaturePrefsStore.batch1321.v1321chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1321: church mode
internal fun PlayerActivity.showV1321ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1321church
    FeaturePrefsStore.batch1321.v1321church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1321: circle level
internal fun PlayerActivity.showV1321CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1321: city level
internal fun PlayerActivity.showV1321CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321city = value
        AppToast.show(this, "city: $value")
    }
}

// v1321: claim level
internal fun PlayerActivity.showV1321ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1321: clan level
internal fun PlayerActivity.showV1321ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1321: clash level
internal fun PlayerActivity.showV1321ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1321: class mode
internal fun PlayerActivity.showV1321ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1321class
    FeaturePrefsStore.batch1321.v1321class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1321: clause mode
internal fun PlayerActivity.showV1321ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clause
    FeaturePrefsStore.batch1321.v1321clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1321: clay mode
internal fun PlayerActivity.showV1321ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clay
    FeaturePrefsStore.batch1321.v1321clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1321: clerk mode
internal fun PlayerActivity.showV1321ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clerk
    FeaturePrefsStore.batch1321.v1321clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1321: clever mode
internal fun PlayerActivity.showV1321CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clever
    FeaturePrefsStore.batch1321.v1321clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1322: chip mode
internal fun PlayerActivity.showV1322ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chip
    FeaturePrefsStore.batch1321.v1322chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1322: choice mode
internal fun PlayerActivity.showV1322ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1322choice
    FeaturePrefsStore.batch1321.v1322choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1322: chord mode
internal fun PlayerActivity.showV1322ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chord
    FeaturePrefsStore.batch1321.v1322chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1322: chrome mode
internal fun PlayerActivity.showV1322ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chrome
    FeaturePrefsStore.batch1321.v1322chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1322: church mode
internal fun PlayerActivity.showV1322ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1322church
    FeaturePrefsStore.batch1321.v1322church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1322: circle level
internal fun PlayerActivity.showV1322CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1322: city level
internal fun PlayerActivity.showV1322CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322city = value
        AppToast.show(this, "city: $value")
    }
}

// v1322: claim level
internal fun PlayerActivity.showV1322ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1322: clan level
internal fun PlayerActivity.showV1322ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1322: clash level
internal fun PlayerActivity.showV1322ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1322: class mode
internal fun PlayerActivity.showV1322ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1322class
    FeaturePrefsStore.batch1321.v1322class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1322: clause mode
internal fun PlayerActivity.showV1322ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clause
    FeaturePrefsStore.batch1321.v1322clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1322: clay mode
internal fun PlayerActivity.showV1322ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clay
    FeaturePrefsStore.batch1321.v1322clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1322: clerk mode
internal fun PlayerActivity.showV1322ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clerk
    FeaturePrefsStore.batch1321.v1322clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1322: clever mode
internal fun PlayerActivity.showV1322CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clever
    FeaturePrefsStore.batch1321.v1322clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1323: chip mode
internal fun PlayerActivity.showV1323ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chip
    FeaturePrefsStore.batch1321.v1323chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1323: choice mode
internal fun PlayerActivity.showV1323ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1323choice
    FeaturePrefsStore.batch1321.v1323choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1323: chord mode
internal fun PlayerActivity.showV1323ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chord
    FeaturePrefsStore.batch1321.v1323chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1323: chrome mode
internal fun PlayerActivity.showV1323ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chrome
    FeaturePrefsStore.batch1321.v1323chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1323: church mode
internal fun PlayerActivity.showV1323ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1323church
    FeaturePrefsStore.batch1321.v1323church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1323: circle level
internal fun PlayerActivity.showV1323CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1323: city level
internal fun PlayerActivity.showV1323CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323city = value
        AppToast.show(this, "city: $value")
    }
}

// v1323: claim level
internal fun PlayerActivity.showV1323ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1323: clan level
internal fun PlayerActivity.showV1323ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1323: clash level
internal fun PlayerActivity.showV1323ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1323: class mode
internal fun PlayerActivity.showV1323ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1323class
    FeaturePrefsStore.batch1321.v1323class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1323: clause mode
internal fun PlayerActivity.showV1323ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clause
    FeaturePrefsStore.batch1321.v1323clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1323: clay mode
internal fun PlayerActivity.showV1323ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clay
    FeaturePrefsStore.batch1321.v1323clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1323: clerk mode
internal fun PlayerActivity.showV1323ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clerk
    FeaturePrefsStore.batch1321.v1323clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1323: clever mode
internal fun PlayerActivity.showV1323CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clever
    FeaturePrefsStore.batch1321.v1323clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1324: chip mode
internal fun PlayerActivity.showV1324ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chip
    FeaturePrefsStore.batch1321.v1324chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1324: choice mode
internal fun PlayerActivity.showV1324ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1324choice
    FeaturePrefsStore.batch1321.v1324choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1324: chord mode
internal fun PlayerActivity.showV1324ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chord
    FeaturePrefsStore.batch1321.v1324chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1324: chrome mode
internal fun PlayerActivity.showV1324ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chrome
    FeaturePrefsStore.batch1321.v1324chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1324: church mode
internal fun PlayerActivity.showV1324ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1324church
    FeaturePrefsStore.batch1321.v1324church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1324: circle level
internal fun PlayerActivity.showV1324CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1324: city level
internal fun PlayerActivity.showV1324CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324city = value
        AppToast.show(this, "city: $value")
    }
}

// v1324: claim level
internal fun PlayerActivity.showV1324ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1324: clan level
internal fun PlayerActivity.showV1324ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1324: clash level
internal fun PlayerActivity.showV1324ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1324: class mode
internal fun PlayerActivity.showV1324ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1324class
    FeaturePrefsStore.batch1321.v1324class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1324: clause mode
internal fun PlayerActivity.showV1324ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clause
    FeaturePrefsStore.batch1321.v1324clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1324: clay mode
internal fun PlayerActivity.showV1324ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clay
    FeaturePrefsStore.batch1321.v1324clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1324: clerk mode
internal fun PlayerActivity.showV1324ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clerk
    FeaturePrefsStore.batch1321.v1324clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1324: clever mode
internal fun PlayerActivity.showV1324CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clever
    FeaturePrefsStore.batch1321.v1324clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1325: chip mode
internal fun PlayerActivity.showV1325ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chip
    FeaturePrefsStore.batch1321.v1325chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1325: choice mode
internal fun PlayerActivity.showV1325ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1325choice
    FeaturePrefsStore.batch1321.v1325choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1325: chord mode
internal fun PlayerActivity.showV1325ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chord
    FeaturePrefsStore.batch1321.v1325chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1325: chrome mode
internal fun PlayerActivity.showV1325ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chrome
    FeaturePrefsStore.batch1321.v1325chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1325: church mode
internal fun PlayerActivity.showV1325ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1325church
    FeaturePrefsStore.batch1321.v1325church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1325: circle level
internal fun PlayerActivity.showV1325CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1325: city level
internal fun PlayerActivity.showV1325CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325city = value
        AppToast.show(this, "city: $value")
    }
}

// v1325: claim level
internal fun PlayerActivity.showV1325ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1325: clan level
internal fun PlayerActivity.showV1325ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1325: clash level
internal fun PlayerActivity.showV1325ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1325: class mode
internal fun PlayerActivity.showV1325ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1325class
    FeaturePrefsStore.batch1321.v1325class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1325: clause mode
internal fun PlayerActivity.showV1325ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clause
    FeaturePrefsStore.batch1321.v1325clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1325: clay mode
internal fun PlayerActivity.showV1325ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clay
    FeaturePrefsStore.batch1321.v1325clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1325: clerk mode
internal fun PlayerActivity.showV1325ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clerk
    FeaturePrefsStore.batch1321.v1325clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1325: clever mode
internal fun PlayerActivity.showV1325CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clever
    FeaturePrefsStore.batch1321.v1325clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1326: chip mode
internal fun PlayerActivity.showV1326ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chip
    FeaturePrefsStore.batch1321.v1326chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1326: choice mode
internal fun PlayerActivity.showV1326ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1326choice
    FeaturePrefsStore.batch1321.v1326choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1326: chord mode
internal fun PlayerActivity.showV1326ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chord
    FeaturePrefsStore.batch1321.v1326chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1326: chrome mode
internal fun PlayerActivity.showV1326ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chrome
    FeaturePrefsStore.batch1321.v1326chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1326: church mode
internal fun PlayerActivity.showV1326ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1326church
    FeaturePrefsStore.batch1321.v1326church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1326: circle level
internal fun PlayerActivity.showV1326CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1326: city level
internal fun PlayerActivity.showV1326CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326city = value
        AppToast.show(this, "city: $value")
    }
}

// v1326: claim level
internal fun PlayerActivity.showV1326ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1326: clan level
internal fun PlayerActivity.showV1326ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1326: clash level
internal fun PlayerActivity.showV1326ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1326: class mode
internal fun PlayerActivity.showV1326ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1326class
    FeaturePrefsStore.batch1321.v1326class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1326: clause mode
internal fun PlayerActivity.showV1326ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clause
    FeaturePrefsStore.batch1321.v1326clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1326: clay mode
internal fun PlayerActivity.showV1326ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clay
    FeaturePrefsStore.batch1321.v1326clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1326: clerk mode
internal fun PlayerActivity.showV1326ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clerk
    FeaturePrefsStore.batch1321.v1326clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1326: clever mode
internal fun PlayerActivity.showV1326CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clever
    FeaturePrefsStore.batch1321.v1326clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1327: chip mode
internal fun PlayerActivity.showV1327ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chip
    FeaturePrefsStore.batch1321.v1327chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1327: choice mode
internal fun PlayerActivity.showV1327ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1327choice
    FeaturePrefsStore.batch1321.v1327choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1327: chord mode
internal fun PlayerActivity.showV1327ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chord
    FeaturePrefsStore.batch1321.v1327chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1327: chrome mode
internal fun PlayerActivity.showV1327ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chrome
    FeaturePrefsStore.batch1321.v1327chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1327: church mode
internal fun PlayerActivity.showV1327ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1327church
    FeaturePrefsStore.batch1321.v1327church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1327: circle level
internal fun PlayerActivity.showV1327CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1327: city level
internal fun PlayerActivity.showV1327CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327city = value
        AppToast.show(this, "city: $value")
    }
}

// v1327: claim level
internal fun PlayerActivity.showV1327ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1327: clan level
internal fun PlayerActivity.showV1327ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1327: clash level
internal fun PlayerActivity.showV1327ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1327: class mode
internal fun PlayerActivity.showV1327ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1327class
    FeaturePrefsStore.batch1321.v1327class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1327: clause mode
internal fun PlayerActivity.showV1327ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clause
    FeaturePrefsStore.batch1321.v1327clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1327: clay mode
internal fun PlayerActivity.showV1327ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clay
    FeaturePrefsStore.batch1321.v1327clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1327: clerk mode
internal fun PlayerActivity.showV1327ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clerk
    FeaturePrefsStore.batch1321.v1327clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1327: clever mode
internal fun PlayerActivity.showV1327CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clever
    FeaturePrefsStore.batch1321.v1327clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1328: chip mode
internal fun PlayerActivity.showV1328ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chip
    FeaturePrefsStore.batch1321.v1328chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1328: choice mode
internal fun PlayerActivity.showV1328ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1328choice
    FeaturePrefsStore.batch1321.v1328choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1328: chord mode
internal fun PlayerActivity.showV1328ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chord
    FeaturePrefsStore.batch1321.v1328chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1328: chrome mode
internal fun PlayerActivity.showV1328ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chrome
    FeaturePrefsStore.batch1321.v1328chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1328: church mode
internal fun PlayerActivity.showV1328ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1328church
    FeaturePrefsStore.batch1321.v1328church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1328: circle level
internal fun PlayerActivity.showV1328CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1328: city level
internal fun PlayerActivity.showV1328CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328city = value
        AppToast.show(this, "city: $value")
    }
}

// v1328: claim level
internal fun PlayerActivity.showV1328ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1328: clan level
internal fun PlayerActivity.showV1328ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1328: clash level
internal fun PlayerActivity.showV1328ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1328: class mode
internal fun PlayerActivity.showV1328ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1328class
    FeaturePrefsStore.batch1321.v1328class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1328: clause mode
internal fun PlayerActivity.showV1328ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clause
    FeaturePrefsStore.batch1321.v1328clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1328: clay mode
internal fun PlayerActivity.showV1328ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clay
    FeaturePrefsStore.batch1321.v1328clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1328: clerk mode
internal fun PlayerActivity.showV1328ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clerk
    FeaturePrefsStore.batch1321.v1328clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1328: clever mode
internal fun PlayerActivity.showV1328CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clever
    FeaturePrefsStore.batch1321.v1328clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1329: chip mode
internal fun PlayerActivity.showV1329ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chip
    FeaturePrefsStore.batch1321.v1329chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1329: choice mode
internal fun PlayerActivity.showV1329ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1329choice
    FeaturePrefsStore.batch1321.v1329choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1329: chord mode
internal fun PlayerActivity.showV1329ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chord
    FeaturePrefsStore.batch1321.v1329chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1329: chrome mode
internal fun PlayerActivity.showV1329ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chrome
    FeaturePrefsStore.batch1321.v1329chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1329: church mode
internal fun PlayerActivity.showV1329ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1329church
    FeaturePrefsStore.batch1321.v1329church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1329: circle level
internal fun PlayerActivity.showV1329CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1329: city level
internal fun PlayerActivity.showV1329CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329city = value
        AppToast.show(this, "city: $value")
    }
}

// v1329: claim level
internal fun PlayerActivity.showV1329ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1329: clan level
internal fun PlayerActivity.showV1329ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1329: clash level
internal fun PlayerActivity.showV1329ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1329: class mode
internal fun PlayerActivity.showV1329ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1329class
    FeaturePrefsStore.batch1321.v1329class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1329: clause mode
internal fun PlayerActivity.showV1329ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clause
    FeaturePrefsStore.batch1321.v1329clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1329: clay mode
internal fun PlayerActivity.showV1329ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clay
    FeaturePrefsStore.batch1321.v1329clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1329: clerk mode
internal fun PlayerActivity.showV1329ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clerk
    FeaturePrefsStore.batch1321.v1329clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1329: clever mode
internal fun PlayerActivity.showV1329CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clever
    FeaturePrefsStore.batch1321.v1329clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1330: chip mode
internal fun PlayerActivity.showV1330ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chip
    FeaturePrefsStore.batch1321.v1330chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1330: choice mode
internal fun PlayerActivity.showV1330ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1330choice
    FeaturePrefsStore.batch1321.v1330choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1330: chord mode
internal fun PlayerActivity.showV1330ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chord
    FeaturePrefsStore.batch1321.v1330chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1330: chrome mode
internal fun PlayerActivity.showV1330ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chrome
    FeaturePrefsStore.batch1321.v1330chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1330: church mode
internal fun PlayerActivity.showV1330ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1330church
    FeaturePrefsStore.batch1321.v1330church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1330: circle level
internal fun PlayerActivity.showV1330CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1330: city level
internal fun PlayerActivity.showV1330CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330city = value
        AppToast.show(this, "city: $value")
    }
}

// v1330: claim level
internal fun PlayerActivity.showV1330ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1330: clan level
internal fun PlayerActivity.showV1330ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1330: clash level
internal fun PlayerActivity.showV1330ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1330: class mode
internal fun PlayerActivity.showV1330ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1330class
    FeaturePrefsStore.batch1321.v1330class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1330: clause mode
internal fun PlayerActivity.showV1330ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clause
    FeaturePrefsStore.batch1321.v1330clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1330: clay mode
internal fun PlayerActivity.showV1330ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clay
    FeaturePrefsStore.batch1321.v1330clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1330: clerk mode
internal fun PlayerActivity.showV1330ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clerk
    FeaturePrefsStore.batch1321.v1330clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1330: clever mode
internal fun PlayerActivity.showV1330CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clever
    FeaturePrefsStore.batch1321.v1330clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

