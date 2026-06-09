package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1371: dawn mode
internal fun PlayerActivity.showV1371DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1371dawn
    FeaturePrefsStore.batch1371.v1371dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1371: dead mode
internal fun PlayerActivity.showV1371DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1371dead
    FeaturePrefsStore.batch1371.v1371dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1371: deaf mode
internal fun PlayerActivity.showV1371DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1371deaf
    FeaturePrefsStore.batch1371.v1371deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1371: deal mode
internal fun PlayerActivity.showV1371DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1371deal
    FeaturePrefsStore.batch1371.v1371deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1371: dear mode
internal fun PlayerActivity.showV1371DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1371dear
    FeaturePrefsStore.batch1371.v1371dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1371: death level
internal fun PlayerActivity.showV1371DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1371death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1371death = value
        AppToast.show(this, "death: $value")
    }
}

// v1371: debate level
internal fun PlayerActivity.showV1371DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1371debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1371debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1371: debt level
internal fun PlayerActivity.showV1371DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1371debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1371debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1371: deck level
internal fun PlayerActivity.showV1371DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1371deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1371deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1371: decor level
internal fun PlayerActivity.showV1371DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1371decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1371decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1371: decoy mode
internal fun PlayerActivity.showV1371DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1371decoy
    FeaturePrefsStore.batch1371.v1371decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1371: decree mode
internal fun PlayerActivity.showV1371DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1371decree
    FeaturePrefsStore.batch1371.v1371decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1371: demand mode
internal fun PlayerActivity.showV1371DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1371demand
    FeaturePrefsStore.batch1371.v1371demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1371: demise mode
internal fun PlayerActivity.showV1371DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1371demise
    FeaturePrefsStore.batch1371.v1371demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1371: denial mode
internal fun PlayerActivity.showV1371DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1371denial
    FeaturePrefsStore.batch1371.v1371denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1372: dawn mode
internal fun PlayerActivity.showV1372DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1372dawn
    FeaturePrefsStore.batch1371.v1372dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1372: dead mode
internal fun PlayerActivity.showV1372DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1372dead
    FeaturePrefsStore.batch1371.v1372dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1372: deaf mode
internal fun PlayerActivity.showV1372DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1372deaf
    FeaturePrefsStore.batch1371.v1372deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1372: deal mode
internal fun PlayerActivity.showV1372DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1372deal
    FeaturePrefsStore.batch1371.v1372deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1372: dear mode
internal fun PlayerActivity.showV1372DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1372dear
    FeaturePrefsStore.batch1371.v1372dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1372: death level
internal fun PlayerActivity.showV1372DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1372death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1372death = value
        AppToast.show(this, "death: $value")
    }
}

// v1372: debate level
internal fun PlayerActivity.showV1372DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1372debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1372debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1372: debt level
internal fun PlayerActivity.showV1372DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1372debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1372debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1372: deck level
internal fun PlayerActivity.showV1372DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1372deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1372deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1372: decor level
internal fun PlayerActivity.showV1372DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1372decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1372decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1372: decoy mode
internal fun PlayerActivity.showV1372DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1372decoy
    FeaturePrefsStore.batch1371.v1372decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1372: decree mode
internal fun PlayerActivity.showV1372DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1372decree
    FeaturePrefsStore.batch1371.v1372decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1372: demand mode
internal fun PlayerActivity.showV1372DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1372demand
    FeaturePrefsStore.batch1371.v1372demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1372: demise mode
internal fun PlayerActivity.showV1372DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1372demise
    FeaturePrefsStore.batch1371.v1372demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1372: denial mode
internal fun PlayerActivity.showV1372DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1372denial
    FeaturePrefsStore.batch1371.v1372denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1373: dawn mode
internal fun PlayerActivity.showV1373DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1373dawn
    FeaturePrefsStore.batch1371.v1373dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1373: dead mode
internal fun PlayerActivity.showV1373DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1373dead
    FeaturePrefsStore.batch1371.v1373dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1373: deaf mode
internal fun PlayerActivity.showV1373DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1373deaf
    FeaturePrefsStore.batch1371.v1373deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1373: deal mode
