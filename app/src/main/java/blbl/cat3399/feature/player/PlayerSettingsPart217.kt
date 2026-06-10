package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2351: brilliant mode
internal fun PlayerActivity.showV2351BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2351brilliant
    FeaturePrefsStore.batch2351.v2351brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2351: brisk mode
internal fun PlayerActivity.showV2351BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2351brisk
    FeaturePrefsStore.batch2351.v2351brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2351: capable mode
internal fun PlayerActivity.showV2351CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2351capable
    FeaturePrefsStore.batch2351.v2351capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2351: careful mode
internal fun PlayerActivity.showV2351CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2351careful
    FeaturePrefsStore.batch2351.v2351careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2351: cautious mode
internal fun PlayerActivity.showV2351CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2351cautious
    FeaturePrefsStore.batch2351.v2351cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2351: charming level
internal fun PlayerActivity.showV2351CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2351: cheerful level
internal fun PlayerActivity.showV2351CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2351: chronic level
internal fun PlayerActivity.showV2351ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2351: civil level
internal fun PlayerActivity.showV2351CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2351: classic level
internal fun PlayerActivity.showV2351ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2351classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2351classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2351: clinical mode
internal fun PlayerActivity.showV2351ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2351clinical
    FeaturePrefsStore.batch2351.v2351clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2351: coherent mode
internal fun PlayerActivity.showV2351CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2351coherent
    FeaturePrefsStore.batch2351.v2351coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2351: colorful mode
internal fun PlayerActivity.showV2351ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2351colorful
    FeaturePrefsStore.batch2351.v2351colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2351: comfortable mode
internal fun PlayerActivity.showV2351ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2351comfortable
    FeaturePrefsStore.batch2351.v2351comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2351: compassionate mode
internal fun PlayerActivity.showV2351CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2351compassionate
    FeaturePrefsStore.batch2351.v2351compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2352: brilliant mode
internal fun PlayerActivity.showV2352BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2352brilliant
    FeaturePrefsStore.batch2351.v2352brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2352: brisk mode
internal fun PlayerActivity.showV2352BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2352brisk
    FeaturePrefsStore.batch2351.v2352brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2352: capable mode
internal fun PlayerActivity.showV2352CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2352capable
    FeaturePrefsStore.batch2351.v2352capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2352: careful mode
internal fun PlayerActivity.showV2352CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2352careful
    FeaturePrefsStore.batch2351.v2352careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2352: cautious mode
internal fun PlayerActivity.showV2352CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2352cautious
    FeaturePrefsStore.batch2351.v2352cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2352: charming level
internal fun PlayerActivity.showV2352CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2352: cheerful level
internal fun PlayerActivity.showV2352CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2352: chronic level
internal fun PlayerActivity.showV2352ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2352: civil level
internal fun PlayerActivity.showV2352CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2352: classic level
internal fun PlayerActivity.showV2352ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2352classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2352classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2352: clinical mode
internal fun PlayerActivity.showV2352ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2352clinical
    FeaturePrefsStore.batch2351.v2352clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2352: coherent mode
internal fun PlayerActivity.showV2352CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2352coherent
    FeaturePrefsStore.batch2351.v2352coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2352: colorful mode
internal fun PlayerActivity.showV2352ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2352colorful
    FeaturePrefsStore.batch2351.v2352colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2352: comfortable mode
internal fun PlayerActivity.showV2352ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2352comfortable
    FeaturePrefsStore.batch2351.v2352comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2352: compassionate mode
internal fun PlayerActivity.showV2352CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2352compassionate
    FeaturePrefsStore.batch2351.v2352compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2353: brilliant mode
internal fun PlayerActivity.showV2353BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2353brilliant
    FeaturePrefsStore.batch2351.v2353brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2353: brisk mode
internal fun PlayerActivity.showV2353BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2353brisk
    FeaturePrefsStore.batch2351.v2353brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2353: capable mode
internal fun PlayerActivity.showV2353CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2353capable
    FeaturePrefsStore.batch2351.v2353capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2353: careful mode
