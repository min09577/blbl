package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1441: fair mode
internal fun PlayerActivity.showV1441FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1441fair
    FeaturePrefsStore.batch1441.v1441fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1441: faith mode
internal fun PlayerActivity.showV1441FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1441faith
    FeaturePrefsStore.batch1441.v1441faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1441: false mode
internal fun PlayerActivity.showV1441FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1441false
    FeaturePrefsStore.batch1441.v1441false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1441: fame mode
internal fun PlayerActivity.showV1441FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1441fame
    FeaturePrefsStore.batch1441.v1441fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1441: fancy mode
internal fun PlayerActivity.showV1441FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1441fancy
    FeaturePrefsStore.batch1441.v1441fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1441: farm level
internal fun PlayerActivity.showV1441FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1441farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1441farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1441: fast level
internal fun PlayerActivity.showV1441FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1441fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1441fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1441: fatal level
internal fun PlayerActivity.showV1441FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1441fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1441fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1441: father level
internal fun PlayerActivity.showV1441FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1441father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1441father = value
        AppToast.show(this, "father: $value")
    }
}

// v1441: fault level
internal fun PlayerActivity.showV1441FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1441fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1441fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1441: feast mode
internal fun PlayerActivity.showV1441FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1441feast
    FeaturePrefsStore.batch1441.v1441feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1441: feed mode
internal fun PlayerActivity.showV1441FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1441feed
    FeaturePrefsStore.batch1441.v1441feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1441: feel mode
internal fun PlayerActivity.showV1441FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1441feel
    FeaturePrefsStore.batch1441.v1441feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1441: fence mode
internal fun PlayerActivity.showV1441FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1441fence
    FeaturePrefsStore.batch1441.v1441fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1441: ferry mode
internal fun PlayerActivity.showV1441FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1441ferry
    FeaturePrefsStore.batch1441.v1441ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1442: fair mode
internal fun PlayerActivity.showV1442FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1442fair
    FeaturePrefsStore.batch1441.v1442fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1442: faith mode
internal fun PlayerActivity.showV1442FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1442faith
    FeaturePrefsStore.batch1441.v1442faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1442: false mode
internal fun PlayerActivity.showV1442FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1442false
    FeaturePrefsStore.batch1441.v1442false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1442: fame mode
internal fun PlayerActivity.showV1442FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1442fame
    FeaturePrefsStore.batch1441.v1442fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1442: fancy mode
internal fun PlayerActivity.showV1442FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1442fancy
    FeaturePrefsStore.batch1441.v1442fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1442: farm level
internal fun PlayerActivity.showV1442FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1442farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1442farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1442: fast level
internal fun PlayerActivity.showV1442FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1442fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1442fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1442: fatal level
internal fun PlayerActivity.showV1442FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1442fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1442fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1442: father level
internal fun PlayerActivity.showV1442FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1442father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1442father = value
        AppToast.show(this, "father: $value")
    }
}

// v1442: fault level
internal fun PlayerActivity.showV1442FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1442fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1442fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1442: feast mode
internal fun PlayerActivity.showV1442FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1442feast
    FeaturePrefsStore.batch1441.v1442feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1442: feed mode
internal fun PlayerActivity.showV1442FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1442feed
    FeaturePrefsStore.batch1441.v1442feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1442: feel mode
internal fun PlayerActivity.showV1442FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1442feel
    FeaturePrefsStore.batch1441.v1442feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1442: fence mode
internal fun PlayerActivity.showV1442FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1442fence
    FeaturePrefsStore.batch1441.v1442fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1442: ferry mode
internal fun PlayerActivity.showV1442FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1442ferry
    FeaturePrefsStore.batch1441.v1442ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1443: fair mode
internal fun PlayerActivity.showV1443FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1443fair
    FeaturePrefsStore.batch1441.v1443fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1443: faith mode
internal fun PlayerActivity.showV1443FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1443faith
    FeaturePrefsStore.batch1441.v1443faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1443: false mode
internal fun PlayerActivity.showV1443FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1443false
    FeaturePrefsStore.batch1441.v1443false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1443: fame mode
