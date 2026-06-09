package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1201: allow mode
internal fun PlayerActivity.showV1201AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1201allow
    FeaturePrefsStore.batch1201.v1201allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1201: alloy mode
internal fun PlayerActivity.showV1201AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1201alloy
    FeaturePrefsStore.batch1201.v1201alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1201: alpha mode
internal fun PlayerActivity.showV1201AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1201alpha
    FeaturePrefsStore.batch1201.v1201alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1201: alpine mode
internal fun PlayerActivity.showV1201AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1201alpine
    FeaturePrefsStore.batch1201.v1201alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1201: alter mode
internal fun PlayerActivity.showV1201AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1201alter
    FeaturePrefsStore.batch1201.v1201alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1201: amaze level
internal fun PlayerActivity.showV1201AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1201amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1201amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1201: amber level
internal fun PlayerActivity.showV1201AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1201amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1201amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1201: ample level
internal fun PlayerActivity.showV1201AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1201ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1201ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1201: amuse level
internal fun PlayerActivity.showV1201AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1201amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1201amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1201: angel level
internal fun PlayerActivity.showV1201AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1201angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1201angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1201: anger mode
internal fun PlayerActivity.showV1201AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1201anger
    FeaturePrefsStore.batch1201.v1201anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1201: angle mode
internal fun PlayerActivity.showV1201AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1201angle
    FeaturePrefsStore.batch1201.v1201angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1201: ankle mode
internal fun PlayerActivity.showV1201AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1201ankle
    FeaturePrefsStore.batch1201.v1201ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1201: annual mode
internal fun PlayerActivity.showV1201AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1201annual
    FeaturePrefsStore.batch1201.v1201annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1201: answer mode
internal fun PlayerActivity.showV1201AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1201answer
    FeaturePrefsStore.batch1201.v1201answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1202: allow mode
internal fun PlayerActivity.showV1202AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1202allow
    FeaturePrefsStore.batch1201.v1202allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1202: alloy mode
internal fun PlayerActivity.showV1202AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1202alloy
    FeaturePrefsStore.batch1201.v1202alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1202: alpha mode
internal fun PlayerActivity.showV1202AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1202alpha
    FeaturePrefsStore.batch1201.v1202alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1202: alpine mode
internal fun PlayerActivity.showV1202AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1202alpine
    FeaturePrefsStore.batch1201.v1202alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1202: alter mode
internal fun PlayerActivity.showV1202AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1202alter
    FeaturePrefsStore.batch1201.v1202alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1202: amaze level
internal fun PlayerActivity.showV1202AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1202amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1202amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1202: amber level
internal fun PlayerActivity.showV1202AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1202amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1202amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1202: ample level
internal fun PlayerActivity.showV1202AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1202ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1202ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1202: amuse level
internal fun PlayerActivity.showV1202AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1202amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1202amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1202: angel level
internal fun PlayerActivity.showV1202AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1202angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1202angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1202: anger mode
internal fun PlayerActivity.showV1202AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1202anger
    FeaturePrefsStore.batch1201.v1202anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1202: angle mode
internal fun PlayerActivity.showV1202AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1202angle
    FeaturePrefsStore.batch1201.v1202angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1202: ankle mode
internal fun PlayerActivity.showV1202AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1202ankle
    FeaturePrefsStore.batch1201.v1202ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1202: annual mode
internal fun PlayerActivity.showV1202AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1202annual
    FeaturePrefsStore.batch1201.v1202annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1202: answer mode
internal fun PlayerActivity.showV1202AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1202answer
    FeaturePrefsStore.batch1201.v1202answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1203: allow mode
internal fun PlayerActivity.showV1203AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1203allow
    FeaturePrefsStore.batch1201.v1203allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1203: alloy mode
internal fun PlayerActivity.showV1203AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1203alloy
    FeaturePrefsStore.batch1201.v1203alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1203: alpha mode
internal fun PlayerActivity.showV1203AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1203alpha
    FeaturePrefsStore.batch1201.v1203alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1203: alpine mode
