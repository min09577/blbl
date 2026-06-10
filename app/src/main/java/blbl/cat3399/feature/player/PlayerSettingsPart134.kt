package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1521: happen mode
internal fun PlayerActivity.showV1521HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1521happen
    FeaturePrefsStore.batch1521.v1521happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1521: happy mode
internal fun PlayerActivity.showV1521HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1521happy
    FeaturePrefsStore.batch1521.v1521happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1521: harbor mode
internal fun PlayerActivity.showV1521HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1521harbor
    FeaturePrefsStore.batch1521.v1521harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1521: hard mode
internal fun PlayerActivity.showV1521HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1521hard
    FeaturePrefsStore.batch1521.v1521hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1521: harm mode
internal fun PlayerActivity.showV1521HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1521harm
    FeaturePrefsStore.batch1521.v1521harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1521: harvest level
internal fun PlayerActivity.showV1521HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1521: hat level
internal fun PlayerActivity.showV1521HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1521: have level
internal fun PlayerActivity.showV1521HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521have = value
        AppToast.show(this, "have: $value")
    }
}

// v1521: hawk level
internal fun PlayerActivity.showV1521HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1521: hazard level
internal fun PlayerActivity.showV1521HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1521hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1521hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1521: health mode
internal fun PlayerActivity.showV1521HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1521health
    FeaturePrefsStore.batch1521.v1521health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1521: heart mode
internal fun PlayerActivity.showV1521HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1521heart
    FeaturePrefsStore.batch1521.v1521heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1521: heavy mode
internal fun PlayerActivity.showV1521HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1521heavy
    FeaturePrefsStore.batch1521.v1521heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1521: hedge mode
internal fun PlayerActivity.showV1521HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1521hedge
    FeaturePrefsStore.batch1521.v1521hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1521: helmet mode
internal fun PlayerActivity.showV1521HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1521helmet
    FeaturePrefsStore.batch1521.v1521helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1522: happen mode
internal fun PlayerActivity.showV1522HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1522happen
    FeaturePrefsStore.batch1521.v1522happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1522: happy mode
internal fun PlayerActivity.showV1522HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1522happy
    FeaturePrefsStore.batch1521.v1522happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1522: harbor mode
internal fun PlayerActivity.showV1522HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1522harbor
    FeaturePrefsStore.batch1521.v1522harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1522: hard mode
internal fun PlayerActivity.showV1522HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1522hard
    FeaturePrefsStore.batch1521.v1522hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1522: harm mode
internal fun PlayerActivity.showV1522HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1522harm
    FeaturePrefsStore.batch1521.v1522harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1522: harvest level
internal fun PlayerActivity.showV1522HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1522: hat level
internal fun PlayerActivity.showV1522HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1522: have level
internal fun PlayerActivity.showV1522HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522have = value
        AppToast.show(this, "have: $value")
    }
}

// v1522: hawk level
internal fun PlayerActivity.showV1522HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1522: hazard level
internal fun PlayerActivity.showV1522HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1522hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1522hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1522: health mode
internal fun PlayerActivity.showV1522HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1522health
    FeaturePrefsStore.batch1521.v1522health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1522: heart mode
internal fun PlayerActivity.showV1522HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1522heart
    FeaturePrefsStore.batch1521.v1522heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1522: heavy mode
internal fun PlayerActivity.showV1522HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1522heavy
    FeaturePrefsStore.batch1521.v1522heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1522: hedge mode
internal fun PlayerActivity.showV1522HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1522hedge
    FeaturePrefsStore.batch1521.v1522hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1522: helmet mode
internal fun PlayerActivity.showV1522HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1522helmet
    FeaturePrefsStore.batch1521.v1522helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1523: happen mode
internal fun PlayerActivity.showV1523HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1523happen
    FeaturePrefsStore.batch1521.v1523happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1523: happy mode
internal fun PlayerActivity.showV1523HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1523happy
    FeaturePrefsStore.batch1521.v1523happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1523: harbor mode
