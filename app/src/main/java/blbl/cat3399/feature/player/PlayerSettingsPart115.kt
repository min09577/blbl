package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1331: cliff mode
internal fun PlayerActivity.showV1331CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cliff
    FeaturePrefsStore.batch1331.v1331cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1331: climb mode
internal fun PlayerActivity.showV1331ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1331climb
    FeaturePrefsStore.batch1331.v1331climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1331: cling mode
internal fun PlayerActivity.showV1331ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cling
    FeaturePrefsStore.batch1331.v1331cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1331: clock mode
internal fun PlayerActivity.showV1331ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1331clock
    FeaturePrefsStore.batch1331.v1331clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1331: cloth mode
internal fun PlayerActivity.showV1331ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cloth
    FeaturePrefsStore.batch1331.v1331cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1331: cloud level
internal fun PlayerActivity.showV1331CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1331: clown level
internal fun PlayerActivity.showV1331ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1331: club level
internal fun PlayerActivity.showV1331ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331club = value
        AppToast.show(this, "club: $value")
    }
}

// v1331: clue level
internal fun PlayerActivity.showV1331ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1331: coach level
internal fun PlayerActivity.showV1331CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1331: coast mode
internal fun PlayerActivity.showV1331CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coast
    FeaturePrefsStore.batch1331.v1331coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1331: coat mode
internal fun PlayerActivity.showV1331CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coat
    FeaturePrefsStore.batch1331.v1331coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1331: coffee mode
internal fun PlayerActivity.showV1331CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coffee
    FeaturePrefsStore.batch1331.v1331coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1331: coil mode
internal fun PlayerActivity.showV1331CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coil
    FeaturePrefsStore.batch1331.v1331coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1331: coin mode
internal fun PlayerActivity.showV1331CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coin
    FeaturePrefsStore.batch1331.v1331coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1332: cliff mode
internal fun PlayerActivity.showV1332CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cliff
    FeaturePrefsStore.batch1331.v1332cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1332: climb mode
internal fun PlayerActivity.showV1332ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1332climb
    FeaturePrefsStore.batch1331.v1332climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1332: cling mode
internal fun PlayerActivity.showV1332ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cling
    FeaturePrefsStore.batch1331.v1332cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1332: clock mode
internal fun PlayerActivity.showV1332ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1332clock
    FeaturePrefsStore.batch1331.v1332clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1332: cloth mode
internal fun PlayerActivity.showV1332ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cloth
    FeaturePrefsStore.batch1331.v1332cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1332: cloud level
internal fun PlayerActivity.showV1332CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1332: clown level
internal fun PlayerActivity.showV1332ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1332: club level
internal fun PlayerActivity.showV1332ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332club = value
        AppToast.show(this, "club: $value")
    }
}

// v1332: clue level
internal fun PlayerActivity.showV1332ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1332: coach level
internal fun PlayerActivity.showV1332CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1332: coast mode
internal fun PlayerActivity.showV1332CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coast
    FeaturePrefsStore.batch1331.v1332coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1332: coat mode
internal fun PlayerActivity.showV1332CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coat
    FeaturePrefsStore.batch1331.v1332coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1332: coffee mode
internal fun PlayerActivity.showV1332CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coffee
    FeaturePrefsStore.batch1331.v1332coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1332: coil mode
internal fun PlayerActivity.showV1332CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coil
    FeaturePrefsStore.batch1331.v1332coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1332: coin mode
internal fun PlayerActivity.showV1332CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coin
    FeaturePrefsStore.batch1331.v1332coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1333: cliff mode
internal fun PlayerActivity.showV1333CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cliff
    FeaturePrefsStore.batch1331.v1333cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1333: climb mode
internal fun PlayerActivity.showV1333ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1333climb
    FeaturePrefsStore.batch1331.v1333climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1333: cling mode
internal fun PlayerActivity.showV1333ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cling
    FeaturePrefsStore.batch1331.v1333cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1333: clock mode
internal fun PlayerActivity.showV1333ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1333clock
    FeaturePrefsStore.batch1331.v1333clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1333: cloth mode
internal fun PlayerActivity.showV1333ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cloth
    FeaturePrefsStore.batch1331.v1333cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1333: cloud level