internal fun PlayerActivity.showV1203AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1203alpine
    FeaturePrefsStore.batch1201.v1203alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1203: alter mode
internal fun PlayerActivity.showV1203AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1203alter
    FeaturePrefsStore.batch1201.v1203alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1203: amaze level
internal fun PlayerActivity.showV1203AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1203amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1203amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1203: amber level
internal fun PlayerActivity.showV1203AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1203amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1203amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1203: ample level
internal fun PlayerActivity.showV1203AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1203ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1203ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1203: amuse level
internal fun PlayerActivity.showV1203AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1203amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1203amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1203: angel level
internal fun PlayerActivity.showV1203AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1203angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1203angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1203: anger mode
internal fun PlayerActivity.showV1203AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1203anger
    FeaturePrefsStore.batch1201.v1203anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1203: angle mode
internal fun PlayerActivity.showV1203AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1203angle
    FeaturePrefsStore.batch1201.v1203angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1203: ankle mode
internal fun PlayerActivity.showV1203AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1203ankle
    FeaturePrefsStore.batch1201.v1203ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1203: annual mode
internal fun PlayerActivity.showV1203AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1203annual
    FeaturePrefsStore.batch1201.v1203annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1203: answer mode
internal fun PlayerActivity.showV1203AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1203answer
    FeaturePrefsStore.batch1201.v1203answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1204: allow mode
internal fun PlayerActivity.showV1204AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1204allow
    FeaturePrefsStore.batch1201.v1204allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1204: alloy mode
internal fun PlayerActivity.showV1204AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1204alloy
    FeaturePrefsStore.batch1201.v1204alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1204: alpha mode
internal fun PlayerActivity.showV1204AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1204alpha
    FeaturePrefsStore.batch1201.v1204alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1204: alpine mode
internal fun PlayerActivity.showV1204AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1204alpine
    FeaturePrefsStore.batch1201.v1204alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1204: alter mode
internal fun PlayerActivity.showV1204AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1204alter
    FeaturePrefsStore.batch1201.v1204alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1204: amaze level
internal fun PlayerActivity.showV1204AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1204amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1204amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1204: amber level
internal fun PlayerActivity.showV1204AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1204amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1204amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1204: ample level
internal fun PlayerActivity.showV1204AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1204ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1204ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1204: amuse level
internal fun PlayerActivity.showV1204AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1204amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1204amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1204: angel level
internal fun PlayerActivity.showV1204AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1204angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1204angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1204: anger mode
internal fun PlayerActivity.showV1204AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1204anger
    FeaturePrefsStore.batch1201.v1204anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1204: angle mode
internal fun PlayerActivity.showV1204AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1204angle
    FeaturePrefsStore.batch1201.v1204angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1204: ankle mode
internal fun PlayerActivity.showV1204AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1204ankle
    FeaturePrefsStore.batch1201.v1204ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1204: annual mode
internal fun PlayerActivity.showV1204AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1204annual
    FeaturePrefsStore.batch1201.v1204annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1204: answer mode
internal fun PlayerActivity.showV1204AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1204answer
    FeaturePrefsStore.batch1201.v1204answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1205: allow mode
internal fun PlayerActivity.showV1205AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1205allow
    FeaturePrefsStore.batch1201.v1205allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1205: alloy mode
internal fun PlayerActivity.showV1205AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1205alloy
    FeaturePrefsStore.batch1201.v1205alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1205: alpha mode
internal fun PlayerActivity.showV1205AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1205alpha
    FeaturePrefsStore.batch1201.v1205alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1205: alpine mode
internal fun PlayerActivity.showV1205AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1205alpine
    FeaturePrefsStore.batch1201.v1205alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1205: alter mode
internal fun PlayerActivity.showV1205AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1205alter
    FeaturePrefsStore.batch1201.v1205alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1205: amaze level
