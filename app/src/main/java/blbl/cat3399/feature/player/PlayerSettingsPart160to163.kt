package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1781: sea mode
internal fun PlayerActivity.showV1781SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1781sea
    FeaturePrefsStore.batch1781.v1781sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1781: season mode
internal fun PlayerActivity.showV1781SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1781season
    FeaturePrefsStore.batch1781.v1781season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1781: seat mode
internal fun PlayerActivity.showV1781SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1781seat
    FeaturePrefsStore.batch1781.v1781seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1781: second mode
internal fun PlayerActivity.showV1781SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1781second
    FeaturePrefsStore.batch1781.v1781second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1781: secret mode
internal fun PlayerActivity.showV1781SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1781secret
    FeaturePrefsStore.batch1781.v1781secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1781: security level
internal fun PlayerActivity.showV1781SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1781security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1781security = value
        AppToast.show(this, "security: $value")
    }
}

// v1781: seed level
internal fun PlayerActivity.showV1781SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1781seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1781seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1781: sell level
internal fun PlayerActivity.showV1781SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1781sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1781sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1781: seminar level
internal fun PlayerActivity.showV1781SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1781seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1781seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1781: senior level
internal fun PlayerActivity.showV1781SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1781senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1781senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1781: sense mode
internal fun PlayerActivity.showV1781SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1781sense
    FeaturePrefsStore.batch1781.v1781sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1781: sentence mode
internal fun PlayerActivity.showV1781SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1781sentence
    FeaturePrefsStore.batch1781.v1781sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1781: series mode
internal fun PlayerActivity.showV1781SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1781series
    FeaturePrefsStore.batch1781.v1781series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1781: settle mode
internal fun PlayerActivity.showV1781SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1781settle
    FeaturePrefsStore.batch1781.v1781settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1781: seven mode
internal fun PlayerActivity.showV1781SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1781seven
    FeaturePrefsStore.batch1781.v1781seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1782: sea mode
internal fun PlayerActivity.showV1782SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1782sea
    FeaturePrefsStore.batch1781.v1782sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1782: season mode
internal fun PlayerActivity.showV1782SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1782season
    FeaturePrefsStore.batch1781.v1782season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1782: seat mode
internal fun PlayerActivity.showV1782SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1782seat
    FeaturePrefsStore.batch1781.v1782seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1782: second mode
internal fun PlayerActivity.showV1782SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1782second
    FeaturePrefsStore.batch1781.v1782second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1782: secret mode
internal fun PlayerActivity.showV1782SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1782secret
    FeaturePrefsStore.batch1781.v1782secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1782: security level
internal fun PlayerActivity.showV1782SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1782security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1782security = value
        AppToast.show(this, "security: $value")
    }
}

// v1782: seed level
internal fun PlayerActivity.showV1782SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1782seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1782seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1782: sell level
internal fun PlayerActivity.showV1782SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1782sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1782sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1782: seminar level
internal fun PlayerActivity.showV1782SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1782seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1782seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1782: senior level
internal fun PlayerActivity.showV1782SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1782senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1782senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1782: sense mode
internal fun PlayerActivity.showV1782SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1782sense
    FeaturePrefsStore.batch1781.v1782sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1782: sentence mode
internal fun PlayerActivity.showV1782SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1782sentence
    FeaturePrefsStore.batch1781.v1782sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1782: series mode
internal fun PlayerActivity.showV1782SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1782series
    FeaturePrefsStore.batch1781.v1782series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1782: settle mode
internal fun PlayerActivity.showV1782SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1782settle
    FeaturePrefsStore.batch1781.v1782settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1782: seven mode
internal fun PlayerActivity.showV1782SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1782seven
    FeaturePrefsStore.batch1781.v1782seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1783: sea mode
internal fun PlayerActivity.showV1783SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1783sea
    FeaturePrefsStore.batch1781.v1783sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1783: season mode
internal fun PlayerActivity.showV1783SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1783season
    FeaturePrefsStore.batch1781.v1783season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1783: seat mode
internal fun PlayerActivity.showV1783SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1783seat
    FeaturePrefsStore.batch1781.v1783seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1783: second mode
internal fun PlayerActivity.showV1783SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1783second
    FeaturePrefsStore.batch1781.v1783second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1783: secret mode
internal fun PlayerActivity.showV1783SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1783secret
    FeaturePrefsStore.batch1781.v1783secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1783: security level
internal fun PlayerActivity.showV1783SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1783security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1783security = value
        AppToast.show(this, "security: $value")
    }
}

// v1783: seed level
internal fun PlayerActivity.showV1783SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1783seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1783seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1783: sell level
internal fun PlayerActivity.showV1783SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1783sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1783sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1783: seminar level
internal fun PlayerActivity.showV1783SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1783seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1783seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1783: senior level
internal fun PlayerActivity.showV1783SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1783senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1783senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1783: sense mode
internal fun PlayerActivity.showV1783SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1783sense
    FeaturePrefsStore.batch1781.v1783sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1783: sentence mode
internal fun PlayerActivity.showV1783SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1783sentence
    FeaturePrefsStore.batch1781.v1783sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1783: series mode
internal fun PlayerActivity.showV1783SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1783series
    FeaturePrefsStore.batch1781.v1783series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1783: settle mode
internal fun PlayerActivity.showV1783SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1783settle
    FeaturePrefsStore.batch1781.v1783settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1783: seven mode
internal fun PlayerActivity.showV1783SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1783seven
    FeaturePrefsStore.batch1781.v1783seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1784: sea mode
internal fun PlayerActivity.showV1784SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1784sea
    FeaturePrefsStore.batch1781.v1784sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1784: season mode
internal fun PlayerActivity.showV1784SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1784season
    FeaturePrefsStore.batch1781.v1784season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1784: seat mode
internal fun PlayerActivity.showV1784SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1784seat
    FeaturePrefsStore.batch1781.v1784seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1784: second mode
internal fun PlayerActivity.showV1784SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1784second
    FeaturePrefsStore.batch1781.v1784second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1784: secret mode
internal fun PlayerActivity.showV1784SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1784secret
    FeaturePrefsStore.batch1781.v1784secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1784: security level
internal fun PlayerActivity.showV1784SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1784security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1784security = value
        AppToast.show(this, "security: $value")
    }
}

// v1784: seed level
internal fun PlayerActivity.showV1784SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1784seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1784seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1784: sell level
internal fun PlayerActivity.showV1784SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1784sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1784sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1784: seminar level
internal fun PlayerActivity.showV1784SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1784seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1784seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1784: senior level
internal fun PlayerActivity.showV1784SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1784senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1784senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1784: sense mode
internal fun PlayerActivity.showV1784SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1784sense
    FeaturePrefsStore.batch1781.v1784sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1784: sentence mode
