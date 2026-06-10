package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1191: agent mode
internal fun PlayerActivity.showV1191AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agent
    FeaturePrefsStore.batch1191.v1191agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1191: agile mode
internal fun PlayerActivity.showV1191AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agile
    FeaturePrefsStore.batch1191.v1191agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1191: aging mode
internal fun PlayerActivity.showV1191AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1191aging
    FeaturePrefsStore.batch1191.v1191aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1191: agree mode
internal fun PlayerActivity.showV1191AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agree
    FeaturePrefsStore.batch1191.v1191agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1191: ahead mode
internal fun PlayerActivity.showV1191AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1191ahead
    FeaturePrefsStore.batch1191.v1191ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1191: aid level
internal fun PlayerActivity.showV1191AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1191: aim level
internal fun PlayerActivity.showV1191AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1191: air level
internal fun PlayerActivity.showV1191AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191air = value
        AppToast.show(this, "air: $value")
    }
}

// v1191: alarm level
internal fun PlayerActivity.showV1191AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1191: album level
internal fun PlayerActivity.showV1191AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191album = value
        AppToast.show(this, "album: $value")
    }
}

// v1191: algae mode
internal fun PlayerActivity.showV1191AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1191algae
    FeaturePrefsStore.batch1191.v1191algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1191: alias mode
internal fun PlayerActivity.showV1191AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alias
    FeaturePrefsStore.batch1191.v1191alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1191: alien mode
internal fun PlayerActivity.showV1191AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alien
    FeaturePrefsStore.batch1191.v1191alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1191: alive mode
internal fun PlayerActivity.showV1191AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alive
    FeaturePrefsStore.batch1191.v1191alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1191: alley mode
internal fun PlayerActivity.showV1191AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alley
    FeaturePrefsStore.batch1191.v1191alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1192: agent mode
internal fun PlayerActivity.showV1192AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agent
    FeaturePrefsStore.batch1191.v1192agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1192: agile mode
internal fun PlayerActivity.showV1192AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agile
    FeaturePrefsStore.batch1191.v1192agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1192: aging mode
internal fun PlayerActivity.showV1192AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1192aging
    FeaturePrefsStore.batch1191.v1192aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1192: agree mode
internal fun PlayerActivity.showV1192AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agree
    FeaturePrefsStore.batch1191.v1192agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1192: ahead mode
internal fun PlayerActivity.showV1192AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1192ahead
    FeaturePrefsStore.batch1191.v1192ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1192: aid level
internal fun PlayerActivity.showV1192AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1192: aim level
internal fun PlayerActivity.showV1192AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1192: air level
internal fun PlayerActivity.showV1192AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192air = value
        AppToast.show(this, "air: $value")
    }
}

// v1192: alarm level
internal fun PlayerActivity.showV1192AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1192: album level
internal fun PlayerActivity.showV1192AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192album = value
        AppToast.show(this, "album: $value")
    }
}

// v1192: algae mode
internal fun PlayerActivity.showV1192AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1192algae
    FeaturePrefsStore.batch1191.v1192algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1192: alias mode
internal fun PlayerActivity.showV1192AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alias
    FeaturePrefsStore.batch1191.v1192alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1192: alien mode
internal fun PlayerActivity.showV1192AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alien
    FeaturePrefsStore.batch1191.v1192alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1192: alive mode
internal fun PlayerActivity.showV1192AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alive
    FeaturePrefsStore.batch1191.v1192alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1192: alley mode
internal fun PlayerActivity.showV1192AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alley
    FeaturePrefsStore.batch1191.v1192alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1193: agent mode
internal fun PlayerActivity.showV1193AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agent
    FeaturePrefsStore.batch1191.v1193agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1193: agile mode
internal fun PlayerActivity.showV1193AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agile
    FeaturePrefsStore.batch1191.v1193agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1193: aging mode
internal fun PlayerActivity.showV1193AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1193aging
    FeaturePrefsStore.batch1191.v1193aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1193: agree mode
internal fun PlayerActivity.showV1193AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agree
    FeaturePrefsStore.batch1191.v1193agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1193: ahead mode
internal fun PlayerActivity.showV1193AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1193ahead
    FeaturePrefsStore.batch1191.v1193ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1193: aid level
internal fun PlayerActivity.showV1193AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1193: aim level
internal fun PlayerActivity.showV1193AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1193: air level
internal fun PlayerActivity.showV1193AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193air = value
        AppToast.show(this, "air: $value")
    }
}

