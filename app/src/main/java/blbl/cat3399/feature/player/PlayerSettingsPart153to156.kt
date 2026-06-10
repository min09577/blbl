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

// v1721: rapid mode
internal fun PlayerActivity.showV1721RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rapid
    FeaturePrefsStore.batch1721.v1721rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1721: rare mode
internal fun PlayerActivity.showV1721RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rare
    FeaturePrefsStore.batch1721.v1721rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1721: rather mode
internal fun PlayerActivity.showV1721RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1721rather
    FeaturePrefsStore.batch1721.v1721rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1721: raven mode
internal fun PlayerActivity.showV1721RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1721raven
    FeaturePrefsStore.batch1721.v1721raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1721: razor mode
internal fun PlayerActivity.showV1721RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1721razor
    FeaturePrefsStore.batch1721.v1721razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1721: reason level
internal fun PlayerActivity.showV1721ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1721: rebel level
internal fun PlayerActivity.showV1721RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1721: recall level
internal fun PlayerActivity.showV1721RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1721: receive level
internal fun PlayerActivity.showV1721ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1721: recipe level
internal fun PlayerActivity.showV1721RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1721recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1721recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1721: reform mode
internal fun PlayerActivity.showV1721ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1721reform
    FeaturePrefsStore.batch1721.v1721reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1721: region mode
internal fun PlayerActivity.showV1721RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1721region
    FeaturePrefsStore.batch1721.v1721region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1721: regret mode
internal fun PlayerActivity.showV1721RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1721regret
    FeaturePrefsStore.batch1721.v1721regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1721: relax mode
internal fun PlayerActivity.showV1721RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1721relax
    FeaturePrefsStore.batch1721.v1721relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1721: relief mode
internal fun PlayerActivity.showV1721ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1721relief
    FeaturePrefsStore.batch1721.v1721relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1722: rapid mode
internal fun PlayerActivity.showV1722RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rapid
    FeaturePrefsStore.batch1721.v1722rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1722: rare mode
internal fun PlayerActivity.showV1722RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rare
    FeaturePrefsStore.batch1721.v1722rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1722: rather mode
internal fun PlayerActivity.showV1722RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1722rather
    FeaturePrefsStore.batch1721.v1722rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1722: raven mode
internal fun PlayerActivity.showV1722RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1722raven
    FeaturePrefsStore.batch1721.v1722raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1722: razor mode
internal fun PlayerActivity.showV1722RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1722razor
    FeaturePrefsStore.batch1721.v1722razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1722: reason level
internal fun PlayerActivity.showV1722ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1722: rebel level
internal fun PlayerActivity.showV1722RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1722: recall level
internal fun PlayerActivity.showV1722RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1722: receive level
internal fun PlayerActivity.showV1722ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1722: recipe level
internal fun PlayerActivity.showV1722RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1722recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1722recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1722: reform mode
internal fun PlayerActivity.showV1722ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1722reform
    FeaturePrefsStore.batch1721.v1722reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1722: region mode
internal fun PlayerActivity.showV1722RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1722region
    FeaturePrefsStore.batch1721.v1722region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1722: regret mode
internal fun PlayerActivity.showV1722RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1722regret
    FeaturePrefsStore.batch1721.v1722regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1722: relax mode
internal fun PlayerActivity.showV1722RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1722relax
    FeaturePrefsStore.batch1721.v1722relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1722: relief mode
internal fun PlayerActivity.showV1722ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1722relief
    FeaturePrefsStore.batch1721.v1722relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1723: rapid mode
internal fun PlayerActivity.showV1723RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rapid
    FeaturePrefsStore.batch1721.v1723rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1723: rare mode
internal fun PlayerActivity.showV1723RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rare
    FeaturePrefsStore.batch1721.v1723rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1723: rather mode
internal fun PlayerActivity.showV1723RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1723rather
    FeaturePrefsStore.batch1721.v1723rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1723: raven mode
internal fun PlayerActivity.showV1723RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1723raven
    FeaturePrefsStore.batch1721.v1723raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1723: razor mode
internal fun PlayerActivity.showV1723RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1723razor
    FeaturePrefsStore.batch1721.v1723razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1723: reason level
internal fun PlayerActivity.showV1723ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1723: rebel level
internal fun PlayerActivity.showV1723RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1723: recall level
internal fun PlayerActivity.showV1723RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1723: receive level
internal fun PlayerActivity.showV1723ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1723: recipe level
internal fun PlayerActivity.showV1723RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1723recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1723recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1723: reform mode
internal fun PlayerActivity.showV1723ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1723reform
    FeaturePrefsStore.batch1721.v1723reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1723: region mode
internal fun PlayerActivity.showV1723RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1723region
    FeaturePrefsStore.batch1721.v1723region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1723: regret mode
internal fun PlayerActivity.showV1723RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1723regret
    FeaturePrefsStore.batch1721.v1723regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1723: relax mode
internal fun PlayerActivity.showV1723RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1723relax
    FeaturePrefsStore.batch1721.v1723relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1723: relief mode
internal fun PlayerActivity.showV1723ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1723relief
    FeaturePrefsStore.batch1721.v1723relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1724: rapid mode
internal fun PlayerActivity.showV1724RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rapid
    FeaturePrefsStore.batch1721.v1724rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1724: rare mode
internal fun PlayerActivity.showV1724RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rare
    FeaturePrefsStore.batch1721.v1724rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1724: rather mode
internal fun PlayerActivity.showV1724RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1724rather
    FeaturePrefsStore.batch1721.v1724rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1724: raven mode
internal fun PlayerActivity.showV1724RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1724raven
    FeaturePrefsStore.batch1721.v1724raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1724: razor mode
internal fun PlayerActivity.showV1724RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1724razor
    FeaturePrefsStore.batch1721.v1724razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1724: reason level
internal fun PlayerActivity.showV1724ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1724: rebel level
internal fun PlayerActivity.showV1724RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1724: recall level
internal fun PlayerActivity.showV1724RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1724: receive level
internal fun PlayerActivity.showV1724ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1724: recipe level
internal fun PlayerActivity.showV1724RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1724recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1724recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1724: reform mode
internal fun PlayerActivity.showV1724ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1724reform
    FeaturePrefsStore.batch1721.v1724reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1724: region mode
internal fun PlayerActivity.showV1724RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1724region
    FeaturePrefsStore.batch1721.v1724region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1724: regret mode
internal fun PlayerActivity.showV1724RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1724regret
    FeaturePrefsStore.batch1721.v1724regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1724: relax mode
internal fun PlayerActivity.showV1724RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1724relax
    FeaturePrefsStore.batch1721.v1724relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1724: relief mode
