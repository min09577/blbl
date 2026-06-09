package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2311: upgraded mode
internal fun PlayerActivity.showV2311UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311upgraded
    FeaturePrefsStore.batch2311.v2311upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2311: utilized mode
internal fun PlayerActivity.showV2311UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311utilized
    FeaturePrefsStore.batch2311.v2311utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2311: validated mode
internal fun PlayerActivity.showV2311ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311validated
    FeaturePrefsStore.batch2311.v2311validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2311: valued mode
internal fun PlayerActivity.showV2311ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311valued
    FeaturePrefsStore.batch2311.v2311valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2311: varied mode
internal fun PlayerActivity.showV2311VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311varied
    FeaturePrefsStore.batch2311.v2311varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2311: verified level
internal fun PlayerActivity.showV2311VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2311: viewed level
internal fun PlayerActivity.showV2311ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2311: violated level
internal fun PlayerActivity.showV2311ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2311: visited level
internal fun PlayerActivity.showV2311VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2311: visualized level
internal fun PlayerActivity.showV2311VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2311: voiced mode
internal fun PlayerActivity.showV2311VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311voiced
    FeaturePrefsStore.batch2311.v2311voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2311: volunteered mode
internal fun PlayerActivity.showV2311VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2311volunteered
    FeaturePrefsStore.batch2311.v2311volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2311: wandered mode
internal fun PlayerActivity.showV2311WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311wandered
    FeaturePrefsStore.batch2311.v2311wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2311: warmed mode
internal fun PlayerActivity.showV2311WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311warmed
    FeaturePrefsStore.batch2311.v2311warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2311: warned mode
internal fun PlayerActivity.showV2311WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311warned
    FeaturePrefsStore.batch2311.v2311warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2312: upgraded mode
internal fun PlayerActivity.showV2312UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312upgraded
    FeaturePrefsStore.batch2311.v2312upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2312: utilized mode
internal fun PlayerActivity.showV2312UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312utilized
    FeaturePrefsStore.batch2311.v2312utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2312: validated mode
internal fun PlayerActivity.showV2312ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312validated
    FeaturePrefsStore.batch2311.v2312validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2312: valued mode
internal fun PlayerActivity.showV2312ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312valued
    FeaturePrefsStore.batch2311.v2312valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2312: varied mode
internal fun PlayerActivity.showV2312VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312varied
    FeaturePrefsStore.batch2311.v2312varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2312: verified level
internal fun PlayerActivity.showV2312VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2312: viewed level
internal fun PlayerActivity.showV2312ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2312: violated level
internal fun PlayerActivity.showV2312ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2312: visited level
internal fun PlayerActivity.showV2312VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2312: visualized level
internal fun PlayerActivity.showV2312VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2312: voiced mode
internal fun PlayerActivity.showV2312VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312voiced
    FeaturePrefsStore.batch2311.v2312voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2312: volunteered mode
internal fun PlayerActivity.showV2312VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2312volunteered
    FeaturePrefsStore.batch2311.v2312volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2312: wandered mode
internal fun PlayerActivity.showV2312WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312wandered
    FeaturePrefsStore.batch2311.v2312wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2312: warmed mode
internal fun PlayerActivity.showV2312WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312warmed
    FeaturePrefsStore.batch2311.v2312warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2312: warned mode
internal fun PlayerActivity.showV2312WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312warned
    FeaturePrefsStore.batch2311.v2312warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2313: upgraded mode
internal fun PlayerActivity.showV2313UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313upgraded
    FeaturePrefsStore.batch2311.v2313upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2313: utilized mode
internal fun PlayerActivity.showV2313UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313utilized
    FeaturePrefsStore.batch2311.v2313utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2313: validated mode
internal fun PlayerActivity.showV2313ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313validated
    FeaturePrefsStore.batch2311.v2313validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2313: valued mode
internal fun PlayerActivity.showV2313ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313valued
    FeaturePrefsStore.batch2311.v2313valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2313: varied mode
internal fun PlayerActivity.showV2313VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313varied
    FeaturePrefsStore.batch2311.v2313varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2313: verified level
