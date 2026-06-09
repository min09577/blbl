package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1341: cold mode
internal fun PlayerActivity.showV1341ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cold
    FeaturePrefsStore.batch1341.v1341cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1341: collar mode
internal fun PlayerActivity.showV1341CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1341collar
    FeaturePrefsStore.batch1341.v1341collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1341: colony mode
internal fun PlayerActivity.showV1341ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1341colony
    FeaturePrefsStore.batch1341.v1341colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1341: color mode
internal fun PlayerActivity.showV1341ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1341color
    FeaturePrefsStore.batch1341.v1341color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1341: combat mode
internal fun PlayerActivity.showV1341CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1341combat
    FeaturePrefsStore.batch1341.v1341combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1341: comedy level
internal fun PlayerActivity.showV1341ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1341: comic level
internal fun PlayerActivity.showV1341ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1341: common level
internal fun PlayerActivity.showV1341CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341common = value
        AppToast.show(this, "common: $value")
    }
}

// v1341: convey level
internal fun PlayerActivity.showV1341ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1341: cook level
internal fun PlayerActivity.showV1341CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1341: cool mode
internal fun PlayerActivity.showV1341CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cool
    FeaturePrefsStore.batch1341.v1341cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1341: copper mode
internal fun PlayerActivity.showV1341CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1341copper
    FeaturePrefsStore.batch1341.v1341copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1341: cord mode
internal fun PlayerActivity.showV1341CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cord
    FeaturePrefsStore.batch1341.v1341cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1341: corn mode
internal fun PlayerActivity.showV1341CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1341corn
    FeaturePrefsStore.batch1341.v1341corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1341: corner mode
internal fun PlayerActivity.showV1341CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1341corner
    FeaturePrefsStore.batch1341.v1341corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1342: cold mode
internal fun PlayerActivity.showV1342ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cold
    FeaturePrefsStore.batch1341.v1342cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1342: collar mode
internal fun PlayerActivity.showV1342CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1342collar
    FeaturePrefsStore.batch1341.v1342collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1342: colony mode
internal fun PlayerActivity.showV1342ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1342colony
    FeaturePrefsStore.batch1341.v1342colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1342: color mode
internal fun PlayerActivity.showV1342ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1342color
    FeaturePrefsStore.batch1341.v1342color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1342: combat mode
internal fun PlayerActivity.showV1342CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1342combat
    FeaturePrefsStore.batch1341.v1342combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1342: comedy level
internal fun PlayerActivity.showV1342ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1342: comic level
internal fun PlayerActivity.showV1342ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1342: common level
internal fun PlayerActivity.showV1342CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342common = value
        AppToast.show(this, "common: $value")
    }
}

// v1342: convey level
internal fun PlayerActivity.showV1342ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1342: cook level
internal fun PlayerActivity.showV1342CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1342: cool mode
internal fun PlayerActivity.showV1342CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cool
    FeaturePrefsStore.batch1341.v1342cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1342: copper mode
internal fun PlayerActivity.showV1342CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1342copper
    FeaturePrefsStore.batch1341.v1342copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1342: cord mode
internal fun PlayerActivity.showV1342CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cord
    FeaturePrefsStore.batch1341.v1342cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1342: corn mode
internal fun PlayerActivity.showV1342CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1342corn
    FeaturePrefsStore.batch1341.v1342corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1342: corner mode
internal fun PlayerActivity.showV1342CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1342corner
    FeaturePrefsStore.batch1341.v1342corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1343: cold mode
internal fun PlayerActivity.showV1343ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cold
    FeaturePrefsStore.batch1341.v1343cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1343: collar mode
internal fun PlayerActivity.showV1343CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1343collar
    FeaturePrefsStore.batch1341.v1343collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1343: colony mode
internal fun PlayerActivity.showV1343ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1343colony
    FeaturePrefsStore.batch1341.v1343colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1343: color mode
internal fun PlayerActivity.showV1343ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1343color
    FeaturePrefsStore.batch1341.v1343color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1343: combat mode
internal fun PlayerActivity.showV1343CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1343combat
    FeaturePrefsStore.batch1341.v1343combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1343: comedy level
internal fun PlayerActivity.showV1343ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1343: comic level
internal fun PlayerActivity.showV1343ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1343: common level
internal fun PlayerActivity.showV1343CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343common = value
        AppToast.show(this, "common: $value")
    }
}