internal fun PlayerActivity.showV1443FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1443fame
    FeaturePrefsStore.batch1441.v1443fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1443: fancy mode
internal fun PlayerActivity.showV1443FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1443fancy
    FeaturePrefsStore.batch1441.v1443fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1443: farm level
internal fun PlayerActivity.showV1443FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1443farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1443farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1443: fast level
internal fun PlayerActivity.showV1443FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1443fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1443fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1443: fatal level
internal fun PlayerActivity.showV1443FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1443fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1443fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1443: father level
internal fun PlayerActivity.showV1443FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1443father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1443father = value
        AppToast.show(this, "father: $value")
    }
}

// v1443: fault level
internal fun PlayerActivity.showV1443FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1443fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1443fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1443: feast mode
internal fun PlayerActivity.showV1443FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1443feast
    FeaturePrefsStore.batch1441.v1443feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1443: feed mode
internal fun PlayerActivity.showV1443FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1443feed
    FeaturePrefsStore.batch1441.v1443feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1443: feel mode
internal fun PlayerActivity.showV1443FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1443feel
    FeaturePrefsStore.batch1441.v1443feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1443: fence mode
internal fun PlayerActivity.showV1443FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1443fence
    FeaturePrefsStore.batch1441.v1443fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1443: ferry mode
internal fun PlayerActivity.showV1443FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1443ferry
    FeaturePrefsStore.batch1441.v1443ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1444: fair mode
internal fun PlayerActivity.showV1444FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1444fair
    FeaturePrefsStore.batch1441.v1444fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1444: faith mode
internal fun PlayerActivity.showV1444FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1444faith
    FeaturePrefsStore.batch1441.v1444faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1444: false mode
internal fun PlayerActivity.showV1444FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1444false
    FeaturePrefsStore.batch1441.v1444false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1444: fame mode
internal fun PlayerActivity.showV1444FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1444fame
    FeaturePrefsStore.batch1441.v1444fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1444: fancy mode
internal fun PlayerActivity.showV1444FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1444fancy
    FeaturePrefsStore.batch1441.v1444fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1444: farm level
internal fun PlayerActivity.showV1444FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1444farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1444farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1444: fast level
internal fun PlayerActivity.showV1444FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1444fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1444fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1444: fatal level
internal fun PlayerActivity.showV1444FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1444fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1444fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1444: father level
internal fun PlayerActivity.showV1444FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1444father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1444father = value
        AppToast.show(this, "father: $value")
    }
}

// v1444: fault level
internal fun PlayerActivity.showV1444FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1444fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1444fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1444: feast mode
internal fun PlayerActivity.showV1444FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1444feast
    FeaturePrefsStore.batch1441.v1444feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1444: feed mode
internal fun PlayerActivity.showV1444FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1444feed
    FeaturePrefsStore.batch1441.v1444feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1444: feel mode
internal fun PlayerActivity.showV1444FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1444feel
    FeaturePrefsStore.batch1441.v1444feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1444: fence mode
internal fun PlayerActivity.showV1444FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1444fence
    FeaturePrefsStore.batch1441.v1444fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1444: ferry mode
internal fun PlayerActivity.showV1444FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1444ferry
    FeaturePrefsStore.batch1441.v1444ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1445: fair mode
internal fun PlayerActivity.showV1445FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1445fair
    FeaturePrefsStore.batch1441.v1445fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1445: faith mode
internal fun PlayerActivity.showV1445FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1445faith
    FeaturePrefsStore.batch1441.v1445faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1445: false mode
internal fun PlayerActivity.showV1445FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1445false
    FeaturePrefsStore.batch1441.v1445false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1445: fame mode
internal fun PlayerActivity.showV1445FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1445fame
    FeaturePrefsStore.batch1441.v1445fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1445: fancy mode
internal fun PlayerActivity.showV1445FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1445fancy
    FeaturePrefsStore.batch1441.v1445fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1445: farm level
