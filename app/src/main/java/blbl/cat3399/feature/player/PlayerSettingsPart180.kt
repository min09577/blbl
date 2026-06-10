package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1981: erased mode
internal fun PlayerActivity.showV1981ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981erased
    FeaturePrefsStore.batch1981.v1981erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1981: escaped mode
internal fun PlayerActivity.showV1981EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981escaped
    FeaturePrefsStore.batch1981.v1981escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1981: established mode
internal fun PlayerActivity.showV1981EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981established
    FeaturePrefsStore.batch1981.v1981established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1981: estimated mode
internal fun PlayerActivity.showV1981EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981estimated
    FeaturePrefsStore.batch1981.v1981estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1981: evaluated mode
internal fun PlayerActivity.showV1981EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981evaluated
    FeaturePrefsStore.batch1981.v1981evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1981: examined level
internal fun PlayerActivity.showV1981ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1981: exceeded level
internal fun PlayerActivity.showV1981ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1981: exchanged level
internal fun PlayerActivity.showV1981ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1981: excluded level
internal fun PlayerActivity.showV1981ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1981: executed level
internal fun PlayerActivity.showV1981ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1981: exercised mode
internal fun PlayerActivity.showV1981ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exercised
    FeaturePrefsStore.batch1981.v1981exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1981: exhausted mode
internal fun PlayerActivity.showV1981ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exhausted
    FeaturePrefsStore.batch1981.v1981exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1981: exhibited mode
internal fun PlayerActivity.showV1981ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exhibited
    FeaturePrefsStore.batch1981.v1981exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1981: expanded mode
internal fun PlayerActivity.showV1981ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981expanded
    FeaturePrefsStore.batch1981.v1981expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1981: expected mode
internal fun PlayerActivity.showV1981ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981expected
    FeaturePrefsStore.batch1981.v1981expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1982: erased mode
internal fun PlayerActivity.showV1982ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982erased
    FeaturePrefsStore.batch1981.v1982erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1982: escaped mode
internal fun PlayerActivity.showV1982EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982escaped
    FeaturePrefsStore.batch1981.v1982escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1982: established mode
internal fun PlayerActivity.showV1982EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982established
    FeaturePrefsStore.batch1981.v1982established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1982: estimated mode
internal fun PlayerActivity.showV1982EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982estimated
    FeaturePrefsStore.batch1981.v1982estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1982: evaluated mode
internal fun PlayerActivity.showV1982EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982evaluated
    FeaturePrefsStore.batch1981.v1982evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1982: examined level
internal fun PlayerActivity.showV1982ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1982: exceeded level
internal fun PlayerActivity.showV1982ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1982: exchanged level
internal fun PlayerActivity.showV1982ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1982: excluded level
internal fun PlayerActivity.showV1982ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1982: executed level
internal fun PlayerActivity.showV1982ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1982: exercised mode
internal fun PlayerActivity.showV1982ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exercised
    FeaturePrefsStore.batch1981.v1982exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1982: exhausted mode
internal fun PlayerActivity.showV1982ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exhausted
    FeaturePrefsStore.batch1981.v1982exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1982: exhibited mode
internal fun PlayerActivity.showV1982ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exhibited
    FeaturePrefsStore.batch1981.v1982exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1982: expanded mode
internal fun PlayerActivity.showV1982ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982expanded
    FeaturePrefsStore.batch1981.v1982expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1982: expected mode
internal fun PlayerActivity.showV1982ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982expected
    FeaturePrefsStore.batch1981.v1982expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1983: erased mode
internal fun PlayerActivity.showV1983ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983erased
    FeaturePrefsStore.batch1981.v1983erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1983: escaped mode
internal fun PlayerActivity.showV1983EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983escaped
    FeaturePrefsStore.batch1981.v1983escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1983: established mode
internal fun PlayerActivity.showV1983EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983established
    FeaturePrefsStore.batch1981.v1983established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1983: estimated mode
internal fun PlayerActivity.showV1983EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983estimated
    FeaturePrefsStore.batch1981.v1983estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1983: evaluated mode
internal fun PlayerActivity.showV1983EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983evaluated
    FeaturePrefsStore.batch1981.v1983evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1983: examined level
