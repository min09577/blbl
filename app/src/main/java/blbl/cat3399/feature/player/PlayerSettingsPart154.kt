package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1721: rapid mode
internal fun PlayerActivity.showV1721RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rapid
    FeaturePrefsStore.batch1721.v1721rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1721: rare mode
internal fun PlayerActivity.showV1721RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rare
    FeaturePrefsStore.batch1721.v1721rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1721: rather mode
internal fun PlayerActivity.showV1721RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rather
    FeaturePrefsStore.batch1721.v1721rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1721: raven mode
internal fun PlayerActivity.showV1721RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1721raven
    FeaturePrefsStore.batch1721.v1721raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1721: razor mode
internal fun PlayerActivity.showV1721RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1721razor
    FeaturePrefsStore.batch1721.v1721razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1721: reason level
internal fun PlayerActivity.showV1721ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1721: rebel level
internal fun PlayerActivity.showV1721RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1721: recall level
internal fun PlayerActivity.showV1721RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1721: receive level
internal fun PlayerActivity.showV1721ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1721: recipe level
internal fun PlayerActivity.showV1721RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1721: reform mode
internal fun PlayerActivity.showV1721ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1721reform
    FeaturePrefsStore.batch1721.v1721reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1721: region mode
internal fun PlayerActivity.showV1721RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1721region
    FeaturePrefsStore.batch1721.v1721region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1721: regret mode
internal fun PlayerActivity.showV1721RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1721regret
    FeaturePrefsStore.batch1721.v1721regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1721: relax mode
internal fun PlayerActivity.showV1721RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1721relax
    FeaturePrefsStore.batch1721.v1721relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1721: relief mode
internal fun PlayerActivity.showV1721ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1721relief
    FeaturePrefsStore.batch1721.v1721relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1722: rapid mode
internal fun PlayerActivity.showV1722RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rapid
    FeaturePrefsStore.batch1721.v1722rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1722: rare mode
internal fun PlayerActivity.showV1722RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rare
    FeaturePrefsStore.batch1721.v1722rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1722: rather mode
internal fun PlayerActivity.showV1722RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rather
    FeaturePrefsStore.batch1721.v1722rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1722: raven mode
internal fun PlayerActivity.showV1722RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1722raven
    FeaturePrefsStore.batch1721.v1722raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1722: razor mode
internal fun PlayerActivity.showV1722RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1722razor
    FeaturePrefsStore.batch1721.v1722razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1722: reason level
internal fun PlayerActivity.showV1722ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1722: rebel level
internal fun PlayerActivity.showV1722RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1722: recall level
internal fun PlayerActivity.showV1722RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1722: receive level
internal fun PlayerActivity.showV1722ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1722: recipe level
internal fun PlayerActivity.showV1722RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1722: reform mode
internal fun PlayerActivity.showV1722ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1722reform
    FeaturePrefsStore.batch1721.v1722reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1722: region mode
internal fun PlayerActivity.showV1722RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1722region
    FeaturePrefsStore.batch1721.v1722region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1722: regret mode
internal fun PlayerActivity.showV1722RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1722regret
    FeaturePrefsStore.batch1721.v1722regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1722: relax mode
internal fun PlayerActivity.showV1722RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1722relax
    FeaturePrefsStore.batch1721.v1722relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1722: relief mode
internal fun PlayerActivity.showV1722ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1722relief
    FeaturePrefsStore.batch1721.v1722relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1723: rapid mode
internal fun PlayerActivity.showV1723RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rapid
    FeaturePrefsStore.batch1721.v1723rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1723: rare mode
internal fun PlayerActivity.showV1723RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rare
    FeaturePrefsStore.batch1721.v1723rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1723: rather mode
internal fun PlayerActivity.showV1723RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rather
    FeaturePrefsStore.batch1721.v1723rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1723: raven mode
internal fun PlayerActivity.showV1723RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1723raven
    FeaturePrefsStore.batch1721.v1723raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1723: razor mode
internal fun PlayerActivity.showV1723RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1723razor
    FeaturePrefsStore.batch1721.v1723razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1723: reason level
