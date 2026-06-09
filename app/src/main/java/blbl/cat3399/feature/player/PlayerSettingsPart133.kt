package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1511: grill mode
internal fun PlayerActivity.showV1511GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grill
    FeaturePrefsStore.batch1511.v1511grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1511: grin mode
internal fun PlayerActivity.showV1511GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grin
    FeaturePrefsStore.batch1511.v1511grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1511: grip mode
internal fun PlayerActivity.showV1511GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grip
    FeaturePrefsStore.batch1511.v1511grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1511: grocery mode
internal fun PlayerActivity.showV1511GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1511grocery
    FeaturePrefsStore.batch1511.v1511grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1511: groom mode
internal fun PlayerActivity.showV1511GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1511groom
    FeaturePrefsStore.batch1511.v1511groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1511: gross level
internal fun PlayerActivity.showV1511GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1511: ground level
internal fun PlayerActivity.showV1511GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1511: growth level
internal fun PlayerActivity.showV1511GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1511: guitar level
internal fun PlayerActivity.showV1511GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1511: habit level
internal fun PlayerActivity.showV1511HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1511habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1511habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1511: hair mode
internal fun PlayerActivity.showV1511HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hair
    FeaturePrefsStore.batch1511.v1511hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1511: half mode
internal fun PlayerActivity.showV1511HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1511half
    FeaturePrefsStore.batch1511.v1511half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1511: hammer mode
internal fun PlayerActivity.showV1511HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hammer
    FeaturePrefsStore.batch1511.v1511hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1511: hand mode
internal fun PlayerActivity.showV1511HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hand
    FeaturePrefsStore.batch1511.v1511hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1511: hang mode
internal fun PlayerActivity.showV1511HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1511hang
    FeaturePrefsStore.batch1511.v1511hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1512: grill mode
internal fun PlayerActivity.showV1512GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grill
    FeaturePrefsStore.batch1511.v1512grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1512: grin mode
internal fun PlayerActivity.showV1512GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grin
    FeaturePrefsStore.batch1511.v1512grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1512: grip mode
internal fun PlayerActivity.showV1512GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grip
    FeaturePrefsStore.batch1511.v1512grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1512: grocery mode
internal fun PlayerActivity.showV1512GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1512grocery
    FeaturePrefsStore.batch1511.v1512grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1512: groom mode
internal fun PlayerActivity.showV1512GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1512groom
    FeaturePrefsStore.batch1511.v1512groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1512: gross level
internal fun PlayerActivity.showV1512GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1512: ground level
internal fun PlayerActivity.showV1512GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1512: growth level
internal fun PlayerActivity.showV1512GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1512: guitar level
internal fun PlayerActivity.showV1512GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1512: habit level
internal fun PlayerActivity.showV1512HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1512habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1512habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1512: hair mode
internal fun PlayerActivity.showV1512HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hair
    FeaturePrefsStore.batch1511.v1512hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1512: half mode
internal fun PlayerActivity.showV1512HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1512half
    FeaturePrefsStore.batch1511.v1512half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1512: hammer mode
internal fun PlayerActivity.showV1512HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hammer
    FeaturePrefsStore.batch1511.v1512hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1512: hand mode
internal fun PlayerActivity.showV1512HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hand
    FeaturePrefsStore.batch1511.v1512hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1512: hang mode
internal fun PlayerActivity.showV1512HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1512hang
    FeaturePrefsStore.batch1511.v1512hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1513: grill mode
internal fun PlayerActivity.showV1513GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grill
    FeaturePrefsStore.batch1511.v1513grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1513: grin mode
internal fun PlayerActivity.showV1513GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grin
    FeaturePrefsStore.batch1511.v1513grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1513: grip mode
internal fun PlayerActivity.showV1513GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grip
    FeaturePrefsStore.batch1511.v1513grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1513: grocery mode
internal fun PlayerActivity.showV1513GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1513grocery
    FeaturePrefsStore.batch1511.v1513grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1513: groom mode
internal fun PlayerActivity.showV1513GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1513groom
    FeaturePrefsStore.batch1511.v1513groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1513: gross level
internal fun PlayerActivity.showV1513GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1513: ground level
internal fun PlayerActivity.showV1513GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1513: growth level
internal fun PlayerActivity.showV1513GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1513: guitar level
internal fun PlayerActivity.showV1513GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1513: habit level
internal fun PlayerActivity.showV1513HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1513habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1513habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1513: hair mode
internal fun PlayerActivity.showV1513HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hair
    FeaturePrefsStore.batch1511.v1513hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1513: half mode