internal fun PlayerActivity.showV2353CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2353careful
    FeaturePrefsStore.batch2351.v2353careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2353: cautious mode
internal fun PlayerActivity.showV2353CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2353cautious
    FeaturePrefsStore.batch2351.v2353cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2353: charming level
internal fun PlayerActivity.showV2353CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2353: cheerful level
internal fun PlayerActivity.showV2353CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2353: chronic level
internal fun PlayerActivity.showV2353ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2353: civil level
internal fun PlayerActivity.showV2353CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2353: classic level
internal fun PlayerActivity.showV2353ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2353classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2353classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2353: clinical mode
internal fun PlayerActivity.showV2353ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2353clinical
    FeaturePrefsStore.batch2351.v2353clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2353: coherent mode
internal fun PlayerActivity.showV2353CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2353coherent
    FeaturePrefsStore.batch2351.v2353coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2353: colorful mode
internal fun PlayerActivity.showV2353ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2353colorful
    FeaturePrefsStore.batch2351.v2353colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2353: comfortable mode
internal fun PlayerActivity.showV2353ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2353comfortable
    FeaturePrefsStore.batch2351.v2353comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2353: compassionate mode
internal fun PlayerActivity.showV2353CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2353compassionate
    FeaturePrefsStore.batch2351.v2353compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2354: brilliant mode
internal fun PlayerActivity.showV2354BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2354brilliant
    FeaturePrefsStore.batch2351.v2354brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2354: brisk mode
internal fun PlayerActivity.showV2354BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2354brisk
    FeaturePrefsStore.batch2351.v2354brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2354: capable mode
internal fun PlayerActivity.showV2354CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2354capable
    FeaturePrefsStore.batch2351.v2354capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2354: careful mode
internal fun PlayerActivity.showV2354CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2354careful
    FeaturePrefsStore.batch2351.v2354careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2354: cautious mode
internal fun PlayerActivity.showV2354CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2354cautious
    FeaturePrefsStore.batch2351.v2354cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2354: charming level
internal fun PlayerActivity.showV2354CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2354: cheerful level
internal fun PlayerActivity.showV2354CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2354: chronic level
internal fun PlayerActivity.showV2354ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2354: civil level
internal fun PlayerActivity.showV2354CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2354: classic level
internal fun PlayerActivity.showV2354ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2354classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2354classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2354: clinical mode
internal fun PlayerActivity.showV2354ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2354clinical
    FeaturePrefsStore.batch2351.v2354clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2354: coherent mode
internal fun PlayerActivity.showV2354CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2354coherent
    FeaturePrefsStore.batch2351.v2354coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2354: colorful mode
internal fun PlayerActivity.showV2354ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2354colorful
    FeaturePrefsStore.batch2351.v2354colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2354: comfortable mode
internal fun PlayerActivity.showV2354ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2354comfortable
    FeaturePrefsStore.batch2351.v2354comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2354: compassionate mode
internal fun PlayerActivity.showV2354CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2354compassionate
    FeaturePrefsStore.batch2351.v2354compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2355: brilliant mode
internal fun PlayerActivity.showV2355BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2355brilliant
    FeaturePrefsStore.batch2351.v2355brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2355: brisk mode
internal fun PlayerActivity.showV2355BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2355brisk
    FeaturePrefsStore.batch2351.v2355brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2355: capable mode
internal fun PlayerActivity.showV2355CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2355capable
    FeaturePrefsStore.batch2351.v2355capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2355: careful mode
internal fun PlayerActivity.showV2355CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2355careful
    FeaturePrefsStore.batch2351.v2355careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2355: cautious mode
internal fun PlayerActivity.showV2355CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2355cautious
    FeaturePrefsStore.batch2351.v2355cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2355: charming level