internal fun PlayerActivity.showV1723ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1723: rebel level
internal fun PlayerActivity.showV1723RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1723: recall level
internal fun PlayerActivity.showV1723RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1723: receive level
internal fun PlayerActivity.showV1723ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1723: recipe level
internal fun PlayerActivity.showV1723RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1723: reform mode
internal fun PlayerActivity.showV1723ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1723reform
    FeaturePrefsStore.batch1721.v1723reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1723: region mode
internal fun PlayerActivity.showV1723RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1723region
    FeaturePrefsStore.batch1721.v1723region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1723: regret mode
internal fun PlayerActivity.showV1723RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1723regret
    FeaturePrefsStore.batch1721.v1723regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1723: relax mode
internal fun PlayerActivity.showV1723RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1723relax
    FeaturePrefsStore.batch1721.v1723relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1723: relief mode
internal fun PlayerActivity.showV1723ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1723relief
    FeaturePrefsStore.batch1721.v1723relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1724: rapid mode
internal fun PlayerActivity.showV1724RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rapid
    FeaturePrefsStore.batch1721.v1724rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1724: rare mode
internal fun PlayerActivity.showV1724RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rare
    FeaturePrefsStore.batch1721.v1724rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1724: rather mode
internal fun PlayerActivity.showV1724RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rather
    FeaturePrefsStore.batch1721.v1724rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1724: raven mode
internal fun PlayerActivity.showV1724RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1724raven
    FeaturePrefsStore.batch1721.v1724raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1724: razor mode
internal fun PlayerActivity.showV1724RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1724razor
    FeaturePrefsStore.batch1721.v1724razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1724: reason level
internal fun PlayerActivity.showV1724ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1724: rebel level
internal fun PlayerActivity.showV1724RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1724: recall level
internal fun PlayerActivity.showV1724RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1724: receive level
internal fun PlayerActivity.showV1724ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1724: recipe level
internal fun PlayerActivity.showV1724RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1724: reform mode
internal fun PlayerActivity.showV1724ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1724reform
    FeaturePrefsStore.batch1721.v1724reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1724: region mode
internal fun PlayerActivity.showV1724RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1724region
    FeaturePrefsStore.batch1721.v1724region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1724: regret mode
internal fun PlayerActivity.showV1724RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1724regret
    FeaturePrefsStore.batch1721.v1724regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1724: relax mode
internal fun PlayerActivity.showV1724RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1724relax
    FeaturePrefsStore.batch1721.v1724relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1724: relief mode
internal fun PlayerActivity.showV1724ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1724relief
    FeaturePrefsStore.batch1721.v1724relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1725: rapid mode
internal fun PlayerActivity.showV1725RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rapid
    FeaturePrefsStore.batch1721.v1725rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1725: rare mode
internal fun PlayerActivity.showV1725RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rare
    FeaturePrefsStore.batch1721.v1725rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1725: rather mode
internal fun PlayerActivity.showV1725RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rather
    FeaturePrefsStore.batch1721.v1725rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1725: raven mode
internal fun PlayerActivity.showV1725RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1725raven
    FeaturePrefsStore.batch1721.v1725raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1725: razor mode
internal fun PlayerActivity.showV1725RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1725razor
    FeaturePrefsStore.batch1721.v1725razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1725: reason level
internal fun PlayerActivity.showV1725ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1725: rebel level
internal fun PlayerActivity.showV1725RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1725: recall level
internal fun PlayerActivity.showV1725RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1725: receive level
internal fun PlayerActivity.showV1725ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1725: recipe level
internal fun PlayerActivity.showV1725RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1725: reform mode
internal fun PlayerActivity.showV1725ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1725reform
    FeaturePrefsStore.batch1721.v1725reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1725: region mode
internal fun PlayerActivity.showV1725RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1725region
    FeaturePrefsStore.batch1721.v1725region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1725: regret mode
internal fun PlayerActivity.showV1725RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1725regret
    FeaturePrefsStore.batch1721.v1725regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1725: relax mode
internal fun PlayerActivity.showV1725RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1725relax
    FeaturePrefsStore.batch1721.v1725relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1725: relief mode
