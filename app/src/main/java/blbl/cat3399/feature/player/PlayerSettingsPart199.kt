package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2171: qualified mode
internal fun PlayerActivity.showV2171QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171qualified
    FeaturePrefsStore.batch2171.v2171qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2171: quantified mode
internal fun PlayerActivity.showV2171QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171quantified
    FeaturePrefsStore.batch2171.v2171quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2171: queried mode
internal fun PlayerActivity.showV2171QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171queried
    FeaturePrefsStore.batch2171.v2171queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2171: questioned mode
internal fun PlayerActivity.showV2171QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171questioned
    FeaturePrefsStore.batch2171.v2171questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2171: queued mode
internal fun PlayerActivity.showV2171QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171queued
    FeaturePrefsStore.batch2171.v2171queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2171: quoted level
internal fun PlayerActivity.showV2171QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2171: raised level
internal fun PlayerActivity.showV2171RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2171: randomized level
internal fun PlayerActivity.showV2171RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2171: ranked level
internal fun PlayerActivity.showV2171RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2171: rated level
internal fun PlayerActivity.showV2171RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2171rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2171rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2171: reached mode
internal fun PlayerActivity.showV2171ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171reached
    FeaturePrefsStore.batch2171.v2171reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2171: reacted mode
internal fun PlayerActivity.showV2171ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171reacted
    FeaturePrefsStore.batch2171.v2171reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2171: realized mode
internal fun PlayerActivity.showV2171RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171realized
    FeaturePrefsStore.batch2171.v2171realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2171: rebalanced mode
internal fun PlayerActivity.showV2171RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2171rebalanced
    FeaturePrefsStore.batch2171.v2171rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2171: rebuilt mode
internal fun PlayerActivity.showV2171RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2171rebuilt
    FeaturePrefsStore.batch2171.v2171rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2172: qualified mode
internal fun PlayerActivity.showV2172QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172qualified
    FeaturePrefsStore.batch2171.v2172qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2172: quantified mode
internal fun PlayerActivity.showV2172QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172quantified
    FeaturePrefsStore.batch2171.v2172quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2172: queried mode
internal fun PlayerActivity.showV2172QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172queried
    FeaturePrefsStore.batch2171.v2172queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2172: questioned mode
internal fun PlayerActivity.showV2172QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172questioned
    FeaturePrefsStore.batch2171.v2172questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2172: queued mode
internal fun PlayerActivity.showV2172QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172queued
    FeaturePrefsStore.batch2171.v2172queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2172: quoted level
internal fun PlayerActivity.showV2172QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2172: raised level
internal fun PlayerActivity.showV2172RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2172: randomized level
internal fun PlayerActivity.showV2172RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2172: ranked level
internal fun PlayerActivity.showV2172RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2172: rated level
internal fun PlayerActivity.showV2172RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2172rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2172rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2172: reached mode
internal fun PlayerActivity.showV2172ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172reached
    FeaturePrefsStore.batch2171.v2172reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2172: reacted mode
internal fun PlayerActivity.showV2172ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172reacted
    FeaturePrefsStore.batch2171.v2172reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2172: realized mode
internal fun PlayerActivity.showV2172RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172realized
    FeaturePrefsStore.batch2171.v2172realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2172: rebalanced mode
internal fun PlayerActivity.showV2172RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2172rebalanced
    FeaturePrefsStore.batch2171.v2172rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2172: rebuilt mode
internal fun PlayerActivity.showV2172RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2172rebuilt
    FeaturePrefsStore.batch2171.v2172rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2173: qualified mode
internal fun PlayerActivity.showV2173QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173qualified
    FeaturePrefsStore.batch2171.v2173qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2173: quantified mode
internal fun PlayerActivity.showV2173QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173quantified
    FeaturePrefsStore.batch2171.v2173quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2173: queried mode
internal fun PlayerActivity.showV2173QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173queried
    FeaturePrefsStore.batch2171.v2173queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2173: questioned mode
internal fun PlayerActivity.showV2173QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173questioned
    FeaturePrefsStore.batch2171.v2173questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2173: queued mode
internal fun PlayerActivity.showV2173QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173queued
    FeaturePrefsStore.batch2171.v2173queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2173: quoted level
internal fun PlayerActivity.showV2173QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2173: raised level
internal fun PlayerActivity.showV2173RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2173: randomized level
internal fun PlayerActivity.showV2173RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2173: ranked level
internal fun PlayerActivity.showV2173RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2173: rated level
internal fun PlayerActivity.showV2173RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2173rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2173rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2173: reached mode
internal fun PlayerActivity.showV2173ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173reached
    FeaturePrefsStore.batch2171.v2173reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2173: reacted mode
