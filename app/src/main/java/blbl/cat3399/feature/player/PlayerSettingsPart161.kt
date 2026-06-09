package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1791: shaft mode
internal fun PlayerActivity.showV1791ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shaft
    FeaturePrefsStore.batch1791.v1791shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1791: shallow mode
internal fun PlayerActivity.showV1791ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shallow
    FeaturePrefsStore.batch1791.v1791shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1791: shed mode
internal fun PlayerActivity.showV1791ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shed
    FeaturePrefsStore.batch1791.v1791shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1791: shell mode
internal fun PlayerActivity.showV1791ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shell
    FeaturePrefsStore.batch1791.v1791shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1791: sheriff mode
internal fun PlayerActivity.showV1791SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1791sheriff
    FeaturePrefsStore.batch1791.v1791sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1791: shield level
internal fun PlayerActivity.showV1791ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1791shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1791shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1791: shine level
internal fun PlayerActivity.showV1791ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1791shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1791shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1791: ship level
internal fun PlayerActivity.showV1791ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1791ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1791ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1791: shiver level
internal fun PlayerActivity.showV1791ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1791shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1791shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1791: shock level
internal fun PlayerActivity.showV1791ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1791shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1791shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1791: shoe mode
internal fun PlayerActivity.showV1791ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shoe
    FeaturePrefsStore.batch1791.v1791shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1791: shoot mode
internal fun PlayerActivity.showV1791ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shoot
    FeaturePrefsStore.batch1791.v1791shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1791: shop mode
internal fun PlayerActivity.showV1791ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shop
    FeaturePrefsStore.batch1791.v1791shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1791: shoulder mode
internal fun PlayerActivity.showV1791ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shoulder
    FeaturePrefsStore.batch1791.v1791shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1791: shove mode
internal fun PlayerActivity.showV1791ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1791shove
    FeaturePrefsStore.batch1791.v1791shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1792: shaft mode
internal fun PlayerActivity.showV1792ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shaft
    FeaturePrefsStore.batch1791.v1792shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1792: shallow mode
internal fun PlayerActivity.showV1792ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shallow
    FeaturePrefsStore.batch1791.v1792shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1792: shed mode
internal fun PlayerActivity.showV1792ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shed
    FeaturePrefsStore.batch1791.v1792shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1792: shell mode
internal fun PlayerActivity.showV1792ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shell
    FeaturePrefsStore.batch1791.v1792shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1792: sheriff mode
internal fun PlayerActivity.showV1792SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1792sheriff
    FeaturePrefsStore.batch1791.v1792sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1792: shield level
internal fun PlayerActivity.showV1792ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1792shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1792shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1792: shine level
internal fun PlayerActivity.showV1792ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1792shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1792shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1792: ship level
internal fun PlayerActivity.showV1792ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1792ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1792ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1792: shiver level
internal fun PlayerActivity.showV1792ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1792shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1792shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1792: shock level
internal fun PlayerActivity.showV1792ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1792shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1792shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1792: shoe mode
internal fun PlayerActivity.showV1792ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shoe
    FeaturePrefsStore.batch1791.v1792shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1792: shoot mode
internal fun PlayerActivity.showV1792ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shoot
    FeaturePrefsStore.batch1791.v1792shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1792: shop mode
internal fun PlayerActivity.showV1792ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shop
    FeaturePrefsStore.batch1791.v1792shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1792: shoulder mode
internal fun PlayerActivity.showV1792ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shoulder
    FeaturePrefsStore.batch1791.v1792shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1792: shove mode
internal fun PlayerActivity.showV1792ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1792shove
    FeaturePrefsStore.batch1791.v1792shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1793: shaft mode
internal fun PlayerActivity.showV1793ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shaft
    FeaturePrefsStore.batch1791.v1793shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1793: shallow mode
internal fun PlayerActivity.showV1793ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shallow
    FeaturePrefsStore.batch1791.v1793shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1793: shed mode
