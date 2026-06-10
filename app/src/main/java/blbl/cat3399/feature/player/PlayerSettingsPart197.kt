package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2151: pressed mode
internal fun PlayerActivity.showV2151PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151pressed
    FeaturePrefsStore.batch2151.v2151pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2151: presumed mode
internal fun PlayerActivity.showV2151PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151presumed
    FeaturePrefsStore.batch2151.v2151presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2151: prevailed mode
internal fun PlayerActivity.showV2151PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151prevailed
    FeaturePrefsStore.batch2151.v2151prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2151: prevented mode
internal fun PlayerActivity.showV2151PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151prevented
    FeaturePrefsStore.batch2151.v2151prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2151: processed mode
internal fun PlayerActivity.showV2151ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151processed
    FeaturePrefsStore.batch2151.v2151processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2151: produced level
internal fun PlayerActivity.showV2151ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2151produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2151produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2151: profited level
internal fun PlayerActivity.showV2151ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2151profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2151profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2151: programmed level
internal fun PlayerActivity.showV2151ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2151programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2151programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2151: progressed level
internal fun PlayerActivity.showV2151ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2151progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2151progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2151: prohibited level
internal fun PlayerActivity.showV2151ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2151prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2151prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2151: projected mode
internal fun PlayerActivity.showV2151ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151projected
    FeaturePrefsStore.batch2151.v2151projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2151: promised mode
internal fun PlayerActivity.showV2151PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151promised
    FeaturePrefsStore.batch2151.v2151promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2151: promoted mode
internal fun PlayerActivity.showV2151PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151promoted
    FeaturePrefsStore.batch2151.v2151promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2151: prompted mode
internal fun PlayerActivity.showV2151PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151prompted
    FeaturePrefsStore.batch2151.v2151prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2151: proofed mode
internal fun PlayerActivity.showV2151ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2151proofed
    FeaturePrefsStore.batch2151.v2151proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2152: pressed mode
internal fun PlayerActivity.showV2152PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152pressed
    FeaturePrefsStore.batch2151.v2152pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2152: presumed mode
internal fun PlayerActivity.showV2152PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152presumed
    FeaturePrefsStore.batch2151.v2152presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2152: prevailed mode
internal fun PlayerActivity.showV2152PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152prevailed
    FeaturePrefsStore.batch2151.v2152prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2152: prevented mode
internal fun PlayerActivity.showV2152PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152prevented
    FeaturePrefsStore.batch2151.v2152prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2152: processed mode
internal fun PlayerActivity.showV2152ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152processed
    FeaturePrefsStore.batch2151.v2152processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2152: produced level
internal fun PlayerActivity.showV2152ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2152produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2152produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2152: profited level
internal fun PlayerActivity.showV2152ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2152profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2152profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2152: programmed level
internal fun PlayerActivity.showV2152ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2152programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2152programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2152: progressed level
internal fun PlayerActivity.showV2152ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2152progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2152progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2152: prohibited level
internal fun PlayerActivity.showV2152ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2152prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2152prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2152: projected mode
internal fun PlayerActivity.showV2152ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152projected
    FeaturePrefsStore.batch2151.v2152projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2152: promised mode
internal fun PlayerActivity.showV2152PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152promised
    FeaturePrefsStore.batch2151.v2152promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2152: promoted mode
internal fun PlayerActivity.showV2152PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152promoted
    FeaturePrefsStore.batch2151.v2152promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2152: prompted mode
internal fun PlayerActivity.showV2152PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152prompted
    FeaturePrefsStore.batch2151.v2152prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2152: proofed mode
internal fun PlayerActivity.showV2152ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2152proofed
    FeaturePrefsStore.batch2151.v2152proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2153: pressed mode
internal fun PlayerActivity.showV2153PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153pressed
    FeaturePrefsStore.batch2151.v2153pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2153: presumed mode
internal fun PlayerActivity.showV2153PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153presumed
    FeaturePrefsStore.batch2151.v2153presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2153: prevailed mode
