package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2001: federated mode
internal fun PlayerActivity.showV2001FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001federated
    FeaturePrefsStore.batch2001.v2001federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2001: filled mode
internal fun PlayerActivity.showV2001FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2001filled
    FeaturePrefsStore.batch2001.v2001filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2001: filtered mode
internal fun PlayerActivity.showV2001FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2001filtered
    FeaturePrefsStore.batch2001.v2001filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2001: finalized mode
internal fun PlayerActivity.showV2001FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001finalized
    FeaturePrefsStore.batch2001.v2001finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2001: financed mode
internal fun PlayerActivity.showV2001FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001financed
    FeaturePrefsStore.batch2001.v2001financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2001: fired level
internal fun PlayerActivity.showV2001FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2001fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2001fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2001: fitted level
internal fun PlayerActivity.showV2001FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2001fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2001fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2001: flattened level
internal fun PlayerActivity.showV2001FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2001flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2001flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2001: flavored level
internal fun PlayerActivity.showV2001FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2001flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2001flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2001: flexed level
internal fun PlayerActivity.showV2001FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2001flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2001flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2001: floated mode
internal fun PlayerActivity.showV2001FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001floated
    FeaturePrefsStore.batch2001.v2001floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2001: focused mode
internal fun PlayerActivity.showV2001FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001focused
    FeaturePrefsStore.batch2001.v2001focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2001: folded mode
internal fun PlayerActivity.showV2001FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001folded
    FeaturePrefsStore.batch2001.v2001folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2001: followed mode
internal fun PlayerActivity.showV2001FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001followed
    FeaturePrefsStore.batch2001.v2001followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2001: forced mode
internal fun PlayerActivity.showV2001ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2001forced
    FeaturePrefsStore.batch2001.v2001forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2002: federated mode
internal fun PlayerActivity.showV2002FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002federated
    FeaturePrefsStore.batch2001.v2002federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2002: filled mode
internal fun PlayerActivity.showV2002FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2002filled
    FeaturePrefsStore.batch2001.v2002filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2002: filtered mode
internal fun PlayerActivity.showV2002FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2002filtered
    FeaturePrefsStore.batch2001.v2002filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2002: finalized mode
internal fun PlayerActivity.showV2002FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002finalized
    FeaturePrefsStore.batch2001.v2002finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2002: financed mode
internal fun PlayerActivity.showV2002FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002financed
    FeaturePrefsStore.batch2001.v2002financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2002: fired level
internal fun PlayerActivity.showV2002FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2002fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2002fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2002: fitted level
internal fun PlayerActivity.showV2002FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2002fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2002fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2002: flattened level
internal fun PlayerActivity.showV2002FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2002flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2002flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2002: flavored level
internal fun PlayerActivity.showV2002FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2002flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2002flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2002: flexed level
internal fun PlayerActivity.showV2002FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2002flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2002flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2002: floated mode
internal fun PlayerActivity.showV2002FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002floated
    FeaturePrefsStore.batch2001.v2002floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2002: focused mode
internal fun PlayerActivity.showV2002FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002focused
    FeaturePrefsStore.batch2001.v2002focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2002: folded mode
internal fun PlayerActivity.showV2002FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002folded
    FeaturePrefsStore.batch2001.v2002folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2002: followed mode
internal fun PlayerActivity.showV2002FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002followed
    FeaturePrefsStore.batch2001.v2002followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2002: forced mode
internal fun PlayerActivity.showV2002ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2002forced
    FeaturePrefsStore.batch2001.v2002forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2003: federated mode
internal fun PlayerActivity.showV2003FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003federated
    FeaturePrefsStore.batch2001.v2003federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2003: filled mode
internal fun PlayerActivity.showV2003FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2003filled
    FeaturePrefsStore.batch2001.v2003filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2003: filtered mode