internal fun PlayerActivity.showV2355CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2355: cheerful level
internal fun PlayerActivity.showV2355CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2355: chronic level
internal fun PlayerActivity.showV2355ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2355: civil level
internal fun PlayerActivity.showV2355CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2355: classic level
internal fun PlayerActivity.showV2355ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2355classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2355classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2355: clinical mode
internal fun PlayerActivity.showV2355ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2355clinical
    FeaturePrefsStore.batch2351.v2355clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2355: coherent mode
internal fun PlayerActivity.showV2355CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2355coherent
    FeaturePrefsStore.batch2351.v2355coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2355: colorful mode
internal fun PlayerActivity.showV2355ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2355colorful
    FeaturePrefsStore.batch2351.v2355colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2355: comfortable mode
internal fun PlayerActivity.showV2355ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2355comfortable
    FeaturePrefsStore.batch2351.v2355comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2355: compassionate mode
internal fun PlayerActivity.showV2355CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2355compassionate
    FeaturePrefsStore.batch2351.v2355compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2356: brilliant mode
internal fun PlayerActivity.showV2356BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2356brilliant
    FeaturePrefsStore.batch2351.v2356brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2356: brisk mode
internal fun PlayerActivity.showV2356BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2356brisk
    FeaturePrefsStore.batch2351.v2356brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2356: capable mode
internal fun PlayerActivity.showV2356CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2356capable
    FeaturePrefsStore.batch2351.v2356capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2356: careful mode
internal fun PlayerActivity.showV2356CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2356careful
    FeaturePrefsStore.batch2351.v2356careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2356: cautious mode
internal fun PlayerActivity.showV2356CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2356cautious
    FeaturePrefsStore.batch2351.v2356cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2356: charming level
internal fun PlayerActivity.showV2356CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2356: cheerful level
internal fun PlayerActivity.showV2356CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2356: chronic level
internal fun PlayerActivity.showV2356ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2356: civil level
internal fun PlayerActivity.showV2356CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2356: classic level
internal fun PlayerActivity.showV2356ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2356classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2356classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2356: clinical mode
internal fun PlayerActivity.showV2356ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2356clinical
    FeaturePrefsStore.batch2351.v2356clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2356: coherent mode
internal fun PlayerActivity.showV2356CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2356coherent
    FeaturePrefsStore.batch2351.v2356coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2356: colorful mode
internal fun PlayerActivity.showV2356ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2356colorful
    FeaturePrefsStore.batch2351.v2356colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2356: comfortable mode
internal fun PlayerActivity.showV2356ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2356comfortable
    FeaturePrefsStore.batch2351.v2356comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2356: compassionate mode
internal fun PlayerActivity.showV2356CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2356compassionate
    FeaturePrefsStore.batch2351.v2356compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2357: brilliant mode
internal fun PlayerActivity.showV2357BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2357brilliant
    FeaturePrefsStore.batch2351.v2357brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2357: brisk mode
internal fun PlayerActivity.showV2357BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2357brisk
    FeaturePrefsStore.batch2351.v2357brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2357: capable mode
internal fun PlayerActivity.showV2357CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2357capable
    FeaturePrefsStore.batch2351.v2357capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2357: careful mode
internal fun PlayerActivity.showV2357CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2357careful
    FeaturePrefsStore.batch2351.v2357careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2357: cautious mode
internal fun PlayerActivity.showV2357CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2357cautious
    FeaturePrefsStore.batch2351.v2357cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2357: charming level
internal fun PlayerActivity.showV2357CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2357: cheerful level
internal fun PlayerActivity.showV2357CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2357: chronic level
internal fun PlayerActivity.showV2357ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2357: civil level
internal fun PlayerActivity.showV2357CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2357: classic level
internal fun PlayerActivity.showV2357ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2357classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2357classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2357: clinical mode
internal fun PlayerActivity.showV2357ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2357clinical
    FeaturePrefsStore.batch2351.v2357clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2357: coherent mode
internal fun PlayerActivity.showV2357CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2357coherent
    FeaturePrefsStore.batch2351.v2357coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2357: colorful mode
