package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1711: quiet mode
internal fun PlayerActivity.showV1711QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1711quiet
    FeaturePrefsStore.batch1711.v1711quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1711: quilt mode
internal fun PlayerActivity.showV1711QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1711quilt
    FeaturePrefsStore.batch1711.v1711quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1711: quiz mode
internal fun PlayerActivity.showV1711QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1711quiz
    FeaturePrefsStore.batch1711.v1711quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1711: rabbit mode
internal fun PlayerActivity.showV1711RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1711rabbit
    FeaturePrefsStore.batch1711.v1711rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1711: raccoon mode
internal fun PlayerActivity.showV1711RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1711raccoon
    FeaturePrefsStore.batch1711.v1711raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1711: rack level
internal fun PlayerActivity.showV1711RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1711rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1711rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1711: radar level
internal fun PlayerActivity.showV1711RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1711radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1711radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1711: radio level
internal fun PlayerActivity.showV1711RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1711radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1711radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1711: rage level
internal fun PlayerActivity.showV1711RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1711rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1711rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1711: rail level
internal fun PlayerActivity.showV1711RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1711rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1711rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1711: rain mode
internal fun PlayerActivity.showV1711RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1711rain
    FeaturePrefsStore.batch1711.v1711rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1711: raise mode
internal fun PlayerActivity.showV1711RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1711raise
    FeaturePrefsStore.batch1711.v1711raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1711: rally mode
internal fun PlayerActivity.showV1711RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1711rally
    FeaturePrefsStore.batch1711.v1711rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1711: ramp mode
internal fun PlayerActivity.showV1711RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1711ramp
    FeaturePrefsStore.batch1711.v1711ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1711: ranch mode
internal fun PlayerActivity.showV1711RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1711ranch
    FeaturePrefsStore.batch1711.v1711ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1712: quiet mode
internal fun PlayerActivity.showV1712QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1712quiet
    FeaturePrefsStore.batch1711.v1712quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1712: quilt mode
internal fun PlayerActivity.showV1712QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1712quilt
    FeaturePrefsStore.batch1711.v1712quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1712: quiz mode
internal fun PlayerActivity.showV1712QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1712quiz
    FeaturePrefsStore.batch1711.v1712quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1712: rabbit mode
internal fun PlayerActivity.showV1712RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1712rabbit
    FeaturePrefsStore.batch1711.v1712rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1712: raccoon mode
internal fun PlayerActivity.showV1712RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1712raccoon
    FeaturePrefsStore.batch1711.v1712raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1712: rack level
internal fun PlayerActivity.showV1712RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1712rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1712rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1712: radar level
internal fun PlayerActivity.showV1712RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1712radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1712radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1712: radio level
internal fun PlayerActivity.showV1712RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1712radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1712radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1712: rage level
internal fun PlayerActivity.showV1712RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1712rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1712rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1712: rail level
internal fun PlayerActivity.showV1712RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1712rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1712rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1712: rain mode
internal fun PlayerActivity.showV1712RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1712rain
    FeaturePrefsStore.batch1711.v1712rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1712: raise mode
internal fun PlayerActivity.showV1712RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1712raise
    FeaturePrefsStore.batch1711.v1712raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1712: rally mode
internal fun PlayerActivity.showV1712RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1712rally
    FeaturePrefsStore.batch1711.v1712rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1712: ramp mode
internal fun PlayerActivity.showV1712RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1712ramp
    FeaturePrefsStore.batch1711.v1712ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1712: ranch mode
internal fun PlayerActivity.showV1712RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1712ranch
    FeaturePrefsStore.batch1711.v1712ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1713: quiet mode
internal fun PlayerActivity.showV1713QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1713quiet
    FeaturePrefsStore.batch1711.v1713quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1713: quilt mode
internal fun PlayerActivity.showV1713QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1713quilt
    FeaturePrefsStore.batch1711.v1713quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1713: quiz mode
internal fun PlayerActivity.showV1713QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1713quiz
    FeaturePrefsStore.batch1711.v1713quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1713: rabbit mode
