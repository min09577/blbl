package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v2161: propagated mode
internal fun PlayerActivity.showV2161PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161propagated
    FeaturePrefsStore.batch2161.v2161propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2161: properized mode
internal fun PlayerActivity.showV2161ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161properized
    FeaturePrefsStore.batch2161.v2161properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2161: proposed mode
internal fun PlayerActivity.showV2161ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161proposed
    FeaturePrefsStore.batch2161.v2161proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2161: protected mode
internal fun PlayerActivity.showV2161ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161protected
    FeaturePrefsStore.batch2161.v2161protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2161: protested mode
internal fun PlayerActivity.showV2161ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161protested
    FeaturePrefsStore.batch2161.v2161protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2161: proved level
internal fun PlayerActivity.showV2161ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2161: provided level
internal fun PlayerActivity.showV2161ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2161: provoked level
internal fun PlayerActivity.showV2161ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2161: published level
internal fun PlayerActivity.showV2161PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161published = value
        AppToast.show(this, "published: $value")
    }
}

// v2161: pulled level
internal fun PlayerActivity.showV2161PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2161pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2161pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2161: pumped mode
internal fun PlayerActivity.showV2161PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pumped
    FeaturePrefsStore.batch2161.v2161pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2161: punched mode
internal fun PlayerActivity.showV2161PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161punched
    FeaturePrefsStore.batch2161.v2161punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2161: purchased mode
internal fun PlayerActivity.showV2161PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161purchased
    FeaturePrefsStore.batch2161.v2161purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2161: pursued mode
internal fun PlayerActivity.showV2161PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pursued
    FeaturePrefsStore.batch2161.v2161pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2161: pushed mode
internal fun PlayerActivity.showV2161PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2161pushed
    FeaturePrefsStore.batch2161.v2161pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2162: propagated mode
internal fun PlayerActivity.showV2162PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162propagated
    FeaturePrefsStore.batch2161.v2162propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2162: properized mode
internal fun PlayerActivity.showV2162ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162properized
    FeaturePrefsStore.batch2161.v2162properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2162: proposed mode
internal fun PlayerActivity.showV2162ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162proposed
    FeaturePrefsStore.batch2161.v2162proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2162: protected mode
internal fun PlayerActivity.showV2162ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162protected
    FeaturePrefsStore.batch2161.v2162protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2162: protested mode
internal fun PlayerActivity.showV2162ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162protested
    FeaturePrefsStore.batch2161.v2162protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2162: proved level
internal fun PlayerActivity.showV2162ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2162: provided level
internal fun PlayerActivity.showV2162ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2162: provoked level
internal fun PlayerActivity.showV2162ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2162: published level
internal fun PlayerActivity.showV2162PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162published = value
        AppToast.show(this, "published: $value")
    }
}

// v2162: pulled level
internal fun PlayerActivity.showV2162PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2162pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2162pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2162: pumped mode
internal fun PlayerActivity.showV2162PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pumped
    FeaturePrefsStore.batch2161.v2162pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2162: punched mode
internal fun PlayerActivity.showV2162PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162punched
    FeaturePrefsStore.batch2161.v2162punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2162: purchased mode
internal fun PlayerActivity.showV2162PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162purchased
    FeaturePrefsStore.batch2161.v2162purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2162: pursued mode
internal fun PlayerActivity.showV2162PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pursued
    FeaturePrefsStore.batch2161.v2162pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2162: pushed mode
internal fun PlayerActivity.showV2162PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2162pushed
    FeaturePrefsStore.batch2161.v2162pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2163: propagated mode
internal fun PlayerActivity.showV2163PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163propagated
    FeaturePrefsStore.batch2161.v2163propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2163: properized mode
internal fun PlayerActivity.showV2163ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163properized
    FeaturePrefsStore.batch2161.v2163properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2163: proposed mode
internal fun PlayerActivity.showV2163ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163proposed
    FeaturePrefsStore.batch2161.v2163proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2163: protected mode
internal fun PlayerActivity.showV2163ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163protected
    FeaturePrefsStore.batch2161.v2163protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2163: protested mode
internal fun PlayerActivity.showV2163ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163protested
    FeaturePrefsStore.batch2161.v2163protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2163: proved level
internal fun PlayerActivity.showV2163ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2163: provided level
internal fun PlayerActivity.showV2163ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2163: provoked level
internal fun PlayerActivity.showV2163ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2163: published level
internal fun PlayerActivity.showV2163PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163published = value
        AppToast.show(this, "published: $value")
    }
}

// v2163: pulled level
internal fun PlayerActivity.showV2163PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2163pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2163pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2163: pumped mode
internal fun PlayerActivity.showV2163PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pumped
    FeaturePrefsStore.batch2161.v2163pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2163: punched mode
internal fun PlayerActivity.showV2163PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163punched
    FeaturePrefsStore.batch2161.v2163punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2163: purchased mode
internal fun PlayerActivity.showV2163PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163purchased
    FeaturePrefsStore.batch2161.v2163purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2163: pursued mode
internal fun PlayerActivity.showV2163PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pursued
    FeaturePrefsStore.batch2161.v2163pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2163: pushed mode
internal fun PlayerActivity.showV2163PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2163pushed
    FeaturePrefsStore.batch2161.v2163pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2164: propagated mode
internal fun PlayerActivity.showV2164PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164propagated
    FeaturePrefsStore.batch2161.v2164propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2164: properized mode
internal fun PlayerActivity.showV2164ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164properized
    FeaturePrefsStore.batch2161.v2164properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2164: proposed mode
internal fun PlayerActivity.showV2164ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164proposed
    FeaturePrefsStore.batch2161.v2164proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2164: protected mode
internal fun PlayerActivity.showV2164ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164protected
    FeaturePrefsStore.batch2161.v2164protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2164: protested mode
internal fun PlayerActivity.showV2164ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164protested
    FeaturePrefsStore.batch2161.v2164protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2164: proved level
internal fun PlayerActivity.showV2164ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2164: provided level
internal fun PlayerActivity.showV2164ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2164: provoked level
internal fun PlayerActivity.showV2164ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2164: published level
internal fun PlayerActivity.showV2164PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164published = value
        AppToast.show(this, "published: $value")
    }
}

// v2164: pulled level
internal fun PlayerActivity.showV2164PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2164pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2164pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2164: pumped mode
internal fun PlayerActivity.showV2164PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pumped
    FeaturePrefsStore.batch2161.v2164pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2164: punched mode
internal fun PlayerActivity.showV2164PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164punched
    FeaturePrefsStore.batch2161.v2164punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2164: purchased mode
internal fun PlayerActivity.showV2164PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164purchased
    FeaturePrefsStore.batch2161.v2164purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2164: pursued mode
internal fun PlayerActivity.showV2164PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pursued
    FeaturePrefsStore.batch2161.v2164pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2164: pushed mode
internal fun PlayerActivity.showV2164PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2164pushed
    FeaturePrefsStore.batch2161.v2164pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2165: propagated mode
internal fun PlayerActivity.showV2165PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165propagated
    FeaturePrefsStore.batch2161.v2165propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2165: properized mode
internal fun PlayerActivity.showV2165ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165properized
    FeaturePrefsStore.batch2161.v2165properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2165: proposed mode
internal fun PlayerActivity.showV2165ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165proposed
    FeaturePrefsStore.batch2161.v2165proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2165: protected mode
internal fun PlayerActivity.showV2165ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165protected
    FeaturePrefsStore.batch2161.v2165protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2165: protested mode
internal fun PlayerActivity.showV2165ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165protested
    FeaturePrefsStore.batch2161.v2165protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2165: proved level
internal fun PlayerActivity.showV2165ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2165: provided level
internal fun PlayerActivity.showV2165ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2165: provoked level
internal fun PlayerActivity.showV2165ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2165: published level
internal fun PlayerActivity.showV2165PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165published = value
        AppToast.show(this, "published: $value")
    }
}

// v2165: pulled level
internal fun PlayerActivity.showV2165PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2165pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2165pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2165: pumped mode
internal fun PlayerActivity.showV2165PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pumped
    FeaturePrefsStore.batch2161.v2165pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2165: punched mode
internal fun PlayerActivity.showV2165PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165punched
    FeaturePrefsStore.batch2161.v2165punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2165: purchased mode
internal fun PlayerActivity.showV2165PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165purchased
    FeaturePrefsStore.batch2161.v2165purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2165: pursued mode
internal fun PlayerActivity.showV2165PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pursued
    FeaturePrefsStore.batch2161.v2165pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2165: pushed mode
internal fun PlayerActivity.showV2165PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2165pushed
    FeaturePrefsStore.batch2161.v2165pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2166: propagated mode
internal fun PlayerActivity.showV2166PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166propagated
    FeaturePrefsStore.batch2161.v2166propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2166: properized mode
internal fun PlayerActivity.showV2166ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166properized
    FeaturePrefsStore.batch2161.v2166properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2166: proposed mode
internal fun PlayerActivity.showV2166ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166proposed
    FeaturePrefsStore.batch2161.v2166proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2166: protected mode
internal fun PlayerActivity.showV2166ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166protected
    FeaturePrefsStore.batch2161.v2166protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2166: protested mode
internal fun PlayerActivity.showV2166ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166protested
    FeaturePrefsStore.batch2161.v2166protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2166: proved level
internal fun PlayerActivity.showV2166ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2166: provided level
internal fun PlayerActivity.showV2166ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2166: provoked level
internal fun PlayerActivity.showV2166ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2166: published level
internal fun PlayerActivity.showV2166PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166published = value
        AppToast.show(this, "published: $value")
    }
}

// v2166: pulled level
internal fun PlayerActivity.showV2166PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2166pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2166pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2166: pumped mode
internal fun PlayerActivity.showV2166PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pumped
    FeaturePrefsStore.batch2161.v2166pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2166: punched mode
internal fun PlayerActivity.showV2166PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166punched
    FeaturePrefsStore.batch2161.v2166punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2166: purchased mode
internal fun PlayerActivity.showV2166PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166purchased
    FeaturePrefsStore.batch2161.v2166purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2166: pursued mode
internal fun PlayerActivity.showV2166PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pursued
    FeaturePrefsStore.batch2161.v2166pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2166: pushed mode
internal fun PlayerActivity.showV2166PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2166pushed
    FeaturePrefsStore.batch2161.v2166pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2167: propagated mode
internal fun PlayerActivity.showV2167PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167propagated
    FeaturePrefsStore.batch2161.v2167propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2167: properized mode
internal fun PlayerActivity.showV2167ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167properized
    FeaturePrefsStore.batch2161.v2167properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2167: proposed mode
internal fun PlayerActivity.showV2167ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167proposed
    FeaturePrefsStore.batch2161.v2167proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2167: protected mode
internal fun PlayerActivity.showV2167ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167protected
    FeaturePrefsStore.batch2161.v2167protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2167: protested mode
internal fun PlayerActivity.showV2167ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167protested
    FeaturePrefsStore.batch2161.v2167protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2167: proved level
internal fun PlayerActivity.showV2167ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2167: provided level
internal fun PlayerActivity.showV2167ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2167: provoked level
internal fun PlayerActivity.showV2167ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2167: published level
internal fun PlayerActivity.showV2167PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167published = value
        AppToast.show(this, "published: $value")
    }
}

// v2167: pulled level
internal fun PlayerActivity.showV2167PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2167pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2167pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2167: pumped mode
internal fun PlayerActivity.showV2167PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pumped
    FeaturePrefsStore.batch2161.v2167pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2167: punched mode
internal fun PlayerActivity.showV2167PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167punched
    FeaturePrefsStore.batch2161.v2167punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2167: purchased mode
internal fun PlayerActivity.showV2167PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167purchased
    FeaturePrefsStore.batch2161.v2167purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2167: pursued mode
