package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1551: husband mode
internal fun PlayerActivity.showV1551HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1551husband
    FeaturePrefsStore.batch1551.v1551husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1551: hybrid mode
internal fun PlayerActivity.showV1551HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1551hybrid
    FeaturePrefsStore.batch1551.v1551hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1551: ice mode
internal fun PlayerActivity.showV1551IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1551ice
    FeaturePrefsStore.batch1551.v1551ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1551: idea mode
internal fun PlayerActivity.showV1551IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1551idea
    FeaturePrefsStore.batch1551.v1551idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1551: identify mode
internal fun PlayerActivity.showV1551IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1551identify
    FeaturePrefsStore.batch1551.v1551identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1551: impact level
internal fun PlayerActivity.showV1551ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1551: impose level
internal fun PlayerActivity.showV1551ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1551: improve level
internal fun PlayerActivity.showV1551ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1551: inch level
internal fun PlayerActivity.showV1551InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1551: include level
internal fun PlayerActivity.showV1551IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1551include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1551include = value
        AppToast.show(this, "include: $value")
    }
}

// v1551: income mode
internal fun PlayerActivity.showV1551IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1551income
    FeaturePrefsStore.batch1551.v1551income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1551: indicate mode
internal fun PlayerActivity.showV1551IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1551indicate
    FeaturePrefsStore.batch1551.v1551indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1551: indoor mode
internal fun PlayerActivity.showV1551IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1551indoor
    FeaturePrefsStore.batch1551.v1551indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1551: industry mode
internal fun PlayerActivity.showV1551IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1551industry
    FeaturePrefsStore.batch1551.v1551industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1551: infant mode
internal fun PlayerActivity.showV1551InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1551infant
    FeaturePrefsStore.batch1551.v1551infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1552: husband mode
internal fun PlayerActivity.showV1552HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1552husband
    FeaturePrefsStore.batch1551.v1552husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1552: hybrid mode
internal fun PlayerActivity.showV1552HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1552hybrid
    FeaturePrefsStore.batch1551.v1552hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1552: ice mode
internal fun PlayerActivity.showV1552IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1552ice
    FeaturePrefsStore.batch1551.v1552ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1552: idea mode
internal fun PlayerActivity.showV1552IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1552idea
    FeaturePrefsStore.batch1551.v1552idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1552: identify mode
internal fun PlayerActivity.showV1552IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1552identify
    FeaturePrefsStore.batch1551.v1552identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1552: impact level
internal fun PlayerActivity.showV1552ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1552: impose level
internal fun PlayerActivity.showV1552ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1552: improve level
internal fun PlayerActivity.showV1552ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1552: inch level
internal fun PlayerActivity.showV1552InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1552: include level
internal fun PlayerActivity.showV1552IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1552include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1552include = value
        AppToast.show(this, "include: $value")
    }
}

// v1552: income mode
internal fun PlayerActivity.showV1552IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1552income
    FeaturePrefsStore.batch1551.v1552income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1552: indicate mode
internal fun PlayerActivity.showV1552IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1552indicate
    FeaturePrefsStore.batch1551.v1552indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1552: indoor mode
internal fun PlayerActivity.showV1552IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1552indoor
    FeaturePrefsStore.batch1551.v1552indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1552: industry mode
internal fun PlayerActivity.showV1552IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1552industry
    FeaturePrefsStore.batch1551.v1552industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1552: infant mode
internal fun PlayerActivity.showV1552InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1552infant
    FeaturePrefsStore.batch1551.v1552infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1553: husband mode
internal fun PlayerActivity.showV1553HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1553husband
    FeaturePrefsStore.batch1551.v1553husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1553: hybrid mode
internal fun PlayerActivity.showV1553HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1553hybrid
    FeaturePrefsStore.batch1551.v1553hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1553: ice mode
internal fun PlayerActivity.showV1553IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1553ice
    FeaturePrefsStore.batch1551.v1553ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1553: idea mode