internal fun PlayerActivity.showV1793ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shed
    FeaturePrefsStore.batch1791.v1793shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1793: shell mode
internal fun PlayerActivity.showV1793ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shell
    FeaturePrefsStore.batch1791.v1793shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1793: sheriff mode
internal fun PlayerActivity.showV1793SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1793sheriff
    FeaturePrefsStore.batch1791.v1793sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1793: shield level
internal fun PlayerActivity.showV1793ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1793shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1793shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1793: shine level
internal fun PlayerActivity.showV1793ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1793shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1793shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1793: ship level
internal fun PlayerActivity.showV1793ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1793ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1793ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1793: shiver level
internal fun PlayerActivity.showV1793ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1793shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1793shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1793: shock level
internal fun PlayerActivity.showV1793ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1793shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1793shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1793: shoe mode
internal fun PlayerActivity.showV1793ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shoe
    FeaturePrefsStore.batch1791.v1793shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1793: shoot mode
internal fun PlayerActivity.showV1793ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shoot
    FeaturePrefsStore.batch1791.v1793shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1793: shop mode
internal fun PlayerActivity.showV1793ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shop
    FeaturePrefsStore.batch1791.v1793shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1793: shoulder mode
internal fun PlayerActivity.showV1793ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shoulder
    FeaturePrefsStore.batch1791.v1793shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1793: shove mode
internal fun PlayerActivity.showV1793ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1793shove
    FeaturePrefsStore.batch1791.v1793shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1794: shaft mode
internal fun PlayerActivity.showV1794ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shaft
    FeaturePrefsStore.batch1791.v1794shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1794: shallow mode
internal fun PlayerActivity.showV1794ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shallow
    FeaturePrefsStore.batch1791.v1794shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1794: shed mode
internal fun PlayerActivity.showV1794ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shed
    FeaturePrefsStore.batch1791.v1794shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1794: shell mode
internal fun PlayerActivity.showV1794ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shell
    FeaturePrefsStore.batch1791.v1794shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1794: sheriff mode
internal fun PlayerActivity.showV1794SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1794sheriff
    FeaturePrefsStore.batch1791.v1794sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1794: shield level
internal fun PlayerActivity.showV1794ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1794shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1794shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1794: shine level
internal fun PlayerActivity.showV1794ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1794shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1794shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1794: ship level
internal fun PlayerActivity.showV1794ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1794ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1794ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1794: shiver level
internal fun PlayerActivity.showV1794ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1794shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1794shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1794: shock level
internal fun PlayerActivity.showV1794ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1794shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1794shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1794: shoe mode
internal fun PlayerActivity.showV1794ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shoe
    FeaturePrefsStore.batch1791.v1794shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1794: shoot mode
internal fun PlayerActivity.showV1794ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shoot
    FeaturePrefsStore.batch1791.v1794shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1794: shop mode
internal fun PlayerActivity.showV1794ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shop
    FeaturePrefsStore.batch1791.v1794shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1794: shoulder mode
internal fun PlayerActivity.showV1794ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shoulder
    FeaturePrefsStore.batch1791.v1794shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1794: shove mode
internal fun PlayerActivity.showV1794ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1794shove
    FeaturePrefsStore.batch1791.v1794shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1795: shaft mode
internal fun PlayerActivity.showV1795ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shaft
    FeaturePrefsStore.batch1791.v1795shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1795: shallow mode
internal fun PlayerActivity.showV1795ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shallow
    FeaturePrefsStore.batch1791.v1795shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1795: shed mode
internal fun PlayerActivity.showV1795ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shed
    FeaturePrefsStore.batch1791.v1795shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1795: shell mode
internal fun PlayerActivity.showV1795ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shell
    FeaturePrefsStore.batch1791.v1795shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1795: sheriff mode
internal fun PlayerActivity.showV1795SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1795sheriff
    FeaturePrefsStore.batch1791.v1795sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1795: shield level
