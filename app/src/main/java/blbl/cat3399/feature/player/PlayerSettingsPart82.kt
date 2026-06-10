package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v701: acknowledge mode
internal fun PlayerActivity.showV701AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v701acknowledge
    FeaturePrefsStore.batch701.v701acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v701: acquire mode
internal fun PlayerActivity.showV701AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v701acquire
    FeaturePrefsStore.batch701.v701acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v701: activate mode
internal fun PlayerActivity.showV701ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v701activate
    FeaturePrefsStore.batch701.v701activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adaptive mode
internal fun PlayerActivity.showV701AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v701adaptive
    FeaturePrefsStore.batch701.v701adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adjust mode
internal fun PlayerActivity.showV701AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v701adjust
    FeaturePrefsStore.batch701.v701adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v701: aggregate level
internal fun PlayerActivity.showV701AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v701: alert level
internal fun PlayerActivity.showV701AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v701: align level
internal fun PlayerActivity.showV701AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701align = value
        AppToast.show(this, "align level: $value")
    }
}

// v701: allocate level
internal fun PlayerActivity.showV701AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v701: amplify level
internal fun PlayerActivity.showV701AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v701amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v701amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v701: analyze setting
internal fun PlayerActivity.showV701AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v701analyze
    FeaturePrefsStore.batch701.v701analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v701: anchor setting
internal fun PlayerActivity.showV701AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v701anchor
    FeaturePrefsStore.batch701.v701anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v701: animate setting
internal fun PlayerActivity.showV701AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v701animate
    FeaturePrefsStore.batch701.v701animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v701: announce setting
internal fun PlayerActivity.showV701AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v701announce
    FeaturePrefsStore.batch701.v701announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v701: append setting
internal fun PlayerActivity.showV701AppendToggle() {
    val current = FeaturePrefsStore.batch701.v701append
    FeaturePrefsStore.batch701.v701append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v702: acknowledge mode
internal fun PlayerActivity.showV702AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v702acknowledge
    FeaturePrefsStore.batch701.v702acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v702: acquire mode
internal fun PlayerActivity.showV702AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v702acquire
    FeaturePrefsStore.batch701.v702acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v702: activate mode
internal fun PlayerActivity.showV702ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v702activate
    FeaturePrefsStore.batch701.v702activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adaptive mode
internal fun PlayerActivity.showV702AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v702adaptive
    FeaturePrefsStore.batch701.v702adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adjust mode
internal fun PlayerActivity.showV702AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v702adjust
    FeaturePrefsStore.batch701.v702adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v702: aggregate level
internal fun PlayerActivity.showV702AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v702: alert level
internal fun PlayerActivity.showV702AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v702: align level
internal fun PlayerActivity.showV702AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702align = value
        AppToast.show(this, "align level: $value")
    }
}

// v702: allocate level
internal fun PlayerActivity.showV702AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v702: amplify level
internal fun PlayerActivity.showV702AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v702amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v702amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v702: analyze setting
internal fun PlayerActivity.showV702AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v702analyze
    FeaturePrefsStore.batch701.v702analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v702: anchor setting
internal fun PlayerActivity.showV702AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v702anchor
    FeaturePrefsStore.batch701.v702anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v702: animate setting
internal fun PlayerActivity.showV702AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v702animate
    FeaturePrefsStore.batch701.v702animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v702: announce setting
internal fun PlayerActivity.showV702AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v702announce
    FeaturePrefsStore.batch701.v702announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v702: append setting
internal fun PlayerActivity.showV702AppendToggle() {
    val current = FeaturePrefsStore.batch701.v702append
    FeaturePrefsStore.batch701.v702append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v703: acknowledge mode
internal fun PlayerActivity.showV703AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v703acknowledge
    FeaturePrefsStore.batch701.v703acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v703: acquire mode
internal fun PlayerActivity.showV703AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v703acquire
    FeaturePrefsStore.batch701.v703acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v703: activate mode
internal fun PlayerActivity.showV703ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v703activate
    FeaturePrefsStore.batch701.v703activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adaptive mode
internal fun PlayerActivity.showV703AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v703adaptive
    FeaturePrefsStore.batch701.v703adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adjust mode
internal fun PlayerActivity.showV703AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v703adjust
    FeaturePrefsStore.batch701.v703adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v703: aggregate level
internal fun PlayerActivity.showV703AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v703: alert level
internal fun PlayerActivity.showV703AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v703: align level
internal fun PlayerActivity.showV703AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703align = value
        AppToast.show(this, "align level: $value")
    }
}

