package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2261: stayed mode
internal fun PlayerActivity.showV2261StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stayed
    FeaturePrefsStore.batch2261.v2261stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2261: steered mode
internal fun PlayerActivity.showV2261SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2261steered
    FeaturePrefsStore.batch2261.v2261steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2261: stemmed mode
internal fun PlayerActivity.showV2261StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stemmed
    FeaturePrefsStore.batch2261.v2261stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2261: stepped mode
internal fun PlayerActivity.showV2261SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stepped
    FeaturePrefsStore.batch2261.v2261stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2261: stimulated mode
internal fun PlayerActivity.showV2261StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stimulated
    FeaturePrefsStore.batch2261.v2261stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2261: stirred level
internal fun PlayerActivity.showV2261StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2261: stocked level
internal fun PlayerActivity.showV2261StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2261: stopped level
internal fun PlayerActivity.showV2261StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2261: stored level
internal fun PlayerActivity.showV2261StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2261: straightened level
internal fun PlayerActivity.showV2261StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2261straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2261straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2261: strategized mode
internal fun PlayerActivity.showV2261StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261strategized
    FeaturePrefsStore.batch2261.v2261strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2261: streamlined mode
internal fun PlayerActivity.showV2261StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261streamlined
    FeaturePrefsStore.batch2261.v2261streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2261: strengthened mode
internal fun PlayerActivity.showV2261StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261strengthened
    FeaturePrefsStore.batch2261.v2261strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2261: stretched mode
internal fun PlayerActivity.showV2261StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2261stretched
    FeaturePrefsStore.batch2261.v2261stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2261: structured mode
internal fun PlayerActivity.showV2261StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2261structured
    FeaturePrefsStore.batch2261.v2261structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2262: stayed mode
internal fun PlayerActivity.showV2262StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stayed
    FeaturePrefsStore.batch2261.v2262stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2262: steered mode
internal fun PlayerActivity.showV2262SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2262steered
    FeaturePrefsStore.batch2261.v2262steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2262: stemmed mode
internal fun PlayerActivity.showV2262StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stemmed
    FeaturePrefsStore.batch2261.v2262stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2262: stepped mode
internal fun PlayerActivity.showV2262SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stepped
    FeaturePrefsStore.batch2261.v2262stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2262: stimulated mode
internal fun PlayerActivity.showV2262StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stimulated
    FeaturePrefsStore.batch2261.v2262stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2262: stirred level
internal fun PlayerActivity.showV2262StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2262: stocked level
internal fun PlayerActivity.showV2262StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2262: stopped level
internal fun PlayerActivity.showV2262StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2262: stored level
internal fun PlayerActivity.showV2262StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2262: straightened level
internal fun PlayerActivity.showV2262StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2262straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2262straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2262: strategized mode
internal fun PlayerActivity.showV2262StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262strategized
    FeaturePrefsStore.batch2261.v2262strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2262: streamlined mode
internal fun PlayerActivity.showV2262StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262streamlined
    FeaturePrefsStore.batch2261.v2262streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2262: strengthened mode
internal fun PlayerActivity.showV2262StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262strengthened
    FeaturePrefsStore.batch2261.v2262strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2262: stretched mode
internal fun PlayerActivity.showV2262StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2262stretched
    FeaturePrefsStore.batch2261.v2262stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2262: structured mode
internal fun PlayerActivity.showV2262StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2262structured
    FeaturePrefsStore.batch2261.v2262structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2263: stayed mode
internal fun PlayerActivity.showV2263StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stayed
    FeaturePrefsStore.batch2261.v2263stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2263: steered mode
internal fun PlayerActivity.showV2263SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2263steered
    FeaturePrefsStore.batch2261.v2263steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2263: stemmed mode
internal fun PlayerActivity.showV2263StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stemmed
    FeaturePrefsStore.batch2261.v2263stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2263: stepped mode
internal fun PlayerActivity.showV2263SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stepped
    FeaturePrefsStore.batch2261.v2263stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2263: stimulated mode
internal fun PlayerActivity.showV2263StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stimulated
    FeaturePrefsStore.batch2261.v2263stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2263: stirred level
internal fun PlayerActivity.showV2263StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2263: stocked level
internal fun PlayerActivity.showV2263StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2263: stopped level
internal fun PlayerActivity.showV2263StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2263: stored level
internal fun PlayerActivity.showV2263StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2263: straightened level
internal fun PlayerActivity.showV2263StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2263straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2263straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2263: strategized mode
internal fun PlayerActivity.showV2263StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263strategized
    FeaturePrefsStore.batch2261.v2263strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2263: streamlined mode
internal fun PlayerActivity.showV2263StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263streamlined
    FeaturePrefsStore.batch2261.v2263streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2263: strengthened mode