internal fun PlayerActivity.showV1725ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1725relief
    FeaturePrefsStore.batch1721.v1725relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1726: rapid mode
internal fun PlayerActivity.showV1726RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rapid
    FeaturePrefsStore.batch1721.v1726rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1726: rare mode
internal fun PlayerActivity.showV1726RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rare
    FeaturePrefsStore.batch1721.v1726rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1726: rather mode
internal fun PlayerActivity.showV1726RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rather
    FeaturePrefsStore.batch1721.v1726rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1726: raven mode
internal fun PlayerActivity.showV1726RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1726raven
    FeaturePrefsStore.batch1721.v1726raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1726: razor mode
internal fun PlayerActivity.showV1726RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1726razor
    FeaturePrefsStore.batch1721.v1726razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1726: reason level
internal fun PlayerActivity.showV1726ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1726: rebel level
internal fun PlayerActivity.showV1726RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1726: recall level
internal fun PlayerActivity.showV1726RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1726: receive level
internal fun PlayerActivity.showV1726ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1726: recipe level
internal fun PlayerActivity.showV1726RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1726: reform mode
internal fun PlayerActivity.showV1726ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1726reform
    FeaturePrefsStore.batch1721.v1726reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1726: region mode
internal fun PlayerActivity.showV1726RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1726region
    FeaturePrefsStore.batch1721.v1726region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1726: regret mode
internal fun PlayerActivity.showV1726RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1726regret
    FeaturePrefsStore.batch1721.v1726regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1726: relax mode
internal fun PlayerActivity.showV1726RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1726relax
    FeaturePrefsStore.batch1721.v1726relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1726: relief mode
internal fun PlayerActivity.showV1726ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1726relief
    FeaturePrefsStore.batch1721.v1726relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1727: rapid mode
internal fun PlayerActivity.showV1727RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rapid
    FeaturePrefsStore.batch1721.v1727rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1727: rare mode
internal fun PlayerActivity.showV1727RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rare
    FeaturePrefsStore.batch1721.v1727rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1727: rather mode
internal fun PlayerActivity.showV1727RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rather
    FeaturePrefsStore.batch1721.v1727rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1727: raven mode
internal fun PlayerActivity.showV1727RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1727raven
    FeaturePrefsStore.batch1721.v1727raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1727: razor mode
internal fun PlayerActivity.showV1727RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1727razor
    FeaturePrefsStore.batch1721.v1727razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1727: reason level
internal fun PlayerActivity.showV1727ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1727: rebel level
internal fun PlayerActivity.showV1727RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1727: recall level
internal fun PlayerActivity.showV1727RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1727: receive level
internal fun PlayerActivity.showV1727ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1727: recipe level
internal fun PlayerActivity.showV1727RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1727: reform mode
internal fun PlayerActivity.showV1727ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1727reform
    FeaturePrefsStore.batch1721.v1727reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1727: region mode
internal fun PlayerActivity.showV1727RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1727region
    FeaturePrefsStore.batch1721.v1727region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1727: regret mode
internal fun PlayerActivity.showV1727RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1727regret
    FeaturePrefsStore.batch1721.v1727regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1727: relax mode
internal fun PlayerActivity.showV1727RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1727relax
    FeaturePrefsStore.batch1721.v1727relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1727: relief mode
internal fun PlayerActivity.showV1727ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1727relief
    FeaturePrefsStore.batch1721.v1727relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1728: rapid mode
internal fun PlayerActivity.showV1728RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rapid
    FeaturePrefsStore.batch1721.v1728rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1728: rare mode
internal fun PlayerActivity.showV1728RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rare
    FeaturePrefsStore.batch1721.v1728rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1728: rather mode
internal fun PlayerActivity.showV1728RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rather
    FeaturePrefsStore.batch1721.v1728rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1728: raven mode
internal fun PlayerActivity.showV1728RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1728raven
    FeaturePrefsStore.batch1721.v1728raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1728: razor mode
internal fun PlayerActivity.showV1728RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1728razor
    FeaturePrefsStore.batch1721.v1728razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1728: reason level
