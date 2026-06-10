package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1411: effort mode
internal fun PlayerActivity.showV1411EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1411effort
    FeaturePrefsStore.batch1411.v1411effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1411: eight mode
internal fun PlayerActivity.showV1411EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1411eight
    FeaturePrefsStore.batch1411.v1411eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1411: either mode
internal fun PlayerActivity.showV1411EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1411either
    FeaturePrefsStore.batch1411.v1411either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1411: elbow mode
internal fun PlayerActivity.showV1411ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1411elbow
    FeaturePrefsStore.batch1411.v1411elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1411: elder mode
internal fun PlayerActivity.showV1411ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1411elder
    FeaturePrefsStore.batch1411.v1411elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1411: electric level
internal fun PlayerActivity.showV1411ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1411: elegant level
internal fun PlayerActivity.showV1411ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1411: elite level
internal fun PlayerActivity.showV1411EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1411: else level
internal fun PlayerActivity.showV1411ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411else = value
        AppToast.show(this, "else: $value")
    }
}

// v1411: email level
internal fun PlayerActivity.showV1411EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1411email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1411email = value
        AppToast.show(this, "email: $value")
    }
}

// v1411: ember mode
internal fun PlayerActivity.showV1411EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1411ember
    FeaturePrefsStore.batch1411.v1411ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1411: emerge mode
internal fun PlayerActivity.showV1411EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1411emerge
    FeaturePrefsStore.batch1411.v1411emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1411: emotion mode
internal fun PlayerActivity.showV1411EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1411emotion
    FeaturePrefsStore.batch1411.v1411emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1411: employ mode
internal fun PlayerActivity.showV1411EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1411employ
    FeaturePrefsStore.batch1411.v1411employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1411: encore mode
internal fun PlayerActivity.showV1411EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1411encore
    FeaturePrefsStore.batch1411.v1411encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1412: effort mode
internal fun PlayerActivity.showV1412EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1412effort
    FeaturePrefsStore.batch1411.v1412effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1412: eight mode
internal fun PlayerActivity.showV1412EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1412eight
    FeaturePrefsStore.batch1411.v1412eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1412: either mode
internal fun PlayerActivity.showV1412EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1412either
    FeaturePrefsStore.batch1411.v1412either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1412: elbow mode
internal fun PlayerActivity.showV1412ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1412elbow
    FeaturePrefsStore.batch1411.v1412elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1412: elder mode
internal fun PlayerActivity.showV1412ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1412elder
    FeaturePrefsStore.batch1411.v1412elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1412: electric level
internal fun PlayerActivity.showV1412ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1412: elegant level
internal fun PlayerActivity.showV1412ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1412: elite level
internal fun PlayerActivity.showV1412EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1412: else level
internal fun PlayerActivity.showV1412ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412else = value
        AppToast.show(this, "else: $value")
    }
}

// v1412: email level
internal fun PlayerActivity.showV1412EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1412email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1412email = value
        AppToast.show(this, "email: $value")
    }
}

// v1412: ember mode
internal fun PlayerActivity.showV1412EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1412ember
    FeaturePrefsStore.batch1411.v1412ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1412: emerge mode
internal fun PlayerActivity.showV1412EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1412emerge
    FeaturePrefsStore.batch1411.v1412emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1412: emotion mode
internal fun PlayerActivity.showV1412EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1412emotion
    FeaturePrefsStore.batch1411.v1412emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1412: employ mode
internal fun PlayerActivity.showV1412EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1412employ
    FeaturePrefsStore.batch1411.v1412employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1412: encore mode
internal fun PlayerActivity.showV1412EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1412encore
    FeaturePrefsStore.batch1411.v1412encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1413: effort mode
internal fun PlayerActivity.showV1413EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1413effort
    FeaturePrefsStore.batch1411.v1413effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1413: eight mode
internal fun PlayerActivity.showV1413EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1413eight
    FeaturePrefsStore.batch1411.v1413eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1413: either mode
internal fun PlayerActivity.showV1413EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1413either
    FeaturePrefsStore.batch1411.v1413either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1413: elbow mode