// v703: allocate level
internal fun PlayerActivity.showV703AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v703: amplify level
internal fun PlayerActivity.showV703AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v703amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v703amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v703: analyze setting
internal fun PlayerActivity.showV703AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v703analyze
    FeaturePrefsStore.batch701.v703analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v703: anchor setting
internal fun PlayerActivity.showV703AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v703anchor
    FeaturePrefsStore.batch701.v703anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v703: animate setting
internal fun PlayerActivity.showV703AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v703animate
    FeaturePrefsStore.batch701.v703animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v703: announce setting
internal fun PlayerActivity.showV703AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v703announce
    FeaturePrefsStore.batch701.v703announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v703: append setting
internal fun PlayerActivity.showV703AppendToggle() {
    val current = FeaturePrefsStore.batch701.v703append
    FeaturePrefsStore.batch701.v703append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v704: acknowledge mode
internal fun PlayerActivity.showV704AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v704acknowledge
    FeaturePrefsStore.batch701.v704acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v704: acquire mode
internal fun PlayerActivity.showV704AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v704acquire
    FeaturePrefsStore.batch701.v704acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v704: activate mode
internal fun PlayerActivity.showV704ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v704activate
    FeaturePrefsStore.batch701.v704activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adaptive mode
internal fun PlayerActivity.showV704AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v704adaptive
    FeaturePrefsStore.batch701.v704adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adjust mode
internal fun PlayerActivity.showV704AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v704adjust
    FeaturePrefsStore.batch701.v704adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v704: aggregate level
internal fun PlayerActivity.showV704AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v704: alert level
internal fun PlayerActivity.showV704AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v704: align level
internal fun PlayerActivity.showV704AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704align = value
        AppToast.show(this, "align level: $value")
    }
}

// v704: allocate level
internal fun PlayerActivity.showV704AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v704: amplify level
internal fun PlayerActivity.showV704AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v704amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v704amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v704: analyze setting
internal fun PlayerActivity.showV704AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v704analyze
    FeaturePrefsStore.batch701.v704analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v704: anchor setting
internal fun PlayerActivity.showV704AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v704anchor
    FeaturePrefsStore.batch701.v704anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v704: animate setting
internal fun PlayerActivity.showV704AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v704animate
    FeaturePrefsStore.batch701.v704animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v704: announce setting
internal fun PlayerActivity.showV704AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v704announce
    FeaturePrefsStore.batch701.v704announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v704: append setting
internal fun PlayerActivity.showV704AppendToggle() {
    val current = FeaturePrefsStore.batch701.v704append
    FeaturePrefsStore.batch701.v704append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v705: acknowledge mode
internal fun PlayerActivity.showV705AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v705acknowledge
    FeaturePrefsStore.batch701.v705acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v705: acquire mode
internal fun PlayerActivity.showV705AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v705acquire
    FeaturePrefsStore.batch701.v705acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v705: activate mode
internal fun PlayerActivity.showV705ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v705activate
    FeaturePrefsStore.batch701.v705activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adaptive mode
internal fun PlayerActivity.showV705AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v705adaptive
    FeaturePrefsStore.batch701.v705adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adjust mode
internal fun PlayerActivity.showV705AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v705adjust
    FeaturePrefsStore.batch701.v705adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v705: aggregate level
internal fun PlayerActivity.showV705AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v705: alert level
internal fun PlayerActivity.showV705AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v705: align level
internal fun PlayerActivity.showV705AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705align = value
        AppToast.show(this, "align level: $value")
    }
}

// v705: allocate level
internal fun PlayerActivity.showV705AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v705: amplify level
internal fun PlayerActivity.showV705AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v705amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v705amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v705: analyze setting
internal fun PlayerActivity.showV705AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v705analyze
    FeaturePrefsStore.batch701.v705analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v705: anchor setting
internal fun PlayerActivity.showV705AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v705anchor
    FeaturePrefsStore.batch701.v705anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v705: animate setting
internal fun PlayerActivity.showV705AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v705animate
    FeaturePrefsStore.batch701.v705animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v705: announce setting
internal fun PlayerActivity.showV705AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v705announce
    FeaturePrefsStore.batch701.v705announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v705: append setting
