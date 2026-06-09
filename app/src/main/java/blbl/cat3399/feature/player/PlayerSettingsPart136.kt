package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1541: hood mode
internal fun PlayerActivity.showV1541HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hood
    FeaturePrefsStore.batch1541.v1541hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1541: hope mode
internal fun PlayerActivity.showV1541HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hope
    FeaturePrefsStore.batch1541.v1541hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1541: horn mode
internal fun PlayerActivity.showV1541HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horn
    FeaturePrefsStore.batch1541.v1541horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1541: horror mode
internal fun PlayerActivity.showV1541HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horror
    FeaturePrefsStore.batch1541.v1541horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1541: horse mode
internal fun PlayerActivity.showV1541HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1541horse
    FeaturePrefsStore.batch1541.v1541horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1541: hotel level
internal fun PlayerActivity.showV1541HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1541: hour level
internal fun PlayerActivity.showV1541HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1541: house level
internal fun PlayerActivity.showV1541HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541house = value
        AppToast.show(this, "house: $value")
    }
}

// v1541: huge level
internal fun PlayerActivity.showV1541HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1541: hull level
internal fun PlayerActivity.showV1541HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1541hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1541hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1541: humor mode
internal fun PlayerActivity.showV1541HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1541humor
    FeaturePrefsStore.batch1541.v1541humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1541: hundred mode
internal fun PlayerActivity.showV1541HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hundred
    FeaturePrefsStore.batch1541.v1541hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1541: hunt mode
internal fun PlayerActivity.showV1541HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hunt
    FeaturePrefsStore.batch1541.v1541hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1541: hurry mode
internal fun PlayerActivity.showV1541HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hurry
    FeaturePrefsStore.batch1541.v1541hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1541: hurt mode
internal fun PlayerActivity.showV1541HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1541hurt
    FeaturePrefsStore.batch1541.v1541hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1542: hood mode
internal fun PlayerActivity.showV1542HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hood
    FeaturePrefsStore.batch1541.v1542hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1542: hope mode
internal fun PlayerActivity.showV1542HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hope
    FeaturePrefsStore.batch1541.v1542hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1542: horn mode
internal fun PlayerActivity.showV1542HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horn
    FeaturePrefsStore.batch1541.v1542horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1542: horror mode
internal fun PlayerActivity.showV1542HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horror
    FeaturePrefsStore.batch1541.v1542horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1542: horse mode
internal fun PlayerActivity.showV1542HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1542horse
    FeaturePrefsStore.batch1541.v1542horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1542: hotel level
internal fun PlayerActivity.showV1542HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1542: hour level
internal fun PlayerActivity.showV1542HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1542: house level
internal fun PlayerActivity.showV1542HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542house = value
        AppToast.show(this, "house: $value")
    }
}

// v1542: huge level
internal fun PlayerActivity.showV1542HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1542: hull level
internal fun PlayerActivity.showV1542HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1542hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1542hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1542: humor mode
internal fun PlayerActivity.showV1542HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1542humor
    FeaturePrefsStore.batch1541.v1542humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1542: hundred mode
internal fun PlayerActivity.showV1542HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hundred
    FeaturePrefsStore.batch1541.v1542hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1542: hunt mode
internal fun PlayerActivity.showV1542HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hunt
    FeaturePrefsStore.batch1541.v1542hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1542: hurry mode
internal fun PlayerActivity.showV1542HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hurry
    FeaturePrefsStore.batch1541.v1542hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1542: hurt mode
internal fun PlayerActivity.showV1542HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1542hurt
    FeaturePrefsStore.batch1541.v1542hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1543: hood mode
internal fun PlayerActivity.showV1543HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hood
    FeaturePrefsStore.batch1541.v1543hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1543: hope mode
internal fun PlayerActivity.showV1543HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hope
    FeaturePrefsStore.batch1541.v1543hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1543: horn mode
internal fun PlayerActivity.showV1543HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horn
    FeaturePrefsStore.batch1541.v1543horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1543: horror mode
internal fun PlayerActivity.showV1543HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horror
    FeaturePrefsStore.batch1541.v1543horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1543: horse mode
internal fun PlayerActivity.showV1543HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1543horse
    FeaturePrefsStore.batch1541.v1543horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1543: hotel level
internal fun PlayerActivity.showV1543HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1543: hour level
internal fun PlayerActivity.showV1543HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1543: house level
internal fun PlayerActivity.showV1543HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543house = value
        AppToast.show(this, "house: $value")
    }
}

// v1543: huge level
internal fun PlayerActivity.showV1543HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1543: hull level
internal fun PlayerActivity.showV1543HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1543hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1543hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1543: humor mode
internal fun PlayerActivity.showV1543HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1543humor
    FeaturePrefsStore.batch1541.v1543humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1543: hundred mode