internal fun PlayerActivity.showV1784SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1784sentence
    FeaturePrefsStore.batch1781.v1784sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1784: series mode
internal fun PlayerActivity.showV1784SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1784series
    FeaturePrefsStore.batch1781.v1784series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1784: settle mode
internal fun PlayerActivity.showV1784SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1784settle
    FeaturePrefsStore.batch1781.v1784settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1784: seven mode
internal fun PlayerActivity.showV1784SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1784seven
    FeaturePrefsStore.batch1781.v1784seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1785: sea mode
internal fun PlayerActivity.showV1785SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1785sea
    FeaturePrefsStore.batch1781.v1785sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1785: season mode
internal fun PlayerActivity.showV1785SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1785season
    FeaturePrefsStore.batch1781.v1785season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1785: seat mode
internal fun PlayerActivity.showV1785SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1785seat
    FeaturePrefsStore.batch1781.v1785seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1785: second mode
internal fun PlayerActivity.showV1785SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1785second
    FeaturePrefsStore.batch1781.v1785second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1785: secret mode
internal fun PlayerActivity.showV1785SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1785secret
    FeaturePrefsStore.batch1781.v1785secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1785: security level
internal fun PlayerActivity.showV1785SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1785security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1785security = value
        AppToast.show(this, "security: $value")
    }
}

// v1785: seed level
internal fun PlayerActivity.showV1785SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1785seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1785seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1785: sell level
internal fun PlayerActivity.showV1785SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1785sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1785sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1785: seminar level
internal fun PlayerActivity.showV1785SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1785seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1785seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1785: senior level
internal fun PlayerActivity.showV1785SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1785senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1785senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1785: sense mode
internal fun PlayerActivity.showV1785SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1785sense
    FeaturePrefsStore.batch1781.v1785sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1785: sentence mode
internal fun PlayerActivity.showV1785SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1785sentence
    FeaturePrefsStore.batch1781.v1785sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1785: series mode
internal fun PlayerActivity.showV1785SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1785series
    FeaturePrefsStore.batch1781.v1785series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1785: settle mode
internal fun PlayerActivity.showV1785SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1785settle
    FeaturePrefsStore.batch1781.v1785settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1785: seven mode
internal fun PlayerActivity.showV1785SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1785seven
    FeaturePrefsStore.batch1781.v1785seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1786: sea mode
internal fun PlayerActivity.showV1786SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1786sea
    FeaturePrefsStore.batch1781.v1786sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1786: season mode
internal fun PlayerActivity.showV1786SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1786season
    FeaturePrefsStore.batch1781.v1786season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1786: seat mode
internal fun PlayerActivity.showV1786SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1786seat
    FeaturePrefsStore.batch1781.v1786seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1786: second mode
internal fun PlayerActivity.showV1786SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1786second
    FeaturePrefsStore.batch1781.v1786second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1786: secret mode
internal fun PlayerActivity.showV1786SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1786secret
    FeaturePrefsStore.batch1781.v1786secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1786: security level
internal fun PlayerActivity.showV1786SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1786security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1786security = value
        AppToast.show(this, "security: $value")
    }
}

// v1786: seed level
internal fun PlayerActivity.showV1786SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1786seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1786seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1786: sell level
internal fun PlayerActivity.showV1786SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1786sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1786sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1786: seminar level
internal fun PlayerActivity.showV1786SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1786seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1786seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1786: senior level
internal fun PlayerActivity.showV1786SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1786senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1786senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1786: sense mode
internal fun PlayerActivity.showV1786SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1786sense
    FeaturePrefsStore.batch1781.v1786sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1786: sentence mode
internal fun PlayerActivity.showV1786SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1786sentence
    FeaturePrefsStore.batch1781.v1786sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1786: series mode
internal fun PlayerActivity.showV1786SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1786series
    FeaturePrefsStore.batch1781.v1786series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1786: settle mode
internal fun PlayerActivity.showV1786SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1786settle
    FeaturePrefsStore.batch1781.v1786settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1786: seven mode
internal fun PlayerActivity.showV1786SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1786seven
    FeaturePrefsStore.batch1781.v1786seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1787: sea mode
internal fun PlayerActivity.showV1787SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1787sea
    FeaturePrefsStore.batch1781.v1787sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1787: season mode
internal fun PlayerActivity.showV1787SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1787season
    FeaturePrefsStore.batch1781.v1787season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1787: seat mode
internal fun PlayerActivity.showV1787SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1787seat
    FeaturePrefsStore.batch1781.v1787seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1787: second mode
internal fun PlayerActivity.showV1787SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1787second
    FeaturePrefsStore.batch1781.v1787second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1787: secret mode
internal fun PlayerActivity.showV1787SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1787secret
    FeaturePrefsStore.batch1781.v1787secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1787: security level
internal fun PlayerActivity.showV1787SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1787security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1787security = value
        AppToast.show(this, "security: $value")
    }
}

// v1787: seed level
internal fun PlayerActivity.showV1787SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1787seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1787seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1787: sell level
internal fun PlayerActivity.showV1787SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1787sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1787sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1787: seminar level
internal fun PlayerActivity.showV1787SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1787seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1787seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1787: senior level
internal fun PlayerActivity.showV1787SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1787senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1787senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1787: sense mode
internal fun PlayerActivity.showV1787SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1787sense
    FeaturePrefsStore.batch1781.v1787sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1787: sentence mode
internal fun PlayerActivity.showV1787SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1787sentence
    FeaturePrefsStore.batch1781.v1787sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1787: series mode
internal fun PlayerActivity.showV1787SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1787series
    FeaturePrefsStore.batch1781.v1787series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1787: settle mode
internal fun PlayerActivity.showV1787SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1787settle
    FeaturePrefsStore.batch1781.v1787settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1787: seven mode
internal fun PlayerActivity.showV1787SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1787seven
    FeaturePrefsStore.batch1781.v1787seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1788: sea mode
internal fun PlayerActivity.showV1788SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1788sea
    FeaturePrefsStore.batch1781.v1788sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1788: season mode
internal fun PlayerActivity.showV1788SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1788season
    FeaturePrefsStore.batch1781.v1788season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1788: seat mode
internal fun PlayerActivity.showV1788SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1788seat
    FeaturePrefsStore.batch1781.v1788seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1788: second mode
internal fun PlayerActivity.showV1788SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1788second
    FeaturePrefsStore.batch1781.v1788second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1788: secret mode
internal fun PlayerActivity.showV1788SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1788secret
    FeaturePrefsStore.batch1781.v1788secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1788: security level
internal fun PlayerActivity.showV1788SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1788security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1788security = value
        AppToast.show(this, "security: $value")
    }
}