internal fun PlayerActivity.showV1413ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1413elbow
    FeaturePrefsStore.batch1411.v1413elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1413: elder mode
internal fun PlayerActivity.showV1413ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1413elder
    FeaturePrefsStore.batch1411.v1413elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1413: electric level
internal fun PlayerActivity.showV1413ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1413: elegant level
internal fun PlayerActivity.showV1413ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1413: elite level
internal fun PlayerActivity.showV1413EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1413: else level
internal fun PlayerActivity.showV1413ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413else = value
        AppToast.show(this, "else: $value")
    }
}

// v1413: email level
internal fun PlayerActivity.showV1413EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1413email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1413email = value
        AppToast.show(this, "email: $value")
    }
}

// v1413: ember mode
internal fun PlayerActivity.showV1413EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1413ember
    FeaturePrefsStore.batch1411.v1413ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1413: emerge mode
internal fun PlayerActivity.showV1413EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1413emerge
    FeaturePrefsStore.batch1411.v1413emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1413: emotion mode
internal fun PlayerActivity.showV1413EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1413emotion
    FeaturePrefsStore.batch1411.v1413emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1413: employ mode
internal fun PlayerActivity.showV1413EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1413employ
    FeaturePrefsStore.batch1411.v1413employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1413: encore mode
internal fun PlayerActivity.showV1413EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1413encore
    FeaturePrefsStore.batch1411.v1413encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1414: effort mode
internal fun PlayerActivity.showV1414EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1414effort
    FeaturePrefsStore.batch1411.v1414effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1414: eight mode
internal fun PlayerActivity.showV1414EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1414eight
    FeaturePrefsStore.batch1411.v1414eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1414: either mode
internal fun PlayerActivity.showV1414EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1414either
    FeaturePrefsStore.batch1411.v1414either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1414: elbow mode
internal fun PlayerActivity.showV1414ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1414elbow
    FeaturePrefsStore.batch1411.v1414elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1414: elder mode
internal fun PlayerActivity.showV1414ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1414elder
    FeaturePrefsStore.batch1411.v1414elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1414: electric level
internal fun PlayerActivity.showV1414ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1414: elegant level
internal fun PlayerActivity.showV1414ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1414: elite level
internal fun PlayerActivity.showV1414EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1414: else level
internal fun PlayerActivity.showV1414ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414else = value
        AppToast.show(this, "else: $value")
    }
}

// v1414: email level
internal fun PlayerActivity.showV1414EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1414email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1414email = value
        AppToast.show(this, "email: $value")
    }
}

// v1414: ember mode
internal fun PlayerActivity.showV1414EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1414ember
    FeaturePrefsStore.batch1411.v1414ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1414: emerge mode
internal fun PlayerActivity.showV1414EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1414emerge
    FeaturePrefsStore.batch1411.v1414emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1414: emotion mode
internal fun PlayerActivity.showV1414EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1414emotion
    FeaturePrefsStore.batch1411.v1414emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1414: employ mode
internal fun PlayerActivity.showV1414EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1414employ
    FeaturePrefsStore.batch1411.v1414employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1414: encore mode
internal fun PlayerActivity.showV1414EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1414encore
    FeaturePrefsStore.batch1411.v1414encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1415: effort mode
internal fun PlayerActivity.showV1415EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1415effort
    FeaturePrefsStore.batch1411.v1415effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1415: eight mode
internal fun PlayerActivity.showV1415EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1415eight
    FeaturePrefsStore.batch1411.v1415eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1415: either mode
internal fun PlayerActivity.showV1415EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1415either
    FeaturePrefsStore.batch1411.v1415either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1415: elbow mode
internal fun PlayerActivity.showV1415ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1415elbow
    FeaturePrefsStore.batch1411.v1415elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1415: elder mode
internal fun PlayerActivity.showV1415ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1415elder
    FeaturePrefsStore.batch1411.v1415elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1415: electric level
internal fun PlayerActivity.showV1415ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1415: elegant level
internal fun PlayerActivity.showV1415ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1415: elite level
internal fun PlayerActivity.showV1415EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1415: else level
internal fun PlayerActivity.showV1415ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415else = value
        AppToast.show(this, "else: $value")
    }
}

