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

// v1211: anthem mode
internal fun PlayerActivity.showV1211AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1211anthem
    FeaturePrefsStore.batch1211.v1211anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1211: antic mode
internal fun PlayerActivity.showV1211AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1211antic
    FeaturePrefsStore.batch1211.v1211antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1211: anvil mode
internal fun PlayerActivity.showV1211AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1211anvil
    FeaturePrefsStore.batch1211.v1211anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1211: apart mode
internal fun PlayerActivity.showV1211ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1211apart
    FeaturePrefsStore.batch1211.v1211apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1211: apple mode
internal fun PlayerActivity.showV1211AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1211apple
    FeaturePrefsStore.batch1211.v1211apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1211: apply level
internal fun PlayerActivity.showV1211ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1211: arena level
internal fun PlayerActivity.showV1211ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1211: argue level
internal fun PlayerActivity.showV1211ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1211: arise level
internal fun PlayerActivity.showV1211AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1211: armor level
internal fun PlayerActivity.showV1211ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1211armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1211armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1211: army mode
internal fun PlayerActivity.showV1211ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1211army
    FeaturePrefsStore.batch1211.v1211army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1211: aroma mode
internal fun PlayerActivity.showV1211AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1211aroma
    FeaturePrefsStore.batch1211.v1211aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1211: array mode
internal fun PlayerActivity.showV1211ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1211array
    FeaturePrefsStore.batch1211.v1211array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1211: arrow mode
internal fun PlayerActivity.showV1211ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1211arrow
    FeaturePrefsStore.batch1211.v1211arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1211: aside mode
internal fun PlayerActivity.showV1211AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1211aside
    FeaturePrefsStore.batch1211.v1211aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1212: anthem mode
internal fun PlayerActivity.showV1212AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1212anthem
    FeaturePrefsStore.batch1211.v1212anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1212: antic mode
internal fun PlayerActivity.showV1212AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1212antic
    FeaturePrefsStore.batch1211.v1212antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1212: anvil mode
internal fun PlayerActivity.showV1212AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1212anvil
    FeaturePrefsStore.batch1211.v1212anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1212: apart mode
internal fun PlayerActivity.showV1212ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1212apart
    FeaturePrefsStore.batch1211.v1212apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1212: apple mode
internal fun PlayerActivity.showV1212AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1212apple
    FeaturePrefsStore.batch1211.v1212apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1212: apply level
internal fun PlayerActivity.showV1212ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1212: arena level
internal fun PlayerActivity.showV1212ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1212: argue level
internal fun PlayerActivity.showV1212ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1212: arise level
internal fun PlayerActivity.showV1212AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1212: armor level
internal fun PlayerActivity.showV1212ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1212armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1212armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1212: army mode
internal fun PlayerActivity.showV1212ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1212army
    FeaturePrefsStore.batch1211.v1212army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1212: aroma mode
internal fun PlayerActivity.showV1212AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1212aroma
    FeaturePrefsStore.batch1211.v1212aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1212: array mode
internal fun PlayerActivity.showV1212ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1212array
    FeaturePrefsStore.batch1211.v1212array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1212: arrow mode
internal fun PlayerActivity.showV1212ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1212arrow
    FeaturePrefsStore.batch1211.v1212arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1212: aside mode
internal fun PlayerActivity.showV1212AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1212aside
    FeaturePrefsStore.batch1211.v1212aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1213: anthem mode
internal fun PlayerActivity.showV1213AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1213anthem
    FeaturePrefsStore.batch1211.v1213anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1213: antic mode
internal fun PlayerActivity.showV1213AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1213antic
    FeaturePrefsStore.batch1211.v1213antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1213: anvil mode
internal fun PlayerActivity.showV1213AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1213anvil
    FeaturePrefsStore.batch1211.v1213anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1213: apart mode
internal fun PlayerActivity.showV1213ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1213apart
    FeaturePrefsStore.batch1211.v1213apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1213: apple mode
internal fun PlayerActivity.showV1213AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1213apple
    FeaturePrefsStore.batch1211.v1213apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1213: apply level
internal fun PlayerActivity.showV1213ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1213: arena level
internal fun PlayerActivity.showV1213ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1213: argue level
internal fun PlayerActivity.showV1213ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1213: arise level
internal fun PlayerActivity.showV1213AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1213: armor level
internal fun PlayerActivity.showV1213ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1213armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1213armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1213: army mode
internal fun PlayerActivity.showV1213ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1213army
    FeaturePrefsStore.batch1211.v1213army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1213: aroma mode
internal fun PlayerActivity.showV1213AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1213aroma
    FeaturePrefsStore.batch1211.v1213aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1213: array mode
internal fun PlayerActivity.showV1213ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1213array
    FeaturePrefsStore.batch1211.v1213array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1213: arrow mode
internal fun PlayerActivity.showV1213ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1213arrow
    FeaturePrefsStore.batch1211.v1213arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1213: aside mode
internal fun PlayerActivity.showV1213AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1213aside
    FeaturePrefsStore.batch1211.v1213aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1214: anthem mode
internal fun PlayerActivity.showV1214AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1214anthem
    FeaturePrefsStore.batch1211.v1214anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1214: antic mode
internal fun PlayerActivity.showV1214AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1214antic
    FeaturePrefsStore.batch1211.v1214antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1214: anvil mode
internal fun PlayerActivity.showV1214AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1214anvil
    FeaturePrefsStore.batch1211.v1214anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1214: apart mode
internal fun PlayerActivity.showV1214ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1214apart
    FeaturePrefsStore.batch1211.v1214apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1214: apple mode
internal fun PlayerActivity.showV1214AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1214apple
    FeaturePrefsStore.batch1211.v1214apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1214: apply level
internal fun PlayerActivity.showV1214ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1214: arena level
internal fun PlayerActivity.showV1214ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1214: argue level
internal fun PlayerActivity.showV1214ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1214: arise level
internal fun PlayerActivity.showV1214AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1214: armor level
internal fun PlayerActivity.showV1214ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1214armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1214armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1214: army mode
internal fun PlayerActivity.showV1214ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1214army
    FeaturePrefsStore.batch1211.v1214army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1214: aroma mode
internal fun PlayerActivity.showV1214AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1214aroma
    FeaturePrefsStore.batch1211.v1214aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1214: array mode
internal fun PlayerActivity.showV1214ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1214array
    FeaturePrefsStore.batch1211.v1214array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1214: arrow mode
internal fun PlayerActivity.showV1214ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1214arrow
    FeaturePrefsStore.batch1211.v1214arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1214: aside mode
internal fun PlayerActivity.showV1214AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1214aside
    FeaturePrefsStore.batch1211.v1214aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1215: anthem mode
internal fun PlayerActivity.showV1215AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1215anthem
    FeaturePrefsStore.batch1211.v1215anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1215: antic mode
internal fun PlayerActivity.showV1215AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1215antic
    FeaturePrefsStore.batch1211.v1215antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1215: anvil mode
internal fun PlayerActivity.showV1215AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1215anvil
    FeaturePrefsStore.batch1211.v1215anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1215: apart mode
internal fun PlayerActivity.showV1215ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1215apart
    FeaturePrefsStore.batch1211.v1215apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1215: apple mode