internal fun PlayerActivity.showV1983ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1983: exceeded level
internal fun PlayerActivity.showV1983ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1983: exchanged level
internal fun PlayerActivity.showV1983ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1983: excluded level
internal fun PlayerActivity.showV1983ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1983: executed level
internal fun PlayerActivity.showV1983ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1983: exercised mode
internal fun PlayerActivity.showV1983ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exercised
    FeaturePrefsStore.batch1981.v1983exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1983: exhausted mode
internal fun PlayerActivity.showV1983ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exhausted
    FeaturePrefsStore.batch1981.v1983exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1983: exhibited mode
internal fun PlayerActivity.showV1983ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exhibited
    FeaturePrefsStore.batch1981.v1983exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1983: expanded mode
internal fun PlayerActivity.showV1983ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983expanded
    FeaturePrefsStore.batch1981.v1983expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1983: expected mode
internal fun PlayerActivity.showV1983ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983expected
    FeaturePrefsStore.batch1981.v1983expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1984: erased mode
internal fun PlayerActivity.showV1984ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984erased
    FeaturePrefsStore.batch1981.v1984erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1984: escaped mode
internal fun PlayerActivity.showV1984EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984escaped
    FeaturePrefsStore.batch1981.v1984escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1984: established mode
internal fun PlayerActivity.showV1984EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984established
    FeaturePrefsStore.batch1981.v1984established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1984: estimated mode
internal fun PlayerActivity.showV1984EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984estimated
    FeaturePrefsStore.batch1981.v1984estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1984: evaluated mode
internal fun PlayerActivity.showV1984EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984evaluated
    FeaturePrefsStore.batch1981.v1984evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1984: examined level
internal fun PlayerActivity.showV1984ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1984: exceeded level
internal fun PlayerActivity.showV1984ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1984: exchanged level
internal fun PlayerActivity.showV1984ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1984: excluded level
internal fun PlayerActivity.showV1984ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1984: executed level
internal fun PlayerActivity.showV1984ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1984: exercised mode
internal fun PlayerActivity.showV1984ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exercised
    FeaturePrefsStore.batch1981.v1984exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1984: exhausted mode
internal fun PlayerActivity.showV1984ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exhausted
    FeaturePrefsStore.batch1981.v1984exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1984: exhibited mode
internal fun PlayerActivity.showV1984ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exhibited
    FeaturePrefsStore.batch1981.v1984exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1984: expanded mode
internal fun PlayerActivity.showV1984ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984expanded
    FeaturePrefsStore.batch1981.v1984expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1984: expected mode
internal fun PlayerActivity.showV1984ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984expected
    FeaturePrefsStore.batch1981.v1984expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1985: erased mode
internal fun PlayerActivity.showV1985ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985erased
    FeaturePrefsStore.batch1981.v1985erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1985: escaped mode
internal fun PlayerActivity.showV1985EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985escaped
    FeaturePrefsStore.batch1981.v1985escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1985: established mode
internal fun PlayerActivity.showV1985EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985established
    FeaturePrefsStore.batch1981.v1985established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1985: estimated mode
internal fun PlayerActivity.showV1985EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985estimated
    FeaturePrefsStore.batch1981.v1985estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1985: evaluated mode
internal fun PlayerActivity.showV1985EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985evaluated
    FeaturePrefsStore.batch1981.v1985evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1985: examined level
internal fun PlayerActivity.showV1985ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1985: exceeded level
internal fun PlayerActivity.showV1985ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1985: exchanged level
internal fun PlayerActivity.showV1985ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1985: excluded level
internal fun PlayerActivity.showV1985ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1985: executed level
internal fun PlayerActivity.showV1985ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1985: exercised mode
internal fun PlayerActivity.showV1985ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exercised
    FeaturePrefsStore.batch1981.v1985exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1985: exhausted mode
internal fun PlayerActivity.showV1985ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exhausted
    FeaturePrefsStore.batch1981.v1985exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1985: exhibited mode
internal fun PlayerActivity.showV1985ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exhibited
    FeaturePrefsStore.batch1981.v1985exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1985: expanded mode
internal fun PlayerActivity.showV1985ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985expanded
    FeaturePrefsStore.batch1981.v1985expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1985: expected mode
