package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1221: ask mode
internal fun PlayerActivity.showV1221AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1221ask
    FeaturePrefsStore.batch1221.v1221ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1221: asset mode
internal fun PlayerActivity.showV1221AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1221asset
    FeaturePrefsStore.batch1221.v1221asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1221: atlas mode
internal fun PlayerActivity.showV1221AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1221atlas
    FeaturePrefsStore.batch1221.v1221atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1221: atom mode
internal fun PlayerActivity.showV1221AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1221atom
    FeaturePrefsStore.batch1221.v1221atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1221: attic mode
internal fun PlayerActivity.showV1221AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1221attic
    FeaturePrefsStore.batch1221.v1221attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1221: audio level
internal fun PlayerActivity.showV1221AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1221: audit level
internal fun PlayerActivity.showV1221AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1221: august level
internal fun PlayerActivity.showV1221AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221august = value
        AppToast.show(this, "august: $value")
    }
}

// v1221: aunt level
internal fun PlayerActivity.showV1221AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1221: aura level
internal fun PlayerActivity.showV1221AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1221: auto mode
internal fun PlayerActivity.showV1221AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1221auto
    FeaturePrefsStore.batch1221.v1221auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1221: autumn mode
internal fun PlayerActivity.showV1221AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1221autumn
    FeaturePrefsStore.batch1221.v1221autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1221: avatar mode
internal fun PlayerActivity.showV1221AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1221avatar
    FeaturePrefsStore.batch1221.v1221avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1221: avenue mode
internal fun PlayerActivity.showV1221AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1221avenue
    FeaturePrefsStore.batch1221.v1221avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1221: awake mode
internal fun PlayerActivity.showV1221AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1221awake
    FeaturePrefsStore.batch1221.v1221awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1222: ask mode
internal fun PlayerActivity.showV1222AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1222ask
    FeaturePrefsStore.batch1221.v1222ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1222: asset mode
internal fun PlayerActivity.showV1222AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1222asset
    FeaturePrefsStore.batch1221.v1222asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1222: atlas mode
internal fun PlayerActivity.showV1222AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1222atlas
    FeaturePrefsStore.batch1221.v1222atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1222: atom mode
internal fun PlayerActivity.showV1222AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1222atom
    FeaturePrefsStore.batch1221.v1222atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1222: attic mode
internal fun PlayerActivity.showV1222AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1222attic
    FeaturePrefsStore.batch1221.v1222attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1222: audio level
internal fun PlayerActivity.showV1222AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1222: audit level
internal fun PlayerActivity.showV1222AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1222: august level
internal fun PlayerActivity.showV1222AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222august = value
        AppToast.show(this, "august: $value")
    }
}

// v1222: aunt level
internal fun PlayerActivity.showV1222AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1222: aura level
internal fun PlayerActivity.showV1222AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1222: auto mode
internal fun PlayerActivity.showV1222AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1222auto
    FeaturePrefsStore.batch1221.v1222auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1222: autumn mode
internal fun PlayerActivity.showV1222AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1222autumn
    FeaturePrefsStore.batch1221.v1222autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1222: avatar mode
internal fun PlayerActivity.showV1222AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1222avatar
    FeaturePrefsStore.batch1221.v1222avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1222: avenue mode
internal fun PlayerActivity.showV1222AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1222avenue
    FeaturePrefsStore.batch1221.v1222avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1222: awake mode
internal fun PlayerActivity.showV1222AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1222awake
    FeaturePrefsStore.batch1221.v1222awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1223: ask mode
internal fun PlayerActivity.showV1223AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1223ask
    FeaturePrefsStore.batch1221.v1223ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1223: asset mode
internal fun PlayerActivity.showV1223AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1223asset
    FeaturePrefsStore.batch1221.v1223asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1223: atlas mode
internal fun PlayerActivity.showV1223AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1223atlas
    FeaturePrefsStore.batch1221.v1223atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1223: atom mode
internal fun PlayerActivity.showV1223AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1223atom
    FeaturePrefsStore.batch1221.v1223atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1223: attic mode
internal fun PlayerActivity.showV1223AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1223attic
    FeaturePrefsStore.batch1221.v1223attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1223: audio level
internal fun PlayerActivity.showV1223AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1223: audit level
internal fun PlayerActivity.showV1223AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1223: august level
internal fun PlayerActivity.showV1223AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223august = value
        AppToast.show(this, "august: $value")
    }
}

