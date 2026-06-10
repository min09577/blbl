package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1351: cost mode
internal fun PlayerActivity.showV1351CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1351cost
    FeaturePrefsStore.batch1351.v1351cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1351: couch mode
internal fun PlayerActivity.showV1351CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1351couch
    FeaturePrefsStore.batch1351.v1351couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1351: county mode
internal fun PlayerActivity.showV1351CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1351county
    FeaturePrefsStore.batch1351.v1351county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1351: couple mode
internal fun PlayerActivity.showV1351CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1351couple
    FeaturePrefsStore.batch1351.v1351couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1351: course mode
internal fun PlayerActivity.showV1351CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1351course
    FeaturePrefsStore.batch1351.v1351course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1351: cousin level
internal fun PlayerActivity.showV1351CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1351cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1351cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1351: crack level
internal fun PlayerActivity.showV1351CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1351crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1351crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1351: craft level
internal fun PlayerActivity.showV1351CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1351craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1351craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1351: crane level
internal fun PlayerActivity.showV1351CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1351crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1351crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1351: crazy level
internal fun PlayerActivity.showV1351CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1351crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1351crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1351: cream mode
internal fun PlayerActivity.showV1351CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1351cream
    FeaturePrefsStore.batch1351.v1351cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1351: creek mode
internal fun PlayerActivity.showV1351CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1351creek
    FeaturePrefsStore.batch1351.v1351creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1351: crew mode
internal fun PlayerActivity.showV1351CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1351crew
    FeaturePrefsStore.batch1351.v1351crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1351: crime mode
internal fun PlayerActivity.showV1351CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1351crime
    FeaturePrefsStore.batch1351.v1351crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1351: crisis mode
internal fun PlayerActivity.showV1351CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1351crisis
    FeaturePrefsStore.batch1351.v1351crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1352: cost mode
internal fun PlayerActivity.showV1352CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1352cost
    FeaturePrefsStore.batch1351.v1352cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1352: couch mode
internal fun PlayerActivity.showV1352CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1352couch
    FeaturePrefsStore.batch1351.v1352couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1352: county mode
internal fun PlayerActivity.showV1352CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1352county
    FeaturePrefsStore.batch1351.v1352county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1352: couple mode
internal fun PlayerActivity.showV1352CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1352couple
    FeaturePrefsStore.batch1351.v1352couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1352: course mode
internal fun PlayerActivity.showV1352CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1352course
    FeaturePrefsStore.batch1351.v1352course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1352: cousin level
internal fun PlayerActivity.showV1352CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1352cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1352cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1352: crack level
internal fun PlayerActivity.showV1352CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1352crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1352crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1352: craft level
internal fun PlayerActivity.showV1352CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1352craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1352craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1352: crane level
internal fun PlayerActivity.showV1352CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1352crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1352crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1352: crazy level
internal fun PlayerActivity.showV1352CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1352crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1352crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1352: cream mode
internal fun PlayerActivity.showV1352CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1352cream
    FeaturePrefsStore.batch1351.v1352cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1352: creek mode
internal fun PlayerActivity.showV1352CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1352creek
    FeaturePrefsStore.batch1351.v1352creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1352: crew mode
internal fun PlayerActivity.showV1352CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1352crew
    FeaturePrefsStore.batch1351.v1352crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1352: crime mode
internal fun PlayerActivity.showV1352CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1352crime
    FeaturePrefsStore.batch1351.v1352crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1352: crisis mode
internal fun PlayerActivity.showV1352CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1352crisis
    FeaturePrefsStore.batch1351.v1352crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1353: cost mode
internal fun PlayerActivity.showV1353CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1353cost
    FeaturePrefsStore.batch1351.v1353cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1353: couch mode
internal fun PlayerActivity.showV1353CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1353couch
    FeaturePrefsStore.batch1351.v1353couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1353: county mode
internal fun PlayerActivity.showV1353CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1353county
    FeaturePrefsStore.batch1351.v1353county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1353: couple mode
internal fun PlayerActivity.showV1353CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1353couple
    FeaturePrefsStore.batch1351.v1353couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1353: course mode
internal fun PlayerActivity.showV1353CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1353course
    FeaturePrefsStore.batch1351.v1353course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1353: cousin level
internal fun PlayerActivity.showV1353CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1353cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1353cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1353: crack level
internal fun PlayerActivity.showV1353CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1353crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1353crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1353: craft level
internal fun PlayerActivity.showV1353CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1353craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1353craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1353: crane level
internal fun PlayerActivity.showV1353CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1353crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1353crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1353: crazy level
internal fun PlayerActivity.showV1353CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1353crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1353crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1353: cream mode
internal fun PlayerActivity.showV1353CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1353cream
    FeaturePrefsStore.batch1351.v1353cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1353: creek mode
internal fun PlayerActivity.showV1353CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1353creek
    FeaturePrefsStore.batch1351.v1353creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1353: crew mode
internal fun PlayerActivity.showV1353CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1353crew
    FeaturePrefsStore.batch1351.v1353crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1353: crime mode
internal fun PlayerActivity.showV1353CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1353crime
    FeaturePrefsStore.batch1351.v1353crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1353: crisis mode
internal fun PlayerActivity.showV1353CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1353crisis
    FeaturePrefsStore.batch1351.v1353crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1354: cost mode
internal fun PlayerActivity.showV1354CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1354cost
    FeaturePrefsStore.batch1351.v1354cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1354: couch mode
internal fun PlayerActivity.showV1354CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1354couch
    FeaturePrefsStore.batch1351.v1354couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1354: county mode
internal fun PlayerActivity.showV1354CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1354county
    FeaturePrefsStore.batch1351.v1354county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1354: couple mode
internal fun PlayerActivity.showV1354CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1354couple
    FeaturePrefsStore.batch1351.v1354couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1354: course mode
internal fun PlayerActivity.showV1354CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1354course
    FeaturePrefsStore.batch1351.v1354course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1354: cousin level
internal fun PlayerActivity.showV1354CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1354cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1354cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1354: crack level
internal fun PlayerActivity.showV1354CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1354crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1354crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1354: craft level
internal fun PlayerActivity.showV1354CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1354craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1354craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1354: crane level
internal fun PlayerActivity.showV1354CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1354crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1354crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1354: crazy level
internal fun PlayerActivity.showV1354CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1354crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1354crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1354: cream mode
internal fun PlayerActivity.showV1354CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1354cream
    FeaturePrefsStore.batch1351.v1354cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1354: creek mode
internal fun PlayerActivity.showV1354CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1354creek
    FeaturePrefsStore.batch1351.v1354creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1354: crew mode
internal fun PlayerActivity.showV1354CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1354crew
    FeaturePrefsStore.batch1351.v1354crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1354: crime mode
internal fun PlayerActivity.showV1354CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1354crime
    FeaturePrefsStore.batch1351.v1354crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1354: crisis mode
internal fun PlayerActivity.showV1354CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1354crisis
    FeaturePrefsStore.batch1351.v1354crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1355: cost mode
internal fun PlayerActivity.showV1355CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1355cost
    FeaturePrefsStore.batch1351.v1355cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1355: couch mode
internal fun PlayerActivity.showV1355CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1355couch
    FeaturePrefsStore.batch1351.v1355couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1355: county mode
internal fun PlayerActivity.showV1355CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1355county
    FeaturePrefsStore.batch1351.v1355county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1355: couple mode
internal fun PlayerActivity.showV1355CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1355couple
    FeaturePrefsStore.batch1351.v1355couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1355: course mode
internal fun PlayerActivity.showV1355CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1355course
    FeaturePrefsStore.batch1351.v1355course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1355: cousin level
internal fun PlayerActivity.showV1355CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1355cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1355cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1355: crack level
internal fun PlayerActivity.showV1355CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1355crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1355crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1355: craft level
internal fun PlayerActivity.showV1355CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1355craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1355craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1355: crane level
internal fun PlayerActivity.showV1355CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1355crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1355crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1355: crazy level
internal fun PlayerActivity.showV1355CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1355crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1355crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1355: cream mode
internal fun PlayerActivity.showV1355CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1355cream
    FeaturePrefsStore.batch1351.v1355cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1355: creek mode
internal fun PlayerActivity.showV1355CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1355creek
    FeaturePrefsStore.batch1351.v1355creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1355: crew mode
internal fun PlayerActivity.showV1355CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1355crew
    FeaturePrefsStore.batch1351.v1355crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1355: crime mode
internal fun PlayerActivity.showV1355CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1355crime
    FeaturePrefsStore.batch1351.v1355crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1355: crisis mode
internal fun PlayerActivity.showV1355CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1355crisis
    FeaturePrefsStore.batch1351.v1355crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1356: cost mode
internal fun PlayerActivity.showV1356CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1356cost
    FeaturePrefsStore.batch1351.v1356cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1356: couch mode
internal fun PlayerActivity.showV1356CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1356couch
    FeaturePrefsStore.batch1351.v1356couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1356: county mode
internal fun PlayerActivity.showV1356CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1356county
    FeaturePrefsStore.batch1351.v1356county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1356: couple mode
internal fun PlayerActivity.showV1356CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1356couple
    FeaturePrefsStore.batch1351.v1356couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1356: course mode
internal fun PlayerActivity.showV1356CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1356course
    FeaturePrefsStore.batch1351.v1356course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1356: cousin level
internal fun PlayerActivity.showV1356CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1356cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1356cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1356: crack level
internal fun PlayerActivity.showV1356CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1356crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1356crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1356: craft level
internal fun PlayerActivity.showV1356CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1356craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1356craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1356: crane level
internal fun PlayerActivity.showV1356CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1356crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1356crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1356: crazy level
internal fun PlayerActivity.showV1356CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1356crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1356crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1356: cream mode
internal fun PlayerActivity.showV1356CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1356cream
    FeaturePrefsStore.batch1351.v1356cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1356: creek mode
internal fun PlayerActivity.showV1356CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1356creek
    FeaturePrefsStore.batch1351.v1356creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1356: crew mode
internal fun PlayerActivity.showV1356CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1356crew
    FeaturePrefsStore.batch1351.v1356crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1356: crime mode
internal fun PlayerActivity.showV1356CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1356crime
    FeaturePrefsStore.batch1351.v1356crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1356: crisis mode
internal fun PlayerActivity.showV1356CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1356crisis
    FeaturePrefsStore.batch1351.v1356crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1357: cost mode
internal fun PlayerActivity.showV1357CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1357cost
    FeaturePrefsStore.batch1351.v1357cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1357: couch mode
internal fun PlayerActivity.showV1357CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1357couch
    FeaturePrefsStore.batch1351.v1357couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1357: county mode
internal fun PlayerActivity.showV1357CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1357county
    FeaturePrefsStore.batch1351.v1357county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1357: couple mode
internal fun PlayerActivity.showV1357CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1357couple
    FeaturePrefsStore.batch1351.v1357couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1357: course mode
internal fun PlayerActivity.showV1357CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1357course
    FeaturePrefsStore.batch1351.v1357course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1357: cousin level
internal fun PlayerActivity.showV1357CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1357cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1357cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1357: crack level
internal fun PlayerActivity.showV1357CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1357crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1357crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1357: craft level
internal fun PlayerActivity.showV1357CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1357craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1357craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1357: crane level
internal fun PlayerActivity.showV1357CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1357crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1357crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1357: crazy level
internal fun PlayerActivity.showV1357CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1357crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1357crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1357: cream mode
internal fun PlayerActivity.showV1357CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1357cream
    FeaturePrefsStore.batch1351.v1357cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1357: creek mode
internal fun PlayerActivity.showV1357CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1357creek
    FeaturePrefsStore.batch1351.v1357creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1357: crew mode
internal fun PlayerActivity.showV1357CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1357crew
    FeaturePrefsStore.batch1351.v1357crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1357: crime mode
internal fun PlayerActivity.showV1357CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1357crime
    FeaturePrefsStore.batch1351.v1357crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1357: crisis mode
internal fun PlayerActivity.showV1357CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1357crisis
    FeaturePrefsStore.batch1351.v1357crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1358: cost mode
