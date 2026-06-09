package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2181: received mode
internal fun PlayerActivity.showV2181ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181received
    FeaturePrefsStore.batch2181.v2181received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2181: recognized mode
internal fun PlayerActivity.showV2181RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recognized
    FeaturePrefsStore.batch2181.v2181recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2181: recommended mode
internal fun PlayerActivity.showV2181RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recommended
    FeaturePrefsStore.batch2181.v2181recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2181: reconciled mode
internal fun PlayerActivity.showV2181ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reconciled
    FeaturePrefsStore.batch2181.v2181reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2181: recorded mode
internal fun PlayerActivity.showV2181RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recorded
    FeaturePrefsStore.batch2181.v2181recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2181: recovered level
internal fun PlayerActivity.showV2181RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2181: recruited level
internal fun PlayerActivity.showV2181RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2181: recycled level
internal fun PlayerActivity.showV2181RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2181: redirected level
internal fun PlayerActivity.showV2181RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2181: reduced level
internal fun PlayerActivity.showV2181ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2181: referenced mode
internal fun PlayerActivity.showV2181ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181referenced
    FeaturePrefsStore.batch2181.v2181referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2181: reflected mode
internal fun PlayerActivity.showV2181ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reflected
    FeaturePrefsStore.batch2181.v2181reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2181: reformed mode
internal fun PlayerActivity.showV2181ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reformed
    FeaturePrefsStore.batch2181.v2181reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2181: refreshed mode
internal fun PlayerActivity.showV2181RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181refreshed
    FeaturePrefsStore.batch2181.v2181refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2181: refused mode
internal fun PlayerActivity.showV2181RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181refused
    FeaturePrefsStore.batch2181.v2181refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2182: received mode
internal fun PlayerActivity.showV2182ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182received
    FeaturePrefsStore.batch2181.v2182received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2182: recognized mode
internal fun PlayerActivity.showV2182RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recognized
    FeaturePrefsStore.batch2181.v2182recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2182: recommended mode
internal fun PlayerActivity.showV2182RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recommended
    FeaturePrefsStore.batch2181.v2182recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2182: reconciled mode
internal fun PlayerActivity.showV2182ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reconciled
    FeaturePrefsStore.batch2181.v2182reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2182: recorded mode
internal fun PlayerActivity.showV2182RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recorded
    FeaturePrefsStore.batch2181.v2182recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2182: recovered level
internal fun PlayerActivity.showV2182RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2182: recruited level
internal fun PlayerActivity.showV2182RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2182: recycled level
internal fun PlayerActivity.showV2182RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2182: redirected level
internal fun PlayerActivity.showV2182RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2182: reduced level
internal fun PlayerActivity.showV2182ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2182: referenced mode
internal fun PlayerActivity.showV2182ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182referenced
    FeaturePrefsStore.batch2181.v2182referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2182: reflected mode
internal fun PlayerActivity.showV2182ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reflected
    FeaturePrefsStore.batch2181.v2182reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2182: reformed mode
internal fun PlayerActivity.showV2182ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reformed
    FeaturePrefsStore.batch2181.v2182reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2182: refreshed mode
internal fun PlayerActivity.showV2182RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182refreshed
    FeaturePrefsStore.batch2181.v2182refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2182: refused mode
internal fun PlayerActivity.showV2182RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182refused
    FeaturePrefsStore.batch2181.v2182refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2183: received mode
internal fun PlayerActivity.showV2183ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183received
    FeaturePrefsStore.batch2181.v2183received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2183: recognized mode
internal fun PlayerActivity.showV2183RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recognized
    FeaturePrefsStore.batch2181.v2183recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2183: recommended mode
internal fun PlayerActivity.showV2183RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recommended
    FeaturePrefsStore.batch2181.v2183recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2183: reconciled mode
internal fun PlayerActivity.showV2183ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reconciled
    FeaturePrefsStore.batch2181.v2183reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2183: recorded mode
internal fun PlayerActivity.showV2183RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recorded
    FeaturePrefsStore.batch2181.v2183recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2183: recovered level
