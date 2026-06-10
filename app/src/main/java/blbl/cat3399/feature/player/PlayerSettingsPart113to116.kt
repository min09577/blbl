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

// v1321: chip mode
internal fun PlayerActivity.showV1321ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chip
    FeaturePrefsStore.batch1321.v1321chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1321: choice mode
internal fun PlayerActivity.showV1321ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1321choice
    FeaturePrefsStore.batch1321.v1321choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1321: chord mode
internal fun PlayerActivity.showV1321ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chord
    FeaturePrefsStore.batch1321.v1321chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1321: chrome mode
internal fun PlayerActivity.showV1321ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1321chrome
    FeaturePrefsStore.batch1321.v1321chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1321: church mode
internal fun PlayerActivity.showV1321ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1321church
    FeaturePrefsStore.batch1321.v1321church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1321: circle level
internal fun PlayerActivity.showV1321CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1321: city level
internal fun PlayerActivity.showV1321CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321city = value
        AppToast.show(this, "city: $value")
    }
}

// v1321: claim level
internal fun PlayerActivity.showV1321ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1321: clan level
internal fun PlayerActivity.showV1321ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1321: clash level
internal fun PlayerActivity.showV1321ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1321clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1321clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1321: class mode
internal fun PlayerActivity.showV1321ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1321class
    FeaturePrefsStore.batch1321.v1321class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1321: clause mode
internal fun PlayerActivity.showV1321ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clause
    FeaturePrefsStore.batch1321.v1321clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1321: clay mode
internal fun PlayerActivity.showV1321ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clay
    FeaturePrefsStore.batch1321.v1321clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1321: clerk mode
internal fun PlayerActivity.showV1321ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clerk
    FeaturePrefsStore.batch1321.v1321clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1321: clever mode
internal fun PlayerActivity.showV1321CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1321clever
    FeaturePrefsStore.batch1321.v1321clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1322: chip mode
internal fun PlayerActivity.showV1322ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chip
    FeaturePrefsStore.batch1321.v1322chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1322: choice mode
internal fun PlayerActivity.showV1322ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1322choice
    FeaturePrefsStore.batch1321.v1322choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1322: chord mode
internal fun PlayerActivity.showV1322ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chord
    FeaturePrefsStore.batch1321.v1322chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1322: chrome mode
internal fun PlayerActivity.showV1322ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1322chrome
    FeaturePrefsStore.batch1321.v1322chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1322: church mode
internal fun PlayerActivity.showV1322ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1322church
    FeaturePrefsStore.batch1321.v1322church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1322: circle level
internal fun PlayerActivity.showV1322CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1322: city level
internal fun PlayerActivity.showV1322CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322city = value
        AppToast.show(this, "city: $value")
    }
}

// v1322: claim level
internal fun PlayerActivity.showV1322ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1322: clan level
internal fun PlayerActivity.showV1322ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1322: clash level
internal fun PlayerActivity.showV1322ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1322clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1322clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1322: class mode
internal fun PlayerActivity.showV1322ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1322class
    FeaturePrefsStore.batch1321.v1322class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1322: clause mode
internal fun PlayerActivity.showV1322ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clause
    FeaturePrefsStore.batch1321.v1322clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1322: clay mode
internal fun PlayerActivity.showV1322ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clay
    FeaturePrefsStore.batch1321.v1322clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1322: clerk mode
internal fun PlayerActivity.showV1322ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clerk
    FeaturePrefsStore.batch1321.v1322clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1322: clever mode
internal fun PlayerActivity.showV1322CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1322clever
    FeaturePrefsStore.batch1321.v1322clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1323: chip mode
internal fun PlayerActivity.showV1323ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chip
    FeaturePrefsStore.batch1321.v1323chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1323: choice mode
internal fun PlayerActivity.showV1323ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1323choice
    FeaturePrefsStore.batch1321.v1323choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1323: chord mode
internal fun PlayerActivity.showV1323ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chord
    FeaturePrefsStore.batch1321.v1323chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1323: chrome mode
internal fun PlayerActivity.showV1323ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1323chrome
    FeaturePrefsStore.batch1321.v1323chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1323: church mode
internal fun PlayerActivity.showV1323ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1323church
    FeaturePrefsStore.batch1321.v1323church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1323: circle level
internal fun PlayerActivity.showV1323CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1323: city level
internal fun PlayerActivity.showV1323CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323city = value
        AppToast.show(this, "city: $value")
    }
}

// v1323: claim level
internal fun PlayerActivity.showV1323ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1323: clan level
internal fun PlayerActivity.showV1323ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1323: clash level
internal fun PlayerActivity.showV1323ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1323clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1323clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1323: class mode
internal fun PlayerActivity.showV1323ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1323class
    FeaturePrefsStore.batch1321.v1323class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1323: clause mode
internal fun PlayerActivity.showV1323ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clause
    FeaturePrefsStore.batch1321.v1323clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1323: clay mode
internal fun PlayerActivity.showV1323ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clay
    FeaturePrefsStore.batch1321.v1323clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1323: clerk mode
internal fun PlayerActivity.showV1323ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clerk
    FeaturePrefsStore.batch1321.v1323clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1323: clever mode
internal fun PlayerActivity.showV1323CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1323clever
    FeaturePrefsStore.batch1321.v1323clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1324: chip mode
internal fun PlayerActivity.showV1324ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chip
    FeaturePrefsStore.batch1321.v1324chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1324: choice mode
internal fun PlayerActivity.showV1324ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1324choice
    FeaturePrefsStore.batch1321.v1324choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1324: chord mode
internal fun PlayerActivity.showV1324ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chord
    FeaturePrefsStore.batch1321.v1324chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1324: chrome mode
internal fun PlayerActivity.showV1324ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1324chrome
    FeaturePrefsStore.batch1321.v1324chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1324: church mode
internal fun PlayerActivity.showV1324ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1324church
    FeaturePrefsStore.batch1321.v1324church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1324: circle level
internal fun PlayerActivity.showV1324CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1324: city level
internal fun PlayerActivity.showV1324CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324city = value
        AppToast.show(this, "city: $value")
    }
}

// v1324: claim level
internal fun PlayerActivity.showV1324ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1324: clan level
internal fun PlayerActivity.showV1324ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1324: clash level
internal fun PlayerActivity.showV1324ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1324clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1324clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1324: class mode
internal fun PlayerActivity.showV1324ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1324class
    FeaturePrefsStore.batch1321.v1324class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1324: clause mode
internal fun PlayerActivity.showV1324ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clause
    FeaturePrefsStore.batch1321.v1324clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1324: clay mode
internal fun PlayerActivity.showV1324ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clay
    FeaturePrefsStore.batch1321.v1324clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1324: clerk mode
internal fun PlayerActivity.showV1324ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clerk
    FeaturePrefsStore.batch1321.v1324clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1324: clever mode
internal fun PlayerActivity.showV1324CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1324clever
    FeaturePrefsStore.batch1321.v1324clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1325: chip mode
internal fun PlayerActivity.showV1325ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chip
    FeaturePrefsStore.batch1321.v1325chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1325: choice mode