// v1788: seed level
internal fun PlayerActivity.showV1788SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1788seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1788seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1788: sell level
internal fun PlayerActivity.showV1788SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1788sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1788sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1788: seminar level
internal fun PlayerActivity.showV1788SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1788seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1788seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1788: senior level
internal fun PlayerActivity.showV1788SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1788senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1788senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1788: sense mode
internal fun PlayerActivity.showV1788SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1788sense
    FeaturePrefsStore.batch1781.v1788sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1788: sentence mode
internal fun PlayerActivity.showV1788SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1788sentence
    FeaturePrefsStore.batch1781.v1788sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1788: series mode
internal fun PlayerActivity.showV1788SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1788series
    FeaturePrefsStore.batch1781.v1788series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1788: settle mode
internal fun PlayerActivity.showV1788SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1788settle
    FeaturePrefsStore.batch1781.v1788settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1788: seven mode
internal fun PlayerActivity.showV1788SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1788seven
    FeaturePrefsStore.batch1781.v1788seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1789: sea mode
internal fun PlayerActivity.showV1789SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1789sea
    FeaturePrefsStore.batch1781.v1789sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1789: season mode
internal fun PlayerActivity.showV1789SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1789season
    FeaturePrefsStore.batch1781.v1789season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1789: seat mode
internal fun PlayerActivity.showV1789SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1789seat
    FeaturePrefsStore.batch1781.v1789seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1789: second mode
internal fun PlayerActivity.showV1789SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1789second
    FeaturePrefsStore.batch1781.v1789second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1789: secret mode
internal fun PlayerActivity.showV1789SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1789secret
    FeaturePrefsStore.batch1781.v1789secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1789: security level
internal fun PlayerActivity.showV1789SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1789security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1789security = value
        AppToast.show(this, "security: $value")
    }
}

// v1789: seed level
internal fun PlayerActivity.showV1789SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1789seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1789seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1789: sell level
internal fun PlayerActivity.showV1789SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1789sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1789sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1789: seminar level
internal fun PlayerActivity.showV1789SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1789seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1789seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1789: senior level
internal fun PlayerActivity.showV1789SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1789senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1789senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1789: sense mode
internal fun PlayerActivity.showV1789SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1789sense
    FeaturePrefsStore.batch1781.v1789sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1789: sentence mode
internal fun PlayerActivity.showV1789SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1789sentence
    FeaturePrefsStore.batch1781.v1789sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1789: series mode
internal fun PlayerActivity.showV1789SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1789series
    FeaturePrefsStore.batch1781.v1789series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1789: settle mode
internal fun PlayerActivity.showV1789SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1789settle
    FeaturePrefsStore.batch1781.v1789settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1789: seven mode
internal fun PlayerActivity.showV1789SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1789seven
    FeaturePrefsStore.batch1781.v1789seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

// v1790: sea mode
internal fun PlayerActivity.showV1790SeaToggle() {
    val current = FeaturePrefsStore.batch1781.v1790sea
    FeaturePrefsStore.batch1781.v1790sea = !current
    AppToast.show(this, "sea: ${if (!current) "ON" else "OFF"}")
}

// v1790: season mode
internal fun PlayerActivity.showV1790SeasonToggle() {
    val current = FeaturePrefsStore.batch1781.v1790season
    FeaturePrefsStore.batch1781.v1790season = !current
    AppToast.show(this, "season: ${if (!current) "ON" else "OFF"}")
}

// v1790: seat mode
internal fun PlayerActivity.showV1790SeatToggle() {
    val current = FeaturePrefsStore.batch1781.v1790seat
    FeaturePrefsStore.batch1781.v1790seat = !current
    AppToast.show(this, "seat: ${if (!current) "ON" else "OFF"}")
}

// v1790: second mode
internal fun PlayerActivity.showV1790SecondToggle() {
    val current = FeaturePrefsStore.batch1781.v1790second
    FeaturePrefsStore.batch1781.v1790second = !current
    AppToast.show(this, "second: ${if (!current) "ON" else "OFF"}")
}

// v1790: secret mode
internal fun PlayerActivity.showV1790SecretToggle() {
    val current = FeaturePrefsStore.batch1781.v1790secret
    FeaturePrefsStore.batch1781.v1790secret = !current
    AppToast.show(this, "secret: ${if (!current) "ON" else "OFF"}")
}

// v1790: security level
internal fun PlayerActivity.showV1790SecurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1790security).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "security level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1790security = value
        AppToast.show(this, "security: $value")
    }
}

// v1790: seed level
internal fun PlayerActivity.showV1790SeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1790seed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1790seed = value
        AppToast.show(this, "seed: $value")
    }
}

// v1790: sell level
internal fun PlayerActivity.showV1790SellDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1790sell).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sell level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1790sell = value
        AppToast.show(this, "sell: $value")
    }
}

// v1790: seminar level
internal fun PlayerActivity.showV1790SeminarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1790seminar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "seminar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1790seminar = value
        AppToast.show(this, "seminar: $value")
    }
}

// v1790: senior level
internal fun PlayerActivity.showV1790SeniorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1781.v1790senior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "senior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1781.v1790senior = value
        AppToast.show(this, "senior: $value")
    }
}

// v1790: sense mode
internal fun PlayerActivity.showV1790SenseToggle() {
    val current = FeaturePrefsStore.batch1781.v1790sense
    FeaturePrefsStore.batch1781.v1790sense = !current
    AppToast.show(this, "sense: ${if (!current) "ON" else "OFF"}")
}

// v1790: sentence mode
internal fun PlayerActivity.showV1790SentenceToggle() {
    val current = FeaturePrefsStore.batch1781.v1790sentence
    FeaturePrefsStore.batch1781.v1790sentence = !current
    AppToast.show(this, "sentence: ${if (!current) "ON" else "OFF"}")
}

// v1790: series mode
internal fun PlayerActivity.showV1790SeriesToggle() {
    val current = FeaturePrefsStore.batch1781.v1790series
    FeaturePrefsStore.batch1781.v1790series = !current
    AppToast.show(this, "series: ${if (!current) "ON" else "OFF"}")
}

// v1790: settle mode
internal fun PlayerActivity.showV1790SettleToggle() {
    val current = FeaturePrefsStore.batch1781.v1790settle
    FeaturePrefsStore.batch1781.v1790settle = !current
    AppToast.show(this, "settle: ${if (!current) "ON" else "OFF"}")
}

// v1790: seven mode
internal fun PlayerActivity.showV1790SevenToggle() {
    val current = FeaturePrefsStore.batch1781.v1790seven
    FeaturePrefsStore.batch1781.v1790seven = !current
    AppToast.show(this, "seven: ${if (!current) "ON" else "OFF"}")
}

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

