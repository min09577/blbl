package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1211: anthem mode
internal fun PlayerActivity.showV1211AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1211anthem
    FeaturePrefsStore.batch1211.v1211anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1211: antic mode
internal fun PlayerActivity.showV1211AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1211antic
    FeaturePrefsStore.batch1211.v1211antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1211: anvil mode
internal fun PlayerActivity.showV1211AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1211anvil
    FeaturePrefsStore.batch1211.v1211anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1211: apart mode
internal fun PlayerActivity.showV1211ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1211apart
    FeaturePrefsStore.batch1211.v1211apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1211: apple mode
internal fun PlayerActivity.showV1211AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1211apple
    FeaturePrefsStore.batch1211.v1211apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1211: apply level
internal fun PlayerActivity.showV1211ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1211: arena level
internal fun PlayerActivity.showV1211ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1211: argue level
internal fun PlayerActivity.showV1211ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1211: arise level
internal fun PlayerActivity.showV1211AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1211: armor level
internal fun PlayerActivity.showV1211ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1211: army mode
internal fun PlayerActivity.showV1211ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1211army
    FeaturePrefsStore.batch1211.v1211army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1211: aroma mode
internal fun PlayerActivity.showV1211AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1211aroma
    FeaturePrefsStore.batch1211.v1211aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1211: array mode
internal fun PlayerActivity.showV1211ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1211array
    FeaturePrefsStore.batch1211.v1211array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1211: arrow mode
internal fun PlayerActivity.showV1211ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1211arrow
    FeaturePrefsStore.batch1211.v1211arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1211: aside mode
internal fun PlayerActivity.showV1211AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1211aside
    FeaturePrefsStore.batch1211.v1211aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1212: anthem mode
internal fun PlayerActivity.showV1212AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1212anthem
    FeaturePrefsStore.batch1211.v1212anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1212: antic mode
internal fun PlayerActivity.showV1212AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1212antic
    FeaturePrefsStore.batch1211.v1212antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1212: anvil mode
internal fun PlayerActivity.showV1212AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1212anvil
    FeaturePrefsStore.batch1211.v1212anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1212: apart mode
internal fun PlayerActivity.showV1212ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1212apart
    FeaturePrefsStore.batch1211.v1212apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1212: apple mode
internal fun PlayerActivity.showV1212AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1212apple
    FeaturePrefsStore.batch1211.v1212apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1212: apply level
internal fun PlayerActivity.showV1212ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1212: arena level
internal fun PlayerActivity.showV1212ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1212: argue level
internal fun PlayerActivity.showV1212ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1212: arise level
internal fun PlayerActivity.showV1212AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1212: armor level
internal fun PlayerActivity.showV1212ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1212: army mode
internal fun PlayerActivity.showV1212ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1212army
    FeaturePrefsStore.batch1211.v1212army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1212: aroma mode
internal fun PlayerActivity.showV1212AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1212aroma
    FeaturePrefsStore.batch1211.v1212aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1212: array mode
internal fun PlayerActivity.showV1212ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1212array
    FeaturePrefsStore.batch1211.v1212array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1212: arrow mode
internal fun PlayerActivity.showV1212ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1212arrow
    FeaturePrefsStore.batch1211.v1212arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1212: aside mode
internal fun PlayerActivity.showV1212AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1212aside
    FeaturePrefsStore.batch1211.v1212aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1213: anthem mode
internal fun PlayerActivity.showV1213AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1213anthem
    FeaturePrefsStore.batch1211.v1213anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1213: antic mode
internal fun PlayerActivity.showV1213AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1213antic
    FeaturePrefsStore.batch1211.v1213antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1213: anvil mode
internal fun PlayerActivity.showV1213AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1213anvil
    FeaturePrefsStore.batch1211.v1213anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1213: apart mode
internal fun PlayerActivity.showV1213ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1213apart
    FeaturePrefsStore.batch1211.v1213apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1213: apple mode
internal fun PlayerActivity.showV1213AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1213apple
    FeaturePrefsStore.batch1211.v1213apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1213: apply level