internal fun PlayerActivity.showV1205AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1205amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1205amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1205: amber level
internal fun PlayerActivity.showV1205AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1205amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1205amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1205: ample level
internal fun PlayerActivity.showV1205AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1205ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1205ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1205: amuse level
internal fun PlayerActivity.showV1205AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1205amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1205amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1205: angel level
internal fun PlayerActivity.showV1205AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1205angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1205angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1205: anger mode
internal fun PlayerActivity.showV1205AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1205anger
    FeaturePrefsStore.batch1201.v1205anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1205: angle mode
internal fun PlayerActivity.showV1205AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1205angle
    FeaturePrefsStore.batch1201.v1205angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1205: ankle mode
internal fun PlayerActivity.showV1205AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1205ankle
    FeaturePrefsStore.batch1201.v1205ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1205: annual mode
internal fun PlayerActivity.showV1205AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1205annual
    FeaturePrefsStore.batch1201.v1205annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1205: answer mode
internal fun PlayerActivity.showV1205AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1205answer
    FeaturePrefsStore.batch1201.v1205answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1206: allow mode
internal fun PlayerActivity.showV1206AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1206allow
    FeaturePrefsStore.batch1201.v1206allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1206: alloy mode
internal fun PlayerActivity.showV1206AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1206alloy
    FeaturePrefsStore.batch1201.v1206alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1206: alpha mode
internal fun PlayerActivity.showV1206AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1206alpha
    FeaturePrefsStore.batch1201.v1206alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1206: alpine mode
internal fun PlayerActivity.showV1206AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1206alpine
    FeaturePrefsStore.batch1201.v1206alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1206: alter mode
internal fun PlayerActivity.showV1206AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1206alter
    FeaturePrefsStore.batch1201.v1206alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1206: amaze level
internal fun PlayerActivity.showV1206AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1206amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1206amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1206: amber level
internal fun PlayerActivity.showV1206AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1206amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1206amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1206: ample level
internal fun PlayerActivity.showV1206AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1206ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1206ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1206: amuse level
internal fun PlayerActivity.showV1206AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1206amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1206amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1206: angel level
internal fun PlayerActivity.showV1206AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1206angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1206angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1206: anger mode
internal fun PlayerActivity.showV1206AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1206anger
    FeaturePrefsStore.batch1201.v1206anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1206: angle mode
internal fun PlayerActivity.showV1206AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1206angle
    FeaturePrefsStore.batch1201.v1206angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1206: ankle mode
internal fun PlayerActivity.showV1206AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1206ankle
    FeaturePrefsStore.batch1201.v1206ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1206: annual mode
internal fun PlayerActivity.showV1206AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1206annual
    FeaturePrefsStore.batch1201.v1206annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1206: answer mode
internal fun PlayerActivity.showV1206AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1206answer
    FeaturePrefsStore.batch1201.v1206answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1207: allow mode
internal fun PlayerActivity.showV1207AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1207allow
    FeaturePrefsStore.batch1201.v1207allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1207: alloy mode
internal fun PlayerActivity.showV1207AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1207alloy
    FeaturePrefsStore.batch1201.v1207alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1207: alpha mode
internal fun PlayerActivity.showV1207AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1207alpha
    FeaturePrefsStore.batch1201.v1207alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1207: alpine mode
internal fun PlayerActivity.showV1207AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1207alpine
    FeaturePrefsStore.batch1201.v1207alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1207: alter mode
internal fun PlayerActivity.showV1207AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1207alter
    FeaturePrefsStore.batch1201.v1207alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1207: amaze level
internal fun PlayerActivity.showV1207AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1207amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1207amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1207: amber level
internal fun PlayerActivity.showV1207AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1207amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1207amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1207: ample level
internal fun PlayerActivity.showV1207AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1207ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1207ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1207: amuse level
internal fun PlayerActivity.showV1207AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1207amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1207amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1207: angel level
internal fun PlayerActivity.showV1207AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1207angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1207angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1207: anger mode
internal fun PlayerActivity.showV1207AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1207anger
    FeaturePrefsStore.batch1201.v1207anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1207: angle mode
internal fun PlayerActivity.showV1207AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1207angle
    FeaturePrefsStore.batch1201.v1207angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1207: ankle mode