internal fun PlayerActivity.showV1724ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1724relief
    FeaturePrefsStore.batch1721.v1724relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1725: rapid mode
internal fun PlayerActivity.showV1725RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rapid
    FeaturePrefsStore.batch1721.v1725rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1725: rare mode
internal fun PlayerActivity.showV1725RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rare
    FeaturePrefsStore.batch1721.v1725rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1725: rather mode
internal fun PlayerActivity.showV1725RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1725rather
    FeaturePrefsStore.batch1721.v1725rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1725: raven mode
internal fun PlayerActivity.showV1725RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1725raven
    FeaturePrefsStore.batch1721.v1725raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1725: razor mode
internal fun PlayerActivity.showV1725RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1725razor
    FeaturePrefsStore.batch1721.v1725razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1725: reason level
internal fun PlayerActivity.showV1725ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1725: rebel level
internal fun PlayerActivity.showV1725RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1725: recall level
internal fun PlayerActivity.showV1725RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1725: receive level
internal fun PlayerActivity.showV1725ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1725: recipe level
internal fun PlayerActivity.showV1725RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1725recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1725recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1725: reform mode
internal fun PlayerActivity.showV1725ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1725reform
    FeaturePrefsStore.batch1721.v1725reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1725: region mode
internal fun PlayerActivity.showV1725RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1725region
    FeaturePrefsStore.batch1721.v1725region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1725: regret mode
internal fun PlayerActivity.showV1725RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1725regret
    FeaturePrefsStore.batch1721.v1725regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1725: relax mode
internal fun PlayerActivity.showV1725RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1725relax
    FeaturePrefsStore.batch1721.v1725relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1725: relief mode
internal fun PlayerActivity.showV1725ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1725relief
    FeaturePrefsStore.batch1721.v1725relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1726: rapid mode
internal fun PlayerActivity.showV1726RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rapid
    FeaturePrefsStore.batch1721.v1726rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1726: rare mode
internal fun PlayerActivity.showV1726RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rare
    FeaturePrefsStore.batch1721.v1726rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1726: rather mode
internal fun PlayerActivity.showV1726RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1726rather
    FeaturePrefsStore.batch1721.v1726rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1726: raven mode
internal fun PlayerActivity.showV1726RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1726raven
    FeaturePrefsStore.batch1721.v1726raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1726: razor mode
internal fun PlayerActivity.showV1726RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1726razor
    FeaturePrefsStore.batch1721.v1726razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1726: reason level
internal fun PlayerActivity.showV1726ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1726: rebel level
internal fun PlayerActivity.showV1726RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1726: recall level
internal fun PlayerActivity.showV1726RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1726: receive level
internal fun PlayerActivity.showV1726ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1726: recipe level
internal fun PlayerActivity.showV1726RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1726recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1726recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1726: reform mode
internal fun PlayerActivity.showV1726ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1726reform
    FeaturePrefsStore.batch1721.v1726reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1726: region mode
internal fun PlayerActivity.showV1726RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1726region
    FeaturePrefsStore.batch1721.v1726region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1726: regret mode
internal fun PlayerActivity.showV1726RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1726regret
    FeaturePrefsStore.batch1721.v1726regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1726: relax mode
internal fun PlayerActivity.showV1726RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1726relax
    FeaturePrefsStore.batch1721.v1726relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1726: relief mode
internal fun PlayerActivity.showV1726ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1726relief
    FeaturePrefsStore.batch1721.v1726relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1727: rapid mode
internal fun PlayerActivity.showV1727RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rapid
    FeaturePrefsStore.batch1721.v1727rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1727: rare mode
internal fun PlayerActivity.showV1727RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rare
    FeaturePrefsStore.batch1721.v1727rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1727: rather mode
internal fun PlayerActivity.showV1727RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1727rather
    FeaturePrefsStore.batch1721.v1727rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1727: raven mode
internal fun PlayerActivity.showV1727RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1727raven
    FeaturePrefsStore.batch1721.v1727raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1727: razor mode
internal fun PlayerActivity.showV1727RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1727razor
    FeaturePrefsStore.batch1721.v1727razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1727: reason level
internal fun PlayerActivity.showV1727ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1727: rebel level
internal fun PlayerActivity.showV1727RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1727: recall level
internal fun PlayerActivity.showV1727RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1727: receive level
internal fun PlayerActivity.showV1727ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1727: recipe level
internal fun PlayerActivity.showV1727RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1727recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1727recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1727: reform mode
internal fun PlayerActivity.showV1727ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1727reform
    FeaturePrefsStore.batch1721.v1727reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1727: region mode
internal fun PlayerActivity.showV1727RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1727region
    FeaturePrefsStore.batch1721.v1727region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1727: regret mode
internal fun PlayerActivity.showV1727RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1727regret
    FeaturePrefsStore.batch1721.v1727regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1727: relax mode
internal fun PlayerActivity.showV1727RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1727relax
    FeaturePrefsStore.batch1721.v1727relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1727: relief mode
internal fun PlayerActivity.showV1727ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1727relief
    FeaturePrefsStore.batch1721.v1727relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1728: rapid mode
internal fun PlayerActivity.showV1728RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rapid
    FeaturePrefsStore.batch1721.v1728rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1728: rare mode
internal fun PlayerActivity.showV1728RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rare
    FeaturePrefsStore.batch1721.v1728rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1728: rather mode
internal fun PlayerActivity.showV1728RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1728rather
    FeaturePrefsStore.batch1721.v1728rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1728: raven mode
internal fun PlayerActivity.showV1728RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1728raven
    FeaturePrefsStore.batch1721.v1728raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1728: razor mode
internal fun PlayerActivity.showV1728RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1728razor
    FeaturePrefsStore.batch1721.v1728razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1728: reason level
internal fun PlayerActivity.showV1728ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1728: rebel level
internal fun PlayerActivity.showV1728RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1728: recall level
internal fun PlayerActivity.showV1728RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1728: receive level
internal fun PlayerActivity.showV1728ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1728: recipe level
internal fun PlayerActivity.showV1728RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1728recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1728recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1728: reform mode
internal fun PlayerActivity.showV1728ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1728reform
    FeaturePrefsStore.batch1721.v1728reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1728: region mode
internal fun PlayerActivity.showV1728RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1728region
    FeaturePrefsStore.batch1721.v1728region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1728: regret mode
internal fun PlayerActivity.showV1728RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1728regret
    FeaturePrefsStore.batch1721.v1728regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1728: relax mode
internal fun PlayerActivity.showV1728RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1728relax
    FeaturePrefsStore.batch1721.v1728relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1728: relief mode
internal fun PlayerActivity.showV1728ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1728relief
    FeaturePrefsStore.batch1721.v1728relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1729: rapid mode