internal fun PlayerActivity.showV1325ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1325choice
    FeaturePrefsStore.batch1321.v1325choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1325: chord mode
internal fun PlayerActivity.showV1325ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chord
    FeaturePrefsStore.batch1321.v1325chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1325: chrome mode
internal fun PlayerActivity.showV1325ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1325chrome
    FeaturePrefsStore.batch1321.v1325chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1325: church mode
internal fun PlayerActivity.showV1325ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1325church
    FeaturePrefsStore.batch1321.v1325church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1325: circle level
internal fun PlayerActivity.showV1325CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1325: city level
internal fun PlayerActivity.showV1325CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325city = value
        AppToast.show(this, "city: $value")
    }
}

// v1325: claim level
internal fun PlayerActivity.showV1325ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1325: clan level
internal fun PlayerActivity.showV1325ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1325: clash level
internal fun PlayerActivity.showV1325ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1325clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1325clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1325: class mode
internal fun PlayerActivity.showV1325ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1325class
    FeaturePrefsStore.batch1321.v1325class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1325: clause mode
internal fun PlayerActivity.showV1325ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clause
    FeaturePrefsStore.batch1321.v1325clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1325: clay mode
internal fun PlayerActivity.showV1325ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clay
    FeaturePrefsStore.batch1321.v1325clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1325: clerk mode
internal fun PlayerActivity.showV1325ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clerk
    FeaturePrefsStore.batch1321.v1325clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1325: clever mode
internal fun PlayerActivity.showV1325CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1325clever
    FeaturePrefsStore.batch1321.v1325clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1326: chip mode
internal fun PlayerActivity.showV1326ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chip
    FeaturePrefsStore.batch1321.v1326chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1326: choice mode
internal fun PlayerActivity.showV1326ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1326choice
    FeaturePrefsStore.batch1321.v1326choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1326: chord mode
internal fun PlayerActivity.showV1326ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chord
    FeaturePrefsStore.batch1321.v1326chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1326: chrome mode
internal fun PlayerActivity.showV1326ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1326chrome
    FeaturePrefsStore.batch1321.v1326chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1326: church mode
internal fun PlayerActivity.showV1326ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1326church
    FeaturePrefsStore.batch1321.v1326church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1326: circle level
internal fun PlayerActivity.showV1326CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1326: city level
internal fun PlayerActivity.showV1326CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326city = value
        AppToast.show(this, "city: $value")
    }
}

// v1326: claim level
internal fun PlayerActivity.showV1326ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1326: clan level
internal fun PlayerActivity.showV1326ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1326: clash level
internal fun PlayerActivity.showV1326ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1326clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1326clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1326: class mode
internal fun PlayerActivity.showV1326ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1326class
    FeaturePrefsStore.batch1321.v1326class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1326: clause mode
internal fun PlayerActivity.showV1326ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clause
    FeaturePrefsStore.batch1321.v1326clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1326: clay mode
internal fun PlayerActivity.showV1326ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clay
    FeaturePrefsStore.batch1321.v1326clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1326: clerk mode
internal fun PlayerActivity.showV1326ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clerk
    FeaturePrefsStore.batch1321.v1326clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1326: clever mode
internal fun PlayerActivity.showV1326CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1326clever
    FeaturePrefsStore.batch1321.v1326clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1327: chip mode
internal fun PlayerActivity.showV1327ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chip
    FeaturePrefsStore.batch1321.v1327chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1327: choice mode
internal fun PlayerActivity.showV1327ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1327choice
    FeaturePrefsStore.batch1321.v1327choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1327: chord mode
internal fun PlayerActivity.showV1327ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chord
    FeaturePrefsStore.batch1321.v1327chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1327: chrome mode
internal fun PlayerActivity.showV1327ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1327chrome
    FeaturePrefsStore.batch1321.v1327chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1327: church mode
internal fun PlayerActivity.showV1327ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1327church
    FeaturePrefsStore.batch1321.v1327church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1327: circle level
internal fun PlayerActivity.showV1327CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1327: city level
internal fun PlayerActivity.showV1327CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327city = value
        AppToast.show(this, "city: $value")
    }
}

// v1327: claim level
internal fun PlayerActivity.showV1327ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1327: clan level
internal fun PlayerActivity.showV1327ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1327: clash level
internal fun PlayerActivity.showV1327ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1327clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1327clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1327: class mode
internal fun PlayerActivity.showV1327ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1327class
    FeaturePrefsStore.batch1321.v1327class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1327: clause mode
internal fun PlayerActivity.showV1327ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clause
    FeaturePrefsStore.batch1321.v1327clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1327: clay mode
internal fun PlayerActivity.showV1327ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clay
    FeaturePrefsStore.batch1321.v1327clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1327: clerk mode
internal fun PlayerActivity.showV1327ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clerk
    FeaturePrefsStore.batch1321.v1327clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1327: clever mode
internal fun PlayerActivity.showV1327CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1327clever
    FeaturePrefsStore.batch1321.v1327clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1328: chip mode
internal fun PlayerActivity.showV1328ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chip
    FeaturePrefsStore.batch1321.v1328chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1328: choice mode
internal fun PlayerActivity.showV1328ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1328choice
    FeaturePrefsStore.batch1321.v1328choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1328: chord mode
internal fun PlayerActivity.showV1328ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chord
    FeaturePrefsStore.batch1321.v1328chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1328: chrome mode
internal fun PlayerActivity.showV1328ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1328chrome
    FeaturePrefsStore.batch1321.v1328chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1328: church mode
internal fun PlayerActivity.showV1328ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1328church
    FeaturePrefsStore.batch1321.v1328church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1328: circle level
internal fun PlayerActivity.showV1328CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1328: city level
internal fun PlayerActivity.showV1328CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328city = value
        AppToast.show(this, "city: $value")
    }
}

// v1328: claim level
internal fun PlayerActivity.showV1328ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1328: clan level
internal fun PlayerActivity.showV1328ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1328: clash level
internal fun PlayerActivity.showV1328ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1328clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1328clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1328: class mode
internal fun PlayerActivity.showV1328ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1328class
    FeaturePrefsStore.batch1321.v1328class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1328: clause mode
internal fun PlayerActivity.showV1328ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clause
    FeaturePrefsStore.batch1321.v1328clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1328: clay mode
internal fun PlayerActivity.showV1328ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clay
    FeaturePrefsStore.batch1321.v1328clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1328: clerk mode
internal fun PlayerActivity.showV1328ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clerk
    FeaturePrefsStore.batch1321.v1328clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1328: clever mode
internal fun PlayerActivity.showV1328CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1328clever
    FeaturePrefsStore.batch1321.v1328clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1329: chip mode
internal fun PlayerActivity.showV1329ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chip
    FeaturePrefsStore.batch1321.v1329chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1329: choice mode
internal fun PlayerActivity.showV1329ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1329choice
    FeaturePrefsStore.batch1321.v1329choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1329: chord mode
internal fun PlayerActivity.showV1329ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chord
    FeaturePrefsStore.batch1321.v1329chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1329: chrome mode
internal fun PlayerActivity.showV1329ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1329chrome
    FeaturePrefsStore.batch1321.v1329chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1329: church mode