internal fun PlayerActivity.showV1713RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1713rabbit
    FeaturePrefsStore.batch1711.v1713rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1713: raccoon mode
internal fun PlayerActivity.showV1713RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1713raccoon
    FeaturePrefsStore.batch1711.v1713raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1713: rack level
internal fun PlayerActivity.showV1713RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1713rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1713rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1713: radar level
internal fun PlayerActivity.showV1713RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1713radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1713radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1713: radio level
internal fun PlayerActivity.showV1713RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1713radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1713radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1713: rage level
internal fun PlayerActivity.showV1713RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1713rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1713rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1713: rail level
internal fun PlayerActivity.showV1713RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1713rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1713rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1713: rain mode
internal fun PlayerActivity.showV1713RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1713rain
    FeaturePrefsStore.batch1711.v1713rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1713: raise mode
internal fun PlayerActivity.showV1713RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1713raise
    FeaturePrefsStore.batch1711.v1713raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1713: rally mode
internal fun PlayerActivity.showV1713RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1713rally
    FeaturePrefsStore.batch1711.v1713rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1713: ramp mode
internal fun PlayerActivity.showV1713RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1713ramp
    FeaturePrefsStore.batch1711.v1713ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1713: ranch mode
internal fun PlayerActivity.showV1713RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1713ranch
    FeaturePrefsStore.batch1711.v1713ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1714: quiet mode
internal fun PlayerActivity.showV1714QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1714quiet
    FeaturePrefsStore.batch1711.v1714quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1714: quilt mode
internal fun PlayerActivity.showV1714QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1714quilt
    FeaturePrefsStore.batch1711.v1714quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1714: quiz mode
internal fun PlayerActivity.showV1714QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1714quiz
    FeaturePrefsStore.batch1711.v1714quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1714: rabbit mode
internal fun PlayerActivity.showV1714RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1714rabbit
    FeaturePrefsStore.batch1711.v1714rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1714: raccoon mode
internal fun PlayerActivity.showV1714RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1714raccoon
    FeaturePrefsStore.batch1711.v1714raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1714: rack level
internal fun PlayerActivity.showV1714RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1714rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1714rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1714: radar level
internal fun PlayerActivity.showV1714RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1714radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1714radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1714: radio level
internal fun PlayerActivity.showV1714RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1714radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1714radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1714: rage level
internal fun PlayerActivity.showV1714RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1714rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1714rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1714: rail level
internal fun PlayerActivity.showV1714RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1714rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1714rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1714: rain mode
internal fun PlayerActivity.showV1714RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1714rain
    FeaturePrefsStore.batch1711.v1714rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1714: raise mode
internal fun PlayerActivity.showV1714RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1714raise
    FeaturePrefsStore.batch1711.v1714raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1714: rally mode
internal fun PlayerActivity.showV1714RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1714rally
    FeaturePrefsStore.batch1711.v1714rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1714: ramp mode
internal fun PlayerActivity.showV1714RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1714ramp
    FeaturePrefsStore.batch1711.v1714ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1714: ranch mode
internal fun PlayerActivity.showV1714RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1714ranch
    FeaturePrefsStore.batch1711.v1714ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1715: quiet mode
internal fun PlayerActivity.showV1715QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1715quiet
    FeaturePrefsStore.batch1711.v1715quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1715: quilt mode
internal fun PlayerActivity.showV1715QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1715quilt
    FeaturePrefsStore.batch1711.v1715quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1715: quiz mode
internal fun PlayerActivity.showV1715QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1715quiz
    FeaturePrefsStore.batch1711.v1715quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1715: rabbit mode
internal fun PlayerActivity.showV1715RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1715rabbit
    FeaturePrefsStore.batch1711.v1715rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1715: raccoon mode
internal fun PlayerActivity.showV1715RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1715raccoon
    FeaturePrefsStore.batch1711.v1715raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1715: rack level