internal fun PlayerActivity.showV1729RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rapid
    FeaturePrefsStore.batch1721.v1729rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1729: rare mode
internal fun PlayerActivity.showV1729RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rare
    FeaturePrefsStore.batch1721.v1729rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1729: rather mode
internal fun PlayerActivity.showV1729RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1729rather
    FeaturePrefsStore.batch1721.v1729rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1729: raven mode
internal fun PlayerActivity.showV1729RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1729raven
    FeaturePrefsStore.batch1721.v1729raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1729: razor mode
internal fun PlayerActivity.showV1729RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1729razor
    FeaturePrefsStore.batch1721.v1729razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1729: reason level
internal fun PlayerActivity.showV1729ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1729: rebel level
internal fun PlayerActivity.showV1729RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1729: recall level
internal fun PlayerActivity.showV1729RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1729: receive level
internal fun PlayerActivity.showV1729ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1729: recipe level
internal fun PlayerActivity.showV1729RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1729recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1729recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1729: reform mode
internal fun PlayerActivity.showV1729ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1729reform
    FeaturePrefsStore.batch1721.v1729reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1729: region mode
internal fun PlayerActivity.showV1729RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1729region
    FeaturePrefsStore.batch1721.v1729region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1729: regret mode
internal fun PlayerActivity.showV1729RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1729regret
    FeaturePrefsStore.batch1721.v1729regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1729: relax mode
internal fun PlayerActivity.showV1729RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1729relax
    FeaturePrefsStore.batch1721.v1729relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1729: relief mode
internal fun PlayerActivity.showV1729ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1729relief
    FeaturePrefsStore.batch1721.v1729relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1730: rapid mode
internal fun PlayerActivity.showV1730RapidToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rapid
    FeaturePrefsStore.batch1721.v1730rapid = !current
    AppToast.show(this, "rapid: ${if (!current) "ON" else "OFF"}")
}

// v1730: rare mode
internal fun PlayerActivity.showV1730RareToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rare
    FeaturePrefsStore.batch1721.v1730rare = !current
    AppToast.show(this, "rare: ${if (!current) "ON" else "OFF"}")
}

// v1730: rather mode
internal fun PlayerActivity.showV1730RatherToggle() {
    val current = FeaturePrefsStore.batch1721.v1730rather
    FeaturePrefsStore.batch1721.v1730rather = !current
    AppToast.show(this, "rather: ${if (!current) "ON" else "OFF"}")
}

// v1730: raven mode
internal fun PlayerActivity.showV1730RavenToggle() {
    val current = FeaturePrefsStore.batch1721.v1730raven
    FeaturePrefsStore.batch1721.v1730raven = !current
    AppToast.show(this, "raven: ${if (!current) "ON" else "OFF"}")
}

// v1730: razor mode
internal fun PlayerActivity.showV1730RazorToggle() {
    val current = FeaturePrefsStore.batch1721.v1730razor
    FeaturePrefsStore.batch1721.v1730razor = !current
    AppToast.show(this, "razor: ${if (!current) "ON" else "OFF"}")
}

// v1730: reason level
internal fun PlayerActivity.showV1730ReasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730reason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reason level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730reason = value
        AppToast.show(this, "reason: $value")
    }
}

// v1730: rebel level
internal fun PlayerActivity.showV1730RebelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730rebel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rebel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730rebel = value
        AppToast.show(this, "rebel: $value")
    }
}

// v1730: recall level
internal fun PlayerActivity.showV1730RecallDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730recall).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recall level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730recall = value
        AppToast.show(this, "recall: $value")
    }
}

// v1730: receive level
internal fun PlayerActivity.showV1730ReceiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730receive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "receive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730receive = value
        AppToast.show(this, "receive: $value")
    }
}

// v1730: recipe level
internal fun PlayerActivity.showV1730RecipeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1721.v1730recipe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recipe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1721.v1730recipe = value
        AppToast.show(this, "recipe: $value")
    }
}

// v1730: reform mode
internal fun PlayerActivity.showV1730ReformToggle() {
    val current = FeaturePrefsStore.batch1721.v1730reform
    FeaturePrefsStore.batch1721.v1730reform = !current
    AppToast.show(this, "reform: ${if (!current) "ON" else "OFF"}")
}

// v1730: region mode
internal fun PlayerActivity.showV1730RegionToggle() {
    val current = FeaturePrefsStore.batch1721.v1730region
    FeaturePrefsStore.batch1721.v1730region = !current
    AppToast.show(this, "region: ${if (!current) "ON" else "OFF"}")
}

// v1730: regret mode
internal fun PlayerActivity.showV1730RegretToggle() {
    val current = FeaturePrefsStore.batch1721.v1730regret
    FeaturePrefsStore.batch1721.v1730regret = !current
    AppToast.show(this, "regret: ${if (!current) "ON" else "OFF"}")
}

// v1730: relax mode
internal fun PlayerActivity.showV1730RelaxToggle() {
    val current = FeaturePrefsStore.batch1721.v1730relax
    FeaturePrefsStore.batch1721.v1730relax = !current
    AppToast.show(this, "relax: ${if (!current) "ON" else "OFF"}")
}

// v1730: relief mode
internal fun PlayerActivity.showV1730ReliefToggle() {
    val current = FeaturePrefsStore.batch1721.v1730relief
    FeaturePrefsStore.batch1721.v1730relief = !current
    AppToast.show(this, "relief: ${if (!current) "ON" else "OFF"}")
}

// v1731: rely mode
internal fun PlayerActivity.showV1731RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1731rely
    FeaturePrefsStore.batch1731.v1731rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1731: remain mode
internal fun PlayerActivity.showV1731RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remain
    FeaturePrefsStore.batch1731.v1731remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1731: remedy mode
internal fun PlayerActivity.showV1731RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remedy
    FeaturePrefsStore.batch1731.v1731remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1731: remind mode
internal fun PlayerActivity.showV1731RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remind
    FeaturePrefsStore.batch1731.v1731remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1731: renew mode
internal fun PlayerActivity.showV1731RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1731renew
    FeaturePrefsStore.batch1731.v1731renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1731: rent level
internal fun PlayerActivity.showV1731RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1731: reopen level
internal fun PlayerActivity.showV1731ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1731: repair level
internal fun PlayerActivity.showV1731RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1731: rescue level
internal fun PlayerActivity.showV1731RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1731: resist level
internal fun PlayerActivity.showV1731ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1731: retire mode
internal fun PlayerActivity.showV1731RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1731retire
    FeaturePrefsStore.batch1731.v1731retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1731: retreat mode
internal fun PlayerActivity.showV1731RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1731retreat
    FeaturePrefsStore.batch1731.v1731retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1731: reunion mode
internal fun PlayerActivity.showV1731ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1731reunion
    FeaturePrefsStore.batch1731.v1731reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1731: reveal mode
