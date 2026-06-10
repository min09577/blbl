package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1141: turn mode
internal fun PlayerActivity.showV1141TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1141turn
    FeaturePrefsStore.batch1141.v1141turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1141: type mode
internal fun PlayerActivity.showV1141TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1141type
    FeaturePrefsStore.batch1141.v1141type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1141: unbind mode
internal fun PlayerActivity.showV1141UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1141unbind
    FeaturePrefsStore.batch1141.v1141unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1141: undo mode
internal fun PlayerActivity.showV1141UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1141undo
    FeaturePrefsStore.batch1141.v1141undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1141: union mode
internal fun PlayerActivity.showV1141UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1141union
    FeaturePrefsStore.batch1141.v1141union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1141: unit level
internal fun PlayerActivity.showV1141UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1141: unknown level
internal fun PlayerActivity.showV1141UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1141: unlock level
internal fun PlayerActivity.showV1141UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1141: unmount level
internal fun PlayerActivity.showV1141UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1141: unsafe level
internal fun PlayerActivity.showV1141UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1141: update mode
internal fun PlayerActivity.showV1141UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1141update
    FeaturePrefsStore.batch1141.v1141update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1141: upgrade mode
internal fun PlayerActivity.showV1141UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upgrade
    FeaturePrefsStore.batch1141.v1141upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1141: upload mode
internal fun PlayerActivity.showV1141UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upload
    FeaturePrefsStore.batch1141.v1141upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1141: upper mode
internal fun PlayerActivity.showV1141UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upper
    FeaturePrefsStore.batch1141.v1141upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1141: upscale mode
internal fun PlayerActivity.showV1141UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upscale
    FeaturePrefsStore.batch1141.v1141upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1142: turn mode
internal fun PlayerActivity.showV1142TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1142turn
    FeaturePrefsStore.batch1141.v1142turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1142: type mode
internal fun PlayerActivity.showV1142TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1142type
    FeaturePrefsStore.batch1141.v1142type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1142: unbind mode
internal fun PlayerActivity.showV1142UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1142unbind
    FeaturePrefsStore.batch1141.v1142unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1142: undo mode
internal fun PlayerActivity.showV1142UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1142undo
    FeaturePrefsStore.batch1141.v1142undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1142: union mode
internal fun PlayerActivity.showV1142UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1142union
    FeaturePrefsStore.batch1141.v1142union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1142: unit level
internal fun PlayerActivity.showV1142UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1142: unknown level
internal fun PlayerActivity.showV1142UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1142: unlock level
internal fun PlayerActivity.showV1142UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1142: unmount level
internal fun PlayerActivity.showV1142UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1142: unsafe level
internal fun PlayerActivity.showV1142UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1142: update mode
internal fun PlayerActivity.showV1142UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1142update
    FeaturePrefsStore.batch1141.v1142update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1142: upgrade mode
internal fun PlayerActivity.showV1142UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upgrade
    FeaturePrefsStore.batch1141.v1142upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1142: upload mode
internal fun PlayerActivity.showV1142UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upload
    FeaturePrefsStore.batch1141.v1142upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1142: upper mode
internal fun PlayerActivity.showV1142UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upper
    FeaturePrefsStore.batch1141.v1142upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1142: upscale mode
internal fun PlayerActivity.showV1142UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upscale
    FeaturePrefsStore.batch1141.v1142upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1143: turn mode
internal fun PlayerActivity.showV1143TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1143turn
    FeaturePrefsStore.batch1141.v1143turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1143: type mode
internal fun PlayerActivity.showV1143TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1143type
    FeaturePrefsStore.batch1141.v1143type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1143: unbind mode
internal fun PlayerActivity.showV1143UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1143unbind
    FeaturePrefsStore.batch1141.v1143unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1143: undo mode
internal fun PlayerActivity.showV1143UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1143undo
    FeaturePrefsStore.batch1141.v1143undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1143: union mode
internal fun PlayerActivity.showV1143UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1143union
    FeaturePrefsStore.batch1141.v1143union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1143: unit level
