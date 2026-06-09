package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2381: dominant mode
internal fun PlayerActivity.showV2381DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2381dominant
    FeaturePrefsStore.batch2381.v2381dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2381: dramatic mode
internal fun PlayerActivity.showV2381DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2381dramatic
    FeaturePrefsStore.batch2381.v2381dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2381: efficient mode
internal fun PlayerActivity.showV2381EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2381efficient
    FeaturePrefsStore.batch2381.v2381efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2381: eloquent mode
internal fun PlayerActivity.showV2381EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2381eloquent
    FeaturePrefsStore.batch2381.v2381eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2381: emotional mode
internal fun PlayerActivity.showV2381EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2381emotional
    FeaturePrefsStore.batch2381.v2381emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2381: empathetic level
internal fun PlayerActivity.showV2381EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2381: essential level
internal fun PlayerActivity.showV2381EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2381: evident level
internal fun PlayerActivity.showV2381EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2381: evolutionary level
internal fun PlayerActivity.showV2381EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2381: exceptional level
internal fun PlayerActivity.showV2381ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2381: exclusive mode
internal fun PlayerActivity.showV2381ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2381exclusive
    FeaturePrefsStore.batch2381.v2381exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2381: exotic mode
internal fun PlayerActivity.showV2381ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2381exotic
    FeaturePrefsStore.batch2381.v2381exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2381: experienced mode
internal fun PlayerActivity.showV2381ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2381experienced
    FeaturePrefsStore.batch2381.v2381experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2381: experimental mode
internal fun PlayerActivity.showV2381ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2381experimental
    FeaturePrefsStore.batch2381.v2381experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2381: explicit mode
internal fun PlayerActivity.showV2381ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2381explicit
    FeaturePrefsStore.batch2381.v2381explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2382: dominant mode
internal fun PlayerActivity.showV2382DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2382dominant
    FeaturePrefsStore.batch2381.v2382dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2382: dramatic mode
internal fun PlayerActivity.showV2382DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2382dramatic
    FeaturePrefsStore.batch2381.v2382dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2382: efficient mode
internal fun PlayerActivity.showV2382EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2382efficient
    FeaturePrefsStore.batch2381.v2382efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2382: eloquent mode
internal fun PlayerActivity.showV2382EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2382eloquent
    FeaturePrefsStore.batch2381.v2382eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2382: emotional mode
internal fun PlayerActivity.showV2382EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2382emotional
    FeaturePrefsStore.batch2381.v2382emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2382: empathetic level
internal fun PlayerActivity.showV2382EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2382: essential level
internal fun PlayerActivity.showV2382EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2382: evident level
internal fun PlayerActivity.showV2382EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2382: evolutionary level
internal fun PlayerActivity.showV2382EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2382: exceptional level
internal fun PlayerActivity.showV2382ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2382: exclusive mode
internal fun PlayerActivity.showV2382ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2382exclusive
    FeaturePrefsStore.batch2381.v2382exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2382: exotic mode
internal fun PlayerActivity.showV2382ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2382exotic
    FeaturePrefsStore.batch2381.v2382exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2382: experienced mode
internal fun PlayerActivity.showV2382ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2382experienced
    FeaturePrefsStore.batch2381.v2382experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2382: experimental mode
internal fun PlayerActivity.showV2382ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2382experimental
    FeaturePrefsStore.batch2381.v2382experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2382: explicit mode
internal fun PlayerActivity.showV2382ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2382explicit
    FeaturePrefsStore.batch2381.v2382explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2383: dominant mode
internal fun PlayerActivity.showV2383DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2383dominant
    FeaturePrefsStore.batch2381.v2383dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2383: dramatic mode
internal fun PlayerActivity.showV2383DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2383dramatic
    FeaturePrefsStore.batch2381.v2383dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2383: efficient mode
internal fun PlayerActivity.showV2383EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2383efficient
    FeaturePrefsStore.batch2381.v2383efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2383: eloquent mode
internal fun PlayerActivity.showV2383EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2383eloquent
    FeaturePrefsStore.batch2381.v2383eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2383: emotional mode
internal fun PlayerActivity.showV2383EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2383emotional
    FeaturePrefsStore.batch2381.v2383emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2383: empathetic level
