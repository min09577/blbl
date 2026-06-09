package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1401: duck mode
internal fun PlayerActivity.showV1401DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1401duck
    FeaturePrefsStore.batch1401.v1401duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1401: dumb mode
internal fun PlayerActivity.showV1401DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dumb
    FeaturePrefsStore.batch1401.v1401dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1401: dune mode
internal fun PlayerActivity.showV1401DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dune
    FeaturePrefsStore.batch1401.v1401dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1401: dust mode
internal fun PlayerActivity.showV1401DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1401dust
    FeaturePrefsStore.batch1401.v1401dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1401: duty mode
internal fun PlayerActivity.showV1401DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1401duty
    FeaturePrefsStore.batch1401.v1401duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1401: eager level
internal fun PlayerActivity.showV1401EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1401: ear level
internal fun PlayerActivity.showV1401EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1401: early level
internal fun PlayerActivity.showV1401EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401early = value
        AppToast.show(this, "early: $value")
    }
}

// v1401: earn level
internal fun PlayerActivity.showV1401EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1401: earth level
internal fun PlayerActivity.showV1401EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1401earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1401earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1401: ease mode
internal fun PlayerActivity.showV1401EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1401ease
    FeaturePrefsStore.batch1401.v1401ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1401: east mode
internal fun PlayerActivity.showV1401EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1401east
    FeaturePrefsStore.batch1401.v1401east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1401: easy mode
internal fun PlayerActivity.showV1401EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1401easy
    FeaturePrefsStore.batch1401.v1401easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1401: eclipse mode
internal fun PlayerActivity.showV1401EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1401eclipse
    FeaturePrefsStore.batch1401.v1401eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1401: educate mode
internal fun PlayerActivity.showV1401EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1401educate
    FeaturePrefsStore.batch1401.v1401educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1402: duck mode
internal fun PlayerActivity.showV1402DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1402duck
    FeaturePrefsStore.batch1401.v1402duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1402: dumb mode
internal fun PlayerActivity.showV1402DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dumb
    FeaturePrefsStore.batch1401.v1402dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1402: dune mode
internal fun PlayerActivity.showV1402DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dune
    FeaturePrefsStore.batch1401.v1402dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1402: dust mode
internal fun PlayerActivity.showV1402DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1402dust
    FeaturePrefsStore.batch1401.v1402dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1402: duty mode
internal fun PlayerActivity.showV1402DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1402duty
    FeaturePrefsStore.batch1401.v1402duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1402: eager level
internal fun PlayerActivity.showV1402EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1402: ear level
internal fun PlayerActivity.showV1402EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1402: early level
internal fun PlayerActivity.showV1402EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402early = value
        AppToast.show(this, "early: $value")
    }
}

// v1402: earn level
internal fun PlayerActivity.showV1402EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1402: earth level
internal fun PlayerActivity.showV1402EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1402earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1402earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1402: ease mode
internal fun PlayerActivity.showV1402EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1402ease
    FeaturePrefsStore.batch1401.v1402ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1402: east mode
internal fun PlayerActivity.showV1402EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1402east
    FeaturePrefsStore.batch1401.v1402east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1402: easy mode
internal fun PlayerActivity.showV1402EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1402easy
    FeaturePrefsStore.batch1401.v1402easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1402: eclipse mode
internal fun PlayerActivity.showV1402EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1402eclipse
    FeaturePrefsStore.batch1401.v1402eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1402: educate mode
internal fun PlayerActivity.showV1402EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1402educate
    FeaturePrefsStore.batch1401.v1402educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1403: duck mode
internal fun PlayerActivity.showV1403DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1403duck
    FeaturePrefsStore.batch1401.v1403duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1403: dumb mode
internal fun PlayerActivity.showV1403DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dumb
    FeaturePrefsStore.batch1401.v1403dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1403: dune mode
internal fun PlayerActivity.showV1403DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dune
    FeaturePrefsStore.batch1401.v1403dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1403: dust mode
