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

// v1611: nothing mode
internal fun PlayerActivity.showV1611NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nothing
    FeaturePrefsStore.batch1611.v1611nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1611: notice mode
internal fun PlayerActivity.showV1611NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1611notice
    FeaturePrefsStore.batch1611.v1611notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1611: novel mode
internal fun PlayerActivity.showV1611NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1611novel
    FeaturePrefsStore.batch1611.v1611novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1611: nuclear mode
internal fun PlayerActivity.showV1611NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nuclear
    FeaturePrefsStore.batch1611.v1611nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1611: nurse mode
internal fun PlayerActivity.showV1611NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nurse
    FeaturePrefsStore.batch1611.v1611nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1611: nylon level
internal fun PlayerActivity.showV1611NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1611: oak level
internal fun PlayerActivity.showV1611OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1611: obey level
internal fun PlayerActivity.showV1611ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1611: oblige level
internal fun PlayerActivity.showV1611ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1611: obscure level
internal fun PlayerActivity.showV1611ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1611: obtain mode
internal fun PlayerActivity.showV1611ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1611obtain
    FeaturePrefsStore.batch1611.v1611obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1611: obvious mode
internal fun PlayerActivity.showV1611ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1611obvious
    FeaturePrefsStore.batch1611.v1611obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1611: occur mode
internal fun PlayerActivity.showV1611OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1611occur
    FeaturePrefsStore.batch1611.v1611occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1611: ocean mode
internal fun PlayerActivity.showV1611OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1611ocean
    FeaturePrefsStore.batch1611.v1611ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1611: october mode
internal fun PlayerActivity.showV1611OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1611october
    FeaturePrefsStore.batch1611.v1611october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1612: nothing mode
internal fun PlayerActivity.showV1612NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nothing
    FeaturePrefsStore.batch1611.v1612nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1612: notice mode
internal fun PlayerActivity.showV1612NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1612notice
    FeaturePrefsStore.batch1611.v1612notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1612: novel mode
internal fun PlayerActivity.showV1612NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1612novel
    FeaturePrefsStore.batch1611.v1612novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1612: nuclear mode
internal fun PlayerActivity.showV1612NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nuclear
    FeaturePrefsStore.batch1611.v1612nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1612: nurse mode
internal fun PlayerActivity.showV1612NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nurse
    FeaturePrefsStore.batch1611.v1612nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1612: nylon level
internal fun PlayerActivity.showV1612NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1612: oak level
internal fun PlayerActivity.showV1612OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1612: obey level
internal fun PlayerActivity.showV1612ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1612: oblige level
internal fun PlayerActivity.showV1612ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1612: obscure level
internal fun PlayerActivity.showV1612ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1612: obtain mode
internal fun PlayerActivity.showV1612ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1612obtain
    FeaturePrefsStore.batch1611.v1612obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1612: obvious mode
internal fun PlayerActivity.showV1612ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1612obvious
    FeaturePrefsStore.batch1611.v1612obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1612: occur mode
internal fun PlayerActivity.showV1612OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1612occur
    FeaturePrefsStore.batch1611.v1612occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1612: ocean mode
internal fun PlayerActivity.showV1612OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1612ocean
    FeaturePrefsStore.batch1611.v1612ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1612: october mode
internal fun PlayerActivity.showV1612OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1612october
    FeaturePrefsStore.batch1611.v1612october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1613: nothing mode
internal fun PlayerActivity.showV1613NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nothing
    FeaturePrefsStore.batch1611.v1613nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1613: notice mode
internal fun PlayerActivity.showV1613NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1613notice
    FeaturePrefsStore.batch1611.v1613notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1613: novel mode
internal fun PlayerActivity.showV1613NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1613novel
    FeaturePrefsStore.batch1611.v1613novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1613: nuclear mode
internal fun PlayerActivity.showV1613NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nuclear
    FeaturePrefsStore.batch1611.v1613nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1613: nurse mode
internal fun PlayerActivity.showV1613NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nurse
    FeaturePrefsStore.batch1611.v1613nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1613: nylon level
internal fun PlayerActivity.showV1613NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1613: oak level
internal fun PlayerActivity.showV1613OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1613: obey level
internal fun PlayerActivity.showV1613ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1613: oblige level
internal fun PlayerActivity.showV1613ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1613: obscure level
internal fun PlayerActivity.showV1613ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1613: obtain mode
internal fun PlayerActivity.showV1613ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1613obtain
    FeaturePrefsStore.batch1611.v1613obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1613: obvious mode
internal fun PlayerActivity.showV1613ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1613obvious
    FeaturePrefsStore.batch1611.v1613obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1613: occur mode
internal fun PlayerActivity.showV1613OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1613occur
    FeaturePrefsStore.batch1611.v1613occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1613: ocean mode
internal fun PlayerActivity.showV1613OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1613ocean
    FeaturePrefsStore.batch1611.v1613ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1613: october mode
internal fun PlayerActivity.showV1613OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1613october
    FeaturePrefsStore.batch1611.v1613october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1614: nothing mode
internal fun PlayerActivity.showV1614NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nothing
    FeaturePrefsStore.batch1611.v1614nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1614: notice mode
internal fun PlayerActivity.showV1614NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1614notice
    FeaturePrefsStore.batch1611.v1614notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1614: novel mode
internal fun PlayerActivity.showV1614NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1614novel
    FeaturePrefsStore.batch1611.v1614novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1614: nuclear mode
internal fun PlayerActivity.showV1614NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nuclear
    FeaturePrefsStore.batch1611.v1614nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1614: nurse mode
internal fun PlayerActivity.showV1614NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nurse
    FeaturePrefsStore.batch1611.v1614nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1614: nylon level
internal fun PlayerActivity.showV1614NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1614: oak level
internal fun PlayerActivity.showV1614OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1614: obey level
internal fun PlayerActivity.showV1614ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1614: oblige level
internal fun PlayerActivity.showV1614ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1614: obscure level
internal fun PlayerActivity.showV1614ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1614: obtain mode
internal fun PlayerActivity.showV1614ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1614obtain
    FeaturePrefsStore.batch1611.v1614obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1614: obvious mode
internal fun PlayerActivity.showV1614ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1614obvious
    FeaturePrefsStore.batch1611.v1614obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1614: occur mode
internal fun PlayerActivity.showV1614OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1614occur
    FeaturePrefsStore.batch1611.v1614occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1614: ocean mode
internal fun PlayerActivity.showV1614OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1614ocean
    FeaturePrefsStore.batch1611.v1614ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1614: october mode
internal fun PlayerActivity.showV1614OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1614october
    FeaturePrefsStore.batch1611.v1614october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1615: nothing mode