internal fun PlayerActivity.showV2183RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2183: recruited level
internal fun PlayerActivity.showV2183RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2183: recycled level
internal fun PlayerActivity.showV2183RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2183: redirected level
internal fun PlayerActivity.showV2183RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2183: reduced level
internal fun PlayerActivity.showV2183ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2183: referenced mode
internal fun PlayerActivity.showV2183ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183referenced
    FeaturePrefsStore.batch2181.v2183referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2183: reflected mode
internal fun PlayerActivity.showV2183ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reflected
    FeaturePrefsStore.batch2181.v2183reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2183: reformed mode
internal fun PlayerActivity.showV2183ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reformed
    FeaturePrefsStore.batch2181.v2183reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2183: refreshed mode
internal fun PlayerActivity.showV2183RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183refreshed
    FeaturePrefsStore.batch2181.v2183refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2183: refused mode
internal fun PlayerActivity.showV2183RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183refused
    FeaturePrefsStore.batch2181.v2183refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2184: received mode
internal fun PlayerActivity.showV2184ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184received
    FeaturePrefsStore.batch2181.v2184received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2184: recognized mode
internal fun PlayerActivity.showV2184RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recognized
    FeaturePrefsStore.batch2181.v2184recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2184: recommended mode
internal fun PlayerActivity.showV2184RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recommended
    FeaturePrefsStore.batch2181.v2184recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2184: reconciled mode
internal fun PlayerActivity.showV2184ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reconciled
    FeaturePrefsStore.batch2181.v2184reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2184: recorded mode
internal fun PlayerActivity.showV2184RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recorded
    FeaturePrefsStore.batch2181.v2184recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2184: recovered level
internal fun PlayerActivity.showV2184RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2184: recruited level
internal fun PlayerActivity.showV2184RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2184: recycled level
internal fun PlayerActivity.showV2184RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2184: redirected level
internal fun PlayerActivity.showV2184RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2184: reduced level
internal fun PlayerActivity.showV2184ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2184: referenced mode
internal fun PlayerActivity.showV2184ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184referenced
    FeaturePrefsStore.batch2181.v2184referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2184: reflected mode
internal fun PlayerActivity.showV2184ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reflected
    FeaturePrefsStore.batch2181.v2184reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2184: reformed mode
internal fun PlayerActivity.showV2184ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reformed
    FeaturePrefsStore.batch2181.v2184reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2184: refreshed mode
internal fun PlayerActivity.showV2184RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184refreshed
    FeaturePrefsStore.batch2181.v2184refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2184: refused mode
internal fun PlayerActivity.showV2184RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184refused
    FeaturePrefsStore.batch2181.v2184refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2185: received mode
internal fun PlayerActivity.showV2185ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185received
    FeaturePrefsStore.batch2181.v2185received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2185: recognized mode
internal fun PlayerActivity.showV2185RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recognized
    FeaturePrefsStore.batch2181.v2185recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2185: recommended mode
internal fun PlayerActivity.showV2185RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recommended
    FeaturePrefsStore.batch2181.v2185recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2185: reconciled mode
internal fun PlayerActivity.showV2185ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reconciled
    FeaturePrefsStore.batch2181.v2185reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2185: recorded mode
internal fun PlayerActivity.showV2185RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recorded
    FeaturePrefsStore.batch2181.v2185recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2185: recovered level
internal fun PlayerActivity.showV2185RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2185: recruited level
internal fun PlayerActivity.showV2185RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2185: recycled level
internal fun PlayerActivity.showV2185RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2185: redirected level
internal fun PlayerActivity.showV2185RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2185: reduced level
internal fun PlayerActivity.showV2185ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2185: referenced mode
internal fun PlayerActivity.showV2185ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185referenced
    FeaturePrefsStore.batch2181.v2185referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2185: reflected mode
internal fun PlayerActivity.showV2185ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reflected
    FeaturePrefsStore.batch2181.v2185reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2185: reformed mode
internal fun PlayerActivity.showV2185ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reformed
    FeaturePrefsStore.batch2181.v2185reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2185: refreshed mode
internal fun PlayerActivity.showV2185RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185refreshed
    FeaturePrefsStore.batch2181.v2185refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2185: refused mode
internal fun PlayerActivity.showV2185RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185refused
    FeaturePrefsStore.batch2181.v2185refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2186: received mode