internal fun PlayerActivity.showV2383EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2383: essential level
internal fun PlayerActivity.showV2383EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2383: evident level
internal fun PlayerActivity.showV2383EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2383: evolutionary level
internal fun PlayerActivity.showV2383EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2383: exceptional level
internal fun PlayerActivity.showV2383ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2383: exclusive mode
internal fun PlayerActivity.showV2383ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2383exclusive
    FeaturePrefsStore.batch2381.v2383exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2383: exotic mode
internal fun PlayerActivity.showV2383ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2383exotic
    FeaturePrefsStore.batch2381.v2383exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2383: experienced mode
internal fun PlayerActivity.showV2383ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2383experienced
    FeaturePrefsStore.batch2381.v2383experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2383: experimental mode
internal fun PlayerActivity.showV2383ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2383experimental
    FeaturePrefsStore.batch2381.v2383experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2383: explicit mode
internal fun PlayerActivity.showV2383ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2383explicit
    FeaturePrefsStore.batch2381.v2383explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2384: dominant mode
internal fun PlayerActivity.showV2384DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2384dominant
    FeaturePrefsStore.batch2381.v2384dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2384: dramatic mode
internal fun PlayerActivity.showV2384DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2384dramatic
    FeaturePrefsStore.batch2381.v2384dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2384: efficient mode
internal fun PlayerActivity.showV2384EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2384efficient
    FeaturePrefsStore.batch2381.v2384efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2384: eloquent mode
internal fun PlayerActivity.showV2384EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2384eloquent
    FeaturePrefsStore.batch2381.v2384eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2384: emotional mode
internal fun PlayerActivity.showV2384EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2384emotional
    FeaturePrefsStore.batch2381.v2384emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2384: empathetic level
internal fun PlayerActivity.showV2384EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2384: essential level
internal fun PlayerActivity.showV2384EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2384: evident level
internal fun PlayerActivity.showV2384EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2384: evolutionary level
internal fun PlayerActivity.showV2384EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2384: exceptional level
internal fun PlayerActivity.showV2384ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2384: exclusive mode
internal fun PlayerActivity.showV2384ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2384exclusive
    FeaturePrefsStore.batch2381.v2384exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2384: exotic mode
internal fun PlayerActivity.showV2384ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2384exotic
    FeaturePrefsStore.batch2381.v2384exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2384: experienced mode
internal fun PlayerActivity.showV2384ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2384experienced
    FeaturePrefsStore.batch2381.v2384experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2384: experimental mode
internal fun PlayerActivity.showV2384ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2384experimental
    FeaturePrefsStore.batch2381.v2384experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2384: explicit mode
internal fun PlayerActivity.showV2384ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2384explicit
    FeaturePrefsStore.batch2381.v2384explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2385: dominant mode
internal fun PlayerActivity.showV2385DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2385dominant
    FeaturePrefsStore.batch2381.v2385dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2385: dramatic mode
internal fun PlayerActivity.showV2385DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2385dramatic
    FeaturePrefsStore.batch2381.v2385dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2385: efficient mode
internal fun PlayerActivity.showV2385EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2385efficient
    FeaturePrefsStore.batch2381.v2385efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2385: eloquent mode
internal fun PlayerActivity.showV2385EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2385eloquent
    FeaturePrefsStore.batch2381.v2385eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2385: emotional mode
internal fun PlayerActivity.showV2385EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2385emotional
    FeaturePrefsStore.batch2381.v2385emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2385: empathetic level
internal fun PlayerActivity.showV2385EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2385: essential level
internal fun PlayerActivity.showV2385EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2385: evident level
internal fun PlayerActivity.showV2385EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2385: evolutionary level
internal fun PlayerActivity.showV2385EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2385: exceptional level
internal fun PlayerActivity.showV2385ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2385: exclusive mode
internal fun PlayerActivity.showV2385ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2385exclusive
    FeaturePrefsStore.batch2381.v2385exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2385: exotic mode
internal fun PlayerActivity.showV2385ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2385exotic
    FeaturePrefsStore.batch2381.v2385exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2385: experienced mode
internal fun PlayerActivity.showV2385ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2385experienced
    FeaturePrefsStore.batch2381.v2385experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2385: experimental mode
internal fun PlayerActivity.showV2385ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2385experimental
    FeaturePrefsStore.batch2381.v2385experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2385: explicit mode
internal fun PlayerActivity.showV2385ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2385explicit
    FeaturePrefsStore.batch2381.v2385explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2386: dominant mode