internal fun PlayerActivity.showV705AppendToggle() {
    val current = FeaturePrefsStore.batch701.v705append
    FeaturePrefsStore.batch701.v705append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v706: acknowledge mode
internal fun PlayerActivity.showV706AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v706acknowledge
    FeaturePrefsStore.batch701.v706acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v706: acquire mode
internal fun PlayerActivity.showV706AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v706acquire
    FeaturePrefsStore.batch701.v706acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v706: activate mode
internal fun PlayerActivity.showV706ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v706activate
    FeaturePrefsStore.batch701.v706activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adaptive mode
internal fun PlayerActivity.showV706AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v706adaptive
    FeaturePrefsStore.batch701.v706adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adjust mode
internal fun PlayerActivity.showV706AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v706adjust
    FeaturePrefsStore.batch701.v706adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v706: aggregate level
internal fun PlayerActivity.showV706AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v706: alert level
internal fun PlayerActivity.showV706AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v706: align level
internal fun PlayerActivity.showV706AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706align = value
        AppToast.show(this, "align level: $value")
    }
}

// v706: allocate level
internal fun PlayerActivity.showV706AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v706: amplify level
internal fun PlayerActivity.showV706AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v706amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v706amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v706: analyze setting
internal fun PlayerActivity.showV706AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v706analyze
    FeaturePrefsStore.batch701.v706analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v706: anchor setting
internal fun PlayerActivity.showV706AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v706anchor
    FeaturePrefsStore.batch701.v706anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v706: animate setting
internal fun PlayerActivity.showV706AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v706animate
    FeaturePrefsStore.batch701.v706animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v706: announce setting
internal fun PlayerActivity.showV706AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v706announce
    FeaturePrefsStore.batch701.v706announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v706: append setting
internal fun PlayerActivity.showV706AppendToggle() {
    val current = FeaturePrefsStore.batch701.v706append
    FeaturePrefsStore.batch701.v706append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v707: acknowledge mode
internal fun PlayerActivity.showV707AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v707acknowledge
    FeaturePrefsStore.batch701.v707acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v707: acquire mode
internal fun PlayerActivity.showV707AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v707acquire
    FeaturePrefsStore.batch701.v707acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v707: activate mode
internal fun PlayerActivity.showV707ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v707activate
    FeaturePrefsStore.batch701.v707activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adaptive mode
internal fun PlayerActivity.showV707AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v707adaptive
    FeaturePrefsStore.batch701.v707adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adjust mode
internal fun PlayerActivity.showV707AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v707adjust
    FeaturePrefsStore.batch701.v707adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v707: aggregate level
internal fun PlayerActivity.showV707AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v707: alert level
internal fun PlayerActivity.showV707AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v707: align level
internal fun PlayerActivity.showV707AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707align = value
        AppToast.show(this, "align level: $value")
    }
}

// v707: allocate level
internal fun PlayerActivity.showV707AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v707: amplify level
internal fun PlayerActivity.showV707AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v707amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v707amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v707: analyze setting
internal fun PlayerActivity.showV707AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v707analyze
    FeaturePrefsStore.batch701.v707analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v707: anchor setting
internal fun PlayerActivity.showV707AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v707anchor
    FeaturePrefsStore.batch701.v707anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v707: animate setting
internal fun PlayerActivity.showV707AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v707animate
    FeaturePrefsStore.batch701.v707animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v707: announce setting
internal fun PlayerActivity.showV707AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v707announce
    FeaturePrefsStore.batch701.v707announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v707: append setting
internal fun PlayerActivity.showV707AppendToggle() {
    val current = FeaturePrefsStore.batch701.v707append
    FeaturePrefsStore.batch701.v707append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v708: acknowledge mode
internal fun PlayerActivity.showV708AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v708acknowledge
    FeaturePrefsStore.batch701.v708acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v708: acquire mode
internal fun PlayerActivity.showV708AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v708acquire
    FeaturePrefsStore.batch701.v708acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v708: activate mode
internal fun PlayerActivity.showV708ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v708activate
    FeaturePrefsStore.batch701.v708activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adaptive mode
internal fun PlayerActivity.showV708AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v708adaptive
    FeaturePrefsStore.batch701.v708adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adjust mode
internal fun PlayerActivity.showV708AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v708adjust
    FeaturePrefsStore.batch701.v708adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v708: aggregate level
internal fun PlayerActivity.showV708AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v708: alert level
internal fun PlayerActivity.showV708AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v708: align level
internal fun PlayerActivity.showV708AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708align = value
        AppToast.show(this, "align level: $value")
    }
}

// v708: allocate level
internal fun PlayerActivity.showV708AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v708: amplify level
internal fun PlayerActivity.showV708AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v708amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v708amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v708: analyze setting
internal fun PlayerActivity.showV708AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v708analyze
    FeaturePrefsStore.batch701.v708analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v708: anchor setting
internal fun PlayerActivity.showV708AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v708anchor
    FeaturePrefsStore.batch701.v708anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v708: animate setting