internal fun PlayerActivity.showV1985ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985expected
    FeaturePrefsStore.batch1981.v1985expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1986: erased mode
internal fun PlayerActivity.showV1986ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986erased
    FeaturePrefsStore.batch1981.v1986erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1986: escaped mode
internal fun PlayerActivity.showV1986EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986escaped
    FeaturePrefsStore.batch1981.v1986escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1986: established mode
internal fun PlayerActivity.showV1986EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986established
    FeaturePrefsStore.batch1981.v1986established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1986: estimated mode
internal fun PlayerActivity.showV1986EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986estimated
    FeaturePrefsStore.batch1981.v1986estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1986: evaluated mode
internal fun PlayerActivity.showV1986EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986evaluated
    FeaturePrefsStore.batch1981.v1986evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1986: examined level
internal fun PlayerActivity.showV1986ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1986: exceeded level
internal fun PlayerActivity.showV1986ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1986: exchanged level
internal fun PlayerActivity.showV1986ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1986: excluded level
internal fun PlayerActivity.showV1986ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1986: executed level
internal fun PlayerActivity.showV1986ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1986: exercised mode
internal fun PlayerActivity.showV1986ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exercised
    FeaturePrefsStore.batch1981.v1986exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1986: exhausted mode
internal fun PlayerActivity.showV1986ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exhausted
    FeaturePrefsStore.batch1981.v1986exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1986: exhibited mode
internal fun PlayerActivity.showV1986ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exhibited
    FeaturePrefsStore.batch1981.v1986exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1986: expanded mode
internal fun PlayerActivity.showV1986ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986expanded
    FeaturePrefsStore.batch1981.v1986expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1986: expected mode
internal fun PlayerActivity.showV1986ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986expected
    FeaturePrefsStore.batch1981.v1986expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1987: erased mode
internal fun PlayerActivity.showV1987ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987erased
    FeaturePrefsStore.batch1981.v1987erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1987: escaped mode
internal fun PlayerActivity.showV1987EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987escaped
    FeaturePrefsStore.batch1981.v1987escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1987: established mode
internal fun PlayerActivity.showV1987EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987established
    FeaturePrefsStore.batch1981.v1987established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1987: estimated mode
internal fun PlayerActivity.showV1987EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987estimated
    FeaturePrefsStore.batch1981.v1987estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1987: evaluated mode
internal fun PlayerActivity.showV1987EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987evaluated
    FeaturePrefsStore.batch1981.v1987evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1987: examined level
internal fun PlayerActivity.showV1987ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1987: exceeded level
internal fun PlayerActivity.showV1987ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1987: exchanged level
internal fun PlayerActivity.showV1987ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1987: excluded level
internal fun PlayerActivity.showV1987ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1987: executed level
internal fun PlayerActivity.showV1987ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1987: exercised mode
internal fun PlayerActivity.showV1987ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exercised
    FeaturePrefsStore.batch1981.v1987exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1987: exhausted mode
internal fun PlayerActivity.showV1987ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exhausted
    FeaturePrefsStore.batch1981.v1987exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1987: exhibited mode
internal fun PlayerActivity.showV1987ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exhibited
    FeaturePrefsStore.batch1981.v1987exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1987: expanded mode
internal fun PlayerActivity.showV1987ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987expanded
    FeaturePrefsStore.batch1981.v1987expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1987: expected mode
internal fun PlayerActivity.showV1987ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987expected
    FeaturePrefsStore.batch1981.v1987expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1988: erased mode
internal fun PlayerActivity.showV1988ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988erased
    FeaturePrefsStore.batch1981.v1988erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1988: escaped mode
internal fun PlayerActivity.showV1988EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988escaped
    FeaturePrefsStore.batch1981.v1988escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1988: established mode
internal fun PlayerActivity.showV1988EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988established
    FeaturePrefsStore.batch1981.v1988established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1988: estimated mode
internal fun PlayerActivity.showV1988EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988estimated
    FeaturePrefsStore.batch1981.v1988estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1988: evaluated mode
internal fun PlayerActivity.showV1988EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988evaluated
    FeaturePrefsStore.batch1981.v1988evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1988: examined level
