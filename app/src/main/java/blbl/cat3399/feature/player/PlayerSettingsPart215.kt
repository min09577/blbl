package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2331: yielded mode
internal fun PlayerActivity.showV2331YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331yielded
    FeaturePrefsStore.batch2331.v2331yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2331: zeroed mode
internal fun PlayerActivity.showV2331ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331zeroed
    FeaturePrefsStore.batch2331.v2331zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2331: zoomed mode
internal fun PlayerActivity.showV2331ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331zoomed
    FeaturePrefsStore.batch2331.v2331zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2331: abundant mode
internal fun PlayerActivity.showV2331AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2331abundant
    FeaturePrefsStore.batch2331.v2331abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2331: accurate mode
internal fun PlayerActivity.showV2331AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2331accurate
    FeaturePrefsStore.batch2331.v2331accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2331: adequate level
internal fun PlayerActivity.showV2331AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2331: adventurous level
internal fun PlayerActivity.showV2331AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2331: affectionate level
internal fun PlayerActivity.showV2331AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2331: aggressive level
internal fun PlayerActivity.showV2331AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2331: ambitious level
internal fun PlayerActivity.showV2331AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2331ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2331ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2331: amusing mode
internal fun PlayerActivity.showV2331AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2331amusing
    FeaturePrefsStore.batch2331.v2331amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2331: ancient mode
internal fun PlayerActivity.showV2331AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2331ancient
    FeaturePrefsStore.batch2331.v2331ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2331: animated mode
internal fun PlayerActivity.showV2331AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2331animated
    FeaturePrefsStore.batch2331.v2331animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2331: anxious mode
internal fun PlayerActivity.showV2331AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2331anxious
    FeaturePrefsStore.batch2331.v2331anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2331: apparent mode
internal fun PlayerActivity.showV2331ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2331apparent
    FeaturePrefsStore.batch2331.v2331apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2332: yielded mode
internal fun PlayerActivity.showV2332YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332yielded
    FeaturePrefsStore.batch2331.v2332yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2332: zeroed mode
internal fun PlayerActivity.showV2332ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332zeroed
    FeaturePrefsStore.batch2331.v2332zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2332: zoomed mode
internal fun PlayerActivity.showV2332ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332zoomed
    FeaturePrefsStore.batch2331.v2332zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2332: abundant mode
internal fun PlayerActivity.showV2332AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2332abundant
    FeaturePrefsStore.batch2331.v2332abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2332: accurate mode
internal fun PlayerActivity.showV2332AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2332accurate
    FeaturePrefsStore.batch2331.v2332accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2332: adequate level
internal fun PlayerActivity.showV2332AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2332: adventurous level
internal fun PlayerActivity.showV2332AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2332: affectionate level
internal fun PlayerActivity.showV2332AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2332: aggressive level
internal fun PlayerActivity.showV2332AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2332: ambitious level
internal fun PlayerActivity.showV2332AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2332ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2332ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2332: amusing mode
internal fun PlayerActivity.showV2332AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2332amusing
    FeaturePrefsStore.batch2331.v2332amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2332: ancient mode
internal fun PlayerActivity.showV2332AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2332ancient
    FeaturePrefsStore.batch2331.v2332ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2332: animated mode
internal fun PlayerActivity.showV2332AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2332animated
    FeaturePrefsStore.batch2331.v2332animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2332: anxious mode
internal fun PlayerActivity.showV2332AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2332anxious
    FeaturePrefsStore.batch2331.v2332anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2332: apparent mode
internal fun PlayerActivity.showV2332ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2332apparent
    FeaturePrefsStore.batch2331.v2332apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2333: yielded mode
internal fun PlayerActivity.showV2333YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333yielded
    FeaturePrefsStore.batch2331.v2333yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2333: zeroed mode
internal fun PlayerActivity.showV2333ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333zeroed
    FeaturePrefsStore.batch2331.v2333zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2333: zoomed mode
