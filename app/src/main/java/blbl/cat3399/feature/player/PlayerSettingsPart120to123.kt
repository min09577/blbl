package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1381: dense mode
internal fun PlayerActivity.showV1381DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1381dense
    FeaturePrefsStore.batch1381.v1381dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1381: depart mode
internal fun PlayerActivity.showV1381DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1381depart
    FeaturePrefsStore.batch1381.v1381depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1381: depot mode
internal fun PlayerActivity.showV1381DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1381depot
    FeaturePrefsStore.batch1381.v1381depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1381: deputy mode
internal fun PlayerActivity.showV1381DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1381deputy
    FeaturePrefsStore.batch1381.v1381deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1381: desert mode
internal fun PlayerActivity.showV1381DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1381desert
    FeaturePrefsStore.batch1381.v1381desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1381: desire level
internal fun PlayerActivity.showV1381DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1381desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1381desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1381: detail level
internal fun PlayerActivity.showV1381DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1381detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1381detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1381: devote level
internal fun PlayerActivity.showV1381DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1381devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1381devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1381: dialog level
internal fun PlayerActivity.showV1381DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1381dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1381dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1381: diamond level
internal fun PlayerActivity.showV1381DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1381diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1381diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1381: diary mode
internal fun PlayerActivity.showV1381DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1381diary
    FeaturePrefsStore.batch1381.v1381diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1381: disco mode
internal fun PlayerActivity.showV1381DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1381disco
    FeaturePrefsStore.batch1381.v1381disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1381: ditch mode
internal fun PlayerActivity.showV1381DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1381ditch
    FeaturePrefsStore.batch1381.v1381ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1381: dizzy mode
internal fun PlayerActivity.showV1381DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1381dizzy
    FeaturePrefsStore.batch1381.v1381dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1381: dodge mode
internal fun PlayerActivity.showV1381DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1381dodge
    FeaturePrefsStore.batch1381.v1381dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1382: dense mode
internal fun PlayerActivity.showV1382DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1382dense
    FeaturePrefsStore.batch1381.v1382dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1382: depart mode
internal fun PlayerActivity.showV1382DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1382depart
    FeaturePrefsStore.batch1381.v1382depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1382: depot mode
internal fun PlayerActivity.showV1382DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1382depot
    FeaturePrefsStore.batch1381.v1382depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1382: deputy mode
internal fun PlayerActivity.showV1382DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1382deputy
    FeaturePrefsStore.batch1381.v1382deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1382: desert mode
internal fun PlayerActivity.showV1382DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1382desert
    FeaturePrefsStore.batch1381.v1382desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1382: desire level
internal fun PlayerActivity.showV1382DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1382desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1382desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1382: detail level
internal fun PlayerActivity.showV1382DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1382detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1382detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1382: devote level
internal fun PlayerActivity.showV1382DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1382devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1382devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1382: dialog level
internal fun PlayerActivity.showV1382DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1382dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1382dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1382: diamond level
internal fun PlayerActivity.showV1382DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1382diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1382diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1382: diary mode
internal fun PlayerActivity.showV1382DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1382diary
    FeaturePrefsStore.batch1381.v1382diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1382: disco mode
internal fun PlayerActivity.showV1382DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1382disco
    FeaturePrefsStore.batch1381.v1382disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1382: ditch mode
internal fun PlayerActivity.showV1382DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1382ditch
    FeaturePrefsStore.batch1381.v1382ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1382: dizzy mode
internal fun PlayerActivity.showV1382DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1382dizzy
    FeaturePrefsStore.batch1381.v1382dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1382: dodge mode
internal fun PlayerActivity.showV1382DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1382dodge
    FeaturePrefsStore.batch1381.v1382dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1383: dense mode
internal fun PlayerActivity.showV1383DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1383dense
    FeaturePrefsStore.batch1381.v1383dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1383: depart mode
internal fun PlayerActivity.showV1383DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1383depart
    FeaturePrefsStore.batch1381.v1383depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1383: depot mode
internal fun PlayerActivity.showV1383DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1383depot
    FeaturePrefsStore.batch1381.v1383depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1383: deputy mode
internal fun PlayerActivity.showV1383DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1383deputy
    FeaturePrefsStore.batch1381.v1383deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1383: desert mode
internal fun PlayerActivity.showV1383DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1383desert
    FeaturePrefsStore.batch1381.v1383desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1383: desire level
internal fun PlayerActivity.showV1383DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1383desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1383desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1383: detail level
internal fun PlayerActivity.showV1383DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1383detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1383detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1383: devote level
internal fun PlayerActivity.showV1383DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1383devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1383devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1383: dialog level
internal fun PlayerActivity.showV1383DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1383dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1383dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1383: diamond level
internal fun PlayerActivity.showV1383DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1383diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1383diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1383: diary mode
internal fun PlayerActivity.showV1383DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1383diary
    FeaturePrefsStore.batch1381.v1383diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1383: disco mode
internal fun PlayerActivity.showV1383DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1383disco
    FeaturePrefsStore.batch1381.v1383disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1383: ditch mode
internal fun PlayerActivity.showV1383DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1383ditch
    FeaturePrefsStore.batch1381.v1383ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1383: dizzy mode
internal fun PlayerActivity.showV1383DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1383dizzy
    FeaturePrefsStore.batch1381.v1383dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1383: dodge mode
internal fun PlayerActivity.showV1383DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1383dodge
    FeaturePrefsStore.batch1381.v1383dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1384: dense mode
internal fun PlayerActivity.showV1384DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1384dense
    FeaturePrefsStore.batch1381.v1384dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1384: depart mode
internal fun PlayerActivity.showV1384DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1384depart
    FeaturePrefsStore.batch1381.v1384depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1384: depot mode
internal fun PlayerActivity.showV1384DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1384depot
    FeaturePrefsStore.batch1381.v1384depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1384: deputy mode
internal fun PlayerActivity.showV1384DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1384deputy
    FeaturePrefsStore.batch1381.v1384deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1384: desert mode
internal fun PlayerActivity.showV1384DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1384desert
    FeaturePrefsStore.batch1381.v1384desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1384: desire level
internal fun PlayerActivity.showV1384DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1384desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1384desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1384: detail level
internal fun PlayerActivity.showV1384DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1384detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1384detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1384: devote level
internal fun PlayerActivity.showV1384DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1384devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1384devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1384: dialog level
internal fun PlayerActivity.showV1384DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1384dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1384dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1384: diamond level
internal fun PlayerActivity.showV1384DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1384diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1384diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1384: diary mode
internal fun PlayerActivity.showV1384DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1384diary
    FeaturePrefsStore.batch1381.v1384diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1384: disco mode
internal fun PlayerActivity.showV1384DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1384disco
    FeaturePrefsStore.batch1381.v1384disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1384: ditch mode