internal fun PlayerActivity.showV2167PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pursued
    FeaturePrefsStore.batch2161.v2167pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2167: pushed mode
internal fun PlayerActivity.showV2167PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2167pushed
    FeaturePrefsStore.batch2161.v2167pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2168: propagated mode
internal fun PlayerActivity.showV2168PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168propagated
    FeaturePrefsStore.batch2161.v2168propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2168: properized mode
internal fun PlayerActivity.showV2168ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168properized
    FeaturePrefsStore.batch2161.v2168properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2168: proposed mode
internal fun PlayerActivity.showV2168ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168proposed
    FeaturePrefsStore.batch2161.v2168proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2168: protected mode
internal fun PlayerActivity.showV2168ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168protected
    FeaturePrefsStore.batch2161.v2168protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2168: protested mode
internal fun PlayerActivity.showV2168ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168protested
    FeaturePrefsStore.batch2161.v2168protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2168: proved level
internal fun PlayerActivity.showV2168ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2168: provided level
internal fun PlayerActivity.showV2168ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2168: provoked level
internal fun PlayerActivity.showV2168ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2168: published level
internal fun PlayerActivity.showV2168PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168published = value
        AppToast.show(this, "published: $value")
    }
}

// v2168: pulled level
internal fun PlayerActivity.showV2168PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2168pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2168pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2168: pumped mode
internal fun PlayerActivity.showV2168PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pumped
    FeaturePrefsStore.batch2161.v2168pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2168: punched mode
internal fun PlayerActivity.showV2168PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168punched
    FeaturePrefsStore.batch2161.v2168punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2168: purchased mode
internal fun PlayerActivity.showV2168PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168purchased
    FeaturePrefsStore.batch2161.v2168purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2168: pursued mode
internal fun PlayerActivity.showV2168PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pursued
    FeaturePrefsStore.batch2161.v2168pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2168: pushed mode
internal fun PlayerActivity.showV2168PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2168pushed
    FeaturePrefsStore.batch2161.v2168pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2169: propagated mode
internal fun PlayerActivity.showV2169PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169propagated
    FeaturePrefsStore.batch2161.v2169propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2169: properized mode
internal fun PlayerActivity.showV2169ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169properized
    FeaturePrefsStore.batch2161.v2169properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2169: proposed mode
internal fun PlayerActivity.showV2169ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169proposed
    FeaturePrefsStore.batch2161.v2169proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2169: protected mode
internal fun PlayerActivity.showV2169ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169protected
    FeaturePrefsStore.batch2161.v2169protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2169: protested mode
internal fun PlayerActivity.showV2169ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169protested
    FeaturePrefsStore.batch2161.v2169protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2169: proved level
internal fun PlayerActivity.showV2169ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2169: provided level
internal fun PlayerActivity.showV2169ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2169: provoked level
internal fun PlayerActivity.showV2169ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2169: published level
internal fun PlayerActivity.showV2169PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169published = value
        AppToast.show(this, "published: $value")
    }
}

// v2169: pulled level
internal fun PlayerActivity.showV2169PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2169pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2169pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2169: pumped mode
internal fun PlayerActivity.showV2169PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pumped
    FeaturePrefsStore.batch2161.v2169pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2169: punched mode
internal fun PlayerActivity.showV2169PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169punched
    FeaturePrefsStore.batch2161.v2169punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2169: purchased mode
internal fun PlayerActivity.showV2169PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169purchased
    FeaturePrefsStore.batch2161.v2169purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2169: pursued mode
internal fun PlayerActivity.showV2169PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pursued
    FeaturePrefsStore.batch2161.v2169pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2169: pushed mode
internal fun PlayerActivity.showV2169PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2169pushed
    FeaturePrefsStore.batch2161.v2169pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2170: propagated mode
internal fun PlayerActivity.showV2170PropagatedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170propagated
    FeaturePrefsStore.batch2161.v2170propagated = !current
    AppToast.show(this, "propagated: ${if (!current) "ON" else "OFF"}")
}

// v2170: properized mode
internal fun PlayerActivity.showV2170ProperizedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170properized
    FeaturePrefsStore.batch2161.v2170properized = !current
    AppToast.show(this, "properized: ${if (!current) "ON" else "OFF"}")
}

// v2170: proposed mode
internal fun PlayerActivity.showV2170ProposedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170proposed
    FeaturePrefsStore.batch2161.v2170proposed = !current
    AppToast.show(this, "proposed: ${if (!current) "ON" else "OFF"}")
}

// v2170: protected mode
internal fun PlayerActivity.showV2170ProtectedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170protected
    FeaturePrefsStore.batch2161.v2170protected = !current
    AppToast.show(this, "protected: ${if (!current) "ON" else "OFF"}")
}

// v2170: protested mode
internal fun PlayerActivity.showV2170ProtestedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170protested
    FeaturePrefsStore.batch2161.v2170protested = !current
    AppToast.show(this, "protested: ${if (!current) "ON" else "OFF"}")
}

// v2170: proved level
internal fun PlayerActivity.showV2170ProvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170proved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170proved = value
        AppToast.show(this, "proved: $value")
    }
}

// v2170: provided level
internal fun PlayerActivity.showV2170ProvidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170provided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170provided = value
        AppToast.show(this, "provided: $value")
    }
}

// v2170: provoked level
internal fun PlayerActivity.showV2170ProvokedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170provoked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "provoked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170provoked = value
        AppToast.show(this, "provoked: $value")
    }
}

// v2170: published level
internal fun PlayerActivity.showV2170PublishedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170published).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "published level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170published = value
        AppToast.show(this, "published: $value")
    }
}

// v2170: pulled level
internal fun PlayerActivity.showV2170PulledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2161.v2170pulled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pulled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2161.v2170pulled = value
        AppToast.show(this, "pulled: $value")
    }
}

// v2170: pumped mode
internal fun PlayerActivity.showV2170PumpedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pumped
    FeaturePrefsStore.batch2161.v2170pumped = !current
    AppToast.show(this, "pumped: ${if (!current) "ON" else "OFF"}")
}

// v2170: punched mode
internal fun PlayerActivity.showV2170PunchedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170punched
    FeaturePrefsStore.batch2161.v2170punched = !current
    AppToast.show(this, "punched: ${if (!current) "ON" else "OFF"}")
}

// v2170: purchased mode
internal fun PlayerActivity.showV2170PurchasedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170purchased
    FeaturePrefsStore.batch2161.v2170purchased = !current
    AppToast.show(this, "purchased: ${if (!current) "ON" else "OFF"}")
}

// v2170: pursued mode
internal fun PlayerActivity.showV2170PursuedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pursued
    FeaturePrefsStore.batch2161.v2170pursued = !current
    AppToast.show(this, "pursued: ${if (!current) "ON" else "OFF"}")
}

// v2170: pushed mode
internal fun PlayerActivity.showV2170PushedToggle() {
    val current = FeaturePrefsStore.batch2161.v2170pushed
    FeaturePrefsStore.batch2161.v2170pushed = !current
    AppToast.show(this, "pushed: ${if (!current) "ON" else "OFF"}")
}

// v2171: qualified mode
internal fun PlayerActivity.showV2171QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171qualified
    FeaturePrefsStore.batch2171.v2171qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2171: quantified mode
internal fun PlayerActivity.showV2171QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171quantified
    FeaturePrefsStore.batch2171.v2171quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2171: queried mode
internal fun PlayerActivity.showV2171QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171queried
    FeaturePrefsStore.batch2171.v2171queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2171: questioned mode
internal fun PlayerActivity.showV2171QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171questioned
    FeaturePrefsStore.batch2171.v2171questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2171: queued mode
internal fun PlayerActivity.showV2171QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171queued
    FeaturePrefsStore.batch2171.v2171queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2171: quoted level
internal fun PlayerActivity.showV2171QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2171: raised level
internal fun PlayerActivity.showV2171RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2171: randomized level
internal fun PlayerActivity.showV2171RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2171: ranked level
internal fun PlayerActivity.showV2171RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2171: rated level
internal fun PlayerActivity.showV2171RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2171: reached mode
internal fun PlayerActivity.showV2171ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171reached
    FeaturePrefsStore.batch2171.v2171reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2171: reacted mode
internal fun PlayerActivity.showV2171ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171reacted
    FeaturePrefsStore.batch2171.v2171reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2171: realized mode
internal fun PlayerActivity.showV2171RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171realized
    FeaturePrefsStore.batch2171.v2171realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2171: rebalanced mode
internal fun PlayerActivity.showV2171RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171rebalanced
    FeaturePrefsStore.batch2171.v2171rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2171: rebuilt mode
internal fun PlayerActivity.showV2171RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2171rebuilt
    FeaturePrefsStore.batch2171.v2171rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2172: qualified mode
internal fun PlayerActivity.showV2172QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172qualified
    FeaturePrefsStore.batch2171.v2172qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2172: quantified mode
internal fun PlayerActivity.showV2172QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172quantified
    FeaturePrefsStore.batch2171.v2172quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2172: queried mode
internal fun PlayerActivity.showV2172QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172queried
    FeaturePrefsStore.batch2171.v2172queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2172: questioned mode
internal fun PlayerActivity.showV2172QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172questioned
    FeaturePrefsStore.batch2171.v2172questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2172: queued mode
internal fun PlayerActivity.showV2172QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172queued
    FeaturePrefsStore.batch2171.v2172queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2172: quoted level
internal fun PlayerActivity.showV2172QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2172: raised level
internal fun PlayerActivity.showV2172RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2172: randomized level
internal fun PlayerActivity.showV2172RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2172: ranked level
internal fun PlayerActivity.showV2172RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2172: rated level
internal fun PlayerActivity.showV2172RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2172: reached mode
internal fun PlayerActivity.showV2172ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172reached
    FeaturePrefsStore.batch2171.v2172reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2172: reacted mode
internal fun PlayerActivity.showV2172ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172reacted
    FeaturePrefsStore.batch2171.v2172reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2172: realized mode
internal fun PlayerActivity.showV2172RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172realized
    FeaturePrefsStore.batch2171.v2172realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2172: rebalanced mode
internal fun PlayerActivity.showV2172RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172rebalanced
    FeaturePrefsStore.batch2171.v2172rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2172: rebuilt mode
internal fun PlayerActivity.showV2172RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2172rebuilt
    FeaturePrefsStore.batch2171.v2172rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2173: qualified mode
internal fun PlayerActivity.showV2173QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173qualified
    FeaturePrefsStore.batch2171.v2173qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2173: quantified mode
internal fun PlayerActivity.showV2173QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173quantified
    FeaturePrefsStore.batch2171.v2173quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2173: queried mode
internal fun PlayerActivity.showV2173QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173queried
    FeaturePrefsStore.batch2171.v2173queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2173: questioned mode
internal fun PlayerActivity.showV2173QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173questioned
    FeaturePrefsStore.batch2171.v2173questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2173: queued mode
internal fun PlayerActivity.showV2173QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173queued
    FeaturePrefsStore.batch2171.v2173queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2173: quoted level
internal fun PlayerActivity.showV2173QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2173: raised level
internal fun PlayerActivity.showV2173RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2173: randomized level
internal fun PlayerActivity.showV2173RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2173: ranked level
internal fun PlayerActivity.showV2173RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2173: rated level
internal fun PlayerActivity.showV2173RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2173: reached mode
internal fun PlayerActivity.showV2173ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173reached
    FeaturePrefsStore.batch2171.v2173reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2173: reacted mode
internal fun PlayerActivity.showV2173ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173reacted
    FeaturePrefsStore.batch2171.v2173reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2173: realized mode
internal fun PlayerActivity.showV2173RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173realized
    FeaturePrefsStore.batch2171.v2173realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2173: rebalanced mode