internal fun PlayerActivity.showV2263StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263strengthened
    FeaturePrefsStore.batch2261.v2263strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2263: stretched mode
internal fun PlayerActivity.showV2263StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2263stretched
    FeaturePrefsStore.batch2261.v2263stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2263: structured mode
internal fun PlayerActivity.showV2263StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2263structured
    FeaturePrefsStore.batch2261.v2263structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2264: stayed mode
internal fun PlayerActivity.showV2264StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stayed
    FeaturePrefsStore.batch2261.v2264stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2264: steered mode
internal fun PlayerActivity.showV2264SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2264steered
    FeaturePrefsStore.batch2261.v2264steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2264: stemmed mode
internal fun PlayerActivity.showV2264StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stemmed
    FeaturePrefsStore.batch2261.v2264stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2264: stepped mode
internal fun PlayerActivity.showV2264SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stepped
    FeaturePrefsStore.batch2261.v2264stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2264: stimulated mode
internal fun PlayerActivity.showV2264StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stimulated
    FeaturePrefsStore.batch2261.v2264stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2264: stirred level
internal fun PlayerActivity.showV2264StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2264: stocked level
internal fun PlayerActivity.showV2264StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2264: stopped level
internal fun PlayerActivity.showV2264StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2264: stored level
internal fun PlayerActivity.showV2264StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2264: straightened level
internal fun PlayerActivity.showV2264StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2264straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2264straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2264: strategized mode
internal fun PlayerActivity.showV2264StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264strategized
    FeaturePrefsStore.batch2261.v2264strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2264: streamlined mode
internal fun PlayerActivity.showV2264StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264streamlined
    FeaturePrefsStore.batch2261.v2264streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2264: strengthened mode
internal fun PlayerActivity.showV2264StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264strengthened
    FeaturePrefsStore.batch2261.v2264strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2264: stretched mode
internal fun PlayerActivity.showV2264StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2264stretched
    FeaturePrefsStore.batch2261.v2264stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2264: structured mode
internal fun PlayerActivity.showV2264StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2264structured
    FeaturePrefsStore.batch2261.v2264structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2265: stayed mode
internal fun PlayerActivity.showV2265StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stayed
    FeaturePrefsStore.batch2261.v2265stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2265: steered mode
internal fun PlayerActivity.showV2265SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2265steered
    FeaturePrefsStore.batch2261.v2265steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2265: stemmed mode
internal fun PlayerActivity.showV2265StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stemmed
    FeaturePrefsStore.batch2261.v2265stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2265: stepped mode
internal fun PlayerActivity.showV2265SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stepped
    FeaturePrefsStore.batch2261.v2265stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2265: stimulated mode
internal fun PlayerActivity.showV2265StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stimulated
    FeaturePrefsStore.batch2261.v2265stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2265: stirred level
internal fun PlayerActivity.showV2265StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2265: stocked level
internal fun PlayerActivity.showV2265StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2265: stopped level
internal fun PlayerActivity.showV2265StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2265: stored level
internal fun PlayerActivity.showV2265StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2265: straightened level
internal fun PlayerActivity.showV2265StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2265straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2265straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2265: strategized mode
internal fun PlayerActivity.showV2265StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265strategized
    FeaturePrefsStore.batch2261.v2265strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2265: streamlined mode
internal fun PlayerActivity.showV2265StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265streamlined
    FeaturePrefsStore.batch2261.v2265streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2265: strengthened mode
internal fun PlayerActivity.showV2265StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265strengthened
    FeaturePrefsStore.batch2261.v2265strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2265: stretched mode
internal fun PlayerActivity.showV2265StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2265stretched
    FeaturePrefsStore.batch2261.v2265stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2265: structured mode
internal fun PlayerActivity.showV2265StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2265structured
    FeaturePrefsStore.batch2261.v2265structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2266: stayed mode
internal fun PlayerActivity.showV2266StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stayed
    FeaturePrefsStore.batch2261.v2266stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2266: steered mode
internal fun PlayerActivity.showV2266SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2266steered
    FeaturePrefsStore.batch2261.v2266steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2266: stemmed mode
internal fun PlayerActivity.showV2266StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stemmed
    FeaturePrefsStore.batch2261.v2266stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2266: stepped mode
internal fun PlayerActivity.showV2266SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stepped
    FeaturePrefsStore.batch2261.v2266stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2266: stimulated mode
internal fun PlayerActivity.showV2266StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stimulated
    FeaturePrefsStore.batch2261.v2266stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2266: stirred level
internal fun PlayerActivity.showV2266StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2266: stocked level
internal fun PlayerActivity.showV2266StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2266: stopped level
internal fun PlayerActivity.showV2266StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2266: stored level
internal fun PlayerActivity.showV2266StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2266: straightened level
internal fun PlayerActivity.showV2266StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2266straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2266straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2266: strategized mode
internal fun PlayerActivity.showV2266StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266strategized
    FeaturePrefsStore.batch2261.v2266strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2266: streamlined mode
