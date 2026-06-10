package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2371: critical mode
internal fun PlayerActivity.showV2371CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2371critical
    FeaturePrefsStore.batch2371.v2371critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2371: crucial mode
internal fun PlayerActivity.showV2371CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2371crucial
    FeaturePrefsStore.batch2371.v2371crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2371: curious mode
internal fun PlayerActivity.showV2371CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2371curious
    FeaturePrefsStore.batch2371.v2371curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2371: decisive mode
internal fun PlayerActivity.showV2371DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2371decisive
    FeaturePrefsStore.batch2371.v2371decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2371: delicate mode
internal fun PlayerActivity.showV2371DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2371delicate
    FeaturePrefsStore.batch2371.v2371delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2371: delightful level
internal fun PlayerActivity.showV2371DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2371: dependent level
internal fun PlayerActivity.showV2371DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2371: desperate level
internal fun PlayerActivity.showV2371DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2371: detailed level
internal fun PlayerActivity.showV2371DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2371: devoted level
internal fun PlayerActivity.showV2371DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2371: different mode
internal fun PlayerActivity.showV2371DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2371different
    FeaturePrefsStore.batch2371.v2371different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2371: difficult mode
internal fun PlayerActivity.showV2371DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2371difficult
    FeaturePrefsStore.batch2371.v2371difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2371: diligent mode
internal fun PlayerActivity.showV2371DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2371diligent
    FeaturePrefsStore.batch2371.v2371diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2371: distinct mode
internal fun PlayerActivity.showV2371DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2371distinct
    FeaturePrefsStore.batch2371.v2371distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2371: diverse mode
internal fun PlayerActivity.showV2371DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2371diverse
    FeaturePrefsStore.batch2371.v2371diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2372: critical mode
internal fun PlayerActivity.showV2372CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2372critical
    FeaturePrefsStore.batch2371.v2372critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2372: crucial mode
internal fun PlayerActivity.showV2372CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2372crucial
    FeaturePrefsStore.batch2371.v2372crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2372: curious mode
internal fun PlayerActivity.showV2372CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2372curious
    FeaturePrefsStore.batch2371.v2372curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2372: decisive mode
internal fun PlayerActivity.showV2372DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2372decisive
    FeaturePrefsStore.batch2371.v2372decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2372: delicate mode
internal fun PlayerActivity.showV2372DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2372delicate
    FeaturePrefsStore.batch2371.v2372delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2372: delightful level
internal fun PlayerActivity.showV2372DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2372: dependent level
internal fun PlayerActivity.showV2372DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2372: desperate level
internal fun PlayerActivity.showV2372DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2372: detailed level
internal fun PlayerActivity.showV2372DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2372: devoted level
internal fun PlayerActivity.showV2372DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2372: different mode
internal fun PlayerActivity.showV2372DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2372different
    FeaturePrefsStore.batch2371.v2372different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2372: difficult mode
internal fun PlayerActivity.showV2372DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2372difficult
    FeaturePrefsStore.batch2371.v2372difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2372: diligent mode
internal fun PlayerActivity.showV2372DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2372diligent
    FeaturePrefsStore.batch2371.v2372diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2372: distinct mode
internal fun PlayerActivity.showV2372DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2372distinct
    FeaturePrefsStore.batch2371.v2372distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2372: diverse mode
internal fun PlayerActivity.showV2372DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2372diverse
    FeaturePrefsStore.batch2371.v2372diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2373: critical mode
internal fun PlayerActivity.showV2373CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2373critical
    FeaturePrefsStore.batch2371.v2373critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2373: crucial mode
internal fun PlayerActivity.showV2373CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2373crucial
    FeaturePrefsStore.batch2371.v2373crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2373: curious mode
internal fun PlayerActivity.showV2373CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2373curious
    FeaturePrefsStore.batch2371.v2373curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2373: decisive mode
internal fun PlayerActivity.showV2373DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2373decisive
    FeaturePrefsStore.batch2371.v2373decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2373: delicate mode
internal fun PlayerActivity.showV2373DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2373delicate
    FeaturePrefsStore.batch2371.v2373delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2373: delightful level