internal fun PlayerActivity.showV1731RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1731reveal
    FeaturePrefsStore.batch1731.v1731reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1731: review mode
internal fun PlayerActivity.showV1731ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1731review
    FeaturePrefsStore.batch1731.v1731review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1732: rely mode
internal fun PlayerActivity.showV1732RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1732rely
    FeaturePrefsStore.batch1731.v1732rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1732: remain mode
internal fun PlayerActivity.showV1732RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remain
    FeaturePrefsStore.batch1731.v1732remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1732: remedy mode
internal fun PlayerActivity.showV1732RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remedy
    FeaturePrefsStore.batch1731.v1732remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1732: remind mode
internal fun PlayerActivity.showV1732RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remind
    FeaturePrefsStore.batch1731.v1732remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1732: renew mode
internal fun PlayerActivity.showV1732RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1732renew
    FeaturePrefsStore.batch1731.v1732renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1732: rent level
internal fun PlayerActivity.showV1732RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1732: reopen level
internal fun PlayerActivity.showV1732ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1732: repair level
internal fun PlayerActivity.showV1732RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1732: rescue level
internal fun PlayerActivity.showV1732RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1732: resist level
internal fun PlayerActivity.showV1732ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1732: retire mode
internal fun PlayerActivity.showV1732RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1732retire
    FeaturePrefsStore.batch1731.v1732retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1732: retreat mode
internal fun PlayerActivity.showV1732RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1732retreat
    FeaturePrefsStore.batch1731.v1732retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1732: reunion mode
internal fun PlayerActivity.showV1732ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1732reunion
    FeaturePrefsStore.batch1731.v1732reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1732: reveal mode
internal fun PlayerActivity.showV1732RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1732reveal
    FeaturePrefsStore.batch1731.v1732reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1732: review mode
internal fun PlayerActivity.showV1732ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1732review
    FeaturePrefsStore.batch1731.v1732review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1733: rely mode
internal fun PlayerActivity.showV1733RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1733rely
    FeaturePrefsStore.batch1731.v1733rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1733: remain mode
internal fun PlayerActivity.showV1733RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remain
    FeaturePrefsStore.batch1731.v1733remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1733: remedy mode
internal fun PlayerActivity.showV1733RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remedy
    FeaturePrefsStore.batch1731.v1733remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1733: remind mode
internal fun PlayerActivity.showV1733RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remind
    FeaturePrefsStore.batch1731.v1733remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1733: renew mode
internal fun PlayerActivity.showV1733RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1733renew
    FeaturePrefsStore.batch1731.v1733renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1733: rent level
internal fun PlayerActivity.showV1733RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1733: reopen level
internal fun PlayerActivity.showV1733ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1733: repair level
internal fun PlayerActivity.showV1733RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1733: rescue level
internal fun PlayerActivity.showV1733RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1733: resist level
internal fun PlayerActivity.showV1733ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1733: retire mode
internal fun PlayerActivity.showV1733RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1733retire
    FeaturePrefsStore.batch1731.v1733retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1733: retreat mode
internal fun PlayerActivity.showV1733RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1733retreat
    FeaturePrefsStore.batch1731.v1733retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1733: reunion mode
internal fun PlayerActivity.showV1733ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1733reunion
    FeaturePrefsStore.batch1731.v1733reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1733: reveal mode
internal fun PlayerActivity.showV1733RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1733reveal
    FeaturePrefsStore.batch1731.v1733reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1733: review mode
internal fun PlayerActivity.showV1733ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1733review
    FeaturePrefsStore.batch1731.v1733review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1734: rely mode
internal fun PlayerActivity.showV1734RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1734rely
    FeaturePrefsStore.batch1731.v1734rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1734: remain mode
internal fun PlayerActivity.showV1734RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remain
    FeaturePrefsStore.batch1731.v1734remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1734: remedy mode
internal fun PlayerActivity.showV1734RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remedy
    FeaturePrefsStore.batch1731.v1734remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1734: remind mode
internal fun PlayerActivity.showV1734RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remind
    FeaturePrefsStore.batch1731.v1734remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1734: renew mode
internal fun PlayerActivity.showV1734RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1734renew
    FeaturePrefsStore.batch1731.v1734renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1734: rent level
internal fun PlayerActivity.showV1734RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1734: reopen level
internal fun PlayerActivity.showV1734ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1734: repair level
internal fun PlayerActivity.showV1734RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1734: rescue level
internal fun PlayerActivity.showV1734RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1734: resist level
internal fun PlayerActivity.showV1734ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1734: retire mode
internal fun PlayerActivity.showV1734RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1734retire
    FeaturePrefsStore.batch1731.v1734retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1734: retreat mode
internal fun PlayerActivity.showV1734RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1734retreat
    FeaturePrefsStore.batch1731.v1734retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1734: reunion mode
internal fun PlayerActivity.showV1734ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1734reunion
    FeaturePrefsStore.batch1731.v1734reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1734: reveal mode
internal fun PlayerActivity.showV1734RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1734reveal
    FeaturePrefsStore.batch1731.v1734reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1734: review mode
internal fun PlayerActivity.showV1734ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1734review
    FeaturePrefsStore.batch1731.v1734review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1735: rely mode
internal fun PlayerActivity.showV1735RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1735rely
    FeaturePrefsStore.batch1731.v1735rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1735: remain mode
internal fun PlayerActivity.showV1735RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remain
    FeaturePrefsStore.batch1731.v1735remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1735: remedy mode
internal fun PlayerActivity.showV1735RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remedy
    FeaturePrefsStore.batch1731.v1735remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1735: remind mode
internal fun PlayerActivity.showV1735RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remind
    FeaturePrefsStore.batch1731.v1735remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1735: renew mode
internal fun PlayerActivity.showV1735RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1735renew
    FeaturePrefsStore.batch1731.v1735renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1735: rent level
internal fun PlayerActivity.showV1735RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1735: reopen level
internal fun PlayerActivity.showV1735ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1735: repair level
internal fun PlayerActivity.showV1735RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1735: rescue level
internal fun PlayerActivity.showV1735RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1735: resist level
internal fun PlayerActivity.showV1735ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1735: retire mode
internal fun PlayerActivity.showV1735RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1735retire
    FeaturePrefsStore.batch1731.v1735retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1735: retreat mode
internal fun PlayerActivity.showV1735RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1735retreat
    FeaturePrefsStore.batch1731.v1735retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1735: reunion mode
internal fun PlayerActivity.showV1735ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1735reunion
    FeaturePrefsStore.batch1731.v1735reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1735: reveal mode
internal fun PlayerActivity.showV1735RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1735reveal
    FeaturePrefsStore.batch1731.v1735reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1735: review mode