internal fun PlayerActivity.showV1543HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hundred
    FeaturePrefsStore.batch1541.v1543hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1543: hunt mode
internal fun PlayerActivity.showV1543HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hunt
    FeaturePrefsStore.batch1541.v1543hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1543: hurry mode
internal fun PlayerActivity.showV1543HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hurry
    FeaturePrefsStore.batch1541.v1543hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1543: hurt mode
internal fun PlayerActivity.showV1543HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1543hurt
    FeaturePrefsStore.batch1541.v1543hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1544: hood mode
internal fun PlayerActivity.showV1544HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hood
    FeaturePrefsStore.batch1541.v1544hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1544: hope mode
internal fun PlayerActivity.showV1544HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hope
    FeaturePrefsStore.batch1541.v1544hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1544: horn mode
internal fun PlayerActivity.showV1544HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horn
    FeaturePrefsStore.batch1541.v1544horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1544: horror mode
internal fun PlayerActivity.showV1544HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horror
    FeaturePrefsStore.batch1541.v1544horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1544: horse mode
internal fun PlayerActivity.showV1544HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1544horse
    FeaturePrefsStore.batch1541.v1544horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1544: hotel level
internal fun PlayerActivity.showV1544HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1544: hour level
internal fun PlayerActivity.showV1544HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1544: house level
internal fun PlayerActivity.showV1544HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544house = value
        AppToast.show(this, "house: $value")
    }
}

// v1544: huge level
internal fun PlayerActivity.showV1544HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1544: hull level
internal fun PlayerActivity.showV1544HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1544hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1544hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1544: humor mode
internal fun PlayerActivity.showV1544HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1544humor
    FeaturePrefsStore.batch1541.v1544humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1544: hundred mode
internal fun PlayerActivity.showV1544HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hundred
    FeaturePrefsStore.batch1541.v1544hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1544: hunt mode
internal fun PlayerActivity.showV1544HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hunt
    FeaturePrefsStore.batch1541.v1544hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1544: hurry mode
internal fun PlayerActivity.showV1544HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hurry
    FeaturePrefsStore.batch1541.v1544hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1544: hurt mode
internal fun PlayerActivity.showV1544HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1544hurt
    FeaturePrefsStore.batch1541.v1544hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1545: hood mode
internal fun PlayerActivity.showV1545HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hood
    FeaturePrefsStore.batch1541.v1545hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1545: hope mode
internal fun PlayerActivity.showV1545HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hope
    FeaturePrefsStore.batch1541.v1545hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1545: horn mode
internal fun PlayerActivity.showV1545HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horn
    FeaturePrefsStore.batch1541.v1545horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1545: horror mode
internal fun PlayerActivity.showV1545HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horror
    FeaturePrefsStore.batch1541.v1545horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1545: horse mode
internal fun PlayerActivity.showV1545HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1545horse
    FeaturePrefsStore.batch1541.v1545horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1545: hotel level
internal fun PlayerActivity.showV1545HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1545: hour level
internal fun PlayerActivity.showV1545HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1545: house level
internal fun PlayerActivity.showV1545HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545house = value
        AppToast.show(this, "house: $value")
    }
}

// v1545: huge level
internal fun PlayerActivity.showV1545HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1545: hull level
internal fun PlayerActivity.showV1545HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1545hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1545hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1545: humor mode
internal fun PlayerActivity.showV1545HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1545humor
    FeaturePrefsStore.batch1541.v1545humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1545: hundred mode
internal fun PlayerActivity.showV1545HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hundred
    FeaturePrefsStore.batch1541.v1545hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1545: hunt mode
internal fun PlayerActivity.showV1545HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hunt
    FeaturePrefsStore.batch1541.v1545hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1545: hurry mode
internal fun PlayerActivity.showV1545HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hurry
    FeaturePrefsStore.batch1541.v1545hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1545: hurt mode
internal fun PlayerActivity.showV1545HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1545hurt
    FeaturePrefsStore.batch1541.v1545hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1546: hood mode
internal fun PlayerActivity.showV1546HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hood
    FeaturePrefsStore.batch1541.v1546hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1546: hope mode
internal fun PlayerActivity.showV1546HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hope
    FeaturePrefsStore.batch1541.v1546hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1546: horn mode
internal fun PlayerActivity.showV1546HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horn
    FeaturePrefsStore.batch1541.v1546horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1546: horror mode
internal fun PlayerActivity.showV1546HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horror
    FeaturePrefsStore.batch1541.v1546horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1546: horse mode
internal fun PlayerActivity.showV1546HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1546horse
    FeaturePrefsStore.batch1541.v1546horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1546: hotel level
internal fun PlayerActivity.showV1546HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1546: hour level
internal fun PlayerActivity.showV1546HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1546: house level
internal fun PlayerActivity.showV1546HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546house = value
        AppToast.show(this, "house: $value")
    }
}

