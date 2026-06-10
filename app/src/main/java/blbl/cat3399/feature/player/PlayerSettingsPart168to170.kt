package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v1871: clicked mode
internal fun PlayerActivity.showV1871ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871clicked
    FeaturePrefsStore.batch1871.v1871clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1871: climbed mode
internal fun PlayerActivity.showV1871ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871climbed
    FeaturePrefsStore.batch1871.v1871climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1871: cloned mode
internal fun PlayerActivity.showV1871ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871cloned
    FeaturePrefsStore.batch1871.v1871cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1871: closed mode
internal fun PlayerActivity.showV1871ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871closed
    FeaturePrefsStore.batch1871.v1871closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1871: coated mode
internal fun PlayerActivity.showV1871CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871coated
    FeaturePrefsStore.batch1871.v1871coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1871: coded level
internal fun PlayerActivity.showV1871CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1871: collapsed level
internal fun PlayerActivity.showV1871CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1871: collected level
internal fun PlayerActivity.showV1871CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1871: combined level
internal fun PlayerActivity.showV1871CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1871: comforted level
internal fun PlayerActivity.showV1871ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1871: commanded mode
internal fun PlayerActivity.showV1871CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871commanded
    FeaturePrefsStore.batch1871.v1871commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1871: commented mode
internal fun PlayerActivity.showV1871CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871commented
    FeaturePrefsStore.batch1871.v1871commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1871: committed mode
internal fun PlayerActivity.showV1871CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871committed
    FeaturePrefsStore.batch1871.v1871committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1871: communicated mode
internal fun PlayerActivity.showV1871CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871communicated
    FeaturePrefsStore.batch1871.v1871communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1871: compared mode
internal fun PlayerActivity.showV1871ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871compared
    FeaturePrefsStore.batch1871.v1871compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1872: clicked mode
internal fun PlayerActivity.showV1872ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872clicked
    FeaturePrefsStore.batch1871.v1872clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1872: climbed mode
internal fun PlayerActivity.showV1872ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872climbed
    FeaturePrefsStore.batch1871.v1872climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1872: cloned mode
internal fun PlayerActivity.showV1872ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872cloned
    FeaturePrefsStore.batch1871.v1872cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1872: closed mode
internal fun PlayerActivity.showV1872ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872closed
    FeaturePrefsStore.batch1871.v1872closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1872: coated mode
internal fun PlayerActivity.showV1872CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872coated
    FeaturePrefsStore.batch1871.v1872coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1872: coded level
internal fun PlayerActivity.showV1872CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1872: collapsed level
internal fun PlayerActivity.showV1872CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1872: collected level
internal fun PlayerActivity.showV1872CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1872: combined level
internal fun PlayerActivity.showV1872CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1872: comforted level
internal fun PlayerActivity.showV1872ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1872: commanded mode
internal fun PlayerActivity.showV1872CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872commanded
    FeaturePrefsStore.batch1871.v1872commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1872: commented mode
internal fun PlayerActivity.showV1872CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872commented
    FeaturePrefsStore.batch1871.v1872commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1872: committed mode
internal fun PlayerActivity.showV1872CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872committed
    FeaturePrefsStore.batch1871.v1872committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1872: communicated mode
internal fun PlayerActivity.showV1872CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872communicated
    FeaturePrefsStore.batch1871.v1872communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1872: compared mode
internal fun PlayerActivity.showV1872ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872compared
    FeaturePrefsStore.batch1871.v1872compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1873: clicked mode
internal fun PlayerActivity.showV1873ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873clicked
    FeaturePrefsStore.batch1871.v1873clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1873: climbed mode
internal fun PlayerActivity.showV1873ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873climbed
    FeaturePrefsStore.batch1871.v1873climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1873: cloned mode
internal fun PlayerActivity.showV1873ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873cloned
    FeaturePrefsStore.batch1871.v1873cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1873: closed mode
internal fun PlayerActivity.showV1873ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873closed
    FeaturePrefsStore.batch1871.v1873closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1873: coated mode
internal fun PlayerActivity.showV1873CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873coated
    FeaturePrefsStore.batch1871.v1873coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1873: coded level
internal fun PlayerActivity.showV1873CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1873: collapsed level
internal fun PlayerActivity.showV1873CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1873: collected level
internal fun PlayerActivity.showV1873CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1873: combined level
internal fun PlayerActivity.showV1873CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1873: comforted level
internal fun PlayerActivity.showV1873ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1873: commanded mode
internal fun PlayerActivity.showV1873CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873commanded
    FeaturePrefsStore.batch1871.v1873commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1873: commented mode
internal fun PlayerActivity.showV1873CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873commented
    FeaturePrefsStore.batch1871.v1873commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1873: committed mode
internal fun PlayerActivity.showV1873CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873committed
    FeaturePrefsStore.batch1871.v1873committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1873: communicated mode
internal fun PlayerActivity.showV1873CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873communicated
    FeaturePrefsStore.batch1871.v1873communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1873: compared mode
internal fun PlayerActivity.showV1873ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873compared
    FeaturePrefsStore.batch1871.v1873compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1874: clicked mode
internal fun PlayerActivity.showV1874ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874clicked
    FeaturePrefsStore.batch1871.v1874clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1874: climbed mode
internal fun PlayerActivity.showV1874ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874climbed
    FeaturePrefsStore.batch1871.v1874climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1874: cloned mode
internal fun PlayerActivity.showV1874ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874cloned
    FeaturePrefsStore.batch1871.v1874cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1874: closed mode
internal fun PlayerActivity.showV1874ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874closed
    FeaturePrefsStore.batch1871.v1874closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1874: coated mode
internal fun PlayerActivity.showV1874CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874coated
    FeaturePrefsStore.batch1871.v1874coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1874: coded level
internal fun PlayerActivity.showV1874CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1874: collapsed level
internal fun PlayerActivity.showV1874CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1874: collected level
internal fun PlayerActivity.showV1874CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1874: combined level
internal fun PlayerActivity.showV1874CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1874: comforted level
internal fun PlayerActivity.showV1874ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1874: commanded mode
internal fun PlayerActivity.showV1874CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874commanded
    FeaturePrefsStore.batch1871.v1874commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1874: commented mode
internal fun PlayerActivity.showV1874CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874commented
    FeaturePrefsStore.batch1871.v1874commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1874: committed mode
internal fun PlayerActivity.showV1874CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874committed
    FeaturePrefsStore.batch1871.v1874committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1874: communicated mode
internal fun PlayerActivity.showV1874CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874communicated
    FeaturePrefsStore.batch1871.v1874communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1874: compared mode
internal fun PlayerActivity.showV1874ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874compared
    FeaturePrefsStore.batch1871.v1874compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1875: clicked mode
internal fun PlayerActivity.showV1875ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875clicked
    FeaturePrefsStore.batch1871.v1875clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1875: climbed mode
internal fun PlayerActivity.showV1875ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875climbed
    FeaturePrefsStore.batch1871.v1875climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1875: cloned mode
internal fun PlayerActivity.showV1875ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875cloned
    FeaturePrefsStore.batch1871.v1875cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1875: closed mode
internal fun PlayerActivity.showV1875ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875closed
    FeaturePrefsStore.batch1871.v1875closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1875: coated mode
internal fun PlayerActivity.showV1875CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875coated
    FeaturePrefsStore.batch1871.v1875coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1875: coded level
internal fun PlayerActivity.showV1875CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1875: collapsed level
internal fun PlayerActivity.showV1875CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1875: collected level
internal fun PlayerActivity.showV1875CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1875: combined level
internal fun PlayerActivity.showV1875CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1875: comforted level
internal fun PlayerActivity.showV1875ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1875: commanded mode
internal fun PlayerActivity.showV1875CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875commanded
    FeaturePrefsStore.batch1871.v1875commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1875: commented mode
internal fun PlayerActivity.showV1875CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875commented
    FeaturePrefsStore.batch1871.v1875commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1875: committed mode
internal fun PlayerActivity.showV1875CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875committed
    FeaturePrefsStore.batch1871.v1875committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1875: communicated mode
internal fun PlayerActivity.showV1875CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875communicated
    FeaturePrefsStore.batch1871.v1875communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1875: compared mode
internal fun PlayerActivity.showV1875ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875compared
    FeaturePrefsStore.batch1871.v1875compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1876: clicked mode
internal fun PlayerActivity.showV1876ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876clicked
    FeaturePrefsStore.batch1871.v1876clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1876: climbed mode
internal fun PlayerActivity.showV1876ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876climbed
    FeaturePrefsStore.batch1871.v1876climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1876: cloned mode
internal fun PlayerActivity.showV1876ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876cloned
    FeaturePrefsStore.batch1871.v1876cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1876: closed mode
internal fun PlayerActivity.showV1876ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876closed
    FeaturePrefsStore.batch1871.v1876closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1876: coated mode
internal fun PlayerActivity.showV1876CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876coated
    FeaturePrefsStore.batch1871.v1876coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1876: coded level
internal fun PlayerActivity.showV1876CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1876: collapsed level
internal fun PlayerActivity.showV1876CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1876: collected level
internal fun PlayerActivity.showV1876CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1876: combined level
internal fun PlayerActivity.showV1876CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1876: comforted level
internal fun PlayerActivity.showV1876ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1876: commanded mode
internal fun PlayerActivity.showV1876CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876commanded
    FeaturePrefsStore.batch1871.v1876commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1876: commented mode
internal fun PlayerActivity.showV1876CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876commented
    FeaturePrefsStore.batch1871.v1876commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1876: committed mode
internal fun PlayerActivity.showV1876CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876committed
    FeaturePrefsStore.batch1871.v1876committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1876: communicated mode
internal fun PlayerActivity.showV1876CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876communicated
    FeaturePrefsStore.batch1871.v1876communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1876: compared mode
internal fun PlayerActivity.showV1876ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876compared
    FeaturePrefsStore.batch1871.v1876compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1877: clicked mode
internal fun PlayerActivity.showV1877ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877clicked
    FeaturePrefsStore.batch1871.v1877clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1877: climbed mode
internal fun PlayerActivity.showV1877ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877climbed
    FeaturePrefsStore.batch1871.v1877climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1877: cloned mode
internal fun PlayerActivity.showV1877ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877cloned
    FeaturePrefsStore.batch1871.v1877cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1877: closed mode
internal fun PlayerActivity.showV1877ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877closed
    FeaturePrefsStore.batch1871.v1877closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1877: coated mode
internal fun PlayerActivity.showV1877CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877coated
    FeaturePrefsStore.batch1871.v1877coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1877: coded level
internal fun PlayerActivity.showV1877CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1877: collapsed level
internal fun PlayerActivity.showV1877CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1877: collected level
internal fun PlayerActivity.showV1877CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1877: combined level
internal fun PlayerActivity.showV1877CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1877: comforted level
internal fun PlayerActivity.showV1877ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1877: commanded mode
internal fun PlayerActivity.showV1877CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877commanded
    FeaturePrefsStore.batch1871.v1877commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1877: commented mode
internal fun PlayerActivity.showV1877CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877commented
    FeaturePrefsStore.batch1871.v1877commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1877: committed mode
internal fun PlayerActivity.showV1877CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877committed
    FeaturePrefsStore.batch1871.v1877committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1877: communicated mode
internal fun PlayerActivity.showV1877CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877communicated
    FeaturePrefsStore.batch1871.v1877communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1877: compared mode
internal fun PlayerActivity.showV1877ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877compared
    FeaturePrefsStore.batch1871.v1877compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1878: clicked mode
internal fun PlayerActivity.showV1878ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878clicked
    FeaturePrefsStore.batch1871.v1878clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1878: climbed mode