internal fun PlayerActivity.showV2373DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2373: dependent level
internal fun PlayerActivity.showV2373DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2373: desperate level
internal fun PlayerActivity.showV2373DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2373: detailed level
internal fun PlayerActivity.showV2373DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2373: devoted level
internal fun PlayerActivity.showV2373DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2373: different mode
internal fun PlayerActivity.showV2373DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2373different
    FeaturePrefsStore.batch2371.v2373different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2373: difficult mode
internal fun PlayerActivity.showV2373DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2373difficult
    FeaturePrefsStore.batch2371.v2373difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2373: diligent mode
internal fun PlayerActivity.showV2373DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2373diligent
    FeaturePrefsStore.batch2371.v2373diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2373: distinct mode
internal fun PlayerActivity.showV2373DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2373distinct
    FeaturePrefsStore.batch2371.v2373distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2373: diverse mode
internal fun PlayerActivity.showV2373DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2373diverse
    FeaturePrefsStore.batch2371.v2373diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2374: critical mode
internal fun PlayerActivity.showV2374CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2374critical
    FeaturePrefsStore.batch2371.v2374critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2374: crucial mode
internal fun PlayerActivity.showV2374CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2374crucial
    FeaturePrefsStore.batch2371.v2374crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2374: curious mode
internal fun PlayerActivity.showV2374CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2374curious
    FeaturePrefsStore.batch2371.v2374curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2374: decisive mode
internal fun PlayerActivity.showV2374DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2374decisive
    FeaturePrefsStore.batch2371.v2374decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2374: delicate mode
internal fun PlayerActivity.showV2374DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2374delicate
    FeaturePrefsStore.batch2371.v2374delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2374: delightful level
internal fun PlayerActivity.showV2374DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2374: dependent level
internal fun PlayerActivity.showV2374DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2374: desperate level
internal fun PlayerActivity.showV2374DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2374: detailed level
internal fun PlayerActivity.showV2374DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2374: devoted level
internal fun PlayerActivity.showV2374DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2374: different mode
internal fun PlayerActivity.showV2374DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2374different
    FeaturePrefsStore.batch2371.v2374different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2374: difficult mode
internal fun PlayerActivity.showV2374DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2374difficult
    FeaturePrefsStore.batch2371.v2374difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2374: diligent mode
internal fun PlayerActivity.showV2374DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2374diligent
    FeaturePrefsStore.batch2371.v2374diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2374: distinct mode
internal fun PlayerActivity.showV2374DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2374distinct
    FeaturePrefsStore.batch2371.v2374distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2374: diverse mode
internal fun PlayerActivity.showV2374DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2374diverse
    FeaturePrefsStore.batch2371.v2374diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2375: critical mode
internal fun PlayerActivity.showV2375CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2375critical
    FeaturePrefsStore.batch2371.v2375critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2375: crucial mode
internal fun PlayerActivity.showV2375CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2375crucial
    FeaturePrefsStore.batch2371.v2375crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2375: curious mode
internal fun PlayerActivity.showV2375CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2375curious
    FeaturePrefsStore.batch2371.v2375curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2375: decisive mode
internal fun PlayerActivity.showV2375DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2375decisive
    FeaturePrefsStore.batch2371.v2375decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2375: delicate mode
internal fun PlayerActivity.showV2375DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2375delicate
    FeaturePrefsStore.batch2371.v2375delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2375: delightful level
internal fun PlayerActivity.showV2375DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2375: dependent level
internal fun PlayerActivity.showV2375DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2375: desperate level
internal fun PlayerActivity.showV2375DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2375: detailed level
internal fun PlayerActivity.showV2375DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2375: devoted level
internal fun PlayerActivity.showV2375DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2375: different mode
internal fun PlayerActivity.showV2375DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2375different
    FeaturePrefsStore.batch2371.v2375different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2375: difficult mode
internal fun PlayerActivity.showV2375DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2375difficult
    FeaturePrefsStore.batch2371.v2375difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2375: diligent mode
internal fun PlayerActivity.showV2375DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2375diligent
    FeaturePrefsStore.batch2371.v2375diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2375: distinct mode
internal fun PlayerActivity.showV2375DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2375distinct
    FeaturePrefsStore.batch2371.v2375distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2375: diverse mode
internal fun PlayerActivity.showV2375DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2375diverse
    FeaturePrefsStore.batch2371.v2375diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2376: critical mode
