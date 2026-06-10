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

// v2011: forecasted mode
internal fun PlayerActivity.showV2011ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forecasted
    FeaturePrefsStore.batch2011.v2011forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2011: forged mode
internal fun PlayerActivity.showV2011ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forged
    FeaturePrefsStore.batch2011.v2011forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2011: forgotten mode
internal fun PlayerActivity.showV2011ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2011forgotten
    FeaturePrefsStore.batch2011.v2011forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2011: formatted mode
internal fun PlayerActivity.showV2011FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011formatted
    FeaturePrefsStore.batch2011.v2011formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2011: formulated mode
internal fun PlayerActivity.showV2011FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011formulated
    FeaturePrefsStore.batch2011.v2011formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2011: fortified level
internal fun PlayerActivity.showV2011FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2011: fostered level
internal fun PlayerActivity.showV2011FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2011: founded level
internal fun PlayerActivity.showV2011FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2011: framed level
internal fun PlayerActivity.showV2011FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2011: freed level
internal fun PlayerActivity.showV2011FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2011freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2011freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2011: freezed mode
internal fun PlayerActivity.showV2011FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011freezed
    FeaturePrefsStore.batch2011.v2011freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2011: frequented mode
internal fun PlayerActivity.showV2011FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frequented
    FeaturePrefsStore.batch2011.v2011frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2011: fried mode
internal fun PlayerActivity.showV2011FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011fried
    FeaturePrefsStore.batch2011.v2011fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2011: frightened mode
internal fun PlayerActivity.showV2011FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frightened
    FeaturePrefsStore.batch2011.v2011frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2011: frustrated mode
internal fun PlayerActivity.showV2011FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2011frustrated
    FeaturePrefsStore.batch2011.v2011frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2012: forecasted mode
internal fun PlayerActivity.showV2012ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forecasted
    FeaturePrefsStore.batch2011.v2012forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2012: forged mode
internal fun PlayerActivity.showV2012ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forged
    FeaturePrefsStore.batch2011.v2012forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2012: forgotten mode
internal fun PlayerActivity.showV2012ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2012forgotten
    FeaturePrefsStore.batch2011.v2012forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2012: formatted mode
internal fun PlayerActivity.showV2012FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012formatted
    FeaturePrefsStore.batch2011.v2012formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2012: formulated mode
internal fun PlayerActivity.showV2012FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012formulated
    FeaturePrefsStore.batch2011.v2012formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2012: fortified level
internal fun PlayerActivity.showV2012FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2012: fostered level
internal fun PlayerActivity.showV2012FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2012: founded level
internal fun PlayerActivity.showV2012FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2012: framed level
internal fun PlayerActivity.showV2012FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2012: freed level
internal fun PlayerActivity.showV2012FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2012freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2012freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2012: freezed mode
internal fun PlayerActivity.showV2012FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012freezed
    FeaturePrefsStore.batch2011.v2012freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2012: frequented mode
internal fun PlayerActivity.showV2012FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frequented
    FeaturePrefsStore.batch2011.v2012frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2012: fried mode
internal fun PlayerActivity.showV2012FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012fried
    FeaturePrefsStore.batch2011.v2012fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2012: frightened mode
internal fun PlayerActivity.showV2012FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frightened
    FeaturePrefsStore.batch2011.v2012frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2012: frustrated mode
internal fun PlayerActivity.showV2012FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2012frustrated
    FeaturePrefsStore.batch2011.v2012frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2013: forecasted mode
internal fun PlayerActivity.showV2013ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forecasted
    FeaturePrefsStore.batch2011.v2013forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2013: forged mode
internal fun PlayerActivity.showV2013ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forged
    FeaturePrefsStore.batch2011.v2013forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2013: forgotten mode
internal fun PlayerActivity.showV2013ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2013forgotten
    FeaturePrefsStore.batch2011.v2013forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2013: formatted mode
internal fun PlayerActivity.showV2013FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013formatted
    FeaturePrefsStore.batch2011.v2013formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2013: formulated mode
internal fun PlayerActivity.showV2013FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013formulated
    FeaturePrefsStore.batch2011.v2013formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2013: fortified level
internal fun PlayerActivity.showV2013FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2013: fostered level
internal fun PlayerActivity.showV2013FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2013: founded level
internal fun PlayerActivity.showV2013FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2013: framed level
internal fun PlayerActivity.showV2013FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2013: freed level
internal fun PlayerActivity.showV2013FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2013freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2013freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2013: freezed mode
internal fun PlayerActivity.showV2013FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013freezed
    FeaturePrefsStore.batch2011.v2013freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2013: frequented mode
internal fun PlayerActivity.showV2013FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frequented
    FeaturePrefsStore.batch2011.v2013frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2013: fried mode
internal fun PlayerActivity.showV2013FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013fried
    FeaturePrefsStore.batch2011.v2013fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2013: frightened mode
internal fun PlayerActivity.showV2013FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frightened
    FeaturePrefsStore.batch2011.v2013frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2013: frustrated mode
internal fun PlayerActivity.showV2013FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2013frustrated
    FeaturePrefsStore.batch2011.v2013frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2014: forecasted mode
internal fun PlayerActivity.showV2014ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forecasted
    FeaturePrefsStore.batch2011.v2014forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2014: forged mode
internal fun PlayerActivity.showV2014ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forged
    FeaturePrefsStore.batch2011.v2014forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2014: forgotten mode
internal fun PlayerActivity.showV2014ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2014forgotten
    FeaturePrefsStore.batch2011.v2014forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2014: formatted mode
internal fun PlayerActivity.showV2014FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014formatted
    FeaturePrefsStore.batch2011.v2014formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2014: formulated mode
internal fun PlayerActivity.showV2014FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014formulated
    FeaturePrefsStore.batch2011.v2014formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2014: fortified level
internal fun PlayerActivity.showV2014FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2014: fostered level
internal fun PlayerActivity.showV2014FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2014: founded level
internal fun PlayerActivity.showV2014FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2014: framed level
internal fun PlayerActivity.showV2014FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2014: freed level
internal fun PlayerActivity.showV2014FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2014freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2014freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2014: freezed mode
internal fun PlayerActivity.showV2014FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014freezed
    FeaturePrefsStore.batch2011.v2014freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2014: frequented mode
internal fun PlayerActivity.showV2014FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frequented
    FeaturePrefsStore.batch2011.v2014frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2014: fried mode
internal fun PlayerActivity.showV2014FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014fried
    FeaturePrefsStore.batch2011.v2014fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2014: frightened mode
internal fun PlayerActivity.showV2014FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frightened
    FeaturePrefsStore.batch2011.v2014frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2014: frustrated mode
internal fun PlayerActivity.showV2014FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2014frustrated
    FeaturePrefsStore.batch2011.v2014frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2015: forecasted mode
internal fun PlayerActivity.showV2015ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forecasted
    FeaturePrefsStore.batch2011.v2015forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2015: forged mode
internal fun PlayerActivity.showV2015ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forged
    FeaturePrefsStore.batch2011.v2015forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2015: forgotten mode
