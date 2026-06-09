package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1301: candy mode
internal fun PlayerActivity.showV1301CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1301candy
    FeaturePrefsStore.batch1301.v1301candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1301: canvas mode
internal fun PlayerActivity.showV1301CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1301canvas
    FeaturePrefsStore.batch1301.v1301canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1301: carbon mode
internal fun PlayerActivity.showV1301CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1301carbon
    FeaturePrefsStore.batch1301.v1301carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1301: card mode
internal fun PlayerActivity.showV1301CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1301card
    FeaturePrefsStore.batch1301.v1301card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1301: cargo mode
internal fun PlayerActivity.showV1301CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cargo
    FeaturePrefsStore.batch1301.v1301cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1301: carpet level
internal fun PlayerActivity.showV1301CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1301: carry level
internal fun PlayerActivity.showV1301CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1301: cart level
internal fun PlayerActivity.showV1301CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1301: case level
internal fun PlayerActivity.showV1301CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301case = value
        AppToast.show(this, "case: $value")
    }
}

// v1301: cash level
internal fun PlayerActivity.showV1301CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1301: cast mode
internal fun PlayerActivity.showV1301CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cast
    FeaturePrefsStore.batch1301.v1301cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1301: castle mode
internal fun PlayerActivity.showV1301CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1301castle
    FeaturePrefsStore.batch1301.v1301castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1301: catch mode
internal fun PlayerActivity.showV1301CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1301catch
    FeaturePrefsStore.batch1301.v1301catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1301: cause mode
internal fun PlayerActivity.showV1301CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cause
    FeaturePrefsStore.batch1301.v1301cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1301: cave mode
internal fun PlayerActivity.showV1301CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cave
    FeaturePrefsStore.batch1301.v1301cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1302: candy mode
internal fun PlayerActivity.showV1302CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1302candy
    FeaturePrefsStore.batch1301.v1302candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1302: canvas mode
internal fun PlayerActivity.showV1302CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1302canvas
    FeaturePrefsStore.batch1301.v1302canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1302: carbon mode
internal fun PlayerActivity.showV1302CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1302carbon
    FeaturePrefsStore.batch1301.v1302carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1302: card mode
internal fun PlayerActivity.showV1302CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1302card
    FeaturePrefsStore.batch1301.v1302card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1302: cargo mode
internal fun PlayerActivity.showV1302CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cargo
    FeaturePrefsStore.batch1301.v1302cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1302: carpet level
internal fun PlayerActivity.showV1302CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1302: carry level
internal fun PlayerActivity.showV1302CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1302: cart level
internal fun PlayerActivity.showV1302CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1302: case level
internal fun PlayerActivity.showV1302CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302case = value
        AppToast.show(this, "case: $value")
    }
}

// v1302: cash level
internal fun PlayerActivity.showV1302CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1302: cast mode
internal fun PlayerActivity.showV1302CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cast
    FeaturePrefsStore.batch1301.v1302cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1302: castle mode
internal fun PlayerActivity.showV1302CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1302castle
    FeaturePrefsStore.batch1301.v1302castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1302: catch mode
internal fun PlayerActivity.showV1302CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1302catch
    FeaturePrefsStore.batch1301.v1302catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1302: cause mode
internal fun PlayerActivity.showV1302CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cause
    FeaturePrefsStore.batch1301.v1302cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1302: cave mode
internal fun PlayerActivity.showV1302CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cave
    FeaturePrefsStore.batch1301.v1302cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1303: candy mode
internal fun PlayerActivity.showV1303CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1303candy
    FeaturePrefsStore.batch1301.v1303candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1303: canvas mode
internal fun PlayerActivity.showV1303CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1303canvas
    FeaturePrefsStore.batch1301.v1303canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1303: carbon mode
internal fun PlayerActivity.showV1303CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1303carbon
    FeaturePrefsStore.batch1301.v1303carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1303: card mode
internal fun PlayerActivity.showV1303CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1303card
    FeaturePrefsStore.batch1301.v1303card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1303: cargo mode
internal fun PlayerActivity.showV1303CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cargo
    FeaturePrefsStore.batch1301.v1303cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1303: carpet level