internal fun PlayerActivity.showV1878ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878climbed
    FeaturePrefsStore.batch1871.v1878climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1878: cloned mode
internal fun PlayerActivity.showV1878ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878cloned
    FeaturePrefsStore.batch1871.v1878cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1878: closed mode
internal fun PlayerActivity.showV1878ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878closed
    FeaturePrefsStore.batch1871.v1878closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1878: coated mode
internal fun PlayerActivity.showV1878CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878coated
    FeaturePrefsStore.batch1871.v1878coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1878: coded level
internal fun PlayerActivity.showV1878CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1878: collapsed level
internal fun PlayerActivity.showV1878CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1878: collected level
internal fun PlayerActivity.showV1878CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1878: combined level
internal fun PlayerActivity.showV1878CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1878: comforted level
internal fun PlayerActivity.showV1878ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1878: commanded mode
internal fun PlayerActivity.showV1878CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878commanded
    FeaturePrefsStore.batch1871.v1878commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1878: commented mode
internal fun PlayerActivity.showV1878CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878commented
    FeaturePrefsStore.batch1871.v1878commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1878: committed mode
internal fun PlayerActivity.showV1878CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878committed
    FeaturePrefsStore.batch1871.v1878committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1878: communicated mode
internal fun PlayerActivity.showV1878CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878communicated
    FeaturePrefsStore.batch1871.v1878communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1878: compared mode
internal fun PlayerActivity.showV1878ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878compared
    FeaturePrefsStore.batch1871.v1878compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1879: clicked mode
internal fun PlayerActivity.showV1879ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879clicked
    FeaturePrefsStore.batch1871.v1879clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1879: climbed mode
internal fun PlayerActivity.showV1879ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879climbed
    FeaturePrefsStore.batch1871.v1879climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1879: cloned mode
internal fun PlayerActivity.showV1879ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879cloned
    FeaturePrefsStore.batch1871.v1879cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1879: closed mode
internal fun PlayerActivity.showV1879ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879closed
    FeaturePrefsStore.batch1871.v1879closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1879: coated mode
internal fun PlayerActivity.showV1879CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879coated
    FeaturePrefsStore.batch1871.v1879coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1879: coded level
internal fun PlayerActivity.showV1879CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1879: collapsed level
internal fun PlayerActivity.showV1879CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1879: collected level
internal fun PlayerActivity.showV1879CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1879: combined level
internal fun PlayerActivity.showV1879CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1879: comforted level
internal fun PlayerActivity.showV1879ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1879: commanded mode
internal fun PlayerActivity.showV1879CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879commanded
    FeaturePrefsStore.batch1871.v1879commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1879: commented mode
internal fun PlayerActivity.showV1879CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879commented
    FeaturePrefsStore.batch1871.v1879commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1879: committed mode
internal fun PlayerActivity.showV1879CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879committed
    FeaturePrefsStore.batch1871.v1879committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1879: communicated mode
internal fun PlayerActivity.showV1879CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879communicated
    FeaturePrefsStore.batch1871.v1879communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1879: compared mode
internal fun PlayerActivity.showV1879ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879compared
    FeaturePrefsStore.batch1871.v1879compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1880: clicked mode
internal fun PlayerActivity.showV1880ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880clicked
    FeaturePrefsStore.batch1871.v1880clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1880: climbed mode
internal fun PlayerActivity.showV1880ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880climbed
    FeaturePrefsStore.batch1871.v1880climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1880: cloned mode
internal fun PlayerActivity.showV1880ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880cloned
    FeaturePrefsStore.batch1871.v1880cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1880: closed mode
internal fun PlayerActivity.showV1880ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880closed
    FeaturePrefsStore.batch1871.v1880closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1880: coated mode
internal fun PlayerActivity.showV1880CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880coated
    FeaturePrefsStore.batch1871.v1880coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1880: coded level
internal fun PlayerActivity.showV1880CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1880: collapsed level
internal fun PlayerActivity.showV1880CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1880: collected level
internal fun PlayerActivity.showV1880CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1880: combined level
internal fun PlayerActivity.showV1880CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1880: comforted level
internal fun PlayerActivity.showV1880ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1880: commanded mode
internal fun PlayerActivity.showV1880CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880commanded
    FeaturePrefsStore.batch1871.v1880commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1880: commented mode
internal fun PlayerActivity.showV1880CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880commented
    FeaturePrefsStore.batch1871.v1880commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1880: committed mode
internal fun PlayerActivity.showV1880CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880committed
    FeaturePrefsStore.batch1871.v1880committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1880: communicated mode
internal fun PlayerActivity.showV1880CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880communicated
    FeaturePrefsStore.batch1871.v1880communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1880: compared mode
internal fun PlayerActivity.showV1880ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880compared
    FeaturePrefsStore.batch1871.v1880compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v236: Volume Boost Peak236
internal fun PlayerActivity.showV236VolumeBoostPeak236Toggle() {
    val current = BiliClient.prefs.v236volumeBoostPeak236
    BiliClient.prefs.v236volumeBoostPeak236 = !current
    AppToast.show(this, "Volume Boost Peak236: ${if (!current) "ON" else "OFF"}")
}

// v236: History Bookmark Export236
internal fun PlayerActivity.showV236HistoryBookmarkExport236Toggle() {
    val current = BiliClient.prefs.v236historyBookmarkExport236
    BiliClient.prefs.v236historyBookmarkExport236 = !current
    AppToast.show(this, "History Bookmark Export236: ${if (!current) "ON" else "OFF"}")
}

// v236: Playback Chapter Sync236
internal fun PlayerActivity.showV236PlaybackChapterSync236Toggle() {
    val current = BiliClient.prefs.v236playbackChapterSync236
    BiliClient.prefs.v236playbackChapterSync236 = !current
    AppToast.show(this, "Playback Chapter Sync236: ${if (!current) "ON" else "OFF"}")
}

// v236: Screenshot Save Path236
internal fun PlayerActivity.showV236ScreenshotSavePath236Toggle() {
    val current = BiliClient.prefs.v236screenshotSavePath236
    BiliClient.prefs.v236screenshotSavePath236 = !current
    AppToast.show(this, "Screenshot Save Path236: ${if (!current) "ON" else "OFF"}")
}

// v236: Video Color Space236
internal fun PlayerActivity.showV236VideoColorSpace236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236videoColorSpace236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236videoColorSpace236 = value
        AppToast.show(this, "Video Color Space236: $value")
    }
}

// v236: Danmaku Bottom Max Count280
internal fun PlayerActivity.showV236DanmakuBottomMaxCount280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount280 = value
        AppToast.show(this, "Danmaku Bottom Max Count280: $value")
    }
}

// v236: Subtitle Bg Border287
internal fun PlayerActivity.showV236SubtitleBgBorder287Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder287
    BiliClient.prefs.v236subtitleBgBorder287 = !current
    AppToast.show(this, "Subtitle Bg Border287: ${if (!current) "ON" else "OFF"}")
}

// v237: Audio EQ Custom237
internal fun PlayerActivity.showV237AudioEQCustom237Toggle() {
    val current = BiliClient.prefs.v237audioEQCustom237
    BiliClient.prefs.v237audioEQCustom237 = !current
    AppToast.show(this, "Audio EQ Custom237: ${if (!current) "ON" else "OFF"}")
}

// v237: Danmaku Bottom Max Count281
internal fun PlayerActivity.showV237DanmakuBottomMaxCount281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount281 = value
        AppToast.show(this, "Danmaku Bottom Max Count281: $value")
    }
}

// v237: Subtitle Bg Border288
internal fun PlayerActivity.showV237SubtitleBgBorder288Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder288
    BiliClient.prefs.v237subtitleBgBorder288 = !current
    AppToast.show(this, "Subtitle Bg Border288: ${if (!current) "ON" else "OFF"}")
}

// v237: Gesture Shake Action237
internal fun PlayerActivity.showV237GestureShakeAction237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237gestureShakeAction237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237gestureShakeAction237 = value
        AppToast.show(this, "Gesture Shake Action237: $value")
    }
}

// v237: Cast Audio Volume237
internal fun PlayerActivity.showV237CastAudioVolume237Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v237castAudioVolume237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237castAudioVolume237 = value
        AppToast.show(this, "Cast Audio Volume237: $value")
    }
}

// v237: Playlist Auto Skip Outro237
internal fun PlayerActivity.showV237PlaylistAutoSkipOutro237Toggle() {
    val current = BiliClient.prefs.v237playlistAutoSkipOutro237
    BiliClient.prefs.v237playlistAutoSkipOutro237 = !current
    AppToast.show(this, "Playlist Auto Skip Outro237: ${if (!current) "ON" else "OFF"}")
}

// v237: Cache Download Speed238
internal fun PlayerActivity.showV237CacheDownloadSpeed238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237cacheDownloadSpeed238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237cacheDownloadSpeed238 = value
        AppToast.show(this, "Cache Download Speed238: $value")
    }
}

// v237: Progress Bar Thumb Border237
internal fun PlayerActivity.showV237ProgressBarThumbBorder237Toggle() {
    val current = BiliClient.prefs.v237progressBarThumbBorder237
    BiliClient.prefs.v237progressBarThumbBorder237 = !current
    AppToast.show(this, "Progress Bar Thumb Border237: ${if (!current) "ON" else "OFF"}")
}

// v237: Volume Boost Peak237
internal fun PlayerActivity.showV237VolumeBoostPeak237Toggle() {
    val current = BiliClient.prefs.v237volumeBoostPeak237
    BiliClient.prefs.v237volumeBoostPeak237 = !current
    AppToast.show(this, "Volume Boost Peak237: ${if (!current) "ON" else "OFF"}")
}

// v237: History Bookmark Export237
internal fun PlayerActivity.showV237HistoryBookmarkExport237Toggle() {
    val current = BiliClient.prefs.v237historyBookmarkExport237
    BiliClient.prefs.v237historyBookmarkExport237 = !current
    AppToast.show(this, "History Bookmark Export237: ${if (!current) "ON" else "OFF"}")
}

// v237: Playback Chapter Sync237
internal fun PlayerActivity.showV237PlaybackChapterSync237Toggle() {
    val current = BiliClient.prefs.v237playbackChapterSync237
    BiliClient.prefs.v237playbackChapterSync237 = !current
    AppToast.show(this, "Playback Chapter Sync237: ${if (!current) "ON" else "OFF"}")
}

// v237: Screenshot Save Path237
internal fun PlayerActivity.showV237ScreenshotSavePath237Toggle() {
    val current = BiliClient.prefs.v237screenshotSavePath237
    BiliClient.prefs.v237screenshotSavePath237 = !current
    AppToast.show(this, "Screenshot Save Path237: ${if (!current) "ON" else "OFF"}")
}

// v237: Video Color Space237
internal fun PlayerActivity.showV237VideoColorSpace237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237videoColorSpace237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237videoColorSpace237 = value
        AppToast.show(this, "Video Color Space237: $value")
    }
}

// v237: Danmaku Bottom Max Count282
internal fun PlayerActivity.showV237DanmakuBottomMaxCount282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount282 = value
        AppToast.show(this, "Danmaku Bottom Max Count282: $value")
    }
}

// v237: Subtitle Bg Border289
internal fun PlayerActivity.showV237SubtitleBgBorder289Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder289
    BiliClient.prefs.v237subtitleBgBorder289 = !current
    AppToast.show(this, "Subtitle Bg Border289: ${if (!current) "ON" else "OFF"}")
}

// v238: Audio EQ Custom238
internal fun PlayerActivity.showV238AudioEQCustom238Toggle() {
    val current = BiliClient.prefs.v238audioEQCustom238
    BiliClient.prefs.v238audioEQCustom238 = !current
    AppToast.show(this, "Audio EQ Custom238: ${if (!current) "ON" else "OFF"}")
}