internal fun PlayerActivity.showV1553IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1553idea
    FeaturePrefsStore.batch1551.v1553idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1553: identify mode
internal fun PlayerActivity.showV1553IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1553identify
    FeaturePrefsStore.batch1551.v1553identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1553: impact level
internal fun PlayerActivity.showV1553ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1553: impose level
internal fun PlayerActivity.showV1553ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1553: improve level
internal fun PlayerActivity.showV1553ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1553: inch level
internal fun PlayerActivity.showV1553InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1553: include level
internal fun PlayerActivity.showV1553IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1553include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1553include = value
        AppToast.show(this, "include: $value")
    }
}

// v1553: income mode
internal fun PlayerActivity.showV1553IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1553income
    FeaturePrefsStore.batch1551.v1553income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1553: indicate mode
internal fun PlayerActivity.showV1553IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1553indicate
    FeaturePrefsStore.batch1551.v1553indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1553: indoor mode
internal fun PlayerActivity.showV1553IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1553indoor
    FeaturePrefsStore.batch1551.v1553indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1553: industry mode
internal fun PlayerActivity.showV1553IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1553industry
    FeaturePrefsStore.batch1551.v1553industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1553: infant mode
internal fun PlayerActivity.showV1553InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1553infant
    FeaturePrefsStore.batch1551.v1553infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1554: husband mode
internal fun PlayerActivity.showV1554HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1554husband
    FeaturePrefsStore.batch1551.v1554husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1554: hybrid mode
internal fun PlayerActivity.showV1554HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1554hybrid
    FeaturePrefsStore.batch1551.v1554hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1554: ice mode
internal fun PlayerActivity.showV1554IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1554ice
    FeaturePrefsStore.batch1551.v1554ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1554: idea mode
internal fun PlayerActivity.showV1554IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1554idea
    FeaturePrefsStore.batch1551.v1554idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1554: identify mode
internal fun PlayerActivity.showV1554IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1554identify
    FeaturePrefsStore.batch1551.v1554identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1554: impact level
internal fun PlayerActivity.showV1554ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1554: impose level
internal fun PlayerActivity.showV1554ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1554: improve level
internal fun PlayerActivity.showV1554ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1554: inch level
internal fun PlayerActivity.showV1554InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1554: include level
internal fun PlayerActivity.showV1554IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1554include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1554include = value
        AppToast.show(this, "include: $value")
    }
}

// v1554: income mode
internal fun PlayerActivity.showV1554IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1554income
    FeaturePrefsStore.batch1551.v1554income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1554: indicate mode
internal fun PlayerActivity.showV1554IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1554indicate
    FeaturePrefsStore.batch1551.v1554indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1554: indoor mode
internal fun PlayerActivity.showV1554IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1554indoor
    FeaturePrefsStore.batch1551.v1554indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1554: industry mode
internal fun PlayerActivity.showV1554IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1554industry
    FeaturePrefsStore.batch1551.v1554industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1554: infant mode
internal fun PlayerActivity.showV1554InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1554infant
    FeaturePrefsStore.batch1551.v1554infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1555: husband mode
internal fun PlayerActivity.showV1555HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1555husband
    FeaturePrefsStore.batch1551.v1555husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1555: hybrid mode
internal fun PlayerActivity.showV1555HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1555hybrid
    FeaturePrefsStore.batch1551.v1555hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1555: ice mode
internal fun PlayerActivity.showV1555IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1555ice
    FeaturePrefsStore.batch1551.v1555ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1555: idea mode
internal fun PlayerActivity.showV1555IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1555idea
    FeaturePrefsStore.batch1551.v1555idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1555: identify mode
internal fun PlayerActivity.showV1555IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1555identify
    FeaturePrefsStore.batch1551.v1555identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1555: impact level
internal fun PlayerActivity.showV1555ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1555: impose level
internal fun PlayerActivity.showV1555ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1555: improve level
internal fun PlayerActivity.showV1555ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1555: inch level
internal fun PlayerActivity.showV1555InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1555: include level
internal fun PlayerActivity.showV1555IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1555include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1555include = value
        AppToast.show(this, "include: $value")
    }
}