internal fun PlayerActivity.showV1333CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1333: clown level
internal fun PlayerActivity.showV1333ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1333: club level
internal fun PlayerActivity.showV1333ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333club = value
        AppToast.show(this, "club: $value")
    }
}

// v1333: clue level
internal fun PlayerActivity.showV1333ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1333: coach level
internal fun PlayerActivity.showV1333CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1333: coast mode
internal fun PlayerActivity.showV1333CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coast
    FeaturePrefsStore.batch1331.v1333coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1333: coat mode
internal fun PlayerActivity.showV1333CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coat
    FeaturePrefsStore.batch1331.v1333coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1333: coffee mode
internal fun PlayerActivity.showV1333CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coffee
    FeaturePrefsStore.batch1331.v1333coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1333: coil mode
internal fun PlayerActivity.showV1333CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coil
    FeaturePrefsStore.batch1331.v1333coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1333: coin mode
internal fun PlayerActivity.showV1333CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coin
    FeaturePrefsStore.batch1331.v1333coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1334: cliff mode
internal fun PlayerActivity.showV1334CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cliff
    FeaturePrefsStore.batch1331.v1334cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1334: climb mode
internal fun PlayerActivity.showV1334ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1334climb
    FeaturePrefsStore.batch1331.v1334climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1334: cling mode
internal fun PlayerActivity.showV1334ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cling
    FeaturePrefsStore.batch1331.v1334cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1334: clock mode
internal fun PlayerActivity.showV1334ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1334clock
    FeaturePrefsStore.batch1331.v1334clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1334: cloth mode
internal fun PlayerActivity.showV1334ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cloth
    FeaturePrefsStore.batch1331.v1334cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1334: cloud level
internal fun PlayerActivity.showV1334CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1334: clown level
internal fun PlayerActivity.showV1334ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1334: club level
internal fun PlayerActivity.showV1334ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334club = value
        AppToast.show(this, "club: $value")
    }
}

// v1334: clue level
internal fun PlayerActivity.showV1334ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1334: coach level
internal fun PlayerActivity.showV1334CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1334: coast mode
internal fun PlayerActivity.showV1334CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coast
    FeaturePrefsStore.batch1331.v1334coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1334: coat mode
internal fun PlayerActivity.showV1334CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coat
    FeaturePrefsStore.batch1331.v1334coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1334: coffee mode
internal fun PlayerActivity.showV1334CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coffee
    FeaturePrefsStore.batch1331.v1334coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1334: coil mode
internal fun PlayerActivity.showV1334CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coil
    FeaturePrefsStore.batch1331.v1334coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1334: coin mode
internal fun PlayerActivity.showV1334CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coin
    FeaturePrefsStore.batch1331.v1334coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1335: cliff mode
internal fun PlayerActivity.showV1335CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cliff
    FeaturePrefsStore.batch1331.v1335cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1335: climb mode
internal fun PlayerActivity.showV1335ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1335climb
    FeaturePrefsStore.batch1331.v1335climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1335: cling mode
internal fun PlayerActivity.showV1335ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cling
    FeaturePrefsStore.batch1331.v1335cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1335: clock mode
internal fun PlayerActivity.showV1335ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1335clock
    FeaturePrefsStore.batch1331.v1335clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1335: cloth mode
internal fun PlayerActivity.showV1335ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cloth
    FeaturePrefsStore.batch1331.v1335cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1335: cloud level
internal fun PlayerActivity.showV1335CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1335: clown level
internal fun PlayerActivity.showV1335ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1335: club level
internal fun PlayerActivity.showV1335ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335club = value
        AppToast.show(this, "club: $value")
    }
}

// v1335: clue level
internal fun PlayerActivity.showV1335ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1335: coach level
internal fun PlayerActivity.showV1335CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1335: coast mode
internal fun PlayerActivity.showV1335CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coast
    FeaturePrefsStore.batch1331.v1335coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1335: coat mode
internal fun PlayerActivity.showV1335CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coat
    FeaturePrefsStore.batch1331.v1335coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1335: coffee mode
internal fun PlayerActivity.showV1335CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coffee
    FeaturePrefsStore.batch1331.v1335coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1335: coil mode
internal fun PlayerActivity.showV1335CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coil
    FeaturePrefsStore.batch1331.v1335coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1335: coin mode
