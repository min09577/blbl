package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1421: enemy mode
internal fun PlayerActivity.showV1421EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1421enemy
    FeaturePrefsStore.batch1421.v1421enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1421: energy mode
internal fun PlayerActivity.showV1421EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1421energy
    FeaturePrefsStore.batch1421.v1421energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1421: engage mode
internal fun PlayerActivity.showV1421EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1421engage
    FeaturePrefsStore.batch1421.v1421engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1421: engine mode
internal fun PlayerActivity.showV1421EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1421engine
    FeaturePrefsStore.batch1421.v1421engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1421: enjoy mode
internal fun PlayerActivity.showV1421EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1421enjoy
    FeaturePrefsStore.batch1421.v1421enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1421: enough level
internal fun PlayerActivity.showV1421EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1421enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1421enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1421: ensure level
internal fun PlayerActivity.showV1421EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1421ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1421ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1421: entire level
internal fun PlayerActivity.showV1421EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1421entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1421entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1421: envelope level
internal fun PlayerActivity.showV1421EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1421envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1421envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1421: equip level
internal fun PlayerActivity.showV1421EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1421equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1421equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1421: era mode
internal fun PlayerActivity.showV1421EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1421era
    FeaturePrefsStore.batch1421.v1421era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1421: error mode
internal fun PlayerActivity.showV1421ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1421error
    FeaturePrefsStore.batch1421.v1421error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1421: essay mode
internal fun PlayerActivity.showV1421EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1421essay
    FeaturePrefsStore.batch1421.v1421essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1421: estate mode
internal fun PlayerActivity.showV1421EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1421estate
    FeaturePrefsStore.batch1421.v1421estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1421: ethic mode
internal fun PlayerActivity.showV1421EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1421ethic
    FeaturePrefsStore.batch1421.v1421ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1422: enemy mode
internal fun PlayerActivity.showV1422EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1422enemy
    FeaturePrefsStore.batch1421.v1422enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1422: energy mode
internal fun PlayerActivity.showV1422EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1422energy
    FeaturePrefsStore.batch1421.v1422energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1422: engage mode
internal fun PlayerActivity.showV1422EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1422engage
    FeaturePrefsStore.batch1421.v1422engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1422: engine mode
internal fun PlayerActivity.showV1422EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1422engine
    FeaturePrefsStore.batch1421.v1422engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1422: enjoy mode
internal fun PlayerActivity.showV1422EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1422enjoy
    FeaturePrefsStore.batch1421.v1422enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1422: enough level
internal fun PlayerActivity.showV1422EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1422enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1422enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1422: ensure level
internal fun PlayerActivity.showV1422EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1422ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1422ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1422: entire level
internal fun PlayerActivity.showV1422EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1422entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1422entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1422: envelope level
internal fun PlayerActivity.showV1422EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1422envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1422envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1422: equip level
internal fun PlayerActivity.showV1422EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1422equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1422equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1422: era mode
internal fun PlayerActivity.showV1422EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1422era
    FeaturePrefsStore.batch1421.v1422era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1422: error mode
internal fun PlayerActivity.showV1422ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1422error
    FeaturePrefsStore.batch1421.v1422error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1422: essay mode
internal fun PlayerActivity.showV1422EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1422essay
    FeaturePrefsStore.batch1421.v1422essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1422: estate mode
internal fun PlayerActivity.showV1422EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1422estate
    FeaturePrefsStore.batch1421.v1422estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1422: ethic mode
internal fun PlayerActivity.showV1422EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1422ethic
    FeaturePrefsStore.batch1421.v1422ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1423: enemy mode
internal fun PlayerActivity.showV1423EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1423enemy
    FeaturePrefsStore.batch1421.v1423enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1423: energy mode
internal fun PlayerActivity.showV1423EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1423energy
    FeaturePrefsStore.batch1421.v1423energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1423: engage mode
internal fun PlayerActivity.showV1423EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1423engage
    FeaturePrefsStore.batch1421.v1423engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1423: engine mode
internal fun PlayerActivity.showV1423EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1423engine
    FeaturePrefsStore.batch1421.v1423engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1423: enjoy mode
internal fun PlayerActivity.showV1423EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1423enjoy
    FeaturePrefsStore.batch1421.v1423enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1423: enough level
internal fun PlayerActivity.showV1423EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1423enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1423enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1423: ensure level
internal fun PlayerActivity.showV1423EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1423ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1423ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1423: entire level
internal fun PlayerActivity.showV1423EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1423entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1423entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1423: envelope level
internal fun PlayerActivity.showV1423EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1423envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1423envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1423: equip level
internal fun PlayerActivity.showV1423EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1423equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1423equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1423: era mode
internal fun PlayerActivity.showV1423EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1423era
    FeaturePrefsStore.batch1421.v1423era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1423: error mode
internal fun PlayerActivity.showV1423ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1423error
    FeaturePrefsStore.batch1421.v1423error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1423: essay mode
internal fun PlayerActivity.showV1423EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1423essay
    FeaturePrefsStore.batch1421.v1423essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1423: estate mode
internal fun PlayerActivity.showV1423EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1423estate
    FeaturePrefsStore.batch1421.v1423estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1423: ethic mode
internal fun PlayerActivity.showV1423EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1423ethic
    FeaturePrefsStore.batch1421.v1423ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1424: enemy mode
internal fun PlayerActivity.showV1424EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1424enemy
    FeaturePrefsStore.batch1421.v1424enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1424: energy mode
internal fun PlayerActivity.showV1424EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1424energy
    FeaturePrefsStore.batch1421.v1424energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1424: engage mode
internal fun PlayerActivity.showV1424EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1424engage
    FeaturePrefsStore.batch1421.v1424engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1424: engine mode
internal fun PlayerActivity.showV1424EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1424engine
    FeaturePrefsStore.batch1421.v1424engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1424: enjoy mode
internal fun PlayerActivity.showV1424EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1424enjoy
    FeaturePrefsStore.batch1421.v1424enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1424: enough level
internal fun PlayerActivity.showV1424EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1424enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1424enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1424: ensure level
internal fun PlayerActivity.showV1424EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1424ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1424ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1424: entire level
internal fun PlayerActivity.showV1424EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1424entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1424entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1424: envelope level
internal fun PlayerActivity.showV1424EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1424envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1424envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1424: equip level
internal fun PlayerActivity.showV1424EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1424equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1424equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1424: era mode
internal fun PlayerActivity.showV1424EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1424era
    FeaturePrefsStore.batch1421.v1424era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1424: error mode
internal fun PlayerActivity.showV1424ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1424error
    FeaturePrefsStore.batch1421.v1424error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1424: essay mode
internal fun PlayerActivity.showV1424EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1424essay
    FeaturePrefsStore.batch1421.v1424essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1424: estate mode
internal fun PlayerActivity.showV1424EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1424estate
    FeaturePrefsStore.batch1421.v1424estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1424: ethic mode
internal fun PlayerActivity.showV1424EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1424ethic
    FeaturePrefsStore.batch1421.v1424ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1425: enemy mode
internal fun PlayerActivity.showV1425EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1425enemy
    FeaturePrefsStore.batch1421.v1425enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1425: energy mode
internal fun PlayerActivity.showV1425EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1425energy
    FeaturePrefsStore.batch1421.v1425energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1425: engage mode