// v1801: aboveboard mode
internal fun PlayerActivity.showV1801AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1801aboveboard
    FeaturePrefsStore.batch1801.v1801aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1801: absent mode
internal fun PlayerActivity.showV1801AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1801absent
    FeaturePrefsStore.batch1801.v1801absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1801: abstract mode
internal fun PlayerActivity.showV1801AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1801abstract
    FeaturePrefsStore.batch1801.v1801abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1801: absurd mode
internal fun PlayerActivity.showV1801AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1801absurd
    FeaturePrefsStore.batch1801.v1801absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1801: accented mode
internal fun PlayerActivity.showV1801AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801accented
    FeaturePrefsStore.batch1801.v1801accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1801: accepted level
internal fun PlayerActivity.showV1801AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1801: accomplish level
internal fun PlayerActivity.showV1801AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1801: accorded level
internal fun PlayerActivity.showV1801AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1801: accounted level
internal fun PlayerActivity.showV1801AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1801: achieved level
internal fun PlayerActivity.showV1801AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1801: acknowledged mode
internal fun PlayerActivity.showV1801AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801acknowledged
    FeaturePrefsStore.batch1801.v1801acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1801: acquired mode
internal fun PlayerActivity.showV1801AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1801acquired
    FeaturePrefsStore.batch1801.v1801acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1801: activated mode
internal fun PlayerActivity.showV1801ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801activated
    FeaturePrefsStore.batch1801.v1801activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1801: adapted mode
internal fun PlayerActivity.showV1801AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801adapted
    FeaturePrefsStore.batch1801.v1801adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1801: added mode
internal fun PlayerActivity.showV1801AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801added
    FeaturePrefsStore.batch1801.v1801added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1802: aboveboard mode
internal fun PlayerActivity.showV1802AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1802aboveboard
    FeaturePrefsStore.batch1801.v1802aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1802: absent mode
internal fun PlayerActivity.showV1802AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1802absent
    FeaturePrefsStore.batch1801.v1802absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1802: abstract mode
internal fun PlayerActivity.showV1802AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1802abstract
    FeaturePrefsStore.batch1801.v1802abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1802: absurd mode
internal fun PlayerActivity.showV1802AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1802absurd
    FeaturePrefsStore.batch1801.v1802absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1802: accented mode
internal fun PlayerActivity.showV1802AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802accented
    FeaturePrefsStore.batch1801.v1802accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1802: accepted level
internal fun PlayerActivity.showV1802AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1802: accomplish level
internal fun PlayerActivity.showV1802AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1802: accorded level
internal fun PlayerActivity.showV1802AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1802: accounted level
internal fun PlayerActivity.showV1802AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1802: achieved level
internal fun PlayerActivity.showV1802AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1802: acknowledged mode
internal fun PlayerActivity.showV1802AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802acknowledged
    FeaturePrefsStore.batch1801.v1802acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1802: acquired mode
internal fun PlayerActivity.showV1802AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1802acquired
    FeaturePrefsStore.batch1801.v1802acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1802: activated mode
internal fun PlayerActivity.showV1802ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802activated
    FeaturePrefsStore.batch1801.v1802activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1802: adapted mode
internal fun PlayerActivity.showV1802AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802adapted
    FeaturePrefsStore.batch1801.v1802adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1802: added mode
internal fun PlayerActivity.showV1802AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802added
    FeaturePrefsStore.batch1801.v1802added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1803: aboveboard mode
internal fun PlayerActivity.showV1803AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1803aboveboard
    FeaturePrefsStore.batch1801.v1803aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1803: absent mode
internal fun PlayerActivity.showV1803AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1803absent
    FeaturePrefsStore.batch1801.v1803absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1803: abstract mode
internal fun PlayerActivity.showV1803AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1803abstract
    FeaturePrefsStore.batch1801.v1803abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1803: absurd mode
internal fun PlayerActivity.showV1803AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1803absurd
    FeaturePrefsStore.batch1801.v1803absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1803: accented mode
internal fun PlayerActivity.showV1803AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803accented
    FeaturePrefsStore.batch1801.v1803accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1803: accepted level
internal fun PlayerActivity.showV1803AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1803: accomplish level
internal fun PlayerActivity.showV1803AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1803: accorded level
internal fun PlayerActivity.showV1803AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1803: accounted level
internal fun PlayerActivity.showV1803AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1803: achieved level
internal fun PlayerActivity.showV1803AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1803: acknowledged mode
internal fun PlayerActivity.showV1803AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803acknowledged
    FeaturePrefsStore.batch1801.v1803acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1803: acquired mode
internal fun PlayerActivity.showV1803AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1803acquired
    FeaturePrefsStore.batch1801.v1803acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1803: activated mode
internal fun PlayerActivity.showV1803ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803activated
    FeaturePrefsStore.batch1801.v1803activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1803: adapted mode
internal fun PlayerActivity.showV1803AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803adapted
    FeaturePrefsStore.batch1801.v1803adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1803: added mode
internal fun PlayerActivity.showV1803AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803added
    FeaturePrefsStore.batch1801.v1803added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1804: aboveboard mode
internal fun PlayerActivity.showV1804AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1804aboveboard
    FeaturePrefsStore.batch1801.v1804aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1804: absent mode
internal fun PlayerActivity.showV1804AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1804absent
    FeaturePrefsStore.batch1801.v1804absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1804: abstract mode
internal fun PlayerActivity.showV1804AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1804abstract
    FeaturePrefsStore.batch1801.v1804abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1804: absurd mode
internal fun PlayerActivity.showV1804AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1804absurd
    FeaturePrefsStore.batch1801.v1804absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1804: accented mode
internal fun PlayerActivity.showV1804AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804accented
    FeaturePrefsStore.batch1801.v1804accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1804: accepted level
internal fun PlayerActivity.showV1804AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1804: accomplish level
internal fun PlayerActivity.showV1804AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1804: accorded level
internal fun PlayerActivity.showV1804AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1804: accounted level
internal fun PlayerActivity.showV1804AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1804: achieved level
internal fun PlayerActivity.showV1804AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1804: acknowledged mode
internal fun PlayerActivity.showV1804AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804acknowledged
    FeaturePrefsStore.batch1801.v1804acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1804: acquired mode
internal fun PlayerActivity.showV1804AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1804acquired
    FeaturePrefsStore.batch1801.v1804acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1804: activated mode
internal fun PlayerActivity.showV1804ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804activated
    FeaturePrefsStore.batch1801.v1804activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1804: adapted mode
internal fun PlayerActivity.showV1804AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804adapted
    FeaturePrefsStore.batch1801.v1804adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1804: added mode
internal fun PlayerActivity.showV1804AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804added
    FeaturePrefsStore.batch1801.v1804added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1805: aboveboard mode