internal fun PlayerActivity.showV1523HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1523harbor
    FeaturePrefsStore.batch1521.v1523harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1523: hard mode
internal fun PlayerActivity.showV1523HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1523hard
    FeaturePrefsStore.batch1521.v1523hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1523: harm mode
internal fun PlayerActivity.showV1523HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1523harm
    FeaturePrefsStore.batch1521.v1523harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1523: harvest level
internal fun PlayerActivity.showV1523HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1523: hat level
internal fun PlayerActivity.showV1523HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1523: have level
internal fun PlayerActivity.showV1523HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523have = value
        AppToast.show(this, "have: $value")
    }
}

// v1523: hawk level
internal fun PlayerActivity.showV1523HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1523: hazard level
internal fun PlayerActivity.showV1523HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1523hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1523hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1523: health mode
internal fun PlayerActivity.showV1523HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1523health
    FeaturePrefsStore.batch1521.v1523health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1523: heart mode
internal fun PlayerActivity.showV1523HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1523heart
    FeaturePrefsStore.batch1521.v1523heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1523: heavy mode
internal fun PlayerActivity.showV1523HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1523heavy
    FeaturePrefsStore.batch1521.v1523heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1523: hedge mode
internal fun PlayerActivity.showV1523HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1523hedge
    FeaturePrefsStore.batch1521.v1523hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1523: helmet mode
internal fun PlayerActivity.showV1523HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1523helmet
    FeaturePrefsStore.batch1521.v1523helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1524: happen mode
internal fun PlayerActivity.showV1524HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1524happen
    FeaturePrefsStore.batch1521.v1524happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1524: happy mode
internal fun PlayerActivity.showV1524HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1524happy
    FeaturePrefsStore.batch1521.v1524happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1524: harbor mode
internal fun PlayerActivity.showV1524HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1524harbor
    FeaturePrefsStore.batch1521.v1524harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1524: hard mode
internal fun PlayerActivity.showV1524HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1524hard
    FeaturePrefsStore.batch1521.v1524hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1524: harm mode
internal fun PlayerActivity.showV1524HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1524harm
    FeaturePrefsStore.batch1521.v1524harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1524: harvest level
internal fun PlayerActivity.showV1524HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1524: hat level
internal fun PlayerActivity.showV1524HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1524: have level
internal fun PlayerActivity.showV1524HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524have = value
        AppToast.show(this, "have: $value")
    }
}

// v1524: hawk level
internal fun PlayerActivity.showV1524HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1524: hazard level
internal fun PlayerActivity.showV1524HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1524hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1524hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1524: health mode
internal fun PlayerActivity.showV1524HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1524health
    FeaturePrefsStore.batch1521.v1524health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1524: heart mode
internal fun PlayerActivity.showV1524HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1524heart
    FeaturePrefsStore.batch1521.v1524heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1524: heavy mode
internal fun PlayerActivity.showV1524HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1524heavy
    FeaturePrefsStore.batch1521.v1524heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1524: hedge mode
internal fun PlayerActivity.showV1524HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1524hedge
    FeaturePrefsStore.batch1521.v1524hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1524: helmet mode
internal fun PlayerActivity.showV1524HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1524helmet
    FeaturePrefsStore.batch1521.v1524helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1525: happen mode
internal fun PlayerActivity.showV1525HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1525happen
    FeaturePrefsStore.batch1521.v1525happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1525: happy mode
internal fun PlayerActivity.showV1525HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1525happy
    FeaturePrefsStore.batch1521.v1525happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1525: harbor mode
internal fun PlayerActivity.showV1525HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1525harbor
    FeaturePrefsStore.batch1521.v1525harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1525: hard mode
internal fun PlayerActivity.showV1525HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1525hard
    FeaturePrefsStore.batch1521.v1525hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1525: harm mode
internal fun PlayerActivity.showV1525HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1525harm
    FeaturePrefsStore.batch1521.v1525harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1525: harvest level