internal fun PlayerActivity.showV1425EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1425engage
    FeaturePrefsStore.batch1421.v1425engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1425: engine mode
internal fun PlayerActivity.showV1425EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1425engine
    FeaturePrefsStore.batch1421.v1425engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1425: enjoy mode
internal fun PlayerActivity.showV1425EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1425enjoy
    FeaturePrefsStore.batch1421.v1425enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1425: enough level
internal fun PlayerActivity.showV1425EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1425enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1425enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1425: ensure level
internal fun PlayerActivity.showV1425EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1425ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1425ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1425: entire level
internal fun PlayerActivity.showV1425EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1425entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1425entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1425: envelope level
internal fun PlayerActivity.showV1425EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1425envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1425envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1425: equip level
internal fun PlayerActivity.showV1425EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1425equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1425equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1425: era mode
internal fun PlayerActivity.showV1425EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1425era
    FeaturePrefsStore.batch1421.v1425era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1425: error mode
internal fun PlayerActivity.showV1425ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1425error
    FeaturePrefsStore.batch1421.v1425error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1425: essay mode
internal fun PlayerActivity.showV1425EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1425essay
    FeaturePrefsStore.batch1421.v1425essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1425: estate mode
internal fun PlayerActivity.showV1425EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1425estate
    FeaturePrefsStore.batch1421.v1425estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1425: ethic mode
internal fun PlayerActivity.showV1425EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1425ethic
    FeaturePrefsStore.batch1421.v1425ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1426: enemy mode
internal fun PlayerActivity.showV1426EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1426enemy
    FeaturePrefsStore.batch1421.v1426enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1426: energy mode
internal fun PlayerActivity.showV1426EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1426energy
    FeaturePrefsStore.batch1421.v1426energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1426: engage mode
internal fun PlayerActivity.showV1426EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1426engage
    FeaturePrefsStore.batch1421.v1426engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1426: engine mode
internal fun PlayerActivity.showV1426EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1426engine
    FeaturePrefsStore.batch1421.v1426engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1426: enjoy mode
internal fun PlayerActivity.showV1426EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1426enjoy
    FeaturePrefsStore.batch1421.v1426enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1426: enough level
internal fun PlayerActivity.showV1426EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1426enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1426enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1426: ensure level
internal fun PlayerActivity.showV1426EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1426ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1426ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1426: entire level
internal fun PlayerActivity.showV1426EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1426entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1426entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1426: envelope level
internal fun PlayerActivity.showV1426EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1426envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1426envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1426: equip level
internal fun PlayerActivity.showV1426EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1426equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1426equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1426: era mode
internal fun PlayerActivity.showV1426EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1426era
    FeaturePrefsStore.batch1421.v1426era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1426: error mode
internal fun PlayerActivity.showV1426ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1426error
    FeaturePrefsStore.batch1421.v1426error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1426: essay mode
internal fun PlayerActivity.showV1426EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1426essay
    FeaturePrefsStore.batch1421.v1426essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1426: estate mode
internal fun PlayerActivity.showV1426EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1426estate
    FeaturePrefsStore.batch1421.v1426estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1426: ethic mode
internal fun PlayerActivity.showV1426EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1426ethic
    FeaturePrefsStore.batch1421.v1426ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1427: enemy mode
internal fun PlayerActivity.showV1427EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1427enemy
    FeaturePrefsStore.batch1421.v1427enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1427: energy mode
internal fun PlayerActivity.showV1427EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1427energy
    FeaturePrefsStore.batch1421.v1427energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1427: engage mode
internal fun PlayerActivity.showV1427EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1427engage
    FeaturePrefsStore.batch1421.v1427engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1427: engine mode
internal fun PlayerActivity.showV1427EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1427engine
    FeaturePrefsStore.batch1421.v1427engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1427: enjoy mode
internal fun PlayerActivity.showV1427EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1427enjoy
    FeaturePrefsStore.batch1421.v1427enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1427: enough level
internal fun PlayerActivity.showV1427EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1427enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1427enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1427: ensure level
internal fun PlayerActivity.showV1427EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1427ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1427ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1427: entire level
internal fun PlayerActivity.showV1427EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1427entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1427entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1427: envelope level
internal fun PlayerActivity.showV1427EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1427envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1427envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1427: equip level
internal fun PlayerActivity.showV1427EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1427equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1427equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1427: era mode
internal fun PlayerActivity.showV1427EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1427era
    FeaturePrefsStore.batch1421.v1427era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1427: error mode
internal fun PlayerActivity.showV1427ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1427error
    FeaturePrefsStore.batch1421.v1427error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1427: essay mode
internal fun PlayerActivity.showV1427EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1427essay
    FeaturePrefsStore.batch1421.v1427essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1427: estate mode
internal fun PlayerActivity.showV1427EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1427estate
    FeaturePrefsStore.batch1421.v1427estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1427: ethic mode
internal fun PlayerActivity.showV1427EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1427ethic
    FeaturePrefsStore.batch1421.v1427ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1428: enemy mode
internal fun PlayerActivity.showV1428EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1428enemy
    FeaturePrefsStore.batch1421.v1428enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1428: energy mode
internal fun PlayerActivity.showV1428EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1428energy
    FeaturePrefsStore.batch1421.v1428energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1428: engage mode
internal fun PlayerActivity.showV1428EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1428engage
    FeaturePrefsStore.batch1421.v1428engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1428: engine mode
internal fun PlayerActivity.showV1428EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1428engine
    FeaturePrefsStore.batch1421.v1428engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1428: enjoy mode
internal fun PlayerActivity.showV1428EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1428enjoy
    FeaturePrefsStore.batch1421.v1428enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1428: enough level
internal fun PlayerActivity.showV1428EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1428enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1428enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1428: ensure level
internal fun PlayerActivity.showV1428EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1428ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1428ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1428: entire level
internal fun PlayerActivity.showV1428EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1428entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1428entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1428: envelope level
internal fun PlayerActivity.showV1428EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1428envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1428envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1428: equip level
internal fun PlayerActivity.showV1428EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1428equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1428equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1428: era mode
internal fun PlayerActivity.showV1428EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1428era
    FeaturePrefsStore.batch1421.v1428era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1428: error mode
internal fun PlayerActivity.showV1428ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1428error
    FeaturePrefsStore.batch1421.v1428error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1428: essay mode
internal fun PlayerActivity.showV1428EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1428essay
    FeaturePrefsStore.batch1421.v1428essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1428: estate mode
internal fun PlayerActivity.showV1428EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1428estate
    FeaturePrefsStore.batch1421.v1428estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1428: ethic mode
internal fun PlayerActivity.showV1428EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1428ethic
    FeaturePrefsStore.batch1421.v1428ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1429: enemy mode
internal fun PlayerActivity.showV1429EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1429enemy
    FeaturePrefsStore.batch1421.v1429enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1429: energy mode
internal fun PlayerActivity.showV1429EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1429energy
    FeaturePrefsStore.batch1421.v1429energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1429: engage mode
internal fun PlayerActivity.showV1429EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1429engage
    FeaturePrefsStore.batch1421.v1429engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1429: engine mode
internal fun PlayerActivity.showV1429EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1429engine
    FeaturePrefsStore.batch1421.v1429engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1429: enjoy mode