// v1193: alarm level
internal fun PlayerActivity.showV1193AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1193: album level
internal fun PlayerActivity.showV1193AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193album = value
        AppToast.show(this, "album: $value")
    }
}

// v1193: algae mode
internal fun PlayerActivity.showV1193AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1193algae
    FeaturePrefsStore.batch1191.v1193algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1193: alias mode
internal fun PlayerActivity.showV1193AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alias
    FeaturePrefsStore.batch1191.v1193alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1193: alien mode
internal fun PlayerActivity.showV1193AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alien
    FeaturePrefsStore.batch1191.v1193alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1193: alive mode
internal fun PlayerActivity.showV1193AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alive
    FeaturePrefsStore.batch1191.v1193alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1193: alley mode
internal fun PlayerActivity.showV1193AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alley
    FeaturePrefsStore.batch1191.v1193alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1194: agent mode
internal fun PlayerActivity.showV1194AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agent
    FeaturePrefsStore.batch1191.v1194agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1194: agile mode
internal fun PlayerActivity.showV1194AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agile
    FeaturePrefsStore.batch1191.v1194agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1194: aging mode
internal fun PlayerActivity.showV1194AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1194aging
    FeaturePrefsStore.batch1191.v1194aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1194: agree mode
internal fun PlayerActivity.showV1194AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agree
    FeaturePrefsStore.batch1191.v1194agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1194: ahead mode
internal fun PlayerActivity.showV1194AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1194ahead
    FeaturePrefsStore.batch1191.v1194ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1194: aid level
internal fun PlayerActivity.showV1194AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1194: aim level
internal fun PlayerActivity.showV1194AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1194: air level
internal fun PlayerActivity.showV1194AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194air = value
        AppToast.show(this, "air: $value")
    }
}

// v1194: alarm level
internal fun PlayerActivity.showV1194AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1194: album level
internal fun PlayerActivity.showV1194AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194album = value
        AppToast.show(this, "album: $value")
    }
}

// v1194: algae mode
internal fun PlayerActivity.showV1194AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1194algae
    FeaturePrefsStore.batch1191.v1194algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1194: alias mode
internal fun PlayerActivity.showV1194AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alias
    FeaturePrefsStore.batch1191.v1194alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1194: alien mode
internal fun PlayerActivity.showV1194AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alien
    FeaturePrefsStore.batch1191.v1194alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1194: alive mode
internal fun PlayerActivity.showV1194AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alive
    FeaturePrefsStore.batch1191.v1194alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1194: alley mode
internal fun PlayerActivity.showV1194AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alley
    FeaturePrefsStore.batch1191.v1194alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1195: agent mode
internal fun PlayerActivity.showV1195AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agent
    FeaturePrefsStore.batch1191.v1195agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1195: agile mode
internal fun PlayerActivity.showV1195AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agile
    FeaturePrefsStore.batch1191.v1195agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1195: aging mode
internal fun PlayerActivity.showV1195AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1195aging
    FeaturePrefsStore.batch1191.v1195aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1195: agree mode
internal fun PlayerActivity.showV1195AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agree
    FeaturePrefsStore.batch1191.v1195agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1195: ahead mode
internal fun PlayerActivity.showV1195AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1195ahead
    FeaturePrefsStore.batch1191.v1195ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1195: aid level
internal fun PlayerActivity.showV1195AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1195: aim level
internal fun PlayerActivity.showV1195AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1195: air level
internal fun PlayerActivity.showV1195AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195air = value
        AppToast.show(this, "air: $value")
    }
}

// v1195: alarm level
internal fun PlayerActivity.showV1195AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1195: album level
internal fun PlayerActivity.showV1195AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195album = value
        AppToast.show(this, "album: $value")
    }
}

// v1195: algae mode
internal fun PlayerActivity.showV1195AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1195algae
    FeaturePrefsStore.batch1191.v1195algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1195: alias mode
internal fun PlayerActivity.showV1195AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alias
    FeaturePrefsStore.batch1191.v1195alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1195: alien mode
internal fun PlayerActivity.showV1195AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alien
    FeaturePrefsStore.batch1191.v1195alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1195: alive mode
internal fun PlayerActivity.showV1195AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alive
    FeaturePrefsStore.batch1191.v1195alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1195: alley mode
internal fun PlayerActivity.showV1195AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alley
    FeaturePrefsStore.batch1191.v1195alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1196: agent mode