internal fun PlayerActivity.showV1615NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nothing
    FeaturePrefsStore.batch1611.v1615nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1615: notice mode
internal fun PlayerActivity.showV1615NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1615notice
    FeaturePrefsStore.batch1611.v1615notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1615: novel mode
internal fun PlayerActivity.showV1615NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1615novel
    FeaturePrefsStore.batch1611.v1615novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1615: nuclear mode
internal fun PlayerActivity.showV1615NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nuclear
    FeaturePrefsStore.batch1611.v1615nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1615: nurse mode
internal fun PlayerActivity.showV1615NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nurse
    FeaturePrefsStore.batch1611.v1615nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1615: nylon level
internal fun PlayerActivity.showV1615NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1615: oak level
internal fun PlayerActivity.showV1615OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1615: obey level
internal fun PlayerActivity.showV1615ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1615: oblige level
internal fun PlayerActivity.showV1615ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1615: obscure level
internal fun PlayerActivity.showV1615ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1615: obtain mode
internal fun PlayerActivity.showV1615ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1615obtain
    FeaturePrefsStore.batch1611.v1615obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1615: obvious mode
internal fun PlayerActivity.showV1615ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1615obvious
    FeaturePrefsStore.batch1611.v1615obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1615: occur mode
internal fun PlayerActivity.showV1615OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1615occur
    FeaturePrefsStore.batch1611.v1615occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1615: ocean mode
internal fun PlayerActivity.showV1615OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1615ocean
    FeaturePrefsStore.batch1611.v1615ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1615: october mode
internal fun PlayerActivity.showV1615OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1615october
    FeaturePrefsStore.batch1611.v1615october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1616: nothing mode
internal fun PlayerActivity.showV1616NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nothing
    FeaturePrefsStore.batch1611.v1616nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1616: notice mode
internal fun PlayerActivity.showV1616NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1616notice
    FeaturePrefsStore.batch1611.v1616notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1616: novel mode
internal fun PlayerActivity.showV1616NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1616novel
    FeaturePrefsStore.batch1611.v1616novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1616: nuclear mode
internal fun PlayerActivity.showV1616NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nuclear
    FeaturePrefsStore.batch1611.v1616nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1616: nurse mode
internal fun PlayerActivity.showV1616NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nurse
    FeaturePrefsStore.batch1611.v1616nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1616: nylon level
internal fun PlayerActivity.showV1616NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1616: oak level
internal fun PlayerActivity.showV1616OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1616: obey level
internal fun PlayerActivity.showV1616ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1616: oblige level
internal fun PlayerActivity.showV1616ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1616: obscure level
internal fun PlayerActivity.showV1616ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1616: obtain mode
internal fun PlayerActivity.showV1616ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1616obtain
    FeaturePrefsStore.batch1611.v1616obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1616: obvious mode
internal fun PlayerActivity.showV1616ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1616obvious
    FeaturePrefsStore.batch1611.v1616obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1616: occur mode
internal fun PlayerActivity.showV1616OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1616occur
    FeaturePrefsStore.batch1611.v1616occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1616: ocean mode
internal fun PlayerActivity.showV1616OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1616ocean
    FeaturePrefsStore.batch1611.v1616ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1616: october mode
internal fun PlayerActivity.showV1616OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1616october
    FeaturePrefsStore.batch1611.v1616october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1617: nothing mode
internal fun PlayerActivity.showV1617NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nothing
    FeaturePrefsStore.batch1611.v1617nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1617: notice mode
internal fun PlayerActivity.showV1617NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1617notice
    FeaturePrefsStore.batch1611.v1617notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1617: novel mode
internal fun PlayerActivity.showV1617NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1617novel
    FeaturePrefsStore.batch1611.v1617novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1617: nuclear mode
internal fun PlayerActivity.showV1617NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nuclear
    FeaturePrefsStore.batch1611.v1617nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1617: nurse mode
internal fun PlayerActivity.showV1617NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nurse
    FeaturePrefsStore.batch1611.v1617nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1617: nylon level
internal fun PlayerActivity.showV1617NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1617: oak level
internal fun PlayerActivity.showV1617OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1617: obey level
internal fun PlayerActivity.showV1617ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1617: oblige level
internal fun PlayerActivity.showV1617ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1617: obscure level
internal fun PlayerActivity.showV1617ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1617: obtain mode
internal fun PlayerActivity.showV1617ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1617obtain
    FeaturePrefsStore.batch1611.v1617obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1617: obvious mode
internal fun PlayerActivity.showV1617ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1617obvious
    FeaturePrefsStore.batch1611.v1617obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1617: occur mode
internal fun PlayerActivity.showV1617OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1617occur
    FeaturePrefsStore.batch1611.v1617occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1617: ocean mode
internal fun PlayerActivity.showV1617OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1617ocean
    FeaturePrefsStore.batch1611.v1617ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1617: october mode
internal fun PlayerActivity.showV1617OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1617october
    FeaturePrefsStore.batch1611.v1617october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1618: nothing mode
internal fun PlayerActivity.showV1618NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nothing
    FeaturePrefsStore.batch1611.v1618nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1618: notice mode
internal fun PlayerActivity.showV1618NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1618notice
    FeaturePrefsStore.batch1611.v1618notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1618: novel mode
internal fun PlayerActivity.showV1618NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1618novel
    FeaturePrefsStore.batch1611.v1618novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1618: nuclear mode
internal fun PlayerActivity.showV1618NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nuclear
    FeaturePrefsStore.batch1611.v1618nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1618: nurse mode
internal fun PlayerActivity.showV1618NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nurse
    FeaturePrefsStore.batch1611.v1618nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1618: nylon level
internal fun PlayerActivity.showV1618NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1618: oak level
internal fun PlayerActivity.showV1618OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1618: obey level
internal fun PlayerActivity.showV1618ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1618: oblige level
internal fun PlayerActivity.showV1618ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1618: obscure level
internal fun PlayerActivity.showV1618ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1618: obtain mode
internal fun PlayerActivity.showV1618ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1618obtain
    FeaturePrefsStore.batch1611.v1618obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1618: obvious mode
internal fun PlayerActivity.showV1618ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1618obvious
    FeaturePrefsStore.batch1611.v1618obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1618: occur mode
internal fun PlayerActivity.showV1618OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1618occur
    FeaturePrefsStore.batch1611.v1618occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1618: ocean mode
internal fun PlayerActivity.showV1618OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1618ocean
    FeaturePrefsStore.batch1611.v1618ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1618: october mode
internal fun PlayerActivity.showV1618OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1618october
    FeaturePrefsStore.batch1611.v1618october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1619: nothing mode