internal fun PlayerActivity.showV2333ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333zoomed
    FeaturePrefsStore.batch2331.v2333zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2333: abundant mode
internal fun PlayerActivity.showV2333AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2333abundant
    FeaturePrefsStore.batch2331.v2333abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2333: accurate mode
internal fun PlayerActivity.showV2333AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2333accurate
    FeaturePrefsStore.batch2331.v2333accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2333: adequate level
internal fun PlayerActivity.showV2333AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2333: adventurous level
internal fun PlayerActivity.showV2333AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2333: affectionate level
internal fun PlayerActivity.showV2333AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2333: aggressive level
internal fun PlayerActivity.showV2333AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2333: ambitious level
internal fun PlayerActivity.showV2333AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2333ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2333ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2333: amusing mode
internal fun PlayerActivity.showV2333AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2333amusing
    FeaturePrefsStore.batch2331.v2333amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2333: ancient mode
internal fun PlayerActivity.showV2333AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2333ancient
    FeaturePrefsStore.batch2331.v2333ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2333: animated mode
internal fun PlayerActivity.showV2333AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2333animated
    FeaturePrefsStore.batch2331.v2333animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2333: anxious mode
internal fun PlayerActivity.showV2333AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2333anxious
    FeaturePrefsStore.batch2331.v2333anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2333: apparent mode
internal fun PlayerActivity.showV2333ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2333apparent
    FeaturePrefsStore.batch2331.v2333apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2334: yielded mode
internal fun PlayerActivity.showV2334YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334yielded
    FeaturePrefsStore.batch2331.v2334yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2334: zeroed mode
internal fun PlayerActivity.showV2334ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334zeroed
    FeaturePrefsStore.batch2331.v2334zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2334: zoomed mode
internal fun PlayerActivity.showV2334ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334zoomed
    FeaturePrefsStore.batch2331.v2334zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2334: abundant mode
internal fun PlayerActivity.showV2334AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2334abundant
    FeaturePrefsStore.batch2331.v2334abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2334: accurate mode
internal fun PlayerActivity.showV2334AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2334accurate
    FeaturePrefsStore.batch2331.v2334accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2334: adequate level
internal fun PlayerActivity.showV2334AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2334: adventurous level
internal fun PlayerActivity.showV2334AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2334: affectionate level
internal fun PlayerActivity.showV2334AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2334: aggressive level
internal fun PlayerActivity.showV2334AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2334: ambitious level
internal fun PlayerActivity.showV2334AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2334ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2334ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2334: amusing mode
internal fun PlayerActivity.showV2334AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2334amusing
    FeaturePrefsStore.batch2331.v2334amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2334: ancient mode
internal fun PlayerActivity.showV2334AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2334ancient
    FeaturePrefsStore.batch2331.v2334ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2334: animated mode
internal fun PlayerActivity.showV2334AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2334animated
    FeaturePrefsStore.batch2331.v2334animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2334: anxious mode
internal fun PlayerActivity.showV2334AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2334anxious
    FeaturePrefsStore.batch2331.v2334anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2334: apparent mode
internal fun PlayerActivity.showV2334ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2334apparent
    FeaturePrefsStore.batch2331.v2334apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2335: yielded mode
internal fun PlayerActivity.showV2335YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335yielded
    FeaturePrefsStore.batch2331.v2335yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2335: zeroed mode
internal fun PlayerActivity.showV2335ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335zeroed
    FeaturePrefsStore.batch2331.v2335zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2335: zoomed mode
internal fun PlayerActivity.showV2335ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335zoomed
    FeaturePrefsStore.batch2331.v2335zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2335: abundant mode
internal fun PlayerActivity.showV2335AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2335abundant
    FeaturePrefsStore.batch2331.v2335abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2335: accurate mode
internal fun PlayerActivity.showV2335AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2335accurate
    FeaturePrefsStore.batch2331.v2335accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2335: adequate level