internal fun PlayerActivity.showV1335CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coin
    FeaturePrefsStore.batch1331.v1335coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1336: cliff mode
internal fun PlayerActivity.showV1336CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cliff
    FeaturePrefsStore.batch1331.v1336cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1336: climb mode
internal fun PlayerActivity.showV1336ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1336climb
    FeaturePrefsStore.batch1331.v1336climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1336: cling mode
internal fun PlayerActivity.showV1336ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cling
    FeaturePrefsStore.batch1331.v1336cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1336: clock mode
internal fun PlayerActivity.showV1336ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1336clock
    FeaturePrefsStore.batch1331.v1336clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1336: cloth mode
internal fun PlayerActivity.showV1336ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cloth
    FeaturePrefsStore.batch1331.v1336cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1336: cloud level
internal fun PlayerActivity.showV1336CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1336: clown level
internal fun PlayerActivity.showV1336ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1336: club level
internal fun PlayerActivity.showV1336ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336club = value
        AppToast.show(this, "club: $value")
    }
}

// v1336: clue level
internal fun PlayerActivity.showV1336ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1336: coach level
internal fun PlayerActivity.showV1336CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1336: coast mode
internal fun PlayerActivity.showV1336CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coast
    FeaturePrefsStore.batch1331.v1336coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1336: coat mode
internal fun PlayerActivity.showV1336CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coat
    FeaturePrefsStore.batch1331.v1336coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1336: coffee mode
internal fun PlayerActivity.showV1336CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coffee
    FeaturePrefsStore.batch1331.v1336coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1336: coil mode
internal fun PlayerActivity.showV1336CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coil
    FeaturePrefsStore.batch1331.v1336coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1336: coin mode
internal fun PlayerActivity.showV1336CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coin
    FeaturePrefsStore.batch1331.v1336coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1337: cliff mode
internal fun PlayerActivity.showV1337CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cliff
    FeaturePrefsStore.batch1331.v1337cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1337: climb mode
internal fun PlayerActivity.showV1337ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1337climb
    FeaturePrefsStore.batch1331.v1337climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1337: cling mode
internal fun PlayerActivity.showV1337ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cling
    FeaturePrefsStore.batch1331.v1337cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1337: clock mode
internal fun PlayerActivity.showV1337ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1337clock
    FeaturePrefsStore.batch1331.v1337clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1337: cloth mode
internal fun PlayerActivity.showV1337ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cloth
    FeaturePrefsStore.batch1331.v1337cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1337: cloud level
internal fun PlayerActivity.showV1337CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1337: clown level
internal fun PlayerActivity.showV1337ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1337: club level
internal fun PlayerActivity.showV1337ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337club = value
        AppToast.show(this, "club: $value")
    }
}

// v1337: clue level
internal fun PlayerActivity.showV1337ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1337: coach level
internal fun PlayerActivity.showV1337CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1337: coast mode
internal fun PlayerActivity.showV1337CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coast
    FeaturePrefsStore.batch1331.v1337coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1337: coat mode
internal fun PlayerActivity.showV1337CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coat
    FeaturePrefsStore.batch1331.v1337coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1337: coffee mode
internal fun PlayerActivity.showV1337CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coffee
    FeaturePrefsStore.batch1331.v1337coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1337: coil mode
internal fun PlayerActivity.showV1337CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coil
    FeaturePrefsStore.batch1331.v1337coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1337: coin mode
internal fun PlayerActivity.showV1337CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coin
    FeaturePrefsStore.batch1331.v1337coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1338: cliff mode
internal fun PlayerActivity.showV1338CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cliff
    FeaturePrefsStore.batch1331.v1338cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1338: climb mode
internal fun PlayerActivity.showV1338ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1338climb
    FeaturePrefsStore.batch1331.v1338climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1338: cling mode
internal fun PlayerActivity.showV1338ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cling
    FeaturePrefsStore.batch1331.v1338cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1338: clock mode
internal fun PlayerActivity.showV1338ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1338clock
    FeaturePrefsStore.batch1331.v1338clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1338: cloth mode
internal fun PlayerActivity.showV1338ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cloth
    FeaturePrefsStore.batch1331.v1338cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1338: cloud level
internal fun PlayerActivity.showV1338CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1338: clown level
internal fun PlayerActivity.showV1338ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1338: club level
internal fun PlayerActivity.showV1338ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338club = value
        AppToast.show(this, "club: $value")
    }
}