internal fun PlayerActivity.showV1384DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1384ditch
    FeaturePrefsStore.batch1381.v1384ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1384: dizzy mode
internal fun PlayerActivity.showV1384DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1384dizzy
    FeaturePrefsStore.batch1381.v1384dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1384: dodge mode
internal fun PlayerActivity.showV1384DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1384dodge
    FeaturePrefsStore.batch1381.v1384dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1385: dense mode
internal fun PlayerActivity.showV1385DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1385dense
    FeaturePrefsStore.batch1381.v1385dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1385: depart mode
internal fun PlayerActivity.showV1385DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1385depart
    FeaturePrefsStore.batch1381.v1385depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1385: depot mode
internal fun PlayerActivity.showV1385DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1385depot
    FeaturePrefsStore.batch1381.v1385depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1385: deputy mode
internal fun PlayerActivity.showV1385DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1385deputy
    FeaturePrefsStore.batch1381.v1385deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1385: desert mode
internal fun PlayerActivity.showV1385DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1385desert
    FeaturePrefsStore.batch1381.v1385desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1385: desire level
internal fun PlayerActivity.showV1385DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1385desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1385desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1385: detail level
internal fun PlayerActivity.showV1385DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1385detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1385detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1385: devote level
internal fun PlayerActivity.showV1385DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1385devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1385devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1385: dialog level
internal fun PlayerActivity.showV1385DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1385dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1385dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1385: diamond level
internal fun PlayerActivity.showV1385DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1385diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1385diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1385: diary mode
internal fun PlayerActivity.showV1385DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1385diary
    FeaturePrefsStore.batch1381.v1385diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1385: disco mode
internal fun PlayerActivity.showV1385DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1385disco
    FeaturePrefsStore.batch1381.v1385disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1385: ditch mode
internal fun PlayerActivity.showV1385DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1385ditch
    FeaturePrefsStore.batch1381.v1385ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1385: dizzy mode
internal fun PlayerActivity.showV1385DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1385dizzy
    FeaturePrefsStore.batch1381.v1385dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1385: dodge mode
internal fun PlayerActivity.showV1385DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1385dodge
    FeaturePrefsStore.batch1381.v1385dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1386: dense mode
internal fun PlayerActivity.showV1386DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1386dense
    FeaturePrefsStore.batch1381.v1386dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1386: depart mode
internal fun PlayerActivity.showV1386DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1386depart
    FeaturePrefsStore.batch1381.v1386depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1386: depot mode
internal fun PlayerActivity.showV1386DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1386depot
    FeaturePrefsStore.batch1381.v1386depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1386: deputy mode
internal fun PlayerActivity.showV1386DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1386deputy
    FeaturePrefsStore.batch1381.v1386deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1386: desert mode
internal fun PlayerActivity.showV1386DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1386desert
    FeaturePrefsStore.batch1381.v1386desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1386: desire level
internal fun PlayerActivity.showV1386DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1386desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1386desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1386: detail level
internal fun PlayerActivity.showV1386DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1386detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1386detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1386: devote level
internal fun PlayerActivity.showV1386DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1386devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1386devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1386: dialog level
internal fun PlayerActivity.showV1386DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1386dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1386dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1386: diamond level
internal fun PlayerActivity.showV1386DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1386diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1386diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1386: diary mode
internal fun PlayerActivity.showV1386DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1386diary
    FeaturePrefsStore.batch1381.v1386diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1386: disco mode
internal fun PlayerActivity.showV1386DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1386disco
    FeaturePrefsStore.batch1381.v1386disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1386: ditch mode
internal fun PlayerActivity.showV1386DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1386ditch
    FeaturePrefsStore.batch1381.v1386ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1386: dizzy mode
internal fun PlayerActivity.showV1386DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1386dizzy
    FeaturePrefsStore.batch1381.v1386dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1386: dodge mode
internal fun PlayerActivity.showV1386DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1386dodge
    FeaturePrefsStore.batch1381.v1386dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1387: dense mode
internal fun PlayerActivity.showV1387DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1387dense
    FeaturePrefsStore.batch1381.v1387dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1387: depart mode
internal fun PlayerActivity.showV1387DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1387depart
    FeaturePrefsStore.batch1381.v1387depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1387: depot mode
internal fun PlayerActivity.showV1387DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1387depot
    FeaturePrefsStore.batch1381.v1387depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1387: deputy mode
internal fun PlayerActivity.showV1387DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1387deputy
    FeaturePrefsStore.batch1381.v1387deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1387: desert mode
internal fun PlayerActivity.showV1387DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1387desert
    FeaturePrefsStore.batch1381.v1387desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1387: desire level
internal fun PlayerActivity.showV1387DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1387desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1387desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1387: detail level
internal fun PlayerActivity.showV1387DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1387detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1387detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1387: devote level
internal fun PlayerActivity.showV1387DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1387devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1387devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1387: dialog level
internal fun PlayerActivity.showV1387DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1387dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1387dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1387: diamond level
internal fun PlayerActivity.showV1387DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1387diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1387diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1387: diary mode
internal fun PlayerActivity.showV1387DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1387diary
    FeaturePrefsStore.batch1381.v1387diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1387: disco mode
internal fun PlayerActivity.showV1387DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1387disco
    FeaturePrefsStore.batch1381.v1387disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1387: ditch mode
internal fun PlayerActivity.showV1387DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1387ditch
    FeaturePrefsStore.batch1381.v1387ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1387: dizzy mode
internal fun PlayerActivity.showV1387DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1387dizzy
    FeaturePrefsStore.batch1381.v1387dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1387: dodge mode
internal fun PlayerActivity.showV1387DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1387dodge
    FeaturePrefsStore.batch1381.v1387dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1388: dense mode
internal fun PlayerActivity.showV1388DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1388dense
    FeaturePrefsStore.batch1381.v1388dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1388: depart mode
internal fun PlayerActivity.showV1388DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1388depart
    FeaturePrefsStore.batch1381.v1388depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1388: depot mode
internal fun PlayerActivity.showV1388DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1388depot
    FeaturePrefsStore.batch1381.v1388depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1388: deputy mode
internal fun PlayerActivity.showV1388DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1388deputy
    FeaturePrefsStore.batch1381.v1388deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1388: desert mode
internal fun PlayerActivity.showV1388DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1388desert
    FeaturePrefsStore.batch1381.v1388desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1388: desire level
internal fun PlayerActivity.showV1388DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1388desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1388desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1388: detail level
internal fun PlayerActivity.showV1388DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1388detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1388detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1388: devote level
internal fun PlayerActivity.showV1388DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1388devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1388devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1388: dialog level
internal fun PlayerActivity.showV1388DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1388dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1388dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1388: diamond level
internal fun PlayerActivity.showV1388DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1388diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1388diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1388: diary mode
internal fun PlayerActivity.showV1388DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1388diary
    FeaturePrefsStore.batch1381.v1388diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1388: disco mode