internal fun PlayerActivity.showV1215AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1215apple
    FeaturePrefsStore.batch1211.v1215apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1215: apply level
internal fun PlayerActivity.showV1215ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1215: arena level
internal fun PlayerActivity.showV1215ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1215: argue level
internal fun PlayerActivity.showV1215ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1215: arise level
internal fun PlayerActivity.showV1215AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1215: armor level
internal fun PlayerActivity.showV1215ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1215armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1215armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1215: army mode
internal fun PlayerActivity.showV1215ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1215army
    FeaturePrefsStore.batch1211.v1215army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1215: aroma mode
internal fun PlayerActivity.showV1215AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1215aroma
    FeaturePrefsStore.batch1211.v1215aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1215: array mode
internal fun PlayerActivity.showV1215ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1215array
    FeaturePrefsStore.batch1211.v1215array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1215: arrow mode
internal fun PlayerActivity.showV1215ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1215arrow
    FeaturePrefsStore.batch1211.v1215arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1215: aside mode
internal fun PlayerActivity.showV1215AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1215aside
    FeaturePrefsStore.batch1211.v1215aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1216: anthem mode
internal fun PlayerActivity.showV1216AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1216anthem
    FeaturePrefsStore.batch1211.v1216anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1216: antic mode
internal fun PlayerActivity.showV1216AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1216antic
    FeaturePrefsStore.batch1211.v1216antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1216: anvil mode
internal fun PlayerActivity.showV1216AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1216anvil
    FeaturePrefsStore.batch1211.v1216anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1216: apart mode
internal fun PlayerActivity.showV1216ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1216apart
    FeaturePrefsStore.batch1211.v1216apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1216: apple mode
internal fun PlayerActivity.showV1216AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1216apple
    FeaturePrefsStore.batch1211.v1216apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1216: apply level
internal fun PlayerActivity.showV1216ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1216: arena level
internal fun PlayerActivity.showV1216ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1216: argue level
internal fun PlayerActivity.showV1216ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1216: arise level
internal fun PlayerActivity.showV1216AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1216: armor level
internal fun PlayerActivity.showV1216ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1216armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1216armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1216: army mode
internal fun PlayerActivity.showV1216ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1216army
    FeaturePrefsStore.batch1211.v1216army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1216: aroma mode
internal fun PlayerActivity.showV1216AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1216aroma
    FeaturePrefsStore.batch1211.v1216aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1216: array mode
internal fun PlayerActivity.showV1216ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1216array
    FeaturePrefsStore.batch1211.v1216array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1216: arrow mode
internal fun PlayerActivity.showV1216ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1216arrow
    FeaturePrefsStore.batch1211.v1216arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1216: aside mode
internal fun PlayerActivity.showV1216AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1216aside
    FeaturePrefsStore.batch1211.v1216aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1217: anthem mode
internal fun PlayerActivity.showV1217AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1217anthem
    FeaturePrefsStore.batch1211.v1217anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1217: antic mode
internal fun PlayerActivity.showV1217AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1217antic
    FeaturePrefsStore.batch1211.v1217antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1217: anvil mode
internal fun PlayerActivity.showV1217AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1217anvil
    FeaturePrefsStore.batch1211.v1217anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1217: apart mode
internal fun PlayerActivity.showV1217ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1217apart
    FeaturePrefsStore.batch1211.v1217apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1217: apple mode
internal fun PlayerActivity.showV1217AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1217apple
    FeaturePrefsStore.batch1211.v1217apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1217: apply level
internal fun PlayerActivity.showV1217ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1217: arena level
internal fun PlayerActivity.showV1217ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1217: argue level
internal fun PlayerActivity.showV1217ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1217: arise level
internal fun PlayerActivity.showV1217AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1217: armor level
internal fun PlayerActivity.showV1217ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1217armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1217armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1217: army mode
internal fun PlayerActivity.showV1217ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1217army
    FeaturePrefsStore.batch1211.v1217army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1217: aroma mode
internal fun PlayerActivity.showV1217AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1217aroma
    FeaturePrefsStore.batch1211.v1217aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1217: array mode
internal fun PlayerActivity.showV1217ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1217array
    FeaturePrefsStore.batch1211.v1217array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1217: arrow mode
internal fun PlayerActivity.showV1217ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1217arrow
    FeaturePrefsStore.batch1211.v1217arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1217: aside mode
internal fun PlayerActivity.showV1217AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1217aside
    FeaturePrefsStore.batch1211.v1217aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1218: anthem mode
internal fun PlayerActivity.showV1218AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1218anthem
    FeaturePrefsStore.batch1211.v1218anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1218: antic mode
internal fun PlayerActivity.showV1218AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1218antic
    FeaturePrefsStore.batch1211.v1218antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1218: anvil mode
internal fun PlayerActivity.showV1218AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1218anvil
    FeaturePrefsStore.batch1211.v1218anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1218: apart mode
internal fun PlayerActivity.showV1218ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1218apart
    FeaturePrefsStore.batch1211.v1218apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1218: apple mode
internal fun PlayerActivity.showV1218AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1218apple
    FeaturePrefsStore.batch1211.v1218apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1218: apply level
internal fun PlayerActivity.showV1218ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1218: arena level
internal fun PlayerActivity.showV1218ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1218: argue level
internal fun PlayerActivity.showV1218ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1218: arise level
internal fun PlayerActivity.showV1218AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1218: armor level
internal fun PlayerActivity.showV1218ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1218armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1218armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1218: army mode
internal fun PlayerActivity.showV1218ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1218army
    FeaturePrefsStore.batch1211.v1218army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1218: aroma mode
internal fun PlayerActivity.showV1218AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1218aroma
    FeaturePrefsStore.batch1211.v1218aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1218: array mode
internal fun PlayerActivity.showV1218ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1218array
    FeaturePrefsStore.batch1211.v1218array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1218: arrow mode
internal fun PlayerActivity.showV1218ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1218arrow
    FeaturePrefsStore.batch1211.v1218arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1218: aside mode
internal fun PlayerActivity.showV1218AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1218aside
    FeaturePrefsStore.batch1211.v1218aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1219: anthem mode
internal fun PlayerActivity.showV1219AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1219anthem
    FeaturePrefsStore.batch1211.v1219anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1219: antic mode
internal fun PlayerActivity.showV1219AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1219antic
    FeaturePrefsStore.batch1211.v1219antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1219: anvil mode
internal fun PlayerActivity.showV1219AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1219anvil
    FeaturePrefsStore.batch1211.v1219anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1219: apart mode
internal fun PlayerActivity.showV1219ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1219apart
    FeaturePrefsStore.batch1211.v1219apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1219: apple mode
internal fun PlayerActivity.showV1219AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1219apple
    FeaturePrefsStore.batch1211.v1219apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1219: apply level
internal fun PlayerActivity.showV1219ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1219: arena level
internal fun PlayerActivity.showV1219ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1219: argue level
internal fun PlayerActivity.showV1219ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1219: arise level
internal fun PlayerActivity.showV1219AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1219: armor level
internal fun PlayerActivity.showV1219ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1219armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1219armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1219: army mode
internal fun PlayerActivity.showV1219ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1219army
    FeaturePrefsStore.batch1211.v1219army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1219: aroma mode