internal fun PlayerActivity.showV2015ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2015forgotten
    FeaturePrefsStore.batch2011.v2015forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2015: formatted mode
internal fun PlayerActivity.showV2015FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015formatted
    FeaturePrefsStore.batch2011.v2015formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2015: formulated mode
internal fun PlayerActivity.showV2015FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015formulated
    FeaturePrefsStore.batch2011.v2015formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2015: fortified level
internal fun PlayerActivity.showV2015FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2015: fostered level
internal fun PlayerActivity.showV2015FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2015: founded level
internal fun PlayerActivity.showV2015FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2015: framed level
internal fun PlayerActivity.showV2015FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2015: freed level
internal fun PlayerActivity.showV2015FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2015freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2015freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2015: freezed mode
internal fun PlayerActivity.showV2015FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015freezed
    FeaturePrefsStore.batch2011.v2015freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2015: frequented mode
internal fun PlayerActivity.showV2015FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frequented
    FeaturePrefsStore.batch2011.v2015frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2015: fried mode
internal fun PlayerActivity.showV2015FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015fried
    FeaturePrefsStore.batch2011.v2015fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2015: frightened mode
internal fun PlayerActivity.showV2015FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frightened
    FeaturePrefsStore.batch2011.v2015frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2015: frustrated mode
internal fun PlayerActivity.showV2015FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2015frustrated
    FeaturePrefsStore.batch2011.v2015frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2016: forecasted mode
internal fun PlayerActivity.showV2016ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forecasted
    FeaturePrefsStore.batch2011.v2016forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2016: forged mode
internal fun PlayerActivity.showV2016ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forged
    FeaturePrefsStore.batch2011.v2016forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2016: forgotten mode
internal fun PlayerActivity.showV2016ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2016forgotten
    FeaturePrefsStore.batch2011.v2016forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2016: formatted mode
internal fun PlayerActivity.showV2016FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016formatted
    FeaturePrefsStore.batch2011.v2016formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2016: formulated mode
internal fun PlayerActivity.showV2016FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016formulated
    FeaturePrefsStore.batch2011.v2016formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2016: fortified level
internal fun PlayerActivity.showV2016FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2016: fostered level
internal fun PlayerActivity.showV2016FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2016: founded level
internal fun PlayerActivity.showV2016FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2016: framed level
internal fun PlayerActivity.showV2016FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2016: freed level
internal fun PlayerActivity.showV2016FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2016freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2016freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2016: freezed mode
internal fun PlayerActivity.showV2016FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016freezed
    FeaturePrefsStore.batch2011.v2016freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2016: frequented mode
internal fun PlayerActivity.showV2016FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frequented
    FeaturePrefsStore.batch2011.v2016frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2016: fried mode
internal fun PlayerActivity.showV2016FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016fried
    FeaturePrefsStore.batch2011.v2016fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2016: frightened mode
internal fun PlayerActivity.showV2016FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frightened
    FeaturePrefsStore.batch2011.v2016frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2016: frustrated mode
internal fun PlayerActivity.showV2016FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2016frustrated
    FeaturePrefsStore.batch2011.v2016frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2017: forecasted mode
internal fun PlayerActivity.showV2017ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forecasted
    FeaturePrefsStore.batch2011.v2017forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2017: forged mode
internal fun PlayerActivity.showV2017ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forged
    FeaturePrefsStore.batch2011.v2017forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2017: forgotten mode
internal fun PlayerActivity.showV2017ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2017forgotten
    FeaturePrefsStore.batch2011.v2017forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2017: formatted mode
internal fun PlayerActivity.showV2017FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017formatted
    FeaturePrefsStore.batch2011.v2017formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2017: formulated mode
internal fun PlayerActivity.showV2017FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017formulated
    FeaturePrefsStore.batch2011.v2017formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2017: fortified level
internal fun PlayerActivity.showV2017FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2017: fostered level
internal fun PlayerActivity.showV2017FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2017: founded level
internal fun PlayerActivity.showV2017FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2017: framed level
internal fun PlayerActivity.showV2017FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2017: freed level
internal fun PlayerActivity.showV2017FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2017freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2017freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2017: freezed mode
internal fun PlayerActivity.showV2017FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017freezed
    FeaturePrefsStore.batch2011.v2017freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2017: frequented mode
internal fun PlayerActivity.showV2017FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frequented
    FeaturePrefsStore.batch2011.v2017frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2017: fried mode
internal fun PlayerActivity.showV2017FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017fried
    FeaturePrefsStore.batch2011.v2017fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2017: frightened mode
internal fun PlayerActivity.showV2017FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frightened
    FeaturePrefsStore.batch2011.v2017frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2017: frustrated mode
internal fun PlayerActivity.showV2017FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2017frustrated
    FeaturePrefsStore.batch2011.v2017frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2018: forecasted mode
internal fun PlayerActivity.showV2018ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forecasted
    FeaturePrefsStore.batch2011.v2018forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2018: forged mode
internal fun PlayerActivity.showV2018ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forged
    FeaturePrefsStore.batch2011.v2018forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2018: forgotten mode
internal fun PlayerActivity.showV2018ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2018forgotten
    FeaturePrefsStore.batch2011.v2018forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2018: formatted mode
internal fun PlayerActivity.showV2018FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018formatted
    FeaturePrefsStore.batch2011.v2018formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2018: formulated mode
internal fun PlayerActivity.showV2018FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018formulated
    FeaturePrefsStore.batch2011.v2018formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2018: fortified level
internal fun PlayerActivity.showV2018FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2018: fostered level
internal fun PlayerActivity.showV2018FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2018: founded level
internal fun PlayerActivity.showV2018FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2018: framed level
internal fun PlayerActivity.showV2018FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2018: freed level
internal fun PlayerActivity.showV2018FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2018freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2018freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2018: freezed mode
internal fun PlayerActivity.showV2018FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018freezed
    FeaturePrefsStore.batch2011.v2018freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2018: frequented mode
internal fun PlayerActivity.showV2018FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frequented
    FeaturePrefsStore.batch2011.v2018frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2018: fried mode
internal fun PlayerActivity.showV2018FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018fried
    FeaturePrefsStore.batch2011.v2018fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2018: frightened mode
internal fun PlayerActivity.showV2018FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frightened
    FeaturePrefsStore.batch2011.v2018frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2018: frustrated mode
internal fun PlayerActivity.showV2018FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2018frustrated
    FeaturePrefsStore.batch2011.v2018frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2019: forecasted mode
internal fun PlayerActivity.showV2019ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forecasted
    FeaturePrefsStore.batch2011.v2019forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2019: forged mode
internal fun PlayerActivity.showV2019ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forged
    FeaturePrefsStore.batch2011.v2019forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2019: forgotten mode
internal fun PlayerActivity.showV2019ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2019forgotten
    FeaturePrefsStore.batch2011.v2019forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2019: formatted mode
internal fun PlayerActivity.showV2019FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019formatted
    FeaturePrefsStore.batch2011.v2019formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2019: formulated mode