internal fun PlayerActivity.showV1403DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1403dust
    FeaturePrefsStore.batch1401.v1403dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1403: duty mode
internal fun PlayerActivity.showV1403DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1403duty
    FeaturePrefsStore.batch1401.v1403duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1403: eager level
internal fun PlayerActivity.showV1403EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1403: ear level
internal fun PlayerActivity.showV1403EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1403: early level
internal fun PlayerActivity.showV1403EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403early = value
        AppToast.show(this, "early: $value")
    }
}

// v1403: earn level
internal fun PlayerActivity.showV1403EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1403: earth level
internal fun PlayerActivity.showV1403EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1403earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1403earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1403: ease mode
internal fun PlayerActivity.showV1403EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1403ease
    FeaturePrefsStore.batch1401.v1403ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1403: east mode
internal fun PlayerActivity.showV1403EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1403east
    FeaturePrefsStore.batch1401.v1403east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1403: easy mode
internal fun PlayerActivity.showV1403EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1403easy
    FeaturePrefsStore.batch1401.v1403easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1403: eclipse mode
internal fun PlayerActivity.showV1403EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1403eclipse
    FeaturePrefsStore.batch1401.v1403eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1403: educate mode
internal fun PlayerActivity.showV1403EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1403educate
    FeaturePrefsStore.batch1401.v1403educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1404: duck mode
internal fun PlayerActivity.showV1404DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1404duck
    FeaturePrefsStore.batch1401.v1404duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1404: dumb mode
internal fun PlayerActivity.showV1404DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dumb
    FeaturePrefsStore.batch1401.v1404dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1404: dune mode
internal fun PlayerActivity.showV1404DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dune
    FeaturePrefsStore.batch1401.v1404dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1404: dust mode
internal fun PlayerActivity.showV1404DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1404dust
    FeaturePrefsStore.batch1401.v1404dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1404: duty mode
internal fun PlayerActivity.showV1404DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1404duty
    FeaturePrefsStore.batch1401.v1404duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1404: eager level
internal fun PlayerActivity.showV1404EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1404: ear level
internal fun PlayerActivity.showV1404EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1404: early level
internal fun PlayerActivity.showV1404EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404early = value
        AppToast.show(this, "early: $value")
    }
}

// v1404: earn level
internal fun PlayerActivity.showV1404EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1404: earth level
internal fun PlayerActivity.showV1404EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1404earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1404earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1404: ease mode
internal fun PlayerActivity.showV1404EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1404ease
    FeaturePrefsStore.batch1401.v1404ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1404: east mode
internal fun PlayerActivity.showV1404EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1404east
    FeaturePrefsStore.batch1401.v1404east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1404: easy mode
internal fun PlayerActivity.showV1404EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1404easy
    FeaturePrefsStore.batch1401.v1404easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1404: eclipse mode
internal fun PlayerActivity.showV1404EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1404eclipse
    FeaturePrefsStore.batch1401.v1404eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1404: educate mode
internal fun PlayerActivity.showV1404EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1404educate
    FeaturePrefsStore.batch1401.v1404educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1405: duck mode
internal fun PlayerActivity.showV1405DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1405duck
    FeaturePrefsStore.batch1401.v1405duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1405: dumb mode
internal fun PlayerActivity.showV1405DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dumb
    FeaturePrefsStore.batch1401.v1405dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1405: dune mode
internal fun PlayerActivity.showV1405DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dune
    FeaturePrefsStore.batch1401.v1405dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1405: dust mode
internal fun PlayerActivity.showV1405DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1405dust
    FeaturePrefsStore.batch1401.v1405dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1405: duty mode
internal fun PlayerActivity.showV1405DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1405duty
    FeaturePrefsStore.batch1401.v1405duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1405: eager level