internal fun PlayerActivity.showV1219AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1219aroma
    FeaturePrefsStore.batch1211.v1219aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1219: array mode
internal fun PlayerActivity.showV1219ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1219array
    FeaturePrefsStore.batch1211.v1219array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1219: arrow mode
internal fun PlayerActivity.showV1219ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1219arrow
    FeaturePrefsStore.batch1211.v1219arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1219: aside mode
internal fun PlayerActivity.showV1219AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1219aside
    FeaturePrefsStore.batch1211.v1219aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1220: anthem mode
internal fun PlayerActivity.showV1220AnthemToggle() {
    val current = FeaturePrefsStore.batch1211.v1220anthem
    FeaturePrefsStore.batch1211.v1220anthem = !current
    AppToast.show(this, "anthem: ${if (!current) "ON" else "OFF"}")
}

// v1220: antic mode
internal fun PlayerActivity.showV1220AnticToggle() {
    val current = FeaturePrefsStore.batch1211.v1220antic
    FeaturePrefsStore.batch1211.v1220antic = !current
    AppToast.show(this, "antic: ${if (!current) "ON" else "OFF"}")
}

// v1220: anvil mode
internal fun PlayerActivity.showV1220AnvilToggle() {
    val current = FeaturePrefsStore.batch1211.v1220anvil
    FeaturePrefsStore.batch1211.v1220anvil = !current
    AppToast.show(this, "anvil: ${if (!current) "ON" else "OFF"}")
}

// v1220: apart mode
internal fun PlayerActivity.showV1220ApartToggle() {
    val current = FeaturePrefsStore.batch1211.v1220apart
    FeaturePrefsStore.batch1211.v1220apart = !current
    AppToast.show(this, "apart: ${if (!current) "ON" else "OFF"}")
}

// v1220: apple mode
internal fun PlayerActivity.showV1220AppleToggle() {
    val current = FeaturePrefsStore.batch1211.v1220apple
    FeaturePrefsStore.batch1211.v1220apple = !current
    AppToast.show(this, "apple: ${if (!current) "ON" else "OFF"}")
}

// v1220: apply level
internal fun PlayerActivity.showV1220ApplyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220apply).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "apply level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220apply = value
        AppToast.show(this, "apply: $value")
    }
}

// v1220: arena level
internal fun PlayerActivity.showV1220ArenaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220arena).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arena level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220arena = value
        AppToast.show(this, "arena: $value")
    }
}

// v1220: argue level
internal fun PlayerActivity.showV1220ArgueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220argue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "argue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220argue = value
        AppToast.show(this, "argue: $value")
    }
}

// v1220: arise level
internal fun PlayerActivity.showV1220AriseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220arise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "arise level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220arise = value
        AppToast.show(this, "arise: $value")
    }
}

// v1220: armor level
internal fun PlayerActivity.showV1220ArmorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1211.v1220armor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "armor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1211.v1220armor = value
        AppToast.show(this, "armor: $value")
    }
}

// v1220: army mode
internal fun PlayerActivity.showV1220ArmyToggle() {
    val current = FeaturePrefsStore.batch1211.v1220army
    FeaturePrefsStore.batch1211.v1220army = !current
    AppToast.show(this, "army: ${if (!current) "ON" else "OFF"}")
}

// v1220: aroma mode
internal fun PlayerActivity.showV1220AromaToggle() {
    val current = FeaturePrefsStore.batch1211.v1220aroma
    FeaturePrefsStore.batch1211.v1220aroma = !current
    AppToast.show(this, "aroma: ${if (!current) "ON" else "OFF"}")
}

// v1220: array mode
internal fun PlayerActivity.showV1220ArrayToggle() {
    val current = FeaturePrefsStore.batch1211.v1220array
    FeaturePrefsStore.batch1211.v1220array = !current
    AppToast.show(this, "array: ${if (!current) "ON" else "OFF"}")
}

// v1220: arrow mode
internal fun PlayerActivity.showV1220ArrowToggle() {
    val current = FeaturePrefsStore.batch1211.v1220arrow
    FeaturePrefsStore.batch1211.v1220arrow = !current
    AppToast.show(this, "arrow: ${if (!current) "ON" else "OFF"}")
}

// v1220: aside mode
internal fun PlayerActivity.showV1220AsideToggle() {
    val current = FeaturePrefsStore.batch1211.v1220aside
    FeaturePrefsStore.batch1211.v1220aside = !current
    AppToast.show(this, "aside: ${if (!current) "ON" else "OFF"}")
}

// v1221: ask mode
internal fun PlayerActivity.showV1221AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1221ask
    FeaturePrefsStore.batch1221.v1221ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1221: asset mode
internal fun PlayerActivity.showV1221AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1221asset
    FeaturePrefsStore.batch1221.v1221asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1221: atlas mode
internal fun PlayerActivity.showV1221AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1221atlas
    FeaturePrefsStore.batch1221.v1221atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1221: atom mode
internal fun PlayerActivity.showV1221AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1221atom
    FeaturePrefsStore.batch1221.v1221atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1221: attic mode
internal fun PlayerActivity.showV1221AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1221attic
    FeaturePrefsStore.batch1221.v1221attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1221: audio level
internal fun PlayerActivity.showV1221AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1221: audit level
internal fun PlayerActivity.showV1221AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1221: august level
internal fun PlayerActivity.showV1221AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221august = value
        AppToast.show(this, "august: $value")
    }
}

// v1221: aunt level
internal fun PlayerActivity.showV1221AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1221: aura level
internal fun PlayerActivity.showV1221AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1221aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1221aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1221: auto mode
internal fun PlayerActivity.showV1221AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1221auto
    FeaturePrefsStore.batch1221.v1221auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1221: autumn mode
internal fun PlayerActivity.showV1221AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1221autumn
    FeaturePrefsStore.batch1221.v1221autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1221: avatar mode
internal fun PlayerActivity.showV1221AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1221avatar
    FeaturePrefsStore.batch1221.v1221avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1221: avenue mode
internal fun PlayerActivity.showV1221AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1221avenue
    FeaturePrefsStore.batch1221.v1221avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1221: awake mode
internal fun PlayerActivity.showV1221AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1221awake
    FeaturePrefsStore.batch1221.v1221awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1222: ask mode
internal fun PlayerActivity.showV1222AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1222ask
    FeaturePrefsStore.batch1221.v1222ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1222: asset mode
internal fun PlayerActivity.showV1222AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1222asset
    FeaturePrefsStore.batch1221.v1222asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1222: atlas mode
internal fun PlayerActivity.showV1222AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1222atlas
    FeaturePrefsStore.batch1221.v1222atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1222: atom mode
internal fun PlayerActivity.showV1222AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1222atom
    FeaturePrefsStore.batch1221.v1222atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1222: attic mode
internal fun PlayerActivity.showV1222AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1222attic
    FeaturePrefsStore.batch1221.v1222attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1222: audio level
internal fun PlayerActivity.showV1222AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1222: audit level
internal fun PlayerActivity.showV1222AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1222: august level
internal fun PlayerActivity.showV1222AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222august = value
        AppToast.show(this, "august: $value")
    }
}