internal fun PlayerActivity.showV2019FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019formulated
    FeaturePrefsStore.batch2011.v2019formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2019: fortified level
internal fun PlayerActivity.showV2019FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2019: fostered level
internal fun PlayerActivity.showV2019FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2019: founded level
internal fun PlayerActivity.showV2019FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2019: framed level
internal fun PlayerActivity.showV2019FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2019: freed level
internal fun PlayerActivity.showV2019FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2019freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2019freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2019: freezed mode
internal fun PlayerActivity.showV2019FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019freezed
    FeaturePrefsStore.batch2011.v2019freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2019: frequented mode
internal fun PlayerActivity.showV2019FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frequented
    FeaturePrefsStore.batch2011.v2019frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2019: fried mode
internal fun PlayerActivity.showV2019FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019fried
    FeaturePrefsStore.batch2011.v2019fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2019: frightened mode
internal fun PlayerActivity.showV2019FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frightened
    FeaturePrefsStore.batch2011.v2019frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2019: frustrated mode
internal fun PlayerActivity.showV2019FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2019frustrated
    FeaturePrefsStore.batch2011.v2019frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2020: forecasted mode
internal fun PlayerActivity.showV2020ForecastedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forecasted
    FeaturePrefsStore.batch2011.v2020forecasted = !current
    AppToast.show(this, "forecasted: ${if (!current) "ON" else "OFF"}")
}

// v2020: forged mode
internal fun PlayerActivity.showV2020ForgedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forged
    FeaturePrefsStore.batch2011.v2020forged = !current
    AppToast.show(this, "forged: ${if (!current) "ON" else "OFF"}")
}

// v2020: forgotten mode
internal fun PlayerActivity.showV2020ForgottenToggle() {
    val current = FeaturePrefsStore.batch2011.v2020forgotten
    FeaturePrefsStore.batch2011.v2020forgotten = !current
    AppToast.show(this, "forgotten: ${if (!current) "ON" else "OFF"}")
}

// v2020: formatted mode
internal fun PlayerActivity.showV2020FormattedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020formatted
    FeaturePrefsStore.batch2011.v2020formatted = !current
    AppToast.show(this, "formatted: ${if (!current) "ON" else "OFF"}")
}

// v2020: formulated mode
internal fun PlayerActivity.showV2020FormulatedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020formulated
    FeaturePrefsStore.batch2011.v2020formulated = !current
    AppToast.show(this, "formulated: ${if (!current) "ON" else "OFF"}")
}

// v2020: fortified level
internal fun PlayerActivity.showV2020FortifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020fortified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fortified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020fortified = value
        AppToast.show(this, "fortified: $value")
    }
}

// v2020: fostered level
internal fun PlayerActivity.showV2020FosteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020fostered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fostered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020fostered = value
        AppToast.show(this, "fostered: $value")
    }
}

// v2020: founded level
internal fun PlayerActivity.showV2020FoundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020founded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "founded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020founded = value
        AppToast.show(this, "founded: $value")
    }
}

// v2020: framed level
internal fun PlayerActivity.showV2020FramedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020framed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "framed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020framed = value
        AppToast.show(this, "framed: $value")
    }
}

// v2020: freed level
internal fun PlayerActivity.showV2020FreedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2011.v2020freed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "freed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2011.v2020freed = value
        AppToast.show(this, "freed: $value")
    }
}

// v2020: freezed mode
internal fun PlayerActivity.showV2020FreezedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020freezed
    FeaturePrefsStore.batch2011.v2020freezed = !current
    AppToast.show(this, "freezed: ${if (!current) "ON" else "OFF"}")
}

// v2020: frequented mode
internal fun PlayerActivity.showV2020FrequentedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frequented
    FeaturePrefsStore.batch2011.v2020frequented = !current
    AppToast.show(this, "frequented: ${if (!current) "ON" else "OFF"}")
}

// v2020: fried mode
internal fun PlayerActivity.showV2020FriedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020fried
    FeaturePrefsStore.batch2011.v2020fried = !current
    AppToast.show(this, "fried: ${if (!current) "ON" else "OFF"}")
}

// v2020: frightened mode
internal fun PlayerActivity.showV2020FrightenedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frightened
    FeaturePrefsStore.batch2011.v2020frightened = !current
    AppToast.show(this, "frightened: ${if (!current) "ON" else "OFF"}")
}

// v2020: frustrated mode
internal fun PlayerActivity.showV2020FrustratedToggle() {
    val current = FeaturePrefsStore.batch2011.v2020frustrated
    FeaturePrefsStore.batch2011.v2020frustrated = !current
    AppToast.show(this, "frustrated: ${if (!current) "ON" else "OFF"}")
}

// v2021: fulfilled mode
internal fun PlayerActivity.showV2021FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2021fulfilled
    FeaturePrefsStore.batch2021.v2021fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2021: functioned mode
internal fun PlayerActivity.showV2021FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021functioned
    FeaturePrefsStore.batch2021.v2021functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2021: funded mode
internal fun PlayerActivity.showV2021FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021funded
    FeaturePrefsStore.batch2021.v2021funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2021: gathered mode
internal fun PlayerActivity.showV2021GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2021gathered
    FeaturePrefsStore.batch2021.v2021gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2021: generated mode
internal fun PlayerActivity.showV2021GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021generated
    FeaturePrefsStore.batch2021.v2021generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2021: governed level
internal fun PlayerActivity.showV2021GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2021: graduated level
internal fun PlayerActivity.showV2021GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2021: granted level
internal fun PlayerActivity.showV2021GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2021: greeted level
internal fun PlayerActivity.showV2021GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2021: grounded level
internal fun PlayerActivity.showV2021GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2021grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2021grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2021: grouped mode
internal fun PlayerActivity.showV2021GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021grouped
    FeaturePrefsStore.batch2021.v2021grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2021: guaranteed mode
internal fun PlayerActivity.showV2021GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guaranteed
    FeaturePrefsStore.batch2021.v2021guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2021: guarded mode
internal fun PlayerActivity.showV2021GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guarded
    FeaturePrefsStore.batch2021.v2021guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2021: guided mode
internal fun PlayerActivity.showV2021GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2021guided
    FeaturePrefsStore.batch2021.v2021guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2021: handled mode
internal fun PlayerActivity.showV2021HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2021handled
    FeaturePrefsStore.batch2021.v2021handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2022: fulfilled mode
internal fun PlayerActivity.showV2022FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2022fulfilled
    FeaturePrefsStore.batch2021.v2022fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2022: functioned mode
internal fun PlayerActivity.showV2022FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022functioned
    FeaturePrefsStore.batch2021.v2022functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2022: funded mode
internal fun PlayerActivity.showV2022FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022funded
    FeaturePrefsStore.batch2021.v2022funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2022: gathered mode
internal fun PlayerActivity.showV2022GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2022gathered
    FeaturePrefsStore.batch2021.v2022gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2022: generated mode
internal fun PlayerActivity.showV2022GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022generated
    FeaturePrefsStore.batch2021.v2022generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2022: governed level