internal fun PlayerActivity.showV2173RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173rebalanced
    FeaturePrefsStore.batch2171.v2173rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2173: rebuilt mode
internal fun PlayerActivity.showV2173RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2173rebuilt
    FeaturePrefsStore.batch2171.v2173rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2174: qualified mode
internal fun PlayerActivity.showV2174QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174qualified
    FeaturePrefsStore.batch2171.v2174qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2174: quantified mode
internal fun PlayerActivity.showV2174QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174quantified
    FeaturePrefsStore.batch2171.v2174quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2174: queried mode
internal fun PlayerActivity.showV2174QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174queried
    FeaturePrefsStore.batch2171.v2174queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2174: questioned mode
internal fun PlayerActivity.showV2174QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174questioned
    FeaturePrefsStore.batch2171.v2174questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2174: queued mode
internal fun PlayerActivity.showV2174QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174queued
    FeaturePrefsStore.batch2171.v2174queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2174: quoted level
internal fun PlayerActivity.showV2174QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2174: raised level
internal fun PlayerActivity.showV2174RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2174: randomized level
internal fun PlayerActivity.showV2174RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2174: ranked level
internal fun PlayerActivity.showV2174RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2174: rated level
internal fun PlayerActivity.showV2174RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2174: reached mode
internal fun PlayerActivity.showV2174ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174reached
    FeaturePrefsStore.batch2171.v2174reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2174: reacted mode
internal fun PlayerActivity.showV2174ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174reacted
    FeaturePrefsStore.batch2171.v2174reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2174: realized mode
internal fun PlayerActivity.showV2174RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174realized
    FeaturePrefsStore.batch2171.v2174realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2174: rebalanced mode
internal fun PlayerActivity.showV2174RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174rebalanced
    FeaturePrefsStore.batch2171.v2174rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2174: rebuilt mode
internal fun PlayerActivity.showV2174RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2174rebuilt
    FeaturePrefsStore.batch2171.v2174rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2175: qualified mode
internal fun PlayerActivity.showV2175QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175qualified
    FeaturePrefsStore.batch2171.v2175qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2175: quantified mode
internal fun PlayerActivity.showV2175QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175quantified
    FeaturePrefsStore.batch2171.v2175quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2175: queried mode
internal fun PlayerActivity.showV2175QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175queried
    FeaturePrefsStore.batch2171.v2175queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2175: questioned mode
internal fun PlayerActivity.showV2175QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175questioned
    FeaturePrefsStore.batch2171.v2175questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2175: queued mode
internal fun PlayerActivity.showV2175QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175queued
    FeaturePrefsStore.batch2171.v2175queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2175: quoted level
internal fun PlayerActivity.showV2175QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2175: raised level
internal fun PlayerActivity.showV2175RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2175: randomized level
internal fun PlayerActivity.showV2175RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2175: ranked level
internal fun PlayerActivity.showV2175RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2175: rated level
internal fun PlayerActivity.showV2175RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2175: reached mode
internal fun PlayerActivity.showV2175ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175reached
    FeaturePrefsStore.batch2171.v2175reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2175: reacted mode
internal fun PlayerActivity.showV2175ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175reacted
    FeaturePrefsStore.batch2171.v2175reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2175: realized mode
internal fun PlayerActivity.showV2175RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175realized
    FeaturePrefsStore.batch2171.v2175realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2175: rebalanced mode
internal fun PlayerActivity.showV2175RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175rebalanced
    FeaturePrefsStore.batch2171.v2175rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2175: rebuilt mode
internal fun PlayerActivity.showV2175RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2175rebuilt
    FeaturePrefsStore.batch2171.v2175rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2176: qualified mode
internal fun PlayerActivity.showV2176QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176qualified
    FeaturePrefsStore.batch2171.v2176qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2176: quantified mode
internal fun PlayerActivity.showV2176QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176quantified
    FeaturePrefsStore.batch2171.v2176quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2176: queried mode
internal fun PlayerActivity.showV2176QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176queried
    FeaturePrefsStore.batch2171.v2176queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2176: questioned mode
internal fun PlayerActivity.showV2176QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176questioned
    FeaturePrefsStore.batch2171.v2176questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2176: queued mode
internal fun PlayerActivity.showV2176QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176queued
    FeaturePrefsStore.batch2171.v2176queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2176: quoted level
internal fun PlayerActivity.showV2176QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2176: raised level
internal fun PlayerActivity.showV2176RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2176: randomized level
internal fun PlayerActivity.showV2176RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2176: ranked level
internal fun PlayerActivity.showV2176RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2176: rated level
internal fun PlayerActivity.showV2176RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2176: reached mode
internal fun PlayerActivity.showV2176ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176reached
    FeaturePrefsStore.batch2171.v2176reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2176: reacted mode
internal fun PlayerActivity.showV2176ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176reacted
    FeaturePrefsStore.batch2171.v2176reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2176: realized mode
internal fun PlayerActivity.showV2176RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176realized
    FeaturePrefsStore.batch2171.v2176realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2176: rebalanced mode
internal fun PlayerActivity.showV2176RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176rebalanced
    FeaturePrefsStore.batch2171.v2176rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2176: rebuilt mode
internal fun PlayerActivity.showV2176RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2176rebuilt
    FeaturePrefsStore.batch2171.v2176rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2177: qualified mode
internal fun PlayerActivity.showV2177QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177qualified
    FeaturePrefsStore.batch2171.v2177qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2177: quantified mode
internal fun PlayerActivity.showV2177QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177quantified
    FeaturePrefsStore.batch2171.v2177quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2177: queried mode
internal fun PlayerActivity.showV2177QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177queried
    FeaturePrefsStore.batch2171.v2177queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2177: questioned mode
internal fun PlayerActivity.showV2177QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177questioned
    FeaturePrefsStore.batch2171.v2177questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2177: queued mode
internal fun PlayerActivity.showV2177QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177queued
    FeaturePrefsStore.batch2171.v2177queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2177: quoted level
internal fun PlayerActivity.showV2177QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2177: raised level
internal fun PlayerActivity.showV2177RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2177: randomized level
internal fun PlayerActivity.showV2177RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2177: ranked level
internal fun PlayerActivity.showV2177RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2177: rated level
internal fun PlayerActivity.showV2177RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2177: reached mode
internal fun PlayerActivity.showV2177ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177reached
    FeaturePrefsStore.batch2171.v2177reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2177: reacted mode
internal fun PlayerActivity.showV2177ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177reacted
    FeaturePrefsStore.batch2171.v2177reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2177: realized mode
internal fun PlayerActivity.showV2177RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177realized
    FeaturePrefsStore.batch2171.v2177realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2177: rebalanced mode
internal fun PlayerActivity.showV2177RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177rebalanced
    FeaturePrefsStore.batch2171.v2177rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2177: rebuilt mode
internal fun PlayerActivity.showV2177RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2177rebuilt
    FeaturePrefsStore.batch2171.v2177rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2178: qualified mode
internal fun PlayerActivity.showV2178QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178qualified
    FeaturePrefsStore.batch2171.v2178qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2178: quantified mode
internal fun PlayerActivity.showV2178QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178quantified
    FeaturePrefsStore.batch2171.v2178quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2178: queried mode
internal fun PlayerActivity.showV2178QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178queried
    FeaturePrefsStore.batch2171.v2178queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2178: questioned mode
internal fun PlayerActivity.showV2178QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178questioned
    FeaturePrefsStore.batch2171.v2178questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2178: queued mode
internal fun PlayerActivity.showV2178QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178queued
    FeaturePrefsStore.batch2171.v2178queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2178: quoted level
internal fun PlayerActivity.showV2178QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2178: raised level
internal fun PlayerActivity.showV2178RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2178: randomized level
internal fun PlayerActivity.showV2178RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2178: ranked level
internal fun PlayerActivity.showV2178RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2178: rated level
internal fun PlayerActivity.showV2178RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2178: reached mode
internal fun PlayerActivity.showV2178ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178reached
    FeaturePrefsStore.batch2171.v2178reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2178: reacted mode
internal fun PlayerActivity.showV2178ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178reacted
    FeaturePrefsStore.batch2171.v2178reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2178: realized mode
internal fun PlayerActivity.showV2178RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178realized
    FeaturePrefsStore.batch2171.v2178realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2178: rebalanced mode
internal fun PlayerActivity.showV2178RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178rebalanced
    FeaturePrefsStore.batch2171.v2178rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2178: rebuilt mode
internal fun PlayerActivity.showV2178RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2178rebuilt
    FeaturePrefsStore.batch2171.v2178rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2179: qualified mode
internal fun PlayerActivity.showV2179QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179qualified
    FeaturePrefsStore.batch2171.v2179qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2179: quantified mode
internal fun PlayerActivity.showV2179QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179quantified
    FeaturePrefsStore.batch2171.v2179quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2179: queried mode
internal fun PlayerActivity.showV2179QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179queried
    FeaturePrefsStore.batch2171.v2179queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2179: questioned mode
internal fun PlayerActivity.showV2179QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179questioned
    FeaturePrefsStore.batch2171.v2179questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2179: queued mode
internal fun PlayerActivity.showV2179QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179queued
    FeaturePrefsStore.batch2171.v2179queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2179: quoted level
internal fun PlayerActivity.showV2179QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2179: raised level
internal fun PlayerActivity.showV2179RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2179: randomized level
internal fun PlayerActivity.showV2179RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2179: ranked level
internal fun PlayerActivity.showV2179RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2179: rated level
internal fun PlayerActivity.showV2179RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2179: reached mode
internal fun PlayerActivity.showV2179ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179reached
    FeaturePrefsStore.batch2171.v2179reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2179: reacted mode
internal fun PlayerActivity.showV2179ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179reacted
    FeaturePrefsStore.batch2171.v2179reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2179: realized mode
internal fun PlayerActivity.showV2179RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179realized
    FeaturePrefsStore.batch2171.v2179realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2179: rebalanced mode
internal fun PlayerActivity.showV2179RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179rebalanced
    FeaturePrefsStore.batch2171.v2179rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2179: rebuilt mode
internal fun PlayerActivity.showV2179RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2179rebuilt
    FeaturePrefsStore.batch2171.v2179rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2180: qualified mode
internal fun PlayerActivity.showV2180QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180qualified
    FeaturePrefsStore.batch2171.v2180qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2180: quantified mode
internal fun PlayerActivity.showV2180QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180quantified
    FeaturePrefsStore.batch2171.v2180quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2180: queried mode
internal fun PlayerActivity.showV2180QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180queried
    FeaturePrefsStore.batch2171.v2180queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2180: questioned mode
internal fun PlayerActivity.showV2180QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180questioned
    FeaturePrefsStore.batch2171.v2180questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2180: queued mode
internal fun PlayerActivity.showV2180QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180queued
    FeaturePrefsStore.batch2171.v2180queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2180: quoted level
internal fun PlayerActivity.showV2180QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2180: raised level
internal fun PlayerActivity.showV2180RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2180: randomized level
internal fun PlayerActivity.showV2180RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2180: ranked level
internal fun PlayerActivity.showV2180RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2180: rated level
internal fun PlayerActivity.showV2180RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2180: reached mode
internal fun PlayerActivity.showV2180ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180reached
    FeaturePrefsStore.batch2171.v2180reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2180: reacted mode
internal fun PlayerActivity.showV2180ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180reacted
    FeaturePrefsStore.batch2171.v2180reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2180: realized mode
internal fun PlayerActivity.showV2180RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180realized
    FeaturePrefsStore.batch2171.v2180realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2180: rebalanced mode
internal fun PlayerActivity.showV2180RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180rebalanced
    FeaturePrefsStore.batch2171.v2180rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2180: rebuilt mode
