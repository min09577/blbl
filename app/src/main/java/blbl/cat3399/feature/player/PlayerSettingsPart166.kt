package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1841: blocking mode
internal fun PlayerActivity.showV1841BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841blocking
    FeaturePrefsStore.batch1841.v1841blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1841: blooming mode
internal fun PlayerActivity.showV1841BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841blooming
    FeaturePrefsStore.batch1841.v1841blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1841: boiling mode
internal fun PlayerActivity.showV1841BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841boiling
    FeaturePrefsStore.batch1841.v1841boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1841: bolster mode
internal fun PlayerActivity.showV1841BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bolster
    FeaturePrefsStore.batch1841.v1841bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1841: booking mode
internal fun PlayerActivity.showV1841BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841booking
    FeaturePrefsStore.batch1841.v1841booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1841: boosted level
internal fun PlayerActivity.showV1841BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1841: borrowed level
internal fun PlayerActivity.showV1841BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1841: bothered level
internal fun PlayerActivity.showV1841BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1841: bouncing level
internal fun PlayerActivity.showV1841BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1841: branching level
internal fun PlayerActivity.showV1841BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1841: breathing mode
internal fun PlayerActivity.showV1841BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841breathing
    FeaturePrefsStore.batch1841.v1841breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1841: bridging mode
internal fun PlayerActivity.showV1841BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bridging
    FeaturePrefsStore.batch1841.v1841bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1841: brighten mode
internal fun PlayerActivity.showV1841BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1841brighten
    FeaturePrefsStore.batch1841.v1841brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1841: bringing mode
internal fun PlayerActivity.showV1841BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bringing
    FeaturePrefsStore.batch1841.v1841bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1841: broadcasting mode
internal fun PlayerActivity.showV1841BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841broadcasting
    FeaturePrefsStore.batch1841.v1841broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1842: blocking mode
internal fun PlayerActivity.showV1842BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842blocking
    FeaturePrefsStore.batch1841.v1842blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1842: blooming mode
internal fun PlayerActivity.showV1842BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842blooming
    FeaturePrefsStore.batch1841.v1842blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1842: boiling mode
internal fun PlayerActivity.showV1842BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842boiling
    FeaturePrefsStore.batch1841.v1842boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1842: bolster mode
internal fun PlayerActivity.showV1842BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bolster
    FeaturePrefsStore.batch1841.v1842bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1842: booking mode
internal fun PlayerActivity.showV1842BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842booking
    FeaturePrefsStore.batch1841.v1842booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1842: boosted level
internal fun PlayerActivity.showV1842BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1842: borrowed level
internal fun PlayerActivity.showV1842BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1842: bothered level
internal fun PlayerActivity.showV1842BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1842: bouncing level
internal fun PlayerActivity.showV1842BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1842: branching level
internal fun PlayerActivity.showV1842BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1842: breathing mode
internal fun PlayerActivity.showV1842BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842breathing
    FeaturePrefsStore.batch1841.v1842breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1842: bridging mode
internal fun PlayerActivity.showV1842BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bridging
    FeaturePrefsStore.batch1841.v1842bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1842: brighten mode
internal fun PlayerActivity.showV1842BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1842brighten
    FeaturePrefsStore.batch1841.v1842brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1842: bringing mode
internal fun PlayerActivity.showV1842BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bringing
    FeaturePrefsStore.batch1841.v1842bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1842: broadcasting mode
internal fun PlayerActivity.showV1842BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842broadcasting
    FeaturePrefsStore.batch1841.v1842broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1843: blocking mode
internal fun PlayerActivity.showV1843BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843blocking
    FeaturePrefsStore.batch1841.v1843blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1843: blooming mode
internal fun PlayerActivity.showV1843BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843blooming
    FeaturePrefsStore.batch1841.v1843blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1843: boiling mode
internal fun PlayerActivity.showV1843BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843boiling
    FeaturePrefsStore.batch1841.v1843boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1843: bolster mode
internal fun PlayerActivity.showV1843BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bolster
    FeaturePrefsStore.batch1841.v1843bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1843: booking mode
internal fun PlayerActivity.showV1843BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843booking
    FeaturePrefsStore.batch1841.v1843booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1843: boosted level