internal fun PlayerActivity.showV1213ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1213: arena level
internal fun PlayerActivity.showV1213ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1213: argue level
internal fun PlayerActivity.showV1213ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1213: arise level
internal fun PlayerActivity.showV1213AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1213: armor level
internal fun PlayerActivity.showV1213ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1213: army mode
internal fun PlayerActivity.showV1213ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1213army
    FeaturePrefsStore.batch1211.v1213army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1213: aroma mode
internal fun PlayerActivity.showV1213AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1213aroma
    FeaturePrefsStore.batch1211.v1213aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1213: array mode
internal fun PlayerActivity.showV1213ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1213array
    FeaturePrefsStore.batch1211.v1213array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1213: arrow mode
internal fun PlayerActivity.showV1213ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1213arrow
    FeaturePrefsStore.batch1211.v1213arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1213: aside mode
internal fun PlayerActivity.showV1213AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1213aside
    FeaturePrefsStore.batch1211.v1213aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1214: anthem mode
internal fun PlayerActivity.showV1214AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1214anthem
    FeaturePrefsStore.batch1211.v1214anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1214: antic mode
internal fun PlayerActivity.showV1214AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1214antic
    FeaturePrefsStore.batch1211.v1214antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1214: anvil mode
internal fun PlayerActivity.showV1214AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1214anvil
    FeaturePrefsStore.batch1211.v1214anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1214: apart mode
internal fun PlayerActivity.showV1214ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1214apart
    FeaturePrefsStore.batch1211.v1214apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1214: apple mode
internal fun PlayerActivity.showV1214AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1214apple
    FeaturePrefsStore.batch1211.v1214apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1214: apply level
internal fun PlayerActivity.showV1214ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1214: arena level
internal fun PlayerActivity.showV1214ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1214: argue level
internal fun PlayerActivity.showV1214ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1214: arise level
internal fun PlayerActivity.showV1214AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1214: armor level
internal fun PlayerActivity.showV1214ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1214: army mode
internal fun PlayerActivity.showV1214ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1214army
    FeaturePrefsStore.batch1211.v1214army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1214: aroma mode
internal fun PlayerActivity.showV1214AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1214aroma
    FeaturePrefsStore.batch1211.v1214aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1214: array mode
internal fun PlayerActivity.showV1214ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1214array
    FeaturePrefsStore.batch1211.v1214array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1214: arrow mode
internal fun PlayerActivity.showV1214ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1214arrow
    FeaturePrefsStore.batch1211.v1214arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1214: aside mode
internal fun PlayerActivity.showV1214AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1214aside
    FeaturePrefsStore.batch1211.v1214aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1215: anthem mode
internal fun PlayerActivity.showV1215AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1215anthem
    FeaturePrefsStore.batch1211.v1215anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1215: antic mode
internal fun PlayerActivity.showV1215AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1215antic
    FeaturePrefsStore.batch1211.v1215antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1215: anvil mode
internal fun PlayerActivity.showV1215AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1215anvil
    FeaturePrefsStore.batch1211.v1215anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1215: apart mode
internal fun PlayerActivity.showV1215ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1215apart
    FeaturePrefsStore.batch1211.v1215apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1215: apple mode
internal fun PlayerActivity.showV1215AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1215apple
    FeaturePrefsStore.batch1211.v1215apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1215: apply level
internal fun PlayerActivity.showV1215ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1215: arena level
internal fun PlayerActivity.showV1215ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1215: argue level
internal fun PlayerActivity.showV1215ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1215: arise level
internal fun PlayerActivity.showV1215AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1215: armor level
internal fun PlayerActivity.showV1215ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1215: army mode
internal fun PlayerActivity.showV1215ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1215army
    FeaturePrefsStore.batch1211.v1215army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1215: aroma mode
internal fun PlayerActivity.showV1215AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1215aroma
    FeaturePrefsStore.batch1211.v1215aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1215: array mode
internal fun PlayerActivity.showV1215ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1215array
    FeaturePrefsStore.batch1211.v1215array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1215: arrow mode
internal fun PlayerActivity.showV1215ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1215arrow
    FeaturePrefsStore.batch1211.v1215arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1215: aside mode
internal fun PlayerActivity.showV1215AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1215aside
    FeaturePrefsStore.batch1211.v1215aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1216: anthem mode