// v238: Danmaku Bottom Max Count283
internal fun PlayerActivity.showV238DanmakuBottomMaxCount283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount283 = value
        AppToast.show(this, "Danmaku Bottom Max Count283: $value")
    }
}

// v238: Subtitle Bg Border290
internal fun PlayerActivity.showV238SubtitleBgBorder290Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder290
    BiliClient.prefs.v238subtitleBgBorder290 = !current
    AppToast.show(this, "Subtitle Bg Border290: ${if (!current) "ON" else "OFF"}")
}

// v238: Gesture Shake Action238
internal fun PlayerActivity.showV238GestureShakeAction238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238gestureShakeAction238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238gestureShakeAction238 = value
        AppToast.show(this, "Gesture Shake Action238: $value")
    }
}

// v238: Cast Audio Volume238
internal fun PlayerActivity.showV238CastAudioVolume238Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v238castAudioVolume238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238castAudioVolume238 = value
        AppToast.show(this, "Cast Audio Volume238: $value")
    }
}

// v238: Playlist Auto Skip Outro238
internal fun PlayerActivity.showV238PlaylistAutoSkipOutro238Toggle() {
    val current = BiliClient.prefs.v238playlistAutoSkipOutro238
    BiliClient.prefs.v238playlistAutoSkipOutro238 = !current
    AppToast.show(this, "Playlist Auto Skip Outro238: ${if (!current) "ON" else "OFF"}")
}

// v238: Cache Download Speed239
internal fun PlayerActivity.showV238CacheDownloadSpeed239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238cacheDownloadSpeed239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238cacheDownloadSpeed239 = value
        AppToast.show(this, "Cache Download Speed239: $value")
    }
}

// v238: Progress Bar Thumb Border238
internal fun PlayerActivity.showV238ProgressBarThumbBorder238Toggle() {
    val current = BiliClient.prefs.v238progressBarThumbBorder238
    BiliClient.prefs.v238progressBarThumbBorder238 = !current
    AppToast.show(this, "Progress Bar Thumb Border238: ${if (!current) "ON" else "OFF"}")
}

// v238: Volume Boost Peak238
internal fun PlayerActivity.showV238VolumeBoostPeak238Toggle() {
    val current = BiliClient.prefs.v238volumeBoostPeak238
    BiliClient.prefs.v238volumeBoostPeak238 = !current
    AppToast.show(this, "Volume Boost Peak238: ${if (!current) "ON" else "OFF"}")
}

// v238: History Bookmark Export238
internal fun PlayerActivity.showV238HistoryBookmarkExport238Toggle() {
    val current = BiliClient.prefs.v238historyBookmarkExport238
    BiliClient.prefs.v238historyBookmarkExport238 = !current
    AppToast.show(this, "History Bookmark Export238: ${if (!current) "ON" else "OFF"}")
}

// v238: Playback Chapter Sync238
internal fun PlayerActivity.showV238PlaybackChapterSync238Toggle() {
    val current = BiliClient.prefs.v238playbackChapterSync238
    BiliClient.prefs.v238playbackChapterSync238 = !current
    AppToast.show(this, "Playback Chapter Sync238: ${if (!current) "ON" else "OFF"}")
}

// v238: Screenshot Save Path238
internal fun PlayerActivity.showV238ScreenshotSavePath238Toggle() {
    val current = BiliClient.prefs.v238screenshotSavePath238
    BiliClient.prefs.v238screenshotSavePath238 = !current
    AppToast.show(this, "Screenshot Save Path238: ${if (!current) "ON" else "OFF"}")
}

// v238: Video Color Space238
internal fun PlayerActivity.showV238VideoColorSpace238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238videoColorSpace238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238videoColorSpace238 = value
        AppToast.show(this, "Video Color Space238: $value")
    }
}

// v238: Danmaku Bottom Max Count284
internal fun PlayerActivity.showV238DanmakuBottomMaxCount284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount284 = value
        AppToast.show(this, "Danmaku Bottom Max Count284: $value")
    }
}

// v238: Subtitle Bg Border291
internal fun PlayerActivity.showV238SubtitleBgBorder291Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder291
    BiliClient.prefs.v238subtitleBgBorder291 = !current
    AppToast.show(this, "Subtitle Bg Border291: ${if (!current) "ON" else "OFF"}")
}

// v239: Audio EQ Custom239
internal fun PlayerActivity.showV239AudioEQCustom239Toggle() {
    val current = BiliClient.prefs.v239audioEQCustom239
    BiliClient.prefs.v239audioEQCustom239 = !current
    AppToast.show(this, "Audio EQ Custom239: ${if (!current) "ON" else "OFF"}")
}

// v239: Danmaku Bottom Max Count285
internal fun PlayerActivity.showV239DanmakuBottomMaxCount285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount285 = value
        AppToast.show(this, "Danmaku Bottom Max Count285: $value")
    }
}

// v239: Subtitle Bg Border292
internal fun PlayerActivity.showV239SubtitleBgBorder292Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder292
    BiliClient.prefs.v239subtitleBgBorder292 = !current
    AppToast.show(this, "Subtitle Bg Border292: ${if (!current) "ON" else "OFF"}")
}

// v239: Gesture Shake Action239
internal fun PlayerActivity.showV239GestureShakeAction239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239gestureShakeAction239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239gestureShakeAction239 = value
        AppToast.show(this, "Gesture Shake Action239: $value")
    }
}

// v239: Cast Audio Volume239
internal fun PlayerActivity.showV239CastAudioVolume239Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v239castAudioVolume239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239castAudioVolume239 = value
        AppToast.show(this, "Cast Audio Volume239: $value")
    }
}

// v239: Playlist Auto Skip Outro239
internal fun PlayerActivity.showV239PlaylistAutoSkipOutro239Toggle() {
    val current = BiliClient.prefs.v239playlistAutoSkipOutro239
    BiliClient.prefs.v239playlistAutoSkipOutro239 = !current
    AppToast.show(this, "Playlist Auto Skip Outro239: ${if (!current) "ON" else "OFF"}")
}

// v239: Cache Download Speed240
internal fun PlayerActivity.showV239CacheDownloadSpeed240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239cacheDownloadSpeed240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239cacheDownloadSpeed240 = value
        AppToast.show(this, "Cache Download Speed240: $value")
    }
}

// v239: Progress Bar Thumb Border239
internal fun PlayerActivity.showV239ProgressBarThumbBorder239Toggle() {
    val current = BiliClient.prefs.v239progressBarThumbBorder239
    BiliClient.prefs.v239progressBarThumbBorder239 = !current
    AppToast.show(this, "Progress Bar Thumb Border239: ${if (!current) "ON" else "OFF"}")
}

// v239: Volume Boost Peak239
internal fun PlayerActivity.showV239VolumeBoostPeak239Toggle() {
    val current = BiliClient.prefs.v239volumeBoostPeak239
    BiliClient.prefs.v239volumeBoostPeak239 = !current
    AppToast.show(this, "Volume Boost Peak239: ${if (!current) "ON" else "OFF"}")
}

// v239: History Bookmark Export239
internal fun PlayerActivity.showV239HistoryBookmarkExport239Toggle() {
    val current = BiliClient.prefs.v239historyBookmarkExport239
    BiliClient.prefs.v239historyBookmarkExport239 = !current
    AppToast.show(this, "History Bookmark Export239: ${if (!current) "ON" else "OFF"}")
}

// v239: Playback Chapter Sync239
internal fun PlayerActivity.showV239PlaybackChapterSync239Toggle() {
    val current = BiliClient.prefs.v239playbackChapterSync239
    BiliClient.prefs.v239playbackChapterSync239 = !current
    AppToast.show(this, "Playback Chapter Sync239: ${if (!current) "ON" else "OFF"}")
}

// v239: Screenshot Save Path239
internal fun PlayerActivity.showV239ScreenshotSavePath239Toggle() {
    val current = BiliClient.prefs.v239screenshotSavePath239
    BiliClient.prefs.v239screenshotSavePath239 = !current
    AppToast.show(this, "Screenshot Save Path239: ${if (!current) "ON" else "OFF"}")
}

// v239: Video Color Space239
internal fun PlayerActivity.showV239VideoColorSpace239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239videoColorSpace239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239videoColorSpace239 = value
        AppToast.show(this, "Video Color Space239: $value")
    }
}

// v239: Danmaku Bottom Max Count286
internal fun PlayerActivity.showV239DanmakuBottomMaxCount286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount286 = value
        AppToast.show(this, "Danmaku Bottom Max Count286: $value")
    }
}

// v239: Subtitle Bg Border293
internal fun PlayerActivity.showV239SubtitleBgBorder293Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder293
    BiliClient.prefs.v239subtitleBgBorder293 = !current
    AppToast.show(this, "Subtitle Bg Border293: ${if (!current) "ON" else "OFF"}")
}

// v240: Audio EQ Custom240
internal fun PlayerActivity.showV240AudioEQCustom240Toggle() {
    val current = BiliClient.prefs.v240audioEQCustom240
    BiliClient.prefs.v240audioEQCustom240 = !current
    AppToast.show(this, "Audio EQ Custom240: ${if (!current) "ON" else "OFF"}")
}

// v240: Danmaku Bottom Max Count287
internal fun PlayerActivity.showV240DanmakuBottomMaxCount287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount287 = value
        AppToast.show(this, "Danmaku Bottom Max Count287: $value")
    }
}

// v240: Subtitle Bg Border294
internal fun PlayerActivity.showV240SubtitleBgBorder294Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder294
    BiliClient.prefs.v240subtitleBgBorder294 = !current
    AppToast.show(this, "Subtitle Bg Border294: ${if (!current) "ON" else "OFF"}")
}

// v240: Gesture Shake Action240
internal fun PlayerActivity.showV240GestureShakeAction240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240gestureShakeAction240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240gestureShakeAction240 = value
        AppToast.show(this, "Gesture Shake Action240: $value")
    }
}

// v240: Cast Audio Volume240
internal fun PlayerActivity.showV240CastAudioVolume240Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v240castAudioVolume240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240castAudioVolume240 = value
        AppToast.show(this, "Cast Audio Volume240: $value")
    }
}

// v240: Playlist Auto Skip Outro240
internal fun PlayerActivity.showV240PlaylistAutoSkipOutro240Toggle() {
    val current = BiliClient.prefs.v240playlistAutoSkipOutro240
    BiliClient.prefs.v240playlistAutoSkipOutro240 = !current
    AppToast.show(this, "Playlist Auto Skip Outro240: ${if (!current) "ON" else "OFF"}")
}

// v240: Cache Download Speed241
internal fun PlayerActivity.showV240CacheDownloadSpeed241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240cacheDownloadSpeed241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240cacheDownloadSpeed241 = value
        AppToast.show(this, "Cache Download Speed241: $value")
    }
}

// v240: Progress Bar Thumb Border240
internal fun PlayerActivity.showV240ProgressBarThumbBorder240Toggle() {
    val current = BiliClient.prefs.v240progressBarThumbBorder240
    BiliClient.prefs.v240progressBarThumbBorder240 = !current
    AppToast.show(this, "Progress Bar Thumb Border240: ${if (!current) "ON" else "OFF"}")
}

// v240: Volume Boost Peak240
internal fun PlayerActivity.showV240VolumeBoostPeak240Toggle() {
    val current = BiliClient.prefs.v240volumeBoostPeak240
    BiliClient.prefs.v240volumeBoostPeak240 = !current
    AppToast.show(this, "Volume Boost Peak240: ${if (!current) "ON" else "OFF"}")
}