internal fun PlayerActivity.showV1715RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1715rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1715rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1715: radar level
internal fun PlayerActivity.showV1715RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1715radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1715radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1715: radio level
internal fun PlayerActivity.showV1715RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1715radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1715radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1715: rage level
internal fun PlayerActivity.showV1715RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1715rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1715rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1715: rail level
internal fun PlayerActivity.showV1715RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1715rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1715rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1715: rain mode
internal fun PlayerActivity.showV1715RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1715rain
    FeaturePrefsStore.batch1711.v1715rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1715: raise mode
internal fun PlayerActivity.showV1715RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1715raise
    FeaturePrefsStore.batch1711.v1715raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1715: rally mode
internal fun PlayerActivity.showV1715RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1715rally
    FeaturePrefsStore.batch1711.v1715rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1715: ramp mode
internal fun PlayerActivity.showV1715RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1715ramp
    FeaturePrefsStore.batch1711.v1715ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1715: ranch mode
internal fun PlayerActivity.showV1715RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1715ranch
    FeaturePrefsStore.batch1711.v1715ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1716: quiet mode
internal fun PlayerActivity.showV1716QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1716quiet
    FeaturePrefsStore.batch1711.v1716quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1716: quilt mode
internal fun PlayerActivity.showV1716QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1716quilt
    FeaturePrefsStore.batch1711.v1716quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1716: quiz mode
internal fun PlayerActivity.showV1716QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1716quiz
    FeaturePrefsStore.batch1711.v1716quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1716: rabbit mode
internal fun PlayerActivity.showV1716RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1716rabbit
    FeaturePrefsStore.batch1711.v1716rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1716: raccoon mode
internal fun PlayerActivity.showV1716RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1716raccoon
    FeaturePrefsStore.batch1711.v1716raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1716: rack level
internal fun PlayerActivity.showV1716RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1716rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1716rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1716: radar level
internal fun PlayerActivity.showV1716RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1716radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1716radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1716: radio level
internal fun PlayerActivity.showV1716RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1716radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1716radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1716: rage level
internal fun PlayerActivity.showV1716RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1716rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1716rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1716: rail level
internal fun PlayerActivity.showV1716RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1716rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1716rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1716: rain mode
internal fun PlayerActivity.showV1716RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1716rain
    FeaturePrefsStore.batch1711.v1716rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1716: raise mode
internal fun PlayerActivity.showV1716RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1716raise
    FeaturePrefsStore.batch1711.v1716raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1716: rally mode
internal fun PlayerActivity.showV1716RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1716rally
    FeaturePrefsStore.batch1711.v1716rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1716: ramp mode
internal fun PlayerActivity.showV1716RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1716ramp
    FeaturePrefsStore.batch1711.v1716ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1716: ranch mode
internal fun PlayerActivity.showV1716RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1716ranch
    FeaturePrefsStore.batch1711.v1716ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1717: quiet mode
internal fun PlayerActivity.showV1717QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1717quiet
    FeaturePrefsStore.batch1711.v1717quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1717: quilt mode
internal fun PlayerActivity.showV1717QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1717quilt
    FeaturePrefsStore.batch1711.v1717quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1717: quiz mode
internal fun PlayerActivity.showV1717QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1717quiz
    FeaturePrefsStore.batch1711.v1717quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1717: rabbit mode
internal fun PlayerActivity.showV1717RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1717rabbit
    FeaturePrefsStore.batch1711.v1717rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1717: raccoon mode
internal fun PlayerActivity.showV1717RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1717raccoon
    FeaturePrefsStore.batch1711.v1717raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1717: rack level
internal fun PlayerActivity.showV1717RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1717rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1717rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1717: radar level
internal fun PlayerActivity.showV1717RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1717radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1717radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1717: radio level
internal fun PlayerActivity.showV1717RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1717radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1717radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1717: rage level
internal fun PlayerActivity.showV1717RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1717rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1717rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1717: rail level
internal fun PlayerActivity.showV1717RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1717rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1717rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1717: rain mode
internal fun PlayerActivity.showV1717RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1717rain
    FeaturePrefsStore.batch1711.v1717rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1717: raise mode