internal fun PlayerActivity.showV1388DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1388disco
    FeaturePrefsStore.batch1381.v1388disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1388: ditch mode
internal fun PlayerActivity.showV1388DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1388ditch
    FeaturePrefsStore.batch1381.v1388ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1388: dizzy mode
internal fun PlayerActivity.showV1388DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1388dizzy
    FeaturePrefsStore.batch1381.v1388dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1388: dodge mode
internal fun PlayerActivity.showV1388DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1388dodge
    FeaturePrefsStore.batch1381.v1388dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1389: dense mode
internal fun PlayerActivity.showV1389DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1389dense
    FeaturePrefsStore.batch1381.v1389dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1389: depart mode
internal fun PlayerActivity.showV1389DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1389depart
    FeaturePrefsStore.batch1381.v1389depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1389: depot mode
internal fun PlayerActivity.showV1389DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1389depot
    FeaturePrefsStore.batch1381.v1389depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1389: deputy mode
internal fun PlayerActivity.showV1389DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1389deputy
    FeaturePrefsStore.batch1381.v1389deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1389: desert mode
internal fun PlayerActivity.showV1389DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1389desert
    FeaturePrefsStore.batch1381.v1389desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1389: desire level
internal fun PlayerActivity.showV1389DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1389desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1389desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1389: detail level
internal fun PlayerActivity.showV1389DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1389detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1389detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1389: devote level
internal fun PlayerActivity.showV1389DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1389devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1389devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1389: dialog level
internal fun PlayerActivity.showV1389DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1389dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1389dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1389: diamond level
internal fun PlayerActivity.showV1389DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1389diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1389diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1389: diary mode
internal fun PlayerActivity.showV1389DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1389diary
    FeaturePrefsStore.batch1381.v1389diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1389: disco mode
internal fun PlayerActivity.showV1389DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1389disco
    FeaturePrefsStore.batch1381.v1389disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1389: ditch mode
internal fun PlayerActivity.showV1389DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1389ditch
    FeaturePrefsStore.batch1381.v1389ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1389: dizzy mode
internal fun PlayerActivity.showV1389DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1389dizzy
    FeaturePrefsStore.batch1381.v1389dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1389: dodge mode
internal fun PlayerActivity.showV1389DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1389dodge
    FeaturePrefsStore.batch1381.v1389dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

// v1390: dense mode
internal fun PlayerActivity.showV1390DenseToggle() {
    val current = FeaturePrefsStore.batch1381.v1390dense
    FeaturePrefsStore.batch1381.v1390dense = !current
    AppToast.show(this, "dense: ${if (!current) "ON" else "OFF"}")
}

// v1390: depart mode
internal fun PlayerActivity.showV1390DepartToggle() {
    val current = FeaturePrefsStore.batch1381.v1390depart
    FeaturePrefsStore.batch1381.v1390depart = !current
    AppToast.show(this, "depart: ${if (!current) "ON" else "OFF"}")
}

// v1390: depot mode
internal fun PlayerActivity.showV1390DepotToggle() {
    val current = FeaturePrefsStore.batch1381.v1390depot
    FeaturePrefsStore.batch1381.v1390depot = !current
    AppToast.show(this, "depot: ${if (!current) "ON" else "OFF"}")
}

// v1390: deputy mode
internal fun PlayerActivity.showV1390DeputyToggle() {
    val current = FeaturePrefsStore.batch1381.v1390deputy
    FeaturePrefsStore.batch1381.v1390deputy = !current
    AppToast.show(this, "deputy: ${if (!current) "ON" else "OFF"}")
}

// v1390: desert mode
internal fun PlayerActivity.showV1390DesertToggle() {
    val current = FeaturePrefsStore.batch1381.v1390desert
    FeaturePrefsStore.batch1381.v1390desert = !current
    AppToast.show(this, "desert: ${if (!current) "ON" else "OFF"}")
}

// v1390: desire level
internal fun PlayerActivity.showV1390DesireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1390desire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1390desire = value
        AppToast.show(this, "desire: $value")
    }
}

// v1390: detail level
internal fun PlayerActivity.showV1390DetailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1390detail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1390detail = value
        AppToast.show(this, "detail: $value")
    }
}

// v1390: devote level
internal fun PlayerActivity.showV1390DevoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1390devote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1390devote = value
        AppToast.show(this, "devote: $value")
    }
}

// v1390: dialog level
internal fun PlayerActivity.showV1390DialogDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1390dialog).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dialog level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1390dialog = value
        AppToast.show(this, "dialog: $value")
    }
}

// v1390: diamond level
internal fun PlayerActivity.showV1390DiamondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1381.v1390diamond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diamond level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1381.v1390diamond = value
        AppToast.show(this, "diamond: $value")
    }
}

// v1390: diary mode
internal fun PlayerActivity.showV1390DiaryToggle() {
    val current = FeaturePrefsStore.batch1381.v1390diary
    FeaturePrefsStore.batch1381.v1390diary = !current
    AppToast.show(this, "diary: ${if (!current) "ON" else "OFF"}")
}

// v1390: disco mode
internal fun PlayerActivity.showV1390DiscoToggle() {
    val current = FeaturePrefsStore.batch1381.v1390disco
    FeaturePrefsStore.batch1381.v1390disco = !current
    AppToast.show(this, "disco: ${if (!current) "ON" else "OFF"}")
}

// v1390: ditch mode
internal fun PlayerActivity.showV1390DitchToggle() {
    val current = FeaturePrefsStore.batch1381.v1390ditch
    FeaturePrefsStore.batch1381.v1390ditch = !current
    AppToast.show(this, "ditch: ${if (!current) "ON" else "OFF"}")
}

// v1390: dizzy mode
internal fun PlayerActivity.showV1390DizzyToggle() {
    val current = FeaturePrefsStore.batch1381.v1390dizzy
    FeaturePrefsStore.batch1381.v1390dizzy = !current
    AppToast.show(this, "dizzy: ${if (!current) "ON" else "OFF"}")
}

// v1390: dodge mode
internal fun PlayerActivity.showV1390DodgeToggle() {
    val current = FeaturePrefsStore.batch1381.v1390dodge
    FeaturePrefsStore.batch1381.v1390dodge = !current
    AppToast.show(this, "dodge: ${if (!current) "ON" else "OFF"}")
}

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

// v1401: duck mode
internal fun PlayerActivity.showV1401DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1401duck
    FeaturePrefsStore.batch1401.v1401duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1401: dumb mode
internal fun PlayerActivity.showV1401DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dumb
    FeaturePrefsStore.batch1401.v1401dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1401: dune mode
internal fun PlayerActivity.showV1401DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dune
    FeaturePrefsStore.batch1401.v1401dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1401: dust mode
internal fun PlayerActivity.showV1401DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dust
    FeaturePrefsStore.batch1401.v1401dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1401: duty mode