internal fun PlayerActivity.showV1525HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1525: hat level
internal fun PlayerActivity.showV1525HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1525: have level
internal fun PlayerActivity.showV1525HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525have = value
        AppToast.show(this, "have: $value")
    }
}

// v1525: hawk level
internal fun PlayerActivity.showV1525HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1525: hazard level
internal fun PlayerActivity.showV1525HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1525hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1525hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1525: health mode
internal fun PlayerActivity.showV1525HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1525health
    FeaturePrefsStore.batch1521.v1525health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1525: heart mode
internal fun PlayerActivity.showV1525HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1525heart
    FeaturePrefsStore.batch1521.v1525heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1525: heavy mode
internal fun PlayerActivity.showV1525HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1525heavy
    FeaturePrefsStore.batch1521.v1525heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1525: hedge mode
internal fun PlayerActivity.showV1525HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1525hedge
    FeaturePrefsStore.batch1521.v1525hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1525: helmet mode
internal fun PlayerActivity.showV1525HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1525helmet
    FeaturePrefsStore.batch1521.v1525helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1526: happen mode
internal fun PlayerActivity.showV1526HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1526happen
    FeaturePrefsStore.batch1521.v1526happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1526: happy mode
internal fun PlayerActivity.showV1526HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1526happy
    FeaturePrefsStore.batch1521.v1526happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1526: harbor mode
internal fun PlayerActivity.showV1526HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1526harbor
    FeaturePrefsStore.batch1521.v1526harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1526: hard mode
internal fun PlayerActivity.showV1526HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1526hard
    FeaturePrefsStore.batch1521.v1526hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1526: harm mode
internal fun PlayerActivity.showV1526HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1526harm
    FeaturePrefsStore.batch1521.v1526harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1526: harvest level
internal fun PlayerActivity.showV1526HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1526: hat level
internal fun PlayerActivity.showV1526HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1526: have level
internal fun PlayerActivity.showV1526HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526have = value
        AppToast.show(this, "have: $value")
    }
}

// v1526: hawk level
internal fun PlayerActivity.showV1526HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1526: hazard level
internal fun PlayerActivity.showV1526HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1526hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1526hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1526: health mode
internal fun PlayerActivity.showV1526HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1526health
    FeaturePrefsStore.batch1521.v1526health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1526: heart mode
internal fun PlayerActivity.showV1526HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1526heart
    FeaturePrefsStore.batch1521.v1526heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1526: heavy mode
internal fun PlayerActivity.showV1526HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1526heavy
    FeaturePrefsStore.batch1521.v1526heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1526: hedge mode
internal fun PlayerActivity.showV1526HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1526hedge
    FeaturePrefsStore.batch1521.v1526hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1526: helmet mode
internal fun PlayerActivity.showV1526HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1526helmet
    FeaturePrefsStore.batch1521.v1526helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1527: happen mode
internal fun PlayerActivity.showV1527HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1527happen
    FeaturePrefsStore.batch1521.v1527happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1527: happy mode
internal fun PlayerActivity.showV1527HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1527happy
    FeaturePrefsStore.batch1521.v1527happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1527: harbor mode
internal fun PlayerActivity.showV1527HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1527harbor
    FeaturePrefsStore.batch1521.v1527harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1527: hard mode
internal fun PlayerActivity.showV1527HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1527hard
    FeaturePrefsStore.batch1521.v1527hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1527: harm mode
internal fun PlayerActivity.showV1527HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1527harm
    FeaturePrefsStore.batch1521.v1527harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1527: harvest level
internal fun PlayerActivity.showV1527HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1527: hat level
internal fun PlayerActivity.showV1527HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1527: have level
internal fun PlayerActivity.showV1527HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527have = value
        AppToast.show(this, "have: $value")
    }
}

// v1527: hawk level
internal fun PlayerActivity.showV1527HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1527: hazard level
internal fun PlayerActivity.showV1527HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1527hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1527hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1527: health mode
internal fun PlayerActivity.showV1527HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1527health
    FeaturePrefsStore.batch1521.v1527health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1527: heart mode