internal fun PlayerActivity.showV2022GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2022: graduated level
internal fun PlayerActivity.showV2022GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2022: granted level
internal fun PlayerActivity.showV2022GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2022: greeted level
internal fun PlayerActivity.showV2022GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2022: grounded level
internal fun PlayerActivity.showV2022GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2022grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2022grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2022: grouped mode
internal fun PlayerActivity.showV2022GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022grouped
    FeaturePrefsStore.batch2021.v2022grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2022: guaranteed mode
internal fun PlayerActivity.showV2022GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guaranteed
    FeaturePrefsStore.batch2021.v2022guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2022: guarded mode
internal fun PlayerActivity.showV2022GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guarded
    FeaturePrefsStore.batch2021.v2022guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2022: guided mode
internal fun PlayerActivity.showV2022GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2022guided
    FeaturePrefsStore.batch2021.v2022guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2022: handled mode
internal fun PlayerActivity.showV2022HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2022handled
    FeaturePrefsStore.batch2021.v2022handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2023: fulfilled mode
internal fun PlayerActivity.showV2023FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2023fulfilled
    FeaturePrefsStore.batch2021.v2023fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2023: functioned mode
internal fun PlayerActivity.showV2023FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023functioned
    FeaturePrefsStore.batch2021.v2023functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2023: funded mode
internal fun PlayerActivity.showV2023FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023funded
    FeaturePrefsStore.batch2021.v2023funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2023: gathered mode
internal fun PlayerActivity.showV2023GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2023gathered
    FeaturePrefsStore.batch2021.v2023gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2023: generated mode
internal fun PlayerActivity.showV2023GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023generated
    FeaturePrefsStore.batch2021.v2023generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2023: governed level
internal fun PlayerActivity.showV2023GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2023: graduated level
internal fun PlayerActivity.showV2023GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2023: granted level
internal fun PlayerActivity.showV2023GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2023: greeted level
internal fun PlayerActivity.showV2023GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2023: grounded level
internal fun PlayerActivity.showV2023GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2023grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2023grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2023: grouped mode
internal fun PlayerActivity.showV2023GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023grouped
    FeaturePrefsStore.batch2021.v2023grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2023: guaranteed mode
internal fun PlayerActivity.showV2023GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guaranteed
    FeaturePrefsStore.batch2021.v2023guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2023: guarded mode
internal fun PlayerActivity.showV2023GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guarded
    FeaturePrefsStore.batch2021.v2023guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2023: guided mode
internal fun PlayerActivity.showV2023GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2023guided
    FeaturePrefsStore.batch2021.v2023guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2023: handled mode
internal fun PlayerActivity.showV2023HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2023handled
    FeaturePrefsStore.batch2021.v2023handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2024: fulfilled mode
internal fun PlayerActivity.showV2024FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2024fulfilled
    FeaturePrefsStore.batch2021.v2024fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2024: functioned mode
internal fun PlayerActivity.showV2024FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024functioned
    FeaturePrefsStore.batch2021.v2024functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2024: funded mode
internal fun PlayerActivity.showV2024FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024funded
    FeaturePrefsStore.batch2021.v2024funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2024: gathered mode
internal fun PlayerActivity.showV2024GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2024gathered
    FeaturePrefsStore.batch2021.v2024gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2024: generated mode
internal fun PlayerActivity.showV2024GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024generated
    FeaturePrefsStore.batch2021.v2024generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2024: governed level
internal fun PlayerActivity.showV2024GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2024: graduated level
internal fun PlayerActivity.showV2024GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2024: granted level
internal fun PlayerActivity.showV2024GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2024: greeted level
internal fun PlayerActivity.showV2024GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2024: grounded level
internal fun PlayerActivity.showV2024GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2024grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2024grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2024: grouped mode
internal fun PlayerActivity.showV2024GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024grouped
    FeaturePrefsStore.batch2021.v2024grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2024: guaranteed mode
internal fun PlayerActivity.showV2024GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guaranteed
    FeaturePrefsStore.batch2021.v2024guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2024: guarded mode
internal fun PlayerActivity.showV2024GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guarded
    FeaturePrefsStore.batch2021.v2024guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2024: guided mode
internal fun PlayerActivity.showV2024GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2024guided
    FeaturePrefsStore.batch2021.v2024guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2024: handled mode
internal fun PlayerActivity.showV2024HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2024handled
    FeaturePrefsStore.batch2021.v2024handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2025: fulfilled mode
internal fun PlayerActivity.showV2025FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2025fulfilled
    FeaturePrefsStore.batch2021.v2025fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2025: functioned mode
internal fun PlayerActivity.showV2025FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025functioned
    FeaturePrefsStore.batch2021.v2025functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2025: funded mode
internal fun PlayerActivity.showV2025FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025funded
    FeaturePrefsStore.batch2021.v2025funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2025: gathered mode
internal fun PlayerActivity.showV2025GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2025gathered
    FeaturePrefsStore.batch2021.v2025gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2025: generated mode
internal fun PlayerActivity.showV2025GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025generated
    FeaturePrefsStore.batch2021.v2025generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2025: governed level
internal fun PlayerActivity.showV2025GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2025: graduated level
internal fun PlayerActivity.showV2025GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2025: granted level
internal fun PlayerActivity.showV2025GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2025: greeted level
internal fun PlayerActivity.showV2025GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2025: grounded level
internal fun PlayerActivity.showV2025GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2025grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2025grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2025: grouped mode
internal fun PlayerActivity.showV2025GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025grouped
    FeaturePrefsStore.batch2021.v2025grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2025: guaranteed mode
internal fun PlayerActivity.showV2025GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guaranteed
    FeaturePrefsStore.batch2021.v2025guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2025: guarded mode
internal fun PlayerActivity.showV2025GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guarded
    FeaturePrefsStore.batch2021.v2025guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2025: guided mode
internal fun PlayerActivity.showV2025GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2025guided
    FeaturePrefsStore.batch2021.v2025guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2025: handled mode
internal fun PlayerActivity.showV2025HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2025handled
    FeaturePrefsStore.batch2021.v2025handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2026: fulfilled mode
internal fun PlayerActivity.showV2026FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2026fulfilled
    FeaturePrefsStore.batch2021.v2026fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2026: functioned mode
internal fun PlayerActivity.showV2026FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026functioned
    FeaturePrefsStore.batch2021.v2026functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2026: funded mode
internal fun PlayerActivity.showV2026FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026funded
    FeaturePrefsStore.batch2021.v2026funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2026: gathered mode
internal fun PlayerActivity.showV2026GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2026gathered
    FeaturePrefsStore.batch2021.v2026gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2026: generated mode
internal fun PlayerActivity.showV2026GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026generated
    FeaturePrefsStore.batch2021.v2026generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2026: governed level