internal fun PlayerActivity.showV1843BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1843: borrowed level
internal fun PlayerActivity.showV1843BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1843: bothered level
internal fun PlayerActivity.showV1843BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1843: bouncing level
internal fun PlayerActivity.showV1843BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1843: branching level
internal fun PlayerActivity.showV1843BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1843: breathing mode
internal fun PlayerActivity.showV1843BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843breathing
    FeaturePrefsStore.batch1841.v1843breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1843: bridging mode
internal fun PlayerActivity.showV1843BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bridging
    FeaturePrefsStore.batch1841.v1843bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1843: brighten mode
internal fun PlayerActivity.showV1843BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1843brighten
    FeaturePrefsStore.batch1841.v1843brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1843: bringing mode
internal fun PlayerActivity.showV1843BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bringing
    FeaturePrefsStore.batch1841.v1843bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1843: broadcasting mode
internal fun PlayerActivity.showV1843BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843broadcasting
    FeaturePrefsStore.batch1841.v1843broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1844: blocking mode
internal fun PlayerActivity.showV1844BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844blocking
    FeaturePrefsStore.batch1841.v1844blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1844: blooming mode
internal fun PlayerActivity.showV1844BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844blooming
    FeaturePrefsStore.batch1841.v1844blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1844: boiling mode
internal fun PlayerActivity.showV1844BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844boiling
    FeaturePrefsStore.batch1841.v1844boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1844: bolster mode
internal fun PlayerActivity.showV1844BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bolster
    FeaturePrefsStore.batch1841.v1844bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1844: booking mode
internal fun PlayerActivity.showV1844BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844booking
    FeaturePrefsStore.batch1841.v1844booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1844: boosted level
internal fun PlayerActivity.showV1844BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1844: borrowed level
internal fun PlayerActivity.showV1844BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1844: bothered level
internal fun PlayerActivity.showV1844BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1844: bouncing level
internal fun PlayerActivity.showV1844BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1844: branching level
internal fun PlayerActivity.showV1844BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1844: breathing mode
internal fun PlayerActivity.showV1844BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844breathing
    FeaturePrefsStore.batch1841.v1844breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1844: bridging mode
internal fun PlayerActivity.showV1844BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bridging
    FeaturePrefsStore.batch1841.v1844bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1844: brighten mode
internal fun PlayerActivity.showV1844BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1844brighten
    FeaturePrefsStore.batch1841.v1844brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1844: bringing mode
internal fun PlayerActivity.showV1844BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bringing
    FeaturePrefsStore.batch1841.v1844bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1844: broadcasting mode
internal fun PlayerActivity.showV1844BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844broadcasting
    FeaturePrefsStore.batch1841.v1844broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1845: blocking mode
internal fun PlayerActivity.showV1845BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845blocking
    FeaturePrefsStore.batch1841.v1845blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1845: blooming mode
internal fun PlayerActivity.showV1845BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845blooming
    FeaturePrefsStore.batch1841.v1845blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1845: boiling mode
internal fun PlayerActivity.showV1845BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845boiling
    FeaturePrefsStore.batch1841.v1845boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1845: bolster mode
internal fun PlayerActivity.showV1845BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bolster
    FeaturePrefsStore.batch1841.v1845bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1845: booking mode
internal fun PlayerActivity.showV1845BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845booking
    FeaturePrefsStore.batch1841.v1845booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1845: boosted level
internal fun PlayerActivity.showV1845BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1845: borrowed level
internal fun PlayerActivity.showV1845BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1845: bothered level
internal fun PlayerActivity.showV1845BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1845: bouncing level
internal fun PlayerActivity.showV1845BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1845: branching level
internal fun PlayerActivity.showV1845BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1845: breathing mode
internal fun PlayerActivity.showV1845BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845breathing
    FeaturePrefsStore.batch1841.v1845breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1845: bridging mode
internal fun PlayerActivity.showV1845BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bridging
    FeaturePrefsStore.batch1841.v1845bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1845: brighten mode
internal fun PlayerActivity.showV1845BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1845brighten
    FeaturePrefsStore.batch1841.v1845brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1845: bringing mode
internal fun PlayerActivity.showV1845BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bringing
    FeaturePrefsStore.batch1841.v1845bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1845: broadcasting mode
