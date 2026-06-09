package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1231: award mode
internal fun PlayerActivity.showV1231AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1231award
    FeaturePrefsStore.batch1231.v1231award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1231: aware mode
internal fun PlayerActivity.showV1231AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1231aware
    FeaturePrefsStore.batch1231.v1231aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1231: awash mode
internal fun PlayerActivity.showV1231AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1231awash
    FeaturePrefsStore.batch1231.v1231awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1231: axis mode
internal fun PlayerActivity.showV1231AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1231axis
    FeaturePrefsStore.batch1231.v1231axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1231: baby mode
internal fun PlayerActivity.showV1231BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1231baby
    FeaturePrefsStore.batch1231.v1231baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1231: back level
internal fun PlayerActivity.showV1231BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231back = value
        AppToast.show(this, "back: $value")
    }
}

// v1231: badge level
internal fun PlayerActivity.showV1231BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1231: bag level
internal fun PlayerActivity.showV1231BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1231: bait level
internal fun PlayerActivity.showV1231BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1231: bake level
internal fun PlayerActivity.showV1231BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1231: ball mode
internal fun PlayerActivity.showV1231BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1231ball
    FeaturePrefsStore.batch1231.v1231ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1231: ban mode
internal fun PlayerActivity.showV1231BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1231ban
    FeaturePrefsStore.batch1231.v1231ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1231: band mode
internal fun PlayerActivity.showV1231BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1231band
    FeaturePrefsStore.batch1231.v1231band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1231: bank mode
internal fun PlayerActivity.showV1231BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1231bank
    FeaturePrefsStore.batch1231.v1231bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1231: bar mode
internal fun PlayerActivity.showV1231BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1231bar
    FeaturePrefsStore.batch1231.v1231bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1232: award mode
internal fun PlayerActivity.showV1232AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1232award
    FeaturePrefsStore.batch1231.v1232award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1232: aware mode
internal fun PlayerActivity.showV1232AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1232aware
    FeaturePrefsStore.batch1231.v1232aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1232: awash mode
internal fun PlayerActivity.showV1232AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1232awash
    FeaturePrefsStore.batch1231.v1232awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1232: axis mode
internal fun PlayerActivity.showV1232AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1232axis
    FeaturePrefsStore.batch1231.v1232axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1232: baby mode
internal fun PlayerActivity.showV1232BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1232baby
    FeaturePrefsStore.batch1231.v1232baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1232: back level
internal fun PlayerActivity.showV1232BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232back = value
        AppToast.show(this, "back: $value")
    }
}

// v1232: badge level
internal fun PlayerActivity.showV1232BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1232: bag level
internal fun PlayerActivity.showV1232BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1232: bait level
internal fun PlayerActivity.showV1232BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1232: bake level
internal fun PlayerActivity.showV1232BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1232: ball mode
internal fun PlayerActivity.showV1232BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1232ball
    FeaturePrefsStore.batch1231.v1232ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1232: ban mode
internal fun PlayerActivity.showV1232BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1232ban
    FeaturePrefsStore.batch1231.v1232ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1232: band mode
internal fun PlayerActivity.showV1232BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1232band
    FeaturePrefsStore.batch1231.v1232band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1232: bank mode
internal fun PlayerActivity.showV1232BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1232bank
    FeaturePrefsStore.batch1231.v1232bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1232: bar mode
internal fun PlayerActivity.showV1232BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1232bar
    FeaturePrefsStore.batch1231.v1232bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1233: award mode
internal fun PlayerActivity.showV1233AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1233award
    FeaturePrefsStore.batch1231.v1233award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1233: aware mode
internal fun PlayerActivity.showV1233AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1233aware
    FeaturePrefsStore.batch1231.v1233aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1233: awash mode
internal fun PlayerActivity.showV1233AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1233awash
    FeaturePrefsStore.batch1231.v1233awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1233: axis mode
internal fun PlayerActivity.showV1233AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1233axis
    FeaturePrefsStore.batch1231.v1233axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1233: baby mode
internal fun PlayerActivity.showV1233BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1233baby
    FeaturePrefsStore.batch1231.v1233baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1233: back level
internal fun PlayerActivity.showV1233BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233back = value
        AppToast.show(this, "back: $value")
    }
}