internal fun PlayerActivity.showV2357ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2357colorful
    FeaturePrefsStore.batch2351.v2357colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2357: comfortable mode
internal fun PlayerActivity.showV2357ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2357comfortable
    FeaturePrefsStore.batch2351.v2357comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2357: compassionate mode
internal fun PlayerActivity.showV2357CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2357compassionate
    FeaturePrefsStore.batch2351.v2357compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2358: brilliant mode
internal fun PlayerActivity.showV2358BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2358brilliant
    FeaturePrefsStore.batch2351.v2358brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2358: brisk mode
internal fun PlayerActivity.showV2358BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2358brisk
    FeaturePrefsStore.batch2351.v2358brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2358: capable mode
internal fun PlayerActivity.showV2358CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2358capable
    FeaturePrefsStore.batch2351.v2358capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2358: careful mode
internal fun PlayerActivity.showV2358CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2358careful
    FeaturePrefsStore.batch2351.v2358careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2358: cautious mode
internal fun PlayerActivity.showV2358CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2358cautious
    FeaturePrefsStore.batch2351.v2358cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2358: charming level
internal fun PlayerActivity.showV2358CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2358: cheerful level
internal fun PlayerActivity.showV2358CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2358: chronic level
internal fun PlayerActivity.showV2358ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2358: civil level
internal fun PlayerActivity.showV2358CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2358: classic level
internal fun PlayerActivity.showV2358ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2358classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2358classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2358: clinical mode
internal fun PlayerActivity.showV2358ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2358clinical
    FeaturePrefsStore.batch2351.v2358clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2358: coherent mode
internal fun PlayerActivity.showV2358CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2358coherent
    FeaturePrefsStore.batch2351.v2358coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2358: colorful mode
internal fun PlayerActivity.showV2358ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2358colorful
    FeaturePrefsStore.batch2351.v2358colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2358: comfortable mode
internal fun PlayerActivity.showV2358ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2358comfortable
    FeaturePrefsStore.batch2351.v2358comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2358: compassionate mode
internal fun PlayerActivity.showV2358CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2358compassionate
    FeaturePrefsStore.batch2351.v2358compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2359: brilliant mode
internal fun PlayerActivity.showV2359BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2359brilliant
    FeaturePrefsStore.batch2351.v2359brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2359: brisk mode
internal fun PlayerActivity.showV2359BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2359brisk
    FeaturePrefsStore.batch2351.v2359brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2359: capable mode
internal fun PlayerActivity.showV2359CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2359capable
    FeaturePrefsStore.batch2351.v2359capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2359: careful mode
internal fun PlayerActivity.showV2359CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2359careful
    FeaturePrefsStore.batch2351.v2359careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2359: cautious mode
internal fun PlayerActivity.showV2359CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2359cautious
    FeaturePrefsStore.batch2351.v2359cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2359: charming level
internal fun PlayerActivity.showV2359CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2359: cheerful level
internal fun PlayerActivity.showV2359CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2359: chronic level
internal fun PlayerActivity.showV2359ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2359: civil level
internal fun PlayerActivity.showV2359CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2359: classic level
internal fun PlayerActivity.showV2359ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2359classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2359classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2359: clinical mode
internal fun PlayerActivity.showV2359ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2359clinical
    FeaturePrefsStore.batch2351.v2359clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2359: coherent mode
internal fun PlayerActivity.showV2359CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2359coherent
    FeaturePrefsStore.batch2351.v2359coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2359: colorful mode
internal fun PlayerActivity.showV2359ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2359colorful
    FeaturePrefsStore.batch2351.v2359colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2359: comfortable mode
internal fun PlayerActivity.showV2359ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2359comfortable
    FeaturePrefsStore.batch2351.v2359comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2359: compassionate mode
internal fun PlayerActivity.showV2359CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2359compassionate
    FeaturePrefsStore.batch2351.v2359compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

// v2360: brilliant mode
internal fun PlayerActivity.showV2360BrilliantToggle() {
    val current = FeaturePrefsStore.batch2351.v2360brilliant
    FeaturePrefsStore.batch2351.v2360brilliant = !current
    AppToast.show(this, "brilliant: ${if (!current) "ON" else "OFF"}")
}