internal fun PlayerActivity.showV2313VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2313: viewed level
internal fun PlayerActivity.showV2313ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2313: violated level
internal fun PlayerActivity.showV2313ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2313: visited level
internal fun PlayerActivity.showV2313VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2313: visualized level
internal fun PlayerActivity.showV2313VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2313: voiced mode
internal fun PlayerActivity.showV2313VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313voiced
    FeaturePrefsStore.batch2311.v2313voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2313: volunteered mode
internal fun PlayerActivity.showV2313VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2313volunteered
    FeaturePrefsStore.batch2311.v2313volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2313: wandered mode
internal fun PlayerActivity.showV2313WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313wandered
    FeaturePrefsStore.batch2311.v2313wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2313: warmed mode
internal fun PlayerActivity.showV2313WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313warmed
    FeaturePrefsStore.batch2311.v2313warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2313: warned mode
internal fun PlayerActivity.showV2313WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313warned
    FeaturePrefsStore.batch2311.v2313warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2314: upgraded mode
internal fun PlayerActivity.showV2314UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314upgraded
    FeaturePrefsStore.batch2311.v2314upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2314: utilized mode
internal fun PlayerActivity.showV2314UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314utilized
    FeaturePrefsStore.batch2311.v2314utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2314: validated mode
internal fun PlayerActivity.showV2314ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314validated
    FeaturePrefsStore.batch2311.v2314validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2314: valued mode
internal fun PlayerActivity.showV2314ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314valued
    FeaturePrefsStore.batch2311.v2314valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2314: varied mode
internal fun PlayerActivity.showV2314VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314varied
    FeaturePrefsStore.batch2311.v2314varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2314: verified level
internal fun PlayerActivity.showV2314VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2314: viewed level
internal fun PlayerActivity.showV2314ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2314: violated level
internal fun PlayerActivity.showV2314ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2314: visited level
internal fun PlayerActivity.showV2314VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2314: visualized level
internal fun PlayerActivity.showV2314VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2314: voiced mode
internal fun PlayerActivity.showV2314VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314voiced
    FeaturePrefsStore.batch2311.v2314voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2314: volunteered mode
internal fun PlayerActivity.showV2314VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2314volunteered
    FeaturePrefsStore.batch2311.v2314volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2314: wandered mode
internal fun PlayerActivity.showV2314WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314wandered
    FeaturePrefsStore.batch2311.v2314wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2314: warmed mode
internal fun PlayerActivity.showV2314WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314warmed
    FeaturePrefsStore.batch2311.v2314warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2314: warned mode
internal fun PlayerActivity.showV2314WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314warned
    FeaturePrefsStore.batch2311.v2314warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2315: upgraded mode
internal fun PlayerActivity.showV2315UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315upgraded
    FeaturePrefsStore.batch2311.v2315upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2315: utilized mode
internal fun PlayerActivity.showV2315UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315utilized
    FeaturePrefsStore.batch2311.v2315utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2315: validated mode
internal fun PlayerActivity.showV2315ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315validated
    FeaturePrefsStore.batch2311.v2315validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2315: valued mode
internal fun PlayerActivity.showV2315ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315valued
    FeaturePrefsStore.batch2311.v2315valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2315: varied mode
internal fun PlayerActivity.showV2315VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315varied
    FeaturePrefsStore.batch2311.v2315varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2315: verified level
internal fun PlayerActivity.showV2315VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2315: viewed level
internal fun PlayerActivity.showV2315ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2315: violated level
internal fun PlayerActivity.showV2315ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2315: visited level
internal fun PlayerActivity.showV2315VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2315: visualized level
internal fun PlayerActivity.showV2315VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2315: voiced mode
internal fun PlayerActivity.showV2315VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315voiced
    FeaturePrefsStore.batch2311.v2315voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2315: volunteered mode
internal fun PlayerActivity.showV2315VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2315volunteered
    FeaturePrefsStore.batch2311.v2315volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2315: wandered mode
internal fun PlayerActivity.showV2315WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315wandered
    FeaturePrefsStore.batch2311.v2315wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2315: warmed mode
internal fun PlayerActivity.showV2315WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315warmed
    FeaturePrefsStore.batch2311.v2315warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2315: warned mode
internal fun PlayerActivity.showV2315WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315warned
    FeaturePrefsStore.batch2311.v2315warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2316: upgraded mode
