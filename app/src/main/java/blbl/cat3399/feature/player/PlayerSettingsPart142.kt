package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1601: navy mode
internal fun PlayerActivity.showV1601NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1601navy
    FeaturePrefsStore.batch1601.v1601navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1601: neat mode
internal fun PlayerActivity.showV1601NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1601neat
    FeaturePrefsStore.batch1601.v1601neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1601: neck mode
internal fun PlayerActivity.showV1601NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1601neck
    FeaturePrefsStore.batch1601.v1601neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1601: nerve mode
internal fun PlayerActivity.showV1601NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1601nerve
    FeaturePrefsStore.batch1601.v1601nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1601: nest mode
internal fun PlayerActivity.showV1601NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1601nest
    FeaturePrefsStore.batch1601.v1601nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1601: neutral level
internal fun PlayerActivity.showV1601NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1601neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1601neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1601: news level
internal fun PlayerActivity.showV1601NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1601news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1601news = value
        AppToast.show(this, "news: $value")
    }
}

// v1601: nice level
internal fun PlayerActivity.showV1601NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1601nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1601nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1601: night level
internal fun PlayerActivity.showV1601NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1601night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1601night = value
        AppToast.show(this, "night: $value")
    }
}

// v1601: noble level
internal fun PlayerActivity.showV1601NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1601noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1601noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1601: noise mode
internal fun PlayerActivity.showV1601NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1601noise
    FeaturePrefsStore.batch1601.v1601noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1601: nominee mode
internal fun PlayerActivity.showV1601NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1601nominee
    FeaturePrefsStore.batch1601.v1601nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1601: north mode
internal fun PlayerActivity.showV1601NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1601north
    FeaturePrefsStore.batch1601.v1601north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1601: nose mode
internal fun PlayerActivity.showV1601NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1601nose
    FeaturePrefsStore.batch1601.v1601nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1601: notable mode
internal fun PlayerActivity.showV1601NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1601notable
    FeaturePrefsStore.batch1601.v1601notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1602: navy mode
internal fun PlayerActivity.showV1602NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1602navy
    FeaturePrefsStore.batch1601.v1602navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1602: neat mode
internal fun PlayerActivity.showV1602NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1602neat
    FeaturePrefsStore.batch1601.v1602neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1602: neck mode
internal fun PlayerActivity.showV1602NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1602neck
    FeaturePrefsStore.batch1601.v1602neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1602: nerve mode
internal fun PlayerActivity.showV1602NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1602nerve
    FeaturePrefsStore.batch1601.v1602nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1602: nest mode
internal fun PlayerActivity.showV1602NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1602nest
    FeaturePrefsStore.batch1601.v1602nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1602: neutral level
internal fun PlayerActivity.showV1602NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1602neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1602neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1602: news level
internal fun PlayerActivity.showV1602NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1602news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1602news = value
        AppToast.show(this, "news: $value")
    }
}

// v1602: nice level
internal fun PlayerActivity.showV1602NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1602nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1602nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1602: night level
internal fun PlayerActivity.showV1602NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1602night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1602night = value
        AppToast.show(this, "night: $value")
    }
}

// v1602: noble level
internal fun PlayerActivity.showV1602NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1602noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1602noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1602: noise mode
internal fun PlayerActivity.showV1602NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1602noise
    FeaturePrefsStore.batch1601.v1602noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1602: nominee mode
internal fun PlayerActivity.showV1602NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1602nominee
    FeaturePrefsStore.batch1601.v1602nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1602: north mode
internal fun PlayerActivity.showV1602NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1602north
    FeaturePrefsStore.batch1601.v1602north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1602: nose mode
internal fun PlayerActivity.showV1602NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1602nose
    FeaturePrefsStore.batch1601.v1602nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1602: notable mode
internal fun PlayerActivity.showV1602NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1602notable
    FeaturePrefsStore.batch1601.v1602notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1603: navy mode
internal fun PlayerActivity.showV1603NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1603navy
    FeaturePrefsStore.batch1601.v1603navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1603: neat mode
internal fun PlayerActivity.showV1603NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1603neat
    FeaturePrefsStore.batch1601.v1603neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1603: neck mode