internal fun PlayerActivity.showV1445FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1445farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1445farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1445: fast level
internal fun PlayerActivity.showV1445FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1445fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1445fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1445: fatal level
internal fun PlayerActivity.showV1445FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1445fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1445fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1445: father level
internal fun PlayerActivity.showV1445FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1445father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1445father = value
        AppToast.show(this, "father: $value")
    }
}

// v1445: fault level
internal fun PlayerActivity.showV1445FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1445fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1445fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1445: feast mode
internal fun PlayerActivity.showV1445FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1445feast
    FeaturePrefsStore.batch1441.v1445feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1445: feed mode
internal fun PlayerActivity.showV1445FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1445feed
    FeaturePrefsStore.batch1441.v1445feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1445: feel mode
internal fun PlayerActivity.showV1445FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1445feel
    FeaturePrefsStore.batch1441.v1445feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1445: fence mode
internal fun PlayerActivity.showV1445FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1445fence
    FeaturePrefsStore.batch1441.v1445fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1445: ferry mode
internal fun PlayerActivity.showV1445FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1445ferry
    FeaturePrefsStore.batch1441.v1445ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1446: fair mode
internal fun PlayerActivity.showV1446FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1446fair
    FeaturePrefsStore.batch1441.v1446fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1446: faith mode
internal fun PlayerActivity.showV1446FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1446faith
    FeaturePrefsStore.batch1441.v1446faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1446: false mode
internal fun PlayerActivity.showV1446FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1446false
    FeaturePrefsStore.batch1441.v1446false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1446: fame mode
internal fun PlayerActivity.showV1446FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1446fame
    FeaturePrefsStore.batch1441.v1446fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1446: fancy mode
internal fun PlayerActivity.showV1446FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1446fancy
    FeaturePrefsStore.batch1441.v1446fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1446: farm level
internal fun PlayerActivity.showV1446FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1446farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1446farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1446: fast level
internal fun PlayerActivity.showV1446FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1446fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1446fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1446: fatal level
internal fun PlayerActivity.showV1446FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1446fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1446fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1446: father level
internal fun PlayerActivity.showV1446FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1446father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1446father = value
        AppToast.show(this, "father: $value")
    }
}

// v1446: fault level
internal fun PlayerActivity.showV1446FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1446fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1446fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1446: feast mode
internal fun PlayerActivity.showV1446FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1446feast
    FeaturePrefsStore.batch1441.v1446feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1446: feed mode
internal fun PlayerActivity.showV1446FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1446feed
    FeaturePrefsStore.batch1441.v1446feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1446: feel mode
internal fun PlayerActivity.showV1446FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1446feel
    FeaturePrefsStore.batch1441.v1446feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1446: fence mode
internal fun PlayerActivity.showV1446FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1446fence
    FeaturePrefsStore.batch1441.v1446fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1446: ferry mode
internal fun PlayerActivity.showV1446FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1446ferry
    FeaturePrefsStore.batch1441.v1446ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1447: fair mode
internal fun PlayerActivity.showV1447FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1447fair
    FeaturePrefsStore.batch1441.v1447fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1447: faith mode
internal fun PlayerActivity.showV1447FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1447faith
    FeaturePrefsStore.batch1441.v1447faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1447: false mode
internal fun PlayerActivity.showV1447FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1447false
    FeaturePrefsStore.batch1441.v1447false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1447: fame mode
internal fun PlayerActivity.showV1447FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1447fame
    FeaturePrefsStore.batch1441.v1447fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1447: fancy mode
internal fun PlayerActivity.showV1447FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1447fancy
    FeaturePrefsStore.batch1441.v1447fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1447: farm level
internal fun PlayerActivity.showV1447FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1447farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1447farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1447: fast level
internal fun PlayerActivity.showV1447FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1447fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1447fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1447: fatal level
internal fun PlayerActivity.showV1447FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1447fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1447fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1447: father level
internal fun PlayerActivity.showV1447FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1447father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1447father = value
        AppToast.show(this, "father: $value")
    }
}

// v1447: fault level
internal fun PlayerActivity.showV1447FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1447fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1447fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1447: feast mode
internal fun PlayerActivity.showV1447FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1447feast
    FeaturePrefsStore.batch1441.v1447feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1447: feed mode