internal fun PlayerActivity.showV1143UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1143: unknown level
internal fun PlayerActivity.showV1143UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1143: unlock level
internal fun PlayerActivity.showV1143UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1143: unmount level
internal fun PlayerActivity.showV1143UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1143: unsafe level
internal fun PlayerActivity.showV1143UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1143: update mode
internal fun PlayerActivity.showV1143UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1143update
    FeaturePrefsStore.batch1141.v1143update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1143: upgrade mode
internal fun PlayerActivity.showV1143UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upgrade
    FeaturePrefsStore.batch1141.v1143upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1143: upload mode
internal fun PlayerActivity.showV1143UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upload
    FeaturePrefsStore.batch1141.v1143upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1143: upper mode
internal fun PlayerActivity.showV1143UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upper
    FeaturePrefsStore.batch1141.v1143upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1143: upscale mode
internal fun PlayerActivity.showV1143UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upscale
    FeaturePrefsStore.batch1141.v1143upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1144: turn mode
internal fun PlayerActivity.showV1144TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1144turn
    FeaturePrefsStore.batch1141.v1144turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1144: type mode
internal fun PlayerActivity.showV1144TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1144type
    FeaturePrefsStore.batch1141.v1144type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1144: unbind mode
internal fun PlayerActivity.showV1144UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1144unbind
    FeaturePrefsStore.batch1141.v1144unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1144: undo mode
internal fun PlayerActivity.showV1144UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1144undo
    FeaturePrefsStore.batch1141.v1144undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1144: union mode
internal fun PlayerActivity.showV1144UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1144union
    FeaturePrefsStore.batch1141.v1144union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1144: unit level
internal fun PlayerActivity.showV1144UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1144: unknown level
internal fun PlayerActivity.showV1144UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1144: unlock level
internal fun PlayerActivity.showV1144UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1144: unmount level
internal fun PlayerActivity.showV1144UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1144: unsafe level
internal fun PlayerActivity.showV1144UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1144: update mode
internal fun PlayerActivity.showV1144UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1144update
    FeaturePrefsStore.batch1141.v1144update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1144: upgrade mode
internal fun PlayerActivity.showV1144UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upgrade
    FeaturePrefsStore.batch1141.v1144upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1144: upload mode
internal fun PlayerActivity.showV1144UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upload
    FeaturePrefsStore.batch1141.v1144upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1144: upper mode
internal fun PlayerActivity.showV1144UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upper
    FeaturePrefsStore.batch1141.v1144upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1144: upscale mode
internal fun PlayerActivity.showV1144UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upscale
    FeaturePrefsStore.batch1141.v1144upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1145: turn mode
internal fun PlayerActivity.showV1145TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1145turn
    FeaturePrefsStore.batch1141.v1145turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1145: type mode
internal fun PlayerActivity.showV1145TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1145type
    FeaturePrefsStore.batch1141.v1145type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1145: unbind mode
internal fun PlayerActivity.showV1145UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1145unbind
    FeaturePrefsStore.batch1141.v1145unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1145: undo mode
internal fun PlayerActivity.showV1145UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1145undo
    FeaturePrefsStore.batch1141.v1145undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1145: union mode
internal fun PlayerActivity.showV1145UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1145union
    FeaturePrefsStore.batch1141.v1145union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1145: unit level
internal fun PlayerActivity.showV1145UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1145: unknown level
internal fun PlayerActivity.showV1145UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1145: unlock level
internal fun PlayerActivity.showV1145UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1145: unmount level
internal fun PlayerActivity.showV1145UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1145: unsafe level
internal fun PlayerActivity.showV1145UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1145: update mode
internal fun PlayerActivity.showV1145UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1145update
    FeaturePrefsStore.batch1141.v1145update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1145: upgrade mode
internal fun PlayerActivity.showV1145UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upgrade
    FeaturePrefsStore.batch1141.v1145upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1145: upload mode
internal fun PlayerActivity.showV1145UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upload
    FeaturePrefsStore.batch1141.v1145upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1145: upper mode
internal fun PlayerActivity.showV1145UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upper
    FeaturePrefsStore.batch1141.v1145upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1145: upscale mode
internal fun PlayerActivity.showV1145UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upscale
    FeaturePrefsStore.batch1141.v1145upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1146: turn mode
