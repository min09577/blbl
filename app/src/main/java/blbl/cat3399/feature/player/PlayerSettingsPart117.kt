package blbl.cat3399.feature.player

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