// v1222: aunt level
internal fun PlayerActivity.showV1222AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1222: aura level
internal fun PlayerActivity.showV1222AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1222aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1222aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1222: auto mode
internal fun PlayerActivity.showV1222AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1222auto
    FeaturePrefsStore.batch1221.v1222auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1222: autumn mode
internal fun PlayerActivity.showV1222AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1222autumn
    FeaturePrefsStore.batch1221.v1222autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1222: avatar mode
internal fun PlayerActivity.showV1222AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1222avatar
    FeaturePrefsStore.batch1221.v1222avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1222: avenue mode
internal fun PlayerActivity.showV1222AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1222avenue
    FeaturePrefsStore.batch1221.v1222avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1222: awake mode
internal fun PlayerActivity.showV1222AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1222awake
    FeaturePrefsStore.batch1221.v1222awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1223: ask mode
internal fun PlayerActivity.showV1223AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1223ask
    FeaturePrefsStore.batch1221.v1223ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1223: asset mode
internal fun PlayerActivity.showV1223AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1223asset
    FeaturePrefsStore.batch1221.v1223asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1223: atlas mode
internal fun PlayerActivity.showV1223AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1223atlas
    FeaturePrefsStore.batch1221.v1223atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1223: atom mode
internal fun PlayerActivity.showV1223AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1223atom
    FeaturePrefsStore.batch1221.v1223atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1223: attic mode
internal fun PlayerActivity.showV1223AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1223attic
    FeaturePrefsStore.batch1221.v1223attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1223: audio level
internal fun PlayerActivity.showV1223AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1223: audit level
internal fun PlayerActivity.showV1223AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1223: august level
internal fun PlayerActivity.showV1223AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223august = value
        AppToast.show(this, "august: $value")
    }
}

// v1223: aunt level
internal fun PlayerActivity.showV1223AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1223: aura level
internal fun PlayerActivity.showV1223AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1223aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1223aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1223: auto mode
internal fun PlayerActivity.showV1223AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1223auto
    FeaturePrefsStore.batch1221.v1223auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1223: autumn mode
internal fun PlayerActivity.showV1223AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1223autumn
    FeaturePrefsStore.batch1221.v1223autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1223: avatar mode
internal fun PlayerActivity.showV1223AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1223avatar
    FeaturePrefsStore.batch1221.v1223avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1223: avenue mode
internal fun PlayerActivity.showV1223AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1223avenue
    FeaturePrefsStore.batch1221.v1223avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1223: awake mode
internal fun PlayerActivity.showV1223AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1223awake
    FeaturePrefsStore.batch1221.v1223awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1224: ask mode
internal fun PlayerActivity.showV1224AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1224ask
    FeaturePrefsStore.batch1221.v1224ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1224: asset mode
internal fun PlayerActivity.showV1224AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1224asset
    FeaturePrefsStore.batch1221.v1224asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1224: atlas mode
internal fun PlayerActivity.showV1224AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1224atlas
    FeaturePrefsStore.batch1221.v1224atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1224: atom mode
internal fun PlayerActivity.showV1224AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1224atom
    FeaturePrefsStore.batch1221.v1224atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1224: attic mode
internal fun PlayerActivity.showV1224AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1224attic
    FeaturePrefsStore.batch1221.v1224attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1224: audio level
internal fun PlayerActivity.showV1224AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1224: audit level
internal fun PlayerActivity.showV1224AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1224: august level
internal fun PlayerActivity.showV1224AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224august = value
        AppToast.show(this, "august: $value")
    }
}

// v1224: aunt level
internal fun PlayerActivity.showV1224AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1224: aura level
internal fun PlayerActivity.showV1224AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1224aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1224aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1224: auto mode
internal fun PlayerActivity.showV1224AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1224auto
    FeaturePrefsStore.batch1221.v1224auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1224: autumn mode
internal fun PlayerActivity.showV1224AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1224autumn
    FeaturePrefsStore.batch1221.v1224autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1224: avatar mode
internal fun PlayerActivity.showV1224AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1224avatar
    FeaturePrefsStore.batch1221.v1224avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1224: avenue mode
internal fun PlayerActivity.showV1224AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1224avenue
    FeaturePrefsStore.batch1221.v1224avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1224: awake mode
internal fun PlayerActivity.showV1224AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1224awake
    FeaturePrefsStore.batch1221.v1224awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1225: ask mode
internal fun PlayerActivity.showV1225AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1225ask
    FeaturePrefsStore.batch1221.v1225ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1225: asset mode
internal fun PlayerActivity.showV1225AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1225asset
    FeaturePrefsStore.batch1221.v1225asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1225: atlas mode
internal fun PlayerActivity.showV1225AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1225atlas
    FeaturePrefsStore.batch1221.v1225atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1225: atom mode
internal fun PlayerActivity.showV1225AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1225atom
    FeaturePrefsStore.batch1221.v1225atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1225: attic mode
internal fun PlayerActivity.showV1225AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1225attic
    FeaturePrefsStore.batch1221.v1225attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1225: audio level
internal fun PlayerActivity.showV1225AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1225: audit level
internal fun PlayerActivity.showV1225AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1225: august level
internal fun PlayerActivity.showV1225AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225august = value
        AppToast.show(this, "august: $value")
    }
}

// v1225: aunt level
internal fun PlayerActivity.showV1225AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1225: aura level
internal fun PlayerActivity.showV1225AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1225aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1225aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1225: auto mode
internal fun PlayerActivity.showV1225AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1225auto
    FeaturePrefsStore.batch1221.v1225auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1225: autumn mode
internal fun PlayerActivity.showV1225AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1225autumn
    FeaturePrefsStore.batch1221.v1225autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1225: avatar mode
internal fun PlayerActivity.showV1225AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1225avatar
    FeaturePrefsStore.batch1221.v1225avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1225: avenue mode
internal fun PlayerActivity.showV1225AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1225avenue
    FeaturePrefsStore.batch1221.v1225avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1225: awake mode
internal fun PlayerActivity.showV1225AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1225awake
    FeaturePrefsStore.batch1221.v1225awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1226: ask mode
internal fun PlayerActivity.showV1226AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1226ask
    FeaturePrefsStore.batch1221.v1226ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1226: asset mode
internal fun PlayerActivity.showV1226AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1226asset
    FeaturePrefsStore.batch1221.v1226asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1226: atlas mode
internal fun PlayerActivity.showV1226AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1226atlas
    FeaturePrefsStore.batch1221.v1226atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1226: atom mode
internal fun PlayerActivity.showV1226AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1226atom
    FeaturePrefsStore.batch1221.v1226atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1226: attic mode
internal fun PlayerActivity.showV1226AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1226attic
    FeaturePrefsStore.batch1221.v1226attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1226: audio level
internal fun PlayerActivity.showV1226AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1226: audit level
internal fun PlayerActivity.showV1226AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1226: august level
internal fun PlayerActivity.showV1226AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226august = value
        AppToast.show(this, "august: $value")
    }
}

// v1226: aunt level
internal fun PlayerActivity.showV1226AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1226: aura level
internal fun PlayerActivity.showV1226AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1226aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1226aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1226: auto mode
internal fun PlayerActivity.showV1226AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1226auto
    FeaturePrefsStore.batch1221.v1226auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1226: autumn mode
internal fun PlayerActivity.showV1226AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1226autumn
    FeaturePrefsStore.batch1221.v1226autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1226: avatar mode
