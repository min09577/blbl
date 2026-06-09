package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1171: accent mode
internal fun PlayerActivity.showV1171AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1171accent
    FeaturePrefsStore.batch1171.v1171accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1171: accept mode
internal fun PlayerActivity.showV1171AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1171accept
    FeaturePrefsStore.batch1171.v1171accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1171: access mode
internal fun PlayerActivity.showV1171AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1171access
    FeaturePrefsStore.batch1171.v1171access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1171: acclaim mode
internal fun PlayerActivity.showV1171AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1171acclaim
    FeaturePrefsStore.batch1171.v1171acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1171: accord mode
internal fun PlayerActivity.showV1171AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1171accord
    FeaturePrefsStore.batch1171.v1171accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1171: account level
internal fun PlayerActivity.showV1171AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1171account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1171account = value
        AppToast.show(this, "account: $value")
    }
}

// v1171: ace level
internal fun PlayerActivity.showV1171AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1171ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1171ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1171: acid level
internal fun PlayerActivity.showV1171AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1171acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1171acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1171: acme level
internal fun PlayerActivity.showV1171AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1171acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1171acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1171: acoustic level
internal fun PlayerActivity.showV1171AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1171acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1171acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1171: acre mode
internal fun PlayerActivity.showV1171AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1171acre
    FeaturePrefsStore.batch1171.v1171acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1171: act mode
internal fun PlayerActivity.showV1171ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1171act
    FeaturePrefsStore.batch1171.v1171act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1171: action mode
internal fun PlayerActivity.showV1171ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1171action
    FeaturePrefsStore.batch1171.v1171action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1171: acute mode
internal fun PlayerActivity.showV1171AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1171acute
    FeaturePrefsStore.batch1171.v1171acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1171: adam mode
internal fun PlayerActivity.showV1171AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1171adam
    FeaturePrefsStore.batch1171.v1171adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1172: accent mode
internal fun PlayerActivity.showV1172AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1172accent
    FeaturePrefsStore.batch1171.v1172accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1172: accept mode
internal fun PlayerActivity.showV1172AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1172accept
    FeaturePrefsStore.batch1171.v1172accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1172: access mode
internal fun PlayerActivity.showV1172AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1172access
    FeaturePrefsStore.batch1171.v1172access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1172: acclaim mode
internal fun PlayerActivity.showV1172AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1172acclaim
    FeaturePrefsStore.batch1171.v1172acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1172: accord mode
internal fun PlayerActivity.showV1172AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1172accord
    FeaturePrefsStore.batch1171.v1172accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1172: account level
internal fun PlayerActivity.showV1172AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1172account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1172account = value
        AppToast.show(this, "account: $value")
    }
}

// v1172: ace level
internal fun PlayerActivity.showV1172AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1172ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1172ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1172: acid level
internal fun PlayerActivity.showV1172AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1172acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1172acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1172: acme level
internal fun PlayerActivity.showV1172AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1172acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1172acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1172: acoustic level
internal fun PlayerActivity.showV1172AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1172acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1172acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1172: acre mode
internal fun PlayerActivity.showV1172AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1172acre
    FeaturePrefsStore.batch1171.v1172acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1172: act mode
internal fun PlayerActivity.showV1172ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1172act
    FeaturePrefsStore.batch1171.v1172act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1172: action mode
internal fun PlayerActivity.showV1172ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1172action
    FeaturePrefsStore.batch1171.v1172action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1172: acute mode
internal fun PlayerActivity.showV1172AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1172acute
    FeaturePrefsStore.batch1171.v1172acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1172: adam mode
internal fun PlayerActivity.showV1172AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1172adam
    FeaturePrefsStore.batch1171.v1172adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1173: accent mode
internal fun PlayerActivity.showV1173AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1173accent
    FeaturePrefsStore.batch1171.v1173accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1173: accept mode
internal fun PlayerActivity.showV1173AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1173accept
    FeaturePrefsStore.batch1171.v1173accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1173: access mode
internal fun PlayerActivity.showV1173AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1173access
    FeaturePrefsStore.batch1171.v1173access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1173: acclaim mode