internal fun PlayerActivity.showV2335AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2335: adventurous level
internal fun PlayerActivity.showV2335AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2335: affectionate level
internal fun PlayerActivity.showV2335AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2335: aggressive level
internal fun PlayerActivity.showV2335AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2335: ambitious level
internal fun PlayerActivity.showV2335AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2335ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2335ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2335: amusing mode
internal fun PlayerActivity.showV2335AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2335amusing
    FeaturePrefsStore.batch2331.v2335amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2335: ancient mode
internal fun PlayerActivity.showV2335AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2335ancient
    FeaturePrefsStore.batch2331.v2335ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2335: animated mode
internal fun PlayerActivity.showV2335AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2335animated
    FeaturePrefsStore.batch2331.v2335animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2335: anxious mode
internal fun PlayerActivity.showV2335AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2335anxious
    FeaturePrefsStore.batch2331.v2335anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2335: apparent mode
internal fun PlayerActivity.showV2335ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2335apparent
    FeaturePrefsStore.batch2331.v2335apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2336: yielded mode
internal fun PlayerActivity.showV2336YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336yielded
    FeaturePrefsStore.batch2331.v2336yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2336: zeroed mode
internal fun PlayerActivity.showV2336ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336zeroed
    FeaturePrefsStore.batch2331.v2336zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2336: zoomed mode
internal fun PlayerActivity.showV2336ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336zoomed
    FeaturePrefsStore.batch2331.v2336zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2336: abundant mode
internal fun PlayerActivity.showV2336AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2336abundant
    FeaturePrefsStore.batch2331.v2336abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2336: accurate mode
internal fun PlayerActivity.showV2336AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2336accurate
    FeaturePrefsStore.batch2331.v2336accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2336: adequate level
internal fun PlayerActivity.showV2336AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2336: adventurous level
internal fun PlayerActivity.showV2336AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2336: affectionate level
internal fun PlayerActivity.showV2336AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2336: aggressive level
internal fun PlayerActivity.showV2336AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2336: ambitious level
internal fun PlayerActivity.showV2336AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2336ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2336ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2336: amusing mode
internal fun PlayerActivity.showV2336AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2336amusing
    FeaturePrefsStore.batch2331.v2336amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2336: ancient mode
internal fun PlayerActivity.showV2336AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2336ancient
    FeaturePrefsStore.batch2331.v2336ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2336: animated mode
internal fun PlayerActivity.showV2336AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2336animated
    FeaturePrefsStore.batch2331.v2336animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2336: anxious mode
internal fun PlayerActivity.showV2336AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2336anxious
    FeaturePrefsStore.batch2331.v2336anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2336: apparent mode
internal fun PlayerActivity.showV2336ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2336apparent
    FeaturePrefsStore.batch2331.v2336apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2337: yielded mode
internal fun PlayerActivity.showV2337YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337yielded
    FeaturePrefsStore.batch2331.v2337yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2337: zeroed mode
internal fun PlayerActivity.showV2337ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337zeroed
    FeaturePrefsStore.batch2331.v2337zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2337: zoomed mode
internal fun PlayerActivity.showV2337ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337zoomed
    FeaturePrefsStore.batch2331.v2337zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2337: abundant mode
internal fun PlayerActivity.showV2337AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2337abundant
    FeaturePrefsStore.batch2331.v2337abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2337: accurate mode
internal fun PlayerActivity.showV2337AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2337accurate
    FeaturePrefsStore.batch2331.v2337accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2337: adequate level
internal fun PlayerActivity.showV2337AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2337: adventurous level
internal fun PlayerActivity.showV2337AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2337: affectionate level
internal fun PlayerActivity.showV2337AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2337: aggressive level
internal fun PlayerActivity.showV2337AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2337: ambitious level
internal fun PlayerActivity.showV2337AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2337ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2337ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2337: amusing mode
internal fun PlayerActivity.showV2337AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2337amusing
    FeaturePrefsStore.batch2331.v2337amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2337: ancient mode
internal fun PlayerActivity.showV2337AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2337ancient
    FeaturePrefsStore.batch2331.v2337ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2337: animated mode