internal fun PlayerActivity.showV1429EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1429enjoy
    FeaturePrefsStore.batch1421.v1429enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1429: enough level
internal fun PlayerActivity.showV1429EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1429enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1429enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1429: ensure level
internal fun PlayerActivity.showV1429EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1429ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1429ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1429: entire level
internal fun PlayerActivity.showV1429EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1429entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1429entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1429: envelope level
internal fun PlayerActivity.showV1429EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1429envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1429envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1429: equip level
internal fun PlayerActivity.showV1429EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1429equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1429equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1429: era mode
internal fun PlayerActivity.showV1429EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1429era
    FeaturePrefsStore.batch1421.v1429era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1429: error mode
internal fun PlayerActivity.showV1429ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1429error
    FeaturePrefsStore.batch1421.v1429error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1429: essay mode
internal fun PlayerActivity.showV1429EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1429essay
    FeaturePrefsStore.batch1421.v1429essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1429: estate mode
internal fun PlayerActivity.showV1429EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1429estate
    FeaturePrefsStore.batch1421.v1429estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1429: ethic mode
internal fun PlayerActivity.showV1429EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1429ethic
    FeaturePrefsStore.batch1421.v1429ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1430: enemy mode
internal fun PlayerActivity.showV1430EnemyToggle() {
    val current = FeaturePrefsStore.batch1421.v1430enemy
    FeaturePrefsStore.batch1421.v1430enemy = !current
    AppToast.show(this, "enemy: ${if (!current) "ON" else "OFF"}")
}

// v1430: energy mode
internal fun PlayerActivity.showV1430EnergyToggle() {
    val current = FeaturePrefsStore.batch1421.v1430energy
    FeaturePrefsStore.batch1421.v1430energy = !current
    AppToast.show(this, "energy: ${if (!current) "ON" else "OFF"}")
}

// v1430: engage mode
internal fun PlayerActivity.showV1430EngageToggle() {
    val current = FeaturePrefsStore.batch1421.v1430engage
    FeaturePrefsStore.batch1421.v1430engage = !current
    AppToast.show(this, "engage: ${if (!current) "ON" else "OFF"}")
}

// v1430: engine mode
internal fun PlayerActivity.showV1430EngineToggle() {
    val current = FeaturePrefsStore.batch1421.v1430engine
    FeaturePrefsStore.batch1421.v1430engine = !current
    AppToast.show(this, "engine: ${if (!current) "ON" else "OFF"}")
}

// v1430: enjoy mode
internal fun PlayerActivity.showV1430EnjoyToggle() {
    val current = FeaturePrefsStore.batch1421.v1430enjoy
    FeaturePrefsStore.batch1421.v1430enjoy = !current
    AppToast.show(this, "enjoy: ${if (!current) "ON" else "OFF"}")
}

// v1430: enough level
internal fun PlayerActivity.showV1430EnoughDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1430enough).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enough level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1430enough = value
        AppToast.show(this, "enough: $value")
    }
}

// v1430: ensure level
internal fun PlayerActivity.showV1430EnsureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1430ensure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ensure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1430ensure = value
        AppToast.show(this, "ensure: $value")
    }
}

// v1430: entire level
internal fun PlayerActivity.showV1430EntireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1430entire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1430entire = value
        AppToast.show(this, "entire: $value")
    }
}

// v1430: envelope level
internal fun PlayerActivity.showV1430EnvelopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1430envelope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "envelope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1430envelope = value
        AppToast.show(this, "envelope: $value")
    }
}

// v1430: equip level
internal fun PlayerActivity.showV1430EquipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1421.v1430equip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1421.v1430equip = value
        AppToast.show(this, "equip: $value")
    }
}

// v1430: era mode
internal fun PlayerActivity.showV1430EraToggle() {
    val current = FeaturePrefsStore.batch1421.v1430era
    FeaturePrefsStore.batch1421.v1430era = !current
    AppToast.show(this, "era: ${if (!current) "ON" else "OFF"}")
}

// v1430: error mode
internal fun PlayerActivity.showV1430ErrorToggle() {
    val current = FeaturePrefsStore.batch1421.v1430error
    FeaturePrefsStore.batch1421.v1430error = !current
    AppToast.show(this, "error: ${if (!current) "ON" else "OFF"}")
}

// v1430: essay mode
internal fun PlayerActivity.showV1430EssayToggle() {
    val current = FeaturePrefsStore.batch1421.v1430essay
    FeaturePrefsStore.batch1421.v1430essay = !current
    AppToast.show(this, "essay: ${if (!current) "ON" else "OFF"}")
}

// v1430: estate mode
internal fun PlayerActivity.showV1430EstateToggle() {
    val current = FeaturePrefsStore.batch1421.v1430estate
    FeaturePrefsStore.batch1421.v1430estate = !current
    AppToast.show(this, "estate: ${if (!current) "ON" else "OFF"}")
}

// v1430: ethic mode
internal fun PlayerActivity.showV1430EthicToggle() {
    val current = FeaturePrefsStore.batch1421.v1430ethic
    FeaturePrefsStore.batch1421.v1430ethic = !current
    AppToast.show(this, "ethic: ${if (!current) "ON" else "OFF"}")
}

// v1431: event mode
internal fun PlayerActivity.showV1431EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1431event
    FeaturePrefsStore.batch1431.v1431event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1431: every mode
internal fun PlayerActivity.showV1431EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1431every
    FeaturePrefsStore.batch1431.v1431every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1431: exact mode
internal fun PlayerActivity.showV1431ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1431exact
    FeaturePrefsStore.batch1431.v1431exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1431: exalt mode
internal fun PlayerActivity.showV1431ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1431exalt
    FeaturePrefsStore.batch1431.v1431exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1431: exam mode
internal fun PlayerActivity.showV1431ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1431exam
    FeaturePrefsStore.batch1431.v1431exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1431: excel level
internal fun PlayerActivity.showV1431ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1431excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1431excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1431: except level
internal fun PlayerActivity.showV1431ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1431except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1431except = value
        AppToast.show(this, "except: $value")
    }
}

// v1431: excite level
internal fun PlayerActivity.showV1431ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1431excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1431excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1431: excuse level
internal fun PlayerActivity.showV1431ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1431excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1431excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1431: exist level
internal fun PlayerActivity.showV1431ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1431exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1431exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1431: expert mode
internal fun PlayerActivity.showV1431ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1431expert
    FeaturePrefsStore.batch1431.v1431expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1431: extra mode
internal fun PlayerActivity.showV1431ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1431extra
    FeaturePrefsStore.batch1431.v1431extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1431: fabric mode
internal fun PlayerActivity.showV1431FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1431fabric
    FeaturePrefsStore.batch1431.v1431fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1431: fact mode
internal fun PlayerActivity.showV1431FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1431fact
    FeaturePrefsStore.batch1431.v1431fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1431: fade mode
internal fun PlayerActivity.showV1431FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1431fade
    FeaturePrefsStore.batch1431.v1431fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1432: event mode
internal fun PlayerActivity.showV1432EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1432event
    FeaturePrefsStore.batch1431.v1432event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1432: every mode
internal fun PlayerActivity.showV1432EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1432every
    FeaturePrefsStore.batch1431.v1432every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1432: exact mode
internal fun PlayerActivity.showV1432ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1432exact
    FeaturePrefsStore.batch1431.v1432exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1432: exalt mode