internal fun PlayerActivity.showV2026GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2026: graduated level
internal fun PlayerActivity.showV2026GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2026: granted level
internal fun PlayerActivity.showV2026GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2026: greeted level
internal fun PlayerActivity.showV2026GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2026: grounded level
internal fun PlayerActivity.showV2026GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2026grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2026grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2026: grouped mode
internal fun PlayerActivity.showV2026GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026grouped
    FeaturePrefsStore.batch2021.v2026grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2026: guaranteed mode
internal fun PlayerActivity.showV2026GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guaranteed
    FeaturePrefsStore.batch2021.v2026guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2026: guarded mode
internal fun PlayerActivity.showV2026GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guarded
    FeaturePrefsStore.batch2021.v2026guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2026: guided mode
internal fun PlayerActivity.showV2026GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2026guided
    FeaturePrefsStore.batch2021.v2026guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2026: handled mode
internal fun PlayerActivity.showV2026HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2026handled
    FeaturePrefsStore.batch2021.v2026handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2027: fulfilled mode
internal fun PlayerActivity.showV2027FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2027fulfilled
    FeaturePrefsStore.batch2021.v2027fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2027: functioned mode
internal fun PlayerActivity.showV2027FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027functioned
    FeaturePrefsStore.batch2021.v2027functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2027: funded mode
internal fun PlayerActivity.showV2027FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027funded
    FeaturePrefsStore.batch2021.v2027funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2027: gathered mode
internal fun PlayerActivity.showV2027GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2027gathered
    FeaturePrefsStore.batch2021.v2027gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2027: generated mode
internal fun PlayerActivity.showV2027GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027generated
    FeaturePrefsStore.batch2021.v2027generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2027: governed level
internal fun PlayerActivity.showV2027GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2027: graduated level
internal fun PlayerActivity.showV2027GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2027: granted level
internal fun PlayerActivity.showV2027GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2027: greeted level
internal fun PlayerActivity.showV2027GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2027: grounded level
internal fun PlayerActivity.showV2027GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2027grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2027grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2027: grouped mode
internal fun PlayerActivity.showV2027GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027grouped
    FeaturePrefsStore.batch2021.v2027grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2027: guaranteed mode
internal fun PlayerActivity.showV2027GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guaranteed
    FeaturePrefsStore.batch2021.v2027guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2027: guarded mode
internal fun PlayerActivity.showV2027GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guarded
    FeaturePrefsStore.batch2021.v2027guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2027: guided mode
internal fun PlayerActivity.showV2027GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2027guided
    FeaturePrefsStore.batch2021.v2027guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2027: handled mode
internal fun PlayerActivity.showV2027HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2027handled
    FeaturePrefsStore.batch2021.v2027handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2028: fulfilled mode
internal fun PlayerActivity.showV2028FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2028fulfilled
    FeaturePrefsStore.batch2021.v2028fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2028: functioned mode
internal fun PlayerActivity.showV2028FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028functioned
    FeaturePrefsStore.batch2021.v2028functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2028: funded mode
internal fun PlayerActivity.showV2028FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028funded
    FeaturePrefsStore.batch2021.v2028funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2028: gathered mode
internal fun PlayerActivity.showV2028GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2028gathered
    FeaturePrefsStore.batch2021.v2028gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2028: generated mode
internal fun PlayerActivity.showV2028GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028generated
    FeaturePrefsStore.batch2021.v2028generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2028: governed level
internal fun PlayerActivity.showV2028GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2028: graduated level
internal fun PlayerActivity.showV2028GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2028: granted level
internal fun PlayerActivity.showV2028GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2028: greeted level
internal fun PlayerActivity.showV2028GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2028: grounded level
internal fun PlayerActivity.showV2028GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2028grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2028grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2028: grouped mode
internal fun PlayerActivity.showV2028GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028grouped
    FeaturePrefsStore.batch2021.v2028grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2028: guaranteed mode
internal fun PlayerActivity.showV2028GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guaranteed
    FeaturePrefsStore.batch2021.v2028guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2028: guarded mode
internal fun PlayerActivity.showV2028GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guarded
    FeaturePrefsStore.batch2021.v2028guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2028: guided mode
internal fun PlayerActivity.showV2028GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2028guided
    FeaturePrefsStore.batch2021.v2028guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2028: handled mode
internal fun PlayerActivity.showV2028HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2028handled
    FeaturePrefsStore.batch2021.v2028handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2029: fulfilled mode
internal fun PlayerActivity.showV2029FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2029fulfilled
    FeaturePrefsStore.batch2021.v2029fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2029: functioned mode
internal fun PlayerActivity.showV2029FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029functioned
    FeaturePrefsStore.batch2021.v2029functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2029: funded mode
internal fun PlayerActivity.showV2029FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029funded
    FeaturePrefsStore.batch2021.v2029funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2029: gathered mode
internal fun PlayerActivity.showV2029GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2029gathered
    FeaturePrefsStore.batch2021.v2029gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2029: generated mode
internal fun PlayerActivity.showV2029GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029generated
    FeaturePrefsStore.batch2021.v2029generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2029: governed level
internal fun PlayerActivity.showV2029GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2029: graduated level
internal fun PlayerActivity.showV2029GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2029: granted level
internal fun PlayerActivity.showV2029GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2029: greeted level
internal fun PlayerActivity.showV2029GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2029: grounded level
internal fun PlayerActivity.showV2029GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2029grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2029grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2029: grouped mode
internal fun PlayerActivity.showV2029GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029grouped
    FeaturePrefsStore.batch2021.v2029grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2029: guaranteed mode
internal fun PlayerActivity.showV2029GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guaranteed
    FeaturePrefsStore.batch2021.v2029guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2029: guarded mode
internal fun PlayerActivity.showV2029GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guarded
    FeaturePrefsStore.batch2021.v2029guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2029: guided mode
internal fun PlayerActivity.showV2029GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2029guided
    FeaturePrefsStore.batch2021.v2029guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2029: handled mode
internal fun PlayerActivity.showV2029HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2029handled
    FeaturePrefsStore.batch2021.v2029handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2030: fulfilled mode
internal fun PlayerActivity.showV2030FulfilledToggle() {
    val current = FeaturePrefsStore.batch2021.v2030fulfilled
    FeaturePrefsStore.batch2021.v2030fulfilled = !current
    AppToast.show(this, "fulfilled: ${if (!current) "ON" else "OFF"}")
}

// v2030: functioned mode
internal fun PlayerActivity.showV2030FunctionedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030functioned
    FeaturePrefsStore.batch2021.v2030functioned = !current
    AppToast.show(this, "functioned: ${if (!current) "ON" else "OFF"}")
}

// v2030: funded mode
internal fun PlayerActivity.showV2030FundedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030funded
    FeaturePrefsStore.batch2021.v2030funded = !current
    AppToast.show(this, "funded: ${if (!current) "ON" else "OFF"}")
}

// v2030: gathered mode
internal fun PlayerActivity.showV2030GatheredToggle() {
    val current = FeaturePrefsStore.batch2021.v2030gathered
    FeaturePrefsStore.batch2021.v2030gathered = !current
    AppToast.show(this, "gathered: ${if (!current) "ON" else "OFF"}")
}

