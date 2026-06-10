package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1311: cedar mode
internal fun PlayerActivity.showV1311CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1311cedar
    FeaturePrefsStore.batch1311.v1311cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1311: chair mode
internal fun PlayerActivity.showV1311ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chair
    FeaturePrefsStore.batch1311.v1311chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1311: chalk mode
internal fun PlayerActivity.showV1311ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chalk
    FeaturePrefsStore.batch1311.v1311chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1311: champ mode
internal fun PlayerActivity.showV1311ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1311champ
    FeaturePrefsStore.batch1311.v1311champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1311: chaos mode
internal fun PlayerActivity.showV1311ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chaos
    FeaturePrefsStore.batch1311.v1311chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1311: charm level
internal fun PlayerActivity.showV1311CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1311charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1311charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1311: chase level
internal fun PlayerActivity.showV1311ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1311chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1311chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1311: cheap level
internal fun PlayerActivity.showV1311CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1311cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1311cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1311: check level
internal fun PlayerActivity.showV1311CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1311check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1311check = value
        AppToast.show(this, "check: $value")
    }
}

// v1311: cheek level
internal fun PlayerActivity.showV1311CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1311cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1311cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1311: chess mode
internal fun PlayerActivity.showV1311ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chess
    FeaturePrefsStore.batch1311.v1311chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1311: chest mode
internal fun PlayerActivity.showV1311ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chest
    FeaturePrefsStore.batch1311.v1311chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1311: chief mode
internal fun PlayerActivity.showV1311ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1311chief
    FeaturePrefsStore.batch1311.v1311chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1311: child mode
internal fun PlayerActivity.showV1311ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1311child
    FeaturePrefsStore.batch1311.v1311child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1311: china mode
internal fun PlayerActivity.showV1311ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1311china
    FeaturePrefsStore.batch1311.v1311china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1312: cedar mode
internal fun PlayerActivity.showV1312CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1312cedar
    FeaturePrefsStore.batch1311.v1312cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1312: chair mode
internal fun PlayerActivity.showV1312ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chair
    FeaturePrefsStore.batch1311.v1312chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1312: chalk mode
internal fun PlayerActivity.showV1312ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chalk
    FeaturePrefsStore.batch1311.v1312chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1312: champ mode
internal fun PlayerActivity.showV1312ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1312champ
    FeaturePrefsStore.batch1311.v1312champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1312: chaos mode
internal fun PlayerActivity.showV1312ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chaos
    FeaturePrefsStore.batch1311.v1312chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1312: charm level
internal fun PlayerActivity.showV1312CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1312charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1312charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1312: chase level
internal fun PlayerActivity.showV1312ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1312chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1312chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1312: cheap level
internal fun PlayerActivity.showV1312CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1312cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1312cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1312: check level
internal fun PlayerActivity.showV1312CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1312check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1312check = value
        AppToast.show(this, "check: $value")
    }
}

// v1312: cheek level
internal fun PlayerActivity.showV1312CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1312cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1312cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1312: chess mode
internal fun PlayerActivity.showV1312ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chess
    FeaturePrefsStore.batch1311.v1312chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1312: chest mode
internal fun PlayerActivity.showV1312ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chest
    FeaturePrefsStore.batch1311.v1312chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1312: chief mode
internal fun PlayerActivity.showV1312ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1312chief
    FeaturePrefsStore.batch1311.v1312chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1312: child mode
internal fun PlayerActivity.showV1312ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1312child
    FeaturePrefsStore.batch1311.v1312child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1312: china mode
internal fun PlayerActivity.showV1312ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1312china
    FeaturePrefsStore.batch1311.v1312china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1313: cedar mode
internal fun PlayerActivity.showV1313CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1313cedar
    FeaturePrefsStore.batch1311.v1313cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1313: chair mode
internal fun PlayerActivity.showV1313ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chair
    FeaturePrefsStore.batch1311.v1313chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1313: chalk mode