// v1223: aunt level
internal fun PlayerActivity.showV1223AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1223: aura level
internal fun PlayerActivity.showV1223AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1223: auto mode
internal fun PlayerActivity.showV1223AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1223auto
    FeaturePrefsStore.batch1221.v1223auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1223: autumn mode
internal fun PlayerActivity.showV1223AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1223autumn
    FeaturePrefsStore.batch1221.v1223autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1223: avatar mode
internal fun PlayerActivity.showV1223AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1223avatar
    FeaturePrefsStore.batch1221.v1223avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1223: avenue mode
internal fun PlayerActivity.showV1223AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1223avenue
    FeaturePrefsStore.batch1221.v1223avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1223: awake mode
internal fun PlayerActivity.showV1223AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1223awake
    FeaturePrefsStore.batch1221.v1223awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1224: ask mode
internal fun PlayerActivity.showV1224AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1224ask
    FeaturePrefsStore.batch1221.v1224ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1224: asset mode
internal fun PlayerActivity.showV1224AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1224asset
    FeaturePrefsStore.batch1221.v1224asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1224: atlas mode
internal fun PlayerActivity.showV1224AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1224atlas
    FeaturePrefsStore.batch1221.v1224atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1224: atom mode
internal fun PlayerActivity.showV1224AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1224atom
    FeaturePrefsStore.batch1221.v1224atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1224: attic mode
internal fun PlayerActivity.showV1224AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1224attic
    FeaturePrefsStore.batch1221.v1224attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1224: audio level
internal fun PlayerActivity.showV1224AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1224: audit level
internal fun PlayerActivity.showV1224AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1224: august level
internal fun PlayerActivity.showV1224AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224august = value
        AppToast.show(this, "august: $value")
    }
}

// v1224: aunt level
internal fun PlayerActivity.showV1224AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1224: aura level
internal fun PlayerActivity.showV1224AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1224: auto mode
internal fun PlayerActivity.showV1224AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1224auto
    FeaturePrefsStore.batch1221.v1224auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1224: autumn mode
internal fun PlayerActivity.showV1224AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1224autumn
    FeaturePrefsStore.batch1221.v1224autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1224: avatar mode
internal fun PlayerActivity.showV1224AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1224avatar
    FeaturePrefsStore.batch1221.v1224avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1224: avenue mode
internal fun PlayerActivity.showV1224AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1224avenue
    FeaturePrefsStore.batch1221.v1224avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1224: awake mode
internal fun PlayerActivity.showV1224AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1224awake
    FeaturePrefsStore.batch1221.v1224awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1225: ask mode
internal fun PlayerActivity.showV1225AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1225ask
    FeaturePrefsStore.batch1221.v1225ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1225: asset mode
internal fun PlayerActivity.showV1225AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1225asset
    FeaturePrefsStore.batch1221.v1225asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1225: atlas mode
internal fun PlayerActivity.showV1225AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1225atlas
    FeaturePrefsStore.batch1221.v1225atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1225: atom mode
internal fun PlayerActivity.showV1225AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1225atom
    FeaturePrefsStore.batch1221.v1225atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1225: attic mode
internal fun PlayerActivity.showV1225AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1225attic
    FeaturePrefsStore.batch1221.v1225attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1225: audio level
internal fun PlayerActivity.showV1225AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1225: audit level
internal fun PlayerActivity.showV1225AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1225: august level
internal fun PlayerActivity.showV1225AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225august = value
        AppToast.show(this, "august: $value")
    }
}

// v1225: aunt level
internal fun PlayerActivity.showV1225AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1225: aura level
internal fun PlayerActivity.showV1225AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1225: auto mode
internal fun PlayerActivity.showV1225AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1225auto
    FeaturePrefsStore.batch1221.v1225auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1225: autumn mode
internal fun PlayerActivity.showV1225AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1225autumn
    FeaturePrefsStore.batch1221.v1225autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1225: avatar mode
internal fun PlayerActivity.showV1225AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1225avatar
    FeaturePrefsStore.batch1221.v1225avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1225: avenue mode
internal fun PlayerActivity.showV1225AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1225avenue
    FeaturePrefsStore.batch1221.v1225avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1225: awake mode
internal fun PlayerActivity.showV1225AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1225awake
    FeaturePrefsStore.batch1221.v1225awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1226: ask mode