internal fun PlayerActivity.showV2266StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266streamlined
    FeaturePrefsStore.batch2261.v2266streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2266: strengthened mode
internal fun PlayerActivity.showV2266StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266strengthened
    FeaturePrefsStore.batch2261.v2266strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2266: stretched mode
internal fun PlayerActivity.showV2266StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2266stretched
    FeaturePrefsStore.batch2261.v2266stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2266: structured mode
internal fun PlayerActivity.showV2266StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2266structured
    FeaturePrefsStore.batch2261.v2266structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2267: stayed mode
internal fun PlayerActivity.showV2267StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stayed
    FeaturePrefsStore.batch2261.v2267stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2267: steered mode
internal fun PlayerActivity.showV2267SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2267steered
    FeaturePrefsStore.batch2261.v2267steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2267: stemmed mode
internal fun PlayerActivity.showV2267StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stemmed
    FeaturePrefsStore.batch2261.v2267stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2267: stepped mode
internal fun PlayerActivity.showV2267SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stepped
    FeaturePrefsStore.batch2261.v2267stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2267: stimulated mode
internal fun PlayerActivity.showV2267StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stimulated
    FeaturePrefsStore.batch2261.v2267stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2267: stirred level
internal fun PlayerActivity.showV2267StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2267: stocked level
internal fun PlayerActivity.showV2267StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2267: stopped level
internal fun PlayerActivity.showV2267StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2267: stored level
internal fun PlayerActivity.showV2267StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2267: straightened level
internal fun PlayerActivity.showV2267StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2267straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2267straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2267: strategized mode
internal fun PlayerActivity.showV2267StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267strategized
    FeaturePrefsStore.batch2261.v2267strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2267: streamlined mode
internal fun PlayerActivity.showV2267StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267streamlined
    FeaturePrefsStore.batch2261.v2267streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2267: strengthened mode
internal fun PlayerActivity.showV2267StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267strengthened
    FeaturePrefsStore.batch2261.v2267strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2267: stretched mode
internal fun PlayerActivity.showV2267StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2267stretched
    FeaturePrefsStore.batch2261.v2267stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2267: structured mode
internal fun PlayerActivity.showV2267StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2267structured
    FeaturePrefsStore.batch2261.v2267structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2268: stayed mode
internal fun PlayerActivity.showV2268StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stayed
    FeaturePrefsStore.batch2261.v2268stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2268: steered mode
internal fun PlayerActivity.showV2268SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2268steered
    FeaturePrefsStore.batch2261.v2268steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2268: stemmed mode
internal fun PlayerActivity.showV2268StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stemmed
    FeaturePrefsStore.batch2261.v2268stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2268: stepped mode
internal fun PlayerActivity.showV2268SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stepped
    FeaturePrefsStore.batch2261.v2268stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2268: stimulated mode
internal fun PlayerActivity.showV2268StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stimulated
    FeaturePrefsStore.batch2261.v2268stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2268: stirred level
internal fun PlayerActivity.showV2268StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2268: stocked level
internal fun PlayerActivity.showV2268StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2268: stopped level
internal fun PlayerActivity.showV2268StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2268: stored level
internal fun PlayerActivity.showV2268StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2268: straightened level
internal fun PlayerActivity.showV2268StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2268straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2268straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2268: strategized mode
internal fun PlayerActivity.showV2268StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268strategized
    FeaturePrefsStore.batch2261.v2268strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2268: streamlined mode
internal fun PlayerActivity.showV2268StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268streamlined
    FeaturePrefsStore.batch2261.v2268streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2268: strengthened mode
internal fun PlayerActivity.showV2268StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268strengthened
    FeaturePrefsStore.batch2261.v2268strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2268: stretched mode
internal fun PlayerActivity.showV2268StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2268stretched
    FeaturePrefsStore.batch2261.v2268stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2268: structured mode
internal fun PlayerActivity.showV2268StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2268structured
    FeaturePrefsStore.batch2261.v2268structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2269: stayed mode
internal fun PlayerActivity.showV2269StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stayed
    FeaturePrefsStore.batch2261.v2269stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2269: steered mode
internal fun PlayerActivity.showV2269SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2269steered
    FeaturePrefsStore.batch2261.v2269steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2269: stemmed mode
internal fun PlayerActivity.showV2269StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stemmed
    FeaturePrefsStore.batch2261.v2269stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2269: stepped mode
internal fun PlayerActivity.showV2269SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stepped
    FeaturePrefsStore.batch2261.v2269stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2269: stimulated mode