// v1343: convey level
internal fun PlayerActivity.showV1343ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1343: cook level
internal fun PlayerActivity.showV1343CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1343: cool mode
internal fun PlayerActivity.showV1343CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cool
    FeaturePrefsStore.batch1341.v1343cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1343: copper mode
internal fun PlayerActivity.showV1343CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1343copper
    FeaturePrefsStore.batch1341.v1343copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1343: cord mode
internal fun PlayerActivity.showV1343CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cord
    FeaturePrefsStore.batch1341.v1343cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1343: corn mode
internal fun PlayerActivity.showV1343CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1343corn
    FeaturePrefsStore.batch1341.v1343corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1343: corner mode
internal fun PlayerActivity.showV1343CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1343corner
    FeaturePrefsStore.batch1341.v1343corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1344: cold mode
internal fun PlayerActivity.showV1344ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cold
    FeaturePrefsStore.batch1341.v1344cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1344: collar mode
internal fun PlayerActivity.showV1344CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1344collar
    FeaturePrefsStore.batch1341.v1344collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1344: colony mode
internal fun PlayerActivity.showV1344ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1344colony
    FeaturePrefsStore.batch1341.v1344colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1344: color mode
internal fun PlayerActivity.showV1344ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1344color
    FeaturePrefsStore.batch1341.v1344color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1344: combat mode
internal fun PlayerActivity.showV1344CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1344combat
    FeaturePrefsStore.batch1341.v1344combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1344: comedy level
internal fun PlayerActivity.showV1344ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1344: comic level
internal fun PlayerActivity.showV1344ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1344: common level
internal fun PlayerActivity.showV1344CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344common = value
        AppToast.show(this, "common: $value")
    }
}

// v1344: convey level
internal fun PlayerActivity.showV1344ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1344: cook level
internal fun PlayerActivity.showV1344CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1344: cool mode
internal fun PlayerActivity.showV1344CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cool
    FeaturePrefsStore.batch1341.v1344cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1344: copper mode
internal fun PlayerActivity.showV1344CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1344copper
    FeaturePrefsStore.batch1341.v1344copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1344: cord mode
internal fun PlayerActivity.showV1344CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cord
    FeaturePrefsStore.batch1341.v1344cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1344: corn mode
internal fun PlayerActivity.showV1344CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1344corn
    FeaturePrefsStore.batch1341.v1344corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1344: corner mode
internal fun PlayerActivity.showV1344CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1344corner
    FeaturePrefsStore.batch1341.v1344corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1345: cold mode
internal fun PlayerActivity.showV1345ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cold
    FeaturePrefsStore.batch1341.v1345cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1345: collar mode
internal fun PlayerActivity.showV1345CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1345collar
    FeaturePrefsStore.batch1341.v1345collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1345: colony mode
internal fun PlayerActivity.showV1345ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1345colony
    FeaturePrefsStore.batch1341.v1345colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1345: color mode
internal fun PlayerActivity.showV1345ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1345color
    FeaturePrefsStore.batch1341.v1345color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1345: combat mode
internal fun PlayerActivity.showV1345CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1345combat
    FeaturePrefsStore.batch1341.v1345combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1345: comedy level
internal fun PlayerActivity.showV1345ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1345: comic level
internal fun PlayerActivity.showV1345ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1345: common level
internal fun PlayerActivity.showV1345CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345common = value
        AppToast.show(this, "common: $value")
    }
}

// v1345: convey level
internal fun PlayerActivity.showV1345ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1345: cook level
internal fun PlayerActivity.showV1345CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1345: cool mode
internal fun PlayerActivity.showV1345CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cool
    FeaturePrefsStore.batch1341.v1345cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1345: copper mode
internal fun PlayerActivity.showV1345CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1345copper
    FeaturePrefsStore.batch1341.v1345copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1345: cord mode
internal fun PlayerActivity.showV1345CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cord
    FeaturePrefsStore.batch1341.v1345cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1345: corn mode
internal fun PlayerActivity.showV1345CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1345corn
    FeaturePrefsStore.batch1341.v1345corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1345: corner mode
internal fun PlayerActivity.showV1345CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1345corner
    FeaturePrefsStore.batch1341.v1345corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1346: cold mode
