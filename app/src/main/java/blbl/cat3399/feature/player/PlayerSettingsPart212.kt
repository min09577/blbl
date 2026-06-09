package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2301: treated mode
internal fun PlayerActivity.showV2301TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301treated
    FeaturePrefsStore.batch2301.v2301treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2301: triggered mode
internal fun PlayerActivity.showV2301TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2301triggered
    FeaturePrefsStore.batch2301.v2301triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2301: trimmed mode
internal fun PlayerActivity.showV2301TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301trimmed
    FeaturePrefsStore.batch2301.v2301trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2301: troubleshooted mode
internal fun PlayerActivity.showV2301TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301troubleshooted
    FeaturePrefsStore.batch2301.v2301troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2301: trusted mode
internal fun PlayerActivity.showV2301TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301trusted
    FeaturePrefsStore.batch2301.v2301trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2301: tuned level
internal fun PlayerActivity.showV2301TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2301: turned level
internal fun PlayerActivity.showV2301TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2301: twisted level
internal fun PlayerActivity.showV2301TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2301: uncovered level
internal fun PlayerActivity.showV2301UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2301: undergone level
internal fun PlayerActivity.showV2301UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2301: underlined mode
internal fun PlayerActivity.showV2301UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301underlined
    FeaturePrefsStore.batch2301.v2301underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2301: understood mode
internal fun PlayerActivity.showV2301UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2301understood
    FeaturePrefsStore.batch2301.v2301understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2301: undertaken mode
internal fun PlayerActivity.showV2301UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2301undertaken
    FeaturePrefsStore.batch2301.v2301undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2301: unified mode
internal fun PlayerActivity.showV2301UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301unified
    FeaturePrefsStore.batch2301.v2301unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2301: updated mode
internal fun PlayerActivity.showV2301UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301updated
    FeaturePrefsStore.batch2301.v2301updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2302: treated mode
internal fun PlayerActivity.showV2302TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302treated
    FeaturePrefsStore.batch2301.v2302treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2302: triggered mode
internal fun PlayerActivity.showV2302TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2302triggered
    FeaturePrefsStore.batch2301.v2302triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2302: trimmed mode
internal fun PlayerActivity.showV2302TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302trimmed
    FeaturePrefsStore.batch2301.v2302trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2302: troubleshooted mode
internal fun PlayerActivity.showV2302TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302troubleshooted
    FeaturePrefsStore.batch2301.v2302troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2302: trusted mode
internal fun PlayerActivity.showV2302TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302trusted
    FeaturePrefsStore.batch2301.v2302trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2302: tuned level
internal fun PlayerActivity.showV2302TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2302: turned level
internal fun PlayerActivity.showV2302TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2302: twisted level
internal fun PlayerActivity.showV2302TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2302: uncovered level
internal fun PlayerActivity.showV2302UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2302: undergone level
internal fun PlayerActivity.showV2302UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2302: underlined mode
internal fun PlayerActivity.showV2302UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302underlined
    FeaturePrefsStore.batch2301.v2302underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2302: understood mode
internal fun PlayerActivity.showV2302UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2302understood
    FeaturePrefsStore.batch2301.v2302understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2302: undertaken mode
internal fun PlayerActivity.showV2302UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2302undertaken
    FeaturePrefsStore.batch2301.v2302undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2302: unified mode
internal fun PlayerActivity.showV2302UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302unified
    FeaturePrefsStore.batch2301.v2302unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2302: updated mode
internal fun PlayerActivity.showV2302UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302updated
    FeaturePrefsStore.batch2301.v2302updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2303: treated mode
internal fun PlayerActivity.showV2303TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303treated
    FeaturePrefsStore.batch2301.v2303treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2303: triggered mode
internal fun PlayerActivity.showV2303TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2303triggered
    FeaturePrefsStore.batch2301.v2303triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2303: trimmed mode
internal fun PlayerActivity.showV2303TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303trimmed
    FeaturePrefsStore.batch2301.v2303trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2303: troubleshooted mode
internal fun PlayerActivity.showV2303TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303troubleshooted
    FeaturePrefsStore.batch2301.v2303troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2303: trusted mode
internal fun PlayerActivity.showV2303TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303trusted
    FeaturePrefsStore.batch2301.v2303trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2303: tuned level