internal fun PlayerActivity.showV1358CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1358cost
    FeaturePrefsStore.batch1351.v1358cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1358: couch mode
internal fun PlayerActivity.showV1358CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1358couch
    FeaturePrefsStore.batch1351.v1358couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1358: county mode
internal fun PlayerActivity.showV1358CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1358county
    FeaturePrefsStore.batch1351.v1358county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1358: couple mode
internal fun PlayerActivity.showV1358CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1358couple
    FeaturePrefsStore.batch1351.v1358couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1358: course mode
internal fun PlayerActivity.showV1358CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1358course
    FeaturePrefsStore.batch1351.v1358course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1358: cousin level
internal fun PlayerActivity.showV1358CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1358cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1358cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1358: crack level
internal fun PlayerActivity.showV1358CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1358crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1358crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1358: craft level
internal fun PlayerActivity.showV1358CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1358craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1358craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1358: crane level
internal fun PlayerActivity.showV1358CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1358crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1358crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1358: crazy level
internal fun PlayerActivity.showV1358CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1358crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1358crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1358: cream mode
internal fun PlayerActivity.showV1358CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1358cream
    FeaturePrefsStore.batch1351.v1358cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1358: creek mode
internal fun PlayerActivity.showV1358CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1358creek
    FeaturePrefsStore.batch1351.v1358creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1358: crew mode
internal fun PlayerActivity.showV1358CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1358crew
    FeaturePrefsStore.batch1351.v1358crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1358: crime mode
internal fun PlayerActivity.showV1358CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1358crime
    FeaturePrefsStore.batch1351.v1358crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1358: crisis mode
internal fun PlayerActivity.showV1358CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1358crisis
    FeaturePrefsStore.batch1351.v1358crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1359: cost mode
internal fun PlayerActivity.showV1359CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1359cost
    FeaturePrefsStore.batch1351.v1359cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1359: couch mode
internal fun PlayerActivity.showV1359CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1359couch
    FeaturePrefsStore.batch1351.v1359couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1359: county mode
internal fun PlayerActivity.showV1359CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1359county
    FeaturePrefsStore.batch1351.v1359county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1359: couple mode
internal fun PlayerActivity.showV1359CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1359couple
    FeaturePrefsStore.batch1351.v1359couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1359: course mode
internal fun PlayerActivity.showV1359CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1359course
    FeaturePrefsStore.batch1351.v1359course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1359: cousin level
internal fun PlayerActivity.showV1359CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1359cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1359cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1359: crack level
internal fun PlayerActivity.showV1359CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1359crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1359crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1359: craft level
internal fun PlayerActivity.showV1359CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1359craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1359craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1359: crane level
internal fun PlayerActivity.showV1359CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1359crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1359crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1359: crazy level
internal fun PlayerActivity.showV1359CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1359crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1359crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1359: cream mode
internal fun PlayerActivity.showV1359CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1359cream
    FeaturePrefsStore.batch1351.v1359cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1359: creek mode
internal fun PlayerActivity.showV1359CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1359creek
    FeaturePrefsStore.batch1351.v1359creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1359: crew mode
internal fun PlayerActivity.showV1359CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1359crew
    FeaturePrefsStore.batch1351.v1359crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1359: crime mode
internal fun PlayerActivity.showV1359CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1359crime
    FeaturePrefsStore.batch1351.v1359crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1359: crisis mode
internal fun PlayerActivity.showV1359CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1359crisis
    FeaturePrefsStore.batch1351.v1359crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1360: cost mode
internal fun PlayerActivity.showV1360CostToggle() {
    val current = FeaturePrefsStore.batch1351.v1360cost
    FeaturePrefsStore.batch1351.v1360cost = !current
    AppToast.show(this, "cost: ${if (!current) "ON" else "OFF"}")
}

// v1360: couch mode
internal fun PlayerActivity.showV1360CouchToggle() {
    val current = FeaturePrefsStore.batch1351.v1360couch
    FeaturePrefsStore.batch1351.v1360couch = !current
    AppToast.show(this, "couch: ${if (!current) "ON" else "OFF"}")
}

// v1360: county mode
internal fun PlayerActivity.showV1360CountyToggle() {
    val current = FeaturePrefsStore.batch1351.v1360county
    FeaturePrefsStore.batch1351.v1360county = !current
    AppToast.show(this, "county: ${if (!current) "ON" else "OFF"}")
}

// v1360: couple mode
internal fun PlayerActivity.showV1360CoupleToggle() {
    val current = FeaturePrefsStore.batch1351.v1360couple
    FeaturePrefsStore.batch1351.v1360couple = !current
    AppToast.show(this, "couple: ${if (!current) "ON" else "OFF"}")
}

// v1360: course mode
internal fun PlayerActivity.showV1360CourseToggle() {
    val current = FeaturePrefsStore.batch1351.v1360course
    FeaturePrefsStore.batch1351.v1360course = !current
    AppToast.show(this, "course: ${if (!current) "ON" else "OFF"}")
}

// v1360: cousin level
internal fun PlayerActivity.showV1360CousinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1360cousin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cousin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1360cousin = value
        AppToast.show(this, "cousin: $value")
    }
}

// v1360: crack level
internal fun PlayerActivity.showV1360CrackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1360crack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1360crack = value
        AppToast.show(this, "crack: $value")
    }
}

// v1360: craft level
internal fun PlayerActivity.showV1360CraftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1360craft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "craft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1360craft = value
        AppToast.show(this, "craft: $value")
    }
}

// v1360: crane level
internal fun PlayerActivity.showV1360CraneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1360crane).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crane level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1360crane = value
        AppToast.show(this, "crane: $value")
    }
}

// v1360: crazy level
internal fun PlayerActivity.showV1360CrazyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1351.v1360crazy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crazy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1351.v1360crazy = value
        AppToast.show(this, "crazy: $value")
    }
}

// v1360: cream mode
internal fun PlayerActivity.showV1360CreamToggle() {
    val current = FeaturePrefsStore.batch1351.v1360cream
    FeaturePrefsStore.batch1351.v1360cream = !current
    AppToast.show(this, "cream: ${if (!current) "ON" else "OFF"}")
}

// v1360: creek mode
internal fun PlayerActivity.showV1360CreekToggle() {
    val current = FeaturePrefsStore.batch1351.v1360creek
    FeaturePrefsStore.batch1351.v1360creek = !current
    AppToast.show(this, "creek: ${if (!current) "ON" else "OFF"}")
}

// v1360: crew mode
internal fun PlayerActivity.showV1360CrewToggle() {
    val current = FeaturePrefsStore.batch1351.v1360crew
    FeaturePrefsStore.batch1351.v1360crew = !current
    AppToast.show(this, "crew: ${if (!current) "ON" else "OFF"}")
}

// v1360: crime mode
internal fun PlayerActivity.showV1360CrimeToggle() {
    val current = FeaturePrefsStore.batch1351.v1360crime
    FeaturePrefsStore.batch1351.v1360crime = !current
    AppToast.show(this, "crime: ${if (!current) "ON" else "OFF"}")
}

// v1360: crisis mode
internal fun PlayerActivity.showV1360CrisisToggle() {
    val current = FeaturePrefsStore.batch1351.v1360crisis
    FeaturePrefsStore.batch1351.v1360crisis = !current
    AppToast.show(this, "crisis: ${if (!current) "ON" else "OFF"}")
}

// v1361: crowd mode
internal fun PlayerActivity.showV1361CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crowd
    FeaturePrefsStore.batch1361.v1361crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1361: crown mode
internal fun PlayerActivity.showV1361CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crown
    FeaturePrefsStore.batch1361.v1361crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1361: crush mode
internal fun PlayerActivity.showV1361CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1361crush
    FeaturePrefsStore.batch1361.v1361crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1361: cubic mode
internal fun PlayerActivity.showV1361CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1361cubic
    FeaturePrefsStore.batch1361.v1361cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1361: cult mode
internal fun PlayerActivity.showV1361CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1361cult
    FeaturePrefsStore.batch1361.v1361cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1361: cup level
internal fun PlayerActivity.showV1361CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1361: cure level
internal fun PlayerActivity.showV1361CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1361: curl level
internal fun PlayerActivity.showV1361CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1361: curtain level
internal fun PlayerActivity.showV1361CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1361: daily level
internal fun PlayerActivity.showV1361DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1361daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1361daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1361: damage mode
internal fun PlayerActivity.showV1361DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1361damage
    FeaturePrefsStore.batch1361.v1361damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1361: dance mode
internal fun PlayerActivity.showV1361DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dance
    FeaturePrefsStore.batch1361.v1361dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1361: dare mode
internal fun PlayerActivity.showV1361DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dare
    FeaturePrefsStore.batch1361.v1361dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1361: dark mode
internal fun PlayerActivity.showV1361DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dark
    FeaturePrefsStore.batch1361.v1361dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1361: dash mode
internal fun PlayerActivity.showV1361DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1361dash
    FeaturePrefsStore.batch1361.v1361dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1362: crowd mode
internal fun PlayerActivity.showV1362CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crowd
    FeaturePrefsStore.batch1361.v1362crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1362: crown mode
internal fun PlayerActivity.showV1362CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crown
    FeaturePrefsStore.batch1361.v1362crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1362: crush mode
internal fun PlayerActivity.showV1362CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1362crush
    FeaturePrefsStore.batch1361.v1362crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1362: cubic mode
internal fun PlayerActivity.showV1362CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1362cubic
    FeaturePrefsStore.batch1361.v1362cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1362: cult mode
internal fun PlayerActivity.showV1362CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1362cult
    FeaturePrefsStore.batch1361.v1362cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1362: cup level
internal fun PlayerActivity.showV1362CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1362: cure level
internal fun PlayerActivity.showV1362CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1362: curl level
internal fun PlayerActivity.showV1362CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1362: curtain level
internal fun PlayerActivity.showV1362CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1362: daily level
internal fun PlayerActivity.showV1362DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1362daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1362daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1362: damage mode
internal fun PlayerActivity.showV1362DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1362damage
    FeaturePrefsStore.batch1361.v1362damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1362: dance mode
internal fun PlayerActivity.showV1362DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dance
    FeaturePrefsStore.batch1361.v1362dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1362: dare mode
internal fun PlayerActivity.showV1362DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dare
    FeaturePrefsStore.batch1361.v1362dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1362: dark mode
internal fun PlayerActivity.showV1362DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dark
    FeaturePrefsStore.batch1361.v1362dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1362: dash mode
internal fun PlayerActivity.showV1362DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1362dash
    FeaturePrefsStore.batch1361.v1362dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1363: crowd mode
internal fun PlayerActivity.showV1363CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crowd
    FeaturePrefsStore.batch1361.v1363crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1363: crown mode
internal fun PlayerActivity.showV1363CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crown
    FeaturePrefsStore.batch1361.v1363crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1363: crush mode
internal fun PlayerActivity.showV1363CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1363crush
    FeaturePrefsStore.batch1361.v1363crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1363: cubic mode
internal fun PlayerActivity.showV1363CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1363cubic
    FeaturePrefsStore.batch1361.v1363cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1363: cult mode
internal fun PlayerActivity.showV1363CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1363cult
    FeaturePrefsStore.batch1361.v1363cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1363: cup level
internal fun PlayerActivity.showV1363CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1363: cure level
internal fun PlayerActivity.showV1363CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1363: curl level
internal fun PlayerActivity.showV1363CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1363: curtain level
internal fun PlayerActivity.showV1363CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1363: daily level
internal fun PlayerActivity.showV1363DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1363daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1363daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1363: damage mode
internal fun PlayerActivity.showV1363DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1363damage
    FeaturePrefsStore.batch1361.v1363damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1363: dance mode
internal fun PlayerActivity.showV1363DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dance
    FeaturePrefsStore.batch1361.v1363dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1363: dare mode
internal fun PlayerActivity.showV1363DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dare
    FeaturePrefsStore.batch1361.v1363dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1363: dark mode
internal fun PlayerActivity.showV1363DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dark
    FeaturePrefsStore.batch1361.v1363dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1363: dash mode
internal fun PlayerActivity.showV1363DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1363dash
    FeaturePrefsStore.batch1361.v1363dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1364: crowd mode