// v2030: generated mode
internal fun PlayerActivity.showV2030GeneratedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030generated
    FeaturePrefsStore.batch2021.v2030generated = !current
    AppToast.show(this, "generated: ${if (!current) "ON" else "OFF"}")
}

// v2030: governed level
internal fun PlayerActivity.showV2030GovernedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030governed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "governed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030governed = value
        AppToast.show(this, "governed: $value")
    }
}

// v2030: graduated level
internal fun PlayerActivity.showV2030GraduatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030graduated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "graduated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030graduated = value
        AppToast.show(this, "graduated: $value")
    }
}

// v2030: granted level
internal fun PlayerActivity.showV2030GrantedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030granted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "granted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030granted = value
        AppToast.show(this, "granted: $value")
    }
}

// v2030: greeted level
internal fun PlayerActivity.showV2030GreetedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030greeted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "greeted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030greeted = value
        AppToast.show(this, "greeted: $value")
    }
}

// v2030: grounded level
internal fun PlayerActivity.showV2030GroundedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2021.v2030grounded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "grounded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2021.v2030grounded = value
        AppToast.show(this, "grounded: $value")
    }
}

// v2030: grouped mode
internal fun PlayerActivity.showV2030GroupedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030grouped
    FeaturePrefsStore.batch2021.v2030grouped = !current
    AppToast.show(this, "grouped: ${if (!current) "ON" else "OFF"}")
}

// v2030: guaranteed mode
internal fun PlayerActivity.showV2030GuaranteedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guaranteed
    FeaturePrefsStore.batch2021.v2030guaranteed = !current
    AppToast.show(this, "guaranteed: ${if (!current) "ON" else "OFF"}")
}

// v2030: guarded mode
internal fun PlayerActivity.showV2030GuardedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guarded
    FeaturePrefsStore.batch2021.v2030guarded = !current
    AppToast.show(this, "guarded: ${if (!current) "ON" else "OFF"}")
}

// v2030: guided mode
internal fun PlayerActivity.showV2030GuidedToggle() {
    val current = FeaturePrefsStore.batch2021.v2030guided
    FeaturePrefsStore.batch2021.v2030guided = !current
    AppToast.show(this, "guided: ${if (!current) "ON" else "OFF"}")
}

// v2030: handled mode
internal fun PlayerActivity.showV2030HandledToggle() {
    val current = FeaturePrefsStore.batch2021.v2030handled
    FeaturePrefsStore.batch2021.v2030handled = !current
    AppToast.show(this, "handled: ${if (!current) "ON" else "OFF"}")
}

// v2031: hardened mode
internal fun PlayerActivity.showV2031HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hardened
    FeaturePrefsStore.batch2031.v2031hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2031: harmed mode
internal fun PlayerActivity.showV2031HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031harmed
    FeaturePrefsStore.batch2031.v2031harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2031: harvested mode
internal fun PlayerActivity.showV2031HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031harvested
    FeaturePrefsStore.batch2031.v2031harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2031: healed mode
internal fun PlayerActivity.showV2031HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031healed
    FeaturePrefsStore.batch2031.v2031healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2031: heated mode
internal fun PlayerActivity.showV2031HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031heated
    FeaturePrefsStore.batch2031.v2031heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2031: heightened level
internal fun PlayerActivity.showV2031HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2031: helped level
internal fun PlayerActivity.showV2031HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2031: highlighted level
internal fun PlayerActivity.showV2031HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2031: hired level
internal fun PlayerActivity.showV2031HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2031: honored level
internal fun PlayerActivity.showV2031HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2031honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2031honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2031: hosted mode
internal fun PlayerActivity.showV2031HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hosted
    FeaturePrefsStore.batch2031.v2031hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2031: hunted mode
internal fun PlayerActivity.showV2031HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hunted
    FeaturePrefsStore.batch2031.v2031hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2031: hypothesized mode
internal fun PlayerActivity.showV2031HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031hypothesized
    FeaturePrefsStore.batch2031.v2031hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2031: identified mode
internal fun PlayerActivity.showV2031IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2031identified
    FeaturePrefsStore.batch2031.v2031identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2031: ignored mode
internal fun PlayerActivity.showV2031IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2031ignored
    FeaturePrefsStore.batch2031.v2031ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2032: hardened mode
internal fun PlayerActivity.showV2032HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hardened
    FeaturePrefsStore.batch2031.v2032hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2032: harmed mode
internal fun PlayerActivity.showV2032HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032harmed
    FeaturePrefsStore.batch2031.v2032harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2032: harvested mode
internal fun PlayerActivity.showV2032HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032harvested
    FeaturePrefsStore.batch2031.v2032harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2032: healed mode
internal fun PlayerActivity.showV2032HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032healed
    FeaturePrefsStore.batch2031.v2032healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2032: heated mode
internal fun PlayerActivity.showV2032HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032heated
    FeaturePrefsStore.batch2031.v2032heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2032: heightened level
internal fun PlayerActivity.showV2032HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2032: helped level
internal fun PlayerActivity.showV2032HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2032: highlighted level
internal fun PlayerActivity.showV2032HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2032: hired level
internal fun PlayerActivity.showV2032HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2032: honored level
internal fun PlayerActivity.showV2032HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2032honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2032honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2032: hosted mode
internal fun PlayerActivity.showV2032HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hosted
    FeaturePrefsStore.batch2031.v2032hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2032: hunted mode
internal fun PlayerActivity.showV2032HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hunted
    FeaturePrefsStore.batch2031.v2032hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2032: hypothesized mode
internal fun PlayerActivity.showV2032HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032hypothesized
    FeaturePrefsStore.batch2031.v2032hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2032: identified mode
internal fun PlayerActivity.showV2032IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2032identified
    FeaturePrefsStore.batch2031.v2032identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2032: ignored mode
internal fun PlayerActivity.showV2032IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2032ignored
    FeaturePrefsStore.batch2031.v2032ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2033: hardened mode
internal fun PlayerActivity.showV2033HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hardened
    FeaturePrefsStore.batch2031.v2033hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2033: harmed mode
internal fun PlayerActivity.showV2033HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033harmed
    FeaturePrefsStore.batch2031.v2033harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2033: harvested mode
internal fun PlayerActivity.showV2033HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033harvested
    FeaturePrefsStore.batch2031.v2033harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2033: healed mode
internal fun PlayerActivity.showV2033HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033healed
    FeaturePrefsStore.batch2031.v2033healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2033: heated mode
internal fun PlayerActivity.showV2033HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033heated
    FeaturePrefsStore.batch2031.v2033heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2033: heightened level
internal fun PlayerActivity.showV2033HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2033: helped level
internal fun PlayerActivity.showV2033HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2033: highlighted level
internal fun PlayerActivity.showV2033HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2033: hired level
internal fun PlayerActivity.showV2033HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2033: honored level
internal fun PlayerActivity.showV2033HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2033honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2033honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2033: hosted mode
internal fun PlayerActivity.showV2033HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hosted
    FeaturePrefsStore.batch2031.v2033hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2033: hunted mode