internal fun PlayerActivity.showV1373DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1373deal
    FeaturePrefsStore.batch1371.v1373deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1373: dear mode
internal fun PlayerActivity.showV1373DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1373dear
    FeaturePrefsStore.batch1371.v1373dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1373: death level
internal fun PlayerActivity.showV1373DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1373death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1373death = value
        AppToast.show(this, "death: $value")
    }
}

// v1373: debate level
internal fun PlayerActivity.showV1373DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1373debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1373debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1373: debt level
internal fun PlayerActivity.showV1373DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1373debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1373debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1373: deck level
internal fun PlayerActivity.showV1373DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1373deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1373deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1373: decor level
internal fun PlayerActivity.showV1373DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1373decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1373decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1373: decoy mode
internal fun PlayerActivity.showV1373DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1373decoy
    FeaturePrefsStore.batch1371.v1373decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1373: decree mode
internal fun PlayerActivity.showV1373DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1373decree
    FeaturePrefsStore.batch1371.v1373decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1373: demand mode
internal fun PlayerActivity.showV1373DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1373demand
    FeaturePrefsStore.batch1371.v1373demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1373: demise mode
internal fun PlayerActivity.showV1373DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1373demise
    FeaturePrefsStore.batch1371.v1373demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1373: denial mode
internal fun PlayerActivity.showV1373DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1373denial
    FeaturePrefsStore.batch1371.v1373denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1374: dawn mode
internal fun PlayerActivity.showV1374DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1374dawn
    FeaturePrefsStore.batch1371.v1374dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1374: dead mode
internal fun PlayerActivity.showV1374DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1374dead
    FeaturePrefsStore.batch1371.v1374dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1374: deaf mode
internal fun PlayerActivity.showV1374DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1374deaf
    FeaturePrefsStore.batch1371.v1374deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1374: deal mode
internal fun PlayerActivity.showV1374DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1374deal
    FeaturePrefsStore.batch1371.v1374deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1374: dear mode
internal fun PlayerActivity.showV1374DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1374dear
    FeaturePrefsStore.batch1371.v1374dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1374: death level
internal fun PlayerActivity.showV1374DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1374death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1374death = value
        AppToast.show(this, "death: $value")
    }
}

// v1374: debate level
internal fun PlayerActivity.showV1374DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1374debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1374debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1374: debt level
internal fun PlayerActivity.showV1374DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1374debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1374debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1374: deck level
internal fun PlayerActivity.showV1374DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1374deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1374deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1374: decor level
internal fun PlayerActivity.showV1374DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1374decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1374decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1374: decoy mode
internal fun PlayerActivity.showV1374DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1374decoy
    FeaturePrefsStore.batch1371.v1374decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1374: decree mode
internal fun PlayerActivity.showV1374DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1374decree
    FeaturePrefsStore.batch1371.v1374decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1374: demand mode
internal fun PlayerActivity.showV1374DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1374demand
    FeaturePrefsStore.batch1371.v1374demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1374: demise mode
internal fun PlayerActivity.showV1374DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1374demise
    FeaturePrefsStore.batch1371.v1374demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1374: denial mode
internal fun PlayerActivity.showV1374DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1374denial
    FeaturePrefsStore.batch1371.v1374denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1375: dawn mode
internal fun PlayerActivity.showV1375DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1375dawn
    FeaturePrefsStore.batch1371.v1375dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1375: dead mode
internal fun PlayerActivity.showV1375DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1375dead
    FeaturePrefsStore.batch1371.v1375dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1375: deaf mode
internal fun PlayerActivity.showV1375DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1375deaf
    FeaturePrefsStore.batch1371.v1375deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1375: deal mode
internal fun PlayerActivity.showV1375DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1375deal
    FeaturePrefsStore.batch1371.v1375deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1375: dear mode
internal fun PlayerActivity.showV1375DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1375dear
    FeaturePrefsStore.batch1371.v1375dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1375: death level
internal fun PlayerActivity.showV1375DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1375death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1375death = value
        AppToast.show(this, "death: $value")
    }
}