internal fun PlayerActivity.showV2186ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186received
    FeaturePrefsStore.batch2181.v2186received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2186: recognized mode
internal fun PlayerActivity.showV2186RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recognized
    FeaturePrefsStore.batch2181.v2186recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2186: recommended mode
internal fun PlayerActivity.showV2186RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recommended
    FeaturePrefsStore.batch2181.v2186recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2186: reconciled mode
internal fun PlayerActivity.showV2186ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reconciled
    FeaturePrefsStore.batch2181.v2186reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2186: recorded mode
internal fun PlayerActivity.showV2186RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recorded
    FeaturePrefsStore.batch2181.v2186recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2186: recovered level
internal fun PlayerActivity.showV2186RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2186: recruited level
internal fun PlayerActivity.showV2186RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2186: recycled level
internal fun PlayerActivity.showV2186RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2186: redirected level
internal fun PlayerActivity.showV2186RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2186: reduced level
internal fun PlayerActivity.showV2186ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2186: referenced mode
internal fun PlayerActivity.showV2186ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186referenced
    FeaturePrefsStore.batch2181.v2186referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2186: reflected mode
internal fun PlayerActivity.showV2186ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reflected
    FeaturePrefsStore.batch2181.v2186reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2186: reformed mode
internal fun PlayerActivity.showV2186ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reformed
    FeaturePrefsStore.batch2181.v2186reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2186: refreshed mode
internal fun PlayerActivity.showV2186RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186refreshed
    FeaturePrefsStore.batch2181.v2186refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2186: refused mode
internal fun PlayerActivity.showV2186RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186refused
    FeaturePrefsStore.batch2181.v2186refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2187: received mode
internal fun PlayerActivity.showV2187ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187received
    FeaturePrefsStore.batch2181.v2187received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2187: recognized mode
internal fun PlayerActivity.showV2187RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recognized
    FeaturePrefsStore.batch2181.v2187recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2187: recommended mode
internal fun PlayerActivity.showV2187RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recommended
    FeaturePrefsStore.batch2181.v2187recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2187: reconciled mode
internal fun PlayerActivity.showV2187ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reconciled
    FeaturePrefsStore.batch2181.v2187reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2187: recorded mode
internal fun PlayerActivity.showV2187RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recorded
    FeaturePrefsStore.batch2181.v2187recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2187: recovered level
internal fun PlayerActivity.showV2187RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2187: recruited level
internal fun PlayerActivity.showV2187RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2187: recycled level
internal fun PlayerActivity.showV2187RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2187: redirected level
internal fun PlayerActivity.showV2187RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2187: reduced level
internal fun PlayerActivity.showV2187ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2187: referenced mode
internal fun PlayerActivity.showV2187ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187referenced
    FeaturePrefsStore.batch2181.v2187referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2187: reflected mode
internal fun PlayerActivity.showV2187ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reflected
    FeaturePrefsStore.batch2181.v2187reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2187: reformed mode
internal fun PlayerActivity.showV2187ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reformed
    FeaturePrefsStore.batch2181.v2187reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2187: refreshed mode
internal fun PlayerActivity.showV2187RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187refreshed
    FeaturePrefsStore.batch2181.v2187refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2187: refused mode
internal fun PlayerActivity.showV2187RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187refused
    FeaturePrefsStore.batch2181.v2187refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2188: received mode
internal fun PlayerActivity.showV2188ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188received
    FeaturePrefsStore.batch2181.v2188received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2188: recognized mode
internal fun PlayerActivity.showV2188RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recognized
    FeaturePrefsStore.batch2181.v2188recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2188: recommended mode
internal fun PlayerActivity.showV2188RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recommended
    FeaturePrefsStore.batch2181.v2188recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2188: reconciled mode
internal fun PlayerActivity.showV2188ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reconciled
    FeaturePrefsStore.batch2181.v2188reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2188: recorded mode
internal fun PlayerActivity.showV2188RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recorded
    FeaturePrefsStore.batch2181.v2188recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2188: recovered level