internal fun PlayerActivity.showV1303CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1303: carry level
internal fun PlayerActivity.showV1303CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1303: cart level
internal fun PlayerActivity.showV1303CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1303: case level
internal fun PlayerActivity.showV1303CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303case = value
        AppToast.show(this, "case: $value")
    }
}

// v1303: cash level
internal fun PlayerActivity.showV1303CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1303: cast mode
internal fun PlayerActivity.showV1303CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cast
    FeaturePrefsStore.batch1301.v1303cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1303: castle mode
internal fun PlayerActivity.showV1303CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1303castle
    FeaturePrefsStore.batch1301.v1303castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1303: catch mode
internal fun PlayerActivity.showV1303CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1303catch
    FeaturePrefsStore.batch1301.v1303catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1303: cause mode
internal fun PlayerActivity.showV1303CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cause
    FeaturePrefsStore.batch1301.v1303cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1303: cave mode
internal fun PlayerActivity.showV1303CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cave
    FeaturePrefsStore.batch1301.v1303cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1304: candy mode
internal fun PlayerActivity.showV1304CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1304candy
    FeaturePrefsStore.batch1301.v1304candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1304: canvas mode
internal fun PlayerActivity.showV1304CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1304canvas
    FeaturePrefsStore.batch1301.v1304canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1304: carbon mode
internal fun PlayerActivity.showV1304CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1304carbon
    FeaturePrefsStore.batch1301.v1304carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1304: card mode
internal fun PlayerActivity.showV1304CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1304card
    FeaturePrefsStore.batch1301.v1304card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1304: cargo mode
internal fun PlayerActivity.showV1304CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cargo
    FeaturePrefsStore.batch1301.v1304cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1304: carpet level
internal fun PlayerActivity.showV1304CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1304: carry level
internal fun PlayerActivity.showV1304CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1304: cart level
internal fun PlayerActivity.showV1304CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1304: case level
internal fun PlayerActivity.showV1304CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304case = value
        AppToast.show(this, "case: $value")
    }
}

// v1304: cash level
internal fun PlayerActivity.showV1304CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1304: cast mode
internal fun PlayerActivity.showV1304CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cast
    FeaturePrefsStore.batch1301.v1304cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1304: castle mode
internal fun PlayerActivity.showV1304CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1304castle
    FeaturePrefsStore.batch1301.v1304castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1304: catch mode
internal fun PlayerActivity.showV1304CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1304catch
    FeaturePrefsStore.batch1301.v1304catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1304: cause mode
internal fun PlayerActivity.showV1304CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cause
    FeaturePrefsStore.batch1301.v1304cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1304: cave mode
internal fun PlayerActivity.showV1304CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cave
    FeaturePrefsStore.batch1301.v1304cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1305: candy mode
internal fun PlayerActivity.showV1305CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1305candy
    FeaturePrefsStore.batch1301.v1305candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1305: canvas mode
internal fun PlayerActivity.showV1305CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1305canvas
    FeaturePrefsStore.batch1301.v1305canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1305: carbon mode
internal fun PlayerActivity.showV1305CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1305carbon
    FeaturePrefsStore.batch1301.v1305carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1305: card mode
internal fun PlayerActivity.showV1305CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1305card
    FeaturePrefsStore.batch1301.v1305card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1305: cargo mode
internal fun PlayerActivity.showV1305CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cargo
    FeaturePrefsStore.batch1301.v1305cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1305: carpet level
internal fun PlayerActivity.showV1305CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1305: carry level
internal fun PlayerActivity.showV1305CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1305: cart level
internal fun PlayerActivity.showV1305CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1305: case level
internal fun PlayerActivity.showV1305CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305case = value
        AppToast.show(this, "case: $value")
    }
}

// v1305: cash level
internal fun PlayerActivity.showV1305CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1305: cast mode
internal fun PlayerActivity.showV1305CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cast
    FeaturePrefsStore.batch1301.v1305cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1305: castle mode
internal fun PlayerActivity.showV1305CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1305castle
    FeaturePrefsStore.batch1301.v1305castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1305: catch mode
internal fun PlayerActivity.showV1305CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1305catch
    FeaturePrefsStore.batch1301.v1305catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1305: cause mode
internal fun PlayerActivity.showV1305CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cause
    FeaturePrefsStore.batch1301.v1305cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1305: cave mode
internal fun PlayerActivity.showV1305CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cave
    FeaturePrefsStore.batch1301.v1305cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1306: candy mode