internal fun PlayerActivity.showV1196AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agent
    FeaturePrefsStore.batch1191.v1196agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1196: agile mode
internal fun PlayerActivity.showV1196AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agile
    FeaturePrefsStore.batch1191.v1196agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1196: aging mode
internal fun PlayerActivity.showV1196AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1196aging
    FeaturePrefsStore.batch1191.v1196aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1196: agree mode
internal fun PlayerActivity.showV1196AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agree
    FeaturePrefsStore.batch1191.v1196agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1196: ahead mode
internal fun PlayerActivity.showV1196AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1196ahead
    FeaturePrefsStore.batch1191.v1196ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1196: aid level
internal fun PlayerActivity.showV1196AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1196: aim level
internal fun PlayerActivity.showV1196AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1196: air level
internal fun PlayerActivity.showV1196AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196air = value
        AppToast.show(this, "air: $value")
    }
}

// v1196: alarm level
internal fun PlayerActivity.showV1196AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1196: album level
internal fun PlayerActivity.showV1196AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196album = value
        AppToast.show(this, "album: $value")
    }
}

// v1196: algae mode
internal fun PlayerActivity.showV1196AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1196algae
    FeaturePrefsStore.batch1191.v1196algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1196: alias mode
internal fun PlayerActivity.showV1196AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alias
    FeaturePrefsStore.batch1191.v1196alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1196: alien mode
internal fun PlayerActivity.showV1196AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alien
    FeaturePrefsStore.batch1191.v1196alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1196: alive mode
internal fun PlayerActivity.showV1196AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alive
    FeaturePrefsStore.batch1191.v1196alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1196: alley mode
internal fun PlayerActivity.showV1196AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alley
    FeaturePrefsStore.batch1191.v1196alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1197: agent mode
internal fun PlayerActivity.showV1197AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agent
    FeaturePrefsStore.batch1191.v1197agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1197: agile mode
internal fun PlayerActivity.showV1197AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agile
    FeaturePrefsStore.batch1191.v1197agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1197: aging mode
internal fun PlayerActivity.showV1197AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1197aging
    FeaturePrefsStore.batch1191.v1197aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1197: agree mode
internal fun PlayerActivity.showV1197AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agree
    FeaturePrefsStore.batch1191.v1197agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1197: ahead mode
internal fun PlayerActivity.showV1197AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1197ahead
    FeaturePrefsStore.batch1191.v1197ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1197: aid level
internal fun PlayerActivity.showV1197AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1197: aim level
internal fun PlayerActivity.showV1197AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1197: air level
internal fun PlayerActivity.showV1197AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197air = value
        AppToast.show(this, "air: $value")
    }
}

// v1197: alarm level
internal fun PlayerActivity.showV1197AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1197: album level
internal fun PlayerActivity.showV1197AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197album = value
        AppToast.show(this, "album: $value")
    }
}

// v1197: algae mode
internal fun PlayerActivity.showV1197AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1197algae
    FeaturePrefsStore.batch1191.v1197algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1197: alias mode
internal fun PlayerActivity.showV1197AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alias
    FeaturePrefsStore.batch1191.v1197alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1197: alien mode
internal fun PlayerActivity.showV1197AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alien
    FeaturePrefsStore.batch1191.v1197alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1197: alive mode
internal fun PlayerActivity.showV1197AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alive
    FeaturePrefsStore.batch1191.v1197alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1197: alley mode
internal fun PlayerActivity.showV1197AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alley
    FeaturePrefsStore.batch1191.v1197alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1198: agent mode
internal fun PlayerActivity.showV1198AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agent
    FeaturePrefsStore.batch1191.v1198agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1198: agile mode
internal fun PlayerActivity.showV1198AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agile
    FeaturePrefsStore.batch1191.v1198agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1198: aging mode
internal fun PlayerActivity.showV1198AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1198aging
    FeaturePrefsStore.batch1191.v1198aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1198: agree mode
internal fun PlayerActivity.showV1198AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agree
    FeaturePrefsStore.batch1191.v1198agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1198: ahead mode
internal fun PlayerActivity.showV1198AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1198ahead
    FeaturePrefsStore.batch1191.v1198ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1198: aid level
internal fun PlayerActivity.showV1198AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1198: aim level
internal fun PlayerActivity.showV1198AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1198: air level
internal fun PlayerActivity.showV1198AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198air = value
        AppToast.show(this, "air: $value")
    }
}