// v1375: debate level
internal fun PlayerActivity.showV1375DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1375debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1375debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1375: debt level
internal fun PlayerActivity.showV1375DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1375debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1375debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1375: deck level
internal fun PlayerActivity.showV1375DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1375deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1375deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1375: decor level
internal fun PlayerActivity.showV1375DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1375decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1375decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1375: decoy mode
internal fun PlayerActivity.showV1375DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1375decoy
    FeaturePrefsStore.batch1371.v1375decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1375: decree mode
internal fun PlayerActivity.showV1375DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1375decree
    FeaturePrefsStore.batch1371.v1375decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1375: demand mode
internal fun PlayerActivity.showV1375DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1375demand
    FeaturePrefsStore.batch1371.v1375demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1375: demise mode
internal fun PlayerActivity.showV1375DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1375demise
    FeaturePrefsStore.batch1371.v1375demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1375: denial mode
internal fun PlayerActivity.showV1375DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1375denial
    FeaturePrefsStore.batch1371.v1375denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1376: dawn mode
internal fun PlayerActivity.showV1376DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1376dawn
    FeaturePrefsStore.batch1371.v1376dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1376: dead mode
internal fun PlayerActivity.showV1376DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1376dead
    FeaturePrefsStore.batch1371.v1376dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1376: deaf mode
internal fun PlayerActivity.showV1376DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1376deaf
    FeaturePrefsStore.batch1371.v1376deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1376: deal mode
internal fun PlayerActivity.showV1376DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1376deal
    FeaturePrefsStore.batch1371.v1376deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1376: dear mode
internal fun PlayerActivity.showV1376DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1376dear
    FeaturePrefsStore.batch1371.v1376dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1376: death level
internal fun PlayerActivity.showV1376DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1376death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1376death = value
        AppToast.show(this, "death: $value")
    }
}

// v1376: debate level
internal fun PlayerActivity.showV1376DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1376debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1376debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1376: debt level
internal fun PlayerActivity.showV1376DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1376debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1376debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1376: deck level
internal fun PlayerActivity.showV1376DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1376deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1376deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1376: decor level
internal fun PlayerActivity.showV1376DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1376decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1376decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1376: decoy mode
internal fun PlayerActivity.showV1376DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1376decoy
    FeaturePrefsStore.batch1371.v1376decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1376: decree mode
internal fun PlayerActivity.showV1376DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1376decree
    FeaturePrefsStore.batch1371.v1376decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1376: demand mode
internal fun PlayerActivity.showV1376DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1376demand
    FeaturePrefsStore.batch1371.v1376demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1376: demise mode
internal fun PlayerActivity.showV1376DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1376demise
    FeaturePrefsStore.batch1371.v1376demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1376: denial mode
internal fun PlayerActivity.showV1376DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1376denial
    FeaturePrefsStore.batch1371.v1376denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1377: dawn mode
internal fun PlayerActivity.showV1377DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1377dawn
    FeaturePrefsStore.batch1371.v1377dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1377: dead mode
internal fun PlayerActivity.showV1377DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1377dead
    FeaturePrefsStore.batch1371.v1377dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1377: deaf mode
internal fun PlayerActivity.showV1377DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1377deaf
    FeaturePrefsStore.batch1371.v1377deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1377: deal mode
internal fun PlayerActivity.showV1377DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1377deal
    FeaturePrefsStore.batch1371.v1377deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1377: dear mode
internal fun PlayerActivity.showV1377DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1377dear
    FeaturePrefsStore.batch1371.v1377dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1377: death level
internal fun PlayerActivity.showV1377DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1377death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1377death = value
        AppToast.show(this, "death: $value")
    }
}

// v1377: debate level
internal fun PlayerActivity.showV1377DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1377debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1377debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1377: debt level
internal fun PlayerActivity.showV1377DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1377debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1377debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1377: deck level
internal fun PlayerActivity.showV1377DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1377deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1377deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1377: decor level
internal fun PlayerActivity.showV1377DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1377decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1377decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1377: decoy mode
internal fun PlayerActivity.showV1377DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1377decoy
    FeaturePrefsStore.batch1371.v1377decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1377: decree mode
