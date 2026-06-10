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