internal fun PlayerActivity.showV1619NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nothing
    FeaturePrefsStore.batch1611.v1619nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1619: notice mode
internal fun PlayerActivity.showV1619NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1619notice
    FeaturePrefsStore.batch1611.v1619notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1619: novel mode
internal fun PlayerActivity.showV1619NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1619novel
    FeaturePrefsStore.batch1611.v1619novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1619: nuclear mode
internal fun PlayerActivity.showV1619NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nuclear
    FeaturePrefsStore.batch1611.v1619nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1619: nurse mode
internal fun PlayerActivity.showV1619NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nurse
    FeaturePrefsStore.batch1611.v1619nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1619: nylon level
internal fun PlayerActivity.showV1619NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1619: oak level
internal fun PlayerActivity.showV1619OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1619: obey level
internal fun PlayerActivity.showV1619ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1619: oblige level
internal fun PlayerActivity.showV1619ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1619: obscure level
internal fun PlayerActivity.showV1619ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1619: obtain mode
internal fun PlayerActivity.showV1619ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1619obtain
    FeaturePrefsStore.batch1611.v1619obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1619: obvious mode
internal fun PlayerActivity.showV1619ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1619obvious
    FeaturePrefsStore.batch1611.v1619obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1619: occur mode
internal fun PlayerActivity.showV1619OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1619occur
    FeaturePrefsStore.batch1611.v1619occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1619: ocean mode
internal fun PlayerActivity.showV1619OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1619ocean
    FeaturePrefsStore.batch1611.v1619ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1619: october mode
internal fun PlayerActivity.showV1619OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1619october
    FeaturePrefsStore.batch1611.v1619october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1620: nothing mode
internal fun PlayerActivity.showV1620NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nothing
    FeaturePrefsStore.batch1611.v1620nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1620: notice mode
internal fun PlayerActivity.showV1620NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1620notice
    FeaturePrefsStore.batch1611.v1620notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1620: novel mode
internal fun PlayerActivity.showV1620NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1620novel
    FeaturePrefsStore.batch1611.v1620novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1620: nuclear mode
internal fun PlayerActivity.showV1620NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nuclear
    FeaturePrefsStore.batch1611.v1620nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1620: nurse mode
internal fun PlayerActivity.showV1620NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nurse
    FeaturePrefsStore.batch1611.v1620nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1620: nylon level
internal fun PlayerActivity.showV1620NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1620: oak level
internal fun PlayerActivity.showV1620OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1620: obey level
internal fun PlayerActivity.showV1620ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1620: oblige level
internal fun PlayerActivity.showV1620ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1620: obscure level
internal fun PlayerActivity.showV1620ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1620: obtain mode
internal fun PlayerActivity.showV1620ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1620obtain
    FeaturePrefsStore.batch1611.v1620obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1620: obvious mode
internal fun PlayerActivity.showV1620ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1620obvious
    FeaturePrefsStore.batch1611.v1620obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1620: occur mode
internal fun PlayerActivity.showV1620OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1620occur
    FeaturePrefsStore.batch1611.v1620occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1620: ocean mode
internal fun PlayerActivity.showV1620OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1620ocean
    FeaturePrefsStore.batch1611.v1620ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1620: october mode
internal fun PlayerActivity.showV1620OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1620october
    FeaturePrefsStore.batch1611.v1620october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1621: odor mode
internal fun PlayerActivity.showV1621OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1621odor
    FeaturePrefsStore.batch1621.v1621odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1621: off mode
internal fun PlayerActivity.showV1621OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1621off
    FeaturePrefsStore.batch1621.v1621off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1621: offer mode
internal fun PlayerActivity.showV1621OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1621offer
    FeaturePrefsStore.batch1621.v1621offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1621: office mode
internal fun PlayerActivity.showV1621OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1621office
    FeaturePrefsStore.batch1621.v1621office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1621: often mode
internal fun PlayerActivity.showV1621OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1621often
    FeaturePrefsStore.batch1621.v1621often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1621: oil level
internal fun PlayerActivity.showV1621OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1621: okay level
internal fun PlayerActivity.showV1621OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1621: olive level
internal fun PlayerActivity.showV1621OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1621: omit level
internal fun PlayerActivity.showV1621OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1621: once level
internal fun PlayerActivity.showV1621OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621once = value
        AppToast.show(this, "once: $value")
    }
}

// v1621: one mode
internal fun PlayerActivity.showV1621OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1621one
    FeaturePrefsStore.batch1621.v1621one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1621: onion mode
internal fun PlayerActivity.showV1621OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1621onion
    FeaturePrefsStore.batch1621.v1621onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1621: online mode
internal fun PlayerActivity.showV1621OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1621online
    FeaturePrefsStore.batch1621.v1621online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1621: only mode
internal fun PlayerActivity.showV1621OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1621only
    FeaturePrefsStore.batch1621.v1621only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1621: onto mode
internal fun PlayerActivity.showV1621OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1621onto
    FeaturePrefsStore.batch1621.v1621onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1622: odor mode
internal fun PlayerActivity.showV1622OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1622odor
    FeaturePrefsStore.batch1621.v1622odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1622: off mode
internal fun PlayerActivity.showV1622OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1622off
    FeaturePrefsStore.batch1621.v1622off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1622: offer mode
internal fun PlayerActivity.showV1622OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1622offer
    FeaturePrefsStore.batch1621.v1622offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1622: office mode
internal fun PlayerActivity.showV1622OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1622office
    FeaturePrefsStore.batch1621.v1622office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1622: often mode
internal fun PlayerActivity.showV1622OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1622often
    FeaturePrefsStore.batch1621.v1622often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1622: oil level
internal fun PlayerActivity.showV1622OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1622: okay level
internal fun PlayerActivity.showV1622OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1622: olive level
internal fun PlayerActivity.showV1622OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1622: omit level
internal fun PlayerActivity.showV1622OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1622: once level
internal fun PlayerActivity.showV1622OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622once = value
        AppToast.show(this, "once: $value")
    }
}

// v1622: one mode
internal fun PlayerActivity.showV1622OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1622one
    FeaturePrefsStore.batch1621.v1622one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1622: onion mode
internal fun PlayerActivity.showV1622OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1622onion
    FeaturePrefsStore.batch1621.v1622onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1622: online mode
internal fun PlayerActivity.showV1622OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1622online
    FeaturePrefsStore.batch1621.v1622online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1622: only mode
internal fun PlayerActivity.showV1622OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1622only
    FeaturePrefsStore.batch1621.v1622only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1622: onto mode
internal fun PlayerActivity.showV1622OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1622onto
    FeaturePrefsStore.batch1621.v1622onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1623: odor mode