internal fun PlayerActivity.showV2173ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173reacted
    FeaturePrefsStore.batch2171.v2173reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2173: realized mode
internal fun PlayerActivity.showV2173RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173realized
    FeaturePrefsStore.batch2171.v2173realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2173: rebalanced mode
internal fun PlayerActivity.showV2173RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2173rebalanced
    FeaturePrefsStore.batch2171.v2173rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2173: rebuilt mode
internal fun PlayerActivity.showV2173RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2173rebuilt
    FeaturePrefsStore.batch2171.v2173rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2174: qualified mode
internal fun PlayerActivity.showV2174QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174qualified
    FeaturePrefsStore.batch2171.v2174qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2174: quantified mode
internal fun PlayerActivity.showV2174QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174quantified
    FeaturePrefsStore.batch2171.v2174quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2174: queried mode
internal fun PlayerActivity.showV2174QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174queried
    FeaturePrefsStore.batch2171.v2174queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2174: questioned mode
internal fun PlayerActivity.showV2174QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174questioned
    FeaturePrefsStore.batch2171.v2174questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2174: queued mode
internal fun PlayerActivity.showV2174QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174queued
    FeaturePrefsStore.batch2171.v2174queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2174: quoted level
internal fun PlayerActivity.showV2174QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2174: raised level
internal fun PlayerActivity.showV2174RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2174: randomized level
internal fun PlayerActivity.showV2174RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2174: ranked level
internal fun PlayerActivity.showV2174RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2174: rated level
internal fun PlayerActivity.showV2174RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2174rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2174rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2174: reached mode
internal fun PlayerActivity.showV2174ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174reached
    FeaturePrefsStore.batch2171.v2174reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2174: reacted mode
internal fun PlayerActivity.showV2174ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174reacted
    FeaturePrefsStore.batch2171.v2174reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2174: realized mode
internal fun PlayerActivity.showV2174RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174realized
    FeaturePrefsStore.batch2171.v2174realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2174: rebalanced mode
internal fun PlayerActivity.showV2174RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2174rebalanced
    FeaturePrefsStore.batch2171.v2174rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2174: rebuilt mode
internal fun PlayerActivity.showV2174RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2174rebuilt
    FeaturePrefsStore.batch2171.v2174rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2175: qualified mode
internal fun PlayerActivity.showV2175QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175qualified
    FeaturePrefsStore.batch2171.v2175qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2175: quantified mode
internal fun PlayerActivity.showV2175QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175quantified
    FeaturePrefsStore.batch2171.v2175quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2175: queried mode
internal fun PlayerActivity.showV2175QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175queried
    FeaturePrefsStore.batch2171.v2175queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2175: questioned mode
internal fun PlayerActivity.showV2175QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175questioned
    FeaturePrefsStore.batch2171.v2175questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2175: queued mode
internal fun PlayerActivity.showV2175QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175queued
    FeaturePrefsStore.batch2171.v2175queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2175: quoted level
internal fun PlayerActivity.showV2175QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2175: raised level
internal fun PlayerActivity.showV2175RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2175: randomized level
internal fun PlayerActivity.showV2175RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2175: ranked level
internal fun PlayerActivity.showV2175RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2175: rated level
internal fun PlayerActivity.showV2175RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2175rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2175rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2175: reached mode
internal fun PlayerActivity.showV2175ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175reached
    FeaturePrefsStore.batch2171.v2175reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2175: reacted mode
internal fun PlayerActivity.showV2175ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175reacted
    FeaturePrefsStore.batch2171.v2175reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2175: realized mode
internal fun PlayerActivity.showV2175RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175realized
    FeaturePrefsStore.batch2171.v2175realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2175: rebalanced mode
internal fun PlayerActivity.showV2175RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2175rebalanced
    FeaturePrefsStore.batch2171.v2175rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2175: rebuilt mode
internal fun PlayerActivity.showV2175RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2175rebuilt
    FeaturePrefsStore.batch2171.v2175rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2176: qualified mode
internal fun PlayerActivity.showV2176QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176qualified
    FeaturePrefsStore.batch2171.v2176qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2176: quantified mode
internal fun PlayerActivity.showV2176QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176quantified
    FeaturePrefsStore.batch2171.v2176quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2176: queried mode
internal fun PlayerActivity.showV2176QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176queried
    FeaturePrefsStore.batch2171.v2176queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2176: questioned mode
internal fun PlayerActivity.showV2176QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176questioned
    FeaturePrefsStore.batch2171.v2176questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2176: queued mode
internal fun PlayerActivity.showV2176QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176queued
    FeaturePrefsStore.batch2171.v2176queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2176: quoted level