internal fun PlayerActivity.showV2303TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2303: turned level
internal fun PlayerActivity.showV2303TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2303: twisted level
internal fun PlayerActivity.showV2303TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2303: uncovered level
internal fun PlayerActivity.showV2303UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2303: undergone level
internal fun PlayerActivity.showV2303UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2303: underlined mode
internal fun PlayerActivity.showV2303UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303underlined
    FeaturePrefsStore.batch2301.v2303underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2303: understood mode
internal fun PlayerActivity.showV2303UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2303understood
    FeaturePrefsStore.batch2301.v2303understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2303: undertaken mode
internal fun PlayerActivity.showV2303UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2303undertaken
    FeaturePrefsStore.batch2301.v2303undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2303: unified mode
internal fun PlayerActivity.showV2303UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303unified
    FeaturePrefsStore.batch2301.v2303unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2303: updated mode
internal fun PlayerActivity.showV2303UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303updated
    FeaturePrefsStore.batch2301.v2303updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2304: treated mode
internal fun PlayerActivity.showV2304TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304treated
    FeaturePrefsStore.batch2301.v2304treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2304: triggered mode
internal fun PlayerActivity.showV2304TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2304triggered
    FeaturePrefsStore.batch2301.v2304triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2304: trimmed mode
internal fun PlayerActivity.showV2304TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304trimmed
    FeaturePrefsStore.batch2301.v2304trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2304: troubleshooted mode
internal fun PlayerActivity.showV2304TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304troubleshooted
    FeaturePrefsStore.batch2301.v2304troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2304: trusted mode
internal fun PlayerActivity.showV2304TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304trusted
    FeaturePrefsStore.batch2301.v2304trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2304: tuned level
internal fun PlayerActivity.showV2304TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2304: turned level
internal fun PlayerActivity.showV2304TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2304: twisted level
internal fun PlayerActivity.showV2304TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2304: uncovered level
internal fun PlayerActivity.showV2304UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2304: undergone level
internal fun PlayerActivity.showV2304UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2304: underlined mode
internal fun PlayerActivity.showV2304UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304underlined
    FeaturePrefsStore.batch2301.v2304underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2304: understood mode
internal fun PlayerActivity.showV2304UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2304understood
    FeaturePrefsStore.batch2301.v2304understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2304: undertaken mode
internal fun PlayerActivity.showV2304UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2304undertaken
    FeaturePrefsStore.batch2301.v2304undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2304: unified mode
internal fun PlayerActivity.showV2304UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304unified
    FeaturePrefsStore.batch2301.v2304unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2304: updated mode
internal fun PlayerActivity.showV2304UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304updated
    FeaturePrefsStore.batch2301.v2304updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2305: treated mode
internal fun PlayerActivity.showV2305TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305treated
    FeaturePrefsStore.batch2301.v2305treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2305: triggered mode
internal fun PlayerActivity.showV2305TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2305triggered
    FeaturePrefsStore.batch2301.v2305triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2305: trimmed mode
internal fun PlayerActivity.showV2305TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305trimmed
    FeaturePrefsStore.batch2301.v2305trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2305: troubleshooted mode
internal fun PlayerActivity.showV2305TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305troubleshooted
    FeaturePrefsStore.batch2301.v2305troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2305: trusted mode
internal fun PlayerActivity.showV2305TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305trusted
    FeaturePrefsStore.batch2301.v2305trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2305: tuned level
internal fun PlayerActivity.showV2305TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2305: turned level
internal fun PlayerActivity.showV2305TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2305: twisted level
internal fun PlayerActivity.showV2305TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2305: uncovered level
internal fun PlayerActivity.showV2305UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2305: undergone level
internal fun PlayerActivity.showV2305UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2305: underlined mode
internal fun PlayerActivity.showV2305UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305underlined
    FeaturePrefsStore.batch2301.v2305underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2305: understood mode
internal fun PlayerActivity.showV2305UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2305understood
    FeaturePrefsStore.batch2301.v2305understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2305: undertaken mode
internal fun PlayerActivity.showV2305UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2305undertaken
    FeaturePrefsStore.batch2301.v2305undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2305: unified mode
internal fun PlayerActivity.showV2305UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305unified
    FeaturePrefsStore.batch2301.v2305unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2305: updated mode
