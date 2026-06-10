package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1911: damaged mode
internal fun PlayerActivity.showV1911DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911damaged
    FeaturePrefsStore.batch1911.v1911damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1911: dancing mode
internal fun PlayerActivity.showV1911DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dancing
    FeaturePrefsStore.batch1911.v1911dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1911: dared mode
internal fun PlayerActivity.showV1911DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dared
    FeaturePrefsStore.batch1911.v1911dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1911: darkened mode
internal fun PlayerActivity.showV1911DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911darkened
    FeaturePrefsStore.batch1911.v1911darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1911: dashed mode
internal fun PlayerActivity.showV1911DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dashed
    FeaturePrefsStore.batch1911.v1911dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1911: dated level
internal fun PlayerActivity.showV1911DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1911: dealt level
internal fun PlayerActivity.showV1911DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1911: debated level
internal fun PlayerActivity.showV1911DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1911: decayed level
internal fun PlayerActivity.showV1911DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1911: deceived level
internal fun PlayerActivity.showV1911DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1911: decided mode
internal fun PlayerActivity.showV1911DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decided
    FeaturePrefsStore.batch1911.v1911decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1911: declared mode
internal fun PlayerActivity.showV1911DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1911declared
    FeaturePrefsStore.batch1911.v1911declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1911: declined mode
internal fun PlayerActivity.showV1911DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911declined
    FeaturePrefsStore.batch1911.v1911declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1911: decoded mode
internal fun PlayerActivity.showV1911DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decoded
    FeaturePrefsStore.batch1911.v1911decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1911: decreased mode
internal fun PlayerActivity.showV1911DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decreased
    FeaturePrefsStore.batch1911.v1911decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1912: damaged mode
internal fun PlayerActivity.showV1912DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912damaged
    FeaturePrefsStore.batch1911.v1912damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1912: dancing mode
internal fun PlayerActivity.showV1912DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dancing
    FeaturePrefsStore.batch1911.v1912dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1912: dared mode
internal fun PlayerActivity.showV1912DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dared
    FeaturePrefsStore.batch1911.v1912dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1912: darkened mode
internal fun PlayerActivity.showV1912DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912darkened
    FeaturePrefsStore.batch1911.v1912darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1912: dashed mode
internal fun PlayerActivity.showV1912DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dashed
    FeaturePrefsStore.batch1911.v1912dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1912: dated level
internal fun PlayerActivity.showV1912DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1912: dealt level
internal fun PlayerActivity.showV1912DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1912: debated level
internal fun PlayerActivity.showV1912DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1912: decayed level
internal fun PlayerActivity.showV1912DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1912: deceived level
internal fun PlayerActivity.showV1912DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1912: decided mode
internal fun PlayerActivity.showV1912DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decided
    FeaturePrefsStore.batch1911.v1912decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1912: declared mode
internal fun PlayerActivity.showV1912DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1912declared
    FeaturePrefsStore.batch1911.v1912declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1912: declined mode
internal fun PlayerActivity.showV1912DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912declined
    FeaturePrefsStore.batch1911.v1912declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1912: decoded mode
internal fun PlayerActivity.showV1912DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decoded
    FeaturePrefsStore.batch1911.v1912decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1912: decreased mode
internal fun PlayerActivity.showV1912DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decreased
    FeaturePrefsStore.batch1911.v1912decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1913: damaged mode
internal fun PlayerActivity.showV1913DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913damaged
    FeaturePrefsStore.batch1911.v1913damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1913: dancing mode
internal fun PlayerActivity.showV1913DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dancing
    FeaturePrefsStore.batch1911.v1913dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1913: dared mode
internal fun PlayerActivity.showV1913DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dared
    FeaturePrefsStore.batch1911.v1913dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1913: darkened mode
internal fun PlayerActivity.showV1913DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913darkened
    FeaturePrefsStore.batch1911.v1913darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1913: dashed mode
internal fun PlayerActivity.showV1913DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dashed
    FeaturePrefsStore.batch1911.v1913dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1913: dated level