internal fun PlayerActivity.showV1313ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chalk
    FeaturePrefsStore.batch1311.v1313chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1313: champ mode
internal fun PlayerActivity.showV1313ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1313champ
    FeaturePrefsStore.batch1311.v1313champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1313: chaos mode
internal fun PlayerActivity.showV1313ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chaos
    FeaturePrefsStore.batch1311.v1313chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1313: charm level
internal fun PlayerActivity.showV1313CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1313charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1313charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1313: chase level
internal fun PlayerActivity.showV1313ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1313chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1313chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1313: cheap level
internal fun PlayerActivity.showV1313CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1313cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1313cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1313: check level
internal fun PlayerActivity.showV1313CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1313check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1313check = value
        AppToast.show(this, "check: $value")
    }
}

// v1313: cheek level
internal fun PlayerActivity.showV1313CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1313cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1313cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1313: chess mode
internal fun PlayerActivity.showV1313ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chess
    FeaturePrefsStore.batch1311.v1313chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1313: chest mode
internal fun PlayerActivity.showV1313ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chest
    FeaturePrefsStore.batch1311.v1313chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1313: chief mode
internal fun PlayerActivity.showV1313ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1313chief
    FeaturePrefsStore.batch1311.v1313chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1313: child mode
internal fun PlayerActivity.showV1313ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1313child
    FeaturePrefsStore.batch1311.v1313child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1313: china mode
internal fun PlayerActivity.showV1313ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1313china
    FeaturePrefsStore.batch1311.v1313china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1314: cedar mode
internal fun PlayerActivity.showV1314CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1314cedar
    FeaturePrefsStore.batch1311.v1314cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1314: chair mode
internal fun PlayerActivity.showV1314ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chair
    FeaturePrefsStore.batch1311.v1314chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1314: chalk mode
internal fun PlayerActivity.showV1314ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chalk
    FeaturePrefsStore.batch1311.v1314chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1314: champ mode
internal fun PlayerActivity.showV1314ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1314champ
    FeaturePrefsStore.batch1311.v1314champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1314: chaos mode
internal fun PlayerActivity.showV1314ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chaos
    FeaturePrefsStore.batch1311.v1314chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1314: charm level
internal fun PlayerActivity.showV1314CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1314charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1314charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1314: chase level
internal fun PlayerActivity.showV1314ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1314chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1314chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1314: cheap level
internal fun PlayerActivity.showV1314CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1314cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1314cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1314: check level
internal fun PlayerActivity.showV1314CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1314check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1314check = value
        AppToast.show(this, "check: $value")
    }
}

// v1314: cheek level
internal fun PlayerActivity.showV1314CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1314cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1314cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1314: chess mode
internal fun PlayerActivity.showV1314ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chess
    FeaturePrefsStore.batch1311.v1314chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1314: chest mode
internal fun PlayerActivity.showV1314ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chest
    FeaturePrefsStore.batch1311.v1314chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1314: chief mode
internal fun PlayerActivity.showV1314ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1314chief
    FeaturePrefsStore.batch1311.v1314chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1314: child mode
internal fun PlayerActivity.showV1314ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1314child
    FeaturePrefsStore.batch1311.v1314child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1314: china mode
internal fun PlayerActivity.showV1314ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1314china
    FeaturePrefsStore.batch1311.v1314china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1315: cedar mode
internal fun PlayerActivity.showV1315CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1315cedar
    FeaturePrefsStore.batch1311.v1315cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1315: chair mode
internal fun PlayerActivity.showV1315ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chair
    FeaturePrefsStore.batch1311.v1315chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1315: chalk mode
internal fun PlayerActivity.showV1315ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chalk
    FeaturePrefsStore.batch1311.v1315chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1315: champ mode
internal fun PlayerActivity.showV1315ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1315champ
    FeaturePrefsStore.batch1311.v1315champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1315: chaos mode
internal fun PlayerActivity.showV1315ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chaos
    FeaturePrefsStore.batch1311.v1315chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1315: charm level