internal fun PlayerActivity.showV2003FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2003filtered
    FeaturePrefsStore.batch2001.v2003filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2003: finalized mode
internal fun PlayerActivity.showV2003FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003finalized
    FeaturePrefsStore.batch2001.v2003finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2003: financed mode
internal fun PlayerActivity.showV2003FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003financed
    FeaturePrefsStore.batch2001.v2003financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2003: fired level
internal fun PlayerActivity.showV2003FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2003fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2003fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2003: fitted level
internal fun PlayerActivity.showV2003FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2003fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2003fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2003: flattened level
internal fun PlayerActivity.showV2003FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2003flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2003flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2003: flavored level
internal fun PlayerActivity.showV2003FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2003flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2003flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2003: flexed level
internal fun PlayerActivity.showV2003FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2003flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2003flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2003: floated mode
internal fun PlayerActivity.showV2003FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003floated
    FeaturePrefsStore.batch2001.v2003floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2003: focused mode
internal fun PlayerActivity.showV2003FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003focused
    FeaturePrefsStore.batch2001.v2003focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2003: folded mode
internal fun PlayerActivity.showV2003FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003folded
    FeaturePrefsStore.batch2001.v2003folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2003: followed mode
internal fun PlayerActivity.showV2003FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003followed
    FeaturePrefsStore.batch2001.v2003followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2003: forced mode
internal fun PlayerActivity.showV2003ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2003forced
    FeaturePrefsStore.batch2001.v2003forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2004: federated mode
internal fun PlayerActivity.showV2004FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004federated
    FeaturePrefsStore.batch2001.v2004federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2004: filled mode
internal fun PlayerActivity.showV2004FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2004filled
    FeaturePrefsStore.batch2001.v2004filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2004: filtered mode
internal fun PlayerActivity.showV2004FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2004filtered
    FeaturePrefsStore.batch2001.v2004filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2004: finalized mode
internal fun PlayerActivity.showV2004FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004finalized
    FeaturePrefsStore.batch2001.v2004finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2004: financed mode
internal fun PlayerActivity.showV2004FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004financed
    FeaturePrefsStore.batch2001.v2004financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2004: fired level
internal fun PlayerActivity.showV2004FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2004fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2004fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2004: fitted level
internal fun PlayerActivity.showV2004FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2004fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2004fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2004: flattened level
internal fun PlayerActivity.showV2004FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2004flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2004flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2004: flavored level
internal fun PlayerActivity.showV2004FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2004flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2004flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2004: flexed level
internal fun PlayerActivity.showV2004FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2004flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2004flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2004: floated mode
internal fun PlayerActivity.showV2004FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004floated
    FeaturePrefsStore.batch2001.v2004floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2004: focused mode
internal fun PlayerActivity.showV2004FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004focused
    FeaturePrefsStore.batch2001.v2004focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2004: folded mode
internal fun PlayerActivity.showV2004FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004folded
    FeaturePrefsStore.batch2001.v2004folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2004: followed mode
internal fun PlayerActivity.showV2004FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004followed
    FeaturePrefsStore.batch2001.v2004followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2004: forced mode
internal fun PlayerActivity.showV2004ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2004forced
    FeaturePrefsStore.batch2001.v2004forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2005: federated mode
internal fun PlayerActivity.showV2005FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005federated
    FeaturePrefsStore.batch2001.v2005federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2005: filled mode
internal fun PlayerActivity.showV2005FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2005filled
    FeaturePrefsStore.batch2001.v2005filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2005: filtered mode
internal fun PlayerActivity.showV2005FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2005filtered
    FeaturePrefsStore.batch2001.v2005filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2005: finalized mode
internal fun PlayerActivity.showV2005FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005finalized
    FeaturePrefsStore.batch2001.v2005finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2005: financed mode
internal fun PlayerActivity.showV2005FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005financed
    FeaturePrefsStore.batch2001.v2005financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2005: fired level