internal fun PlayerActivity.showV2176QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2176: raised level
internal fun PlayerActivity.showV2176RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2176: randomized level
internal fun PlayerActivity.showV2176RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2176: ranked level
internal fun PlayerActivity.showV2176RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2176: rated level
internal fun PlayerActivity.showV2176RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2176rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2176rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2176: reached mode
internal fun PlayerActivity.showV2176ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176reached
    FeaturePrefsStore.batch2171.v2176reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2176: reacted mode
internal fun PlayerActivity.showV2176ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176reacted
    FeaturePrefsStore.batch2171.v2176reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2176: realized mode
internal fun PlayerActivity.showV2176RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176realized
    FeaturePrefsStore.batch2171.v2176realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2176: rebalanced mode
internal fun PlayerActivity.showV2176RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2176rebalanced
    FeaturePrefsStore.batch2171.v2176rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2176: rebuilt mode
internal fun PlayerActivity.showV2176RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2176rebuilt
    FeaturePrefsStore.batch2171.v2176rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2177: qualified mode
internal fun PlayerActivity.showV2177QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177qualified
    FeaturePrefsStore.batch2171.v2177qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2177: quantified mode
internal fun PlayerActivity.showV2177QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177quantified
    FeaturePrefsStore.batch2171.v2177quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2177: queried mode
internal fun PlayerActivity.showV2177QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177queried
    FeaturePrefsStore.batch2171.v2177queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2177: questioned mode
internal fun PlayerActivity.showV2177QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177questioned
    FeaturePrefsStore.batch2171.v2177questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2177: queued mode
internal fun PlayerActivity.showV2177QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177queued
    FeaturePrefsStore.batch2171.v2177queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2177: quoted level
internal fun PlayerActivity.showV2177QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2177: raised level
internal fun PlayerActivity.showV2177RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2177: randomized level
internal fun PlayerActivity.showV2177RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2177: ranked level
internal fun PlayerActivity.showV2177RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2177: rated level
internal fun PlayerActivity.showV2177RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2177rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2177rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2177: reached mode
internal fun PlayerActivity.showV2177ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177reached
    FeaturePrefsStore.batch2171.v2177reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2177: reacted mode
internal fun PlayerActivity.showV2177ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177reacted
    FeaturePrefsStore.batch2171.v2177reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2177: realized mode
internal fun PlayerActivity.showV2177RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177realized
    FeaturePrefsStore.batch2171.v2177realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2177: rebalanced mode
internal fun PlayerActivity.showV2177RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2177rebalanced
    FeaturePrefsStore.batch2171.v2177rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2177: rebuilt mode
internal fun PlayerActivity.showV2177RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2177rebuilt
    FeaturePrefsStore.batch2171.v2177rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2178: qualified mode
internal fun PlayerActivity.showV2178QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178qualified
    FeaturePrefsStore.batch2171.v2178qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2178: quantified mode
internal fun PlayerActivity.showV2178QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178quantified
    FeaturePrefsStore.batch2171.v2178quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2178: queried mode
internal fun PlayerActivity.showV2178QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178queried
    FeaturePrefsStore.batch2171.v2178queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2178: questioned mode
internal fun PlayerActivity.showV2178QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178questioned
    FeaturePrefsStore.batch2171.v2178questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2178: queued mode
internal fun PlayerActivity.showV2178QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178queued
    FeaturePrefsStore.batch2171.v2178queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2178: quoted level
internal fun PlayerActivity.showV2178QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2178: raised level
internal fun PlayerActivity.showV2178RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2178: randomized level
internal fun PlayerActivity.showV2178RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2178: ranked level
internal fun PlayerActivity.showV2178RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2178: rated level
internal fun PlayerActivity.showV2178RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2178rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2178rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2178: reached mode
internal fun PlayerActivity.showV2178ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178reached
    FeaturePrefsStore.batch2171.v2178reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2178: reacted mode
internal fun PlayerActivity.showV2178ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178reacted
    FeaturePrefsStore.batch2171.v2178reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2178: realized mode
internal fun PlayerActivity.showV2178RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178realized
    FeaturePrefsStore.batch2171.v2178realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2178: rebalanced mode
internal fun PlayerActivity.showV2178RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2178rebalanced
    FeaturePrefsStore.batch2171.v2178rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2178: rebuilt mode
internal fun PlayerActivity.showV2178RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2178rebuilt
    FeaturePrefsStore.batch2171.v2178rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2179: qualified mode
internal fun PlayerActivity.showV2179QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179qualified
    FeaturePrefsStore.batch2171.v2179qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2179: quantified mode
internal fun PlayerActivity.showV2179QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179quantified
    FeaturePrefsStore.batch2171.v2179quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2179: queried mode
internal fun PlayerActivity.showV2179QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179queried
    FeaturePrefsStore.batch2171.v2179queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2179: questioned mode