internal fun PlayerActivity.showV2153PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153prevailed
    FeaturePrefsStore.batch2151.v2153prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2153: prevented mode
internal fun PlayerActivity.showV2153PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153prevented
    FeaturePrefsStore.batch2151.v2153prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2153: processed mode
internal fun PlayerActivity.showV2153ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153processed
    FeaturePrefsStore.batch2151.v2153processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2153: produced level
internal fun PlayerActivity.showV2153ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2153produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2153produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2153: profited level
internal fun PlayerActivity.showV2153ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2153profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2153profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2153: programmed level
internal fun PlayerActivity.showV2153ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2153programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2153programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2153: progressed level
internal fun PlayerActivity.showV2153ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2153progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2153progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2153: prohibited level
internal fun PlayerActivity.showV2153ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2153prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2153prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2153: projected mode
internal fun PlayerActivity.showV2153ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153projected
    FeaturePrefsStore.batch2151.v2153projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2153: promised mode
internal fun PlayerActivity.showV2153PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153promised
    FeaturePrefsStore.batch2151.v2153promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2153: promoted mode
internal fun PlayerActivity.showV2153PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153promoted
    FeaturePrefsStore.batch2151.v2153promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2153: prompted mode
internal fun PlayerActivity.showV2153PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153prompted
    FeaturePrefsStore.batch2151.v2153prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2153: proofed mode
internal fun PlayerActivity.showV2153ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2153proofed
    FeaturePrefsStore.batch2151.v2153proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2154: pressed mode
internal fun PlayerActivity.showV2154PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154pressed
    FeaturePrefsStore.batch2151.v2154pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2154: presumed mode
internal fun PlayerActivity.showV2154PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154presumed
    FeaturePrefsStore.batch2151.v2154presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2154: prevailed mode
internal fun PlayerActivity.showV2154PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154prevailed
    FeaturePrefsStore.batch2151.v2154prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2154: prevented mode
internal fun PlayerActivity.showV2154PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154prevented
    FeaturePrefsStore.batch2151.v2154prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2154: processed mode
internal fun PlayerActivity.showV2154ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154processed
    FeaturePrefsStore.batch2151.v2154processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2154: produced level
internal fun PlayerActivity.showV2154ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2154produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2154produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2154: profited level
internal fun PlayerActivity.showV2154ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2154profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2154profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2154: programmed level
internal fun PlayerActivity.showV2154ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2154programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2154programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2154: progressed level
internal fun PlayerActivity.showV2154ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2154progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2154progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2154: prohibited level
internal fun PlayerActivity.showV2154ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2154prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2154prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2154: projected mode
internal fun PlayerActivity.showV2154ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154projected
    FeaturePrefsStore.batch2151.v2154projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2154: promised mode
internal fun PlayerActivity.showV2154PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154promised
    FeaturePrefsStore.batch2151.v2154promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2154: promoted mode
internal fun PlayerActivity.showV2154PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154promoted
    FeaturePrefsStore.batch2151.v2154promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2154: prompted mode
internal fun PlayerActivity.showV2154PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154prompted
    FeaturePrefsStore.batch2151.v2154prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2154: proofed mode
internal fun PlayerActivity.showV2154ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2154proofed
    FeaturePrefsStore.batch2151.v2154proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2155: pressed mode
internal fun PlayerActivity.showV2155PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155pressed
    FeaturePrefsStore.batch2151.v2155pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2155: presumed mode
internal fun PlayerActivity.showV2155PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155presumed
    FeaturePrefsStore.batch2151.v2155presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2155: prevailed mode
internal fun PlayerActivity.showV2155PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155prevailed
    FeaturePrefsStore.batch2151.v2155prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2155: prevented mode
internal fun PlayerActivity.showV2155PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155prevented
    FeaturePrefsStore.batch2151.v2155prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2155: processed mode