internal fun PlayerActivity.showV1527HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1527heart
    FeaturePrefsStore.batch1521.v1527heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1527: heavy mode
internal fun PlayerActivity.showV1527HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1527heavy
    FeaturePrefsStore.batch1521.v1527heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1527: hedge mode
internal fun PlayerActivity.showV1527HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1527hedge
    FeaturePrefsStore.batch1521.v1527hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1527: helmet mode
internal fun PlayerActivity.showV1527HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1527helmet
    FeaturePrefsStore.batch1521.v1527helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1528: happen mode
internal fun PlayerActivity.showV1528HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1528happen
    FeaturePrefsStore.batch1521.v1528happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1528: happy mode
internal fun PlayerActivity.showV1528HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1528happy
    FeaturePrefsStore.batch1521.v1528happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1528: harbor mode
internal fun PlayerActivity.showV1528HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1528harbor
    FeaturePrefsStore.batch1521.v1528harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1528: hard mode
internal fun PlayerActivity.showV1528HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1528hard
    FeaturePrefsStore.batch1521.v1528hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1528: harm mode
internal fun PlayerActivity.showV1528HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1528harm
    FeaturePrefsStore.batch1521.v1528harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1528: harvest level
internal fun PlayerActivity.showV1528HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1528: hat level
internal fun PlayerActivity.showV1528HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1528: have level
internal fun PlayerActivity.showV1528HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528have = value
        AppToast.show(this, "have: $value")
    }
}

// v1528: hawk level
internal fun PlayerActivity.showV1528HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1528: hazard level
internal fun PlayerActivity.showV1528HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1528hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1528hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1528: health mode
internal fun PlayerActivity.showV1528HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1528health
    FeaturePrefsStore.batch1521.v1528health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1528: heart mode
internal fun PlayerActivity.showV1528HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1528heart
    FeaturePrefsStore.batch1521.v1528heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1528: heavy mode
internal fun PlayerActivity.showV1528HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1528heavy
    FeaturePrefsStore.batch1521.v1528heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1528: hedge mode
internal fun PlayerActivity.showV1528HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1528hedge
    FeaturePrefsStore.batch1521.v1528hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1528: helmet mode
internal fun PlayerActivity.showV1528HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1528helmet
    FeaturePrefsStore.batch1521.v1528helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1529: happen mode
internal fun PlayerActivity.showV1529HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1529happen
    FeaturePrefsStore.batch1521.v1529happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1529: happy mode
internal fun PlayerActivity.showV1529HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1529happy
    FeaturePrefsStore.batch1521.v1529happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1529: harbor mode
internal fun PlayerActivity.showV1529HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1529harbor
    FeaturePrefsStore.batch1521.v1529harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1529: hard mode
internal fun PlayerActivity.showV1529HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1529hard
    FeaturePrefsStore.batch1521.v1529hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1529: harm mode
internal fun PlayerActivity.showV1529HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1529harm
    FeaturePrefsStore.batch1521.v1529harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1529: harvest level
internal fun PlayerActivity.showV1529HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1529: hat level
internal fun PlayerActivity.showV1529HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1529: have level
internal fun PlayerActivity.showV1529HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529have = value
        AppToast.show(this, "have: $value")
    }
}

// v1529: hawk level
internal fun PlayerActivity.showV1529HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1529: hazard level
internal fun PlayerActivity.showV1529HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1529hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1529hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1529: health mode
internal fun PlayerActivity.showV1529HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1529health
    FeaturePrefsStore.batch1521.v1529health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1529: heart mode
internal fun PlayerActivity.showV1529HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1529heart
    FeaturePrefsStore.batch1521.v1529heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1529: heavy mode
internal fun PlayerActivity.showV1529HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1529heavy
    FeaturePrefsStore.batch1521.v1529heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1529: hedge mode
internal fun PlayerActivity.showV1529HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1529hedge
    FeaturePrefsStore.batch1521.v1529hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1529: helmet mode
internal fun PlayerActivity.showV1529HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1529helmet
    FeaturePrefsStore.batch1521.v1529helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