// v1233: badge level
internal fun PlayerActivity.showV1233BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1233: bag level
internal fun PlayerActivity.showV1233BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1233: bait level
internal fun PlayerActivity.showV1233BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1233: bake level
internal fun PlayerActivity.showV1233BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1233: ball mode
internal fun PlayerActivity.showV1233BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1233ball
    FeaturePrefsStore.batch1231.v1233ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1233: ban mode
internal fun PlayerActivity.showV1233BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1233ban
    FeaturePrefsStore.batch1231.v1233ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1233: band mode
internal fun PlayerActivity.showV1233BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1233band
    FeaturePrefsStore.batch1231.v1233band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1233: bank mode
internal fun PlayerActivity.showV1233BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1233bank
    FeaturePrefsStore.batch1231.v1233bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1233: bar mode
internal fun PlayerActivity.showV1233BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1233bar
    FeaturePrefsStore.batch1231.v1233bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1234: award mode
internal fun PlayerActivity.showV1234AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1234award
    FeaturePrefsStore.batch1231.v1234award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1234: aware mode
internal fun PlayerActivity.showV1234AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1234aware
    FeaturePrefsStore.batch1231.v1234aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1234: awash mode
internal fun PlayerActivity.showV1234AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1234awash
    FeaturePrefsStore.batch1231.v1234awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1234: axis mode
internal fun PlayerActivity.showV1234AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1234axis
    FeaturePrefsStore.batch1231.v1234axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1234: baby mode
internal fun PlayerActivity.showV1234BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1234baby
    FeaturePrefsStore.batch1231.v1234baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1234: back level
internal fun PlayerActivity.showV1234BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234back = value
        AppToast.show(this, "back: $value")
    }
}

// v1234: badge level
internal fun PlayerActivity.showV1234BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1234: bag level
internal fun PlayerActivity.showV1234BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1234: bait level
internal fun PlayerActivity.showV1234BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1234: bake level
internal fun PlayerActivity.showV1234BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1234: ball mode
internal fun PlayerActivity.showV1234BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1234ball
    FeaturePrefsStore.batch1231.v1234ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1234: ban mode
internal fun PlayerActivity.showV1234BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1234ban
    FeaturePrefsStore.batch1231.v1234ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1234: band mode
internal fun PlayerActivity.showV1234BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1234band
    FeaturePrefsStore.batch1231.v1234band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1234: bank mode
internal fun PlayerActivity.showV1234BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1234bank
    FeaturePrefsStore.batch1231.v1234bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1234: bar mode
internal fun PlayerActivity.showV1234BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1234bar
    FeaturePrefsStore.batch1231.v1234bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1235: award mode
internal fun PlayerActivity.showV1235AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1235award
    FeaturePrefsStore.batch1231.v1235award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1235: aware mode
internal fun PlayerActivity.showV1235AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1235aware
    FeaturePrefsStore.batch1231.v1235aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1235: awash mode
internal fun PlayerActivity.showV1235AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1235awash
    FeaturePrefsStore.batch1231.v1235awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1235: axis mode
internal fun PlayerActivity.showV1235AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1235axis
    FeaturePrefsStore.batch1231.v1235axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1235: baby mode
internal fun PlayerActivity.showV1235BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1235baby
    FeaturePrefsStore.batch1231.v1235baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1235: back level
internal fun PlayerActivity.showV1235BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235back = value
        AppToast.show(this, "back: $value")
    }
}

// v1235: badge level
internal fun PlayerActivity.showV1235BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1235: bag level
internal fun PlayerActivity.showV1235BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1235: bait level
internal fun PlayerActivity.showV1235BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1235: bake level
internal fun PlayerActivity.showV1235BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1235: ball mode
internal fun PlayerActivity.showV1235BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1235ball
    FeaturePrefsStore.batch1231.v1235ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1235: ban mode
internal fun PlayerActivity.showV1235BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1235ban
    FeaturePrefsStore.batch1231.v1235ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1235: band mode
internal fun PlayerActivity.showV1235BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1235band
    FeaturePrefsStore.batch1231.v1235band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1235: bank mode
internal fun PlayerActivity.showV1235BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1235bank
    FeaturePrefsStore.batch1231.v1235bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1235: bar mode
internal fun PlayerActivity.showV1235BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1235bar
    FeaturePrefsStore.batch1231.v1235bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1236: award mode