internal fun PlayerActivity.showV1364CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crowd
    FeaturePrefsStore.batch1361.v1364crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1364: crown mode
internal fun PlayerActivity.showV1364CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crown
    FeaturePrefsStore.batch1361.v1364crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1364: crush mode
internal fun PlayerActivity.showV1364CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1364crush
    FeaturePrefsStore.batch1361.v1364crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1364: cubic mode
internal fun PlayerActivity.showV1364CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1364cubic
    FeaturePrefsStore.batch1361.v1364cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1364: cult mode
internal fun PlayerActivity.showV1364CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1364cult
    FeaturePrefsStore.batch1361.v1364cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1364: cup level
internal fun PlayerActivity.showV1364CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1364: cure level
internal fun PlayerActivity.showV1364CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1364: curl level
internal fun PlayerActivity.showV1364CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1364: curtain level
internal fun PlayerActivity.showV1364CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1364: daily level
internal fun PlayerActivity.showV1364DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1364daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1364daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1364: damage mode
internal fun PlayerActivity.showV1364DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1364damage
    FeaturePrefsStore.batch1361.v1364damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1364: dance mode
internal fun PlayerActivity.showV1364DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dance
    FeaturePrefsStore.batch1361.v1364dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1364: dare mode
internal fun PlayerActivity.showV1364DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dare
    FeaturePrefsStore.batch1361.v1364dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1364: dark mode
internal fun PlayerActivity.showV1364DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dark
    FeaturePrefsStore.batch1361.v1364dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1364: dash mode
internal fun PlayerActivity.showV1364DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1364dash
    FeaturePrefsStore.batch1361.v1364dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1365: crowd mode
internal fun PlayerActivity.showV1365CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crowd
    FeaturePrefsStore.batch1361.v1365crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1365: crown mode
internal fun PlayerActivity.showV1365CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crown
    FeaturePrefsStore.batch1361.v1365crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1365: crush mode
internal fun PlayerActivity.showV1365CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1365crush
    FeaturePrefsStore.batch1361.v1365crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1365: cubic mode
internal fun PlayerActivity.showV1365CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1365cubic
    FeaturePrefsStore.batch1361.v1365cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1365: cult mode
internal fun PlayerActivity.showV1365CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1365cult
    FeaturePrefsStore.batch1361.v1365cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1365: cup level
internal fun PlayerActivity.showV1365CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1365: cure level
internal fun PlayerActivity.showV1365CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1365: curl level
internal fun PlayerActivity.showV1365CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1365: curtain level
internal fun PlayerActivity.showV1365CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1365: daily level
internal fun PlayerActivity.showV1365DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1365daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1365daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1365: damage mode
internal fun PlayerActivity.showV1365DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1365damage
    FeaturePrefsStore.batch1361.v1365damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1365: dance mode
internal fun PlayerActivity.showV1365DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dance
    FeaturePrefsStore.batch1361.v1365dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1365: dare mode
internal fun PlayerActivity.showV1365DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dare
    FeaturePrefsStore.batch1361.v1365dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1365: dark mode
internal fun PlayerActivity.showV1365DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dark
    FeaturePrefsStore.batch1361.v1365dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1365: dash mode
internal fun PlayerActivity.showV1365DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1365dash
    FeaturePrefsStore.batch1361.v1365dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1366: crowd mode
internal fun PlayerActivity.showV1366CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crowd
    FeaturePrefsStore.batch1361.v1366crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1366: crown mode
internal fun PlayerActivity.showV1366CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crown
    FeaturePrefsStore.batch1361.v1366crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1366: crush mode
internal fun PlayerActivity.showV1366CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1366crush
    FeaturePrefsStore.batch1361.v1366crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1366: cubic mode
internal fun PlayerActivity.showV1366CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1366cubic
    FeaturePrefsStore.batch1361.v1366cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1366: cult mode
internal fun PlayerActivity.showV1366CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1366cult
    FeaturePrefsStore.batch1361.v1366cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1366: cup level
internal fun PlayerActivity.showV1366CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1366: cure level
internal fun PlayerActivity.showV1366CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1366: curl level
internal fun PlayerActivity.showV1366CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1366: curtain level
internal fun PlayerActivity.showV1366CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1366: daily level
internal fun PlayerActivity.showV1366DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1366daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1366daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1366: damage mode
internal fun PlayerActivity.showV1366DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1366damage
    FeaturePrefsStore.batch1361.v1366damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1366: dance mode
internal fun PlayerActivity.showV1366DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dance
    FeaturePrefsStore.batch1361.v1366dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1366: dare mode
internal fun PlayerActivity.showV1366DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dare
    FeaturePrefsStore.batch1361.v1366dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1366: dark mode
internal fun PlayerActivity.showV1366DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dark
    FeaturePrefsStore.batch1361.v1366dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1366: dash mode
internal fun PlayerActivity.showV1366DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1366dash
    FeaturePrefsStore.batch1361.v1366dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1367: crowd mode
internal fun PlayerActivity.showV1367CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crowd
    FeaturePrefsStore.batch1361.v1367crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1367: crown mode
internal fun PlayerActivity.showV1367CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crown
    FeaturePrefsStore.batch1361.v1367crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1367: crush mode
internal fun PlayerActivity.showV1367CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1367crush
    FeaturePrefsStore.batch1361.v1367crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1367: cubic mode
internal fun PlayerActivity.showV1367CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1367cubic
    FeaturePrefsStore.batch1361.v1367cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1367: cult mode
internal fun PlayerActivity.showV1367CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1367cult
    FeaturePrefsStore.batch1361.v1367cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1367: cup level
internal fun PlayerActivity.showV1367CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1367: cure level
internal fun PlayerActivity.showV1367CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1367: curl level
internal fun PlayerActivity.showV1367CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1367: curtain level
internal fun PlayerActivity.showV1367CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1367: daily level
internal fun PlayerActivity.showV1367DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1367daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1367daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1367: damage mode
internal fun PlayerActivity.showV1367DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1367damage
    FeaturePrefsStore.batch1361.v1367damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1367: dance mode
internal fun PlayerActivity.showV1367DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dance
    FeaturePrefsStore.batch1361.v1367dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1367: dare mode
internal fun PlayerActivity.showV1367DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dare
    FeaturePrefsStore.batch1361.v1367dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1367: dark mode
internal fun PlayerActivity.showV1367DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dark
    FeaturePrefsStore.batch1361.v1367dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1367: dash mode
internal fun PlayerActivity.showV1367DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1367dash
    FeaturePrefsStore.batch1361.v1367dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1368: crowd mode
internal fun PlayerActivity.showV1368CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crowd
    FeaturePrefsStore.batch1361.v1368crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1368: crown mode
internal fun PlayerActivity.showV1368CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crown
    FeaturePrefsStore.batch1361.v1368crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1368: crush mode
internal fun PlayerActivity.showV1368CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1368crush
    FeaturePrefsStore.batch1361.v1368crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1368: cubic mode
internal fun PlayerActivity.showV1368CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1368cubic
    FeaturePrefsStore.batch1361.v1368cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1368: cult mode
internal fun PlayerActivity.showV1368CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1368cult
    FeaturePrefsStore.batch1361.v1368cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1368: cup level
internal fun PlayerActivity.showV1368CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1368: cure level
internal fun PlayerActivity.showV1368CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1368: curl level
internal fun PlayerActivity.showV1368CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1368: curtain level
internal fun PlayerActivity.showV1368CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1368: daily level
internal fun PlayerActivity.showV1368DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1368daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1368daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1368: damage mode
internal fun PlayerActivity.showV1368DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1368damage
    FeaturePrefsStore.batch1361.v1368damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1368: dance mode
internal fun PlayerActivity.showV1368DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dance
    FeaturePrefsStore.batch1361.v1368dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1368: dare mode
internal fun PlayerActivity.showV1368DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dare
    FeaturePrefsStore.batch1361.v1368dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1368: dark mode
internal fun PlayerActivity.showV1368DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dark
    FeaturePrefsStore.batch1361.v1368dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1368: dash mode
internal fun PlayerActivity.showV1368DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1368dash
    FeaturePrefsStore.batch1361.v1368dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1369: crowd mode
internal fun PlayerActivity.showV1369CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crowd
    FeaturePrefsStore.batch1361.v1369crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1369: crown mode
internal fun PlayerActivity.showV1369CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crown
    FeaturePrefsStore.batch1361.v1369crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1369: crush mode
internal fun PlayerActivity.showV1369CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1369crush
    FeaturePrefsStore.batch1361.v1369crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1369: cubic mode
internal fun PlayerActivity.showV1369CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1369cubic
    FeaturePrefsStore.batch1361.v1369cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1369: cult mode
internal fun PlayerActivity.showV1369CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1369cult
    FeaturePrefsStore.batch1361.v1369cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1369: cup level
internal fun PlayerActivity.showV1369CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1369: cure level
internal fun PlayerActivity.showV1369CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1369: curl level
internal fun PlayerActivity.showV1369CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1369: curtain level
internal fun PlayerActivity.showV1369CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1369: daily level
internal fun PlayerActivity.showV1369DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1369daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1369daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1369: damage mode
internal fun PlayerActivity.showV1369DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1369damage
    FeaturePrefsStore.batch1361.v1369damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1369: dance mode
internal fun PlayerActivity.showV1369DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dance
    FeaturePrefsStore.batch1361.v1369dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1369: dare mode
internal fun PlayerActivity.showV1369DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dare
    FeaturePrefsStore.batch1361.v1369dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1369: dark mode
internal fun PlayerActivity.showV1369DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dark
    FeaturePrefsStore.batch1361.v1369dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1369: dash mode
internal fun PlayerActivity.showV1369DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1369dash
    FeaturePrefsStore.batch1361.v1369dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

// v1370: crowd mode
internal fun PlayerActivity.showV1370CrowdToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crowd
    FeaturePrefsStore.batch1361.v1370crowd = !current
    AppToast.show(this, "crowd: ${if (!current) "ON" else "OFF"}")
}

// v1370: crown mode
internal fun PlayerActivity.showV1370CrownToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crown
    FeaturePrefsStore.batch1361.v1370crown = !current
    AppToast.show(this, "crown: ${if (!current) "ON" else "OFF"}")
}

// v1370: crush mode
internal fun PlayerActivity.showV1370CrushToggle() {
    val current = FeaturePrefsStore.batch1361.v1370crush
    FeaturePrefsStore.batch1361.v1370crush = !current
    AppToast.show(this, "crush: ${if (!current) "ON" else "OFF"}")
}

// v1370: cubic mode
internal fun PlayerActivity.showV1370CubicToggle() {
    val current = FeaturePrefsStore.batch1361.v1370cubic
    FeaturePrefsStore.batch1361.v1370cubic = !current
    AppToast.show(this, "cubic: ${if (!current) "ON" else "OFF"}")
}

// v1370: cult mode
internal fun PlayerActivity.showV1370CultToggle() {
    val current = FeaturePrefsStore.batch1361.v1370cult
    FeaturePrefsStore.batch1361.v1370cult = !current
    AppToast.show(this, "cult: ${if (!current) "ON" else "OFF"}")
}

// v1370: cup level
internal fun PlayerActivity.showV1370CupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370cup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370cup = value
        AppToast.show(this, "cup: $value")
    }
}

// v1370: cure level
internal fun PlayerActivity.showV1370CureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370cure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370cure = value
        AppToast.show(this, "cure: $value")
    }
}

// v1370: curl level
internal fun PlayerActivity.showV1370CurlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370curl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370curl = value
        AppToast.show(this, "curl: $value")
    }
}

// v1370: curtain level
internal fun PlayerActivity.showV1370CurtainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370curtain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "curtain level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370curtain = value
        AppToast.show(this, "curtain: $value")
    }
}

// v1370: daily level
internal fun PlayerActivity.showV1370DailyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1361.v1370daily).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "daily level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1361.v1370daily = value
        AppToast.show(this, "daily: $value")
    }
}

// v1370: damage mode
internal fun PlayerActivity.showV1370DamageToggle() {
    val current = FeaturePrefsStore.batch1361.v1370damage
    FeaturePrefsStore.batch1361.v1370damage = !current
    AppToast.show(this, "damage: ${if (!current) "ON" else "OFF"}")
}