internal fun PlayerActivity.showV1173AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1173acclaim
    FeaturePrefsStore.batch1171.v1173acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1173: accord mode
internal fun PlayerActivity.showV1173AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1173accord
    FeaturePrefsStore.batch1171.v1173accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1173: account level
internal fun PlayerActivity.showV1173AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1173account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1173account = value
        AppToast.show(this, "account: $value")
    }
}

// v1173: ace level
internal fun PlayerActivity.showV1173AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1173ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1173ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1173: acid level
internal fun PlayerActivity.showV1173AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1173acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1173acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1173: acme level
internal fun PlayerActivity.showV1173AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1173acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1173acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1173: acoustic level
internal fun PlayerActivity.showV1173AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1173acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1173acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1173: acre mode
internal fun PlayerActivity.showV1173AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1173acre
    FeaturePrefsStore.batch1171.v1173acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1173: act mode
internal fun PlayerActivity.showV1173ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1173act
    FeaturePrefsStore.batch1171.v1173act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1173: action mode
internal fun PlayerActivity.showV1173ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1173action
    FeaturePrefsStore.batch1171.v1173action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1173: acute mode
internal fun PlayerActivity.showV1173AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1173acute
    FeaturePrefsStore.batch1171.v1173acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1173: adam mode
internal fun PlayerActivity.showV1173AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1173adam
    FeaturePrefsStore.batch1171.v1173adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1174: accent mode
internal fun PlayerActivity.showV1174AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1174accent
    FeaturePrefsStore.batch1171.v1174accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1174: accept mode
internal fun PlayerActivity.showV1174AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1174accept
    FeaturePrefsStore.batch1171.v1174accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1174: access mode
internal fun PlayerActivity.showV1174AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1174access
    FeaturePrefsStore.batch1171.v1174access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1174: acclaim mode
internal fun PlayerActivity.showV1174AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1174acclaim
    FeaturePrefsStore.batch1171.v1174acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1174: accord mode
internal fun PlayerActivity.showV1174AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1174accord
    FeaturePrefsStore.batch1171.v1174accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1174: account level
internal fun PlayerActivity.showV1174AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1174account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1174account = value
        AppToast.show(this, "account: $value")
    }
}

// v1174: ace level
internal fun PlayerActivity.showV1174AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1174ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1174ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1174: acid level
internal fun PlayerActivity.showV1174AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1174acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1174acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1174: acme level
internal fun PlayerActivity.showV1174AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1174acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1174acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1174: acoustic level
internal fun PlayerActivity.showV1174AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1174acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1174acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1174: acre mode
internal fun PlayerActivity.showV1174AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1174acre
    FeaturePrefsStore.batch1171.v1174acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1174: act mode
internal fun PlayerActivity.showV1174ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1174act
    FeaturePrefsStore.batch1171.v1174act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1174: action mode
internal fun PlayerActivity.showV1174ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1174action
    FeaturePrefsStore.batch1171.v1174action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1174: acute mode
internal fun PlayerActivity.showV1174AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1174acute
    FeaturePrefsStore.batch1171.v1174acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1174: adam mode
internal fun PlayerActivity.showV1174AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1174adam
    FeaturePrefsStore.batch1171.v1174adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1175: accent mode
internal fun PlayerActivity.showV1175AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1175accent
    FeaturePrefsStore.batch1171.v1175accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1175: accept mode
internal fun PlayerActivity.showV1175AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1175accept
    FeaturePrefsStore.batch1171.v1175accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1175: access mode
internal fun PlayerActivity.showV1175AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1175access
    FeaturePrefsStore.batch1171.v1175access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1175: acclaim mode
internal fun PlayerActivity.showV1175AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1175acclaim
    FeaturePrefsStore.batch1171.v1175acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1175: accord mode
internal fun PlayerActivity.showV1175AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1175accord
    FeaturePrefsStore.batch1171.v1175accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1175: account level
internal fun PlayerActivity.showV1175AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1175account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1175account = value
        AppToast.show(this, "account: $value")
    }
}