internal fun PlayerActivity.showV1717RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1717raise
    FeaturePrefsStore.batch1711.v1717raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1717: rally mode
internal fun PlayerActivity.showV1717RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1717rally
    FeaturePrefsStore.batch1711.v1717rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1717: ramp mode
internal fun PlayerActivity.showV1717RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1717ramp
    FeaturePrefsStore.batch1711.v1717ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1717: ranch mode
internal fun PlayerActivity.showV1717RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1717ranch
    FeaturePrefsStore.batch1711.v1717ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1718: quiet mode
internal fun PlayerActivity.showV1718QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1718quiet
    FeaturePrefsStore.batch1711.v1718quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1718: quilt mode
internal fun PlayerActivity.showV1718QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1718quilt
    FeaturePrefsStore.batch1711.v1718quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1718: quiz mode
internal fun PlayerActivity.showV1718QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1718quiz
    FeaturePrefsStore.batch1711.v1718quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1718: rabbit mode
internal fun PlayerActivity.showV1718RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1718rabbit
    FeaturePrefsStore.batch1711.v1718rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1718: raccoon mode
internal fun PlayerActivity.showV1718RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1718raccoon
    FeaturePrefsStore.batch1711.v1718raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1718: rack level
internal fun PlayerActivity.showV1718RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1718rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1718rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1718: radar level
internal fun PlayerActivity.showV1718RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1718radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1718radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1718: radio level
internal fun PlayerActivity.showV1718RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1718radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1718radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1718: rage level
internal fun PlayerActivity.showV1718RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1718rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1718rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1718: rail level
internal fun PlayerActivity.showV1718RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1718rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1718rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1718: rain mode
internal fun PlayerActivity.showV1718RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1718rain
    FeaturePrefsStore.batch1711.v1718rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1718: raise mode
internal fun PlayerActivity.showV1718RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1718raise
    FeaturePrefsStore.batch1711.v1718raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1718: rally mode
internal fun PlayerActivity.showV1718RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1718rally
    FeaturePrefsStore.batch1711.v1718rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1718: ramp mode
internal fun PlayerActivity.showV1718RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1718ramp
    FeaturePrefsStore.batch1711.v1718ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1718: ranch mode
internal fun PlayerActivity.showV1718RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1718ranch
    FeaturePrefsStore.batch1711.v1718ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1719: quiet mode
internal fun PlayerActivity.showV1719QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1719quiet
    FeaturePrefsStore.batch1711.v1719quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1719: quilt mode
internal fun PlayerActivity.showV1719QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1719quilt
    FeaturePrefsStore.batch1711.v1719quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1719: quiz mode
internal fun PlayerActivity.showV1719QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1719quiz
    FeaturePrefsStore.batch1711.v1719quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1719: rabbit mode
internal fun PlayerActivity.showV1719RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1719rabbit
    FeaturePrefsStore.batch1711.v1719rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1719: raccoon mode
internal fun PlayerActivity.showV1719RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1719raccoon
    FeaturePrefsStore.batch1711.v1719raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1719: rack level
internal fun PlayerActivity.showV1719RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1719rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1719rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1719: radar level
internal fun PlayerActivity.showV1719RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1719radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1719radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1719: radio level
internal fun PlayerActivity.showV1719RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1719radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1719radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1719: rage level
internal fun PlayerActivity.showV1719RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1719rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1719rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1719: rail level
internal fun PlayerActivity.showV1719RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1719rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1719rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1719: rain mode
internal fun PlayerActivity.showV1719RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1719rain
    FeaturePrefsStore.batch1711.v1719rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1719: raise mode
internal fun PlayerActivity.showV1719RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1719raise
    FeaturePrefsStore.batch1711.v1719raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1719: rally mode
internal fun PlayerActivity.showV1719RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1719rally
    FeaturePrefsStore.batch1711.v1719rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1719: ramp mode
internal fun PlayerActivity.showV1719RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1719ramp
    FeaturePrefsStore.batch1711.v1719ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1719: ranch mode
internal fun PlayerActivity.showV1719RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1719ranch
    FeaturePrefsStore.batch1711.v1719ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