// v240: History Bookmark Export240
internal fun PlayerActivity.showV240HistoryBookmarkExport240Toggle() {
    val current = BiliClient.prefs.v240historyBookmarkExport240
    BiliClient.prefs.v240historyBookmarkExport240 = !current
    AppToast.show(this, "History Bookmark Export240: ${if (!current) "ON" else "OFF"}")
}

// v240: Playback Chapter Sync240
internal fun PlayerActivity.showV240PlaybackChapterSync240Toggle() {
    val current = BiliClient.prefs.v240playbackChapterSync240
    BiliClient.prefs.v240playbackChapterSync240 = !current
    AppToast.show(this, "Playback Chapter Sync240: ${if (!current) "ON" else "OFF"}")
}

// v240: Screenshot Save Path240
internal fun PlayerActivity.showV240ScreenshotSavePath240Toggle() {
    val current = BiliClient.prefs.v240screenshotSavePath240
    BiliClient.prefs.v240screenshotSavePath240 = !current
    AppToast.show(this, "Screenshot Save Path240: ${if (!current) "ON" else "OFF"}")
}

// v240: Video Color Space240
internal fun PlayerActivity.showV240VideoColorSpace240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240videoColorSpace240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240videoColorSpace240 = value
        AppToast.show(this, "Video Color Space240: $value")
    }
}

// v240: Danmaku Bottom Max Count288
internal fun PlayerActivity.showV240DanmakuBottomMaxCount288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount288 = value
        AppToast.show(this, "Danmaku Bottom Max Count288: $value")
    }
}

// v240: Subtitle Bg Border295
internal fun PlayerActivity.showV240SubtitleBgBorder295Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder295
    BiliClient.prefs.v240subtitleBgBorder295 = !current
    AppToast.show(this, "Subtitle Bg Border295: ${if (!current) "ON" else "OFF"}")
}

// v241: Audio EQ Custom241
internal fun PlayerActivity.showV241AudioEQCustom241Toggle() {
    val current = BiliClient.prefs.v241audioEQCustom241
    BiliClient.prefs.v241audioEQCustom241 = !current
    AppToast.show(this, "Audio EQ Custom241: ${if (!current) "ON" else "OFF"}")
}

// v241: Danmaku Bottom Max Count289
internal fun PlayerActivity.showV241DanmakuBottomMaxCount289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount289 = value
        AppToast.show(this, "Danmaku Bottom Max Count289: $value")
    }
}

// v241: Subtitle Bg Border296
internal fun PlayerActivity.showV241SubtitleBgBorder296Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder296
    BiliClient.prefs.v241subtitleBgBorder296 = !current
    AppToast.show(this, "Subtitle Bg Border296: ${if (!current) "ON" else "OFF"}")
}

// v241: Gesture Shake Action241
internal fun PlayerActivity.showV241GestureShakeAction241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241gestureShakeAction241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241gestureShakeAction241 = value
        AppToast.show(this, "Gesture Shake Action241: $value")
    }
}

// v241: Cast Audio Volume241
internal fun PlayerActivity.showV241CastAudioVolume241Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v241castAudioVolume241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241castAudioVolume241 = value
        AppToast.show(this, "Cast Audio Volume241: $value")
    }
}

// v241: Playlist Auto Skip Outro241
internal fun PlayerActivity.showV241PlaylistAutoSkipOutro241Toggle() {
    val current = BiliClient.prefs.v241playlistAutoSkipOutro241
    BiliClient.prefs.v241playlistAutoSkipOutro241 = !current
    AppToast.show(this, "Playlist Auto Skip Outro241: ${if (!current) "ON" else "OFF"}")
}

// v241: Cache Download Speed242
internal fun PlayerActivity.showV241CacheDownloadSpeed242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241cacheDownloadSpeed242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241cacheDownloadSpeed242 = value
        AppToast.show(this, "Cache Download Speed242: $value")
    }
}

// v241: Progress Bar Thumb Border241
internal fun PlayerActivity.showV241ProgressBarThumbBorder241Toggle() {
    val current = BiliClient.prefs.v241progressBarThumbBorder241
    BiliClient.prefs.v241progressBarThumbBorder241 = !current
    AppToast.show(this, "Progress Bar Thumb Border241: ${if (!current) "ON" else "OFF"}")
}

// v241: Volume Boost Peak241
internal fun PlayerActivity.showV241VolumeBoostPeak241Toggle() {
    val current = BiliClient.prefs.v241volumeBoostPeak241
    BiliClient.prefs.v241volumeBoostPeak241 = !current
    AppToast.show(this, "Volume Boost Peak241: ${if (!current) "ON" else "OFF"}")
}

// v241: History Bookmark Export241
internal fun PlayerActivity.showV241HistoryBookmarkExport241Toggle() {
    val current = BiliClient.prefs.v241historyBookmarkExport241
    BiliClient.prefs.v241historyBookmarkExport241 = !current
    AppToast.show(this, "History Bookmark Export241: ${if (!current) "ON" else "OFF"}")
}

// v241: Playback Chapter Sync241
internal fun PlayerActivity.showV241PlaybackChapterSync241Toggle() {
    val current = BiliClient.prefs.v241playbackChapterSync241
    BiliClient.prefs.v241playbackChapterSync241 = !current
    AppToast.show(this, "Playback Chapter Sync241: ${if (!current) "ON" else "OFF"}")
}

// v241: Screenshot Save Path241
internal fun PlayerActivity.showV241ScreenshotSavePath241Toggle() {
    val current = BiliClient.prefs.v241screenshotSavePath241
    BiliClient.prefs.v241screenshotSavePath241 = !current
    AppToast.show(this, "Screenshot Save Path241: ${if (!current) "ON" else "OFF"}")
}

// v241: Video Color Space241
internal fun PlayerActivity.showV241VideoColorSpace241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241videoColorSpace241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241videoColorSpace241 = value
        AppToast.show(this, "Video Color Space241: $value")
    }
}

// v241: Danmaku Bottom Max Count290
internal fun PlayerActivity.showV241DanmakuBottomMaxCount290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount290 = value
        AppToast.show(this, "Danmaku Bottom Max Count290: $value")
    }
}

// v241: Subtitle Bg Border297
internal fun PlayerActivity.showV241SubtitleBgBorder297Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder297
    BiliClient.prefs.v241subtitleBgBorder297 = !current
    AppToast.show(this, "Subtitle Bg Border297: ${if (!current) "ON" else "OFF"}")
}

// v242: Audio EQ Custom242
internal fun PlayerActivity.showV242AudioEQCustom242Toggle() {
    val current = BiliClient.prefs.v242audioEQCustom242
    BiliClient.prefs.v242audioEQCustom242 = !current
    AppToast.show(this, "Audio EQ Custom242: ${if (!current) "ON" else "OFF"}")
}

// v242: Danmaku Bottom Max Count291
internal fun PlayerActivity.showV242DanmakuBottomMaxCount291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount291 = value
        AppToast.show(this, "Danmaku Bottom Max Count291: $value")
    }
}

// v242: Subtitle Bg Border298
internal fun PlayerActivity.showV242SubtitleBgBorder298Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder298
    BiliClient.prefs.v242subtitleBgBorder298 = !current
    AppToast.show(this, "Subtitle Bg Border298: ${if (!current) "ON" else "OFF"}")
}

// v242: Gesture Shake Action242
internal fun PlayerActivity.showV242GestureShakeAction242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242gestureShakeAction242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242gestureShakeAction242 = value
        AppToast.show(this, "Gesture Shake Action242: $value")
    }
}

// v242: Cast Audio Volume242
internal fun PlayerActivity.showV242CastAudioVolume242Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v242castAudioVolume242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242castAudioVolume242 = value
        AppToast.show(this, "Cast Audio Volume242: $value")
    }
}

// v242: Playlist Auto Skip Outro242
internal fun PlayerActivity.showV242PlaylistAutoSkipOutro242Toggle() {
    val current = BiliClient.prefs.v242playlistAutoSkipOutro242
    BiliClient.prefs.v242playlistAutoSkipOutro242 = !current
    AppToast.show(this, "Playlist Auto Skip Outro242: ${if (!current) "ON" else "OFF"}")
}

// v242: Cache Download Speed243
internal fun PlayerActivity.showV242CacheDownloadSpeed243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242cacheDownloadSpeed243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242cacheDownloadSpeed243 = value
        AppToast.show(this, "Cache Download Speed243: $value")
    }
}

// v242: Progress Bar Thumb Border242
internal fun PlayerActivity.showV242ProgressBarThumbBorder242Toggle() {
    val current = BiliClient.prefs.v242progressBarThumbBorder242
    BiliClient.prefs.v242progressBarThumbBorder242 = !current
    AppToast.show(this, "Progress Bar Thumb Border242: ${if (!current) "ON" else "OFF"}")
}

// v242: Volume Boost Peak242
internal fun PlayerActivity.showV242VolumeBoostPeak242Toggle() {
    val current = BiliClient.prefs.v242volumeBoostPeak242
    BiliClient.prefs.v242volumeBoostPeak242 = !current
    AppToast.show(this, "Volume Boost Peak242: ${if (!current) "ON" else "OFF"}")
}

// v242: History Bookmark Export242
internal fun PlayerActivity.showV242HistoryBookmarkExport242Toggle() {
    val current = BiliClient.prefs.v242historyBookmarkExport242
    BiliClient.prefs.v242historyBookmarkExport242 = !current
    AppToast.show(this, "History Bookmark Export242: ${if (!current) "ON" else "OFF"}")
}

// v242: Playback Chapter Sync242
internal fun PlayerActivity.showV242PlaybackChapterSync242Toggle() {
    val current = BiliClient.prefs.v242playbackChapterSync242
    BiliClient.prefs.v242playbackChapterSync242 = !current
    AppToast.show(this, "Playback Chapter Sync242: ${if (!current) "ON" else "OFF"}")
}

// v242: Screenshot Save Path242
internal fun PlayerActivity.showV242ScreenshotSavePath242Toggle() {
    val current = BiliClient.prefs.v242screenshotSavePath242
    BiliClient.prefs.v242screenshotSavePath242 = !current
    AppToast.show(this, "Screenshot Save Path242: ${if (!current) "ON" else "OFF"}")
}

// v242: Video Color Space242
internal fun PlayerActivity.showV242VideoColorSpace242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242videoColorSpace242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242videoColorSpace242 = value
        AppToast.show(this, "Video Color Space242: $value")
    }
}

// v242: Danmaku Bottom Max Count292
internal fun PlayerActivity.showV242DanmakuBottomMaxCount292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount292 = value
        AppToast.show(this, "Danmaku Bottom Max Count292: $value")
    }
}

// v242: Subtitle Bg Border299
internal fun PlayerActivity.showV242SubtitleBgBorder299Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder299
    BiliClient.prefs.v242subtitleBgBorder299 = !current
    AppToast.show(this, "Subtitle Bg Border299: ${if (!current) "ON" else "OFF"}")
}

// v243: Audio EQ Custom243
internal fun PlayerActivity.showV243AudioEQCustom243Toggle() {
    val current = BiliClient.prefs.v243audioEQCustom243
    BiliClient.prefs.v243audioEQCustom243 = !current
    AppToast.show(this, "Audio EQ Custom243: ${if (!current) "ON" else "OFF"}")
}

// v243: Danmaku Bottom Max Count293
internal fun PlayerActivity.showV243DanmakuBottomMaxCount293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount293 = value
        AppToast.show(this, "Danmaku Bottom Max Count293: $value")
    }
}

// v243: Subtitle Bg Border300
internal fun PlayerActivity.showV243SubtitleBgBorder300Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder300
    BiliClient.prefs.v243subtitleBgBorder300 = !current
    AppToast.show(this, "Subtitle Bg Border300: ${if (!current) "ON" else "OFF"}")
}