internal fun PlayerActivity.showV1405EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1405: ear level
internal fun PlayerActivity.showV1405EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1405: early level
internal fun PlayerActivity.showV1405EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405early = value
        AppToast.show(this, "early: $value")
    }
}

// v1405: earn level
internal fun PlayerActivity.showV1405EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1405: earth level
internal fun PlayerActivity.showV1405EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1405earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1405earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1405: ease mode
internal fun PlayerActivity.showV1405EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1405ease
    FeaturePrefsStore.batch1401.v1405ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1405: east mode
internal fun PlayerActivity.showV1405EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1405east
    FeaturePrefsStore.batch1401.v1405east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1405: easy mode
internal fun PlayerActivity.showV1405EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1405easy
    FeaturePrefsStore.batch1401.v1405easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1405: eclipse mode
internal fun PlayerActivity.showV1405EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1405eclipse
    FeaturePrefsStore.batch1401.v1405eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1405: educate mode
internal fun PlayerActivity.showV1405EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1405educate
    FeaturePrefsStore.batch1401.v1405educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1406: duck mode
internal fun PlayerActivity.showV1406DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1406duck
    FeaturePrefsStore.batch1401.v1406duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1406: dumb mode
internal fun PlayerActivity.showV1406DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dumb
    FeaturePrefsStore.batch1401.v1406dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1406: dune mode
internal fun PlayerActivity.showV1406DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dune
    FeaturePrefsStore.batch1401.v1406dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1406: dust mode
internal fun PlayerActivity.showV1406DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1406dust
    FeaturePrefsStore.batch1401.v1406dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1406: duty mode
internal fun PlayerActivity.showV1406DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1406duty
    FeaturePrefsStore.batch1401.v1406duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1406: eager level
internal fun PlayerActivity.showV1406EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1406: ear level
internal fun PlayerActivity.showV1406EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1406: early level
internal fun PlayerActivity.showV1406EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406early = value
        AppToast.show(this, "early: $value")
    }
}

// v1406: earn level
internal fun PlayerActivity.showV1406EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1406: earth level
internal fun PlayerActivity.showV1406EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1406earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1406earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1406: ease mode
internal fun PlayerActivity.showV1406EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1406ease
    FeaturePrefsStore.batch1401.v1406ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1406: east mode
internal fun PlayerActivity.showV1406EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1406east
    FeaturePrefsStore.batch1401.v1406east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1406: easy mode
internal fun PlayerActivity.showV1406EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1406easy
    FeaturePrefsStore.batch1401.v1406easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1406: eclipse mode
internal fun PlayerActivity.showV1406EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1406eclipse
    FeaturePrefsStore.batch1401.v1406eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1406: educate mode
internal fun PlayerActivity.showV1406EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1406educate
    FeaturePrefsStore.batch1401.v1406educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1407: duck mode
internal fun PlayerActivity.showV1407DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1407duck
    FeaturePrefsStore.batch1401.v1407duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1407: dumb mode
internal fun PlayerActivity.showV1407DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dumb
    FeaturePrefsStore.batch1401.v1407dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1407: dune mode
internal fun PlayerActivity.showV1407DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dune
    FeaturePrefsStore.batch1401.v1407dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1407: dust mode
internal fun PlayerActivity.showV1407DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1407dust
    FeaturePrefsStore.batch1401.v1407dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1407: duty mode
internal fun PlayerActivity.showV1407DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1407duty
    FeaturePrefsStore.batch1401.v1407duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1407: eager level
internal fun PlayerActivity.showV1407EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1407: ear level
internal fun PlayerActivity.showV1407EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1407: early level
internal fun PlayerActivity.showV1407EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407early = value
        AppToast.show(this, "early: $value")
    }
}

// v1407: earn level
internal fun PlayerActivity.showV1407EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1407: earth level
internal fun PlayerActivity.showV1407EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1407earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1407earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1407: ease mode
internal fun PlayerActivity.showV1407EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1407ease
    FeaturePrefsStore.batch1401.v1407ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1407: east mode