internal fun PlayerActivity.showV1315CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1315charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1315charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1315: chase level
internal fun PlayerActivity.showV1315ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1315chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1315chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1315: cheap level
internal fun PlayerActivity.showV1315CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1315cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1315cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1315: check level
internal fun PlayerActivity.showV1315CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1315check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1315check = value
        AppToast.show(this, "check: $value")
    }
}

// v1315: cheek level
internal fun PlayerActivity.showV1315CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1315cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1315cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1315: chess mode
internal fun PlayerActivity.showV1315ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chess
    FeaturePrefsStore.batch1311.v1315chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1315: chest mode
internal fun PlayerActivity.showV1315ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chest
    FeaturePrefsStore.batch1311.v1315chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1315: chief mode
internal fun PlayerActivity.showV1315ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1315chief
    FeaturePrefsStore.batch1311.v1315chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1315: child mode
internal fun PlayerActivity.showV1315ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1315child
    FeaturePrefsStore.batch1311.v1315child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1315: china mode
internal fun PlayerActivity.showV1315ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1315china
    FeaturePrefsStore.batch1311.v1315china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1316: cedar mode
internal fun PlayerActivity.showV1316CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1316cedar
    FeaturePrefsStore.batch1311.v1316cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1316: chair mode
internal fun PlayerActivity.showV1316ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chair
    FeaturePrefsStore.batch1311.v1316chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1316: chalk mode
internal fun PlayerActivity.showV1316ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chalk
    FeaturePrefsStore.batch1311.v1316chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1316: champ mode
internal fun PlayerActivity.showV1316ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1316champ
    FeaturePrefsStore.batch1311.v1316champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1316: chaos mode
internal fun PlayerActivity.showV1316ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chaos
    FeaturePrefsStore.batch1311.v1316chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1316: charm level
internal fun PlayerActivity.showV1316CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1316charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1316charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1316: chase level
internal fun PlayerActivity.showV1316ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1316chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1316chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1316: cheap level
internal fun PlayerActivity.showV1316CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1316cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1316cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1316: check level
internal fun PlayerActivity.showV1316CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1316check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1316check = value
        AppToast.show(this, "check: $value")
    }
}

// v1316: cheek level
internal fun PlayerActivity.showV1316CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1316cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1316cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1316: chess mode
internal fun PlayerActivity.showV1316ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chess
    FeaturePrefsStore.batch1311.v1316chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1316: chest mode
internal fun PlayerActivity.showV1316ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chest
    FeaturePrefsStore.batch1311.v1316chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1316: chief mode
internal fun PlayerActivity.showV1316ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1316chief
    FeaturePrefsStore.batch1311.v1316chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1316: child mode
internal fun PlayerActivity.showV1316ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1316child
    FeaturePrefsStore.batch1311.v1316child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1316: china mode
internal fun PlayerActivity.showV1316ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1316china
    FeaturePrefsStore.batch1311.v1316china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1317: cedar mode
internal fun PlayerActivity.showV1317CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1317cedar
    FeaturePrefsStore.batch1311.v1317cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1317: chair mode
internal fun PlayerActivity.showV1317ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chair
    FeaturePrefsStore.batch1311.v1317chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1317: chalk mode
internal fun PlayerActivity.showV1317ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chalk
    FeaturePrefsStore.batch1311.v1317chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1317: champ mode
internal fun PlayerActivity.showV1317ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1317champ
    FeaturePrefsStore.batch1311.v1317champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1317: chaos mode
internal fun PlayerActivity.showV1317ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chaos
    FeaturePrefsStore.batch1311.v1317chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1317: charm level
internal fun PlayerActivity.showV1317CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1317charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1317charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1317: chase level
internal fun PlayerActivity.showV1317ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1317chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1317chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1317: cheap level
internal fun PlayerActivity.showV1317CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1317cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1317cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1317: check level
internal fun PlayerActivity.showV1317CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1317check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1317check = value
        AppToast.show(this, "check: $value")
    }
}