internal fun PlayerActivity.showV1623OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1623odor
    FeaturePrefsStore.batch1621.v1623odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1623: off mode
internal fun PlayerActivity.showV1623OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1623off
    FeaturePrefsStore.batch1621.v1623off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1623: offer mode
internal fun PlayerActivity.showV1623OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1623offer
    FeaturePrefsStore.batch1621.v1623offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1623: office mode
internal fun PlayerActivity.showV1623OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1623office
    FeaturePrefsStore.batch1621.v1623office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1623: often mode
internal fun PlayerActivity.showV1623OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1623often
    FeaturePrefsStore.batch1621.v1623often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1623: oil level
internal fun PlayerActivity.showV1623OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1623: okay level
internal fun PlayerActivity.showV1623OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1623: olive level
internal fun PlayerActivity.showV1623OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1623: omit level
internal fun PlayerActivity.showV1623OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1623: once level
internal fun PlayerActivity.showV1623OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623once = value
        AppToast.show(this, "once: $value")
    }
}

// v1623: one mode
internal fun PlayerActivity.showV1623OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1623one
    FeaturePrefsStore.batch1621.v1623one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1623: onion mode
internal fun PlayerActivity.showV1623OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1623onion
    FeaturePrefsStore.batch1621.v1623onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1623: online mode
internal fun PlayerActivity.showV1623OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1623online
    FeaturePrefsStore.batch1621.v1623online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1623: only mode
internal fun PlayerActivity.showV1623OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1623only
    FeaturePrefsStore.batch1621.v1623only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1623: onto mode
internal fun PlayerActivity.showV1623OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1623onto
    FeaturePrefsStore.batch1621.v1623onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1624: odor mode
internal fun PlayerActivity.showV1624OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1624odor
    FeaturePrefsStore.batch1621.v1624odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1624: off mode
internal fun PlayerActivity.showV1624OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1624off
    FeaturePrefsStore.batch1621.v1624off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1624: offer mode
internal fun PlayerActivity.showV1624OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1624offer
    FeaturePrefsStore.batch1621.v1624offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1624: office mode
internal fun PlayerActivity.showV1624OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1624office
    FeaturePrefsStore.batch1621.v1624office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1624: often mode
internal fun PlayerActivity.showV1624OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1624often
    FeaturePrefsStore.batch1621.v1624often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1624: oil level
internal fun PlayerActivity.showV1624OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1624: okay level
internal fun PlayerActivity.showV1624OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1624: olive level
internal fun PlayerActivity.showV1624OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1624: omit level
internal fun PlayerActivity.showV1624OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1624: once level
internal fun PlayerActivity.showV1624OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624once = value
        AppToast.show(this, "once: $value")
    }
}

// v1624: one mode
internal fun PlayerActivity.showV1624OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1624one
    FeaturePrefsStore.batch1621.v1624one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1624: onion mode
internal fun PlayerActivity.showV1624OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1624onion
    FeaturePrefsStore.batch1621.v1624onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1624: online mode
internal fun PlayerActivity.showV1624OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1624online
    FeaturePrefsStore.batch1621.v1624online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1624: only mode
internal fun PlayerActivity.showV1624OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1624only
    FeaturePrefsStore.batch1621.v1624only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1624: onto mode
internal fun PlayerActivity.showV1624OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1624onto
    FeaturePrefsStore.batch1621.v1624onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1625: odor mode
internal fun PlayerActivity.showV1625OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1625odor
    FeaturePrefsStore.batch1621.v1625odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1625: off mode
internal fun PlayerActivity.showV1625OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1625off
    FeaturePrefsStore.batch1621.v1625off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1625: offer mode
internal fun PlayerActivity.showV1625OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1625offer
    FeaturePrefsStore.batch1621.v1625offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1625: office mode
internal fun PlayerActivity.showV1625OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1625office
    FeaturePrefsStore.batch1621.v1625office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1625: often mode
internal fun PlayerActivity.showV1625OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1625often
    FeaturePrefsStore.batch1621.v1625often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1625: oil level
internal fun PlayerActivity.showV1625OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1625: okay level
internal fun PlayerActivity.showV1625OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1625: olive level
internal fun PlayerActivity.showV1625OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1625: omit level
internal fun PlayerActivity.showV1625OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1625: once level
internal fun PlayerActivity.showV1625OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625once = value
        AppToast.show(this, "once: $value")
    }
}

// v1625: one mode
internal fun PlayerActivity.showV1625OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1625one
    FeaturePrefsStore.batch1621.v1625one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1625: onion mode
internal fun PlayerActivity.showV1625OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1625onion
    FeaturePrefsStore.batch1621.v1625onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1625: online mode
internal fun PlayerActivity.showV1625OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1625online
    FeaturePrefsStore.batch1621.v1625online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1625: only mode
internal fun PlayerActivity.showV1625OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1625only
    FeaturePrefsStore.batch1621.v1625only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1625: onto mode
internal fun PlayerActivity.showV1625OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1625onto
    FeaturePrefsStore.batch1621.v1625onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1626: odor mode
internal fun PlayerActivity.showV1626OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1626odor
    FeaturePrefsStore.batch1621.v1626odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1626: off mode
internal fun PlayerActivity.showV1626OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1626off
    FeaturePrefsStore.batch1621.v1626off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1626: offer mode
internal fun PlayerActivity.showV1626OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1626offer
    FeaturePrefsStore.batch1621.v1626offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1626: office mode
internal fun PlayerActivity.showV1626OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1626office
    FeaturePrefsStore.batch1621.v1626office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1626: often mode
internal fun PlayerActivity.showV1626OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1626often
    FeaturePrefsStore.batch1621.v1626often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1626: oil level
internal fun PlayerActivity.showV1626OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1626: okay level
internal fun PlayerActivity.showV1626OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1626: olive level
internal fun PlayerActivity.showV1626OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1626: omit level
internal fun PlayerActivity.showV1626OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1626: once level
internal fun PlayerActivity.showV1626OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626once = value
        AppToast.show(this, "once: $value")
    }
}

// v1626: one mode
internal fun PlayerActivity.showV1626OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1626one
    FeaturePrefsStore.batch1621.v1626one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1626: onion mode
internal fun PlayerActivity.showV1626OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1626onion
    FeaturePrefsStore.batch1621.v1626onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1626: online mode
internal fun PlayerActivity.showV1626OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1626online
    FeaturePrefsStore.batch1621.v1626online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1626: only mode
internal fun PlayerActivity.showV1626OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1626only
    FeaturePrefsStore.batch1621.v1626only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1626: onto mode