// v1546: huge level
internal fun PlayerActivity.showV1546HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1546: hull level
internal fun PlayerActivity.showV1546HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1546hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1546hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1546: humor mode
internal fun PlayerActivity.showV1546HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1546humor
    FeaturePrefsStore.batch1541.v1546humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1546: hundred mode
internal fun PlayerActivity.showV1546HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hundred
    FeaturePrefsStore.batch1541.v1546hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1546: hunt mode
internal fun PlayerActivity.showV1546HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hunt
    FeaturePrefsStore.batch1541.v1546hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1546: hurry mode
internal fun PlayerActivity.showV1546HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hurry
    FeaturePrefsStore.batch1541.v1546hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1546: hurt mode
internal fun PlayerActivity.showV1546HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1546hurt
    FeaturePrefsStore.batch1541.v1546hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1547: hood mode
internal fun PlayerActivity.showV1547HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hood
    FeaturePrefsStore.batch1541.v1547hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1547: hope mode
internal fun PlayerActivity.showV1547HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hope
    FeaturePrefsStore.batch1541.v1547hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1547: horn mode
internal fun PlayerActivity.showV1547HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horn
    FeaturePrefsStore.batch1541.v1547horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1547: horror mode
internal fun PlayerActivity.showV1547HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horror
    FeaturePrefsStore.batch1541.v1547horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1547: horse mode
internal fun PlayerActivity.showV1547HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1547horse
    FeaturePrefsStore.batch1541.v1547horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1547: hotel level
internal fun PlayerActivity.showV1547HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1547: hour level
internal fun PlayerActivity.showV1547HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1547: house level
internal fun PlayerActivity.showV1547HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547house = value
        AppToast.show(this, "house: $value")
    }
}

// v1547: huge level
internal fun PlayerActivity.showV1547HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1547: hull level
internal fun PlayerActivity.showV1547HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1547hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1547hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1547: humor mode
internal fun PlayerActivity.showV1547HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1547humor
    FeaturePrefsStore.batch1541.v1547humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1547: hundred mode
internal fun PlayerActivity.showV1547HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hundred
    FeaturePrefsStore.batch1541.v1547hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1547: hunt mode
internal fun PlayerActivity.showV1547HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hunt
    FeaturePrefsStore.batch1541.v1547hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1547: hurry mode
internal fun PlayerActivity.showV1547HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hurry
    FeaturePrefsStore.batch1541.v1547hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1547: hurt mode
internal fun PlayerActivity.showV1547HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1547hurt
    FeaturePrefsStore.batch1541.v1547hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1548: hood mode
internal fun PlayerActivity.showV1548HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hood
    FeaturePrefsStore.batch1541.v1548hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1548: hope mode
internal fun PlayerActivity.showV1548HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hope
    FeaturePrefsStore.batch1541.v1548hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1548: horn mode
internal fun PlayerActivity.showV1548HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horn
    FeaturePrefsStore.batch1541.v1548horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1548: horror mode
internal fun PlayerActivity.showV1548HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horror
    FeaturePrefsStore.batch1541.v1548horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1548: horse mode
internal fun PlayerActivity.showV1548HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1548horse
    FeaturePrefsStore.batch1541.v1548horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1548: hotel level
internal fun PlayerActivity.showV1548HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1548: hour level
internal fun PlayerActivity.showV1548HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1548: house level
internal fun PlayerActivity.showV1548HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548house = value
        AppToast.show(this, "house: $value")
    }
}

// v1548: huge level
internal fun PlayerActivity.showV1548HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1548: hull level
internal fun PlayerActivity.showV1548HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1548hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1548hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1548: humor mode
internal fun PlayerActivity.showV1548HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1548humor
    FeaturePrefsStore.batch1541.v1548humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1548: hundred mode
internal fun PlayerActivity.showV1548HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hundred
    FeaturePrefsStore.batch1541.v1548hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1548: hunt mode
internal fun PlayerActivity.showV1548HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hunt
    FeaturePrefsStore.batch1541.v1548hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1548: hurry mode
internal fun PlayerActivity.showV1548HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hurry
    FeaturePrefsStore.batch1541.v1548hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1548: hurt mode
internal fun PlayerActivity.showV1548HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1548hurt
    FeaturePrefsStore.batch1541.v1548hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1549: hood mode
internal fun PlayerActivity.showV1549HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hood
    FeaturePrefsStore.batch1541.v1549hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1549: hope mode
internal fun PlayerActivity.showV1549HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hope
    FeaturePrefsStore.batch1541.v1549hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1549: horn mode
internal fun PlayerActivity.showV1549HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horn
    FeaturePrefsStore.batch1541.v1549horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1549: horror mode