internal fun PlayerActivity.showV2005FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2005fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2005fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2005: fitted level
internal fun PlayerActivity.showV2005FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2005fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2005fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2005: flattened level
internal fun PlayerActivity.showV2005FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2005flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2005flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2005: flavored level
internal fun PlayerActivity.showV2005FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2005flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2005flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2005: flexed level
internal fun PlayerActivity.showV2005FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2005flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2005flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2005: floated mode
internal fun PlayerActivity.showV2005FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005floated
    FeaturePrefsStore.batch2001.v2005floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2005: focused mode
internal fun PlayerActivity.showV2005FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005focused
    FeaturePrefsStore.batch2001.v2005focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2005: folded mode
internal fun PlayerActivity.showV2005FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005folded
    FeaturePrefsStore.batch2001.v2005folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2005: followed mode
internal fun PlayerActivity.showV2005FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005followed
    FeaturePrefsStore.batch2001.v2005followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2005: forced mode
internal fun PlayerActivity.showV2005ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2005forced
    FeaturePrefsStore.batch2001.v2005forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2006: federated mode
internal fun PlayerActivity.showV2006FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006federated
    FeaturePrefsStore.batch2001.v2006federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2006: filled mode
internal fun PlayerActivity.showV2006FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2006filled
    FeaturePrefsStore.batch2001.v2006filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2006: filtered mode
internal fun PlayerActivity.showV2006FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2006filtered
    FeaturePrefsStore.batch2001.v2006filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2006: finalized mode
internal fun PlayerActivity.showV2006FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006finalized
    FeaturePrefsStore.batch2001.v2006finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2006: financed mode
internal fun PlayerActivity.showV2006FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006financed
    FeaturePrefsStore.batch2001.v2006financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2006: fired level
internal fun PlayerActivity.showV2006FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2006fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2006fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2006: fitted level
internal fun PlayerActivity.showV2006FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2006fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2006fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2006: flattened level
internal fun PlayerActivity.showV2006FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2006flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2006flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2006: flavored level
internal fun PlayerActivity.showV2006FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2006flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2006flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2006: flexed level
internal fun PlayerActivity.showV2006FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2006flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2006flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2006: floated mode
internal fun PlayerActivity.showV2006FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006floated
    FeaturePrefsStore.batch2001.v2006floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2006: focused mode
internal fun PlayerActivity.showV2006FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006focused
    FeaturePrefsStore.batch2001.v2006focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2006: folded mode
internal fun PlayerActivity.showV2006FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006folded
    FeaturePrefsStore.batch2001.v2006folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2006: followed mode
internal fun PlayerActivity.showV2006FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006followed
    FeaturePrefsStore.batch2001.v2006followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2006: forced mode
internal fun PlayerActivity.showV2006ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2006forced
    FeaturePrefsStore.batch2001.v2006forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2007: federated mode
internal fun PlayerActivity.showV2007FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007federated
    FeaturePrefsStore.batch2001.v2007federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2007: filled mode
internal fun PlayerActivity.showV2007FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2007filled
    FeaturePrefsStore.batch2001.v2007filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2007: filtered mode
internal fun PlayerActivity.showV2007FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2007filtered
    FeaturePrefsStore.batch2001.v2007filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2007: finalized mode
internal fun PlayerActivity.showV2007FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007finalized
    FeaturePrefsStore.batch2001.v2007finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2007: financed mode
internal fun PlayerActivity.showV2007FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007financed
    FeaturePrefsStore.batch2001.v2007financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2007: fired level
internal fun PlayerActivity.showV2007FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2007fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2007fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2007: fitted level
internal fun PlayerActivity.showV2007FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2007fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2007fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2007: flattened level
internal fun PlayerActivity.showV2007FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2007flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2007flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2007: flavored level
internal fun PlayerActivity.showV2007FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2007flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2007flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2007: flexed level
internal fun PlayerActivity.showV2007FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2007flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2007flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2007: floated mode
internal fun PlayerActivity.showV2007FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007floated
    FeaturePrefsStore.batch2001.v2007floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2007: focused mode