internal fun PlayerActivity.showV1329ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1329church
    FeaturePrefsStore.batch1321.v1329church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1329: circle level
internal fun PlayerActivity.showV1329CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1329: city level
internal fun PlayerActivity.showV1329CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329city = value
        AppToast.show(this, "city: $value")
    }
}

// v1329: claim level
internal fun PlayerActivity.showV1329ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1329: clan level
internal fun PlayerActivity.showV1329ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1329: clash level
internal fun PlayerActivity.showV1329ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1329clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1329clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1329: class mode
internal fun PlayerActivity.showV1329ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1329class
    FeaturePrefsStore.batch1321.v1329class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1329: clause mode
internal fun PlayerActivity.showV1329ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clause
    FeaturePrefsStore.batch1321.v1329clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1329: clay mode
internal fun PlayerActivity.showV1329ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clay
    FeaturePrefsStore.batch1321.v1329clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1329: clerk mode
internal fun PlayerActivity.showV1329ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clerk
    FeaturePrefsStore.batch1321.v1329clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1329: clever mode
internal fun PlayerActivity.showV1329CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1329clever
    FeaturePrefsStore.batch1321.v1329clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1330: chip mode
internal fun PlayerActivity.showV1330ChipToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chip
    FeaturePrefsStore.batch1321.v1330chip = !current
    AppToast.show(this, "chip: ${if (!current) "ON" else "OFF"}")
}

// v1330: choice mode
internal fun PlayerActivity.showV1330ChoiceToggle() {
    val current = FeaturePrefsStore.batch1321.v1330choice
    FeaturePrefsStore.batch1321.v1330choice = !current
    AppToast.show(this, "choice: ${if (!current) "ON" else "OFF"}")
}

// v1330: chord mode
internal fun PlayerActivity.showV1330ChordToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chord
    FeaturePrefsStore.batch1321.v1330chord = !current
    AppToast.show(this, "chord: ${if (!current) "ON" else "OFF"}")
}

// v1330: chrome mode
internal fun PlayerActivity.showV1330ChromeToggle() {
    val current = FeaturePrefsStore.batch1321.v1330chrome
    FeaturePrefsStore.batch1321.v1330chrome = !current
    AppToast.show(this, "chrome: ${if (!current) "ON" else "OFF"}")
}

// v1330: church mode
internal fun PlayerActivity.showV1330ChurchToggle() {
    val current = FeaturePrefsStore.batch1321.v1330church
    FeaturePrefsStore.batch1321.v1330church = !current
    AppToast.show(this, "church: ${if (!current) "ON" else "OFF"}")
}

// v1330: circle level
internal fun PlayerActivity.showV1330CircleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330circle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "circle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330circle = value
        AppToast.show(this, "circle: $value")
    }
}

// v1330: city level
internal fun PlayerActivity.showV1330CityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330city).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "city level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330city = value
        AppToast.show(this, "city: $value")
    }
}

// v1330: claim level
internal fun PlayerActivity.showV1330ClaimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330claim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "claim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330claim = value
        AppToast.show(this, "claim: $value")
    }
}

// v1330: clan level
internal fun PlayerActivity.showV1330ClanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330clan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330clan = value
        AppToast.show(this, "clan: $value")
    }
}

// v1330: clash level
internal fun PlayerActivity.showV1330ClashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1321.v1330clash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1321.v1330clash = value
        AppToast.show(this, "clash: $value")
    }
}

// v1330: class mode
internal fun PlayerActivity.showV1330ClassToggle() {
    val current = FeaturePrefsStore.batch1321.v1330class
    FeaturePrefsStore.batch1321.v1330class = !current
    AppToast.show(this, "class: ${if (!current) "ON" else "OFF"}")
}

// v1330: clause mode
internal fun PlayerActivity.showV1330ClauseToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clause
    FeaturePrefsStore.batch1321.v1330clause = !current
    AppToast.show(this, "clause: ${if (!current) "ON" else "OFF"}")
}

// v1330: clay mode
internal fun PlayerActivity.showV1330ClayToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clay
    FeaturePrefsStore.batch1321.v1330clay = !current
    AppToast.show(this, "clay: ${if (!current) "ON" else "OFF"}")
}

// v1330: clerk mode
internal fun PlayerActivity.showV1330ClerkToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clerk
    FeaturePrefsStore.batch1321.v1330clerk = !current
    AppToast.show(this, "clerk: ${if (!current) "ON" else "OFF"}")
}

// v1330: clever mode
internal fun PlayerActivity.showV1330CleverToggle() {
    val current = FeaturePrefsStore.batch1321.v1330clever
    FeaturePrefsStore.batch1321.v1330clever = !current
    AppToast.show(this, "clever: ${if (!current) "ON" else "OFF"}")
}

// v1331: cliff mode
internal fun PlayerActivity.showV1331CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cliff
    FeaturePrefsStore.batch1331.v1331cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1331: climb mode
internal fun PlayerActivity.showV1331ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1331climb
    FeaturePrefsStore.batch1331.v1331climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1331: cling mode
internal fun PlayerActivity.showV1331ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cling
    FeaturePrefsStore.batch1331.v1331cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1331: clock mode
internal fun PlayerActivity.showV1331ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1331clock
    FeaturePrefsStore.batch1331.v1331clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1331: cloth mode
internal fun PlayerActivity.showV1331ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1331cloth
    FeaturePrefsStore.batch1331.v1331cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1331: cloud level
internal fun PlayerActivity.showV1331CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1331: clown level
internal fun PlayerActivity.showV1331ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1331: club level
internal fun PlayerActivity.showV1331ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331club = value
        AppToast.show(this, "club: $value")
    }
}

// v1331: clue level
internal fun PlayerActivity.showV1331ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1331: coach level
internal fun PlayerActivity.showV1331CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1331coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1331coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1331: coast mode
internal fun PlayerActivity.showV1331CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coast
    FeaturePrefsStore.batch1331.v1331coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1331: coat mode
internal fun PlayerActivity.showV1331CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coat
    FeaturePrefsStore.batch1331.v1331coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1331: coffee mode
internal fun PlayerActivity.showV1331CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coffee
    FeaturePrefsStore.batch1331.v1331coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1331: coil mode
internal fun PlayerActivity.showV1331CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coil
    FeaturePrefsStore.batch1331.v1331coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1331: coin mode
internal fun PlayerActivity.showV1331CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1331coin
    FeaturePrefsStore.batch1331.v1331coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1332: cliff mode
internal fun PlayerActivity.showV1332CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cliff
    FeaturePrefsStore.batch1331.v1332cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1332: climb mode
internal fun PlayerActivity.showV1332ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1332climb
    FeaturePrefsStore.batch1331.v1332climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1332: cling mode
internal fun PlayerActivity.showV1332ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cling
    FeaturePrefsStore.batch1331.v1332cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1332: clock mode
internal fun PlayerActivity.showV1332ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1332clock
    FeaturePrefsStore.batch1331.v1332clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1332: cloth mode
internal fun PlayerActivity.showV1332ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1332cloth
    FeaturePrefsStore.batch1331.v1332cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1332: cloud level