internal fun PlayerActivity.showV2337AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2337animated
    FeaturePrefsStore.batch2331.v2337animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2337: anxious mode
internal fun PlayerActivity.showV2337AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2337anxious
    FeaturePrefsStore.batch2331.v2337anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2337: apparent mode
internal fun PlayerActivity.showV2337ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2337apparent
    FeaturePrefsStore.batch2331.v2337apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2338: yielded mode
internal fun PlayerActivity.showV2338YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338yielded
    FeaturePrefsStore.batch2331.v2338yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2338: zeroed mode
internal fun PlayerActivity.showV2338ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338zeroed
    FeaturePrefsStore.batch2331.v2338zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2338: zoomed mode
internal fun PlayerActivity.showV2338ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338zoomed
    FeaturePrefsStore.batch2331.v2338zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2338: abundant mode
internal fun PlayerActivity.showV2338AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2338abundant
    FeaturePrefsStore.batch2331.v2338abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2338: accurate mode
internal fun PlayerActivity.showV2338AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2338accurate
    FeaturePrefsStore.batch2331.v2338accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2338: adequate level
internal fun PlayerActivity.showV2338AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2338: adventurous level
internal fun PlayerActivity.showV2338AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2338: affectionate level
internal fun PlayerActivity.showV2338AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2338: aggressive level
internal fun PlayerActivity.showV2338AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2338: ambitious level
internal fun PlayerActivity.showV2338AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2338ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2338ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2338: amusing mode
internal fun PlayerActivity.showV2338AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2338amusing
    FeaturePrefsStore.batch2331.v2338amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2338: ancient mode
internal fun PlayerActivity.showV2338AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2338ancient
    FeaturePrefsStore.batch2331.v2338ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2338: animated mode
internal fun PlayerActivity.showV2338AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2338animated
    FeaturePrefsStore.batch2331.v2338animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2338: anxious mode
internal fun PlayerActivity.showV2338AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2338anxious
    FeaturePrefsStore.batch2331.v2338anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2338: apparent mode
internal fun PlayerActivity.showV2338ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2338apparent
    FeaturePrefsStore.batch2331.v2338apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2339: yielded mode
internal fun PlayerActivity.showV2339YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339yielded
    FeaturePrefsStore.batch2331.v2339yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2339: zeroed mode
internal fun PlayerActivity.showV2339ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339zeroed
    FeaturePrefsStore.batch2331.v2339zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2339: zoomed mode
internal fun PlayerActivity.showV2339ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339zoomed
    FeaturePrefsStore.batch2331.v2339zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2339: abundant mode
internal fun PlayerActivity.showV2339AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2339abundant
    FeaturePrefsStore.batch2331.v2339abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2339: accurate mode
internal fun PlayerActivity.showV2339AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2339accurate
    FeaturePrefsStore.batch2331.v2339accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2339: adequate level
internal fun PlayerActivity.showV2339AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2339: adventurous level
internal fun PlayerActivity.showV2339AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2339: affectionate level
internal fun PlayerActivity.showV2339AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2339: aggressive level
internal fun PlayerActivity.showV2339AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2339: ambitious level
internal fun PlayerActivity.showV2339AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2339ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2339ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2339: amusing mode
internal fun PlayerActivity.showV2339AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2339amusing
    FeaturePrefsStore.batch2331.v2339amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2339: ancient mode
internal fun PlayerActivity.showV2339AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2339ancient
    FeaturePrefsStore.batch2331.v2339ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2339: animated mode
internal fun PlayerActivity.showV2339AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2339animated
    FeaturePrefsStore.batch2331.v2339animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2339: anxious mode
internal fun PlayerActivity.showV2339AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2339anxious
    FeaturePrefsStore.batch2331.v2339anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2339: apparent mode
internal fun PlayerActivity.showV2339ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2339apparent
    FeaturePrefsStore.batch2331.v2339apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