internal fun PlayerActivity.showV1626OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1626onto
    FeaturePrefsStore.batch1621.v1626onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1627: odor mode
internal fun PlayerActivity.showV1627OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1627odor
    FeaturePrefsStore.batch1621.v1627odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1627: off mode
internal fun PlayerActivity.showV1627OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1627off
    FeaturePrefsStore.batch1621.v1627off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1627: offer mode
internal fun PlayerActivity.showV1627OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1627offer
    FeaturePrefsStore.batch1621.v1627offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1627: office mode
internal fun PlayerActivity.showV1627OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1627office
    FeaturePrefsStore.batch1621.v1627office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1627: often mode
internal fun PlayerActivity.showV1627OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1627often
    FeaturePrefsStore.batch1621.v1627often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1627: oil level
internal fun PlayerActivity.showV1627OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1627: okay level
internal fun PlayerActivity.showV1627OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1627: olive level
internal fun PlayerActivity.showV1627OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1627: omit level
internal fun PlayerActivity.showV1627OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1627: once level
internal fun PlayerActivity.showV1627OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627once = value
        AppToast.show(this, "once: $value")
    }
}

// v1627: one mode
internal fun PlayerActivity.showV1627OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1627one
    FeaturePrefsStore.batch1621.v1627one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1627: onion mode
internal fun PlayerActivity.showV1627OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1627onion
    FeaturePrefsStore.batch1621.v1627onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1627: online mode
internal fun PlayerActivity.showV1627OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1627online
    FeaturePrefsStore.batch1621.v1627online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1627: only mode
internal fun PlayerActivity.showV1627OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1627only
    FeaturePrefsStore.batch1621.v1627only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1627: onto mode
internal fun PlayerActivity.showV1627OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1627onto
    FeaturePrefsStore.batch1621.v1627onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1628: odor mode
internal fun PlayerActivity.showV1628OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1628odor
    FeaturePrefsStore.batch1621.v1628odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1628: off mode
internal fun PlayerActivity.showV1628OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1628off
    FeaturePrefsStore.batch1621.v1628off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1628: offer mode
internal fun PlayerActivity.showV1628OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1628offer
    FeaturePrefsStore.batch1621.v1628offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1628: office mode
internal fun PlayerActivity.showV1628OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1628office
    FeaturePrefsStore.batch1621.v1628office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1628: often mode
internal fun PlayerActivity.showV1628OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1628often
    FeaturePrefsStore.batch1621.v1628often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1628: oil level
internal fun PlayerActivity.showV1628OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1628: okay level
internal fun PlayerActivity.showV1628OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1628: olive level
internal fun PlayerActivity.showV1628OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1628: omit level
internal fun PlayerActivity.showV1628OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1628: once level
internal fun PlayerActivity.showV1628OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628once = value
        AppToast.show(this, "once: $value")
    }
}

// v1628: one mode
internal fun PlayerActivity.showV1628OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1628one
    FeaturePrefsStore.batch1621.v1628one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1628: onion mode
internal fun PlayerActivity.showV1628OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1628onion
    FeaturePrefsStore.batch1621.v1628onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1628: online mode
internal fun PlayerActivity.showV1628OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1628online
    FeaturePrefsStore.batch1621.v1628online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1628: only mode
internal fun PlayerActivity.showV1628OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1628only
    FeaturePrefsStore.batch1621.v1628only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1628: onto mode
internal fun PlayerActivity.showV1628OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1628onto
    FeaturePrefsStore.batch1621.v1628onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1629: odor mode
internal fun PlayerActivity.showV1629OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1629odor
    FeaturePrefsStore.batch1621.v1629odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1629: off mode
internal fun PlayerActivity.showV1629OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1629off
    FeaturePrefsStore.batch1621.v1629off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1629: offer mode
internal fun PlayerActivity.showV1629OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1629offer
    FeaturePrefsStore.batch1621.v1629offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1629: office mode
internal fun PlayerActivity.showV1629OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1629office
    FeaturePrefsStore.batch1621.v1629office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1629: often mode
internal fun PlayerActivity.showV1629OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1629often
    FeaturePrefsStore.batch1621.v1629often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1629: oil level
internal fun PlayerActivity.showV1629OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1629: okay level
internal fun PlayerActivity.showV1629OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1629: olive level
internal fun PlayerActivity.showV1629OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1629: omit level
internal fun PlayerActivity.showV1629OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1629: once level
internal fun PlayerActivity.showV1629OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629once = value
        AppToast.show(this, "once: $value")
    }
}

// v1629: one mode
internal fun PlayerActivity.showV1629OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1629one
    FeaturePrefsStore.batch1621.v1629one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1629: onion mode
internal fun PlayerActivity.showV1629OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1629onion
    FeaturePrefsStore.batch1621.v1629onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1629: online mode
internal fun PlayerActivity.showV1629OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1629online
    FeaturePrefsStore.batch1621.v1629online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1629: only mode
internal fun PlayerActivity.showV1629OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1629only
    FeaturePrefsStore.batch1621.v1629only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1629: onto mode
internal fun PlayerActivity.showV1629OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1629onto
    FeaturePrefsStore.batch1621.v1629onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1630: odor mode
internal fun PlayerActivity.showV1630OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1630odor
    FeaturePrefsStore.batch1621.v1630odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1630: off mode
internal fun PlayerActivity.showV1630OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1630off
    FeaturePrefsStore.batch1621.v1630off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1630: offer mode
internal fun PlayerActivity.showV1630OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1630offer
    FeaturePrefsStore.batch1621.v1630offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1630: office mode
internal fun PlayerActivity.showV1630OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1630office
    FeaturePrefsStore.batch1621.v1630office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1630: often mode
internal fun PlayerActivity.showV1630OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1630often
    FeaturePrefsStore.batch1621.v1630often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1630: oil level
internal fun PlayerActivity.showV1630OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1630: okay level
internal fun PlayerActivity.showV1630OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1630: olive level
internal fun PlayerActivity.showV1630OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1630: omit level
internal fun PlayerActivity.showV1630OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1630: once level
internal fun PlayerActivity.showV1630OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630once = value
        AppToast.show(this, "once: $value")
    }
}

// v1630: one mode
internal fun PlayerActivity.showV1630OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1630one
    FeaturePrefsStore.batch1621.v1630one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1630: onion mode
internal fun PlayerActivity.showV1630OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1630onion
    FeaturePrefsStore.batch1621.v1630onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1630: online mode
internal fun PlayerActivity.showV1630OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1630online
    FeaturePrefsStore.batch1621.v1630online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1630: only mode
internal fun PlayerActivity.showV1630OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1630only
    FeaturePrefsStore.batch1621.v1630only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1630: onto mode