internal fun PlayerActivity.showV1216AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1216anthem
    FeaturePrefsStore.batch1211.v1216anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1216: antic mode
internal fun PlayerActivity.showV1216AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1216antic
    FeaturePrefsStore.batch1211.v1216antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1216: anvil mode
internal fun PlayerActivity.showV1216AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1216anvil
    FeaturePrefsStore.batch1211.v1216anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1216: apart mode
internal fun PlayerActivity.showV1216ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1216apart
    FeaturePrefsStore.batch1211.v1216apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1216: apple mode
internal fun PlayerActivity.showV1216AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1216apple
    FeaturePrefsStore.batch1211.v1216apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1216: apply level
internal fun PlayerActivity.showV1216ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1216: arena level
internal fun PlayerActivity.showV1216ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1216: argue level
internal fun PlayerActivity.showV1216ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1216: arise level
internal fun PlayerActivity.showV1216AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1216: armor level
internal fun PlayerActivity.showV1216ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1216: army mode
internal fun PlayerActivity.showV1216ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1216army
    FeaturePrefsStore.batch1211.v1216army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1216: aroma mode
internal fun PlayerActivity.showV1216AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1216aroma
    FeaturePrefsStore.batch1211.v1216aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1216: array mode
internal fun PlayerActivity.showV1216ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1216array
    FeaturePrefsStore.batch1211.v1216array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1216: arrow mode
internal fun PlayerActivity.showV1216ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1216arrow
    FeaturePrefsStore.batch1211.v1216arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1216: aside mode
internal fun PlayerActivity.showV1216AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1216aside
    FeaturePrefsStore.batch1211.v1216aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1217: anthem mode
internal fun PlayerActivity.showV1217AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1217anthem
    FeaturePrefsStore.batch1211.v1217anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1217: antic mode
internal fun PlayerActivity.showV1217AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1217antic
    FeaturePrefsStore.batch1211.v1217antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1217: anvil mode
internal fun PlayerActivity.showV1217AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1217anvil
    FeaturePrefsStore.batch1211.v1217anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1217: apart mode
internal fun PlayerActivity.showV1217ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1217apart
    FeaturePrefsStore.batch1211.v1217apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1217: apple mode
internal fun PlayerActivity.showV1217AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1217apple
    FeaturePrefsStore.batch1211.v1217apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1217: apply level
internal fun PlayerActivity.showV1217ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1217: arena level
internal fun PlayerActivity.showV1217ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1217: argue level
internal fun PlayerActivity.showV1217ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1217: arise level
internal fun PlayerActivity.showV1217AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1217: armor level
internal fun PlayerActivity.showV1217ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1217: army mode
internal fun PlayerActivity.showV1217ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1217army
    FeaturePrefsStore.batch1211.v1217army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1217: aroma mode
internal fun PlayerActivity.showV1217AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1217aroma
    FeaturePrefsStore.batch1211.v1217aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1217: array mode
internal fun PlayerActivity.showV1217ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1217array
    FeaturePrefsStore.batch1211.v1217array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1217: arrow mode
internal fun PlayerActivity.showV1217ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1217arrow
    FeaturePrefsStore.batch1211.v1217arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1217: aside mode
internal fun PlayerActivity.showV1217AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1217aside
    FeaturePrefsStore.batch1211.v1217aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1218: anthem mode
internal fun PlayerActivity.showV1218AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1218anthem
    FeaturePrefsStore.batch1211.v1218anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1218: antic mode
internal fun PlayerActivity.showV1218AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1218antic
    FeaturePrefsStore.batch1211.v1218antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1218: anvil mode
internal fun PlayerActivity.showV1218AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1218anvil
    FeaturePrefsStore.batch1211.v1218anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1218: apart mode
internal fun PlayerActivity.showV1218ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1218apart
    FeaturePrefsStore.batch1211.v1218apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1218: apple mode
internal fun PlayerActivity.showV1218AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1218apple
    FeaturePrefsStore.batch1211.v1218apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1218: apply level
