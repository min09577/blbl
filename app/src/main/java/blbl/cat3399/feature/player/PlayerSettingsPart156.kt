package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1741: reward mode
internal fun PlayerActivity.showV1741RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1741reward
    FeaturePrefsStore.batch1741.v1741reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1741: rhythm mode
internal fun PlayerActivity.showV1741RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rhythm
    FeaturePrefsStore.batch1741.v1741rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1741: rib mode
internal fun PlayerActivity.showV1741RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rib
    FeaturePrefsStore.batch1741.v1741rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1741: ribbon mode
internal fun PlayerActivity.showV1741RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ribbon
    FeaturePrefsStore.batch1741.v1741ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1741: rice mode
internal fun PlayerActivity.showV1741RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rice
    FeaturePrefsStore.batch1741.v1741rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1741: rich level
internal fun PlayerActivity.showV1741RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1741: ride level
internal fun PlayerActivity.showV1741RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1741: ridge level
internal fun PlayerActivity.showV1741RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1741: rifle level
internal fun PlayerActivity.showV1741RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1741: rigid level
internal fun PlayerActivity.showV1741RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1741: ring mode
internal fun PlayerActivity.showV1741RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ring
    FeaturePrefsStore.batch1741.v1741ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1741: riot mode
internal fun PlayerActivity.showV1741RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1741riot
    FeaturePrefsStore.batch1741.v1741riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1741: ripple mode
internal fun PlayerActivity.showV1741RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ripple
    FeaturePrefsStore.batch1741.v1741ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1741: risk mode
internal fun PlayerActivity.showV1741RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1741risk
    FeaturePrefsStore.batch1741.v1741risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1741: ritual mode
internal fun PlayerActivity.showV1741RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ritual
    FeaturePrefsStore.batch1741.v1741ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1742: reward mode
internal fun PlayerActivity.showV1742RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1742reward
    FeaturePrefsStore.batch1741.v1742reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1742: rhythm mode
internal fun PlayerActivity.showV1742RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rhythm
    FeaturePrefsStore.batch1741.v1742rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1742: rib mode
internal fun PlayerActivity.showV1742RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rib
    FeaturePrefsStore.batch1741.v1742rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1742: ribbon mode
internal fun PlayerActivity.showV1742RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ribbon
    FeaturePrefsStore.batch1741.v1742ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1742: rice mode
internal fun PlayerActivity.showV1742RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rice
    FeaturePrefsStore.batch1741.v1742rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1742: rich level
internal fun PlayerActivity.showV1742RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1742: ride level
internal fun PlayerActivity.showV1742RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1742: ridge level
internal fun PlayerActivity.showV1742RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1742: rifle level
internal fun PlayerActivity.showV1742RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1742: rigid level
internal fun PlayerActivity.showV1742RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1742: ring mode
internal fun PlayerActivity.showV1742RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ring
    FeaturePrefsStore.batch1741.v1742ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1742: riot mode
internal fun PlayerActivity.showV1742RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1742riot
    FeaturePrefsStore.batch1741.v1742riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1742: ripple mode
internal fun PlayerActivity.showV1742RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ripple
    FeaturePrefsStore.batch1741.v1742ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1742: risk mode
internal fun PlayerActivity.showV1742RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1742risk
    FeaturePrefsStore.batch1741.v1742risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1742: ritual mode
internal fun PlayerActivity.showV1742RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ritual
    FeaturePrefsStore.batch1741.v1742ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1743: reward mode
internal fun PlayerActivity.showV1743RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1743reward
    FeaturePrefsStore.batch1741.v1743reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1743: rhythm mode
internal fun PlayerActivity.showV1743RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rhythm
    FeaturePrefsStore.batch1741.v1743rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1743: rib mode
internal fun PlayerActivity.showV1743RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rib
    FeaturePrefsStore.batch1741.v1743rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1743: ribbon mode
internal fun PlayerActivity.showV1743RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ribbon
    FeaturePrefsStore.batch1741.v1743ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1743: rice mode
internal fun PlayerActivity.showV1743RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rice
    FeaturePrefsStore.batch1741.v1743rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1743: rich level