internal fun PlayerActivity.showV2316UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316upgraded
    FeaturePrefsStore.batch2311.v2316upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2316: utilized mode
internal fun PlayerActivity.showV2316UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316utilized
    FeaturePrefsStore.batch2311.v2316utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2316: validated mode
internal fun PlayerActivity.showV2316ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316validated
    FeaturePrefsStore.batch2311.v2316validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2316: valued mode
internal fun PlayerActivity.showV2316ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316valued
    FeaturePrefsStore.batch2311.v2316valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2316: varied mode
internal fun PlayerActivity.showV2316VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316varied
    FeaturePrefsStore.batch2311.v2316varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2316: verified level
internal fun PlayerActivity.showV2316VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2316: viewed level
internal fun PlayerActivity.showV2316ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2316: violated level
internal fun PlayerActivity.showV2316ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2316: visited level
internal fun PlayerActivity.showV2316VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2316: visualized level
internal fun PlayerActivity.showV2316VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2316: voiced mode
internal fun PlayerActivity.showV2316VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316voiced
    FeaturePrefsStore.batch2311.v2316voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2316: volunteered mode
internal fun PlayerActivity.showV2316VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2316volunteered
    FeaturePrefsStore.batch2311.v2316volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2316: wandered mode
internal fun PlayerActivity.showV2316WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316wandered
    FeaturePrefsStore.batch2311.v2316wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2316: warmed mode
internal fun PlayerActivity.showV2316WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316warmed
    FeaturePrefsStore.batch2311.v2316warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2316: warned mode
internal fun PlayerActivity.showV2316WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316warned
    FeaturePrefsStore.batch2311.v2316warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2317: upgraded mode
internal fun PlayerActivity.showV2317UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317upgraded
    FeaturePrefsStore.batch2311.v2317upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2317: utilized mode
internal fun PlayerActivity.showV2317UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317utilized
    FeaturePrefsStore.batch2311.v2317utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2317: validated mode
internal fun PlayerActivity.showV2317ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317validated
    FeaturePrefsStore.batch2311.v2317validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2317: valued mode
internal fun PlayerActivity.showV2317ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317valued
    FeaturePrefsStore.batch2311.v2317valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2317: varied mode
internal fun PlayerActivity.showV2317VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317varied
    FeaturePrefsStore.batch2311.v2317varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2317: verified level
internal fun PlayerActivity.showV2317VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2317: viewed level
internal fun PlayerActivity.showV2317ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2317: violated level
internal fun PlayerActivity.showV2317ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2317: visited level
internal fun PlayerActivity.showV2317VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2317: visualized level
internal fun PlayerActivity.showV2317VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2317: voiced mode
internal fun PlayerActivity.showV2317VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317voiced
    FeaturePrefsStore.batch2311.v2317voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2317: volunteered mode
internal fun PlayerActivity.showV2317VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2317volunteered
    FeaturePrefsStore.batch2311.v2317volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2317: wandered mode
internal fun PlayerActivity.showV2317WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317wandered
    FeaturePrefsStore.batch2311.v2317wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2317: warmed mode
internal fun PlayerActivity.showV2317WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317warmed
    FeaturePrefsStore.batch2311.v2317warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2317: warned mode
internal fun PlayerActivity.showV2317WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317warned
    FeaturePrefsStore.batch2311.v2317warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2318: upgraded mode
internal fun PlayerActivity.showV2318UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318upgraded
    FeaturePrefsStore.batch2311.v2318upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2318: utilized mode
internal fun PlayerActivity.showV2318UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318utilized
    FeaturePrefsStore.batch2311.v2318utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2318: validated mode
internal fun PlayerActivity.showV2318ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318validated
    FeaturePrefsStore.batch2311.v2318validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2318: valued mode
internal fun PlayerActivity.showV2318ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318valued
    FeaturePrefsStore.batch2311.v2318valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2318: varied mode
internal fun PlayerActivity.showV2318VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318varied
    FeaturePrefsStore.batch2311.v2318varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2318: verified level