internal fun PlayerActivity.showV1913DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1913: dealt level
internal fun PlayerActivity.showV1913DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1913: debated level
internal fun PlayerActivity.showV1913DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1913: decayed level
internal fun PlayerActivity.showV1913DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1913: deceived level
internal fun PlayerActivity.showV1913DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1913: decided mode
internal fun PlayerActivity.showV1913DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decided
    FeaturePrefsStore.batch1911.v1913decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1913: declared mode
internal fun PlayerActivity.showV1913DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1913declared
    FeaturePrefsStore.batch1911.v1913declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1913: declined mode
internal fun PlayerActivity.showV1913DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913declined
    FeaturePrefsStore.batch1911.v1913declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1913: decoded mode
internal fun PlayerActivity.showV1913DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decoded
    FeaturePrefsStore.batch1911.v1913decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1913: decreased mode
internal fun PlayerActivity.showV1913DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decreased
    FeaturePrefsStore.batch1911.v1913decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1914: damaged mode
internal fun PlayerActivity.showV1914DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914damaged
    FeaturePrefsStore.batch1911.v1914damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1914: dancing mode
internal fun PlayerActivity.showV1914DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dancing
    FeaturePrefsStore.batch1911.v1914dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1914: dared mode
internal fun PlayerActivity.showV1914DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dared
    FeaturePrefsStore.batch1911.v1914dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1914: darkened mode
internal fun PlayerActivity.showV1914DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914darkened
    FeaturePrefsStore.batch1911.v1914darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1914: dashed mode
internal fun PlayerActivity.showV1914DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dashed
    FeaturePrefsStore.batch1911.v1914dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1914: dated level
internal fun PlayerActivity.showV1914DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1914: dealt level
internal fun PlayerActivity.showV1914DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1914: debated level
internal fun PlayerActivity.showV1914DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1914: decayed level
internal fun PlayerActivity.showV1914DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1914: deceived level
internal fun PlayerActivity.showV1914DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1914: decided mode
internal fun PlayerActivity.showV1914DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decided
    FeaturePrefsStore.batch1911.v1914decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1914: declared mode
internal fun PlayerActivity.showV1914DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1914declared
    FeaturePrefsStore.batch1911.v1914declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1914: declined mode
internal fun PlayerActivity.showV1914DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914declined
    FeaturePrefsStore.batch1911.v1914declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1914: decoded mode
internal fun PlayerActivity.showV1914DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decoded
    FeaturePrefsStore.batch1911.v1914decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1914: decreased mode
internal fun PlayerActivity.showV1914DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decreased
    FeaturePrefsStore.batch1911.v1914decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1915: damaged mode
internal fun PlayerActivity.showV1915DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915damaged
    FeaturePrefsStore.batch1911.v1915damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1915: dancing mode
internal fun PlayerActivity.showV1915DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dancing
    FeaturePrefsStore.batch1911.v1915dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1915: dared mode
internal fun PlayerActivity.showV1915DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dared
    FeaturePrefsStore.batch1911.v1915dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1915: darkened mode
internal fun PlayerActivity.showV1915DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915darkened
    FeaturePrefsStore.batch1911.v1915darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1915: dashed mode
internal fun PlayerActivity.showV1915DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dashed
    FeaturePrefsStore.batch1911.v1915dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1915: dated level
internal fun PlayerActivity.showV1915DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1915: dealt level
internal fun PlayerActivity.showV1915DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1915: debated level
internal fun PlayerActivity.showV1915DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1915: decayed level
internal fun PlayerActivity.showV1915DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1915: deceived level
internal fun PlayerActivity.showV1915DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1915: decided mode
internal fun PlayerActivity.showV1915DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decided
    FeaturePrefsStore.batch1911.v1915decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1915: declared mode
internal fun PlayerActivity.showV1915DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1915declared
    FeaturePrefsStore.batch1911.v1915declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1915: declined mode
internal fun PlayerActivity.showV1915DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915declined
    FeaturePrefsStore.batch1911.v1915declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1915: decoded mode
internal fun PlayerActivity.showV1915DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decoded
    FeaturePrefsStore.batch1911.v1915decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1915: decreased mode
internal fun PlayerActivity.showV1915DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decreased
    FeaturePrefsStore.batch1911.v1915decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1916: damaged mode
