package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1861: carried mode
internal fun PlayerActivity.showV1861CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861carried
    FeaturePrefsStore.batch1861.v1861carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1861: casting mode
internal fun PlayerActivity.showV1861CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1861casting
    FeaturePrefsStore.batch1861.v1861casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1861: catching mode
internal fun PlayerActivity.showV1861CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1861catching
    FeaturePrefsStore.batch1861.v1861catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1861: caused mode
internal fun PlayerActivity.showV1861CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861caused
    FeaturePrefsStore.batch1861.v1861caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1861: centered mode
internal fun PlayerActivity.showV1861CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1861centered
    FeaturePrefsStore.batch1861.v1861centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1861: changed level
internal fun PlayerActivity.showV1861ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1861changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1861changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1861: charging level
internal fun PlayerActivity.showV1861ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1861charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1861charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1861: checked level
internal fun PlayerActivity.showV1861CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1861checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1861checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1861: chilling level
internal fun PlayerActivity.showV1861ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1861chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1861chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1861: choosing level
internal fun PlayerActivity.showV1861ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1861choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1861choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1861: claimed mode
internal fun PlayerActivity.showV1861ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861claimed
    FeaturePrefsStore.batch1861.v1861claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1861: clamped mode
internal fun PlayerActivity.showV1861ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861clamped
    FeaturePrefsStore.batch1861.v1861clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1861: clashing mode
internal fun PlayerActivity.showV1861ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1861clashing
    FeaturePrefsStore.batch1861.v1861clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1861: cleaned mode
internal fun PlayerActivity.showV1861CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861cleaned
    FeaturePrefsStore.batch1861.v1861cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1861: cleared mode
internal fun PlayerActivity.showV1861ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1861cleared
    FeaturePrefsStore.batch1861.v1861cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1862: carried mode
internal fun PlayerActivity.showV1862CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862carried
    FeaturePrefsStore.batch1861.v1862carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1862: casting mode
internal fun PlayerActivity.showV1862CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1862casting
    FeaturePrefsStore.batch1861.v1862casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1862: catching mode
internal fun PlayerActivity.showV1862CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1862catching
    FeaturePrefsStore.batch1861.v1862catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1862: caused mode
internal fun PlayerActivity.showV1862CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862caused
    FeaturePrefsStore.batch1861.v1862caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1862: centered mode
internal fun PlayerActivity.showV1862CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1862centered
    FeaturePrefsStore.batch1861.v1862centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1862: changed level
internal fun PlayerActivity.showV1862ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1862changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1862changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1862: charging level
internal fun PlayerActivity.showV1862ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1862charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1862charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1862: checked level
internal fun PlayerActivity.showV1862CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1862checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1862checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1862: chilling level
internal fun PlayerActivity.showV1862ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1862chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1862chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1862: choosing level
internal fun PlayerActivity.showV1862ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1862choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1862choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1862: claimed mode
internal fun PlayerActivity.showV1862ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862claimed
    FeaturePrefsStore.batch1861.v1862claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1862: clamped mode
internal fun PlayerActivity.showV1862ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862clamped
    FeaturePrefsStore.batch1861.v1862clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1862: clashing mode
internal fun PlayerActivity.showV1862ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1862clashing
    FeaturePrefsStore.batch1861.v1862clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1862: cleaned mode
internal fun PlayerActivity.showV1862CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862cleaned
    FeaturePrefsStore.batch1861.v1862cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1862: cleared mode
internal fun PlayerActivity.showV1862ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1862cleared
    FeaturePrefsStore.batch1861.v1862cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1863: carried mode
internal fun PlayerActivity.showV1863CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863carried
    FeaturePrefsStore.batch1861.v1863carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1863: casting mode
internal fun PlayerActivity.showV1863CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1863casting
    FeaturePrefsStore.batch1861.v1863casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1863: catching mode
internal fun PlayerActivity.showV1863CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1863catching
    FeaturePrefsStore.batch1861.v1863catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1863: caused mode