internal fun PlayerActivity.showV1401DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1401duty
    FeaturePrefsStore.batch1401.v1401duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1401: eager level
internal fun PlayerActivity.showV1401EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1401: ear level
internal fun PlayerActivity.showV1401EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1401: early level
internal fun PlayerActivity.showV1401EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401early = value
        AppToast.show(this, "early: $value")
    }
}

// v1401: earn level
internal fun PlayerActivity.showV1401EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1401: earth level
internal fun PlayerActivity.showV1401EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1401: ease mode
internal fun PlayerActivity.showV1401EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1401ease
    FeaturePrefsStore.batch1401.v1401ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1401: east mode
internal fun PlayerActivity.showV1401EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1401east
    FeaturePrefsStore.batch1401.v1401east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1401: easy mode
internal fun PlayerActivity.showV1401EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1401easy
    FeaturePrefsStore.batch1401.v1401easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1401: eclipse mode
internal fun PlayerActivity.showV1401EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1401eclipse
    FeaturePrefsStore.batch1401.v1401eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1401: educate mode
internal fun PlayerActivity.showV1401EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1401educate
    FeaturePrefsStore.batch1401.v1401educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1402: duck mode
internal fun PlayerActivity.showV1402DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1402duck
    FeaturePrefsStore.batch1401.v1402duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1402: dumb mode
internal fun PlayerActivity.showV1402DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dumb
    FeaturePrefsStore.batch1401.v1402dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1402: dune mode
internal fun PlayerActivity.showV1402DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dune
    FeaturePrefsStore.batch1401.v1402dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1402: dust mode
internal fun PlayerActivity.showV1402DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dust
    FeaturePrefsStore.batch1401.v1402dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1402: duty mode
internal fun PlayerActivity.showV1402DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1402duty
    FeaturePrefsStore.batch1401.v1402duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1402: eager level
internal fun PlayerActivity.showV1402EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1402: ear level
internal fun PlayerActivity.showV1402EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1402: early level
internal fun PlayerActivity.showV1402EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402early = value
        AppToast.show(this, "early: $value")
    }
}

// v1402: earn level
internal fun PlayerActivity.showV1402EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1402: earth level
internal fun PlayerActivity.showV1402EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1402: ease mode
internal fun PlayerActivity.showV1402EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1402ease
    FeaturePrefsStore.batch1401.v1402ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1402: east mode
internal fun PlayerActivity.showV1402EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1402east
    FeaturePrefsStore.batch1401.v1402east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1402: easy mode
internal fun PlayerActivity.showV1402EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1402easy
    FeaturePrefsStore.batch1401.v1402easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1402: eclipse mode
internal fun PlayerActivity.showV1402EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1402eclipse
    FeaturePrefsStore.batch1401.v1402eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1402: educate mode
internal fun PlayerActivity.showV1402EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1402educate
    FeaturePrefsStore.batch1401.v1402educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1403: duck mode
internal fun PlayerActivity.showV1403DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1403duck
    FeaturePrefsStore.batch1401.v1403duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1403: dumb mode
internal fun PlayerActivity.showV1403DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dumb
    FeaturePrefsStore.batch1401.v1403dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1403: dune mode
internal fun PlayerActivity.showV1403DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dune
    FeaturePrefsStore.batch1401.v1403dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1403: dust mode
internal fun PlayerActivity.showV1403DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dust
    FeaturePrefsStore.batch1401.v1403dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1403: duty mode
internal fun PlayerActivity.showV1403DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1403duty
    FeaturePrefsStore.batch1401.v1403duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1403: eager level
internal fun PlayerActivity.showV1403EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1403: ear level
internal fun PlayerActivity.showV1403EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1403: early level
internal fun PlayerActivity.showV1403EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403early = value
        AppToast.show(this, "early: $value")
    }
}

// v1403: earn level
internal fun PlayerActivity.showV1403EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1403: earth level
internal fun PlayerActivity.showV1403EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1403: ease mode
internal fun PlayerActivity.showV1403EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1403ease
    FeaturePrefsStore.batch1401.v1403ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1403: east mode
internal fun PlayerActivity.showV1403EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1403east
    FeaturePrefsStore.batch1401.v1403east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1403: easy mode
internal fun PlayerActivity.showV1403EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1403easy
    FeaturePrefsStore.batch1401.v1403easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1403: eclipse mode
internal fun PlayerActivity.showV1403EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1403eclipse
    FeaturePrefsStore.batch1401.v1403eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1403: educate mode
internal fun PlayerActivity.showV1403EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1403educate
    FeaturePrefsStore.batch1401.v1403educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1404: duck mode
internal fun PlayerActivity.showV1404DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1404duck
    FeaturePrefsStore.batch1401.v1404duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1404: dumb mode
internal fun PlayerActivity.showV1404DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dumb
    FeaturePrefsStore.batch1401.v1404dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1404: dune mode
internal fun PlayerActivity.showV1404DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dune
    FeaturePrefsStore.batch1401.v1404dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1404: dust mode
internal fun PlayerActivity.showV1404DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dust
    FeaturePrefsStore.batch1401.v1404dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1404: duty mode
internal fun PlayerActivity.showV1404DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1404duty
    FeaturePrefsStore.batch1401.v1404duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1404: eager level
internal fun PlayerActivity.showV1404EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1404: ear level
internal fun PlayerActivity.showV1404EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1404: early level
internal fun PlayerActivity.showV1404EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404early = value
        AppToast.show(this, "early: $value")
    }
}

// v1404: earn level
internal fun PlayerActivity.showV1404EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1404: earth level
internal fun PlayerActivity.showV1404EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1404: ease mode
internal fun PlayerActivity.showV1404EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1404ease
    FeaturePrefsStore.batch1401.v1404ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1404: east mode
internal fun PlayerActivity.showV1404EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1404east
    FeaturePrefsStore.batch1401.v1404east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1404: easy mode
internal fun PlayerActivity.showV1404EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1404easy
    FeaturePrefsStore.batch1401.v1404easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1404: eclipse mode
internal fun PlayerActivity.showV1404EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1404eclipse
    FeaturePrefsStore.batch1401.v1404eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1404: educate mode
internal fun PlayerActivity.showV1404EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1404educate
    FeaturePrefsStore.batch1401.v1404educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1405: duck mode
internal fun PlayerActivity.showV1405DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1405duck
    FeaturePrefsStore.batch1401.v1405duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1405: dumb mode
internal fun PlayerActivity.showV1405DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dumb
    FeaturePrefsStore.batch1401.v1405dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1405: dune mode
internal fun PlayerActivity.showV1405DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dune
    FeaturePrefsStore.batch1401.v1405dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1405: dust mode
internal fun PlayerActivity.showV1405DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dust
    FeaturePrefsStore.batch1401.v1405dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1405: duty mode