internal fun PlayerActivity.showV1432ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1432exalt
    FeaturePrefsStore.batch1431.v1432exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1432: exam mode
internal fun PlayerActivity.showV1432ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1432exam
    FeaturePrefsStore.batch1431.v1432exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1432: excel level
internal fun PlayerActivity.showV1432ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1432excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1432excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1432: except level
internal fun PlayerActivity.showV1432ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1432except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1432except = value
        AppToast.show(this, "except: $value")
    }
}

// v1432: excite level
internal fun PlayerActivity.showV1432ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1432excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1432excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1432: excuse level
internal fun PlayerActivity.showV1432ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1432excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1432excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1432: exist level
internal fun PlayerActivity.showV1432ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1432exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1432exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1432: expert mode
internal fun PlayerActivity.showV1432ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1432expert
    FeaturePrefsStore.batch1431.v1432expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1432: extra mode
internal fun PlayerActivity.showV1432ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1432extra
    FeaturePrefsStore.batch1431.v1432extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1432: fabric mode
internal fun PlayerActivity.showV1432FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1432fabric
    FeaturePrefsStore.batch1431.v1432fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1432: fact mode
internal fun PlayerActivity.showV1432FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1432fact
    FeaturePrefsStore.batch1431.v1432fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1432: fade mode
internal fun PlayerActivity.showV1432FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1432fade
    FeaturePrefsStore.batch1431.v1432fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1433: event mode
internal fun PlayerActivity.showV1433EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1433event
    FeaturePrefsStore.batch1431.v1433event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1433: every mode
internal fun PlayerActivity.showV1433EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1433every
    FeaturePrefsStore.batch1431.v1433every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1433: exact mode
internal fun PlayerActivity.showV1433ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1433exact
    FeaturePrefsStore.batch1431.v1433exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1433: exalt mode
internal fun PlayerActivity.showV1433ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1433exalt
    FeaturePrefsStore.batch1431.v1433exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1433: exam mode
internal fun PlayerActivity.showV1433ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1433exam
    FeaturePrefsStore.batch1431.v1433exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1433: excel level
internal fun PlayerActivity.showV1433ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1433excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1433excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1433: except level
internal fun PlayerActivity.showV1433ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1433except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1433except = value
        AppToast.show(this, "except: $value")
    }
}

// v1433: excite level
internal fun PlayerActivity.showV1433ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1433excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1433excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1433: excuse level
internal fun PlayerActivity.showV1433ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1433excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1433excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1433: exist level
internal fun PlayerActivity.showV1433ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1433exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1433exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1433: expert mode
internal fun PlayerActivity.showV1433ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1433expert
    FeaturePrefsStore.batch1431.v1433expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1433: extra mode
internal fun PlayerActivity.showV1433ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1433extra
    FeaturePrefsStore.batch1431.v1433extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1433: fabric mode
internal fun PlayerActivity.showV1433FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1433fabric
    FeaturePrefsStore.batch1431.v1433fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1433: fact mode
internal fun PlayerActivity.showV1433FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1433fact
    FeaturePrefsStore.batch1431.v1433fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1433: fade mode
internal fun PlayerActivity.showV1433FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1433fade
    FeaturePrefsStore.batch1431.v1433fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1434: event mode
internal fun PlayerActivity.showV1434EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1434event
    FeaturePrefsStore.batch1431.v1434event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1434: every mode
internal fun PlayerActivity.showV1434EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1434every
    FeaturePrefsStore.batch1431.v1434every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1434: exact mode
internal fun PlayerActivity.showV1434ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1434exact
    FeaturePrefsStore.batch1431.v1434exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1434: exalt mode
internal fun PlayerActivity.showV1434ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1434exalt
    FeaturePrefsStore.batch1431.v1434exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1434: exam mode
internal fun PlayerActivity.showV1434ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1434exam
    FeaturePrefsStore.batch1431.v1434exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1434: excel level
internal fun PlayerActivity.showV1434ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1434excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1434excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1434: except level
internal fun PlayerActivity.showV1434ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1434except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1434except = value
        AppToast.show(this, "except: $value")
    }
}

// v1434: excite level
internal fun PlayerActivity.showV1434ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1434excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1434excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1434: excuse level
internal fun PlayerActivity.showV1434ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1434excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1434excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1434: exist level
internal fun PlayerActivity.showV1434ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1434exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1434exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1434: expert mode
internal fun PlayerActivity.showV1434ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1434expert
    FeaturePrefsStore.batch1431.v1434expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1434: extra mode
internal fun PlayerActivity.showV1434ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1434extra
    FeaturePrefsStore.batch1431.v1434extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1434: fabric mode
internal fun PlayerActivity.showV1434FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1434fabric
    FeaturePrefsStore.batch1431.v1434fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1434: fact mode
internal fun PlayerActivity.showV1434FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1434fact
    FeaturePrefsStore.batch1431.v1434fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1434: fade mode
internal fun PlayerActivity.showV1434FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1434fade
    FeaturePrefsStore.batch1431.v1434fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1435: event mode
internal fun PlayerActivity.showV1435EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1435event
    FeaturePrefsStore.batch1431.v1435event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1435: every mode
internal fun PlayerActivity.showV1435EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1435every
    FeaturePrefsStore.batch1431.v1435every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1435: exact mode
internal fun PlayerActivity.showV1435ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1435exact
    FeaturePrefsStore.batch1431.v1435exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1435: exalt mode
internal fun PlayerActivity.showV1435ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1435exalt
    FeaturePrefsStore.batch1431.v1435exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1435: exam mode
internal fun PlayerActivity.showV1435ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1435exam
    FeaturePrefsStore.batch1431.v1435exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1435: excel level
internal fun PlayerActivity.showV1435ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1435excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1435excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1435: except level
internal fun PlayerActivity.showV1435ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1435except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1435except = value
        AppToast.show(this, "except: $value")
    }
}

// v1435: excite level
internal fun PlayerActivity.showV1435ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1435excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1435excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1435: excuse level
internal fun PlayerActivity.showV1435ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1435excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1435excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1435: exist level
internal fun PlayerActivity.showV1435ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1435exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1435exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1435: expert mode
internal fun PlayerActivity.showV1435ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1435expert
    FeaturePrefsStore.batch1431.v1435expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1435: extra mode
internal fun PlayerActivity.showV1435ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1435extra
    FeaturePrefsStore.batch1431.v1435extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1435: fabric mode
internal fun PlayerActivity.showV1435FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1435fabric
    FeaturePrefsStore.batch1431.v1435fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1435: fact mode
internal fun PlayerActivity.showV1435FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1435fact
    FeaturePrefsStore.batch1431.v1435fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1435: fade mode
internal fun PlayerActivity.showV1435FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1435fade
    FeaturePrefsStore.batch1431.v1435fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1436: event mode
internal fun PlayerActivity.showV1436EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1436event
    FeaturePrefsStore.batch1431.v1436event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1436: every mode
internal fun PlayerActivity.showV1436EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1436every
    FeaturePrefsStore.batch1431.v1436every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1436: exact mode
internal fun PlayerActivity.showV1436ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1436exact
    FeaturePrefsStore.batch1431.v1436exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1436: exalt mode
internal fun PlayerActivity.showV1436ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1436exalt
    FeaturePrefsStore.batch1431.v1436exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1436: exam mode