internal fun PlayerActivity.showV2180RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2180rebuilt
    FeaturePrefsStore.batch2171.v2180rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v36.9: 弹幕发送历史记录搜索
internal fun PlayerActivity.showV36HistorySearchToggle() {
    val current = BiliClient.prefs.v36HistorySearch
    BiliClient.prefs.v36HistorySearch = !current
    AppToast.show(this, "历史搜索：${if (!current) "开启" else "关闭"}")
}

// v36.10: 播放器进度条样式
internal fun PlayerActivity.showV36ProgressBarStyleDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "细线", "粗线", "渐变", "脉冲", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36ProgressBarStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条样式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { style -> BiliClient.prefs.v36ProgressBarStyle = style; AppToast.show(this, "进度条样式：${labels[options.indexOf(style)]}") }
}

// v36.11: 视频投射画面分辨率
internal fun PlayerActivity.showV36CastResolutionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "480p", "720p", "1080p", "2K", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v36CastResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射分辨率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { res -> BiliClient.prefs.v36CastResolution = res; AppToast.show(this, "投射分辨率：${labels[options.indexOf(res)]}") }
}

// v36.12: 弹幕字体背景模糊
internal fun PlayerActivity.showV36DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景模糊", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v36DanmakuBackgroundBlur = blur; AppToast.show(this, "背景模糊：$blur") }
}

// v36.13: 播放器手势长按速度
internal fun PlayerActivity.showV36GestureLongPressSpeedDialog() {
    val options = listOf(0.5f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
    val currentIndex = options.indexOf(BiliClient.prefs.v36GestureLongPressSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "长按速度", options = options, checkedIndex = currentIndex, label = { v -> "${v}x" }) { speed -> BiliClient.prefs.v36GestureLongPressSpeed = speed; AppToast.show(this, "长按速度：${speed}x") }
}

// v36.14: 视频画面色彩色调偏移
internal fun PlayerActivity.showV36ColorHueShiftDialog() {
    val options = listOf(-180, -90, 0, 90, 180)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorHueShift).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -180 -> "反转(-180)"; -90 -> "偏绿(-90)"; 0 -> "标准(0)"; 90 -> "偏蓝(+90)"; 180 -> "反转(+180)"; else -> "标准(0)" } }) { shift -> BiliClient.prefs.v36ColorHueShift = shift; AppToast.show(this, "色调偏移：$shift") }
}

// v36.15: 弹幕显示字体发光颜色
internal fun PlayerActivity.showV36DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v36DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

// v37.1: 视频播放列表随机播放
internal fun PlayerActivity.showV37PlaylistShuffleToggle() {
    val current = BiliClient.prefs.v37PlaylistShuffle
    BiliClient.prefs.v37PlaylistShuffle = !current
    AppToast.show(this, "随机播放：${if (!current) "开启" else "关闭"}")
}

// v37.2: 弹幕字体阴影颜色
internal fun PlayerActivity.showV37DanmakuShadowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "灰色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "阴影颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuShadowColor = color; AppToast.show(this, "阴影颜色：${labels[options.indexOf(color)]}") }
}

// v37.3: 视频画面色彩鲜艳度
internal fun PlayerActivity.showV37ColorVividnessDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorVividness).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "鲜艳度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "淡雅(-50)"; -25 -> "略淡(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { vivid -> BiliClient.prefs.v37ColorVividness = vivid; AppToast.show(this, "鲜艳度：$vivid") }
}

// v37.4: 弹幕发送确认震动衰减
internal fun PlayerActivity.showV37VibrationDecayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37VibrationDecay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动衰减", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "快速(25)"; 50 -> "中等(50)"; 75 -> "缓慢(75)"; 100 -> "极慢(100)"; else -> "关闭" } }) { decay -> BiliClient.prefs.v37VibrationDecay = decay; AppToast.show(this, "震动衰减：$decay") }
}

// v37.5: 播放器音量淡入淡出
internal fun PlayerActivity.showV37VolumeFadeToggle() {
    val current = BiliClient.prefs.v37VolumeFade
    BiliClient.prefs.v37VolumeFade = !current
    AppToast.show(this, "音量淡入淡出：${if (!current) "开启" else "关闭"}")
}

// v37.6: 视频缓存预加载
internal fun PlayerActivity.showV37CachePreloadToggle() {
    val current = BiliClient.prefs.v37CachePreload
    BiliClient.prefs.v37CachePreload = !current
    AppToast.show(this, "缓存预加载：${if (!current) "开启" else "关闭"}")
}

// v37.7: 弹幕显示滚动速度
internal fun PlayerActivity.showV37DanmakuScrollSpeedDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuScrollSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滚动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "极慢(-50)"; -25 -> "较慢(-25)"; 0 -> "正常(0)"; 25 -> "较快(+25)"; 50 -> "极快(+50)"; else -> "正常(0)" } }) { speed -> BiliClient.prefs.v37DanmakuScrollSpeed = speed; AppToast.show(this, "滚动速度：$speed") }
}

// v37.8: 视频画面色彩色阶
internal fun PlayerActivity.showV37ColorTonemapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "电影", "鲜艳", "柔和", "复古", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorTonemap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色阶映射", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { tonemap -> BiliClient.prefs.v37ColorTonemap = tonemap; AppToast.show(this, "色阶映射：${labels[options.indexOf(tonemap)]}") }
}

// v37.9: 弹幕发送历史记录导出
internal fun PlayerActivity.showV37HistoryExportToggle() {
    val current = BiliClient.prefs.v37HistoryExport
    BiliClient.prefs.v37HistoryExport = !current
    AppToast.show(this, "历史导出：${if (!current) "开启" else "关闭"}")
}

// v37.10: 播放器进度条高度
internal fun PlayerActivity.showV37ProgressBarHeightDialog() {
    val options = listOf(1, 2, 3, 5, 7, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ProgressBarHeight).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "进度条高度", options = options, checkedIndex = currentIndex, label = { v -> "${v}dp" }) { height -> BiliClient.prefs.v37ProgressBarHeight = height; AppToast.show(this, "进度条高度：${height}dp") }
}

// v37.11: 视频投射画面码率
internal fun PlayerActivity.showV37CastBitrateDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "1Mbps", "2Mbps", "5Mbps", "10Mbps", "20Mbps")
    val currentIndex = options.indexOf(BiliClient.prefs.v37CastBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射码率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { bitrate -> BiliClient.prefs.v37CastBitrate = bitrate; AppToast.show(this, "投射码率：${labels[options.indexOf(bitrate)]}") }
}

// v37.12: 弹幕字体背景边框颜色
internal fun PlayerActivity.showV37DanmakuBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "边框颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuBorderColor = color; AppToast.show(this, "边框颜色：${labels[options.indexOf(color)]}") }
}

// v37.13: 播放器手势双击功能
internal fun PlayerActivity.showV37GestureDoubleTapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "播放/暂停", "快进", "快退", "点赞", "收藏")
    val currentIndex = options.indexOf(BiliClient.prefs.v37GestureDoubleTap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "双击功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v37GestureDoubleTap = func; AppToast.show(this, "双击功能：${labels[options.indexOf(func)]}") }
}

// v37.14: 视频画面色彩色调饱和度
internal fun PlayerActivity.showV37ColorHueSaturationDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorHueSaturation).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调饱和度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "灰度(-50)"; -25 -> "淡雅(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { sat -> BiliClient.prefs.v37ColorHueSaturation = sat; AppToast.show(this, "色调饱和度：$sat") }
}

// v37.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV37DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v37DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}

// v38.1: 视频播放列表循环模式
internal fun PlayerActivity.showV38PlaylistLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顺序播放", "单曲循环", "列表循环", "随机播放")
    val currentIndex = options.indexOf(BiliClient.prefs.v38PlaylistLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "循环模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38PlaylistLoopMode = mode; AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}") }
}

// v38.2: 弹幕字体背景圆角
internal fun PlayerActivity.showV38DanmakuBackgroundRadiusDialog() {
    val options = listOf(0, 4, 8, 12, 16, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuBackgroundRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景圆角", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "直角"; 4 -> "微圆(4)"; 8 -> "圆角(8)"; 12 -> "较圆(12)"; 16 -> "很圆(16)"; 20 -> "极圆(20)"; else -> "直角" } }) { radius -> BiliClient.prefs.v38DanmakuBackgroundRadius = radius; AppToast.show(this, "背景圆角：$radius") }
}

// v38.3: 视频画面色彩对比度曲线
internal fun PlayerActivity.showV38ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.4: 弹幕发送确认震动频率
internal fun PlayerActivity.showV38VibrationFrequencyDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38VibrationFrequency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动频率", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "低频(25)"; 50 -> "中频(50)"; 75 -> "高频(75)"; 100 -> "极高频(100)"; else -> "关闭" } }) { freq -> BiliClient.prefs.v38VibrationFrequency = freq; AppToast.show(this, "震动频率：$freq") }
}

// v38.5: 播放器音量限制模式
internal fun PlayerActivity.showV38VolumeLimitModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "软限制", "硬限制", "自适应")
    val currentIndex = options.indexOf(BiliClient.prefs.v38VolumeLimitMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38VolumeLimitMode = mode; AppToast.show(this, "音量限制模式：${labels[options.indexOf(mode)]}") }
}

// v38.6: 视频缓存清理策略
internal fun PlayerActivity.showV38CacheCleanupStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("手动", "自动", "定时", "智能")
    val currentIndex = options.indexOf(BiliClient.prefs.v38CacheCleanupStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v38CacheCleanupStrategy = strategy; AppToast.show(this, "清理策略：${labels[options.indexOf(strategy)]}") }
}

// v38.7: 弹幕显示位置偏移X
internal fun PlayerActivity.showV38DanmakuOffsetXDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuOffsetX).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "水平偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "最右(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v38DanmakuOffsetX = offset; AppToast.show(this, "水平偏移：$offset") }
}

// v38.8: 视频画面色彩亮度曲线
internal fun PlayerActivity.showV38ColorBrightnessCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "亮度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorBrightnessCurve = curve; AppToast.show(this, "亮度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.9: 弹幕发送历史记录搜索模式
internal fun PlayerActivity.showV38HistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("精确匹配", "模糊匹配", "正则表达式", "拼音搜索")
    val currentIndex = options.indexOf(BiliClient.prefs.v38HistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "搜索模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38HistorySearchMode = mode; AppToast.show(this, "搜索模式：${labels[options.indexOf(mode)]}") }
}

// v38.10: 播放器进度条动画
internal fun PlayerActivity.showV38ProgressBarAnimationToggle() {
    val current = BiliClient.prefs.v38ProgressBarAnimation
    BiliClient.prefs.v38ProgressBarAnimation = !current
    AppToast.show(this, "进度条动画：${if (!current) "开启" else "关闭"}")
}

// v38.11: 视频投射画面延迟
internal fun PlayerActivity.showV38CastLatencyDialog() {
    val options = listOf(0, 1000, 2000, 3000, 4000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v38CastLatency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射延迟", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "自动"; 1000 -> "1秒"; 2000 -> "2秒"; 3000 -> "3秒"; 4000 -> "4秒"; 5000 -> "5秒"; else -> "自动" } }) { latency -> BiliClient.prefs.v38CastLatency = latency; AppToast.show(this, "投射延迟：${latency}ms") }
}

// v38.12: 弹幕字体背景渐变方向
internal fun PlayerActivity.showV38DanmakuGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从上到下", "从下到上")
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v38DanmakuGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v38.13: 播放器手势滑动灵敏度
internal fun PlayerActivity.showV38GestureSwipeSensitivityDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38GestureSwipeSensitivity).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动灵敏度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极低(10)"; 25 -> "较低(25)"; 50 -> "中等(50)"; 75 -> "较高(75)"; 100 -> "极高(100)"; else -> "中等(50)" } }) { sensitivity -> BiliClient.prefs.v38GestureSwipeSensitivity = sensitivity; AppToast.show(this, "滑动灵敏度：$sensitivity") }
}