internal fun PlayerActivity.showV1845BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845broadcasting
    FeaturePrefsStore.batch1841.v1845broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1846: blocking mode
internal fun PlayerActivity.showV1846BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846blocking
    FeaturePrefsStore.batch1841.v1846blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1846: blooming mode
internal fun PlayerActivity.showV1846BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846blooming
    FeaturePrefsStore.batch1841.v1846blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1846: boiling mode
internal fun PlayerActivity.showV1846BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846boiling
    FeaturePrefsStore.batch1841.v1846boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1846: bolster mode
internal fun PlayerActivity.showV1846BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bolster
    FeaturePrefsStore.batch1841.v1846bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1846: booking mode
internal fun PlayerActivity.showV1846BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846booking
    FeaturePrefsStore.batch1841.v1846booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1846: boosted level
internal fun PlayerActivity.showV1846BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1846: borrowed level
internal fun PlayerActivity.showV1846BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1846: bothered level
internal fun PlayerActivity.showV1846BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1846: bouncing level
internal fun PlayerActivity.showV1846BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1846: branching level
internal fun PlayerActivity.showV1846BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1846: breathing mode
internal fun PlayerActivity.showV1846BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846breathing
    FeaturePrefsStore.batch1841.v1846breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1846: bridging mode
internal fun PlayerActivity.showV1846BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bridging
    FeaturePrefsStore.batch1841.v1846bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1846: brighten mode
internal fun PlayerActivity.showV1846BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1846brighten
    FeaturePrefsStore.batch1841.v1846brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1846: bringing mode
internal fun PlayerActivity.showV1846BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bringing
    FeaturePrefsStore.batch1841.v1846bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1846: broadcasting mode
internal fun PlayerActivity.showV1846BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846broadcasting
    FeaturePrefsStore.batch1841.v1846broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1847: blocking mode
internal fun PlayerActivity.showV1847BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847blocking
    FeaturePrefsStore.batch1841.v1847blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1847: blooming mode
internal fun PlayerActivity.showV1847BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847blooming
    FeaturePrefsStore.batch1841.v1847blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1847: boiling mode
internal fun PlayerActivity.showV1847BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847boiling
    FeaturePrefsStore.batch1841.v1847boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1847: bolster mode
internal fun PlayerActivity.showV1847BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bolster
    FeaturePrefsStore.batch1841.v1847bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1847: booking mode
internal fun PlayerActivity.showV1847BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847booking
    FeaturePrefsStore.batch1841.v1847booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1847: boosted level
internal fun PlayerActivity.showV1847BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1847: borrowed level
internal fun PlayerActivity.showV1847BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1847: bothered level
internal fun PlayerActivity.showV1847BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1847: bouncing level
internal fun PlayerActivity.showV1847BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1847: branching level
internal fun PlayerActivity.showV1847BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1847: breathing mode
internal fun PlayerActivity.showV1847BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847breathing
    FeaturePrefsStore.batch1841.v1847breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1847: bridging mode
internal fun PlayerActivity.showV1847BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bridging
    FeaturePrefsStore.batch1841.v1847bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1847: brighten mode
internal fun PlayerActivity.showV1847BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1847brighten
    FeaturePrefsStore.batch1841.v1847brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1847: bringing mode
internal fun PlayerActivity.showV1847BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bringing
    FeaturePrefsStore.batch1841.v1847bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1847: broadcasting mode
internal fun PlayerActivity.showV1847BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847broadcasting
    FeaturePrefsStore.batch1841.v1847broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1848: blocking mode
internal fun PlayerActivity.showV1848BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848blocking
    FeaturePrefsStore.batch1841.v1848blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1848: blooming mode
internal fun PlayerActivity.showV1848BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848blooming
    FeaturePrefsStore.batch1841.v1848blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1848: boiling mode
internal fun PlayerActivity.showV1848BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848boiling
    FeaturePrefsStore.batch1841.v1848boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1848: bolster mode
internal fun PlayerActivity.showV1848BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bolster
    FeaturePrefsStore.batch1841.v1848bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1848: booking mode
internal fun PlayerActivity.showV1848BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848booking
    FeaturePrefsStore.batch1841.v1848booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1848: boosted level