internal fun PlayerActivity.showV1630OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1630onto
    FeaturePrefsStore.batch1621.v1630onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1631: opera mode
internal fun PlayerActivity.showV1631OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1631opera
    FeaturePrefsStore.batch1631.v1631opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1631: opinion mode
internal fun PlayerActivity.showV1631OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1631opinion
    FeaturePrefsStore.batch1631.v1631opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1631: orange mode
internal fun PlayerActivity.showV1631OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1631orange
    FeaturePrefsStore.batch1631.v1631orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1631: ordinary mode
internal fun PlayerActivity.showV1631OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1631ordinary
    FeaturePrefsStore.batch1631.v1631ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1631: organ mode
internal fun PlayerActivity.showV1631OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1631organ
    FeaturePrefsStore.batch1631.v1631organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1631: orient level
internal fun PlayerActivity.showV1631OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1631: orphan level
internal fun PlayerActivity.showV1631OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1631: ostrich level
internal fun PlayerActivity.showV1631OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1631: other level
internal fun PlayerActivity.showV1631OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631other = value
        AppToast.show(this, "other: $value")
    }
}

// v1631: outdoor level
internal fun PlayerActivity.showV1631OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1631outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1631outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1631: outer mode
internal fun PlayerActivity.showV1631OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1631outer
    FeaturePrefsStore.batch1631.v1631outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1631: outside mode
internal fun PlayerActivity.showV1631OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1631outside
    FeaturePrefsStore.batch1631.v1631outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1631: oval mode
internal fun PlayerActivity.showV1631OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1631oval
    FeaturePrefsStore.batch1631.v1631oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1631: oven mode
internal fun PlayerActivity.showV1631OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1631oven
    FeaturePrefsStore.batch1631.v1631oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1631: over mode
internal fun PlayerActivity.showV1631OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1631over
    FeaturePrefsStore.batch1631.v1631over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1632: opera mode
internal fun PlayerActivity.showV1632OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1632opera
    FeaturePrefsStore.batch1631.v1632opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1632: opinion mode
internal fun PlayerActivity.showV1632OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1632opinion
    FeaturePrefsStore.batch1631.v1632opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1632: orange mode
internal fun PlayerActivity.showV1632OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1632orange
    FeaturePrefsStore.batch1631.v1632orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1632: ordinary mode
internal fun PlayerActivity.showV1632OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1632ordinary
    FeaturePrefsStore.batch1631.v1632ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1632: organ mode
internal fun PlayerActivity.showV1632OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1632organ
    FeaturePrefsStore.batch1631.v1632organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1632: orient level
internal fun PlayerActivity.showV1632OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1632: orphan level
internal fun PlayerActivity.showV1632OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1632: ostrich level
internal fun PlayerActivity.showV1632OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1632: other level
internal fun PlayerActivity.showV1632OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632other = value
        AppToast.show(this, "other: $value")
    }
}

// v1632: outdoor level
internal fun PlayerActivity.showV1632OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1632outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1632outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1632: outer mode
internal fun PlayerActivity.showV1632OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1632outer
    FeaturePrefsStore.batch1631.v1632outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1632: outside mode
internal fun PlayerActivity.showV1632OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1632outside
    FeaturePrefsStore.batch1631.v1632outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1632: oval mode
internal fun PlayerActivity.showV1632OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1632oval
    FeaturePrefsStore.batch1631.v1632oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1632: oven mode
internal fun PlayerActivity.showV1632OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1632oven
    FeaturePrefsStore.batch1631.v1632oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1632: over mode
internal fun PlayerActivity.showV1632OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1632over
    FeaturePrefsStore.batch1631.v1632over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1633: opera mode
internal fun PlayerActivity.showV1633OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1633opera
    FeaturePrefsStore.batch1631.v1633opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1633: opinion mode
internal fun PlayerActivity.showV1633OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1633opinion
    FeaturePrefsStore.batch1631.v1633opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1633: orange mode
internal fun PlayerActivity.showV1633OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1633orange
    FeaturePrefsStore.batch1631.v1633orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1633: ordinary mode
internal fun PlayerActivity.showV1633OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1633ordinary
    FeaturePrefsStore.batch1631.v1633ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1633: organ mode
internal fun PlayerActivity.showV1633OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1633organ
    FeaturePrefsStore.batch1631.v1633organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1633: orient level
internal fun PlayerActivity.showV1633OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1633: orphan level
internal fun PlayerActivity.showV1633OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1633: ostrich level
internal fun PlayerActivity.showV1633OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1633: other level
internal fun PlayerActivity.showV1633OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633other = value
        AppToast.show(this, "other: $value")
    }
}

// v1633: outdoor level
internal fun PlayerActivity.showV1633OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1633outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1633outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1633: outer mode
internal fun PlayerActivity.showV1633OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1633outer
    FeaturePrefsStore.batch1631.v1633outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1633: outside mode
internal fun PlayerActivity.showV1633OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1633outside
    FeaturePrefsStore.batch1631.v1633outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1633: oval mode
internal fun PlayerActivity.showV1633OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1633oval
    FeaturePrefsStore.batch1631.v1633oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1633: oven mode
internal fun PlayerActivity.showV1633OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1633oven
    FeaturePrefsStore.batch1631.v1633oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1633: over mode
internal fun PlayerActivity.showV1633OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1633over
    FeaturePrefsStore.batch1631.v1633over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1634: opera mode
internal fun PlayerActivity.showV1634OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1634opera
    FeaturePrefsStore.batch1631.v1634opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1634: opinion mode
internal fun PlayerActivity.showV1634OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1634opinion
    FeaturePrefsStore.batch1631.v1634opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1634: orange mode
internal fun PlayerActivity.showV1634OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1634orange
    FeaturePrefsStore.batch1631.v1634orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1634: ordinary mode
internal fun PlayerActivity.showV1634OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1634ordinary
    FeaturePrefsStore.batch1631.v1634ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1634: organ mode
internal fun PlayerActivity.showV1634OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1634organ
    FeaturePrefsStore.batch1631.v1634organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1634: orient level
internal fun PlayerActivity.showV1634OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1634: orphan level
internal fun PlayerActivity.showV1634OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1634: ostrich level
internal fun PlayerActivity.showV1634OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1634: other level
internal fun PlayerActivity.showV1634OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634other = value
        AppToast.show(this, "other: $value")
    }
}

// v1634: outdoor level
internal fun PlayerActivity.showV1634OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1634outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1634outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1634: outer mode
internal fun PlayerActivity.showV1634OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1634outer
    FeaturePrefsStore.batch1631.v1634outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1634: outside mode