internal fun PlayerActivity.showV1735ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1735review
    FeaturePrefsStore.batch1731.v1735review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1736: rely mode
internal fun PlayerActivity.showV1736RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1736rely
    FeaturePrefsStore.batch1731.v1736rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1736: remain mode
internal fun PlayerActivity.showV1736RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remain
    FeaturePrefsStore.batch1731.v1736remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1736: remedy mode
internal fun PlayerActivity.showV1736RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remedy
    FeaturePrefsStore.batch1731.v1736remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1736: remind mode
internal fun PlayerActivity.showV1736RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remind
    FeaturePrefsStore.batch1731.v1736remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1736: renew mode
internal fun PlayerActivity.showV1736RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1736renew
    FeaturePrefsStore.batch1731.v1736renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1736: rent level
internal fun PlayerActivity.showV1736RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1736: reopen level
internal fun PlayerActivity.showV1736ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1736: repair level
internal fun PlayerActivity.showV1736RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1736: rescue level
internal fun PlayerActivity.showV1736RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1736: resist level
internal fun PlayerActivity.showV1736ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1736: retire mode
internal fun PlayerActivity.showV1736RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1736retire
    FeaturePrefsStore.batch1731.v1736retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1736: retreat mode
internal fun PlayerActivity.showV1736RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1736retreat
    FeaturePrefsStore.batch1731.v1736retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1736: reunion mode
internal fun PlayerActivity.showV1736ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1736reunion
    FeaturePrefsStore.batch1731.v1736reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1736: reveal mode
internal fun PlayerActivity.showV1736RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1736reveal
    FeaturePrefsStore.batch1731.v1736reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1736: review mode
internal fun PlayerActivity.showV1736ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1736review
    FeaturePrefsStore.batch1731.v1736review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1737: rely mode
internal fun PlayerActivity.showV1737RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1737rely
    FeaturePrefsStore.batch1731.v1737rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1737: remain mode
internal fun PlayerActivity.showV1737RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remain
    FeaturePrefsStore.batch1731.v1737remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1737: remedy mode
internal fun PlayerActivity.showV1737RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remedy
    FeaturePrefsStore.batch1731.v1737remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1737: remind mode
internal fun PlayerActivity.showV1737RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remind
    FeaturePrefsStore.batch1731.v1737remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1737: renew mode
internal fun PlayerActivity.showV1737RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1737renew
    FeaturePrefsStore.batch1731.v1737renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1737: rent level
internal fun PlayerActivity.showV1737RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1737: reopen level
internal fun PlayerActivity.showV1737ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1737: repair level
internal fun PlayerActivity.showV1737RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1737: rescue level
internal fun PlayerActivity.showV1737RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1737: resist level
internal fun PlayerActivity.showV1737ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1737: retire mode
internal fun PlayerActivity.showV1737RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1737retire
    FeaturePrefsStore.batch1731.v1737retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1737: retreat mode
internal fun PlayerActivity.showV1737RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1737retreat
    FeaturePrefsStore.batch1731.v1737retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1737: reunion mode
internal fun PlayerActivity.showV1737ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1737reunion
    FeaturePrefsStore.batch1731.v1737reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1737: reveal mode
internal fun PlayerActivity.showV1737RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1737reveal
    FeaturePrefsStore.batch1731.v1737reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1737: review mode
internal fun PlayerActivity.showV1737ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1737review
    FeaturePrefsStore.batch1731.v1737review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1738: rely mode
internal fun PlayerActivity.showV1738RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1738rely
    FeaturePrefsStore.batch1731.v1738rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1738: remain mode
internal fun PlayerActivity.showV1738RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remain
    FeaturePrefsStore.batch1731.v1738remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1738: remedy mode
internal fun PlayerActivity.showV1738RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remedy
    FeaturePrefsStore.batch1731.v1738remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1738: remind mode
internal fun PlayerActivity.showV1738RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remind
    FeaturePrefsStore.batch1731.v1738remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1738: renew mode
internal fun PlayerActivity.showV1738RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1738renew
    FeaturePrefsStore.batch1731.v1738renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1738: rent level
internal fun PlayerActivity.showV1738RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1738: reopen level
internal fun PlayerActivity.showV1738ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1738: repair level
internal fun PlayerActivity.showV1738RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1738: rescue level
internal fun PlayerActivity.showV1738RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1738: resist level
internal fun PlayerActivity.showV1738ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1738: retire mode
internal fun PlayerActivity.showV1738RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1738retire
    FeaturePrefsStore.batch1731.v1738retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1738: retreat mode
internal fun PlayerActivity.showV1738RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1738retreat
    FeaturePrefsStore.batch1731.v1738retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1738: reunion mode
internal fun PlayerActivity.showV1738ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1738reunion
    FeaturePrefsStore.batch1731.v1738reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1738: reveal mode
internal fun PlayerActivity.showV1738RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1738reveal
    FeaturePrefsStore.batch1731.v1738reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1738: review mode
internal fun PlayerActivity.showV1738ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1738review
    FeaturePrefsStore.batch1731.v1738review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1739: rely mode
internal fun PlayerActivity.showV1739RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1739rely
    FeaturePrefsStore.batch1731.v1739rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1739: remain mode
internal fun PlayerActivity.showV1739RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remain
    FeaturePrefsStore.batch1731.v1739remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1739: remedy mode
internal fun PlayerActivity.showV1739RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remedy
    FeaturePrefsStore.batch1731.v1739remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1739: remind mode
internal fun PlayerActivity.showV1739RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remind
    FeaturePrefsStore.batch1731.v1739remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1739: renew mode
internal fun PlayerActivity.showV1739RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1739renew
    FeaturePrefsStore.batch1731.v1739renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1739: rent level
internal fun PlayerActivity.showV1739RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1739: reopen level
internal fun PlayerActivity.showV1739ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1739: repair level
internal fun PlayerActivity.showV1739RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1739: rescue level
internal fun PlayerActivity.showV1739RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1739: resist level
internal fun PlayerActivity.showV1739ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1739: retire mode
internal fun PlayerActivity.showV1739RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1739retire
    FeaturePrefsStore.batch1731.v1739retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1739: retreat mode
internal fun PlayerActivity.showV1739RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1739retreat
    FeaturePrefsStore.batch1731.v1739retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1739: reunion mode
internal fun PlayerActivity.showV1739ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1739reunion
    FeaturePrefsStore.batch1731.v1739reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1739: reveal mode
internal fun PlayerActivity.showV1739RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1739reveal
    FeaturePrefsStore.batch1731.v1739reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1739: review mode
internal fun PlayerActivity.showV1739ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1739review
    FeaturePrefsStore.batch1731.v1739review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1740: rely mode