internal fun PlayerActivity.showV1848BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1848: borrowed level
internal fun PlayerActivity.showV1848BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1848: bothered level
internal fun PlayerActivity.showV1848BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1848: bouncing level
internal fun PlayerActivity.showV1848BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1848: branching level
internal fun PlayerActivity.showV1848BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1848: breathing mode
internal fun PlayerActivity.showV1848BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848breathing
    FeaturePrefsStore.batch1841.v1848breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1848: bridging mode
internal fun PlayerActivity.showV1848BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bridging
    FeaturePrefsStore.batch1841.v1848bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1848: brighten mode
internal fun PlayerActivity.showV1848BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1848brighten
    FeaturePrefsStore.batch1841.v1848brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1848: bringing mode
internal fun PlayerActivity.showV1848BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bringing
    FeaturePrefsStore.batch1841.v1848bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1848: broadcasting mode
internal fun PlayerActivity.showV1848BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848broadcasting
    FeaturePrefsStore.batch1841.v1848broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1849: blocking mode
internal fun PlayerActivity.showV1849BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849blocking
    FeaturePrefsStore.batch1841.v1849blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1849: blooming mode
internal fun PlayerActivity.showV1849BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849blooming
    FeaturePrefsStore.batch1841.v1849blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1849: boiling mode
internal fun PlayerActivity.showV1849BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849boiling
    FeaturePrefsStore.batch1841.v1849boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1849: bolster mode
internal fun PlayerActivity.showV1849BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bolster
    FeaturePrefsStore.batch1841.v1849bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1849: booking mode
internal fun PlayerActivity.showV1849BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849booking
    FeaturePrefsStore.batch1841.v1849booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1849: boosted level
internal fun PlayerActivity.showV1849BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1849: borrowed level
internal fun PlayerActivity.showV1849BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1849: bothered level
internal fun PlayerActivity.showV1849BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1849: bouncing level
internal fun PlayerActivity.showV1849BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1849: branching level
internal fun PlayerActivity.showV1849BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1849: breathing mode
internal fun PlayerActivity.showV1849BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849breathing
    FeaturePrefsStore.batch1841.v1849breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1849: bridging mode
internal fun PlayerActivity.showV1849BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bridging
    FeaturePrefsStore.batch1841.v1849bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1849: brighten mode
internal fun PlayerActivity.showV1849BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1849brighten
    FeaturePrefsStore.batch1841.v1849brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1849: bringing mode
internal fun PlayerActivity.showV1849BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bringing
    FeaturePrefsStore.batch1841.v1849bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1849: broadcasting mode
internal fun PlayerActivity.showV1849BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849broadcasting
    FeaturePrefsStore.batch1841.v1849broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1850: blocking mode
internal fun PlayerActivity.showV1850BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850blocking
    FeaturePrefsStore.batch1841.v1850blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1850: blooming mode
internal fun PlayerActivity.showV1850BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850blooming
    FeaturePrefsStore.batch1841.v1850blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1850: boiling mode
internal fun PlayerActivity.showV1850BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850boiling
    FeaturePrefsStore.batch1841.v1850boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1850: bolster mode
internal fun PlayerActivity.showV1850BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bolster
    FeaturePrefsStore.batch1841.v1850bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1850: booking mode
internal fun PlayerActivity.showV1850BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850booking
    FeaturePrefsStore.batch1841.v1850booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1850: boosted level
internal fun PlayerActivity.showV1850BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1850: borrowed level
internal fun PlayerActivity.showV1850BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1850: bothered level
internal fun PlayerActivity.showV1850BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1850: bouncing level
internal fun PlayerActivity.showV1850BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1850: branching level
internal fun PlayerActivity.showV1850BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1850: breathing mode
internal fun PlayerActivity.showV1850BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850breathing
    FeaturePrefsStore.batch1841.v1850breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1850: bridging mode
internal fun PlayerActivity.showV1850BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bridging
    FeaturePrefsStore.batch1841.v1850bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1850: brighten mode
internal fun PlayerActivity.showV1850BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1850brighten
    FeaturePrefsStore.batch1841.v1850brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1850: bringing mode
internal fun PlayerActivity.showV1850BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bringing
    FeaturePrefsStore.batch1841.v1850bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1850: broadcasting mode
internal fun PlayerActivity.showV1850BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850broadcasting
    FeaturePrefsStore.batch1841.v1850broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