internal fun PlayerActivity.showV1405DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1405duty
    FeaturePrefsStore.batch1401.v1405duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1405: eager level
internal fun PlayerActivity.showV1405EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1405: ear level
internal fun PlayerActivity.showV1405EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1405: early level
internal fun PlayerActivity.showV1405EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405early = value
        AppToast.show(this, "early: $value")
    }
}

// v1405: earn level
internal fun PlayerActivity.showV1405EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1405: earth level
internal fun PlayerActivity.showV1405EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1405: ease mode
internal fun PlayerActivity.showV1405EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1405ease
    FeaturePrefsStore.batch1401.v1405ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1405: east mode
internal fun PlayerActivity.showV1405EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1405east
    FeaturePrefsStore.batch1401.v1405east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1405: easy mode
internal fun PlayerActivity.showV1405EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1405easy
    FeaturePrefsStore.batch1401.v1405easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1405: eclipse mode
internal fun PlayerActivity.showV1405EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1405eclipse
    FeaturePrefsStore.batch1401.v1405eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1405: educate mode
internal fun PlayerActivity.showV1405EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1405educate
    FeaturePrefsStore.batch1401.v1405educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1406: duck mode
internal fun PlayerActivity.showV1406DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1406duck
    FeaturePrefsStore.batch1401.v1406duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1406: dumb mode
internal fun PlayerActivity.showV1406DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dumb
    FeaturePrefsStore.batch1401.v1406dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1406: dune mode
internal fun PlayerActivity.showV1406DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dune
    FeaturePrefsStore.batch1401.v1406dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1406: dust mode
internal fun PlayerActivity.showV1406DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dust
    FeaturePrefsStore.batch1401.v1406dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1406: duty mode
internal fun PlayerActivity.showV1406DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1406duty
    FeaturePrefsStore.batch1401.v1406duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1406: eager level
internal fun PlayerActivity.showV1406EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1406: ear level
internal fun PlayerActivity.showV1406EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1406: early level
internal fun PlayerActivity.showV1406EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406early = value
        AppToast.show(this, "early: $value")
    }
}

// v1406: earn level
internal fun PlayerActivity.showV1406EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1406: earth level
internal fun PlayerActivity.showV1406EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1406: ease mode
internal fun PlayerActivity.showV1406EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1406ease
    FeaturePrefsStore.batch1401.v1406ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1406: east mode
internal fun PlayerActivity.showV1406EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1406east
    FeaturePrefsStore.batch1401.v1406east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1406: easy mode
internal fun PlayerActivity.showV1406EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1406easy
    FeaturePrefsStore.batch1401.v1406easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1406: eclipse mode
internal fun PlayerActivity.showV1406EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1406eclipse
    FeaturePrefsStore.batch1401.v1406eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1406: educate mode
internal fun PlayerActivity.showV1406EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1406educate
    FeaturePrefsStore.batch1401.v1406educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1407: duck mode
internal fun PlayerActivity.showV1407DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1407duck
    FeaturePrefsStore.batch1401.v1407duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1407: dumb mode
internal fun PlayerActivity.showV1407DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dumb
    FeaturePrefsStore.batch1401.v1407dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1407: dune mode
internal fun PlayerActivity.showV1407DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dune
    FeaturePrefsStore.batch1401.v1407dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1407: dust mode
internal fun PlayerActivity.showV1407DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dust
    FeaturePrefsStore.batch1401.v1407dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1407: duty mode
internal fun PlayerActivity.showV1407DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1407duty
    FeaturePrefsStore.batch1401.v1407duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1407: eager level
internal fun PlayerActivity.showV1407EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1407: ear level
internal fun PlayerActivity.showV1407EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1407: early level
internal fun PlayerActivity.showV1407EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407early = value
        AppToast.show(this, "early: $value")
    }
}

// v1407: earn level
internal fun PlayerActivity.showV1407EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1407: earth level
internal fun PlayerActivity.showV1407EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1407: ease mode
internal fun PlayerActivity.showV1407EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1407ease
    FeaturePrefsStore.batch1401.v1407ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1407: east mode
internal fun PlayerActivity.showV1407EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1407east
    FeaturePrefsStore.batch1401.v1407east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1407: easy mode
internal fun PlayerActivity.showV1407EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1407easy
    FeaturePrefsStore.batch1401.v1407easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1407: eclipse mode
internal fun PlayerActivity.showV1407EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1407eclipse
    FeaturePrefsStore.batch1401.v1407eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1407: educate mode
internal fun PlayerActivity.showV1407EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1407educate
    FeaturePrefsStore.batch1401.v1407educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1408: duck mode
internal fun PlayerActivity.showV1408DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1408duck
    FeaturePrefsStore.batch1401.v1408duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1408: dumb mode
internal fun PlayerActivity.showV1408DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dumb
    FeaturePrefsStore.batch1401.v1408dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1408: dune mode
internal fun PlayerActivity.showV1408DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dune
    FeaturePrefsStore.batch1401.v1408dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1408: dust mode
internal fun PlayerActivity.showV1408DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dust
    FeaturePrefsStore.batch1401.v1408dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1408: duty mode
internal fun PlayerActivity.showV1408DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1408duty
    FeaturePrefsStore.batch1401.v1408duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1408: eager level
internal fun PlayerActivity.showV1408EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1408: ear level
internal fun PlayerActivity.showV1408EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1408: early level
internal fun PlayerActivity.showV1408EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408early = value
        AppToast.show(this, "early: $value")
    }
}

// v1408: earn level
internal fun PlayerActivity.showV1408EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1408: earth level
internal fun PlayerActivity.showV1408EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1408: ease mode
internal fun PlayerActivity.showV1408EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1408ease
    FeaturePrefsStore.batch1401.v1408ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1408: east mode
internal fun PlayerActivity.showV1408EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1408east
    FeaturePrefsStore.batch1401.v1408east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1408: easy mode
internal fun PlayerActivity.showV1408EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1408easy
    FeaturePrefsStore.batch1401.v1408easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1408: eclipse mode
internal fun PlayerActivity.showV1408EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1408eclipse
    FeaturePrefsStore.batch1401.v1408eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1408: educate mode
internal fun PlayerActivity.showV1408EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1408educate
    FeaturePrefsStore.batch1401.v1408educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1409: duck mode
internal fun PlayerActivity.showV1409DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1409duck
    FeaturePrefsStore.batch1401.v1409duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1409: dumb mode
internal fun PlayerActivity.showV1409DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dumb
    FeaturePrefsStore.batch1401.v1409dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1409: dune mode
internal fun PlayerActivity.showV1409DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dune
    FeaturePrefsStore.batch1401.v1409dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1409: dust mode
internal fun PlayerActivity.showV1409DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dust
    FeaturePrefsStore.batch1401.v1409dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1409: duty mode