internal fun PlayerActivity.showV1377DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1377decree
    FeaturePrefsStore.batch1371.v1377decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1377: demand mode
internal fun PlayerActivity.showV1377DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1377demand
    FeaturePrefsStore.batch1371.v1377demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1377: demise mode
internal fun PlayerActivity.showV1377DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1377demise
    FeaturePrefsStore.batch1371.v1377demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1377: denial mode
internal fun PlayerActivity.showV1377DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1377denial
    FeaturePrefsStore.batch1371.v1377denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1378: dawn mode
internal fun PlayerActivity.showV1378DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1378dawn
    FeaturePrefsStore.batch1371.v1378dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1378: dead mode
internal fun PlayerActivity.showV1378DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1378dead
    FeaturePrefsStore.batch1371.v1378dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1378: deaf mode
internal fun PlayerActivity.showV1378DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1378deaf
    FeaturePrefsStore.batch1371.v1378deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1378: deal mode
internal fun PlayerActivity.showV1378DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1378deal
    FeaturePrefsStore.batch1371.v1378deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1378: dear mode
internal fun PlayerActivity.showV1378DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1378dear
    FeaturePrefsStore.batch1371.v1378dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1378: death level
internal fun PlayerActivity.showV1378DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1378death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1378death = value
        AppToast.show(this, "death: $value")
    }
}

// v1378: debate level
internal fun PlayerActivity.showV1378DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1378debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1378debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1378: debt level
internal fun PlayerActivity.showV1378DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1378debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1378debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1378: deck level
internal fun PlayerActivity.showV1378DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1378deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1378deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1378: decor level
internal fun PlayerActivity.showV1378DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1378decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1378decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1378: decoy mode
internal fun PlayerActivity.showV1378DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1378decoy
    FeaturePrefsStore.batch1371.v1378decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1378: decree mode
internal fun PlayerActivity.showV1378DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1378decree
    FeaturePrefsStore.batch1371.v1378decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1378: demand mode
internal fun PlayerActivity.showV1378DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1378demand
    FeaturePrefsStore.batch1371.v1378demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1378: demise mode
internal fun PlayerActivity.showV1378DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1378demise
    FeaturePrefsStore.batch1371.v1378demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1378: denial mode
internal fun PlayerActivity.showV1378DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1378denial
    FeaturePrefsStore.batch1371.v1378denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1379: dawn mode
internal fun PlayerActivity.showV1379DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1379dawn
    FeaturePrefsStore.batch1371.v1379dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1379: dead mode
internal fun PlayerActivity.showV1379DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1379dead
    FeaturePrefsStore.batch1371.v1379dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1379: deaf mode
internal fun PlayerActivity.showV1379DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1379deaf
    FeaturePrefsStore.batch1371.v1379deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1379: deal mode
internal fun PlayerActivity.showV1379DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1379deal
    FeaturePrefsStore.batch1371.v1379deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1379: dear mode
internal fun PlayerActivity.showV1379DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1379dear
    FeaturePrefsStore.batch1371.v1379dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1379: death level
internal fun PlayerActivity.showV1379DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1379death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1379death = value
        AppToast.show(this, "death: $value")
    }
}

// v1379: debate level
internal fun PlayerActivity.showV1379DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1379debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1379debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1379: debt level
internal fun PlayerActivity.showV1379DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1379debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1379debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1379: deck level
internal fun PlayerActivity.showV1379DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1379deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1379deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1379: decor level
internal fun PlayerActivity.showV1379DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1379decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1379decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1379: decoy mode
internal fun PlayerActivity.showV1379DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1379decoy
    FeaturePrefsStore.batch1371.v1379decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1379: decree mode
internal fun PlayerActivity.showV1379DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1379decree
    FeaturePrefsStore.batch1371.v1379decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1379: demand mode
internal fun PlayerActivity.showV1379DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1379demand
    FeaturePrefsStore.batch1371.v1379demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1379: demise mode
internal fun PlayerActivity.showV1379DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1379demise
    FeaturePrefsStore.batch1371.v1379demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1379: denial mode