internal fun PlayerActivity.showV1805AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1805aboveboard
    FeaturePrefsStore.batch1801.v1805aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1805: absent mode
internal fun PlayerActivity.showV1805AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1805absent
    FeaturePrefsStore.batch1801.v1805absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1805: abstract mode
internal fun PlayerActivity.showV1805AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1805abstract
    FeaturePrefsStore.batch1801.v1805abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1805: absurd mode
internal fun PlayerActivity.showV1805AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1805absurd
    FeaturePrefsStore.batch1801.v1805absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1805: accented mode
internal fun PlayerActivity.showV1805AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805accented
    FeaturePrefsStore.batch1801.v1805accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1805: accepted level
internal fun PlayerActivity.showV1805AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1805: accomplish level
internal fun PlayerActivity.showV1805AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1805: accorded level
internal fun PlayerActivity.showV1805AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1805: accounted level
internal fun PlayerActivity.showV1805AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1805: achieved level
internal fun PlayerActivity.showV1805AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1805: acknowledged mode
internal fun PlayerActivity.showV1805AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805acknowledged
    FeaturePrefsStore.batch1801.v1805acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1805: acquired mode
internal fun PlayerActivity.showV1805AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1805acquired
    FeaturePrefsStore.batch1801.v1805acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1805: activated mode
internal fun PlayerActivity.showV1805ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805activated
    FeaturePrefsStore.batch1801.v1805activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1805: adapted mode
internal fun PlayerActivity.showV1805AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805adapted
    FeaturePrefsStore.batch1801.v1805adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1805: added mode
internal fun PlayerActivity.showV1805AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805added
    FeaturePrefsStore.batch1801.v1805added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1806: aboveboard mode
internal fun PlayerActivity.showV1806AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1806aboveboard
    FeaturePrefsStore.batch1801.v1806aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1806: absent mode
internal fun PlayerActivity.showV1806AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1806absent
    FeaturePrefsStore.batch1801.v1806absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1806: abstract mode
internal fun PlayerActivity.showV1806AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1806abstract
    FeaturePrefsStore.batch1801.v1806abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1806: absurd mode
internal fun PlayerActivity.showV1806AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1806absurd
    FeaturePrefsStore.batch1801.v1806absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1806: accented mode
internal fun PlayerActivity.showV1806AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806accented
    FeaturePrefsStore.batch1801.v1806accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1806: accepted level
internal fun PlayerActivity.showV1806AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1806: accomplish level
internal fun PlayerActivity.showV1806AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1806: accorded level
internal fun PlayerActivity.showV1806AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1806: accounted level
internal fun PlayerActivity.showV1806AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1806: achieved level
internal fun PlayerActivity.showV1806AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1806: acknowledged mode
internal fun PlayerActivity.showV1806AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806acknowledged
    FeaturePrefsStore.batch1801.v1806acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1806: acquired mode
internal fun PlayerActivity.showV1806AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1806acquired
    FeaturePrefsStore.batch1801.v1806acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1806: activated mode
internal fun PlayerActivity.showV1806ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806activated
    FeaturePrefsStore.batch1801.v1806activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1806: adapted mode
internal fun PlayerActivity.showV1806AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806adapted
    FeaturePrefsStore.batch1801.v1806adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1806: added mode
internal fun PlayerActivity.showV1806AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806added
    FeaturePrefsStore.batch1801.v1806added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1807: aboveboard mode
internal fun PlayerActivity.showV1807AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1807aboveboard
    FeaturePrefsStore.batch1801.v1807aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1807: absent mode
internal fun PlayerActivity.showV1807AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1807absent
    FeaturePrefsStore.batch1801.v1807absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1807: abstract mode
internal fun PlayerActivity.showV1807AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1807abstract
    FeaturePrefsStore.batch1801.v1807abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1807: absurd mode
internal fun PlayerActivity.showV1807AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1807absurd
    FeaturePrefsStore.batch1801.v1807absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1807: accented mode
internal fun PlayerActivity.showV1807AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807accented
    FeaturePrefsStore.batch1801.v1807accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1807: accepted level
internal fun PlayerActivity.showV1807AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1807: accomplish level
internal fun PlayerActivity.showV1807AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1807: accorded level
internal fun PlayerActivity.showV1807AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1807: accounted level
internal fun PlayerActivity.showV1807AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1807: achieved level
internal fun PlayerActivity.showV1807AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1807: acknowledged mode
internal fun PlayerActivity.showV1807AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807acknowledged
    FeaturePrefsStore.batch1801.v1807acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1807: acquired mode
internal fun PlayerActivity.showV1807AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1807acquired
    FeaturePrefsStore.batch1801.v1807acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1807: activated mode
internal fun PlayerActivity.showV1807ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807activated
    FeaturePrefsStore.batch1801.v1807activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1807: adapted mode
internal fun PlayerActivity.showV1807AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807adapted
    FeaturePrefsStore.batch1801.v1807adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1807: added mode
internal fun PlayerActivity.showV1807AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807added
    FeaturePrefsStore.batch1801.v1807added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1808: aboveboard mode
internal fun PlayerActivity.showV1808AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1808aboveboard
    FeaturePrefsStore.batch1801.v1808aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1808: absent mode
internal fun PlayerActivity.showV1808AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1808absent
    FeaturePrefsStore.batch1801.v1808absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1808: abstract mode
internal fun PlayerActivity.showV1808AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1808abstract
    FeaturePrefsStore.batch1801.v1808abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1808: absurd mode
internal fun PlayerActivity.showV1808AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1808absurd
    FeaturePrefsStore.batch1801.v1808absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1808: accented mode
internal fun PlayerActivity.showV1808AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808accented
    FeaturePrefsStore.batch1801.v1808accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1808: accepted level
internal fun PlayerActivity.showV1808AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1808: accomplish level
internal fun PlayerActivity.showV1808AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1808: accorded level
internal fun PlayerActivity.showV1808AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1808: accounted level
internal fun PlayerActivity.showV1808AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1808: achieved level
internal fun PlayerActivity.showV1808AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1808: acknowledged mode
internal fun PlayerActivity.showV1808AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808acknowledged
    FeaturePrefsStore.batch1801.v1808acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1808: acquired mode
internal fun PlayerActivity.showV1808AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1808acquired
    FeaturePrefsStore.batch1801.v1808acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1808: activated mode
internal fun PlayerActivity.showV1808ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808activated
    FeaturePrefsStore.batch1801.v1808activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1808: adapted mode
internal fun PlayerActivity.showV1808AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808adapted
    FeaturePrefsStore.batch1801.v1808adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1808: added mode