internal fun PlayerActivity.showV1346ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cold
    FeaturePrefsStore.batch1341.v1346cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1346: collar mode
internal fun PlayerActivity.showV1346CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1346collar
    FeaturePrefsStore.batch1341.v1346collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1346: colony mode
internal fun PlayerActivity.showV1346ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1346colony
    FeaturePrefsStore.batch1341.v1346colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1346: color mode
internal fun PlayerActivity.showV1346ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1346color
    FeaturePrefsStore.batch1341.v1346color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1346: combat mode
internal fun PlayerActivity.showV1346CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1346combat
    FeaturePrefsStore.batch1341.v1346combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1346: comedy level
internal fun PlayerActivity.showV1346ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1346: comic level
internal fun PlayerActivity.showV1346ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1346: common level
internal fun PlayerActivity.showV1346CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346common = value
        AppToast.show(this, "common: $value")
    }
}

// v1346: convey level
internal fun PlayerActivity.showV1346ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1346: cook level
internal fun PlayerActivity.showV1346CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1346: cool mode
internal fun PlayerActivity.showV1346CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cool
    FeaturePrefsStore.batch1341.v1346cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1346: copper mode
internal fun PlayerActivity.showV1346CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1346copper
    FeaturePrefsStore.batch1341.v1346copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1346: cord mode
internal fun PlayerActivity.showV1346CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cord
    FeaturePrefsStore.batch1341.v1346cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1346: corn mode
internal fun PlayerActivity.showV1346CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1346corn
    FeaturePrefsStore.batch1341.v1346corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1346: corner mode
internal fun PlayerActivity.showV1346CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1346corner
    FeaturePrefsStore.batch1341.v1346corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1347: cold mode
internal fun PlayerActivity.showV1347ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cold
    FeaturePrefsStore.batch1341.v1347cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1347: collar mode
internal fun PlayerActivity.showV1347CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1347collar
    FeaturePrefsStore.batch1341.v1347collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1347: colony mode
internal fun PlayerActivity.showV1347ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1347colony
    FeaturePrefsStore.batch1341.v1347colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1347: color mode
internal fun PlayerActivity.showV1347ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1347color
    FeaturePrefsStore.batch1341.v1347color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1347: combat mode
internal fun PlayerActivity.showV1347CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1347combat
    FeaturePrefsStore.batch1341.v1347combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1347: comedy level
internal fun PlayerActivity.showV1347ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1347: comic level
internal fun PlayerActivity.showV1347ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1347: common level
internal fun PlayerActivity.showV1347CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347common = value
        AppToast.show(this, "common: $value")
    }
}

// v1347: convey level
internal fun PlayerActivity.showV1347ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1347: cook level
internal fun PlayerActivity.showV1347CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1347: cool mode
internal fun PlayerActivity.showV1347CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cool
    FeaturePrefsStore.batch1341.v1347cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1347: copper mode
internal fun PlayerActivity.showV1347CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1347copper
    FeaturePrefsStore.batch1341.v1347copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1347: cord mode
internal fun PlayerActivity.showV1347CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cord
    FeaturePrefsStore.batch1341.v1347cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1347: corn mode
internal fun PlayerActivity.showV1347CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1347corn
    FeaturePrefsStore.batch1341.v1347corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1347: corner mode
internal fun PlayerActivity.showV1347CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1347corner
    FeaturePrefsStore.batch1341.v1347corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1348: cold mode
internal fun PlayerActivity.showV1348ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cold
    FeaturePrefsStore.batch1341.v1348cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1348: collar mode
internal fun PlayerActivity.showV1348CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1348collar
    FeaturePrefsStore.batch1341.v1348collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1348: colony mode
internal fun PlayerActivity.showV1348ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1348colony
    FeaturePrefsStore.batch1341.v1348colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1348: color mode
internal fun PlayerActivity.showV1348ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1348color
    FeaturePrefsStore.batch1341.v1348color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1348: combat mode
internal fun PlayerActivity.showV1348CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1348combat
    FeaturePrefsStore.batch1341.v1348combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1348: comedy level
internal fun PlayerActivity.showV1348ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1348: comic level
internal fun PlayerActivity.showV1348ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1348: common level
internal fun PlayerActivity.showV1348CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348common = value
        AppToast.show(this, "common: $value")
    }
}