internal fun PlayerActivity.showV1634OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1634outside
    FeaturePrefsStore.batch1631.v1634outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1634: oval mode
internal fun PlayerActivity.showV1634OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1634oval
    FeaturePrefsStore.batch1631.v1634oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1634: oven mode
internal fun PlayerActivity.showV1634OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1634oven
    FeaturePrefsStore.batch1631.v1634oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1634: over mode
internal fun PlayerActivity.showV1634OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1634over
    FeaturePrefsStore.batch1631.v1634over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1635: opera mode
internal fun PlayerActivity.showV1635OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1635opera
    FeaturePrefsStore.batch1631.v1635opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1635: opinion mode
internal fun PlayerActivity.showV1635OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1635opinion
    FeaturePrefsStore.batch1631.v1635opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1635: orange mode
internal fun PlayerActivity.showV1635OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1635orange
    FeaturePrefsStore.batch1631.v1635orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1635: ordinary mode
internal fun PlayerActivity.showV1635OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1635ordinary
    FeaturePrefsStore.batch1631.v1635ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1635: organ mode
internal fun PlayerActivity.showV1635OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1635organ
    FeaturePrefsStore.batch1631.v1635organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1635: orient level
internal fun PlayerActivity.showV1635OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1635: orphan level
internal fun PlayerActivity.showV1635OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1635: ostrich level
internal fun PlayerActivity.showV1635OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1635: other level
internal fun PlayerActivity.showV1635OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635other = value
        AppToast.show(this, "other: $value")
    }
}

// v1635: outdoor level
internal fun PlayerActivity.showV1635OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1635outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1635outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1635: outer mode
internal fun PlayerActivity.showV1635OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1635outer
    FeaturePrefsStore.batch1631.v1635outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1635: outside mode
internal fun PlayerActivity.showV1635OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1635outside
    FeaturePrefsStore.batch1631.v1635outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1635: oval mode
internal fun PlayerActivity.showV1635OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1635oval
    FeaturePrefsStore.batch1631.v1635oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1635: oven mode
internal fun PlayerActivity.showV1635OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1635oven
    FeaturePrefsStore.batch1631.v1635oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1635: over mode
internal fun PlayerActivity.showV1635OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1635over
    FeaturePrefsStore.batch1631.v1635over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1636: opera mode
internal fun PlayerActivity.showV1636OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1636opera
    FeaturePrefsStore.batch1631.v1636opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1636: opinion mode
internal fun PlayerActivity.showV1636OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1636opinion
    FeaturePrefsStore.batch1631.v1636opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1636: orange mode
internal fun PlayerActivity.showV1636OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1636orange
    FeaturePrefsStore.batch1631.v1636orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1636: ordinary mode
internal fun PlayerActivity.showV1636OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1636ordinary
    FeaturePrefsStore.batch1631.v1636ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1636: organ mode
internal fun PlayerActivity.showV1636OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1636organ
    FeaturePrefsStore.batch1631.v1636organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1636: orient level
internal fun PlayerActivity.showV1636OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1636: orphan level
internal fun PlayerActivity.showV1636OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1636: ostrich level
internal fun PlayerActivity.showV1636OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1636: other level
internal fun PlayerActivity.showV1636OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636other = value
        AppToast.show(this, "other: $value")
    }
}

// v1636: outdoor level
internal fun PlayerActivity.showV1636OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1636outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1636outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1636: outer mode
internal fun PlayerActivity.showV1636OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1636outer
    FeaturePrefsStore.batch1631.v1636outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1636: outside mode
internal fun PlayerActivity.showV1636OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1636outside
    FeaturePrefsStore.batch1631.v1636outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1636: oval mode
internal fun PlayerActivity.showV1636OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1636oval
    FeaturePrefsStore.batch1631.v1636oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1636: oven mode
internal fun PlayerActivity.showV1636OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1636oven
    FeaturePrefsStore.batch1631.v1636oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1636: over mode
internal fun PlayerActivity.showV1636OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1636over
    FeaturePrefsStore.batch1631.v1636over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1637: opera mode
internal fun PlayerActivity.showV1637OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1637opera
    FeaturePrefsStore.batch1631.v1637opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1637: opinion mode
internal fun PlayerActivity.showV1637OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1637opinion
    FeaturePrefsStore.batch1631.v1637opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1637: orange mode
internal fun PlayerActivity.showV1637OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1637orange
    FeaturePrefsStore.batch1631.v1637orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1637: ordinary mode
internal fun PlayerActivity.showV1637OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1637ordinary
    FeaturePrefsStore.batch1631.v1637ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1637: organ mode
internal fun PlayerActivity.showV1637OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1637organ
    FeaturePrefsStore.batch1631.v1637organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1637: orient level
internal fun PlayerActivity.showV1637OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1637: orphan level
internal fun PlayerActivity.showV1637OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1637: ostrich level
internal fun PlayerActivity.showV1637OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1637: other level
internal fun PlayerActivity.showV1637OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637other = value
        AppToast.show(this, "other: $value")
    }
}

// v1637: outdoor level
internal fun PlayerActivity.showV1637OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1637outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1637outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1637: outer mode
internal fun PlayerActivity.showV1637OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1637outer
    FeaturePrefsStore.batch1631.v1637outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1637: outside mode
internal fun PlayerActivity.showV1637OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1637outside
    FeaturePrefsStore.batch1631.v1637outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1637: oval mode
internal fun PlayerActivity.showV1637OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1637oval
    FeaturePrefsStore.batch1631.v1637oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1637: oven mode
internal fun PlayerActivity.showV1637OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1637oven
    FeaturePrefsStore.batch1631.v1637oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1637: over mode
internal fun PlayerActivity.showV1637OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1637over
    FeaturePrefsStore.batch1631.v1637over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1638: opera mode
internal fun PlayerActivity.showV1638OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1638opera
    FeaturePrefsStore.batch1631.v1638opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1638: opinion mode
internal fun PlayerActivity.showV1638OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1638opinion
    FeaturePrefsStore.batch1631.v1638opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1638: orange mode
internal fun PlayerActivity.showV1638OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1638orange
    FeaturePrefsStore.batch1631.v1638orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1638: ordinary mode
internal fun PlayerActivity.showV1638OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1638ordinary
    FeaturePrefsStore.batch1631.v1638ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1638: organ mode
internal fun PlayerActivity.showV1638OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1638organ
    FeaturePrefsStore.batch1631.v1638organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1638: orient level
internal fun PlayerActivity.showV1638OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1638: orphan level
internal fun PlayerActivity.showV1638OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1638: ostrich level
internal fun PlayerActivity.showV1638OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1638: other level
internal fun PlayerActivity.showV1638OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638other = value
        AppToast.show(this, "other: $value")
    }
}

