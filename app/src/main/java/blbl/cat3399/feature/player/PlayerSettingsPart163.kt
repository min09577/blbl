package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1811: addressed mode
internal fun PlayerActivity.showV1811AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811addressed
    FeaturePrefsStore.batch1811.v1811addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1811: adjusted mode
internal fun PlayerActivity.showV1811AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811adjusted
    FeaturePrefsStore.batch1811.v1811adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1811: advanced mode
internal fun PlayerActivity.showV1811AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811advanced
    FeaturePrefsStore.batch1811.v1811advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1811: affected mode
internal fun PlayerActivity.showV1811AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811affected
    FeaturePrefsStore.batch1811.v1811affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1811: agreed mode
internal fun PlayerActivity.showV1811AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811agreed
    FeaturePrefsStore.batch1811.v1811agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1811: aligned level
internal fun PlayerActivity.showV1811AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1811: allocated level
internal fun PlayerActivity.showV1811AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1811: allowed level
internal fun PlayerActivity.showV1811AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1811: amended level
internal fun PlayerActivity.showV1811AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1811: amplified level
internal fun PlayerActivity.showV1811AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1811amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1811amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1811: analyzed mode
internal fun PlayerActivity.showV1811AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811analyzed
    FeaturePrefsStore.batch1811.v1811analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1811: announced mode
internal fun PlayerActivity.showV1811AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811announced
    FeaturePrefsStore.batch1811.v1811announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1811: anticipated mode
internal fun PlayerActivity.showV1811AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811anticipated
    FeaturePrefsStore.batch1811.v1811anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1811: applied mode
internal fun PlayerActivity.showV1811AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811applied
    FeaturePrefsStore.batch1811.v1811applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1811: approved mode
internal fun PlayerActivity.showV1811ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1811approved
    FeaturePrefsStore.batch1811.v1811approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1812: addressed mode
internal fun PlayerActivity.showV1812AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812addressed
    FeaturePrefsStore.batch1811.v1812addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1812: adjusted mode
internal fun PlayerActivity.showV1812AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812adjusted
    FeaturePrefsStore.batch1811.v1812adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1812: advanced mode
internal fun PlayerActivity.showV1812AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812advanced
    FeaturePrefsStore.batch1811.v1812advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1812: affected mode
internal fun PlayerActivity.showV1812AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812affected
    FeaturePrefsStore.batch1811.v1812affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1812: agreed mode
internal fun PlayerActivity.showV1812AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812agreed
    FeaturePrefsStore.batch1811.v1812agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1812: aligned level
internal fun PlayerActivity.showV1812AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1812: allocated level
internal fun PlayerActivity.showV1812AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1812: allowed level
internal fun PlayerActivity.showV1812AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1812: amended level
internal fun PlayerActivity.showV1812AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1812: amplified level
internal fun PlayerActivity.showV1812AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1812amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1812amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1812: analyzed mode
internal fun PlayerActivity.showV1812AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812analyzed
    FeaturePrefsStore.batch1811.v1812analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1812: announced mode
internal fun PlayerActivity.showV1812AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812announced
    FeaturePrefsStore.batch1811.v1812announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1812: anticipated mode
internal fun PlayerActivity.showV1812AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812anticipated
    FeaturePrefsStore.batch1811.v1812anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1812: applied mode
internal fun PlayerActivity.showV1812AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812applied
    FeaturePrefsStore.batch1811.v1812applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1812: approved mode
internal fun PlayerActivity.showV1812ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1812approved
    FeaturePrefsStore.batch1811.v1812approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1813: addressed mode
internal fun PlayerActivity.showV1813AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813addressed
    FeaturePrefsStore.batch1811.v1813addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1813: adjusted mode
internal fun PlayerActivity.showV1813AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813adjusted
    FeaturePrefsStore.batch1811.v1813adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1813: advanced mode
internal fun PlayerActivity.showV1813AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813advanced
    FeaturePrefsStore.batch1811.v1813advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1813: affected mode
internal fun PlayerActivity.showV1813AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813affected
    FeaturePrefsStore.batch1811.v1813affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1813: agreed mode
internal fun PlayerActivity.showV1813AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813agreed
    FeaturePrefsStore.batch1811.v1813agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1813: aligned level
internal fun PlayerActivity.showV1813AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1813: allocated level
internal fun PlayerActivity.showV1813AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1813: allowed level
internal fun PlayerActivity.showV1813AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1813: amended level
internal fun PlayerActivity.showV1813AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1813: amplified level
internal fun PlayerActivity.showV1813AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1813amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1813amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1813: analyzed mode
internal fun PlayerActivity.showV1813AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813analyzed
    FeaturePrefsStore.batch1811.v1813analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1813: announced mode