internal fun PlayerActivity.showV1409DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1409duty
    FeaturePrefsStore.batch1401.v1409duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1409: eager level
internal fun PlayerActivity.showV1409EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1409: ear level
internal fun PlayerActivity.showV1409EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1409: early level
internal fun PlayerActivity.showV1409EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409early = value
        AppToast.show(this, "early: $value")
    }
}

// v1409: earn level
internal fun PlayerActivity.showV1409EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1409: earth level
internal fun PlayerActivity.showV1409EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1409: ease mode
internal fun PlayerActivity.showV1409EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1409ease
    FeaturePrefsStore.batch1401.v1409ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1409: east mode
internal fun PlayerActivity.showV1409EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1409east
    FeaturePrefsStore.batch1401.v1409east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1409: easy mode
internal fun PlayerActivity.showV1409EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1409easy
    FeaturePrefsStore.batch1401.v1409easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1409: eclipse mode
internal fun PlayerActivity.showV1409EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1409eclipse
    FeaturePrefsStore.batch1401.v1409eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1409: educate mode
internal fun PlayerActivity.showV1409EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1409educate
    FeaturePrefsStore.batch1401.v1409educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1410: duck mode
internal fun PlayerActivity.showV1410DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1410duck
    FeaturePrefsStore.batch1401.v1410duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1410: dumb mode
internal fun PlayerActivity.showV1410DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dumb
    FeaturePrefsStore.batch1401.v1410dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1410: dune mode
internal fun PlayerActivity.showV1410DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dune
    FeaturePrefsStore.batch1401.v1410dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1410: dust mode
internal fun PlayerActivity.showV1410DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dust
    FeaturePrefsStore.batch1401.v1410dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1410: duty mode
internal fun PlayerActivity.showV1410DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1410duty
    FeaturePrefsStore.batch1401.v1410duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1410: eager level
internal fun PlayerActivity.showV1410EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1410: ear level
internal fun PlayerActivity.showV1410EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1410: early level
internal fun PlayerActivity.showV1410EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410early = value
        AppToast.show(this, "early: $value")
    }
}

// v1410: earn level
internal fun PlayerActivity.showV1410EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1410: earth level
internal fun PlayerActivity.showV1410EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1410: ease mode
internal fun PlayerActivity.showV1410EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1410ease
    FeaturePrefsStore.batch1401.v1410ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1410: east mode
internal fun PlayerActivity.showV1410EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1410east
    FeaturePrefsStore.batch1401.v1410east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1410: easy mode
internal fun PlayerActivity.showV1410EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1410easy
    FeaturePrefsStore.batch1401.v1410easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1410: eclipse mode
internal fun PlayerActivity.showV1410EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1410eclipse
    FeaturePrefsStore.batch1401.v1410eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1410: educate mode
internal fun PlayerActivity.showV1410EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1410educate
    FeaturePrefsStore.batch1401.v1410educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1411: effort mode
internal fun PlayerActivity.showV1411EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1411effort
    FeaturePrefsStore.batch1411.v1411effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1411: eight mode
internal fun PlayerActivity.showV1411EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1411eight
    FeaturePrefsStore.batch1411.v1411eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1411: either mode
internal fun PlayerActivity.showV1411EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1411either
    FeaturePrefsStore.batch1411.v1411either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1411: elbow mode
internal fun PlayerActivity.showV1411ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1411elbow
    FeaturePrefsStore.batch1411.v1411elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1411: elder mode
internal fun PlayerActivity.showV1411ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1411elder
    FeaturePrefsStore.batch1411.v1411elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1411: electric level
internal fun PlayerActivity.showV1411ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1411: elegant level
internal fun PlayerActivity.showV1411ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1411: elite level
internal fun PlayerActivity.showV1411EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1411: else level
internal fun PlayerActivity.showV1411ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411else = value
        AppToast.show(this, "else: $value")
    }
}

// v1411: email level
internal fun PlayerActivity.showV1411EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411email = value
        AppToast.show(this, "email: $value")
    }
}

// v1411: ember mode
internal fun PlayerActivity.showV1411EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1411ember
    FeaturePrefsStore.batch1411.v1411ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1411: emerge mode
internal fun PlayerActivity.showV1411EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1411emerge
    FeaturePrefsStore.batch1411.v1411emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1411: emotion mode
internal fun PlayerActivity.showV1411EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1411emotion
    FeaturePrefsStore.batch1411.v1411emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1411: employ mode
internal fun PlayerActivity.showV1411EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1411employ
    FeaturePrefsStore.batch1411.v1411employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1411: encore mode
internal fun PlayerActivity.showV1411EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1411encore
    FeaturePrefsStore.batch1411.v1411encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1412: effort mode
internal fun PlayerActivity.showV1412EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1412effort
    FeaturePrefsStore.batch1411.v1412effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1412: eight mode
internal fun PlayerActivity.showV1412EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1412eight
    FeaturePrefsStore.batch1411.v1412eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1412: either mode
internal fun PlayerActivity.showV1412EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1412either
    FeaturePrefsStore.batch1411.v1412either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1412: elbow mode
internal fun PlayerActivity.showV1412ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1412elbow
    FeaturePrefsStore.batch1411.v1412elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1412: elder mode
internal fun PlayerActivity.showV1412ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1412elder
    FeaturePrefsStore.batch1411.v1412elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1412: electric level
internal fun PlayerActivity.showV1412ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1412: elegant level
internal fun PlayerActivity.showV1412ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1412: elite level
internal fun PlayerActivity.showV1412EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1412: else level
internal fun PlayerActivity.showV1412ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412else = value
        AppToast.show(this, "else: $value")
    }
}

// v1412: email level
internal fun PlayerActivity.showV1412EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412email = value
        AppToast.show(this, "email: $value")
    }
}

// v1412: ember mode
internal fun PlayerActivity.showV1412EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1412ember
    FeaturePrefsStore.batch1411.v1412ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1412: emerge mode
internal fun PlayerActivity.showV1412EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1412emerge
    FeaturePrefsStore.batch1411.v1412emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1412: emotion mode
internal fun PlayerActivity.showV1412EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1412emotion
    FeaturePrefsStore.batch1411.v1412emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1412: employ mode
internal fun PlayerActivity.showV1412EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1412employ
    FeaturePrefsStore.batch1411.v1412employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1412: encore mode
internal fun PlayerActivity.showV1412EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1412encore
    FeaturePrefsStore.batch1411.v1412encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1413: effort mode
internal fun PlayerActivity.showV1413EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1413effort
    FeaturePrefsStore.batch1411.v1413effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1413: eight mode
internal fun PlayerActivity.showV1413EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1413eight
    FeaturePrefsStore.batch1411.v1413eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1413: either mode
internal fun PlayerActivity.showV1413EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1413either
    FeaturePrefsStore.batch1411.v1413either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1413: elbow mode
internal fun PlayerActivity.showV1413ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1413elbow
    FeaturePrefsStore.batch1411.v1413elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1413: elder mode