internal fun PlayerActivity.showV1332CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1332: clown level
internal fun PlayerActivity.showV1332ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1332: club level
internal fun PlayerActivity.showV1332ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332club = value
        AppToast.show(this, "club: $value")
    }
}

// v1332: clue level
internal fun PlayerActivity.showV1332ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1332: coach level
internal fun PlayerActivity.showV1332CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1332coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1332coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1332: coast mode
internal fun PlayerActivity.showV1332CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coast
    FeaturePrefsStore.batch1331.v1332coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1332: coat mode
internal fun PlayerActivity.showV1332CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coat
    FeaturePrefsStore.batch1331.v1332coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1332: coffee mode
internal fun PlayerActivity.showV1332CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coffee
    FeaturePrefsStore.batch1331.v1332coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1332: coil mode
internal fun PlayerActivity.showV1332CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coil
    FeaturePrefsStore.batch1331.v1332coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1332: coin mode
internal fun PlayerActivity.showV1332CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1332coin
    FeaturePrefsStore.batch1331.v1332coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1333: cliff mode
internal fun PlayerActivity.showV1333CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cliff
    FeaturePrefsStore.batch1331.v1333cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1333: climb mode
internal fun PlayerActivity.showV1333ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1333climb
    FeaturePrefsStore.batch1331.v1333climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1333: cling mode
internal fun PlayerActivity.showV1333ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cling
    FeaturePrefsStore.batch1331.v1333cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1333: clock mode
internal fun PlayerActivity.showV1333ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1333clock
    FeaturePrefsStore.batch1331.v1333clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1333: cloth mode
internal fun PlayerActivity.showV1333ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1333cloth
    FeaturePrefsStore.batch1331.v1333cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1333: cloud level
internal fun PlayerActivity.showV1333CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1333: clown level
internal fun PlayerActivity.showV1333ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1333: club level
internal fun PlayerActivity.showV1333ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333club = value
        AppToast.show(this, "club: $value")
    }
}

// v1333: clue level
internal fun PlayerActivity.showV1333ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1333: coach level
internal fun PlayerActivity.showV1333CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1333coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1333coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1333: coast mode
internal fun PlayerActivity.showV1333CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coast
    FeaturePrefsStore.batch1331.v1333coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1333: coat mode
internal fun PlayerActivity.showV1333CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coat
    FeaturePrefsStore.batch1331.v1333coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1333: coffee mode
internal fun PlayerActivity.showV1333CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coffee
    FeaturePrefsStore.batch1331.v1333coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1333: coil mode
internal fun PlayerActivity.showV1333CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coil
    FeaturePrefsStore.batch1331.v1333coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1333: coin mode
internal fun PlayerActivity.showV1333CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1333coin
    FeaturePrefsStore.batch1331.v1333coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1334: cliff mode
internal fun PlayerActivity.showV1334CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cliff
    FeaturePrefsStore.batch1331.v1334cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1334: climb mode
internal fun PlayerActivity.showV1334ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1334climb
    FeaturePrefsStore.batch1331.v1334climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1334: cling mode
internal fun PlayerActivity.showV1334ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cling
    FeaturePrefsStore.batch1331.v1334cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1334: clock mode
internal fun PlayerActivity.showV1334ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1334clock
    FeaturePrefsStore.batch1331.v1334clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1334: cloth mode
internal fun PlayerActivity.showV1334ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1334cloth
    FeaturePrefsStore.batch1331.v1334cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1334: cloud level
internal fun PlayerActivity.showV1334CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1334: clown level
internal fun PlayerActivity.showV1334ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1334: club level
internal fun PlayerActivity.showV1334ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334club = value
        AppToast.show(this, "club: $value")
    }
}

// v1334: clue level
internal fun PlayerActivity.showV1334ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1334: coach level
internal fun PlayerActivity.showV1334CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1334coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1334coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1334: coast mode
internal fun PlayerActivity.showV1334CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coast
    FeaturePrefsStore.batch1331.v1334coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1334: coat mode
internal fun PlayerActivity.showV1334CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coat
    FeaturePrefsStore.batch1331.v1334coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1334: coffee mode
internal fun PlayerActivity.showV1334CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coffee
    FeaturePrefsStore.batch1331.v1334coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1334: coil mode
internal fun PlayerActivity.showV1334CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coil
    FeaturePrefsStore.batch1331.v1334coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1334: coin mode
internal fun PlayerActivity.showV1334CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1334coin
    FeaturePrefsStore.batch1331.v1334coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1335: cliff mode
internal fun PlayerActivity.showV1335CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cliff
    FeaturePrefsStore.batch1331.v1335cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1335: climb mode
internal fun PlayerActivity.showV1335ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1335climb
    FeaturePrefsStore.batch1331.v1335climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1335: cling mode
internal fun PlayerActivity.showV1335ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cling
    FeaturePrefsStore.batch1331.v1335cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1335: clock mode
internal fun PlayerActivity.showV1335ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1335clock
    FeaturePrefsStore.batch1331.v1335clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1335: cloth mode
internal fun PlayerActivity.showV1335ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1335cloth
    FeaturePrefsStore.batch1331.v1335cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1335: cloud level
internal fun PlayerActivity.showV1335CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1335: clown level
internal fun PlayerActivity.showV1335ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1335: club level
internal fun PlayerActivity.showV1335ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335club = value
        AppToast.show(this, "club: $value")
    }
}

// v1335: clue level
internal fun PlayerActivity.showV1335ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1335: coach level
internal fun PlayerActivity.showV1335CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1335coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1335coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1335: coast mode
internal fun PlayerActivity.showV1335CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coast
    FeaturePrefsStore.batch1331.v1335coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1335: coat mode
internal fun PlayerActivity.showV1335CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coat
    FeaturePrefsStore.batch1331.v1335coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1335: coffee mode
internal fun PlayerActivity.showV1335CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coffee
    FeaturePrefsStore.batch1331.v1335coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1335: coil mode
internal fun PlayerActivity.showV1335CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coil
    FeaturePrefsStore.batch1331.v1335coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1335: coin mode
internal fun PlayerActivity.showV1335CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1335coin
    FeaturePrefsStore.batch1331.v1335coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1336: cliff mode
internal fun PlayerActivity.showV1336CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cliff
    FeaturePrefsStore.batch1331.v1336cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1336: climb mode
internal fun PlayerActivity.showV1336ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1336climb
    FeaturePrefsStore.batch1331.v1336climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1336: cling mode
internal fun PlayerActivity.showV1336ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cling
    FeaturePrefsStore.batch1331.v1336cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1336: clock mode
internal fun PlayerActivity.showV1336ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1336clock
    FeaturePrefsStore.batch1331.v1336clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1336: cloth mode
internal fun PlayerActivity.showV1336ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1336cloth
    FeaturePrefsStore.batch1331.v1336cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1336: cloud level
internal fun PlayerActivity.showV1336CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1336: clown level
internal fun PlayerActivity.showV1336ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1336: club level
internal fun PlayerActivity.showV1336ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336club = value
        AppToast.show(this, "club: $value")
    }
}