// v38.14: 视频画面色彩饱和度曲线
internal fun PlayerActivity.showV38ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.15: 弹幕显示字体描边宽度
internal fun PlayerActivity.showV38DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "描边宽度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 1 -> "极细(1)"; 2 -> "细(2)"; 3 -> "中等(3)"; 5 -> "粗(5)"; 10 -> "极粗(10)"; else -> "关闭" } }) { width -> BiliClient.prefs.v38DanmakuFontStrokeWidth = width; AppToast.show(this, "描边宽度：$width") }
}

// v39.1: 视频播放列表自动跳过
internal fun PlayerActivity.showV39PlaylistAutoSkipToggle() {
    val current = BiliClient.prefs.v39PlaylistAutoSkip
    BiliClient.prefs.v39PlaylistAutoSkip = !current
    AppToast.show(this, "自动跳过：${if (!current) "开启" else "关闭"}")
}

// v39.2: 弹幕字体背景透明度曲线
internal fun PlayerActivity.showV39DanmakuBackgroundAlphaCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuBackgroundAlphaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "透明度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39DanmakuBackgroundAlphaCurve = curve; AppToast.show(this, "透明度曲线：${labels[options.indexOf(curve)]}") }
}

// v39.3: 视频画面色彩锐化强度
internal fun PlayerActivity.showV39ColorSharpenDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorSharpen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "锐化强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { sharpen -> BiliClient.prefs.v39ColorSharpen = sharpen; AppToast.show(this, "锐化强度：$sharpen") }
}

// v39.4: 弹幕发送确认震动模式曲线
internal fun PlayerActivity.showV39VibrationPatternCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39VibrationPatternCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39VibrationPatternCurve = curve; AppToast.show(this, "震动曲线：${labels[options.indexOf(curve)]}") }
}

// v39.5: 播放器音量平衡
internal fun PlayerActivity.showV39VolumeBalanceDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39VolumeBalance).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量平衡", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "全左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "全右(+100)"; else -> "居中(0)" } }) { balance -> BiliClient.prefs.v39VolumeBalance = balance; AppToast.show(this, "音量平衡：$balance") }
}

// v39.6: 视频缓存预加载大小
internal fun PlayerActivity.showV39CachePreloadSizeDialog() {
    val options = listOf(10, 50, 100, 200, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v39CachePreloadSize).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(title = "预加载大小", options = options, checkedIndex = currentIndex, label = { v -> "${v}MB" }) { size -> BiliClient.prefs.v39CachePreloadSize = size; AppToast.show(this, "预加载大小：${size}MB") }
}

// v39.7: 弹幕显示位置偏移Y
internal fun PlayerActivity.showV39DanmakuOffsetYDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuOffsetY).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "垂直偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最上(-100)"; -50 -> "偏上(-50)"; 0 -> "居中(0)"; 50 -> "偏下(+50)"; 100 -> "最下(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v39DanmakuOffsetY = offset; AppToast.show(this, "垂直偏移：$offset") }
}

// v39.8: 视频画面色彩降噪强度
internal fun PlayerActivity.showV39ColorDenoiseDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorDenoise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { denoise -> BiliClient.prefs.v39ColorDenoise = denoise; AppToast.show(this, "降噪强度：$denoise") }
}

// v39.9: 弹幕发送历史记录自动清理
internal fun PlayerActivity.showV39HistoryAutoCleanupToggle() {
    val current = BiliClient.prefs.v39HistoryAutoCleanup
    BiliClient.prefs.v39HistoryAutoCleanup = !current
    AppToast.show(this, "历史自动清理：${if (!current) "开启" else "关闭"}")
}

// v39.10: 播放器进度条颜色渐变
internal fun PlayerActivity.showV39ProgressBarGradientToggle() {
    val current = BiliClient.prefs.v39ProgressBarGradient
    BiliClient.prefs.v39ProgressBarGradient = !current
    AppToast.show(this, "进度条渐变：${if (!current) "开启" else "关闭"}")
}

// v39.11: 视频投射画面缓冲策略
internal fun PlayerActivity.showV39CastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "激进", "保守", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v39CastBufferStrategy = strategy; AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}") }
}

// v39.12: 弹幕字体背景渐变速度
internal fun PlayerActivity.showV39DanmakuGradientSpeedDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "慢速(25)"; 50 -> "中速(50)"; 75 -> "快速(75)"; 100 -> "极速(100)"; else -> "关闭" } }) { speed -> BiliClient.prefs.v39DanmakuGradientSpeed = speed; AppToast.show(this, "渐变速度：$speed") }
}

// v39.13: 播放器手势长按功能
internal fun PlayerActivity.showV39GestureLongPressDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "快进", "快退", "点赞", "收藏", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v39GestureLongPress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "长按功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v39GestureLongPress = func; AppToast.show(this, "长按功能：${labels[options.indexOf(func)]}") }
}

// v39.14: 视频画面色彩模糊强度
internal fun PlayerActivity.showV39ColorBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v39ColorBlur = blur; AppToast.show(this, "模糊强度：$blur") }
}

// v39.15: 弹幕显示字体发光模式
internal fun PlayerActivity.showV39DanmakuGlowModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "外发光", "内发光", "全发光")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGlowMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v39DanmakuGlowMode = mode; AppToast.show(this, "发光模式：${labels[options.indexOf(mode)]}") }
}

// v40.1: 视频播放列表智能排序
internal fun PlayerActivity.showV40PlaylistSmartSortToggle() {
    val current = BiliClient.prefs.v40PlaylistSmartSort
    BiliClient.prefs.v40PlaylistSmartSort = !current
    AppToast.show(this, "智能排序：${if (!current) "开启" else "关闭"}")
}

// v40.2: 弹幕字体背景渐变颜色
internal fun PlayerActivity.showV40DanmakuGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v40DanmakuGradientColor = color; AppToast.show(this, "渐变颜色：${labels[options.indexOf(color)]}") }
}

// v40.3: 视频画面色彩色调曲线
internal fun PlayerActivity.showV40ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

// v40.4: 弹幕发送确认震动强度曲线
internal fun PlayerActivity.showV40VibrationIntensityCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VibrationIntensityCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VibrationIntensityCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

// v40.5: 播放器音量限制阈值曲线
internal fun PlayerActivity.showV40VolumeLimitCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VolumeLimitCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VolumeLimitCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

// v40.6: 视频缓存清理策略曲线
internal fun PlayerActivity.showV40CacheCleanupCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CacheCleanupCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40CacheCleanupCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

// v40.7: 弹幕显示位置对齐方式曲线
internal fun PlayerActivity.showV40DanmakuAlignCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuAlignCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40DanmakuAlignCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

// v40.8: 视频画面色彩降噪曲线
internal fun PlayerActivity.showV40ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

// v40.9: 弹幕发送历史记录导出格式
internal fun PlayerActivity.showV40HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v40HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v40HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

// v40.10: 播放器进度条颜色渐变方向
internal fun PlayerActivity.showV40ProgressBarGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从中间到两端", "脉冲")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ProgressBarGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v40ProgressBarGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v40.11: 视频投射画面延迟策略
internal fun PlayerActivity.showV40CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "平衡")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v40CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

// v40.12: 弹幕字体背景渐变透明度
internal fun PlayerActivity.showV40DanmakuGradientAlphaDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { alpha -> BiliClient.prefs.v40DanmakuGradientAlpha = alpha; AppToast.show(this, "渐变透明度：${alpha}%") }
}

// v40.13: 播放器手势滑动速度
internal fun PlayerActivity.showV40GestureSwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40GestureSwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极慢(10)"; 25 -> "较慢(25)"; 50 -> "中等(50)"; 75 -> "较快(75)"; 100 -> "极快(100)"; else -> "中等(50)" } }) { speed -> BiliClient.prefs.v40GestureSwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

// v40.14: 视频画面色彩模糊曲线
internal fun PlayerActivity.showV40ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

// v40.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV40DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v40DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}

// v41.1: Playback Speed Memory
internal fun PlayerActivity.showV41PlaybackSpeedMemoryToggle() {
    val current = BiliClient.prefs.v41PlaybackSpeedMemory
    BiliClient.prefs.v41PlaybackSpeedMemory = !current
    AppToast.show(this, "Playback Speed Memory: ${if (!current) "ON" else "OFF"}")
}

// v41.2: Danmaku Vibration Mode
internal fun PlayerActivity.showV41DanmakuVibrationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Medium", "Strong")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuVibrationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuVibrationMode = value; AppToast.show(this, "Danmaku Vibration Mode: ${labels[options.indexOf(value)]}") }
}

// v41.3: Color Auto Adjust
internal fun PlayerActivity.showV41ColorAutoAdjustToggle() {
    val current = BiliClient.prefs.v41ColorAutoAdjust
    BiliClient.prefs.v41ColorAutoAdjust = !current
    AppToast.show(this, "Color Auto Adjust: ${if (!current) "ON" else "OFF"}")
}

// v41.4: Volume Boost Mode
internal fun PlayerActivity.showV41VolumeBoostModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeBoostMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Boost Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeBoostMode = value; AppToast.show(this, "Volume Boost Mode: ${labels[options.indexOf(value)]}") }
}

// v41.5: Danmaku Stroke Style
internal fun PlayerActivity.showV41DanmakuStrokeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("None", "Solid", "Dashed", "Dotted")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuStrokeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuStrokeStyle = value; AppToast.show(this, "Danmaku Stroke Style: ${labels[options.indexOf(value)]}") }
}

// v41.6: Cast Color Correction
internal fun PlayerActivity.showV41CastColorCorrectionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Warm", "Cool", "Vivid", "Natural", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastColorCorrection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Correction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastColorCorrection = value; AppToast.show(this, "Cast Color Correction: ${labels[options.indexOf(value)]}") }
}

// v41.7: Gesture Custom Mapping
internal fun PlayerActivity.showV41GestureCustomMappingDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Volume", "Brightness", "Seek", "PlayPause", "Fullscreen")
    val currentIndex = options.indexOf(BiliClient.prefs.v41GestureCustomMapping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Custom Mapping", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41GestureCustomMapping = value; AppToast.show(this, "Gesture Custom Mapping: ${labels[options.indexOf(value)]}") }
}

// v41.8: Danmaku Density Limit
internal fun PlayerActivity.showV41DanmakuDensityLimitDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuDensityLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Density Limit", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuDensityLimit = value; AppToast.show(this, "Danmaku Density Limit: ${labels[options.indexOf(value)]}") }
}

// v41.9: Cache Smart Cleanup
internal fun PlayerActivity.showV41CacheSmartCleanupToggle() {
    val current = BiliClient.prefs.v41CacheSmartCleanup
    BiliClient.prefs.v41CacheSmartCleanup = !current
    AppToast.show(this, "Cache Smart Cleanup: ${if (!current) "ON" else "OFF"}")
}

// v41.10: Progress Bar Buffer
internal fun PlayerActivity.showV41ProgressBarBufferToggle() {
    val current = BiliClient.prefs.v41ProgressBarBuffer
    BiliClient.prefs.v41ProgressBarBuffer = !current
    AppToast.show(this, "Progress Bar Buffer: ${if (!current) "ON" else "OFF"}")
}

// v41.11: Danmaku Vibration Feedback
internal fun PlayerActivity.showV41DanmakuVibrationFeedbackToggle() {
    val current = BiliClient.prefs.v41DanmakuVibrationFeedback
    BiliClient.prefs.v41DanmakuVibrationFeedback = !current
    AppToast.show(this, "Danmaku Vibration Feedback: ${if (!current) "ON" else "OFF"}")
}