// v243: Gesture Shake Action243
internal fun PlayerActivity.showV243GestureShakeAction243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243gestureShakeAction243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243gestureShakeAction243 = value
        AppToast.show(this, "Gesture Shake Action243: $value")
    }
}

// v243: Cast Audio Volume243
internal fun PlayerActivity.showV243CastAudioVolume243Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v243castAudioVolume243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243castAudioVolume243 = value
        AppToast.show(this, "Cast Audio Volume243: $value")
    }
}

// v243: Playlist Auto Skip Outro243
internal fun PlayerActivity.showV243PlaylistAutoSkipOutro243Toggle() {
    val current = BiliClient.prefs.v243playlistAutoSkipOutro243
    BiliClient.prefs.v243playlistAutoSkipOutro243 = !current
    AppToast.show(this, "Playlist Auto Skip Outro243: ${if (!current) "ON" else "OFF"}")
}

// v243: Cache Download Speed244
internal fun PlayerActivity.showV243CacheDownloadSpeed244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243cacheDownloadSpeed244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243cacheDownloadSpeed244 = value
        AppToast.show(this, "Cache Download Speed244: $value")
    }
}

// v243: Progress Bar Thumb Border243
internal fun PlayerActivity.showV243ProgressBarThumbBorder243Toggle() {
    val current = BiliClient.prefs.v243progressBarThumbBorder243
    BiliClient.prefs.v243progressBarThumbBorder243 = !current
    AppToast.show(this, "Progress Bar Thumb Border243: ${if (!current) "ON" else "OFF"}")
}

// v243: Volume Boost Peak243
internal fun PlayerActivity.showV243VolumeBoostPeak243Toggle() {
    val current = BiliClient.prefs.v243volumeBoostPeak243
    BiliClient.prefs.v243volumeBoostPeak243 = !current
    AppToast.show(this, "Volume Boost Peak243: ${if (!current) "ON" else "OFF"}")
}

// v243: History Bookmark Export243
internal fun PlayerActivity.showV243HistoryBookmarkExport243Toggle() {
    val current = BiliClient.prefs.v243historyBookmarkExport243
    BiliClient.prefs.v243historyBookmarkExport243 = !current
    AppToast.show(this, "History Bookmark Export243: ${if (!current) "ON" else "OFF"}")
}

// v243: Playback Chapter Sync243
internal fun PlayerActivity.showV243PlaybackChapterSync243Toggle() {
    val current = BiliClient.prefs.v243playbackChapterSync243
    BiliClient.prefs.v243playbackChapterSync243 = !current
    AppToast.show(this, "Playback Chapter Sync243: ${if (!current) "ON" else "OFF"}")
}

// v243: Screenshot Save Path243
internal fun PlayerActivity.showV243ScreenshotSavePath243Toggle() {
    val current = BiliClient.prefs.v243screenshotSavePath243
    BiliClient.prefs.v243screenshotSavePath243 = !current
    AppToast.show(this, "Screenshot Save Path243: ${if (!current) "ON" else "OFF"}")
}

// v243: Video Color Space243
internal fun PlayerActivity.showV243VideoColorSpace243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243videoColorSpace243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243videoColorSpace243 = value
        AppToast.show(this, "Video Color Space243: $value")
    }
}

// v243: Danmaku Bottom Max Count294
internal fun PlayerActivity.showV243DanmakuBottomMaxCount294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount294 = value
        AppToast.show(this, "Danmaku Bottom Max Count294: $value")
    }
}

// v243: Subtitle Bg Border301
internal fun PlayerActivity.showV243SubtitleBgBorder301Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder301
    BiliClient.prefs.v243subtitleBgBorder301 = !current
    AppToast.show(this, "Subtitle Bg Border301: ${if (!current) "ON" else "OFF"}")
}

// v244: Audio EQ Custom244
internal fun PlayerActivity.showV244AudioEQCustom244Toggle() {
    val current = BiliClient.prefs.v244audioEQCustom244
    BiliClient.prefs.v244audioEQCustom244 = !current
    AppToast.show(this, "Audio EQ Custom244: ${if (!current) "ON" else "OFF"}")
}

// v244: Danmaku Bottom Max Count295
internal fun PlayerActivity.showV244DanmakuBottomMaxCount295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount295 = value
        AppToast.show(this, "Danmaku Bottom Max Count295: $value")
    }
}

// v244: Subtitle Bg Border302
internal fun PlayerActivity.showV244SubtitleBgBorder302Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder302
    BiliClient.prefs.v244subtitleBgBorder302 = !current
    AppToast.show(this, "Subtitle Bg Border302: ${if (!current) "ON" else "OFF"}")
}

// v244: Gesture Shake Action244
internal fun PlayerActivity.showV244GestureShakeAction244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244gestureShakeAction244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244gestureShakeAction244 = value
        AppToast.show(this, "Gesture Shake Action244: $value")
    }
}

// v244: Cast Audio Volume244
internal fun PlayerActivity.showV244CastAudioVolume244Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v244castAudioVolume244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244castAudioVolume244 = value
        AppToast.show(this, "Cast Audio Volume244: $value")
    }
}

// v244: Playlist Auto Skip Outro244
internal fun PlayerActivity.showV244PlaylistAutoSkipOutro244Toggle() {
    val current = BiliClient.prefs.v244playlistAutoSkipOutro244
    BiliClient.prefs.v244playlistAutoSkipOutro244 = !current
    AppToast.show(this, "Playlist Auto Skip Outro244: ${if (!current) "ON" else "OFF"}")
}

// v244: Cache Download Speed245
internal fun PlayerActivity.showV244CacheDownloadSpeed245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244cacheDownloadSpeed245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244cacheDownloadSpeed245 = value
        AppToast.show(this, "Cache Download Speed245: $value")
    }
}

// v244: Progress Bar Thumb Border244
internal fun PlayerActivity.showV244ProgressBarThumbBorder244Toggle() {
    val current = BiliClient.prefs.v244progressBarThumbBorder244
    BiliClient.prefs.v244progressBarThumbBorder244 = !current
    AppToast.show(this, "Progress Bar Thumb Border244: ${if (!current) "ON" else "OFF"}")
}

// v244: Volume Boost Peak244
internal fun PlayerActivity.showV244VolumeBoostPeak244Toggle() {
    val current = BiliClient.prefs.v244volumeBoostPeak244
    BiliClient.prefs.v244volumeBoostPeak244 = !current
    AppToast.show(this, "Volume Boost Peak244: ${if (!current) "ON" else "OFF"}")
}

// v244: History Bookmark Export244
internal fun PlayerActivity.showV244HistoryBookmarkExport244Toggle() {
    val current = BiliClient.prefs.v244historyBookmarkExport244
    BiliClient.prefs.v244historyBookmarkExport244 = !current
    AppToast.show(this, "History Bookmark Export244: ${if (!current) "ON" else "OFF"}")
}

// v244: Playback Chapter Sync244
internal fun PlayerActivity.showV244PlaybackChapterSync244Toggle() {
    val current = BiliClient.prefs.v244playbackChapterSync244
    BiliClient.prefs.v244playbackChapterSync244 = !current
    AppToast.show(this, "Playback Chapter Sync244: ${if (!current) "ON" else "OFF"}")
}

// v244: Screenshot Save Path244
internal fun PlayerActivity.showV244ScreenshotSavePath244Toggle() {
    val current = BiliClient.prefs.v244screenshotSavePath244
    BiliClient.prefs.v244screenshotSavePath244 = !current
    AppToast.show(this, "Screenshot Save Path244: ${if (!current) "ON" else "OFF"}")
}

// v244: Video Color Space244
internal fun PlayerActivity.showV244VideoColorSpace244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244videoColorSpace244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244videoColorSpace244 = value
        AppToast.show(this, "Video Color Space244: $value")
    }
}

// v244: Danmaku Bottom Max Count296
internal fun PlayerActivity.showV244DanmakuBottomMaxCount296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount296 = value
        AppToast.show(this, "Danmaku Bottom Max Count296: $value")
    }
}

// v244: Subtitle Bg Border303
internal fun PlayerActivity.showV244SubtitleBgBorder303Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder303
    BiliClient.prefs.v244subtitleBgBorder303 = !current
    AppToast.show(this, "Subtitle Bg Border303: ${if (!current) "ON" else "OFF"}")
}

// v245: Audio EQ Custom245
internal fun PlayerActivity.showV245AudioEQCustom245Toggle() {
    val current = BiliClient.prefs.v245audioEQCustom245
    BiliClient.prefs.v245audioEQCustom245 = !current
    AppToast.show(this, "Audio EQ Custom245: ${if (!current) "ON" else "OFF"}")
}

// v245: Danmaku Bottom Max Count297
internal fun PlayerActivity.showV245DanmakuBottomMaxCount297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount297 = value
        AppToast.show(this, "Danmaku Bottom Max Count297: $value")
    }
}

// v245: Subtitle Bg Border304
internal fun PlayerActivity.showV245SubtitleBgBorder304Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder304
    BiliClient.prefs.v245subtitleBgBorder304 = !current
    AppToast.show(this, "Subtitle Bg Border304: ${if (!current) "ON" else "OFF"}")
}

// v245: Gesture Shake Action245
internal fun PlayerActivity.showV245GestureShakeAction245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245gestureShakeAction245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245gestureShakeAction245 = value
        AppToast.show(this, "Gesture Shake Action245: $value")
    }
}

// v245: Cast Audio Volume245
internal fun PlayerActivity.showV245CastAudioVolume245Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v245castAudioVolume245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245castAudioVolume245 = value
        AppToast.show(this, "Cast Audio Volume245: $value")
    }
}

// v245: Playlist Auto Skip Outro245
internal fun PlayerActivity.showV245PlaylistAutoSkipOutro245Toggle() {
    val current = BiliClient.prefs.v245playlistAutoSkipOutro245
    BiliClient.prefs.v245playlistAutoSkipOutro245 = !current
    AppToast.show(this, "Playlist Auto Skip Outro245: ${if (!current) "ON" else "OFF"}")
}

// v245: Cache Download Speed246
internal fun PlayerActivity.showV245CacheDownloadSpeed246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245cacheDownloadSpeed246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245cacheDownloadSpeed246 = value
        AppToast.show(this, "Cache Download Speed246: $value")
    }
}

// v245: Progress Bar Thumb Border245
internal fun PlayerActivity.showV245ProgressBarThumbBorder245Toggle() {
    val current = BiliClient.prefs.v245progressBarThumbBorder245
    BiliClient.prefs.v245progressBarThumbBorder245 = !current
    AppToast.show(this, "Progress Bar Thumb Border245: ${if (!current) "ON" else "OFF"}")
}

// v245: Volume Boost Peak245
internal fun PlayerActivity.showV245VolumeBoostPeak245Toggle() {
    val current = BiliClient.prefs.v245volumeBoostPeak245
    BiliClient.prefs.v245volumeBoostPeak245 = !current
    AppToast.show(this, "Volume Boost Peak245: ${if (!current) "ON" else "OFF"}")
}

// v245: History Bookmark Export245
internal fun PlayerActivity.showV245HistoryBookmarkExport245Toggle() {
    val current = BiliClient.prefs.v245historyBookmarkExport245
    BiliClient.prefs.v245historyBookmarkExport245 = !current
    AppToast.show(this, "History Bookmark Export245: ${if (!current) "ON" else "OFF"}")
}

// v245: Playback Chapter Sync245
internal fun PlayerActivity.showV245PlaybackChapterSync245Toggle() {
    val current = BiliClient.prefs.v245playbackChapterSync245
    BiliClient.prefs.v245playbackChapterSync245 = !current
    AppToast.show(this, "Playback Chapter Sync245: ${if (!current) "ON" else "OFF"}")
}