internal fun PlayerActivity.showV2305UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305updated
    FeaturePrefsStore.batch2301.v2305updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2306: treated mode
internal fun PlayerActivity.showV2306TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306treated
    FeaturePrefsStore.batch2301.v2306treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2306: triggered mode
internal fun PlayerActivity.showV2306TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2306triggered
    FeaturePrefsStore.batch2301.v2306triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2306: trimmed mode
internal fun PlayerActivity.showV2306TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306trimmed
    FeaturePrefsStore.batch2301.v2306trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2306: troubleshooted mode
internal fun PlayerActivity.showV2306TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306troubleshooted
    FeaturePrefsStore.batch2301.v2306troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2306: trusted mode
internal fun PlayerActivity.showV2306TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306trusted
    FeaturePrefsStore.batch2301.v2306trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2306: tuned level
internal fun PlayerActivity.showV2306TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2306: turned level
internal fun PlayerActivity.showV2306TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2306: twisted level
internal fun PlayerActivity.showV2306TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2306: uncovered level
internal fun PlayerActivity.showV2306UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2306: undergone level
internal fun PlayerActivity.showV2306UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2306: underlined mode
internal fun PlayerActivity.showV2306UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306underlined
    FeaturePrefsStore.batch2301.v2306underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2306: understood mode
internal fun PlayerActivity.showV2306UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2306understood
    FeaturePrefsStore.batch2301.v2306understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2306: undertaken mode
internal fun PlayerActivity.showV2306UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2306undertaken
    FeaturePrefsStore.batch2301.v2306undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2306: unified mode
internal fun PlayerActivity.showV2306UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306unified
    FeaturePrefsStore.batch2301.v2306unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2306: updated mode
internal fun PlayerActivity.showV2306UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306updated
    FeaturePrefsStore.batch2301.v2306updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2307: treated mode
internal fun PlayerActivity.showV2307TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307treated
    FeaturePrefsStore.batch2301.v2307treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2307: triggered mode
internal fun PlayerActivity.showV2307TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2307triggered
    FeaturePrefsStore.batch2301.v2307triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2307: trimmed mode
internal fun PlayerActivity.showV2307TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307trimmed
    FeaturePrefsStore.batch2301.v2307trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2307: troubleshooted mode
internal fun PlayerActivity.showV2307TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307troubleshooted
    FeaturePrefsStore.batch2301.v2307troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2307: trusted mode
internal fun PlayerActivity.showV2307TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307trusted
    FeaturePrefsStore.batch2301.v2307trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2307: tuned level
internal fun PlayerActivity.showV2307TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2307: turned level
internal fun PlayerActivity.showV2307TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2307: twisted level
internal fun PlayerActivity.showV2307TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2307: uncovered level
internal fun PlayerActivity.showV2307UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2307: undergone level
internal fun PlayerActivity.showV2307UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2307: underlined mode
internal fun PlayerActivity.showV2307UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307underlined
    FeaturePrefsStore.batch2301.v2307underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2307: understood mode
internal fun PlayerActivity.showV2307UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2307understood
    FeaturePrefsStore.batch2301.v2307understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2307: undertaken mode
internal fun PlayerActivity.showV2307UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2307undertaken
    FeaturePrefsStore.batch2301.v2307undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2307: unified mode
internal fun PlayerActivity.showV2307UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307unified
    FeaturePrefsStore.batch2301.v2307unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2307: updated mode
internal fun PlayerActivity.showV2307UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307updated
    FeaturePrefsStore.batch2301.v2307updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2308: treated mode
internal fun PlayerActivity.showV2308TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308treated
    FeaturePrefsStore.batch2301.v2308treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2308: triggered mode
internal fun PlayerActivity.showV2308TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2308triggered
    FeaturePrefsStore.batch2301.v2308triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2308: trimmed mode
internal fun PlayerActivity.showV2308TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308trimmed
    FeaturePrefsStore.batch2301.v2308trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2308: troubleshooted mode
internal fun PlayerActivity.showV2308TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308troubleshooted
    FeaturePrefsStore.batch2301.v2308troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2308: trusted mode
internal fun PlayerActivity.showV2308TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308trusted
    FeaturePrefsStore.batch2301.v2308trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2308: tuned level
