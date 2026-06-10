package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2271: struggled mode
internal fun PlayerActivity.showV2271StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2271struggled
    FeaturePrefsStore.batch2271.v2271struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2271: stuck mode
internal fun PlayerActivity.showV2271StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2271stuck
    FeaturePrefsStore.batch2271.v2271stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2271: studied mode
internal fun PlayerActivity.showV2271StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271studied
    FeaturePrefsStore.batch2271.v2271studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2271: submitted mode
internal fun PlayerActivity.showV2271SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271submitted
    FeaturePrefsStore.batch2271.v2271submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2271: substituted mode
internal fun PlayerActivity.showV2271SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271substituted
    FeaturePrefsStore.batch2271.v2271substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2271: succeeded level
internal fun PlayerActivity.showV2271SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2271: suffered level
internal fun PlayerActivity.showV2271SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2271: suggested level
internal fun PlayerActivity.showV2271SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2271: summarized level
internal fun PlayerActivity.showV2271SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2271: supervised level
internal fun PlayerActivity.showV2271SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2271supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2271supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2271: supplied mode
internal fun PlayerActivity.showV2271SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271supplied
    FeaturePrefsStore.batch2271.v2271supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2271: supported mode
internal fun PlayerActivity.showV2271SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271supported
    FeaturePrefsStore.batch2271.v2271supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2271: suppressed mode
internal fun PlayerActivity.showV2271SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271suppressed
    FeaturePrefsStore.batch2271.v2271suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2271: surpassed mode
internal fun PlayerActivity.showV2271SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271surpassed
    FeaturePrefsStore.batch2271.v2271surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2271: surrounded mode
internal fun PlayerActivity.showV2271SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2271surrounded
    FeaturePrefsStore.batch2271.v2271surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2272: struggled mode
internal fun PlayerActivity.showV2272StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2272struggled
    FeaturePrefsStore.batch2271.v2272struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2272: stuck mode
internal fun PlayerActivity.showV2272StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2272stuck
    FeaturePrefsStore.batch2271.v2272stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2272: studied mode
internal fun PlayerActivity.showV2272StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272studied
    FeaturePrefsStore.batch2271.v2272studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2272: submitted mode
internal fun PlayerActivity.showV2272SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272submitted
    FeaturePrefsStore.batch2271.v2272submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2272: substituted mode
internal fun PlayerActivity.showV2272SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272substituted
    FeaturePrefsStore.batch2271.v2272substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2272: succeeded level
internal fun PlayerActivity.showV2272SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2272: suffered level
internal fun PlayerActivity.showV2272SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2272: suggested level
internal fun PlayerActivity.showV2272SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2272: summarized level
internal fun PlayerActivity.showV2272SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2272: supervised level
internal fun PlayerActivity.showV2272SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2272supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2272supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2272: supplied mode
internal fun PlayerActivity.showV2272SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272supplied
    FeaturePrefsStore.batch2271.v2272supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2272: supported mode
internal fun PlayerActivity.showV2272SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272supported
    FeaturePrefsStore.batch2271.v2272supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2272: suppressed mode
internal fun PlayerActivity.showV2272SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272suppressed
    FeaturePrefsStore.batch2271.v2272suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2272: surpassed mode
internal fun PlayerActivity.showV2272SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272surpassed
    FeaturePrefsStore.batch2271.v2272surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2272: surrounded mode
internal fun PlayerActivity.showV2272SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2272surrounded
    FeaturePrefsStore.batch2271.v2272surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2273: struggled mode
internal fun PlayerActivity.showV2273StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2273struggled
    FeaturePrefsStore.batch2271.v2273struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2273: stuck mode
internal fun PlayerActivity.showV2273StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2273stuck
    FeaturePrefsStore.batch2271.v2273stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2273: studied mode
internal fun PlayerActivity.showV2273StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273studied
    FeaturePrefsStore.batch2271.v2273studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2273: submitted mode
internal fun PlayerActivity.showV2273SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273submitted
    FeaturePrefsStore.batch2271.v2273submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2273: substituted mode
internal fun PlayerActivity.showV2273SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273substituted
    FeaturePrefsStore.batch2271.v2273substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2273: succeeded level
internal fun PlayerActivity.showV2273SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2273: suffered level
internal fun PlayerActivity.showV2273SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2273: suggested level
internal fun PlayerActivity.showV2273SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2273: summarized level
internal fun PlayerActivity.showV2273SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2273: supervised level
internal fun PlayerActivity.showV2273SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2273supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2273supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2273: supplied mode
internal fun PlayerActivity.showV2273SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273supplied
    FeaturePrefsStore.batch2271.v2273supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2273: supported mode
internal fun PlayerActivity.showV2273SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273supported
    FeaturePrefsStore.batch2271.v2273supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2273: suppressed mode