internal fun PlayerActivity.showV1863CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863caused
    FeaturePrefsStore.batch1861.v1863caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1863: centered mode
internal fun PlayerActivity.showV1863CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1863centered
    FeaturePrefsStore.batch1861.v1863centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1863: changed level
internal fun PlayerActivity.showV1863ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1863changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1863changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1863: charging level
internal fun PlayerActivity.showV1863ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1863charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1863charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1863: checked level
internal fun PlayerActivity.showV1863CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1863checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1863checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1863: chilling level
internal fun PlayerActivity.showV1863ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1863chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1863chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1863: choosing level
internal fun PlayerActivity.showV1863ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1863choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1863choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1863: claimed mode
internal fun PlayerActivity.showV1863ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863claimed
    FeaturePrefsStore.batch1861.v1863claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1863: clamped mode
internal fun PlayerActivity.showV1863ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863clamped
    FeaturePrefsStore.batch1861.v1863clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1863: clashing mode
internal fun PlayerActivity.showV1863ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1863clashing
    FeaturePrefsStore.batch1861.v1863clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1863: cleaned mode
internal fun PlayerActivity.showV1863CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863cleaned
    FeaturePrefsStore.batch1861.v1863cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1863: cleared mode
internal fun PlayerActivity.showV1863ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1863cleared
    FeaturePrefsStore.batch1861.v1863cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1864: carried mode
internal fun PlayerActivity.showV1864CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864carried
    FeaturePrefsStore.batch1861.v1864carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1864: casting mode
internal fun PlayerActivity.showV1864CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1864casting
    FeaturePrefsStore.batch1861.v1864casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1864: catching mode
internal fun PlayerActivity.showV1864CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1864catching
    FeaturePrefsStore.batch1861.v1864catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1864: caused mode
internal fun PlayerActivity.showV1864CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864caused
    FeaturePrefsStore.batch1861.v1864caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1864: centered mode
internal fun PlayerActivity.showV1864CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1864centered
    FeaturePrefsStore.batch1861.v1864centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1864: changed level
internal fun PlayerActivity.showV1864ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1864changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1864changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1864: charging level
internal fun PlayerActivity.showV1864ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1864charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1864charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1864: checked level
internal fun PlayerActivity.showV1864CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1864checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1864checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1864: chilling level
internal fun PlayerActivity.showV1864ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1864chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1864chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1864: choosing level
internal fun PlayerActivity.showV1864ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1864choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1864choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1864: claimed mode
internal fun PlayerActivity.showV1864ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864claimed
    FeaturePrefsStore.batch1861.v1864claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1864: clamped mode
internal fun PlayerActivity.showV1864ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864clamped
    FeaturePrefsStore.batch1861.v1864clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1864: clashing mode
internal fun PlayerActivity.showV1864ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1864clashing
    FeaturePrefsStore.batch1861.v1864clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1864: cleaned mode
internal fun PlayerActivity.showV1864CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864cleaned
    FeaturePrefsStore.batch1861.v1864cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1864: cleared mode
internal fun PlayerActivity.showV1864ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1864cleared
    FeaturePrefsStore.batch1861.v1864cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1865: carried mode
internal fun PlayerActivity.showV1865CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865carried
    FeaturePrefsStore.batch1861.v1865carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1865: casting mode
internal fun PlayerActivity.showV1865CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1865casting
    FeaturePrefsStore.batch1861.v1865casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1865: catching mode
internal fun PlayerActivity.showV1865CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1865catching
    FeaturePrefsStore.batch1861.v1865catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1865: caused mode
internal fun PlayerActivity.showV1865CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865caused
    FeaturePrefsStore.batch1861.v1865caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1865: centered mode
internal fun PlayerActivity.showV1865CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1865centered
    FeaturePrefsStore.batch1861.v1865centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1865: changed level