internal fun PlayerActivity.showV2155ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155processed
    FeaturePrefsStore.batch2151.v2155processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2155: produced level
internal fun PlayerActivity.showV2155ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2155produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2155produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2155: profited level
internal fun PlayerActivity.showV2155ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2155profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2155profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2155: programmed level
internal fun PlayerActivity.showV2155ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2155programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2155programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2155: progressed level
internal fun PlayerActivity.showV2155ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2155progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2155progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2155: prohibited level
internal fun PlayerActivity.showV2155ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2155prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2155prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2155: projected mode
internal fun PlayerActivity.showV2155ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155projected
    FeaturePrefsStore.batch2151.v2155projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2155: promised mode
internal fun PlayerActivity.showV2155PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155promised
    FeaturePrefsStore.batch2151.v2155promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2155: promoted mode
internal fun PlayerActivity.showV2155PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155promoted
    FeaturePrefsStore.batch2151.v2155promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2155: prompted mode
internal fun PlayerActivity.showV2155PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155prompted
    FeaturePrefsStore.batch2151.v2155prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2155: proofed mode
internal fun PlayerActivity.showV2155ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2155proofed
    FeaturePrefsStore.batch2151.v2155proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2156: pressed mode
internal fun PlayerActivity.showV2156PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156pressed
    FeaturePrefsStore.batch2151.v2156pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2156: presumed mode
internal fun PlayerActivity.showV2156PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156presumed
    FeaturePrefsStore.batch2151.v2156presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2156: prevailed mode
internal fun PlayerActivity.showV2156PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156prevailed
    FeaturePrefsStore.batch2151.v2156prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2156: prevented mode
internal fun PlayerActivity.showV2156PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156prevented
    FeaturePrefsStore.batch2151.v2156prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2156: processed mode
internal fun PlayerActivity.showV2156ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156processed
    FeaturePrefsStore.batch2151.v2156processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2156: produced level
internal fun PlayerActivity.showV2156ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2156produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2156produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2156: profited level
internal fun PlayerActivity.showV2156ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2156profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2156profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2156: programmed level
internal fun PlayerActivity.showV2156ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2156programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2156programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2156: progressed level
internal fun PlayerActivity.showV2156ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2156progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2156progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2156: prohibited level
internal fun PlayerActivity.showV2156ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2156prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2156prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2156: projected mode
internal fun PlayerActivity.showV2156ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156projected
    FeaturePrefsStore.batch2151.v2156projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2156: promised mode
internal fun PlayerActivity.showV2156PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156promised
    FeaturePrefsStore.batch2151.v2156promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2156: promoted mode
internal fun PlayerActivity.showV2156PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156promoted
    FeaturePrefsStore.batch2151.v2156promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2156: prompted mode
internal fun PlayerActivity.showV2156PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156prompted
    FeaturePrefsStore.batch2151.v2156prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2156: proofed mode
internal fun PlayerActivity.showV2156ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2156proofed
    FeaturePrefsStore.batch2151.v2156proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2157: pressed mode
internal fun PlayerActivity.showV2157PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157pressed
    FeaturePrefsStore.batch2151.v2157pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2157: presumed mode
internal fun PlayerActivity.showV2157PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157presumed
    FeaturePrefsStore.batch2151.v2157presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2157: prevailed mode
internal fun PlayerActivity.showV2157PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157prevailed
    FeaturePrefsStore.batch2151.v2157prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2157: prevented mode
internal fun PlayerActivity.showV2157PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157prevented
    FeaturePrefsStore.batch2151.v2157prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2157: processed mode
internal fun PlayerActivity.showV2157ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157processed
    FeaturePrefsStore.batch2151.v2157processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2157: produced level
