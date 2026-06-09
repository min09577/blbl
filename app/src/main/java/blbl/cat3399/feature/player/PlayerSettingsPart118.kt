package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1361: crowd mode
internal fun PlayerActivity.showV1361CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crowd
    FeaturePrefsStore.batch1361.v1361crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1361: crown mode
internal fun PlayerActivity.showV1361CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crown
    FeaturePrefsStore.batch1361.v1361crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1361: crush mode
internal fun PlayerActivity.showV1361CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crush
    FeaturePrefsStore.batch1361.v1361crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1361: cubic mode
internal fun PlayerActivity.showV1361CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1361cubic
    FeaturePrefsStore.batch1361.v1361cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1361: cult mode
internal fun PlayerActivity.showV1361CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1361cult
    FeaturePrefsStore.batch1361.v1361cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1361: cup level
internal fun PlayerActivity.showV1361CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1361: cure level
internal fun PlayerActivity.showV1361CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1361: curl level
internal fun PlayerActivity.showV1361CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1361: curtain level
internal fun PlayerActivity.showV1361CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1361: daily level
internal fun PlayerActivity.showV1361DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1361: damage mode
internal fun PlayerActivity.showV1361DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1361damage
    FeaturePrefsStore.batch1361.v1361damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1361: dance mode
internal fun PlayerActivity.showV1361DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dance
    FeaturePrefsStore.batch1361.v1361dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1361: dare mode
internal fun PlayerActivity.showV1361DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dare
    FeaturePrefsStore.batch1361.v1361dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1361: dark mode
internal fun PlayerActivity.showV1361DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dark
    FeaturePrefsStore.batch1361.v1361dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1361: dash mode
internal fun PlayerActivity.showV1361DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dash
    FeaturePrefsStore.batch1361.v1361dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1362: crowd mode
internal fun PlayerActivity.showV1362CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crowd
    FeaturePrefsStore.batch1361.v1362crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1362: crown mode
internal fun PlayerActivity.showV1362CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crown
    FeaturePrefsStore.batch1361.v1362crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1362: crush mode
internal fun PlayerActivity.showV1362CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crush
    FeaturePrefsStore.batch1361.v1362crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1362: cubic mode
internal fun PlayerActivity.showV1362CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1362cubic
    FeaturePrefsStore.batch1361.v1362cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1362: cult mode
internal fun PlayerActivity.showV1362CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1362cult
    FeaturePrefsStore.batch1361.v1362cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1362: cup level
internal fun PlayerActivity.showV1362CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1362: cure level
internal fun PlayerActivity.showV1362CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1362: curl level
internal fun PlayerActivity.showV1362CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1362: curtain level
internal fun PlayerActivity.showV1362CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1362: daily level
internal fun PlayerActivity.showV1362DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1362: damage mode
internal fun PlayerActivity.showV1362DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1362damage
    FeaturePrefsStore.batch1361.v1362damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1362: dance mode
internal fun PlayerActivity.showV1362DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dance
    FeaturePrefsStore.batch1361.v1362dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1362: dare mode
internal fun PlayerActivity.showV1362DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dare
    FeaturePrefsStore.batch1361.v1362dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1362: dark mode
internal fun PlayerActivity.showV1362DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dark
    FeaturePrefsStore.batch1361.v1362dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1362: dash mode
internal fun PlayerActivity.showV1362DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dash
    FeaturePrefsStore.batch1361.v1362dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1363: crowd mode
internal fun PlayerActivity.showV1363CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crowd
    FeaturePrefsStore.batch1361.v1363crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1363: crown mode
internal fun PlayerActivity.showV1363CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crown
    FeaturePrefsStore.batch1361.v1363crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1363: crush mode
internal fun PlayerActivity.showV1363CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crush
    FeaturePrefsStore.batch1361.v1363crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1363: cubic mode
internal fun PlayerActivity.showV1363CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1363cubic
    FeaturePrefsStore.batch1361.v1363cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1363: cult mode
internal fun PlayerActivity.showV1363CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1363cult
    FeaturePrefsStore.batch1361.v1363cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1363: cup level