// v1370: dance mode
internal fun PlayerActivity.showV1370DanceToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dance
    FeaturePrefsStore.batch1361.v1370dance = !current
    AppToast.show(this, "dance: ${if (!current) "ON" else "OFF"}")
}

// v1370: dare mode
internal fun PlayerActivity.showV1370DareToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dare
    FeaturePrefsStore.batch1361.v1370dare = !current
    AppToast.show(this, "dare: ${if (!current) "ON" else "OFF"}")
}

// v1370: dark mode
internal fun PlayerActivity.showV1370DarkToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dark
    FeaturePrefsStore.batch1361.v1370dark = !current
    AppToast.show(this, "dark: ${if (!current) "ON" else "OFF"}")
}

// v1370: dash mode
internal fun PlayerActivity.showV1370DashToggle() {
    val current = FeaturePrefsStore.batch1361.v1370dash
    FeaturePrefsStore.batch1361.v1370dash = !current
    AppToast.show(this, "dash: ${if (!current) "ON" else "OFF"}")
}

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

// v169: Danmaku Render Flush Interval
internal fun PlayerActivity.showV169DanmakuRenderFlushIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169danmakuRenderFlushInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169danmakuRenderFlushInterval = value
        AppToast.show(this, "Danmaku Render Flush Interval: $value")
    }
}

// v169: Subtitle Karaoke Shadow
internal fun PlayerActivity.showV169SubtitleKaraokeShadowToggle() {
    val current = BiliClient.prefs.v169subtitleKaraokeShadow
    BiliClient.prefs.v169subtitleKaraokeShadow = !current
    AppToast.show(this, "Subtitle Karaoke Shadow: ${if (!current) "ON" else "OFF"}")
}

// v170: Audio Gate Mix
internal fun PlayerActivity.showV170AudioGateMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v170audioGateMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170audioGateMix = value
        AppToast.show(this, "Audio Gate Mix: $value")
    }
}

// v170: Danmaku Render Flush Interval170
internal fun PlayerActivity.showV170DanmakuRenderFlushInterval170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170danmakuRenderFlushInterval170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170danmakuRenderFlushInterval170 = value
        AppToast.show(this, "Danmaku Render Flush Interval170: $value")
    }
}

// v170: Subtitle Karaoke Shadow170
internal fun PlayerActivity.showV170SubtitleKaraokeShadow170Toggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeShadow170
    BiliClient.prefs.v170subtitleKaraokeShadow170 = !current
    AppToast.show(this, "Subtitle Karaoke Shadow170: ${if (!current) "ON" else "OFF"}")
}

// v170: Gesture Pinch Out Action
internal fun PlayerActivity.showV170GesturePinchOutActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170gesturePinchOutAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Out Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170gesturePinchOutAction = value
        AppToast.show(this, "Gesture Pinch Out Action: $value")
    }
}

// v170: Cast Video PIP Resolution Scale170
internal fun PlayerActivity.showV170CastVideoPIPResolutionScale170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170castVideoPIPResolutionScale170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Resolution Scale170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170castVideoPIPResolutionScale170 = value
        AppToast.show(this, "Cast Video PIP Resolution Scale170: $value")
    }
}

// v170: Playlist Auto Play Related170
internal fun PlayerActivity.showV170PlaylistAutoPlayRelated170Toggle() {
    val current = BiliClient.prefs.v170playlistAutoPlayRelated170
    BiliClient.prefs.v170playlistAutoPlayRelated170 = !current
    AppToast.show(this, "Playlist Auto Play Related170: ${if (!current) "ON" else "OFF"}")
}

// v170: Cache Cleanup Max Age
internal fun PlayerActivity.showV170CacheCleanupMaxAgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170cacheCleanupMaxAge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Max Age",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170cacheCleanupMaxAge = value
        AppToast.show(this, "Cache Cleanup Max Age: $value")
    }
}

// v170: Progress Bar Loaded Opacity170
internal fun PlayerActivity.showV170ProgressBarLoadedOpacity170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170progressBarLoadedOpacity170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Opacity170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170progressBarLoadedOpacity170 = value
        AppToast.show(this, "Progress Bar Loaded Opacity170: $value")
    }
}

// v170: Volume Spatial Mode
internal fun PlayerActivity.showV170VolumeSpatialModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170volumeSpatialMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170volumeSpatialMode = value
        AppToast.show(this, "Volume Spatial Mode: $value")
    }
}

// v170: History Search Full Text170
internal fun PlayerActivity.showV170HistorySearchFullText170Toggle() {
    val current = BiliClient.prefs.v170historySearchFullText170
    BiliClient.prefs.v170historySearchFullText170 = !current
    AppToast.show(this, "History Search Full Text170: ${if (!current) "ON" else "OFF"}")
}

// v170: Playback Loop AB Toggle170
internal fun PlayerActivity.showV170PlaybackLoopABToggle170Toggle() {
    val current = BiliClient.prefs.v170playbackLoopABToggle170
    BiliClient.prefs.v170playbackLoopABToggle170 = !current
    AppToast.show(this, "Playback Loop AB Toggle170: ${if (!current) "ON" else "OFF"}")
}

// v170: Screenshot Watermark Toggle170
internal fun PlayerActivity.showV170ScreenshotWatermarkToggle170Toggle() {
    val current = BiliClient.prefs.v170screenshotWatermarkToggle170
    BiliClient.prefs.v170screenshotWatermarkToggle170 = !current
    AppToast.show(this, "Screenshot Watermark Toggle170: ${if (!current) "ON" else "OFF"}")
}

// v170: Video Sharpen Threshold170
internal fun PlayerActivity.showV170VideoSharpenThreshold170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170videoSharpenThreshold170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Threshold170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170videoSharpenThreshold170 = value
        AppToast.show(this, "Video Sharpen Threshold170: $value")
    }
}

// v170: Danmaku Render Flush All
internal fun PlayerActivity.showV170DanmakuRenderFlushAllToggle() {
    val current = BiliClient.prefs.v170danmakuRenderFlushAll
    BiliClient.prefs.v170danmakuRenderFlushAll = !current
    AppToast.show(this, "Danmaku Render Flush All: ${if (!current) "ON" else "OFF"}")
}

// v170: Subtitle Karaoke Border
internal fun PlayerActivity.showV170SubtitleKaraokeBorderToggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeBorder
    BiliClient.prefs.v170subtitleKaraokeBorder = !current
    AppToast.show(this, "Subtitle Karaoke Border: ${if (!current) "ON" else "OFF"}")
}

// v171: Audio Normalizer Toggle171
internal fun PlayerActivity.showV171AudioNormalizerToggle171Toggle() {
    val current = BiliClient.prefs.v171audioNormalizerToggle171
    BiliClient.prefs.v171audioNormalizerToggle171 = !current
    AppToast.show(this, "Audio Normalizer Toggle171: ${if (!current) "ON" else "OFF"}")
}

// v171: Danmaku Scroll Direction
internal fun PlayerActivity.showV171DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
}

// v171: Subtitle Font Spacing
internal fun PlayerActivity.showV171SubtitleFontSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleFontSpacing = value
        AppToast.show(this, "Subtitle Font Spacing: $value")
    }
}

// v171: Gesture Tap Double Action
internal fun PlayerActivity.showV171GestureTapDoubleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171gestureTapDoubleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171gestureTapDoubleAction = value
        AppToast.show(this, "Gesture Tap Double Action: $value")
    }
}

// v171: Cast Video PIP FPS Limit
internal fun PlayerActivity.showV171CastVideoPIPFPSLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171castVideoPIPFPSLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171castVideoPIPFPSLimit = value
        AppToast.show(this, "Cast Video PIP FPS Limit: $value")
    }
}

// v171: Playlist Auto Add Related
internal fun PlayerActivity.showV171PlaylistAutoAddRelatedToggle() {
    val current = BiliClient.prefs.v171playlistAutoAddRelated
    BiliClient.prefs.v171playlistAutoAddRelated = !current
    AppToast.show(this, "Playlist Auto Add Related: ${if (!current) "ON" else "OFF"}")
}

// v171: Cache Disk Quota MB
internal fun PlayerActivity.showV171CacheDiskQuotaMBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171cacheDiskQuotaMB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171cacheDiskQuotaMB = value
        AppToast.show(this, "Cache Disk Quota MB: $value")
    }
}

// v171: Progress Bar Scrub Preview
internal fun PlayerActivity.showV171ProgressBarScrubPreviewToggle() {
    val current = BiliClient.prefs.v171progressBarScrubPreview
    BiliClient.prefs.v171progressBarScrubPreview = !current
    AppToast.show(this, "Progress Bar Scrub Preview: ${if (!current) "ON" else "OFF"}")
}

// v171: Volume Balance LR
internal fun PlayerActivity.showV171VolumeBalanceLRDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v171volumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171volumeBalanceLR = value
        AppToast.show(this, "Volume Balance LR: $value")
    }
}

// v171: History Group By Date
internal fun PlayerActivity.showV171HistoryGroupByDateToggle() {
    val current = BiliClient.prefs.v171historyGroupByDate
    BiliClient.prefs.v171historyGroupByDate = !current
    AppToast.show(this, "History Group By Date: ${if (!current) "ON" else "OFF"}")
}

// v171: Playback Audio Offset
internal fun PlayerActivity.showV171PlaybackAudioOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171playbackAudioOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171playbackAudioOffset = value
        AppToast.show(this, "Playback Audio Offset: $value")
    }
}

// v171: Screenshot Overlay Info
internal fun PlayerActivity.showV171ScreenshotOverlayInfoToggle() {
    val current = BiliClient.prefs.v171screenshotOverlayInfo
    BiliClient.prefs.v171screenshotOverlayInfo = !current
    AppToast.show(this, "Screenshot Overlay Info: ${if (!current) "ON" else "OFF"}")
}

// v171: Video Contrast Toggle171
internal fun PlayerActivity.showV171VideoContrastToggle171Toggle() {
    val current = BiliClient.prefs.v171videoContrastToggle171
    BiliClient.prefs.v171videoContrastToggle171 = !current
    AppToast.show(this, "Video Contrast Toggle171: ${if (!current) "ON" else "OFF"}")
}

// v171: Danmaku Scroll Speed
internal fun PlayerActivity.showV171DanmakuScrollSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollSpeed = value
        AppToast.show(this, "Danmaku Scroll Speed: $value")
    }
}

// v171: Subtitle Line Spacing
internal fun PlayerActivity.showV171SubtitleLineSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
}

// v172: Audio Normalizer Target172
internal fun PlayerActivity.showV172AudioNormalizerTarget172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172audioNormalizerTarget172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Target172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172audioNormalizerTarget172 = value
        AppToast.show(this, "Audio Normalizer Target172: $value")
    }
}

// v172: Danmaku Scroll Speed172
internal fun PlayerActivity.showV172DanmakuScrollSpeed172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172danmakuScrollSpeed172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172danmakuScrollSpeed172 = value
        AppToast.show(this, "Danmaku Scroll Speed172: $value")
    }
}

// v172: Subtitle Line Spacing172
internal fun PlayerActivity.showV172SubtitleLineSpacing172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleLineSpacing172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleLineSpacing172 = value
        AppToast.show(this, "Subtitle Line Spacing172: $value")
    }
}

// v172: Gesture Tap Double Action172
internal fun PlayerActivity.showV172GestureTapDoubleAction172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172gestureTapDoubleAction172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172gestureTapDoubleAction172 = value
        AppToast.show(this, "Gesture Tap Double Action172: $value")
    }
}

// v172: Cast Video PIP FPS Limit172
internal fun PlayerActivity.showV172CastVideoPIPFPSLimit172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172castVideoPIPFPSLimit172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172castVideoPIPFPSLimit172 = value
        AppToast.show(this, "Cast Video PIP FPS Limit172: $value")
    }
}

// v172: Playlist Auto Add Related172
internal fun PlayerActivity.showV172PlaylistAutoAddRelated172Toggle() {
    val current = BiliClient.prefs.v172playlistAutoAddRelated172
    BiliClient.prefs.v172playlistAutoAddRelated172 = !current
    AppToast.show(this, "Playlist Auto Add Related172: ${if (!current) "ON" else "OFF"}")
}

// v172: Cache Disk Quota MB172
internal fun PlayerActivity.showV172CacheDiskQuotaMB172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172cacheDiskQuotaMB172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172cacheDiskQuotaMB172 = value
        AppToast.show(this, "Cache Disk Quota MB172: $value")
    }
}