internal fun PlayerActivity.showV1447FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1447feed
    FeaturePrefsStore.batch1441.v1447feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1447: feel mode
internal fun PlayerActivity.showV1447FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1447feel
    FeaturePrefsStore.batch1441.v1447feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1447: fence mode
internal fun PlayerActivity.showV1447FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1447fence
    FeaturePrefsStore.batch1441.v1447fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1447: ferry mode
internal fun PlayerActivity.showV1447FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1447ferry
    FeaturePrefsStore.batch1441.v1447ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1448: fair mode
internal fun PlayerActivity.showV1448FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1448fair
    FeaturePrefsStore.batch1441.v1448fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1448: faith mode
internal fun PlayerActivity.showV1448FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1448faith
    FeaturePrefsStore.batch1441.v1448faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1448: false mode
internal fun PlayerActivity.showV1448FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1448false
    FeaturePrefsStore.batch1441.v1448false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1448: fame mode
internal fun PlayerActivity.showV1448FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1448fame
    FeaturePrefsStore.batch1441.v1448fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1448: fancy mode
internal fun PlayerActivity.showV1448FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1448fancy
    FeaturePrefsStore.batch1441.v1448fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1448: farm level
internal fun PlayerActivity.showV1448FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1448farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1448farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1448: fast level
internal fun PlayerActivity.showV1448FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1448fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1448fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1448: fatal level
internal fun PlayerActivity.showV1448FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1448fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1448fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1448: father level
internal fun PlayerActivity.showV1448FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1448father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1448father = value
        AppToast.show(this, "father: $value")
    }
}

// v1448: fault level
internal fun PlayerActivity.showV1448FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1448fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1448fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1448: feast mode
internal fun PlayerActivity.showV1448FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1448feast
    FeaturePrefsStore.batch1441.v1448feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1448: feed mode
internal fun PlayerActivity.showV1448FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1448feed
    FeaturePrefsStore.batch1441.v1448feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1448: feel mode
internal fun PlayerActivity.showV1448FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1448feel
    FeaturePrefsStore.batch1441.v1448feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1448: fence mode
internal fun PlayerActivity.showV1448FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1448fence
    FeaturePrefsStore.batch1441.v1448fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1448: ferry mode
internal fun PlayerActivity.showV1448FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1448ferry
    FeaturePrefsStore.batch1441.v1448ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1449: fair mode
internal fun PlayerActivity.showV1449FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1449fair
    FeaturePrefsStore.batch1441.v1449fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1449: faith mode
internal fun PlayerActivity.showV1449FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1449faith
    FeaturePrefsStore.batch1441.v1449faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1449: false mode
internal fun PlayerActivity.showV1449FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1449false
    FeaturePrefsStore.batch1441.v1449false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1449: fame mode
internal fun PlayerActivity.showV1449FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1449fame
    FeaturePrefsStore.batch1441.v1449fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1449: fancy mode
internal fun PlayerActivity.showV1449FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1449fancy
    FeaturePrefsStore.batch1441.v1449fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1449: farm level
internal fun PlayerActivity.showV1449FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1449farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1449farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1449: fast level
internal fun PlayerActivity.showV1449FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1449fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1449fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1449: fatal level
internal fun PlayerActivity.showV1449FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1449fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1449fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1449: father level
internal fun PlayerActivity.showV1449FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1449father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1449father = value
        AppToast.show(this, "father: $value")
    }
}

// v1449: fault level
internal fun PlayerActivity.showV1449FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1449fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1449fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1449: feast mode
internal fun PlayerActivity.showV1449FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1449feast
    FeaturePrefsStore.batch1441.v1449feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1449: feed mode
internal fun PlayerActivity.showV1449FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1449feed
    FeaturePrefsStore.batch1441.v1449feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1449: feel mode
internal fun PlayerActivity.showV1449FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1449feel
    FeaturePrefsStore.batch1441.v1449feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1449: fence mode
internal fun PlayerActivity.showV1449FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1449fence
    FeaturePrefsStore.batch1441.v1449fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1449: ferry mode