internal fun PlayerActivity.showV1808AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808added
    FeaturePrefsStore.batch1801.v1808added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1809: aboveboard mode
internal fun PlayerActivity.showV1809AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1809aboveboard
    FeaturePrefsStore.batch1801.v1809aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1809: absent mode
internal fun PlayerActivity.showV1809AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1809absent
    FeaturePrefsStore.batch1801.v1809absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1809: abstract mode
internal fun PlayerActivity.showV1809AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1809abstract
    FeaturePrefsStore.batch1801.v1809abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1809: absurd mode
internal fun PlayerActivity.showV1809AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1809absurd
    FeaturePrefsStore.batch1801.v1809absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1809: accented mode
internal fun PlayerActivity.showV1809AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809accented
    FeaturePrefsStore.batch1801.v1809accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1809: accepted level
internal fun PlayerActivity.showV1809AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1809: accomplish level
internal fun PlayerActivity.showV1809AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1809: accorded level
internal fun PlayerActivity.showV1809AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1809: accounted level
internal fun PlayerActivity.showV1809AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1809: achieved level
internal fun PlayerActivity.showV1809AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1809: acknowledged mode
internal fun PlayerActivity.showV1809AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809acknowledged
    FeaturePrefsStore.batch1801.v1809acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1809: acquired mode
internal fun PlayerActivity.showV1809AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1809acquired
    FeaturePrefsStore.batch1801.v1809acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1809: activated mode
internal fun PlayerActivity.showV1809ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809activated
    FeaturePrefsStore.batch1801.v1809activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1809: adapted mode
internal fun PlayerActivity.showV1809AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809adapted
    FeaturePrefsStore.batch1801.v1809adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1809: added mode
internal fun PlayerActivity.showV1809AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809added
    FeaturePrefsStore.batch1801.v1809added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1810: aboveboard mode
internal fun PlayerActivity.showV1810AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1810aboveboard
    FeaturePrefsStore.batch1801.v1810aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1810: absent mode
internal fun PlayerActivity.showV1810AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1810absent
    FeaturePrefsStore.batch1801.v1810absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1810: abstract mode
internal fun PlayerActivity.showV1810AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1810abstract
    FeaturePrefsStore.batch1801.v1810abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1810: absurd mode
internal fun PlayerActivity.showV1810AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1810absurd
    FeaturePrefsStore.batch1801.v1810absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1810: accented mode
internal fun PlayerActivity.showV1810AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810accented
    FeaturePrefsStore.batch1801.v1810accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1810: accepted level
internal fun PlayerActivity.showV1810AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1810: accomplish level
internal fun PlayerActivity.showV1810AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1810: accorded level
internal fun PlayerActivity.showV1810AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1810: accounted level
internal fun PlayerActivity.showV1810AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1810: achieved level
internal fun PlayerActivity.showV1810AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1810: acknowledged mode
internal fun PlayerActivity.showV1810AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810acknowledged
    FeaturePrefsStore.batch1801.v1810acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1810: acquired mode
internal fun PlayerActivity.showV1810AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1810acquired
    FeaturePrefsStore.batch1801.v1810acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1810: activated mode
internal fun PlayerActivity.showV1810ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810activated
    FeaturePrefsStore.batch1801.v1810activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1810: adapted mode
internal fun PlayerActivity.showV1810AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810adapted
    FeaturePrefsStore.batch1801.v1810adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1810: added mode
internal fun PlayerActivity.showV1810AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810added
    FeaturePrefsStore.batch1801.v1810added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1811: addressed mode
internal fun PlayerActivity.showV1811AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811addressed
    FeaturePrefsStore.batch1811.v1811addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1811: adjusted mode
internal fun PlayerActivity.showV1811AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811adjusted
    FeaturePrefsStore.batch1811.v1811adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1811: advanced mode
internal fun PlayerActivity.showV1811AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811advanced
    FeaturePrefsStore.batch1811.v1811advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1811: affected mode
internal fun PlayerActivity.showV1811AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811affected
    FeaturePrefsStore.batch1811.v1811affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1811: agreed mode
internal fun PlayerActivity.showV1811AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811agreed
    FeaturePrefsStore.batch1811.v1811agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1811: aligned level
internal fun PlayerActivity.showV1811AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1811: allocated level
internal fun PlayerActivity.showV1811AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1811: allowed level
internal fun PlayerActivity.showV1811AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1811: amended level
internal fun PlayerActivity.showV1811AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1811: amplified level
internal fun PlayerActivity.showV1811AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1811: analyzed mode
internal fun PlayerActivity.showV1811AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811analyzed
    FeaturePrefsStore.batch1811.v1811analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1811: announced mode
internal fun PlayerActivity.showV1811AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811announced
    FeaturePrefsStore.batch1811.v1811announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1811: anticipated mode
internal fun PlayerActivity.showV1811AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811anticipated
    FeaturePrefsStore.batch1811.v1811anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1811: applied mode
internal fun PlayerActivity.showV1811AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811applied
    FeaturePrefsStore.batch1811.v1811applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1811: approved mode
internal fun PlayerActivity.showV1811ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811approved
    FeaturePrefsStore.batch1811.v1811approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1812: addressed mode
internal fun PlayerActivity.showV1812AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812addressed
    FeaturePrefsStore.batch1811.v1812addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1812: adjusted mode
internal fun PlayerActivity.showV1812AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812adjusted
    FeaturePrefsStore.batch1811.v1812adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1812: advanced mode
internal fun PlayerActivity.showV1812AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812advanced
    FeaturePrefsStore.batch1811.v1812advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1812: affected mode
internal fun PlayerActivity.showV1812AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812affected
    FeaturePrefsStore.batch1811.v1812affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1812: agreed mode
internal fun PlayerActivity.showV1812AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812agreed
    FeaturePrefsStore.batch1811.v1812agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1812: aligned level
internal fun PlayerActivity.showV1812AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1812: allocated level
internal fun PlayerActivity.showV1812AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1812: allowed level
internal fun PlayerActivity.showV1812AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1812: amended level
internal fun PlayerActivity.showV1812AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1812: amplified level
internal fun PlayerActivity.showV1812AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1812: analyzed mode
internal fun PlayerActivity.showV1812AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812analyzed
    FeaturePrefsStore.batch1811.v1812analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1812: announced mode
internal fun PlayerActivity.showV1812AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812announced
    FeaturePrefsStore.batch1811.v1812announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1812: anticipated mode
internal fun PlayerActivity.showV1812AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812anticipated
    FeaturePrefsStore.batch1811.v1812anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1812: applied mode
internal fun PlayerActivity.showV1812AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812applied
    FeaturePrefsStore.batch1811.v1812applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1812: approved mode