internal fun PlayerActivity.showV1865ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1865changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1865changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1865: charging level
internal fun PlayerActivity.showV1865ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1865charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1865charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1865: checked level
internal fun PlayerActivity.showV1865CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1865checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1865checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1865: chilling level
internal fun PlayerActivity.showV1865ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1865chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1865chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1865: choosing level
internal fun PlayerActivity.showV1865ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1865choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1865choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1865: claimed mode
internal fun PlayerActivity.showV1865ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865claimed
    FeaturePrefsStore.batch1861.v1865claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1865: clamped mode
internal fun PlayerActivity.showV1865ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865clamped
    FeaturePrefsStore.batch1861.v1865clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1865: clashing mode
internal fun PlayerActivity.showV1865ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1865clashing
    FeaturePrefsStore.batch1861.v1865clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1865: cleaned mode
internal fun PlayerActivity.showV1865CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865cleaned
    FeaturePrefsStore.batch1861.v1865cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1865: cleared mode
internal fun PlayerActivity.showV1865ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1865cleared
    FeaturePrefsStore.batch1861.v1865cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1866: carried mode
internal fun PlayerActivity.showV1866CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866carried
    FeaturePrefsStore.batch1861.v1866carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1866: casting mode
internal fun PlayerActivity.showV1866CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1866casting
    FeaturePrefsStore.batch1861.v1866casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1866: catching mode
internal fun PlayerActivity.showV1866CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1866catching
    FeaturePrefsStore.batch1861.v1866catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1866: caused mode
internal fun PlayerActivity.showV1866CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866caused
    FeaturePrefsStore.batch1861.v1866caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1866: centered mode
internal fun PlayerActivity.showV1866CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1866centered
    FeaturePrefsStore.batch1861.v1866centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1866: changed level
internal fun PlayerActivity.showV1866ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1866changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1866changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1866: charging level
internal fun PlayerActivity.showV1866ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1866charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1866charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1866: checked level
internal fun PlayerActivity.showV1866CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1866checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1866checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1866: chilling level
internal fun PlayerActivity.showV1866ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1866chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1866chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1866: choosing level
internal fun PlayerActivity.showV1866ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1866choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1866choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1866: claimed mode
internal fun PlayerActivity.showV1866ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866claimed
    FeaturePrefsStore.batch1861.v1866claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1866: clamped mode
internal fun PlayerActivity.showV1866ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866clamped
    FeaturePrefsStore.batch1861.v1866clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1866: clashing mode
internal fun PlayerActivity.showV1866ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1866clashing
    FeaturePrefsStore.batch1861.v1866clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1866: cleaned mode
internal fun PlayerActivity.showV1866CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866cleaned
    FeaturePrefsStore.batch1861.v1866cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1866: cleared mode
internal fun PlayerActivity.showV1866ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1866cleared
    FeaturePrefsStore.batch1861.v1866cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1867: carried mode
internal fun PlayerActivity.showV1867CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867carried
    FeaturePrefsStore.batch1861.v1867carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1867: casting mode
internal fun PlayerActivity.showV1867CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1867casting
    FeaturePrefsStore.batch1861.v1867casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1867: catching mode
internal fun PlayerActivity.showV1867CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1867catching
    FeaturePrefsStore.batch1861.v1867catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1867: caused mode
internal fun PlayerActivity.showV1867CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867caused
    FeaturePrefsStore.batch1861.v1867caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1867: centered mode
internal fun PlayerActivity.showV1867CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1867centered
    FeaturePrefsStore.batch1861.v1867centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1867: changed level
internal fun PlayerActivity.showV1867ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1867changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1867changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1867: charging level
internal fun PlayerActivity.showV1867ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1867charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1867charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1867: checked level
internal fun PlayerActivity.showV1867CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1867checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1867checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1867: chilling level
internal fun PlayerActivity.showV1867ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1867chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1867chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1867: choosing level
internal fun PlayerActivity.showV1867ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1867choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1867choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1867: claimed mode
internal fun PlayerActivity.showV1867ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867claimed
    FeaturePrefsStore.batch1861.v1867claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1867: clamped mode