internal fun PlayerActivity.showV1813AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813announced
    FeaturePrefsStore.batch1811.v1813announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1813: anticipated mode
internal fun PlayerActivity.showV1813AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813anticipated
    FeaturePrefsStore.batch1811.v1813anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1813: applied mode
internal fun PlayerActivity.showV1813AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813applied
    FeaturePrefsStore.batch1811.v1813applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1813: approved mode
internal fun PlayerActivity.showV1813ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1813approved
    FeaturePrefsStore.batch1811.v1813approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1814: addressed mode
internal fun PlayerActivity.showV1814AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814addressed
    FeaturePrefsStore.batch1811.v1814addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1814: adjusted mode
internal fun PlayerActivity.showV1814AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814adjusted
    FeaturePrefsStore.batch1811.v1814adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1814: advanced mode
internal fun PlayerActivity.showV1814AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814advanced
    FeaturePrefsStore.batch1811.v1814advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1814: affected mode
internal fun PlayerActivity.showV1814AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814affected
    FeaturePrefsStore.batch1811.v1814affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1814: agreed mode
internal fun PlayerActivity.showV1814AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814agreed
    FeaturePrefsStore.batch1811.v1814agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1814: aligned level
internal fun PlayerActivity.showV1814AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1814: allocated level
internal fun PlayerActivity.showV1814AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1814: allowed level
internal fun PlayerActivity.showV1814AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1814: amended level
internal fun PlayerActivity.showV1814AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1814: amplified level
internal fun PlayerActivity.showV1814AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1814amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1814amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1814: analyzed mode
internal fun PlayerActivity.showV1814AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814analyzed
    FeaturePrefsStore.batch1811.v1814analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1814: announced mode
internal fun PlayerActivity.showV1814AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814announced
    FeaturePrefsStore.batch1811.v1814announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1814: anticipated mode
internal fun PlayerActivity.showV1814AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814anticipated
    FeaturePrefsStore.batch1811.v1814anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1814: applied mode
internal fun PlayerActivity.showV1814AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814applied
    FeaturePrefsStore.batch1811.v1814applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1814: approved mode
internal fun PlayerActivity.showV1814ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1814approved
    FeaturePrefsStore.batch1811.v1814approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1815: addressed mode
internal fun PlayerActivity.showV1815AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815addressed
    FeaturePrefsStore.batch1811.v1815addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1815: adjusted mode
internal fun PlayerActivity.showV1815AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815adjusted
    FeaturePrefsStore.batch1811.v1815adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1815: advanced mode
internal fun PlayerActivity.showV1815AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815advanced
    FeaturePrefsStore.batch1811.v1815advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1815: affected mode
internal fun PlayerActivity.showV1815AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815affected
    FeaturePrefsStore.batch1811.v1815affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1815: agreed mode
internal fun PlayerActivity.showV1815AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815agreed
    FeaturePrefsStore.batch1811.v1815agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1815: aligned level
internal fun PlayerActivity.showV1815AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1815: allocated level
internal fun PlayerActivity.showV1815AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1815: allowed level
internal fun PlayerActivity.showV1815AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1815: amended level
internal fun PlayerActivity.showV1815AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1815: amplified level
internal fun PlayerActivity.showV1815AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1815amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1815amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1815: analyzed mode
internal fun PlayerActivity.showV1815AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815analyzed
    FeaturePrefsStore.batch1811.v1815analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1815: announced mode
internal fun PlayerActivity.showV1815AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815announced
    FeaturePrefsStore.batch1811.v1815announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1815: anticipated mode
internal fun PlayerActivity.showV1815AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815anticipated
    FeaturePrefsStore.batch1811.v1815anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1815: applied mode
internal fun PlayerActivity.showV1815AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815applied
    FeaturePrefsStore.batch1811.v1815applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1815: approved mode
internal fun PlayerActivity.showV1815ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1815approved
    FeaturePrefsStore.batch1811.v1815approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1816: addressed mode
internal fun PlayerActivity.showV1816AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816addressed
    FeaturePrefsStore.batch1811.v1816addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1816: adjusted mode
internal fun PlayerActivity.showV1816AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816adjusted
    FeaturePrefsStore.batch1811.v1816adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1816: advanced mode
internal fun PlayerActivity.showV1816AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816advanced
    FeaturePrefsStore.batch1811.v1816advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1816: affected mode
internal fun PlayerActivity.showV1816AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816affected
    FeaturePrefsStore.batch1811.v1816affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1816: agreed mode
internal fun PlayerActivity.showV1816AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816agreed
    FeaturePrefsStore.batch1811.v1816agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1816: aligned level