internal fun PlayerActivity.showV1795ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1795shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1795shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1795: shine level
internal fun PlayerActivity.showV1795ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1795shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1795shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1795: ship level
internal fun PlayerActivity.showV1795ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1795ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1795ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1795: shiver level
internal fun PlayerActivity.showV1795ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1795shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1795shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1795: shock level
internal fun PlayerActivity.showV1795ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1795shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1795shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1795: shoe mode
internal fun PlayerActivity.showV1795ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shoe
    FeaturePrefsStore.batch1791.v1795shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1795: shoot mode
internal fun PlayerActivity.showV1795ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shoot
    FeaturePrefsStore.batch1791.v1795shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1795: shop mode
internal fun PlayerActivity.showV1795ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shop
    FeaturePrefsStore.batch1791.v1795shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1795: shoulder mode
internal fun PlayerActivity.showV1795ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shoulder
    FeaturePrefsStore.batch1791.v1795shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1795: shove mode
internal fun PlayerActivity.showV1795ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1795shove
    FeaturePrefsStore.batch1791.v1795shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1796: shaft mode
internal fun PlayerActivity.showV1796ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shaft
    FeaturePrefsStore.batch1791.v1796shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1796: shallow mode
internal fun PlayerActivity.showV1796ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shallow
    FeaturePrefsStore.batch1791.v1796shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1796: shed mode
internal fun PlayerActivity.showV1796ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shed
    FeaturePrefsStore.batch1791.v1796shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1796: shell mode
internal fun PlayerActivity.showV1796ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shell
    FeaturePrefsStore.batch1791.v1796shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1796: sheriff mode
internal fun PlayerActivity.showV1796SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1796sheriff
    FeaturePrefsStore.batch1791.v1796sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1796: shield level
internal fun PlayerActivity.showV1796ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1796shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1796shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1796: shine level
internal fun PlayerActivity.showV1796ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1796shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1796shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1796: ship level
internal fun PlayerActivity.showV1796ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1796ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1796ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1796: shiver level
internal fun PlayerActivity.showV1796ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1796shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1796shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1796: shock level
internal fun PlayerActivity.showV1796ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1796shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1796shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1796: shoe mode
internal fun PlayerActivity.showV1796ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shoe
    FeaturePrefsStore.batch1791.v1796shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1796: shoot mode
internal fun PlayerActivity.showV1796ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shoot
    FeaturePrefsStore.batch1791.v1796shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1796: shop mode
internal fun PlayerActivity.showV1796ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shop
    FeaturePrefsStore.batch1791.v1796shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1796: shoulder mode
internal fun PlayerActivity.showV1796ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shoulder
    FeaturePrefsStore.batch1791.v1796shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1796: shove mode
internal fun PlayerActivity.showV1796ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1796shove
    FeaturePrefsStore.batch1791.v1796shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1797: shaft mode
internal fun PlayerActivity.showV1797ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shaft
    FeaturePrefsStore.batch1791.v1797shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1797: shallow mode
internal fun PlayerActivity.showV1797ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shallow
    FeaturePrefsStore.batch1791.v1797shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1797: shed mode
internal fun PlayerActivity.showV1797ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shed
    FeaturePrefsStore.batch1791.v1797shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1797: shell mode
internal fun PlayerActivity.showV1797ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shell
    FeaturePrefsStore.batch1791.v1797shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1797: sheriff mode
internal fun PlayerActivity.showV1797SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1797sheriff
    FeaturePrefsStore.batch1791.v1797sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1797: shield level
internal fun PlayerActivity.showV1797ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1797shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1797shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1797: shine level
internal fun PlayerActivity.showV1797ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1797shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1797shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1797: ship level
internal fun PlayerActivity.showV1797ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1797ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1797ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1797: shiver level
internal fun PlayerActivity.showV1797ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1797shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1797shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1797: shock level
internal fun PlayerActivity.showV1797ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1797shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1797shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1797: shoe mode
internal fun PlayerActivity.showV1797ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shoe
    FeaturePrefsStore.batch1791.v1797shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1797: shoot mode