internal fun PlayerActivity.showV2157ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2157produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2157produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2157: profited level
internal fun PlayerActivity.showV2157ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2157profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2157profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2157: programmed level
internal fun PlayerActivity.showV2157ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2157programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2157programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2157: progressed level
internal fun PlayerActivity.showV2157ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2157progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2157progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2157: prohibited level
internal fun PlayerActivity.showV2157ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2157prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2157prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2157: projected mode
internal fun PlayerActivity.showV2157ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157projected
    FeaturePrefsStore.batch2151.v2157projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2157: promised mode
internal fun PlayerActivity.showV2157PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157promised
    FeaturePrefsStore.batch2151.v2157promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2157: promoted mode
internal fun PlayerActivity.showV2157PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157promoted
    FeaturePrefsStore.batch2151.v2157promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2157: prompted mode
internal fun PlayerActivity.showV2157PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157prompted
    FeaturePrefsStore.batch2151.v2157prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2157: proofed mode
internal fun PlayerActivity.showV2157ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2157proofed
    FeaturePrefsStore.batch2151.v2157proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2158: pressed mode
internal fun PlayerActivity.showV2158PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158pressed
    FeaturePrefsStore.batch2151.v2158pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2158: presumed mode
internal fun PlayerActivity.showV2158PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158presumed
    FeaturePrefsStore.batch2151.v2158presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2158: prevailed mode
internal fun PlayerActivity.showV2158PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158prevailed
    FeaturePrefsStore.batch2151.v2158prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2158: prevented mode
internal fun PlayerActivity.showV2158PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158prevented
    FeaturePrefsStore.batch2151.v2158prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2158: processed mode
internal fun PlayerActivity.showV2158ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158processed
    FeaturePrefsStore.batch2151.v2158processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2158: produced level
internal fun PlayerActivity.showV2158ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2158produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2158produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2158: profited level
internal fun PlayerActivity.showV2158ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2158profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2158profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2158: programmed level
internal fun PlayerActivity.showV2158ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2158programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2158programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2158: progressed level
internal fun PlayerActivity.showV2158ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2158progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2158progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2158: prohibited level
internal fun PlayerActivity.showV2158ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2158prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2158prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2158: projected mode
internal fun PlayerActivity.showV2158ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158projected
    FeaturePrefsStore.batch2151.v2158projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2158: promised mode
internal fun PlayerActivity.showV2158PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158promised
    FeaturePrefsStore.batch2151.v2158promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2158: promoted mode
internal fun PlayerActivity.showV2158PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158promoted
    FeaturePrefsStore.batch2151.v2158promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2158: prompted mode
internal fun PlayerActivity.showV2158PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158prompted
    FeaturePrefsStore.batch2151.v2158prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2158: proofed mode
internal fun PlayerActivity.showV2158ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2158proofed
    FeaturePrefsStore.batch2151.v2158proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2159: pressed mode
internal fun PlayerActivity.showV2159PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159pressed
    FeaturePrefsStore.batch2151.v2159pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2159: presumed mode
internal fun PlayerActivity.showV2159PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159presumed
    FeaturePrefsStore.batch2151.v2159presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2159: prevailed mode
internal fun PlayerActivity.showV2159PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159prevailed
    FeaturePrefsStore.batch2151.v2159prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2159: prevented mode
internal fun PlayerActivity.showV2159PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159prevented
    FeaturePrefsStore.batch2151.v2159prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2159: processed mode
internal fun PlayerActivity.showV2159ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159processed
    FeaturePrefsStore.batch2151.v2159processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2159: produced level
internal fun PlayerActivity.showV2159ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2159produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2159produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2159: profited level
internal fun PlayerActivity.showV2159ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2159profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2159profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2159: programmed level
internal fun PlayerActivity.showV2159ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2159programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2159programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2159: progressed level
internal fun PlayerActivity.showV2159ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2159progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2159progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2159: prohibited level
internal fun PlayerActivity.showV2159ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2159prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2159prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2159: projected mode
internal fun PlayerActivity.showV2159ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159projected
    FeaturePrefsStore.batch2151.v2159projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2159: promised mode