internal fun PlayerActivity.showV1413ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1413elder
    FeaturePrefsStore.batch1411.v1413elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1413: electric level
internal fun PlayerActivity.showV1413ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1413: elegant level
internal fun PlayerActivity.showV1413ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1413: elite level
internal fun PlayerActivity.showV1413EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1413: else level
internal fun PlayerActivity.showV1413ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413else = value
        AppToast.show(this, "else: $value")
    }
}

// v1413: email level
internal fun PlayerActivity.showV1413EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413email = value
        AppToast.show(this, "email: $value")
    }
}

// v1413: ember mode
internal fun PlayerActivity.showV1413EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1413ember
    FeaturePrefsStore.batch1411.v1413ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1413: emerge mode
internal fun PlayerActivity.showV1413EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1413emerge
    FeaturePrefsStore.batch1411.v1413emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1413: emotion mode
internal fun PlayerActivity.showV1413EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1413emotion
    FeaturePrefsStore.batch1411.v1413emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1413: employ mode
internal fun PlayerActivity.showV1413EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1413employ
    FeaturePrefsStore.batch1411.v1413employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1413: encore mode
internal fun PlayerActivity.showV1413EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1413encore
    FeaturePrefsStore.batch1411.v1413encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1414: effort mode
internal fun PlayerActivity.showV1414EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1414effort
    FeaturePrefsStore.batch1411.v1414effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1414: eight mode
internal fun PlayerActivity.showV1414EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1414eight
    FeaturePrefsStore.batch1411.v1414eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1414: either mode
internal fun PlayerActivity.showV1414EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1414either
    FeaturePrefsStore.batch1411.v1414either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1414: elbow mode
internal fun PlayerActivity.showV1414ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1414elbow
    FeaturePrefsStore.batch1411.v1414elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1414: elder mode
internal fun PlayerActivity.showV1414ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1414elder
    FeaturePrefsStore.batch1411.v1414elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1414: electric level
internal fun PlayerActivity.showV1414ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1414: elegant level
internal fun PlayerActivity.showV1414ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1414: elite level
internal fun PlayerActivity.showV1414EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1414: else level
internal fun PlayerActivity.showV1414ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414else = value
        AppToast.show(this, "else: $value")
    }
}

// v1414: email level
internal fun PlayerActivity.showV1414EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414email = value
        AppToast.show(this, "email: $value")
    }
}

// v1414: ember mode
internal fun PlayerActivity.showV1414EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1414ember
    FeaturePrefsStore.batch1411.v1414ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1414: emerge mode
internal fun PlayerActivity.showV1414EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1414emerge
    FeaturePrefsStore.batch1411.v1414emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1414: emotion mode
internal fun PlayerActivity.showV1414EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1414emotion
    FeaturePrefsStore.batch1411.v1414emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1414: employ mode
internal fun PlayerActivity.showV1414EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1414employ
    FeaturePrefsStore.batch1411.v1414employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1414: encore mode
internal fun PlayerActivity.showV1414EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1414encore
    FeaturePrefsStore.batch1411.v1414encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1415: effort mode
internal fun PlayerActivity.showV1415EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1415effort
    FeaturePrefsStore.batch1411.v1415effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1415: eight mode
internal fun PlayerActivity.showV1415EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1415eight
    FeaturePrefsStore.batch1411.v1415eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1415: either mode
internal fun PlayerActivity.showV1415EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1415either
    FeaturePrefsStore.batch1411.v1415either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1415: elbow mode
internal fun PlayerActivity.showV1415ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1415elbow
    FeaturePrefsStore.batch1411.v1415elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1415: elder mode
internal fun PlayerActivity.showV1415ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1415elder
    FeaturePrefsStore.batch1411.v1415elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1415: electric level
internal fun PlayerActivity.showV1415ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1415: elegant level
internal fun PlayerActivity.showV1415ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1415: elite level
internal fun PlayerActivity.showV1415EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1415: else level
internal fun PlayerActivity.showV1415ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415else = value
        AppToast.show(this, "else: $value")
    }
}

// v1415: email level
internal fun PlayerActivity.showV1415EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415email = value
        AppToast.show(this, "email: $value")
    }
}

// v1415: ember mode
internal fun PlayerActivity.showV1415EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1415ember
    FeaturePrefsStore.batch1411.v1415ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1415: emerge mode
internal fun PlayerActivity.showV1415EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1415emerge
    FeaturePrefsStore.batch1411.v1415emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1415: emotion mode
internal fun PlayerActivity.showV1415EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1415emotion
    FeaturePrefsStore.batch1411.v1415emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1415: employ mode
internal fun PlayerActivity.showV1415EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1415employ
    FeaturePrefsStore.batch1411.v1415employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1415: encore mode
internal fun PlayerActivity.showV1415EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1415encore
    FeaturePrefsStore.batch1411.v1415encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1416: effort mode
internal fun PlayerActivity.showV1416EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1416effort
    FeaturePrefsStore.batch1411.v1416effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1416: eight mode
internal fun PlayerActivity.showV1416EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1416eight
    FeaturePrefsStore.batch1411.v1416eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1416: either mode
internal fun PlayerActivity.showV1416EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1416either
    FeaturePrefsStore.batch1411.v1416either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1416: elbow mode
internal fun PlayerActivity.showV1416ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1416elbow
    FeaturePrefsStore.batch1411.v1416elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1416: elder mode
internal fun PlayerActivity.showV1416ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1416elder
    FeaturePrefsStore.batch1411.v1416elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1416: electric level
internal fun PlayerActivity.showV1416ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1416: elegant level
internal fun PlayerActivity.showV1416ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1416: elite level
internal fun PlayerActivity.showV1416EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1416: else level
internal fun PlayerActivity.showV1416ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416else = value
        AppToast.show(this, "else: $value")
    }
}

// v1416: email level
internal fun PlayerActivity.showV1416EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416email = value
        AppToast.show(this, "email: $value")
    }
}

// v1416: ember mode
internal fun PlayerActivity.showV1416EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1416ember
    FeaturePrefsStore.batch1411.v1416ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1416: emerge mode
internal fun PlayerActivity.showV1416EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1416emerge
    FeaturePrefsStore.batch1411.v1416emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1416: emotion mode
internal fun PlayerActivity.showV1416EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1416emotion
    FeaturePrefsStore.batch1411.v1416emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1416: employ mode
internal fun PlayerActivity.showV1416EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1416employ
    FeaturePrefsStore.batch1411.v1416employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1416: encore mode
internal fun PlayerActivity.showV1416EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1416encore
    FeaturePrefsStore.batch1411.v1416encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1417: effort mode
internal fun PlayerActivity.showV1417EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1417effort
    FeaturePrefsStore.batch1411.v1417effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1417: eight mode
internal fun PlayerActivity.showV1417EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1417eight
    FeaturePrefsStore.batch1411.v1417eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1417: either mode