internal fun PlayerActivity.showV1743RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1743: ride level
internal fun PlayerActivity.showV1743RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1743: ridge level
internal fun PlayerActivity.showV1743RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1743: rifle level
internal fun PlayerActivity.showV1743RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1743: rigid level
internal fun PlayerActivity.showV1743RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1743: ring mode
internal fun PlayerActivity.showV1743RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ring
    FeaturePrefsStore.batch1741.v1743ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1743: riot mode
internal fun PlayerActivity.showV1743RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1743riot
    FeaturePrefsStore.batch1741.v1743riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1743: ripple mode
internal fun PlayerActivity.showV1743RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ripple
    FeaturePrefsStore.batch1741.v1743ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1743: risk mode
internal fun PlayerActivity.showV1743RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1743risk
    FeaturePrefsStore.batch1741.v1743risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1743: ritual mode
internal fun PlayerActivity.showV1743RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ritual
    FeaturePrefsStore.batch1741.v1743ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1744: reward mode
internal fun PlayerActivity.showV1744RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1744reward
    FeaturePrefsStore.batch1741.v1744reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1744: rhythm mode
internal fun PlayerActivity.showV1744RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rhythm
    FeaturePrefsStore.batch1741.v1744rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1744: rib mode
internal fun PlayerActivity.showV1744RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rib
    FeaturePrefsStore.batch1741.v1744rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1744: ribbon mode
internal fun PlayerActivity.showV1744RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ribbon
    FeaturePrefsStore.batch1741.v1744ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1744: rice mode
internal fun PlayerActivity.showV1744RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rice
    FeaturePrefsStore.batch1741.v1744rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1744: rich level
internal fun PlayerActivity.showV1744RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1744: ride level
internal fun PlayerActivity.showV1744RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1744: ridge level
internal fun PlayerActivity.showV1744RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1744: rifle level
internal fun PlayerActivity.showV1744RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1744: rigid level
internal fun PlayerActivity.showV1744RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1744: ring mode
internal fun PlayerActivity.showV1744RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ring
    FeaturePrefsStore.batch1741.v1744ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1744: riot mode
internal fun PlayerActivity.showV1744RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1744riot
    FeaturePrefsStore.batch1741.v1744riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1744: ripple mode
internal fun PlayerActivity.showV1744RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ripple
    FeaturePrefsStore.batch1741.v1744ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1744: risk mode
internal fun PlayerActivity.showV1744RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1744risk
    FeaturePrefsStore.batch1741.v1744risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1744: ritual mode
internal fun PlayerActivity.showV1744RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ritual
    FeaturePrefsStore.batch1741.v1744ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1745: reward mode
internal fun PlayerActivity.showV1745RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1745reward
    FeaturePrefsStore.batch1741.v1745reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1745: rhythm mode
internal fun PlayerActivity.showV1745RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rhythm
    FeaturePrefsStore.batch1741.v1745rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1745: rib mode
internal fun PlayerActivity.showV1745RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rib
    FeaturePrefsStore.batch1741.v1745rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1745: ribbon mode
internal fun PlayerActivity.showV1745RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ribbon
    FeaturePrefsStore.batch1741.v1745ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1745: rice mode
internal fun PlayerActivity.showV1745RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rice
    FeaturePrefsStore.batch1741.v1745rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1745: rich level
internal fun PlayerActivity.showV1745RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1745: ride level
internal fun PlayerActivity.showV1745RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1745: ridge level
internal fun PlayerActivity.showV1745RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1745: rifle level
internal fun PlayerActivity.showV1745RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1745: rigid level
internal fun PlayerActivity.showV1745RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1745: ring mode
internal fun PlayerActivity.showV1745RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ring
    FeaturePrefsStore.batch1741.v1745ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1745: riot mode
internal fun PlayerActivity.showV1745RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1745riot
    FeaturePrefsStore.batch1741.v1745riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1745: ripple mode
internal fun PlayerActivity.showV1745RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ripple
    FeaturePrefsStore.batch1741.v1745ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1745: risk mode
internal fun PlayerActivity.showV1745RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1745risk
    FeaturePrefsStore.batch1741.v1745risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1745: ritual mode