internal fun PlayerActivity.showV1988ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1988: exceeded level
internal fun PlayerActivity.showV1988ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1988: exchanged level
internal fun PlayerActivity.showV1988ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1988: excluded level
internal fun PlayerActivity.showV1988ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1988: executed level
internal fun PlayerActivity.showV1988ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1988: exercised mode
internal fun PlayerActivity.showV1988ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exercised
    FeaturePrefsStore.batch1981.v1988exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1988: exhausted mode
internal fun PlayerActivity.showV1988ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exhausted
    FeaturePrefsStore.batch1981.v1988exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1988: exhibited mode
internal fun PlayerActivity.showV1988ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exhibited
    FeaturePrefsStore.batch1981.v1988exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1988: expanded mode
internal fun PlayerActivity.showV1988ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988expanded
    FeaturePrefsStore.batch1981.v1988expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1988: expected mode
internal fun PlayerActivity.showV1988ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988expected
    FeaturePrefsStore.batch1981.v1988expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1989: erased mode
internal fun PlayerActivity.showV1989ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989erased
    FeaturePrefsStore.batch1981.v1989erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1989: escaped mode
internal fun PlayerActivity.showV1989EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989escaped
    FeaturePrefsStore.batch1981.v1989escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1989: established mode
internal fun PlayerActivity.showV1989EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989established
    FeaturePrefsStore.batch1981.v1989established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1989: estimated mode
internal fun PlayerActivity.showV1989EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989estimated
    FeaturePrefsStore.batch1981.v1989estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1989: evaluated mode
internal fun PlayerActivity.showV1989EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989evaluated
    FeaturePrefsStore.batch1981.v1989evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1989: examined level
internal fun PlayerActivity.showV1989ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1989: exceeded level
internal fun PlayerActivity.showV1989ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1989: exchanged level
internal fun PlayerActivity.showV1989ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1989: excluded level
internal fun PlayerActivity.showV1989ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1989: executed level
internal fun PlayerActivity.showV1989ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1989: exercised mode
internal fun PlayerActivity.showV1989ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exercised
    FeaturePrefsStore.batch1981.v1989exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1989: exhausted mode
internal fun PlayerActivity.showV1989ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exhausted
    FeaturePrefsStore.batch1981.v1989exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1989: exhibited mode
internal fun PlayerActivity.showV1989ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exhibited
    FeaturePrefsStore.batch1981.v1989exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1989: expanded mode
internal fun PlayerActivity.showV1989ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989expanded
    FeaturePrefsStore.batch1981.v1989expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1989: expected mode
internal fun PlayerActivity.showV1989ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989expected
    FeaturePrefsStore.batch1981.v1989expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1990: erased mode
internal fun PlayerActivity.showV1990ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990erased
    FeaturePrefsStore.batch1981.v1990erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1990: escaped mode
internal fun PlayerActivity.showV1990EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990escaped
    FeaturePrefsStore.batch1981.v1990escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1990: established mode
internal fun PlayerActivity.showV1990EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990established
    FeaturePrefsStore.batch1981.v1990established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1990: estimated mode
internal fun PlayerActivity.showV1990EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990estimated
    FeaturePrefsStore.batch1981.v1990estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1990: evaluated mode
internal fun PlayerActivity.showV1990EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990evaluated
    FeaturePrefsStore.batch1981.v1990evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1990: examined level
internal fun PlayerActivity.showV1990ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1990: exceeded level
internal fun PlayerActivity.showV1990ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1990: exchanged level
internal fun PlayerActivity.showV1990ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1990: excluded level
internal fun PlayerActivity.showV1990ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1990: executed level
internal fun PlayerActivity.showV1990ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1990: exercised mode
internal fun PlayerActivity.showV1990ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exercised
    FeaturePrefsStore.batch1981.v1990exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1990: exhausted mode
internal fun PlayerActivity.showV1990ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exhausted
    FeaturePrefsStore.batch1981.v1990exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1990: exhibited mode
internal fun PlayerActivity.showV1990ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exhibited
    FeaturePrefsStore.batch1981.v1990exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1990: expanded mode
internal fun PlayerActivity.showV1990ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990expanded
    FeaturePrefsStore.batch1981.v1990expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1990: expected mode
internal fun PlayerActivity.showV1990ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990expected
    FeaturePrefsStore.batch1981.v1990expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