// v172: Progress Bar Scrub Preview172
internal fun PlayerActivity.showV172ProgressBarScrubPreview172Toggle() {
    val current = BiliClient.prefs.v172progressBarScrubPreview172
    BiliClient.prefs.v172progressBarScrubPreview172 = !current
    AppToast.show(this, "Progress Bar Scrub Preview172: ${if (!current) "ON" else "OFF"}")
}

// v172: Volume Balance LR172
internal fun PlayerActivity.showV172VolumeBalanceLR172Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v172volumeBalanceLR172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172volumeBalanceLR172 = value
        AppToast.show(this, "Volume Balance LR172: $value")
    }
}

// v172: History Group By Date172
internal fun PlayerActivity.showV172HistoryGroupByDate172Toggle() {
    val current = BiliClient.prefs.v172historyGroupByDate172
    BiliClient.prefs.v172historyGroupByDate172 = !current
    AppToast.show(this, "History Group By Date172: ${if (!current) "ON" else "OFF"}")
}

// v172: Playback Audio Offset172
internal fun PlayerActivity.showV172PlaybackAudioOffset172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172playbackAudioOffset172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172playbackAudioOffset172 = value
        AppToast.show(this, "Playback Audio Offset172: $value")
    }
}

// v172: Screenshot Overlay Info172
internal fun PlayerActivity.showV172ScreenshotOverlayInfo172Toggle() {
    val current = BiliClient.prefs.v172screenshotOverlayInfo172
    BiliClient.prefs.v172screenshotOverlayInfo172 = !current
    AppToast.show(this, "Screenshot Overlay Info172: ${if (!current) "ON" else "OFF"}")
}

// v172: Video Contrast Level172
internal fun PlayerActivity.showV172VideoContrastLevel172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172videoContrastLevel172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172videoContrastLevel172 = value
        AppToast.show(this, "Video Contrast Level172: $value")
    }
}

// v172: Danmaku Scroll Overlap
internal fun PlayerActivity.showV172DanmakuScrollOverlapToggle() {
    val current = BiliClient.prefs.v172danmakuScrollOverlap
    BiliClient.prefs.v172danmakuScrollOverlap = !current
    AppToast.show(this, "Danmaku Scroll Overlap: ${if (!current) "ON" else "OFF"}")
}

// v172: Subtitle Background Padding
internal fun PlayerActivity.showV172SubtitleBackgroundPaddingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleBackgroundPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleBackgroundPadding = value
        AppToast.show(this, "Subtitle Background Padding: $value")
    }
}

// v173: Audio Normalizer Strength173
internal fun PlayerActivity.showV173AudioNormalizerStrength173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173audioNormalizerStrength173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Strength173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173audioNormalizerStrength173 = value
        AppToast.show(this, "Audio Normalizer Strength173: $value")
    }
}

// v173: Danmaku Scroll Overlap173
internal fun PlayerActivity.showV173DanmakuScrollOverlap173Toggle() {
    val current = BiliClient.prefs.v173danmakuScrollOverlap173
    BiliClient.prefs.v173danmakuScrollOverlap173 = !current
    AppToast.show(this, "Danmaku Scroll Overlap173: ${if (!current) "ON" else "OFF"}")
}

// v173: Subtitle Background Padding173
internal fun PlayerActivity.showV173SubtitleBackgroundPadding173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundPadding173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundPadding173 = value
        AppToast.show(this, "Subtitle Background Padding173: $value")
    }
}

// v173: Gesture Tap Triple Action
internal fun PlayerActivity.showV173GestureTapTripleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173gestureTapTripleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173gestureTapTripleAction = value
        AppToast.show(this, "Gesture Tap Triple Action: $value")
    }
}

// v173: Cast Video PIP Connect Auto
internal fun PlayerActivity.showV173CastVideoPIPConnectAutoToggle() {
    val current = BiliClient.prefs.v173castVideoPIPConnectAuto
    BiliClient.prefs.v173castVideoPIPConnectAuto = !current
    AppToast.show(this, "Cast Video PIP Connect Auto: ${if (!current) "ON" else "OFF"}")
}

// v173: Playlist Auto Next On End
internal fun PlayerActivity.showV173PlaylistAutoNextOnEndToggle() {
    val current = BiliClient.prefs.v173playlistAutoNextOnEnd
    BiliClient.prefs.v173playlistAutoNextOnEnd = !current
    AppToast.show(this, "Playlist Auto Next On End: ${if (!current) "ON" else "OFF"}")
}

// v173: Cache Compress Toggle173
internal fun PlayerActivity.showV173CacheCompressToggle173Toggle() {
    val current = BiliClient.prefs.v173cacheCompressToggle173
    BiliClient.prefs.v173cacheCompressToggle173 = !current
    AppToast.show(this, "Cache Compress Toggle173: ${if (!current) "ON" else "OFF"}")
}

// v173: Progress Bar Scrub Preview Size
internal fun PlayerActivity.showV173ProgressBarScrubPreviewSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173progressBarScrubPreviewSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Preview Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173progressBarScrubPreviewSize = value
        AppToast.show(this, "Progress Bar Scrub Preview Size: $value")
    }
}

// v173: Volume Normalize Track
internal fun PlayerActivity.showV173VolumeNormalizeTrackToggle() {
    val current = BiliClient.prefs.v173volumeNormalizeTrack
    BiliClient.prefs.v173volumeNormalizeTrack = !current
    AppToast.show(this, "Volume Normalize Track: ${if (!current) "ON" else "OFF"}")
}

// v173: History Group By Uploader
internal fun PlayerActivity.showV173HistoryGroupByUploaderToggle() {
    val current = BiliClient.prefs.v173historyGroupByUploader
    BiliClient.prefs.v173historyGroupByUploader = !current
    AppToast.show(this, "History Group By Uploader: ${if (!current) "ON" else "OFF"}")
}

// v173: Playback Subtitle Offset
internal fun PlayerActivity.showV173PlaybackSubtitleOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173playbackSubtitleOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173playbackSubtitleOffset = value
        AppToast.show(this, "Playback Subtitle Offset: $value")
    }
}

// v173: Screenshot Overlay Date
internal fun PlayerActivity.showV173ScreenshotOverlayDateToggle() {
    val current = BiliClient.prefs.v173screenshotOverlayDate
    BiliClient.prefs.v173screenshotOverlayDate = !current
    AppToast.show(this, "Screenshot Overlay Date: ${if (!current) "ON" else "OFF"}")
}

// v173: Video Contrast Level173
internal fun PlayerActivity.showV173VideoContrastLevel173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173videoContrastLevel173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173videoContrastLevel173 = value
        AppToast.show(this, "Video Contrast Level173: $value")
    }
}

// v173: Danmaku Scroll Max Lines
internal fun PlayerActivity.showV173DanmakuScrollMaxLinesDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173danmakuScrollMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173danmakuScrollMaxLines = value
        AppToast.show(this, "Danmaku Scroll Max Lines: $value")
    }
}

// v173: Subtitle Background Round
internal fun PlayerActivity.showV173SubtitleBackgroundRoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundRound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundRound = value
        AppToast.show(this, "Subtitle Background Round: $value")
    }
}

// v174: Audio Normalizer Attack174
internal fun PlayerActivity.showV174AudioNormalizerAttack174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174audioNormalizerAttack174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Attack174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174audioNormalizerAttack174 = value
        AppToast.show(this, "Audio Normalizer Attack174: $value")
    }
}

// v174: Danmaku Scroll Max Lines174
internal fun PlayerActivity.showV174DanmakuScrollMaxLines174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollMaxLines174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollMaxLines174 = value
        AppToast.show(this, "Danmaku Scroll Max Lines174: $value")
    }
}

// v174: Subtitle Background Round174
internal fun PlayerActivity.showV174SubtitleBackgroundRound174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174subtitleBackgroundRound174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174subtitleBackgroundRound174 = value
        AppToast.show(this, "Subtitle Background Round174: $value")
    }
}

// v174: Gesture Tap Triple Action174
internal fun PlayerActivity.showV174GestureTapTripleAction174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174gestureTapTripleAction174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174gestureTapTripleAction174 = value
        AppToast.show(this, "Gesture Tap Triple Action174: $value")
    }
}

// v174: Cast Video PIP Connect Auto174
internal fun PlayerActivity.showV174CastVideoPIPConnectAuto174Toggle() {
    val current = BiliClient.prefs.v174castVideoPIPConnectAuto174
    BiliClient.prefs.v174castVideoPIPConnectAuto174 = !current
    AppToast.show(this, "Cast Video PIP Connect Auto174: ${if (!current) "ON" else "OFF"}")
}

// v174: Playlist Auto Next On End174
internal fun PlayerActivity.showV174PlaylistAutoNextOnEnd174Toggle() {
    val current = BiliClient.prefs.v174playlistAutoNextOnEnd174
    BiliClient.prefs.v174playlistAutoNextOnEnd174 = !current
    AppToast.show(this, "Playlist Auto Next On End174: ${if (!current) "ON" else "OFF"}")
}

// v174: Cache Compress Level174
internal fun PlayerActivity.showV174CacheCompressLevel174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174cacheCompressLevel174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174cacheCompressLevel174 = value
        AppToast.show(this, "Cache Compress Level174: $value")
    }
}

// v174: Progress Bar Scrub Preview Text
internal fun PlayerActivity.showV174ProgressBarScrubPreviewTextToggle() {
    val current = BiliClient.prefs.v174progressBarScrubPreviewText
    BiliClient.prefs.v174progressBarScrubPreviewText = !current
    AppToast.show(this, "Progress Bar Scrub Preview Text: ${if (!current) "ON" else "OFF"}")
}

// v174: Volume Normalize Track174
internal fun PlayerActivity.showV174VolumeNormalizeTrack174Toggle() {
    val current = BiliClient.prefs.v174volumeNormalizeTrack174
    BiliClient.prefs.v174volumeNormalizeTrack174 = !current
    AppToast.show(this, "Volume Normalize Track174: ${if (!current) "ON" else "OFF"}")
}

// v174: History Group By Uploader174
internal fun PlayerActivity.showV174HistoryGroupByUploader174Toggle() {
    val current = BiliClient.prefs.v174historyGroupByUploader174
    BiliClient.prefs.v174historyGroupByUploader174 = !current
    AppToast.show(this, "History Group By Uploader174: ${if (!current) "ON" else "OFF"}")
}

// v174: Playback Subtitle Offset174
internal fun PlayerActivity.showV174PlaybackSubtitleOffset174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174playbackSubtitleOffset174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174playbackSubtitleOffset174 = value
        AppToast.show(this, "Playback Subtitle Offset174: $value")
    }
}

// v174: Screenshot Overlay Title
internal fun PlayerActivity.showV174ScreenshotOverlayTitleToggle() {
    val current = BiliClient.prefs.v174screenshotOverlayTitle
    BiliClient.prefs.v174screenshotOverlayTitle = !current
    AppToast.show(this, "Screenshot Overlay Title: ${if (!current) "ON" else "OFF"}")
}

// v174: Video Saturation Toggle174
internal fun PlayerActivity.showV174VideoSaturationToggle174Toggle() {
    val current = BiliClient.prefs.v174videoSaturationToggle174
    BiliClient.prefs.v174videoSaturationToggle174 = !current
    AppToast.show(this, "Video Saturation Toggle174: ${if (!current) "ON" else "OFF"}")
}

// v174: Danmaku Scroll Overlap Mode
internal fun PlayerActivity.showV174DanmakuScrollOverlapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollOverlapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollOverlapMode = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode: $value")
    }
}

// v174: Subtitle Shadow Toggle174
internal fun PlayerActivity.showV174SubtitleShadowToggle174Toggle() {
    val current = BiliClient.prefs.v174subtitleShadowToggle174
    BiliClient.prefs.v174subtitleShadowToggle174 = !current
    AppToast.show(this, "Subtitle Shadow Toggle174: ${if (!current) "ON" else "OFF"}")
}

// v175: Audio Compressor Ratio175
internal fun PlayerActivity.showV175AudioCompressorRatio175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175audioCompressorRatio175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175audioCompressorRatio175 = value
        AppToast.show(this, "Audio Compressor Ratio175: $value")
    }
}