// v1175: ace level
internal fun PlayerActivity.showV1175AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1175ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1175ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1175: acid level
internal fun PlayerActivity.showV1175AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1175acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1175acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1175: acme level
internal fun PlayerActivity.showV1175AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1175acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1175acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1175: acoustic level
internal fun PlayerActivity.showV1175AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1175acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1175acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1175: acre mode
internal fun PlayerActivity.showV1175AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1175acre
    FeaturePrefsStore.batch1171.v1175acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1175: act mode
internal fun PlayerActivity.showV1175ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1175act
    FeaturePrefsStore.batch1171.v1175act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1175: action mode
internal fun PlayerActivity.showV1175ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1175action
    FeaturePrefsStore.batch1171.v1175action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1175: acute mode
internal fun PlayerActivity.showV1175AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1175acute
    FeaturePrefsStore.batch1171.v1175acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1175: adam mode
internal fun PlayerActivity.showV1175AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1175adam
    FeaturePrefsStore.batch1171.v1175adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1176: accent mode
internal fun PlayerActivity.showV1176AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1176accent
    FeaturePrefsStore.batch1171.v1176accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1176: accept mode
internal fun PlayerActivity.showV1176AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1176accept
    FeaturePrefsStore.batch1171.v1176accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1176: access mode
internal fun PlayerActivity.showV1176AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1176access
    FeaturePrefsStore.batch1171.v1176access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1176: acclaim mode
internal fun PlayerActivity.showV1176AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1176acclaim
    FeaturePrefsStore.batch1171.v1176acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1176: accord mode
internal fun PlayerActivity.showV1176AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1176accord
    FeaturePrefsStore.batch1171.v1176accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1176: account level
internal fun PlayerActivity.showV1176AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1176account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1176account = value
        AppToast.show(this, "account: $value")
    }
}

// v1176: ace level
internal fun PlayerActivity.showV1176AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1176ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1176ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1176: acid level
internal fun PlayerActivity.showV1176AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1176acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1176acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1176: acme level
internal fun PlayerActivity.showV1176AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1176acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1176acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1176: acoustic level
internal fun PlayerActivity.showV1176AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1176acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1176acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1176: acre mode
internal fun PlayerActivity.showV1176AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1176acre
    FeaturePrefsStore.batch1171.v1176acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1176: act mode
internal fun PlayerActivity.showV1176ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1176act
    FeaturePrefsStore.batch1171.v1176act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1176: action mode
internal fun PlayerActivity.showV1176ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1176action
    FeaturePrefsStore.batch1171.v1176action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1176: acute mode
internal fun PlayerActivity.showV1176AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1176acute
    FeaturePrefsStore.batch1171.v1176acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1176: adam mode
internal fun PlayerActivity.showV1176AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1176adam
    FeaturePrefsStore.batch1171.v1176adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1177: accent mode
internal fun PlayerActivity.showV1177AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1177accent
    FeaturePrefsStore.batch1171.v1177accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1177: accept mode
internal fun PlayerActivity.showV1177AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1177accept
    FeaturePrefsStore.batch1171.v1177accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1177: access mode
internal fun PlayerActivity.showV1177AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1177access
    FeaturePrefsStore.batch1171.v1177access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1177: acclaim mode
internal fun PlayerActivity.showV1177AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1177acclaim
    FeaturePrefsStore.batch1171.v1177acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1177: accord mode
internal fun PlayerActivity.showV1177AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1177accord
    FeaturePrefsStore.batch1171.v1177accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1177: account level
internal fun PlayerActivity.showV1177AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1177account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1177account = value
        AppToast.show(this, "account: $value")
    }
}

// v1177: ace level
internal fun PlayerActivity.showV1177AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1177ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1177ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1177: acid level
internal fun PlayerActivity.showV1177AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1177acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1177acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1177: acme level
internal fun PlayerActivity.showV1177AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1177acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1177acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1177: acoustic level
internal fun PlayerActivity.showV1177AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1177acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1177acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1177: acre mode
internal fun PlayerActivity.showV1177AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1177acre
    FeaturePrefsStore.batch1171.v1177acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1177: act mode