internal fun PlayerActivity.showV1513HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1513half
    FeaturePrefsStore.batch1511.v1513half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1513: hammer mode
internal fun PlayerActivity.showV1513HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hammer
    FeaturePrefsStore.batch1511.v1513hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1513: hand mode
internal fun PlayerActivity.showV1513HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hand
    FeaturePrefsStore.batch1511.v1513hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1513: hang mode
internal fun PlayerActivity.showV1513HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1513hang
    FeaturePrefsStore.batch1511.v1513hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1514: grill mode
internal fun PlayerActivity.showV1514GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grill
    FeaturePrefsStore.batch1511.v1514grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1514: grin mode
internal fun PlayerActivity.showV1514GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grin
    FeaturePrefsStore.batch1511.v1514grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1514: grip mode
internal fun PlayerActivity.showV1514GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grip
    FeaturePrefsStore.batch1511.v1514grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1514: grocery mode
internal fun PlayerActivity.showV1514GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1514grocery
    FeaturePrefsStore.batch1511.v1514grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1514: groom mode
internal fun PlayerActivity.showV1514GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1514groom
    FeaturePrefsStore.batch1511.v1514groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1514: gross level
internal fun PlayerActivity.showV1514GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1514: ground level
internal fun PlayerActivity.showV1514GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1514: growth level
internal fun PlayerActivity.showV1514GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1514: guitar level
internal fun PlayerActivity.showV1514GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1514: habit level
internal fun PlayerActivity.showV1514HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1514habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1514habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1514: hair mode
internal fun PlayerActivity.showV1514HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hair
    FeaturePrefsStore.batch1511.v1514hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1514: half mode
internal fun PlayerActivity.showV1514HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1514half
    FeaturePrefsStore.batch1511.v1514half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1514: hammer mode
internal fun PlayerActivity.showV1514HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hammer
    FeaturePrefsStore.batch1511.v1514hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1514: hand mode
internal fun PlayerActivity.showV1514HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hand
    FeaturePrefsStore.batch1511.v1514hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1514: hang mode
internal fun PlayerActivity.showV1514HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1514hang
    FeaturePrefsStore.batch1511.v1514hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1515: grill mode
internal fun PlayerActivity.showV1515GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grill
    FeaturePrefsStore.batch1511.v1515grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1515: grin mode
internal fun PlayerActivity.showV1515GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grin
    FeaturePrefsStore.batch1511.v1515grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1515: grip mode
internal fun PlayerActivity.showV1515GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grip
    FeaturePrefsStore.batch1511.v1515grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1515: grocery mode
internal fun PlayerActivity.showV1515GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1515grocery
    FeaturePrefsStore.batch1511.v1515grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1515: groom mode
internal fun PlayerActivity.showV1515GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1515groom
    FeaturePrefsStore.batch1511.v1515groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1515: gross level
internal fun PlayerActivity.showV1515GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1515: ground level
internal fun PlayerActivity.showV1515GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1515: growth level
internal fun PlayerActivity.showV1515GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1515: guitar level
internal fun PlayerActivity.showV1515GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1515: habit level
internal fun PlayerActivity.showV1515HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1515habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1515habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1515: hair mode
internal fun PlayerActivity.showV1515HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hair
    FeaturePrefsStore.batch1511.v1515hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1515: half mode
internal fun PlayerActivity.showV1515HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1515half
    FeaturePrefsStore.batch1511.v1515half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1515: hammer mode
internal fun PlayerActivity.showV1515HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hammer
    FeaturePrefsStore.batch1511.v1515hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1515: hand mode
internal fun PlayerActivity.showV1515HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hand
    FeaturePrefsStore.batch1511.v1515hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1515: hang mode
internal fun PlayerActivity.showV1515HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1515hang
    FeaturePrefsStore.batch1511.v1515hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1516: grill mode
internal fun PlayerActivity.showV1516GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grill
    FeaturePrefsStore.batch1511.v1516grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1516: grin mode
internal fun PlayerActivity.showV1516GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grin
    FeaturePrefsStore.batch1511.v1516grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1516: grip mode
internal fun PlayerActivity.showV1516GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grip
    FeaturePrefsStore.batch1511.v1516grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1516: grocery mode
internal fun PlayerActivity.showV1516GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1516grocery
    FeaturePrefsStore.batch1511.v1516grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1516: groom mode
internal fun PlayerActivity.showV1516GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1516groom
    FeaturePrefsStore.batch1511.v1516groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1516: gross level