internal fun PlayerActivity.showV2179QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179questioned
    FeaturePrefsStore.batch2171.v2179questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2179: queued mode
internal fun PlayerActivity.showV2179QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179queued
    FeaturePrefsStore.batch2171.v2179queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2179: quoted level
internal fun PlayerActivity.showV2179QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2179: raised level
internal fun PlayerActivity.showV2179RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2179: randomized level
internal fun PlayerActivity.showV2179RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2179: ranked level
internal fun PlayerActivity.showV2179RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2179: rated level
internal fun PlayerActivity.showV2179RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2179rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2179rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2179: reached mode
internal fun PlayerActivity.showV2179ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179reached
    FeaturePrefsStore.batch2171.v2179reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2179: reacted mode
internal fun PlayerActivity.showV2179ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179reacted
    FeaturePrefsStore.batch2171.v2179reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2179: realized mode
internal fun PlayerActivity.showV2179RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179realized
    FeaturePrefsStore.batch2171.v2179realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2179: rebalanced mode
internal fun PlayerActivity.showV2179RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2179rebalanced
    FeaturePrefsStore.batch2171.v2179rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2179: rebuilt mode
internal fun PlayerActivity.showV2179RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2179rebuilt
    FeaturePrefsStore.batch2171.v2179rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

// v2180: qualified mode
internal fun PlayerActivity.showV2180QualifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180qualified
    FeaturePrefsStore.batch2171.v2180qualified = !current
    AppToast.show(this, "qualified: ${if (!current) "ON" else "OFF"}")
}

// v2180: quantified mode
internal fun PlayerActivity.showV2180QuantifiedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180quantified
    FeaturePrefsStore.batch2171.v2180quantified = !current
    AppToast.show(this, "quantified: ${if (!current) "ON" else "OFF"}")
}

// v2180: queried mode
internal fun PlayerActivity.showV2180QueriedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180queried
    FeaturePrefsStore.batch2171.v2180queried = !current
    AppToast.show(this, "queried: ${if (!current) "ON" else "OFF"}")
}

// v2180: questioned mode
internal fun PlayerActivity.showV2180QuestionedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180questioned
    FeaturePrefsStore.batch2171.v2180questioned = !current
    AppToast.show(this, "questioned: ${if (!current) "ON" else "OFF"}")
}

// v2180: queued mode
internal fun PlayerActivity.showV2180QueuedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180queued
    FeaturePrefsStore.batch2171.v2180queued = !current
    AppToast.show(this, "queued: ${if (!current) "ON" else "OFF"}")
}

// v2180: quoted level
internal fun PlayerActivity.showV2180QuotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180quoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "quoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180quoted = value
        AppToast.show(this, "quoted: $value")
    }
}

// v2180: raised level
internal fun PlayerActivity.showV2180RaisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180raised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180raised = value
        AppToast.show(this, "raised: $value")
    }
}

// v2180: randomized level
internal fun PlayerActivity.showV2180RandomizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180randomized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "randomized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180randomized = value
        AppToast.show(this, "randomized: $value")
    }
}

// v2180: ranked level
internal fun PlayerActivity.showV2180RankedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180ranked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ranked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180ranked = value
        AppToast.show(this, "ranked: $value")
    }
}

// v2180: rated level
internal fun PlayerActivity.showV2180RatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2171.v2180rated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2171.v2180rated = value
        AppToast.show(this, "rated: $value")
    }
}

// v2180: reached mode
internal fun PlayerActivity.showV2180ReachedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180reached
    FeaturePrefsStore.batch2171.v2180reached = !current
    AppToast.show(this, "reached: ${if (!current) "ON" else "OFF"}")
}

// v2180: reacted mode
internal fun PlayerActivity.showV2180ReactedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180reacted
    FeaturePrefsStore.batch2171.v2180reacted = !current
    AppToast.show(this, "reacted: ${if (!current) "ON" else "OFF"}")
}

// v2180: realized mode
internal fun PlayerActivity.showV2180RealizedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180realized
    FeaturePrefsStore.batch2171.v2180realized = !current
    AppToast.show(this, "realized: ${if (!current) "ON" else "OFF"}")
}

// v2180: rebalanced mode
internal fun PlayerActivity.showV2180RebalancedToggle() {
    val current = FeaturePrefsStore.batch2171.v2180rebalanced
    FeaturePrefsStore.batch2171.v2180rebalanced = !current
    AppToast.show(this, "rebalanced: ${if (!current) "ON" else "OFF"}")
}

// v2180: rebuilt mode
internal fun PlayerActivity.showV2180RebuiltToggle() {
    val current = FeaturePrefsStore.batch2171.v2180rebuilt
    FeaturePrefsStore.batch2171.v2180rebuilt = !current
    AppToast.show(this, "rebuilt: ${if (!current) "ON" else "OFF"}")
}