// v41.12: Color HDR Simulation
internal fun PlayerActivity.showV41ColorHdrSimulationDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "HDR10", "HLG", "Dolby Vision")
    val currentIndex = options.indexOf(BiliClient.prefs.v41ColorHdrSimulation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color HDR Simulation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41ColorHdrSimulation = value; AppToast.show(this, "Color HDR Simulation: ${labels[options.indexOf(value)]}") }
}

// v41.13: Volume Limit Enhanced
internal fun PlayerActivity.showV41VolumeLimitEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeLimitEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeLimitEnhanced = value; AppToast.show(this, "Volume Limit Enhanced: ${labels[options.indexOf(value)]}") }
}

// v41.14: Danmaku Background Radius
internal fun PlayerActivity.showV41DanmakuBgRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuBgRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuBgRadius = value; AppToast.show(this, "Danmaku Background Radius: ${labels[options.indexOf(value)]}") }
}

// v41.15: Cast Audio Codec
internal fun PlayerActivity.showV41CastAudioCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "AAC", "OPUS", "FLAC")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastAudioCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastAudioCodec = value; AppToast.show(this, "Cast Audio Codec: ${labels[options.indexOf(value)]}") }
}

// v42.1: Danmaku Stroke Color
internal fun PlayerActivity.showV42DanmakuStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("White", "Black", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuStrokeColor = value; AppToast.show(this, "Danmaku Stroke Color: ${labels[options.indexOf(value)]}") }
}

// v42.2: Color Auto Contrast
internal fun PlayerActivity.showV42ColorAutoContrastToggle() {
    val current = BiliClient.prefs.v42ColorAutoContrast
    BiliClient.prefs.v42ColorAutoContrast = !current
    AppToast.show(this, "Color Auto Contrast: ${if (!current) "ON" else "OFF"}")
}

// v42.3: Gesture Vibration
internal fun PlayerActivity.showV42GestureVibrationToggle() {
    val current = BiliClient.prefs.v42GestureVibration
    BiliClient.prefs.v42GestureVibration = !current
    AppToast.show(this, "Gesture Vibration: ${if (!current) "ON" else "OFF"}")
}

// v42.4: Danmaku History Stats
internal fun PlayerActivity.showV42DanmakuHistoryStatsToggle() {
    val current = BiliClient.prefs.v42DanmakuHistoryStats
    BiliClient.prefs.v42DanmakuHistoryStats = !current
    AppToast.show(this, "Danmaku History Stats: ${if (!current) "ON" else "OFF"}")
}

// v42.5: Cache Auto Size
internal fun PlayerActivity.showV42CacheAutoSizeToggle() {
    val current = BiliClient.prefs.v42CacheAutoSize
    BiliClient.prefs.v42CacheAutoSize = !current
    AppToast.show(this, "Cache Auto Size: ${if (!current) "ON" else "OFF"}")
}

// v42.6: Progress Bar Color
internal fun PlayerActivity.showV42ProgressBarColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarColor = value; AppToast.show(this, "Progress Bar Color: ${labels[options.indexOf(value)]}") }
}

// v42.7: Danmaku Gradient Enhanced
internal fun PlayerActivity.showV42DanmakuGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuGradientEnhanced = value; AppToast.show(this, "Danmaku Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

// v42.8: Cast Color Enhance
internal fun PlayerActivity.showV42CastColorEnhanceDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CastColorEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CastColorEnhance = value; AppToast.show(this, "Cast Color Enhance: ${labels[options.indexOf(value)]}") }
}

// v42.9: Volume Step Custom
internal fun PlayerActivity.showV42VolumeStepCustomDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10, 15, 20)
    val labels = listOf("Off", "1", "2", "3", "5", "10", "15", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v42VolumeStepCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Step Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42VolumeStepCustom = value; AppToast.show(this, "Volume Step Custom: ${labels[options.indexOf(value)]}") }
}

// v42.10: Danmaku Smart Position
internal fun PlayerActivity.showV42DanmakuSmartPositionToggle() {
    val current = BiliClient.prefs.v42DanmakuSmartPosition
    BiliClient.prefs.v42DanmakuSmartPosition = !current
    AppToast.show(this, "Danmaku Smart Position: ${if (!current) "ON" else "OFF"}")
}

// v42.11: Color Auto Saturation
internal fun PlayerActivity.showV42ColorAutoSaturationToggle() {
    val current = BiliClient.prefs.v42ColorAutoSaturation
    BiliClient.prefs.v42ColorAutoSaturation = !current
    AppToast.show(this, "Color Auto Saturation: ${if (!current) "ON" else "OFF"}")
}

// v42.12: Gesture Long Press Vibration
internal fun PlayerActivity.showV42GestureLongPressVibrationToggle() {
    val current = BiliClient.prefs.v42GestureLongPressVibration
    BiliClient.prefs.v42GestureLongPressVibration = !current
    AppToast.show(this, "Gesture Long Press Vibration: ${if (!current) "ON" else "OFF"}")
}

// v42.13: Danmaku Vibration Duration
internal fun PlayerActivity.showV42DanmakuVibrationDurationDialog() {
    val options = listOf(0, 50, 100, 150, 200, 250, 300, 500)
    val labels = listOf("Off", "50ms", "100ms", "150ms", "200ms", "250ms", "300ms", "500ms")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuVibrationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Duration", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuVibrationDuration = value; AppToast.show(this, "Danmaku Vibration Duration: ${labels[options.indexOf(value)]}") }
}

// v42.14: Cache Preload Strategy
internal fun PlayerActivity.showV42CachePreloadStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Conservative", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CachePreloadStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Strategy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CachePreloadStrategy = value; AppToast.show(this, "Cache Preload Strategy: ${labels[options.indexOf(value)]}") }
}

// v42.15: Progress Bar Buffer Color
internal fun PlayerActivity.showV42ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Buffer Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarBufferColor = value; AppToast.show(this, "Progress Bar Buffer Color: ${labels[options.indexOf(value)]}") }
}

// v43.1: Color Auto Hue
internal fun PlayerActivity.showV43ColorAutoHueToggle() {
    val current = BiliClient.prefs.v43ColorAutoHue
    BiliClient.prefs.v43ColorAutoHue = !current
    AppToast.show(this, "Color Auto Hue: ${if (!current) "ON" else "OFF"}")
}

// v43.2: Danmaku Background Alpha
internal fun PlayerActivity.showV43DanmakuBgAlphaDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuBgAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Alpha", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuBgAlpha = value; AppToast.show(this, "Danmaku Background Alpha: ${labels[options.indexOf(value)]}") }
}

// v43.3: Gesture Double Tap Vibration
internal fun PlayerActivity.showV43GestureDoubleTapVibrationToggle() {
    val current = BiliClient.prefs.v43GestureDoubleTapVibration
    BiliClient.prefs.v43GestureDoubleTapVibration = !current
    AppToast.show(this, "Gesture Double Tap Vibration: ${if (!current) "ON" else "OFF"}")
}

// v43.4: Danmaku History Backup
internal fun PlayerActivity.showV43DanmakuHistoryBackupToggle() {
    val current = BiliClient.prefs.v43DanmakuHistoryBackup
    BiliClient.prefs.v43DanmakuHistoryBackup = !current
    AppToast.show(this, "Danmaku History Backup: ${if (!current) "ON" else "OFF"}")
}