internal fun PlayerActivity.showV1226AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1226avatar
    FeaturePrefsStore.batch1221.v1226avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1226: avenue mode
internal fun PlayerActivity.showV1226AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1226avenue
    FeaturePrefsStore.batch1221.v1226avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1226: awake mode
internal fun PlayerActivity.showV1226AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1226awake
    FeaturePrefsStore.batch1221.v1226awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1227: ask mode
internal fun PlayerActivity.showV1227AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1227ask
    FeaturePrefsStore.batch1221.v1227ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1227: asset mode
internal fun PlayerActivity.showV1227AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1227asset
    FeaturePrefsStore.batch1221.v1227asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1227: atlas mode
internal fun PlayerActivity.showV1227AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1227atlas
    FeaturePrefsStore.batch1221.v1227atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1227: atom mode
internal fun PlayerActivity.showV1227AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1227atom
    FeaturePrefsStore.batch1221.v1227atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1227: attic mode
internal fun PlayerActivity.showV1227AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1227attic
    FeaturePrefsStore.batch1221.v1227attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1227: audio level
internal fun PlayerActivity.showV1227AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1227: audit level
internal fun PlayerActivity.showV1227AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1227: august level
internal fun PlayerActivity.showV1227AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227august = value
        AppToast.show(this, "august: $value")
    }
}

// v1227: aunt level
internal fun PlayerActivity.showV1227AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1227: aura level
internal fun PlayerActivity.showV1227AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1227aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1227aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1227: auto mode
internal fun PlayerActivity.showV1227AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1227auto
    FeaturePrefsStore.batch1221.v1227auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1227: autumn mode
internal fun PlayerActivity.showV1227AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1227autumn
    FeaturePrefsStore.batch1221.v1227autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1227: avatar mode
internal fun PlayerActivity.showV1227AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1227avatar
    FeaturePrefsStore.batch1221.v1227avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1227: avenue mode
internal fun PlayerActivity.showV1227AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1227avenue
    FeaturePrefsStore.batch1221.v1227avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1227: awake mode
internal fun PlayerActivity.showV1227AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1227awake
    FeaturePrefsStore.batch1221.v1227awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1228: ask mode
internal fun PlayerActivity.showV1228AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1228ask
    FeaturePrefsStore.batch1221.v1228ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1228: asset mode
internal fun PlayerActivity.showV1228AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1228asset
    FeaturePrefsStore.batch1221.v1228asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1228: atlas mode
internal fun PlayerActivity.showV1228AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1228atlas
    FeaturePrefsStore.batch1221.v1228atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1228: atom mode
internal fun PlayerActivity.showV1228AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1228atom
    FeaturePrefsStore.batch1221.v1228atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1228: attic mode
internal fun PlayerActivity.showV1228AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1228attic
    FeaturePrefsStore.batch1221.v1228attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1228: audio level
internal fun PlayerActivity.showV1228AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1228: audit level
internal fun PlayerActivity.showV1228AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1228: august level
internal fun PlayerActivity.showV1228AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228august = value
        AppToast.show(this, "august: $value")
    }
}

// v1228: aunt level
internal fun PlayerActivity.showV1228AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1228: aura level
internal fun PlayerActivity.showV1228AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1228aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1228aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1228: auto mode
internal fun PlayerActivity.showV1228AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1228auto
    FeaturePrefsStore.batch1221.v1228auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1228: autumn mode
internal fun PlayerActivity.showV1228AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1228autumn
    FeaturePrefsStore.batch1221.v1228autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1228: avatar mode
internal fun PlayerActivity.showV1228AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1228avatar
    FeaturePrefsStore.batch1221.v1228avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1228: avenue mode
internal fun PlayerActivity.showV1228AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1228avenue
    FeaturePrefsStore.batch1221.v1228avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1228: awake mode
internal fun PlayerActivity.showV1228AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1228awake
    FeaturePrefsStore.batch1221.v1228awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1229: ask mode
internal fun PlayerActivity.showV1229AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1229ask
    FeaturePrefsStore.batch1221.v1229ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1229: asset mode
internal fun PlayerActivity.showV1229AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1229asset
    FeaturePrefsStore.batch1221.v1229asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1229: atlas mode
internal fun PlayerActivity.showV1229AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1229atlas
    FeaturePrefsStore.batch1221.v1229atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1229: atom mode
internal fun PlayerActivity.showV1229AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1229atom
    FeaturePrefsStore.batch1221.v1229atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1229: attic mode
internal fun PlayerActivity.showV1229AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1229attic
    FeaturePrefsStore.batch1221.v1229attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1229: audio level
internal fun PlayerActivity.showV1229AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1229: audit level
internal fun PlayerActivity.showV1229AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1229: august level
internal fun PlayerActivity.showV1229AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229august = value
        AppToast.show(this, "august: $value")
    }
}

// v1229: aunt level
internal fun PlayerActivity.showV1229AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1229: aura level
internal fun PlayerActivity.showV1229AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1229aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1229aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1229: auto mode
internal fun PlayerActivity.showV1229AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1229auto
    FeaturePrefsStore.batch1221.v1229auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1229: autumn mode
internal fun PlayerActivity.showV1229AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1229autumn
    FeaturePrefsStore.batch1221.v1229autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1229: avatar mode
internal fun PlayerActivity.showV1229AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1229avatar
    FeaturePrefsStore.batch1221.v1229avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1229: avenue mode
internal fun PlayerActivity.showV1229AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1229avenue
    FeaturePrefsStore.batch1221.v1229avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1229: awake mode
internal fun PlayerActivity.showV1229AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1229awake
    FeaturePrefsStore.batch1221.v1229awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1230: ask mode
internal fun PlayerActivity.showV1230AskToggle() {
    val current = FeaturePrefsStore.batch1221.v1230ask
    FeaturePrefsStore.batch1221.v1230ask = !current
    AppToast.show(this, "ask: ${if (!current) "ON" else "OFF"}")
}

// v1230: asset mode
internal fun PlayerActivity.showV1230AssetToggle() {
    val current = FeaturePrefsStore.batch1221.v1230asset
    FeaturePrefsStore.batch1221.v1230asset = !current
    AppToast.show(this, "asset: ${if (!current) "ON" else "OFF"}")
}

// v1230: atlas mode
internal fun PlayerActivity.showV1230AtlasToggle() {
    val current = FeaturePrefsStore.batch1221.v1230atlas
    FeaturePrefsStore.batch1221.v1230atlas = !current
    AppToast.show(this, "atlas: ${if (!current) "ON" else "OFF"}")
}

// v1230: atom mode
internal fun PlayerActivity.showV1230AtomToggle() {
    val current = FeaturePrefsStore.batch1221.v1230atom
    FeaturePrefsStore.batch1221.v1230atom = !current
    AppToast.show(this, "atom: ${if (!current) "ON" else "OFF"}")
}

// v1230: attic mode
internal fun PlayerActivity.showV1230AtticToggle() {
    val current = FeaturePrefsStore.batch1221.v1230attic
    FeaturePrefsStore.batch1221.v1230attic = !current
    AppToast.show(this, "attic: ${if (!current) "ON" else "OFF"}")
}