internal fun PlayerActivity.showV1603NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1603neck
    FeaturePrefsStore.batch1601.v1603neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1603: nerve mode
internal fun PlayerActivity.showV1603NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1603nerve
    FeaturePrefsStore.batch1601.v1603nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1603: nest mode
internal fun PlayerActivity.showV1603NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1603nest
    FeaturePrefsStore.batch1601.v1603nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1603: neutral level
internal fun PlayerActivity.showV1603NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1603neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1603neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1603: news level
internal fun PlayerActivity.showV1603NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1603news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1603news = value
        AppToast.show(this, "news: $value")
    }
}

// v1603: nice level
internal fun PlayerActivity.showV1603NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1603nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1603nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1603: night level
internal fun PlayerActivity.showV1603NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1603night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1603night = value
        AppToast.show(this, "night: $value")
    }
}

// v1603: noble level
internal fun PlayerActivity.showV1603NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1603noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1603noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1603: noise mode
internal fun PlayerActivity.showV1603NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1603noise
    FeaturePrefsStore.batch1601.v1603noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1603: nominee mode
internal fun PlayerActivity.showV1603NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1603nominee
    FeaturePrefsStore.batch1601.v1603nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1603: north mode
internal fun PlayerActivity.showV1603NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1603north
    FeaturePrefsStore.batch1601.v1603north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1603: nose mode
internal fun PlayerActivity.showV1603NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1603nose
    FeaturePrefsStore.batch1601.v1603nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1603: notable mode
internal fun PlayerActivity.showV1603NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1603notable
    FeaturePrefsStore.batch1601.v1603notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1604: navy mode
internal fun PlayerActivity.showV1604NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1604navy
    FeaturePrefsStore.batch1601.v1604navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1604: neat mode
internal fun PlayerActivity.showV1604NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1604neat
    FeaturePrefsStore.batch1601.v1604neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1604: neck mode
internal fun PlayerActivity.showV1604NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1604neck
    FeaturePrefsStore.batch1601.v1604neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1604: nerve mode
internal fun PlayerActivity.showV1604NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1604nerve
    FeaturePrefsStore.batch1601.v1604nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1604: nest mode
internal fun PlayerActivity.showV1604NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1604nest
    FeaturePrefsStore.batch1601.v1604nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1604: neutral level
internal fun PlayerActivity.showV1604NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1604neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1604neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1604: news level
internal fun PlayerActivity.showV1604NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1604news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1604news = value
        AppToast.show(this, "news: $value")
    }
}

// v1604: nice level
internal fun PlayerActivity.showV1604NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1604nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1604nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1604: night level
internal fun PlayerActivity.showV1604NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1604night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1604night = value
        AppToast.show(this, "night: $value")
    }
}

// v1604: noble level
internal fun PlayerActivity.showV1604NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1604noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1604noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1604: noise mode
internal fun PlayerActivity.showV1604NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1604noise
    FeaturePrefsStore.batch1601.v1604noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1604: nominee mode
internal fun PlayerActivity.showV1604NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1604nominee
    FeaturePrefsStore.batch1601.v1604nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1604: north mode
internal fun PlayerActivity.showV1604NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1604north
    FeaturePrefsStore.batch1601.v1604north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1604: nose mode
internal fun PlayerActivity.showV1604NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1604nose
    FeaturePrefsStore.batch1601.v1604nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1604: notable mode
internal fun PlayerActivity.showV1604NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1604notable
    FeaturePrefsStore.batch1601.v1604notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1605: navy mode
internal fun PlayerActivity.showV1605NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1605navy
    FeaturePrefsStore.batch1601.v1605navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1605: neat mode
internal fun PlayerActivity.showV1605NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1605neat
    FeaturePrefsStore.batch1601.v1605neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1605: neck mode
internal fun PlayerActivity.showV1605NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1605neck
    FeaturePrefsStore.batch1601.v1605neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1605: nerve mode
internal fun PlayerActivity.showV1605NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1605nerve
    FeaturePrefsStore.batch1601.v1605nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1605: nest mode
internal fun PlayerActivity.showV1605NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1605nest
    FeaturePrefsStore.batch1601.v1605nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1605: neutral level