internal fun PlayerActivity.showV1867ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867clamped
    FeaturePrefsStore.batch1861.v1867clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1867: clashing mode
internal fun PlayerActivity.showV1867ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1867clashing
    FeaturePrefsStore.batch1861.v1867clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1867: cleaned mode
internal fun PlayerActivity.showV1867CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867cleaned
    FeaturePrefsStore.batch1861.v1867cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1867: cleared mode
internal fun PlayerActivity.showV1867ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1867cleared
    FeaturePrefsStore.batch1861.v1867cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1868: carried mode
internal fun PlayerActivity.showV1868CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868carried
    FeaturePrefsStore.batch1861.v1868carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1868: casting mode
internal fun PlayerActivity.showV1868CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1868casting
    FeaturePrefsStore.batch1861.v1868casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1868: catching mode
internal fun PlayerActivity.showV1868CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1868catching
    FeaturePrefsStore.batch1861.v1868catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1868: caused mode
internal fun PlayerActivity.showV1868CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868caused
    FeaturePrefsStore.batch1861.v1868caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1868: centered mode
internal fun PlayerActivity.showV1868CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1868centered
    FeaturePrefsStore.batch1861.v1868centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1868: changed level
internal fun PlayerActivity.showV1868ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1868changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1868changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1868: charging level
internal fun PlayerActivity.showV1868ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1868charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1868charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1868: checked level
internal fun PlayerActivity.showV1868CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1868checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1868checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1868: chilling level
internal fun PlayerActivity.showV1868ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1868chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1868chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1868: choosing level
internal fun PlayerActivity.showV1868ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1868choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1868choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1868: claimed mode
internal fun PlayerActivity.showV1868ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868claimed
    FeaturePrefsStore.batch1861.v1868claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1868: clamped mode
internal fun PlayerActivity.showV1868ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868clamped
    FeaturePrefsStore.batch1861.v1868clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1868: clashing mode
internal fun PlayerActivity.showV1868ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1868clashing
    FeaturePrefsStore.batch1861.v1868clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1868: cleaned mode
internal fun PlayerActivity.showV1868CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868cleaned
    FeaturePrefsStore.batch1861.v1868cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1868: cleared mode
internal fun PlayerActivity.showV1868ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1868cleared
    FeaturePrefsStore.batch1861.v1868cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1869: carried mode
internal fun PlayerActivity.showV1869CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869carried
    FeaturePrefsStore.batch1861.v1869carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1869: casting mode
internal fun PlayerActivity.showV1869CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1869casting
    FeaturePrefsStore.batch1861.v1869casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1869: catching mode
internal fun PlayerActivity.showV1869CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1869catching
    FeaturePrefsStore.batch1861.v1869catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1869: caused mode
internal fun PlayerActivity.showV1869CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869caused
    FeaturePrefsStore.batch1861.v1869caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1869: centered mode
internal fun PlayerActivity.showV1869CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1869centered
    FeaturePrefsStore.batch1861.v1869centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1869: changed level
internal fun PlayerActivity.showV1869ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1869changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1869changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1869: charging level
internal fun PlayerActivity.showV1869ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1869charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1869charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1869: checked level
internal fun PlayerActivity.showV1869CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1869checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1869checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1869: chilling level
internal fun PlayerActivity.showV1869ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1869chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1869chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1869: choosing level
internal fun PlayerActivity.showV1869ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1869choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1869choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1869: claimed mode
internal fun PlayerActivity.showV1869ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869claimed
    FeaturePrefsStore.batch1861.v1869claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1869: clamped mode
internal fun PlayerActivity.showV1869ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869clamped
    FeaturePrefsStore.batch1861.v1869clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1869: clashing mode
internal fun PlayerActivity.showV1869ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1869clashing
    FeaturePrefsStore.batch1861.v1869clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1869: cleaned mode