// v1348: convey level
internal fun PlayerActivity.showV1348ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1348: cook level
internal fun PlayerActivity.showV1348CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1348: cool mode
internal fun PlayerActivity.showV1348CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cool
    FeaturePrefsStore.batch1341.v1348cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1348: copper mode
internal fun PlayerActivity.showV1348CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1348copper
    FeaturePrefsStore.batch1341.v1348copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1348: cord mode
internal fun PlayerActivity.showV1348CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cord
    FeaturePrefsStore.batch1341.v1348cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1348: corn mode
internal fun PlayerActivity.showV1348CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1348corn
    FeaturePrefsStore.batch1341.v1348corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1348: corner mode
internal fun PlayerActivity.showV1348CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1348corner
    FeaturePrefsStore.batch1341.v1348corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1349: cold mode
internal fun PlayerActivity.showV1349ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cold
    FeaturePrefsStore.batch1341.v1349cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1349: collar mode
internal fun PlayerActivity.showV1349CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1349collar
    FeaturePrefsStore.batch1341.v1349collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1349: colony mode
internal fun PlayerActivity.showV1349ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1349colony
    FeaturePrefsStore.batch1341.v1349colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1349: color mode
internal fun PlayerActivity.showV1349ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1349color
    FeaturePrefsStore.batch1341.v1349color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1349: combat mode
internal fun PlayerActivity.showV1349CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1349combat
    FeaturePrefsStore.batch1341.v1349combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1349: comedy level
internal fun PlayerActivity.showV1349ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1349: comic level
internal fun PlayerActivity.showV1349ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1349: common level
internal fun PlayerActivity.showV1349CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349common = value
        AppToast.show(this, "common: $value")
    }
}

// v1349: convey level
internal fun PlayerActivity.showV1349ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1349: cook level
internal fun PlayerActivity.showV1349CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1349: cool mode
internal fun PlayerActivity.showV1349CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cool
    FeaturePrefsStore.batch1341.v1349cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1349: copper mode
internal fun PlayerActivity.showV1349CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1349copper
    FeaturePrefsStore.batch1341.v1349copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1349: cord mode
internal fun PlayerActivity.showV1349CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cord
    FeaturePrefsStore.batch1341.v1349cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1349: corn mode
internal fun PlayerActivity.showV1349CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1349corn
    FeaturePrefsStore.batch1341.v1349corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1349: corner mode
internal fun PlayerActivity.showV1349CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1349corner
    FeaturePrefsStore.batch1341.v1349corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1350: cold mode
internal fun PlayerActivity.showV1350ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cold
    FeaturePrefsStore.batch1341.v1350cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1350: collar mode
internal fun PlayerActivity.showV1350CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1350collar
    FeaturePrefsStore.batch1341.v1350collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1350: colony mode
internal fun PlayerActivity.showV1350ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1350colony
    FeaturePrefsStore.batch1341.v1350colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1350: color mode
internal fun PlayerActivity.showV1350ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1350color
    FeaturePrefsStore.batch1341.v1350color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1350: combat mode
internal fun PlayerActivity.showV1350CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1350combat
    FeaturePrefsStore.batch1341.v1350combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1350: comedy level
internal fun PlayerActivity.showV1350ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1350: comic level
internal fun PlayerActivity.showV1350ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1350: common level
internal fun PlayerActivity.showV1350CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350common = value
        AppToast.show(this, "common: $value")
    }
}

// v1350: convey level
internal fun PlayerActivity.showV1350ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1350: cook level
internal fun PlayerActivity.showV1350CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1350: cool mode
internal fun PlayerActivity.showV1350CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cool
    FeaturePrefsStore.batch1341.v1350cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1350: copper mode
internal fun PlayerActivity.showV1350CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1350copper
    FeaturePrefsStore.batch1341.v1350copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1350: cord mode
internal fun PlayerActivity.showV1350CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cord
    FeaturePrefsStore.batch1341.v1350cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1350: corn mode
internal fun PlayerActivity.showV1350CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1350corn
    FeaturePrefsStore.batch1341.v1350corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1350: corner mode
internal fun PlayerActivity.showV1350CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1350corner
    FeaturePrefsStore.batch1341.v1350corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