// v175: Danmaku Scroll Overlap Mode175
internal fun PlayerActivity.showV175DanmakuScrollOverlapMode175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollOverlapMode175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollOverlapMode175 = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode175: $value")
    }
}

// v175: Subtitle Shadow Toggle175
internal fun PlayerActivity.showV175SubtitleShadowToggle175Toggle() {
    val current = BiliClient.prefs.v175subtitleShadowToggle175
    BiliClient.prefs.v175subtitleShadowToggle175 = !current
    AppToast.show(this, "Subtitle Shadow Toggle175: ${if (!current) "ON" else "OFF"}")
}

// v175: Gesture Double Tap Seek
internal fun PlayerActivity.showV175GestureDoubleTapSeekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175gestureDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175gestureDoubleTapSeek = value
        AppToast.show(this, "Gesture Double Tap Seek: $value")
    }
}

// v175: Cast Video PIP Disconnect Action
internal fun PlayerActivity.showV175CastVideoPIPDisconnectActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175castVideoPIPDisconnectAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Disconnect Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175castVideoPIPDisconnectAction = value
        AppToast.show(this, "Cast Video PIP Disconnect Action: $value")
    }
}

// v175: Playlist Skip On Error
internal fun PlayerActivity.showV175PlaylistSkipOnErrorToggle() {
    val current = BiliClient.prefs.v175playlistSkipOnError
    BiliClient.prefs.v175playlistSkipOnError = !current
    AppToast.show(this, "Playlist Skip On Error: ${if (!current) "ON" else "OFF"}")
}

// v175: Cache Compress Level175
internal fun PlayerActivity.showV175CacheCompressLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175cacheCompressLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175cacheCompressLevel175 = value
        AppToast.show(this, "Cache Compress Level175: $value")
    }
}

// v175: Progress Bar Scrub Haptic
internal fun PlayerActivity.showV175ProgressBarScrubHapticToggle() {
    val current = BiliClient.prefs.v175progressBarScrubHaptic
    BiliClient.prefs.v175progressBarScrubHaptic = !current
    AppToast.show(this, "Progress Bar Scrub Haptic: ${if (!current) "ON" else "OFF"}")
}

// v175: Volume Normalize Album
internal fun PlayerActivity.showV175VolumeNormalizeAlbumToggle() {
    val current = BiliClient.prefs.v175volumeNormalizeAlbum
    BiliClient.prefs.v175volumeNormalizeAlbum = !current
    AppToast.show(this, "Volume Normalize Album: ${if (!current) "ON" else "OFF"}")
}

// v175: History Filter By Duration
internal fun PlayerActivity.showV175HistoryFilterByDurationToggle() {
    val current = BiliClient.prefs.v175historyFilterByDuration
    BiliClient.prefs.v175historyFilterByDuration = !current
    AppToast.show(this, "History Filter By Duration: ${if (!current) "ON" else "OFF"}")
}

// v175: Playback Video Offset
internal fun PlayerActivity.showV175PlaybackVideoOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175playbackVideoOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175playbackVideoOffset = value
        AppToast.show(this, "Playback Video Offset: $value")
    }
}

// v175: Screenshot Overlay Channel
internal fun PlayerActivity.showV175ScreenshotOverlayChannelToggle() {
    val current = BiliClient.prefs.v175screenshotOverlayChannel
    BiliClient.prefs.v175screenshotOverlayChannel = !current
    AppToast.show(this, "Screenshot Overlay Channel: ${if (!current) "ON" else "OFF"}")
}

// v175: Video Saturation Level175
internal fun PlayerActivity.showV175VideoSaturationLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175videoSaturationLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175videoSaturationLevel175 = value
        AppToast.show(this, "Video Saturation Level175: $value")
    }
}

// v175: Danmaku Scroll Filter
internal fun PlayerActivity.showV175DanmakuScrollFilterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollFilter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollFilter = value
        AppToast.show(this, "Danmaku Scroll Filter: $value")
    }
}

// v175: Subtitle Shadow Color
internal fun PlayerActivity.showV175SubtitleShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175subtitleShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175subtitleShadowColor = value
        AppToast.show(this, "Subtitle Shadow Color: $value")
    }
}

// v176: Audio Compressor Ratio176
internal fun PlayerActivity.showV176AudioCompressorRatio176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176audioCompressorRatio176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176audioCompressorRatio176 = value
        AppToast.show(this, "Audio Compressor Ratio176: $value")
    }
}

// v176: Danmaku Scroll Filter176
internal fun PlayerActivity.showV176DanmakuScrollFilter176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176danmakuScrollFilter176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176danmakuScrollFilter176 = value
        AppToast.show(this, "Danmaku Scroll Filter176: $value")
    }
}

// v176: Subtitle Shadow Color176
internal fun PlayerActivity.showV176SubtitleShadowColor176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowColor176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowColor176 = value
        AppToast.show(this, "Subtitle Shadow Color176: $value")
    }
}

// v176: Gesture Double Tap Seek176
internal fun PlayerActivity.showV176GestureDoubleTapSeek176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176gestureDoubleTapSeek176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176gestureDoubleTapSeek176 = value
        AppToast.show(this, "Gesture Double Tap Seek176: $value")
    }
}

// v176: Cast Video PIP Reconnect
internal fun PlayerActivity.showV176CastVideoPIPReconnectToggle() {
    val current = BiliClient.prefs.v176castVideoPIPReconnect
    BiliClient.prefs.v176castVideoPIPReconnect = !current
    AppToast.show(this, "Cast Video PIP Reconnect: ${if (!current) "ON" else "OFF"}")
}

// v176: Playlist Skip On Error176
internal fun PlayerActivity.showV176PlaylistSkipOnError176Toggle() {
    val current = BiliClient.prefs.v176playlistSkipOnError176
    BiliClient.prefs.v176playlistSkipOnError176 = !current
    AppToast.show(this, "Playlist Skip On Error176: ${if (!current) "ON" else "OFF"}")
}

// v176: Cache Stream Buffer Size
internal fun PlayerActivity.showV176CacheStreamBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176cacheStreamBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176cacheStreamBufferSize = value
        AppToast.show(this, "Cache Stream Buffer Size: $value")
    }
}

// v176: Progress Bar Scrub Haptic176
internal fun PlayerActivity.showV176ProgressBarScrubHaptic176Toggle() {
    val current = BiliClient.prefs.v176progressBarScrubHaptic176
    BiliClient.prefs.v176progressBarScrubHaptic176 = !current
    AppToast.show(this, "Progress Bar Scrub Haptic176: ${if (!current) "ON" else "OFF"}")
}

// v176: Volume Normalize Album176
internal fun PlayerActivity.showV176VolumeNormalizeAlbum176Toggle() {
    val current = BiliClient.prefs.v176volumeNormalizeAlbum176
    BiliClient.prefs.v176volumeNormalizeAlbum176 = !current
    AppToast.show(this, "Volume Normalize Album176: ${if (!current) "ON" else "OFF"}")
}

// v176: History Filter By Duration176
internal fun PlayerActivity.showV176HistoryFilterByDuration176Toggle() {
    val current = BiliClient.prefs.v176historyFilterByDuration176
    BiliClient.prefs.v176historyFilterByDuration176 = !current
    AppToast.show(this, "History Filter By Duration176: ${if (!current) "ON" else "OFF"}")
}

// v176: Playback Video Offset176
internal fun PlayerActivity.showV176PlaybackVideoOffset176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176playbackVideoOffset176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176playbackVideoOffset176 = value
        AppToast.show(this, "Playback Video Offset176: $value")
    }
}

// v176: Screenshot Overlay Quality
internal fun PlayerActivity.showV176ScreenshotOverlayQualityToggle() {
    val current = BiliClient.prefs.v176screenshotOverlayQuality
    BiliClient.prefs.v176screenshotOverlayQuality = !current
    AppToast.show(this, "Screenshot Overlay Quality: ${if (!current) "ON" else "OFF"}")
}

// v176: Video Saturation Level176
internal fun PlayerActivity.showV176VideoSaturationLevel176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176videoSaturationLevel176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176videoSaturationLevel176 = value
        AppToast.show(this, "Video Saturation Level176: $value")
    }
}

// v176: Danmaku Scroll Hide On Action
internal fun PlayerActivity.showV176DanmakuScrollHideOnActionToggle() {
    val current = BiliClient.prefs.v176danmakuScrollHideOnAction
    BiliClient.prefs.v176danmakuScrollHideOnAction = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action: ${if (!current) "ON" else "OFF"}")
}

// v176: Subtitle Shadow Blur
internal fun PlayerActivity.showV176SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
}

// v177: Audio Compressor Knee177
internal fun PlayerActivity.showV177AudioCompressorKnee177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177audioCompressorKnee177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Knee177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177audioCompressorKnee177 = value
        AppToast.show(this, "Audio Compressor Knee177: $value")
    }
}

// v177: Danmaku Scroll Hide On Action177
internal fun PlayerActivity.showV177DanmakuScrollHideOnAction177Toggle() {
    val current = BiliClient.prefs.v177danmakuScrollHideOnAction177
    BiliClient.prefs.v177danmakuScrollHideOnAction177 = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action177: ${if (!current) "ON" else "OFF"}")
}

// v177: Subtitle Shadow Blur177
internal fun PlayerActivity.showV177SubtitleShadowBlur177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowBlur177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowBlur177 = value
        AppToast.show(this, "Subtitle Shadow Blur177: $value")
    }
}

// v177: Gesture Double Tap Play Pause
internal fun PlayerActivity.showV177GestureDoubleTapPlayPauseToggle() {
    val current = BiliClient.prefs.v177gestureDoubleTapPlayPause
    BiliClient.prefs.v177gestureDoubleTapPlayPause = !current
    AppToast.show(this, "Gesture Double Tap Play Pause: ${if (!current) "ON" else "OFF"}")
}

// v177: Cast Video PIP Reconnect177
internal fun PlayerActivity.showV177CastVideoPIPReconnect177Toggle() {
    val current = BiliClient.prefs.v177castVideoPIPReconnect177
    BiliClient.prefs.v177castVideoPIPReconnect177 = !current
    AppToast.show(this, "Cast Video PIP Reconnect177: ${if (!current) "ON" else "OFF"}")
}

// v177: Playlist Max History Size
internal fun PlayerActivity.showV177PlaylistMaxHistorySizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177playlistMaxHistorySize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177playlistMaxHistorySize = value
        AppToast.show(this, "Playlist Max History Size: $value")
    }
}

// v177: Cache Stream Buffer Size177
internal fun PlayerActivity.showV177CacheStreamBufferSize177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177cacheStreamBufferSize177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177cacheStreamBufferSize177 = value
        AppToast.show(this, "Cache Stream Buffer Size177: $value")
    }
}

// v177: Progress Bar Scrub Timeline
internal fun PlayerActivity.showV177ProgressBarScrubTimelineToggle() {
    val current = BiliClient.prefs.v177progressBarScrubTimeline
    BiliClient.prefs.v177progressBarScrubTimeline = !current
    AppToast.show(this, "Progress Bar Scrub Timeline: ${if (!current) "ON" else "OFF"}")
}

// v177: Volume Normalize Track177
internal fun PlayerActivity.showV177VolumeNormalizeTrack177Toggle() {
    val current = BiliClient.prefs.v177volumeNormalizeTrack177
    BiliClient.prefs.v177volumeNormalizeTrack177 = !current
    AppToast.show(this, "Volume Normalize Track177: ${if (!current) "ON" else "OFF"}")
}

// v177: History Filter By Uploader
internal fun PlayerActivity.showV177HistoryFilterByUploaderToggle() {
    val current = BiliClient.prefs.v177historyFilterByUploader
    BiliClient.prefs.v177historyFilterByUploader = !current
    AppToast.show(this, "History Filter By Uploader: ${if (!current) "ON" else "OFF"}")
}

// v177: Playback Deinterlace Toggle
internal fun PlayerActivity.showV177PlaybackDeinterlaceToggleToggle() {
    val current = BiliClient.prefs.v177playbackDeinterlaceToggle
    BiliClient.prefs.v177playbackDeinterlaceToggle = !current
    AppToast.show(this, "Playback Deinterlace Toggle: ${if (!current) "ON" else "OFF"}")
}