// v1198: alarm level
internal fun PlayerActivity.showV1198AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1198: album level
internal fun PlayerActivity.showV1198AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198album = value
        AppToast.show(this, "album: $value")
    }
}

// v1198: algae mode
internal fun PlayerActivity.showV1198AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1198algae
    FeaturePrefsStore.batch1191.v1198algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1198: alias mode
internal fun PlayerActivity.showV1198AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alias
    FeaturePrefsStore.batch1191.v1198alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1198: alien mode
internal fun PlayerActivity.showV1198AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alien
    FeaturePrefsStore.batch1191.v1198alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1198: alive mode
internal fun PlayerActivity.showV1198AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alive
    FeaturePrefsStore.batch1191.v1198alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1198: alley mode
internal fun PlayerActivity.showV1198AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alley
    FeaturePrefsStore.batch1191.v1198alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1199: agent mode
internal fun PlayerActivity.showV1199AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agent
    FeaturePrefsStore.batch1191.v1199agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1199: agile mode
internal fun PlayerActivity.showV1199AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agile
    FeaturePrefsStore.batch1191.v1199agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1199: aging mode
internal fun PlayerActivity.showV1199AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1199aging
    FeaturePrefsStore.batch1191.v1199aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1199: agree mode
internal fun PlayerActivity.showV1199AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agree
    FeaturePrefsStore.batch1191.v1199agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1199: ahead mode
internal fun PlayerActivity.showV1199AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1199ahead
    FeaturePrefsStore.batch1191.v1199ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1199: aid level
internal fun PlayerActivity.showV1199AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1199: aim level
internal fun PlayerActivity.showV1199AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1199: air level
internal fun PlayerActivity.showV1199AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199air = value
        AppToast.show(this, "air: $value")
    }
}

// v1199: alarm level
internal fun PlayerActivity.showV1199AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1199: album level
internal fun PlayerActivity.showV1199AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199album = value
        AppToast.show(this, "album: $value")
    }
}

// v1199: algae mode
internal fun PlayerActivity.showV1199AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1199algae
    FeaturePrefsStore.batch1191.v1199algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1199: alias mode
internal fun PlayerActivity.showV1199AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alias
    FeaturePrefsStore.batch1191.v1199alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1199: alien mode
internal fun PlayerActivity.showV1199AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alien
    FeaturePrefsStore.batch1191.v1199alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1199: alive mode
internal fun PlayerActivity.showV1199AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alive
    FeaturePrefsStore.batch1191.v1199alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1199: alley mode
internal fun PlayerActivity.showV1199AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alley
    FeaturePrefsStore.batch1191.v1199alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1200: agent mode
internal fun PlayerActivity.showV1200AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agent
    FeaturePrefsStore.batch1191.v1200agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1200: agile mode
internal fun PlayerActivity.showV1200AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agile
    FeaturePrefsStore.batch1191.v1200agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1200: aging mode
internal fun PlayerActivity.showV1200AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1200aging
    FeaturePrefsStore.batch1191.v1200aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1200: agree mode
internal fun PlayerActivity.showV1200AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agree
    FeaturePrefsStore.batch1191.v1200agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1200: ahead mode
internal fun PlayerActivity.showV1200AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1200ahead
    FeaturePrefsStore.batch1191.v1200ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1200: aid level
internal fun PlayerActivity.showV1200AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1200: aim level
internal fun PlayerActivity.showV1200AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1200: air level
internal fun PlayerActivity.showV1200AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200air = value
        AppToast.show(this, "air: $value")
    }
}

// v1200: alarm level
internal fun PlayerActivity.showV1200AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1200: album level
internal fun PlayerActivity.showV1200AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200album = value
        AppToast.show(this, "album: $value")
    }
}

// v1200: algae mode
internal fun PlayerActivity.showV1200AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1200algae
    FeaturePrefsStore.batch1191.v1200algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1200: alias mode
internal fun PlayerActivity.showV1200AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alias
    FeaturePrefsStore.batch1191.v1200alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1200: alien mode
internal fun PlayerActivity.showV1200AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alien
    FeaturePrefsStore.batch1191.v1200alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1200: alive mode
internal fun PlayerActivity.showV1200AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alive
    FeaturePrefsStore.batch1191.v1200alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1200: alley mode
internal fun PlayerActivity.showV1200AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alley
    FeaturePrefsStore.batch1191.v1200alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