// v245: Screenshot Save Path245
internal fun PlayerActivity.showV245ScreenshotSavePath245Toggle() {
    val current = BiliClient.prefs.v245screenshotSavePath245
    BiliClient.prefs.v245screenshotSavePath245 = !current
    AppToast.show(this, "Screenshot Save Path245: ${if (!current) "ON" else "OFF"}")
}

// v245: Video Color Space245
internal fun PlayerActivity.showV245VideoColorSpace245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245videoColorSpace245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245videoColorSpace245 = value
        AppToast.show(this, "Video Color Space245: $value")
    }
}

// v245: Danmaku Bottom Max Count298
internal fun PlayerActivity.showV245DanmakuBottomMaxCount298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount298 = value
        AppToast.show(this, "Danmaku Bottom Max Count298: $value")
    }
}

// v245: Subtitle Bg Border305
internal fun PlayerActivity.showV245SubtitleBgBorder305Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder305
    BiliClient.prefs.v245subtitleBgBorder305 = !current
    AppToast.show(this, "Subtitle Bg Border305: ${if (!current) "ON" else "OFF"}")
}

// v246: Audio EQ Custom246
internal fun PlayerActivity.showV246AudioEQCustom246Toggle() {
    val current = BiliClient.prefs.v246audioEQCustom246
    BiliClient.prefs.v246audioEQCustom246 = !current
    AppToast.show(this, "Audio EQ Custom246: ${if (!current) "ON" else "OFF"}")
}

// v246: Danmaku Bottom Max Count299
internal fun PlayerActivity.showV246DanmakuBottomMaxCount299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount299 = value
        AppToast.show(this, "Danmaku Bottom Max Count299: $value")
    }
}

// v246: Subtitle Bg Border306
internal fun PlayerActivity.showV246SubtitleBgBorder306Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder306
    BiliClient.prefs.v246subtitleBgBorder306 = !current
    AppToast.show(this, "Subtitle Bg Border306: ${if (!current) "ON" else "OFF"}")
}

// v246: Gesture Shake Action246
internal fun PlayerActivity.showV246GestureShakeAction246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246gestureShakeAction246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246gestureShakeAction246 = value
        AppToast.show(this, "Gesture Shake Action246: $value")
    }
}

// v246: Cast Audio Volume246
internal fun PlayerActivity.showV246CastAudioVolume246Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v246castAudioVolume246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246castAudioVolume246 = value
        AppToast.show(this, "Cast Audio Volume246: $value")
    }
}

// v246: Playlist Auto Skip Outro246
internal fun PlayerActivity.showV246PlaylistAutoSkipOutro246Toggle() {
    val current = BiliClient.prefs.v246playlistAutoSkipOutro246
    BiliClient.prefs.v246playlistAutoSkipOutro246 = !current
    AppToast.show(this, "Playlist Auto Skip Outro246: ${if (!current) "ON" else "OFF"}")
}

// v246: Cache Download Speed247
internal fun PlayerActivity.showV246CacheDownloadSpeed247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246cacheDownloadSpeed247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246cacheDownloadSpeed247 = value
        AppToast.show(this, "Cache Download Speed247: $value")
    }
}

// v246: Progress Bar Thumb Border246
internal fun PlayerActivity.showV246ProgressBarThumbBorder246Toggle() {
    val current = BiliClient.prefs.v246progressBarThumbBorder246
    BiliClient.prefs.v246progressBarThumbBorder246 = !current
    AppToast.show(this, "Progress Bar Thumb Border246: ${if (!current) "ON" else "OFF"}")
}

// v246: Volume Boost Peak246
internal fun PlayerActivity.showV246VolumeBoostPeak246Toggle() {
    val current = BiliClient.prefs.v246volumeBoostPeak246
    BiliClient.prefs.v246volumeBoostPeak246 = !current
    AppToast.show(this, "Volume Boost Peak246: ${if (!current) "ON" else "OFF"}")
}

// v246: History Bookmark Export246
internal fun PlayerActivity.showV246HistoryBookmarkExport246Toggle() {
    val current = BiliClient.prefs.v246historyBookmarkExport246
    BiliClient.prefs.v246historyBookmarkExport246 = !current
    AppToast.show(this, "History Bookmark Export246: ${if (!current) "ON" else "OFF"}")
}

// v246: Playback Chapter Sync246
internal fun PlayerActivity.showV246PlaybackChapterSync246Toggle() {
    val current = BiliClient.prefs.v246playbackChapterSync246
    BiliClient.prefs.v246playbackChapterSync246 = !current
    AppToast.show(this, "Playback Chapter Sync246: ${if (!current) "ON" else "OFF"}")
}

// v246: Screenshot Save Path246
internal fun PlayerActivity.showV246ScreenshotSavePath246Toggle() {
    val current = BiliClient.prefs.v246screenshotSavePath246
    BiliClient.prefs.v246screenshotSavePath246 = !current
    AppToast.show(this, "Screenshot Save Path246: ${if (!current) "ON" else "OFF"}")
}

// v246: Video Color Space246
internal fun PlayerActivity.showV246VideoColorSpace246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246videoColorSpace246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246videoColorSpace246 = value
        AppToast.show(this, "Video Color Space246: $value")
    }
}

// v246: Danmaku Bottom Max Count300
internal fun PlayerActivity.showV246DanmakuBottomMaxCount300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount300 = value
        AppToast.show(this, "Danmaku Bottom Max Count300: $value")
    }
}

// v246: Subtitle Bg Border307
internal fun PlayerActivity.showV246SubtitleBgBorder307Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder307
    BiliClient.prefs.v246subtitleBgBorder307 = !current
    AppToast.show(this, "Subtitle Bg Border307: ${if (!current) "ON" else "OFF"}")
}

// v247: Audio EQ Custom247
internal fun PlayerActivity.showV247AudioEQCustom247Toggle() {
    val current = BiliClient.prefs.v247audioEQCustom247
    BiliClient.prefs.v247audioEQCustom247 = !current
    AppToast.show(this, "Audio EQ Custom247: ${if (!current) "ON" else "OFF"}")
}

// v247: Danmaku Bottom Max Count301
internal fun PlayerActivity.showV247DanmakuBottomMaxCount301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount301 = value
        AppToast.show(this, "Danmaku Bottom Max Count301: $value")
    }
}

// v247: Subtitle Bg Border308
internal fun PlayerActivity.showV247SubtitleBgBorder308Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder308
    BiliClient.prefs.v247subtitleBgBorder308 = !current
    AppToast.show(this, "Subtitle Bg Border308: ${if (!current) "ON" else "OFF"}")
}

// v247: Gesture Shake Action247
internal fun PlayerActivity.showV247GestureShakeAction247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247gestureShakeAction247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247gestureShakeAction247 = value
        AppToast.show(this, "Gesture Shake Action247: $value")
    }
}

// v247: Cast Audio Volume247
internal fun PlayerActivity.showV247CastAudioVolume247Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v247castAudioVolume247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247castAudioVolume247 = value
        AppToast.show(this, "Cast Audio Volume247: $value")
    }
}

// v247: Playlist Auto Skip Outro247
internal fun PlayerActivity.showV247PlaylistAutoSkipOutro247Toggle() {
    val current = BiliClient.prefs.v247playlistAutoSkipOutro247
    BiliClient.prefs.v247playlistAutoSkipOutro247 = !current
    AppToast.show(this, "Playlist Auto Skip Outro247: ${if (!current) "ON" else "OFF"}")
}

// v247: Cache Download Speed248
internal fun PlayerActivity.showV247CacheDownloadSpeed248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247cacheDownloadSpeed248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247cacheDownloadSpeed248 = value
        AppToast.show(this, "Cache Download Speed248: $value")
    }
}

// v247: Progress Bar Thumb Border247
internal fun PlayerActivity.showV247ProgressBarThumbBorder247Toggle() {
    val current = BiliClient.prefs.v247progressBarThumbBorder247
    BiliClient.prefs.v247progressBarThumbBorder247 = !current
    AppToast.show(this, "Progress Bar Thumb Border247: ${if (!current) "ON" else "OFF"}")
}

// v247: Volume Boost Peak247
internal fun PlayerActivity.showV247VolumeBoostPeak247Toggle() {
    val current = BiliClient.prefs.v247volumeBoostPeak247
    BiliClient.prefs.v247volumeBoostPeak247 = !current
    AppToast.show(this, "Volume Boost Peak247: ${if (!current) "ON" else "OFF"}")
}

// v247: History Bookmark Export247
internal fun PlayerActivity.showV247HistoryBookmarkExport247Toggle() {
    val current = BiliClient.prefs.v247historyBookmarkExport247
    BiliClient.prefs.v247historyBookmarkExport247 = !current
    AppToast.show(this, "History Bookmark Export247: ${if (!current) "ON" else "OFF"}")
}

// v247: Playback Chapter Sync247
internal fun PlayerActivity.showV247PlaybackChapterSync247Toggle() {
    val current = BiliClient.prefs.v247playbackChapterSync247
    BiliClient.prefs.v247playbackChapterSync247 = !current
    AppToast.show(this, "Playback Chapter Sync247: ${if (!current) "ON" else "OFF"}")
}

// v247: Screenshot Save Path247
internal fun PlayerActivity.showV247ScreenshotSavePath247Toggle() {
    val current = BiliClient.prefs.v247screenshotSavePath247
    BiliClient.prefs.v247screenshotSavePath247 = !current
    AppToast.show(this, "Screenshot Save Path247: ${if (!current) "ON" else "OFF"}")
}

// v247: Video Color Space247
internal fun PlayerActivity.showV247VideoColorSpace247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247videoColorSpace247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247videoColorSpace247 = value
        AppToast.show(this, "Video Color Space247: $value")
    }
}

// v247: Danmaku Bottom Max Count302
internal fun PlayerActivity.showV247DanmakuBottomMaxCount302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount302 = value
        AppToast.show(this, "Danmaku Bottom Max Count302: $value")
    }
}

// v247: Subtitle Bg Border309
internal fun PlayerActivity.showV247SubtitleBgBorder309Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder309
    BiliClient.prefs.v247subtitleBgBorder309 = !current
    AppToast.show(this, "Subtitle Bg Border309: ${if (!current) "ON" else "OFF"}")
}

// v248: Audio EQ Custom248
internal fun PlayerActivity.showV248AudioEQCustom248Toggle() {
    val current = BiliClient.prefs.v248audioEQCustom248
    BiliClient.prefs.v248audioEQCustom248 = !current
    AppToast.show(this, "Audio EQ Custom248: ${if (!current) "ON" else "OFF"}")
}

// v248: Danmaku Bottom Max Count303
internal fun PlayerActivity.showV248DanmakuBottomMaxCount303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount303 = value
        AppToast.show(this, "Danmaku Bottom Max Count303: $value")
    }
}

// v248: Subtitle Bg Border310
internal fun PlayerActivity.showV248SubtitleBgBorder310Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder310
    BiliClient.prefs.v248subtitleBgBorder310 = !current
    AppToast.show(this, "Subtitle Bg Border310: ${if (!current) "ON" else "OFF"}")
}

// v248: Gesture Shake Action248
internal fun PlayerActivity.showV248GestureShakeAction248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248gestureShakeAction248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248gestureShakeAction248 = value
        AppToast.show(this, "Gesture Shake Action248: $value")
    }
}

// v248: Cast Audio Volume248
internal fun PlayerActivity.showV248CastAudioVolume248Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v248castAudioVolume248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248castAudioVolume248 = value
        AppToast.show(this, "Cast Audio Volume248: $value")
    }
}