internal fun PlayerActivity.showV1436ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1436exam
    FeaturePrefsStore.batch1431.v1436exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1436: excel level
internal fun PlayerActivity.showV1436ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1436excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1436excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1436: except level
internal fun PlayerActivity.showV1436ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1436except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1436except = value
        AppToast.show(this, "except: $value")
    }
}

// v1436: excite level
internal fun PlayerActivity.showV1436ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1436excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1436excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1436: excuse level
internal fun PlayerActivity.showV1436ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1436excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1436excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1436: exist level
internal fun PlayerActivity.showV1436ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1436exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1436exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1436: expert mode
internal fun PlayerActivity.showV1436ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1436expert
    FeaturePrefsStore.batch1431.v1436expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1436: extra mode
internal fun PlayerActivity.showV1436ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1436extra
    FeaturePrefsStore.batch1431.v1436extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1436: fabric mode
internal fun PlayerActivity.showV1436FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1436fabric
    FeaturePrefsStore.batch1431.v1436fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1436: fact mode
internal fun PlayerActivity.showV1436FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1436fact
    FeaturePrefsStore.batch1431.v1436fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1436: fade mode
internal fun PlayerActivity.showV1436FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1436fade
    FeaturePrefsStore.batch1431.v1436fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1437: event mode
internal fun PlayerActivity.showV1437EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1437event
    FeaturePrefsStore.batch1431.v1437event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1437: every mode
internal fun PlayerActivity.showV1437EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1437every
    FeaturePrefsStore.batch1431.v1437every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1437: exact mode
internal fun PlayerActivity.showV1437ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1437exact
    FeaturePrefsStore.batch1431.v1437exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1437: exalt mode
internal fun PlayerActivity.showV1437ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1437exalt
    FeaturePrefsStore.batch1431.v1437exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1437: exam mode
internal fun PlayerActivity.showV1437ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1437exam
    FeaturePrefsStore.batch1431.v1437exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1437: excel level
internal fun PlayerActivity.showV1437ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1437excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1437excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1437: except level
internal fun PlayerActivity.showV1437ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1437except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1437except = value
        AppToast.show(this, "except: $value")
    }
}

// v1437: excite level
internal fun PlayerActivity.showV1437ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1437excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1437excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1437: excuse level
internal fun PlayerActivity.showV1437ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1437excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1437excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1437: exist level
internal fun PlayerActivity.showV1437ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1437exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1437exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1437: expert mode
internal fun PlayerActivity.showV1437ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1437expert
    FeaturePrefsStore.batch1431.v1437expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1437: extra mode
internal fun PlayerActivity.showV1437ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1437extra
    FeaturePrefsStore.batch1431.v1437extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1437: fabric mode
internal fun PlayerActivity.showV1437FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1437fabric
    FeaturePrefsStore.batch1431.v1437fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1437: fact mode
internal fun PlayerActivity.showV1437FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1437fact
    FeaturePrefsStore.batch1431.v1437fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1437: fade mode
internal fun PlayerActivity.showV1437FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1437fade
    FeaturePrefsStore.batch1431.v1437fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1438: event mode
internal fun PlayerActivity.showV1438EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1438event
    FeaturePrefsStore.batch1431.v1438event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1438: every mode
internal fun PlayerActivity.showV1438EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1438every
    FeaturePrefsStore.batch1431.v1438every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1438: exact mode
internal fun PlayerActivity.showV1438ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1438exact
    FeaturePrefsStore.batch1431.v1438exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1438: exalt mode
internal fun PlayerActivity.showV1438ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1438exalt
    FeaturePrefsStore.batch1431.v1438exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1438: exam mode
internal fun PlayerActivity.showV1438ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1438exam
    FeaturePrefsStore.batch1431.v1438exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1438: excel level
internal fun PlayerActivity.showV1438ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1438excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1438excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1438: except level
internal fun PlayerActivity.showV1438ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1438except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1438except = value
        AppToast.show(this, "except: $value")
    }
}

// v1438: excite level
internal fun PlayerActivity.showV1438ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1438excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1438excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1438: excuse level
internal fun PlayerActivity.showV1438ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1438excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1438excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1438: exist level
internal fun PlayerActivity.showV1438ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1438exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1438exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1438: expert mode
internal fun PlayerActivity.showV1438ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1438expert
    FeaturePrefsStore.batch1431.v1438expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1438: extra mode
internal fun PlayerActivity.showV1438ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1438extra
    FeaturePrefsStore.batch1431.v1438extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1438: fabric mode
internal fun PlayerActivity.showV1438FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1438fabric
    FeaturePrefsStore.batch1431.v1438fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1438: fact mode
internal fun PlayerActivity.showV1438FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1438fact
    FeaturePrefsStore.batch1431.v1438fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1438: fade mode
internal fun PlayerActivity.showV1438FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1438fade
    FeaturePrefsStore.batch1431.v1438fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1439: event mode
internal fun PlayerActivity.showV1439EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1439event
    FeaturePrefsStore.batch1431.v1439event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1439: every mode
internal fun PlayerActivity.showV1439EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1439every
    FeaturePrefsStore.batch1431.v1439every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1439: exact mode
internal fun PlayerActivity.showV1439ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1439exact
    FeaturePrefsStore.batch1431.v1439exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1439: exalt mode
internal fun PlayerActivity.showV1439ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1439exalt
    FeaturePrefsStore.batch1431.v1439exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1439: exam mode
internal fun PlayerActivity.showV1439ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1439exam
    FeaturePrefsStore.batch1431.v1439exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1439: excel level
internal fun PlayerActivity.showV1439ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1439excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1439excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1439: except level
internal fun PlayerActivity.showV1439ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1439except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1439except = value
        AppToast.show(this, "except: $value")
    }
}

// v1439: excite level
internal fun PlayerActivity.showV1439ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1439excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1439excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1439: excuse level
internal fun PlayerActivity.showV1439ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1439excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1439excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1439: exist level
internal fun PlayerActivity.showV1439ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1439exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1439exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1439: expert mode
internal fun PlayerActivity.showV1439ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1439expert
    FeaturePrefsStore.batch1431.v1439expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1439: extra mode
internal fun PlayerActivity.showV1439ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1439extra
    FeaturePrefsStore.batch1431.v1439extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1439: fabric mode
internal fun PlayerActivity.showV1439FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1439fabric
    FeaturePrefsStore.batch1431.v1439fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1439: fact mode
internal fun PlayerActivity.showV1439FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1439fact
    FeaturePrefsStore.batch1431.v1439fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1439: fade mode
internal fun PlayerActivity.showV1439FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1439fade
    FeaturePrefsStore.batch1431.v1439fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

// v1440: event mode
internal fun PlayerActivity.showV1440EventToggle() {
    val current = FeaturePrefsStore.batch1431.v1440event
    FeaturePrefsStore.batch1431.v1440event = !current
    AppToast.show(this, "event: ${if (!current) "ON" else "OFF"}")
}

// v1440: every mode
internal fun PlayerActivity.showV1440EveryToggle() {
    val current = FeaturePrefsStore.batch1431.v1440every
    FeaturePrefsStore.batch1431.v1440every = !current
    AppToast.show(this, "every: ${if (!current) "ON" else "OFF"}")
}