internal fun PlayerActivity.showV1916DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916damaged
    FeaturePrefsStore.batch1911.v1916damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1916: dancing mode
internal fun PlayerActivity.showV1916DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dancing
    FeaturePrefsStore.batch1911.v1916dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1916: dared mode
internal fun PlayerActivity.showV1916DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dared
    FeaturePrefsStore.batch1911.v1916dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1916: darkened mode
internal fun PlayerActivity.showV1916DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916darkened
    FeaturePrefsStore.batch1911.v1916darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1916: dashed mode
internal fun PlayerActivity.showV1916DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dashed
    FeaturePrefsStore.batch1911.v1916dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1916: dated level
internal fun PlayerActivity.showV1916DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1916: dealt level
internal fun PlayerActivity.showV1916DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1916: debated level
internal fun PlayerActivity.showV1916DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1916: decayed level
internal fun PlayerActivity.showV1916DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1916: deceived level
internal fun PlayerActivity.showV1916DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1916: decided mode
internal fun PlayerActivity.showV1916DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decided
    FeaturePrefsStore.batch1911.v1916decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1916: declared mode
internal fun PlayerActivity.showV1916DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1916declared
    FeaturePrefsStore.batch1911.v1916declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1916: declined mode
internal fun PlayerActivity.showV1916DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916declined
    FeaturePrefsStore.batch1911.v1916declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1916: decoded mode
internal fun PlayerActivity.showV1916DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decoded
    FeaturePrefsStore.batch1911.v1916decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1916: decreased mode
internal fun PlayerActivity.showV1916DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decreased
    FeaturePrefsStore.batch1911.v1916decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1917: damaged mode
internal fun PlayerActivity.showV1917DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917damaged
    FeaturePrefsStore.batch1911.v1917damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1917: dancing mode
internal fun PlayerActivity.showV1917DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dancing
    FeaturePrefsStore.batch1911.v1917dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1917: dared mode
internal fun PlayerActivity.showV1917DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dared
    FeaturePrefsStore.batch1911.v1917dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1917: darkened mode
internal fun PlayerActivity.showV1917DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917darkened
    FeaturePrefsStore.batch1911.v1917darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1917: dashed mode
internal fun PlayerActivity.showV1917DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dashed
    FeaturePrefsStore.batch1911.v1917dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1917: dated level
internal fun PlayerActivity.showV1917DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1917: dealt level
internal fun PlayerActivity.showV1917DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1917: debated level
internal fun PlayerActivity.showV1917DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1917: decayed level
internal fun PlayerActivity.showV1917DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1917: deceived level
internal fun PlayerActivity.showV1917DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1917: decided mode
internal fun PlayerActivity.showV1917DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decided
    FeaturePrefsStore.batch1911.v1917decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1917: declared mode
internal fun PlayerActivity.showV1917DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1917declared
    FeaturePrefsStore.batch1911.v1917declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1917: declined mode
internal fun PlayerActivity.showV1917DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917declined
    FeaturePrefsStore.batch1911.v1917declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1917: decoded mode
internal fun PlayerActivity.showV1917DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decoded
    FeaturePrefsStore.batch1911.v1917decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1917: decreased mode
internal fun PlayerActivity.showV1917DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decreased
    FeaturePrefsStore.batch1911.v1917decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1918: damaged mode
internal fun PlayerActivity.showV1918DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918damaged
    FeaturePrefsStore.batch1911.v1918damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1918: dancing mode
internal fun PlayerActivity.showV1918DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dancing
    FeaturePrefsStore.batch1911.v1918dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1918: dared mode
internal fun PlayerActivity.showV1918DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dared
    FeaturePrefsStore.batch1911.v1918dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1918: darkened mode
internal fun PlayerActivity.showV1918DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918darkened
    FeaturePrefsStore.batch1911.v1918darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1918: dashed mode
internal fun PlayerActivity.showV1918DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dashed
    FeaturePrefsStore.batch1911.v1918dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1918: dated level