// v1415: email level
internal fun PlayerActivity.showV1415EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1415email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1415email = value
        AppToast.show(this, "email: $value")
    }
}

// v1415: ember mode
internal fun PlayerActivity.showV1415EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1415ember
    FeaturePrefsStore.batch1411.v1415ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1415: emerge mode
internal fun PlayerActivity.showV1415EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1415emerge
    FeaturePrefsStore.batch1411.v1415emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1415: emotion mode
internal fun PlayerActivity.showV1415EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1415emotion
    FeaturePrefsStore.batch1411.v1415emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1415: employ mode
internal fun PlayerActivity.showV1415EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1415employ
    FeaturePrefsStore.batch1411.v1415employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1415: encore mode
internal fun PlayerActivity.showV1415EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1415encore
    FeaturePrefsStore.batch1411.v1415encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1416: effort mode
internal fun PlayerActivity.showV1416EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1416effort
    FeaturePrefsStore.batch1411.v1416effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1416: eight mode
internal fun PlayerActivity.showV1416EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1416eight
    FeaturePrefsStore.batch1411.v1416eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1416: either mode
internal fun PlayerActivity.showV1416EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1416either
    FeaturePrefsStore.batch1411.v1416either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1416: elbow mode
internal fun PlayerActivity.showV1416ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1416elbow
    FeaturePrefsStore.batch1411.v1416elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1416: elder mode
internal fun PlayerActivity.showV1416ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1416elder
    FeaturePrefsStore.batch1411.v1416elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1416: electric level
internal fun PlayerActivity.showV1416ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1416: elegant level
internal fun PlayerActivity.showV1416ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1416: elite level
internal fun PlayerActivity.showV1416EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1416: else level
internal fun PlayerActivity.showV1416ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416else = value
        AppToast.show(this, "else: $value")
    }
}

// v1416: email level
internal fun PlayerActivity.showV1416EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1416email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1416email = value
        AppToast.show(this, "email: $value")
    }
}

// v1416: ember mode
internal fun PlayerActivity.showV1416EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1416ember
    FeaturePrefsStore.batch1411.v1416ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1416: emerge mode
internal fun PlayerActivity.showV1416EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1416emerge
    FeaturePrefsStore.batch1411.v1416emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1416: emotion mode
internal fun PlayerActivity.showV1416EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1416emotion
    FeaturePrefsStore.batch1411.v1416emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1416: employ mode
internal fun PlayerActivity.showV1416EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1416employ
    FeaturePrefsStore.batch1411.v1416employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1416: encore mode
internal fun PlayerActivity.showV1416EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1416encore
    FeaturePrefsStore.batch1411.v1416encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1417: effort mode
internal fun PlayerActivity.showV1417EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1417effort
    FeaturePrefsStore.batch1411.v1417effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1417: eight mode
internal fun PlayerActivity.showV1417EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1417eight
    FeaturePrefsStore.batch1411.v1417eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1417: either mode
internal fun PlayerActivity.showV1417EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1417either
    FeaturePrefsStore.batch1411.v1417either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1417: elbow mode
internal fun PlayerActivity.showV1417ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1417elbow
    FeaturePrefsStore.batch1411.v1417elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1417: elder mode
internal fun PlayerActivity.showV1417ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1417elder
    FeaturePrefsStore.batch1411.v1417elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1417: electric level
internal fun PlayerActivity.showV1417ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1417: elegant level
internal fun PlayerActivity.showV1417ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1417: elite level
internal fun PlayerActivity.showV1417EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1417: else level
internal fun PlayerActivity.showV1417ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417else = value
        AppToast.show(this, "else: $value")
    }
}

// v1417: email level
internal fun PlayerActivity.showV1417EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1417email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1417email = value
        AppToast.show(this, "email: $value")
    }
}

// v1417: ember mode
internal fun PlayerActivity.showV1417EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1417ember
    FeaturePrefsStore.batch1411.v1417ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1417: emerge mode
