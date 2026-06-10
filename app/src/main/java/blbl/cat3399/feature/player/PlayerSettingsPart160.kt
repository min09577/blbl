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