internal fun PlayerActivity.showV1918DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1918: dealt level
internal fun PlayerActivity.showV1918DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1918: debated level
internal fun PlayerActivity.showV1918DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1918: decayed level
internal fun PlayerActivity.showV1918DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1918: deceived level
internal fun PlayerActivity.showV1918DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1918: decided mode
internal fun PlayerActivity.showV1918DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decided
    FeaturePrefsStore.batch1911.v1918decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1918: declared mode
internal fun PlayerActivity.showV1918DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1918declared
    FeaturePrefsStore.batch1911.v1918declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1918: declined mode
internal fun PlayerActivity.showV1918DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918declined
    FeaturePrefsStore.batch1911.v1918declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1918: decoded mode
internal fun PlayerActivity.showV1918DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decoded
    FeaturePrefsStore.batch1911.v1918decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1918: decreased mode
internal fun PlayerActivity.showV1918DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decreased
    FeaturePrefsStore.batch1911.v1918decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1919: damaged mode
internal fun PlayerActivity.showV1919DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919damaged
    FeaturePrefsStore.batch1911.v1919damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1919: dancing mode
internal fun PlayerActivity.showV1919DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dancing
    FeaturePrefsStore.batch1911.v1919dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1919: dared mode
internal fun PlayerActivity.showV1919DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dared
    FeaturePrefsStore.batch1911.v1919dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1919: darkened mode
internal fun PlayerActivity.showV1919DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919darkened
    FeaturePrefsStore.batch1911.v1919darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1919: dashed mode
internal fun PlayerActivity.showV1919DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dashed
    FeaturePrefsStore.batch1911.v1919dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1919: dated level
internal fun PlayerActivity.showV1919DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1919: dealt level
internal fun PlayerActivity.showV1919DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1919: debated level
internal fun PlayerActivity.showV1919DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1919: decayed level
internal fun PlayerActivity.showV1919DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1919: deceived level
internal fun PlayerActivity.showV1919DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1919: decided mode
internal fun PlayerActivity.showV1919DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decided
    FeaturePrefsStore.batch1911.v1919decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1919: declared mode
internal fun PlayerActivity.showV1919DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1919declared
    FeaturePrefsStore.batch1911.v1919declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1919: declined mode
internal fun PlayerActivity.showV1919DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919declined
    FeaturePrefsStore.batch1911.v1919declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1919: decoded mode
internal fun PlayerActivity.showV1919DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decoded
    FeaturePrefsStore.batch1911.v1919decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1919: decreased mode
internal fun PlayerActivity.showV1919DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decreased
    FeaturePrefsStore.batch1911.v1919decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1920: damaged mode
internal fun PlayerActivity.showV1920DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920damaged
    FeaturePrefsStore.batch1911.v1920damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1920: dancing mode
internal fun PlayerActivity.showV1920DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dancing
    FeaturePrefsStore.batch1911.v1920dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1920: dared mode
internal fun PlayerActivity.showV1920DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dared
    FeaturePrefsStore.batch1911.v1920dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1920: darkened mode
internal fun PlayerActivity.showV1920DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920darkened
    FeaturePrefsStore.batch1911.v1920darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1920: dashed mode
internal fun PlayerActivity.showV1920DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dashed
    FeaturePrefsStore.batch1911.v1920dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1920: dated level
internal fun PlayerActivity.showV1920DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1920: dealt level
internal fun PlayerActivity.showV1920DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1920: debated level
internal fun PlayerActivity.showV1920DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1920: decayed level
internal fun PlayerActivity.showV1920DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1920: deceived level
internal fun PlayerActivity.showV1920DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1920: decided mode
internal fun PlayerActivity.showV1920DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decided
    FeaturePrefsStore.batch1911.v1920decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1920: declared mode
internal fun PlayerActivity.showV1920DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1920declared
    FeaturePrefsStore.batch1911.v1920declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1920: declined mode
internal fun PlayerActivity.showV1920DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920declined
    FeaturePrefsStore.batch1911.v1920declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1920: decoded mode
internal fun PlayerActivity.showV1920DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decoded
    FeaturePrefsStore.batch1911.v1920decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1920: decreased mode
internal fun PlayerActivity.showV1920DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decreased
    FeaturePrefsStore.batch1911.v1920decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