internal fun PlayerActivity.showV1218ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1218: arena level
internal fun PlayerActivity.showV1218ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1218: argue level
internal fun PlayerActivity.showV1218ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1218: arise level
internal fun PlayerActivity.showV1218AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1218: armor level
internal fun PlayerActivity.showV1218ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1218: army mode
internal fun PlayerActivity.showV1218ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1218army
    FeaturePrefsStore.batch1211.v1218army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1218: aroma mode
internal fun PlayerActivity.showV1218AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1218aroma
    FeaturePrefsStore.batch1211.v1218aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1218: array mode
internal fun PlayerActivity.showV1218ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1218array
    FeaturePrefsStore.batch1211.v1218array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1218: arrow mode
internal fun PlayerActivity.showV1218ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1218arrow
    FeaturePrefsStore.batch1211.v1218arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1218: aside mode
internal fun PlayerActivity.showV1218AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1218aside
    FeaturePrefsStore.batch1211.v1218aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1219: anthem mode
internal fun PlayerActivity.showV1219AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1219anthem
    FeaturePrefsStore.batch1211.v1219anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1219: antic mode
internal fun PlayerActivity.showV1219AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1219antic
    FeaturePrefsStore.batch1211.v1219antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1219: anvil mode
internal fun PlayerActivity.showV1219AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1219anvil
    FeaturePrefsStore.batch1211.v1219anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1219: apart mode
internal fun PlayerActivity.showV1219ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1219apart
    FeaturePrefsStore.batch1211.v1219apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1219: apple mode
internal fun PlayerActivity.showV1219AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1219apple
    FeaturePrefsStore.batch1211.v1219apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1219: apply level
internal fun PlayerActivity.showV1219ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1219: arena level
internal fun PlayerActivity.showV1219ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1219: argue level
internal fun PlayerActivity.showV1219ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1219: arise level
internal fun PlayerActivity.showV1219AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1219: armor level
internal fun PlayerActivity.showV1219ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1219: army mode
internal fun PlayerActivity.showV1219ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1219army
    FeaturePrefsStore.batch1211.v1219army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1219: aroma mode
internal fun PlayerActivity.showV1219AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1219aroma
    FeaturePrefsStore.batch1211.v1219aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1219: array mode
internal fun PlayerActivity.showV1219ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1219array
    FeaturePrefsStore.batch1211.v1219array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1219: arrow mode
internal fun PlayerActivity.showV1219ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1219arrow
    FeaturePrefsStore.batch1211.v1219arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1219: aside mode
internal fun PlayerActivity.showV1219AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1219aside
    FeaturePrefsStore.batch1211.v1219aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1220: anthem mode
internal fun PlayerActivity.showV1220AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1220anthem
    FeaturePrefsStore.batch1211.v1220anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1220: antic mode
internal fun PlayerActivity.showV1220AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1220antic
    FeaturePrefsStore.batch1211.v1220antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1220: anvil mode
internal fun PlayerActivity.showV1220AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1220anvil
    FeaturePrefsStore.batch1211.v1220anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1220: apart mode
internal fun PlayerActivity.showV1220ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1220apart
    FeaturePrefsStore.batch1211.v1220apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1220: apple mode
internal fun PlayerActivity.showV1220AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1220apple
    FeaturePrefsStore.batch1211.v1220apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1220: apply level
internal fun PlayerActivity.showV1220ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1220: arena level
internal fun PlayerActivity.showV1220ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1220: argue level
internal fun PlayerActivity.showV1220ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1220: arise level
internal fun PlayerActivity.showV1220AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1220: armor level
internal fun PlayerActivity.showV1220ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1220: army mode
internal fun PlayerActivity.showV1220ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1220army
    FeaturePrefsStore.batch1211.v1220army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1220: aroma mode
internal fun PlayerActivity.showV1220AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1220aroma
    FeaturePrefsStore.batch1211.v1220aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1220: array mode
internal fun PlayerActivity.showV1220ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1220array
    FeaturePrefsStore.batch1211.v1220array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1220: arrow mode
internal fun PlayerActivity.showV1220ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1220arrow
    FeaturePrefsStore.batch1211.v1220arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1220: aside mode
internal fun PlayerActivity.showV1220AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1220aside
    FeaturePrefsStore.batch1211.v1220aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