// v1338: clue level
internal fun PlayerActivity.showV1338ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1338: coach level
internal fun PlayerActivity.showV1338CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1338: coast mode
internal fun PlayerActivity.showV1338CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coast
    FeaturePrefsStore.batch1331.v1338coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1338: coat mode
internal fun PlayerActivity.showV1338CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coat
    FeaturePrefsStore.batch1331.v1338coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1338: coffee mode
internal fun PlayerActivity.showV1338CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coffee
    FeaturePrefsStore.batch1331.v1338coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1338: coil mode
internal fun PlayerActivity.showV1338CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coil
    FeaturePrefsStore.batch1331.v1338coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1338: coin mode
internal fun PlayerActivity.showV1338CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coin
    FeaturePrefsStore.batch1331.v1338coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1339: cliff mode
internal fun PlayerActivity.showV1339CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cliff
    FeaturePrefsStore.batch1331.v1339cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1339: climb mode
internal fun PlayerActivity.showV1339ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1339climb
    FeaturePrefsStore.batch1331.v1339climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1339: cling mode
internal fun PlayerActivity.showV1339ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cling
    FeaturePrefsStore.batch1331.v1339cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1339: clock mode
internal fun PlayerActivity.showV1339ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1339clock
    FeaturePrefsStore.batch1331.v1339clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1339: cloth mode
internal fun PlayerActivity.showV1339ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cloth
    FeaturePrefsStore.batch1331.v1339cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1339: cloud level
internal fun PlayerActivity.showV1339CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1339: clown level
internal fun PlayerActivity.showV1339ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1339: club level
internal fun PlayerActivity.showV1339ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339club = value
        AppToast.show(this, "club: $value")
    }
}

// v1339: clue level
internal fun PlayerActivity.showV1339ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1339: coach level
internal fun PlayerActivity.showV1339CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1339: coast mode
internal fun PlayerActivity.showV1339CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coast
    FeaturePrefsStore.batch1331.v1339coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1339: coat mode
internal fun PlayerActivity.showV1339CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coat
    FeaturePrefsStore.batch1331.v1339coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1339: coffee mode
internal fun PlayerActivity.showV1339CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coffee
    FeaturePrefsStore.batch1331.v1339coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1339: coil mode
internal fun PlayerActivity.showV1339CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coil
    FeaturePrefsStore.batch1331.v1339coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1339: coin mode
internal fun PlayerActivity.showV1339CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coin
    FeaturePrefsStore.batch1331.v1339coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1340: cliff mode
internal fun PlayerActivity.showV1340CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cliff
    FeaturePrefsStore.batch1331.v1340cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1340: climb mode
internal fun PlayerActivity.showV1340ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1340climb
    FeaturePrefsStore.batch1331.v1340climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1340: cling mode
internal fun PlayerActivity.showV1340ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cling
    FeaturePrefsStore.batch1331.v1340cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1340: clock mode
internal fun PlayerActivity.showV1340ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1340clock
    FeaturePrefsStore.batch1331.v1340clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1340: cloth mode
internal fun PlayerActivity.showV1340ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cloth
    FeaturePrefsStore.batch1331.v1340cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1340: cloud level
internal fun PlayerActivity.showV1340CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1340: clown level
internal fun PlayerActivity.showV1340ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1340: club level
internal fun PlayerActivity.showV1340ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340club = value
        AppToast.show(this, "club: $value")
    }
}

// v1340: clue level
internal fun PlayerActivity.showV1340ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1340: coach level
internal fun PlayerActivity.showV1340CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1340: coast mode
internal fun PlayerActivity.showV1340CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coast
    FeaturePrefsStore.batch1331.v1340coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1340: coat mode
internal fun PlayerActivity.showV1340CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coat
    FeaturePrefsStore.batch1331.v1340coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1340: coffee mode
internal fun PlayerActivity.showV1340CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coffee
    FeaturePrefsStore.batch1331.v1340coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1340: coil mode
internal fun PlayerActivity.showV1340CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coil
    FeaturePrefsStore.batch1331.v1340coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1340: coin mode
internal fun PlayerActivity.showV1340CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coin
    FeaturePrefsStore.batch1331.v1340coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