internal fun PlayerActivity.showV2159PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159promised
    FeaturePrefsStore.batch2151.v2159promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2159: promoted mode
internal fun PlayerActivity.showV2159PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159promoted
    FeaturePrefsStore.batch2151.v2159promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2159: prompted mode
internal fun PlayerActivity.showV2159PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159prompted
    FeaturePrefsStore.batch2151.v2159prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2159: proofed mode
internal fun PlayerActivity.showV2159ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2159proofed
    FeaturePrefsStore.batch2151.v2159proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

// v2160: pressed mode
internal fun PlayerActivity.showV2160PressedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160pressed
    FeaturePrefsStore.batch2151.v2160pressed = !current
    AppToast.show(this, "pressed: ${if (!current) "ON" else "OFF"}")
}

// v2160: presumed mode
internal fun PlayerActivity.showV2160PresumedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160presumed
    FeaturePrefsStore.batch2151.v2160presumed = !current
    AppToast.show(this, "presumed: ${if (!current) "ON" else "OFF"}")
}

// v2160: prevailed mode
internal fun PlayerActivity.showV2160PrevailedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160prevailed
    FeaturePrefsStore.batch2151.v2160prevailed = !current
    AppToast.show(this, "prevailed: ${if (!current) "ON" else "OFF"}")
}

// v2160: prevented mode
internal fun PlayerActivity.showV2160PreventedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160prevented
    FeaturePrefsStore.batch2151.v2160prevented = !current
    AppToast.show(this, "prevented: ${if (!current) "ON" else "OFF"}")
}

// v2160: processed mode
internal fun PlayerActivity.showV2160ProcessedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160processed
    FeaturePrefsStore.batch2151.v2160processed = !current
    AppToast.show(this, "processed: ${if (!current) "ON" else "OFF"}")
}

// v2160: produced level
internal fun PlayerActivity.showV2160ProducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2160produced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "produced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2160produced = value
        AppToast.show(this, "produced: $value")
    }
}

// v2160: profited level
internal fun PlayerActivity.showV2160ProfitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2160profited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2160profited = value
        AppToast.show(this, "profited: $value")
    }
}

// v2160: programmed level
internal fun PlayerActivity.showV2160ProgrammedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2160programmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "programmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2160programmed = value
        AppToast.show(this, "programmed: $value")
    }
}

// v2160: progressed level
internal fun PlayerActivity.showV2160ProgressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2160progressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "progressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2160progressed = value
        AppToast.show(this, "progressed: $value")
    }
}

// v2160: prohibited level
internal fun PlayerActivity.showV2160ProhibitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2151.v2160prohibited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prohibited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2151.v2160prohibited = value
        AppToast.show(this, "prohibited: $value")
    }
}

// v2160: projected mode
internal fun PlayerActivity.showV2160ProjectedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160projected
    FeaturePrefsStore.batch2151.v2160projected = !current
    AppToast.show(this, "projected: ${if (!current) "ON" else "OFF"}")
}

// v2160: promised mode
internal fun PlayerActivity.showV2160PromisedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160promised
    FeaturePrefsStore.batch2151.v2160promised = !current
    AppToast.show(this, "promised: ${if (!current) "ON" else "OFF"}")
}

// v2160: promoted mode
internal fun PlayerActivity.showV2160PromotedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160promoted
    FeaturePrefsStore.batch2151.v2160promoted = !current
    AppToast.show(this, "promoted: ${if (!current) "ON" else "OFF"}")
}

// v2160: prompted mode
internal fun PlayerActivity.showV2160PromptedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160prompted
    FeaturePrefsStore.batch2151.v2160prompted = !current
    AppToast.show(this, "prompted: ${if (!current) "ON" else "OFF"}")
}

// v2160: proofed mode
internal fun PlayerActivity.showV2160ProofedToggle() {
    val current = FeaturePrefsStore.batch2151.v2160proofed
    FeaturePrefsStore.batch2151.v2160proofed = !current
    AppToast.show(this, "proofed: ${if (!current) "ON" else "OFF"}")
}