// v1336: clue level
internal fun PlayerActivity.showV1336ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1336: coach level
internal fun PlayerActivity.showV1336CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1336coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1336coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1336: coast mode
internal fun PlayerActivity.showV1336CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coast
    FeaturePrefsStore.batch1331.v1336coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1336: coat mode
internal fun PlayerActivity.showV1336CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coat
    FeaturePrefsStore.batch1331.v1336coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1336: coffee mode
internal fun PlayerActivity.showV1336CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coffee
    FeaturePrefsStore.batch1331.v1336coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1336: coil mode
internal fun PlayerActivity.showV1336CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coil
    FeaturePrefsStore.batch1331.v1336coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1336: coin mode
internal fun PlayerActivity.showV1336CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1336coin
    FeaturePrefsStore.batch1331.v1336coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1337: cliff mode
internal fun PlayerActivity.showV1337CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cliff
    FeaturePrefsStore.batch1331.v1337cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1337: climb mode
internal fun PlayerActivity.showV1337ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1337climb
    FeaturePrefsStore.batch1331.v1337climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1337: cling mode
internal fun PlayerActivity.showV1337ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cling
    FeaturePrefsStore.batch1331.v1337cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1337: clock mode
internal fun PlayerActivity.showV1337ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1337clock
    FeaturePrefsStore.batch1331.v1337clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1337: cloth mode
internal fun PlayerActivity.showV1337ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1337cloth
    FeaturePrefsStore.batch1331.v1337cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1337: cloud level
internal fun PlayerActivity.showV1337CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1337: clown level
internal fun PlayerActivity.showV1337ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1337: club level
internal fun PlayerActivity.showV1337ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337club = value
        AppToast.show(this, "club: $value")
    }
}

// v1337: clue level
internal fun PlayerActivity.showV1337ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1337: coach level
internal fun PlayerActivity.showV1337CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1337coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1337coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1337: coast mode
internal fun PlayerActivity.showV1337CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coast
    FeaturePrefsStore.batch1331.v1337coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1337: coat mode
internal fun PlayerActivity.showV1337CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coat
    FeaturePrefsStore.batch1331.v1337coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1337: coffee mode
internal fun PlayerActivity.showV1337CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coffee
    FeaturePrefsStore.batch1331.v1337coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1337: coil mode
internal fun PlayerActivity.showV1337CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coil
    FeaturePrefsStore.batch1331.v1337coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1337: coin mode
internal fun PlayerActivity.showV1337CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1337coin
    FeaturePrefsStore.batch1331.v1337coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1338: cliff mode
internal fun PlayerActivity.showV1338CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cliff
    FeaturePrefsStore.batch1331.v1338cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1338: climb mode
internal fun PlayerActivity.showV1338ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1338climb
    FeaturePrefsStore.batch1331.v1338climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1338: cling mode
internal fun PlayerActivity.showV1338ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cling
    FeaturePrefsStore.batch1331.v1338cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1338: clock mode
internal fun PlayerActivity.showV1338ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1338clock
    FeaturePrefsStore.batch1331.v1338clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1338: cloth mode
internal fun PlayerActivity.showV1338ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1338cloth
    FeaturePrefsStore.batch1331.v1338cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1338: cloud level
internal fun PlayerActivity.showV1338CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1338: clown level
internal fun PlayerActivity.showV1338ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1338: club level
internal fun PlayerActivity.showV1338ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338club = value
        AppToast.show(this, "club: $value")
    }
}

// v1338: clue level
internal fun PlayerActivity.showV1338ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1338: coach level
internal fun PlayerActivity.showV1338CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1338coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1338coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1338: coast mode
internal fun PlayerActivity.showV1338CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coast
    FeaturePrefsStore.batch1331.v1338coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1338: coat mode
internal fun PlayerActivity.showV1338CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coat
    FeaturePrefsStore.batch1331.v1338coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1338: coffee mode
internal fun PlayerActivity.showV1338CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coffee
    FeaturePrefsStore.batch1331.v1338coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1338: coil mode
internal fun PlayerActivity.showV1338CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coil
    FeaturePrefsStore.batch1331.v1338coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1338: coin mode
internal fun PlayerActivity.showV1338CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1338coin
    FeaturePrefsStore.batch1331.v1338coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1339: cliff mode
internal fun PlayerActivity.showV1339CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cliff
    FeaturePrefsStore.batch1331.v1339cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1339: climb mode
internal fun PlayerActivity.showV1339ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1339climb
    FeaturePrefsStore.batch1331.v1339climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1339: cling mode
internal fun PlayerActivity.showV1339ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cling
    FeaturePrefsStore.batch1331.v1339cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1339: clock mode
internal fun PlayerActivity.showV1339ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1339clock
    FeaturePrefsStore.batch1331.v1339clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1339: cloth mode
internal fun PlayerActivity.showV1339ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1339cloth
    FeaturePrefsStore.batch1331.v1339cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1339: cloud level
internal fun PlayerActivity.showV1339CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1339: clown level
internal fun PlayerActivity.showV1339ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1339: club level
internal fun PlayerActivity.showV1339ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339club = value
        AppToast.show(this, "club: $value")
    }
}

// v1339: clue level
internal fun PlayerActivity.showV1339ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1339: coach level
internal fun PlayerActivity.showV1339CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1339coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1339coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1339: coast mode
internal fun PlayerActivity.showV1339CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coast
    FeaturePrefsStore.batch1331.v1339coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1339: coat mode
internal fun PlayerActivity.showV1339CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coat
    FeaturePrefsStore.batch1331.v1339coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1339: coffee mode
internal fun PlayerActivity.showV1339CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coffee
    FeaturePrefsStore.batch1331.v1339coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1339: coil mode
internal fun PlayerActivity.showV1339CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coil
    FeaturePrefsStore.batch1331.v1339coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1339: coin mode
internal fun PlayerActivity.showV1339CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1339coin
    FeaturePrefsStore.batch1331.v1339coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1340: cliff mode
internal fun PlayerActivity.showV1340CliffToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cliff
    FeaturePrefsStore.batch1331.v1340cliff = !current
    AppToast.show(this, "cliff: ${if (!current) "ON" else "OFF"}")
}

// v1340: climb mode
internal fun PlayerActivity.showV1340ClimbToggle() {
    val current = FeaturePrefsStore.batch1331.v1340climb
    FeaturePrefsStore.batch1331.v1340climb = !current
    AppToast.show(this, "climb: ${if (!current) "ON" else "OFF"}")
}

// v1340: cling mode
internal fun PlayerActivity.showV1340ClingToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cling
    FeaturePrefsStore.batch1331.v1340cling = !current
    AppToast.show(this, "cling: ${if (!current) "ON" else "OFF"}")
}

// v1340: clock mode
internal fun PlayerActivity.showV1340ClockToggle() {
    val current = FeaturePrefsStore.batch1331.v1340clock
    FeaturePrefsStore.batch1331.v1340clock = !current
    AppToast.show(this, "clock: ${if (!current) "ON" else "OFF"}")
}

// v1340: cloth mode
internal fun PlayerActivity.showV1340ClothToggle() {
    val current = FeaturePrefsStore.batch1331.v1340cloth
    FeaturePrefsStore.batch1331.v1340cloth = !current
    AppToast.show(this, "cloth: ${if (!current) "ON" else "OFF"}")
}