internal fun PlayerActivity.showV1549HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horror
    FeaturePrefsStore.batch1541.v1549horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1549: horse mode
internal fun PlayerActivity.showV1549HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1549horse
    FeaturePrefsStore.batch1541.v1549horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1549: hotel level
internal fun PlayerActivity.showV1549HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1549: hour level
internal fun PlayerActivity.showV1549HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1549: house level
internal fun PlayerActivity.showV1549HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549house = value
        AppToast.show(this, "house: $value")
    }
}

// v1549: huge level
internal fun PlayerActivity.showV1549HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1549: hull level
internal fun PlayerActivity.showV1549HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1549hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1549hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1549: humor mode
internal fun PlayerActivity.showV1549HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1549humor
    FeaturePrefsStore.batch1541.v1549humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1549: hundred mode
internal fun PlayerActivity.showV1549HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hundred
    FeaturePrefsStore.batch1541.v1549hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1549: hunt mode
internal fun PlayerActivity.showV1549HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hunt
    FeaturePrefsStore.batch1541.v1549hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1549: hurry mode
internal fun PlayerActivity.showV1549HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hurry
    FeaturePrefsStore.batch1541.v1549hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1549: hurt mode
internal fun PlayerActivity.showV1549HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1549hurt
    FeaturePrefsStore.batch1541.v1549hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

// v1550: hood mode
internal fun PlayerActivity.showV1550HoodToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hood
    FeaturePrefsStore.batch1541.v1550hood = !current
    AppToast.show(this, "hood: ${if (!current) "ON" else "OFF"}")
}

// v1550: hope mode
internal fun PlayerActivity.showV1550HopeToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hope
    FeaturePrefsStore.batch1541.v1550hope = !current
    AppToast.show(this, "hope: ${if (!current) "ON" else "OFF"}")
}

// v1550: horn mode
internal fun PlayerActivity.showV1550HornToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horn
    FeaturePrefsStore.batch1541.v1550horn = !current
    AppToast.show(this, "horn: ${if (!current) "ON" else "OFF"}")
}

// v1550: horror mode
internal fun PlayerActivity.showV1550HorrorToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horror
    FeaturePrefsStore.batch1541.v1550horror = !current
    AppToast.show(this, "horror: ${if (!current) "ON" else "OFF"}")
}

// v1550: horse mode
internal fun PlayerActivity.showV1550HorseToggle() {
    val current = FeaturePrefsStore.batch1541.v1550horse
    FeaturePrefsStore.batch1541.v1550horse = !current
    AppToast.show(this, "horse: ${if (!current) "ON" else "OFF"}")
}

// v1550: hotel level
internal fun PlayerActivity.showV1550HotelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hotel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hotel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hotel = value
        AppToast.show(this, "hotel: $value")
    }
}

// v1550: hour level
internal fun PlayerActivity.showV1550HourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hour level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hour = value
        AppToast.show(this, "hour: $value")
    }
}

// v1550: house level
internal fun PlayerActivity.showV1550HouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550house).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "house level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550house = value
        AppToast.show(this, "house: $value")
    }
}

// v1550: huge level
internal fun PlayerActivity.showV1550HugeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550huge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "huge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550huge = value
        AppToast.show(this, "huge: $value")
    }
}

// v1550: hull level
internal fun PlayerActivity.showV1550HullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1541.v1550hull).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hull level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1541.v1550hull = value
        AppToast.show(this, "hull: $value")
    }
}

// v1550: humor mode
internal fun PlayerActivity.showV1550HumorToggle() {
    val current = FeaturePrefsStore.batch1541.v1550humor
    FeaturePrefsStore.batch1541.v1550humor = !current
    AppToast.show(this, "humor: ${if (!current) "ON" else "OFF"}")
}

// v1550: hundred mode
internal fun PlayerActivity.showV1550HundredToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hundred
    FeaturePrefsStore.batch1541.v1550hundred = !current
    AppToast.show(this, "hundred: ${if (!current) "ON" else "OFF"}")
}

// v1550: hunt mode
internal fun PlayerActivity.showV1550HuntToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hunt
    FeaturePrefsStore.batch1541.v1550hunt = !current
    AppToast.show(this, "hunt: ${if (!current) "ON" else "OFF"}")
}

// v1550: hurry mode
internal fun PlayerActivity.showV1550HurryToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hurry
    FeaturePrefsStore.batch1541.v1550hurry = !current
    AppToast.show(this, "hurry: ${if (!current) "ON" else "OFF"}")
}

// v1550: hurt mode
internal fun PlayerActivity.showV1550HurtToggle() {
    val current = FeaturePrefsStore.batch1541.v1550hurt
    FeaturePrefsStore.batch1541.v1550hurt = !current
    AppToast.show(this, "hurt: ${if (!current) "ON" else "OFF"}")
}