// v1230: audio level
internal fun PlayerActivity.showV1230AudioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230audio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230audio = value
        AppToast.show(this, "audio: $value")
    }
}

// v1230: audit level
internal fun PlayerActivity.showV1230AuditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230audit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "audit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230audit = value
        AppToast.show(this, "audit: $value")
    }
}

// v1230: august level
internal fun PlayerActivity.showV1230AugustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230august).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "august level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230august = value
        AppToast.show(this, "august: $value")
    }
}

// v1230: aunt level
internal fun PlayerActivity.showV1230AuntDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230aunt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aunt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230aunt = value
        AppToast.show(this, "aunt: $value")
    }
}

// v1230: aura level
internal fun PlayerActivity.showV1230AuraDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1221.v1230aura).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aura level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1221.v1230aura = value
        AppToast.show(this, "aura: $value")
    }
}

// v1230: auto mode
internal fun PlayerActivity.showV1230AutoToggle() {
    val current = FeaturePrefsStore.batch1221.v1230auto
    FeaturePrefsStore.batch1221.v1230auto = !current
    AppToast.show(this, "auto: ${if (!current) "ON" else "OFF"}")
}

// v1230: autumn mode
internal fun PlayerActivity.showV1230AutumnToggle() {
    val current = FeaturePrefsStore.batch1221.v1230autumn
    FeaturePrefsStore.batch1221.v1230autumn = !current
    AppToast.show(this, "autumn: ${if (!current) "ON" else "OFF"}")
}

// v1230: avatar mode
internal fun PlayerActivity.showV1230AvatarToggle() {
    val current = FeaturePrefsStore.batch1221.v1230avatar
    FeaturePrefsStore.batch1221.v1230avatar = !current
    AppToast.show(this, "avatar: ${if (!current) "ON" else "OFF"}")
}

// v1230: avenue mode
internal fun PlayerActivity.showV1230AvenueToggle() {
    val current = FeaturePrefsStore.batch1221.v1230avenue
    FeaturePrefsStore.batch1221.v1230avenue = !current
    AppToast.show(this, "avenue: ${if (!current) "ON" else "OFF"}")
}

// v1230: awake mode
internal fun PlayerActivity.showV1230AwakeToggle() {
    val current = FeaturePrefsStore.batch1221.v1230awake
    FeaturePrefsStore.batch1221.v1230awake = !current
    AppToast.show(this, "awake: ${if (!current) "ON" else "OFF"}")
}

// v1231: award mode
internal fun PlayerActivity.showV1231AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1231award
    FeaturePrefsStore.batch1231.v1231award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1231: aware mode
internal fun PlayerActivity.showV1231AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1231aware
    FeaturePrefsStore.batch1231.v1231aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1231: awash mode
internal fun PlayerActivity.showV1231AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1231awash
    FeaturePrefsStore.batch1231.v1231awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1231: axis mode
internal fun PlayerActivity.showV1231AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1231axis
    FeaturePrefsStore.batch1231.v1231axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1231: baby mode
internal fun PlayerActivity.showV1231BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1231baby
    FeaturePrefsStore.batch1231.v1231baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1231: back level
internal fun PlayerActivity.showV1231BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231back = value
        AppToast.show(this, "back: $value")
    }
}

// v1231: badge level
internal fun PlayerActivity.showV1231BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1231: bag level
internal fun PlayerActivity.showV1231BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1231: bait level
internal fun PlayerActivity.showV1231BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1231: bake level
internal fun PlayerActivity.showV1231BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1231bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1231bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1231: ball mode
internal fun PlayerActivity.showV1231BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1231ball
    FeaturePrefsStore.batch1231.v1231ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1231: ban mode
internal fun PlayerActivity.showV1231BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1231ban
    FeaturePrefsStore.batch1231.v1231ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1231: band mode
internal fun PlayerActivity.showV1231BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1231band
    FeaturePrefsStore.batch1231.v1231band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1231: bank mode
internal fun PlayerActivity.showV1231BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1231bank
    FeaturePrefsStore.batch1231.v1231bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1231: bar mode
internal fun PlayerActivity.showV1231BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1231bar
    FeaturePrefsStore.batch1231.v1231bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1232: award mode
internal fun PlayerActivity.showV1232AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1232award
    FeaturePrefsStore.batch1231.v1232award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1232: aware mode
internal fun PlayerActivity.showV1232AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1232aware
    FeaturePrefsStore.batch1231.v1232aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1232: awash mode
internal fun PlayerActivity.showV1232AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1232awash
    FeaturePrefsStore.batch1231.v1232awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1232: axis mode
internal fun PlayerActivity.showV1232AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1232axis
    FeaturePrefsStore.batch1231.v1232axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1232: baby mode
internal fun PlayerActivity.showV1232BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1232baby
    FeaturePrefsStore.batch1231.v1232baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1232: back level
internal fun PlayerActivity.showV1232BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232back = value
        AppToast.show(this, "back: $value")
    }
}

// v1232: badge level
internal fun PlayerActivity.showV1232BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1232: bag level
internal fun PlayerActivity.showV1232BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1232: bait level
internal fun PlayerActivity.showV1232BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1232: bake level
internal fun PlayerActivity.showV1232BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1232bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1232bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1232: ball mode
internal fun PlayerActivity.showV1232BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1232ball
    FeaturePrefsStore.batch1231.v1232ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1232: ban mode
internal fun PlayerActivity.showV1232BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1232ban
    FeaturePrefsStore.batch1231.v1232ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1232: band mode
internal fun PlayerActivity.showV1232BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1232band
    FeaturePrefsStore.batch1231.v1232band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1232: bank mode
internal fun PlayerActivity.showV1232BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1232bank
    FeaturePrefsStore.batch1231.v1232bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1232: bar mode
internal fun PlayerActivity.showV1232BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1232bar
    FeaturePrefsStore.batch1231.v1232bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1233: award mode
internal fun PlayerActivity.showV1233AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1233award
    FeaturePrefsStore.batch1231.v1233award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1233: aware mode
internal fun PlayerActivity.showV1233AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1233aware
    FeaturePrefsStore.batch1231.v1233aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1233: awash mode
internal fun PlayerActivity.showV1233AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1233awash
    FeaturePrefsStore.batch1231.v1233awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1233: axis mode
internal fun PlayerActivity.showV1233AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1233axis
    FeaturePrefsStore.batch1231.v1233axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1233: baby mode
internal fun PlayerActivity.showV1233BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1233baby
    FeaturePrefsStore.batch1231.v1233baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1233: back level
internal fun PlayerActivity.showV1233BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233back = value
        AppToast.show(this, "back: $value")
    }
}

// v1233: badge level
internal fun PlayerActivity.showV1233BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1233: bag level
internal fun PlayerActivity.showV1233BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1233: bait level
internal fun PlayerActivity.showV1233BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1233: bake level
internal fun PlayerActivity.showV1233BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1233bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1233bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1233: ball mode
internal fun PlayerActivity.showV1233BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1233ball
    FeaturePrefsStore.batch1231.v1233ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1233: ban mode
internal fun PlayerActivity.showV1233BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1233ban
    FeaturePrefsStore.batch1231.v1233ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1233: band mode