internal fun PlayerActivity.showV2269StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stimulated
    FeaturePrefsStore.batch2261.v2269stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2269: stirred level
internal fun PlayerActivity.showV2269StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2269: stocked level
internal fun PlayerActivity.showV2269StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2269: stopped level
internal fun PlayerActivity.showV2269StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2269: stored level
internal fun PlayerActivity.showV2269StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2269: straightened level
internal fun PlayerActivity.showV2269StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2269straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2269straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2269: strategized mode
internal fun PlayerActivity.showV2269StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269strategized
    FeaturePrefsStore.batch2261.v2269strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2269: streamlined mode
internal fun PlayerActivity.showV2269StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269streamlined
    FeaturePrefsStore.batch2261.v2269streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2269: strengthened mode
internal fun PlayerActivity.showV2269StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269strengthened
    FeaturePrefsStore.batch2261.v2269strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2269: stretched mode
internal fun PlayerActivity.showV2269StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2269stretched
    FeaturePrefsStore.batch2261.v2269stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2269: structured mode
internal fun PlayerActivity.showV2269StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2269structured
    FeaturePrefsStore.batch2261.v2269structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

// v2270: stayed mode
internal fun PlayerActivity.showV2270StayedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stayed
    FeaturePrefsStore.batch2261.v2270stayed = !current
    AppToast.show(this, "stayed: ${if (!current) "ON" else "OFF"}")
}

// v2270: steered mode
internal fun PlayerActivity.showV2270SteeredToggle() {
    val current = FeaturePrefsStore.batch2261.v2270steered
    FeaturePrefsStore.batch2261.v2270steered = !current
    AppToast.show(this, "steered: ${if (!current) "ON" else "OFF"}")
}

// v2270: stemmed mode
internal fun PlayerActivity.showV2270StemmedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stemmed
    FeaturePrefsStore.batch2261.v2270stemmed = !current
    AppToast.show(this, "stemmed: ${if (!current) "ON" else "OFF"}")
}

// v2270: stepped mode
internal fun PlayerActivity.showV2270SteppedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stepped
    FeaturePrefsStore.batch2261.v2270stepped = !current
    AppToast.show(this, "stepped: ${if (!current) "ON" else "OFF"}")
}

// v2270: stimulated mode
internal fun PlayerActivity.showV2270StimulatedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stimulated
    FeaturePrefsStore.batch2261.v2270stimulated = !current
    AppToast.show(this, "stimulated: ${if (!current) "ON" else "OFF"}")
}

// v2270: stirred level
internal fun PlayerActivity.showV2270StirredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stirred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stirred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stirred = value
        AppToast.show(this, "stirred: $value")
    }
}

// v2270: stocked level
internal fun PlayerActivity.showV2270StockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stocked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stocked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stocked = value
        AppToast.show(this, "stocked: $value")
    }
}

// v2270: stopped level
internal fun PlayerActivity.showV2270StoppedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stopped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stopped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stopped = value
        AppToast.show(this, "stopped: $value")
    }
}

// v2270: stored level
internal fun PlayerActivity.showV2270StoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270stored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "stored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270stored = value
        AppToast.show(this, "stored: $value")
    }
}

// v2270: straightened level
internal fun PlayerActivity.showV2270StraightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2261.v2270straightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "straightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2261.v2270straightened = value
        AppToast.show(this, "straightened: $value")
    }
}

// v2270: strategized mode
internal fun PlayerActivity.showV2270StrategizedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270strategized
    FeaturePrefsStore.batch2261.v2270strategized = !current
    AppToast.show(this, "strategized: ${if (!current) "ON" else "OFF"}")
}

// v2270: streamlined mode
internal fun PlayerActivity.showV2270StreamlinedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270streamlined
    FeaturePrefsStore.batch2261.v2270streamlined = !current
    AppToast.show(this, "streamlined: ${if (!current) "ON" else "OFF"}")
}

// v2270: strengthened mode
internal fun PlayerActivity.showV2270StrengthenedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270strengthened
    FeaturePrefsStore.batch2261.v2270strengthened = !current
    AppToast.show(this, "strengthened: ${if (!current) "ON" else "OFF"}")
}

// v2270: stretched mode
internal fun PlayerActivity.showV2270StretchedToggle() {
    val current = FeaturePrefsStore.batch2261.v2270stretched
    FeaturePrefsStore.batch2261.v2270stretched = !current
    AppToast.show(this, "stretched: ${if (!current) "ON" else "OFF"}")
}

// v2270: structured mode
internal fun PlayerActivity.showV2270StructuredToggle() {
    val current = FeaturePrefsStore.batch2261.v2270structured
    FeaturePrefsStore.batch2261.v2270structured = !current
    AppToast.show(this, "structured: ${if (!current) "ON" else "OFF"}")
}