internal fun PlayerActivity.showV2033HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hunted
    FeaturePrefsStore.batch2031.v2033hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2033: hypothesized mode
internal fun PlayerActivity.showV2033HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033hypothesized
    FeaturePrefsStore.batch2031.v2033hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2033: identified mode
internal fun PlayerActivity.showV2033IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2033identified
    FeaturePrefsStore.batch2031.v2033identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2033: ignored mode
internal fun PlayerActivity.showV2033IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2033ignored
    FeaturePrefsStore.batch2031.v2033ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2034: hardened mode
internal fun PlayerActivity.showV2034HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hardened
    FeaturePrefsStore.batch2031.v2034hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2034: harmed mode
internal fun PlayerActivity.showV2034HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034harmed
    FeaturePrefsStore.batch2031.v2034harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2034: harvested mode
internal fun PlayerActivity.showV2034HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034harvested
    FeaturePrefsStore.batch2031.v2034harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2034: healed mode
internal fun PlayerActivity.showV2034HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034healed
    FeaturePrefsStore.batch2031.v2034healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2034: heated mode
internal fun PlayerActivity.showV2034HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034heated
    FeaturePrefsStore.batch2031.v2034heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2034: heightened level
internal fun PlayerActivity.showV2034HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2034: helped level
internal fun PlayerActivity.showV2034HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2034: highlighted level
internal fun PlayerActivity.showV2034HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2034: hired level
internal fun PlayerActivity.showV2034HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2034: honored level
internal fun PlayerActivity.showV2034HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2034honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2034honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2034: hosted mode
internal fun PlayerActivity.showV2034HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hosted
    FeaturePrefsStore.batch2031.v2034hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2034: hunted mode
internal fun PlayerActivity.showV2034HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hunted
    FeaturePrefsStore.batch2031.v2034hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2034: hypothesized mode
internal fun PlayerActivity.showV2034HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034hypothesized
    FeaturePrefsStore.batch2031.v2034hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2034: identified mode
internal fun PlayerActivity.showV2034IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2034identified
    FeaturePrefsStore.batch2031.v2034identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2034: ignored mode
internal fun PlayerActivity.showV2034IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2034ignored
    FeaturePrefsStore.batch2031.v2034ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2035: hardened mode
internal fun PlayerActivity.showV2035HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hardened
    FeaturePrefsStore.batch2031.v2035hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2035: harmed mode
internal fun PlayerActivity.showV2035HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035harmed
    FeaturePrefsStore.batch2031.v2035harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2035: harvested mode
internal fun PlayerActivity.showV2035HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035harvested
    FeaturePrefsStore.batch2031.v2035harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2035: healed mode
internal fun PlayerActivity.showV2035HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035healed
    FeaturePrefsStore.batch2031.v2035healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2035: heated mode
internal fun PlayerActivity.showV2035HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035heated
    FeaturePrefsStore.batch2031.v2035heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2035: heightened level
internal fun PlayerActivity.showV2035HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2035: helped level
internal fun PlayerActivity.showV2035HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2035: highlighted level
internal fun PlayerActivity.showV2035HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2035: hired level
internal fun PlayerActivity.showV2035HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2035: honored level
internal fun PlayerActivity.showV2035HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2035honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2035honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2035: hosted mode
internal fun PlayerActivity.showV2035HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hosted
    FeaturePrefsStore.batch2031.v2035hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2035: hunted mode
internal fun PlayerActivity.showV2035HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hunted
    FeaturePrefsStore.batch2031.v2035hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2035: hypothesized mode
internal fun PlayerActivity.showV2035HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035hypothesized
    FeaturePrefsStore.batch2031.v2035hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2035: identified mode
internal fun PlayerActivity.showV2035IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2035identified
    FeaturePrefsStore.batch2031.v2035identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2035: ignored mode
internal fun PlayerActivity.showV2035IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2035ignored
    FeaturePrefsStore.batch2031.v2035ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2036: hardened mode
internal fun PlayerActivity.showV2036HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hardened
    FeaturePrefsStore.batch2031.v2036hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2036: harmed mode
internal fun PlayerActivity.showV2036HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036harmed
    FeaturePrefsStore.batch2031.v2036harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2036: harvested mode
internal fun PlayerActivity.showV2036HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036harvested
    FeaturePrefsStore.batch2031.v2036harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2036: healed mode
internal fun PlayerActivity.showV2036HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036healed
    FeaturePrefsStore.batch2031.v2036healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2036: heated mode
internal fun PlayerActivity.showV2036HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036heated
    FeaturePrefsStore.batch2031.v2036heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2036: heightened level
internal fun PlayerActivity.showV2036HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2036: helped level
internal fun PlayerActivity.showV2036HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2036: highlighted level
internal fun PlayerActivity.showV2036HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2036: hired level
internal fun PlayerActivity.showV2036HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2036: honored level
internal fun PlayerActivity.showV2036HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2036honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2036honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2036: hosted mode
internal fun PlayerActivity.showV2036HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hosted
    FeaturePrefsStore.batch2031.v2036hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2036: hunted mode
internal fun PlayerActivity.showV2036HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hunted
    FeaturePrefsStore.batch2031.v2036hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2036: hypothesized mode
internal fun PlayerActivity.showV2036HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036hypothesized
    FeaturePrefsStore.batch2031.v2036hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2036: identified mode
internal fun PlayerActivity.showV2036IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2036identified
    FeaturePrefsStore.batch2031.v2036identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2036: ignored mode
internal fun PlayerActivity.showV2036IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2036ignored
    FeaturePrefsStore.batch2031.v2036ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2037: hardened mode
internal fun PlayerActivity.showV2037HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hardened
    FeaturePrefsStore.batch2031.v2037hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2037: harmed mode
internal fun PlayerActivity.showV2037HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037harmed
    FeaturePrefsStore.batch2031.v2037harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2037: harvested mode
internal fun PlayerActivity.showV2037HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037harvested
    FeaturePrefsStore.batch2031.v2037harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2037: healed mode
internal fun PlayerActivity.showV2037HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037healed
    FeaturePrefsStore.batch2031.v2037healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2037: heated mode
internal fun PlayerActivity.showV2037HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037heated
    FeaturePrefsStore.batch2031.v2037heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2037: heightened level
internal fun PlayerActivity.showV2037HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2037: helped level
internal fun PlayerActivity.showV2037HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2037: highlighted level
internal fun PlayerActivity.showV2037HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2037: hired level
internal fun PlayerActivity.showV2037HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2037: honored level
internal fun PlayerActivity.showV2037HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2037honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2037honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2037: hosted mode
internal fun PlayerActivity.showV2037HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hosted
    FeaturePrefsStore.batch2031.v2037hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2037: hunted mode
internal fun PlayerActivity.showV2037HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hunted
    FeaturePrefsStore.batch2031.v2037hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2037: hypothesized mode
internal fun PlayerActivity.showV2037HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037hypothesized
    FeaturePrefsStore.batch2031.v2037hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2037: identified mode
internal fun PlayerActivity.showV2037IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2037identified
    FeaturePrefsStore.batch2031.v2037identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2037: ignored mode