internal fun PlayerActivity.showV1797ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shoot
    FeaturePrefsStore.batch1791.v1797shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1797: shop mode
internal fun PlayerActivity.showV1797ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shop
    FeaturePrefsStore.batch1791.v1797shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1797: shoulder mode
internal fun PlayerActivity.showV1797ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shoulder
    FeaturePrefsStore.batch1791.v1797shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1797: shove mode
internal fun PlayerActivity.showV1797ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1797shove
    FeaturePrefsStore.batch1791.v1797shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1798: shaft mode
internal fun PlayerActivity.showV1798ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shaft
    FeaturePrefsStore.batch1791.v1798shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1798: shallow mode
internal fun PlayerActivity.showV1798ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shallow
    FeaturePrefsStore.batch1791.v1798shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1798: shed mode
internal fun PlayerActivity.showV1798ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shed
    FeaturePrefsStore.batch1791.v1798shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1798: shell mode
internal fun PlayerActivity.showV1798ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shell
    FeaturePrefsStore.batch1791.v1798shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1798: sheriff mode
internal fun PlayerActivity.showV1798SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1798sheriff
    FeaturePrefsStore.batch1791.v1798sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1798: shield level
internal fun PlayerActivity.showV1798ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1798shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1798shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1798: shine level
internal fun PlayerActivity.showV1798ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1798shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1798shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1798: ship level
internal fun PlayerActivity.showV1798ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1798ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1798ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1798: shiver level
internal fun PlayerActivity.showV1798ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1798shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1798shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1798: shock level
internal fun PlayerActivity.showV1798ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1798shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1798shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1798: shoe mode
internal fun PlayerActivity.showV1798ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shoe
    FeaturePrefsStore.batch1791.v1798shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1798: shoot mode
internal fun PlayerActivity.showV1798ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shoot
    FeaturePrefsStore.batch1791.v1798shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1798: shop mode
internal fun PlayerActivity.showV1798ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shop
    FeaturePrefsStore.batch1791.v1798shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1798: shoulder mode
internal fun PlayerActivity.showV1798ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shoulder
    FeaturePrefsStore.batch1791.v1798shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1798: shove mode
internal fun PlayerActivity.showV1798ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1798shove
    FeaturePrefsStore.batch1791.v1798shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1799: shaft mode
internal fun PlayerActivity.showV1799ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shaft
    FeaturePrefsStore.batch1791.v1799shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1799: shallow mode
internal fun PlayerActivity.showV1799ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shallow
    FeaturePrefsStore.batch1791.v1799shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1799: shed mode
internal fun PlayerActivity.showV1799ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shed
    FeaturePrefsStore.batch1791.v1799shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1799: shell mode
internal fun PlayerActivity.showV1799ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shell
    FeaturePrefsStore.batch1791.v1799shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1799: sheriff mode
internal fun PlayerActivity.showV1799SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1799sheriff
    FeaturePrefsStore.batch1791.v1799sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1799: shield level
internal fun PlayerActivity.showV1799ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1799shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1799shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1799: shine level
internal fun PlayerActivity.showV1799ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1799shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1799shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1799: ship level
internal fun PlayerActivity.showV1799ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1799ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1799ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1799: shiver level
internal fun PlayerActivity.showV1799ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1799shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1799shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1799: shock level
internal fun PlayerActivity.showV1799ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1799shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1799shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1799: shoe mode
internal fun PlayerActivity.showV1799ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shoe
    FeaturePrefsStore.batch1791.v1799shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1799: shoot mode
internal fun PlayerActivity.showV1799ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shoot
    FeaturePrefsStore.batch1791.v1799shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1799: shop mode