internal fun PlayerActivity.showV1379DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1379denial
    FeaturePrefsStore.batch1371.v1379denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

// v1380: dawn mode
internal fun PlayerActivity.showV1380DawnToggle() {
    val current = FeaturePrefsStore.batch1371.v1380dawn
    FeaturePrefsStore.batch1371.v1380dawn = !current
    AppToast.show(this, "dawn: ${if (!current) "ON" else "OFF"}")
}

// v1380: dead mode
internal fun PlayerActivity.showV1380DeadToggle() {
    val current = FeaturePrefsStore.batch1371.v1380dead
    FeaturePrefsStore.batch1371.v1380dead = !current
    AppToast.show(this, "dead: ${if (!current) "ON" else "OFF"}")
}

// v1380: deaf mode
internal fun PlayerActivity.showV1380DeafToggle() {
    val current = FeaturePrefsStore.batch1371.v1380deaf
    FeaturePrefsStore.batch1371.v1380deaf = !current
    AppToast.show(this, "deaf: ${if (!current) "ON" else "OFF"}")
}

// v1380: deal mode
internal fun PlayerActivity.showV1380DealToggle() {
    val current = FeaturePrefsStore.batch1371.v1380deal
    FeaturePrefsStore.batch1371.v1380deal = !current
    AppToast.show(this, "deal: ${if (!current) "ON" else "OFF"}")
}

// v1380: dear mode
internal fun PlayerActivity.showV1380DearToggle() {
    val current = FeaturePrefsStore.batch1371.v1380dear
    FeaturePrefsStore.batch1371.v1380dear = !current
    AppToast.show(this, "dear: ${if (!current) "ON" else "OFF"}")
}

// v1380: death level
internal fun PlayerActivity.showV1380DeathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1380death).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "death level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1380death = value
        AppToast.show(this, "death: $value")
    }
}

// v1380: debate level
internal fun PlayerActivity.showV1380DebateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1380debate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1380debate = value
        AppToast.show(this, "debate: $value")
    }
}

// v1380: debt level
internal fun PlayerActivity.showV1380DebtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1380debt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1380debt = value
        AppToast.show(this, "debt: $value")
    }
}

// v1380: deck level
internal fun PlayerActivity.showV1380DeckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1380deck).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deck level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1380deck = value
        AppToast.show(this, "deck: $value")
    }
}

// v1380: decor level
internal fun PlayerActivity.showV1380DecorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1371.v1380decor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1371.v1380decor = value
        AppToast.show(this, "decor: $value")
    }
}

// v1380: decoy mode
internal fun PlayerActivity.showV1380DecoyToggle() {
    val current = FeaturePrefsStore.batch1371.v1380decoy
    FeaturePrefsStore.batch1371.v1380decoy = !current
    AppToast.show(this, "decoy: ${if (!current) "ON" else "OFF"}")
}

// v1380: decree mode
internal fun PlayerActivity.showV1380DecreeToggle() {
    val current = FeaturePrefsStore.batch1371.v1380decree
    FeaturePrefsStore.batch1371.v1380decree = !current
    AppToast.show(this, "decree: ${if (!current) "ON" else "OFF"}")
}

// v1380: demand mode
internal fun PlayerActivity.showV1380DemandToggle() {
    val current = FeaturePrefsStore.batch1371.v1380demand
    FeaturePrefsStore.batch1371.v1380demand = !current
    AppToast.show(this, "demand: ${if (!current) "ON" else "OFF"}")
}

// v1380: demise mode
internal fun PlayerActivity.showV1380DemiseToggle() {
    val current = FeaturePrefsStore.batch1371.v1380demise
    FeaturePrefsStore.batch1371.v1380demise = !current
    AppToast.show(this, "demise: ${if (!current) "ON" else "OFF"}")
}

// v1380: denial mode
internal fun PlayerActivity.showV1380DenialToggle() {
    val current = FeaturePrefsStore.batch1371.v1380denial
    FeaturePrefsStore.batch1371.v1380denial = !current
    AppToast.show(this, "denial: ${if (!current) "ON" else "OFF"}")
}