// v248: Playlist Auto Skip Outro248
internal fun PlayerActivity.showV248PlaylistAutoSkipOutro248Toggle() {
    val current = BiliClient.prefs.v248playlistAutoSkipOutro248
    BiliClient.prefs.v248playlistAutoSkipOutro248 = !current
    AppToast.show(this, "Playlist Auto Skip Outro248: ${if (!current) "ON" else "OFF"}")
}

// v248: Cache Download Speed249
internal fun PlayerActivity.showV248CacheDownloadSpeed249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248cacheDownloadSpeed249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248cacheDownloadSpeed249 = value
        AppToast.show(this, "Cache Download Speed249: $value")
    }
}

// v248: Progress Bar Thumb Border248
internal fun PlayerActivity.showV248ProgressBarThumbBorder248Toggle() {
    val current = BiliClient.prefs.v248progressBarThumbBorder248
    BiliClient.prefs.v248progressBarThumbBorder248 = !current
    AppToast.show(this, "Progress Bar Thumb Border248: ${if (!current) "ON" else "OFF"}")
}

// v248: Volume Boost Peak248
internal fun PlayerActivity.showV248VolumeBoostPeak248Toggle() {
    val current = BiliClient.prefs.v248volumeBoostPeak248
    BiliClient.prefs.v248volumeBoostPeak248 = !current
    AppToast.show(this, "Volume Boost Peak248: ${if (!current) "ON" else "OFF"}")
}

// v248: History Bookmark Export248
internal fun PlayerActivity.showV248HistoryBookmarkExport248Toggle() {
    val current = BiliClient.prefs.v248historyBookmarkExport248
    BiliClient.prefs.v248historyBookmarkExport248 = !current
    AppToast.show(this, "History Bookmark Export248: ${if (!current) "ON" else "OFF"}")
}

// v248: Playback Chapter Sync248
internal fun PlayerActivity.showV248PlaybackChapterSync248Toggle() {
    val current = BiliClient.prefs.v248playbackChapterSync248
    BiliClient.prefs.v248playbackChapterSync248 = !current
    AppToast.show(this, "Playback Chapter Sync248: ${if (!current) "ON" else "OFF"}")
}

// v248: Screenshot Save Path248
internal fun PlayerActivity.showV248ScreenshotSavePath248Toggle() {
    val current = BiliClient.prefs.v248screenshotSavePath248
    BiliClient.prefs.v248screenshotSavePath248 = !current
    AppToast.show(this, "Screenshot Save Path248: ${if (!current) "ON" else "OFF"}")
}

// v248: Video Color Space248
internal fun PlayerActivity.showV248VideoColorSpace248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248videoColorSpace248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248videoColorSpace248 = value
        AppToast.show(this, "Video Color Space248: $value")
    }
}

// v248: Danmaku Bottom Max Count304
internal fun PlayerActivity.showV248DanmakuBottomMaxCount304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount304 = value
        AppToast.show(this, "Danmaku Bottom Max Count304: $value")
    }
}

// v248: Subtitle Bg Border311
internal fun PlayerActivity.showV248SubtitleBgBorder311Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder311
    BiliClient.prefs.v248subtitleBgBorder311 = !current
    AppToast.show(this, "Subtitle Bg Border311: ${if (!current) "ON" else "OFF"}")
}

// v249: Audio EQ Custom249
internal fun PlayerActivity.showV249AudioEQCustom249Toggle() {
    val current = BiliClient.prefs.v249audioEQCustom249
    BiliClient.prefs.v249audioEQCustom249 = !current
    AppToast.show(this, "Audio EQ Custom249: ${if (!current) "ON" else "OFF"}")
}

// v249: Danmaku Bottom Max Count305
internal fun PlayerActivity.showV249DanmakuBottomMaxCount305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount305 = value
        AppToast.show(this, "Danmaku Bottom Max Count305: $value")
    }
}

// v249: Subtitle Bg Border312
internal fun PlayerActivity.showV249SubtitleBgBorder312Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder312
    BiliClient.prefs.v249subtitleBgBorder312 = !current
    AppToast.show(this, "Subtitle Bg Border312: ${if (!current) "ON" else "OFF"}")
}

// v249: Gesture Shake Action249
internal fun PlayerActivity.showV249GestureShakeAction249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249gestureShakeAction249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249gestureShakeAction249 = value
        AppToast.show(this, "Gesture Shake Action249: $value")
    }
}

// v249: Cast Audio Volume249
internal fun PlayerActivity.showV249CastAudioVolume249Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v249castAudioVolume249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249castAudioVolume249 = value
        AppToast.show(this, "Cast Audio Volume249: $value")
    }
}

// v249: Playlist Auto Skip Outro249
internal fun PlayerActivity.showV249PlaylistAutoSkipOutro249Toggle() {
    val current = BiliClient.prefs.v249playlistAutoSkipOutro249
    BiliClient.prefs.v249playlistAutoSkipOutro249 = !current
    AppToast.show(this, "Playlist Auto Skip Outro249: ${if (!current) "ON" else "OFF"}")
}

// v249: Cache Download Speed250
internal fun PlayerActivity.showV249CacheDownloadSpeed250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249cacheDownloadSpeed250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249cacheDownloadSpeed250 = value
        AppToast.show(this, "Cache Download Speed250: $value")
    }
}

// v249: Progress Bar Thumb Border249
internal fun PlayerActivity.showV249ProgressBarThumbBorder249Toggle() {
    val current = BiliClient.prefs.v249progressBarThumbBorder249
    BiliClient.prefs.v249progressBarThumbBorder249 = !current
    AppToast.show(this, "Progress Bar Thumb Border249: ${if (!current) "ON" else "OFF"}")
}

// v249: Volume Boost Peak249
internal fun PlayerActivity.showV249VolumeBoostPeak249Toggle() {
    val current = BiliClient.prefs.v249volumeBoostPeak249
    BiliClient.prefs.v249volumeBoostPeak249 = !current
    AppToast.show(this, "Volume Boost Peak249: ${if (!current) "ON" else "OFF"}")
}

// v249: History Bookmark Export249
internal fun PlayerActivity.showV249HistoryBookmarkExport249Toggle() {
    val current = BiliClient.prefs.v249historyBookmarkExport249
    BiliClient.prefs.v249historyBookmarkExport249 = !current
    AppToast.show(this, "History Bookmark Export249: ${if (!current) "ON" else "OFF"}")
}

// v249: Playback Chapter Sync249
internal fun PlayerActivity.showV249PlaybackChapterSync249Toggle() {
    val current = BiliClient.prefs.v249playbackChapterSync249
    BiliClient.prefs.v249playbackChapterSync249 = !current
    AppToast.show(this, "Playback Chapter Sync249: ${if (!current) "ON" else "OFF"}")
}

// v249: Screenshot Save Path249
internal fun PlayerActivity.showV249ScreenshotSavePath249Toggle() {
    val current = BiliClient.prefs.v249screenshotSavePath249
    BiliClient.prefs.v249screenshotSavePath249 = !current
    AppToast.show(this, "Screenshot Save Path249: ${if (!current) "ON" else "OFF"}")
}

// v249: Video Color Space249
internal fun PlayerActivity.showV249VideoColorSpace249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249videoColorSpace249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249videoColorSpace249 = value
        AppToast.show(this, "Video Color Space249: $value")
    }
}

// v1881: compensated mode
internal fun PlayerActivity.showV1881CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881compensated
    FeaturePrefsStore.batch1881.v1881compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1881: compiled mode
internal fun PlayerActivity.showV1881CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1881compiled
    FeaturePrefsStore.batch1881.v1881compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1881: completed mode
internal fun PlayerActivity.showV1881CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881completed
    FeaturePrefsStore.batch1881.v1881completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1881: composed mode
internal fun PlayerActivity.showV1881ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881composed
    FeaturePrefsStore.batch1881.v1881composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1881: computed mode
internal fun PlayerActivity.showV1881ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881computed
    FeaturePrefsStore.batch1881.v1881computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1881: concentrated level
internal fun PlayerActivity.showV1881ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1881: concluded level
internal fun PlayerActivity.showV1881ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1881: conducted level
internal fun PlayerActivity.showV1881ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1881: confined level
internal fun PlayerActivity.showV1881ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1881: confirmed level
internal fun PlayerActivity.showV1881ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1881: connected mode
internal fun PlayerActivity.showV1881ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881connected
    FeaturePrefsStore.batch1881.v1881connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1881: conquered mode
internal fun PlayerActivity.showV1881ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1881conquered
    FeaturePrefsStore.batch1881.v1881conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1881: considered mode
internal fun PlayerActivity.showV1881ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1881considered
    FeaturePrefsStore.batch1881.v1881considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1881: consisted mode
internal fun PlayerActivity.showV1881ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881consisted
    FeaturePrefsStore.batch1881.v1881consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1881: constructed mode
internal fun PlayerActivity.showV1881ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881constructed
    FeaturePrefsStore.batch1881.v1881constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1882: compensated mode
internal fun PlayerActivity.showV1882CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882compensated
    FeaturePrefsStore.batch1881.v1882compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1882: compiled mode
internal fun PlayerActivity.showV1882CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1882compiled
    FeaturePrefsStore.batch1881.v1882compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1882: completed mode
internal fun PlayerActivity.showV1882CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882completed
    FeaturePrefsStore.batch1881.v1882completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1882: composed mode
internal fun PlayerActivity.showV1882ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882composed
    FeaturePrefsStore.batch1881.v1882composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1882: computed mode
internal fun PlayerActivity.showV1882ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882computed
    FeaturePrefsStore.batch1881.v1882computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1882: concentrated level
internal fun PlayerActivity.showV1882ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1882: concluded level
internal fun PlayerActivity.showV1882ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1882: conducted level
internal fun PlayerActivity.showV1882ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1882: confined level
internal fun PlayerActivity.showV1882ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1882: confirmed level
internal fun PlayerActivity.showV1882ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1882: connected mode
internal fun PlayerActivity.showV1882ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882connected
    FeaturePrefsStore.batch1881.v1882connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1882: conquered mode
internal fun PlayerActivity.showV1882ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1882conquered
    FeaturePrefsStore.batch1881.v1882conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1882: considered mode
internal fun PlayerActivity.showV1882ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1882considered
    FeaturePrefsStore.batch1881.v1882considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1882: consisted mode
internal fun PlayerActivity.showV1882ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882consisted
    FeaturePrefsStore.batch1881.v1882consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1882: constructed mode
internal fun PlayerActivity.showV1882ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882constructed
    FeaturePrefsStore.batch1881.v1882constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1883: compensated mode
internal fun PlayerActivity.showV1883CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883compensated
    FeaturePrefsStore.batch1881.v1883compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1883: compiled mode
internal fun PlayerActivity.showV1883CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1883compiled
    FeaturePrefsStore.batch1881.v1883compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1883: completed mode
internal fun PlayerActivity.showV1883CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883completed
    FeaturePrefsStore.batch1881.v1883completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1883: composed mode
internal fun PlayerActivity.showV1883ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883composed
    FeaturePrefsStore.batch1881.v1883composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1883: computed mode
internal fun PlayerActivity.showV1883ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883computed
    FeaturePrefsStore.batch1881.v1883computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1883: concentrated level
internal fun PlayerActivity.showV1883ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1883: concluded level
internal fun PlayerActivity.showV1883ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1883: conducted level
internal fun PlayerActivity.showV1883ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1883: confined level
internal fun PlayerActivity.showV1883ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1883: confirmed level
internal fun PlayerActivity.showV1883ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1883: connected mode
internal fun PlayerActivity.showV1883ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883connected
    FeaturePrefsStore.batch1881.v1883connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1883: conquered mode
internal fun PlayerActivity.showV1883ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1883conquered
    FeaturePrefsStore.batch1881.v1883conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1883: considered mode