internal fun PlayerActivity.showV1363CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1363: cure level
internal fun PlayerActivity.showV1363CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1363: curl level
internal fun PlayerActivity.showV1363CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1363: curtain level
internal fun PlayerActivity.showV1363CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1363: daily level
internal fun PlayerActivity.showV1363DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1363: damage mode
internal fun PlayerActivity.showV1363DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1363damage
    FeaturePrefsStore.batch1361.v1363damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1363: dance mode
internal fun PlayerActivity.showV1363DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dance
    FeaturePrefsStore.batch1361.v1363dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1363: dare mode
internal fun PlayerActivity.showV1363DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dare
    FeaturePrefsStore.batch1361.v1363dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1363: dark mode
internal fun PlayerActivity.showV1363DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dark
    FeaturePrefsStore.batch1361.v1363dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1363: dash mode
internal fun PlayerActivity.showV1363DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dash
    FeaturePrefsStore.batch1361.v1363dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1364: crowd mode
internal fun PlayerActivity.showV1364CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crowd
    FeaturePrefsStore.batch1361.v1364crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1364: crown mode
internal fun PlayerActivity.showV1364CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crown
    FeaturePrefsStore.batch1361.v1364crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1364: crush mode
internal fun PlayerActivity.showV1364CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crush
    FeaturePrefsStore.batch1361.v1364crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1364: cubic mode
internal fun PlayerActivity.showV1364CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1364cubic
    FeaturePrefsStore.batch1361.v1364cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1364: cult mode
internal fun PlayerActivity.showV1364CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1364cult
    FeaturePrefsStore.batch1361.v1364cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1364: cup level
internal fun PlayerActivity.showV1364CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1364: cure level
internal fun PlayerActivity.showV1364CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1364: curl level
internal fun PlayerActivity.showV1364CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1364: curtain level
internal fun PlayerActivity.showV1364CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1364: daily level
internal fun PlayerActivity.showV1364DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1364: damage mode
internal fun PlayerActivity.showV1364DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1364damage
    FeaturePrefsStore.batch1361.v1364damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1364: dance mode
internal fun PlayerActivity.showV1364DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dance
    FeaturePrefsStore.batch1361.v1364dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1364: dare mode
internal fun PlayerActivity.showV1364DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dare
    FeaturePrefsStore.batch1361.v1364dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1364: dark mode
internal fun PlayerActivity.showV1364DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dark
    FeaturePrefsStore.batch1361.v1364dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1364: dash mode
internal fun PlayerActivity.showV1364DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dash
    FeaturePrefsStore.batch1361.v1364dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1365: crowd mode
internal fun PlayerActivity.showV1365CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crowd
    FeaturePrefsStore.batch1361.v1365crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1365: crown mode
internal fun PlayerActivity.showV1365CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crown
    FeaturePrefsStore.batch1361.v1365crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1365: crush mode
internal fun PlayerActivity.showV1365CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crush
    FeaturePrefsStore.batch1361.v1365crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1365: cubic mode
internal fun PlayerActivity.showV1365CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1365cubic
    FeaturePrefsStore.batch1361.v1365cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1365: cult mode
internal fun PlayerActivity.showV1365CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1365cult
    FeaturePrefsStore.batch1361.v1365cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1365: cup level
internal fun PlayerActivity.showV1365CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1365: cure level
internal fun PlayerActivity.showV1365CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1365: curl level
internal fun PlayerActivity.showV1365CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1365: curtain level
internal fun PlayerActivity.showV1365CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1365: daily level
internal fun PlayerActivity.showV1365DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1365: damage mode
internal fun PlayerActivity.showV1365DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1365damage
    FeaturePrefsStore.batch1361.v1365damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1365: dance mode
internal fun PlayerActivity.showV1365DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dance
    FeaturePrefsStore.batch1361.v1365dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1365: dare mode
internal fun PlayerActivity.showV1365DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dare
    FeaturePrefsStore.batch1361.v1365dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1365: dark mode
internal fun PlayerActivity.showV1365DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dark
    FeaturePrefsStore.batch1361.v1365dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1365: dash mode