// v1440: exact mode
internal fun PlayerActivity.showV1440ExactToggle() {
    val current = FeaturePrefsStore.batch1431.v1440exact
    FeaturePrefsStore.batch1431.v1440exact = !current
    AppToast.show(this, "exact: ${if (!current) "ON" else "OFF"}")
}

// v1440: exalt mode
internal fun PlayerActivity.showV1440ExaltToggle() {
    val current = FeaturePrefsStore.batch1431.v1440exalt
    FeaturePrefsStore.batch1431.v1440exalt = !current
    AppToast.show(this, "exalt: ${if (!current) "ON" else "OFF"}")
}

// v1440: exam mode
internal fun PlayerActivity.showV1440ExamToggle() {
    val current = FeaturePrefsStore.batch1431.v1440exam
    FeaturePrefsStore.batch1431.v1440exam = !current
    AppToast.show(this, "exam: ${if (!current) "ON" else "OFF"}")
}

// v1440: excel level
internal fun PlayerActivity.showV1440ExcelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1440excel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1440excel = value
        AppToast.show(this, "excel: $value")
    }
}

// v1440: except level
internal fun PlayerActivity.showV1440ExceptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1440except).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "except level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1440except = value
        AppToast.show(this, "except: $value")
    }
}

// v1440: excite level
internal fun PlayerActivity.showV1440ExciteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1440excite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1440excite = value
        AppToast.show(this, "excite: $value")
    }
}

// v1440: excuse level
internal fun PlayerActivity.showV1440ExcuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1440excuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1440excuse = value
        AppToast.show(this, "excuse: $value")
    }
}

// v1440: exist level
internal fun PlayerActivity.showV1440ExistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1431.v1440exist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1431.v1440exist = value
        AppToast.show(this, "exist: $value")
    }
}

// v1440: expert mode
internal fun PlayerActivity.showV1440ExpertToggle() {
    val current = FeaturePrefsStore.batch1431.v1440expert
    FeaturePrefsStore.batch1431.v1440expert = !current
    AppToast.show(this, "expert: ${if (!current) "ON" else "OFF"}")
}

// v1440: extra mode
internal fun PlayerActivity.showV1440ExtraToggle() {
    val current = FeaturePrefsStore.batch1431.v1440extra
    FeaturePrefsStore.batch1431.v1440extra = !current
    AppToast.show(this, "extra: ${if (!current) "ON" else "OFF"}")
}

// v1440: fabric mode
internal fun PlayerActivity.showV1440FabricToggle() {
    val current = FeaturePrefsStore.batch1431.v1440fabric
    FeaturePrefsStore.batch1431.v1440fabric = !current
    AppToast.show(this, "fabric: ${if (!current) "ON" else "OFF"}")
}

// v1440: fact mode
internal fun PlayerActivity.showV1440FactToggle() {
    val current = FeaturePrefsStore.batch1431.v1440fact
    FeaturePrefsStore.batch1431.v1440fact = !current
    AppToast.show(this, "fact: ${if (!current) "ON" else "OFF"}")
}

// v1440: fade mode
internal fun PlayerActivity.showV1440FadeToggle() {
    val current = FeaturePrefsStore.batch1431.v1440fade
    FeaturePrefsStore.batch1431.v1440fade = !current
    AppToast.show(this, "fade: ${if (!current) "ON" else "OFF"}")
}

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

// v1451: fever mode
internal fun PlayerActivity.showV1451FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fever
    FeaturePrefsStore.batch1451.v1451fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1451: few mode
internal fun PlayerActivity.showV1451FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1451few
    FeaturePrefsStore.batch1451.v1451few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1451: fiber mode
internal fun PlayerActivity.showV1451FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fiber
    FeaturePrefsStore.batch1451.v1451fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1451: fifth mode
internal fun PlayerActivity.showV1451FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fifth
    FeaturePrefsStore.batch1451.v1451fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1451: fight mode
internal fun PlayerActivity.showV1451FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fight
    FeaturePrefsStore.batch1451.v1451fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1451: figure level
internal fun PlayerActivity.showV1451FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1451: film level
internal fun PlayerActivity.showV1451FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451film = value
        AppToast.show(this, "film: $value")
    }
}

// v1451: fine level
internal fun PlayerActivity.showV1451FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1451: firm level
internal fun PlayerActivity.showV1451FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1451: fiscal level
internal fun PlayerActivity.showV1451FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1451fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1451fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1451: fish mode
internal fun PlayerActivity.showV1451FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fish
    FeaturePrefsStore.batch1451.v1451fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1451: fist mode
internal fun PlayerActivity.showV1451FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fist
    FeaturePrefsStore.batch1451.v1451fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1451: five mode
internal fun PlayerActivity.showV1451FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1451five
    FeaturePrefsStore.batch1451.v1451five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1451: fixed mode
internal fun PlayerActivity.showV1451FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1451fixed
    FeaturePrefsStore.batch1451.v1451fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1451: flame mode
internal fun PlayerActivity.showV1451FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1451flame
    FeaturePrefsStore.batch1451.v1451flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1452: fever mode
internal fun PlayerActivity.showV1452FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fever
    FeaturePrefsStore.batch1451.v1452fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1452: few mode
internal fun PlayerActivity.showV1452FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1452few
    FeaturePrefsStore.batch1451.v1452few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1452: fiber mode
internal fun PlayerActivity.showV1452FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fiber
    FeaturePrefsStore.batch1451.v1452fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1452: fifth mode
internal fun PlayerActivity.showV1452FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fifth
    FeaturePrefsStore.batch1451.v1452fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1452: fight mode
internal fun PlayerActivity.showV1452FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fight
    FeaturePrefsStore.batch1451.v1452fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1452: figure level
internal fun PlayerActivity.showV1452FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1452: film level
internal fun PlayerActivity.showV1452FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452film = value
        AppToast.show(this, "film: $value")
    }
}

// v1452: fine level
internal fun PlayerActivity.showV1452FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1452: firm level
internal fun PlayerActivity.showV1452FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1452: fiscal level
internal fun PlayerActivity.showV1452FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1452fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1452fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1452: fish mode
internal fun PlayerActivity.showV1452FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fish
    FeaturePrefsStore.batch1451.v1452fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1452: fist mode
internal fun PlayerActivity.showV1452FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fist
    FeaturePrefsStore.batch1451.v1452fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1452: five mode
internal fun PlayerActivity.showV1452FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1452five
    FeaturePrefsStore.batch1451.v1452five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1452: fixed mode
internal fun PlayerActivity.showV1452FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1452fixed
    FeaturePrefsStore.batch1451.v1452fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1452: flame mode
internal fun PlayerActivity.showV1452FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1452flame
    FeaturePrefsStore.batch1451.v1452flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1453: fever mode
internal fun PlayerActivity.showV1453FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fever
    FeaturePrefsStore.batch1451.v1453fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1453: few mode
internal fun PlayerActivity.showV1453FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1453few
    FeaturePrefsStore.batch1451.v1453few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1453: fiber mode
internal fun PlayerActivity.showV1453FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fiber
    FeaturePrefsStore.batch1451.v1453fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1453: fifth mode
internal fun PlayerActivity.showV1453FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fifth
    FeaturePrefsStore.batch1451.v1453fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1453: fight mode
internal fun PlayerActivity.showV1453FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fight
    FeaturePrefsStore.batch1451.v1453fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1453: figure level
internal fun PlayerActivity.showV1453FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1453: film level
internal fun PlayerActivity.showV1453FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453film = value
        AppToast.show(this, "film: $value")
    }
}