internal fun PlayerActivity.showV2318VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2318: viewed level
internal fun PlayerActivity.showV2318ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2318: violated level
internal fun PlayerActivity.showV2318ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2318: visited level
internal fun PlayerActivity.showV2318VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2318: visualized level
internal fun PlayerActivity.showV2318VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2318: voiced mode
internal fun PlayerActivity.showV2318VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318voiced
    FeaturePrefsStore.batch2311.v2318voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2318: volunteered mode
internal fun PlayerActivity.showV2318VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2318volunteered
    FeaturePrefsStore.batch2311.v2318volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2318: wandered mode
internal fun PlayerActivity.showV2318WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318wandered
    FeaturePrefsStore.batch2311.v2318wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2318: warmed mode
internal fun PlayerActivity.showV2318WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318warmed
    FeaturePrefsStore.batch2311.v2318warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2318: warned mode
internal fun PlayerActivity.showV2318WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318warned
    FeaturePrefsStore.batch2311.v2318warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2319: upgraded mode
internal fun PlayerActivity.showV2319UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319upgraded
    FeaturePrefsStore.batch2311.v2319upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2319: utilized mode
internal fun PlayerActivity.showV2319UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319utilized
    FeaturePrefsStore.batch2311.v2319utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2319: validated mode
internal fun PlayerActivity.showV2319ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319validated
    FeaturePrefsStore.batch2311.v2319validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2319: valued mode
internal fun PlayerActivity.showV2319ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319valued
    FeaturePrefsStore.batch2311.v2319valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2319: varied mode
internal fun PlayerActivity.showV2319VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319varied
    FeaturePrefsStore.batch2311.v2319varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2319: verified level
internal fun PlayerActivity.showV2319VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2319: viewed level
internal fun PlayerActivity.showV2319ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2319: violated level
internal fun PlayerActivity.showV2319ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2319: visited level
internal fun PlayerActivity.showV2319VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2319: visualized level
internal fun PlayerActivity.showV2319VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2319: voiced mode
internal fun PlayerActivity.showV2319VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319voiced
    FeaturePrefsStore.batch2311.v2319voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2319: volunteered mode
internal fun PlayerActivity.showV2319VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2319volunteered
    FeaturePrefsStore.batch2311.v2319volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2319: wandered mode
internal fun PlayerActivity.showV2319WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319wandered
    FeaturePrefsStore.batch2311.v2319wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2319: warmed mode
internal fun PlayerActivity.showV2319WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319warmed
    FeaturePrefsStore.batch2311.v2319warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2319: warned mode
internal fun PlayerActivity.showV2319WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319warned
    FeaturePrefsStore.batch2311.v2319warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2320: upgraded mode
internal fun PlayerActivity.showV2320UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320upgraded
    FeaturePrefsStore.batch2311.v2320upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2320: utilized mode
internal fun PlayerActivity.showV2320UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320utilized
    FeaturePrefsStore.batch2311.v2320utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2320: validated mode
internal fun PlayerActivity.showV2320ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320validated
    FeaturePrefsStore.batch2311.v2320validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2320: valued mode
internal fun PlayerActivity.showV2320ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320valued
    FeaturePrefsStore.batch2311.v2320valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2320: varied mode
internal fun PlayerActivity.showV2320VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320varied
    FeaturePrefsStore.batch2311.v2320varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2320: verified level
internal fun PlayerActivity.showV2320VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2320: viewed level
internal fun PlayerActivity.showV2320ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2320: violated level
internal fun PlayerActivity.showV2320ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2320: visited level
internal fun PlayerActivity.showV2320VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2320: visualized level
internal fun PlayerActivity.showV2320VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2320: voiced mode
internal fun PlayerActivity.showV2320VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320voiced
    FeaturePrefsStore.batch2311.v2320voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2320: volunteered mode
internal fun PlayerActivity.showV2320VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2320volunteered
    FeaturePrefsStore.batch2311.v2320volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2320: wandered mode
internal fun PlayerActivity.showV2320WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320wandered
    FeaturePrefsStore.batch2311.v2320wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2320: warmed mode
internal fun PlayerActivity.showV2320WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320warmed
    FeaturePrefsStore.batch2311.v2320warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2320: warned mode
internal fun PlayerActivity.showV2320WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320warned
    FeaturePrefsStore.batch2311.v2320warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