// v1530: happen mode
internal fun PlayerActivity.showV1530HappenToggle() {
    val current = FeaturePrefsStore.batch1521.v1530happen
    FeaturePrefsStore.batch1521.v1530happen = !current
    AppToast.show(this, "happen: ${if (!current) "ON" else "OFF"}")
}

// v1530: happy mode
internal fun PlayerActivity.showV1530HappyToggle() {
    val current = FeaturePrefsStore.batch1521.v1530happy
    FeaturePrefsStore.batch1521.v1530happy = !current
    AppToast.show(this, "happy: ${if (!current) "ON" else "OFF"}")
}

// v1530: harbor mode
internal fun PlayerActivity.showV1530HarborToggle() {
    val current = FeaturePrefsStore.batch1521.v1530harbor
    FeaturePrefsStore.batch1521.v1530harbor = !current
    AppToast.show(this, "harbor: ${if (!current) "ON" else "OFF"}")
}

// v1530: hard mode
internal fun PlayerActivity.showV1530HardToggle() {
    val current = FeaturePrefsStore.batch1521.v1530hard
    FeaturePrefsStore.batch1521.v1530hard = !current
    AppToast.show(this, "hard: ${if (!current) "ON" else "OFF"}")
}

// v1530: harm mode
internal fun PlayerActivity.showV1530HarmToggle() {
    val current = FeaturePrefsStore.batch1521.v1530harm
    FeaturePrefsStore.batch1521.v1530harm = !current
    AppToast.show(this, "harm: ${if (!current) "ON" else "OFF"}")
}

// v1530: harvest level
internal fun PlayerActivity.showV1530HarvestDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530harvest).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "harvest level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530harvest = value
        AppToast.show(this, "harvest: $value")
    }
}

// v1530: hat level
internal fun PlayerActivity.showV1530HatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hat level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hat = value
        AppToast.show(this, "hat: $value")
    }
}

// v1530: have level
internal fun PlayerActivity.showV1530HaveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530have).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "have level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530have = value
        AppToast.show(this, "have: $value")
    }
}

// v1530: hawk level
internal fun PlayerActivity.showV1530HawkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hawk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hawk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hawk = value
        AppToast.show(this, "hawk: $value")
    }
}

// v1530: hazard level
internal fun PlayerActivity.showV1530HazardDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1521.v1530hazard).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "hazard level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1521.v1530hazard = value
        AppToast.show(this, "hazard: $value")
    }
}

// v1530: health mode
internal fun PlayerActivity.showV1530HealthToggle() {
    val current = FeaturePrefsStore.batch1521.v1530health
    FeaturePrefsStore.batch1521.v1530health = !current
    AppToast.show(this, "health: ${if (!current) "ON" else "OFF"}")
}

// v1530: heart mode
internal fun PlayerActivity.showV1530HeartToggle() {
    val current = FeaturePrefsStore.batch1521.v1530heart
    FeaturePrefsStore.batch1521.v1530heart = !current
    AppToast.show(this, "heart: ${if (!current) "ON" else "OFF"}")
}

// v1530: heavy mode
internal fun PlayerActivity.showV1530HeavyToggle() {
    val current = FeaturePrefsStore.batch1521.v1530heavy
    FeaturePrefsStore.batch1521.v1530heavy = !current
    AppToast.show(this, "heavy: ${if (!current) "ON" else "OFF"}")
}

// v1530: hedge mode
internal fun PlayerActivity.showV1530HedgeToggle() {
    val current = FeaturePrefsStore.batch1521.v1530hedge
    FeaturePrefsStore.batch1521.v1530hedge = !current
    AppToast.show(this, "hedge: ${if (!current) "ON" else "OFF"}")
}

// v1530: helmet mode
internal fun PlayerActivity.showV1530HelmetToggle() {
    val current = FeaturePrefsStore.batch1521.v1530helmet
    FeaturePrefsStore.batch1521.v1530helmet = !current
    AppToast.show(this, "helmet: ${if (!current) "ON" else "OFF"}")
}