// v1720: quiet mode
internal fun PlayerActivity.showV1720QuietToggle() {
    val current = FeaturePrefsStore.batch1711.v1720quiet
    FeaturePrefsStore.batch1711.v1720quiet = !current
    AppToast.show(this, "quiet: ${if (!current) "ON" else "OFF"}")
}

// v1720: quilt mode
internal fun PlayerActivity.showV1720QuiltToggle() {
    val current = FeaturePrefsStore.batch1711.v1720quilt
    FeaturePrefsStore.batch1711.v1720quilt = !current
    AppToast.show(this, "quilt: ${if (!current) "ON" else "OFF"}")
}

// v1720: quiz mode
internal fun PlayerActivity.showV1720QuizToggle() {
    val current = FeaturePrefsStore.batch1711.v1720quiz
    FeaturePrefsStore.batch1711.v1720quiz = !current
    AppToast.show(this, "quiz: ${if (!current) "ON" else "OFF"}")
}

// v1720: rabbit mode
internal fun PlayerActivity.showV1720RabbitToggle() {
    val current = FeaturePrefsStore.batch1711.v1720rabbit
    FeaturePrefsStore.batch1711.v1720rabbit = !current
    AppToast.show(this, "rabbit: ${if (!current) "ON" else "OFF"}")
}

// v1720: raccoon mode
internal fun PlayerActivity.showV1720RaccoonToggle() {
    val current = FeaturePrefsStore.batch1711.v1720raccoon
    FeaturePrefsStore.batch1711.v1720raccoon = !current
    AppToast.show(this, "raccoon: ${if (!current) "ON" else "OFF"}")
}

// v1720: rack level
internal fun PlayerActivity.showV1720RackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1720rack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rack level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1720rack = value
        AppToast.show(this, "rack: $value")
    }
}

// v1720: radar level
internal fun PlayerActivity.showV1720RadarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1720radar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1720radar = value
        AppToast.show(this, "radar: $value")
    }
}

// v1720: radio level
internal fun PlayerActivity.showV1720RadioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1720radio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "radio level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1720radio = value
        AppToast.show(this, "radio: $value")
    }
}

// v1720: rage level
internal fun PlayerActivity.showV1720RageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1720rage).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rage level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1720rage = value
        AppToast.show(this, "rage: $value")
    }
}

// v1720: rail level
internal fun PlayerActivity.showV1720RailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1711.v1720rail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1711.v1720rail = value
        AppToast.show(this, "rail: $value")
    }
}

// v1720: rain mode
internal fun PlayerActivity.showV1720RainToggle() {
    val current = FeaturePrefsStore.batch1711.v1720rain
    FeaturePrefsStore.batch1711.v1720rain = !current
    AppToast.show(this, "rain: ${if (!current) "ON" else "OFF"}")
}

// v1720: raise mode
internal fun PlayerActivity.showV1720RaiseToggle() {
    val current = FeaturePrefsStore.batch1711.v1720raise
    FeaturePrefsStore.batch1711.v1720raise = !current
    AppToast.show(this, "raise: ${if (!current) "ON" else "OFF"}")
}

// v1720: rally mode
internal fun PlayerActivity.showV1720RallyToggle() {
    val current = FeaturePrefsStore.batch1711.v1720rally
    FeaturePrefsStore.batch1711.v1720rally = !current
    AppToast.show(this, "rally: ${if (!current) "ON" else "OFF"}")
}

// v1720: ramp mode
internal fun PlayerActivity.showV1720RampToggle() {
    val current = FeaturePrefsStore.batch1711.v1720ramp
    FeaturePrefsStore.batch1711.v1720ramp = !current
    AppToast.show(this, "ramp: ${if (!current) "ON" else "OFF"}")
}

// v1720: ranch mode
internal fun PlayerActivity.showV1720RanchToggle() {
    val current = FeaturePrefsStore.batch1711.v1720ranch
    FeaturePrefsStore.batch1711.v1720ranch = !current
    AppToast.show(this, "ranch: ${if (!current) "ON" else "OFF"}")
}