internal fun PlayerActivity.showV1745RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ritual
    FeaturePrefsStore.batch1741.v1745ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1746: reward mode
internal fun PlayerActivity.showV1746RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1746reward
    FeaturePrefsStore.batch1741.v1746reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1746: rhythm mode
internal fun PlayerActivity.showV1746RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rhythm
    FeaturePrefsStore.batch1741.v1746rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1746: rib mode
internal fun PlayerActivity.showV1746RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rib
    FeaturePrefsStore.batch1741.v1746rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1746: ribbon mode
internal fun PlayerActivity.showV1746RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ribbon
    FeaturePrefsStore.batch1741.v1746ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1746: rice mode
internal fun PlayerActivity.showV1746RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rice
    FeaturePrefsStore.batch1741.v1746rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1746: rich level
internal fun PlayerActivity.showV1746RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1746: ride level
internal fun PlayerActivity.showV1746RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1746: ridge level
internal fun PlayerActivity.showV1746RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1746: rifle level
internal fun PlayerActivity.showV1746RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1746: rigid level
internal fun PlayerActivity.showV1746RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1746: ring mode
internal fun PlayerActivity.showV1746RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ring
    FeaturePrefsStore.batch1741.v1746ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1746: riot mode
internal fun PlayerActivity.showV1746RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1746riot
    FeaturePrefsStore.batch1741.v1746riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1746: ripple mode
internal fun PlayerActivity.showV1746RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ripple
    FeaturePrefsStore.batch1741.v1746ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1746: risk mode
internal fun PlayerActivity.showV1746RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1746risk
    FeaturePrefsStore.batch1741.v1746risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1746: ritual mode
internal fun PlayerActivity.showV1746RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ritual
    FeaturePrefsStore.batch1741.v1746ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1747: reward mode
internal fun PlayerActivity.showV1747RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1747reward
    FeaturePrefsStore.batch1741.v1747reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1747: rhythm mode
internal fun PlayerActivity.showV1747RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rhythm
    FeaturePrefsStore.batch1741.v1747rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1747: rib mode
internal fun PlayerActivity.showV1747RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rib
    FeaturePrefsStore.batch1741.v1747rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1747: ribbon mode
internal fun PlayerActivity.showV1747RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ribbon
    FeaturePrefsStore.batch1741.v1747ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1747: rice mode
internal fun PlayerActivity.showV1747RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rice
    FeaturePrefsStore.batch1741.v1747rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1747: rich level
internal fun PlayerActivity.showV1747RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1747: ride level
internal fun PlayerActivity.showV1747RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1747: ridge level
internal fun PlayerActivity.showV1747RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1747: rifle level
internal fun PlayerActivity.showV1747RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1747: rigid level
internal fun PlayerActivity.showV1747RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1747: ring mode
internal fun PlayerActivity.showV1747RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ring
    FeaturePrefsStore.batch1741.v1747ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1747: riot mode
internal fun PlayerActivity.showV1747RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1747riot
    FeaturePrefsStore.batch1741.v1747riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1747: ripple mode
internal fun PlayerActivity.showV1747RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ripple
    FeaturePrefsStore.batch1741.v1747ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1747: risk mode
internal fun PlayerActivity.showV1747RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1747risk
    FeaturePrefsStore.batch1741.v1747risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1747: ritual mode
internal fun PlayerActivity.showV1747RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ritual
    FeaturePrefsStore.batch1741.v1747ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1748: reward mode
internal fun PlayerActivity.showV1748RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1748reward
    FeaturePrefsStore.batch1741.v1748reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1748: rhythm mode
internal fun PlayerActivity.showV1748RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rhythm
    FeaturePrefsStore.batch1741.v1748rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1748: rib mode
internal fun PlayerActivity.showV1748RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rib
    FeaturePrefsStore.batch1741.v1748rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1748: ribbon mode
internal fun PlayerActivity.showV1748RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ribbon
    FeaturePrefsStore.batch1741.v1748ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1748: rice mode
internal fun PlayerActivity.showV1748RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rice
    FeaturePrefsStore.batch1741.v1748rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1748: rich level