internal fun PlayerActivity.showV1605NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1605neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1605neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1605: news level
internal fun PlayerActivity.showV1605NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1605news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1605news = value
        AppToast.show(this, "news: $value")
    }
}

// v1605: nice level
internal fun PlayerActivity.showV1605NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1605nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1605nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1605: night level
internal fun PlayerActivity.showV1605NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1605night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1605night = value
        AppToast.show(this, "night: $value")
    }
}

// v1605: noble level
internal fun PlayerActivity.showV1605NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1605noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1605noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1605: noise mode
internal fun PlayerActivity.showV1605NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1605noise
    FeaturePrefsStore.batch1601.v1605noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1605: nominee mode
internal fun PlayerActivity.showV1605NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1605nominee
    FeaturePrefsStore.batch1601.v1605nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1605: north mode
internal fun PlayerActivity.showV1605NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1605north
    FeaturePrefsStore.batch1601.v1605north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1605: nose mode
internal fun PlayerActivity.showV1605NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1605nose
    FeaturePrefsStore.batch1601.v1605nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1605: notable mode
internal fun PlayerActivity.showV1605NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1605notable
    FeaturePrefsStore.batch1601.v1605notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1606: navy mode
internal fun PlayerActivity.showV1606NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1606navy
    FeaturePrefsStore.batch1601.v1606navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1606: neat mode
internal fun PlayerActivity.showV1606NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1606neat
    FeaturePrefsStore.batch1601.v1606neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1606: neck mode
internal fun PlayerActivity.showV1606NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1606neck
    FeaturePrefsStore.batch1601.v1606neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1606: nerve mode
internal fun PlayerActivity.showV1606NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1606nerve
    FeaturePrefsStore.batch1601.v1606nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1606: nest mode
internal fun PlayerActivity.showV1606NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1606nest
    FeaturePrefsStore.batch1601.v1606nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1606: neutral level
internal fun PlayerActivity.showV1606NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1606neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1606neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1606: news level
internal fun PlayerActivity.showV1606NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1606news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1606news = value
        AppToast.show(this, "news: $value")
    }
}

// v1606: nice level
internal fun PlayerActivity.showV1606NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1606nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1606nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1606: night level
internal fun PlayerActivity.showV1606NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1606night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1606night = value
        AppToast.show(this, "night: $value")
    }
}

// v1606: noble level
internal fun PlayerActivity.showV1606NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1606noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1606noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1606: noise mode
internal fun PlayerActivity.showV1606NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1606noise
    FeaturePrefsStore.batch1601.v1606noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1606: nominee mode
internal fun PlayerActivity.showV1606NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1606nominee
    FeaturePrefsStore.batch1601.v1606nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1606: north mode
internal fun PlayerActivity.showV1606NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1606north
    FeaturePrefsStore.batch1601.v1606north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1606: nose mode
internal fun PlayerActivity.showV1606NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1606nose
    FeaturePrefsStore.batch1601.v1606nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1606: notable mode
internal fun PlayerActivity.showV1606NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1606notable
    FeaturePrefsStore.batch1601.v1606notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1607: navy mode
internal fun PlayerActivity.showV1607NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1607navy
    FeaturePrefsStore.batch1601.v1607navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1607: neat mode
internal fun PlayerActivity.showV1607NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1607neat
    FeaturePrefsStore.batch1601.v1607neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1607: neck mode
internal fun PlayerActivity.showV1607NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1607neck
    FeaturePrefsStore.batch1601.v1607neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1607: nerve mode
internal fun PlayerActivity.showV1607NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1607nerve
    FeaturePrefsStore.batch1601.v1607nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1607: nest mode
internal fun PlayerActivity.showV1607NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1607nest
    FeaturePrefsStore.batch1601.v1607nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1607: neutral level
internal fun PlayerActivity.showV1607NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1607neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1607neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1607: news level
internal fun PlayerActivity.showV1607NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1607news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1607news = value
        AppToast.show(this, "news: $value")
    }
}

// v1607: nice level
internal fun PlayerActivity.showV1607NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1607nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1607nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1607: night level
internal fun PlayerActivity.showV1607NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1607night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1607night = value
        AppToast.show(this, "night: $value")
    }
}