internal fun PlayerActivity.showV1365DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dash
    FeaturePrefsStore.batch1361.v1365dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1366: crowd mode
internal fun PlayerActivity.showV1366CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crowd
    FeaturePrefsStore.batch1361.v1366crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1366: crown mode
internal fun PlayerActivity.showV1366CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crown
    FeaturePrefsStore.batch1361.v1366crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1366: crush mode
internal fun PlayerActivity.showV1366CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crush
    FeaturePrefsStore.batch1361.v1366crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1366: cubic mode
internal fun PlayerActivity.showV1366CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1366cubic
    FeaturePrefsStore.batch1361.v1366cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1366: cult mode
internal fun PlayerActivity.showV1366CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1366cult
    FeaturePrefsStore.batch1361.v1366cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1366: cup level
internal fun PlayerActivity.showV1366CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1366: cure level
internal fun PlayerActivity.showV1366CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1366: curl level
internal fun PlayerActivity.showV1366CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1366: curtain level
internal fun PlayerActivity.showV1366CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1366: daily level
internal fun PlayerActivity.showV1366DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1366: damage mode
internal fun PlayerActivity.showV1366DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1366damage
    FeaturePrefsStore.batch1361.v1366damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1366: dance mode
internal fun PlayerActivity.showV1366DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dance
    FeaturePrefsStore.batch1361.v1366dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1366: dare mode
internal fun PlayerActivity.showV1366DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dare
    FeaturePrefsStore.batch1361.v1366dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1366: dark mode
internal fun PlayerActivity.showV1366DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dark
    FeaturePrefsStore.batch1361.v1366dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1366: dash mode
internal fun PlayerActivity.showV1366DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dash
    FeaturePrefsStore.batch1361.v1366dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1367: crowd mode
internal fun PlayerActivity.showV1367CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crowd
    FeaturePrefsStore.batch1361.v1367crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1367: crown mode
internal fun PlayerActivity.showV1367CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crown
    FeaturePrefsStore.batch1361.v1367crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1367: crush mode
internal fun PlayerActivity.showV1367CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crush
    FeaturePrefsStore.batch1361.v1367crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1367: cubic mode
internal fun PlayerActivity.showV1367CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1367cubic
    FeaturePrefsStore.batch1361.v1367cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1367: cult mode
internal fun PlayerActivity.showV1367CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1367cult
    FeaturePrefsStore.batch1361.v1367cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1367: cup level
internal fun PlayerActivity.showV1367CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1367: cure level
internal fun PlayerActivity.showV1367CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1367: curl level
internal fun PlayerActivity.showV1367CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1367: curtain level
internal fun PlayerActivity.showV1367CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1367: daily level
internal fun PlayerActivity.showV1367DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1367: damage mode
internal fun PlayerActivity.showV1367DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1367damage
    FeaturePrefsStore.batch1361.v1367damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1367: dance mode
internal fun PlayerActivity.showV1367DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dance
    FeaturePrefsStore.batch1361.v1367dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1367: dare mode
internal fun PlayerActivity.showV1367DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dare
    FeaturePrefsStore.batch1361.v1367dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1367: dark mode
internal fun PlayerActivity.showV1367DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dark
    FeaturePrefsStore.batch1361.v1367dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1367: dash mode
internal fun PlayerActivity.showV1367DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dash
    FeaturePrefsStore.batch1361.v1367dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1368: crowd mode
internal fun PlayerActivity.showV1368CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crowd
    FeaturePrefsStore.batch1361.v1368crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1368: crown mode
internal fun PlayerActivity.showV1368CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crown
    FeaturePrefsStore.batch1361.v1368crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1368: crush mode
internal fun PlayerActivity.showV1368CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crush
    FeaturePrefsStore.batch1361.v1368crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1368: cubic mode
internal fun PlayerActivity.showV1368CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1368cubic
    FeaturePrefsStore.batch1361.v1368cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1368: cult mode
internal fun PlayerActivity.showV1368CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1368cult
    FeaturePrefsStore.batch1361.v1368cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1368: cup level