// v43.5: Cache Cleanup Enhanced
internal fun PlayerActivity.showV43CacheCleanupEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CacheCleanupEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CacheCleanupEnhanced = value; AppToast.show(this, "Cache Cleanup Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.6: Progress Bar Gradient Enhanced
internal fun PlayerActivity.showV43ProgressBarGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarGradientEnhanced = value; AppToast.show(this, "Progress Bar Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.7: Danmaku Shadow Enhanced
internal fun PlayerActivity.showV43DanmakuShadowEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuShadowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Shadow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuShadowEnhanced = value; AppToast.show(this, "Danmaku Shadow Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.8: Cast Resolution Enhanced
internal fun PlayerActivity.showV43CastResolutionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "480p", "720p", "1080p", "1440p", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CastResolutionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Resolution Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CastResolutionEnhanced = value; AppToast.show(this, "Cast Resolution Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.9: Volume Limit Curve Enhanced
internal fun PlayerActivity.showV43VolumeLimitCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43VolumeLimitCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43VolumeLimitCurveEnhanced = value; AppToast.show(this, "Volume Limit Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.10: Danmaku Glow Enhanced
internal fun PlayerActivity.showV43DanmakuGlowEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuGlowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Glow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuGlowEnhanced = value; AppToast.show(this, "Danmaku Glow Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.11: Color Auto Brightness
internal fun PlayerActivity.showV43ColorAutoBrightnessToggle() {
    val current = BiliClient.prefs.v43ColorAutoBrightness
    BiliClient.prefs.v43ColorAutoBrightness = !current
    AppToast.show(this, "Color Auto Brightness: ${if (!current) "ON" else "OFF"}")
}

// v43.12: Gesture Swipe Vibration
internal fun PlayerActivity.showV43GestureSwipeVibrationToggle() {
    val current = BiliClient.prefs.v43GestureSwipeVibration
    BiliClient.prefs.v43GestureSwipeVibration = !current
    AppToast.show(this, "Gesture Swipe Vibration: ${if (!current) "ON" else "OFF"}")
}

// v43.13: Danmaku Vibration Mode Enhanced
internal fun PlayerActivity.showV43DanmakuVibrationModeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuVibrationModeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuVibrationModeEnhanced = value; AppToast.show(this, "Danmaku Vibration Mode Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.14: Cache Preload Size Enhanced
internal fun PlayerActivity.showV43CachePreloadSizeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Small", "Medium", "Large", "XL", "XXL")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CachePreloadSizeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Size Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CachePreloadSizeEnhanced = value; AppToast.show(this, "Cache Preload Size Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.15: Progress Bar Animation Enhanced
internal fun PlayerActivity.showV43ProgressBarAnimationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Fade", "Slide", "Pulse")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarAnimationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Animation Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarAnimationEnhanced = value; AppToast.show(this, "Progress Bar Animation Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.1: Color Denoise Enhanced
internal fun PlayerActivity.showV44ColorDenoiseEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorDenoiseEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Denoise Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorDenoiseEnhanced = value; AppToast.show(this, "Color Denoise Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.2: Danmaku Stroke Width Enhanced
internal fun PlayerActivity.showV44DanmakuStrokeWidthEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuStrokeWidthEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Width Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuStrokeWidthEnhanced = value; AppToast.show(this, "Danmaku Stroke Width Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.3: Gesture Long Press Speed Enhanced
internal fun PlayerActivity.showV44GestureLongPressSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Slowest", "Slower", "Normal", "Faster", "Fastest", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureLongPressSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureLongPressSpeedEnhanced = value; AppToast.show(this, "Gesture Long Press Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.4: Danmaku History Search Enhanced
internal fun PlayerActivity.showV44DanmakuHistorySearchEnhancedToggle() {
    val current = BiliClient.prefs.v44DanmakuHistorySearchEnhanced
    BiliClient.prefs.v44DanmakuHistorySearchEnhanced = !current
    AppToast.show(this, "Danmaku History Search Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v44.5: Cast Bitrate Enhanced
internal fun PlayerActivity.showV44CastBitrateEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastBitrateEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Bitrate Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastBitrateEnhanced = value; AppToast.show(this, "Cast Bitrate Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.6: Progress Bar Height Enhanced
internal fun PlayerActivity.showV44ProgressBarHeightEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarHeightEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Height Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarHeightEnhanced = value; AppToast.show(this, "Progress Bar Height Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.7: Danmaku Border Enhanced
internal fun PlayerActivity.showV44DanmakuBorderEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuBorderEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Border Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuBorderEnhanced = value; AppToast.show(this, "Danmaku Border Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.8: Color Blur Enhanced
internal fun PlayerActivity.showV44ColorBlurEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorBlurEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Blur Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorBlurEnhanced = value; AppToast.show(this, "Color Blur Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.9: Volume Fade Enhanced
internal fun PlayerActivity.showV44VolumeFadeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Fast", "Normal", "Slow", "VerySlow", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44VolumeFadeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Fade Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44VolumeFadeEnhanced = value; AppToast.show(this, "Volume Fade Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.10: Danmaku Scroll Speed Enhanced
internal fun PlayerActivity.showV44DanmakuScrollSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuScrollSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Scroll Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuScrollSpeedEnhanced = value; AppToast.show(this, "Danmaku Scroll Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.11: Cast Latency Enhanced
internal fun PlayerActivity.showV44CastLatencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastLatencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Latency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastLatencyEnhanced = value; AppToast.show(this, "Cast Latency Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.12: Gesture Swipe Sensitivity Enhanced
internal fun PlayerActivity.showV44GestureSwipeSensitivityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureSwipeSensitivityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Swipe Sensitivity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureSwipeSensitivityEnhanced = value; AppToast.show(this, "Gesture Swipe Sensitivity Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.13: Danmaku Vibration Frequency Enhanced
internal fun PlayerActivity.showV44DanmakuVibrationFrequencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Frequency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced = value; AppToast.show(this, "Danmaku Vibration Frequency Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.14: Cache Cleanup Curve Enhanced
internal fun PlayerActivity.showV44CacheCleanupCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CacheCleanupCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CacheCleanupCurveEnhanced = value; AppToast.show(this, "Cache Cleanup Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.15: Progress Bar Gradient Direction Enhanced
internal fun PlayerActivity.showV44ProgressBarGradientDirectionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("LR", "RL", "CenterOut", "Inward", "Diagonal", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Direction Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced = value; AppToast.show(this, "Progress Bar Gradient Direction Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.1: Color Sharpen Enhanced
internal fun PlayerActivity.showV45ColorSharpenEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorSharpenEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Sharpen Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorSharpenEnhanced = value; AppToast.show(this, "Color Sharpen Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.2: Danmaku Background Radius Enhanced
internal fun PlayerActivity.showV45DanmakuBgRadiusEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuBgRadiusEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuBgRadiusEnhanced = value; AppToast.show(this, "Danmaku Background Radius Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.3: Gesture Double Tap Enhanced
internal fun PlayerActivity.showV45GestureDoubleTapEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "PlayPause", "Fullscreen", "Like", "Next", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureDoubleTapEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Double Tap Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureDoubleTapEnhanced = value; AppToast.show(this, "Gesture Double Tap Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.4: Danmaku History Export Enhanced
internal fun PlayerActivity.showV45DanmakuHistoryExportEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuHistoryExportEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku History Export Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuHistoryExportEnhanced = value; AppToast.show(this, "Danmaku History Export Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.5: Cast Buffer Enhanced
internal fun PlayerActivity.showV45CastBufferEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Small", "Medium", "Large")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastBufferEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Buffer Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastBufferEnhanced = value; AppToast.show(this, "Cast Buffer Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.6: Progress Bar Style Enhanced
internal fun PlayerActivity.showV45ProgressBarStyleEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Thin", "Thick", "Gradient", "Neon", "Minimal")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ProgressBarStyleEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Style Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ProgressBarStyleEnhanced = value; AppToast.show(this, "Progress Bar Style Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.7: Danmaku Gradient Speed Enhanced
internal fun PlayerActivity.showV45DanmakuGradientSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuGradientSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuGradientSpeedEnhanced = value; AppToast.show(this, "Danmaku Gradient Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.8: Color Vividness Enhanced
internal fun PlayerActivity.showV45ColorVividnessEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorVividnessEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vividness Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorVividnessEnhanced = value; AppToast.show(this, "Color Vividness Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.9: Volume Balance Enhanced
internal fun PlayerActivity.showV45VolumeBalanceEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45VolumeBalanceEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Balance Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45VolumeBalanceEnhanced = value; AppToast.show(this, "Volume Balance Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.10: Danmaku Offset Enhanced
internal fun PlayerActivity.showV45DanmakuOffsetEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuOffsetEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Offset Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuOffsetEnhanced = value; AppToast.show(this, "Danmaku Offset Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.11: Cast Audio Enhanced
internal fun PlayerActivity.showV45CastAudioEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Stereo", "Mono", "Surround")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastAudioEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastAudioEnhanced = value; AppToast.show(this, "Cast Audio Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.12: Gesture Vibration Enhanced
internal fun PlayerActivity.showV45GestureVibrationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureVibrationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Vibration Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureVibrationEnhanced = value; AppToast.show(this, "Gesture Vibration Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.13: Danmaku Vibration Intensity Enhanced
internal fun PlayerActivity.showV45DanmakuVibrationIntensityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Intensity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced = value; AppToast.show(this, "Danmaku Vibration Intensity Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.14: Cache Smart Cleanup Enhanced
internal fun PlayerActivity.showV45CacheSmartCleanupEnhancedToggle() {
    val current = BiliClient.prefs.v45CacheSmartCleanupEnhanced
    BiliClient.prefs.v45CacheSmartCleanupEnhanced = !current
    AppToast.show(this, "Cache Smart Cleanup Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v45.15: Progress Bar Buffer Enhanced
internal fun PlayerActivity.showV45ProgressBarBufferEnhancedToggle() {
    val current = BiliClient.prefs.v45ProgressBarBufferEnhanced
    BiliClient.prefs.v45ProgressBarBufferEnhanced = !current
    AppToast.show(this, "Progress Bar Buffer Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v46.1: Playback Loop Memory
internal fun PlayerActivity.showV46PlaybackLoopMemoryToggle() {
    val current = BiliClient.prefs.v46PlaybackLoopMemory
    BiliClient.prefs.v46PlaybackLoopMemory = !current
    AppToast.show(this, "Playback Loop Memory: ${if (!current) "ON" else "OFF"}")
}

// v46.2: Danmaku Font Weight
internal fun PlayerActivity.showV46DanmakuFontWeightDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100", "200", "300", "400", "500", "600", "700", "800", "900")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuFontWeight = value; AppToast.show(this, "Danmaku Font Weight: ${labels[options.indexOf(value)]}") }
}

// v46.3: Color Auto Gamma
internal fun PlayerActivity.showV46ColorAutoGammaToggle() {
    val current = BiliClient.prefs.v46ColorAutoGamma
    BiliClient.prefs.v46ColorAutoGamma = !current
    AppToast.show(this, "Color Auto Gamma: ${if (!current) "ON" else "OFF"}")
}

// v46.4: Volume Normalization
internal fun PlayerActivity.showV46VolumeNormalizationToggle() {
    val current = BiliClient.prefs.v46VolumeNormalization
    BiliClient.prefs.v46VolumeNormalization = !current
    AppToast.show(this, "Volume Normalization: ${if (!current) "ON" else "OFF"}")
}

// v46.5: Danmaku Stroke Offset
internal fun PlayerActivity.showV46DanmakuStrokeOffsetDialog() {
    val options = listOf(-5,-4,-3,-2,-1,0,1,2,3,4,5)
    val labels = listOf("-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuStrokeOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Offset", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuStrokeOffset = value; AppToast.show(this, "Danmaku Stroke Offset: ${labels[options.indexOf(value)]}") }
}

// v46.6: Cast Color Temperature
internal fun PlayerActivity.showV46CastColorTemperatureDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Temperature", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastColorTemperature = value; AppToast.show(this, "Cast Color Temperature: ${labels[options.indexOf(value)]}") }
}

// v46.7: Gesture Edge Exclusion
internal fun PlayerActivity.showV46GestureEdgeExclusionDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v46GestureEdgeExclusion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Edge Exclusion", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46GestureEdgeExclusion = value; AppToast.show(this, "Gesture Edge Exclusion: ${labels[options.indexOf(value)]}") }
}

// v46.8: Danmaku Row Spacing
internal fun PlayerActivity.showV46DanmakuRowSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuRowSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Row Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuRowSpacing = value; AppToast.show(this, "Danmaku Row Spacing: ${labels[options.indexOf(value)]}") }
}

// v46.9: Cache Prefetch On Wifi
internal fun PlayerActivity.showV46CachePrefetchOnWifiToggle() {
    val current = BiliClient.prefs.v46CachePrefetchOnWifi
    BiliClient.prefs.v46CachePrefetchOnWifi = !current
    AppToast.show(this, "Cache Prefetch On Wifi: ${if (!current) "ON" else "OFF"}")
}

// v46.10: Progress Bar Thumb Size
internal fun PlayerActivity.showV46ProgressBarThumbSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ProgressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ProgressBarThumbSize = value; AppToast.show(this, "Progress Bar Thumb Size: ${labels[options.indexOf(value)]}") }
}

// v46.11: Danmaku Send Confirm Dialog
internal fun PlayerActivity.showV46DanmakuSendConfirmDialogToggle() {
    val current = BiliClient.prefs.v46DanmakuSendConfirmDialog
    BiliClient.prefs.v46DanmakuSendConfirmDialog = !current
    AppToast.show(this, "Danmaku Send Confirm Dialog: ${if (!current) "ON" else "OFF"}")
}

// v46.12: Color White Balance
internal fun PlayerActivity.showV46ColorWhiteBalanceDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ColorWhiteBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ColorWhiteBalance = value; AppToast.show(this, "Color White Balance: ${labels[options.indexOf(value)]}") }
}

// v46.13: Volume Limit Threshold
internal fun PlayerActivity.showV46VolumeLimitThresholdDialog() {
    val options = listOf(50,60,70,80,90,100,110,120,130,140,150)
    val labels = listOf("50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150")
    val currentIndex = options.indexOf(BiliClient.prefs.v46VolumeLimitThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46VolumeLimitThreshold = value; AppToast.show(this, "Volume Limit Threshold: ${labels[options.indexOf(value)]}") }
}

// v46.14: Danmaku Bg Padding
internal fun PlayerActivity.showV46DanmakuBgPaddingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuBgPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Padding", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuBgPadding = value; AppToast.show(this, "Danmaku Bg Padding: ${labels[options.indexOf(value)]}") }
}

// v46.15: Cast Video Codec
internal fun PlayerActivity.showV46CastVideoCodecDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastVideoCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastVideoCodec = value; AppToast.show(this, "Cast Video Codec: ${labels[options.indexOf(value)]}") }
}

// v47.1: Playback Resume Prompt
internal fun PlayerActivity.showV47PlaybackResumePromptToggle() {
    val current = BiliClient.prefs.v47PlaybackResumePrompt
    BiliClient.prefs.v47PlaybackResumePrompt = !current
    AppToast.show(this, "Playback Resume Prompt: ${if (!current) "ON" else "OFF"}")
}

// v47.2: Danmaku Font Spacing
internal fun PlayerActivity.showV47DanmakuFontSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuFontSpacing = value; AppToast.show(this, "Danmaku Font Spacing: ${labels[options.indexOf(value)]}") }
}

// v47.3: Color Exposure Compensation
internal fun PlayerActivity.showV47ColorExposureCompensationDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorExposureCompensation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Exposure Compensation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorExposureCompensation = value; AppToast.show(this, "Color Exposure Compensation: ${labels[options.indexOf(value)]}") }
}

// v47.4: Volume Loudness Enhancer
internal fun PlayerActivity.showV47VolumeLoudnessEnhancerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeLoudnessEnhancer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Loudness Enhancer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeLoudnessEnhancer = value; AppToast.show(this, "Volume Loudness Enhancer: ${labels[options.indexOf(value)]}") }
}

// v47.5: Danmaku Stroke Blur
internal fun PlayerActivity.showV47DanmakuStrokeBlurDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuStrokeBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Blur", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuStrokeBlur = value; AppToast.show(this, "Danmaku Stroke Blur: ${labels[options.indexOf(value)]}") }
}

// v47.6: Cast Audio Bitrate
internal fun PlayerActivity.showV47CastAudioBitrateDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Bitrate", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CastAudioBitrate = value; AppToast.show(this, "Cast Audio Bitrate: ${labels[options.indexOf(value)]}") }
}

// v47.7: Gesture Dead Zone
internal fun PlayerActivity.showV47GestureDeadZoneDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v47GestureDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Dead Zone", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47GestureDeadZone = value; AppToast.show(this, "Gesture Dead Zone: ${labels[options.indexOf(value)]}") }
}

// v47.8: Danmaku Max Lines
internal fun PlayerActivity.showV47DanmakuMaxLinesDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Max Lines", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuMaxLines = value; AppToast.show(this, "Danmaku Max Lines: ${labels[options.indexOf(value)]}") }
}

// v47.9: Cache Max Size Mb
internal fun PlayerActivity.showV47CacheMaxSizeMbDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CacheMaxSizeMb).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Max Size Mb", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CacheMaxSizeMb = value; AppToast.show(this, "Cache Max Size Mb: ${labels[options.indexOf(value)]}") }
}

// v47.10: Progress Bar Seek Preview
internal fun PlayerActivity.showV47ProgressBarSeekPreviewToggle() {
    val current = BiliClient.prefs.v47ProgressBarSeekPreview
    BiliClient.prefs.v47ProgressBarSeekPreview = !current
    AppToast.show(this, "Progress Bar Seek Preview: ${if (!current) "ON" else "OFF"}")
}

// v47.11: Danmaku Highlight Mention
internal fun PlayerActivity.showV47DanmakuHighlightMentionToggle() {
    val current = BiliClient.prefs.v47DanmakuHighlightMention
    BiliClient.prefs.v47DanmakuHighlightMention = !current
    AppToast.show(this, "Danmaku Highlight Mention: ${if (!current) "ON" else "OFF"}")
}

// v47.12: Color Tint
internal fun PlayerActivity.showV47ColorTintDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorTint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Tint", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorTint = value; AppToast.show(this, "Color Tint: ${labels[options.indexOf(value)]}") }
}

// v47.13: Volume Channel Balance
internal fun PlayerActivity.showV47VolumeChannelBalanceDialog() {
    val options = listOf(-50,-40,-30,-20,-10,0,10,20,30,40,50)
    val labels = listOf("-50", "-40", "-30", "-20", "-10", "0", "10", "20", "30", "40", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeChannelBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Channel Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeChannelBalance = value; AppToast.show(this, "Volume Channel Balance: ${labels[options.indexOf(value)]}") }
}

// v47.14: Danmaku Bg Border Color
internal fun PlayerActivity.showV47DanmakuBgBorderColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuBgBorderColor = value; AppToast.show(this, "Danmaku Bg Border Color: ${labels[options.indexOf(value)]}") }
}

// v47.15: Cast Subtitle Enabled
internal fun PlayerActivity.showV47CastSubtitleEnabledToggle() {
    val current = BiliClient.prefs.v47CastSubtitleEnabled
    BiliClient.prefs.v47CastSubtitleEnabled = !current
    AppToast.show(this, "Cast Subtitle Enabled: ${if (!current) "ON" else "OFF"}")
}

// v48.1: Playback Auto Skip Intro
internal fun PlayerActivity.showV48PlaybackAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v48PlaybackAutoSkipIntro
    BiliClient.prefs.v48PlaybackAutoSkipIntro = !current
    AppToast.show(this, "Playback Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

// v48.2: Danmaku Font Line Height
internal fun PlayerActivity.showV48DanmakuFontLineHeightDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuFontLineHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Line Height", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuFontLineHeight = value; AppToast.show(this, "Danmaku Font Line Height: ${labels[options.indexOf(value)]}") }
}

// v48.3: Color Black Level
internal fun PlayerActivity.showV48ColorBlackLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorBlackLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Black Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorBlackLevel = value; AppToast.show(this, "Color Black Level: ${labels[options.indexOf(value)]}") }
}

// v48.4: Volume Bass Boost
internal fun PlayerActivity.showV48VolumeBassBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeBassBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Bass Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeBassBoost = value; AppToast.show(this, "Volume Bass Boost: ${labels[options.indexOf(value)]}") }
}

// v48.5: Danmaku Send Max Length
internal fun PlayerActivity.showV48DanmakuSendMaxLengthDialog() {
    val options = listOf(20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200)
    val labels = listOf("20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Max Length", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuSendMaxLength = value; AppToast.show(this, "Danmaku Send Max Length: ${labels[options.indexOf(value)]}") }
}

// v48.6: Cast Resolution Auto
internal fun PlayerActivity.showV48CastResolutionAutoToggle() {
    val current = BiliClient.prefs.v48CastResolutionAuto
    BiliClient.prefs.v48CastResolutionAuto = !current
    AppToast.show(this, "Cast Resolution Auto: ${if (!current) "ON" else "OFF"}")
}

// v48.7: Gesture Tap Feedback
internal fun PlayerActivity.showV48GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v48GestureTapFeedback
    BiliClient.prefs.v48GestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

// v48.8: Danmaku Filter Regex
internal fun PlayerActivity.showV48DanmakuFilterRegexToggle() {
    val current = BiliClient.prefs.v48DanmakuFilterRegex
    BiliClient.prefs.v48DanmakuFilterRegex = !current
    AppToast.show(this, "Danmaku Filter Regex: ${if (!current) "ON" else "OFF"}")
}

// v48.9: Cache Cleanup Interval
internal fun PlayerActivity.showV48CacheCleanupIntervalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Interval", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CacheCleanupInterval = value; AppToast.show(this, "Cache Cleanup Interval: ${labels[options.indexOf(value)]}") }
}

// v48.10: Progress Bar Touch Area
internal fun PlayerActivity.showV48ProgressBarTouchAreaDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ProgressBarTouchArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Touch Area", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ProgressBarTouchArea = value; AppToast.show(this, "Progress Bar Touch Area: ${labels[options.indexOf(value)]}") }
}

// v48.11: Danmaku Font Size Adaptive
internal fun PlayerActivity.showV48DanmakuFontSizeAdaptiveToggle() {
    val current = BiliClient.prefs.v48DanmakuFontSizeAdaptive
    BiliClient.prefs.v48DanmakuFontSizeAdaptive = !current
    AppToast.show(this, "Danmaku Font Size Adaptive: ${if (!current) "ON" else "OFF"}")
}

// v48.12: Color White Level
internal fun PlayerActivity.showV48ColorWhiteLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorWhiteLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorWhiteLevel = value; AppToast.show(this, "Color White Level: ${labels[options.indexOf(value)]}") }
}

// v48.13: Volume Virtualizer
internal fun PlayerActivity.showV48VolumeVirtualizerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeVirtualizer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Virtualizer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeVirtualizer = value; AppToast.show(this, "Volume Virtualizer: ${labels[options.indexOf(value)]}") }
}