// v1317: cheek level
internal fun PlayerActivity.showV1317CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1317cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1317cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1317: chess mode
internal fun PlayerActivity.showV1317ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chess
    FeaturePrefsStore.batch1311.v1317chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1317: chest mode
internal fun PlayerActivity.showV1317ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chest
    FeaturePrefsStore.batch1311.v1317chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1317: chief mode
internal fun PlayerActivity.showV1317ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1317chief
    FeaturePrefsStore.batch1311.v1317chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1317: child mode
internal fun PlayerActivity.showV1317ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1317child
    FeaturePrefsStore.batch1311.v1317child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1317: china mode
internal fun PlayerActivity.showV1317ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1317china
    FeaturePrefsStore.batch1311.v1317china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1318: cedar mode
internal fun PlayerActivity.showV1318CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1318cedar
    FeaturePrefsStore.batch1311.v1318cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1318: chair mode
internal fun PlayerActivity.showV1318ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chair
    FeaturePrefsStore.batch1311.v1318chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1318: chalk mode
internal fun PlayerActivity.showV1318ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chalk
    FeaturePrefsStore.batch1311.v1318chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1318: champ mode
internal fun PlayerActivity.showV1318ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1318champ
    FeaturePrefsStore.batch1311.v1318champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1318: chaos mode
internal fun PlayerActivity.showV1318ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chaos
    FeaturePrefsStore.batch1311.v1318chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1318: charm level
internal fun PlayerActivity.showV1318CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1318charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1318charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1318: chase level
internal fun PlayerActivity.showV1318ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1318chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1318chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1318: cheap level
internal fun PlayerActivity.showV1318CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1318cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1318cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1318: check level
internal fun PlayerActivity.showV1318CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1318check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1318check = value
        AppToast.show(this, "check: $value")
    }
}

// v1318: cheek level
internal fun PlayerActivity.showV1318CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1318cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1318cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1318: chess mode
internal fun PlayerActivity.showV1318ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chess
    FeaturePrefsStore.batch1311.v1318chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1318: chest mode
internal fun PlayerActivity.showV1318ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chest
    FeaturePrefsStore.batch1311.v1318chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1318: chief mode
internal fun PlayerActivity.showV1318ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1318chief
    FeaturePrefsStore.batch1311.v1318chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1318: child mode
internal fun PlayerActivity.showV1318ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1318child
    FeaturePrefsStore.batch1311.v1318child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1318: china mode
internal fun PlayerActivity.showV1318ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1318china
    FeaturePrefsStore.batch1311.v1318china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1319: cedar mode
internal fun PlayerActivity.showV1319CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1319cedar
    FeaturePrefsStore.batch1311.v1319cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1319: chair mode
internal fun PlayerActivity.showV1319ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chair
    FeaturePrefsStore.batch1311.v1319chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1319: chalk mode
internal fun PlayerActivity.showV1319ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chalk
    FeaturePrefsStore.batch1311.v1319chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1319: champ mode
internal fun PlayerActivity.showV1319ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1319champ
    FeaturePrefsStore.batch1311.v1319champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1319: chaos mode
internal fun PlayerActivity.showV1319ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chaos
    FeaturePrefsStore.batch1311.v1319chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1319: charm level
internal fun PlayerActivity.showV1319CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1319charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1319charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1319: chase level
internal fun PlayerActivity.showV1319ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1319chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1319chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1319: cheap level
internal fun PlayerActivity.showV1319CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1319cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1319cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1319: check level
internal fun PlayerActivity.showV1319CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1319check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1319check = value
        AppToast.show(this, "check: $value")
    }
}

// v1319: cheek level
internal fun PlayerActivity.showV1319CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1319cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1319cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1319: chess mode
internal fun PlayerActivity.showV1319ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chess
    FeaturePrefsStore.batch1311.v1319chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1319: chest mode
internal fun PlayerActivity.showV1319ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chest
    FeaturePrefsStore.batch1311.v1319chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1319: chief mode