internal fun PlayerActivity.showV1816AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1816: allocated level
internal fun PlayerActivity.showV1816AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1816: allowed level
internal fun PlayerActivity.showV1816AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1816: amended level
internal fun PlayerActivity.showV1816AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1816: amplified level
internal fun PlayerActivity.showV1816AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1816amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1816amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1816: analyzed mode
internal fun PlayerActivity.showV1816AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816analyzed
    FeaturePrefsStore.batch1811.v1816analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1816: announced mode
internal fun PlayerActivity.showV1816AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816announced
    FeaturePrefsStore.batch1811.v1816announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1816: anticipated mode
internal fun PlayerActivity.showV1816AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816anticipated
    FeaturePrefsStore.batch1811.v1816anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1816: applied mode
internal fun PlayerActivity.showV1816AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816applied
    FeaturePrefsStore.batch1811.v1816applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1816: approved mode
internal fun PlayerActivity.showV1816ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1816approved
    FeaturePrefsStore.batch1811.v1816approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1817: addressed mode
internal fun PlayerActivity.showV1817AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817addressed
    FeaturePrefsStore.batch1811.v1817addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1817: adjusted mode
internal fun PlayerActivity.showV1817AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817adjusted
    FeaturePrefsStore.batch1811.v1817adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1817: advanced mode
internal fun PlayerActivity.showV1817AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817advanced
    FeaturePrefsStore.batch1811.v1817advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1817: affected mode
internal fun PlayerActivity.showV1817AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817affected
    FeaturePrefsStore.batch1811.v1817affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1817: agreed mode
internal fun PlayerActivity.showV1817AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817agreed
    FeaturePrefsStore.batch1811.v1817agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1817: aligned level
internal fun PlayerActivity.showV1817AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1817: allocated level
internal fun PlayerActivity.showV1817AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1817: allowed level
internal fun PlayerActivity.showV1817AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1817: amended level
internal fun PlayerActivity.showV1817AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1817: amplified level
internal fun PlayerActivity.showV1817AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1817amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1817amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1817: analyzed mode
internal fun PlayerActivity.showV1817AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817analyzed
    FeaturePrefsStore.batch1811.v1817analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1817: announced mode
internal fun PlayerActivity.showV1817AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817announced
    FeaturePrefsStore.batch1811.v1817announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1817: anticipated mode
internal fun PlayerActivity.showV1817AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817anticipated
    FeaturePrefsStore.batch1811.v1817anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1817: applied mode
internal fun PlayerActivity.showV1817AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817applied
    FeaturePrefsStore.batch1811.v1817applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1817: approved mode
internal fun PlayerActivity.showV1817ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1817approved
    FeaturePrefsStore.batch1811.v1817approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1818: addressed mode
internal fun PlayerActivity.showV1818AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818addressed
    FeaturePrefsStore.batch1811.v1818addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1818: adjusted mode
internal fun PlayerActivity.showV1818AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818adjusted
    FeaturePrefsStore.batch1811.v1818adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1818: advanced mode
internal fun PlayerActivity.showV1818AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818advanced
    FeaturePrefsStore.batch1811.v1818advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1818: affected mode
internal fun PlayerActivity.showV1818AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818affected
    FeaturePrefsStore.batch1811.v1818affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1818: agreed mode
internal fun PlayerActivity.showV1818AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818agreed
    FeaturePrefsStore.batch1811.v1818agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1818: aligned level
internal fun PlayerActivity.showV1818AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1818: allocated level
internal fun PlayerActivity.showV1818AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1818: allowed level
internal fun PlayerActivity.showV1818AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1818: amended level
internal fun PlayerActivity.showV1818AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1818: amplified level
internal fun PlayerActivity.showV1818AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1818amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1818amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1818: analyzed mode
internal fun PlayerActivity.showV1818AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818analyzed
    FeaturePrefsStore.batch1811.v1818analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1818: announced mode
internal fun PlayerActivity.showV1818AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818announced
    FeaturePrefsStore.batch1811.v1818announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1818: anticipated mode
internal fun PlayerActivity.showV1818AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818anticipated
    FeaturePrefsStore.batch1811.v1818anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1818: applied mode
internal fun PlayerActivity.showV1818AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818applied
    FeaturePrefsStore.batch1811.v1818applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1818: approved mode
internal fun PlayerActivity.showV1818ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1818approved
    FeaturePrefsStore.batch1811.v1818approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1819: addressed mode
internal fun PlayerActivity.showV1819AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819addressed
    FeaturePrefsStore.batch1811.v1819addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1819: adjusted mode
internal fun PlayerActivity.showV1819AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819adjusted
    FeaturePrefsStore.batch1811.v1819adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1819: advanced mode
internal fun PlayerActivity.showV1819AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819advanced
    FeaturePrefsStore.batch1811.v1819advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1819: affected mode