// v1453: fine level
internal fun PlayerActivity.showV1453FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1453: firm level
internal fun PlayerActivity.showV1453FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1453: fiscal level
internal fun PlayerActivity.showV1453FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1453fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1453fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1453: fish mode
internal fun PlayerActivity.showV1453FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fish
    FeaturePrefsStore.batch1451.v1453fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1453: fist mode
internal fun PlayerActivity.showV1453FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fist
    FeaturePrefsStore.batch1451.v1453fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1453: five mode
internal fun PlayerActivity.showV1453FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1453five
    FeaturePrefsStore.batch1451.v1453five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1453: fixed mode
internal fun PlayerActivity.showV1453FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1453fixed
    FeaturePrefsStore.batch1451.v1453fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1453: flame mode
internal fun PlayerActivity.showV1453FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1453flame
    FeaturePrefsStore.batch1451.v1453flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1454: fever mode
internal fun PlayerActivity.showV1454FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fever
    FeaturePrefsStore.batch1451.v1454fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1454: few mode
internal fun PlayerActivity.showV1454FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1454few
    FeaturePrefsStore.batch1451.v1454few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1454: fiber mode
internal fun PlayerActivity.showV1454FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fiber
    FeaturePrefsStore.batch1451.v1454fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1454: fifth mode
internal fun PlayerActivity.showV1454FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fifth
    FeaturePrefsStore.batch1451.v1454fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1454: fight mode
internal fun PlayerActivity.showV1454FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fight
    FeaturePrefsStore.batch1451.v1454fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1454: figure level
internal fun PlayerActivity.showV1454FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1454: film level
internal fun PlayerActivity.showV1454FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454film = value
        AppToast.show(this, "film: $value")
    }
}

// v1454: fine level
internal fun PlayerActivity.showV1454FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1454: firm level
internal fun PlayerActivity.showV1454FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1454: fiscal level
internal fun PlayerActivity.showV1454FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1454fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1454fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1454: fish mode
internal fun PlayerActivity.showV1454FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fish
    FeaturePrefsStore.batch1451.v1454fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1454: fist mode
internal fun PlayerActivity.showV1454FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fist
    FeaturePrefsStore.batch1451.v1454fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1454: five mode
internal fun PlayerActivity.showV1454FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1454five
    FeaturePrefsStore.batch1451.v1454five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1454: fixed mode
internal fun PlayerActivity.showV1454FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1454fixed
    FeaturePrefsStore.batch1451.v1454fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1454: flame mode
internal fun PlayerActivity.showV1454FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1454flame
    FeaturePrefsStore.batch1451.v1454flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1455: fever mode
internal fun PlayerActivity.showV1455FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fever
    FeaturePrefsStore.batch1451.v1455fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1455: few mode
internal fun PlayerActivity.showV1455FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1455few
    FeaturePrefsStore.batch1451.v1455few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1455: fiber mode
internal fun PlayerActivity.showV1455FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fiber
    FeaturePrefsStore.batch1451.v1455fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1455: fifth mode
internal fun PlayerActivity.showV1455FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fifth
    FeaturePrefsStore.batch1451.v1455fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1455: fight mode
internal fun PlayerActivity.showV1455FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fight
    FeaturePrefsStore.batch1451.v1455fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1455: figure level
internal fun PlayerActivity.showV1455FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1455: film level
internal fun PlayerActivity.showV1455FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455film = value
        AppToast.show(this, "film: $value")
    }
}

// v1455: fine level
internal fun PlayerActivity.showV1455FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1455: firm level
internal fun PlayerActivity.showV1455FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1455: fiscal level
internal fun PlayerActivity.showV1455FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1455fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1455fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1455: fish mode
internal fun PlayerActivity.showV1455FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fish
    FeaturePrefsStore.batch1451.v1455fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1455: fist mode
internal fun PlayerActivity.showV1455FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fist
    FeaturePrefsStore.batch1451.v1455fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1455: five mode
internal fun PlayerActivity.showV1455FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1455five
    FeaturePrefsStore.batch1451.v1455five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1455: fixed mode
internal fun PlayerActivity.showV1455FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1455fixed
    FeaturePrefsStore.batch1451.v1455fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1455: flame mode
internal fun PlayerActivity.showV1455FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1455flame
    FeaturePrefsStore.batch1451.v1455flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1456: fever mode
internal fun PlayerActivity.showV1456FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fever
    FeaturePrefsStore.batch1451.v1456fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1456: few mode
internal fun PlayerActivity.showV1456FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1456few
    FeaturePrefsStore.batch1451.v1456few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1456: fiber mode
internal fun PlayerActivity.showV1456FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fiber
    FeaturePrefsStore.batch1451.v1456fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1456: fifth mode
internal fun PlayerActivity.showV1456FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fifth
    FeaturePrefsStore.batch1451.v1456fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1456: fight mode
internal fun PlayerActivity.showV1456FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fight
    FeaturePrefsStore.batch1451.v1456fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1456: figure level
internal fun PlayerActivity.showV1456FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1456: film level
internal fun PlayerActivity.showV1456FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456film = value
        AppToast.show(this, "film: $value")
    }
}

// v1456: fine level
internal fun PlayerActivity.showV1456FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1456: firm level
internal fun PlayerActivity.showV1456FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1456: fiscal level
internal fun PlayerActivity.showV1456FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1456fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1456fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1456: fish mode
internal fun PlayerActivity.showV1456FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fish
    FeaturePrefsStore.batch1451.v1456fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1456: fist mode
internal fun PlayerActivity.showV1456FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fist
    FeaturePrefsStore.batch1451.v1456fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1456: five mode
internal fun PlayerActivity.showV1456FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1456five
    FeaturePrefsStore.batch1451.v1456five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1456: fixed mode
internal fun PlayerActivity.showV1456FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1456fixed
    FeaturePrefsStore.batch1451.v1456fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1456: flame mode
internal fun PlayerActivity.showV1456FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1456flame
    FeaturePrefsStore.batch1451.v1456flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1457: fever mode
internal fun PlayerActivity.showV1457FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fever
    FeaturePrefsStore.batch1451.v1457fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1457: few mode
internal fun PlayerActivity.showV1457FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1457few
    FeaturePrefsStore.batch1451.v1457few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1457: fiber mode
internal fun PlayerActivity.showV1457FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fiber
    FeaturePrefsStore.batch1451.v1457fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1457: fifth mode
internal fun PlayerActivity.showV1457FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fifth
    FeaturePrefsStore.batch1451.v1457fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1457: fight mode
internal fun PlayerActivity.showV1457FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fight
    FeaturePrefsStore.batch1451.v1457fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1457: figure level
internal fun PlayerActivity.showV1457FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1457: film level
internal fun PlayerActivity.showV1457FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457film = value
        AppToast.show(this, "film: $value")
    }
}

// v1457: fine level
internal fun PlayerActivity.showV1457FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1457: firm level
internal fun PlayerActivity.showV1457FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1457: fiscal level
internal fun PlayerActivity.showV1457FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1457fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1457fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1457: fish mode
internal fun PlayerActivity.showV1457FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fish
    FeaturePrefsStore.batch1451.v1457fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1457: fist mode
internal fun PlayerActivity.showV1457FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fist
    FeaturePrefsStore.batch1451.v1457fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1457: five mode