internal fun PlayerActivity.showV1748RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1748: ride level
internal fun PlayerActivity.showV1748RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1748: ridge level
internal fun PlayerActivity.showV1748RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1748: rifle level
internal fun PlayerActivity.showV1748RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1748: rigid level
internal fun PlayerActivity.showV1748RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1748: ring mode
internal fun PlayerActivity.showV1748RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ring
    FeaturePrefsStore.batch1741.v1748ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1748: riot mode
internal fun PlayerActivity.showV1748RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1748riot
    FeaturePrefsStore.batch1741.v1748riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1748: ripple mode
internal fun PlayerActivity.showV1748RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ripple
    FeaturePrefsStore.batch1741.v1748ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1748: risk mode
internal fun PlayerActivity.showV1748RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1748risk
    FeaturePrefsStore.batch1741.v1748risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1748: ritual mode
internal fun PlayerActivity.showV1748RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ritual
    FeaturePrefsStore.batch1741.v1748ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1749: reward mode
internal fun PlayerActivity.showV1749RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1749reward
    FeaturePrefsStore.batch1741.v1749reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1749: rhythm mode
internal fun PlayerActivity.showV1749RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rhythm
    FeaturePrefsStore.batch1741.v1749rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1749: rib mode
internal fun PlayerActivity.showV1749RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rib
    FeaturePrefsStore.batch1741.v1749rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1749: ribbon mode
internal fun PlayerActivity.showV1749RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ribbon
    FeaturePrefsStore.batch1741.v1749ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1749: rice mode
internal fun PlayerActivity.showV1749RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rice
    FeaturePrefsStore.batch1741.v1749rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1749: rich level
internal fun PlayerActivity.showV1749RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1749: ride level
internal fun PlayerActivity.showV1749RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1749: ridge level
internal fun PlayerActivity.showV1749RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1749: rifle level
internal fun PlayerActivity.showV1749RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1749: rigid level
internal fun PlayerActivity.showV1749RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1749: ring mode
internal fun PlayerActivity.showV1749RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ring
    FeaturePrefsStore.batch1741.v1749ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1749: riot mode
internal fun PlayerActivity.showV1749RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1749riot
    FeaturePrefsStore.batch1741.v1749riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1749: ripple mode
internal fun PlayerActivity.showV1749RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ripple
    FeaturePrefsStore.batch1741.v1749ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1749: risk mode
internal fun PlayerActivity.showV1749RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1749risk
    FeaturePrefsStore.batch1741.v1749risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1749: ritual mode
internal fun PlayerActivity.showV1749RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ritual
    FeaturePrefsStore.batch1741.v1749ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1750: reward mode
internal fun PlayerActivity.showV1750RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1750reward
    FeaturePrefsStore.batch1741.v1750reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1750: rhythm mode
internal fun PlayerActivity.showV1750RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rhythm
    FeaturePrefsStore.batch1741.v1750rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1750: rib mode
internal fun PlayerActivity.showV1750RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rib
    FeaturePrefsStore.batch1741.v1750rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1750: ribbon mode
internal fun PlayerActivity.showV1750RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ribbon
    FeaturePrefsStore.batch1741.v1750ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1750: rice mode
internal fun PlayerActivity.showV1750RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rice
    FeaturePrefsStore.batch1741.v1750rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1750: rich level
internal fun PlayerActivity.showV1750RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1750: ride level
internal fun PlayerActivity.showV1750RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1750: ridge level
internal fun PlayerActivity.showV1750RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1750: rifle level
internal fun PlayerActivity.showV1750RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1750: rigid level
internal fun PlayerActivity.showV1750RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1750: ring mode
internal fun PlayerActivity.showV1750RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ring
    FeaturePrefsStore.batch1741.v1750ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1750: riot mode
internal fun PlayerActivity.showV1750RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1750riot
    FeaturePrefsStore.batch1741.v1750riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1750: ripple mode
internal fun PlayerActivity.showV1750RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ripple
    FeaturePrefsStore.batch1741.v1750ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1750: risk mode
internal fun PlayerActivity.showV1750RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1750risk
    FeaturePrefsStore.batch1741.v1750risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1750: ritual mode
internal fun PlayerActivity.showV1750RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ritual
    FeaturePrefsStore.batch1741.v1750ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