internal fun PlayerActivity.showV1812ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812approved
    FeaturePrefsStore.batch1811.v1812approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1813: addressed mode
internal fun PlayerActivity.showV1813AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813addressed
    FeaturePrefsStore.batch1811.v1813addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1813: adjusted mode
internal fun PlayerActivity.showV1813AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813adjusted
    FeaturePrefsStore.batch1811.v1813adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1813: advanced mode
internal fun PlayerActivity.showV1813AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813advanced
    FeaturePrefsStore.batch1811.v1813advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1813: affected mode
internal fun PlayerActivity.showV1813AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813affected
    FeaturePrefsStore.batch1811.v1813affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1813: agreed mode
internal fun PlayerActivity.showV1813AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813agreed
    FeaturePrefsStore.batch1811.v1813agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1813: aligned level
internal fun PlayerActivity.showV1813AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1813: allocated level
internal fun PlayerActivity.showV1813AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1813: allowed level
internal fun PlayerActivity.showV1813AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1813: amended level
internal fun PlayerActivity.showV1813AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1813: amplified level
internal fun PlayerActivity.showV1813AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1813: analyzed mode
internal fun PlayerActivity.showV1813AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813analyzed
    FeaturePrefsStore.batch1811.v1813analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1813: announced mode
internal fun PlayerActivity.showV1813AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813announced
    FeaturePrefsStore.batch1811.v1813announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1813: anticipated mode
internal fun PlayerActivity.showV1813AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813anticipated
    FeaturePrefsStore.batch1811.v1813anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1813: applied mode
internal fun PlayerActivity.showV1813AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813applied
    FeaturePrefsStore.batch1811.v1813applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1813: approved mode
internal fun PlayerActivity.showV1813ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813approved
    FeaturePrefsStore.batch1811.v1813approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1814: addressed mode
internal fun PlayerActivity.showV1814AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814addressed
    FeaturePrefsStore.batch1811.v1814addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1814: adjusted mode
internal fun PlayerActivity.showV1814AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814adjusted
    FeaturePrefsStore.batch1811.v1814adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1814: advanced mode
internal fun PlayerActivity.showV1814AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814advanced
    FeaturePrefsStore.batch1811.v1814advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1814: affected mode
internal fun PlayerActivity.showV1814AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814affected
    FeaturePrefsStore.batch1811.v1814affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1814: agreed mode
internal fun PlayerActivity.showV1814AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814agreed
    FeaturePrefsStore.batch1811.v1814agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1814: aligned level
internal fun PlayerActivity.showV1814AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1814: allocated level
internal fun PlayerActivity.showV1814AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1814: allowed level
internal fun PlayerActivity.showV1814AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1814: amended level
internal fun PlayerActivity.showV1814AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1814: amplified level
internal fun PlayerActivity.showV1814AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1814: analyzed mode
internal fun PlayerActivity.showV1814AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814analyzed
    FeaturePrefsStore.batch1811.v1814analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1814: announced mode
internal fun PlayerActivity.showV1814AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814announced
    FeaturePrefsStore.batch1811.v1814announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1814: anticipated mode
internal fun PlayerActivity.showV1814AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814anticipated
    FeaturePrefsStore.batch1811.v1814anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1814: applied mode
internal fun PlayerActivity.showV1814AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814applied
    FeaturePrefsStore.batch1811.v1814applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1814: approved mode
internal fun PlayerActivity.showV1814ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814approved
    FeaturePrefsStore.batch1811.v1814approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1815: addressed mode
internal fun PlayerActivity.showV1815AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815addressed
    FeaturePrefsStore.batch1811.v1815addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1815: adjusted mode
internal fun PlayerActivity.showV1815AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815adjusted
    FeaturePrefsStore.batch1811.v1815adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1815: advanced mode
internal fun PlayerActivity.showV1815AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815advanced
    FeaturePrefsStore.batch1811.v1815advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1815: affected mode
internal fun PlayerActivity.showV1815AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815affected
    FeaturePrefsStore.batch1811.v1815affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1815: agreed mode
internal fun PlayerActivity.showV1815AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815agreed
    FeaturePrefsStore.batch1811.v1815agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1815: aligned level
internal fun PlayerActivity.showV1815AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1815: allocated level
internal fun PlayerActivity.showV1815AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1815: allowed level
internal fun PlayerActivity.showV1815AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1815: amended level
internal fun PlayerActivity.showV1815AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1815: amplified level
internal fun PlayerActivity.showV1815AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1815: analyzed mode
internal fun PlayerActivity.showV1815AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815analyzed
    FeaturePrefsStore.batch1811.v1815analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1815: announced mode
internal fun PlayerActivity.showV1815AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815announced
    FeaturePrefsStore.batch1811.v1815announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1815: anticipated mode
internal fun PlayerActivity.showV1815AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815anticipated
    FeaturePrefsStore.batch1811.v1815anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1815: applied mode
internal fun PlayerActivity.showV1815AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815applied
    FeaturePrefsStore.batch1811.v1815applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1815: approved mode
internal fun PlayerActivity.showV1815ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815approved
    FeaturePrefsStore.batch1811.v1815approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1816: addressed mode
internal fun PlayerActivity.showV1816AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816addressed
    FeaturePrefsStore.batch1811.v1816addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1816: adjusted mode
internal fun PlayerActivity.showV1816AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816adjusted
    FeaturePrefsStore.batch1811.v1816adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1816: advanced mode
internal fun PlayerActivity.showV1816AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816advanced
    FeaturePrefsStore.batch1811.v1816advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1816: affected mode
internal fun PlayerActivity.showV1816AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816affected
    FeaturePrefsStore.batch1811.v1816affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1816: agreed mode
internal fun PlayerActivity.showV1816AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816agreed
    FeaturePrefsStore.batch1811.v1816agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1816: aligned level
internal fun PlayerActivity.showV1816AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1816: allocated level
internal fun PlayerActivity.showV1816AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1816: allowed level
internal fun PlayerActivity.showV1816AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1816: amended level
internal fun PlayerActivity.showV1816AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1816: amplified level
internal fun PlayerActivity.showV1816AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1816: analyzed mode
internal fun PlayerActivity.showV1816AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816analyzed
    FeaturePrefsStore.batch1811.v1816analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1816: announced mode
internal fun PlayerActivity.showV1816AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816announced
    FeaturePrefsStore.batch1811.v1816announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1816: anticipated mode
internal fun PlayerActivity.showV1816AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816anticipated
    FeaturePrefsStore.batch1811.v1816anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1816: applied mode
internal fun PlayerActivity.showV1816AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816applied
    FeaturePrefsStore.batch1811.v1816applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1816: approved mode
internal fun PlayerActivity.showV1816ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816approved
    FeaturePrefsStore.batch1811.v1816approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1817: addressed mode