internal fun PlayerActivity.showV1177ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1177act
    FeaturePrefsStore.batch1171.v1177act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1177: action mode
internal fun PlayerActivity.showV1177ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1177action
    FeaturePrefsStore.batch1171.v1177action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1177: acute mode
internal fun PlayerActivity.showV1177AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1177acute
    FeaturePrefsStore.batch1171.v1177acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1177: adam mode
internal fun PlayerActivity.showV1177AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1177adam
    FeaturePrefsStore.batch1171.v1177adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1178: accent mode
internal fun PlayerActivity.showV1178AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1178accent
    FeaturePrefsStore.batch1171.v1178accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1178: accept mode
internal fun PlayerActivity.showV1178AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1178accept
    FeaturePrefsStore.batch1171.v1178accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1178: access mode
internal fun PlayerActivity.showV1178AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1178access
    FeaturePrefsStore.batch1171.v1178access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1178: acclaim mode
internal fun PlayerActivity.showV1178AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1178acclaim
    FeaturePrefsStore.batch1171.v1178acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1178: accord mode
internal fun PlayerActivity.showV1178AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1178accord
    FeaturePrefsStore.batch1171.v1178accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1178: account level
internal fun PlayerActivity.showV1178AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1178account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1178account = value
        AppToast.show(this, "account: $value")
    }
}

// v1178: ace level
internal fun PlayerActivity.showV1178AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1178ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1178ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1178: acid level
internal fun PlayerActivity.showV1178AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1178acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1178acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1178: acme level
internal fun PlayerActivity.showV1178AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1178acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1178acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1178: acoustic level
internal fun PlayerActivity.showV1178AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1178acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1178acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1178: acre mode
internal fun PlayerActivity.showV1178AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1178acre
    FeaturePrefsStore.batch1171.v1178acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1178: act mode
internal fun PlayerActivity.showV1178ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1178act
    FeaturePrefsStore.batch1171.v1178act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1178: action mode
internal fun PlayerActivity.showV1178ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1178action
    FeaturePrefsStore.batch1171.v1178action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1178: acute mode
internal fun PlayerActivity.showV1178AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1178acute
    FeaturePrefsStore.batch1171.v1178acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1178: adam mode
internal fun PlayerActivity.showV1178AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1178adam
    FeaturePrefsStore.batch1171.v1178adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1179: accent mode
internal fun PlayerActivity.showV1179AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1179accent
    FeaturePrefsStore.batch1171.v1179accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1179: accept mode
internal fun PlayerActivity.showV1179AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1179accept
    FeaturePrefsStore.batch1171.v1179accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1179: access mode
internal fun PlayerActivity.showV1179AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1179access
    FeaturePrefsStore.batch1171.v1179access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1179: acclaim mode
internal fun PlayerActivity.showV1179AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1179acclaim
    FeaturePrefsStore.batch1171.v1179acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1179: accord mode
internal fun PlayerActivity.showV1179AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1179accord
    FeaturePrefsStore.batch1171.v1179accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1179: account level
internal fun PlayerActivity.showV1179AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1179account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1179account = value
        AppToast.show(this, "account: $value")
    }
}

// v1179: ace level
internal fun PlayerActivity.showV1179AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1179ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1179ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1179: acid level
internal fun PlayerActivity.showV1179AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1179acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1179acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1179: acme level
internal fun PlayerActivity.showV1179AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1179acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1179acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1179: acoustic level
internal fun PlayerActivity.showV1179AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1179acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1179acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1179: acre mode
internal fun PlayerActivity.showV1179AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1179acre
    FeaturePrefsStore.batch1171.v1179acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1179: act mode
internal fun PlayerActivity.showV1179ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1179act
    FeaturePrefsStore.batch1171.v1179act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1179: action mode
internal fun PlayerActivity.showV1179ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1179action
    FeaturePrefsStore.batch1171.v1179action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1179: acute mode
internal fun PlayerActivity.showV1179AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1179acute
    FeaturePrefsStore.batch1171.v1179acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1179: adam mode