internal fun PlayerActivity.showV1319ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1319chief
    FeaturePrefsStore.batch1311.v1319chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1319: child mode
internal fun PlayerActivity.showV1319ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1319child
    FeaturePrefsStore.batch1311.v1319child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1319: china mode
internal fun PlayerActivity.showV1319ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1319china
    FeaturePrefsStore.batch1311.v1319china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

// v1320: cedar mode
internal fun PlayerActivity.showV1320CedarToggle() {
    val current = FeaturePrefsStore.batch1311.v1320cedar
    FeaturePrefsStore.batch1311.v1320cedar = !current
    AppToast.show(this, "cedar: ${if (!current) "ON" else "OFF"}")
}

// v1320: chair mode
internal fun PlayerActivity.showV1320ChairToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chair
    FeaturePrefsStore.batch1311.v1320chair = !current
    AppToast.show(this, "chair: ${if (!current) "ON" else "OFF"}")
}

// v1320: chalk mode
internal fun PlayerActivity.showV1320ChalkToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chalk
    FeaturePrefsStore.batch1311.v1320chalk = !current
    AppToast.show(this, "chalk: ${if (!current) "ON" else "OFF"}")
}

// v1320: champ mode
internal fun PlayerActivity.showV1320ChampToggle() {
    val current = FeaturePrefsStore.batch1311.v1320champ
    FeaturePrefsStore.batch1311.v1320champ = !current
    AppToast.show(this, "champ: ${if (!current) "ON" else "OFF"}")
}

// v1320: chaos mode
internal fun PlayerActivity.showV1320ChaosToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chaos
    FeaturePrefsStore.batch1311.v1320chaos = !current
    AppToast.show(this, "chaos: ${if (!current) "ON" else "OFF"}")
}

// v1320: charm level
internal fun PlayerActivity.showV1320CharmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1320charm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1320charm = value
        AppToast.show(this, "charm: $value")
    }
}

// v1320: chase level
internal fun PlayerActivity.showV1320ChaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1320chase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1320chase = value
        AppToast.show(this, "chase: $value")
    }
}

// v1320: cheap level
internal fun PlayerActivity.showV1320CheapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1320cheap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1320cheap = value
        AppToast.show(this, "cheap: $value")
    }
}

// v1320: check level
internal fun PlayerActivity.showV1320CheckDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1320check).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "check level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1320check = value
        AppToast.show(this, "check: $value")
    }
}

// v1320: cheek level
internal fun PlayerActivity.showV1320CheekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1311.v1320cheek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheek level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1311.v1320cheek = value
        AppToast.show(this, "cheek: $value")
    }
}

// v1320: chess mode
internal fun PlayerActivity.showV1320ChessToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chess
    FeaturePrefsStore.batch1311.v1320chess = !current
    AppToast.show(this, "chess: ${if (!current) "ON" else "OFF"}")
}

// v1320: chest mode
internal fun PlayerActivity.showV1320ChestToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chest
    FeaturePrefsStore.batch1311.v1320chest = !current
    AppToast.show(this, "chest: ${if (!current) "ON" else "OFF"}")
}

// v1320: chief mode
internal fun PlayerActivity.showV1320ChiefToggle() {
    val current = FeaturePrefsStore.batch1311.v1320chief
    FeaturePrefsStore.batch1311.v1320chief = !current
    AppToast.show(this, "chief: ${if (!current) "ON" else "OFF"}")
}

// v1320: child mode
internal fun PlayerActivity.showV1320ChildToggle() {
    val current = FeaturePrefsStore.batch1311.v1320child
    FeaturePrefsStore.batch1311.v1320child = !current
    AppToast.show(this, "child: ${if (!current) "ON" else "OFF"}")
}

// v1320: china mode
internal fun PlayerActivity.showV1320ChinaToggle() {
    val current = FeaturePrefsStore.batch1311.v1320china
    FeaturePrefsStore.batch1311.v1320china = !current
    AppToast.show(this, "china: ${if (!current) "ON" else "OFF"}")
}