internal fun PlayerActivity.showV1819AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819affected
    FeaturePrefsStore.batch1811.v1819affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1819: agreed mode
internal fun PlayerActivity.showV1819AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819agreed
    FeaturePrefsStore.batch1811.v1819agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1819: aligned level
internal fun PlayerActivity.showV1819AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1819: allocated level
internal fun PlayerActivity.showV1819AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1819: allowed level
internal fun PlayerActivity.showV1819AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1819: amended level
internal fun PlayerActivity.showV1819AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1819: amplified level
internal fun PlayerActivity.showV1819AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1819amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1819amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1819: analyzed mode
internal fun PlayerActivity.showV1819AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819analyzed
    FeaturePrefsStore.batch1811.v1819analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1819: announced mode
internal fun PlayerActivity.showV1819AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819announced
    FeaturePrefsStore.batch1811.v1819announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1819: anticipated mode
internal fun PlayerActivity.showV1819AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819anticipated
    FeaturePrefsStore.batch1811.v1819anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1819: applied mode
internal fun PlayerActivity.showV1819AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819applied
    FeaturePrefsStore.batch1811.v1819applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1819: approved mode
internal fun PlayerActivity.showV1819ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1819approved
    FeaturePrefsStore.batch1811.v1819approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

// v1820: addressed mode
internal fun PlayerActivity.showV1820AddressedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820addressed
    FeaturePrefsStore.batch1811.v1820addressed = !current
    AppToast.show(this, "addressed: ${if (!current) "ON" else "OFF"}")
}

// v1820: adjusted mode
internal fun PlayerActivity.showV1820AdjustedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820adjusted
    FeaturePrefsStore.batch1811.v1820adjusted = !current
    AppToast.show(this, "adjusted: ${if (!current) "ON" else "OFF"}")
}

// v1820: advanced mode
internal fun PlayerActivity.showV1820AdvancedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820advanced
    FeaturePrefsStore.batch1811.v1820advanced = !current
    AppToast.show(this, "advanced: ${if (!current) "ON" else "OFF"}")
}

// v1820: affected mode
internal fun PlayerActivity.showV1820AffectedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820affected
    FeaturePrefsStore.batch1811.v1820affected = !current
    AppToast.show(this, "affected: ${if (!current) "ON" else "OFF"}")
}

// v1820: agreed mode
internal fun PlayerActivity.showV1820AgreedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820agreed
    FeaturePrefsStore.batch1811.v1820agreed = !current
    AppToast.show(this, "agreed: ${if (!current) "ON" else "OFF"}")
}

// v1820: aligned level
internal fun PlayerActivity.showV1820AlignedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820aligned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aligned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820aligned = value
        AppToast.show(this, "aligned: $value")
    }
}

// v1820: allocated level
internal fun PlayerActivity.showV1820AllocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820allocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820allocated = value
        AppToast.show(this, "allocated: $value")
    }
}

// v1820: allowed level
internal fun PlayerActivity.showV1820AllowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820allowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820allowed = value
        AppToast.show(this, "allowed: $value")
    }
}

// v1820: amended level
internal fun PlayerActivity.showV1820AmendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820amended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820amended = value
        AppToast.show(this, "amended: $value")
    }
}

// v1820: amplified level
internal fun PlayerActivity.showV1820AmplifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1811.v1820amplified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1811.v1820amplified = value
        AppToast.show(this, "amplified: $value")
    }
}

// v1820: analyzed mode
internal fun PlayerActivity.showV1820AnalyzedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820analyzed
    FeaturePrefsStore.batch1811.v1820analyzed = !current
    AppToast.show(this, "analyzed: ${if (!current) "ON" else "OFF"}")
}

// v1820: announced mode
internal fun PlayerActivity.showV1820AnnouncedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820announced
    FeaturePrefsStore.batch1811.v1820announced = !current
    AppToast.show(this, "announced: ${if (!current) "ON" else "OFF"}")
}

// v1820: anticipated mode
internal fun PlayerActivity.showV1820AnticipatedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820anticipated
    FeaturePrefsStore.batch1811.v1820anticipated = !current
    AppToast.show(this, "anticipated: ${if (!current) "ON" else "OFF"}")
}

// v1820: applied mode
internal fun PlayerActivity.showV1820AppliedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820applied
    FeaturePrefsStore.batch1811.v1820applied = !current
    AppToast.show(this, "applied: ${if (!current) "ON" else "OFF"}")
}

// v1820: approved mode
internal fun PlayerActivity.showV1820ApprovedToggle() {
    val current = FeaturePrefsStore.batch1811.v1820approved
    FeaturePrefsStore.batch1811.v1820approved = !current
    AppToast.show(this, "approved: ${if (!current) "ON" else "OFF"}")
}