internal fun PlayerActivity.showV1740RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1740rely
    FeaturePrefsStore.batch1731.v1740rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1740: remain mode
internal fun PlayerActivity.showV1740RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remain
    FeaturePrefsStore.batch1731.v1740remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1740: remedy mode
internal fun PlayerActivity.showV1740RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remedy
    FeaturePrefsStore.batch1731.v1740remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1740: remind mode
internal fun PlayerActivity.showV1740RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remind
    FeaturePrefsStore.batch1731.v1740remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1740: renew mode
internal fun PlayerActivity.showV1740RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1740renew
    FeaturePrefsStore.batch1731.v1740renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1740: rent level
internal fun PlayerActivity.showV1740RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1740: reopen level
internal fun PlayerActivity.showV1740ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1740: repair level
internal fun PlayerActivity.showV1740RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1740: rescue level
internal fun PlayerActivity.showV1740RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1740: resist level
internal fun PlayerActivity.showV1740ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1740: retire mode
internal fun PlayerActivity.showV1740RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1740retire
    FeaturePrefsStore.batch1731.v1740retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1740: retreat mode
internal fun PlayerActivity.showV1740RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1740retreat
    FeaturePrefsStore.batch1731.v1740retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1740: reunion mode
internal fun PlayerActivity.showV1740ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1740reunion
    FeaturePrefsStore.batch1731.v1740reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1740: reveal mode
internal fun PlayerActivity.showV1740RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1740reveal
    FeaturePrefsStore.batch1731.v1740reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1740: review mode
internal fun PlayerActivity.showV1740ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1740review
    FeaturePrefsStore.batch1731.v1740review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1741: reward mode
internal fun PlayerActivity.showV1741RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1741reward
    FeaturePrefsStore.batch1741.v1741reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1741: rhythm mode
internal fun PlayerActivity.showV1741RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rhythm
    FeaturePrefsStore.batch1741.v1741rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1741: rib mode
internal fun PlayerActivity.showV1741RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rib
    FeaturePrefsStore.batch1741.v1741rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1741: ribbon mode
internal fun PlayerActivity.showV1741RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ribbon
    FeaturePrefsStore.batch1741.v1741ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1741: rice mode
internal fun PlayerActivity.showV1741RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1741rice
    FeaturePrefsStore.batch1741.v1741rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1741: rich level
internal fun PlayerActivity.showV1741RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1741: ride level
internal fun PlayerActivity.showV1741RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1741: ridge level
internal fun PlayerActivity.showV1741RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1741: rifle level
internal fun PlayerActivity.showV1741RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1741: rigid level
internal fun PlayerActivity.showV1741RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1741rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1741rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1741: ring mode
internal fun PlayerActivity.showV1741RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ring
    FeaturePrefsStore.batch1741.v1741ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1741: riot mode
internal fun PlayerActivity.showV1741RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1741riot
    FeaturePrefsStore.batch1741.v1741riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1741: ripple mode
internal fun PlayerActivity.showV1741RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ripple
    FeaturePrefsStore.batch1741.v1741ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1741: risk mode
internal fun PlayerActivity.showV1741RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1741risk
    FeaturePrefsStore.batch1741.v1741risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1741: ritual mode
internal fun PlayerActivity.showV1741RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1741ritual
    FeaturePrefsStore.batch1741.v1741ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1742: reward mode
internal fun PlayerActivity.showV1742RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1742reward
    FeaturePrefsStore.batch1741.v1742reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1742: rhythm mode
internal fun PlayerActivity.showV1742RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rhythm
    FeaturePrefsStore.batch1741.v1742rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1742: rib mode
internal fun PlayerActivity.showV1742RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rib
    FeaturePrefsStore.batch1741.v1742rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1742: ribbon mode
internal fun PlayerActivity.showV1742RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ribbon
    FeaturePrefsStore.batch1741.v1742ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1742: rice mode
internal fun PlayerActivity.showV1742RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1742rice
    FeaturePrefsStore.batch1741.v1742rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1742: rich level
internal fun PlayerActivity.showV1742RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1742: ride level
internal fun PlayerActivity.showV1742RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1742: ridge level
internal fun PlayerActivity.showV1742RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1742: rifle level
internal fun PlayerActivity.showV1742RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1742: rigid level
internal fun PlayerActivity.showV1742RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1742rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1742rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1742: ring mode
internal fun PlayerActivity.showV1742RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ring
    FeaturePrefsStore.batch1741.v1742ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1742: riot mode
internal fun PlayerActivity.showV1742RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1742riot
    FeaturePrefsStore.batch1741.v1742riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1742: ripple mode
internal fun PlayerActivity.showV1742RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ripple
    FeaturePrefsStore.batch1741.v1742ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1742: risk mode
internal fun PlayerActivity.showV1742RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1742risk
    FeaturePrefsStore.batch1741.v1742risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1742: ritual mode
internal fun PlayerActivity.showV1742RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1742ritual
    FeaturePrefsStore.batch1741.v1742ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1743: reward mode
internal fun PlayerActivity.showV1743RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1743reward
    FeaturePrefsStore.batch1741.v1743reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1743: rhythm mode
internal fun PlayerActivity.showV1743RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rhythm
    FeaturePrefsStore.batch1741.v1743rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1743: rib mode
internal fun PlayerActivity.showV1743RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rib
    FeaturePrefsStore.batch1741.v1743rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1743: ribbon mode
internal fun PlayerActivity.showV1743RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ribbon
    FeaturePrefsStore.batch1741.v1743ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1743: rice mode
internal fun PlayerActivity.showV1743RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1743rice
    FeaturePrefsStore.batch1741.v1743rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1743: rich level
internal fun PlayerActivity.showV1743RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1743: ride level
internal fun PlayerActivity.showV1743RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1743: ridge level
internal fun PlayerActivity.showV1743RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1743: rifle level
internal fun PlayerActivity.showV1743RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1743: rigid level
internal fun PlayerActivity.showV1743RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1743rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1743rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1743: ring mode
internal fun PlayerActivity.showV1743RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ring
    FeaturePrefsStore.batch1741.v1743ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1743: riot mode
internal fun PlayerActivity.showV1743RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1743riot
    FeaturePrefsStore.batch1741.v1743riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1743: ripple mode
internal fun PlayerActivity.showV1743RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ripple
    FeaturePrefsStore.batch1741.v1743ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1743: risk mode
internal fun PlayerActivity.showV1743RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1743risk
    FeaturePrefsStore.batch1741.v1743risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1743: ritual mode
internal fun PlayerActivity.showV1743RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1743ritual
    FeaturePrefsStore.batch1741.v1743ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1744: reward mode
internal fun PlayerActivity.showV1744RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1744reward
    FeaturePrefsStore.batch1741.v1744reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1744: rhythm mode