internal fun PlayerActivity.showV1146TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1146turn
    FeaturePrefsStore.batch1141.v1146turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1146: type mode
internal fun PlayerActivity.showV1146TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1146type
    FeaturePrefsStore.batch1141.v1146type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1146: unbind mode
internal fun PlayerActivity.showV1146UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1146unbind
    FeaturePrefsStore.batch1141.v1146unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1146: undo mode
internal fun PlayerActivity.showV1146UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1146undo
    FeaturePrefsStore.batch1141.v1146undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1146: union mode
internal fun PlayerActivity.showV1146UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1146union
    FeaturePrefsStore.batch1141.v1146union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1146: unit level
internal fun PlayerActivity.showV1146UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1146: unknown level
internal fun PlayerActivity.showV1146UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1146: unlock level
internal fun PlayerActivity.showV1146UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1146: unmount level
internal fun PlayerActivity.showV1146UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1146: unsafe level
internal fun PlayerActivity.showV1146UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1146: update mode
internal fun PlayerActivity.showV1146UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1146update
    FeaturePrefsStore.batch1141.v1146update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1146: upgrade mode
internal fun PlayerActivity.showV1146UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upgrade
    FeaturePrefsStore.batch1141.v1146upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1146: upload mode
internal fun PlayerActivity.showV1146UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upload
    FeaturePrefsStore.batch1141.v1146upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1146: upper mode
internal fun PlayerActivity.showV1146UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upper
    FeaturePrefsStore.batch1141.v1146upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1146: upscale mode
internal fun PlayerActivity.showV1146UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upscale
    FeaturePrefsStore.batch1141.v1146upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1147: turn mode
internal fun PlayerActivity.showV1147TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1147turn
    FeaturePrefsStore.batch1141.v1147turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1147: type mode
internal fun PlayerActivity.showV1147TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1147type
    FeaturePrefsStore.batch1141.v1147type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1147: unbind mode
internal fun PlayerActivity.showV1147UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1147unbind
    FeaturePrefsStore.batch1141.v1147unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1147: undo mode
internal fun PlayerActivity.showV1147UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1147undo
    FeaturePrefsStore.batch1141.v1147undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1147: union mode
internal fun PlayerActivity.showV1147UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1147union
    FeaturePrefsStore.batch1141.v1147union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1147: unit level
internal fun PlayerActivity.showV1147UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1147: unknown level
internal fun PlayerActivity.showV1147UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1147: unlock level
internal fun PlayerActivity.showV1147UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1147: unmount level
internal fun PlayerActivity.showV1147UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1147: unsafe level
internal fun PlayerActivity.showV1147UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1147: update mode
internal fun PlayerActivity.showV1147UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1147update
    FeaturePrefsStore.batch1141.v1147update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1147: upgrade mode
internal fun PlayerActivity.showV1147UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upgrade
    FeaturePrefsStore.batch1141.v1147upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1147: upload mode
internal fun PlayerActivity.showV1147UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upload
    FeaturePrefsStore.batch1141.v1147upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1147: upper mode
internal fun PlayerActivity.showV1147UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upper
    FeaturePrefsStore.batch1141.v1147upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1147: upscale mode
internal fun PlayerActivity.showV1147UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upscale
    FeaturePrefsStore.batch1141.v1147upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1148: turn mode
internal fun PlayerActivity.showV1148TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1148turn
    FeaturePrefsStore.batch1141.v1148turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1148: type mode
internal fun PlayerActivity.showV1148TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1148type
    FeaturePrefsStore.batch1141.v1148type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1148: unbind mode
internal fun PlayerActivity.showV1148UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1148unbind
    FeaturePrefsStore.batch1141.v1148unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1148: undo mode
internal fun PlayerActivity.showV1148UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1148undo
    FeaturePrefsStore.batch1141.v1148undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1148: union mode
internal fun PlayerActivity.showV1148UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1148union
    FeaturePrefsStore.batch1141.v1148union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1148: unit level