internal fun PlayerActivity.showV2273SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273suppressed
    FeaturePrefsStore.batch2271.v2273suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2273: surpassed mode
internal fun PlayerActivity.showV2273SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273surpassed
    FeaturePrefsStore.batch2271.v2273surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2273: surrounded mode
internal fun PlayerActivity.showV2273SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2273surrounded
    FeaturePrefsStore.batch2271.v2273surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2274: struggled mode
internal fun PlayerActivity.showV2274StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2274struggled
    FeaturePrefsStore.batch2271.v2274struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2274: stuck mode
internal fun PlayerActivity.showV2274StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2274stuck
    FeaturePrefsStore.batch2271.v2274stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2274: studied mode
internal fun PlayerActivity.showV2274StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274studied
    FeaturePrefsStore.batch2271.v2274studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2274: submitted mode
internal fun PlayerActivity.showV2274SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274submitted
    FeaturePrefsStore.batch2271.v2274submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2274: substituted mode
internal fun PlayerActivity.showV2274SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274substituted
    FeaturePrefsStore.batch2271.v2274substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2274: succeeded level
internal fun PlayerActivity.showV2274SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2274: suffered level
internal fun PlayerActivity.showV2274SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2274: suggested level
internal fun PlayerActivity.showV2274SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2274: summarized level
internal fun PlayerActivity.showV2274SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2274: supervised level
internal fun PlayerActivity.showV2274SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2274supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2274supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2274: supplied mode
internal fun PlayerActivity.showV2274SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274supplied
    FeaturePrefsStore.batch2271.v2274supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2274: supported mode
internal fun PlayerActivity.showV2274SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274supported
    FeaturePrefsStore.batch2271.v2274supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2274: suppressed mode
internal fun PlayerActivity.showV2274SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274suppressed
    FeaturePrefsStore.batch2271.v2274suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2274: surpassed mode
internal fun PlayerActivity.showV2274SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274surpassed
    FeaturePrefsStore.batch2271.v2274surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2274: surrounded mode
internal fun PlayerActivity.showV2274SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2274surrounded
    FeaturePrefsStore.batch2271.v2274surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2275: struggled mode
internal fun PlayerActivity.showV2275StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2275struggled
    FeaturePrefsStore.batch2271.v2275struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2275: stuck mode
internal fun PlayerActivity.showV2275StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2275stuck
    FeaturePrefsStore.batch2271.v2275stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2275: studied mode
internal fun PlayerActivity.showV2275StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275studied
    FeaturePrefsStore.batch2271.v2275studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2275: submitted mode
internal fun PlayerActivity.showV2275SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275submitted
    FeaturePrefsStore.batch2271.v2275submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2275: substituted mode
internal fun PlayerActivity.showV2275SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275substituted
    FeaturePrefsStore.batch2271.v2275substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2275: succeeded level
internal fun PlayerActivity.showV2275SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2275: suffered level
internal fun PlayerActivity.showV2275SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2275: suggested level
internal fun PlayerActivity.showV2275SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2275: summarized level
internal fun PlayerActivity.showV2275SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2275: supervised level
internal fun PlayerActivity.showV2275SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2275supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2275supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2275: supplied mode
internal fun PlayerActivity.showV2275SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275supplied
    FeaturePrefsStore.batch2271.v2275supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2275: supported mode
internal fun PlayerActivity.showV2275SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275supported
    FeaturePrefsStore.batch2271.v2275supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2275: suppressed mode
internal fun PlayerActivity.showV2275SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275suppressed
    FeaturePrefsStore.batch2271.v2275suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2275: surpassed mode
internal fun PlayerActivity.showV2275SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275surpassed
    FeaturePrefsStore.batch2271.v2275surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2275: surrounded mode
internal fun PlayerActivity.showV2275SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2275surrounded
    FeaturePrefsStore.batch2271.v2275surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2276: struggled mode
internal fun PlayerActivity.showV2276StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2276struggled
    FeaturePrefsStore.batch2271.v2276struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2276: stuck mode
internal fun PlayerActivity.showV2276StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2276stuck
    FeaturePrefsStore.batch2271.v2276stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2276: studied mode
internal fun PlayerActivity.showV2276StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276studied
    FeaturePrefsStore.batch2271.v2276studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2276: submitted mode
internal fun PlayerActivity.showV2276SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276submitted
    FeaturePrefsStore.batch2271.v2276submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2276: substituted mode
internal fun PlayerActivity.showV2276SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276substituted
    FeaturePrefsStore.batch2271.v2276substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2276: succeeded level
