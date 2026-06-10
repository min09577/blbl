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