internal fun PlayerActivity.showV1236AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1236award
    FeaturePrefsStore.batch1231.v1236award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1236: aware mode
internal fun PlayerActivity.showV1236AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1236aware
    FeaturePrefsStore.batch1231.v1236aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1236: awash mode
internal fun PlayerActivity.showV1236AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1236awash
    FeaturePrefsStore.batch1231.v1236awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1236: axis mode
internal fun PlayerActivity.showV1236AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1236axis
    FeaturePrefsStore.batch1231.v1236axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1236: baby mode
internal fun PlayerActivity.showV1236BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1236baby
    FeaturePrefsStore.batch1231.v1236baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1236: back level
internal fun PlayerActivity.showV1236BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236back = value
        AppToast.show(this, "back: $value")
    }
}

// v1236: badge level
internal fun PlayerActivity.showV1236BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1236: bag level
internal fun PlayerActivity.showV1236BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1236: bait level
internal fun PlayerActivity.showV1236BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1236: bake level
internal fun PlayerActivity.showV1236BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1236: ball mode
internal fun PlayerActivity.showV1236BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1236ball
    FeaturePrefsStore.batch1231.v1236ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1236: ban mode
internal fun PlayerActivity.showV1236BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1236ban
    FeaturePrefsStore.batch1231.v1236ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1236: band mode
internal fun PlayerActivity.showV1236BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1236band
    FeaturePrefsStore.batch1231.v1236band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1236: bank mode
internal fun PlayerActivity.showV1236BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1236bank
    FeaturePrefsStore.batch1231.v1236bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1236: bar mode
internal fun PlayerActivity.showV1236BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1236bar
    FeaturePrefsStore.batch1231.v1236bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1237: award mode
internal fun PlayerActivity.showV1237AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1237award
    FeaturePrefsStore.batch1231.v1237award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1237: aware mode
internal fun PlayerActivity.showV1237AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1237aware
    FeaturePrefsStore.batch1231.v1237aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1237: awash mode
internal fun PlayerActivity.showV1237AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1237awash
    FeaturePrefsStore.batch1231.v1237awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1237: axis mode
internal fun PlayerActivity.showV1237AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1237axis
    FeaturePrefsStore.batch1231.v1237axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1237: baby mode
internal fun PlayerActivity.showV1237BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1237baby
    FeaturePrefsStore.batch1231.v1237baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1237: back level
internal fun PlayerActivity.showV1237BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237back = value
        AppToast.show(this, "back: $value")
    }
}

// v1237: badge level
internal fun PlayerActivity.showV1237BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1237: bag level
internal fun PlayerActivity.showV1237BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1237: bait level
internal fun PlayerActivity.showV1237BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1237: bake level
internal fun PlayerActivity.showV1237BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1237: ball mode
internal fun PlayerActivity.showV1237BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1237ball
    FeaturePrefsStore.batch1231.v1237ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1237: ban mode
internal fun PlayerActivity.showV1237BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1237ban
    FeaturePrefsStore.batch1231.v1237ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1237: band mode
internal fun PlayerActivity.showV1237BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1237band
    FeaturePrefsStore.batch1231.v1237band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1237: bank mode
internal fun PlayerActivity.showV1237BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1237bank
    FeaturePrefsStore.batch1231.v1237bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1237: bar mode
internal fun PlayerActivity.showV1237BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1237bar
    FeaturePrefsStore.batch1231.v1237bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1238: award mode
internal fun PlayerActivity.showV1238AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1238award
    FeaturePrefsStore.batch1231.v1238award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1238: aware mode
internal fun PlayerActivity.showV1238AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1238aware
    FeaturePrefsStore.batch1231.v1238aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1238: awash mode
internal fun PlayerActivity.showV1238AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1238awash
    FeaturePrefsStore.batch1231.v1238awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1238: axis mode
internal fun PlayerActivity.showV1238AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1238axis
    FeaturePrefsStore.batch1231.v1238axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1238: baby mode
internal fun PlayerActivity.showV1238BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1238baby
    FeaturePrefsStore.batch1231.v1238baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1238: back level
internal fun PlayerActivity.showV1238BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238back = value
        AppToast.show(this, "back: $value")
    }
}