// v1638: outdoor level
internal fun PlayerActivity.showV1638OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1638outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1638outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1638: outer mode
internal fun PlayerActivity.showV1638OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1638outer
    FeaturePrefsStore.batch1631.v1638outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1638: outside mode
internal fun PlayerActivity.showV1638OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1638outside
    FeaturePrefsStore.batch1631.v1638outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1638: oval mode
internal fun PlayerActivity.showV1638OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1638oval
    FeaturePrefsStore.batch1631.v1638oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1638: oven mode
internal fun PlayerActivity.showV1638OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1638oven
    FeaturePrefsStore.batch1631.v1638oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1638: over mode
internal fun PlayerActivity.showV1638OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1638over
    FeaturePrefsStore.batch1631.v1638over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1639: opera mode
internal fun PlayerActivity.showV1639OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1639opera
    FeaturePrefsStore.batch1631.v1639opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1639: opinion mode
internal fun PlayerActivity.showV1639OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1639opinion
    FeaturePrefsStore.batch1631.v1639opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1639: orange mode
internal fun PlayerActivity.showV1639OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1639orange
    FeaturePrefsStore.batch1631.v1639orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1639: ordinary mode
internal fun PlayerActivity.showV1639OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1639ordinary
    FeaturePrefsStore.batch1631.v1639ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1639: organ mode
internal fun PlayerActivity.showV1639OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1639organ
    FeaturePrefsStore.batch1631.v1639organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1639: orient level
internal fun PlayerActivity.showV1639OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1639: orphan level
internal fun PlayerActivity.showV1639OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1639: ostrich level
internal fun PlayerActivity.showV1639OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1639: other level
internal fun PlayerActivity.showV1639OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639other = value
        AppToast.show(this, "other: $value")
    }
}

// v1639: outdoor level
internal fun PlayerActivity.showV1639OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1639outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1639outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1639: outer mode
internal fun PlayerActivity.showV1639OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1639outer
    FeaturePrefsStore.batch1631.v1639outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1639: outside mode
internal fun PlayerActivity.showV1639OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1639outside
    FeaturePrefsStore.batch1631.v1639outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1639: oval mode
internal fun PlayerActivity.showV1639OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1639oval
    FeaturePrefsStore.batch1631.v1639oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1639: oven mode
internal fun PlayerActivity.showV1639OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1639oven
    FeaturePrefsStore.batch1631.v1639oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1639: over mode
internal fun PlayerActivity.showV1639OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1639over
    FeaturePrefsStore.batch1631.v1639over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}

// v1640: opera mode
internal fun PlayerActivity.showV1640OperaToggle() {
    val current = FeaturePrefsStore.batch1631.v1640opera
    FeaturePrefsStore.batch1631.v1640opera = !current
    AppToast.show(this, "opera: ${if (!current) "ON" else "OFF"}")
}

// v1640: opinion mode
internal fun PlayerActivity.showV1640OpinionToggle() {
    val current = FeaturePrefsStore.batch1631.v1640opinion
    FeaturePrefsStore.batch1631.v1640opinion = !current
    AppToast.show(this, "opinion: ${if (!current) "ON" else "OFF"}")
}

// v1640: orange mode
internal fun PlayerActivity.showV1640OrangeToggle() {
    val current = FeaturePrefsStore.batch1631.v1640orange
    FeaturePrefsStore.batch1631.v1640orange = !current
    AppToast.show(this, "orange: ${if (!current) "ON" else "OFF"}")
}

// v1640: ordinary mode
internal fun PlayerActivity.showV1640OrdinaryToggle() {
    val current = FeaturePrefsStore.batch1631.v1640ordinary
    FeaturePrefsStore.batch1631.v1640ordinary = !current
    AppToast.show(this, "ordinary: ${if (!current) "ON" else "OFF"}")
}

// v1640: organ mode
internal fun PlayerActivity.showV1640OrganToggle() {
    val current = FeaturePrefsStore.batch1631.v1640organ
    FeaturePrefsStore.batch1631.v1640organ = !current
    AppToast.show(this, "organ: ${if (!current) "ON" else "OFF"}")
}

// v1640: orient level
internal fun PlayerActivity.showV1640OrientDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640orient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orient level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640orient = value
        AppToast.show(this, "orient: $value")
    }
}

// v1640: orphan level
internal fun PlayerActivity.showV1640OrphanDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640orphan).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "orphan level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640orphan = value
        AppToast.show(this, "orphan: $value")
    }
}

// v1640: ostrich level
internal fun PlayerActivity.showV1640OstrichDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640ostrich).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ostrich level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640ostrich = value
        AppToast.show(this, "ostrich: $value")
    }
}

// v1640: other level
internal fun PlayerActivity.showV1640OtherDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640other).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "other level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640other = value
        AppToast.show(this, "other: $value")
    }
}

// v1640: outdoor level
internal fun PlayerActivity.showV1640OutdoorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1631.v1640outdoor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "outdoor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1631.v1640outdoor = value
        AppToast.show(this, "outdoor: $value")
    }
}

// v1640: outer mode
internal fun PlayerActivity.showV1640OuterToggle() {
    val current = FeaturePrefsStore.batch1631.v1640outer
    FeaturePrefsStore.batch1631.v1640outer = !current
    AppToast.show(this, "outer: ${if (!current) "ON" else "OFF"}")
}

// v1640: outside mode
internal fun PlayerActivity.showV1640OutsideToggle() {
    val current = FeaturePrefsStore.batch1631.v1640outside
    FeaturePrefsStore.batch1631.v1640outside = !current
    AppToast.show(this, "outside: ${if (!current) "ON" else "OFF"}")
}

// v1640: oval mode
internal fun PlayerActivity.showV1640OvalToggle() {
    val current = FeaturePrefsStore.batch1631.v1640oval
    FeaturePrefsStore.batch1631.v1640oval = !current
    AppToast.show(this, "oval: ${if (!current) "ON" else "OFF"}")
}

// v1640: oven mode
internal fun PlayerActivity.showV1640OvenToggle() {
    val current = FeaturePrefsStore.batch1631.v1640oven
    FeaturePrefsStore.batch1631.v1640oven = !current
    AppToast.show(this, "oven: ${if (!current) "ON" else "OFF"}")
}

// v1640: over mode
internal fun PlayerActivity.showV1640OverToggle() {
    val current = FeaturePrefsStore.batch1631.v1640over
    FeaturePrefsStore.batch1631.v1640over = !current
    AppToast.show(this, "over: ${if (!current) "ON" else "OFF"}")
}