// v1555: income mode
internal fun PlayerActivity.showV1555IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1555income
    FeaturePrefsStore.batch1551.v1555income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1555: indicate mode
internal fun PlayerActivity.showV1555IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1555indicate
    FeaturePrefsStore.batch1551.v1555indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1555: indoor mode
internal fun PlayerActivity.showV1555IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1555indoor
    FeaturePrefsStore.batch1551.v1555indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1555: industry mode
internal fun PlayerActivity.showV1555IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1555industry
    FeaturePrefsStore.batch1551.v1555industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1555: infant mode
internal fun PlayerActivity.showV1555InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1555infant
    FeaturePrefsStore.batch1551.v1555infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1556: husband mode
internal fun PlayerActivity.showV1556HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1556husband
    FeaturePrefsStore.batch1551.v1556husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1556: hybrid mode
internal fun PlayerActivity.showV1556HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1556hybrid
    FeaturePrefsStore.batch1551.v1556hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1556: ice mode
internal fun PlayerActivity.showV1556IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1556ice
    FeaturePrefsStore.batch1551.v1556ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1556: idea mode
internal fun PlayerActivity.showV1556IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1556idea
    FeaturePrefsStore.batch1551.v1556idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1556: identify mode
internal fun PlayerActivity.showV1556IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1556identify
    FeaturePrefsStore.batch1551.v1556identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1556: impact level
internal fun PlayerActivity.showV1556ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1556: impose level
internal fun PlayerActivity.showV1556ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1556: improve level
internal fun PlayerActivity.showV1556ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1556: inch level
internal fun PlayerActivity.showV1556InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1556: include level
internal fun PlayerActivity.showV1556IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1556include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1556include = value
        AppToast.show(this, "include: $value")
    }
}

// v1556: income mode
internal fun PlayerActivity.showV1556IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1556income
    FeaturePrefsStore.batch1551.v1556income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1556: indicate mode
internal fun PlayerActivity.showV1556IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1556indicate
    FeaturePrefsStore.batch1551.v1556indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1556: indoor mode
internal fun PlayerActivity.showV1556IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1556indoor
    FeaturePrefsStore.batch1551.v1556indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1556: industry mode
internal fun PlayerActivity.showV1556IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1556industry
    FeaturePrefsStore.batch1551.v1556industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1556: infant mode
internal fun PlayerActivity.showV1556InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1556infant
    FeaturePrefsStore.batch1551.v1556infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1557: husband mode
internal fun PlayerActivity.showV1557HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1557husband
    FeaturePrefsStore.batch1551.v1557husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1557: hybrid mode
internal fun PlayerActivity.showV1557HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1557hybrid
    FeaturePrefsStore.batch1551.v1557hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1557: ice mode
internal fun PlayerActivity.showV1557IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1557ice
    FeaturePrefsStore.batch1551.v1557ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1557: idea mode
internal fun PlayerActivity.showV1557IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1557idea
    FeaturePrefsStore.batch1551.v1557idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1557: identify mode
internal fun PlayerActivity.showV1557IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1557identify
    FeaturePrefsStore.batch1551.v1557identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1557: impact level
internal fun PlayerActivity.showV1557ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1557: impose level
internal fun PlayerActivity.showV1557ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1557: improve level
internal fun PlayerActivity.showV1557ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1557: inch level
internal fun PlayerActivity.showV1557InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1557: include level
internal fun PlayerActivity.showV1557IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1557include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1557include = value
        AppToast.show(this, "include: $value")
    }
}

// v1557: income mode
internal fun PlayerActivity.showV1557IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1557income
    FeaturePrefsStore.batch1551.v1557income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1557: indicate mode
internal fun PlayerActivity.showV1557IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1557indicate
    FeaturePrefsStore.batch1551.v1557indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1557: indoor mode