internal fun PlayerActivity.showV1368CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1368: cure level
internal fun PlayerActivity.showV1368CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1368: curl level
internal fun PlayerActivity.showV1368CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1368: curtain level
internal fun PlayerActivity.showV1368CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1368: daily level
internal fun PlayerActivity.showV1368DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1368: damage mode
internal fun PlayerActivity.showV1368DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1368damage
    FeaturePrefsStore.batch1361.v1368damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1368: dance mode
internal fun PlayerActivity.showV1368DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dance
    FeaturePrefsStore.batch1361.v1368dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1368: dare mode
internal fun PlayerActivity.showV1368DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dare
    FeaturePrefsStore.batch1361.v1368dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1368: dark mode
internal fun PlayerActivity.showV1368DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dark
    FeaturePrefsStore.batch1361.v1368dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1368: dash mode
internal fun PlayerActivity.showV1368DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dash
    FeaturePrefsStore.batch1361.v1368dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1369: crowd mode
internal fun PlayerActivity.showV1369CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crowd
    FeaturePrefsStore.batch1361.v1369crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1369: crown mode
internal fun PlayerActivity.showV1369CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crown
    FeaturePrefsStore.batch1361.v1369crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1369: crush mode
internal fun PlayerActivity.showV1369CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crush
    FeaturePrefsStore.batch1361.v1369crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1369: cubic mode
internal fun PlayerActivity.showV1369CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1369cubic
    FeaturePrefsStore.batch1361.v1369cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1369: cult mode
internal fun PlayerActivity.showV1369CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1369cult
    FeaturePrefsStore.batch1361.v1369cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1369: cup level
internal fun PlayerActivity.showV1369CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1369: cure level
internal fun PlayerActivity.showV1369CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1369: curl level
internal fun PlayerActivity.showV1369CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1369: curtain level
internal fun PlayerActivity.showV1369CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1369: daily level
internal fun PlayerActivity.showV1369DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1369: damage mode
internal fun PlayerActivity.showV1369DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1369damage
    FeaturePrefsStore.batch1361.v1369damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1369: dance mode
internal fun PlayerActivity.showV1369DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dance
    FeaturePrefsStore.batch1361.v1369dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1369: dare mode
internal fun PlayerActivity.showV1369DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dare
    FeaturePrefsStore.batch1361.v1369dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1369: dark mode
internal fun PlayerActivity.showV1369DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dark
    FeaturePrefsStore.batch1361.v1369dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1369: dash mode
internal fun PlayerActivity.showV1369DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dash
    FeaturePrefsStore.batch1361.v1369dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1370: crowd mode
internal fun PlayerActivity.showV1370CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crowd
    FeaturePrefsStore.batch1361.v1370crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1370: crown mode
internal fun PlayerActivity.showV1370CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crown
    FeaturePrefsStore.batch1361.v1370crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1370: crush mode
internal fun PlayerActivity.showV1370CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crush
    FeaturePrefsStore.batch1361.v1370crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1370: cubic mode
internal fun PlayerActivity.showV1370CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1370cubic
    FeaturePrefsStore.batch1361.v1370cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1370: cult mode
internal fun PlayerActivity.showV1370CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1370cult
    FeaturePrefsStore.batch1361.v1370cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1370: cup level
internal fun PlayerActivity.showV1370CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1370: cure level
internal fun PlayerActivity.showV1370CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1370: curl level
internal fun PlayerActivity.showV1370CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1370: curtain level
internal fun PlayerActivity.showV1370CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1370: daily level
internal fun PlayerActivity.showV1370DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1370: damage mode
internal fun PlayerActivity.showV1370DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1370damage
    FeaturePrefsStore.batch1361.v1370damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1370: dance mode
internal fun PlayerActivity.showV1370DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dance
    FeaturePrefsStore.batch1361.v1370dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1370: dare mode
internal fun PlayerActivity.showV1370DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dare
    FeaturePrefsStore.batch1361.v1370dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1370: dark mode
internal fun PlayerActivity.showV1370DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dark
    FeaturePrefsStore.batch1361.v1370dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1370: dash mode
internal fun PlayerActivity.showV1370DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dash
    FeaturePrefsStore.batch1361.v1370dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