internal fun PlayerActivity.showV2007FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007focused
    FeaturePrefsStore.batch2001.v2007focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2007: folded mode
internal fun PlayerActivity.showV2007FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007folded
    FeaturePrefsStore.batch2001.v2007folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2007: followed mode
internal fun PlayerActivity.showV2007FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007followed
    FeaturePrefsStore.batch2001.v2007followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2007: forced mode
internal fun PlayerActivity.showV2007ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2007forced
    FeaturePrefsStore.batch2001.v2007forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2008: federated mode
internal fun PlayerActivity.showV2008FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008federated
    FeaturePrefsStore.batch2001.v2008federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2008: filled mode
internal fun PlayerActivity.showV2008FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2008filled
    FeaturePrefsStore.batch2001.v2008filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2008: filtered mode
internal fun PlayerActivity.showV2008FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2008filtered
    FeaturePrefsStore.batch2001.v2008filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2008: finalized mode
internal fun PlayerActivity.showV2008FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008finalized
    FeaturePrefsStore.batch2001.v2008finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2008: financed mode
internal fun PlayerActivity.showV2008FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008financed
    FeaturePrefsStore.batch2001.v2008financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2008: fired level
internal fun PlayerActivity.showV2008FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2008fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2008fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2008: fitted level
internal fun PlayerActivity.showV2008FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2008fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2008fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2008: flattened level
internal fun PlayerActivity.showV2008FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2008flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2008flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2008: flavored level
internal fun PlayerActivity.showV2008FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2008flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2008flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2008: flexed level
internal fun PlayerActivity.showV2008FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2008flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2008flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2008: floated mode
internal fun PlayerActivity.showV2008FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008floated
    FeaturePrefsStore.batch2001.v2008floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2008: focused mode
internal fun PlayerActivity.showV2008FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008focused
    FeaturePrefsStore.batch2001.v2008focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2008: folded mode
internal fun PlayerActivity.showV2008FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008folded
    FeaturePrefsStore.batch2001.v2008folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2008: followed mode
internal fun PlayerActivity.showV2008FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008followed
    FeaturePrefsStore.batch2001.v2008followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2008: forced mode
internal fun PlayerActivity.showV2008ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2008forced
    FeaturePrefsStore.batch2001.v2008forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2009: federated mode
internal fun PlayerActivity.showV2009FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009federated
    FeaturePrefsStore.batch2001.v2009federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2009: filled mode
internal fun PlayerActivity.showV2009FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2009filled
    FeaturePrefsStore.batch2001.v2009filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2009: filtered mode
internal fun PlayerActivity.showV2009FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2009filtered
    FeaturePrefsStore.batch2001.v2009filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2009: finalized mode
internal fun PlayerActivity.showV2009FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009finalized
    FeaturePrefsStore.batch2001.v2009finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2009: financed mode
internal fun PlayerActivity.showV2009FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009financed
    FeaturePrefsStore.batch2001.v2009financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2009: fired level
internal fun PlayerActivity.showV2009FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2009fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2009fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2009: fitted level
internal fun PlayerActivity.showV2009FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2009fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2009fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2009: flattened level
internal fun PlayerActivity.showV2009FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2009flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2009flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2009: flavored level
internal fun PlayerActivity.showV2009FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2009flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2009flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2009: flexed level
internal fun PlayerActivity.showV2009FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2009flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2009flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2009: floated mode
internal fun PlayerActivity.showV2009FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009floated
    FeaturePrefsStore.batch2001.v2009floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2009: focused mode
internal fun PlayerActivity.showV2009FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009focused
    FeaturePrefsStore.batch2001.v2009focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2009: folded mode