internal fun PlayerActivity.showV1557IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1557indoor
    FeaturePrefsStore.batch1551.v1557indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1557: industry mode
internal fun PlayerActivity.showV1557IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1557industry
    FeaturePrefsStore.batch1551.v1557industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1557: infant mode
internal fun PlayerActivity.showV1557InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1557infant
    FeaturePrefsStore.batch1551.v1557infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1558: husband mode
internal fun PlayerActivity.showV1558HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1558husband
    FeaturePrefsStore.batch1551.v1558husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1558: hybrid mode
internal fun PlayerActivity.showV1558HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1558hybrid
    FeaturePrefsStore.batch1551.v1558hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1558: ice mode
internal fun PlayerActivity.showV1558IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1558ice
    FeaturePrefsStore.batch1551.v1558ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1558: idea mode
internal fun PlayerActivity.showV1558IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1558idea
    FeaturePrefsStore.batch1551.v1558idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1558: identify mode
internal fun PlayerActivity.showV1558IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1558identify
    FeaturePrefsStore.batch1551.v1558identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1558: impact level
internal fun PlayerActivity.showV1558ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1558: impose level
internal fun PlayerActivity.showV1558ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1558: improve level
internal fun PlayerActivity.showV1558ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1558: inch level
internal fun PlayerActivity.showV1558InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1558: include level
internal fun PlayerActivity.showV1558IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1558include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1558include = value
        AppToast.show(this, "include: $value")
    }
}

// v1558: income mode
internal fun PlayerActivity.showV1558IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1558income
    FeaturePrefsStore.batch1551.v1558income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1558: indicate mode
internal fun PlayerActivity.showV1558IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1558indicate
    FeaturePrefsStore.batch1551.v1558indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1558: indoor mode
internal fun PlayerActivity.showV1558IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1558indoor
    FeaturePrefsStore.batch1551.v1558indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1558: industry mode
internal fun PlayerActivity.showV1558IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1558industry
    FeaturePrefsStore.batch1551.v1558industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1558: infant mode
internal fun PlayerActivity.showV1558InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1558infant
    FeaturePrefsStore.batch1551.v1558infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1559: husband mode
internal fun PlayerActivity.showV1559HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1559husband
    FeaturePrefsStore.batch1551.v1559husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1559: hybrid mode
internal fun PlayerActivity.showV1559HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1559hybrid
    FeaturePrefsStore.batch1551.v1559hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1559: ice mode
internal fun PlayerActivity.showV1559IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1559ice
    FeaturePrefsStore.batch1551.v1559ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1559: idea mode
internal fun PlayerActivity.showV1559IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1559idea
    FeaturePrefsStore.batch1551.v1559idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1559: identify mode
internal fun PlayerActivity.showV1559IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1559identify
    FeaturePrefsStore.batch1551.v1559identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1559: impact level
internal fun PlayerActivity.showV1559ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1559: impose level
internal fun PlayerActivity.showV1559ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1559: improve level
internal fun PlayerActivity.showV1559ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1559: inch level
internal fun PlayerActivity.showV1559InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1559: include level
internal fun PlayerActivity.showV1559IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1559include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1559include = value
        AppToast.show(this, "include: $value")
    }
}

// v1559: income mode
internal fun PlayerActivity.showV1559IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1559income
    FeaturePrefsStore.batch1551.v1559income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1559: indicate mode
internal fun PlayerActivity.showV1559IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1559indicate
    FeaturePrefsStore.batch1551.v1559indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1559: indoor mode
internal fun PlayerActivity.showV1559IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1559indoor
    FeaturePrefsStore.batch1551.v1559indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1559: industry mode
internal fun PlayerActivity.showV1559IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1559industry
    FeaturePrefsStore.batch1551.v1559industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1559: infant mode
internal fun PlayerActivity.showV1559InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1559infant
    FeaturePrefsStore.batch1551.v1559infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