internal fun PlayerActivity.showV2386DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2386dominant
    FeaturePrefsStore.batch2381.v2386dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2386: dramatic mode
internal fun PlayerActivity.showV2386DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2386dramatic
    FeaturePrefsStore.batch2381.v2386dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2386: efficient mode
internal fun PlayerActivity.showV2386EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2386efficient
    FeaturePrefsStore.batch2381.v2386efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2386: eloquent mode
internal fun PlayerActivity.showV2386EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2386eloquent
    FeaturePrefsStore.batch2381.v2386eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2386: emotional mode
internal fun PlayerActivity.showV2386EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2386emotional
    FeaturePrefsStore.batch2381.v2386emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2386: empathetic level
internal fun PlayerActivity.showV2386EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2386: essential level
internal fun PlayerActivity.showV2386EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2386: evident level
internal fun PlayerActivity.showV2386EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2386: evolutionary level
internal fun PlayerActivity.showV2386EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2386: exceptional level
internal fun PlayerActivity.showV2386ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2386: exclusive mode
internal fun PlayerActivity.showV2386ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2386exclusive
    FeaturePrefsStore.batch2381.v2386exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2386: exotic mode
internal fun PlayerActivity.showV2386ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2386exotic
    FeaturePrefsStore.batch2381.v2386exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2386: experienced mode
internal fun PlayerActivity.showV2386ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2386experienced
    FeaturePrefsStore.batch2381.v2386experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2386: experimental mode
internal fun PlayerActivity.showV2386ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2386experimental
    FeaturePrefsStore.batch2381.v2386experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2386: explicit mode
internal fun PlayerActivity.showV2386ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2386explicit
    FeaturePrefsStore.batch2381.v2386explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2387: dominant mode
internal fun PlayerActivity.showV2387DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2387dominant
    FeaturePrefsStore.batch2381.v2387dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2387: dramatic mode
internal fun PlayerActivity.showV2387DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2387dramatic
    FeaturePrefsStore.batch2381.v2387dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2387: efficient mode
internal fun PlayerActivity.showV2387EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2387efficient
    FeaturePrefsStore.batch2381.v2387efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2387: eloquent mode
internal fun PlayerActivity.showV2387EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2387eloquent
    FeaturePrefsStore.batch2381.v2387eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2387: emotional mode
internal fun PlayerActivity.showV2387EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2387emotional
    FeaturePrefsStore.batch2381.v2387emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2387: empathetic level
internal fun PlayerActivity.showV2387EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2387: essential level
internal fun PlayerActivity.showV2387EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2387: evident level
internal fun PlayerActivity.showV2387EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2387: evolutionary level
internal fun PlayerActivity.showV2387EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2387: exceptional level
internal fun PlayerActivity.showV2387ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2387: exclusive mode
internal fun PlayerActivity.showV2387ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2387exclusive
    FeaturePrefsStore.batch2381.v2387exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2387: exotic mode
internal fun PlayerActivity.showV2387ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2387exotic
    FeaturePrefsStore.batch2381.v2387exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2387: experienced mode
internal fun PlayerActivity.showV2387ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2387experienced
    FeaturePrefsStore.batch2381.v2387experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2387: experimental mode
internal fun PlayerActivity.showV2387ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2387experimental
    FeaturePrefsStore.batch2381.v2387experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2387: explicit mode
internal fun PlayerActivity.showV2387ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2387explicit
    FeaturePrefsStore.batch2381.v2387explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2388: dominant mode
internal fun PlayerActivity.showV2388DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2388dominant
    FeaturePrefsStore.batch2381.v2388dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2388: dramatic mode
internal fun PlayerActivity.showV2388DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2388dramatic
    FeaturePrefsStore.batch2381.v2388dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2388: efficient mode
internal fun PlayerActivity.showV2388EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2388efficient
    FeaturePrefsStore.batch2381.v2388efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2388: eloquent mode
internal fun PlayerActivity.showV2388EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2388eloquent
    FeaturePrefsStore.batch2381.v2388eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2388: emotional mode
internal fun PlayerActivity.showV2388EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2388emotional
    FeaturePrefsStore.batch2381.v2388emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2388: empathetic level