internal fun PlayerActivity.showV2009FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009folded
    FeaturePrefsStore.batch2001.v2009folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2009: followed mode
internal fun PlayerActivity.showV2009FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009followed
    FeaturePrefsStore.batch2001.v2009followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2009: forced mode
internal fun PlayerActivity.showV2009ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2009forced
    FeaturePrefsStore.batch2001.v2009forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

// v2010: federated mode
internal fun PlayerActivity.showV2010FederatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010federated
    FeaturePrefsStore.batch2001.v2010federated = !current
    AppToast.show(this, "federated: ${if (!current) "ON" else "OFF"}")
}

// v2010: filled mode
internal fun PlayerActivity.showV2010FilledToggle() {
    val current = FeaturePrefsStore.batch2001.v2010filled
    FeaturePrefsStore.batch2001.v2010filled = !current
    AppToast.show(this, "filled: ${if (!current) "ON" else "OFF"}")
}

// v2010: filtered mode
internal fun PlayerActivity.showV2010FilteredToggle() {
    val current = FeaturePrefsStore.batch2001.v2010filtered
    FeaturePrefsStore.batch2001.v2010filtered = !current
    AppToast.show(this, "filtered: ${if (!current) "ON" else "OFF"}")
}

// v2010: finalized mode
internal fun PlayerActivity.showV2010FinalizedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010finalized
    FeaturePrefsStore.batch2001.v2010finalized = !current
    AppToast.show(this, "finalized: ${if (!current) "ON" else "OFF"}")
}

// v2010: financed mode
internal fun PlayerActivity.showV2010FinancedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010financed
    FeaturePrefsStore.batch2001.v2010financed = !current
    AppToast.show(this, "financed: ${if (!current) "ON" else "OFF"}")
}

// v2010: fired level
internal fun PlayerActivity.showV2010FiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2010fired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2010fired = value
        AppToast.show(this, "fired: $value")
    }
}

// v2010: fitted level
internal fun PlayerActivity.showV2010FittedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2010fitted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fitted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2010fitted = value
        AppToast.show(this, "fitted: $value")
    }
}

// v2010: flattened level
internal fun PlayerActivity.showV2010FlattenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2010flattened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flattened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2010flattened = value
        AppToast.show(this, "flattened: $value")
    }
}

// v2010: flavored level
internal fun PlayerActivity.showV2010FlavoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2010flavored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flavored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2010flavored = value
        AppToast.show(this, "flavored: $value")
    }
}

// v2010: flexed level
internal fun PlayerActivity.showV2010FlexedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2001.v2010flexed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "flexed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2001.v2010flexed = value
        AppToast.show(this, "flexed: $value")
    }
}

// v2010: floated mode
internal fun PlayerActivity.showV2010FloatedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010floated
    FeaturePrefsStore.batch2001.v2010floated = !current
    AppToast.show(this, "floated: ${if (!current) "ON" else "OFF"}")
}

// v2010: focused mode
internal fun PlayerActivity.showV2010FocusedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010focused
    FeaturePrefsStore.batch2001.v2010focused = !current
    AppToast.show(this, "focused: ${if (!current) "ON" else "OFF"}")
}

// v2010: folded mode
internal fun PlayerActivity.showV2010FoldedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010folded
    FeaturePrefsStore.batch2001.v2010folded = !current
    AppToast.show(this, "folded: ${if (!current) "ON" else "OFF"}")
}

// v2010: followed mode
internal fun PlayerActivity.showV2010FollowedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010followed
    FeaturePrefsStore.batch2001.v2010followed = !current
    AppToast.show(this, "followed: ${if (!current) "ON" else "OFF"}")
}

// v2010: forced mode
internal fun PlayerActivity.showV2010ForcedToggle() {
    val current = FeaturePrefsStore.batch2001.v2010forced
    FeaturePrefsStore.batch2001.v2010forced = !current
    AppToast.show(this, "forced: ${if (!current) "ON" else "OFF"}")
}