internal fun PlayerActivity.showV2376CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2376critical
    FeaturePrefsStore.batch2371.v2376critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2376: crucial mode
internal fun PlayerActivity.showV2376CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2376crucial
    FeaturePrefsStore.batch2371.v2376crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2376: curious mode
internal fun PlayerActivity.showV2376CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2376curious
    FeaturePrefsStore.batch2371.v2376curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2376: decisive mode
internal fun PlayerActivity.showV2376DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2376decisive
    FeaturePrefsStore.batch2371.v2376decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2376: delicate mode
internal fun PlayerActivity.showV2376DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2376delicate
    FeaturePrefsStore.batch2371.v2376delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2376: delightful level
internal fun PlayerActivity.showV2376DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2376: dependent level
internal fun PlayerActivity.showV2376DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2376: desperate level
internal fun PlayerActivity.showV2376DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2376: detailed level
internal fun PlayerActivity.showV2376DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2376: devoted level
internal fun PlayerActivity.showV2376DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2376: different mode
internal fun PlayerActivity.showV2376DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2376different
    FeaturePrefsStore.batch2371.v2376different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2376: difficult mode
internal fun PlayerActivity.showV2376DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2376difficult
    FeaturePrefsStore.batch2371.v2376difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2376: diligent mode
internal fun PlayerActivity.showV2376DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2376diligent
    FeaturePrefsStore.batch2371.v2376diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2376: distinct mode
internal fun PlayerActivity.showV2376DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2376distinct
    FeaturePrefsStore.batch2371.v2376distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2376: diverse mode
internal fun PlayerActivity.showV2376DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2376diverse
    FeaturePrefsStore.batch2371.v2376diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2377: critical mode
internal fun PlayerActivity.showV2377CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2377critical
    FeaturePrefsStore.batch2371.v2377critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2377: crucial mode
internal fun PlayerActivity.showV2377CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2377crucial
    FeaturePrefsStore.batch2371.v2377crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2377: curious mode
internal fun PlayerActivity.showV2377CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2377curious
    FeaturePrefsStore.batch2371.v2377curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2377: decisive mode
internal fun PlayerActivity.showV2377DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2377decisive
    FeaturePrefsStore.batch2371.v2377decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2377: delicate mode
internal fun PlayerActivity.showV2377DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2377delicate
    FeaturePrefsStore.batch2371.v2377delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2377: delightful level
internal fun PlayerActivity.showV2377DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2377: dependent level
internal fun PlayerActivity.showV2377DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2377: desperate level
internal fun PlayerActivity.showV2377DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2377: detailed level
internal fun PlayerActivity.showV2377DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2377: devoted level
internal fun PlayerActivity.showV2377DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2377: different mode
internal fun PlayerActivity.showV2377DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2377different
    FeaturePrefsStore.batch2371.v2377different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2377: difficult mode
internal fun PlayerActivity.showV2377DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2377difficult
    FeaturePrefsStore.batch2371.v2377difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2377: diligent mode
internal fun PlayerActivity.showV2377DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2377diligent
    FeaturePrefsStore.batch2371.v2377diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2377: distinct mode
internal fun PlayerActivity.showV2377DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2377distinct
    FeaturePrefsStore.batch2371.v2377distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2377: diverse mode
internal fun PlayerActivity.showV2377DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2377diverse
    FeaturePrefsStore.batch2371.v2377diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2378: critical mode
internal fun PlayerActivity.showV2378CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2378critical
    FeaturePrefsStore.batch2371.v2378critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2378: crucial mode
internal fun PlayerActivity.showV2378CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2378crucial
    FeaturePrefsStore.batch2371.v2378crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2378: curious mode
internal fun PlayerActivity.showV2378CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2378curious
    FeaturePrefsStore.batch2371.v2378curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2378: decisive mode
internal fun PlayerActivity.showV2378DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2378decisive
    FeaturePrefsStore.batch2371.v2378decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2378: delicate mode
internal fun PlayerActivity.showV2378DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2378delicate
    FeaturePrefsStore.batch2371.v2378delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2378: delightful level
