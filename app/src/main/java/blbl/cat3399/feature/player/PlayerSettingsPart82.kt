package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

// v701: acknowledge mode
internal fun PlayerActivity.showV701AcknowledgeToggle() {
    val current = BiliClient.prefs.v701acknowledge
    BiliClient.prefs.v701acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v701: acquire mode
internal fun PlayerActivity.showV701AcquireToggle() {
    val current = BiliClient.prefs.v701acquire
    BiliClient.prefs.v701acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v701: activate mode
internal fun PlayerActivity.showV701ActivateToggle() {
    val current = BiliClient.prefs.v701activate
    BiliClient.prefs.v701activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adaptive mode
internal fun PlayerActivity.showV701AdaptiveToggle() {
    val current = BiliClient.prefs.v701adaptive
    BiliClient.prefs.v701adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v701: adjust mode
internal fun PlayerActivity.showV701AdjustToggle() {
    val current = BiliClient.prefs.v701adjust
    BiliClient.prefs.v701adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v701: aggregate level
internal fun PlayerActivity.showV701AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v701: alert level
internal fun PlayerActivity.showV701AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v701: align level
internal fun PlayerActivity.showV701AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701align = value
        AppToast.show(this, "align level: $value")
    }
}

// v701: allocate level
internal fun PlayerActivity.showV701AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v701: amplify level
internal fun PlayerActivity.showV701AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v701: analyze setting
internal fun PlayerActivity.showV701AnalyzeToggle() {
    val current = BiliClient.prefs.v701analyze
    BiliClient.prefs.v701analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v701: anchor setting
internal fun PlayerActivity.showV701AnchorToggle() {
    val current = BiliClient.prefs.v701anchor
    BiliClient.prefs.v701anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v701: animate setting
internal fun PlayerActivity.showV701AnimateToggle() {
    val current = BiliClient.prefs.v701animate
    BiliClient.prefs.v701animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v701: announce setting
internal fun PlayerActivity.showV701AnnounceToggle() {
    val current = BiliClient.prefs.v701announce
    BiliClient.prefs.v701announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v701: append setting
internal fun PlayerActivity.showV701AppendToggle() {
    val current = BiliClient.prefs.v701append
    BiliClient.prefs.v701append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v702: acknowledge mode
internal fun PlayerActivity.showV702AcknowledgeToggle() {
    val current = BiliClient.prefs.v702acknowledge
    BiliClient.prefs.v702acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v702: acquire mode
internal fun PlayerActivity.showV702AcquireToggle() {
    val current = BiliClient.prefs.v702acquire
    BiliClient.prefs.v702acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v702: activate mode
internal fun PlayerActivity.showV702ActivateToggle() {
    val current = BiliClient.prefs.v702activate
    BiliClient.prefs.v702activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adaptive mode
internal fun PlayerActivity.showV702AdaptiveToggle() {
    val current = BiliClient.prefs.v702adaptive
    BiliClient.prefs.v702adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v702: adjust mode
internal fun PlayerActivity.showV702AdjustToggle() {
    val current = BiliClient.prefs.v702adjust
    BiliClient.prefs.v702adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v702: aggregate level
internal fun PlayerActivity.showV702AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v702: alert level
internal fun PlayerActivity.showV702AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v702: align level
internal fun PlayerActivity.showV702AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702align = value
        AppToast.show(this, "align level: $value")
    }
}

// v702: allocate level
internal fun PlayerActivity.showV702AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v702: amplify level
internal fun PlayerActivity.showV702AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v702: analyze setting
internal fun PlayerActivity.showV702AnalyzeToggle() {
    val current = BiliClient.prefs.v702analyze
    BiliClient.prefs.v702analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v702: anchor setting
internal fun PlayerActivity.showV702AnchorToggle() {
    val current = BiliClient.prefs.v702anchor
    BiliClient.prefs.v702anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v702: animate setting
internal fun PlayerActivity.showV702AnimateToggle() {
    val current = BiliClient.prefs.v702animate
    BiliClient.prefs.v702animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v702: announce setting
internal fun PlayerActivity.showV702AnnounceToggle() {
    val current = BiliClient.prefs.v702announce
    BiliClient.prefs.v702announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v702: append setting
internal fun PlayerActivity.showV702AppendToggle() {
    val current = BiliClient.prefs.v702append
    BiliClient.prefs.v702append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v703: acknowledge mode
internal fun PlayerActivity.showV703AcknowledgeToggle() {
    val current = BiliClient.prefs.v703acknowledge
    BiliClient.prefs.v703acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v703: acquire mode
internal fun PlayerActivity.showV703AcquireToggle() {
    val current = BiliClient.prefs.v703acquire
    BiliClient.prefs.v703acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v703: activate mode
internal fun PlayerActivity.showV703ActivateToggle() {
    val current = BiliClient.prefs.v703activate
    BiliClient.prefs.v703activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adaptive mode
internal fun PlayerActivity.showV703AdaptiveToggle() {
    val current = BiliClient.prefs.v703adaptive
    BiliClient.prefs.v703adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v703: adjust mode
internal fun PlayerActivity.showV703AdjustToggle() {
    val current = BiliClient.prefs.v703adjust
    BiliClient.prefs.v703adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v703: aggregate level
internal fun PlayerActivity.showV703AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v703: alert level
internal fun PlayerActivity.showV703AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v703: align level
internal fun PlayerActivity.showV703AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703align = value
        AppToast.show(this, "align level: $value")
    }
}

// v703: allocate level
internal fun PlayerActivity.showV703AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v703: amplify level
internal fun PlayerActivity.showV703AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v703: analyze setting
internal fun PlayerActivity.showV703AnalyzeToggle() {
    val current = BiliClient.prefs.v703analyze
    BiliClient.prefs.v703analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v703: anchor setting
internal fun PlayerActivity.showV703AnchorToggle() {
    val current = BiliClient.prefs.v703anchor
    BiliClient.prefs.v703anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v703: animate setting
internal fun PlayerActivity.showV703AnimateToggle() {
    val current = BiliClient.prefs.v703animate
    BiliClient.prefs.v703animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v703: announce setting
internal fun PlayerActivity.showV703AnnounceToggle() {
    val current = BiliClient.prefs.v703announce
    BiliClient.prefs.v703announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v703: append setting
internal fun PlayerActivity.showV703AppendToggle() {
    val current = BiliClient.prefs.v703append
    BiliClient.prefs.v703append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v704: acknowledge mode
internal fun PlayerActivity.showV704AcknowledgeToggle() {
    val current = BiliClient.prefs.v704acknowledge
    BiliClient.prefs.v704acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v704: acquire mode
internal fun PlayerActivity.showV704AcquireToggle() {
    val current = BiliClient.prefs.v704acquire
    BiliClient.prefs.v704acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v704: activate mode
internal fun PlayerActivity.showV704ActivateToggle() {
    val current = BiliClient.prefs.v704activate
    BiliClient.prefs.v704activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adaptive mode
internal fun PlayerActivity.showV704AdaptiveToggle() {
    val current = BiliClient.prefs.v704adaptive
    BiliClient.prefs.v704adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v704: adjust mode
internal fun PlayerActivity.showV704AdjustToggle() {
    val current = BiliClient.prefs.v704adjust
    BiliClient.prefs.v704adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v704: aggregate level
internal fun PlayerActivity.showV704AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v704: alert level
internal fun PlayerActivity.showV704AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v704: align level
internal fun PlayerActivity.showV704AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704align = value
        AppToast.show(this, "align level: $value")
    }
}

// v704: allocate level
internal fun PlayerActivity.showV704AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v704: amplify level
internal fun PlayerActivity.showV704AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v704: analyze setting
internal fun PlayerActivity.showV704AnalyzeToggle() {
    val current = BiliClient.prefs.v704analyze
    BiliClient.prefs.v704analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v704: anchor setting
internal fun PlayerActivity.showV704AnchorToggle() {
    val current = BiliClient.prefs.v704anchor
    BiliClient.prefs.v704anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v704: animate setting
internal fun PlayerActivity.showV704AnimateToggle() {
    val current = BiliClient.prefs.v704animate
    BiliClient.prefs.v704animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v704: announce setting
internal fun PlayerActivity.showV704AnnounceToggle() {
    val current = BiliClient.prefs.v704announce
    BiliClient.prefs.v704announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v704: append setting
internal fun PlayerActivity.showV704AppendToggle() {
    val current = BiliClient.prefs.v704append
    BiliClient.prefs.v704append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v705: acknowledge mode
internal fun PlayerActivity.showV705AcknowledgeToggle() {
    val current = BiliClient.prefs.v705acknowledge
    BiliClient.prefs.v705acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v705: acquire mode
internal fun PlayerActivity.showV705AcquireToggle() {
    val current = BiliClient.prefs.v705acquire
    BiliClient.prefs.v705acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v705: activate mode
internal fun PlayerActivity.showV705ActivateToggle() {
    val current = BiliClient.prefs.v705activate
    BiliClient.prefs.v705activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adaptive mode
internal fun PlayerActivity.showV705AdaptiveToggle() {
    val current = BiliClient.prefs.v705adaptive
    BiliClient.prefs.v705adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v705: adjust mode
internal fun PlayerActivity.showV705AdjustToggle() {
    val current = BiliClient.prefs.v705adjust
    BiliClient.prefs.v705adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v705: aggregate level
internal fun PlayerActivity.showV705AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v705: alert level
internal fun PlayerActivity.showV705AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v705: align level
internal fun PlayerActivity.showV705AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705align = value
        AppToast.show(this, "align level: $value")
    }
}

// v705: allocate level
internal fun PlayerActivity.showV705AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v705: amplify level
internal fun PlayerActivity.showV705AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v705: analyze setting
internal fun PlayerActivity.showV705AnalyzeToggle() {
    val current = BiliClient.prefs.v705analyze
    BiliClient.prefs.v705analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v705: anchor setting
internal fun PlayerActivity.showV705AnchorToggle() {
    val current = BiliClient.prefs.v705anchor
    BiliClient.prefs.v705anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v705: animate setting
internal fun PlayerActivity.showV705AnimateToggle() {
    val current = BiliClient.prefs.v705animate
    BiliClient.prefs.v705animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v705: announce setting
internal fun PlayerActivity.showV705AnnounceToggle() {
    val current = BiliClient.prefs.v705announce
    BiliClient.prefs.v705announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v705: append setting
internal fun PlayerActivity.showV705AppendToggle() {
    val current = BiliClient.prefs.v705append
    BiliClient.prefs.v705append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v706: acknowledge mode
internal fun PlayerActivity.showV706AcknowledgeToggle() {
    val current = BiliClient.prefs.v706acknowledge
    BiliClient.prefs.v706acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v706: acquire mode
internal fun PlayerActivity.showV706AcquireToggle() {
    val current = BiliClient.prefs.v706acquire
    BiliClient.prefs.v706acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v706: activate mode
internal fun PlayerActivity.showV706ActivateToggle() {
    val current = BiliClient.prefs.v706activate
    BiliClient.prefs.v706activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adaptive mode
internal fun PlayerActivity.showV706AdaptiveToggle() {
    val current = BiliClient.prefs.v706adaptive
    BiliClient.prefs.v706adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v706: adjust mode
internal fun PlayerActivity.showV706AdjustToggle() {
    val current = BiliClient.prefs.v706adjust
    BiliClient.prefs.v706adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v706: aggregate level
internal fun PlayerActivity.showV706AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v706: alert level
internal fun PlayerActivity.showV706AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v706: align level
internal fun PlayerActivity.showV706AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706align = value
        AppToast.show(this, "align level: $value")
    }
}

// v706: allocate level
internal fun PlayerActivity.showV706AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v706: amplify level
internal fun PlayerActivity.showV706AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v706: analyze setting
internal fun PlayerActivity.showV706AnalyzeToggle() {
    val current = BiliClient.prefs.v706analyze
    BiliClient.prefs.v706analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v706: anchor setting
internal fun PlayerActivity.showV706AnchorToggle() {
    val current = BiliClient.prefs.v706anchor
    BiliClient.prefs.v706anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v706: animate setting
internal fun PlayerActivity.showV706AnimateToggle() {
    val current = BiliClient.prefs.v706animate
    BiliClient.prefs.v706animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v706: announce setting
internal fun PlayerActivity.showV706AnnounceToggle() {
    val current = BiliClient.prefs.v706announce
    BiliClient.prefs.v706announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v706: append setting
internal fun PlayerActivity.showV706AppendToggle() {
    val current = BiliClient.prefs.v706append
    BiliClient.prefs.v706append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v707: acknowledge mode
internal fun PlayerActivity.showV707AcknowledgeToggle() {
    val current = BiliClient.prefs.v707acknowledge
    BiliClient.prefs.v707acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v707: acquire mode
internal fun PlayerActivity.showV707AcquireToggle() {
    val current = BiliClient.prefs.v707acquire
    BiliClient.prefs.v707acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v707: activate mode
internal fun PlayerActivity.showV707ActivateToggle() {
    val current = BiliClient.prefs.v707activate
    BiliClient.prefs.v707activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adaptive mode
internal fun PlayerActivity.showV707AdaptiveToggle() {
    val current = BiliClient.prefs.v707adaptive
    BiliClient.prefs.v707adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v707: adjust mode
internal fun PlayerActivity.showV707AdjustToggle() {
    val current = BiliClient.prefs.v707adjust
    BiliClient.prefs.v707adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v707: aggregate level
internal fun PlayerActivity.showV707AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v707: alert level
internal fun PlayerActivity.showV707AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v707: align level
internal fun PlayerActivity.showV707AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707align = value
        AppToast.show(this, "align level: $value")
    }
}

// v707: allocate level
internal fun PlayerActivity.showV707AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v707: amplify level
internal fun PlayerActivity.showV707AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v707: analyze setting
internal fun PlayerActivity.showV707AnalyzeToggle() {
    val current = BiliClient.prefs.v707analyze
    BiliClient.prefs.v707analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v707: anchor setting
internal fun PlayerActivity.showV707AnchorToggle() {
    val current = BiliClient.prefs.v707anchor
    BiliClient.prefs.v707anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v707: animate setting
internal fun PlayerActivity.showV707AnimateToggle() {
    val current = BiliClient.prefs.v707animate
    BiliClient.prefs.v707animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v707: announce setting
internal fun PlayerActivity.showV707AnnounceToggle() {
    val current = BiliClient.prefs.v707announce
    BiliClient.prefs.v707announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v707: append setting
internal fun PlayerActivity.showV707AppendToggle() {
    val current = BiliClient.prefs.v707append
    BiliClient.prefs.v707append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v708: acknowledge mode
internal fun PlayerActivity.showV708AcknowledgeToggle() {
    val current = BiliClient.prefs.v708acknowledge
    BiliClient.prefs.v708acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v708: acquire mode
internal fun PlayerActivity.showV708AcquireToggle() {
    val current = BiliClient.prefs.v708acquire
    BiliClient.prefs.v708acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v708: activate mode
internal fun PlayerActivity.showV708ActivateToggle() {
    val current = BiliClient.prefs.v708activate
    BiliClient.prefs.v708activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adaptive mode
internal fun PlayerActivity.showV708AdaptiveToggle() {
    val current = BiliClient.prefs.v708adaptive
    BiliClient.prefs.v708adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v708: adjust mode
internal fun PlayerActivity.showV708AdjustToggle() {
    val current = BiliClient.prefs.v708adjust
    BiliClient.prefs.v708adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v708: aggregate level
internal fun PlayerActivity.showV708AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v708: alert level
internal fun PlayerActivity.showV708AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v708: align level
internal fun PlayerActivity.showV708AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708align = value
        AppToast.show(this, "align level: $value")
    }
}

// v708: allocate level
internal fun PlayerActivity.showV708AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v708: amplify level
internal fun PlayerActivity.showV708AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v708: analyze setting
internal fun PlayerActivity.showV708AnalyzeToggle() {
    val current = BiliClient.prefs.v708analyze
    BiliClient.prefs.v708analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v708: anchor setting
internal fun PlayerActivity.showV708AnchorToggle() {
    val current = BiliClient.prefs.v708anchor
    BiliClient.prefs.v708anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v708: animate setting
internal fun PlayerActivity.showV708AnimateToggle() {
    val current = BiliClient.prefs.v708animate
    BiliClient.prefs.v708animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v708: announce setting
internal fun PlayerActivity.showV708AnnounceToggle() {
    val current = BiliClient.prefs.v708announce
    BiliClient.prefs.v708announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v708: append setting
internal fun PlayerActivity.showV708AppendToggle() {
    val current = BiliClient.prefs.v708append
    BiliClient.prefs.v708append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v709: acknowledge mode
internal fun PlayerActivity.showV709AcknowledgeToggle() {
    val current = BiliClient.prefs.v709acknowledge
    BiliClient.prefs.v709acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v709: acquire mode
internal fun PlayerActivity.showV709AcquireToggle() {
    val current = BiliClient.prefs.v709acquire
    BiliClient.prefs.v709acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v709: activate mode
internal fun PlayerActivity.showV709ActivateToggle() {
    val current = BiliClient.prefs.v709activate
    BiliClient.prefs.v709activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adaptive mode
internal fun PlayerActivity.showV709AdaptiveToggle() {
    val current = BiliClient.prefs.v709adaptive
    BiliClient.prefs.v709adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v709: adjust mode
internal fun PlayerActivity.showV709AdjustToggle() {
    val current = BiliClient.prefs.v709adjust
    BiliClient.prefs.v709adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v709: aggregate level
internal fun PlayerActivity.showV709AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v709: alert level
internal fun PlayerActivity.showV709AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v709: align level
internal fun PlayerActivity.showV709AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709align = value
        AppToast.show(this, "align level: $value")
    }
}

// v709: allocate level
internal fun PlayerActivity.showV709AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v709: amplify level
internal fun PlayerActivity.showV709AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v709: analyze setting
internal fun PlayerActivity.showV709AnalyzeToggle() {
    val current = BiliClient.prefs.v709analyze
    BiliClient.prefs.v709analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v709: anchor setting
internal fun PlayerActivity.showV709AnchorToggle() {
    val current = BiliClient.prefs.v709anchor
    BiliClient.prefs.v709anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v709: animate setting
internal fun PlayerActivity.showV709AnimateToggle() {
    val current = BiliClient.prefs.v709animate
    BiliClient.prefs.v709animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v709: announce setting
internal fun PlayerActivity.showV709AnnounceToggle() {
    val current = BiliClient.prefs.v709announce
    BiliClient.prefs.v709announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v709: append setting
internal fun PlayerActivity.showV709AppendToggle() {
    val current = BiliClient.prefs.v709append
    BiliClient.prefs.v709append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

// v710: acknowledge mode
internal fun PlayerActivity.showV710AcknowledgeToggle() {
    val current = BiliClient.prefs.v710acknowledge
    BiliClient.prefs.v710acknowledge = !current
    AppToast.show(this, "acknowledge mode: ${if (!current) "ON" else "OFF"}")
}

// v710: acquire mode
internal fun PlayerActivity.showV710AcquireToggle() {
    val current = BiliClient.prefs.v710acquire
    BiliClient.prefs.v710acquire = !current
    AppToast.show(this, "acquire mode: ${if (!current) "ON" else "OFF"}")
}

// v710: activate mode
internal fun PlayerActivity.showV710ActivateToggle() {
    val current = BiliClient.prefs.v710activate
    BiliClient.prefs.v710activate = !current
    AppToast.show(this, "activate mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adaptive mode
internal fun PlayerActivity.showV710AdaptiveToggle() {
    val current = BiliClient.prefs.v710adaptive
    BiliClient.prefs.v710adaptive = !current
    AppToast.show(this, "adaptive mode: ${if (!current) "ON" else "OFF"}")
}

// v710: adjust mode
internal fun PlayerActivity.showV710AdjustToggle() {
    val current = BiliClient.prefs.v710adjust
    BiliClient.prefs.v710adjust = !current
    AppToast.show(this, "adjust mode: ${if (!current) "ON" else "OFF"}")
}

// v710: aggregate level
internal fun PlayerActivity.showV710AggregateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710aggregate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aggregate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710aggregate = value
        AppToast.show(this, "aggregate level: $value")
    }
}

// v710: alert level
internal fun PlayerActivity.showV710AlertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710alert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alert level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710alert = value
        AppToast.show(this, "alert level: $value")
    }
}

// v710: align level
internal fun PlayerActivity.showV710AlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710align).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "align level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710align = value
        AppToast.show(this, "align level: $value")
    }
}

// v710: allocate level
internal fun PlayerActivity.showV710AllocateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710allocate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "allocate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710allocate = value
        AppToast.show(this, "allocate level: $value")
    }
}

// v710: amplify level
internal fun PlayerActivity.showV710AmplifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710amplify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "amplify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710amplify = value
        AppToast.show(this, "amplify level: $value")
    }
}

// v710: analyze setting
internal fun PlayerActivity.showV710AnalyzeToggle() {
    val current = BiliClient.prefs.v710analyze
    BiliClient.prefs.v710analyze = !current
    AppToast.show(this, "analyze setting: ${if (!current) "ON" else "OFF"}")
}

// v710: anchor setting
internal fun PlayerActivity.showV710AnchorToggle() {
    val current = BiliClient.prefs.v710anchor
    BiliClient.prefs.v710anchor = !current
    AppToast.show(this, "anchor setting: ${if (!current) "ON" else "OFF"}")
}

// v710: animate setting
internal fun PlayerActivity.showV710AnimateToggle() {
    val current = BiliClient.prefs.v710animate
    BiliClient.prefs.v710animate = !current
    AppToast.show(this, "animate setting: ${if (!current) "ON" else "OFF"}")
}

// v710: announce setting
internal fun PlayerActivity.showV710AnnounceToggle() {
    val current = BiliClient.prefs.v710announce
    BiliClient.prefs.v710announce = !current
    AppToast.show(this, "announce setting: ${if (!current) "ON" else "OFF"}")
}

// v710: append setting
internal fun PlayerActivity.showV710AppendToggle() {
    val current = BiliClient.prefs.v710append
    BiliClient.prefs.v710append = !current
    AppToast.show(this, "append setting: ${if (!current) "ON" else "OFF"}")
}