// v1560: husband mode
internal fun PlayerActivity.showV1560HusbandToggle() {
    val current = FeaturePrefsStore.batch1551.v1560husband
    FeaturePrefsStore.batch1551.v1560husband = !current
    AppToast.show(this, "husband: ${if (!current) "ON" else "OFF"}")
}

// v1560: hybrid mode
internal fun PlayerActivity.showV1560HybridToggle() {
    val current = FeaturePrefsStore.batch1551.v1560hybrid
    FeaturePrefsStore.batch1551.v1560hybrid = !current
    AppToast.show(this, "hybrid: ${if (!current) "ON" else "OFF"}")
}

// v1560: ice mode
internal fun PlayerActivity.showV1560IceToggle() {
    val current = FeaturePrefsStore.batch1551.v1560ice
    FeaturePrefsStore.batch1551.v1560ice = !current
    AppToast.show(this, "ice: ${if (!current) "ON" else "OFF"}")
}

// v1560: idea mode
internal fun PlayerActivity.showV1560IdeaToggle() {
    val current = FeaturePrefsStore.batch1551.v1560idea
    FeaturePrefsStore.batch1551.v1560idea = !current
    AppToast.show(this, "idea: ${if (!current) "ON" else "OFF"}")
}

// v1560: identify mode
internal fun PlayerActivity.showV1560IdentifyToggle() {
    val current = FeaturePrefsStore.batch1551.v1560identify
    FeaturePrefsStore.batch1551.v1560identify = !current
    AppToast.show(this, "identify: ${if (!current) "ON" else "OFF"}")
}

// v1560: impact level
internal fun PlayerActivity.showV1560ImpactDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560impact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560impact = value
        AppToast.show(this, "impact: $value")
    }
}

// v1560: impose level
internal fun PlayerActivity.showV1560ImposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560impose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "impose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560impose = value
        AppToast.show(this, "impose: $value")
    }
}

// v1560: improve level
internal fun PlayerActivity.showV1560ImproveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560improve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "improve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560improve = value
        AppToast.show(this, "improve: $value")
    }
}

// v1560: inch level
internal fun PlayerActivity.showV1560InchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560inch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560inch = value
        AppToast.show(this, "inch: $value")
    }
}

// v1560: include level
internal fun PlayerActivity.showV1560IncludeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1551.v1560include).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "include level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1551.v1560include = value
        AppToast.show(this, "include: $value")
    }
}

// v1560: income mode
internal fun PlayerActivity.showV1560IncomeToggle() {
    val current = FeaturePrefsStore.batch1551.v1560income
    FeaturePrefsStore.batch1551.v1560income = !current
    AppToast.show(this, "income: ${if (!current) "ON" else "OFF"}")
}

// v1560: indicate mode
internal fun PlayerActivity.showV1560IndicateToggle() {
    val current = FeaturePrefsStore.batch1551.v1560indicate
    FeaturePrefsStore.batch1551.v1560indicate = !current
    AppToast.show(this, "indicate: ${if (!current) "ON" else "OFF"}")
}

// v1560: indoor mode
internal fun PlayerActivity.showV1560IndoorToggle() {
    val current = FeaturePrefsStore.batch1551.v1560indoor
    FeaturePrefsStore.batch1551.v1560indoor = !current
    AppToast.show(this, "indoor: ${if (!current) "ON" else "OFF"}")
}

// v1560: industry mode
internal fun PlayerActivity.showV1560IndustryToggle() {
    val current = FeaturePrefsStore.batch1551.v1560industry
    FeaturePrefsStore.batch1551.v1560industry = !current
    AppToast.show(this, "industry: ${if (!current) "ON" else "OFF"}")
}

// v1560: infant mode
internal fun PlayerActivity.showV1560InfantToggle() {
    val current = FeaturePrefsStore.batch1551.v1560infant
    FeaturePrefsStore.batch1551.v1560infant = !current
    AppToast.show(this, "infant: ${if (!current) "ON" else "OFF"}")
}