internal fun PlayerActivity.showV1407EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1407east
    FeaturePrefsStore.batch1401.v1407east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1407: easy mode
internal fun PlayerActivity.showV1407EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1407easy
    FeaturePrefsStore.batch1401.v1407easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1407: eclipse mode
internal fun PlayerActivity.showV1407EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1407eclipse
    FeaturePrefsStore.batch1401.v1407eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1407: educate mode
internal fun PlayerActivity.showV1407EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1407educate
    FeaturePrefsStore.batch1401.v1407educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1408: duck mode
internal fun PlayerActivity.showV1408DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1408duck
    FeaturePrefsStore.batch1401.v1408duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1408: dumb mode
internal fun PlayerActivity.showV1408DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dumb
    FeaturePrefsStore.batch1401.v1408dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1408: dune mode
internal fun PlayerActivity.showV1408DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dune
    FeaturePrefsStore.batch1401.v1408dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1408: dust mode
internal fun PlayerActivity.showV1408DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1408dust
    FeaturePrefsStore.batch1401.v1408dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1408: duty mode
internal fun PlayerActivity.showV1408DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1408duty
    FeaturePrefsStore.batch1401.v1408duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1408: eager level
internal fun PlayerActivity.showV1408EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1408: ear level
internal fun PlayerActivity.showV1408EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1408: early level
internal fun PlayerActivity.showV1408EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408early = value
        AppToast.show(this, "early: $value")
    }
}

// v1408: earn level
internal fun PlayerActivity.showV1408EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1408: earth level
internal fun PlayerActivity.showV1408EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1408earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1408earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1408: ease mode
internal fun PlayerActivity.showV1408EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1408ease
    FeaturePrefsStore.batch1401.v1408ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1408: east mode
internal fun PlayerActivity.showV1408EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1408east
    FeaturePrefsStore.batch1401.v1408east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1408: easy mode
internal fun PlayerActivity.showV1408EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1408easy
    FeaturePrefsStore.batch1401.v1408easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1408: eclipse mode
internal fun PlayerActivity.showV1408EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1408eclipse
    FeaturePrefsStore.batch1401.v1408eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1408: educate mode
internal fun PlayerActivity.showV1408EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1408educate
    FeaturePrefsStore.batch1401.v1408educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1409: duck mode
internal fun PlayerActivity.showV1409DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1409duck
    FeaturePrefsStore.batch1401.v1409duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1409: dumb mode
internal fun PlayerActivity.showV1409DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dumb
    FeaturePrefsStore.batch1401.v1409dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1409: dune mode
internal fun PlayerActivity.showV1409DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dune
    FeaturePrefsStore.batch1401.v1409dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1409: dust mode
internal fun PlayerActivity.showV1409DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1409dust
    FeaturePrefsStore.batch1401.v1409dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1409: duty mode
internal fun PlayerActivity.showV1409DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1409duty
    FeaturePrefsStore.batch1401.v1409duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1409: eager level
internal fun PlayerActivity.showV1409EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1409: ear level
internal fun PlayerActivity.showV1409EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1409: early level
internal fun PlayerActivity.showV1409EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409early = value
        AppToast.show(this, "early: $value")
    }
}

// v1409: earn level
internal fun PlayerActivity.showV1409EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1409: earth level
internal fun PlayerActivity.showV1409EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1409earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1409earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1409: ease mode
internal fun PlayerActivity.showV1409EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1409ease
    FeaturePrefsStore.batch1401.v1409ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1409: east mode
internal fun PlayerActivity.showV1409EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1409east
    FeaturePrefsStore.batch1401.v1409east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1409: easy mode
internal fun PlayerActivity.showV1409EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1409easy
    FeaturePrefsStore.batch1401.v1409easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1409: eclipse mode
internal fun PlayerActivity.showV1409EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1409eclipse
    FeaturePrefsStore.batch1401.v1409eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1409: educate mode