internal fun PlayerActivity.showV2308TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2308: turned level
internal fun PlayerActivity.showV2308TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2308: twisted level
internal fun PlayerActivity.showV2308TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2308: uncovered level
internal fun PlayerActivity.showV2308UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2308: undergone level
internal fun PlayerActivity.showV2308UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2308: underlined mode
internal fun PlayerActivity.showV2308UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308underlined
    FeaturePrefsStore.batch2301.v2308underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2308: understood mode
internal fun PlayerActivity.showV2308UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2308understood
    FeaturePrefsStore.batch2301.v2308understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2308: undertaken mode
internal fun PlayerActivity.showV2308UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2308undertaken
    FeaturePrefsStore.batch2301.v2308undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2308: unified mode
internal fun PlayerActivity.showV2308UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308unified
    FeaturePrefsStore.batch2301.v2308unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2308: updated mode
internal fun PlayerActivity.showV2308UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308updated
    FeaturePrefsStore.batch2301.v2308updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2309: treated mode
internal fun PlayerActivity.showV2309TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309treated
    FeaturePrefsStore.batch2301.v2309treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2309: triggered mode
internal fun PlayerActivity.showV2309TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2309triggered
    FeaturePrefsStore.batch2301.v2309triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2309: trimmed mode
internal fun PlayerActivity.showV2309TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309trimmed
    FeaturePrefsStore.batch2301.v2309trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2309: troubleshooted mode
internal fun PlayerActivity.showV2309TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309troubleshooted
    FeaturePrefsStore.batch2301.v2309troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2309: trusted mode
internal fun PlayerActivity.showV2309TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309trusted
    FeaturePrefsStore.batch2301.v2309trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2309: tuned level
internal fun PlayerActivity.showV2309TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2309: turned level
internal fun PlayerActivity.showV2309TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2309: twisted level
internal fun PlayerActivity.showV2309TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2309: uncovered level
internal fun PlayerActivity.showV2309UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2309: undergone level
internal fun PlayerActivity.showV2309UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2309: underlined mode
internal fun PlayerActivity.showV2309UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309underlined
    FeaturePrefsStore.batch2301.v2309underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2309: understood mode
internal fun PlayerActivity.showV2309UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2309understood
    FeaturePrefsStore.batch2301.v2309understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2309: undertaken mode
internal fun PlayerActivity.showV2309UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2309undertaken
    FeaturePrefsStore.batch2301.v2309undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2309: unified mode
internal fun PlayerActivity.showV2309UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309unified
    FeaturePrefsStore.batch2301.v2309unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2309: updated mode
internal fun PlayerActivity.showV2309UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309updated
    FeaturePrefsStore.batch2301.v2309updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2310: treated mode
internal fun PlayerActivity.showV2310TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310treated
    FeaturePrefsStore.batch2301.v2310treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2310: triggered mode
internal fun PlayerActivity.showV2310TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2310triggered
    FeaturePrefsStore.batch2301.v2310triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2310: trimmed mode
internal fun PlayerActivity.showV2310TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310trimmed
    FeaturePrefsStore.batch2301.v2310trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2310: troubleshooted mode
internal fun PlayerActivity.showV2310TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310troubleshooted
    FeaturePrefsStore.batch2301.v2310troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2310: trusted mode
internal fun PlayerActivity.showV2310TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310trusted
    FeaturePrefsStore.batch2301.v2310trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2310: tuned level
internal fun PlayerActivity.showV2310TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2310: turned level
internal fun PlayerActivity.showV2310TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2310: twisted level
internal fun PlayerActivity.showV2310TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2310: uncovered level
internal fun PlayerActivity.showV2310UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2310: undergone level
internal fun PlayerActivity.showV2310UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2310: underlined mode
internal fun PlayerActivity.showV2310UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310underlined
    FeaturePrefsStore.batch2301.v2310underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2310: understood mode
internal fun PlayerActivity.showV2310UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2310understood
    FeaturePrefsStore.batch2301.v2310understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2310: undertaken mode
internal fun PlayerActivity.showV2310UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2310undertaken
    FeaturePrefsStore.batch2301.v2310undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2310: unified mode
internal fun PlayerActivity.showV2310UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310unified
    FeaturePrefsStore.batch2301.v2310unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2310: updated mode
internal fun PlayerActivity.showV2310UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310updated
    FeaturePrefsStore.batch2301.v2310updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