internal fun PlayerActivity.showV1516GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1516: ground level
internal fun PlayerActivity.showV1516GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1516: growth level
internal fun PlayerActivity.showV1516GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1516: guitar level
internal fun PlayerActivity.showV1516GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1516: habit level
internal fun PlayerActivity.showV1516HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1516habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1516habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1516: hair mode
internal fun PlayerActivity.showV1516HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hair
    FeaturePrefsStore.batch1511.v1516hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1516: half mode
internal fun PlayerActivity.showV1516HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1516half
    FeaturePrefsStore.batch1511.v1516half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1516: hammer mode
internal fun PlayerActivity.showV1516HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hammer
    FeaturePrefsStore.batch1511.v1516hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1516: hand mode
internal fun PlayerActivity.showV1516HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hand
    FeaturePrefsStore.batch1511.v1516hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1516: hang mode
internal fun PlayerActivity.showV1516HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1516hang
    FeaturePrefsStore.batch1511.v1516hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1517: grill mode
internal fun PlayerActivity.showV1517GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grill
    FeaturePrefsStore.batch1511.v1517grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1517: grin mode
internal fun PlayerActivity.showV1517GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grin
    FeaturePrefsStore.batch1511.v1517grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1517: grip mode
internal fun PlayerActivity.showV1517GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grip
    FeaturePrefsStore.batch1511.v1517grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1517: grocery mode
internal fun PlayerActivity.showV1517GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1517grocery
    FeaturePrefsStore.batch1511.v1517grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1517: groom mode
internal fun PlayerActivity.showV1517GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1517groom
    FeaturePrefsStore.batch1511.v1517groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1517: gross level
internal fun PlayerActivity.showV1517GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1517: ground level
internal fun PlayerActivity.showV1517GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1517: growth level
internal fun PlayerActivity.showV1517GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1517: guitar level
internal fun PlayerActivity.showV1517GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1517: habit level
internal fun PlayerActivity.showV1517HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1517habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1517habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1517: hair mode
internal fun PlayerActivity.showV1517HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hair
    FeaturePrefsStore.batch1511.v1517hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1517: half mode
internal fun PlayerActivity.showV1517HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1517half
    FeaturePrefsStore.batch1511.v1517half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1517: hammer mode
internal fun PlayerActivity.showV1517HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hammer
    FeaturePrefsStore.batch1511.v1517hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1517: hand mode
internal fun PlayerActivity.showV1517HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hand
    FeaturePrefsStore.batch1511.v1517hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1517: hang mode
internal fun PlayerActivity.showV1517HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1517hang
    FeaturePrefsStore.batch1511.v1517hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1518: grill mode
internal fun PlayerActivity.showV1518GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grill
    FeaturePrefsStore.batch1511.v1518grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1518: grin mode
internal fun PlayerActivity.showV1518GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grin
    FeaturePrefsStore.batch1511.v1518grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1518: grip mode
internal fun PlayerActivity.showV1518GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grip
    FeaturePrefsStore.batch1511.v1518grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1518: grocery mode
internal fun PlayerActivity.showV1518GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1518grocery
    FeaturePrefsStore.batch1511.v1518grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1518: groom mode
internal fun PlayerActivity.showV1518GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1518groom
    FeaturePrefsStore.batch1511.v1518groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1518: gross level
internal fun PlayerActivity.showV1518GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1518: ground level
internal fun PlayerActivity.showV1518GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1518: growth level
internal fun PlayerActivity.showV1518GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1518: guitar level
internal fun PlayerActivity.showV1518GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1518: habit level
internal fun PlayerActivity.showV1518HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1518habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1518habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1518: hair mode
internal fun PlayerActivity.showV1518HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hair
    FeaturePrefsStore.batch1511.v1518hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1518: half mode
internal fun PlayerActivity.showV1518HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1518half
    FeaturePrefsStore.batch1511.v1518half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1518: hammer mode
internal fun PlayerActivity.showV1518HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hammer
    FeaturePrefsStore.batch1511.v1518hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1518: hand mode
internal fun PlayerActivity.showV1518HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hand
    FeaturePrefsStore.batch1511.v1518hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1518: hang mode
internal fun PlayerActivity.showV1518HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1518hang
    FeaturePrefsStore.batch1511.v1518hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1519: grill mode
internal fun PlayerActivity.showV1519GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grill
    FeaturePrefsStore.batch1511.v1519grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1519: grin mode
internal fun PlayerActivity.showV1519GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grin
    FeaturePrefsStore.batch1511.v1519grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1519: grip mode
internal fun PlayerActivity.showV1519GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grip
    FeaturePrefsStore.batch1511.v1519grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1519: grocery mode
internal fun PlayerActivity.showV1519GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1519grocery
    FeaturePrefsStore.batch1511.v1519grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1519: groom mode