internal fun PlayerActivity.showV1226AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1226ask
    FeaturePrefsStore.batch1221.v1226ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1226: asset mode
internal fun PlayerActivity.showV1226AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1226asset
    FeaturePrefsStore.batch1221.v1226asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1226: atlas mode
internal fun PlayerActivity.showV1226AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1226atlas
    FeaturePrefsStore.batch1221.v1226atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1226: atom mode
internal fun PlayerActivity.showV1226AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1226atom
    FeaturePrefsStore.batch1221.v1226atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1226: attic mode
internal fun PlayerActivity.showV1226AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1226attic
    FeaturePrefsStore.batch1221.v1226attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1226: audio level
internal fun PlayerActivity.showV1226AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1226: audit level
internal fun PlayerActivity.showV1226AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1226: august level
internal fun PlayerActivity.showV1226AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226august = value
        AppToast.show(this, "august: $value")
    }
}

// v1226: aunt level
internal fun PlayerActivity.showV1226AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1226: aura level
internal fun PlayerActivity.showV1226AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1226: auto mode
internal fun PlayerActivity.showV1226AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1226auto
    FeaturePrefsStore.batch1221.v1226auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1226: autumn mode
internal fun PlayerActivity.showV1226AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1226autumn
    FeaturePrefsStore.batch1221.v1226autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1226: avatar mode
internal fun PlayerActivity.showV1226AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1226avatar
    FeaturePrefsStore.batch1221.v1226avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1226: avenue mode
internal fun PlayerActivity.showV1226AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1226avenue
    FeaturePrefsStore.batch1221.v1226avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1226: awake mode
internal fun PlayerActivity.showV1226AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1226awake
    FeaturePrefsStore.batch1221.v1226awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1227: ask mode
internal fun PlayerActivity.showV1227AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1227ask
    FeaturePrefsStore.batch1221.v1227ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1227: asset mode
internal fun PlayerActivity.showV1227AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1227asset
    FeaturePrefsStore.batch1221.v1227asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1227: atlas mode
internal fun PlayerActivity.showV1227AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1227atlas
    FeaturePrefsStore.batch1221.v1227atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1227: atom mode
internal fun PlayerActivity.showV1227AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1227atom
    FeaturePrefsStore.batch1221.v1227atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1227: attic mode
internal fun PlayerActivity.showV1227AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1227attic
    FeaturePrefsStore.batch1221.v1227attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1227: audio level
internal fun PlayerActivity.showV1227AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1227: audit level
internal fun PlayerActivity.showV1227AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1227: august level
internal fun PlayerActivity.showV1227AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227august = value
        AppToast.show(this, "august: $value")
    }
}

// v1227: aunt level
internal fun PlayerActivity.showV1227AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1227: aura level
internal fun PlayerActivity.showV1227AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1227: auto mode
internal fun PlayerActivity.showV1227AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1227auto
    FeaturePrefsStore.batch1221.v1227auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1227: autumn mode
internal fun PlayerActivity.showV1227AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1227autumn
    FeaturePrefsStore.batch1221.v1227autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1227: avatar mode
internal fun PlayerActivity.showV1227AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1227avatar
    FeaturePrefsStore.batch1221.v1227avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1227: avenue mode
internal fun PlayerActivity.showV1227AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1227avenue
    FeaturePrefsStore.batch1221.v1227avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1227: awake mode
internal fun PlayerActivity.showV1227AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1227awake
    FeaturePrefsStore.batch1221.v1227awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1228: ask mode
internal fun PlayerActivity.showV1228AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1228ask
    FeaturePrefsStore.batch1221.v1228ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1228: asset mode
internal fun PlayerActivity.showV1228AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1228asset
    FeaturePrefsStore.batch1221.v1228asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1228: atlas mode
internal fun PlayerActivity.showV1228AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1228atlas
    FeaturePrefsStore.batch1221.v1228atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1228: atom mode
internal fun PlayerActivity.showV1228AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1228atom
    FeaturePrefsStore.batch1221.v1228atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1228: attic mode
internal fun PlayerActivity.showV1228AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1228attic
    FeaturePrefsStore.batch1221.v1228attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1228: audio level
internal fun PlayerActivity.showV1228AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1228: audit level
internal fun PlayerActivity.showV1228AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1228: august level
internal fun PlayerActivity.showV1228AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228august = value
        AppToast.show(this, "august: $value")
    }
}