internal fun PlayerActivity.showV1233BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1233band
    FeaturePrefsStore.batch1231.v1233band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1233: bank mode
internal fun PlayerActivity.showV1233BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1233bank
    FeaturePrefsStore.batch1231.v1233bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1233: bar mode
internal fun PlayerActivity.showV1233BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1233bar
    FeaturePrefsStore.batch1231.v1233bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1234: award mode
internal fun PlayerActivity.showV1234AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1234award
    FeaturePrefsStore.batch1231.v1234award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1234: aware mode
internal fun PlayerActivity.showV1234AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1234aware
    FeaturePrefsStore.batch1231.v1234aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1234: awash mode
internal fun PlayerActivity.showV1234AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1234awash
    FeaturePrefsStore.batch1231.v1234awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1234: axis mode
internal fun PlayerActivity.showV1234AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1234axis
    FeaturePrefsStore.batch1231.v1234axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1234: baby mode
internal fun PlayerActivity.showV1234BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1234baby
    FeaturePrefsStore.batch1231.v1234baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1234: back level
internal fun PlayerActivity.showV1234BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234back = value
        AppToast.show(this, "back: $value")
    }
}

// v1234: badge level
internal fun PlayerActivity.showV1234BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1234: bag level
internal fun PlayerActivity.showV1234BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1234: bait level
internal fun PlayerActivity.showV1234BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1234: bake level
internal fun PlayerActivity.showV1234BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1234bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1234bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1234: ball mode
internal fun PlayerActivity.showV1234BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1234ball
    FeaturePrefsStore.batch1231.v1234ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1234: ban mode
internal fun PlayerActivity.showV1234BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1234ban
    FeaturePrefsStore.batch1231.v1234ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1234: band mode
internal fun PlayerActivity.showV1234BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1234band
    FeaturePrefsStore.batch1231.v1234band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1234: bank mode
internal fun PlayerActivity.showV1234BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1234bank
    FeaturePrefsStore.batch1231.v1234bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1234: bar mode
internal fun PlayerActivity.showV1234BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1234bar
    FeaturePrefsStore.batch1231.v1234bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1235: award mode
internal fun PlayerActivity.showV1235AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1235award
    FeaturePrefsStore.batch1231.v1235award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1235: aware mode
internal fun PlayerActivity.showV1235AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1235aware
    FeaturePrefsStore.batch1231.v1235aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1235: awash mode
internal fun PlayerActivity.showV1235AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1235awash
    FeaturePrefsStore.batch1231.v1235awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1235: axis mode
internal fun PlayerActivity.showV1235AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1235axis
    FeaturePrefsStore.batch1231.v1235axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1235: baby mode
internal fun PlayerActivity.showV1235BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1235baby
    FeaturePrefsStore.batch1231.v1235baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1235: back level
internal fun PlayerActivity.showV1235BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235back = value
        AppToast.show(this, "back: $value")
    }
}

// v1235: badge level
internal fun PlayerActivity.showV1235BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1235: bag level
internal fun PlayerActivity.showV1235BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1235: bait level
internal fun PlayerActivity.showV1235BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1235: bake level
internal fun PlayerActivity.showV1235BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1235bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1235bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1235: ball mode
internal fun PlayerActivity.showV1235BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1235ball
    FeaturePrefsStore.batch1231.v1235ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1235: ban mode
internal fun PlayerActivity.showV1235BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1235ban
    FeaturePrefsStore.batch1231.v1235ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1235: band mode
internal fun PlayerActivity.showV1235BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1235band
    FeaturePrefsStore.batch1231.v1235band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1235: bank mode
internal fun PlayerActivity.showV1235BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1235bank
    FeaturePrefsStore.batch1231.v1235bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1235: bar mode
internal fun PlayerActivity.showV1235BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1235bar
    FeaturePrefsStore.batch1231.v1235bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1236: award mode
internal fun PlayerActivity.showV1236AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1236award
    FeaturePrefsStore.batch1231.v1236award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1236: aware mode
internal fun PlayerActivity.showV1236AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1236aware
    FeaturePrefsStore.batch1231.v1236aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1236: awash mode
internal fun PlayerActivity.showV1236AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1236awash
    FeaturePrefsStore.batch1231.v1236awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1236: axis mode
internal fun PlayerActivity.showV1236AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1236axis
    FeaturePrefsStore.batch1231.v1236axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1236: baby mode
internal fun PlayerActivity.showV1236BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1236baby
    FeaturePrefsStore.batch1231.v1236baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1236: back level
internal fun PlayerActivity.showV1236BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236back = value
        AppToast.show(this, "back: $value")
    }
}

// v1236: badge level
internal fun PlayerActivity.showV1236BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1236: bag level
internal fun PlayerActivity.showV1236BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1236: bait level
internal fun PlayerActivity.showV1236BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1236: bake level
internal fun PlayerActivity.showV1236BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1236bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1236bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1236: ball mode
internal fun PlayerActivity.showV1236BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1236ball
    FeaturePrefsStore.batch1231.v1236ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1236: ban mode
internal fun PlayerActivity.showV1236BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1236ban
    FeaturePrefsStore.batch1231.v1236ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1236: band mode
internal fun PlayerActivity.showV1236BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1236band
    FeaturePrefsStore.batch1231.v1236band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1236: bank mode
internal fun PlayerActivity.showV1236BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1236bank
    FeaturePrefsStore.batch1231.v1236bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1236: bar mode
internal fun PlayerActivity.showV1236BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1236bar
    FeaturePrefsStore.batch1231.v1236bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1237: award mode
internal fun PlayerActivity.showV1237AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1237award
    FeaturePrefsStore.batch1231.v1237award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1237: aware mode
internal fun PlayerActivity.showV1237AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1237aware
    FeaturePrefsStore.batch1231.v1237aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1237: awash mode
internal fun PlayerActivity.showV1237AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1237awash
    FeaturePrefsStore.batch1231.v1237awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1237: axis mode
internal fun PlayerActivity.showV1237AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1237axis
    FeaturePrefsStore.batch1231.v1237axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1237: baby mode
internal fun PlayerActivity.showV1237BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1237baby
    FeaturePrefsStore.batch1231.v1237baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1237: back level
internal fun PlayerActivity.showV1237BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237back = value
        AppToast.show(this, "back: $value")
    }
}

// v1237: badge level
internal fun PlayerActivity.showV1237BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1237: bag level
internal fun PlayerActivity.showV1237BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1237: bait level
internal fun PlayerActivity.showV1237BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1237: bake level
internal fun PlayerActivity.showV1237BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1237bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1237bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1237: ball mode
internal fun PlayerActivity.showV1237BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1237ball
    FeaturePrefsStore.batch1231.v1237ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1237: ban mode
internal fun PlayerActivity.showV1237BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1237ban
    FeaturePrefsStore.batch1231.v1237ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1237: band mode
internal fun PlayerActivity.showV1237BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1237band
    FeaturePrefsStore.batch1231.v1237band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1237: bank mode
internal fun PlayerActivity.showV1237BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1237bank
    FeaturePrefsStore.batch1231.v1237bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1237: bar mode
internal fun PlayerActivity.showV1237BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1237bar
    FeaturePrefsStore.batch1231.v1237bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1238: award mode