internal fun PlayerActivity.showV1417EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1417emerge
    FeaturePrefsStore.batch1411.v1417emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1417: emotion mode
internal fun PlayerActivity.showV1417EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1417emotion
    FeaturePrefsStore.batch1411.v1417emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1417: employ mode
internal fun PlayerActivity.showV1417EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1417employ
    FeaturePrefsStore.batch1411.v1417employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1417: encore mode
internal fun PlayerActivity.showV1417EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1417encore
    FeaturePrefsStore.batch1411.v1417encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1418: effort mode
internal fun PlayerActivity.showV1418EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1418effort
    FeaturePrefsStore.batch1411.v1418effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1418: eight mode
internal fun PlayerActivity.showV1418EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1418eight
    FeaturePrefsStore.batch1411.v1418eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1418: either mode
internal fun PlayerActivity.showV1418EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1418either
    FeaturePrefsStore.batch1411.v1418either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1418: elbow mode
internal fun PlayerActivity.showV1418ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1418elbow
    FeaturePrefsStore.batch1411.v1418elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1418: elder mode
internal fun PlayerActivity.showV1418ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1418elder
    FeaturePrefsStore.batch1411.v1418elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1418: electric level
internal fun PlayerActivity.showV1418ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1418: elegant level
internal fun PlayerActivity.showV1418ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1418: elite level
internal fun PlayerActivity.showV1418EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1418: else level
internal fun PlayerActivity.showV1418ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418else = value
        AppToast.show(this, "else: $value")
    }
}

// v1418: email level
internal fun PlayerActivity.showV1418EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1418email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1418email = value
        AppToast.show(this, "email: $value")
    }
}

// v1418: ember mode
internal fun PlayerActivity.showV1418EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1418ember
    FeaturePrefsStore.batch1411.v1418ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1418: emerge mode
internal fun PlayerActivity.showV1418EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1418emerge
    FeaturePrefsStore.batch1411.v1418emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1418: emotion mode
internal fun PlayerActivity.showV1418EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1418emotion
    FeaturePrefsStore.batch1411.v1418emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1418: employ mode
internal fun PlayerActivity.showV1418EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1418employ
    FeaturePrefsStore.batch1411.v1418employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1418: encore mode
internal fun PlayerActivity.showV1418EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1418encore
    FeaturePrefsStore.batch1411.v1418encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1419: effort mode
internal fun PlayerActivity.showV1419EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1419effort
    FeaturePrefsStore.batch1411.v1419effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1419: eight mode
internal fun PlayerActivity.showV1419EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1419eight
    FeaturePrefsStore.batch1411.v1419eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1419: either mode
internal fun PlayerActivity.showV1419EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1419either
    FeaturePrefsStore.batch1411.v1419either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1419: elbow mode
internal fun PlayerActivity.showV1419ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1419elbow
    FeaturePrefsStore.batch1411.v1419elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1419: elder mode
internal fun PlayerActivity.showV1419ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1419elder
    FeaturePrefsStore.batch1411.v1419elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1419: electric level
internal fun PlayerActivity.showV1419ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1419: elegant level
internal fun PlayerActivity.showV1419ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1419: elite level
internal fun PlayerActivity.showV1419EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1419: else level
internal fun PlayerActivity.showV1419ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419else = value
        AppToast.show(this, "else: $value")
    }
}

// v1419: email level
internal fun PlayerActivity.showV1419EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1419email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1419email = value
        AppToast.show(this, "email: $value")
    }
}

// v1419: ember mode
internal fun PlayerActivity.showV1419EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1419ember
    FeaturePrefsStore.batch1411.v1419ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1419: emerge mode
internal fun PlayerActivity.showV1419EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1419emerge
    FeaturePrefsStore.batch1411.v1419emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1419: emotion mode
internal fun PlayerActivity.showV1419EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1419emotion
    FeaturePrefsStore.batch1411.v1419emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1419: employ mode
internal fun PlayerActivity.showV1419EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1419employ
    FeaturePrefsStore.batch1411.v1419employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1419: encore mode