internal fun PlayerActivity.showV1449FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1449ferry
    FeaturePrefsStore.batch1441.v1449ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

// v1450: fair mode
internal fun PlayerActivity.showV1450FairToggle() {
    val current = FeaturePrefsStore.batch1441.v1450fair
    FeaturePrefsStore.batch1441.v1450fair = !current
    AppToast.show(this, "fair: ${if (!current) "ON" else "OFF"}")
}

// v1450: faith mode
internal fun PlayerActivity.showV1450FaithToggle() {
    val current = FeaturePrefsStore.batch1441.v1450faith
    FeaturePrefsStore.batch1441.v1450faith = !current
    AppToast.show(this, "faith: ${if (!current) "ON" else "OFF"}")
}

// v1450: false mode
internal fun PlayerActivity.showV1450FalseToggle() {
    val current = FeaturePrefsStore.batch1441.v1450false
    FeaturePrefsStore.batch1441.v1450false = !current
    AppToast.show(this, "false: ${if (!current) "ON" else "OFF"}")
}

// v1450: fame mode
internal fun PlayerActivity.showV1450FameToggle() {
    val current = FeaturePrefsStore.batch1441.v1450fame
    FeaturePrefsStore.batch1441.v1450fame = !current
    AppToast.show(this, "fame: ${if (!current) "ON" else "OFF"}")
}

// v1450: fancy mode
internal fun PlayerActivity.showV1450FancyToggle() {
    val current = FeaturePrefsStore.batch1441.v1450fancy
    FeaturePrefsStore.batch1441.v1450fancy = !current
    AppToast.show(this, "fancy: ${if (!current) "ON" else "OFF"}")
}

// v1450: farm level
internal fun PlayerActivity.showV1450FarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1450farm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "farm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1450farm = value
        AppToast.show(this, "farm: $value")
    }
}

// v1450: fast level
internal fun PlayerActivity.showV1450FastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1450fast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fast level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1450fast = value
        AppToast.show(this, "fast: $value")
    }
}

// v1450: fatal level
internal fun PlayerActivity.showV1450FatalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1450fatal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fatal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1450fatal = value
        AppToast.show(this, "fatal: $value")
    }
}

// v1450: father level
internal fun PlayerActivity.showV1450FatherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1450father).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "father level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1450father = value
        AppToast.show(this, "father: $value")
    }
}

// v1450: fault level
internal fun PlayerActivity.showV1450FaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1441.v1450fault).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fault level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1441.v1450fault = value
        AppToast.show(this, "fault: $value")
    }
}

// v1450: feast mode
internal fun PlayerActivity.showV1450FeastToggle() {
    val current = FeaturePrefsStore.batch1441.v1450feast
    FeaturePrefsStore.batch1441.v1450feast = !current
    AppToast.show(this, "feast: ${if (!current) "ON" else "OFF"}")
}

// v1450: feed mode
internal fun PlayerActivity.showV1450FeedToggle() {
    val current = FeaturePrefsStore.batch1441.v1450feed
    FeaturePrefsStore.batch1441.v1450feed = !current
    AppToast.show(this, "feed: ${if (!current) "ON" else "OFF"}")
}

// v1450: feel mode
internal fun PlayerActivity.showV1450FeelToggle() {
    val current = FeaturePrefsStore.batch1441.v1450feel
    FeaturePrefsStore.batch1441.v1450feel = !current
    AppToast.show(this, "feel: ${if (!current) "ON" else "OFF"}")
}

// v1450: fence mode
internal fun PlayerActivity.showV1450FenceToggle() {
    val current = FeaturePrefsStore.batch1441.v1450fence
    FeaturePrefsStore.batch1441.v1450fence = !current
    AppToast.show(this, "fence: ${if (!current) "ON" else "OFF"}")
}

// v1450: ferry mode
internal fun PlayerActivity.showV1450FerryToggle() {
    val current = FeaturePrefsStore.batch1441.v1450ferry
    FeaturePrefsStore.batch1441.v1450ferry = !current
    AppToast.show(this, "ferry: ${if (!current) "ON" else "OFF"}")
}