// v1340: cloud level
internal fun PlayerActivity.showV1340CloudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340cloud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cloud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340cloud = value
        AppToast.show(this, "cloud: $value")
    }
}

// v1340: clown level
internal fun PlayerActivity.showV1340ClownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340clown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340clown = value
        AppToast.show(this, "clown: $value")
    }
}

// v1340: club level
internal fun PlayerActivity.showV1340ClubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340club).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "club level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340club = value
        AppToast.show(this, "club: $value")
    }
}

// v1340: clue level
internal fun PlayerActivity.showV1340ClueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340clue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "clue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340clue = value
        AppToast.show(this, "clue: $value")
    }
}

// v1340: coach level
internal fun PlayerActivity.showV1340CoachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1331.v1340coach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1331.v1340coach = value
        AppToast.show(this, "coach: $value")
    }
}

// v1340: coast mode
internal fun PlayerActivity.showV1340CoastToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coast
    FeaturePrefsStore.batch1331.v1340coast = !current
    AppToast.show(this, "coast: ${if (!current) "ON" else "OFF"}")
}

// v1340: coat mode
internal fun PlayerActivity.showV1340CoatToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coat
    FeaturePrefsStore.batch1331.v1340coat = !current
    AppToast.show(this, "coat: ${if (!current) "ON" else "OFF"}")
}

// v1340: coffee mode
internal fun PlayerActivity.showV1340CoffeeToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coffee
    FeaturePrefsStore.batch1331.v1340coffee = !current
    AppToast.show(this, "coffee: ${if (!current) "ON" else "OFF"}")
}

// v1340: coil mode
internal fun PlayerActivity.showV1340CoilToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coil
    FeaturePrefsStore.batch1331.v1340coil = !current
    AppToast.show(this, "coil: ${if (!current) "ON" else "OFF"}")
}

// v1340: coin mode
internal fun PlayerActivity.showV1340CoinToggle() {
    val current = FeaturePrefsStore.batch1331.v1340coin
    FeaturePrefsStore.batch1331.v1340coin = !current
    AppToast.show(this, "coin: ${if (!current) "ON" else "OFF"}")
}

// v1341: cold mode
internal fun PlayerActivity.showV1341ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cold
    FeaturePrefsStore.batch1341.v1341cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1341: collar mode
internal fun PlayerActivity.showV1341CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1341collar
    FeaturePrefsStore.batch1341.v1341collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1341: colony mode
internal fun PlayerActivity.showV1341ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1341colony
    FeaturePrefsStore.batch1341.v1341colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1341: color mode
internal fun PlayerActivity.showV1341ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1341color
    FeaturePrefsStore.batch1341.v1341color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1341: combat mode
internal fun PlayerActivity.showV1341CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1341combat
    FeaturePrefsStore.batch1341.v1341combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1341: comedy level
internal fun PlayerActivity.showV1341ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1341: comic level
internal fun PlayerActivity.showV1341ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1341: common level
internal fun PlayerActivity.showV1341CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341common = value
        AppToast.show(this, "common: $value")
    }
}

// v1341: convey level
internal fun PlayerActivity.showV1341ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1341: cook level
internal fun PlayerActivity.showV1341CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1341cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1341cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1341: cool mode
internal fun PlayerActivity.showV1341CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cool
    FeaturePrefsStore.batch1341.v1341cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1341: copper mode
internal fun PlayerActivity.showV1341CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1341copper
    FeaturePrefsStore.batch1341.v1341copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1341: cord mode
internal fun PlayerActivity.showV1341CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1341cord
    FeaturePrefsStore.batch1341.v1341cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1341: corn mode
internal fun PlayerActivity.showV1341CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1341corn
    FeaturePrefsStore.batch1341.v1341corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1341: corner mode
internal fun PlayerActivity.showV1341CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1341corner
    FeaturePrefsStore.batch1341.v1341corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1342: cold mode
internal fun PlayerActivity.showV1342ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cold
    FeaturePrefsStore.batch1341.v1342cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1342: collar mode
internal fun PlayerActivity.showV1342CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1342collar
    FeaturePrefsStore.batch1341.v1342collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1342: colony mode
internal fun PlayerActivity.showV1342ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1342colony
    FeaturePrefsStore.batch1341.v1342colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1342: color mode
internal fun PlayerActivity.showV1342ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1342color
    FeaturePrefsStore.batch1341.v1342color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1342: combat mode
internal fun PlayerActivity.showV1342CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1342combat
    FeaturePrefsStore.batch1341.v1342combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1342: comedy level
internal fun PlayerActivity.showV1342ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1342: comic level
internal fun PlayerActivity.showV1342ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1342: common level
internal fun PlayerActivity.showV1342CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342common = value
        AppToast.show(this, "common: $value")
    }
}

// v1342: convey level
internal fun PlayerActivity.showV1342ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1342: cook level
internal fun PlayerActivity.showV1342CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1342cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1342cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1342: cool mode
internal fun PlayerActivity.showV1342CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cool
    FeaturePrefsStore.batch1341.v1342cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1342: copper mode
internal fun PlayerActivity.showV1342CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1342copper
    FeaturePrefsStore.batch1341.v1342copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1342: cord mode
internal fun PlayerActivity.showV1342CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1342cord
    FeaturePrefsStore.batch1341.v1342cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1342: corn mode
internal fun PlayerActivity.showV1342CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1342corn
    FeaturePrefsStore.batch1341.v1342corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1342: corner mode
internal fun PlayerActivity.showV1342CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1342corner
    FeaturePrefsStore.batch1341.v1342corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1343: cold mode
internal fun PlayerActivity.showV1343ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cold
    FeaturePrefsStore.batch1341.v1343cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1343: collar mode
internal fun PlayerActivity.showV1343CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1343collar
    FeaturePrefsStore.batch1341.v1343collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1343: colony mode
internal fun PlayerActivity.showV1343ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1343colony
    FeaturePrefsStore.batch1341.v1343colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1343: color mode
internal fun PlayerActivity.showV1343ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1343color
    FeaturePrefsStore.batch1341.v1343color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1343: combat mode
internal fun PlayerActivity.showV1343CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1343combat
    FeaturePrefsStore.batch1341.v1343combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1343: comedy level
internal fun PlayerActivity.showV1343ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1343: comic level
internal fun PlayerActivity.showV1343ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1343: common level
internal fun PlayerActivity.showV1343CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343common = value
        AppToast.show(this, "common: $value")
    }
}

// v1343: convey level
internal fun PlayerActivity.showV1343ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1343: cook level
internal fun PlayerActivity.showV1343CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1343cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1343cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1343: cool mode
internal fun PlayerActivity.showV1343CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cool
    FeaturePrefsStore.batch1341.v1343cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1343: copper mode
internal fun PlayerActivity.showV1343CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1343copper
    FeaturePrefsStore.batch1341.v1343copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1343: cord mode
internal fun PlayerActivity.showV1343CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1343cord
    FeaturePrefsStore.batch1341.v1343cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1343: corn mode