internal fun PlayerActivity.showV1419EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1419encore
    FeaturePrefsStore.batch1411.v1419encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

// v1420: effort mode
internal fun PlayerActivity.showV1420EffortToggle() {
    val current = FeaturePrefsStore.batch1411.v1420effort
    FeaturePrefsStore.batch1411.v1420effort = !current
    AppToast.show(this, "effort: ${if (!current) "ON" else "OFF"}")
}

// v1420: eight mode
internal fun PlayerActivity.showV1420EightToggle() {
    val current = FeaturePrefsStore.batch1411.v1420eight
    FeaturePrefsStore.batch1411.v1420eight = !current
    AppToast.show(this, "eight: ${if (!current) "ON" else "OFF"}")
}

// v1420: either mode
internal fun PlayerActivity.showV1420EitherToggle() {
    val current = FeaturePrefsStore.batch1411.v1420either
    FeaturePrefsStore.batch1411.v1420either = !current
    AppToast.show(this, "either: ${if (!current) "ON" else "OFF"}")
}

// v1420: elbow mode
internal fun PlayerActivity.showV1420ElbowToggle() {
    val current = FeaturePrefsStore.batch1411.v1420elbow
    FeaturePrefsStore.batch1411.v1420elbow = !current
    AppToast.show(this, "elbow: ${if (!current) "ON" else "OFF"}")
}

// v1420: elder mode
internal fun PlayerActivity.showV1420ElderToggle() {
    val current = FeaturePrefsStore.batch1411.v1420elder
    FeaturePrefsStore.batch1411.v1420elder = !current
    AppToast.show(this, "elder: ${if (!current) "ON" else "OFF"}")
}

// v1420: electric level
internal fun PlayerActivity.showV1420ElectricDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420electric).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "electric level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420electric = value
        AppToast.show(this, "electric: $value")
    }
}

// v1420: elegant level
internal fun PlayerActivity.showV1420ElegantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420elegant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elegant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420elegant = value
        AppToast.show(this, "elegant: $value")
    }
}

// v1420: elite level
internal fun PlayerActivity.showV1420EliteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420elite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "elite level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420elite = value
        AppToast.show(this, "elite: $value")
    }
}

// v1420: else level
internal fun PlayerActivity.showV1420ElseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420else).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "else level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420else = value
        AppToast.show(this, "else: $value")
    }
}

// v1420: email level
internal fun PlayerActivity.showV1420EmailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1411.v1420email).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "email level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1411.v1420email = value
        AppToast.show(this, "email: $value")
    }
}

// v1420: ember mode
internal fun PlayerActivity.showV1420EmberToggle() {
    val current = FeaturePrefsStore.batch1411.v1420ember
    FeaturePrefsStore.batch1411.v1420ember = !current
    AppToast.show(this, "ember: ${if (!current) "ON" else "OFF"}")
}

// v1420: emerge mode
internal fun PlayerActivity.showV1420EmergeToggle() {
    val current = FeaturePrefsStore.batch1411.v1420emerge
    FeaturePrefsStore.batch1411.v1420emerge = !current
    AppToast.show(this, "emerge: ${if (!current) "ON" else "OFF"}")
}

// v1420: emotion mode
internal fun PlayerActivity.showV1420EmotionToggle() {
    val current = FeaturePrefsStore.batch1411.v1420emotion
    FeaturePrefsStore.batch1411.v1420emotion = !current
    AppToast.show(this, "emotion: ${if (!current) "ON" else "OFF"}")
}

// v1420: employ mode
internal fun PlayerActivity.showV1420EmployToggle() {
    val current = FeaturePrefsStore.batch1411.v1420employ
    FeaturePrefsStore.batch1411.v1420employ = !current
    AppToast.show(this, "employ: ${if (!current) "ON" else "OFF"}")
}

// v1420: encore mode
internal fun PlayerActivity.showV1420EncoreToggle() {
    val current = FeaturePrefsStore.batch1411.v1420encore
    FeaturePrefsStore.batch1411.v1420encore = !current
    AppToast.show(this, "encore: ${if (!current) "ON" else "OFF"}")
}