internal fun PlayerActivity.showV2037IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2037ignored
    FeaturePrefsStore.batch2031.v2037ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2038: hardened mode
internal fun PlayerActivity.showV2038HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hardened
    FeaturePrefsStore.batch2031.v2038hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2038: harmed mode
internal fun PlayerActivity.showV2038HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038harmed
    FeaturePrefsStore.batch2031.v2038harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2038: harvested mode
internal fun PlayerActivity.showV2038HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038harvested
    FeaturePrefsStore.batch2031.v2038harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2038: healed mode
internal fun PlayerActivity.showV2038HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038healed
    FeaturePrefsStore.batch2031.v2038healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2038: heated mode
internal fun PlayerActivity.showV2038HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038heated
    FeaturePrefsStore.batch2031.v2038heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2038: heightened level
internal fun PlayerActivity.showV2038HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2038: helped level
internal fun PlayerActivity.showV2038HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2038: highlighted level
internal fun PlayerActivity.showV2038HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2038: hired level
internal fun PlayerActivity.showV2038HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2038: honored level
internal fun PlayerActivity.showV2038HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2038honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2038honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2038: hosted mode
internal fun PlayerActivity.showV2038HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hosted
    FeaturePrefsStore.batch2031.v2038hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2038: hunted mode
internal fun PlayerActivity.showV2038HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hunted
    FeaturePrefsStore.batch2031.v2038hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2038: hypothesized mode
internal fun PlayerActivity.showV2038HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038hypothesized
    FeaturePrefsStore.batch2031.v2038hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2038: identified mode
internal fun PlayerActivity.showV2038IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2038identified
    FeaturePrefsStore.batch2031.v2038identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2038: ignored mode
internal fun PlayerActivity.showV2038IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2038ignored
    FeaturePrefsStore.batch2031.v2038ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2039: hardened mode
internal fun PlayerActivity.showV2039HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hardened
    FeaturePrefsStore.batch2031.v2039hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2039: harmed mode
internal fun PlayerActivity.showV2039HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039harmed
    FeaturePrefsStore.batch2031.v2039harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2039: harvested mode
internal fun PlayerActivity.showV2039HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039harvested
    FeaturePrefsStore.batch2031.v2039harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2039: healed mode
internal fun PlayerActivity.showV2039HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039healed
    FeaturePrefsStore.batch2031.v2039healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2039: heated mode
internal fun PlayerActivity.showV2039HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039heated
    FeaturePrefsStore.batch2031.v2039heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2039: heightened level
internal fun PlayerActivity.showV2039HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2039: helped level
internal fun PlayerActivity.showV2039HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2039: highlighted level
internal fun PlayerActivity.showV2039HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2039: hired level
internal fun PlayerActivity.showV2039HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2039: honored level
internal fun PlayerActivity.showV2039HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2039honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2039honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2039: hosted mode
internal fun PlayerActivity.showV2039HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hosted
    FeaturePrefsStore.batch2031.v2039hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2039: hunted mode
internal fun PlayerActivity.showV2039HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hunted
    FeaturePrefsStore.batch2031.v2039hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2039: hypothesized mode
internal fun PlayerActivity.showV2039HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039hypothesized
    FeaturePrefsStore.batch2031.v2039hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2039: identified mode
internal fun PlayerActivity.showV2039IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2039identified
    FeaturePrefsStore.batch2031.v2039identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2039: ignored mode
internal fun PlayerActivity.showV2039IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2039ignored
    FeaturePrefsStore.batch2031.v2039ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}

// v2040: hardened mode
internal fun PlayerActivity.showV2040HardenedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hardened
    FeaturePrefsStore.batch2031.v2040hardened = !current
    AppToast.show(this, "hardened: ${if (!current) "ON" else "OFF"}")
}

// v2040: harmed mode
internal fun PlayerActivity.showV2040HarmedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040harmed
    FeaturePrefsStore.batch2031.v2040harmed = !current
    AppToast.show(this, "harmed: ${if (!current) "ON" else "OFF"}")
}

// v2040: harvested mode
internal fun PlayerActivity.showV2040HarvestedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040harvested
    FeaturePrefsStore.batch2031.v2040harvested = !current
    AppToast.show(this, "harvested: ${if (!current) "ON" else "OFF"}")
}

// v2040: healed mode
internal fun PlayerActivity.showV2040HealedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040healed
    FeaturePrefsStore.batch2031.v2040healed = !current
    AppToast.show(this, "healed: ${if (!current) "ON" else "OFF"}")
}

// v2040: heated mode
internal fun PlayerActivity.showV2040HeatedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040heated
    FeaturePrefsStore.batch2031.v2040heated = !current
    AppToast.show(this, "heated: ${if (!current) "ON" else "OFF"}")
}

// v2040: heightened level
internal fun PlayerActivity.showV2040HeightenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040heightened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "heightened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040heightened = value
        AppToast.show(this, "heightened: $value")
    }
}

// v2040: helped level
internal fun PlayerActivity.showV2040HelpedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040helped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "helped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040helped = value
        AppToast.show(this, "helped: $value")
    }
}

// v2040: highlighted level
internal fun PlayerActivity.showV2040HighlightedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040highlighted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "highlighted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040highlighted = value
        AppToast.show(this, "highlighted: $value")
    }
}

// v2040: hired level
internal fun PlayerActivity.showV2040HiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040hired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040hired = value
        AppToast.show(this, "hired: $value")
    }
}

// v2040: honored level
internal fun PlayerActivity.showV2040HonoredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2031.v2040honored).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "honored level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2031.v2040honored = value
        AppToast.show(this, "honored: $value")
    }
}

// v2040: hosted mode
internal fun PlayerActivity.showV2040HostedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hosted
    FeaturePrefsStore.batch2031.v2040hosted = !current
    AppToast.show(this, "hosted: ${if (!current) "ON" else "OFF"}")
}

// v2040: hunted mode
internal fun PlayerActivity.showV2040HuntedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hunted
    FeaturePrefsStore.batch2031.v2040hunted = !current
    AppToast.show(this, "hunted: ${if (!current) "ON" else "OFF"}")
}

// v2040: hypothesized mode
internal fun PlayerActivity.showV2040HypothesizedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040hypothesized
    FeaturePrefsStore.batch2031.v2040hypothesized = !current
    AppToast.show(this, "hypothesized: ${if (!current) "ON" else "OFF"}")
}

// v2040: identified mode
internal fun PlayerActivity.showV2040IdentifiedToggle() {
    val current = FeaturePrefsStore.batch2031.v2040identified
    FeaturePrefsStore.batch2031.v2040identified = !current
    AppToast.show(this, "identified: ${if (!current) "ON" else "OFF"}")
}

// v2040: ignored mode
internal fun PlayerActivity.showV2040IgnoredToggle() {
    val current = FeaturePrefsStore.batch2031.v2040ignored
    FeaturePrefsStore.batch2031.v2040ignored = !current
    AppToast.show(this, "ignored: ${if (!current) "ON" else "OFF"}")
}