internal fun PlayerActivity.showV1179AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1179adam
    FeaturePrefsStore.batch1171.v1179adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

// v1180: accent mode
internal fun PlayerActivity.showV1180AccentToggle() {
    val current = FeaturePrefsStore.batch1171.v1180accent
    FeaturePrefsStore.batch1171.v1180accent = !current
    AppToast.show(this, "accent: ${if (!current) "ON" else "OFF"}")
}

// v1180: accept mode
internal fun PlayerActivity.showV1180AcceptToggle() {
    val current = FeaturePrefsStore.batch1171.v1180accept
    FeaturePrefsStore.batch1171.v1180accept = !current
    AppToast.show(this, "accept: ${if (!current) "ON" else "OFF"}")
}

// v1180: access mode
internal fun PlayerActivity.showV1180AccessToggle() {
    val current = FeaturePrefsStore.batch1171.v1180access
    FeaturePrefsStore.batch1171.v1180access = !current
    AppToast.show(this, "access: ${if (!current) "ON" else "OFF"}")
}

// v1180: acclaim mode
internal fun PlayerActivity.showV1180AcclaimToggle() {
    val current = FeaturePrefsStore.batch1171.v1180acclaim
    FeaturePrefsStore.batch1171.v1180acclaim = !current
    AppToast.show(this, "acclaim: ${if (!current) "ON" else "OFF"}")
}

// v1180: accord mode
internal fun PlayerActivity.showV1180AccordToggle() {
    val current = FeaturePrefsStore.batch1171.v1180accord
    FeaturePrefsStore.batch1171.v1180accord = !current
    AppToast.show(this, "accord: ${if (!current) "ON" else "OFF"}")
}

// v1180: account level
internal fun PlayerActivity.showV1180AccountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1180account).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "account level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1180account = value
        AppToast.show(this, "account: $value")
    }
}

// v1180: ace level
internal fun PlayerActivity.showV1180AceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1180ace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1180ace = value
        AppToast.show(this, "ace: $value")
    }
}

// v1180: acid level
internal fun PlayerActivity.showV1180AcidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1180acid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1180acid = value
        AppToast.show(this, "acid: $value")
    }
}

// v1180: acme level
internal fun PlayerActivity.showV1180AcmeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1180acme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acme level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1180acme = value
        AppToast.show(this, "acme: $value")
    }
}

// v1180: acoustic level
internal fun PlayerActivity.showV1180AcousticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1171.v1180acoustic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "acoustic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1171.v1180acoustic = value
        AppToast.show(this, "acoustic: $value")
    }
}

// v1180: acre mode
internal fun PlayerActivity.showV1180AcreToggle() {
    val current = FeaturePrefsStore.batch1171.v1180acre
    FeaturePrefsStore.batch1171.v1180acre = !current
    AppToast.show(this, "acre: ${if (!current) "ON" else "OFF"}")
}

// v1180: act mode
internal fun PlayerActivity.showV1180ActToggle() {
    val current = FeaturePrefsStore.batch1171.v1180act
    FeaturePrefsStore.batch1171.v1180act = !current
    AppToast.show(this, "act: ${if (!current) "ON" else "OFF"}")
}

// v1180: action mode
internal fun PlayerActivity.showV1180ActionToggle() {
    val current = FeaturePrefsStore.batch1171.v1180action
    FeaturePrefsStore.batch1171.v1180action = !current
    AppToast.show(this, "action: ${if (!current) "ON" else "OFF"}")
}

// v1180: acute mode
internal fun PlayerActivity.showV1180AcuteToggle() {
    val current = FeaturePrefsStore.batch1171.v1180acute
    FeaturePrefsStore.batch1171.v1180acute = !current
    AppToast.show(this, "acute: ${if (!current) "ON" else "OFF"}")
}

// v1180: adam mode
internal fun PlayerActivity.showV1180AdamToggle() {
    val current = FeaturePrefsStore.batch1171.v1180adam
    FeaturePrefsStore.batch1171.v1180adam = !current
    AppToast.show(this, "adam: ${if (!current) "ON" else "OFF"}")
}