// v1607: noble level
internal fun PlayerActivity.showV1607NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1607noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1607noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1607: noise mode
internal fun PlayerActivity.showV1607NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1607noise
    FeaturePrefsStore.batch1601.v1607noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1607: nominee mode
internal fun PlayerActivity.showV1607NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1607nominee
    FeaturePrefsStore.batch1601.v1607nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1607: north mode
internal fun PlayerActivity.showV1607NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1607north
    FeaturePrefsStore.batch1601.v1607north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1607: nose mode
internal fun PlayerActivity.showV1607NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1607nose
    FeaturePrefsStore.batch1601.v1607nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1607: notable mode
internal fun PlayerActivity.showV1607NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1607notable
    FeaturePrefsStore.batch1601.v1607notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1608: navy mode
internal fun PlayerActivity.showV1608NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1608navy
    FeaturePrefsStore.batch1601.v1608navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1608: neat mode
internal fun PlayerActivity.showV1608NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1608neat
    FeaturePrefsStore.batch1601.v1608neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1608: neck mode
internal fun PlayerActivity.showV1608NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1608neck
    FeaturePrefsStore.batch1601.v1608neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1608: nerve mode
internal fun PlayerActivity.showV1608NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1608nerve
    FeaturePrefsStore.batch1601.v1608nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1608: nest mode
internal fun PlayerActivity.showV1608NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1608nest
    FeaturePrefsStore.batch1601.v1608nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1608: neutral level
internal fun PlayerActivity.showV1608NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1608neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1608neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1608: news level
internal fun PlayerActivity.showV1608NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1608news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1608news = value
        AppToast.show(this, "news: $value")
    }
}

// v1608: nice level
internal fun PlayerActivity.showV1608NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1608nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1608nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1608: night level
internal fun PlayerActivity.showV1608NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1608night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1608night = value
        AppToast.show(this, "night: $value")
    }
}

// v1608: noble level
internal fun PlayerActivity.showV1608NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1608noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1608noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1608: noise mode
internal fun PlayerActivity.showV1608NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1608noise
    FeaturePrefsStore.batch1601.v1608noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1608: nominee mode
internal fun PlayerActivity.showV1608NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1608nominee
    FeaturePrefsStore.batch1601.v1608nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1608: north mode
internal fun PlayerActivity.showV1608NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1608north
    FeaturePrefsStore.batch1601.v1608north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1608: nose mode
internal fun PlayerActivity.showV1608NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1608nose
    FeaturePrefsStore.batch1601.v1608nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1608: notable mode
internal fun PlayerActivity.showV1608NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1608notable
    FeaturePrefsStore.batch1601.v1608notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1609: navy mode
internal fun PlayerActivity.showV1609NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1609navy
    FeaturePrefsStore.batch1601.v1609navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1609: neat mode
internal fun PlayerActivity.showV1609NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1609neat
    FeaturePrefsStore.batch1601.v1609neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1609: neck mode
internal fun PlayerActivity.showV1609NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1609neck
    FeaturePrefsStore.batch1601.v1609neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1609: nerve mode
internal fun PlayerActivity.showV1609NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1609nerve
    FeaturePrefsStore.batch1601.v1609nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1609: nest mode
internal fun PlayerActivity.showV1609NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1609nest
    FeaturePrefsStore.batch1601.v1609nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1609: neutral level
internal fun PlayerActivity.showV1609NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1609neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1609neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1609: news level
internal fun PlayerActivity.showV1609NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1609news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1609news = value
        AppToast.show(this, "news: $value")
    }
}

// v1609: nice level
internal fun PlayerActivity.showV1609NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1609nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1609nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1609: night level
internal fun PlayerActivity.showV1609NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1609night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1609night = value
        AppToast.show(this, "night: $value")
    }
}

// v1609: noble level
internal fun PlayerActivity.showV1609NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1609noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1609noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1609: noise mode
internal fun PlayerActivity.showV1609NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1609noise
    FeaturePrefsStore.batch1601.v1609noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1609: nominee mode
internal fun PlayerActivity.showV1609NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1609nominee
    FeaturePrefsStore.batch1601.v1609nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1609: north mode
internal fun PlayerActivity.showV1609NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1609north
    FeaturePrefsStore.batch1601.v1609north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1609: nose mode