internal fun PlayerActivity.showV2188RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2188: recruited level
internal fun PlayerActivity.showV2188RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2188: recycled level
internal fun PlayerActivity.showV2188RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2188: redirected level
internal fun PlayerActivity.showV2188RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2188: reduced level
internal fun PlayerActivity.showV2188ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2188: referenced mode
internal fun PlayerActivity.showV2188ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188referenced
    FeaturePrefsStore.batch2181.v2188referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2188: reflected mode
internal fun PlayerActivity.showV2188ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reflected
    FeaturePrefsStore.batch2181.v2188reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2188: reformed mode
internal fun PlayerActivity.showV2188ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reformed
    FeaturePrefsStore.batch2181.v2188reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2188: refreshed mode
internal fun PlayerActivity.showV2188RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188refreshed
    FeaturePrefsStore.batch2181.v2188refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2188: refused mode
internal fun PlayerActivity.showV2188RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188refused
    FeaturePrefsStore.batch2181.v2188refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2189: received mode
internal fun PlayerActivity.showV2189ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189received
    FeaturePrefsStore.batch2181.v2189received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2189: recognized mode
internal fun PlayerActivity.showV2189RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recognized
    FeaturePrefsStore.batch2181.v2189recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2189: recommended mode
internal fun PlayerActivity.showV2189RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recommended
    FeaturePrefsStore.batch2181.v2189recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2189: reconciled mode
internal fun PlayerActivity.showV2189ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reconciled
    FeaturePrefsStore.batch2181.v2189reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2189: recorded mode
internal fun PlayerActivity.showV2189RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recorded
    FeaturePrefsStore.batch2181.v2189recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2189: recovered level
internal fun PlayerActivity.showV2189RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2189: recruited level
internal fun PlayerActivity.showV2189RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2189: recycled level
internal fun PlayerActivity.showV2189RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2189: redirected level
internal fun PlayerActivity.showV2189RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2189: reduced level
internal fun PlayerActivity.showV2189ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2189: referenced mode
internal fun PlayerActivity.showV2189ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189referenced
    FeaturePrefsStore.batch2181.v2189referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2189: reflected mode
internal fun PlayerActivity.showV2189ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reflected
    FeaturePrefsStore.batch2181.v2189reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2189: reformed mode
internal fun PlayerActivity.showV2189ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reformed
    FeaturePrefsStore.batch2181.v2189reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2189: refreshed mode
internal fun PlayerActivity.showV2189RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189refreshed
    FeaturePrefsStore.batch2181.v2189refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2189: refused mode
internal fun PlayerActivity.showV2189RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189refused
    FeaturePrefsStore.batch2181.v2189refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2190: received mode
internal fun PlayerActivity.showV2190ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190received
    FeaturePrefsStore.batch2181.v2190received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2190: recognized mode
internal fun PlayerActivity.showV2190RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recognized
    FeaturePrefsStore.batch2181.v2190recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2190: recommended mode
internal fun PlayerActivity.showV2190RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recommended
    FeaturePrefsStore.batch2181.v2190recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2190: reconciled mode
internal fun PlayerActivity.showV2190ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reconciled
    FeaturePrefsStore.batch2181.v2190reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2190: recorded mode
internal fun PlayerActivity.showV2190RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recorded
    FeaturePrefsStore.batch2181.v2190recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2190: recovered level
internal fun PlayerActivity.showV2190RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2190: recruited level
internal fun PlayerActivity.showV2190RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2190: recycled level
internal fun PlayerActivity.showV2190RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2190: redirected level
internal fun PlayerActivity.showV2190RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2190: reduced level
internal fun PlayerActivity.showV2190ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2190: referenced mode
internal fun PlayerActivity.showV2190ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190referenced
    FeaturePrefsStore.batch2181.v2190referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2190: reflected mode
internal fun PlayerActivity.showV2190ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reflected
    FeaturePrefsStore.batch2181.v2190reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2190: reformed mode
internal fun PlayerActivity.showV2190ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reformed
    FeaturePrefsStore.batch2181.v2190reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2190: refreshed mode
internal fun PlayerActivity.showV2190RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190refreshed
    FeaturePrefsStore.batch2181.v2190refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2190: refused mode
internal fun PlayerActivity.showV2190RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190refused
    FeaturePrefsStore.batch2181.v2190refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