internal fun PlayerActivity.showV1306CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1306candy
    FeaturePrefsStore.batch1301.v1306candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1306: canvas mode
internal fun PlayerActivity.showV1306CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1306canvas
    FeaturePrefsStore.batch1301.v1306canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1306: carbon mode
internal fun PlayerActivity.showV1306CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1306carbon
    FeaturePrefsStore.batch1301.v1306carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1306: card mode
internal fun PlayerActivity.showV1306CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1306card
    FeaturePrefsStore.batch1301.v1306card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1306: cargo mode
internal fun PlayerActivity.showV1306CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cargo
    FeaturePrefsStore.batch1301.v1306cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1306: carpet level
internal fun PlayerActivity.showV1306CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1306: carry level
internal fun PlayerActivity.showV1306CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1306: cart level
internal fun PlayerActivity.showV1306CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1306: case level
internal fun PlayerActivity.showV1306CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306case = value
        AppToast.show(this, "case: $value")
    }
}

// v1306: cash level
internal fun PlayerActivity.showV1306CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1306: cast mode
internal fun PlayerActivity.showV1306CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cast
    FeaturePrefsStore.batch1301.v1306cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1306: castle mode
internal fun PlayerActivity.showV1306CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1306castle
    FeaturePrefsStore.batch1301.v1306castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1306: catch mode
internal fun PlayerActivity.showV1306CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1306catch
    FeaturePrefsStore.batch1301.v1306catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1306: cause mode
internal fun PlayerActivity.showV1306CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cause
    FeaturePrefsStore.batch1301.v1306cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1306: cave mode
internal fun PlayerActivity.showV1306CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cave
    FeaturePrefsStore.batch1301.v1306cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1307: candy mode
internal fun PlayerActivity.showV1307CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1307candy
    FeaturePrefsStore.batch1301.v1307candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1307: canvas mode
internal fun PlayerActivity.showV1307CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1307canvas
    FeaturePrefsStore.batch1301.v1307canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1307: carbon mode
internal fun PlayerActivity.showV1307CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1307carbon
    FeaturePrefsStore.batch1301.v1307carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1307: card mode
internal fun PlayerActivity.showV1307CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1307card
    FeaturePrefsStore.batch1301.v1307card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1307: cargo mode
internal fun PlayerActivity.showV1307CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cargo
    FeaturePrefsStore.batch1301.v1307cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1307: carpet level
internal fun PlayerActivity.showV1307CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1307: carry level
internal fun PlayerActivity.showV1307CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1307: cart level
internal fun PlayerActivity.showV1307CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1307: case level
internal fun PlayerActivity.showV1307CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307case = value
        AppToast.show(this, "case: $value")
    }
}

// v1307: cash level
internal fun PlayerActivity.showV1307CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1307: cast mode
internal fun PlayerActivity.showV1307CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cast
    FeaturePrefsStore.batch1301.v1307cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1307: castle mode
internal fun PlayerActivity.showV1307CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1307castle
    FeaturePrefsStore.batch1301.v1307castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1307: catch mode
internal fun PlayerActivity.showV1307CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1307catch
    FeaturePrefsStore.batch1301.v1307catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1307: cause mode
internal fun PlayerActivity.showV1307CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cause
    FeaturePrefsStore.batch1301.v1307cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1307: cave mode
internal fun PlayerActivity.showV1307CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cave
    FeaturePrefsStore.batch1301.v1307cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1308: candy mode
internal fun PlayerActivity.showV1308CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1308candy
    FeaturePrefsStore.batch1301.v1308candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1308: canvas mode
internal fun PlayerActivity.showV1308CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1308canvas
    FeaturePrefsStore.batch1301.v1308canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1308: carbon mode
internal fun PlayerActivity.showV1308CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1308carbon
    FeaturePrefsStore.batch1301.v1308carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1308: card mode
internal fun PlayerActivity.showV1308CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1308card
    FeaturePrefsStore.batch1301.v1308card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1308: cargo mode
internal fun PlayerActivity.showV1308CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cargo
    FeaturePrefsStore.batch1301.v1308cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1308: carpet level
internal fun PlayerActivity.showV1308CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1308: carry level
internal fun PlayerActivity.showV1308CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1308: cart level
internal fun PlayerActivity.showV1308CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1308: case level
internal fun PlayerActivity.showV1308CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308case = value
        AppToast.show(this, "case: $value")
    }
}