internal fun PlayerActivity.showV1238AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1238award
    FeaturePrefsStore.batch1231.v1238award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1238: aware mode
internal fun PlayerActivity.showV1238AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1238aware
    FeaturePrefsStore.batch1231.v1238aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1238: awash mode
internal fun PlayerActivity.showV1238AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1238awash
    FeaturePrefsStore.batch1231.v1238awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1238: axis mode
internal fun PlayerActivity.showV1238AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1238axis
    FeaturePrefsStore.batch1231.v1238axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1238: baby mode
internal fun PlayerActivity.showV1238BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1238baby
    FeaturePrefsStore.batch1231.v1238baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1238: back level
internal fun PlayerActivity.showV1238BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238back = value
        AppToast.show(this, "back: $value")
    }
}

// v1238: badge level
internal fun PlayerActivity.showV1238BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1238: bag level
internal fun PlayerActivity.showV1238BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1238: bait level
internal fun PlayerActivity.showV1238BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1238: bake level
internal fun PlayerActivity.showV1238BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1238bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1238bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1238: ball mode
internal fun PlayerActivity.showV1238BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1238ball
    FeaturePrefsStore.batch1231.v1238ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1238: ban mode
internal fun PlayerActivity.showV1238BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1238ban
    FeaturePrefsStore.batch1231.v1238ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1238: band mode
internal fun PlayerActivity.showV1238BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1238band
    FeaturePrefsStore.batch1231.v1238band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1238: bank mode
internal fun PlayerActivity.showV1238BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1238bank
    FeaturePrefsStore.batch1231.v1238bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1238: bar mode
internal fun PlayerActivity.showV1238BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1238bar
    FeaturePrefsStore.batch1231.v1238bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1239: award mode
internal fun PlayerActivity.showV1239AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1239award
    FeaturePrefsStore.batch1231.v1239award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1239: aware mode
internal fun PlayerActivity.showV1239AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1239aware
    FeaturePrefsStore.batch1231.v1239aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1239: awash mode
internal fun PlayerActivity.showV1239AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1239awash
    FeaturePrefsStore.batch1231.v1239awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1239: axis mode
internal fun PlayerActivity.showV1239AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1239axis
    FeaturePrefsStore.batch1231.v1239axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1239: baby mode
internal fun PlayerActivity.showV1239BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1239baby
    FeaturePrefsStore.batch1231.v1239baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1239: back level
internal fun PlayerActivity.showV1239BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239back = value
        AppToast.show(this, "back: $value")
    }
}

// v1239: badge level
internal fun PlayerActivity.showV1239BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1239: bag level
internal fun PlayerActivity.showV1239BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1239: bait level
internal fun PlayerActivity.showV1239BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1239: bake level
internal fun PlayerActivity.showV1239BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1239bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1239bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1239: ball mode
internal fun PlayerActivity.showV1239BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1239ball
    FeaturePrefsStore.batch1231.v1239ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1239: ban mode
internal fun PlayerActivity.showV1239BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1239ban
    FeaturePrefsStore.batch1231.v1239ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1239: band mode
internal fun PlayerActivity.showV1239BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1239band
    FeaturePrefsStore.batch1231.v1239band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1239: bank mode
internal fun PlayerActivity.showV1239BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1239bank
    FeaturePrefsStore.batch1231.v1239bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1239: bar mode
internal fun PlayerActivity.showV1239BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1239bar
    FeaturePrefsStore.batch1231.v1239bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}

// v1240: award mode
internal fun PlayerActivity.showV1240AwardToggle() {
    val current = FeaturePrefsStore.batch1231.v1240award
    FeaturePrefsStore.batch1231.v1240award = !current
    AppToast.show(this, "award: ${if (!current) "ON" else "OFF"}")
}

// v1240: aware mode
internal fun PlayerActivity.showV1240AwareToggle() {
    val current = FeaturePrefsStore.batch1231.v1240aware
    FeaturePrefsStore.batch1231.v1240aware = !current
    AppToast.show(this, "aware: ${if (!current) "ON" else "OFF"}")
}

// v1240: awash mode
internal fun PlayerActivity.showV1240AwashToggle() {
    val current = FeaturePrefsStore.batch1231.v1240awash
    FeaturePrefsStore.batch1231.v1240awash = !current
    AppToast.show(this, "awash: ${if (!current) "ON" else "OFF"}")
}

// v1240: axis mode
internal fun PlayerActivity.showV1240AxisToggle() {
    val current = FeaturePrefsStore.batch1231.v1240axis
    FeaturePrefsStore.batch1231.v1240axis = !current
    AppToast.show(this, "axis: ${if (!current) "ON" else "OFF"}")
}

// v1240: baby mode
internal fun PlayerActivity.showV1240BabyToggle() {
    val current = FeaturePrefsStore.batch1231.v1240baby
    FeaturePrefsStore.batch1231.v1240baby = !current
    AppToast.show(this, "baby: ${if (!current) "ON" else "OFF"}")
}

// v1240: back level
internal fun PlayerActivity.showV1240BackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240back).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "back level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240back = value
        AppToast.show(this, "back: $value")
    }
}

// v1240: badge level
internal fun PlayerActivity.showV1240BadgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240badge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "badge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240badge = value
        AppToast.show(this, "badge: $value")
    }
}

// v1240: bag level
internal fun PlayerActivity.showV1240BagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bag = value
        AppToast.show(this, "bag: $value")
    }
}

// v1240: bait level
internal fun PlayerActivity.showV1240BaitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bait).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bait level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bait = value
        AppToast.show(this, "bait: $value")
    }
}

// v1240: bake level
internal fun PlayerActivity.showV1240BakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1231.v1240bake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1231.v1240bake = value
        AppToast.show(this, "bake: $value")
    }
}

// v1240: ball mode
internal fun PlayerActivity.showV1240BallToggle() {
    val current = FeaturePrefsStore.batch1231.v1240ball
    FeaturePrefsStore.batch1231.v1240ball = !current
    AppToast.show(this, "ball: ${if (!current) "ON" else "OFF"}")
}

// v1240: ban mode
internal fun PlayerActivity.showV1240BanToggle() {
    val current = FeaturePrefsStore.batch1231.v1240ban
    FeaturePrefsStore.batch1231.v1240ban = !current
    AppToast.show(this, "ban: ${if (!current) "ON" else "OFF"}")
}

// v1240: band mode
internal fun PlayerActivity.showV1240BandToggle() {
    val current = FeaturePrefsStore.batch1231.v1240band
    FeaturePrefsStore.batch1231.v1240band = !current
    AppToast.show(this, "band: ${if (!current) "ON" else "OFF"}")
}

// v1240: bank mode
internal fun PlayerActivity.showV1240BankToggle() {
    val current = FeaturePrefsStore.batch1231.v1240bank
    FeaturePrefsStore.batch1231.v1240bank = !current
    AppToast.show(this, "bank: ${if (!current) "ON" else "OFF"}")
}

// v1240: bar mode
internal fun PlayerActivity.showV1240BarToggle() {
    val current = FeaturePrefsStore.batch1231.v1240bar
    FeaturePrefsStore.batch1231.v1240bar = !current
    AppToast.show(this, "bar: ${if (!current) "ON" else "OFF"}")
}