// v2340: yielded mode
internal fun PlayerActivity.showV2340YieldedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340yielded
    FeaturePrefsStore.batch2331.v2340yielded = !current
    AppToast.show(this, "yielded: ${if (!current) "ON" else "OFF"}")
}

// v2340: zeroed mode
internal fun PlayerActivity.showV2340ZeroedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340zeroed
    FeaturePrefsStore.batch2331.v2340zeroed = !current
    AppToast.show(this, "zeroed: ${if (!current) "ON" else "OFF"}")
}

// v2340: zoomed mode
internal fun PlayerActivity.showV2340ZoomedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340zoomed
    FeaturePrefsStore.batch2331.v2340zoomed = !current
    AppToast.show(this, "zoomed: ${if (!current) "ON" else "OFF"}")
}

// v2340: abundant mode
internal fun PlayerActivity.showV2340AbundantToggle() {
    val current = FeaturePrefsStore.batch2331.v2340abundant
    FeaturePrefsStore.batch2331.v2340abundant = !current
    AppToast.show(this, "abundant: ${if (!current) "ON" else "OFF"}")
}

// v2340: accurate mode
internal fun PlayerActivity.showV2340AccurateToggle() {
    val current = FeaturePrefsStore.batch2331.v2340accurate
    FeaturePrefsStore.batch2331.v2340accurate = !current
    AppToast.show(this, "accurate: ${if (!current) "ON" else "OFF"}")
}

// v2340: adequate level
internal fun PlayerActivity.showV2340AdequateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340adequate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adequate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340adequate = value
        AppToast.show(this, "adequate: $value")
    }
}

// v2340: adventurous level
internal fun PlayerActivity.showV2340AdventurousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340adventurous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "adventurous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340adventurous = value
        AppToast.show(this, "adventurous: $value")
    }
}

// v2340: affectionate level
internal fun PlayerActivity.showV2340AffectionateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340affectionate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affectionate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340affectionate = value
        AppToast.show(this, "affectionate: $value")
    }
}

// v2340: aggressive level
internal fun PlayerActivity.showV2340AggressiveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340aggressive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggressive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340aggressive = value
        AppToast.show(this, "aggressive: $value")
    }
}

// v2340: ambitious level
internal fun PlayerActivity.showV2340AmbitiousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2331.v2340ambitious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ambitious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2331.v2340ambitious = value
        AppToast.show(this, "ambitious: $value")
    }
}

// v2340: amusing mode
internal fun PlayerActivity.showV2340AmusingToggle() {
    val current = FeaturePrefsStore.batch2331.v2340amusing
    FeaturePrefsStore.batch2331.v2340amusing = !current
    AppToast.show(this, "amusing: ${if (!current) "ON" else "OFF"}")
}

// v2340: ancient mode
internal fun PlayerActivity.showV2340AncientToggle() {
    val current = FeaturePrefsStore.batch2331.v2340ancient
    FeaturePrefsStore.batch2331.v2340ancient = !current
    AppToast.show(this, "ancient: ${if (!current) "ON" else "OFF"}")
}

// v2340: animated mode
internal fun PlayerActivity.showV2340AnimatedToggle() {
    val current = FeaturePrefsStore.batch2331.v2340animated
    FeaturePrefsStore.batch2331.v2340animated = !current
    AppToast.show(this, "animated: ${if (!current) "ON" else "OFF"}")
}

// v2340: anxious mode
internal fun PlayerActivity.showV2340AnxiousToggle() {
    val current = FeaturePrefsStore.batch2331.v2340anxious
    FeaturePrefsStore.batch2331.v2340anxious = !current
    AppToast.show(this, "anxious: ${if (!current) "ON" else "OFF"}")
}

// v2340: apparent mode
internal fun PlayerActivity.showV2340ApparentToggle() {
    val current = FeaturePrefsStore.batch2331.v2340apparent
    FeaturePrefsStore.batch2331.v2340apparent = !current
    AppToast.show(this, "apparent: ${if (!current) "ON" else "OFF"}")
}