// v177: Screenshot Overlay Bitrate
internal fun PlayerActivity.showV177ScreenshotOverlayBitrateToggle() {
    val current = BiliClient.prefs.v177screenshotOverlayBitrate
    BiliClient.prefs.v177screenshotOverlayBitrate = !current
    AppToast.show(this, "Screenshot Overlay Bitrate: ${if (!current) "ON" else "OFF"}")
}

// v177: Video Brightness Toggle177
internal fun PlayerActivity.showV177VideoBrightnessToggle177Toggle() {
    val current = BiliClient.prefs.v177videoBrightnessToggle177
    BiliClient.prefs.v177videoBrightnessToggle177 = !current
    AppToast.show(this, "Video Brightness Toggle177: ${if (!current) "ON" else "OFF"}")
}

// v177: Danmaku Scroll Auto Speed
internal fun PlayerActivity.showV177DanmakuScrollAutoSpeedToggle() {
    val current = BiliClient.prefs.v177danmakuScrollAutoSpeed
    BiliClient.prefs.v177danmakuScrollAutoSpeed = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed: ${if (!current) "ON" else "OFF"}")
}

// v177: Subtitle Shadow Offset
internal fun PlayerActivity.showV177SubtitleShadowOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowOffset = value
        AppToast.show(this, "Subtitle Shadow Offset: $value")
    }
}

// v178: Audio Compressor Attack178
internal fun PlayerActivity.showV178AudioCompressorAttack178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178audioCompressorAttack178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178audioCompressorAttack178 = value
        AppToast.show(this, "Audio Compressor Attack178: $value")
    }
}

// v178: Danmaku Scroll Auto Speed178
internal fun PlayerActivity.showV178DanmakuScrollAutoSpeed178Toggle() {
    val current = BiliClient.prefs.v178danmakuScrollAutoSpeed178
    BiliClient.prefs.v178danmakuScrollAutoSpeed178 = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed178: ${if (!current) "ON" else "OFF"}")
}

// v178: Subtitle Shadow Offset178
internal fun PlayerActivity.showV178SubtitleShadowOffset178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178subtitleShadowOffset178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178subtitleShadowOffset178 = value
        AppToast.show(this, "Subtitle Shadow Offset178: $value")
    }
}

// v178: Gesture Double Tap Play Pause178
internal fun PlayerActivity.showV178GestureDoubleTapPlayPause178Toggle() {
    val current = BiliClient.prefs.v178gestureDoubleTapPlayPause178
    BiliClient.prefs.v178gestureDoubleTapPlayPause178 = !current
    AppToast.show(this, "Gesture Double Tap Play Pause178: ${if (!current) "ON" else "OFF"}")
}

// v178: Cast Video PIP Resolution Lock
internal fun PlayerActivity.showV178CastVideoPIPResolutionLockToggle() {
    val current = BiliClient.prefs.v178castVideoPIPResolutionLock
    BiliClient.prefs.v178castVideoPIPResolutionLock = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock: ${if (!current) "ON" else "OFF"}")
}

// v178: Playlist Max History Size178
internal fun PlayerActivity.showV178PlaylistMaxHistorySize178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178playlistMaxHistorySize178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178playlistMaxHistorySize178 = value
        AppToast.show(this, "Playlist Max History Size178: $value")
    }
}

// v178: Cache Stream Prefetch
internal fun PlayerActivity.showV178CacheStreamPrefetchToggle() {
    val current = BiliClient.prefs.v178cacheStreamPrefetch
    BiliClient.prefs.v178cacheStreamPrefetch = !current
    AppToast.show(this, "Cache Stream Prefetch: ${if (!current) "ON" else "OFF"}")
}

// v178: Progress Bar Scrub Timeline178
internal fun PlayerActivity.showV178ProgressBarScrubTimeline178Toggle() {
    val current = BiliClient.prefs.v178progressBarScrubTimeline178
    BiliClient.prefs.v178progressBarScrubTimeline178 = !current
    AppToast.show(this, "Progress Bar Scrub Timeline178: ${if (!current) "ON" else "OFF"}")
}

// v178: Volume Normalize Track178
internal fun PlayerActivity.showV178VolumeNormalizeTrack178Toggle() {
    val current = BiliClient.prefs.v178volumeNormalizeTrack178
    BiliClient.prefs.v178volumeNormalizeTrack178 = !current
    AppToast.show(this, "Volume Normalize Track178: ${if (!current) "ON" else "OFF"}")
}

// v178: History Filter By Uploader178
internal fun PlayerActivity.showV178HistoryFilterByUploader178Toggle() {
    val current = BiliClient.prefs.v178historyFilterByUploader178
    BiliClient.prefs.v178historyFilterByUploader178 = !current
    AppToast.show(this, "History Filter By Uploader178: ${if (!current) "ON" else "OFF"}")
}

// v178: Playback Deinterlace Toggle178
internal fun PlayerActivity.showV178PlaybackDeinterlaceToggle178Toggle() {
    val current = BiliClient.prefs.v178playbackDeinterlaceToggle178
    BiliClient.prefs.v178playbackDeinterlaceToggle178 = !current
    AppToast.show(this, "Playback Deinterlace Toggle178: ${if (!current) "ON" else "OFF"}")
}

// v178: Screenshot Overlay FPS
internal fun PlayerActivity.showV178ScreenshotOverlayFPSToggle() {
    val current = BiliClient.prefs.v178screenshotOverlayFPS
    BiliClient.prefs.v178screenshotOverlayFPS = !current
    AppToast.show(this, "Screenshot Overlay FPS: ${if (!current) "ON" else "OFF"}")
}

// v178: Video Brightness Level178
internal fun PlayerActivity.showV178VideoBrightnessLevel178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178videoBrightnessLevel178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178videoBrightnessLevel178 = value
        AppToast.show(this, "Video Brightness Level178: $value")
    }
}

// v178: Danmaku Scroll Priority
internal fun PlayerActivity.showV178DanmakuScrollPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178danmakuScrollPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178danmakuScrollPriority = value
        AppToast.show(this, "Danmaku Scroll Priority: $value")
    }
}

// v178: Subtitle Outline Toggle178
internal fun PlayerActivity.showV178SubtitleOutlineToggle178Toggle() {
    val current = BiliClient.prefs.v178subtitleOutlineToggle178
    BiliClient.prefs.v178subtitleOutlineToggle178 = !current
    AppToast.show(this, "Subtitle Outline Toggle178: ${if (!current) "ON" else "OFF"}")
}

// v179: Audio Compressor Release179
internal fun PlayerActivity.showV179AudioCompressorRelease179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179audioCompressorRelease179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179audioCompressorRelease179 = value
        AppToast.show(this, "Audio Compressor Release179: $value")
    }
}

// v179: Danmaku Scroll Priority179
internal fun PlayerActivity.showV179DanmakuScrollPriority179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179danmakuScrollPriority179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179danmakuScrollPriority179 = value
        AppToast.show(this, "Danmaku Scroll Priority179: $value")
    }
}

// v179: Subtitle Outline Toggle179
internal fun PlayerActivity.showV179SubtitleOutlineToggle179Toggle() {
    val current = BiliClient.prefs.v179subtitleOutlineToggle179
    BiliClient.prefs.v179subtitleOutlineToggle179 = !current
    AppToast.show(this, "Subtitle Outline Toggle179: ${if (!current) "ON" else "OFF"}")
}

// v179: Gesture Tap Feedback
internal fun PlayerActivity.showV179GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v179gestureTapFeedback
    BiliClient.prefs.v179gestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

// v179: Cast Video PIP Resolution Lock179
internal fun PlayerActivity.showV179CastVideoPIPResolutionLock179Toggle() {
    val current = BiliClient.prefs.v179castVideoPIPResolutionLock179
    BiliClient.prefs.v179castVideoPIPResolutionLock179 = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock179: ${if (!current) "ON" else "OFF"}")
}

// v179: Playlist Smart Queue
internal fun PlayerActivity.showV179PlaylistSmartQueueToggle() {
    val current = BiliClient.prefs.v179playlistSmartQueue
    BiliClient.prefs.v179playlistSmartQueue = !current
    AppToast.show(this, "Playlist Smart Queue: ${if (!current) "ON" else "OFF"}")
}

// v179: Cache Stream Prefetch179
internal fun PlayerActivity.showV179CacheStreamPrefetch179Toggle() {
    val current = BiliClient.prefs.v179cacheStreamPrefetch179
    BiliClient.prefs.v179cacheStreamPrefetch179 = !current
    AppToast.show(this, "Cache Stream Prefetch179: ${if (!current) "ON" else "OFF"}")
}

// v179: Progress Bar Scrub Gesture
internal fun PlayerActivity.showV179ProgressBarScrubGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179progressBarScrubGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179progressBarScrubGesture = value
        AppToast.show(this, "Progress Bar Scrub Gesture: $value")
    }
}

// v179: Volume Normalize Track179
internal fun PlayerActivity.showV179VolumeNormalizeTrack179Toggle() {
    val current = BiliClient.prefs.v179volumeNormalizeTrack179
    BiliClient.prefs.v179volumeNormalizeTrack179 = !current
    AppToast.show(this, "Volume Normalize Track179: ${if (!current) "ON" else "OFF"}")
}

// v179: History Filter By Quality
internal fun PlayerActivity.showV179HistoryFilterByQualityToggle() {
    val current = BiliClient.prefs.v179historyFilterByQuality
    BiliClient.prefs.v179historyFilterByQuality = !current
    AppToast.show(this, "History Filter By Quality: ${if (!current) "ON" else "OFF"}")
}

// v179: Playback Rotate Video
internal fun PlayerActivity.showV179PlaybackRotateVideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179playbackRotateVideo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179playbackRotateVideo = value
        AppToast.show(this, "Playback Rotate Video: $value")
    }
}

// v179: Screenshot Overlay FPS179
internal fun PlayerActivity.showV179ScreenshotOverlayFPS179Toggle() {
    val current = BiliClient.prefs.v179screenshotOverlayFPS179
    BiliClient.prefs.v179screenshotOverlayFPS179 = !current
    AppToast.show(this, "Screenshot Overlay FPS179: ${if (!current) "ON" else "OFF"}")
}

// v179: Video Brightness Level179
internal fun PlayerActivity.showV179VideoBrightnessLevel179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179videoBrightnessLevel179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179videoBrightnessLevel179 = value
        AppToast.show(this, "Video Brightness Level179: $value")
    }
}

// v179: Danmaku Scroll Merge
internal fun PlayerActivity.showV179DanmakuScrollMergeToggle() {
    val current = BiliClient.prefs.v179danmakuScrollMerge
    BiliClient.prefs.v179danmakuScrollMerge = !current
    AppToast.show(this, "Danmaku Scroll Merge: ${if (!current) "ON" else "OFF"}")
}

// v179: Subtitle Outline Color179
internal fun PlayerActivity.showV179SubtitleOutlineColor179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179subtitleOutlineColor179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179subtitleOutlineColor179 = value
        AppToast.show(this, "Subtitle Outline Color179: $value")
    }
}

// v180: Audio Compressor Mix180
internal fun PlayerActivity.showV180AudioCompressorMix180Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v180audioCompressorMix180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Mix180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180audioCompressorMix180 = value
        AppToast.show(this, "Audio Compressor Mix180: $value")
    }
}

// v180: Danmaku Scroll Merge180
internal fun PlayerActivity.showV180DanmakuScrollMerge180Toggle() {
    val current = BiliClient.prefs.v180danmakuScrollMerge180
    BiliClient.prefs.v180danmakuScrollMerge180 = !current
    AppToast.show(this, "Danmaku Scroll Merge180: ${if (!current) "ON" else "OFF"}")
}

// v180: Subtitle Outline Color180
internal fun PlayerActivity.showV180SubtitleOutlineColor180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineColor180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineColor180 = value
        AppToast.show(this, "Subtitle Outline Color180: $value")
    }
}

// v180: Gesture Tap Feedback180
internal fun PlayerActivity.showV180GestureTapFeedback180Toggle() {
    val current = BiliClient.prefs.v180gestureTapFeedback180
    BiliClient.prefs.v180gestureTapFeedback180 = !current
    AppToast.show(this, "Gesture Tap Feedback180: ${if (!current) "ON" else "OFF"}")
}

// v180: Cast Video PIP Sync Mode
internal fun PlayerActivity.showV180CastVideoPIPSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180castVideoPIPSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180castVideoPIPSyncMode = value
        AppToast.show(this, "Cast Video PIP Sync Mode: $value")
    }
}