internal fun PlayerActivity.showV1207AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1207ankle
    FeaturePrefsStore.batch1201.v1207ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1207: annual mode
internal fun PlayerActivity.showV1207AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1207annual
    FeaturePrefsStore.batch1201.v1207annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1207: answer mode
internal fun PlayerActivity.showV1207AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1207answer
    FeaturePrefsStore.batch1201.v1207answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1208: allow mode
internal fun PlayerActivity.showV1208AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1208allow
    FeaturePrefsStore.batch1201.v1208allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1208: alloy mode
internal fun PlayerActivity.showV1208AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1208alloy
    FeaturePrefsStore.batch1201.v1208alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1208: alpha mode
internal fun PlayerActivity.showV1208AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1208alpha
    FeaturePrefsStore.batch1201.v1208alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1208: alpine mode
internal fun PlayerActivity.showV1208AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1208alpine
    FeaturePrefsStore.batch1201.v1208alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1208: alter mode
internal fun PlayerActivity.showV1208AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1208alter
    FeaturePrefsStore.batch1201.v1208alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1208: amaze level
internal fun PlayerActivity.showV1208AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1208amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1208amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1208: amber level
internal fun PlayerActivity.showV1208AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1208amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1208amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1208: ample level
internal fun PlayerActivity.showV1208AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1208ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1208ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1208: amuse level
internal fun PlayerActivity.showV1208AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1208amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1208amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1208: angel level
internal fun PlayerActivity.showV1208AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1208angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1208angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1208: anger mode
internal fun PlayerActivity.showV1208AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1208anger
    FeaturePrefsStore.batch1201.v1208anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1208: angle mode
internal fun PlayerActivity.showV1208AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1208angle
    FeaturePrefsStore.batch1201.v1208angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1208: ankle mode
internal fun PlayerActivity.showV1208AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1208ankle
    FeaturePrefsStore.batch1201.v1208ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1208: annual mode
internal fun PlayerActivity.showV1208AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1208annual
    FeaturePrefsStore.batch1201.v1208annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1208: answer mode
internal fun PlayerActivity.showV1208AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1208answer
    FeaturePrefsStore.batch1201.v1208answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1209: allow mode
internal fun PlayerActivity.showV1209AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1209allow
    FeaturePrefsStore.batch1201.v1209allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1209: alloy mode
internal fun PlayerActivity.showV1209AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1209alloy
    FeaturePrefsStore.batch1201.v1209alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1209: alpha mode
internal fun PlayerActivity.showV1209AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1209alpha
    FeaturePrefsStore.batch1201.v1209alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1209: alpine mode
internal fun PlayerActivity.showV1209AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1209alpine
    FeaturePrefsStore.batch1201.v1209alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1209: alter mode
internal fun PlayerActivity.showV1209AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1209alter
    FeaturePrefsStore.batch1201.v1209alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1209: amaze level
internal fun PlayerActivity.showV1209AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1209amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1209amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1209: amber level
internal fun PlayerActivity.showV1209AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1209amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1209amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1209: ample level
internal fun PlayerActivity.showV1209AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1209ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1209ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1209: amuse level
internal fun PlayerActivity.showV1209AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1209amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1209amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1209: angel level
internal fun PlayerActivity.showV1209AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1209angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1209angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1209: anger mode
internal fun PlayerActivity.showV1209AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1209anger
    FeaturePrefsStore.batch1201.v1209anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1209: angle mode
internal fun PlayerActivity.showV1209AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1209angle
    FeaturePrefsStore.batch1201.v1209angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1209: ankle mode
internal fun PlayerActivity.showV1209AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1209ankle
    FeaturePrefsStore.batch1201.v1209ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1209: annual mode
internal fun PlayerActivity.showV1209AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1209annual
    FeaturePrefsStore.batch1201.v1209annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1209: answer mode
internal fun PlayerActivity.showV1209AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1209answer
    FeaturePrefsStore.batch1201.v1209answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