internal fun PlayerActivity.showV1417EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1417either
    FeaturePrefsStore.batch1411.v1417either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1417: elbow mode
internal fun PlayerActivity.showV1417ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1417elbow
    FeaturePrefsStore.batch1411.v1417elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1417: elder mode
internal fun PlayerActivity.showV1417ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1417elder
    FeaturePrefsStore.batch1411.v1417elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1417: electric level
internal fun PlayerActivity.showV1417ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1417: elegant level
internal fun PlayerActivity.showV1417ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1417: elite level
internal fun PlayerActivity.showV1417EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1417: else level
internal fun PlayerActivity.showV1417ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417else = value
        AppToast.show(this, "else: $value")
    }
}

// v1417: email level
internal fun PlayerActivity.showV1417EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417email = value
        AppToast.show(this, "email: $value")
    }
}

// v1417: ember mode
internal fun PlayerActivity.showV1417EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1417ember
    FeaturePrefsStore.batch1411.v1417ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1417: emerge mode
internal fun PlayerActivity.showV1417EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1417emerge
    FeaturePrefsStore.batch1411.v1417emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1417: emotion mode
internal fun PlayerActivity.showV1417EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1417emotion
    FeaturePrefsStore.batch1411.v1417emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1417: employ mode
internal fun PlayerActivity.showV1417EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1417employ
    FeaturePrefsStore.batch1411.v1417employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1417: encore mode
internal fun PlayerActivity.showV1417EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1417encore
    FeaturePrefsStore.batch1411.v1417encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1418: effort mode
internal fun PlayerActivity.showV1418EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1418effort
    FeaturePrefsStore.batch1411.v1418effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1418: eight mode
internal fun PlayerActivity.showV1418EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1418eight
    FeaturePrefsStore.batch1411.v1418eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1418: either mode
internal fun PlayerActivity.showV1418EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1418either
    FeaturePrefsStore.batch1411.v1418either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1418: elbow mode
internal fun PlayerActivity.showV1418ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1418elbow
    FeaturePrefsStore.batch1411.v1418elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1418: elder mode
internal fun PlayerActivity.showV1418ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1418elder
    FeaturePrefsStore.batch1411.v1418elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1418: electric level
internal fun PlayerActivity.showV1418ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1418: elegant level
internal fun PlayerActivity.showV1418ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1418: elite level
internal fun PlayerActivity.showV1418EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1418: else level
internal fun PlayerActivity.showV1418ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418else = value
        AppToast.show(this, "else: $value")
    }
}

// v1418: email level
internal fun PlayerActivity.showV1418EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418email = value
        AppToast.show(this, "email: $value")
    }
}

// v1418: ember mode
internal fun PlayerActivity.showV1418EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1418ember
    FeaturePrefsStore.batch1411.v1418ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1418: emerge mode
internal fun PlayerActivity.showV1418EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1418emerge
    FeaturePrefsStore.batch1411.v1418emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1418: emotion mode
internal fun PlayerActivity.showV1418EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1418emotion
    FeaturePrefsStore.batch1411.v1418emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1418: employ mode
internal fun PlayerActivity.showV1418EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1418employ
    FeaturePrefsStore.batch1411.v1418employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1418: encore mode
internal fun PlayerActivity.showV1418EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1418encore
    FeaturePrefsStore.batch1411.v1418encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1419: effort mode
internal fun PlayerActivity.showV1419EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1419effort
    FeaturePrefsStore.batch1411.v1419effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1419: eight mode
internal fun PlayerActivity.showV1419EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1419eight
    FeaturePrefsStore.batch1411.v1419eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1419: either mode
internal fun PlayerActivity.showV1419EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1419either
    FeaturePrefsStore.batch1411.v1419either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1419: elbow mode
internal fun PlayerActivity.showV1419ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1419elbow
    FeaturePrefsStore.batch1411.v1419elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1419: elder mode
internal fun PlayerActivity.showV1419ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1419elder
    FeaturePrefsStore.batch1411.v1419elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1419: electric level
internal fun PlayerActivity.showV1419ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1419: elegant level
internal fun PlayerActivity.showV1419ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1419: elite level
internal fun PlayerActivity.showV1419EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1419: else level
internal fun PlayerActivity.showV1419ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419else = value
        AppToast.show(this, "else: $value")
    }
}

// v1419: email level
internal fun PlayerActivity.showV1419EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419email = value
        AppToast.show(this, "email: $value")
    }
}

// v1419: ember mode
internal fun PlayerActivity.showV1419EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1419ember
    FeaturePrefsStore.batch1411.v1419ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1419: emerge mode
internal fun PlayerActivity.showV1419EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1419emerge
    FeaturePrefsStore.batch1411.v1419emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1419: emotion mode
internal fun PlayerActivity.showV1419EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1419emotion
    FeaturePrefsStore.batch1411.v1419emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1419: employ mode
internal fun PlayerActivity.showV1419EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1419employ
    FeaturePrefsStore.batch1411.v1419employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1419: encore mode
internal fun PlayerActivity.showV1419EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1419encore
    FeaturePrefsStore.batch1411.v1419encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1420: effort mode
internal fun PlayerActivity.showV1420EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1420effort
    FeaturePrefsStore.batch1411.v1420effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1420: eight mode
internal fun PlayerActivity.showV1420EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1420eight
    FeaturePrefsStore.batch1411.v1420eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1420: either mode
internal fun PlayerActivity.showV1420EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1420either
    FeaturePrefsStore.batch1411.v1420either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1420: elbow mode
internal fun PlayerActivity.showV1420ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1420elbow
    FeaturePrefsStore.batch1411.v1420elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1420: elder mode
internal fun PlayerActivity.showV1420ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1420elder
    FeaturePrefsStore.batch1411.v1420elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1420: electric level
internal fun PlayerActivity.showV1420ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1420: elegant level
internal fun PlayerActivity.showV1420ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1420: elite level
internal fun PlayerActivity.showV1420EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1420: else level
internal fun PlayerActivity.showV1420ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420else = value
        AppToast.show(this, "else: $value")
    }
}

// v1420: email level
internal fun PlayerActivity.showV1420EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420email = value
        AppToast.show(this, "email: $value")
    }
}

// v1420: ember mode
internal fun PlayerActivity.showV1420EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1420ember
    FeaturePrefsStore.batch1411.v1420ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1420: emerge mode
internal fun PlayerActivity.showV1420EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1420emerge
    FeaturePrefsStore.batch1411.v1420emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1420: emotion mode
internal fun PlayerActivity.showV1420EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1420emotion
    FeaturePrefsStore.batch1411.v1420emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1420: employ mode
internal fun PlayerActivity.showV1420EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1420employ
    FeaturePrefsStore.batch1411.v1420employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1420: encore mode
internal fun PlayerActivity.showV1420EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1420encore
    FeaturePrefsStore.batch1411.v1420encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}