// v1308: cash level
internal fun PlayerActivity.showV1308CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1308: cast mode
internal fun PlayerActivity.showV1308CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cast
    FeaturePrefsStore.batch1301.v1308cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1308: castle mode
internal fun PlayerActivity.showV1308CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1308castle
    FeaturePrefsStore.batch1301.v1308castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1308: catch mode
internal fun PlayerActivity.showV1308CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1308catch
    FeaturePrefsStore.batch1301.v1308catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1308: cause mode
internal fun PlayerActivity.showV1308CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cause
    FeaturePrefsStore.batch1301.v1308cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1308: cave mode
internal fun PlayerActivity.showV1308CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cave
    FeaturePrefsStore.batch1301.v1308cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1309: candy mode
internal fun PlayerActivity.showV1309CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1309candy
    FeaturePrefsStore.batch1301.v1309candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1309: canvas mode
internal fun PlayerActivity.showV1309CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1309canvas
    FeaturePrefsStore.batch1301.v1309canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1309: carbon mode
internal fun PlayerActivity.showV1309CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1309carbon
    FeaturePrefsStore.batch1301.v1309carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1309: card mode
internal fun PlayerActivity.showV1309CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1309card
    FeaturePrefsStore.batch1301.v1309card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1309: cargo mode
internal fun PlayerActivity.showV1309CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cargo
    FeaturePrefsStore.batch1301.v1309cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1309: carpet level
internal fun PlayerActivity.showV1309CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1309: carry level
internal fun PlayerActivity.showV1309CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1309: cart level
internal fun PlayerActivity.showV1309CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1309: case level
internal fun PlayerActivity.showV1309CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309case = value
        AppToast.show(this, "case: $value")
    }
}

// v1309: cash level
internal fun PlayerActivity.showV1309CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1309: cast mode
internal fun PlayerActivity.showV1309CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cast
    FeaturePrefsStore.batch1301.v1309cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1309: castle mode
internal fun PlayerActivity.showV1309CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1309castle
    FeaturePrefsStore.batch1301.v1309castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1309: catch mode
internal fun PlayerActivity.showV1309CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1309catch
    FeaturePrefsStore.batch1301.v1309catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1309: cause mode
internal fun PlayerActivity.showV1309CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cause
    FeaturePrefsStore.batch1301.v1309cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1309: cave mode
internal fun PlayerActivity.showV1309CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cave
    FeaturePrefsStore.batch1301.v1309cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1310: candy mode
internal fun PlayerActivity.showV1310CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1310candy
    FeaturePrefsStore.batch1301.v1310candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1310: canvas mode
internal fun PlayerActivity.showV1310CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1310canvas
    FeaturePrefsStore.batch1301.v1310canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1310: carbon mode
internal fun PlayerActivity.showV1310CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1310carbon
    FeaturePrefsStore.batch1301.v1310carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1310: card mode
internal fun PlayerActivity.showV1310CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1310card
    FeaturePrefsStore.batch1301.v1310card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1310: cargo mode
internal fun PlayerActivity.showV1310CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cargo
    FeaturePrefsStore.batch1301.v1310cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1310: carpet level
internal fun PlayerActivity.showV1310CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1310: carry level
internal fun PlayerActivity.showV1310CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1310: cart level
internal fun PlayerActivity.showV1310CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1310: case level
internal fun PlayerActivity.showV1310CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310case = value
        AppToast.show(this, "case: $value")
    }
}

// v1310: cash level
internal fun PlayerActivity.showV1310CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1310: cast mode
internal fun PlayerActivity.showV1310CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cast
    FeaturePrefsStore.batch1301.v1310cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1310: castle mode
internal fun PlayerActivity.showV1310CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1310castle
    FeaturePrefsStore.batch1301.v1310castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1310: catch mode
internal fun PlayerActivity.showV1310CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1310catch
    FeaturePrefsStore.batch1301.v1310catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1310: cause mode
internal fun PlayerActivity.showV1310CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cause
    FeaturePrefsStore.batch1301.v1310cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1310: cave mode
internal fun PlayerActivity.showV1310CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cave
    FeaturePrefsStore.batch1301.v1310cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

