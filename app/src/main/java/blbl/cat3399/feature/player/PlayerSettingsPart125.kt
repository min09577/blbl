package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



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