internal fun PlayerActivity.showV1728ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1728: rebel level
internal fun PlayerActivity.showV1728RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1728: recall level
internal fun PlayerActivity.showV1728RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1728: receive level
internal fun PlayerActivity.showV1728ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1728: recipe level
internal fun PlayerActivity.showV1728RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1728: reform mode
internal fun PlayerActivity.showV1728ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1728reform
    FeaturePrefsStore.batch1721.v1728reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1728: region mode
internal fun PlayerActivity.showV1728RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1728region
    FeaturePrefsStore.batch1721.v1728region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1728: regret mode
internal fun PlayerActivity.showV1728RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1728regret
    FeaturePrefsStore.batch1721.v1728regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1728: relax mode
internal fun PlayerActivity.showV1728RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1728relax
    FeaturePrefsStore.batch1721.v1728relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1728: relief mode
internal fun PlayerActivity.showV1728ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1728relief
    FeaturePrefsStore.batch1721.v1728relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1729: rapid mode
internal fun PlayerActivity.showV1729RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rapid
    FeaturePrefsStore.batch1721.v1729rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1729: rare mode
internal fun PlayerActivity.showV1729RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rare
    FeaturePrefsStore.batch1721.v1729rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1729: rather mode
internal fun PlayerActivity.showV1729RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rather
    FeaturePrefsStore.batch1721.v1729rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1729: raven mode
internal fun PlayerActivity.showV1729RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1729raven
    FeaturePrefsStore.batch1721.v1729raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1729: razor mode
internal fun PlayerActivity.showV1729RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1729razor
    FeaturePrefsStore.batch1721.v1729razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1729: reason level
internal fun PlayerActivity.showV1729ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1729: rebel level
internal fun PlayerActivity.showV1729RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1729: recall level
internal fun PlayerActivity.showV1729RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1729: receive level
internal fun PlayerActivity.showV1729ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1729: recipe level
internal fun PlayerActivity.showV1729RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1729: reform mode
internal fun PlayerActivity.showV1729ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1729reform
    FeaturePrefsStore.batch1721.v1729reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1729: region mode
internal fun PlayerActivity.showV1729RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1729region
    FeaturePrefsStore.batch1721.v1729region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1729: regret mode
internal fun PlayerActivity.showV1729RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1729regret
    FeaturePrefsStore.batch1721.v1729regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1729: relax mode
internal fun PlayerActivity.showV1729RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1729relax
    FeaturePrefsStore.batch1721.v1729relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1729: relief mode
internal fun PlayerActivity.showV1729ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1729relief
    FeaturePrefsStore.batch1721.v1729relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1730: rapid mode
internal fun PlayerActivity.showV1730RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rapid
    FeaturePrefsStore.batch1721.v1730rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1730: rare mode
internal fun PlayerActivity.showV1730RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rare
    FeaturePrefsStore.batch1721.v1730rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1730: rather mode
internal fun PlayerActivity.showV1730RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rather
    FeaturePrefsStore.batch1721.v1730rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1730: raven mode
internal fun PlayerActivity.showV1730RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1730raven
    FeaturePrefsStore.batch1721.v1730raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1730: razor mode
internal fun PlayerActivity.showV1730RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1730razor
    FeaturePrefsStore.batch1721.v1730razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1730: reason level
internal fun PlayerActivity.showV1730ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1730: rebel level
internal fun PlayerActivity.showV1730RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1730: recall level
internal fun PlayerActivity.showV1730RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1730: receive level
internal fun PlayerActivity.showV1730ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1730: recipe level
internal fun PlayerActivity.showV1730RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1730: reform mode
internal fun PlayerActivity.showV1730ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1730reform
    FeaturePrefsStore.batch1721.v1730reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1730: region mode
internal fun PlayerActivity.showV1730RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1730region
    FeaturePrefsStore.batch1721.v1730region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1730: regret mode
internal fun PlayerActivity.showV1730RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1730regret
    FeaturePrefsStore.batch1721.v1730regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1730: relax mode
internal fun PlayerActivity.showV1730RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1730relax
    FeaturePrefsStore.batch1721.v1730relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1730: relief mode
internal fun PlayerActivity.showV1730ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1730relief
    FeaturePrefsStore.batch1721.v1730relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