// v2360: brisk mode
internal fun PlayerActivity.showV2360BriskToggle() {
    val current = FeaturePrefsStore.batch2351.v2360brisk
    FeaturePrefsStore.batch2351.v2360brisk = !current
    AppToast.show(this, "brisk: ${if (!current) "ON" else "OFF"}")
}

// v2360: capable mode
internal fun PlayerActivity.showV2360CapableToggle() {
    val current = FeaturePrefsStore.batch2351.v2360capable
    FeaturePrefsStore.batch2351.v2360capable = !current
    AppToast.show(this, "capable: ${if (!current) "ON" else "OFF"}")
}

// v2360: careful mode
internal fun PlayerActivity.showV2360CarefulToggle() {
    val current = FeaturePrefsStore.batch2351.v2360careful
    FeaturePrefsStore.batch2351.v2360careful = !current
    AppToast.show(this, "careful: ${if (!current) "ON" else "OFF"}")
}

// v2360: cautious mode
internal fun PlayerActivity.showV2360CautiousToggle() {
    val current = FeaturePrefsStore.batch2351.v2360cautious
    FeaturePrefsStore.batch2351.v2360cautious = !current
    AppToast.show(this, "cautious: ${if (!current) "ON" else "OFF"}")
}

// v2360: charming level
internal fun PlayerActivity.showV2360CharmingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360charming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "charming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360charming = value
        AppToast.show(this, "charming: $value")
    }
}

// v2360: cheerful level
internal fun PlayerActivity.showV2360CheerfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360cheerful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cheerful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360cheerful = value
        AppToast.show(this, "cheerful: $value")
    }
}

// v2360: chronic level
internal fun PlayerActivity.showV2360ChronicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360chronic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chronic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360chronic = value
        AppToast.show(this, "chronic: $value")
    }
}

// v2360: civil level
internal fun PlayerActivity.showV2360CivilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360civil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "civil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360civil = value
        AppToast.show(this, "civil: $value")
    }
}

// v2360: classic level
internal fun PlayerActivity.showV2360ClassicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2351.v2360classic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "classic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2351.v2360classic = value
        AppToast.show(this, "classic: $value")
    }
}

// v2360: clinical mode
internal fun PlayerActivity.showV2360ClinicalToggle() {
    val current = FeaturePrefsStore.batch2351.v2360clinical
    FeaturePrefsStore.batch2351.v2360clinical = !current
    AppToast.show(this, "clinical: ${if (!current) "ON" else "OFF"}")
}

// v2360: coherent mode
internal fun PlayerActivity.showV2360CoherentToggle() {
    val current = FeaturePrefsStore.batch2351.v2360coherent
    FeaturePrefsStore.batch2351.v2360coherent = !current
    AppToast.show(this, "coherent: ${if (!current) "ON" else "OFF"}")
}

// v2360: colorful mode
internal fun PlayerActivity.showV2360ColorfulToggle() {
    val current = FeaturePrefsStore.batch2351.v2360colorful
    FeaturePrefsStore.batch2351.v2360colorful = !current
    AppToast.show(this, "colorful: ${if (!current) "ON" else "OFF"}")
}

// v2360: comfortable mode
internal fun PlayerActivity.showV2360ComfortableToggle() {
    val current = FeaturePrefsStore.batch2351.v2360comfortable
    FeaturePrefsStore.batch2351.v2360comfortable = !current
    AppToast.show(this, "comfortable: ${if (!current) "ON" else "OFF"}")
}

// v2360: compassionate mode
internal fun PlayerActivity.showV2360CompassionateToggle() {
    val current = FeaturePrefsStore.batch2351.v2360compassionate
    FeaturePrefsStore.batch2351.v2360compassionate = !current
    AppToast.show(this, "compassionate: ${if (!current) "ON" else "OFF"}")
}