internal fun PlayerActivity.showV2378DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2378: dependent level
internal fun PlayerActivity.showV2378DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2378: desperate level
internal fun PlayerActivity.showV2378DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2378: detailed level
internal fun PlayerActivity.showV2378DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2378: devoted level
internal fun PlayerActivity.showV2378DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2378: different mode
internal fun PlayerActivity.showV2378DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2378different
    FeaturePrefsStore.batch2371.v2378different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2378: difficult mode
internal fun PlayerActivity.showV2378DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2378difficult
    FeaturePrefsStore.batch2371.v2378difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2378: diligent mode
internal fun PlayerActivity.showV2378DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2378diligent
    FeaturePrefsStore.batch2371.v2378diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2378: distinct mode
internal fun PlayerActivity.showV2378DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2378distinct
    FeaturePrefsStore.batch2371.v2378distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2378: diverse mode
internal fun PlayerActivity.showV2378DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2378diverse
    FeaturePrefsStore.batch2371.v2378diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2379: critical mode
internal fun PlayerActivity.showV2379CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2379critical
    FeaturePrefsStore.batch2371.v2379critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2379: crucial mode
internal fun PlayerActivity.showV2379CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2379crucial
    FeaturePrefsStore.batch2371.v2379crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2379: curious mode
internal fun PlayerActivity.showV2379CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2379curious
    FeaturePrefsStore.batch2371.v2379curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2379: decisive mode
internal fun PlayerActivity.showV2379DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2379decisive
    FeaturePrefsStore.batch2371.v2379decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2379: delicate mode
internal fun PlayerActivity.showV2379DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2379delicate
    FeaturePrefsStore.batch2371.v2379delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2379: delightful level
internal fun PlayerActivity.showV2379DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2379: dependent level
internal fun PlayerActivity.showV2379DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2379: desperate level
internal fun PlayerActivity.showV2379DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2379: detailed level
internal fun PlayerActivity.showV2379DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2379: devoted level
internal fun PlayerActivity.showV2379DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2379: different mode
internal fun PlayerActivity.showV2379DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2379different
    FeaturePrefsStore.batch2371.v2379different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2379: difficult mode
internal fun PlayerActivity.showV2379DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2379difficult
    FeaturePrefsStore.batch2371.v2379difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2379: diligent mode
internal fun PlayerActivity.showV2379DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2379diligent
    FeaturePrefsStore.batch2371.v2379diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2379: distinct mode
internal fun PlayerActivity.showV2379DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2379distinct
    FeaturePrefsStore.batch2371.v2379distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2379: diverse mode
internal fun PlayerActivity.showV2379DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2379diverse
    FeaturePrefsStore.batch2371.v2379diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2380: critical mode
internal fun PlayerActivity.showV2380CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2380critical
    FeaturePrefsStore.batch2371.v2380critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2380: crucial mode
internal fun PlayerActivity.showV2380CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2380crucial
    FeaturePrefsStore.batch2371.v2380crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2380: curious mode
internal fun PlayerActivity.showV2380CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2380curious
    FeaturePrefsStore.batch2371.v2380curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2380: decisive mode
internal fun PlayerActivity.showV2380DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2380decisive
    FeaturePrefsStore.batch2371.v2380decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2380: delicate mode
internal fun PlayerActivity.showV2380DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2380delicate
    FeaturePrefsStore.batch2371.v2380delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2380: delightful level
internal fun PlayerActivity.showV2380DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2380: dependent level
internal fun PlayerActivity.showV2380DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2380: desperate level
internal fun PlayerActivity.showV2380DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2380: detailed level
internal fun PlayerActivity.showV2380DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2380: devoted level
internal fun PlayerActivity.showV2380DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2380: different mode
internal fun PlayerActivity.showV2380DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2380different
    FeaturePrefsStore.batch2371.v2380different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2380: difficult mode
internal fun PlayerActivity.showV2380DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2380difficult
    FeaturePrefsStore.batch2371.v2380difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2380: diligent mode
internal fun PlayerActivity.showV2380DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2380diligent
    FeaturePrefsStore.batch2371.v2380diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2380: distinct mode
internal fun PlayerActivity.showV2380DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2380distinct
    FeaturePrefsStore.batch2371.v2380distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2380: diverse mode
internal fun PlayerActivity.showV2380DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2380diverse
    FeaturePrefsStore.batch2371.v2380diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