internal fun PlayerActivity.showV1869CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869cleaned
    FeaturePrefsStore.batch1861.v1869cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1869: cleared mode
internal fun PlayerActivity.showV1869ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1869cleared
    FeaturePrefsStore.batch1861.v1869cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

// v1870: carried mode
internal fun PlayerActivity.showV1870CarriedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870carried
    FeaturePrefsStore.batch1861.v1870carried = !current
    AppToast.show(this, "carried: ${if (!current) "ON" else "OFF"}")
}

// v1870: casting mode
internal fun PlayerActivity.showV1870CastingToggle() {
    val current = FeaturePrefsStore.batch1861.v1870casting
    FeaturePrefsStore.batch1861.v1870casting = !current
    AppToast.show(this, "casting: ${if (!current) "ON" else "OFF"}")
}

// v1870: catching mode
internal fun PlayerActivity.showV1870CatchingToggle() {
    val current = FeaturePrefsStore.batch1861.v1870catching
    FeaturePrefsStore.batch1861.v1870catching = !current
    AppToast.show(this, "catching: ${if (!current) "ON" else "OFF"}")
}

// v1870: caused mode
internal fun PlayerActivity.showV1870CausedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870caused
    FeaturePrefsStore.batch1861.v1870caused = !current
    AppToast.show(this, "caused: ${if (!current) "ON" else "OFF"}")
}

// v1870: centered mode
internal fun PlayerActivity.showV1870CenteredToggle() {
    val current = FeaturePrefsStore.batch1861.v1870centered
    FeaturePrefsStore.batch1861.v1870centered = !current
    AppToast.show(this, "centered: ${if (!current) "ON" else "OFF"}")
}

// v1870: changed level
internal fun PlayerActivity.showV1870ChangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1870changed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "changed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1870changed = value
        AppToast.show(this, "changed: $value")
    }
}

// v1870: charging level
internal fun PlayerActivity.showV1870ChargingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1870charging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1870charging = value
        AppToast.show(this, "charging: $value")
    }
}

// v1870: checked level
internal fun PlayerActivity.showV1870CheckedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1870checked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1870checked = value
        AppToast.show(this, "checked: $value")
    }
}

// v1870: chilling level
internal fun PlayerActivity.showV1870ChillingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1870chilling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chilling level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1870chilling = value
        AppToast.show(this, "chilling: $value")
    }
}

// v1870: choosing level
internal fun PlayerActivity.showV1870ChoosingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1861.v1870choosing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "choosing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1861.v1870choosing = value
        AppToast.show(this, "choosing: $value")
    }
}

// v1870: claimed mode
internal fun PlayerActivity.showV1870ClaimedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870claimed
    FeaturePrefsStore.batch1861.v1870claimed = !current
    AppToast.show(this, "claimed: ${if (!current) "ON" else "OFF"}")
}

// v1870: clamped mode
internal fun PlayerActivity.showV1870ClampedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870clamped
    FeaturePrefsStore.batch1861.v1870clamped = !current
    AppToast.show(this, "clamped: ${if (!current) "ON" else "OFF"}")
}

// v1870: clashing mode
internal fun PlayerActivity.showV1870ClashingToggle() {
    val current = FeaturePrefsStore.batch1861.v1870clashing
    FeaturePrefsStore.batch1861.v1870clashing = !current
    AppToast.show(this, "clashing: ${if (!current) "ON" else "OFF"}")
}

// v1870: cleaned mode
internal fun PlayerActivity.showV1870CleanedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870cleaned
    FeaturePrefsStore.batch1861.v1870cleaned = !current
    AppToast.show(this, "cleaned: ${if (!current) "ON" else "OFF"}")
}

// v1870: cleared mode
internal fun PlayerActivity.showV1870ClearedToggle() {
    val current = FeaturePrefsStore.batch1861.v1870cleared
    FeaturePrefsStore.batch1861.v1870cleared = !current
    AppToast.show(this, "cleared: ${if (!current) "ON" else "OFF"}")
}