internal fun PlayerActivity.showV1343CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1343corn
    FeaturePrefsStore.batch1341.v1343corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1343: corner mode
internal fun PlayerActivity.showV1343CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1343corner
    FeaturePrefsStore.batch1341.v1343corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1344: cold mode
internal fun PlayerActivity.showV1344ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cold
    FeaturePrefsStore.batch1341.v1344cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1344: collar mode
internal fun PlayerActivity.showV1344CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1344collar
    FeaturePrefsStore.batch1341.v1344collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1344: colony mode
internal fun PlayerActivity.showV1344ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1344colony
    FeaturePrefsStore.batch1341.v1344colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1344: color mode
internal fun PlayerActivity.showV1344ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1344color
    FeaturePrefsStore.batch1341.v1344color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1344: combat mode
internal fun PlayerActivity.showV1344CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1344combat
    FeaturePrefsStore.batch1341.v1344combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1344: comedy level
internal fun PlayerActivity.showV1344ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1344: comic level
internal fun PlayerActivity.showV1344ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1344: common level
internal fun PlayerActivity.showV1344CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344common = value
        AppToast.show(this, "common: $value")
    }
}

// v1344: convey level
internal fun PlayerActivity.showV1344ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1344: cook level
internal fun PlayerActivity.showV1344CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1344cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1344cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1344: cool mode
internal fun PlayerActivity.showV1344CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cool
    FeaturePrefsStore.batch1341.v1344cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1344: copper mode
internal fun PlayerActivity.showV1344CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1344copper
    FeaturePrefsStore.batch1341.v1344copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1344: cord mode
internal fun PlayerActivity.showV1344CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1344cord
    FeaturePrefsStore.batch1341.v1344cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1344: corn mode
internal fun PlayerActivity.showV1344CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1344corn
    FeaturePrefsStore.batch1341.v1344corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1344: corner mode
internal fun PlayerActivity.showV1344CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1344corner
    FeaturePrefsStore.batch1341.v1344corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1345: cold mode
internal fun PlayerActivity.showV1345ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cold
    FeaturePrefsStore.batch1341.v1345cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1345: collar mode
internal fun PlayerActivity.showV1345CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1345collar
    FeaturePrefsStore.batch1341.v1345collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1345: colony mode
internal fun PlayerActivity.showV1345ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1345colony
    FeaturePrefsStore.batch1341.v1345colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1345: color mode
internal fun PlayerActivity.showV1345ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1345color
    FeaturePrefsStore.batch1341.v1345color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1345: combat mode
internal fun PlayerActivity.showV1345CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1345combat
    FeaturePrefsStore.batch1341.v1345combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1345: comedy level
internal fun PlayerActivity.showV1345ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1345: comic level
internal fun PlayerActivity.showV1345ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1345: common level
internal fun PlayerActivity.showV1345CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345common = value
        AppToast.show(this, "common: $value")
    }
}

// v1345: convey level
internal fun PlayerActivity.showV1345ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1345: cook level
internal fun PlayerActivity.showV1345CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1345cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1345cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1345: cool mode
internal fun PlayerActivity.showV1345CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cool
    FeaturePrefsStore.batch1341.v1345cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1345: copper mode
internal fun PlayerActivity.showV1345CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1345copper
    FeaturePrefsStore.batch1341.v1345copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1345: cord mode
internal fun PlayerActivity.showV1345CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1345cord
    FeaturePrefsStore.batch1341.v1345cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1345: corn mode
internal fun PlayerActivity.showV1345CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1345corn
    FeaturePrefsStore.batch1341.v1345corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1345: corner mode
internal fun PlayerActivity.showV1345CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1345corner
    FeaturePrefsStore.batch1341.v1345corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1346: cold mode
internal fun PlayerActivity.showV1346ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cold
    FeaturePrefsStore.batch1341.v1346cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1346: collar mode
internal fun PlayerActivity.showV1346CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1346collar
    FeaturePrefsStore.batch1341.v1346collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1346: colony mode
internal fun PlayerActivity.showV1346ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1346colony
    FeaturePrefsStore.batch1341.v1346colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1346: color mode
internal fun PlayerActivity.showV1346ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1346color
    FeaturePrefsStore.batch1341.v1346color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1346: combat mode
internal fun PlayerActivity.showV1346CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1346combat
    FeaturePrefsStore.batch1341.v1346combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1346: comedy level
internal fun PlayerActivity.showV1346ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1346: comic level
internal fun PlayerActivity.showV1346ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1346: common level
internal fun PlayerActivity.showV1346CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346common = value
        AppToast.show(this, "common: $value")
    }
}

// v1346: convey level
internal fun PlayerActivity.showV1346ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1346: cook level
internal fun PlayerActivity.showV1346CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1346cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1346cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1346: cool mode
internal fun PlayerActivity.showV1346CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cool
    FeaturePrefsStore.batch1341.v1346cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1346: copper mode
internal fun PlayerActivity.showV1346CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1346copper
    FeaturePrefsStore.batch1341.v1346copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1346: cord mode
internal fun PlayerActivity.showV1346CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1346cord
    FeaturePrefsStore.batch1341.v1346cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1346: corn mode
internal fun PlayerActivity.showV1346CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1346corn
    FeaturePrefsStore.batch1341.v1346corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1346: corner mode
internal fun PlayerActivity.showV1346CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1346corner
    FeaturePrefsStore.batch1341.v1346corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1347: cold mode
internal fun PlayerActivity.showV1347ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cold
    FeaturePrefsStore.batch1341.v1347cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1347: collar mode
internal fun PlayerActivity.showV1347CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1347collar
    FeaturePrefsStore.batch1341.v1347collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1347: colony mode
internal fun PlayerActivity.showV1347ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1347colony
    FeaturePrefsStore.batch1341.v1347colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1347: color mode
internal fun PlayerActivity.showV1347ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1347color
    FeaturePrefsStore.batch1341.v1347color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1347: combat mode
internal fun PlayerActivity.showV1347CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1347combat
    FeaturePrefsStore.batch1341.v1347combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1347: comedy level
internal fun PlayerActivity.showV1347ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1347: comic level
internal fun PlayerActivity.showV1347ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1347: common level
internal fun PlayerActivity.showV1347CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347common = value
        AppToast.show(this, "common: $value")
    }
}

// v1347: convey level
internal fun PlayerActivity.showV1347ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1347: cook level
internal fun PlayerActivity.showV1347CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1347cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1347cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1347: cool mode
internal fun PlayerActivity.showV1347CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cool
    FeaturePrefsStore.batch1341.v1347cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1347: copper mode
internal fun PlayerActivity.showV1347CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1347copper
    FeaturePrefsStore.batch1341.v1347copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1347: cord mode
internal fun PlayerActivity.showV1347CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1347cord
    FeaturePrefsStore.batch1341.v1347cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1347: corn mode
internal fun PlayerActivity.showV1347CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1347corn
    FeaturePrefsStore.batch1341.v1347corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1347: corner mode
internal fun PlayerActivity.showV1347CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1347corner
    FeaturePrefsStore.batch1341.v1347corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1348: cold mode