// v48.14: Danmaku Bg Shadow Size
internal fun PlayerActivity.showV48DanmakuBgShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuBgShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuBgShadowSize = value; AppToast.show(this, "Danmaku Bg Shadow Size: ${labels[options.indexOf(value)]}") }
}

// v48.15: Cast Mirror Quality
internal fun PlayerActivity.showV48CastMirrorQualityDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CastMirrorQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Mirror Quality", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CastMirrorQuality = value; AppToast.show(this, "Cast Mirror Quality: ${labels[options.indexOf(value)]}") }
}

// v49.1: Playback Auto Skip Outro
internal fun PlayerActivity.showV49PlaybackAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v49PlaybackAutoSkipOutro
    BiliClient.prefs.v49PlaybackAutoSkipOutro = !current
    AppToast.show(this, "Playback Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
}

// v49.2: Danmaku Font Letter Spacing
internal fun PlayerActivity.showV49DanmakuFontLetterSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Letter Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuFontLetterSpacing = value; AppToast.show(this, "Danmaku Font Letter Spacing: ${labels[options.indexOf(value)]}") }
}

// v49.3: Color Highlight Recovery
internal fun PlayerActivity.showV49ColorHighlightRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorHighlightRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Highlight Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorHighlightRecovery = value; AppToast.show(this, "Color Highlight Recovery: ${labels[options.indexOf(value)]}") }
}

// v49.4: Volume Treble Boost
internal fun PlayerActivity.showV49VolumeTrebleBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeTrebleBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Treble Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeTrebleBoost = value; AppToast.show(this, "Volume Treble Boost: ${labels[options.indexOf(value)]}") }
}

// v49.5: Danmaku Send Font Size
internal fun PlayerActivity.showV49DanmakuSendFontSizeDialog() {
    val options = listOf(12,14,16,18,20,22,24,26,28,30,32,34,36,38,40)
    val labels = listOf("12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuSendFontSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Font Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuSendFontSize = value; AppToast.show(this, "Danmaku Send Font Size: ${labels[options.indexOf(value)]}") }
}

// v49.6: Cast Audio Sync
internal fun PlayerActivity.showV49CastAudioSyncDialog() {
    val options = listOf(-500,-400,-300,-200,-100,0,100,200,300,400,500)
    val labels = listOf("-500", "-400", "-300", "-200", "-100", "0", "100", "200", "300", "400", "500")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CastAudioSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Sync", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CastAudioSync = value; AppToast.show(this, "Cast Audio Sync: ${labels[options.indexOf(value)]}") }
}

// v49.7: Gesture Long Press Action
internal fun PlayerActivity.showV49GestureLongPressActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49GestureLongPressAction = value; AppToast.show(this, "Gesture Long Press Action: ${labels[options.indexOf(value)]}") }
}

// v49.8: Danmaku Filter Duplicate
internal fun PlayerActivity.showV49DanmakuFilterDuplicateToggle() {
    val current = BiliClient.prefs.v49DanmakuFilterDuplicate
    BiliClient.prefs.v49DanmakuFilterDuplicate = !current
    AppToast.show(this, "Danmaku Filter Duplicate: ${if (!current) "ON" else "OFF"}")
}

// v49.9: Cache Auto Cleanup Threshold
internal fun PlayerActivity.showV49CacheAutoCleanupThresholdDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CacheAutoCleanupThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Auto Cleanup Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CacheAutoCleanupThreshold = value; AppToast.show(this, "Cache Auto Cleanup Threshold: ${labels[options.indexOf(value)]}") }
}

// v49.10: Progress Bar Chapter Mark
internal fun PlayerActivity.showV49ProgressBarChapterMarkToggle() {
    val current = BiliClient.prefs.v49ProgressBarChapterMark
    BiliClient.prefs.v49ProgressBarChapterMark = !current
    AppToast.show(this, "Progress Bar Chapter Mark: ${if (!current) "ON" else "OFF"}")
}

// v49.11: Danmaku Highlight Keyword
internal fun PlayerActivity.showV49DanmakuHighlightKeywordToggle() {
    val current = BiliClient.prefs.v49DanmakuHighlightKeyword
    BiliClient.prefs.v49DanmakuHighlightKeyword = !current
    AppToast.show(this, "Danmaku Highlight Keyword: ${if (!current) "ON" else "OFF"}")
}

// v49.12: Color Shadow Recovery
internal fun PlayerActivity.showV49ColorShadowRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorShadowRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Shadow Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorShadowRecovery = value; AppToast.show(this, "Color Shadow Recovery: ${labels[options.indexOf(value)]}") }
}

// v49.13: Volume Replay Gain
internal fun PlayerActivity.showV49VolumeReplayGainDialog() {
    val options = listOf(-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12)
    val labels = listOf("-12", "-10", "-8", "-6", "-4", "-2", "0", "2", "4", "6", "8", "10", "12")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeReplayGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Replay Gain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeReplayGain = value; AppToast.show(this, "Volume Replay Gain: ${labels[options.indexOf(value)]}") }
}