// v180: Playlist Smart Queue180
internal fun PlayerActivity.showV180PlaylistSmartQueue180Toggle() {
    val current = BiliClient.prefs.v180playlistSmartQueue180
    BiliClient.prefs.v180playlistSmartQueue180 = !current
    AppToast.show(this, "Playlist Smart Queue180: ${if (!current) "ON" else "OFF"}")
}

// v180: Cache Stream Read Ahead
internal fun PlayerActivity.showV180CacheStreamReadAheadToggle() {
    val current = BiliClient.prefs.v180cacheStreamReadAhead
    BiliClient.prefs.v180cacheStreamReadAhead = !current
    AppToast.show(this, "Cache Stream Read Ahead: ${if (!current) "ON" else "OFF"}")
}

// v180: Progress Bar Scrub Gesture180
internal fun PlayerActivity.showV180ProgressBarScrubGesture180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180progressBarScrubGesture180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180progressBarScrubGesture180 = value
        AppToast.show(this, "Progress Bar Scrub Gesture180: $value")
    }
}

// v180: Volume Normalize Track180
internal fun PlayerActivity.showV180VolumeNormalizeTrack180Toggle() {
    val current = BiliClient.prefs.v180volumeNormalizeTrack180
    BiliClient.prefs.v180volumeNormalizeTrack180 = !current
    AppToast.show(this, "Volume Normalize Track180: ${if (!current) "ON" else "OFF"}")
}

// v180: History Filter By Quality180
internal fun PlayerActivity.showV180HistoryFilterByQuality180Toggle() {
    val current = BiliClient.prefs.v180historyFilterByQuality180
    BiliClient.prefs.v180historyFilterByQuality180 = !current
    AppToast.show(this, "History Filter By Quality180: ${if (!current) "ON" else "OFF"}")
}

// v180: Playback Rotate Video180
internal fun PlayerActivity.showV180PlaybackRotateVideo180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180playbackRotateVideo180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180playbackRotateVideo180 = value
        AppToast.show(this, "Playback Rotate Video180: $value")
    }
}

// v180: Screenshot Overlay Codec
internal fun PlayerActivity.showV180ScreenshotOverlayCodecToggle() {
    val current = BiliClient.prefs.v180screenshotOverlayCodec
    BiliClient.prefs.v180screenshotOverlayCodec = !current
    AppToast.show(this, "Screenshot Overlay Codec: ${if (!current) "ON" else "OFF"}")
}

// v180: Video Gamma Toggle180
internal fun PlayerActivity.showV180VideoGammaToggle180Toggle() {
    val current = BiliClient.prefs.v180videoGammaToggle180
    BiliClient.prefs.v180videoGammaToggle180 = !current
    AppToast.show(this, "Video Gamma Toggle180: ${if (!current) "ON" else "OFF"}")
}

// v180: Danmaku Scroll Merge Mode
internal fun PlayerActivity.showV180DanmakuScrollMergeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180danmakuScrollMergeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Merge Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180danmakuScrollMergeMode = value
        AppToast.show(this, "Danmaku Scroll Merge Mode: $value")
    }
}

// v180: Subtitle Outline Width180
internal fun PlayerActivity.showV180SubtitleOutlineWidth180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineWidth180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineWidth180 = value
        AppToast.show(this, "Subtitle Outline Width180: $value")
    }
}

// v181: Audio Reverb Toggle181
internal fun PlayerActivity.showV181AudioReverbToggle181Toggle() {
    val current = BiliClient.prefs.v181audioReverbToggle181
    BiliClient.prefs.v181audioReverbToggle181 = !current
    AppToast.show(this, "Audio Reverb Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: Danmaku Fixed Position
internal fun PlayerActivity.showV181DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

// v181: Subtitle Bg Color Alpha
internal fun PlayerActivity.showV181SubtitleBgColorAlphaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha = value
        AppToast.show(this, "Subtitle Bg Color Alpha: $value")
    }
}

// v181: Gesture Edge Swipe Left
internal fun PlayerActivity.showV181GestureEdgeSwipeLeftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181gestureEdgeSwipeLeft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Left",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181gestureEdgeSwipeLeft = value
        AppToast.show(this, "Gesture Edge Swipe Left: $value")
    }
}

// v181: Cast Audio Bitrate
internal fun PlayerActivity.showV181CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181castAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181castAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
}

// v181: Playlist Loop Single
internal fun PlayerActivity.showV181PlaylistLoopSingleToggle() {
    val current = BiliClient.prefs.v181playlistLoopSingle
    BiliClient.prefs.v181playlistLoopSingle = !current
    AppToast.show(this, "Playlist Loop Single: ${if (!current) "ON" else "OFF"}")
}

// v181: Cache Download Resume
internal fun PlayerActivity.showV181CacheDownloadResumeToggle() {
    val current = BiliClient.prefs.v181cacheDownloadResume
    BiliClient.prefs.v181cacheDownloadResume = !current
    AppToast.show(this, "Cache Download Resume: ${if (!current) "ON" else "OFF"}")
}

// v181: Progress Bar Thumb Size
internal fun PlayerActivity.showV181ProgressBarThumbSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181progressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181progressBarThumbSize = value
        AppToast.show(this, "Progress Bar Thumb Size: $value")
    }
}

// v181: Volume Boost Toggle181
internal fun PlayerActivity.showV181VolumeBoostToggle181Toggle() {
    val current = BiliClient.prefs.v181volumeBoostToggle181
    BiliClient.prefs.v181volumeBoostToggle181 = !current
    AppToast.show(this, "Volume Boost Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: History Bookmark Toggle
internal fun PlayerActivity.showV181HistoryBookmarkToggleToggle() {
    val current = BiliClient.prefs.v181historyBookmarkToggle
    BiliClient.prefs.v181historyBookmarkToggle = !current
    AppToast.show(this, "History Bookmark Toggle: ${if (!current) "ON" else "OFF"}")
}

// v181: Playback Chapter Skip
internal fun PlayerActivity.showV181PlaybackChapterSkipToggle() {
    val current = BiliClient.prefs.v181playbackChapterSkip
    BiliClient.prefs.v181playbackChapterSkip = !current
    AppToast.show(this, "Playback Chapter Skip: ${if (!current) "ON" else "OFF"}")
}

// v181: Screenshot Region Select
internal fun PlayerActivity.showV181ScreenshotRegionSelectToggle() {
    val current = BiliClient.prefs.v181screenshotRegionSelect
    BiliClient.prefs.v181screenshotRegionSelect = !current
    AppToast.show(this, "Screenshot Region Select: ${if (!current) "ON" else "OFF"}")
}

// v181: Video HDR10 Toggle181
internal fun PlayerActivity.showV181VideoHDR10Toggle181Toggle() {
    val current = BiliClient.prefs.v181videoHDR10Toggle181
    BiliClient.prefs.v181videoHDR10Toggle181 = !current
    AppToast.show(this, "Video HDR10 Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: Danmaku Fixed Position181
internal fun PlayerActivity.showV181DanmakuFixedPosition181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition181 = value
        AppToast.show(this, "Danmaku Fixed Position181: $value")
    }
}

// v181: Subtitle Bg Color Alpha181
internal fun PlayerActivity.showV181SubtitleBgColorAlpha181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha181 = value
        AppToast.show(this, "Subtitle Bg Color Alpha181: $value")
    }
}

// v182: Audio Reverb Decay182
internal fun PlayerActivity.showV182AudioReverbDecay182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182audioReverbDecay182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182audioReverbDecay182 = value
        AppToast.show(this, "Audio Reverb Decay182: $value")
    }
}

// v182: Danmaku Fixed Font182
internal fun PlayerActivity.showV182DanmakuFixedFont182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedFont182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Font182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedFont182 = value
        AppToast.show(this, "Danmaku Fixed Font182: $value")
    }
}

// v182: Subtitle Bg Color Alpha182
internal fun PlayerActivity.showV182SubtitleBgColorAlpha182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColorAlpha182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColorAlpha182 = value
        AppToast.show(this, "Subtitle Bg Color Alpha182: $value")
    }
}

// v182: Gesture Edge Swipe Right182
internal fun PlayerActivity.showV182GestureEdgeSwipeRight182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182gestureEdgeSwipeRight182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Right182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182gestureEdgeSwipeRight182 = value
        AppToast.show(this, "Gesture Edge Swipe Right182: $value")
    }
}

// v182: Cast Audio Bitrate182
internal fun PlayerActivity.showV182CastAudioBitrate182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182castAudioBitrate182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182castAudioBitrate182 = value
        AppToast.show(this, "Cast Audio Bitrate182: $value")
    }
}

// v182: Playlist Loop Single182
internal fun PlayerActivity.showV182PlaylistLoopSingle182Toggle() {
    val current = BiliClient.prefs.v182playlistLoopSingle182
    BiliClient.prefs.v182playlistLoopSingle182 = !current
    AppToast.show(this, "Playlist Loop Single182: ${if (!current) "ON" else "OFF"}")
}

// v182: Cache Download Resume182
internal fun PlayerActivity.showV182CacheDownloadResume182Toggle() {
    val current = BiliClient.prefs.v182cacheDownloadResume182
    BiliClient.prefs.v182cacheDownloadResume182 = !current
    AppToast.show(this, "Cache Download Resume182: ${if (!current) "ON" else "OFF"}")
}

// v182: Progress Bar Thumb Size182
internal fun PlayerActivity.showV182ProgressBarThumbSize182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182progressBarThumbSize182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182progressBarThumbSize182 = value
        AppToast.show(this, "Progress Bar Thumb Size182: $value")
    }
}

// v182: Volume Boost Level182
internal fun PlayerActivity.showV182VolumeBoostLevel182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182volumeBoostLevel182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182volumeBoostLevel182 = value
        AppToast.show(this, "Volume Boost Level182: $value")
    }
}

// v182: History Bookmark Toggle182
internal fun PlayerActivity.showV182HistoryBookmarkToggle182Toggle() {
    val current = BiliClient.prefs.v182historyBookmarkToggle182
    BiliClient.prefs.v182historyBookmarkToggle182 = !current
    AppToast.show(this, "History Bookmark Toggle182: ${if (!current) "ON" else "OFF"}")
}

// v182: Playback Chapter Skip182
internal fun PlayerActivity.showV182PlaybackChapterSkip182Toggle() {
    val current = BiliClient.prefs.v182playbackChapterSkip182
    BiliClient.prefs.v182playbackChapterSkip182 = !current
    AppToast.show(this, "Playback Chapter Skip182: ${if (!current) "ON" else "OFF"}")
}

// v182: Screenshot Region Select182
internal fun PlayerActivity.showV182ScreenshotRegionSelect182Toggle() {
    val current = BiliClient.prefs.v182screenshotRegionSelect182
    BiliClient.prefs.v182screenshotRegionSelect182 = !current
    AppToast.show(this, "Screenshot Region Select182: ${if (!current) "ON" else "OFF"}")
}

// v182: Video HDR10 Level182
internal fun PlayerActivity.showV182VideoHDR10Level182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182videoHDR10Level182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182videoHDR10Level182 = value
        AppToast.show(this, "Video HDR10 Level182: $value")
    }
}

// v182: Danmaku Fixed Speed
internal fun PlayerActivity.showV182DanmakuFixedSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedSpeed = value
        AppToast.show(this, "Danmaku Fixed Speed: $value")
    }
}

// v182: Subtitle Bg Color
internal fun PlayerActivity.showV182SubtitleBgColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColor = value
        AppToast.show(this, "Subtitle Bg Color: $value")
    }
}

// v183: Audio Reverb Decay183
internal fun PlayerActivity.showV183AudioReverbDecay183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183audioReverbDecay183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183audioReverbDecay183 = value
        AppToast.show(this, "Audio Reverb Decay183: $value")
    }
}

// v183: Danmaku Fixed Speed183
internal fun PlayerActivity.showV183DanmakuFixedSpeed183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedSpeed183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedSpeed183 = value
        AppToast.show(this, "Danmaku Fixed Speed183: $value")
    }
}

// v183: Subtitle Bg Color183
internal fun PlayerActivity.showV183SubtitleBgColor183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor183 = value
        AppToast.show(this, "Subtitle Bg Color183: $value")
    }
}