internal fun PlayerActivity.showV1799ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shop
    FeaturePrefsStore.batch1791.v1799shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1799: shoulder mode
internal fun PlayerActivity.showV1799ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shoulder
    FeaturePrefsStore.batch1791.v1799shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1799: shove mode
internal fun PlayerActivity.showV1799ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1799shove
    FeaturePrefsStore.batch1791.v1799shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

// v1800: shaft mode
internal fun PlayerActivity.showV1800ShaftToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shaft
    FeaturePrefsStore.batch1791.v1800shaft = !current
    AppToast.show(this, "shaft: ${if (!current) "ON" else "OFF"}")
}

// v1800: shallow mode
internal fun PlayerActivity.showV1800ShallowToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shallow
    FeaturePrefsStore.batch1791.v1800shallow = !current
    AppToast.show(this, "shallow: ${if (!current) "ON" else "OFF"}")
}

// v1800: shed mode
internal fun PlayerActivity.showV1800ShedToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shed
    FeaturePrefsStore.batch1791.v1800shed = !current
    AppToast.show(this, "shed: ${if (!current) "ON" else "OFF"}")
}

// v1800: shell mode
internal fun PlayerActivity.showV1800ShellToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shell
    FeaturePrefsStore.batch1791.v1800shell = !current
    AppToast.show(this, "shell: ${if (!current) "ON" else "OFF"}")
}

// v1800: sheriff mode
internal fun PlayerActivity.showV1800SheriffToggle() {
    val current = FeaturePrefsStore.batch1791.v1800sheriff
    FeaturePrefsStore.batch1791.v1800sheriff = !current
    AppToast.show(this, "sheriff: ${if (!current) "ON" else "OFF"}")
}

// v1800: shield level
internal fun PlayerActivity.showV1800ShieldDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1800shield).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shield level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1800shield = value
        AppToast.show(this, "shield: $value")
    }
}

// v1800: shine level
internal fun PlayerActivity.showV1800ShineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1800shine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1800shine = value
        AppToast.show(this, "shine: $value")
    }
}

// v1800: ship level
internal fun PlayerActivity.showV1800ShipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1800ship).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ship level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1800ship = value
        AppToast.show(this, "ship: $value")
    }
}

// v1800: shiver level
internal fun PlayerActivity.showV1800ShiverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1800shiver).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shiver level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1800shiver = value
        AppToast.show(this, "shiver: $value")
    }
}

// v1800: shock level
internal fun PlayerActivity.showV1800ShockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1791.v1800shock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1791.v1800shock = value
        AppToast.show(this, "shock: $value")
    }
}

// v1800: shoe mode
internal fun PlayerActivity.showV1800ShoeToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shoe
    FeaturePrefsStore.batch1791.v1800shoe = !current
    AppToast.show(this, "shoe: ${if (!current) "ON" else "OFF"}")
}

// v1800: shoot mode
internal fun PlayerActivity.showV1800ShootToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shoot
    FeaturePrefsStore.batch1791.v1800shoot = !current
    AppToast.show(this, "shoot: ${if (!current) "ON" else "OFF"}")
}

// v1800: shop mode
internal fun PlayerActivity.showV1800ShopToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shop
    FeaturePrefsStore.batch1791.v1800shop = !current
    AppToast.show(this, "shop: ${if (!current) "ON" else "OFF"}")
}

// v1800: shoulder mode
internal fun PlayerActivity.showV1800ShoulderToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shoulder
    FeaturePrefsStore.batch1791.v1800shoulder = !current
    AppToast.show(this, "shoulder: ${if (!current) "ON" else "OFF"}")
}

// v1800: shove mode
internal fun PlayerActivity.showV1800ShoveToggle() {
    val current = FeaturePrefsStore.batch1791.v1800shove
    FeaturePrefsStore.batch1791.v1800shove = !current
    AppToast.show(this, "shove: ${if (!current) "ON" else "OFF"}")
}