internal fun PlayerActivity.showV1409EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1409educate
    FeaturePrefsStore.batch1401.v1409educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

// v1410: duck mode
internal fun PlayerActivity.showV1410DuckToggle() {
    val current = FeaturePrefsStore.batch1401.v1410duck
    FeaturePrefsStore.batch1401.v1410duck = !current
    AppToast.show(this, "duck: ${if (!current) "ON" else "OFF"}")
}

// v1410: dumb mode
internal fun PlayerActivity.showV1410DumbToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dumb
    FeaturePrefsStore.batch1401.v1410dumb = !current
    AppToast.show(this, "dumb: ${if (!current) "ON" else "OFF"}")
}

// v1410: dune mode
internal fun PlayerActivity.showV1410DuneToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dune
    FeaturePrefsStore.batch1401.v1410dune = !current
    AppToast.show(this, "dune: ${if (!current) "ON" else "OFF"}")
}

// v1410: dust mode
internal fun PlayerActivity.showV1410DustToggle() {
    val current = FeaturePrefsStore.batch1401.v1410dust
    FeaturePrefsStore.batch1401.v1410dust = !current
    AppToast.show(this, "dust: ${if (!current) "ON" else "OFF"}")
}

// v1410: duty mode
internal fun PlayerActivity.showV1410DutyToggle() {
    val current = FeaturePrefsStore.batch1401.v1410duty
    FeaturePrefsStore.batch1401.v1410duty = !current
    AppToast.show(this, "duty: ${if (!current) "ON" else "OFF"}")
}

// v1410: eager level
internal fun PlayerActivity.showV1410EagerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410eager).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "eager level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410eager = value
        AppToast.show(this, "eager: $value")
    }
}

// v1410: ear level
internal fun PlayerActivity.showV1410EarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410ear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410ear = value
        AppToast.show(this, "ear: $value")
    }
}

// v1410: early level
internal fun PlayerActivity.showV1410EarlyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410early).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "early level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410early = value
        AppToast.show(this, "early: $value")
    }
}

// v1410: earn level
internal fun PlayerActivity.showV1410EarnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410earn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410earn = value
        AppToast.show(this, "earn: $value")
    }
}

// v1410: earth level
internal fun PlayerActivity.showV1410EarthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1401.v1410earth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "earth level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1401.v1410earth = value
        AppToast.show(this, "earth: $value")
    }
}

// v1410: ease mode
internal fun PlayerActivity.showV1410EaseToggle() {
    val current = FeaturePrefsStore.batch1401.v1410ease
    FeaturePrefsStore.batch1401.v1410ease = !current
    AppToast.show(this, "ease: ${if (!current) "ON" else "OFF"}")
}

// v1410: east mode
internal fun PlayerActivity.showV1410EastToggle() {
    val current = FeaturePrefsStore.batch1401.v1410east
    FeaturePrefsStore.batch1401.v1410east = !current
    AppToast.show(this, "east: ${if (!current) "ON" else "OFF"}")
}

// v1410: easy mode
internal fun PlayerActivity.showV1410EasyToggle() {
    val current = FeaturePrefsStore.batch1401.v1410easy
    FeaturePrefsStore.batch1401.v1410easy = !current
    AppToast.show(this, "easy: ${if (!current) "ON" else "OFF"}")
}

// v1410: eclipse mode
internal fun PlayerActivity.showV1410EclipseToggle() {
    val current = FeaturePrefsStore.batch1401.v1410eclipse
    FeaturePrefsStore.batch1401.v1410eclipse = !current
    AppToast.show(this, "eclipse: ${if (!current) "ON" else "OFF"}")
}

// v1410: educate mode
internal fun PlayerActivity.showV1410EducateToggle() {
    val current = FeaturePrefsStore.batch1401.v1410educate
    FeaturePrefsStore.batch1401.v1410educate = !current
    AppToast.show(this, "educate: ${if (!current) "ON" else "OFF"}")
}