internal fun PlayerActivity.showV1817AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817addressed
    FeaturePrefsStore.batch1811.v1817addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1817: adjusted mode
internal fun PlayerActivity.showV1817AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817adjusted
    FeaturePrefsStore.batch1811.v1817adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1817: advanced mode
internal fun PlayerActivity.showV1817AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817advanced
    FeaturePrefsStore.batch1811.v1817advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1817: affected mode
internal fun PlayerActivity.showV1817AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817affected
    FeaturePrefsStore.batch1811.v1817affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1817: agreed mode
internal fun PlayerActivity.showV1817AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817agreed
    FeaturePrefsStore.batch1811.v1817agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1817: aligned level
internal fun PlayerActivity.showV1817AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1817: allocated level
internal fun PlayerActivity.showV1817AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1817: allowed level
internal fun PlayerActivity.showV1817AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1817: amended level
internal fun PlayerActivity.showV1817AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1817: amplified level
internal fun PlayerActivity.showV1817AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1817: analyzed mode
internal fun PlayerActivity.showV1817AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817analyzed
    FeaturePrefsStore.batch1811.v1817analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1817: announced mode
internal fun PlayerActivity.showV1817AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817announced
    FeaturePrefsStore.batch1811.v1817announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1817: anticipated mode
internal fun PlayerActivity.showV1817AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817anticipated
    FeaturePrefsStore.batch1811.v1817anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1817: applied mode
internal fun PlayerActivity.showV1817AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817applied
    FeaturePrefsStore.batch1811.v1817applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1817: approved mode
internal fun PlayerActivity.showV1817ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817approved
    FeaturePrefsStore.batch1811.v1817approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1818: addressed mode
internal fun PlayerActivity.showV1818AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818addressed
    FeaturePrefsStore.batch1811.v1818addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1818: adjusted mode
internal fun PlayerActivity.showV1818AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818adjusted
    FeaturePrefsStore.batch1811.v1818adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1818: advanced mode
internal fun PlayerActivity.showV1818AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818advanced
    FeaturePrefsStore.batch1811.v1818advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1818: affected mode
internal fun PlayerActivity.showV1818AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818affected
    FeaturePrefsStore.batch1811.v1818affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1818: agreed mode
internal fun PlayerActivity.showV1818AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818agreed
    FeaturePrefsStore.batch1811.v1818agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1818: aligned level
internal fun PlayerActivity.showV1818AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1818: allocated level
internal fun PlayerActivity.showV1818AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1818: allowed level
internal fun PlayerActivity.showV1818AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1818: amended level
internal fun PlayerActivity.showV1818AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1818: amplified level
internal fun PlayerActivity.showV1818AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1818: analyzed mode
internal fun PlayerActivity.showV1818AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818analyzed
    FeaturePrefsStore.batch1811.v1818analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1818: announced mode
internal fun PlayerActivity.showV1818AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818announced
    FeaturePrefsStore.batch1811.v1818announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1818: anticipated mode
internal fun PlayerActivity.showV1818AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818anticipated
    FeaturePrefsStore.batch1811.v1818anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1818: applied mode
internal fun PlayerActivity.showV1818AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818applied
    FeaturePrefsStore.batch1811.v1818applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1818: approved mode
internal fun PlayerActivity.showV1818ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818approved
    FeaturePrefsStore.batch1811.v1818approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1819: addressed mode
internal fun PlayerActivity.showV1819AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819addressed
    FeaturePrefsStore.batch1811.v1819addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1819: adjusted mode
internal fun PlayerActivity.showV1819AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819adjusted
    FeaturePrefsStore.batch1811.v1819adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1819: advanced mode
internal fun PlayerActivity.showV1819AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819advanced
    FeaturePrefsStore.batch1811.v1819advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1819: affected mode
internal fun PlayerActivity.showV1819AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819affected
    FeaturePrefsStore.batch1811.v1819affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1819: agreed mode
internal fun PlayerActivity.showV1819AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819agreed
    FeaturePrefsStore.batch1811.v1819agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1819: aligned level
internal fun PlayerActivity.showV1819AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1819: allocated level
internal fun PlayerActivity.showV1819AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1819: allowed level
internal fun PlayerActivity.showV1819AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1819: amended level
internal fun PlayerActivity.showV1819AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1819: amplified level
internal fun PlayerActivity.showV1819AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1819: analyzed mode
internal fun PlayerActivity.showV1819AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819analyzed
    FeaturePrefsStore.batch1811.v1819analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1819: announced mode
internal fun PlayerActivity.showV1819AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819announced
    FeaturePrefsStore.batch1811.v1819announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1819: anticipated mode
internal fun PlayerActivity.showV1819AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819anticipated
    FeaturePrefsStore.batch1811.v1819anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1819: applied mode
internal fun PlayerActivity.showV1819AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819applied
    FeaturePrefsStore.batch1811.v1819applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1819: approved mode
internal fun PlayerActivity.showV1819ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819approved
    FeaturePrefsStore.batch1811.v1819approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1820: addressed mode
internal fun PlayerActivity.showV1820AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820addressed
    FeaturePrefsStore.batch1811.v1820addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1820: adjusted mode
internal fun PlayerActivity.showV1820AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820adjusted
    FeaturePrefsStore.batch1811.v1820adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1820: advanced mode
internal fun PlayerActivity.showV1820AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820advanced
    FeaturePrefsStore.batch1811.v1820advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1820: affected mode
internal fun PlayerActivity.showV1820AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820affected
    FeaturePrefsStore.batch1811.v1820affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1820: agreed mode
internal fun PlayerActivity.showV1820AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820agreed
    FeaturePrefsStore.batch1811.v1820agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1820: aligned level
internal fun PlayerActivity.showV1820AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1820: allocated level
internal fun PlayerActivity.showV1820AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1820: allowed level
internal fun PlayerActivity.showV1820AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1820: amended level
internal fun PlayerActivity.showV1820AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1820: amplified level
internal fun PlayerActivity.showV1820AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1820: analyzed mode
internal fun PlayerActivity.showV1820AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820analyzed
    FeaturePrefsStore.batch1811.v1820analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1820: announced mode
internal fun PlayerActivity.showV1820AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820announced
    FeaturePrefsStore.batch1811.v1820announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1820: anticipated mode
internal fun PlayerActivity.showV1820AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820anticipated
    FeaturePrefsStore.batch1811.v1820anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1820: applied mode
internal fun PlayerActivity.showV1820AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820applied
    FeaturePrefsStore.batch1811.v1820applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1820: approved mode
internal fun PlayerActivity.showV1820ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820approved
    FeaturePrefsStore.batch1811.v1820approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}