// v1210: allow mode
internal fun PlayerActivity.showV1210AllowToggle() {
    val current = FeaturePrefsStore.batch1201.v1210allow
    FeaturePrefsStore.batch1201.v1210allow = !current
    AppToast.show(this, "allow: ${if (!current) "ON" else "OFF"}")
}

// v1210: alloy mode
internal fun PlayerActivity.showV1210AlloyToggle() {
    val current = FeaturePrefsStore.batch1201.v1210alloy
    FeaturePrefsStore.batch1201.v1210alloy = !current
    AppToast.show(this, "alloy: ${if (!current) "ON" else "OFF"}")
}

// v1210: alpha mode
internal fun PlayerActivity.showV1210AlphaToggle() {
    val current = FeaturePrefsStore.batch1201.v1210alpha
    FeaturePrefsStore.batch1201.v1210alpha = !current
    AppToast.show(this, "alpha: ${if (!current) "ON" else "OFF"}")
}

// v1210: alpine mode
internal fun PlayerActivity.showV1210AlpineToggle() {
    val current = FeaturePrefsStore.batch1201.v1210alpine
    FeaturePrefsStore.batch1201.v1210alpine = !current
    AppToast.show(this, "alpine: ${if (!current) "ON" else "OFF"}")
}

// v1210: alter mode
internal fun PlayerActivity.showV1210AlterToggle() {
    val current = FeaturePrefsStore.batch1201.v1210alter
    FeaturePrefsStore.batch1201.v1210alter = !current
    AppToast.show(this, "alter: ${if (!current) "ON" else "OFF"}")
}

// v1210: amaze level
internal fun PlayerActivity.showV1210AmazeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1210amaze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amaze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1210amaze = value
        AppToast.show(this, "amaze: $value")
    }
}

// v1210: amber level
internal fun PlayerActivity.showV1210AmberDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1210amber).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amber level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1210amber = value
        AppToast.show(this, "amber: $value")
    }
}

// v1210: ample level
internal fun PlayerActivity.showV1210AmpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1210ample).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ample level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1210ample = value
        AppToast.show(this, "ample: $value")
    }
}

// v1210: amuse level
internal fun PlayerActivity.showV1210AmuseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1210amuse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amuse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1210amuse = value
        AppToast.show(this, "amuse: $value")
    }
}

// v1210: angel level
internal fun PlayerActivity.showV1210AngelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1201.v1210angel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "angel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1201.v1210angel = value
        AppToast.show(this, "angel: $value")
    }
}

// v1210: anger mode
internal fun PlayerActivity.showV1210AngerToggle() {
    val current = FeaturePrefsStore.batch1201.v1210anger
    FeaturePrefsStore.batch1201.v1210anger = !current
    AppToast.show(this, "anger: ${if (!current) "ON" else "OFF"}")
}

// v1210: angle mode
internal fun PlayerActivity.showV1210AngleToggle() {
    val current = FeaturePrefsStore.batch1201.v1210angle
    FeaturePrefsStore.batch1201.v1210angle = !current
    AppToast.show(this, "angle: ${if (!current) "ON" else "OFF"}")
}

// v1210: ankle mode
internal fun PlayerActivity.showV1210AnkleToggle() {
    val current = FeaturePrefsStore.batch1201.v1210ankle
    FeaturePrefsStore.batch1201.v1210ankle = !current
    AppToast.show(this, "ankle: ${if (!current) "ON" else "OFF"}")
}

// v1210: annual mode
internal fun PlayerActivity.showV1210AnnualToggle() {
    val current = FeaturePrefsStore.batch1201.v1210annual
    FeaturePrefsStore.batch1201.v1210annual = !current
    AppToast.show(this, "annual: ${if (!current) "ON" else "OFF"}")
}

// v1210: answer mode
internal fun PlayerActivity.showV1210AnswerToggle() {
    val current = FeaturePrefsStore.batch1201.v1210answer
    FeaturePrefsStore.batch1201.v1210answer = !current
    AppToast.show(this, "answer: ${if (!current) "ON" else "OFF"}")
}