internal fun PlayerActivity.showV1883ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1883considered
    FeaturePrefsStore.batch1881.v1883considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1883: consisted mode
internal fun PlayerActivity.showV1883ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883consisted
    FeaturePrefsStore.batch1881.v1883consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1883: constructed mode
internal fun PlayerActivity.showV1883ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883constructed
    FeaturePrefsStore.batch1881.v1883constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1884: compensated mode
internal fun PlayerActivity.showV1884CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884compensated
    FeaturePrefsStore.batch1881.v1884compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1884: compiled mode
internal fun PlayerActivity.showV1884CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1884compiled
    FeaturePrefsStore.batch1881.v1884compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1884: completed mode
internal fun PlayerActivity.showV1884CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884completed
    FeaturePrefsStore.batch1881.v1884completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1884: composed mode
internal fun PlayerActivity.showV1884ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884composed
    FeaturePrefsStore.batch1881.v1884composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1884: computed mode
internal fun PlayerActivity.showV1884ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884computed
    FeaturePrefsStore.batch1881.v1884computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1884: concentrated level
internal fun PlayerActivity.showV1884ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1884: concluded level
internal fun PlayerActivity.showV1884ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1884: conducted level
internal fun PlayerActivity.showV1884ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1884: confined level
internal fun PlayerActivity.showV1884ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1884: confirmed level
internal fun PlayerActivity.showV1884ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1884: connected mode
internal fun PlayerActivity.showV1884ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884connected
    FeaturePrefsStore.batch1881.v1884connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1884: conquered mode
internal fun PlayerActivity.showV1884ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1884conquered
    FeaturePrefsStore.batch1881.v1884conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1884: considered mode
internal fun PlayerActivity.showV1884ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1884considered
    FeaturePrefsStore.batch1881.v1884considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1884: consisted mode
internal fun PlayerActivity.showV1884ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884consisted
    FeaturePrefsStore.batch1881.v1884consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1884: constructed mode
internal fun PlayerActivity.showV1884ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884constructed
    FeaturePrefsStore.batch1881.v1884constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1885: compensated mode
internal fun PlayerActivity.showV1885CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885compensated
    FeaturePrefsStore.batch1881.v1885compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1885: compiled mode
internal fun PlayerActivity.showV1885CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1885compiled
    FeaturePrefsStore.batch1881.v1885compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1885: completed mode
internal fun PlayerActivity.showV1885CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885completed
    FeaturePrefsStore.batch1881.v1885completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1885: composed mode
internal fun PlayerActivity.showV1885ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885composed
    FeaturePrefsStore.batch1881.v1885composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1885: computed mode
internal fun PlayerActivity.showV1885ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885computed
    FeaturePrefsStore.batch1881.v1885computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1885: concentrated level
internal fun PlayerActivity.showV1885ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1885: concluded level
internal fun PlayerActivity.showV1885ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1885: conducted level
internal fun PlayerActivity.showV1885ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1885: confined level
internal fun PlayerActivity.showV1885ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1885: confirmed level
internal fun PlayerActivity.showV1885ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1885: connected mode
internal fun PlayerActivity.showV1885ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885connected
    FeaturePrefsStore.batch1881.v1885connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1885: conquered mode
internal fun PlayerActivity.showV1885ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1885conquered
    FeaturePrefsStore.batch1881.v1885conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1885: considered mode
internal fun PlayerActivity.showV1885ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1885considered
    FeaturePrefsStore.batch1881.v1885considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1885: consisted mode
internal fun PlayerActivity.showV1885ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885consisted
    FeaturePrefsStore.batch1881.v1885consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1885: constructed mode
internal fun PlayerActivity.showV1885ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885constructed
    FeaturePrefsStore.batch1881.v1885constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1886: compensated mode
internal fun PlayerActivity.showV1886CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886compensated
    FeaturePrefsStore.batch1881.v1886compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1886: compiled mode
internal fun PlayerActivity.showV1886CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1886compiled
    FeaturePrefsStore.batch1881.v1886compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1886: completed mode
internal fun PlayerActivity.showV1886CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886completed
    FeaturePrefsStore.batch1881.v1886completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1886: composed mode
internal fun PlayerActivity.showV1886ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886composed
    FeaturePrefsStore.batch1881.v1886composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1886: computed mode
internal fun PlayerActivity.showV1886ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886computed
    FeaturePrefsStore.batch1881.v1886computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1886: concentrated level
internal fun PlayerActivity.showV1886ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1886: concluded level
internal fun PlayerActivity.showV1886ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1886: conducted level
internal fun PlayerActivity.showV1886ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1886: confined level
internal fun PlayerActivity.showV1886ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1886: confirmed level
internal fun PlayerActivity.showV1886ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1886: connected mode
internal fun PlayerActivity.showV1886ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886connected
    FeaturePrefsStore.batch1881.v1886connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1886: conquered mode
internal fun PlayerActivity.showV1886ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1886conquered
    FeaturePrefsStore.batch1881.v1886conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1886: considered mode
internal fun PlayerActivity.showV1886ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1886considered
    FeaturePrefsStore.batch1881.v1886considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1886: consisted mode
internal fun PlayerActivity.showV1886ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886consisted
    FeaturePrefsStore.batch1881.v1886consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1886: constructed mode
internal fun PlayerActivity.showV1886ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886constructed
    FeaturePrefsStore.batch1881.v1886constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1887: compensated mode
internal fun PlayerActivity.showV1887CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887compensated
    FeaturePrefsStore.batch1881.v1887compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1887: compiled mode
internal fun PlayerActivity.showV1887CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1887compiled
    FeaturePrefsStore.batch1881.v1887compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1887: completed mode
internal fun PlayerActivity.showV1887CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887completed
    FeaturePrefsStore.batch1881.v1887completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1887: composed mode
internal fun PlayerActivity.showV1887ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887composed
    FeaturePrefsStore.batch1881.v1887composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1887: computed mode
internal fun PlayerActivity.showV1887ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887computed
    FeaturePrefsStore.batch1881.v1887computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1887: concentrated level
internal fun PlayerActivity.showV1887ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1887: concluded level
internal fun PlayerActivity.showV1887ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1887: conducted level
internal fun PlayerActivity.showV1887ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1887: confined level
internal fun PlayerActivity.showV1887ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1887: confirmed level
internal fun PlayerActivity.showV1887ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1887: connected mode
internal fun PlayerActivity.showV1887ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887connected
    FeaturePrefsStore.batch1881.v1887connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1887: conquered mode
internal fun PlayerActivity.showV1887ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1887conquered
    FeaturePrefsStore.batch1881.v1887conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1887: considered mode
internal fun PlayerActivity.showV1887ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1887considered
    FeaturePrefsStore.batch1881.v1887considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1887: consisted mode
internal fun PlayerActivity.showV1887ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887consisted
    FeaturePrefsStore.batch1881.v1887consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1887: constructed mode
internal fun PlayerActivity.showV1887ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887constructed
    FeaturePrefsStore.batch1881.v1887constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1888: compensated mode
internal fun PlayerActivity.showV1888CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888compensated
    FeaturePrefsStore.batch1881.v1888compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1888: compiled mode
internal fun PlayerActivity.showV1888CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1888compiled
    FeaturePrefsStore.batch1881.v1888compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1888: completed mode
internal fun PlayerActivity.showV1888CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888completed
    FeaturePrefsStore.batch1881.v1888completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1888: composed mode
internal fun PlayerActivity.showV1888ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888composed
    FeaturePrefsStore.batch1881.v1888composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1888: computed mode
internal fun PlayerActivity.showV1888ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888computed
    FeaturePrefsStore.batch1881.v1888computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1888: concentrated level
internal fun PlayerActivity.showV1888ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1888: concluded level
internal fun PlayerActivity.showV1888ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1888: conducted level
internal fun PlayerActivity.showV1888ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1888: confined level
internal fun PlayerActivity.showV1888ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1888: confirmed level
internal fun PlayerActivity.showV1888ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1888: connected mode
internal fun PlayerActivity.showV1888ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888connected
    FeaturePrefsStore.batch1881.v1888connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1888: conquered mode
internal fun PlayerActivity.showV1888ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1888conquered
    FeaturePrefsStore.batch1881.v1888conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1888: considered mode
internal fun PlayerActivity.showV1888ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1888considered
    FeaturePrefsStore.batch1881.v1888considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1888: consisted mode
internal fun PlayerActivity.showV1888ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888consisted
    FeaturePrefsStore.batch1881.v1888consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1888: constructed mode
internal fun PlayerActivity.showV1888ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888constructed
    FeaturePrefsStore.batch1881.v1888constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1889: compensated mode
internal fun PlayerActivity.showV1889CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889compensated
    FeaturePrefsStore.batch1881.v1889compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1889: compiled mode
internal fun PlayerActivity.showV1889CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1889compiled
    FeaturePrefsStore.batch1881.v1889compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1889: completed mode
internal fun PlayerActivity.showV1889CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889completed
    FeaturePrefsStore.batch1881.v1889completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1889: composed mode
internal fun PlayerActivity.showV1889ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889composed
    FeaturePrefsStore.batch1881.v1889composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1889: computed mode
internal fun PlayerActivity.showV1889ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889computed
    FeaturePrefsStore.batch1881.v1889computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1889: concentrated level
internal fun PlayerActivity.showV1889ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1889: concluded level
internal fun PlayerActivity.showV1889ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1889: conducted level
internal fun PlayerActivity.showV1889ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1889: confined level
internal fun PlayerActivity.showV1889ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1889: confirmed level
internal fun PlayerActivity.showV1889ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1889: connected mode
internal fun PlayerActivity.showV1889ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889connected
    FeaturePrefsStore.batch1881.v1889connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1889: conquered mode
internal fun PlayerActivity.showV1889ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1889conquered
    FeaturePrefsStore.batch1881.v1889conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1889: considered mode
internal fun PlayerActivity.showV1889ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1889considered
    FeaturePrefsStore.batch1881.v1889considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1889: consisted mode
internal fun PlayerActivity.showV1889ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889consisted
    FeaturePrefsStore.batch1881.v1889consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1889: constructed mode
internal fun PlayerActivity.showV1889ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889constructed
    FeaturePrefsStore.batch1881.v1889constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1890: compensated mode
internal fun PlayerActivity.showV1890CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890compensated
    FeaturePrefsStore.batch1881.v1890compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1890: compiled mode
internal fun PlayerActivity.showV1890CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1890compiled
    FeaturePrefsStore.batch1881.v1890compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1890: completed mode
internal fun PlayerActivity.showV1890CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890completed
    FeaturePrefsStore.batch1881.v1890completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1890: composed mode
internal fun PlayerActivity.showV1890ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890composed
    FeaturePrefsStore.batch1881.v1890composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1890: computed mode
internal fun PlayerActivity.showV1890ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890computed
    FeaturePrefsStore.batch1881.v1890computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1890: concentrated level
internal fun PlayerActivity.showV1890ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1890: concluded level
internal fun PlayerActivity.showV1890ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1890: conducted level
internal fun PlayerActivity.showV1890ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1890: confined level
internal fun PlayerActivity.showV1890ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1890: confirmed level
internal fun PlayerActivity.showV1890ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1890: connected mode
internal fun PlayerActivity.showV1890ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890connected
    FeaturePrefsStore.batch1881.v1890connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1890: conquered mode
internal fun PlayerActivity.showV1890ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1890conquered
    FeaturePrefsStore.batch1881.v1890conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1890: considered mode
internal fun PlayerActivity.showV1890ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1890considered
    FeaturePrefsStore.batch1881.v1890considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1890: consisted mode
internal fun PlayerActivity.showV1890ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890consisted
    FeaturePrefsStore.batch1881.v1890consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1890: constructed mode
internal fun PlayerActivity.showV1890ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890constructed
    FeaturePrefsStore.batch1881.v1890constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}