// v1238: badge level
internal fun PlayerActivity.showV1238BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1238: bag level
internal fun PlayerActivity.showV1238BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1238: bait level
internal fun PlayerActivity.showV1238BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1238: bake level
internal fun PlayerActivity.showV1238BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1238: ball mode
internal fun PlayerActivity.showV1238BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1238ball
    FeaturePrefsStore.batch1231.v1238ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1238: ban mode
internal fun PlayerActivity.showV1238BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1238ban
    FeaturePrefsStore.batch1231.v1238ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1238: band mode
internal fun PlayerActivity.showV1238BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1238band
    FeaturePrefsStore.batch1231.v1238band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1238: bank mode
internal fun PlayerActivity.showV1238BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1238bank
    FeaturePrefsStore.batch1231.v1238bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1238: bar mode
internal fun PlayerActivity.showV1238BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1238bar
    FeaturePrefsStore.batch1231.v1238bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1239: award mode
internal fun PlayerActivity.showV1239AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1239award
    FeaturePrefsStore.batch1231.v1239award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1239: aware mode
internal fun PlayerActivity.showV1239AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1239aware
    FeaturePrefsStore.batch1231.v1239aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1239: awash mode
internal fun PlayerActivity.showV1239AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1239awash
    FeaturePrefsStore.batch1231.v1239awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1239: axis mode
internal fun PlayerActivity.showV1239AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1239axis
    FeaturePrefsStore.batch1231.v1239axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1239: baby mode
internal fun PlayerActivity.showV1239BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1239baby
    FeaturePrefsStore.batch1231.v1239baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1239: back level
internal fun PlayerActivity.showV1239BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239back = value
        AppToast.show(this, "back: $value")
    }
}

// v1239: badge level
internal fun PlayerActivity.showV1239BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1239: bag level
internal fun PlayerActivity.showV1239BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1239: bait level
internal fun PlayerActivity.showV1239BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1239: bake level
internal fun PlayerActivity.showV1239BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1239: ball mode
internal fun PlayerActivity.showV1239BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1239ball
    FeaturePrefsStore.batch1231.v1239ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1239: ban mode
internal fun PlayerActivity.showV1239BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1239ban
    FeaturePrefsStore.batch1231.v1239ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1239: band mode
internal fun PlayerActivity.showV1239BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1239band
    FeaturePrefsStore.batch1231.v1239band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1239: bank mode
internal fun PlayerActivity.showV1239BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1239bank
    FeaturePrefsStore.batch1231.v1239bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1239: bar mode
internal fun PlayerActivity.showV1239BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1239bar
    FeaturePrefsStore.batch1231.v1239bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1240: award mode
internal fun PlayerActivity.showV1240AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1240award
    FeaturePrefsStore.batch1231.v1240award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1240: aware mode
internal fun PlayerActivity.showV1240AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1240aware
    FeaturePrefsStore.batch1231.v1240aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1240: awash mode
internal fun PlayerActivity.showV1240AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1240awash
    FeaturePrefsStore.batch1231.v1240awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1240: axis mode
internal fun PlayerActivity.showV1240AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1240axis
    FeaturePrefsStore.batch1231.v1240axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1240: baby mode
internal fun PlayerActivity.showV1240BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1240baby
    FeaturePrefsStore.batch1231.v1240baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1240: back level
internal fun PlayerActivity.showV1240BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240back = value
        AppToast.show(this, "back: $value")
    }
}

// v1240: badge level
internal fun PlayerActivity.showV1240BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1240: bag level
internal fun PlayerActivity.showV1240BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1240: bait level
internal fun PlayerActivity.showV1240BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1240: bake level
internal fun PlayerActivity.showV1240BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1240: ball mode
internal fun PlayerActivity.showV1240BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1240ball
    FeaturePrefsStore.batch1231.v1240ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1240: ban mode
internal fun PlayerActivity.showV1240BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1240ban
    FeaturePrefsStore.batch1231.v1240ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1240: band mode
internal fun PlayerActivity.showV1240BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1240band
    FeaturePrefsStore.batch1231.v1240band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1240: bank mode
internal fun PlayerActivity.showV1240BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1240bank
    FeaturePrefsStore.batch1231.v1240bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1240: bar mode
internal fun PlayerActivity.showV1240BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1240bar
    FeaturePrefsStore.batch1231.v1240bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