internal fun PlayerActivity.showV1457FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1457five
    FeaturePrefsStore.batch1451.v1457five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1457: fixed mode
internal fun PlayerActivity.showV1457FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1457fixed
    FeaturePrefsStore.batch1451.v1457fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1457: flame mode
internal fun PlayerActivity.showV1457FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1457flame
    FeaturePrefsStore.batch1451.v1457flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1458: fever mode
internal fun PlayerActivity.showV1458FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fever
    FeaturePrefsStore.batch1451.v1458fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1458: few mode
internal fun PlayerActivity.showV1458FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1458few
    FeaturePrefsStore.batch1451.v1458few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1458: fiber mode
internal fun PlayerActivity.showV1458FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fiber
    FeaturePrefsStore.batch1451.v1458fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1458: fifth mode
internal fun PlayerActivity.showV1458FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fifth
    FeaturePrefsStore.batch1451.v1458fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1458: fight mode
internal fun PlayerActivity.showV1458FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fight
    FeaturePrefsStore.batch1451.v1458fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1458: figure level
internal fun PlayerActivity.showV1458FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1458: film level
internal fun PlayerActivity.showV1458FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458film = value
        AppToast.show(this, "film: $value")
    }
}

// v1458: fine level
internal fun PlayerActivity.showV1458FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1458: firm level
internal fun PlayerActivity.showV1458FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1458: fiscal level
internal fun PlayerActivity.showV1458FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1458fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1458fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1458: fish mode
internal fun PlayerActivity.showV1458FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fish
    FeaturePrefsStore.batch1451.v1458fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1458: fist mode
internal fun PlayerActivity.showV1458FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fist
    FeaturePrefsStore.batch1451.v1458fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1458: five mode
internal fun PlayerActivity.showV1458FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1458five
    FeaturePrefsStore.batch1451.v1458five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1458: fixed mode
internal fun PlayerActivity.showV1458FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1458fixed
    FeaturePrefsStore.batch1451.v1458fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1458: flame mode
internal fun PlayerActivity.showV1458FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1458flame
    FeaturePrefsStore.batch1451.v1458flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1459: fever mode
internal fun PlayerActivity.showV1459FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fever
    FeaturePrefsStore.batch1451.v1459fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1459: few mode
internal fun PlayerActivity.showV1459FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1459few
    FeaturePrefsStore.batch1451.v1459few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1459: fiber mode
internal fun PlayerActivity.showV1459FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fiber
    FeaturePrefsStore.batch1451.v1459fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1459: fifth mode
internal fun PlayerActivity.showV1459FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fifth
    FeaturePrefsStore.batch1451.v1459fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1459: fight mode
internal fun PlayerActivity.showV1459FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fight
    FeaturePrefsStore.batch1451.v1459fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1459: figure level
internal fun PlayerActivity.showV1459FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1459: film level
internal fun PlayerActivity.showV1459FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459film = value
        AppToast.show(this, "film: $value")
    }
}

// v1459: fine level
internal fun PlayerActivity.showV1459FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1459: firm level
internal fun PlayerActivity.showV1459FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1459: fiscal level
internal fun PlayerActivity.showV1459FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1459fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1459fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1459: fish mode
internal fun PlayerActivity.showV1459FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fish
    FeaturePrefsStore.batch1451.v1459fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1459: fist mode
internal fun PlayerActivity.showV1459FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fist
    FeaturePrefsStore.batch1451.v1459fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1459: five mode
internal fun PlayerActivity.showV1459FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1459five
    FeaturePrefsStore.batch1451.v1459five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1459: fixed mode
internal fun PlayerActivity.showV1459FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1459fixed
    FeaturePrefsStore.batch1451.v1459fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1459: flame mode
internal fun PlayerActivity.showV1459FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1459flame
    FeaturePrefsStore.batch1451.v1459flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}

// v1460: fever mode
internal fun PlayerActivity.showV1460FeverToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fever
    FeaturePrefsStore.batch1451.v1460fever = !current
    AppToast.show(this, "fever: ${if (!current) "ON" else "OFF"}")
}

// v1460: few mode
internal fun PlayerActivity.showV1460FewToggle() {
    val current = FeaturePrefsStore.batch1451.v1460few
    FeaturePrefsStore.batch1451.v1460few = !current
    AppToast.show(this, "few: ${if (!current) "ON" else "OFF"}")
}

// v1460: fiber mode
internal fun PlayerActivity.showV1460FiberToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fiber
    FeaturePrefsStore.batch1451.v1460fiber = !current
    AppToast.show(this, "fiber: ${if (!current) "ON" else "OFF"}")
}

// v1460: fifth mode
internal fun PlayerActivity.showV1460FifthToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fifth
    FeaturePrefsStore.batch1451.v1460fifth = !current
    AppToast.show(this, "fifth: ${if (!current) "ON" else "OFF"}")
}

// v1460: fight mode
internal fun PlayerActivity.showV1460FightToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fight
    FeaturePrefsStore.batch1451.v1460fight = !current
    AppToast.show(this, "fight: ${if (!current) "ON" else "OFF"}")
}

// v1460: figure level
internal fun PlayerActivity.showV1460FigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460figure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "figure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460figure = value
        AppToast.show(this, "figure: $value")
    }
}

// v1460: film level
internal fun PlayerActivity.showV1460FilmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460film).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "film level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460film = value
        AppToast.show(this, "film: $value")
    }
}

// v1460: fine level
internal fun PlayerActivity.showV1460FineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460fine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460fine = value
        AppToast.show(this, "fine: $value")
    }
}

// v1460: firm level
internal fun PlayerActivity.showV1460FirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460firm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "firm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460firm = value
        AppToast.show(this, "firm: $value")
    }
}

// v1460: fiscal level
internal fun PlayerActivity.showV1460FiscalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1451.v1460fiscal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fiscal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1451.v1460fiscal = value
        AppToast.show(this, "fiscal: $value")
    }
}

// v1460: fish mode
internal fun PlayerActivity.showV1460FishToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fish
    FeaturePrefsStore.batch1451.v1460fish = !current
    AppToast.show(this, "fish: ${if (!current) "ON" else "OFF"}")
}

// v1460: fist mode
internal fun PlayerActivity.showV1460FistToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fist
    FeaturePrefsStore.batch1451.v1460fist = !current
    AppToast.show(this, "fist: ${if (!current) "ON" else "OFF"}")
}

// v1460: five mode
internal fun PlayerActivity.showV1460FiveToggle() {
    val current = FeaturePrefsStore.batch1451.v1460five
    FeaturePrefsStore.batch1451.v1460five = !current
    AppToast.show(this, "five: ${if (!current) "ON" else "OFF"}")
}

// v1460: fixed mode
internal fun PlayerActivity.showV1460FixedToggle() {
    val current = FeaturePrefsStore.batch1451.v1460fixed
    FeaturePrefsStore.batch1451.v1460fixed = !current
    AppToast.show(this, "fixed: ${if (!current) "ON" else "OFF"}")
}

// v1460: flame mode
internal fun PlayerActivity.showV1460FlameToggle() {
    val current = FeaturePrefsStore.batch1451.v1460flame
    FeaturePrefsStore.batch1451.v1460flame = !current
    AppToast.show(this, "flame: ${if (!current) "ON" else "OFF"}")
}