internal fun PlayerActivity.showV2276SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2276: suffered level
internal fun PlayerActivity.showV2276SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2276: suggested level
internal fun PlayerActivity.showV2276SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2276: summarized level
internal fun PlayerActivity.showV2276SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2276: supervised level
internal fun PlayerActivity.showV2276SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2276supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2276supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2276: supplied mode
internal fun PlayerActivity.showV2276SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276supplied
    FeaturePrefsStore.batch2271.v2276supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2276: supported mode
internal fun PlayerActivity.showV2276SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276supported
    FeaturePrefsStore.batch2271.v2276supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2276: suppressed mode
internal fun PlayerActivity.showV2276SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276suppressed
    FeaturePrefsStore.batch2271.v2276suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2276: surpassed mode
internal fun PlayerActivity.showV2276SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276surpassed
    FeaturePrefsStore.batch2271.v2276surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2276: surrounded mode
internal fun PlayerActivity.showV2276SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2276surrounded
    FeaturePrefsStore.batch2271.v2276surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2277: struggled mode
internal fun PlayerActivity.showV2277StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2277struggled
    FeaturePrefsStore.batch2271.v2277struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2277: stuck mode
internal fun PlayerActivity.showV2277StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2277stuck
    FeaturePrefsStore.batch2271.v2277stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2277: studied mode
internal fun PlayerActivity.showV2277StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277studied
    FeaturePrefsStore.batch2271.v2277studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2277: submitted mode
internal fun PlayerActivity.showV2277SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277submitted
    FeaturePrefsStore.batch2271.v2277submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2277: substituted mode
internal fun PlayerActivity.showV2277SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277substituted
    FeaturePrefsStore.batch2271.v2277substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2277: succeeded level
internal fun PlayerActivity.showV2277SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2277: suffered level
internal fun PlayerActivity.showV2277SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2277: suggested level
internal fun PlayerActivity.showV2277SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2277: summarized level
internal fun PlayerActivity.showV2277SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2277: supervised level
internal fun PlayerActivity.showV2277SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2277supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2277supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2277: supplied mode
internal fun PlayerActivity.showV2277SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277supplied
    FeaturePrefsStore.batch2271.v2277supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2277: supported mode
internal fun PlayerActivity.showV2277SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277supported
    FeaturePrefsStore.batch2271.v2277supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2277: suppressed mode
internal fun PlayerActivity.showV2277SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277suppressed
    FeaturePrefsStore.batch2271.v2277suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2277: surpassed mode
internal fun PlayerActivity.showV2277SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277surpassed
    FeaturePrefsStore.batch2271.v2277surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2277: surrounded mode
internal fun PlayerActivity.showV2277SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2277surrounded
    FeaturePrefsStore.batch2271.v2277surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2278: struggled mode
internal fun PlayerActivity.showV2278StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2278struggled
    FeaturePrefsStore.batch2271.v2278struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2278: stuck mode
internal fun PlayerActivity.showV2278StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2278stuck
    FeaturePrefsStore.batch2271.v2278stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2278: studied mode
internal fun PlayerActivity.showV2278StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278studied
    FeaturePrefsStore.batch2271.v2278studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2278: submitted mode
internal fun PlayerActivity.showV2278SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278submitted
    FeaturePrefsStore.batch2271.v2278submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2278: substituted mode
internal fun PlayerActivity.showV2278SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278substituted
    FeaturePrefsStore.batch2271.v2278substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2278: succeeded level
internal fun PlayerActivity.showV2278SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2278: suffered level
internal fun PlayerActivity.showV2278SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2278: suggested level
internal fun PlayerActivity.showV2278SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2278: summarized level
internal fun PlayerActivity.showV2278SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2278: supervised level
internal fun PlayerActivity.showV2278SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2278supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2278supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2278: supplied mode
internal fun PlayerActivity.showV2278SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278supplied
    FeaturePrefsStore.batch2271.v2278supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2278: supported mode
internal fun PlayerActivity.showV2278SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278supported
    FeaturePrefsStore.batch2271.v2278supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2278: suppressed mode
internal fun PlayerActivity.showV2278SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278suppressed
    FeaturePrefsStore.batch2271.v2278suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2278: surpassed mode
internal fun PlayerActivity.showV2278SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278surpassed
    FeaturePrefsStore.batch2271.v2278surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2278: surrounded mode
internal fun PlayerActivity.showV2278SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2278surrounded
    FeaturePrefsStore.batch2271.v2278surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2279: struggled mode
internal fun PlayerActivity.showV2279StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2279struggled
    FeaturePrefsStore.batch2271.v2279struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2279: stuck mode
internal fun PlayerActivity.showV2279StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2279stuck
    FeaturePrefsStore.batch2271.v2279stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2279: studied mode
internal fun PlayerActivity.showV2279StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279studied
    FeaturePrefsStore.batch2271.v2279studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2279: submitted mode
internal fun PlayerActivity.showV2279SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279submitted
    FeaturePrefsStore.batch2271.v2279submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2279: substituted mode