internal fun PlayerActivity.showV1519GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1519groom
    FeaturePrefsStore.batch1511.v1519groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1519: gross level
internal fun PlayerActivity.showV1519GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1519: ground level
internal fun PlayerActivity.showV1519GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1519: growth level
internal fun PlayerActivity.showV1519GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1519: guitar level
internal fun PlayerActivity.showV1519GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1519: habit level
internal fun PlayerActivity.showV1519HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1519habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1519habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1519: hair mode
internal fun PlayerActivity.showV1519HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hair
    FeaturePrefsStore.batch1511.v1519hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1519: half mode
internal fun PlayerActivity.showV1519HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1519half
    FeaturePrefsStore.batch1511.v1519half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1519: hammer mode
internal fun PlayerActivity.showV1519HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hammer
    FeaturePrefsStore.batch1511.v1519hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1519: hand mode
internal fun PlayerActivity.showV1519HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hand
    FeaturePrefsStore.batch1511.v1519hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1519: hang mode
internal fun PlayerActivity.showV1519HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1519hang
    FeaturePrefsStore.batch1511.v1519hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

// v1520: grill mode
internal fun PlayerActivity.showV1520GrillToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grill
    FeaturePrefsStore.batch1511.v1520grill = !current
    AppToast.show(this, "grill: ${if (!current) "ON" else "OFF"}")
}

// v1520: grin mode
internal fun PlayerActivity.showV1520GrinToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grin
    FeaturePrefsStore.batch1511.v1520grin = !current
    AppToast.show(this, "grin: ${if (!current) "ON" else "OFF"}")
}

// v1520: grip mode
internal fun PlayerActivity.showV1520GripToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grip
    FeaturePrefsStore.batch1511.v1520grip = !current
    AppToast.show(this, "grip: ${if (!current) "ON" else "OFF"}")
}

// v1520: grocery mode
internal fun PlayerActivity.showV1520GroceryToggle() {
    val current = FeaturePrefsStore.batch1511.v1520grocery
    FeaturePrefsStore.batch1511.v1520grocery = !current
    AppToast.show(this, "grocery: ${if (!current) "ON" else "OFF"}")
}

// v1520: groom mode
internal fun PlayerActivity.showV1520GroomToggle() {
    val current = FeaturePrefsStore.batch1511.v1520groom
    FeaturePrefsStore.batch1511.v1520groom = !current
    AppToast.show(this, "groom: ${if (!current) "ON" else "OFF"}")
}

// v1520: gross level
internal fun PlayerActivity.showV1520GrossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520gross).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "gross level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520gross = value
        AppToast.show(this, "gross: $value")
    }
}

// v1520: ground level
internal fun PlayerActivity.showV1520GroundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520ground).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ground level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520ground = value
        AppToast.show(this, "ground: $value")
    }
}

// v1520: growth level
internal fun PlayerActivity.showV1520GrowthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520growth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "growth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520growth = value
        AppToast.show(this, "growth: $value")
    }
}

// v1520: guitar level
internal fun PlayerActivity.showV1520GuitarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520guitar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "guitar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520guitar = value
        AppToast.show(this, "guitar: $value")
    }
}

// v1520: habit level
internal fun PlayerActivity.showV1520HabitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1511.v1520habit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "habit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1511.v1520habit = value
        AppToast.show(this, "habit: $value")
    }
}

// v1520: hair mode
internal fun PlayerActivity.showV1520HairToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hair
    FeaturePrefsStore.batch1511.v1520hair = !current
    AppToast.show(this, "hair: ${if (!current) "ON" else "OFF"}")
}

// v1520: half mode
internal fun PlayerActivity.showV1520HalfToggle() {
    val current = FeaturePrefsStore.batch1511.v1520half
    FeaturePrefsStore.batch1511.v1520half = !current
    AppToast.show(this, "half: ${if (!current) "ON" else "OFF"}")
}

// v1520: hammer mode
internal fun PlayerActivity.showV1520HammerToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hammer
    FeaturePrefsStore.batch1511.v1520hammer = !current
    AppToast.show(this, "hammer: ${if (!current) "ON" else "OFF"}")
}

// v1520: hand mode
internal fun PlayerActivity.showV1520HandToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hand
    FeaturePrefsStore.batch1511.v1520hand = !current
    AppToast.show(this, "hand: ${if (!current) "ON" else "OFF"}")
}

// v1520: hang mode
internal fun PlayerActivity.showV1520HangToggle() {
    val current = FeaturePrefsStore.batch1511.v1520hang
    FeaturePrefsStore.batch1511.v1520hang = !current
    AppToast.show(this, "hang: ${if (!current) "ON" else "OFF"}")
}