internal fun PlayerActivity.showV1744RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rhythm
    FeaturePrefsStore.batch1741.v1744rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1744: rib mode
internal fun PlayerActivity.showV1744RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rib
    FeaturePrefsStore.batch1741.v1744rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1744: ribbon mode
internal fun PlayerActivity.showV1744RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ribbon
    FeaturePrefsStore.batch1741.v1744ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1744: rice mode
internal fun PlayerActivity.showV1744RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1744rice
    FeaturePrefsStore.batch1741.v1744rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1744: rich level
internal fun PlayerActivity.showV1744RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1744: ride level
internal fun PlayerActivity.showV1744RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1744: ridge level
internal fun PlayerActivity.showV1744RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1744: rifle level
internal fun PlayerActivity.showV1744RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1744: rigid level
internal fun PlayerActivity.showV1744RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1744rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1744rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1744: ring mode
internal fun PlayerActivity.showV1744RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ring
    FeaturePrefsStore.batch1741.v1744ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1744: riot mode
internal fun PlayerActivity.showV1744RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1744riot
    FeaturePrefsStore.batch1741.v1744riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1744: ripple mode
internal fun PlayerActivity.showV1744RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ripple
    FeaturePrefsStore.batch1741.v1744ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1744: risk mode
internal fun PlayerActivity.showV1744RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1744risk
    FeaturePrefsStore.batch1741.v1744risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1744: ritual mode
internal fun PlayerActivity.showV1744RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1744ritual
    FeaturePrefsStore.batch1741.v1744ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1745: reward mode
internal fun PlayerActivity.showV1745RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1745reward
    FeaturePrefsStore.batch1741.v1745reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1745: rhythm mode
internal fun PlayerActivity.showV1745RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rhythm
    FeaturePrefsStore.batch1741.v1745rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1745: rib mode
internal fun PlayerActivity.showV1745RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rib
    FeaturePrefsStore.batch1741.v1745rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1745: ribbon mode
internal fun PlayerActivity.showV1745RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ribbon
    FeaturePrefsStore.batch1741.v1745ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1745: rice mode
internal fun PlayerActivity.showV1745RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1745rice
    FeaturePrefsStore.batch1741.v1745rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1745: rich level
internal fun PlayerActivity.showV1745RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1745: ride level
internal fun PlayerActivity.showV1745RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1745: ridge level
internal fun PlayerActivity.showV1745RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1745: rifle level
internal fun PlayerActivity.showV1745RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1745: rigid level
internal fun PlayerActivity.showV1745RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1745rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1745rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1745: ring mode
internal fun PlayerActivity.showV1745RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ring
    FeaturePrefsStore.batch1741.v1745ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1745: riot mode
internal fun PlayerActivity.showV1745RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1745riot
    FeaturePrefsStore.batch1741.v1745riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1745: ripple mode
internal fun PlayerActivity.showV1745RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ripple
    FeaturePrefsStore.batch1741.v1745ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1745: risk mode
internal fun PlayerActivity.showV1745RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1745risk
    FeaturePrefsStore.batch1741.v1745risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1745: ritual mode
internal fun PlayerActivity.showV1745RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1745ritual
    FeaturePrefsStore.batch1741.v1745ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1746: reward mode
internal fun PlayerActivity.showV1746RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1746reward
    FeaturePrefsStore.batch1741.v1746reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1746: rhythm mode
internal fun PlayerActivity.showV1746RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rhythm
    FeaturePrefsStore.batch1741.v1746rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1746: rib mode
internal fun PlayerActivity.showV1746RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rib
    FeaturePrefsStore.batch1741.v1746rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1746: ribbon mode
internal fun PlayerActivity.showV1746RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ribbon
    FeaturePrefsStore.batch1741.v1746ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1746: rice mode
internal fun PlayerActivity.showV1746RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1746rice
    FeaturePrefsStore.batch1741.v1746rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1746: rich level
internal fun PlayerActivity.showV1746RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1746: ride level
internal fun PlayerActivity.showV1746RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1746: ridge level
internal fun PlayerActivity.showV1746RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1746: rifle level
internal fun PlayerActivity.showV1746RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1746: rigid level
internal fun PlayerActivity.showV1746RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1746rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1746rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1746: ring mode
internal fun PlayerActivity.showV1746RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ring
    FeaturePrefsStore.batch1741.v1746ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1746: riot mode
internal fun PlayerActivity.showV1746RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1746riot
    FeaturePrefsStore.batch1741.v1746riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1746: ripple mode
internal fun PlayerActivity.showV1746RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ripple
    FeaturePrefsStore.batch1741.v1746ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1746: risk mode
internal fun PlayerActivity.showV1746RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1746risk
    FeaturePrefsStore.batch1741.v1746risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1746: ritual mode
internal fun PlayerActivity.showV1746RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1746ritual
    FeaturePrefsStore.batch1741.v1746ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1747: reward mode
internal fun PlayerActivity.showV1747RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1747reward
    FeaturePrefsStore.batch1741.v1747reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1747: rhythm mode
internal fun PlayerActivity.showV1747RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rhythm
    FeaturePrefsStore.batch1741.v1747rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1747: rib mode
internal fun PlayerActivity.showV1747RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rib
    FeaturePrefsStore.batch1741.v1747rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1747: ribbon mode
internal fun PlayerActivity.showV1747RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ribbon
    FeaturePrefsStore.batch1741.v1747ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1747: rice mode
internal fun PlayerActivity.showV1747RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1747rice
    FeaturePrefsStore.batch1741.v1747rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1747: rich level
internal fun PlayerActivity.showV1747RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1747: ride level
internal fun PlayerActivity.showV1747RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1747: ridge level
internal fun PlayerActivity.showV1747RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1747: rifle level
internal fun PlayerActivity.showV1747RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1747: rigid level
internal fun PlayerActivity.showV1747RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1747rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1747rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1747: ring mode
internal fun PlayerActivity.showV1747RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ring
    FeaturePrefsStore.batch1741.v1747ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1747: riot mode
internal fun PlayerActivity.showV1747RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1747riot
    FeaturePrefsStore.batch1741.v1747riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1747: ripple mode
internal fun PlayerActivity.showV1747RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ripple
    FeaturePrefsStore.batch1741.v1747ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1747: risk mode
internal fun PlayerActivity.showV1747RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1747risk
    FeaturePrefsStore.batch1741.v1747risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1747: ritual mode
internal fun PlayerActivity.showV1747RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1747ritual
    FeaturePrefsStore.batch1741.v1747ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1748: reward mode
internal fun PlayerActivity.showV1748RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1748reward
    FeaturePrefsStore.batch1741.v1748reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1748: rhythm mode
internal fun PlayerActivity.showV1748RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rhythm
    FeaturePrefsStore.batch1741.v1748rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1748: rib mode