internal fun PlayerActivity.showV2279SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279substituted
    FeaturePrefsStore.batch2271.v2279substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2279: succeeded level
internal fun PlayerActivity.showV2279SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2279: suffered level
internal fun PlayerActivity.showV2279SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2279: suggested level
internal fun PlayerActivity.showV2279SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2279: summarized level
internal fun PlayerActivity.showV2279SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2279: supervised level
internal fun PlayerActivity.showV2279SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2279supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2279supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2279: supplied mode
internal fun PlayerActivity.showV2279SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279supplied
    FeaturePrefsStore.batch2271.v2279supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2279: supported mode
internal fun PlayerActivity.showV2279SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279supported
    FeaturePrefsStore.batch2271.v2279supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2279: suppressed mode
internal fun PlayerActivity.showV2279SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279suppressed
    FeaturePrefsStore.batch2271.v2279suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2279: surpassed mode
internal fun PlayerActivity.showV2279SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279surpassed
    FeaturePrefsStore.batch2271.v2279surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2279: surrounded mode
internal fun PlayerActivity.showV2279SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2279surrounded
    FeaturePrefsStore.batch2271.v2279surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

// v2280: struggled mode
internal fun PlayerActivity.showV2280StruggledToggle() {
    val current = FeaturePrefsStore.batch2271.v2280struggled
    FeaturePrefsStore.batch2271.v2280struggled = !current
    AppToast.show(this, "struggled: ${if (!current) "ON" else "OFF"}")
}

// v2280: stuck mode
internal fun PlayerActivity.showV2280StuckToggle() {
    val current = FeaturePrefsStore.batch2271.v2280stuck
    FeaturePrefsStore.batch2271.v2280stuck = !current
    AppToast.show(this, "stuck: ${if (!current) "ON" else "OFF"}")
}

// v2280: studied mode
internal fun PlayerActivity.showV2280StudiedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280studied
    FeaturePrefsStore.batch2271.v2280studied = !current
    AppToast.show(this, "studied: ${if (!current) "ON" else "OFF"}")
}

// v2280: submitted mode
internal fun PlayerActivity.showV2280SubmittedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280submitted
    FeaturePrefsStore.batch2271.v2280submitted = !current
    AppToast.show(this, "submitted: ${if (!current) "ON" else "OFF"}")
}

// v2280: substituted mode
internal fun PlayerActivity.showV2280SubstitutedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280substituted
    FeaturePrefsStore.batch2271.v2280substituted = !current
    AppToast.show(this, "substituted: ${if (!current) "ON" else "OFF"}")
}

// v2280: succeeded level
internal fun PlayerActivity.showV2280SucceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280succeeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "succeeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280succeeded = value
        AppToast.show(this, "succeeded: $value")
    }
}

// v2280: suffered level
internal fun PlayerActivity.showV2280SufferedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280suffered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280suffered = value
        AppToast.show(this, "suffered: $value")
    }
}

// v2280: suggested level
internal fun PlayerActivity.showV2280SuggestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280suggested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suggested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280suggested = value
        AppToast.show(this, "suggested: $value")
    }
}

// v2280: summarized level
internal fun PlayerActivity.showV2280SummarizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280summarized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "summarized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280summarized = value
        AppToast.show(this, "summarized: $value")
    }
}

// v2280: supervised level
internal fun PlayerActivity.showV2280SupervisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2271.v2280supervised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "supervised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2271.v2280supervised = value
        AppToast.show(this, "supervised: $value")
    }
}

// v2280: supplied mode
internal fun PlayerActivity.showV2280SuppliedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280supplied
    FeaturePrefsStore.batch2271.v2280supplied = !current
    AppToast.show(this, "supplied: ${if (!current) "ON" else "OFF"}")
}

// v2280: supported mode
internal fun PlayerActivity.showV2280SupportedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280supported
    FeaturePrefsStore.batch2271.v2280supported = !current
    AppToast.show(this, "supported: ${if (!current) "ON" else "OFF"}")
}

// v2280: suppressed mode
internal fun PlayerActivity.showV2280SuppressedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280suppressed
    FeaturePrefsStore.batch2271.v2280suppressed = !current
    AppToast.show(this, "suppressed: ${if (!current) "ON" else "OFF"}")
}

// v2280: surpassed mode
internal fun PlayerActivity.showV2280SurpassedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280surpassed
    FeaturePrefsStore.batch2271.v2280surpassed = !current
    AppToast.show(this, "surpassed: ${if (!current) "ON" else "OFF"}")
}

// v2280: surrounded mode
internal fun PlayerActivity.showV2280SurroundedToggle() {
    val current = FeaturePrefsStore.batch2271.v2280surrounded
    FeaturePrefsStore.batch2271.v2280surrounded = !current
    AppToast.show(this, "surrounded: ${if (!current) "ON" else "OFF"}")
}