// v1228: aunt level
internal fun PlayerActivity.showV1228AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1228: aura level
internal fun PlayerActivity.showV1228AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1228: auto mode
internal fun PlayerActivity.showV1228AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1228auto
    FeaturePrefsStore.batch1221.v1228auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1228: autumn mode
internal fun PlayerActivity.showV1228AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1228autumn
    FeaturePrefsStore.batch1221.v1228autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1228: avatar mode
internal fun PlayerActivity.showV1228AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1228avatar
    FeaturePrefsStore.batch1221.v1228avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1228: avenue mode
internal fun PlayerActivity.showV1228AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1228avenue
    FeaturePrefsStore.batch1221.v1228avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1228: awake mode
internal fun PlayerActivity.showV1228AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1228awake
    FeaturePrefsStore.batch1221.v1228awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1229: ask mode
internal fun PlayerActivity.showV1229AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1229ask
    FeaturePrefsStore.batch1221.v1229ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1229: asset mode
internal fun PlayerActivity.showV1229AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1229asset
    FeaturePrefsStore.batch1221.v1229asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1229: atlas mode
internal fun PlayerActivity.showV1229AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1229atlas
    FeaturePrefsStore.batch1221.v1229atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1229: atom mode
internal fun PlayerActivity.showV1229AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1229atom
    FeaturePrefsStore.batch1221.v1229atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1229: attic mode
internal fun PlayerActivity.showV1229AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1229attic
    FeaturePrefsStore.batch1221.v1229attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1229: audio level
internal fun PlayerActivity.showV1229AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1229: audit level
internal fun PlayerActivity.showV1229AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1229: august level
internal fun PlayerActivity.showV1229AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229august = value
        AppToast.show(this, "august: $value")
    }
}

// v1229: aunt level
internal fun PlayerActivity.showV1229AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1229: aura level
internal fun PlayerActivity.showV1229AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1229: auto mode
internal fun PlayerActivity.showV1229AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1229auto
    FeaturePrefsStore.batch1221.v1229auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1229: autumn mode
internal fun PlayerActivity.showV1229AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1229autumn
    FeaturePrefsStore.batch1221.v1229autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1229: avatar mode
internal fun PlayerActivity.showV1229AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1229avatar
    FeaturePrefsStore.batch1221.v1229avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1229: avenue mode
internal fun PlayerActivity.showV1229AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1229avenue
    FeaturePrefsStore.batch1221.v1229avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1229: awake mode
internal fun PlayerActivity.showV1229AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1229awake
    FeaturePrefsStore.batch1221.v1229awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1230: ask mode
internal fun PlayerActivity.showV1230AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1230ask
    FeaturePrefsStore.batch1221.v1230ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1230: asset mode
internal fun PlayerActivity.showV1230AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1230asset
    FeaturePrefsStore.batch1221.v1230asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1230: atlas mode
internal fun PlayerActivity.showV1230AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1230atlas
    FeaturePrefsStore.batch1221.v1230atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1230: atom mode
internal fun PlayerActivity.showV1230AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1230atom
    FeaturePrefsStore.batch1221.v1230atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1230: attic mode
internal fun PlayerActivity.showV1230AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1230attic
    FeaturePrefsStore.batch1221.v1230attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1230: audio level
internal fun PlayerActivity.showV1230AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1230: audit level
internal fun PlayerActivity.showV1230AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1230: august level
internal fun PlayerActivity.showV1230AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230august = value
        AppToast.show(this, "august: $value")
    }
}

// v1230: aunt level
internal fun PlayerActivity.showV1230AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1230: aura level
internal fun PlayerActivity.showV1230AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1230: auto mode
internal fun PlayerActivity.showV1230AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1230auto
    FeaturePrefsStore.batch1221.v1230auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1230: autumn mode
internal fun PlayerActivity.showV1230AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1230autumn
    FeaturePrefsStore.batch1221.v1230autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1230: avatar mode
internal fun PlayerActivity.showV1230AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1230avatar
    FeaturePrefsStore.batch1221.v1230avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1230: avenue mode
internal fun PlayerActivity.showV1230AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1230avenue
    FeaturePrefsStore.batch1221.v1230avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1230: awake mode
internal fun PlayerActivity.showV1230AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1230awake
    FeaturePrefsStore.batch1221.v1230awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