internal fun PlayerActivity.showV708AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v708animate
    FeaturePrefsStore.batch701.v708animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v708: announce setting
internal fun PlayerActivity.showV708AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v708announce
    FeaturePrefsStore.batch701.v708announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v708: append setting
internal fun PlayerActivity.showV708AppendToggle() {
    val current = FeaturePrefsStore.batch701.v708append
    FeaturePrefsStore.batch701.v708append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v709: acknowledge mode
internal fun PlayerActivity.showV709AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v709acknowledge
    FeaturePrefsStore.batch701.v709acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v709: acquire mode
internal fun PlayerActivity.showV709AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v709acquire
    FeaturePrefsStore.batch701.v709acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v709: activate mode
internal fun PlayerActivity.showV709ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v709activate
    FeaturePrefsStore.batch701.v709activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adaptive mode
internal fun PlayerActivity.showV709AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v709adaptive
    FeaturePrefsStore.batch701.v709adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adjust mode
internal fun PlayerActivity.showV709AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v709adjust
    FeaturePrefsStore.batch701.v709adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v709: aggregate level
internal fun PlayerActivity.showV709AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v709: alert level
internal fun PlayerActivity.showV709AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v709: align level
internal fun PlayerActivity.showV709AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709align = value
        AppToast.show(this, "align level: $value")
    }
}

// v709: allocate level
internal fun PlayerActivity.showV709AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v709: amplify level
internal fun PlayerActivity.showV709AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v709amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v709amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v709: analyze setting
internal fun PlayerActivity.showV709AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v709analyze
    FeaturePrefsStore.batch701.v709analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v709: anchor setting
internal fun PlayerActivity.showV709AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v709anchor
    FeaturePrefsStore.batch701.v709anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v709: animate setting
internal fun PlayerActivity.showV709AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v709animate
    FeaturePrefsStore.batch701.v709animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v709: announce setting
internal fun PlayerActivity.showV709AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v709announce
    FeaturePrefsStore.batch701.v709announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v709: append setting
internal fun PlayerActivity.showV709AppendToggle() {
    val current = FeaturePrefsStore.batch701.v709append
    FeaturePrefsStore.batch701.v709append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v710: acknowledge mode
internal fun PlayerActivity.showV710AcknowledgeToggle() {
    val current = FeaturePrefsStore.batch701.v710acknowledge
    FeaturePrefsStore.batch701.v710acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v710: acquire mode
internal fun PlayerActivity.showV710AcquireToggle() {
    val current = FeaturePrefsStore.batch701.v710acquire
    FeaturePrefsStore.batch701.v710acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v710: activate mode
internal fun PlayerActivity.showV710ActivateToggle() {
    val current = FeaturePrefsStore.batch701.v710activate
    FeaturePrefsStore.batch701.v710activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adaptive mode
internal fun PlayerActivity.showV710AdaptiveToggle() {
    val current = FeaturePrefsStore.batch701.v710adaptive
    FeaturePrefsStore.batch701.v710adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adjust mode
internal fun PlayerActivity.showV710AdjustToggle() {
    val current = FeaturePrefsStore.batch701.v710adjust
    FeaturePrefsStore.batch701.v710adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v710: aggregate level
internal fun PlayerActivity.showV710AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v710: alert level
internal fun PlayerActivity.showV710AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v710: align level
internal fun PlayerActivity.showV710AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710align = value
        AppToast.show(this, "align level: $value")
    }
}

// v710: allocate level
internal fun PlayerActivity.showV710AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v710: amplify level
internal fun PlayerActivity.showV710AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch701.v710amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch701.v710amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v710: analyze setting
internal fun PlayerActivity.showV710AnalyzeToggle() {
    val current = FeaturePrefsStore.batch701.v710analyze
    FeaturePrefsStore.batch701.v710analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v710: anchor setting
internal fun PlayerActivity.showV710AnchorToggle() {
    val current = FeaturePrefsStore.batch701.v710anchor
    FeaturePrefsStore.batch701.v710anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v710: animate setting
internal fun PlayerActivity.showV710AnimateToggle() {
    val current = FeaturePrefsStore.batch701.v710animate
    FeaturePrefsStore.batch701.v710animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v710: announce setting
internal fun PlayerActivity.showV710AnnounceToggle() {
    val current = FeaturePrefsStore.batch701.v710announce
    FeaturePrefsStore.batch701.v710announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v710: append setting
internal fun PlayerActivity.showV710AppendToggle() {
    val current = FeaturePrefsStore.batch701.v710append
    FeaturePrefsStore.batch701.v710append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