internal fun PlayerActivity.showV1348ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cold
    FeaturePrefsStore.batch1341.v1348cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1348: collar mode
internal fun PlayerActivity.showV1348CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1348collar
    FeaturePrefsStore.batch1341.v1348collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1348: colony mode
internal fun PlayerActivity.showV1348ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1348colony
    FeaturePrefsStore.batch1341.v1348colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1348: color mode
internal fun PlayerActivity.showV1348ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1348color
    FeaturePrefsStore.batch1341.v1348color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1348: combat mode
internal fun PlayerActivity.showV1348CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1348combat
    FeaturePrefsStore.batch1341.v1348combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1348: comedy level
internal fun PlayerActivity.showV1348ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1348: comic level
internal fun PlayerActivity.showV1348ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1348: common level
internal fun PlayerActivity.showV1348CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348common = value
        AppToast.show(this, "common: $value")
    }
}

// v1348: convey level
internal fun PlayerActivity.showV1348ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1348: cook level
internal fun PlayerActivity.showV1348CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1348cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1348cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1348: cool mode
internal fun PlayerActivity.showV1348CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cool
    FeaturePrefsStore.batch1341.v1348cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1348: copper mode
internal fun PlayerActivity.showV1348CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1348copper
    FeaturePrefsStore.batch1341.v1348copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1348: cord mode
internal fun PlayerActivity.showV1348CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1348cord
    FeaturePrefsStore.batch1341.v1348cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1348: corn mode
internal fun PlayerActivity.showV1348CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1348corn
    FeaturePrefsStore.batch1341.v1348corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1348: corner mode
internal fun PlayerActivity.showV1348CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1348corner
    FeaturePrefsStore.batch1341.v1348corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1349: cold mode
internal fun PlayerActivity.showV1349ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cold
    FeaturePrefsStore.batch1341.v1349cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1349: collar mode
internal fun PlayerActivity.showV1349CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1349collar
    FeaturePrefsStore.batch1341.v1349collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1349: colony mode
internal fun PlayerActivity.showV1349ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1349colony
    FeaturePrefsStore.batch1341.v1349colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1349: color mode
internal fun PlayerActivity.showV1349ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1349color
    FeaturePrefsStore.batch1341.v1349color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1349: combat mode
internal fun PlayerActivity.showV1349CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1349combat
    FeaturePrefsStore.batch1341.v1349combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1349: comedy level
internal fun PlayerActivity.showV1349ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1349: comic level
internal fun PlayerActivity.showV1349ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1349: common level
internal fun PlayerActivity.showV1349CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349common = value
        AppToast.show(this, "common: $value")
    }
}

// v1349: convey level
internal fun PlayerActivity.showV1349ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1349: cook level
internal fun PlayerActivity.showV1349CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1349cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1349cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1349: cool mode
internal fun PlayerActivity.showV1349CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cool
    FeaturePrefsStore.batch1341.v1349cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1349: copper mode
internal fun PlayerActivity.showV1349CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1349copper
    FeaturePrefsStore.batch1341.v1349copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1349: cord mode
internal fun PlayerActivity.showV1349CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1349cord
    FeaturePrefsStore.batch1341.v1349cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1349: corn mode
internal fun PlayerActivity.showV1349CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1349corn
    FeaturePrefsStore.batch1341.v1349corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1349: corner mode
internal fun PlayerActivity.showV1349CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1349corner
    FeaturePrefsStore.batch1341.v1349corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}

// v1350: cold mode
internal fun PlayerActivity.showV1350ColdToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cold
    FeaturePrefsStore.batch1341.v1350cold = !current
    AppToast.show(this, "cold: ${if (!current) "ON" else "OFF"}")
}

// v1350: collar mode
internal fun PlayerActivity.showV1350CollarToggle() {
    val current = FeaturePrefsStore.batch1341.v1350collar
    FeaturePrefsStore.batch1341.v1350collar = !current
    AppToast.show(this, "collar: ${if (!current) "ON" else "OFF"}")
}

// v1350: colony mode
internal fun PlayerActivity.showV1350ColonyToggle() {
    val current = FeaturePrefsStore.batch1341.v1350colony
    FeaturePrefsStore.batch1341.v1350colony = !current
    AppToast.show(this, "colony: ${if (!current) "ON" else "OFF"}")
}

// v1350: color mode
internal fun PlayerActivity.showV1350ColorToggle() {
    val current = FeaturePrefsStore.batch1341.v1350color
    FeaturePrefsStore.batch1341.v1350color = !current
    AppToast.show(this, "color: ${if (!current) "ON" else "OFF"}")
}

// v1350: combat mode
internal fun PlayerActivity.showV1350CombatToggle() {
    val current = FeaturePrefsStore.batch1341.v1350combat
    FeaturePrefsStore.batch1341.v1350combat = !current
    AppToast.show(this, "combat: ${if (!current) "ON" else "OFF"}")
}

// v1350: comedy level
internal fun PlayerActivity.showV1350ComedyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350comedy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comedy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350comedy = value
        AppToast.show(this, "comedy: $value")
    }
}

// v1350: comic level
internal fun PlayerActivity.showV1350ComicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350comic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350comic = value
        AppToast.show(this, "comic: $value")
    }
}

// v1350: common level
internal fun PlayerActivity.showV1350CommonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350common).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "common level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350common = value
        AppToast.show(this, "common: $value")
    }
}

// v1350: convey level
internal fun PlayerActivity.showV1350ConveyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350convey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350convey = value
        AppToast.show(this, "convey: $value")
    }
}

// v1350: cook level
internal fun PlayerActivity.showV1350CookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1341.v1350cook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1341.v1350cook = value
        AppToast.show(this, "cook: $value")
    }
}

// v1350: cool mode
internal fun PlayerActivity.showV1350CoolToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cool
    FeaturePrefsStore.batch1341.v1350cool = !current
    AppToast.show(this, "cool: ${if (!current) "ON" else "OFF"}")
}

// v1350: copper mode
internal fun PlayerActivity.showV1350CopperToggle() {
    val current = FeaturePrefsStore.batch1341.v1350copper
    FeaturePrefsStore.batch1341.v1350copper = !current
    AppToast.show(this, "copper: ${if (!current) "ON" else "OFF"}")
}

// v1350: cord mode
internal fun PlayerActivity.showV1350CordToggle() {
    val current = FeaturePrefsStore.batch1341.v1350cord
    FeaturePrefsStore.batch1341.v1350cord = !current
    AppToast.show(this, "cord: ${if (!current) "ON" else "OFF"}")
}

// v1350: corn mode
internal fun PlayerActivity.showV1350CornToggle() {
    val current = FeaturePrefsStore.batch1341.v1350corn
    FeaturePrefsStore.batch1341.v1350corn = !current
    AppToast.show(this, "corn: ${if (!current) "ON" else "OFF"}")
}

// v1350: corner mode
internal fun PlayerActivity.showV1350CornerToggle() {
    val current = FeaturePrefsStore.batch1341.v1350corner
    FeaturePrefsStore.batch1341.v1350corner = !current
    AppToast.show(this, "corner: ${if (!current) "ON" else "OFF"}")
}