internal fun PlayerActivity.showV1148UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1148: unknown level
internal fun PlayerActivity.showV1148UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1148: unlock level
internal fun PlayerActivity.showV1148UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1148: unmount level
internal fun PlayerActivity.showV1148UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1148: unsafe level
internal fun PlayerActivity.showV1148UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1148: update mode
internal fun PlayerActivity.showV1148UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1148update
    FeaturePrefsStore.batch1141.v1148update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1148: upgrade mode
internal fun PlayerActivity.showV1148UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upgrade
    FeaturePrefsStore.batch1141.v1148upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1148: upload mode
internal fun PlayerActivity.showV1148UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upload
    FeaturePrefsStore.batch1141.v1148upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1148: upper mode
internal fun PlayerActivity.showV1148UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upper
    FeaturePrefsStore.batch1141.v1148upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1148: upscale mode
internal fun PlayerActivity.showV1148UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upscale
    FeaturePrefsStore.batch1141.v1148upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1149: turn mode
internal fun PlayerActivity.showV1149TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1149turn
    FeaturePrefsStore.batch1141.v1149turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1149: type mode
internal fun PlayerActivity.showV1149TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1149type
    FeaturePrefsStore.batch1141.v1149type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1149: unbind mode
internal fun PlayerActivity.showV1149UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1149unbind
    FeaturePrefsStore.batch1141.v1149unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1149: undo mode
internal fun PlayerActivity.showV1149UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1149undo
    FeaturePrefsStore.batch1141.v1149undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1149: union mode
internal fun PlayerActivity.showV1149UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1149union
    FeaturePrefsStore.batch1141.v1149union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1149: unit level
internal fun PlayerActivity.showV1149UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1149: unknown level
internal fun PlayerActivity.showV1149UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1149: unlock level
internal fun PlayerActivity.showV1149UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1149: unmount level
internal fun PlayerActivity.showV1149UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1149: unsafe level
internal fun PlayerActivity.showV1149UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1149: update mode
internal fun PlayerActivity.showV1149UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1149update
    FeaturePrefsStore.batch1141.v1149update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1149: upgrade mode
internal fun PlayerActivity.showV1149UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upgrade
    FeaturePrefsStore.batch1141.v1149upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1149: upload mode
internal fun PlayerActivity.showV1149UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upload
    FeaturePrefsStore.batch1141.v1149upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1149: upper mode
internal fun PlayerActivity.showV1149UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upper
    FeaturePrefsStore.batch1141.v1149upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1149: upscale mode
internal fun PlayerActivity.showV1149UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upscale
    FeaturePrefsStore.batch1141.v1149upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1150: turn mode
internal fun PlayerActivity.showV1150TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1150turn
    FeaturePrefsStore.batch1141.v1150turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1150: type mode
internal fun PlayerActivity.showV1150TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1150type
    FeaturePrefsStore.batch1141.v1150type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1150: unbind mode
internal fun PlayerActivity.showV1150UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1150unbind
    FeaturePrefsStore.batch1141.v1150unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1150: undo mode
internal fun PlayerActivity.showV1150UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1150undo
    FeaturePrefsStore.batch1141.v1150undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1150: union mode
internal fun PlayerActivity.showV1150UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1150union
    FeaturePrefsStore.batch1141.v1150union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1150: unit level
internal fun PlayerActivity.showV1150UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1150: unknown level
internal fun PlayerActivity.showV1150UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1150: unlock level
internal fun PlayerActivity.showV1150UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1150: unmount level
internal fun PlayerActivity.showV1150UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1150: unsafe level
internal fun PlayerActivity.showV1150UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1150: update mode
internal fun PlayerActivity.showV1150UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1150update
    FeaturePrefsStore.batch1141.v1150update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1150: upgrade mode
internal fun PlayerActivity.showV1150UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upgrade
    FeaturePrefsStore.batch1141.v1150upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1150: upload mode
internal fun PlayerActivity.showV1150UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upload
    FeaturePrefsStore.batch1141.v1150upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1150: upper mode
internal fun PlayerActivity.showV1150UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upper
    FeaturePrefsStore.batch1141.v1150upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1150: upscale mode
internal fun PlayerActivity.showV1150UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upscale
    FeaturePrefsStore.batch1141.v1150upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