internal fun PlayerActivity.showV2388EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2388: essential level
internal fun PlayerActivity.showV2388EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2388: evident level
internal fun PlayerActivity.showV2388EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2388: evolutionary level
internal fun PlayerActivity.showV2388EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2388: exceptional level
internal fun PlayerActivity.showV2388ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2388: exclusive mode
internal fun PlayerActivity.showV2388ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2388exclusive
    FeaturePrefsStore.batch2381.v2388exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2388: exotic mode
internal fun PlayerActivity.showV2388ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2388exotic
    FeaturePrefsStore.batch2381.v2388exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2388: experienced mode
internal fun PlayerActivity.showV2388ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2388experienced
    FeaturePrefsStore.batch2381.v2388experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2388: experimental mode
internal fun PlayerActivity.showV2388ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2388experimental
    FeaturePrefsStore.batch2381.v2388experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2388: explicit mode
internal fun PlayerActivity.showV2388ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2388explicit
    FeaturePrefsStore.batch2381.v2388explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2389: dominant mode
internal fun PlayerActivity.showV2389DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2389dominant
    FeaturePrefsStore.batch2381.v2389dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2389: dramatic mode
internal fun PlayerActivity.showV2389DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2389dramatic
    FeaturePrefsStore.batch2381.v2389dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2389: efficient mode
internal fun PlayerActivity.showV2389EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2389efficient
    FeaturePrefsStore.batch2381.v2389efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2389: eloquent mode
internal fun PlayerActivity.showV2389EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2389eloquent
    FeaturePrefsStore.batch2381.v2389eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2389: emotional mode
internal fun PlayerActivity.showV2389EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2389emotional
    FeaturePrefsStore.batch2381.v2389emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2389: empathetic level
internal fun PlayerActivity.showV2389EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2389: essential level
internal fun PlayerActivity.showV2389EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2389: evident level
internal fun PlayerActivity.showV2389EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2389: evolutionary level
internal fun PlayerActivity.showV2389EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2389: exceptional level
internal fun PlayerActivity.showV2389ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2389: exclusive mode
internal fun PlayerActivity.showV2389ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2389exclusive
    FeaturePrefsStore.batch2381.v2389exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2389: exotic mode
internal fun PlayerActivity.showV2389ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2389exotic
    FeaturePrefsStore.batch2381.v2389exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2389: experienced mode
internal fun PlayerActivity.showV2389ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2389experienced
    FeaturePrefsStore.batch2381.v2389experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2389: experimental mode
internal fun PlayerActivity.showV2389ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2389experimental
    FeaturePrefsStore.batch2381.v2389experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2389: explicit mode
internal fun PlayerActivity.showV2389ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2389explicit
    FeaturePrefsStore.batch2381.v2389explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2390: dominant mode
internal fun PlayerActivity.showV2390DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2390dominant
    FeaturePrefsStore.batch2381.v2390dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2390: dramatic mode
internal fun PlayerActivity.showV2390DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2390dramatic
    FeaturePrefsStore.batch2381.v2390dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2390: efficient mode
internal fun PlayerActivity.showV2390EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2390efficient
    FeaturePrefsStore.batch2381.v2390efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2390: eloquent mode
internal fun PlayerActivity.showV2390EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2390eloquent
    FeaturePrefsStore.batch2381.v2390eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2390: emotional mode
internal fun PlayerActivity.showV2390EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2390emotional
    FeaturePrefsStore.batch2381.v2390emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2390: empathetic level
internal fun PlayerActivity.showV2390EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2390: essential level
internal fun PlayerActivity.showV2390EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2390: evident level
internal fun PlayerActivity.showV2390EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2390: evolutionary level
internal fun PlayerActivity.showV2390EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2390: exceptional level
internal fun PlayerActivity.showV2390ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2390: exclusive mode
internal fun PlayerActivity.showV2390ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2390exclusive
    FeaturePrefsStore.batch2381.v2390exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2390: exotic mode
internal fun PlayerActivity.showV2390ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2390exotic
    FeaturePrefsStore.batch2381.v2390exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2390: experienced mode
internal fun PlayerActivity.showV2390ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2390experienced
    FeaturePrefsStore.batch2381.v2390experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2390: experimental mode
internal fun PlayerActivity.showV2390ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2390experimental
    FeaturePrefsStore.batch2381.v2390experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2390: explicit mode
internal fun PlayerActivity.showV2390ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2390explicit
    FeaturePrefsStore.batch2381.v2390explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