internal fun PlayerActivity.showV1748RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rib
    FeaturePrefsStore.batch1741.v1748rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1748: ribbon mode
internal fun PlayerActivity.showV1748RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ribbon
    FeaturePrefsStore.batch1741.v1748ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1748: rice mode
internal fun PlayerActivity.showV1748RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1748rice
    FeaturePrefsStore.batch1741.v1748rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1748: rich level
internal fun PlayerActivity.showV1748RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1748: ride level
internal fun PlayerActivity.showV1748RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1748: ridge level
internal fun PlayerActivity.showV1748RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1748: rifle level
internal fun PlayerActivity.showV1748RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1748: rigid level
internal fun PlayerActivity.showV1748RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1748rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1748rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1748: ring mode
internal fun PlayerActivity.showV1748RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ring
    FeaturePrefsStore.batch1741.v1748ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1748: riot mode
internal fun PlayerActivity.showV1748RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1748riot
    FeaturePrefsStore.batch1741.v1748riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1748: ripple mode
internal fun PlayerActivity.showV1748RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ripple
    FeaturePrefsStore.batch1741.v1748ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1748: risk mode
internal fun PlayerActivity.showV1748RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1748risk
    FeaturePrefsStore.batch1741.v1748risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1748: ritual mode
internal fun PlayerActivity.showV1748RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1748ritual
    FeaturePrefsStore.batch1741.v1748ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1749: reward mode
internal fun PlayerActivity.showV1749RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1749reward
    FeaturePrefsStore.batch1741.v1749reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1749: rhythm mode
internal fun PlayerActivity.showV1749RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rhythm
    FeaturePrefsStore.batch1741.v1749rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1749: rib mode
internal fun PlayerActivity.showV1749RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rib
    FeaturePrefsStore.batch1741.v1749rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1749: ribbon mode
internal fun PlayerActivity.showV1749RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ribbon
    FeaturePrefsStore.batch1741.v1749ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1749: rice mode
internal fun PlayerActivity.showV1749RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1749rice
    FeaturePrefsStore.batch1741.v1749rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1749: rich level
internal fun PlayerActivity.showV1749RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1749: ride level
internal fun PlayerActivity.showV1749RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1749: ridge level
internal fun PlayerActivity.showV1749RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1749: rifle level
internal fun PlayerActivity.showV1749RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1749: rigid level
internal fun PlayerActivity.showV1749RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1749rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1749rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1749: ring mode
internal fun PlayerActivity.showV1749RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ring
    FeaturePrefsStore.batch1741.v1749ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1749: riot mode
internal fun PlayerActivity.showV1749RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1749riot
    FeaturePrefsStore.batch1741.v1749riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1749: ripple mode
internal fun PlayerActivity.showV1749RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ripple
    FeaturePrefsStore.batch1741.v1749ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1749: risk mode
internal fun PlayerActivity.showV1749RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1749risk
    FeaturePrefsStore.batch1741.v1749risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1749: ritual mode
internal fun PlayerActivity.showV1749RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1749ritual
    FeaturePrefsStore.batch1741.v1749ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}

// v1750: reward mode
internal fun PlayerActivity.showV1750RewardToggle() {
    val current = FeaturePrefsStore.batch1741.v1750reward
    FeaturePrefsStore.batch1741.v1750reward = !current
    AppToast.show(this, "reward: ${if (!current) "ON" else "OFF"}")
}

// v1750: rhythm mode
internal fun PlayerActivity.showV1750RhythmToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rhythm
    FeaturePrefsStore.batch1741.v1750rhythm = !current
    AppToast.show(this, "rhythm: ${if (!current) "ON" else "OFF"}")
}

// v1750: rib mode
internal fun PlayerActivity.showV1750RibToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rib
    FeaturePrefsStore.batch1741.v1750rib = !current
    AppToast.show(this, "rib: ${if (!current) "ON" else "OFF"}")
}

// v1750: ribbon mode
internal fun PlayerActivity.showV1750RibbonToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ribbon
    FeaturePrefsStore.batch1741.v1750ribbon = !current
    AppToast.show(this, "ribbon: ${if (!current) "ON" else "OFF"}")
}

// v1750: rice mode
internal fun PlayerActivity.showV1750RiceToggle() {
    val current = FeaturePrefsStore.batch1741.v1750rice
    FeaturePrefsStore.batch1741.v1750rice = !current
    AppToast.show(this, "rice: ${if (!current) "ON" else "OFF"}")
}

// v1750: rich level
internal fun PlayerActivity.showV1750RichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rich = value
        AppToast.show(this, "rich: $value")
    }
}

// v1750: ride level
internal fun PlayerActivity.showV1750RideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750ride).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ride level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750ride = value
        AppToast.show(this, "ride: $value")
    }
}

// v1750: ridge level
internal fun PlayerActivity.showV1750RidgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750ridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750ridge = value
        AppToast.show(this, "ridge: $value")
    }
}

// v1750: rifle level
internal fun PlayerActivity.showV1750RifleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rifle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rifle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rifle = value
        AppToast.show(this, "rifle: $value")
    }
}

// v1750: rigid level
internal fun PlayerActivity.showV1750RigidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1741.v1750rigid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rigid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1741.v1750rigid = value
        AppToast.show(this, "rigid: $value")
    }
}

// v1750: ring mode
internal fun PlayerActivity.showV1750RingToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ring
    FeaturePrefsStore.batch1741.v1750ring = !current
    AppToast.show(this, "ring: ${if (!current) "ON" else "OFF"}")
}

// v1750: riot mode
internal fun PlayerActivity.showV1750RiotToggle() {
    val current = FeaturePrefsStore.batch1741.v1750riot
    FeaturePrefsStore.batch1741.v1750riot = !current
    AppToast.show(this, "riot: ${if (!current) "ON" else "OFF"}")
}

// v1750: ripple mode
internal fun PlayerActivity.showV1750RippleToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ripple
    FeaturePrefsStore.batch1741.v1750ripple = !current
    AppToast.show(this, "ripple: ${if (!current) "ON" else "OFF"}")
}

// v1750: risk mode
internal fun PlayerActivity.showV1750RiskToggle() {
    val current = FeaturePrefsStore.batch1741.v1750risk
    FeaturePrefsStore.batch1741.v1750risk = !current
    AppToast.show(this, "risk: ${if (!current) "ON" else "OFF"}")
}

// v1750: ritual mode
internal fun PlayerActivity.showV1750RitualToggle() {
    val current = FeaturePrefsStore.batch1741.v1750ritual
    FeaturePrefsStore.batch1741.v1750ritual = !current
    AppToast.show(this, "ritual: ${if (!current) "ON" else "OFF"}")
}