internal fun PlayerActivity.showV1609NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1609nose
    FeaturePrefsStore.batch1601.v1609nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1609: notable mode
internal fun PlayerActivity.showV1609NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1609notable
    FeaturePrefsStore.batch1601.v1609notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

// v1610: navy mode
internal fun PlayerActivity.showV1610NavyToggle() {
    val current = FeaturePrefsStore.batch1601.v1610navy
    FeaturePrefsStore.batch1601.v1610navy = !current
    AppToast.show(this, "navy: ${if (!current) "ON" else "OFF"}")
}

// v1610: neat mode
internal fun PlayerActivity.showV1610NeatToggle() {
    val current = FeaturePrefsStore.batch1601.v1610neat
    FeaturePrefsStore.batch1601.v1610neat = !current
    AppToast.show(this, "neat: ${if (!current) "ON" else "OFF"}")
}

// v1610: neck mode
internal fun PlayerActivity.showV1610NeckToggle() {
    val current = FeaturePrefsStore.batch1601.v1610neck
    FeaturePrefsStore.batch1601.v1610neck = !current
    AppToast.show(this, "neck: ${if (!current) "ON" else "OFF"}")
}

// v1610: nerve mode
internal fun PlayerActivity.showV1610NerveToggle() {
    val current = FeaturePrefsStore.batch1601.v1610nerve
    FeaturePrefsStore.batch1601.v1610nerve = !current
    AppToast.show(this, "nerve: ${if (!current) "ON" else "OFF"}")
}

// v1610: nest mode
internal fun PlayerActivity.showV1610NestToggle() {
    val current = FeaturePrefsStore.batch1601.v1610nest
    FeaturePrefsStore.batch1601.v1610nest = !current
    AppToast.show(this, "nest: ${if (!current) "ON" else "OFF"}")
}

// v1610: neutral level
internal fun PlayerActivity.showV1610NeutralDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1610neutral).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutral level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1610neutral = value
        AppToast.show(this, "neutral: $value")
    }
}

// v1610: news level
internal fun PlayerActivity.showV1610NewsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1610news).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "news level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1610news = value
        AppToast.show(this, "news: $value")
    }
}

// v1610: nice level
internal fun PlayerActivity.showV1610NiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1610nice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1610nice = value
        AppToast.show(this, "nice: $value")
    }
}

// v1610: night level
internal fun PlayerActivity.showV1610NightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1610night).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "night level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1610night = value
        AppToast.show(this, "night: $value")
    }
}

// v1610: noble level
internal fun PlayerActivity.showV1610NobleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1601.v1610noble).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noble level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1601.v1610noble = value
        AppToast.show(this, "noble: $value")
    }
}

// v1610: noise mode
internal fun PlayerActivity.showV1610NoiseToggle() {
    val current = FeaturePrefsStore.batch1601.v1610noise
    FeaturePrefsStore.batch1601.v1610noise = !current
    AppToast.show(this, "noise: ${if (!current) "ON" else "OFF"}")
}

// v1610: nominee mode
internal fun PlayerActivity.showV1610NomineeToggle() {
    val current = FeaturePrefsStore.batch1601.v1610nominee
    FeaturePrefsStore.batch1601.v1610nominee = !current
    AppToast.show(this, "nominee: ${if (!current) "ON" else "OFF"}")
}

// v1610: north mode
internal fun PlayerActivity.showV1610NorthToggle() {
    val current = FeaturePrefsStore.batch1601.v1610north
    FeaturePrefsStore.batch1601.v1610north = !current
    AppToast.show(this, "north: ${if (!current) "ON" else "OFF"}")
}

// v1610: nose mode
internal fun PlayerActivity.showV1610NoseToggle() {
    val current = FeaturePrefsStore.batch1601.v1610nose
    FeaturePrefsStore.batch1601.v1610nose = !current
    AppToast.show(this, "nose: ${if (!current) "ON" else "OFF"}")
}

// v1610: notable mode
internal fun PlayerActivity.showV1610NotableToggle() {
    val current = FeaturePrefsStore.batch1601.v1610notable
    FeaturePrefsStore.batch1601.v1610notable = !current
    AppToast.show(this, "notable: ${if (!current) "ON" else "OFF"}")
}

